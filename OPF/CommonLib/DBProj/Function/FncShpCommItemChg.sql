CREATE OR REPLACE FUNCTION FNCSHPCOMMITEMCHG(
/*------------------------------------------------------------------------------
' $Id: FncShpCommItemChg.sql,v 1.6 2013/06/03 07:43:03 tai-yanhong Exp $
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2003.11.05 DBMS_OUTPUT�̃R�����g�A�E�g
' 2005.10.21 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : �o�׏��i�i�ڕϊ�����
'
' �߂�l    : Boolean
'               True :����I���i�k�n�f�o�͂��s�������j
'               False:�ُ�I���i�k�n�f�o�͂Ɏ��s�������j
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd             (i)�H��R�[�h

' �@�\����  : �̔��Ǘ��V�X�e������[���o�Ɏ���I/F]��Ǎ��ݏ��i�R�[�h����i�ڔԍ��̕ϊ����s���B
'
' ���l      :
'
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode         IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode      IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId          IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName    IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd         IN  VARCHAR2            --�H��R�[�h
    )

RETURN BOOLEAN
     is

    --// �J�[�\���̐錾
        --���o�Ɏ��уC���^�t�F�[�X�Ǎ��p
        cursor cur_T_PRD_INV_IF (
        cVc2PLANT_CD     VARCHAR2        --   1.�H��R�[�h
        )is
            select * from T_PRD_INV_IF
        where plant_cd = cVc2PLANT_CD               
        order by COMPANY_CD
                      ,SLIP_TYP
                      ,SLIP_CTRL_GRP
                      ,SLIP_CD
                      ,SLIP_DATE
                      ,LINE_NO;

-----------------
-- ROWTYPE�錾 --
-----------------
        lRtpT_PRD_INV_IF cur_T_PRD_INV_IF%ROWTYPE;


    /* �萔�̐錾 */
    APS_COM_ORACLE_ERR              VARCHAR2(28)    := 'AK53401';  --ORACLE Error
    APS_COM_OTHER_ERR               VARCHAR2(28)    := 'AK53402';  --���̑� Error
    APS_PROC_CNT                    VARCHAR2(28)    := 'AK53412';  --��������
    METHOD_START                    VARCHAR2(20)  := 'Start';             --���O�p���\�b�h�J�n�錾
    METHOD_END                      VARCHAR2(12)  := 'End';               --���O�p���\�b�h�I���錾
    MY_SQL_NAME                     VARCHAR2(120) := 'FncShpCommitemChg'; --�t�@���N�V������
    lCOMMENT_MSGLOG_SHIPCOMMSTART   VARCHAR2(120) := '(SBM0730)<< �o�׏��i�i�ڕϊ������J�n >>';
    lCOMMENT_MSGLOG_SHIPCOMMEND     VARCHAR2(120) := '<< �o�׏��i�i�ڕϊ������I�� >>';
    lOGMSG_ERR                      VARCHAR2(32)  := '�ُ�I��';

    --// �ϐ��̒�`
    lBlnRet                         boolean;        --�ߒl
    lvc2Comment                     VARCHAR2(1024);  --// ���b�Z�[�W�쐬�p
    lnumterm_curr                   NUMBER(14);
    lvc2ItemCDtemp                  VARCHAR2(100);   --���iCD�A�i�ڔԍ��̈ꎞ�ޔ�
    lvc2mrpodrtyp                   NUMBER(2);      --�i�ڎ�z�敪�擾�p
    vc2RunChkComment                VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    numCnt_SHIP_REQ                 NUMBER(10);     --[�o�חv��]�ǉ�����
    lnumterm_curr1                   NUMBER(18,4);
    vc2ORGN             VARCHAR2(100);    

--<���C������ >-----------------------------------------------------
begin
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    --//TraceLog�̏o��(Start)
    LBlnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,lCOMMENT_MSGLOG_SHIPCOMMSTART);

--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --�o�חv��̧�ق�S�č폜����
    delete from T_SHIP_REQ
        where plant_cd = pvc2PlantCd;

--DBMS_OUTPUT.PUT_LINE('���o�ɃC���^�t�F�[�X�t�@�C���̑��݊m�F');

    --[�o�חv��]�ǉ������̏�����
    numCnt_SHIP_REQ := 0;


    --���o�ɃC���^�t�F�[�X�t�@�C���̑��݊m�F
    select count(*) into lnumterm_curr from T_PRD_INV_IF
    where plant_cd = pvc2PlantCd;

    LBlnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0829)���o�ɲ��̪��̧�ٓǍ��݌����F' || lnumterm_curr);

    if lnumterm_curr > 0 then--������������

--vc2RunChkComment := '���������ʉ� 00020';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        open cur_T_PRD_INV_IF(pvc2PlantCd);

        loop
            fetch cur_T_PRD_INV_IF into lRtpT_PRD_INV_IF;
            exit when cur_T_PRD_INV_IF%notfound;

            --���o�ɃC���^�t�F�[�X�t�@�C�����o�חv���t�@�C���֒ǉ�
            insert into t_ship_req (
                                    COMPANY_CD,
                                    SLIP_TYP,
                                    SLIP_CTRL_GRP,
                                    SLIP_CD,
                                    SLIP_DATE,
                                    LINE_NO,
                                    UPD_ODR_NO,
                                    CRCT_TYP,
                                    ORGN_SLIP_CTRL_GRP,
                                    ORGN_SLIP_CD,
                                    ORGN_SLIP_DATE,
                                    ORGN_LINE_NO,
                                    ODR_SLIP_TYP,
                                    ODR_SLIP_CTRL_GRP,
                                    ODR_SLIP_CD,
                                    ODR_SLIP_DATE,
                                    ODR_LINE_NO,
                                    JOB_ODR_FLG,
                                    CUST_CD,
                                    CUST_NAME,
                                    BRANCH_CD,
                                    BRANCH_NAME,
                                    DIRECT_DLV_TYP,
                                    DLV_LOC_CD,
                                    DLV_LOC_NAME,
                                    COMM_CD,
                                    COMM_NAME,
                                    SPEC,
                                    COMM_SIZE,
                                    COLOR,
                                    PRD_COMM_CODE_CHG_TYP,
                                    SCDL_SHIP_DATE,
                                    SCDL_DLV_DATE,
                    PLANT_CD,
                                    SHIP_WH_CD,
                                    WH_CD,
                                    RCV_ISSUE_QTY,
                                    TOTAL_RCV_ISSUE_QTY,
                                    REMAIN_RCV_ISSUE_QTY,
                                    ODR_ACPT_JOB_ODR_NO,
                                    ITEM_CD,
                                    MRP_ODR_TYP,
                                    OD_TYP,
                                    OD_NO,
                                    JOB_ODR_CD,
                                    JOB_ODR_DETAIL_NO,
                                    PRD_ERROR_TYP,
                                    SHIP_DATE,
                    CREATED_DATE,
                    CREATED_BY,
                    CREATED_PRG_NM,
                    UPDATED_DATE,
                    UPDATED_BY,
                    UPDATED_PRG_NM,
                    MODIFY_COUNT        
                                    )
                                    values
                                    (
                                    lRtpT_PRD_INV_IF.COMPANY_CD,
                                    lRtpT_PRD_INV_IF.SLIP_TYP,
                                    lRtpT_PRD_INV_IF.SLIP_CTRL_GRP,
                                    lRtpT_PRD_INV_IF.SLIP_CD,
                                    lRtpT_PRD_INV_IF.SLIP_DATE,
                                    lRtpT_PRD_INV_IF.LINE_NO,
                                    lRtpT_PRD_INV_IF.UPD_ODR_NO,
                                    lRtpT_PRD_INV_IF.CRCT_TYP,
                                    lRtpT_PRD_INV_IF.ORGN_SLIP_CTRL_GRP,
                                    lRtpT_PRD_INV_IF.ORGN_SLIP_CD,
                                    lRtpT_PRD_INV_IF.ORGN_SLIP_DATE,
                                    lRtpT_PRD_INV_IF.ORGN_LINE_NO,
                                    lRtpT_PRD_INV_IF.ODR_SLIP_TYP,
                                    lRtpT_PRD_INV_IF.ODR_SLIP_CTRL_GRP,
                                    lRtpT_PRD_INV_IF.ODR_SLIP_CD,
                                    lRtpT_PRD_INV_IF.ODR_SLIP_DATE,
                                    lRtpT_PRD_INV_IF.ODR_LINE_NO,
                                    lRtpT_PRD_INV_IF.JOB_ODR_FLG,
                                    lRtpT_PRD_INV_IF.CUST_CD,
                                    lRtpT_PRD_INV_IF.CUST_NAME,
                                    lRtpT_PRD_INV_IF.BRANCH_CD,
                                    lRtpT_PRD_INV_IF.BRANCH_NAME,
                                    lRtpT_PRD_INV_IF.DIRECT_DLV_TYP,
                                    lRtpT_PRD_INV_IF.DLV_LOC_CD,
                                    lRtpT_PRD_INV_IF.DLV_LOC_NAME,
                                    lRtpT_PRD_INV_IF.COMM_CD,
                                    lRtpT_PRD_INV_IF.COMM_NAME,
                                    lRtpT_PRD_INV_IF.SPEC,
                                    lRtpT_PRD_INV_IF.COMM_SIZE,
                                    lRtpT_PRD_INV_IF.COLOR,
                                    lRtpT_PRD_INV_IF.PRD_COMM_CODE_CHG_TYP,
                                    lRtpT_PRD_INV_IF.SCDL_SHIP_DATE,
                                    lRtpT_PRD_INV_IF.SCDL_DLV_DATE,
                    lRtpT_PRD_INV_IF.PLANT_CD,
                                    lRtpT_PRD_INV_IF.SHIP_WH_CD,
                                    lRtpT_PRD_INV_IF.WH_CD,
                                    lRtpT_PRD_INV_IF.RCV_ISSUE_QTY,
                                    lRtpT_PRD_INV_IF.TOTAL_RCV_ISSUE_QTY,
                                    lRtpT_PRD_INV_IF.REMAIN_RCV_ISSUE_QTY,
                                    lRtpT_PRD_INV_IF.ODR_ACPT_JOB_ODR_NO,
                                    lRtpT_PRD_INV_IF.COMM_CD,
                                    lRtpT_PRD_INV_IF.MRP_ODR_TYP,
                                    lRtpT_PRD_INV_IF.OD_TYP,
                                    lRtpT_PRD_INV_IF.OD_NO,
                                    lRtpT_PRD_INV_IF.JOB_ODR_CD,
                                    lRtpT_PRD_INV_IF.JOB_ODR_DETAIL_NO,
                                    lRtpT_PRD_INV_IF.PRD_ERROR_TYP,
                                    lRtpT_PRD_INV_IF.SHIP_DATE,
                                    sysdate,
                                    pvc2UserId,
                    MY_SQL_NAME,
                                    sysdate,
                                    pvc2UserId,
                    MY_SQL_NAME,
                    0
                                    );

            --[�o�חv��]�ǉ������̃C���N�������g
            numCnt_SHIP_REQ := numCnt_SHIP_REQ + 1;


            --�ޔ������i�ڔԍ�����ɕi��Ͻ��Əƍ�
            select count(*) into lnumterm_curr from M_ITEM ITEM
                                              where ITEM_CD = lRtpT_PRD_INV_IF.COMM_CD;

            if lnumterm_curr <= 0 then --�ް������݂��Ȃ��ꍇ

--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--DBMS_OUTPUT.PUT_LINE('�ް������݂��Ȃ��ꍇ');

                update t_ship_req set MRP_ODR_TYP = 0,  --�i�ڎ�z�敪
                                      PRD_ERROR_TYP = 9 --���Y���G���[�敪 = 9(�װ�ް�)
                                where COMPANY_CD  = lRtpT_PRD_INV_IF.COMPANY_CD  --PK���X�V����
                                  and SLIP_TYP  = lRtpT_PRD_INV_IF.SLIP_TYP
                                  and SLIP_CTRL_GRP = lRtpT_PRD_INV_IF.SLIP_CTRL_GRP
                                  and SLIP_CD = lRtpT_PRD_INV_IF.SLIP_CD
                                  and SLIP_DATE = lRtpT_PRD_INV_IF.SLIP_DATE
                                  and LINE_NO = lRtpT_PRD_INV_IF.LINE_NO
                                  and UPD_ODR_NO = lRtpT_PRD_INV_IF.UPD_ODR_NO
                  and plant_cd = pvc2PlantCd ;

            else--�ް������݂���ꍇ

--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--DBMS_OUTPUT.PUT_LINE('�ް������݂���ꍇ');
                --�i�ڎ�z�敪�̎擾
                select mrp_odr_typ into lvc2mrpodrtyp from M_ITEM
                                                          where ITEM_CD = lRtpT_PRD_INV_IF.COMM_CD;

                update t_ship_req set MRP_ODR_TYP = lvc2mrpodrtyp, --�擾�����i�ڎ�z�敪�̐ݒ�
                                      PRD_ERROR_TYP = 1            --���Y���G���[�敪 = 1(����)
                                where COMPANY_CD  = lRtpT_PRD_INV_IF.COMPANY_CD  --PK���X�V����
                                  and SLIP_TYP  = lRtpT_PRD_INV_IF.SLIP_TYP
                                  and SLIP_CTRL_GRP = lRtpT_PRD_INV_IF.SLIP_CTRL_GRP
                                  and SLIP_CD = lRtpT_PRD_INV_IF.SLIP_CD
                                  and SLIP_DATE = lRtpT_PRD_INV_IF.SLIP_DATE
                                  and LINE_NO = lRtpT_PRD_INV_IF.LINE_NO
                                  and UPD_ODR_NO = lRtpT_PRD_INV_IF.UPD_ODR_NO
                                  and plant_cd = pvc2PlantCd;
            end if;

------�G���[�`�F�b�N�̒ǉ��@�@�o�׎��ѐ����}�C�i�X��
                    
            select RCV_ISSUE_QTY,ORGN_SLIP_CTRL_GRP into lnumterm_curr1,vc2ORGN from T_SHIP_REQ
                                where COMPANY_CD  = lRtpT_PRD_INV_IF.COMPANY_CD  --PK���X�V����
                                  and SLIP_TYP  = lRtpT_PRD_INV_IF.SLIP_TYP
                                  and SLIP_CTRL_GRP = lRtpT_PRD_INV_IF.SLIP_CTRL_GRP
                                  and SLIP_CD = lRtpT_PRD_INV_IF.SLIP_CD
                                  and SLIP_DATE = lRtpT_PRD_INV_IF.SLIP_DATE
                                  and LINE_NO = lRtpT_PRD_INV_IF.LINE_NO
                                  and UPD_ODR_NO = lRtpT_PRD_INV_IF.UPD_ODR_NO
                                  and plant_cd = pvc2PlantCd;
     if (lnumterm_curr1 < 0) AND (vc2ORGN IS NULL)  then
                update t_ship_req set PRD_ERROR_TYP = 9            --���Y���G���[�敪  9(�װ�ް�)
                                where COMPANY_CD  = lRtpT_PRD_INV_IF.COMPANY_CD  --PK���X�V����
                                  and SLIP_TYP  = lRtpT_PRD_INV_IF.SLIP_TYP
                                  and SLIP_CTRL_GRP = lRtpT_PRD_INV_IF.SLIP_CTRL_GRP
                                  and SLIP_CD = lRtpT_PRD_INV_IF.SLIP_CD
                                  and SLIP_DATE = lRtpT_PRD_INV_IF.SLIP_DATE
                                  and LINE_NO = lRtpT_PRD_INV_IF.LINE_NO
                                  and UPD_ODR_NO = lRtpT_PRD_INV_IF.UPD_ODR_NO
                                  and plant_cd = pvc2PlantCd;
       end if;  
        end loop;

        close cur_T_PRD_INV_IF;

        --���o�Ɏ��уC���^�t�F�[�X�t�@�C���̑S���폜
        delete from T_PRD_INV_IF
                where plant_cd = pvc2PlantCd;

    end if;

    --[�o�חv��]�ǉ������̏o��
    LBlnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                         MY_SQL_NAME, APS_PROC_CNT, '(SBM0063)�y�o�חv���z�ǉ������F ' || numCnt_SHIP_REQ || ' ��');

--vc2RunChkComment := '���������ʉ� 00090';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'[�o�חv��]�ǉ������̏o�͌���:'||numCnt_SHIP_REQ);

--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --//TraceLog�̏o��(End)
    LBlnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0731)'||lCOMMENT_MSGLOG_SHIPCOMMEND);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN true;

--< ��O���� >---------------------------------------------------------------
exception
    WHEN OTHERS THEN   --�I���N���G���[
--20031105 DBMS_OUTPUT.PUT_LINE('���I���N���G���[��');

        ROLLBACK;

        --//�ُ�I���̃��b�Z�[�W
        LBlnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                             MY_SQL_NAME, APS_COM_ORACLE_ERR,'(SBM0064)'|| lCOMMENT_MSGLOG_SHIPCOMMEND || LOGMSG_ERR);

        /* TraceLog �̏o�́i���s�ʒu�j */
        LblnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                               MY_SQL_NAME, METHOD_END || vc2RunChkComment);

        --//TraceLog�̏o��
        LBlnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0064)'||lCOMMENT_MSGLOG_SHIPCOMMEND || LOGMSG_ERR);
        COMMIT;
        RETURN false;
end;
/
