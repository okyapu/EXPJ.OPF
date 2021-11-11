CREATE OR REPLACE FUNCTION FncGetCtrlDate4ARAP(
/*------------------------------------------------------------------------------
'
' FncGetCtrlDate4ARAP.Sql
'
' 修正履歴  2004.07.01 新規作成
'           2005.10.20 unicode対応(varchar2を4倍)
'
' 機能      : 期数などの情報を取得する
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2CompanyCd        - (i)会社コード
'             pvc2InDate           - (i)年月
'             pnumTerm             - (o)期数
'             pnumYear             - (o)年度
'             pdtmTermStartDate    - (o)期の開始年月日
'             pdtmTermEndDate      - (o)期の終了年月日
'             pnumYearMonth        - (o)年月度
'             pdtmMonthStartDate   - (o)年月度の開始年月日
'             pdtmMonthEndDate     - (o)年月度の終了年月日
'             pnumTableNo          - (o)月度テーブルNo.
'
' 機能説明  : 「年月」より該当する「期期間マスタ」の情報を取得する。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2CompanyCd       IN  VARCHAR2            --会社コード
   ,pvc2InDate          IN  VARCHAR2            --年月
   ,pnumTerm            OUT NUMBER              --期数
   ,pnumYear            OUT NUMBER              --年度
   ,pdtmTermStartDate   OUT DATE                --期の開始年月日
   ,pdtmTermEndDate     OUT DATE                --期の終了年月日
   ,pnumYearMonth       OUT NUMBER              --年月度
   ,pdtmMonthStartDate  OUT DATE                --年月度の開始年月日
   ,pdtmMonthEndDate    OUT DATE                --年月度の終了年月日
   ,pnumTableNo         OUT NUMBER              --月度テーブルNo.
) RETURN BOOLEAN
IS

/* 定数の宣言 */
    MY_SQL_NAME             CONSTANT VARCHAR2(120)  := 'FncGetCtrlDate4ARAP';     --ＰＬ／ＳＱＬ名

    LOGMSG_START            CONSTANT VARCHAR2(20)   := 'Start';                 --ログ用メソッド開始宣言
    LOGMSG_END              CONSTANT VARCHAR2(12)   := 'End';                   --ログ用メソッド終了宣言

    ACTION_TYP_DATE         CONSTANT NUMBER(2)     := 0;                       --年月日処理
    ACTION_TYP_YAERMONTH    CONSTANT NUMBER(2)     := 1;                       --年月処理

    ERRCD_NOTEXIST_DATA     CONSTANT VARCHAR2(28)   := 'BZ00174';    --対象データが存在しません
    ERRCD_CECD_ERRNO        CONSTANT VARCHAR2(28)   := 'BZ00175';    --アクションエラー
    ERRCD_DATE_FORMAT_ERR   CONSTANT VARCHAR2(28)   := 'BZ00176';    --日付の値が不正です

/* EXCEPTION の宣言 */
    excFNC_PARAMETER_ERR         EXCEPTION;      --入力パラメータエラー
    excFNC_MST_NODATA            EXCEPTION;      --マスタなしエラー
    excFNC_M_ACC_TERM_PERIOD_ERR EXCEPTION;      --期期間マスタエラー

/* 変数の宣言 SQL  */
--  期コントロール (M_ACC_TERM)
    vc2STM_CompnayCd        VARCHAR2(100);   --会社コード
    numSTM_Year             NUMBER(4);      --年
    numSTM_Term             NUMBER(6);      --期
    dtmSTM_TurnDate1        DATE;           --変更開始年月日１
    numSTM_TurnYearMonth1   NUMBER(6);      --変更開始月度１
    numSTM_TurnTerm1        NUMBER(6);      --変更期１
    dtmSTM_TurnDate2        DATE;           --変更開始年月日２
    numSTM_TurnYearMonth2   NUMBER(6);      --変更開始月度２
    numSTM_TurnTerm2        NUMBER(6);      --変更期２

--  期期間マスタ (M_ACC_TERM_PERIOD)
    vc2SDT_CompanyCd        VARCHAR2(100);   --会社コード
    numSDT_TERM             NUMBER(4);      --期
    numSDT_YearMonth1       NUMBER(6);      --年月度１
    dtmSDT_StartDate1       DATE;           --開始年月日１
    dtmSDT_EndDate1         DATE;           --終了年月日１
    numSDT_YearMonth2       NUMBER(6);      --年月度２
    dtmSDT_StartDate2       DATE;           --開始年月日２
    dtmSDT_EndDate2         DATE;           --終了年月日２
    numSDT_YearMonth3       NUMBER(6);      --年月度３
    dtmSDT_StartDate3       DATE;           --開始年月日３
    dtmSDT_EndDate3         DATE;           --終了年月日３
    numSDT_YearMonth4       NUMBER(6);      --年月度４
    dtmSDT_StartDate4       DATE;           --開始年月日４
    dtmSDT_EndDate4         DATE;           --終了年月日４
    numSDT_YearMonth5       NUMBER(6);      --年月度５
    dtmSDT_StartDate5       DATE;           --開始年月日５
    dtmSDT_EndDate5         DATE;           --終了年月日５
    numSDT_YearMonth6       NUMBER(6);      --年月度６
    dtmSDT_StartDate6       DATE;           --開始年月日６
    dtmSDT_EndDate6         DATE;           --終了年月日６
    numSDT_YearMonth7       NUMBER(6);      --年月度７
    dtmSDT_StartDate7       DATE;           --開始年月日７
    dtmSDT_EndDate7         DATE;           --終了年月日７
    numSDT_YearMonth8       NUMBER(6);      --年月度８
    dtmSDT_StartDate8       DATE;           --開始年月日８
    dtmSDT_EndDate8         DATE;           --終了年月日８
    numSDT_YearMonth9       NUMBER(6);      --年月度９
    dtmSDT_StartDate9       DATE;           --開始年月日９
    dtmSDT_EndDate9         DATE;           --終了年月日９
    numSDT_YearMonth10      NUMBER(6);      --年月度１０
    dtmSDT_StartDate10      DATE;           --開始年月日１０
    dtmSDT_EndDate10        DATE;           --終了年月日１０
    numSDT_YearMonth11      NUMBER(6);      --年月度１１
    dtmSDT_StartDate11      DATE;           --開始年月日１１
    dtmSDT_EndDate11        DATE;           --終了年月日１１
    numSDT_YearMonth12      NUMBER(6);      --年月度１２
    dtmSDT_StartDate12      DATE;           --開始年月日１２
    dtmSDT_EndDate12        DATE;           --終了年月日１２
    numSDT_Year             NUMBER(4);      --年度

/* 変数の宣言 WORK */
    numAction               NUMBER(2);
    numInDateLen            NUMBER;          --入力日付長
    dtmInDate               DATE;
    numTerm                 NUMBER(6);       --期
    numYear                 NUMBER(4);       --年
    numYearMonth            NUMBER(6);       --年月度
    vc2YearMonth            VARCHAR2(24);     --年月度
    blnRet                  BOOLEAN;         --返却値
    blnContents             BOOLEAN;         --日付フォーマットチェックフラグ

/*計算用ワーク*/

/*エラー用ワーク*/

BEGIN

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, 'Input CompanyCd:' || pvc2CompanyCd || ' InDate:' || pvc2InDate);

    pnumTerm           := 0;       --期数
    pnumYear           := 0;       --年度
    pdtmTermStartDate  := NULL;    --期の開始年月日
    pdtmTermEndDate    := NULL;    --期の終了年月日
    pnumYearMonth      := 0;       --年月度
    pdtmMonthStartDate := NULL;    --年月度の開始年月日
    pdtmMonthEndDate   := NULL;    --年月度の終了年月日
    pnumTableNo        := 0;       --月度テーブルNo.

    numInDateLen := LENGTHB(pvc2InDate);
    IF numInDateLen = 10 THEN
        numAction := ACTION_TYP_DATE;
    ELSIF numInDateLen = 6 THEN
        numAction := ACTION_TYP_YAERMONTH;
    ELSE
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, ERRCD_CECD_ERRNO, 'Input Date Format Error' || pvc2InDate);

        RAISE excFNC_PARAMETER_ERR;
    END IF;

    IF numAction = ACTION_TYP_DATE THEN
        DECLARE --年月日を日付型に変換する
        BEGIN
            dtmInDate := TO_DATE(pvc2InDate || '00:00:00', 'yyyy/mm/dd HH24:MI:SS');
            blnContents := FALSE;

        EXCEPTION
            WHEN OTHERS THEN
                blnContents := TRUE;
        END;
    ELSE
        DECLARE --年月を数値型に変換する
        BEGIN
            numYearMonth := TO_NUMBER(pvc2InDate);
            blnContents := FALSE;

        EXCEPTION
            WHEN OTHERS THEN
                blnContents := TRUE;
        END;
    END IF;

    IF blnContents THEN
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, ERRCD_DATE_FORMAT_ERR, 'Input Date Contents Error' || pvc2InDate);

        RAISE excFNC_PARAMETER_ERR;
    END IF;

    -- 会社コードのチェック
    IF (pvc2CompanyCd IS NULL)      OR
       (LENGTHB(pvc2CompanyCd) = 0) THEN

        RAISE excFNC_PARAMETER_ERR;
    END IF;

    /* 年を数値に変換する */
    numYear := TO_NUMBER(SUBSTR(pvc2InDate,1,4));

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, 'COMPANY_CD:' || pvc2CompanyCd || ' YEAR:' || TO_CHAR(numYear));

    /* 期コントロール取得 */
    BEGIN
        SELECT  COMPANY_CD,YEAR,TERM,
                TURN_DATE_1,TURN_YEAR_MONTH_1,TURN_TERM_1,
                TURN_DATE_2,TURN_YEAR_MONTH_2,TURN_TERM_2
          INTO  vc2STM_CompnayCd,numSTM_Year,numSTM_Term,
                dtmSTM_TurnDate1,numSTM_TurnYearMonth1,numSTM_TurnTerm1,
                dtmSTM_TurnDate2,numSTM_TurnYearMonth2,numSTM_TurnTerm2
          FROM  M_ACC_TERM
         WHERE  COMPANY_CD = pvc2CompanyCd AND
                YEAR       = numYear;

    EXCEPTION
--      期コントロールなし
        WHEN NO_DATA_FOUND THEN
            /* ErrorLog の出力 */
            blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, ERRCD_NOTEXIST_DATA, 'M_ACC_TERM COMPANY_CD:' || pvc2CompanyCd || ' YEAR:' || TO_CHAR(numYear));

            RAISE excFNC_MST_NODATA;
    END;

    /* 期数を求める */
    /* 年月日時の処理 */
    IF numAction = ACTION_TYP_DATE THEN
        IF (dtmSTM_TurnDate1 IS NULL)     OR
           (dtmInDate < dtmSTM_TurnDate1) THEN
            numTerm := numSTM_Term;
        ELSE
            IF dtmSTM_TurnDate2 IS NULL THEN
                numTerm := numSTM_TurnTerm1;
            ELSE
                IF (dtmSTM_TurnDate1 <= dtmInDate)   AND
                   (dtmInDate < dtmSTM_TurnDate2)    THEN
                    numTerm := numSTM_TurnTerm1;
                ELSE
                    numTerm := numSTM_TurnTerm2;
                END IF;
            END IF;
        END IF;
    /* 年月時の処理 */
    ELSE
        IF (numYearMonth < numSTM_TurnYearMonth1) OR
           (numSTM_TurnYearMonth1 = 0)                   THEN
            numTerm := numSTM_Term;
        ELSE
            IF numSTM_TurnYearMonth2 = 0    THEN
                numTerm := numSTM_TurnTerm1;
            ELSE
                IF (numSTM_TurnYearMonth1 <= pvc2InDate) AND
                   (numYearMonth < numSTM_TurnYearMonth2)  THEN
                    numTerm := numSTM_TurnTerm1;
                ELSE
                    numTerm := numSTM_TurnTerm2;
                END IF;
            END IF;
        END IF;
    END IF;

    pnumTerm := numTerm;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, 'COMPANY_CD:' || pvc2CompanyCd || ' TERM:' || TO_CHAR(numTerm));

    /* 日付コントロール取得 */
    BEGIN
        SELECT COMPANY_CD,TERM,
               YEAR_MONTH_1 ,START_DATE_1 ,END_DATE_1,
               YEAR_MONTH_2 ,START_DATE_2 ,END_DATE_2,
               YEAR_MONTH_3 ,START_DATE_3 ,END_DATE_3,
               YEAR_MONTH_4 ,START_DATE_4 ,END_DATE_4,
               YEAR_MONTH_5 ,START_DATE_5 ,END_DATE_5,
               YEAR_MONTH_6 ,START_DATE_6 ,END_DATE_6,
               YEAR_MONTH_7 ,START_DATE_7 ,END_DATE_7,
               YEAR_MONTH_8 ,START_DATE_8 ,END_DATE_8,
               YEAR_MONTH_9 ,START_DATE_9 ,END_DATE_9,
               YEAR_MONTH_10,START_DATE_10,END_DATE_10,
               YEAR_MONTH_11,START_DATE_11,END_DATE_11,
               YEAR_MONTH_12,START_DATE_12,END_DATE_12, YEAR
          INTO vc2SDT_CompanyCd,numSDT_TERM,
               numSDT_YearMonth1 ,dtmSDT_StartDate1 ,dtmSDT_EndDate1,
               numSDT_YearMonth2 ,dtmSDT_StartDate2 ,dtmSDT_EndDate2,
               numSDT_YearMonth3 ,dtmSDT_StartDate3 ,dtmSDT_EndDate3,
               numSDT_YearMonth4 ,dtmSDT_StartDate4 ,dtmSDT_EndDate4,
               numSDT_YearMonth5 ,dtmSDT_StartDate5 ,dtmSDT_EndDate5,
               numSDT_YearMonth6 ,dtmSDT_StartDate6 ,dtmSDT_EndDate6,
               numSDT_YearMonth7 ,dtmSDT_StartDate7 ,dtmSDT_EndDate7,
               numSDT_YearMonth8 ,dtmSDT_StartDate8 ,dtmSDT_EndDate8,
               numSDT_YearMonth9 ,dtmSDT_StartDate9 ,dtmSDT_EndDate9,
               numSDT_YearMonth10,dtmSDT_StartDate10,dtmSDT_EndDate10,
               numSDT_YearMonth11,dtmSDT_StartDate11,dtmSDT_EndDate11,
               numSDT_YearMonth12,dtmSDT_StartDate12,dtmSDT_EndDate12, numSDT_Year
            FROM M_ACC_TERM_PERIOD
            WHERE COMPANY_CD = pvc2CompanyCd AND
                  TERM       = numTerm;

    EXCEPTION
--      期期間マスタなし
        WHEN NO_DATA_FOUND THEN
            /* ErrorLog の出力 */
            blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, ERRCD_NOTEXIST_DATA, 'M_ACC_TERM_PERIOD COMPANY_CD:' || pvc2CompanyCd || ' TERM:' || numTerm);

            RAISE excFNC_MST_NODATA;
    END;

    /* 年月日時の処理の場合、年月度を数値に変換する */
    IF numAction = ACTION_TYP_DATE THEN
        vc2YearMonth := SUBSTR(pvc2InDate,1,4);
        vc2YearMonth := vc2YearMonth || SUBSTR(pvc2InDate,6,2);
        numYearMonth := TO_NUMBER(vc2YearMonth);
    END IF;

    /* 期の開始年月日 */
    pdtmTermStartDate := dtmSDT_StartDate1;

    /* 期の終了年月日 */
    IF dtmSDT_EndDate12 IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate12;
    ELSIF dtmSDT_EndDate11 IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate11;
    ELSIF dtmSDT_EndDate10 IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate10;
    ELSIF dtmSDT_EndDate9  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate9 ;
    ELSIF dtmSDT_EndDate8  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate8 ;
    ELSIF dtmSDT_EndDate7  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate7 ;
    ELSIF dtmSDT_EndDate6  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate6 ;
    ELSIF dtmSDT_EndDate5  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate5 ;
    ELSIF dtmSDT_EndDate4  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate4 ;
    ELSIF dtmSDT_EndDate3  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate3 ;
    ELSIF dtmSDT_EndDate2  IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate2 ;
    ELSIF dtmSDT_EndDate1 IS NOT NULL THEN
        pdtmTermEndDate := dtmSDT_EndDate1 ;
    END IF;

    /* 年月日時の処理 */
    IF numAction = ACTION_TYP_DATE THEN
        IF (dtmSDT_StartDate1 <= dtmInDate) AND
           (dtmInDate <= dtmSDT_EndDate1)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate1;
            pdtmMonthEndDate   := dtmSDT_EndDate1;
            pnumYearMonth      := numSDT_YearMonth1;
            pnumTableNo        := 1;
        ELSIF (dtmSDT_StartDate2 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate2)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate2;
            pdtmMonthEndDate   := dtmSDT_EndDate2;
            pnumYearMonth      := numSDT_YearMonth2;
            pnumTableNo        := 2;
        ELSIF (dtmSDT_StartDate3 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate3)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate3;
            pdtmMonthEndDate   := dtmSDT_EndDate3;
            pnumYearMonth      := numSDT_YearMonth3;
            pnumTableNo        := 3;
        ELSIF (dtmSDT_StartDate4 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate4)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate4;
            pdtmMonthEndDate   := dtmSDT_EndDate4;
            pnumYearMonth      := numSDT_YearMonth4;
            pnumTableNo        := 4;
        ELSIF (dtmSDT_StartDate5 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate5)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate5;
            pdtmMonthEndDate   := dtmSDT_EndDate5;
            pnumYearMonth      := numSDT_YearMonth5;
            pnumTableNo        := 5;
        ELSIF (dtmSDT_StartDate6 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate6) THEN
            pdtmMonthStartDate := dtmSDT_StartDate6;
            pdtmMonthEndDate   := dtmSDT_EndDate6;
            pnumYearMonth      := numSDT_YearMonth6;
            pnumTableNo        := 6;
        ELSIF (dtmSDT_StartDate7 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate7)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate7;
            pdtmMonthEndDate   := dtmSDT_EndDate7;
            pnumYearMonth      := numSDT_YearMonth7;
            pnumTableNo        := 7;
        ELSIF (dtmSDT_StartDate8 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate8)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate8;
            pdtmMonthEndDate   := dtmSDT_EndDate8;
            pnumYearMonth      := numSDT_YearMonth8;
            pnumTableNo        := 8;
        ELSIF (dtmSDT_StartDate9 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate9)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate9;
            pdtmMonthEndDate   := dtmSDT_EndDate9;
            pnumYearMonth      := numSDT_YearMonth9;
            pnumTableNo        := 9;
        ELSIF (dtmSDT_StartDate10 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate10)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate10;
            pdtmMonthEndDate   := dtmSDT_EndDate10;
            pnumYearMonth      := numSDT_YearMonth10;
            pnumTableNo        := 10;
        ELSIF (dtmSDT_StartDate11 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate11)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate11;
            pdtmMonthEndDate   := dtmSDT_EndDate11;
            pnumYearMonth      := numSDT_YearMonth11;
            pnumTableNo        := 11;
        ELSIF (dtmSDT_StartDate12 <= dtmInDate) AND
              (dtmInDate <= dtmSDT_EndDate12)   THEN
            pdtmMonthStartDate := dtmSDT_StartDate12;
            pdtmMonthEndDate   := dtmSDT_EndDate12;
            pnumYearMonth      := numSDT_YearMonth12;
            pnumTableNo        := 12;
        ELSE
            RAISE excFNC_M_ACC_TERM_PERIOD_ERR;
        END IF;
    /* 年月時の処理 */
    ELSE
        IF numSDT_YearMonth1 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate1;
            pdtmMonthEndDate   := dtmSDT_EndDate1;
            pnumYearMonth      := numSDT_YearMonth1;
            pnumTableNo        := 1;
        ELSIF numSDT_YearMonth2 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate2;
            pdtmMonthEndDate   := dtmSDT_EndDate2;
            pnumYearMonth      := numSDT_YearMonth2;
            pnumTableNo        := 2;
        ELSIF numSDT_YearMonth3 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate3;
            pdtmMonthEndDate   := dtmSDT_EndDate3;
            pnumYearMonth      := numSDT_YearMonth3;
            pnumTableNo        := 3;
        ELSIF numSDT_YearMonth4 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate4;
            pdtmMonthEndDate   := dtmSDT_EndDate4;
            pnumYearMonth      := numSDT_YearMonth4;
            pnumTableNo        := 4;
        ELSIF numSDT_YearMonth5 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate5;
            pdtmMonthEndDate   := dtmSDT_EndDate5;
            pnumYearMonth      := numSDT_YearMonth5;
            pnumTableNo        := 5;
        ELSIF numSDT_YearMonth6 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate6;
            pdtmMonthEndDate   := dtmSDT_EndDate6;
            pnumYearMonth      := numSDT_YearMonth6;
            pnumTableNo        := 6;
        ELSIF numSDT_YearMonth7 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate7;
            pdtmMonthEndDate   := dtmSDT_EndDate7;
            pnumYearMonth      := numSDT_YearMonth7;
            pnumTableNo        := 7;
        ELSIF numSDT_YearMonth8 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate8;
            pdtmMonthEndDate   := dtmSDT_EndDate8;
            pnumYearMonth      := numSDT_YearMonth8;
            pnumTableNo        := 8;
        ELSIF numSDT_YearMonth9 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate9;
            pdtmMonthEndDate   := dtmSDT_EndDate9;
            pnumYearMonth      := numSDT_YearMonth9;
            pnumTableNo        := 9;
        ELSIF numSDT_YearMonth10 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate10;
            pdtmMonthEndDate   := dtmSDT_EndDate10;
            pnumYearMonth      := numSDT_YearMonth10;
            pnumTableNo        := 10;
        ELSIF numSDT_YearMonth11 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate11;
            pdtmMonthEndDate   := dtmSDT_EndDate11;
            pnumYearMonth      := numSDT_YearMonth11;
            pnumTableNo        := 11;
        ELSIF numSDT_YearMonth12 = numYearMonth THEN
            pdtmMonthStartDate := dtmSDT_StartDate12;
            pdtmMonthEndDate   := dtmSDT_EndDate12;
            pnumYearMonth      := numSDT_YearMonth12;
            pnumTableNo        := 12;
        ELSE
            RAISE excFNC_M_ACC_TERM_PERIOD_ERR;
        END IF;
    END IF;

    /* 年度を設定する */
    pnumYear := numSDT_Year;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excFNC_PARAMETER_ERR OR            --入力パラメータエラー
         excFNC_MST_NODATA    THEN          --マスタなしエラー
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;

    WHEN excFNC_M_ACC_TERM_PERIOD_ERR  THEN          --期期間マスタエラー
         /* ErrorLog の出力 */
         blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, ERRCD_CECD_ERRNO, 'M_ACC_TERM_PERIOD Date Error InDate:' || pvc2InDate);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;

    WHEN OTHERS THEN                        --その他のエラー
         /* ErrorLog の出力 */
         blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/
