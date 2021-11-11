CREATE OR REPLACE PROCEDURE SQLEXCMAKELOTTRACEFD (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2006.12.22 ����
'
' �@�\      : ���b�g�g���[�X�o�^�E�X�V����
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
' �@�\����  : ���b�g�g���[�X�e�[�u����o�^�E�X�V���A���b�g�g���[�X���\�ɂ���B
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
              ,pvc2FromItemCd       IN  VARCHAR2      -- (i)���i�ڃR�[�h
              ,pvc2FromLotNo        IN  VARCHAR2      -- (i)�����b�g�ԍ�
              ,pvc2ToItemCd         IN  VARCHAR2      -- (i)��i�ڃR�[�h
              ,pvc2ToLotNo          IN  VARCHAR2      -- (i)�惍�b�g�ԍ�
              ,pvc2LotTraceTyp      IN  VARCHAR2      -- (i)���b�g�g���[�X�敪
              ,pvc2ErrCd            OUT VARCHAR2      -- (o)�G���[�R�[�h
              ,pnumStatus           OUT NUMBER        -- (o)���ʃX�e�[�^�X
)
IS

/* �ϐ��̐錾 */
    UTL_FileHandle           UTL_FILE.FILE_TYPE;                  --�t�@�C���n���h��
    blnRet                   BOOLEAN;                             --BOOLEAN�^ �ԋp�l


    numLoopCnt               NUMBER;                              --���[�v�J�E���^

/* �萔�̐錾 */
    MY_SQL_NAME                       VARCHAR2(120)  := 'SqlExcMakeLottraceFD';  --�o�k�^�r�p�k��
    LOGMODE_NOLOG                     VARCHAR2(4)    := '0';                       --�k�n�f���[�h�@�k�n�f����
    OUTPUTMODE_FILE                   VARCHAR2(4)    := '1';                       --�o�̓��[�h�@�@�t�@�C��
    LOGMSG_START                      VARCHAR2(20)   := 'Start';                   --���O�p���\�b�h�J�n�錾
    LOGMSG_END                        VARCHAR2(12)   := 'End';                     --���O�p���\�b�h�I���錾
    LOGMSG_ERR                        VARCHAR2(12)   := 'Err';                     --���O�p���\�b�h�G���[�錾
    LOGMSG_GETERR                     VARCHAR2(32)   := 'GetNoErr';                --���O�p���\�b�h�̔ԃG���[�錾
    LOGMSG_MAKELOTTRACEFD_ERR         VARCHAR2(120)  := 'EXCMAKELOTTRACEFD';  --���b�g�g���[�X�o�^�E�X�V�����G���[�錾

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

    STATUS_NORMAL          NUMBER        := 1;          -- ����I��
    STATUS_WORNING         NUMBER        := 2;          -- �x���I��
    STATUS_ERROR           NUMBER        := 3;          -- �ُ�I��

    -- ��O�̐錾
    excFncTraceLog             EXCEPTION;          --�g���[�X���O�o�̓G���[
    excFncExcMakeLotTraceFD   EXCEPTION;          --���b�g�g���[�X�o�^��X�V�G���[


BEGIN
/*-------------------------------------
  PLSQL������
-------------------------------------*/
    pnumStatus      := 3;          -- �ُ�I��

    /* LogFile �� OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);


    blnRet := FNCEXCMAKELOTTRACEFD(
                UTL_FileHandle              --�t�@�C���n���h��
               ,pvc2LogMode                 --�k�n�f���[�h
               ,pvc2OutputMode              --�o�̓��[�h
               ,pvc2UserId                  --���[�U�h�c
               ,pvc2BusinessName            --�Ɩ���
               ,pvc2PlantCd                 --�H��R�[�h
               ,pvc2FromItemCd              --���i�ڃR�[�h
               ,pvc2FromLotNo               --�����b�g�ԍ�
               ,pvc2ToItemCd                --��i�ڃR�[�h
               ,pvc2ToLotNo                 --�惍�b�g�ԍ�
               ,TO_NUMBER(pvc2LotTraceTyp)  --���b�g�g���[�X�敪
               ,pvc2ErrCd                   --�G���[���b�Z�[�WID
               ,pnumStatus                  --���ʃX�e�[�^�X�i1�F����I�� 2:�x���I�� 3�F�ُ�I���j
               );
    IF blnRet = FALSE THEN
        RAISE excFncExcMakeLotTraceFD;
    END IF;

/*--------------------------------------
  PLSQL����I��
--------------------------------------*/

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF;

--< ��O���� >---------------------------------------------------------------
EXCEPTION

    WHEN excFncExcMakeLotTraceFD THEN
        pnumStatus := STATUS_ERROR;
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_MAKELOTTRACEFD_ERR);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncTraceLog THEN           --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_TRACE_LOG_ERROR;
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN           --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_INVALID_PATH;
    WHEN UTL_FILE.INVALID_MODE THEN           --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_WRONG_VALUE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_INVALID_OPERATION;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_INTERNAL_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     --
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_INVALID_FILEHANDLE;
    WHEN OTHERS THEN
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_ORACLE_ERROR;
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

