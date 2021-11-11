CREATE OR REPLACE PROCEDURE SQLPJBUDGETCOSTMAKE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2014.04.21 ����
'
' �@�\      : �Č��\�Z�Ϗ㏈��
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pvc2LogMode           - (i)LOG���[�h
'                                      0:LOG����, 1:�G���[LOG, 2:�g���[�XLOG, 3:�f�[�^LOG
'             pvc2OutputMode        - (i)�o�̓��[�h
'                                      0:�C�x���g�r���[�A, 1:�t�@�C��
'             pvc2OutputPath        - (i)�o�̓t�@�C���p�X
'             pvc2OutputName        - (i)�o�̓t�@�C����
'             pvc2UserId            - (i)���[�U�h�c
'             pvc2BusinessName      - (i)�Ɩ���
'             pvc2PlantCd           - (i)�H��R�[�h
'             ���v���O�����ŗL
'             pnumFlag              - (i)�����敪
'             pvc2OdrNO             - (i)�󒍔ԍ�
'             pvc2ProjectCd         - (i)�Č��ԍ�
'             pvc2EstimateNo        - (i)���ϔԍ�
'             pvc2DetalNo           - (i)���הԍ�
'             pnumReturn            - (o)���ʃX�e�[�^�X
'
' �@�\����  : �Č��Ϗグ�o�b�`�N����ʂ��N�������B
'             �������сA�����������v�Z���A���ʂ��A�Č��\�Z�i���e�[�u���ɓo�^����B
'             ���ʃX�e�[�^�X   1:����I�� ����ɐϏグ��������
'                              2:�x���A   �}�X�^�[���ɕs������
'                              3:�ُ�I�� �v���I�G���[����
'
' ���l      : 
' 
' �C������
' 2014.04.15 ����
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    -- �k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2    -- �o�̓��[�h
   ,pvc2OutputPath              IN  VARCHAR2    -- �o�̓t�@�C���p�X
   ,pvc2OutputName              IN  VARCHAR2    -- �o�̓t�@�C����
   ,pvc2UserId                  IN  VARCHAR2    -- ���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2    -- �Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2    -- �H��R�[�h
   ,pnumFlag                    IN  NUMBER      -- �����敪
   ,pvc2OdrNO                   IN  VARCHAR2    -- �󒍔ԍ�
   ,pvc2ProjectCd               IN  VARCHAR2    -- �Č��ԍ�
   ,pvc2EstimateNo              IN  NUMBER      -- ���ϔԍ�
   ,pvc2DetalNo                 IN  NUMBER      -- ���הԍ�
   ,pnumReturn                  OUT NUMBER      -- ���ʃX�e�[�^�X�i1:����I���A2:�x���A3:�ُ�I���j
) IS

-- �J�[�\���̐錾
    -- �Č��󒍕R�t
    CURSOR curT_PJ_ODR_ALC(
                  cvc2ProjectCd      VARCHAR2   -- �Č��ԍ�
                 ,cvc2EstimateNo     NUMBER     -- ���ϔԍ�
                 ,cvc2DetalNo        NUMBER     -- ���הԍ�
    )
    IS
        SELECT /*+ RULE */
               PROJECT_CD                    -- �Č��ԍ�
              ,ESTIMATE_NO                   -- ���ϔԍ�
              ,DETAL_NO                      -- ���הԍ�
              ,ODR_NO                        -- �󒍔ԍ�
              ,ESTIMATE_TYPE                 -- ��z�i�ڎ�
        FROM   T_PJ_ODR_ALC
        WHERE  PROJECT_CD     = cvc2ProjectCd
        AND    ESTIMATE_NO    = cvc2EstimateNo
        AND    DETAL_NO       = cvc2DetalNo;

    -- ROWTYPE �̐錾
    recT_PJ_ODR_ALC          curT_PJ_ODR_ALC%ROWTYPE;
    
    -- ���ϖ���
    CURSOR curT_ESTIMATE_DETAL(
                  cvc2ProjectCd      VARCHAR2   -- �Č��ԍ�
                 ,cvc2EstimateNo     NUMBER     -- ���ϔԍ�
                 ,cvc2DetalNo        NUMBER     -- ���הԍ�
    )
    IS
        SELECT /*+ RULE */
               ES_COST_MATERIAL     -- ���ϗ\�Z  �ޗ���
              ,ES_COST_PROCESS      -- ���ϗ\�Z  ���H��
              ,ES_COST_OUTSOUCE     -- ���ϗ\�Z  �O����
              ,ES_COST_ETC          -- ���ϗ\�Z  ���̑��o��
              ,ES_COST_SERVICE      -- ���ϗ\�Z  �𖱔�
        FROM   T_ESTIMATE_DETAL
        WHERE  PROJECT_CD     = cvc2ProjectCd
        AND    ESTIMATE_NO    = cvc2EstimateNo
        AND    DETAL_NO       = cvc2DetalNo;

    -- ROWTYPE �̐錾
    recT_ESTIMATE_DETAL          curT_ESTIMATE_DETAL%ROWTYPE;
    
    -- �󒍖���
    CURSOR curT_ODR(
                  cvc2OdrNo          VARCHAR2    -- �󒍔ԍ�
    )
    IS
        SELECT /*+ RULE */
               ODR_CTL_NO                    -- �󒍊Ǘ��ԍ�
              ,ODR_ACPT_DATE                 -- �󒍓�
              ,ODR_QTY                       -- �󒍐�
              ,JOB_ODR_SET_FLG               -- ���Ԑݒ�t���O
        FROM   T_ODR
        WHERE  ODR_NO       = cvc2OdrNo;     -- �󒍔ԍ�

    -- ROWTYPE �̐錾
    recT_ODR          curT_ODR%ROWTYPE;

    -- �󒍊Ǘ�+�i��
    CURSOR curT_ODR_CTL(
                  cvc2ODR_CTL_NO     VARCHAR2      -- �󒍊Ǘ��ԍ�
    )
    IS
        SELECT /*+ RULE */
               OC.ITEM_CD                         -- �i�ڔԍ�
              ,IT.MRP_ODR_TYP                     -- �i�ڎ�z�敪
              ,IT.OUTSIDE_TYP                     -- �i�ړ��O��敪
              ,IT.PRODUCT_TYP                     -- ���i�敪
              ,IT.UNIT_QTY_TYP                    -- �݌ɐ��P�ʋ敪
              ,IT.ITEM_SPOIL                      -- �i�ڎd����
        FROM   T_ODR_CTL  OC,
               M_ITEM     IT
        WHERE  OC.ODR_CTL_NO   = cvc2ODR_CTL_NO   -- �󒍊Ǘ��ԍ�
        AND    IT.ITEM_CD      = OC.ITEM_CD;      -- �i�ڔԍ�

    -- ROWTYPE �̐錾
    recT_ODR_CTL       curT_ODR_CTL%ROWTYPE;
    
    -- ���Ԏ󒍕R�t
    CURSOR curT_JOB_ODR_ODR_ALC(
                  cvc2ODR_NO         VARCHAR2     -- �󒍔ԍ�
                 ,cvc2COMPANY_CD     VARCHAR2     -- ��ЃR�[�h 
    )
    IS
        SELECT /*+ RULE */
               JOB_ODR_CD                      -- ����
              ,JOB_ODR_DETAIL_NO               -- ���Ԏ}��
              ,JOB_ODR_CANCEL_NO               -- ���Ԏ�������ԍ�
              ,ODR_NO                          -- �󒍔ԍ�
        FROM   T_JOB_ODR_ODR_ALC
        WHERE  ODR_NO     = cvc2ODR_NO         -- �󒍔ԍ�
        AND    COMPANY_CD = cvc2COMPANY_CD;    -- ��ЃR�[�h

    -- ROWTYPE �̐錾
    recT_JOB_ODR_ODR_ALC       curT_JOB_ODR_ODR_ALC%ROWTYPE;

    -- ���Ԍv��
    CURSOR curT_JOB_ODR(
                  cvc2JOB_ODR_CD         VARCHAR2            -- ����
                 ,cnumJOB_ODR_DETAIL_NO  NUMBER              -- ���Ԏ}��
                 ,cnumJOB_ODR_CANCEL_NO  NUMBER              -- ���Ԏ�������ԍ�
    )
    IS
        SELECT /*+ RULE */
               JOB_ODR_CD                                     -- ����
              ,JOB_ODR_DETAIL_NO                              -- ���Ԏ}��
              ,JOB_ODR_CANCEL_NO                              -- ���Ԏ�������ԍ�
              ,JOB_ODR_STS_TYP                                -- ���ԏ�ԋ敪
              ,PLANT_CD                                       -- �H��R�[�h
              ,ITEM_CD                                        -- �i�ڔԍ�
              ,JOB_ODR_QTY                                    -- ���Ԑ�
        FROM   T_JOB_ODR
        WHERE  JOB_ODR_CD         = cvc2JOB_ODR_CD            -- ����
        AND    JOB_ODR_DETAIL_NO  = cnumJOB_ODR_DETAIL_NO     -- ���Ԏ}��
        AND    JOB_ODR_CANCEL_NO  = cnumJOB_ODR_CANCEL_NO;    -- ���Ԏ�������ԍ�

    -- ROWTYPE �̐錾
    recT_JOB_ODR       curT_JOB_ODR%ROWTYPE;

    -- ��݌Ɏ�
    CURSOR curT_ODR_UNSTOCK(
                      cvc2ODR_NO     VARCHAR2    -- �󒍔ԍ�
    )
    IS
        SELECT /*+ RULE */
               US.ITEM_CD                       -- �i�ڔԍ�
              ,US.ODR_ACPT_DATE                 -- �󒍓�
              ,US.ODR_QTY                       -- �󒍐�
              ,US.ODR_CMPLT_FLG                 -- �󒍊����t���O
              ,IT.MRP_ODR_TYP                   -- �i�ڎ�z�敪
              ,IT.OUTSIDE_TYP                   -- �i�ړ��O��敪
              ,IT.PRODUCT_TYP                   -- ���i�敪
              ,IT.UNIT_QTY_TYP                  -- �݌ɐ��P�ʋ敪
              ,IT.ITEM_SPOIL                    -- �i�ڎd����
        FROM   T_ODR_UNSTOCK US,
               M_ITEM        IT
        WHERE  US.ODR_NO       = cvc2ODR_NO      -- �󒍔ԍ�
        AND    IT.ITEM_CD(+)   = US.ITEM_CD;     -- �i�ڔԍ�

    -- ROWTYPE �̐錾
    recT_ODR_UNSTOCK        curT_ODR_UNSTOCK%ROWTYPE;


    /* ���ςɕR�t���i�ڂ����ԕi */
    -- ���v��(���Ԏw��) 
    CURSOR curT_OD(
               cvc2JOB_ODR_CD           IN VARCHAR2     -- ���� 
             , cvc2JOB_ODR_DETAIL_NO    IN NUMBER       -- ���Ԏ}��
             , cvc2JOB_ODR_CANCEL_NO    IN NUMBER       -- ���Ԏ�������ԍ�
    )
    IS
        SELECT /*+ RULE */
               OD.OD_NO                         -- �I�[�_�f�}���h�ԍ�
              ,OD.PLANT_CD                      -- �H��R�[�h
              ,OD.ITEM_CD                       -- �i�ڔԍ�
              ,OD.PS_EDITION                    -- ���v�ʕi�ڍ\���Ő�
              ,OD.PATTERN_CD                    -- �p�^�[���R�[�h
              ,OD.JOB_ODR_CD                    -- ����
              ,OD.JOB_ODR_DETAIL_NO             -- ���Ԏ}��
              ,OD.JOB_ODR_CANCEL_NO             -- ���Ԏ�������ԍ�
              ,OD.ODR_STS_TYP                   -- �I�[�_��ԋ敪
              ,OD.DM_STS_TYP                    -- �f�}���h��ԋ敪
              ,OD.OD_TYP                        -- �I�[�_�f�}���h�敪
              ,OD.DUE_DATE                      -- �v���[��
              ,OD.ODR_START_DATE                -- ��z�����
              ,OD.PRD_DUE_DATE                  -- �����[��
              ,OD.PRD_START_DATE                -- ���������
              ,OD.DM_QTY                        -- �f�}���h��
              ,OD.ODR_QTY                       -- �I�[�_��
              ,OD.MRP_ODR_TYP                   -- �i�ڎ�z�敪
              ,OD.OUTSIDE_TYP                   -- ���v�ʓ��O��敪
              ,OD.ISSUE_TYP                     -- ���v�ʏo�ɋ敪
              ,OD.PS_UNIT_QTY                   -- ���i�\���P�ʐ�
              ,OD.PS_UNIT_DENOMINATOR           -- ���i�\���P�ʐ�����
              ,OD.PS_UNIT_NUMERATOR             -- ���i�\���P�ʐ����q
              ,OD.TOTAL_RCV_QTY                 -- ���ɗ݌v��
              ,OD.RCV_CMPLT_DATE                -- ���Ɋ�����
              ,OD.TOTAL_ISSUE_INST_QTY          -- �o�Ɏw���݌v��
              ,OD.TOTAL_ISSUE_QTY               -- �o�ɗ݌v��
              ,OD.ISSUE_CMPLT_DATE              -- �o�Ɋ�����
              ,OD.OD_GNR_TYP                    -- ���v�ʔ��������敪
              ,OD.OD_LEVEL_NO                   -- ���v�ʃ��x���ԍ�
              ,OD.PARENT_OD_NO                  -- �e�I�[�_�f�}���h�ԍ�
              ,OD.ITEM_SPOIL                    -- ���v�ʕi�ڎd����
              ,OD.PS_SPOIL                      -- ���v�ʍ\���d����
              ,OD.CONS_TYP                      -- �\���x���敪
              ,OD.MRP_TYP                       -- ���v�ʏ����敪
              ,OD.ODR_RELEASE_FLG               -- �I�[�_�����σt���O
              ,IT.PRODUCT_TYP                   -- ���i�敪
              ,IT.UNIT_QTY_TYP                  -- �݌ɐ��P�ʋ敪
              ,IT.SPL_ITEM_TYP                  -- �󋋕i�敪
              ,IT.ITEM_SPOIL  AS ITEM_SPOIL2    -- �i�ڎd����
        FROM   T_OD    OD
              ,M_ITEM  IT
        WHERE  OD.JOB_ODR_CD           =  cvc2JOB_ODR_CD          -- ����
        AND    OD.JOB_ODR_DETAIL_NO    =  cvc2JOB_ODR_DETAIL_NO   -- ���Ԏ}��
        AND    OD.JOB_ODR_CANCEL_NO    =  cvc2JOB_ODR_CANCEL_NO   -- ���Ԏ�������ԍ�
        AND    IT.ITEM_CD              =  OD.ITEM_CD
        ORDER  BY OD.OD_LEVEL_NO ASC ,OD.ITEM_CD ASC
        ;
    -- ROWTYPE �̐錾
    recT_OD        curT_OD%ROWTYPE;

    -- �ۊǋ���o��
    CURSOR curT_RCV_ISSUE(
                  cvc2PLANT_CD            VARCHAR2     -- �H��R�[�h
                 ,cvc2JOB_ODR_CD          VARCHAR2     -- ���� 
                 ,cnumJOB_ODR_DETAIL_NO   NUMBER       -- ���Ԏ}��
    )
    IS
        SELECT /*+ RULE */
              RI.ITEM_CD                      -- �i�ڔԍ�
             ,RI.RCV_ISSUE_DATE               -- ���o�ɓ�
             ,RI.RCV_ISSUE_QTY                -- ���o�ɐ�
             ,RI.RCV_ISSUE_GNR_TYP            -- ���o�ɔ����敪
             ,IT.MRP_ODR_TYP                  -- �i�ڎ�z�敪
             ,IT.OUTSIDE_TYP                  -- �i�ړ��O��敪
             ,IT.PRODUCT_TYP                  -- ���i�敪
             ,IT.UNIT_QTY_TYP                 -- �݌ɐ��P�ʋ敪
             ,IT.ITEM_SPOIL                   -- �i�ڎd����
             ,IT.SPL_ITEM_TYP                 -- �����󋋕i�t���O
        FROM  T_RCV_ISSUE  RI
             ,M_ITEM       IT
        WHERE RI.PLANT_CD              = cvc2PLANT_CD            -- �H��R�[�h
        AND   RI.JOB_ODR_CD            = cvc2JOB_ODR_CD          -- ����
        AND   RI.JOB_ODR_DETAIL_NO     = cnumJOB_ODR_DETAIL_NO   -- ���Ԏ}��
        AND   RI.RCV_ISSUE_GNR_TYP     = 24                      -- ���o�ɔ����敪  �Q�S:�U�֏o��
        AND   IT.ITEM_CD               = RI.ITEM_CD;             -- �i�ڔԍ�
    -- ROWTYPE �̐錾
    recT_RCV_ISSUE          curT_RCV_ISSUE%ROWTYPE;

    /* l�E�݌Ɉ���������Ă��鏊�v�ʂ̓W�J����o�^���� */
    -- �Č��\�Z����
    CURSOR curT_PJ_BUDGET_DETAIL(
               cvc2PJ_BUDGET_DETAIL_NO  IN VARCHAR2     -- �Č��\�Z�Ϗ㖾�הԍ�
    )
    IS
        SELECT /*+ RULE */
               PJ_BUDGET_DETAIL_NO           -- �Č��\�Z�Ϗ㖾�הԍ�
              ,SEQNO                         -- SEQNO
              ,OD_NO                         -- �I�[�_�f�}���h�ԍ�
              ,PROJECT_CD                    -- �Č��ԍ�
              ,ESTIMATE_NO                   -- ���ϔԍ�
              ,DETAL_NO                      -- ���הԍ�
              ,ODR_NO                        -- �󒍔ԍ�
              ,ESTIMATE_TYPE                 -- ��z�i�ڎ�
              ,ODR_ACPT_DATE                 -- �󒍓�
              ,PLANT_CD                      -- �H��R�[�h
              ,JOB_ODR_CD                    -- ����
              ,JOB_ODR_DETAIL_NO             -- ���Ԏ}��
              ,JOB_ODR_CANCEL_NO             -- ���Ԏ�������ԍ�
              ,ROOT_ITEM_CD                  -- �ŏ�ʕi�ڔԍ�
              ,PARENT_ITEM_CD                -- �e�i�ڔԍ�
              ,ITEM_CD                       -- �i�ڔԍ�
              ,OD_TYP                        -- �I�[�_�f�}���h�敪
              ,DUE_DATE                      -- �v���[��
              ,ODR_START_DATE                -- ��z�����
              ,PRD_DUE_DATE                  -- �����[��
              ,PRD_START_DATE                -- ���������
              ,MRP_ODR_TYP                   -- �i�ڎ�z�敪
              ,OUTSIDE_TYP                   -- ���v�ʓ��O��敪
              ,PRODUCT_TYP                   -- ���i�敪
              ,UNIT_QTY_TYP                  -- �݌ɐ��P�ʋ敪
              ,PS_UNIT_QTY                   -- ���i�\���P�ʐ�
              ,PS_UNIT_DENOMINATOR           -- ���i�\���P�ʐ�����
              ,PS_UNIT_NUMERATOR             -- ���i�\���P�ʐ����q
              ,OD_LEVEL_NO                   -- ���v�ʃ��x���ԍ�
              ,PARENT_SEQNO                  -- �eSEQNO
              ,ITEM_SPOIL                    -- ���v�ʕi�ڎd����
              ,PS_SPOIL                      -- ���v�ʍ\���d����
              ,CONS_TYP                      -- �\���x���敪
              ,NECESSARY_QTY                 -- �K�v���v��
              ,PS_INPUT_RATIO                -- �\���d�������W��
              ,ITEM_INPUT_RATIO              -- �i�ڎd�������W��
              ,DMY_ITEM_FLG                  -- �[���i�ڃt���O
              ,VOLUNT_SPL_FLG                -- �����󋋕i�t���O
              ,COST_UP_TYP                   -- �����Ϗ�敪
              ,ONEROUS_CONS_FLG              -- �L���x���i�t���O
              ,BUDGET_STACK_TYP              -- �\�Z�Ϗグ�敪
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO     =  cvc2PJ_BUDGET_DETAIL_NO   -- �V�K�́g�Č��\�Z�Ϗ㖾�הԍ��h
        AND    ALC_STOCK_FLG           =  1                         -- �����݌ɗL���t���O      1�F��������
        AND    ALC_STOCK_ODR_FLG       =  0                         -- �݌Ɉ������v�ʓW�J�敪  0�F���W�J
        ;
    -- ROWTYPE �̐錾
    recT_PJ_BUDGET_DETAIL              curT_PJ_BUDGET_DETAIL%ROWTYPE;
    
    /* 2�E�Č��\�Z�Ϗ�̎��я����擾�� */
    -- �Č��\�Z����
    CURSOR curT_PJ_BUDGET_RESULT(
               cvc2PJ_BUDGET_DETAIL_NO  IN VARCHAR2     -- �Č��\�Z�Ϗ㖾�הԍ�
    )
    IS
        SELECT /*+ RULE */
               PJ_BUDGET_DETAIL_NO           -- �Č��\�Z�Ϗ㖾�הԍ�
              ,SEQNO                         -- SEQNO
              ,OD_NO                         -- �I�[�_�f�}���h�ԍ�
              ,PROJECT_CD                    -- �Č��ԍ�
              ,ESTIMATE_NO                   -- ���ϔԍ�
              ,DETAL_NO                      -- ���הԍ�
              ,ODR_NO                        -- �󒍔ԍ�
              ,ESTIMATE_TYPE                 -- ��z�i�ڎ�
              ,ODR_ACPT_DATE                 -- �󒍓�
              ,PLANT_CD                      -- �H��R�[�h
              ,JOB_ODR_CD                    -- ����
              ,JOB_ODR_DETAIL_NO             -- ���Ԏ}��
              ,JOB_ODR_CANCEL_NO             -- ���Ԏ�������ԍ�
              ,ROOT_ITEM_CD                  -- �ŏ�ʕi�ڔԍ�
              ,PARENT_ITEM_CD                -- �e�i�ڔԍ�
              ,ITEM_CD                       -- �i�ڔԍ�
              ,OD_TYP                        -- �I�[�_�f�}���h�敪
              ,DUE_DATE                      -- �v���[��
              ,ODR_START_DATE                -- ��z�����
              ,PRD_DUE_DATE                  -- �����[��
              ,PRD_START_DATE                -- ���������
              ,MRP_ODR_TYP                   -- �i�ڎ�z�敪
              ,OUTSIDE_TYP                   -- ���v�ʓ��O��敪
              ,PRODUCT_TYP                   -- ���i�敪
              ,UNIT_QTY_TYP                  -- �݌ɐ��P�ʋ敪
              ,PS_UNIT_QTY                   -- ���i�\���P�ʐ�
              ,PS_UNIT_DENOMINATOR           -- ���i�\���P�ʐ�����
              ,PS_UNIT_NUMERATOR             -- ���i�\���P�ʐ����q
              ,OD_LEVEL_NO                   -- ���v�ʃ��x���ԍ�
              ,PARENT_SEQNO                  -- �eSEQNO
              ,ITEM_SPOIL                    -- ���v�ʕi�ڎd����
              ,PS_SPOIL                      -- ���v�ʍ\���d����
              ,CONS_TYP                      -- �\���x���敪
              ,NECESSARY_QTY                 -- �K�v���v��
              ,PS_INPUT_RATIO                -- �\���d�������W��
              ,ITEM_INPUT_RATIO              -- �i�ڎd�������W��
              ,DMY_ITEM_FLG                  -- �[���i�ڃt���O
              ,VOLUNT_SPL_FLG                -- �����󋋕i�t���O
              ,COST_UP_TYP                   -- �����Ϗ�敪
              ,ONEROUS_CONS_FLG              -- �L���x���i�t���O
              ,BUDGET_STACK_TYP              -- �\�Z�Ϗグ�敪
              ,ODR_RELEASE_FLG               -- �I�[�_�����σt���O
              ,ALC_STOCK_FLG                 -- �����݌ɗL���t���O
              ,ORG_OD_NO                     -- ���I�[�_�f�}���h�ԍ�
              ,RCV_ISSUE_GNR_TYP             -- ���o�ɔ����敪
              ,ALC_STOCK_TYP                 -- �����݌ɋ敪
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO     =  cvc2PJ_BUDGET_DETAIL_NO   -- �Č��\�Z�Ϗ㖾�הԍ�
        ORDER  BY OD_LEVEL_NO,OD_NO
        ;
    -- ROWTYPE �̐錾
    recT_PJ_BUDGET_RESULT              curT_PJ_BUDGET_RESULT%ROWTYPE;
    
    -- ���Ԏ�z
    CURSOR curT_JOB_ODR_ALC(
                  cvc2OD_NO     VARCHAR2          -- �I�[�_�f�}���h�ԍ�
    )
    IS
        SELECT /*+ RULE */
               OD_NO                              -- �I�[�_�f�}���h�ԍ�
              ,ALC_STOCK_TYP                      -- �����݌ɍ݌ɋ敪
              ,JOB_ODR_CD                         -- ����
              ,JOB_ODR_DETAIL_NO                  -- ���Ԏ}��
              ,ALCD_QTY                           -- �����ϐ�
              ,ITEM_CD                            -- �i�ڔԍ�
        FROM   T_JOB_ODR_ALC  OC
        WHERE  OC.OD_NO        = cvc2OD_NO        -- �I�[�_�f�}���h�ԍ�
        ORDER  BY  JOB_ODR_ALC_CD  
        ;
    -- ROWTYPE �̐錾
    recT_JOB_ODR_ALC       curT_JOB_ODR_ALC%ROWTYPE;
    
    --�y�i�ڕʍ݌Ɂz
    CURSOR curT_ITEM_COST(
                  cvc2YEAR                VARCHAR2     -- �N�x
                 ,cvc2PLANT_CD            VARCHAR2     -- �H��R�[�h
                 ,cvc2ITEM_CD             VARCHAR2     -- �i�ڔԍ� 
    ) IS
    SELECT /*+ RULE */
            TOTAL_MATR_COST               -- �Ϗ�ޗ���
           ,TOTAL_SBCNT_MATR_COST         -- �Ϗ�ޗ���(�O��)
           ,TOTAL_PROC_COST_SUM_ALL       -- �Ϗ���H��
    FROM   T_ITEM_COST  TI
    WHERE  YEAR             <=  cvc2YEAR
    AND    COST_TYP          =  1       
    AND    PLANT_CD          =  cvc2PLANT_CD
    AND    ITEM_CD           =  cvc2ITEM_CD
    ORDER BY YEAR DESC,HALF_TERM_TYP DESC;
    -- ROWTYPE �̐錾
    recT_ITEM_COST       curT_ITEM_COST%ROWTYPE;

    --�y��ƌn��z
    CURSOR curM_PROC_GRP(
                  cvc2PLANT_CD            VARCHAR2     -- �H��R�[�h
                 ,cvc2ITEM_CD             VARCHAR2     -- �i�ڔԍ� 
    ) IS
    SELECT /*+ RULE */
            PLANT_CD                     --�H��R�[�h
           ,ITEM_CD                      --�i�ڔԍ�
           ,PROC_CD                      --�i�ڕʍ�ƃR�[�h
           ,PROC_NO                      --��ƌn��ԍ�
           ,WS_CD                        --��Ƌ�R�[�h
           ,COMPANY_CD                   --��ЃR�[�h
           ,VEND_CD                      --��\�����R�[�h
           ,STANDARD_COST                --�W���H��
           ,OUTSIDE_TYP                  --���O��敪
    FROM    M_PROC_GRP                    --��ƌn��
    WHERE   PLANT_CD    = cvc2PLANT_CD    --�H��R�[�h
    AND     ITEM_CD     = cvc2ITEM_CD     --�i�ڔԍ�
    ORDER BY PROC_NO;
    -- ROWTYPE �̐錾
    recM_PROC_GRP       curM_PROC_GRP%ROWTYPE;

    --�y�i�ڕʎd�|�z
    CURSOR curT_WORK_IN_PROC_BY_ITEM(
                  cvcOD_NO                VARCHAR2     -- �I�[�_�f�}���h�ԍ�
    ) IS
    SELECT /*+ RULE */
            WORK_ODR_CD               --��ƌv��ԍ�
           ,PLANT_CD                  --�H��R�[�h
           ,WORK_ODR_DLV_DATE         --��Ɛ����[��
           ,ITEM_CD                   --�i�ڔԍ�
           ,OPR_INST_QTY              --��Ǝw����
           ,WORK_STS_TYP              --��ƌn��ʍ�Ə�ԋ敪
           ,PROC_EXPLOSION_FLG        --��ƌn��W�J�ς݃t���O
    FROM    T_WORK_IN_PROC_BY_ITEM    --�i�ڕ�
    WHERE   OD_NO     =   cvcOD_NO    -- �I�[�_�f�}���h�ԍ�
    ;
    -- ROWTYPE �̐錾
    recT_WORK_IN_PROC_BY_ITEM         curT_WORK_IN_PROC_BY_ITEM%ROWTYPE;
    
        --�y��ƌn��ʎd�|�z
    CURSOR curT_WORK_IN_PROC_BY_PROC(
                  cvcWORK_ODR_CD      VARCHAR2     -- ��ƌv��ԍ�
    ) IS
    SELECT /*+ RULE */
            WP.WORK_ODR_CD                            --��Ǝw���ԍ�
           ,WP.WORK_IN_PROC_CD                        --�d�|��ƃR�[�h
           ,WP.ITEM_CD                                --�i�ڔԍ�
           ,WP.OUTSIDE_TYP                            --�d�|���O��敪
           ,WP.OPR_INST_QTY                           --��Ǝw����
           ,WP.WS_CD                                  --��Ƌ�R�[�h
           ,WP.PLANT_CD                               --�H��R�[�h
           ,WP.VEND_CD                                --�����R�[�h
           ,WP.WORK_STS_TYP                           --��ƌn��ʍ�Ə�ԋ敪
           ,WP.OPR_INST_START_DATE                    --��ƌn��ʒ����
           ,WP.OPR_INST_CD                            --��Ǝw���ԍ�
           ,MP.STANDARD_COST                          --�W���H��
    FROM    T_WORK_IN_PROC_BY_PROC  WP                --��ƌn��ʎd�|
           ,M_PROC_GRP              MP                --��ƌn��
    WHERE   WP.WORK_ODR_CD     =   cvcWORK_ODR_CD     -- ��ƌv��ԍ�
    AND     MP.PLANT_CD        =   WP.PLANT_CD
    AND     MP.ITEM_CD         =   WP.ITEM_CD
    AND     MP.PROC_CD         =   WP.WORK_IN_PROC_CD
    ;
    -- ROWTYPE �̐錾
    recT_WORK_IN_PROC_BY_PROC         curT_WORK_IN_PROC_BY_PROC%ROWTYPE;
    
    --�y�����c�z
    CURSOR curT_RLSD_PUCH_ODR(
                  cvcOD_NO                VARCHAR2     -- �I�[�_�f�}���h�ԍ�
    ) IS
    SELECT /*+ RULE */
            PU.PUCH_ODR_CD            --�����ԍ�
           ,PU.VEND_CD                --�����CD
           ,PU.ITEM_CD                --�i�ڔԍ�
           ,PU.PLANT_CD               --�H��R�[�h
           ,PU.PUCH_ODR_DLV_DATE      --�����[��
           ,PU.PUCH_ODR_QTY           --������
           ,PU.PUCH_ODR_STS_TYP       --������ԋ敪
           ,PU.UNIT_COST              --�P��
           ,VC.CUR_CD                 --�ʉ݃R�[�h
           ,VC.EXCH_TYP               --�ב֎��
           ,VC.ROUND_TYP              --�������z�ۂߋ敪
    FROM    T_RLSD_PUCH_ODR PU        --�i�ڕ�
           ,M_VEND_CTRL     VC
    WHERE   PU.OD_NO         =   cvcOD_NO    -- �I�[�_�f�}���h�ԍ�
    AND     PU.WORK_ODR_CD   IS  Null
    AND     VC.VEND_CD(+)    =   PU.VEND_CD  -- �����R�[�h
    ;
    -- ROWTYPE �̐錾
    recT_RLSD_PUCH_ODR                 curT_RLSD_PUCH_ODR%ROWTYPE;
    
    --�y[���Ԏ󒍕R�t][�󒍖���][���v��]�z
    CURSOR curT_JOB_ODR_PJ(
               cvc2JOB_ODR_CD           IN VARCHAR2     -- ���� 
             , cvc2JOB_ODR_DETAIL_NO    IN NUMBER       -- ���Ԏ}��
             , cvc2JOB_ODR_CANCEL_NO    IN NUMBER       -- ���Ԏ�������ԍ�
             , cvc2ITEM_CD              IN VARCHAR2     -- �i�ڔԍ�
    ) IS
    SELECT /*+ RULE */
           JOO.JOB_ODR_CD
          ,JOO.JOB_ODR_DETAIL_NO
          ,JOO.JOB_ODR_CANCEL_NO
          ,JOO.ODR_NO
          ,POA.PROJECT_CD
          ,POA.ESTIMATE_NO
          ,POA.DETAL_NO
          ,ODR.ODR_QTY   AS ODR_ODR_QTY
          ,OD.ODR_QTY    AS OD_ODR_QTY
          ,OD.TOTAL_RCV_QTY
          ,IT.UNIT_QTY_TYP
    FROM   T_JOB_ODR_ODR_ALC  JOO
          ,T_PJ_ODR_ALC       POA
          ,T_ODR              ODR
          ,T_OD               OD
          ,M_ITEM             IT
    WHERE  JOO.JOB_ODR_CD         = cvc2JOB_ODR_CD
    AND    JOO.JOB_ODR_DETAIL_NO  = cvc2JOB_ODR_DETAIL_NO
    AND    JOO.JOB_ODR_CANCEL_NO  = cvc2JOB_ODR_CANCEL_NO
    AND    POA.ODR_NO             = JOO.ODR_NO
    AND    ODR.ODR_NO             = JOO.ODR_NO
    AND    OD.JOB_ODR_CD          = JOO.JOB_ODR_CD
    AND    OD.JOB_ODR_DETAIL_NO   = JOO.JOB_ODR_DETAIL_NO
    AND    OD.JOB_ODR_DETAIL_NO   = JOO.JOB_ODR_CANCEL_NO
    AND    OD.ITEM_CD             = cvc2ITEM_CD
    AND    IT.ITEM_CD             = cvc2ITEM_CD
    ;
    -- ROWTYPE �̐錾
    recT_JOB_ODR_PJ                 curT_JOB_ODR_PJ%ROWTYPE;
    
    --�y[���ϖ���]�z
    CURSOR curT_ESTIMATE_DETAL_U(
               cvc2JOB_ODR_CD           IN VARCHAR2     -- ���� 
             , cvc2JOB_ODR_DETAIL_NO    IN NUMBER       -- ���Ԏ}��
             , cvc2JOB_ODR_CANCEL_NO    IN NUMBER       -- ���Ԏ�������ԍ�
             , cdatTOTAL_DATE           IN DATE         -- �W�v����
    ) IS
    SELECT /*+ RULE */
           PCS.PROJECT_CD
          ,PCS.ESTIMATE_NO
          ,PCS.DETAL_NO
          ,PCS.CMP_COST_MATERIAL
          ,PCS.CMP_COST_PROCESS
          ,PCS.CMP_COST_OUTSOUCE
          ,PCS.EXP_COST_MATERIAL
          ,PCS.EXP_COST_PROCESS
          ,PCS.EXP_COST_OUTSOUCE
    FROM   T_JOB_ODR_ODR_ALC  JOO             -- ���Ԏ�
          ,T_PJ_ODR_ALC       POA             -- �Č���
          ,T_PJ_COST          PCS             -- �Č��i��
    WHERE  JOO.JOB_ODR_CD          = cvc2JOB_ODR_CD
    AND    JOO.JOB_ODR_DETAIL_NO   = cvc2JOB_ODR_DETAIL_NO
    AND    JOO.JOB_ODR_CANCEL_NO   = cvc2JOB_ODR_CANCEL_NO
    AND    POA.ODR_NO              = JOO.ODR_NO
    AND    PCS.PROJECT_CD          = POA.PROJECT_CD
    AND    PCS.ESTIMATE_NO         = POA.ESTIMATE_NO
    AND    PCS.DETAL_NO            = POA.DETAL_NO
    AND    PCS.TOTAL_DATE          = cdatTOTAL_DATE
    ;
    -- ROWTYPE �̐錾
    recT_ESTIMATE_DETAL_U          curT_ESTIMATE_DETAL_U%ROWTYPE;
    
    --�y[��Ǝ���]�z
    CURSOR curT_OPR_RSLT(
               cvc2OPR_INST_CD          IN VARCHAR2     -- ��Ǝw���ԍ� 
    ) IS
    SELECT /*+ RULE */
           DECODE(OPR_TIME_UNIT_TYP,1,(PRE_ARRANGEMENT_TIME + POST_ARRANGEMENT_TIME + OPR_TIME) / 60
                                   ,2,PRE_ARRANGEMENT_TIME    ) AS  PRE_ARRANGEMENT_TIME
          ,DECODE(OPR_TIME_UNIT_TYP,1,0
                                   ,2,POST_ARRANGEMENT_TIME   ) AS  OPR_TIME_UNIT_TYP
          ,DECODE(OPR_TIME_UNIT_TYP,1,0
                                   ,2,OPR_TIME                ) AS  OPR_TIME
          ,WS_CD
    FROM   T_OPR_RSLT                         -- ��Ǝ���
    WHERE  OPR_INST_CD             = cvc2OPR_INST_CD
    ;
    -- ROWTYPE �̐錾
    recT_OPR_RSLT                  curT_OPR_RSLT%ROWTYPE;

/* �萔�̐錾 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncPjSubplusStockMake';      --�o�k�^�r�p�k��
    
    
/* �ϐ��̐錾 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- �t�@�C���n���h��
    blnRet                  BOOLEAN;            -- �֐��߂�l
    intRet                  INTEGER;            -- �֐��߂�l
    vc2ErrorCD              VARCHAR2(28);       -- �G���[�R�[�h
    numErrorSEQNO           NUMBER(6);          -- �G���[SEQNO
    numErrorCnt             NUMBER(6);          -- �G���[����
    vc2Comment              VARCHAR2(1024);     -- ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);     -- ���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2TraceComment         VARCHAR2(1024);     -- �g���[�[�X�o�͗p�R�����g�쐬��Ɨ̈�i���̓p�����[�^�L�^�p�j
    vc2Remarks              VARCHAR2(400);      -- �G���[�t�@�C���̔��l
    vc2ProcCD               VARCHAR2(100);      -- ��Ƌ�R�[�h
    numCountRec             NUMBER(6);          -- �����`�F�b�N�p
    numMaxSeqNO             NUMBER(6);          -- SEQNO
    numPsUnitQty            NUMBER(22,8);       -- ���ʃ��[�N
    numTgtCnt               NUMBER := 0;        -- �Ώی���
    vc2CompyCd              VARCHAR2(100);      -- �\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ�
    numOd_Level_No          NUMBER(6);          -- �K�w���x��
    datDue_Date             DATE;               -- ���
    vc2PJBuDgetDetailNo     VARCHAR2(100);      -- �Č��\�Z�Ϗ㖾�הԍ�
    vc2PjOdNo               VARCHAR2(100);      -- �I�[�_�f�}���h�ԍ�
    numPjPayRate            NUMBER(9,4);        -- �\�Z�Ǘ�����
    numPjRoundTyp           NUMBER(2);          -- �ۂߋ敪
    numResultAmount         NUMBER(18,4);       -- �ۂߌ���
    vc2PlantCd              VARCHAR2(8);        -- �H��R�[�h
    datTOTAL_DATE           DATE;               -- �W�v����
--  �\�Z���ю擾�ϐ�
    vc2VEND_CD              VARCHAR2(100);      -- ��\�����CD
    -- �\�Z --
    numPl_COST_MATERIAL     NUMBER(18,4);       -- �ޗ���
    numPl_COST_PROCESS      NUMBER(18,4);       -- ���H��
    numPl_COST_OUTSOUCE     NUMBER(18,4);       -- �O����
    numPl_COST_SERVICE      NUMBER(18,4);       -- �𖱔�
    -- ���� --
    numRs_COST_MATERIAL     NUMBER(18,4);       -- �ޗ���
    numRs_COST_PROCESS      NUMBER(18,4);       -- ���H��
    numRs_COST_OUTSOUCE     NUMBER(18,4);       -- �O����
    numRs_COST_SERVICE      NUMBER(18,4);       -- �𖱔�

    vc2MSG                      SYS_BUSINESS_MESSAGE.MSG%TYPE;                -- ���b�Z�[�W
    vc2PARENT_ITEM_CD           T_OD.ITEM_CD%TYPE;                            -- �e�i�ڔԍ�
    numCOST_UP_TYP              M_PS.COST_UP_TYP%TYPE;                        -- �����Ϗ�敪
    numALC_STOCK_FLG            T_PJ_BUDGET_DETAIL.ALC_STOCK_FLG%TYPE;        -- �����݌ɗL���t���O
    vc2NEW_OD_NO                T_PJ_BUDGET_DETAIL.OD_NO%TYPE;                -- �̔ԃI�[�_�f�}���h�ԍ�
    numODR_STS_TYP              T_PJ_BUDGET_DETAIL.ODR_STS_TYP%TYPE;          -- �I�[�_��ԋ敪
    numDM_STS_TYP               T_PJ_BUDGET_DETAIL.DM_STS_TYP%TYPE;           -- �f�}���h��ԋ敪
    numOD_TYP                   T_PJ_BUDGET_DETAIL.OD_TYP%TYPE;               -- �I�[�_�f�}���h�敪
    numDM_QTY                   T_PJ_BUDGET_DETAIL.DM_QTY%TYPE;               -- �f�}���h��
    vc2WS_CD                    M_WS.WS_CD%TYPE;                              -- ��Ƌ�R�[�h
    numWORK_TIME                T_SERVICE.WORK_TIME%TYPE;                     -- ��Ǝ���
    numRATE_PAY                 T_SERVICE.RATE_PAY%TYPE;                      -- ����
    numRATE_PAY2                T_SERVICE.RATE_PAY%TYPE;                      -- �����i��Ǝ��сj
    vc2CLASS_01_NAME            M_WS_CLASS.WS_CLASS_01_NAME%TYPE;             -- ��ƕ��ރR�[�h�O�P����
    vc2VEND_CD_H                M_SBCNT_UNIT_COST_H.VEND_CD%TYPE;             -- �w�b�_�����
    numTOTAL_MATR_COST          T_ITEM_COST.TOTAL_MATR_COST%TYPE;             -- �Ϗ�ޗ���
    numTOTAL_SBCNT_MATR_COST    T_ITEM_COST.TOTAL_SBCNT_MATR_COST%TYPE;       -- �Ϗ�ޗ���i�O���j
    numTOTAL_PROC_COST_SUM_ALL  T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL%TYPE;     -- �Ϗ���H��v
    numUNIT_COST                M_PUCH_UNIT_COST.UNIT_COST%TYPE;              -- �w���P��
    numCUR_CD                   M_VEND_CTRL.CUR_CD%TYPE;                      -- �ʉ݃R�[�h
    numEXCH_TYP                 M_VEND_CTRL.EXCH_TYP%TYPE;                    -- �ב֎��
    numDECIMAL_FIG              M_CUR.DECIMAL_FIG%TYPE;                       -- ��������
    numROUND_TYP                M_VEND_CTRL.ROUND_TYP%TYPE;                   -- �������z�ۂߋ敪
    numEXCH_RATE                M_EXCH_RATE.EXCH_RATE%TYPE;                   -- �בփ��[�g
    numACPT_QTY                 T_ACPT_RSLT.ACPT_QTY%TYPE;                    -- �����
    numPUCH_ODR_AMOUNT          T_ACPT_RSLT.PUCH_ODR_AMOUNT%TYPE;             -- ������z
    numPRE_ARRANGEMENT_TIME     T_OPR_RSLT.PRE_ARRANGEMENT_TIME%TYPE;         -- ��Ǝ��ђi�掞��
    numOPR_TIME_UNIT_TYP        T_OPR_RSLT.OPR_TIME_UNIT_TYP%TYPE;            -- ��Ǝ��ь�i�掞��
    numOPR_TIME                 T_OPR_RSLT.OPR_TIME%TYPE;                     -- ��Ǝ��э�Ǝ���
    numPUCH_ODR_CD              T_RLSD_PUCH_ODR.PUCH_ODR_CD%TYPE;             -- �����ԍ�
    numPUCH_ODR_STS_TYP         T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP%TYPE;        -- ������ԋ敪
    numPUCH_ODR_QTY             T_RLSD_PUCH_ODR.PUCH_ODR_QTY%TYPE;            -- ������
    numBUDGET_STACK_TYP         T_PJ_BUDGET_DETAIL.BUDGET_STACK_TYP%TYPE;     -- �\�Z�Ϗグ�敪
    numCOMP_QTY                 T_PJ_COST.COMP_QTY%TYPE;                      -- ������
    numCOST_PROGRESS            T_PJ_COST.COST_PROGRESS%TYPE;                 -- ��p�i��
    numCMP_COST_MATERIAL        T_PJ_COST.CMP_COST_MATERIAL%TYPE;             -- ��������  �ޗ���
    numCMP_COST_PROCESS         T_PJ_COST.CMP_COST_PROCESS%TYPE;              -- ��������  ���H��
    numCMP_COST_OUTSOUCE        T_PJ_COST.CMP_COST_OUTSOUCE%TYPE;             -- ��������  �O����
    numCMP_COST_SERVICE         T_PJ_COST.CMP_COST_SERVICE%TYPE;              -- ��������  �𖱔�
    numEXP_COST_MATERIAL        T_PJ_COST.EXP_COST_MATERIAL%TYPE;             -- ��������  �ޗ���
    numEXP_COST_PROCESS         T_PJ_COST.EXP_COST_PROCESS%TYPE;              -- ��������  ���H��
    numEXP_COST_OUTSOUCE        T_PJ_COST.EXP_COST_OUTSOUCE%TYPE;             -- ��������  �O����
    numEXP_COST_SERVICE         T_PJ_COST.EXP_COST_SERVICE%TYPE;              -- ��������  �𖱔�
    numPUCH_PRIORITY_REF_NO     M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO%TYPE; -- �w���D�揇��
    
    numPS_UNIT_QTY              T_PJ_BUDGET_DETAIL.PS_UNIT_QTY%TYPE;          -- ���i�\���P�ʐ�
    numDMY_ITEM_FLG             T_PJ_BUDGET_DETAIL.DMY_ITEM_FLG%TYPE;         -- �[���i�ڃt���O
    numVOLUNT_SPL_FLG           T_PJ_BUDGET_DETAIL.VOLUNT_SPL_FLG%TYPE;       -- �����󋋕i�t���O
    numPS_INPUT_RATIO           T_PJ_BUDGET_DETAIL.PS_INPUT_RATIO%TYPE;       -- �\���d�������W��
    numITEM_INPUT_RATIO         T_PJ_BUDGET_DETAIL.ITEM_INPUT_RATIO%TYPE;     -- �i�ڎd�������W��
    numP_OUTSIDE_TYP            T_PJ_BUDGET_DETAIL.OUTSIDE_TYP%TYPE;          -- ��ʎ�z�̓��O��敪
    numP_BUDGET_STACK_TYP       T_PJ_BUDGET_DETAIL.BUDGET_STACK_TYP%TYPE;     -- ��ʎ�z�̗\�Z�Ϗグ�敪
    numP_SEQNO                  T_PJ_BUDGET_DETAIL.PARENT_SEQNO%TYPE;         -- ��ʎ�z�̐eSEQNO
    numP_MRP_ODR_TYP            T_PJ_BUDGET_DETAIL.MRP_ODR_TYP%TYPE;          -- ��ʎ�z�̕i�ڎ�z�敪
    numP_VEND_CD                T_PJ_BUDGET_DETAIL.VEND_CD%TYPE;              -- �����CD
    numONEROUS_CONS_FLG         T_PJ_BUDGET_DETAIL.ONEROUS_CONS_FLG%TYPE;     -- �L���x���i�t���O
    numPARENT_SEQNO             T_PJ_BUDGET_DETAIL.PARENT_SEQNO%TYPE;         -- �eSEQNO
    numNECESSARY_QTY            T_PJ_BUDGET_DETAIL.NECESSARY_QTY%TYPE;        -- �K�v��
    
/*�v�Z�p���[�N*/
    numSave                 NUMBER(25);
    intCount                INTEGER(11);
    intCount2               INTEGER(11);

/*�G���[�p���[�N*/
    vc2TmpMessage           VARCHAR2(1024);       --�k�n�f���b�Z�[�W

-- MESSAGE �̐錾
    APS_COM_BATCH_START                 VARCHAR2(28)   := 'KM00040';    -- �Č��\�Z�Ϗ㏈�����J�n���܂����B
    APS_COM_BATCH_END                   VARCHAR2(28)   := 'KM00041';    -- �o�b�`�������I�����܂���
    APS_COM_MY_COMPANY                  VARCHAR2(28)   := 'DA00007';    -- ��ЃR�[�h�̎擾�Ɏ��s���܂����B
    APS_COM_SYSTEMPAR_ERR               VARCHAR2(28)   := 'KV03005';    -- �V�X�e���p�����[�^�̎擾�Ɏ��s���܂����B
    APS_COM_ParameterErr                VARCHAR2(28)   := 'ZZ09022';    -- �����G���[

    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'KM00042';    -- �Č��\�Z�Ϗ㏈���ɂĒv���I�G���[���������܂����B
    APS_COM_NOTEXIST_PJ_ODR_ALC         VARCHAR2(28)   := 'KM00052';    -- �Č��󒍕R�t�������݂ł��B
    APS_COM_T_ESTIMATE_DETAL            VARCHAR2(28)   := 'KM00044';    -- ���ϖ��ׂ����݂��܂���B
    APS_COM_NOTEXIST_ODR                VARCHAR2(28)   := 'KM00053';    -- �󒍖��ׂ������݂ł��B
    APS_COM_ODR_CTL_NTFD                VARCHAR2(28)   := 'KQ20189';    -- �󒍊Ǘ��ɊY���f�[�^�����݂��܂���B
    APS_COM_JOB_ODR_ALC                 VARCHAR2(28)   := 'KM00054';    -- �󒍂Ɛ��Ԃ̕R�t����������Ă��܂���B
    APS_COM_JOB_ODR                     VARCHAR2(28)   := 'KM00055';    -- ���Ԃ��o�^����Ă��܂���B
    APS_COM_JOB_ODR_PLAN                VARCHAR2(28)   := 'KM00056';    -- �w�肳�ꂽ���Ԃ����v�ʌv�Z������Ă��܂���B
    APS_COM_JOB_ODR_SET                 VARCHAR2(28)   := 'KM00057';    -- �w�肳�ꂽ���Ԃ����v�ʌv�Z������Ă��܂���B
    APS_COM_JOB_ODR_CALC                VARCHAR2(28)   := 'KM00056';    -- �w�肳�ꂽ���Ԃ����v�ʌv�Z����Ă��܂���B
    APS_COM_M_PROC_GRP                  VARCHAR2(28)   := 'AD50512';    -- ��ƌn���񂪑��݂��܂���B
    
    -- ��O�̐錾
    excFncTraceLog                      EXCEPTION;    -- �g���[�X���O�o�̓G���[
    excParameterErr                     EXCEPTION;    --�u�����v�G���[
    excParamWarning                     EXCEPTION;    -- �w�������Ϗグ�s�`�F�b�N�G���[
    excMasterErr                        EXCEPTION;    -- �Q�ƃ}�X�^�����݃G���[
    excGetNewPjOdNo                     EXCEPTION;    -- �\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��G���[
    excOTHER_ERR                        EXCEPTION;    -- �\�Z�Ϗグ�p�I�[�_�f�}���ht�o�^�G���[

    
    -- ��������
    STATUS_NORMAL                       NUMBER        := 1;                       -- ����I��
    STATUS_WARNING                      NUMBER        := 2;                       -- �x���I��
    STATUS_ERROR                        NUMBER        := 3;                       -- �ُ�I��

    -- LOG �̐錾
    LOGMSG_START                        VARCHAR2(20)   := 'Start';      -- ���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';        -- ���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    LOGMSG_SYSPARAM                     VARCHAR2(80)   := '�V�X�e���p�����[�^�F';
    LOGMSG_PARAM                        VARCHAR2(64)   := '���̓p�����[�^�F';
    LOGMSG_NEWODRNO                     VARCHAR2(152)  := '�\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��擾���s';
    LOGMSG_FATALCNT                     VARCHAR2(40)   := '�ُ팏���F';
    LOGMSG_BRACKETS                     VARCHAR2(4)    := '[';
    LOGMSG_BRACKETE                     VARCHAR2(4)    := ']';
    LOGMSG_COMMA                        VARCHAR2(4)    := ',';

/* �T�u�֐� */
FUNCTION SubFncInsBudgetError(
/*------------------------------------------------------------------------------
'
' �@�\      : �Č��\�Z�Ϗグ�G���[�o�^
'
' �߂�l    : NUMBER    ����
'
' ������    : pvcProcCd           - (i)��ƌn��R�[�h
'
'
' �@�\����  : �Č��\�Z�Ϗグ�Ŕ����������e��[�Č��\�Z�Ϗグ�G���[]��
'             �o�^����B
'
' ���l      : 
'
------------------------------------------------------------------------------*/
     pvcProcCd                IN  VARCHAR2            -- ��ƌn��R�[�h
    ) RETURN BOOLEAN
IS

    -- �ϐ��̐錾
    vc2PjBudgetErrNo           T_PJ_BUDGET_ERROR.PJ_BUDGET_ERR_NO%TYPE;      -- �Č��\�Z�Ϗグ�G���[
    vc2ErrJOB_ODR_CD           T_PJ_BUDGET_DETAIL.JOB_ODR_CD%TYPE;           -- ����
    vc2ErrJROOT_ITEM_CD        T_PJ_BUDGET_DETAIL.ROOT_ITEM_CD%TYPE;         -- �ŏ�ʕi�ڔԍ�
    vc2ErrJPARENT_ITEM_CD      T_PJ_BUDGET_DETAIL.PARENT_ITEM_CD%TYPE;       -- �e�i�ڔԍ�
    vc2ErrJITEM_CD             T_PJ_BUDGET_DETAIL.ITEM_CD%TYPE;              -- �i�ڔԍ�
    
BEGIN

    -- ���ʂ�ԋp
    numErrorCnt    :=  numErrorCnt +   1;
    
    -- �Č��\�Z�Ϗ�p�I�[�_�f�}���h�ԍ����̔�
    blnRet := FNCGETNEWPJBUDGETERRORCD(UTL_FileHandle
                                      ,pvc2LogMode
                                      ,pvc2OutputMode
                                      ,pvc2UserId
                                      ,pvc2BusinessName
                                      ,pvc2PlantCd
                                      ,vc2PjBudgetErrNo);
   
    -- �Č��\�Z�Ϗ㖾�׏����擾����
    IF  numErrorSEQNO    =   0   THEN
        vc2ErrJOB_ODR_CD         :=  Null;              -- ����
        vc2ErrJROOT_ITEM_CD      :=  Null;              -- �ŏ�ʕi�ڔԍ�
        vc2ErrJPARENT_ITEM_CD    :=  Null;              -- �e�i�ڔԍ�
        vc2ErrJITEM_CD           :=  Null;              -- �i�ڔԍ�
    ELSE
        BEGIN
            SELECT  /*+ RULE */
                    JOB_ODR_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
            INTO    vc2ErrJOB_ODR_CD,vc2ErrJROOT_ITEM_CD,vc2ErrJPARENT_ITEM_CD,vc2ErrJITEM_CD
            FROM    T_PJ_BUDGET_DETAIL 
            WHERE   PJ_BUDGET_DETAIL_NO  =  vc2PJBuDgetDetailNo
            AND     SEQNO                =  numErrorSEQNO
            ;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                vc2ErrJOB_ODR_CD         :=  Null;              -- ����
                vc2ErrJROOT_ITEM_CD      :=  Null;              -- �ŏ�ʕi�ڔԍ�
                vc2ErrJPARENT_ITEM_CD    :=  Null;              -- �e�i�ڔԍ�
                vc2ErrJITEM_CD           :=  Null;              -- �i�ڔԍ�
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 01:SELECT PJ_BUDGET_DETAIL_NO'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;     
    END IF;

    -- ���l���e�ҏW
    BEGIN
        SELECT  MSG
        INTO    vc2MSG
        FROM    SYS_BUSINESS_MESSAGE 
        WHERE   MSG_CD  =  vc2ErrorCD
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            vc2Remarks         :=  Null;              -- ���l
        WHEN OTHERS THEN
            vc2Comment := SUBSTR(' SELECT SYS_BUSINESS_MESSAGE'         ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;   
    vc2Remarks  := vc2MSG||' '||vc2Remarks;

    BEGIN
        INSERT INTO T_PJ_BUDGET_ERROR(
                PJ_BUDGET_ERR_NO     -- 1  �Č��\�Z�Ϗグ�G���[�ԍ�
               ,PROJECT_CD           -- 2  �Č��ԍ�
               ,ESTIMATE_NO          -- 3  ���ϔԍ�
               ,DETAL_NO             -- 4  ���הԍ�
               ,ODR_NO               -- 5  �󒍔ԍ�
               ,PLANT_CD             -- 6  �H��R�[�h
               ,JOB_ODR_CD           -- 7  ����
               ,ROOT_ITEM_CD         -- 8  �ŏ�ʕi�ڔԍ�
               ,PARENT_ITEM_CD       -- 9  �e�i�ڔԍ�
               ,ITEM_CD              -- 10 �i�ڔԍ�
               ,PROC_CD              -- 11 ��ƌn��R�[�h
               ,MESSAGE_CD           -- 12 ���b�Z�[�W�R�[�h
               ,REMARKS              -- 13 ���l
               ,LIST_ISS_FLG         -- 14 ���X�g�o�͍σt���O
               ,CREATED_DATE         -- 15 �쐬��
               ,CREATED_BY           -- 16 �쐬��
               ,CREATED_PRG_NM       -- 17 �쐬�v���O������
               ,UPDATED_DATE         -- 18 �X�V��
               ,UPDATED_BY           -- 19 �X�V��
               ,UPDATED_PRG_NM       -- 20 �X�V�v���O������
               ,MODIFY_COUNT         -- 21 �X�V��
        ) VALUES (
                vc2PjBudgetErrNo      -- 1  �Č��\�Z�Ϗグ�G���[�ԍ�
               ,pvc2ProjectCd         -- 2  �Č��ԍ�
               ,pvc2EstimateNo        -- 3  ���ϔԍ�
               ,pvc2DetalNo           -- 4  ���הԍ�
               ,pvc2OdrNO             -- 5  �󒍔ԍ�
               ,pvc2PlantCd           -- 6  �H��R�[�h
               ,vc2ErrJOB_ODR_CD      -- 7  ����
               ,vc2ErrJROOT_ITEM_CD   -- 8  �ŏ�ʕi�ڔԍ�
               ,vc2ErrJPARENT_ITEM_CD -- 9  �e�i�ڔԍ�
               ,vc2ErrJITEM_CD        -- 10 �i�ڔԍ�
               ,pvcProcCd             -- 11 ��ƌn��R�[�h
               ,vc2ErrorCD            -- 12 ���b�Z�[�W�R�[�h
               ,vc2Remarks            -- 13 ���l
               ,0                     -- 14 ���X�g�o�͍σt���O
               ,SYSDATE               -- 15 �쐬��
               ,pvc2UserId            -- 16 �쐬��
               ,pvc2BusinessName      -- 17 �쐬�v���O������
               ,SYSDATE               -- 18 �X�V��
               ,pvc2UserId            -- 19 �X�V��
               ,pvc2BusinessName      -- 20 �X�V�v���O������
               ,0);                   -- 21 �X�V��
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR(' INSERT T_PJ_BUDGET_ERROR'          ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                 1,256);
            RAISE excOTHER_ERR;
    END;

    -- �I�����b�Z�[�W�̏o��
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,pvc2PlantCd, 
                        MY_SQL_NAME, vc2ErrorCD, vc2Comment);

    vc2Remarks  :=  NULL;            -- �G���[�t�@�C�����l
    -- ���ʂ�ԋp
    RETURN TRUE;
END;

--<���C������ >-----------------------------------------------------
BEGIN
  DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    vc2RunChkComment := NULL;
    pnumReturn       := STATUS_NORMAL;

    /* LogFile �� OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    IF NOT blnRet THEN
        pnumReturn := STATUS_ERROR;
        RETURN;
    END IF;

    vc2RunChkComment  :=  'PROJECT_CD='||pvc2ProjectCd|| ', ESTIMATE_NO='||pvc2EstimateNo||', DETAL_NO='||pvc2DetalNo;
    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START, vc2RunChkComment);

    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, LOGMSG_START);

    /* �R�~�b�g */
    COMMIT;

    -- �J�E���^�A�ϐ��̏�����
    vc2Comment             :=  NULL;            -- ���b�Z�[�W�N���A
    numErrorCnt            :=  0;               -- �G���[����
    numMaxSeqNO            :=  0;               -- SEQNO
    numErrorSEQNO          :=  0;
    vc2Remarks             :=  NULL;            -- �G���[�t�@�C�����l
    
/*------------------------------------------------------------
'  ��������
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    -- ��ЃR�[�h
    BEGIN
        SELECT  /*+ RULE */
          COMPANY_CD
        INTO
          vc2CompyCd
        FROM
          SYS_MY_COMPANY
        WHERE
          SYS_MY_COMPANY.CTRL_CD = 'SYSTEM'
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            vc2Comment  := '';
            vc2ErrorCd  := APS_COM_MY_COMPANY;
            RAISE excParameterErr;
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('01:SELECT SYS_MY_COMPANY'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;
    
    -- �V�X�e���p�����[�^�u�\�Z�Ǘ������v���擾����
    BEGIN
        SELECT  /*+ RULE */
            VALUE
        INTO
            numPjPayRate
        FROM 
            SYS_PARAMETER
        WHERE NAME  = 'PJ_PAY_RATE';
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            vc2Comment  := LOGMSG_SYSPARAM || ' �\�Z�Ǘ�����(PJ_PAY_RATE)';
            vc2ErrorCd  := APS_COM_SYSTEMPAR_ERR;
            RAISE excParameterErr;
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('01:SELECT SYS_PARAMETER'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    -- �V�X�e���p�����[�^�u�܂�ߋ敪�v���擾����
    BEGIN
        SELECT  /*+ RULE */
            VALUE
        INTO
            numPjRoundTyp
        FROM 
            SYS_PARAMETER
        WHERE NAME  = 'PJ_ROUND_TYP';
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            vc2Comment  := LOGMSG_SYSPARAM||'�\�Z�Ǘ��܂�ߋ敪(PJ_ROUND_TYP)';
            vc2ErrorCd := APS_COM_SYSTEMPAR_ERR;
            RAISE excParameterErr;
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('01:SELECT SYS_PARAMETER'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    -- ���ʂ̓��̓p�����[�^�̃`�F�b�N
    IF  pvc2LogMode IS NULL THEN       --�k�n�f���[�h���m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pvc2OutputMode IS NULL THEN    --�o�̓��[�h���m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pvc2OutputPath IS NULL THEN    --�o�̓p�X���m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pvc2OutputName IS NULL THEN    --�o�̓t�@�C�������m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pvc2UserId IS NULL THEN        --���[�U�h�c���m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pvc2BusinessName IS NULL THEN  --�Ɩ������m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pnumFlag IN (0,1) THEN      --�����敪���m�t�k�k
        vc2RunChkComment := NULL;
    ELSE
        RAISE excParameterErr;
    END IF;
    IF  pvc2ProjectCd IS NULL THEN    --�Č��ԍ����m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pvc2EstimateNo IS NULL THEN    --���ϔԍ����m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pvc2DetalNo IS NULL THEN       --���הԍ����m�t�k�k
        RAISE excParameterErr;
    END IF;
    IF  pvc2OdrNO IS NULL THEN       --�󒍔ԍ����m�t�k�k
        RAISE excParameterErr;
    END IF;

/*------------------------------------------------------------
' �Č����ԏ��擾����
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    -- �Č��\�Z�Ϗ㖾�הԍ����̔�
    blnRet := FNCGETNEWPJBUDGETDETAILNO(UTL_FileHandle
                                       ,pvc2LogMode
                                       ,pvc2OutputMode
                                       ,pvc2UserId
                                       ,pvc2BusinessName
                                       ,pvc2PlantCd
                                       ,vc2PJBuDgetDetailNo);
    IF blnRet = FALSE THEN
       RAISE excGetNewPjOdNo;
    END IF;

    -- �Č��󒍕R�t������
    BEGIN
        OPEN curT_PJ_ODR_ALC(pvc2ProjectCd,pvc2EstimateNo,pvc2DetalNo);
    EXCEPTION
       WHEN OTHERS THEN
            vc2Comment := SUBSTR('02:SELECT T_PJ_ODR_ALC'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    BEGIN
        FETCH curT_PJ_ODR_ALC INTO recT_PJ_ODR_ALC;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('02:SELECT T_PJ_ODR_ALC'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    /* �Č��󒍕R�t�ɑΏۃf�[�^�����݂��Ȃ��ꍇ */
    IF curT_PJ_ODR_ALC%NOTFOUND THEN
        vc2ErrorCd      :=  APS_COM_NOTEXIST_PJ_ODR_ALC;
        vc2Comment      :=  '';
        vc2TraceComment := '�Č��󒍕R�t�����݂��܂���B';
        RAISE excParamWarning;
    END IF;
    -- CLOSE
    CLOSE curT_PJ_ODR_ALC;

    -- ���ϖ��ׂ�����
    BEGIN
        OPEN curT_ESTIMATE_DETAL(pvc2ProjectCd,pvc2EstimateNo,pvc2DetalNo);
    EXCEPTION
       WHEN OTHERS THEN
            vc2Comment := SUBSTR('02:SELECT T_ESTIMATE_DETAL'           ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    BEGIN
        FETCH curT_ESTIMATE_DETAL INTO recT_ESTIMATE_DETAL;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('02:SELECT T_ESTIMATE_DETAL'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE;
    END;

    /* ���ϖ��ׂɑΏۃf�[�^�����݂��Ȃ��ꍇ */
    IF curT_ESTIMATE_DETAL%NOTFOUND THEN
        vc2ErrorCd      :=  APS_COM_T_ESTIMATE_DETAL;
        vc2Comment      :=  '';
        vc2TraceComment := '���ς薾�ׂ����݂��܂���B';
        RAISE excParameterErr;
    END IF;
    -- CLOSE
    CLOSE curT_ESTIMATE_DETAL;
    
    -- �󒍏����擾����
    IF recT_PJ_ODR_ALC.ESTIMATE_TYPE = 1     then 
        -- 1:���i�̏ꍇ
        
        -- �󒍖��ׂ��擾����
        BEGIN
            OPEN curT_ODR(pvc2OdrNO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR'   ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        BEGIN
            FETCH curT_ODR INTO recT_ODR;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR'   ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        /* �󒍖��ׂɑΏۃf�[�^�����݂��Ȃ��ꍇ */
        IF curT_ODR%NOTFOUND THEN
            vc2ErrorCd      :=  APS_COM_NOTEXIST_ODR;
            vc2Comment      :=  '';
            vc2TraceComment := '�󒍖��ׂ����݂��܂���B';
            RAISE excParameterErr;
        END IF;
        -- CLOSE
        CLOSE curT_ODR;    

        -- �󒍊Ǘ�,�i�ڂ��擾����
        BEGIN
            OPEN curT_ODR_CTL(recT_ODR.ODR_CTL_NO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR_CTL'          ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        BEGIN
            FETCH curT_ODR_CTL INTO recT_ODR_CTL;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR_CTL'          ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        /* �󒍊Ǘ��ɑΏۃf�[�^�����݂��Ȃ��ꍇ */
        IF curT_ODR_CTL%NOTFOUND THEN
            vc2ErrorCd      :=  APS_COM_ODR_CTL_NTFD;
            vc2Comment      :=  '';
            vc2TraceComment := '�󒍊Ǘ��ɊY���f�[�^�����݂��܂���B';
            RAISE excParameterErr;
        END IF;
        -- CLOSE
        CLOSE curT_ODR_CTL;    

        -- �󒍂ɑ΂���i�ڂ�����
        IF  recT_ODR_CTL.MRP_ODR_TYP  IN (1 , 2)  THEN  
            -- 1:���i�̏ꍇ
            
            -- �󒍂Ɛ��Ԃ��R�t����Ă��邩�̃`�F�b�N
            IF recT_ODR.JOB_ODR_SET_FLG = 0 THEN 
                vc2ErrorCd      :=  APS_COM_JOB_ODR_ALC;
                vc2Comment      :=  '';
                vc2TraceComment := '�󒍂Ɛ��Ԃ̕R�t����������Ă��܂���B';
                RAISE excParamWarning;
            END IF;
                
            -- ���Ԏ󒍕R�t���擾����
            BEGIN
                OPEN curT_JOB_ODR_ODR_ALC(pvc2OdrNO,vc2CompyCd);
            EXCEPTION
               WHEN OTHERS THEN
                    vc2Comment := SUBSTR('02:T_JOB_ODR_ODR_ALC'         ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE;
            END;
            
            BEGIN
                FETCH curT_JOB_ODR_ODR_ALC INTO recT_JOB_ODR_ODR_ALC;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('02:T_JOB_ODR_ODR_ALC'         ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE;
            END;
            
            /* ���Ԏ󒍕R�t�ɑΏۃf�[�^�����݂��Ȃ��ꍇ */
            IF curT_JOB_ODR_ODR_ALC%NOTFOUND THEN
                vc2ErrorCd      :=  APS_COM_JOB_ODR_ALC;
                vc2Comment      :=  '';
                vc2TraceComment := '�󒍂Ɛ��Ԃ̕R�t����������Ă��܂���B';
                RAISE excParamWarning;
            END IF;
            -- CLOSE
            CLOSE curT_JOB_ODR_ODR_ALC;    

                
            -- ���Ԍv����擾����
            BEGIN
                OPEN curT_JOB_ODR(recT_JOB_ODR_ODR_ALC.JOB_ODR_CD
                                 ,recT_JOB_ODR_ODR_ALC.JOB_ODR_DETAIL_NO
                                 ,recT_JOB_ODR_ODR_ALC.JOB_ODR_CANCEL_NO);
            EXCEPTION
               WHEN OTHERS THEN
                    vc2Comment := SUBSTR('02:T_T_JOB_ODR'    ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE;
            END;
            
            BEGIN
                FETCH curT_JOB_ODR INTO recT_JOB_ODR;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('02:T_T_JOB_ODR'    ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                    RAISE;
            END;
            
            /* ���Ԏ󒍕R�t�ɑΏۃf�[�^�����݂��Ȃ��ꍇ */
            IF curT_JOB_ODR%NOTFOUND THEN
                vc2ErrorCd      :=  APS_COM_JOB_ODR;
                vc2Comment      :=  '';
                vc2TraceComment := '���Ԏ󒍕R�����݂��܂���B';
                RAISE excParamWarning;
            END IF;
            -- CLOSE
            CLOSE curT_JOB_ODR;  

             --���v�ʌv�Z���s���Ă��邩�`�F�b�N
             IF recT_JOB_ODR.JOB_ODR_STS_TYP IN (1 , 2)    THEN
                vc2ErrorCd      :=  APS_COM_JOB_ODR_PLAN;
                vc2Comment      :=  '';
                vc2TraceComment := '�w�肳�ꂽ���Ԃ����v�ʌv�Z������Ă��܂���';
                RAISE excParamWarning;
             END IF;
        END IF;
    ELSE
        -- 2:�𖱂̏ꍇ
        
        -- ��݌Ɏ󒍂̌������s��
        BEGIN
            OPEN curT_ODR_UNSTOCK(pvc2OdrNO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR_UNSTOCK'      ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        BEGIN
            FETCH curT_ODR_UNSTOCK INTO recT_ODR_UNSTOCK;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:SELECT T_ODR_UNSTOCK'      ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;
        
        /* ��݌Ɏ󒍂����݂��Ȃ��ꍇ */
        IF curT_ODR_UNSTOCK%NOTFOUND THEN
            vc2ErrorCd      :=  APS_COM_NOTEXIST_ODR;
            vc2Comment      :=  '';
            vc2TraceComment := '��݌Ɏ󒍂����݂��܂���B';
            RAISE excParameterErr;
        END IF;
        CLOSE curT_ODR_UNSTOCK;
    END if;

/*------------------------------------------------------------
'  �Č��\�Z�Ϗ㖾�הԍ폜
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    -- �����t���O��1:�o�b�`�̎��A���L������[�Č��\�Z�Ϗ㖾��] ��S���폜����B
    IF pnumFlag = 1  THEN
       -- �Č��\�Z�Ϗ㖾�f�[�^�폜
       DELETE FROM T_PJ_BUDGET_DETAIL
       WHERE PROJECT_CD = pvc2ProjectCd;
    END IF;
/*------------------------------------------------------------
'  �Č��\�Z�Ϗ㖾�׍쐬����
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    /* --- �@���v�ʂ��擾���� --- */
    CASE
    /* ���ςɕR�t���i�ڂ�MRP�i�̎� */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (4 ,5 ,6 ,7))  THEN
        
        -- SEQNO �J�E���g�A�b�v
        numMaxSeqNO    :=  numMaxSeqNO +   1;
        numErrorSEQNO  :=  numMaxSeqNO;
               
        -- �Č��\�Z�Ϗ�p�I�[�_�f�}���h�ԍ����̔�
        blnRet := FNCGETNEWPJODNO(UTL_FileHandle
                                 ,pvc2LogMode
                                 ,pvc2OutputMode
                                 ,pvc2UserId
                                 ,pvc2BusinessName
                                 ,pvc2PlantCd
                                 ,vc2PjOdNo);

        -- �o�׌v��
        BEGIN
            SELECT /*+ RULE */
                   OD.PLANT_CD
            INTO   vc2PlantCd
            FROM   T_OD  OD
                 ,(SELECT OD_NO FROM T_ANS_DLV_DATE
                   WHERE  ODR_NO = pvc2OdrNO
                          and rownum <= 1   
                   ORDER BY  PART_DLV_SEQ_NO) AN
            WHERE  OD.OD_NO     =  AN.OD_NO;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                vc2PlantCd   :=  pvc2PlantCd;
            WHEN OTHERS THEN
                RAISE;
        END;
        
        -- �Č��\�Z�Ϗ㖾�ׂ̓o�^
        BEGIN
            INSERT INTO T_PJ_BUDGET_DETAIL(
                    PJ_BUDGET_DETAIL_NO         --  1 �Č��\�Z�Ϗ㖾�הԍ�
                   ,SEQNO                       --  2 SEQNO
                   ,OD_NO                       --  3 �I�[�_�f�}���h�ԍ�
                   ,PROJECT_CD                  --  4 �Č��ԍ�
                   ,ESTIMATE_NO                 --  5 ���ϔԍ�
                   ,DETAL_NO                    --  6 ���הԍ�
                   ,ODR_NO                      --  7 �󒍔ԍ�
                   ,ESTIMATE_TYPE               --  8 ��z�i�ڎ�
                   ,ODR_ACPT_DATE               --  9 �󒍓�
                   ,PLANT_CD                    -- 10 �H��R�[�h
                   ,JOB_ODR_CD                  -- 11 ����
                   ,JOB_ODR_DETAIL_NO           -- 12 ���Ԏ}��
                   ,JOB_ODR_CANCEL_NO           -- 13 ���Ԏ�������ԍ�
                   ,ROOT_ITEM_CD                -- 14 �ŏ�ʕi�ڔԍ�
                   ,PARENT_ITEM_CD              -- 15 �e�i�ڔԍ�
                   ,ITEM_CD                     -- 16 �i�ڔԍ�
                   ,ODR_STS_TYP                 -- 17 �I�[�_��ԋ敪
                   ,DM_STS_TYP                  -- 18 �f�}���h��ԋ敪
                   ,OD_TYP                      -- 19 �I�[�_�f�}���h�敪
                   ,DUE_DATE                    -- 20 �v���[��
                   ,ODR_START_DATE              -- 21 ��z�����
                   ,PRD_DUE_DATE                -- 22 �����[��
                   ,PRD_START_DATE              -- 23 ���������
                   ,DM_QTY                      -- 24 �f�}���h��
                   ,ODR_QTY                     -- 25 �I�[�_��
                   ,MRP_ODR_TYP                 -- 26 �i�ڎ�z�敪
                   ,OUTSIDE_TYP                 -- 27 ���v�ʓ��O��敪
                   ,PRODUCT_TYP                 -- 28 ���i�敪
                   ,UNIT_QTY_TYP                -- 29 �݌ɐ��P�ʋ敪
                   ,PS_UNIT_QTY                 -- 30 ���i�\���P�ʐ�
                   ,PS_UNIT_DENOMINATOR         -- 31 ���i�\���P�ʐ�����
                   ,PS_UNIT_NUMERATOR           -- 32 ���i�\���P�ʐ����q
                   ,TOTAL_RCV_QTY               -- 33 ���ɗ݌v��
                   ,TOTAL_ISSUE_QTY             -- 34 �o�ɗ݌v��
                   ,OD_LEVEL_NO                 -- 35 ���v�ʃ��x���ԍ�
                   ,PARENT_SEQNO                -- 36 �eSEQNO
                   ,ITEM_SPOIL                  -- 37 ���v�ʕi�ڎd����
                   ,PS_SPOIL                    -- 38 ���v�ʍ\���d����
                   ,CONS_TYP                    -- 39 �\���x���敪
                   ,NECESSARY_QTY               -- 40 �K�v���v��
                   ,PS_INPUT_RATIO              -- 41 �\���d�������W��
                   ,ITEM_INPUT_RATIO            -- 42 �i�ڎd�������W��
                   ,VEND_CD                     -- 43 �����R�[�h
                   ,ODR_COST_MATERIAL           -- 44 ��z�c  �ޗ���
                   ,ODR_COST_PROCESS            -- 45 ��z�c  ���H��
                   ,ODR_COST_OUTSOUCE           -- 46 ��z�c  �O����
                   ,ODR_COST_SERVICE            -- 47 ��z�c  �𖱔�
                   ,CMP_COST_MATERIAL           -- 48 ��������  �ޗ���
                   ,CMP_COST_PROCESS            -- 49 ��������  ���H��
                   ,CMP_COST_OUTSOUCE           -- 50 ��������  �O����
                   ,CMP_COST_SERVICE            -- 51 ��������  �𖱔�
                   ,EXP_COST_MATERIAL           -- 52 ��������  �ޗ���
                   ,EXP_COST_PROCESS            -- 53 ��������  ���H��
                   ,EXP_COST_OUTSOUCE           -- 54 ��������  �O����
                   ,EXP_COST_SERVICE            -- 55 ��������  �𖱔�
                   ,DMY_ITEM_FLG                -- 56 �[���i�ڃt���O
                   ,VOLUNT_SPL_FLG              -- 57 �����󋋕i�t���O
                   ,COST_UP_TYP                 -- 58 �����Ϗ�敪
                   ,ONEROUS_CONS_FLG            -- 59 �L���x���i�t���O
                   ,BUDGET_STACK_TYP            -- 60 �\�Z�Ϗグ�敪
                   ,ODR_RELEASE_FLG             -- 61 �I�[�_�����σt���O
                   ,ORG_OD_NO                   -- 62 ���I�[�_�f�}���h�ԍ�
                   ,ORG_JOB_ODR_CD              -- 63 ������
                   ,ORG_JOB_ODR_DETAIL_NO       -- 64 �����Ԏ}��
                   ,ORG_ODR_QTY                 -- 65 ���I�[�_��
                   ,RCV_ISSUE_GNR_TYP           -- 66 ���o�ɔ����敪
                   ,ALC_STOCK_FLG               -- 67 �����݌ɗL���t���O
                   ,ALC_STOCK_ODR_FLG           -- 68 �݌Ɉ������v�ʓW�J�敪
                   ,ALC_STOCK_TYP               -- 69 �����݌ɋ敪
                   ,ALC_STOCK_RATE              -- 70 �����݌ɋ旦
                   ,CREATED_DATE                -- 71 �쐬��
                   ,CREATED_BY                  -- 72 �쐬��
                   ,CREATED_PRG_NM              -- 73 �쐬�v���O������
                   ,UPDATED_DATE                -- 74 �X�V��
                   ,UPDATED_BY                  -- 75 �X�V��
                   ,UPDATED_PRG_NM              -- 76 �X�V�v���O������
                   ,MODIFY_COUNT                -- 77 �X�V��
            ) VALUES (
                    vc2PJBuDgetDetailNo             --  1 �Č��\�Z�Ϗ㖾�הԍ�
                   ,numMaxSeqNO                     --  2 SEQNO
                   ,vc2PjOdNo                       --  3 �I�[�_�f�}���h�ԍ�
                   ,pvc2ProjectCd                   --  4 �Č��ԍ�
                   ,pvc2EstimateNo                  --  5 ���ϔԍ�
                   ,pvc2DetalNo                     --  6 ���הԍ�
                   ,pvc2OdrNO                       --  7 �󒍔ԍ�
                   ,recT_PJ_ODR_ALC.ESTIMATE_TYPE   --  8 ��z�i�ڎ�
                   ,recT_ODR.ODR_ACPT_DATE          --  9 �󒍓�
                   ,vc2PlantCd                      -- 10 �H��R�[�h
                   ,null                            -- 11 ����
                   ,null                            -- 12 ���Ԏ}��
                   ,null                            -- 13 ���Ԏ�������ԍ�
                   ,recT_ODR_CTL.ITEM_CD            -- 14 �ŏ�ʕi�ڔԍ�
                   ,null                            -- 15 �e�i�ڔԍ�
                   ,recT_ODR_CTL.ITEM_CD            -- 16 �i�ڔԍ�
                   ,0                               -- 17 �I�[�_��ԋ敪
                   ,9                               -- 18 �f�}���h��ԋ敪
                   ,3                               -- 19 �I�[�_�f�}���h�敪
                   ,recT_ODR.ODR_ACPT_DATE          -- 20 �v���[��
                   ,null                            -- 21 ��z�����
                   ,recT_ODR.ODR_ACPT_DATE          -- 22 �����[��
                   ,null                            -- 23 ���������
                   ,recT_ODR.ODR_QTY                -- 24 �f�}���h��
                   ,recT_ODR.ODR_QTY                -- 25 �I�[�_��
                   ,recT_ODR_CTL.MRP_ODR_TYP        -- 26 �i�ڎ�z�敪
                   ,recT_ODR_CTL.OUTSIDE_TYP        -- 27 ���v�ʓ��O��敪
                   ,recT_ODR_CTL.PRODUCT_TYP        -- 28 ���i�敪
                   ,recT_ODR_CTL.UNIT_QTY_TYP       -- 29 �݌ɐ��P�ʋ敪
                   ,0                               -- 30 ���i�\���P�ʐ�
                   ,0                               -- 31 ���i�\���P�ʐ�����
                   ,0                               -- 32 ���i�\���P�ʐ����q
                   ,0                               -- 33 ���ɗ݌v��
                   ,0                               -- 34 �o�ɗ݌v��
                   ,0                               -- 35 ���v�ʃ��x���ԍ�
                   ,null                            -- 36 �eSEQNO
                   ,recT_ODR_CTL.ITEM_SPOIL         -- 37 ���v�ʕi�ڎd����
                   ,0                               -- 38 ���v�ʍ\���d����
                   ,0                               -- 39 �\���x���敪
                   ,recT_ODR.ODR_QTY                -- 40 �K�v���v��
                   ,0                               -- 41 �\���d�������W��
                   ,0                               -- 42 �i�ڎd�������W��
                   ,null                            -- 43 �����R�[�h
                   ,0                               -- 44 ��z�c  �ޗ���
                   ,0                               -- 45 ��z�c  ���H��
                   ,0                               -- 46 ��z�c  �O����
                   ,0                               -- 47 ��z�c  �𖱔�
                   ,0                               -- 48 ��������  �ޗ���
                   ,0                               -- 49 ��������  ���H��
                   ,0                               -- 50 ��������  �O����
                   ,0                               -- 51 ��������  �𖱔�
                   ,0                               -- 52 ��������  �ޗ���
                   ,0                               -- 53 ��������  ���H��
                   ,0                               -- 54 ��������  �O����
                   ,0                               -- 55 ��������  �𖱔�
                   ,0                               -- 56 �[���i�ڃt���O
                   ,0                               -- 57 �����󋋕i�t���O
                   ,1                               -- 58 �����Ϗ�敪
                   ,0                               -- 59 �L���x���i�t���O
                   ,1                               -- 60 �\�Z�Ϗグ�敪
                   ,1                               -- 61 �I�[�_�����σt���O
                   ,null                            -- 62 ���I�[�_�f�}���h�ԍ�
                   ,null                            -- 63 ������
                   ,0                               -- 64 �����Ԏ}��
                   ,0                               -- 65 ���I�[�_��
                   ,null                            -- 66 ���o�ɔ����敪
                   ,0                               -- 67 �����݌ɗL���t���O
                   ,0                               -- 68 �݌Ɉ������v�ʓW�J�敪
                   ,1                               -- 69 �����݌ɋ敪
                   ,1                               -- 70 �����݌ɋ旦
                   ,SYSDATE                         -- 71 �쐬��
                   ,pvc2UserId                      -- 72 �쐬��
                   ,pvc2BusinessName                -- 73 �쐬�v���O������
                   ,SYSDATE                         -- 74 �X�V��
                   ,pvc2UserId                      -- 75 �X�V��
                   ,pvc2BusinessName                -- 76 �X�V�v���O������
                   ,0);                             -- 77 �X�V��
        EXCEPTION
            WHEN OTHERS THEN
                -- �Č��\�Z�Ϗ㖾�׎��s
                    -- �Č��\�Z�Ϗ㖾�׎��s
                    vc2Comment := SUBSTR('05:INSERT UT_PURCH_OPER_BUDGET'       ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1, 256);
                    RAISE excOTHER_ERR;
        END;
    
    /* ���ςɕR�t���i�ڂ����ԕi�̎� */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (1 ,2))  THEN

        -- ���v�ʂ̃J�[�\��OPEN
        BEGIN
           OPEN curT_OD(recT_JOB_ODR.JOB_ODR_CD,recT_JOB_ODR.JOB_ODR_DETAIL_NO,recT_JOB_ODR.JOB_ODR_CANCEL_NO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 02:OPEN curT_OD'   ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
         END;
            

    	LOOP
            -- ���v�ʂ̃J�[�\��FETCH
            BEGIN
                FETCH curT_OD  INTO recT_OD;
            EXCEPTION
                WHEN OTHERS THEN
                    -- �J�[�\��FETCH���s
                    vc2Comment  := SUBSTR(' 02:FETCH curT_OD'            ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            
            -- ���v�ʃJ�[�\��END
            EXIT WHEN  curT_OD%NOTFOUND;
            
            -- SEQNO �J�E���g�A�b�v
            numMaxSeqNO    :=  numMaxSeqNO +   1;
            numErrorSEQNO  :=  numMaxSeqNO;

            -- ��ʎ�z���擾
            IF  recT_OD.PARENT_OD_NO   is Null  THEN
                vc2PARENT_ITEM_CD  :=  Null;
                numCOST_UP_TYP     :=  1;
            ELSE
                -- ��ʎ�z�i�̏��v�ʂ�����
                BEGIN
                    SELECT /*+ RULE */
                           ITEM_CD 
                    INTO   vc2PARENT_ITEM_CD
                    FROM   T_OD
                    WHERE  OD_NO            =  recT_OD.PARENT_OD_NO;   -- �e�I�[�_�f�}���h�ԍ�
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
                        RAISE excMasterErr;
                    WHEN OTHERS THEN
                        RAISE;
                END;
                
                -- �v���[���̐ݒ�
                datDue_Date     :=  recT_OD.PRD_DUE_DATE;
                
                -- ���i�\�����(�����Ϗグ�t���O)�擾
                BEGIN
                    SELECT /*+ RULE */
                           COST_UP_TYP 
                    INTO   numCOST_UP_TYP
                    FROM   M_PS
                    WHERE  PARENT_ITEM_CD      =  vc2PARENT_ITEM_CD         -- �e�i�ڔԍ�
                    AND    COMP_ITEM_CD        =  recT_OD.ITEM_CD           -- �i�ڔԍ�
                    AND    EFF_PHASE_IN_DATE   <= datDue_Date               -- ���i�\���L���J�n��
                    AND    EFF_PHASE_OUT_DATE  >= datDue_Date;              -- ���i�\���L���J�n��
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
                        -- ���i�\�����Ȃ������v�ʃ����e�Œǉ�  �����Ϗグ�Ƃ���B
                        numCOST_UP_TYP   :=   1;
                    WHEN OTHERS THEN
                        RAISE;
                END;
            END IF;
            
            -- ���Ԏ�z�����邩�̌���
            BEGIN
                SELECT /*+ RULE */ 
                       COUNT(*)            INTO numCountRec
                FROM   T_JOB_ODR_ALC
                WHERE  OD_NO               =  recT_OD.OD_NO;
            EXCEPTION
                WHEN OTHERS THEN
                    RAISE;
            END;
            IF  numCountRec  >  0    THEN
                numALC_STOCK_FLG   :=  1;
            ELSE
                numALC_STOCK_FLG   :=  0;
            END IF;

            /*  �[���i�ڃt���O  */
            IF recT_OD.MRP_ODR_TYP = 8 THEN
                numDMY_ITEM_FLG      := 1;
            ELSE
                numDMY_ITEM_FLG      := 0;
            END IF;
            
            /*  �����󋋕i�t���O  */
            IF recT_OD.SPL_ITEM_TYP = 2 THEN
                numVOLUNT_SPL_FLG      := 1;
            ELSE
                numVOLUNT_SPL_FLG      := 0;
            END IF;
            
            /*  �\���d�������W��  */
            numPS_INPUT_RATIO           := CEIL((1+ recT_OD.PS_SPOIL /100) * 10000) / 10000 ;

            /*  �i�ڎd�������W��  */
            IF recT_OD.MRP_ODR_TYP <> 8 THEN
               numITEM_INPUT_RATIO         := CEIL(((1+ recT_OD.ITEM_SPOIL2 /100)) * 10000) / 10000 ;
            ELSE
               numITEM_INPUT_RATIO         := 1.0;
            END IF;
            
            /*  ��ʎ�z�i������  */
            IF recT_OD.PARENT_OD_NO IS Null THEN
               numPARENT_SEQNO             :=  Null;
            ELSE
                BEGIN
                    SELECT  /*+ RULE */
                            SEQNO
                    INTO    numPARENT_SEQNO
                    FROM    T_PJ_BUDGET_DETAIL 
                    WHERE   PJ_BUDGET_DETAIL_NO  = vc2PJBuDgetDetailNo
                    AND     OD_NO                = recT_OD.PARENT_OD_NO
                    ;
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
                        numP_BUDGET_STACK_TYP    :=  1;
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 40:SELECT PJ_BUDGET_DETAIL_NO'       ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE;
                END;
            END IF;
            
            -- �Č��\�Z�Ϗ㖾�ׂ̓o�^
            BEGIN
                INSERT INTO T_PJ_BUDGET_DETAIL(
                        PJ_BUDGET_DETAIL_NO         --  1 �Č��\�Z�Ϗ㖾�הԍ�
                       ,SEQNO                       --  2 SEQNO
                       ,OD_NO                       --  3 �I�[�_�f�}���h�ԍ�
                       ,PROJECT_CD                  --  4 �Č��ԍ�
                       ,ESTIMATE_NO                 --  5 ���ϔԍ�
                       ,DETAL_NO                    --  6 ���הԍ�
                       ,ODR_NO                      --  7 �󒍔ԍ�
                       ,ESTIMATE_TYPE               --  8 ��z�i�ڎ�
                       ,ODR_ACPT_DATE               --  9 �󒍓�
                       ,PLANT_CD                    -- 10 �H��R�[�h
                       ,JOB_ODR_CD                  -- 11 ����
                       ,JOB_ODR_DETAIL_NO           -- 12 ���Ԏ}��
                       ,JOB_ODR_CANCEL_NO           -- 13 ���Ԏ�������ԍ�
                       ,ROOT_ITEM_CD                -- 14 �ŏ�ʕi�ڔԍ�
                       ,PARENT_ITEM_CD              -- 15 �e�i�ڔԍ�
                       ,ITEM_CD                     -- 16 �i�ڔԍ�
                       ,ODR_STS_TYP                 -- 17 �I�[�_��ԋ敪
                       ,DM_STS_TYP                  -- 18 �f�}���h��ԋ敪
                       ,OD_TYP                      -- 19 �I�[�_�f�}���h�敪
                       ,DUE_DATE                    -- 20 �v���[��
                       ,ODR_START_DATE              -- 21 ��z�����
                       ,PRD_DUE_DATE                -- 22 �����[��
                       ,PRD_START_DATE              -- 23 ���������
                       ,DM_QTY                      -- 24 �f�}���h��
                       ,ODR_QTY                     -- 25 �I�[�_��
                       ,MRP_ODR_TYP                 -- 26 �i�ڎ�z�敪
                       ,OUTSIDE_TYP                 -- 27 ���v�ʓ��O��敪
                       ,PRODUCT_TYP                 -- 28 ���i�敪
                       ,UNIT_QTY_TYP                -- 29 �݌ɐ��P�ʋ敪
                       ,PS_UNIT_QTY                 -- 30 ���i�\���P�ʐ�
                       ,PS_UNIT_DENOMINATOR         -- 31 ���i�\���P�ʐ�����
                       ,PS_UNIT_NUMERATOR           -- 32 ���i�\���P�ʐ����q
                       ,TOTAL_RCV_QTY               -- 33 ���ɗ݌v��
                       ,TOTAL_ISSUE_QTY             -- 34 �o�ɗ݌v��
                       ,OD_LEVEL_NO                 -- 35 ���v�ʃ��x���ԍ�
                       ,PARENT_SEQNO                -- 36 �eSEQNO
                       ,ITEM_SPOIL                  -- 37 ���v�ʕi�ڎd����
                       ,PS_SPOIL                    -- 38 ���v�ʍ\���d����
                       ,CONS_TYP                    -- 39 �\���x���敪
                       ,NECESSARY_QTY               -- 40 �K�v���v��
                       ,PS_INPUT_RATIO              -- 41 �\���d�������W��
                       ,ITEM_INPUT_RATIO            -- 42 �i�ڎd�������W��
                       ,VEND_CD                     -- 43 �����R�[�h
                       ,ODR_COST_MATERIAL           -- 44 ��z�c  �ޗ���
                       ,ODR_COST_PROCESS            -- 45 ��z�c  ���H��
                       ,ODR_COST_OUTSOUCE           -- 46 ��z�c  �O����
                       ,ODR_COST_SERVICE            -- 47 ��z�c  �𖱔�
                       ,CMP_COST_MATERIAL           -- 48 ��������  �ޗ���
                       ,CMP_COST_PROCESS            -- 49 ��������  ���H��
                       ,CMP_COST_OUTSOUCE           -- 50 ��������  �O����
                       ,CMP_COST_SERVICE            -- 51 ��������  �𖱔�
                       ,EXP_COST_MATERIAL           -- 52 ��������  �ޗ���
                       ,EXP_COST_PROCESS            -- 53 ��������  ���H��
                       ,EXP_COST_OUTSOUCE           -- 54 ��������  �O����
                       ,EXP_COST_SERVICE            -- 55 ��������  �𖱔�
                       ,DMY_ITEM_FLG                -- 56 �[���i�ڃt���O
                       ,VOLUNT_SPL_FLG              -- 57 �����󋋕i�t���O
                       ,COST_UP_TYP                 -- 58 �����Ϗ�敪
                       ,ONEROUS_CONS_FLG            -- 59 �L���x���i�t���O
                       ,BUDGET_STACK_TYP            -- 60 �\�Z�Ϗグ�敪
                       ,ODR_RELEASE_FLG             -- 61 �I�[�_�����σt���O
                       ,ORG_OD_NO                   -- 62 ���I�[�_�f�}���h�ԍ�
                       ,ORG_JOB_ODR_CD              -- 63 ������
                       ,ORG_JOB_ODR_DETAIL_NO       -- 64 �����Ԏ}��
                       ,ORG_ODR_QTY                 -- 65 ���I�[�_��
                       ,RCV_ISSUE_GNR_TYP           -- 66 ���o�ɔ����敪
                       ,ALC_STOCK_FLG               -- 67 �����݌ɗL���t���O
                       ,ALC_STOCK_ODR_FLG           -- 68 �݌Ɉ������v�ʓW�J�敪
                       ,ALC_STOCK_TYP               -- 69 �����݌ɋ敪
                       ,ALC_STOCK_RATE              -- 70 �����݌ɋ旦
                       ,CREATED_DATE                -- 71 �쐬��
                       ,CREATED_BY                  -- 72 �쐬��
                       ,CREATED_PRG_NM              -- 73 �쐬�v���O������
                       ,UPDATED_DATE                -- 74 �X�V��
                       ,UPDATED_BY                  -- 75 �X�V��
                       ,UPDATED_PRG_NM              -- 76 �X�V�v���O������
                       ,MODIFY_COUNT                -- 77 �X�V��
                ) VALUES (
                        vc2PJBuDgetDetailNo                  --  1 �Č��\�Z�Ϗ㖾�הԍ�
                       ,numMaxSeqNO                          --  2 SEQNO
                       ,recT_OD.OD_NO                        --  3 �I�[�_�f�}���h�ԍ�
                       ,pvc2ProjectCd                        --  4 �Č��ԍ�
                       ,pvc2EstimateNo                       --  5 ���ϔԍ�
                       ,pvc2DetalNo                          --  6 ���הԍ�
                       ,pvc2OdrNO                            --  7 �󒍔ԍ�
                       ,recT_PJ_ODR_ALC.ESTIMATE_TYPE        --  8 ��z�i�ڎ�
                       ,recT_ODR.ODR_ACPT_DATE               --  9 �󒍓�
                       ,recT_JOB_ODR.PLANT_CD                -- 10 �H��R�[�h
                       ,recT_JOB_ODR.JOB_ODR_CD              -- 11 ����
                       ,recT_JOB_ODR.JOB_ODR_DETAIL_NO       -- 12 ���Ԏ}��
                       ,recT_JOB_ODR.JOB_ODR_CANCEL_NO       -- 13 ���Ԏ�������ԍ�
                       ,recT_JOB_ODR.ITEM_CD                 -- 14 �ŏ�ʕi�ڔԍ�
                       ,vc2PARENT_ITEM_CD                    -- 15 �e�i�ڔԍ�
                       ,recT_OD.ITEM_CD                      -- 16 �i�ڔԍ�
                       ,recT_OD.ODR_STS_TYP                  -- 17 �I�[�_��ԋ敪
                       ,recT_OD.DM_STS_TYP                   -- 18 �f�}���h��ԋ敪
                       ,recT_OD.OD_TYP                       -- 19 �I�[�_�f�}���h�敪
                       ,recT_OD.DUE_DATE                     -- 20 �v���[��
                       ,recT_OD.ODR_START_DATE               -- 21 ��z�����
                       ,recT_OD.PRD_DUE_DATE                 -- 22 �����[��
                       ,recT_OD.PRD_START_DATE               -- 23 ���������
                       ,recT_OD.DM_QTY                       -- 24 �f�}���h��
                       ,recT_OD.ODR_QTY                      -- 25 �I�[�_��
                       ,recT_OD.MRP_ODR_TYP                  -- 26 �i�ڎ�z�敪
                       ,recT_OD.OUTSIDE_TYP                  -- 27 ���v�ʓ��O��敪
                       ,recT_OD.PRODUCT_TYP                  -- 28 ���i�敪
                       ,recT_OD.UNIT_QTY_TYP                 -- 29 �݌ɐ��P�ʋ敪
                       ,recT_OD.PS_UNIT_QTY                  -- 30 ���i�\���P�ʐ�
                       ,recT_OD.PS_UNIT_DENOMINATOR          -- 31 ���i�\���P�ʐ�����
                       ,recT_OD.PS_UNIT_NUMERATOR            -- 32 ���i�\���P�ʐ����q
                       ,recT_OD.TOTAL_RCV_QTY                -- 33 ���ɗ݌v��
                       ,recT_OD.TOTAL_ISSUE_QTY              -- 34 �o�ɗ݌v��
                       ,recT_OD.OD_LEVEL_NO                  -- 35 ���v�ʃ��x���ԍ�
                       ,numPARENT_SEQNO                      -- 36 �eSEQNO
                       ,recT_OD.ITEM_SPOIL                   -- 37 ���v�ʕi�ڎd����
                       ,recT_OD.PS_SPOIL                     -- 38 ���v�ʍ\���d����
                       ,recT_OD.CONS_TYP                     -- 39 �\���x���敪
                       ,DECODE(recT_OD.OD_TYP,1,recT_OD.ODR_QTY,2,recT_OD.ODR_QTY,3,recT_OD.DM_QTY,4,recT_OD.ODR_QTY)    -- 40 �K�v���v��
                       ,numPS_INPUT_RATIO                    -- 41 �\���d�������W��
                       ,numITEM_INPUT_RATIO                  -- 42 �i�ڎd�������W��
                       ,null                                 -- 43 �����R�[�h
                       ,0                                    -- 44 ��z�c  �ޗ���
                       ,0                                    -- 45 ��z�c  ���H��
                       ,0                                    -- 46 ��z�c  �O����
                       ,0                                    -- 47 ��z�c  �𖱔�
                       ,0                                    -- 48 ��������  �ޗ���
                       ,0                                    -- 49 ��������  ���H��
                       ,0                                    -- 50 ��������  �O����
                       ,0                                    -- 51 ��������  �𖱔�
                       ,0                                    -- 52 ��������  �ޗ���
                       ,0                                    -- 53 ��������  ���H��
                       ,0                                    -- 54 ��������  �O����
                       ,0                                    -- 55 ��������  �𖱔�
                       ,numDMY_ITEM_FLG                      -- 56 �[���i�ڃt���O
                       ,numVOLUNT_SPL_FLG                    -- 57 �����󋋕i�t���O
                       ,numCOST_UP_TYP                       -- 58 �����Ϗ�敪
                       ,0                                    -- 59 �L���x���i�t���O
                       ,1                                    -- 60 �\�Z�Ϗグ�敪
                       ,recT_OD.ODR_RELEASE_FLG              -- 61 �I�[�_�����σt���O
                       ,null                                 -- 62 ���I�[�_�f�}���h�ԍ�
                       ,null                                 -- 63 ������
                       ,0                                    -- 64 �����Ԏ}��
                       ,0                                    -- 65 ���I�[�_��
                       ,null                                 -- 66 ���o�ɔ����敪
                       ,numALC_STOCK_FLG                     -- 67 �����݌ɗL���t���O
                       ,0                                    -- 68 �݌Ɉ������v�ʓW�J�敪
                       ,0                                    -- 69 �����݌ɋ敪
                       ,1                                    -- 70 �����݌ɋ旦
                       ,SYSDATE                              -- 71 �쐬��
                       ,pvc2UserId                           -- 72 �쐬��
                       ,pvc2BusinessName                     -- 73 �쐬�v���O������
                       ,SYSDATE                              -- 74 �X�V��
                       ,pvc2UserId                           -- 75 �X�V��
                       ,pvc2BusinessName                     -- 76 �X�V�v���O������
                       ,0);                                  -- 77 �X�V��
            EXCEPTION
                WHEN OTHERS THEN
                    -- �Č��\�Z�Ϗ㖾�׎��s
                    vc2Comment := SUBSTR(' 40:INSERT UT_PURCH_OPER_BUDGET'      ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1, 256);
                    RAISE excOTHER_ERR;
            END;
            
        END LOOP;
                
    /* ���ς��𖱂̎� */
    WHEN recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   2     THEN

        -- SEQNO �J�E���g�A�b�v
        numMaxSeqNO    :=  numMaxSeqNO +   1;
        numErrorSEQNO  :=  numMaxSeqNO;
        
        -- �Č��\�Z�Ϗ�p�I�[�_�f�}���h�ԍ����̔�
        blnRet := FNCGETNEWPJODNO(UTL_FileHandle
                                 ,pvc2LogMode
                                 ,pvc2OutputMode
                                 ,pvc2UserId
                                 ,pvc2BusinessName
                                 ,pvc2PlantCd
                                 ,vc2PjOdNo);
                                 
        -- �Č��\�Z�Ϗ㖾�ׂ̓o�^
        BEGIN
            INSERT INTO T_PJ_BUDGET_DETAIL(
                    PJ_BUDGET_DETAIL_NO         --  1 �Č��\�Z�Ϗ㖾�הԍ�
                   ,SEQNO                       --  2 SEQNO
                   ,OD_NO                       --  3 �I�[�_�f�}���h�ԍ�
                   ,PROJECT_CD                  --  4 �Č��ԍ�
                   ,ESTIMATE_NO                 --  5 ���ϔԍ�
                   ,DETAL_NO                    --  6 ���הԍ�
                   ,ODR_NO                      --  7 �󒍔ԍ�
                   ,ESTIMATE_TYPE               --  8 ��z�i�ڎ�
                   ,ODR_ACPT_DATE               --  9 �󒍓�
                   ,PLANT_CD                    -- 10 �H��R�[�h
                   ,JOB_ODR_CD                  -- 11 ����
                   ,JOB_ODR_DETAIL_NO           -- 12 ���Ԏ}��
                   ,JOB_ODR_CANCEL_NO           -- 13 ���Ԏ�������ԍ�
                   ,ROOT_ITEM_CD                -- 14 �ŏ�ʕi�ڔԍ�
                   ,PARENT_ITEM_CD              -- 15 �e�i�ڔԍ�
                   ,ITEM_CD                     -- 16 �i�ڔԍ�
                   ,ODR_STS_TYP                 -- 17 �I�[�_��ԋ敪
                   ,DM_STS_TYP                  -- 18 �f�}���h��ԋ敪
                   ,OD_TYP                      -- 19 �I�[�_�f�}���h�敪
                   ,DUE_DATE                    -- 20 �v���[��
                   ,ODR_START_DATE              -- 21 ��z�����
                   ,PRD_DUE_DATE                -- 22 �����[��
                   ,PRD_START_DATE              -- 23 ���������
                   ,DM_QTY                      -- 24 �f�}���h��
                   ,ODR_QTY                     -- 25 �I�[�_��
                   ,MRP_ODR_TYP                 -- 26 �i�ڎ�z�敪
                   ,OUTSIDE_TYP                 -- 27 ���v�ʓ��O��敪
                   ,PRODUCT_TYP                 -- 28 ���i�敪
                   ,UNIT_QTY_TYP                -- 29 �݌ɐ��P�ʋ敪
                   ,PS_UNIT_QTY                 -- 30 ���i�\���P�ʐ�
                   ,PS_UNIT_DENOMINATOR         -- 31 ���i�\���P�ʐ�����
                   ,PS_UNIT_NUMERATOR           -- 32 ���i�\���P�ʐ����q
                   ,TOTAL_RCV_QTY               -- 33 ���ɗ݌v��
                   ,TOTAL_ISSUE_QTY             -- 34 �o�ɗ݌v��
                   ,OD_LEVEL_NO                 -- 35 ���v�ʃ��x���ԍ�
                   ,PARENT_SEQNO                -- 36 �eSEQNO
                   ,ITEM_SPOIL                  -- 37 ���v�ʕi�ڎd����
                   ,PS_SPOIL                    -- 38 ���v�ʍ\���d����
                   ,CONS_TYP                    -- 39 �\���x���敪
                   ,NECESSARY_QTY               -- 40 �K�v���v��
                   ,PS_INPUT_RATIO              -- 41 �\���d�������W��
                   ,ITEM_INPUT_RATIO            -- 42 �i�ڎd�������W��
                   ,VEND_CD                     -- 43 �����R�[�h
                   ,ODR_COST_MATERIAL           -- 44 ��z�c  �ޗ���
                   ,ODR_COST_PROCESS            -- 45 ��z�c  ���H��
                   ,ODR_COST_OUTSOUCE           -- 46 ��z�c  �O����
                   ,ODR_COST_SERVICE            -- 47 ��z�c  �𖱔�
                   ,CMP_COST_MATERIAL           -- 48 ��������  �ޗ���
                   ,CMP_COST_PROCESS            -- 49 ��������  ���H��
                   ,CMP_COST_OUTSOUCE           -- 50 ��������  �O����
                   ,CMP_COST_SERVICE            -- 51 ��������  �𖱔�
                   ,EXP_COST_MATERIAL           -- 52 ��������  �ޗ���
                   ,EXP_COST_PROCESS            -- 53 ��������  ���H��
                   ,EXP_COST_OUTSOUCE           -- 54 ��������  �O����
                   ,EXP_COST_SERVICE            -- 55 ��������  �𖱔�
                   ,DMY_ITEM_FLG                -- 56 �[���i�ڃt���O
                   ,VOLUNT_SPL_FLG              -- 57 �����󋋕i�t���O
                   ,COST_UP_TYP                 -- 58 �����Ϗ�敪
                   ,ONEROUS_CONS_FLG            -- 59 �L���x���i�t���O
                   ,BUDGET_STACK_TYP            -- 60 �\�Z�Ϗグ�敪
                   ,ODR_RELEASE_FLG             -- 61 �I�[�_�����σt���O
                   ,ORG_OD_NO                   -- 62 ���I�[�_�f�}���h�ԍ�
                   ,ORG_JOB_ODR_CD              -- 63 ������
                   ,ORG_JOB_ODR_DETAIL_NO       -- 64 �����Ԏ}��
                   ,ORG_ODR_QTY                 -- 65 ���I�[�_��
                   ,RCV_ISSUE_GNR_TYP           -- 66 ���o�ɔ����敪
                   ,ALC_STOCK_FLG               -- 67 �����݌ɗL���t���O
                   ,ALC_STOCK_ODR_FLG           -- 68 �݌Ɉ������v�ʓW�J�敪
                   ,ALC_STOCK_TYP               -- 69 �����݌ɋ敪
                   ,ALC_STOCK_RATE              -- 70 �����݌ɋ旦
                   ,CREATED_DATE                -- 71 �쐬��
                   ,CREATED_BY                  -- 72 �쐬��
                   ,CREATED_PRG_NM              -- 73 �쐬�v���O������
                   ,UPDATED_DATE                -- 74 �X�V��
                   ,UPDATED_BY                  -- 75 �X�V��
                   ,UPDATED_PRG_NM              -- 76 �X�V�v���O������
                   ,MODIFY_COUNT                -- 77 �X�V��
            ) VALUES (
                    vc2PJBuDgetDetailNo                   --  1 �Č��\�Z�Ϗ㖾�הԍ�
                   ,numMaxSeqNO                           --  2 SEQNO
                   ,vc2PjOdNo                             --  3 �I�[�_�f�}���h�ԍ�
                   ,pvc2ProjectCd                         --  4 �Č��ԍ�
                   ,pvc2EstimateNo                        --  5 ���ϔԍ�
                   ,pvc2DetalNo                           --  6 ���הԍ�
                   ,pvc2OdrNO                             --  7 �󒍔ԍ�
                   ,recT_PJ_ODR_ALC.ESTIMATE_TYPE         --  8 ��z�i�ڎ�
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        --  9 �󒍓�
                   ,pvc2PlantCd                           -- 10 �H��R�[�h
                   ,null                                  -- 11 ����
                   ,null                                  -- 12 ���Ԏ}��
                   ,null                                  -- 13 ���Ԏ�������ԍ�
                   ,null                                  -- 14 �ŏ�ʕi�ڔԍ�
                   ,null                                  -- 15 �e�i�ڔԍ�
                   ,recT_ODR_UNSTOCK.ITEM_CD              -- 16 �i�ڔԍ�
                   ,0                                     -- 17 �I�[�_��ԋ敪
                   ,0                                     -- 18 �f�}���h��ԋ敪
                   ,6                                     -- 19 �I�[�_�f�}���h�敪
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        -- 20 �v���[��
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        -- 21 ��z�����
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        -- 22 �����[��
                   ,recT_ODR_UNSTOCK.ODR_ACPT_DATE        -- 23 ���������
                   ,0                                     -- 24 �f�}���h��
                   ,0                                     -- 25 �I�[�_��
                   ,NVL(recT_ODR_UNSTOCK.MRP_ODR_TYP,4)   -- 26 �i�ڎ�z�敪
                   ,NVL(recT_ODR_UNSTOCK.OUTSIDE_TYP,1)   -- 27 ���v�ʓ��O��敪
                   ,NVL(recT_ODR_UNSTOCK.PRODUCT_TYP,1)   -- 28 ���i�敪
                   ,NVL(recT_ODR_UNSTOCK.UNIT_QTY_TYP,1)  -- 29 �݌ɐ��P�ʋ敪
                   ,0                                     -- 30 ���i�\���P�ʐ�
                   ,0                                     -- 31 ���i�\���P�ʐ�����
                   ,0                                     -- 32 ���i�\���P�ʐ����q
                   ,0                                     -- 33 ���ɗ݌v��
                   ,0                                     -- 34 �o�ɗ݌v��
                   ,0                                     -- 35 ���v�ʃ��x���ԍ�
                   ,null                                  -- 36 �eSEQNO
                   ,NVL(recT_ODR_UNSTOCK.ITEM_SPOIL,0)    -- 37 ���v�ʕi�ڎd����
                   ,0                                     -- 38 ���v�ʍ\���d����
                   ,0                                     -- 39 �\���x���敪
                   ,recT_ODR_UNSTOCK.ODR_QTY              -- 40 �K�v���v��
                   ,0                                     -- 41 �\���d�������W��
                   ,0                                     -- 42 �i�ڎd�������W��
                   ,null                                  -- 43 �����R�[�h
                   ,0                                     -- 44 ��z�c  �ޗ���
                   ,0                                     -- 45 ��z�c  ���H��
                   ,0                                     -- 46 ��z�c  �O����
                   ,0                                     -- 47 ��z�c  �𖱔�
                   ,0                                     -- 48 ��������  �ޗ���
                   ,0                                     -- 49 ��������  ���H��
                   ,0                                     -- 50 ��������  �O����
                   ,0                                     -- 51 ��������  �𖱔�
                   ,0                                     -- 52 ��������  �ޗ���
                   ,0                                     -- 53 ��������  ���H��
                   ,0                                     -- 54 ��������  �O����
                   ,0                                     -- 55 ��������  �𖱔�
                   ,0                                     -- 56 �[���i�ڃt���O
                   ,0                                     -- 57 �����󋋕i�t���O
                   ,1                                     -- 58 �����Ϗ�敪
                   ,0                                     -- 59 �L���x���i�t���O
                   ,1                                     -- 60 �\�Z�Ϗグ�敪
                   ,1                                     -- 61 �I�[�_�����σt���O
                   ,null                                  -- 62 ���I�[�_�f�}���h�ԍ�
                   ,null                                  -- 63 ������
                   ,0                                     -- 64 �����Ԏ}��
                   ,0                                     -- 65 ���I�[�_��
                   ,null                                  -- 66 ���o�ɔ����敪
                   ,0                                     -- 67 �����݌ɗL���t���O
                   ,0                                     -- 68 �݌Ɉ������v�ʓW�J�敪
                   ,0                                     -- 69 �����݌ɋ敪
                   ,1                                     -- 70 �����݌ɋ旦
                   ,SYSDATE                               -- 71 �쐬��
                   ,pvc2UserId                            -- 72 �쐬��
                   ,pvc2BusinessName                      -- 73 �쐬�v���O������
                   ,SYSDATE                               -- 74 �X�V��
                   ,pvc2UserId                            -- 75 �X�V��
                   ,pvc2BusinessName                      -- 76 �X�V�v���O������
                   ,0);                                   -- 77 �X�V��
        EXCEPTION
            WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE('�� �Č��\�Z�Ϗ㖾�׍쐬-ERROR---'||vc2PjOdNo);
                -- �Č��\�Z�Ϗ㖾�׎��s
                vc2Comment := SUBSTR(' 40:INSERT T_PJ_BUDGET_DETAIL'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1, 256);
                RAISE excOTHER_ERR;
        END;
    END CASE;

    /* --- �A���Ԃɑ΂���]��݌ɐU�ւ̏����擾 --- */
    
    /* ���ςɕR�t���i�ڂ����ԕi�̎� */
    IF  (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (1 ,2))  THEN

        -- �ۊǋ�ʓ��o�ɂ̃J�[�\��OPEN
        BEGIN
           OPEN curT_RCV_ISSUE(recT_JOB_ODR.PLANT_CD,recT_JOB_ODR.JOB_ODR_CD,recT_JOB_ODR.JOB_ODR_DETAIL_NO);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 40:OPEN curT_RCV_ISSUE'   ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;

    	LOOP
            -- �ۊǋ�ʓ��o�ɂ̃J�[�\��FETCH
            BEGIN
                FETCH curT_RCV_ISSUE  INTO recT_RCV_ISSUE;
            EXCEPTION
                WHEN OTHERS THEN
                    -- �J�[�\��FETCH���s
                    vc2Comment  := SUBSTR(' 02:FETCH curT_RCV_ISSUE'     ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            -- �ۊǋ�ʓ��o�ɃJ�[�\��END
            EXIT WHEN  curT_RCV_ISSUE%NOTFOUND;

            -- �Č��\�Z�Ϗ�p�I�[�_�f�}���h�ԍ����̔�
            blnRet := FNCGETNEWPJODNO(UTL_FileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd
                                     ,vc2PjOdNo);
            -- SEQNO �J�E���g�A�b�v
            numMaxSeqNO    :=  numMaxSeqNO +   1;
            numErrorSEQNO  :=  numMaxSeqNO;

            /*  �[���i�ڃt���O  */
            IF recT_RCV_ISSUE.MRP_ODR_TYP = 8 THEN
                numDMY_ITEM_FLG      := 1;
            ELSE
                numDMY_ITEM_FLG      := 0;
            END IF;

            /*  �����󋋕i�t���O  */
            IF recT_RCV_ISSUE.SPL_ITEM_TYP = 2 THEN
                numVOLUNT_SPL_FLG      := 1;
            ELSE
                numVOLUNT_SPL_FLG      := 0;
            END IF;

            /*  �i�ڎd�������W��  */
            IF recT_RCV_ISSUE.MRP_ODR_TYP = 8 THEN
               numITEM_INPUT_RATIO         := CEIL(((1+ recT_RCV_ISSUE.ITEM_CD /100)) * 10000) / 10000 ;
            ELSE
               numITEM_INPUT_RATIO         := 1.0;
            END IF;
        
            -- �Č��\�Z�Ϗ㖾�ׂ̓o�^
            BEGIN
                INSERT INTO T_PJ_BUDGET_DETAIL(
                        PJ_BUDGET_DETAIL_NO         --  1 �Č��\�Z�Ϗ㖾�הԍ�
                       ,SEQNO                       --  2 SEQNO
                       ,OD_NO                       --  3 �I�[�_�f�}���h�ԍ�
                       ,PROJECT_CD                  --  4 �Č��ԍ�
                       ,ESTIMATE_NO                 --  5 ���ϔԍ�
                       ,DETAL_NO                    --  6 ���הԍ�
                       ,ODR_NO                      --  7 �󒍔ԍ�
                       ,ESTIMATE_TYPE               --  8 ��z�i�ڎ�
                       ,ODR_ACPT_DATE               --  9 �󒍓�
                       ,PLANT_CD                    -- 10 �H��R�[�h
                       ,JOB_ODR_CD                  -- 11 ����
                       ,JOB_ODR_DETAIL_NO           -- 12 ���Ԏ}��
                       ,JOB_ODR_CANCEL_NO           -- 13 ���Ԏ�������ԍ�
                       ,ROOT_ITEM_CD                -- 14 �ŏ�ʕi�ڔԍ�
                       ,PARENT_ITEM_CD              -- 15 �e�i�ڔԍ�
                       ,ITEM_CD                     -- 16 �i�ڔԍ�
                       ,ODR_STS_TYP                 -- 17 �I�[�_��ԋ敪
                       ,DM_STS_TYP                  -- 18 �f�}���h��ԋ敪
                       ,OD_TYP                      -- 19 �I�[�_�f�}���h�敪
                       ,DUE_DATE                    -- 20 �v���[��
                       ,ODR_START_DATE              -- 21 ��z�����
                       ,PRD_DUE_DATE                -- 22 �����[��
                       ,PRD_START_DATE              -- 23 ���������
                       ,DM_QTY                      -- 24 �f�}���h��
                       ,ODR_QTY                     -- 25 �I�[�_��
                       ,MRP_ODR_TYP                 -- 26 �i�ڎ�z�敪
                       ,OUTSIDE_TYP                 -- 27 ���v�ʓ��O��敪
                       ,PRODUCT_TYP                 -- 28 ���i�敪
                       ,UNIT_QTY_TYP                -- 29 �݌ɐ��P�ʋ敪
                       ,PS_UNIT_QTY                 -- 30 ���i�\���P�ʐ�
                       ,PS_UNIT_DENOMINATOR         -- 31 ���i�\���P�ʐ�����
                       ,PS_UNIT_NUMERATOR           -- 32 ���i�\���P�ʐ����q
                       ,TOTAL_RCV_QTY               -- 33 ���ɗ݌v��
                       ,TOTAL_ISSUE_QTY             -- 34 �o�ɗ݌v��
                       ,OD_LEVEL_NO                 -- 35 ���v�ʃ��x���ԍ�
                       ,PARENT_SEQNO                -- 36 �eSEQNO
                       ,ITEM_SPOIL                  -- 37 ���v�ʕi�ڎd����
                       ,PS_SPOIL                    -- 38 ���v�ʍ\���d����
                       ,CONS_TYP                    -- 39 �\���x���敪
                       ,NECESSARY_QTY               -- 40 �K�v���v��
                       ,PS_INPUT_RATIO              -- 41 �\���d�������W��
                       ,ITEM_INPUT_RATIO            -- 42 �i�ڎd�������W��
                       ,VEND_CD                     -- 43 �����R�[�h
                       ,ODR_COST_MATERIAL           -- 44 ��z�c  �ޗ���
                       ,ODR_COST_PROCESS            -- 45 ��z�c  ���H��
                       ,ODR_COST_OUTSOUCE           -- 46 ��z�c  �O����
                       ,ODR_COST_SERVICE            -- 47 ��z�c  �𖱔�
                       ,CMP_COST_MATERIAL           -- 48 ��������  �ޗ���
                       ,CMP_COST_PROCESS            -- 49 ��������  ���H��
                       ,CMP_COST_OUTSOUCE           -- 50 ��������  �O����
                       ,CMP_COST_SERVICE            -- 51 ��������  �𖱔�
                       ,EXP_COST_MATERIAL           -- 52 ��������  �ޗ���
                       ,EXP_COST_PROCESS            -- 53 ��������  ���H��
                       ,EXP_COST_OUTSOUCE           -- 54 ��������  �O����
                       ,EXP_COST_SERVICE            -- 55 ��������  �𖱔�
                       ,DMY_ITEM_FLG                -- 56 �[���i�ڃt���O
                       ,VOLUNT_SPL_FLG              -- 57 �����󋋕i�t���O
                       ,COST_UP_TYP                 -- 58 �����Ϗ�敪
                       ,ONEROUS_CONS_FLG            -- 59 �L���x���i�t���O
                       ,BUDGET_STACK_TYP            -- 60 �\�Z�Ϗグ�敪
                       ,ODR_RELEASE_FLG             -- 61 �I�[�_�����σt���O
                       ,ORG_OD_NO                   -- 62 ���I�[�_�f�}���h�ԍ�
                       ,ORG_JOB_ODR_CD              -- 63 ������
                       ,ORG_JOB_ODR_DETAIL_NO       -- 64 �����Ԏ}��
                       ,ORG_ODR_QTY                 -- 65 ���I�[�_��
                       ,RCV_ISSUE_GNR_TYP           -- 66 ���o�ɔ����敪
                       ,ALC_STOCK_FLG               -- 67 �����݌ɗL���t���O
                       ,ALC_STOCK_ODR_FLG           -- 68 �݌Ɉ������v�ʓW�J�敪
                       ,ALC_STOCK_TYP               -- 69 �����݌ɋ敪
                       ,ALC_STOCK_RATE              -- 70 �����݌ɋ旦
                       ,CREATED_DATE                -- 71 �쐬��
                       ,CREATED_BY                  -- 72 �쐬��
                       ,CREATED_PRG_NM              -- 73 �쐬�v���O������
                       ,UPDATED_DATE                -- 74 �X�V��
                       ,UPDATED_BY                  -- 75 �X�V��
                       ,UPDATED_PRG_NM              -- 76 �X�V�v���O������
                       ,MODIFY_COUNT                -- 77 �X�V��
                ) VALUES (
                        vc2PJBuDgetDetailNo                  --  1 �Č��\�Z�Ϗ㖾�הԍ�
                       ,numMaxSeqNO                          --  2 SEQNO
                       ,vc2PjOdNo                            --  3 �I�[�_�f�}���h�ԍ�
                       ,pvc2ProjectCd                        --  4 �Č��ԍ�
                       ,pvc2EstimateNo                       --  5 ���ϔԍ�
                       ,pvc2DetalNo                          --  6 ���הԍ�
                       ,pvc2OdrNO                            --  7 �󒍔ԍ�
                       ,recT_PJ_ODR_ALC.ESTIMATE_TYPE        --  8 ��z�i�ڎ�
                       ,recT_ODR.ODR_ACPT_DATE               --  9 �󒍓�
                       ,recT_JOB_ODR.PLANT_CD                -- 10 �H��R�[�h
                       ,recT_JOB_ODR.JOB_ODR_CD              -- 11 ����
                       ,recT_JOB_ODR.JOB_ODR_DETAIL_NO       -- 12 ���Ԏ}��
                       ,recT_JOB_ODR.JOB_ODR_CANCEL_NO       -- 13 ���Ԏ�������ԍ�
                       ,recT_JOB_ODR.ITEM_CD                 -- 14 �ŏ�ʕi�ڔԍ�
                       ,null                                 -- 15 �e�i�ڔԍ�
                       ,recT_RCV_ISSUE.ITEM_CD               -- 16 �i�ڔԍ�
                       ,0                                    -- 17 �I�[�_��ԋ敪
                       ,0                                    -- 18 �f�}���h��ԋ敪
                       ,7                                    -- 19 �I�[�_�f�}���h�敪
                       ,recT_RCV_ISSUE.RCV_ISSUE_DATE        -- 20 �v���[��
                       ,recT_RCV_ISSUE.RCV_ISSUE_DATE        -- 21 ��z�����
                       ,recT_RCV_ISSUE.RCV_ISSUE_DATE        -- 22 �����[��
                       ,recT_RCV_ISSUE.RCV_ISSUE_DATE        -- 23 ���������
                       ,recT_RCV_ISSUE.RCV_ISSUE_QTY         -- 24 �f�}���h��
                       ,0                                    -- 25 �I�[�_��
                       ,recT_RCV_ISSUE.MRP_ODR_TYP           -- 26 �i�ڎ�z�敪
                       ,recT_RCV_ISSUE.OUTSIDE_TYP           -- 27 ���v�ʓ��O��敪
                       ,recT_RCV_ISSUE.PRODUCT_TYP           -- 28 ���i�敪
                       ,recT_RCV_ISSUE.UNIT_QTY_TYP          -- 29 �݌ɐ��P�ʋ敪
                       ,0                                    -- 30 ���i�\���P�ʐ�
                       ,0                                    -- 31 ���i�\���P�ʐ�����
                       ,0                                    -- 32 ���i�\���P�ʐ����q
                       ,0                                    -- 33 ���ɗ݌v��
                       ,0                                    -- 34 �o�ɗ݌v��
                       ,0                                    -- 35 ���v�ʃ��x���ԍ�
                       ,null                                 -- 36 �eSEQNO
                       ,recT_RCV_ISSUE.ITEM_SPOIL            -- 37 ���v�ʕi�ڎd����
                       ,0                                    -- 38 ���v�ʍ\���d����
                       ,0                                    -- 39 �\���x���敪
                       ,recT_RCV_ISSUE.RCV_ISSUE_QTY         -- 40 �K�v���v��
                       ,0                                    -- 41 �\���d�������W��
                       ,numITEM_INPUT_RATIO                  -- 42 �i�ڎd�������W��
                       ,null                                 -- 43 �����R�[�h
                       ,0                                    -- 44 ��z�c  �ޗ���
                       ,0                                    -- 45 ��z�c  ���H��
                       ,0                                    -- 46 ��z�c  �O����
                       ,0                                    -- 47 ��z�c  �𖱔�
                       ,0                                    -- 48 ��������  �ޗ���
                       ,0                                    -- 49 ��������  ���H��
                       ,0                                    -- 50 ��������  �O����
                       ,0                                    -- 51 ��������  �𖱔�
                       ,0                                    -- 52 ��������  �ޗ���
                       ,0                                    -- 53 ��������  ���H��
                       ,0                                    -- 54 ��������  �O����
                       ,0                                    -- 55 ��������  �𖱔�
                       ,numDMY_ITEM_FLG                      -- 56 �[���i�ڃt���O
                       ,numVOLUNT_SPL_FLG                    -- 57 �����󋋕i�t���O
                       ,1                                    -- 58 �����Ϗ�敪
                       ,0                                    -- 59 �L���x���i�t���O
                       ,1                                    -- 60 �\�Z�Ϗグ�敪
                       ,recT_OD.ODR_RELEASE_FLG              -- 61 �I�[�_�����σt���O
                       ,null                                 -- 62 ���I�[�_�f�}���h�ԍ�
                       ,null                                 -- 63 ������
                       ,0                                    -- 64 �����Ԏ}��
                       ,0                                    -- 65 ���I�[�_��
                       ,recT_RCV_ISSUE.RCV_ISSUE_GNR_TYP     -- 66 ���o�ɔ����敪
                       ,1                                    -- 67 �����݌ɗL���t���O
                       ,0                                    -- 68 �݌Ɉ������v�ʓW�J�敪
                       ,0                                    -- 69 �����݌ɋ敪
                       ,1                                    -- 70 �����݌ɋ旦
                       ,SYSDATE                              -- 71 �쐬��
                       ,pvc2UserId                           -- 72 �쐬��
                       ,pvc2BusinessName                     -- 73 �쐬�v���O������
                       ,SYSDATE                              -- 74 �X�V��
                       ,pvc2UserId                           -- 75 �X�V��
                       ,pvc2BusinessName                     -- 76 �X�V�v���O������
                       ,0);                                  -- 77 �X�V��
            EXCEPTION
                WHEN OTHERS THEN
                    -- �Č��\�Z�Ϗ㖾�׎��s
                    vc2Comment := SUBSTR(' 40:INSERT UT_PURCH_OPER_BUDGET'       ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1, 256);
                    RAISE excOTHER_ERR;
            END;
            
        END LOOP;
        -- �ۊǋ�ʓ��o�ɂ̃J�[�\��CLOSE
        CLOSE curT_RCV_ISSUE;
    END IF;

    COMMIT;
/*------------------------------------------------------------
'  �݌Ɉ����W�J����
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    LOOP
    
        -- �Č��\�Z�Ϗ㖾�׃J�[�\��OPEN
        BEGIN
            OPEN curT_PJ_BUDGET_DETAIL(vc2PJBuDgetDetailNo);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 05:OPEN curT_PJ_BUDGET_DETAIL'        ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;

        -- �Č��\�Z�Ϗ㖾�׃J�[�\��FETCH
        BEGIN
            FETCH curT_PJ_BUDGET_DETAIL INTO recT_PJ_BUDGET_DETAIL;
        EXCEPTION
            WHEN OTHERS THEN
                -- �J�[�\��FETCH���s
                vc2Comment  := SUBSTR(' 05:FETCH curT_PJ_BUDGET_DETAIL'      ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                      1,256);
                RAISE;
        END;
        -- �Č��\�Z�Ϗ㖾�׃J�[�\��
        EXIT WHEN  curT_PJ_BUDGET_DETAIL%NOTFOUND;
        
        
        LOOP
            numErrorSEQNO  :=  recT_PJ_BUDGET_DETAIL.SEQNO;
            /* --- l�E�ʏ�i���v��O�̃f�[�^�����f����B --- */
            IF  recT_PJ_BUDGET_DETAIL.OD_TYP    =   7   THEN -- �I�[�_�f�}���h�敪7�F���o��

                /* �Č��\�Z�]��݌ɕi�쐬���� */
                blnRet := FNCPJSUBPLUSSTOCKMAKE(UTL_FileHandle
                                               ,pvc2LogMode
                                               ,pvc2OutputMode
                                               ,pvc2UserId
                                               ,pvc2BusinessName
                                               ,pvc2PlantCd
                                               ,recT_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO
                                               ,recT_PJ_BUDGET_DETAIL.SEQNO
                                               ,recT_PJ_BUDGET_DETAIL.NECESSARY_QTY
                                               ,vc2ErrorCD
                                               );
                IF blnRet = FALSE THEN
                   RAISE excGetNewPjOdNo;
                END IF;
            ELSE
                -- [���Ԉ���]�J�[�\��OPEN
                BEGIN
                    OPEN curT_JOB_ODR_ALC(recT_PJ_BUDGET_DETAIL.OD_NO);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 05:OPEN curT_JOB_ODR_ALC'    ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                        RAISE;
                END;
                
                LOOP
                    -- ���i�����J�[�\��FETCH
                    BEGIN
                        FETCH curT_JOB_ODR_ALC  INTO recT_JOB_ODR_ALC;
                    EXCEPTION
                        WHEN OTHERS THEN
                            -- �J�[�\��FETCH���s
                            vc2Comment  := SUBSTR(' 05:FETCH curcT_JOB_ODR_ALC'  ||
                                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                  1,256);
                            RAISE;
                    END;
                   
                    -- ���Ԉ����J�[�\��END
                    EXIT WHEN  curT_JOB_ODR_ALC%NOTFOUND;
    
                    IF  recT_JOB_ODR_ALC.ALC_STOCK_TYP     =   1    THEN

                        -- �����݌ɋ敪�h��1:�i�ڍ݌Ɂj�̎�
                        
                        /* �Č��\�Z�]��݌ɕi�쐬���� */
                        blnRet := FncPjSubplusStockMake(UTL_FileHandle
                                                       ,pvc2LogMode
                                                       ,pvc2OutputMode
                                                       ,pvc2UserId
                                                       ,pvc2BusinessName
                                                       ,pvc2PlantCd
                                                       ,recT_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO
                                                       ,recT_PJ_BUDGET_DETAIL.SEQNO
                                                       ,recT_JOB_ODR_ALC.ALCD_QTY
                                                       ,vc2ErrorCD
                                                       );
                        IF blnRet = FALSE THEN
                           RAISE excGetNewPjOdNo;
                        END IF;
                    ELSE
                        -- �����݌ɋ敪�h��2:���ԁj�̎�
                        /* �Č��\�Z���Ԉ����i�쐬���� */
                        blnRet :=FncPjJobOdrAlcMake(UTL_FileHandle
                                                    ,pvc2LogMode
                                                    ,pvc2OutputMode
                                                    ,pvc2UserId
                                                    ,pvc2BusinessName
                                                    ,pvc2PlantCd
                                                    ,recT_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO
                                                    ,recT_PJ_BUDGET_DETAIL.SEQNO
                                                    ,recT_JOB_ODR_ALC.JOB_ODR_CD
                                                    ,recT_JOB_ODR_ALC.JOB_ODR_DETAIL_NO
                                                    ,recT_JOB_ODR_ALC.ALCD_QTY
                                                    ,vc2ErrorCD
                                                    );
                        IF blnRet = FALSE THEN
                           RAISE excGetNewPjOdNo;
                        END IF;
                    END IF;
                END LOOP;
                -- [���Ԉ���]�J�[�\��CLOSE
                CLOSE curT_JOB_ODR_ALC;
                
            END IF;
            
            -- �d����N�ԓ������(�݌Ɉ������v�ʓW�J�敪)�̍X�V
            BEGIN
                UPDATE T_PJ_BUDGET_DETAIL
                SET ALC_STOCK_ODR_FLG  = 1                    -- 1�F�W�J��
                  , UPDATED_DATE       = SYSDATE
                  , UPDATED_BY         = pvc2UserId
                  , UPDATED_PRG_NM     = pvc2BusinessName
                  , MODIFY_COUNT       = MODIFY_COUNT + 1
                WHERE 
                    T_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO   = recT_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO
                AND T_PJ_BUDGET_DETAIL.SEQNO                 = recT_PJ_BUDGET_DETAIL.SEQNO
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR(' 05:UPDATE T_PJ_BUDGET_DETAIL'         ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;
            
            -- �Č��\�Z�Ϗ㖾�׃J�[�\��FETCH
            BEGIN
                FETCH curT_PJ_BUDGET_DETAIL INTO recT_PJ_BUDGET_DETAIL;
            EXCEPTION
                WHEN OTHERS THEN
                    -- �J�[�\��FETCH���s
                    vc2Comment  := SUBSTR(' 05:FETCH curT_PJ_BUDGET_DETAIL'      ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            -- �Č��\�Z�Ϗ㖾�׃J�[�\��
            EXIT WHEN  curT_PJ_BUDGET_DETAIL%NOTFOUND;
            
        END LOOP;
        
        CLOSE curT_PJ_BUDGET_DETAIL;
    END LOOP;

    -- FNC���g���ׁA������COMMIT
    COMMIT;
/*------------------------------------------------------------
'  �\�Z���ю擾����
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    IF  recT_PJ_ODR_ALC.ESTIMATE_TYPE     =   1    THEN
        -- �����݌ɋ敪�h��1:�i�ڍ݌Ɂj�̎�
        
        -- �Č��\�Z�Ϗ㖾�׃J�[�\��OPEN
        BEGIN
            OPEN curT_PJ_BUDGET_RESULT(vc2PJBuDgetDetailNo);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 60:OPEN curT_PJ_BUDGET_RESULT'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;
        
        LOOP
            -- �Č��\�Z�Ϗ㖾�ׂ̃J�[�\��FETCH
            BEGIN
                FETCH curT_PJ_BUDGET_RESULT  INTO recT_PJ_BUDGET_RESULT;
            EXCEPTION
                WHEN OTHERS THEN
                    -- �J�[�\��FETCH���s
                    vc2Comment  := SUBSTR(' 60:FETCH curT_PJ_BUDGET_RESULT'      ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            
            -- ���i�\���J�[�\��END
            EXIT WHEN  curT_PJ_BUDGET_RESULT%NOTFOUND;
        
            numErrorSEQNO  :=  recT_PJ_BUDGET_RESULT.SEQNO;
            -- �ϐ��N���A
            vc2ErrorCD             :=  null;   -- �G���[CD
            vc2VEND_CD             :=  null;   -- �����CD
            vc2ProcCD              :=  null;   -- ��Ƌ�R�[�h   
            numUNIT_COST           :=  0;
            numCUR_CD              :=  0;
            numEXCH_TYP            :=  0;
            numROUND_TYP           :=  0;
            -- �\�Z --
            numPl_COST_MATERIAL    :=  0;      -- �ޗ���
            numPl_COST_PROCESS     :=  0;      -- ���H��
            numPl_COST_OUTSOUCE    :=  0;      -- �O����
            numPl_COST_SERVICE     :=  0;      -- �𖱔�
            -- ���� --
            numRs_COST_MATERIAL    :=  0;      -- �ޗ���
            numRs_COST_PROCESS     :=  0;      -- ���H��
            numRs_COST_OUTSOUCE    :=  0;      -- �O����
            numRs_COST_SERVICE     :=  0;      -- �𖱔�


            -- �\�Z�Ϗグ�敪�̒l�̕ҏW
            IF  recT_PJ_BUDGET_RESULT.PARENT_SEQNO  Is Null   THEN
                numBUDGET_STACK_TYP    :=  1;
            ELSE
                numBUDGET_STACK_TYP    :=  1;
                /*  ��ʎ�z�i�̌��� */
                BEGIN
                    SELECT  /*+ RULE */
                            OUTSIDE_TYP
                           ,BUDGET_STACK_TYP
                           ,PARENT_SEQNO
                           ,MRP_ODR_TYP
                           ,VEND_CD
                    INTO    numP_OUTSIDE_TYP
                           ,numP_BUDGET_STACK_TYP
                           ,numP_SEQNO
                           ,numP_MRP_ODR_TYP
                           ,numP_VEND_CD
                    FROM    T_PJ_BUDGET_DETAIL 
                    WHERE   PJ_BUDGET_DETAIL_NO  = vc2PJBuDgetDetailNo
                    AND     SEQNO                = recT_PJ_BUDGET_RESULT.PARENT_SEQNO
                    ;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR('06:SELECT PJ_BUDGET_DETAIL_NO'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                        RAISE;
                END;

                /*  �u�����Ϗ�敪�v��0:�Ϗサ�Ȃ� */
                IF  recT_PJ_BUDGET_RESULT.COST_UP_TYP      =   0    THEN
                    numBUDGET_STACK_TYP    :=  0;
                END IF;

                /*  �u�����󋋕i�t���O�v���P�F�����󋋕i */
                IF  recT_PJ_BUDGET_RESULT.VOLUNT_SPL_FLG      =   1    THEN
                    numBUDGET_STACK_TYP    :=  0;
                END IF;

                /*  ��ʎ�z�i�ڂ̗\�Z�Ϗグ���Ȃ� */
                IF  numP_BUDGET_STACK_TYP    =   0    THEN
                    numBUDGET_STACK_TYP      :=  0;
                END IF;

                /*  �L���x���i�t���O�̕ҏW */
                IF  numP_MRP_ODR_TYP  =  8   THEN 
                    -- �����̏�ʕi�ڂ��^���i�̏ꍇ�A����ɏ�ʕi������
                    BEGIN
                        SELECT  /*+ RULE */
                                OUTSIDE_TYP
                               ,BUDGET_STACK_TYP
                               ,MRP_ODR_TYP
                               ,VEND_CD
                        INTO    numP_OUTSIDE_TYP
                               ,numP_BUDGET_STACK_TYP
                               ,numP_MRP_ODR_TYP
                               ,numP_VEND_CD
                        FROM    T_PJ_BUDGET_DETAIL 
                        WHERE   PJ_BUDGET_DETAIL_NO  = vc2PJBuDgetDetailNo
                        AND     SEQNO                = numP_SEQNO
                        ;
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR('06:SELECT PJ_BUDGET_DETAIL_NO'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                            RAISE;
                    END;
                END IF;
            END IF;

            IF numP_OUTSIDE_TYP   =   1   THEN
                -- ��ʎ�z�i������̎�
                numONEROUS_CONS_FLG   :=  0;         
            ELSE
                -- ��ʎ�z�i������̎�
                -- [�x���P��]������
                IF  numP_VEND_CD    IS Null    THEN
                    numONEROUS_CONS_FLG   :=  0;
                ELSE
                    BEGIN
                        SELECT /*+ RULE */
                               ONEROUS_FLG
                        INTO   numONEROUS_CONS_FLG
                        FROM   M_CONS_UNIT_COST   CC
                              ,(SELECT MAX(EFF_PHASE_IN_DATE) as  EFF_PHASE_IN_DATE
                                FROM   M_CONS_UNIT_COST
                                WHERE  COMPANY_CD            =  vc2CompyCd                          
                                AND    VEND_CD               =  numP_VEND_CD
                                AND    PLANT_CD              =  recT_PJ_BUDGET_RESULT.PLANT_CD
                                AND    ITEM_CD               =  recT_PJ_BUDGET_RESULT.ITEM_CD
                                AND    EFF_PHASE_IN_DATE    <=  recT_PJ_BUDGET_RESULT.DUE_DATE
                               )       CU 
                        WHERE  CC.COMPANY_CD            =  vc2CompyCd                          
                        AND    CC.VEND_CD               =  numP_VEND_CD
                        AND    CC.PLANT_CD              =  recT_PJ_BUDGET_RESULT.PLANT_CD
                        AND    CC.ITEM_CD               =  recT_PJ_BUDGET_RESULT.ITEM_CD
                        AND    CC.EFF_PHASE_IN_DATE     =  CU.EFF_PHASE_IN_DATE
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            numONEROUS_CONS_FLG   :=  0;
                        WHEN OTHERS THEN
                            RAISE;
                    END;
                END IF;
                IF numONEROUS_CONS_FLG  =   1   THEN
                   -- �L���x���敪=1:�L��
                   numBUDGET_STACK_TYP   :=  0;
                END IF;
            END IF;

            /*  �]��i�̓��o�Ɂi�I�[�_�f�}���h�敪��7:���o�Ɂj */
            IF  recT_PJ_BUDGET_RESULT.OD_TYP      =   7    THEN
                numBUDGET_STACK_TYP      :=  0;
            END IF;

            -- �f�[�^�̏�Ԃɂ���Ď��я����擾  
            CASE
            WHEN numBUDGET_STACK_TYP   =   0       THEN
                -- �u�\�Z�Ϗグ�敪�v��0:�Ϗグ���Ȃ��̎�
                NULL; 
                 
            WHEN (recT_PJ_BUDGET_RESULT.OD_TYP   =   3)  AND  (recT_PJ_BUDGET_RESULT.ALC_STOCK_FLG  =  1)        THEN
                -- �u�I�[�_�f�}���h�敪�v��3:�f�}���h ���� �u�����݌ɗL���t���O�v�� 1:��������
                NULL; 

            WHEN recT_PJ_BUDGET_RESULT.MRP_ODR_TYP IN  (4 ,5 ,6 ,7)  THEN  
                -- �i�ڎ�z�敪��4:�}�j���A����z�i��,5:���b�g��z�i��,6:��ʎ�z�i��,7:�����_��z�i�ڎ�
                
                -- [�i�ڕʌ���]�̃J�[�\��OPEN
                BEGIN
                    OPEN curT_ITEM_COST(TO_CHAR(recT_PJ_BUDGET_RESULT.ODR_ACPT_DATE,'YYYY'),recT_PJ_BUDGET_RESULT.PLANT_CD,recT_PJ_BUDGET_RESULT.ITEM_CD);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 60:OPEN curT_PJ_BUDGET_RESULT'       ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                         RAISE;
                END;

                --[�i�ڕʌ���]�̃J�[�\��FETCH
                BEGIN
                    FETCH curT_ITEM_COST  INTO recT_ITEM_COST;
                EXCEPTION
                    WHEN OTHERS THEN
                        -- �J�[�\��FETCH���s
                        vc2Comment  := SUBSTR(' 60:FETCH curT_PJ_BUDGET_RESULT'      ||
                                              ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                              ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                              1,256);
                        RAISE;
                END;

                IF  curT_ITEM_COST%NOTFOUND THEN
                        vc2ErrorCD :=  'GB00407';
                        vc2Comment :=  '�i�ڔԍ�='||recT_PJ_BUDGET_RESULT.ITEM_CD;
                        -- �G���[����
                        blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD); 
                ELSE    
                    -- ��p�Z�o(�ۂߏ���)
                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                          recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                          recT_ITEM_COST.TOTAL_MATR_COST,     --(i)�[�������O�̒l
                                          4,                                  --(i)��������
                                          numPjRoundTyp,                      --(i)�[�������敪
                                          numResultAmount);                   --(o)�[��������̒l
                    IF blnRet = FALSE THEN
                        numResultAmount   :=  0;
                    END IF;   
                    numRs_COST_MATERIAL      :=  numResultAmount;
                    --DBMS_OUTPUT.PUT_LINE('---------->����_�ޗ���v�Z    numPl_COST_PROCESS='||numResultAmount);

                    -- ��p�Z�o
                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                          recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                          recT_ITEM_COST.TOTAL_PROC_COST_SUM_ALL,  --(i)�[�������O�̒l
                                          4,                                       --(i)��������
                                          numPjRoundTyp,                           --(i)�[�������敪
                                          numResultAmount);                        --(o)�[��������̒l
                    IF blnRet = FALSE THEN
                        numResultAmount   :=  0;
                    END IF;   
                    numRs_COST_PROCESS       :=  numResultAmount;
                    --DBMS_OUTPUT.PUT_LINE('---------->����_���H��v�Z    numPl_COST_PROCESS='||numResultAmount);
                
                    -- ��p�Z�o
                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                          recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                          recT_ITEM_COST.TOTAL_SBCNT_MATR_COST,    --(i)�[�������O�̒l
                                          4,                                       --(i)��������
                                          numPjRoundTyp,                           --(i)�[�������敪
                                          numResultAmount);                        --(o)�[��������̒l
                    IF blnRet = FALSE THEN
                        numResultAmount   :=  0;
                    END IF;   
                    numRs_COST_OUTSOUCE      :=  numResultAmount;
 
                END IF;
                -- [�i�ڕʌ���]�̃J�[�\��CLOSE
                CLOSE curT_ITEM_COST;

            WHEN recT_PJ_BUDGET_RESULT.MRP_ODR_TYP IN  (8)     THEN
                -- �i�ڎ�z�敪���[���i
                Null;
                
            WHEN recT_PJ_BUDGET_RESULT.ODR_RELEASE_FLG  =  0  or recT_PJ_BUDGET_RESULT.ALC_STOCK_TYP  =  1  THEN
                -- ���Ԋ��I�[�_�����σt���O��0:�I�[�_�������̎��̎�
                IF  recT_PJ_BUDGET_RESULT.OUTSIDE_TYP  =   1   THEN
                    -- ����̎�
                    
                    numCountRec :=  0;
                    -- [��ƌn��]�J�[�\��OPEN
                    BEGIN
                        OPEN curM_PROC_GRP(recT_PJ_BUDGET_RESULT.PLANT_CD,recT_PJ_BUDGET_RESULT.ITEM_CD);
                    EXCEPTION
                        WHEN OTHERS THEN
                            vc2Comment := SUBSTR(' 60:OPEN curM_PROC_GRP'       ||
                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                 1,256);
                            RAISE;
                    END;
                    
                    
                    LOOP
                        -- ��ƌn��̃J�[�\��FETCH
                        BEGIN
                            FETCH curM_PROC_GRP  INTO recM_PROC_GRP;
                        EXCEPTION
                            WHEN OTHERS THEN
                                -- �J�[�\��FETCH���s
                                vc2Comment  := SUBSTR(' 60:FETCH curM_PROC_GRP'      ||
                                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                      1,256);
                                RAISE;
                        END;
                        
                        -- ��ƌn��J�[�\��END
                        EXIT WHEN  curM_PROC_GRP%NOTFOUND;
                        
                        numCountRec :=  numCountRec   +   1;
                        vc2ProcCD   :=  recM_PROC_GRP.PROC_CD;   -- �i�ڕʍ�ƃR�[�h

                        IF  recM_PROC_GRP.OUTSIDE_TYP  =   1   THEN
                            ---��ƌn����O��敪��1:����̎�
                            -- �W���H��=0
                            IF  recM_PROC_GRP.STANDARD_COST   =   0  THEN
                                vc2ErrorCD :=  'KM00062';
                                vc2Comment :=  'PROC_CD ='||vc2ProcCD;
                                -- �G���[����
                                blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);   
                                GOTO EXT00060A1;
                            END IF;
                            -- ��Ƌ悪��
                            IF  recM_PROC_GRP.WS_CD    Is  Null  THEN
                                vc2ErrorCD :=  'AA02005';
                                vc2Comment :=  'PROC_CD ='||vc2ProcCD;
                                -- �G���[����
                                blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);    
                                GOTO EXT00060A1;
                            END IF;
                            -- [��Ƌ�]�����L�̏����Ō���
                            BEGIN
                                SELECT /*+ RULE */
                                       WS_CD
                                INTO   vc2WS_CD
                                FROM   M_WS       WS
                                WHERE  WS.WS_CD     =  recM_PROC_GRP.WS_CD 
                                ;
                            EXCEPTION
                                WHEN NO_DATA_FOUND THEN
                                    vc2ErrorCD :=  'AA01003';
                                    vc2Comment :=  null;
                                    -- �G���[����
                                    blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);    
                                    GOTO EXT00060A1;
                                WHEN OTHERS THEN
                                    RAISE;
                            END;
                            BEGIN
                                SELECT /*+ RULE */
                                       NVL(WS_CLASS_01_NAME,'*')
                                INTO   vc2CLASS_01_NAME
                                FROM   M_WS_CLASS WC
                                      ,M_CLASS    CL
                                WHERE  WC.WS_CD     =  vc2WS_CD
                                AND    CL.CLASS_CD1 =  '40' 
                                AND    CL.CLASS_CD2 =  '01'  
                                AND    CL.CLASS_CD3 =  WC.WS_CLASS_01_CD       
                                ;
                            EXCEPTION
                                WHEN NO_DATA_FOUND THEN
                                    vc2CLASS_01_NAME  :=  '*';
                                WHEN OTHERS THEN
                                    RAISE;
                            END;

                            -- �l�����l�ȊO�̑Ή�
                            BEGIN
                                 numRATE_PAY    :=  TO_NUMBER(vc2CLASS_01_NAME);
                            EXCEPTION
                                 WHEN OTHERS THEN 
                                     numRATE_PAY    :=  TO_NUMBER(numPjPayRate);
                            END;

                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  recT_PJ_BUDGET_RESULT.NECESSARY_QTY *
                                                  recM_PROC_GRP.STANDARD_COST * 
                                                  numRATE_PAY,                        --(i)�[�������O�̒l
                                                  4,                                  --(i)��������
                                                  numPjRoundTyp,                      --(i)�[�������敪
                                                  numResultAmount);                   --(o)�[��������̒l
                            IF  blnRet = FALSE THEN
                                numResultAmount  :=  0;
                            END IF; 
                            
                            -- �\��_���H��
                            IF recT_PJ_BUDGET_RESULT.ALC_STOCK_TYP  =  1 THEN
                                -- �]��݌ɕi
                                numRs_COST_PROCESS      :=  numRs_COST_PROCESS     +   numResultAmount;
                            ELSE
                                numPl_COST_PROCESS      :=  numPl_COST_PROCESS     +   numResultAmount;
                            END IF;
                        ELSE
                            ---��ƌn����O��敪��2:�O��̎�
                            
                            IF  recM_PROC_GRP.VEND_CD      IS  Null   THEN
                                vc2ErrorCD :=  'AA02004';
                                vc2Comment :=  null;
                                -- �G���[����
                                blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                GOTO EXT00060A1;
                            END IF;

                            -- [�O���P��][�����][�ʉ�]�����L�̏����Ō���
                            -- �]��݌ɕi�͕K�v�����}�C�i�X�ɂȂ�̂ŃG���[�Ƃ���B
                            IF recT_PJ_BUDGET_RESULT.NECESSARY_QTY  > 0   THEN 
                                numNECESSARY_QTY   :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY;
                            ELSE
                                numNECESSARY_QTY   :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY *  -1;
                            END IF;

                            BEGIN
                                SELECT /*+ RULE */
                                       SC.UNIT_COST,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                                INTO   numUNIT_COST,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                                FROM   M_SBCNT_UNIT_COST  SC
                                      ,(SELECT MAX(EFF_PHASE_IN_DATE)  as  EFF_PHASE_IN_DATE
                                        FROM   M_SBCNT_UNIT_COST
                                        WHERE  COMPANY_CD         =  vc2CompyCd                          
                                        AND    VEND_CD            =  recM_PROC_GRP.VEND_CD
                                        AND    PLANT_CD           =  recM_PROC_GRP.PLANT_CD
                                        AND    ITEM_CD            =  recM_PROC_GRP.ITEM_CD
                                        AND    PROC_CD            =  recM_PROC_GRP.PROC_CD
                                        AND    EFF_PHASE_IN_DATE <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)
                                        AND    SBCNT_SIZE        <=  numNECESSARY_QTY
                                       )       SU 
                                      ,M_VEND_CTRL        MV
                                      ,M_CUR              MC
                                WHERE  SC.COMPANY_CD         =  vc2CompyCd                          
                                AND    SC.VEND_CD            =  recM_PROC_GRP.VEND_CD
                                AND    SC.PLANT_CD           =  recM_PROC_GRP.PLANT_CD
                                AND    SC.ITEM_CD            =  recM_PROC_GRP.ITEM_CD
                                AND    SC.PROC_CD            =  recM_PROC_GRP.PROC_CD
                                AND    SC.EFF_PHASE_IN_DATE  =  SU.EFF_PHASE_IN_DATE
                                AND    SC.SBCNT_SIZE        <=  numNECESSARY_QTY
                                AND    MV.COMPANY_CD         =  vc2CompyCd
                                AND    MV.VEND_CD            =  SC.VEND_CD 
                                AND    MC.CUR_CD             =  MV.CUR_CD
                                ;
                            EXCEPTION
                                WHEN NO_DATA_FOUND THEN
                                    DBMS_OUTPUT.PUT_LINE('-- M_SBCNT_UNIT_COST NOT FOUND 1 --------');
                                    vc2ErrorCD :=  'ZZ12004';
                                    vc2Comment :=  null;
                                    -- �G���[����
                                    blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                    GOTO EXT00060A1;
                                WHEN OTHERS THEN
                                    RAISE;
                            END; 
                         
                            --//�בփ��[�g�擾����
                            BEGIN
                                SELECT /*+ RULE */
                                       EXCH_RATE
                                INTO   numEXCH_RATE
                                FROM   M_EXCH_RATE MER,
                                      (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                                       FROM   M_EXCH_RATE
                                       WHERE  COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                                       AND    CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                                       AND    EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                                       AND    EXCH_START_DATE      <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)    --�v����z��
                                       )           ER
                                WHERE  MER.COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                                AND    MER.CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                                AND    MER.EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                                AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --�v����z��
                                ;
                            EXCEPTION
                                WHEN NO_DATA_FOUND THEN
                                    vc2ErrorCD     :=  'KQ00038';
                                    vc2Comment     :=  null;
                                    -- �G���[����
                                    blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                    numEXCH_RATE   :=  0;        
                                WHEN OTHERS THEN
                                    RAISE;
                            END;
                            
                            -- ��p�v�Z�i�ۂ߁j
                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                                  numUNIT_COST         *
                                                  numEXCH_RATE,                       --(i)�[�������O�̒l
                                                  numDECIMAL_FIG,                     --(i)��������
                                                  numROUND_TYP,                       --(i)�[�������敪
                                                  numResultAmount);                   --(o)�[��������̒l
                            IF  blnRet = FALSE THEN
                                numResultAmount  :=  0;
                            END IF; 
                            
                            -- �\��_�O����
                            IF recT_PJ_BUDGET_RESULT.ALC_STOCK_TYP  =  1 THEN
                               numRs_COST_OUTSOUCE     :=  numRs_COST_OUTSOUCE    +   numResultAmount;
                            ELSE
                               numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE    +   numResultAmount;
                            END IF;
                        END IF;

                        <<EXT00060A1>>
                        NULL;

                    END LOOP;
                    
                    -- [��ƌn��]�J�[�\��CLOSE
                    IF  numCountRec    =   0   THEN
                        vc2ErrorCD :=  APS_COM_M_PROC_GRP; -- ��ƌn���񂪑��݂��܂���B
                        vc2Comment :=  'ITEM_CD='||recT_PJ_BUDGET_RESULT.ITEM_CD;
                        -- �Č��\�Z�Ϗグ�G���[�o�^
                        blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                    END IF;
                    CLOSE curM_PROC_GRP;

                ELSE
                    -- �O��̎�
                    
                    -- [�w���P���w�b�_]�����L�̏����Ō���
                    BEGIN
                        SELECT /*+ RULE */
                               min(PCH.PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO
                        INTO   numPUCH_PRIORITY_REF_NO
                        FROM   M_PUCH_UNIT_COST_H PCH
                        WHERE  PCH.COMPANY_CD            =  vc2CompyCd                          
                        AND    PCH.PLANT_CD              =  recT_PJ_BUDGET_RESULT.PLANT_CD
                        AND    PCH.ITEM_CD               =  recT_PJ_BUDGET_RESULT.ITEM_CD
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD :=  'AC00104';
                            vc2Comment :=  null;
                            blnRet :=  SubFncInsBudgetError('');
                            GOTO EXT00060A;
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    -- [�w���P���w�b�_][�����][�ʉ�]�����L�̏����Ō���
                    BEGIN
                        SELECT /*+ RULE */
                               PCH.VEND_CD,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                        INTO   vc2VEND_CD ,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                        FROM   M_PUCH_UNIT_COST_H   PCH
                              ,(SELECT min(PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO
                                      ,max(UPDATED_DATE)         as UPDATED_DATE
                                FROM   M_PUCH_UNIT_COST_H
                                WHERE  COMPANY_CD           =  vc2CompyCd                          
                                AND    PLANT_CD             =  recT_PJ_BUDGET_RESULT.PLANT_CD
                                AND    ITEM_CD              =  recT_PJ_BUDGET_RESULT.ITEM_CD
                                AND    PUCH_PRIORITY_REF_NO =  numPUCH_PRIORITY_REF_NO
                               )       PUH
                              ,M_VEND_CTRL        MV
                              ,M_CUR              MC
                        WHERE  PCH.COMPANY_CD            =  vc2CompyCd                          
                        AND    PCH.PLANT_CD              =  recT_PJ_BUDGET_RESULT.PLANT_CD
                        AND    PCH.ITEM_CD               =  recT_PJ_BUDGET_RESULT.ITEM_CD
                        AND    PCH.PUCH_PRIORITY_REF_NO  =  PUH.PUCH_PRIORITY_REF_NO
                        AND    PCH.UPDATED_DATE          =  PUH.UPDATED_DATE
                        AND    MV.COMPANY_CD             =  vc2CompyCd
                        AND    MV.VEND_CD                =  PCH.VEND_CD 
                        AND    MC.CUR_CD                 =  MV.CUR_CD
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD :=  'AC00104';
                            vc2Comment :=  null;
                            blnRet :=  SubFncInsBudgetError('');
                            GOTO EXT00060A;
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    -- [�w���P��]�����L�̏����Ō���
                    -- �]��݌ɕi�͕K�v�����}�C�i�X�ɂȂ�̂ŃG���[�Ƃ���B
                    IF recT_PJ_BUDGET_RESULT.NECESSARY_QTY  > 0   THEN 
                        numNECESSARY_QTY   :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY;
                    ELSE
                        numNECESSARY_QTY   :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY *  -1;
                    END IF;

                    BEGIN
                        SELECT /*+ RULE */
                               PC.UNIT_COST
                        INTO   numUNIT_COST
                        FROM   M_PUCH_UNIT_COST   PC
                              ,(SELECT MAX(EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
                                FROM   M_PUCH_UNIT_COST
                                WHERE  COMPANY_CD         =  vc2CompyCd                          
                                AND    VEND_CD            =  vc2VEND_CD
                                AND    PLANT_CD           =  recT_PJ_BUDGET_RESULT.PLANT_CD
                                AND    ITEM_CD            =  recT_PJ_BUDGET_RESULT.ITEM_CD
                                AND    EFF_PHASE_IN_DATE <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)
                                AND    PUCH_SIZE         <=  numNECESSARY_QTY               ----recT_PJ_BUDGET_RESULT.NECESSARY_QTY
                                )      PU
                        WHERE  PC.COMPANY_CD         =  vc2CompyCd                          
                        AND    PC.VEND_CD            =  vc2VEND_CD
                        AND    PC.PLANT_CD           =  recT_PJ_BUDGET_RESULT.PLANT_CD
                        AND    PC.ITEM_CD            =  recT_PJ_BUDGET_RESULT.ITEM_CD
                        AND    PC.EFF_PHASE_IN_DATE  =  PU.EFF_PHASE_IN_DATE
                        AND    PC.PUCH_SIZE         <=  numNECESSARY_QTY                    --recT_PJ_BUDGET_RESULT.NECESSARY_QTY
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD :=  'AC50515';
                            vc2Comment :=  null;
                            blnRet :=  SubFncInsBudgetError('');
                            GOTO EXT00060A;
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    --//�בփ��[�g�擾����
                    BEGIN
                        SELECT /*+ RULE */
                               EXCH_RATE
                        INTO   numEXCH_RATE
                        FROM   M_EXCH_RATE MER,
                              (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                               FROM   M_EXCH_RATE
                               WHERE  COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                               AND    CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                               AND    EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                               AND    EXCH_START_DATE      <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)    --�v����z��
                               )           ER
                        WHERE  MER.COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                        AND    MER.CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                        AND    MER.EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                        AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --�v����z��
                        ;

                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD     :=  'KQ00038';
                            vc2Comment     :=  null;
                            numEXCH_RATE   :=  0;        
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    -- ��p�v�Z�i�ۂ߁j
                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                          recT_PJ_BUDGET_RESULT.NECESSARY_QTY * numUNIT_COST  *  numEXCH_RATE,                       --(i)�[�������O�̒l
                                          numDECIMAL_FIG,                     --(i)��������
                                          numROUND_TYP,                       --(i)�[�������敪
                                          numResultAmount);                   --(o)�[��������̒l
                    IF  blnRet = FALSE THEN
                        numResultAmount   :=  0;
                    END IF; 
                    
                    -- �\��_�ޗ���
                    IF recT_PJ_BUDGET_RESULT.ALC_STOCK_TYP  =  1 THEN
                        numRs_COST_MATERIAL     :=  numRs_COST_MATERIAL    +   numResultAmount;
                    ELSE
                        numPl_COST_MATERIAL     :=  numPl_COST_MATERIAL    +   numResultAmount;
                    END IF;
                END IF;

                <<EXT00060A>>
                NULL;

            WHEN recT_PJ_BUDGET_RESULT.ODR_RELEASE_FLG =   1   THEN
                -- ���Ԋ�����-- �I�[�_�����σt���O��1:�I�[�_���s�ς̎�

                /*  ����̍�Ǝ��т��W�v */
                -- �i�ڕʎd�|�̃J�[�\��OPEN
                BEGIN
                    OPEN curT_WORK_IN_PROC_BY_ITEM(recT_PJ_BUDGET_RESULT.OD_NO);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 60:OPEN recT_PJ_BUDGET_RESULT'       ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                        RAISE;
                END;
                
                LOOP
                    -- �i�ڕʎd�|�̃J�[�\��FETCH
                    BEGIN
                        FETCH curT_WORK_IN_PROC_BY_ITEM  INTO recT_WORK_IN_PROC_BY_ITEM;
                    EXCEPTION
                        WHEN OTHERS THEN
                            -- �J�[�\��FETCH���s
                            vc2Comment  := SUBSTR(' 60:FETCH curT_WORK_IN_PROC_BY_ITEM'  ||
                                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                  1,256);
                            RAISE;
                    END;
                    -- ���i�\���J�[�\��END
                    EXIT WHEN  curT_WORK_IN_PROC_BY_ITEM%NOTFOUND;
                    
                    IF  recT_WORK_IN_PROC_BY_ITEM.PROC_EXPLOSION_FLG =   0   THEN
                        -- ��ƌn��W�J�ς݃t���O �� 0:���W�J
                        numCountRec :=  0;
                        -- [��ƌn��]�J�[�\��OPEN
                        BEGIN
                            OPEN curM_PROC_GRP(recT_WORK_IN_PROC_BY_ITEM.PLANT_CD,recT_WORK_IN_PROC_BY_ITEM.ITEM_CD);
                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR(' 60:OPEN curM_PROC_GRP'       ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                     1,256);
                                RAISE;
                        END;
                        
                        LOOP
                            -- ���v�ʂ̃J�[�\��FETCH
                            BEGIN
                                FETCH curM_PROC_GRP  INTO recM_PROC_GRP;
                            EXCEPTION
                                WHEN OTHERS THEN
                                    -- �J�[�\��FETCH���s
                                    vc2Comment  := SUBSTR(' 60:FETCH curM_PROC_GRP'      ||
                                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                          1,256);
                                    RAISE;
                            END;
                            
                            -- ���i�\���J�[�\��END
                            EXIT WHEN  curM_PROC_GRP%NOTFOUND;
                            
                            numCountRec :=  numCountRec   +   1;
                            vc2ProcCD   :=  recM_PROC_GRP.PROC_CD;   -- �i�ڕʍ�ƃR�[�h
                            
                            IF  recM_PROC_GRP.OUTSIDE_TYP  =   1   THEN
                                ---��ƌn����O��敪��1:����̎�

                                -- �W���H��=0
                                IF  recM_PROC_GRP.STANDARD_COST   =   0  THEN
                                    vc2ErrorCD :=  'KM00062';
                                    vc2Comment :=  'PROC_CD ='||vc2ProcCD;
                                    -- �G���[����
                                    blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);   
                                    GOTO EXT00060B1;
                                END IF;
                                -- ��Ƌ悪��
                                IF  recM_PROC_GRP.WS_CD    Is  Null  THEN
                                    vc2ErrorCD :=  'AA02005';
                                    vc2Comment :=  'PROC_CD ='||vc2ProcCD;
                                    -- �G���[����
                                    blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);    
                                    GOTO EXT00060B1;
                                END IF;

                                -- [��Ƌ�]�����L�̏����Ō���
                                BEGIN
                                    SELECT /*+ RULE */
                                           WS_CD
                                    INTO   vc2WS_CD
                                    FROM   M_WS       WS
                                    WHERE  WS.WS_CD     =  recM_PROC_GRP.WS_CD 
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        vc2ErrorCD :=  'AA01003';
                                        vc2Comment :=  null;
                                        -- �G���[����
                                        blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);    
                                        GOTO EXT00060B1;
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;
                                BEGIN
                                    SELECT /*+ RULE */
                                           NVL(WS_CLASS_01_NAME,'*')
                                    INTO   vc2CLASS_01_NAME
                                    FROM   M_WS_CLASS WC
                                          ,M_CLASS    CL
                                    WHERE  WC.WS_CD     =  vc2WS_CD
                                    AND    CL.CLASS_CD1 =  '40' 
                                    AND    CL.CLASS_CD2 =  '01'  
                                    AND    CL.CLASS_CD3 =  WC.WS_CLASS_01_CD       
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        vc2CLASS_01_NAME  :=  '*';
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;

                                -- �l�����l�ȊO�̑Ή�
                                BEGIN
                                    numRATE_PAY    :=  TO_NUMBER(vc2CLASS_01_NAME);
                                EXCEPTION
                                    WHEN OTHERS THEN
                                       numRATE_PAY    :=  TO_NUMBER(numPjPayRate);
                                END;
                                
                                blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                      recT_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY *
                                                      recM_PROC_GRP.STANDARD_COST * 
                                                      numRATE_PAY,                        --(i)�[�������O�̒l
                                                      4,                                  --(i)��������
                                                      numROUND_TYP,                       --(i)�[�������敪
                                                      numResultAmount);                   --(o)�[��������̒l
                                IF  blnRet = FALSE THEN
                                    numResultAmount  :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY * recM_PROC_GRP.STANDARD_COST * numRATE_PAY;
                                END IF; 
                                
                                 -- �\��_���H��
                                 numPl_COST_PROCESS      :=  numPl_COST_PROCESS     +   numResultAmount;
                            ELSE
                                ---��ƌn����O��敪��2:�O��̎�
                                
                                IF  recM_PROC_GRP.VEND_CD      IS  Null   THEN
                                    vc2ErrorCD :=  'AA02004';
                                    vc2Comment :=  null;
                                    -- �G���[����
                                    blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                    GOTO EXT00060B1;
                                END IF;

                                -- [�O���P��][�����][�ʉ�]�����L�̏����Ō���
                                BEGIN
                                    SELECT /*+ RULE */
                                           SC.UNIT_COST,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                                    INTO   numUNIT_COST,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                                    FROM   M_SBCNT_UNIT_COST  SC
                                         ,(SELECT MAX(EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
                                           FROM   M_SBCNT_UNIT_COST
                                           WHERE  COMPANY_CD         =  vc2CompyCd                          
                                           AND    VEND_CD            =  recM_PROC_GRP.VEND_CD
                                           AND    PLANT_CD           =  recM_PROC_GRP.PLANT_CD
                                           AND    ITEM_CD            =  recM_PROC_GRP.ITEM_CD
                                           AND    PROC_CD            =  recM_PROC_GRP.PROC_CD
                                           AND    EFF_PHASE_IN_DATE <=  recT_PJ_BUDGET_RESULT.DUE_DATE
                                           AND    SBCNT_SIZE        <=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY
                                           )       SU
                                          ,M_VEND_CTRL        MV
                                          ,M_CUR              MC
                                    WHERE  SC.COMPANY_CD         =  vc2CompyCd                          
                                    AND    SC.VEND_CD            =  recM_PROC_GRP.VEND_CD
                                    AND    SC.PLANT_CD           =  recM_PROC_GRP.PLANT_CD
                                    AND    SC.ITEM_CD            =  recM_PROC_GRP.ITEM_CD
                                    AND    SC.PROC_CD            =  recM_PROC_GRP.PROC_CD
                                    AND    SC.EFF_PHASE_IN_DATE  =  SU.EFF_PHASE_IN_DATE
                                    AND    SC.SBCNT_SIZE        <=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY
                                    AND    MV.COMPANY_CD         =  vc2CompyCd
                                    AND    MV.VEND_CD            =  SC.VEND_CD 
                                    AND    MC.CUR_CD             =  MV.CUR_CD
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        DBMS_OUTPUT.PUT_LINE('-- M_SBCNT_UNIT_COST NOT FOUND 2 --------');
                                        vc2ErrorCD :=  'ZZ12004';
                                        vc2Comment :=  null;
                                        -- �G���[����
                                        blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                        GOTO EXT00060B1;
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;
                                
                                --//�בփ��[�g�擾����
                                BEGIN
                                    SELECT /*+ RULE */
                                           EXCH_RATE
                                    INTO   numEXCH_RATE
                                    FROM   M_EXCH_RATE MER,
                                          (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                                           FROM   M_EXCH_RATE
                                           WHERE  COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                                           AND    CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                                           AND    EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                                           AND    EXCH_START_DATE      <=  nvl(recT_PJ_BUDGET_RESULT.DUE_DATE,recT_PJ_BUDGET_RESULT.PRD_DUE_DATE)    --�v����z��
                                           )           ER
                                    WHERE  MER.COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                                    AND    MER.CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                                    AND    MER.EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                                    AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --�v����z��
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        vc2ErrorCD     :=  'KQ00038';
                                        vc2Comment     :=  null;
                                        -- �G���[����
                                        blnRet     :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                                        numEXCH_RATE   :=  0;        
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;
                                
                                -- ��p�v�Z�i�ۂ߁j
                                blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                      recT_PJ_BUDGET_RESULT.NECESSARY_QTY * 
                                                      numUNIT_COST         *
                                                      numEXCH_RATE,                       --(i)�[�������O�̒l
                                                      4,                                  --(i)��������
                                                      numROUND_TYP,                       --(i)�[�������敪
                                                      numResultAmount);                   --(o)�[��������̒l
                                IF  blnRet = FALSE THEN
                                    numResultAmount    :=  recT_PJ_BUDGET_RESULT.NECESSARY_QTY * numUNIT_COST *  numEXCH_RATE;
                                END IF; 
                                
                                -- �\��_�O����
                                numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE    +   numResultAmount;
                            END IF;

                            <<EXT00060B1>>
                            NULL;

                        END LOOP;
                        
                        -- [��ƌn��]�J�[�\��CLOSE
                        IF  numCountRec    =   0   THEN
                            vc2ErrorCD :=  APS_COM_M_PROC_GRP; -- ��ƌn���񂪑��݂��܂���B
                            vc2Comment :=  null;
                            -- �Č��\�Z�Ϗグ�G���[�o�^
                            blnRet :=  SubFncInsBudgetError(recM_PROC_GRP.PROC_CD);
                        END IF;
                        CLOSE curM_PROC_GRP;

                    ELSE
                        -- -- ��ƌn��ʍ�Ə�ԋ敪 �� 1:�W�J�ς�
                        
                        numCountRec :=  0;
                        -- [��ƌn��ʎd�|]�J�[�\��OPEN
                        BEGIN
                            OPEN curT_WORK_IN_PROC_BY_PROC(recT_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD);
                        EXCEPTION
                            WHEN OTHERS THEN
                                vc2Comment := SUBSTR(' 60:OPEN curM_PROC_GRP'       ||
                                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                     1,256);
                                RAISE;
                        END;
                        
                        LOOP
                            -- [��ƌn��ʎd�|]�̃J�[�\��FETCH
                            BEGIN
                                FETCH curT_WORK_IN_PROC_BY_PROC  INTO recT_WORK_IN_PROC_BY_PROC;
                            EXCEPTION
                                WHEN OTHERS THEN
                                    -- �J�[�\��FETCH���s
                                    vc2Comment  := SUBSTR(' 60:FETCH curT_PJ_BUDGET_RESULT'      ||
                                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                          1,256);
                                    RAISE;
                            END;
                            
                            -- ���i�\���J�[�\��END
                            EXIT WHEN  curT_WORK_IN_PROC_BY_PROC%NOTFOUND;
                        
                            IF  recT_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP  =   1   THEN
                                ---��ƌn����O��敪��1:����̎�
                                
                                -- �W���H��=0
                                IF  recT_WORK_IN_PROC_BY_PROC.STANDARD_COST   =   0  THEN
                                    vc2ErrorCD :=  'KM00062';
                                    vc2Comment :=  'PROC_CD ='||recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD;
                                    -- �G���[����
                                    blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);   
                                    GOTO EXT00060B2;
                                END IF;
                                -- ��Ƌ悪��
                                IF  recT_WORK_IN_PROC_BY_PROC.WS_CD    Is  Null  THEN
                                    vc2ErrorCD :=  'AA02005';
                                    vc2Comment :=  'PROC_CD ='||recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD;
                                    -- �G���[����
                                    blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);    
                                    GOTO EXT00060B2;
                                END IF;
                                -- [��Ƌ�]�����L�̏����Ō���
                                BEGIN                                    SELECT /*+ RULE */
                                           WS_CLASS_01_NAME
                                    INTO   vc2CLASS_01_NAME
                                    FROM   M_WS       WS
                                          ,M_WS_CLASS WC
                                          ,M_CLASS    CL
                                    WHERE  WS.WS_CD     =  recT_WORK_IN_PROC_BY_PROC.WS_CD
                                    AND    WC.WS_CD     =  WS.WS_CD
                                    AND    CL.CLASS_CD1 =  '40' 
                                    AND    CL.CLASS_CD2 =  '01'  
                                    AND    CL.CLASS_CD3 =  WC.WS_CLASS_01_CD       
                                    ;
                                EXCEPTION
                                    WHEN NO_DATA_FOUND THEN
                                        vc2CLASS_01_NAME  :=  '*';
                                    WHEN OTHERS THEN
                                        RAISE;
                                END;
                                -- �l�����l�ȊO�̑Ή�
                                BEGIN
                                    numRATE_PAY    :=  TO_NUMBER(vc2CLASS_01_NAME);
                                EXCEPTION
                                    WHEN OTHERS THEN
                                       numRATE_PAY    :=  TO_NUMBER(numPjPayRate);
                                END;

                                
                                IF  recT_WORK_IN_PROC_BY_PROC.WORK_STS_TYP    IN  (1 ,2)  THEN
                                    -- ��ƌn��ʍ�Ə�ԋ敪�� 1:���w��or 2:�w���ς�
                                    
                                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                          recT_WORK_IN_PROC_BY_PROC.OPR_INST_QTY  *
                                                          recT_WORK_IN_PROC_BY_PROC.STANDARD_COST * 
                                                          numRATE_PAY,                        --(i)�[�������O�̒l
                                                          4,                                  --(i)��������
                                                          numROUND_TYP,                       --(i)�[�������敪
                                                          numResultAmount);                   --(o)�[��������̒l
                                    IF  blnRet = FALSE THEN
                                        numResultAmount   :=  recM_PROC_GRP.STANDARD_COST * numRATE_PAY;
                                    END IF; 
                                    
                                    -- �\��_���H��
                                    numPl_COST_PROCESS      :=  numPl_COST_PROCESS     +   numResultAmount;
                                     
                                ELSE
                                    -- ��ƌn��ʍ�Ə�ԋ敪�� 9:��Ɗ���

                                    -- [��Ǝ���]�J�[�\��OPEN
                                    BEGIN
                                        OPEN curT_OPR_RSLT(recT_WORK_IN_PROC_BY_PROC.OPR_INST_CD);
                                    EXCEPTION
                                        WHEN OTHERS THEN
                                            vc2Comment := SUBSTR(' 60:OPEN curT_OPR_RSLT'       ||
                                                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                                 1,256);
                                            RAISE;
                                    END;
                        
                                    LOOP
                                        -- [��Ǝ���]�̃J�[�\��FETCH
                                        BEGIN
                                            FETCH curT_OPR_RSLT  INTO recT_OPR_RSLT;
                                        EXCEPTION
                                            WHEN OTHERS THEN
                                                -- �J�[�\��FETCH���s
                                                vc2Comment  := SUBSTR(' 60:FETCH curT_OPR_RSLT'      ||
                                                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                                      1,256);
                                                RAISE;
                                        END;
                            
                                        -- ��Ǝ��уJ�[�\��END
                                        EXIT WHEN  curT_OPR_RSLT%NOTFOUND;
                            
                                        -- [��Ƌ�]�����L�̏����Ō���
                                        BEGIN
                                            SELECT /*+ RULE */
                                                   WS_CLASS_01_NAME
                                            INTO   vc2CLASS_01_NAME
                                            FROM   M_WS       WS
                                                  ,M_WS_CLASS WC
                                                  ,M_CLASS    CL
                                            WHERE  WS.WS_CD     =  recT_OPR_RSLT.WS_CD
                                            AND    WC.WS_CD     =  WS.WS_CD
                                            AND    CL.CLASS_CD1 =  '40' 
                                            AND    CL.CLASS_CD2 =  '01'  
                                            AND    CL.CLASS_CD3 =  WC.WS_CLASS_01_CD       
                                            ;
                                        EXCEPTION
                                            WHEN NO_DATA_FOUND THEN
                                                vc2CLASS_01_NAME  :=  '*';
                                            WHEN OTHERS THEN
                                                RAISE;
                                        END;
                                        -- �l�����l�ȊO�̑Ή�
                                        BEGIN
                                            numRATE_PAY2    :=  TO_NUMBER(vc2CLASS_01_NAME);
                                        EXCEPTION
                                            WHEN OTHERS THEN
                                                numRATE_PAY2    :=  numRATE_PAY;
                                        END;
                            
                                        numPRE_ARRANGEMENT_TIME := recT_OPR_RSLT.PRE_ARRANGEMENT_TIME;
                                        numOPR_TIME_UNIT_TYP    := recT_OPR_RSLT.OPR_TIME_UNIT_TYP;
                                        numOPR_TIME             := recT_OPR_RSLT.OPR_TIME;
                            
                                        -- ��Ǝ��т̎��э�Ǝ���=0
                                        IF  (numPRE_ARRANGEMENT_TIME + numOPR_TIME_UNIT_TYP + numOPR_TIME) = 0 THEN
                                            vc2ErrorCD :=  'KM00063';
                                            vc2Comment :=  'OPR_INST_CD ='||recT_WORK_IN_PROC_BY_PROC.OPR_INST_CD;
                                            -- �G���[����
                                            blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);   
                                            GOTO EXT00060B4;
                                        END IF;

                                        blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                              (numPRE_ARRANGEMENT_TIME + numOPR_TIME_UNIT_TYP + numOPR_TIME) *
                                                              numRATE_PAY2,                       --(i)�[�������O�̒l
                                                              4,                                  --(i)��������
                                                              numROUND_TYP,                       --(i)�[�������敪
                                                              numResultAmount);                   --(o)�[��������̒l
                                        IF  blnRet = FALSE THEN
                                            numResultAmount   :=  0;
                                        END IF; 
                                    
                                        -- ����_���H��
                                        numRs_COST_PROCESS      :=  numRs_COST_PROCESS     +   numResultAmount;                            

                                       <<EXT00060B4>>
                                       NULL;
                            
                                    END LOOP;
                                    
                                    -- ��Ǝ��т̃J�[�\��CLOSE
                                    CLOSE curT_OPR_RSLT;

                                END IF;                                
                            ELSE
                                ---��ƌn����O��敪��2:�O��̎�      
                                /*  ��ƌn��ʍ�Ə�ԋ敪�𔻒f���� */                         
                                IF  recT_WORK_IN_PROC_BY_PROC.WORK_STS_TYP    =   1    THEN
                                    /*  �w���m�肵�Ă��Ȃ��ꍇ */

                                    -- [�O���P��][�����][�ʉ�]�����L�̏����Ō���
                                    BEGIN
                                        SELECT /*+ RULE */
                                               SC.UNIT_COST,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                                        INTO   numUNIT_COST,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                                        FROM   M_SBCNT_UNIT_COST  SC
                                             ,(SELECT MAX(EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
                                               FROM   M_SBCNT_UNIT_COST
                                               WHERE  COMPANY_CD         =  vc2CompyCd                          
                                               AND    VEND_CD            =  recT_WORK_IN_PROC_BY_PROC.VEND_CD
                                               AND    PLANT_CD           =  recT_WORK_IN_PROC_BY_PROC.PLANT_CD
                                               AND    ITEM_CD            =  recT_WORK_IN_PROC_BY_PROC.ITEM_CD
                                               AND    PROC_CD            =  recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD
                                               AND    EFF_PHASE_IN_DATE <=  recT_WORK_IN_PROC_BY_PROC.OPR_INST_START_DATE
                                               AND    SBCNT_SIZE        <=  recT_WORK_IN_PROC_BY_PROC.OPR_INST_QTY
                                              )       SU
                                             ,M_VEND_CTRL        MV
                                             ,M_CUR              MC
                                        WHERE  SC.COMPANY_CD         =  vc2CompyCd                          
                                        AND    SC.VEND_CD            =  recT_WORK_IN_PROC_BY_PROC.VEND_CD
                                        AND    SC.PLANT_CD           =  recT_WORK_IN_PROC_BY_PROC.PLANT_CD
                                        AND    SC.ITEM_CD            =  recT_WORK_IN_PROC_BY_PROC.ITEM_CD
                                        AND    SC.PROC_CD            =  recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD
                                        AND    SC.EFF_PHASE_IN_DATE  =  SU.EFF_PHASE_IN_DATE
                                        AND    SC.SBCNT_SIZE        <=  recT_WORK_IN_PROC_BY_PROC.OPR_INST_QTY
                                        AND    MV.COMPANY_CD         =  vc2CompyCd
                                        AND    MV.VEND_CD            =  SC.VEND_CD 
                                        AND    MC.CUR_CD             =  MV.CUR_CD
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            DBMS_OUTPUT.PUT_LINE('-- M_SBCNT_UNIT_COST NOT FOUND 3 --------');
                                            vc2ErrorCD :=  'ZZ12004';
                                            vc2Comment :=  null;
                                            -- �G���[����
                                            blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);
                                            GOTO  EXT00060B2;
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;
                                    
                                    --//�בփ��[�g�擾����
                                    BEGIN
                                        SELECT /*+ RULE */
                                               EXCH_RATE
                                        INTO   numEXCH_RATE
                                        FROM   M_EXCH_RATE MER,
                                              (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                                               FROM   M_EXCH_RATE
                                               WHERE  COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                                               AND    CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                                               AND    EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                                               AND    EXCH_START_DATE      <=  recT_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE    --�v����z��
                                               )           ER
                                        WHERE  MER.COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                                        AND    MER.CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                                        AND    MER.EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                                        AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --�v����z��
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            vc2ErrorCD     :=  'KQ00038';
                                            vc2Comment     :=  null;
                                            numEXCH_RATE   :=  0;        
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;
                                    
                                    -- ��p�v�Z�i�ۂ߁j
                                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                          recT_WORK_IN_PROC_BY_PROC.OPR_INST_QTY * 
                                                          numUNIT_COST         *
                                                          numEXCH_RATE,                       --(i)�[�������O�̒l        --(i)�[�������O�̒l
                                                          numDECIMAL_FIG,                     --(i)��������
                                                          numROUND_TYP,                       --(i)�[�������敪
                                                          numResultAmount);                   --(o)�[��������̒l
                                    IF  blnRet = FALSE THEN
                                        numResultAmount   := recT_PJ_BUDGET_RESULT.NECESSARY_QTY * numUNIT_COST * numEXCH_RATE;
                                    END IF; 
                                    
                                    -- �\��_�O����
                                    numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE    +   numResultAmount;
                                ELSE
                                    -- [�����c]�m�����n�����L�̏����Ō���
                                    BEGIN
                                        SELECT /*+ RULE */
                                               PU.PUCH_ODR_CD,PU.PUCH_ODR_STS_TYP,PU.PUCH_ODR_QTY,PU.UNIT_COST,MV.CUR_CD,MV.EXCH_TYP,MV.ROUND_TYP,MC.DECIMAL_FIG
                                        INTO   numPUCH_ODR_CD,numPUCH_ODR_STS_TYP,numPUCH_ODR_QTY,numUNIT_COST,numCUR_CD,numEXCH_TYP,numROUND_TYP,numDECIMAL_FIG
                                        FROM   T_RLSD_PUCH_ODR PU
                                              ,M_VEND_CTRL     MV
                                              ,M_CUR           MC
                                        WHERE  PU.WORK_ODR_CD      =  recT_WORK_IN_PROC_BY_PROC.WORK_ODR_CD
                                        AND    PU.WORK_IN_PROC_CD  =  recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD
                                        AND    MV.COMPANY_CD       =  vc2CompyCd       
                                        AND    MV.VEND_CD          =  PU.VEND_CD
                                        AND    MC.CUR_CD           =  MV.CUR_CD
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            vc2ErrorCD :=  'KQ20187';
                                            vc2Comment :=  null;
                                            -- �G���[����
                                            blnRet :=  SubFncInsBudgetError(recT_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD);
                                            GOTO  EXT00060B2;
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;

                                    -- [�������]�̌���
                                    BEGIN
                                        SELECT /*+ RULE */
                                               SUM(ACPT_QTY),SUM(PUCH_ODR_AMOUNT)
                                        INTO   numACPT_QTY,numPUCH_ODR_AMOUNT
                                        FROM T_ACPT_RSLT
                                        WHERE PUCH_ODR_CD    =   numPUCH_ODR_CD
                                        Group BY PUCH_ODR_CD
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            numACPT_QTY           :=  0;
                                            numPUCH_ODR_AMOUNT    :=  0;
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;
                                    
                                    --//�בփ��[�g�擾����
                                    BEGIN
                                        SELECT /*+ RULE */
                                               EXCH_RATE
                                        INTO   numEXCH_RATE
                                        FROM   M_EXCH_RATE MER,
                                              (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                                               FROM   M_EXCH_RATE
                                               WHERE  COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                                               AND    CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                                               AND    EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                                               AND    EXCH_START_DATE      <=  recT_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE    --�v����z��
                                               )           ER
                                        WHERE  MER.COMPANY_CD            =  vc2CompyCd              --���ЃR�[�h
                                        AND    MER.CUR_CD                =  numCUR_CD               --�ʉ݃R�[
                                        AND    MER.EXCH_TYP              =  numEXCH_TYP             --�ב֎��
                                        AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE      --�v����z��
                                        ;
                                    EXCEPTION
                                        WHEN NO_DATA_FOUND THEN
                                            vc2ErrorCD     :=  'KQ00038';
                                            vc2Comment     :=  null;
                                            numEXCH_RATE   :=  0;        
                                        WHEN OTHERS THEN
                                            RAISE;
                                    END;

                                    --�e��p�v�Z
                                    -- ����_�O����
                                    blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                          numPUCH_ODR_AMOUNT   *
                                                          numEXCH_RATE,                       --(i)�[�������O�̒l
                                                          numDECIMAL_FIG,                     --(i)��������
                                                          numROUND_TYP,                       --(i)�[�������敪
                                                          numResultAmount);                   --(o)�[��������̒l
                                    numRs_COST_OUTSOUCE    :=   numRs_COST_OUTSOUCE    +   numResultAmount;

                                    -- �\��_�O����
                                    IF  numPUCH_ODR_QTY   <  numACPT_QTY THEN
                                        numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE  +   0;
                                    ELSIF numPUCH_ODR_STS_TYP  =  9 THEN
                                        --����������͂O�Ƃ���B
                                        numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE  +   0;

                                    ELSE
                                        
                                        blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                              (numPUCH_ODR_QTY -  numACPT_QTY) * 
                                                              numUNIT_COST * 
                                                              numEXCH_RATE,                       --(i)�[�������O�̒l
                                                              numDECIMAL_FIG,                     --(i)��������
                                                              numROUND_TYP,                       --(i)�[�������敪
                                                              numResultAmount);                   --(o)�[��������̒l
                                        IF  blnRet = FALSE THEN
                                            numResultAmount   :=  0;
                                        END IF; 
                                        
                                        numPl_COST_OUTSOUCE     :=  numPl_COST_OUTSOUCE    +   numResultAmount;
                                    END IF;

                                END IF;
                            END IF;
                            
                           <<EXT00060B2>>
                           NULL;

                        END LOOP;
                        
                        -- ��ƌn��ʎd�|�̃J�[�\��CLOSE
                        CLOSE curT_WORK_IN_PROC_BY_PROC;
                        
                    END IF;
                    
                END LOOP;
                
                -- �i�ڕʎd�|�̃J�[�\��CLOSE
                CLOSE curT_WORK_IN_PROC_BY_ITEM;
                
                
                /*  �O��̎�����т��W�v */
                -- �����c�̃J�[�\��OPEN
                BEGIN
                    OPEN curT_RLSD_PUCH_ODR(recT_PJ_BUDGET_RESULT.OD_NO);
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 60:OPEN curT_RLSD_PUCH_ODR'          ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                        RAISE;
                END;
                
                LOOP
                    -- �����c�̃J�[�\��FETCH
                    BEGIN
                        FETCH curT_RLSD_PUCH_ODR  INTO recT_RLSD_PUCH_ODR;
                    EXCEPTION
                        WHEN OTHERS THEN
                            -- �J�[�\��FETCH���s
                            vc2Comment  := SUBSTR(' 60:FETCH curT_WORK_IN_PROC_BY_ITEM'  ||
                                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                                  1,256);
                            RAISE;
                    END;
                    -- �����c�J�[�\��END
                    EXIT WHEN  curT_RLSD_PUCH_ODR%NOTFOUND;

                    -- [�����c].�g�����h��NULL�̎��G���[
                    IF  recT_RLSD_PUCH_ODR.VEND_CD     IS Null THEN
                        vc2ErrorCD :=  'AC50520';
                        vc2Comment :=  null;
                        -- �G���[����
                        blnRet     :=  SubFncInsBudgetError('');
                        GOTO EXT00060B3;
                    END IF;
                    vc2VEND_CD     :=  recT_RLSD_PUCH_ODR.VEND_CD;

                    --���z�ׂ̈Ɉבփ��[�g���Ɏ擾����
                    --//[�ʉ�]���擾����
                    BEGIN
                        SELECT /*+ RULE */
                               DECIMAL_FIG
                        INTO   numDECIMAL_FIG
                        FROM   M_CUR
                        WHERE  CUR_CD                =  recT_RLSD_PUCH_ODR.CUR_CD               --�ʉ݃R�[
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD     :=  'ZZ02023';
                            vc2Comment     :=  null;
                            numEXCH_RATE   :=  0;      
                            -- �G���[����
                            blnRet     :=  SubFncInsBudgetError(''); 
                            GOTO EXT00060B3;
                        WHEN OTHERS THEN
                            RAISE;
                    END;

                    --//�בփ��[�g�擾����
                    BEGIN
                        SELECT /*+ RULE */
                               EXCH_RATE
                        INTO   numEXCH_RATE
                        FROM   M_EXCH_RATE MER,
                              (SELECT MAX(EXCH_START_DATE) as EXCH_START_DATE
                               FROM   M_EXCH_RATE
                               WHERE  COMPANY_CD            =  vc2CompyCd                              --���ЃR�[�h
                               AND    CUR_CD                =  recT_RLSD_PUCH_ODR.CUR_CD               --�ʉ݃R�[
                               AND    EXCH_TYP              =  recT_RLSD_PUCH_ODR.EXCH_TYP             --�ב֎��
                               AND    EXCH_START_DATE      <=  recT_RLSD_PUCH_ODR.PUCH_ODR_DLV_DATE    --�v����z��
                               )           ER
                        WHERE  MER.COMPANY_CD            =  vc2CompyCd                              --���ЃR�[�h
                        AND    MER.CUR_CD                =  recT_RLSD_PUCH_ODR.CUR_CD               --�ʉ݃R�[
                        AND    MER.EXCH_TYP              =  recT_RLSD_PUCH_ODR.EXCH_TYP             --�ב֎��
                        AND    MER.EXCH_START_DATE       =  ER.EXCH_START_DATE                      --�v����z��
                        ;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            vc2ErrorCD     :=  'KQ00038';
                            vc2Comment     :=  null;
                            numEXCH_RATE   :=  0;      
                            -- �G���[����
                            blnRet     :=  SubFncInsBudgetError('');  
                        WHEN OTHERS THEN
                            RAISE;
                    END;
                    
                    
                    IF  recT_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP =   1   THEN
                        -- ������ԋ敪�h �� 1:���w��
                        
                        -- [�w���P��]�����L�̏����Ō���
                        BEGIN
                            SELECT /*+ RULE */
                                   PC.UNIT_COST
                            INTO   numUNIT_COST
                            FROM   M_PUCH_UNIT_COST   PC
                                  ,(SELECT MAX(EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
                                    FROM   M_PUCH_UNIT_COST
                                    WHERE  COMPANY_CD         =  vc2CompyCd                          
                                    AND    VEND_CD            =  recT_RLSD_PUCH_ODR.VEND_CD
                                    AND    PLANT_CD           =  recT_RLSD_PUCH_ODR.PLANT_CD
                                    AND    ITEM_CD            =  recT_RLSD_PUCH_ODR.ITEM_CD
                                    AND    EFF_PHASE_IN_DATE <=  recT_RLSD_PUCH_ODR.PUCH_ODR_DLV_DATE
                                    AND    PUCH_SIZE         <=  recT_RLSD_PUCH_ODR.PUCH_ODR_QTY
                                    )      PU
                                  ,M_VEND_CTRL        VC
                            WHERE  PC.COMPANY_CD         =  vc2CompyCd                          
                            AND    PC.VEND_CD            =  recT_RLSD_PUCH_ODR.VEND_CD
                            AND    PC.PLANT_CD           =  recT_RLSD_PUCH_ODR.PLANT_CD
                            AND    PC.ITEM_CD            =  recT_RLSD_PUCH_ODR.ITEM_CD
                            AND    PC.EFF_PHASE_IN_DATE  =  PU.EFF_PHASE_IN_DATE
                            AND    PC.PUCH_SIZE         <=  recT_RLSD_PUCH_ODR.PUCH_ODR_QTY
                            AND    VC.COMPANY_CD         =  vc2CompyCd
                            AND    VC.VEND_CD            =  PC.VEND_CD 
                            AND    rownum               <=  1
                            ORDER BY PC.EFF_PHASE_IN_DATE DESC,PC.PUCH_SIZE DESC
                            ;
                        EXCEPTION
                            WHEN NO_DATA_FOUND THEN
                                vc2ErrorCD :=  'AC50515';
                                vc2Comment :=  null;
                                -- �G���[����
                                blnRet     :=  SubFncInsBudgetError('');
                                GOTO EXT00060B3;
                            WHEN OTHERS THEN
                                RAISE;
                        END;

                        -- ��p�v�Z�i�ۂ߁j
                        blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                              recT_RLSD_PUCH_ODR.PUCH_ODR_QTY  *  
                                              numUNIT_COST  *  
                                              numEXCH_RATE,                       --(i)�[�������O�̒l
                                              numDECIMAL_FIG,                     --(i)��������
                                              numROUND_TYP,                       --(i)�[�������敪
                                              numResultAmount);                   --(o)�[��������̒l
                        IF  blnRet = FALSE THEN
                            numResultAmount   :=  recT_RLSD_PUCH_ODR.PUCH_ODR_QTY  *  numUNIT_COST  *  numEXCH_RATE;
                        END IF; 
                        
                        -- �\��_�ޗ���
                        numPl_COST_MATERIAL   :=  numPl_COST_MATERIAL    +   numResultAmount;

                    ELSE
                        -- ������ԋ敪�h �� 2:�w���ς�  9:�������

                        -- ������т̂�������
                        BEGIN
                            SELECT /*+ RULE */
                                   SUM(ACPT_QTY),SUM(PUCH_ODR_AMOUNT)
                            INTO   numACPT_QTY,numPUCH_ODR_AMOUNT
                            FROM T_ACPT_RSLT
                            WHERE PUCH_ODR_CD    =   recT_RLSD_PUCH_ODR.PUCH_ODR_CD
                            Group BY PUCH_ODR_CD
                            ;
                        EXCEPTION
                            WHEN NO_DATA_FOUND THEN
                                numACPT_QTY           :=  0;
                                numPUCH_ODR_AMOUNT    :=  0;
                            WHEN OTHERS THEN
                                RAISE;
                        END;
                        
                        --�e��p�v�Z
                        -- ����_�ޗ���
                        blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                              numPUCH_ODR_AMOUNT   *  
                                              numEXCH_RATE,                       --(i)�[�������O�̒l
                                              numDECIMAL_FIG,                     --(i)��������
                                              recT_RLSD_PUCH_ODR.ROUND_TYP,       --(i)�[�������敪
                                              numResultAmount);                   --(o)�[��������̒l
                        numRs_COST_MATERIAL    :=   numRs_COST_MATERIAL    +   numResultAmount;

                        -- �\��_�ޗ���
                        IF  recT_RLSD_PUCH_ODR.PUCH_ODR_QTY <=  numACPT_QTY THEN
                            numPl_COST_MATERIAL     :=  numPl_COST_MATERIAL  +   0;
                        ELSIF numPUCH_ODR_STS_TYP  =  9 THEN
                              --����������͂O�Ƃ���B
                            numPl_COST_MATERIAL     :=  numPl_COST_MATERIAL  +   0;
                        ELSE
                            
                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  (recT_RLSD_PUCH_ODR.PUCH_ODR_QTY -  numACPT_QTY) * 
                                                  recT_RLSD_PUCH_ODR.UNIT_COST *  
                                                  numEXCH_RATE,                       --(i)�[�������O�̒l
                                                  numDECIMAL_FIG,                     --(i)��������
                                                  recT_RLSD_PUCH_ODR.ROUND_TYP,       --(i)�[�������敪
                                                  numResultAmount);                   --(o)�[��������̒l
                            IF  blnRet = FALSE THEN
                                numResultAmount   :=  0;
                            END IF; 
                            

                            -- �\��_�ޗ���
                            numPl_COST_MATERIAL   :=  numPl_COST_MATERIAL    +   numResultAmount;
                        END IF;

                    END IF;

                    <<EXT00060B3>>
                    NULL;

                END LOOP;
                -- �����c�̃J�[�\��CLOSE
                CLOSE curT_RLSD_PUCH_ODR;

                <<EXT00060B>>
                NULL;
            END CASE;


            /* �Č��\�Z�Ϗ㖾�ׂ̎�z�c�A�������т̍X�V */
            -- �Č��\�Z�Ϗ㖾�ׂ̍X�V
            BEGIN
                UPDATE T_PJ_BUDGET_DETAIL
                SET VEND_CD            = vc2VEND_CD
                  , ODR_COST_MATERIAL  = numPl_COST_MATERIAL
                  , ODR_COST_PROCESS   = numPl_COST_PROCESS 
                  , ODR_COST_OUTSOUCE  = numPl_COST_OUTSOUCE
                  , CMP_COST_MATERIAL  = numRs_COST_MATERIAL
                  , CMP_COST_PROCESS   = numRs_COST_PROCESS 
                  , CMP_COST_OUTSOUCE  = numRs_COST_OUTSOUCE
                  , EXP_COST_MATERIAL  = numPl_COST_MATERIAL   +   numRs_COST_MATERIAL
                  , EXP_COST_PROCESS   = numPl_COST_PROCESS    +   numRs_COST_PROCESS 
                  , EXP_COST_OUTSOUCE  = numPl_COST_OUTSOUCE   +   numRs_COST_OUTSOUCE
                  , ONEROUS_CONS_FLG   = numONEROUS_CONS_FLG
                  , BUDGET_STACK_TYP   = numBUDGET_STACK_TYP
                  , UPDATED_DATE       = SYSDATE
                  , MODIFY_COUNT       = MODIFY_COUNT + 1
                WHERE 
                    T_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO   = vc2PJBuDgetDetailNo
                AND T_PJ_BUDGET_DETAIL.SEQNO                 = recT_PJ_BUDGET_RESULT.SEQNO
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR(' UPDATE T_PJ_BUDGET_DETAIL'   ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;

        END LOOP;
        -- �Č��\�Z�Ϗグ���ׂ̃J�[�\��CLOSE
        CLOSE curT_PJ_BUDGET_RESULT;
    ELSE
        -- �����݌ɋ敪�h��2:���ԁj�̎�
       
        -- �\�Z --
        numPl_COST_SERVICE     :=  0;      -- �𖱔�
        -- ���� --
        numRs_COST_SERVICE     :=  0;      -- �𖱔�

        blnRet    :=  TRUE;
        -- �𖱎��т�������
        BEGIN
            SELECT /*+ RULE */
                   WORK_TIME
            INTO   numWORK_TIME
            FROM   T_SERVICE
            WHERE  ODR_NO        =   pvc2OdrNO;   -- �󒍔ԍ�
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                blnRet    :=  FALSE;
            WHEN OTHERS THEN
                RAISE;
        END;
        
        IF  blnRet    THEN
            /* �ۂߏ������s�� */
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                  numWORK_TIME * numPjPayRate,  --(i)�[�������O�̒l
                                  4,                            --(i)��������
                                  numPjRoundTyp,                --(i)�[�������敪
                                  numResultAmount);             --(o)�[��������̒l
            IF blnRet = FALSE THEN
                numResultAmount   :=  numWORK_TIME * numRATE_PAY;
            END IF;
            /* �ۂ߂̌��ʂ𔭒����z�ɔ��f���� */
            numRs_COST_SERVICE    :=  numResultAmount;
        ELSE
            numPl_COST_SERVICE    :=  recT_ESTIMATE_DETAL.ES_COST_SERVICE;      -- ���ϗ\�Z  �𖱔�
        END IF;
        
        /* �Č��\�Z�Ϗ㖾�ׂ̎�z�c�A�������т̍X�V */
        -- �d����N�ԓ������̍X�V
        BEGIN
            UPDATE T_PJ_BUDGET_DETAIL
            SET ODR_COST_SERVICE   = numPl_COST_SERVICE               
              , CMP_COST_SERVICE   = numRs_COST_SERVICE 
              , EXP_COST_SERVICE   = numPl_COST_SERVICE    +   numRs_COST_SERVICE 
              , BUDGET_STACK_TYP   = 1
              , UPDATED_DATE       = SYSDATE
              , MODIFY_COUNT       = MODIFY_COUNT + 1
            WHERE 
                T_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO   = vc2PJBuDgetDetailNo
            AND T_PJ_BUDGET_DETAIL.SEQNO                 = numMaxSeqNO
            ;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 60:UPDATE T_PJ_BUDGET_DETAIL'     ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE excOTHER_ERR;
        END;
    END IF;
/*------------------------------------------------------------
'  �\�Z�Ϗグ����
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    
    datTOTAL_DATE   :=   sysdate;

    -- [�Č��\�Z�Ϗ㖾��]���W�v����
    BEGIN
        SELECT /*+ RULE */
               SUM(ODR_COST_MATERIAL *  ALC_STOCK_RATE) AS  ODR_COST_MATERIAL
              ,SUM(ODR_COST_PROCESS  *  ALC_STOCK_RATE) AS  ODR_COST_PROCESS
              ,SUM(ODR_COST_OUTSOUCE *  ALC_STOCK_RATE) AS  ODR_COST_OUTSOUCE
              ,SUM(ODR_COST_SERVICE  *  ALC_STOCK_RATE) AS  ODR_COST_SERVICE
              ,SUM(CMP_COST_MATERIAL *  ALC_STOCK_RATE) AS  CMP_COST_MATERIAL
              ,SUM(CMP_COST_PROCESS  *  ALC_STOCK_RATE) AS  CMP_COST_PROCESS
              ,SUM(CMP_COST_OUTSOUCE *  ALC_STOCK_RATE) AS  CMP_COST_OUTSOUCE
              ,SUM(CMP_COST_SERVICE  *  ALC_STOCK_RATE) AS  CMP_COST_SERVICE
        INTO   numPl_COST_MATERIAL
              ,numPl_COST_PROCESS 
              ,numPl_COST_OUTSOUCE
              ,numPl_COST_SERVICE 
              ,numRs_COST_MATERIAL
              ,numRs_COST_PROCESS 
              ,numRs_COST_OUTSOUCE
              ,numRs_COST_SERVICE  
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO        =  vc2PJBuDgetDetailNo  --�Č��\�Z�Ϗ㖾�הԍ�
        AND    BUDGET_STACK_TYP           =  1                    --�\�Z�Ϗ�敪
        GROUP BY PJ_BUDGET_DETAIL_NO
        ;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            numPRE_ARRANGEMENT_TIME :=  0;
            numOPR_TIME_UNIT_TYP    :=  0;
            numOPR_TIME             :=  0;
        WHEN OTHERS THEN
            RAISE;
    END;
    
    CASE
    /* ���ςɕR�t���i�ڂ�MRP�i�̎� */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (4 ,5 ,6 ,7))  THEN
    
        BEGIN
            INSERT INTO T_PJ_COST(
                    PROJECT_CD                --  1 �Č��ԍ�
                   ,ESTIMATE_NO               --  2 ���ϔԍ�
                   ,DETAL_NO                  --  3 ���הԍ�
                   ,TOTAL_DATE                --  4 �W�v����
                   ,ODR_NO                    --  5 �󒍔ԍ�
                   ,ITEM_CD                   --  6 �i�ڔԍ�
                   ,ODR_QTY                   --  7 �󒍐���
                   ,COMP_QTY                  --  8 ������
                   ,COST_PROGRESS             --  9 ��p�i��
                   ,CMP_COST_MATERIAL         -- 10 ��������  �ޗ���
                   ,CMP_COST_PROCESS          -- 11 ��������  ���H��
                   ,CMP_COST_OUTSOUCE         -- 12 ��������  �O����
                   ,CMP_COST_SERVICE          -- 13 ��������  �𖱔�
                   ,EXP_COST_MATERIAL         -- 14 ��������  �ޗ���
                   ,EXP_COST_PROCESS          -- 15 ��������  ���H��
                   ,EXP_COST_OUTSOUCE         -- 16 ��������  �O����
                   ,EXP_COST_SERVICE          -- 17 ��������  �𖱔�
                   ,CREATED_DATE              -- 22 �쐬��
                   ,CREATED_BY                -- 23 �쐬��
                   ,CREATED_PRG_NM            -- 24 �쐬�v���O������
                   ,UPDATED_DATE              -- 25 �X�V��
                   ,UPDATED_BY                -- 26 �X�V��
                   ,UPDATED_PRG_NM            -- 27 �X�V�v���O������
                   ,MODIFY_COUNT              -- 28 �X�V��
            ) VALUES (
                    pvc2ProjectCd                              --  1 �Č��ԍ�
                   ,pvc2EstimateNo                             --  2 ���ϔԍ�
                   ,pvc2DetalNo                                --  3 ���הԍ�
                   ,datTOTAL_DATE                              --  4 �W�v����
                   ,pvc2OdrNO                                  --  5 �󒍔ԍ�
                   ,recT_ODR_CTL.ITEM_CD                       --  6 �i�ڔԍ�
                   ,recT_ODR.ODR_QTY                           --  7 �󒍐���
                   ,recT_ODR.ODR_QTY                           --  8 ������
                   ,2                                          --  9 ��p�i��
                   ,numRs_COST_MATERIAL                        -- 10 ��������  �ޗ���
                   ,numRs_COST_PROCESS                         -- 11 ��������  ���H��
                   ,numRs_COST_OUTSOUCE                        -- 12 ��������  �O����
                   ,0                                          -- 13 ��������  �𖱔�
                   ,numPl_COST_MATERIAL + numRs_COST_MATERIAL  -- 14 ��������  �ޗ���
                   ,numPl_COST_PROCESS  + numRs_COST_PROCESS   -- 15 ��������  ���H��
                   ,numPl_COST_OUTSOUCE + numRs_COST_OUTSOUCE  -- 16 ��������  �O����
                   ,0                                          -- 17 ��������  �𖱔�
                   ,SYSDATE                                    -- 22 �쐬��
                   ,pvc2UserId                                 -- 23 �쐬��
                   ,pvc2BusinessName                           -- 24 �쐬�v���O������
                   ,SYSDATE                                    -- 25 �X�V��
                   ,pvc2UserId                                 -- 26 �X�V��
                   ,pvc2BusinessName                           -- 27 �X�V�v���O������
                   ,0);                                        -- 28 �X�V��
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('12:INSERT T_PJ_COST'     ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE excOTHER_ERR;
        END;



    /* ���ςɕR�t���i�ڂ����ԕi�̎� */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (1 ,2))  THEN
    
        -- [���Ԏ󒍕R�t][�󒍖���][���v��]�J�[�\��OPEN
        BEGIN
           OPEN curT_JOB_ODR_PJ(recT_JOB_ODR.JOB_ODR_CD
                               ,recT_JOB_ODR.JOB_ODR_DETAIL_NO
                               ,recT_JOB_ODR.JOB_ODR_CANCEL_NO
                               ,recT_JOB_ODR.ITEM_CD);
        EXCEPTION
           WHEN OTHERS THEN
                vc2Comment := SUBSTR('02:OPEN curT_JOB_ODR_PJ'      ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
         END;
            

    	LOOP
            -- [���Ԏ󒍕R�t][�󒍖���][���v��]FETCH
            BEGIN
                FETCH curT_JOB_ODR_PJ  INTO recT_JOB_ODR_PJ;
            EXCEPTION
                WHEN OTHERS THEN
                    -- �J�[�\��FETCH���s
                    vc2Comment  := SUBSTR(' 02:FETCH curT_JOB_ODR_PJ'            ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
            
            -- ���i�\���J�[�\��END
            EXIT WHEN  curT_JOB_ODR_PJ%NOTFOUND;
   
            -- ������
            IF  recT_JOB_ODR_PJ.UNIT_QTY_TYP = 1 THEN                 --�݌ɐ��ʒP�ʋ敪=1(����)
                numCOMP_QTY     :=  CEIL(recT_JOB_ODR_PJ.ODR_ODR_QTY    *  (recT_JOB_ODR_PJ.TOTAL_RCV_QTY / recT_JOB_ODR_PJ.OD_ODR_QTY));
            ELSE
                numCOMP_QTY     :=  CEIL((recT_JOB_ODR_PJ.ODR_ODR_QTY   *  (recT_JOB_ODR_PJ.TOTAL_RCV_QTY / recT_JOB_ODR_PJ.OD_ODR_QTY)) * 10000) / 10000;
            END IF;
      
            -- �i����
            CASE
            WHEN recT_JOB_ODR.JOB_ODR_STS_TYP   =    9   THEN
                 --[���Ԍv��].�g���ԏ�ԋ敪�h�� 9:�����̎�
                numCOST_PROGRESS        :=  2;
            WHEN (numRs_COST_MATERIAL   <>  0) or (numRs_COST_PROCESS  <>  0) or (numRs_COST_OUTSOUCE   <>  0)   THEN
                --�u��������  �ޗ���vor�u��������  ���H��vor�u��������  �O����v��0��
                numCOST_PROGRESS        :=  1;
            ELSE
                numCOST_PROGRESS        :=  0;
            END CASE;
            
            -- ������
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                      numRs_COST_MATERIAL        /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)�[�������O�̒l
--                    4,                                  --(i)��������
                      0,                                  --(i)��������
                      numPjRoundTyp,                      --(i)�[�������敪
                      numCMP_COST_MATERIAL);              --(o)�[��������̒l
            IF  blnRet = FALSE THEN
                numCMP_COST_MATERIAL   :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                      numRs_COST_PROCESS         /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)�[�������O�̒l
--                    4,                                  --(i)��������
                      0,                                  --(i)��������
                      numPjRoundTyp,                      --(i)�[�������敪
                      numCMP_COST_PROCESS);              --(o)�[��������̒l
            IF  blnRet = FALSE THEN
                numCMP_COST_PROCESS    :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                      numRs_COST_OUTSOUCE        /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)�[�������O�̒l
--                    4,                                  --(i)��������
                      0,                                  --(i)��������
                      numPjRoundTyp,                      --(i)�[�������敪
                      numCMP_COST_OUTSOUCE);             --(o)�[��������̒l
            IF  blnRet = FALSE THEN
                numCMP_COST_OUTSOUCE   :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                     (numPl_COST_MATERIAL + numRs_COST_MATERIAL)       /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)�[�������O�̒l
--                    4,                                  --(i)��������
                      0,                                  --(i)��������
                      numPjRoundTyp,                      --(i)�[�������敪
                      numEXP_COST_MATERIAL);              --(o)�[��������̒l
            IF  blnRet = FALSE THEN
                numCMP_COST_MATERIAL   :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                     (numPl_COST_PROCESS + numRs_COST_PROCESS)        /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)�[�������O�̒l
--                    4,                                  --(i)��������
                      0,                                  --(i)��������
                      numPjRoundTyp,                      --(i)�[�������敪
                      numEXP_COST_PROCESS);              --(o)�[��������̒l
            IF  blnRet = FALSE THEN
                numCMP_COST_PROCESS    :=  0;
            END IF; 
            
            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                     (numPl_COST_OUTSOUCE  + numRs_COST_OUTSOUCE)        /  
                      recT_JOB_ODR.JOB_ODR_QTY   *  
                      recT_JOB_ODR_PJ.ODR_ODR_QTY,         --(i)�[�������O�̒l
--                    4,                                  --(i)��������
                      0,                                  --(i)��������
                      numPjRoundTyp,                      --(i)�[�������敪
                      numEXP_COST_OUTSOUCE);             --(o)�[��������̒l
            IF  blnRet = FALSE THEN
                numCMP_COST_OUTSOUCE   :=  0;
            END IF; 
            
            BEGIN
                INSERT INTO T_PJ_COST(
                        PROJECT_CD                --  1 �Č��ԍ�
                       ,ESTIMATE_NO               --  2 ���ϔԍ�
                       ,DETAL_NO                  --  3 ���הԍ�
                       ,TOTAL_DATE                --  4 �W�v����
                       ,ODR_NO                    --  5 �󒍔ԍ�
                       ,ITEM_CD                   --  6 �i�ڔԍ�
                       ,ODR_QTY                   --  7 �󒍐���
                       ,COMP_QTY                  --  8 ������
                       ,COST_PROGRESS             --  9 ��p�i��
                       ,CMP_COST_MATERIAL         -- 10 ��������  �ޗ���
                       ,CMP_COST_PROCESS          -- 11 ��������  ���H��
                       ,CMP_COST_OUTSOUCE         -- 12 ��������  �O����
                       ,CMP_COST_SERVICE          -- 13 ��������  �𖱔�
                       ,EXP_COST_MATERIAL         -- 14 ��������  �ޗ���
                       ,EXP_COST_PROCESS          -- 15 ��������  ���H��
                       ,EXP_COST_OUTSOUCE         -- 16 ��������  �O����
                       ,EXP_COST_SERVICE          -- 17 ��������  �𖱔�
                       ,CREATED_DATE              -- 22 �쐬��
                       ,CREATED_BY                -- 23 �쐬��
                       ,CREATED_PRG_NM            -- 24 �쐬�v���O������
                       ,UPDATED_DATE              -- 25 �X�V��
                       ,UPDATED_BY                -- 26 �X�V��
                       ,UPDATED_PRG_NM            -- 27 �X�V�v���O������
                       ,MODIFY_COUNT              -- 28 �X�V��
                ) VALUES (
                        recT_JOB_ODR_PJ.PROJECT_CD     --  1 �Č��ԍ�
                       ,recT_JOB_ODR_PJ.ESTIMATE_NO    --  2 ���ϔԍ�
                       ,recT_JOB_ODR_PJ.DETAL_NO       --  3 ���הԍ�
                       ,datTOTAL_DATE                  --  4 �W�v����
                       ,recT_JOB_ODR_PJ.ODR_NO         --  5 �󒍔ԍ�
                       ,recT_JOB_ODR.ITEM_CD           --  6 �i�ڔԍ�
                       ,recT_JOB_ODR_PJ.ODR_ODR_QTY    --  7 �󒍐���
                       ,numCOMP_QTY                    --  8 ������
                       ,numCOST_PROGRESS               --  9 ��p�i��
                       ,numCMP_COST_MATERIAL           -- 10 ��������  �ޗ���
                       ,numCMP_COST_PROCESS            -- 11 ��������  ���H��
                       ,numCMP_COST_OUTSOUCE           -- 12 ��������  �O����
                       ,0                              -- 13 ��������  �𖱔�
                       ,numEXP_COST_MATERIAL           -- 14 ��������  �ޗ���
                       ,numEXP_COST_PROCESS            -- 15 ��������  ���H��
                       ,numEXP_COST_OUTSOUCE           -- 16 ��������  �O����
                       ,0                              -- 17 ��������  �𖱔�
                       ,SYSDATE                        -- 22 �쐬��
                       ,pvc2UserId                     -- 23 �쐬��
                       ,pvc2BusinessName               -- 24 �쐬�v���O������
                       ,SYSDATE                        -- 25 �X�V��
                       ,pvc2UserId                     -- 26 �X�V��
                       ,pvc2BusinessName               -- 27 �X�V�v���O������
                       ,0);                            -- 28 �X�V��
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('12:INSERT T_PJ_COST'     ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;
            
        END LOOP;
        
        -- [���Ԏ󒍕R�t][�󒍖���][���v��]�J�[�\��CLOSE
        CLOSE curT_JOB_ODR_PJ;
        
    /* ���ς��𖱂̎� */
    WHEN recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   2     THEN

        -- �i����
        CASE
        WHEN recT_ODR_UNSTOCK.ODR_CMPLT_FLG   =    1   THEN
              --[���Ԍv��].�g���ԏ�ԋ敪�h�� 9:�����̎�
            numCOST_PROGRESS        :=  2;
        WHEN (numRs_COST_SERVICE   <>  0) THEN
            --�u��������  �𖱔�v
            numCOST_PROGRESS        :=  1;
        ELSE
            numCOST_PROGRESS        :=  0;
        END CASE;

        BEGIN
            INSERT INTO T_PJ_COST(
                    PROJECT_CD                --  1 �Č��ԍ�
                   ,ESTIMATE_NO               --  2 ���ϔԍ�
                   ,DETAL_NO                  --  3 ���הԍ�
                   ,TOTAL_DATE                --  4 �W�v����
                   ,ODR_NO                    --  5 �󒍔ԍ�
                   ,ITEM_CD                   --  6 �i�ڔԍ�
                   ,ODR_QTY                   --  7 �󒍐���
                   ,COMP_QTY                  --  8 ������
                   ,COST_PROGRESS             --  9 ��p�i��
                   ,CMP_COST_MATERIAL         -- 10 ��������  �ޗ���
                   ,CMP_COST_PROCESS          -- 11 ��������  ���H��
                   ,CMP_COST_OUTSOUCE         -- 12 ��������  �O����
                   ,CMP_COST_SERVICE          -- 13 ��������  �𖱔�
                   ,EXP_COST_MATERIAL         -- 14 ��������  �ޗ���
                   ,EXP_COST_PROCESS          -- 15 ��������  ���H��
                   ,EXP_COST_OUTSOUCE         -- 16 ��������  �O����
                   ,EXP_COST_SERVICE          -- 17 ��������  �𖱔�
                   ,CREATED_DATE              -- 22 �쐬��
                   ,CREATED_BY                -- 23 �쐬��
                   ,CREATED_PRG_NM            -- 24 �쐬�v���O������
                   ,UPDATED_DATE              -- 25 �X�V��
                   ,UPDATED_BY                -- 26 �X�V��
                   ,UPDATED_PRG_NM            -- 27 �X�V�v���O������
                   ,MODIFY_COUNT              -- 28 �X�V��
            ) VALUES (
                    pvc2ProjectCd                              --  1 �Č��ԍ�
                   ,pvc2EstimateNo                             --  2 ���ϔԍ�
                   ,pvc2DetalNo                                --  3 ���הԍ�
                   ,datTOTAL_DATE                              --  4 �W�v����
                   ,pvc2OdrNO                                  --  5 �󒍔ԍ�
                   ,recT_ODR_UNSTOCK.ITEM_CD                   --  6 �i�ڔԍ�
                   ,recT_ODR_UNSTOCK.ODR_QTY                   --  7 �󒍐���
                   ,recT_ODR_UNSTOCK.ODR_QTY                   --  8 ������
                   ,numCOST_PROGRESS                           --  9 ��p�i��
                   ,0                                          -- 10 ��������  �ޗ���
                   ,0                                          -- 11 ��������  ���H��
                   ,0                                          -- 12 ��������  �O����
                   ,numRs_COST_SERVICE                         -- 13 ��������  �𖱔�
                   ,0                                          -- 14 ��������  �ޗ���
                   ,0                                          -- 15 ��������  ���H��
                   ,0                                          -- 16 ��������  �O����
                   ,numPl_COST_SERVICE  + numRs_COST_SERVICE   -- 17 ��������  �𖱔�
                   ,SYSDATE                                    -- 22 �쐬��
                   ,pvc2UserId                                 -- 23 �쐬��
                   ,pvc2BusinessName                           -- 24 �쐬�v���O������
                   ,SYSDATE                                    -- 25 �X�V��
                   ,pvc2UserId                                 -- 26 �X�V��
                   ,pvc2BusinessName                           -- 27 �X�V�v���O������
                   ,0);                                        -- 28 �X�V��
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR('12:INSERT T_PJ_COST'          ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE excOTHER_ERR;
        END;
    END CASE;

/*------------------------------------------------------------
'  �Č��i���X�V����
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    
    -- �o�^����[�Č��\�Z�Ϗ㖾��]�̍ŏ�ʕi����������
    BEGIN
        SELECT  /*+ RULE */
                ODR_STS_TYP
               ,DM_STS_TYP
        INTO    numODR_STS_TYP
               ,numDM_STS_TYP 
        FROM    T_PJ_BUDGET_DETAIL 
        WHERE   PJ_BUDGET_DETAIL_NO  = vc2PJBuDgetDetailNo
        AND     SEQNO                = 1
                ;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR(' 80:SELECT PJ_BUDGET_DETAIL'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
             RAISE;
    END;


    CASE
    /* ���ςɕR�t���i�ڂ�MRP�i�̎� */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (4 ,5 ,6 ,7))  THEN

        BEGIN
            SELECT  /*+ RULE */
                    CMP_COST_MATERIAL, CMP_COST_PROCESS,CMP_COST_OUTSOUCE, CMP_COST_SERVICE
                   ,EXP_COST_MATERIAL, EXP_COST_PROCESS,EXP_COST_OUTSOUCE, EXP_COST_SERVICE
            INTO    numCMP_COST_MATERIAL, numCMP_COST_PROCESS,numCMP_COST_OUTSOUCE, numCMP_COST_SERVICE
                   ,numEXP_COST_MATERIAL, numEXP_COST_PROCESS,numEXP_COST_OUTSOUCE, numEXP_COST_SERVICE
            FROM    T_PJ_COST 
            WHERE   PROJECT_CD        = pvc2ProjectCd
            AND     ESTIMATE_NO       = pvc2EstimateNo
            AND     DETAL_NO          = pvc2DetalNo
            AND     TOTAL_DATE        = datTOTAL_DATE
            ;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 80:SELECT PJ_BUDGET_DETAIL'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                DBMS_OUTPUT.PUT_LINE('---------->'|| vc2Comment);
                RAISE;
        END;

        IF  numDM_STS_TYP          =   9                       AND
            numCMP_COST_MATERIAL   =   numEXP_COST_MATERIAL    AND
            numEXP_COST_PROCESS    =   numEXP_COST_PROCESS     AND
            numCMP_COST_OUTSOUCE   =   numEXP_COST_OUTSOUCE    THEN

            -- �d����N�ԓ������̍X�V
            BEGIN
                UPDATE T_ESTIMATE_DETAL
                SET OD_COMP_FLG        = 1               
                  , UPDATED_DATE       = SYSDATE
                  , MODIFY_COUNT       = MODIFY_COUNT + 1
                WHERE PROJECT_CD       = pvc2ProjectCd 
                AND   ESTIMATE_NO      = pvc2EstimateNo
                AND   DETAL_NO         = pvc2DetalNo   
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR(' 80:UPDATE T_ESTIMATE_DETAL'          ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;

        END IF;
    /* ���ςɕR�t���i�ڂ����ԕi�̎� */
    WHEN (recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   1)  AND (recT_ODR_CTL.MRP_ODR_TYP IN  (1 ,2))  THEN
        -- [�Č��󒍕R�t]�J�[�\��OPEN
        BEGIN
           OPEN curT_ESTIMATE_DETAL_U(recT_JOB_ODR.JOB_ODR_CD
                               ,recT_JOB_ODR.JOB_ODR_DETAIL_NO
                               ,recT_JOB_ODR.JOB_ODR_CANCEL_NO
                               ,datTOTAL_DATE);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 80:OPEN curT_ESTIMATE_DETAL_U'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;
        
        LOOP
            -- [�Č��󒍕R�t]�̃J�[�\��FETCH
            BEGIN
                FETCH curT_ESTIMATE_DETAL_U  INTO recT_ESTIMATE_DETAL_U;
            EXCEPTION
                WHEN OTHERS THEN
                    -- �J�[�\��FETCH���s
                    vc2Comment  := SUBSTR(' 70:FETCH curT_ESTIMATE_DETAL_U'      ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
            END;
        
            -- [�Č��󒍕R�t]�J�[�\��END
            EXIT WHEN  curT_ESTIMATE_DETAL_U%NOTFOUND;
        
            IF  numODR_STS_TYP         =   9                       AND
                recT_ESTIMATE_DETAL_U.CMP_COST_MATERIAL   =   recT_ESTIMATE_DETAL_U.EXP_COST_MATERIAL    AND
                recT_ESTIMATE_DETAL_U.CMP_COST_PROCESS    =   recT_ESTIMATE_DETAL_U.EXP_COST_PROCESS     AND
                recT_ESTIMATE_DETAL_U.CMP_COST_OUTSOUCE   =   recT_ESTIMATE_DETAL_U.EXP_COST_OUTSOUCE    THEN
        
                -- �d����N�ԓ������̍X�V
                BEGIN
                    UPDATE T_ESTIMATE_DETAL
                    SET OD_COMP_FLG        = 1               
                      , UPDATED_DATE       = SYSDATE
                      , MODIFY_COUNT       = MODIFY_COUNT + 1
                    WHERE PROJECT_CD       = recT_ESTIMATE_DETAL_U.PROJECT_CD 
                    AND   ESTIMATE_NO      = recT_ESTIMATE_DETAL_U.ESTIMATE_NO
                    AND   DETAL_NO         = recT_ESTIMATE_DETAL_U.DETAL_NO   
                    ;
                EXCEPTION
                    WHEN OTHERS THEN
                        vc2Comment := SUBSTR(' 80:UPDATE T_ESTIMATE_DETAL'          ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1,256);
                        RAISE excOTHER_ERR;
                END;
            END IF;
        END LOOP;
    
        -- [�Č��󒍕R�t]]�J�[�\��CLOSE
        CLOSE curT_ESTIMATE_DETAL_U;


    /* ���ς��𖱂̎� */
    WHEN recT_PJ_ODR_ALC.ESTIMATE_TYPE  =   2     THEN
        
        BEGIN
            SELECT  /*+ RULE */
                    PC.CMP_COST_MATERIAL, PC.CMP_COST_PROCESS,PC.CMP_COST_OUTSOUCE, PC.CMP_COST_SERVICE
                   ,PC.EXP_COST_MATERIAL, PC.EXP_COST_PROCESS,PC.EXP_COST_OUTSOUCE, PC.EXP_COST_SERVICE
            INTO    numCMP_COST_MATERIAL, numCMP_COST_PROCESS,numCMP_COST_OUTSOUCE, numCMP_COST_SERVICE
                   ,numEXP_COST_MATERIAL, numEXP_COST_PROCESS,numEXP_COST_OUTSOUCE, numEXP_COST_SERVICE
            FROM    T_PJ_COST PC
            WHERE   PC.PROJECT_CD        = pvc2ProjectCd
            AND     PC.ESTIMATE_NO       = pvc2EstimateNo
            AND     PC.DETAL_NO          = pvc2DetalNo
            AND     PC.TOTAL_DATE        = datTOTAL_DATE
            ;
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 80:SELECT PJ_BUDGET_DETAIL'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
                RAISE;
        END;

        IF  numCMP_COST_SERVICE   =   numEXP_COST_SERVICE    THEN

            -- �d����N�ԓ������̍X�V
            BEGIN
                UPDATE T_ESTIMATE_DETAL
                SET OD_COMP_FLG        = 1               
                  , UPDATED_DATE       = SYSDATE
                  , MODIFY_COUNT       = MODIFY_COUNT + 1
                WHERE PROJECT_CD       = pvc2ProjectCd 
                AND   ESTIMATE_NO      = pvc2EstimateNo
                AND   DETAL_NO         = pvc2DetalNo   
                ;
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR(' 80:UPDATE T_ESTIMATE_DETAL'          ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE excOTHER_ERR;
            END;

        END IF;
    END CASE;

    <<EXT00080A>>
    --NULL;
/*------------------------------------------------------------
'  �C������
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'----------'||TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    CASE  
    WHEN  numErrorCnt = 0 THEN 
          vc2Comment   :=  '����I��'   ;  
          pnumReturn   :=  STATUS_NORMAL;     -- 1:����I��
    WHEN  numErrorCnt > 0 THEN 
          vc2Comment   :=  '�x������'        ;  
          pnumReturn   :=  STATUS_WARNING;     -- 2:�x��
    ELSE
          vc2Comment   :=  '�ُ�I��'        ;  
          pnumReturn   :=  STATUS_ERROR;       -- 3:�ُ�I��
    END CASE;

    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    COMMIT;

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �C�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    
--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr  THEN    --�ŗL�̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excParameterErr');
        --ROLLBACK;
        
        IF  vc2ErrorCD   IS NULL   THEN
            vc2ErrorCD   :=  APS_COM_ParameterErr;
            -- �I�����b�Z�[�W�̍쐬
            vc2Comment := SUBSTR(LOGMSG_PARAM || ' PROJECT_CD=' || pvc2ProjectCd 
                                              || ' ESTIMATE_NO=' || pvc2EstimateNo 
                                              || ' DETAL_NO=' || pvc2DetalNo
                                              || ' �󒍔ԍ�=' || pvc2OdrNO
                                              || ' �����敪=' || pnumFlag,
                                 1,256);
        END IF;
        
        -- �Č��\�Z�Ϗグ�G���[�o�^
        blnRet :=  SubFncInsBudgetError('');

        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_PARAM || vc2TraceComment);

        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);
        
        /* �R�~�b�g */
        COMMIT;

        /* �ُ�I�� */
        pnumReturn := STATUS_ERROR;

        RETURN;

    WHEN excParamWarning THEN         --�\�Z�Ϗグ�������o���Ȃ���ԁ[
        -- ���[���o�b�N
        --ROLLBACK;
        
        -- �Č��\�Z�Ϗグ�G���[�o�^
        blnRet :=  SubFncInsBudgetError('');
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, vc2TraceComment);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* �R�~�b�g */
        COMMIT;

        /* �ُ�I�� */
        pnumReturn := STATUS_WARNING;
        RETURN;

    WHEN excOTHER_ERR THEN         --�\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��G���[
        -- ���[���o�b�N
        --ROLLBACK;
        
        -- �Č��\�Z�Ϗグ�G���[�o�^
        blnRet :=  SubFncInsBudgetError('');
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, vc2TraceComment);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* �R�~�b�g */
        COMMIT;

        /* �ُ�I�� */
        pnumReturn := STATUS_ERROR;

        RETURN;

    WHEN excMasterErr THEN         --�J�[�\���G���[
        -- ���[���o�b�N
        --ROLLBACK;

        -- �J�[�\���̃N���[�Y����
        --�̔��\����{�\�Z�J�[�\��
        IF curT_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curT_PJ_BUDGET_DETAIL;
        END IF;
        
        /* �Ɩ����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM, vc2Comment);
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* �R�~�b�g */
        COMMIT;

        /* �ُ�I�� */
        pnumReturn := STATUS_ERROR;

    WHEN excGetNewPjOdNo THEN         --�\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��G���[
        -- ���[���o�b�N
        --ROLLBACK;

        -- �J�[�\���̃N���[�Y����
        --�̔��\����{�\�Z�J�[�\��
        IF curT_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curT_PJ_BUDGET_DETAIL;
        END IF;
        
        /* �Ɩ����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO, vc2Comment);
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* �R�~�b�g */
        COMMIT;

        /* �ُ�I�� */
        pnumReturn := STATUS_ERROR;

    WHEN excFncTraceLog THEN
        --ROLLBACK;
        pnumReturn := STATUS_ERROR;
     
    WHEN OTHERS THEN   --���̑��̃G���[
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* ���[���o�b�N */
        ROLLBACK;
        
        /* �ُ�I�� */
        pnumReturn := STATUS_ERROR;
END;
/
