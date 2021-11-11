CREATE OR REPLACE PROCEDURE SqlOdRelease(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
' $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlOdRelease.sql,v $
' $Author: shan-xiuqin $
' $Revision: 1.23 $　$Date: 2017/01/09 08:30:12 $
'
' 修正履歴
' 2005.01.20 ・[発注残]."受入場所"に登録する内容を変更。
'              ｢デフォルト受け入れ保管区取得処理｣で取得した保管区コード
' 2005.02.18 ・[所要量]読込SQLに[外部計画]と結合し、｢外部計画処理区分｣=9
'              のデータを読込むように修正。
' 2005.10.24 unicode対応（varchar2を4倍）
' 2007.02.23 障結テ-0160対応 代表作業区の取得方法を変更（[所要量]．パターンコードがNULLのときは[作業系列]."作業区コード"、
'            [所要量]．パターンコードがNULL以外の時は[パターン別作業系列]."作業区コード"を取得）
' 2007.03.08 [パターン別作業系列]の検索キーに[所要量]."パターンコード"を追加
' 2008.07.22 所要量計算制御（製番）のチェックを追加
' 2009.04.17 内税でも税率を0固定とはせず、[消費税区分マスタ]から取得する
' 2010.10.21 外部オーダデマンドメンテナンスで「下位部品展開の対象とする」をチェックしなかった外部オーダも発効対象とする
' 2012.07.02 製番指定の場合は、所要量計算制御の所要量メンテナンス中フラグチェック削除
'
'
' 機能      : オーダ発効
'
' 引き数    ■MetamorBase共通
'           : pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'           ■オーダ発効固有
'           　pvc2ManagementTyp    - (i)管理区分（1：ＭＲＰ、2：製番）
'           　pvc2OutsideTyp       - (i)内外作区分（1：内作、2：外作、9：内外作両方）
'             pvc2JobOdrCd         - (i)製番
'             pvc2JobOdrDetailNo   - (i)制番枝番
'             pvc2Entry1Typ        - (i)エントリ区分１（1：手配着手日、2：製造着手日、3：製造納期）
'             pvc2Entry2Typ        - (i)エントリ区分２（1：手入力、2：今週、3：今旬、4：今月）
'             pvc2EntryDate        - (i)エントリ日付
'
' 機能説明  : オーダ発効（ＭＲＰ、製番　共通機能）
'
' 備考      :MetamorBaseでは製番枝番はDB項目のみ用意されているが当PL/SQLでは引き数にNull以外を設定すれば動作する。
'            (#518)小数桁対応
------------------------------------------------------------------------------*/
    pvc2LogMode             VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode          VARCHAR2    --出力モード
   ,pvc2OutputPath          VARCHAR2    --出力パス
   ,pvc2OutputName          VARCHAR2    --出力ファイル名
   ,pvc2UserId              VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName        VARCHAR2    --業務名
   ,pvc2PlantCd             VARCHAR2    --工場コード
   ,pvc2ManagementTyp       VARCHAR2    --管理区分
   ,pvc2OutsideTyp          VARCHAR2    --内外作区分
   ,pvc2JobOdrCd            VARCHAR2    --製番
   ,pvc2JobOdrDetailNo      VARCHAR2    --枝番
   ,pvc2Entry1Typ           VARCHAR2    --エントリ区分１
   ,pvc2Entry2Typ           VARCHAR2    --エントリ区分２
   ,pvc2EntryDate           VARCHAR2    --エントリ日付
)
IS
    -- 例外の宣言
    excGetNewOdrCd          EXCEPTION;          --作業計画番号取得エラー
    excGetNewInstCd         EXCEPTION;          --作業指示番号取得エラー
    excGetNewPuchCd         EXCEPTION;          --発注番号取得エラー
    excGetRound             EXCEPTION;          --端数処理エラー
    excGetVend              EXCEPTION;          --取引先取得エラー
    excGetTax               EXCEPTION;          --消費税取得エラー
    excGetOdCtrl            EXCEPTION;          --所要量計算制御取得エラー
    excGetJobOdCtrl            EXCEPTION;          --所要量計算制御取得エラー
    excGetPlant             EXCEPTION;          --工場取得エラー
    excGetMyCompany         EXCEPTION;          --自社取得エラー
    excGetCur               EXCEPTION;          --通貨取得エラー(#518)
    excMistakeCommonParam   EXCEPTION;          --共通の入力パラメータ異常
    excMistakeNativeParam   EXCEPTION;          --固有の入力パラメータ異常
    excOdCalc_Ing           EXCEPTION;          --所要量計算実行中エラー（排他）
    excOdMnt_Ing            EXCEPTION;          --所要量メンテナンス中エラー（排他）
    excJobOdCalc_Ing           EXCEPTION;          --所要量計算(製番)実行中エラー（排他）
    excJobOdMnt_Ing            EXCEPTION;          --所要量メンテナンス中エラー（排他）
    excPlantWhCd_Null       EXCEPTION;          --工場の代表納入場所コードは省略できません
    excJobOdrDel            EXCEPTION;          --引当元製番が削除対象エラー
    excJobOdrExp            EXCEPTION;          --引当元製番計画が変更エラー
    excJobOdrExp1           EXCEPTION;          --引当元製番基本情報が変更エラー

    -- 定数の宣言
    MY_SQL_NAME             VARCHAR2(48) := 'SqlOdRelease';
    OUTSIDE_TYP_INNER_MAKE  NUMBER      := 1;   --内外作区分　内作
    OUTSIDE_TYP_BUY         NUMBER      := 2;   --内外作区分　外作
    WORK_STS_TYP_NOINSTRACT NUMBER      := 1;   --品目別作業状態区分　未展開
    PROCESS_NOEXPAND        NUMBER      := 0;   --作業系列展開済フラグ　Ｏｆｆ
    OPR_RSLT_ACCUMULATION   NUMBER      := 1;   --作業実績区分　出来高実績
    INST_CD_RISE_ITEM       NUMBER      := 1;   --作業指示番号発生区分　品目別
    INST_NOISSUE            NUMBER      := 0;   --作業指示伝票発行済フラグ　Ｏｆｆ
    UNIT_COST_TEMP          NUMBER      := 1;   --購入単価区分　仮単価
    ROUND_TYP_NORMAL        NUMBER      := 1;   --発注金額まるめ区分　四捨五入
    ROUND_TYP_CUTUP         NUMBER      := 2;   --発注金額まるめ区分　切り上げ
    ROUND_TYP_CUTDOWN       NUMBER      := 3;   --発注金額まるめ区分　切り捨て
    TAX_APPLY_TYP_M_ITEM    NUMBER      := 1;   --取引先の消費税適用区分(1:品目マスタの消費税コード)
    TAX_APPLY_TYP_M_VEND    NUMBER      := 2;   --取引先の消費税適用区分(2:取引先マスタの消費税コード)
    CTRL_CD_DEFAULT         VARCHAR2(24) := 'SYSTEM'; --コントロール系テーブルのPrimaryKeyの値
    PUCH_ODR_GNR_TYP_MRP    NUMBER      := 9;   --発注発生処理区分(9:所要量計算にて登録)
    PUCH_ODR_LST_NOISSUE    NUMBER      := 0;   --発注伝票発行済みフラグ(0:未)
    PUCH_ODR_STS_NOINSTRUCT NUMBER      := 1;   --発注状態区分(1:未指示)
    INSPEC_FLG_NOTEND       NUMBER      := 0;   --検査完了フラグ(0:未)
    INV_CTL_FLG_ON          NUMBER      := 1;   --在庫管理フラグ(1:在庫管理する)
    TAXABLE_TYP_OUT         NUMBER      := 1;   --消費税コード下１桁 税込税抜き区分(1:税抜き)
    ODR_STS_PLAN            NUMBER      := 1;   --オーダ処理区分(1:計画（未発効）)
    ODR_STS_RELEASE         NUMBER      := 2;   --オーダ処理区分(2:確定（発効）)
    ODR_STS_COMPLETE        NUMBER      := 9;   --オーダ処理区分(9:完了)
    OD_TYP_ORDER_DEMAND     NUMBER      := 1;   --オーダデマンド区分(1:オーダデマンド)
    OD_TYP_ORDER            NUMBER      := 2;   --オーダデマンド区分(2:オーダ)
    OD_TYP_ASSIMILATE       NUMBER      := 4;   --オーダデマンド区分(4:擬似)
    DM_STS_COMPLETE         NUMBER      := 9;   --デマンド状態区分(9:完了)
    DM_STS_RELEASE          NUMBER      := 2;   --デマンド状態区分(2:確定（未発効）)
    MRP_TYP_COMPLETE        NUMBER      := 9;   --所要量処理区分(9:済み)
    JOB_ODR_STS_SUBDETERM   NUMBER      := 4;   --製番状態区分(4:下位品目確定済み)
    JOB_ODR_STS_SELFDETERM  NUMBER      := 5;   --製番状態区分(5:自品目確定済み)
    JOB_ODR_STS_DETERM      NUMBER      := 9;   --製番状態区分(9:完了)
    ODR_RELEASE_NOEFFRCT    NUMBER      := 0;   --オーダ発効済フラグ(0:オーダ未発行)
    ODR_RELEASE_EFFRCT      NUMBER      := 1;   --オーダ発効済フラグ(1:オーダ発行済)
    NON_NO_ITEM_TYP_OFF     NUMBER      := 0;   --備品発注製品区分(0:在庫管理をする)
    NON_NO_ITEM_FLG_OFF     NUMBER      := 0;   --備品発注フラグ(0:備品以外（通常仕入品）)
    PUCH_ODR_EDI_NOISSUE    NUMBER      := 0;   --ＥＤＩデータ出力済フラグ(0:未出力)
    PUCH_ODR_FAX_NOISSUE    NUMBER      := 0;   --ＦＡＸデータ出力済フラグ(0:未出力)
    PUCH_ODR_MAIL_NOISSUE   NUMBER      := 0;   --ＭＡＩＬデータ出力済フラグ(0:未出力)
    FIRST_MODIFY_COUNT      NUMBER      := 0;   --新規作成テーブルの初回の更新数
    IN_PROGRESS             NUMBER      := 1;   --処理進行中（所要量計算／所要量メンテナンス）
    HOME_CUR_OFF            NUMBER      := 0;   --強制邦貨フラグ（0:ＯＦＦ）
    HOME_CUR_ON             NUMBER      := 1;   --強制邦貨フラグ（1:ＯＮ）
    MRP_TARGET              NUMBER      := 1;   --所要量計算対象フラグ（1:所要量計算対象）
    MANAGEMENT_TYP_1        VARCHAR2(4) := '1'; --ＭＲＰタイプを選択
    MANAGEMENT_TYP_2        VARCHAR2(4) := '2'; --製番タイプを選択
    OUTSIDE_TYP_1           VARCHAR2(4) := '1'; --内作を選択
    OUTSIDE_TYP_2           VARCHAR2(4) := '2'; --外作を選択
    OUTSIDE_TYP_9           VARCHAR2(4) := '9'; --内外作両方を選択
    ENTRY1_TYP_1            VARCHAR2(4) := '1'; --手配着手日を選択
    ENTRY1_TYP_2            VARCHAR2(4) := '2'; --製造着手日を選択
    ENTRY1_TYP_3            VARCHAR2(4) := '3'; --製造納期を選択
    ENTRY2_TYP_1            VARCHAR2(4) := '1'; --手入力を選択
    ENTRY2_TYP_2            VARCHAR2(4) := '2'; --今週を選択
    ENTRY2_TYP_3            VARCHAR2(4) := '3'; --今旬を選択
    ENTRY2_TYP_4            VARCHAR2(4) := '4'; --今月を選択
    EXTERNAL_PLAN_EXP_COMP  NUMBER      := 9;   --外部計画処理区分（9:完了）
    EXTERNAL_PLAN_REG_TYP_MNT   NUMBER  := 1;   --外部計画登録区分（1:外部オーダデマンドメンテナンス）
    EXTERNAL_DM_FLG_IN      NUMBER      := 0;   --外部デマンドフラグ(0:内部デマンド)
    TAX_ID_TAXINTERNAL      VARCHAR2(1) := '5'; --課税方式(5:内税)
    CHK_JOB_ODR_STS_TYP     NUMBER      := 3;   --製番状態区分=3:展開済み
    CHK_JOB_ODR_EXP_TYP1    NUMBER      := 1;   --製番処理区分=1:追加
    CHK_JOB_ODR_EXP_TYP2    NUMBER      := 2;   --製番処理区分=2:変更
    CHK_JOB_ODR_DEL_FLG     NUMBER      := 1;   --製番削除フラグ=1:削除対象
    -- 変数の宣言
    UTL_FileHandle          UTL_FILE.FILE_TYPE; --ファイルハンドル
    blnRet                  BOOLEAN;        --関数戻り値
    intRet                  INTEGER;        --関数戻り値
    vc2OutputName           VARCHAR2(200);   --ログ出力ファイル名（加工：pvc2ManagementTyp　||　pvc2OutputName）
    vc2Comment              VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    vc2TraceComment         VARCHAR2(1024);  --トレーース出力用コメント作成作業領域（入力パラメータ記録用）
    intOdrCursorName        INTEGER;        --所要量用カーソルＩＤ
    vc2Sql                  VARCHAR2(4096); --動的ＳＱＬ用
    vc2CompanyCd            VARCHAR2(100);   --会社コード
    vc2HomeCurCd            VARCHAR2(100);   --邦貨コード
    numHomeDecimalFig       NUMBER(2);      --邦貨小数桁数
    numHomeCurFlg           NUMBER(1);      --強制邦貨フラグ
    numDataCount            NUMBER(10);     --データ検索カウント
    numOdCalcFlg            NUMBER(1);      --所要量計算中フラグ
    numOdMntFlg             NUMBER(1);      --所要量メンテナンス中フラグ
    numJobOdCalcFlg            NUMBER(1);      --所要量計算(製番)中フラグ
    numJobOdMntFlg             NUMBER(1);      --所要量メンテナンス(製番)中フラグ
    vc2OdNo                 VARCHAR2(100);   --オーダデマンド番号
    vc2ItemCd               VARCHAR2(100);   --品目番号
    dtmPrdDueDate           DATE;           --製造納期
    dtmPrdStartDate         DATE;           --製造着手日
    numOdrQty               NUMBER(18,4);   --オーダ数
    numOutsideTyp           NUMBER(2);      --所要量内外作区分
    numAcptInspcTyp         NUMBER(2);      --受入検査区分
    numOprRsltTyp           NUMBER(2);      --作業実績区分
    numSplItemTyp           NUMBER(2);      --受給品区分
    vc2VendCd               VARCHAR2(100);   --代表取引先コード
    vc2WsCd                 VARCHAR2(100);   --代表作業区コード
    vc2TaxCd                VARCHAR2(100);   --消費税コード（品目）
    vc2JobOdrCd             VARCHAR2(100);   --製番
    numJobOdrDetailNo       NUMBER(6);      --製番枝番
    numJobOdrCancelNo       NUMBER(6);      --製番取消発生番号
    vc2ParentOdNo           VARCHAR2(100);   --親オーダデマンド番号
    vc2PatternCd            VARCHAR2(100);   --パターンコード
    vc2WhCd                 VARCHAR2(100);   --受渡場所（代表納入場所コード）
    numUnitCost             NUMBER(18,4);   --購入単価
    numPuchUnitCostTyp      NUMBER(2);      --購入単価区分
    numProcessingCost       NUMBER(18,4);   --購入加工費
    numMaterialCost         NUMBER(18,4);   --購入材料費
    numOtherOverheads       NUMBER(18,4);   --購入その他経費
    numRoundTyp             NUMBER(2);      --発注金額まるめ区分
    numTaxApplyTyp          NUMBER(2);      --消費税適用区分
    vc2TaxCdVend            VARCHAR2(100);   --消費税コード（取引先）
    vc2CurCd                VARCHAR2(100);   --通貨コード
    vc2OwnPersonCd          VARCHAR2(100);   --自社担当者コード
    numOldTaxRate1          NUMBER(18,4);   --旧税率１
    numOldTaxRate2          NUMBER(18,4);   --旧税率２
    numOldTaxRate3          NUMBER(18,4);   --旧税率３
    numNewTaxRate1          NUMBER(18,4);   --新税率１
    numNewTaxRate2          NUMBER(18,4);   --新税率２
    numNewTaxRate3          NUMBER(18,4);   --新税率３
    dtmNewTaxRateStartDate  Date        ;   --新消費税開始日
    numTaxRate1             NUMBER(18,4);   --税率１
    numTaxRate2             NUMBER(18,4);   --税率２
    numTaxRate3             NUMBER(18,4);   --税率３
    numTaxRoundTyp          NUMBER(2);      --端数区分（消費税）
    numExchTyp              NUMBER(2);      --為替種別
    numRateJudgeDate        Date        ;   --レート判定日
    numExchRate             NUMBER(20,6);   --為替レート
    numDecimalFig           NUMBER(2);      --外貨小数桁数
    numPuchOdrAmount        NUMBER(18,4);   --発注金額
    numNetAmount            NUMBER(18,4);   --本体金額
    numTaxAmount1           NUMBER(18,4);   --税額１
    numTaxAmount2           NUMBER(18,4);   --税額２
    numTaxAmount3           NUMBER(18,4);   --税額３
    numAmountIncludeTax     NUMBER(18,4);   --税込金額
    numHomeCurAmount        NUMBER(18,4);   --邦貨金額
    numWkTaxOutAmount               NUMBER(18,4)     := 0;               --税抜金額
    numWkTaxAmount                  NUMBER(18,4)     := 0;               --消費税金額
    numWkExternalTaxSalesAmount     NUMBER(18,4)     := 0;               --外税対象金額
    numWkInternalTaxSalesAmount     NUMBER(18,4)     := 0;               --内税対象金額
    numWkTaxFreeSalesAmount         NUMBER(18,4)     := 0;               --非課税対象金額
    numWkExternalTaxAmount          NUMBER(18,4)     := 0;               --消費税額（外税）
    numWkInternalTaxAmount          NUMBER(18,4)     := 0;               --消費税額（内税）
    numDmStsTyp             NUMBER(2);      --デマンド状態区分
    numOdrStsTyp            NUMBER(2);      --オーダ状態区分
    numJobOdrStsTyp         NUMBER(2);      --製番状態区分
    vc2WorkOdrCd            VARCHAR2(100);   --作業計画番号取得値
    vc2OprInstCd            VARCHAR2(100);   --作業指示番号取得値
    vc2PuchOdrCd            VARCHAR2(100);   --発注番号取得値
    numRoundTypCur          NUMBER(2);          --端数処理区分
    numExchTypCur           NUMBER(2);          --為替種別
    vc2VendCurCd            VARCHAR2(100);       --取引先通貨コード
    vc2VendCurName          VARCHAR2(160);       --取引先通貨名
    vc2VendCurSymbol        VARCHAR2(100);       --取引先通貨記号
    vc2VendCurUnit          VARCHAR2(160);       --取引先通貨単位
    numVendDecimalFig       NUMBER(2);          --取引先小数桁数
    vc2HomeCurName          VARCHAR2(160);       --自社（邦貨）通貨名
    vc2HomeCurSymbol        VARCHAR2(100);       --自社（邦貨）通貨記号
    vc2HomeCurUnit          VARCHAR2(160);       --自社（邦貨）通貨単位
    vc2ErrorCd              VARCHAR2(1024);      --エラーコード
    numStatus        NUMBER;         --結果ステータス
    numTgtCnt               NUMBER := 0;    --対象件数
    numDoneCnt              NUMBER := 0;    --正常件数
    numWarCnt               NUMBER := 0;    --ワーニング件数
    numfatalCnt             NUMBER := 0;    --異常件数
    blnWarning              BOOLEAN;        --ワーニング判断
    vc2FormatEntryDate      VARCHAR2(100);  --FORMAT後エントリ日付
    numJobOdrStsTypChk      NUMBER(2);    --製番状態区分
    numJobOdrExpTyp         NUMBER(2);    --製番処理区分
    numJobOdrDelFlg         NUMBER(2);    --製番削除フラグ
    vc2JobOdrCdChk          VARCHAR2(100);--製番(チェック用)
    vc2OdNoChk              VARCHAR2(100);--オーダデマンド番号(チェック用)
    numJobOdrCHK            NUMBER := 0;    --製番オーダデマンドチェックフラグ
    
    -- MESSAGE の宣言
    APS_MINERRNO                        VARCHAR2(28)   := 'AC00000';    --APLayerServerMinimumErrorNumber（資材所要計画）
    APS_COM_BATCH_START                 VARCHAR2(28)   := 'ZZ09001';    --バッチ処理を開始しました
    APS_COM_BATCH_END                   VARCHAR2(28)   := 'ZZ09002';    --バッチ処理を終了しました
    APS_COM_NOTEXIST_MY_COMPANY         VARCHAR2(28)   := 'AC00101';    --自社データが存在しません
    APS_COM_NOTEXIST_PLANT              VARCHAR2(28)   := 'AC00102';    --工場データが存在しません
    APS_COM_NOTEXIST_PROC_GRP           VARCHAR2(28)   := 'AC00103';    --作業系列情報が存在しません（代表作業区が未取得）
    APS_COM_NOTEXIST_PUCH_COST          VARCHAR2(28)   := 'AC00104';    --購入単価データが存在しません（代表取引先が未取得）
    APS_COM_MISTAKE_COMMON_PARAM        VARCHAR2(28)   := 'AC00105';    --共通の入力パラメータが誤っています
    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'AC00106';    --固有の入力パラメータが誤っています
    APS_COM_OD_CALC_ING                 VARCHAR2(28)   := 'AC00107';    --所要量計算実行中です
    APS_COM_JOB_OD_CALC_ING                 VARCHAR2(28)   := 'AC00235';    --所要量計算(製番)実行中です
    APS_COM_OD_MNT_ING                  VARCHAR2(28)   := 'AC00108';    --所要量メンテナンス実行中です
    APS_COM_PLANT_WHCD_NULL             VARCHAR2(28)   := 'AC00118';    --工場の代表納入場所コードは省略できません
    APS_COM_NOTEXIST_OD_CALC       VARCHAR2(28)   := 'AC50552';    --所要量計算制御データが存在しません
    APS_COM_NOTEXIST_JOB_OD_CALC       VARCHAR2(28)   := 'AC00237';    --所要量計算制御(製番)データが存在しません
    APS_COM_NOTEXIST_UNIT_COST          VARCHAR2(28)   := 'AC50515';    --購入単価データが存在しません
    APS_COM_NOTEXIST_OPR_INST_CD        VARCHAR2(28)   := 'AC50555';    --作業指示番号採番データが存在しません
    APS_COM_NOTEXIST_PUCH_ODR_CD        VARCHAR2(28)   := 'AC50557';    --発注番号採番データが存在しません
    APS_COM_NOTEXIST_ODR_CD             VARCHAR2(28)   := 'AC50560';    --作業計画番号採番データが存在しません
    APS_COM_NOTEXIST_M_VEND_CTRL        VARCHAR2(28)   := 'AC50520';    --取引先データが存在しません
    APS_COM_NOTEXIST_DATA               VARCHAR2(28)   := 'AC50700';    --対象データが存在しません
    APS_COM_ORACLE_ERR                  VARCHAR2(28)   := 'AC53401';    --ＯＲＡＣＬＥエラー
    APS_COM_OTHER_ERR                   VARCHAR2(28)   := 'AC53402';    --その他エラー
    APS_COM_NOTEXIST_M_CUR              VARCHAR2(28)   := 'ZZ02023';    --該当レコードが通貨に存在しません。(#518)
    APS_COM_MRP_TARGET_NOTFOUND         VARCHAR2(28)   := 'AC20001';    --所要量計算対象の保管区が存在しません
    APS_COM_JOB_ODR_DEL_FLG             VARCHAR2(28)   := 'AC00256';    --引当元製番が削除対象のため、所要量計算実行する必要があります
    APS_COM_JOB_ODR_EXP_TYP             VARCHAR2(28)   := 'AC00255';    --引当元製番計画が変更のため、所要量計算実行する必要があります
    APS_COM_JOB_ODR_EXP_TYP1            VARCHAR2(28)   := 'AC00257';    --引当元製番基本情報が変更しましたから、所要量計算実行する必要があります
    
    -- LOG の宣言
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    OrdStartMsg                         VARCHAR2(136);
    OrdEndMsg                           VARCHAR2(136);
    OrdEndMsg_Param                     VARCHAR2(64)  := '入力パラメータ：';
    OrdEndMsg_TgtCnt                    VARCHAR2(40)  := '対象件数：';
    OrdEndMsg_DoneCnt                   VARCHAR2(40)  := '正常件数：';
    OrdEndMsg_WarCnt                    VARCHAR2(64)  := 'ワーニング件数：';
    OrdEndMsg_fatalCnt                  VARCHAR2(40)  := '異常件数：';
    BracketS                            VARCHAR2(4)   := '[';
    BracketE                            VARCHAR2(4)   := ']';
    Comma                               VARCHAR2(4)   := ',';
    OrdWrnMsg_WorkOdrCd                 VARCHAR2(56)  := '作業計画番号：';
    OrdWrnMsg_PuchOdrCd                 VARCHAR2(40)  := '発注番号：';
    OrdWrnMsg_VendCd                    VARCHAR2(56)  := '取引先コード：';
    OrdWrnMsg_TaxCd                     VARCHAR2(56)  := '消費税コード：';
    OrdWrnMsg_Round                     VARCHAR2(56)  := '(SBM0465)端数処理エラー';
    OrdWrnMsg_CurrencyConvert           VARCHAR2(56)  := '邦貨換算エラー';
    OrdWrnMsg_CurCd                     VARCHAR2(48)  := '通貨コード：';       --(#518)
    OrdWrnMsg_CalcTax                   VARCHAR2(56)  := '税計算エラー';
    LOGMSG_APS_COM_JOB_ODR              VARCHAR2(136) := '引当元製番:';
    -- カーソルの宣言
    -- 作業系列（代表作業区の取得用）
    CURSOR curM_PROC_GRP(
        cvc2PlantCd         VARCHAR2
       ,cvc2ItemCd          VARCHAR2
       ,cnumOutsideTyp      NUMBER
        )
    IS
        SELECT WS_CD
            FROM   M_PROC_GRP
            WHERE  PLANT_CD = cvc2PlantCd
              AND  ITEM_CD = cvc2ItemCd
              AND  OUTSIDE_TYP = cnumOutsideTyp
            ORDER BY PROC_NO ASC;
    --パターン別作業系列（代表作業区の取得用）
    CURSOR curM_PATTERN_PROC_GRP(
        cvc2PlantCd         VARCHAR2
       ,cvc2ItemCd          VARCHAR2
       ,cvc2PatternCd       VARCHAR2
       ,cnumOutsideTyp      NUMBER
        )
    IS
        SELECT WS_CD
            FROM   M_PATTERN_PROC_GRP
            WHERE  PLANT_CD = cvc2PlantCd
              AND  ITEM_CD = cvc2ItemCd
              AND  PATTERN_CD = cvc2PatternCd
              AND  OUTSIDE_TYP = cnumOutsideTyp
            ORDER BY PROC_NO ASC;
    -- 購入単価ヘッダー（代表取引先の取得用）
    CURSOR curM_PUCH_UNIT_COST_H(
        cvc2CompanyCd       VARCHAR2
       ,cvc2PlantCd         VARCHAR2
       ,cvc2ItemCd          VARCHAR2
        )
    IS
        SELECT VEND_CD
            FROM   M_PUCH_UNIT_COST_H
            WHERE  COMPANY_CD = cvc2CompanyCd
              AND  PLANT_CD = cvc2PlantCd
              AND  ITEM_CD = cvc2ItemCd
            ORDER BY PUCH_PRIORITY_REF_NO ASC,VEND_CD ASC;
    -- 購入単価
    CURSOR curM_PUCH_UNIT_COST(
        cvc2CompanyCd       VARCHAR2
       ,cvc2VendCd          VARCHAR2
       ,cvc2PlantCd         VARCHAR2
       ,cvc2ItemCd          VARCHAR2
       ,cdtmEffPhaseInDate  DATE
       ,cnumPuchSize        NUMBER
        )
    IS
        SELECT UNIT_COST,UNIT_COST_TYP,PROCESSING_COST,MATERIAL_COST,OTHER_OVERHEADS
            FROM   M_PUCH_UNIT_COST
            WHERE  COMPANY_CD = cvc2CompanyCd
              AND  VEND_CD = cvc2VendCd
              AND  PLANT_CD = cvc2PlantCd
              AND  ITEM_CD = cvc2ItemCd
              AND  EFF_PHASE_IN_DATE <= cdtmEffPhaseInDate
              AND  PUCH_SIZE <= cnumPuchSize
            ORDER BY EFF_PHASE_IN_DATE DESC,PUCH_SIZE DESC;
    -- 下位オーダ
--    CURSOR curT_OD_CHILD(
--        cvc2OdNo            VARCHAR2
--        )
--    IS
--        SELECT OD_NO,OD_TYP,ODR_STS_TYP
--            FROM   T_OD
--            WHERE  PARENT_OD_NO = cvc2OdNo
--            FOR UPDATE;
-- 2008/09/16 ADD START 土田
    CURSOR curT_OD_CHILD(
        cvc2OdNo            VARCHAR2
        )
    IS
        SELECT OD_NO,OD_TYP,ODR_STS_TYP,DM_STS_TYP
            FROM   T_OD
            WHERE  PARENT_OD_NO = cvc2OdNo
            AND    DM_STS_TYP != DM_STS_COMPLETE
            FOR UPDATE;
-- 2008/09/16 ADD START 土田
    -- 保管区マスタのチェック
    CURSOR curM_WH IS
        SELECT  WH_CD
            FROM   M_WH
            WHERE  M_WH.PLANT_CD = pvc2PlantCd
                   AND M_WH.MRP_FLG = MRP_TARGET;

    -- 製番計画のチェック(下位抽出)
    CURSOR curT_JOB_ODR(
        cvc2OdNo  VARCHAR2 
        ) IS 
    SELECT job1.JOB_ODR_STS_TYP,
           job1.JOB_ODR_EXP_TYP,
           job1.JOB_ODR_DEL_FLG,
           job1.job_odr_cd 
        FROM  T_JOB_ODR job1 
        WHERE EXISTS(
           SELECT job2.job_odr_cd 
           FROM  T_JOB_ODR_ALC job2
           WHERE EXISTS(
              SELECT td1.od_no 
              FROM T_OD td1 
              WHERE EXISTS(
                 SELECT td2.od_no 
                 FROM T_OD td2 
                 WHERE td2.od_no = td1.parent_od_no
                 AND td2.od_no = cvc2OdNo)
                 AND job2.od_no = td1.od_no
           )
           AND job1.job_odr_cd = job2.job_odr_cd
      );
    -- 製番計画のチェック
    CURSOR curT_JOB_ODR_CK(
        cvc2OdNo  VARCHAR2 
        ) IS 
    SELECT job1.JOB_ODR_STS_TYP,
           job1.JOB_ODR_EXP_TYP,
           job1.JOB_ODR_DEL_FLG,
           job1.job_odr_cd 
        FROM  T_JOB_ODR job1 
        WHERE EXISTS(
           SELECT job2.job_odr_cd 
           FROM  T_JOB_ODR_ALC job2
           WHERE job2.od_no = cvc2OdNo
           AND job1.job_odr_cd = job2.job_odr_cd
        );
BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;
    IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
        OrdStartMsg := '(SBM0449)<< オーダ発効処理（ＭＲＰ）開始 >>';
        OrdEndMsg   := '<< オーダ発効処理（ＭＲＰ）終了 >>';
    ELSE
        OrdStartMsg := '(SBM0450)<< オーダ発効処理（製番）開始 >>';
        OrdEndMsg   := '<< オーダ発効処理（製番）終了 >>';
    END IF;
/*------------------------------------------------------------
'　ログのオープンと開始メッセージの出力
'　ＭＲＰ用、製番用にログファイルを管理させるため
'　パラメータで受取ったファイル名の頭に管理区分を付与する
-------------------------------------------------------------*/
    -- トレース出力用にパラメータを記録
    vc2TraceComment := '<<';
    vc2TraceComment := vc2TraceComment || OrdEndMsg_Param || BracketS || pvc2LogMode || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2OutputMode || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2OutputPath || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2OutputName || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2UserId || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2BusinessName || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2PlantCd || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2ManagementTyp || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2OutsideTyp || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2JobOdrCd || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2JobOdrDetailNo || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2Entry1Typ || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2Entry2Typ || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2EntryDate || BracketE || '>>';
    vc2TraceComment := SUBSTR(vc2TraceComment,1,256);
    /* LogFile の 加工 */
    IF NOT(pvc2OutputName IS NULL AND pvc2ManagementTyp IS NULL) THEN
        vc2OutputName := pvc2ManagementTyp || pvc2OutputName;
    END IF;
    /* LogFile の OPEN */
    blnRet := FncLogOpen(pvc2OutputPath, vc2OutputName, pvc2PlantCd,pvc2OutputMode,UTL_FileHandle);
    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    -- 開始メッセージの出力
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, OrdStartMsg);
    -- コミット
    COMMIT;
/*------------------------------------------------------------
'　共通の入力パラメータをチェックする
'　固有の入力パラメータをチェックする
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 共通の入力パラメータのチェック
    IF  pvc2LogMode IS NULL THEN            --ＬＯＧモードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputMode IS NULL THEN         --出力モードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputPath IS NULL THEN         --出力パスがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputName IS NULL THEN         --出力ファイル名がＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2UserId IS NULL THEN             --ユーザＩＤがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2BusinessName IS NULL THEN       --業務名がＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2PlantCd IS NULL THEN            --工場コードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    -- 固有の入力パラメータのチェック
    -- 管理区分がＮＵＬＬ、又は、1でも2でもない
    IF  pvc2ManagementTyp IS NULL THEN
        RAISE excMistakeNativeParam;
    ELSIF   pvc2ManagementTyp != MANAGEMENT_TYP_1 AND pvc2ManagementTyp != MANAGEMENT_TYP_2 THEN
        RAISE excMistakeNativeParam;
    END IF;
    -- 内外作区分がＮＵＬＬ、又は、1でも2でも9でもない
    IF  pvc2OutsideTyp IS NULL THEN
        RAISE excMistakeNativeParam;
    ELSIF   pvc2OutsideTyp != OUTSIDE_TYP_1 AND pvc2OutsideTyp != OUTSIDE_TYP_2 AND pvc2OutsideTyp != OUTSIDE_TYP_9 THEN
        RAISE excMistakeNativeParam;
    END IF;
    -- エントリ区分1がＮＵＬＬ、又は、1でも2でも3でもない
    IF  pvc2Entry1Typ IS NULL THEN
        RAISE excMistakeNativeParam;
    ELSIF   pvc2Entry1Typ != ENTRY1_TYP_1 AND pvc2Entry1Typ != ENTRY1_TYP_2 AND pvc2Entry1Typ != ENTRY1_TYP_3 THEN
        RAISE excMistakeNativeParam;
    END IF;
    -- エントリ区分2がＮＵＬＬ、又は、1でも2でも3でも4でもない
    IF  pvc2Entry2Typ IS NULL THEN
        RAISE excMistakeNativeParam;
    ELSIF   pvc2Entry2Typ != ENTRY2_TYP_1 AND pvc2Entry2Typ != ENTRY2_TYP_2 AND pvc2Entry2Typ != ENTRY2_TYP_3 AND pvc2Entry2Typ != ENTRY2_TYP_4 THEN
        RAISE excMistakeNativeParam;
    END IF;
    -- エントリ日付がＮＵＬＬ
    IF  pvc2EntryDate IS NULL THEN
        RAISE excMistakeNativeParam;
    END IF;
/*------------------------------------------------------------
'　所要量計算中をチェックする
'　所要量メンテナンス中をチェックする
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 所要量計算制御のチェック
    BEGIN
        SELECT  OD_CALC_FLG,OD_MNT_FLG INTO numOdCalcFlg,numOdMntFlg
            FROM   SYS_OD_CALC_CTRL
            WHERE  SYS_OD_CALC_CTRL.PLANT_CD = pvc2PlantCd;
        IF numOdCalcFlg = IN_PROGRESS THEN      --所要量計算実行中
            RAISE excOdCalc_Ing;
        END IF;
  --製番指定ではない場合のみチェック
  IF (pvc2JobOdrCd IS NULL) THEN
          IF numOdMntFlg = IN_PROGRESS THEN       --所要量メンテナンス中
              RAISE excOdMnt_Ing;
          END IF;
  END IF;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetOdCtrl;
        WHEN OTHERS THEN
            RAISE;
    END;
/*------------------------------------------------------------
'　所要量計算（製番）中をチェックする
'　所要量メンテナンス（製番）中をチェックする
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00021';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 所要量計算制御（製番）のチェック
    IF (pvc2JobOdrCd IS NULL) THEN
       -- 製番が指定されていない場合
       BEGIN
            SELECT  DECODE(SUM(OD_CALC_FLG),0,0,NULL,NULL,1),DECODE(SUM(OD_MNT_FLG),0,0,NULL,NULL,1)  INTO numJobOdCalcFlg,numJobOdMntFlg
              FROM   SYS_JOB_OD_CALC_CTRL
              WHERE  SYS_JOB_OD_CALC_CTRL.PLANT_CD = pvc2PlantCd
              GROUP BY SYS_JOB_OD_CALC_CTRL.PLANT_CD;
          IF numJobOdCalcFlg >= IN_PROGRESS THEN      --所要量計算（製番）実行中
              RAISE excJobOdCalc_Ing;
          END IF;
          IF numJobOdMntFlg >= IN_PROGRESS THEN       --所要量メンテナンス（製番）中
              RAISE excJobOdMnt_Ing;
          END IF;
       EXCEPTION
          WHEN NO_DATA_FOUND THEN
              IF pvc2ManagementTyp = MANAGEMENT_TYP_2 THEN
                 RAISE excGetJobOdCtrl;
              END IF;
          WHEN OTHERS THEN
              RAISE;
       END;
    ELSE
        -- 製番が指定されている場合
        IF NOT(pvc2JobOdrCd IS NULL) THEN
            IF INSTR(pvc2JobOdrCd, '%', 1) <= 0 THEN
               BEGIN
                 SELECT  OD_CALC_FLG,OD_MNT_FLG INTO numJobOdCalcFlg,numJobOdMntFlg
                    FROM   SYS_JOB_OD_CALC_CTRL
                    WHERE  SYS_JOB_OD_CALC_CTRL.PLANT_CD = pvc2PlantCd
                                AND SYS_JOB_OD_CALC_CTRL.JOB_ODR_CD = pvc2JobOdrCd;
                IF numJobOdCalcFlg = IN_PROGRESS THEN      --所要量計算（製番）実行中
                    RAISE excJobOdCalc_Ing;
                END IF;
                IF numJobOdMntFlg = IN_PROGRESS THEN       --所要量メンテナンス（製番）中
                    RAISE excJobOdMnt_Ing;
                END IF;
               EXCEPTION
                  WHEN NO_DATA_FOUND THEN
                      RAISE excGetJobOdCtrl;
                  WHEN OTHERS THEN
                      RAISE;
               END;
            ELSE
                BEGIN
                SELECT  DECODE(SUM(OD_CALC_FLG),0,0,NULL,NULL,1),DECODE(SUM(OD_MNT_FLG),0,0,NULL,NULL,1)  INTO numJobOdCalcFlg,numJobOdMntFlg
                    FROM   SYS_JOB_OD_CALC_CTRL
                    WHERE  SYS_JOB_OD_CALC_CTRL.PLANT_CD = pvc2PlantCd
                                AND SYS_JOB_OD_CALC_CTRL.JOB_ODR_CD LIKE pvc2JobOdrCd
                    GROUP BY SYS_JOB_OD_CALC_CTRL.PLANT_CD;
                IF numJobOdCalcFlg >= IN_PROGRESS THEN      --所要量計算（製番）実行中
                    RAISE excJobOdCalc_Ing;
                END IF;
                IF numJobOdMntFlg >= IN_PROGRESS THEN       --所要量メンテナンス（製番）中
                    RAISE excJobOdMnt_Ing;
                END IF;
               EXCEPTION
                  WHEN NO_DATA_FOUND THEN
                      RAISE excGetJobOdCtrl;
                  WHEN OTHERS THEN
                      RAISE;
               END;
            END IF;
        END IF;
    END IF;
/*------------------------------------------------------------
'　自社マスタをチェックする
'　会社コードを取得する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 自社マスタのチェック
    BEGIN
        SELECT  COMPANY_CD INTO vc2CompanyCd
            FROM   SYS_MY_COMPANY
            WHERE  SYS_MY_COMPANY.CTRL_CD = CTRL_CD_DEFAULT;    --SYSTEが設定
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetMyCompany;
        WHEN OTHERS THEN
            RAISE;
    END;
/*------------------------------------------------------------
'　保管区マスタをチェックする
'　所要量計算対象の保管区の存在チェック処理
'　存在しない場合：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 保管区マスタのチェック
    OPEN curM_WH;
    FETCH curM_WH INTO vc2WhCd;
    IF curM_WH%NOTFOUND THEN
        RAISE excPlantWhCd_Null;    -- 所要量計算対象保管区が存在しない
    END IF;
/*------------------------------------------------------------
'　所要量テーブルに対し入力パラメータの条件を動的にＳＱＬ化
'
'
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 抽出条件により動的ＳＱＬ生成
    intOdrCursorName := DBMS_SQL.OPEN_CURSOR;
    vc2Sql := 'SELECT';
    vc2Sql := vc2Sql || ' T_OD.OD_NO';            -- 1 オーダデマンド番号
    vc2Sql := vc2Sql || ',T_OD.ITEM_CD';          -- 2 品目番号
    vc2Sql := vc2Sql || ',T_OD.PRD_DUE_DATE';     -- 3 製造納期
    vc2Sql := vc2Sql || ',T_OD.PRD_START_DATE';   -- 4 製造着手日
    vc2Sql := vc2Sql || ',T_OD.ODR_QTY';          -- 5 オーダ数
    vc2Sql := vc2Sql || ',T_OD.OUTSIDE_TYP';      -- 6 所要量内外作区分
    vc2Sql := vc2Sql || ',M_ITEM.ACPT_INSPC_TYP'; -- 7 受入検査区分
    vc2Sql := vc2Sql || ',M_ITEM.OPR_RSLT_TYP';   -- 8 作業実績区分
    vc2Sql := vc2Sql || ',M_ITEM.SPL_ITEM_TYP';   -- 9 受給品区分
    vc2Sql := vc2Sql || ',M_ITEM.TAX_CD';         --10 消費税コード
    vc2Sql := vc2Sql || ',T_OD.JOB_ODR_CD';       --11 製番
    vc2Sql := vc2Sql || ',T_OD.JOB_ODR_DETAIL_NO';--12 製番枝番
    vc2Sql := vc2Sql || ',T_OD.JOB_ODR_CANCEL_NO';--13 製番取消発生番号
    vc2Sql := vc2Sql || ',T_OD.PARENT_OD_NO';     --14 親オーダデマンド番号
    vc2Sql := vc2Sql || ',T_OD.PATTERN_CD';       --15 パターンコード
    vc2Sql := vc2Sql || ' FROM T_OD,M_ITEM,T_EXTERNAL_PLAN';
    vc2Sql := vc2Sql || ' WHERE T_OD.ITEM_CD = M_ITEM.ITEM_CD(+)';
    vc2Sql := vc2Sql || ' AND T_OD.OD_NO = T_EXTERNAL_PLAN.OD_NO(+)';
    -- 工場コードにより指定工場を抽出
    vc2Sql := vc2Sql || ' AND T_OD.PLANT_CD = ''' || pvc2PlantCd || '''';
    --日付FORMAT
    --Jf:画面からPARAMETERのFORMAT YYYY/MM/DD
    --又は、Jの時間管理=falseの場合、画面からPARAMETERのFORMAT　YYYY/MM/DD
    IF LENGTH(pvc2EntryDate) <= 10 THEN
        vc2FormatEntryDate := pvc2EntryDate || ' 23:59:59';
    --Jの時間管理=trueの場合、画面からPARAMETERのFORMAT　YYYY/MM/DDHH24:MI
    ELSE
        vc2FormatEntryDate := pvc2EntryDate || ':59';
    END IF;
    -- 製造納期が指定されている場合
    IF pvc2Entry1Typ = ENTRY1_TYP_3 THEN
        vc2Sql := vc2Sql || ' AND T_OD.PRD_DUE_DATE <= TO_DATE(''' || vc2FormatEntryDate || ''',''yyyy/mm/dd hh24:mi:ss'')';
    END IF;
    -- 製造着手日が指定されている場合
    IF pvc2Entry1Typ = ENTRY1_TYP_2 THEN
        vc2Sql := vc2Sql || ' AND T_OD.PRD_START_DATE <= TO_DATE(''' || vc2FormatEntryDate || ''',''yyyy/mm/dd hh24:mi:ss'')';
    END IF;
    -- 手配着手日が指定されている場合
    IF pvc2Entry1Typ = ENTRY1_TYP_1 THEN
        vc2Sql := vc2Sql || ' AND T_OD.ODR_START_DATE <= TO_DATE(''' || vc2FormatEntryDate || ''',''yyyy/mm/dd hh24:mi:ss'')';
    END IF;
    -- 画面がＭＲＰ用が選択された場合
    IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
        vc2Sql := vc2Sql || ' AND T_OD.OD_TYP = ' || OD_TYP_ORDER;          --オーダであり
        vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_CD IS NULL ';                --かつ、製番がNull
    END IF;
    -- 画面が製番用が選択された場合
    IF pvc2ManagementTyp = MANAGEMENT_TYP_2 THEN
        vc2Sql := vc2Sql || ' AND (T_OD.OD_TYP = ' || OD_TYP_ORDER_DEMAND;  --オーダデマンドか
        vc2Sql := vc2Sql || ' OR T_OD.OD_TYP = ' || OD_TYP_ORDER || ')';    --又はオーダであり
        vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_CD IS NOT NULL ';            --かつ、製番がNullでない
        -- 製番が指定されている場合
        IF NOT(pvc2JobOdrCd IS NULL) THEN
            IF INSTR(pvc2JobOdrCd, '%', 1) <= 0 THEN
                vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_CD = ''' || pvc2JobOdrCd || '''';
            ELSE
                vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_CD LIKE ''' || pvc2JobOdrCd || '''';
            END IF;
        END IF;
        -- 枝番が指定されている場合
        IF NOT(pvc2JobOdrDetailNo IS NULL) THEN
            vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_DETAIL_NO = ' || pvc2JobOdrDetailNo;
        END IF;
    END IF;
    -- 内外作区分（1:内作）が指定されている場合
    IF pvc2OutsideTyp = OUTSIDE_TYP_1 THEN
        vc2Sql := vc2Sql || ' AND T_OD.OUTSIDE_TYP = ' || OUTSIDE_TYP_1;
    END IF;
    -- 内外作区分（2:外作）が指定されている場合
    IF pvc2OutsideTyp = OUTSIDE_TYP_2 THEN
        vc2Sql := vc2Sql || ' AND T_OD.OUTSIDE_TYP = ' || OUTSIDE_TYP_2;
    END IF;
    -- オーダ状態区分（1 が設定される）
    vc2Sql := vc2Sql || ' AND T_OD.ODR_STS_TYP = ' || ODR_STS_PLAN;
    -- 所要量処理区分（9 が設定される）
    vc2Sql := vc2Sql || ' AND T_OD.MRP_TYP = ' || MRP_TYP_COMPLETE;
    -- オーダ発効済みフラグ（0:未発行が設定される）
    vc2Sql := vc2Sql || ' AND T_OD.ODR_RELEASE_FLG = ' || ODR_RELEASE_NOEFFRCT;
    -- 外部計画処理区分がNULLの場合か｢9:完了｣
    vc2Sql := vc2Sql || ' AND (T_EXTERNAL_PLAN.EXTERNAL_PLAN_EXP_TYP IS NULL';
    vc2Sql := vc2Sql || ' OR T_EXTERNAL_PLAN.EXTERNAL_PLAN_EXP_TYP = ' || EXTERNAL_PLAN_EXP_COMP;
    -- 外部オーダデマンドメンテナンスで「下位部品展開の対象とする」をチェックしなかった外部オーダ
    vc2Sql := vc2Sql || ' OR (T_EXTERNAL_PLAN.EXTERNAL_PLAN_REG_TYP =  ' || EXTERNAL_PLAN_REG_TYP_MNT ;
    vc2Sql := vc2Sql || ' AND T_OD.EXTERNAL_DM_FLG = ' || EXTERNAL_DM_FLG_IN || '))';

/*------------------------------------------------------------
'　所要量テーブルに対してのＳＱＬの内容をトレースに出力
'
'
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    --TraceLog の出力（実行位置）
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,1,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,151,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,301,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,451,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,601,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,751,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,901,150));
/*------------------------------------------------------------
'　所要量テーブルに対してのＳＱＬの解析
'　所要量テーブルの列の定義
'
-------------------------------------------------------------*/
    -- ＳＱＬ文解析
    DBMS_SQL.PARSE(intOdrCursorName,vc2Sql,DBMS_SQL.NATIVE);
--vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 列定義
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 1,vc2OdNo,100);         -- オーダデマンド番号
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 2,vc2ItemCd,100);       -- 品目番号
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 3,dtmPrdDueDate);      -- 製造納期
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 4,dtmPrdStartDate);    -- 製造着手日
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 5,numOdrQty);          -- オーダ数
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 6,numOutsideTyp);      -- 所要量内外作区分
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 7,numAcptInspcTyp);    -- 受入検査区分
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 8,numOprRsltTyp);      -- 作業実績区分
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 9,numSplItemTyp);      -- 受給品区分
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,10,vc2TaxCd,100);        -- 消費税コード
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,11,vc2JobOdrCd,100);     -- 製番
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,12,numJobOdrDetailNo);  -- 製番枝番
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,13,numJobOdrCancelNo);  -- 製番取消発生番号
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,14,vc2ParentOdNo,100);   -- 親オーダデマンド番号
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,15,vc2PatternCd,100);   -- パターンコード
/*------------------------------------------------------------
'　所要量テーブルのカーソル実行
'　所要量テーブルの行フェッチ（抽出件数分のMain/Loop処理）
'
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- カーソル実行
    intRet := DBMS_SQL.EXECUTE(intOdrCursorName);
--vc2RunChkComment := '●●●●通過 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 行フェッチ
    LOOP
        IF DBMS_SQL.FETCH_ROWS(intOdrCursorName) > 0 THEN
        BEGIN
--vc2RunChkComment := '●●●●通過 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- フェッチした値の取得
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 1,vc2OdNo);             -- オーダデマンド番号
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 2,vc2ItemCd);           -- 品目番号
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 3,dtmPrdDueDate);       -- 製造納期
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 4,dtmPrdStartDate);     -- 製造着手日
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 5,numOdrQty);           -- オーダ数
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 6,numOutsideTyp);       -- 所要量内外作区分
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 7,numAcptInspcTyp);     -- 受入検査区分
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 8,numOprRsltTyp);       -- 作業実績区分
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 9,numSplItemTyp);       -- 受給品区分
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,10,vc2TaxCd);            -- 消費税コード
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,11,vc2JobOdrCd);         -- 製番
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,12,numJobOdrDetailNo);   -- 製番枝番
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,13,numJobOdrCancelNo);   -- 製番取消発生番号
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,14,vc2ParentOdNo);       -- 親オーダデマンド番号
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,15,vc2PatternCd);        -- パターンコード
            blnWarning := FALSE;
            numTgtCnt := numTgtCnt + 1;
/*------------------------------------------------------------
'　[製番計画]チェック
'　オーダ発効(製番)の場合しか行わない
-------------------------------------------------------------*/
            -- 製番が指定されている場合
            IF NOT (vc2JobOdrCd IS NULL) THEN
            numJobOdrCHK := 0;
            FOR curT_JOB_ODR_REC IN curT_JOB_ODR(vc2OdNo) LOOP
              numJobOdrStsTypChk := curT_JOB_ODR_REC.Job_Odr_Sts_Typ;
              numJobOdrExpTyp := curT_JOB_ODR_REC.Job_Odr_Exp_Typ;
              numJobOdrDelFlg := curT_JOB_ODR_REC.Job_Odr_Del_Flg;
              vc2JobOdrCdChk := curT_JOB_ODR_REC.Job_Odr_Cd;
            IF curT_JOB_ODR %FOUND THEN
               IF numJobOdrStsTypChk = CHK_JOB_ODR_STS_TYP THEN
                  IF numJobOdrExpTyp = CHK_JOB_ODR_EXP_TYP1 THEN
                     RAISE excJobOdrExp1;
                  END IF;
                  IF numJobOdrDelFlg = CHK_JOB_ODR_DEL_FLG THEN
                     RAISE excJobOdrDel;
                  END IF;
                  IF numJobOdrExpTyp = CHK_JOB_ODR_EXP_TYP2 THEN
                     RAISE excJobOdrExp;
                  END IF;
               END IF;
            END IF;
            END LOOP;
            
            FOR curT_JOB_ODR_CK_REC IN curT_JOB_ODR_CK(vc2OdNo) LOOP
              numJobOdrStsTypChk := curT_JOB_ODR_CK_REC.Job_Odr_Sts_Typ;
              numJobOdrExpTyp := curT_JOB_ODR_CK_REC.Job_Odr_Exp_Typ;
              numJobOdrDelFlg := curT_JOB_ODR_CK_REC.Job_Odr_Del_Flg;
              vc2JobOdrCdChk := curT_JOB_ODR_CK_REC.Job_Odr_Cd;
            IF curT_JOB_ODR_CK %FOUND THEN
               IF numJobOdrStsTypChk = CHK_JOB_ODR_STS_TYP THEN
                  IF numJobOdrExpTyp = CHK_JOB_ODR_EXP_TYP1 THEN
                     numJobOdrCHK := 1;
                     RAISE excJobOdrExp1;
                  END IF;
                  IF numJobOdrDelFlg = CHK_JOB_ODR_DEL_FLG THEN
                     numJobOdrCHK := 1;
                     RAISE excJobOdrDel;
                  END IF;
                  IF numJobOdrExpTyp = CHK_JOB_ODR_EXP_TYP2 THEN
                     numJobOdrCHK := 1;
                     RAISE excJobOdrExp;
                  END IF;
               END IF;
            END IF;
            END LOOP;
            END IF;
/*------------------------------------------------------------
'　所要量データが内作の場合の処理を実施
'　内作への分岐
'　作業計画番号の取得
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- 内外作区分 = 1（内作）
            IF numOutsideTyp = OUTSIDE_TYP_INNER_MAKE THEN
--vc2RunChkComment := '●●●●通過 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 作業計画番号取得
                blnRet := FncGetNewOdrCd(UTL_FileHandle
                                        ,pvc2LogMode
                                        ,pvc2OutputMode
                                        ,pvc2UserId
                                        ,pvc2BusinessName
                                        ,pvc2PlantCd
                                        ,vc2WorkOdrCd
                                        );
                IF blnRet = FALSE THEN
                    RAISE excGetNewOdrCd;
                END IF;
/*------------------------------------------------------------
'　作業系列マスタの読み込み
'　代表作業区の取得
'　未登録時: 処理続行
-------------------------------------------------------------*/
                --品目の作業実績区分が１（出来高実績）の場合
                IF numOprRsltTyp = OPR_RSLT_ACCUMULATION THEN
                  IF vc2PatternCd IS NULL THEN
  --vc2RunChkComment := '●●●●通過 00140';
  --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                      -- 代表作業区の取得
                      OPEN curM_PROC_GRP(
                          pvc2PlantCd
                         ,vc2ItemCd
                         ,numOutsideTyp
                          );
  --vc2RunChkComment := '●●●●通過 00150';
  --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                      FETCH curM_PROC_GRP
                          INTO vc2WsCd;
                      IF curM_PROC_GRP%NOTFOUND THEN
                           vc2WsCd := NULL;
                     END IF;
                      CLOSE curM_PROC_GRP;
                  END IF;
  vc2RunChkComment := '●●●●通過 00145';
  --[所要量]."パターンコード"がNULL以外のとき
                  IF vc2PatternCd IS NOT NULL THEN
  --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                      -- 代表作業区の取得
                      OPEN curM_PATTERN_PROC_GRP(
                          pvc2PlantCd
                         ,vc2ItemCd
                         ,vc2PatternCd
                         ,numOutsideTyp
                          );
  --vc2RunChkComment := '●●●●通過 00155';
  --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                      FETCH curM_PATTERN_PROC_GRP
                          INTO vc2WsCd;
                      IF curM_PATTERN_PROC_GRP%NOTFOUND THEN
                           vc2WsCd := NULL;
                      END IF;
                      CLOSE curM_PATTERN_PROC_GRP;
                  END IF;
                ELSE
                --品目の作業実績区分が１（作業実績）の場合
                      vc2WsCd := NULL;
                END IF;
--[所要量]."パターンコード"がNULLのとき
                
/*------------------------------------------------------------
'　代表作業区が未登録　かつ
'　品目の作業実績区分が１（出来高実績）
'　処理：業務メッセージの出力
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF vc2WsCd IS NULL AND numOprRsltTyp = OPR_RSLT_ACCUMULATION THEN
                    blnWarning := TRUE;
                    vc2Comment := '(SBM0451)' || OrdWrnMsg_WorkOdrCd || BracketS || vc2WorkOdrCd || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTEXIST_PROC_GRP, vc2Comment);
                END IF;
                vc2OprInstCd := NULL;
/*------------------------------------------------------------
'　品目の作業実績区分が１（出来高実績）の場合
'　作業指示伝票にデータを追加する
'
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00170';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF numOprRsltTyp = OPR_RSLT_ACCUMULATION THEN
--vc2RunChkComment := '●●●●通過 00180';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- 作業指示番号取得
                    blnRet := FncGetNewInstCd(UTL_FileHandle
                                            ,pvc2LogMode
                                            ,pvc2OutputMode
                                            ,pvc2UserId
                                            ,pvc2BusinessName
                                            ,pvc2PlantCd
                                            ,vc2OprInstCd
                                            );
                    IF blnRet = FALSE THEN
                        RAISE excGetNewInstCd;
                    END IF;
--vc2RunChkComment := '●●●●通過 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- 作業指示伝票データの登録
                    INSERT INTO T_OPR_INST_SLIP (
                         OPR_INST_CD
                        ,OPR_INST_CD_GNR_TYP
                        ,OPR_INST_SLIP_ISS_DATE
                        ,OPR_INST_SLIP_ISS_FLG
                        ,PLANT_CD
                        ,CREATED_DATE
                        ,CREATED_BY
                        ,CREATED_PRG_NM
                        ,UPDATED_DATE
                        ,UPDATED_BY
                        ,UPDATED_PRG_NM
                        ,MODIFY_COUNT
                        ) VALUES (
                         vc2OprInstCd           --作業指示番号
                        ,INST_CD_RISE_ITEM      --作業指示番号発生区分
                        ,NULL                   --作業指示伝票発行日
                        ,INST_NOISSUE           --作業指示伝票発行済フラグ
                        ,pvc2PlantCd            --工場コード
                        ,SYSDATE                --ｓｙｓ作成日時
                        ,pvc2UserId             --ｓｙｓ作成者コード
                        ,MY_SQL_NAME            --作成プログラム名
                        ,SYSDATE                --ｓｙｓ最新更新日時
                        ,pvc2UserId             --ｓｙｓ最新更新者コード
                        ,MY_SQL_NAME            --更新プログラム名
                        ,FIRST_MODIFY_COUNT     --更新数
                        );
                END IF;
/*------------------------------------------------------------
'　所要量データが内作の場合
'　品目別仕掛にデータを追加する
'
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00200';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 品目別仕掛にデータ追加
                INSERT INTO T_WORK_IN_PROC_BY_ITEM(
                     WORK_ODR_CD
                    ,PLANT_CD
                    ,OD_NO
                    ,ITEM_CD
                    ,WS_CD
                    ,OPR_INST_START_DATE
                    ,WORK_ODR_DLV_DATE
                    ,OPR_INST_QTY
                    ,OPR_RSLT_TYP
                    ,WORK_STS_TYP
                    ,PROC_EXPLOSION_FLG
                    ,OPR_INST_DATE
                    ,WORK_CMPLT_DATE
                    ,OPR_INST_CD
                    ,WORK_IN_PROC_COMMENT
                    ,CREATED_DATE
                    ,CREATED_BY
                    ,CREATED_PRG_NM
                    ,UPDATED_DATE
                    ,UPDATED_BY
                    ,UPDATED_PRG_NM
                    ,MODIFY_COUNT
                    ) VALUES (
                     vc2WorkOdrCd               --作業計画番号
                    ,pvc2PlantCd                --工場コード
                    ,vc2OdNo                    --オーダデマンド番号
                    ,vc2ItemCd                  --品目番号
                    ,vc2WsCd                    --作業区コード
                    ,dtmPrdStartDate            --作業製造着手日
                    ,dtmPrdDueDate              --作業製造納期
                    ,numOdrQty                  --作業指示数
                    ,numOprRsltTyp              --品目別作業実績区分
                    ,WORK_STS_TYP_NOINSTRACT    --品目別作業状態区分
                    ,PROCESS_NOEXPAND           --作業系列展開済フラグ
                    ,NULL                       --作業指示日
                    ,NULL                       --作業完了日
                    ,vc2OprInstCd               --作業指示番号
                    ,NULL                       --品目別仕掛備考
                    ,SYSDATE                    --ｓｙｓ作成日時
                    ,pvc2UserId                 --ｓｙｓ作成者コード
                    ,MY_SQL_NAME                --作成プログラム名
                    ,SYSDATE                    --ｓｙｓ最新更新日時
                    ,pvc2UserId                 --ｓｙｓ最新更新者コード
                    ,MY_SQL_NAME                --更新プログラム名
                    ,FIRST_MODIFY_COUNT         --更新数
                    );
            -- 内外作区分 = 2（外作）
            ELSIF numOutsideTyp = OUTSIDE_TYP_BUY THEN
/*------------------------------------------------------------
'　所要量データが外作の場合の処理を実施
'　外作への分岐
'　発注番号の取得
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00210';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 発注番号取得
                blnRet := FncGetNewPuchCd(UTL_FileHandle
                                        ,pvc2LogMode
                                        ,pvc2OutputMode
                                        ,pvc2UserId
                                        ,pvc2BusinessName
                                        ,pvc2PlantCd
                                        ,vc2PuchOdrCd
                                        );
                IF blnRet = FALSE THEN
                    RAISE excGetNewPuchCd;
                END IF;
/*------------------------------------------------------------
'　購入単価マスタ（ヘッダー）の読み込み
'　代表取引先の取得
'　未登録時: 処理続行
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00220';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 代表取引先の取得
                OPEN curM_PUCH_UNIT_COST_H(
                    vc2CompanyCd
                   ,pvc2PlantCd
                   ,vc2ItemCd
                    );
--vc2RunChkComment := '●●●●通過 00230';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                FETCH curM_PUCH_UNIT_COST_H
                    INTO vc2VendCd;
                IF curM_PUCH_UNIT_COST_H%NOTFOUND THEN
                     vc2VendCd := NULL;
                END IF;
                CLOSE curM_PUCH_UNIT_COST_H;
/*------------------------------------------------------------
'　代表取引先コードが取得できない場合は業務メッセージ出力
'　取引先に関する各取得データは強制的に変数を初期値する
'　取引先、購入単価、消費税、為替レート、など
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00240';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 代表取引先コードが設定されていなければ業務メッセージ出力
                IF vc2VendCd IS NULL THEN
--vc2RunChkComment := '●●●●通過 00250';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    blnWarning := TRUE;
                    vc2Comment := '(SBM0452)' || OrdWrnMsg_PuchOdrCd || BracketS || vc2PuchOdrCd || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTEXIST_PUCH_COST, vc2Comment);
                    numUnitCost := 0;                       --購入単価
                    numPuchUnitCostTyp := UNIT_COST_TEMP;   --購入単価区分（仮単価）
                    numProcessingCost := 0;                 --購入加工費
                    numMaterialCost := 0;                   --購入材料費
                    numOtherOverheads := 0;                 --購入その他経費
                    numRoundTyp := ROUND_TYP_NORMAL;        --発注金額まるめ区分（四捨五入）
                    vc2TaxCd := NULL;                       --消費税コード（品目）※代表取引先で品目/取引先が判断不可のため初期化
                    numTaxRate1 := 0;                       --税率１
                    numTaxRate2 := 0;                       --税率２
                    numTaxRate3 := 0;                       --税率３
                    numTaxRoundTyp := ROUND_TYP_NORMAL;     --消費税の端数区分（四捨五入）
                    numDecimalFig := 0;                     --外貨小数桁数
                    numExchRate := 0;                       --為替レート
                    vc2OwnPersonCd := NULL;         --自社担当者コード
                ELSE
/*------------------------------------------------------------
'　代表取引先コードが取得できた場合
'　取引先に関する各取得データを変数へ代入する。
'　取引先、購入単価、消費税、為替レート、など
'　購入単価データが無い場合は業務メッセージの出力
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00260';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- 取引先検索
                    BEGIN
                        SELECT ROUND_TYP,TAX_APPLY_TYP,TAX_CD,CUR_CD,EXCH_TYP,OWN_PERSON_CD
                            INTO    numRoundTyp,numTaxApplyTyp,vc2TaxCdVend,vc2CurCd,numExchTyp,vc2OwnPersonCd
                            FROM    M_VEND_CTRL
                            WHERE   COMPANY_CD = vc2CompanyCd
                                AND VEND_CD = vc2VendCd;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            RAISE excGetVend;
                        WHEN OTHERS THEN
                            RAISE;
                    END;
--vc2RunChkComment := '●●●●通過 00265';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- 通貨検索(#518)  小数桁数設定
                    IF vc2CurCd IS NULL THEN
                        numDecimalFig := 0;
                    ELSE
                        BEGIN
                            SELECT DECIMAL_FIG
                                INTO    numDecimalFig
                                FROM    M_CUR
                                WHERE   CUR_CD = vc2CurCd;
                        EXCEPTION
                            WHEN NO_DATA_FOUND THEN
                                RAISE excGetCur;
                            WHEN OTHERS THEN
                                RAISE;
                        END;
                    END IF;
--vc2RunChkComment := '●●●●通過 00270';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- 購入単価取得
                    OPEN curM_PUCH_UNIT_COST(
                         vc2CompanyCd
                        ,vc2VendCd
                        ,pvc2PlantCd
                        ,vc2ItemCd
                        ,dtmPrdStartDate
                        ,numOdrQty
                        );
--vc2RunChkComment := '●●●●通過 00280';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    FETCH curM_PUCH_UNIT_COST
                        INTO numUnitCost
                            ,numPuchUnitCostTyp
                            ,numProcessingCost
                            ,numMaterialCost
                            ,numOtherOverheads;
--vc2RunChkComment := '●●●●通過 00290';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    IF curM_PUCH_UNIT_COST%NOTFOUND THEN
--vc2RunChkComment := '●●●●通過 00300';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        -- 購入単価が無い場合はメッセージ出力
                        blnWarning := TRUE;
                        vc2Comment := '(SBM0452)' || OrdWrnMsg_PuchOdrCd || BracketS || vc2PuchOdrCd || BracketE;
                        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                            MY_SQL_NAME, APS_COM_NOTEXIST_UNIT_COST, vc2Comment);
                        numUnitCost := 0;                       --購入単価
                        numPuchUnitCostTyp := UNIT_COST_TEMP;   --購入単価区分（仮単価）
                        numProcessingCost := 0;                 --購入加工費
                        numMaterialCost := 0;                   --購入材料費
                        numOtherOverheads := 0;                 --購入その他経費
                    END IF;
                    CLOSE curM_PUCH_UNIT_COST;
--vc2RunChkComment := '●●●●通過 00310';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- 消費税区分取得
                    IF numTaxApplyTyp = TAX_APPLY_TYP_M_VEND THEN
                        vc2TaxCd := vc2TaxCdVend;  --取引先
                    END IF;
--vc2RunChkComment := '●●●●通過 00320';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- 消費税コード下１桁の判断　１：税抜（外税）
        -- 20090417 DEL START
                    --IF TO_NUMBER(SUBSTR(vc2TaxCd,3,1)) = TAXABLE_TYP_OUT THEN
        -- 20090417 DEL END
--vc2RunChkComment := '●●●●通過 00330';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        BEGIN
                            SELECT      OLD_TAX_RATE_1,OLD_TAX_RATE_2,OLD_TAX_RATE_3
                                       ,NEW_TAX_RATE_1,NEW_TAX_RATE_2,NEW_TAX_RATE_3
                                       ,NEW_TAX_RATE_START_DATE,ROUND_TYP
                                INTO    numOldTaxRate1,numOldTaxRate2,numOldTaxRate3
                                       ,numNewTaxRate1,numNewTaxRate2,numNewTaxRate3
                                       ,dtmNewTaxRateStartDate,numTaxRoundTyp
                                FROM    M_TAX
                                WHERE   TAX_CD = vc2TaxCd;
                        EXCEPTION
                            WHEN NO_DATA_FOUND THEN
                                RAISE excGetTax;
                            WHEN OTHERS THEN
                                RAISE;
                        END;
--vc2RunChkComment := '●●●●通過 00340';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        -- 納期と新消費税の開始日の判断（新旧税率の判断）
                        IF dtmNewTaxRateStartDate > dtmPrdDueDate THEN
--vc2RunChkComment := '●●●●通過 00350';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            numTaxRate1 := numOldTaxRate1;
                            numTaxRate2 := numOldTaxRate2;
                            numTaxRate3 := numOldTaxRate3;
                        ELSE
--vc2RunChkComment := '●●●●通過 00360';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            numTaxRate1 := numNewTaxRate1;
                            numTaxRate2 := numNewTaxRate2;
                            numTaxRate3 := numNewTaxRate3;
                        END IF;
        -- 20090417 DEL START
/*
                    ELSE
vc2RunChkComment := '●●●●通過 00370';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        -- 内税の場合
                        numTaxRate1 := 0;
                        numTaxRate2 := 0;
                        numTaxRate3 := 0;
                        numTaxRoundTyp := ROUND_TYP_NORMAL;
                    END IF;
*/
        -- 20090417 DEL END
--vc2RunChkComment := '●●●●通過 00380';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                END IF;     --代表取引先取得判定のＩＦ文に対するＥＮＤ＿ＩＦ
--vc2RunChkComment := '●●●●通過 00410';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 発注金額計算
                blnRet := fncGetRound(UTL_FileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd
                                     ,numUnitCost * numOdrQty
                                     ,numDecimalFig
                                     ,numRoundTyp
                                     ,numPuchOdrAmount
                                     );
                IF blnRet = FALSE THEN
                    RAISE excGetRound;
                END IF;
--vc2RunChkComment := '●●●●通過 00420';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 本体金額計算
                numNetAmount := numPuchOdrAmount;
--vc2RunChkComment := '●●●●通過 00430';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 消費税コード下１桁の判断　１：税抜（外税）
                -- 20090417 ADD START
                IF TO_NUMBER(SUBSTR(vc2TaxCd,3,1)) = TAXABLE_TYP_OUT THEN
          -- 20090417 ADD END
                  -- 税額１計算
                  blnRet := fncGetRound(UTL_FileHandle
                                       ,pvc2LogMode
                                       ,pvc2OutputMode
                                       ,pvc2UserId
                                       ,pvc2BusinessName
                                       ,pvc2PlantCd
                                       ,numNetAmount * numTaxRate1 / 100
                                       ,numDecimalFig
                                       ,numTaxRoundTyp
                                       ,numTaxAmount1
                                       );
                  IF blnRet = FALSE THEN
                      RAISE excGetRound;
                  END IF;
--vc2RunChkComment := '●●●●通過 00440';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                  -- 税額２計算
                  blnRet := fncGetRound(UTL_FileHandle
                                       ,pvc2LogMode
                                       ,pvc2OutputMode
                                       ,pvc2UserId
                                       ,pvc2BusinessName
                                       ,pvc2PlantCd
                                       ,numNetAmount * numTaxRate2 / 100
                                       ,numDecimalFig
                                       ,numTaxRoundTyp
                                       ,numTaxAmount2
                                       );
                  IF blnRet = FALSE THEN
                      RAISE excGetRound;
                  END IF;
--vc2RunChkComment := '●●●●通過 00450';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                  -- 税額３計算
                  blnRet := fncGetRound(UTL_FileHandle
                                       ,pvc2LogMode
                                       ,pvc2OutputMode
                                       ,pvc2UserId
                                       ,pvc2BusinessName
                                       ,pvc2PlantCd
                                       ,numNetAmount * numTaxRate3 / 100
                                       ,numDecimalFig
                                       ,numTaxRoundTyp
                                       ,numTaxAmount3
                                       );
                  IF blnRet = FALSE THEN
                      RAISE excGetRound;
                  END IF;
--vc2RunChkComment := '●●●●通過 00460';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                  -- 税込金額計算
                  numAmountIncludeTax := numNetAmount + numTaxAmount1 + numTaxAmount2 + numTaxAmount3;
--vc2RunChkComment := '●●●●通過 00470';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
             -- 20090417 ADD START
                ELSE
                    -- 内税の場合
              -- 税額計算
              blnRet := FNCCALCTAXCALCAMTFD(UTL_FileHandle
                                       ,pvc2LogMode
                                       ,pvc2OutputMode
                                       ,pvc2UserId
                                       ,pvc2BusinessName
                                       ,pvc2PlantCd
                                       ,TAX_ID_TAXINTERNAL
                                       ,numTaxRate1
                                       ,numTaxRate2
                                       ,numTaxRate3
                                       ,numTaxRoundTyp
                                       ,numDecimalFig
                                       ,numNetAmount
                                       ,numTaxAmount1
                                       ,numTaxAmount2
               ,numTaxAmount3
                                       ,numWkTaxOutAmount
                                       ,numWkTaxAmount
                                       ,numAmountIncludeTax
                                       ,numWkExternalTaxSalesAmount
                                       ,numWkInternalTaxSalesAmount
                                       ,numWkTaxFreeSalesAmount
                                       ,numWkExternalTaxAmount
                                       ,numWkInternalTaxAmount
               ,vc2ErrorCd
               ,numStatus
                                   );
                  IF blnRet = FALSE THEN
                      blnWarning := TRUE;
                      vc2Comment := '(SBM0453)' || OrdWrnMsg_CalcTax  || BracketS || vc2PuchOdrCd || BracketE;
                      blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, vc2ErrorCd, vc2Comment);
                  END IF;
                END IF;
          -- 20090417 ADD END
                -- 邦貨換算
                numRateJudgeDate := dtmPrdDueDate;
                blnRet := fncCurrencyConvert(UTL_FileHandle                  -- (i)ファイルハンドル
                                            ,pvc2LogMode                     -- (i)ＬＯＧモード
                                            ,pvc2OutputMode                  -- (i)出力モード
                                            ,pvc2UserId                      -- (i)ユーザＩＤ
                                            ,pvc2BusinessName                -- (i)業務名
                                            ,pvc2PlantCd                     -- (i)工場コード
                                            ,vc2CompanyCd                    -- (i)会社コード
                                            ,vc2VendCd                       -- (i)取引先コード
                                            ,numRateJudgeDate                -- (i)レート判定日
                                            ,null                            -- (i)為替予約コード
                                            ,numAmountIncludeTax             -- (i)変換前金額
                                            ,1                               -- (i)変換方向
                                            ,numHomeCurAmount                -- (o)変換後金額
                                            ,numRoundTypCur                  -- (o)端数処理区分
                                            ,numExchRate                     -- (o)為替レート
                                            ,numExchTypCur                   -- (o)為替種別
                                            ,vc2VendCurCd                    -- (o)取引先通貨コード
                                            ,vc2VendCurName                  -- (o)取引先通貨名
                                            ,vc2VendCurSymbol                -- (o)取引先通貨記号
                                            ,vc2VendCurUnit                  -- (o)取引先通貨単位
                                            ,numVendDecimalFig               -- (o)取引先小数桁数
                                            ,vc2HomeCurCd                    -- (o)自社（邦貨）通貨コード
                                            ,vc2HomeCurName                  -- (o)自社（邦貨）通貨名
                                            ,vc2HomeCurSymbol                -- (o)自社（邦貨）通貨記号
                                            ,vc2HomeCurUnit                  -- (o)自社（邦貨）通貨単位
                                            ,numHomeDecimalFig               -- (o)自社（邦貨）小数桁数
                                            ,vc2ErrorCd                      -- (o)エラーコード
                                            );
                IF blnRet = FALSE THEN
                    blnWarning := TRUE;
                    vc2Comment :='(SBM0461)'  || OrdWrnMsg_CurrencyConvert || BracketS || vc2PuchOdrCd || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, vc2ErrorCd, vc2Comment);
                    numRateJudgeDate := null; -- レート判定日
                    numExchRate := 0;         -- 為替レート
                    numHomeCurAmount := 0;    -- 邦貨金額
                END IF;
/*------------------------------------------------------------
'　受け入れ保管区の既定値取得
-------------------------------------------------------------*/
blnRet := FNCGETDEFAULTRCVWH(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName,
                                pvc2PlantCd,    -- (i)工場コード
                                vc2ItemCd,      -- (i)品目番号
                                vc2WhCd);       -- (o)保管区コード
/*------------------------------------------------------------
'　所要量データが外作の場合
'　発注残にデータを追加する
'
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00480';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- 発注残にデータ追加
                INSERT INTO T_RLSD_PUCH_ODR(
                     PUCH_ODR_CD
                    ,ITEM_CD
                    ,WH_CD
                    ,NON_NO_ITEM_NAME
                    ,NON_NO_ITEM_TYP
                    ,COMPANY_CD
                    ,VEND_CD
                    ,PLANT_CD
                    ,PUCH_ODR_PERSON
                    ,PUCH_ODR_START_DATE
                    ,PUCH_ODR_DLV_DATE
                    ,PUCH_ODR_QTY
                    ,NON_NO_ITEM_PUCH_ODR_UNIT
                    ,UNIT_COST_TYP
                    ,UNIT_COST
                    ,PROCESSING_COST
                    ,MATERIAL_COST
                    ,OTHER_OVERHEADS
                    ,DISC_AMOUNT
                    ,PUCH_ODR_AMOUNT
                    ,PUCH_ODR_GNR_TYP
                    ,PUCH_ODR_INST_DATE
                    ,PUCH_ODR_INST_SLIP_ISS_FLG
                    ,PUCH_ODR_SLIP_ISS_DATE
                    ,ACPT_CMPLT_DATE
                    ,PUCH_ODR_STS_TYP
                    ,INSPC_CMPLT_FLG
                    ,INSPC_CMPLT_DATE
                    ,CONFIRM_DLV_DATE
                    ,SPL_ITEM_TYP
                    ,ACPT_INSPC_TYP
                    ,INV_CTRL_FLG
                    ,WORK_ODR_CD
                    ,WORK_IN_PROC_CD
                    ,OD_NO
                    ,PUCH_ODR_COMMENT
                    ,ODR_CD
                    ,DETAIL_NO
                    ,RATE_JUDGE_DATE
                    ,EXCH_RATE
                    ,TAX_RATE_1
                    ,TAX_RATE_2
                    ,TAX_RATE_3
                    ,NET_AMOUNT
                    ,TAX_AMOUNT_1
                    ,TAX_AMOUNT_2
                    ,TAX_AMOUNT_3
                    ,AMOUNT_INCLUDE_TAX
                    ,HOME_CUR_AMOUNT
                    ,TAX_CD
                    ,TAX_ROUND_TYP
                    ,NON_NO_ITEM_FLG
                    ,PUCH_ODR_EDI_ISS_FLG
                    ,PUCH_ODR_EDI_ISS_DATE
                    ,PUCH_ODR_FAX_ISS_FLG
                    ,PUCH_ODR_FAX_ISS_DATE
                    ,PUCH_ODR_MAIL_ISS_FLG
                    ,PUCH_ODR_MAIL_ISS_DATE
                    ,CREATED_DATE
                    ,CREATED_BY
                    ,CREATED_PRG_NM
                    ,UPDATED_DATE
                    ,UPDATED_BY
                    ,UPDATED_PRG_NM
                    ,MODIFY_COUNT
                    ) VALUES (
                     vc2PuchOdrCd               --発注番号
                    ,vc2ItemCd                  --発注品目番号
                    ,vc2WhCd                    --受入場所コード
                    ,NULL                       --備品発注品目名
                    ,NON_NO_ITEM_TYP_OFF        --備品発注製品区分（0:在庫管理をする）
                    ,vc2CompanyCd               --会社コード
                    ,vc2VendCd                  --取引先コード
                    ,pvc2PlantCd                --工場コード
                    ,vc2OwnPersonCd             --発注担当者
                    ,dtmPrdStartDate            --発注着手日
                    ,dtmPrdDueDate              --発注納期
                    ,numOdrQty                  --発注数
                    ,NULL                       --備品発注単位
                    ,numPuchUnitCostTyp         --単価区分
                    ,numUnitCost                --単価
                    ,numProcessingCost          --加工費
                    ,numMaterialCost            --材料費
                    ,numOtherOverheads          --その他経費
                    ,0                          --値引金額
                    ,numPuchOdrAmount           --発注金額
                    ,PUCH_ODR_GNR_TYP_MRP       --発注発生処理区分
                    ,NULL                       --発注指示日
                    ,PUCH_ODR_LST_NOISSUE       --発注伝票発行済フラグ
                    ,NULL                       --発注伝票発行日
                    ,NULL                       --受入完了日
                    ,PUCH_ODR_STS_NOINSTRUCT    --発注状態区分
                    ,INSPEC_FLG_NOTEND          --検査完了フラグ
                    ,NULL                       --検査完了日
                    ,NULL                       --回答納期
                    ,numSplItemTyp              --受給品区分
                    ,numAcptInspcTyp            --発注時受入検査区分
                    ,INV_CTL_FLG_ON             --在庫管理フラグ
                    ,NULL                       --作業計画番号
                    ,NULL                       --仕掛作業コード
                    ,vc2OdNo                    --オーダデマンド番号
                    ,NULL                       --発注備考
                    ,NULL                       --注文番号
                    ,0                          --明細番号
                    ,numRateJudgeDate           --レート判定日
                    ,numExchRate                --為替レート
                    ,numTaxRate1                --税率１
                    ,numTaxRate2                --税率２
                    ,numTaxRate3                --税率３
                    ,numNetAmount               --本体金額
                    ,numTaxAmount1              --税額１
                    ,numTaxAmount2              --税額２
                    ,numTaxAmount3              --税額３
                    ,numAmountIncludeTax        --税込金額
                    ,numHomeCurAmount           --邦貨金額
                    ,vc2TaxCd                   --税コード
                    ,numTaxRoundTyp             --税端数区分
                    ,NON_NO_ITEM_FLG_OFF        --備品発注フラグ(0:備品以外（通常仕入品）)
                    ,PUCH_ODR_EDI_NOISSUE       --ＥＤＩデータ出力済フラグ(0:未出力)
                    ,NULL                       --ＥＤＩデータ出力日
                    ,PUCH_ODR_FAX_NOISSUE       --ＦＡＸデータ出力済フラグ(0:未出力)
                    ,NULL                       --ＦＡＸデータ出力日
                    ,PUCH_ODR_MAIL_NOISSUE      --ＭＡＩＬデータ出力済フラグ(0:未出力)
                    ,NULL                       --ＭＡＩＬデータ出力日
                    ,SYSDATE                    --ｓｙｓ作成日時
                    ,pvc2UserId                 --ｓｙｓ作成者コード
                    ,MY_SQL_NAME                --作成プログラム名
                    ,SYSDATE                    --ｓｙｓ最新更新日時
                    ,pvc2UserId                 --ｓｙｓ最新更新者コード
                    ,MY_SQL_NAME                --更新プログラム名
                    ,FIRST_MODIFY_COUNT         --更新数
                    );
            END IF;         --所要量データ内外作の分岐ＩＦ文に対するＥＮＤ＿ＩＦ
/*------------------------------------------------------------
'　当該所要量データを１件分更新する
'　オーダ状態を確定とする
'　オーダ発効済みフラグをＯＮ
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00490';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- 所要量更新
            UPDATE T_OD SET
                    ODR_STS_TYP = ODR_STS_RELEASE
                   ,ODR_RELEASE_FLG = ODR_RELEASE_EFFRCT
                   ,UPDATED_DATE = SYSDATE
                   ,UPDATED_BY = pvc2UserId
                   ,UPDATED_PRG_NM = MY_SQL_NAME
                   ,MODIFY_COUNT = MODIFY_COUNT + 1
                WHERE   OD_NO = vc2OdNo;
/*------------------------------------------------------------
'　所要量データ１件分の下位デマンドを複数更新する
'　オーダ状態を確定とする
'　オーダ発効済みフラグをＯＮ
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00500';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- 下位品目更新
            FOR curT_OD_CHILD_REC IN curT_OD_CHILD(vc2OdNo) LOOP
          
                IF curT_OD_CHILD_REC.OD_TYP = OD_TYP_ASSIMILATE THEN
--vc2RunChkComment := '●●●●通過 00510';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- オーダデマンド区分＝疑似
                    numDmStsTyp := DM_STS_COMPLETE;
                    numOdrStsTyp := ODR_STS_COMPLETE;
                ELSE
--vc2RunChkComment := '●●●●通過 00520';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- オーダデマンド区分≠疑似
                    numDmStsTyp := DM_STS_RELEASE;
                    numOdrStsTyp := curT_OD_CHILD_REC.ODR_STS_TYP;
                END IF;
--vc2RunChkComment := '●●●●通過 00530';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                UPDATE T_OD SET
                        DM_STS_TYP = numDmStsTyp
                       ,ODR_STS_TYP = numOdrStsTyp
                       ,UPDATED_DATE = SYSDATE
                       ,UPDATED_BY = pvc2UserId
                       ,UPDATED_PRG_NM = MY_SQL_NAME
                       ,MODIFY_COUNT = MODIFY_COUNT + 1
                    WHERE CURRENT OF curT_OD_CHILD;
--vc2RunChkComment := '●●●●通過 00540';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- オーダデマンド区分＝疑似の場合さらに下位に更新
                IF curT_OD_CHILD_REC.OD_TYP = OD_TYP_ASSIMILATE THEN
--vc2RunChkComment := '●●●●通過 00550';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--                    UPDATE T_OD SET
--                            DM_STS_TYP = DM_STS_RELEASE
--                           ,UPDATED_DATE = SYSDATE
--                           ,UPDATED_BY = pvc2UserId
--                           ,UPDATED_PRG_NM = MY_SQL_NAME
--                           ,MODIFY_COUNT = MODIFY_COUNT + 1
--                        WHERE   PARENT_OD_NO = curT_OD_CHILD_REC.OD_NO;
-- 2008/09/16 ADD START 土田
                    UPDATE T_OD SET
                            DM_STS_TYP = DM_STS_RELEASE
                           ,UPDATED_DATE = SYSDATE
                           ,UPDATED_BY = pvc2UserId
                           ,UPDATED_PRG_NM = MY_SQL_NAME
                           ,MODIFY_COUNT = MODIFY_COUNT + 1
                        WHERE   PARENT_OD_NO = curT_OD_CHILD_REC.OD_NO
                        AND     DM_STS_TYP != DM_STS_COMPLETE;
-- 2008/09/16 ADD END 土田
                END IF;
            END LOOP;
/*------------------------------------------------------------
'　所要量データが製番タイプであった場合、製番計画を更新する
'　立案品目オーダ：自品目確定済みとする
'　下位品目オーダ：下位品目確定済みとする
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00560';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- 製番が設定されている場合、製番計画の更新
            IF NOT (vc2JobOdrCd IS NULL) THEN
--vc2RunChkComment := '●●●●通過 00570';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF vc2ParentOdNo IS NULL THEN
                    numJobOdrStsTyp := JOB_ODR_STS_SELFDETERM;
                ELSE
                    numJobOdrStsTyp := JOB_ODR_STS_SUBDETERM;
                END IF;
--vc2RunChkComment := '●●●●通過 00580';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                UPDATE T_JOB_ODR SET
                        JOB_ODR_STS_TYP = numJobOdrStsTyp
                       ,UPDATED_DATE = SYSDATE
                       ,UPDATED_BY = pvc2UserId
                       ,UPDATED_PRG_NM = MY_SQL_NAME
                       ,MODIFY_COUNT = MODIFY_COUNT + 1
                    WHERE   JOB_ODR_CD = vc2JobOdrCd
                      AND   JOB_ODR_DETAIL_NO = numJobOdrDetailNo
                      AND   JOB_ODR_CANCEL_NO = numJobOdrCancelNo
                      AND   JOB_ODR_STS_TYP <> JOB_ODR_STS_SELFDETERM
                      AND   JOB_ODR_STS_TYP <> JOB_ODR_STS_DETERM;
            END IF;
            -- コミット
            COMMIT;
--vc2RunChkComment := '●●●●通過 00590';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- 処理件数カウント
            IF blnWarning = FALSE THEN
                numDoneCnt := numDoneCnt + 1;
            ELSE
                numWarCnt := numWarCnt + 1;
            END IF;
        -- 所要量データ１件分に対する処理に対してのＥＸＣＰＴＩＯＮ
        EXCEPTION
            WHEN excGetNewOdrCd  THEN    --作業計画番号取得エラー
--vc2RunChkComment := '●●●●通過 00600';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_ODR_CD, '');
                COMMIT;
            WHEN excGetNewInstCd THEN    --作業指示番号取得エラー
--vc2RunChkComment := '●●●●通過 00610';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_OPR_INST_CD, '');
                COMMIT;
            WHEN excGetNewPuchCd THEN    --発注番号取得エラー
--vc2RunChkComment := '●●●●通過 00620';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_PUCH_ODR_CD, '');
                COMMIT;
            WHEN excGetVend      THEN    --取引先取得エラー
--vc2RunChkComment := '●●●●通過 00630';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment := '(SBM0462)'  || OrdWrnMsg_VendCd || BracketS || vc2VendCd || BracketE;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_M_VEND_CTRL, vc2Comment);
                COMMIT;
            WHEN excGetCur       THEN    --通貨取得エラー
--vc2RunChkComment := '●●●●通過 00635';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment := '(SBM0463)'  || OrdWrnMsg_CurCd || BracketS || vc2CurCd || BracketE;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_M_CUR, vc2Comment);
                COMMIT;
            WHEN excGetTax       THEN    --消費税取得エラー
--vc2RunChkComment := '●●●●通過 00640';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment :='(SBM0464)'  ||  OrdWrnMsg_TaxCd || BracketS || vc2TaxCd || BracketE;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_DATA, vc2Comment);
                COMMIT;
            WHEN excGetRound     THEN    --端数処理エラー
--vc2RunChkComment := '●●●●通過 00650';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment := OrdWrnMsg_Round;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
                COMMIT;
            WHEN excJobOdrDel    THEN    --引当元製番が削除対象エラー
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                IF numJobOdrCHK != 1 THEN
                    vc2Comment := '(SBM1699)'  ||  LOGMSG_APS_COM_JOB_ODR || BracketS || vc2JobOdrCdChk || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_JOB_ODR_DEL_FLG, vc2Comment);
                END IF;
                COMMIT;
            WHEN excJobOdrExp    THEN    --引当元製番計画が変更エラー
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                IF numJobOdrCHK != 1 THEN
                    vc2Comment := '(SBM1699)'  ||  LOGMSG_APS_COM_JOB_ODR || BracketS || vc2JobOdrCdChk || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_JOB_ODR_EXP_TYP, vc2Comment);
                END IF;
                COMMIT;
            WHEN excJobOdrExp1   THEN    --引当元製番基本情報が変更エラー
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                IF numJobOdrCHK != 1 THEN
                    vc2Comment := '(SBM1699)'  ||  LOGMSG_APS_COM_JOB_ODR || BracketS || vc2JobOdrCdChk || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_JOB_ODR_EXP_TYP1, vc2Comment);
                END IF;
                COMMIT;
            WHEN OTHERS THEN
--vc2RunChkComment := '●●●●通過 00660';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment := SUBSTR(SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                                     1,256);
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
                COMMIT;
        END;
        ELSE
--vc2RunChkComment := '●●●●通過 00670';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- 全行処理により処理終了
            EXIT;
        END IF;
/*------------------------------------------------------------
'　所要量テーブルのカーソル終了
'　所要量テーブルの行フェッチ（抽出件数分のMain/Loopの終了処理）
'
-------------------------------------------------------------*/
    END LOOP;
    -- カーソルクローズ
    DBMS_SQL.CLOSE_CURSOR(intOdrCursorName);
/*------------------------------------------------------------
'　オーダ発効実行制御の更新処理
'　入力パラメータを履歴欄の更新する
'　未登録時：登録
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00680';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- オーダ発効実行制御のチェック
    BEGIN
        SELECT COUNT(*) INTO numDataCount
            FROM SYS_ODRELEASE_CTRL
            WHERE PLANT_CD = pvc2PlantCd
              AND MANAGEMENT_TYP = pvc2ManagementTyp;
        IF NOT(pvc2JobOdrDetailNo IS NULL) THEN
            numJobOdrDetailNo := TO_NUMBER(pvc2JobOdrDetailNo);
        ELSE
            numJobOdrDetailNo := 0;
        END IF;
        IF numDataCount > 0 THEN
--vc2RunChkComment := '●●●●通過 00690';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            UPDATE SYS_ODRELEASE_CTRL SET
                 L_OUTSIDE_TYP = TO_NUMBER(pvc2OutsideTyp)
                ,L_JOB_ODR_CD = pvc2JobOdrCd
                ,L_JOB_ODR_DETAIL_NO = numJobOdrDetailNo
                ,L_ENTRY_1_TYP = TO_NUMBER(pvc2Entry1Typ)
                ,L_ENTRY_2_TYP = TO_NUMBER(pvc2Entry2Typ)
                ,L_ENTRY_DATE = pvc2EntryDate
                ,UPDATED_DATE = SYSDATE
                ,UPDATED_BY = pvc2UserId
                ,UPDATED_PRG_NM = MY_SQL_NAME
                ,MODIFY_COUNT = MODIFY_COUNT + 1
            WHERE   PLANT_CD = pvc2PlantCd
              AND   MANAGEMENT_TYP = pvc2ManagementTyp;
        ELSE
--vc2RunChkComment := '●●●●通過 00700';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            INSERT INTO SYS_ODRELEASE_CTRL (
                 PLANT_CD
                ,MANAGEMENT_TYP
                ,BATCH_PROCESSING_TYP
                ,OUTSIDE_TYP
                ,JOB_ODR_CD
                ,JOB_ODR_DETAIL_NO
                ,ENTRY_1_TYP
                ,ENTRY_2_TYP
                ,ENTRY_DATE
                ,L_OUTSIDE_TYP
                ,L_JOB_ODR_CD
                ,L_JOB_ODR_DETAIL_NO
                ,L_ENTRY_1_TYP
                ,L_ENTRY_2_TYP
                ,L_ENTRY_DATE
                ,CREATED_DATE
                ,CREATED_BY
                ,CREATED_PRG_NM
                ,UPDATED_DATE
                ,UPDATED_BY
                ,UPDATED_PRG_NM
                ,MODIFY_COUNT
                ) VALUES (
                pvc2PlantCd                     --工場コード
                ,TO_NUMBER(pvc2ManagementTyp)   --管理区分（1：ＭＲＰ、2：製番）
                ,2                              --バッチ処理区分(1：自動運転する、2：自動運転しない)
                ,NULL                           --内外作区分
                ,NULL                           --製番
                ,0                              --製番枝番
                ,NULL                           --エントリ区分１
                ,NULL                           --エントリ区分２
                ,NULL                           --エントリ日付
                ,TO_NUMBER(pvc2OutsideTyp)      --内外作区分（実行記録用）
                ,pvc2JobOdrCd                   --製番（実行記録用）
                ,numJobOdrDetailNo              --製番枝番（実行記録用）
                ,TO_NUMBER(pvc2Entry1Typ)       --エントリ区分１（実行記録用）
                ,TO_NUMBER(pvc2Entry2Typ)       --エントリ区分２（実行記録用）
                ,pvc2EntryDate                  --エントリ日付（実行記録用）
                ,SYSDATE                        --ｓｙｓ作成日時
                ,pvc2UserId                     --ｓｙｓ作成者コード
                ,MY_SQL_NAME                    --作成プログラム名
                ,SYSDATE                        --ｓｙｓ最新更新日時
                ,pvc2UserId                     --ｓｙｓ最新更新者コード
                ,MY_SQL_NAME                    --更新プログラム名
                ,FIRST_MODIFY_COUNT             --更新数
                );
        END IF;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE;
    END;
    -- コミット(オーダ発効実行制御データのみ)
    COMMIT;
--vc2RunChkComment := '●●●●通過 00710';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- 終了メッセージの作成
    vc2Comment := OrdEndMsg;
    vc2Comment := vc2Comment || OrdEndMsg_TgtCnt || BracketS || numTgtCnt || BracketE || Comma;
    vc2Comment := vc2Comment || OrdEndMsg_DoneCnt || BracketS || numDoneCnt || BracketE || Comma;
    vc2Comment := vc2Comment || OrdEndMsg_WarCnt || BracketS || numWarCnt || BracketE || Comma;
    vc2Comment := vc2Comment || OrdEndMsg_fatalCnt || BracketS || numFatalCnt || BracketE;
    IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
      vc2Comment :='(SBM0466)' || vc2Comment;
    ELSE
      vc2Comment :='(SBM0467)' || vc2Comment;
    END IF;
    vc2Comment := SUBSTR(vc2Comment,1,256);
    -- 終了メッセージの出力
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
    -- コミット
    COMMIT;
    /* LogFile の CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
/*------------------------------------------------------------
'　強制終了（異常終了）となるEXCEPTION
'
'
-------------------------------------------------------------*/
EXCEPTION
    WHEN excMistakeCommonParam  THEN    --共通の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excMistakeCommonParam');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：共通の入力パラメータが誤っています',
                             1,256);
    IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0364)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0365)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_COMMON_PARAM, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                           MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excMistakeNativeParam  THEN    --固有の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：固有の入力パラメータが誤っています',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM1700)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0386)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_NATIVE_PARAM, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excOdCalc_Ing  THEN    --所要量計算実行中
--DBMS_OUTPUT.PUT_LINE('excOdCalc_Ing');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：所要量計算実行中です',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN  
       vc2Comment :='(SBM0682)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0683)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OD_CALC_ING, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excOdMnt_Ing  THEN    --所要量メンテナンス中
--DBMS_OUTPUT.PUT_LINE('excOdMnt_Ing');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：所要量メンテナンス実行中です',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0599)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0665)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OD_MNT_ING, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excGetOdCtrl  THEN    --所要量計算制御取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetOdCtrl');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：所要量計算制御取得エラー',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0666)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0667)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_OD_CALC, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excJobOdCalc_Ing  THEN    --所要量計算(製番)実行中
--DBMS_OUTPUT.PUT_LINE('excOdCalc_Ing');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：所要量計算(製番)実行中です',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0668)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0669)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_JOB_OD_CALC_ING, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excJobOdMnt_Ing  THEN    --所要量メンテナンス(製番)中
--DBMS_OUTPUT.PUT_LINE('excOdMnt_Ing');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：所要量メンテナンス(製番)実行中です',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0670)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0671)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OD_MNT_ING, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excGetJobOdCtrl  THEN    --所要量計算制御取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetOdCtrl');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：所要量計算制御(製番)取得エラー',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0672)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0673)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_JOB_OD_CALC, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excGetMyCompany  THEN    --自社取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetMyCompany');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：自社取得エラー',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0674)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0675)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_MY_COMPANY, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excGetPlant  THEN    --工場取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetPlant');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：工場取得エラー',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0676)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0677)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_PLANT, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excPlantWhCd_Null  THEN    --所要量対象保管区の取得エラー
--DBMS_OUTPUT.PUT_LINE('excPlantWhCd_Null');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：所要量対象保管区の取得エラー',
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0678)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0679)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MRP_TARGET_NOTFOUND, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        vc2Comment := SUBSTR(OrdEndMsg || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);
        IF pvc2ManagementTyp = MANAGEMENT_TYP_1 THEN
       vc2Comment :='(SBM0680)' || vc2Comment;
    ELSE
       vc2Comment :='(SBM0681)' || vc2Comment;
    END IF;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
END;
/
