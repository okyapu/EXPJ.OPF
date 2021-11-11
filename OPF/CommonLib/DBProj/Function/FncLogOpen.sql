CREATE OR REPLACE
FUNCTION FNCLOGOPEN(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.07.22 初版
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : ＬＯＧファイルのＯＰＥＮ
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pvc2OutputPath       - (i) 出力ファイルパス
'             pvc2OutputName       - (i) 出力ファイル名
'             pvc2PlantCd          - (i) 工場コード
'             pvc2OutputMode       - (i) 出力モード
'             pFileHandle          - (io)ファイルハンドル
'
' 機能説明  : ＬＯＧファイルのＯＰＥＮを行う。
'             出力ファイルは工場コード＋「＿」＋出力ファイル名となる。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2OutputPath   IN     VARCHAR2            --出力ファイルパス
   ,pvc2OutputName   IN     VARCHAR2            --出力ファイル名
   ,pvc2PlantCd      IN     VARCHAR2            --工場コード
   ,pvc2OutputMode   IN     VARCHAR2            --出力モード
   ,pFileHandle      IN OUT UTL_FILE.FILE_TYPE  --ファイルハンドル
) RETURN BOOLEAN
IS

/* 定数の宣言 */
FILEOPENMODE_R  CONSTANT    VARCHAR2(4) := 'r';        --ファイルＯＰＥＮモード　ＲＥＡＤ
FILEOPENMODE_W  CONSTANT    VARCHAR2(4) := 'w';        --ファイルＯＰＥＮモード　ＷＲＩＴＥ
FILEOPENMODE_A  CONSTANT    VARCHAR2(4) := 'a';        --ファイルＯＰＥＮモード　ＡＰＰＥＮＤ

FILEOPENMODE    VARCHAR(4); -- ファイルオープンモード

FILEOPENPATH    CONSTANT    VARCHAR2(28) := 'C:\TEMP';  --ＬＯＧファイルパス（強制）


BEGIN

  IF pvc2OutputMode = '0' THEN
    FILEOPENMODE := FILEOPENMODE_A;
  ELSE
    FILEOPENMODE := FILEOPENMODE_W;
  END IF;

    /*ファイルＯＰＥＮ */
    pFileHandle := UTL_FILE.FOPEN(pvc2OutputPath, pvc2PlantCd || '_' || pvc2OutputName, FILEOPENMODE);

RETURN TRUE;



--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                         --その他のエラー
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        /*ファイルＯＰＥＮ */
        pFileHandle := UTL_FILE.FOPEN(FILEOPENPATH, pvc2PlantCd || '_' || pvc2OutputName, FILEOPENMODE);
        RETURN TRUE;
END;
/