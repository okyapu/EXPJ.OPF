CREATE OR REPLACE FUNCTION FNCPJSUBPLUSSTOCKMAKE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2014.04.15 ����
'
' �@�\      : �Č��\�Z�]��݌ɕi�쐬����
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
'             cv2PjBudgetDetailNo  - (i)�Č��\�Z�Ϗ㖾�הԍ�
'             pvc2Seqno            - (i)SEQNO
'             pvc2AlcdQty          - (i)������
'             pvc2ErrorCd          - (o)�G���[�R�[�h
'
' �@�\����  : �Č��\�Z�]��݌ɕi�쐬�����B
'           : �Č��\�Z�Ϗグ�����ŐϏグ���s���ׂ�[�Č��\�Z�Ϗ㖾��]��
'           : �Ďw���z�̕i�ڔԍ��z���̍\���W�J���s���o�^����B
'
' ���l      : �e�i�ڎ�z�̗\�Z���z��c������ׂɁA���ԍŏ�ʕi�ڂ����
'           : ��z���ɑ΂���K�v�������߂�
'
'
------------------------------------------------------------------------------*/
    pFileHandle            IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode            IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId             IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2            --�H��R�[�h
   ,pcv2PjBudgetDetailNo   IN  VARCHAR2            --�Č��\�Z�Ϗ㖾�הԍ�
   ,pvc2Seqno              IN  NUMBER              --SEQNO
   ,pvc2AlcdQty            IN  NUMBER              --������
   ,pvc2ErrorCd            OUT VARCHAR2            --�G���[�R�[�h
) RETURN BOOLEAN
IS
PRAGMA AUTONOMOUS_TRANSACTION;

-- �J�[�\���̐錾
    -- �Č��\�Z����(�W�J��)
    CURSOR curFST_PJ_BUDGET_DETAIL(
                  cv2PjBudgetDetailNo  VARCHAR
                 ,numSeqno             NUMBER
    )
    IS
        SELECT /*+ RULE */
               PJ.PJ_BUDGET_DETAIL_NO           -- �Č��\�Z�Ϗ㖾�הԍ�
              ,PJ.SEQNO                         -- SEQNO
              ,PJ.OD_NO                         -- �I�[�_�f�}���h�ԍ�
              ,PJ.PROJECT_CD                    -- �Č��ԍ�
              ,PJ.ESTIMATE_NO                   -- ���ϔԍ�
              ,PJ.DETAL_NO                      -- ���הԍ�
              ,PJ.ODR_NO                        -- �󒍔ԍ�
              ,PJ.ESTIMATE_TYPE                 -- ��z�i�ڎ�
              ,PJ.ODR_ACPT_DATE                 -- �󒍓�
              ,PJ.PLANT_CD                      -- �H��R�[�h
              ,PJ.JOB_ODR_CD                    -- ����
              ,PJ.JOB_ODR_DETAIL_NO             -- ���Ԏ}��
              ,PJ.JOB_ODR_CANCEL_NO             -- ���Ԏ�������ԍ�
              ,PJ.ROOT_ITEM_CD                  -- �ŏ�ʕi�ڔԍ�
              ,PJ.PARENT_ITEM_CD                -- �e�i�ڔԍ�
              ,PJ.ITEM_CD                       -- �i�ڔԍ�
              ,PJ.DUE_DATE                      -- �v���[��
              ,PJ.ODR_START_DATE                -- ��z�����
              ,PJ.PRD_DUE_DATE                  -- �����[��
              ,PJ.PRD_START_DATE                -- ���������
              ,IT.MRP_ODR_TYP                   -- �i�ڎ�z�敪
              ,PJ.OUTSIDE_TYP                   -- ���v�ʓ��O��敪
              ,IT.PRODUCT_TYP                   -- ���i�敪
              ,IT.UNIT_QTY_TYP                  -- �݌ɐ��P�ʋ敪
              ,PJ.PS_UNIT_QTY                   -- ���i�\���P�ʐ�
              ,PJ.PS_UNIT_DENOMINATOR           -- ���i�\���P�ʐ�����
              ,PJ.PS_UNIT_NUMERATOR             -- ���i�\���P�ʐ����q
              ,PJ.OD_LEVEL_NO                   -- ���v�ʃ��x���ԍ�
              ,PJ.PARENT_SEQNO                  -- �eSEQNO
              ,PJ.ITEM_SPOIL                    -- ���v�ʕi�ڎd����
              ,PJ.PS_SPOIL                      -- ���v�ʍ\���d����
              ,PJ.CONS_TYP                      -- �\���x���敪
              ,PJ.PS_INPUT_RATIO                -- �\���d�������W��
              ,PJ.ITEM_INPUT_RATIO              -- �i�ڎd�������W��
              ,PJ.DMY_ITEM_FLG                  -- �[���i�ڃt���O
              ,PJ.VOLUNT_SPL_FLG                -- �����󋋕i�t���O
              ,PJ.COST_UP_TYP                   -- �����Ϗ�敪
              ,PJ.ONEROUS_CONS_FLG              -- �L���x���i�t���O
              ,PJ.BUDGET_STACK_TYP              -- �\�Z�Ϗグ�敪
        FROM   T_PJ_BUDGET_DETAIL PJ,
               M_ITEM             IT
        WHERE  PJ.PJ_BUDGET_DETAIL_NO     = cv2PjBudgetDetailNo
        AND    PJ.SEQNO                   = numSeqno
        AND    PJ.ITEM_CD                 = IT.ITEM_CD;

    -- ROWTYPE �̐錾
    recFST_PJ_BUDGET_DETAIL  curFST_PJ_BUDGET_DETAIL%ROWTYPE;
    
    -- �Č��\�Z����(�K�w���x��)
    CURSOR curLVL_PJ_BUDGET_DETAIL(
               cvc2PJ_BUDGET_DETAIL_NO  IN VARCHAR2     -- �Č��\�Z�Ϗ㖾�הԍ�
             , cvc2ORG_OD_NO            IN VARCHAR2     -- ���I�[�_�f�}���h�ԍ� 
             , cvc2OD_LEVEL_NO          IN NUMBER       -- ���v�ʃ��x���ԍ�
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
        WHERE  PJ_BUDGET_DETAIL_NO     =  cvc2PJ_BUDGET_DETAIL_NO   -- �W�J����[�Č��\�Z�Ϗ㖾��].�g�Č��\�Z�Ϗ㖾�הԍ��h
        AND    ORG_OD_NO               =  cvc2ORG_OD_NO             -- ����.�g�I�[�_�f�}���h�ԍ��h
        AND    OD_TYP                  <> 3                         -- �I�[�_�f�}���h�敪
        AND    ALC_STOCK_TYP           =  1                         -- �݌Ɉ����敪 (1:�i�ڍ݌�)
        AND    OD_LEVEL_NO             =  cvc2OD_LEVEL_NO           -- ���v�ʃ��x���ԍ�
        ;
    -- ROWTYPE �̐錾
    recLVL_PJ_BUDGET_DETAIL  curLVL_PJ_BUDGET_DETAIL%ROWTYPE;
    
    -- �\��(�e�i�ڂ���̃V���O�����W�J�p)
    CURSOR curM_PS(
               cvc2ParentItemCd      IN VARCHAR2      -- �e�i�ڔԍ� 
             , cvc2Eff_Phase_Date    IN DATE          -- ��� 
    )
    IS
        SELECT /*+ RULE */
               PS.PARENT_ITEM_CD                -- �e�i�ڔԍ�
              ,PS.COMP_ITEM_CD                  -- �q�i�ڔԍ�
              ,PS.PS_EDITION                    -- ���i�\���Ő�
              ,PS.PS_UNIT_DENOMINATOR           -- ���i�\���P�ʐ�����
              ,PS.PS_UNIT_NUMERATOR             -- ���i�\���P�ʐ����q
              ,PS.EFF_PHASE_IN_DATE             -- ���i�\���L���J�n��
              ,PS.EFF_PHASE_OUT_DATE            -- ���i�\���L���I����
              ,PS.PS_SPOIL                      -- �\���d����
              ,PS.CONS_TYP                      -- �x���敪
              ,PS.PS_REF_NO                     -- ���i�\���Ɖ�L�[
              ,PS.COST_UP_TYP                   -- �����Ϗ�敪
              ,PS.MRP_EXP_TYP                   -- ���v�ʓW�J�敪
              ,IT.OUTSIDE_TYP                   -- ���v�ʓ��O��敪
              ,IT.MRP_ODR_TYP                   -- �i�ڎ�z�敪
              ,IT.PRODUCT_TYP                   -- ���i�敪
              ,IT.UNIT_QTY_TYP                  -- �݌ɐ��P�ʋ敪
              ,IT.SPL_ITEM_TYP                  -- �󋋕i�敪
              ,IT.ITEM_SPOIL                    -- �i�ڎd����
        FROM   M_PS    PS
              ,M_ITEM  IT
        WHERE  PS.PARENT_ITEM_CD      =  cvc2ParentItemCd   -- �e�i�ڔԍ�
        AND    PS.MRP_EXP_TYP         =  1                  -- ���v�ʓW�J�敪
        AND    PS.EFF_PHASE_IN_DATE   <= cvc2Eff_Phase_Date -- ���i�\���L���J�n��
        AND    PS.EFF_PHASE_OUT_DATE  >= cvc2Eff_Phase_Date -- ���i�\���L���J�n��
        AND    IT.ITEM_CD             =  PS.COMP_ITEM_CD
        ORDER  BY PS.COMP_ITEM_CD ASC,PS_EDITION ASC
            ;
    -- ROWTYPE �̐錾
    recM_PS     curM_PS%ROWTYPE;

/* �萔�̐錾 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncPjSubplusStockMake';      --�o�k�^�r�p�k��
    
    
/* �ϐ��̐錾 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- �t�@�C���n���h��
    blnRet                  BOOLEAN;            -- �֐��߂�l
    intRet                  INTEGER;            -- �֐��߂�l
    vc2Comment              VARCHAR2(1024);     -- ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);     -- ���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2TraceComment         VARCHAR2(1024);     -- �g���[�[�X�o�͗p�R�����g�쐬��Ɨ̈�i���̓p�����[�^�L�^�p�j
    numMaxSeqNO             NUMBER(6);          -- SEQNO
    numPsUnitQty            NUMBER(22,8);       -- ���ʃ��[�N
    numTgtCnt               NUMBER := 0;        -- �Ώی���
    numOd_Level_No          NUMBER(6);          -- �K�w���x��
    datDue_Date             DATE;               -- ���
    vc2NewOd_No             VARCHAR2(100);      -- �\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ�
    
    numOD_TYP               T_PJ_BUDGET_DETAIL.OD_TYP%TYPE;            -- �I�[�_�f�}���h�敪
    numDM_QTY               T_PJ_BUDGET_DETAIL.DM_QTY%TYPE;            -- �f�}���h��
    numODR_QTY              T_PJ_BUDGET_DETAIL.ODR_QTY%TYPE;            -- �I�[�_��
    numPS_UNIT_QTY          T_PJ_BUDGET_DETAIL.PS_UNIT_QTY%TYPE;       -- ���i�\���P�ʐ�
    numDMY_ITEM_FLG         T_PJ_BUDGET_DETAIL.DMY_ITEM_FLG%TYPE;      -- �[���i�ڃt���O
    numVOLUNT_SPL_FLG       T_PJ_BUDGET_DETAIL.VOLUNT_SPL_FLG%TYPE;    -- �����󋋕i�t���O
    numPS_INPUT_RATIO       T_PJ_BUDGET_DETAIL.PS_INPUT_RATIO%TYPE;    -- �\���d�������W��
    numITEM_INPUT_RATIO     T_PJ_BUDGET_DETAIL.ITEM_INPUT_RATIO%TYPE;  -- �i�ڎd�������W��
    
/*�v�Z�p���[�N*/
    numSave                 NUMBER(25);
    intCount                INTEGER(11);
    intCount2               INTEGER(11);

/*�G���[�p���[�N*/
    vc2TmpMessage           VARCHAR2(1024);       --�k�n�f���b�Z�[�W

-- MESSAGE �̐錾
    APS_COM_ParameterErr                VARCHAR2(28)   := 'ZZ09022';    -- �����G���[
    APS_COM_NOTEXIST_PJ_BUDGET_DTL      VARCHAR2(28)   := 'KM00043';     --���Ԉ�������Č��\�Z�Ϗ㖾�ׂ����݂��܂���
    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'KM00042';    -- �Č��\�Z�Ϗ㏈���ɂĒv���I�G���[���������܂����B
    
    -- ��O�̐錾
    excFncTraceLog                      EXCEPTION;    --�g���[�X���O�o�̓G���[
    excParameterErr                     EXCEPTION;    --�u�����v�G���[
    excGetNewPjOdNo                     EXCEPTION;    --�\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��G���[
    excOTHER_ERR                        EXCEPTION;    --�\�Z�Ϗグ�p�I�[�_�f�}���ht�o�^�G���[

    -- LOG �̐錾
    LOGMSG_START                        VARCHAR2(20)   := 'Start';      -- ���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';        -- ���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    LOGMSG_PARAM                        VARCHAR2(64)   := '���̓p�����[�^�F';
    LOGMSG_NEWODRNO                     VARCHAR2(152)  := '�\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��擾���s';
    LOGMSG_FATALCNT                     VARCHAR2(40)   := '�ُ팏���F';
    LOGMSG_BRACKETS                     VARCHAR2(4)    := '[';
    LOGMSG_BRACKETE                     VARCHAR2(4)    := ']';
    LOGMSG_COMMA                        VARCHAR2(4)    := ',';

--<���C������ >-----------------------------------------------------
BEGIN
DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    vc2RunChkComment := NULL;
    
    /* TraceLog �̏o�� */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                           MY_SQL_NAME, LOGMSG_START);

    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;
/*------------------------------------------------------------
'�@�W�J�����擾
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �Č��\�Z�Ϗ㖾�׃J�[�\��OPEN
    BEGIN
        OPEN curFST_PJ_BUDGET_DETAIL(pcv2PjBudgetDetailNo,pvc2Seqno);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR(' 10:OPEN curFST_PJ_BUDGET_DETAIL'      ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                 1,256);
            RAISE excParameterErr;
    END;

    -- �Č��\�Z�Ϗ㖾�׃J�[�\��FETCH
    BEGIN
        FETCH curFST_PJ_BUDGET_DETAIL INTO recFST_PJ_BUDGET_DETAIL;
    EXCEPTION
        WHEN OTHERS THEN
            -- �J�[�\��FETCH���s
            vc2Comment  := SUBSTR(' 02:FETCH curFST_PJ_BUDGET_DETAIL'    ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                  1,256);
            RAISE excParameterErr;
    END;
    
    IF curFST_PJ_BUDGET_DETAIL%NOTFOUND THEN
       RAISE excParameterErr;
    END IF;
    
    -- �ő�SEQNO�擾
    BEGIN
        SELECT MAX(SEQNO)    INTO numMaxSeqNO
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO         =  recFST_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE;
    END;

    -- �W�J���̏��̃Z�b�g
    numOd_Level_No          :=  recFST_PJ_BUDGET_DETAIL.OD_LEVEL_NO;    -- �K�w���x��
    datDue_Date             :=  recFST_PJ_BUDGET_DETAIL.DUE_DATE;       -- �v���[��
    

    vc2TmpMessage :=  '�K�w���x��:' || numOd_Level_No ||
                      '�v���[��  :' || to_char(datDue_Date, 'YYYYMMDD');

/*------------------------------------------------------------
'�@�]��݌ɍݏ�ʕi�o�^
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��擾
    blnRet := FncGetNewPjOdNo(pFileHandle
                              ,pvc2LogMode
                              ,pvc2OutputMode
                              ,pvc2UserId
                              ,pvc2BusinessName
                              ,pvc2PlantCd
                              ,vc2NewOd_No
                              );
    IF blnRet = FALSE THEN
        RAISE excGetNewPjOdNo;
    END IF;

    -- SEQNO �J�E���g�A�b�v
    numMaxSeqNO    :=  numMaxSeqNO +   1;
    

    BEGIN
        -- �Č��\�Z�Ϗ㖾�ׂ̓o�^
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
               ,ODR_COST_MATERIAL           -- 44 ��z�c�@�ޗ���
               ,ODR_COST_PROCESS            -- 45 ��z�c�@���H��
               ,ODR_COST_OUTSOUCE           -- 46 ��z�c�@�O����
               ,ODR_COST_SERVICE            -- 47 ��z�c�@�𖱔�
               ,CMP_COST_MATERIAL           -- 48 �������с@�ޗ���
               ,CMP_COST_PROCESS            -- 49 �������с@���H��
               ,CMP_COST_OUTSOUCE           -- 50 �������с@�O����
               ,CMP_COST_SERVICE            -- 51 �������с@�𖱔�
               ,EXP_COST_MATERIAL           -- 52 ���������@�ޗ���
               ,EXP_COST_PROCESS            -- 53 ���������@���H��
               ,EXP_COST_OUTSOUCE           -- 54 ���������@�O����
               ,EXP_COST_SERVICE            -- 55 ���������@�𖱔�
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
                recFST_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO    --  1 �Č��\�Z�Ϗ㖾�הԍ�
               ,numMaxSeqNO                                    --  2 SEQNO
               ,vc2NewOd_No                                    --  3 �I�[�_�f�}���h�ԍ�
               ,recFST_PJ_BUDGET_DETAIL.PROJECT_CD             --  4 �Č��ԍ�
               ,recFST_PJ_BUDGET_DETAIL.ESTIMATE_NO            --  5 ���ϔԍ�
               ,recFST_PJ_BUDGET_DETAIL.DETAL_NO               --  6 ���הԍ�
               ,recFST_PJ_BUDGET_DETAIL.ODR_NO                 --  7 �󒍔ԍ�
               ,recFST_PJ_BUDGET_DETAIL.ESTIMATE_TYPE          --  8 ��z�i�ڎ�
               ,recFST_PJ_BUDGET_DETAIL.ODR_ACPT_DATE          --  9 �󒍓�
               ,recFST_PJ_BUDGET_DETAIL.PLANT_CD               -- 10 �H��R�[�h
               ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_CD             -- 11 ����
               ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_DETAIL_NO      -- 12 ���Ԏ}��
               ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_CANCEL_NO      -- 13 ���Ԏ�������ԍ�
               ,recFST_PJ_BUDGET_DETAIL.ROOT_ITEM_CD           -- 14 �ŏ�ʕi�ڔԍ�
               ,recFST_PJ_BUDGET_DETAIL.PARENT_ITEM_CD         -- 15 �e�i�ڔԍ�
               ,recFST_PJ_BUDGET_DETAIL.ITEM_CD                -- 16 �i�ڔԍ�
               ,9                                              -- 17 �I�[�_��ԋ敪
               ,0                                              -- 18 �f�}���h��ԋ敪
               ,2                                              -- 19 �I�[�_�f�}���h�敪
               ,recFST_PJ_BUDGET_DETAIL.DUE_DATE               -- 20 �v���[��
               ,recFST_PJ_BUDGET_DETAIL.ODR_START_DATE         -- 21 ��z�����
               ,recFST_PJ_BUDGET_DETAIL.PRD_DUE_DATE           -- 22 �����[��
               ,recFST_PJ_BUDGET_DETAIL.PRD_START_DATE         -- 23 ���������
               ,0                                              -- 24 �f�}���h��
               ,pvc2AlcdQty                                    -- 25 �I�[�_��
               ,recFST_PJ_BUDGET_DETAIL.MRP_ODR_TYP            -- 26 �i�ڎ�z�敪
               ,recFST_PJ_BUDGET_DETAIL.OUTSIDE_TYP            -- 27 ���v�ʓ��O��敪
               ,recFST_PJ_BUDGET_DETAIL.PRODUCT_TYP            -- 28 ���i�敪
               ,recFST_PJ_BUDGET_DETAIL.UNIT_QTY_TYP           -- 29 �݌ɐ��P�ʋ敪
               ,recFST_PJ_BUDGET_DETAIL.PS_UNIT_QTY            -- 30 ���i�\���P�ʐ�
               ,recFST_PJ_BUDGET_DETAIL.PS_UNIT_DENOMINATOR    -- 31 ���i�\���P�ʐ�����
               ,recFST_PJ_BUDGET_DETAIL.PS_UNIT_NUMERATOR      -- 32 ���i�\���P�ʐ����q
               ,0                                              -- 33 ���ɗ݌v��
               ,0                                              -- 34 �o�ɗ݌v��
               ,numOd_Level_No                                 -- 35 ���v�ʃ��x���ԍ�
               ,recFST_PJ_BUDGET_DETAIL.PARENT_SEQNO           -- 36 �eSEQNO
               ,recFST_PJ_BUDGET_DETAIL.ITEM_SPOIL             -- 37 ���v�ʕi�ڎd����
               ,recFST_PJ_BUDGET_DETAIL.PS_SPOIL               -- 38 ���v�ʍ\���d����
               ,recFST_PJ_BUDGET_DETAIL.CONS_TYP               -- 39 �\���x���敪
               ,pvc2AlcdQty                                    -- 40 �K�v���v��
               ,recFST_PJ_BUDGET_DETAIL.PS_INPUT_RATIO         -- 41 �\���d�������W��
               ,recFST_PJ_BUDGET_DETAIL.ITEM_INPUT_RATIO       -- 42 �i�ڎd�������W��
               ,null                                           -- 43 �����R�[�h
               ,0                                              -- 44 ��z�c�@�ޗ���
               ,0                                              -- 45 ��z�c�@���H��
               ,0                                              -- 46 ��z�c�@�O����
               ,0                                              -- 47 ��z�c�@�𖱔�
               ,0                                              -- 48 �������с@�ޗ���
               ,0                                              -- 49 �������с@���H��
               ,0                                              -- 50 �������с@�O����
               ,0                                              -- 51 �������с@�𖱔�
               ,0                                              -- 52 ���������@�ޗ���
               ,0                                              -- 53 ���������@���H��
               ,0                                              -- 54 ���������@�O����
               ,0                                              -- 55 ���������@�𖱔�
               ,recFST_PJ_BUDGET_DETAIL.DMY_ITEM_FLG           -- 56 �[���i�ڃt���O
               ,recFST_PJ_BUDGET_DETAIL.VOLUNT_SPL_FLG         -- 57 �����󋋕i�t���O
               ,recFST_PJ_BUDGET_DETAIL.COST_UP_TYP            -- 58 �����Ϗ�敪
               ,recFST_PJ_BUDGET_DETAIL.ONEROUS_CONS_FLG       -- 59 �L���x���i�t���O
               ,recFST_PJ_BUDGET_DETAIL.BUDGET_STACK_TYP       -- 60 �\�Z�Ϗグ�敪
               ,1                                              -- 61 �I�[�_�����σt���O
               ,recFST_PJ_BUDGET_DETAIL.OD_NO                  -- 62 ���I�[�_�f�}���h�ԍ�
               ,null                                           -- 63 ������
               ,0                                              -- 64 �����Ԏ}��
               ,0                                              -- 65 ���I�[�_��
               ,null                                           -- 66 ���o�ɔ����敪
               ,0                                              -- 67 �����݌ɗL���t���O
               ,0                                              -- 68 �݌Ɉ������v�ʓW�J�敪
               ,1                                              -- 69 �����݌ɋ敪
               ,1                                              -- 70 �����݌ɋ旦
               ,SYSDATE                                        -- 71 �쐬��
               ,pvc2UserId                                     -- 72 �쐬��
               ,'FNCPJSUBPLUSSTOCKMAKE'                        -- 73 �쐬�v���O������
               ,SYSDATE                                        -- 74 �X�V��
               ,pvc2UserId                                     -- 75 �X�V��
               ,'FNCPJSUBPLUSSTOCKMAKE'                        -- 76 �X�V�v���O������
               ,0);                                            -- 77 �X�V��
        
        
    EXCEPTION
        WHEN OTHERS THEN
            -- �Č��\�Z�Ϗ㖾�׎��s
            vc2Comment := SUBSTR('05:INSERT UT_PURCH_OPER_BUDGET'       ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                 1, 256);
            RAISE excOTHER_ERR;
    END;
    
/*------------------------------------------------------------
'�@�]��݌ɍݍ\���W�J���쐬
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    LOOP
        -- �Č��\�Z�Ϗ㖾�׃J�[�\��OPEN

        BEGIN
            OPEN curLVL_PJ_BUDGET_DETAIL(recFST_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO,recFST_PJ_BUDGET_DETAIL.OD_NO,numOd_Level_No);
        EXCEPTION
            WHEN OTHERS THEN
                vc2Comment := SUBSTR(' 30:OPEN recLVL_PJ_BUDGET_DETAIL'      ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1,256);
                RAISE;
        END;
        
        -- �Č��\�Z�Ϗ㖾�׃J�[�\��FETCH
        BEGIN
            FETCH curLVL_PJ_BUDGET_DETAIL INTO recLVL_PJ_BUDGET_DETAIL;
        EXCEPTION
            WHEN OTHERS THEN
                -- �J�[�\��FETCH���s
                vc2Comment  := SUBSTR(' 30:recLVL_PJ_BUDGET_DETAIL'    ||
                                      ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                      ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                      1,256);
                RAISE;
        END;
        
        -- �Č��\�Z�Ϗ㖾�׃J�[�\��
        EXIT WHEN  curLVL_PJ_BUDGET_DETAIL%NOTFOUND;
        
        
        -- ���x���ԍ��̃A�b�v
        numOd_Level_No          :=  numOd_Level_No + 1;    -- �K�w���x��
        
        
        LOOP        
        -- ���i�\���J�[�\��OPEN

            BEGIN
                OPEN curM_PS(recLVL_PJ_BUDGET_DETAIL.ITEM_CD,datDue_Date);
            EXCEPTION
                WHEN OTHERS THEN
                    vc2Comment := SUBSTR('01:OPEN recLVL_PJ_BUDGET_DETAIL'      ||
                                         ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                         ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                         1,256);
                    RAISE;
            END;
            

        	LOOP
                -- ���i�\���J�[�\��FETCH
                BEGIN
                    FETCH curM_PS  INTO recM_PS;
                EXCEPTION
                    WHEN OTHERS THEN
                        -- �J�[�\��FETCH���s
                        vc2Comment  := SUBSTR(' 02:curM_PS'       ||
                                              ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                              ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                              1,256);
                        RAISE;
                END;
            
                -- ���i�\���J�[�\��END
                EXIT WHEN  curM_PS%NOTFOUND;
                
                /* �\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��擾 */
                blnRet := FncGetNewPjOdNo(pFileHandle
                                          ,pvc2LogMode
                                          ,pvc2OutputMode
                                          ,pvc2UserId
                                          ,pvc2BusinessName
                                          ,pvc2PlantCd
                                          ,vc2NewOd_No
                                          );
                IF blnRet = FALSE THEN
                    RAISE excGetNewPjOdNo;
                END IF;
                
                -- SEQNO �J�E���g�A�b�v
                numMaxSeqNO    :=  numMaxSeqNO +   1;
    
                /*  �I�[�_�f�}���h�敪 */
                CASE
                WHEN recM_PS.MRP_ODR_TYP in (1 , 2) THEN 
                     numOD_TYP        :=  1;
                WHEN recM_PS.MRP_ODR_TYP in (4 , 5 , 6 , 7) THEN
                     numOD_TYP        :=  3;
                WHEN recM_PS.MRP_ODR_TYP = 8 THEN
                     numOD_TYP        :=  4;
                END CASE;
    
                /*  ���i�\���P�ʐ�,�f�}���h��,�I�[�_�� */
                IF recM_PS.UNIT_QTY_TYP = 1 THEN                 --�݌ɐ��ʒP�ʋ敪=1(����)
                   
                   /*  ���i�\���P�ʐ� */
                   numPS_UNIT_QTY := CEIL(recM_PS.PS_UNIT_NUMERATOR / recM_PS.PS_UNIT_DENOMINATOR);
                   
                   /*  �f�}���h�� */
                   numDM_QTY := CEIL(recLVL_PJ_BUDGET_DETAIL.NECESSARY_QTY *
                                    (1+ recM_PS.PS_SPOIL /100) *
                                    (recM_PS.PS_UNIT_NUMERATOR / recM_PS.PS_UNIT_DENOMINATOR));
                                    
                   /*  �I�[�_ */
                   numODR_QTY := CEIL(numDM_QTY * 
                                     (1 + recM_PS.ITEM_SPOIL / 100));
                ELSE
                   /*  ���i�\���P�ʐ� */
                   numPS_UNIT_QTY := CEIL((recM_PS.PS_UNIT_NUMERATOR / recM_PS.PS_UNIT_DENOMINATOR) * 10000) / 10000 ;
                   
                   /*  �f�}���h�� */
                   numDM_QTY := CEIL((recLVL_PJ_BUDGET_DETAIL.NECESSARY_QTY *
                                     (1+ recM_PS.PS_SPOIL /100) *
                                     (recM_PS.PS_UNIT_NUMERATOR / recM_PS.PS_UNIT_DENOMINATOR)) * 10000) / 10000 ;
                   
                   /*  �I�[�_ */
                   numODR_QTY := CEIL((numDM_QTY * 
                                      (1+ recM_PS.ITEM_SPOIL /100)) * 10000) / 10000 ;
                END IF;
                
                
                /*  �[���i�ڃt���O  */
                IF recM_PS.MRP_ODR_TYP = 8 THEN
                    numDMY_ITEM_FLG      := 1;
                ELSE
                    numDMY_ITEM_FLG      := 0;
                END IF;
                
                /*  �����󋋕i�t���O  */
                IF recM_PS.SPL_ITEM_TYP = 2 THEN
                    numVOLUNT_SPL_FLG      := 1;
                ELSE
                    numVOLUNT_SPL_FLG      := 0;
                END IF;
                
                /*  �\���d�������W��  */
                numPS_INPUT_RATIO           := CEIL((1+ recM_PS.PS_SPOIL /100) * 10000) / 10000 ;
                
                /*  �i�ڎd�������W��  */
                IF recM_PS.MRP_ODR_TYP = 8 THEN
                   numITEM_INPUT_RATIO         := CEIL(((1+ recM_PS.ITEM_SPOIL /100)) * 10000) / 10000 ;
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
                           ,ODR_COST_MATERIAL           -- 44 ��z�c�@�ޗ���
                           ,ODR_COST_PROCESS            -- 45 ��z�c�@���H��
                           ,ODR_COST_OUTSOUCE           -- 46 ��z�c�@�O����
                           ,ODR_COST_SERVICE            -- 47 ��z�c�@�𖱔�
                           ,CMP_COST_MATERIAL           -- 48 �������с@�ޗ���
                           ,CMP_COST_PROCESS            -- 49 �������с@���H��
                           ,CMP_COST_OUTSOUCE           -- 50 �������с@�O����
                           ,CMP_COST_SERVICE            -- 51 �������с@�𖱔�
                           ,EXP_COST_MATERIAL           -- 52 ���������@�ޗ���
                           ,EXP_COST_PROCESS            -- 53 ���������@���H��
                           ,EXP_COST_OUTSOUCE           -- 54 ���������@�O����
                           ,EXP_COST_SERVICE            -- 55 ���������@�𖱔�
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
                            recFST_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO    --  1 �Č��\�Z�Ϗ㖾�הԍ�
                           ,numMaxSeqNO                                    --  2 SEQNO
                           ,vc2NewOd_No                                    --  3 �I�[�_�f�}���h�ԍ�
                           ,recFST_PJ_BUDGET_DETAIL.PROJECT_CD             --  4 �Č��ԍ�
                           ,recFST_PJ_BUDGET_DETAIL.ESTIMATE_NO            --  5 ���ϔԍ�
                           ,recFST_PJ_BUDGET_DETAIL.DETAL_NO               --  6 ���הԍ�
                           ,recFST_PJ_BUDGET_DETAIL.ODR_NO                 --  7 �󒍔ԍ�
                           ,recFST_PJ_BUDGET_DETAIL.ESTIMATE_TYPE          --  8 ��z�i�ڎ�
                           ,recFST_PJ_BUDGET_DETAIL.ODR_ACPT_DATE          --  9 �󒍓�
                           ,recFST_PJ_BUDGET_DETAIL.PLANT_CD               -- 10 �H��R�[�h
                           ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_CD             -- 11 ����
                           ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_DETAIL_NO      -- 12 ���Ԏ}��
                           ,recFST_PJ_BUDGET_DETAIL.JOB_ODR_CANCEL_NO      -- 13 ���Ԏ�������ԍ�
                           ,recFST_PJ_BUDGET_DETAIL.ROOT_ITEM_CD           -- 14 �ŏ�ʕi�ڔԍ�
                           ,recM_PS.PARENT_ITEM_CD                         -- 15 �e�i�ڔԍ�
                           ,recM_PS.COMP_ITEM_CD                           -- 16 �i�ڔԍ�
                           ,9                                              -- 17 �I�[�_��ԋ敪
                           ,9                                              -- 18 �f�}���h��ԋ敪
                           ,numOD_TYP                                      -- 19 �I�[�_�f�}���h�敪
                           ,datDue_Date                                    -- 20 �v���[��
                           ,datDue_Date                                    -- 21 ��z�����
                           ,datDue_Date                                    -- 22 �����[��
                           ,datDue_Date                                    -- 23 ���������
                           ,numDM_QTY                                      -- 24 �f�}���h��
                           ,numODR_QTY                                     -- 25 �I�[�_��
                           ,recM_PS.MRP_ODR_TYP                            -- 26 �i�ڎ�z�敪
                           ,recM_PS.OUTSIDE_TYP                            -- 27 ���v�ʓ��O��敪
                           ,recM_PS.PRODUCT_TYP                            -- 28 ���i�敪
                           ,recM_PS.UNIT_QTY_TYP                           -- 29 �݌ɐ��P�ʋ敪
                           ,numPS_UNIT_QTY                                 -- 30 ���i�\���P�ʐ�
                           ,recM_PS.PS_UNIT_DENOMINATOR                    -- 31 ���i�\���P�ʐ�����
                           ,recM_PS.PS_UNIT_NUMERATOR                      -- 32 ���i�\���P�ʐ����q
                           ,0                                              -- 33 ���ɗ݌v��
                           ,0                                              -- 34 �o�ɗ݌v��
                           ,numOd_Level_No                                 -- 35 ���v�ʃ��x���ԍ�
                           ,recLVL_PJ_BUDGET_DETAIL.SEQNO                  -- 36 �e�I�[�_�f�}���h�ԍ�
                           ,recM_PS.ITEM_SPOIL                             -- 37 ���v�ʕi�ڎd����
                           ,recM_PS.PS_SPOIL                               -- 38 ���v�ʍ\���d����
                           ,recM_PS.CONS_TYP                               -- 39 �\���x���敪
                           ,numODR_QTY                                     -- 40 �K�v���v��
                           ,numPS_INPUT_RATIO                              -- 41 �\���d�������W��
                           ,numITEM_INPUT_RATIO                            -- 42 �i�ڎd�������W��
                           ,null                                           -- 43 �����R�[�h
                           ,0                                              -- 44 ��z�c�@�ޗ���
                           ,0                                              -- 45 ��z�c�@���H��
                           ,0                                              -- 46 ��z�c�@�O����
                           ,0                                              -- 47 ��z�c�@�𖱔�
                           ,0                                              -- 48 �������с@�ޗ���
                           ,0                                              -- 49 �������с@���H��
                           ,0                                              -- 50 �������с@�O����
                           ,0                                              -- 51 �������с@�𖱔�
                           ,0                                              -- 52 ���������@�ޗ���
                           ,0                                              -- 53 ���������@���H��
                           ,0                                              -- 54 ���������@�O����
                           ,0                                              -- 55 ���������@�𖱔�
                           ,numDMY_ITEM_FLG                                -- 56 �[���i�ڃt���O
                           ,numVOLUNT_SPL_FLG                              -- 57 �����󋋕i�t���O
                           ,recM_PS.COST_UP_TYP                            -- 58 �����Ϗ�敪
                           ,0                                              -- 59 �L���x���i�t���O
                           ,1                                              -- 60 �\�Z�Ϗグ�敪
                           ,1                                              -- 61 �I�[�_�����σt���O
                           ,recFST_PJ_BUDGET_DETAIL.OD_NO                  -- 62 ���I�[�_�f�}���h�ԍ�
                           ,null                                           -- 63 ������
                           ,0                                              -- 64 �����Ԏ}��
                           ,0                                              -- 65 ���I�[�_��
                           ,null                                           -- 66 ���o�ɔ����敪
                           ,0                                              -- 67 �����݌ɗL���t���O
                           ,0                                              -- 68 �݌Ɉ������v�ʓW�J�敪
                           ,1                                              -- 69 �����݌ɋ敪
                           ,1                                              -- 70 �����݌ɋ旦
                           ,SYSDATE                                        -- 71 �쐬��
                           ,pvc2UserId                                     -- 72 �쐬��
                           ,'FNCPJSUBPLUSSTOCKMAKE'                        -- 73 �쐬�v���O������
                           ,SYSDATE                                        -- 74 �X�V��
                           ,pvc2UserId                                     -- 75 �X�V��
                           ,'FNCPJSUBPLUSSTOCKMAKE'                        -- 76 �X�V�v���O������
                           ,0);                                            -- 77 �X�V��
                    
                    
                EXCEPTION
                    WHEN OTHERS THEN
                        -- �Č��\�Z�Ϗ㖾�׎��s
                        vc2Comment := SUBSTR('05:INSERT UT_PURCH_OPER_BUDGET'       ||
                                             ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                             ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                             1, 256);
                        RAISE excOTHER_ERR;
                END;
                
            END LOOP;

            -- �Č��\�Z�Ϗ㖾�׃J�[�\��CLOSE
            CLOSE curM_PS;


            -- �Č��\�Z�Ϗ㖾�׃J�[�\��FETCH
            BEGIN
                FETCH curLVL_PJ_BUDGET_DETAIL INTO recLVL_PJ_BUDGET_DETAIL;
            EXCEPTION
                WHEN OTHERS THEN
                    -- �J�[�\��FETCH���s
                    vc2Comment  := SUBSTR(' 02:recLVL_PJ_BUDGET_DETAIL'    ||
                                          ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                          ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                          1,256);
                    RAISE;
             END;
             -- ���i�\���J�[�\��END
             EXIT WHEN  curLVL_PJ_BUDGET_DETAIL%NOTFOUND;

        END LOOP;
        
        -- �Č��\�Z�Ϗ㖾�׃J�[�\��CLOSE
        CLOSE curLVL_PJ_BUDGET_DETAIL;
    
    END LOOP;

/*------------------------------------------------------------
'�@�C������
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �Č��\�Z�Ϗ㖾�׃J�[�\��CLOSE
    CLOSE curFST_PJ_BUDGET_DETAIL;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �C�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    COMMIT;
    RETURN TRUE;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN         --�J�[�\���G���[
        -- ���[���o�b�N
        --ROLLBACK;

        pvc2ErrorCd := APS_COM_NOTEXIST_PJ_BUDGET_DTL;
        -- �J�[�\���̃N���[�Y����
        -- �Č��\�Z����(�W�J��)�J�[�\��
        IF curFST_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curFST_PJ_BUDGET_DETAIL;
        END IF;
        -- �Č��\�Z����(�K�w���x��)
        IF curLVL_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curLVL_PJ_BUDGET_DETAIL;
        END IF;
        -- �\��(�e�i�ڂ���̃V���O�����W�J�p)
        IF curM_PS%ISOPEN = TRUE THEN
            CLOSE curM_PS;
        END IF;
        
        /* �Ɩ����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM, vc2Comment);
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM);

        /* LogFile �� CLOSE */
        --blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* �R�~�b�g */
        --COMMIT;

        /* �ُ�I�� */
        RETURN FALSE;

    WHEN excGetNewPjOdNo THEN         --�\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��G���[
        -- ���[���o�b�N
        ROLLBACK;

        pvc2ErrorCd := APS_COM_MISTAKE_NATIVE_PARAM;
        -- �J�[�\���̃N���[�Y����
        --�Č��\�Z����(�W�J��)�J�[�\��
        IF curFST_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curFST_PJ_BUDGET_DETAIL;
        END IF;
        
        /* �Ɩ����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO, vc2Comment);
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO);

        /* LogFile �� CLOSE */
        --blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* �R�~�b�g */
        --COMMIT;

        /* �ُ�I�� */
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        --ROLLBACK;
        RETURN FALSE;
     
    WHEN OTHERS THEN   --���̑��̃G���[
        /* �J�[�\���̃N���[�Y */
        -- �Č��\�Z����(�W�J��)�J�[�\��
        IF curFST_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curFST_PJ_BUDGET_DETAIL;
        END IF;
        -- �Č��\�Z����(�K�w���x��)
        IF curLVL_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curLVL_PJ_BUDGET_DETAIL;
        END IF;
        -- �\��(�e�i�ڂ���̃V���O�����W�J�p)
        IF curM_PS%ISOPEN = TRUE THEN
            CLOSE curM_PS;
        END IF;

        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* ���[���o�b�N */
        ROLLBACK;
        
        /* �ُ�I�� */
        RETURN FALSE;
END;
/
