CREATE OR REPLACE PROCEDURE SQLEXPANDBYPATTERN(
/*------------------------------------------------------------------------------
' Copyright (c) 2003-2004 NEC Corporation
' Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlExpandByPattern.sql,v $
'$Author: tai-yanhong $
'$Revision: 1.5 $ $Date: 2013/06/03 08:00:48 $
'
' �@�\      : �p�^�[���ʍ�ƌn��W�J
'
' �߂�l    :
'
'
' ������    : �����ʁi�K�{�j
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             ���v���O�����ŗL�i��Ɛ���������܂��́A��Ɛ����[���͕K�{�j
'             pvc2OprInstStartDate - (i)��Ɛ��������
'             pvc2WorkOdrDlvDate   - (i)��Ɛ����[��
'             pvc2JobOdrCd         - (i)����
'
' �@�\����  : �I�[�_�������ꂽ����I�[�_�ɑ΂��āA�p�^�[���ʂɍ�ƌn��W�J���s���A
'             ��ƌn��ʍ�ƌv��f�[�^���쐬����B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode            IN  VARCHAR2    --�k�n�f���[�h
   ,pvc2OutputMode         IN  VARCHAR2    --�o�̓��[�h
   ,pvc2OutputPath         IN  VARCHAR2    --�o�̓t�@�C���p�X
   ,pvc2OutputName         IN  VARCHAR2    --�o�̓t�@�C����
   ,pvc2UserId             IN  VARCHAR2    --���[�U�h�c
   ,pvc2BusinessName       IN  VARCHAR2    --�Ɩ���
   ,pvc2PlantCd            IN  VARCHAR2    --�H��R�[�h
   ,pvc2OprInstStartDate   IN  VARCHAR2    --��Ɛ��������
   ,pvc2WorkOdrDlvDate     IN  VARCHAR2    --��Ɛ����[��
   ,pvc2JobOdrCd           IN  VARCHAR2    --����
)
IS

/* �J�[�\���̐錾 */

    --�y�H��z
    CURSOR curM_PLANT(
        c_PLANT_CD       VARCHAR2
    ) IS
    SELECT  CAL_NO                   --�J�����_�ԍ�
    FROM    M_PLANT                  --�i��
    WHERE   PLANT_CD = c_PLANT_CD;

    --�y�i�ځz
    CURSOR curM_ITEM(
        c_ITEM_CD       VARCHAR2
    ) IS
    SELECT  UNIT_QTY_TYP             --�݌ɐ��P�ʋ敪
    FROM    M_ITEM                   --�i��
    WHERE   ITEM_CD = c_ITEM_CD;

    --�y�p�^�[���ʍ�ƌn��z
    CURSOR curM_PATTERN_PROC_GRP(
        c_PLANT_CD      VARCHAR2,
        c_ITEM_CD       VARCHAR2,
        c_PATTERN_CD    VARCHAR2
    ) IS
    SELECT  PROC_CD,                  --�i�ڕʍ�ƃR�[�h
            PATTERN_CD,               --�p�^�[���R�[�h
            PROC_NO,                  --��ƌn��ԍ�
            PROC_NAME,                --��Ɩ�
            WS_CD,                    --��Ƌ�R�[�h
            COMPANY_CD,               --��ЃR�[�h
            VEND_CD,                  --��\�����R�[�h
            FIXED_LT,                 --��ƌn��Œ蕪���[�h�^�C��
            PROP_LT,                  --��ƌn���ᕪ���[�h�^�C��
            SAFETY_LT,                --��ƌn����S����
            PROP_LOT_SIZE,            --��ƌn���ᕪ���b�g�T�C�Y
            SPOIL,                    --��ƌn��d�|��
            OUTSIDE_TYP,              --��ƌn����O��敪
            ACPT_INSPC_TYP            --��ƌn���������敪
    FROM    M_PATTERN_PROC_GRP        --�p�^�[���ʍ�ƌn��
    WHERE   PLANT_CD = c_PLANT_CD AND --�H��R�[�h
            ITEM_CD = c_ITEM_CD AND   --�i�ڔԍ�
            PATTERN_CD = c_PATTERN_CD --�p�^�[���R�[�h
    ORDER BY PROC_NO;

    --�y�p�^�[���ʍ�ƌn��-��ƃR�[�h�`�F�b�N�z
    CURSOR curM_PATTERN_PROC_GRP_WS_CD(
        c_PLANT_CD      VARCHAR2,
        c_ITEM_CD       VARCHAR2,
        c_PATTERN_CD    VARCHAR2
    ) IS
    SELECT  WS_CD
    FROM    M_PATTERN_PROC_GRP
    WHERE   OUTSIDE_TYP = 1  AND
            PLANT_CD = c_PLANT_CD AND
            ITEM_CD = c_ITEM_CD AND
            PATTERN_CD = c_PATTERN_CD AND
            PROC_NO IN (SELECT  MIN(PROC_NO)
                        FROM    M_PATTERN_PROC_GRP
                        WHERE   OUTSIDE_TYP = 1  AND
                                PLANT_CD = c_PLANT_CD AND
                                ITEM_CD = c_ITEM_CD AND
                                PATTERN_CD = c_PATTERN_CD
                        GROUP BY PLANT_CD, ITEM_CD, OUTSIDE_TYP, PATTERN_CD
                       );

    --�y�O���P���z�i�y�����z�C�y�ʉ݁z�j
    CURSOR curM_SBCNT_UNIT_COST(
        c_PLANT_CD          VARCHAR2,
        c_COMPANY_CD        VARCHAR2,
        c_VEND_CD           VARCHAR2,
        c_ITEM_CD           VARCHAR2,
        c_PROC_CD           VARCHAR2,
        c_EFF_PHASE_IN_DATE DATE,
        c_SBCNT_SIZE        NUMBER
    ) IS
    SELECT  M_SBCNT_UNIT_COST.UNIT_COST,                --�O���P�� �O���P��
            M_SBCNT_UNIT_COST.UNIT_COST_TYP,            --�O���P�� �O���P���敪
            M_SBCNT_UNIT_COST.PROCESSING_COST,          --�O���P�� �O�����H��
            M_SBCNT_UNIT_COST.MATERIAL_COST,            --�O���P�� �O���ޗ���
            M_SBCNT_UNIT_COST.OTHER_OVERHEADS,          --�O���P�� �O�����̑��o��
            M_VEND_CTRL.ROUND_TYP,                      --�����}�X�^ �������z�܂�ߋ敪
            M_VEND_CTRL.CUR_CD,                         --�����}�X�^ �����ʉ݃R�[�h
            M_CUR.DECIMAL_FIG                           --�ʉ� ��������
    FROM    M_SBCNT_UNIT_COST, M_VEND_CTRL, M_CUR       --�O���P��,�����}�X�^,�ʉ�
    WHERE
            M_SBCNT_UNIT_COST.PLANT_CD = c_PLANT_CD AND --�O���P�� �H��R�[�h
            M_SBCNT_UNIT_COST.COMPANY_CD = c_COMPANY_CD AND
            M_SBCNT_UNIT_COST.VEND_CD = c_VEND_CD AND
            M_SBCNT_UNIT_COST.ITEM_CD = c_ITEM_CD AND
            M_SBCNT_UNIT_COST.PROC_CD = c_PROC_CD AND
            TO_CHAR(M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE, 'YYYYMMDD') <= TO_CHAR(c_EFF_PHASE_IN_DATE, 'YYYYMMDD') AND
            M_SBCNT_UNIT_COST.SBCNT_SIZE <= c_SBCNT_SIZE AND
            M_SBCNT_UNIT_COST.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) AND
            M_SBCNT_UNIT_COST.VEND_CD = M_VEND_CTRL.VEND_CD(+) AND
            M_VEND_CTRL.CUR_CD = M_CUR.CUR_CD(+)
    ORDER BY M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE DESC, M_SBCNT_UNIT_COST.SBCNT_SIZE DESC;

/* ROWTYPE �̐錾 */

    RtpM_PLANT                    curM_PLANT%ROWTYPE;                    --�y�H��z
    RtpM_ITEM                     curM_ITEM%ROWTYPE;                     --�y�i�ځz
    RtpM_PATTERN_PROC_GRP         curM_PATTERN_PROC_GRP%ROWTYPE;         --�y�p�^�[���ʍ�ƌn��z
    RtpM_PATTERN_PROC_GRP_WS_CD   curM_PATTERN_PROC_GRP_WS_CD%ROWTYPE;   --�y�p�^�[���ʍ�ƌn��-��ƃR�[�h�`�F�b�N�z
    RtpM_SBCNT_UNIT_COST          curM_SBCNT_UNIT_COST%ROWTYPE;          --�y�O���P���z�i�y�����z�C�y�ʉ݁z�j

/* �萔�̐錾 */

    MY_SQL_NAME                         VARCHAR2(60)  := 'SQLEXPANDBYPATTERN';
    PROCESS_NOEXPAND                    NUMBER(1)     := 0;   --��ƌn��W�J�σt���O�@���W�J
    WORK_STS_TYP_NOINSTRACT             NUMBER(1)     := 1;   --�i�ڕʍ�Ə�ԋ敪 ���w��
    OPR_RSLT_TYP_PROCESS_PROCEDURE      NUMBER(1)     := 2;   --�i�ڕʍ�Ǝ��ы敪 ��Ǝw������
    UNIT_QTY_TYP_DECIMAL                NUMBER(1)     := 1;   --�i�� �݌ɐ��ʒP�ʋ敪(1:�����Ǘ�)
    UNIT_QTY_TYP_FRACTION               NUMBER(1)     := 2;   --�i�� �݌ɐ��ʒP�ʋ敪(2:�����Ǘ�)
    UNIT_COST_TEMP                      NUMBER(1)     := 1;   --�x���P�� �P���敪(1:���P��)
    UNIT_COST_REGULAR                   NUMBER(1)     := 2;   --�x���P�� �P���敪(2:���P��)
    OUTSIDE_TYP_INNER_MAKE              NUMBER(1)     := 1;   --���O��敪 ����
    OUTSIDE_TYP_BUY                     NUMBER(1)     := 2;   --���O��敪 �O��
    INST_CD_RISE_PROCESS                NUMBER(1)     := 2;   --��Ǝw���`�[ ��Ǝw���ԍ������敪(2:��ƌn���)
    INST_NOISSUE                        NUMBER(1)     := 0;   --��Ǝw���`�[ ��Ǝw���`�[���s�ς݃t���O(0:��)
    FINAL_PROCESS_OFF                   NUMBER(1)     := 0;   --��ƌn��ʎd�| �ŏI�n��t���O(0:��)
    FINAL_PROCESS_ON                    NUMBER(1)     := 1;   --��ƌn��ʎd�| �ŏI�n��t���O(1:�ŏI�o�H)
    PROCESS_EXPAND                      NUMBER(1)     := 1;   --�i�ڕʎd�| ��ƌn��W�J�ς݃t���O(1:�W�J�ς�)

/* EXCEPTION �̐錾 */

    excPLANT_CDE_GET_ERR                EXCEPTION;  --�u�H��R�[�h�v�擾�G���[
    excBUSINESSDATE_GET_ERR             EXCEPTION;  --�u�Ɩ��^�p���v�擾�G���[
    excNEW_INST_CD_GET_ERR              EXCEPTION;  --�u��Ǝw���ԍ��v�擾�G���[
    excWORK_DAY_CALC_ERR                EXCEPTION;  --�u�ғ������Z�o�v�G���[
    excGETROUND_ERR                     EXCEPTION;  --�u�[�������v�G���[
    exc_ERR                             EXCEPTION;  --�u�H���d�|�݌ɊǗ��v�G���[
    excITM_UNIT_QTY_TYP_GET_ERR         EXCEPTION;  --�u�i�ڃf�[�^�v�擾�G���[
    excM_PTN_PROC_GRP_Count_ERR         EXCEPTION;  --�u�p�^�[���ʍ�ƌn��f�[�^�����v�擾�G���[
    excM_PTN_PROC_GRP_GET_ERR           EXCEPTION;  --�u�p�^�[���ʍ�ƌn��f�[�^�v�擾�G���[
    excM_PTN_PROC_GRP_WS_CD_ERR         EXCEPTION;  --�u�ŏ��̓���H���ɍ�Ƌ�R�[�h���ݒ肳��Ă��Ȃ��ꍇ�v�G���[
    excM_WS_PLAN_WS_WH_ERR              EXCEPTION;  --�u��Ƌ�R�[�h����v����[��Ƌ�]."�H��R�[�h"���A[�i�ڕʎd�|]."�H��R�[�h"�ƈ�v���Ȃ��v�G���[
    excM_WS_WH_CD_ERR                   EXCEPTION;  --�u��Ƌ�R�[�h����v����[��Ƌ�]."�ۊǋ�R�[�h"���A�ݒ肳��Ă��Ȃ��v�G���[
    excM_WH_WH_CD_ERR                   EXCEPTION;  --�u��Ƌ�R�[�h����v����[��Ƌ�]."�ۊǋ�R�[�h"����v����A[�ۊǋ�]."�ۊǋ�R�[�h"���A�ݒ肳��Ă��Ȃ��v�G���[
    excM_WH_PLANT_ERR                   EXCEPTION;  --�u�ۊǋ�R�[�h����v����[�ۊǋ�]."�H��R�[�h"���A[�i�ڕʎd�|]."�H��R�[�h"�ƈ�v���Ȃ��v�G���[

/* MESSAGE �̐錾 */

    APS_BATCH_START                     VARCHAR2(28)     := 'ZZ09001';    --�o�b�`�������J�n���܂���
    APS_BATCH_END                       VARCHAR2(28)     := 'ZZ09002';    --�o�b�`�������I�����܂���
    APS_NOTEXIST_M_ITEM                 VARCHAR2(28)     := 'AD50509';    --�i�ڃf�[�^�����݂��܂���
    APS_NOTEXIST_M_PTN_PROC_GRP         VARCHAR2(28)     := 'AD50512';    --��ƌn���񂪑��݂��܂���
    APS_PROC_STARTDATE_INV              VARCHAR2(28)     := 'AD52741';    --��������Ɩ��^�p�����ߋ��ł�
    APS_PROC_LT_INV                     VARCHAR2(28)     := 'AD52742';    --�n�񃊁[�h�^�C�����i�ڃ��[�h�^�C���𒴂��Ă��܂�
    APS_PROC_OPRINSTQTY_INV             VARCHAR2(28)     := 'AD52743';    --�d�����ɂ���Ǝw�������[���ł�
    APS_NOTEXIST_M_PLANT                VARCHAR2(28)     := 'AD00009';    --�w�肳�ꂽ�H��͑��݂��܂���
    APS_NOTEXIST_M_WS                   VARCHAR2(28)     := 'AD00011';    --���n��ɍ�Ƌ�R�[�h���ݒ肳��Ă��܂���
    APS_NOTEXIST_M_WH                   VARCHAR2(28)     := 'AD00013';    --���n��Ɏw�肳��Ă����Ƌ���ɁA�ۊǋ�R�[�h���ݒ肳��Ă��܂���
    APS_FAIL_BUSINESSDATE               VARCHAR2(28)     := 'AD00010';    --�Ɩ��^�p���̎擾�Ɏ��s���܂����B
    APS_DIFF_PLANT_OF_WS                VARCHAR2(28)     := 'AD00012';    --���n��Ɏw�肳��Ă����Ƌ���̍H��R�[�h����v���܂���
    APS_DIFF_PLANT_OF_WH                VARCHAR2(28)     := 'AD00014';    --���n��Ɏw�肳��Ă����Ƌ���ɐݒ肳�ꂽ�ۊǋ�̍H��R�[�h����v���܂���
    APS_DIFF_WS_CD_OF_WH                VARCHAR2(28)     := 'AD00018';    --�ŏ��̓���H���̍�Ƌ�R�[�h�ɑΉ�����ۊǋ悪���݂��܂���
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AD00027';    --���̑��@�d��������

/* LOG �̐錾 */

    LOGMSG_START_PGNM_EXPANDBYPTN       VARCHAR2(104)  := '(SBM0553)<< �p�^�[���ʍ�ƌn��W�J�����J�n >>';
    LOGMSG_END_PGNM_EXPANDBYPTN         VARCHAR2(104)  := '<< �p�^�[���ʍ�ƌn��W�J�����I�� >>';
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --���O�p���\�b�h�J�n�錾
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --���O�p���\�b�h�I���錾
    LOGMSG_ERR                          VARCHAR2(32)   := '�ُ�I��';
    LOGMSG_OPRINST_START_DATE           VARCHAR2(32)   := '������F';
    LOGMSG_WORKODR_DLV_DATE             VARCHAR2(24)   := '�[���F';
    LOGMSG_JOB_ODR_CODE                 VARCHAR2(24)   := '���ԁF';
    LOGMSG_PROCCOUNT                    VARCHAR2(40)  := '���������F';
    LOGMSG_ITEMCD                       VARCHAR2(32)   := '�i�ڔԍ�';
    LOGMSG_BRAKETS                      VARCHAR2(4)   := '[';
    LOGMSG_BRAKETE                      VARCHAR2(4)   := ']';
    LOGMSG_WORKODRCD                    VARCHAR2(48)  := '��ƌv��ԍ�';
    LOGMSG_WORKINPROCCD                 VARCHAR2(56)  := '�d�|��ƃR�[�h';
    LOGMSG_PLANTCD                      VARCHAR2(40)  := '�H��R�[�h';

/* �ϐ��̐錾 SQL */

    intItemCursorName           INTEGER;        --�u�i�ڕʎd�|�v���u���v�ʁv�u�������p�J�[�\���h�c
    vc2Sql                      VARCHAR2(4096); --���I�r�p�k�p
    vc2PBI_WORK_ODR_CD          VARCHAR2(100);   --�i�ڕʎd�| ��ƌv��ԍ�
    vc2PBI_OD_NO                VARCHAR2(100);   --�i�ڕʎd�| �I�[�_�f�}���g�ԍ�
    vc2PBI_ITEM_CD              VARCHAR2(100);   --�i�ڕʎd�| �i�ڔԍ�
    dtmPBI_OPR_INST_START_DATE  DATE;           --�i�ڕʎd�| ��Ɛ��������
    dtmPBI_WORK_ODR_DLV_DATE    DATE;           --�i�ڕʎd�| ��Ɛ����[��
    numPBI_OPR_INST_QTY         NUMBER(18,4);   --�i�ڕʎd�| ��Ǝw����
    numPBI_MODIFY_COUNT         NUMBER(6);      --�i�ڕʎd�| �X�V��
    numOD_ITEM_SPOIL            NUMBER(9,4);    --���v�� ���v�ʕi�ڎd����
    numPlantCalNo               NUMBER;         --�H�� �J�����_�ԍ�
    numITM_UNIT_QTY_TYP         NUMBER(2);      --�i�� �݌ɐ��P�ʋ敪
    vc2PG_PROC_CD               VARCHAR2(100);   --�p�^�[���ʍ�ƌn�� �i�ڕʍ�ƃR�[�h
    numPG_PROC_NO               NUMBER(6);      --�p�^�[���ʍ�ƌn�� ��ƌn��ԍ�
    vc2PG_PROC_NAME             VARCHAR2(160);   --�p�^�[���ʍ�ƌn�� ��Ɩ�
    vc2PG_WS_CD                 VARCHAR2(100);   --�p�^�[���ʍ�ƌn�� ��Ƌ�R�[�h
    vc2PG_COMPANY_CD            VARCHAR2(100);   --�p�^�[���ʍ�ƌn�� ��ЃR�[�h
    vc2PG_VEND_CD               VARCHAR2(100);   --�p�^�[���ʍ�ƌn�� ��\�����R�[�h
    numPG_FIXED_LT              NUMBER(6);      --�p�^�[���ʍ�ƌn�� ��ƌn��Œ蕪���[�h�^�C��
    numPG_PROP_LT               NUMBER(6);      --�p�^�[���ʍ�ƌn�� ��ƌn���ᕪ���[�h�^�C��
    numPG_SAFETY_LT             NUMBER(6);      --�p�^�[���ʍ�ƌn�� ��ƌn����S����
    numPG_PROP_LOT_SIZE         NUMBER(18,4);   --�p�^�[���ʍ�ƌn�� ��ƌn���ᕪ���b�g�T�C�Y
    numPG_SPOIL                 NUMBER(9,4);    --�p�^�[���ʍ�ƌn�� ��ƌn��d�|��
    numPG_OUTSIDE_TYP           NUMBER(2);      --�p�^�[���ʍ�ƌn�� ��ƌn����O��敪
    numPG_ACPT_INSPC_TYP        NUMBER(2);      --�p�^�[���ʍ�ƌn�� ��ƌn���������敪
    numPBP_OPR_INST_QTY         NUMBER(18,4);   --��ƌn��ʎd�| ��Ǝw����
    dtmPBP_WORK_ODR_DLV_DATE    DATE;           --��ƌn��ʎd�| ��ƌn��ʐ����[��
    dtmPBP_OPR_INST_START_DATE  DATE;           --��ƌn��ʎd�| ��ƌn��ʒ����
    numPBP_UNIT_COST_TYP        NUMBER(2);      --��ƌn��ʎd�| �P���敪
    numPBP_UNIT_COST            NUMBER(18,4);   --��ƌn��ʎd�| �P��
    numPBP_PROCESSING_COST      NUMBER(18,4);   --��ƌn��ʎd�| ���H��
    numPBP_MATERIAL_COST        NUMBER(18,4);   --��ƌn��ʎd�| �ޗ���
    numPBP_OTHER_OVERHEADS      NUMBER(18,4);   --��ƌn��ʎd�| ���̑��o��
    numPBP_PUCH_ODR_AMOUNT      NUMBER(18,4);   --��ƌn��ʎd�| �������z
    numPBP_FINAL_PROC_FLG       NUMBER(1);      --��ƌn��ʎd�| �ŏI�n��t���O
    vc2PBP_OPR_INST_CD          VARCHAR2(100);   --��ƌn��ʎd�| ��Ǝw���ԍ�
    vc2OD_PATTERN_CD            VARCHAR2(100);   --���v�� �p�^�[���R�[�h

/* �ϐ��̐錾 WORK */

    UTL_FileHandle              UTL_FILE.FILE_TYPE; --�t�@�C���n���h��
    vc2Comment                  VARCHAR2(1024);      --���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    vc2RunChkComment            VARCHAR2(1024);      --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    blnRet                      BOOLEAN;            --BOOLEAN�^ �ԋp�l
    intRet                      INTEGER;            --INTEGER�^ �ԋp�l
    dtmBusinessOprDate          DATE;               --�Ɩ��^�p���t
    blnStartForward             BOOLEAN;            --����̑O�|���t���O
    dtmActiveDate               DATE;               --�Z�o�ғ���
    numTransactionCount         NUMBER(10);         --��������
    dtmWkStartDate              DATE;               --�v�Z�p��Ǝw����������[�N
    numGrpMinAllowance          NUMBER(18,4);       --��ƌn�񖈍ŏ����e��
    numMinAllowance             NUMBER(18,4);       --�i�ڍŏ����e��
    numGrpWKSpoil               NUMBER(18);         --��ƌn��d����
    numWkOdrInstQty             NUMBER(18,4);       --��Ǝw����
    numWkQty                    NUMBER(18,4);       --�v�j�ʁi�v�Z�p�j
    numWkResultQty              NUMBER(14);         --�v�j�ʁi�ԋp�p�j
    numWkGrpLT                  NUMBER(22);         --�n��̃��[�h�^�C��
    numWkUnitCost               NUMBER(18,4);       --�v�j�P��
    numData                     NUMBER(18,4);       --���ʁ~�P��
    numResultAmount             NUMBER(18,4);       --�v�j�������z
    numM_PATTERN_PROC_GRP_Count NUMBER(10);         --�u�p�^�[���ʍ�ƌn��v�f�[�^��
    numM_PATTERN_PROC_GRP_Index NUMBER(10);         --�u�p�^�[���ʍ�ƌn��v�f�[�^�����ʒu
    vc2WkM_WS_PLANT_CD          VARCHAR2(8);        --��Ƌ� �H��R�[�h
    vc2WkM_WS_WH_CD             VARCHAR2(100);       --��Ƌ� �ۊǋ�R�[�h
    vc2WkM_WH_WH_CD             VARCHAR2(100);       --�ۊǋ� �ۊǋ�R�[�h
    vc2WkM_WH_PLANT_CD          VARCHAR2(8);        --�ۊǋ� �H��R�[�h
    vc2PG_WS_CD_OutsideTipe     VARCHAR2(100);       --�p�^�[���ʍ�ƌn�� ��Ƌ�R�[�h
    numM_PLANT_CD_Count         NUMBER(10);         --�H��f�[�^����
    numM_PROC_WS_Count          NUMBER(10);         --�p�^�[���ʍ�ƌn��-��ƃR�[�h�`�F�b�N����
    numM_WS_PLAN_WS_WH_Count    NUMBER(10);         --��Ƌ�R�[�h����v����[��Ƌ�]."�H��R�[�h"���A[�i�ڕʎd�|]."�H��R�[�h"�ƈ�v���Ȃ�����
    numM_M_WH_WH_CD_Count       NUMBER(10);         --��Ƌ�R�[�h����v����[��Ƌ�]."�ۊǋ�R�[�h"����v����A[�ۊǋ�]."�ۊǋ�R�[�h"���A�ݒ肳��Ă��Ȃ�����
    numM_WH_PLANT_Count         NUMBER(10);         --�ۊǋ�R�[�h����v����[�ۊǋ�]."�H��R�[�h"���A[�i�ڕʎd�|]."�H��R�[�h"�ƈ�v���Ȃ�����
    numOUTSIDE_TYP_Count        NUMBER(10);         --�p�^�[���ʍ�ƌn�񂪑��݂���ꍇ�̓���̐��i�n�񂪑S�Ă��O��̏ꍇ���̔��f�p�j


BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;
    /* LogFile �� OPEN */
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
    /* �J�n���b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_BATCH_START, LOGMSG_START_PGNM_EXPANDBYPTN);
    COMMIT;

/*-----------------------------------------------------------------------------
' �H��R�[�h�`�F�b�N
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    /* �u���������v�̏����� */
    numM_PLANT_CD_Count := 0;
    BEGIN
        SELECT COUNT(*) INTO numM_PLANT_CD_Count
            FROM M_PLANT
            WHERE PLANT_CD = pvc2PlantCd;
        IF numM_PLANT_CD_Count <= 0 THEN
            RAISE excPLANT_CDE_GET_ERR;
        END IF;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excPLANT_CDE_GET_ERR;
        WHEN OTHERS THEN
            RAISE;
    END;
/*-----------------------------------------------------------------------------
' �J�����_�ԍ��̎擾
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    OPEN curM_PLANT(pvc2PlantCd);
    FETCH curM_PLANT INTO numPlantCalNo;             --�J�����_�ԍ�
    IF curM_PLANT%NOTFOUND THEN
        RAISE excPLANT_CDE_GET_ERR;
    END IF;
    CLOSE curM_PLANT;
/*-----------------------------------------------------------------------------
' �Ɩ��^�p���擾
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    blnRet := FncGetBusinessDate(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 dtmBusinessOprDate);
    IF blnRet = FALSE THEN
        RAISE excBUSINESSDATE_GET_ERR;
    END IF;
/*-----------------------------------------------------------------------------
' ���̓p�����[�^�̏����𓮓I�ɂr�p�k��
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    /* �u���������v�̏����� */
    numTransactionCount := 0;
    /* ���o�����ɂ�蓮�I�r�p�k���� */
    intItemCursorName := DBMS_SQL.OPEN_CURSOR;
    vc2Sql := 'SELECT';
    vc2Sql := vc2Sql || ' T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD';            --1 ��ƌv��ԍ�
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.OD_NO';                  --2 �I�[�_�f�}���g�ԍ�
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.ITEM_CD';                --3 �i�ڔԍ�
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.OPR_INST_START_DATE';    --4 ��Ɛ��������
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE';      --5 ��Ɛ����[��
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY';           --6 ��Ǝw����
    vc2Sql := vc2Sql || ',T_OD.ITEM_SPOIL';                               --7 ���v�ʕi�ڎd����
    vc2Sql := vc2Sql || ',T_WORK_IN_PROC_BY_ITEM.MODIFY_COUNT';           --8 �X�V��
    vc2Sql := vc2Sql || ',T_OD.PATTERN_CD';                               --9 �p�^�[���R�[�h
    vc2Sql := vc2Sql || ' FROM T_WORK_IN_PROC_BY_ITEM, T_OD';
    vc2Sql := vc2Sql || ' WHERE';
    vc2Sql := vc2Sql || ' T_OD.OD_NO = T_WORK_IN_PROC_BY_ITEM.OD_NO(+)';
    vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.PLANT_CD = ''' || pvc2PlantCd || '''';
    /* �u��Ɛ����[���v���w�肳��Ă���ꍇ */
    IF pvc2WorkOdrDlvDate IS NOT NULL THEN
        vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE <= TO_DATE(''' || pvc2WorkOdrDlvDate || ' 23:59:59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
    END IF;
    /* �u��Ɛ���������v���w�肳��Ă���ꍇ */
    IF pvc2OprInstStartDate IS NOT NULL THEN
        vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.OPR_INST_START_DATE <= TO_DATE(''' || pvc2OprInstStartDate || ' 23:59:59' || ''',''yyyy/mm/dd hh24:mi:ss'')';
    END IF;
    /* �u���ԁv���w�肳��Ă���ꍇ */
    IF pvc2JobOdrCd IS NOT NULL THEN
        IF INSTR(pvc2JobOdrCd, '%', 1) <= 0 THEN
            vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_CD = ''' || pvc2JobOdrCd || '''';
        ELSE
            vc2Sql := vc2Sql || ' AND T_OD.JOB_ODR_CD LIKE ''' || pvc2JobOdrCd || '''';
        END IF;
    END IF;
    /* �u�i�ڕʍ�Ə�ԋ敪�v = ���w��(1) */
    vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.WORK_STS_TYP = ' || WORK_STS_TYP_NOINSTRACT;
    /* �u��ƌn��W�J�σt���O�v = ���W�J(0) */
    vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.PROC_EXPLOSION_FLG = ' || PROCESS_NOEXPAND;
    /* �u�i�ڕʍ�Ǝ��ы敪�v = ��Ǝw������(2) */
    vc2Sql := vc2Sql || ' AND T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP = ' || OPR_RSLT_TYP_PROCESS_PROCEDURE;
    /* �u�p�^�[���R�[�h�v != Null */
    vc2Sql := vc2Sql || ' AND T_OD.PATTERN_CD is not Null ';
/*-----------------------------------------------------------------------------
' ���I�r�p�k�̓��e���g���[�X�ɏo��
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
     --TraceLog �̏o�́i���s�ʒu�j
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,1,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,201,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,401,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,601,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,801,200));
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END || 'SQL:' || SUBSTR(vc2Sql,1001,200));
/*-----------------------------------------------------------------------------
' ���I�r�p�k�̉��
' ��̒�`
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    /* �r�p�k����� */
    DBMS_SQL.PARSE(intItemCursorName, vc2Sql, DBMS_SQL.NATIVE);
    /* ���` */
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,1,vc2PBI_WORK_ODR_CD,100);      --�i�ڕʎd�| ��ƌv��ԍ�
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,2,vc2PBI_OD_NO,100);            --�i�ڕʎd�| �I�[�_�f�}���g�ԍ�
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,3,vc2PBI_ITEM_CD,100);          --�i�ڕʎd�| �i�ڔԍ�
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,4,dtmPBI_OPR_INST_START_DATE); --�i�ڕʎd�| ��Ɛ��������
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,5,dtmPBI_WORK_ODR_DLV_DATE);   --�i�ڕʎd�| ��Ɛ����[��
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,6,numPBI_OPR_INST_QTY);        --�i�ڕʎd�| ��Ǝw����
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,7,numOD_ITEM_SPOIL);           --���v��     ���v�ʕi�ڎd����
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,8,numPBI_MODIFY_COUNT);        --�i�ڕʎd�| �X�V��
    DBMS_SQL.DEFINE_COLUMN(intItemCursorName,9,vc2OD_PATTERN_CD,100);        --���v�� �p�^�[���R�[�h
/*-----------------------------------------------------------------------------
' �J�[�\�����s
' �s�t�F�b�`�i���o��������Main/Loop�����j
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    /* �J�[�\�����s */
    intRet := DBMS_SQL.EXECUTE(intItemCursorName);
    /* �s�t�F�b�` */
    LOOP
        IF DBMS_SQL.FETCH_ROWS(intItemCursorName) > 0 THEN
        BEGIN
--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            /* �t�F�b�`�����l�̎擾 */
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,1,vc2PBI_WORK_ODR_CD);          --�i�ڕʎd�| ��ƌv��ԍ�
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,2,vc2PBI_OD_NO);                --�i�ڕʎd�| �I�[�_�f�}���g�ԍ�
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,3,vc2PBI_ITEM_CD);              --�i�ڕʎd�| �i�ڔԍ�
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,4,dtmPBI_OPR_INST_START_DATE);  --�i�ڕʎd�| ��Ɛ��������
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,5,dtmPBI_WORK_ODR_DLV_DATE);    --�i�ڕʎd�| ��Ɛ����[��
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,6,numPBI_OPR_INST_QTY);         --�i�ڕʎd�| ��Ǝw����
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,7,numOD_ITEM_SPOIL);            --���v��     ���v�ʕi�ڎd����
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,8,numPBI_MODIFY_COUNT);         --�i�ڕʎd�| �X�V��
            DBMS_SQL.COLUMN_VALUE(intItemCursorName,9,vc2OD_PATTERN_CD);            --���v�� �p�^�[���R�[�h
/*-----------------------------------------------------------------------------
' �v�Z�Ɏg�p����l�����ꂼ�ꃁ�����ϐ��ɓ]�L����
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            /* ��Ɛ�����������[�N�ɕi�ڕʎd�|�̍�Ɛ����������]�L */
            dtmWkStartDate := dtmPBI_OPR_INST_START_DATE;
            /* �i�ڍŏ����e�ʁ��i�ڕʎd�|.��Ǝw�����^�i�P�{�i���v��.���v�ʕi�ڎd�����^100�j�j*/
            numMinAllowance := TRUNC(numPBI_OPR_INST_QTY / (1 + (numOD_ITEM_SPOIL / 100)), 4);
            /* ��ƌn��d�����̏������i�[���j*/
            numGrpWKSpoil := 0;
            /* ��Ǝw�������[�N�ɕi�ڕʎd�|�̍�Ǝw������]�L */
            numWkOdrInstQty := numPBI_OPR_INST_QTY;
/*-----------------------------------------------------------------------------
' �i�ڃf�[�^����
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            OPEN curM_ITEM(vc2PBI_ITEM_CD);
            FETCH curM_ITEM INTO numITM_UNIT_QTY_TYP;  --�݌ɐ��P�ʋ敪
            IF curM_ITEM%NOTFOUND THEN
                RAISE excITM_UNIT_QTY_TYP_GET_ERR;
            END IF;
            CLOSE curM_ITEM;
/*-----------------------------------------------------------------------------
' �p�^�[���ʍ�ƌn��f�[�^��������
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            SELECT COUNT(*) INTO numM_PATTERN_PROC_GRP_Count
                FROM M_PATTERN_PROC_GRP
                WHERE ITEM_CD = vc2PBI_ITEM_CD
                    and PLANT_CD = pvc2PlantCd
                    and PATTERN_CD = vc2OD_PATTERN_CD;
            IF numM_PATTERN_PROC_GRP_Count <= 0 THEN
                RAISE excM_PTN_PROC_GRP_Count_ERR;
            END IF;
/*-----------------------------------------------------------------------------
' �p�^�[���ʍ�ƌn��f�[�^����
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            /* �u�p�^�[���ʍ�ƌn��v�f�[�^�����ʒu������ */
            numM_PATTERN_PROC_GRP_Index := 0;
            OPEN curM_PATTERN_PROC_GRP(pvc2PlantCd,
                               vc2PBI_ITEM_CD,
                               vc2OD_PATTERN_CD);
            FETCH curM_PATTERN_PROC_GRP INTO RtpM_PATTERN_PROC_GRP;
            /* �p�^�[���ʍ�ƌn��f�[�^�����݂��Ȃ��ꍇ */
            IF curM_PATTERN_PROC_GRP%NOTFOUND THEN
                RAISE excM_PTN_PROC_GRP_GET_ERR;
            ELSE
/*-----------------------------------------------------------------------------
' �S�ĊO��̏ꍇ�́A��Ƌ�R�[�h���̃`�F�b�N�͍s��Ȃ��B
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                /* ����H�������݂��邩�ۂ� */
                numOUTSIDE_TYP_Count := 0;
                SELECT count(*) INTO numOUTSIDE_TYP_Count
                    FROM  M_PATTERN_PROC_GRP
                    WHERE OUTSIDE_TYP = 1
                    AND PLANT_CD = pvc2PlantCd
                    AND ITEM_CD = vc2PBI_ITEM_CD
                    AND PATTERN_CD = vc2OD_PATTERN_CD;
                IF numOUTSIDE_TYP_Count > 0 THEN
/*-----------------------------------------------------------------------------
' �ŏ��̓���H���ɍ�Ƌ�R�[�h���ݒ肳��Ă��Ȃ��ꍇ�G���[
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    OPEN curM_PATTERN_PROC_GRP_WS_CD(pvc2PlantCd,
                                             vc2PBI_ITEM_CD,
                                             vc2OD_PATTERN_CD);
                    FETCH curM_PATTERN_PROC_GRP_WS_CD INTO RtpM_PATTERN_PROC_GRP_WS_CD;
                    /* ��Ƌ�R�[�h���ݒ肳��Ă��Ȃ��ꍇ */
                    IF RtpM_PATTERN_PROC_GRP_WS_CD.WS_CD IS null THEN
                        RAISE excM_PTN_PROC_GRP_WS_CD_ERR;
                    ELSE
                        vc2PG_WS_CD_OutsideTipe  :=  RtpM_PATTERN_PROC_GRP_WS_CD.WS_CD;
                    END IF;
                    CLOSE curM_PATTERN_PROC_GRP_WS_CD;
/*-----------------------------------------------------------------------------
' ��Ƌ�R�[�h����v����[��Ƌ�]."�H��R�[�h"���A[�i�ڕʎd�|]."�H��R�[�h"��
' ��v���Ȃ��ꍇ�G���[
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numM_WS_PLAN_WS_WH_Count := 0;
                    SELECT COUNT(*) INTO numM_WS_PLAN_WS_WH_Count
                        FROM M_WS
                        WHERE WS_CD = vc2PG_WS_CD_OutsideTipe;
                    IF numM_WS_PLAN_WS_WH_Count <= 0 THEN
                        RAISE excM_WS_PLAN_WS_WH_ERR;
                    END IF;
--vc2RunChkComment := '���������ʉ� 00160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    SELECT PLANT_CD, WH_CD
                        INTO vc2WkM_WS_PLANT_CD, vc2WkM_WS_WH_CD
                        FROM M_WS
                        WHERE WS_CD = vc2PG_WS_CD_OutsideTipe;
                    IF pvc2PlantCd != vc2WkM_WS_PLANT_CD THEN
                        RAISE excM_WS_PLAN_WS_WH_ERR;
                    END IF;
/*-----------------------------------------------------------------------------
' ��Ƌ�R�[�h����v����[��Ƌ�]."�ۊǋ�R�[�h"���A�ݒ肳��Ă��Ȃ��ꍇ�G���[
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00170';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    SELECT PLANT_CD, WH_CD
                        INTO vc2WkM_WS_PLANT_CD, vc2WkM_WS_WH_CD
                        FROM M_WS
                        WHERE WS_CD = vc2PG_WS_CD_OutsideTipe;
                    IF vc2WkM_WS_WH_CD IS NULL THEN
                        RAISE excM_WS_WH_CD_ERR;
                    END IF;
/*-----------------------------------------------------------------------------
' ��Ƌ�R�[�h����v����[��Ƌ�]."�ۊǋ�R�[�h"����v����A
' [�ۊǋ�]."�ۊǋ�R�[�h"���A�ݒ肳��Ă��Ȃ��ꍇ�G���[
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00180';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numM_M_WH_WH_CD_Count := 0;
                    SELECT COUNT(*) INTO numM_M_WH_WH_CD_Count
                        FROM M_WH
                        WHERE WH_CD = vc2WkM_WS_WH_CD;
                    IF numM_M_WH_WH_CD_Count <= 0 THEN
                        RAISE excM_WH_WH_CD_ERR;
                    END IF;
--vc2RunChkComment := '���������ʉ� 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    SELECT WH_CD
                        INTO vc2WkM_WH_WH_CD
                        FROM M_WH
                        WHERE WH_CD = vc2WkM_WS_WH_CD;
                    IF vc2WkM_WH_WH_CD = NULL THEN
                        RAISE excM_WH_WH_CD_ERR;
                    END IF;
/*-----------------------------------------------------------------------------
' �ۊǋ�R�[�h����v����[�ۊǋ�]."�H��R�[�h"���A[�i�ڕʎd�|]."�H��R�[�h"��
' ��v���Ȃ��ꍇ�G���[
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00200';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numM_WH_PLANT_Count := 0;
                    SELECT COUNT(*) INTO numM_WH_PLANT_Count
                        FROM M_WH
                        WHERE WH_CD = vc2WkM_WS_WH_CD;
                    IF numM_WH_PLANT_Count <= 0 THEN
                        RAISE excM_WH_PLANT_ERR;
                    END IF;
--vc2RunChkComment := '���������ʉ� 00210';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    SELECT PLANT_CD
                        INTO vc2WkM_WH_PLANT_CD
                        FROM M_WH
                        WHERE WH_CD = vc2WkM_WS_WH_CD;
                    IF pvc2PlantCd != vc2WkM_WH_PLANT_CD THEN
                        RAISE excM_WH_PLANT_ERR;
                    END IF;
                END IF;
/*-----------------------------------------------------------------------------
' �u�Ɩ��^�p���t�v���u��Ɛ���������v�̎����[�j���O
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00220';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                IF TO_CHAR(dtmBusinessOprDate, 'YYYYMMDD') > TO_CHAR(dtmPBI_OPR_INST_START_DATE, 'YYYYMMDD') THEN
                    /* ���[�j���O���b�Z�[�W�̍쐬 */
                    vc2Comment := SUBSTR('(SBM0496)'|| LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                         1,256);
                    /* ���[�j���O���b�Z�[�W�̏o�� */
                    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                        MY_SQL_NAME, APS_PROC_STARTDATE_INV, vc2Comment);
                END IF;
/*-----------------------------------------------------------------------------
' �p�^�[���ʍ�ƌn��f�[�^LOOP
'
-----------------------------------------------------------------------------*/
                LOOP
--vc2RunChkComment := '���������ʉ� 00230';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    /* �p�^�[���ʍ�ƌn��f�[�^�̂d�n�e */
                    EXIT WHEN curM_PATTERN_PROC_GRP%NOTFOUND;
                    /* �u�p�^�[���ʍ�ƌn��v�f�[�^�����ʒu */
                    numM_PATTERN_PROC_GRP_Index := numM_PATTERN_PROC_GRP_Index + 1;
                    /* �擾�f�[�^�̑Ҕ� */
                    vc2PG_PROC_CD := RtpM_PATTERN_PROC_GRP.PROC_CD;                 --�i�ڕʍ�ƃR�[�h
                    numPG_PROC_NO := RtpM_PATTERN_PROC_GRP.PROC_NO;                 --��ƌn��ԍ�
                    vc2PG_PROC_NAME := RtpM_PATTERN_PROC_GRP.PROC_NAME;             --��Ɩ�
                    vc2PG_WS_CD := RtpM_PATTERN_PROC_GRP.WS_CD;                     --��Ƌ�R�[�h
                    vc2PG_COMPANY_CD := RtpM_PATTERN_PROC_GRP.COMPANY_CD;           --��ЃR�[�h
                    vc2PG_VEND_CD := RtpM_PATTERN_PROC_GRP.VEND_CD;                 --��\�����R�[�h
                    numPG_FIXED_LT := RtpM_PATTERN_PROC_GRP.FIXED_LT;               --��ƌn��Œ蕪���[�h�^�C��
                    numPG_PROP_LT := RtpM_PATTERN_PROC_GRP.PROP_LT;                 --��ƌn���ᕪ���[�h�^�C��
                    numPG_SAFETY_LT := RtpM_PATTERN_PROC_GRP.SAFETY_LT;             --��ƌn����S����
                    numPG_PROP_LOT_SIZE := RtpM_PATTERN_PROC_GRP.PROP_LOT_SIZE;     --��ƌn���ᕪ���b�g�T�C�Y
                    numPG_SPOIL := RtpM_PATTERN_PROC_GRP.SPOIL;                     --��ƌn��d�|��
                    numPG_OUTSIDE_TYP := RtpM_PATTERN_PROC_GRP.OUTSIDE_TYP;         --��ƌn����O��敪
                    numPG_ACPT_INSPC_TYP := RtpM_PATTERN_PROC_GRP.ACPT_INSPC_TYP;   --��ƌn���������敪
/*-----------------------------------------------------------------------------
' ��ƌn�񖈍ŏ����e�ʂ̌v�Z
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00240';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numGrpMinAllowance := TRUNC(numWkOdrInstQty / (1 + (numGrpWKSpoil / 100)), 4);
                    /* �i�ڍŏ����e�� �� ��ƌn�񖈍ŏ����e�� */
                    IF numMinAllowance > numGrpMinAllowance THEN
--vc2RunChkComment := '���������ʉ� 00250';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* �i��.�݌ɐ��P�ʋ敪 �� �����Ǘ�(1) */
                        IF numITM_UNIT_QTY_TYP = UNIT_QTY_TYP_DECIMAL THEN
                            numMinAllowance := TRUNC(numMinAllowance);
                        END IF;
                        /* ��Ǝw�����̃������ϐ��ɕi�ڍŏ����e�ʂ�]�L���� */
                        numWkOdrInstQty := numMinAllowance;
                        /* ��ƌn��ʎd�|�̍�Ǝw�����͕i�ڍŏ����e�ʂƂ��� */
                        numPBP_OPR_INST_QTY := numMinAllowance;
                    /* �i�ڍŏ����e�� �� ��ƌn�񖈍ŏ����e�� */
                    ELSE
--vc2RunChkComment := '���������ʉ� 00260';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* �i��.�݌ɐ��P�ʋ敪 �� �����Ǘ�(1) */
                        IF numITM_UNIT_QTY_TYP = UNIT_QTY_TYP_DECIMAL THEN
                            numGrpMinAllowance := TRUNC(numGrpMinAllowance);
                        END IF;
                        /* ��Ǝw�����̃������ϐ��ɍ�ƌn�񖈍ŏ����e�ʂ�]�L���� */
                        numWkOdrInstQty := numGrpMinAllowance;
                        /* ��ƌn��ʎd�|�̍�Ǝw�����͍�ƌn�񖈍ŏ����e�ʂƂ��� */
                        numPBP_OPR_INST_QTY := numGrpMinAllowance;
                    END IF;
/*-----------------------------------------------------------------------------
' ��ƌn��ʎd�|�̍�Ǝw�������[���̏ꍇ�A���[�j���O
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00270';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    IF numPBP_OPR_INST_QTY = 0 THEN
--vc2RunChkComment := '���������ʉ� 00280';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* ���[�j���O���b�Z�[�W�̍쐬 */
                        vc2Comment := SUBSTR('(SBM0557)'|| LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE ||
                                             LOGMSG_WORKINPROCCD || LOGMSG_BRAKETS || vc2PG_PROC_CD || LOGMSG_BRAKETE,
                                             1,256);
                        /* ���[�j���O���b�Z�[�W�̏o�� */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                            MY_SQL_NAME, APS_PROC_OPRINSTQTY_INV, vc2Comment);
                    END IF;
/*-----------------------------------------------------------------------------
' �n��̃��[�h�^�C���v�Z
' �n��k�s�� �p�^�[���ʍ�ƌn��.��ƌn��Œ蕪�k�s
'            �{�i��Ǝw�����^�p�^�[���ʍ�ƌn��.��ƌn���ᕪ�k�r)
'            �~ �p�^�[���ʍ�ƌn��.��ƌn���ᕪ�k�s
'            �{ �p�^�[���ʍ�ƌn��.��ƌn����S����
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00290';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    /* ��Ǝw�����̃������ϐ��@�^�@�p�^�[���ʍ�ƌn��.��ƌn���ᕪ���b�g�T�C�Y */
                    numWkQty := TRUNC(numWkOdrInstQty / numPG_PROP_LOT_SIZE, 4);
                    /* �؂�グ */
                    IF numWkQty = TRUNC(numWkQty) THEN
--vc2RunChkComment := '���������ʉ� 00300';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* �����l�̏ꍇ�͂��̂܂� */
                        numWkResultQty := numWkQty;
                    ELSE
--vc2RunChkComment := '���������ʉ� 00310';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* �����l�̏ꍇ�͐؏グ���s�������ɕϊ����� */
                        numWkResultQty := TRUNC(numWkQty) + 1;
                    END IF;
--vc2RunChkComment := '���������ʉ� 00320';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    numWkGrpLT := numPG_FIXED_LT +
                                 (numWkResultQty) * numPG_PROP_LT +
                                 numPG_SAFETY_LT;
/*-----------------------------------------------------------------------------
' �n��ʔ[���̌v�Z
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���������ʉ� 00330';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    blnStartForward := true;
                    --�Z�o�ғ��� dtmActiveDate �̎擾   ------FncWorkDayCalc-------
                    blnRet := FNCWORKDAYCALC(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,vc2PBI_ITEM_CD,
                                 dtmWkStartDate, numWkGrpLT, blnStartForward, dtmActiveDate);
                    IF blnRet = FALSE THEN
                        RAISE excWORK_DAY_CALC_ERR;
                    END IF;
--vc2RunChkComment := '���������ʉ� 00340';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    /* ��ƌn��ʎd�|.��ƌn��ʒ�����̌��� */
                    dtmPBP_OPR_INST_START_DATE := dtmWkStartDate;
/*-----------------------------------------------------------------------------
' �i�ڕʎd�|�̐����[�������x���Ȃ�ꍇ���[�j���O
'
-----------------------------------------------------------------------------*/
                    IF TO_CHAR(dtmActiveDate, 'YYYYMMDD') > TO_CHAR(dtmPBI_WORK_ODR_DLV_DATE, 'YYYYMMDD') THEN
--vc2RunChkComment := '���������ʉ� 00350';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* �n��ʐ����[���͕i�ڕʎd�|�̐����[���Ƃ��� */
                        dtmPBP_WORK_ODR_DLV_DATE := dtmPBI_WORK_ODR_DLV_DATE;
                        /* ��Ǝw���[���̃Z�[�u */
                        dtmWkStartDate := dtmPBI_WORK_ODR_DLV_DATE;
                        /* ���[�j���O���b�Z�[�W�̍쐬 */
                        vc2Comment := SUBSTR('(SBM0558)'||LOGMSG_ITEMCD || LOGMSG_BRAKETS || vc2PBI_ITEM_CD || LOGMSG_BRAKETE ||
                                             LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE ||
                                             LOGMSG_WORKINPROCCD || LOGMSG_BRAKETS || vc2PG_PROC_CD || LOGMSG_BRAKETE,
                                             1,256);
                        /* ���[�j���O���b�Z�[�W�̏o�� */
                        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                            MY_SQL_NAME, APS_PROC_LT_INV, vc2Comment);
/*-----------------------------------------------------------------------------
' �i�ڕʎd�|�̐����[�����������Ȃ�ꍇ
'
-----------------------------------------------------------------------------*/
                    ELSE
--vc2RunChkComment := '���������ʉ� 00360';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* �ŏI�n��i��ƌn��f�[�^�̍ŏI���R�[�h�̎��j */
                        IF numM_PATTERN_PROC_GRP_Count = numM_PATTERN_PROC_GRP_Index THEN
--vc2RunChkComment := '���������ʉ� 00370';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            /* �n��ʐ����[���͕i�ڕʎd�|�̐����[���Ƃ��� */
                            dtmPBP_WORK_ODR_DLV_DATE := dtmPBI_WORK_ODR_DLV_DATE;
                        ELSE
--vc2RunChkComment := '���������ʉ� 00380';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            /* �n��ʐ����[���͎Z�o���������[���Ƃ��� */
                            dtmPBP_WORK_ODR_DLV_DATE := dtmActiveDate;
                            /* ��Ǝw���[���̃Z�[�u */
                            dtmWkStartDate := dtmActiveDate;
                        END IF;
                    END IF;
/*-----------------------------------------------------------------------------
' ����̏ꍇ�̏���
'
-----------------------------------------------------------------------------*/
                     IF vc2PG_VEND_CD IS NULL THEN   --�p�^�[���ʍ�ƌn��.��\�����R�[�h
--vc2RunChkComment := '���������ʉ� 00390';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        numPBP_UNIT_COST_TYP := UNIT_COST_TEMP;     --��ƌn��ʎd�| �P���敪 �� ���P��(1)
                        numPBP_UNIT_COST := 0;                      --��ƌn��ʎd�| �P��
                        numPBP_PROCESSING_COST := 0;                --��ƌn��ʎd�| ���H��
                        numPBP_MATERIAL_COST := 0;                  --��ƌn��ʎd�| �ޗ���
                        numPBP_OTHER_OVERHEADS := 0;                --��ƌn��ʎd�| ���̑��o��
                    numPBP_PUCH_ODR_AMOUNT := 0;                --��ƌn��ʎd�| �������z
/*-----------------------------------------------------------------------------
' �O��̏ꍇ�̏���
' �O���P���f�[�^�C�����f�[�^�C�ʉ݃f�[�^����
'
-----------------------------------------------------------------------------*/
                    ELSE
--vc2RunChkComment := '���������ʉ� 00400';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        OPEN curM_SBCNT_UNIT_COST(
                                                  pvc2PlantCd,
                                                  vc2PG_COMPANY_CD,
                                                  vc2PG_VEND_CD,
                                                  vc2PBI_ITEM_CD,
                                                  vc2PG_PROC_CD,
                                                  dtmPBP_OPR_INST_START_DATE,
                                                  numWkOdrInstQty);
                        FETCH curM_SBCNT_UNIT_COST INTO RtpM_SBCNT_UNIT_COST;
                        /* �Y������O���P���f�[�^�����݂��Ȃ��ꍇ */
                         IF curM_SBCNT_UNIT_COST%NOTFOUND THEN
--vc2RunChkComment := '���������ʉ� 00410';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            numPBP_UNIT_COST_TYP := UNIT_COST_TEMP; --��ƌn��ʎd�| �P���敪 �� ���P��(1)
                            numPBP_UNIT_COST := 0;                  --��ƌn��ʎd�| �P��
                            numPBP_PROCESSING_COST := 0;            --��ƌn��ʎd�| ���H��
                            numPBP_MATERIAL_COST := 0;              --��ƌn��ʎd�| �ޗ���
                            numPBP_OTHER_OVERHEADS := 0;            --��ƌn��ʎd�| ���̑��o��
                            numPBP_PUCH_ODR_AMOUNT := 0;            --��ƌn��ʎd�| �������z
                        /* �O���P���f�[�^�����݂���ꍇ */
                        ELSE
--vc2RunChkComment := '���������ʉ� 00420';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            /* �擾�f�[�^�̑Ҕ� */
                            numPBP_UNIT_COST_TYP   := RtpM_SBCNT_UNIT_COST.UNIT_COST_TYP;       --��ƌn��ʎd�| �P���敪   �� �O���P�� �O���P���敪
                            numPBP_UNIT_COST       := RtpM_SBCNT_UNIT_COST.UNIT_COST;           --��ƌn��ʎd�| �P��       �� �O���P�� �O���P��
                            numWkUnitCost          := RtpM_SBCNT_UNIT_COST.UNIT_COST;           --�v�j�P��                  �� �O���P�� �O���P��
                            numPBP_PROCESSING_COST := RtpM_SBCNT_UNIT_COST.PROCESSING_COST;     --��ƌn��ʎd�| ���H��     �� �O���P�� �O�����H��
                            numPBP_MATERIAL_COST   := RtpM_SBCNT_UNIT_COST.MATERIAL_COST;       --��ƌn��ʎd�| �ޗ���     �� �O���P�� �O���ޗ���
                            numPBP_OTHER_OVERHEADS := RtpM_SBCNT_UNIT_COST.OTHER_OVERHEADS;     --��ƌn��ʎd�| ���̑��o�� �� �O���P�� �O�����̑��o��
                            numPBP_PUCH_ODR_AMOUNT := 0;                                        --��ƌn��ʎd�| �������z   �� 0
                            /* �����f�[�^�����݂���ꍇ�͊ۂߏ������s�� */
                            IF RtpM_SBCNT_UNIT_COST.ROUND_TYP IS NOT NULL THEN
--vc2RunChkComment := '���������ʉ� 00430';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                                --numData := TRUNC(numWkOdrInstQty * numWkUnitCost, 4);
                                blnRet := FncGetRound(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                                      numWkOdrInstQty * numWkUnitCost,  --(i)�[�������O�̒l
                                                      RtpM_SBCNT_UNIT_COST.DECIMAL_FIG, --(i)��������
                                                      RtpM_SBCNT_UNIT_COST.ROUND_TYP,   --(i)�[�������敪
                                                      numResultAmount);                 --(o)�[��������̒l
                                IF blnRet = FALSE THEN
                                    RAISE excGETROUND_ERR;
                                END IF;
                                /* �ۂ߂̌��ʂ𔭒����z�ɔ��f���� */
                                numPBP_PUCH_ODR_AMOUNT := numResultAmount;
                            END IF;
                        END IF;
                        CLOSE curM_SBCNT_UNIT_COST;
                    END IF;
/*-----------------------------------------------------------------------------
' �p�^�[���ʍ�ƌn��.��ƌn��ʎ��ы敪����ƌn�񖈂Ɏ��т��グ��(1) ����
' �p�^�[���ʍ�ƌn��.��ƌn����O��敪������(1)
' ��Ǝw���`�[���쐬����
'
-----------------------------------------------------------------------------*/
                    IF numPG_OUTSIDE_TYP = OUTSIDE_TYP_INNER_MAKE THEN
--vc2RunChkComment := '���������ʉ� 00440';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* ��Ǝw���ԍ����擾���� */
                        blnRet := FncGetNewInstCd(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                      pvc2UserId, pvc2BusinessName, pvc2PlantCd, vc2PBP_OPR_INST_CD);
                        IF blnRet = FALSE THEN
                            RAISE excNEW_INST_CD_GET_ERR;
                        END IF;
--vc2RunChkComment := '����Ǝw���`�[���쐬����';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        /* ��Ǝw���`�[���쐬���� */
                        INSERT INTO T_OPR_INST_SLIP(
                             OPR_INST_CD                --��Ǝw���ԍ�
                            ,OPR_INST_CD_GNR_TYP        --��Ǝw���ԍ������敪
                            ,OPR_INST_SLIP_ISS_DATE     --��Ǝw���`�[���s��
                            ,OPR_INST_SLIP_ISS_FLG      --��Ǝw���`�[���s�ς݃t���O
                            ,PLANT_CD                   --�H��R�[�h
                            ,CREATED_DATE               --�쐬��
                            ,CREATED_BY                 --�쐬��
                            ,CREATED_PRG_NM             --�쐬�v���O������
                            ,UPDATED_DATE               --�X�V��
                            ,UPDATED_BY                 --�X�V��
                            ,UPDATED_PRG_NM             --�X�V�v���O������
                            ,MODIFY_COUNT               --�X�V��
                        ) VALUES (
                             vc2PBP_OPR_INST_CD         --��Ǝw���ԍ�
                            ,INST_CD_RISE_PROCESS       --��Ǝw���ԍ������敪�i2�F��ƌn��j
                            ,NULL                       --��Ǝw���`�[���s��
                            ,INST_NOISSUE               --��Ǝw���`�[���s�ς݃t���O�i0�F�n�����j
                            ,pvc2PlantCd                --�H��R�[�h
                            ,SYSDATE                    --�쐬��
                            ,pvc2UserId                 --�쐬��
                            ,MY_SQL_NAME                --�쐬�v���O������
                            ,SYSDATE                    --�X�V��
                            ,pvc2UserId                 --�X�V��
                            ,MY_SQL_NAME                --�X�V�v���O������
                            ,0                          --�X�V��
                            );
                    /* ��L�ȊO */
                    ELSE
                        vc2PBP_OPR_INST_CD := NULL;
                    END IF;
/*-----------------------------------------------------------------------------
' ��ƌn��ʎd�|�f�[�^�̐ݒ�l�ݒ�
'
-----------------------------------------------------------------------------*/
                    /* �����R�[�h �� NULL �ł���΁A��ЃR�[�h �� NULL �ɂ��� */
                    IF vc2PG_VEND_CD IS NULL THEN
                    vc2PG_COMPANY_CD := NULL;
                    END IF;
                    /* �ŏI�n��i��ƌn��f�[�^�̍ŏI���R�[�h�̎��j */
                    IF numM_PATTERN_PROC_GRP_Count = numM_PATTERN_PROC_GRP_Index THEN
--vc2RunChkComment := '���������ʉ� 00450';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        numPBP_FINAL_PROC_FLG := FINAL_PROCESS_ON;    --�ŏI�n��t���O(1:�ŏI�o�H)
                    ELSE
--vc2RunChkComment := '���������ʉ� 00460';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        numPBP_FINAL_PROC_FLG := FINAL_PROCESS_OFF;   --�ŏI�n��t���O(0:��)
                    END IF;
/*-----------------------------------------------------------------------------
' ��ƌn��ʎd�|�f�[�^���쐬����
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '����ƌn��ʎd�|�f�[�^���쐬����';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    /* ��ƌn��ʎd�|�f�[�^���쐬���� */
                    INSERT INTO T_WORK_IN_PROC_BY_PROC(
                         WORK_ODR_CD                             --��ƌv��ԍ�
                        ,WORK_IN_PROC_CD                         --�d�|��ƃR�[�h
                        ,OD_NO                                   --�I�[�_�f�}���h�ԍ�
                        ,PROC_NAME                               --�d�|��Ɩ�
                        ,PROC_NO                                 --�d�|��ƌn��ԍ�
                        ,ITEM_CD                                 --�i�ڔԍ�
                        ,OUTSIDE_TYP                             --�d�|���O��敪
                        ,WS_CD                                   --��Ƌ�R�[�h
                        ,COMPANY_CD                              --��ЃR�[�h
                        ,VEND_CD                                 --�����R�[�h
                        ,PLANT_CD                                --�H��R�[�h
                        ,WORK_ODR_DLV_DATE                       --��ƌn��ʐ����[��
                        ,OPR_INST_START_DATE                     --��ƌn��ʒ����
                        ,OPR_INST_QTY                            --��Ǝw����
                        ,UNIT_COST_TYP                           --�P���敪
                        ,UNIT_COST                               --�P��
                        ,PROCESSING_COST                         --���H��
                        ,MATERIAL_COST                           --�ޗ���
                        ,OTHER_OVERHEADS                         --���̑��o��
                        ,PUCH_ODR_AMOUNT                         --�������z
                        ,DISC_AMOUNT                             --�l�����z
                        ,ACPT_INSPC_TYP                          --��ƌn���������敪
                        ,WORK_STS_TYP                            --��ƌn��ʍ�Ə�ԋ敪
                        ,FINAL_PROC_FLG                          --�ŏI�n��t���O
                        ,OPR_INST_DATE                           --��ƌn��ʍ�Ǝw����
                        ,WORK_CMPLT_DATE                         --��ƌn��ʎd�|������
                        ,OPR_INST_CD                             --��Ǝw���ԍ�
                        ,WORK_IN_PROC_COMMENT                    --��ƌn��ʎd�|���l
                        ,WORKER_QTY                              --�v����
                        ,CREATED_DATE                            --�쐬��
                        ,CREATED_BY                              --�쐬��
                        ,CREATED_PRG_NM                          --�쐬�v���O������
                        ,UPDATED_DATE                            --�X�V��
                        ,UPDATED_BY                              --�X�V��
                        ,UPDATED_PRG_NM                          --�X�V�v���O������
                        ,MODIFY_COUNT                            --�X�V��
                    ) VALUES (
                         vc2PBI_WORK_ODR_CD                      --��ƌv��ԍ�
                        ,vc2PG_PROC_CD                           --�d�|��ƃR�[�h
                        ,vc2PBI_OD_NO                            --�I�[�_�f�}���g�ԍ�
                        ,vc2PG_PROC_NAME                         --�d�|��Ɩ�
                        ,numPG_PROC_NO                           --�d�|��ƌn��ԍ�
                        ,vc2PBI_ITEM_CD                          --�i�ڔԍ�
                        ,numPG_OUTSIDE_TYP                       --�d�|���O��敪
                        ,vc2PG_WS_CD                             --��Ƌ�R�[�h
                        ,vc2PG_COMPANY_CD                        --��ЃR�[�h
                        ,vc2PG_VEND_CD                           --�����R�[�h
                        ,pvc2PlantCd                             --�H��R�[�h
                        ,dtmPBP_WORK_ODR_DLV_DATE                --��ƌn��ʐ����[��
                        ,dtmPBP_OPR_INST_START_DATE              --��ƌn��ʒ����
                        ,numPBP_OPR_INST_QTY                     --��Ǝw����
                        ,numPBP_UNIT_COST_TYP                    --�P���敪
                        ,numPBP_UNIT_COST                        --�P��
                        ,numPBP_PROCESSING_COST                  --���H��
                        ,numPBP_MATERIAL_COST                    --�ޗ���
                        ,numPBP_OTHER_OVERHEADS                  --���̑��o��
                        ,numPBP_PUCH_ODR_AMOUNT                  --�������z
                        ,0                                       --�l�����z
                        ,numPG_ACPT_INSPC_TYP                    --��ƌn���������敪
                        ,WORK_STS_TYP_NOINSTRACT                 --��ƌn��ʍ�Ə�ԋ敪�i1:���w���j
                        ,numPBP_FINAL_PROC_FLG                   --�ŏI�n��t���O
                        ,NULL                                    --��ƌn��ʍ�Ǝw����
                        ,NULL                                    --��ƌn��ʎd�|������
                        ,vc2PBP_OPR_INST_CD                      --��Ǝw���ԍ�
                        ,NULL                                    --��ƌn��ʎd�|���l
                        ,0                                       --�v����
                        ,SYSDATE                                 --�쐬��
                        ,pvc2UserId                              --�쐬��
                        ,MY_SQL_NAME                             --�쐬�v���O������
                        ,SYSDATE                                 --�X�V��
                        ,pvc2UserId                              --�X�V��
                        ,MY_SQL_NAME                             --�X�V�v���O������
                        ,0                                       --�X�V��
                        );
                    /* ��ƌn��d����save */
                    numGrpWKSpoil := numPG_SPOIL;
                    /* ���f�[�^�ǂݍ��� */
                    FETCH curM_PATTERN_PROC_GRP INTO RtpM_PATTERN_PROC_GRP;
                END LOOP;


            END IF;
            CLOSE curM_PATTERN_PROC_GRP;
/*-----------------------------------------------------------------------------
' �i�ڕʎd�|�f�[�^�ɃG���[���Ȃ������ꍇ�A�i�ڕʎd�|�f�[�^���X�V����
'
-----------------------------------------------------------------------------*/
--vc2RunChkComment := '���i�ڕʎd�|�f�[�^���X�V����';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            UPDATE T_WORK_IN_PROC_BY_ITEM SET
                PROC_EXPLOSION_FLG = PROCESS_EXPAND           --��ƌn��W�J�ς݃t���O(1:�W�J�ς�)
                ,UPDATED_DATE = SYSDATE                        --�X�V��
                ,UPDATED_BY = pvc2UserId                       --�X�V��
                ,UPDATED_PRG_NM = MY_SQL_NAME                  --�X�V�v���O������
                ,MODIFY_COUNT = MODIFY_COUNT + 1               --�X�V��
                WHERE WORK_ODR_CD = vc2PBI_WORK_ODR_CD;
--vc2RunChkComment := '��UPDATE�I��';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
/*-----------------------------------------------------------------------------
' �u���������v�̃C���N�������g
'
-----------------------------------------------------------------------------*/
            numTransactionCount := numTransactionCount + 1;
/*-----------------------------------------------------------------------------
' �i�ڕʎd�|�f�[�^�P�����ɑ΂��鏈���ɑ΂��Ă̂d�w�b�o�s�h�n�m
'
-----------------------------------------------------------------------------*/
        EXCEPTION
            --�i�ڃf�[�^����
            WHEN excITM_UNIT_QTY_TYP_GET_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excITM_UNIT_QTY_TYP_GET_ERR');
                CLOSE curM_ITEM;
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0534)'|| LOGMSG_ITEMCD || LOGMSG_BRAKETS || vc2PBI_ITEM_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* �G���[���b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_NOTEXIST_M_ITEM, vc2Comment);
            --�p�^�[���ʍ�ƌn��f�[�^��������
            WHEN excM_PTN_PROC_GRP_Count_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_PTN_PROC_GRP_Count_ERR');
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0560)'|| LOGMSG_PLANTCD || LOGMSG_BRAKETS || pvc2PlantCd || LOGMSG_BRAKETE || LOGMSG_ITEMCD || LOGMSG_BRAKETS || vc2PBI_ITEM_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* �G���[���b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_NOTEXIST_M_PTN_PROC_GRP, vc2Comment);
            --�p�^�[���ʍ�ƌn��f�[�^����
            WHEN excM_PTN_PROC_GRP_GET_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_PTN_PROC_GRP_GET_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0534)'|| LOGMSG_ITEMCD || LOGMSG_BRAKETS || vc2PBI_ITEM_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* �G���[���b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_NOTEXIST_M_PTN_PROC_GRP, vc2Comment);
            --�ŏ��̓���H���ɍ�Ƌ�R�[�h���ݒ肳��Ă��Ȃ��ꍇ�G���[
            WHEN excM_PTN_PROC_GRP_WS_CD_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_PTN_PROC_GRP_WS_CD_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                CLOSE curM_PATTERN_PROC_GRP_WS_CD;
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0496)'|| LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* �G���[���b�Z�[�W�̏o��(AD00011) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_NOTEXIST_M_WS, vc2Comment);
            --��Ƌ�R�[�h����v����[��Ƌ�]."�H��R�[�h"���A[�i�ڕʎd�|]."�H��R�[�h"�ƈ�v���Ȃ��ꍇ�G���[
            WHEN excM_WS_PLAN_WS_WH_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_WS_PLAN_WS_WH_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0496)'||LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* �G���[���b�Z�[�W�̏o��(AD00012) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_DIFF_PLANT_OF_WS, vc2Comment);
            --��Ƌ�R�[�h����v����[��Ƌ�]."�ۊǋ�R�[�h"���A�ݒ肳��Ă��Ȃ��ꍇ�G���[
            WHEN excM_WS_WH_CD_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_WS_WH_CD_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0496)'||LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* �G���[���b�Z�[�W�̏o��(AD00013) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                MY_SQL_NAME, APS_NOTEXIST_M_WH, vc2Comment);
            --��Ƌ�R�[�h����v����[��Ƌ�]."�ۊǋ�R�[�h"����v����A[�ۊǋ�]."�ۊǋ�R�[�h"���A�ݒ肳��Ă��Ȃ��ꍇ�G���[
            WHEN excM_WH_WH_CD_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_WH_WH_CD_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0496)'||LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* �G���[���b�Z�[�W�̏o��(AD00018) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_DIFF_WS_CD_OF_WH, vc2Comment);
            --�ۊǋ�R�[�h����v����[�ۊǋ�]."�H��R�[�h"���A[�i�ڕʎd�|]."�H��R�[�h"�ƈ�v���Ȃ��ꍇ�G���[
            WHEN excM_WH_PLANT_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excM_WH_PLANT_ERR');
                CLOSE curM_PATTERN_PROC_GRP;
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0496)'||LOGMSG_WORKODRCD || LOGMSG_BRAKETS || vc2PBI_WORK_ODR_CD || LOGMSG_BRAKETE,
                                     1,256);
                /* �G���[���b�Z�[�W�̏o��(AD00014) */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_DIFF_PLANT_OF_WH, vc2Comment);
            --���̑��̃G���[
            WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
                ROLLBACK;
                numTransactionCount := 0;
                /* �G���[���b�Z�[�W�̍쐬 */
                vc2Comment := SUBSTR('(SBM0021)'|| LOGMSG_ERR || '�F' || SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                                     1,256);
                /* �G���[���b�Z�[�W�̏o�� */
                blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                    MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
                EXIT;

        END;
        ELSE
            /* �S�s�����ɂ�菈���I�� */
--DBMS_OUTPUT.PUT_LINE('���S�s�����ɂ�菈���I��');
            EXIT;
        END IF;
/*-----------------------------------------------------------------------------
' ���o��������Main/Loop�̏I������
'
-----------------------------------------------------------------------------*/
    END LOOP;
    COMMIT;
    /* �J�[�\���N���[�Y */
    DBMS_SQL.CLOSE_CURSOR(intItemCursorName);
    /* �I�����b�Z�[�W�̍쐬 */
    vc2Comment := SUBSTR('(SBM0561)'|| LOGMSG_END_PGNM_EXPANDBYPTN ||
                         LOGMSG_OPRINST_START_DATE || '[ ' || pvc2OprInstStartDate || ' ]' ||
                         LOGMSG_WORKODR_DLV_DATE || '[ ' || pvc2WorkOdrDlvDate || ' ]' ||
                         LOGMSG_JOB_ODR_CODE || '[ ' || pvc2JobOdrCd || ' ]' ||
                         LOGMSG_PROCCOUNT || '[ ' || numTransactionCount || ' ]',
                         1,256);
    /* �I�����b�Z�[�W�̏o�� */
    blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_BATCH_END, vc2Comment);
    COMMIT;
    /* TraceLog �̏o�� */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);
    /* LogFile �� CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

--< ��O���� >---------------------------------------------------------------
EXCEPTION
    --�H��R�[�h�擾�G���[
    WHEN excPLANT_CDE_GET_ERR THEN
--DBMS_OUTPUT.PUT_LINE('excPLANT_CDE_GET_ERR');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0562)'|| LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR ||
                             LOGMSG_PLANTCD || LOGMSG_BRAKETS || pvc2PlantCd ||
                             LOGMSG_BRAKETE,
                             1,256);
        /* �I�����b�Z�[�W�̏o��(AD00009) */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_NOTEXIST_M_PLANT, vc2Comment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --�u�Ɩ��^�p���v�擾�G���[
    WHEN excBUSINESSDATE_GET_ERR   THEN
--DBMS_OUTPUT.PUT_LINE('excBUSINESSDATE_GET_ERR');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0555)'||LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '�F�Ɩ��^�p���擾',
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --�u�ғ������Z�o�v�G���[
    WHEN excWORK_DAY_CALC_ERR      THEN
--DBMS_OUTPUT.PUT_LINE('excWORK_DAY_CALC_ERR');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0563)'|| LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '�F�ғ������Z�o',
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --�u��Ǝw���ԍ��v�擾�G���[
    WHEN excNEW_INST_CD_GET_ERR    THEN
--DBMS_OUTPUT.PUT_LINE('excNEW_INST_CD_GET_ERR');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0566)'||LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '�F��Ǝw���ԍ��擾',
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --�u�[�������v�G���[
    WHEN excGETROUND_ERR           THEN
--DBMS_OUTPUT.PUT_LINE('excGETROUND_ERR');
        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0567)'||LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '�F�[������',
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
    --���̑��̃G���[
    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        /* �I�����b�Z�[�W�̍쐬 */
        vc2Comment := SUBSTR('(SBM0568)'||LOGMSG_END_PGNM_EXPANDBYPTN || LOGMSG_ERR || '�F' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_BATCH_END, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        /* TraceLog �̏o�� */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        /* LogFile �� CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
END;
/
