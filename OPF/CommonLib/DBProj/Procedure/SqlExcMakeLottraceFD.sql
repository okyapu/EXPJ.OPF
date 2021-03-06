CREATE OR REPLACE PROCEDURE SQLEXCMAKELOTTRACEFD (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2006.12.22 初版
'
' 機能      : ロットトレース登録・更新処理
'             (Java呼び出し)
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pvc2LogMode                -- (i)ＬＯＧモード
'             pvc2OutputMode             -- (i)出力モード
'             pvc2OutputPath             -- (i)出力ファイルパス
'             pvc2OutputName             -- (i)出力ファイル名
'             pvc2UserId                 -- (i)ユーザＩＤ
'             pvc2BusinessName           -- (i)業務名
'             pvc2PlantCd                -- (i)工場コード
'             pvc2RcvIssueCtrlCd         -- (i)入出庫管理番号
'             pvc2ShipQty                -- (i)出荷済数量
'             pvc2MessegeCd              -- (o)エラーコード
'             pnumStatus                 -- (o)結果ステータス
'
' 機能説明  : ロットトレーステーブルを登録・更新し、ロットトレースが可能にする。
'
'
' 備考      :
'
------------------------------------------------------------------------------*/
              pvc2LogMode           IN  VARCHAR2      -- (i)ＬＯＧモード
              ,pvc2OutputMode       IN  VARCHAR2      -- (i)出力モード
              ,pvc2OutputPath       IN  VARCHAR2      -- (i)出力ファイルパス
              ,pvc2OutputName       IN  VARCHAR2      -- (i)出力ファイル名
              ,pvc2UserId           IN  VARCHAR2      -- (i)ユーザＩＤ
              ,pvc2BusinessName     IN  VARCHAR2      -- (i)業務名
              ,pvc2PlantCd          IN  VARCHAR2      -- (i)工場コード
              ,pvc2FromItemCd       IN  VARCHAR2      -- (i)元品目コード
              ,pvc2FromLotNo        IN  VARCHAR2      -- (i)元ロット番号
              ,pvc2ToItemCd         IN  VARCHAR2      -- (i)先品目コード
              ,pvc2ToLotNo          IN  VARCHAR2      -- (i)先ロット番号
              ,pvc2LotTraceTyp      IN  VARCHAR2      -- (i)ロットトレース区分
              ,pvc2ErrCd            OUT VARCHAR2      -- (o)エラーコード
              ,pnumStatus           OUT NUMBER        -- (o)結果ステータス
)
IS

/* 変数の宣言 */
    UTL_FileHandle           UTL_FILE.FILE_TYPE;                  --ファイルハンドル
    blnRet                   BOOLEAN;                             --BOOLEAN型 返却値


    numLoopCnt               NUMBER;                              --ループカウンタ

/* 定数の宣言 */
    MY_SQL_NAME                       VARCHAR2(120)  := 'SqlExcMakeLottraceFD';  --ＰＬ／ＳＱＬ名
    LOGMODE_NOLOG                     VARCHAR2(4)    := '0';                       --ＬＯＧモード　ＬＯＧ無し
    OUTPUTMODE_FILE                   VARCHAR2(4)    := '1';                       --出力モード　　ファイル
    LOGMSG_START                      VARCHAR2(20)   := 'Start';                   --ログ用メソッド開始宣言
    LOGMSG_END                        VARCHAR2(12)   := 'End';                     --ログ用メソッド終了宣言
    LOGMSG_ERR                        VARCHAR2(12)   := 'Err';                     --ログ用メソッドエラー宣言
    LOGMSG_GETERR                     VARCHAR2(32)   := 'GetNoErr';                --ログ用メソッド採番エラー宣言
    LOGMSG_MAKELOTTRACEFD_ERR         VARCHAR2(120)  := 'EXCMAKELOTTRACEFD';  --ロットトレース登録・更新処理エラー宣言

-- メッセージコード
    JF_COM_ERR_ORACLE_ERROR           VARCHAR(28)  := 'AC53401';   --ORACLEエラー
    JF_COM_ERR_WRONG_VALUE            VARCHAR(28)  := 'ZZ05105';   --値が不正です

    JF_COM_ERR_INVALID_PATH           VARCHAR(28)  := 'ZZ22005';   --ファイルの場所またはファイル名が無効です。
    JF_COM_ERR_INVALID_FILEHANDLE     VARCHAR(28)  := 'ZZ22006';   --ファイル・ハンドルが無効です。
    JF_COM_ERR_INVALID_OPERATION      VARCHAR(28)  := 'ZZ22007';   --要求どおりにファイルをオープンできないか、または操作できません。
    JF_COM_ERR_READ_ERROR             VARCHAR(28)  := 'ZZ22008';   --読込み操作中にオペレーティング・システムのエラーが発生しました。
    JF_COM_ERR_WRITE_ERROR            VARCHAR(28)  := 'ZZ22009';   --書込み操作中にオペレーティング・システムのエラーが発生しました。
    JF_COM_INTERNAL_ERROR             VARCHAR(28)  := 'ZZ22010';   --PL/SQL 内の未指定エラー。
    JF_COM_TRACE_LOG_ERROR            VARCHAR(28)  := 'ZZ22011';   --トレースログの出力でエラーが発生しました。

    STATUS_NORMAL          NUMBER        := 1;          -- 正常終了
    STATUS_WORNING         NUMBER        := 2;          -- 警告終了
    STATUS_ERROR           NUMBER        := 3;          -- 異常終了

    -- 例外の宣言
    excFncTraceLog             EXCEPTION;          --トレースログ出力エラー
    excFncExcMakeLotTraceFD   EXCEPTION;          --ロットトレース登録･更新エラー


BEGIN
/*-------------------------------------
  PLSQL初期化
-------------------------------------*/
    pnumStatus      := 3;          -- 異常終了

    /* LogFile の OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);


    blnRet := FNCEXCMAKELOTTRACEFD(
                UTL_FileHandle              --ファイルハンドル
               ,pvc2LogMode                 --ＬＯＧモード
               ,pvc2OutputMode              --出力モード
               ,pvc2UserId                  --ユーザＩＤ
               ,pvc2BusinessName            --業務名
               ,pvc2PlantCd                 --工場コード
               ,pvc2FromItemCd              --元品目コード
               ,pvc2FromLotNo               --元ロット番号
               ,pvc2ToItemCd                --先品目コード
               ,pvc2ToLotNo                 --先ロット番号
               ,TO_NUMBER(pvc2LotTraceTyp)  --ロットトレース区分
               ,pvc2ErrCd                   --エラーメッセージID
               ,pnumStatus                  --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
               );
    IF blnRet = FALSE THEN
        RAISE excFncExcMakeLotTraceFD;
    END IF;

/*--------------------------------------
  PLSQL正常終了
--------------------------------------*/

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile の CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION

    WHEN excFncExcMakeLotTraceFD THEN
        pnumStatus := STATUS_ERROR;
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_MAKELOTTRACEFD_ERR);
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncTraceLog THEN           --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_TRACE_LOG_ERROR;
        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN           --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_INVALID_PATH;
    WHEN UTL_FILE.INVALID_MODE THEN           --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_WRONG_VALUE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_INVALID_OPERATION;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_INTERNAL_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_INVALID_FILEHANDLE;
    WHEN OTHERS THEN
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_ORACLE_ERROR;
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

