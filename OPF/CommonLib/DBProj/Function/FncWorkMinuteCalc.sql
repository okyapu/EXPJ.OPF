CREATE OR REPLACE FUNCTION FNCWORKMINUTECALC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2007.03.06 ����
'
' �@�\      : �ғ����v�Z
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
'             pdtmDate             - (i)�Ώۓ���
'             pnumDifference       - (i)�����i���P�ʁj
'             pblnStartForwardFlg  - (i)����̑O�|���t���O
'             pdtmActiveDate       - (o)�Z�o�ғ�����
'
' �@�\����  : �w�肳�ꂽ�Ώۓ�������ғ����x�[�X�ō����̕�������|�����������Z�o����B
'             �������}�C�i�X�w�肵���ꍇ�͎w�荷���̕������O�|�����������Z�o����B
'             �Ώۓ��t���x���̏ꍇ�A����O�|���t���O��TRUE�ł����
'             ���̓��ȍ~�̏��߂̉ғ���������Ƃ���B
'             FALSE�̏ꍇ�͂��̓��ȑO�̏��߂̉ғ���������Ƃ���B
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2ItemCd          IN  VARCHAR2            --�i�ڔԍ�
   ,pdtmDate            IN  DATE                --�Ώۓ��t
   ,pnumDifference      IN  NUMBER              --�����i���P�ʁj
   ,pblnStartForwardFlg IN  BOOLEAN             --����̑O�|���t���O
   ,pdtmActiveDate      OUT DATE                --�Z�o�ғ���
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
    MY_SQL_NAME             VARCHAR2(90)    := 'FncWorkMinuteCalc'; --�o�k�^�r�p�k��
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
    dtmTruncDate        DATE;           -- wk�Ώۓ��t
    dtmTruncTime        NUMBER(30);     -- wk�Ώێ���
    dtmAMStartTime      NUMBER(10);     -- wk�ߑO�J�n�����̕����Z�l
    dtmAMEndTime        NUMBER(10);     -- wk�ߑO�I�������̕����Z�l
    dtmPMStartTime      NUMBER(10);     -- wk�ߌ�J�n�����̕����Z�l
    dtmPMEndTime        NUMBER(10);     -- wk�ߌ�I�������̕����Z�l
    numTime             NUMBER(10);     -- �v�Z���̌��ݎ���
    numDiffTime         NUMBER(10);     -- �����v�Z���̎c����
    numResultTime       NUMBER(10);     -- �v�Z�̌��ʎ擾��������

    excWORK_DAY_CALC_ERR   EXCEPTION;   --�ғ����擾�G���[

BEGIN

    /* ���������𖳎������Ώۓ��t���擾 */
    dtmTruncDate := TRUNC(pdtmDate);

    /* ���t�����𖳎������Ώێ����̕����Z�l���擾 */
    dtmTruncTime := TO_CHAR(pdtmDate,'HH24')*60 + TO_CHAR(pdtmDate,'MI');

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* �ߑO�J�n�����̎擾 */
    OPEN curSYS_PARAMETER_AM_ST;
    FETCH curSYS_PARAMETER_AM_ST INTO dtmAMStartTime;
    CLOSE curSYS_PARAMETER_AM_ST;
    
    /* �ߑO�I�������̎擾 */
    OPEN curSYS_PARAMETER_AM_ED;
    FETCH curSYS_PARAMETER_AM_ED INTO dtmAMEndTime;
    CLOSE curSYS_PARAMETER_AM_ED;
    
    /* �ߌ�J�n�����̎擾 */
    OPEN curSYS_PARAMETER_PM_ST;
    FETCH curSYS_PARAMETER_PM_ST INTO dtmPMStartTime;
    CLOSE curSYS_PARAMETER_PM_ST;
    
    /* �ߌ�I�������̎擾 */
    OPEN curSYS_PARAMETER_PM_ED;
    FETCH curSYS_PARAMETER_PM_ED INTO dtmPMEndTime;
    CLOSE curSYS_PARAMETER_PM_ED;
    
    /* �ߑO�ߌ�̊J�n�I�������̂ǂꂩ�P�ł��擾�ł��Ȃ���� */
    /* �ߑO��00:00-12:30�A�ߌ��12:30-23:59�Ƃ݂Ȃ��Čv�Z���� */
    IF dtmAMStartTime IS NOT NULL AND
       dtmAMEndTime   IS NOT NULL AND
       dtmPMStartTime IS NOT NULL AND
       dtmPMEndTime   IS NOT NULL THEN
       NULL;
    ELSE
       dtmAMStartTime   := 0;   --00:00
       dtmAMEndTime     := 750; --12:30
       dtmPMStartTime   := 750; --12:30
       dtmPMEndTime     := 1440;--24:00
    END IF;
    
    /* ���ݎ�����ϐ��ɐݒ肷�� */
    dtmActiveDate   := dtmTruncDate;
    numTime         := dtmTruncTime;
    numDiffTime     := pnumDifference;

    /* LT�v�Z���� */
    IF pnumDifference = 0 THEN
        /* LT��0�̏ꍇ�́A���߂̊J�n�������v�Z���� */
        IF numTime <= dtmAMStartTime THEN
            numResultTime   := dtmAMStartTime;
        ELSIF dtmAMEndTime <= numTime AND numTime <= dtmPMStartTime THEN
            numResultTime   := dtmPMStartTime;
        ELSIF dtmPMEndTime <= numTime THEN
            --���ғ��� ���擾   ------FncWorkDayCalc-------
            blnRet := FNCWORKDAYCALC(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,pvc2ItemCd,
                            dtmActiveDate, 1, pblnStartForwardFlg, dtmActiveDate);
            IF blnRet = FALSE THEN
                RAISE excWORK_DAY_CALC_ERR;
            END IF;
            numResultTime   := dtmAMStartTime;
        ELSE
            numResultTime   := dtmTruncTime;
        END IF;

    ELSE
        LOOP
            /* �Ώێ������ߑO�̏ꍇ */
            IF numTime <= dtmAMEndTime THEN

                /* �Ώێ������A�Ǝ����O�̏ꍇ */
                IF numTime <= dtmAMStartTime THEN
                    numTime := dtmAMStartTime;
                END IF;
                
                /* �v�Z��̎������ߑO�ŏI���ꍇ */
                IF numTime + numDiffTime <= dtmAMEndTime THEN
                    numResultTime   := numTime + numDiffTime;
                    EXIT;

                /* �v�Z��̎������ߑO�ŏI���Ȃ��ꍇ */
                ELSE
                    /* �ߑO�̍�Ǝ��Ԃ��������獷�������Čߌ�̍�Ǝ��Ԃ��v�Z���� */
                    numDiffTime := numDiffTime - (dtmAMEndTime - numTime);
                    numTime     := dtmPMStartTime;

                    /* �v�Z��̎������ߌ�ŏI���ꍇ */
                    IF numTime + numDiffTime <= dtmPMEndTime THEN
                        numResultTime   := numTime + numDiffTime;
                        EXIT;

                    /* �{�����ɍ�Ƃ��I���Ȃ��ꍇ */
                    ELSE
                        --���ғ��� ���擾   ------FncWorkDayCalc-------
                        blnRet := FNCWORKDAYCALC(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                     pvc2UserId, pvc2BusinessName, pvc2PlantCd,pvc2ItemCd,
                                     dtmActiveDate, 1, pblnStartForwardFlg, dtmActiveDate);
                        IF blnRet = FALSE THEN
                            RAISE excWORK_DAY_CALC_ERR;
                        END IF;

                        /* �ߌ�̍�Ǝ��Ԃ��������獷�������ė����̍�Ǝ��Ԃ��v�Z���� */
                        numDiffTime := numDiffTime - (dtmPMEndTime - numTime);
                        numTime     := dtmAMStartTime;
                    END IF;
                END IF;

            /* �Ώێ������ߌ�̏ꍇ */
            ELSE

                /* �Ώێ��������x�݂̏ꍇ */
                IF numTime <= dtmPMStartTime THEN
                    numTime := dtmPMStartTime;
                END IF;

                /* �Ώێ������A�Ǝ��Ԍ�̏ꍇ */
                IF numTime >= dtmPMEndTime THEN
                    numTime := dtmPMEndTime;
                END IF;

                /* �v�Z��̎������ߌ�ŏI���ꍇ */
                IF numTime + numDiffTime <= dtmPMEndTime THEN
                    numResultTime   := numTime + numDiffTime;
                    EXIT;

                /* �{�����ɍ�Ƃ��I���Ȃ��ꍇ */
                ELSE
                    --���ғ��� ���擾   ------FncWorkDayCalc-------
                    blnRet := FNCWORKDAYCALC(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,pvc2ItemCd,
                                    dtmActiveDate, 1, pblnStartForwardFlg, dtmActiveDate);
                    IF blnRet = FALSE THEN
                        RAISE excWORK_DAY_CALC_ERR;
                    END IF;

                    /* �ߌ�̍�Ǝ��Ԃ��������獷�������ė����̍�Ǝ��Ԃ��v�Z���� */
                    numDiffTime := numDiffTime - (dtmPMEndTime - numTime);
                    numTime     := dtmAMStartTime;
                END IF;

            END IF;
            EXIT WHEN numDiffTime <= 0;
        END LOOP;
    END IF;
    
    /*���[�h�^�C�����Q�S�̔{���ꍇ*/
    IF numResultTime = 1440 THEN
        numResultTime := 0;
        --���ғ��� ���擾   ------FncWorkDayCalc-------
        blnRet := FNCWORKDAYCALC(pFileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,pvc2ItemCd,
                        dtmActiveDate, 1, pblnStartForwardFlg, dtmActiveDate);
        IF blnRet = FALSE THEN
            RAISE excWORK_DAY_CALC_ERR;
        END IF;
    END IF;
    
    pdtmActiveDate := TO_DATE(TO_CHAR(dtmActiveDate,'YYYYMMDD') || TO_CHAR(TRUNC(numResultTime/60),'00') || TO_CHAR(MOD(numResultTime,60),'00'),'YYYYMMDDHH24MI');

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
