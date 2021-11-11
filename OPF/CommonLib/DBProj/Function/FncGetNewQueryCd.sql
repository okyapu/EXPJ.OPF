CREATE OR REPLACE FUNCTION FNCGETNEWQUERYCD(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2004.01.21 ����
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �N�G���ԍ��̔�
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
' �@�\����  : �N�G���ԍ��̍̔Ԃ��s���B
'           : �̔Ԃ͍H�ꖈ�ɍs���A�H��R�[�h�{�A�Ԃ̌`���Ō�������(pvc2ResultData)�ɕԂ��B
'
' ���l      : �N�G�����ɓo�^����Ă���ԍ��Ƃ̃`�F�b�N���s���A���o�^�̔ԍ���Ԃ��B
'           : �̔Ԍ����͐���e�[�u���ɓo�^����Ă���̔ԍϔԍ����ƂȂ邪�A
'           : ���o�^���i����̔ԁj��PKGCOMPARAM.SEQUENCE_LENGTH�Ƃ���B
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
    CURSOR curSYS_QUERY_CD_CTRL IS
    SELECT  QUERY_CD
    FROM    SYS_QUERY_CD_CTRL
    WHERE   CTRL_CD = 'SYSTEM'
    FOR UPDATE;

-- ROWTYPE �̐錾
    RtpSYS_QUERY_CD_CTRL     curSYS_QUERY_CD_CTRL%ROWTYPE;

/* �萔�̐錾 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncGetNewQueryCd';                          --�o�k�^�r�p�k��
    NUMBER_MAX              VARCHAR2(92)  := PKGCOMPARAM.NUMBER_MAX;       --�擾�J�E���g�A�b�v�p
    NUMBER_MIN              VARCHAR2(92)  := PKGCOMPARAM.NUMBER_MIN;       --�擾�J�E���g�A�b�v�p
    NUMBER_MAX_LENGTH       NUMBER        := PKGCOMPARAM.SEQUENCE_LENGTH;  --�̔ԍő包��
    PLANT_CD_LENGTH         NUMBER        := PKGCOMPARAM.PLANT_CD_LENGTH;  --�H��R�[�h����
    LOGMSG_START            VARCHAR2(20)   := 'Start';                      --���O�p���\�b�h�J�n�錾
    LOGMSG_END              VARCHAR2(12)   := 'End';                        --���O�p���\�b�h�I���錾

/* �ϐ��̐錾 */
    blnRet                  BOOLEAN;             --�ԋp�l
    vc2SequenceNo           VARCHAR2(92);        --�̔ԍςݎ��ʔԍ�
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
    SELECT COUNT(*) INTO intCount2 FROM SYS_QUERY_CD_CTRL
    WHERE CTRL_CD = 'SYSTEM';

    /* �̔ԃ��R�[�h�������ꍇ�A���� */
    IF intCount2 <= 0 THEN
        vc2SequenceNo := NUMBER_MAX;
        numNowLength := NUMBER_MAX_LENGTH;
        insert into SYS_QUERY_CD_CTRL (
                    CTRL_CD
                   ,QUERY_CD
                   ,CREATED_DATE
                   ,CREATED_BY
                   ,CREATED_PRG_NM
                   ,UPDATED_DATE
                   ,UPDATED_BY
                   ,UPDATED_PRG_NM
                   ,MODIFY_COUNT
                    )values(
                    'SYSTEM'
                   ,vc2SequenceNo
                   ,SYSDATE
                   ,pvc2UserId
                   ,pvc2BusinessName
                   ,SYSDATE
                   ,pvc2UserId
                   ,pvc2BusinessName
                   ,0
                    );
    END IF;

    OPEN curSYS_QUERY_CD_CTRL;
    FETCH curSYS_QUERY_CD_CTRL INTO RtpSYS_QUERY_CD_CTRL;
    vc2SequenceNo := RtpSYS_QUERY_CD_CTRL.QUERY_CD;
    numNowLength := LENGTH(vc2SequenceNo);
    /*�̔Ԃ̃J�E���g�A�b�v*/
    IF vc2SequenceNo = SUBSTRB(NUMBER_MAX, numNowLength * (-1), numNowLength) THEN
        vc2SequenceNo := SUBSTRB(NUMBER_MIN, numNowLength * (-1), numNowLength);
    ELSE
        numSave := TO_NUMBER(vc2SequenceNo);
        numSave := numSave + 1;
        vc2SequenceNo := LPAD(TO_CHAR(numSave), numNowLength, '0');
    END IF;

    /*�N�G�����̑��݃`�F�b�N*/
    LOOP

        /* �H�ꖈ�̔ԍ��̌n�֕ϊ� */
        vc2SequenceNoPlant := vc2SequenceNo;

        /* �`�F�b�N���s */
        SELECT COUNT(*) INTO intCount FROM T_QUERY_INFO
            WHERE QUERY_CD = vc2SequenceNoPlant;

        /* ���݂��Ȃ��Ƃ��̔Ԃ�L�� */
        IF intCount <= 0 THEN
            /*�N�G���ԍ��̔ԃe�[�u�����X�V����*/
            UPDATE SYS_QUERY_CD_CTRL SET
                    QUERY_CD = vc2SequenceNo
                  , UPDATED_DATE   = SYSDATE
                  , UPDATED_BY     = pvc2UserId
                  , UPDATED_PRG_NM = pvc2BusinessName
                  , MODIFY_COUNT   = MODIFY_COUNT+1
            WHERE CURRENT OF curSYS_QUERY_CD_CTRL;
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
    CLOSE curSYS_QUERY_CD_CTRL;

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
