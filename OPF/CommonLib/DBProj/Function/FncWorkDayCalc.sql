CREATE OR REPLACE FUNCTION        FNCWORKDAYCALC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2003.08.06 初版
' 2003.12.15 オープンしたカーソルを必ずクローズするように修正。
' 2005.10.21 unicode対応（varchar2を4倍）
' 2007.02.22 時刻対応
' 2010.07.07 統合受注性能改善に伴い、差分日付後の日付算出ロジックの修正
' 2011.01.24 日付算出ロジックがROWNUMだと不正日付となる可能性があり、ROW_NUMBERに修正
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
'             pvc2PlantCd          --(i)工場コード
'             pvc2ItemCd           - (i)品目番号
'             pdtmDate             - (i)対象日付
'             pnumDifference       - (i)差分
'             pblnStartForwardFlg  - (i)基準日の前倒しフラグ
'             pdtmActiveDate       - (o)算出稼働日
'
' 機能説明  : 指定品目のカレンダ、無ければ工場のカレンダを使って対象日付から稼働日ベースで
'             差分日付後の日付を算出する。
'             差分をマイナス指定した場合は指定差分日前を求める。
'             対象日付が休日の場合、基準日前倒しフラグがTRUEであれば
'             その日以降の初めの稼働日を基準日とする。
'             FALSEの場合はその日以前の初めの稼働日を基準日とする。
'
' 備考      : 対象日付に時間が含まれていても考慮しない。(時間部分切捨て)
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
   ,pnumDifference      IN  NUMBER              --差分
   ,pblnStartForwardFlg IN  BOOLEAN             --基準日の前倒しフラグ
   ,pdtmActiveDate      OUT DATE                --算出稼働日
    ) RETURN BOOLEAN
IS

------------------
-- カーソル宣言 --
------------------
    --【カレンダ明細】
CURSOR curM_CAL(
    c_CAL_NO    NUMBER,
    c_CAL_DATE  DATE
    ) IS
    SELECT  HOLIDAY_FLG
    FROM    M_CAL
    WHERE   CAL_NO   = c_CAL_NO
    AND     CAL_DATE = TO_CHAR(c_CAL_DATE,'YYYY/MM/DD');

CURSOR curM_CAL_F1(
    c_CAL_NO    NUMBER,
    c_CAL_DATE  DATE
    ) IS
    SELECT  TO_DATE(MIN(CAL_DATE),'YYYY/MM/DD') AS CAL_DATE
    FROM    M_CAL
    WHERE   CAL_NO      = c_CAL_NO
    AND     HOLIDAY_FLG = 0
    AND     CAL_DATE    > TO_CHAR(c_CAL_DATE,'YYYY/MM/DD');

CURSOR curM_CAL_B1(
    c_CAL_NO    NUMBER,
    c_CAL_DATE  DATE
    ) IS
    SELECT  TO_DATE(MAX(CAL_DATE),'YYYY/MM/DD') AS CAL_DATE
    FROM    M_CAL
    WHERE   CAL_NO      = c_CAL_NO
    AND     HOLIDAY_FLG = 0
    AND     CAL_DATE    < TO_CHAR(c_CAL_DATE,'YYYY/MM/DD');

--差分 >= 0
CURSOR curM_CAL_F2(
    c_CAL_NO      NUMBER,
    c_CAL_DATE   VARCHAR2,
    c_Difference   NUMBER
    ) IS
	SELECT CAL_DATE
	FROM(
	    SELECT  ROW_NUMBER() OVER(ORDER BY CAL_DATE ASC) AS ODRNUM,
	            CAL_DATE
	    FROM    M_CAL
	    WHERE   CAL_NO      = c_CAL_NO
	    AND     HOLIDAY_FLG = 0
	    AND     CAL_DATE    > c_CAL_DATE
		)
	WHERE ODRNUM = c_Difference;

--差分 < 0
CURSOR curM_CAL_B2(
    c_CAL_NO    NUMBER,
    c_CAL_DATE  VARCHAR2,
    c_Difference  NUMBER
    ) IS
	SELECT CAL_DATE
	FROM
	   (SELECT  ROW_NUMBER() OVER(ORDER BY CAL_DATE DESC) AS ODRNUM,
                CAL_DATE
	    FROM
	    (SELECT  CAL_DATE
	     FROM    M_CAL
	     WHERE   CAL_NO      = c_CAL_NO
	     AND     HOLIDAY_FLG = 0
	     AND     CAL_DATE    < c_CAL_DATE
	    )
	   )
	WHERE ODRNUM = c_Difference;
-----------------
-- CONST値宣言 --
-----------------
    MY_SQL_NAME             VARCHAR2(56)    := 'FncWorkDayCalc';    --ＰＬ／ＳＱＬ名
    HOLIDAY_FLG_ACT         NUMBER(1)       := 0;                   --カレンダ明細-休日フラグ(0:稼働日)
    HOLIDAY_FLG_NOTACT      NUMBER(1)       := 1;                   --カレンダ明細-休日フラグ(1:非稼働日)
    LOGMSG_START            VARCHAR2(20)     := 'Start';             --ログ用メソッド開始宣言
    LOGMSG_END              VARCHAR2(12)     := 'End';               --ログ用メソッド終了宣言

-----------------
-- MESSAGE宣言 --
-----------------
    APS_COM_NOTEXIST_M_CAL  VARCHAR2(28)   := 'ZZ06002';       -- カレンダ明細データが存在しません

-------------
-- LOG宣言 --
-------------

--------------
-- WORK変数 --
--------------
    blnRet              BOOLEAN;        -- Function返却値
    numCalNo            NUMBER :=-1;        -- カレンダ番号(工場）
    numCalNo1           NUMBER :=-1;        -- カレンダ番号(品目）
    numHolidayFlg       NUMBER(1);      -- 休日フラグ
    numCnt              NUMBER(4);      -- 件数
    dtmStartCalDate     DATE;           -- wk基準日
    dtmActiveDate       DATE;           -- wk稼働日
    dtmTruncDate        DATE;           -- wk対象日付

    excNotExist_M_CAL   EXCEPTION;  --【カレンダマスタ】未存在エラー

BEGIN

    /*指定品目のカレンダを取得 */
    IF pvc2ItemCd IS NOT NULL THEN
        SELECT NVL(CAL_NO, -1) INTO numCalNo1 FROM M_ITEM
        WHERE ITEM_CD = pvc2ItemCd;
    END IF;
    IF numCalNo1 != -1 THEN
        numCalNo := numCalNo1;
    ELSE
        SELECT CAL_NO INTO numCalNo FROM M_PLANT
        WHERE PLANT_CD = pvc2PlantCd;
    END IF;

    /* 日付部分を無視した対象日付を取得 */
    dtmTruncDate := TRUNC(pdtmDate);

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    OPEN curM_CAL(numCalNo,dtmTruncDate);
    FETCH curM_CAL INTO numHolidayFlg;
    IF curM_CAL%NOTFOUND THEN
        CLOSE curM_CAL;
        RAISE excNotExist_M_CAL;                -- 該当日付データなしエラー
    END IF;
    CLOSE curM_CAL;

    IF numHolidayFlg = HOLIDAY_FLG_ACT THEN    -- 基準日が稼働日の場合
        dtmStartCalDate := dtmTruncDate;
    ELSE                                        -- 基準日が非稼働日（休日）の場合
        IF pblnStartForwardFlg = TRUE THEN      -- フォワードの場合
            OPEN curM_CAL_F1(numCalNo,dtmTruncDate);
            FETCH curM_CAL_F1 INTO dtmStartCalDate;
            IF curM_CAL_F1%NOTFOUND THEN
                CLOSE curM_CAL_F1;
                RAISE excNotExist_M_CAL;                -- 該当日付データなしエラー
            END IF;
            CLOSE curM_CAL_F1;
        ELSE                                    -- バックの場合
            OPEN curM_CAL_B1(numCalNo,dtmTruncDate);
            FETCH curM_CAL_B1 INTO dtmStartCalDate;
            IF curM_CAL_B1%NOTFOUND THEN
                CLOSE curM_CAL_B1;
                RAISE excNotExist_M_CAL;                -- 該当日付データなしエラー
            END IF;
            CLOSE curM_CAL_B1;
        END IF;
    END IF;

    IF pnumDifference > 0 THEN      -- 差分がプラス(正の値)の場合
        OPEN curM_CAL_F2(numCalNo,TO_CHAR(dtmStartCalDate,'YYYY/MM/DD'),pnumDifference);
        FETCH curM_CAL_F2 INTO dtmActiveDate;
        IF curM_CAL_F2%NOTFOUND THEN
            CLOSE curM_CAL_F2;
            RAISE excNotExist_M_CAL;                -- 該当日付データなしエラー
        END IF;
        CLOSE curM_CAL_F2;
    ELSIF pnumDifference < 0 THEN   -- 差分がマイナス(負の値)の場合
        OPEN curM_CAL_B2(numCalNo,TO_CHAR(dtmStartCalDate,'YYYY/MM/DD'),ABS(pnumDifference));
        FETCH curM_CAL_B2 INTO dtmActiveDate;
        IF curM_CAL_B2%NOTFOUND THEN
            CLOSE curM_CAL_B2;
            RAISE excNotExist_M_CAL;                -- 該当日付データなしエラー
        END IF;
        CLOSE curM_CAL_B2;
    ELSE                            -- 差分がゼロの場合
        dtmActiveDate := dtmStartCalDate;
    END IF;

    pdtmActiveDate := TO_DATE(TO_CHAR(dtmActiveDate,'YYYYMMDD') || TO_CHAR(pdtmDate,'HH24MISS'),'YYYYMMDDHH24MISS');

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- 正常終了

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excNotExist_M_CAL      THEN    --【カレンダマスタ】未存在エラー
        /* メッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_M_CAL, '(SBM0065)カレンダマスタ未設定');
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
