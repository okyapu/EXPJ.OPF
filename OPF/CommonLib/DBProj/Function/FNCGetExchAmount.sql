CREATE OR REPLACE FUNCTION FNCGETEXCHAMOUNT(
/*----------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2014.03.05 初版
' 2015.09.07 小数桁数取得用通貨コードを修正
' 
' 機能      :邦貨換算
'
' 戻り値    : Boolean 
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle                      - (i)ファイルハンドル
'             pvc2LogMode                      - (i)ＬＯＧモード
'             pvc2OutputMode                   - (i)出力モード
'             pvc2UserId                       - (i)ユーザＩＤ
'             pvc2BusinessName                 - (i)業務名
'             pvc2PlantCd                      - (i)工場コード
'             pvc2CurAmount                    - (i)変換前金額
'             pvc2CompanyCd                    - (i)会社コード
'             pvc2CurCd                        - (i)通貨コード
'             pvc2ExchTyp                      - (i)為替種別
'             pvc2RoundTyp                     - (i)金額まるめ区分
'             pvc2ExchRateDate                 - (i)為替レート決定用日付
'             pvc2HomeCurAmount                - (o)変換後金額
'             pnumStatus                       - (o)結果ステータス

'
' 機能説明  : 外貨を円貨に変換する。
'
' 備考      : エラー発生時は結果ステータス(pnumStatus)に異常終了を設定して返す。
'
------------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode                 IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2            --出力モード
   ,pvc2UserId                  IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2            --業務名
   ,pvc2PlantCd                 IN  VARCHAR2            --工場コード
   ,pvc2CurAmount               IN  NUMBER              --変換前金額
   ,pvc2CompanyCd               IN  VARCHAR2            --会社コード
   ,pvc2CurCd                   IN  VARCHAR2            --通貨コード
   ,pvc2ExchTyp                 IN  NUMBER              --為替種別
   ,pvc2RoundTyp                IN  NUMBER              --金額まるめ区分
   ,pvc2ExchRateDate            IN  DATE                --為替レート決定用日付
   ,pvc2HomeCurAmount           OUT NUMBER              --変換後金額
   ,pnumStatus                  OUT NUMBER              --結果ステータス（1：正常終了 3：異常終了）
    ) RETURN BOOLEAN
IS
/* カーソルの宣言*/
        --//邦貨を取得する
    CURSOR curSYS_HOME_CUR IS
    SELECT SYS_HOME_CUR.HOME_CUR_CD
    FROM SYS_HOME_CUR
    WHERE SYS_HOME_CUR.CTRL_CD = 'SYSTEM';
    recSYS_HOME_CUR  curSYS_HOME_CUR%ROWTYPE;
    
    --//為替レートを取得する
    CURSOR curM_EXCH_RATE(
                          ctypCompanyCd        M_EXCH_RATE.COMPANY_CD%TYPE
                         ,ctypCurCd            M_EXCH_RATE.CUR_CD%TYPE
                         ,ctypExchTyp          M_EXCH_RATE.EXCH_TYP%TYPE
                         ,ctypExchStartDate    M_EXCH_RATE.EXCH_START_DATE%TYPE
                         ) IS
    SELECT M_EXCH_RATE.EXCH_RATE
    FROM M_EXCH_RATE
    WHERE M_EXCH_RATE.COMPANY_CD = ctypCompanyCd
      AND M_EXCH_RATE.CUR_CD = ctypCurCd
      AND M_EXCH_RATE.EXCH_TYP = ctypExchTyp
      AND M_EXCH_RATE.EXCH_START_DATE <= ctypExchStartDate
    ORDER BY M_EXCH_RATE.EXCH_START_DATE DESC;--為替開始日付

      recM_EXCH_RATE  curM_EXCH_RATE%ROWTYPE;
    

    --//通貨の小数桁数を取得する
    CURSOR curM_CUR(
                    ctypCurCd                   M_CUR.CUR_CD%TYPE
                   ) IS
    SELECT M_CUR.DECIMAL_FIG
    FROM M_CUR
    WHERE M_CUR.CUR_CD = ctypCurCd;
      
      recM_CUR  curM_CUR%ROWTYPE;
      
/* 変数の宣言 */
    blnRet                               BOOLEAN;                                          --BOOLEAN型 返却値
    roundErrCd                           VARCHAR2(40);                                     --端数処理のエラーコード
    roundStatus                          NUMBER;                                           --端数処理の処理結果

/* 定数の宣言 */
    MY_SQL_NAME                          VARCHAR2(120)  := 'FNCGetExchAmount';            --ＰＬ／ＳＱＬ名
    LOGMSG_START                         VARCHAR2(20)   := 'Start';                       --ログ用メソッド開始宣言
    LOGMSG_END                           VARCHAR2(12)   := 'End';                         --ログ用メソッド終了宣言
    LOGMSG_ERR                           VARCHAR2(12)   := 'Err';                         --ログ用メソッドエラー宣言
    LOGMSG_CUROPENERR                    VARCHAR2(40)   := 'CurOpenErr';                  --ログ用カーソルOPENエラー宣言
    
    STATUS_NORMAL                        NUMBER         := 1;                             -- 正常終了
    STATUS_ERROR                         NUMBER         := 3;                             -- 異常終了
    
    
    /*/業務ログ用 MESSAGE ID */
    COM_NOTFOUND_EXCH_RATE               VARCHAR2(28)   := 'KM00034';                     --為替レートの取得に失敗しました。
    COM_ROUND_ERR                        VARCHAR2(28)   := 'KM00035';                     --端数処理に失敗しました。
 
    /*/業務ログ用 MESSAGE */
    SYSLOG_COM_NOTFOUND_EXCH_RATE        VARCHAR2(200)  := '(SBM1293)為替レートの取得に失敗しました。';   --為替レートの取得に失敗しました。
    SYSLOG_COM_ROUND_ERR                 VARCHAR2(200)  := '(SBM1294)端数処理に失敗しました。';   --端数処理に失敗しました。

    
    -- 例外の宣言
    excExchRateNoFoundErr                EXCEPTION;                                         --為替レートを取得できない
    excroundErr                          EXCEPTION;                                         --端数処理に失敗
    excCursorErr                         EXCEPTION;                                         --カーソルOPEN中のEXCEPTION
    excFncTraceLog                       EXCEPTION;                                          --トレースログ出力エラー
    --
    
BEGIN

    pnumStatus := STATUS_NORMAL;
    pvc2HomeCurAmount := 0;
    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                           MY_SQL_NAME, LOGMSG_START);
                          
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
    
    OPEN curSYS_HOME_CUR;
    FETCH curSYS_HOME_CUR INTO recSYS_HOME_CUR;
        IF recSYS_HOME_CUR.HOME_CUR_CD = pvc2CurCd THEN
            pvc2HomeCurAmount := pvc2CurAmount;
       ELSE
           /* 為替レートを取得する*/
           BEGIN
               OPEN curM_EXCH_RATE(pvc2CompanyCd,pvc2CurCd,pvc2ExchTyp,pvc2ExchRateDate);
                  FETCH curM_EXCH_RATE INTO recM_EXCH_RATE;
           EXCEPTION
               WHEN OTHERS THEN
               RAISE excCursorErr;
           END;
           IF curM_EXCH_RATE%NOTFOUND THEN
                RAISE excExchRateNoFoundErr;
           ELSE
               OPEN curM_CUR(recSYS_HOME_CUR.HOME_CUR_CD);
               FETCH curM_CUR INTO recM_CUR;
               pvc2HomeCurAmount := pvc2CurAmount * recM_EXCH_RATE.EXCH_RATE;
               blnRet := FNCGETROUND4FD(
                                             pFileHandle                 --ファイルハンドル 
                                            ,pvc2LogMode                 --ＬＯＧモード
                                            ,pvc2OutputMode              --出力モード
                                            ,pvc2UserId                  --ユーザＩＤ
                                            ,pvc2BusinessName            --業務名
                                            ,pvc2PlantCd                 --工場コード
                                            ,pvc2HomeCurAmount           --端数処理前の値
                                            ,recM_CUR.DECIMAL_FIG        --小数桁数
                                            ,pvc2RoundTyp                --端数処理区分
                                            ,pvc2HomeCurAmount           --端数処理後の値
                                            ,roundErrCd                  --エラーコード
                                            ,roundStatus                 --結果ステータス（1：正常終了 3：異常終了）
                                           );
               IF blnRet=FALSE OR roundStatus = 3 THEN
                   RAISE excroundErr;
               END IF;
               CLOSE curM_CUR;
           END IF;
           CLOSE curM_EXCH_RATE;
       END IF;
    CLOSE curSYS_HOME_CUR;
    
    
    
    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
    
    
    RETURN TRUE;    -- 正常終了
    
--< 例外処理 >---------------------------------------------------------------
EXCEPTION
       
    WHEN excExchRateNoFoundErr THEN
        IF curM_EXCH_RATE%ISOPEN = TRUE THEN
            CLOSE curM_EXCH_RATE;
        END IF;
        IF curSYS_HOME_CUR%ISOPEN = TRUE THEN
            CLOSE curSYS_HOME_CUR;
        END IF;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_NOTFOUND_EXCH_RATE, SYSLOG_COM_NOTFOUND_EXCH_RATE);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN excroundErr THEN
        IF curM_CUR%ISOPEN = TRUE THEN
            CLOSE curM_CUR;
        END IF;
        IF curM_EXCH_RATE%ISOPEN = TRUE THEN
            CLOSE curM_EXCH_RATE;
        END IF;
        IF curSYS_HOME_CUR%ISOPEN = TRUE THEN
            CLOSE curSYS_HOME_CUR;
        END IF;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_ROUND_ERR, SYSLOG_COM_ROUND_ERR);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;        

    WHEN excFncTraceLog THEN           
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN excCursorErr THEN
        /* カーソルＣＬＯＳＥ*/
        IF curM_EXCH_RATE%ISOPEN = TRUE THEN
            CLOSE curM_EXCH_RATE;
        END IF;
        IF curSYS_HOME_CUR%ISOPEN = TRUE THEN
            CLOSE curSYS_HOME_CUR;
        END IF;
                
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_PATH THEN           
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_MODE THEN           
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        RETURN FALSE;
    WHEN OTHERS THEN
        /* カーソルＣＬＯＳＥ*/
        IF curM_CUR%ISOPEN = TRUE THEN
            CLOSE curM_CUR;
        END IF;
        IF curM_EXCH_RATE%ISOPEN = TRUE THEN
            CLOSE curM_EXCH_RATE;
        END IF;
        IF curSYS_HOME_CUR%ISOPEN = TRUE THEN
            CLOSE curSYS_HOME_CUR;
        END IF;
        pnumStatus := STATUS_ERROR;
        pvc2HomeCurAmount := 0;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        RETURN FALSE;
END;
/