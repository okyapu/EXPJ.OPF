CREATE OR REPLACE PROCEDURE SQLOPRINST(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation.
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlOprInst.sql,v $
'$Author: geng-jia $
'$Revision: 1.12 $ $Date: 2015/07/09 05:16:05 $
'
' 修正履歴
' 2005.01.20 ・[発注残]."受入場所"に登録する内容を変更。
'              ｢デフォルト受け入れ保管区取得処理｣で取得した保管区コード
' 2005.10.24 unicode対応（varchar2を4倍）
'
' 機能      : 作業指示確定（多通貨対応）
'
' 戻り値    :
'
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputName       - (i)出力ファイルパス
'             pvc2OutputPath       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2PlantCd          - (i)工場コード
'             pvc2BusinessName     - (i)業務名
'
'             pvc2OprInstStartDate - (i)着手日
'             pvc2WorkOdrDlvDate   - (i)納期
'             pvc2JobOdrCd         - (i)製番
'             pvc2ItemCd           - (i)品目番号
'             pvc2WsCd             - (i)作業区コード
'             pvc2OprRsltTyp       - (i)作業実績区分
'             pvc2OutSideTyp       - (i)作業指示計画（内作）
'             pvc2OutSideTyp2      - (i)作業指示計画（外作）
'             pvc2VendCd           - (i)取引先コード
'
' 機能説明  : 品目単位の作業計画データの確定を行う。
'             この処理にてオーダのメンテナンスは不可となり、実績入力が可能となる。
'             情報をもとに作成する。
'
' 備考      :
'
------------------------------------------------------------------------------*/

--< プロシージャ名定義 >-----------------------------------------------------
    pvc2LogMode             VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode          VARCHAR2    --出力モード
   ,pvc2OutputPath          VARCHAR2    --出力ファイルパス
   ,pvc2OutputName          VARCHAR2    --出力ファイル名
   ,pvc2UserId              VARCHAR2    --ユーザ名
   ,pvc2PlantCd             VARCHAR2    --工場コード
   ,pvc2BusinessName        VARCHAR2    --業務名
   ,pvc2OprInstStartDate    VARCHAR2    --着手日
   ,pvc2WorkOdrDlvDate      VARCHAR2    --納期
   ,pvc2JobOdrCd            VARCHAR2    --製番
   ,pvc2ItemCd              VARCHAR2    --品目番号
   ,pvc2WsCd                VARCHAR2    --作業区コード
   ,pvc2OprRsltTyp          VARCHAR2    --作業実績区分
   ,pvc2OutSideTyp          VARCHAR2    --作業指示計画（内作）
   ,pvc2OutSideTyp2         VARCHAR2    --作業指示計画（外作）
   ,pvc2VendCd              VARCHAR2    --取引先コード
)
IS

    /* 定数の宣言 */

    WORK_STS_TYP_NOINSTRACT NUMBER  := 1;   --品目別作業状態区分　未展開
    WORK_STS_TYP_INSTRACT   NUMBER  := 2;   --品目別作業状態区分  指示済
    OPR_RSLT_TYP_TURNOVER   NUMBER  := 1;   --品目別作業実績区分　出来高
    OPR_RSLT_TYP_ITEM       NUMBER  := 2;   --品目別作業実績区分　作業指示
    PROCESS_NOEXPAND        NUMBER  := 0;   --作業系列展開フラグ  未展開
    OUTSIDE_TYP_INNER_MAKE  NUMBER  := 1;   --内外作区分　内作
    OUTSIDE_TYP_BUY         NUMBER  := 2;   --内外作区分　外作
    OPR_RSLT_TYP_ROUTING    NUMBER  := 2;   --作業系列別仕掛-作業系列別作業実績区分(2:手順番号単位に実績収集)
    ROUTING_EXPAND_NOEXPAND NUMBER  := 0;   --作業系列別仕掛-手順展開済みフラグ(0:未展開)
    TAX_APPLY_TYP_M_ITEM    NUMBER  := 1;   --取引先の消費税適用区分(1:品目マスタの消費税コード)
    TAX_APPLY_TYP_M_VEND    NUMBER  := 2;   --取引先の消費税適用区分(2:取引先マスタの消費税コード)
    TAXABLE_TYP_OUT         NUMBER  := 1;   --消費税区分の消費税コード下１桁 税込税抜き区分(1:税抜き)
    ROUND_TYP_NORMAL        NUMBER  := 1;   --取引先の発注金額丸め区分(1:四捨五入)
    ROUND_TYP_CUTUP         NUMBER  := 2;   --取引先の発注金額丸め区分(2:切り上げ)
    ROUND_TYP_CUTDOWN       NUMBER  := 3;   --取引先の発注金額丸め区分(3:切り捨て)
    ROUND_COEFFICIENT       NUMBER  := 0.5; --端数処理係数 四捨五入
    CUTUP_COEFFICIENT       NUMBER  := 0.9; --端数処理係数 切上げ
    CUTDOWN_COEFFICIENT     NUMBER  := 0;   --端数処理係数 切り捨て

    CTRL_CD_DEFAULT                 VARCHAR2(24)     := 'SYSTEM';    --コントロール系テーブルのPrimaryKeyの値
    COMPANY_CD_DEFAULT              VARCHAR2(8)     := '00';        --会社コードのデフォルト値
    METHOD_START                    VARCHAR2(20)     := 'Start';     --ログ用メソッド開始宣言
    METHOD_END                      VARCHAR2(12)     := 'End';       --ログ用メソッド終了宣言
    MY_SQL_NAME                     VARCHAR2(80)    := 'SQLOPRINST';--ＰＬ／ＳＱＬ名

    LOGMSG_START_PRGNAME_OPRINST    VARCHAR2(104)    := '(SBM0494)<< 作業指示確定処理開始 >>';
    LOGMSG_END_PRGNAME_OPRINST      VARCHAR2(104)    := '<< 作業指示確定処理終了 >>';

    --エラー№
    APS_COM_BATCH_START             VARCHAR2(28)     := 'ZZ09001';   --バッチ処理を開始しました
    APS_COM_BATCH_END               VARCHAR2(28)     := 'ZZ09002';   --バッチ処理を終了しました
    APS_NOTENTRY_VEND_CD            VARCHAR2(28)     := 'AD30037';   --取引先コードが未入力です
    APS_NOTENTRY_WS_CD              VARCHAR2(28)     := 'AD30041';   --作業区コードが未入力です
    APS_NOTENTRY_M_WS_WS_CD         VARCHAR2(28)     := 'AD00011';   --最初の内作工程に作業区コードが設定されていません
    APS_NOTENTRY_M_WS_PLANT_CD      VARCHAR2(28)     := 'AD00012';   --最初の内作工程に指定されている作業区情報の工場コードが一致しません
    APS_NOTENTRY_M_WS_WH_CD         VARCHAR2(28)     := 'AD00013';   --最初の内作工程に指定されている作業区情報に、保管区コードが設定されていません
    APS_NOTENTRY_M_WS_PLANT_CD2     VARCHAR2(28)     := 'AD00014';   --最初の内作工程の作業区コードに対応する保管区の工場コードが一致しません
    APS_NOTENTRY_M_WS_WH_CD2        VARCHAR2(28)     := 'AD00018';   --最初の内作工程の作業区コードに対応する保管区が存在しません
    APS_NOTENTRY_EXCH_TYP           VARCHAR2(28)     := 'AD00098';   --為替種別が2のため、邦貨金額に0を設定しました。
    APS_NOTENTRY_EXCH_RATE          VARCHAR2(28)     := 'ZZ02024';   --［為替レートマスタ］が存在しない
    APS_NOTENTRY_WH_CD              VARCHAR2(28)     := 'AD00104';   --[工場]."代表納入場所コード"が存在しない

    /* 取引先情報取得カーソル */
    CURSOR CurMVendCtrl(cvc2CompanyCd VARCHAR2,cvc2VendCd VARCHAR2) IS
    Select
    OWN_PERSON_NAME,   --自社担当者名
    ROUND_TYP,         --発注金額丸め区分
    TAX_CD,            --消費税コード
    TAX_APPLY_TYP,     --消費税適用区分
    CUR_CD,            --取引通貨コード
    EXCH_TYP           --為替種別
    From M_VEND_CTRL
    Where COMPANY_CD = cvc2CompanyCd
    And VEND_CD = cvc2VendCd;

    /* 小数桁数取得カーソル */
    CURSOR CurDecimalFig(cvc2CurCd VARCHAR2) IS
    SELECT DECIMAL_FIG --小数桁数
    FROM M_CUR
    WHERE CUR_CD = cvc2CurCd;

    /* 邦貨取得カーソル */
    CURSOR CurSysHomeCur IS
    Select
    HOME_CUR_CD        --邦貨コード
    From SYS_HOME_CUR
    Where CTRL_CD = CTRL_CD_DEFAULT;

    /* 作業コード存在チェックカーソル */
    CURSOR CurCount(vc2WsCd VARCHAR2) IS
    SELECT COUNT(*)
    FROM M_WS A
    WHERE vc2WsCd = A.WS_CD;

    /* 作業コード存在チェックカーソル */
    CURSOR CurWhCd(vc2WsCd VARCHAR2) IS
    SELECT A.WH_CD
    FROM M_WS A
    WHERE vc2WsCd = A.WS_CD;

    /* 作業区の作業コード取得カーソル */
    CURSOR CurPlantCd(vc2WsCd VARCHAR2) IS
    SELECT PLANT_CD
    FROM M_WS A
    WHERE vc2WsCd = A.WS_CD;

    /* 保管区の保管区コード取得カーソル */
    CURSOR CurM_Wh_WhCd(vc2WhCd VARCHAR2) IS
    SELECT COUNT(*)
    FROM M_WH A
    WHERE vc2WhCd = A.WH_CD;

    /* 保管区コードの存在チェックカーソル */
    CURSOR CurM_Wh_PlantCd(vc2M_WS_PlantCd VARCHAR2,vc2WhCd VARCHAR2) IS
    SELECT COUNT(*)
    FROM M_WH A
    WHERE vc2WhCd = A.WH_CD
    AND   vc2M_WS_PlantCd = A.PLANT_CD;

    /* 保管区コード検索カーソル */
    CURSOR CurM_Wh_PlantCd_Select(vc2WhCd VARCHAR2) IS
    SELECT PLANT_CD
    FROM M_WH A
    WHERE vc2WhCd = A.WH_CD ;

    /* 作業指示実績カーソル */
    CURSOR CurWorkOdrCd(vc2WorkOdrCd VARCHAR2) IS
    Select NVL(A.PROC_NO,-1) AS PROC_NO,
           A.WS_CD
    From   T_WORK_IN_PROC_BY_PROC A
         , T_WORK_IN_PROC_BY_ITEM C
    Where  OPR_RSLT_TYP=2
    And    A.WORK_ODR_CD = C.WORK_ODR_CD
    And    A.WORK_ODR_CD = vc2WorkOdrCd
    And    A.OUTSIDE_TYP=1
    And    A.PROC_NO =(Select MIN(B.PROC_NO)
                       From   T_WORK_IN_PROC_BY_PROC B
                       Where  B.WORK_ODR_CD=vc2WorkOdrCd
                       And    B.OUTSIDE_TYP=1);

    /* 出庫指示処理カーソル */
    --CURSOR CurT_ISSUE_INST(vc2WorkOdrCd VARCHAR2) IS
    --Select A.PROC_NO
    --From   T_WORK_IN_PROC_BY_PROC A
    --Where  A.PROC_NO = (Select MIN(B.PROC_NO)
                        --From T_WORK_IN_PROC_BY_PROC B
                        --Where B.WORK_ODR_CD=vc2WorkOdrCd);

    /* 作業区カーソル */
    CURSOR CurWsCd(WsCd VARCHAR2) IS
    Select COUNT(*)
    From M_WS A
    Where WsCd = A.WS_CD;

    /* 作業区.工場コードカーソル */
    CURSOR CurWsCdPlantCd(PlantCd VARCHAR2) IS
    Select COUNT(*)
    From M_WS A
    Where PlantCd = A.PLANT_CD;

    /* 保管区.保管コードの存在チェックカーソル */
    CURSOR CurMWhWhCd(WhCd VARCHAR2) IS
    Select COUNT(*)
    From M_WH A
    Where WhCd = A.WH_CD;

    /* 作業系列別仕掛取得カーソル */
    CURSOR CurT_WORK_IN_PROC_BY_PROC(cvc2WorkOdrCd VARCHAR2,cvc2WorkInProcCd VARCHAR2) IS
    SELECT
    T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD,         --作業計画番号
    T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD,     --仕掛作業コード
    T_WORK_IN_PROC_BY_PROC.OD_NO,               --
    T_WORK_IN_PROC_BY_PROC.ITEM_CD,             --品目番号
    T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,         --仕掛内外作区分(OutsideTyp)
    T_WORK_IN_PROC_BY_PROC.WS_CD,               --作業区コード(WsCd)
    T_WORK_IN_PROC_BY_PROC.COMPANY_CD,          --会社コード
    T_WORK_IN_PROC_BY_PROC.VEND_CD,             --取引先コード(VendCd)
    T_WORK_IN_PROC_BY_PROC.PLANT_CD,            --工場コード
    T_WORK_IN_PROC_BY_PROC.WORK_ODR_DLV_DATE,   --作業系列別製造納期(WorkOdrDlvDate)
    T_WORK_IN_PROC_BY_PROC.OPR_INST_START_DATE, --作業系列別着手日
    T_WORK_IN_PROC_BY_PROC.OPR_INST_QTY,        --作業指示数
    T_WORK_IN_PROC_BY_PROC.UNIT_COST_TYP,       --単価区分
    T_WORK_IN_PROC_BY_PROC.UNIT_COST,           --単価
    T_WORK_IN_PROC_BY_PROC.PROCESSING_COST,     --加工費
    T_WORK_IN_PROC_BY_PROC.MATERIAL_COST,       --材料費
    T_WORK_IN_PROC_BY_PROC.OTHER_OVERHEADS,     --その他の経費
    T_WORK_IN_PROC_BY_PROC.PUCH_ODR_AMOUNT,     --発注金額(PuchOdrAmount)
    T_WORK_IN_PROC_BY_PROC.DISC_AMOUNT,         --値引金額(DiscAmount)
    T_WORK_IN_PROC_BY_PROC.ACPT_INSPC_TYP,      --作業系列受入検査区分
    T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP,        --作業系列別作業状態区分(WorkStsTyp)
    T_WORK_IN_PROC_BY_PROC.OPR_INST_DATE,       --作業系列別作業指示日
    T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_COMMENT --
    FROM T_WORK_IN_PROC_BY_PROC
    WHERE T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD     = cvc2WorkOdrCd
    AND   T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = cvc2WorkInProcCd
    ORDER BY T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD ASC;

    /* 品目情報取得カーソル */
    CURSOR CurMItem(cvc2ItemCd VARCHAR2) IS
    Select
    SPL_ITEM_TYP,TAX_CD
    From M_ITEM
    Where ITEM_CD = cvc2ItemCd;

    /* 消費税区分マスタ取得カーソル */
    CURSOR CurMTax(cvc2TaxCd VARCHAR2) IS
    Select
    OLD_TAX_RATE_1,
    OLD_TAX_RATE_2,
    OLD_TAX_RATE_3,
    NEW_TAX_RATE_START_DATE,
    NEW_TAX_RATE_1,
    NEW_TAX_RATE_2,
    NEW_TAX_RATE_3,
    ROUND_TYP
    From M_TAX
    Where TAX_CD = cvc2TaxCd;

    /* 品目別仕掛取得カーソル */
    CURSOR CurTWorkInProcByItem(cvc2WorkOdrCd VARCHAR2) IS
    Select
    WORK_ODR_DLV_DATE
    From T_WORK_IN_PROC_BY_ITEM
    Where WORK_ODR_CD = cvc2WorkOdrCd;

    /* 変数の宣言 */

    UTL_FileHandle              UTL_FILE.FILE_TYPE; --ファイルハンドル

    intOprInstCursorName        INTEGER;        --所要量用カーソルＩＤ
    vc2Sql                      VARCHAR2(4096); --動的ＳＱＬ用
    vc2WorkOdrCd                VARCHAR2(100);   --作業計画番号
    vc2OdNo                     VARCHAR2(100);   --オーダデマンド番号
    numOprInstQty               NUMBER(18,4);   --作業指示数
    vc2ItemCd                   VARCHAR2(100);
    vc2WsCd                     VARCHAR2(100);
    dtmOprInstStartDate         DATE;
    numOprRsltTyp               NUMBER(2);
    numWorkStsTyp               NUMBER(2);
    numProcExplosionFlg         NUMBER(2);

    numWorkProcItemOprRsltTyp   NUMBER(2);
    numOutsideTyp               NUMBER(2);
    vc2VendCd                   VARCHAR2(100);
    numProcNo                   NUMBER(6,0);
    vc2PlantCd                  VARCHAR2(8);
    WsCdcount                   NUMBER(2);
    MWsPc                       VARCHAR2(8);
    WhCd                        VARCHAR2(100);
    WhCdCount                   NUMBER(2);
    PlantCd                     VARCHAR2(8);
    ProcNo                      NUMBER(6,0);
    WsCd                        VARCHAR2(100);
    countPlantCd                NUMBER(2);
    countWhCd                   NUMBER(2);
    vc2WorkInProcCd             VARCHAR2(100);
    M_WS_PlantCd                VARCHAR2(8);
    M_WS_WhCd                   VARCHAR2(100);
    M_WH_WhCd                   VARCHAR2(100);
    M_WH_PlantCd                VARCHAR2(8);
    M_WH_PlantCd_Select         VARCHAR2(8);
    vc2OprInstStartDate         VARCHAR2(40);
    vc2WorkOdrDlvDate           VARCHAR2(40);
    vc2JobOdrCd                 VARCHAR2(100);
    vc2OprRsltTyp               VARCHAR2(16);
    vc2OutSideTyp               VARCHAR2(16);
    vc2OutSideTyp2              VARCHAR2(16);
    vc2WorkOdrCdMaintenance     VARCHAR2(100);   --作業計画番号
    vc2PuchOdrCd                VARCHAR2(100);   --発注番号取得値
    dtmBusinessOprDate          DATE;

    rtpSysHomeCur               CurSysHomeCur%ROWTYPE;
    rtpDecimalFig               CurDecimalFig%ROWTYPE;
    rtpMVendCtrl                CurMVendCtrl%ROWTYPE;
    rtpTWorkInProcByProc        CurT_WORK_IN_PROC_BY_PROC%ROWTYPE;
    rtpMItem                    CurMItem%ROWTYPE;
    rtpMTax                     CurMTax%ROWTYPE;
    rtpWorkInProcByItem         CurTWorkInProcByItem%ROWTYPE;

    blnPBPEFLG                  BOOLEAN;
    numTransactionCount         NUMBER(10);     --処理件数
    vc2Comment                  VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    vc2RunChkComment            VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    vc2PuchOdrPerson            VARCHAR2(160);   --発注担当者
    numRoundTyp                 NUMBER(2);      --税端数区分
    numSplItemTyp               NUMBER(2);      --受給品区分
    numNetAmount                NUMBER(18,4);   --本体金額
    dtmJudgeDate                DATE;           --判定日
    vc2TaxCd                    VARCHAR2(100);   --税コード
    vc2ItemTaxCd                VARCHAR2(100);   --税コード(品目マスタ)
    vc2VendTaxCd                VARCHAR2(100);   --税コード(取引先マスタ)
    numTaxRate1                 NUMBER(18,4);   --税率１
    numTaxRate2                 NUMBER(18,4);   --税率２
    numTaxRate3                 NUMBER(18,4);   --税率３
    numTaxRoundTyp              NUMBER(2);      --税端数区分
    numTaxAmount1               NUMBER(18,4);   --税額１
    numTaxAmount2               NUMBER(18,4);   --税額２
    numTaxAmount3               NUMBER(18,4);   --税額３
    numHomeCurAmount            NUMBER(18,4);   --邦貨金額
    numAmountincludeTax         NUMBER(18,4);   --税込金額
    numTaxApplyTyp              NUMBER(2);      --消費税適用区分
    vc2CurCd                    VARCHAR2(100);   --通貨コード
    numExchTyp                  NUMBER(2);      --為替種別
    numDecimalFig               NUMBER(2);      --小数桁数(DecimalFig)
    numWkDecimal                NUMBER(12);     --小数桁係数
    numWkRound                  NUMBER(2,1);    --小数桁係数
    vc2HomeCurCd                VARCHAR2(100);   --邦貨コード
    numExchRate                 NUMBER(20,6);   --為替レート
    vc2MPlantWhCd               VARCHAR2(100);   --工場．代表納入場所コード
    blnRet                      BOOLEAN;
    intRet                      INTEGER;

    /* 邦貨換算部品パラメータ */
    pvc2CompanyCd               VARCHAR2(100) := Null;   --会社コード
    vc2VEND_CD                  VARCHAR2(100) := Null;   --取引先コード
    numAMOUNT_INCLUDE_TAX       NUMBER(18,4) := 0;      --税込金額
    pdtmRateJudgeDate           DATE         := Null;   --レート判定日
    pvc2ExchReserveCd           VARCHAR2(100) := Null;   --為替予約コード
    pnumConvertTyp              NUMBER(02)   := 0;      --変換方向(外貨→邦貨)
    pnumAfterAmount             NUMBER(18,4) := 0;      --変換後金額
    pnumRoundTyp                NUMBER(02)   := 0;      --端数処理区分
    pnumExchRate                NUMBER(20,6) := 0;      --為替レート
    pnumExchTyp                 NUMBER(02)   := 0;      --為替種別
    pvc2VendCurCd               VARCHAR2(100) := NULL;   --取引先通貨コード
    pvc2VendCurName             VARCHAR2(160) := NULL;   --取引先通貨名
    pvc2VendCurSymbol           VARCHAR2(100) := NULL;   --取引先通貨記号
    pvc2VendCurUnit             VARCHAR2(100) := NULL;   --取引先通貨単位
    pnumVendDecimalFig          NUMBER(02)   := 0;      --取引先小数桁数
    pvc2HomeCurCd               VARCHAR2(100) := NULL;   --自社（邦貨）通貨コード
    pvc2HomeCurName             VARCHAR2(160) := NULL;   --自社（邦貨）通貨名
    pvc2HomeCurSymbol           VARCHAR2(100) := NULL;   --自社（邦貨）通貨記号
    pvc2HomeCurUnit             VARCHAR2(100) := NULL;   --自社（邦貨）通貨単位
    pnumHomeDecimalFig          NUMBER(02)   := 0;      --自社（邦貨）小数桁数
    pvc2ErrorCd                 VARCHAR2(28) := NULL;   --エラーコード

    excERR_GET_BUSINESS_DATE        EXCEPTION;
    excNOTEXIST_PROC_BY_PROC        EXCEPTION;
    excNOTEXIST_PROC_BY_ROUTING     EXCEPTION;
    excERR_GET_NEW_PUCH_CD          EXCEPTION;
    excERR_M_VEND                   EXCEPTION;
    excERR_M_ITEM                   EXCEPTION;
    excGETROUND_ERR                 EXCEPTION;
    excISSUE_ERR                    EXCEPTION;
    excERR_T_WORK_IN_PROC_BY_ITEM   EXCEPTION;
    excERR_DEFAULT_RCV_WH           EXCEPTION;


--<メイン処理 >-----------------------------------------------------

BEGIN

    /* LogFile の OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /*トレースログ（start）*/
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

    /* 開始メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START, LOGMSG_START_PRGNAME_OPRINST);

    COMMIT;

    /* 業務日付取得 */
    blnRet := FNCGETBUSINESSDATE(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd, dtmBusinessOprDate);

    /* 着手日が指定されている場合 */
    IF pvc2OprInstStartDate = 'null' THEN
        vc2OprInstStartDate := '';
    ELSE
        vc2OprInstStartDate := pvc2OprInstStartDate;
    END IF;

    /* 納期が指定されている場合 */
    IF pvc2WorkOdrDlvDate = 'null' THEN
        vc2WorkOdrDlvDate := '';
    ELSE
        vc2WorkOdrDlvDate := pvc2WorkOdrDlvDate;
    END IF;

    /* 「製番」が指定されている場合 */
    IF pvc2JobOdrCd = 'null' THEN
        vc2JobOdrCd := '';
    ELSE
        vc2JobOdrCd := pvc2JobOdrCd;
    END IF;

    /* 品目番号が指定されている場合 */
    IF pvc2ItemCd = 'null' THEN
        vc2ItemCd := '';
    ELSE
        vc2ItemCd := pvc2ItemCd;
    END IF;

    /* 作業区コードが指定されている場合 */
    IF pvc2WsCd = 'null' THEN
        vc2WsCd := '';
    ELSE
        vc2WsCd := pvc2WsCd;
    END IF;

    /* 作業実績区分が指定されなかった場合 */
    IF pvc2OprRsltTyp = 'null' THEN
        vc2OprRsltTyp := '';
    ELSE
        vc2OprRsltTyp := pvc2OprRsltTyp;
    END IF;

    /* 作業指示計画（内作）が指定されなかった場合 */
    IF pvc2OutSideTyp = 'null' THEN
        vc2OutSideTyp := '';
    ELSE
        vc2OutSideTyp := pvc2OutSideTyp;
    END IF;

    /* 作業指示計画（外作が指定されなかった場合 */
    IF pvc2OutSideTyp2 = 'null' THEN
        vc2OutSideTyp2 := '';
    ELSE
        vc2OutSideTyp2 := pvc2OutSideTyp2;
    END IF;

    /* 取引先コードが指定されなかった場合 */
    IF pvc2VendCd = 'null' THEN
        vc2VendCd := '';
    ELSE
        vc2VendCd := pvc2VendCd;
    END IF;

    IF blnRet = FALSE THEN
        --業務日付取得エラー
        RAISE excERR_GET_BUSINESS_DATE;
    END IF;

    /* 「処理件数」の初期化 */
    numTransactionCount := 0;

    /* 抽出条件により動的ＳＱＬ生成 */
    intOprInstCursorName := DBMS_SQL.OPEN_CURSOR;
    vc2Sql := 'SELECT V_WORK_ODR_LST.WORK_ODR_CD ';             --作業計画番号
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.WS_CD';                --作業区コード
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OPR_RSLT_TYP';         --品目別作業実績区分
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.WORK_STS_TYP';         --品目別作業状態区分
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OD_NO';                --オーダデマンド番号
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OPR_INST_QTY';         --作業指示数
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OPR_INST_START_DATE';  --着手日
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OUTSIDE_TYP';          --仕掛内外作区分
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.VEND_CD';              --取引先コード
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.PROC_NO';              --仕掛作業系列番号
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.PLANT_CD';             --工場コード
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.WORK_IN_PROC_CD';      --仕掛作業コード
    vc2Sql := vc2Sql || ' FROM V_WORK_ODR_LST';
    vc2Sql := vc2Sql || ' WHERE ';
    vc2Sql := vc2Sql || ' V_WORK_ODR_LST.PLANT_CD = ''' || pvc2PlantCd || '''';

    /* 着手日が指定されている場合 */
    IF vc2OprInstStartDate IS NOT NULL THEN
        --Jf:画面からPARAMETERのFORMAT YYYY/MM/DD
        --又は、Jの時間管理=falseの場合、画面からPARAMETERのFORMAT　YYYY/MM/DD
        IF LENGTH(vc2OprInstStartDate) <= 10 THEN
            vc2Sql := vc2Sql || 'AND V_WORK_ODR_LST.OPR_INST_START_DATE <=
                      TO_DATE(''' || pvc2OprInstStartDate || ' 23:59:59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
        --Jの時間管理=trueの場合、画面からPARAMETERのFORMAT　YYYY/MM/DDHH24:MI
        ELSE
            vc2Sql := vc2Sql || 'AND V_WORK_ODR_LST.OPR_INST_START_DATE <=
                      TO_DATE(''' || pvc2OprInstStartDate || ':59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
        END IF;
    END IF;
    /* 納期が指定されている場合 */
    IF vc2WorkOdrDlvDate IS NOT NULL THEN
        --Jf:画面からPARAMETERのFORMAT YYYY/MM/DD
        --又は、Jの時間管理=falseの場合、画面からPARAMETERのFORMAT　YYYY/MM/DD
        IF LENGTH(vc2WorkOdrDlvDate) <=10 THEN
            vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.WORK_ODR_DLV_DATE <=
                      TO_DATE(''' || pvc2WorkOdrDlvDate || ' 23:59:59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
        --Jの時間管理=trueの場合、画面からPARAMETERのFORMAT　YYYY/MM/DDHH24:MI
        ELSE
            vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.WORK_ODR_DLV_DATE <=
                      TO_DATE(''' || pvc2WorkOdrDlvDate || ':59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
        END IF;
    END IF;
    /* 「製番」が指定されている場合 */
    IF vc2JobOdrCd IS NOT NULL THEN
        vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.JOB_ODR_CD LIKE ''' || pvc2JobOdrCd || '''';

    END IF;
    /* 品目番号が指定されている場合 */
    IF vc2ItemCd IS NOT NULL THEN
        vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.ITEM_CD = ''' || pvc2ItemCd || '''';
    END IF;

    IF vc2OprRsltTyp IS NULL
    AND vc2OutSideTyp IS NULL
    AND vc2OutSideTyp2 IS NULL THEN
        vc2Sql := vc2Sql || ' AND ( V_WORK_ODR_LST.OPR_RSLT_TYP != 1 ) ';
        vc2Sql := vc2Sql || ' AND ( V_WORK_ODR_LST.OPR_RSLT_TYP != 2 ) ';
    ELSE
        vc2Sql := vc2Sql || ' AND ( ';

        /* 出来高実績作業計画が指定された場合 */
        IF vc2OprRsltTyp IS NOT NULL THEN
            vc2Sql := vc2Sql || ' ( V_WORK_ODR_LST.OPR_RSLT_TYP = 1 ';
            /* 作業区コードが指定されている場合 */
            IF vc2WsCd IS NOT NULL THEN
                vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.WS_CD = ''' || pvc2WsCd || '''';
            END IF;
            vc2Sql := vc2Sql || ' ) ';
        END IF;

        IF vc2OprRsltTyp IS NOT NULL
        AND vc2OutSideTyp IS NOT NULL THEN
            vc2Sql := vc2Sql || ' OR ';
        END IF;

        /* 作業指示計画（内作）が指定された場合 */
        IF vc2OutSideTyp IS NOT NULL THEN
            vc2Sql := vc2Sql || ' ( V_WORK_ODR_LST.OUTSIDE_TYP = 1 ';
            vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.OPR_RSLT_TYP = 2 ';
            /* 作業区コードが指定されている場合 */
            IF vc2WsCd IS NOT NULL THEN
                vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.WS_CD = ''' || pvc2WsCd || '''';
            END IF;
            vc2Sql := vc2Sql || ' ) ';
        END IF;

        IF vc2OutSideTyp2 IS NOT NULL
        AND ( vc2OprRsltTyp IS NOT NULL
              OR ( vc2OprRsltTyp IS NULL AND vc2OutSideTyp IS NOT NULL ) ) THEN
            vc2Sql := vc2Sql || ' OR ';
        END IF;

        /* 作業指示計画（外作）が指定された場合 */
        IF vc2OutSideTyp2 IS NOT NULL THEN
            vc2Sql := vc2Sql || ' ( V_WORK_ODR_LST.OUTSIDE_TYP = 2 ';
            vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.OPR_RSLT_TYP = 2 ';
            /* 取引先コードが指定された場合 */
            IF vc2VendCd IS NOT NULL THEN
                vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.VEND_CD = ''' || pvc2VendCd || '''';
            END IF;
            vc2Sql := vc2Sql || ' ) ';
        END IF;

        vc2Sql := vc2Sql || ' ) ';
    END IF;

    vc2Sql := vc2Sql || ' order by V_WORK_ODR_LST.WORK_ODR_CD, V_WORK_ODR_LST.PROC_NO';


--TraceLog の出力（実行位置）
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,1,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,201,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,401,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,601,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,801,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,1001,200));


    /* ＳＱＬ文解析 */
    DBMS_SQL.PARSE(intOprInstCursorName,vc2Sql,DBMS_SQL.NATIVE);

    /* 列定義 */
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,1,vc2WorkOdrCd,100);           --作業計画番号
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,2,vc2WsCd,100);                --作業区コード
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,3,numWorkProcItemOprRsltTyp); --品目別作業実績区分
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,4,numWorkStsTyp);             --作業系列別作業状態区分
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,5,vc2OdNo,100);                --オーダデマンド番号
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,6,numOprInstQty);             --作業指示数
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,7,dtmOprInstStartDate);       --作業系列別着手日
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,8,numOutsideTyp);             --内外作区分
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,9,vc2VendCd,100);              --取引先コード
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,10,numProcNo);                --仕掛作業系列番号
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,11,vc2PlantCd,8);             --工場コード
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,12,vc2WorkInProcCd,100);       --仕掛作業コード

    /* カーソル実行 */
    intRet := DBMS_SQL.EXECUTE(intOprInstCursorName);

    --作業計画番号を一時保持する
    vc2WorkOdrCdMaintenance := '0';

    /* 行フェッチ */
    LOOP

        IF DBMS_SQL.FETCH_ROWS(intOprInstCursorName) > 0 THEN

            /* 列定義 */
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,1,vc2WorkOdrCd);              --作業計画番号
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,2,vc2WsCd);                   --作業区コード
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,3,numWorkProcItemOprRsltTyp); --作業実績区分
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,4,numWorkStsTyp);             --作業状態区分
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,5,vc2OdNo);                   --オーダデマンド番号
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,6,numOprInstQty);             --作業指示数
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,7,dtmOprInstStartDate);       --着手日
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,8,numOutsideTyp);             --仕掛内外作区分
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,9,vc2VendCd);                 --取引先コード
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,10,numProcNo);                --仕掛作業系列番号
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,11,vc2PlantCd);               --工場コード
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,12,vc2WorkInProcCd);          --仕掛作業コード

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
            AND vc2WsCd IS NULL THEN
            -- チェック1 作業計画一覧の作業実績区分 = 1(出来高)
            --           作業計画一覧の作業区コード = ""(Null)

                -- メッセージログ出力
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_WS_CD, '(SBM0496)作業計画番号[' || vc2WorkOdrCd || ']');
                GOTO EXE_END;
            END IF;

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_ITEM)
            AND numOutsideTyp IN (OUTSIDE_TYP_INNER_MAKE)
            AND vc2WsCd IS NULL THEN
            --チェック２ 作業計画一覧の作業実績区分 = 2(作業指示実績)
            --           作業計画一覧の仕掛内外作区分 = 1（内作）
            --           作業計画一覧の作業区コード = ""(Null)

                -- メッセージログ出力
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_WS_CD,'(SBM0557)作業計画番号[' || vc2WorkOdrCd || ']仕掛作業コード[' || vc2WorkInProcCd || ']');
                GOTO EXE_END;
            END IF;

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_ITEM)
            AND numOutsideTyp IN (OUTSIDE_TYP_BUY)
            AND vc2VendCd IS NULL THEN
            --チェック３ 作業計画一覧の作業実績区分 = 2(作業指示実績)
            --           作業計画一覧の仕掛内外作区分 = 2（外作）
            --           作業計画一覧の取引先コード = ""(Null)

                -- メッセージログ出力
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_VEND_CD, '(SBM0557)作業計画番号[' || vc2WorkOdrCd || ']仕掛作業コード[' || vc2WorkInProcCd || ']');
                GOTO EXE_END;
            END IF;

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER) THEN
            -- 作業計画一覧の作業実績区分 = 1(出来高)

                OPEN  CurCount(vc2WsCd);
                FETCH CurCount INTO WsCdcount ;
                CLOSE CurCount ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount <= 0 THEN
                -- チェック４作業計画一覧の作業実績区分 = 1(出来高)
                --           作業計画一覧の作業区コード <> ""(Null)
                --           [作業計画一覧].作業区コードが作業区に存在しない

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WS_CD, '(SBM0496)作業計画番号[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                 END IF;

                OPEN  CurPlantCd(vc2WsCd);
                FETCH CurPlantCd INTO M_WS_PlantCd ;
                CLOSE CurPlantCd ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd <> M_WS_PlantCd THEN
                -- チェック５作業計画一覧の作業実績区分 = 1(出来高)
                --           作業計画一覧の作業区コード <> ""(Null)
                --           [作業計画一覧].作業区コードが作業区に存在する
                --           [作業計画一覧].工場コード <> [作業区].工場コード

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_PLANT_CD, '(SBM0496)作業計画番号[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurWhCd(vc2WsCd);
                FETCH CurWhCd INTO M_WS_WhCd ;
                CLOSE CurWhCd ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd IN (M_WS_PlantCd)
                AND M_WS_WhCd IS NULL THEN
                -- チェッ６作業計画一覧の作業実績区分 = 1(出来高績)
                --           作業計画一覧の作業区コード <> ""(Null)
                --           [作業計画一覧].作業区コードが作業区に存在する
                --           [作業計画一覧].工場コード = [作業区].工場コード
                --           [作業区].保管区コード = NULL

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                         APS_NOTENTRY_M_WS_WH_CD, '(SBM0496)作業計画番号[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurM_Wh_WhCd(M_WS_WhCd);
                FETCH CurM_Wh_WhCd INTO M_WH_WhCd ;
                CLOSE CurM_Wh_WhCd ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd IN (M_WS_PlantCd)
                AND M_WS_WhCd IS NOT NULL
                AND MWsPc <> PlantCd THEN
                -- チェック７作業計画一覧の作業実績区分 = 1(出来高)
                --           作業計画一覧の作業区コード <> ""(Null)
                --           [作業計画一覧].作業区コードが作業区に存在する
                --           [作業計画一覧].工場コード = [作業区].工場コード
                --           [作業区].保管区コード <> NULL
                --           保管区コードが[保管区]に存在しない
                --           [作業区].工場コード <> [保管区].工場コード

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WH_CD2, '(SBM0496)作業計画番号[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurM_Wh_PlantCd(M_WS_PlantCd,M_WS_WhCd);
                FETCH CurM_Wh_PlantCd INTO M_WH_PlantCd ;
                CLOSE CurM_Wh_PlantCd ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd IN (M_WS_PlantCd)
                AND M_WS_WhCd IS NOT NULL
                AND M_WH_PlantCd <= 0 THEN
                -- チェック８作業計画一覧の作業実績区分 = 1(出来高)
                --           作業計画一覧の作業区コード <> ""(Null)
                --           [作業計画一覧].作業区コードが作業区に存在する
                --           [作業計画一覧].工場コード = [作業区].工場コード
                --           [作業区].保管区コード <> NULL
                --           保管区コードが[保管区]に存在しない

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_PLANT_CD2, '(SBM0496)作業計画番号[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                END IF;
            END IF;

            ProcNo := NULL;     --前回データをクリアする。

            OPEN  CurWorkOdrCd(vc2WorkOdrCd) ;
            FETCH CurWorkOdrCd INTO ProcNo,WsCd ;
            CLOSE CurWorkOdrCd ;

            IF ProcNo IN (numProcNo) THEN
            -- 作業指示実績の計画データで、同一作業計画番号内で最初の内作工程の場合
            -- 　        [作業計画一覧].作業実績区分 = ２(作業指示実績)
            --           [作業計画一覧].仕掛作業系列番号が最小
            --           [作業計画一覧].仕掛内外作区分 = １（内作）

                OPEN CurWsCd(WsCd) ;
                FETCH CurWsCd INTO WsCdcount ;
                CLOSE CurWsCd ;

                IF WsCd IS NOT NULL
                AND WsCdcount <= 0 THEN
                -- チェック９　作業指示実績の計画データで、同一作業計画番号内で最初の内作工程の場合
                -- 　　　　　　[作業計画一覧].作業区コード <> NULL
                --           　[作業計画一覧].作業区コードが、[作業区]に存在しない場合

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WS_CD, '(SBM0557)作業計画番号[' || vc2WorkOdrCd || ']仕掛作業コード[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurPlantCd(vc2WsCd);
                FETCH CurPlantCd INTO M_WS_PlantCd ;
                CLOSE CurPlantCd ;

                IF WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd <> M_WS_PlantCd THEN

                -- チェック１０作業指示実績の計画データで、同一作業計画番号内で最初の内作工程の場合
                --             [作業計画一覧].作業区コード <> NULL
                --　　　　　　 [作業計画一覧].作業区コードが、[作業区]に存在する場合
                --             [作業計画一覧].工場コード<>[作業区].工場コード

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_PLANT_CD, '(SBM0557)作業計画番号[' || vc2WorkOdrCd || ']仕掛作業コード[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurWhCd(vc2WsCd);
                FETCH CurWhCd INTO M_WS_WhCd ;
                CLOSE CurWhCd ;

                IF WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd = M_WS_PlantCd
                AND M_WS_WhCd IS NULL THEN
                -- チェック１１作業指示実績の計画データで、同一作業計画番号内で最初の内作工程の場合
                --             [作業計画一覧].作業区コード <> NULL
                --　　　　　　 [作業計画一覧].作業区コードが、[作業区]に存在する場合
                --             [作業計画一覧].工場コード=[作業区].工場コード
                --             [作業区].保管区コード=NULL

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WH_CD, '(SBM0557)作業計画番号[' || vc2WorkOdrCd || ']仕掛作業コード[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN CurMWhWhCd(M_WS_WhCd) ;
                FETCH CurMWhWhCd INTO countWhCd ;
                CLOSE CurMWhWhCd;

                IF WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd = M_WS_PlantCd
                AND M_WS_WhCd IS NOT NULL
                AND countWhCd <= 0 THEN
                -- チェック１２作業指示実績の計画データで、同一作業計画番号内で最初の内作工程の場合
                --             [作業計画一覧].作業区コード <> NULL
                --　　　　　　 [作業計画一覧].作業区コードが、[作業区]に存在する場合
                --             [作業計画一覧].工場コード=[作業区].工場コード
                --             [作業区].保管区コード<>NULL
                --             保管区コードが[保管区]に存在しない場合


                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WH_CD2, '(SBM0557)作業計画番号[' || vc2WorkOdrCd || ']仕掛作業コード[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurM_Wh_PlantCd_Select(M_WS_WhCd);
                FETCH CurM_Wh_PlantCd_Select INTO M_WH_PlantCd_Select ;
                CLOSE CurM_Wh_PlantCd_Select ;

                IF WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd = M_WS_PlantCd
                AND M_WS_WhCd IS NOT NULL
                AND countWhCd > 0
                AND M_WH_PlantCd_Select <> M_WS_PlantCd THEN
                -- チェック１３作業指示実績の計画データで、同一作業計画番号内で最初の内作工程の場合
                --             [作業計画一覧].作業区コード <> NULL
                --　　　　　　 [作業計画一覧].作業区コードが、[作業区]に存在する場合
                --             [作業計画一覧].工場コード=[作業区].工場コード
                --             [作業区].保管区コード<>NULL
                --             保管区コードが[保管区]に存在する場合
                --             [作業区].工場コード<>[保管区].工場コード

                    -- メッセージログ出力
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_PLANT_CD2, '(SBM0557)作業計画番号[' || vc2WorkOdrCd || ']仕掛作業コード[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;
            END IF;


            IF  vc2WorkOdrCd != vc2WorkOdrCdMaintenance
            AND numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER,OPR_RSLT_TYP_ITEM) THEN
            --作業計画一覧-作業実績区分(1:出来高、2:作業指示)

                --品目止まり
                --品目別仕掛アップデート
                UPDATE T_WORK_IN_PROC_BY_ITEM
                SET WORK_STS_TYP = WORK_STS_TYP_INSTRACT,
                    OPR_INST_DATE = dtmBusinessOprDate,
                    UPDATED_DATE = SYSDATE,
                    UPDATED_BY = pvc2UserId,
                    UPDATED_PRG_NM = MY_SQL_NAME,
                    MODIFY_COUNT = MODIFY_COUNT + 1
                WHERE WORK_ODR_CD = vc2WorkOdrCd;

                --作業計画番号を一時保持する
                vc2WorkOdrCdMaintenance := vc2WorkOdrCd;

            END IF;

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_ITEM) THEN
            --作業計画一覧-作業実績区分(2:作業指示)

                --作業系列別仕掛更新
                Update T_WORK_IN_PROC_BY_PROC
                Set
                    WORK_STS_TYP = WORK_STS_TYP_INSTRACT,
                    OPR_INST_DATE = dtmBusinessOprDate,
                    UPDATED_DATE = SYSDATE,
                    UPDATED_BY = pvc2UserId,
                    UPDATED_PRG_NM = MY_SQL_NAME,
                    MODIFY_COUNT = MODIFY_COUNT + 1
                Where WORK_ODR_CD =  vc2WorkOdrCd
                And WORK_IN_PROC_CD = vc2WorkInProcCd;

                --OPEN  CurT_ISSUE_INST(vc2WorkOdrCd) ;
                --FETCH CurT_ISSUE_INST INTO ProcNo ;
                --CLOSE CurT_ISSUE_INST ;

            END IF;


            IF numWorkProcItemOprRsltTyp = OPR_RSLT_TYP_ITEM
            AND numOutsideTyp = OUTSIDE_TYP_BUY THEN

            --工程外注の場合、発注残追加

                --発注番号採番
                blnRet := FncGetNewPuchCd(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd, vc2PuchOdrCd);

                IF blnRet = FALSE THEN
                    RAISE excERR_GET_NEW_PUCH_CD;
                END IF;

                --対象となる作業系列別仕掛が無かったら（異常系）
                IF CurT_WORK_IN_PROC_BY_PROC%ISOPEN THEN
                    CLOSE CurT_WORK_IN_PROC_BY_PROC;
                END IF;
                OPEN CurT_WORK_IN_PROC_BY_PROC(vc2WorkOdrCd,vc2WorkInProcCd);
                FETCH CurT_WORK_IN_PROC_BY_PROC INTO rtpTWorkInProcByProc;
                IF CurT_WORK_IN_PROC_BY_PROC%FOUND = FALSE THEN
                    --エラー
                    RAISE excNOTEXIST_PROC_BY_PROC;
                END IF;

                CLOSE CurT_WORK_IN_PROC_BY_PROC;

                --取引先情報取得
                IF CurMVendCtrl%ISOPEN THEN
                    CLOSE CurMVendCtrl;
                END IF;
                OPEN CurMVendCtrl(rtpTWorkInProcByProc.COMPANY_CD,rtpTWorkInProcByProc.VEND_CD);
                FETCH CurMVendCtrl INTO rtpMVendCtrl;
                IF CurMVendCtrl%FOUND = FALSE THEN
                    --エラー
                    RAISE excERR_M_VEND;
                END IF;

                --品目別仕掛情報取得
                IF CurTWorkInProcByItem%ISOPEN THEN
                    CLOSE CurTWorkInProcByItem;
                END IF;
                OPEN CurTWorkInProcByItem(vc2WorkOdrCd);
                FETCH CurTWorkInProcByItem INTO rtpWorkInProcByItem;
                IF CurTWorkInProcByItem%FOUND = FALSE THEN
                    --エラー
                    RAISE excERR_T_WORK_IN_PROC_BY_ITEM;
                END IF;

                vc2PuchOdrPerson := rtpMVendCtrl.OWN_PERSON_NAME;
                vc2VendTaxCd     := rtpMVendCtrl.TAX_CD;
                numTaxApplyTyp   := rtpMVendCtrl.TAX_APPLY_TYP;  --消費税適用区分
                vc2CurCd         := rtpMVendCtrl.CUR_CD;
                numExchTyp       := rtpMVendCtrl.EXCH_TYP;       --為替種別

                --品目情報取得
                IF CurMItem%ISOPEN THEN
                    CLOSE CurMItem;
                END IF;
                OPEN CurMItem(rtpTWorkInProcByProc.ITEM_CD);
                FETCH CurMItem INTO rtpMItem;
                IF CurMItem%FOUND = FALSE THEN
                --エラー
                    RAISE excERR_M_ITEM;
                END IF;

                -- 受け入れ保管区の既定値取得
                blnRet := FNCGETDEFAULTRCVWH(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,
                                                pvc2PlantCd,                    -- (i)工場コード
                                                rtpTWorkInProcByProc.ITEM_CD,   -- (i)品目番号
                                                vc2MPlantWhCd);                 -- (o)保管区コード
                IF blnRet=FALSE THEN
                    --エラー
                    RAISE excERR_DEFAULT_RCV_WH;
                END IF;

                numSplItemTyp := rtpMItem.SPL_ITEM_TYP;
                vc2ItemTaxCd := rtpMItem.TAX_CD;

                --本体金額
                numNetAmount := rtpTWorkInProcByProc.PUCH_ODR_AMOUNT - rtpTWorkInProcByProc.DISC_AMOUNT;

                --判定日
                dtmJudgeDate := rtpTWorkInProcByProc.WORK_ODR_DLV_DATE;

                --税情報取得
                vc2TaxCd := '';
                numTaxRate1 := 0;
                numTaxRate2 := 0;
                numTaxRate3 := 0;
                numTaxRoundTyp := 1;
                numTaxAmount1 := 0;
                numTaxAmount2 := 0;
                numTaxAmount3 := 0;

                IF numTaxApplyTyp = TAX_APPLY_TYP_M_ITEM THEN
                    vc2TaxCd := vc2ItemTaxCd;
                ELSIF numTaxApplyTyp = TAX_APPLY_TYP_M_VEND THEN
                    vc2TaxCd := vc2VendTaxCd;
                END IF;

                IF vc2TaxCd IS NOT NULL THEN

                    IF substr(vc2TaxCd,3,1) = TAXABLE_TYP_OUT THEN
                    --税込税抜き区分が税抜き（外税）の場合

                        --税情報取得
                        IF CurMTax%ISOPEN THEN
                            CLOSE CurMTax;
                        END IF;

                        --税率の設定
                        OPEN CurMTax(vc2TaxCd);
                        FETCH CurMTax INTO rtpMTax;
                        IF CurMTax%FOUND = TRUE THEN
                            numTaxRoundTyp := rtpMTax.ROUND_TYP;
                            IF rtpMTax.NEW_TAX_RATE_START_DATE <= dtmJudgeDate THEN
                                numTaxRate1 := rtpMTax.NEW_TAX_RATE_1;
                                numTaxRate2 := rtpMTax.NEW_TAX_RATE_2;
                                numTaxRate3 := rtpMTax.NEW_TAX_RATE_3;
                            ELSE
                                numTaxRate1 := rtpMTax.OLD_TAX_RATE_1;
                                numTaxRate2 := rtpMTax.OLD_TAX_RATE_2;
                                numTaxRate3 := rtpMTax.OLD_TAX_RATE_3;
                            END IF;
                        END IF;

                        numDecimalFig := 0;
                        --小数桁数取得
                        IF CurDecimalFig%ISOPEN THEN
                            CLOSE CurDecimalFig;
                        END IF;
                        OPEN CurDecimalFig(vc2CurCd);
                        FETCH CurDecimalFig INTO rtpDecimalFig;
                        IF CurDecimalFig%FOUND = TRUE THEN
                            numDecimalFig := rtpDecimalFig.DECIMAL_FIG;
                        END IF;

                        IF numTaxRate1 > 0 THEN

                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  numNetAmount * numTaxRate1 / 100, --(i)端数処理前の値
                                                  numDecimalFig,                    --(i)少数桁数
                                                  numTaxRoundTyp,                   --(i)端数処理区分
                                                  numTaxAmount1);                   --(o)端数処理後の値
                            IF blnRet = FALSE THEN
                                RAISE excGETROUND_ERR;
                            END IF;
                        END IF;

                        IF numTaxRate2 > 0 THEN

                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  numNetAmount * numTaxRate2 / 100, --(i)端数処理前の値
                                                  numDecimalFig,                    --(i)少数桁数
                                                  numTaxRoundTyp,                   --(i)端数処理区分
                                                  numTaxAmount2);                   --(o)端数処理後の値
                            IF blnRet = FALSE THEN
                                RAISE excGETROUND_ERR;
                            END IF;
                        END IF;

                        IF numTaxRate3 > 0 THEN

                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  numNetAmount * numTaxRate3 / 100, --(i)端数処理前の値
                                                  numDecimalFig,                    --(i)少数桁数
                                                  numTaxRoundTyp,                   --(i)端数処理区分
                                                  numTaxAmount3);                   --(o)端数処理後の値
                            IF blnRet = FALSE THEN
                                RAISE excGETROUND_ERR;
                            END IF;
                        END IF;
                    END IF;
                END IF;

                --税込金額
                numAmountincludeTax := numNetAmount + numTaxAmount1 + numTaxAmount2 + numTaxAmount3;

                --邦貨金額
                numHomeCurAmount := numAmountincludeTax;

                --邦貨
                numHomeCurAmount := 0;
                numExchRate := 0;

                /* （多通貨）邦貨換算部品パラメータ設定 */
                pvc2CompanyCd           := rtpTWorkInProcByProc.COMPANY_CD;        --会社コード
                vc2VEND_CD              := rtpTWorkInProcByProc.VEND_CD;           --取引先コード
                pdtmRateJudgeDate       := rtpTWorkInProcByProc.WORK_ODR_DLV_DATE; --レート判定日(=［作業系列別仕掛］."作業系列別製造納期")
                pvc2ExchReserveCd       := Null;                      --為替予約コード
                pnumConvertTyp          := 1;                         --変換方向(外貨→邦貨)

                /* 為替種別=２の場合は、ワーニング */
                IF numExchTyp = 2 THEN
                    vc2Comment := SUBSTR('(SBM0497)登録発注番号：' || '[ ' || vc2PuchOdrCd || ' ]' ||
                                         ' 取引先コード：' || '[ ' || vc2VEND_CD || ' ]',1,256);
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                        MY_SQL_NAME ,APS_NOTENTRY_EXCH_TYP, vc2Comment);
                    pnumAfterAmount := 0;       --変換後金額
                    pdtmRateJudgeDate := null;  --レート判定日
                    pnumExchRate := 0;          --為替レート
                ELSE
                    /* （多通貨）邦貨換算部品を呼出す */
                    blnRet := FNCCURRENCYCONVERT(UTL_FileHandle,          --(i)ファイルハンドル
                                                 pvc2LogMode,             --(i)ＬＯＧモード
                                                 pvc2OutputMode,          --(i)出力モード
                                                 pvc2UserId,              --(i)ユーザＩＤ
                                                 pvc2BusinessName,        --(i)業務名
                                                 pvc2PlantCd,             --(i)工場コード
                                                 pvc2CompanyCd,           --(i)会社コード
                                                 vc2VEND_CD,              --(i)取引先コード
                                                 pdtmRateJudgeDate,       --(i)レート判定日
                                                 pvc2ExchReserveCd,       --(i)為替予約コード
                                                 numAmountincludeTax,     --(i)変換前金額
                                                 pnumConvertTyp,          --(i)変換方向(1:外貨→邦貨)
                                                 pnumAfterAmount,         --(o)変換後金額
                                                 pnumRoundTyp,            --(o)端数処理区分
                                                 pnumExchRate,            --(o)為替レート
                                                 pnumExchTyp,             --(o)為替種別
                                                 pvc2VendCurCd,           --(o)取引先通貨コード
                                                 pvc2VendCurName,         --(o)取引先通貨名
                                                 pvc2VendCurSymbol,       --(o)取引先通貨記号
                                                 pvc2VendCurUnit,         --(o)取引先通貨単位
                                                 pnumVendDecimalFig,      --(o)取引先小数桁数
                                                 pvc2HomeCurCd,           --(o)自社（邦貨）通貨コード
                                                 pvc2HomeCurName,         --(o)自社（邦貨）通貨名
                                                 pvc2HomeCurSymbol,       --(o)自社（邦貨）通貨記号
                                                 pvc2HomeCurUnit,         --(o)自社（邦貨）通貨単位
                                                 pnumHomeDecimalFig,      --(o)自社（邦貨）小数桁数
                                                 pvc2ErrorCd              --(o)エラーコード
                                                 );

                    /* （多通貨）邦貨換算部品でエラー発生 */
                    IF blnRet = FALSE THEN
                        /* ［為替レートマスタ］が存在する場合 */
                        IF pvc2ErrorCd != APS_NOTENTRY_EXCH_RATE THEN
                            blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                                pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                                pvc2ErrorCd, '(SBM0496)作業計画番号[' || vc2WorkOdrCd || '] ');
                            pdtmRateJudgeDate       := Null;
                        ELSE
                            pnumAfterAmount := 0;       --変換後金額
                            pdtmRateJudgeDate := null;  --レート判定日
                            pnumExchRate := 0;          --為替レート
                            blnRet := true;
                        END IF;
                    END IF;
                END IF;

                Insert into T_RLSD_PUCH_ODR (
                    PUCH_ODR_CD,
                    ITEM_CD,
                    NON_NO_ITEM_NAME,
                    NON_NO_ITEM_TYP,
                    COMPANY_CD,
                    VEND_CD,
                    PLANT_CD,
                    PUCH_ODR_PERSON,
                    PUCH_ODR_START_DATE,
                    PUCH_ODR_DLV_DATE,
                    PUCH_ODR_QTY,
                    NON_NO_ITEM_PUCH_ODR_UNIT,
                    UNIT_COST_TYP,
                    UNIT_COST,
                    PROCESSING_COST,
                    MATERIAL_COST,
                    OTHER_OVERHEADS,
                    DISC_AMOUNT,
                    PUCH_ODR_AMOUNT,
                    PUCH_ODR_GNR_TYP,
                    PUCH_ODR_INST_DATE,
                    PUCH_ODR_INST_SLIP_ISS_FLG,
                    PUCH_ODR_SLIP_ISS_DATE,
                    ACPT_CMPLT_DATE,
                    PUCH_ODR_STS_TYP,
                    INSPC_CMPLT_FLG,
                    INSPC_CMPLT_DATE,
                    CONFIRM_DLV_DATE,
                    SPL_ITEM_TYP,
                    ACPT_INSPC_TYP,
                    INV_CTRL_FLG,
                    WORK_ODR_CD,
                    WORK_IN_PROC_CD,
                    OD_NO,
                    PUCH_ODR_COMMENT,
                    ODR_CD,
                    DETAIL_NO,
                    RATE_JUDGE_DATE,
                    EXCH_RATE,
                    TAX_RATE_1,
                    TAX_RATE_2,
                    TAX_RATE_3,
                    NET_AMOUNT,
                    TAX_AMOUNT_1,
                    TAX_AMOUNT_2,
                    TAX_AMOUNT_3,
                    AMOUNT_INCLUDE_TAX,
                    HOME_CUR_AMOUNT,
                    TAX_CD,
                    TAX_ROUND_TYP,
                    WH_CD,
                    CREATED_DATE,
                    CREATED_BY,
                    CREATED_PRG_NM,
                    UPDATED_DATE,
                    UPDATED_BY,
                    UPDATED_PRG_NM,
                    MODIFY_COUNT
                ) Values (
                    vc2PuchOdrCd
                    ,rtpTWorkInProcByProc.ITEM_CD
                    ,''
                    ,0
                    ,rtpTWorkInProcByProc.COMPANY_CD
                    ,rtpTWorkInProcByProc.VEND_CD
                    ,rtpTWorkInProcByProc.PLANT_CD
                    ,''
                    ,rtpTWorkInProcByProc.OPR_INST_START_DATE
                    ,rtpTWorkInProcByProc.WORK_ODR_DLV_DATE
                    ,rtpTWorkInProcByProc.OPR_INST_QTY
                    ,''
                    ,rtpTWorkInProcByProc.UNIT_COST_TYP
                    ,rtpTWorkInProcByProc.UNIT_COST
                    ,rtpTWorkInProcByProc.PROCESSING_COST
                    ,rtpTWorkInProcByProc.MATERIAL_COST
                    ,rtpTWorkInProcByProc.OTHER_OVERHEADS
                    ,rtpTWorkInProcByProc.DISC_AMOUNT
                    ,rtpTWorkInProcByProc.PUCH_ODR_AMOUNT
                    ,3
                    ,rtpTWorkInProcByProc.OPR_INST_DATE
                    ,0
                    ,NULL
                    ,NULL
                    ,2      --指示済
                    ,0
                    ,NULL
                    ,NULL
                    ,numSplItemTyp
                    ,rtpTWorkInProcByProc.ACPT_INSPC_TYP
                    ,1      --在庫管理する
                    ,rtpTWorkInProcByProc.WORK_ODR_CD
                    ,rtpTWorkInProcByProc.WORK_IN_PROC_CD
                    ,rtpTWorkInProcByProc.OD_NO
                    ,rtpTWorkInProcByProc.WORK_IN_PROC_COMMENT
                    ,''
                    ,0
                    ,pdtmRateJudgeDate --為替レート判定日
                    ,pnumExchRate      --為替レート
                    ,numTaxRate1
                    ,numTaxRate2
                    ,numTaxRate3
                    ,numNetAmount
                    ,numTaxAmount1
                    ,numTaxAmount2
                    ,numTaxAmount3
                    ,numAmountincludeTax
                    ,pnumAfterAmount    --邦貨金額
                    ,vc2TaxCd
                    ,numTaxRoundTyp
                    ,vc2MPlantWhCd
                    ,SYSDATE
                    ,pvc2UserId
                    ,MY_SQL_NAME
                    ,SYSDATE
                    ,pvc2UserId
                    ,MY_SQL_NAME
                    ,0);

            END IF;


            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
            OR numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_ITEM) THEN
            -- 作業計画一覧の作業実績区分 = 1(出来高) または
            -- 作業計画一覧の作業実績区分 = 2(作業指示)

                --出庫指示
                blnRet := FNCINSIDEISSUEINSTRUCTION(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,pvc2PlantCd,
                                   vc2WorkOdrCd,vc2WorkInProcCd,vc2OdNo,
                                   numOprInstQty,numWorkProcItemOprRsltTyp);
            END IF;

            IF blnRet = FALSE THEN
                RAISE excISSUE_ERR;
            END IF;

            << EXE_END >>

            /* 「処理件数」のインクリメント */
            numTransactionCount := numTransactionCount + 1;
        ELSE
            /* 全行処理により処理終了 */
            EXIT;
        END IF;
    END LOOP;

    /* カーソルクローズ */
    DBMS_SQL.CLOSE_CURSOR(intOprInstCursorName);

    vc2Comment := SUBSTR('着手日：' || '[ ' || pvc2OprInstStartDate || ' ]' ||
                         ' 納期：' || '[ ' || pvc2WorkOdrDlvDate || ' ]' ||
                         ' 製番：' || '[ ' || pvc2JobOdrCd || ' ]' ||
                         ' 処理件数：' || '[ ' || numTransactionCount || ' ]',1,256);

    /* 終了メッセージの出力 */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                        '(SBM0499)' || LOGMSG_END_PRGNAME_OPRINST || vc2Comment);

    COMMIT;

    --トレースログ（end）
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                          pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    /* LogFile の CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);


--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_GET_BUSINESS_DATE THEN   --業務日付未設定
        ROLLBACK;
        vc2Comment := SUBSTR('業務日付未設定',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0502)'  || LOGMSG_END_PRGNAME_OPRINST || vc2Comment);

        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excNOTEXIST_PROC_BY_PROC THEN   --作業系列別仕掛データが存在しません
        ROLLBACK;
        vc2Comment := SUBSTR('作業系列別仕掛データが存在しません',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0504)'  || LOGMSG_END_PRGNAME_OPRINST || vc2Comment);

        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excNOTEXIST_PROC_BY_ROUTING THEN   --手順別仕掛データが存在しません
        ROLLBACK;
        vc2Comment := SUBSTR('手順別仕掛データが存在しません',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0505)'  || LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excERR_GET_NEW_PUCH_CD THEN   --発注番号採番エラー
        ROLLBACK;
        vc2Comment := SUBSTR('発注番号採番エラー',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0506)'  ||  LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excERR_M_VEND THEN        --「取引先」未存在エラー
        ROLLBACK;
        vc2Comment := SUBSTR('取引先[' || vc2VendCd || ']未存在エラー',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0507)'  ||   LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excERR_T_WORK_IN_PROC_BY_ITEM THEN        --「品目別仕掛」未存在エラー
        ROLLBACK;
        vc2Comment := SUBSTR('品目別仕掛[' || vc2VendCd || ']未存在エラー',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                             APS_COM_BATCH_END,'(SBM0508)'  ||  LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGETROUND_ERR           THEN         --「端数処理」エラー
        ROLLBACK;
        vc2Comment := SUBSTR('端数処理エラー',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END, '(SBM0509)'  ||  LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excISSUE_ERR THEN         --「出庫指示」更新エラー
        ROLLBACK;
        vc2Comment := SUBSTR('出庫指示更新エラー',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0510)'  ||  LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excERR_DEFAULT_RCV_WH THEN        -- 受け入れ保管区取得エラー
        ROLLBACK;
        vc2Comment := SUBSTR('所要量計算対象の保管区が存在しません。',1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0512)'|| LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN   --その他のエラー
        ROLLBACK;
        vc2Comment := SUBSTR(SQLCODE || SQLERRM,1,256);
        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0513)'|| LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                              METHOD_END || vc2RunChkComment);
        --トレースログ（end）
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

END;
/
