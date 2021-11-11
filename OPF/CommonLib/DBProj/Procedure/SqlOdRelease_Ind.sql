CREATE OR REPLACE PROCEDURE SqlOdRelease_Ind(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
' $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlOdRelease_Ind.sql,v $
' $Author: shan-xiuqin $
' $Revision: 1.13 $�@$Date: 2017/01/09 08:30:12 $
'
' �C������
'
' 2008.07.22 ���v�ʌv�Z����i���ԁj�̃`�F�b�N��ǉ�
' 2012.06.29 ���v�ʌv�Z����̏��v�ʃ����e�i���X���t���O�`�F�b�N�폜
'
'
' �@�\      : �ʃI�[�_�����i���ԁj
'
' ������    ��MetamorBase����
'           : pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'           ���I�[�_�����ŗL
'             pvc2SysTime          - (i)�^�C���X�^���v
'             pvc2JobOdrCd         - (i)����
'             pvc2JobOdrDetailNo   - (i)�\��

'
' �@�\����  : �ʃI�[�_�����i���ԁj
'
' ���l      :MetamorBase�ł͗\����DB���ڂ̂ݗp�ӂ���Ă��邪��PL/SQL�ł͈�������Null�ȊO��ݒ肷��Γ��삷��B
------------------------------------------------------------------------------*/
    pvc2LogMode             VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode          VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath          VARCHAR2    --�o�̓p�X
   ,pvc2OutputName          VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId              VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName        VARCHAR2    --�Ɩ���
   ,pvc2PlantCd             VARCHAR2    --�H��R�[�h
   ,pvc2SysTime            VARCHAR2    --�^�C���X�^���v
   ,pvc2JobOdrCd            VARCHAR2    --����
   ,pvc2JobOdrDetailNo          VARCHAR2    --�\��
)
IS
    -- ��O�̐錾
    excGetNewOdrCd          EXCEPTION;          --��ƌv��ԍ��擾�G���[
    excGetNewInstCd         EXCEPTION;          --��Ǝw���ԍ��擾�G���[
    excGetNewPuchCd         EXCEPTION;          --�����ԍ��擾�G���[
    excGetRound             EXCEPTION;          --�[�������G���[
    excGetVend              EXCEPTION;          --�����擾�G���[
    excGetTax               EXCEPTION;          --����Ŏ擾�G���[
    excGetOdCtrl            EXCEPTION;          --���v�ʌv�Z����擾�G���[
    excGetJobOdCtrl            EXCEPTION;          --���v�ʌv�Z����擾�G���[
    excGetTempNoDateFound           EXCEPTION;          --�ʃI�[�_�����i���ԁj��������n���ꂽ�f�[�^�擾�G���[
    excGetMyCompany         EXCEPTION;          --���Ў擾�G���[
    excGetCur               EXCEPTION;          --�ʉݎ擾�G���[(#518)
    excMistakeCommonParam   EXCEPTION;          --���ʂ̓��̓p�����[�^�ُ�
    excMistakeNativeParam   EXCEPTION;          --�ŗL�̓��̓p�����[�^�ُ�
    excOdCalc_Ing           EXCEPTION;          --���v�ʌv�Z���s���G���[�i�r���j
--    excOdMnt_Ing            EXCEPTION;          --���v�ʃ����e�i���X���G���[�i�r���j
    excJobOdCalc_Ing           EXCEPTION;          --���v�ʌv�Z(����)���s���G���[�i�r���j
    excJobOdMnt_Ing            EXCEPTION;          --���v�ʃ����e�i���X���G���[�i�r���j
    excPlantWhCd_Null       EXCEPTION;          --�H��̑�\�[���ꏊ�R�[�h�͏ȗ��ł��܂���
    excJobOdrDel            EXCEPTION;          --���������Ԃ��폜�ΏۃG���[
    excJobOdrExp            EXCEPTION;          --���������Ԍv�悪�ύX�G���[
    excJobOdrExp1           EXCEPTION;          --���������Ԋ�{��񂪕ύX�G���[
    -- �萔�̐錾
    MY_SQL_NAME             VARCHAR2(48) := 'SqlOdRelease_Ind';
    OUTSIDE_TYP_INNER_MAKE  NUMBER      := 1;   --���O��敪�@����
    OUTSIDE_TYP_BUY         NUMBER      := 2;   --���O��敪�@�O��
    WORK_STS_TYP_NOINSTRACT NUMBER      := 1;   --�i�ڕʍ�Ə�ԋ敪�@���W�J
    PROCESS_NOEXPAND        NUMBER      := 0;   --��ƌn��W�J�σt���O�@�n����
    OPR_RSLT_ACCUMULATION   NUMBER      := 1;   --��Ǝ��ы敪�@�o��������
    INST_CD_RISE_ITEM       NUMBER      := 1;   --��Ǝw���ԍ������敪�@�i�ڕ�
    INST_NOISSUE            NUMBER      := 0;   --��Ǝw���`�[���s�σt���O�@�n����
    UNIT_COST_TEMP          NUMBER      := 1;   --�w���P���敪�@���P��
    ROUND_TYP_NORMAL        NUMBER      := 1;   --�������z�܂�ߋ敪�@�l�̌ܓ�
    TAX_APPLY_TYP_M_VEND    NUMBER      := 2;   --�����̏���œK�p�敪(2:�����}�X�^�̏���ŃR�[�h)
    CTRL_CD_DEFAULT         VARCHAR2(24) := 'SYSTEM'; --�R���g���[���n�e�[�u����PrimaryKey�̒l
    PUCH_ODR_GNR_TYP_MRP    NUMBER      := 9;   --�������������敪(9:���v�ʌv�Z�ɂēo�^)
    PUCH_ODR_LST_NOISSUE    NUMBER      := 0;   --�����`�[���s�ς݃t���O(0:��)
    PUCH_ODR_STS_NOINSTRUCT NUMBER      := 1;   --������ԋ敪(1:���w��)
    INSPEC_FLG_NOTEND       NUMBER      := 0;   --���������t���O(0:��)
    INV_CTL_FLG_ON          NUMBER      := 1;   --�݌ɊǗ��t���O(1:�݌ɊǗ�����)
    TAXABLE_TYP_OUT         NUMBER      := 1;   --����ŃR�[�h���P�� �ō��Ŕ����敪(1:�Ŕ���)
    ODR_STS_PLAN            NUMBER      := 1;   --�I�[�_�����敪(1:�v��i�������j)
    ODR_STS_RELEASE         NUMBER      := 2;   --�I�[�_�����敪(2:�m��i�����j)
    ODR_STS_COMPLETE        NUMBER      := 9;   --�I�[�_�����敪(9:����)
    OD_TYP_ASSIMILATE       NUMBER      := 4;   --�I�[�_�f�}���h�敪(4:�[��)
    DM_STS_COMPLETE         NUMBER      := 9;   --�f�}���h��ԋ敪(9:����)
    DM_STS_RELEASE          NUMBER      := 2;   --�f�}���h��ԋ敪(2:�m��i�������j)
    MRP_TYP_COMPLETE        NUMBER      := 9;   --���v�ʏ����敪(9:�ς�)
    JOB_ODR_STS_SUBDETERM   NUMBER      := 4;   --���ԏ�ԋ敪(4:���ʕi�ڊm��ς�)
    JOB_ODR_STS_SELFDETERM  NUMBER      := 5;   --���ԏ�ԋ敪(5:���i�ڊm��ς�)
    JOB_ODR_STS_DETERM      NUMBER      := 9;   --���ԏ�ԋ敪(9:����)
    ODR_RELEASE_NOEFFRCT    NUMBER      := 0;   --�I�[�_�����σt���O(0:�I�[�_�����s)
    ODR_RELEASE_EFFRCT      NUMBER      := 1;   --�I�[�_�����σt���O(1:�I�[�_���s��)
    NON_NO_ITEM_TYP_OFF     NUMBER      := 0;   --���i�������i�敪(0:�݌ɊǗ�������)
    NON_NO_ITEM_FLG_OFF     NUMBER      := 0;   --���i�����t���O(0:���i�ȊO�i�ʏ�d���i�j)
    PUCH_ODR_EDI_NOISSUE    NUMBER      := 0;   --�d�c�h�f�[�^�o�͍σt���O(0:���o��)
    PUCH_ODR_FAX_NOISSUE    NUMBER      := 0;   --�e�`�w�f�[�^�o�͍σt���O(0:���o��)
    PUCH_ODR_MAIL_NOISSUE   NUMBER      := 0;   --�l�`�h�k�f�[�^�o�͍σt���O(0:���o��)
    FIRST_MODIFY_COUNT      NUMBER      := 0;   --�V�K�쐬�e�[�u���̏���̍X�V��
    IN_PROGRESS             NUMBER      := 1;   --�����i�s���i���v�ʌv�Z�^���v�ʃ����e�i���X�j
    MRP_TARGET              NUMBER      := 1;   --���v�ʌv�Z�Ώۃt���O�i1:���v�ʌv�Z�Ώہj
    CHK_JOB_ODR_STS_TYP     NUMBER      := 3;   --���ԏ�ԋ敪=3:�W�J�ς�
    CHK_JOB_ODR_EXP_TYP1    NUMBER      := 1;   --���ԏ����敪=1:�ǉ�
    CHK_JOB_ODR_EXP_TYP2    NUMBER      := 2;   --���ԏ����敪=2:�ύX
    CHK_JOB_ODR_DEL_FLG     NUMBER      := 1;   --���ԍ폜�t���O=1:�폜�Ώ�
    -- �ϐ��̐錾
    UTL_FileHandle          UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
    blnRet                  BOOLEAN;        --�֐��߂�l
    intRet                  INTEGER;        --�֐��߂�l
    vc2OutputName           VARCHAR2(200);   --���O�o�̓t�@�C�����i���H�Fpvc2ManagementTyp�@||�@pvc2OutputName�j
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment        VARCHAR2(1024);  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2TraceComment         VARCHAR2(1024);  --�g���[�[�X�o�͗p�R�����g�쐬��Ɨ̈�i���̓p�����[�^�L�^�p�j
    intOdrCursorName        INTEGER;        --���v�ʗp�J�[�\���h�c
    vc2Sql                  VARCHAR2(4096); --���I�r�p�k�p
    vc2CompanyCd            VARCHAR2(100);   --��ЃR�[�h
    vc2HomeCurCd            VARCHAR2(100);   --�M�݃R�[�h
    numHomeDecimalFig       NUMBER(2);      --�M�ݏ�������
    numDataCount            NUMBER(10);     --�f�[�^�����J�E���g
    numOdCalcFlg            NUMBER(1);      --���v�ʌv�Z���t���O
    numOdMntFlg             NUMBER(1);      --���v�ʃ����e�i���X���t���O
    numJobOdCalcFlg            NUMBER(1);      --���v�ʌv�Z(����)���t���O
    numJobOdMntFlg             NUMBER(1);      --���v�ʃ����e�i���X(����)���t���O
    vc2OdNo                 VARCHAR2(100);   --�I�[�_�f�}���h�ԍ�
    vc2ItemCd               VARCHAR2(100);   --�i�ڔԍ�
    dtmPrdDueDate           DATE;           --�����[��
    dtmPrdStartDate         DATE;           --���������
    numOdrQty               NUMBER(18,4);   --�I�[�_��
    numOutsideTyp           NUMBER(2);      --���v�ʓ��O��敪
    numAcptInspcTyp         NUMBER(2);      --��������敪
    numOprRsltTyp           NUMBER(2);      --��Ǝ��ы敪
    numSplItemTyp           NUMBER(2);      --�󋋕i�敪
    vc2VendCd               VARCHAR2(100);   --��\�����R�[�h
    vc2WsCd                 VARCHAR2(100);   --��\��Ƌ�R�[�h
    vc2TaxCd                VARCHAR2(100);   --����ŃR�[�h�i�i�ځj
    vc2JobOdrCd             VARCHAR2(100);   --����
    numJobOdrDetailNo       NUMBER(6);      --���Ԏ}��
    numJobOdrCancelNo       NUMBER(6);      --���Ԏ�������ԍ�
    vc2ParentOdNo           VARCHAR2(100);   --�e�I�[�_�f�}���h�ԍ�
    vc2PatternCd            VARCHAR2(100);   --�p�^�[���R�[�h
    vc2WhCd                 VARCHAR2(100);   --��n�ꏊ�i��\�[���ꏊ�R�[�h�j
    numUnitCost             NUMBER(18,4);   --�w���P��
    numPuchUnitCostTyp      NUMBER(2);      --�w���P���敪
    numProcessingCost       NUMBER(18,4);   --�w�����H��
    numMaterialCost         NUMBER(18,4);   --�w���ޗ���
    numOtherOverheads       NUMBER(18,4);   --�w�����̑��o��
    numRoundTyp             NUMBER(2);      --�������z�܂�ߋ敪
    numTaxApplyTyp          NUMBER(2);      --����œK�p�敪
    vc2TaxCdVend            VARCHAR2(100);   --����ŃR�[�h�i�����j
    vc2CurCd                VARCHAR2(100);   --�ʉ݃R�[�h
    vc2OwnPersonCd          VARCHAR2(100);   --���ВS���҃R�[�h
    numOldTaxRate1          NUMBER(18,4);   --���ŗ��P
    numOldTaxRate2          NUMBER(18,4);   --���ŗ��Q
    numOldTaxRate3          NUMBER(18,4);   --���ŗ��R
    numNewTaxRate1          NUMBER(18,4);   --�V�ŗ��P
    numNewTaxRate2          NUMBER(18,4);   --�V�ŗ��Q
    numNewTaxRate3          NUMBER(18,4);   --�V�ŗ��R
    dtmNewTaxRateStartDate  Date        ;   --�V����ŊJ�n��
    numTaxRate1             NUMBER(18,4);   --�ŗ��P
    numTaxRate2             NUMBER(18,4);   --�ŗ��Q
    numTaxRate3             NUMBER(18,4);   --�ŗ��R
    numTaxRoundTyp          NUMBER(2);      --�[���敪�i����Łj
    numExchTyp              NUMBER(2);      --�ב֎��
    numRateJudgeDate        Date        ;   --���[�g�����
    numExchRate             NUMBER(20,6);   --�בփ��[�g
    numDecimalFig           NUMBER(2);      --�O�ݏ�������
    numPuchOdrAmount        NUMBER(18,4);   --�������z
    numNetAmount            NUMBER(18,4);   --�{�̋��z
    numTaxAmount1           NUMBER(18,4);   --�Ŋz�P
    numTaxAmount2           NUMBER(18,4);   --�Ŋz�Q
    numTaxAmount3           NUMBER(18,4);   --�Ŋz�R
    numAmountIncludeTax     NUMBER(18,4);   --�ō����z
    numHomeCurAmount        NUMBER(18,4);   --�M�݋��z
    numDmStsTyp             NUMBER(2);      --�f�}���h��ԋ敪
    numOdrStsTyp            NUMBER(2);      --�I�[�_��ԋ敪
    numJobOdrStsTyp         NUMBER(2);      --���ԏ�ԋ敪
    vc2WorkOdrCd            VARCHAR2(100);   --��ƌv��ԍ��擾�l
    vc2OprInstCd            VARCHAR2(100);   --��Ǝw���ԍ��擾�l
    vc2PuchOdrCd            VARCHAR2(100);   --�����ԍ��擾�l
    numRoundTypCur          NUMBER(2);          --�[�������敪
    numExchTypCur           NUMBER(2);          --�ב֎��
    vc2VendCurCd            VARCHAR2(100);       --�����ʉ݃R�[�h
    vc2VendCurName          VARCHAR2(160);       --�����ʉݖ�
    vc2VendCurSymbol        VARCHAR2(100);       --�����ʉ݋L��
    vc2VendCurUnit          VARCHAR2(160);       --�����ʉݒP��
    numVendDecimalFig       NUMBER(2);          --����揬������
    vc2HomeCurName          VARCHAR2(160);       --���Ёi�M�݁j�ʉݖ�
    vc2HomeCurSymbol        VARCHAR2(100);       --���Ёi�M�݁j�ʉ݋L��
    vc2HomeCurUnit          VARCHAR2(160);       --���Ёi�M�݁j�ʉݒP��
    vc2ErrorCd              VARCHAR2(1024);      --�G���[�R�[�h
    numTgtCnt               NUMBER := 0;    --�Ώی���
    numDoneCnt              NUMBER := 0;    --���팏��
    numWarCnt               NUMBER := 0;    --���[�j���O����
    numfatalCnt             NUMBER := 0;    --�ُ팏��
    blnWarning              BOOLEAN;        --���[�j���O���f
    numJobOdrStsTypChk      NUMBER(2);    --���ԏ�ԋ敪
    numJobOdrExpTyp         NUMBER(2);    --���ԏ����敪
    numJobOdrDelFlg         NUMBER(2);    --���ԍ폜�t���O
    vc2JobOdrCdChk          VARCHAR2(100);--����(�`�F�b�N�p)
    vc2OdNoChk              VARCHAR2(100);--�I�[�_�f�}���h�ԍ�(�`�F�b�N�p)
    numJobOdrCHK            NUMBER := 0;    --���ԃI�[�_�f�}���h�`�F�b�N�t���O
    vc2OdTyp                VARCHAR2(100);  --�I�[�_�f�}���h�敪
    numParentOdrFlg         NUMBER := 0;    --�[���i�ڂ̂ݎw��ꍇ�A�`�F�b�N�p�t���O
    numParentOdrSysTyp      NUMBER(2);      --�e���ڂ̃I�[�_��ԋ敪
    
    -- MESSAGE �̐錾
    APS_COM_BATCH_START                 VARCHAR2(28)   := 'ZZ09001';    --�o�b�`�������J�n���܂���
    APS_COM_BATCH_END                   VARCHAR2(28)   := 'ZZ09002';    --�o�b�`�������I�����܂���
    APS_COM_NOTEXIST_MY_COMPANY         VARCHAR2(28)   := 'AC00101';    --���Ѓf�[�^�����݂��܂���
    APS_COM_NOTEXIST_PROC_GRP           VARCHAR2(28)   := 'AC00103';    --��ƌn���񂪑��݂��܂���i��\��Ƌ悪���擾�j
    APS_COM_NOTEXIST_PUCH_COST          VARCHAR2(28)   := 'AC00104';    --�w���P���f�[�^�����݂��܂���i��\����悪���擾�j
    APS_COM_MISTAKE_COMMON_PARAM        VARCHAR2(28)   := 'AC00105';    --���ʂ̓��̓p�����[�^������Ă��܂�
    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'AC00106';    --�ŗL�̓��̓p�����[�^������Ă��܂�
    APS_COM_OD_CALC_ING                 VARCHAR2(28)   := 'AC00107';    --���v�ʌv�Z���s���ł�
    APS_COM_JOB_OD_CALC_ING                 VARCHAR2(28)   := 'AC00235';    --���v�ʌv�Z(����)���s���ł�
    APS_COM_NOTEXIST_JOB_OD_CALC       VARCHAR2(28)   := 'AC00237';    --���v�ʌv�Z����(����)�f�[�^�����݂��܂���
    APS_COM_OD_MNT_ING                  VARCHAR2(28)   := 'AC00108';    --���v�ʃ����e�i���X���s���ł�
    APS_COM_NOTEXIST_ODRELEASE_T       VARCHAR2(28)   := 'AC00234';    --�ʃI�[�_�����i���ԁj��������n���ꂽ�f�[�^������܂���
    APS_COM_NOTEXIST_OD_CALC_CTPL       VARCHAR2(28)   := 'AC50552';    --���v�ʌv�Z����f�[�^�����݂��܂���
    APS_COM_NOTEXIST_UNIT_COST          VARCHAR2(28)   := 'AC50515';    --�w���P���f�[�^�����݂��܂���
    APS_COM_NOTEXIST_OPR_INST_CD        VARCHAR2(28)   := 'AC50555';    --��Ǝw���ԍ��̔ԃf�[�^�����݂��܂���
    APS_COM_NOTEXIST_PUCH_ODR_CD        VARCHAR2(28)   := 'AC50557';    --�����ԍ��̔ԃf�[�^�����݂��܂���
    APS_COM_NOTEXIST_ODR_CD             VARCHAR2(28)   := 'AC50560';    --��ƌv��ԍ��̔ԃf�[�^�����݂��܂���
    APS_COM_NOTEXIST_M_VEND_CTRL        VARCHAR2(28)   := 'AC50520';    --�����f�[�^�����݂��܂���
    APS_COM_NOTEXIST_DATA               VARCHAR2(28)   := 'AC50700';    --�Ώۃf�[�^�����݂��܂���
    APS_COM_ORACLE_ERR                  VARCHAR2(28)   := 'AC53401';    --�n�q�`�b�k�d�G���[
    APS_COM_OTHER_ERR                   VARCHAR2(28)   := 'AC53402';    --���̑��G���[
    APS_COM_NOTEXIST_M_CUR              VARCHAR2(28)   := 'ZZ02023';    --�Y�����R�[�h���ʉ݂ɑ��݂��܂���B(#518)
    APS_COM_MRP_TARGET_NOTFOUND         VARCHAR2(28)   := 'AC20001';    --���v�ʌv�Z�Ώۂ̕ۊǋ悪���݂��܂���
    APS_COM_JOB_ODR_DEL_FLG             VARCHAR2(28)   := 'AC00256';    --���������Ԃ��폜�Ώۂ̂��߁A���v�ʌv�Z���s����K�v������܂�
    APS_COM_JOB_ODR_EXP_TYP             VARCHAR2(28)   := 'AC00255';    --���������Ԍv�悪�ύX�̂��߁A���v�ʌv�Z���s����K�v������܂�
    APS_COM_JOB_ODR_EXP_TYP1            VARCHAR2(28)   := 'AC00257';    --���������Ԋ�{��񂪕ύX���܂�������A���v�ʌv�Z���s����K�v������܂�

    -- LOG �̐錾
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    OrdStartMsg                         VARCHAR2(136);
    OrdEndMsg                           VARCHAR2(136);
    OrdEndMsg_Param                     VARCHAR2(64)  := '���̓p�����[�^�F';
    OrdEndMsg_TgtCnt                    VARCHAR2(40)  := '�Ώی����F';
    OrdEndMsg_DoneCnt                   VARCHAR2(40)  := '���팏���F';
    OrdEndMsg_WarCnt                    VARCHAR2(64)  := '���[�j���O�����F';
    OrdEndMsg_fatalCnt                  VARCHAR2(40)  := '�ُ팏���F';
    BracketS                            VARCHAR2(4)   := '[';
    BracketE                            VARCHAR2(4)   := ']';
    Comma                               VARCHAR2(4)   := ',';
    OrdWrnMsg_WorkOdrCd                 VARCHAR2(56)  := '��ƌv��ԍ��F';
    OrdWrnMsg_PuchOdrCd                 VARCHAR2(40)  := '�����ԍ��F';
    OrdWrnMsg_VendCd                    VARCHAR2(56)  := '�����R�[�h�F';
    OrdWrnMsg_TaxCd                     VARCHAR2(56)  := '����ŃR�[�h�F';
    OrdWrnMsg_Round                     VARCHAR2(56)  := '(SBM0465)�[�������G���[';
    OrdWrnMsg_CurrencyConvert           VARCHAR2(56)  := '�M�݊��Z�G���[';
    OrdWrnMsg_CurCd                     VARCHAR2(48)  := '�ʉ݃R�[�h�F';       --(#518)
    LOGMSG_APS_COM_JOB_ODR              VARCHAR2(136) := '����������:';
    -- �J�[�\���̐錾
    -- ��ƌn��i��\��Ƌ�̎擾�p�j
    CURSOR curM_PROC_GRP(
        cvc2PlantCd         VARCHAR2
       ,cvc2ItemCd          VARCHAR2
       ,cnumOutsideTyp      NUMBER
        )
    IS
        SELECT WS_CD
            FROM   M_PROC_GRP
            WHERE  PLANT_CD = cvc2PlantCd
              AND  ITEM_CD = cvc2ItemCd
              AND  OUTSIDE_TYP = cnumOutsideTyp
            ORDER BY PROC_NO ASC;
    --�p�^�[���ʍ�ƌn��i��\��Ƌ�̎擾�p�j
    CURSOR curM_PATTERN_PROC_GRP(
        cvc2PlantCd         VARCHAR2
       ,cvc2ItemCd          VARCHAR2
       ,cvc2PatternCd       VARCHAR2
       ,cnumOutsideTyp      NUMBER
        )
    IS
        SELECT WS_CD
            FROM   M_PATTERN_PROC_GRP
            WHERE  PLANT_CD = cvc2PlantCd
              AND  ITEM_CD = cvc2ItemCd
              AND  PATTERN_CD = cvc2PatternCd
              AND  OUTSIDE_TYP = cnumOutsideTyp
            ORDER BY PROC_NO ASC;
    -- �w���P���w�b�_�[�i��\�����̎擾�p�j
    CURSOR curM_PUCH_UNIT_COST_H(
        cvc2CompanyCd       VARCHAR2
       ,cvc2PlantCd         VARCHAR2
       ,cvc2ItemCd          VARCHAR2
        )
    IS
        SELECT VEND_CD
            FROM   M_PUCH_UNIT_COST_H
            WHERE  COMPANY_CD = cvc2CompanyCd
              AND  PLANT_CD = cvc2PlantCd
              AND  ITEM_CD = cvc2ItemCd
            ORDER BY PUCH_PRIORITY_REF_NO ASC,VEND_CD ASC;
    -- �w���P��
    CURSOR curM_PUCH_UNIT_COST(
        cvc2CompanyCd       VARCHAR2
       ,cvc2VendCd          VARCHAR2
       ,cvc2PlantCd         VARCHAR2
       ,cvc2ItemCd          VARCHAR2
       ,cdtmEffPhaseInDate  DATE
       ,cnumPuchSize        NUMBER
        )
    IS
        SELECT UNIT_COST,UNIT_COST_TYP,PROCESSING_COST,MATERIAL_COST,OTHER_OVERHEADS
            FROM   M_PUCH_UNIT_COST
            WHERE  COMPANY_CD = cvc2CompanyCd
              AND  VEND_CD = cvc2VendCd
              AND  PLANT_CD = cvc2PlantCd
              AND  ITEM_CD = cvc2ItemCd
              AND  EFF_PHASE_IN_DATE <= cdtmEffPhaseInDate
              AND  PUCH_SIZE <= cnumPuchSize
            ORDER BY EFF_PHASE_IN_DATE DESC,PUCH_SIZE DESC;
    -- ���ʃI�[�_
--    CURSOR curT_OD_CHILD(
--        cvc2OdNo            VARCHAR2
--        )
--    IS
--        SELECT OD_NO,OD_TYP,ODR_STS_TYP
--            FROM   T_OD
--            WHERE  PARENT_OD_NO = cvc2OdNo
--            FOR UPDATE;

-- 2008/09/16 ADD START �y�c
    CURSOR curT_OD_CHILD(
        cvc2OdNo            VARCHAR2
        )
    IS
        SELECT OD_NO,OD_TYP,ODR_STS_TYP
            FROM   T_OD
            WHERE  PARENT_OD_NO = cvc2OdNo
            AND    DM_STS_TYP != DM_STS_COMPLETE
            FOR UPDATE;
-- 2008/09/16 ADD END �y�c

    -- �ۊǋ�}�X�^�̃`�F�b�N
    CURSOR curM_WH IS
        SELECT  WH_CD
            FROM   M_WH
            WHERE  M_WH.PLANT_CD = pvc2PlantCd
                   AND M_WH.MRP_FLG = MRP_TARGET;

-- 2014/01/01 ADD START ��
    -- ���Ԍv��̃`�F�b�N(���ʒ��o)
    CURSOR curT_JOB_ODR(
        cvc2OdNo  VARCHAR2 
        ) IS 
    SELECT job1.JOB_ODR_STS_TYP,
           job1.JOB_ODR_EXP_TYP,
           job1.JOB_ODR_DEL_FLG,
           job1.job_odr_cd 
        FROM  T_JOB_ODR job1 
        WHERE EXISTS(
           SELECT job2.job_odr_cd 
           FROM  T_JOB_ODR_ALC job2
           WHERE EXISTS(
              SELECT td1.od_no 
              FROM T_OD td1 
              WHERE EXISTS(
                 SELECT td2.od_no 
                 FROM T_OD td2 
                 WHERE td2.od_no = td1.parent_od_no
                 AND td2.od_no = cvc2OdNo)
                 AND job2.od_no = td1.od_no
           )
           AND job1.job_odr_cd = job2.job_odr_cd
      );
    -- ���Ԍv��̃`�F�b�N
    CURSOR curT_JOB_ODR_CK(
        cvc2OdNo  VARCHAR2 
        ) IS 
    SELECT job1.JOB_ODR_STS_TYP,
           job1.JOB_ODR_EXP_TYP,
           job1.JOB_ODR_DEL_FLG,
           job1.job_odr_cd 
        FROM  T_JOB_ODR job1 
        WHERE EXISTS(
           SELECT job2.job_odr_cd 
           FROM  T_JOB_ODR_ALC job2
           WHERE job2.od_no = cvc2OdNo
           AND job1.job_odr_cd = job2.job_odr_cd
        );

/* �����֐� */

    /*------------------------------------------------------------------------------
    '    ' FNCDELETET_ODRELEASE_T

    ' �@�\      : �ʃI�[�_�����p�ꎞ�e�[�u���ɔ����f�[�^���폜����
    '
    ' ������    :
    '             pvc2UserId           - (i)���[�U�h�c
    '             pvc2SysTime          - (i)�^�C���X�^���v
    '
    ' �߂�l    : BOOLEAN
    '             �폜�����ꍇ   �� TRUE
    '             �폜���s�ꍇ �� FALSE
    '
    ' �@�\����  : ���������I������A�܂��́A�ُ킪��̏ꍇ�A
                      �ʃI�[�_�����p�ꎞ�e�[�u���ɓo�^���������f�[�^���폜����
    '
    '
    ' ���l      : ���ɂȂ�
    '
    ------------------------------------------------------------------------------*/

    FUNCTION FNCDELETET_ODRELEASE_T(
      pvc2UserId  IN VARCHAR2,    -- ���[�U�h�c
      pvc2SysTime     IN VARCHAR2          -- �^�C���X�^���v
    ) RETURN BOOLEAN IS
    BEGIN

      delete from T_ODRELEASE_T db  where db.insert_user=pvc2UserId and db.insert_time=pvc2SysTime ;
      RETURN TRUE;
    END;

BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    OrdStartMsg := '(SBM0468)<< �ʃI�[�_���������i���ԁj�J�n >>';
    OrdEndMsg   := '<< �ʃI�[�_���������i���ԁj�I�� >>';


/*------------------------------------------------------------
'�@���O�̃I�[�v���ƊJ�n���b�Z�[�W�̏o��
'�@�l�q�o�p�A���ԗp�Ƀ��O�t�@�C�����Ǘ������邽��
'�@�p�����[�^�Ŏ������t�@�C�����̓��ɊǗ��敪��t�^����
-------------------------------------------------------------*/
    -- �g���[�X�o�͗p�Ƀp�����[�^���L�^
    vc2TraceComment := '<<';
    vc2TraceComment := vc2TraceComment || OrdEndMsg_Param || BracketS || pvc2LogMode || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2OutputMode || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2OutputPath || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2OutputName || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2UserId || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2BusinessName || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2PlantCd || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2SysTime || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2JobOdrCd || BracketE || Comma;
    vc2TraceComment := vc2TraceComment || BracketS || pvc2JobOdrDetailNo || BracketE || '>>';
    vc2TraceComment := SUBSTR(vc2TraceComment,1,256);
    /* LogFile �� ���H */
    IF NOT(pvc2OutputName IS NULL) THEN
        vc2OutputName := pvc2OutputName;
    END IF;
    /* LogFile �� OPEN */
    blnRet := FncLogOpen(pvc2OutputPath, vc2OutputName, pvc2PlantCd,pvc2OutputMode,UTL_FileHandle);
    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    -- �J�n���b�Z�[�W�̏o��
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, OrdStartMsg);
    -- �R�~�b�g
    COMMIT;
/*------------------------------------------------------------
'�@���ʂ̓��̓p�����[�^���`�F�b�N����
'�@�ŗL�̓��̓p�����[�^���`�F�b�N����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- ���ʂ̓��̓p�����[�^�̃`�F�b�N
    IF  pvc2LogMode IS NULL THEN            --�k�n�f���[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputMode IS NULL THEN         --�o�̓��[�h���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputPath IS NULL THEN         --�o�̓p�X���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputName IS NULL THEN         --�o�̓t�@�C�������m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2UserId IS NULL THEN             --���[�U�h�c���m�t�k�k
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2BusinessName IS NULL THEN       --�Ɩ������m�t�k�k
        RAISE excMistakeNativeParam;
    END IF;
    IF  pvc2PlantCd IS NULL THEN            --�H��R�[�h���m�t�k�k
        RAISE excMistakeNativeParam;
    END IF;
    IF  pvc2SysTime IS NULL THEN            --�^�C���X�^���v���m�t�k�k
        RAISE excMistakeNativeParam;
    END IF;

/*------------------------------------------------------------
'�@�ʃI�[�_�����i���ԁj��������n���ꂽ�f�[�^���`�F�b�N����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00011';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- �I�[�_�������s����̃`�F�b�N
    BEGIN
        SELECT COUNT(*) INTO numDataCount
            FROM T_ODRELEASE_T
            WHERE T_ODRELEASE_T.INSERT_USER = pvc2UserId
              AND T_ODRELEASE_T.INSERT_TIME = pvc2SysTime;
          IF numDataCount = 0 THEN
            RAISE excGetTempNoDateFound;
          END IF;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE;
    END;
/*------------------------------------------------------------
'�@���v�ʌv�Z�����`�F�b�N����
'�@���v�ʃ����e�i���X�����`�F�b�N����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- ���v�ʌv�Z����̃`�F�b�N
    BEGIN
        SELECT  OD_CALC_FLG INTO numOdCalcFlg
            FROM   SYS_OD_CALC_CTRL
            WHERE  SYS_OD_CALC_CTRL.PLANT_CD = pvc2PlantCd;
        IF numOdCalcFlg = IN_PROGRESS THEN      --���v�ʌv�Z���s��
            RAISE excOdCalc_Ing;
        END IF;

--      IF numOdMntFlg = IN_PROGRESS THEN       --���v�ʃ����e�i���X��
--          RAISE excOdMnt_Ing;
--      END IF;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetOdCtrl;
        WHEN OTHERS THEN
            RAISE;
    END;
/*------------------------------------------------------------
'�@���v�ʌv�Z�i���ԁj�����`�F�b�N����
'�@���v�ʃ����e�i���X�i���ԁj�����`�F�b�N����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00021';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- ���v�ʌv�Z����i���ԁj�̃`�F�b�N
     BEGIN 
         SELECT  OD_CALC_FLG,OD_MNT_FLG INTO numJobOdCalcFlg,numJobOdMntFlg
            FROM   SYS_JOB_OD_CALC_CTRL
            WHERE  SYS_JOB_OD_CALC_CTRL.PLANT_CD = pvc2PlantCd
                        AND SYS_JOB_OD_CALC_CTRL.JOB_ODR_CD = pvc2JobOdrCd;
        IF numJobOdCalcFlg = IN_PROGRESS THEN      --���v�ʌv�Z�i���ԁj���s��
            RAISE excJobOdCalc_Ing;
        END IF;
        IF numJobOdMntFlg = IN_PROGRESS THEN       --���v�ʃ����e�i���X�i���ԁj��
            RAISE excJobOdMnt_Ing;
        END IF;
     EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetJobOdCtrl;
        WHEN OTHERS THEN
            RAISE;
     END;

/*------------------------------------------------------------
'�@���Ѓ}�X�^���`�F�b�N����
'�@��ЃR�[�h���擾����
'�@�G���[���F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- ���Ѓ}�X�^�̃`�F�b�N
    BEGIN
        SELECT  COMPANY_CD INTO vc2CompanyCd
            FROM   SYS_MY_COMPANY
            WHERE  SYS_MY_COMPANY.CTRL_CD = CTRL_CD_DEFAULT;    --SYSTE���ݒ�
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetMyCompany;
        WHEN OTHERS THEN
            RAISE;
    END;
/*------------------------------------------------------------
'�@�ۊǋ�}�X�^���`�F�b�N����
'�@���v�ʌv�Z�Ώۂ̕ۊǋ�̑��݃`�F�b�N����
'�@���݂��Ȃ��ꍇ�F�����I��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- �ۊǋ�}�X�^�̃`�F�b�N
    OPEN curM_WH;
    FETCH curM_WH INTO vc2WhCd;
    IF curM_WH%NOTFOUND THEN
        RAISE excPlantWhCd_Null;    -- ���v�ʌv�Z�Ώەۊǋ悪���݂��Ȃ�
    END IF;
/*------------------------------------------------------------
'�@���v�ʃe�[�u���ɑ΂����̓p�����[�^�̏����𓮓I�ɂr�p�k��
'
'
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- ���o�����ɂ�蓮�I�r�p�k����
    intOdrCursorName := DBMS_SQL.OPEN_CURSOR;
    vc2Sql := 'SELECT';
    vc2Sql := vc2Sql || ' T_OD.OD_NO';            -- 1 �I�[�_�f�}���h�ԍ�
    vc2Sql := vc2Sql || ',T_OD.ITEM_CD';          -- 2 �i�ڔԍ�
    vc2Sql := vc2Sql || ',T_OD.PRD_DUE_DATE';     -- 3 �����[��
    vc2Sql := vc2Sql || ',T_OD.PRD_START_DATE';   -- 4 ���������
    vc2Sql := vc2Sql || ',T_OD.ODR_QTY';          -- 5 �I�[�_��
    vc2Sql := vc2Sql || ',T_OD.OUTSIDE_TYP';      -- 6 ���v�ʓ��O��敪
    vc2Sql := vc2Sql || ',M_ITEM.ACPT_INSPC_TYP'; -- 7 ��������敪
    vc2Sql := vc2Sql || ',M_ITEM.OPR_RSLT_TYP';   -- 8 ��Ǝ��ы敪
    vc2Sql := vc2Sql || ',M_ITEM.SPL_ITEM_TYP';   -- 9 �󋋕i�敪
    vc2Sql := vc2Sql || ',M_ITEM.TAX_CD';         --10 ����ŃR�[�h
    vc2Sql := vc2Sql || ',T_OD.JOB_ODR_CD';       --11 ����
    vc2Sql := vc2Sql || ',T_OD.JOB_ODR_DETAIL_NO';--12 ���Ԏ}��
    vc2Sql := vc2Sql || ',T_OD.JOB_ODR_CANCEL_NO';--13 ���Ԏ�������ԍ�
    vc2Sql := vc2Sql || ',T_OD.PARENT_OD_NO';     --14 �e�I�[�_�f�}���h�ԍ�
    vc2Sql := vc2Sql || ',T_OD.PATTERN_CD';       --15 �p�^�[���R�[�h
    vc2Sql := vc2Sql || ' FROM T_OD,M_ITEM,T_ODRELEASE_T,T_EXTERNAL_PLAN';
    vc2Sql := vc2Sql || ' WHERE T_OD.ITEM_CD = M_ITEM.ITEM_CD(+)';
    vc2Sql := vc2Sql || ' AND T_OD.OD_NO = T_EXTERNAL_PLAN.OD_NO(+)';
    vc2Sql := vc2Sql || ' AND T_OD.PLANT_CD = T_ODRELEASE_T.PLANT_CD';
    vc2Sql := vc2Sql || ' AND T_OD.OD_NO = T_ODRELEASE_T.OD_NO';
    -- �H��R�[�h�ɂ��w��H��𒊏o
    vc2Sql := vc2Sql || ' AND T_ODRELEASE_T.PLANT_CD = ''' || pvc2PlantCd || '''';
    vc2Sql := vc2Sql || ' AND T_ODRELEASE_T.INSERT_USER = ''' || pvc2UserId || '''';
    vc2Sql := vc2Sql || ' AND T_ODRELEASE_T.INSERT_TIME = ''' || pvc2SysTime || '''';

    -- �I�[�_��ԋ敪�i1 ���ݒ肳���j
    vc2Sql := vc2Sql || ' AND T_OD.ODR_STS_TYP = ' || ODR_STS_PLAN;
    -- ���v�ʏ����敪�i9 ���ݒ肳���j
    vc2Sql := vc2Sql || ' AND T_OD.MRP_TYP = ' || MRP_TYP_COMPLETE;
    -- �I�[�_�����ς݃t���O�i0:�����s���ݒ肳���j
    vc2Sql := vc2Sql || ' AND T_OD.ODR_RELEASE_FLG = ' || ODR_RELEASE_NOEFFRCT;

/*------------------------------------------------------------
'�@���v�ʃe�[�u���ɑ΂��Ă̂r�p�k�̓��e���g���[�X�ɏo��
'
'
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    --TraceLog �̏o�́i���s�ʒu�j
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,1,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,151,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,301,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,451,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,601,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,751,150));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,901,150));
/*------------------------------------------------------------
'�@���v�ʃe�[�u���ɑ΂��Ă̂r�p�k�̉��
'�@���v�ʃe�[�u���̗�̒�`
'
-------------------------------------------------------------*/
    -- �r�p�k�����
    DBMS_SQL.PARSE(intOdrCursorName,vc2Sql,DBMS_SQL.NATIVE);
--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- ���`
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 1,vc2OdNo,100);         -- �I�[�_�f�}���h�ԍ�
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 2,vc2ItemCd,100);       -- �i�ڔԍ�
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 3,dtmPrdDueDate);      -- �����[��
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 4,dtmPrdStartDate);    -- ���������
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 5,numOdrQty);          -- �I�[�_��
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 6,numOutsideTyp);      -- ���v�ʓ��O��敪
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 7,numAcptInspcTyp);    -- ��������敪
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 8,numOprRsltTyp);      -- ��Ǝ��ы敪
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName, 9,numSplItemTyp);      -- �󋋕i�敪
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,10,vc2TaxCd,100);        -- ����ŃR�[�h
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,11,vc2JobOdrCd,100);     -- ����
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,12,numJobOdrDetailNo);  -- ���Ԏ}��
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,13,numJobOdrCancelNo);  -- ���Ԏ�������ԍ�
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,14,vc2ParentOdNo,100);   -- �e�I�[�_�f�}���h�ԍ�
    DBMS_SQL.DEFINE_COLUMN(intOdrCursorName,15,vc2PatternCd,100);   -- �p�^�[���R�[�h
/*------------------------------------------------------------
'�@���v�ʃe�[�u���̃J�[�\�����s
'�@���v�ʃe�[�u���̍s�t�F�b�`�i���o��������Main/Loop�����j
'
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- �J�[�\�����s
    intRet := DBMS_SQL.EXECUTE(intOdrCursorName);
--vc2RunChkComment := '���������ʉ� 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- �s�t�F�b�`
    LOOP
        IF DBMS_SQL.FETCH_ROWS(intOdrCursorName) > 0 THEN
        BEGIN
--vc2RunChkComment := '���������ʉ� 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- �t�F�b�`�����l�̎擾
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 1,vc2OdNo);             -- �I�[�_�f�}���h�ԍ�
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 2,vc2ItemCd);           -- �i�ڔԍ�
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 3,dtmPrdDueDate);       -- �����[��
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 4,dtmPrdStartDate);     -- ���������
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 5,numOdrQty);           -- �I�[�_��
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 6,numOutsideTyp);       -- ���v�ʓ��O��敪
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 7,numAcptInspcTyp);     -- ��������敪
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 8,numOprRsltTyp);       -- ��Ǝ��ы敪
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName, 9,numSplItemTyp);       -- �󋋕i�敪
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,10,vc2TaxCd);            -- ����ŃR�[�h
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,11,vc2JobOdrCd);         -- ����
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,12,numJobOdrDetailNo);   -- ���Ԏ}��
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,13,numJobOdrCancelNo);   -- ���Ԏ�������ԍ�
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,14,vc2ParentOdNo);       -- �e�I�[�_�f�}���h�ԍ�
            DBMS_SQL.COLUMN_VALUE(intOdrCursorName,15,vc2PatternCd);        -- �p�^�[���R�[�h
            blnWarning := FALSE;
            numTgtCnt := numTgtCnt + 1;
/*------------------------------------------------------------
'�@[���Ԍv��]�`�F�b�N
'�@�I�[�_����(����)�̏ꍇ�����s��Ȃ�
-------------------------------------------------------------*/
            -- ���Ԃ��w�肳��Ă���ꍇ
            IF NOT (vc2JobOdrCd IS NULL) THEN
            numJobOdrCHK := 0;
            FOR curT_JOB_ODR_REC IN curT_JOB_ODR(vc2OdNo) LOOP
              numJobOdrStsTypChk := curT_JOB_ODR_REC.Job_Odr_Sts_Typ;
              numJobOdrExpTyp := curT_JOB_ODR_REC.Job_Odr_Exp_Typ;
              numJobOdrDelFlg := curT_JOB_ODR_REC.Job_Odr_Del_Flg;
              vc2JobOdrCdChk := curT_JOB_ODR_REC.Job_Odr_Cd;
            IF curT_JOB_ODR %FOUND THEN
               IF numJobOdrStsTypChk = CHK_JOB_ODR_STS_TYP THEN
                  IF numJobOdrExpTyp = CHK_JOB_ODR_EXP_TYP1 THEN
                     RAISE excJobOdrExp1;
                  END IF;
                  IF numJobOdrDelFlg = CHK_JOB_ODR_DEL_FLG THEN 
                     RAISE excJobOdrDel;
                  END IF;
                  IF numJobOdrExpTyp = CHK_JOB_ODR_EXP_TYP2 THEN
                     RAISE excJobOdrExp;
                  END IF;
               END IF;
            END IF;
            END LOOP;
            
            FOR curT_JOB_ODR_CK_REC IN curT_JOB_ODR_CK(vc2OdNo) LOOP
              numJobOdrStsTypChk := curT_JOB_ODR_CK_REC.Job_Odr_Sts_Typ;
              numJobOdrExpTyp := curT_JOB_ODR_CK_REC.Job_Odr_Exp_Typ;
              numJobOdrDelFlg := curT_JOB_ODR_CK_REC.Job_Odr_Del_Flg;
              vc2JobOdrCdChk := curT_JOB_ODR_CK_REC.Job_Odr_Cd;
            IF curT_JOB_ODR_CK %FOUND THEN
               IF numJobOdrStsTypChk = CHK_JOB_ODR_STS_TYP THEN
                  IF numJobOdrExpTyp = CHK_JOB_ODR_EXP_TYP1 THEN
                     numJobOdrCHK := 1;
                     RAISE excJobOdrExp1;
                  END IF;
                  IF numJobOdrDelFlg = CHK_JOB_ODR_DEL_FLG THEN
                     numJobOdrCHK := 1;
                     RAISE excJobOdrDel;
                  END IF;
                  IF numJobOdrExpTyp = CHK_JOB_ODR_EXP_TYP2 THEN
                     numJobOdrCHK := 1;
                     RAISE excJobOdrExp;
                  END IF;
               END IF;
            END IF;
            END LOOP;
            END IF;
/*------------------------------------------------------------
'�@���v�ʃf�[�^������̏ꍇ�̏��������{
'�@����ւ̕���
'�@��ƌv��ԍ��̎擾
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- ���O��敪 = 1�i����j
            IF numOutsideTyp = OUTSIDE_TYP_INNER_MAKE THEN
--vc2RunChkComment := '���������ʉ� 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- ��ƌv��ԍ��擾
                blnRet := FncGetNewOdrCd(UTL_FileHandle
                                        ,pvc2LogMode
                                        ,pvc2OutputMode
                                        ,pvc2UserId
                                        ,pvc2BusinessName
                                        ,pvc2PlantCd
                                        ,vc2WorkOdrCd
                                        );
                IF blnRet = FALSE THEN
                    RAISE excGetNewOdrCd;
                END IF;
/*------------------------------------------------------------
'�@��ƌn��}�X�^�̓ǂݍ���
'�@��\��Ƌ�̎擾
'�@���o�^��: �������s
-------------------------------------------------------------*/
                --�i�ڂ̍�Ǝ��ы敪���P�i�o�������сj�̏ꍇ
                IF numOprRsltTyp = OPR_RSLT_ACCUMULATION THEN
	--[���v��]."�p�^�[���R�[�h"��NULL�̂Ƃ�
	                IF vc2PatternCd IS NULL THEN
	--vc2RunChkComment := '���������ʉ� 00140';
	--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
	                    -- ��\��Ƌ�̎擾
	                    OPEN curM_PROC_GRP(
	                        pvc2PlantCd
	                       ,vc2ItemCd
	                       ,numOutsideTyp
	                        );
	--vc2RunChkComment := '���������ʉ� 00150';
	--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
	                    FETCH curM_PROC_GRP
	                        INTO vc2WsCd;
	                    IF curM_PROC_GRP%NOTFOUND THEN
	                         vc2WsCd := NULL;
	                   END IF;
	                    CLOSE curM_PROC_GRP;
	                END IF;
	--vc2RunChkComment := '���������ʉ� 00145';
	--[���v��]."�p�^�[���R�[�h"��NULL�ȊO�̂Ƃ�
	                IF vc2PatternCd IS NOT NULL THEN
	--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
	                    -- ��\��Ƌ�̎擾
	                    OPEN curM_PATTERN_PROC_GRP(
	                        pvc2PlantCd
	                       ,vc2ItemCd
	                       ,vc2PatternCd
	                       ,numOutsideTyp
	                        );
	--vc2RunChkComment := '���������ʉ� 00155';
	--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
	                    FETCH curM_PATTERN_PROC_GRP
	                        INTO vc2WsCd;
	                    IF curM_PATTERN_PROC_GRP%NOTFOUND THEN
	                         vc2WsCd := NULL;
	                    END IF;
	                    CLOSE curM_PATTERN_PROC_GRP;
	                END IF;
	            ELSE
                --�i�ڂ̍�Ǝ��ы敪���P�i��Ǝ��сj�̏ꍇ
                      vc2WsCd := NULL;
                END IF;
	                
/*------------------------------------------------------------
'�@��\��Ƌ悪���o�^�@����
'�@�i�ڂ̍�Ǝ��ы敪���P�i�o�������сj
'�@�����F�Ɩ����b�Z�[�W�̏o��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF vc2WsCd IS NULL AND numOprRsltTyp = OPR_RSLT_ACCUMULATION THEN
                    blnWarning := TRUE;
                    numWarCnt := numWarCnt + 1;
                    vc2Comment :='(SBM0451)' ||  OrdWrnMsg_WorkOdrCd || BracketS || vc2WorkOdrCd || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTEXIST_PROC_GRP, vc2Comment);
                END IF;
                vc2OprInstCd := NULL;
/*------------------------------------------------------------
'�@�i�ڂ̍�Ǝ��ы敪���P�i�o�������сj�̏ꍇ
'�@��Ǝw���`�[�Ƀf�[�^��ǉ�����
'
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00170';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF numOprRsltTyp = OPR_RSLT_ACCUMULATION THEN
--vc2RunChkComment := '���������ʉ� 00180';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- ��Ǝw���ԍ��擾
                    blnRet := FncGetNewInstCd(UTL_FileHandle
                                            ,pvc2LogMode
                                            ,pvc2OutputMode
                                            ,pvc2UserId
                                            ,pvc2BusinessName
                                            ,pvc2PlantCd
                                            ,vc2OprInstCd
                                            );
                    IF blnRet = FALSE THEN
                        RAISE excGetNewInstCd;
                    END IF;
--vc2RunChkComment := '���������ʉ� 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- ��Ǝw���`�[�f�[�^�̓o�^
                    INSERT INTO T_OPR_INST_SLIP (
                         OPR_INST_CD
                        ,OPR_INST_CD_GNR_TYP
                        ,OPR_INST_SLIP_ISS_DATE
                        ,OPR_INST_SLIP_ISS_FLG
                        ,PLANT_CD
                        ,CREATED_DATE
                        ,CREATED_BY
                        ,CREATED_PRG_NM
                        ,UPDATED_DATE
                        ,UPDATED_BY
                        ,UPDATED_PRG_NM
                        ,MODIFY_COUNT
                        ) VALUES (
                         vc2OprInstCd           --��Ǝw���ԍ�
                        ,INST_CD_RISE_ITEM      --��Ǝw���ԍ������敪
                        ,NULL                   --��Ǝw���`�[���s��
                        ,INST_NOISSUE           --��Ǝw���`�[���s�σt���O
                        ,pvc2PlantCd            --�H��R�[�h
                        ,SYSDATE                --�������쐬����
                        ,pvc2UserId             --�������쐬�҃R�[�h
                        ,MY_SQL_NAME            --�쐬�v���O������
                        ,SYSDATE                --�������ŐV�X�V����
                        ,pvc2UserId             --�������ŐV�X�V�҃R�[�h
                        ,MY_SQL_NAME            --�X�V�v���O������
                        ,FIRST_MODIFY_COUNT     --�X�V��
                        );
                END IF;
/*------------------------------------------------------------
'�@���v�ʃf�[�^������̏ꍇ
'�@�i�ڕʎd�|�Ƀf�[�^��ǉ�����
'
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00200';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �i�ڕʎd�|�Ƀf�[�^�ǉ�
                INSERT INTO T_WORK_IN_PROC_BY_ITEM(
                     WORK_ODR_CD
                    ,PLANT_CD
                    ,OD_NO
                    ,ITEM_CD
                    ,WS_CD
                    ,OPR_INST_START_DATE
                    ,WORK_ODR_DLV_DATE
                    ,OPR_INST_QTY
                    ,OPR_RSLT_TYP
                    ,WORK_STS_TYP
                    ,PROC_EXPLOSION_FLG
                    ,OPR_INST_DATE
                    ,WORK_CMPLT_DATE
                    ,OPR_INST_CD
                    ,WORK_IN_PROC_COMMENT
                    ,CREATED_DATE
                    ,CREATED_BY
                    ,CREATED_PRG_NM
                    ,UPDATED_DATE
                    ,UPDATED_BY
                    ,UPDATED_PRG_NM
                    ,MODIFY_COUNT
                    ) VALUES (
                     vc2WorkOdrCd               --��ƌv��ԍ�
                    ,pvc2PlantCd                --�H��R�[�h
                    ,vc2OdNo                    --�I�[�_�f�}���h�ԍ�
                    ,vc2ItemCd                  --�i�ڔԍ�
                    ,vc2WsCd                    --��Ƌ�R�[�h
                    ,dtmPrdStartDate            --��Ɛ��������
                    ,dtmPrdDueDate              --��Ɛ����[��
                    ,numOdrQty                  --��Ǝw����
                    ,numOprRsltTyp              --�i�ڕʍ�Ǝ��ы敪
                    ,WORK_STS_TYP_NOINSTRACT    --�i�ڕʍ�Ə�ԋ敪
                    ,PROCESS_NOEXPAND           --��ƌn��W�J�σt���O
                    ,NULL                       --��Ǝw����
                    ,NULL                       --��Ɗ�����
                    ,vc2OprInstCd               --��Ǝw���ԍ�
                    ,NULL                       --�i�ڕʎd�|���l
                    ,SYSDATE                    --�������쐬����
                    ,pvc2UserId                 --�������쐬�҃R�[�h
                    ,MY_SQL_NAME                --�쐬�v���O������
                    ,SYSDATE                    --�������ŐV�X�V����
                    ,pvc2UserId                 --�������ŐV�X�V�҃R�[�h
                    ,MY_SQL_NAME                --�X�V�v���O������
                    ,FIRST_MODIFY_COUNT         --�X�V��
                    );
            -- ���O��敪 = 2�i�O��j
            ELSIF numOutsideTyp = OUTSIDE_TYP_BUY THEN
/*------------------------------------------------------------
'�@���v�ʃf�[�^���O��̏ꍇ�̏��������{
'�@�O��ւ̕���
'�@�����ԍ��̎擾
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00210';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �����ԍ��擾
                blnRet := FncGetNewPuchCd(UTL_FileHandle
                                        ,pvc2LogMode
                                        ,pvc2OutputMode
                                        ,pvc2UserId
                                        ,pvc2BusinessName
                                        ,pvc2PlantCd
                                        ,vc2PuchOdrCd
                                        );
                IF blnRet = FALSE THEN
                    RAISE excGetNewPuchCd;
                END IF;
/*------------------------------------------------------------
'�@�w���P���}�X�^�i�w�b�_�[�j�̓ǂݍ���
'�@��\�����̎擾
'�@���o�^��: �������s
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00220';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- ��\�����̎擾
                OPEN curM_PUCH_UNIT_COST_H(
                    vc2CompanyCd
                   ,pvc2PlantCd
                   ,vc2ItemCd
                    );
--vc2RunChkComment := '���������ʉ� 00230';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                FETCH curM_PUCH_UNIT_COST_H
                    INTO vc2VendCd;
                IF curM_PUCH_UNIT_COST_H%NOTFOUND THEN
                     vc2VendCd := NULL;
                END IF;
                CLOSE curM_PUCH_UNIT_COST_H;
/*------------------------------------------------------------
'�@��\�����R�[�h���擾�ł��Ȃ��ꍇ�͋Ɩ����b�Z�[�W�o��
'�@�����Ɋւ���e�擾�f�[�^�͋����I�ɕϐ��������l����
'�@�����A�w���P���A����ŁA�בփ��[�g�A�Ȃ�
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00240';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- ��\�����R�[�h���ݒ肳��Ă��Ȃ���΋Ɩ����b�Z�[�W�o��
                IF vc2VendCd IS NULL THEN
--vc2RunChkComment := '���������ʉ� 00250';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    blnWarning := TRUE;
                    numWarCnt := numWarCnt + 1;
                    vc2Comment := '(SBM0452)'|| OrdWrnMsg_PuchOdrCd || BracketS || vc2PuchOdrCd || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_NOTEXIST_PUCH_COST, vc2Comment);
                    numUnitCost := 0;                       --�w���P��
                    numPuchUnitCostTyp := UNIT_COST_TEMP;   --�w���P���敪�i���P���j
                    numProcessingCost := 0;                 --�w�����H��
                    numMaterialCost := 0;                   --�w���ޗ���
                    numOtherOverheads := 0;                 --�w�����̑��o��
                    numRoundTyp := ROUND_TYP_NORMAL;        --�������z�܂�ߋ敪�i�l�̌ܓ��j
                    vc2TaxCd := NULL;                       --����ŃR�[�h�i�i�ځj����\�����ŕi��/����悪���f�s�̂��ߏ�����
                    numTaxRate1 := 0;                       --�ŗ��P
                    numTaxRate2 := 0;                       --�ŗ��Q
                    numTaxRate3 := 0;                       --�ŗ��R
                    numTaxRoundTyp := ROUND_TYP_NORMAL;     --����ł̒[���敪�i�l�̌ܓ��j
                    numDecimalFig := 0;                     --�O�ݏ�������
                    numExchRate := 0;                       --�בփ��[�g
                    vc2OwnPersonCd := NULL;         --���ВS���҃R�[�h
                ELSE
/*------------------------------------------------------------
'�@��\�����R�[�h���擾�ł����ꍇ
'�@�����Ɋւ���e�擾�f�[�^��ϐ��֑������B
'�@�����A�w���P���A����ŁA�בփ��[�g�A�Ȃ�
'�@�w���P���f�[�^�������ꍇ�͋Ɩ����b�Z�[�W�̏o��
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00260';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- ����挟��
                    BEGIN
                        SELECT ROUND_TYP,TAX_APPLY_TYP,TAX_CD,CUR_CD,EXCH_TYP,OWN_PERSON_CD
                            INTO    numRoundTyp,numTaxApplyTyp,vc2TaxCdVend,vc2CurCd,numExchTyp,vc2OwnPersonCd
                            FROM    M_VEND_CTRL
                            WHERE   COMPANY_CD = vc2CompanyCd
                                AND VEND_CD = vc2VendCd;
                    EXCEPTION
                        WHEN NO_DATA_FOUND THEN
                            RAISE excGetVend;
                        WHEN OTHERS THEN
                            RAISE;
                    END;
--vc2RunChkComment := '���������ʉ� 00265';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- �ʉ݌���(#518)  ���������ݒ�
                    IF vc2CurCd IS NULL THEN
                        numDecimalFig := 0;
                    ELSE
                        BEGIN
                            SELECT DECIMAL_FIG
                                INTO    numDecimalFig
                                FROM    M_CUR
                                WHERE   CUR_CD = vc2CurCd;
                        EXCEPTION
                            WHEN NO_DATA_FOUND THEN
                                RAISE excGetCur;
                            WHEN OTHERS THEN
                                RAISE;
                        END;
                    END IF;
--vc2RunChkComment := '���������ʉ� 00270';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- �w���P���擾
                    OPEN curM_PUCH_UNIT_COST(
                         vc2CompanyCd
                        ,vc2VendCd
                        ,pvc2PlantCd
                        ,vc2ItemCd
                        ,dtmPrdStartDate
                        ,numOdrQty
                        );
--vc2RunChkComment := '���������ʉ� 00280';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    FETCH curM_PUCH_UNIT_COST
                        INTO numUnitCost
                            ,numPuchUnitCostTyp
                            ,numProcessingCost
                            ,numMaterialCost
                            ,numOtherOverheads;
--vc2RunChkComment := '���������ʉ� 00290';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    IF curM_PUCH_UNIT_COST%NOTFOUND THEN
--vc2RunChkComment := '���������ʉ� 00300';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        -- �w���P���������ꍇ�̓��b�Z�[�W�o��
                        blnWarning := TRUE;
                        numWarCnt := numWarCnt + 1;
                        vc2Comment :='(SBM0452)'|| OrdWrnMsg_PuchOdrCd || BracketS || vc2PuchOdrCd || BracketE;
                        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                            MY_SQL_NAME, APS_COM_NOTEXIST_UNIT_COST, vc2Comment);
                        numUnitCost := 0;                       --�w���P��
                        numPuchUnitCostTyp := UNIT_COST_TEMP;   --�w���P���敪�i���P���j
                        numProcessingCost := 0;                 --�w�����H��
                        numMaterialCost := 0;                   --�w���ޗ���
                        numOtherOverheads := 0;                 --�w�����̑��o��
                    END IF;
                    CLOSE curM_PUCH_UNIT_COST;
--vc2RunChkComment := '���������ʉ� 00310';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- ����ŋ敪�擾
                    IF numTaxApplyTyp = TAX_APPLY_TYP_M_VEND THEN
                        vc2TaxCd := vc2TaxCdVend;  --�����
                    END IF;
--vc2RunChkComment := '���������ʉ� 00320';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- ����ŃR�[�h���P���̔��f�@�P�F�Ŕ��i�O�Łj
                    IF TO_NUMBER(SUBSTR(vc2TaxCd,3,1)) = TAXABLE_TYP_OUT THEN
--vc2RunChkComment := '���������ʉ� 00330';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        BEGIN
                            SELECT      OLD_TAX_RATE_1,OLD_TAX_RATE_2,OLD_TAX_RATE_3
                                       ,NEW_TAX_RATE_1,NEW_TAX_RATE_2,NEW_TAX_RATE_3
                                       ,NEW_TAX_RATE_START_DATE,ROUND_TYP
                                INTO    numOldTaxRate1,numOldTaxRate2,numOldTaxRate3
                                       ,numNewTaxRate1,numNewTaxRate2,numNewTaxRate3
                                       ,dtmNewTaxRateStartDate,numTaxRoundTyp
                                FROM    M_TAX
                                WHERE   TAX_CD = vc2TaxCd;
                        EXCEPTION
                            WHEN NO_DATA_FOUND THEN
                                RAISE excGetTax;
                            WHEN OTHERS THEN
                                RAISE;
                        END;
--vc2RunChkComment := '���������ʉ� 00340';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        -- �[���ƐV����ł̊J�n���̔��f�i�V���ŗ��̔��f�j
                        IF dtmNewTaxRateStartDate > dtmPrdDueDate THEN
--vc2RunChkComment := '���������ʉ� 00350';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            numTaxRate1 := numOldTaxRate1;
                            numTaxRate2 := numOldTaxRate2;
                            numTaxRate3 := numOldTaxRate3;
                        ELSE
--vc2RunChkComment := '���������ʉ� 00360';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            numTaxRate1 := numNewTaxRate1;
                            numTaxRate2 := numNewTaxRate2;
                            numTaxRate3 := numNewTaxRate3;
                        END IF;
                    ELSE
--vc2RunChkComment := '���������ʉ� 00370';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        -- ���ł̏ꍇ
                        numTaxRate1 := 0;
                        numTaxRate2 := 0;
                        numTaxRate3 := 0;
                        numTaxRoundTyp := ROUND_TYP_NORMAL;
                    END IF;
--vc2RunChkComment := '���������ʉ� 00380';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                END IF;     --��\�����擾����̂h�e���ɑ΂���d�m�c�Q�h�e
--vc2RunChkComment := '���������ʉ� 00410';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �������z�v�Z
                blnRet := fncGetRound(UTL_FileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd
                                     ,numUnitCost * numOdrQty
                                     ,numDecimalFig
                                     ,numRoundTyp
                                     ,numPuchOdrAmount
                                     );
                IF blnRet = FALSE THEN
                    RAISE excGetRound;
                END IF;
--vc2RunChkComment := '���������ʉ� 00420';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �{�̋��z�v�Z
                numNetAmount := numPuchOdrAmount;
--vc2RunChkComment := '���������ʉ� 00430';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �Ŋz�P�v�Z
                blnRet := fncGetRound(UTL_FileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd
                                     ,numNetAmount * numTaxRate1 / 100
                                     ,numDecimalFig
                                     ,numTaxRoundTyp
                                     ,numTaxAmount1
                                     );
                IF blnRet = FALSE THEN
                    RAISE excGetRound;
                END IF;
--vc2RunChkComment := '���������ʉ� 00440';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �Ŋz�Q�v�Z
                blnRet := fncGetRound(UTL_FileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd
                                     ,numNetAmount * numTaxRate2 / 100
                                     ,numDecimalFig
                                     ,numTaxRoundTyp
                                     ,numTaxAmount2
                                     );
                IF blnRet = FALSE THEN
                    RAISE excGetRound;
                END IF;
--vc2RunChkComment := '���������ʉ� 00450';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �Ŋz�R�v�Z
                blnRet := fncGetRound(UTL_FileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd
                                     ,numNetAmount * numTaxRate3 / 100
                                     ,numDecimalFig
                                     ,numTaxRoundTyp
                                     ,numTaxAmount3
                                     );
                IF blnRet = FALSE THEN
                    RAISE excGetRound;
                END IF;
--vc2RunChkComment := '���������ʉ� 00460';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �ō����z�v�Z
                numAmountIncludeTax := numNetAmount + numTaxAmount1 + numTaxAmount2 + numTaxAmount3;
--vc2RunChkComment := '���������ʉ� 00470';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �M�݊��Z
                numRateJudgeDate := dtmPrdDueDate;
                blnRet := fncCurrencyConvert(UTL_FileHandle                  -- (i)�t�@�C���n���h��
                                            ,pvc2LogMode                     -- (i)�k�n�f���[�h
                                            ,pvc2OutputMode                  -- (i)�o�̓��[�h
                                            ,pvc2UserId                      -- (i)���[�U�h�c
                                            ,pvc2BusinessName                -- (i)�Ɩ���
                                            ,pvc2PlantCd                     -- (i)�H��R�[�h
                                            ,vc2CompanyCd                    -- (i)��ЃR�[�h
                                            ,vc2VendCd                       -- (i)�����R�[�h
                                            ,numRateJudgeDate                -- (i)���[�g�����
                                            ,null                            -- (i)�ב֗\��R�[�h
                                            ,numAmountIncludeTax             -- (i)�ϊ��O���z
                                            ,1                               -- (i)�ϊ�����
                                            ,numHomeCurAmount                -- (o)�ϊ�����z
                                            ,numRoundTypCur                  -- (o)�[�������敪
                                            ,numExchRate                     -- (o)�בփ��[�g
                                            ,numExchTypCur                   -- (o)�ב֎��
                                            ,vc2VendCurCd                    -- (o)�����ʉ݃R�[�h
                                            ,vc2VendCurName                  -- (o)�����ʉݖ�
                                            ,vc2VendCurSymbol                -- (o)�����ʉ݋L��
                                            ,vc2VendCurUnit                  -- (o)�����ʉݒP��
                                            ,numVendDecimalFig               -- (o)����揬������
                                            ,vc2HomeCurCd                    -- (o)���Ёi�M�݁j�ʉ݃R�[�h
                                            ,vc2HomeCurName                  -- (o)���Ёi�M�݁j�ʉݖ�
                                            ,vc2HomeCurSymbol                -- (o)���Ёi�M�݁j�ʉ݋L��
                                            ,vc2HomeCurUnit                  -- (o)���Ёi�M�݁j�ʉݒP��
                                            ,numHomeDecimalFig               -- (o)���Ёi�M�݁j��������
                                            ,vc2ErrorCd                      -- (o)�G���[�R�[�h
                                            );
                IF blnRet = FALSE THEN
                    blnWarning := TRUE;
                    numWarCnt := numWarCnt + 1;
                    vc2Comment := '(SBM0461)'|| OrdWrnMsg_CurrencyConvert || BracketS || vc2PuchOdrCd || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, vc2ErrorCd, vc2Comment);
                    numRateJudgeDate := null; -- ���[�g�����
                    numExchRate := 0;         -- �בփ��[�g
                    numHomeCurAmount := 0;    -- �M�݋��z
                END IF;

/*------------------------------------------------------------
'�@�󂯓���ۊǋ�̊���l�擾
-------------------------------------------------------------*/
blnRet := FNCGETDEFAULTRCVWH(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName,
                                pvc2PlantCd,    -- (i)�H��R�[�h
                                vc2ItemCd,      -- (i)�i�ڔԍ�
                                vc2WhCd);       -- (o)�ۊǋ�R�[�h

/*------------------------------------------------------------
'�@���v�ʃf�[�^���O��̏ꍇ
'�@�����c�Ƀf�[�^��ǉ�����
'
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00480';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �����c�Ƀf�[�^�ǉ�
                INSERT INTO T_RLSD_PUCH_ODR(
                     PUCH_ODR_CD
                    ,ITEM_CD
                    ,WH_CD
                    ,NON_NO_ITEM_NAME
                    ,NON_NO_ITEM_TYP
                    ,COMPANY_CD
                    ,VEND_CD
                    ,PLANT_CD
                    ,PUCH_ODR_PERSON
                    ,PUCH_ODR_START_DATE
                    ,PUCH_ODR_DLV_DATE
                    ,PUCH_ODR_QTY
                    ,NON_NO_ITEM_PUCH_ODR_UNIT
                    ,UNIT_COST_TYP
                    ,UNIT_COST
                    ,PROCESSING_COST
                    ,MATERIAL_COST
                    ,OTHER_OVERHEADS
                    ,DISC_AMOUNT
                    ,PUCH_ODR_AMOUNT
                    ,PUCH_ODR_GNR_TYP
                    ,PUCH_ODR_INST_DATE
                    ,PUCH_ODR_INST_SLIP_ISS_FLG
                    ,PUCH_ODR_SLIP_ISS_DATE
                    ,ACPT_CMPLT_DATE
                    ,PUCH_ODR_STS_TYP
                    ,INSPC_CMPLT_FLG
                    ,INSPC_CMPLT_DATE
                    ,CONFIRM_DLV_DATE
                    ,SPL_ITEM_TYP
                    ,ACPT_INSPC_TYP
                    ,INV_CTRL_FLG
                    ,WORK_ODR_CD
                    ,WORK_IN_PROC_CD
                    ,OD_NO
                    ,PUCH_ODR_COMMENT
                    ,ODR_CD
                    ,DETAIL_NO
                    ,RATE_JUDGE_DATE
                    ,EXCH_RATE
                    ,TAX_RATE_1
                    ,TAX_RATE_2
                    ,TAX_RATE_3
                    ,NET_AMOUNT
                    ,TAX_AMOUNT_1
                    ,TAX_AMOUNT_2
                    ,TAX_AMOUNT_3
                    ,AMOUNT_INCLUDE_TAX
                    ,HOME_CUR_AMOUNT
                    ,TAX_CD
                    ,TAX_ROUND_TYP
                    ,NON_NO_ITEM_FLG
                    ,PUCH_ODR_EDI_ISS_FLG
                    ,PUCH_ODR_EDI_ISS_DATE
                    ,PUCH_ODR_FAX_ISS_FLG
                    ,PUCH_ODR_FAX_ISS_DATE
                    ,PUCH_ODR_MAIL_ISS_FLG
                    ,PUCH_ODR_MAIL_ISS_DATE
                    ,CREATED_DATE
                    ,CREATED_BY
                    ,CREATED_PRG_NM
                    ,UPDATED_DATE
                    ,UPDATED_BY
                    ,UPDATED_PRG_NM
                    ,MODIFY_COUNT
                    ) VALUES (
                     vc2PuchOdrCd               --�����ԍ�
                    ,vc2ItemCd                  --�����i�ڔԍ�
                    ,vc2WhCd                    --����ꏊ�R�[�h
                    ,NULL                       --���i�����i�ږ�
                    ,NON_NO_ITEM_TYP_OFF        --���i�������i�敪�i0:�݌ɊǗ�������j
                    ,vc2CompanyCd               --��ЃR�[�h
                    ,vc2VendCd                  --�����R�[�h
                    ,pvc2PlantCd                --�H��R�[�h
                    ,vc2OwnPersonCd             --�����S����
                    ,dtmPrdStartDate            --���������
                    ,dtmPrdDueDate              --�����[��
                    ,numOdrQty                  --������
                    ,NULL                       --���i�����P��
                    ,numPuchUnitCostTyp         --�P���敪
                    ,numUnitCost                --�P��
                    ,numProcessingCost          --���H��
                    ,numMaterialCost            --�ޗ���
                    ,numOtherOverheads          --���̑��o��
                    ,0                          --�l�����z
                    ,numPuchOdrAmount           --�������z
                    ,PUCH_ODR_GNR_TYP_MRP       --�������������敪
                    ,NULL                       --�����w����
                    ,PUCH_ODR_LST_NOISSUE       --�����`�[���s�σt���O
                    ,NULL                       --�����`�[���s��
                    ,NULL                       --���������
                    ,PUCH_ODR_STS_NOINSTRUCT    --������ԋ敪
                    ,INSPEC_FLG_NOTEND          --���������t���O
                    ,NULL                       --����������
                    ,NULL                       --�񓚔[��
                    ,numSplItemTyp              --�󋋕i�敪
                    ,numAcptInspcTyp            --��������������敪
                    ,INV_CTL_FLG_ON             --�݌ɊǗ��t���O
                    ,NULL                       --��ƌv��ԍ�
                    ,NULL                       --�d�|��ƃR�[�h
                    ,vc2OdNo                    --�I�[�_�f�}���h�ԍ�
                    ,NULL                       --�������l
                    ,NULL                       --�����ԍ�
                    ,0                          --���הԍ�
                    ,numRateJudgeDate           --���[�g�����
                    ,numExchRate                --�בփ��[�g
                    ,numTaxRate1                --�ŗ��P
                    ,numTaxRate2                --�ŗ��Q
                    ,numTaxRate3                --�ŗ��R
                    ,numNetAmount               --�{�̋��z
                    ,numTaxAmount1              --�Ŋz�P
                    ,numTaxAmount2              --�Ŋz�Q
                    ,numTaxAmount3              --�Ŋz�R
                    ,numAmountIncludeTax        --�ō����z
                    ,numHomeCurAmount           --�M�݋��z
                    ,vc2TaxCd                   --�ŃR�[�h
                    ,numTaxRoundTyp             --�Œ[���敪
                    ,NON_NO_ITEM_FLG_OFF        --���i�����t���O(0:���i�ȊO�i�ʏ�d���i�j)
                    ,PUCH_ODR_EDI_NOISSUE       --�d�c�h�f�[�^�o�͍σt���O(0:���o��)
                    ,NULL                       --�d�c�h�f�[�^�o�͓�
                    ,PUCH_ODR_FAX_NOISSUE       --�e�`�w�f�[�^�o�͍σt���O(0:���o��)
                    ,NULL                       --�e�`�w�f�[�^�o�͓�
                    ,PUCH_ODR_MAIL_NOISSUE      --�l�`�h�k�f�[�^�o�͍σt���O(0:���o��)
                    ,NULL                       --�l�`�h�k�f�[�^�o�͓�
                    ,SYSDATE                    --�������쐬����
                    ,pvc2UserId                 --�������쐬�҃R�[�h
                    ,MY_SQL_NAME                --�쐬�v���O������
                    ,SYSDATE                    --�������ŐV�X�V����
                    ,pvc2UserId                 --�������ŐV�X�V�҃R�[�h
                    ,MY_SQL_NAME                --�X�V�v���O������
                    ,FIRST_MODIFY_COUNT         --�X�V��
                    );
            END IF;         --���v�ʃf�[�^���O��̕���h�e���ɑ΂���d�m�c�Q�h�e
/*------------------------------------------------------------
'�@���Y���v�ʃf�[�^���P�����X�V����
'�@�I�[�_��Ԃ��m��Ƃ���
'�@�I�[�_�����ς݃t���O���n�m
-------------------------------------------------------------*/
            SELECT OD_TYP INTO vc2OdTyp FROM T_OD WHERE T_OD.OD_NO = vc2OdNo;
            IF vc2OdTyp = OD_TYP_ASSIMILATE THEN
                -- �I�[�_�f�}���h�敪���^��
                UPDATE T_OD SET
                    ODR_STS_TYP = ODR_STS_COMPLETE
                   ,ODR_RELEASE_FLG = ODR_RELEASE_EFFRCT
                   ,UPDATED_DATE = SYSDATE
                   ,UPDATED_BY = pvc2UserId
                   ,UPDATED_PRG_NM = MY_SQL_NAME
                   ,MODIFY_COUNT = MODIFY_COUNT + 1
                WHERE   OD_NO = vc2OdNo;
            ELSE
                -- �I�[�_�f�}���h�敪���^��
                --vc2RunChkComment := '���������ʉ� 00490';
                --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- ���v�ʍX�V
                UPDATE T_OD SET
                    ODR_STS_TYP = ODR_STS_RELEASE
                   ,ODR_RELEASE_FLG = ODR_RELEASE_EFFRCT
                   ,UPDATED_DATE = SYSDATE
                   ,UPDATED_BY = pvc2UserId
                   ,UPDATED_PRG_NM = MY_SQL_NAME
                   ,MODIFY_COUNT = MODIFY_COUNT + 1
                WHERE   OD_NO = vc2OdNo;
            END IF;
/*------------------------------------------------------------
'�@���v�ʃf�[�^�P�����̉��ʃf�}���h�𕡐��X�V����
'�@�I�[�_��Ԃ��m��Ƃ���
'�@�I�[�_�����ς݃t���O���n�m
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00500';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- ���ʕi�ڍX�V
            FOR curT_OD_CHILD_REC IN curT_OD_CHILD(vc2OdNo) LOOP
                vc2OdNoChk := curT_OD_CHILD_REC.OD_NO;

                IF curT_OD_CHILD_REC.OD_TYP = OD_TYP_ASSIMILATE THEN
--vc2RunChkComment := '���������ʉ� 00510';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- �I�[�_�f�}���h�敪���^��
                    numDmStsTyp := DM_STS_COMPLETE;
                    numOdrStsTyp := ODR_STS_COMPLETE;
                ELSE
--vc2RunChkComment := '���������ʉ� 00520';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    -- �I�[�_�f�}���h�敪���^��
                    numDmStsTyp := DM_STS_RELEASE;
                    numOdrStsTyp := curT_OD_CHILD_REC.ODR_STS_TYP;
                END IF;
                numParentOdrFlg := 0;
                IF vc2OdTyp = OD_TYP_ASSIMILATE THEN
                    SELECT ODR_STS_TYP INTO numParentOdrSysTyp FROM T_OD WHERE OD_NO = vc2ParentOdNo;
                    IF numParentOdrSysTyp = 1 THEN 
                        numParentOdrFlg := 1;
                    END IF;
                END IF;
--vc2RunChkComment := '���������ʉ� 00530';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF numParentOdrFlg = 0 THEN
                    UPDATE T_OD SET
                        DM_STS_TYP = numDmStsTyp
                       ,ODR_STS_TYP = numOdrStsTyp
                       ,UPDATED_DATE = SYSDATE
                       ,UPDATED_BY = pvc2UserId
                       ,UPDATED_PRG_NM = MY_SQL_NAME
                       ,MODIFY_COUNT = MODIFY_COUNT + 1
                    WHERE CURRENT OF curT_OD_CHILD;
                END IF;
--vc2RunChkComment := '���������ʉ� 00540';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                -- �I�[�_�f�}���h�敪���^���̏ꍇ����ɉ��ʂɍX�V
                IF curT_OD_CHILD_REC.OD_TYP = OD_TYP_ASSIMILATE THEN
--vc2RunChkComment := '���������ʉ� 00550';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--                    UPDATE T_OD SET
--                            DM_STS_TYP = DM_STS_RELEASE
--                           ,UPDATED_DATE = SYSDATE
--                           ,UPDATED_BY = pvc2UserId
--                           ,UPDATED_PRG_NM = MY_SQL_NAME
--                           ,MODIFY_COUNT = MODIFY_COUNT + 1
--                        WHERE   PARENT_OD_NO = curT_OD_CHILD_REC.OD_NO;
-- 2008/09/16 ADD START �y�c
                    UPDATE T_OD SET
                            DM_STS_TYP = DM_STS_RELEASE
                           ,UPDATED_DATE = SYSDATE
                           ,UPDATED_BY = pvc2UserId
                           ,UPDATED_PRG_NM = MY_SQL_NAME
                           ,MODIFY_COUNT = MODIFY_COUNT + 1
                        WHERE   PARENT_OD_NO = curT_OD_CHILD_REC.OD_NO
                        AND     DM_STS_TYP != DM_STS_COMPLETE;
-- 2008/09/16 ADD END �y�c
                END IF;
            END LOOP;
/*------------------------------------------------------------
'�@���v�ʃf�[�^�����ԃ^�C�v�ł������ꍇ�A���Ԍv����X�V����
'�@���ĕi�ڃI�[�_�F���i�ڊm��ς݂Ƃ���
'�@���ʕi�ڃI�[�_�F���ʕi�ڊm��ς݂Ƃ���
-------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00560';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- ���Ԃ��ݒ肳��Ă���ꍇ�A���Ԍv��̍X�V
            IF NOT (vc2JobOdrCd IS NULL) THEN
--vc2RunChkComment := '���������ʉ� 00570';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF vc2ParentOdNo IS NULL THEN
                    numJobOdrStsTyp := JOB_ODR_STS_SELFDETERM;
                ELSE
                    numJobOdrStsTyp := JOB_ODR_STS_SUBDETERM;
                END IF;
--vc2RunChkComment := '���������ʉ� 00580';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                UPDATE T_JOB_ODR SET
                        JOB_ODR_STS_TYP = numJobOdrStsTyp
                       ,UPDATED_DATE = SYSDATE
                       ,UPDATED_BY = pvc2UserId
                       ,UPDATED_PRG_NM = MY_SQL_NAME
                       ,MODIFY_COUNT = MODIFY_COUNT + 1
                    WHERE   JOB_ODR_CD = vc2JobOdrCd
                      AND   JOB_ODR_DETAIL_NO = numJobOdrDetailNo
                      AND   JOB_ODR_CANCEL_NO = numJobOdrCancelNo
                      AND   JOB_ODR_STS_TYP <> JOB_ODR_STS_SELFDETERM
                      AND   JOB_ODR_STS_TYP <> JOB_ODR_STS_DETERM;
            END IF;
            -- �R�~�b�g
            COMMIT;
--vc2RunChkComment := '���������ʉ� 00590';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- ���������J�E���g
            IF blnWarning = FALSE THEN
                numDoneCnt := numDoneCnt + 1;
            END IF;
        -- ���v�ʃf�[�^�P�����ɑ΂��鏈���ɑ΂��Ă̂d�w�b�o�s�h�n�m
        EXCEPTION
            WHEN excGetNewOdrCd  THEN    --��ƌv��ԍ��擾�G���[
--vc2RunChkComment := '���������ʉ� 00600';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_ODR_CD, '');
                COMMIT;
            WHEN excGetNewInstCd THEN    --��Ǝw���ԍ��擾�G���[
--vc2RunChkComment := '���������ʉ� 00610';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_OPR_INST_CD, '');
                COMMIT;
            WHEN excGetNewPuchCd THEN    --�����ԍ��擾�G���[
--vc2RunChkComment := '���������ʉ� 00620';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_PUCH_ODR_CD, '');
                COMMIT;
            WHEN excGetVend      THEN    --�����擾�G���[
--vc2RunChkComment := '���������ʉ� 00630';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment := '(SBM0462)'|| OrdWrnMsg_VendCd || BracketS || vc2VendCd || BracketE;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_M_VEND_CTRL, vc2Comment);
                COMMIT;
            WHEN excGetCur       THEN    --�ʉݎ擾�G���[
--vc2RunChkComment := '���������ʉ� 00635';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment := '(SBM0463)'||  OrdWrnMsg_CurCd || BracketS || vc2CurCd || BracketE;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_M_CUR, vc2Comment);
                COMMIT;
            WHEN excGetTax       THEN    --����Ŏ擾�G���[
--vc2RunChkComment := '���������ʉ� 00640';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment :=  '(SBM0464)'|| OrdWrnMsg_TaxCd || BracketS || vc2TaxCd || BracketE;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_NOTEXIST_DATA, vc2Comment);
                COMMIT;
            WHEN excGetRound     THEN    --�[�������G���[
--vc2RunChkComment := '���������ʉ� 00650';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment := OrdWrnMsg_Round;
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
                COMMIT;
            WHEN excJobOdrDel    THEN    --���������Ԃ��폜�ΏۃG���[
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                IF numJobOdrCHK != 1 THEN
                    vc2Comment := '(SBM1699)'  ||  LOGMSG_APS_COM_JOB_ODR || BracketS || vc2JobOdrCdChk || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_JOB_ODR_DEL_FLG, vc2Comment);
                END IF;
                COMMIT;
            WHEN excJobOdrExp    THEN    --���������Ԍv�悪�ύX�G���[
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                IF numJobOdrCHK != 1 THEN
                    vc2Comment := '(SBM1699)'  ||  LOGMSG_APS_COM_JOB_ODR || BracketS || vc2JobOdrCdChk || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_JOB_ODR_EXP_TYP, vc2Comment);
                END IF;
                COMMIT;
            WHEN excJobOdrExp1   THEN    --���������Ԋ�{��񂪕ύX�G���[
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                IF numJobOdrCHK != 1 THEN
                    vc2Comment := '(SBM1699)'  ||  LOGMSG_APS_COM_JOB_ODR || BracketS || vc2JobOdrCdChk || BracketE;
                    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME, APS_COM_JOB_ODR_EXP_TYP1, vc2Comment);
                END IF;
                COMMIT;
            WHEN OTHERS THEN
--vc2RunChkComment := '���������ʉ� 00660';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                ROLLBACK;
                numFatalCnt := numFatalCnt + 1;
                vc2Comment := SUBSTR(SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                                     1,256);
                blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
                COMMIT;
        END;
        ELSE
--vc2RunChkComment := '���������ʉ� 00670';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- �S�s�����ɂ�菈���I��
            EXIT;
        END IF;
/*------------------------------------------------------------
'�@���v�ʃe�[�u���̃J�[�\���I��
'�@���v�ʃe�[�u���̍s�t�F�b�`�i���o��������Main/Loop�̏I�������j
'
-------------------------------------------------------------*/
    END LOOP;
    -- �J�[�\���N���[�Y
    DBMS_SQL.CLOSE_CURSOR(intOdrCursorName);

--vc2RunChkComment := '���������ʉ� 00710';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    -- �I�����b�Z�[�W�̍쐬
    vc2Comment := OrdEndMsg;
    vc2Comment := vc2Comment || OrdEndMsg_TgtCnt || BracketS || numTgtCnt || BracketE || Comma;
    vc2Comment := vc2Comment || OrdEndMsg_DoneCnt || BracketS || numDoneCnt || BracketE || Comma;
    vc2Comment := vc2Comment || OrdEndMsg_WarCnt || BracketS || numWarCnt || BracketE || Comma;
    vc2Comment := vc2Comment || OrdEndMsg_fatalCnt || BracketS || numFatalCnt || BracketE;
    vc2Comment := SUBSTR('(SBM0480)'|| vc2Comment,1,256);
    -- �I�����b�Z�[�W�̏o��
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
    -- TraceLog �̏o��
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
    -- �R�~�b�g
    COMMIT;

    -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
     blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
     COMMIT;

    /* LogFile �� CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
/*------------------------------------------------------------
'�@�����I���i�ُ�I���j�ƂȂ�EXCEPTION
'
'
-------------------------------------------------------------*/
EXCEPTION
    WHEN excMistakeCommonParam  THEN    --���ʂ̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excMistakeCommonParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0481)' || OrdEndMsg || LOGMSG_ERR || '�F���ʂ̓��̓p�����[�^������Ă��܂�',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_COMMON_PARAM, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                           MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excMistakeNativeParam  THEN    --�ŗL�̓��̓p�����[�^���s��
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0482)' || OrdEndMsg || LOGMSG_ERR || '�F�ŗL�̓��̓p�����[�^������Ă��܂�',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_NATIVE_PARAM, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetTempNoDateFound  THEN    --�ʃI�[�_�����i���ԁj��������n���ꂽ�f�[�^������܂���
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0483)' || OrdEndMsg || LOGMSG_ERR || '�F�ʃI�[�_�����i���ԁj��������n���ꂽ�f�[�^������܂���',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_ODRELEASE_T, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        -- LogFile �� CLOSE
        blnRet := FncLogClose(UTL_FileHandle);



    WHEN excOdCalc_Ing  THEN    --���v�ʌv�Z���s��
--DBMS_OUTPUT.PUT_LINE('excOdCalc_Ing');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0484)' || OrdEndMsg || LOGMSG_ERR || '�F���v�ʌv�Z���s���ł�',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OD_CALC_ING, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
--  WHEN excOdMnt_Ing  THEN    --���v�ʃ����e�i���X��
--DBMS_OUTPUT.PUT_LINE('excOdMnt_Ing');
--      ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
--      vc2Comment := SUBSTR('(SBM0485)' || OrdEndMsg || LOGMSG_ERR || '�F���v�ʃ����e�i���X���s���ł�',
--                           1,256);
        -- �I�����b�Z�[�W�̏o��
--      blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
--                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
--                          MY_SQL_NAME, APS_COM_OD_MNT_ING, vc2Comment);
        -- TraceLog �̏o��
--      blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
--                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
--                          MY_SQL_NAME, LOGMSG_END || vc2TraceComment);
--      COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
--       blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
--       COMMIT;
        /* LogFile �� CLOSE */
--      blnRet := FncLogClose(UTL_FileHandle);
    WHEN excGetOdCtrl  THEN    --���v�ʌv�Z����擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetOdCtrl');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0486)' || OrdEndMsg || LOGMSG_ERR || '�F���v�ʌv�Z����擾�G���[',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_OD_CALC_CTPL, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excJobOdCalc_Ing  THEN    --���v�ʌv�Z(����)���s��
--DBMS_OUTPUT.PUT_LINE('excOdCalc_Ing');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0487)' || OrdEndMsg || LOGMSG_ERR || '�F���v�ʌv�Z(����)���s���ł�',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_JOB_OD_CALC_ING, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
       -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excJobOdMnt_Ing  THEN    --���v�ʃ����e�i���X(����)��
--DBMS_OUTPUT.PUT_LINE('excOdMnt_Ing');
        ROLLBACK;
       -- �I�����b�Z�[�W�̍쐬
       vc2Comment := SUBSTR('(SBM0488)' || OrdEndMsg || LOGMSG_ERR || '�F���v�ʃ����e�i���X(����)���s���ł�',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
       blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OD_MNT_ING, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
       -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetJobOdCtrl  THEN    --���v�ʌv�Z����擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetOdCtrl');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0489)' || OrdEndMsg || LOGMSG_ERR || '�F���v�ʌv�Z����(����)�擾�G���[',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_JOB_OD_CALC, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
       -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN excGetMyCompany  THEN    --���Ў擾�G���[
--DBMS_OUTPUT.PUT_LINE('excGetMyCompany');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0490)' || OrdEndMsg || LOGMSG_ERR || '�F���Ў擾�G���[',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_MY_COMPANY, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excPlantWhCd_Null  THEN    --���v�ʑΏەۊǋ�̎擾�G���[
--DBMS_OUTPUT.PUT_LINE('excPlantWhCd_Null');
        ROLLBACK;
        -- �I�����b�Z�[�W�̍쐬
        vc2Comment := SUBSTR('(SBM0491)' || OrdEndMsg || LOGMSG_ERR || '�F���v�ʑΏەۊǋ�̎擾�G���[',
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MRP_TARGET_NOTFOUND, vc2Comment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0492)' || OrdEndMsg || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);
        -- �I�����b�Z�[�W�̏o��
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog �̏o��
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;
        -- �ʃI�[�_�����p�ꎞ�e�[�u���̍폜
         blnRet := FNCDELETET_ODRELEASE_T(pvc2UserId,pvc2SysTime);
         COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
END;
/
