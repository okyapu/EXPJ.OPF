CREATE OR REPLACE FUNCTION FNCGETNEWJOBODRCD(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2003.08.10 ����
' 2003.08.22 AUTONOMOUS_TRANSACTION��
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : ���ԍ̔�
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
'             pvc2ResultData       - (o)��������
'
' �@�\����  : ���Ԃ̍̔Ԃ��s���B
'           : �̔Ԃ͍H�ꖈ�ɍs���A�v���t�B�b�N�X�{�H��R�[�h�{�A�Ԃ̌`���Ō�������(pvc2ResultData)�ɕԂ��B
'
' ���l      : ���Ԍv��ɓo�^����Ă���ԍ��Ƃ̃`�F�b�N���s���A���o�^�̔ԍ���Ԃ��B
'           : �̔Ԍ����͐���e�[�u���ɓo�^����Ă���̔ԍϔԍ����ƂȂ邪�A
'           : ���o�^���i����̔ԁj��PKGCOMPARAM.JOB_ODR_CD_LENGTH�Ƃ���B
'
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
   ,pvc2ResultData      OUT VARCHAR2            --��������
) RETURN BOOLEAN
IS
PRAGMA AUTONOMOUS_TRANSACTION;

-- �J�[�\���̐錾
    CURSOR curSYS_JOB_ODR_CD_CTRL IS
    SELECT   JOB_OD_CD
            ,JOB_OD_CD_PREFIX
    FROM    SYS_JOB_ODR_CD_CTRL
    WHERE   PLANT_CD = pvc2PlantCd
    FOR UPDATE;

-- ROWTYPE �̐錾
    RtpSYS_JOB_ODR_CD_CTRL     curSYS_JOB_ODR_CD_CTRL%ROWTYPE;

/* �萔�̐錾 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncGetNewJobOdrCd';            --�o�k�^�r�p�k��
    NUMBER_MAX              VARCHAR2(92)  := PKGCOMPARAM.JOB_ODR_CD_MAX;     --�擾�J�E���g�A�b�v�p
    NUMBER_MIN              VARCHAR2(92)  := PKGCOMPARAM.JOB_ODR_CD_MIN;     --�擾�J�E���g�A�b�v�p
    NUMBER_MAX_LENGTH       NUMBER        := PKGCOMPARAM.JOB_ODR_CD_LENGTH;  --�̔ԍő包��
    PLANT_CD_LENGTH         NUMBER        := PKGCOMPARAM.PLANT_CD_LENGTH;    --�H��R�[�h����
    LOGMSG_START            VARCHAR2(20)   := 'Start';                        --���O�p���\�b�h�J�n�錾
    LOGMSG_END              VARCHAR2(12)   := 'End';                          --���O�p���\�b�h�I���錾
    PREFIX_DEFAULT          VARCHAR2(12)   := 'S';                            --�v���t�B�b�N�X�f�t�H���g

/* �ϐ��̐錾 */
    blnRet                  BOOLEAN;             --�ԋp�l
    vc2SequenceNo           VARCHAR2(80);        --�̔ԍςݎ��ʔԍ�
    vc2Prefix               VARCHAR2(12);         --�ړ���
    vc2SequenceNoPlant      VARCHAR2(100);        --�H��R�[�h�{���ʔԍ�
    numNowLength            NUMBER(2);           --�̔Ԍ���

/*�v�Z�p���[�N*/
    numSave                 NUMBER(25);
    intCount                INTEGER(11);
    intCount2               INTEGER(11);

/*�G���[�p���[�N*/
    vc2TmpMessage           VARCHAR2(1024);       --�k�n�f���b�Z�[�W

BEGIN

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* �̔ԃ��R�[�h���݊m�F */
    SELECT COUNT(*) INTO intCount2 FROM SYS_JOB_ODR_CD_CTRL
    WHERE PLANT_CD = pvc2PlantCd;

    /* �̔ԃ��R�[�h�������ꍇ�A���� */
    IF intCount2 <= 0 THEN
        vc2SequenceNo := NUMBER_MAX;
        numNowLength := NUMBER_MAX_LENGTH;
        insert into SYS_JOB_ODR_CD_CTRL (
                    PLANT_CD
                   ,JOB_OD_CD
                   ,JOB_OD_CD_PREFIX
                   ,CREATED_DATE
                   ,CREATED_BY
                   ,CREATED_PRG_NM
                   ,UPDATED_DATE
                   ,UPDATED_BY
                   ,UPDATED_PRG_NM
                   ,MODIFY_COUNT
                    )values(
                    pvc2PlantCd
                   ,vc2SequenceNo
                   ,PREFIX_DEFAULT
                   ,SYSDATE
                   ,pvc2UserId
                   ,pvc2BusinessName
                   ,SYSDATE
                   ,pvc2UserId
                   ,pvc2BusinessName
                   ,0
                    );
    END IF;

    OPEN curSYS_JOB_ODR_CD_CTRL;
    FETCH curSYS_JOB_ODR_CD_CTRL INTO RtpSYS_JOB_ODR_CD_CTRL;
    vc2SequenceNo := RtpSYS_JOB_ODR_CD_CTRL.JOB_OD_CD;
    vc2Prefix     := RtpSYS_JOB_ODR_CD_CTRL.JOB_OD_CD_PREFIX;
    numNowLength := LENGTH(vc2SequenceNo);
    /*�̔Ԃ̃J�E���g�A�b�v*/
    IF vc2SequenceNo = SUBSTRB(NUMBER_MAX, numNowLength * (-1), numNowLength) THEN
        vc2SequenceNo := SUBSTRB(NUMBER_MIN, numNowLength * (-1), numNowLength);
    ELSE
        numSave := TO_NUMBER(vc2SequenceNo);
        numSave := numSave + 1;
        vc2SequenceNo := LPAD(TO_CHAR(numSave), numNowLength, '0');
    END IF;

    /*���Ԍv��̑��݃`�F�b�N*/
    LOOP

        /* �H�ꖈ�̔ԍ��̌n�֕ϊ� */
        vc2SequenceNoPlant := vc2Prefix || LPAD(pvc2PlantCd, PLANT_CD_LENGTH, '-') || vc2SequenceNo;

        /* �`�F�b�N���s */
        SELECT COUNT(*) INTO intCount FROM T_JOB_ODR
            WHERE JOB_ODR_CD = vc2SequenceNoPlant;

        /* ���݂��Ȃ��Ƃ��̔Ԃ�L�� */
        IF intCount <= 0 THEN
            /*���ԍ̔ԃe�[�u�����X�V����*/
            UPDATE SYS_JOB_ODR_CD_CTRL SET
                    JOB_OD_CD = vc2SequenceNo
                  , UPDATED_DATE   = SYSDATE
                  , UPDATED_BY     = pvc2UserId
                  , UPDATED_PRG_NM = pvc2BusinessName
                  , MODIFY_COUNT   = MODIFY_COUNT+1
            WHERE CURRENT OF curSYS_JOB_ODR_CD_CTRL;
            /*�����I��*/
            EXIT;
        /* ���݂���Ƃ��̔Ԃ������� */
        ELSE
            /*�̔Ԃ̃J�E���g�A�b�v*/
            IF vc2SequenceNo = SUBSTRB(NUMBER_MAX, numNowLength * (-1), numNowLength) THEN
                vc2SequenceNo := SUBSTRB(NUMBER_MIN, numNowLength * (-1), numNowLength);
            ELSE
                numSave := TO_NUMBER(vc2SequenceNo);
                numSave := numSave + 1;
                vc2SequenceNo := LPAD(TO_CHAR(numSave), numNowLength, '0');
            END IF;
        END IF;

    END LOOP;
    CLOSE curSYS_JOB_ODR_CD_CTRL;

    pvc2ResultData := vc2SequenceNoPlant;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    COMMIT;
    RETURN TRUE;



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN   --���̑��̃G���[
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        ROLLBACK;
        RETURN FALSE;
END;
/