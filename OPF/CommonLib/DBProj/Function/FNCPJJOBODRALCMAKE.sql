CREATE OR REPLACE FUNCTION FNCPJJOBODRALCMAKE(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' �C������
' 2014.04.15 ����
'
' �@�\      : �Č��\�Z���Ԉ����i�쐬����
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
' �@�\����  : �Č��\�Z���Ԉ����i�쐬�����B
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
   ,pvc2JobOdrCD           IN  VARCHAR2            --����
   ,pvc2JobOdrDetailNo     IN  NUMBER              --���Ԏ}��
   ,pvc2AlcdQty            IN  NUMBER              --������
   ,pvc2ErrorCd            OUT VARCHAR2            --�G���[�R�[�h
) RETURN BOOLEAN
IS
PRAGMA AUTONOMOUS_TRANSACTION;

-- �J�[�\���̐錾
    -- �Č��\�Z����(�W�J��)
    CURSOR curJOB_PJ_BUDGET_DETAIL(
                  cv2PjBudgetDetailNo  VARCHAR
                 ,numSeqno             NUMBER
    )
    IS
        SELECT /*+ RULE */
               PJ.PJ_BUDGET_DETAIL_NO           -- �Č��\�Z�Ϗ㖾�הԍ�
              ,PJ.SEQNO                         -- SEQNO
              ,OD_NO                            -- �I�[�_�f�}���h�ԍ�
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
              ,PJ.MRP_ODR_TYP                   -- �i�ڎ�z�敪
              ,PJ.OUTSIDE_TYP                   -- ���v�ʓ��O��敪
              ,PJ.OD_LEVEL_NO                   -- ���v�ʃ��x���ԍ�
              ,PJ.ODR_QTY                       -- �I�[�_��
              ,PJ.ALC_STOCK_RATE                -- �����݌ɗ�
              ,IT.PRODUCT_TYP                   -- ���i�敪
              ,IT.UNIT_QTY_TYP                  -- �݌ɐ��P�ʋ敪
        FROM   T_PJ_BUDGET_DETAIL PJ,
               M_ITEM             IT
        WHERE  PJ.PJ_BUDGET_DETAIL_NO     = cv2PjBudgetDetailNo
        AND    PJ.SEQNO                   = numSeqno
        AND    IT.ITEM_CD                 = PJ.ITEM_CD
        ;
    -- ROWTYPE �̐錾
    recJOB_PJ_BUDGET_DETAIL  curJOB_PJ_BUDGET_DETAIL%ROWTYPE;
    
    -- ���v��(���Ԏw��)
    CURSOR curJOB_OD(
               cvc2PLANT_CD             IN VARCHAR2     -- �H��R�[�h
             , cvc2JOB_ODR_CD           IN VARCHAR2     -- ���� 
             , cvc2JOB_ODR_DETAIL_NO    IN NUMBER       -- ���Ԏ}��
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
              ,OD.PARENT_OD_NO                  -- �eSEQNO
              ,OD.ITEM_SPOIL                    -- ���v�ʕi�ڎd����
              ,OD.PS_SPOIL                      -- ���v�ʍ\���d����
              ,OD.CONS_TYP                      -- �\���x���敪
              ,OD.MRP_TYP                       -- ���v�ʏ����敪
              ,OD.ODR_RELEASE_FLG               -- �I�[�_�����σt���O
--              ,IT.OUTSIDE_TYP                   -- ���v�ʓ��O��敪
--              ,IT.MRP_ODR_TYP                   -- �i�ڎ�z�敪
              ,IT.PRODUCT_TYP                   -- ���i�敪
              ,IT.UNIT_QTY_TYP                  -- �݌ɐ��P�ʋ敪
              ,IT.SPL_ITEM_TYP                  -- �󋋕i�敪
--              ,IT.ITEM_SPOIL                    -- �i�ڎd����
        FROM   T_OD    OD
              ,M_ITEM  IT
        WHERE  OD.PLANT_CD             =  cvc2PLANT_CD            -- �W�J����[�Č��\�Z�Ϗ㖾��].�g�Č��\�Z�Ϗ㖾�הԍ��h
        AND    OD.JOB_ODR_CD           =  cvc2JOB_ODR_CD          -- ����
        AND    OD.JOB_ODR_DETAIL_NO    =  cvc2JOB_ODR_DETAIL_NO   -- ���Ԏ}��
        AND    OD.JOB_ODR_CANCEL_NO    =  0                       -- ���Ԏ�������ԍ�
        AND    IT.ITEM_CD              =  OD.ITEM_CD
        ORDER  BY OD.OD_LEVEL_NO ASC ,OD.ITEM_CD ASC
        ;

/* �萔�̐錾 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncPjJobOdrAlcMAKE';      --�o�k�^�r�p�k��
    
    
/* �ϐ��̐錾 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- �t�@�C���n���h��
    blnRet                  BOOLEAN;            -- �֐��߂�l
    intRet                  INTEGER;            -- �֐��߂�l
    vc2Comment              VARCHAR2(1024);     -- ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);     -- ���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2TraceComment         VARCHAR2(1024);     -- �g���[�[�X�o�͗p�R�����g�쐬��Ɨ̈�i���̓p�����[�^�L�^�p�j
    numCount1               NUMBER(6);          -- �����`�F�b�N�p�P
    numCountRec             NUMBER(6);          -- �����`�F�b�N�p
    numMaxSeqNO             NUMBER(6);          -- SEQNO
    numPsUnitQty            NUMBER(22,8);       -- ���ʃ��[�N
    numOd_Level_No          NUMBER(6);          -- �K�w���x��
    datDue_Date             DATE;               -- ���
    numAlcStockRate         NUMBER(9,4);        -- �����݌ɗ�
    vc2NewOd_No             VARCHAR2(100);      -- �\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ�
    
    vc2PARENT_ITEM_CD       T_OD.ITEM_CD%TYPE;                         -- �e�i�ڔԍ�
    numCOST_UP_TYP          M_PS.COST_UP_TYP%TYPE;                     -- �����Ϗ�敪
    numALC_STOCK_FLG        T_PJ_BUDGET_DETAIL.ALC_STOCK_FLG%TYPE;     -- �����݌ɗL���t���O
    numDMY_ITEM_FLG         T_PJ_BUDGET_DETAIL.DMY_ITEM_FLG%TYPE;      -- �[���i�ڃt���O
    numDM_QTY               T_OD.DM_QTY%TYPE;                          -- �f�}���h��
    numVOLUNT_SPL_FLG       T_PJ_BUDGET_DETAIL.VOLUNT_SPL_FLG%TYPE;    -- �󋋕i�t���O
    numPS_INPUT_RATIO       T_PJ_BUDGET_DETAIL.PS_INPUT_RATIO%TYPE;    -- �\���d�������W��
    numITEM_INPUT_RATIO     T_PJ_BUDGET_DETAIL.ITEM_INPUT_RATIO%TYPE;  -- �i�ڎd�������W��
    numPARENT_SEQNO         T_PJ_BUDGET_DETAIL.PARENT_SEQNO%TYPE;      -- �eSEQNO
    
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
    excMasterErr                        EXCEPTION;    --�Q�ƃ}�X�^�����݃G���[

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
'�@���Ԉ��������擾
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �Č��\�Z�Ϗ㖾�׃J�[�\��OPEN
    BEGIN
        OPEN curJOB_PJ_BUDGET_DETAIL(pcv2PjBudgetDetailNo,pvc2Seqno);
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('01:OPEN curJOB_PJ_BUDGET_DETAIL'      ||
                                 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                 1,256);
            RAISE excParameterErr;
    END;

    -- �Č��\�Z�Ϗ㖾�׃J�[�\��FETCH
    BEGIN
        FETCH curJOB_PJ_BUDGET_DETAIL INTO recJOB_PJ_BUDGET_DETAIL;
    EXCEPTION
        WHEN OTHERS THEN
            -- �J�[�\��FETCH���s
            vc2Comment  := SUBSTR(' 02:FETCH curJOB_PJ_BUDGET_DETAIL'    ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                  1,256);
            RAISE excParameterErr;
    END;
    
    IF curJOB_PJ_BUDGET_DETAIL%NOTFOUND THEN
       
       RAISE excParameterErr;
    END IF;
    
    -- �ő�SEQNO�擾
    BEGIN
        SELECT MAX(SEQNO)                  INTO numMaxSeqNO
        FROM   T_PJ_BUDGET_DETAIL
        WHERE  PJ_BUDGET_DETAIL_NO         =  recJOB_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO;
    EXCEPTION
        WHEN OTHERS THEN
            -- �J�[�\��FETCH���s
            vc2Comment  := SUBSTR(' SELECT T_PJ_BUDGET_DETAIL'    ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                  1,256);
            RAISE;
    END;

    -- �W�J���̏��̃Z�b�g
    numOd_Level_No        :=  recJOB_PJ_BUDGET_DETAIL.OD_LEVEL_NO;    -- �K�w���x��
    datDue_Date           :=  recJOB_PJ_BUDGET_DETAIL.DUE_DATE;       -- �v���[��
    
    
    numCount1             :=  0;                                      -- �����J�E���g
    vc2TmpMessage :=  '�K�w���x��:' || numOd_Level_No ||
                      '�v���[��  :' || to_char(datDue_Date, 'YYYYMMDD');
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment || vc2TmpMessage);

/*------------------------------------------------------------
'�@���Ԉ�����z���쐬
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �������̓��x���ԍ�,�i�ڔԍ��̏���
    FOR recJOB_OD IN curJOB_OD(pvc2PlantCd,pvc2JobOdrCD,pvc2JobOdrDetailNo) LOOP
    
        /* �ŏ�ʕi�P���ڂ̎� */
        numCount1   :=  numCount1  +  1;


        IF numCount1 = 1       THEN
           numAlcStockRate     :=  CEIL((pvc2AlcdQty / recJOB_OD.ODR_QTY) * recJOB_PJ_BUDGET_DETAIL.ALC_STOCK_RATE * 10000) / 10000 ; -- �����݌ɋ敪
        END IF;
    
        -- SEQNO �J�E���g�A�b�v
        numMaxSeqNO    :=  numMaxSeqNO +   1;
    
        -- ��ʎ�z���擾
        IF  recJOB_OD.PARENT_OD_NO   is Null  THEN
            vc2PARENT_ITEM_CD  :=  Null;
            numCOST_UP_TYP     :=  1; 
        ELSE
        -- ��ʎ�z�i�̏��v�ʂ�������
            BEGIN
                SELECT  ITEM_CD INTO vc2PARENT_ITEM_CD
                    FROM   T_OD
                    WHERE  OD_NO               =  recJOB_OD.PARENT_OD_NO;   -- �eSEQNO
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    RAISE excMasterErr;
                WHEN OTHERS THEN
                    RAISE;
            END;
        
        -- ���i�\�����擾
            BEGIN
                SELECT /*+ RULE */
                       COST_UP_TYP INTO numCOST_UP_TYP
                FROM   M_PS
                WHERE  PARENT_ITEM_CD      =  vc2PARENT_ITEM_CD         -- �e�i�ڔԍ�
                AND    COMP_ITEM_CD        =  recJOB_OD.ITEM_CD         -- �i�ڔԍ�
                AND    EFF_PHASE_IN_DATE   <= datDue_Date               -- ���i�\���L���J�n��
                AND    EFF_PHASE_OUT_DATE  >= datDue_Date;              -- ���i�\���L���J�n��
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    RAISE excMasterErr;
                WHEN OTHERS THEN
                    RAISE;
            END;
        END IF;
        
        -- ���Ԏ�z
        BEGIN
            SELECT COUNT(*)            INTO numCountRec
            FROM   T_JOB_ODR_ALC
            WHERE  OD_NO               =  recJOB_OD.OD_NO;
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
        IF recJOB_OD.MRP_ODR_TYP = 8 THEN
            numDMY_ITEM_FLG      := 1;
        ELSE
            numDMY_ITEM_FLG      := 0;
        END IF;

        /*  �����󋋕i�t���O  */
        IF recJOB_OD.SPL_ITEM_TYP = 2 THEN
            numVOLUNT_SPL_FLG      := 1;
        ELSE
            numVOLUNT_SPL_FLG      := 0;
        END IF;
        
        /*  �\���d�������W��  */
        numPS_INPUT_RATIO           := CEIL((1+ recJOB_OD.PS_SPOIL /100) * 10000) / 10000 ;

        /*  �i�ڎd�������W��  */
        IF recJOB_OD.MRP_ODR_TYP = 8 THEN
           numITEM_INPUT_RATIO         := CEIL(((1+ recJOB_OD.ITEM_SPOIL /100)) * 10000) / 10000 ;
        ELSE
           numITEM_INPUT_RATIO         := 1.0;
        END IF;

        /*  �eSEQNO  */
        IF  recJOB_OD.PARENT_OD_NO     IS Null   THEN
            numPARENT_SEQNO         :=  recJOB_PJ_BUDGET_DETAIL.SEQNO;  
        ELSE
            BEGIN
                SELECT /*+ RULE */
                       SEQNO  INTO numPARENT_SEQNO
                FROM   T_PJ_BUDGET_DETAIL
                WHERE  PJ_BUDGET_DETAIL_NO      =  recJOB_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO         -- �Č��\�Z�Ϗ㖾�הԍ�
                AND    OD_NO                    =  recJOB_OD.PARENT_OD_NO                              -- �e�I�[�_�f�}���h�ԍ�
                AND    ORG_JOB_ODR_CD           =  pvc2JobOdrCD                                        -- ������
                AND    ORG_JOB_ODR_DETAIL_NO    =  pvc2JobOdrDetailNo                                  -- �����Ԏ}��
                ;
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    RAISE excMasterErr;
                WHEN OTHERS THEN
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
                    recJOB_PJ_BUDGET_DETAIL.PJ_BUDGET_DETAIL_NO    --  1 �Č��\�Z�Ϗ㖾�הԍ�
                   ,numMaxSeqNO                                    --  2 SEQNO
                   ,recJOB_OD.OD_NO                                --  3 �I�[�_�f�}���h�ԍ�
                   ,recJOB_PJ_BUDGET_DETAIL.PROJECT_CD             --  4 �Č��ԍ�
                   ,recJOB_PJ_BUDGET_DETAIL.ESTIMATE_NO            --  5 ���ϔԍ�
                   ,recJOB_PJ_BUDGET_DETAIL.DETAL_NO               --  6 ���הԍ�
                   ,recJOB_PJ_BUDGET_DETAIL.ODR_NO                 --  7 �󒍔ԍ�
                   ,recJOB_PJ_BUDGET_DETAIL.ESTIMATE_TYPE          --  8 ��z�i�ڎ�
                   ,recJOB_PJ_BUDGET_DETAIL.ODR_ACPT_DATE          --  9 �󒍓�
                   ,recJOB_PJ_BUDGET_DETAIL.PLANT_CD               -- 10 �H��R�[�h
                   ,recJOB_OD.JOB_ODR_CD                           -- 11 ����
                   ,recJOB_OD.JOB_ODR_DETAIL_NO                    -- 12 ���Ԏ}��
                   ,recJOB_OD.JOB_ODR_CANCEL_NO                    -- 13 ���Ԏ�������ԍ�
                   ,recJOB_PJ_BUDGET_DETAIL.ROOT_ITEM_CD           -- 14 �ŏ�ʕi�ڔԍ�
                   ,vc2PARENT_ITEM_CD                              -- 15 �e�i�ڔԍ�
                   ,recJOB_OD.ITEM_CD                              -- 16 �i�ڔԍ�
                   ,recJOB_OD.ODR_STS_TYP                          -- 17 �I�[�_��ԋ敪
                   ,recJOB_OD.DM_STS_TYP                           -- 18 �f�}���h��ԋ敪
                   ,recJOB_OD.OD_TYP                               -- 19 �I�[�_�f�}���h�敪
                   ,datDue_Date                                    -- 20 �v���[��
                   ,datDue_Date                                    -- 21 ��z�����
                   ,datDue_Date                                    -- 22 �����[��
                   ,datDue_Date                                    -- 23 ���������
                   ,recJOB_OD.DM_QTY                               -- 24 �f�}���h��
                   ,recJOB_OD.ODR_QTY                              -- 25 �I�[�_��
                   ,recJOB_OD.MRP_ODR_TYP                          -- 26 �i�ڎ�z�敪
                   ,recJOB_OD.OUTSIDE_TYP                          -- 27 ���v�ʓ��O��敪
                   ,recJOB_OD.PRODUCT_TYP                          -- 28 ���i�敪
                   ,recJOB_OD.UNIT_QTY_TYP                         -- 29 �݌ɐ��P�ʋ敪
                   ,recJOB_OD.PS_UNIT_QTY                          -- 30 ���i�\���P�ʐ�
                   ,recJOB_OD.PS_UNIT_DENOMINATOR                  -- 31 ���i�\���P�ʐ�����
                   ,recJOB_OD.PS_UNIT_NUMERATOR                    -- 32 ���i�\���P�ʐ����q
                   ,0                                              -- 33 ���ɗ݌v��
                   ,0                                              -- 34 �o�ɗ݌v��
                   ,numOd_Level_No + recJOB_OD.OD_LEVEL_NO         -- 35 ���v�ʃ��x���ԍ�
                   ,numPARENT_SEQNO                                -- 36 �eSEQNO
                   ,recJOB_OD.ITEM_SPOIL                           -- 37 ���v�ʕi�ڎd����
                   ,recJOB_OD.PS_SPOIL                             -- 38 ���v�ʍ\���d����
                   ,recJOB_OD.CONS_TYP                             -- 39 �\���x���敪
                   ,recJOB_OD.ODR_QTY                              -- 40 �K�v���v��
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
                   ,numCOST_UP_TYP                                 -- 58 �����Ϗ�敪
                   ,0                                              -- 59 �L���x���i�t���O
                   ,1                                              -- 60 �\�Z�Ϗグ�敪
                   ,recJOB_OD.ODR_RELEASE_FLG                      -- 61 �I�[�_�����σt���O
                   ,recJOB_PJ_BUDGET_DETAIL.OD_NO                  -- 62 ���I�[�_�f�}���h�ԍ�
                   ,pvc2JobOdrCD                                   -- 63 ������
                   ,pvc2JobOdrDetailNo                             -- 64 �����Ԏ}��
                   ,pvc2AlcdQty                                    -- 65 ���I�[�_��
                   ,null                                           -- 66 ���o�ɔ����敪
                   ,numALC_STOCK_FLG                               -- 67 �����݌ɗL���t���O
                   ,0                                              -- 68 �݌Ɉ������v�ʓW�J�敪
                   ,2                                              -- 69 �����݌ɋ敪
                   ,numAlcStockRate                                -- 70 �����݌ɋ旦
                   ,SYSDATE                                        -- 71 �쐬��
                   ,pvc2UserId                                     -- 72 �쐬��
                   ,'FNCPJJOBODRALCMAKE'                           -- 73 �쐬�v���O������
                   ,SYSDATE                                        -- 74 �X�V��
                   ,pvc2UserId                                     -- 75 �X�V��
                   ,'FNCPJJOBODRALCMAKE'                           -- 76 �X�V�v���O������
                   ,0);                                            -- 77 �X�V��
        EXCEPTION
            WHEN OTHERS THEN
                -- �Č��\�Z�Ϗ㖾�׎��s
                vc2Comment := SUBSTR(' 20:INSERT T_PJ_BUDGET_DETAIL'       ||
                                     ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                     ' SQLERRM=' || '[ ' || SQLERRM || ' ]',
                                     1, 256);
                DBMS_OUTPUT.PUT_LINE('ERROR ->'||vc2Comment);
                RAISE excOTHER_ERR;
        END;
    
    END LOOP;

/*------------------------------------------------------------
'�@�C������
-------------------------------------------------------------*/
vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- �Č��\�Z�Ϗ㖾�׃J�[�\��CLOSE
--    CLOSE curJOB_OD;

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

        pvc2ErrorCd := APS_COM_ParameterErr;
        -- �J�[�\���̃N���[�Y����
        --�̔��\����{�\�Z�J�[�\��
        IF curJOB_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curJOB_PJ_BUDGET_DETAIL;
        END IF;
        
        /* �Ɩ����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM);

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        /* �R�~�b�g */
        --COMMIT;

        /* �ُ�I�� */
        RETURN FALSE;

    WHEN excMasterErr THEN         --�J�[�\���G���[
        -- ���[���o�b�N
        --ROLLBACK;

        pvc2ErrorCd := APS_COM_NOTEXIST_PJ_BUDGET_DTL;     --�G���[�R�[�h
        -- �J�[�\���̃N���[�Y����
        --�̔��\����{�\�Z�J�[�\��
        IF curJOB_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curJOB_PJ_BUDGET_DETAIL;
        END IF;
        
        /* �Ɩ����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_PARAM);

        /* �R�~�b�g */
        --COMMIT;

        /* �ُ�I�� */
        RETURN FALSE;

    WHEN excGetNewPjOdNo THEN         --�\�Z�Ϗグ�p�I�[�_�f�}���h�ԍ��G���[
        -- ���[���o�b�N
        --ROLLBACK;

        pvc2ErrorCd := APS_COM_MISTAKE_NATIVE_PARAM;
        -- �J�[�\���̃N���[�Y����
        --�̔��\����{�\�Z�J�[�\��
        IF curJOB_PJ_BUDGET_DETAIL%ISOPEN = TRUE THEN
            CLOSE curJOB_PJ_BUDGET_DETAIL;
        END IF;
        
        /* �Ɩ����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                            pvc2PlantCd, MY_SQL_NAME, pvc2ErrorCd, vc2Comment);
        
        /* �g���[�X�̏o�� */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                              pvc2PlantCd, MY_SQL_NAME, LOGMSG_NEWODRNO);

        /* �R�~�b�g */
        --COMMIT;

        /* �ُ�I�� */
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        --ROLLBACK;
        RETURN FALSE;
     
    WHEN OTHERS THEN   --���̑��̃G���[
        /* ErrorLog �̏o�� */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* ���[���o�b�N */
        --ROLLBACK;
        
        /* �ُ�I�� */
        RETURN FALSE;
END;
/