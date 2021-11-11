CREATE OR REPLACE FUNCTION FNCERRLOG(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.07.22 ����
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
'
' @(f)
'
' �@�\      : �G���[�k�n�f�o��
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          --(i)�H��R�[�h
'             pvc2PlSqlName        - (i)�o�k�^�r�p�k��
'             pvc2NumErrNo         - (i)�G���[�ԍ� 
'             pvc2ErrMessage       - (i)�G���[���b�Z�[�W
'
' �@�\����  : �G���[�k�n�f�̏o�͂��s���B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle      IN UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode      IN VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode   IN VARCHAR2            --�o�̓��[�h
   ,pvc2UserId       IN VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName IN VARCHAR2            --�Ɩ���
   ,pvc2PlantCd      IN VARCHAR2            --�H��R�[�h
   ,pvc2PlSqlName    IN VARCHAR2            --�o�k�^�r�p�k��
   ,pvc2NumErrNo     IN VARCHAR2            --�G���[�ԍ�
   ,pvc2ErrMessage   IN VARCHAR2            --�G���[���b�Z�[�W
) RETURN BOOLEAN
IS

/* �萔�̐錾 */
LOGMODE_NOLOG           VARCHAR2(4) := '0';        --�k�n�f���[�h�@�k�n�f����
LOGMODE_ERRMODE         VARCHAR2(4) := '1';        --�k�n�f���[�h�@�G���[�k�n�f
LOGMODE_TRACEMODE       VARCHAR2(4) := '2';        --�k�n�f���[�h�@�g���[�X�k�n�f
LOGMODE_DATAMODE        VARCHAR2(4) := '3';        --�k�n�f���[�h�@�f�[�^�k�n�f
OUTPUTMODE_EVENTVIEW    VARCHAR2(4) := '0';        --�o�̓��[�h�@�@�C�x���g�r���[�A
OUTPUTMODE_FILE         VARCHAR2(4) := '1';        --�o�̓��[�h�@�@�t�@�C��
LOGKBN_ERR              VARCHAR2(24) := 'ERROR ';   --�k�n�f���b�Z�[�W�敪�@�G���[
LOGKBN_TRACE            VARCHAR2(24) := 'TRACE ';   --�k�n�f���b�Z�[�W�敪�@�g���[�X
LOGKBN_DATA             VARCHAR2(24) := 'DATA  ';   --�k�n�f���b�Z�[�W�敪�@�f�[�^
LOGKBN_MESSAGE          VARCHAR2(24) := '�Ɩ�  ';   --�k�n�f���b�Z�[�W�敪�@�Ɩ����b�Z�[�W
FILEOPENMODE_R          VARCHAR2(4) := 'r';        --�t�@�C���n�o�d�m���[�h�@�q�d�`�c
FILEOPENMODE_W          VARCHAR2(4) := 'w';        --�t�@�C���n�o�d�m���[�h�@�v�q�h�s�d
FILEOPENMODE_A          VARCHAR2(4) := 'a';        --�t�@�C���n�o�d�m���[�h�@�`�o�o�d�m�c
excNORMAL_END           EXCEPTION;

/* �ϐ��̐錾 */
vc2TmpDateTime          VARCHAR2(76);        --���t����
vc2TmpMessage           VARCHAR2(1024);       --�k�n�f���b�Z�[�W
filHdlLogMsg            UTL_FILE.FILE_TYPE;  --�t�@�C���n���h��

BEGIN

    /* �k�n�f���[�h�̃`�F�b�N */
    IF pvc2LogMode < LOGMODE_ERRMODE THEN
        RAISE excNORMAL_END;
    END IF;

    /* �t�@�C���o�͂̂Ƃ��͓�����]�L */
    IF pvc2OutputMode = OUTPUTMODE_FILE THEN
        vc2TmpDateTime := TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS');
        vc2TmpMessage := LOGKBN_ERR || vc2TmpDateTime || ':';
    ELSE
--        vc2TmpMessage := LOGKBN_ERR;
        vc2TmpDateTime := TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS');
        vc2TmpMessage := LOGKBN_ERR || vc2TmpDateTime || ':';
    END IF;

    /* Message�̍쐬 */
    vc2TmpMessage := SUBSTRB(vc2TmpMessage
                            || ',' || pvc2UserId
                            || ',' || pvc2BusinessName
                            || ',' || pvc2PlantCd
                            || ',' || pvc2PlSqlName
                            || ',' || pvc2NumErrNo
                            || ',' || pvc2ErrMessage,
                            1,1024);

    /* �k�n�f�o�� */
    UTL_FILE.PUT(pFileHandle, vc2TmpMessage || CHR(10));

    /* �����o�� */
    UTL_FILE.FFLUSH(pFileHandle);

RETURN TRUE;



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excNORMAL_END         THEN            --�k�n�f�o�͑ΏۊO
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
    WHEN OTHERS THEN                         --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        RETURN FALSE;
END;
/