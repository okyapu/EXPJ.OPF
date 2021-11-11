CREATE OR REPLACE PROCEDURE SqlLoadCalcBat(
/*------------------------------------------------------------------------------
'
' SQL_NAME  : SqlLoadCalcBat.Sql
' version   : 1.00.00
'
' 修正履歴
' 2003.09.30 初版
' 2004.02.24 UPD BY CNES カレンダ取得時、システム日付ではなく業務運用日の前後180日とするよう修正
'                        カレンダ不足エラー時、メッセージ追加
' 2005.10.24 unicode対応（varchar2を4倍）
'
' 機能      : 負荷山積み
'
' 引き数    ■MetamorBase共通
'           : pvc2LogMode          - (i)ＬＯＧモード
'                 pvc2OutputMode       - (i)出力モード
'                 pvc2OutputPath       - (i)出力ファイルパス
'                 pvc2OutputName       - (i)出力ファイル名
'                 pvc2UserId           - (i)ユーザＩＤ
'                 pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'       ■負荷山積実行
'                       : pvc2CalcFromDate     - (i)負荷山積み対象期間(From)
'                         pvc2CalcToDate       - (i)負荷山積み対象期間(To)
'
' 機能説明  : 負荷山積実行
'
' 備考
'
------------------------------------------------------------------------------*/
     pvc2LogMode            VARCHAR2    -- ＬＯＧモード
    ,pvc2OutputMode         VARCHAR2    -- 出力モード
    ,pvc2OutputPath         VARCHAR2    -- 出力パス
    ,pvc2OutputName         VARCHAR2    -- 出力ファイル名
    ,pvc2UserId             VARCHAR2    -- ユーザＩＤ
    ,pvc2BusinessName       VARCHAR2    -- 業務名
    ,pvc2PlantCd        VARCHAR2    -- 工場コード
    ,pvc2CalcFromDate           VARCHAR2        -- 負荷山積み対象期間(From)
    ,pvc2CalcToDate             VARCHAR2        -- 負荷山積み対象期間(To)
)
IS
    -- 例外の宣言
    excGetPlant             EXCEPTION;          -- 工場取得エラー
--    excGetMyCompany         EXCEPTION;          -- 自社取得エラー
    excMistakeCommonParam   EXCEPTION;          -- 共通の入力パラメータ異常
    excMistakeNativeParam   EXCEPTION;      -- 固有の入力パラメータ異常
    excGetNewLoadCd         EXCEPTION;          -- 負荷識別番号取得異常
    excGetResourceData      EXCEPTION;          -- 資源取得エラー
    excGetDateData          EXCEPTION;          -- 日付取得エラー
    excNeckProcLtZero       EXCEPTION;          -- 制約工程LTゼロ以下エラー

    -- 定数の宣言
    MY_SQL_NAME             VARCHAR2(128) := 'SqlLoadCalcBat';
    FIRST_MODIFY_COUNT      NUMBER       := 0;        -- 新規作成テーブルの初回の更新数
--    CTRL_CD_DEFAULT         VARCHAR2(24)  := 'SYSTEM'; -- コントロール系テーブルのPrimaryKeyの値
    OUTSIDE_TYP_INNER_MAKE  NUMBER       := 1;        -- 内外作区分　内作
    ODR_STS_PLAN        NUMBER       := 1;        -- オーダ処理区分(1:計画（未発効）)
    ODR_STS_RELEASE         NUMBER       := 2;        -- オーダ処理区分(2:確定（発効）)
    ODR_STS_COMPLETE        NUMBER       := 9;        -- オーダ処理区分(9:終了)
    MRP_TYP_DELETE          NUMBER       := 3;        -- 所要量処理区分(3:削除)
    MINIMUM_BEAM            NUMBER(2)    := 6;        -- 負荷量最小桁(切り上げ用)
    MINIMUM_BEAM_QTY        NUMBER(7,6)  := 0.000001; -- 負荷量最小桁値(切り上げ用)
    LOAD_DATE_QTY_INIT      NUMBER(1)    := 1;        -- 負荷山積み日数初期値
    HOLIDAY_FLG_OFF         NUMBER(1)    := 0;        -- 休日区分(0:稼働日)

    -- 変数の宣言
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- ファイルハンドル
    blnRet                  BOOLEAN;            -- 関数戻り値
    intRet                  INTEGER;            -- 関数戻り値
    vc2Comment              VARCHAR2(1024);      -- メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);      -- 実行位置確認用コメント作成作業領域
    vc2TraceComment     VARCHAR2(1024);      -- トレーース出力用コメント作成作業領域（入力パラメータ記録用）
--    vc2CompanyCd      VARCHAR2(8);    -- 会社コード
--    vc2WhCd           VARCHAR2(100);       -- 受渡場所（代表納入場所コード）
    vc2LoadCd               VARCHAR2(100);       -- 負荷明細識別番号(工場コード無し)
    numLoadCd               NUMBER(25);         -- 負荷明細識別番号(数値型 工場コード無し)
    vc2LoadCd_Min           VARCHAR2(100);       -- 負荷明細識別番号最小値
    vc2LoadCd_Max           VARCHAR2(100);       -- 負荷明細識別番号最大値
    dtmLoadDate             DATE;               -- 負荷山積み日
    numLoadQty              NUMBER(24,6);       -- 負荷量
    numTgtCnt               NUMBER := 0;        -- 対象件数
    dtmWorkDate             DATE;               -- ワーク日付
    numWorkQty              NUMBER(24,6);       -- ワーク数量
    numWorkLt               NUMBER(6);          -- ワークLT
    dtmDueDate              DATE;               -- 納期
    numProcStartIdleDate    NUMBER(6);          -- 着手アイドルタイム
    numNeckProcLt           NUMBER(6);          -- リードタイム
    numCalNo                NUMBER(6);          -- カレンダ番号
    numCalCnt               NUMBER(6);          -- 該当カレンダカウント(製造着手日～製造納期)

    -- 負荷明細作成用配列宣言
    TYPE W_LOAD_DATA_R IS RECORD(
        dtmLoadStartDate DATE,         -- 負荷山積み開始日
        numLoadDateQty   NUMBER(5),    -- 負荷山積み日数
        dtmLoadDate      DATE,         -- 負荷山積み日
        numLoadQty       NUMBER(24,6)  -- 負荷山積数量
    );
    TYPE W_LOAD_DATA_T IS TABLE OF W_LOAD_DATA_R INDEX BY BINARY_INTEGER;
    typW_LOAD_DATA W_LOAD_DATA_T;
    -- 負荷明細作成用配列INDEX宣言
    intIND   BINARY_INTEGER; -- INDEX
    intIND_W BINARY_INTEGER; -- INDEX WORK

    -- カレンダ格納配列宣言
    TYPE typMCAL_T IS TABLE OF DATE INDEX BY BINARY_INTEGER;
    typMCAL typMCAL_T;
    -- カレンダ格納配列INDEX宣言
    intIND_CAL   BINARY_INTEGER; -- INDEX
    intIND_CAL_W BINARY_INTEGER; -- INDEX WORK

    -- MESSAGE の宣言
    APS_COM_BATCH_START                 VARCHAR2(28)   := 'ZZ09001';    -- バッチ処理を開始しました
    APS_COM_BATCH_END                   VARCHAR2(28)   := 'ZZ09002';    -- バッチ処理を終了しました
    APS_COM_MISTAKE_COMMON_PARAM        VARCHAR2(28)   := 'AL30001';    -- 共通の入力パラメータが誤っています
    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'AL30002';    -- 固有の入力パラメータが誤っています
    APS_COM_NOTEXIST_MY_COMPANY         VARCHAR2(28)   := 'AL30003';    -- 自社データが存在しません
    APS_COM_NOTEXIST_PLANT              VARCHAR2(28)   := 'AL30004';    -- 工場データが存在しません
    APS_COM_ZERO_NECK_PROC_LT           VARCHAR2(28)   := 'AL60005';    -- 制約工程のリードタイムがゼロ以下です
    APS_COM_NOTEXIST_RESOURCE           VARCHAR2(28)   := 'AL60006';    -- 資源データが存在しません
    APS_COM_NOTGET_LOAD_CD              VARCHAR2(28)   := 'AL60007';    -- 負荷明細識別番号が取得できません
    APS_COM_NOTEXIST_CALENDER           VARCHAR2(28)   := 'AL60008';    -- カレンダが不足しています
    APS_COM_NOTGET_LOAD_DATA            VARCHAR2(28)   := 'AL60009';    -- 負荷明細データが取得できません
    APS_COM_ORACLE_ERR                  VARCHAR2(28)   := 'ZZ01106';    -- ＯＲＡＣＬＥエラー

    -- LOG の宣言
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         -- ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           -- ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    LOGMSG_START_PGNM                   VARCHAR2(192)  := '(SBM0412)<< 負荷山積み実行処理開始 >>';
    LOGMSG_END_PGNM                     VARCHAR2(192)  := '<< 負荷山積み実行処理終了 >>';
    LOGMSG_ERR_PGNM                     VARCHAR2(192)   := '<< 負荷山積み実行処理異常 >>';
    LOGMSG_PARAM            VARCHAR2(64)  := '入力パラメータ：';
    LOGMSG_TGTCNT                       VARCHAR2(40)  := '対象件数：';
    LOGMSG_DONECNT                      VARCHAR2(40)  := '正常件数：';
    LOGMSG_WARCNT                       VARCHAR2(64)  := 'ワーニング件数：';
    LOGMSG_FATALCNT                     VARCHAR2(40)  := '異常件数：';
    LOGMSG_BRACKETS                     VARCHAR2(4)   := '[';
    LOGMSG_BRACKETE                     VARCHAR2(4)   := ']';
    LOGMSG_COMMA                        VARCHAR2(4)   := ',';


    -- カーソルの宣言
    -- 所要量
    CURSOR curT_OD(
         cvc2PlantCd VARCHAR2
        ,cdtmCalcFromDate DATE
        ,cdtmCalcToDate DATE
        ,cnumOdrStsPlan NUMBER
        ,cnumOdrStsRelease NUMBER
        ,cnumOdrStsComplete NUMBER
        ,cnumOutsideTypInnerMake NUMBER
        ,cnumMrpTypDelete NUMBER
    )
    IS
        SELECT OD_NO,PLANT_CD,ITEM_CD,JOB_ODR_CD,JOB_ODR_DETAIL_NO,
                  ODR_STS_TYP,OD_TYP,PRD_DUE_DATE,PRD_START_DATE,
                  ODR_QTY,MRP_ODR_TYP,TOTAL_RCV_QTY
        FROM T_OD 
        WHERE PLANT_CD = cvc2PlantCd
        AND   PRD_DUE_DATE >= cdtmCalcFromDate
        AND   PRD_START_DATE <= cdtmCalcToDate
        AND   ODR_STS_TYP IN (cnumOdrStsPlan,cnumOdrStsRelease,cnumOdrStsComplete)
        AND   OUTSIDE_TYP = cnumOutsideTypInnerMake
        AND   TOTAL_RCV_QTY < ODR_QTY
        AND   MRP_TYP <> cnumMrpTypDelete
        AND ITEM_CD IN   (
               SELECT ITEM_CD
               FROM   M_NECK_WS 
               WHERE  PLANT_CD = cvc2PlantCd
               GROUP BY ITEM_CD
        )
        ;

    -- 制約工程マスタ(着手アイドルタイム昇順、制約工程コード昇順)
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
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2PlantCd || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2CalcFromDate || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2CalcToDate || LOGMSG_BRACKETE ||'>>';
    vc2TraceComment := SUBSTR(vc2TraceComment,1,256);

    -- LogFile の OPEN
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
    IF pvc2LogMode IS NULL THEN      -- ＬＯＧモードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2OutputMode IS NULL THEN  -- 出力モードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2OutputPath IS NULL THEN   -- 出力パスがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2OutputName IS NULL THEN  -- 出力ファイル名がＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2UserId IS NULL THEN           -- ユーザＩＤがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2BusinessName IS NULL THEN -- 業務名がＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2PlantCd IS NULL THEN          -- 工場コードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;

    -- 固有の入力パラメータのチェック
    IF pvc2CalcFromDate IS NULL THEN  -- 負荷山積み対象期間(From)がNULL
        RAISE excMistakeNativeParam;
    END IF;     
    IF pvc2CalcToDate IS NULL THEN      -- 負荷山積み対象期間(To)がNULL
        RAISE excMistakeNativeParam;
    END IF;     

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
            WHERE  M_PLANT.PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetPlant;
        WHEN OTHERS THEN
            RAISE;
    END;

/*------------------------------------------------------------
'　負荷識別番号取得を取得する
'　代表納入場所を取得する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00040';
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

    -- 負荷識別番号採番テーブルをロック
    OPEN curSYS_LOAD_CD_CTRL;

--DBMS_OUTPUT.PUT_LINE(vc2LoadCd||' '||vc2LoadCd_Min||' '||vc2LoadCd_Max);

/*------------------------------------------------------------
'　カレンダを配列に格納する
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00030'||' '||TO_CHAR(SYSDATE,'HH24MISS');
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    intIND_CAL := 1;
--2004.02.24 UPD
--    FOR curM_CAL_REC IN curM_CAL(numCalNo,HOLIDAY_FLG_OFF) LOOP
    FOR curM_CAL_REC IN curM_CAL(pvc2PlantCd,numCalNo,HOLIDAY_FLG_OFF) LOOP

        typMCAL(intIND_CAL) := curM_CAL_REC.CAL_DATE;
        intIND_CAL := intIND_CAL + 1;

    END LOOP;


/*------------------------------------------------------------
'　工場コードをキーにしてデータを削除する
-------------------------------------------------------------*/
    DELETE FROM T_LOAD_DETAIL
    WHERE PLANT_CD = pvc2PlantCd;

/*------------------------------------------------------------
'　負荷山積実行
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00040'||' '||TO_CHAR(SYSDATE,'HH24MISS');
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 処理件数初期化
    numTgtCnt := 0;

    -- 所要量カーソル
    FOR curT_OD_REC IN curT_OD(
         pvc2PlantCd
        ,TO_DATE(pvc2CalcFromDate,'YYYY/MM/DD')
        ,TO_DATE(pvc2CalcToDate,'YYYY/MM/DD')
        ,ODR_STS_PLAN
        ,ODR_STS_RELEASE
        ,ODR_STS_COMPLETE
        ,OUTSIDE_TYP_INNER_MAKE
        ,MRP_TYP_DELETE) LOOP

--DBMS_OUTPUT.PUT_LINE('TOD SELECT '||' '||TO_CHAR(SYSDATE,'HH24MISS'));

        -- 制約工程カーソル
        FOR curM_NECK_WS_REC IN curM_NECK_WS(curT_OD_REC.PLANT_CD,curT_OD_REC.ITEM_CD) LOOP

--vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            -- エラー発生時、次データを処理する
            BEGIN

                --制約工程のリードタイムがゼロ以下の場合エラー処理へ
                IF curM_NECK_WS_REC.NECK_PROC_LT <= 0 THEN
                    RAISE excNeckProcLtZero;
                END IF;

                -- 資源マスタが無い場合エラー処理へ
                IF curM_NECK_WS_REC.NECK_PROC_FLG = 0 THEN
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

                    IF typMCAL(i) >= curT_OD_REC.PRD_START_DATE THEN
                        IF typMCAL(i) >= GREATEST(curT_OD_REC.PRD_START_DATE,curT_OD_REC.PRD_DUE_DATE) THEN
                            EXIT;
                        END IF;
                        numWorkLt := numWorkLt + 1;
                    END IF;
                END LOOP;
                numWorkLt := GREATEST(1,numWorkLt);
                IF numWorkLt < numProcStartIdleDate + numNeckProcLt THEN
                    IF numWorkLt <= numNeckProcLt THEN
--DBMS_OUTPUT.PUT_LINE('A[WORK:'||TO_CHAR(numWorkLt)||'][IDLE:'||TO_CHAR(numProcStartIdleDate)||'][PROC:'||TO_CHAR(numNeckProcLt)||']');
                        numProcStartIdleDate := 0;
                        numNeckProcLt := numWorkLt;
                    ELSE
--DBMS_OUTPUT.PUT_LINE('A[WORK:'||TO_CHAR(numWorkLt)||'][IDLE:'||TO_CHAR(numProcStartIdleDate)||'][PROC:'||TO_CHAR(numNeckProcLt)||']');
                        numProcStartIdleDate := numWorkLt - numNeckProcLt;
--                        numNeckProcLt := numWorkLt;--変更無し
                        
                    END IF;
                END IF;

                -- カレンダ配列ループ
                FOR i IN 1..intIND_CAL - 1 LOOP

                    -- 製造着手日以上のカレンダまで検索する
                    IF typMCAL(i) >= curT_OD_REC.PRD_START_DATE THEN

                        -- 負荷山積み開始日取得のため着手アイドルタイム分カレンダを進める
                        IF numProcStartIdleDate <= 0 THEN

                            -- 負荷明細配列に登録する
                            IF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 1 THEN -- 負荷割付区分が均等

--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- 負荷山積み開始日をカレンダから取得(初回のみ)、後はその値をコピーする
                                IF intIND = 1 THEN
                                    typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);
                                ELSE
                                    typW_LOAD_DATA(intIND).dtmLoadStartDate := typW_LOAD_DATA(1).dtmLoadStartDate;
                                END IF;

                                -- 負荷山積み日数にリードタイムをセット
                                typW_LOAD_DATA(intIND).numLoadDateQty := GREATEST(1,numNeckProcLt);

                                -- 負荷山積み日をカレンダから取得
                                typW_LOAD_DATA(intIND).dtmLoadDate := typMCAL(i);

                                -- 負荷山積数量を取得(後で負荷山積み日数で除算する)
                                numWorkQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;
                                intIND := intIND + 1;
                                
                                numCalCnt := numCalCnt + 1;

                            ELSIF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 2 THEN -- 負荷割付区分が初日全

--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- 負荷山積み開始日をカレンダから取得
                                typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);

                                -- 負荷山積み日数に初期値をセット
                                typW_LOAD_DATA(intIND).numLoadDateQty := LOAD_DATE_QTY_INIT;

                                -- 負荷山積み日をカレンダから取得
                                typW_LOAD_DATA(intIND).dtmLoadDate := typMCAL(i);

                                -- 負荷山積数量を取得(後で負荷山積み日数で除算する)
                                numWorkQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;

                                -- 1件取得で良いためカレンダのループを抜ける
                                numCalCnt := 1;
                                EXIT;

                            ELSIF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 3 THEN  -- 負荷割付区分が最終日全

--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- 負荷山積み開始日をカレンダから取得
                                typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);

                                -- 負荷山積み日数に初期値をセット
                                typW_LOAD_DATA(intIND).numLoadDateQty := LOAD_DATE_QTY_INIT;

                                -- 負荷山積み日をカレンダとリードタイムから取得
                                IF (intIND_CAL - 1 >= i + numNeckProcLt) THEN

                                    dtmDueDate := curT_OD_REC.PRD_DUE_DATE - 1;
                                    FOR curM_CAL_DESC_REC IN curM_CAL_DESC(numCalNo,dtmDueDate,HOLIDAY_FLG_OFF) LOOP
                                        dtmDueDate := curM_CAL_DESC_REC.CAL_DATE;
                                        EXIT;
                                    END LOOP;

                                    typW_LOAD_DATA(intIND).dtmLoadDate := GREATEST(typMCAL(i),LEAST(typMCAL(i + numNeckProcLt),dtmDueDate));
                                ELSE

-- 2004.02.24 ADD
                                    vc2Comment := '';
                                    vc2Comment := SUBSTR(LOGMSG_BRACKETS||'OD_NO：'||curT_OD_REC.OD_NO||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'CAL_NO：'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'DATE：'||TO_CHAR(curT_OD_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'LT：'||TO_CHAR(-(1 + i + numNeckProcLt))||LOGMSG_BRACKETE
                                         ,1,256);

                                    RAISE excGetDateData;
                                END IF;

                                -- 負荷山積数量を取得(後で負荷山積み日数で除算する)
                                numWorkQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;     

                                -- 1件取得で良いためカレンダのループを抜ける
                                numCalCnt := 1;
                                EXIT;   

                            END IF;

                            -- カレンダが(製造納期-稼働日1日)以上になった場合 ループを抜ける
                            IF curT_OD_REC.PRD_DUE_DATE <= typMCAL(i + 1) THEN
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
                    IF GREATEST(curT_OD_REC.PRD_START_DATE,curT_OD_REC.PRD_DUE_DATE) <= typMCAL(i) THEN
                        EXIT;
                    END IF;

                END LOOP;

--vc2RunChkComment := '●●●●通過 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||' '||TO_CHAR(intIND));

                -- 負荷明細登録
                FOR i IN 1..intIND - 1 LOOP

                    -- 負荷山積み日が対象期間内のデータのみ登録する
                    IF typW_LOAD_DATA(i).dtmLoadDate >= TO_DATE(pvc2CalcFromDate,'YYYY/MM/DD') AND 
                       typW_LOAD_DATA(i).dtmLoadDate <= TO_DATE(pvc2CalcToDate,'YYYY/MM/DD') THEN

                        -- 負荷明細識別番号カウントアップ
                        IF (TO_NUMBER(vc2LoadCd) + 1) > TO_NUMBER(vc2LoadCd_Max) THEN
                            vc2LoadCd := vc2LoadCd_Min;
                        END IF;
                        vc2LoadCd := TRIM(TO_CHAR(TO_NUMBER(vc2LoadCd)+1,vc2LoadCd_Min));
--DBMS_OUTPUT.PUT_LINE(vc2LoadCd);

                        numWorkQty := ROUND((typW_LOAD_DATA(i).numLoadQty / numCalCnt),MINIMUM_BEAM);
                        IF numWorkQty >= (typW_LOAD_DATA(i).numLoadQty / numCalCnt) THEN
                            numLoadQty := numWorkQty;
                        ELSE
                            numLoadQty := numWorkQty + MINIMUM_BEAM_QTY;
                        END IF;

--DBMS_OUTPUT.PUT_LINE(TO_CHAR(typW_LOAD_DATA(i).numLoadQty)||' / '||TO_CHAR(numCalCnt) );

                        -- 負荷明細配列より登録
                        INSERT INTO T_LOAD_DETAIL (
                             LOAD_CD
                            ,OD_NO
                            ,PLANT_CD
                            ,ITEM_CD
                            ,JOB_ODR_CD
                            ,JOB_ODR_DETAIL_NO
                            ,ODR_STS_TYP
                            ,OD_TYP
                            ,PRD_DUE_DATE
                            ,PRD_START_DATE
                            ,ODR_QTY
                            ,MRP_ODR_TYP
                            ,TOTAL_RCV_QTY
                            ,NECK_PROC_CD
                            ,LOAD_DATE
                            ,LOAD_QTY
                            ,CREATED_DATE
                            ,CREATED_BY
                            ,CREATED_PRG_NM
                            ,UPDATED_DATE
                            ,UPDATED_BY
                            ,UPDATED_PRG_NM
                            ,MODIFY_COUNT
                        ) VALUES (
                             pvc2PlantCd || vc2LoadCd
                            ,curT_OD_REC.OD_NO
                            ,curT_OD_REC.PLANT_CD
                            ,curT_OD_REC.ITEM_CD
                            ,curT_OD_REC.JOB_ODR_CD
                            ,curT_OD_REC.JOB_ODR_DETAIL_NO
                            ,curT_OD_REC.ODR_STS_TYP
                            ,curT_OD_REC.OD_TYP
                            ,curT_OD_REC.PRD_DUE_DATE
                            ,curT_OD_REC.PRD_START_DATE
                            ,curT_OD_REC.ODR_QTY
                            ,curT_OD_REC.MRP_ODR_TYP
                            ,curT_OD_REC.TOTAL_RCV_QTY
                            ,curM_NECK_WS_REC.NECK_PROC_CD
                            ,typW_LOAD_DATA(i).dtmLoadDate
                            ,numLoadQty--ROUND((typW_LOAD_DATA(i).numLoadQty / numCalCnt),MINIMUM_BEAM)
                            ,SYSDATE
                            ,pvc2UserId
                            ,MY_SQL_NAME
                            ,SYSDATE
                            ,pvc2UserId
                            ,MY_SQL_NAME
                            ,FIRST_MODIFY_COUNT
                        );

                        numTgtCnt := numTgtCnt + 1;

--vc2RunChkComment := '●●●●通過 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


                    END IF;

                END LOOP;



            EXCEPTION

                WHEN excNeckProcLtZero THEN
--DBMS_OUTPUT.PUT_LINE('excNeckProcLtZero');

                    -- 終了メッセージの作成
                    vc2Comment := SUBSTR('(SBM0418)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：制約工程LTゼロ以下エラー'||
                                         LOGMSG_BRACKETS||'PLANT_CD:'||pvc2PlantCd||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'ITEM_CD:'||curM_NECK_WS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'NECK_PROC_CD:'||curM_NECK_WS_REC.NECK_PROC_CD||LOGMSG_BRACKETE,
                                         1,256);
                    -- 終了メッセージの出力
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_ZERO_NECK_PROC_LT, vc2Comment);
                    -- TraceLog の出力
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

                WHEN excGetResourceData THEN
--DBMS_OUTPUT.PUT_LINE('excGetResourceData');

                    -- 終了メッセージの作成
                    vc2Comment := SUBSTR('(SBM0419)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：資源取得エラー'||
                                         LOGMSG_BRACKETS||'PLANT_CD:'||pvc2PlantCd||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'NECK_PROC_CD:'||curM_NECK_WS_REC.NECK_PROC_CD||LOGMSG_BRACKETE,
                                         1,256);
                    -- 終了メッセージの出力
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTEXIST_RESOURCE, vc2Comment);
                    -- TraceLog の出力
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

                WHEN excGetDateData THEN
--DBMS_OUTPUT.PUT_LINE('excGetDateData');

                    -- 終了メッセージの作成
                    vc2Comment := SUBSTR('(SBM0420)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：カレンダエラー'||vc2Comment
                                         ,1,256);
                    -- 終了メッセージの出力
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTEXIST_CALENDER, vc2Comment);
                    -- TraceLog の出力
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
                    vc2Comment := '';

                WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');

                    vc2Comment := SUBSTR('(SBM0421)'|| LOGMSG_ERR_PGNM || LOGMSG_ERR || '：' ||SQLCODE || ',' || 
                                  SUBSTR(SQLERRM,1,256),1,256);

                    -- 終了メッセージの出力
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTGET_LOAD_DATA, vc2Comment);
                    -- TraceLog の出力
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, APS_COM_NOTGET_LOAD_DATA || '：' || vc2TraceComment);
            END;

        END LOOP;

--vc2RunChkComment := '●●●●通過 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    END LOOP;

    -- 負荷計算期間更新
    UPDATE SYS_LOAD_CALC_PERIOD
    SET   CALC_FROM_DATE = TO_DATE(pvc2CalcFromDate,'YYYY/MM/DD')
         ,CALC_TO_DATE   = TO_DATE(pvc2CalcToDate,'YYYY/MM/DD')
         ,UPDATED_DATE   = SYSDATE
         ,UPDATED_BY     = pvc2UserId
         ,UPDATED_PRG_NM = MY_SQL_NAME
         ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE PLANT_CD = pvc2PlantCd;

--DBMS_OUTPUT.PUT_LINE(vc2LoadCd);

    -- 負荷明細識別番号更新
    UPDATE SYS_LOAD_CD_CTRL 
    SET  LOAD_CD        = vc2LoadCd
        ,UPDATED_DATE   = SYSDATE
        ,UPDATED_BY     = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd;

    -- ロックを解除
    --CLOSE curSYS_LOAD_CD_CTRL;

    COMMIT;

--vc2RunChkComment := '●●●●通過 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 終了メッセージの作成
    vc2Comment := LOGMSG_END_PGNM;
    vc2Comment := '(SBM0423)'|| vc2Comment || LOGMSG_TGTCNT || LOGMSG_BRACKETS || numTgtCnt || LOGMSG_BRACKETE ;
    vc2Comment := SUBSTR(vc2Comment,1,256);

    -- 終了メッセージの出力
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

    COMMIT;

    -- LogFile の CLOSE
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

/*------------------------------------------------------------
'　強制終了（異常終了）となるEXCEPTION　
-------------------------------------------------------------*/
EXCEPTION

    WHEN excMistakeCommonParam  THEN    -- 共通の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excMistakeCommonParam');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0431)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：共通の入力パラメータが誤っています',
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

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excMistakeNativeParam  THEN    -- 固有の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0432)'||LOGMSG_END_PGNM || LOGMSG_ERR || '：固有の入力パラメータが誤っています',
                             1,256);

        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_NATIVE_PARAM, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);


--    WHEN excGetMyCompany  THEN    -- 自社取得エラー
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
--        -- LogFile の CLOSE
--        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetPlant  THEN    -- 工場取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetPlant');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0433)'||LOGMSG_END_PGNM || LOGMSG_ERR || '：工場取得エラー'||LOGMSG_BRACKETS||pvc2PlantCd||LOGMSG_BRACKETE,
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

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetNewLoadCd  THEN    --負荷明細識別番号エラー
--DBMS_OUTPUT.PUT_LINE('excGetNewLoadCd');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0434)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：負荷明細識別番号取得エラー',1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTGET_LOAD_CD, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0435)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);

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

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);
END;
/
