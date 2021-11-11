CREATE OR REPLACE PROCEDURE SQLWORKMINUTESHIFT (
/*------------------------------------------------------------------------------
'
' version   : 1.30.00
'
' �C������
' 2008.07.10 ����	�����Ԓ[�����̒ǉ�
' 2008.07.10 	Ver1.20.00	���[���n�p�Ɍ��肵��Atsumi�l�p�ŁiIF���̂܂܁j
' 2008.10.08 	Ver1.30.00	�[���n�ȊO�ɁA�J�n���n�̋z���w��ɑΉ������B
'
' �@�\      : �ғ����v�Z�F�w������̂���w�蕪�Ԃ̉ғ����ԏ�̃V�t�g�������������߂�
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
'             pdtmDateFrom         - (i)�Ώۓ���From�iMin�j�����
'             pnumDifference       - (i)�����i���P�ʁj���u�|�v�̏ꍇ�A�ߋ���
'             pdtmDateTo           - (i)�Ώۓ���To�iMax�j��r����
'			pnumEndFlg		   - (i)�ғ����ԑт̒[�̏����w��i�J�n���n�F�O�A�[���n�F�P�j	ADD 20081008 TEST
'             pdtmShiftDate        - (o)�Z�o���ʓ���
'             pnumStatus           - (o)���ʃX�e�[�^�X
'
' �@�\����  : �w������̂���w�蕪�Ԃ̉ғ����ԏ�̃V�t�g�������������߂�
'
' ���l      : �G���[�������͌��ʃX�e�[�^�X(pnumStatus)�ɃG���[���e��ݒ肵��
'              ���u��r�����{���v�̃C���[�W
''
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath         IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName         IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId             IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2    --�H��R�[�h
   ,pvc2ItemCd             IN  VARCHAR2    --�i�ڔԍ�
   ,pdtmDateFrom         IN DATE	-- (i)�Ώۓ���From�iMin�j�����
   ,pnumDifference         IN  NUMBER      --�����i���P�ʁj���u�|�v�̏ꍇ�A�ߋ���
   ,pnumEndFlg         IN  NUMBER      --�ғ����ԑт̒[�̏����w��i�J�n���n�F�O�A�[���n�F�P�j	ADD 20081008 TEST
   ,pdtmShiftDate           OUT DATE	-- (o)�Z�o���ʓ���
   ,pnumStatus             OUT NUMBER      --���ʃX�e�[�^�X
)
IS
/* �ϐ��̐錾 */
    UTL_FileHandle         UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
    blnRet                 BOOLEAN;            --BOOLEAN�^ �ԋp�l
    dtmResultDtTm          DATE;
    blnStartForwardFlg     BOOLEAN;

	nRetDiff		NUMBER(18);
	nRetDate		DATE;

/* �萔�̐錾 */
    MY_SQL_NAME            VARCHAR2(60)  := 'SqlWorkMinuteShift'; --�o�k�^�r�p�k��
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
    blnRet := FNCLOGOPEN(pvc2OutputPath, MY_SQL_NAME||'_'||pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;

	-------------------------------
	blnStartForwardFlg := true;
	--�Z�o�ғ������̃V�t�g	------FncWorkMinuteCalc-------
	blnRet := FNCWORKMINUTESHIFT(
					UTL_FileHandle, 	-- pFileHandle          - (i)�t�@�C���n���h��
					pvc2LogMode, 		-- pvc2LogMode          - (i)�k�n�f���[�h
					pvc2OutputMode,		-- pvc2OutputMode       - (i)�o�̓��[�h
					pvc2UserId, 		-- pvc2UserId           - (i)���[�U�h�c
					pvc2BusinessName, 	-- pvc2BusinessName     - (i)�Ɩ���
					pvc2PlantCd,		-- pvc2PlantCd          - (i)�H��R�[�h
					pvc2ItemCd,			-- pvc2ItemCd           - (i)�i�ڔԍ�
					pdtmDateFrom,	--	IN  DATE	--�����i���P�ʁj���u�|�v�̏ꍇ�A�ߋ���
					pnumDifference,		--	IN  NUMBER	--�����i���P�ʁj���u�|�v�̏ꍇ�A�ߋ���
   					pnumEndFlg,			--�ғ����ԑт̒[�̏����w��i�J�n���n�F�O�A�[���n�F�P�j	ADD 20081008 TEST
					nRetDate		--	OUT  DATE	--(o)�Z�o���ʓ���
				);
	IF blnRet = FALSE THEN
		RAISE excFncWorkDayCalc;
	END IF;

	-------------------------------
    pdtmShiftDate := nRetDate;


        -- TraceLog For DEBUG -----------------------
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME,
                              'RSLT:EndFlg=1:'
                              	||TO_CHAR(pdtmDateFrom,'YYYY/MM/DD HH24:MI:SS')|| '�{'
                              	||pnumDifference||'Min.'|| '��'
                              	||TO_CHAR(pdtmShiftDate,'YYYY/MM/DD HH24:MI:SS')
                              );
--    DBMS_OUTPUT.PUT_LINE('�̔Ԍ��ʁF' || TO_CHAR(dtmResultDtTm,'YYYY/MM/DD') );

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
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_TRACE_LOG_ERROR;
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN excFncWorkDayCalc THEN           --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_WORK_DAY_CALC_ERROR;
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_GETERR);
        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
    WHEN UTL_FILE.INVALID_PATH THEN           --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INVALID_PATH;
    WHEN UTL_FILE.INVALID_MODE THEN           --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INVALID_MODE;
    WHEN UTL_FILE.INVALID_OPERATION THEN      --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INVALID_OPERATION;
    WHEN UTL_FILE.INTERNAL_ERROR THEN         --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INTERNAL_ERROR;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN     --
        pdtmShiftDate := NULL;
        pnumStatus := STATUS_INVALID_FILEHANDLE;
    WHEN OTHERS THEN
        pdtmShiftDate := NULL;
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
