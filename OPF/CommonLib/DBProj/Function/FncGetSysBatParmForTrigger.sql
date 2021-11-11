CREATE OR REPLACE FUNCTION FncGetSysBatParmForTrigger (
/*------------------------------------------------------------------------------
'
' FncGetSysBatParmForTrigger.Sql
'
' �C������  2008.03.12 �V�K�쐬
'
' �@�\      : �g���K�[���O�o�̓p�X�A���O���[�h�A�o�̓��[�h�̎擾
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : 
'             pvc2FilePath           - �t�@�C���p�X
'             pvc2LogMode            - �k�n�f���[�h
'             pcv2OutputMode         - �o�̓��[�h

'
' �@�\����  : SYS_BAT_PARM����A�g���K�[���O�o�̓p�X�A���O���[�h�A�o�̓��[�h���擾����
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2FilePath        OUT  VARCHAR2            -- �t�@�C���p�X   
   ,pvc2LogMode         OUT  VARCHAR2            -- �k�n�f���[�h
   ,pvc2OutputMode      OUT  VARCHAR2            -- �o�̓��[�h
) RETURN BOOLEAN
IS
/* �ϐ��̐錾 */
      vc2ProgramCD       VARCHAR2(120) := 'ZZ9999B001';
      vc2FunctionName    VARCHAR2(120) := 'FNCGETSYSBATPARMFORTRIGGER';
/* �J�[�\���̐錾 */
      CURSOR curSYS_BAT_PARM IS
      SELECT FILE_PATH,LOG_MODE_TYP,OUTPUT_MODE_TYP
      FROM   SYS_BAT_PARM
      WHERE  PROGRAM_CD = vc2ProgramCD
      AND    FUNCTION_NAME = vc2FunctionName ;
/* ROWTYPE �̐錾 */
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

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                             --���̑��̃G���[
        RETURN FALSE;
END FncGetSysBatParmForTrigger;
/
