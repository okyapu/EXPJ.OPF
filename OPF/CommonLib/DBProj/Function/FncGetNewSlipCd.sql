CREATE OR REPLACE FUNCTION FNCGETNEWSLIPCD(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2004.06.09 ����
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �`�[�ԍ��̔�
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
' �@�\����  : �o�ד`�[�̓`�[�ԍ����̔Ԃ���B
'
' ���l      : �`�[�ԍ��ɓo�^����Ă���ԍ��Ƃ̃`�F�b�N���s���A���o�^�̔ԍ���Ԃ��B
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
    CURSOR curSYS_SLIP_CD_CTRL IS
    SELECT  SLIP_CD
    FROM    SYS_SLIP_CD_CTRL
    WHERE   PLANT_CD = pvc2PlantCd
    FOR UPDATE;

-- ROWTYPE �̐錾
    RtpSYS_SLIP_CD_CTRL     curSYS_SLIP_CD_CTRL%ROWTYPE;

-- Add Start 20140122 lt
    CURSOR curSYS_INSTALL_OPTIONS IS
    SELECT INSTALL_FLG
      FROM SYS_INSTALL_OPTIONS
     WHERE OPTION_ID = 'JA*'
       AND INSTALL_FLG = '1';

-- ROWTYPE �̐錾
    RtpSYS_INSTALL_OPTIONS     curSYS_INSTALL_OPTIONS%ROWTYPE;
    
-- Add End 20140122 lt

/* �萔�̐錾 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncGetNewSlipCd';                          --�o�k�^�r�p�k��
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
    -- Add Start 20140122 lt
    vc2Sql                  VARCHAR2(4096);      --���I�r�p�k�p
    lintCur                 INTEGER;             --�J�[�\���h�c
    lintRet                 INTEGER;             --�֐��߂�l
    -- Add End 20140122 lt
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
    SELECT COUNT(*) INTO intCount2 FROM SYS_SLIP_CD_CTRL
    WHERE PLANT_CD = pvc2PlantCd;

    /* �̔ԃ��R�[�h�������ꍇ�A���� */
    IF intCount2 <= 0 THEN
        vc2SequenceNo := NUMBER_MAX;
        numNowLength := NUMBER_MAX_LENGTH;
        insert into SYS_SLIP_CD_CTRL (
                    PLANT_CD
                   ,SLIP_CD
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
                   ,SYSDATE
                   ,pvc2UserId
                   ,pvc2BusinessName
                   ,SYSDATE
                   ,pvc2UserId
                   ,pvc2BusinessName
                   ,0
                    );
    END IF;

    OPEN curSYS_SLIP_CD_CTRL;
    FETCH curSYS_SLIP_CD_CTRL INTO RtpSYS_SLIP_CD_CTRL;
    vc2SequenceNo := RtpSYS_SLIP_CD_CTRL.SLIP_CD;
    numNowLength := LENGTH(vc2SequenceNo);
    /*�̔Ԃ̃J�E���g�A�b�v*/
    IF vc2SequenceNo = SUBSTRB(NUMBER_MAX, numNowLength * (-1), numNowLength) THEN
        vc2SequenceNo := SUBSTRB(NUMBER_MIN, numNowLength * (-1), numNowLength);
    ELSE
        numSave := TO_NUMBER(vc2SequenceNo);
        numSave := numSave + 1;
        vc2SequenceNo := LPAD(TO_CHAR(numSave), numNowLength, '0');
    END IF;

    -- Add Start 20140122 lt
    OPEN curSYS_INSTALL_OPTIONS;
    FETCH curSYS_INSTALL_OPTIONS INTO RtpSYS_INSTALL_OPTIONS;
    CLOSE curSYS_INSTALL_OPTIONS;
    -- Add End 20140122 lt

    /*�o�ד`�[�f�[�^�̑��݃`�F�b�N*/
    LOOP

        /* �H�ꖈ�̔ԍ��̌n�֕ϊ� */
        vc2SequenceNoPlant := pvc2PlantCd || vc2SequenceNo;

        /* �`�F�b�N���s */
        SELECT COUNT(*) INTO intCount FROM T_SHIP_SLIP
            WHERE SLIP_CD = vc2SequenceNoPlant;

        -- Add Start 20140122 lt
        IF intCount <= 0 THEN
           lintCur := DBMS_SQL.OPEN_CURSOR;
           vc2Sql := 'SELECT COUNT(*) FROM ';
           IF RtpSYS_INSTALL_OPTIONS.INSTALL_FLG IS NULL THEN
               -- �������
               vc2Sql := vc2Sql || 'T_SALES';
           ELSE
               -- ���������
               vc2Sql := vc2Sql || 'T_SALES_TEMP';
           END IF;
           vc2Sql := vc2Sql || ' WHERE SLIP_CD = ''' || vc2SequenceNoPlant || '''' ;
           
           DBMS_SQL.PARSE(lintCur,vc2Sql,DBMS_SQL.NATIVE);
           DBMS_SQL.DEFINE_COLUMN(lintCur, 1,intCount);
           lintRet := DBMS_SQL.EXECUTE(lintCur);
           
           IF DBMS_SQL.FETCH_ROWS(lintCur) > 0 THEN
              DBMS_SQL.COLUMN_VALUE(lintCur, 1, intCount);
           END IF;
           
           DBMS_SQL.CLOSE_CURSOR(lintCur);
           
        END IF;
        -- Add End 20140122 lt
        /* ���݂��Ȃ��Ƃ��̔Ԃ�L�� */
        IF intCount <= 0 THEN
            /*�`�[�ԍ��̔ԃe�[�u�����X�V����*/
            UPDATE SYS_SLIP_CD_CTRL SET
                    SLIP_CD = vc2SequenceNo
                  , UPDATED_DATE   = SYSDATE
                  , UPDATED_BY     = pvc2UserId
                  , UPDATED_PRG_NM = pvc2BusinessName
                  , MODIFY_COUNT   = MODIFY_COUNT+1
            WHERE CURRENT OF curSYS_SLIP_CD_CTRL;
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
    CLOSE curSYS_SLIP_CD_CTRL;

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