CREATE OR REPLACE FUNCTION FNCSHIP(
/*------------------------------------------------------------------------------
' $Id: FncShip.sql,v 1.4 2013/06/03 07:31:11 tai-yanhong Exp $
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2003.11.05 DBMS_OUTPUT�̃R�����g�A�E�g
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
'
' �@�\      : �o�׏����܂��͏o�׎������
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle               - (i) �t�@�C���n���h��
'             pvc2LogMode               - (i) �k�n�f���[�h
'             pvc2OutputMode            - (i) �o�̓��[�h
'             pvc2UserId                - (i) ���[�U�h�c
'             pvc2BusinessName          - (i) �Ɩ���
'             pvc2PlantCd               - (i)�H��R�[�h
'             pvc2RcvIssueCtrlCd        - (i) ���o�ɊǗ��ԍ�
'             pnumCnt_ITEM_STOCK        - (io)�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
'             pnumCnt_JOB_ODR_CD_STOCK  - (io)�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
'
' �@�\����  : FncShipReq�i�݌ɏo�ɏ����j����g�p����
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode                 IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode              IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId                  IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName            IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h        
   ,pvc2RcvIssueCtrlCd          IN  VARCHAR2            --���o�ɊǗ��ԍ�
   ,pnumCnt_ITEM_STOCK          IN OUT  NUMBER          --�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
   ,pnumCnt_JOB_ODR_CD_STOCK    IN OUT  NUMBER          --�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
)RETURN BOOLEAN
IS
    -- ��O�̐錾 
    excErr                              EXCEPTION;          --�G���[

    -- �萔�̐錾
    MY_SQL_NAME             VARCHAR2(28)     := 'FncShip';
    RCV_ISSUE_TYP_OUT       NUMBER          := 2;   --�ۊǋ�ʓ��o��-���o�ɋ敪(2:�o��)
    RCV_ISSUE_GNR_TYP_SHIP  NUMBER          := 31;  --�ۊǋ�ʓ��o��-���o�ɔ����敪(31:�o��)
    RCV_ISSUE_GNR_TYP_CANSHIP NUMBER        := 39;  --�ۊǋ�ʓ��o��-���o�ɔ����敪(39:�o�׎��)
    JOB_ODR_ALC_STOCKTYP_JOBORDR NUMBER     := 2;   --���Ԉ���-�����݌ɋ敪(2:���ԍ݌�)
    JOB_ODR_ALC_STOCKTYP_ITEM NUMBER        := 1;   --���Ԉ���-�����݌ɋ敪(1:�݌�(�]�肩��))

    -- �ϐ��̐錾 
    blnRet                  BOOLEAN;        --�֐��߂�l
    intRet                  INTEGER;        --�֐��߂�l
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�    
    numMessageNo            NUMBER(5);      --���b�Z�[�W�ԍ�
    numRcvIssueTyp          NUMBER(2);      --���o�ɋ敪
    vc2ItemCd               VARCHAR2(100);   --�i�ڔԍ�
    vc2WhCd                 VARCHAR2(100);   --�ۊǋ�R�[�h
    vc2JobOdrCd             VARCHAR2(100);   --����
    numJobOdrDetailNo       NUMBER(6);      --���Ԏ}��
    numRcvIssueQty          NUMBER(18,4);   --���o�ɐ�
    numRcvIssueGnrTyp       NUMBER(2);      --���o�ɔ����敪
    numOdNo                 NUMBER(14);     --�I�[�_�f�}���h�ԍ�
    dtmBusinessOprDate      DATE;           --�Ɩ��^�p��
    dtmRcvIssueDate         DATE;           --���o�ɔN����

-- MESSAGE �̐錾 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --�n�q�`�b�k�d�G���[
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --���̑��G���[
    APS_COM_NOTEXIST_T_RCV_ISSUE        VARCHAR2(28)     := 'AK50594';    --�ۊǋ�ʓ��o�Ƀf�[�^�����݂��܂���
    APS_CEISSUE_INVALID_RCVISSTYP       VARCHAR2(28)     := 'AK52141';    --���o�ɋ敪���s���ł�
    APS_CEISSUE_INVALID_RCVISSQTY       VARCHAR2(28)     := 'AK52146';    --���o�ɐ��������ɂȂ��Ă��܂���
    APS_CECANCEL_INVALID_RCVISSQTY      VARCHAR2(28)     := 'AK52053';    --���o�ɐ��������ɂȂ��Ă��܂���
    APS_CEISSUE_INV_RCVISSGNRTYP        VARCHAR2(28)     := 'AK52142';    --���o�ɔ����敪���s���ł�
    APS_COM_NOTEXIST_SYS_DATE_CTRL      VARCHAR2(28)     := 'AK50537';    --���t����f�[�^�����݂��܂���
    APS_INVALID_ITEM_STOCK              VARCHAR2(28)     := 'AK52026';    --�o�ɉ\���Z�o�����Ō��������͂��̕ۊǋ�ʕi�ڍ݌Ƀf�[�^�����݂��Ă��܂���
    APS_COM_NOTEXIST_T_OD               VARCHAR2(28)     := 'AK50585';    --���v�ʃf�[�^�����݂��܂���

-- LOG �̐錾 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    COMMENT_MSGLOG_END                  VARCHAR2(56)  := '<< �o�׏��� >>';

    -- �o�׏����p ���v�ʁi���ԍ݌Ɂj
    FUNCTION FncShipIOd RETURN BOOLEAN IS
    
        numOdrQty                       NUMBER(18,4);
        numTotalIssueQty                NUMBER(18,4);
        dtmIssueCmpltDate               DATE;
        
    BEGIN
    
        -- �Ɩ��^�p���擾
        BEGIN
            SELECT  BUSINESS_OPR_DATE INTO dtmBusinessOprDate
              FROM  SYS_DATE_CTRL
        WHERE PLANT_CD = pvc2PlantCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                numMessageNo := APS_COM_NOTEXIST_SYS_DATE_CTRL;
                RAISE excErr;
            WHEN OTHERS THEN
                RAISE;
        END;
    
        BEGIN
    
            SELECT ODR_QTY,TOTAL_ISSUE_QTY INTO numOdrQty,numTotalIssueQty
                FROM  T_OD
                WHERE OD_NO = numOdNo
                      AND PLANT_CD = pvc2PlantCd
                FOR UPDATE;
    
            numTotalIssueQty := numTotalIssueQty - numRcvIssueQty;
            IF numOdrQty <= numTotalIssueQty THEN
                dtmIssueCmpltDate := dtmRcvIssueDate;       --�ۊǋ�ʓ��o��.���o�ɔN����
            ELSE
                dtmIssueCmpltDate := NULL;
            END IF;
        
            UPDATE T_OD SET
                -- �o�ɗ݌v�����o�ɗ݌v���{�i�|�i�o�ɐ��ʁj�j
                TOTAL_ISSUE_QTY = numTotalIssueQty
               ,TOTAL_ISSUE_INST_QTY = numTotalIssueQty  --�u�a�̃\�[�X�͏o�ɗ݌v�����̂܂ܐݒ肵�Ă���
               ,ISSUE_CMPLT_DATE = dtmIssueCmpltDate
                WHERE  OD_NO = numOdNo
        AND PLANT_CD = pvc2PlantCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                numMessageNo := APS_COM_NOTEXIST_T_OD;
                RAISE excErr;
            WHEN OTHERS THEN
                RAISE;
        END;
    
        RETURN TRUE;
    EXCEPTION
    
        WHEN excErr THEN  --�G���[
            ROLLBACK;
            vc2Comment := '';
            -- �G���[���b�Z�[�W�̏o��
            blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                MY_SQL_NAME, numMessageNo, vc2Comment);
            -- TraceLog �̏o�� 
            blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, LOGMSG_END);
            COMMIT;
            RETURN FALSE;
    
        WHEN OTHERS THEN
            ROLLBACK;
            vc2Comment := SUBSTRB('(SBM0055)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '�F' ||
                                 SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                                 1,1024);
            -- �G���[���b�Z�[�W�̏o��
            blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
            -- TraceLog �̏o�́i���s�ʒu�j
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

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- TraceLog �̏o�� 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- �ۊǋ�ʓ��o�Ƀ��R�[�h�`�F�b�N����

    -- �ۊǋ�ʓ��o�Ɍ���
    BEGIN
        SELECT  RCV_ISSUE_TYP       --���o�ɋ敪
               ,ITEM_CD             --�i�ڔԍ�
               ,WH_CD               --�ۊǋ�R�[�h
               ,JOB_ODR_CD          --����
               ,JOB_ODR_DETAIL_NO   --���Ԏ}��
               ,RCV_ISSUE_QTY       --���o�ɐ�
               ,RCV_ISSUE_GNR_TYP   --���o�ɔ����敪
               ,OD_NO               --�I�[�_�f�}���h�ԍ�
               ,RCV_ISSUE_DATE      --���o�ɔN����
                INTO
                numRcvIssueTyp
               ,vc2ItemCd
               ,vc2WhCd
               ,vc2JobOdrCd
               ,numJobOdrDetailNo
               ,numRcvIssueQty
               ,numRcvIssueGnrTyp
               ,numOdNo
               ,dtmRcvIssueDate
          FROM  T_RCV_ISSUE
          WHERE RCV_ISSUE_CTRL_CD = pvc2RcvIssueCtrlCd
      AND PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN  --�Y������
            numMessageNo := APS_COM_NOTEXIST_T_RCV_ISSUE;
            RAISE excErr;
        WHEN OTHERS THEN
            RAISE;
    END;

    --mhase
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'pvc2RcvIssueCtrlCd' || pvc2RcvIssueCtrlCd);


--dbms_output.put_line('���o�ɋ敪�@�@�@�@�F' || numrcvissuetyp);
--dbms_output.put_line('�i�ڔԍ��@�@�@�@�@�F' || vc2itemcd);
--dbms_output.put_line('�ۊǋ�@�@�@�@�@�@�F' || vc2whcd);
--dbms_output.put_line('���ԁ@�@�@�@�@�@�@�F' || vc2jobodrcd);
--dbms_output.put_line('���Ԏ}�ԁ@�@�@�@�@�F' || numjobodrdetailno);
--dbms_output.put_line('���o�ɐ��@�@�@�@�@�F' || numrcvissueqty);
--dbms_output.put_line('���o�ɔ����敪�@�@�F' || numrcvissuegnrtyp);
--dbms_output.put_line('�I�[�_�f�}���h�ԍ��F' || numodno);

--vc2RunChkComment := '���������ʉ� SHIP-01';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- ���o�ɋ敪�̃`�F�b�N
    IF numRcvIssueTyp <> RCV_ISSUE_TYP_OUT THEN
        -- ���o�ɋ敪���s���ł�
        numMessageNo := APS_CEISSUE_INVALID_RCVISSTYP;
        RAISE excErr;
    END IF;

    -- ���o�ɔ����敪�̃`�F�b�N
    -- ���o�ɔ����敪�i�o�׏��� Or �o�׎�������j�ȊO�G���[
    IF numRcvIssueGnrTyp = RCV_ISSUE_GNR_TYP_SHIP THEN
        -- �o�׏����̏ꍇ
--vc2RunChkComment := '���������ʉ� SHIP-02';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        -- ���o�ɐ����O���傫����΃G���[�Ƃ���
        IF numRcvIssueQty > 0 THEN
--vc2RunChkComment := '���������ʉ� SHIP-03';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            -- ���o�ɐ��������ɂȂ��Ă��܂���
            numMessageNo := APS_CEISSUE_INVALID_RCVISSQTY;
            RAISE excErr;
        END IF;

    ELSIF numRcvIssueGnrTyp = RCV_ISSUE_GNR_TYP_CANSHIP THEN
--vc2RunChkComment := '���������ʉ� SHIP-04';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        -- �o�׎�������̏ꍇ
        -- ���o�ɐ����O�����ł���΃G���[�Ƃ���
        IF numRcvIssueQty < 0 THEN
--vc2RunChkComment := '���������ʉ� SHIP-05';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- ���o�ɐ��������ɂȂ��Ă��܂���
            numMessageNo := APS_CECANCEL_INVALID_RCVISSQTY;
            RAISE excErr;
        END IF;

    ELSE
--vc2RunChkComment := '���������ʉ� SHIP-06';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        -- �o�׏����A�o�׎�������ȊO�̏ꍇ
        -- ���o�ɔ����敪���s���ł�
        numMessageNo := APS_CEISSUE_INV_RCVISSGNRTYP;
        RAISE excErr;

    END IF;

    -- ���o�ɔ����敪����
    IF numRcvIssueQty > 0 THEN
--vc2RunChkComment := '���������ʉ� SHIP-07';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- [�ۊǋ�ʓ��o��].���� �� Null �̏ꍇ

            -- �ۊǋ�ʕi�ڍ݌ɍX�V
            UPDATE T_ITEM_STOCK SET
                STOCK_ON_HAND_QTY = STOCK_ON_HAND_QTY + numRcvIssueQty
               ,UPDATED_DATE = SYSDATE
               ,UPDATED_BY = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1            
                WHERE  ITEM_CD = vc2ItemCd
                  AND  WH_CD = vc2WhCd
          AND  PLANT_CD = pvc2PlantCd;

            --�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V�����̃C���N�������g
            pnumCnt_ITEM_STOCK := pnumCnt_ITEM_STOCK + 1;

            IF SQL%NOTFOUND THEN
                -- �q�b�g���Ȃ������ꍇ

                -- �ۊǋ�ʕi�ڍ݌ɒǉ�
                INSERT INTO T_ITEM_STOCK (
                                          ITEM_CD
                                         ,WH_CD
                     ,PLANT_CD  
                                         ,STOCK_ON_HAND_QTY
                                         ,DEFECT_QTY
                                         ,PRVS_DAYEND_STOCK_QTY
                                         ,PRVS_MONTHEND_STOCK_QTY
                                         ,PRVS_TERMEND_STOCK_QTY
                                         ,CREATED_DATE
                                         ,CREATED_BY
                     ,CREATED_PRG_NM
                                         ,UPDATED_DATE
                                         ,UPDATED_BY
                     ,UPDATED_PRG_NM
                     ,MODIFY_COUNT
                                         ) VALUES (
                                          vc2ItemCd      --�i�ڔԍ�
                                         ,vc2WhCd        --�ۊǋ�R�[�h
                     ,pvc2PlantCd    --�H��R�[�h
                                         ,numRcvIssueQty --�i�ڕʎ莝�݌ɐ�
                                         ,0              --�i�ڕʕs�ǐ�
                                         ,0              --�i�ڕʑO�����݌ɐ�
                                         ,0              --�i�ڕʑO�����݌ɐ�
                                         ,0              --�i�ڕʑO�����݌ɐ�
                                         ,SYSDATE        --�������쐬����
                                         ,pvc2UserId     --�������쐬�҃R�[�h
                     ,MY_SQL_NAME 
                                         ,SYSDATE        --�������ŐV�X�V����
                                         ,pvc2UserId     --�������ŐV�X�V�҃R�[�h
                     ,MY_SQL_NAME
                     ,0 
                                         );
    --mhase
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0709)�ۊǋ�ʕi�ڍ݌ɒǉ�/vc2ItemCd/vc2WhCd/numRcvIssueQty' ||
                          vc2ItemCd || '/' || vc2WhCd || '/' || numRcvIssueQty);
--vc2RunChkComment := '���������ʉ� SHIP-08';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);      
        
            END IF;

    ELSIF numRcvIssueQty < 0 THEN

--vc2RunChkComment := '���������ʉ� SHIP-09';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- [�ۊǋ�ʓ��o��].���� �� Null �̏ꍇ

            -- �ۊǋ�ʕi�ڍ݌ɍX�V
            UPDATE T_ITEM_STOCK SET
                STOCK_ON_HAND_QTY = STOCK_ON_HAND_QTY + numRcvIssueQty
               ,UPDATED_DATE = SYSDATE
               ,UPDATED_BY = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1    
                WHERE  ITEM_CD = vc2ItemCd
                  AND  WH_CD = vc2WhCd
          AND  PLANT_CD = pvc2PlantCd;
    --mhase
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0710)�ۊǋ�ʕi�ڍ݌ɍX�V/vc2ItemCd/vc2WhCd/numRcvIssueQty' ||
                          vc2ItemCd || '/' || vc2WhCd || '/' || numRcvIssueQty);

            --�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V�����̃C���N�������g
            pnumCnt_ITEM_STOCK := pnumCnt_ITEM_STOCK + 1;

            IF SQL%NOTFOUND THEN
                -- �q�b�g���Ȃ������ꍇ

                -- �ۊǋ�ʕi�ڍ݌ɒǉ�
                INSERT INTO T_ITEM_STOCK (
                                          ITEM_CD
                                         ,WH_CD
                     ,PLANT_CD  
                                         ,STOCK_ON_HAND_QTY
                                         ,DEFECT_QTY
                                         ,PRVS_DAYEND_STOCK_QTY
                                         ,PRVS_MONTHEND_STOCK_QTY
                                         ,PRVS_TERMEND_STOCK_QTY
                                         ,CREATED_DATE
                                         ,CREATED_BY
                     ,CREATED_PRG_NM
                                         ,UPDATED_DATE
                                         ,UPDATED_BY
                     ,UPDATED_PRG_NM
                     ,MODIFY_COUNT
                                         ) VALUES (
                                          vc2ItemCd      --�i�ڔԍ�
                                         ,vc2WhCd        --�ۊǋ�R�[�h
                     ,pvc2PlantCd    --�H��R�[�h
                                         ,numRcvIssueQty --�i�ڕʎ莝�݌ɐ�
                                         ,0              --�i�ڕʕs�ǐ�
                                         ,0              --�i�ڕʑO�����݌ɐ�
                                         ,0              --�i�ڕʑO�����݌ɐ�
                                         ,0              --�i�ڕʑO�����݌ɐ�
                                         ,SYSDATE        --�������쐬����
                                         ,pvc2UserId     --�������쐬�҃R�[�h
                     ,MY_SQL_NAME 
                                         ,SYSDATE        --�������ŐV�X�V����
                                         ,pvc2UserId     --�������ŐV�X�V�҃R�[�h
                     ,MY_SQL_NAME
                     ,0 
                                         );

--vc2RunChkComment := '���������ʉ� SHIP-10';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    --mhase
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0709)�ۊǋ�ʕi�ڍ݌ɒǉ�/vc2ItemCd/vc2WhCd/numRcvIssueQty' ||
                          vc2ItemCd || '/' || vc2WhCd || '/' || numRcvIssueQty);

            END IF;

    END IF;

    -- TraceLog �̏o�� 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;

EXCEPTION

    WHEN excErr THEN  --�G���[
--DBMS_OUTPUT.PUT_LINE('�G���[');
        ROLLBACK;
        vc2Comment := '';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, numMessageNo, vc2Comment);
        -- TraceLog �̏o�� 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('���̑��G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0055)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        -- TraceLog �̏o�́i���s�ʒu�j
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
