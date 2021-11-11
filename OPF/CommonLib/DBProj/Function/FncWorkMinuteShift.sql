CREATE OR REPLACE FUNCTION FNCWORKMINUTESHIFT(
/*------------------------------------------------------------------------------
'--TAB4--
'
' version   : 1.30.00
'
' 修正履歴
' 2008.07.10 初版	※稼動時間端の制御を加えた版
' 2008.09.29     Ver 1.20.00	シフト時間０分のとき、基準日時をそのまま返すように修正
' 2008.10.08 	 Ver 1.30.00	納期系以外に、開始日系の吸着指定に対応した。
'
' 機能      : 稼働日計算：指定日時間の指定時間（分）シフトした日時を求める
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
'             pnumDiff		       - (i)差分（分単位）※「－」の場合は過去へ
'             pnumEndFlg		   - (i)稼働時間帯の端の処理指定（開始日系：０、納期系：１）
'             pdtmShiftDate        - (o)計算結果日時
'
' 機能説明  :	・指定日時間の指定時間（分）のシフト結果を求める
'				・稼動時間は、SYS_PARAMETER（AM：AM_START_TIME - AM_END_TIME、 PM：PM_START_TIME - PM_END_TIME）
'					から取得する。（現在の構造上は、単一工場のみが前提）
'				・納期系、開始日系各々の吸着ルールは以下に従う
'						※	pnumEndFlg 開始日系	0 ::: >---oooooox-oooooox--->	稼動時間の最後は次の開始に
'						※	pnumEndFlg 納期系	1 ::: >---xoooooo-xoooooo--->	稼動時間の最初は前の終了に
'				・シフト量が０の場合、稼働時間帯への移動は行わない

------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2ItemCd          IN  VARCHAR2            --品目番号
   ,pdtmDateFrom        IN  DATE                --対象日付From（Min）基準日時
   ,pnumDiff      IN  NUMBER              --差分（分単位）※「－」の場合、過去へ
   ,pnumEndFlg      IN  NUMBER              --稼働時間帯の端の処理指定（開始日系：０、納期系：１）	
   ,pdtmShiftDate          OUT  DATE                --計算結果日時
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
    MY_SQL_NAME             VARCHAR2(90)    := 'FncWorkMinuteShift'; --ＰＬ／ＳＱＬ名
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

	--nRetDiff		NUMBER(18);
	nSign			NUMBER(2);	--
	--pblnStartForwardFlg BOOLEAN;

	dtBASE		DATE;		-- wk対象日付

	dtCURDATE	DATE;		-- wk日付（時間なし）
	dtCURDTTM	DATE;		-- wk日付（時間あり）

	nCurDiff	NUMBER(18);
	nWkDiff		NUMBER(18);

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

---------------ADD 20080929 シフト０の場合、そのまま
IF pnumDiff = 0 THEN
	pdtmShiftDate := pdtmDateFrom ;
	RETURN TRUE;
END IF;

	---------------------------------------Sign
	IF pnumDiff >= 0 THEN	--サインは素：-0.1とかだと、Shift:0の時、過去へ吸着
		nSign := 1;
	ELSE
		nSign := -1;
	END IF ;
	nCurDiff := pnumDiff ;
	IF nCurDiff >= 0 THEN
		nCurDiff := nCurDiff;
		--pblnStartForwardFlg := TRUE;
	ELSE
		nCurDiff := nCurDiff * (-1);
		--pblnStartForwardFlg := FALSE;
	END IF ;
	-------
	IF pnumDiff = 0 THEN	--0の場合は、稼動日の求める方向は、EndFlgから取得する
		IF pnumEndFlg = 0 THEN
			nSign := 1;
		ELSE
			nSign := -1;
		END IF;
	END IF;

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME ||' ■pdtmDateFrom: '|| TO_CHAR(pdtmDateFrom, 'YYYY/MM/DD HH24:MI:SS'));

	---------------------------------------
	dtBASE := TRUNC(pdtmDateFrom,'MI');
	dtCURDATE := TRUNC(dtBASE);		-- wk日付（時間なし）
	dtCURDTTM := dtBASE;			-- wk日付（時間あり）

	-------稼働日シフト０日  ------FncWorkDayCalc-------
	--計算開始位置
	IF nSign > 0 THEN
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
						TRUE,	--pblnStartForwardFlg,
						dtmActiveDate);
		IF blnRet = FALSE THEN
			RAISE excWORK_DAY_CALC_ERR;
		END IF;
		IF dtmActiveDate != dtCURDATE THEN	--稼働日シフトされた場合
			dtCURDATE := TRUNC(dtmActiveDate);
			dtCURDTTM := TRUNC(dtmActiveDate) ;		--翌日０時からプラス
	        -- TraceLog For DEBUG -----------------------
			blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
					pvc2UserId, pvc2BusinessName, pvc2PlantCd,
					MY_SQL_NAME,
					'DEBUG:DayShit:＋: '
						||TO_CHAR(dtBASE,'YYYY/MM/DD HH24:MI:SS')|| ' → '
						||TO_CHAR(dtCURDATE,'YYYY/MM/DD HH24:MI:SS')
					);
		END IF ;
	ELSE
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
						FALSE,	--pblnStartForwardFlg,
						dtmActiveDate);
		IF blnRet = FALSE THEN
			RAISE excWORK_DAY_CALC_ERR;
		END IF;
		IF dtmActiveDate != dtCURDATE THEN	--稼働日シフトされた場合
			dtCURDATE := TRUNC(dtmActiveDate);
			dtCURDTTM := TRUNC(dtmActiveDate) + 1;	--前日０時からマイナス
	        -- TraceLog For DEBUG -----------------------
			blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
					pvc2UserId, pvc2BusinessName, pvc2PlantCd,
					MY_SQL_NAME,
					'DEBUG:DayShift:－: '
						||TO_CHAR(dtBASE,'YYYY/MM/DD HH24:MI:SS')|| ' → '
						||TO_CHAR(dtCURDATE,'YYYY/MM/DD HH24:MI:SS')
					);
		END IF ;

	END IF;

	--dtBASE + pnumDiff----------
	WHILE (nCurDiff >= 0) LOOP

		IF nSign > 0 THEN	--------------------------------Forword

			--dtCURDATE := TRUNC(dtCURDTTM)
			dtAMStart := (dtCURDATE + nAMStartTime/24/60);
			dtAMEnd   := (dtCURDATE + nAMEndTime/24/60);
			dtPMStart := (dtCURDATE + nPMStartTime/24/60);
			dtPMEnd   := (dtCURDATE + nPMEndTime/24/60);

			IF dtCURDATE <= dtCURDTTM AND dtCURDTTM < dtAMStart THEN
				dtCURDTTM := dtAMStart ;		--→AMStart
				nCurDiff := nCurDiff - 0 ;

			ELSIF dtAMStart <= dtCURDTTM AND dtCURDTTM < dtAMEnd THEN
				--nWkDiff := (dtAMEnd - dtAMStart)*24*60 ;
				nWkDiff := (dtAMEnd - dtCURDTTM)*24*60 ;
				IF nCurDiff < nWkDiff THEN
					--dtCURDTTM := dtAMStart + nCurDiff/24/60  ;	--HIT
					dtCURDTTM := dtCURDTTM + nCurDiff/24/60  ;	--HIT
				ELSE
					dtCURDTTM := dtAMEnd  ;
				END IF ;
				nCurDiff := nCurDiff - nWkDiff ;

			ELSIF dtAMEnd <= dtCURDTTM AND dtCURDTTM < dtPMStart THEN
				dtCURDTTM := dtPMStart ;		--→PMStart
				nCurDiff := nCurDiff - 0 ;

			ELSIF dtPMStart <= dtCURDTTM AND dtCURDTTM < dtPMEnd THEN
				--nWkDiff := (dtPMEnd - dtPMStart)*24*60 ;
				nWkDiff := (dtPMEnd - dtCURDTTM)*24*60 ;
				IF nCurDiff < nWkDiff THEN
					--dtCURDTTM := dtPMStart + nCurDiff/24/60  ;	--HIT
					dtCURDTTM := dtCURDTTM + nCurDiff/24/60  ;	--HIT
				ELSE
					dtCURDTTM := dtPMEnd ;		--→PMEnd OR NEXT
				END IF ;
				nCurDiff := nCurDiff - nWkDiff ;

			ELSIF dtPMEnd <= dtCURDTTM AND dtCURDTTM < (dtCURDATE + 1) THEN
				dtCURDTTM := (dtCURDATE + 1) ;		--→NEXT
				nCurDiff := nCurDiff - 0 ;

			END IF ;

			IF nCurDiff = 0 AND pnumEndFlg != 0 THEN	--TEST 稼動時間:---xoooooo--->のパターンに------
				EXIT ;
			END IF;
																---DEF:---oooooox--->

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
		        -- TraceLog For DEBUG -----------------------
				blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
						pvc2UserId, pvc2BusinessName, pvc2PlantCd,
						MY_SQL_NAME,
						'DEBUG:DayShift:Calc＋: '
							||TO_CHAR(dtCURDTTM,'YYYY/MM/DD HH24:MI:SS')|| ' → '
							||TO_CHAR(dtmActiveDate,'YYYY/MM/DD HH24:MI:SS')
						);
				dtCURDTTM := TRUNC(dtmActiveDate) ;	--翌日０時からプラス
				dtCURDATE := TRUNC(dtmActiveDate) ;
			END IF ;

		ELSE	------------------------------------------Back

			--dtCURDATE := TRUNC(dtCURDTTM) - 1;

			dtAMStart := (dtCURDATE + nAMStartTime/24/60);
			dtAMEnd   := (dtCURDATE + nAMEndTime/24/60);
			dtPMStart := (dtCURDATE + nPMStartTime/24/60);
			dtPMEnd   := (dtCURDATE + nPMEndTime/24/60);

			-------------------------------------

			IF dtCURDATE < dtCURDTTM AND dtCURDTTM <= dtAMStart THEN
				dtCURDTTM := dtCURDATE ;		--→NEXT
				nCurDiff := nCurDiff - 0 ;

			ELSIF dtAMStart < dtCURDTTM AND dtCURDTTM <= dtAMEnd THEN
				--nWkDiff := (dtAMEnd - dtAMStart)*24*60 ;
				nWkDiff := (dtCURDTTM - dtAMStart)*24*60 ;
				IF nCurDiff < nWkDiff THEN
					--dtCURDTTM := dtAMEnd - nCurDiff/24/60  ;	--HIT
					dtCURDTTM := dtCURDTTM - nCurDiff/24/60  ;	--HIT
				ELSE
					dtCURDTTM := dtAMStart  ;		--→AMStart OR NEXT
				END IF ;
				nCurDiff := nCurDiff - nWkDiff ;

			ELSIF dtAMEnd < dtCURDTTM AND dtCURDTTM <= dtPMStart THEN
				dtCURDTTM := dtAMEnd ;		--→AMEnd
				nCurDiff := nCurDiff - 0 ;

			ELSIF dtPMStart < dtCURDTTM AND dtCURDTTM <= dtPMEnd THEN
				--nWkDiff := (dtPMEnd - dtPMStart)*24*60 ;
				nWkDiff := (dtCURDTTM - dtPMStart)*24*60 ;
				IF nCurDiff < nWkDiff THEN
					--dtCURDTTM := dtPMEnd - nCurDiff/24/60  ;	--HIT
					dtCURDTTM := dtCURDTTM - nCurDiff/24/60  ;	--HIT
				ELSE
					dtCURDTTM := dtPMStart ;		--→PMStart
				END IF ;
				nCurDiff := nCurDiff - nWkDiff ;

			ELSIF dtPMEnd < dtCURDTTM AND dtCURDTTM <= (dtCURDATE + 1) THEN
				dtCURDTTM := dtPMEnd ;		--→PMEnd
				nCurDiff := nCurDiff - 0 ;

			END IF ;

			IF nCurDiff = 0 AND pnumEndFlg = 0 THEN	-- 稼動時間---oooooox---のパターンに------
				EXIT ;
			END IF;
																---DEF:---xoooooo---
			-------------------------------------
			IF dtCURDTTM <= (dtCURDATE) THEN	--日時が前日になった場合
				--翌稼働日 を取得   ------FncWorkDayCalc-------（前日）
				blnRet := FNCWORKDAYCALC(
								pFileHandle,
								pvc2LogMode,
								pvc2OutputMode,
								pvc2UserId,
								pvc2BusinessName,
								pvc2PlantCd,
								pvc2ItemCd,
								TRUNC(dtCURDATE),
								-1,
								FALSE,	-- pblnStartForwardFlg,
								dtmActiveDate);
				IF blnRet = FALSE THEN
					RAISE excWORK_DAY_CALC_ERR;
				END IF;
		        -- TraceLog For DEBUG -----------------------
				blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
						pvc2UserId, pvc2BusinessName, pvc2PlantCd,
						MY_SQL_NAME,
						'DEBUG:DayShift:Calc－: '
							||TO_CHAR(dtCURDTTM,'YYYY/MM/DD HH24:MI:SS')|| ' → '
							||TO_CHAR(dtmActiveDate,'YYYY/MM/DD HH24:MI:SS')
						);
				dtCURDTTM := TRUNC(dtmActiveDate) + 1 ;	--翌日０時からマイナス
				dtCURDATE := TRUNC(dtmActiveDate) ;
			END IF ;


		END IF;

	END LOOP;

    pdtmShiftDate := dtCURDTTM ;

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
