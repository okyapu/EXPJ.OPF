CREATE OR REPLACE
FUNCTION FNCLOGOPEN(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.07.22 ����
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �k�n�f�t�@�C���̂n�o�d�m
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pvc2OutputPath       - (i) �o�̓t�@�C���p�X
'             pvc2OutputName       - (i) �o�̓t�@�C����
'             pvc2PlantCd          - (i) �H��R�[�h
'             pvc2OutputMode       - (i) �o�̓��[�h
'             pFileHandle          - (io)�t�@�C���n���h��
'
' �@�\����  : �k�n�f�t�@�C���̂n�o�d�m���s���B
'             �o�̓t�@�C���͍H��R�[�h�{�u�Q�v�{�o�̓t�@�C�����ƂȂ�B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2OutputPath   IN     VARCHAR2            --�o�̓t�@�C���p�X
   ,pvc2OutputName   IN     VARCHAR2            --�o�̓t�@�C����
   ,pvc2PlantCd      IN     VARCHAR2            --�H��R�[�h
   ,pvc2OutputMode   IN     VARCHAR2            --�o�̓��[�h
   ,pFileHandle      IN OUT UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
) RETURN BOOLEAN
IS

/* �萔�̐錾 */
FILEOPENMODE_R  CONSTANT    VARCHAR2(4) := 'r';        --�t�@�C���n�o�d�m���[�h�@�q�d�`�c
FILEOPENMODE_W  CONSTANT    VARCHAR2(4) := 'w';        --�t�@�C���n�o�d�m���[�h�@�v�q�h�s�d
FILEOPENMODE_A  CONSTANT    VARCHAR2(4) := 'a';        --�t�@�C���n�o�d�m���[�h�@�`�o�o�d�m�c

FILEOPENMODE    VARCHAR(4); -- �t�@�C���I�[�v�����[�h

FILEOPENPATH    CONSTANT    VARCHAR2(28) := 'C:\TEMP';  --�k�n�f�t�@�C���p�X�i�����j


BEGIN

  IF pvc2OutputMode = '0' THEN
    FILEOPENMODE := FILEOPENMODE_A;
  ELSE
    FILEOPENMODE := FILEOPENMODE_W;
  END IF;

    /*�t�@�C���n�o�d�m */
    pFileHandle := UTL_FILE.FOPEN(pvc2OutputPath, pvc2PlantCd || '_' || pvc2OutputName, FILEOPENMODE);

RETURN TRUE;



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                         --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        /*�t�@�C���n�o�d�m */
        pFileHandle := UTL_FILE.FOPEN(FILEOPENPATH, pvc2PlantCd || '_' || pvc2OutputName, FILEOPENMODE);
        RETURN TRUE;
END;
/