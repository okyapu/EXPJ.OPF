CREATE OR REPLACE procedure SQLPUCHODRINST(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlPuchOdrInst.sql,v $
'$Author: feng-yi $
'$Revision: 1.9 $ $Date: 2011/12/23 03:19:57 $
'                        2005.10.24 unicode�Ή��ivarchar2��4�{�j
'                        2009.02.19 �d�������Ή�
'
'
' �@�\      : �����w���m����s�i���ʉݑΉ��j
'
' �߂�l    :
'
'
' ������    : ��MetamorBase���ʁi�K�{�j
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             ���v���O�����ŗL�i�����\����܂��́A�����[�����͕K�{�j
'             pvc2StartDate        - (i)�����\���
'             pvc2DlvDate          - (i)�����[����
'             pvc2PuchOdrCd        - (i)�����ԍ�
'             pvc2VendCd           - (i)�����R�[�h
'             pvc2PuchOdrPerson    - (i)�����S����
'             pvc2JobOdrCd         - (i)����
,             pvc2ApprPurInst        --(i)�����w������
,             pvc2ApprPowerTyp       --(i)���[�U���F����
'
'
' �@�\����  : �����w���f�[�^�̊m����s���B���̏����ɂăI�[�_�̃����e�i���X�͕s�\
'             �ƂȂ蒍�����o�́A���ѓ��͂��\�ƂȂ鉺�ʕ��i�����݂���ꍇ�͏o�Ɏw
'             �����쐬�����B
'             �܂��A���[�g����������ݒ肩�A�M�݈ȊO�̃f�[�^�ɑ΂��āA�M�݋��z��
'             �v�Z���A�ݒ肷��B
'
' ���l      :(#714)�H��CD=00�Ή�
'
------------------------------------------------------------------------------*/

--< �v���V�[�W������` >-----------------------------------------------------
    pvc2LogMode             VARCHAR2        --�@�k�n�f���[�h
   ,pvc2OutputMode          VARCHAR2        --�A�o�̓��[�h
   ,pvc2OutputPath          VARCHAR2        --�B�o�̓p�X
   ,pvc2OutputName          VARCHAR2        --�C�o�̓t�@�C����
   ,pvc2UserId              VARCHAR2        --�D���[�U�h�c
   ,pvc2BusinessName        VARCHAR2        --�E�Ɩ���
   ,pvc2PlantCd             VARCHAR2        --�F�H��R�[�h
   ,pvc2StartDate           VARCHAR2        --�G���������
   ,pvc2DlvDate             VARCHAR2        --�H�����[����
   ,pvc2PuchOdrCd           VARCHAR2        --�I�����ԍ�
   ,pvc2VendCd              VARCHAR2        --�J�����R�[�h
   ,pvc2PuchOdrPerson       VARCHAR2        --�K�����S����
   ,pvc2JobOdrCd            VARCHAR2        --�L����
   ,pvc2ApprPurInst           VARCHAR2        --�M�����w������
   ,pvc2ApprPowerTyp      VARCHAR2        --�N���[�U���F����
)
IS

    /* �萔�̐錾 */

    METHOD_START            VARCHAR2(20) := 'START';          --���O�p���\�b�h�J�n�錾
    METHOD_END              VARCHAR2(12) := 'End';            --���O�p���\�b�h�I���錾
    MY_SQL_NAME             VARCHAR2(56) := 'SQLPUCHODRINST'; --�o�k�^�r�p�k��
    LOGMSG_START_PGNM_PUCHODRINST   VARCHAR2(104) := '<< �����w���m��J�n >>';
    LOGMSG_END_PGNM_PUCHODRINST     VARCHAR2(104) := '<< �����w���m��I�� >>';

    APS_COM_BATCH_START     VARCHAR2(28) := 'ZZ09001';        --�o�b�`�������J�n���܂����B
    APS_COM_BATCH_END       VARCHAR2(28) := 'ZZ09002';        --�o�b�`�������I�����܂����B
    APS_NOTENTRY_CD         VARCHAR2(28) := 'ZZ01104';        --�K�{���ڂ����͂���Ă��܂���B
    APS_NOTENTRY_VEND_CD    VARCHAR2(28) := 'AE50037';        --�����R�[�h�����ݒ�̃f�[�^�����݂��܂��B
    APS_NOTENTRY_WH_CD      VARCHAR2(28) := 'AE00126';        --�����ۊǋ悪���݂��܂���B
    APS_NOTEXIST_SYS_PARAMETER VARCHAR2(28) := 'AE00127';     --�L���x���i�݌ɊǗ��t���O���p�����[�^�ɒ�`����Ă��܂���B

    LOGMSG_ERR              VARCHAR2(40) := '�@�ُ�I��';
    LOGMSG_PROCCOUNT        VARCHAR2(48) := '�@���������F';
    LOGMSG_STARTDATE        VARCHAR2(56) := '�@�����\����F';
    LOGMSG_DLVDATE          VARCHAR2(56) := '�@�����[�����F';
    LOGMSG_JOBODRCD         VARCHAR2(32) := '�@���ԁF';
    LOGMSG_ROWCOUNT         VARCHAR2(48) := '�@�Ώی����F';
    LOGMSG_COUNTNORMAL      VARCHAR2(48) := '�@���팏���F';

    numRowCount             NUMBER(11)   := 0;                --�Ώۃf�[�^����
    numCountNormal          NUMBER(11)   := 0;                --����f�[�^����

    /* �M�݊��Z���i�p�����[�^ */
    pvc2CompanyCd           VARCHAR2(100) := Null;             --��ЃR�[�h
    pdtmRateJudgeDate       DATE         := Null;             --���[�g�����
    pvc2ExchReserveCd       VARCHAR2(100) := Null;             --�ב֗\��R�[�h
    pnumConvertTyp          NUMBER(02)   := 0;                --�ϊ�����(�O�݁��M��)
    pnumAfterAmount         NUMBER(18,4) := 0;                --�ϊ�����z
    pnumRoundTyp            NUMBER(02)   := 0;                --�[�������敪
    pnumExchRate            NUMBER(20,6) := 0;                --�בփ��[�g
    pnumExchTyp             NUMBER(02)   := 0;                --�ב֎��
    pvc2VendCurCd           VARCHAR2(100) := NULL;             --�����ʉ݃R�[�h
    pvc2VendCurName         VARCHAR2(160) := NULL;             --�����ʉݖ�
    pvc2VendCurSymbol       VARCHAR2(100) := NULL;             --�����ʉ݋L��
    pvc2VendCurUnit         VARCHAR2(100) := NULL;             --�����ʉݒP��
    pnumVendDecimalFig      NUMBER(02)   := 0;                --����揬������
    pvc2HomeCurCd           VARCHAR2(100) := NULL;             --���Ёi�M�݁j�ʉ݃R�[�h
    pvc2HomeCurName         VARCHAR2(160) := NULL;             --���Ёi�M�݁j�ʉݖ�
    pvc2HomeCurSymbol       VARCHAR2(100) := NULL;             --���Ёi�M�݁j�ʉ݋L��
    pvc2HomeCurUnit         VARCHAR2(100) := NULL;             --���Ёi�M�݁j�ʉݒP��
    pnumHomeDecimalFig      NUMBER(02)   := 0;                --���Ёi�M�݁j��������
    pvc2ErrorCd             VARCHAR2(28) := NULL;             --�G���[�R�[�h

    /* �����c���R�[�h */
    vc2PUCH_ODR_CD          VARCHAR2(100);   --�����ԍ�
    vc2ITEM_CD              VARCHAR2(100);   --�i�ڔԍ�
    vc2WH_CD                VARCHAR2(100);   --����ꏊ
    vc2COMPANY_CD           VARCHAR2(100);   --��ЃR�[�h
    vc2VEND_CD              VARCHAR2(100);   --�����R�[�h
    vc2PLANT_CD             VARCHAR2(8);   --�H��R�[�h
    vc2PUCH_ODR_PERSON      VARCHAR2(160);   --�����S����
    dtmPUCH_ODR_START_DATE  DATE;           --���������
    dtmPUCH_ODR_DLV_DATE    DATE;           --�����[��
    numPUCH_ODR_QTY         NUMBER(18,4);   --������
    numUNIT_COST_TYP        NUMBER(02);     --�P���敪
    numUNIT_COST            NUMBER(18,4);   --�P��
    numPUCH_ODR_AMOUNT      NUMBER(18,4);   --�������z
    numPUCH_ODR_GNR_TYP     NUMBER(02);     --�������������敪
    dtmPUCH_ODR_INST_DATE   DATE;           --�����w����
    numPUCH_ODR_INST_SLIP_ISS_FLG NUMBER(01);  --�����`�[���s�ς݃t���O
    dtmPUCH_ODR_SLIP_ISS_DATE     DATE;     --�����`�[���s��
    dtmACPT_CMPLT_DATE      DATE;           --���������
    numPUCH_ODR_STS_TYP     NUMBER(02);     --������ԋ敪
    numINSPC_CMPLT_FLG      NUMBER(01);     --���������t���O
    dtmINSPC_CMPLT_DATE     DATE;           --����������
    dtmCONFIRM_DLV_DATE     DATE;           --�񓚔[��
    numSPL_ITEM_TYP         NUMBER(02);     --�󋋕i�敪
    numACPT_INSPC_TYP       NUMBER(02);     --��������������敪
    numINV_CTRL_FLG         NUMBER(01);     --�݌ɊǗ��t���O
    vc2WORK_ODR_CD          VARCHAR2(100);   --��ƌv��ԍ�
    vc2WORK_IN_PROC_CD      VARCHAR2(100);   --�d�|��ƃR�[�h
    vc2OD_NO                VARCHAR2(100);   --�I�[�_�f�}���h�ԍ�
    dtmRATE_JUDGE_DATE      DATE;           --���[�g�����
    numEXCH_RATE            NUMBER(20,6);   --�בփ��[�g
    numNET_AMOUNT           NUMBER(18,4);   --�{�̋��z
    numAMOUNT_INCLUDE_TAX   NUMBER(18,4);   --�ō����z
    numHOME_CUR_AMOUNT      NUMBER(18,4);   --�M�݋��z
    vc2TAX_CD               VARCHAR2(100);   --�ŃR�[�h
    numTAX_ROUND_TYP        NUMBER(02);     --�Œ[���敪
    numNON_NO_ITEM_FLG      NUMBER(01);     --���i�����t���O
    numPUCH_ODR_EDI_ISS_FLG   NUMBER(01);   --�d�c�h�f�[�^�o�͍σt���O
    dtmPUCH_ODR_EDI_ISS_DATE  DATE;         --�d�c�h�f�[�^�o�͓�
    numPUCH_ODR_FAX_ISS_FLG   NUMBER(01);   --�e�`�w�f�[�^�o�͍σt���O
    dtmPUCH_ODR_FAX_ISS_DATE  DATE;         --�e�`�w�f�[�^�o�͓�
    numPUCH_ODR_MAIL_ISS_FLG  NUMBER(01);   --�l�`�h�k�f�[�^�o�͍σt���O
    dtmPUCH_ODR_MAIL_ISS_DATE DATE;         --�l�`�h�k�f�[�^�o�͓�
    vc2APPR_ID             VARCHAR2(100);   --�m����s��
    dtmAPPR_DATE                DATE;           --�m���

    /* ���v�ʃ��R�[�h */
    vc2OD_OD_NO             VARCHAR2(100);   --�I�[�_�f�}���h�ԍ�
    vc2OD_PS_EDITION        VARCHAR2(100);   --���v�ʕi�ڍ\���Ő�
    vc2OD_JOB_ODR_CD        VARCHAR2(100);   --����
    numOD_ODR_STS_TYP       NUMBER(02);     --�I�[�_��ԋ敪
    numOD_DM_STS_TYP        NUMBER(02);     --�f�}���h��ԋ敪
    numOD_OD_TYP            NUMBER(02);     --�I�[�_�f�}���h�敪
    dtmOD_DUE_DATE          DATE;           --�v���[��
    dtmOD_ODR_START_DATE    DATE;           --��z�����
    dtmOD_PRD_DUE_DATE      DATE;           --�����[��
    dtmOD_PRD_START_DATE    DATE;           --���������
    numOD_DM_QTY            NUMBER(18,4);   --�f�}���h��
    numOD_ODR_QTY           NUMBER(18,4);   --�I�[�_��
    numOD_MRP_ODR_TYP       NUMBER(02);     --�i�ڎ�z�敪
    numOD_OUTSIDE_TYP       NUMBER(02);     --���v�ʓ��O��敪
    numOD_PS_UNIT_QTY       NUMBER(18,4);   --���i�\���P�ʐ�
    numOD_PS_UNIT_DENOMINATOR  NUMBER(18,4);  --���i�\���P�ʐ�����
    numOD_PS_UNIT_NUMERATOR NUMBER(18,4);   --���i�\���P�ʐ����q
    vc2OD_PARENT_OD_NO      VARCHAR2(100);   --�e�I�[�_�f�}���h�ԍ�
    numOD_ODR_RELEASE_FLG   NUMBER(01);     --�I�[�_�����σt���O

    /* �ϐ��̒�` */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --�t�@�C���n���h��
    dtmBusinessOprDate      DATE;           --�Ɩ����t
    numTransactionCount     NUMBER(10);     --��������

    vc2PlantCd              VARCHAR2(8);    --�H��R�[�h
    vc2StartDate            VARCHAR2(40);   --�����\���
    vc2DlvDate              VARCHAR2(40);   --�����[����
    vc2PuchOdrCd            VARCHAR2(100);   --�����ԍ�
    vc2VendCd               VARCHAR2(100);   --�����R�[�h
    vc2PuchOdrPerson        VARCHAR2(160);   --�����S����
    vc2JobOdrCd             VARCHAR2(100);   --����
    vc2ApprPurInst           VARCHAR2(100);    --�����w������
    vc2ApprPowerTyp      VARCHAR2(100);      --���[�U���F����

    dtmBusinessDate         DATE;           --�Ɩ��^�p���i�[�p
    blnRet                  BOOLEAN;        --���ʊ֐��̖ߒl
    vc2CommentCount         VARCHAR2(1024);  --���b�Z�[�W�쐬�p
    vc2CommentDate          VARCHAR2(1024);  --���b�Z�[�W�쐬�p
    vc2CommentJobod         VARCHAR2(1024);  --���b�Z�[�W�쐬�p
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�쐬�p
    vc2RunChkComment        VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2SQL                  VARCHAR2(4096); --SELECT���쐬�p
    intItemCursorName       INTEGER;        --view�p�J�[�\���h�c
    blnRet_EXC              INTEGER;
    blnErrFLG               BOOLEAN;        --�װ��ܰ�ݸނ̔���(True:�װ�AFalse:ܰ�ݸ�)

    /* ��O�����p�ϐ� */
    excERR_GET_BUSINESS_DATE        EXCEPTION;      --�Ɩ����t�擾�G���[
    excERR_NOTENTRY_PLANT_CD        EXCEPTION;      --�H��R�[�h�����̓G���[
    excERR_NOTENTRY_DATE_CD         EXCEPTION;      --���t���ږ����̓G���[
    excFNCPUCHODRINSTOUTSIDEISSUE   EXCEPTION;      --�o�Ɏw��(�O��)�ŃG���[����
    excOTHERS                       EXCEPTION;      --���̑��̃G���[����


--<���C������ >-----------------------------------------------------
BEGIN
    /* LogFile �� OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

    /* �Ɩ��J�n���b�Z�[�W�̍쐬 */
    vc2Comment      := SUBSTR('�@�H��R�[�h�F' || '[ ' || pvc2PlantCd       || ' ]' ||
                              '�@�����\����F' || '[ ' || pvc2StartDate     || ' ]' ||
                              '�@�����[�����F' || '[ ' || pvc2DlvDate       || ' ]' ||
                              '�@�����b�c�F' || '[ ' || pvc2VendCd        || ' ]' ||
                              '�@�����S���ҁF' || '[ ' || pvc2PuchOdrPerson || ' ]' ||
                              '�@�����ԍ��F'   || '[ ' || pvc2PuchOdrCd     || ' ]' ||
                              '�@���ԁF'       || '[ ' || pvc2JobOdrCd      || ' ]',1,256);

    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    blnRet :=   FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
                          '(SBM0517)' || LOGMSG_START_PGNM_PUCHODRINST || vc2Comment);
    COMMIT;

    /* �H��R�[�h�`�F�b�N(#714) */
    IF pvc2PlantCd = '' THEN
        IF pvc2PlantCd = '' THEN
            RAISE excERR_NOTENTRY_PLANT_CD;  --�H��R�[�h���ݒ莞�G���[
        END IF;
    END IF;

    /* �Ɩ����t�擾 */
    blnRet := FNCGETBUSINESSDATE(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd, dtmBusinessOprDate);

    IF blnRet = FALSE THEN
        RAISE excERR_GET_BUSINESS_DATE;      --�Ɩ����t�擾�G���[
    END IF;

    /* ���t���ڃ`�F�b�N */
    IF pvc2StartDate = '' THEN
        IF pvc2DlvDate = '' THEN
            RAISE excERR_NOTENTRY_DATE_CD;   --�����\����E�����[�����A�������ݒ莞�G���[
        END IF;
    END IF;

    /* �u���������v�̏����� */
    numTransactionCount := 0;

    /* �H��R�[�h���w�肳��Ă���ꍇ(#714) */
    IF pvc2PlantCd = '' THEN
        vc2PlantCd := '';
    ELSE
        vc2PlantCd := pvc2PlantCd;
    END IF;

    /* ������������w�肳��Ă���ꍇ */
    IF pvc2StartDate = '' THEN
        vc2StartDate := '';
    ELSE
        vc2StartDate := pvc2StartDate;
    END IF;

    /* �����[�������w�肳��Ă���ꍇ */
    IF pvc2DlvDate   = '' THEN
        vc2DlvDate   := '';
    ELSE
        vc2DlvDate   := pvc2DlvDate;
    END IF;

    /* �����ԍ� */
    vc2PuchOdrCd     := pvc2PuchOdrCd;

    /* �����R�[�h */
    vc2VendCd        := pvc2VendCd;

    /* �����S���� */
    vc2PuchOdrPerson := pvc2PuchOdrPerson;

    /* ���� */
    vc2JobOdrCd      := pvc2JobOdrCd;

    /* �����w������ */
    vc2ApprPurInst       := pvc2ApprPurInst;

    /* ���[�U���F���� */
    vc2ApprPowerTyp     := pvc2ApprPowerTyp;

    /*�m�����c�n�����p�r�p�k���̍쐬 */
    intItemCursorName := DBMS_SQL.OPEN_CURSOR;
        vc2SQL := 'SELECT ';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_CD,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_START_DATE,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_DLV_DATE,';
        vc2SQL := vc2SQL || 'PO.COMPANY_CD,';
        vc2SQL := vc2SQL || 'PO.VEND_CD,';
        vc2SQL := vc2SQL || 'PO.PLANT_CD,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_PERSON,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_INST_DATE,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_STS_TYP,';
        vc2SQL := vc2SQL || 'PO.INV_CTRL_FLG,';
        vc2SQL := vc2SQL || 'PO.PUCH_ODR_QTY,';
        vc2SQL := vc2SQL || 'PO.RATE_JUDGE_DATE,';
        vc2SQL := vc2SQL || 'PO.AMOUNT_INCLUDE_TAX,';
        vc2SQL := vc2SQL || 'OD.OD_NO,';
        vc2SQL := vc2SQL || 'OD.JOB_ODR_CD,';
        vc2SQL := vc2SQL || 'OD.PARENT_OD_NO';
        vc2SQL := vc2SQL || ' FROM T_RLSD_PUCH_ODR PO,T_OD OD';
        vc2SQL := vc2SQL || ' WHERE       PO.OD_NO = OD.OD_NO(+)';
        vc2SQL := vc2SQL || ' AND         PO.PUCH_ODR_STS_TYP = 1';
        vc2SQL := vc2SQL || ' AND         PO.DIRECT_FLG = 0';

    /* ��ʂ̓��̓f�[�^�łr�p�k���̏������쐬 */
    /* �H��R�[�h�̏���(#714) */
        vc2SQL := vc2SQL || ' AND PO.PLANT_CD = '''|| vc2PlantCd || '''';

    /* �����\����̏��� */
    IF vc2StartDate IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.PUCH_ODR_START_DATE <=
                  TO_DATE('''|| vc2StartDate || ''',''yyyy/mm/dd hh24:mi'')';
    END IF;

    /* �����[�����̏��� */
    IF vc2DlvDate   IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.PUCH_ODR_DLV_DATE   <=
                  TO_DATE(''' || vc2DlvDate || ''',''yyyy/mm/dd hh24:mi'')';
    END IF;

    /* �����ԍ��̏��� */
    IF vc2PuchOdrCd IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.PUCH_ODR_CD <= '''|| vc2PuchOdrCd || '''';
    END IF;

    /* �����R�[�h�̏��� */
    IF vc2VendCd IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.VEND_CD = '''|| vc2VendCd || '''';
    END IF;

    /* �����S���҂̏��� */
    IF vc2PuchOdrPerson IS NOT Null THEN
        vc2SQL := vc2SQL || ' AND PO.PUCH_ODR_PERSON = '''|| vc2PuchOdrPerson || '''';
    END IF;

    /* ���Ԃ̏��� */
    IF vc2JobOdrCd IS NOT Null THEN
        IF INSTR(vc2JobOdrCd, '%',1,1) <= 0 THEN
            vc2SQL := vc2SQL || ' AND OD.JOB_ODR_CD = ''' || vc2JobOdrCd || '''';
        ELSE
                vc2SQL := vc2SQL || ' AND OD.JOB_ODR_CD like '''|| vc2JobOdrCd || '''';
        END IF;
    END IF;

/* ���Ԏ}�Ԃ͖��g�p
'
'        --//���Ԏ}�Ԃ̏���
'---- DBMS_OUTPUT.PUT_LINE('�������������������Ԏ}�Ԃ̏�������������������������������');
'    IF pvc2JobOdrDetailNo <> 0 AND pvc2JobOdrDetailNo IS NOT NULL THEN
'---- DBMS_OUTPUT.PUT_LINE('���������Ԏ}��('|| pvc2JobOdrDetailNo ||')');
'        vc2SQL := vc2SQL || ' AND OD.JOB_ODR_DETAIL_NO = ' || pvc2JOBODRDETAILNO;
'     END IF;
*/

--TraceLog �̏o�́i���s�ʒu�j

blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,1,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,201,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,401,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,601,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,801,200));
blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                      pvc2PlantCd, MY_SQL_NAME, METHOD_END || 'SQL:' || SUBSTR(vc2Sql,1001,200));

    /* �r�p�k���̉�� */
    DBMS_SQL.PARSE(intItemCursorName,vc2SQL,DBMS_SQL.NATIVE);

    /* ��̒�` */
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,1,vc2PUCH_ODR_CD,100);      --// �����ԍ�
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,2,dtmPUCH_ODR_START_DATE); --// ���������
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,3,dtmPUCH_ODR_DLV_DATE);   --// �����[��
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,4,vc2COMPANY_CD,100);       --// ��ЃR�[�h
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,5,vc2VEND_CD,100);          --// �����R�[�h
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,6,vc2PLANT_CD,8);          --// �H��R�[�h
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,7,vc2PUCH_ODR_PERSON,160);  --// �����S����
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,8,dtmPUCH_ODR_INST_DATE);  --// �����w����
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,9,numPUCH_ODR_STS_TYP);    --// ������ԋ敪
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,10,numINV_CTRL_FLG);       --// �݌ɊǗ��t���O
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,11,numPUCH_ODR_QTY);       --// ������
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,12,dtmRATE_JUDGE_DATE);    --// ���[�g�����
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,13,numAMOUNT_INCLUDE_TAX); --// �ō����z
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,14,vc2OD_NO,100);           --// �I�[�_�f�}���h�ԍ�
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,15,vc2OD_JOB_ODR_CD,100);   --// ����
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,16,vc2OD_PARENT_OD_NO,100); --// �e�I�[�_�f�}���h�ԍ�

    /* �J�[�\���̎��s */
    blnRet_EXC := DBMS_SQL.EXECUTE(intItemCursorName);

    /* �s�̃t�F�b�` */
    LOOP
        IF DBMS_SQL.FETCH_ROWS(intItemCursorName) > 0 THEN
            /* ���������J�E���g */
            numTransactionCount := numTransactionCount + 1;
            /* �l�̎擾 */
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,1,vc2PUCH_ODR_CD);         --// �����ԍ�
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,2,dtmPUCH_ODR_START_DATE); --// ���������
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,3,dtmPUCH_ODR_DLV_DATE);   --// �����[��
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,4,vc2COMPANY_CD);          --// ��ЃR�[�h
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,5,vc2VEND_CD);             --// �����R�[�h
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,6,vc2PLANT_CD);            --// �H��R�[�h
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,7,vc2PUCH_ODR_PERSON);     --// �����S����
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,8,dtmPUCH_ODR_INST_DATE);  --// �����w����
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,9,numPUCH_ODR_STS_TYP);    --// ������ԋ敪
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,10,numINV_CTRL_FLG);       --// �݌ɊǗ��t���O
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,11,numPUCH_ODR_QTY);       --// ������
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,12,dtmRATE_JUDGE_DATE);    --// ���[�g�����
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,13,numAMOUNT_INCLUDE_TAX); --// �ō����z
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,14,vc2OD_NO);              --// �I�[�_�f�}���h�ԍ�
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,15,vc2OD_JOB_ODR_CD);      --// ����
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,16,vc2OD_PARENT_OD_NO);    --// �e�I�[�_�f�}���h�ԍ�

            /* ���o�f�[�^�̍X�V */
            IF vc2VEND_CD IS Null THEN
                /* �����R�[�h��Null�̏ꍇ�A�G���[�Ƃ��� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                    pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_VEND_CD,'(SBM0452)�@�����ԍ��F[ '|| vc2PUCH_ODR_CD ||']');
            ELSE
                /* �Ώۃf�[�^�̃J�E���g�A�b�v */
                numRowCount := numRowCount + 1;

                /* �i���ʉ݁j���[�g����������ݒ� */
                IF dtmRATE_JUDGE_DATE IS Null THEN
                    /* �i���ʉ݁j�M�݊��Z���i�p�����[�^�ݒ� */
                    pdtmRateJudgeDate       := dtmPUCH_ODR_DLV_DATE;      --���[�g�����(=�����[��)
                    pvc2ExchReserveCd       := Null;                      --�ב֗\��R�[�h
                    pnumConvertTyp          := 1;                         --�ϊ�����(�O�݁��M��)
                    /* �i���ʉ݁j�M�݊��Z���i���ďo�� */
                    blnRet := FNCCURRENCYCONVERT(UTL_FileHandle,          --�t�@�C���n���h��
                                                 pvc2LogMode,             --�k�n�f���[�h
                                                 pvc2OutputMode,          --�o�̓��[�h
                                                 pvc2UserId,              --���[�U�h�c
                                                 pvc2BusinessName,        --�Ɩ���
                                                 vc2PLANT_CD,             --�H��R�[�h(#714)
                                                 vc2COMPANY_CD,           --��ЃR�[�h
                                                 vc2VEND_CD,              --�����R�[�h
                                                 pdtmRateJudgeDate,       --���[�g�����(�����[��)
                                                 pvc2ExchReserveCd,       --�ב֗\��R�[�h
                                                 numAMOUNT_INCLUDE_TAX,   --�ϊ��O���z
                                                 pnumConvertTyp,          --�ϊ�����(1:�O�݁��M��)
                                                 pnumAfterAmount,         --�ϊ�����z
                                                 pnumRoundTyp,            --�[�������敪
                                                 pnumExchRate,            --�בփ��[�g
                                                 pnumExchTyp,             --�ב֎��
                                                 pvc2VendCurCd,           --�����ʉ݃R�[�h
                                                 pvc2VendCurName,         --�����ʉݖ�
                                                 pvc2VendCurSymbol,       --�����ʉ݋L��
                                                 pvc2VendCurUnit,         --�����ʉݒP��
                                                 pnumVendDecimalFig,      --����揬������
                                                 pvc2HomeCurCd,           --���Ёi�M�݁j�ʉ݃R�[�h
                                                 pvc2HomeCurName,         --���Ёi�M�݁j�ʉݖ�
                                                 pvc2HomeCurSymbol,       --���Ёi�M�݁j�ʉ݋L��
                                                 pvc2HomeCurUnit,         --���Ёi�M�݁j�ʉݒP��
                                                 pnumHomeDecimalFig,      --���Ёi�M�݁j��������
                                                 pvc2ErrorCd              --�G���[�R�[�h
                                                 );
                    /* �i���ʉ݁j�M�݊��Z���i�ŃG���[���� */
                    IF blnRet = FALSE THEN
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                  pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                  pvc2ErrorCd,'(SBM0452)�@�����ԍ��F[ '|| vc2PUCH_ODR_CD ||']');
                        pdtmRateJudgeDate       := Null;
                    END IF;
                /* �����c�t�@�C���̍X�V(������ԋ敪 = 1 -> 2�A�����w���� = �Ɩ��^�p���t�A���ʉݍ���UP) */
                    UPDATE T_RLSD_PUCH_ODR
                        SET PUCH_ODR_STS_TYP   = 2,
                            PUCH_ODR_INST_DATE = dtmBusinessOprDate,
                            RATE_JUDGE_DATE    = pdtmRateJudgeDate,
                            EXCH_RATE          = pnumExchRate,
                            HOME_CUR_AMOUNT    = pnumAfterAmount,
                            UPDATED_DATE       = SYSDATE,
                            UPDATED_BY         = pvc2UserId,
                            UPDATED_PRG_NM     = MY_SQL_NAME,
                            MODIFY_COUNT       = MODIFY_COUNT + 1
                        WHERE
                            PUCH_ODR_CD        = vc2PUCH_ODR_CD AND
                            PUCH_ODR_STS_TYP   = 1
                        ;
                ELSE
                /* �����c�t�@�C���̍X�V(������ԋ敪 = 1 -> 2�A�����w���� = �Ɩ��^�p���t) */
                    UPDATE T_RLSD_PUCH_ODR
                        SET PUCH_ODR_STS_TYP   = 2,
                            PUCH_ODR_INST_DATE = dtmBusinessOprDate,
                            UPDATED_DATE       = SYSDATE,
                            UPDATED_BY         = pvc2UserId,
                            UPDATED_PRG_NM     = MY_SQL_NAME,
                            MODIFY_COUNT       = MODIFY_COUNT + 1
                        WHERE
                            PUCH_ODR_CD        = vc2PUCH_ODR_CD AND
                            PUCH_ODR_STS_TYP   = 1
                        ;
                END IF;
                /*�����w��������1�F���F�ҁA���A���O�C�����[�U�̏��F����"��1:���F�҂̏ꍇ*/
                IF vc2ApprPurInst = 1 AND vc2ApprPowerTyp  = 1 THEN

                         UPDATE  T_RLSD_PUCH_ODR
                         SET APPR_ID   = pvc2UserId,
                            APPR_DATE = dtmBusinessOprDate,
                            UPDATED_DATE       = SYSDATE,
                            UPDATED_BY         = pvc2UserId,
                            UPDATED_PRG_NM     = MY_SQL_NAME,
                            MODIFY_COUNT       = MODIFY_COUNT + 1
                         WHERE
                            PUCH_ODR_CD        = vc2PUCH_ODR_CD
                            ;
                END IF;
                pvc2ErrorCd := null;

                /* �o�Ɏw������(�O��)�����s���� */
                blnRet := FNCPUCHODRINSTOUTSIDEISSUE(UTL_FileHandle,          --�t�@�C���n���h��
                                                    pvc2LogMode,             --�k�n�f���[�h
                                                    pvc2OutputMode,          --�o�̓��[�h
                                                    pvc2UserId,              --���[�U�h�c
                                                    pvc2BusinessName,        --�Ɩ���
                                                    vc2PLANT_CD,             --�H��R�[�h(#714)
                                                    vc2PUCH_ODR_CD,          --�����ԍ�
                                                    vc2OD_NO,                --�I�[�_�f�}���h�ԍ�
                                                    numPUCH_ODR_QTY,         --������
                                                    vc2COMPANY_CD,           --��ЃR�[�h
                                                    vc2VEND_CD,              --�����R�[�h
                                                    pvc2ErrorCd              --�G���[�R�[�h
                                                    );

                 /* �o�Ɏw������(�O��)�Œv���I�G���[���� */
                IF blnRet = FALSE THEN
                    IF pvc2ErrorCd = 'ZZ11006' OR pvc2ErrorCd = 'ZZ06001' THEN
                        ROLLBACK;
                        --�ۊǋ悪���݂��Ȃ�
                        IF pvc2ErrorCd = 'ZZ11006' THEN
                            blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                    pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_WH_CD, '(SBM0452)�����ԍ��F['|| vc2PUCH_ODR_CD ||']');
                        END IF;
                        --�p�����[�^�����݂��Ȃ�
                        IF pvc2ErrorCd = 'ZZ06001' THEN
                            blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                    pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTEXIST_SYS_PARAMETER, '(SBM0399)�H��R�[�h�F['|| vc2PLANT_CD ||']');
                        END IF;
                        COMMIT;
                    ELSE
                        RAISE excFNCPUCHODRINSTOUTSIDEISSUE;
                    END IF;
                ELSE
                    numCountNormal := numCountNormal + 1;
/* ����COMMIT���� */
                    COMMIT;
                END IF;
            END IF;
        ELSE
            EXIT;
        END IF;
    END LOOP;

    /* �R�~�b�g(COMMIT) */
    COMMIT;

    /* �J�[�\���N���[�Y */
    DBMS_SQL.CLOSE_CURSOR(intItemCursorName);

/* �����̏I�� */

    /* �Ɩ��I�����b�Z�[�W�̍쐬 */

    vc2Comment      := SUBSTR('�@���������F' || '[ ' || numTransactionCount || ' ]' ||
                              '�@�Ώی����F' || '[ ' || numRowCount || ' ]' ||
                              '�@���팏���F' || '[ ' || numCountNormal || ' ]',1,256);

    /* �I�����b�Z�[�W�̏o�� */
    blnRet          := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,
                                 pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                                 '(SBM0520)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

    COMMIT;

    /* �g���[�X���O�̏o��(�I��) */
    blnRet          := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    COMMIT;

    /* LogFile �� CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_GET_BUSINESS_DATE THEN    --�Ɩ����t�擾�G���[

            ROLLBACK;

            vc2Comment := SUBSTR('�Ɩ����t�擾�Ɏ��s���܂���',1,256);

        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                           '(SBM0521)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excERR_NOTENTRY_PLANT_CD THEN    --�H��R�[�h�����̓G���[

            ROLLBACK;

            vc2Comment := SUBSTR('�H��R�[�h���w�肳��Ă��܂���B',1,256);

        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0522)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excERR_NOTENTRY_DATE_CD THEN    --���t���ږ����̓G���[

            ROLLBACK;

            vc2Comment := SUBSTR('�����\����܂��́A�����[�������w�肳��Ă��܂���B',1,256);

        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0523)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excFNCPUCHODRINSTOUTSIDEISSUE THEN    --�o�Ɏw������(�O��)�ŃG���[����

            ROLLBACK;

            vc2Comment := SUBSTR('�o�Ɏw�������Œv���I�G���[���������܂���',1,256);

        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0524)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

    WHEN excOthers  THEN   --���̑��̃G���[

            ROLLBACK;

            vc2Comment := SUBSTR('���������̑��̃G���[���������܂���������',1,256);

        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0525)' || LOGMSG_END_PGNM_PUCHODRINST || vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);
END;
/
