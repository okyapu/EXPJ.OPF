CREATE OR REPLACE PROCEDURE SQLOPRTIMECALC(
/*----------------------------------------------------------------------------
'
' SQL_NAME �F SqlOprTimeCalc
' Version  �F 1.00.00
'
' �C������
'   2014.04.01 ����
' 
' �@�\      : ��Ǝ��Ԍv�Z����
' 
' �߂�l    : �Ȃ�
'
' ������    : pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)SYS���O�o�̓��[�h
'             pvc2OutputPath       - (i)SYS���O�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)SYS���O�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�R�[�h
'             pvc2BusinessName     - (i)�Ɩ��h�c
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2WorkShiftCode    - (i)�Ζ��V�t�g�R�[�h
'             pvc2StartTime        - (i)�J�n����
'             pvc2EndTime          - (i)�I������
'             pnumOprTime          - (o)��Ǝ���
'             pvc2Message          - (o)���b�Z�[�W
'             pnumStatus           - (o)���ʃX�e�[�^�X
'
' �@�\����  : ��Ǝ��Ԃ̌v�Z���s���B
'             �Ζ��V�t�g�P�ʂɋx�e���Ԃ��l������Ǝ��Ԃ��Z�o����B
'
' ���l      : 
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath         IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName         IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId             IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2    --�H��R�[�h
   ,pvc2WorkShiftCode      IN  VARCHAR2    --�Ζ��V�t�g�R�[�h
   ,pvc2StartTime          IN  VARCHAR2    --�J�n����
   ,pvc2EndTime            IN  VARCHAR2    --�I������
   ,pnumOprTime            OUT NUMBER      --��Ǝ���
   ,pvc2Message            OUT VARCHAR2    --���b�Z�[�W
   ,pnumStatus             OUT NUMBER      --���ʃX�e�[�^�X�i1�F����I�� 9�F�G���[����j
) IS

/* �萔��` */
    LOGMSG_START           VARCHAR2(20)           := 'Start';                           --���O�p���\�b�h�J�n�錾
    LOGMSG_END             VARCHAR2(12)           := 'End';                             --���O�p���\�b�h�I���錾
    LOGMSG_ERR             VARCHAR2(12)           := 'Err';                             --���O�p���\�b�h�G���[�錾
    MY_SQL_NAME            CONSTANT VARCHAR2(60)  := 'SQLOPRTIMECALC';                 -- �o�k�^�r�p�k��
    
    STATUS_NORMAL          NUMBER                 := 1;                                 -- ����I��
    STATUS_ERROR           NUMBER                 := 9;                                 -- �G���[����

/* �ϐ��錾 */
    UTL_FileHandle         UTL_FILE.FILE_TYPE;                                          -- �t�@�C���n���h��
    blnRet                 BOOLEAN;                                                     -- BOOLEAN�^ �ԋp�l

BEGIN

    /* ���ʃX�e�[�^�X�̏����� */
    pnumStatus := STATUS_NORMAL;

    /* LogFile �� OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* ��Ǝ��Ԍv�Z���� */
    blnRet := FNCOPRTIMECALC( UTL_FileHandle
                             , pvc2LogMode
                             , pvc2OutputMode
                             , pvc2UserId
                             , pvc2BusinessName
                             , pvc2PlantCd
                             , pvc2WorkShiftCode
                             , pvc2StartTime
                             , pvc2EndTime
                             , pnumOprTime
                             , pvc2Message
                             , pnumStatus);
   
    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
        pnumStatus := STATUS_ERROR;
END;
/
