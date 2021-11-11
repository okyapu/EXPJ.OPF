CREATE OR REPLACE PROCEDURE SqlLoadCalc(
/*------------------------------------------------------------------------------
'
' SQL_NAME  : SqlLoadCalc.Sql
' version   : 1.00.00
'
' 修正履歴
' 2003.09.30 初版
' 2004.02.24 UPD BY CNES カレンダ取得時、システム日付ではなく業務運用日の前後180日とするよう修正
'                        カレンダ不足エラー時、メッセージ追加
' 2005.10.24 unicode対応（varchar2を4倍）
'
' 機能      : 負荷シミュレーション
'
' 引き数    ■MetamorBase共通
'           : pvc2LogMode         - (i)ＬＯＧモード
'                 pvc2OutputMode      - (i)出力モード
'                 pvc2OutputPath      - (i)出力ファイルパス
'                 pvc2OutputName      - (i)出力ファイル名
'                 pvc2UserId          - (i)ユーザＩＤ
'                 pvc2BusinessName    - (i)業務名
'             pvc2PlantCd         - (i)工場コード
'       ■負荷シミュレーション
'                       : 無し
'
' 戻り値        ■負荷シミュレーション
'                       : pnumReturn          - (o)処理結果判定(0:正常終了 1:異常終了)
'
' 機能説明  : 負荷シミュレーションを行う
'
' 備考
'
------------------------------------------------------------------------------*/
     pvc2LogMode         IN VARCHAR2    -- ＬＯＧモード
    ,pvc2OutputMode      IN VARCHAR2    -- 出力モード
    ,pvc2OutputPath      IN VARCHAR2    -- 出力パス
    ,pvc2OutputName      IN VARCHAR2    -- 出力ファイル名
    ,pvc2UserId          IN VARCHAR2    -- ユーザＩＤ
    ,pvc2BusinessName    IN VARCHAR2    -- 業務名
    ,pvc2PlantCd         IN VARCHAR2    -- 工場コード
    ,pnumReturn          OUT NUMBER    -- 処理結果判定
)
IS
    -- 例外の宣言
    excGetPlant              EXCEPTION;    -- 工場取得エラー
--    excGetMyCompany          EXCEPTION;    -- 自社取得エラー
    excMistakeCommonParam    EXCEPTION;    -- 共通の入力パラメータ異常
    excMistakeNativeParam    EXCEPTION;    -- 固有の入力パラメータ異常
    excGetNewLoadCd          EXCEPTION;    -- 負荷識別番号取得異常
    excGetLoadData           EXCEPTION;    -- 負荷データ取得異常
    excGetResourceData       EXCEPTION;    -- 資源取得エラー
    excGetDateData           EXCEPTION;    -- 日付取得エラー
    excSysLoadCalcPeriod     EXCEPTION;    -- 負荷計画期間取得エラー
    excNeckProcLtZero        EXCEPTION;    -- 制約工程LTゼロ以下エラー

    -- 定数の宣言
    MY_SQL_NAME             VARCHAR2(128) := 'SqlLoadCalc';
    FIRST_MODIFY_COUNT      NUMBER       := 0;               -- 新規作成テーブルの初回の更新数
--    CTRL_CD_DEFAULT         VARCHAR2(24)  := 'SYSTEM';        -- コントロール系テーブルのPrimaryKeyの値
    LOAD_CALC_TYP_NOTRUN    VARCHAR(1)   := '0';             -- 負荷計画計算区分(負荷未計算)
    LOAD_CALC_TYP_RUN       VARCHAR(1)   := '1';             -- 負荷計画計算区分(負荷計算中)
    LOAD_CALC_TYP_END       VARCHAR(1)   := '9';             -- 負荷計画計算区分(負荷計算済)
    MINIMUM_BEAM            NUMBER(2)    := 6;               -- 負荷量最小桁(切り上げ用)
    MINIMUM_BEAM_QTY        NUMBER(7,6)  := 0.000001;        -- 負荷量最小桁値(切り上げ用)
    LOAD_DATE_QTY_INIT      NUMBER(1)    := 1;               -- 負荷山積み日数初期値
    HOLIDAY_FLG_OFF         NUMBER(1)    := 0;               -- 休日区分(0:稼働日)

    -- 変数の宣言
    UTL_FileHandle          UTL_FILE.FILE_TYPE;    -- ファイルハンドル
    blnRet                  BOOLEAN;               -- 関数戻り値
    intRet                  INTEGER;               -- 関数戻り値
    vc2Comment              VARCHAR2(1024);         -- メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);         -- 実行位置確認用コメント作成作業領域
    vc2TraceComment     VARCHAR2(1024);         -- トレーース出力用コメント作成作業領域（入力パラメータ記録用）
--    vc2CompanyCd      VARCHAR2(8);           -- 会社コード
    vc2LoadCd               VARCHAR2(100);          -- 負荷明細識別番号
    numTgtCnt               NUMBER;                -- 処理件数
    dtmCalcFromDate         DATE;                  -- 負荷計算期間(From)
    dtmCalcToDate           DATE;                  -- 負荷計算期間(To)
    dtmStartDate            DATE;                  -- 製造着手日
    dtmOdrStartDate         DATE;                  -- 手配着手日
    dtmDueDate              DATE;                  -- 製造納期
    dtmWorkDueDate              DATE;              -- 納期ワーク
    numOrdQty               NUMBER(24,6);          -- オーダ数
    numWorkQty              NUMBER(24,6);          -- 計算用ワーク変数
    numWorkLt               NUMBER(6);          -- ワークLT
    vc2LoadCd_Min           VARCHAR2(100);          -- 負荷明細識別番号最大値
    vc2LoadCd_Max           VARCHAR2(100);          -- 負荷明細識別番号最小値
    numProcStartIdleDate    NUMBER(6);             -- 着手アイドルタイム
    numNeckProcLt           NUMBER(6);             -- リードタイム
    numCalNo                NUMBER(6);          -- カレンダ番号
    numCalCnt               NUMBER(6);          -- 該当カレンダカウント(製造着手日～製造納期)
NumLoadQty NUMBER(24,6);

    -- 負荷山積み作成用配列
    TYPE W_LOAD_DATA_R IS RECORD(
        dtmLoadStartDate DATE,           -- 負荷山積み開始日
        numLoadDateQty   NUMBER(5),      -- 負荷山積み日数
        dtmLoadDate      DATE,           -- 負荷山積み日
        numLoadQty       NUMBER(24,6)    -- 負荷量
    );
    TYPE W_LOAD_DATA_T IS TABLE OF W_LOAD_DATA_R INDEX BY BINARY_INTEGER;
    typW_LOAD_DATA W_LOAD_DATA_T;
    -- 負荷山積み作成用配列INDEX宣言
    intIND      BINARY_INTEGER;    -- INDEX
    intIND_W    BINARY_INTEGER;    -- INDEX WORK

    -- カレンダ格納配列宣言
    TYPE typMCAL_T IS TABLE OF DATE INDEX BY BINARY_INTEGER;
    typMCAL    typMCAL_T;
    -- カレンダ格納配列INDEX宣言
    intIND_CAL      BINARY_INTEGER;    -- INDEX
    intIND_CAL_W    BINARY_INTEGER;    -- INDEX WORK

    -- MESSAGE の宣言
    APS_COM_BATCH_START             VARCHAR2(28)    := 'ZZ09001';    -- バッチ処理を開始しました
    APS_COM_BATCH_END               VARCHAR2(28)    := 'ZZ09002';    -- バッチ処理を終了しました
    APS_COM_NOTEXIST_MY_COMPANY     VARCHAR2(28)    := 'AL30003';    -- 自社データが存在しません
    APS_COM_MISTAKE_COMMON_PARAM    VARCHAR2(28)    := 'AL30001';    -- 共通の入力パラメータが誤っています
    APS_COM_NOTEXIST_PLANT          VARCHAR2(28)    := 'AL30004';    -- 工場データが存在しません
    APS_COM_NOTEXIST_LOAD_PLAN      VARCHAR2(28)    := 'AL50008';    -- 負荷計算期間データが存在しません
    APS_COM_ZERO_NECK_PROC_LT       VARCHAR2(28)    := 'AL60005';    -- 制約工程のリードタイムがゼロ以下です
    APS_COM_NOTEXIST_RESOURCE       VARCHAR2(28)    := 'AL60006';    -- 資源データが存在しません
    APS_COM_NOTEXIST_LOAD_CD        VARCHAR2(28)    := 'AL60007';    -- 負荷明細識別番号を取得できません
    APS_COM_NOTEXIST_CALENDER       VARCHAR2(28)    := 'AL60008';    -- カレンダが不足しています
    APS_COM_ORACLE_ERR              VARCHAR2(28)    := 'ZZ01106';    -- ＯＲＡＣＬＥエラー

    -- LOG の宣言
    LOGMSG_START         VARCHAR2(20)     := 'Start';         -- ログ用メソッド開始宣言
    LOGMSG_END           VARCHAR2(12)     := 'End';           -- ログ用メソッド終了宣言
    LOGMSG_ERR           VARCHAR2(32)     := '異常終了';
    LOGMSG_START_PGNM    VARCHAR2(192)    := '(SBM0400)<< 負荷シミュレーション処理開始 >>';
    LOGMSG_END_PGNM      VARCHAR2(192)    := '<< 負荷シミュレーション処理終了 >>';
    LOGMSG_PARAM         VARCHAR2(64)    := '入力パラメータ：';
    LOGMSG_TGTCNT        VARCHAR2(40)    := '対象件数：';
    LOGMSG_DONECNT       VARCHAR2(40)    := '正常件数：';
    LOGMSG_WARCNT        VARCHAR2(64)    := 'ワーニング件数：';
    LOGMSG_FATALCNT      VARCHAR2(40)    := '異常件数：';
    LOGMSG_BRACKETS      VARCHAR2(4)     := '[';
    LOGMSG_BRACKETE      VARCHAR2(4)     := ']';
    LOGMSG_COMMA         VARCHAR2(4)     := ',';

    -- カーソルの宣言
    -- 負荷計画
    CURSOR curT_LOAD_PLAN(
         cvc2PlantCd VARCHAR2
        ,cvc2LoadCalcTyp VARCHAR2
    )
    IS
        SELECT A.LOAD_PLAN_CD,A.PLANT_CD,A.ITEM_CD,A.JOB_ODR_CD,A.PRD_DUE_DATE,A.ODR_QTY,A.ENTRY_BY,
               NVL(B.ISSUE_LT,0) ISSUE_LT
        FROM   T_LOAD_PLAN A, 
               (
                   SELECT PLAN_ITEM_CD,ISSUE_LT FROM M_LOAD_PS WHERE PLAN_ITEM_CD = ITEM_CD
                ) B 
        WHERE  PLANT_CD = cvc2PlantCd
        AND    LOAD_CALC_TYP = cvc2LoadCalcTyp
        AND    A.ITEM_CD = B.PLAN_ITEM_CD(+)
        FOR UPDATE;

    -- 負荷構成
    CURSOR curM_LOAD_PS(
         cvc2ItemCd VARCHAR2
    )
    IS
        SELECT PLAN_ITEM_CD,ITEM_CD,LOAD_PS_CD,MRP_ODR_TYP,PLAN_ITEM_LT,ODR_LT,
        FIXED_LT,SAFETY_LT,ISSUE_LT,PS_UNIT_QTY,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE
        FROM   M_LOAD_PS 
        WHERE  PLAN_ITEM_CD = cvc2ItemCd
        ORDER BY ITEM_CD ASC,LOAD_PS_CD ASC
        ;

    -- 制約工程マスタ(着手アイドルタイム昇順、制約工程コード昇順 資産マスタとの結合有り)
    CURSOR curM_NECK_WS(
         cvc2PlantCd VARCHAR2
        ,cvc2ItemCd VARCHAR2
    )
    IS
        SELECT A.ITEM_CD,A.NECK_PROC_CD,A.PROC_START_IDLE_DATE,A.NECK_PROC_LT,A.LOAD_ASSIGN_TYP,A.UNIT_LOAD,
               DECODE(B.PLANT_CD,NULL,0,1) NECK_PROC_FLG
        FROM   M_NECK_WS A,M_RESOURCE B
        WHERE  A.PLANT_CD = cvc2PlantCd
        AND    A.ITEM_CD = cvc2ItemCd
        AND    A.PLANT_CD = B.PLANT_CD(+)
        AND    A.NECK_PROC_CD = B.NECK_PROC_CD(+)
        ORDER BY A.PROC_START_IDLE_DATE ASC,A.NECK_PROC_CD ASC
        ;

--2004.02.24 UPD
--    -- カレンダマスタ(システム日付の前後180日分の稼働日を取得する)
--    CURSOR curM_CAL(
--        cnumCalNo NUMBER,
--        cnumHolidayFlg NUMBER
--    )
--    IS
--        SELECT CAL_DATE
--            FROM   M_CAL
--            WHERE CAL_NO = cnumCalNo
--            AND   CAL_DATE >= SYSDATE - 180 
--            AND   CAL_DATE <= SYSDATE + 180 
--            AND   HOLIDAY_FLG = cnumHolidayFlg
--            ORDER BY CAL_DATE ASC
--            ;
    -- カレンダマスタ(業務運用日の前後180日分の稼働日を取得する)
    CURSOR curM_CAL(
        cvc2PlantCd VARCHAR2,
        cnumCalNo NUMBER,
        cnumHolidayFlg NUMBER
    )
    IS
        SELECT CAL_DATE
            FROM   M_CAL
            WHERE CAL_NO = cnumCalNo
            AND   CAL_DATE >= (SELECT BUSINESS_OPR_DATE FROM SYS_DATE_CTRL WHERE PLANT_CD = cvc2PlantCd) - 180 
            AND   CAL_DATE <= (SELECT BUSINESS_OPR_DATE FROM SYS_DATE_CTRL WHERE PLANT_CD = cvc2PlantCd) + 180 
            AND   HOLIDAY_FLG = cnumHolidayFlg
            ORDER BY CAL_DATE ASC
            ;

    -- カレンダ逆算
    CURSOR curM_CAL_DESC(
        cnumCalNo NUMBER,
        cdtmCAL_DATE DATE,
        cnumHolidayFlg NUMBER
    )
    IS
        SELECT CAL_DATE
            FROM   M_CAL
            WHERE CAL_NO = cnumCalNo
            AND   CAL_DATE >= cdtmCAL_DATE - 30 
            AND   CAL_DATE <= cdtmCAL_DATE
            AND   HOLIDAY_FLG = cnumHolidayFlg
            ORDER BY CAL_DATE DESC
            ;

    -- 負荷識別番号採番(データロック用)
    CURSOR curSYS_LOAD_CD_CTRL 
    IS
        SELECT  LOAD_CD
        FROM    SYS_LOAD_CD_CTRL
        WHERE   PLANT_CD = pvc2PlantCd
        FOR UPDATE;

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

pnumReturn := 1;

vc2RunChkComment := NULL;

/*------------------------------------------------------------
'　ログのオープンと開始メッセージの出力
-------------------------------------------------------------*/

    -- トレース出力用にパラメータを記録
    vc2TraceComment := '<<';
    vc2TraceComment := vc2TraceComment || LOGMSG_PARAM || LOGMSG_BRACKETS || pvc2LogMode || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputMode || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputPath || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputName || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2UserId || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2BusinessName || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2PlantCd || LOGMSG_BRACKETE || '>>';
    vc2TraceComment := SUBSTR(vc2TraceComment,1,256);

    -- LogFileのOPEN
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd,pvc2OutputMode,UTL_FileHandle);

    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- 開始メッセージの出力
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, LOGMSG_START_PGNM);

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
    IF  pvc2LogMode IS NULL THEN    -- ＬＯＧモードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputMode IS NULL THEN -- 出力モードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputPath IS NULL THEN -- 出力パスがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputName IS NULL THEN -- 出力ファイル名がＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2UserId IS NULL THEN     -- ユーザＩＤがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2BusinessName IS NULL THEN   -- 業務名がＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2PlantCd IS NULL THEN    -- 工場コードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;

    -- 固有の入力パラメータのチェック
    -- 無し

/*------------------------------------------------------------
'　自社マスタをチェックする
'　会社コードを取得する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--    -- 自社マスタのチェック
--    BEGIN
--        SELECT  COMPANY_CD INTO vc2CompanyCd
--            FROM   SYS_MY_COMPANY
--            WHERE  SYS_MY_COMPANY.CTRL_CD = CTRL_CD_DEFAULT;  -- SYSTEMが設定
--    EXCEPTION
--        WHEN NO_DATA_FOUND THEN
--            RAISE excGetMyCompany;
--        WHEN OTHERS THEN
--            RAISE;
--    END;

/*------------------------------------------------------------
'　工場マスタをチェックする
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 工場マスタのチェック
    BEGIN
        SELECT CAL_NO INTO numCalNo
            FROM   M_PLANT
            WHERE  PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetPlant;
        WHEN OTHERS THEN
            RAISE;
    END;

/*------------------------------------------------------------
'　負荷計算期間を検索する
'　代表納入場所を取得する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 負荷計算期間の検索
    BEGIN
        SELECT CALC_FROM_DATE,CALC_TO_DATE INTO dtmCalcFromDate,dtmCalcToDate
            FROM   SYS_LOAD_CALC_PERIOD
            WHERE  PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excSysLoadCalcPeriod;
        WHEN OTHERS THEN
            RAISE;
    END;


/*------------------------------------------------------------
'　負荷計算負荷を更新する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00045';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    UPDATE T_LOAD_PLAN 
    SET    LOAD_CALC_TYP = LOAD_CALC_TYP_RUN
          ,UPDATED_DATE   = SYSDATE
          ,UPDATED_BY     = pvc2UserId
          ,UPDATED_PRG_NM = MY_SQL_NAME
          ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd
    AND    LOAD_CALC_TYP = LOAD_CALC_TYP_NOTRUN;

    COMMIT;

/*------------------------------------------------------------
'　負荷識別番号取得を取得する
'　代表納入場所を取得する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 初回の採番のみ取得関数を使用する
    
    -- 負荷識別番号取得
    blnRet := FncGetNewLoadCd(UTL_FileHandle
                              ,pvc2LogMode
                              ,pvc2OutputMode
                              ,pvc2UserId
                              ,pvc2BusinessName
                              ,pvc2PlantCd
                              ,vc2LoadCd
                              );
    IF blnRet = FALSE THEN
        RAISE excGetNewLoadCd;
    END IF;

    -- ソース内でカウントアップするため工場コードをはずす
    vc2LoadCd := SUBSTR(vc2LoadCd,LENGTH(pvc2PlantCd)+1,25);
    -- 負荷識別番号MIN値取得
    vc2LoadCd_Min := LPAD('0',LENGTH(vc2LoadCd),'0');
    -- 負荷識別番号MAX値取得
    vc2LoadCd_Max := LPAD('9',LENGTH(vc2LoadCd),'9');

    -- 負荷識別番号採番テーブルロック
    OPEN curSYS_LOAD_CD_CTRL;

/*------------------------------------------------------------
'　カレンダを配列に格納する
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    intIND_CAL := 1;

-- 2004.02.24 UPD
--    FOR curM_CAL_REC IN curM_CAL(numCalNo,HOLIDAY_FLG_OFF) LOOP
    FOR curM_CAL_REC IN curM_CAL(pvc2PlantCd,numCalNo,HOLIDAY_FLG_OFF) LOOP

        typMCAL(intIND_CAL) := curM_CAL_REC.CAL_DATE;
        intIND_CAL := intIND_CAL + 1;

    END LOOP;

/*------------------------------------------------------------
'　負荷シミュレーション実行
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 処理件数初期化
    numTgtCnt := 0;

    -- 負荷計画カーソル
    FOR curT_LOAD_PLAN_REC IN curT_LOAD_PLAN(
        pvc2PlantCd,
        LOAD_CALC_TYP_RUN) LOOP

--vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


        -- 負荷構成カーソル
        FOR curM_LOAD_PS_REC IN curM_LOAD_PS(curT_LOAD_PLAN_REC.ITEM_CD) LOOP

            -- 手配着手日取得(負荷構成の有効開始,終了日の比較に使用するため)
            dtmOdrStartDate := NULL;
            -- カレンダ配列ループ
            FOR i IN 1..intIND_CAL - 1 LOOP
                IF curT_LOAD_PLAN_REC.PRD_DUE_DATE <= typMCAL(i) THEN
                    IF i > (curM_LOAD_PS_REC.PLAN_ITEM_LT 
                            - curT_LOAD_PLAN_REC.ISSUE_LT) THEN
                        dtmOdrStartDate := typMCAL(i - (curM_LOAD_PS_REC.PLAN_ITEM_LT 
                                                        - curT_LOAD_PLAN_REC.ISSUE_LT));
                        EXIT;
                    ELSE
-- 2004.02.24 UPD
                        vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD：'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD：'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO：'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE1：'||TO_CHAR(curT_LOAD_PLAN_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT：'||TO_CHAR(- (curM_LOAD_PS_REC.PLAN_ITEM_LT
                                                        - curT_LOAD_PLAN_REC.ISSUE_LT))||LOGMSG_BRACKETE
                                      ,1,256);

                        RAISE excGetDateData;
                    END IF;
                END IF;
            END LOOP;
            IF dtmOdrStartDate IS NULL THEN
-- 2004.02.24 UPD
                vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD：'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD：'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO：'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE2：'||TO_CHAR(curT_LOAD_PLAN_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT：0'||LOGMSG_BRACKETE
                                      ,1,256);

                RAISE excGetDateData;
            END IF;


            -- 製造着手日取得
            dtmStartDate := NULL;
            -- カレンダ配列ループ
            FOR i IN 1..intIND_CAL - 1 LOOP
                IF curT_LOAD_PLAN_REC.PRD_DUE_DATE <= typMCAL(i) THEN
                    IF i > (curM_LOAD_PS_REC.PLAN_ITEM_LT 
                            + curM_LOAD_PS_REC.FIXED_LT
                            + curM_LOAD_PS_REC.SAFETY_LT
                            + curM_LOAD_PS_REC.ISSUE_LT
                            - curT_LOAD_PLAN_REC.ISSUE_LT) THEN
                        dtmStartDate := typMCAL(i - (curM_LOAD_PS_REC.PLAN_ITEM_LT 
                                                        + curM_LOAD_PS_REC.FIXED_LT
                                                        + curM_LOAD_PS_REC.SAFETY_LT
                                                        + curM_LOAD_PS_REC.ISSUE_LT
                                                        - curT_LOAD_PLAN_REC.ISSUE_LT));
                        EXIT;
                    ELSE
-- 2004.02.24 UPD
                        vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD：'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD：'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO：'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE3：'||TO_CHAR(curT_LOAD_PLAN_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT：'||TO_CHAR(- (curM_LOAD_PS_REC.PLAN_ITEM_LT
                                                        + curM_LOAD_PS_REC.FIXED_LT
                                                        + curM_LOAD_PS_REC.SAFETY_LT
                                                        + curM_LOAD_PS_REC.ISSUE_LT
                                                        - curT_LOAD_PLAN_REC.ISSUE_LT))||LOGMSG_BRACKETE
                                      ,1,256);

                        RAISE excGetDateData;
                    END IF;
                END IF;
            END LOOP;
            IF dtmStartDate IS NULL THEN
-- 2004.02.24 UPD
                vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD：'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                              LOGMSG_BRACKETS||'ITEM_CD：'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                              LOGMSG_BRACKETS||'CAL_NO：'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                              LOGMSG_BRACKETS||'DATE4：'||TO_CHAR(curT_LOAD_PLAN_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                              LOGMSG_BRACKETS||'LT：0'||LOGMSG_BRACKETE
                              ,1,256);

                RAISE excGetDateData;
            END IF;
            -- 製造納期取得
            dtmDueDate := NULL;
            -- カレンダ配列ループ
            FOR i IN 1..intIND_CAL - 1 LOOP
                IF dtmStartDate <= typMCAL(i) THEN
                    IF intIND_CAL - 1 >= i + curM_LOAD_PS_REC.FIXED_LT  + curM_LOAD_PS_REC.SAFETY_LT THEN
                        dtmDueDate := typMCAL(i + curM_LOAD_PS_REC.FIXED_LT + curM_LOAD_PS_REC.SAFETY_LT);
                        EXIT;
                    ELSE
-- 2004.02.24 UPD
                        vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD：'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD：'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO：'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE5：'||TO_CHAR(dtmStartDate,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT：'||TO_CHAR(curM_LOAD_PS_REC.FIXED_LT  + curM_LOAD_PS_REC.SAFETY_LT + 1)||LOGMSG_BRACKETE
                                      ,1,256);

                        RAISE excGetDateData;
                    END IF;
                END IF;
            END LOOP;
            IF dtmDueDate IS NULL THEN
-- 2004.02.24 UPD
                vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD：'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD：'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO：'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE6：'||TO_CHAR(dtmStartDate,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT：0'||LOGMSG_BRACKETE
                                      ,1,256);

                RAISE excGetDateData;
            END IF;

-- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, TO_CHAR(dtmOdrStartDate,'YYYY/MM/DD')||'*'||TO_CHAR(dtmStartDate,'YYYY/MM/DD')||'*'||TO_CHAR(dtmDueDate,'YYYY/MM/DD'));
            -- オーダ数計算
            numOrdQty := ROUND((curT_LOAD_PLAN_REC.ODR_QTY * curM_LOAD_PS_REC.PS_UNIT_QTY),MINIMUM_BEAM);
            IF numOrdQty < (curT_LOAD_PLAN_REC.ODR_QTY * curM_LOAD_PS_REC.PS_UNIT_QTY) THEN
                numOrdQty := ROUND((curT_LOAD_PLAN_REC.ODR_QTY * curM_LOAD_PS_REC.PS_UNIT_QTY),MINIMUM_BEAM)
                             + MINIMUM_BEAM_QTY;
            END IF;
--DBMS_OUTPUT.PUT_LINE(TO_CHAR(curT_LOAD_PLAN_REC.ODR_QTY)||'*'||TO_CHAR(curM_LOAD_PS_REC.PS_UNIT_QTY)||'='||TO_CHAR(numOrdQty));


--vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            -- 制約工程マスタカーソル
            FOR curM_NECK_WS_REC IN curM_NECK_WS(pvc2PlantCd,curM_LOAD_PS_REC.ITEM_CD) LOOP

                --制約工程のリードタイムがゼロ以下の場合エラー処理へ
                IF curM_NECK_WS_REC.NECK_PROC_LT <= 0 THEN
                    -- 終了メッセージの作成
                    vc2Comment := SUBSTR('(SBM0401)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：制約工程LTゼロ以下エラー'||
                                         LOGMSG_BRACKETS||'PLANT_CD:'||pvc2PlantCd||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'ITEM_CD:'||curM_NECK_WS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'NECK_PROC_CD:'||curM_NECK_WS_REC.NECK_PROC_CD||LOGMSG_BRACKETE,
                                         1,256);
                    RAISE excNeckProcLtZero;
                END IF;

                -- 資源マスタが無い場合エラー処理へ
                IF curM_NECK_WS_REC.NECK_PROC_FLG = 0 THEN
                    -- 終了メッセージの作成
                    vc2Comment := SUBSTR('(SBM0402)'||LOGMSG_END_PGNM || LOGMSG_ERR || '：資源取得エラー'||
                                         LOGMSG_BRACKETS||'PLANT_CD:'||pvc2PlantCd||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'NECK_PROC_CD:'||curM_NECK_WS_REC.NECK_PROC_CD||LOGMSG_BRACKETE,
                                         1,256);
                    RAISE excGetResourceData;
                END IF;

                -- INDEX初期化
                intIND := 1;

                numCalCnt := 0;

                -- 着手アイドルタイム取得
                numProcStartIdleDate := curM_NECK_WS_REC.PROC_START_IDLE_DATE;
                -- リードタイム取得
                numNeckProcLt := curM_NECK_WS_REC.NECK_PROC_LT;

                numWorkLt := 0;
                -- カレンダ配列ループ(リードタイム再計算のため)
                FOR i IN 1..intIND_CAL - 1 LOOP

                    IF typMCAL(i) >= dtmStartDate THEN
                        IF typMCAL(i) >= GREATEST(dtmStartDate,dtmDueDate) THEN
                            EXIT;
                        END IF;
                        numWorkLt := numWorkLt + 1;
                    END IF;
                END LOOP;
                numWorkLt := GREATEST(1,numWorkLt);
                IF numWorkLt < numProcStartIdleDate + numNeckProcLt THEN
                    IF numWorkLt <= numNeckProcLt THEN
                        numProcStartIdleDate := 0;
                        numNeckProcLt := numWorkLt;
                    ELSE
                        numProcStartIdleDate := numWorkLt - numNeckProcLt;
--                        numNeckProcLt := numWorkLt;--変更無し
                        
                    END IF;
                END IF;

--vc2RunChkComment := '●●●●通過 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                -- カレンダ配列ループ
                FOR i IN 1..intIND_CAL - 1 LOOP

                    -- 製造着手日以上のカレンダまで検索する
                    IF typMCAL(i) >= dtmStartDate THEN

                        -- 負荷山積み開始日取得のため着手アイドルタイム分カレンダを進める
                        IF numProcStartIdleDate <= 0 THEN

                            -- 負荷明細配列に登録する
                            IF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 1 THEN -- 負荷割付区分が均等

--vc2RunChkComment := '●●●●通過 00110'||TO_CHAR(typMCAL(i),'YYYYMMDD')||' '||TO_CHAR(numProcStartIdleDate);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- 負荷山積み開始日をカレンダから取得(初回のみ)、後はその値をコピーする
                                IF intIND = 1 THEN
                                    typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);
                                ELSE
                                    typW_LOAD_DATA(intIND).dtmLoadStartDate := typW_LOAD_DATA(1).dtmLoadStartDate;
                                END IF;

                                -- 負荷山積み日数にリードタイムをセット
                                typW_LOAD_DATA(intIND).numLoadDateQty := GREATEST(1,curM_NECK_WS_REC.NECK_PROC_LT);

                                -- 負荷山積み日をカレンダから取得
                                typW_LOAD_DATA(intIND).dtmLoadDate := typMCAL(i);

                                -- 負荷山積数量を取得(後で負荷山積み日数で除算する)
                                numWorkQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (numOrdQty * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD / typW_LOAD_DATA(intIND).numLoadDateQty),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;

                                numCalCnt := numCalCnt + 1;

                            ELSIF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 2 THEN -- 負荷割付区分が初日全

--vc2RunChkComment := '●●●●通過 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- 負荷山積み開始日をカレンダから取得
                                typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);

                                -- 負荷山積み日数に初期値をセット
                                typW_LOAD_DATA(intIND).numLoadDateQty := LOAD_DATE_QTY_INIT;

                                -- 負荷山積み日をカレンダから取得
                                typW_LOAD_DATA(intIND).dtmLoadDate := typMCAL(i);

                                -- 負荷山積数量を取得(後で負荷山積み日数で除算する)
                                numWorkQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (numOrdQty * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD / LOAD_DATE_QTY_INIT),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;

                                -- 1件取得で良いためカレンダのループを抜ける
                                numCalCnt := 1;
                                EXIT;

                            ELSIF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 3 THEN  -- 負荷割付区分が最終日全

--vc2RunChkComment := '●●●●通過 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- 負荷山積み開始日をカレンダから取得
                                typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);

                                -- 負荷山積み日数に初期値をセット
                                typW_LOAD_DATA(intIND).numLoadDateQty := LOAD_DATE_QTY_INIT;

                                -- 負荷山積み日をカレンダとリードタイムから取得
                                IF intIND_CAL - 1 >= i + numNeckProcLt THEN

                                    dtmWorkDueDate := dtmDueDate - 1;
                                    FOR curM_CAL_DESC_REC IN curM_CAL_DESC(numCalNo,dtmWorkDueDate,HOLIDAY_FLG_OFF) LOOP
                                        dtmWorkDueDate := curM_CAL_DESC_REC.CAL_DATE;
                                        EXIT;
                                    END LOOP;


                                    typW_LOAD_DATA(intIND).dtmLoadDate := GREATEST(typMCAL(i),LEAST(typMCAL(i + numNeckProcLt),dtmWorkDueDate));

                                ELSE
-- 2004.02.24 UPD
                                    vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD：'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD：'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO：'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE6：'||TO_CHAR(dtmDueDate,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT：'||TO_CHAR(-(1 + i + numNeckProcLt))||LOGMSG_BRACKETE
                                      ,1,256);

                                    RAISE excGetDateData;
                                END IF;

                                -- 負荷山積数量を取得(後で負荷山積み日数で除算する)
                                numWorkQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (numOrdQty * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD / LOAD_DATE_QTY_INIT),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;     

                                -- 1件取得で良いためカレンダのループを抜ける
                                numCalCnt := 1;
                                EXIT;   

                            END IF;

                            -- カレンダが(製造納期-稼働日1日)以上になった場合 ループを抜ける
                            IF dtmDueDate <= typMCAL(i + 1) THEN
                                EXIT;
                            END IF;

                            -- リードタイムカウントダウン ゼロ以下でループを抜ける
                            numNeckProcLt := numNeckProcLt - 1;
                            IF numNeckProcLt <= 0 THEN
                                EXIT;
                            END IF;
                        ELSE
                            -- 着手アイドルタイムカウントダウン
                            numProcStartIdleDate := numProcStartIdleDate - 1;
                        END IF;
                    END IF;


                    -- 製造納期を超えたらループを抜ける
                    IF GREATEST(dtmStartDate,dtmDueDate) <= typMCAL(i) THEN
                        EXIT;
                    END IF;

                END LOOP;

--vc2RunChkComment := '●●●●通過 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                FOR i IN 1..intIND - 1 LOOP

                    IF typW_LOAD_DATA(i).dtmLoadDate >= dtmCalcFromDate AND 
                       typW_LOAD_DATA(i).dtmLoadDate <= dtmCalcToDate THEN

--vc2RunChkComment := '●●●●通過 00150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                        -- 負荷明細識別番号カウントアップ
                        IF (TO_NUMBER(vc2LoadCd) + 1) > TO_NUMBER(vc2LoadCd_Max) THEN
                            vc2LoadCd := vc2LoadCd_Min;
                        END IF;
                        vc2LoadCd := TRIM(TO_CHAR(TO_NUMBER(vc2LoadCd)+1,vc2LoadCd_Min));

                        numWorkQty := ROUND((typW_LOAD_DATA(i).numLoadQty / numCalCnt),MINIMUM_BEAM);
                        IF numWorkQty >= (typW_LOAD_DATA(i).numLoadQty / numCalCnt) THEN
                            numLoadQty := numWorkQty;
                        ELSE
                            numLoadQty := numWorkQty + MINIMUM_BEAM_QTY;
                        END IF;

--DBMS_OUTPUT.PUT_LINE(TO_CHAR(typW_LOAD_DATA(i).numLoadQty)||'/'||TO_CHAR(numLoadQty));

                        -- 手配着手日が負荷構成の有効開始日と有効終了日の範囲内ならば登録する
            IF ((dtmOdrStartDate >= curM_LOAD_PS_REC.EFF_PHASE_IN_DATE) AND
                           (dtmOdrStartDate <= curM_LOAD_PS_REC.EFF_PHASE_OUT_DATE)) THEN

                            INSERT INTO T_SIM_LOAD_DETAIL (
                                 LOAD_CD
                                ,LOAD_PLAN_CD
                                ,PLANT_CD
                                ,ITEM_CD
                                ,JOB_ODR_CD
                                ,PRD_DUE_DATE
                                ,PRD_START_DATE
                                ,ODR_QTY
                                ,MRP_ODR_TYP
                                ,NECK_PROC_CD
                                ,LOAD_DATE
                                ,LOAD_QTY
                                ,ENTRY_BY
                                ,CREATED_DATE
                                ,CREATED_BY
                                ,CREATED_PRG_NM
                                ,UPDATED_DATE
                                ,UPDATED_BY
                                ,UPDATED_PRG_NM
                                ,MODIFY_COUNT
                            ) VALUES (
                                 pvc2PlantCd || vc2LoadCd
                                ,curT_LOAD_PLAN_REC.LOAD_PLAN_CD
                                ,curT_LOAD_PLAN_REC.PLANT_CD
                                ,curM_LOAD_PS_REC.ITEM_CD
                                ,curT_LOAD_PLAN_REC.JOB_ODR_CD
                                ,dtmDueDate
                                ,dtmStartDate
                                ,numOrdQty
                                ,curM_LOAD_PS_REC.MRP_ODR_TYP
                                ,curM_NECK_WS_REC.NECK_PROC_CD
                                ,typW_LOAD_DATA(i).dtmLoadDate
                                ,numLoadQty
                                ,curT_LOAD_PLAN_REC.ENTRY_BY
                                ,SYSDATE
                                ,pvc2UserId
                                ,MY_SQL_NAME
                                ,SYSDATE
                                ,pvc2UserId
                                ,MY_SQL_NAME
                                ,FIRST_MODIFY_COUNT
                            );

            END IF;

                        numTgtCnt := numTgtCnt + 1;

                    END IF;

                END LOOP;

            END LOOP;

        END LOOP;

    END LOOP;

    UPDATE T_LOAD_PLAN 
    SET    LOAD_CALC_TYP = LOAD_CALC_TYP_END
          ,UPDATED_DATE   = SYSDATE
          ,UPDATED_BY     = pvc2UserId
          ,UPDATED_PRG_NM = MY_SQL_NAME
          ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd
    AND    LOAD_CALC_TYP = LOAD_CALC_TYP_RUN;

    -- 負荷明細識別番号更新
    UPDATE SYS_LOAD_CD_CTRL 
    SET  LOAD_CD        = vc2LoadCd
        ,UPDATED_DATE   = SYSDATE
        ,UPDATED_BY     = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '●●●●通過 00160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 終了メッセージの作成
    vc2Comment := LOGMSG_END_PGNM;
    vc2Comment := '(SBM0404)'||vc2Comment || LOGMSG_TGTCNT || LOGMSG_BRACKETS || numTgtCnt || LOGMSG_BRACKETE;
    vc2Comment := SUBSTR(vc2Comment,1,256);

    -- 終了メッセージの出力
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

    -- 負荷識別番号採番テーブルロック解除
    --CLOSE curSYS_LOAD_CD_CTRL;

    -- コミット
    COMMIT;

    -- LogFileのCLOSE
    blnRet := FncLogClose(UTL_FileHandle);

    pnumReturn := 0;

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

/*------------------------------------------------------------
'　強制終了（異常終了）となるEXCEPTION
-------------------------------------------------------------*/
EXCEPTION

    WHEN excMistakeCommonParam  THEN    --共通の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excMistakeCommonParam');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0405)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：共通の入力パラメータが誤っています',
                             1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_COMMON_PARAM, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                           MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excMistakeNativeParam  THEN    --固有の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0406)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：固有の入力パラメータが誤っています',
                             1,256);

        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_COMMON_PARAM, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

--    WHEN excGetMyCompany  THEN    --自社取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetMyCompany');
--        ROLLBACK;
--        -- 終了メッセージの作成
--        vc2Comment := SUBSTR(LOGMSG_END_PGNM || LOGMSG_ERR || '：自社取得エラー',
--                             1,256);
--        -- 終了メッセージの出力
--        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
--                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
--                            MY_SQL_NAME, APS_COM_NOTEXIST_MY_COMPANY, vc2Comment);
--        -- TraceLog の出力
--        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
--                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
--                              MY_SQL_NAME, LOGMSG_END || vc2TraceComment);
--        COMMIT;
--
--        -- LogFileのCLOSE
--        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetPlant  THEN    --工場取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetPlant');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0407)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：工場取得エラー',
                             1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_PLANT, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excSysLoadCalcPeriod  THEN    -- 負荷計算期間取得エラー
--DBMS_OUTPUT.PUT_LINE('excSysLoadCalcPeriod');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0408)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：負荷計算期間取得エラー',1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_LOAD_PLAN, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excNeckProcLtZero THEN
--DBMS_OUTPUT.PUT_LINE('excNeckProcLtZero');

        -- 終了メッセージの作成はRAISE前に行う

        ROLLBACK;
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ZERO_NECK_PROC_LT, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

        COMMIT;

        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetResourceData   THEN    -- 資源取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetResourceData');
        -- 終了メッセージの作成はRAISE前に行う

        ROLLBACK;

        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_RESOURCE, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetDateData   THEN    -- 日付取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetDateData');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0409)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：日付取得エラー' || vc2Comment,
                             1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_CALENDER, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetNewLoadCd  THEN    --負荷明細識別番号エラー
--DBMS_OUTPUT.PUT_LINE('excGetNewLoadCd');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0410)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：負荷明細識別番号エラー',1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_LOAD_CD, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        
        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0411)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);

        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        -- TraceLog の出力（実行位置）
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFileのCLOSE
        blnRet := FncLogClose(UTL_FileHandle);

END;
/
