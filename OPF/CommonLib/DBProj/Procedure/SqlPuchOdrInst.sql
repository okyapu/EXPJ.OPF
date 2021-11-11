CREATE OR REPLACE procedure SQLPUCHODRINST(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlPuchOdrInst.sql,v $
'$Author: feng-yi $
'$Revision: 1.9 $ $Date: 2011/12/23 03:19:57 $
'                        2005.10.24 unicode対応（varchar2を4倍）
'                        2009.02.19 仕入直送対応
'
'
' 機能      : 発注指示確定実行（多通貨対応）
'
' 戻り値    :
'
'
' 引き数    : ■MetamorBase共通（必須）
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             ■プログラム固有（発注予定日または、発注納期日は必須）
'             pvc2StartDate        - (i)発注予定日
'             pvc2DlvDate          - (i)発注納期日
'             pvc2PuchOdrCd        - (i)発注番号
'             pvc2VendCd           - (i)取引先コード
'             pvc2PuchOdrPerson    - (i)発注担当者
'             pvc2JobOdrCd         - (i)製番
,             pvc2ApprPurInst        --(i)発注指示権限
,             pvc2ApprPowerTyp       --(i)ユーザ承認権限
'
'
' 機能説明  : 発注指示データの確定を行う。この処理にてオーダのメンテナンスは不可能
'             となり注文書出力、実績入力が可能となる下位部品が存在する場合は出庫指
'             示が作成される。
'             また、レート判定日が未設定かつ、邦貨以外のデータに対して、邦貨金額を
'             計算し、設定する。
'
' 備考      :(#714)工場CD=00対応
'
------------------------------------------------------------------------------*/

--< プロシージャ名定義 >-----------------------------------------------------
    pvc2LogMode             VARCHAR2        --①ＬＯＧモード
   ,pvc2OutputMode          VARCHAR2        --②出力モード
   ,pvc2OutputPath          VARCHAR2        --③出力パス
   ,pvc2OutputName          VARCHAR2        --④出力ファイル名
   ,pvc2UserId              VARCHAR2        --⑤ユーザＩＤ
   ,pvc2BusinessName        VARCHAR2        --⑥業務名
   ,pvc2PlantCd             VARCHAR2        --⑦工場コード
   ,pvc2StartDate           VARCHAR2        --⑧発注着手日
   ,pvc2DlvDate             VARCHAR2        --⑨発注納期日
   ,pvc2PuchOdrCd           VARCHAR2        --⑩発注番号
   ,pvc2VendCd              VARCHAR2        --⑪取引先コード
   ,pvc2PuchOdrPerson       VARCHAR2        --⑫発注担当者
   ,pvc2JobOdrCd            VARCHAR2        --⑬製番
   ,pvc2ApprPurInst           VARCHAR2        --⑭発注指示権限
   ,pvc2ApprPowerTyp      VARCHAR2        --⑮ユーザ承認権限
)
IS

    /* 定数の宣言 */

    METHOD_START            VARCHAR2(20) := 'START';          --ログ用メソッド開始宣言
    METHOD_END              VARCHAR2(12) := 'End';            --ログ用メソッド終了宣言
    MY_SQL_NAME             VARCHAR2(56) := 'SQLPUCHODRINST'; --ＰＬ／ＳＱＬ名
    LOGMSG_START_PGNM_PUCHODRINST   VARCHAR2(104) := '<< 発注指示確定開始 >>';
    LOGMSG_END_PGNM_PUCHODRINST     VARCHAR2(104) := '<< 発注指示確定終了 >>';

    APS_COM_BATCH_START     VARCHAR2(28) := 'ZZ09001';        --バッチ処理を開始しました。
    APS_COM_BATCH_END       VARCHAR2(28) := 'ZZ09002';        --バッチ処理を終了しました。
    APS_NOTENTRY_CD         VARCHAR2(28) := 'ZZ01104';        --必須項目が入力されていません。
    APS_NOTENTRY_VEND_CD    VARCHAR2(28) := 'AE50037';        --取引先コードが未設定のデータが存在します。
    APS_NOTENTRY_WH_CD      VARCHAR2(28) := 'AE00126';        --取引先保管区が存在しません。
    APS_NOTEXIST_SYS_PARAMETER VARCHAR2(28) := 'AE00127';     --有償支給品在庫管理フラグがパラメータに定義されていません。

    LOGMSG_ERR              VARCHAR2(40) := '　異常終了';
    LOGMSG_PROCCOUNT        VARCHAR2(48) := '　処理件数：';
    LOGMSG_STARTDATE        VARCHAR2(56) := '　発注予定日：';
    LOGMSG_DLVDATE          VARCHAR2(56) := '　発注納期日：';
    LOGMSG_JOBODRCD         VARCHAR2(32) := '　製番：';
    LOGMSG_ROWCOUNT         VARCHAR2(48) := '　対象件数：';
    LOGMSG_COUNTNORMAL      VARCHAR2(48) := '　正常件数：';

    numRowCount             NUMBER(11)   := 0;                --対象データ件数
    numCountNormal          NUMBER(11)   := 0;                --正常データ件数

    /* 邦貨換算部品パラメータ */
    pvc2CompanyCd           VARCHAR2(100) := Null;             --会社コード
    pdtmRateJudgeDate       DATE         := Null;             --レート判定日
    pvc2ExchReserveCd       VARCHAR2(100) := Null;             --為替予約コード
    pnumConvertTyp          NUMBER(02)   := 0;                --変換方向(外貨→邦貨)
    pnumAfterAmount         NUMBER(18,4) := 0;                --変換後金額
    pnumRoundTyp            NUMBER(02)   := 0;                --端数処理区分
    pnumExchRate            NUMBER(20,6) := 0;                --為替レート
    pnumExchTyp             NUMBER(02)   := 0;                --為替種別
    pvc2VendCurCd           VARCHAR2(100) := NULL;             --取引先通貨コード
    pvc2VendCurName         VARCHAR2(160) := NULL;             --取引先通貨名
    pvc2VendCurSymbol       VARCHAR2(100) := NULL;             --取引先通貨記号
    pvc2VendCurUnit         VARCHAR2(100) := NULL;             --取引先通貨単位
    pnumVendDecimalFig      NUMBER(02)   := 0;                --取引先小数桁数
    pvc2HomeCurCd           VARCHAR2(100) := NULL;             --自社（邦貨）通貨コード
    pvc2HomeCurName         VARCHAR2(160) := NULL;             --自社（邦貨）通貨名
    pvc2HomeCurSymbol       VARCHAR2(100) := NULL;             --自社（邦貨）通貨記号
    pvc2HomeCurUnit         VARCHAR2(100) := NULL;             --自社（邦貨）通貨単位
    pnumHomeDecimalFig      NUMBER(02)   := 0;                --自社（邦貨）小数桁数
    pvc2ErrorCd             VARCHAR2(28) := NULL;             --エラーコード

    /* 発注残レコード */
    vc2PUCH_ODR_CD          VARCHAR2(100);   --発注番号
    vc2ITEM_CD              VARCHAR2(100);   --品目番号
    vc2WH_CD                VARCHAR2(100);   --受入場所
    vc2COMPANY_CD           VARCHAR2(100);   --会社コード
    vc2VEND_CD              VARCHAR2(100);   --取引先コード
    vc2PLANT_CD             VARCHAR2(8);   --工場コード
    vc2PUCH_ODR_PERSON      VARCHAR2(160);   --発注担当者
    dtmPUCH_ODR_START_DATE  DATE;           --発注着手日
    dtmPUCH_ODR_DLV_DATE    DATE;           --発注納期
    numPUCH_ODR_QTY         NUMBER(18,4);   --発注数
    numUNIT_COST_TYP        NUMBER(02);     --単価区分
    numUNIT_COST            NUMBER(18,4);   --単価
    numPUCH_ODR_AMOUNT      NUMBER(18,4);   --発注金額
    numPUCH_ODR_GNR_TYP     NUMBER(02);     --発注発生処理区分
    dtmPUCH_ODR_INST_DATE   DATE;           --発注指示日
    numPUCH_ODR_INST_SLIP_ISS_FLG NUMBER(01);  --発注伝票発行済みフラグ
    dtmPUCH_ODR_SLIP_ISS_DATE     DATE;     --発注伝票発行日
    dtmACPT_CMPLT_DATE      DATE;           --受入完了日
    numPUCH_ODR_STS_TYP     NUMBER(02);     --発注状態区分
    numINSPC_CMPLT_FLG      NUMBER(01);     --検査完了フラグ
    dtmINSPC_CMPLT_DATE     DATE;           --検査完了日
    dtmCONFIRM_DLV_DATE     DATE;           --回答納期
    numSPL_ITEM_TYP         NUMBER(02);     --受給品区分
    numACPT_INSPC_TYP       NUMBER(02);     --発注時受入検査区分
    numINV_CTRL_FLG         NUMBER(01);     --在庫管理フラグ
    vc2WORK_ODR_CD          VARCHAR2(100);   --作業計画番号
    vc2WORK_IN_PROC_CD      VARCHAR2(100);   --仕掛作業コード
    vc2OD_NO                VARCHAR2(100);   --オーダデマンド番号
    dtmRATE_JUDGE_DATE      DATE;           --レート判定日
    numEXCH_RATE            NUMBER(20,6);   --為替レート
    numNET_AMOUNT           NUMBER(18,4);   --本体金額
    numAMOUNT_INCLUDE_TAX   NUMBER(18,4);   --税込金額
    numHOME_CUR_AMOUNT      NUMBER(18,4);   --邦貨金額
    vc2TAX_CD               VARCHAR2(100);   --税コード
    numTAX_ROUND_TYP        NUMBER(02);     --税端数区分
    numNON_NO_ITEM_FLG      NUMBER(01);     --備品発注フラグ
    numPUCH_ODR_EDI_ISS_FLG   NUMBER(01);   --ＥＤＩデータ出力済フラグ
    dtmPUCH_ODR_EDI_ISS_DATE  DATE;         --ＥＤＩデータ出力日
    numPUCH_ODR_FAX_ISS_FLG   NUMBER(01);   --ＦＡＸデータ出力済フラグ
    dtmPUCH_ODR_FAX_ISS_DATE  DATE;         --ＦＡＸデータ出力日
    numPUCH_ODR_MAIL_ISS_FLG  NUMBER(01);   --ＭＡＩＬデータ出力済フラグ
    dtmPUCH_ODR_MAIL_ISS_DATE DATE;         --ＭＡＩＬデータ出力日
    vc2APPR_ID             VARCHAR2(100);   --確定実行者
    dtmAPPR_DATE                DATE;           --確定日

    /* 所要量レコード */
    vc2OD_OD_NO             VARCHAR2(100);   --オーダデマンド番号
    vc2OD_PS_EDITION        VARCHAR2(100);   --所要量品目構成版数
    vc2OD_JOB_ODR_CD        VARCHAR2(100);   --製番
    numOD_ODR_STS_TYP       NUMBER(02);     --オーダ状態区分
    numOD_DM_STS_TYP        NUMBER(02);     --デマンド状態区分
    numOD_OD_TYP            NUMBER(02);     --オーダデマンド区分
    dtmOD_DUE_DATE          DATE;           --要求納期
    dtmOD_ODR_START_DATE    DATE;           --手配着手日
    dtmOD_PRD_DUE_DATE      DATE;           --製造納期
    dtmOD_PRD_START_DATE    DATE;           --製造着手日
    numOD_DM_QTY            NUMBER(18,4);   --デマンド数
    numOD_ODR_QTY           NUMBER(18,4);   --オーダ数
    numOD_MRP_ODR_TYP       NUMBER(02);     --品目手配区分
    numOD_OUTSIDE_TYP       NUMBER(02);     --所要量内外作区分
    numOD_PS_UNIT_QTY       NUMBER(18,4);   --製品構成単位数
    numOD_PS_UNIT_DENOMINATOR  NUMBER(18,4);  --製品構成単位数分母
    numOD_PS_UNIT_NUMERATOR NUMBER(18,4);   --製品構成単位数分子
    vc2OD_PARENT_OD_NO      VARCHAR2(100);   --親オーダデマンド番号
    numOD_ODR_RELEASE_FLG   NUMBER(01);     --オーダ発効済フラグ

    /* 変数の定義 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --ファイルハンドル
    dtmBusinessOprDate      DATE;           --業務日付
    numTransactionCount     NUMBER(10);     --処理件数

    vc2PlantCd              VARCHAR2(8);    --工場コード
    vc2StartDate            VARCHAR2(40);   --発注予定日
    vc2DlvDate              VARCHAR2(40);   --発注納期日
    vc2PuchOdrCd            VARCHAR2(100);   --発注番号
    vc2VendCd               VARCHAR2(100);   --取引先コード
    vc2PuchOdrPerson        VARCHAR2(160);   --発注担当者
    vc2JobOdrCd             VARCHAR2(100);   --製番
    vc2ApprPurInst           VARCHAR2(100);    --発注指示権限
    vc2ApprPowerTyp      VARCHAR2(100);      --ユーザ承認権限

    dtmBusinessDate         DATE;           --業務運用日格納用
    blnRet                  BOOLEAN;        --共通関数の戻値
    vc2CommentCount         VARCHAR2(1024);  --メッセージ作成用
    vc2CommentDate          VARCHAR2(1024);  --メッセージ作成用
    vc2CommentJobod         VARCHAR2(1024);  --メッセージ作成用
    vc2Comment              VARCHAR2(1024);  --メッセージ作成用
    vc2RunChkComment        VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    vc2SQL                  VARCHAR2(4096); --SELECT文作成用
    intItemCursorName       INTEGER;        --view用カーソルＩＤ
    blnRet_EXC              INTEGER;
    blnErrFLG               BOOLEAN;        --ｴﾗｰかﾜｰﾆﾝｸﾞの判定(True:ｴﾗｰ、False:ﾜｰﾆﾝｸﾞ)

    /* 例外処理用変数 */
    excERR_GET_BUSINESS_DATE        EXCEPTION;      --業務日付取得エラー
    excERR_NOTENTRY_PLANT_CD        EXCEPTION;      --工場コード未入力エラー
    excERR_NOTENTRY_DATE_CD         EXCEPTION;      --日付項目未入力エラー
    excFNCPUCHODRINSTOUTSIDEISSUE   EXCEPTION;      --出庫指示(外作)でエラー発生
    excOTHERS                       EXCEPTION;      --その他のエラー発生


--<メイン処理 >-----------------------------------------------------
BEGIN
    /* LogFile の OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLogの出力(Start)処理を行う */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

    /* 業務開始メッセージの作成 */
    vc2Comment      := SUBSTR('　工場コード：' || '[ ' || pvc2PlantCd       || ' ]' ||
                              '　発注予定日：' || '[ ' || pvc2StartDate     || ' ]' ||
                              '　発注納期日：' || '[ ' || pvc2DlvDate       || ' ]' ||
                              '　取引先ＣＤ：' || '[ ' || pvc2VendCd        || ' ]' ||
                              '　発注担当者：' || '[ ' || pvc2PuchOdrPerson || ' ]' ||
                              '　発注番号：'   || '[ ' || pvc2PuchOdrCd     || ' ]' ||
                              '　製番：'       || '[ ' || pvc2JobOdrCd      || ' ]',1,256);

    /* 業務開始メッセージの出力 */
    blnRet :=   FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
                          '(SBM0517)' || LOGMSG_START_PGNM_PUCHODRINST || vc2Comment);
    COMMIT;

    /* 工場コードチェック(#714) */
    IF pvc2PlantCd = '' THEN
        IF pvc2PlantCd = '' THEN
            RAISE excERR_NOTENTRY_PLANT_CD;  --工場コード未設定時エラー
        END IF;
    END IF;

    /* 業務日付取得 */
    blnRet := FNCGETBUSINESSDATE(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd, dtmBusinessOprDate);

    IF blnRet = FALSE THEN
        RAISE excERR_GET_BUSINESS_DATE;      --業務日付取得エラー
    END IF;

    /* 日付項目チェック */
    IF pvc2StartDate = '' THEN
        IF pvc2DlvDate = '' THEN
            RAISE excERR_NOTENTRY_DATE_CD;   --発注予定日・発注納期日、両方未設定時エラー
        END IF;
    END IF;

    /* 「処理件数」の初期化 */
    numTransactionCount := 0;

    /* 工場コードが指定されている場合(#714) */
    IF pvc2PlantCd = '' THEN
        vc2PlantCd := '';
    ELSE
        vc2PlantCd := pvc2PlantCd;
    END IF;

    /* 発注着手日が指定されている場合 */
    IF pvc2StartDate = '' THEN
        vc2StartDate := '';
    ELSE
        vc2StartDate := pvc2StartDate;
    END IF;

    /* 発注納期日が指定されている場合 */
    IF pvc2DlvDate   = '' THEN
        vc2DlvDate   := '';
    ELSE
        vc2DlvDate   := pvc2DlvDate;
    END IF;

    /* 発注番号 */
    vc2PuchOdrCd     := pvc2PuchOdrCd;

    /* 取引先コード */
    vc2VendCd        := pvc2VendCd;

    /* 発注担当者 */
    vc2PuchOdrPerson := pvc2PuchOdrPerson;

    /* 製番 */
    vc2JobOdrCd      := pvc2JobOdrCd;

    /* 発注指示権限 */
    vc2ApprPurInst       := pvc2ApprPurInst;

    /* ユーザ承認権限 */
    vc2ApprPowerTyp     := pvc2ApprPowerTyp;

    /*［発注残］検索用ＳＱＬ文の作成 */
    intItemCursorName := DBMS_SQL.OPEN_CURSOR;
        vc2SQL := 'SELECT ';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_CD,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_START_DATE,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_DLV_DATE,';
        vc2SQL := vc2SQL || 'PO.COMPANY_CD,';
        vc2SQL := vc2SQL || 'PO.VEND_CD,';
        vc2SQL := vc2SQL || 'PO.PLANT_CD,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_PERSON,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_INST_DATE,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_STS_TYP,';
        vc2SQL := vc2SQL || 'PO.INV_CTRL_FLG,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_QTY,';
        vc2SQL := vc2SQL || 'PO.RATE_JUDGE_DATE,';
        vc2SQL := vc2SQL || 'PO.AMOUNT_INCLUDE_TAX,';
        vc2SQL := vc2SQL || 'OD.OD_NO,';
        vc2SQL := vc2SQL || 'OD.JOB_ODR_CD,';
        vc2SQL := vc2SQL || 'OD.PARENT_OD_NO';
        vc2SQL := vc2SQL || ' FROM T_RLSD_PUCH_ODR PO,T_OD OD';
        vc2SQL := vc2SQL || ' WHERE       PO.OD_NO = OD.OD_NO(+)';
        vc2SQL := vc2SQL || ' AND         PO.PUCH_ODR_STS_TYP = 1';
        vc2SQL := vc2SQL || ' AND         PO.DIRECT_FLG = 0';

    /* 画面の入力データでＳＱＬ文の条件を作成 */
    /* 工場コードの条件(#714) */
        vc2SQL := vc2SQL || ' AND PO.PLANT_CD = '''|| vc2PlantCd || '''';

    /* 発注予定日の条件 */
    IF vc2StartDate IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.PUCH_ODR_START_DATE <=
                  TO_DATE('''|| vc2StartDate || ''',''yyyy/mm/dd hh24:mi'')';
    END IF;

    /* 発注納期日の条件 */
    IF vc2DlvDate   IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.PUCH_ODR_DLV_DATE   <=
                  TO_DATE(''' || vc2DlvDate || ''',''yyyy/mm/dd hh24:mi'')';
    END IF;

    /* 発注番号の条件 */
    IF vc2PuchOdrCd IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.PUCH_ODR_CD <= '''|| vc2PuchOdrCd || '''';
    END IF;

    /* 取引先コードの条件 */
    IF vc2VendCd IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.VEND_CD = '''|| vc2VendCd || '''';
    END IF;

    /* 発注担当者の条件 */
    IF vc2PuchOdrPerson IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.PUCH_ODR_PERSON = '''|| vc2PuchOdrPerson || '''';
    END IF;

    /* 製番の条件 */
    IF vc2JobOdrCd IS NOT Null THEN
        IF INSTR(vc2JobOdrCd, '%',1,1) <= 0 THEN
            vc2SQL := vc2SQL || ' AND OD.JOB_ODR_CD = ''' || vc2JobOdrCd || '''';
        ELSE
                vc2SQL := vc2SQL || ' AND OD.JOB_ODR_CD like '''|| vc2JobOdrCd || '''';
        END IF;
    END IF;

/* 製番枝番は未使用
'
'        --//製番枝番の条件
'---- DBMS_OUTPUT.PUT_LINE('＊＊＊＊＊＊＊＊製番枝番の条件＊＊＊＊＊＊＊＊＊＊＊＊＊＊');
'    IF pvc2JobOdrDetailNo <> 0 AND pvc2JobOdrDetailNo IS NOT NULL THEN
'---- DBMS_OUTPUT.PUT_LINE('＊＊＊製番枝番('|| pvc2JobOdrDetailNo ||')');
'        vc2SQL := vc2SQL || ' AND OD.JOB_ODR_DETAIL_NO = ' || pvc2JOBODRDETAILNO;
'     END IF;
*/

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

    /* ＳＱＬ文の解析 */
    DBMS_SQL.PARSE(intItemCursorName,vc2SQL,DBMS_SQL.NATIVE);

    /* 列の定義 */
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,1,vc2PUCH_ODR_CD,100);      --// 発注番号
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,2,dtmPUCH_ODR_START_DATE); --// 発注着手日
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,3,dtmPUCH_ODR_DLV_DATE);   --// 発注納期
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,4,vc2COMPANY_CD,100);       --// 会社コード
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,5,vc2VEND_CD,100);          --// 取引先コード
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,6,vc2PLANT_CD,8);          --// 工場コード
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,7,vc2PUCH_ODR_PERSON,160);  --// 発注担当者
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,8,dtmPUCH_ODR_INST_DATE);  --// 発注指示日
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,9,numPUCH_ODR_STS_TYP);    --// 発注状態区分
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,10,numINV_CTRL_FLG);       --// 在庫管理フラグ
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,11,numPUCH_ODR_QTY);       --// 発注数
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,12,dtmRATE_JUDGE_DATE);    --// レート判定日
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,13,numAMOUNT_INCLUDE_TAX); --// 税込金額
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,14,vc2OD_NO,100);           --// オーダデマンド番号
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,15,vc2OD_JOB_ODR_CD,100);   --// 製番
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,16,vc2OD_PARENT_OD_NO,100); --// 親オーダデマンド番号

    /* カーソルの実行 */
    blnRet_EXC := DBMS_SQL.EXECUTE(intItemCursorName);

    /* 行のフェッチ */
    LOOP
        IF DBMS_SQL.FETCH_ROWS(intItemCursorName) > 0 THEN
            /* 処理件数カウント */
            numTransactionCount := numTransactionCount + 1;
            /* 値の取得 */
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,1,vc2PUCH_ODR_CD);         --// 発注番号
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,2,dtmPUCH_ODR_START_DATE); --// 発注着手日
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,3,dtmPUCH_ODR_DLV_DATE);   --// 発注納期
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,4,vc2COMPANY_CD);          --// 会社コード
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,5,vc2VEND_CD);             --// 取引先コード
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,6,vc2PLANT_CD);            --// 工場コード
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,7,vc2PUCH_ODR_PERSON);     --// 発注担当者
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,8,dtmPUCH_ODR_INST_DATE);  --// 発注指示日
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,9,numPUCH_ODR_STS_TYP);    --// 発注状態区分
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,10,numINV_CTRL_FLG);       --// 在庫管理フラグ
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,11,numPUCH_ODR_QTY);       --// 発注数
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,12,dtmRATE_JUDGE_DATE);    --// レート判定日
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,13,numAMOUNT_INCLUDE_TAX); --// 税込金額
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,14,vc2OD_NO);              --// オーダデマンド番号
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,15,vc2OD_JOB_ODR_CD);      --// 製番
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,16,vc2OD_PARENT_OD_NO);    --// 親オーダデマンド番号

            /* 抽出データの更新 */
            IF vc2VEND_CD IS Null THEN
                /* 取引先コードがNullの場合、エラーとする */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                    pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_VEND_CD,'(SBM0452)　発注番号：[ '|| vc2PUCH_ODR_CD ||']');
            ELSE
                /* 対象データのカウントアップ */
                numRowCount := numRowCount + 1;

                /* （多通貨）レート判定日が未設定 */
                IF dtmRATE_JUDGE_DATE IS Null THEN
                    /* （多通貨）邦貨換算部品パラメータ設定 */
                    pdtmRateJudgeDate       := dtmPUCH_ODR_DLV_DATE;      --レート判定日(=発注納期)
                    pvc2ExchReserveCd       := Null;                      --為替予約コード
                    pnumConvertTyp          := 1;                         --変換方向(外貨→邦貨)
                    /* （多通貨）邦貨換算部品を呼出す */
                    blnRet := FNCCURRENCYCONVERT(UTL_FileHandle,          --ファイルハンドル
                                                 pvc2LogMode,             --ＬＯＧモード
                                                 pvc2OutputMode,          --出力モード
                                                 pvc2UserId,              --ユーザＩＤ
                                                 pvc2BusinessName,        --業務名
                                                 vc2PLANT_CD,             --工場コード(#714)
                                                 vc2COMPANY_CD,           --会社コード
                                                 vc2VEND_CD,              --取引先コード
                                                 pdtmRateJudgeDate,       --レート判定日(発注納期)
                                                 pvc2ExchReserveCd,       --為替予約コード
                                                 numAMOUNT_INCLUDE_TAX,   --変換前金額
                                                 pnumConvertTyp,          --変換方向(1:外貨→邦貨)
                                                 pnumAfterAmount,         --変換後金額
                                                 pnumRoundTyp,            --端数処理区分
                                                 pnumExchRate,            --為替レート
                                                 pnumExchTyp,             --為替種別
                                                 pvc2VendCurCd,           --取引先通貨コード
                                                 pvc2VendCurName,         --取引先通貨名
                                                 pvc2VendCurSymbol,       --取引先通貨記号
                                                 pvc2VendCurUnit,         --取引先通貨単位
                                                 pnumVendDecimalFig,      --取引先小数桁数
                                                 pvc2HomeCurCd,           --自社（邦貨）通貨コード
                                                 pvc2HomeCurName,         --自社（邦貨）通貨名
                                                 pvc2HomeCurSymbol,       --自社（邦貨）通貨記号
                                                 pvc2HomeCurUnit,         --自社（邦貨）通貨単位
                                                 pnumHomeDecimalFig,      --自社（邦貨）小数桁数
                                                 pvc2ErrorCd              --エラーコード
                                                 );
                    /* （多通貨）邦貨換算部品でエラー発生 */
                    IF blnRet = FALSE THEN
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                  pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                  pvc2ErrorCd,'(SBM0452)　発注番号：[ '|| vc2PUCH_ODR_CD ||']');
                        pdtmRateJudgeDate       := Null;
                    END IF;
                /* 発注残ファイルの更新(発注状態区分 = 1 -> 2、発注指示日 = 業務運用日付、多通貨項目UP) */
                    UPDATE T_RLSD_PUCH_ODR
                        SET PUCH_ODR_STS_TYP   = 2,
                            PUCH_ODR_INST_DATE = dtmBusinessOprDate,
                            RATE_JUDGE_DATE    = pdtmRateJudgeDate,
                            EXCH_RATE          = pnumExchRate,
                            HOME_CUR_AMOUNT    = pnumAfterAmount,
                            UPDATED_DATE       = SYSDATE,
                            UPDATED_BY         = pvc2UserId,
                            UPDATED_PRG_NM     = MY_SQL_NAME,
                            MODIFY_COUNT       = MODIFY_COUNT + 1
                        WHERE
                            PUCH_ODR_CD        = vc2PUCH_ODR_CD AND
                            PUCH_ODR_STS_TYP   = 1
                        ;
                ELSE
                /* 発注残ファイルの更新(発注状態区分 = 1 -> 2、発注指示日 = 業務運用日付) */
                    UPDATE T_RLSD_PUCH_ODR
                        SET PUCH_ODR_STS_TYP   = 2,
                            PUCH_ODR_INST_DATE = dtmBusinessOprDate,
                            UPDATED_DATE       = SYSDATE,
                            UPDATED_BY         = pvc2UserId,
                            UPDATED_PRG_NM     = MY_SQL_NAME,
                            MODIFY_COUNT       = MODIFY_COUNT + 1
                        WHERE
                            PUCH_ODR_CD        = vc2PUCH_ODR_CD AND
                            PUCH_ODR_STS_TYP   = 1
                        ;
                END IF;
                /*発注指示権限が1：承認者、かつ、ログインユーザの承認権限"が1:承認者の場合*/
                IF vc2ApprPurInst = 1 AND vc2ApprPowerTyp  = 1 THEN

                         UPDATE  T_RLSD_PUCH_ODR
                         SET APPR_ID   = pvc2UserId,
                            APPR_DATE = dtmBusinessOprDate,
                            UPDATED_DATE       = SYSDATE,
                            UPDATED_BY         = pvc2UserId,
                            UPDATED_PRG_NM     = MY_SQL_NAME,
                            MODIFY_COUNT       = MODIFY_COUNT + 1
                         WHERE
                            PUCH_ODR_CD        = vc2PUCH_ODR_CD
                            ;
                END IF;
                pvc2ErrorCd := null;

                /* 出庫指示処理(外作)を実行する */
                blnRet := FNCPUCHODRINSTOUTSIDEISSUE(UTL_FileHandle,          --ファイルハンドル
                                                    pvc2LogMode,             --ＬＯＧモード
                                                    pvc2OutputMode,          --出力モード
                                                    pvc2UserId,              --ユーザＩＤ
                                                    pvc2BusinessName,        --業務名
                                                    vc2PLANT_CD,             --工場コード(#714)
                                                    vc2PUCH_ODR_CD,          --発注番号
                                                    vc2OD_NO,                --オーダデマンド番号
                                                    numPUCH_ODR_QTY,         --発注数
                                                    vc2COMPANY_CD,           --会社コード
                                                    vc2VEND_CD,              --取引先コード
                                                    pvc2ErrorCd              --エラーコード
                                                    );

                 /* 出庫指示処理(外作)で致命的エラー発生 */
                IF blnRet = FALSE THEN
                    IF pvc2ErrorCd = 'ZZ11006' OR pvc2ErrorCd = 'ZZ06001' THEN
                        ROLLBACK;
                        --保管区が存在しない
                        IF pvc2ErrorCd = 'ZZ11006' THEN
                            blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                    pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_WH_CD, '(SBM0452)発注番号：['|| vc2PUCH_ODR_CD ||']');
                        END IF;
                        --パラメータが存在しない
                        IF pvc2ErrorCd = 'ZZ06001' THEN
                            blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                    pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTEXIST_SYS_PARAMETER, '(SBM0399)工場コード：['|| vc2PLANT_CD ||']');
                        END IF;
                        COMMIT;
                    ELSE
                        RAISE excFNCPUCHODRINSTOUTSIDEISSUE;
                    END IF;
                ELSE
                    numCountNormal := numCountNormal + 1;
/* 毎回COMMITする */
                    COMMIT;
                END IF;
            END IF;
        ELSE
            EXIT;
        END IF;
    END LOOP;

    /* コミット(COMMIT) */
    COMMIT;

    /* カーソルクローズ */
    DBMS_SQL.CLOSE_CURSOR(intItemCursorName);

/* 処理の終了 */

    /* 業務終了メッセージの作成 */

    vc2Comment      := SUBSTR('　処理件数：' || '[ ' || numTransactionCount || ' ]' ||
                              '　対象件数：' || '[ ' || numRowCount || ' ]' ||
                              '　正常件数：' || '[ ' || numCountNormal || ' ]',1,256);

    /* 終了メッセージの出力 */
    blnRet          := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,
                                 pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                                 '(SBM0520)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

    COMMIT;

    /* トレースログの出力(終了) */
    blnRet          := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    COMMIT;

    /* LogFile の CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_GET_BUSINESS_DATE THEN    --業務日付取得エラー

            ROLLBACK;

            vc2Comment := SUBSTR('業務日付取得に失敗しました',1,256);

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                           '(SBM0521)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excERR_NOTENTRY_PLANT_CD THEN    --工場コード未入力エラー

            ROLLBACK;

            vc2Comment := SUBSTR('工場コードが指定されていません。',1,256);

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0522)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excERR_NOTENTRY_DATE_CD THEN    --日付項目未入力エラー

            ROLLBACK;

            vc2Comment := SUBSTR('発注予定日または、発注納期日が指定されていません。',1,256);

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0523)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excFNCPUCHODRINSTOUTSIDEISSUE THEN    --出庫指示処理(外作)でエラー発生

            ROLLBACK;

            vc2Comment := SUBSTR('出庫指示処理で致命的エラーが発生しました',1,256);

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0524)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excOthers  THEN   --その他のエラー

            ROLLBACK;

            vc2Comment := SUBSTR('＊＊＊その他のエラーが発生しました＊＊＊',1,256);

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0525)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
END;
/
