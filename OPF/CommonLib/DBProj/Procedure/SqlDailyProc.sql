CREATE OR REPLACE PROCEDURE SQLDAILYPROC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.08.06 ����
' 2003.09.21 DBMS_OUTPUT�̃R�����g��
' 2003.10.01 �S�H��Ή��p�A�J�n�I�����b�Z�[�W�ɍH��R�[�h�o��
' 2003.12.09 �����_�R��i�ڈꗗ ���݃`�F�b�N(V_ODR_POINT_OUT_ITEM2)�̏����C��
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : ��������
'
' ������    : 
'             pvc2LogMode                - (i)�k�n�f���[�h
'             pvc2OutputMode             - (i)�o�̓��[�h
'             pvc2OutputPath             - (i)�o�̓t�@�C���p�X
'             pvc2OutputName             - (i)�o�̓t�@�C����
'             pvc2UserId                 - (i)���[�U�h�c
'             pvc2BusinessName           - (i)�Ɩ���
'             pvc2PlantCd                - (i)�H��R�[�h
'             pvc2FinalDailyProcExecDate - (i)���������Ώۓ�
'             pvc2BusinessOprDate        - (i)���Ɩ��^�p��
'
' �@�\����  : �����̓��o�ɂ̒��������s���A�Ɩ��^�p���t�𗂉ғ����ɍX�V����B
'             ���A�����s���E�����_�R��`�F�b�N���s���A���[�����o�͂���B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath              IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName              IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId                  IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2    --�H��R�[�h
   ,pvc2FinalDailyProcExecDate  IN  VARCHAR2    --���������Ώۓ�
   ,pvc2BusinessOprDate         IN  VARCHAR2    --���Ɩ��^�p��
)
IS


/* �J�[�\���̐錾 */

/* ROWTYPE �̐錾 */

/* �萔�̐錾 */
    MY_SQL_NAME                         VARCHAR2(48)  := 'SQLDAILYPROC';
    ISSUERSV_NOTRELEASED                NUMBER(1)     := 1;         --�o�ɕۗ��e�[�u�� �o�ɕۗ������敪(1:������ �ۗ���)
    INV_FLG_NOEXECUTE                   NUMBER(1)     := 0;         --�I������ �I���t���O(0:��)
    INV_FLG_EXECUTE                     NUMBER(1)     := 1;         --�I������ �I���t���O(1:�I����)
    CTRL_CD_DEFAULT                     VARCHAR2(24)   := 'SYSTEM';  --�R���g���[���n�e�[�u����PrimaryKey�̒l

/* EXCEPTION �̐錾 */
    excFNC_INSPEC_ACPT_IF_ERR           EXCEPTION;                  --�u�������I/F�v�G���[

/* MESSAGE �̐錾 */
    APS_COM_BATCH_START                 VARCHAR2(28)     := 'ZZ09001';     --�o�b�`�������J�n���܂���
    APS_COM_BATCH_END                   VARCHAR2(28)     := 'ZZ09002';     --�o�b�`�������I�����܂���
    APS_CEDAILYPROCALARM_EXT_ALM        VARCHAR2(28)     := 'AK51921';     --���������ŃA���[�����o�͂���܂���

/* LOG �̐錾 */
    LOGMSG_START_PGNM_DAILYPROC         VARCHAR2(72)  := '<< ���������J�n >>';
    LOGMSG_END_PGNM_DAILYPROC           VARCHAR2(72)  := '<< ���������I�� >>';
    LOGMSG_START                        VARCHAR2(20)   := 'Start';   --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';     --���O�p���\�b�h�I���錾
    LOGMSG_FINALDAILYPROCEXECDATE       VARCHAR2(64)  := '���������Ώۓ��F';
    LOGMSG_BUSINESSOPRDATE              VARCHAR2(56)  := '���Ɩ��^�p���F';
    LOGMSG_BRAKETS                      VARCHAR2(4)   := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)   := ']';
    LOGMSG_UNALCDODLST                  VARCHAR2(272)  := '(SBM0346)�w�����s���f�[�^�����݂��܂��B�K�v�ɉ����Ĉ����������s���ĉ������B�x';
    LOGMSG_ODRPTOUTITEMLST              VARCHAR2(384)  := '(SBM0347)�w�����_����i�ڂ����݂��܂��B�����_����i�ڈꗗ�Ŋm�F���A�K�v�ɉ����Ĕ����������s���ĉ������B�x';
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    LOGMSG_PLANT_CD                     VARCHAR2(48)  := '�H��R�[�h�F';

/* �ϐ��̐錾 SQL */
    lngCount                NUMBER;         --�����J�E���g�p
    numInvFlg               NUMBER(1);      --����t���O
    vc2CTRL_CD              VARCHAR2(100);   --�r�x�r�R���g���[���R�[�h

/* �ϐ��̐錾 WORK */
    UTL_FileHandle          UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
    vc2Comment              VARCHAR2(1024);      --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);      --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    NumTransactionCount     NUMBER(10);         --��������
    blnRet                  BOOLEAN;            --�ԋp�l

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    /* LogFile �� OPEN */
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* �J�n���b�Z�[�W�̍쐬 */
    vc2Comment := SUBSTR('(SBM0345)' || LOGMSG_START_PGNM_DAILYPROC ||
                         LOGMSG_PLANT_CD || '[ ' || pvc2PlantCd || ' ]',
                         1,256);

    /* �J�n���b�Z�[�W�̏o�� */
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, vc2Comment);
    COMMIT;

--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* �ۊǋ�ʕi�ڍ݌�.�i�ڕʑO�����݌ɐ� �̍X�V */
    UPDATE T_ITEM_STOCK SET
            PRVS_DAYEND_STOCK_QTY = STOCK_ON_HAND_QTY   --�i�ڕʎ莝�݌ɐ� ��ݒ�
           ,UPDATED_DATE = SYSDATE                        --�X�V��
           ,UPDATED_BY = pvc2UserId                       --�X�V��
           ,UPDATED_PRG_NM = MY_SQL_NAME                  --�X�V�v���O������
           ,MODIFY_COUNT = (MODIFY_COUNT + 1)             --�X�V��
        WHERE PRVS_DAYEND_STOCK_QTY <> STOCK_ON_HAND_QTY
          AND PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* �ۊǋ�ʐ��ԍ݌�.���ԕʑO�����݌ɐ� �̍X�V */
    UPDATE T_JOB_ODR_CD_STOCK SET
            PRVS_DAYEND_STOCK_QTY = STOCK_ON_HAND_QTY   --���ԕʎ莝�݌ɐ� ��ݒ�
           ,UPDATED_DATE = SYSDATE                        --�X�V��
           ,UPDATED_BY = pvc2UserId                       --�X�V��
           ,UPDATED_PRG_NM = MY_SQL_NAME                  --�X�V�v���O������
           ,MODIFY_COUNT = (MODIFY_COUNT + 1)             --�X�V��
        WHERE PRVS_DAYEND_STOCK_QTY <> STOCK_ON_HAND_QTY
          AND PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* �����s���ꗗ ���݃`�F�b�N */

    SELECT COUNT(*) INTO lngCount FROM V_UNALCD_OD_LST
        WHERE PLANT_CD = pvc2PlantCd;
    /* �f�[�^�L�� */
    IF lngCount > 0 THEN
--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        /* �A���[�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_CEDAILYPROCALARM_EXT_ALM, LOGMSG_UNALCDODLST);

    END IF;

--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* �����_�R��i�ڈꗗ ���݃`�F�b�N 2001.07.03�`�F�b�N����r���[��ύX */
/* 20031209 PLANT_CD �̏����ύX */
--  SELECT COUNT(*) INTO lngCount FROM V_ODR_POINT_OUT_ITEM2
--      WHERE OD_PLANT_CD = pvc2PlantCd;
    SELECT COUNT(*) INTO lngCount FROM V_ODR_POINT_OUT_ITEM2
        WHERE ( ITEM_PLANT_CD = pvc2PlantCd and OD_PLANT_CD = pvc2PlantCd )
           OR ( ITEM_PLANT_CD = pvc2PlantCd and OD_PLANT_CD is null )
           OR ( ITEM_PLANT_CD is null and OD_PLANT_CD = pvc2PlantCd )
           OR ( ITEM_PLANT_CD is null and OD_PLANT_CD is null);
    /* �f�[�^�L�� */
    IF lngCount > 0 THEN
--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        /* �A���[�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_CEDAILYPROCALARM_EXT_ALM, LOGMSG_ODRPTOUTITEMLST);
    END IF;

--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* ���t����.�Ɩ��^�p���E���t����.�v����ɗ��Ɩ��^�p����ݒ� */
    UPDATE SYS_DATE_CTRL SET
            BUSINESS_OPR_DATE = TO_DATE(pvc2BusinessOprDate || ' 00:00:00', 'yyyy/mm/dd hh24:mi:ss')
           ,STOCK_CRITERION_DATE = TO_DATE(pvc2BusinessOprDate || ' 00:00:00', 'yyyy/mm/dd hh24:mi:ss')
           ,UPDATED_DATE = SYSDATE                        --�X�V��
           ,UPDATED_BY = pvc2UserId                       --�X�V��
           ,UPDATED_PRG_NM = MY_SQL_NAME                  --�X�V�v���O������
           ,MODIFY_COUNT = (MODIFY_COUNT + 1)             --�X�V��
        WHERE PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '���������ʉ� 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* ������������ �̑��݃`�F�b�N */
    SELECT PLANT_CD INTO vc2CTRL_CD FROM SYS_DAILY_PROC_CTRL WHERE PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '���������ʉ� 00150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* ������������.�ŏI�����������s���ɓ��������Ώۓ���ݒ� */
    UPDATE SYS_DAILY_PROC_CTRL SET
            FINAL_DAILY_PROC_EXEC_DATE = TO_DATE(pvc2FinalDailyProcExecDate || ' 00:00:00', 'yyyy/mm/dd hh24:mi:ss')
           ,UPDATED_DATE = SYSDATE                        --�X�V��
           ,UPDATED_BY = pvc2UserId                       --�X�V��
           ,UPDATED_PRG_NM = MY_SQL_NAME                  --�X�V�v���O������
           ,MODIFY_COUNT = (MODIFY_COUNT + 1)             --�X�V��
        WHERE PLANT_CD = pvc2PlantCd;

    COMMIT;

    /* �I�����b�Z�[�W�̍쐬 */
    vc2Comment := SUBSTR('(SBM0348)' || LOGMSG_END_PGNM_DAILYPROC ||
                         LOGMSG_BUSINESSOPRDATE || '[ ' || pvc2BusinessOprDate || ' ]' ||
                         LOGMSG_FINALDAILYPROCEXECDATE || '[ ' || pvc2FinalDailyProcExecDate || ' ]',
                         1,256);

    /* �I�����b�Z�[�W�̏o�� */
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
    COMMIT;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    /* LogFile �� CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excFNC_INSPEC_ACPT_IF_ERR  THEN         --�u�������I/F�v�G���[
--DBMS_OUTPUT.PUT_LINE('excFNC_INSPEC_ACPT_IF_ERR');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0349)' || LOGMSG_END_PGNM_DAILYPROC || LOGMSG_ERR || '�F�������I/F',
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;

    WHEN OTHERS THEN                             --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0350)' || LOGMSG_END_PGNM_DAILYPROC || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
END;
/