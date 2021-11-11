CREATE OR REPLACE FUNCTION  FNCAUTOSHIP(
/*------------------------------------------------------------------------------
' $Id: FncAutoShip.sql,v 1.4 2013/04/12 05:23:10 tai-yanhong Exp $
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2003.11.04 DBMS_OUTPUT�̃R�����g�A�E�g
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �����o�׏���
'
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle               - (i) �t�@�C���n���h��
'             pvc2LogMode               - (i) �k�n�f���[�h
'             pvc2OutputMode            - (i) �o�̓��[�h
'             pvc2UserId                - (i) ���[�U�h�c
'             pvc2BusinessName          - (i) �Ɩ���
--              pvc2PlantCd             (i)�H��R�[�h
'             pvc2CompanyCd             - (i) ��ЃR�[�h
'             pnumSlipTyp               - (i) �`�[���
'             pvc2SlipCtrlGrp           - (i) �`�[�Ǘ��O���[�v
'             pvc2SlipCd                - (i) �`�[�ԍ�
'             pdtmSlipDate              - (i) �`�[���t
'             pnumLineNo                - (i) �s
'             pvc2UpdOdrNo              - (i) �X�V����
'             pnumRcvIssueQty           - (i) �o�א�
'             pvc2ItemCd                - (i) �i�ڔԍ�
'             pnumMrpOdrTyp             - (i) �i�ڎ�z�敪
'             pnumOdNo                  - (i) �I�[�_�f�}���h�ԍ�
'             pvc2ShipRsvCd             - (i) �o�וۗ��ԍ�
'             pdtmShipDate              - (i) �o�׎��ѓ�
'             pnumCnt_SHIP_RSV          - (io)�m�o�וۗ��n�ǉ�����
'             pnumCnt_ITEM_STOCK        - (io)�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
'             pnumCnt_JOB_ODR_CD_STOCK  - (io)�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
'
' �@�\����  : �����o�׏���
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle                 IN      UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                 IN      VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode              IN      VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                  IN      VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName            IN      VARCHAR2            --�Ɩ���
   ,pvc2PlantCd                 IN  VARCHAR2              --// �H��R�[�h
   ,pvc2CompanyCd               IN      VARCHAR2            --��ЃR�[�h
   ,pnumSlipTyp                 IN      NUMBER              --�`�[���
   ,pvc2SlipCtrlGrp             IN      VARCHAR2            --�`�[�Ǘ��O���[�v
   ,pvc2SlipCd                  IN      VARCHAR2            --�`�[�ԍ�
   ,pdtmSlipDate                IN      DATE                --�`�[���t
   ,pnumLineNo                  IN      NUMBER              --�s
   ,pvc2UpdOdrNo                IN      VARCHAR2            --�X�V����
   ,pnumRcvIssueQty             IN      NUMBER              --�o�א�
   ,pvc2ItemCd                  IN      VARCHAR2            --�i�ڔԍ�
   ,pnumMrpOdrTyp               IN      NUMBER              --�i�ڎ�z�敪
   ,pnumOdNo                    IN      NUMBER              --�I�[�_�f�}���h�ԍ�
   ,pvc2ShipRsvCd               IN      VARCHAR2            --�o�וۗ��ԍ�
   ,pdtmShipDate                IN      DATE                --�o�׎��ѓ�
   ,pnumCnt_SHIP_RSV            IN OUT  NUMBER              --�m�o�וۗ��n�ǉ�����
   ,pnumCnt_ITEM_STOCK          IN OUT  NUMBER              --�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
   ,pnumCnt_JOB_ODR_CD_STOCK    IN OUT  NUMBER              --�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
)RETURN BOOLEAN
IS
    -- ��O�̐錾
    excNoShipRsv            EXCEPTION;          --�o�וۗ�����
    excQtyCalcMrp           EXCEPTION;          --�l�q�o�o�׉\�����f�G���[
    excQtyCalcJobOdr        EXCEPTION;          --���ԏo�׉\�����f�G���[
    excReleaseShipRsv       EXCEPTION;          --�o�וۗ��敪�����G���[
    excMakeShipRsv          EXCEPTION;          --�o�וۗ��쐬�G���[
    excShipForMrp           EXCEPTION;          --�l�q�o�o�׏����G���[
    excShipForJobOdr        EXCEPTION;          --���ԏo�׏����G���[
    excGetNewIssueCd        EXCEPTION;          --���o�ɊǗ��ԍ��擾�G���[
    excGetNewShipRsvCd      EXCEPTION;          --�o�וۗ��ԍ��擾�G���[

    -- �萔�̐錾
    MY_SQL_NAME                     VARCHAR2(48)    := 'FncAutoShip';
    ODR_TYP_CASE_ODR                NUMBER          := 1;   --�i��-�i�ڎ�z�敪(1:�ʎ�z�i��)
    ODR_TYP_STOCK_ALOC_CASE_ODR     NUMBER          := 2;   --�i��-�i�ڎ�z�敪(2:�݌Ɉ����^�ʎ�z�i��)
    ODR_TYP_STOCK_ALOC_MANUAL_ODR   NUMBER          := 3;   --�i��-�i�ڎ�z�敪(3:�݌Ɉ����^�}�j���A����z�i��)
    ODR_TYP_MANUAL_ODR              NUMBER          := 4;   --�i��-�i�ڎ�z�敪(4:�}�j���A����z�i��)
    ODR_TYP_LOT_ODR                 NUMBER          := 5;   --�i��-�i�ڎ�z�敪(5:���b�g��z�i��)
    ODR_TYP_RATION_ODR              NUMBER          := 6;   --�i��-�i�ڎ�z�敪(6:��ʎ�z�i��)
    ODR_TYP_ODR_POINT_ODR           NUMBER          := 7;   --�i��-�i�ڎ�z�敪(7:�����_��z�i��)
    ODR_TYP_ASSIMILATE              NUMBER          := 8;   --�i��-�i�ڎ�z�敪(8:�[���i��)
    RCV_ISSUE_TYP_OUT               NUMBER          := 2;   --�ۊǋ�ʓ��o��-���o�ɋ敪(2:�o��)
    RCV_ISSUE_GNR_TYP_SHIP          NUMBER          := 31;  --�ۊǋ�ʓ��o��-���o�ɔ����敪(31:�o��)
    RCV_ISSUE_STOCK_UPD_COMPLTED    NUMBER          := 2;   --�ۊǋ�ʓ��o��-�݌ɍX�V�敪(2:�X�V�ς�)
    RCV_ISSUE_CMPLT_FLG_COMPLTED    NUMBER          := 1;   --�ۊǋ�ʓ��o��-���o�Ɋ����t���O(1:����)
    SHIP_RSV_CANCEL_TYP_ERRORDATA   NUMBER          := 9;   --�o�וۗ�-�o�וۗ������敪(9:�ۗ�����(�s���f�[�^))

    -- �ϐ��̐錾
    blnRet                  BOOLEAN;        --�֐��߂�l
    intRet                  INTEGER;        --�֐��߂�l
    blnErrorDateTyp         BOOLEAN;        --�G���[�f�[�^�敪�iTRUE:�ُ�CFALSE:����j
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    numCount                NUMBER(10);     --�����`�F�b�N�p

    vc2NewRcvIssueCtrlCd    VARCHAR2(100);   --���o�ɊǗ��ԍ�
    vc2NewShipRsvCd         VARCHAR2(100);   --�o�וۗ��ԍ�

    vc2CompanyCd            VARCHAR2(100);   --��ЃR�[�h
    numSlipTyp              NUMBER(2);      --�`�[���
    vc2SlipCtrlGrp          VARCHAR2(100);   --�`�[�Ǘ��O���[�v
    vc2SlipCd               VARCHAR2(100);   --�`�[�ԍ�
    dtmSlipDate             DATE;           --�`�[���t
    numLineNo               NUMBER(6);      --�s
    vc2UpdOdrNo             VARCHAR2(100);   --�X�V����
    numRcvIssueQty          NUMBER(18,4);   --�o�א�
    vc2ItemCd               VARCHAR2(100);   --�i�ڔԍ�
    numMrpOdrTyp            NUMBER(2);      --�i�ڎ�z�敪
    numOdNo                 NUMBER(14);     --�I�[�_�f�}���h�ԍ�
    vc2ShipRsvCd            VARCHAR2(100);   --�o�וۗ��ԍ�
    dtmShipDate             DATE;           --�o�׎��ѓ�
    vc2JobOdrCd             VARCHAR2(100);   --����
    numJobOdrDetailNo       NUMBER(6);      --���Ԏ}��
    blnRetQty               BOOLEAN;        --�o�׉\�����f

    numJobOdrCdStock        NUMBER;         --���ԍ݌ɕ��o�׉\��
    numAlcableJobOdrStock   NUMBER;         --���Ԉ������o�׉\��
    numAlcableItemStock     NUMBER;         --�݌Ɉ������o�׉\��
    numStockOnHandQty       NUMBER;         --�ۊǋ�ʕi�ڍ݌Ɏ莝���݌ɐ�

-- MESSAGE �̐錾
    APS_COM_NOTEXIST_ISSUE_CTRL_CD      VARCHAR2(28)     := 'AK50558';     --���o�ɔԍ��̔ԃf�[�^�����݂��܂���
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';     --�n�q�`�b�k�d�G���[
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';     --���̑��G���[
    APS_COM_NOTEXIST_T_OD               VARCHAR2(28)     := 'AK50585';     --���v�ʃf�[�^�����݂��܂���
    APS_COM_NOTEXIST_ISSUE_RSV_CD       VARCHAR2(28)     := 'AK50542';     --�o�ɕۗ��ԍ��̔ԃf�[�^�����݂��܂���

-- LOG �̐錾
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    COMMENT_MSGLOG_SHIPEND              VARCHAR2(88)  := '<< �����o�׏����I�� >>';


BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- �����o�׏����p�f�[�^�ݒ�
    vc2CompanyCd   := pvc2CompanyCd;
    numSlipTyp     := pnumSlipTyp;
    vc2SlipCtrlGrp := pvc2SlipCtrlGrp;
    vc2SlipCd      := pvc2SlipCd;
    dtmSlipDate    := pdtmSlipDate;
    numLineNo      := pnumLineNo;
    vc2UpdOdrNo    := pvc2UpdOdrNo;
    numRcvIssueQty := pnumRcvIssueQty;
    vc2ItemCd      := pvc2ItemCd;
    numMrpOdrTyp   := pnumMrpOdrTyp;
    numOdNo        := pnumOdNo;
    vc2ShipRsvCd   := pvc2ShipRsvCd;
    dtmShipDate    := pdtmShipDate;



    -- �o�א� = 0 and �o�וۗ��ԍ� IS NULL
    IF (numRcvIssueQty = 0) AND (vc2ShipRsvCd IS NULL) THEN

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
        -- �ۊǋ�ʓ��o�ɒǉ�
        INSERT INTO T_RCV_ISSUE(
            RCV_ISSUE_CTRL_CD       --���o�ɊǗ��ԍ�
           ,RCV_ISSUE_TYP           --���o�ɋ敪
           ,ITEM_CD                 --�i�ڔԍ�
           ,PLANT_CD               --�H��R�[�h    
           ,WH_CD                   --�ۊǋ�R�[�h
           ,JOB_ODR_CD              --����
           ,JOB_ODR_DETAIL_NO       --���Ԏ}��
           ,PUCH_ODR_CD             --�����ԍ�
           ,ACPT_NO                 --�����
           ,ACPT_RSLT_CRCT_NO       --������ђ�����
           ,INSPEC_RSLT_CRCT_NO     --�������ђ�����
           ,WORK_ODR_CD             --��ƌv��ԍ�
           ,WORK_IN_PROC_CD         --�d�|��ƃR�[�h
           ,PARTIAL_PRD_NO          --�����
           ,OPR_RSLT_CRCT_NO        --��Ǝ��ђ�����
           ,ISSUE_INST_CD           --�o�Ɏw���ԍ�
           ,RCV_ISSUE_QTY           --���o�ɐ�
           ,RCV_ISSUE_AMOUNT        --���o�ɋ��z
           ,RCV_ISSUE_DATE          --���o�ɔN��
           ,RCV_ISSUE_GNR_TYP       --���o�ɔ����敪
           ,RCV_ISSUE_ODD_QTY       --���o�ɒ[��
           ,DEFECT_CAUSE_CD         --���o�ɕs�Ǘ��R�R�[�h
           ,STOCK_UPD_TYP           --�݌ɍX�V�敪
           ,RCV_ISSUE_CMPLT_FLG     --���o�Ɋ����t���O
           ,OD_NO                   --�I�[�_�f�}���h�ԍ�
           ,COMPANY_CD              --��ЃR�[�h
           ,CREATED_DATE                --�������쐬����
           ,CREATED_BY                  --�������쐬�҃R�[�h
           ,CREATED_PRG_NM  
           ,UPDATED_DATE                --�������ŐV�X�V����
           ,UPDATED_BY                  --�������ŐV�X�V�҃R�[�h
           ,UPDATED_PRG_NM
       ,MODIFY_COUNT    
        ) VALUES (
            vc2NewRcvIssueCtrlCd            --���o�ɊǗ��ԍ�
           ,RCV_ISSUE_TYP_OUT               --���o�ɋ敪(2:�o��)
           ,vc2ItemCd                       --�����̕i�ڔԍ�
           ,pvc2PlantCd                     --�H��R�[�h
           ,NULL                            --�ۊǋ�R�[�h
           ,NULL                            --����
           ,0                               --���Ԏ}��
           ,NULL                            --�����ԍ�
           ,0                               --�����
           ,0                               --������ђ�����
           ,0                               --�������ђ�����
           ,NULL                            --��ƌv��ԍ�
           ,NULL                            --�d�|��ƃR�[�h
           ,0                               --�����
           ,0                               --��Ǝ��ђ�����
           ,NULL                            --�o�Ɏw���ԍ�
           ,0                               --���o�ɐ�
           ,0                               --���o�ɋ��z
           ,dtmShipDate                     --�����̏o�׎��ѓ�
           ,RCV_ISSUE_GNR_TYP_SHIP          --���o�ɔ����敪(31:�o��)
           ,0                               --���o�ɒ[��
           ,NULL                            --���o�ɕs�Ǘ��R�R�[�h
           ,RCV_ISSUE_STOCK_UPD_COMPLTED    --�݌ɍX�V�敪(2:�X�V�ς�)
           ,RCV_ISSUE_CMPLT_FLG_COMPLTED    --���o�Ɋ����t���O(1:����)
           ,numOdNo                         --�����̃I�[�_�f�}���h�ԍ�
           ,vc2CompanyCd                    --��ЃR�[�h
           ,SYSDATE                         --�������쐬����
           ,pvc2UserId                      --�������쐬�҃R�[�h
           ,MY_SQL_NAME
           ,SYSDATE                         --�������ŐV�X�V����
           ,pvc2UserId                      --�������ŐV�X�V�҃R�[�h
           ,MY_SQL_NAME
           ,0
           );
    ELSE

        --�G���[�f�[�^�敪 = ����
        blnErrorDateTyp := FALSE;

        --�G���[�f�[�^�敪 = ����
        IF blnErrorDateTyp = FALSE THEN
    
            -- �i�ڎ�z�敪����
            IF numMrpOdrTyp >= ODR_TYP_MANUAL_ODR
              AND numMrpOdrTyp <= ODR_TYP_ODR_POINT_ODR THEN
                -- �l�q�o�i�ڂ̏ꍇ
        
                -- �o�׉\���Z�o����
                blnRet := FncShipQtyPssibleCalcForMrp(
                                                     pFileHandle
                                                    ,pvc2LogMode
                                                    ,pvc2OutputMode
                                                    ,pvc2UserId
                                                    ,pvc2BusinessName
                            ,pvc2PlantCd    
                                                    ,numRcvIssueQty
                                                    ,vc2ItemCd
                                                    ,blnRetQty
                                                    );
vc2RunChkComment := 'AUTO-SHIP ����=';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


                IF blnRet = FALSE THEN
vc2RunChkComment := 'AUTO-SHIP ����NG=';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    RAISE excQtyCalcMrp;
                END IF;
        
        
        -- �o�׉\����Ɋւ�炸�A�ȍ~��function���R�[������B
        -----�}�C�i�X�݌ɂ���������
        
                -- �o�׏���
vc2RunChkComment := 'AUTO-SHIP �o�ɐ�=';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                blnRet := FncShipForMrp(
                                           pFileHandle
                                          ,pvc2LogMode
                                          ,pvc2OutputMode                                          
                                          ,pvc2UserId
                                          ,pvc2BusinessName
                      ,pvc2PlantCd
                                          ,vc2CompanyCd
                                          ,numSlipTyp
                                          ,vc2SlipCtrlGrp
                                          ,vc2SlipCd
                                          ,dtmSlipDate
                                          ,numLineNo
                                          ,vc2UpdOdrNo
                                          ,numRcvIssueQty
                                          ,vc2ItemCd
                                          ,numMrpOdrTyp
                                          ,numOdNo
                                          ,dtmShipDate
                                          ,pnumCnt_ITEM_STOCK
                                          ,pnumCnt_JOB_ODR_CD_STOCK
                                          );
            
                 IF blnRet = FALSE THEN
vc2RunChkComment := 'AUTO-SHIP FncShipForMrp NG';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        RAISE excShipForMrp;
                 END IF;

vc2RunChkComment := 'AUTO-SHIP FncShipForMrp OK';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
         END IF;            
    END IF;
    END IF;

RETURN TRUE;

EXCEPTION

    WHEN excNoShipRsv THEN  --�o�וۗ�����
--DBMS_OUTPUT.PUT_LINE('�o�וۗ�����');
        ROLLBACK;
        vc2Comment := '(SBM0001)�o�וۗ��f�[�^����';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excQtyCalcMrp THEN  --�l�q�o�o�׉\�����f�G���[
--DBMS_OUTPUT.PUT_LINE('�l�q�o�o�׉\�����f�G���[');
        ROLLBACK;
        vc2Comment := '(SBM0002)�l�q�o�o�׉\�����f�G���[';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excQtyCalcJobOdr THEN  --���ԏo�׉\�����f�G���[
--DBMS_OUTPUT.PUT_LINE('���ԏo�׉\�����f�G���[');
        ROLLBACK;
        vc2Comment := '(SBM0003)���ԏo�׉\�����f�G���[';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excReleaseShipRsv THEN  --�o�וۗ��敪�����G���[
--DBMS_OUTPUT.PUT_LINE('�o�וۗ��敪�����G���[');
        ROLLBACK;
        vc2Comment := '(SBM0004)�o�וۗ��敪�����G���[';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excMakeShipRsv THEN  --�o�וۗ��쐬�G���[
--DBMS_OUTPUT.PUT_LINE('�o�וۗ��쐬�G���[');
        ROLLBACK;
        vc2Comment := '(SBM0005)�o�וۗ��쐬�G���[';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excShipForMrp THEN  --�l�q�o�o�׏����G���[
--DBMS_OUTPUT.PUT_LINE('�l�q�o�o�׏����G���[');
        ROLLBACK;
        vc2Comment := '(SBM0006)�l�q�o�o�׏����G���[';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excShipForJobOdr THEN  --���ԏo�׏����G���[
--DBMS_OUTPUT.PUT_LINE('���ԏo�׏����G���[');
        ROLLBACK;
        vc2Comment := '(SBM0007)���ԏo�׏����G���[';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excGetNewIssueCd  THEN  --���o�ɊǗ��ԍ��擾�G���[
--dbms_output.put_line('���o�ɊǗ��ԍ��擾�G���[');
        ROLLBACK;
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_ISSUE_CTRL_CD, '');
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excGetNewShipRsvCd  THEN  --�o�וۗ��ԍ��擾�G���[
--dbms_output.put_line('�o�וۗ��ԍ��擾�G���[');
        ROLLBACK;
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_ISSUE_RSV_CD, '');
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('���̑��G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0008)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
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
