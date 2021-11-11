CREATE OR REPLACE FUNCTION FNCGETBUSINESSDATE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.07.22 初版
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 業務日付取得
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
'             pdtmBusinessOprDate  - (o)業務日付
'
' 機能説明  : 指定工場の業務日付の取得を行う。
'
' 備考      :
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pdtmBusinessOprDate OUT DATE                --業務日付
)RETURN BOOLEAN
IS

/* 変数の宣言 */
    blnRtn              BOOLEAN;

/* 定数の宣言 */
    MY_SQL_NAME     VARCHAR2(72)  := 'FncGetBusinessDate';  --ＰＬ／ＳＱＬ名
    LOGMSG_START    VARCHAR2(20)   := 'Start';               --ログ用メソッド開始宣言
    LOGMSG_END      VARCHAR2(12)   := 'End';                 --ログ用メソッド終了宣言

BEGIN

    /* TraceLog の出力 */
    blnRtn := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    pdtmBusinessOprDate := NULL;

    SELECT BUSINESS_OPR_DATE INTO pdtmBusinessOprDate FROM SYS_DATE_CTRL WHERE PLANT_CD=pvc2PlantCd;

    /* TraceLog の出力 */
    blnRtn := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;



--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN   --その他のエラー
        /* ErrorLog の出力 */
        blnRtn := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRtn := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/