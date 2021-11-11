CREATE OR REPLACE FUNCTION  FNCCOMMITEMCHG(
----------------------------------------------------------------------------------------------------
-- version   : 1.00.00
--
-- �C������
-- 2003.10.16 �V�K�쐬
-- 2004.09.24 SUBSTR��SUBSTRB�ɕύX
-- 2005.10.21 unicode�Ή��ivarchar2��4�{�j
--
--  �@�@�\      ���Y�v����������            (Function)
--  �Ԃ�l      Boolean                 True :����I��
--                                      False:�ُ�I��
--  ������      pFileHandle             (i)�t�@�C���n���h��
--              pVc2LogMode             (i)�k�n�f���[�h
--              pVc2OutputMode          (i)�o�̓��[�h
--              pVc2UserID              (i)���[�U���.���[�UID
--              pVc2BusinessName        (i)���[�U���.�Ɩ���
--              pvc2PlantCd             (i)�H��R�[�h
--  �������e
--  ���l
----------------------------------------------------------------------------------------------------
    pFileHandle         IN  UTL_FILE.FILE_TYPE, --�t�@�C���n���h��
    pVc2LogMode         IN  VARCHAR2,           -- �k�n�f���[�h
    pVc2OutputMode      IN  VARCHAR2,           -- �o�̓��[�h
    pVc2UserID          IN  VARCHAR2,           -- ���[�U���.���[�UID
    pVc2BusinessName    IN  VARCHAR2,            -- ���[�U���.�Ɩ���
    pvc2PlantCd         IN  VARCHAR2              --// �H��R�[�h
) RETURN BOOLEAN
IS

------------------
-- �J�[�\���錾 --
------------------

    --�y���Y�v������z --U
    CURSOR  CurPRD_REQ_CTRL(
        cVc2PLANT_CD     VARCHAR2        --   1.�H��R�[�h
    )IS
    SELECT  PLANT_CD,                    --U   1.�H��R�[�h                  NOT NULL VARCHAR2(100)
            ALARM_PERIOD                --   2.�A���[���Ώۊ���                    NOT NULL NUMBER(2)
    FROM    SYS_PRD_REQ_CTRL            --  [���Y�v������]
    WHERE   PLANT_CD = cVc2PLANT_CD;


    --�y���Y�v���z�@    --U
    CURSOR  CurPRD_REQ_1(
        cVc2PLANT_CD     VARCHAR2        --   26.�H��R�[�h    
        )IS
    SELECT  COMPANY_CD,             --   1.��ЃR�[�h              NOT NULL VARCHAR2(100)
            SLIP_TYP,               --   2.�`�[���                NOT NULL NUMBER(2)
            SLIP_CTRL_GRP,          --   3.�`�[�Ǘ��O���[�v        NOT NULL VARCHAR2(100)
            SLIP_CD,                --   4.�`�[�ԍ�                NOT NULL VARCHAR2(100)
            SLIP_DATE,              --   5.�`�[���t                NOT NULL DATE
            LINE_NO,                --   6.�s                      NOT NULL NUMBER(6)
            UNCONFIRM_ODR_TYP,      --   7.�����󒍋敪            NOT NULL NUMBER(2)
            JOB_ODR_FLG,            --   8.�ʎ󒍃t���O          NOT NULL NUMBER(1)
            CUST_CD,                --   9.���Ӑ�R�[�h                     VARCHAR2(100)
            CUST_NAME,              --  10.���Ӑ於                         VARCHAR2(160)
            BRANCH_CD,              --  11.�x�X�R�[�h                       VARCHAR2(100)
            BRANCH_NAME,            --  12.�x�X��                           VARCHAR2(160)
            DIRECT_DLV_TYP,         --  13.���[�敪                NOT NULL NUMBER(2)
            DLV_LOC_CD,             --  14.�[�i�ꏊ�R�[�h                   VARCHAR2(100)
            DLV_LOC_NAME,           --  15.�[�i�ꏊ��                       VARCHAR2(160)
            COMM_CD,                --  16.���i�R�[�h                       VARCHAR2(100)
            COMM_NAME,              --  17.���i��                           VARCHAR2(160)
            SPEC,                   --  18.�K�i                             VARCHAR2(160)
            COMM_SIZE,              --  19.�T�C�Y                           VARCHAR2(100)
            COLOR,                  --  20.�F                               VARCHAR2(160)
            PRD_COMM_CODE_CHG_TYP,  --  21.���i�^���i�ϊ��敪      NOT NULL NUMBER(2)
            SCDL_SHIP_DATE,         --  22.�o�ח\���              NOT NULL DATE
            SCDL_DLV_DATE,          --  23.�[�i�\���              NOT NULL DATE
            REQ_PRD_ISSUE_DATE,     --  24.�o�ɗv����              NOT NULL DATE
            SHIP_WH_CD,             --  25.�o�בq�ɃR�[�h          NOT NULL VARCHAR2(100)
--
                    PLANT_CD,           --  26.�H��R�[�h              NOT NULL VARCHAR2(8) 
            WH_CD,                  --  27.�ۊǋ�R�[�h                     VARCHAR2(100)
            REQ_PRD_QTY,            --  28.�v������                NOT NULL NUMBER(18,4)
            TOTAL_SHIP_QTY,         --  29.�o�׎��ї݌v��          NOT NULL NUMBER(18,4)
            ODR_CHG_FLG,            --  30.�󒍕ϓ����t���O      NOT NULL NUMBER(1)
            ODR_DEL_FLG,            --  31.�󒍍폜�t���O          NOT NULL NUMBER(1)
            ODR_ACPT_JOB_ODR_NO,    --  32.�󒍐���                         VARCHAR2(100)
            ITEM_CD,                --  33.�i�ڔԍ�                         VARCHAR2(100)
            MRP_ODR_TYP,            --  34.�i�ڎ�z�敪            NOT NULL NUMBER(2)
            OD_TYP,      --  35.�I�[�_�f�}���h�敪      NOT NULL NUMBER(2)
            OD_NO,        --  36.�I�[�_�f�}���h�ԍ�      NOT NULL NUMBER(14)
            JOB_ODR_CD,             --  37.����                             VARCHAR2(100)
            JOB_ODR_DETAIL_NO,      --  38.���Ԏ}��                NOT NULL NUMBER(6)
            PRD_PLAN_TYP,           --  39.���Y�v��Ώۋ敪        NOT NULL NUMBER(2)
            PRD_ERROR_TYP,          --  40.���Y���G���[�敪      NOT NULL NUMBER(2)
            PRD_ALARM_FLG,          --  41.���Y�A���[���t���O      NOT NULL NUMBER(1)
            PRVS_COMM_CD,           --  42.�O�񏤕i�R�[�h                   VARCHAR2(100)
            PRVS_COMM_NAME,         --  43.�O�񏤕i��                       VARCHAR2(160)
            PRVS_SPEC,              --  44.�O��K�i                         VARCHAR2(160)
            PRVS_ITEM_CD,           --  45.�O��i�ڔԍ�                     VARCHAR2(100)
            PRVS_MRP_ODR_TYP,       --  46.�O��i�ڎ�z�敪        NOT NULL NUMBER(2)
            PRVS_SCDL_SHIP_DATE,    --  47.�O��o�ח\���                   DATE
            PRVS_DLV_DATE,          --  48.�O��[�i�\���                   DATE
            PRVS_ODR_SHIP_DATE,     --  49.�O��o�ɗv����                   DATE
            PRVS_REQ_QTY,           --  50.�O��v������            NOT NULL NUMBER(18,4)
            PRVS_OD_NO,             --  51.�O��I�[�_�f�}���h�ԍ�  NOT NULL NUMBER(14)
            PRVS_JOB_ODR_CD,        --  52.�O�񐻔�                         VARCHAR2(100)
            PRVS_JOB_ODR_DETAIL_NO, --  53.�O�񐻔Ԏ}��            NOT NULL NUMBER(6)
--            
                    SEQ_NO,                             --  54.�����A��                NOT NULL NUMBER(6)           
                    CREATED_DATE,           --  55.�쐬��                  NOT NULL DATE
            CREATED_BY,             --  56.�쐬��              NOT NULL VARCHAR2(100)
            CREATED_PRG_NM,         --  57.�쐬�v���O������        NOT NULL VARCHAR2(120)
            UPDATED_DATE,           --  58.�X�V��              NOT NULL DATE
            UPDATED_BY,             --  59.�X�V��              NOT NULL VARCHAR2(100)
            UPDATED_PRG_NM,         --  60.�X�V�v���O������  �@    NOT NULL VARCHAR2(120)
            MODIFY_COUNT            --  61.�X�V��                  NOT NULL NUMBER
    FROM    T_PRD_REQ               --[���Y�v��]
    WHERE PLANT_CD = cVc2PLANT_CD    --U
    ORDER BY COMPANY_CD
            ,SLIP_TYP
            ,SLIP_CTRL_GRP
            ,SLIP_CD
            ,SLIP_DATE
            ,SEQ_NO
    FOR UPDATE;

    --�y���Y�v���z�A  --U
    CURSOR  CurPRD_REQ_2(
        cVc2COMPANY_CD      VARCHAR2,   --   1.��ЃR�[�h
        cNumSLIP_TYP        NUMBER,     --   2.�`�[���
        cVc2SLIP_CTRL_GRP   VARCHAR2,   --   3.�`�[�Ǘ��O���[�v
        cVc2SLIP_CD         VARCHAR2,   --   4.�`�[�ԍ�
        cDtmSLIP_DATE       DATE,       --   5.�`�[���t
        cNumSEQ_NO          NUMBER,      --   59.�����A��
        cVc2PLANT_CD        VARCHAR2   --   26.�H��R�[�h
    )IS
    SELECT  COMPANY_CD,             --   1.��ЃR�[�h              NOT NULL VARCHAR2(100)
            SLIP_TYP,               --   2.�`�[���                NOT NULL NUMBER(2)
            SLIP_CTRL_GRP,          --   3.�`�[�Ǘ��O���[�v        NOT NULL VARCHAR2(100)
            SLIP_CD,                --   4.�`�[�ԍ�                NOT NULL VARCHAR2(100)
            SLIP_DATE,              --   5.�`�[���t                NOT NULL DATE
            LINE_NO,                --   6.�s                      NOT NULL NUMBER(6)
            UNCONFIRM_ODR_TYP,      --   7.�����󒍋敪            NOT NULL NUMBER(2)
            JOB_ODR_FLG,            --   8.�ʎ󒍃t���O          NOT NULL NUMBER(1)
            CUST_CD,                --   9.���Ӑ�R�[�h                     VARCHAR2(100)
            CUST_NAME,              --  10.���Ӑ於                         VARCHAR2(160)
            BRANCH_CD,              --  11.�x�X�R�[�h                       VARCHAR2(100)
            BRANCH_NAME,            --  12.�x�X��                           VARCHAR2(160)
            DIRECT_DLV_TYP,         --  13.���[�敪                NOT NULL NUMBER(2)
            DLV_LOC_CD,             --  14.�[�i�ꏊ�R�[�h                   VARCHAR2(100)
            DLV_LOC_NAME,           --  15.�[�i�ꏊ��                       VARCHAR2(160)
            COMM_CD,                --  16.���i�R�[�h                       VARCHAR2(100)
            COMM_NAME,              --  17.���i��                           VARCHAR2(160)
            SPEC,                   --  18.�K�i                             VARCHAR2(160)
            COMM_SIZE,              --  19.�T�C�Y                           VARCHAR2(100)
            COLOR,                  --  20.�F                               VARCHAR2(160)
            PRD_COMM_CODE_CHG_TYP,  --  21.���i�^���i�ϊ��敪      NOT NULL NUMBER(2)
            SCDL_SHIP_DATE,         --  22.�o�ח\���              NOT NULL DATE
            SCDL_DLV_DATE,          --  23.�[�i�\���              NOT NULL DATE
            REQ_PRD_ISSUE_DATE,     --  24.�o�ɗv����              NOT NULL DATE
            SHIP_WH_CD,             --  25.�o�בq�ɃR�[�h          NOT NULL VARCHAR2(100)
--
                    PLANT_CD,                           --  26.�H��R�[�h              NOT NULL VARCHAR2(8) 
            WH_CD,                  --  27.�ۊǋ�R�[�h                     VARCHAR2(100)
            REQ_PRD_QTY,            --  28.�v������                NOT NULL NUMBER(18,4)
            TOTAL_SHIP_QTY,         --  29.�o�׎��ї݌v��          NOT NULL NUMBER(18,4)
            ODR_CHG_FLG,            --  30.�󒍕ϓ����t���O      NOT NULL NUMBER(1)
            ODR_DEL_FLG,            --  31.�󒍍폜�t���O          NOT NULL NUMBER(1)
            ODR_ACPT_JOB_ODR_NO,    --  32.�󒍐���                         VARCHAR2(100)
            ITEM_CD,                --  33.�i�ڔԍ�                         VARCHAR2(100)
            MRP_ODR_TYP,            --  34.�i�ڎ�z�敪            NOT NULL NUMBER(2)
            OD_TYP,      --  35.�I�[�_�f�}���h�敪      NOT NULL NUMBER(2)
            OD_NO,        --  36.�I�[�_�f�}���h�ԍ�      NOT NULL NUMBER(14)
            JOB_ODR_CD,             --  37.����                             VARCHAR2(100)
            JOB_ODR_DETAIL_NO,      --  38.���Ԏ}��                NOT NULL NUMBER(6)
            PRD_PLAN_TYP,           --  39.���Y�v��Ώۋ敪        NOT NULL NUMBER(2)
            PRD_ERROR_TYP,          --  40.���Y���G���[�敪      NOT NULL NUMBER(2)
            PRD_ALARM_FLG,          --  41.���Y�A���[���t���O      NOT NULL NUMBER(1)
            PRVS_COMM_CD,           --  42.�O�񏤕i�R�[�h                   VARCHAR2(100)
            PRVS_COMM_NAME,         --  43.�O�񏤕i��                       VARCHAR2(160)
            PRVS_SPEC,              --  44.�O��K�i                         VARCHAR2(160)
            PRVS_ITEM_CD,           --  45.�O��i�ڔԍ�                     VARCHAR2(100)
            PRVS_MRP_ODR_TYP,       --  46.�O��i�ڎ�z�敪        NOT NULL NUMBER(2)
            PRVS_SCDL_SHIP_DATE,    --  47.�O��o�ח\���                   DATE
            PRVS_DLV_DATE,          --  48.�O��[�i�\���                   DATE
            PRVS_ODR_SHIP_DATE,     --  49.�O��o�ɗv����                   DATE
            PRVS_REQ_QTY,           --  50.�O��v������            NOT NULL NUMBER(18,4)
            PRVS_OD_NO,             --  51.�O��I�[�_�f�}���h�ԍ�  NOT NULL NUMBER(14)
            PRVS_JOB_ODR_CD,        --  52.�O�񐻔�                         VARCHAR2(100)
            PRVS_JOB_ODR_DETAIL_NO, --  53.�O�񐻔Ԏ}��            NOT NULL NUMBER(6)
--            
        SEQ_NO,         --  54.�����A��                NOT NULL NUMBER(6)           
        CREATED_DATE,           --  55.�쐬��                  NOT NULL DATE
            CREATED_BY,             --  56.�쐬��              NOT NULL VARCHAR2(100)
            CREATED_PRG_NM,         --  57.�쐬�v���O������        NOT NULL VARCHAR2(120)
            UPDATED_DATE,           --  58.�X�V��              NOT NULL DATE
            UPDATED_BY,             --  59.�X�V��              NOT NULL VARCHAR2(100)
            UPDATED_PRG_NM,         --  60.�X�V�v���O������  �@    NOT NULL VARCHAR2(120)
            MODIFY_COUNT            --  61.�X�V��                  NOT NULL NUMBER
    FROM    T_PRD_REQ           --[���Y�v��]
    WHERE   COMPANY_CD      = cVc2COMPANY_CD            --   1.��ЃR�[�h
    AND     SLIP_TYP        = cNumSLIP_TYP              --   2.�`�[���
    AND     SLIP_CTRL_GRP   = cVc2SLIP_CTRL_GRP         --   3.�`�[�Ǘ��O���[�v
    AND     SLIP_CD         = cVc2SLIP_CD               --   4.�`�[�ԍ�
    AND     SLIP_DATE       = cDtmSLIP_DATE             --   5.�`�[���t
    AND     SEQ_NO          = cNumSEQ_NO                --   59.�����A��
    AND     PLANT_CD = cVc2PLANT_CD             --   �H��R�[�h�@�@�@�@�@U
    FOR UPDATE;

    --�y���Y�v���C���^�t�F�[�X�z
    CURSOR  CurREQ_PRD_ODR_IF(
        cVc2PLANT_CD     VARCHAR2        --   25.�H��R�[�h    
        )IS
    SELECT  COMPANY_CD,                 --   1.��ЃR�[�h              NOT NULL VARCHAR2(100)
            SLIP_TYP,                   --   2.�`�[���                NOT NULL NUMBER(2)
            SLIP_CTRL_GRP,              --   3.�`�[�Ǘ��O���[�v        NOT NULL VARCHAR2(100)
            SLIP_CD,                    --   4.�`�[�ԍ�                NOT NULL VARCHAR2(100)
            SLIP_DATE,                  --   5.�`�[���t                NOT NULL DATE
            LINE_NO,                    --   6.�s                      NOT NULL NUMBER(6)
            UNCONFIRM_ODR_TYP,          --   7.�����󒍋敪            NOT NULL NUMBER(2)
            JOB_ODR_FLG,                --   8.�ʎ󒍃t���O          NOT NULL NUMBER(1)
            CUST_CD,                    --   9.���Ӑ�R�[�h                     VARCHAR2(100)
            CUST_NAME,                  --  10.���Ӑ於                         VARCHAR2(160)
            BRANCH_CD,                  --  11.�x�X�R�[�h                       VARCHAR2(100)
            BRANCH_NAME,                --  12.�x�X��                           VARCHAR2(160)
            DIRECT_DLV_TYP,             --  13.���[�敪                NOT NULL NUMBER(2)
            DLV_LOC_CD,                 --  14.�[�i�ꏊ�R�[�h                   VARCHAR2(100)
            DLV_LOC_NAME,               --  15.�[�i�ꏊ��                       VARCHAR2(160)
            COMM_CD,                    --  16.���i�R�[�h                       VARCHAR2(100)
            COMM_NAME,                  --  17.���i��                           VARCHAR2(160)
            SPEC,                       --  18.�K�i                             VARCHAR2(160)
            COMM_SIZE,                  --  19.�T�C�Y                           VARCHAR2(100)
            COLOR,                      --  20.�F                               VARCHAR2(160)
            PRD_COMM_CODE_CHG_TYP,      --  21.���i�^���i�ϊ��敪      NOT NULL NUMBER(2)
            SCDL_SHIP_DATE,             --  22.�o�ח\���              NOT NULL DATE
            SCDL_DLV_DATE,              --  23.�[�i�\���              NOT NULL DATE
            REQ_PRD_ISSUE_DATE,         --  24.�o�ɗv����              NOT NULL DATE
            PLANT_CD,                   --  25.�H��R�[�h          NOT NULL VARCHAR2(8) 
            SHIP_WH_CD,                 --  26.�o�בq�ɃR�[�h          NOT NULL VARCHAR2(100)
            WH_CD,                      --  27.�ۊǋ�R�[�h                     VARCHAR2(100)
            REQ_PRD_QTY,                --  28.�v������                NOT NULL NUMBER(18,4)
            TOTAL_SHIP_QTY,             --  29.�o�׎��ї݌v��          NOT NULL NUMBER(18,4)
            ODR_CHG_FLG,                --  30.�󒍕ϓ����t���O      NOT NULL NUMBER(1)
            ODR_DEL_FLG,                --  31.�󒍍폜�t���O          NOT NULL NUMBER(1)
            ODR_ACPT_JOB_ODR_NO,        --  32.�󒍐���                         VARCHAR2(100)
            ITEM_CD,                    --  33.�i�ڔԍ�                         VARCHAR2(100)
            MRP_ODR_TYP,                --  34.�i�ڎ�z�敪            NOT NULL NUMBER(2)
            OD_TYP,          --  35.�I�[�_�f�}���h�敪      NOT NULL NUMBER(2)
            OD_NO,            --  36.�I�[�_�f�}���h�ԍ�      NOT NULL NUMBER(14)
            JOB_ODR_CD,                 --  37.����                             VARCHAR2(100)
            JOB_ODR_DETAIL_NO,          --  38.���Ԏ}��                NOT NULL NUMBER(6)
            PRD_ERROR_TYP,              --  39.���Y���G���[�敪      NOT NULL NUMBER(2)
            SEQ_NO,                      --  42.�����A��               NUMBER(6,0) DEFAULT 0 NOT NULL
            CREATED_DATE,                --  43.�쐬��             DATE DEFAULT sysdate NOT NULL
            CREATED_BY,                  --  44.�쐬��                  VARCHAR2(100) DEFAULT 'SYSTEM' NOT NULL
            CREATED_PRG_NM,              --  45.�쐬�v���O����          VARCHAR2(120) DEFAULT 'SYSTEM' NOT NULL
            UPDATED_DATE,                --  46.�X�V��                  DATE DEFAULT sysdate NOT NULL
            UPDATED_BY,                  --  47.�X�V��                  VARCHAR2(100) DEFAULT 'SYSTEM' NOT NULL
            UPDATED_PRG_NM,              --  48.�X�V�v���O����          VARCHAR2(120) DEFAULT 'SYSTEM' NOT NULL
            MODIFY_COUNT                --  49.�X�V��                  NUMBER DEFAULT 0 NOT NULL
    FROM    T_REQ_PRD_ODR_IF            --[���Y�v���C���^�t�F�[�X]
    WHERE   PLANT_CD = cVc2PLANT_CD             --   �H��R�[�h�@�@�@�@�@U
    ORDER BY
             SLIP_CD
            ,SEQ_NO
            ,SLIP_DATE
            ,SLIP_CTRL_GRP
            ,COMPANY_CD
            ,SLIP_TYP
    FOR UPDATE;

    --�y�i�ځz
    CURSOR  CurITEM(
        cVc2ITEM_CD     VARCHAR2        --�i�ڔԍ�
    )IS
    SELECT  MRP_ODR_TYP                --�i�ڎ�z�敪
    FROM    M_ITEM                      --[�i��]
    WHERE   ITEM_CD = cVc2ITEM_CD;      --�i�ڔԍ�

-----------------
-- ROWTYPE�錾 --
-----------------
    RtpPRD_REQ_CTRL     CurPRD_REQ_CTRL%ROWTYPE;        --�y���Y�v������z
    RtpPRD_REQ          CurPRD_REQ_1%ROWTYPE;           --�y���Y�v���z
    RtpREQ_PRD_ODR_IF   CurREQ_PRD_ODR_IF%ROWTYPE;      --�y���Y�v���C���^�t�F�[�X�z
    RtpITEM             CurITEM%ROWTYPE;                --�y�i�ځz

-----------------
-- CONST�l�錾 --
-----------------
    MY_SQL_NAME         VARCHAR2(120) := 'FncCommitemChg';
    CTRL_CD_DEFAULT     VARCHAR2(24)  := 'SYSTEM';               --�R���g���[���n�e�[�u����PrimaryKey�̒l

-----------------
-- MESSAGE�錾 --
-----------------
    APS_COM_ORACLE_ERR  VARCHAR2(28)   := 'AK53401';       --ORACLE Error
    APS_COM_OTHER_ERR   VARCHAR2(28)   := 'AK53402';       --���̑� Error
    APS_PROC_CNT        VARCHAR2(28)   := 'AK53412';       --��������

-------------
-- LOG�錾 --
-------------
    LOGMSG_START        VARCHAR2(20) := 'Start';     -- ���O�p���\�b�h�J�n�錾
    LOGMSG_END          VARCHAR2(12) := 'End';       -- ���O�p���\�b�h�I���錾
    LOGMSG_ERR          VARCHAR2(32) := '�ُ�I��';
--------------
-- WORK�ϐ� --
--------------
    BlnRet                      BOOLEAN;        -- Function�ԋp�l
    vc2Comment                  VARCHAR2(1024);  -- ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    NumErrNumber                NUMBER(5);
    DtmBusinessOprDate          DATE;
    DtmActiveDate1              DATE;
    DtmActiveDate2              DATE;
    vc2RunChkComment            VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    NumCnt_REQ_PRD_ODR_IF       NUMBER(10);     --�y���Y�v���C���^�t�F�[�X�z��������
    num_REQ_PRD_ODR_IF_Count    NUMBER(10);     --�y���Y�v���C���^�t�F�[�X�z���o����
    num_PRD_REQ_Count           NUMBER(10);     --�y���Y�v���t�@�C���z���o����
    BlnPRD_REQ_FOUND            BOOLEAN;

----------------
-- �G���[���� --
----------------
    Err_FncGetBusinessDate      EXCEPTION;      --[�Ɩ��^�p���t�擾]���s�G���[
    Err_NOT_PRD_REQ_CTRL        EXCEPTION;      --[���Y�v������]NOT FOUND
    Err_FncWorkDayCalc          EXCEPTION;      --[�ғ��������Z�o]���s�G���[

BEGIN

    -- TraceLog �̏o��
    blnRet := FncTraceLog(pFileHandle, pVc2LogMode, pVc2OutputMode, 
                          pvc2UserId,  pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,LOGMSG_START);

--vc2RunChkComment := 'COMMITEMCHG_001';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --�Ɩ��^�p���t���擾
    blnRet := FncGetBusinessDate(pFileHandle,   pVc2LogMode,        pVc2OutputMode,  
                                 pvc2UserId,    pvc2BusinessName, pvc2PlantCd,  DtmBusinessOprDate); --U
    IF BlnRet = FALSE THEN
        RAISE Err_FncGetBusinessDate;       --[�Ɩ��^�p���t�擾]���s�G���[
    END IF;

--vc2RunChkComment := 'COMMITEMCHG_002';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --�A���[���Ώۊ��Ԏ擾
    OPEN CurPRD_REQ_CTRL(pvc2PlantCd);
    FETCH CurPRD_REQ_CTRL INTO RtpPRD_REQ_CTRL;
    IF CurPRD_REQ_CTRL%NOTFOUND THEN
        CLOSE CurPRD_REQ_CTRL;
        RAISE Err_NOT_PRD_REQ_CTRL;         --[���Y�v������]NOT FOUND
    END IF;
    CLOSE CurPRD_REQ_CTRL;

--vc2RunChkComment := 'COMMITEMCHG_003';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --�ғ��������Z�o
    blnRet := FncWorkDayCalc(pFileHandle,       pVc2LogMode,    pVc2OutputMode,      pvc2UserId,
                             pvc2BusinessName,  pvc2PlantCd,    null,                DtmBusinessOprDate, RtpPRD_REQ_CTRL.ALARM_PERIOD,
                             FALSE,             DtmActiveDate1);
    IF BlnRet = FALSE THEN
        RAISE Err_FncWorkDayCalc;           --[�ғ��������Z�o]���s�G���[
    END IF;

--vc2RunChkComment := 'COMMITEMCHG_004';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --�y���Y�v���C���^�t�F�[�X�z���������̏�����
    NumCnt_REQ_PRD_ODR_IF := 0;

    --�y���Y�v���t�@�C���z�̃f�[�^�����擾
    SELECT COUNT(*) INTO num_PRD_REQ_Count
      FROM T_PRD_REQ WHERE COMM_CD IS NOT NULL
      AND PLANT_CD =    pvc2PlantCd;  --U

    --�y���Y�v���C���^�t�F�[�X�z�̃f�[�^�����擾
    SELECT COUNT(*) INTO num_REQ_PRD_ODR_IF_Count
      FROM T_REQ_PRD_ODR_IF WHERE PLANT_CD =    pvc2PlantCd; --U

--vc2RunChkComment := 'COMMITEMCHG_005';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --�y���Y�v���t�@�C���z�̃f�[�^���� > 0
    IF num_PRD_REQ_Count > 0 THEN

--vc2RunChkComment := 'COMMITEMCHG_006';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        OPEN CurPRD_REQ_1(pvc2PlantCd);  --[���Y�v���t�@�C��]
        LOOP
            FETCH CurPRD_REQ_1 INTO RtpPRD_REQ;
            IF CurPRD_REQ_1%NOTFOUND THEN
                EXIT;
            END IF;

--vc2RunChkComment := 'COMMITEMCHG_007';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --���Y�v���t�@�C��.���i�R�[�h = NULL�̏ꍇ�A���Y�v���t�@�C���폜
            --NULL�ȊO�̏ꍇ�A���Y�v���̐V���̍��ڂ������̍��ڂֈڑ����A�V���̍��ڂ�������������ōX�V���s���B
            DELETE  T_PRD_REQ       --[���Y�v��]
                WHERE   COMPANY_CD      = RtpPRD_REQ.COMPANY_CD         --   1.��ЃR�[�h
                AND     SLIP_TYP        = RtpPRD_REQ.SLIP_TYP           --   2.�`�[���
                AND     SLIP_CTRL_GRP   = RtpPRD_REQ.SLIP_CTRL_GRP      --   3.�`�[�Ǘ��O���[�v
                AND     SLIP_CD         = RtpPRD_REQ.SLIP_CD            --   4.�`�[�ԍ�
                AND     SLIP_DATE       = RtpPRD_REQ.SLIP_DATE          --   5.�`�[���t
                AND     LINE_NO         = RtpPRD_REQ.LINE_NO            --   6.�s
        AND       PLANT_CD  = pvc2PlantCd;                --U



            IF RtpPRD_REQ.COMM_CD IS NULL THEN
                NULL;
            ELSE

                RtpPRD_REQ.PRVS_COMM_CD             := RtpPRD_REQ.COMM_CD;              --  42.�O�񏤕i�R�[�h                   VARCHAR2(100)
                RtpPRD_REQ.PRVS_COMM_NAME           := RtpPRD_REQ.COMM_NAME;            --  43.�O�񏤕i��                       VARCHAR2(160)
                RtpPRD_REQ.PRVS_SPEC                := RtpPRD_REQ.SPEC;                 --  44.�O��K�i                         VARCHAR2(160)
                RtpPRD_REQ.PRVS_ITEM_CD             := RtpPRD_REQ.ITEM_CD;              --  45.�O��i�ڔԍ�                     VARCHAR2(100)
                RtpPRD_REQ.PRVS_MRP_ODR_TYP         := RtpPRD_REQ.MRP_ODR_TYP;          --  46.�O��i�ڎ�z�敪        NOT NULL NUMBER(2)
                RtpPRD_REQ.PRVS_SCDL_SHIP_DATE      := RtpPRD_REQ.SCDL_SHIP_DATE;       --  47.�O��o�ח\���                   DATE
                RtpPRD_REQ.PRVS_DLV_DATE            := RtpPRD_REQ.SCDL_DLV_DATE;        --  48.�O��[�i�\���                   DATE
                RtpPRD_REQ.PRVS_ODR_SHIP_DATE       := RtpPRD_REQ.REQ_PRD_ISSUE_DATE;   --  49.�O��o�ɗv����                   DATE
                RtpPRD_REQ.PRVS_REQ_QTY             := RtpPRD_REQ.REQ_PRD_QTY;          --  50.�O��v������            NOT NULL NUMBER(18,4)
                RtpPRD_REQ.PRVS_OD_NO               := RtpPRD_REQ.OD_NO;      --  51.�O��I�[�_�f�}���h�ԍ�  NOT NULL NUMBER(14)
                RtpPRD_REQ.PRVS_JOB_ODR_CD          := RtpPRD_REQ.JOB_ODR_CD;           --  52.�O�񐻔�                         VARCHAR2(100)
                RtpPRD_REQ.PRVS_JOB_ODR_DETAIL_NO   := RtpPRD_REQ.JOB_ODR_DETAIL_NO;    --  53.�O�񐻔Ԏ}��            NOT NULL NUMBER(6)

                RtpPRD_REQ.UNCONFIRM_ODR_TYP        := 0;                               --   7.�����󒍋敪            NOT NULL NUMBER(2)
                RtpPRD_REQ.JOB_ODR_FLG              := 0;                               --   8.�ʎ󒍃t���O          NOT NULL NUMBER(1)
                RtpPRD_REQ.CUST_CD                  := NULL;                            --   9.���Ӑ�R�[�h                     VARCHAR2(100)
                RtpPRD_REQ.CUST_NAME                := NULL;                            --  10.���Ӑ於                         VARCHAR2(160)
                RtpPRD_REQ.BRANCH_CD                := NULL;                            --  11.�x�X�R�[�h                       VARCHAR2(100)
                RtpPRD_REQ.BRANCH_NAME              := NULL;                            --  12.�x�X��                           VARCHAR2(160)
                RtpPRD_REQ.DIRECT_DLV_TYP           := 0;                               --  13.���[�敪                NOT NULL NUMBER(2)
                RtpPRD_REQ.DLV_LOC_CD               := NULL;                            --  14.�[�i�ꏊ�R�[�h                   VARCHAR2(100)
                RtpPRD_REQ.DLV_LOC_NAME             := NULL;                            --  15.�[�i�ꏊ��                       VARCHAR2(160)
                RtpPRD_REQ.COMM_CD                  := NULL;                            --  16.���i�R�[�h                       VARCHAR2(100)
                RtpPRD_REQ.COMM_NAME                := NULL;                            --  17.���i��                           VARCHAR2(160)
                RtpPRD_REQ.SPEC                     := NULL;                            --  18.�K�i                             VARCHAR2(160)
                RtpPRD_REQ.COMM_SIZE                := NULL;                            --  19.�T�C�Y                           VARCHAR2(100)
                RtpPRD_REQ.COLOR                    := NULL;                            --  20.�F                               VARCHAR2(160)
                RtpPRD_REQ.PRD_COMM_CODE_CHG_TYP    := 0;                               --  21.���i�^���i�ϊ��敪      NOT NULL NUMBER(2)
        RtpPRD_REQ.WH_CD                    := NULL;                            --  27.�ۊǋ�R�[�h                     VARCHAR2(100)
                RtpPRD_REQ.REQ_PRD_QTY              := 0;                               --  28.�v������                NOT NULL NUMBER(18,4)
                RtpPRD_REQ.TOTAL_SHIP_QTY           := 0;                               --  29.�o�׎��ї݌v��          NOT NULL NUMBER(18,4)
                RtpPRD_REQ.ODR_CHG_FLG              := 0;                               --  30.�󒍕ϓ����t���O      NOT NULL NUMBER(1)
                RtpPRD_REQ.ODR_DEL_FLG              := 0;                               --  31.�󒍍폜�t���O          NOT NULL NUMBER(1)
                RtpPRD_REQ.ODR_ACPT_JOB_ODR_NO      := NULL;                            --  32.�󒍐���                         VARCHAR2(100)
                RtpPRD_REQ.ITEM_CD                  := NULL;                            --  33.�i�ڔԍ�                         VARCHAR2(100)
                RtpPRD_REQ.OD_TYP        := 0;                               --  35.�I�[�_�f�}���h�敪      NOT NULL NUMBER(2)
                RtpPRD_REQ.OD_NO          := 0;                               --  36.�I�[�_�f�}���h�ԍ�      NOT NULL NUMBER(14)
                RtpPRD_REQ.JOB_ODR_CD               := '0';                             --  37.����                             VARCHAR2(100)
                RtpPRD_REQ.JOB_ODR_DETAIL_NO        := 0;                               --  38.���Ԏ}��                NOT NULL NUMBER(6)
                RtpPRD_REQ.PRD_PLAN_TYP             := 2;                               --  39.���Y�v��Ώۋ敪        NOT NULL NUMBER(2)
                RtpPRD_REQ.PRD_ALARM_FLG            := 0;                               --  41.���Y�A���[���t���O      NOT NULL NUMBER(1)

                INSERT INTO T_PRD_REQ(
                    COMPANY_CD,             SLIP_TYP,               --   1.��ЃR�[�h            2.�`�[���
                    SLIP_CTRL_GRP,          SLIP_CD,                --   3.�`�[�Ǘ��O���[�v      4.�`�[�ԍ�
                    SLIP_DATE,              LINE_NO,                --   5.�`�[���t              6.�s
                    UNCONFIRM_ODR_TYP,      JOB_ODR_FLG,            --   7.�����󒍋敪          8.�ʎ󒍃t���O
                    CUST_CD,                CUST_NAME,              --   9.���Ӑ�R�[�h         10.���Ӑ於
                    BRANCH_CD,              BRANCH_NAME,            --  11.�x�X�R�[�h           12.�x�X��
                    DIRECT_DLV_TYP,         DLV_LOC_CD,             --  13.���[�敪             14.�[�i�ꏊ�R�[�h
                    DLV_LOC_NAME,           COMM_CD,                --  15.�[�i�ꏊ��           16.���i�R�[�h
                    COMM_NAME,              SPEC,                   --  17.���i��               18.�K�i
                    COMM_SIZE,              COLOR,                  --  19.�T�C�Y               20.�F
                    PRD_COMM_CODE_CHG_TYP,  SCDL_SHIP_DATE,         --  21.���i�^���i�ϊ��敪   22.�o�ח\���
                    SCDL_DLV_DATE,          REQ_PRD_ISSUE_DATE,     --  23.�[�i�\���           24.�o�ɗv����
                SHIP_WH_CD,                             --  25.�o�בq�ɃR�[�h
--
            PLANT_CD,                               --  26.�H��R�[�h
--
                    WH_CD,                      --  27.�ۊǋ�R�[�h 
                    REQ_PRD_QTY,            TOTAL_SHIP_QTY,         --  28.�v������             29.�o�׎��ї݌v��
                    ODR_CHG_FLG,            ODR_DEL_FLG,            --  30.�󒍕ϓ����t���O   31.�󒍍폜�t���O
                    ODR_ACPT_JOB_ODR_NO,    ITEM_CD,                --  32.�󒍐���             33.�i�ڔԍ�
                    MRP_ODR_TYP,            OD_TYP,      --  34.�i�ڎ�z�敪         35.�I�[�_�f�}���h�敪
                    OD_NO,        JOB_ODR_CD,             --  36.�I�[�_�f�}���h�ԍ�   37.����
                    JOB_ODR_DETAIL_NO,      PRD_PLAN_TYP,           --  38.���Ԏ}��             39.���Y�v��Ώۋ敪
                    PRD_ERROR_TYP,          PRD_ALARM_FLG,          --  40.���Y���G���[�敪   41.���Y�A���[���t���O
                    PRVS_COMM_CD,           PRVS_COMM_NAME,         --  42.�O�񏤕i�R�[�h       43.�O�񏤕i��
                    PRVS_SPEC,              PRVS_ITEM_CD,           --  44.�O��K�i             45.�O��i�ڔԍ�
                    PRVS_MRP_ODR_TYP,       PRVS_SCDL_SHIP_DATE,    --  46.�O��i�ڎ�z�敪     47.�O��o�ח\���
                    PRVS_DLV_DATE,          PRVS_ODR_SHIP_DATE,     --  48.�O��[�i�\���       49.�O��o�ɗv����
                    PRVS_REQ_QTY,           PRVS_OD_NO,             --  50.�O��v������         51.�O��I�[�_�f�}���h�ԍ�
                    PRVS_JOB_ODR_CD,        PRVS_JOB_ODR_DETAIL_NO, --  52.�O�񐻔�             53.�O�񐻔Ԏ}��
--
            SEQ_NO,                     --  54.�����A�� 
            CREATED_DATE,       CREATED_BY        , --  55.�쐬��       56.�쐬��                      
            CREATED_PRG_NM,     UPDATED_DATE      , --  57.�쐬�v���O������ 58.�X�V��
            UPDATED_BY,         UPDATED_PRG_NM        , --  59.�X�V��               60.�X�V�v���O������         
            MODIFY_COUNT                        --  61.�X�V�� 
--
                )VALUES(
                    RtpPRD_REQ.COMPANY_CD,              RtpPRD_REQ.SLIP_TYP,                --  1,  2,
                    RtpPRD_REQ.SLIP_CTRL_GRP,           RtpPRD_REQ.SLIP_CD,                 --  3,  4,
                    RtpPRD_REQ.SLIP_DATE,               RtpPRD_REQ.LINE_NO,                 --  5,  6,
                    RtpPRD_REQ.UNCONFIRM_ODR_TYP,       RtpPRD_REQ.JOB_ODR_FLG,             --  7,  8,
                    RtpPRD_REQ.CUST_CD,                 RtpPRD_REQ.CUST_NAME,               --  9, 10,
                    RtpPRD_REQ.BRANCH_CD,               RtpPRD_REQ.BRANCH_NAME,             -- 11, 12,
                    RtpPRD_REQ.DIRECT_DLV_TYP,          RtpPRD_REQ.DLV_LOC_CD,              -- 13, 14,
                    RtpPRD_REQ.DLV_LOC_NAME,            RtpPRD_REQ.COMM_CD,                 -- 15, 16,
                    RtpPRD_REQ.COMM_NAME,               RtpPRD_REQ.SPEC,                    -- 17, 18,
                    RtpPRD_REQ.COMM_SIZE,               RtpPRD_REQ.COLOR,                   -- 19, 20,
                    RtpPRD_REQ.PRD_COMM_CODE_CHG_TYP,   RtpPRD_REQ.SCDL_SHIP_DATE,          -- 21, 22,
                    RtpPRD_REQ.SCDL_DLV_DATE,           RtpPRD_REQ.REQ_PRD_ISSUE_DATE,      -- 23, 24,
                    RtpPRD_REQ.SHIP_WH_CD,                                      --25,
            
--
            RtpPRD_REQ.PLANT_CD,                            --26 �H��R�[�h
--
            RtpPRD_REQ.WH_CD,                   -- 27, 
                    RtpPRD_REQ.REQ_PRD_QTY,             RtpPRD_REQ.TOTAL_SHIP_QTY,          -- 28, 29,
                    RtpPRD_REQ.ODR_CHG_FLG,             RtpPRD_REQ.ODR_DEL_FLG,             -- 30, 31,
                    RtpPRD_REQ.ODR_ACPT_JOB_ODR_NO,     RtpPRD_REQ.ITEM_CD,                 -- 32, 33,
                    RtpPRD_REQ.MRP_ODR_TYP,             RtpPRD_REQ.OD_TYP,       -- 34, 35,
                    RtpPRD_REQ.OD_NO,               RtpPRD_REQ.JOB_ODR_CD,              -- 36, 37,
                    RtpPRD_REQ.JOB_ODR_DETAIL_NO,       RtpPRD_REQ.PRD_PLAN_TYP,            -- 38, 39,
                    RtpPRD_REQ.PRD_ERROR_TYP,           RtpPRD_REQ.PRD_ALARM_FLG,           -- 40, 41,
                    RtpPRD_REQ.PRVS_COMM_CD,            RtpPRD_REQ.PRVS_COMM_NAME,          -- 42, 43,
                    RtpPRD_REQ.PRVS_SPEC,               RtpPRD_REQ.PRVS_ITEM_CD,            -- 44, 45,
                    RtpPRD_REQ.PRVS_MRP_ODR_TYP,        RtpPRD_REQ.PRVS_SCDL_SHIP_DATE,     -- 46, 47,
                    RtpPRD_REQ.PRVS_DLV_DATE,           RtpPRD_REQ.PRVS_ODR_SHIP_DATE,      -- 48, 49,
                    RtpPRD_REQ.PRVS_REQ_QTY,            RtpPRD_REQ.PRVS_OD_NO,              -- 50, 51,
                    RtpPRD_REQ.PRVS_JOB_ODR_CD,         RtpPRD_REQ.PRVS_JOB_ODR_DETAIL_NO,  -- 52, 53,
--
            RtpPRD_REQ.SEQ_NO,                              -- 54 SEQ_NO,
            RtpPRD_REQ.CREATED_DATE,        RtpPRD_REQ.CREATED_BY,          -- 55,56,                    
            RtpPRD_REQ.CREATED_PRG_NM,          SYSDATE,                            -- 57,58,
                    pVc2UserID,                 MY_SQL_NAME,                -- 59,60,
            RtpPRD_REQ.MODIFY_COUNT + 1                                          -- 61
                );
            END IF;
        END LOOP;
        CLOSE CurPRD_REQ_1;

        --�y���Y�v���C���^�t�F�[�X�z�̃f�[�^���� <= 0
        IF num_REQ_PRD_ODR_IF_Count <= 0 THEN
            DELETE  T_REQ_PRD_ODR_IF         --[���Y�v���C���^�t�F�[�X]
              WHERE   PLANT_CD = pvc2PlantCd;
        END IF;

    END IF;

--vc2RunChkComment := 'COMMITEMCHG_008';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --�y���Y�v���C���^�t�F�[�X�z�̃f�[�^���� > 0
    IF num_REQ_PRD_ODR_IF_Count > 0 THEN

--vc2RunChkComment := 'COMMITEMCHG_009';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        OPEN CurREQ_PRD_ODR_IF(pvc2PlantCd);     --[���Y�v���C���^�t�F�[�X]
        LOOP
            FETCH CurREQ_PRD_ODR_IF INTO RtpREQ_PRD_ODR_IF;
            IF CurREQ_PRD_ODR_IF%NOTFOUND THEN
                EXIT;
            END IF;

--vc2RunChkComment := 'COMMITEMCHG_010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --[���Y�v��]
            OPEN CurPRD_REQ_2(RtpREQ_PRD_ODR_IF.COMPANY_CD,     --   1.��ЃR�[�h,
                              RtpREQ_PRD_ODR_IF.SLIP_TYP,       --   2.�`�[���,
                              RtpREQ_PRD_ODR_IF.SLIP_CTRL_GRP,  --   3.�`�[�Ǘ��O���[�v,
                              RtpREQ_PRD_ODR_IF.SLIP_CD,        --   4.�`�[�ԍ�,
                              RtpREQ_PRD_ODR_IF.SLIP_DATE,      --   5.�`�[���t,
                              RtpREQ_PRD_ODR_IF.SEQ_NO,                 --   59.�����A��
                  RtpREQ_PRD_ODR_IF.PLANT_CD);      --   26.�H��R�[�h
            FETCH CurPRD_REQ_2 INTO RtpPRD_REQ;
            IF CurPRD_REQ_2%FOUND THEN
                BlnPRD_REQ_FOUND := TRUE;
            ELSE
                BlnPRD_REQ_FOUND := FALSE;
            END IF;

            --�i�ڑ��݃`�F�b�N  ���i�R�[�h�ɂČ���
            OPEN CurITEM(RtpREQ_PRD_ODR_IF.COMM_CD);   --[�i��]
            FETCH CurITEM INTO RtpITEM;
            IF CurITEM%NOTFOUND THEN        -- �������ʂ��O���ł���ΐ��Y���G���[�敪��9��ݒ肷��
                RtpPRD_REQ.MRP_ODR_TYP   := 0;                      --33.�i�ڎ�z�敪
                RtpPRD_REQ.PRD_ERROR_TYP := 9;                      --39.���Y���G���[�敪
                DtmActiveDate2 := NULL;
            ELSE                            --���݂����ꍇ
                --�ғ��������Z�o
                blnRet := FncWorkDayCalc(pFileHandle, pVc2LogMode, pVc2OutputMode,pvc2UserId, pvc2BusinessName,
                    pvc2PlantCd,null,RtpREQ_PRD_ODR_IF.REQ_PRD_ISSUE_DATE, 0, FALSE, DtmActiveDate2);
                IF BlnRet = FALSE THEN
                    RAISE Err_FncWorkDayCalc;           --[�ғ��������Z�o]���s�G���[
                END IF;

                RtpPRD_REQ.MRP_ODR_TYP   := RtpITEM.MRP_ODR_TYP;    --33.�i�ڎ�z�敪
                RtpPRD_REQ.PRD_ERROR_TYP := 1;                      --39.���Y���G���[�敪
            END IF;
            CLOSE CurITEM;
            --�C���^�[�t�F�C�X�t�@�C���̃f�[�^��]�L
            RtpPRD_REQ.COMPANY_CD            := RtpREQ_PRD_ODR_IF.COMPANY_CD;           --   1.��ЃR�[�h
            RtpPRD_REQ.SLIP_TYP              := RtpREQ_PRD_ODR_IF.SLIP_TYP;             --   2.�`�[���
            RtpPRD_REQ.SLIP_CTRL_GRP         := RtpREQ_PRD_ODR_IF.SLIP_CTRL_GRP;        --   3.�`�[�Ǘ��O���[�v
            RtpPRD_REQ.SLIP_CD               := RtpREQ_PRD_ODR_IF.SLIP_CD;              --   4.�`�[�ԍ�
            RtpPRD_REQ.SLIP_DATE             := RtpREQ_PRD_ODR_IF.SLIP_DATE;            --   5.�`�[���t
            RtpPRD_REQ.LINE_NO               := RtpREQ_PRD_ODR_IF.SEQ_NO;               --   59.�����A��
            RtpPRD_REQ.UNCONFIRM_ODR_TYP     := RtpREQ_PRD_ODR_IF.UNCONFIRM_ODR_TYP;    --   7.�����󒍋敪
            RtpPRD_REQ.JOB_ODR_FLG           := RtpREQ_PRD_ODR_IF.JOB_ODR_FLG;          --   8.�ʎ󒍃t���O
            RtpPRD_REQ.CUST_CD               := RtpREQ_PRD_ODR_IF.CUST_CD;              --   9.���Ӑ�R�[�h
            RtpPRD_REQ.CUST_NAME             := RtpREQ_PRD_ODR_IF.CUST_NAME;            --  10.���Ӑ於
            RtpPRD_REQ.BRANCH_CD             := RtpREQ_PRD_ODR_IF.BRANCH_CD;            --  11.�x�X�R�[�h
            RtpPRD_REQ.BRANCH_NAME           := RtpREQ_PRD_ODR_IF.BRANCH_NAME;          --  12.�x�X��
            RtpPRD_REQ.DIRECT_DLV_TYP        := RtpREQ_PRD_ODR_IF.DIRECT_DLV_TYP;       --  13.���[�敪
            RtpPRD_REQ.DLV_LOC_CD            := RtpREQ_PRD_ODR_IF.DLV_LOC_CD;           --  14.�[�i�ꏊ�R�[�h
            RtpPRD_REQ.DLV_LOC_NAME          := RtpREQ_PRD_ODR_IF.DLV_LOC_NAME;         --  15.�[�i�ꏊ��
            RtpPRD_REQ.COMM_CD               := RtpREQ_PRD_ODR_IF.COMM_CD;              --  16.���i�R�[�h
            RtpPRD_REQ.COMM_NAME             := RtpREQ_PRD_ODR_IF.COMM_NAME;            --  17.���i��
            RtpPRD_REQ.SPEC                  := RtpREQ_PRD_ODR_IF.SPEC;                 --  18.�K�i
            RtpPRD_REQ.COMM_SIZE             := RtpREQ_PRD_ODR_IF.COMM_SIZE;            --  19.�T�C�Y
            RtpPRD_REQ.COLOR                 := RtpREQ_PRD_ODR_IF.COLOR;                --  20.�F
            RtpPRD_REQ.PRD_COMM_CODE_CHG_TYP := RtpREQ_PRD_ODR_IF.PRD_COMM_CODE_CHG_TYP;--  21.���i�^���i�ϊ��敪
            RtpPRD_REQ.SCDL_SHIP_DATE        := RtpREQ_PRD_ODR_IF.SCDL_SHIP_DATE;       --  22.�o�ח\���
            RtpPRD_REQ.SCDL_DLV_DATE         := RtpREQ_PRD_ODR_IF.SCDL_DLV_DATE;        --  23.�[�i�\���
            IF DtmActiveDate2 IS NULL THEN
                RtpPRD_REQ.REQ_PRD_ISSUE_DATE    := RtpREQ_PRD_ODR_IF.REQ_PRD_ISSUE_DATE;   --  24.�o�ɗv����
            ELSE
                RtpPRD_REQ.REQ_PRD_ISSUE_DATE    := DtmActiveDate2;                         --  24.�o�ɗv����
            END IF;
            RtpPRD_REQ.SHIP_WH_CD            := RtpREQ_PRD_ODR_IF.SHIP_WH_CD;           --  25.�o�בq�ɃR�[�h
--            
        RtpPRD_REQ.PLANT_CD     := RtpREQ_PRD_ODR_IF.PLANT_CD;                          --  26.�H��R�[�h


            RtpPRD_REQ.WH_CD                 := RtpREQ_PRD_ODR_IF.WH_CD;                --  27.�ۊǋ�R�[�h
                    RtpPRD_REQ.REQ_PRD_QTY           := RtpREQ_PRD_ODR_IF.REQ_PRD_QTY;          --  28.�v������
            RtpPRD_REQ.TOTAL_SHIP_QTY        := RtpREQ_PRD_ODR_IF.TOTAL_SHIP_QTY;       --  29.�o�׎��ї݌v��
            RtpPRD_REQ.ODR_CHG_FLG           := RtpREQ_PRD_ODR_IF.ODR_CHG_FLG;          --  30.�󒍕ϓ����t���O
            RtpPRD_REQ.ODR_DEL_FLG           := RtpREQ_PRD_ODR_IF.ODR_DEL_FLG;          --  30.�󒍍폜�t���O
            RtpPRD_REQ.ODR_ACPT_JOB_ODR_NO   := RtpREQ_PRD_ODR_IF.ODR_ACPT_JOB_ODR_NO;  --  31.�󒍐���
            RtpPRD_REQ.OD_TYP     := 0;      --  34.�I�[�_�f�}���h�敪
            RtpPRD_REQ.OD_NO       := 0;      --  35.�I�[�_�f�}���h�ԍ�
            RtpPRD_REQ.JOB_ODR_CD            := '0';    --  36.����
            RtpPRD_REQ.JOB_ODR_DETAIL_NO     := 0;      --  37.���Ԏ}��
            RtpPRD_REQ.PRD_PLAN_TYP          := 1;      --  38.���Y�v��Ώۋ敪

            IF DtmActiveDate1 >= RtpREQ_PRD_ODR_IF.SCDL_SHIP_DATE THEN
                RtpPRD_REQ.PRD_ALARM_FLG     := 9;          --  40.���Y�A���[���t���O
            ELSE
                RtpPRD_REQ.PRD_ALARM_FLG     := 1;          --  40.���Y�A���[���t���O
            END IF;

            IF BlnPRD_REQ_FOUND = FALSE THEN
                RtpPRD_REQ.PRVS_COMM_CD              := NULL;   --  41.�O�񏤕i�R�[�h
                RtpPRD_REQ.PRVS_COMM_NAME            := NULL;   --  42.�O�񏤕i��
                RtpPRD_REQ.PRVS_SPEC                 := NULL;   --  43.�O��K�i
                RtpPRD_REQ.PRVS_ITEM_CD              := NULL;   --  44.�O��i�ڔԍ�
                RtpPRD_REQ.PRVS_MRP_ODR_TYP          := 0;      --  45.�O��i�ڎ�z�敪
                RtpPRD_REQ.PRVS_SCDL_SHIP_DATE       := NULL;   --  46.�O��o�ח\���
                RtpPRD_REQ.PRVS_DLV_DATE             := NULL;   --  47.�O��[�i�\���
                RtpPRD_REQ.PRVS_ODR_SHIP_DATE        := NULL;   --  48.�O��o�ɗv����
                RtpPRD_REQ.PRVS_REQ_QTY              := 0;      --  49.�O��v������
                RtpPRD_REQ.PRVS_OD_NO                := 0;      --  50.�O��I�[�_�f�}���h�ԍ�
                RtpPRD_REQ.PRVS_JOB_ODR_CD           := NULL;   --  51.�O�񐻔�
                RtpPRD_REQ.PRVS_JOB_ODR_DETAIL_NO    := 0;      --  52.�O�񐻔Ԏ}��
            END IF;
--
                        
            IF BlnPRD_REQ_FOUND = FALSE THEN
                RtpPRD_REQ.CREATED_DATE := SYSDATE;     -- 55.sys�쐬����
                RtpPRD_REQ.CREATED_BY   := pVc2UserID;  -- 56.sys�쐬�҃R�[�h
        RtpPRD_REQ.CREATED_PRG_NM  := MY_SQL_NAME;   --  �쐬�v���O�����@
        RtpPRD_REQ.MODIFY_COUNT := 0;
        ELSE
                RtpPRD_REQ.CREATED_DATE := RtpPRD_REQ.CREATED_DATE;        -- 55.sys�쐬����
                RtpPRD_REQ.CREATED_BY   := RtpPRD_REQ.CREATED_BY;          -- 56.sys�쐬�҃R�[�h
        RtpPRD_REQ.CREATED_PRG_NM := RtpPRD_REQ.CREATED_PRG_NM;    --  �쐬�v���O�����@
        RtpPRD_REQ.MODIFY_COUNT := RtpPRD_REQ.MODIFY_COUNT + 1;
            END IF;
        
            RtpPRD_REQ.SEQ_NO               := RtpREQ_PRD_ODR_IF.SEQ_NO;               --   54.�����A��            

            --[���Y�v��]  
            --���Y�v�����ݎ��A�폜 ���Ƃ��Ƃ����ł���B
            IF BlnPRD_REQ_FOUND = TRUE THEN
                DELETE  FROM T_PRD_REQ
                WHERE   COMPANY_CD      = RtpPRD_REQ.COMPANY_CD     --  1.��ЃR�[�h
                AND     SLIP_TYP        = RtpPRD_REQ.SLIP_TYP       --  2.�`�[���
                AND     SLIP_CTRL_GRP   = RtpPRD_REQ.SLIP_CTRL_GRP  --  3.�`�[�Ǘ��O���[�v
                AND     SLIP_CD         = RtpPRD_REQ.SLIP_CD        --  4.�`�[�ԍ�
                AND     SLIP_DATE       = RtpPRD_REQ.SLIP_DATE      --  5.�`�[���t
                AND     LINE_NO         = RtpPRD_REQ.LINE_NO       --  6.�s
        AND     PLANT_CD        = RtpPRD_REQ.PLANT_CD;
            END IF;

            --[���Y�v��]
            INSERT INTO T_PRD_REQ(
                COMPANY_CD,             SLIP_TYP,               --   1.��ЃR�[�h            2.�`�[���
                SLIP_CTRL_GRP,          SLIP_CD,                --   3.�`�[�Ǘ��O���[�v      4.�`�[�ԍ�
                SLIP_DATE,              LINE_NO,                --   5.�`�[���t              6.�s
                UNCONFIRM_ODR_TYP,      JOB_ODR_FLG,            --   7.�����󒍋敪          8.�ʎ󒍃t���O
                CUST_CD,                CUST_NAME,              --   9.���Ӑ�R�[�h         10.���Ӑ於
                BRANCH_CD,              BRANCH_NAME,            --  11.�x�X�R�[�h           12.�x�X��
                DIRECT_DLV_TYP,         DLV_LOC_CD,             --  13.���[�敪             14.�[�i�ꏊ�R�[�h
                DLV_LOC_NAME,           COMM_CD,                --  15.�[�i�ꏊ��           16.���i�R�[�h
                COMM_NAME,              SPEC,                   --  17.���i��               18.�K�i
                COMM_SIZE,              COLOR,                  --  19.�T�C�Y               20.�F
                PRD_COMM_CODE_CHG_TYP,  SCDL_SHIP_DATE,         --  21.���i�^���i�ϊ��敪   22.�o�ח\���
                SCDL_DLV_DATE,          REQ_PRD_ISSUE_DATE,     --  23.�[�i�\���           24.�o�ɗv����
                SHIP_WH_CD,                                                             --  25.�o�בq�ɃR�[�h
        PLANT_CD,                                                                               --  26.�H��R�[�h
        WH_CD,                                                          --  27.�ۊǋ�R�[�h
                REQ_PRD_QTY,            TOTAL_SHIP_QTY,         --  28.�v������             28.�o�׎��ї݌v��
                ODR_CHG_FLG,            ODR_DEL_FLG,            --  30.�󒍕ϓ����t���O   31.�󒍍폜�t���O
                ODR_ACPT_JOB_ODR_NO,    ITEM_CD,                --  32.�󒍐���             33.�i�ڔԍ�
                MRP_ODR_TYP,            OD_TYP,      --  34.�i�ڎ�z�敪         35.�I�[�_�f�}���h�敪
                OD_NO,        JOB_ODR_CD,             --  36.�I�[�_�f�}���h�ԍ�   37.����
                JOB_ODR_DETAIL_NO,      PRD_PLAN_TYP,           --  38.���Ԏ}��             39.���Y�v��Ώۋ敪
                PRD_ERROR_TYP,          PRD_ALARM_FLG,          --  40.���Y���G���[�敪   41.���Y�A���[���t���O
                PRVS_COMM_CD,           PRVS_COMM_NAME,         --  42.�O�񏤕i�R�[�h       43.�O�񏤕i��
                PRVS_SPEC,              PRVS_ITEM_CD,           --  44.�O��K�i             45.�O��i�ڔԍ�
                PRVS_MRP_ODR_TYP,       PRVS_SCDL_SHIP_DATE,    --  46.�O��i�ڎ�z�敪     47.�O��o�ח\���
                PRVS_DLV_DATE,          PRVS_ODR_SHIP_DATE,     --  48.�O��[�i�\���       49.�O��o�ɗv����
                PRVS_REQ_QTY,           PRVS_OD_NO,             --  50.�O��v������         51.�O��I�[�_�f�}���h�ԍ�
                PRVS_JOB_ODR_CD,        PRVS_JOB_ODR_DETAIL_NO, --  52.�O�񐻔�             53.�O�񐻔Ԏ}��
        SEQ_NO,                                                                                 --  54
        CREATED_DATE,                                                                       --  55
        CREATED_BY,                                                         --  56
        CREATED_PRG_NM,                                                     --  57
        UPDATED_DATE,                                                       --  58
        UPDATED_BY,                                                     --  59
        UPDATED_PRG_NM,                                                 --  60
            MODIFY_COUNT                                                            --  61
            )VALUES(
                RtpPRD_REQ.COMPANY_CD,              RtpPRD_REQ.SLIP_TYP,                --  1,  2,
                RtpPRD_REQ.SLIP_CTRL_GRP,           RtpPRD_REQ.SLIP_CD,                 --  3,  4,
                RtpPRD_REQ.SLIP_DATE,               RtpPRD_REQ.LINE_NO,                 --  5,  6,
                RtpPRD_REQ.UNCONFIRM_ODR_TYP,       RtpPRD_REQ.JOB_ODR_FLG,             --  7,  8,
                RtpPRD_REQ.CUST_CD,                 RtpPRD_REQ.CUST_NAME,               --  9, 10,
                RtpPRD_REQ.BRANCH_CD,               RtpPRD_REQ.BRANCH_NAME,             -- 11, 12,
                RtpPRD_REQ.DIRECT_DLV_TYP,          RtpPRD_REQ.DLV_LOC_CD,              -- 13, 14,
                RtpPRD_REQ.DLV_LOC_NAME,            RtpPRD_REQ.COMM_CD,                 -- 15, 16,
                RtpPRD_REQ.COMM_NAME,               RtpPRD_REQ.SPEC,                    -- 17, 18,
                RtpPRD_REQ.COMM_SIZE,               RtpPRD_REQ.COLOR,                   -- 19, 20,
                RtpPRD_REQ.PRD_COMM_CODE_CHG_TYP,   RtpPRD_REQ.SCDL_SHIP_DATE,          -- 21, 22,
                RtpPRD_REQ.SCDL_DLV_DATE,           RtpPRD_REQ.REQ_PRD_ISSUE_DATE,      -- 23, 24,
                RtpPRD_REQ.SHIP_WH_CD,                                                                                   -- 25,
        RtpPRD_REQ.PLANT_CD,                                                                                                        -- 26
        RtpPRD_REQ.WH_CD,                   -- 27,
                RtpPRD_REQ.REQ_PRD_QTY,             RtpPRD_REQ.TOTAL_SHIP_QTY,          -- 28, 28,
                RtpPRD_REQ.ODR_CHG_FLG,             RtpPRD_REQ.ODR_DEL_FLG,             -- 30, 31,
                RtpPRD_REQ.ODR_ACPT_JOB_ODR_NO,     RtpPRD_REQ.COMM_CD,                 -- 32, 33,
                RtpPRD_REQ.MRP_ODR_TYP,             RtpPRD_REQ.OD_TYP,       -- 34, 35,
                RtpPRD_REQ.OD_NO,         RtpPRD_REQ.JOB_ODR_CD,              -- 36, 37,
                RtpPRD_REQ.JOB_ODR_DETAIL_NO,       RtpPRD_REQ.PRD_PLAN_TYP,            -- 38, 39,
                RtpPRD_REQ.PRD_ERROR_TYP,           RtpPRD_REQ.PRD_ALARM_FLG,           -- 40, 41,
                RtpPRD_REQ.PRVS_COMM_CD,            RtpPRD_REQ.PRVS_COMM_NAME,          -- 42, 43,
                RtpPRD_REQ.PRVS_SPEC,               RtpPRD_REQ.PRVS_ITEM_CD,            -- 44, 45,
                RtpPRD_REQ.PRVS_MRP_ODR_TYP,        RtpPRD_REQ.PRVS_SCDL_SHIP_DATE,     -- 46, 47,
                RtpPRD_REQ.PRVS_DLV_DATE,           RtpPRD_REQ.PRVS_ODR_SHIP_DATE,      -- 48, 49,
                RtpPRD_REQ.PRVS_REQ_QTY,            RtpPRD_REQ.PRVS_OD_NO,              -- 50, 51,
                RtpPRD_REQ.PRVS_JOB_ODR_CD,         RtpPRD_REQ.PRVS_JOB_ODR_DETAIL_NO,  -- 52, 53,
                RtpPRD_REQ.SEQ_NO,                                                                                                          --53,
        RtpPRD_REQ.CREATED_DATE,                                                                        --  55
        RtpPRD_REQ.CREATED_BY,                                                          --  56
        RtpPRD_REQ.CREATED_PRG_NM,                                                      --  57
        SYSDATE,                                                        --  58
        pVc2UserID,                                                     --  59
        MY_SQL_NAME,                                                    --  60
            RtpPRD_REQ.MODIFY_COUNT                                                         --  61                                                                              
            );
            CLOSE CurPRD_REQ_2;

            --[���Y�v���C���^�t�F�[�X]
            DELETE  T_REQ_PRD_ODR_IF
            WHERE   COMPANY_CD      = RtpREQ_PRD_ODR_IF.COMPANY_CD      -- 1.��ЃR�[�h
            AND     SLIP_TYP        = RtpREQ_PRD_ODR_IF.SLIP_TYP        -- 2.�`�[���
            AND     SLIP_CTRL_GRP   = RtpREQ_PRD_ODR_IF.SLIP_CTRL_GRP   -- 3.�`�[�Ǘ��O���[�v
            AND     SLIP_CD         = RtpREQ_PRD_ODR_IF.SLIP_CD         -- 4.�`�[�ԍ�
            AND     SLIP_DATE       = RtpREQ_PRD_ODR_IF.SLIP_DATE       -- 5.�`�[���t
            AND     LINE_NO         = RtpREQ_PRD_ODR_IF.LINE_NO        -- 6.�s
        AND     PLANT_CD        = RtpREQ_PRD_ODR_IF.PLANT_CD;

            --�y���Y�v���C���^�t�F�[�X�z���������̃C���N�������g
            NumCnt_REQ_PRD_ODR_IF := NumCnt_REQ_PRD_ODR_IF + 1;

        END LOOP;
        CLOSE CurREQ_PRD_ODR_IF;

    END IF;

--vc2RunChkComment := 'COMMITEMCHG_011';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    --[���Y�v���C���^�t�F�[�X]���o�����̏o��
    blnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_PROC_CNT, '(SBM0009)�y���Y�v���C���^�t�F�[�X�z���o�����F ' || NumCnt_REQ_PRD_ODR_IF || ' ��');


    -- TraceLog �̏o��
    blnRet := FncTraceLog(pFileHandle,  pVc2LogMode,        pVc2OutputMode,
                          pvc2UserId,   pvc2BusinessName, pvc2PlantCd,  MY_SQL_NAME,    LOGMSG_END);

--vc2RunChkComment := 'COMMITEMCHG_END';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    --[�Ɩ��^�p���t�擾]���s�G���[
    WHEN Err_FncGetBusinessDate THEN
        ROLLBACK;                           -- ���[���o�b�N
        NumErrNumber := APS_COM_OTHER_ERR;
        vc2Comment   := SUBSTRB('(SBM0010)' || LOGMSG_ERR || '�F' || '[�Ɩ��^�p���t�擾]�̎��s�Ɏ��s���܂����B', 1,1024);
        GOTO ERR_OUT;   -- �� �G���[���o�͂��AFALSE��Ԃ��ďI������B

    --[���Y�v������]NOT FOUND
    WHEN Err_NOT_PRD_REQ_CTRL THEN
        ROLLBACK;                           -- ���[���o�b�N
        NumErrNumber := APS_COM_OTHER_ERR;
        vc2Comment   := SUBSTRB('(SBM0011)' || LOGMSG_ERR || '�F' || '���Y�v������f�[�^�����݂��܂���B', 1,1024);
        GOTO ERR_OUT;   -- �� �G���[���o�͂��AFALSE��Ԃ��ďI������B

    --[�ғ��������Z�o]���s�G���[
    WHEN Err_FncWorkDayCalc THEN
        ROLLBACK;                           -- ���[���o�b�N
        NumErrNumber := APS_COM_OTHER_ERR;
        vc2Comment   := SUBSTRB('(SBM0012)' || LOGMSG_ERR || '�F' || '[�ғ��������Z�o]�̎��s�Ɏ��s���܂����B', 1,1024);
        GOTO ERR_OUT;   -- �� �G���[���o�͂��AFALSE��Ԃ��ďI������B

    -- ���̑��̃G���[
    WHEN OTHERS THEN
        ROLLBACK;                           -- ���[���o�b�N
        NumErrNumber := APS_COM_ORACLE_ERR;
        vc2Comment   := SUBSTRB('(SBM0021)' || LOGMSG_ERR || '�F' || SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024), 1,1024);

--vc2RunChkComment := NumErrNumber;
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := vc2Comment;
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        GOTO ERR_OUT;   -- �� �G���[���o�͂��AFALSE��Ԃ��ďI������B

-- �G���[���o�͂��AFALSE��Ԃ��ďI������B
<<ERR_OUT>>
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(  pFileHandle,  pVc2LogMode,        pVc2OutputMode,pvc2PlantCd, 
                              pvc2UserId,   pvc2BusinessName,   MY_SQL_NAME,    NumErrNumber,       vc2Comment);

        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle,  pVc2LogMode,        pVc2OutputMode, 
                              pvc2UserId,   pvc2BusinessName,   pvc2PlantCd,MY_SQL_NAME,    LOGMSG_END);
        COMMIT;
        RETURN FALSE;

END FncCommitemChg;
/
