CREATE OR REPLACE PROCEDURE SQLGETNEWOUTRSLTCD (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.08.06 初版
' 2005.10.24 unicode対応（varchar2を4倍）
'
' 機能      : 出来高実績番号採番呼び出し
'             (Java呼び出しIF)
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2NewCd            - (o)採番結果
'             pnumStatus           - (o)結果ステータス
'
' 機能説明  : 出来高実績番号採番を呼び出す。
'
' 備考      : エラー発生時は結果ステータス(pvc2Status)にエラー内容を設定して
'             採番結果(pvc2NewCd)にNULLを返す。
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode         IN  VARCHAR2    --出力モード
   ,pvc2OutputPath         IN  VARCHAR2    --出力ファイルパス
   ,pvc2OutputName         IN  VARCHAR2    --出力ファイル名
   ,pvc2UserId             IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName       IN  VARCHAR2    --業務名
   ,pvc2PlantCd            IN  VARCHAR2    --工場コード
   ,pvc2NewCd              OUT VARCHAR2    --採番結果
   ,pnumStatus             OUT NUMBER      --結果ステータス
)
IS
/* 変数の宣言 */
    UTL_FileHandle         UTL_FILE.FILE_TYPE; --ファイルハンドル
    blnRet                 BOOLEAN;            --BOOLEAN型 返却値
    vc2ResultData          VARCHAR2(100);

/* 定数の宣言 */
    MY_SQL_NAME            VARCHAR2(120)  := 'SqlGetNewOutRsltCd';  --ＰＬ／ＳＱＬ名
    LOGMODE_NOLOG          VARCHAR2(4)   := '0';                   --ＬＯＧモード　ＬＯＧ無し
    OUTPUTMODE_FILE        VARCHAR2(4)   := '1';                   --出力モード　　ファイル
    LOGMSG_START           VARCHAR2(20)   := 'Start';               --ログ用メソッド開始宣言
    LOGMSG_END             VARCHAR2(12)   := 'End';                 --ログ用メソッド終了宣言
    LOGMSG_ERR             VARCHAR2(12)   := 'Err';                 --ログ用メソッドエラー宣言
    LOGMSG_GETERR          VARCHAR2(32)   := 'GetNoErr';            --ログ用メソッド採番エラー宣言

    STATUS_NORMAL                NUMBER        := 0;          -- 正常終了
    STATUS_INVALID_PATH          NUMBER        := 1;          -- ファイルの場所またはファイル名が無効です。
    STATUS_INVALID_MODE          NUMBER        := 2;          -- FOPEN のopen_mode パラメータが無効です。
    STATUS_INVALID_FILEHANDLE    NUMBER        := 3;          -- ファイル・ハンドルが無効です。
    STATUS_INVALID_OPERATION     NUMBER        := 4;          -- 要求どおりにファイルをオープンできないか、または操作できません。
    STATUS_READ_ERROR            NUMBER        := 5;          -- 読込み操作中にオペレーティング・システムのエラーが発生しました。
    STATUS_WRITE_ERROR           NUMBER        := 6;          -- 書込み操作中にオペレーティング・システムのエラーが発生しました。
    STATUS_INTERNAL_ERROR        NUMBER        := 7;          -- PL/SQL 内の未指定エラー。
    STATUS_TRACE_LOG_ERROR       NUMBER        := 8;          -- FNCTRACELOGエラー
    STATUS_GET_NO_ERROR          NUMBER        := 9;          -- 採番エラー
    STATUS_OTHERS_ERROR          NUMBER        := 10;         -- その他のエラー

    -- 例外の宣言
    excFncTraceLog               EXCEPTION;          --トレースログ出力エラー
    excFncGetNewNo               EXCEPTION;          --採番エラー

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

    /* 出来高実績番号採番 */
    blnRet := FNCGETNEWOUTRSLTCD(
                UTL_FileHandle   --ファイルハンドル (NULL)
               ,pvc2LogMode      --ＬＯＧモード　ＬＯＧ無し
               ,pvc2OutputMode   --出力モード　　ファイル
               ,pvc2UserId       --ユーザＩＤ
               ,pvc2BusinessName --業務名
               ,pvc2PlantCd      --工場コード
               ,vc2ResultData    --検索結果
              );

    IF blnRet=FALSE THEN
        RAISE excFncGetNewNo;
    END IF
    ;

    pvc2NewCd := vc2ResultData;

--    DBMS_OUTPUT.PUT_LINE('採番結果：' || vc2ResultData);

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile の CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excFncTraceLog THEN           --
        pvc2NewCd := NULL;
        pnumStatus := STATUS_TRACE_LOG_ERROR;
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncGetNewNo THEN           --
        pvc2NewCd := NULL;
        pnumStatus := STATUS_GET_NO_ERROR;
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_GETERR);
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN           --
        pvc2NewCd := NULL;
        pnumStatus := STATUS_INVALID_PATH;
    WHEN UTL_FILE.INVALID_MODE THEN           --
        pvc2NewCd := NULL;
        pnumStatus := STATUS_INVALID_MODE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      --
        pvc2NewCd := NULL;
        pnumStatus := STATUS_INVALID_OPERATION;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         --
        pvc2NewCd := NULL;
        pnumStatus := STATUS_INTERNAL_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     --
        pvc2NewCd := NULL;
        pnumStatus := STATUS_INVALID_FILEHANDLE;
    WHEN OTHERS THEN
        pvc2NewCd := NULL;
        pnumStatus := STATUS_OTHERS_ERROR;
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

        pnumStatus := STATUS_OTHERS_ERROR;

END;
/
