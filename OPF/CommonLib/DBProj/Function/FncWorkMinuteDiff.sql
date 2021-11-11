CREATE OR REPLACE FUNCTION FNCWORKMINUTEDIFF(
/*------------------------------------------------------------------------------
'
' version   : 1.10.00
'
' 修正履歴
' 2008.07.07 初版
'
' 機能      : 稼働日計算：指定日時間の稼動時間上の差（分数）を求める
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
'             pdtmDateFrom         - (i)対象日時From（Min）基準日時
'             pdtmDateTo           - (i)対象日時To（Max）比較日時
'             pnumDifference       - (o)差分（分単位）※「－」の場合は過去へ
'
' 機能説明  : 	・指定日時間の稼動時間上の差（分数）を求める
'				・稼動時間は、SYS_PARAMETER（AM：AM_START_TIME - AM_END_TIME、 PM：PM_START_TIME - PM_END_TIME）
'					から取得する。（現在の構造上は、単一工場のみが前提）

------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2ItemCd          IN  VARCHAR2            --品目番号
   ,pdtmDateFrom          IN  DATE                --対象日付From（Min）基準日時
   ,pdtmDateTo            IN  DATE                --対象日付To（Max）比較日時
   ,pnumDifference      OUT  NUMBER              --差分（分単位）※「－」の場合、過去へ
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
    MY_SQL_NAME             VARCHAR2(90)    := 'FncWorkMinuteDiff'; --ＰＬ／ＳＱＬ名
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
    --dtmTruncDate        DATE;           -- wk対象日付
    --dtmTruncTime        NUMBER(30);     -- wk対象時刻
    
    nAMStartTime      NUMBER(10);     -- wk午前開始時刻の分換算値
    nAMEndTime        NUMBER(10);     -- wk午前終了時刻の分換算値
    nPMStartTime      NUMBER(10);     -- wk午後開始時刻の分換算値
    nPMEndTime        NUMBER(10);     -- wk午後終了時刻の分換算値
    
    --numTime             NUMBER(10);     -- 計算中の現在時刻
    --numDiffTime         NUMBER(10);     -- 差分計算時の残分数
    --numResultTime       NUMBER(10);     -- 計算の結果取得した時刻

    excWORK_DAY_CALC_ERR   EXCEPTION;   --稼働日取得エラー
    
	nRetDiff		NUMBER(18);
	nSign			NUMBER(2);	--

	dtBIG		DATE;		-- wk対象日付
	dtSML		DATE;		-- wk対象日付
	
	dtCURDATE	DATE;		-- wk日付（時間なし）
	dtCURDTTM	DATE;		-- wk日付（時間あり）

    dtAMStart      DATE;		-- 午前開始日付（時間あり）
    dtAMEnd        DATE;		-- 午前終了日付（時間あり）
    dtPMStart      DATE;		-- 午後開始日付（時間あり）
    dtPMEnd        DATE;		-- 午後終了日付（時間あり）

BEGIN


    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 午前開始時刻の取得 */
    OPEN curSYS_PARAMETER_AM_ST;
    FETCH curSYS_PARAMETER_AM_ST INTO nAMStartTime;
    CLOSE curSYS_PARAMETER_AM_ST;
    
    /* 午前終了時刻の取得 */
    OPEN curSYS_PARAMETER_AM_ED;
    FETCH curSYS_PARAMETER_AM_ED INTO nAMEndTime;
    CLOSE curSYS_PARAMETER_AM_ED;
    
    /* 午後開始時刻の取得 */
    OPEN curSYS_PARAMETER_PM_ST;
    FETCH curSYS_PARAMETER_PM_ST INTO nPMStartTime;
    CLOSE curSYS_PARAMETER_PM_ST;
    
    /* 午後終了時刻の取得 */
    OPEN curSYS_PARAMETER_PM_ED;
    FETCH curSYS_PARAMETER_PM_ED INTO nPMEndTime;
    CLOSE curSYS_PARAMETER_PM_ED;
    
    /* 午前午後の開始終了時刻のどれか１つでも取得できなければ */
    /* 午前は00:00-12:30、午後は12:30-23:59とみなして計算する */
    IF nAMStartTime IS NOT NULL AND
       nAMEndTime   IS NOT NULL AND
       nPMStartTime IS NOT NULL AND
       nPMEndTime   IS NOT NULL THEN
       NULL;
    ELSE
       nAMStartTime   := 0;   --00:00
       nAMEndTime     := 750; --12:30
       nPMStartTime   := 750; --12:30
       nPMEndTime     := 1440;--24:00
    END IF;
    
	---------------------------------------Sign
	nRetDiff := 0;
	IF pdtmDateFrom > pdtmDateTo THEN
		nSign := -1;
		dtBIG := pdtmDateFrom;
		dtSML := pdtmDateTo;
	ELSE
		nSign := 1;
		dtBIG := pdtmDateTo;
		dtSML := pdtmDateFrom;
	END IF ;
	dtBIG := TRUNC(dtBIG,'MI');
	dtSML := TRUNC(dtSML,'MI');
	---------------------------------------
	dtCURDATE := TRUNC(dtSML);		-- wk日付（時間なし）
	dtCURDTTM := dtSML;				-- wk日付（時間あり）
	
	-------稼働日シフト０日  ------FncWorkDayCalc-------
	blnRet := FNCWORKDAYCALC(
					pFileHandle, 
					pvc2LogMode, 
					pvc2OutputMode,
					pvc2UserId, 
					pvc2BusinessName, 
					pvc2PlantCd,
					pvc2ItemCd,
					TRUNC(dtCURDATE), 
					0, 		---※当日が稼動日でなければ翌稼働日を求める
					TRUE,	
					dtmActiveDate);
	IF blnRet = FALSE THEN
		RAISE excWORK_DAY_CALC_ERR;
	END IF;
	IF dtmActiveDate != dtCURDATE THEN	--稼働日シフトされた場合
		dtCURDATE := TRUNC(dtmActiveDate);
		dtCURDTTM := TRUNC(dtmActiveDate);
	END IF ;
	
	--dtSML→dtBIG----------
	WHILE (dtCURDTTM <= dtBIG) LOOP
		
		--dtCURDATE := TRUNC(dtCURDTTM);
		dtAMStart := (dtCURDATE + nAMStartTime/24/60);
		dtAMEnd   := (dtCURDATE + nAMEndTime/24/60);
		dtPMStart := (dtCURDATE + nPMStartTime/24/60);
		dtPMEnd   := (dtCURDATE + nPMEndTime/24/60);
		
		IF dtCURDATE <= dtCURDTTM AND dtCURDTTM < dtAMStart THEN
			nRetDiff := nRetDiff + 0 ;
			dtCURDTTM := dtAMStart ;		--→AMStart
			
		ELSIF dtAMStart <= dtCURDTTM AND dtCURDTTM < dtAMEnd THEN
			IF dtBIG < dtAMEnd THEN
				nRetDiff := nRetDiff + (dtBIG - dtCURDTTM)*24*60 ;
			ELSE
				nRetDiff := nRetDiff + (dtAMEnd - dtCURDTTM)*24*60 ;
			END IF ;
			dtCURDTTM := dtAMEnd ;		--→AMEnd
			
		ELSIF dtAMEnd <= dtCURDTTM AND dtCURDTTM < dtPMStart THEN
			nRetDiff := nRetDiff + 0 ;
			dtCURDTTM := dtPMStart ;		--→PMStart
		
		ELSIF dtPMStart <= dtCURDTTM AND dtCURDTTM < dtPMEnd THEN
			IF dtBIG < dtPMEnd THEN
				nRetDiff := nRetDiff + (dtBIG - dtCURDTTM)*24*60 ;
			ELSE
				nRetDiff := nRetDiff + (dtPMEnd - dtCURDTTM)*24*60 ;
			END IF ;
			dtCURDTTM := dtPMEnd ;		--→PMEnd OR NEXT
			
		ELSIF dtPMEnd <= dtCURDTTM AND dtCURDTTM < (dtCURDATE + 1) THEN
			nRetDiff := nRetDiff + 0 ;
			dtCURDTTM := (dtCURDATE + 1) ;		--→NEXT
		END IF ;
		
		IF dtCURDTTM >= (dtCURDATE + 1) THEN	--日時が翌日になった場合
			--翌稼働日 を取得   ------FncWorkDayCalc-------
			blnRet := FNCWORKDAYCALC(
							pFileHandle, 
							pvc2LogMode, 
							pvc2OutputMode,
							pvc2UserId, 
							pvc2BusinessName, 
							pvc2PlantCd,
							pvc2ItemCd,
							TRUNC(dtCURDATE), 
							1, 
							TRUE,	-- pblnStartForwardFlg, 
							dtmActiveDate);
			IF blnRet = FALSE THEN
				RAISE excWORK_DAY_CALC_ERR;
			END IF;
			dtCURDTTM := TRUNC(dtmActiveDate) ;
			dtCURDATE := TRUNC(dtmActiveDate) ;
		END IF ;
			
	END LOOP;
    
    pnumDifference := nRetDiff * nSign ;

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
