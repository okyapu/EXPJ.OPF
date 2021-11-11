CREATE OR REPLACE PROCEDURE SQLWORKDAYCALC (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.08.04 ����
' 2005.10.24 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �ғ����v�Z
'             (Java�Ăяo��IF)
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2ItemCd           - (i)�i�ڔԍ�
'             pdtmDate             - (i)�Ώۓ��t
'             pnumDifference       - (i)����
'             pnumStartForwardFlg  - (i)����̑O�|���t���O
'             pdtmActiveDate       - (o)�Z�o�ғ���
'             pnumStatus           - (o)���ʃX�e�[�^�X
'
' �@�\����  : �ғ����v�Z���Ăяo���B
'
' ���l      : �G���[�������͌��ʃX�e�[�^�X(pnumStatus)�ɃG���[���e��ݒ肵��
'             �Z�o�ғ���(pdtmActiveDate)��NULL��Ԃ��B
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath         IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName         IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId             IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2    --�H��R�[�h
   ,pvc2ItemCd             IN  VARCHAR2    --�i�ڔԍ�
   ,pdtmDate               IN  DATE        --�Ώۓ��t
   ,pnumDifference         IN  NUMBER      --����
   ,pnumStartForwardFlg    IN  NUMBER      --����̑O�|���t���O
   ,pdtmActiveDate         OUT DATE        --�Z�o�ғ���
   ,pnumStatus             OUT NUMBER      --���ʃX�e�[�^�X
)
IS
/* �ϐ��̐錾 */
    UTL_FileHandle         UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
    blnRet                 BOOLEAN;            --BOOLEAN�^ �ԋp�l
    dtmResultData          DATE;
    blnStartForwardFlg     BOOLEAN;
/* �萔�̐錾 */
    MY_SQL_NAME            VARCHAR2(60)  := 'SqlWorkDayCalc'; --�o�k�^�r�p�k��
    LOGMODE_NOLOG          VARCHAR2(4)   := '0';              --�k�n�f���[�h�@�k�n�f����
    OUTPUTMODE_FILE        VARCHAR2(4)   := '1';              --�o�̓��[�h�@�@�t�@�C��
    LOGMSG_START           VARCHAR2(20)   := 'Start';          --���O�p���\�b�h�J�n�錾
    LOGMSG_END             VARCHAR2(12)   := 'End';            --���O�p���\�b�h�I���錾
    LOGMSG_ERR             VARCHAR2(12)   := 'Err';            --���O�p���\�b�h�G���[�錾
    LOGMSG_GETERR          VARCHAR2(32)   := 'GetNoErr';       --���O�p���\�b�h�̔ԃG���[�錾

    FORWARD_FLG_FALSE      NUMBER        := 0;                -- ����O�|���t���O FALSE
    FORWARD_FLG_TRUE       NUMBER        := 1;                -- ����O�|���t���O TRUE

    STATUS_NORMAL                NUMBER        := 0;          -- ����I��
    STATUS_INVALID_PATH          NUMBER        := 1;          -- �t�@�C���̏ꏊ�܂��̓t�@�C�����������ł��B
    STATUS_INVALID_MODE          NUMBER        := 2;          -- FOPEN ��open_mode �p�����[�^�������ł��B
    STATUS_INVALID_FILEHANDLE    NUMBER        := 3;          -- �t�@�C���E�n���h���������ł��B
    STATUS_INVALID_OPERATION     NUMBER        := 4;          -- �v���ǂ���Ƀt�@�C�����I�[�v���ł��Ȃ����A�܂��͑���ł��܂���B
    STATUS_READ_ERROR            NUMBER        := 5;          -- �Ǎ��ݑ��쒆�ɃI�y���[�e�B���O�E�V�X�e���̃G���[���������܂����B
    STATUS_WRITE_ERROR           NUMBER        := 6;          -- �����ݑ��쒆�ɃI�y���[�e�B���O�E�V�X�e���̃G���[���������܂����B
    STATUS_INTERNAL_ERROR        NUMBER        := 7;          -- PL/SQL ���̖��w��G���[�B
    STATUS_TRACE_LOG_ERROR       NUMBER        := 8;          -- FNCTRACELOG�G���[
    STATUS_WORK_DAY_CALC_ERROR   NUMBER        := 9;          -- �ғ����v�Z�G���[
    STATUS_OTHERS_ERROR          NUMBER        := 10;         -- ���̑��̃G���[

    -- ��O�̐錾
    excFncTraceLog               EXCEPTION;          --�g���[�X���O�o�̓G���[
    excFncWorkDayCalc            EXCEPTION;          --�ғ����v�Z�G���[

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

    IF pnumStartForwardFlg = FORWARD_FLG_FALSE THEN
        blnStartForwardFlg := FALSE;
    ELSE
        blnStartForwardFlg := TRUE;
    END IF
    ;

    /* �ғ����v�Z */
    blnRet := FNCWORKDAYCALC(
                UTL_FileHandle         --�t�@�C���n���h�� (NULL)
               ,pvc2LogMode            --�k�n�f���[�h�@�k�n�f����
               ,pvc2OutputMode         --�o�̓��[�h�@�@�t�@�C��
               ,pvc2UserId             --���[�U�h�c
               ,pvc2BusinessName       --�Ɩ���
               ,pvc2PlantCd            --�H��R�[�h
               ,pvc2ItemCd             --�i�ڔԍ�
               ,pdtmDate               --�Ώۓ��t
               ,pnumDifference         --����
               ,blnStartForwardFlg     --����̑O�|���t���O
               ,dtmResultData          --�Z�o�ғ���
              );

    IF blnRet=FALSE THEN
        RAISE excFncWorkDayCalc;
    END IF
    ;

    pdtmActiveDate := dtmResultData;

--    DBMS_OUTPUT.PUT_LINE('�̔Ԍ��ʁF' || TO_CHAR(dtmResultData,'YYYY/MM/DD') );

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FNCLOGCLOSE(UTL_FileHandle);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excFncTraceLog THEN           --
        pdtmActiveDate := NULL;
        pnumStatus := STATUS_TRACE_LOG_ERROR;
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncWorkDayCalc THEN           --
        pdtmActiveDate := NULL;
        pnumStatus := STATUS_WORK_DAY_CALC_ERROR;
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_GETERR);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN           --
        pdtmActiveDate := NULL;
        pnumStatus := STATUS_INVALID_PATH;
    WHEN UTL_FILE.INVALID_MODE THEN           --
        pdtmActiveDate := NULL;
        pnumStatus := STATUS_INVALID_MODE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      --
        pdtmActiveDate := NULL;
        pnumStatus := STATUS_INVALID_OPERATION;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         --
        pdtmActiveDate := NULL;
        pnumStatus := STATUS_INTERNAL_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     --
        pdtmActiveDate := NULL;
        pnumStatus := STATUS_INVALID_FILEHANDLE;
    WHEN OTHERS THEN
        pdtmActiveDate := NULL;
        pnumStatus := STATUS_OTHERS_ERROR;
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

        pnumStatus := STATUS_OTHERS_ERROR;

END;
/
