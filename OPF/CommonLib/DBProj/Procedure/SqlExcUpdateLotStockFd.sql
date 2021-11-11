CREATE OR REPLACE PROCEDURE SqlExcUpdateLotStockFd (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2006.11.07 ����
'
' �@�\      : ���b�g�ʕi�ڍ݌ɓo�^�E�X�V����
'             (Java�Ăяo��)
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pvc2LogMode                -- (i)�k�n�f���[�h
'             pvc2OutputMode             -- (i)�o�̓��[�h
'             pvc2OutputPath             -- (i)�o�̓t�@�C���p�X
'             pvc2OutputName             -- (i)�o�̓t�@�C����
'             pvc2UserId                 -- (i)���[�U�h�c
'             pvc2BusinessName           -- (i)�Ɩ���
'             pvc2PlantCd                -- (i)�H��R�[�h
'             pvc2RcvIssueCtrlCd         -- (i)���o�ɊǗ��ԍ�
'             pvc2ShipQty                -- (i)�o�׍ϐ���
'             pvc2MessegeCd              -- (o)�G���[�R�[�h
'             pnumStatus                 -- (o)���ʃX�e�[�^�X
'
' �@�\����  : ���o�ɊǗ��ԍ�����ɕۊǋ�ʓ��o�ɂ��������A
'             �擾�����l����Ƀ��b�g�ʕi�ڍ݌ɂ̓o�^�܂��͍X�V���s���B
'             �����ϐ��ʂ�NULL�ȊO�̏ꍇ�A�����l��[���b�g�ʕi�ڍ݌�].���b�g�ʈ����ϐ��ʂ̏������s���B
'
'
' ���l      :
'
------------------------------------------------------------------------------*/
              pvc2LogMode           IN  VARCHAR2      -- (i)�k�n�f���[�h
              ,pvc2OutputMode       IN  VARCHAR2      -- (i)�o�̓��[�h
              ,pvc2OutputPath       IN  VARCHAR2      -- (i)�o�̓t�@�C���p�X
              ,pvc2OutputName       IN  VARCHAR2      -- (i)�o�̓t�@�C����
              ,pvc2UserId           IN  VARCHAR2      -- (i)���[�U�h�c
              ,pvc2BusinessName     IN  VARCHAR2      -- (i)�Ɩ���
              ,pvc2PlantCd          IN  VARCHAR2      -- (i)�H��R�[�h
              ,pvc2RcvIssueCtrlCd   IN  VARCHAR2      -- (i)���o�ɊǗ��ԍ�
              ,pvc2RsvQty           IN  VARCHAR2      -- (i)�o�׍ϐ���
              ,pvc2MessageCd        OUT VARCHAR2      -- (o)�G���[�R�[�h
              ,pnumStatus           OUT NUMBER        -- (o)���ʃX�e�[�^�X
)
IS

/* �ϐ��̐錾 */
    UTL_FileHandle           UTL_FILE.FILE_TYPE;                  --�t�@�C���n���h��
    blnRet                   BOOLEAN;                             --BOOLEAN�^ �ԋp�l
    numStatus                NUMBER(1);                           --���ʃX�e�[�^�X
    pvc2ErrMsg               VARCHAR2(1023);                      --�G���[���b�Z�[�W�쐬��Ɨ̈�
    vc2MessageId             VARCHAR2(4000);

/* �萔�̐錾 */
    MY_SQL_NAME                VARCHAR2(120)  := 'SqlExcUpdateLotStockFd';  --�o�k�^�r�p�k��
    LOGMODE_NOLOG              VARCHAR2(4)    := '0';                       --�k�n�f���[�h�@�k�n�f����
    OUTPUTMODE_FILE            VARCHAR2(4)    := '1';                       --�o�̓��[�h�@�@�t�@�C��
    LOGMSG_START               VARCHAR2(20)   := 'Start';                   --���O�p���\�b�h�J�n�錾
    LOGMSG_END                 VARCHAR2(12)   := 'End';                     --���O�p���\�b�h�I���錾
    LOGMSG_ERR                 VARCHAR2(12)   := 'Err';                     --���O�p���\�b�h�G���[�錾
    LOGMSG_GETERR              VARCHAR2(32)   := 'GetNoErr';                --���O�p���\�b�h�̔ԃG���[�錾
    LOGMSG_GETUPDLOTSTOCKFD_ERR   VARCHAR2(120)  := 'EXCUPDATELOTSTOCKFD';  --���O�p���\�b�h���b�g�ʃG���[�錾

    STATUS_NORMAL          NUMBER        := 1;          -- ����I��
    STATUS_WORNING         NUMBER        := 2;          -- �x���I��
    STATUS_ERROR           NUMBER        := 3;          -- �ُ�I��

    -- ���b�Z�[�W�R�[�h
    JF_COM_ERR_ORACLE_ERROR           VARCHAR(28)  := 'AC53401';   --ORACLE�G���[
    JF_COM_ERR_WRONG_VALUE            VARCHAR(28)  := 'ZZ05105';   --�l���s���ł�

    JF_COM_ERR_INVALID_PATH           VARCHAR(28)  := 'ZZ22005';   --�t�@�C���̏ꏊ�܂��̓t�@�C�����������ł��B
    JF_COM_ERR_INVALID_FILEHANDLE     VARCHAR(28)  := 'ZZ22006';   --�t�@�C���E�n���h���������ł��B
    JF_COM_ERR_INVALID_OPERATION      VARCHAR(28)  := 'ZZ22007';   --�v���ǂ���Ƀt�@�C�����I�[�v���ł��Ȃ����A�܂��͑���ł��܂���B
    JF_COM_ERR_READ_ERROR             VARCHAR(28)  := 'ZZ22008';   --�Ǎ��ݑ��쒆�ɃI�y���[�e�B���O�E�V�X�e���̃G���[���������܂����B
    JF_COM_ERR_WRITE_ERROR            VARCHAR(28)  := 'ZZ22009';   --�����ݑ��쒆�ɃI�y���[�e�B���O�E�V�X�e���̃G���[���������܂����B
    JF_COM_INTERNAL_ERROR             VARCHAR(28)  := 'ZZ22010';   --PL/SQL ���̖��w��G���[�B
    JF_COM_TRACE_LOG_ERROR            VARCHAR(28)  := 'ZZ22011';   --�g���[�X���O�̏o�͂ŃG���[���������܂����B

    -- ��O�̐錾
    excFncTraceLog         EXCEPTION;          --�g���[�X���O�o�̓G���[
    excWorning             EXCEPTION;          --�����s���[�j���O


    PROCEDURE ErrorLog IS
    BEGIN
        /* ErrorLog �̏o�� */
         blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                             pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,pvc2MessageCd, pvc2ErrMsg);
    END;

    PROCEDURE TraceLog(vc2Trace VARCHAR2) IS
    BEGIN
        /* TraceLog �̏o�� */
         blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                               pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, vc2Trace);
    END;



BEGIN


/*-------------------------------------
  PLSQL������
-------------------------------------*/
    pnumStatus      := 3;          -- �ُ�I��

    /* LogFile �� OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, MY_SQL_NAME, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog �̏o�� */
    TraceLog(LOGMSG_START);


    blnRet := FNCEXCUPDATELOTSTOCKFD(
                UTL_FileHandle              --�t�@�C���n���h��
               ,pvc2LogMode                 --�k�n�f���[�h
               ,pvc2OutputMode              --�o�̓��[�h
               ,pvc2UserId                  --���[�U�h�c
               ,pvc2BusinessName            --�Ɩ���
               ,pvc2PlantCd                 --�H��R�[�h
               ,pvc2RcvIssueCtrlCd          --���o�ɊǗ��ԍ�
               ,TO_NUMBER(pvc2RsvQty)       --�o�׍ϐ���
               ,pvc2MessageCd                --�G���[���b�Z�[�WID
               ,pnumStatus                   --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
              );
    IF blnRet = FALSE THEN
        RAISE excWorning;
    END IF;

/*--------------------------------------
  PLSQL����I��
--------------------------------------*/

    /* TraceLog �̏o�� */
    TraceLog(LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excWorning THEN
        pnumStatus := STATUS_ERROR;
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_GETUPDLOTSTOCKFD_ERR);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncTraceLog THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageCd  := JF_COM_TRACE_LOG_ERROR;
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_GETUPDLOTSTOCKFD_ERR);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageCd  := JF_COM_ERR_INVALID_PATH;
    WHEN UTL_FILE.INVALID_MODE THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageCd  := JF_COM_ERR_WRONG_VALUE;
    WHEN UTL_FILE.INVALID_OPERATION THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageCd  := JF_COM_ERR_INVALID_OPERATION;
    WHEN UTL_FILE.INTERNAL_ERROR THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageCd  := JF_COM_INTERNAL_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageCd  := JF_COM_ERR_INVALID_FILEHANDLE;
    WHEN OTHERS THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageCd  := JF_COM_ERR_ORACLE_ERROR;
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

END;
/
