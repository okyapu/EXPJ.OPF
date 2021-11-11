CREATE OR REPLACE PROCEDURE SqlLoadCalcBat(
/*------------------------------------------------------------------------------
'
' SQL_NAME  : SqlLoadCalcBat.Sql
' version   : 1.00.00
'
' �C������
' 2003.09.30 ����
' 2004.02.24 UPD BY CNES �J�����_�擾���A�V�X�e�����t�ł͂Ȃ��Ɩ��^�p���̑O��180���Ƃ���悤�C��
'                        �J�����_�s���G���[���A���b�Z�[�W�ǉ�
' 2005.10.24 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : ���׎R�ς�
'
' ������    ��MetamorBase����
'           : pvc2LogMode          - (i)�k�n�f���[�h
'                 pvc2OutputMode       - (i)�o�̓��[�h
'                 pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'                 pvc2OutputName       - (i)�o�̓t�@�C����
'                 pvc2UserId           - (i)���[�U�h�c
'                 pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'       �����׎R�ώ��s
'                       : pvc2CalcFromDate     - (i)���׎R�ςݑΏۊ���(From)
'                         pvc2CalcToDate       - (i)���׎R�ςݑΏۊ���(To)
'
' �@�\����  : ���׎R�ώ��s
'
' ���l
'
------------------------------------------------------------------------------*/
     pvc2LogMode            VARCHAR2    -- �k�n�f���[�h
    ,pvc2OutputMode         VARCHAR2    -- �o�̓��[�h
    ,pvc2OutputPath         VARCHAR2    -- �o�̓p�X
    ,pvc2OutputName         VARCHAR2    -- �o�̓t�@�C����
    ,pvc2UserId             VARCHAR2    -- ���[�U�h�c
    ,pvc2BusinessName       VARCHAR2    -- �Ɩ���
    ,pvc2PlantCd        VARCHAR2    -- �H��R�[�h
    ,pvc2CalcFromDate           VARCHAR2        -- ���׎R�ςݑΏۊ���(From)
    ,pvc2CalcToDate             VARCHAR2        -- ���׎R�ςݑΏۊ���(To)
)
IS
    -- ��O�̐錾
    excGetPlant             EXCEPTION;          -- �H��擾�G���[
--    excGetMyCompany         EXCEPTION;          -- ���Ў擾�G���[
    excMistakeCommonParam   EXCEPTION;          -- ���ʂ̓��̓p�����[�^�ُ�
    excMistakeNativeParam   EXCEPTION;      -- �ŗL�̓��̓p�����[�^�ُ�
    excGetNewLoadCd         EXCEPTION;          -- ���׎��ʔԍ��擾�ُ�
    excGetResourceData      EXCEPTION;          -- �����擾�G���[
    excGetDateData          EXCEPTION;          -- ���t�擾�G���[
    excNeckProcLtZero       EXCEPTION;          -- ����H��LT�[���ȉ��G���[

    -- �萔�̐錾
    MY_SQL_NAME             VARCHAR2(128) := 'SqlLoadCalcBat';
    FIRST_MODIFY_COUNT      NUMBER       := 0;        -- �V�K�쐬�e�[�u���̏���̍X�V��
--    CTRL_CD_DEFAULT         VARCHAR2(24)  := 'SYSTEM'; -- �R���g���[���n�e�[�u����PrimaryKey�̒l
    OUTSIDE_TYP_INNER_MAKE  NUMBER       := 1;        -- ���O��敪�@����
    ODR_STS_PLAN        NUMBER       := 1;        -- �I�[�_�����敪(1:�v��i�������j)
    ODR_STS_RELEASE         NUMBER       := 2;        -- �I�[�_�����敪(2:�m��i�����j)
    ODR_STS_COMPLETE        NUMBER       := 9;        -- �I�[�_�����敪(9:�I��)
    MRP_TYP_DELETE          NUMBER       := 3;        -- ���v�ʏ����敪(3:�폜)
    MINIMUM_BEAM            NUMBER(2)    := 6;        -- ���חʍŏ���(�؂�グ�p)
    MINIMUM_BEAM_QTY        NUMBER(7,6)  := 0.000001; -- ���חʍŏ����l(�؂�グ�p)
    LOAD_DATE_QTY_INIT      NUMBER(1)    := 1;        -- ���׎R�ςݓ��������l
    HOLIDAY_FLG_OFF         NUMBER(1)    := 0;        -- �x���敪(0:�ғ���)

    -- �ϐ��̐錾
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- �t�@�C���n���h��
    blnRet                  BOOLEAN;            -- �֐��߂�l
    intRet                  INTEGER;            -- �֐��߂�l
    vc2Comment              VARCHAR2(1024);      -- ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);      -- ���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2TraceComment     VARCHAR2(1024);      -- �g���[�[�X�o�͗p�R�����g�쐬��Ɨ̈�i���̓p�����[�^�L�^�p�j
--    vc2CompanyCd      VARCHAR2(8);    -- ��ЃR�[�h
--    vc2WhCd           VARCHAR2(100);       -- ��n�ꏊ�i��\�[���ꏊ�R�[�h�j
    vc2LoadCd               VARCHAR2(100);       -- ���ז��׎��ʔԍ�(�H��R�[�h����)
    numLoadCd               NUMBER(25);         -- ���ז��׎��ʔԍ�(���l�^ �H��R�[�h����)
    vc2LoadCd_Min           VARCHAR2(100);       -- ���ז��׎��ʔԍ��ŏ��l
    vc2LoadCd_Max           VARCHAR2(100);       -- ���ז��׎��ʔԍ��ő�l
    dtmLoadDate             DATE;               -- ���׎R�ςݓ�
    numLoadQty              NUMBER(24,6);       -- ���ח�
    numTgtCnt               NUMBER := 0;        -- �Ώی���
    dtmWorkDate             DATE;               -- ���[�N���t
    numWorkQty              NUMBER(24,6);       -- ���[�N����
    numWorkLt               NUMBER(6);          -- ���[�NLT
    dtmDueDate              DATE;               -- �[��
    numProcStartIdleDate    NUMBER(6);          -- ����A�C�h���^�C��
    numNeckProcLt           NUMBER(6);          -- ���[�h�^�C��
    numCalNo                NUMBER(6);          -- �J�����_�ԍ�
    numCalCnt               NUMBER(6);          -- �Y���J�����_�J�E���g(����������`�����[��)

    -- ���ז��׍쐬�p�z��錾
    TYPE W_LOAD_DATA_R IS RECORD(
        dtmLoadStartDate DATE,         -- ���׎R�ς݊J�n��
        numLoadDateQty   NUMBER(5),    -- ���׎R�ςݓ���
        dtmLoadDate      DATE,         -- ���׎R�ςݓ�
        numLoadQty       NUMBER(24,6)  -- ���׎R�ϐ���
    );
    TYPE W_LOAD_DATA_T IS TABLE OF W_LOAD_DATA_R INDEX BY BINARY_INTEGER;
    typW_LOAD_DATA W_LOAD_DATA_T;
    -- ���ז��׍쐬�p�z��INDEX�錾
    intIND   BINARY_INTEGER; -- INDEX
    intIND_W BINARY_INTEGER; -- INDEX WORK

    -- �J�����_�i�[�z��錾
    TYPE typMCAL_T IS TABLE OF DATE INDEX BY BINARY_INTEGER;
    typMCAL typMCAL_T;
    -- �J�����_�i�[�z��INDEX�錾
    intIND_CAL   BINARY_INTEGER; -- INDEX
    intIND_CAL_W BINARY_INTEGER; -- INDEX WORK

    -- MESSAGE �̐錾
    APS_COM_BATCH_START                 VARCHAR2(28)   := 'ZZ09001';    -- �o�b�`�������J�n���܂���
    APS_COM_BATCH_END                   VARCHAR2(28)   := 'ZZ09002';    -- �o�b�`�������I�����܂���
    APS_COM_MISTAKE_COMMON_PARAM        VARCHAR2(28)   := 'AL30001';    -- ���ʂ̓��̓p�����[�^������Ă��܂�
    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'AL30002';    -- �ŗL�̓��̓p�����[�^������Ă��܂�
    APS_COM_NOTEXIST_MY_COMPANY         VARCHAR2(28)   := 'AL30003';    -- ���Ѓf�[�^�����݂��܂���
    APS_COM_NOTEXIST_PLANT              VARCHAR2(28)   := 'AL30004';    -- �H��f�[�^�����݂��܂���
    APS_COM_ZERO_NECK_PROC_LT           VARCHAR2(28)   := 'AL60005';    -- ����H���̃��[�h�^�C�����[���ȉ��ł�
    APS_COM_NOTEXIST_RESOURCE           VARCHAR2(28)   := 'AL60006';    -- �����f�[�^�����݂��܂���
    APS_COM_NOTGET_LOAD_CD              VARCHAR2(28)   := 'AL60007';    -- ���ז��׎��ʔԍ����擾�ł��܂���
    APS_COM_NOTEXIST_CALENDER           VARCHAR2(28)   := 'AL60008';    -- �J�����_���s�����Ă��܂�
    APS_COM_NOTGET_LOAD_DATA            VARCHAR2(28)   := 'AL60009';    -- ���ז��׃f�[�^���擾�ł��܂���
    APS_COM_ORACLE_ERR                  VARCHAR2(28)   := 'ZZ01106';    -- �n�q�`�b�k�d�G���[

    -- LOG �̐錾
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         -- ���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           -- ���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    LOGMSG_START_PGNM                   VARCHAR2(192)  := '(SBM0412)<< ���׎R�ςݎ��s�����J�n >>';
    LOGMSG_END_PGNM                     VARCHAR2(192)  := '<< ���׎R�ςݎ��s�����I�� >>';
    LOGMSG_ERR_PGNM                     VARCHAR2(192)   := '<< ���׎R�ςݎ��s�����ُ� >>';
    LOGMSG_PARAM            VARCHAR2(64)  := '���̓p�����[�^�F';
    LOGMSG_TGTCNT                       VARCHAR2(40)  := '�Ώی����F';
    LOGMSG_DONECNT                      VARCHAR2(40)  := '���팏���F';
    LOGMSG_WARCNT                       VARCHAR2(64)  := '���[�j���O�����F';
    LOGMSG_FATALCNT                     VARCHAR2(40)  := '�ُ팏���F';
    LOGMSG_BRACKETS                     VARCHAR2(4)   := '[';
    LOGMSG_BRACKETE                     VARCHAR2(4)   := ']';
    LOGMSG_COMMA                        VARCHAR2(4)   := ',';


    -- �J�[�\���̐錾
    -- ���v��
    CURSOR curT_OD(
         cvc2PlantCd VARCHAR2
        ,cdtmCalcFromDate DATE
        ,cdtmCalcToDate DATE
        ,cnumOdrStsPlan NUMBER
        ,cnumOdrStsRelease NUMBER
        ,cnumOdrStsComplete NUMBER
        ,cnumOutsideTypInnerMake NUMBER
        ,cnumMrpTypDelete NUMBER
    )
    IS
        SELECT OD_NO,PLANT_CD,ITEM_CD,JOB_ODR_CD,JOB_ODR_DETAIL_NO,
                  ODR_STS_TYP,OD_TYP,PRD_DUE_DATE,PRD_START_DATE,
                  ODR_QTY,MRP_ODR_TYP,TOTAL_RCV_QTY
        FROM T_OD 
        WHERE PLANT_CD = cvc2PlantCd
        AND   PRD_DUE_DATE >= cdtmCalcFromDate
        AND   PRD_START_DATE <= cdtmCalcToDate
        AND   ODR_STS_TYP IN (cnumOdrStsPlan,cnumOdrStsRelease,cnumOdrStsComplete)
        AND   OUTSIDE_TYP = cnumOutsideTypInnerMake
        AND   TOTAL_RCV_QTY < ODR_QTY
        AND   MRP_TYP <> cnumMrpTypDelete
        AND ITEM_CD IN   (
               SELECT ITEM_CD
               FROM   M_NECK_WS 
               WHERE  PLANT_CD = cvc2PlantCd
               GROUP BY ITEM_CD
        )
        ;

    -- ����H���}�X�^(����A�C�h���^�C�������A����H���R�[�h����)
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
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2PlantCd || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2CalcFromDate || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2CalcToDate || LOGMSG_BRACKETE ||'>>';
    vc2TraceComment := SUBSTR(vc2TraceComment,1,256);

    -- LogFile �� OPEN
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
    IF pvc2LogMode IS NULL THEN      -- �k�n�f���[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2OutputMode IS NULL THEN  -- �o�̓��[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2OutputPath IS NULL THEN   -- �o�̓p�X���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2OutputName IS NULL THEN  -- �o�̓t�@�C�������m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2UserId IS NULL THEN           -- ���[�U�h�c���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2BusinessName IS NULL THEN -- �Ɩ������m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF pvc2PlantCd IS NULL THEN          -- �H��R�[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;

    -- �ŗL�̓��̓p�����[�^�̃`�F�b�N
    IF pvc2CalcFromDate IS NULL THEN  -- ���׎R�ςݑΏۊ���(From)��NULL
        RAISE excMistakeNativeParam;
    END IF;     
    IF pvc2CalcToDate IS NULL THEN      -- ���׎R�ςݑΏۊ���(To)��NULL
        RAISE excMistakeNativeParam;
    END IF;     

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
            WHERE  M_PLANT.PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetPlant;
        WHEN OTHERS THEN
            RAISE;
    END;

/*------------------------------------------------------------
'�@���׎��ʔԍ��擾���擾����
'�@��\�[���ꏊ���擾����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00040';
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

    -- ���׎��ʔԍ��̔ԃe�[�u�������b�N
    OPEN curSYS_LOAD_CD_CTRL;

--DBMS_OUTPUT.PUT_LINE(vc2LoadCd||' '||vc2LoadCd_Min||' '||vc2LoadCd_Max);

/*------------------------------------------------------------
'�@�J�����_��z��Ɋi�[����
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00030'||' '||TO_CHAR(SYSDATE,'HH24MISS');
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    intIND_CAL := 1;
--2004.02.24 UPD
--    FOR curM_CAL_REC IN curM_CAL(numCalNo,HOLIDAY_FLG_OFF) LOOP
    FOR curM_CAL_REC IN curM_CAL(pvc2PlantCd,numCalNo,HOLIDAY_FLG_OFF) LOOP

        typMCAL(intIND_CAL) := curM_CAL_REC.CAL_DATE;
        intIND_CAL := intIND_CAL + 1;

    END LOOP;


/*------------------------------------------------------------
'�@�H��R�[�h���L�[�ɂ��ăf�[�^���폜����
-------------------------------------------------------------*/
    DELETE FROM T_LOAD_DETAIL
    WHERE PLANT_CD = pvc2PlantCd;

/*------------------------------------------------------------
'�@���׎R�ώ��s
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00040'||' '||TO_CHAR(SYSDATE,'HH24MISS');
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- ��������������
    numTgtCnt := 0;

    -- ���v�ʃJ�[�\��
    FOR curT_OD_REC IN curT_OD(
         pvc2PlantCd
        ,TO_DATE(pvc2CalcFromDate,'YYYY/MM/DD')
        ,TO_DATE(pvc2CalcToDate,'YYYY/MM/DD')
        ,ODR_STS_PLAN
        ,ODR_STS_RELEASE
        ,ODR_STS_COMPLETE
        ,OUTSIDE_TYP_INNER_MAKE
        ,MRP_TYP_DELETE) LOOP

--DBMS_OUTPUT.PUT_LINE('TOD SELECT '||' '||TO_CHAR(SYSDATE,'HH24MISS'));

        -- ����H���J�[�\��
        FOR curM_NECK_WS_REC IN curM_NECK_WS(curT_OD_REC.PLANT_CD,curT_OD_REC.ITEM_CD) LOOP

--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            -- �G���[�������A���f�[�^����������
            BEGIN

                --����H���̃��[�h�^�C�����[���ȉ��̏ꍇ�G���[������
                IF curM_NECK_WS_REC.NECK_PROC_LT <= 0 THEN
                    RAISE excNeckProcLtZero;
                END IF;

                -- �����}�X�^�������ꍇ�G���[������
                IF curM_NECK_WS_REC.NECK_PROC_FLG = 0 THEN
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

                    IF typMCAL(i) >= curT_OD_REC.PRD_START_DATE THEN
                        IF typMCAL(i) >= GREATEST(curT_OD_REC.PRD_START_DATE,curT_OD_REC.PRD_DUE_DATE) THEN
                            EXIT;
                        END IF;
                        numWorkLt := numWorkLt + 1;
                    END IF;
                END LOOP;
                numWorkLt := GREATEST(1,numWorkLt);
                IF numWorkLt < numProcStartIdleDate + numNeckProcLt THEN
                    IF numWorkLt <= numNeckProcLt THEN
--DBMS_OUTPUT.PUT_LINE('A[WORK:'||TO_CHAR(numWorkLt)||'][IDLE:'||TO_CHAR(numProcStartIdleDate)||'][PROC:'||TO_CHAR(numNeckProcLt)||']');
                        numProcStartIdleDate := 0;
                        numNeckProcLt := numWorkLt;
                    ELSE
--DBMS_OUTPUT.PUT_LINE('A[WORK:'||TO_CHAR(numWorkLt)||'][IDLE:'||TO_CHAR(numProcStartIdleDate)||'][PROC:'||TO_CHAR(numNeckProcLt)||']');
                        numProcStartIdleDate := numWorkLt - numNeckProcLt;
--                        numNeckProcLt := numWorkLt;--�ύX����
                        
                    END IF;
                END IF;

                -- �J�����_�z�񃋁[�v
                FOR i IN 1..intIND_CAL - 1 LOOP

                    -- ����������ȏ�̃J�����_�܂Ō�������
                    IF typMCAL(i) >= curT_OD_REC.PRD_START_DATE THEN

                        -- ���׎R�ς݊J�n���擾�̂��ߒ���A�C�h���^�C�����J�����_��i�߂�
                        IF numProcStartIdleDate <= 0 THEN

                            -- ���ז��הz��ɓo�^����
                            IF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 1 THEN -- ���׊��t�敪���ϓ�

--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- ���׎R�ς݊J�n�����J�����_����擾(����̂�)�A��͂��̒l���R�s�[����
                                IF intIND = 1 THEN
                                    typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);
                                ELSE
                                    typW_LOAD_DATA(intIND).dtmLoadStartDate := typW_LOAD_DATA(1).dtmLoadStartDate;
                                END IF;

                                -- ���׎R�ςݓ����Ƀ��[�h�^�C�����Z�b�g
                                typW_LOAD_DATA(intIND).numLoadDateQty := GREATEST(1,numNeckProcLt);

                                -- ���׎R�ςݓ����J�����_����擾
                                typW_LOAD_DATA(intIND).dtmLoadDate := typMCAL(i);

                                -- ���׎R�ϐ��ʂ��擾(��ŕ��׎R�ςݓ����ŏ��Z����)
                                numWorkQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;
                                intIND := intIND + 1;
                                
                                numCalCnt := numCalCnt + 1;

                            ELSIF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 2 THEN -- ���׊��t�敪�������S

--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- ���׎R�ς݊J�n�����J�����_����擾
                                typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);

                                -- ���׎R�ςݓ����ɏ����l���Z�b�g
                                typW_LOAD_DATA(intIND).numLoadDateQty := LOAD_DATE_QTY_INIT;

                                -- ���׎R�ςݓ����J�����_����擾
                                typW_LOAD_DATA(intIND).dtmLoadDate := typMCAL(i);

                                -- ���׎R�ϐ��ʂ��擾(��ŕ��׎R�ςݓ����ŏ��Z����)
                                numWorkQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;

                                -- 1���擾�ŗǂ����߃J�����_�̃��[�v�𔲂���
                                numCalCnt := 1;
                                EXIT;

                            ELSIF curM_NECK_WS_REC.LOAD_ASSIGN_TYP = 3 THEN  -- ���׊��t�敪���ŏI���S

--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                                -- ���׎R�ς݊J�n�����J�����_����擾
                                typW_LOAD_DATA(intIND).dtmLoadStartDate := typMCAL(i);

                                -- ���׎R�ςݓ����ɏ����l���Z�b�g
                                typW_LOAD_DATA(intIND).numLoadDateQty := LOAD_DATE_QTY_INIT;

                                -- ���׎R�ςݓ����J�����_�ƃ��[�h�^�C������擾
                                IF (intIND_CAL - 1 >= i + numNeckProcLt) THEN

                                    dtmDueDate := curT_OD_REC.PRD_DUE_DATE - 1;
                                    FOR curM_CAL_DESC_REC IN curM_CAL_DESC(numCalNo,dtmDueDate,HOLIDAY_FLG_OFF) LOOP
                                        dtmDueDate := curM_CAL_DESC_REC.CAL_DATE;
                                        EXIT;
                                    END LOOP;

                                    typW_LOAD_DATA(intIND).dtmLoadDate := GREATEST(typMCAL(i),LEAST(typMCAL(i + numNeckProcLt),dtmDueDate));
                                ELSE

-- 2004.02.24 ADD
                                    vc2Comment := '';
                                    vc2Comment := SUBSTR(LOGMSG_BRACKETS||'OD_NO�F'||curT_OD_REC.OD_NO||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'CAL_NO�F'||TO_CHAR(numCalNo)||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'DATE�F'||TO_CHAR(curT_OD_REC.PRD_DUE_DATE,'YYYY/MM/DD')||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'LT�F'||TO_CHAR(-(1 + i + numNeckProcLt))||LOGMSG_BRACKETE
                                         ,1,256);

                                    RAISE excGetDateData;
                                END IF;

                                -- ���׎R�ϐ��ʂ��擾(��ŕ��׎R�ςݓ����ŏ��Z����)
                                numWorkQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM);
                                IF numWorkQty >= (curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD) THEN
                                    typW_LOAD_DATA(intIND).numLoadQty := numWorkQty;
                                ELSE
                                    typW_LOAD_DATA(intIND).numLoadQty := ROUND((curT_OD_REC.ODR_QTY * curM_NECK_WS_REC.UNIT_LOAD),MINIMUM_BEAM)
                                                                      + MINIMUM_BEAM_QTY;
                                END IF;

                                intIND := intIND + 1;     

                                -- 1���擾�ŗǂ����߃J�����_�̃��[�v�𔲂���
                                numCalCnt := 1;
                                EXIT;   

                            END IF;

                            -- �J�����_��(�����[��-�ғ���1��)�ȏ�ɂȂ����ꍇ ���[�v�𔲂���
                            IF curT_OD_REC.PRD_DUE_DATE <= typMCAL(i + 1) THEN
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
                    IF GREATEST(curT_OD_REC.PRD_START_DATE,curT_OD_REC.PRD_DUE_DATE) <= typMCAL(i) THEN
                        EXIT;
                    END IF;

                END LOOP;

--vc2RunChkComment := '���������ʉ� 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||' '||TO_CHAR(intIND));

                -- ���ז��דo�^
                FOR i IN 1..intIND - 1 LOOP

                    -- ���׎R�ςݓ����Ώۊ��ԓ��̃f�[�^�̂ݓo�^����
                    IF typW_LOAD_DATA(i).dtmLoadDate >= TO_DATE(pvc2CalcFromDate,'YYYY/MM/DD') AND 
                       typW_LOAD_DATA(i).dtmLoadDate <= TO_DATE(pvc2CalcToDate,'YYYY/MM/DD') THEN

                        -- ���ז��׎��ʔԍ��J�E���g�A�b�v
                        IF (TO_NUMBER(vc2LoadCd) + 1) > TO_NUMBER(vc2LoadCd_Max) THEN
                            vc2LoadCd := vc2LoadCd_Min;
                        END IF;
                        vc2LoadCd := TRIM(TO_CHAR(TO_NUMBER(vc2LoadCd)+1,vc2LoadCd_Min));
--DBMS_OUTPUT.PUT_LINE(vc2LoadCd);

                        numWorkQty := ROUND((typW_LOAD_DATA(i).numLoadQty / numCalCnt),MINIMUM_BEAM);
                        IF numWorkQty >= (typW_LOAD_DATA(i).numLoadQty / numCalCnt) THEN
                            numLoadQty := numWorkQty;
                        ELSE
                            numLoadQty := numWorkQty + MINIMUM_BEAM_QTY;
                        END IF;

--DBMS_OUTPUT.PUT_LINE(TO_CHAR(typW_LOAD_DATA(i).numLoadQty)||' / '||TO_CHAR(numCalCnt) );

                        -- ���ז��הz����o�^
                        INSERT INTO T_LOAD_DETAIL (
                             LOAD_CD
                            ,OD_NO
                            ,PLANT_CD
                            ,ITEM_CD
                            ,JOB_ODR_CD
                            ,JOB_ODR_DETAIL_NO
                            ,ODR_STS_TYP
                            ,OD_TYP
                            ,PRD_DUE_DATE
                            ,PRD_START_DATE
                            ,ODR_QTY
                            ,MRP_ODR_TYP
                            ,TOTAL_RCV_QTY
                            ,NECK_PROC_CD
                            ,LOAD_DATE
                            ,LOAD_QTY
                            ,CREATED_DATE
                            ,CREATED_BY
                            ,CREATED_PRG_NM
                            ,UPDATED_DATE
                            ,UPDATED_BY
                            ,UPDATED_PRG_NM
                            ,MODIFY_COUNT
                        ) VALUES (
                             pvc2PlantCd || vc2LoadCd
                            ,curT_OD_REC.OD_NO
                            ,curT_OD_REC.PLANT_CD
                            ,curT_OD_REC.ITEM_CD
                            ,curT_OD_REC.JOB_ODR_CD
                            ,curT_OD_REC.JOB_ODR_DETAIL_NO
                            ,curT_OD_REC.ODR_STS_TYP
                            ,curT_OD_REC.OD_TYP
                            ,curT_OD_REC.PRD_DUE_DATE
                            ,curT_OD_REC.PRD_START_DATE
                            ,curT_OD_REC.ODR_QTY
                            ,curT_OD_REC.MRP_ODR_TYP
                            ,curT_OD_REC.TOTAL_RCV_QTY
                            ,curM_NECK_WS_REC.NECK_PROC_CD
                            ,typW_LOAD_DATA(i).dtmLoadDate
                            ,numLoadQty--ROUND((typW_LOAD_DATA(i).numLoadQty / numCalCnt),MINIMUM_BEAM)
                            ,SYSDATE
                            ,pvc2UserId
                            ,MY_SQL_NAME
                            ,SYSDATE
                            ,pvc2UserId
                            ,MY_SQL_NAME
                            ,FIRST_MODIFY_COUNT
                        );

                        numTgtCnt := numTgtCnt + 1;

--vc2RunChkComment := '���������ʉ� 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


                    END IF;

                END LOOP;



            EXCEPTION

                WHEN excNeckProcLtZero THEN
--DBMS_OUTPUT.PUT_LINE('excNeckProcLtZero');

                    -- �I�����b�Z�[�W�̍쐬
                    vc2Comment := SUBSTR('(SBM0418)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F����H��LT�[���ȉ��G���['||
                                         LOGMSG_BRACKETS||'PLANT_CD:'||pvc2PlantCd||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'ITEM_CD:'||curM_NECK_WS_REC.ITEM_CD||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'NECK_PROC_CD:'||curM_NECK_WS_REC.NECK_PROC_CD||LOGMSG_BRACKETE,
                                         1,256);
                    -- �I�����b�Z�[�W�̏o��
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_ZERO_NECK_PROC_LT, vc2Comment);
                    -- TraceLog �̏o��
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

                WHEN excGetResourceData THEN
--DBMS_OUTPUT.PUT_LINE('excGetResourceData');

                    -- �I�����b�Z�[�W�̍쐬
                    vc2Comment := SUBSTR('(SBM0419)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F�����擾�G���['||
                                         LOGMSG_BRACKETS||'PLANT_CD:'||pvc2PlantCd||LOGMSG_BRACKETE||
                                         LOGMSG_BRACKETS||'NECK_PROC_CD:'||curM_NECK_WS_REC.NECK_PROC_CD||LOGMSG_BRACKETE,
                                         1,256);
                    -- �I�����b�Z�[�W�̏o��
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTEXIST_RESOURCE, vc2Comment);
                    -- TraceLog �̏o��
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

                WHEN excGetDateData THEN
--DBMS_OUTPUT.PUT_LINE('excGetDateData');

                    -- �I�����b�Z�[�W�̍쐬
                    vc2Comment := SUBSTR('(SBM0420)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F�J�����_�G���['||vc2Comment
                                         ,1,256);
                    -- �I�����b�Z�[�W�̏o��
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTEXIST_CALENDER, vc2Comment);
                    -- TraceLog �̏o��
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
                    vc2Comment := '';

                WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');

                    vc2Comment := SUBSTR('(SBM0421)'|| LOGMSG_ERR_PGNM || LOGMSG_ERR || '�F' ||SQLCODE || ',' || 
                                  SUBSTR(SQLERRM,1,256),1,256);

                    -- �I�����b�Z�[�W�̏o��
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTGET_LOAD_DATA, vc2Comment);
                    -- TraceLog �̏o��
                    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                          MY_SQL_NAME, APS_COM_NOTGET_LOAD_DATA || '�F' || vc2TraceComment);
            END;

        END LOOP;

--vc2RunChkComment := '���������ʉ� 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    END LOOP;

    -- ���׌v�Z���ԍX�V
    UPDATE SYS_LOAD_CALC_PERIOD
    SET   CALC_FROM_DATE = TO_DATE(pvc2CalcFromDate,'YYYY/MM/DD')
         ,CALC_TO_DATE   = TO_DATE(pvc2CalcToDate,'YYYY/MM/DD')
         ,UPDATED_DATE   = SYSDATE
         ,UPDATED_BY     = pvc2UserId
         ,UPDATED_PRG_NM = MY_SQL_NAME
         ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE PLANT_CD = pvc2PlantCd;

--DBMS_OUTPUT.PUT_LINE(vc2LoadCd);

    -- ���ז��׎��ʔԍ��X�V
    UPDATE SYS_LOAD_CD_CTRL 
    SET  LOAD_CD        = vc2LoadCd
        ,UPDATED_DATE   = SYSDATE
        ,UPDATED_BY     = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd;

    -- ���b�N������
    --CLOSE curSYS_LOAD_CD_CTRL;

    COMMIT;

--vc2RunChkComment := '���������ʉ� 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �I�����b�Z�[�W�̍쐬
    vc2Comment := LOGMSG_END_PGNM;
    vc2Comment := '(SBM0423)'|| vc2Comment || LOGMSG_TGTCNT || LOGMSG_BRACKETS || numTgtCnt || LOGMSG_BRACKETE ;
    vc2Comment := SUBSTR(vc2Comment,1,256);

    -- �I�����b�Z�[�W�̏o��
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

    COMMIT;

    -- LogFile �� CLOSE
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

/*------------------------------------------------------------
'�@�����I���i�ُ�I���j�ƂȂ�EXCEPTION�@
-------------------------------------------------------------*/
EXCEPTION

    WHEN excMistakeCommonParam  THEN    -- ���ʂ̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excMistakeCommonParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0431)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F���ʂ̓��̓p�����[�^������Ă��܂�',
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

        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excMistakeNativeParam  THEN    -- �ŗL�̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0432)'||LOGMSG_END_PGNM || LOGMSG_ERR || '�F�ŗL�̓��̓p�����[�^������Ă��܂�',
                             1,256);

        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_NATIVE_PARAM, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);


--    WHEN excGetMyCompany  THEN    -- ���Ў擾�G���[
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
--        -- LogFile �� CLOSE
--        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetPlant  THEN    -- �H��擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetPlant');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0433)'||LOGMSG_END_PGNM || LOGMSG_ERR || '�F�H��擾�G���['||LOGMSG_BRACKETS||pvc2PlantCd||LOGMSG_BRACKETE,
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

        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetNewLoadCd  THEN    --���ז��׎��ʔԍ��G���[
--DBMS_OUTPUT.PUT_LINE('excGetNewLoadCd');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0434)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F���ז��׎��ʔԍ��擾�G���[',1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTGET_LOAD_CD, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0435)'|| LOGMSG_END_PGNM || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);

        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);
END;
/
