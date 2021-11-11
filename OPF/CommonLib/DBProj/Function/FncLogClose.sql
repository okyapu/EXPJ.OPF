CREATE OR REPLACE FUNCTION FNCLOGCLOSE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.07.22 ����
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �k�n�f�t�@�C���̂b�k�n�r�d
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle          - (io)�t�@�C���n���h��
'
' �@�\����  : �k�n�f�t�@�C���̂b�k�n�r�d���s���B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle      IN OUT UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
) RETURN BOOLEAN
IS

/* �萔�̐錾 */
FILEOPENMODE_R          VARCHAR2(4) := 'r';        --�t�@�C���n�o�d�m���[�h�@�q�d�`�c
FILEOPENMODE_W          VARCHAR2(4) := 'w';        --�t�@�C���n�o�d�m���[�h�@�v�q�h�s�d
FILEOPENMODE_A          VARCHAR2(4) := 'a';        --�t�@�C���n�o�d�m���[�h�@�`�o�o�d�m�c
FILEOPENPATH            VARCHAR2(28) := 'C:\TEMP';  --�k�n�f�t�@�C���p�X�i�����j

/* �ϐ��̐錾 */

BEGIN

    /*�t�@�C���b�k�n�r�d */
    UTL_FILE.FCLOSE(pFileHandle);

RETURN TRUE;



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN                         --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('OTHERS');
        /*�S�t�@�C���b�k�n�r�d */
        UTL_FILE.FCLOSE_ALL;
        RETURN TRUE;
END;
/