CREATE OR REPLACE FUNCTION FNCMAKEMRPDMND(
/*------------------------------------------------------------------------------
' $Id: FncMakeMrpDmnd.sql,v 1.4 2013/06/03 07:09:58 tai-yanhong Exp $
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2003.11.04 DBMS_OUTPUT�̃R�����g�A�E�g
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
'
' �@�\      : �l�q�o�i�f�}���h����
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
'
' �@�\����  : ���v�ʂɂ��A�O���f�}���h�̑S�̂��폜���A���̌�A���Y�v���̓��e��
'             �V���ɊO���f�}���h�̍쐬���s���B
'
' ���l      :
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
) RETURN BOOLEAN
IS



-- �J�[�\���̐錾
    --�y���Y�v���z
    CURSOR curT_PRD_REQ(
        cVc2PLANT_CD     VARCHAR2        --   �H��R�[�h     
    )IS
    SELECT
            T_PRD_REQ.COMPANY_CD,                   --���Y�v�� ��ЃR�[�h
            T_PRD_REQ.SLIP_TYP,                     --���Y�v�� �`�[���
            T_PRD_REQ.SLIP_CTRL_GRP,                --���Y�v�� �`�[�Ǘ��O���[�v
            T_PRD_REQ.SLIP_CD,                      --���Y�v�� �`�[�ԍ�
            T_PRD_REQ.SLIP_DATE,                    --���Y�v�� �`�[���t
            T_PRD_REQ.LINE_NO,                      --���Y�v�� �s
            T_PRD_REQ.UNCONFIRM_ODR_TYP,            --���Y�v�� �����󒍋敪
            T_PRD_REQ.REQ_PRD_ISSUE_DATE,           --���Y�v�� �o�ɗv����
            T_PRD_REQ.REQ_PRD_QTY,                  --���Y�v�� �v������
            T_PRD_REQ.TOTAL_SHIP_QTY,               --���Y�v�� �o�׎��ї݌v��
            T_PRD_REQ.ITEM_CD,                      --���Y�v�� �i�ڔԍ�
            T_PRD_REQ.MRP_ODR_TYP,                  --���Y�v�� �i�ڎ�z�敪
        T_PRD_REQ.PLANT_CD              --�H��R�[�h    
    FROM    
            T_PRD_REQ           --���Y�v��
    WHERE
        T_PRD_REQ.PLANT_CD = cVc2PLANT_CD  AND    --�H��R�[�h
            T_PRD_REQ.PRD_PLAN_TYP  = 1   AND   --���Y�v��Ώۋ敪�i�P�F���񐶎Y�v��Ώہj
            T_PRD_REQ.PRD_ERROR_TYP = 1   AND   --���Y���G���[�敪�i�P�F����j
          ((T_PRD_REQ.MRP_ODR_TYP = 4) OR       --�i�ڎ�z�敪(4:�}�j���A����z�i��)
           (T_PRD_REQ.MRP_ODR_TYP = 5) OR       --�i�ڎ�z�敪(5:���b�g��z�i��)
           (T_PRD_REQ.MRP_ODR_TYP = 6))         --�i�ڎ�z�敪(6:��ʎ�z�i��)
       
    ORDER BY COMPANY_CD
            ,SLIP_TYP
            ,SLIP_CTRL_GRP
            ,SLIP_CD
            ,SLIP_DATE
            ,LINE_NO;


    --�y�i�ځz
    CURSOR curM_ITEM(
        c_ITEM_CD       VARCHAR2
    ) IS
    SELECT
            M_ITEM.HIGH_LEVEL_NO,                   --�i�� ���x���ԍ�
            M_ITEM.OUTSIDE_TYP,                     --�i�� �i�ړ��O��敪
            M_ITEM.ODR_LT,                          --�i�� �i�ڎ�z���[�h�^�C��
            M_ITEM.FIXED_LT,                        --�i�� �i�ڌŒ胊�[�h�^�C��
            M_ITEM.PROP_LT,                         --�i�� �i�ڔ�჊�[�h�^�C��
            M_ITEM.SAFETY_LT,                       --�i�� ���S����
            M_ITEM.ISSUE_LT,                        --�i�� ���o���[�h�^�C��
            M_ITEM.PROP_LOT_SIZE,                   --�i�� �i�ڔ��敪���b�g�T�C�Y
            M_ITEM.ITEM_SPOIL,                      --�i�� �i�ڎd����
            M_ITEM.ISSUE_TYP                        --�i�� �o�ɋ敪
    FROM    
            M_ITEM              --�i��
    WHERE   
            M_ITEM.ITEM_CD = c_ITEM_CD;         --�i�ڔԍ�



-- ROWTYPE �̐錾
    RtpT_PRD_REQ                    curT_PRD_REQ%ROWTYPE;       --�y���Y�v���z
    RtpM_ITEM                       curM_ITEM%ROWTYPE;          --�y�i�ځz



-- �萔�̐錾
    MY_SQL_NAME                     VARCHAR2(56)    := 'FncMakeMrpDmnd';
    OD_GNR_TYP_MANUAL               NUMBER(1)       := 1;       --���v��-���v�ʔ��������敪(1:�}�j���A���o�^)
    OD_GNR_TYP_PRCHPLAN             NUMBER(1)       := 2;       --���v��-���v�ʔ��������敪(2:�����v�悩��o�^)
    OD_GNR_TYP_PROCPLAN             NUMBER(1)       := 3;       --���v��-���v�ʔ��������敪(3:��ƌv�悩��o�^)
    OD_GNR_TYP_UNCONFIRM_ODR        NUMBER(1)       := 5;       --���v��-���v�ʔ��������敪(5:�̔��i�����j��񂩂�o�^)
    OD_GNR_TYP_ODR_ACPT             NUMBER(1)       := 6;       --���v��-���v�ʔ��������敪(6:�󒍏�񂩂�o�^)
    OD_GNR_TYP_SHIP_RSV             NUMBER(1)       := 7;       --���v��-���v�ʔ��������敪(7:�o�וۗ���񂩂�o�^)
    OD_GNR_TYP_MRP                  NUMBER(1)       := 9;       --���v��-���v�ʔ��������敪(9:���v�ʌv�Z�ɂēo�^)
    ODR_STS_NOTODR                  NUMBER(1)       := 0;       --���v��-�I�[�_��ԋ敪(0:�I�[�_�ł͂Ȃ�)
    ODR_STS_PLAN                    NUMBER(1)       := 1;       --���v��-�I�[�_��ԋ敪(1:�v��i�������j)
    DM_STS_NOTDEMAND                NUMBER(1)       := 0;       --���v��-�f�}���h��ԋ敪(0:�f�}���h�ł͂Ȃ�)
    DM_STS_PLAN                     NUMBER(1)       := 1;       --���v��-�f�}���h��ԋ敪(1:�v��(������))
    DM_STS_RELEASE                  NUMBER(1)       := 2;       --���v��-�f�}���h��ԋ敪(2:�m��(������))
    DM_STS_COMPLETE                 NUMBER(1)       := 9;       --���v��-�f�}���h��ԋ敪(9:����)
    OD_TYP_ODR_DEMAND               NUMBER(1)       := 1;       --���v��-�I�[�_�f�}���h�敪(1:�I�[�_�f�}���h�i���ԁj)
    OD_TYP_ODR                      NUMBER(1)       := 2;       --���v��-�I�[�_�f�}���h�敪(2:�I�[�_)
    OD_TYP_DEMAND                   NUMBER(1)       := 3;       --���v��-�I�[�_�f�}���h�敪(3:�f�}���h)
    OD_TYP_ASSIMILATE               NUMBER(1)       := 4;       --���v��-�I�[�_�f�}���h�敪(4:�[��)
    CONS_TYP_NO                     NUMBER(1)       := 0;       --���v��-�\���x���敪(0:��)
    CONS_TYP_PAID                   NUMBER(1)       := 1;       --���v��-�\���x���敪(1:�L���x��)
    CONS_TYP_FREE                   NUMBER(1)       := 2;       --���v��-�\���x���敪(2:�����x��)
    MRP_TYP_ADD                     NUMBER(1)       := 1;       --���v��-���v�ʏ����敪(1:�ǉ�)
    MRP_TYP_CHANGE                  NUMBER(1)       := 2;       --���v��-���v�ʏ����敪(2:�ύX)
    MRP_TYP_UPDATE                  NUMBER(1)       := 3;       --���v��-���v�ʏ����敪(3:�폜)
    MRP_TYP_END                     NUMBER(1)       := 9;       --���v��-���v�ʏ����敪(9:��)
    PS_LT_FLG_NOUSE                 NUMBER(1)       := 0;       --���i�\��-�k�s�g�p�t���O(0:���i�\���}�X�^��L/T���g�p���Ȃ��B)
    PS_LT_FLG_USE                   NUMBER(1)       := 1;       --���i�\��-�k�s�g�p�t���O(1:���i�\���}�X�^��L/T���g�p����B)
    PRD_PLAN_TYP_CUR_PLAN           NUMBER(1)       := 1;       --���Y�v��-���Y�v��Ώۋ敪�i�P�F���񐶎Y�v��Ώہj
    PRD_PLAN_TYP_LAST_PLAN          NUMBER(1)       := 2;       --���Y�v��-���Y�v��Ώۋ敪�i�Q�F�O�񐶎Y�v��Ώہj
    PRD_PLAN_TYP_DEL_PLAN           NUMBER(1)       := 9;       --���Y�v��-���Y�v��Ώۋ敪�i�X�F���Y�v���폜�Ώہj
    PRD_ERROR_TYP_NORMAL            NUMBER(1)       := 1;       --���Y�v��-���Y���G���[�敪�i�P�F����j
    PRD_ERROR_TYP_ERROR             NUMBER(1)       := 9;       --���Y�v��-���Y���G���[�敪�i�X�F�G���[�j
    MRP_ODR_TYP_CASE_ODR            NUMBER(1)       := 1;       --�i��-�i�ڎ�z�敪(1:�ʎ�z�i��)
    MRP_ODR_TYP_STOCK_ALOC_CASE     NUMBER(1)       := 2;       --�i��-�i�ڎ�z�敪(2:�݌Ɉ����^�ʎ�z�i��)
    MRP_ODR_TYP_STOCK_ALOC_MANUAL   NUMBER(1)       := 3;       --�i��-�i�ڎ�z�敪(3:�݌Ɉ����^�}�j���A����z�i��)
    MRP_ODR_TYP_MANUAL_ODR          NUMBER(1)       := 4;       --�i��-�i�ڎ�z�敪(4:�}�j���A����z�i��)
    MRP_ODR_TYP_LOT_ODR             NUMBER(1)       := 5;       --�i��-�i�ڎ�z�敪(5:���b�g��z�i��)
    MRP_ODR_TYP_RATION_ODR          NUMBER(1)       := 6;       --�i��-�i�ڎ�z�敪(6:��ʎ�z�i��)
    MRP_ODR_TYP_ODR_POINT_ODR       NUMBER(1)       := 7;       --�i��-�i�ڎ�z�敪(7:�����_��z�i��)
    MRP_ODR_TYP_ASSIMILATE          NUMBER(1)       := 8;       --�i��-�i�ڎ�z�敪(8:�[���i��)
    UNCONFIRM_SALSE_TYP_SALSE_ODR   NUMBER(1)       := 1;       --���Y�v��-�����󒍋敪(1:��)
    UNCONFIRM_SALSE_TYP_UNCONFIRM   NUMBER(1)       := 2;       --���Y�v��-�����󒍋敪(2:����)



-- LOG �̐錾
    COMMENT_MSGLOG_MAKEMRPDMNDST    VARCHAR2(124)    := '<< MRP�i�f�}���h���������J�n >>';
    COMMENT_MSGLOG_MAKEMRPDMNDEN    VARCHAR2(124)    := '<< MRP�i�f�}���h���������I�� >>';
    LOGMSG_START                    VARCHAR2(20)     := 'Start'; --���O�p���\�b�h�J�n�錾
    LOGMSG_END                      VARCHAR2(12)     := 'End';   --���O�p���\�b�h�I���錾
    LOGMSG_ERR                      VARCHAR2(32)     := '�ُ�I��';



-- EXCEPTION �̐錾
    excFncGetNewOdNo_ERR            EXCEPTION;                  --�I�[�_�f�}���h�ԍ��̔ԃG���[
    excNOT_PRIMARY_ERR              EXCEPTION;                  --�u�Q�d�f�[�^�v�G���[
    excNOT_EXIST_DATA_ERR           EXCEPTION;                  --�u�Ώۃf�[�^�����v�G���[


-- MESSAGE �̐錾
    APS_COM_BATCH_START             VARCHAR2(28)       := 'ZZ09001';   --�o�b�`�������J�n���܂���
    APS_COM_BATCH_END               VARCHAR2(28)       := 'ZZ09002';   --�o�b�`�������I�����܂���
    APS_COM_NOTEXIST_DATA           VARCHAR2(28)       := 'AK50700';   --�Ώۃf�[�^�����݂��܂���
    APS_COM_NOTPRIMARY              VARCHAR2(28)       := 'AK50702';   --�f�[�^���Q���ȏ㑶�݂��܂�
    APS_PROC_CNT                    VARCHAR2(28)       := 'AK53412';   --��������



--�ϐ��̐錾
    blnRet                          BOOLEAN;                    --BOOLEAN�^ �ԋp�l
    vc2Comment                      VARCHAR2(1024);              --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment                VARCHAR2(72);               --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    lngCount                        NUMBER;                     --�����J�E���g�p
    numGotOdNo                      VARCHAR2(100);                 --�I�[�_�f�}���h�ԍ��̔Ԍ���
    numWkODGNRTYP                   NUMBER(2);                  --�v�j���v�ʔ��������敪
    numCnt_OD                       NUMBER(10);     --[���v��]�ǉ�����



BEGIN



--DBMS_OUTPUT.ENABLE(1000000);
--20031104 DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;



    --TraceLog �̏o��
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);


--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-001';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    --�O���f�}���h�폜����
    DELETE FROM T_OD        --���v��
        WHERE
        (PLANT_CD  =  pvc2PlantCd) AND   --�H��R�[�h U
            (OD_GNR_TYP = OD_GNR_TYP_UNCONFIRM_ODR OR    --���v�ʔ��������敪(5:�̔��i�����j��񂩂�o�^)
             OD_GNR_TYP = OD_GNR_TYP_ODR_ACPT      OR    --���v�ʔ��������敪(6:�󒍏�񂩂�o�^)
             OD_GNR_TYP = OD_GNR_TYP_SHIP_RSV);           --���v�ʔ��������敪(7:�o�וۗ���񂩂�o�^)


--vc2RunChkComment := 'MAKE-DM-002';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);



    --[���v��]�ǉ������̏�����
    numCnt_OD := 0;

    --���Y�v�� �̒��o
    OPEN curT_PRD_REQ(pvc2PlantCd);
    FETCH curT_PRD_REQ INTO RtpT_PRD_REQ;
    LOOP
        --���Y�v�� �̂d�n�e
        EXIT WHEN curT_PRD_REQ%NOTFOUND;


--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-003';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --�r�p�k�̎��s
        SELECT COUNT(*) INTO lngCount
            FROM  M_ITEM    --�i��
            WHERE M_ITEM.ITEM_CD = RtpT_PRD_REQ.ITEM_CD;    --�i�ڔԍ�
        --�Q���ȏ�
        IF lngCount > 1 THEN
            RAISE excNOT_PRIMARY_ERR;
        --�f�[�^����
        ELSIF lngCount <= 0 THEN
            RAISE excNOT_EXIST_DATA_ERR;
        END IF;

--vc2RunChkComment := 'MAKE-DM-004';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


        --�i�� �̒��o
        OPEN curM_ITEM(RtpT_PRD_REQ.ITEM_CD);
        FETCH curM_ITEM INTO RtpM_ITEM;
        --�f�[�^�L��
        IF curM_ITEM%FOUND THEN

--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-005';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


            --�I�[�_�f�}���h�ԍ��̔�
            blnRet := FncGetNewOdNo(pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId          --���[�U�h�c
                                   ,pvc2BusinessName    --�Ɩ���
                   ,pvc2PlantCd         --�H��R�[�h
                                   ,numGotOdNo          --��������
                                   );
            IF blnRet = FALSE THEN
                RAISE excFncGetNewOdNo_ERR;
            END IF;

--vc2RunChkComment := 'MAKE-DM-006';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


            --���Y�v��.�����󒍋敪 = 1(��) �̎�
            IF RtpT_PRD_REQ.UNCONFIRM_ODR_TYP = UNCONFIRM_SALSE_TYP_SALSE_ODR THEN

--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-007';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                numWkODGNRTYP := OD_GNR_TYP_ODR_ACPT;       --���v�ʔ��������敪(6:�󒍏�񂩂�o�^)
            --���Y�v��.�����󒍋敪 = 2(����) �̎�
            ELSIF RtpT_PRD_REQ.UNCONFIRM_ODR_TYP = UNCONFIRM_SALSE_TYP_UNCONFIRM THEN

--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                numWkODGNRTYP := OD_GNR_TYP_UNCONFIRM_ODR;  --���v�ʔ��������敪(5:�̔��i�����j��񂩂�o�^)
            --���̑�
            ELSE
--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            
                --ORACLE����̫�Ēl
                numWkODGNRTYP := OD_GNR_TYP_MANUAL;         --���v�ʔ��������敪(1:�}�j���A���o�^)
            END IF;


--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-008';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --�y���v�ʁz�ւ̒ǉ�����
            INSERT INTO T_OD(
                 OD_NO                              --�I�[�_�f�}���h�ԍ�
                ,ALC_GRP_CD                         --�����O���[�v�R�[�h
        ,PLANT_CD               --�H��R�[�h
                ,ITEM_CD                            --�i�ڔԍ�
                ,PS_EDITION                         --���v�ʕi�ڍ\���Ő�
                ,JOB_ODR_CD                         --����
                ,JOB_ODR_DETAIL_NO                  --���Ԏ}��
                ,JOB_ODR_CANCEL_NO                  --���Ԏ�������ԍ�
                ,ODR_STS_TYP                        --�I�[�_��ԋ敪
                ,DM_STS_TYP                         --�f�}���h��ԋ敪
                ,OD_TYP                             --�I�[�_�f�}���h�敪
                ,DUE_DATE                           --�v���[��
                ,ODR_START_DATE                     --��z�����
                ,PRD_DUE_DATE                       --�����[��
                ,PRD_START_DATE                     --���������
                ,DM_QTY                             --�f�}���h��
                ,ODR_QTY                            --�I�[�_��
                ,MRP_ODR_TYP                       --�i�ڎ�z�敪
                ,OUTSIDE_TYP                        --���v�ʓ��O��敪
                ,ISSUE_TYP                          --���v�ʏo�ɋ敪
                ,ODR_LT                             --��z���[�h�^�C��
                ,FIXED_LT                           --�Œ蕪���[�h�^�C��
                ,PROP_LT                            --��ᕪ���[�h�^�C��
                ,SAFETY_LT                          --���S����
                ,ISSUE_LT                           --���o���[�h�^�C��
                ,PROP_LOT_SIZE                      --��ᕪ���b�g�T�C�Y
                ,PS_LT_FLG                          --���i�\�����[�h�^�C���g�p�t���O
                ,PS_FIXED_LT                        --���i�\���Œ蕪���[�h�^�C��
                ,PS_PROP_LT                         --���i�\����ᕪ���[�h�^�C��
                ,PS_PROP_LOT_SIZE                   --���i�\����ᕪ���b�g�T�C�Y
                ,PS_UNIT_QTY                        --���i�\���P�ʐ�
        ,PS_UNIT_DENOMINATOR            --���i�\���P�ʐ�����    
        ,PS_UNIT_NUMERATOR          --���i�\���P�ʕ��q  
                ,TOTAL_RCV_QTY                      --���ɗ݌v��
                ,RCV_CMPLT_DATE                     --���Ɋ�����
                ,TOTAL_ISSUE_INST_QTY               --�o�Ɏw���݌v��
                ,TOTAL_ISSUE_QTY                    --�o�ɗ݌v��
                ,ISSUE_CMPLT_DATE                   --�o�Ɋ�����
                ,OD_GNR_TYP                         --���v�ʔ��������敪
                ,OD_LEVEL_NO                        --���v�ʃ��x���ԍ�
                ,PARENT_OD_NO                       --�e�I�[�_�f�}���h�ԍ�
                ,ITEM_SPOIL                         --���v�ʕi�ڎd����
                ,PS_SPOIL                           --���v�ʍ\���d����
                ,CONS_TYP                        --�\���x���敪
                ,EFF_PHASE_IN_DATE                  --���v�ʗL���J�n��
                ,EFF_PHASE_OUT_DATE                 --���v�ʗL���I����
                ,MRP_TYP                            --���v�ʏ����敪
--
        ,EXTERNAL_DM_FLG            --�O���f�}���h�t���O
            ,ODR_RELEASE_FLG            --�I�[�_���s�σt���O
            ,CREATED_DATE              
            ,CREATED_BY                     
            ,CREATED_PRG_NM                
            ,UPDATED_DATE                   
            ,UPDATED_BY                     
            ,UPDATED_PRG_NM                 
            ,MODIFY_COUNT                  
            ) VALUES (
                 numGotOdNo                         --�I�[�_�f�}���h�ԍ�
                ,NULL                               --�����O���[�v�R�[�h
        ,pvc2PlantCd                --�H��R�[�h    
                ,RtpT_PRD_REQ.ITEM_CD               --���Y�v��.�i�ڔԍ�
                ,NULL                               --���v�ʕi�ڍ\���Ő�
                ,NULL                               --����
                ,0                                  --���Ԏ}��
                ,0                                  --���Ԏ�������ԍ�
                ,ODR_STS_NOTODR                     --�I�[�_��ԋ敪(0:�I�[�_�ł͂Ȃ�)
                ,DM_STS_RELEASE                     --�f�}���h��ԋ敪(2:�m��(������))
                ,OD_TYP_DEMAND                      --�I�[�_�f�}���h�敪(3:�f�}���h)
                ,RtpT_PRD_REQ.REQ_PRD_ISSUE_DATE    --���Y�v��.�o�ɗv����
                ,NULL                               --��z�����
                ,RtpT_PRD_REQ.REQ_PRD_ISSUE_DATE    --���Y�v��.�o�ɗv����
                ,NULL                               --���������
                ,RtpT_PRD_REQ.REQ_PRD_QTY           --���Y�v��.�v������
                ,0                                  --�I�[�_����
                ,RtpT_PRD_REQ.MRP_ODR_TYP           --���Y�v��.�i�ڎ�z�敪
                ,RtpM_ITEM.OUTSIDE_TYP              --�i��.�i�ړ��O��敪
                ,RtpM_ITEM.ISSUE_TYP                --�i��.�o�ɋ敪
                ,RtpM_ITEM.ODR_LT                   --�i��.�i�ڎ�z���[�h�^�C��
                ,RtpM_ITEM.FIXED_LT                 --�i��.�i�ڌŒ蕪���[�h�^�C��
                ,RtpM_ITEM.PROP_LT                  --�i��.�i�ڔ�ᕪ���[�h�^�C��
                ,RtpM_ITEM.SAFETY_LT                --�i��.���S����
                ,RtpM_ITEM.ISSUE_LT                 --�i��.���o���[�h�^�C��
                ,RtpM_ITEM.PROP_LOT_SIZE            --�i��.�i�ڔ�ᕪ���b�g�T�C�Y
                ,PS_LT_FLG_NOUSE                    --�k�s�g�p�t���O(0:���i�\���}�X�^��L/T���g�p���Ȃ��B)
                ,0                                  --���i�\���Œ蕪���[�h�^�C��
                ,0                                  --���i�\����ᕪ���[�h�^�C��
                ,0                                  --���i�\����ᕪ���b�g�T�C�Y
                ,0                                  --���i�\���P�ʐ���
        ,1                  --���i�\���P�ʕ���  
        ,0                  --���i�\���P�ʕ��q
                ,0                                  --���ɗ݌v��
                ,NULL                               --���Ɋ�����
                ,RtpT_PRD_REQ.TOTAL_SHIP_QTY        --���Y�v��.�o�׎��ї݌v��
                ,RtpT_PRD_REQ.TOTAL_SHIP_QTY        --���Y�v��.�o�׎��ї݌v��
                ,NULL                               --�o�Ɋ�����
                ,numWkODGNRTYP                      --�v�j���v�ʔ��������敪
                ,RtpM_ITEM.HIGH_LEVEL_NO            --�i��.���x���ԍ�
                ,NULL                               --�e�I�[�_�f�}���h�ԍ�
                ,RtpM_ITEM.ITEM_SPOIL               --�i��.�i�ڎd����
                ,0                                  --���v�ʍ\���d����
                ,CONS_TYP_NO                        --�\���x���敪(0:��)
                ,NULL                               --���v�ʗL���J�n��
                ,NULL                               --���v�ʗL���I����
                ,MRP_TYP_ADD                        --���v�ʏ����敪(1:�ǉ�)
        ,1                  --�O���f�}���h�t���O
                ,1                                  --�I�[�_���s�σt���O
        ,SYSDATE
        ,pvc2UserId
                ,MY_SQL_NAME
        ,SYSDATE
        ,pvc2UserId
        ,MY_SQL_NAME
        ,0
            );

            --[���v��]�ǉ������̃C���N�������g
            numCnt_OD := numCnt_OD + 1;

--vc2RunChkComment := 'MAKE-DM-009';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        ELSE
            RAISE excNOT_EXIST_DATA_ERR;
        END IF;
        --�J�[�\���N���[�Y
        CLOSE curM_ITEM;

        --���f�[�^�ǂݍ���
        FETCH curT_PRD_REQ INTO RtpT_PRD_REQ;
    END LOOP;
    --�J�[�\���N���[�Y
    CLOSE curT_PRD_REQ;

--vc2RunChkComment := 'MAKE-DM-010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --[���v��]�ǉ������̏o��
    blnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode,pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_PROC_CNT, '(SBM0045)�y���v�ʁz�ǉ������F ' || numCnt_OD || ' ��');


--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    -- TraceLog �̏o��
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);



--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

--vc2RunChkComment := 'MAKE-DM-END';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    RETURN TRUE;



--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excNOT_PRIMARY_ERR THEN        --�u�Q�d�f�[�^�v�G���[
--DBMS_OUTPUT.PUT_LINE('excNOT_PRIMARY_ERR');
        ROLLBACK;
        --�G���[���b�Z�[�W�̍쐬
        vc2Comment := SUBSTRB('(SBM0046)' || LOGMSG_ERR ||
                             '�C�i��(M_ITEM) �i�ڔԍ�:' || RtpT_PRD_REQ.ITEM_CD, 1, 1024);
        /* �G���[���b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTPRIMARY, vc2Comment);
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTRB('(SBM0047)' || COMMENT_MSGLOG_MAKEMRPDMNDEN || LOGMSG_ERR ,1,1024);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        IF curT_PRD_REQ%ISOPEN THEN
            CLOSE curT_PRD_REQ;
        END IF;
        IF curM_ITEM%ISOPEN THEN
            CLOSE curM_ITEM;
        END IF;
        RETURN FALSE;

    WHEN excNOT_EXIST_DATA_ERR THEN     --�u�Ώۃf�[�^�����v�G���[
--DBMS_OUTPUT.PUT_LINE('excNOT_EXIST_DATA_ERR');
        ROLLBACK;
        --�G���[���b�Z�[�W�̍쐬
        vc2Comment := SUBSTRB('(SBM0046)' || LOGMSG_ERR ||
                             '�C�i��(M_ITEM) �i�ڔԍ�:' || RtpT_PRD_REQ.ITEM_CD, 1, 1024);
        /* �G���[���b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_DATA, vc2Comment);
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTRB('(SBM0047)' || COMMENT_MSGLOG_MAKEMRPDMNDEN || LOGMSG_ERR ,1,1024);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        IF curT_PRD_REQ%ISOPEN THEN
            CLOSE curT_PRD_REQ;
        END IF;
        IF curM_ITEM%ISOPEN THEN
            CLOSE curM_ITEM;
        END IF;
        RETURN FALSE;

    WHEN excFncGetNewOdNo_ERR THEN      --�I�[�_�f�}���h�ԍ��̔ԃG���[
--DBMS_OUTPUT.PUT_LINE('excFncGetNewOdNo_ERR');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTRB('(SBM0047)' || COMMENT_MSGLOG_MAKEMRPDMNDEN || LOGMSG_ERR ,1,1024);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        IF curT_PRD_REQ%ISOPEN THEN
            CLOSE curT_PRD_REQ;
        END IF;
        IF curM_ITEM%ISOPEN THEN
            CLOSE curM_ITEM;
        END IF;
        RETURN FALSE;

    WHEN OTHERS THEN                    --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTRB('(SBM0047)' || COMMENT_MSGLOG_MAKEMRPDMNDEN || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        -- TraceLog �̏o��
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        IF curT_PRD_REQ%ISOPEN THEN
            CLOSE curT_PRD_REQ;
        END IF;
        IF curM_ITEM%ISOPEN THEN
            CLOSE curM_ITEM;
        END IF;
        RETURN FALSE;
END;
/
