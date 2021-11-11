CREATE OR REPLACE FUNCTION FNCWORKMINUTEDIFF(
/*------------------------------------------------------------------------------
'
' version   : 1.10.00
'
' �C������
' 2008.07.07 ����
'
' �@�\      : �ғ����v�Z�F�w������Ԃ̉ғ����ԏ�̍��i�����j�����߂�
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
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2ItemCd           - (i)�i�ڔԍ�
'             pdtmDateFrom         - (i)�Ώۓ���From�iMin�j�����
'             pdtmDateTo           - (i)�Ώۓ���To�iMax�j��r����
'             pnumDifference       - (o)�����i���P�ʁj���u�|�v�̏ꍇ�͉ߋ���
'
' �@�\����  : 	�E�w������Ԃ̉ғ����ԏ�̍��i�����j�����߂�
'				�E�ғ����Ԃ́ASYS_PARAMETER�iAM�FAM_START_TIME - AM_END_TIME�A PM�FPM_START_TIME - PM_END_TIME�j
'					����擾����B�i���݂̍\����́A�P��H��݂̂��O��j

------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2ItemCd          IN  VARCHAR2            --�i�ڔԍ�
   ,pdtmDateFrom          IN  DATE                --�Ώۓ��tFrom�iMin�j�����
   ,pdtmDateTo            IN  DATE                --�Ώۓ��tTo�iMax�j��r����
   ,pnumDifference      OUT  NUMBER              --�����i���P�ʁj���u�|�v�̏ꍇ�A�ߋ���
    ) RETURN BOOLEAN
IS

------------------
-- �J�[�\���錾 --
------------------
    --�y�ߑO�̏A�ƊJ�n�����𕪂Ɋ��Z���Ď擾�z
    --�i08:30�Ȃ�8*60+30=510�Ɋ��Z�j
CURSOR curSYS_PARAMETER_AM_ST IS
    SELECT  SUBSTR(VALUE,1,2)*60 + SUBSTR(VALUE,4,2)
    FROM    SYS_PARAMETER
    WHERE   NAME   = 'AM_START_TIME';

    --�y�ߑO�̏A�ƏI�������𕪂Ɋ��Z���Ď擾�z
CURSOR curSYS_PARAMETER_AM_ED IS
    SELECT  SUBSTR(VALUE,1,2)*60 + SUBSTR(VALUE,4,2)
    FROM    SYS_PARAMETER
    WHERE   NAME   = 'AM_END_TIME';

    --�y�ߌ�̏A�ƊJ�n�����𕪂Ɋ��Z���Ď擾�z
CURSOR curSYS_PARAMETER_PM_ST IS
    SELECT  SUBSTR(VALUE,1,2)*60 + SUBSTR(VALUE,4,2)
    FROM    SYS_PARAMETER
    WHERE   NAME   = 'PM_START_TIME';

    --�y�ߌ�̏A�ƏI�������𕪂Ɋ��Z���Ď擾�z
CURSOR curSYS_PARAMETER_PM_ED IS
    SELECT  SUBSTR(VALUE,1,2)*60 + SUBSTR(VALUE,4,2)
    FROM    SYS_PARAMETER
    WHERE   NAME   = 'PM_END_TIME';

-----------------
-- CONST�l�錾 --
-----------------
    MY_SQL_NAME             VARCHAR2(90)    := 'FncWorkMinuteDiff'; --�o�k�^�r�p�k��
    LOGMSG_START            VARCHAR2(20)    := 'Start';             --���O�p���\�b�h�J�n�錾
    LOGMSG_END              VARCHAR2(12)    := 'End';               --���O�p���\�b�h�I���錾

-----------------
-- MESSAGE�錾 --
-----------------
    APS_BATCH_END           VARCHAR2(28)    := 'ZZ09002';    --�o�b�`�������I�����܂���

--------------
-- WORK�ϐ� --
--------------
    blnRet              BOOLEAN;        -- Function�ԋp�l
    dtmActiveDate       DATE;           -- wk�ғ���
    --dtmTruncDate        DATE;           -- wk�Ώۓ��t
    --dtmTruncTime        NUMBER(30);     -- wk�Ώێ���
    
    nAMStartTime      NUMBER(10);     -- wk�ߑO�J�n�����̕����Z�l
    nAMEndTime        NUMBER(10);     -- wk�ߑO�I�������̕����Z�l
    nPMStartTime      NUMBER(10);     -- wk�ߌ�J�n�����̕����Z�l
    nPMEndTime        NUMBER(10);     -- wk�ߌ�I�������̕����Z�l
    
    --numTime             NUMBER(10);     -- �v�Z���̌��ݎ���
    --numDiffTime         NUMBER(10);     -- �����v�Z���̎c����
    --numResultTime       NUMBER(10);     -- �v�Z�̌��ʎ擾��������

    excWORK_DAY_CALC_ERR   EXCEPTION;   --�ғ����擾�G���[
    
	nRetDiff		NUMBER(18);
	nSign			NUMBER(2);	--

	dtBIG		DATE;		-- wk�Ώۓ��t
	dtSML		DATE;		-- wk�Ώۓ��t
	
	dtCURDATE	DATE;		-- wk���t�i���ԂȂ��j
	dtCURDTTM	DATE;		-- wk���t�i���Ԃ���j

    dtAMStart      DATE;		-- �ߑO�J�n���t�i���Ԃ���j
    dtAMEnd        DATE;		-- �ߑO�I�����t�i���Ԃ���j
    dtPMStart      DATE;		-- �ߌ�J�n���t�i���Ԃ���j
    dtPMEnd        DATE;		-- �ߌ�I�����t�i���Ԃ���j

BEGIN


    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* �ߑO�J�n�����̎擾 */
    OPEN curSYS_PARAMETER_AM_ST;
    FETCH curSYS_PARAMETER_AM_ST INTO nAMStartTime;
    CLOSE curSYS_PARAMETER_AM_ST;
    
    /* �ߑO�I�������̎擾 */
    OPEN curSYS_PARAMETER_AM_ED;
    FETCH curSYS_PARAMETER_AM_ED INTO nAMEndTime;
    CLOSE curSYS_PARAMETER_AM_ED;
    
    /* �ߌ�J�n�����̎擾 */
    OPEN curSYS_PARAMETER_PM_ST;
    FETCH curSYS_PARAMETER_PM_ST INTO nPMStartTime;
    CLOSE curSYS_PARAMETER_PM_ST;
    
    /* �ߌ�I�������̎擾 */
    OPEN curSYS_PARAMETER_PM_ED;
    FETCH curSYS_PARAMETER_PM_ED INTO nPMEndTime;
    CLOSE curSYS_PARAMETER_PM_ED;
    
    /* �ߑO�ߌ�̊J�n�I�������̂ǂꂩ�P�ł��擾�ł��Ȃ���� */
    /* �ߑO��00:00-12:30�A�ߌ��12:30-23:59�Ƃ݂Ȃ��Čv�Z���� */
    IF nAMStartTime IS NOT NULL AND
       nAMEndTime   IS NOT NULL AND
       nPMStartTime IS NOT NULL AND
       nPMEndTime   IS NOT NULL THEN
       NULL;
    ELSE
       nAMStartTime   := 0;   --00:00
       nAMEndTime     := 750; --12:30
       nPMStartTime   := 750; --12:30
       nPMEndTime     := 1440;--24:00
    END IF;
    
	---------------------------------------Sign
	nRetDiff := 0;
	IF pdtmDateFrom > pdtmDateTo THEN
		nSign := -1;
		dtBIG := pdtmDateFrom;
		dtSML := pdtmDateTo;
	ELSE
		nSign := 1;
		dtBIG := pdtmDateTo;
		dtSML := pdtmDateFrom;
	END IF ;
	dtBIG := TRUNC(dtBIG,'MI');
	dtSML := TRUNC(dtSML,'MI');
	---------------------------------------
	dtCURDATE := TRUNC(dtSML);		-- wk���t�i���ԂȂ��j
	dtCURDTTM := dtSML;				-- wk���t�i���Ԃ���j
	
	-------�ғ����V�t�g�O��  ------FncWorkDayCalc-------
	blnRet := FNCWORKDAYCALC(
					pFileHandle, 
					pvc2LogMode, 
					pvc2OutputMode,
					pvc2UserId, 
					pvc2BusinessName, 
					pvc2PlantCd,
					pvc2ItemCd,
					TRUNC(dtCURDATE), 
					0, 		---���������ғ����łȂ���Η��ғ��������߂�
					TRUE,	
					dtmActiveDate);
	IF blnRet = FALSE THEN
		RAISE excWORK_DAY_CALC_ERR;
	END IF;
	IF dtmActiveDate != dtCURDATE THEN	--�ғ����V�t�g���ꂽ�ꍇ
		dtCURDATE := TRUNC(dtmActiveDate);
		dtCURDTTM := TRUNC(dtmActiveDate);
	END IF ;
	
	--dtSML��dtBIG----------
	WHILE (dtCURDTTM <= dtBIG) LOOP
		
		--dtCURDATE := TRUNC(dtCURDTTM);
		dtAMStart := (dtCURDATE + nAMStartTime/24/60);
		dtAMEnd   := (dtCURDATE + nAMEndTime/24/60);
		dtPMStart := (dtCURDATE + nPMStartTime/24/60);
		dtPMEnd   := (dtCURDATE + nPMEndTime/24/60);
		
		IF dtCURDATE <= dtCURDTTM AND dtCURDTTM < dtAMStart THEN
			nRetDiff := nRetDiff + 0 ;
			dtCURDTTM := dtAMStart ;		--��AMStart
			
		ELSIF dtAMStart <= dtCURDTTM AND dtCURDTTM < dtAMEnd THEN
			IF dtBIG < dtAMEnd THEN
				nRetDiff := nRetDiff + (dtBIG - dtCURDTTM)*24*60 ;
			ELSE
				nRetDiff := nRetDiff + (dtAMEnd - dtCURDTTM)*24*60 ;
			END IF ;
			dtCURDTTM := dtAMEnd ;		--��AMEnd
			
		ELSIF dtAMEnd <= dtCURDTTM AND dtCURDTTM < dtPMStart THEN
			nRetDiff := nRetDiff + 0 ;
			dtCURDTTM := dtPMStart ;		--��PMStart
		
		ELSIF dtPMStart <= dtCURDTTM AND dtCURDTTM < dtPMEnd THEN
			IF dtBIG < dtPMEnd THEN
				nRetDiff := nRetDiff + (dtBIG - dtCURDTTM)*24*60 ;
			ELSE
				nRetDiff := nRetDiff + (dtPMEnd - dtCURDTTM)*24*60 ;
			END IF ;
			dtCURDTTM := dtPMEnd ;		--��PMEnd OR NEXT
			
		ELSIF dtPMEnd <= dtCURDTTM AND dtCURDTTM < (dtCURDATE + 1) THEN
			nRetDiff := nRetDiff + 0 ;
			dtCURDTTM := (dtCURDATE + 1) ;		--��NEXT
		END IF ;
		
		IF dtCURDTTM >= (dtCURDATE + 1) THEN	--�����������ɂȂ����ꍇ
			--���ғ��� ���擾   ------FncWorkDayCalc-------
			blnRet := FNCWORKDAYCALC(
							pFileHandle, 
							pvc2LogMode, 
							pvc2OutputMode,
							pvc2UserId, 
							pvc2BusinessName, 
							pvc2PlantCd,
							pvc2ItemCd,
							TRUNC(dtCURDATE), 
							1, 
							TRUE,	-- pblnStartForwardFlg, 
							dtmActiveDate);
			IF blnRet = FALSE THEN
				RAISE excWORK_DAY_CALC_ERR;
			END IF;
			dtCURDTTM := TRUNC(dtmActiveDate) ;
			dtCURDATE := TRUNC(dtmActiveDate) ;
		END IF ;
			
	END LOOP;
    
    pnumDifference := nRetDiff * nSign ;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- ����I��

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excWORK_DAY_CALC_ERR      THEN    -- �ғ����擾�G���[
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, '(SBM0066)�F�ғ����Z�o�G���[');
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
    WHEN OTHERS THEN
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/
