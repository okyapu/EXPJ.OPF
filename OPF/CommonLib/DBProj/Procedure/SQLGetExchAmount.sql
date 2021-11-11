CREATE OR REPLACE PROCEDURE SQLGETEXCHAMOUNT (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2014.03.05 初版
' 
' 機能      : 邦貨換算
'           
'
'
' 引き数    : pvc2LogMode                      - (i)ＬＯＧモード
'             pvc2OutputMode                   - (i)出力モード
'             pvc2OutputPath                   - (i)出力ファイルパス
'             pvc2OutputName                   - (i)出力ファイル名
'             pvc2UserId                       - (i)ユーザＩＤ
'             pvc2BusinessName                 - (i)業務名
'             pvc2PlantCd                      - (i)工場コード
'             pvc2CurAmount                    - (i)変換前金額
'             pvc2CompanyCd                    - (i)会社コード
'             pvc2CurCd                        - (i)通貨コード
'             pvc2ExchTyp                      - (i)為替種別
'             pvc2RoundTyp                     - (i)金額まるめ区分(1:四捨五入,2:切り上げ,3:切り捨て)
'             pvc2ExchRateDate                 - (i)為替レート決定用日付
'             pvc2HomeCurAmount                - (o)変換後金額
'             pnumStatus                       - (o)結果ステータス
'
' 機能説明  : 外貨を円貨に変換する。

' 備考      : エラー発生時は結果ステータス(pnumStatus)に異常終了を設定して返す。
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2    --出力モード
   ,pvc2OutputPath              IN  VARCHAR2    --出力ファイルパス
   ,pvc2OutputName              IN  VARCHAR2    --出力ファイル名
   ,pvc2UserId                  IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2    --業務名
   ,pvc2PlantCd                 IN  VARCHAR2    --工場コード
   ,pvc2CurAmount               IN  NUMBER      --変換前金額
   ,pvc2CompanyCd               IN  VARCHAR2    --会社コード
   ,pvc2CurCd                   IN  VARCHAR2    --通貨コード
   ,pvc2ExchTyp                 IN  NUMBER      --為替種別
   ,pvc2RoundTyp                IN  NUMBER      --金額まるめ区分
   ,pvc2ExchRateDate            IN  DATE        --為替レート決定用日付
   ,pvc2HomeCurAmount           OUT NUMBER      --変換後金額
   ,pnumStatus                  OUT NUMBER      --結果ステータス（1：正常終了 3：異常終了）
)
IS
    
/* 変数の宣言 */
    UTL_FileHandle            UTL_FILE.FILE_TYPE; --ファイルハンドル
    blnRet                    BOOLEAN;            --BOOLEAN型 返却値
    numStatus                 NUMBER(1);          --結果ステータス
    
/* 定数の宣言 */
    MY_SQL_NAME            VARCHAR2(120)  := 'SQLGetExchAmount';      --ＰＬ／ＳＱＬ名
    LOGMODE_NOLOG          VARCHAR2(4)   := '0';                   --ＬＯＧモード　ＬＯＧ無し
    OUTPUTMODE_FILE        VARCHAR2(4)   := '1';                   --出力モード　　ファイル
    LOGMSG_START           VARCHAR2(20)   := 'Start';               --ログ用メソッド開始宣言
    LOGMSG_END             VARCHAR2(12)   := 'End';                 --ログ用メソッド終了宣言
    LOGMSG_ERR             VARCHAR2(12)   := 'Err';                 --ログ用メソッドエラー宣言
    
    STATUS_NORMAL                NUMBER        := 1;          -- 正常終了
    STATUS_WARNING               NUMBER        := 2;          -- 警告終了
    STATUS_ERROR                 NUMBER        := 3;          -- 異常終了

    -- 例外の宣言
    excFncTraceLog                 EXCEPTION;          --トレースログ出力エラー
    excExcMakeRerurn               EXCEPTION;          --生成エラー
    
BEGIN

    pnumStatus := STATUS_NORMAL;

    /* LogFile の OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                           MY_SQL_NAME, LOGMSG_START);
                          
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
    

    blnRet := FNCGETEXCHAMOUNT(
                UTL_FileHandle              --ファイルハンドル 
               ,pvc2LogMode                 --ＬＯＧモード
               ,pvc2OutputMode              --出力モード
               ,pvc2UserId                  --ユーザＩＤ
               ,pvc2BusinessName            --業務名
               ,pvc2PlantCd                 --工場コード
               ,pvc2CurAmount               --変換前金額
               ,pvc2CompanyCd               --会社コード
               ,pvc2CurCd                   --通貨コード
               ,pvc2ExchTyp                 --為替種別
               ,pvc2RoundTyp                --金額まるめ区分
               ,pvc2ExchRateDate            --為替レート決定用日付
               ,pvc2HomeCurAmount           --変換後金額
               ,numStatus                  --結果ステータス（1：正常終了 3：異常終了）
              );
    IF blnRet=FALSE THEN
        RAISE excExcMakeRerurn;
    END IF
    ;
    
    /* 結果ステータスのセット */
    pnumStatus := numStatus;
    
    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile の CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
    
    
--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excExcMakeRerurn THEN     
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncTraceLog THEN 
        pnumStatus := STATUS_ERROR;
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN
        pnumStatus := STATUS_ERROR;
    WHEN UTL_FILE.INVALID_MODE THEN        
        pnumStatus := STATUS_ERROR;
    WHEN UTL_FILE.INVALID_OPERATION THEN     
        pnumStatus := STATUS_ERROR;
    WHEN UTL_FILE.INTERNAL_ERROR THEN 
        pnumStatus := STATUS_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN 
        pnumStatus := STATUS_ERROR;
    WHEN OTHERS THEN 
        pnumStatus := STATUS_ERROR;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

END;
/