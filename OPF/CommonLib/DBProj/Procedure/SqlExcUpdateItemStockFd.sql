CREATE OR REPLACE PROCEDURE SQLEXCUPDATEITEMSTOCKFD (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2006.11.07 ����
'
' �@�\      : �݌ɁA���o�ɍX�V
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
' �@�\����  : ���o�ɊǗ��ԍ������ɁA�ۊǋ�ʕi�ڍ݌ɁE���b�g�ʕi�ڍ݌ɁE�ۊǋ�ʓ��o�ɂ̓o�^��X�V���s���B
'             �����ϐ��ʂ�NULL�ȊO�̏ꍇ�A�����l�Łm�ۊǋ�ʕi�ڍ݌�].�i�ڕʈ����ϐ��ʋy�сA
'             [���b�g�ʕi�ڍ݌�].���b�g�ʈ����ϐ��ʂ̏������s���B
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
              ,pvc2ShipQty          IN  VARCHAR2      -- (i)�o�׍ϐ���
              ,pvc2MessageId        OUT VARCHAR2      -- (o)�G���[�R�[�h
              ,pnumStatus           OUT NUMBER        -- (o)���ʃX�e�[�^�X
)
IS

    /* �ϐ��̐錾 */
    UTL_FileHandle           UTL_FILE.FILE_TYPE;                  --�t�@�C���n���h��
    blnRet                   BOOLEAN;                             --BOOLEAN�^ �ԋp�l



    /* �萔�̐錾 */
    MY_SQL_NAME                    VARCHAR2(120)  := 'SqlExcUpdateItemstockFd';  --�o�k�^�r�p�k��
    LOGMODE_NOLOG                  VARCHAR2(4)    := '0';                       --�k�n�f���[�h�@�k�n�f����
    OUTPUTMODE_FILE                VARCHAR2(4)    := '1';                       --�o�̓��[�h�@�@�t�@�C��
    LOGMSG_START                   VARCHAR2(20)   := 'Start';                   --���O�p���\�b�h�J�n�錾
    LOGMSG_END                     VARCHAR2(12)   := 'End';                     --���O�p���\�b�h�I���錾
    LOGMSG_ERR                     VARCHAR2(12)   := 'Err';                     --���O�p���\�b�h�G���[�錾
    LOGMSG_GETERR                  VARCHAR2(32)   := 'GetNoErr';                --���O�p���\�b�h�̔ԃG���[�錾
    LOGMSG_UPDATEITEMSTOCKFD_ERR   VARCHAR2(120)  := 'SqlExcUpdateItemStockFd'; --���O�p���\�b�h�݌�_���o�ɍX�V�G���[�錾

    STATUS_NORMAL                  NUMBER        := 1;          -- ����I��
    STATUS_WORNING                 NUMBER        := 2;          -- �x���I��
    STATUS_ERROR                   NUMBER        := 3;          -- �ُ�I��

    -- ���b�Z�[�W�R�[�h
    JF_COM_ERR_ORACLE_ERROR           VARCHAR(28)  := 'AC53401';   --ORACLE�G���[
    JF_COM_ERR_WRONG_VALUE            VARCHAR(28)  := 'ZZ05105';   --�l���s���ł�
    JF_COM_ERR_INVALID_PATH           VARCHAR(28)  := 'ZZ12005';   --�t�@�C���̏ꏊ�܂��̓t�@�C�����������ł��B
    JF_COM_ERR_INVALID_FILEHANDLE     VARCHAR(28)  := 'ZZ12006';   --�t�@�C���E�n���h���������ł��B
    JF_COM_ERR_INVALID_OPERATION      VARCHAR(28)  := 'ZZ12007';   --�v���ǂ���Ƀt�@�C�����I�[�v���ł��Ȃ����A�܂��͑���ł��܂���B
    JF_COM_ERR_READ_ERROR             VARCHAR(28)  := 'ZZ12008';   --�Ǎ��ݑ��쒆�ɃI�y���[�e�B���O�E�V�X�e���̃G���[���������܂����B
    JF_COM_ERR_WRITE_ERROR            VARCHAR(28)  := 'ZZ12009';   --�����ݑ��쒆�ɃI�y���[�e�B���O�E�V�X�e���̃G���[���������܂����B
    JF_COM_INTERNAL_ERROR             VARCHAR(28)  := 'ZZ12010';   --PL/SQL ���̖��w��G���[�B
    JF_COM_TRACE_LOG_ERROR            VARCHAR(28)  := 'ZZ12011';   --�g���[�X���O�̏o�͂ŃG���[���������܂����B


    -- ��O�̐錾
    excFncTraceLog           EXCEPTION;          --�g���[�X���O�o�̓G���[
    excUpdateItemStockFd     EXCEPTION;          --�݌�_���o�ɍX�V�����G���[

BEGIN

    pnumStatus := STATUS_NORMAL;

    /* LogFile �� OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;

    /* �݌ɁA���o�ɍX�V�����ďo��*/

    blnRet := FncExcUpdateItemStockFd(UTL_FileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd
                                     ,pvc2RcvIssueCtrlCd
                                     ,TO_NUMBER(pvc2ShipQty)
                                     ,pvc2MessageId
                                     ,pnumStatus
    );

    IF blnRet = FALSE THEN
        RAISE excUpdateItemStockFd;
    END IF;

   /*--------------------------------------
   PLSQL����I��
   --------------------------------------*/


    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;


--< ��O���� >---------------------------------------------------------------
EXCEPTION

    WHEN excUpdateItemStockFd THEN

       /* ErrorLog �̏o�� */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, LOGMSG_UPDATEITEMSTOCKFD_ERR, '');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := pvc2MessageId;

    WHEN excFncTraceLog THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageId  := JF_COM_TRACE_LOG_ERROR;
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageId  := JF_COM_ERR_INVALID_PATH;
    WHEN UTL_FILE.INVALID_MODE THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageId  := JF_COM_ERR_WRONG_VALUE;
    WHEN UTL_FILE.INVALID_OPERATION THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageId  := JF_COM_ERR_INVALID_OPERATION;
    WHEN UTL_FILE.INTERNAL_ERROR THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageId  := JF_COM_INTERNAL_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageId  := JF_COM_ERR_INVALID_FILEHANDLE;
    WHEN OTHERS THEN
        pnumStatus := STATUS_ERROR;
        pvc2MessageId  := JF_COM_ERR_ORACLE_ERROR;
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
