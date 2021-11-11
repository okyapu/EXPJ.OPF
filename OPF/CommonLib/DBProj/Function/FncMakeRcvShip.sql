CREATE OR REPLACE FUNCTION  FNCMAKERCVSHIP(
/*------------------------------------------------------------------------------
' $Id: FncMakeRcvShip.sql,v 1.4 2013/04/12 05:23:10 tai-yanhong Exp $
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2003.11.05 DBMS_OUTPUT�̃R�����g�A�E�g
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB��4�{�j
'
' �@�\      : [���o��]���R�[�h���ڐݒ�,�ǉ��C�o�׏���
' �߂�l    : Boolean
'               True :����I��
'               False:�ُ�I��
'
' ������    : pFileHandle               - (i)�t�@�C���n���h��
'             pvc2LogMode               - (i)�k�n�f���[�h
'             pvc2OutputMode            - (i)�o�̓��[�h
'             pvc2UserId                - (i)���[�U�h�c
'             pvc2BusinessName          - (i)�Ɩ���
--              pvc2PlantCd             (i)�H��R�[�h
'             pvc2CompanyCd             - (i)��ЃR�[�h
'             pnumSlipTyp               - (i)�`�[���
'             pvc2SlipCtrlGrp           - (i)�`�[�Ǘ��O���[�v
'             pvc2SlipCd                - (i)�`�[�ԍ�
'             pdtmSlipDate              - (i)�`�[���t
'             pnumLineNo                - (i)�s
'             pvc2ItemCd                - (i)�i�ڔԍ�
'             pvc2WhCd                  - (i)�ۊǋ�R�[�h
'             pnumOdNo                  - (i)�I�[�_�f�}���h�ԍ�
'             pnumRcvShipQty            - (i)���o�א�
'             pdtmScdlShipDate          - (i)�o�ח\���
'             pvc2JobOdrCd              - (i)����
'             pnumJobOdrDetailNo        - (i)���Ԏ}��
'             pnumCnt_ITEM_STOCK        - (io)�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
'             pnumCnt_JOB_ODR_CD_STOCK  - (io)�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
'
' �@�\����  : FncShipForMrp,FncShipForJobOdr ����g�p����
'
' ���l      :
'
------------------------------------------------------------------------------*/
        pFileHandle                 IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
       ,pvc2LogMode                 IN  VARCHAR2            --�k�n�f���[�h
       ,pvc2OutputMode              IN  VARCHAR2            --�o�̓��[�h
       ,pvc2UserId                  IN  VARCHAR2            --���[�U�h�c
       ,pvc2BusinessName            IN  VARCHAR2            --�Ɩ���
       ,pvc2PlantCd             IN  VARCHAR2              --// �H��R�[�h
       ,pvc2CompanyCd               IN  VARCHAR2            --��ЃR�[�h
       ,pnumSlipTyp                 IN  NUMBER              --�`�[���
       ,pvc2SlipCtrlGrp             IN  VARCHAR2            --�`�[�Ǘ��O���[�v
       ,pvc2SlipCd                  IN  VARCHAR2            --�`�[�ԍ�
       ,pdtmSlipDate                IN  DATE                --�`�[���t
       ,pnumLineNo                  IN  NUMBER              --�s
       ,pvc2ItemCd                  IN  VARCHAR2            --�i�ڔԍ�
       ,pvc2WhCd                    IN  VARCHAR2            --�ۊǋ�R�[�h
       ,pnumOdNo                    IN  NUMBER              --�I�[�_�f�}���h�ԍ�
       ,pnumRcvShipQty              IN  NUMBER              --���o�א�
       ,pdtmScdlShipDate            IN  DATE                --�o�ח\���
       ,pvc2JobOdrCd                IN  VARCHAR2            --����
       ,pnumJobOdrDetailNo          IN  NUMBER              --���Ԏ}��
       ,pnumCnt_ITEM_STOCK          IN OUT  NUMBER          --�m�ۊǋ�ʕi�ڍ݌Ɂn�X�V����
       ,pnumCnt_JOB_ODR_CD_STOCK    IN OUT  NUMBER          --�m�ۊǋ�ʐ��ԍ݌Ɂn�X�V����
)RETURN BOOLEAN
IS
    -- ��O�̐錾 
    excGetNewIssueCd                    EXCEPTION;          --���o�ɊǗ��ԍ��擾�G���[

    -- �萔�̐錾
    MY_SQL_NAME             VARCHAR2(56)    := 'FncMakeRcvShip';
    MRPFLAG_TARGET          NUMBER          := 1;   --�ۊǋ�-MRP�Ώۃt���O(1:MRP�Ώ�)
    RCV_ISSUE_TYP_OUT       NUMBER          := 2;   --�ۊǋ�ʓ��o��-���o�ɋ敪(2:�o��)
    RCV_ISSUE_GNR_TYP_SHIP  NUMBER          := 31;  --�ۊǋ�ʓ��o��-���o�ɔ����敪(31:�o��)
    RCV_ISSUE_STOCK_UPD_COMPLTED  NUMBER    := 2;   --�ۊǋ�ʓ��o��-�݌ɍX�V�敪(2:�X�V�ς�)
    RCV_ISSUE_CMPLT_FLG_COMPLTED  NUMBER    := 1;   --�ۊǋ�ʓ��o��-���o�Ɋ����t���O(1:����)

    -- �ϐ��̐錾 
    blnRet                  BOOLEAN;        --�֐��߂�l
    intRet                  INTEGER;        --�֐��߂�l
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2RcvIssueCtrlCd       VARCHAR2(100);   --���o�ɊǗ��ԍ�

-- MESSAGE �̐錾 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --�n�q�`�b�k�d�G���[
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --���̑��G���[
    APS_NOTEXIST_RCV_ISSUE_CTRL         VARCHAR2(28)     := 'AK50558';    --���o�ɔԍ��̔ԃf�[�^�����݂��܂���

-- LOG �̐錾 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    COMMENT_MSGLOG_END                  VARCHAR2(192)  := '<< [���o��]���R�[�h���ڐݒ�,�ǉ��C�o�׏��� >>';

    -- �ϐ��̐錾 
BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

vc2RunChkComment := NULL;

    -- ���o�ɊǗ��ԍ��擾 
    blnRet := fncGetNewIssueCd(pFileHandle
                              ,pvc2LogMode
                              ,pvc2OutputMode
                              ,pvc2UserId
                              ,pvc2BusinessName
                ,pvc2PlantCd
                              ,vc2RcvIssueCtrlCd
                              );
    IF blnRet = FALSE THEN
        RAISE excGetNewIssueCd;
    END IF;

--mhase

    -- �ۊǋ�ʓ��o�ɍ쐬

    INSERT INTO T_RCV_ISSUE (
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
                             vc2RcvIssueCtrlCd      --���o�ɊǗ��ԍ�**
                            ,RCV_ISSUE_TYP_OUT      --���o�ɋ敪**
                            ,pvc2ItemCd             --�i�ڔԍ�**
                            ,pvc2PlantCd
                            ,pvc2WhCd               --�ۊǋ�R�[�h
                            ,pvc2JobOdrCd           --����
                            ,pnumJobOdrDetailNo     --���Ԏ}��**
                            ,NULL                   --�����ԍ�
                            ,0                      --�����**
                            ,0                      --������ђ�����**
                            ,0                      --�������ђ�����**
                            ,NULL                   --��ƌv��ԍ�
                            ,NULL                   --�d�|��ƃR�[�h
                            ,0                      --�����**
                            ,0                      --��Ǝ��ђ�����**
                            ,NULL                   --�o�Ɏw���ԍ�
                            ,pnumRcvShipQty         --���o�ɐ�**
                            ,0                      --���o�ɋ��z**
                            ,pdtmScdlShipDate       --���o�ɔN����**
                            ,RCV_ISSUE_GNR_TYP_SHIP --���o�ɔ����敪*
                            ,0                      --���o�ɒ[��**
                            ,NULL                   --���o�ɕs�Ǘ��R�R�[�h
                            ,RCV_ISSUE_STOCK_UPD_COMPLTED --�݌ɍX�V�敪**
                            ,RCV_ISSUE_CMPLT_FLG_COMPLTED --���o�Ɋ����t���O**
                            ,pnumOdNo               --�I�[�_�f�}���h�ԍ�
                            ,pvc2CompanyCd          --��ЃR�[�h
                            ,SYSDATE                --�������쐬����
                            ,pvc2UserId             --�������쐬�҃R�[�h
                            ,MY_SQL_NAME    
                            ,SYSDATE                --�������ŐV�X�V����
                            ,pvc2UserId             --�������ŐV�X�V�҃R�[�h
                            ,MY_SQL_NAME
                            ,0
                            );

    -- �o�׊Ǘ�����쐬

    INSERT INTO SYS_SHIP_CTRL(
                             COMPANY_CD
                            ,SLIP_TYP
                            ,SLIP_CTRL_GRP
                            ,SLIP_CD
                            ,SLIP_DATE
                            ,LINE_NO
                            ,RCV_ISSUE_CTRL_CD
                            ,RESERVE_CHAR
                            ,RESERVE_NUM
                            ,CREATED_DATE
                            ,CREATED_BY
                ,CREATED_PRG_NM 
                            ,UPDATED_DATE
                            ,UPDATED_BY
                ,UPDATED_PRG_NM
                    ,MODIFY_COUNT
                            ) VALUES (
                             pvc2CompanyCd          --��ЃR�[�h
                            ,pnumSlipTyp            --�`�[���
                            ,pvc2SlipCtrlGrp        --�`�[�Ǘ��O���[�v
                            ,pvc2SlipCd             --�`�[�ԍ�
                            ,pdtmSlipDate           --�`�[���t
                            ,pnumLineNo             --�s
                            ,vc2RcvIssueCtrlCd      --���o�ɊǗ��ԍ�
                            ,NULL                   --�\���i�����j
                            ,0                      --�\���i���l�j
                            ,SYSDATE                --�������쐬����
                            ,pvc2UserId             --�������쐬�҃R�[�h
                ,MY_SQL_NAME
                            ,SYSDATE                --�������ŐV�X�V����
                            ,pvc2UserId             --�������ŐV�X�V�҃R�[�h
                ,MY_SQL_NAME
                            ,0
                            );
    -- �o�׏���

    blnRet := FncShip(pFileHandle
                     ,pvc2LogMode
                     ,pvc2OutputMode
                     ,pvc2UserId
                     ,pvc2BusinessName
            ,pvc2PlantCd
                     ,vc2RcvIssueCtrlCd
                     ,pnumCnt_ITEM_STOCK
                     ,pnumCnt_JOB_ODR_CD_STOCK
                     );
    IF blnRet = FALSE THEN
vc2RunChkComment := 'FncShip NG';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        RETURN FALSE;
    END IF;

vc2RunChkComment := 'FncShip OK';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    RETURN TRUE;

EXCEPTION

    WHEN excGetNewIssueCd THEN  --���o�ɊǗ��ԍ��擾�G���[
--DBMS_OUTPUT.PUT_LINE('���o�ɊǗ��ԍ��擾�G���[');
        ROLLBACK;
        vc2Comment := '';
        -- �G���[���b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_NOTEXIST_RCV_ISSUE_CTRL, vc2Comment);
        -- TraceLog �̏o�� 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('���̑��G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0048)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '�F' ||
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
