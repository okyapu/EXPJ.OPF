CREATE OR REPLACE FUNCTION FNCSHIPFORMRP(
/*------------------------------------------------------------------------------
' $Id: FncShipForMrp.sql,v 1.3 2011/12/23 03:19:44 feng-yi Exp $
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2003.11.05 DBMS_OUTPUT�̃R�����g�A�E�g
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
'
' �@�\      : �����o�׏����i�l�q�o�n�i�ڗp�j
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
'             pnumRcvIssueQty           - (i) �o�׎��ѐ�
'             pvc2ItemCd                - (i) �i�ڔԍ�
'             pnumMrpOdrTyp             - (i) �i�ڎ�z�敪
'             pnumOdNo                  - (i) �I�[�_�f�}���h�ԍ�
'             pdtmShipDate              - (i) �o�׎��ѓ�
'             pnumCnt_ITEM_STOCK        - (io)�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
'             pnumCnt_JOB_ODR_CD_STOCK  - (io)�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
'
' �@�\����  : FncAutoShip�i�����o�׏����j����g�p����
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                 IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                  IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2            --�Ɩ���
    ,pvc2PlantCd            IN  VARCHAR2              --// �H��R�[�h
   ,pvc2CompanyCd               IN  VARCHAR2            --��ЃR�[�h
   ,pnumSlipTyp                 IN  NUMBER              --�`�[���
   ,pvc2SlipCtrlGrp             IN  VARCHAR2            --�`�[�Ǘ��O���[�v
   ,pvc2SlipCd                  IN  VARCHAR2            --�`�[�ԍ�
   ,pdtmSlipDate                IN  DATE                --�`�[���t
   ,pnumLineNo                  IN  NUMBER              --�s
   ,pvc2UpdOdrNo                IN  VARCHAR2            --�X�V����
   ,pnumRcvIssueQty             IN  NUMBER              --�o�׎��ѐ�
   ,pvc2ItemCd                  IN  VARCHAR2            --�i�ڔԍ�
   ,pnumMrpOdrTyp               IN  NUMBER              --�i�ڎ�z�敪
   ,pnumOdNo                    IN  NUMBER              --�I�[�_�f�}���h�ԍ�
   ,pdtmShipDate                IN  DATE                --�o�׎��ѓ�
   ,pnumCnt_ITEM_STOCK          IN OUT  NUMBER          --�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
   ,pnumCnt_JOB_ODR_CD_STOCK    IN OUT  NUMBER          --�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
)RETURN BOOLEAN
IS
    -- ��O�̐錾 
    excNoShipReq                        EXCEPTION;          --�o�חv������
    excGetNewIssRsvCd                   EXCEPTION;          --�o�וۗ��ԍ��擾�G���[
    excInvalidItemStock                 EXCEPTION;          --�ۊǋ�ʕi�ڍ݌ɖ���
--
    excInvalidHW_CD         EXCEPTION;      --�o�ɐ�ۊǋ�Ȃ�              

    -- �萔�̐錾
    MY_SQL_NAME             VARCHAR2(52)    := 'FncShipForMrp';
    MRPFLAG_TARGET          NUMBER          := 1;   --�ۊǋ�-MRP�Ώۃt���O(1:MRP�Ώ�)
    RCV_ISSUE_TYP_OUT       NUMBER          := 2;   --�ۊǋ�ʓ��o��-���o�ɋ敪(2:�o��)
    RCV_ISSUE_GNR_TYP_SHIP  NUMBER          := 31;  --�ۊǋ�ʓ��o��-���o�ɔ����敪(31:�o��)
    RCV_ISSUE_STOCK_UPD_COMPLTED  NUMBER    := 2;   --�ۊǋ�ʓ��o��-�݌ɍX�V�敪(2:�X�V�ς�)
    RCV_ISSUE_CMPLT_FLG_COMPLTED  NUMBER    := 1;   --�ۊǋ�ʓ��o��-���o�Ɋ����t���O(1:����)

    -- �ϐ��̐錾 
    blnRet                  BOOLEAN;        --�֐��߂�l
    intRet                  INTEGER;        --�֐��߂�l
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    blnItemStockFlg         BOOLEAN;        --�ۊǋ�ʕi�ڍ݌ɗL�����f�t���O
    numWorkShipQty          NUMBER;         --�v�n�q�j�o�׎c��
    numRcvShipQty           NUMBER;         --���o�א�
    vc2RunChkComment        VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
   
    blnWHStockFlg         BOOLEAN;        --�o�ɐ�̕ۊǋ��ۊǋ�l���擾���邩�̔��f�t���O


    
-- MESSAGE �̐錾 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --�n�q�`�b�k�d�G���[
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --���̑��G���[
    APS_INVALID_ITEM_STOCK              VARCHAR2(28)     := 'AK52026';    --�o�ɉ\���Z�o�����Ō��������͂��̕ۊǋ�ʕi�ڍ݌Ƀf�[�^�����݂��Ă��܂���
--
    APS_INVALID_WH_CD           VARCHAR2(28)   := 'AK00026';  --�o�ɉ\�ȕۊǋ悪������܂���B
-- LOG �̐錾 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    COMMENT_MSGLOG_END                  VARCHAR2(144)  := '<< �����o�׏����i�l�q�o�n�i�ڗp�j >>';

    -- �J�[�\���̐錾 
    -- �ۊǋ�ʕi�ڍ݌� 
    CURSOR curT_ITEM_STOCK(
        cvc2ItemCd          VARCHAR2,
        cvc2PlantCd     VARCHAR2        --   �H��R�[�h
        )
    IS
        SELECT A.ITEM_CD, A.WH_CD, A.STOCK_ON_HAND_QTY
            FROM   T_ITEM_STOCK A, M_WH B, M_WH_PRIORITY C
            WHERE  A.WH_CD   = B.WH_CD(+)
              AND  A.ITEM_CD = C.ITEM_CD(+)
              AND  A.WH_CD   = C.WH_CD(+)
              AND  A.ITEM_CD = cvc2ItemCd
              AND  A.STOCK_ON_HAND_QTY > 0
              AND  B.MRP_FLG = MRPFLAG_TARGET
          AND  A.PLANT_CD = cvc2PlantCd
            ORDER BY C.WH_PRIORITY_REF_NO, A.WH_CD;

    --�H��l  ��\�[���ꏊ�̎擾 
    CURSOR  CurM_PLANT(
        cVc2PLANT_CD     VARCHAR2        --   �H��R�[�h
    )IS
    SELECT  M1.WH_CD                    --�ۊǋ�
    FROM    M_PLANT M1,M_WH M2
    WHERE  M1.PLANT_CD = cVc2PLANT_CD AND
           M1.WH_CD IS NOT NULL  AND
           M2.MRP_FLG = 1 AND
           M1.PLANT_CD=M2.PLANT_CD AND
           M1.WH_CD = M2.WH_CD;

    -- �i�ڕʕۊǐ�D�揇�ʂ��A�D�揇�ʂ̐擪�̂��� 
    CURSOR curM_WH_PRIORITY(
        cvc2ItemCd          VARCHAR2,
        cvc2PlantCd     VARCHAR2        --   �H��R�[�h
        )
    IS
        SELECT C.ITEM_CD, C.WH_CD
            FROM   M_WH B, M_WH_PRIORITY C
            WHERE    C.ITEM_CD = cvc2ItemCd
        AND  C.PLANT_CD = cvc2PlantCd
                AND  B.MRP_FLG = MRPFLAG_TARGET
        AND  C.WH_CD   = B.WH_CD
            ORDER BY C.WH_PRIORITY_REF_NO, C.WH_CD;

    --�y�ۊǋ�l�z �Ō�̏o�ɐ�
    CURSOR  CurM_WH(
        cVc2PLANT_CD     VARCHAR2        --   �H��R�[�h
    )IS
    SELECT  WH_CD                    --�ۊǋ�
    FROM    M_WH
    WHERE  PLANT_CD = cVc2PLANT_CD AND
    MRP_FLG = 1  
    ORDER BY WH_CD;

-----------------
-- ROWTYPE�錾 --
-----------------
    RtpM_PLANT                       CurM_PLANT%ROWTYPE;        
    RtpM_WH_PRIORITY                     CurM_WH_PRIORITY%ROWTYPE; 
    RtpM_WH                          CurM_WH%ROWTYPE; 

--�J�[�\�������J�E���g�p
    num_M_PLANT_Count                     NUMBER(10); 
    num_M_WH_PRIORITY_Count                   NUMBER(10);   
    num_M_WH_Count                    NUMBER(10);   

BEGIN

----****************************************************************************************
---  �o�ɐ�̕ۊǋ悪���݂��Ȃ������ꍇ�́A�G���[�Ƃ���B
---�@�@�@�Ɩ����O�o�͂ŁAROLLBACK
---*****************************************************************************************
    -- �ۊǋ�ʕi�ڍ݌Ƀf�[�^�擾

    numWorkShipQty := pnumRcvIssueQty;
    blnItemStockFlg := FALSE;

    FOR curT_ITEM_STOCK_REC IN curT_ITEM_STOCK(pvc2ItemCd,pvc2PlantCd) LOOP
        blnItemStockFlg := TRUE;

vc2RunChkComment := 'MRP_�ۊǋ�݌ɂ���-01';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
        -- [�ۊǋ�ʕi�ڍ݌�].�莝�݌ɐ��� �� WORK�o�׎c���� �召�֌W�`�F�b�N
        IF curT_ITEM_STOCK_REC.STOCK_ON_HAND_QTY >= numWorkShipQty THEN

vc2RunChkComment := 'MRP_�ۊǋ�݌ɂ���-02';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
            -- [�ۊǋ�ʕi�ڍ݌�].�莝�݌ɐ��� ���� WORK�o�׎c�� �̏ꍇ
            -- Work�o�׎c�� �𕉐��ɂ���[���o��].���o�א��ɐݒ�
            numRcvShipQty := numWorkShipQty * -1;
        
            -- [���o��]���R�[�h���ڐݒ�,�ǉ��C�o�׏���
            blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,curT_ITEM_STOCK_REC.ITEM_CD
                                   ,curT_ITEM_STOCK_REC.WH_CD
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                   );
            IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-05'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                RETURN FALSE;
            END IF;
            -- Work�o�׎c�� �� Work�o�׎c�� �{ [���o��].���o�א�
            -- ���ۂɂ͕����������Ă���̂Ō��Z�ɑ�������B
            numWorkShipQty := numWorkShipQty + numRcvShipQty;
            -- �d������ �k�������i���̕i�ڂɊւ���o�׏����͊����j
            EXIT;
        ELSE

vc2RunChkComment := 'MRP_�ۊǋ�݌ɂ���-03';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
            -- [�ۊǋ�ʕi�ڍ݌�(i)].�莝�݌ɐ��� �� WORK�o�׎c�� �̏ꍇ
            -- [�ۊǋ�ʕi�ڍ݌�].�莝���݌ɐ��ʂ𕉐��ɂ���[���o��].���o�א��ɐݒ�
            numRcvShipQty := -1 * curT_ITEM_STOCK_REC.STOCK_ON_HAND_QTY;
        
            -- [���o��]���R�[�h���ڐݒ�,�ǉ��C�o�׏���
            blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd 
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,curT_ITEM_STOCK_REC.ITEM_CD
                                   ,curT_ITEM_STOCK_REC.WH_CD
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                   );
            IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-04'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                RETURN FALSE;
            END IF;
        END IF;
         
        -- Work�o�׎c�� �� Work�o�׎c�� �{ [���o��].���o�א�
        -- ���ۂɂ͕����������Ă���̂Ō��Z�ɑ�������B
        numWorkShipQty := numWorkShipQty + numRcvShipQty;
        
    END LOOP;
    
    -- �ۊǋ�ʕi�ڍ݌ɗL�����f
    IF blnItemStockFlg = FALSE THEN
------�������Ώۂ̕ۊǋ悪�݌Ɂ����O�A���R�[�h�����݂̏ꍇ�AFALSE�ƂȂ��Ă��܂�����
------�ēx�A�D�揇�ʂƕۊǋ���A�������Ƃ��Ώۂ̕ۊǋ���擾����B
        SELECT COUNT(*) INTO num_M_WH_PRIORITY_Count
    FROM   M_WH B, M_WH_PRIORITY C
    WHERE    C.ITEM_CD = pvc2ItemCd
    AND  C.PLANT_CD = pvc2PlantCd
        AND  B.MRP_FLG = MRPFLAG_TARGET
    AND  C.WH_CD   = B.WH_CD;
    IF num_M_WH_PRIORITY_Count > 0 THEN 
                ---�ۊǋ�ʕi�ڍ݌ɂ̗L���Ɋւ�炸�A�擾�����ۊǋ���o�� 
        OPEN CurM_WH_PRIORITY(pvc2ItemCd,pvc2PlantCd);   
        FETCH CurM_WH_PRIORITY INTO RtpM_WH_PRIORITY;
            
                IF CurM_WH_PRIORITY%FOUND THEN     --���ݎ�
            --�o�ɐ����Z�o���āA�ȍ~�̏�����    
                    -- Work�o�׎c�� �𕉐��ɂ���[���o��].���o�א��ɐݒ�
                    numRcvShipQty := numWorkShipQty * -1;
        
vc2RunChkComment := 'MRP_�ۊǋ�D�揇�ʂ��-01=';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
        
                    -- [���o��]���R�[�h���ڐݒ�,�ǉ��C�o�׏���
                    blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,pvc2ItemCd              --�i��
                                   ,RtpM_WH_PRIORITY.WH_CD            --�ۊǋ�(�ۊǋ�l�j
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                 );
                    IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-01'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        RETURN FALSE;
        
                    END IF;
                    -- Work�o�׎c�� �� Work�o�׎c�� �{ [���o��].���o�א�
                    -- ���ۂɂ͕����������Ă���̂Ō��Z�ɑ�������B
                    numWorkShipQty := numWorkShipQty + numRcvShipQty;
                
        END IF;
        ELSE
vc2RunChkComment := 'MRP_�ۊǋ�݌ɂȂ�-01';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
            -- �ۊǋ�ʕi�ڍ݌ɂ��S������
        --�H��l���A��\�[���ꏊ�擾
            --�H��l�̑�\�[���ꏊ�����ݒ�̏ꍇ�́A
            --�ۊǋ�̕ۊǋ�R�[�h�̍ŏ��̂��̂��A�o�ɂ���B
            SELECT  COUNT(*) INTO num_M_PLANT_Count
            FROM    M_PLANT M1,M_WH M2
            WHERE  M1.PLANT_CD = pvc2PlantCd AND
            M1.WH_CD IS NOT NULL  AND
            M2.MRP_FLG = 1 AND
            M1.PLANT_CD=M2.PLANT_CD AND
            M1.WH_CD = M2.WH_CD;
                            
        IF num_M_PLANT_Count > 0 THEN 
            --�H��l���A�ۊǋ�R�[�h�擾 
                    ---�ۊǋ�ʕi�ڍ݌ɂ̗L���Ɋւ�炸�A�擾�����ۊǋ���o�� 
            OPEN CurM_PLANT(pvc2PlantCd);   
            FETCH CurM_PLANT INTO RtpM_PLANT;
    
                    IF CurM_PLANT%FOUND THEN     --���ݎ�
                --�o�ɐ����Z�o���āA�ȍ~�̏�����    
                        -- Work�o�׎c�� �𕉐��ɂ���[���o��].���o�א��ɐݒ�
                        numRcvShipQty := numWorkShipQty * -1;
    
vc2RunChkComment := 'MRP_�H��l���-01=';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
        
                        -- [���o��]���R�[�h���ڐݒ�,�ǉ��C�o�׏���
                        blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp  
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,pvc2ItemCd              --�i��
                                   ,RtpM_PLANT.WH_CD            --�ۊǋ�(�H��l)
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                    );
                        IF blnRet = FALSE THEN
    
vc2RunChkComment := 'FncMakeRcvShip-NG-03'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            RETURN FALSE;
                        END IF;
                        -- Work�o�׎c�� �� Work�o�׎c�� �{ [���o��].���o�א�
                        -- ���ۂɂ͕����������Ă���̂Ō��Z�ɑ�������B
                        numWorkShipQty := numWorkShipQty + numRcvShipQty;
            END IF;
    
        else  --�H��l�ɑΏۃf�[�^�Ȃ�
            ---�ۊǋ�l���A����������擾����B
                ---�ۊǋ�ʕi�ڍ݌ɂ̗L���Ɋւ�炸�A�擾�����ۊǋ���o��                     
            SELECT  COUNT(*)  INTO num_M_WH_Count               --�ۊǋ�
                FROM    M_WH
                WHERE  PLANT_CD = pvc2PlantCd AND
                MRP_FLG = 1;
    
            IF num_M_WH_Count > 0 THEN 
                        ---�ۊǋ�ʕi�ڍ݌ɂ̗L���Ɋւ�炸�A�擾�����ۊǋ���o�� 
                OPEN CurM_WH(pvc2PlantCd);   
                FETCH CurM_WH INTO RtpM_WH;
    
                        IF CurM_WH%FOUND THEN     --���ݎ�
            
        
                    --�o�ɐ����Z�o���āA�ȍ~�̏�����    
                            -- Work�o�׎c�� �𕉐��ɂ���[���o��].���o�א��ɐݒ�
                            numRcvShipQty := numWorkShipQty * -1;
        
vc2RunChkComment := 'MRP_�ۊǋ�l���-01=';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
        
        
                            -- [���o��]���R�[�h���ڐݒ�,�ǉ��C�o�׏���
                            blnRet := FncMakeRcvShip(
                                        pFileHandle
                                       ,pvc2LogMode
                                       ,pvc2OutputMode
                                       ,pvc2UserId
                                       ,pvc2BusinessName
                           ,pvc2PlantCd
                                       ,pvc2CompanyCd
                                           ,pnumSlipTyp
                                       ,pvc2SlipCtrlGrp
                                        ,pvc2SlipCd
                                        ,pdtmSlipDate
                                        ,pnumLineNo
                                        ,pvc2ItemCd             --�i��
                                        ,RtpM_WH.WH_CD            --�ۊǋ�(�ۊǋ�l�j
                                        ,pnumOdNo
                                        ,numRcvShipQty
                                        ,pdtmShipDate
                                        ,NULL
                                        ,0
                                        ,pnumCnt_ITEM_STOCK
                                        ,pnumCnt_JOB_ODR_CD_STOCK
                                        );
                            IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-02'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
                                RETURN FALSE;
                            END IF;
                            -- Work�o�׎c�� �� Work�o�׎c�� �{ [���o��].���o�א�
                            -- ���ۂɂ͕����������Ă���̂Ō��Z�ɑ�������B
                            numWorkShipQty := numWorkShipQty + numRcvShipQty;
            
                END IF;
            ELSE  ---�o�ɐ�̕ۊǋ悪������Ȃ������ꍇ
                ---�G���[���b�Z�[�W���Ɩ����O�ɏo�͂��āAROLLBACK �ȍ~�̏����͍s�Ȃ�Ȃ�
                RAISE excInvalidHW_CD;
            END IF;
        end if;
    
    END IF; 


    ELSE
        IF numWorkShipQty > 0 THEN
            -- �ۊǋ�ʕi�ڍ݌ɂ����邪���ʂ�����Ȃ�
        -- �i�ڕʕۊǋ�D�揇�ʂ̏��ʂ̍ŏ��̂��̂��o��          
            SELECT COUNT(*) INTO num_M_WH_PRIORITY_Count
                FROM   M_WH B, M_WH_PRIORITY C
                WHERE    C.ITEM_CD = pvc2ItemCd
        AND  C.PLANT_CD = pvc2PlantCd
                AND  B.MRP_FLG = MRPFLAG_TARGET
        AND  C.WH_CD   = B.WH_CD;
        IF num_M_WH_PRIORITY_Count > 0 THEN 
                    ---�ۊǋ�ʕi�ڍ݌ɂ̗L���Ɋւ�炸�A�擾�����ۊǋ���o�� 
            OPEN CurM_WH_PRIORITY(pvc2ItemCd,pvc2PlantCd);   
            FETCH CurM_WH_PRIORITY INTO RtpM_WH_PRIORITY;
            
                    IF CurM_WH_PRIORITY%FOUND THEN     --���ݎ�
                --�o�ɐ����Z�o���āA�ȍ~�̏�����    
                        -- Work�o�׎c�� �𕉐��ɂ���[���o��].���o�א��ɐݒ�
                        numRcvShipQty := numWorkShipQty * -1;
        
vc2RunChkComment := 'MRP_�ۊǋ�D�揇�ʂ��-01=';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
        
                        -- [���o��]���R�[�h���ڐݒ�,�ǉ��C�o�׏���
                        blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,pvc2ItemCd              --�i��
                                   ,RtpM_WH_PRIORITY.WH_CD            --�ۊǋ�(�ۊǋ�l�j
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                   );
                        IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-01'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            RETURN FALSE;
        
                        END IF;
                        -- Work�o�׎c�� �� Work�o�׎c�� �{ [���o��].���o�א�
                        -- ���ۂɂ͕����������Ă���̂Ō��Z�ɑ�������B
                        numWorkShipQty := numWorkShipQty + numRcvShipQty;
                
            END IF;
        END IF;
        


        END IF;
    END IF;


--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;

EXCEPTION
    WHEN excInvalidHW_CD  THEN  --�o�ɉ\�ȕۊǋ悪������܂���B
--dbms_output.put_line('�o�ɉ\�ȕۊǋ悪������܂���B');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_INVALID_WH_CD, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excInvalidItemStock THEN  --�ۊǋ�ʕi�ڍ݌ɖ���
--DBMS_OUTPUT.PUT_LINE('�ۊǋ�ʕi�ڍ݌ɖ���');
        ROLLBACK;
        vc2Comment := '';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_INVALID_ITEM_STOCK, vc2Comment);
        -- TraceLog �̏o�� 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('���̑��G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0056)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog �̏o�� 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
END;
/
