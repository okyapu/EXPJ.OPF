CREATE OR REPLACE FUNCTION FNCGETBUSINESSDATE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.07.22 ����
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �Ɩ����t�擾
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
'             pdtmBusinessOprDate  - (o)�Ɩ����t
'
' �@�\����  : �w��H��̋Ɩ����t�̎擾���s���B
'
' ���l      :
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pdtmBusinessOprDate OUT DATE                --�Ɩ����t
)RETURN BOOLEAN
IS

/* �ϐ��̐錾 */
    blnRtn              BOOLEAN;

/* �萔�̐錾 */
    MY_SQL_NAME     VARCHAR2(72)  := 'FncGetBusinessDate';  --�o�k�^�r�p�k��
    LOGMSG_START    VARCHAR2(20)   := 'Start';               --���O�p���\�b�h�J�n�錾
    LOGMSG_END      VARCHAR2(12)   := 'End';                 --���O�p���\�b�h�I���錾

BEGIN

    /* TraceLog �̏o�� */
    blnRtn := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    pdtmBusinessOprDate := NULL;

    SELECT BUSINESS_OPR_DATE INTO pdtmBusinessOprDate FROM SYS_DATE_CTRL WHERE PLANT_CD=pvc2PlantCd;

    /* TraceLog �̏o�� */
    blnRtn := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN   --���̑��̃G���[
        /* ErrorLog �̏o�� */
        blnRtn := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRtn := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/