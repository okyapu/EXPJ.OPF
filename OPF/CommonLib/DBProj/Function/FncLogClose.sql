CREATE OR REPLACE FUNCTION FNCLOGCLOSE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.07.22 初版
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : ＬＯＧファイルのＣＬＯＳＥ
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle          - (io)ファイルハンドル
'
' 機能説明  : ＬＯＧファイルのＣＬＯＳＥを行う。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle      IN OUT UTL_FILE.FILE_TYPE  --ファイルハンドル
) RETURN BOOLEAN
IS

/* 定数の宣言 */
FILEOPENMODE_R          VARCHAR2(4) := 'r';        --ファイルＯＰＥＮモード　ＲＥＡＤ
FILEOPENMODE_W          VARCHAR2(4) := 'w';        --ファイルＯＰＥＮモード　ＷＲＩＴＥ
FILEOPENMODE_A          VARCHAR2(4) := 'a';        --ファイルＯＰＥＮモード　ＡＰＰＥＮＤ
FILEOPENPATH            VARCHAR2(28) := 'C:\TEMP';  --ＬＯＧファイルパス（強制）

/* 変数の宣言 */

BEGIN

    /*ファイルＣＬＯＳＥ */
    UTL_FILE.FCLOSE(pFileHandle);

RETURN TRUE;



--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                         --その他のエラー
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        /*全ファイルＣＬＯＳＥ */
        UTL_FILE.FCLOSE_ALL;
        RETURN TRUE;
END;
/