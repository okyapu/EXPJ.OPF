CREATE OR REPLACE FUNCTION FNCGETFORMATTEDDATETIME(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2007.04.18 初版
'
' 機能      : 書式付で日付を返す
'
' 戻り値    : Varchar2 書式付日付
'
' 引き数    : pdtmDate             - (i)日付
'
' 機能説明  : 時刻管理する場合としない場合で日付の表示書式が異なるので、
'           : 引数で与えられた日付に書式を設定して返却する
'
' 備考      : 戻り値として書式付の日付を返すので、エラー発生時はNULLを返す。
'
'
------------------------------------------------------------------------------*/
    pdtmDate            IN  DATE                --変換元の日付
) RETURN VARCHAR2
IS

-- カーソルの宣言
    CURSOR curTIME_CTL IS
    SELECT  VALUE
    FROM    SYS_PARAMETER
    WHERE   NAME = 'TIME_CTRL';

/* 定数の宣言 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncGetFormattedDatetime';    --ＰＬ／ＳＱＬ名
    LOGMSG_START            VARCHAR2(20)   := 'Start';                      --ログ用メソッド開始宣言
    LOGMSG_END              VARCHAR2(12)   := 'End';                        --ログ用メソッド終了宣言

/* 変数の宣言 */
    blnRet                  BOOLEAN;
    vc2Date                 VARCHAR2(80);                --返却値
    vc2TimeCtl              SYS_PARAMETER.VALUE%TYPE;    --パラメータ値

BEGIN

    /* TraceLog の出力
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    */
 
    /* パラメータ値の取得 */
    OPEN curTIME_CTL;
    FETCH curTIME_CTL INTO vc2TimeCtl;
    CLOSE curTIME_CTL;

    /* 採番レコードが無い場合、生成 */
    IF UPPER(vc2TimeCtl) = 'TRUE' THEN
        vc2Date := TO_CHAR(pdtmDate,'YYYY/MM/DD HH24:MI');
    ELSE
        vc2Date := TO_CHAR(pdtmDate,'YYYY/MM/DD');
    END IF;

    /* TraceLog の出力
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);
    */

    RETURN vc2Date;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN   --その他のエラー
        /* ErrorLog の出力
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        */
        /* TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        */
        RETURN NULL;
END;
/