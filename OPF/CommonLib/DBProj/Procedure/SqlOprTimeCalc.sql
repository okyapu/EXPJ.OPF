CREATE OR REPLACE PROCEDURE SQLOPRTIMECALC(
/*----------------------------------------------------------------------------
'
' SQL_NAME ： SqlOprTimeCalc
' Version  ： 1.00.00
'
' 修正履歴
'   2014.04.01 初版
' 
' 機能      : 作業時間計算処理
' 
' 戻り値    : なし
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)SYSログ出力モード
'             pvc2OutputPath       - (i)SYSログ出力ファイルパス
'             pvc2OutputName       - (i)SYSログ出力ファイル名
'             pvc2UserId           - (i)ユーザコード
'             pvc2BusinessName     - (i)業務ＩＤ
'             pvc2PlantCd          - (i)工場コード
'             pvc2WorkShiftCode    - (i)勤務シフトコード
'             pvc2StartTime        - (i)開始時間
'             pvc2EndTime          - (i)終了時間
'             pnumOprTime          - (o)作業時間
'             pvc2Message          - (o)メッセージ
'             pnumStatus           - (o)結果ステータス
'
' 機能説明  : 作業時間の計算を行う。
'             勤務シフト単位に休憩時間を考慮し作業時間を算出する。
'
' 備考      : 
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --ＬＯＧモード
   ,pvc2OutputMode         IN  VARCHAR2    --出力モード
   ,pvc2OutputPath         IN  VARCHAR2    --出力ファイルパス
   ,pvc2OutputName         IN  VARCHAR2    --出力ファイル名
   ,pvc2UserId             IN  VARCHAR2    --ユーザＩＤ
   ,pvc2BusinessName       IN  VARCHAR2    --業務名
   ,pvc2PlantCd            IN  VARCHAR2    --工場コード
   ,pvc2WorkShiftCode      IN  VARCHAR2    --勤務シフトコード
   ,pvc2StartTime          IN  VARCHAR2    --開始時間
   ,pvc2EndTime            IN  VARCHAR2    --終了時間
   ,pnumOprTime            OUT NUMBER      --作業時間
   ,pvc2Message            OUT VARCHAR2    --メッセージ
   ,pnumStatus             OUT NUMBER      --結果ステータス（1：正常終了 9：エラーあり）
) IS

/* 定数定義 */
    LOGMSG_START           VARCHAR2(20)           := 'Start';                           --ログ用メソッド開始宣言
    LOGMSG_END             VARCHAR2(12)           := 'End';                             --ログ用メソッド終了宣言
    LOGMSG_ERR             VARCHAR2(12)           := 'Err';                             --ログ用メソッドエラー宣言
    MY_SQL_NAME            CONSTANT VARCHAR2(60)  := 'SQLOPRTIMECALC';                 -- ＰＬ／ＳＱＬ名
    
    STATUS_NORMAL          NUMBER                 := 1;                                 -- 正常終了
    STATUS_ERROR           NUMBER                 := 9;                                 -- エラーあり

/* 変数宣言 */
    UTL_FileHandle         UTL_FILE.FILE_TYPE;                                          -- ファイルハンドル
    blnRet                 BOOLEAN;                                                     -- BOOLEAN型 返却値

BEGIN

    /* 結果ステータスの初期化 */
    pnumStatus := STATUS_NORMAL;

    /* LogFile の OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 作業時間計算処理 */
    blnRet := FNCOPRTIMECALC( UTL_FileHandle
                             , pvc2LogMode
                             , pvc2OutputMode
                             , pvc2UserId
                             , pvc2BusinessName
                             , pvc2PlantCd
                             , pvc2WorkShiftCode
                             , pvc2StartTime
                             , pvc2EndTime
                             , pnumOprTime
                             , pvc2Message
                             , pnumStatus);
   
    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile の CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN
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
        pnumStatus := STATUS_ERROR;
END;
/
