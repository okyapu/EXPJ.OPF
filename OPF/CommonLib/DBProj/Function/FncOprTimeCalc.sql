CREATE OR REPLACE FUNCTION FNCOPRTIMECALC(
/*----------------------------------------------------------------------------
'
' SQL_NAME ： FncOprTimeCalc
' Version  ： 1.00.00
'
' 修正履歴
'   2014.04.01 初版
' 
' 機能      : 作業時間計算処理
' 
' 戻り値    : Boolean
'               True :正常終了
'               False:エラーあり
'
' 引き数    : pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2WorkShiftCode    - (i)勤務シフトコード
'             pvc2StartTime        - (i)開始時間
'             pvc2EndTime          - (i)終了時間
'             pnumOprTime          - (o)作業時間（分）
'             pvc2Message          - (o)メッセージ
'             pnumStatus           - (o)結果ステータス
'
' 機能説明  : 作業時間の計算を行う。
'             勤務シフト単位に休憩時間を考慮し作業時間を算出する。
'
' 備考      : 
'
------------------------------------------------------------------------------*/
    pFileHandle            IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode            IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode         IN  VARCHAR2            --出力モード
   ,pvc2UserId             IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName       IN  VARCHAR2            --業務名
   ,pvc2PlantCd            IN  VARCHAR2            --工場コード
   ,pvc2WorkShiftCode      IN  VARCHAR2            --勤務シフトコード
   ,pvc2StartTime          IN  VARCHAR2            --開始時間
   ,pvc2EndTime            IN  VARCHAR2            --終了時間
   ,pnumOprTime            OUT NUMBER              --作業時間
   ,pvc2Message            OUT VARCHAR2            --メッセージ
   ,pnumStatus             OUT NUMBER              --結果ステータス（1：正常終了 9：エラーあり）
    ) RETURN BOOLEAN
IS

/* 定数定義 */
    LOGMSG_START                 VARCHAR2(20)           := 'Start';                           --ログ用メソッド開始宣言
    LOGMSG_END                   VARCHAR2(12)           := 'End';                             --ログ用メソッド終了宣言
    MY_SQL_NAME                  CONSTANT VARCHAR2(60)  := 'FNCOPRTIMECALC';                 -- ＰＬ／ＳＱＬ名
    
    STATUS_NORMAL                NUMBER                 := 1;                                 -- 正常終了
    STATUS_ERROR                 NUMBER                 := 9;                                 -- エラーあり
    LOGID_AD61015               CONSTANT VARCHAR2(28)   := 'AD61015';                         -- 勤務シフトを入力して下さい。
    LOGID_AD61019               CONSTANT VARCHAR2(28)   := 'AD61019';                         -- 開始時刻が不正です。
    LOGID_AD61020               CONSTANT VARCHAR2(28)   := 'AD61020';                         -- 終了時間が不正です。
    LOGID_AD61021               CONSTANT VARCHAR2(28)   := 'AD61021';                         -- 作業時間がマイナスになりました。勤務シフト明細の休憩時間が不正です。
    LOGID_AD61003               CONSTANT VARCHAR2(28)   := 'AD61003';                         -- 勤務シフトが勤務シフトヘッダに存在しません。
    
    LOGMSG_AD61015               CONSTANT VARCHAR2(176) := '勤務シフトを入力して下さい。';
    LOGMSG_AD61019               CONSTANT VARCHAR2(80)  := '開始時刻が不正です。';
    LOGMSG_AD61020               CONSTANT VARCHAR2(80)  := '終了時間が不正です。';
    LOGMSG_AD61021               CONSTANT VARCHAR2(264) := '作業時間がマイナスになりました。勤務シフト明細の休憩時間が不正です。';
    LOGMSG_AD61003               CONSTANT VARCHAR2(176) := '勤務シフトが勤務シフトヘッダに存在しません。';

/* 変数宣言 */
    blnRet                       BOOLEAN;                                                     -- BOOLEAN型 返却値
    numRestTimeTotal             NUMBER                 := 0;                                 -- 休憩時間集計値
    vc2Message                   VARCHAR2(1000);

    numCalStaTime                NUMBER;                                                      -- 計算用開始時間
    numCalEndTime                NUMBER;                                                      -- 計算用終了時間
    numMstStaTime                NUMBER;                                                      -- マスタ開始時間
    numMstEndTime                NUMBER;                                                      -- マスタ終了時間
    numMstStaTime2               NUMBER;                                                      -- マスタ開始時間（翌日用）
    numMstEndTime2               NUMBER;                                                      -- マスタ終了時間（翌日用）
    numHH                        NUMBER;
    numMM                        NUMBER;

/* 例外の宣言 */
    excParamErr                  EXCEPTION;                                                   -- 「引数」エラー
    excFncTraceLog               EXCEPTION;                                                   -- トレースログ出力エラー
    excResultErr                 EXCEPTION;                                                   -- 結果エラー
    excNotFound                  EXCEPTION;                                                   -- NOT FOUND

/* カーソルの宣言 */
    CURSOR curM_WORK_SHIFT
    IS
    SELECT UWS.REST_TIME
         , UWS.START_TIME
         , UWS.END_TIME
      FROM M_WORK_SHIFT UWS
         , M_WORK_SHIFT_H UWSH
     WHERE UWS.WORK_SHIFT_CODE = UWSH.WORK_SHIFT_CODE
       AND UWSH.WORK_SHIFT_CODE = pvc2WorkShiftCode;

    CURSOR curM_WORK_SHIFT_H
    IS
    SELECT START_TIME
          ,END_TIME
      FROM M_WORK_SHIFT_H
     WHERE WORK_SHIFT_CODE = pvc2WorkShiftCode;
    recM_WORK_SHIFT_H   curM_WORK_SHIFT_H%ROWTYPE;



/*-----------------------------------------------------------------------------
' サブファンクション（SubFncTimeCal）
'
' 機能      : 時間計算
' 
' 戻り値    : NUMBER               - 分単位の計算結果
'
' 引き数    : pnumStaTime          - 開始時間
'             pnumEndTime          - 終了時間
'
' 機能説明  : 開始時間～終了時間の時間計算を行う。（HHMM形式）
'
-----------------------------------------------------------------------------*/
    FUNCTION SubFncTimeCal(pnumStaTime IN NUMBER
                          ,pnumEndTime IN NUMBER
                          )
    RETURN NUMBER
    IS
      numHH                    NUMBER;
      numMM                    NUMBER;
      numStaMin                NUMBER;
      numEndMin                NUMBER;
      numDiffMin               NUMBER;
    BEGIN

      --分単位換算
      numHH := TRUNC(pnumStaTime / 100);      -- 時間抜き出し
      numMM := pnumStaTime - (numHH * 100);   --   分抜き出し
      numStaMin := (numHH * 60) + numMM;

      numHH := TRUNC(pnumEndTime / 100);      -- 時間抜き出し
      numMM := pnumEndTime - (numHH * 100);   --   分抜き出し
      numEndMin := (numHH * 60) + numMM;

      -- 分単位での差を求める
      numDiffMin := numEndMin - numStaMin;

      RETURN numDiffMin;
    END;
BEGIN

    /* 結果ステータスの初期化 */
    pnumStatus := STATUS_NORMAL;

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

   /* 勤務シフトコード */
   IF pvc2WorkShiftCode IS NULL THEN
      pvc2Message := LOGID_AD61015;
      vc2Message := LOGMSG_AD61015;
      RAISE excParamErr;
   END IF;
   
   -- ADD
   OPEN curM_WORK_SHIFT_H;
   FETCH curM_WORK_SHIFT_H INTO recM_WORK_SHIFT_H;
   IF curM_WORK_SHIFT_H%NOTFOUND THEN
      CLOSE curM_WORK_SHIFT_H;
      pvc2Message := LOGID_AD61003;
      vc2Message := LOGMSG_AD61003;
      RAISE excParamErr;
   END IF;
   CLOSE curM_WORK_SHIFT_H;
   -- ADD
   
   /* 開始時間 */
   IF pvc2StartTime IS NULL THEN
      pvc2Message := LOGID_AD61019;
      vc2Message := LOGMSG_AD61019;
      RAISE excParamErr;
   ELSE
      IF LENGTH(pvc2StartTime) = 3 OR LENGTH(pvc2StartTime) = 4  THEN
         IF TO_NUMBER(SUBSTR(LPAD(pvc2StartTime, 4, 0), 1, 2)) > 23 OR TO_NUMBER(SUBSTR(LPAD(pvc2StartTime, 4, 0), 3, 2)) > 59 THEN
            pvc2Message := LOGID_AD61019;
            vc2Message := LOGMSG_AD61019;
            RAISE excParamErr;
         END IF;
      ELSE
         pvc2Message := LOGID_AD61019;
         vc2Message := LOGMSG_AD61019;
         RAISE excParamErr;
      END IF;
   END IF;

   /* 終了時間 */
   IF pvc2EndTime IS NULL THEN
      pvc2Message := LOGID_AD61020;
      vc2Message := LOGMSG_AD61020;
      RAISE excParamErr;
   ELSE
      IF LENGTH(pvc2EndTime) = 3 OR LENGTH(pvc2EndTime) = 4  THEN
         IF TO_NUMBER(SUBSTR(LPAD(pvc2EndTime, 4, 0), 1, 2)) > 23 OR TO_NUMBER(SUBSTR(LPAD(pvc2EndTime, 4, 0), 3, 2)) > 59 THEN
              pvc2Message := LOGID_AD61020;
              vc2Message := LOGMSG_AD61020;
              RAISE excParamErr;
          END IF;
      ELSE
          pvc2Message := LOGID_AD61020;
          vc2Message := LOGMSG_AD61020;
          RAISE excParamErr;
      END IF;
   END IF;

   -- 計算用変数の準備（引数）
   IF TO_NUMBER(pvc2StartTime) >  TO_NUMBER(pvc2EndTime) THEN
    numCalStaTime  := TO_NUMBER(pvc2StartTime);
    numCalEndTime  := TO_NUMBER(pvc2EndTime) + 2400;
   ELSE 
    numCalStaTime  := TO_NUMBER(pvc2StartTime);
    numCalEndTime  := TO_NUMBER(pvc2EndTime);
   END IF;

   numRestTimeTotal := 0;
   FOR recM_WORK_SHIFT IN curM_WORK_SHIFT LOOP
     -- 計算用変数の準備（勤務シフト明細）
     IF TO_NUMBER(recM_WORK_SHIFT.START_TIME) >  TO_NUMBER(recM_WORK_SHIFT.END_TIME) THEN
      numMstStaTime  := TO_NUMBER(recM_WORK_SHIFT.START_TIME);
      numMstEndTime  := TO_NUMBER(recM_WORK_SHIFT.END_TIME) + 2400;
     ELSE 
      numMstStaTime  := TO_NUMBER(recM_WORK_SHIFT.START_TIME);
      numMstEndTime  := TO_NUMBER(recM_WORK_SHIFT.END_TIME);
     END IF;

     -- 休憩時間の取得
     --(1)休憩時間に全てかかっている場合の休憩時間計算
     IF numCalStaTime <= numMstStaTime AND numCalEndTime >= numMstEndTime THEN
       numRestTimeTotal := numRestTimeTotal + recM_WORK_SHIFT.REST_TIME;  --マスタに登録されている計上時間

     --(2)休憩時間に一部かかっている場合の休憩時間計算（開始時間）
     ELSIF numCalStaTime >= numMstStaTime AND numCalStaTime <= numMstEndTime THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numCalStaTime,numMstEndTime);

     --(3)休憩時間に一部かかっている場合の休憩時間計算（終了時間）
     ELSIF numCalEndTime >= numMstStaTime AND numCalEndTime <= numMstEndTime THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numMstStaTime,numCalEndTime);

     --(4)休憩時間に開始・終了が含まれている場合の休憩時間計算
     ELSIF numCalStaTime > numMstStaTime AND numCalEndTime < numMstEndTime THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numCalStaTime,numCalEndTime);
     END IF;
     
      numMstStaTime2  := numMstStaTime + 2400;
      numMstEndTime2  := numMstEndTime + 2400;
     
     -- 休憩時間の取得（翌日用）
     --(1)休憩時間に全てかかっている場合の休憩時間計算
     IF numCalStaTime <= numMstStaTime2 AND numCalEndTime >= numMstEndTime2 THEN
       numRestTimeTotal := numRestTimeTotal + recM_WORK_SHIFT.REST_TIME;  --マスタに登録されている計上時間

     --(2)休憩時間に一部かかっている場合の休憩時間計算（開始時間）
     ELSIF numCalStaTime >= numMstStaTime2 AND numCalStaTime <= numMstEndTime2 THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numCalStaTime,numMstEndTime2);

     --(3)休憩時間に一部かかっている場合の休憩時間計算（終了時間）
     ELSIF numCalEndTime >= numMstStaTime2 AND numCalEndTime <= numMstEndTime2 THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numMstStaTime2,numCalEndTime);

     --(4)休憩時間に開始・終了が含まれている場合の休憩時間計算
     ELSIF numCalStaTime > numMstStaTime2 AND numCalEndTime < numMstEndTime2 THEN
       numRestTimeTotal := numRestTimeTotal + SubFncTimeCal(numCalStaTime,numCalEndTime);
     END IF;

   END LOOP;

   -- 作業時間
   pnumOprTime := SubFncTimeCal(numCalStaTime,numCalEndTime) - numRestTimeTotal;
   

   IF pnumOprTime < 0 THEN
      pvc2Message := LOGID_AD61021;
      vc2Message := LOGMSG_AD61021;
      RAISE excResultErr;
   END IF;
   
    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);
    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excFncTraceLog   THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN excNotFound THEN
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, vc2Message);
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN excParamErr THEN
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, vc2Message);
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN excResultErr THEN
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, vc2Message);
        pnumStatus := STATUS_ERROR;
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
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
END;
/
