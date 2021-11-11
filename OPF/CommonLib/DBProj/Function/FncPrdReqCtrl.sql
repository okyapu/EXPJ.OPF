CREATE OR REPLACE FUNCTION FNCPRDREQCTRL(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' �C������
' 2003.10.16 �V�K�쐬
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
'
' �@�\      : ���Y�v������̍X�V
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
'             pnumDataIndex        - (i)�f�[�^�C���f�b�N�X
'
' �@�\����  : �w�肳�ꂽ���Y�v������̓��t���ڂ̍X�V���s���B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle            IN  UTL_FILE.FILE_TYPE   --�t�@�C���n���h��
   ,pvc2LogMode            IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId             IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2       --// �H��R�[�h
   ,pnumDataIndex          IN  NUMBER              --�f�[�^�C���f�b�N�X
) RETURN BOOLEAN
IS


/* �J�[�\���̐錾 */

/* ROWTYPE �̐錾 */

/* �萔�̐錾 */
    MY_SQL_NAME                         VARCHAR2(52)  := 'FncPrdReqCtrl';
    CTRL_CD_DEFAULT                     VARCHAR2(24)   := 'SYSTEM';  --���۰ٌnð��ق�PrimaryKey�̒l
    PrdReqCtrlPRDREQSTARTDATE           NUMBER(2)     := 1;         --���Y�v�������J�n����
    PrdReqCtrlPRDREQENDDATE             NUMBER(2)     := 2;         --���Y�v�������I������
    PrdReqCtrlITEMCONVSTARTDATE         NUMBER(2)     := 3;         --���i�i�ڕϊ������J�n����
    PrdReqCtrlITEMCONVENDDATE           NUMBER(2)     := 4;         --���i�i�ڕϊ������I������
    PrdReqCtrlMRPDEMANDSTARTDATE        NUMBER(2)     := 5;         --�l�q�o�i�f�}���h���������J�n����
    PrdReqCtrlMRPDEMANDENDDATE          NUMBER(2)     := 6;         --�l�q�o�i�f�}���h���������I������
    PrdReqCtrlSHIPCONVSTARTDATE         NUMBER(2)     := 7;         --�o�׏��i�i�ڕϊ������J�n����
    PrdReqCtrlSHIPCONVENDDATE           NUMBER(2)     := 8;         --�o�׏��i�i�ڕϊ������I������
    PrdReqCtrlSTOCKISSUESTARTDATE       NUMBER(2)     := 9;         --�݌ɏo�ɏ����J�n����
    PrdReqCtrlSTOCKISSUEENDDATE         NUMBER(2)     := 10;        --�݌ɏo�ɏ����I������
    PrdReqCtrlMRPDEMANDSTARTUPDATE      NUMBER(2)     := 11;        --�l�q�o�i�f�}���h���эX�V�J�n����
    PrdReqCtrlMRPDEMANDENDUPDATE        NUMBER(2)     := 12;        --�l�q�o�i�f�}���h���эX�V�I������

/* EXCEPTION �̐錾 */
    excPARAMETER_ERR                    EXCEPTION;                  --�u�����v�G���[

/* MESSAGE �̐錾 */
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';     --�n�q�`�b�k�d�@�d�q�q�n�q
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';     --���̑��@�d�q�q�n�q

/* LOG �̐錾 */
    LOGMSG_START                        VARCHAR2(20)   := 'Start';   --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';     --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';

/* �ϐ��̐錾 SQL */

/* �ϐ��̐錾 WORK */
    blnRet                              BOOLEAN;        --BOOLEAN�^ �ԋp�l
    vc2Comment                          VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2CtrlCd                           VARCHAR2(100);   --SYS�R���g���[���R�[�h
    vc2RunChkComment                    VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    
BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /* ���Y�v������̗L���`�F�b�N */
--DEL     SELECT CTRL_CD INTO vc2CtrlCd FROM SYS_PRD_REQ_CTRL WHERE CTRL_CD = CTRL_CD_DEFAULT;
    SELECT PLANT_CD INTO vc2CtrlCd FROM SYS_PRD_REQ_CTRL WHERE plant_cd = pvc2PlantCd; --A

    /* ���Y�v������̍X�V */
    IF pnumDataIndex = PrdReqCtrlPRDREQSTARTDATE THEN
--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* ���Y�v�������J�n���� */
        UPDATE SYS_PRD_REQ_CTRL SET
                PRD_REQ_START_DATE      = SYSDATE
               ,PRD_REQ_END_DATE        = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlPRDREQENDDATE THEN
--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* ���Y�v�������I������ */
        UPDATE SYS_PRD_REQ_CTRL SET
                PRD_REQ_END_DATE        = SYSDATE
               ,ITEM_CONV_START_DATE    = NULL
               ,ITEM_CONV_END_DATE      = NULL
               ,MRP_DM_START_DATE   = NULL
               ,MRP_DM_END_DATE     = NULL
               ,SHIP_CONV_START_DATE    = NULL
               ,SHIP_CONV_END_DATE      = NULL
               ,STOCK_ISSUE_START_DATE  = NULL
               ,STOCK_ISSUE_END_DATE    = NULL
               ,MRP_DM_START_UPDATE = NULL
               ,MRP_DM_END_UPDATE   = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlITEMCONVSTARTDATE THEN
--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* ���i�i�ڕϊ������J�n���� */
        UPDATE SYS_PRD_REQ_CTRL SET
                ITEM_CONV_START_DATE    = SYSDATE
               ,ITEM_CONV_END_DATE      = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlITEMCONVENDDATE THEN
--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* ���i�i�ڕϊ������I������ */
        UPDATE SYS_PRD_REQ_CTRL SET
                ITEM_CONV_END_DATE      = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A


    ELSIF pnumDataIndex = PrdReqCtrlMRPDEMANDSTARTDATE THEN
--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �l�q�o�i�f�}���h���������J�n���� */
        UPDATE SYS_PRD_REQ_CTRL SET
                MRP_DM_START_DATE   = SYSDATE
               ,MRP_DM_END_DATE     = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlMRPDEMANDENDDATE THEN
--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �l�q�o�i�f�}���h���������I������ */
        UPDATE SYS_PRD_REQ_CTRL SET
                MRP_DM_END_DATE     = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlSHIPCONVSTARTDATE THEN
--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �o�׏��i�i�ڕϊ������J�n���� */
        UPDATE SYS_PRD_REQ_CTRL SET
                SHIP_CONV_START_DATE    = SYSDATE
               ,SHIP_CONV_END_DATE      = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlSHIPCONVENDDATE THEN
--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �o�׏��i�i�ڕϊ������I������ */
        UPDATE SYS_PRD_REQ_CTRL SET
                SHIP_CONV_END_DATE      = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlSTOCKISSUESTARTDATE THEN
--vc2RunChkComment := '���������ʉ� 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �݌ɏo�ɏ����J�n���� */
        UPDATE SYS_PRD_REQ_CTRL SET
                STOCK_ISSUE_START_DATE  = SYSDATE
               ,STOCK_ISSUE_END_DATE    = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A


    ELSIF pnumDataIndex = PrdReqCtrlSTOCKISSUEENDDATE THEN
--vc2RunChkComment := '���������ʉ� 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �݌ɏo�ɏ����I������ */
        UPDATE SYS_PRD_REQ_CTRL SET
                STOCK_ISSUE_END_DATE    = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlMRPDEMANDSTARTUPDATE THEN
--vc2RunChkComment := '���������ʉ� 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �l�q�o�i�f�}���h���эX�V�J�n���� */
        UPDATE SYS_PRD_REQ_CTRL SET
                MRP_DM_START_UPDATE = SYSDATE
               ,MRP_DM_END_UPDATE   = NULL
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A

    ELSIF pnumDataIndex = PrdReqCtrlMRPDEMANDENDUPDATE THEN
--vc2RunChkComment := '���������ʉ� 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �l�q�o�i�f�}���h���эX�V�I������ */
        UPDATE SYS_PRD_REQ_CTRL SET
                MRP_DM_END_UPDATE   = SYSDATE
               ,updated_date = sysdate
        ,updated_by = pvc2UserId
        ,updated_prg_nm = MY_SQL_NAME
        ,modify_count = (modify_count + 1)
--DEL        WHERE CTRL_CD = CTRL_CD_DEFAULT;
    WHERE plant_cd = pvc2PlantCd; --A


    ELSE
--vc2RunChkComment := '���������ʉ� 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* �����G���[ */
        RAISE excPARAMETER_ERR;

    END IF;

    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;


--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excPARAMETER_ERR THEN        --�u�����v�G���[
--DBMS_OUTPUT.PUT_LINE('�u�����v�G���[');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTRB('(SBM0049)' || LOGMSG_ERR || '�F�f�[�^�C���f�b�N�X' || ',' || pnumDataIndex ,
                             1,1024);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN                  --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('���̑��G���[');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTRB('(SBM0021)' || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
END;
/