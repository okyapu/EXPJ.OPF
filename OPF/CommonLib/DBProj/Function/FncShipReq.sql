CREATE OR REPLACE FUNCTION FNCSHIPREQ(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
'
' �@�\      : �݌ɏo�ɏ���
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'
' �@�\����  : �݌ɏo�ɏ���
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
) RETURN BOOLEAN
IS
    -- ��O�̐錾
    excGetOd                EXCEPTION;          --���v�ʎ擾�G���[
    excInvalidMrpOdrTyp     EXCEPTION;          --�i�ڎ�z�敪�s��
    excAutoShip             EXCEPTION;          --�����o�׏����G���[
    excNotexistRcvIssue     EXCEPTION;          --�ۊǋ�ʓ��o�Ƀf�[�^�����݂��܂���
    excGetNewIssueCd        EXCEPTION;          --���o�ɊǗ��ԍ��擾�G���[
    excGetNewShipRsvCd      EXCEPTION;          --�o�וۗ��ԍ��擾�G���[
    excShip                 EXCEPTION;          --�o�׏����G���[
    excCurCompanyCdErr       EXCEPTION;         --�J�[�\��OPEN����EXCEPTION
    
    -- �萔�̐錾
    MY_SQL_NAME                     VARCHAR2(40)    := 'FncShipReq';
    PRD_ERROR_TYP_ERROR             NUMBER          := 9;   --���Y�v���h�^�e�|���Y���G���[�敪�i�X�F�G���[�j
    ODR_TYP_CASE_ODR                NUMBER          := 1;   --�i��-�i�ڎ�z�敪(1:�ʎ�z�i��)
    ODR_TYP_STOCK_ALOC_CASE_ODR     NUMBER          := 2;   --�i��-�i�ڎ�z�敪(2:�݌Ɉ����^�ʎ�z�i��)
    ODR_TYP_STOCK_ALOC_MANUAL_ODR   NUMBER          := 3;   --�i��-�i�ڎ�z�敪(3:�݌Ɉ����^�}�j���A����z�i��)
    ODR_TYP_MANUAL_ODR              NUMBER          := 4;   --�i��-�i�ڎ�z�敪(4:�}�j���A����z�i��)
    ODR_TYP_LOT_ODR                 NUMBER          := 5;   --�i��-�i�ڎ�z�敪(5:���b�g��z�i��)
    ODR_TYP_RATION_ODR              NUMBER          := 6;   --�i��-�i�ڎ�z�敪(6:��ʎ�z�i��)
    ODR_TYP_ODR_POINT_ODR           NUMBER          := 7;   --�i��-�i�ڎ�z�敪(7:�����_��z�i��)
    ODR_TYP_ASSIMILATE              NUMBER          := 8;   --�i��-�i�ڎ�z�敪(8:�[���i��)
    ISSUERSV_CANCELED               NUMBER          := 2;   --�o�ɕۗ��e�[�u��-�o�ɕۗ������敪(2:�ۗ�����)
    RCV_ISSUE_TYP_OUT               NUMBER          := 2;   --�ۊǋ�ʓ��o��-���o�ɋ敪(2:�o��)
    RCV_ISSUE_GNR_TYP_CANSHIP       NUMBER          := 39;  --�ۊǋ�ʓ��o��-���o�ɔ����敪(39:�o�׎��)
    RCV_ISSUE_STOCK_UPD_COMPLTED    NUMBER          := 2;   --�ۊǋ�ʓ��o��-�݌ɍX�V�敪(2:�X�V�ς�)
    SHIP_RSV_CANCEL_TYP_CANCELED    NUMBER          := 2;   --�o�ɕۗ�-�o�ɕۗ������敪(2:�ۗ�����)
    SHIP_RSV_CANCEL_TYP_ERRORDATA   NUMBER          := 9;   --�o�וۗ�-�o�וۗ������敪(9:�ۗ�����(�s���f�[�^))
    ISSUERSV_NOTRELEASED            NUMBER          := 1;   --�o�וۗ�-�o�וۗ������敪(1:�ۗ���)
    ISSUERSV_RELEASED               NUMBER          := 3;   --�o�וۗ�-�o�וۗ������敪(3:�ۗ�����)

    -- �ϐ��̐錾
    blnRet                  BOOLEAN;        --�֐��߂�l
    intRet                  INTEGER;        --�֐��߂�l
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2JobOdrCd             VARCHAR2(100);   --����
    numJobOdrDetailNo       NUMBER(6);      --���Ԏ}��
    vc2ItemCd               VARCHAR2(100);   --�i�ڔԍ�
    blnJobOdrFlg            BOOLEAN;        --���Ԍv��擾���f
    numOdNo                 NUMBER(14);     --�I�[�_�f�}���h�ԍ�
    vc2NewRcvIssueCtrlCd    VARCHAR2(100);   --���o�ɊǗ��ԍ�
    vc2NewShipRsvCdCtrl     VARCHAR2(100);   --�o�וۗ��ԍ�
    vc2RunChkComment        VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    numCnt_SHIP_REQ         NUMBER(10);     --�m�o�חv���n���o����
    numCnt_SHIP_RSV         NUMBER(10);     --�m�o�וۗ��n�ǉ�����
    numCnt_ITEM_STOCK       NUMBER(10);     --�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
    numCnt_JOB_ODR_CD_STOCK NUMBER(10);     --�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
    dtmSHIP_DATE            DATE;           --�v�j�o�׎��ѓ�
    numSHIP_DATE_Flg        NUMBER(1);      --�v�j�o�׎��ѓ��̎擾�L��
    numCount1               NUMBER(10);     --�����`�F�b�N�p�P
    numCount2               NUMBER(10);     --�����`�F�b�N�p�Q
    vc2CompanyCd            VARCHAR2(100);-- ��ЃR�[�h
    
-- MESSAGE �̐錾
    APS_COM_BATCH_START                 VARCHAR2(28)     := 'ZZ09001';     --�o�b�`�������J�n���܂���
    APS_COM_BATCH_END                   VARCHAR2(28)     := 'ZZ09002';     --�o�b�`�������I�����܂���
    APS_COM_NOTEXIST_T_OD               VARCHAR2(28)     := 'AK50585';     --���v�ʃf�[�^�����݂��܂���
    APS_COM_INVALID_ITEM_ODR_TYP        VARCHAR2(28)     := 'AK50718';     --�i�ڎ�z�敪���s���ł�
    APS_COM_NOTEXIST_T_RCV_ISSUE        VARCHAR2(28)     := 'AK50594';     --�ۊǋ�ʓ��o�Ƀf�[�^�����݂��܂���
    APS_COM_NOTEXIST_ISSUE_CTRL_CD      VARCHAR2(28)     := 'AK50558';     --���o�ɔԍ��̔ԃf�[�^�����݂��܂���
    APS_COM_NOTEXIST_RSV_CD_CTRL        VARCHAR2(28)     := 'AK50542';     --�o�ɕۗ��ԍ��̔ԃf�[�^�����݂��܂���
    APS_PROC_CNT                        VARCHAR2(28)     := 'AK53412';     --��������
    APS_CANCEL_ERRNO                    VARCHAR2(28)     := 'AK53355';     --�ԕi���������Ă��܂�
    APS_PASTDATA_ERRNO                  VARCHAR2(28)     := 'AK53356';     --�O��o�׃f�[�^�����݂��܂���
    APS_COMPANY_CD                      VARCHAR2(28)     := 'BZ00179';     --��ЃR�[�h�̎擾�Ɏ��s���܂����B

-- LOG �̐錾
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    COMMENT_MSGLOG_SHIPSTART            VARCHAR2(88)  := '<< �݌ɏo�ɏ����J�n >>';
    COMMENT_MSGLOG_SHIPEND              VARCHAR2(88)  := '<< �݌ɏo�ɏ����I�� >>';

    -- �J�[�\���̐錾
    /* ���ЃR�[�h�擾 */
    CURSOR curSYS_MY_COMPANY IS
        SELECT
            SYS_MY_COMPANY."COMPANY_CD" AS "COMPANY_CD"
        FROM
            SYS_MY_COMPANY
        WHERE
            SYS_MY_COMPANY."CTRL_CD" = 'SYSTEM';
    recSYS_MY_COMPANY curSYS_MY_COMPANY%ROWTYPE;
    
    -- �o�חv��
    CURSOR curT_SHIP_REQ(
        cVc2PLANT_CD     VARCHAR2        --   1.�H��R�[�h
    )IS
        SELECT
                COMPANY_CD              --��ЃR�[�h
               ,SLIP_TYP                --�`�[���
               ,SLIP_CTRL_GRP           --�`�[�Ǘ��O���[�v
               ,SLIP_CD                 --�`�[�ԍ�
               ,SLIP_DATE               --�`�[���t
               ,LINE_NO                 --�s
               ,UPD_ODR_NO              --�X�V����
               ,CRCT_TYP            --�����敪
               ,ORGN_SLIP_CTRL_GRP      --���`�[�Ǘ��O���[�v
               ,ORGN_SLIP_CD            --���`�[�ԍ�
               ,ORGN_SLIP_DATE          --���`�[���t
               ,ORGN_LINE_NO            --���`�[�s
               ,ODR_SLIP_TYP            --�󒍓`�[���
               ,ODR_SLIP_CTRL_GRP       --�󒍓`�[�Ǘ��O���[�v
               ,ODR_SLIP_CD             --�󒍓`�[�ԍ�
               ,ODR_SLIP_DATE           --�󒍓`�[���t
               ,ODR_LINE_NO             --�󒍓`�[�s
               ,JOB_ODR_FLG             --�ʎ󒍃t���O
               ,CUST_CD                 --���Ӑ�R�[�h
               ,CUST_NAME               --���Ӑ於
               ,BRANCH_CD               --�x�X�R�[�h
               ,BRANCH_NAME             --�x�X��
               ,DIRECT_DLV_TYP          --���[�敪
               ,DLV_LOC_CD              --�[���ꏊ�R�[�h
               ,DLV_LOC_NAME            --�[���ꏊ��
               ,COMM_CD                 --���i�R�[�h
               ,COMM_NAME               --���i��
               ,SPEC                    --�K�i
               ,COMM_SIZE               --�T�C�Y
               ,COLOR                   --�F
               ,PRD_COMM_CODE_CHG_TYP   --���i�^���i�ϐ��敪
               ,SCDL_SHIP_DATE          --�o�ח\���
               ,SCDL_DLV_DATE           --�[�i�\���
           ,PLANT_CD        --�H��R�[�h    
               ,SHIP_WH_CD              --�o�בq�ɃR�[�h
               ,WH_CD                   --�ۊǋ�R�[�h
               ,RCV_ISSUE_QTY           --�o�׎��ѐ�
               ,TOTAL_RCV_ISSUE_QTY     --�o�׎��ї݌v��
               ,REMAIN_RCV_ISSUE_QTY    --�o�׎c��
               ,ODR_ACPT_JOB_ODR_NO     --�󒍐���
               ,ITEM_CD                 --�i�ڔԍ�
               ,MRP_ODR_TYP             --�i�ڎ�z�敪
               ,OD_TYP          --�I�[�_�f�}���h�敪
               ,OD_NO           --�I�[�_�f�}���h�ԍ�
               ,JOB_ODR_CD              --����
               ,JOB_ODR_DETAIL_NO       --���Ԏ}��
               ,PRD_ERROR_TYP           --���Y���G���[�敪
               ,SHIP_DATE               --�o�׎��ѓ�
            FROM   T_SHIP_REQ
        WHERE  PLANT_CD = cVc2PLANT_CD
            ORDER BY UPD_ODR_NO     --�X�V����
                    ,COMPANY_CD     --��ЃR�[�h
                    ,SLIP_TYP       --�`�[���
                    ,SLIP_CTRL_GRP  --�`�[�Ǘ��O���[�v
                    ,SLIP_CD        --�`�[�ԍ�
                    ,SLIP_DATE      --�`�[���t
                    ,LINE_NO;       --�s

    -- �o�׊Ǘ����䁕�ۊǋ�ʓ��o��
    CURSOR curT_RCV_ISSUE(
        cvc2CompanyCd       VARCHAR2
       ,cnumSlipTyp         NUMBER
       ,cvc2SlipCtrlGrp     VARCHAR2
       ,cvc2SlipCd          VARCHAR2
       ,cdtmSlipDate        DATE
       ,cnumLineNo          NUMBER
       ,cVc2PLANT_CD       VARCHAR2        --   �H��R�[�h
        )
    IS
        SELECT  B.RCV_ISSUE_CTRL_CD     --���o�ɊǗ��ԍ�
               ,B.ITEM_CD               --�i�ڔԍ�
           ,B.PLANT_CD          --�H��R�[�h    
               ,B.WH_CD                 --�ۊǋ�R�[�h
               ,B.JOB_ODR_CD            --����
               ,B.JOB_ODR_DETAIL_NO     --���Ԏ}��
               ,B.PUCH_ODR_CD           --�����ԍ�
               ,B.ACPT_NO               --�����
               ,B.ACPT_RSLT_CRCT_NO     --������ђ�����
               ,B.INSPEC_RSLT_CRCT_NO   --�������ђ�����
               ,B.WORK_ODR_CD           --��ƌv��ԍ�
               ,B.WORK_IN_PROC_CD       --�d�|��ƃR�[�h
               ,B.PARTIAL_PRD_NO        --�����
               ,B.OPR_RSLT_CRCT_NO      --��Ǝ��ђ�����
               ,B.ISSUE_INST_CD         --�o�Ɏw���ԍ�
               ,B.RCV_ISSUE_QTY         --���o�ɐ�
               ,B.RCV_ISSUE_AMOUNT      --���o�ɋ��z
               ,B.RCV_ISSUE_DATE        --���o�ɔN����
               ,B.RCV_ISSUE_ODD_QTY     --���o�ɒ[��
               ,B.DEFECT_CAUSE_CD       --���o�ɕs�Ǘ��R�R�[�h
               ,B.RCV_ISSUE_CMPLT_FLG   --���o�Ɋ����t���O
               ,B.OD_NO                 --�I�[�_�f�}���h�ԍ�
            FROM   SYS_SHIP_CTRL A, T_RCV_ISSUE B
            WHERE  A.RCV_ISSUE_CTRL_CD = B.RCV_ISSUE_CTRL_CD(+)
              AND  A.COMPANY_CD = cvc2CompanyCd
              AND  SLIP_TYP = cnumSlipTyp
              AND  SLIP_CTRL_GRP = cvc2SlipCtrlGrp
              AND  SLIP_CD = cvc2SlipCd
              AND  SLIP_DATE = cdtmSlipDate
              AND  LINE_NO = cnumLineNo
          AND  PLANT_CD = cVc2PLANT_CD;

BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- TraceLog �̏o��
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- �o�חv���𒊏o�������J�n
--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    --�m�o�חv���n���o�����̏�����
    numCnt_SHIP_REQ := 0;
    --�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V�����̏�����
    numCnt_ITEM_STOCK := 0;

    --�v�j�o�׎��ѓ��̎擾�L���̏�����
    numSHIP_DATE_Flg := 0;
    /* �J�[�\���n�o�d�m�i��ЃR�[�h)*/
    BEGIN
        OPEN curSYS_MY_COMPANY;
    EXCEPTION
        WHEN OTHERS THEN
        RAISE  excCurCompanyCdErr;
    END;
    BEGIN
        FETCH  curSYS_MY_COMPANY  INTO recSYS_MY_COMPANY;
    EXCEPTION
        WHEN OTHERS THEN
        RAISE  excCurCompanyCdErr;
    END;  -- �J�[�\��FETCH(����)

    IF curSYS_MY_COMPANY%FOUND THEN
        vc2CompanyCd := recSYS_MY_COMPANY.COMPANY_CD;
    ELSE
        RAISE  excCurCompanyCdErr;
    END IF;
    IF curSYS_MY_COMPANY%ISOPEN = TRUE THEN
        CLOSE curSYS_MY_COMPANY;
    END IF;

    FOR curT_SHIP_REQ_REC IN curT_SHIP_REQ(pvc2PlantCd) LOOP

        --�P���ڂ̏o�׎��ѓ����擾����
        IF numSHIP_DATE_Flg = 0 THEN
            numSHIP_DATE_Flg := 1;
            dtmSHIP_DATE := curT_SHIP_REQ_REC.SHIP_DATE;
        END IF;

        --���Y���G���[�敪�i�X�F�G���[�j�̏ꍇ�������Ȃ�
        IF curT_SHIP_REQ_REC.PRD_ERROR_TYP <> PRD_ERROR_TYP_ERROR THEN
    
--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                      MY_SQL_NAME, vc2RunChkComment);
    
            --�ʏ�o�ׂ̏ꍇ
            IF curT_SHIP_REQ_REC.ORGN_SLIP_CTRL_GRP IS NULL THEN
    
---*******************************************************************************************
                    IF curT_SHIP_REQ_REC.MRP_ODR_TYP >= ODR_TYP_MANUAL_ODR
                      AND curT_SHIP_REQ_REC.MRP_ODR_TYP <= ODR_TYP_ODR_POINT_ODR THEN
    
--vc2RunChkComment := '���������ʉ� 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                      MY_SQL_NAME, '(SBM0699)FncAutoShip�N��' || vc2RunChkComment || ' numOdNo=NULL');
    
----********************************************************************************************************
--      �����o��
----********************************************************************************************************                        -- Mrp�i�ڂ̏ꍇ
                        -- �����o�׏����N��
                        blnRet := FncAutoShip(pFileHandle
                                             ,pvc2LogMode
                                             ,pvc2OutputMode
                                             ,pvc2UserId
                                             ,pvc2BusinessName
                                             ,pvc2PlantCd   
                                             ,vc2CompanyCd                         --��ЃR�[�h
                                             ,curT_SHIP_REQ_REC.SLIP_TYP           --�`�[���
                                             ,curT_SHIP_REQ_REC.SLIP_CTRL_GRP      --�`�[��ٰ��
                                             ,curT_SHIP_REQ_REC.SLIP_CD            --�`�[�ԍ�
                                             ,curT_SHIP_REQ_REC.SLIP_DATE          --�`�[���t
                                             ,curT_SHIP_REQ_REC.LINE_NO            --�s
                                             ,curT_SHIP_REQ_REC.UPD_ODR_NO         --�X�V����
                                             ,curT_SHIP_REQ_REC.RCV_ISSUE_QTY      --�o�חv����
                                             ,curT_SHIP_REQ_REC.ITEM_CD            --�i�ڔԍ�
                                            ,curT_SHIP_REQ_REC.MRP_ODR_TYP         --��z�敪
                                             ,NULL                                 --�I�[�_�[�f�}���h�ԍ�
                                             ,NULL                                 --�o�וۗ��ԍ�
                                             ,curT_SHIP_REQ_REC.SHIP_DATE
                                             ,numCnt_SHIP_RSV
                                             ,numCnt_ITEM_STOCK
                                             ,numCnt_JOB_ODR_CD_STOCK
                                             );
    
----********************************************************************************************************
                        IF blnRet = FALSE THEN
                            RAISE excAutoShip;
                        END IF;
                    ELSE
                        --  �i�ڎ�z�敪���s���ł�
                        RAISE excInvalidMrpOdrTyp;
                    END IF;
            --�o�׎���̏ꍇ
            ELSE
    
--vc2RunChkComment := '���������ʉ� 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
    
    
                -- �o�׍ϕi�ڂ̏o�׎�������ׂ̈̃f�[�^�����`�F�b�N
                SELECT COUNT(*) INTO numCount2
                    FROM   SYS_SHIP_CTRL, T_RCV_ISSUE
                    WHERE  SYS_SHIP_CTRL.RCV_ISSUE_CTRL_CD = T_RCV_ISSUE.RCV_ISSUE_CTRL_CD(+)
                      AND  SYS_SHIP_CTRL.COMPANY_CD = curT_SHIP_REQ_REC.COMPANY_CD
                      AND  SYS_SHIP_CTRL.SLIP_TYP = curT_SHIP_REQ_REC.SLIP_TYP
                      AND  SYS_SHIP_CTRL.SLIP_CTRL_GRP = curT_SHIP_REQ_REC.ORGN_SLIP_CTRL_GRP
                      AND  SYS_SHIP_CTRL.SLIP_CD = curT_SHIP_REQ_REC.ORGN_SLIP_CD
                      AND  SYS_SHIP_CTRL.SLIP_DATE = curT_SHIP_REQ_REC.ORGN_SLIP_DATE
                      AND  SYS_SHIP_CTRL.LINE_NO = curT_SHIP_REQ_REC.ORGN_LINE_NO
              AND  T_RCV_ISSUE.PLANT_CD = pvc2PlantCd;  
        
                --[�o�׊Ǘ�]�̌��� >= 1
                IF (numCount2 >= 1) THEN
                    --[�ۊǋ�ʓ��o��]�쐬�A�o�׏����N��
    
--vc2RunChkComment := '���������ʉ� 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
                    -- �o�׍ϕi�ڂ̏o�׎������
                    FOR curT_RCV_ISSUE_REC IN curT_RCV_ISSUE(curT_SHIP_REQ_REC.COMPANY_CD
                                                            ,curT_SHIP_REQ_REC.SLIP_TYP
                                                            ,curT_SHIP_REQ_REC.ORGN_SLIP_CTRL_GRP
                                                            ,curT_SHIP_REQ_REC.ORGN_SLIP_CD
                                                            ,curT_SHIP_REQ_REC.ORGN_SLIP_DATE
                                                            ,curT_SHIP_REQ_REC.ORGN_LINE_NO
                                ,curT_SHIP_REQ_REC.PLANT_CD
                                                            ) LOOP
                        IF curT_RCV_ISSUE_REC.RCV_ISSUE_CTRL_CD IS NULL THEN
                            -- �ۊǋ�ʓ��o�Ƀf�[�^�����݂��܂���
                            RAISE excNotexistRcvIssue;
                        END IF;
    
--vc2RunChkComment := '���������ʉ� 00200';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
                        -- ���o�ɊǗ��ԍ��擾
                        blnRet := FncGetNewIssueCd(pFileHandle
                                                  ,pvc2LogMode
                                                  ,pvc2OutputMode
                                                  ,pvc2UserId
                                                  ,pvc2BusinessName
                          ,pvc2PlantCd  
                                                  ,vc2NewRcvIssueCtrlCd
                                                  );
                        IF blnRet = FALSE THEN
                            RAISE excGetNewIssueCd;
                        END IF;
    
--vc2RunChkComment := '���������ʉ� 00210';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
                        -- �ۊǋ�ʓ��o�ɒǉ�
                        INSERT INTO T_RCV_ISSUE(
                            RCV_ISSUE_CTRL_CD
                           ,RCV_ISSUE_TYP
                           ,ITEM_CD
                           ,PLANT_CD    
                           ,WH_CD
                           ,JOB_ODR_CD
                           ,JOB_ODR_DETAIL_NO
                           ,PUCH_ODR_CD
                           ,ACPT_NO
                           ,ACPT_RSLT_CRCT_NO
                           ,INSPEC_RSLT_CRCT_NO
                           ,WORK_ODR_CD
                           ,WORK_IN_PROC_CD
                           ,PARTIAL_PRD_NO
                           ,OPR_RSLT_CRCT_NO
                           ,ISSUE_INST_CD
                           ,RCV_ISSUE_QTY
                           ,RCV_ISSUE_AMOUNT
                           ,RCV_ISSUE_DATE
                           ,RCV_ISSUE_GNR_TYP
                           ,RCV_ISSUE_ODD_QTY
                           ,DEFECT_CAUSE_CD
                           ,STOCK_UPD_TYP
                           ,RCV_ISSUE_CMPLT_FLG
                           ,OD_NO
                           ,COMPANY_CD
                           ,CREATED_DATE
                           ,CREATED_BY
                           ,CREATED_PRG_NM
                           ,UPDATED_DATE
                           ,UPDATED_BY
                           ,UPDATED_PRG_NM
                           ,MODIFY_COUNT
                           ) VALUES (
                            vc2NewRcvIssueCtrlCd                     --���o�ɊǗ��ԍ�
                           ,RCV_ISSUE_TYP_OUT                        --���o�ɋ敪
                           ,curT_RCV_ISSUE_REC.ITEM_CD               --�i�ڔԍ�
                           ,curT_RCV_ISSUE_REC.PLANT_CD              --�H��R�[�h
                           ,curT_RCV_ISSUE_REC.WH_CD                 --�ۊǋ�R�[�h
                           ,curT_RCV_ISSUE_REC.JOB_ODR_CD            --����
                           ,curT_RCV_ISSUE_REC.JOB_ODR_DETAIL_NO     --���Ԏ}��
                           ,curT_RCV_ISSUE_REC.PUCH_ODR_CD           --�����ԍ�
                           ,curT_RCV_ISSUE_REC.ACPT_NO               --�����
                           ,curT_RCV_ISSUE_REC.ACPT_RSLT_CRCT_NO     --������ђ�����
                           ,curT_RCV_ISSUE_REC.INSPEC_RSLT_CRCT_NO   --�������ђ�����
                           ,curT_RCV_ISSUE_REC.WORK_ODR_CD           --��ƌv��ԍ�
                           ,curT_RCV_ISSUE_REC.WORK_IN_PROC_CD       --�d�|��ƃR�[�h
                           ,curT_RCV_ISSUE_REC.PARTIAL_PRD_NO        --�����
                           ,curT_RCV_ISSUE_REC.OPR_RSLT_CRCT_NO      --��Ǝ��ђ�����
                           ,curT_RCV_ISSUE_REC.ISSUE_INST_CD         --�o�Ɏw���ԍ�
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_QTY * -1    --���o�ɐ�
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_AMOUNT      --���o�ɋ��z
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_DATE        --���o�ɔN��
                           ,RCV_ISSUE_GNR_TYP_CANSHIP                --���o�ɔ����敪
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_ODD_QTY     --���o�ɒ[��
                           ,curT_RCV_ISSUE_REC.DEFECT_CAUSE_CD       --���o�ɕs�Ǘ��R�R�[�h
                           ,RCV_ISSUE_STOCK_UPD_COMPLTED             --�݌ɍX�V�敪(2:�X�V�ς�)
                           ,curT_RCV_ISSUE_REC.RCV_ISSUE_CMPLT_FLG   --���o�Ɋ����t���O
                           ,curT_RCV_ISSUE_REC.OD_NO                 --�I�[�_�f�}���h�ԍ�
                           ,vc2CompanyCd                             --��ЃR�[�h
                           ,SYSDATE                                  --�������쐬����
                           ,pvc2UserId                               --�������쐬�҃R�[�h
                           ,MY_SQL_NAME
                           ,SYSDATE                                  --�������ŐV�X�V����
                           ,pvc2UserId                               --�������ŐV�X�V�҃R�[�h
                           ,MY_SQL_NAME
                           ,0
                           );
    
blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                      pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                      MY_SQL_NAME, '(SBM0700)���o�ɊǗ��ԍ�:'|| vc2NewRcvIssueCtrlCd);
    
--vc2RunChkComment := '���������ʉ� 00220';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
----********************************************************************************************************
--      �o�׏����i�o�׎���j
----********************************************************************************************************          
                        -- �o�׏����N���i�o�׎���j
                        blnRet := FncShip(pFileHandle
                                         ,pvc2LogMode
                                         ,pvc2OutputMode
                                         ,pvc2UserId
                                         ,pvc2BusinessName
                     ,pvc2PlantCd
                                         ,vc2NewRcvIssueCtrlCd     --�V���ɍ̔Ԃ��ꂽ���o�ɊǗ��ԍ�
                                         ,numCnt_ITEM_STOCK
                                         ,numCnt_JOB_ODR_CD_STOCK
                                         );
                        IF blnRet = FALSE THEN
                            RAISE excShip;
                        END IF;
    
                    END LOOP;
    
                END IF;
            END IF;
    
        END IF;
    
        --[�o�חv��]���o�����̃C���N�������g
        numCnt_SHIP_REQ := numCnt_SHIP_REQ + 1;
    
    END LOOP;


    --[�o�חv��]���o�����̏o��
    blnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_PROC_CNT, '(SBM0058)�y�o�חv���z���o�����F ' || numCnt_SHIP_REQ || ' ��');

    --[�ۊǋ�ʕi�ڍ݌�]�X�V�����̏o��
    blnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_PROC_CNT, '(SBM0059)�y�ۊǋ�ʕi�ڍ݌Ɂz�X�V�����F ' || numCnt_ITEM_STOCK || ' ��');


    -- TraceLog �̏o��
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    RETURN TRUE;
EXCEPTION
    WHEN excGetOd  THEN  --���v�ʎ擾�G���[
--dbms_output.put_line('���v�ʎ擾�G���[');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_T_OD, '');
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excInvalidMrpOdrTyp  THEN  --�i�ڎ�z�敪�s��
--dbms_output.put_line('�i�ڎ�z�敪�s��');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_INVALID_ITEM_ODR_TYP, '');
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excAutoShip  THEN  --�����o�׏����G���[
--dbms_output.put_line('�����o�׏����G���[');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, 99999, '(SBM0061)�����o�׏����G���[');
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excNotexistRcvIssue  THEN  --�ۊǋ�ʓ��o�Ƀf�[�^�����݂��܂���
--dbms_output.put_line('�ۊǋ�ʓ��o�Ƀf�[�^�����݂��܂���');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_T_RCV_ISSUE, '');
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excGetNewIssueCd  THEN  --���o�ɊǗ��ԍ��擾�G���[
--dbms_output.put_line('���o�ɊǗ��ԍ��擾�G���[');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_ISSUE_CTRL_CD, '');
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excGetNewShipRsvCd  THEN  --�o�וۗ��ԍ��擾�G���[
--dbms_output.put_line('�o�וۗ��ԍ��擾�G���[');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_RSV_CD_CTRL, '');
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excShip  THEN  --�o�׏����G���[
--dbms_output.put_line('�o�׏����G���[');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, 99999, '(SBM0062)�o�׏����G���[');
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
        
    WHEN excCurCompanyCdErr THEN
        
        /* �J�[�\���b�k�n�r�d�i��Џ��j*/
        IF curSYS_MY_COMPANY%ISOPEN = TRUE THEN
            CLOSE curSYS_MY_COMPANY;
        END IF;        
                            
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COMPANY_CD, '');
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, '(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
        
    WHEN OTHERS THEN
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0060)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        COMMIT;
        RETURN FALSE;
END;
/
