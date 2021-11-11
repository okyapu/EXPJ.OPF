CREATE OR REPLACE FUNCTION FNCERRLOG(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.07.22 初版
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
'
' @(f)
'
' 機能      : エラーＬＯＧ出力
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
'             pvc2PlSqlName        - (i)ＰＬ／ＳＱＬ名
'             pvc2NumErrNo         - (i)エラー番号 
'             pvc2ErrMessage       - (i)エラーメッセージ
'
' 機能説明  : エラーＬＯＧの出力を行う。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle      IN UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode      IN VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode   IN VARCHAR2            --出力モード
   ,pvc2UserId       IN VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName IN VARCHAR2            --業務名
   ,pvc2PlantCd      IN VARCHAR2            --工場コード
   ,pvc2PlSqlName    IN VARCHAR2            --ＰＬ／ＳＱＬ名
   ,pvc2NumErrNo     IN VARCHAR2            --エラー番号
   ,pvc2ErrMessage   IN VARCHAR2            --エラーメッセージ
) RETURN BOOLEAN
IS

/* 定数の宣言 */
LOGMODE_NOLOG           VARCHAR2(4) := '0';        --ＬＯＧモード　ＬＯＧ無し
LOGMODE_ERRMODE         VARCHAR2(4) := '1';        --ＬＯＧモード　エラーＬＯＧ
LOGMODE_TRACEMODE       VARCHAR2(4) := '2';        --ＬＯＧモード　トレースＬＯＧ
LOGMODE_DATAMODE        VARCHAR2(4) := '3';        --ＬＯＧモード　データＬＯＧ
OUTPUTMODE_EVENTVIEW    VARCHAR2(4) := '0';        --出力モード　　イベントビューア
OUTPUTMODE_FILE         VARCHAR2(4) := '1';        --出力モード　　ファイル
LOGKBN_ERR              VARCHAR2(24) := 'ERROR ';   --ＬＯＧメッセージ区分　エラー
LOGKBN_TRACE            VARCHAR2(24) := 'TRACE ';   --ＬＯＧメッセージ区分　トレース
LOGKBN_DATA             VARCHAR2(24) := 'DATA  ';   --ＬＯＧメッセージ区分　データ
LOGKBN_MESSAGE          VARCHAR2(24) := '業務  ';   --ＬＯＧメッセージ区分　業務メッセージ
FILEOPENMODE_R          VARCHAR2(4) := 'r';        --ファイルＯＰＥＮモード　ＲＥＡＤ
FILEOPENMODE_W          VARCHAR2(4) := 'w';        --ファイルＯＰＥＮモード　ＷＲＩＴＥ
FILEOPENMODE_A          VARCHAR2(4) := 'a';        --ファイルＯＰＥＮモード　ＡＰＰＥＮＤ
excNORMAL_END           EXCEPTION;

/* 変数の宣言 */
vc2TmpDateTime          VARCHAR2(76);        --日付時間
vc2TmpMessage           VARCHAR2(1024);       --ＬＯＧメッセージ
filHdlLogMsg            UTL_FILE.FILE_TYPE;  --ファイルハンドル

BEGIN

    /* ＬＯＧモードのチェック */
    IF pvc2LogMode < LOGMODE_ERRMODE THEN
        RAISE excNORMAL_END;
    END IF;

    /* ファイル出力のときは日時を転記 */
    IF pvc2OutputMode = OUTPUTMODE_FILE THEN
        vc2TmpDateTime := TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS');
        vc2TmpMessage := LOGKBN_ERR || vc2TmpDateTime || ':';
    ELSE
--        vc2TmpMessage := LOGKBN_ERR;
        vc2TmpDateTime := TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS');
        vc2TmpMessage := LOGKBN_ERR || vc2TmpDateTime || ':';
    END IF;

    /* Messageの作成 */
    vc2TmpMessage := SUBSTRB(vc2TmpMessage
                            || ',' || pvc2UserId
                            || ',' || pvc2BusinessName
                            || ',' || pvc2PlantCd
                            || ',' || pvc2PlSqlName
                            || ',' || pvc2NumErrNo
                            || ',' || pvc2ErrMessage,
                            1,1024);

    /* ＬＯＧ出力 */
    UTL_FILE.PUT(pFileHandle, vc2TmpMessage || CHR(10));

    /* 物理出力 */
    UTL_FILE.FFLUSH(pFileHandle);

RETURN TRUE;



--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excNORMAL_END         THEN            --ＬＯＧ出力対象外
--DBMS_OUTPUT.PUT_LINE('excNORMAL_END');
        RETURN TRUE;
    WHEN UTL_FILE.INVALID_PATH THEN           --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INVALID_PATH');
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_MODE THEN           --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INVALID_MODE');
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INVALID_OPERATION');
        RETURN FALSE;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INTERNAL_ERROR');
        RETURN FALSE;
    WHEN UTL_FILE.WRITE_ERROR THEN            --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.WRITE_ERROR');
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     --
--DBMS_OUTPUT.PUT_LINE('UTL_FILE.INVALID_FILEHANDLE');
        RETURN FALSE;
    WHEN OTHERS THEN                         --その他のエラー
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        RETURN FALSE;
END;
/