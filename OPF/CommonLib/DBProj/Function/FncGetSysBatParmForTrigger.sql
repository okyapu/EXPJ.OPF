CREATE OR REPLACE FUNCTION FncGetSysBatParmForTrigger (
/*------------------------------------------------------------------------------
'
' FncGetSysBatParmForTrigger.Sql
'
' 修正履歴  2008.03.12 新規作成
'
' 機能      : トリガーログ出力パス、ログモード、出力モードの取得
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : 
'             pvc2FilePath           - ファイルパス
'             pvc2LogMode            - ＬＯＧモード
'             pcv2OutputMode         - 出力モード

'
' 機能説明  : SYS_BAT_PARMから、トリガーログ出力パス、ログモード、出力モードを取得する
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2FilePath        OUT  VARCHAR2            -- ファイルパス   
   ,pvc2LogMode         OUT  VARCHAR2            -- ＬＯＧモード
   ,pvc2OutputMode      OUT  VARCHAR2            -- 出力モード
) RETURN BOOLEAN
IS
/* 変数の宣言 */
      vc2ProgramCD       VARCHAR2(120) := 'ZZ9999B001';
      vc2FunctionName    VARCHAR2(120) := 'FNCGETSYSBATPARMFORTRIGGER';
/* カーソルの宣言 */
      CURSOR curSYS_BAT_PARM IS
      SELECT FILE_PATH,LOG_MODE_TYP,OUTPUT_MODE_TYP
      FROM   SYS_BAT_PARM
      WHERE  PROGRAM_CD = vc2ProgramCD
      AND    FUNCTION_NAME = vc2FunctionName ;
/* ROWTYPE の宣言 */
      rtpSYS_BAT_PARM  curSYS_BAT_PARM%ROWTYPE;
	  
BEGIN

     OPEN curSYS_BAT_PARM;
     FETCH curSYS_BAT_PARM INTO rtpSYS_BAT_PARM;
     IF curSYS_BAT_PARM%FOUND THEN
        pvc2FilePath := rtpSYS_BAT_PARM.FILE_PATH;
        pvc2LogMode := rtpSYS_BAT_PARM.LOG_MODE_TYP;
        pvc2OutputMode := rtpSYS_BAT_PARM.OUTPUT_MODE_TYP;
     ELSE
	   CLOSE curSYS_BAT_PARM;
	   RETURN FALSE;
     END IF;
     CLOSE curSYS_BAT_PARM;

    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                             --その他のエラー
        RETURN FALSE;
END FncGetSysBatParmForTrigger;
/
