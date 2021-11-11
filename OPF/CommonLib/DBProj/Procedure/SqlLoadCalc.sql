CREATE OR REPLACE PROCEDURE SqlLoadCalc(
/*------------------------------------------------------------------------------
'
' SQL_NAME  : SqlLoadCalc.Sql
' version   : 1.00.00
'
' �C������
' 2003.09.30 ����
' 2004.02.24 UPD BY CNES �J�����_�擾���A�V�X�e�����t�ł͂Ȃ��Ɩ��^�p���̑O��180���Ƃ���悤�C��
'                        �J�����_�s���G���[���A���b�Z�[�W�ǉ�
' 2005.10.24 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : ���׃V�~�����[�V����
'
' ������    ��MetamorBase����
'           : pvc2LogMode         - (i)�k�n�f���[�h
'                 pvc2OutputMode      - (i)�o�̓��[�h
'                 pvc2OutputPath      - (i)�o�̓t�@�C���p�X
'                 pvc2OutputName      - (i)�o�̓t�@�C����
'                 pvc2UserId          - (i)���[�U�h�c
'                 pvc2BusinessName    - (i)�Ɩ���
'             pvc2PlantCd         - (i)�H��R�[�h
'       �����׃V�~�����[�V����
'                       : ����
'
' �߂�l        �����׃V�~�����[�V����
'                       : pnumReturn          - (o)�������ʔ���(0:����I�� 1:�ُ�I��)
'
' �@�\����  : ���׃V�~�����[�V�������s��
'
' ���l
'
------------------------------------------------------------------------------*/
     pvc2LogMode         IN VARCHAR2    -- �k�n�f���[�h
    ,pvc2OutputMode      IN VARCHAR2    -- �o�̓��[�h
    ,pvc2OutputPath      IN VARCHAR2    -- �o�̓p�X
    ,pvc2OutputName      IN VARCHAR2    -- �o�̓t�@�C����
    ,pvc2UserId          IN VARCHAR2    -- ���[�U�h�c
    ,pvc2BusinessName    IN VARCHAR2    -- �Ɩ���
    ,pvc2PlantCd         IN VARCHAR2    -- �H��R�[�h
    ,pnumReturn          OUT NUMBER    -- �������ʔ���
)
IS
    -- ��O�̐錾
    excGetPlant              EXCEPTION;    -- �H��擾�G���[
--    excGetMyCompany          EXCEPTION;    -- ���Ў擾�G���[
    excMistakeCommonParam    EXCEPTION;    -- ���ʂ̓��̓p�����[�^�ُ�
    excMistakeNativeParam    EXCEPTION;    -- �ŗL�̓��̓p�����[�^�ُ�
    excGetNewLoadCd          EXCEPTION;    -- ���׎��ʔԍ��擾�ُ�
    excGetLoadData           EXCEPTION;    -- ���׃f�[�^�擾�ُ�
    excGetResourceData       EXCEPTION;    -- �����擾�G���[
    excGetDateData           EXCEPTION;    -- ���t�擾�G���[
    excSysLoadCalcPeriod     EXCEPTION;    -- ���׌v����Ԏ擾�G���[
    excNeckProcLtZero        EXCEPTION;    -- ����H��LT�[���ȉ��G���[

    -- �萔�̐錾
    MY_SQL_NAME             VARCHAR2(128) := 'SqlLoadCalc';
    FIRST_MODIFY_COUNT      NUMBER       := 0;               -- �V�K�쐬�e�[�u���̏���̍X�V��
--    CTRL_CD_DEFAULT         VARCHAR2(24)  := 'SYSTEM';        -- �R���g���[���n�e�[�u����PrimaryKey�̒l
    LOAD_CALC_TYP_NOTRUN    VARCHAR(1)   := '0';             -- ���׌v��v�Z�敪(���ז��v�Z)
    LOAD_CALC_TYP_RUN       VARCHAR(1)   := '1';             -- ���׌v��v�Z�敪(���׌v�Z��)
    LOAD_CALC_TYP_END       VARCHAR(1)   := '9';             -- ���׌v��v�Z�敪(���׌v�Z��)
    MINIMUM_BEAM            NUMBER(2)    := 6;               -- ���חʍŏ���(�؂�グ�p)
    MINIMUM_BEAM_QTY        NUMBER(7,6)  := 0.000001;        -- ���חʍŏ����l(�؂�グ�p)
    LOAD_DATE_QTY_INIT      NUMBER(1)    := 1;               -- ���׎R�ςݓ��������l
    HOLIDAY_FLG_OFF         NUMBER(1)    := 0;               -- �x���敪(0:�ғ���)

    -- �ϐ��̐錾
    UTL_FileHandle          UTL_FILE.FILE_TYPE;    -- �t�@�C���n���h��
    blnRet                  BOOLEAN;               -- �֐��߂�l
    intRet                  INTEGER;               -- �֐��߂�l
    vc2Comment              VARCHAR2(1024);         -- ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);         -- ���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2TraceComment     VARCHAR2(1024);         -- �g���[�[�X�o�͗p�R�����g�쐬��Ɨ̈�i���̓p�����[�^�L�^�p�j
--    vc2CompanyCd      VARCHAR2(8);           -- ��ЃR�[�h
    vc2LoadCd               VARCHAR2(100);          -- ���ז��׎��ʔԍ�
    numTgtCnt               NUMBER;                -- ��������
    dtmCalcFromDate         DATE;                  -- ���׌v�Z����(From)
    dtmCalcToDate           DATE;                  -- ���׌v�Z����(To)
    dtmStartDate            DATE;                  -- ���������
    dtmOdrStartDate         DATE;                  -- ��z�����
    dtmDueDate              DATE;                  -- �����[��
    dtmWorkDueDate              DATE;              -- �[�����[�N
    numOrdQty               NUMBER(24,6);          -- �I�[�_��
    numWorkQty              NUMBER(24,6);          -- �v�Z�p���[�N�ϐ�
    numWorkLt               NUMBER(6);          -- ���[�NLT
    vc2LoadCd_Min           VARCHAR2(100);          -- ���ז��׎��ʔԍ��ő�l
    vc2LoadCd_Max           VARCHAR2(100);          -- ���ז��׎��ʔԍ��ŏ��l
    numProcStartIdleDate    NUMBER(6);             -- ����A�C�h���^�C��
    numNeckProcLt           NUMBER(6);             -- ���[�h�^�C��
    numCalNo                NUMBER(6);          -- �J�����_�ԍ�
    numCalCnt               NUMBER(6);          -- �Y���J�����_�J�E���g(����������`�����[��)
NumLoadQty NUMBER(24,6);

    -- ���׎R�ςݍ쐬�p�z��
    TYPE W_LOAD_DATA_R IS RECORD(
        dtmLoadStartDate DATE,           -- ���׎R�ς݊J�n��
        numLoadDateQty   NUMBER(5),      -- ���׎R�ςݓ���
        dtmLoadDate      DATE,           -- ���׎R�ςݓ�
        numLoadQty       NUMBER(24,6)    -- ���ח�
    );
    TYPE W_LOAD_DATA_T IS TABLE OF W_LOAD_DATA_R INDEX BY BINARY_INTEGER;
    typW_LOAD_DATA W_LOAD_DATA_T;
    -- ���׎R�ςݍ쐬�p�z��INDEX�錾
    intIND      BINARY_INTEGER;    -- INDEX
    intIND_W    BINARY_INTEGER;    -- INDEX WORK

    -- �J�����_�i�[�z��錾
    TYPE typMCAL_T IS TABLE OF DATE INDEX BY BINARY_INTEGER;
    typMCAL    typMCAL_T;
    -- �J�����_�i�[�z��INDEX�錾
    intIND_CAL      BINARY_INTEGER;    -- INDEX
    intIND_CAL_W    BINARY_INTEGER;    -- INDEX WORK

    -- MESSAGE �̐錾
    APS_COM_BATCH_START             VARCHAR2(28)    := 'ZZ09001';    -- �o�b�`�������J�n���܂���
    APS_COM_BATCH_END               VARCHAR2(28)    := 'ZZ09002';    -- �o�b�`�������I�����܂���
    APS_COM_NOTEXIST_MY_COMPANY     VARCHAR2(28)    := 'AL30003';    -- ���Ѓf�[�^�����݂��܂���
    APS_COM_MISTAKE_COMMON_PARAM    VARCHAR2(28)    := 'AL30001';    -- ���ʂ̓��̓p�����[�^������Ă��܂�
    APS_COM_NOTEXIST_PLANT          VARCHAR2(28)    := 'AL30004';    -- �H��f�[�^�����݂��܂���
    APS_COM_NOTEXIST_LOAD_PLAN      VARCHAR2(28)    := 'AL50008';    -- ���׌v�Z���ԃf�[�^�����݂��܂���
    APS_COM_ZERO_NECK_PROC_LT       VARCHAR2(28)    := 'AL60005';    -- ����H���̃��[�h�^�C�����[���ȉ��ł�
    APS_COM_NOTEXIST_RESOURCE       VARCHAR2(28)    := 'AL60006';    -- �����f�[�^�����݂��܂���
    APS_COM_NOTEXIST_LOAD_CD        VARCHAR2(28)    := 'AL60007';    -- ���ז��׎��ʔԍ����擾�ł��܂���
    APS_COM_NOTEXIST_CALENDER       VARCHAR2(28)    := 'AL60008';    -- �J�����_���s�����Ă��܂�
    APS_COM_ORACLE_ERR              VARCHAR2(28)    := 'ZZ01106';    -- �n�q�`�b�k�d�G���[

    -- LOG �̐錾
    LOGMSG_START         VARCHAR2(20)     := 'Start';         -- ���O�p���\�b�h�J�n�錾
    LOGMSG_END           VARCHAR2(12)     := 'End';           -- ���O�p���\�b�h�I���錾
    LOGMSG_ERR           VARCHAR2(32)     := '�ُ�I��';
    LOGMSG_START_PGNM    VARCHAR2(192)    := '(SBM0400)<< ���׃V�~�����[�V���������J�n >>';
    LOGMSG_END_PGNM      VARCHAR2(192)    := '<< ���׃V�~�����[�V���������I�� >>';
    LOGMSG_PARAM         VARCHAR2(64)    := '���̓p�����[�^�F';
    LOGMSG_TGTCNT        VARCHAR2(40)    := '�Ώی����F';
    LOGMSG_DONECNT       VARCHAR2(40)    := '���팏���F';
    LOGMSG_WARCNT        VARCHAR2(64)    := '���[�j���O�����F';
    LOGMSG_FATALCNT      VARCHAR2(40)    := '�ُ팏���F';
    LOGMSG_BRACKETS      VARCHAR2(4)     := '[';
    LOGMSG_BRACKETE      VARCHAR2(4)     := ']';
    LOGMSG_COMMA         VARCHAR2(4)     := ',';

    -- �J�[�\���̐錾
    -- ���׌v��
    CURSOR curT_LOAD_PLAN(
         cvc2PlantCd VARCHAR2
        ,cvc2LoadCalcTyp VARCHAR2
    )
    IS
        SELECT A.LOAD_PLAN_CD,A.PLANT_CD,A.ITEM_CD,A.JOB_ODR_CD,A.PRD_DUE_DATE,A.ODR_QTY,A.ENTRY_BY,
               NVL(B.ISSUE_LT,0) ISSUE_LT
        FROM   T_LOAD_PLAN A, 
               (
                   SELECT PLAN_ITEM_CD,ISSUE_LT FROM M_LOAD_PS WHERE PLAN_ITEM_CD = ITEM_CD
                ) B 
        WHERE  PLANT_CD = cvc2PlantCd
        AND    LOAD_CALC_TYP = cvc2LoadCalcTyp
        AND    A.ITEM_CD = B.PLAN_ITEM_CD(+)
        FOR UPDATE;

    -- ���׍\��
    CURSOR curM_LOAD_PS(
         cvc2ItemCd VARCHAR2
    )
    IS
        SELECT PLAN_ITEM_CD,ITEM_CD,LOAD_PS_CD,MRP_ODR_TYP,PLAN_ITEM_LT,ODR_LT,
        FIXED_LT,SAFETY_LT,ISSUE_LT,PS_UNIT_QTY,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE
        FROM   M_LOAD_PS 
        WHERE  PLAN_ITEM_CD = cvc2ItemCd
        ORDER BY ITEM_CD ASC,LOAD_PS_CD ASC
        ;

    -- ����H���}�X�^(����A�C�h���^�C�������A����H���R�[�h���� ���Y�}�X�^�Ƃ̌����L��)
    CURSOR curM_NECK_WS(
         cvc2PlantCd VARCHAR2
        ,cvc2ItemCd VARCHAR2
    )
    IS
        SELECT A.ITEM_CD,A.NECK_PROC_CD,A.PROC_START_IDLE_DATE,A.NECK_PROC_LT,A.LOAD_ASSIGN_TYP,A.UNIT_LOAD,
               DECODE(B.PLANT_CD,NULL,0,1) NECK_PROC_FLG
        FROM   M_NECK_WS A,M_RESOURCE B
        WHERE  A.PLANT_CD = cvc2PlantCd
        AND    A.ITEM_CD = cvc2ItemCd
        AND    A.PLANT_CD = B.PLANT_CD(+)
        AND    A.NECK_PROC_CD = B.NECK_PROC_CD(+)
        ORDER BY A.PROC_START_IDLE_DATE ASC,A.NECK_PROC_CD ASC
        ;

--2004.02.24 UPD
--    -- �J�����_�}�X�^(�V�X�e�����t�̑O��180�����̉ғ������擾����)
--    CURSOR curM_CAL(
--        cnumCalNo NUMBER,
--        cnumHolidayFlg NUMBER
--    )
--    IS
--        SELECT CAL_DATE
--            FROM   M_CAL
--            WHERE CAL_NO = cnumCalNo
--            AND   CAL_DATE >= SYSDATE - 180 
--            AND   CAL_DATE <= SYSDATE + 180 
--            AND   HOLIDAY_FLG = cnumHolidayFlg
--            ORDER BY CAL_DATE ASC
--            ;
    -- �J�����_�}�X�^(�Ɩ��^�p���̑O��180�����̉ғ������擾����)
    CURSOR curM_CAL(
        cvc2PlantCd VARCHAR2,
        cnumCalNo NUMBER,
        cnumHolidayFlg NUMBER
    )
    IS
        SELECT CAL_DATE
            FROM   M_CAL
            WHERE CAL_NO = cnumCalNo
            AND   CAL_DATE >= (SELECT BUSINESS_OPR_DATE FROM SYS_DATE_CTRL WHERE PLANT_CD = cvc2PlantCd) - 180 
            AND   CAL_DATE <= (SELECT BUSINESS_OPR_DATE FROM SYS_DATE_CTRL WHERE PLANT_CD = cvc2PlantCd) + 180 
            AND   HOLIDAY_FLG = cnumHolidayFlg
            ORDER BY CAL_DATE ASC
            ;

    -- �J�����_�t�Z
    CURSOR curM_CAL_DESC(
        cnumCalNo NUMBER,
        cdtmCAL_DATE DATE,
        cnumHolidayFlg NUMBER
    )
    IS
        SELECT CAL_DATE
            FROM   M_CAL
            WHERE CAL_NO = cnumCalNo
            AND   CAL_DATE >= cdtmCAL_DATE - 30 
            AND   CAL_DATE <= cdtmCAL_DATE
            AND   HOLIDAY_FLG = cnumHolidayFlg
            ORDER BY CAL_DATE DESC
            ;

    -- ���׎��ʔԍ��̔�(�f�[�^���b�N�p)
    CURSOR curSYS_LOAD_CD_CTRL 
    IS
        SELECT  LOAD_CD
        FROM    SYS_LOAD_CD_CTRL
        WHERE   PLANT_CD = pvc2PlantCd
        FOR UPDATE;

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

pnumReturn := 1;

vc2RunChkComment := NULL;

/*------------------------------------------------------------
'�@���O�̃I�[�v���ƊJ�n���b�Z�[�W�̏o��
-------------------------------------------------------------*/

    -- �g���[�X�o�͗p�Ƀp�����[�^���L�^
    vc2TraceComment := '<<';
    vc2TraceComment := vc2TraceComment || LOGMSG_PARAM || LOGMSG_BRACKETS || pvc2LogMode || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputMode || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputPath || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputName || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2UserId || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2BusinessName || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2PlantCd || LOGMSG_BRACKETE || '>>';
    vc2TraceComment := SUBSTR(vc2TraceComment,1,256);

    -- LogFile��OPEN
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd,pvc2OutputMode,UTL_FileHandle);

    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- �J�n���b�Z�[�W�̏o��
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, LOGMSG_START_PGNM);

    -- �R�~�b�g
    COMMIT;

/*------------------------------------------------------------
'�@���ʂ̓��̓p�����[�^���`�F�b�N����
'�@�ŗL�̓��̓p�����[�^���`�F�b�N����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- ���ʂ̓��̓p�����[�^�̃`�F�b�N
    IF  pvc2LogMode IS NULL THEN    -- �k�n�f���[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputMode IS NULL THEN -- �o�̓��[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputPath IS NULL THEN -- �o�̓p�X���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputName IS NULL THEN -- �o�̓t�@�C�������m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2UserId IS NULL THEN     -- ���[�U�h�c���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2BusinessName IS NULL THEN   -- �Ɩ������m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2PlantCd IS NULL THEN    -- �H��R�[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;

    -- �ŗL�̓��̓p�����[�^�̃`�F�b�N
    -- ����

/*------------------------------------------------------------
'�@���Ѓ}�X�^���`�F�b�N����
'�@��ЃR�[�h���擾����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--    -- ���Ѓ}�X�^�̃`�F�b�N
--    BEGIN
--        SELECT  COMPANY_CD INTO vc2CompanyCd
--            FROM   SYS_MY_COMPANY
--            WHERE  SYS_MY_COMPANY.CTRL_CD = CTRL_CD_DEFAULT;  -- SYSTEM���ݒ�
--    EXCEPTION
--        WHEN NO_DATA_FOUND THEN
--            RAISE excGetMyCompany;
--        WHEN OTHERS THEN
--            RAISE;
--    END;

/*------------------------------------------------------------
'�@�H��}�X�^���`�F�b�N����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �H��}�X�^�̃`�F�b�N
    BEGIN
        SELECT CAL_NO INTO numCalNo
            FROM   M_PLANT
            WHERE  PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetPlant;
        WHEN OTHERS THEN
            RAISE;
    END;

/*------------------------------------------------------------
'�@���׌v�Z���Ԃ���������
'�@��\�[���ꏊ���擾����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- ���׌v�Z���Ԃ̌���
    BEGIN
        SELECT CALC_FROM_DATE,CALC_TO_DATE INTO dtmCalcFromDate,dtmCalcToDate
            FROM   SYS_LOAD_CALC_PERIOD
            WHERE  PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excSysLoadCalcPeriod;
        WHEN OTHERS THEN
            RAISE;
    END;


/*------------------------------------------------------------
'�@���׌v�Z���ׂ��X�V����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00045';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    UPDATE T_LOAD_PLAN 
    SET    LOAD_CALC_TYP = LOAD_CALC_TYP_RUN
          ,UPDATED_DATE   = SYSDATE
          ,UPDATED_BY     = pvc2UserId
          ,UPDATED_PRG_NM = MY_SQL_NAME
          ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd
    AND    LOAD_CALC_TYP = LOAD_CALC_TYP_NOTRUN;

    COMMIT;

/*------------------------------------------------------------
'�@���׎��ʔԍ��擾���擾����
'�@��\�[���ꏊ���擾����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- ����̍̔Ԃ̂ݎ擾�֐����g�p����
    
    -- ���׎��ʔԍ��擾
    blnRet := FncGetNewLoadCd(UTL_FileHandle
                              ,pvc2LogMode
                              ,pvc2OutputMode
                              ,pvc2UserId
                              ,pvc2BusinessName
                              ,pvc2PlantCd
                              ,vc2LoadCd
                              );
    IF blnRet = FALSE THEN
        RAISE excGetNewLoadCd;
    END IF;

    -- �\�[�X���ŃJ�E���g�A�b�v���邽�ߍH��R�[�h���͂���
    vc2LoadCd := SUBSTR(vc2LoadCd,LENGTH(pvc2PlantCd)+1,25);
    -- ���׎��ʔԍ�MIN�l�擾
    vc2LoadCd_Min := LPAD('0',LENGTH(vc2LoadCd),'0');
    -- ���׎��ʔԍ�MAX�l�擾
    vc2LoadCd_Max := LPAD('9',LENGTH(vc2LoadCd),'9');

    -- ���׎��ʔԍ��̔ԃe�[�u�����b�N
    OPEN curSYS_LOAD_CD_CTRL;

/*------------------------------------------------------------
'�@�J�����_��z��Ɋi�[����
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    intIND_CAL := 1;

-- 2004.02.24 UPD
--    FOR curM_CAL_REC IN curM_CAL(numCalNo,HOLIDAY_FLG_OFF) LOOP
    FOR curM_CAL_REC IN curM_CAL(pvc2PlantCd,numCalNo,HOLIDAY_FLG_OFF) LOOP

        typMCAL(intIND_CAL) := curM_CAL_REC.CAL_DATE;
        intIND_CAL := intIND_CAL + 1;

    END LOOP;

/*------------------------------------------------------------
'�@���׃V�~�����[�V�������s
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- ��������������
    numTgtCnt := 0;

    -- ���׌v��J�[�\��
    FOR curT_LOAD_PLAN_REC IN curT_LOAD_PLAN(
        pvc2PlantCd,
        LOAD_CALC_TYP_RUN) LOOP

--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


        -- ���׍\���J�[�\��
        FOR curM_LOAD_PS_REC IN curM_LOAD_PS(curT_LOAD_PLAN_REC.ITEM_CD) LOOP

            -- ��z������擾(���׍\���̗L���J�n,�I�����̔�r�Ɏg�p���邽��)
            dtmOdrStartDate := NULL;
            -- �J�����_�z�񃋁[�v
            FOR i IN 1..intIND_CAL - 1 LOOP
                IF curT_LOAD_PLAN_REC.PRD_DUE_DATE <= typMCAL(i) THEN
                    IF i > (curM_LOAD_PS_REC.PLAN_ITEM_LT 
                            - curT_LOAD_PLAN_REC.ISSUE_LT) THEN
                        dtmOdrStartDate := typMCAL(i - (curM_LOAD_PS_REC.PLAN_ITEM_LT 
                                                        - curT_LOAD_PLAN_REC.ISSUE_LT));
                        EXIT;
                    ELSE
-- 2004.02.24 UPD
                        vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD�F'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD�F'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO�F'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE1�F'||TO_CHAR(curT_LOAD_PLAN_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT�F'||TO_CHAR(- (curM_LOAD_PS_REC.PLAN_ITEM_LT
                                                        - curT_LOAD_PLAN_REC.ISSUE_LT))||LOGMSG_BRACKETE
                                      ,1,256);

                        RAISE excGetDateData;
                    END IF;
                END IF;
            END LOOP;
            IF dtmOdrStartDate IS NULL THEN
-- 2004.02.24 UPD
                vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD�F'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD�F'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO�F'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE2�F'||TO_CHAR(curT_LOAD_PLAN_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT�F0'||LOGMSG_BRACKETE
                                      ,1,256);

                RAISE excGetDateData;
            END IF;


            -- ����������擾
            dtmStartDate := NULL;
            -- �J�����_�z�񃋁[�v
            FOR i IN 1..intIND_CAL - 1 LOOP
                IF curT_LOAD_PLAN_REC.PRD_DUE_DATE <= typMCAL(i) THEN
                    IF i > (curM_LOAD_PS_REC.PLAN_ITEM_LT 
                            + curM_LOAD_PS_REC.FIXED_LT
                            + curM_LOAD_PS_REC.SAFETY_LT
                            + curM_LOAD_PS_REC.ISSUE_LT
                            - curT_LOAD_PLAN_REC.ISSUE_LT) THEN
                        dtmStartDate := typMCAL(i - (curM_LOAD_PS_REC.PLAN_ITEM_LT 
                                                        + curM_LOAD_PS_REC.FIXED_LT
                                                        + curM_LOAD_PS_REC.SAFETY_LT
                                                        + curM_LOAD_PS_REC.ISSUE_LT
                                                        - curT_LOAD_PLAN_REC.ISSUE_LT));
                        EXIT;
                    ELSE
-- 2004.02.24 UPD
                        vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD�F'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD�F'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO�F'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE3�F'||TO_CHAR(curT_LOAD_PLAN_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT�F'||TO_CHAR(- (curM_LOAD_PS_REC.PLAN_ITEM_LT
                                                        + curM_LOAD_PS_REC.FIXED_LT
                                                        + curM_LOAD_PS_REC.SAFETY_LT
                                                        + curM_LOAD_PS_REC.ISSUE_LT
                                                        - curT_LOAD_PLAN_REC.ISSUE_LT))||LOGMSG_BRACKETE
                                      ,1,256);

                        RAISE excGetDateData;
                    END IF;
                END IF;
            END LOOP;
            IF dtmStartDate IS NULL THEN
-- 2004.02.24 UPD
                vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD�F'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                              LOGMSG_BRACKETS||'ITEM_CD�F'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                              LOGMSG_BRACKETS||'CAL_NO�F'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                              LOGMSG_BRACKETS||'DATE4�F'||TO_CHAR(curT_LOAD_PLAN_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                              LOGMSG_BRACKETS||'LT�F0'||LOGMSG_BRACKETE
                              ,1,256);

                RAISE excGetDateData;
            END IF;
            -- �����[���擾
            dtmDueDate := NULL;
            -- �J�����_�z�񃋁[�v
            FOR i IN 1..intIND_CAL - 1 LOOP
                IF dtmStartDate <= typMCAL(i) THEN
                    IF intIND_CAL - 1 >= i + curM_LOAD_PS_REC.FIXED_LT  + curM_LOAD_PS_REC.SAFETY_LT THEN
                        dtmDueDate := typMCAL(i + curM_LOAD_PS_REC.FIXED_LT + curM_LOAD_PS_REC.SAFETY_LT);
                        EXIT;
                    ELSE
-- 2004.02.24 UPD
                        vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD�F'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD�F'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO�F'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE5�F'||TO_CHAR(dtmStartDate,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT�F'||TO_CHAR(curM_LOAD_PS_REC.FIXED_LT  + curM_LOAD_PS_REC.SAFETY_LT + 1)||LOGMSG_BRACKETE
                                      ,1,256);

                        RAISE excGetDateData;
                    END IF;
                END IF;
            END LOOP;
            IF dtmDueDate IS NULL THEN
-- 2004.02.24 UPD
                vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD�F'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD�F'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO�F'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE6�F'||TO_CHAR(dtmStartDate,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT�F0'||LOGMSG_BRACKETE
                                      ,1,256);

                RAISE excGetDateData;
            END IF;

-- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, TO_CHAR(dtmOdrStartDate,'YYYY/MM/DD')||'*'||TO_CHAR(dtmStartDate,'YYYY/MM/DD')||'*'||TO_CHAR(dtmDueDate,'YYYY/MM/DD'));
            -- �I�[�_���v�Z
            numOrdQty := ROUND((curT_LOAD_PLAN_REC.ODR_QTY * curM_LOAD_PS_REC.PS_UNIT_QTY),MINIMUM_BEAM);
            IF numOrdQty < (curT_LOAD_PLAN_REC.ODR_QTY * curM_LOAD_PS_REC.PS_UNIT_QTY) THEN
                numOrdQty := ROUND((curT_LOAD_PLAN_REC.ODR_QTY * curM_LOAD_PS_REC.PS_UNIT_QTY),MINIMUM_BEAM)
                             + MINIMUM_BEAM_QTY;
            END IF;
--DBMS_OUTPUT.PUT_LINE(TO_CHAR(curT_LOAD_PLAN_REC.ODR_QTY)||'*'||TO_CHAR(curM_LOAD_PS_REC.PS_UNIT_QTY)||'='||TO_CHAR(numOrdQty));


--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            -- ����H���}�X�^�J�[�\��
            FOR curM_NECK_WS_REC IN curM_NECK_WS(pvc2PlantCd,curM_LOAD_PS_REC.ITEM_CD) LOOP

                --����H���̃��[�h�^�C�����[���ȉ��̏ꍇ�G���[������
                IF curM_NECK_WS_REC.NECK_PROC_LT <= 0 THEN
                    -- �I�����b�Z�[�W�̍쐬
                    vc2Comment := SUBSTR('(SBM0401)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F����H��LT�[���ȉ��G���['||
                                         LOGMSG_BRACKETS||'PLANT_CD:'||pvc2PlantCd||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'ITEM_CD:'||curM_NECK_WS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'NECK_PROC_CD:'||curM_NECK_WS_REC.NECK_PROC_CD||LOGMSG_BRACKETE,
                                         1,256);
                    RAISE excNeckProcLtZero;
                END IF;

                -- �����}�X�^�������ꍇ�G���[������
                IF curM_NECK_WS_REC.NECK_PROC_FLG = 0 THEN
                    -- �I�����b�Z�[�W�̍쐬
                    vc2Comment := SUBSTR('(SBM0402)'||LOGMSG_END_PGNM || LOGMSG_ERR || '�F�����擾�G���['||
                                         LOGMSG_BRACKETS||'PLANT_CD:'||pvc2PlantCd||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'NECK_PROC_CD:'||curM_NECK_WS_REC.NECK_PROC_CD||LOGMSG_BRACKETE,
                                         1,256);
                    RAISE excGetResourceData;
                END IF;

                -- INDEX������
                intIND := 1;

                numCalCnt := 0;

                -- ����A�C�h���^�C���擾
                numProcStartIdleDate := curM_NECK_WS_REC.PROC_START_IDLE_DATE;
                -- ���[�h�^�C���擾
                numNeckProcLt := curM_NECK_WS_REC.NECK_PROC_LT;

                numWorkLt := 0;
                -- �J�����_�z�񃋁[�v(���[�h�^�C���Čv�Z�̂���)
                FOR i IN 1..intIND_CAL - 1 LOOP

                    IF typMCAL(i) >= dtmStartDate THEN
                        IF typMCAL(i) >= GREATEST(dtmStartDate,dtmDueDate) THEN
                            EXIT;
                        END IF;
                        numWorkLt := numWorkLt + 1;
                    END IF;
                END LOOP;
                numWorkLt := GREATEST(1,numWorkLt);
                IF numWorkLt < numProcStartIdleDate + numNeckProcLt THEN
                    IF numWorkLt <= numNeckProcLt THEN
                        numProcStartIdleDate := 0;
                        numNeckProcLt := numWorkLt;
                    ELSE
                        numProcStartIdleDate := numWorkLt - numNeckProcLt;
--                        numNeckProcLt := numWorkLt;--�ύX����
                        
                    END IF;
                END IF;

--vc2RunChkComment := '���������ʉ� 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                -- �J�����_�z�񃋁[�v
                FOR i IN 1..intIND_CAL - 1 LOOP

                    -- ����������ȏ�̃J�����_�܂Ō�������
                    IF typMCAL(i) >= dtmStartDate THEN

                        -- ���׎R�ς݊J�n���擾�̂��ߒ���A�C�h���^�C�����J�����_��i�߂�
                        IF numProcStartIdleDate <= 0 THEN

                            -- ���ז��הz��ɓo�^����
                            IF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 1 THEN -- ���׊��t�敪���ϓ�

--vc2RunChkComment := '���������ʉ� 00110'||TO_CHAR(typMCAL(i),'YYYYMMDD')||' '||TO_CHAR(numProcStartIdleDate);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- ���׎R�ς݊J�n�����J�����_����擾(����̂�)�A��͂��̒l���R�s�[����
                                IF intIND = 1 THEN
                                    typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);
                                ELSE
                                    typW_LOAD_DATA(intIND).dtmLoadStartDate := typW_LOAD_DATA(1).dtmLoadStartDate;
                                END IF;

                                -- ���׎R�ςݓ����Ƀ��[�h�^�C�����Z�b�g
                                typW_LOAD_DATA(intIND).numLoadDateQty := GREATEST(1,curM_NECK_WS_REC.NECK_PROC_LT);

                                -- ���׎R�ςݓ����J�����_����擾
                                typW_LOAD_DATA(intIND).dtmLoadDate := typMCAL(i);

                                -- ���׎R�ϐ��ʂ��擾(��ŕ��׎R�ςݓ����ŏ��Z����)
                                numWorkQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (numOrdQty * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD / typW_LOAD_DATA(intIND).numLoadDateQty),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;

                                numCalCnt := numCalCnt + 1;

                            ELSIF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 2 THEN -- ���׊��t�敪�������S

--vc2RunChkComment := '���������ʉ� 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- ���׎R�ς݊J�n�����J�����_����擾
                                typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);

                                -- ���׎R�ςݓ����ɏ����l���Z�b�g
                                typW_LOAD_DATA(intIND).numLoadDateQty := LOAD_DATE_QTY_INIT;

                                -- ���׎R�ςݓ����J�����_����擾
                                typW_LOAD_DATA(intIND).dtmLoadDate := typMCAL(i);

                                -- ���׎R�ϐ��ʂ��擾(��ŕ��׎R�ςݓ����ŏ��Z����)
                                numWorkQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (numOrdQty * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD / LOAD_DATE_QTY_INIT),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;

                                -- 1���擾�ŗǂ����߃J�����_�̃��[�v�𔲂���
                                numCalCnt := 1;
                                EXIT;

                            ELSIF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 3 THEN  -- ���׊��t�敪���ŏI���S

--vc2RunChkComment := '���������ʉ� 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- ���׎R�ς݊J�n�����J�����_����擾
                                typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);

                                -- ���׎R�ςݓ����ɏ����l���Z�b�g
                                typW_LOAD_DATA(intIND).numLoadDateQty := LOAD_DATE_QTY_INIT;

                                -- ���׎R�ςݓ����J�����_�ƃ��[�h�^�C������擾
                                IF intIND_CAL - 1 >= i + numNeckProcLt THEN

                                    dtmWorkDueDate := dtmDueDate - 1;
                                    FOR curM_CAL_DESC_REC IN curM_CAL_DESC(numCalNo,dtmWorkDueDate,HOLIDAY_FLG_OFF) LOOP
                                        dtmWorkDueDate := curM_CAL_DESC_REC.CAL_DATE;
                                        EXIT;
                                    END LOOP;


                                    typW_LOAD_DATA(intIND).dtmLoadDate := GREATEST(typMCAL(i),LEAST(typMCAL(i + numNeckProcLt),dtmWorkDueDate));

                                ELSE
-- 2004.02.24 UPD
                                    vc2Comment := SUBSTR(LOGMSG_BRACKETS||'PLAN_ITEM_CD�F'||curM_LOAD_PS_REC.PLAN_ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'ITEM_CD�F'||curM_LOAD_PS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'CAL_NO�F'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'DATE6�F'||TO_CHAR(dtmDueDate,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                      LOGMSG_BRACKETS||'LT�F'||TO_CHAR(-(1 + i + numNeckProcLt))||LOGMSG_BRACKETE
                                      ,1,256);

                                    RAISE excGetDateData;
                                END IF;

                                -- ���׎R�ϐ��ʂ��擾(��ŕ��׎R�ςݓ����ŏ��Z����)
                                numWorkQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (numOrdQty * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((numOrdQty * curM_NECK_WS_REC.UNIT_LOAD / LOAD_DATE_QTY_INIT),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;     

                                -- 1���擾�ŗǂ����߃J�����_�̃��[�v�𔲂���
                                numCalCnt := 1;
                                EXIT;   

                            END IF;

                            -- �J�����_��(�����[��-�ғ���1��)�ȏ�ɂȂ����ꍇ ���[�v�𔲂���
                            IF dtmDueDate <= typMCAL(i + 1) THEN
                                EXIT;
                            END IF;

                            -- ���[�h�^�C���J�E���g�_�E�� �[���ȉ��Ń��[�v�𔲂���
                            numNeckProcLt := numNeckProcLt - 1;
                            IF numNeckProcLt <= 0 THEN
                                EXIT;
                            END IF;
                        ELSE
                            -- ����A�C�h���^�C���J�E���g�_�E��
                            numProcStartIdleDate := numProcStartIdleDate - 1;
                        END IF;
                    END IF;


                    -- �����[���𒴂����烋�[�v�𔲂���
                    IF GREATEST(dtmStartDate,dtmDueDate) <= typMCAL(i) THEN
                        EXIT;
                    END IF;

                END LOOP;

--vc2RunChkComment := '���������ʉ� 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                FOR i IN 1..intIND - 1 LOOP

                    IF typW_LOAD_DATA(i).dtmLoadDate >= dtmCalcFromDate AND 
                       typW_LOAD_DATA(i).dtmLoadDate <= dtmCalcToDate THEN

--vc2RunChkComment := '���������ʉ� 00150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                        -- ���ז��׎��ʔԍ��J�E���g�A�b�v
                        IF (TO_NUMBER(vc2LoadCd) + 1) > TO_NUMBER(vc2LoadCd_Max) THEN
                            vc2LoadCd := vc2LoadCd_Min;
                        END IF;
                        vc2LoadCd := TRIM(TO_CHAR(TO_NUMBER(vc2LoadCd)+1,vc2LoadCd_Min));

                        numWorkQty := ROUND((typW_LOAD_DATA(i).numLoadQty / numCalCnt),MINIMUM_BEAM);
                        IF numWorkQty >= (typW_LOAD_DATA(i).numLoadQty / numCalCnt) THEN
                            numLoadQty := numWorkQty;
                        ELSE
                            numLoadQty := numWorkQty + MINIMUM_BEAM_QTY;
                        END IF;

--DBMS_OUTPUT.PUT_LINE(TO_CHAR(typW_LOAD_DATA(i).numLoadQty)||'/'||TO_CHAR(numLoadQty));

                        -- ��z����������׍\���̗L���J�n���ƗL���I�����͈͓̔��Ȃ�Γo�^����
            IF ((dtmOdrStartDate >= curM_LOAD_PS_REC.EFF_PHASE_IN_DATE) AND
                           (dtmOdrStartDate <= curM_LOAD_PS_REC.EFF_PHASE_OUT_DATE)) THEN

                            INSERT INTO T_SIM_LOAD_DETAIL (
                                 LOAD_CD
                                ,LOAD_PLAN_CD
                                ,PLANT_CD
                                ,ITEM_CD
                                ,JOB_ODR_CD
                                ,PRD_DUE_DATE
                                ,PRD_START_DATE
                                ,ODR_QTY
                                ,MRP_ODR_TYP
                                ,NECK_PROC_CD
                                ,LOAD_DATE
                                ,LOAD_QTY
                                ,ENTRY_BY
                                ,CREATED_DATE
                                ,CREATED_BY
                                ,CREATED_PRG_NM
                                ,UPDATED_DATE
                                ,UPDATED_BY
                                ,UPDATED_PRG_NM
                                ,MODIFY_COUNT
                            ) VALUES (
                                 pvc2PlantCd || vc2LoadCd
                                ,curT_LOAD_PLAN_REC.LOAD_PLAN_CD
                                ,curT_LOAD_PLAN_REC.PLANT_CD
                                ,curM_LOAD_PS_REC.ITEM_CD
                                ,curT_LOAD_PLAN_REC.JOB_ODR_CD
                                ,dtmDueDate
                                ,dtmStartDate
                                ,numOrdQty
                                ,curM_LOAD_PS_REC.MRP_ODR_TYP
                                ,curM_NECK_WS_REC.NECK_PROC_CD
                                ,typW_LOAD_DATA(i).dtmLoadDate
                                ,numLoadQty
                                ,curT_LOAD_PLAN_REC.ENTRY_BY
                                ,SYSDATE
                                ,pvc2UserId
                                ,MY_SQL_NAME
                                ,SYSDATE
                                ,pvc2UserId
                                ,MY_SQL_NAME
                                ,FIRST_MODIFY_COUNT
                            );

            END IF;

                        numTgtCnt := numTgtCnt + 1;

                    END IF;

                END LOOP;

            END LOOP;

        END LOOP;

    END LOOP;

    UPDATE T_LOAD_PLAN 
    SET    LOAD_CALC_TYP = LOAD_CALC_TYP_END
          ,UPDATED_DATE   = SYSDATE
          ,UPDATED_BY     = pvc2UserId
          ,UPDATED_PRG_NM = MY_SQL_NAME
          ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd
    AND    LOAD_CALC_TYP = LOAD_CALC_TYP_RUN;

    -- ���ז��׎��ʔԍ��X�V
    UPDATE SYS_LOAD_CD_CTRL 
    SET  LOAD_CD        = vc2LoadCd
        ,UPDATED_DATE   = SYSDATE
        ,UPDATED_BY     = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd;

--vc2RunChkComment := '���������ʉ� 00160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �I�����b�Z�[�W�̍쐬
    vc2Comment := LOGMSG_END_PGNM;
    vc2Comment := '(SBM0404)'||vc2Comment || LOGMSG_TGTCNT || LOGMSG_BRACKETS || numTgtCnt || LOGMSG_BRACKETE;
    vc2Comment := SUBSTR(vc2Comment,1,256);

    -- �I�����b�Z�[�W�̏o��
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

    -- ���׎��ʔԍ��̔ԃe�[�u�����b�N����
    --CLOSE curSYS_LOAD_CD_CTRL;

    -- �R�~�b�g
    COMMIT;

    -- LogFile��CLOSE
    blnRet := FncLogClose(UTL_FileHandle);

    pnumReturn := 0;

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

/*------------------------------------------------------------
'�@�����I���i�ُ�I���j�ƂȂ�EXCEPTION
-------------------------------------------------------------*/
EXCEPTION

    WHEN excMistakeCommonParam  THEN    --���ʂ̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excMistakeCommonParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0405)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F���ʂ̓��̓p�����[�^������Ă��܂�',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_COMMON_PARAM, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                           MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excMistakeNativeParam  THEN    --�ŗL�̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0406)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F�ŗL�̓��̓p�����[�^������Ă��܂�',
                             1,256);

        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_COMMON_PARAM, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

--    WHEN excGetMyCompany  THEN    --���Ў擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetMyCompany');
--        ROLLBACK;
--        -- �I�����b�Z�[�W�̍쐬
--        vc2Comment := SUBSTR(LOGMSG_END_PGNM || LOGMSG_ERR || '�F���Ў擾�G���[',
--                             1,256);
--        -- �I�����b�Z�[�W�̏o��
--        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
--                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
--                            MY_SQL_NAME, APS_COM_NOTEXIST_MY_COMPANY, vc2Comment);
--        -- TraceLog �̏o��
--        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
--                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
--                              MY_SQL_NAME, LOGMSG_END || vc2TraceComment);
--        COMMIT;
--
--        -- LogFile��CLOSE
--        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetPlant  THEN    --�H��擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetPlant');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0407)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F�H��擾�G���[',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_PLANT, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excSysLoadCalcPeriod  THEN    -- ���׌v�Z���Ԏ擾�G���[
--DBMS_OUTPUT.PUT_LINE('excSysLoadCalcPeriod');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0408)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F���׌v�Z���Ԏ擾�G���[',1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_LOAD_PLAN, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excNeckProcLtZero THEN
--DBMS_OUTPUT.PUT_LINE('excNeckProcLtZero');

        -- �I�����b�Z�[�W�̍쐬��RAISE�O�ɍs��

        ROLLBACK;
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ZERO_NECK_PROC_LT, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

        COMMIT;

        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetResourceData   THEN    -- �����擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetResourceData');
        -- �I�����b�Z�[�W�̍쐬��RAISE�O�ɍs��

        ROLLBACK;

        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_RESOURCE, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetDateData   THEN    -- ���t�擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetDateData');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0409)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F���t�擾�G���[' || vc2Comment,
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_CALENDER, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetNewLoadCd  THEN    --���ז��׎��ʔԍ��G���[
--DBMS_OUTPUT.PUT_LINE('excGetNewLoadCd');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0410)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F���ז��׎��ʔԍ��G���[',1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_LOAD_CD, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        
        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0411)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);

        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        -- TraceLog �̏o�́i���s�ʒu�j
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile��CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

END;
/
