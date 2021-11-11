CREATE OR REPLACE PROCEDURE SqlLoadPsMake(
/*------------------------------------------------------------------------------
'
' SQL_NAME  : SqlLoadPsMake.Sql
' version   : 1.00.00
'
' �C������
' 2003.09.30 ����
' 2005.10.24 unicode�Ή��ivarchar2��4�{�j
'
'
' �@�\      : ���׍\���}�X�^�쐬
'
' ������    ��MetamorBase����
'           : pvc2LogMode          - (i)�k�n�f���[�h
'                 pvc2OutputMode       - (i)�o�̓��[�h
'                 pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'                 pvc2OutputName       - (i)�o�̓t�@�C����
'                 pvc2UserId           - (i)���[�U�h�c
'                 pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'       �����׍\���}�X�^�쐬�ŗL
'                         ����
'
' �@�\����  : ���׍\���}�X�^�쐬
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
)
IS
    -- ��O�̐錾
    excGetPlant             EXCEPTION;          -- �H��擾�G���[
--    excGetMyCompany         EXCEPTION;          -- ���Ў擾�G���[
    excMistakeCommonParam   EXCEPTION;          -- ���ʂ̓��̓p�����[�^�ُ�
    excMistakeNativeParam   EXCEPTION;      -- �ŗL�̓��̓p�����[�^�ُ�
    excGetNewLoadPsCd       EXCEPTION;      -- �\����ʃL�[�擾�ُ�
    excUpdateLevelNo        EXCEPTION;      -- HIGH���x���ԍ��X�V�����ُ�

    -- �萔�̐錾
    MY_SQL_NAME             VARCHAR2(128) := 'SqlLoadPsMake';
    FIRST_MODIFY_COUNT      NUMBER       := 0;              -- �V�K�쐬�e�[�u���̏���̍X�V��
--    CTRL_CD_DEFAULT         VARCHAR2(24)  := 'SYSTEM';       -- �R���g���[���n�e�[�u����PrimaryKey�̒l
    MRP_EXP_TYP_ON          NUMBER       := 1;              -- MRP�W�J�敪(0:�W�J���Ȃ� 1:�W�J����)
    EFF_PHASE_IN_DATE_INI   VARCHAR2(40) := '2000/01/01';   -- ���׍\���L���J�n�������l
    EFF_PHASE_OUT_DATE_INI  VARCHAR2(40) := '2099/12/31';   -- ���׍\���L���I���������l
    MINIMUMBEAM             NUMBER       := 0.00000001;     -- �ŏ����l(�؂�グ�p)
    LOAD_PS_CD_MAX          VARCHAR(23)  := PKGCOMPARAM.NUMBER_MAX;-- �\����ʃL�[�ŏ��l
    LOAD_PS_CD_MIN          VARCHAR(23)  := PKGCOMPARAM.NUMBER_MIN;-- �\����ʃL�[�ő�l
    NUMBER_MAX_LENGTH       NUMBER       := PKGCOMPARAM.SEQUENCE_LENGTH;  --�\����ʃL�[�̔ԍő包��


    -- �ϐ��̐錾
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- �t�@�C���n���h��
    blnRet                  BOOLEAN;            -- �֐��߂�l
    intRet                  INTEGER;            -- �֐��߂�l
    vc2Comment              VARCHAR2(1024);      -- ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);      -- ���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2TraceComment     VARCHAR2(1024);      -- �g���[�[�X�o�͗p�R�����g�쐬��Ɨ̈�i���̓p�����[�^�L�^�p�j
--    vc2CompanyCd      VARCHAR2(8);    -- ��ЃR�[�h
    vc2WhCd         VARCHAR2(100);       -- ��n�ꏊ�i��\�[���ꏊ�R�[�h�j
    numPsUnitQty            NUMBER(22,8);       -- ���ʃ��[�N
    numTgtCnt               NUMBER := 0;        -- �Ώی���
    vc2LoadPsCd             VARCHAR2(100);       -- �\����ʃL�[

    -- MESSAGE �̐錾
    APS_COM_BATCH_START                 VARCHAR2(28)   := 'ZZ09001';    -- �o�b�`�������J�n���܂���
    APS_COM_BATCH_END                   VARCHAR2(28)   := 'ZZ09002';    -- �o�b�`�������I�����܂���
    APS_COM_MISTAKE_COMMON_PARAM        VARCHAR2(28)   := 'AL30001';    -- ���ʂ̓��̓p�����[�^������Ă��܂�
    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'AL30002';    -- �ŗL�̓��̓p�����[�^������Ă��܂�
    APS_COM_NOTEXIST_MY_COMPANY         VARCHAR2(28)   := 'AL30003';    -- ���Ѓf�[�^�����݂��܂���
    APS_COM_NOTEXIST_PLANT              VARCHAR2(28)   := 'AL30004';    -- �H��f�[�^�����݂��܂���
    APS_COM_NOTGET_LOAD_PS_CD           VARCHAR2(28)   := 'AL30005';    -- �\����ʃL�[���擾�ł��܂���
    APS_COM_UPDATELEVELNO_ERR           VARCHAR2(28)   := 'AL30006';    -- HIGH���x���ԍ��X�V�����ُ�
    APS_COM_ORACLE_ERR                  VARCHAR2(28)   := 'ZZ01106';    -- �n�q�`�b�k�d�G���[

    -- LOG �̐錾
    LOGMSG_START                        VARCHAR2(20)   := 'Start';      -- ���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';        -- ���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    LOGMSG_START_PGNM                   VARCHAR2(192)  := '(SBM0436)<< ���׍\���}�X�^�쐬�����J�n >>';
    LOGMSG_END_PGNM                     VARCHAR2(192)  := '<< ���׍\���}�X�^�쐬�����I�� >>';
    LOGMSG_PARAM            VARCHAR2(64)  := '���̓p�����[�^�F';
    LOGMSG_TGTCNT                       VARCHAR2(40)  := '�Ώی����F';
    LOGMSG_DONECNT                      VARCHAR2(40)  := '���팏���F';
    LOGMSG_WARCNT                       VARCHAR2(64)  := '���[�j���O�����F';
    LOGMSG_FATALCNT                     VARCHAR2(40)  := '�ُ팏���F';
    LOGMSG_BRACKETS                     VARCHAR2(4)   := '[';
    LOGMSG_BRACKETE                     VARCHAR2(4)   := ']';
    LOGMSG_COMMA                        VARCHAR2(4)   := ',';

    -- ���׍\���}�X�^�쐬�p�z��錾
    TYPE W_LOAD_PS_R IS RECORD(
        PLAN_ITEM_CD       VARCHAR2(100),
        ITEM_CD            VARCHAR2(100),
        LOAD_PS_CD         VARCHAR2(100),
        PLAN_ITEM_LT       NUMBER(6),
--        ITEM_LT            NUMBER(6),
        ODR_LT             NUMBER(6),
        FIXED_LT           NUMBER(6),
        SAFETY_LT          NUMBER(6),
        ISSUE_LT           NUMBER(6),
        PS_UNIT_QTY        NUMBER(22,8),
        EFF_PHASE_IN_DATE  DATE,
        EFF_PHASE_OUT_DATE DATE,
        MRP_ODR_TYP        NUMBER(2)
    );
    TYPE W_LOAD_PS_T IS TABLE OF W_LOAD_PS_R INDEX BY BINARY_INTEGER;
    typW_LOAD_PS W_LOAD_PS_T;

    -- ���׍\���}�X�^�쐬�p�z��INDEX�錾
    intIND   BINARY_INTEGER; -- INDEX
    intIND_W BINARY_INTEGER; -- INDEX WORK

    -- �J�[�\���̐錾
    -- �i��
    CURSOR curM_ITEM(
        cvc2PlantCd VARCHAR2
    )
    IS
--        SELECT A.ITEM_CD,A.MRP_ODR_TYP,A.ODR_LT,A.FIXED_LT,A.SAFETY_LT,A.ISSUE_LT,A.ITEM_SPOIL,
--            DECODE(B.ITEM_CD,NULL,0,1) LOAD_FLG  
--            FROM   M_ITEM A,(SELECT ITEM_CD FROM M_NECK_WS WHERE PLANT_CD = cvc2PlantCd�@GROUP BY ITEM_CD) B
--            WHERE  A.ITEM_CD = B.ITEM_CD(+) 
        SELECT A.ITEM_CD,A.HIGH_LEVEL_NO,A.MRP_ODR_TYP,A.ODR_LT,A.FIXED_LT,A.SAFETY_LT,A.ISSUE_LT,A.ITEM_SPOIL
            FROM   M_ITEM A
--WHERE A.HIGH_LEVEL_NO IN (1,2,3)
            ORDER BY A.HIGH_LEVEL_NO ASC,A.ITEM_CD ASC;

    -- �\��(�e�i�ڂ���̃V���O�����W�J�p)
    CURSOR curM_PS(
        cvc2ParentItemCd VARCHAR2
    )
    IS
        SELECT PARENT_ITEM_CD,COMP_ITEM_CD,PS_UNIT_DENOMINATOR ,PS_UNIT_NUMERATOR,
            EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_SPOIL,MRP_EXP_TYP 
            FROM   M_PS
            WHERE  PARENT_ITEM_CD = cvc2ParentItemCd
            --ORDER  BY COMP_ITEM_CD ASC,PS_EDITION ASC
            ;

    -- �\����ʃL�[�̔�(�f�[�^���b�N�p)
    CURSOR curSYS_LOAD_PS_CD_CTRL 
    IS
        SELECT  LOAD_PS_CD
        FROM    SYS_LOAD_PS_CD_CTRL
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
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2PlantCd || LOGMSG_BRACKETE || '>>';
    vc2TraceComment := SUBSTR(vc2TraceComment,1,256);

    -- LogFile �� OPEN
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd,pvc2OutputMode,UTL_FileHandle);

    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

/*------------------------------------------------------------
'�@���ʂ̓��̓p�����[�^���`�F�b�N����
'�@�ŗL�̓��̓p�����[�^���`�F�b�N����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- ���ʂ̓��̓p�����[�^�̃`�F�b�N
    IF  pvc2LogMode IS NULL THEN    --�k�n�f���[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputMode IS NULL THEN --�o�̓��[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputPath IS NULL THEN --�o�̓p�X���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputName IS NULL THEN --�o�̓t�@�C�������m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2UserId IS NULL THEN     --���[�U�h�c���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2BusinessName IS NULL THEN   --�Ɩ������m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2PlantCd IS NULL THEN    --�H��R�[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;

    -- �ŗL�̓��̓p�����[�^�̃`�F�b�N
    -- ����

/*------------------------------------------------------------
'�@�J�n���b�Z�[�W�̏o��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00015';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �J�n���b�Z�[�W�̏o��
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, LOGMSG_START_PGNM);

    -- �R�~�b�g
    COMMIT;

/*------------------------------------------------------------
'�@�i�ڂ�HIGH���x���ԍ��X�V����CALL
'�@�G���[���F�����I��
-------------------------------------------------------------*/
-- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'HIGH LEVEL UPDATE START');

--vc2RunChkComment := '���������ʉ� 00017';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    BEGIN
        SqlUpdateLevelNo.UP_LVL(pvc2UserId);
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excUpdateLevelNo;    
    END;

    -- �R�~�b�g
    COMMIT;

-- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'HIGH LEVEL UPDATE END  ');

/*------------------------------------------------------------
'�@���Ѓ}�X�^���`�F�b�N����
'�@��ЃR�[�h���擾����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--    -- ���Ѓ}�X�^�̑��݃`�F�b�N
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
'�@��\�[���ꏊ���擾����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �H��}�X�^�̑��݃`�F�b�N
    BEGIN
        SELECT  WH_CD INTO vc2WhCd
            FROM   M_PLANT
            WHERE  M_PLANT.PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetPlant;
        WHEN OTHERS THEN
            RAISE;
    END;

/*------------------------------------------------------------
'�@�\����ʃL�[���擾����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- ����̍̔Ԃ̂ݎ擾�֐����g�p����
    
    -- �\����ʃL�[�擾
    blnRet := FncGetNewLoadPsCd(UTL_FileHandle
                               ,pvc2LogMode
                               ,pvc2OutputMode
                               ,pvc2UserId
                               ,pvc2BusinessName
                               ,pvc2PlantCd
                               ,vc2LoadPsCd
                               );
    IF blnRet = FALSE THEN
        RAISE excGetNewLoadPsCd;
    END IF;

    -- �\�[�X���ŃJ�E���g�A�b�v���邽�ߍH��R�[�h���͂���
    vc2LoadPsCd := SUBSTR(vc2LoadPsCd,LENGTH(pvc2PlantCd)+1,25);

    -- �\����ʃL�[�̔ԃe�[�u�����b�N
    OPEN curSYS_LOAD_PS_CD_CTRL;

--DBMS_OUTPUT.PUT_LINE(vc2LoadPsCd||' '||vc2LoadPsCd_Min||' '||vc2LoadPsCd_Max);

/*------------------------------------------------------------
'�@���׍\���}�X�^�쐬
-------------------------------------------------------------*/

--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �z��pINDEX�̏�����
    intIND := 1;

    -- �������̓��x���ԍ�,�i�ڔԍ��̏���
    FOR curM_ITEM_REC IN curM_ITEM(pvc2PlantCd) LOOP

        -- �V���O���W�J
        FOR curM_PS_REC IN curM_PS(curM_ITEM_REC.ITEM_CD) LOOP

            -- ���v�ʓW�J�敪���W�J���Ȃ��ꍇ�z��ɓo�^���Ȃ�
            IF curM_PS_REC.MRP_EXP_TYP = MRP_EXP_TYP_ON THEN

                -- �q�i�ԂŔz������������݂��Ă���ΐV�K�ɔz��ɓo�^����
                intIND_W := intIND;
                FOR i IN 1..intIND_W - 1 LOOP
                    IF typW_LOAD_PS(i).PLAN_ITEM_CD = curM_PS_REC.COMP_ITEM_CD THEN

                        -- (�z��.�L���J�n�� > �\��.�L���I����)or(�z��.�L���I���� < �\��.�L���J�n��)�̏ꍇ�A�z��ɓo�^���Ȃ�
                        IF (typW_LOAD_PS(i).EFF_PHASE_IN_DATE <= curM_PS_REC.EFF_PHASE_OUT_DATE) 
                           AND (typW_LOAD_PS(i).EFF_PHASE_OUT_DATE >= curM_PS_REC.EFF_PHASE_IN_DATE) THEN

--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                        -- �\����ʃL�[�J�E���g�A�b�v
                        IF (TO_NUMBER(vc2LoadPsCd) + 1) > TO_NUMBER(LOAD_PS_CD_MAX) THEN
                            vc2LoadPsCd := LOAD_PS_CD_MIN;
                        ELSE
                            vc2LoadPsCd := LPAD(TO_NUMBER(vc2LoadPsCd)+1,NUMBER_MAX_LENGTH,'0');
                        END IF;

                            typW_LOAD_PS(intIND).PLAN_ITEM_CD       := curM_ITEM_REC.ITEM_CD;
                            typW_LOAD_PS(intIND).ITEM_CD            := typW_LOAD_PS(i).ITEM_CD;
                            typW_LOAD_PS(intIND).LOAD_PS_CD         := pvc2PlantCd || vc2LoadPsCd;
                            typW_LOAD_PS(intIND).PLAN_ITEM_LT       := typW_LOAD_PS(i).PLAN_ITEM_LT 
                                                                    + curM_ITEM_REC.ODR_LT + curM_ITEM_REC.FIXED_LT 
                                                                    + curM_ITEM_REC.SAFETY_LT + curM_ITEM_REC.ISSUE_LT;
--                            typW_LOAD_PS(intIND).ITEM_LT            := typW_LOAD_PS(i).ITEM_LT;
                            typW_LOAD_PS(intIND).ODR_LT            := typW_LOAD_PS(i).ODR_LT;
                            typW_LOAD_PS(intIND).FIXED_LT            := typW_LOAD_PS(i).FIXED_LT;
                            typW_LOAD_PS(intIND).SAFETY_LT            := typW_LOAD_PS(i).SAFETY_LT;
                            typW_LOAD_PS(intIND).ISSUE_LT            := typW_LOAD_PS(i).ISSUE_LT;

                            -- �؂�グ�̂���ROUND�֐��g�p��A���̒l�ȏ�Ȃ�΂��̂܂܁A�����Ȃ�΍ŏ����łP�v���X����
                            numPsUnitQty := ROUND(((curM_PS_REC.PS_UNIT_NUMERATOR / curM_PS_REC.PS_UNIT_DENOMINATOR)
                                                    * (1 + curM_PS_REC.PS_SPOIL / 100)
                                                    * (1 + curM_ITEM_REC.ITEM_SPOIL / 100)
                                                    * typW_LOAD_PS(i).PS_UNIT_QTY),8);
                            IF numPsUnitQty >= ((curM_PS_REC.PS_UNIT_NUMERATOR / curM_PS_REC.PS_UNIT_DENOMINATOR) 
                                                    * (1 + curM_PS_REC.PS_SPOIL / 100) 
                                                    * (1 + curM_ITEM_REC.ITEM_SPOIL / 100) 
                                                    * typW_LOAD_PS(i).PS_UNIT_QTY) THEN
                                typW_LOAD_PS(intIND).PS_UNIT_QTY  := numPsUnitQty;
                            ELSE
                                typW_LOAD_PS(intIND).PS_UNIT_QTY  := ROUND(((curM_PS_REC.PS_UNIT_NUMERATOR / curM_PS_REC.PS_UNIT_DENOMINATOR)
                                                                            * (1 + curM_PS_REC.PS_SPOIL / 100)
                                                                            * (1 + curM_ITEM_REC.ITEM_SPOIL / 100)
                                                                            * typW_LOAD_PS(i).PS_UNIT_QTY),8)
                                                                            + MINIMUMBEAM ;
                            END IF;

                            typW_LOAD_PS(intIND).EFF_PHASE_IN_DATE  := GREATEST(typW_LOAD_PS(i).EFF_PHASE_IN_DATE,curM_PS_REC.EFF_PHASE_IN_DATE);
                            typW_LOAD_PS(intIND).EFF_PHASE_OUT_DATE := LEAST(typW_LOAD_PS(i).EFF_PHASE_OUT_DATE,curM_PS_REC.EFF_PHASE_OUT_DATE);
                            typW_LOAD_PS(intIND).MRP_ODR_TYP        := typW_LOAD_PS(i).MRP_ODR_TYP;
--                            typW_LOAD_PS(intIND).CRE_DATE           := SYSDATE;
                            intIND := intIND + 1;
--
IF intIND/1000=ROUND(intIND/1000) THEN
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, ' LEVEL='||TO_CHAR(curM_ITEM_REC.HIGH_LEVEL_NO)||' '||TO_CHAR(intIND));
END IF;
--


                        END IF;
                    END IF;
                END LOOP;
            END IF;
    END LOOP;

--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        -- �\����ʃL�[�J�E���g�A�b�v
        IF (TO_NUMBER(vc2LoadPsCd) + 1) > TO_NUMBER(LOAD_PS_CD_MAX) THEN
            vc2LoadPsCd := LOAD_PS_CD_MIN;
        ELSE
            vc2LoadPsCd := LPAD(TO_NUMBER(vc2LoadPsCd)+1,NUMBER_MAX_LENGTH,'0');
        END IF;

        -- �i�ڔԍ��������g��W_LOAD_PS�o�^
        typW_LOAD_PS(intIND).PLAN_ITEM_CD       := curM_ITEM_REC.ITEM_CD;
        typW_LOAD_PS(intIND).ITEM_CD            := curM_ITEM_REC.ITEM_CD;
        typW_LOAD_PS(intIND).LOAD_PS_CD         := pvc2PlantCd || vc2LoadPsCd;
        typW_LOAD_PS(intIND).PLAN_ITEM_LT       := 0;
--        typW_LOAD_PS(intIND).ITEM_LT            := curM_ITEM_REC.ODR_LT + curM_ITEM_REC.FIXED_LT 
--                                                + curM_ITEM_REC.SAFETY_LT + curM_ITEM_REC.ISSUE_LT;
        typW_LOAD_PS(intIND).ODR_LT            := curM_ITEM_REC.ODR_LT;
        typW_LOAD_PS(intIND).FIXED_LT            := curM_ITEM_REC.FIXED_LT;
        typW_LOAD_PS(intIND).SAFETY_LT            := curM_ITEM_REC.SAFETY_LT;
        typW_LOAD_PS(intIND).ISSUE_LT            := curM_ITEM_REC.ISSUE_LT;

        -- �؂�グ�̂���ROUND�֐��g�p��A���̒l�ȏ�Ȃ�΂��̂܂܁A�����Ȃ�΍ŏ����łP�v���X����
        numPsUnitQty := ROUND(1 * (1 + curM_ITEM_REC.ITEM_SPOIL / 100),8);
        IF numPsUnitQty >= (1 * (1 + curM_ITEM_REC.ITEM_SPOIL / 100)) THEN
            typW_LOAD_PS(intIND).PS_UNIT_QTY        := numPsUnitQty;
        ELSE
            typW_LOAD_PS(intIND).PS_UNIT_QTY        := ROUND(1 * (1 + curM_ITEM_REC.ITEM_SPOIL / 100),8) + MINIMUMBEAM;
        END IF;

        typW_LOAD_PS(intIND).EFF_PHASE_IN_DATE  := TO_DATE(EFF_PHASE_IN_DATE_INI,'YYYY/MM/DD');
        typW_LOAD_PS(intIND).EFF_PHASE_OUT_DATE := TO_DATE(EFF_PHASE_OUT_DATE_INI,'YYYY/MM/DD');
        typW_LOAD_PS(intIND).MRP_ODR_TYP        := curM_ITEM_REC.MRP_ODR_TYP;
--        typW_LOAD_PS(intIND).CRE_DATE           := SYSDATE;
        intIND := intIND + 1;

--
IF intIND/1000=ROUND(intIND/1000) THEN
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, ' LEVEL='||TO_CHAR(curM_ITEM_REC.HIGH_LEVEL_NO)||' '||TO_CHAR(intIND));
END IF;
--

    END LOOP;

--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

---------
    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'MAKE_END');
----------
/*------------------------------------------------------------
'�@���׍\���}�X�^�폜
-------------------------------------------------------------*/

--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    DELETE FROM M_LOAD_PS;

---------
    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'DEL_END');
----------

    -- �o�^����������
    numTgtCnt := 0;

    -- ���׍\���f�[�^�̓o�^
    intIND_W := intIND;
    FOR i IN 1..intIND_W - 1 LOOP



            INSERT INTO M_LOAD_PS (
                PLAN_ITEM_CD
               ,ITEM_CD
               ,LOAD_PS_CD
               ,MRP_ODR_TYP
               ,PLAN_ITEM_LT
--               ,ITEM_LT
               ,ODR_LT
               ,FIXED_LT
               ,SAFETY_LT
               ,ISSUE_LT
               ,PS_UNIT_QTY
               ,EFF_PHASE_IN_DATE
               ,EFF_PHASE_OUT_DATE
               ,CREATED_DATE
               ,CREATED_BY
               ,CREATED_PRG_NM
               ,UPDATED_DATE
               ,UPDATED_BY
               ,UPDATED_PRG_NM
               ,MODIFY_COUNT
            ) VALUES (
                typW_LOAD_PS(i).PLAN_ITEM_CD       -- ���ĕi�ڔԍ�
               ,typW_LOAD_PS(i).ITEM_CD            -- �\���i�ڔԍ�
               ,typW_LOAD_PS(i).LOAD_PS_CD         -- �\����ʃL�[
               ,typW_LOAD_PS(i).MRP_ODR_TYP       -- �\���i�ڎ�z�敪
               ,typW_LOAD_PS(i).PLAN_ITEM_LT       -- ���ĕi�ڃ��[�h�^�C��
--               ,typW_LOAD_PS(i).ITEM_LT              -- �i�ڃ��[�h�^�C��
               ,typW_LOAD_PS(i).ODR_LT             -- �i�ڎ�z���[�h�^�C��
               ,typW_LOAD_PS(i).FIXED_LT       -- �i�ڌŒ蕪���[�h�^�C��
               ,typW_LOAD_PS(i).SAFETY_LT      -- �i�ڈ��S����
               ,typW_LOAD_PS(i).ISSUE_LT       -- �i�ڕ��o���[�h�^�C��
               ,typW_LOAD_PS(i).PS_UNIT_QTY        -- �K�v��
               ,typW_LOAD_PS(i).EFF_PHASE_IN_DATE  -- ���i�\���L���J�n��
               ,typW_LOAD_PS(i).EFF_PHASE_OUT_DATE -- ���i�\���L���I����
               ,SYSDATE                            -- �쐬����
               ,pvc2UserId                         -- �쐬��
               ,MY_SQL_NAME                    -- �쐬�v���O������
               ,SYSDATE                            -- �X�V��
               ,pvc2UserId                         -- �X�V��
               ,MY_SQL_NAME                    -- �X�V�v���O������
               ,FIRST_MODIFY_COUNT                 -- �X�V��
             );

            numTgtCnt := numTgtCnt + 1;


    END LOOP;

---------
    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'ADD_END');
----------

--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �\����ʃL�[�X�V
    UPDATE SYS_LOAD_PS_CD_CTRL 
    SET  LOAD_PS_CD        = vc2LoadPsCd
        ,UPDATED_DATE   = SYSDATE
        ,UPDATED_BY     = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd;

    -- �R�~�b�g
    COMMIT;

    -- �I�����b�Z�[�W�̍쐬
    vc2Comment := LOGMSG_END_PGNM;
    vc2Comment :='(SBM0438)' || vc2Comment || LOGMSG_TGTCNT || LOGMSG_BRACKETS || numTgtCnt || LOGMSG_BRACKETE ;
    vc2Comment := SUBSTR(vc2Comment,1,256);

    -- �I�����b�Z�[�W�̏o��
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

    -- �R�~�b�g
    COMMIT;

    -- LogFile �� CLOSE
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

/*------------------------------------------------------------
'�@�����I���i�ُ�I���j�ƂȂ�EXCEPTION
-------------------------------------------------------------*/
EXCEPTION

    WHEN excMistakeCommonParam  THEN    -- ���ʂ̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excMistakeCommonParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0439)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�F���ʂ̓��̓p�����[�^������Ă��܂�',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            NVL(pvc2UserId,' '), NVL(pvc2BusinessName,' '),NVL(pvc2PlantCd,' '),
                            MY_SQL_NAME, APS_COM_MISTAKE_COMMON_PARAM, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excMistakeNativeParam  THEN    --�ŗL�̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0440)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�F�ŗL�̓��̓p�����[�^������Ă��܂�',
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
--        -- LogFile �� CLOSE
--        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetPlant  THEN    --�H��擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetPlant');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0441)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�F�H��擾�G���['||
                             LOGMSG_BRACKETS||pvc2PlantCd||LOGMSG_BRACKETE,
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

    WHEN excGetNewLoadPsCd  THEN    --�\����ʃL�[�G���[
--DBMS_OUTPUT.PUT_LINE('excGetNewLoadCd');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0442)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�F�\����ʃL�[�擾�G���[',1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTGET_LOAD_PS_CD, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excUpdateLevelNo THEN
--DBMS_OUTPUT.PUT_LINE('excUpdateLevelNo');

        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0443)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�FHIGH���x���ԍ��X�V�����ُ�',1,256);

        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_UPDATELEVELNO_ERR, vc2Comment);
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
        vc2Comment := SUBSTR('(SBM0444)' || LOGMSG_END_PGNM || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);

        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
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
