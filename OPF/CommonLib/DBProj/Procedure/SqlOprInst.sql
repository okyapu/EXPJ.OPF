CREATE OR REPLACE PROCEDURE SQLOPRINST(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation.
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlOprInst.sql,v $
'$Author: geng-jia $
'$Revision: 1.12 $ $Date: 2015/07/09 05:16:05 $
'
' �C������
' 2005.01.20 �E[�����c]."����ꏊ"�ɓo�^������e��ύX�B
'              ��f�t�H���g�󂯓���ۊǋ�擾������Ŏ擾�����ۊǋ�R�[�h
' 2005.10.24 unicode�Ή��ivarchar2��4�{�j
'
' �@�\      : ��Ǝw���m��i���ʉݑΉ��j
'
' �߂�l    :
'
'
' ������    : pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputName       - (i)�o�̓t�@�C���p�X
'             pvc2OutputPath       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2BusinessName     - (i)�Ɩ���
'
'             pvc2OprInstStartDate - (i)�����
'             pvc2WorkOdrDlvDate   - (i)�[��
'             pvc2JobOdrCd         - (i)����
'             pvc2ItemCd           - (i)�i�ڔԍ�
'             pvc2WsCd             - (i)��Ƌ�R�[�h
'             pvc2OprRsltTyp       - (i)��Ǝ��ы敪
'             pvc2OutSideTyp       - (i)��Ǝw���v��i����j
'             pvc2OutSideTyp2      - (i)��Ǝw���v��i�O��j
'             pvc2VendCd           - (i)�����R�[�h
'
' �@�\����  : �i�ڒP�ʂ̍�ƌv��f�[�^�̊m����s���B
'             ���̏����ɂăI�[�_�̃����e�i���X�͕s�ƂȂ�A���ѓ��͂��\�ƂȂ�B
'             �������Ƃɍ쐬����B
'
' ���l      :
'
------------------------------------------------------------------------------*/

--< �v���V�[�W������` >-----------------------------------------------------
    pvc2LogMode             VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode          VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath          VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName          VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId              VARCHAR2    --���[�U��
   ,pvc2PlantCd             VARCHAR2    --�H��R�[�h
   ,pvc2BusinessName        VARCHAR2    --�Ɩ���
   ,pvc2OprInstStartDate    VARCHAR2    --�����
   ,pvc2WorkOdrDlvDate      VARCHAR2    --�[��
   ,pvc2JobOdrCd            VARCHAR2    --����
   ,pvc2ItemCd              VARCHAR2    --�i�ڔԍ�
   ,pvc2WsCd                VARCHAR2    --��Ƌ�R�[�h
   ,pvc2OprRsltTyp          VARCHAR2    --��Ǝ��ы敪
   ,pvc2OutSideTyp          VARCHAR2    --��Ǝw���v��i����j
   ,pvc2OutSideTyp2         VARCHAR2    --��Ǝw���v��i�O��j
   ,pvc2VendCd              VARCHAR2    --�����R�[�h
)
IS

    /* �萔�̐錾 */

    WORK_STS_TYP_NOINSTRACT NUMBER  := 1;   --�i�ڕʍ�Ə�ԋ敪�@���W�J
    WORK_STS_TYP_INSTRACT   NUMBER  := 2;   --�i�ڕʍ�Ə�ԋ敪  �w����
    OPR_RSLT_TYP_TURNOVER   NUMBER  := 1;   --�i�ڕʍ�Ǝ��ы敪�@�o����
    OPR_RSLT_TYP_ITEM       NUMBER  := 2;   --�i�ڕʍ�Ǝ��ы敪�@��Ǝw��
    PROCESS_NOEXPAND        NUMBER  := 0;   --��ƌn��W�J�t���O  ���W�J
    OUTSIDE_TYP_INNER_MAKE  NUMBER  := 1;   --���O��敪�@����
    OUTSIDE_TYP_BUY         NUMBER  := 2;   --���O��敪�@�O��
    OPR_RSLT_TYP_ROUTING    NUMBER  := 2;   --��ƌn��ʎd�|-��ƌn��ʍ�Ǝ��ы敪(2:�菇�ԍ��P�ʂɎ��ю��W)
    ROUTING_EXPAND_NOEXPAND NUMBER  := 0;   --��ƌn��ʎd�|-�菇�W�J�ς݃t���O(0:���W�J)
    TAX_APPLY_TYP_M_ITEM    NUMBER  := 1;   --�����̏���œK�p�敪(1:�i�ڃ}�X�^�̏���ŃR�[�h)
    TAX_APPLY_TYP_M_VEND    NUMBER  := 2;   --�����̏���œK�p�敪(2:�����}�X�^�̏���ŃR�[�h)
    TAXABLE_TYP_OUT         NUMBER  := 1;   --����ŋ敪�̏���ŃR�[�h���P�� �ō��Ŕ����敪(1:�Ŕ���)
    ROUND_TYP_NORMAL        NUMBER  := 1;   --�����̔������z�ۂߋ敪(1:�l�̌ܓ�)
    ROUND_TYP_CUTUP         NUMBER  := 2;   --�����̔������z�ۂߋ敪(2:�؂�グ)
    ROUND_TYP_CUTDOWN       NUMBER  := 3;   --�����̔������z�ۂߋ敪(3:�؂�̂�)
    ROUND_COEFFICIENT       NUMBER  := 0.5; --�[�������W�� �l�̌ܓ�
    CUTUP_COEFFICIENT       NUMBER  := 0.9; --�[�������W�� �؏グ
    CUTDOWN_COEFFICIENT     NUMBER  := 0;   --�[�������W�� �؂�̂�

    CTRL_CD_DEFAULT                 VARCHAR2(24)     := 'SYSTEM';    --�R���g���[���n�e�[�u����PrimaryKey�̒l
    COMPANY_CD_DEFAULT              VARCHAR2(8)     := '00';        --��ЃR�[�h�̃f�t�H���g�l
    METHOD_START                    VARCHAR2(20)     := 'Start';     --���O�p���\�b�h�J�n�錾
    METHOD_END                      VARCHAR2(12)     := 'End';       --���O�p���\�b�h�I���錾
    MY_SQL_NAME                     VARCHAR2(80)    := 'SQLOPRINST';--�o�k�^�r�p�k��

    LOGMSG_START_PRGNAME_OPRINST    VARCHAR2(104)    := '(SBM0494)<< ��Ǝw���m�菈���J�n >>';
    LOGMSG_END_PRGNAME_OPRINST      VARCHAR2(104)    := '<< ��Ǝw���m�菈���I�� >>';

    --�G���[��
    APS_COM_BATCH_START             VARCHAR2(28)     := 'ZZ09001';   --�o�b�`�������J�n���܂���
    APS_COM_BATCH_END               VARCHAR2(28)     := 'ZZ09002';   --�o�b�`�������I�����܂���
    APS_NOTENTRY_VEND_CD            VARCHAR2(28)     := 'AD30037';   --�����R�[�h�������͂ł�
    APS_NOTENTRY_WS_CD              VARCHAR2(28)     := 'AD30041';   --��Ƌ�R�[�h�������͂ł�
    APS_NOTENTRY_M_WS_WS_CD         VARCHAR2(28)     := 'AD00011';   --�ŏ��̓���H���ɍ�Ƌ�R�[�h���ݒ肳��Ă��܂���
    APS_NOTENTRY_M_WS_PLANT_CD      VARCHAR2(28)     := 'AD00012';   --�ŏ��̓���H���Ɏw�肳��Ă����Ƌ���̍H��R�[�h����v���܂���
    APS_NOTENTRY_M_WS_WH_CD         VARCHAR2(28)     := 'AD00013';   --�ŏ��̓���H���Ɏw�肳��Ă����Ƌ���ɁA�ۊǋ�R�[�h���ݒ肳��Ă��܂���
    APS_NOTENTRY_M_WS_PLANT_CD2     VARCHAR2(28)     := 'AD00014';   --�ŏ��̓���H���̍�Ƌ�R�[�h�ɑΉ�����ۊǋ�̍H��R�[�h����v���܂���
    APS_NOTENTRY_M_WS_WH_CD2        VARCHAR2(28)     := 'AD00018';   --�ŏ��̓���H���̍�Ƌ�R�[�h�ɑΉ�����ۊǋ悪���݂��܂���
    APS_NOTENTRY_EXCH_TYP           VARCHAR2(28)     := 'AD00098';   --�ב֎�ʂ�2�̂��߁A�M�݋��z��0��ݒ肵�܂����B
    APS_NOTENTRY_EXCH_RATE          VARCHAR2(28)     := 'ZZ02024';   --�m�בփ��[�g�}�X�^�n�����݂��Ȃ�
    APS_NOTENTRY_WH_CD              VARCHAR2(28)     := 'AD00104';   --[�H��]."��\�[���ꏊ�R�[�h"�����݂��Ȃ�

    /* �������擾�J�[�\�� */
    CURSOR CurMVendCtrl(cvc2CompanyCd VARCHAR2,cvc2VendCd VARCHAR2) IS
    Select
    OWN_PERSON_NAME,   --���ВS���Җ�
    ROUND_TYP,         --�������z�ۂߋ敪
    TAX_CD,            --����ŃR�[�h
    TAX_APPLY_TYP,     --����œK�p�敪
    CUR_CD,            --����ʉ݃R�[�h
    EXCH_TYP           --�ב֎��
    From M_VEND_CTRL
    Where COMPANY_CD = cvc2CompanyCd
    And VEND_CD = cvc2VendCd;

    /* ���������擾�J�[�\�� */
    CURSOR CurDecimalFig(cvc2CurCd VARCHAR2) IS
    SELECT DECIMAL_FIG --��������
    FROM M_CUR
    WHERE CUR_CD = cvc2CurCd;

    /* �M�ݎ擾�J�[�\�� */
    CURSOR CurSysHomeCur IS
    Select
    HOME_CUR_CD        --�M�݃R�[�h
    From SYS_HOME_CUR
    Where CTRL_CD = CTRL_CD_DEFAULT;

    /* ��ƃR�[�h���݃`�F�b�N�J�[�\�� */
    CURSOR CurCount(vc2WsCd VARCHAR2) IS
    SELECT COUNT(*)
    FROM M_WS A
    WHERE vc2WsCd = A.WS_CD;

    /* ��ƃR�[�h���݃`�F�b�N�J�[�\�� */
    CURSOR CurWhCd(vc2WsCd VARCHAR2) IS
    SELECT A.WH_CD
    FROM M_WS A
    WHERE vc2WsCd = A.WS_CD;

    /* ��Ƌ�̍�ƃR�[�h�擾�J�[�\�� */
    CURSOR CurPlantCd(vc2WsCd VARCHAR2) IS
    SELECT PLANT_CD
    FROM M_WS A
    WHERE vc2WsCd = A.WS_CD;

    /* �ۊǋ�̕ۊǋ�R�[�h�擾�J�[�\�� */
    CURSOR CurM_Wh_WhCd(vc2WhCd VARCHAR2) IS
    SELECT COUNT(*)
    FROM M_WH A
    WHERE vc2WhCd = A.WH_CD;

    /* �ۊǋ�R�[�h�̑��݃`�F�b�N�J�[�\�� */
    CURSOR CurM_Wh_PlantCd(vc2M_WS_PlantCd VARCHAR2,vc2WhCd VARCHAR2) IS
    SELECT COUNT(*)
    FROM M_WH A
    WHERE vc2WhCd = A.WH_CD
    AND   vc2M_WS_PlantCd = A.PLANT_CD;

    /* �ۊǋ�R�[�h�����J�[�\�� */
    CURSOR CurM_Wh_PlantCd_Select(vc2WhCd VARCHAR2) IS
    SELECT PLANT_CD
    FROM M_WH A
    WHERE vc2WhCd = A.WH_CD ;

    /* ��Ǝw�����уJ�[�\�� */
    CURSOR CurWorkOdrCd(vc2WorkOdrCd VARCHAR2) IS
    Select NVL(A.PROC_NO,-1) AS PROC_NO,
           A.WS_CD
    From   T_WORK_IN_PROC_BY_PROC A
         , T_WORK_IN_PROC_BY_ITEM C
    Where  OPR_RSLT_TYP=2
    And    A.WORK_ODR_CD = C.WORK_ODR_CD
    And    A.WORK_ODR_CD = vc2WorkOdrCd
    And    A.OUTSIDE_TYP=1
    And    A.PROC_NO =(Select MIN(B.PROC_NO)
                       From   T_WORK_IN_PROC_BY_PROC B
                       Where  B.WORK_ODR_CD=vc2WorkOdrCd
                       And    B.OUTSIDE_TYP=1);

    /* �o�Ɏw�������J�[�\�� */
    --CURSOR CurT_ISSUE_INST(vc2WorkOdrCd VARCHAR2) IS
    --Select A.PROC_NO
    --From   T_WORK_IN_PROC_BY_PROC A
    --Where  A.PROC_NO = (Select MIN(B.PROC_NO)
                        --From T_WORK_IN_PROC_BY_PROC B
                        --Where B.WORK_ODR_CD=vc2WorkOdrCd);

    /* ��Ƌ�J�[�\�� */
    CURSOR CurWsCd(WsCd VARCHAR2) IS
    Select COUNT(*)
    From M_WS A
    Where WsCd = A.WS_CD;

    /* ��Ƌ�.�H��R�[�h�J�[�\�� */
    CURSOR CurWsCdPlantCd(PlantCd VARCHAR2) IS
    Select COUNT(*)
    From M_WS A
    Where PlantCd = A.PLANT_CD;

    /* �ۊǋ�.�ۊǃR�[�h�̑��݃`�F�b�N�J�[�\�� */
    CURSOR CurMWhWhCd(WhCd VARCHAR2) IS
    Select COUNT(*)
    From M_WH A
    Where WhCd = A.WH_CD;

    /* ��ƌn��ʎd�|�擾�J�[�\�� */
    CURSOR CurT_WORK_IN_PROC_BY_PROC(cvc2WorkOdrCd VARCHAR2,cvc2WorkInProcCd VARCHAR2) IS
    SELECT
    T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD,         --��ƌv��ԍ�
    T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD,     --�d�|��ƃR�[�h
    T_WORK_IN_PROC_BY_PROC.OD_NO,               --
    T_WORK_IN_PROC_BY_PROC.ITEM_CD,             --�i�ڔԍ�
    T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,         --�d�|���O��敪(OutsideTyp)
    T_WORK_IN_PROC_BY_PROC.WS_CD,               --��Ƌ�R�[�h(WsCd)
    T_WORK_IN_PROC_BY_PROC.COMPANY_CD,          --��ЃR�[�h
    T_WORK_IN_PROC_BY_PROC.VEND_CD,             --�����R�[�h(VendCd)
    T_WORK_IN_PROC_BY_PROC.PLANT_CD,            --�H��R�[�h
    T_WORK_IN_PROC_BY_PROC.WORK_ODR_DLV_DATE,   --��ƌn��ʐ����[��(WorkOdrDlvDate)
    T_WORK_IN_PROC_BY_PROC.OPR_INST_START_DATE, --��ƌn��ʒ����
    T_WORK_IN_PROC_BY_PROC.OPR_INST_QTY,        --��Ǝw����
    T_WORK_IN_PROC_BY_PROC.UNIT_COST_TYP,       --�P���敪
    T_WORK_IN_PROC_BY_PROC.UNIT_COST,           --�P��
    T_WORK_IN_PROC_BY_PROC.PROCESSING_COST,     --���H��
    T_WORK_IN_PROC_BY_PROC.MATERIAL_COST,       --�ޗ���
    T_WORK_IN_PROC_BY_PROC.OTHER_OVERHEADS,     --���̑��̌o��
    T_WORK_IN_PROC_BY_PROC.PUCH_ODR_AMOUNT,     --�������z(PuchOdrAmount)
    T_WORK_IN_PROC_BY_PROC.DISC_AMOUNT,         --�l�����z(DiscAmount)
    T_WORK_IN_PROC_BY_PROC.ACPT_INSPC_TYP,      --��ƌn���������敪
    T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP,        --��ƌn��ʍ�Ə�ԋ敪(WorkStsTyp)
    T_WORK_IN_PROC_BY_PROC.OPR_INST_DATE,       --��ƌn��ʍ�Ǝw����
    T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_COMMENT --
    FROM T_WORK_IN_PROC_BY_PROC
    WHERE T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD     = cvc2WorkOdrCd
    AND   T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = cvc2WorkInProcCd
    ORDER BY T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD ASC;

    /* �i�ڏ��擾�J�[�\�� */
    CURSOR CurMItem(cvc2ItemCd VARCHAR2) IS
    Select
    SPL_ITEM_TYP,TAX_CD
    From M_ITEM
    Where ITEM_CD = cvc2ItemCd;

    /* ����ŋ敪�}�X�^�擾�J�[�\�� */
    CURSOR CurMTax(cvc2TaxCd VARCHAR2) IS
    Select
    OLD_TAX_RATE_1,
    OLD_TAX_RATE_2,
    OLD_TAX_RATE_3,
    NEW_TAX_RATE_START_DATE,
    NEW_TAX_RATE_1,
    NEW_TAX_RATE_2,
    NEW_TAX_RATE_3,
    ROUND_TYP
    From M_TAX
    Where TAX_CD = cvc2TaxCd;

    /* �i�ڕʎd�|�擾�J�[�\�� */
    CURSOR CurTWorkInProcByItem(cvc2WorkOdrCd VARCHAR2) IS
    Select
    WORK_ODR_DLV_DATE
    From T_WORK_IN_PROC_BY_ITEM
    Where WORK_ODR_CD = cvc2WorkOdrCd;

    /* �ϐ��̐錾 */

    UTL_FileHandle              UTL_FILE.FILE_TYPE; --�t�@�C���n���h��

    intOprInstCursorName        INTEGER;        --���v�ʗp�J�[�\���h�c
    vc2Sql                      VARCHAR2(4096); --���I�r�p�k�p
    vc2WorkOdrCd                VARCHAR2(100);   --��ƌv��ԍ�
    vc2OdNo                     VARCHAR2(100);   --�I�[�_�f�}���h�ԍ�
    numOprInstQty               NUMBER(18,4);   --��Ǝw����
    vc2ItemCd                   VARCHAR2(100);
    vc2WsCd                     VARCHAR2(100);
    dtmOprInstStartDate         DATE;
    numOprRsltTyp               NUMBER(2);
    numWorkStsTyp               NUMBER(2);
    numProcExplosionFlg         NUMBER(2);

    numWorkProcItemOprRsltTyp   NUMBER(2);
    numOutsideTyp               NUMBER(2);
    vc2VendCd                   VARCHAR2(100);
    numProcNo                   NUMBER(6,0);
    vc2PlantCd                  VARCHAR2(8);
    WsCdcount                   NUMBER(2);
    MWsPc                       VARCHAR2(8);
    WhCd                        VARCHAR2(100);
    WhCdCount                   NUMBER(2);
    PlantCd                     VARCHAR2(8);
    ProcNo                      NUMBER(6,0);
    WsCd                        VARCHAR2(100);
    countPlantCd                NUMBER(2);
    countWhCd                   NUMBER(2);
    vc2WorkInProcCd             VARCHAR2(100);
    M_WS_PlantCd                VARCHAR2(8);
    M_WS_WhCd                   VARCHAR2(100);
    M_WH_WhCd                   VARCHAR2(100);
    M_WH_PlantCd                VARCHAR2(8);
    M_WH_PlantCd_Select         VARCHAR2(8);
    vc2OprInstStartDate         VARCHAR2(40);
    vc2WorkOdrDlvDate           VARCHAR2(40);
    vc2JobOdrCd                 VARCHAR2(100);
    vc2OprRsltTyp               VARCHAR2(16);
    vc2OutSideTyp               VARCHAR2(16);
    vc2OutSideTyp2              VARCHAR2(16);
    vc2WorkOdrCdMaintenance     VARCHAR2(100);   --��ƌv��ԍ�
    vc2PuchOdrCd                VARCHAR2(100);   --�����ԍ��擾�l
    dtmBusinessOprDate          DATE;

    rtpSysHomeCur               CurSysHomeCur%ROWTYPE;
    rtpDecimalFig               CurDecimalFig%ROWTYPE;
    rtpMVendCtrl                CurMVendCtrl%ROWTYPE;
    rtpTWorkInProcByProc        CurT_WORK_IN_PROC_BY_PROC%ROWTYPE;
    rtpMItem                    CurMItem%ROWTYPE;
    rtpMTax                     CurMTax%ROWTYPE;
    rtpWorkInProcByItem         CurTWorkInProcByItem%ROWTYPE;

    blnPBPEFLG                  BOOLEAN;
    numTransactionCount         NUMBER(10);     --��������
    vc2Comment                  VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment            VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2PuchOdrPerson            VARCHAR2(160);   --�����S����
    numRoundTyp                 NUMBER(2);      --�Œ[���敪
    numSplItemTyp               NUMBER(2);      --�󋋕i�敪
    numNetAmount                NUMBER(18,4);   --�{�̋��z
    dtmJudgeDate                DATE;           --�����
    vc2TaxCd                    VARCHAR2(100);   --�ŃR�[�h
    vc2ItemTaxCd                VARCHAR2(100);   --�ŃR�[�h(�i�ڃ}�X�^)
    vc2VendTaxCd                VARCHAR2(100);   --�ŃR�[�h(�����}�X�^)
    numTaxRate1                 NUMBER(18,4);   --�ŗ��P
    numTaxRate2                 NUMBER(18,4);   --�ŗ��Q
    numTaxRate3                 NUMBER(18,4);   --�ŗ��R
    numTaxRoundTyp              NUMBER(2);      --�Œ[���敪
    numTaxAmount1               NUMBER(18,4);   --�Ŋz�P
    numTaxAmount2               NUMBER(18,4);   --�Ŋz�Q
    numTaxAmount3               NUMBER(18,4);   --�Ŋz�R
    numHomeCurAmount            NUMBER(18,4);   --�M�݋��z
    numAmountincludeTax         NUMBER(18,4);   --�ō����z
    numTaxApplyTyp              NUMBER(2);      --����œK�p�敪
    vc2CurCd                    VARCHAR2(100);   --�ʉ݃R�[�h
    numExchTyp                  NUMBER(2);      --�ב֎��
    numDecimalFig               NUMBER(2);      --��������(DecimalFig)
    numWkDecimal                NUMBER(12);     --�������W��
    numWkRound                  NUMBER(2,1);    --�������W��
    vc2HomeCurCd                VARCHAR2(100);   --�M�݃R�[�h
    numExchRate                 NUMBER(20,6);   --�בփ��[�g
    vc2MPlantWhCd               VARCHAR2(100);   --�H��D��\�[���ꏊ�R�[�h
    blnRet                      BOOLEAN;
    intRet                      INTEGER;

    /* �M�݊��Z���i�p�����[�^ */
    pvc2CompanyCd               VARCHAR2(100) := Null;   --��ЃR�[�h
    vc2VEND_CD                  VARCHAR2(100) := Null;   --�����R�[�h
    numAMOUNT_INCLUDE_TAX       NUMBER(18,4) := 0;      --�ō����z
    pdtmRateJudgeDate           DATE         := Null;   --���[�g�����
    pvc2ExchReserveCd           VARCHAR2(100) := Null;   --�ב֗\��R�[�h
    pnumConvertTyp              NUMBER(02)   := 0;      --�ϊ�����(�O�݁��M��)
    pnumAfterAmount             NUMBER(18,4) := 0;      --�ϊ�����z
    pnumRoundTyp                NUMBER(02)   := 0;      --�[�������敪
    pnumExchRate                NUMBER(20,6) := 0;      --�בփ��[�g
    pnumExchTyp                 NUMBER(02)   := 0;      --�ב֎��
    pvc2VendCurCd               VARCHAR2(100) := NULL;   --�����ʉ݃R�[�h
    pvc2VendCurName             VARCHAR2(160) := NULL;   --�����ʉݖ�
    pvc2VendCurSymbol           VARCHAR2(100) := NULL;   --�����ʉ݋L��
    pvc2VendCurUnit             VARCHAR2(100) := NULL;   --�����ʉݒP��
    pnumVendDecimalFig          NUMBER(02)   := 0;      --����揬������
    pvc2HomeCurCd               VARCHAR2(100) := NULL;   --���Ёi�M�݁j�ʉ݃R�[�h
    pvc2HomeCurName             VARCHAR2(160) := NULL;   --���Ёi�M�݁j�ʉݖ�
    pvc2HomeCurSymbol           VARCHAR2(100) := NULL;   --���Ёi�M�݁j�ʉ݋L��
    pvc2HomeCurUnit             VARCHAR2(100) := NULL;   --���Ёi�M�݁j�ʉݒP��
    pnumHomeDecimalFig          NUMBER(02)   := 0;      --���Ёi�M�݁j��������
    pvc2ErrorCd                 VARCHAR2(28) := NULL;   --�G���[�R�[�h

    excERR_GET_BUSINESS_DATE        EXCEPTION;
    excNOTEXIST_PROC_BY_PROC        EXCEPTION;
    excNOTEXIST_PROC_BY_ROUTING     EXCEPTION;
    excERR_GET_NEW_PUCH_CD          EXCEPTION;
    excERR_M_VEND                   EXCEPTION;
    excERR_M_ITEM                   EXCEPTION;
    excGETROUND_ERR                 EXCEPTION;
    excISSUE_ERR                    EXCEPTION;
    excERR_T_WORK_IN_PROC_BY_ITEM   EXCEPTION;
    excERR_DEFAULT_RCV_WH           EXCEPTION;


--<���C������ >-----------------------------------------------------

BEGIN

    /* LogFile �� OPEN */
    blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /*�g���[�X���O�istart�j*/
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

    /* �J�n���b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                        pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START, LOGMSG_START_PRGNAME_OPRINST);

    COMMIT;

    /* �Ɩ����t�擾 */
    blnRet := FNCGETBUSINESSDATE(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd, dtmBusinessOprDate);

    /* ��������w�肳��Ă���ꍇ */
    IF pvc2OprInstStartDate = 'null' THEN
        vc2OprInstStartDate := '';
    ELSE
        vc2OprInstStartDate := pvc2OprInstStartDate;
    END IF;

    /* �[�����w�肳��Ă���ꍇ */
    IF pvc2WorkOdrDlvDate = 'null' THEN
        vc2WorkOdrDlvDate := '';
    ELSE
        vc2WorkOdrDlvDate := pvc2WorkOdrDlvDate;
    END IF;

    /* �u���ԁv���w�肳��Ă���ꍇ */
    IF pvc2JobOdrCd = 'null' THEN
        vc2JobOdrCd := '';
    ELSE
        vc2JobOdrCd := pvc2JobOdrCd;
    END IF;

    /* �i�ڔԍ����w�肳��Ă���ꍇ */
    IF pvc2ItemCd = 'null' THEN
        vc2ItemCd := '';
    ELSE
        vc2ItemCd := pvc2ItemCd;
    END IF;

    /* ��Ƌ�R�[�h���w�肳��Ă���ꍇ */
    IF pvc2WsCd = 'null' THEN
        vc2WsCd := '';
    ELSE
        vc2WsCd := pvc2WsCd;
    END IF;

    /* ��Ǝ��ы敪���w�肳��Ȃ������ꍇ */
    IF pvc2OprRsltTyp = 'null' THEN
        vc2OprRsltTyp := '';
    ELSE
        vc2OprRsltTyp := pvc2OprRsltTyp;
    END IF;

    /* ��Ǝw���v��i����j���w�肳��Ȃ������ꍇ */
    IF pvc2OutSideTyp = 'null' THEN
        vc2OutSideTyp := '';
    ELSE
        vc2OutSideTyp := pvc2OutSideTyp;
    END IF;

    /* ��Ǝw���v��i�O�삪�w�肳��Ȃ������ꍇ */
    IF pvc2OutSideTyp2 = 'null' THEN
        vc2OutSideTyp2 := '';
    ELSE
        vc2OutSideTyp2 := pvc2OutSideTyp2;
    END IF;

    /* �����R�[�h���w�肳��Ȃ������ꍇ */
    IF pvc2VendCd = 'null' THEN
        vc2VendCd := '';
    ELSE
        vc2VendCd := pvc2VendCd;
    END IF;

    IF blnRet = FALSE THEN
        --�Ɩ����t�擾�G���[
        RAISE excERR_GET_BUSINESS_DATE;
    END IF;

    /* �u���������v�̏����� */
    numTransactionCount := 0;

    /* ���o�����ɂ�蓮�I�r�p�k���� */
    intOprInstCursorName := DBMS_SQL.OPEN_CURSOR;
    vc2Sql := 'SELECT V_WORK_ODR_LST.WORK_ODR_CD ';             --��ƌv��ԍ�
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.WS_CD';                --��Ƌ�R�[�h
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OPR_RSLT_TYP';         --�i�ڕʍ�Ǝ��ы敪
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.WORK_STS_TYP';         --�i�ڕʍ�Ə�ԋ敪
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OD_NO';                --�I�[�_�f�}���h�ԍ�
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OPR_INST_QTY';         --��Ǝw����
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OPR_INST_START_DATE';  --�����
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.OUTSIDE_TYP';          --�d�|���O��敪
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.VEND_CD';              --�����R�[�h
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.PROC_NO';              --�d�|��ƌn��ԍ�
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.PLANT_CD';             --�H��R�[�h
    vc2Sql := vc2Sql || ',V_WORK_ODR_LST.WORK_IN_PROC_CD';      --�d�|��ƃR�[�h
    vc2Sql := vc2Sql || ' FROM V_WORK_ODR_LST';
    vc2Sql := vc2Sql || ' WHERE ';
    vc2Sql := vc2Sql || ' V_WORK_ODR_LST.PLANT_CD = ''' || pvc2PlantCd || '''';

    /* ��������w�肳��Ă���ꍇ */
    IF vc2OprInstStartDate IS NOT NULL THEN
        --Jf:��ʂ���PARAMETER��FORMAT YYYY/MM/DD
        --���́AJ�̎��ԊǗ�=false�̏ꍇ�A��ʂ���PARAMETER��FORMAT�@YYYY/MM/DD
        IF LENGTH(vc2OprInstStartDate) <= 10 THEN
            vc2Sql := vc2Sql || 'AND V_WORK_ODR_LST.OPR_INST_START_DATE <=
                      TO_DATE(''' || pvc2OprInstStartDate || ' 23:59:59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
        --J�̎��ԊǗ�=true�̏ꍇ�A��ʂ���PARAMETER��FORMAT�@YYYY/MM/DDHH24:MI
        ELSE
            vc2Sql := vc2Sql || 'AND V_WORK_ODR_LST.OPR_INST_START_DATE <=
                      TO_DATE(''' || pvc2OprInstStartDate || ':59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
        END IF;
    END IF;
    /* �[�����w�肳��Ă���ꍇ */
    IF vc2WorkOdrDlvDate IS NOT NULL THEN
        --Jf:��ʂ���PARAMETER��FORMAT YYYY/MM/DD
        --���́AJ�̎��ԊǗ�=false�̏ꍇ�A��ʂ���PARAMETER��FORMAT�@YYYY/MM/DD
        IF LENGTH(vc2WorkOdrDlvDate) <=10 THEN
            vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.WORK_ODR_DLV_DATE <=
                      TO_DATE(''' || pvc2WorkOdrDlvDate || ' 23:59:59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
        --J�̎��ԊǗ�=true�̏ꍇ�A��ʂ���PARAMETER��FORMAT�@YYYY/MM/DDHH24:MI
        ELSE
            vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.WORK_ODR_DLV_DATE <=
                      TO_DATE(''' || pvc2WorkOdrDlvDate || ':59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
        END IF;
    END IF;
    /* �u���ԁv���w�肳��Ă���ꍇ */
    IF vc2JobOdrCd IS NOT NULL THEN
        vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.JOB_ODR_CD LIKE ''' || pvc2JobOdrCd || '''';

    END IF;
    /* �i�ڔԍ����w�肳��Ă���ꍇ */
    IF vc2ItemCd IS NOT NULL THEN
        vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.ITEM_CD = ''' || pvc2ItemCd || '''';
    END IF;

    IF vc2OprRsltTyp IS NULL
    AND vc2OutSideTyp IS NULL
    AND vc2OutSideTyp2 IS NULL THEN
        vc2Sql := vc2Sql || ' AND ( V_WORK_ODR_LST.OPR_RSLT_TYP != 1 ) ';
        vc2Sql := vc2Sql || ' AND ( V_WORK_ODR_LST.OPR_RSLT_TYP != 2 ) ';
    ELSE
        vc2Sql := vc2Sql || ' AND ( ';

        /* �o�������э�ƌv�悪�w�肳�ꂽ�ꍇ */
        IF vc2OprRsltTyp IS NOT NULL THEN
            vc2Sql := vc2Sql || ' ( V_WORK_ODR_LST.OPR_RSLT_TYP = 1 ';
            /* ��Ƌ�R�[�h���w�肳��Ă���ꍇ */
            IF vc2WsCd IS NOT NULL THEN
                vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.WS_CD = ''' || pvc2WsCd || '''';
            END IF;
            vc2Sql := vc2Sql || ' ) ';
        END IF;

        IF vc2OprRsltTyp IS NOT NULL
        AND vc2OutSideTyp IS NOT NULL THEN
            vc2Sql := vc2Sql || ' OR ';
        END IF;

        /* ��Ǝw���v��i����j���w�肳�ꂽ�ꍇ */
        IF vc2OutSideTyp IS NOT NULL THEN
            vc2Sql := vc2Sql || ' ( V_WORK_ODR_LST.OUTSIDE_TYP = 1 ';
            vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.OPR_RSLT_TYP = 2 ';
            /* ��Ƌ�R�[�h���w�肳��Ă���ꍇ */
            IF vc2WsCd IS NOT NULL THEN
                vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.WS_CD = ''' || pvc2WsCd || '''';
            END IF;
            vc2Sql := vc2Sql || ' ) ';
        END IF;

        IF vc2OutSideTyp2 IS NOT NULL
        AND ( vc2OprRsltTyp IS NOT NULL
              OR ( vc2OprRsltTyp IS NULL AND vc2OutSideTyp IS NOT NULL ) ) THEN
            vc2Sql := vc2Sql || ' OR ';
        END IF;

        /* ��Ǝw���v��i�O��j���w�肳�ꂽ�ꍇ */
        IF vc2OutSideTyp2 IS NOT NULL THEN
            vc2Sql := vc2Sql || ' ( V_WORK_ODR_LST.OUTSIDE_TYP = 2 ';
            vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.OPR_RSLT_TYP = 2 ';
            /* �����R�[�h���w�肳�ꂽ�ꍇ */
            IF vc2VendCd IS NOT NULL THEN
                vc2Sql := vc2Sql || ' AND V_WORK_ODR_LST.VEND_CD = ''' || pvc2VendCd || '''';
            END IF;
            vc2Sql := vc2Sql || ' ) ';
        END IF;

        vc2Sql := vc2Sql || ' ) ';
    END IF;

    vc2Sql := vc2Sql || ' order by V_WORK_ODR_LST.WORK_ODR_CD, V_WORK_ODR_LST.PROC_NO';


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


    /* �r�p�k����� */
    DBMS_SQL.PARSE(intOprInstCursorName,vc2Sql,DBMS_SQL.NATIVE);

    /* ���` */
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,1,vc2WorkOdrCd,100);           --��ƌv��ԍ�
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,2,vc2WsCd,100);                --��Ƌ�R�[�h
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,3,numWorkProcItemOprRsltTyp); --�i�ڕʍ�Ǝ��ы敪
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,4,numWorkStsTyp);             --��ƌn��ʍ�Ə�ԋ敪
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,5,vc2OdNo,100);                --�I�[�_�f�}���h�ԍ�
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,6,numOprInstQty);             --��Ǝw����
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,7,dtmOprInstStartDate);       --��ƌn��ʒ����
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,8,numOutsideTyp);             --���O��敪
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,9,vc2VendCd,100);              --�����R�[�h
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,10,numProcNo);                --�d�|��ƌn��ԍ�
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,11,vc2PlantCd,8);             --�H��R�[�h
    DBMS_SQL.DEFINE_COLUMN(intOprInstCursorName,12,vc2WorkInProcCd,100);       --�d�|��ƃR�[�h

    /* �J�[�\�����s */
    intRet := DBMS_SQL.EXECUTE(intOprInstCursorName);

    --��ƌv��ԍ����ꎞ�ێ�����
    vc2WorkOdrCdMaintenance := '0';

    /* �s�t�F�b�` */
    LOOP

        IF DBMS_SQL.FETCH_ROWS(intOprInstCursorName) > 0 THEN

            /* ���` */
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,1,vc2WorkOdrCd);              --��ƌv��ԍ�
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,2,vc2WsCd);                   --��Ƌ�R�[�h
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,3,numWorkProcItemOprRsltTyp); --��Ǝ��ы敪
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,4,numWorkStsTyp);             --��Ə�ԋ敪
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,5,vc2OdNo);                   --�I�[�_�f�}���h�ԍ�
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,6,numOprInstQty);             --��Ǝw����
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,7,dtmOprInstStartDate);       --�����
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,8,numOutsideTyp);             --�d�|���O��敪
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,9,vc2VendCd);                 --�����R�[�h
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,10,numProcNo);                --�d�|��ƌn��ԍ�
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,11,vc2PlantCd);               --�H��R�[�h
            DBMS_SQL.COLUMN_VALUE(intOprInstCursorName,12,vc2WorkInProcCd);          --�d�|��ƃR�[�h

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
            AND vc2WsCd IS NULL THEN
            -- �`�F�b�N1 ��ƌv��ꗗ�̍�Ǝ��ы敪 = 1(�o����)
            --           ��ƌv��ꗗ�̍�Ƌ�R�[�h = ""(Null)

                -- ���b�Z�[�W���O�o��
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_WS_CD, '(SBM0496)��ƌv��ԍ�[' || vc2WorkOdrCd || ']');
                GOTO EXE_END;
            END IF;

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_ITEM)
            AND numOutsideTyp IN (OUTSIDE_TYP_INNER_MAKE)
            AND vc2WsCd IS NULL THEN
            --�`�F�b�N�Q ��ƌv��ꗗ�̍�Ǝ��ы敪 = 2(��Ǝw������)
            --           ��ƌv��ꗗ�̎d�|���O��敪 = 1�i����j
            --           ��ƌv��ꗗ�̍�Ƌ�R�[�h = ""(Null)

                -- ���b�Z�[�W���O�o��
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_WS_CD,'(SBM0557)��ƌv��ԍ�[' || vc2WorkOdrCd || ']�d�|��ƃR�[�h[' || vc2WorkInProcCd || ']');
                GOTO EXE_END;
            END IF;

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_ITEM)
            AND numOutsideTyp IN (OUTSIDE_TYP_BUY)
            AND vc2VendCd IS NULL THEN
            --�`�F�b�N�R ��ƌv��ꗗ�̍�Ǝ��ы敪 = 2(��Ǝw������)
            --           ��ƌv��ꗗ�̎d�|���O��敪 = 2�i�O��j
            --           ��ƌv��ꗗ�̎����R�[�h = ""(Null)

                -- ���b�Z�[�W���O�o��
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                    APS_NOTENTRY_VEND_CD, '(SBM0557)��ƌv��ԍ�[' || vc2WorkOdrCd || ']�d�|��ƃR�[�h[' || vc2WorkInProcCd || ']');
                GOTO EXE_END;
            END IF;

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER) THEN
            -- ��ƌv��ꗗ�̍�Ǝ��ы敪 = 1(�o����)

                OPEN  CurCount(vc2WsCd);
                FETCH CurCount INTO WsCdcount ;
                CLOSE CurCount ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount <= 0 THEN
                -- �`�F�b�N�S��ƌv��ꗗ�̍�Ǝ��ы敪 = 1(�o����)
                --           ��ƌv��ꗗ�̍�Ƌ�R�[�h <> ""(Null)
                --           [��ƌv��ꗗ].��Ƌ�R�[�h����Ƌ�ɑ��݂��Ȃ�

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WS_CD, '(SBM0496)��ƌv��ԍ�[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                 END IF;

                OPEN  CurPlantCd(vc2WsCd);
                FETCH CurPlantCd INTO M_WS_PlantCd ;
                CLOSE CurPlantCd ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd <> M_WS_PlantCd THEN
                -- �`�F�b�N�T��ƌv��ꗗ�̍�Ǝ��ы敪 = 1(�o����)
                --           ��ƌv��ꗗ�̍�Ƌ�R�[�h <> ""(Null)
                --           [��ƌv��ꗗ].��Ƌ�R�[�h����Ƌ�ɑ��݂���
                --           [��ƌv��ꗗ].�H��R�[�h <> [��Ƌ�].�H��R�[�h

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_PLANT_CD, '(SBM0496)��ƌv��ԍ�[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurWhCd(vc2WsCd);
                FETCH CurWhCd INTO M_WS_WhCd ;
                CLOSE CurWhCd ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd IN (M_WS_PlantCd)
                AND M_WS_WhCd IS NULL THEN
                -- �`�F�b�U��ƌv��ꗗ�̍�Ǝ��ы敪 = 1(�o������)
                --           ��ƌv��ꗗ�̍�Ƌ�R�[�h <> ""(Null)
                --           [��ƌv��ꗗ].��Ƌ�R�[�h����Ƌ�ɑ��݂���
                --           [��ƌv��ꗗ].�H��R�[�h = [��Ƌ�].�H��R�[�h
                --           [��Ƌ�].�ۊǋ�R�[�h = NULL

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                         APS_NOTENTRY_M_WS_WH_CD, '(SBM0496)��ƌv��ԍ�[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurM_Wh_WhCd(M_WS_WhCd);
                FETCH CurM_Wh_WhCd INTO M_WH_WhCd ;
                CLOSE CurM_Wh_WhCd ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd IN (M_WS_PlantCd)
                AND M_WS_WhCd IS NOT NULL
                AND MWsPc <> PlantCd THEN
                -- �`�F�b�N�V��ƌv��ꗗ�̍�Ǝ��ы敪 = 1(�o����)
                --           ��ƌv��ꗗ�̍�Ƌ�R�[�h <> ""(Null)
                --           [��ƌv��ꗗ].��Ƌ�R�[�h����Ƌ�ɑ��݂���
                --           [��ƌv��ꗗ].�H��R�[�h = [��Ƌ�].�H��R�[�h
                --           [��Ƌ�].�ۊǋ�R�[�h <> NULL
                --           �ۊǋ�R�[�h��[�ۊǋ�]�ɑ��݂��Ȃ�
                --           [��Ƌ�].�H��R�[�h <> [�ۊǋ�].�H��R�[�h

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WH_CD2, '(SBM0496)��ƌv��ԍ�[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurM_Wh_PlantCd(M_WS_PlantCd,M_WS_WhCd);
                FETCH CurM_Wh_PlantCd INTO M_WH_PlantCd ;
                CLOSE CurM_Wh_PlantCd ;

                IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
                AND vc2WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd IN (M_WS_PlantCd)
                AND M_WS_WhCd IS NOT NULL
                AND M_WH_PlantCd <= 0 THEN
                -- �`�F�b�N�W��ƌv��ꗗ�̍�Ǝ��ы敪 = 1(�o����)
                --           ��ƌv��ꗗ�̍�Ƌ�R�[�h <> ""(Null)
                --           [��ƌv��ꗗ].��Ƌ�R�[�h����Ƌ�ɑ��݂���
                --           [��ƌv��ꗗ].�H��R�[�h = [��Ƌ�].�H��R�[�h
                --           [��Ƌ�].�ۊǋ�R�[�h <> NULL
                --           �ۊǋ�R�[�h��[�ۊǋ�]�ɑ��݂��Ȃ�

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_PLANT_CD2, '(SBM0496)��ƌv��ԍ�[' || vc2WorkOdrCd || ']');
                    GOTO EXE_END;
                END IF;
            END IF;

            ProcNo := NULL;     --�O��f�[�^���N���A����B

            OPEN  CurWorkOdrCd(vc2WorkOdrCd) ;
            FETCH CurWorkOdrCd INTO ProcNo,WsCd ;
            CLOSE CurWorkOdrCd ;

            IF ProcNo IN (numProcNo) THEN
            -- ��Ǝw�����т̌v��f�[�^�ŁA�����ƌv��ԍ����ōŏ��̓���H���̏ꍇ
            -- �@        [��ƌv��ꗗ].��Ǝ��ы敪 = �Q(��Ǝw������)
            --           [��ƌv��ꗗ].�d�|��ƌn��ԍ����ŏ�
            --           [��ƌv��ꗗ].�d�|���O��敪 = �P�i����j

                OPEN CurWsCd(WsCd) ;
                FETCH CurWsCd INTO WsCdcount ;
                CLOSE CurWsCd ;

                IF WsCd IS NOT NULL
                AND WsCdcount <= 0 THEN
                -- �`�F�b�N�X�@��Ǝw�����т̌v��f�[�^�ŁA�����ƌv��ԍ����ōŏ��̓���H���̏ꍇ
                -- �@�@�@�@�@�@[��ƌv��ꗗ].��Ƌ�R�[�h <> NULL
                --           �@[��ƌv��ꗗ].��Ƌ�R�[�h���A[��Ƌ�]�ɑ��݂��Ȃ��ꍇ

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WS_CD, '(SBM0557)��ƌv��ԍ�[' || vc2WorkOdrCd || ']�d�|��ƃR�[�h[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurPlantCd(vc2WsCd);
                FETCH CurPlantCd INTO M_WS_PlantCd ;
                CLOSE CurPlantCd ;

                IF WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd <> M_WS_PlantCd THEN

                -- �`�F�b�N�P�O��Ǝw�����т̌v��f�[�^�ŁA�����ƌv��ԍ����ōŏ��̓���H���̏ꍇ
                --             [��ƌv��ꗗ].��Ƌ�R�[�h <> NULL
                --�@�@�@�@�@�@ [��ƌv��ꗗ].��Ƌ�R�[�h���A[��Ƌ�]�ɑ��݂���ꍇ
                --             [��ƌv��ꗗ].�H��R�[�h<>[��Ƌ�].�H��R�[�h

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_PLANT_CD, '(SBM0557)��ƌv��ԍ�[' || vc2WorkOdrCd || ']�d�|��ƃR�[�h[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurWhCd(vc2WsCd);
                FETCH CurWhCd INTO M_WS_WhCd ;
                CLOSE CurWhCd ;

                IF WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd = M_WS_PlantCd
                AND M_WS_WhCd IS NULL THEN
                -- �`�F�b�N�P�P��Ǝw�����т̌v��f�[�^�ŁA�����ƌv��ԍ����ōŏ��̓���H���̏ꍇ
                --             [��ƌv��ꗗ].��Ƌ�R�[�h <> NULL
                --�@�@�@�@�@�@ [��ƌv��ꗗ].��Ƌ�R�[�h���A[��Ƌ�]�ɑ��݂���ꍇ
                --             [��ƌv��ꗗ].�H��R�[�h=[��Ƌ�].�H��R�[�h
                --             [��Ƌ�].�ۊǋ�R�[�h=NULL

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WH_CD, '(SBM0557)��ƌv��ԍ�[' || vc2WorkOdrCd || ']�d�|��ƃR�[�h[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN CurMWhWhCd(M_WS_WhCd) ;
                FETCH CurMWhWhCd INTO countWhCd ;
                CLOSE CurMWhWhCd;

                IF WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd = M_WS_PlantCd
                AND M_WS_WhCd IS NOT NULL
                AND countWhCd <= 0 THEN
                -- �`�F�b�N�P�Q��Ǝw�����т̌v��f�[�^�ŁA�����ƌv��ԍ����ōŏ��̓���H���̏ꍇ
                --             [��ƌv��ꗗ].��Ƌ�R�[�h <> NULL
                --�@�@�@�@�@�@ [��ƌv��ꗗ].��Ƌ�R�[�h���A[��Ƌ�]�ɑ��݂���ꍇ
                --             [��ƌv��ꗗ].�H��R�[�h=[��Ƌ�].�H��R�[�h
                --             [��Ƌ�].�ۊǋ�R�[�h<>NULL
                --             �ۊǋ�R�[�h��[�ۊǋ�]�ɑ��݂��Ȃ��ꍇ


                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_WH_CD2, '(SBM0557)��ƌv��ԍ�[' || vc2WorkOdrCd || ']�d�|��ƃR�[�h[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;

                OPEN  CurM_Wh_PlantCd_Select(M_WS_WhCd);
                FETCH CurM_Wh_PlantCd_Select INTO M_WH_PlantCd_Select ;
                CLOSE CurM_Wh_PlantCd_Select ;

                IF WsCd IS NOT NULL
                AND WsCdcount > 0
                AND vc2PlantCd = M_WS_PlantCd
                AND M_WS_WhCd IS NOT NULL
                AND countWhCd > 0
                AND M_WH_PlantCd_Select <> M_WS_PlantCd THEN
                -- �`�F�b�N�P�R��Ǝw�����т̌v��f�[�^�ŁA�����ƌv��ԍ����ōŏ��̓���H���̏ꍇ
                --             [��ƌv��ꗗ].��Ƌ�R�[�h <> NULL
                --�@�@�@�@�@�@ [��ƌv��ꗗ].��Ƌ�R�[�h���A[��Ƌ�]�ɑ��݂���ꍇ
                --             [��ƌv��ꗗ].�H��R�[�h=[��Ƌ�].�H��R�[�h
                --             [��Ƌ�].�ۊǋ�R�[�h<>NULL
                --             �ۊǋ�R�[�h��[�ۊǋ�]�ɑ��݂���ꍇ
                --             [��Ƌ�].�H��R�[�h<>[�ۊǋ�].�H��R�[�h

                    -- ���b�Z�[�W���O�o��
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                        APS_NOTENTRY_M_WS_PLANT_CD2, '(SBM0557)��ƌv��ԍ�[' || vc2WorkOdrCd || ']�d�|��ƃR�[�h[' || vc2WorkInProcCd || ']');
                    GOTO EXE_END;
                END IF;
            END IF;


            IF  vc2WorkOdrCd != vc2WorkOdrCdMaintenance
            AND numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER,OPR_RSLT_TYP_ITEM) THEN
            --��ƌv��ꗗ-��Ǝ��ы敪(1:�o�����A2:��Ǝw��)

                --�i�ڎ~�܂�
                --�i�ڕʎd�|�A�b�v�f�[�g
                UPDATE T_WORK_IN_PROC_BY_ITEM
                SET WORK_STS_TYP = WORK_STS_TYP_INSTRACT,
                    OPR_INST_DATE = dtmBusinessOprDate,
                    UPDATED_DATE = SYSDATE,
                    UPDATED_BY = pvc2UserId,
                    UPDATED_PRG_NM = MY_SQL_NAME,
                    MODIFY_COUNT = MODIFY_COUNT + 1
                WHERE WORK_ODR_CD = vc2WorkOdrCd;

                --��ƌv��ԍ����ꎞ�ێ�����
                vc2WorkOdrCdMaintenance := vc2WorkOdrCd;

            END IF;

            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_ITEM) THEN
            --��ƌv��ꗗ-��Ǝ��ы敪(2:��Ǝw��)

                --��ƌn��ʎd�|�X�V
                Update T_WORK_IN_PROC_BY_PROC
                Set
                    WORK_STS_TYP = WORK_STS_TYP_INSTRACT,
                    OPR_INST_DATE = dtmBusinessOprDate,
                    UPDATED_DATE = SYSDATE,
                    UPDATED_BY = pvc2UserId,
                    UPDATED_PRG_NM = MY_SQL_NAME,
                    MODIFY_COUNT = MODIFY_COUNT + 1
                Where WORK_ODR_CD =  vc2WorkOdrCd
                And WORK_IN_PROC_CD = vc2WorkInProcCd;

                --OPEN  CurT_ISSUE_INST(vc2WorkOdrCd) ;
                --FETCH CurT_ISSUE_INST INTO ProcNo ;
                --CLOSE CurT_ISSUE_INST ;

            END IF;


            IF numWorkProcItemOprRsltTyp = OPR_RSLT_TYP_ITEM
            AND numOutsideTyp = OUTSIDE_TYP_BUY THEN

            --�H���O���̏ꍇ�A�����c�ǉ�

                --�����ԍ��̔�
                blnRet := FncGetNewPuchCd(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd, vc2PuchOdrCd);

                IF blnRet = FALSE THEN
                    RAISE excERR_GET_NEW_PUCH_CD;
                END IF;

                --�ΏۂƂȂ��ƌn��ʎd�|������������i�ُ�n�j
                IF CurT_WORK_IN_PROC_BY_PROC%ISOPEN THEN
                    CLOSE CurT_WORK_IN_PROC_BY_PROC;
                END IF;
                OPEN CurT_WORK_IN_PROC_BY_PROC(vc2WorkOdrCd,vc2WorkInProcCd);
                FETCH CurT_WORK_IN_PROC_BY_PROC INTO rtpTWorkInProcByProc;
                IF CurT_WORK_IN_PROC_BY_PROC%FOUND = FALSE THEN
                    --�G���[
                    RAISE excNOTEXIST_PROC_BY_PROC;
                END IF;

                CLOSE CurT_WORK_IN_PROC_BY_PROC;

                --�������擾
                IF CurMVendCtrl%ISOPEN THEN
                    CLOSE CurMVendCtrl;
                END IF;
                OPEN CurMVendCtrl(rtpTWorkInProcByProc.COMPANY_CD,rtpTWorkInProcByProc.VEND_CD);
                FETCH CurMVendCtrl INTO rtpMVendCtrl;
                IF CurMVendCtrl%FOUND = FALSE THEN
                    --�G���[
                    RAISE excERR_M_VEND;
                END IF;

                --�i�ڕʎd�|���擾
                IF CurTWorkInProcByItem%ISOPEN THEN
                    CLOSE CurTWorkInProcByItem;
                END IF;
                OPEN CurTWorkInProcByItem(vc2WorkOdrCd);
                FETCH CurTWorkInProcByItem INTO rtpWorkInProcByItem;
                IF CurTWorkInProcByItem%FOUND = FALSE THEN
                    --�G���[
                    RAISE excERR_T_WORK_IN_PROC_BY_ITEM;
                END IF;

                vc2PuchOdrPerson := rtpMVendCtrl.OWN_PERSON_NAME;
                vc2VendTaxCd     := rtpMVendCtrl.TAX_CD;
                numTaxApplyTyp   := rtpMVendCtrl.TAX_APPLY_TYP;  --����œK�p�敪
                vc2CurCd         := rtpMVendCtrl.CUR_CD;
                numExchTyp       := rtpMVendCtrl.EXCH_TYP;       --�ב֎��

                --�i�ڏ��擾
                IF CurMItem%ISOPEN THEN
                    CLOSE CurMItem;
                END IF;
                OPEN CurMItem(rtpTWorkInProcByProc.ITEM_CD);
                FETCH CurMItem INTO rtpMItem;
                IF CurMItem%FOUND = FALSE THEN
                --�G���[
                    RAISE excERR_M_ITEM;
                END IF;

                -- �󂯓���ۊǋ�̊���l�擾
                blnRet := FNCGETDEFAULTRCVWH(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,
                                                pvc2PlantCd,                    -- (i)�H��R�[�h
                                                rtpTWorkInProcByProc.ITEM_CD,   -- (i)�i�ڔԍ�
                                                vc2MPlantWhCd);                 -- (o)�ۊǋ�R�[�h
                IF blnRet=FALSE THEN
                    --�G���[
                    RAISE excERR_DEFAULT_RCV_WH;
                END IF;

                numSplItemTyp := rtpMItem.SPL_ITEM_TYP;
                vc2ItemTaxCd := rtpMItem.TAX_CD;

                --�{�̋��z
                numNetAmount := rtpTWorkInProcByProc.PUCH_ODR_AMOUNT - rtpTWorkInProcByProc.DISC_AMOUNT;

                --�����
                dtmJudgeDate := rtpTWorkInProcByProc.WORK_ODR_DLV_DATE;

                --�ŏ��擾
                vc2TaxCd := '';
                numTaxRate1 := 0;
                numTaxRate2 := 0;
                numTaxRate3 := 0;
                numTaxRoundTyp := 1;
                numTaxAmount1 := 0;
                numTaxAmount2 := 0;
                numTaxAmount3 := 0;

                IF numTaxApplyTyp = TAX_APPLY_TYP_M_ITEM THEN
                    vc2TaxCd := vc2ItemTaxCd;
                ELSIF numTaxApplyTyp = TAX_APPLY_TYP_M_VEND THEN
                    vc2TaxCd := vc2VendTaxCd;
                END IF;

                IF vc2TaxCd IS NOT NULL THEN

                    IF substr(vc2TaxCd,3,1) = TAXABLE_TYP_OUT THEN
                    --�ō��Ŕ����敪���Ŕ����i�O�Łj�̏ꍇ

                        --�ŏ��擾
                        IF CurMTax%ISOPEN THEN
                            CLOSE CurMTax;
                        END IF;

                        --�ŗ��̐ݒ�
                        OPEN CurMTax(vc2TaxCd);
                        FETCH CurMTax INTO rtpMTax;
                        IF CurMTax%FOUND = TRUE THEN
                            numTaxRoundTyp := rtpMTax.ROUND_TYP;
                            IF rtpMTax.NEW_TAX_RATE_START_DATE <= dtmJudgeDate THEN
                                numTaxRate1 := rtpMTax.NEW_TAX_RATE_1;
                                numTaxRate2 := rtpMTax.NEW_TAX_RATE_2;
                                numTaxRate3 := rtpMTax.NEW_TAX_RATE_3;
                            ELSE
                                numTaxRate1 := rtpMTax.OLD_TAX_RATE_1;
                                numTaxRate2 := rtpMTax.OLD_TAX_RATE_2;
                                numTaxRate3 := rtpMTax.OLD_TAX_RATE_3;
                            END IF;
                        END IF;

                        numDecimalFig := 0;
                        --���������擾
                        IF CurDecimalFig%ISOPEN THEN
                            CLOSE CurDecimalFig;
                        END IF;
                        OPEN CurDecimalFig(vc2CurCd);
                        FETCH CurDecimalFig INTO rtpDecimalFig;
                        IF CurDecimalFig%FOUND = TRUE THEN
                            numDecimalFig := rtpDecimalFig.DECIMAL_FIG;
                        END IF;

                        IF numTaxRate1 > 0 THEN

                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  numNetAmount * numTaxRate1 / 100, --(i)�[�������O�̒l
                                                  numDecimalFig,                    --(i)��������
                                                  numTaxRoundTyp,                   --(i)�[�������敪
                                                  numTaxAmount1);                   --(o)�[��������̒l
                            IF blnRet = FALSE THEN
                                RAISE excGETROUND_ERR;
                            END IF;
                        END IF;

                        IF numTaxRate2 > 0 THEN

                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  numNetAmount * numTaxRate2 / 100, --(i)�[�������O�̒l
                                                  numDecimalFig,                    --(i)��������
                                                  numTaxRoundTyp,                   --(i)�[�������敪
                                                  numTaxAmount2);                   --(o)�[��������̒l
                            IF blnRet = FALSE THEN
                                RAISE excGETROUND_ERR;
                            END IF;
                        END IF;

                        IF numTaxRate3 > 0 THEN

                            blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                  pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                  numNetAmount * numTaxRate3 / 100, --(i)�[�������O�̒l
                                                  numDecimalFig,                    --(i)��������
                                                  numTaxRoundTyp,                   --(i)�[�������敪
                                                  numTaxAmount3);                   --(o)�[��������̒l
                            IF blnRet = FALSE THEN
                                RAISE excGETROUND_ERR;
                            END IF;
                        END IF;
                    END IF;
                END IF;

                --�ō����z
                numAmountincludeTax := numNetAmount + numTaxAmount1 + numTaxAmount2 + numTaxAmount3;

                --�M�݋��z
                numHomeCurAmount := numAmountincludeTax;

                --�M��
                numHomeCurAmount := 0;
                numExchRate := 0;

                /* �i���ʉ݁j�M�݊��Z���i�p�����[�^�ݒ� */
                pvc2CompanyCd           := rtpTWorkInProcByProc.COMPANY_CD;        --��ЃR�[�h
                vc2VEND_CD              := rtpTWorkInProcByProc.VEND_CD;           --�����R�[�h
                pdtmRateJudgeDate       := rtpTWorkInProcByProc.WORK_ODR_DLV_DATE; --���[�g�����(=�m��ƌn��ʎd�|�n."��ƌn��ʐ����[��")
                pvc2ExchReserveCd       := Null;                      --�ב֗\��R�[�h
                pnumConvertTyp          := 1;                         --�ϊ�����(�O�݁��M��)

                /* �ב֎��=�Q�̏ꍇ�́A���[�j���O */
                IF numExchTyp = 2 THEN
                    vc2Comment := SUBSTR('(SBM0497)�o�^�����ԍ��F' || '[ ' || vc2PuchOdrCd || ' ]' ||
                                         ' �����R�[�h�F' || '[ ' || vc2VEND_CD || ' ]',1,256);
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                        MY_SQL_NAME ,APS_NOTENTRY_EXCH_TYP, vc2Comment);
                    pnumAfterAmount := 0;       --�ϊ�����z
                    pdtmRateJudgeDate := null;  --���[�g�����
                    pnumExchRate := 0;          --�בփ��[�g
                ELSE
                    /* �i���ʉ݁j�M�݊��Z���i���ďo�� */
                    blnRet := FNCCURRENCYCONVERT(UTL_FileHandle,          --(i)�t�@�C���n���h��
                                                 pvc2LogMode,             --(i)�k�n�f���[�h
                                                 pvc2OutputMode,          --(i)�o�̓��[�h
                                                 pvc2UserId,              --(i)���[�U�h�c
                                                 pvc2BusinessName,        --(i)�Ɩ���
                                                 pvc2PlantCd,             --(i)�H��R�[�h
                                                 pvc2CompanyCd,           --(i)��ЃR�[�h
                                                 vc2VEND_CD,              --(i)�����R�[�h
                                                 pdtmRateJudgeDate,       --(i)���[�g�����
                                                 pvc2ExchReserveCd,       --(i)�ב֗\��R�[�h
                                                 numAmountincludeTax,     --(i)�ϊ��O���z
                                                 pnumConvertTyp,          --(i)�ϊ�����(1:�O�݁��M��)
                                                 pnumAfterAmount,         --(o)�ϊ�����z
                                                 pnumRoundTyp,            --(o)�[�������敪
                                                 pnumExchRate,            --(o)�בփ��[�g
                                                 pnumExchTyp,             --(o)�ב֎��
                                                 pvc2VendCurCd,           --(o)�����ʉ݃R�[�h
                                                 pvc2VendCurName,         --(o)�����ʉݖ�
                                                 pvc2VendCurSymbol,       --(o)�����ʉ݋L��
                                                 pvc2VendCurUnit,         --(o)�����ʉݒP��
                                                 pnumVendDecimalFig,      --(o)����揬������
                                                 pvc2HomeCurCd,           --(o)���Ёi�M�݁j�ʉ݃R�[�h
                                                 pvc2HomeCurName,         --(o)���Ёi�M�݁j�ʉݖ�
                                                 pvc2HomeCurSymbol,       --(o)���Ёi�M�݁j�ʉ݋L��
                                                 pvc2HomeCurUnit,         --(o)���Ёi�M�݁j�ʉݒP��
                                                 pnumHomeDecimalFig,      --(o)���Ёi�M�݁j��������
                                                 pvc2ErrorCd              --(o)�G���[�R�[�h
                                                 );

                    /* �i���ʉ݁j�M�݊��Z���i�ŃG���[���� */
                    IF blnRet = FALSE THEN
                        /* �m�בփ��[�g�}�X�^�n�����݂���ꍇ */
                        IF pvc2ErrorCd != APS_NOTENTRY_EXCH_RATE THEN
                            blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                                                pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                                                pvc2ErrorCd, '(SBM0496)��ƌv��ԍ�[' || vc2WorkOdrCd || '] ');
                            pdtmRateJudgeDate       := Null;
                        ELSE
                            pnumAfterAmount := 0;       --�ϊ�����z
                            pdtmRateJudgeDate := null;  --���[�g�����
                            pnumExchRate := 0;          --�בփ��[�g
                            blnRet := true;
                        END IF;
                    END IF;
                END IF;

                Insert into T_RLSD_PUCH_ODR (
                    PUCH_ODR_CD,
                    ITEM_CD,
                    NON_NO_ITEM_NAME,
                    NON_NO_ITEM_TYP,
                    COMPANY_CD,
                    VEND_CD,
                    PLANT_CD,
                    PUCH_ODR_PERSON,
                    PUCH_ODR_START_DATE,
                    PUCH_ODR_DLV_DATE,
                    PUCH_ODR_QTY,
                    NON_NO_ITEM_PUCH_ODR_UNIT,
                    UNIT_COST_TYP,
                    UNIT_COST,
                    PROCESSING_COST,
                    MATERIAL_COST,
                    OTHER_OVERHEADS,
                    DISC_AMOUNT,
                    PUCH_ODR_AMOUNT,
                    PUCH_ODR_GNR_TYP,
                    PUCH_ODR_INST_DATE,
                    PUCH_ODR_INST_SLIP_ISS_FLG,
                    PUCH_ODR_SLIP_ISS_DATE,
                    ACPT_CMPLT_DATE,
                    PUCH_ODR_STS_TYP,
                    INSPC_CMPLT_FLG,
                    INSPC_CMPLT_DATE,
                    CONFIRM_DLV_DATE,
                    SPL_ITEM_TYP,
                    ACPT_INSPC_TYP,
                    INV_CTRL_FLG,
                    WORK_ODR_CD,
                    WORK_IN_PROC_CD,
                    OD_NO,
                    PUCH_ODR_COMMENT,
                    ODR_CD,
                    DETAIL_NO,
                    RATE_JUDGE_DATE,
                    EXCH_RATE,
                    TAX_RATE_1,
                    TAX_RATE_2,
                    TAX_RATE_3,
                    NET_AMOUNT,
                    TAX_AMOUNT_1,
                    TAX_AMOUNT_2,
                    TAX_AMOUNT_3,
                    AMOUNT_INCLUDE_TAX,
                    HOME_CUR_AMOUNT,
                    TAX_CD,
                    TAX_ROUND_TYP,
                    WH_CD,
                    CREATED_DATE,
                    CREATED_BY,
                    CREATED_PRG_NM,
                    UPDATED_DATE,
                    UPDATED_BY,
                    UPDATED_PRG_NM,
                    MODIFY_COUNT
                ) Values (
                    vc2PuchOdrCd
                    ,rtpTWorkInProcByProc.ITEM_CD
                    ,''
                    ,0
                    ,rtpTWorkInProcByProc.COMPANY_CD
                    ,rtpTWorkInProcByProc.VEND_CD
                    ,rtpTWorkInProcByProc.PLANT_CD
                    ,''
                    ,rtpTWorkInProcByProc.OPR_INST_START_DATE
                    ,rtpTWorkInProcByProc.WORK_ODR_DLV_DATE
                    ,rtpTWorkInProcByProc.OPR_INST_QTY
                    ,''
                    ,rtpTWorkInProcByProc.UNIT_COST_TYP
                    ,rtpTWorkInProcByProc.UNIT_COST
                    ,rtpTWorkInProcByProc.PROCESSING_COST
                    ,rtpTWorkInProcByProc.MATERIAL_COST
                    ,rtpTWorkInProcByProc.OTHER_OVERHEADS
                    ,rtpTWorkInProcByProc.DISC_AMOUNT
                    ,rtpTWorkInProcByProc.PUCH_ODR_AMOUNT
                    ,3
                    ,rtpTWorkInProcByProc.OPR_INST_DATE
                    ,0
                    ,NULL
                    ,NULL
                    ,2      --�w����
                    ,0
                    ,NULL
                    ,NULL
                    ,numSplItemTyp
                    ,rtpTWorkInProcByProc.ACPT_INSPC_TYP
                    ,1      --�݌ɊǗ�����
                    ,rtpTWorkInProcByProc.WORK_ODR_CD
                    ,rtpTWorkInProcByProc.WORK_IN_PROC_CD
                    ,rtpTWorkInProcByProc.OD_NO
                    ,rtpTWorkInProcByProc.WORK_IN_PROC_COMMENT
                    ,''
                    ,0
                    ,pdtmRateJudgeDate --�בփ��[�g�����
                    ,pnumExchRate      --�בփ��[�g
                    ,numTaxRate1
                    ,numTaxRate2
                    ,numTaxRate3
                    ,numNetAmount
                    ,numTaxAmount1
                    ,numTaxAmount2
                    ,numTaxAmount3
                    ,numAmountincludeTax
                    ,pnumAfterAmount    --�M�݋��z
                    ,vc2TaxCd
                    ,numTaxRoundTyp
                    ,vc2MPlantWhCd
                    ,SYSDATE
                    ,pvc2UserId
                    ,MY_SQL_NAME
                    ,SYSDATE
                    ,pvc2UserId
                    ,MY_SQL_NAME
                    ,0);

            END IF;


            IF numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_TURNOVER)
            OR numWorkProcItemOprRsltTyp IN (OPR_RSLT_TYP_ITEM) THEN
            -- ��ƌv��ꗗ�̍�Ǝ��ы敪 = 1(�o����) �܂���
            -- ��ƌv��ꗗ�̍�Ǝ��ы敪 = 2(��Ǝw��)

                --�o�Ɏw��
                blnRet := FNCINSIDEISSUEINSTRUCTION(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,pvc2PlantCd,
                                   vc2WorkOdrCd,vc2WorkInProcCd,vc2OdNo,
                                   numOprInstQty,numWorkProcItemOprRsltTyp);
            END IF;

            IF blnRet = FALSE THEN
                RAISE excISSUE_ERR;
            END IF;

            << EXE_END >>

            /* �u���������v�̃C���N�������g */
            numTransactionCount := numTransactionCount + 1;
        ELSE
            /* �S�s�����ɂ�菈���I�� */
            EXIT;
        END IF;
    END LOOP;

    /* �J�[�\���N���[�Y */
    DBMS_SQL.CLOSE_CURSOR(intOprInstCursorName);

    vc2Comment := SUBSTR('������F' || '[ ' || pvc2OprInstStartDate || ' ]' ||
                         ' �[���F' || '[ ' || pvc2WorkOdrDlvDate || ' ]' ||
                         ' ���ԁF' || '[ ' || pvc2JobOdrCd || ' ]' ||
                         ' ���������F' || '[ ' || numTransactionCount || ' ]',1,256);

    /* �I�����b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                        pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                        '(SBM0499)' || LOGMSG_END_PRGNAME_OPRINST || vc2Comment);

    COMMIT;

    --�g���[�X���O�iend�j
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                          pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    /* LogFile �� CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);


--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_GET_BUSINESS_DATE THEN   --�Ɩ����t���ݒ�
        ROLLBACK;
        vc2Comment := SUBSTR('�Ɩ����t���ݒ�',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0502)'  || LOGMSG_END_PRGNAME_OPRINST || vc2Comment);

        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excNOTEXIST_PROC_BY_PROC THEN   --��ƌn��ʎd�|�f�[�^�����݂��܂���
        ROLLBACK;
        vc2Comment := SUBSTR('��ƌn��ʎd�|�f�[�^�����݂��܂���',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0504)'  || LOGMSG_END_PRGNAME_OPRINST || vc2Comment);

        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excNOTEXIST_PROC_BY_ROUTING THEN   --�菇�ʎd�|�f�[�^�����݂��܂���
        ROLLBACK;
        vc2Comment := SUBSTR('�菇�ʎd�|�f�[�^�����݂��܂���',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0505)'  || LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excERR_GET_NEW_PUCH_CD THEN   --�����ԍ��̔ԃG���[
        ROLLBACK;
        vc2Comment := SUBSTR('�����ԍ��̔ԃG���[',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0506)'  ||  LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excERR_M_VEND THEN        --�u�����v�����݃G���[
        ROLLBACK;
        vc2Comment := SUBSTR('�����[' || vc2VendCd || ']�����݃G���[',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END,'(SBM0507)'  ||   LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excERR_T_WORK_IN_PROC_BY_ITEM THEN        --�u�i�ڕʎd�|�v�����݃G���[
        ROLLBACK;
        vc2Comment := SUBSTR('�i�ڕʎd�|[' || vc2VendCd || ']�����݃G���[',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                             APS_COM_BATCH_END,'(SBM0508)'  ||  LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGETROUND_ERR           THEN         --�u�[�������v�G���[
        ROLLBACK;
        vc2Comment := SUBSTR('�[�������G���[',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                            APS_COM_BATCH_END, '(SBM0509)'  ||  LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excISSUE_ERR THEN         --�u�o�Ɏw���v�X�V�G���[
        ROLLBACK;
        vc2Comment := SUBSTR('�o�Ɏw���X�V�G���[',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0510)'  ||  LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excERR_DEFAULT_RCV_WH THEN        -- �󂯓���ۊǋ�擾�G���[
        ROLLBACK;
        vc2Comment := SUBSTR('���v�ʌv�Z�Ώۂ̕ۊǋ悪���݂��܂���B',1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0512)'|| LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN   --���̑��̃G���[
        ROLLBACK;
        vc2Comment := SUBSTR(SQLCODE || SQLERRM,1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0513)'|| LOGMSG_END_PRGNAME_OPRINST || vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME,
                              METHOD_END || vc2RunChkComment);
        --�g���[�X���O�iend�j
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId,
                              pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

END;
/
