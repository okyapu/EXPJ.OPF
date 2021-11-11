CREATE OR REPLACE FUNCTION FNCWORKMINUTECALC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2007.03.06 初版
'
' 機能      : 稼働日計算
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
'             pvc2ItemCd           - (i)品目番号
'             pdtmDate             - (i)対象日時
'             pnumDifference       - (i)差分（分単位）
'             pblnStartForwardFlg  - (i)基準日の前倒しフラグ
'             pdtmActiveDate       - (o)算出稼働日時
'
' 機能説明  : 指定された対象日時から稼働日ベースで差分の分だけ後倒した日時を算出する。
'             差分をマイナス指定した場合は指定差分の分だけ前倒した日時を算出する。
'             対象日付が休日の場合、基準日前倒しフラグがTRUEであれば
'             その日以降の初めの稼働日を基準日とする。
'             FALSEの場合はその日以前の初めの稼働日を基準日とする。
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2ItemCd          IN  VARCHAR2            --品目番号
   ,pdtmDate            IN  DATE                --対象日付
   ,pnumDifference      IN  NUMBER              --差分（分単位）
   ,pblnStartForwardFlg IN  BOOLEAN             --基準日の前倒しフラグ
   ,pdtmActiveDate      OUT DATE                --算出稼働日
    ) RETURN BOOLEAN
IS

------------------
-- カーソル宣言 --
------------------
    --【午前の就業開始時刻を分に換算して取得】
    --（08:30なら8*60+30=510に換算）
CURSOR curSYS_PARAMETER_AM_ST IS
    SELECT  SUBSTR(VALUE,1,2)*60 + SUBSTR(VALUE,4,2)
    FROM    SYS_PARAMETER
    WHERE   NAME   = 'AM_START_TIME';

    --【午前の就業終了時刻を分に換算して取得】
CURSOR curSYS_PARAMETER_AM_ED IS
    SELECT  SUBSTR(VALUE,1,2)*60 + SUBSTR(VALUE,4,2)
    FROM    SYS_PARAMETER
    WHERE   NAME   = 'AM_END_TIME';

    --【午後の就業開始時刻を分に換算して取得】
CURSOR curSYS_PARAMETER_PM_ST IS
    SELECT  SUBSTR(VALUE,1,2)*60 + SUBSTR(VALUE,4,2)
    FROM    SYS_PARAMETER
    WHERE   NAME   = 'PM_START_TIME';

    --【午後の就業終了時刻を分に換算して取得】
CURSOR curSYS_PARAMETER_PM_ED IS
    SELECT  SUBSTR(VALUE,1,2)*60 + SUBSTR(VALUE,4,2)
    FROM    SYS_PARAMETER
    WHERE   NAME   = 'PM_END_TIME';

-----------------
-- CONST値宣言 --
-----------------
    MY_SQL_NAME             VARCHAR2(90)    := 'FncWorkMinuteCalc'; --ＰＬ／ＳＱＬ名
    LOGMSG_START            VARCHAR2(20)    := 'Start';             --ログ用メソッド開始宣言
    LOGMSG_END              VARCHAR2(12)    := 'End';               --ログ用メソッド終了宣言

-----------------
-- MESSAGE宣言 --
-----------------
    APS_BATCH_END           VARCHAR2(28)    := 'ZZ09002';    --バッチ処理を終了しました

--------------
-- WORK変数 --
--------------
    blnRet              BOOLEAN;        -- Function返却値
    dtmActiveDate       DATE;           -- wk稼働日
    dtmTruncDate        DATE;           -- wk対象日付
    dtmTruncTime        NUMBER(30);     -- wk対象時刻
    dtmAMStartTime      NUMBER(10);     -- wk午前開始時刻の分換算値
    dtmAMEndTime        NUMBER(10);     -- wk午前終了時刻の分換算値
    dtmPMStartTime      NUMBER(10);     -- wk午後開始時刻の分換算値
    dtmPMEndTime        NUMBER(10);     -- wk午後終了時刻の分換算値
    numTime             NUMBER(10);     -- 計算中の現在時刻
    numDiffTime         NUMBER(10);     -- 差分計算時の残分数
    numResultTime       NUMBER(10);     -- 計算の結果取得した時刻

    excWORK_DAY_CALC_ERR   EXCEPTION;   --稼働日取得エラー

BEGIN

    /* 時刻部分を無視した対象日付を取得 */
    dtmTruncDate := TRUNC(pdtmDate);

    /* 日付部分を無視した対象時刻の分換算値を取得 */
    dtmTruncTime := TO_CHAR(pdtmDate,'HH24')*60 + TO_CHAR(pdtmDate,'MI');

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 午前開始時刻の取得 */
    OPEN curSYS_PARAMETER_AM_ST;
    FETCH curSYS_PARAMETER_AM_ST INTO dtmAMStartTime;
    CLOSE curSYS_PARAMETER_AM_ST;
    
    /* 午前終了時刻の取得 */
    OPEN curSYS_PARAMETER_AM_ED;
    FETCH curSYS_PARAMETER_AM_ED INTO dtmAMEndTime;
    CLOSE curSYS_PARAMETER_AM_ED;
    
    /* 午後開始時刻の取得 */
    OPEN curSYS_PARAMETER_PM_ST;
    FETCH curSYS_PARAMETER_PM_ST INTO dtmPMStartTime;
    CLOSE curSYS_PARAMETER_PM_ST;
    
    /* 午後終了時刻の取得 */
    OPEN curSYS_PARAMETER_PM_ED;
    FETCH curSYS_PARAMETER_PM_ED INTO dtmPMEndTime;
    CLOSE curSYS_PARAMETER_PM_ED;
    
    /* 午前午後の開始終了時刻のどれか１つでも取得できなければ */
    /* 午前は00:00-12:30、午後は12:30-23:59とみなして計算する */
    IF dtmAMStartTime IS NOT NULL AND
       dtmAMEndTime   IS NOT NULL AND
       dtmPMStartTime IS NOT NULL AND
       dtmPMEndTime   IS NOT NULL THEN
       NULL;
    ELSE
       dtmAMStartTime   := 0;   --00:00
       dtmAMEndTime     := 750; --12:30
       dtmPMStartTime   := 750; --12:30
       dtmPMEndTime     := 1440;--24:00
    END IF;
    
    /* 現在時刻を変数に設定する */
    dtmActiveDate   := dtmTruncDate;
    numTime         := dtmTruncTime;
    numDiffTime     := pnumDifference;

    /* LT計算処理 */
    IF pnumDifference = 0 THEN
        /* LTが0の場合は、直近の開始日時を計算する */
        IF numTime <= dtmAMStartTime THEN
            numResultTime   := dtmAMStartTime;
        ELSIF dtmAMEndTime <= numTime AND numTime <= dtmPMStartTime THEN
            numResultTime   := dtmPMStartTime;
        ELSIF dtmPMEndTime <= numTime THEN
            --翌稼働日 を取得   ------FncWorkDayCalc-------
            blnRet := FNCWORKDAYCALC(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,pvc2ItemCd,
                            dtmActiveDate, 1, pblnStartForwardFlg, dtmActiveDate);
            IF blnRet = FALSE THEN
                RAISE excWORK_DAY_CALC_ERR;
            END IF;
            numResultTime   := dtmAMStartTime;
        ELSE
            numResultTime   := dtmTruncTime;
        END IF;

    ELSE
        LOOP
            /* 対象時刻が午前の場合 */
            IF numTime <= dtmAMEndTime THEN

                /* 対象時刻が就業時刻前の場合 */
                IF numTime <= dtmAMStartTime THEN
                    numTime := dtmAMStartTime;
                END IF;
                
                /* 計算後の時刻が午前で終わる場合 */
                IF numTime + numDiffTime <= dtmAMEndTime THEN
                    numResultTime   := numTime + numDiffTime;
                    EXIT;

                /* 計算後の時刻が午前で終わらない場合 */
                ELSE
                    /* 午前の作業時間を差分から差し引いて午後の作業時間を計算する */
                    numDiffTime := numDiffTime - (dtmAMEndTime - numTime);
                    numTime     := dtmPMStartTime;

                    /* 計算後の時刻が午後で終わる場合 */
                    IF numTime + numDiffTime <= dtmPMEndTime THEN
                        numResultTime   := numTime + numDiffTime;
                        EXIT;

                    /* 本日中に作業が終わらない場合 */
                    ELSE
                        --翌稼働日 を取得   ------FncWorkDayCalc-------
                        blnRet := FNCWORKDAYCALC(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                     pvc2UserId, pvc2BusinessName, pvc2PlantCd,pvc2ItemCd,
                                     dtmActiveDate, 1, pblnStartForwardFlg, dtmActiveDate);
                        IF blnRet = FALSE THEN
                            RAISE excWORK_DAY_CALC_ERR;
                        END IF;

                        /* 午後の作業時間を差分から差し引いて翌日の作業時間を計算する */
                        numDiffTime := numDiffTime - (dtmPMEndTime - numTime);
                        numTime     := dtmAMStartTime;
                    END IF;
                END IF;

            /* 対象時刻が午後の場合 */
            ELSE

                /* 対象時刻が昼休みの場合 */
                IF numTime <= dtmPMStartTime THEN
                    numTime := dtmPMStartTime;
                END IF;

                /* 対象時刻が就業時間後の場合 */
                IF numTime >= dtmPMEndTime THEN
                    numTime := dtmPMEndTime;
                END IF;

                /* 計算後の時刻が午後で終わる場合 */
                IF numTime + numDiffTime <= dtmPMEndTime THEN
                    numResultTime   := numTime + numDiffTime;
                    EXIT;

                /* 本日中に作業が終わらない場合 */
                ELSE
                    --翌稼働日 を取得   ------FncWorkDayCalc-------
                    blnRet := FNCWORKDAYCALC(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,pvc2ItemCd,
                                    dtmActiveDate, 1, pblnStartForwardFlg, dtmActiveDate);
                    IF blnRet = FALSE THEN
                        RAISE excWORK_DAY_CALC_ERR;
                    END IF;

                    /* 午後の作業時間を差分から差し引いて翌日の作業時間を計算する */
                    numDiffTime := numDiffTime - (dtmPMEndTime - numTime);
                    numTime     := dtmAMStartTime;
                END IF;

            END IF;
            EXIT WHEN numDiffTime <= 0;
        END LOOP;
    END IF;
    
    /*リードタイムが２４の倍数場合*/
    IF numResultTime = 1440 THEN
        numResultTime := 0;
        --翌稼働日 を取得   ------FncWorkDayCalc-------
        blnRet := FNCWORKDAYCALC(pFileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,pvc2ItemCd,
                        dtmActiveDate, 1, pblnStartForwardFlg, dtmActiveDate);
        IF blnRet = FALSE THEN
            RAISE excWORK_DAY_CALC_ERR;
        END IF;
    END IF;
    
    pdtmActiveDate := TO_DATE(TO_CHAR(dtmActiveDate,'YYYYMMDD') || TO_CHAR(TRUNC(numResultTime/60),'00') || TO_CHAR(MOD(numResultTime,60),'00'),'YYYYMMDDHH24MI');

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- 正常終了

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excWORK_DAY_CALC_ERR      THEN    -- 稼働日取得エラー
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, '(SBM0066)：稼働日算出エラー');
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN OTHERS THEN
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
