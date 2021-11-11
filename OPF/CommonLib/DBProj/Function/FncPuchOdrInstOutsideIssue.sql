CREATE OR REPLACE FUNCTION FNCPUCHODRINSTOUTSIDEISSUE(
/*------------------------------------------------------------------------------
' $Id: FncPuchOdrInstOutsideIssue.sql,v 1.13 2015/12/03 09:10:31 geng-jia Exp $
' version   : 1.00.08
'
' �C������
' 2003.09.22 ����
' 2003.10.01 �o�Ɏw���쐬���ُ̈�I���Ή�   Hnes.T.Sugano
' 2003.10.02 �f�o�b�N�p���W�b�N�̃R�����g�� Hnes.T.Sugano
' 2003.11.19 �����_�؏グ���W�b�N�̏C��[Bug#:781] HNES.T.SUGANO
' 2003.12.05 �[���i�ڗL�肩�����_�Ǘ��̏ꍇ�̌덷�C��[Bug#:837] HNES.T.SUGANO
' 2003.12.06 ���ԕi�Œǉ����������ꍇ�A�o�Ɏw�������ߏ�ɂȂ�s��̏C��[Bug#:860] HNES.T.SUGANO
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
' 2006.09.26 �ۊǋ�R�[�h���擾����ۂɍH��R�[�h�����������ɓ����
' 2006.09.28 �e���[���i�ڂ̏ꍇ�A�e�̏o�Ɏw���P�ʐ�����E���q���l�������o�Ɏw�����ɂ���悤�ɏC���B
'
' �@�\      : �o�Ɏw�������i�O��j<������>
'
' �߂�l    : Boolean
'               True :����I���i�o�Ɏw�������i�O��j���s�������j
'               False:�ُ�I���i�o�Ɏw�������i�O��j�Ɏ��s�������j
'
' ������    : ��MetamorBase���ʁi�K�{�j
'             pFileHandle               - (i)�t�@�C���n���h��
'             pvc2LogMode               - (i)�k�n�f���[�h
'             pvc2OutputMode            - (i)�o�̓��[�h
'             pvc2UserId                - (i)���[�U�h�c
'             pvc2BusinessName          - (i)�Ɩ���
'             pvc2PlantCd               - (i)�H��R�[�h
'             ���v���O�����ŗL
'             pvc2PuchOdrCd             -�����ԍ�
'             pvc2OdNo                  -�I�[�_�f�}���h�ԍ�
'             pnumPuchOdrQty            -������
'             pvc2CompanyCd             -��ЃR�[�h
'             pvc2VendCd                -�����R�[�h
'             pvc2ErrorCd               -�G���[�R�[�h
'
'
' �@�\����  : �����w���m��ɔ����A�K�v�ƂȂ鎑�ނ̏o�Ɏw�����쐬����B
'             �{�����́A�O��i�̔������ɑ΂��鉺�ʕi�ڂ̏o�Ɏw�����A���ꂼ��̃f�}���h
'             �������Ƃɍ쐬����B
'
' ���l      :
'
'
'
------------------------------------------------------------------------------*/
    pFileHandle             IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode             IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode          IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId              IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName        IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd             IN  VARCHAR2            --�H��R�[�h
   ,pvc2PuchOdrCd           IN  VARCHAR2            --�����ԍ�
   ,pvc2OdNo                IN  VARCHAR2            --�I�[�_�f�}���h�ԍ�
   ,pnumPuchOdrQty          IN  NUMBER              --������
   ,pvc2CompanyCd           IN  VARCHAR2            --��ЃR�[�h
   ,pvc2VendCd              IN  VARCHAR2            --�����R�[�h
   ,pvc2ErrorCd             OUT VARCHAR2            --�G���[�R�[�h

) RETURN BOOLEAN
IS

    /* ���R�[�h�̒�` */
    /* ���v�ʃf�[�^�Ǎ��p */
    TYPE sqlTmp_TOD is RECORD(
         sqlTmpOD_NO_TOD                VARCHAR2(100),  --�I�[�_�f�}���h�ԍ�
         sqlTmpITEM_CD_TOD              VARCHAR2(100),  --�i�ڔԍ�
         sqlTmpPS_EDITION_TOD           VARCHAR2(100),  --���i�\���Ő�(���v�i�ڍ\���Ő�)
         sqlTmpPS_UNIT_QTY_TOD          NUMBER(18,4),  --���i�\���P�ʐ�
         sqlTmpPS_UNIT_DENOMINATOR_TOD  NUMBER(18,4),  --���i�\���P�ʐ�����
         sqlTmpPS_UNIT_NUMERATOR_TOD    NUMBER(18,4),  --���i�\���P�ʐ����q
         sqlTmpITEM_ODR_TYP_TOD         NUMBER(02),    --�i�ڎ�z�敪
         sqlTmpOD_TYP_TOD               NUMBER(02),    --�I�[�_�f�}���h�敪
         sqlTmpPARENT_OD_NO_TOD         VARCHAR2(100),  --�e�I�[�_�f�}���h�ԍ�
         sqlTmpODR_QTY_TOD              NUMBER(18,4),  --�I�[�_��(#837)
         sqlTmpISSUE_TYP_TOD            NUMBER(02),    --���v�ʏo�ɋ敪
         sqlTmpSCDL_ISSUE_DATE_TOD      DATE,           --�o�ɗ\���
         sqlTmpPS_SPOIL                 NUMBER(9,4)       --���v�ʍ\���d����
        );
    typsqlCurr_REC      sqlTmp_TOD;

    TYPE sqlTmp_TOD_DISGUISE IS RECORD(    
         sqlTmpOD_NO_TOD                VARCHAR2(100),  --�I�[�_�f�}���h�ԍ�
         sqlTmpITEM_CD_TOD              VARCHAR2(100),  --�i�ڔԍ�
         sqlTmpPS_EDITION_TOD           VARCHAR2(100),  --���i�\���Ő�(���v�i�ڍ\���Ő�)
         sqlTmpPS_UNIT_QTY_TOD          NUMBER(18,4),  --���i�\���P�ʐ�
         sqlTmpPS_UNIT_DENOMINATOR_TOD  NUMBER(18,4),  --���i�\���P�ʐ�����
         sqlTmpPS_UNIT_NUMERATOR_TOD    NUMBER(18,4),  --���i�\���P�ʐ����q
         sqlTmpITEM_ODR_TYP_TOD         NUMBER(02),    --�i�ڎ�z�敪
         sqlTmpOD_TYP_TOD               NUMBER(02),    --�I�[�_�f�}���h�敪
         sqlTmpPARENT_OD_NO_TOD         VARCHAR2(100),  --�e�I�[�_�f�}���h�ԍ�
         sqlTmpODR_QTY_TOD              NUMBER(18,4),  --�I�[�_��(#837)
         sqlTmpISSUE_TYP_TOD            NUMBER(02),    --���v�ʏo�ɋ敪
         sqlTmpSCDL_ISSUE_DATE_TOD      DATE,           --�o�ɗ\���
         sqlTmpPS_SPOIL                 NUMBER(9,4)       --���v�ʍ\���d����
        );
        
     typsqlCurr_REC_DISGUISE         sqlTmp_TOD_DISGUISE;

    /* �x���i�o�Ɍv��f�[�^�i�s�d�l�o�j�쐬�p */
    TYPE sqlTmp is RECORD(
         sqlTmpPUCH_ODR_CD_T            VARCHAR2(100),  --�����ԍ�
         sqlTmpOD_NO_T                  VARCHAR2(100),  --�x���i�I�[�_�f�}���h�ԍ�
         sqlTmpITEM_CD_T                VARCHAR2(100),  --�x���i�i�ڔԍ�
         sqlTmpITEM_UNIT_QTY_TYP_T      VARCHAR2(100),  --�݌ɐ��P�ʋ敪
         sqlTmpPS_EDITION_T             VARCHAR2(100),  --�x���i���i�\���Ő�(���v�i�ڍ\���Ő�)
         sqlTmpPS_UNIT_QTY_T            NUMBER(18,4),  --�x���i���i�\���P�ʐ�
         sqlTmpPS_UNIT_DENOMINATOR_T    NUMBER(18,4),  --�x���i���i�\���P�ʐ�����
         sqlTmpPS_UNIT_NUMERATOR_T      NUMBER(18,4),  --�x���i���i�\���P�ʐ����q
         sqlTmpTOTALISSUETYP_T          NUMBER(02),    --�o�Ɏw���݌v��
         sqlTmpITEM_ODR_TYP_T           NUMBER(02),    --�o�Ɏw���敪(1:�ʏ�o�ɁA9:�[���i�ڏo��)
         sqlTmpODINFO_DISGUISE_T        NUMBER(02),    --�[���i�ړW�J�t���O(0:OFF,1:ON)
         sqlTmpPARENT_OD_NO_T           VARCHAR2(100),  --�e�I�[�_�f�}���h�ԍ�
         sqlTmpODR_QTY_T                NUMBER(18,4),  --�I�[�_��(#837)
         sqlTmpISSUE_TYP_T              NUMBER(02),    --���v�ʏo�ɋ敪
         sqlTmpCONS_TYP_T               NUMBER(02),    --�x���敪
         sqlTmpSCDL_ISSUE_DATE_T        DATE,           --�o�ɗ\���
         sqlTmpPS_SPOIL                 NUMBER(9,4)       --���v�ʍ\���d����
        );

    TYPE sqlTmp_REC_T IS TABLE OF  sqlTmp INDEX BY BINARY_INTEGER;
         sqlTmp_REC  sqlTmp_REC_T;

    /* �o�Ɏw���f�[�^�i�s�d�l�o�j                      */
    /* �x���i�o�Ɍv��f�[�^�ҏW�����f�[�^���i�[����B  */
    /* �����̍\���̂���ɏo�Ɏw���f�[�^��ǉ�����B    */
    TYPE sqlTmp_ISSUE_INST is RECORD(
         sqlTmpISSUE_INST_CD            VARCHAR2(100),  --�o�Ɏw���ԍ��i�����̔ԁj
         sqlTmpPLANT_CD                 VARCHAR2(8),  --�H��R�[�h
         sqlTmpOD_NO                    VARCHAR2(100),  --�I�[�_�f�}���h�ԍ�
         sqlTmpITEM_CD                  VARCHAR2(100),  --�o�ɕi�ڔԍ�
         sqlTmpPS_EDITION               VARCHAR2(100),  --���i�\���Ő�(���v�i�ڍ\���Ő�)
         sqlTmpPUCH_ODR_CD              VARCHAR2(100),  --�����ԍ�
         sqlTmpCOMPANY_CD               VARCHAR2(100),  --��ЃR�[�h
         sqlTmpVEND_CD                  VARCHAR2(100),  --�����R�[�h
         sqlTmpCONS_TYP                 NUMBER(02),    --�x���敪
         sqlTmpWORK_ODR_CD              VARCHAR2(100),  --��ƌv��ԍ�
         sqlTmpWORK_IN_PROC_CD          VARCHAR2(100),  --�d�|��ƃR�[�h
         sqlTmpWS_CD                    VARCHAR2(100),  --��Ƌ�R�[�h
         sqlTmpWH_CD                    VARCHAR2(100),  --�H���ۊǏꏊ�R�[�h
         sqlTmpISSUE_INST_UNIT_QTY      NUMBER(18,4),  --�o�Ɏw���P�ʐ�
         sqlTmpISSUE_INST_UNIT_DEN      NUMBER(18,4),  --�o�Ɏw���P�ʐ�����
         sqlTmpISSUE_INST_UNIT_NUM      NUMBER(18,4),  --�o�Ɏw���P�ʐ����q
         sqlTmpISSUE_INST_QTY           NUMBER(18,4),  --�o�Ɏw����
         sqlTmpTOTAL_ISSUE_QTY          NUMBER(18,4),  --�o�ɗ݌v��
         sqlTmpSCDL_ISSUE_DATE          DATE,          --�o�ɗ\���
         sqlTmpISSUE_CMPLT_DATE         DATE,          --�o�Ɋ�����
         sqlTmpISSUE_TYP                NUMBER(1),     --�o�Ɏw���o�ɋ敪
         sqlTmpISSUE_CMPLT_FLG          NUMBER(1),     --�o�Ɋ����t���O
         sqlTmpISSUE_INST_ISS_FLG       NUMBER(1),     --�o�Ɏw�������s�ς݃t���O
         sqlTmpISSUE_INST_ISS_DATE      DATE,          --�o�Ɏw�������s��
         sqlTmpISSUE_INST_COMMENT       VARCHAR2(320)   --�o�Ɏw�����l
        );

    TYPE sqlTmp_ISSUE_INST_REC_T IS TABLE OF  sqlTmp_ISSUE_INST INDEX BY BINARY_INTEGER;
         sqlTmp_ISSUE_INST_REC   sqlTmp_ISSUE_INST_REC_T;

    /* �J�[�\���̐錾 */
    
    /* ���v�ʃf�[�^�Ǎ� */
    CURSOR CUR_PuchOdrInst_SelectTOD1(cvc2OD_NO1 VARCHAR2) IS 
        SELECT 
               OD_NO,                                   --�I�[�_�f�}���h�ԍ�
               ITEM_CD,                                 --�i�ڔԍ�
               PS_EDITION,                              --�\���Ő�
               PS_UNIT_QTY,                             --�\���P�ʐ�
               PS_UNIT_DENOMINATOR,                     --�\���P�ʐ�����
               PS_UNIT_NUMERATOR,                       --�\���P�ʐ����q
               MRP_ODR_TYP,                             --�i�ڎ�z�敪
               OD_TYP,                                  --�I�[�_�f�}���h�敪
               PARENT_OD_NO,                            --�e�I�[�_�f�}���h�ԍ�
               ODR_QTY,                                 --�I�[�_��(#837)
               ISSUE_TYP,                                --���v�ʏo�ɋ敪
               DUE_DATE,                                 --�v���[��
               PS_SPOIL                                    --���v�ʍ\���d����
        FROM   T_OD                                     --���v��
        WHERE  PARENT_OD_NO = cvc2OD_NO1                --���v��.�e�I�[�_�[�f�}���h�ԍ� = �p�����[�^
               ;
     /*�V�X�e���p�����[�^�i�d�����j*/
     CURSOR CUR_SystemSpoilFlg  IS
         SELECT 
                 VALUE
         FROM  SYS_PARAMETER
         WHERE NAME='SPOIL_FLG';
            
    /* ���v�ʃf�[�^�Ǎ��i�i�ڎ�z�敪:8(�[���i��)���̉��ʃf�}���h�T�}�����̒ǉ��p) */ 
    CURSOR CUR_PuchOdrInst_SelectTOD2(cvc2OD_NO2 VARCHAR2) IS 
        SELECT 
               OD_NO,                                   --�I�[�_�f�}���h�ԍ�
               ITEM_CD,                                 --�i�ڔԍ�
               PS_EDITION,                              --�\���Ő�
               PS_UNIT_QTY,                             --�\���P�ʐ�
               PS_UNIT_DENOMINATOR,                     --�\���P�ʐ�����
               PS_UNIT_NUMERATOR,                       --�\���P�ʐ����q
               MRP_ODR_TYP,                             --�i�ڎ�z�敪
               OD_TYP,                                  --�I�[�_�f�}���h�敪
               PARENT_OD_NO,                            --�e�I�[�_�f�}���h�ԍ�
               ODR_QTY,                                 --�I�[�_��(#837)
               ISSUE_TYP,                                --���v�ʏo�ɋ敪
               DUE_DATE,                                 --�v���[��
               PS_SPOIL                                    --���v�ʍ\���d����
        FROM   T_OD                                     --���v��
        WHERE  PARENT_OD_NO = cvc2OD_NO2                --���v��.�e�I�[�_�[�f�}���h�ԍ� = �p�����[�^
               ;

            
    /* �݌ɐ��ʒP�ʋ敪�̎擾�i�i�ڃe�[�u�����i����:��e�[�u���j�j
       �o�Ɏw���쐬���ɋ[���i�ړW�J�t���O:1(ON)�̏ꍇ�̏o�ɒP�ʐ��A
       �o�Ɏw�����̗L���������I�[�o�[�������̍݌ɐ��ʒP�ʋ敪�̔��� */
    CURSOR CUR_PuchOdrInst_UNIT_QTY_TYP(cvc2ITEM_CD VARCHAR2) IS 
        SELECT
               UNIT_QTY_TYP
        FROM   M_ITEM
        WHERE  ITEM_CD = cvc2ITEM_CD
               ;

    /* �L���x���t���O�̎擾�i�x���P���e�[�u�����j               
       �x���P�������݂��A���L���J�n�����A[���v��]."�v���[��"���ߋ��̃f�[�^
       ����������B�����Y������ꍇ�́A�J�n�����ő�̃f�[�^���̗p����B
       �����F�x���P���̗L���x���t���O(ONEROUS_FLG)�̒l
             0�i�����j�̏ꍇ  �� �x���敪=2�i�����x��)
             1�i�L���j�̏ꍇ  �� �x���敪=1�i�L���x��)
       ���������ɊY������f�[�^�����݂��Ȃ������ꍇ  �� �x���敪=2�i�����x���j */
    CURSOR CUR_PuchOdrInst_ONEROUS_FLG(
               cvc2COMPANY_CD  VARCHAR2,
               cvc2VEND_CD     VARCHAR2,
               cvc2PLANT_CD    VARCHAR2,
               cvc2ITEM_CD     VARCHAR2,
               cdtmSTART_DATE  DATE
              ) IS 
        SELECT
               M_CONS_UNIT_COST.ONEROUS_FLG AS ONEROUS_FLG
        FROM   M_CONS_UNIT_COST,
              (
               SELECT MAX(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE) AS EFF_PHASE_IN_DATE
               FROM   M_CONS_UNIT_COST
               WHERE
                      M_CONS_UNIT_COST.COMPANY_CD = cvc2COMPANY_CD
                  AND M_CONS_UNIT_COST.VEND_CD    = cvc2VEND_CD
                  AND M_CONS_UNIT_COST.PLANT_CD   = cvc2PLANT_CD
                  AND M_CONS_UNIT_COST.ITEM_CD    = cvc2ITEM_CD
                  AND M_CONS_UNIT_COST.EFF_PHASE_IN_DATE <= TRUNC(cdtmSTART_DATE)
              ) T1
        WHERE  M_CONS_UNIT_COST.EFF_PHASE_IN_DATE = T1.EFF_PHASE_IN_DATE
           AND M_CONS_UNIT_COST.COMPANY_CD        = cvc2COMPANY_CD
           AND M_CONS_UNIT_COST.VEND_CD           = cvc2VEND_CD
           AND M_CONS_UNIT_COST.PLANT_CD          = cvc2PLANT_CD
           AND M_CONS_UNIT_COST.ITEM_CD           = cvc2ITEM_CD
               ;

    /* �ۊǋ�f�[�^�Ǎ� */
    CURSOR CUR_PuchOdrInst_Select_M_WH(vc2COMPANY_CD VARCHAR2, vc2VEND_CD VARCHAR2, vc2PLANT_CD VARCHAR2) IS 
        SELECT
            M_WH.WH_CD AS WH_CD
        FROM
            M_WH
        WHERE 
            M_WH.COMPANY_CD = vc2COMPANY_CD
            AND M_WH.VEND_CD = vc2VEND_CD
            AND M_WH.PLANT_CD = vc2PLANT_CD
               ;
               
    /* �p�����[�^�f�[�^�Ǎ� */
    CURSOR CUR_PuchOdrInst_SYS_PARAMETER(vc2NAME VARCHAR2) IS 
        SELECT
            UPPER(SYS_PARAMETER.VALUE) AS VALUE
        FROM
            SYS_PARAMETER
        WHERE 
            SYS_PARAMETER.NAME = vc2NAME
               ;

-- ���� 2008/08/06 ADD START -TSUCHIDA����
	/* �i�ڃe�[�u�����A�H���Ǘ��i�ڋ敪�擾�B
		�i�H���Ǘ��i�ڋ敪=1�i�H���Ǘ��i�ځj�̏ꍇ�A�o�Ɏw���ɏo�͂��Ȃ��B�j */
    CURSOR CUR_PuchOdrInst_MANHOUR_TYP(cvc2ITEM_CD VARCHAR2) IS 
        SELECT
               MANHOUR_TYP
        FROM   M_ITEM
        WHERE  ITEM_CD = cvc2ITEM_CD
               ;
-- ���� 2008/08/06 ADD END -TSUCHIDA����

    /* �萔�̐錾 */
    MY_SQL_NAME                     VARCHAR2(108)  := ' FNCPUCHODRINSTOUTSIDEISSUE'; --�t�@���N�V������
    METHOD_START                    VARCHAR2(112)  := '(SBM0701)<< �o�Ɏw������(�O��)�J�n >>';
    METHOD_END                      VARCHAR2(112)  := '<< �o�Ɏw������(�O��)�I�� >>';
    METHOD_START_PGNM_TOD           VARCHAR2(152)  := '(SBM0703)<< �x���i�o�Ɍv��f�[�^�쐬�����J�n >>';
    METHOD_END_PGNM_TOD             VARCHAR2(152)  := '(SBM0704)<< �x���i�o�Ɍv��f�[�^�쐬�����I�� >>';
    METHOD_START_PGNM_ISSUE_INST    VARCHAR2(128)  := '(SBM0705)<< �o�Ɏw���f�[�^�쐬�����J�n >>';
    METHOD_END_PGNM_ISSUE_INST      VARCHAR2(128)  := '(SBM0706)<< �o�Ɏw���f�[�^�쐬�����I�� >>';
    METHOD_START_PGNM_TOD_ADD       VARCHAR2(128)  := '(SBM0707)<< �o�Ɏw���f�[�^�ǉ������J�n >>';
    METHOD_END_PGNM_TOD_ADD         VARCHAR2(128)  := '(SBM0708)<< �o�Ɏw���f�[�^�ǉ������I�� >>';
    LOGMSG_ERR                      VARCHAR2(32)  := '�ُ�I��';
    excnumunit_qty_typ              EXCEPTION;                                      --�݌ɐ��ʒP�ʋ敪�̎擾���s�G���[
    excGetNewIssInstCd              EXCEPTION;                                      --�����̔Ԏ擾�G���[
    APS_COM_NOTPRIMARY              VARCHAR2(28)  := 'ZZ06001';                     --�Ώۃf�[�^�����݂��܂���
    APS_COM_NOTEXIST_DATA           VARCHAR2(28)  := 'ZZ06001';                     --�Ώۃf�[�^�����݂��܂���
    APS_COM_ORACLE_ERR              VARCHAR2(28)  := 'ZZ01106';                     --�T�[�o�G���[
    APS_COM_OTHER_ERR               VARCHAR2(28)  := 'ZZ01106';                     --�T�[�o�G���[
    ONEROUS_FLG_OFF                 NUMBER(01)    := 0;                             --����
    ONEROUS_FLG_ON                  NUMBER(01)    := 1;                             --�L��
    CONS_TYP_CHARGE                 NUMBER(02)    := 1;                             --�L��
    CONS_TYP_NON_CHARGE             NUMBER(02)    := 2;                             --����

    /* �ϐ��̒�` */
    lngCntMax                       NUMBER(11):= 0;                                 --�x���i�o�Ɍv��f�[�^����
    lngCntMaxWork                   NUMBER(11):= 0;                                 --�x���i�o�Ɍv��f�[�^����
    numCntMax_ISSUE_INST            NUMBER(11):= 0;                                 --�o�Ɏw���f�[�^����
    numCntCurr                      NUMBER(11):= 0;                                 --�\���̓Ǎ��p�J�E���^
    numCntCurr_ISSUE_INST           NUMBER(11):= 0;                                 --�o�Ɏw���P�ʐ��擾�p�J�E���^
    vc2OD_NOTemp                    VARCHAR2(100);                                   --�I�[�_�f�}���h�ԍ��ێ��p
    cv2PARENT_OD_NoTemp             VARCHAR2(100);                                   --�e�I�[�_�f�}���h�ԍ��ێ��p
    numUNIT_QTY_TYP                 NUMBER(02);                                     --�q�i�ڍ݌ɐ��ʒP�ʋ敪�̕ێ��p
    numISSUE_INST_UNIT_QTY_TYP      NUMBER(02);                                     --�e�i�ڍ݌ɐ��ʒP�ʋ敪�̕ێ��p
    vc2GetNewPuchCd                 VARCHAR2(100);                                   --�o�ɔԍ��擾�p
    blnRet                          BOOLEAN;                                        --���ʊ֐��̖ߒl
    blnErrFLG                       BOOLEAN;  
    numUNIT_QTY_TYP_REC             NUMBER(11):= 0;                                 --�݌ɒP�ʃf�[�^�̌����擾�p
    vc2Comment                      VARCHAR2(1024);                                  --�R�����g�쐬�p
    vc2RunChkComment                VARCHAR2(1024);                                  --���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    numONEROUS_FLG                  NUMBER(01);                                     --�L���t���O
    vc2WH_CDTemp                    VARCHAR2(100);                                   --[�ۊǋ�]."�ۊǋ�R�[�h"�ێ��p
    vc2VALUETemp                    VARCHAR2(1024);                                  --[�p�����[�^]."�ݒ�l"�ێ����p
    SYS_SPOIL_FLG                   NUMBER(01);                                        --�V�X�e���p�����[�^�d����
    excNOTEXIST_M_WH                EXCEPTION;
    excNOTEXIST_SYS_PARAMETER       EXCEPTION;

-- ���� 2008/08/06 ADD START -TSUCHIDA����
	numMANHOUR_TYP					NUMBER(02);										--�H���Ǘ��i�ڋ敪�擾�p
-- ���� 2008/08/06 ADD END -TSUCHIDA����
--<���C������ >-----------------------------------------------------
BEGIN

-- DBMS_OUTPUT.ENABLE(1000000);
-- DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    vc2RunChkComment := NULL;
    --// �V�X�e���d�������擾
    OPEN CUR_SystemSpoilFlg ;
    FETCH CUR_SystemSpoilFlg INTO SYS_SPOIL_FLG ;
    IF CUR_SystemSpoilFlg%FOUND = FALSE THEN
       RAISE excNOTEXIST_SYS_PARAMETER;
    END IF;
    CLOSE CUR_SystemSpoilFlg ;

    /* ���ʃf�}���h�T�}�����̒ǉ����� */

    /* TraceLog�̏o��(Start)�������s�� < �o�Ɏw������(�O��)�J�n > */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

--vc2RunChkComment := '���������ʉ� FNC00010';
-- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
    /* TraceLog�̏o��(Start)�������s�� <�x���i�o�Ɍv��f�[�^�쐬�����J�n> */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START_PGNM_TOD);

    pvc2ErrorCd := '';

    /* �o�Ɏw���f�[�^�i�s�d�l�o�j                     */
    /* �x���i�o�Ɍv��f�[�^�ҏW�����f�[�^���i�[����B */
    /* �����̍\���̂���ɏo�Ɏw���f�[�^��ǉ�����B   */

    OPEN CUR_PuchOdrInst_SelectTOD1(pvc2OdNo);

-- DBMS_OUTPUT.PUT_LINE('�������x���i�o�Ɍv��f�[�^�̍쐬������');
-- DBMS_OUTPUT.PUT_LINE('�����ԍ��F'|| pvc2PuchOdrCd);
-- DBMS_OUTPUT.PUT_LINE('�n�c�ԍ��F'|| pvc2OdNo);

-- �f�o�b�N�p
-- SELECT
--    COUNT(*) INTO lngCntMaxWork FROM T_OD
--         WHERE    PARENT_OD_NO = pvc2OdNo;
-- -- DBMS_OUTPUT.PUT_LINE('���ʃf�}���h���F'|| lngCntMaxWork);

    lngCntMax := 0;

    LOOP

-- -- DBMS_OUTPUT.PUT_LINE('���C�����[�v�̊J�n');

        FETCH 
            CUR_PuchOdrInst_SelectTOD1 INTO  typsqlCurr_REC;
            EXIT WHEN CUR_PuchOdrInst_SelectTOD1%notfound  ;

        /* �x���i�o�Ɍv��f�[�^�̍쐬 */
        IF  typsqlCurr_REC. sqlTmpITEM_ODR_TYP_TOD = 8 THEN                 --//�[���i��

--vc2RunChkComment := '���������ʉ� FNC00020';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
-- DBMS_OUTPUT.PUT_LINE('�������[���i�ځ�����');

            /* �����ԍ� */
            sqlTmp_REC(lngCntMax). sqlTmpPUCH_ODR_CD_T := pvc2PuchOdrCd;

            /* �I�[�_�f�}���h�ԍ� */
            sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T :=  typsqlCurr_REC. sqlTmpOD_NO_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('�I�[�_�f�}���h�ԍ�'||  sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T);

            vc2OD_NOTemp :=  typsqlCurr_REC. sqlTmpOD_NO_TOD;

            /* �i�ڔԍ� */
            sqlTmp_REC(lngCntMax). sqlTmpITEM_CD_T :=  typsqlCurr_REC. sqlTmpITEM_CD_TOD;

            /* ���i�\���Ő� */
            sqlTmp_REC(lngCntMax). sqlTmpPS_EDITION_T :=
                                       typsqlCurr_REC. sqlTmpPS_EDITION_TOD;

            /* ���i�\���P�ʐ� */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_QTY_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_QTY_TOD;

            /* ���i�\���P�ʐ����� */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_DENOMINATOR_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_DENOMINATOR_TOD;

            /* ���i�\���P�ʐ����q */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_NUMERATOR_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_NUMERATOR_TOD;
            /*���v�ʍ\���d����*/
            sqlTmp_REC(lngCntMax).sqlTmpPS_SPOIL :=typsqlCurr_REC.sqlTmpPS_SPOIL;

            /* �o�Ɏw���݌v�� */
            sqlTmp_REC(lngCntMax). sqlTmpTOTALISSUETYP_T := 0;

            /* �o�Ɏw���敪(�i�ڎ�z�敪)�̐ݒ� */
            sqlTmp_REC(lngCntMax). sqlTmpITEM_ODR_TYP_T := 9;           --�o�Ɏw���敪:�[���i�ڏo�Ɍv��

            /* �[���i�ړW�J�t���O�̐ݒ� */
            sqlTmp_REC(lngCntMax). sqlTmpODINFO_DISGUISE_T := 0;        --(0:OFF)

-- -- DBMS_OUTPUT.PUT_LINE('�������[���i�ړW�J������'|| sqlTmp_REC(lngCntMax). sqlTmpODINFO_DISGUISE_T);
            
            sqlTmp_REC(lngCntMax). sqlTmpPARENT_OD_NO_T :=
                                       typsqlCurr_REC. sqlTmpPARENT_OD_NO_TOD;        --�e�I�[�_�f�}���h�ԍ�

            sqlTmp_REC(lngCntMax). sqlTmpODR_QTY_T :=
                                       typsqlCurr_REC. sqlTmpODR_QTY_TOD;             --�I�[�_��(#837)

            sqlTmp_REC(lngCntMax). sqlTmpISSUE_TYP_T :=
                                       typsqlCurr_REC. sqlTmpISSUE_TYP_TOD; --���v�ʏo�ɋ敪
                                       
            sqlTmp_REC(lngCntMax). sqlTmpSCDL_ISSUE_DATE_T :=
                                       typsqlCurr_REC. sqlTmpSCDL_ISSUE_DATE_TOD; --�o�ɗ\���
                                       
            /* �f�[�^�����J�E���g */
            lngCntMax := lngCntMax + 1;

            /* �[���i�ڂ̉��ʃf�}���h�̒��o */
            OPEN CUR_PuchOdrInst_SelectTOD2(vc2OD_NOTemp);

            LOOP
                FETCH CUR_PuchOdrInst_SelectTOD2 INTO  typsqlCurr_REC_DISGUISE;
                EXIT WHEN CUR_PuchOdrInst_SelectTOD2%notfound;

-- -- DBMS_OUTPUT.PUT_LINE('�������[���i�ڂ̎q������');

                /* ����ɂ��̃I�[�_�f�}���h�ԍ���e�I�[�_�f�}���h�ԍ��Ƃ��Ď����Ă�����̂𒊏o */
                /* �����ԍ� */
                sqlTmp_REC(lngCntMax). sqlTmpPUCH_ODR_CD_T := pvc2PuchOdrCd;

                /* �I�[�_�f�}���h�ԍ� */
                sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpOD_NO_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('�I�[�_�f�}���h�ԍ�'||  sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T);

                vc2OD_NOTemp :=  typsqlCurr_REC_DISGUISE. sqlTmpOD_NO_TOD;

                /* �i�ڔԍ� */
                sqlTmp_REC(lngCntMax). sqlTmpITEM_CD_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpITEM_CD_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('������ 000001 ������');

                /* ���i�\���Ő� */
                sqlTmp_REC(lngCntMax). sqlTmpPS_EDITION_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPS_EDITION_TOD;
-- -- DBMS_OUTPUT.PUT_LINE('������ 000002 ������');

                /* ���i�\���P�ʐ� */
                sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_QTY_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPS_UNIT_QTY_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('������ 000003 ������');

                /* ���i�\���P�ʐ����� */
                sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_DENOMINATOR_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPS_UNIT_DENOMINATOR_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('������ 000004 ������');

                /* ���i�\���P�ʐ����q */
                sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_NUMERATOR_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPS_UNIT_NUMERATOR_TOD;
                /*���v�ʍ\���d����*/
                sqlTmp_REC(lngCntMax).sqlTmpPS_SPOIL :=typsqlCurr_REC_DISGUISE.sqlTmpPS_SPOIL;
-- -- DBMS_OUTPUT.PUT_LINE('������ 000005 ������');

                /* �o�Ɏw���݌v�� */
                sqlTmp_REC(lngCntMax). sqlTmpTOTALISSUETYP_T := 0;

-- -- DBMS_OUTPUT.PUT_LINE('������ 000006 ������');

                /* �o�Ɏw���敪:�ʏ�o�Ɍv�� */
                sqlTmp_REC(lngCntMax). sqlTmpITEM_ODR_TYP_T := 1;

-- -- DBMS_OUTPUT.PUT_LINE('������ 000007 ������');

                /* �[���i�ړW�J�t���O�̐ݒ� */
                sqlTmp_REC(lngCntMax). sqlTmpODINFO_DISGUISE_T := 1;    --(1:ON)

-- -- DBMS_OUTPUT.PUT_LINE('������ 000008 ������');

                /* �e�I�[�_�f�}���h�ԍ� */
                sqlTmp_REC(lngCntMax). sqlTmpPARENT_OD_NO_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPARENT_OD_NO_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('�e�I�[�_�f�}���h�ԍ�'||  sqlTmp_REC(lngCntMax). sqlTmpPARENT_OD_NO_T);

-- -- DBMS_OUTPUT.PUT_LINE('������ 000009 ������');

                /* �I�[�_��(#837) */
                sqlTmp_REC(lngCntMax). sqlTmpODR_QTY_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpODR_QTY_TOD;

                /* ���v�ʏo�ɋ敪 */
                sqlTmp_REC(lngCntMax). sqlTmpISSUE_TYP_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpISSUE_TYP_TOD;

                /* �o�ɗ\��� */
                sqlTmp_REC(lngCntMax). sqlTmpSCDL_ISSUE_DATE_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpSCDL_ISSUE_DATE_TOD;
                                           
-- -- DBMS_OUTPUT.PUT_LINE('������ 000010 ������');

                /* �f�[�^�����J�E���g */
                lngCntMax := lngCntMax + 1;

-- -- DBMS_OUTPUT.PUT_LINE( sqlTmp_REC(lngCntMax). sqlTmpITEM_ODR_TYP_T);

-- -- DBMS_OUTPUT.PUT_LINE('������ 000011 ������');

            END LOOP;

            CLOSE CUR_PuchOdrInst_SelectTOD2;

        ELSE                                                                    --�[���i�ڈȊO

--vc2RunChkComment := '���������ʉ� FNC00030';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            /* �����ԍ� */
            sqlTmp_REC(lngCntMax). sqlTmpPUCH_ODR_CD_T := pvc2PuchOdrCd;

            /* �I�[�_�f�}���h�ԍ� */
            sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T := 
                                       typsqlCurr_REC. sqlTmpOD_NO_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('�I�[�_�f�}���h�ԍ�'||  sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T);

            /* �i�ڔԍ� */
            sqlTmp_REC(lngCntMax). sqlTmpITEM_CD_T := 
                                       typsqlCurr_REC. sqlTmpITEM_CD_TOD;

            /* ���i�\���Ő� */
            sqlTmp_REC(lngCntMax). sqlTmpPS_EDITION_T := 
                                       typsqlCurr_REC. sqlTmpPS_EDITION_TOD;

            /* ���i�\���P�ʐ� */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_QTY_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_QTY_TOD;

            /* ���i�\���P�ʐ����� */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_DENOMINATOR_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_DENOMINATOR_TOD;

            /* ���i�\���P�ʐ����q */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_NUMERATOR_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_NUMERATOR_TOD;
            /*���v�ʍ\���d����*/
            sqlTmp_REC(lngCntMax).sqlTmpPS_SPOIL :=typsqlCurr_REC.sqlTmpPS_SPOIL;
-- -- DBMS_OUTPUT.PUT_LINE( sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_QTY_T||'���x���f�[�^�E�[���ȊO');

            /* �o�Ɏw���݌v�� */
            sqlTmp_REC(lngCntMax). sqlTmpTOTALISSUETYP_T := 0;
 
            /* �o�Ɏw���敪(�i�ڎ�z�敪)�̐ݒ� */
            sqlTmp_REC(lngCntMax). sqlTmpITEM_ODR_TYP_T := 1;           --�o�Ɏw���敪:�ʏ�o�Ɍv��

            /* �[���i�ړW�J�t���O�̐ݒ�(0:OFF) */
            sqlTmp_REC(lngCntMax). sqlTmpODINFO_DISGUISE_T := 0;        --(0:OFF)

            /* �e�I�[�_�f�}���h�ԍ� */
            sqlTmp_REC(lngCntMax). sqlTmpPARENT_OD_NO_T := 
                                       typsqlCurr_REC. sqlTmpPARENT_OD_NO_TOD;

            /* �I�[�_��(#837) */
            sqlTmp_REC(lngCntMax). sqlTmpODR_QTY_T := 
                                       typsqlCurr_REC. sqlTmpODR_QTY_TOD;

            /* ���v�ʏo�ɋ敪 */
            sqlTmp_REC(lngCntMax). sqlTmpISSUE_TYP_T :=  typsqlCurr_REC. sqlTmpISSUE_TYP_TOD;

            /* �o�ɗ\��� */
            sqlTmp_REC(lngCntMax). sqlTmpSCDL_ISSUE_DATE_T :=  typsqlCurr_REC. sqlTmpSCDL_ISSUE_DATE_TOD;
            
-- -- DBMS_OUTPUT.PUT_LINE('�o�Ɏw���o�ɋ敪'||  sqlTmp_REC(lngCntMax). sqlTmpISSUE_TYP_T);

            /* �f�[�^�����J�E���g */
            lngCntMax := lngCntMax + 1;

        END IF;

    END LOOP;

-- -- DBMS_OUTPUT.PUT_LINE('***�x���i�o�Ɍv��f�[�^�̍쐬�I��***�F'|| lngCntMax);

    CLOSE CUR_PuchOdrInst_SelectTOD1;

    /* TraceLog�̏o�͏������s��<�x���i�o�Ɍv��f�[�^�쐬�����I��> */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END_PGNM_TOD);

    /* �o�Ɏw�����̒ǉ����� */
-- DBMS_OUTPUT.PUT_LINE('�������o�Ɏw�����̒ǉ������J�n������');

    /* TraceLog�̏o��(Start)�������s��<�o�Ɏw���f�[�^�쐬�����J�n> */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START_PGNM_ISSUE_INST);
                            
    numCntCurr := 0;

-- -- DBMS_OUTPUT.PUT_LINE('***�x���i�o�Ɍv��f�[�^�̓Ǎ�***�F'|| TO_CHAR(lngCntMax));

    WHILE lngCntMax > numCntCurr LOOP

-- -- DBMS_OUTPUT.PUT_LINE('numCntCurr:'  ||  TO_CHAR(numCntCurr));
-- -- DBMS_OUTPUT.PUT_LINE('lngCntMax :'  ||  TO_CHAR(lngCntMax));
-- -- DBMS_OUTPUT.PUT_LINE('�o�Ɏw���敪' ||  sqlTmp_REC(numCntCurr). sqlTmpITEM_ODR_TYP_T);
    
        /* �o�Ɏw���f�[�^�i�s�d�l�o�j�̍쐬                                               */
        /* �x���i�o�Ɍv��f�[�^�ҏW�����f�[�^���i�[����B                                 */
        /* �����̍\���̂���ɏo�Ɏw���f�[�^��ǉ�����B                                   */
        /* �x���i�o�Ɍv��f�[�^�̏o�Ɏw���敪:1�i�ʏ�A�[���i�ڂ̉��ʃf�}���h�̂ݒ��o�j�B */
        IF  sqlTmp_REC(numCntCurr). sqlTmpITEM_ODR_TYP_T = 1 THEN                 --�ʏ�i�o��

--vc2RunChkComment := '���������ʉ� FNC00040';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            /* �o�Ɏw���ԍ�(���ʊ֐����擾�������̔ԁ� */
            blnRet := FNCGETNEWISSINSTCD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                         pvc2UserId,pvc2BusinessName,pvc2PlantCd,vc2GetNewPuchCd);

            IF blnRet = false then

-- -- DBMS_OUTPUT.PUT_LINE(lngCntMax||'�����������̔Ԏ��s�I�I�I�I�I������');

                RAISE excGetNewIssInstCd;

            END IF;

-- -- DBMS_OUTPUT.PUT_LINE('numCntMax_ISSUE_INST=' || numCntMax_ISSUE_INST);

            /* �o�Ɏw���ԍ� */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_CD := vc2GetNewPuchCd;

            /* �H��R�[�h */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpPLANT_CD := pvc2PlantCd;

            /* �I�[�_�f�}���h�ԍ� */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpOD_NO := 
                                                             sqlTmp_REC(numCntCurr). sqlTmpOD_NO_T;

            /* �o�ɕi�ڔԍ� */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpITEM_CD := 
                                                             sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T;

            /* ���i�\���Ő�(���v�i�ڍ\���Ő�) */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpPS_EDITION := 
                                                             sqlTmp_REC(numCntCurr). sqlTmpPS_EDITION_T;

            /* �����ԍ� */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpPUCH_ODR_CD := 
                                                             sqlTmp_REC(numCntCurr). sqlTmpPUCH_ODR_CD_T;

            /* ��ЃR�[�h */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpCOMPANY_CD := pvc2CompanyCd;

            /* �����R�[�h */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpVEND_CD := pvc2VendCd;

            /* �x���敪(1:�L���A2:����)�̔��� */
            /* �x���P���}�X�^���A�L���t���O���擾���� */
            numONEROUS_FLG := ONEROUS_FLG_OFF;
            OPEN  CUR_PuchOdrInst_ONEROUS_FLG(
                      pvc2CompanyCd,                                            --��ЃR�[�h
                      pvc2VendCd,                                               --�����R�[�h
                      pvc2PlantCd,                                              --�H��R�[�h
                      sqlTmp_REC(numCntCurr).sqlTmpITEM_CD_T,                   --�i�ڔԍ�
                      sqlTmp_REC(numCntCurr).sqlTmpSCDL_ISSUE_DATE_T            --�o�ɗ\���
                     );
                FETCH CUR_PuchOdrInst_ONEROUS_FLG INTO numONEROUS_FLG ;
                CLOSE CUR_PuchOdrInst_ONEROUS_FLG ;

                IF numONEROUS_FLG = ONEROUS_FLG_ON THEN
                      sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpCONS_TYP := 
                                                                       CONS_TYP_CHARGE;             --�L���x��
-- -- DBMS_OUTPUT.PUT_LINE('�L���x���i');
                ELSE
                      sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpCONS_TYP := 
                                                                       CONS_TYP_NON_CHARGE;         --�����x��
-- -- DBMS_OUTPUT.PUT_LINE('�����x���i');
                END IF;

                /* ��ƌv��ԍ� */
                sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWORK_ODR_CD := '';
         
                /* �d�|��ƃR�[�h */
                sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWORK_IN_PROC_CD := '';    
 
                /* ��Ƌ�R�[�h */
                sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWS_CD := '';          

                /* �H���ۊǏꏊ�R�[�h */
                IF numONEROUS_FLG = ONEROUS_FLG_ON THEN
                
                    --�p�����[�^�擾
                    OPEN CUR_PuchOdrInst_SYS_PARAMETER(
                        pvc2PlantCd || '_ONEROUS_CONS_INV_TYP'               --����
                        );
                    FETCH CUR_PuchOdrInst_SYS_PARAMETER INTO vc2VALUETemp;
                    IF CUR_PuchOdrInst_SYS_PARAMETER%FOUND = FALSE THEN
                        --�G���[
                        RAISE excNOTEXIST_SYS_PARAMETER;
                    END IF;
                    CLOSE CUR_PuchOdrInst_SYS_PARAMETER;
                    
                    IF vc2VALUETemp = 'TRUE' THEN
                        OPEN CUR_PuchOdrInst_Select_M_WH(
                            pvc2CompanyCd,                                           --��ЃR�[�h
                            pvc2VendCd,                                              --�����R�[�h
                            pvc2PlantCd                                              --�H��R�[�h
                            );
                        FETCH CUR_PuchOdrInst_Select_M_WH INTO vc2WH_CDTemp;
                        IF CUR_PuchOdrInst_Select_M_WH%FOUND = FALSE THEN
                            --�G���[
                            RAISE excNOTEXIST_M_WH;
                        END IF;
                        CLOSE CUR_PuchOdrInst_Select_M_WH;
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWH_CD := vc2WH_CDTemp;
                    ELSE
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWH_CD := '';
                    END IF;
                ELSE
                    OPEN CUR_PuchOdrInst_Select_M_WH(
                        pvc2CompanyCd,                                           --��ЃR�[�h
                        pvc2VendCd,                                              --�����R�[�h
                        pvc2PlantCd                                              --�H��R�[�h
                        );
                    FETCH CUR_PuchOdrInst_Select_M_WH INTO vc2WH_CDTemp;
                    IF CUR_PuchOdrInst_Select_M_WH%FOUND = FALSE THEN
                        --�G���[
                        RAISE excNOTEXIST_M_WH;
                    END IF;
                    CLOSE CUR_PuchOdrInst_Select_M_WH;
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWH_CD := vc2WH_CDTemp;
                END IF;

                /* -------------------- */
                /* -- �o�Ɏw���P�ʐ� -- */
                /* -------------------- */
                 /* �[���i�ړW�J�t���O(0:OFF,1:ON) */
                IF  sqlTmp_REC(numCntCurr).sqlTmpODINFO_DISGUISE_T = 1 THEN      --�[���i��
            
--vc2RunChkComment := '���������ʉ� FNC00050�i�[���i�ځj';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                    /* �e�I�[�_�f�}���h�ԍ��̑ޔ� */
                    cv2PARENT_OD_NoTemp := sqlTmp_REC(numCntCurr). sqlTmpPARENT_OD_NO_T;

-- -- DBMS_OUTPUT.PUT_LINE(cv2PARENT_OD_NoTemp);

                    numCntCurr_ISSUE_INST := 0;

-- -- DBMS_OUTPUT.PUT_LINE('���[�v���ʂ��܂���(ٰ�ߑO)');

                    /* �e�f�[�^�̏o�ɒP�ʐ��̃T�[�` */

                    LOOP

-- -- DBMS_OUTPUT.PUT_LINE('���[�v�̒�');

                        EXIT WHEN  sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpOD_NO_T = cv2PARENT_OD_NoTemp ;

                        numCntCurr_ISSUE_INST := numCntCurr_ISSUE_INST + 1;

                    END LOOP;

-- -- DBMS_OUTPUT.PUT_LINE('���[�v���ʂ��܂���(ٰ�ߌ�)');

-- -- DBMS_OUTPUT.PUT_LINE(numCntCurr_ISSUE_INST);

                    /* �o�ɕi�ڍ݌ɐ��ʒP�ʋ敪�̎擾 */
                    OPEN CUR_PuchOdrInst_UNIT_QTY_TYP(
                             sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T
                            );

                    FETCH CUR_PuchOdrInst_UNIT_QTY_TYP INTO numUNIT_QTY_TYP;
                        
                    /* �݌ɐ��ʒP�ʋ敪�̎擾(�O���A�Q���ȏ�Ȃ�G���[) */
                    SELECT
                           COUNT(*) INTO numUNIT_QTY_TYP_REC
                    FROM   M_ITEM
                    WHERE
                           ITEM_CD = sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T
                           ;

-- -- DBMS_OUTPUT.PUT_LINE('���ʔ���s�g�d�m');

                    /* �݌ɐ��ʒP�ʋ敪�擾���ʂ̔��� */
                    IF numUNIT_QTY_TYP_REC <>  1 then

-- -- DBMS_OUTPUT.PUT_LINE('�݌ɐ��ʒP�ʋ敪�擾���s:'|| to_char(numUNIT_QTY_TYP_REC));

                        IF numUNIT_QTY_TYP_REC = 0 THEN                             --�擾�f�[�^�Ȃ�

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTEXIST_DATA,'');

                            RAISE excnumunit_qty_typ;
    
                        ELSE                                                        --�Q���ȏ�̎擾

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTPRIMARY,'');

                            RAISE excnumunit_qty_typ;

                        END IF;
                    END IF;

                    CLOSE CUR_PuchOdrInst_UNIT_QTY_TYP;

              /* �e�i�ڍ݌ɐ��ʒP�ʋ敪�̎擾 */
                    OPEN CUR_PuchOdrInst_UNIT_QTY_TYP(
                             sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpITEM_CD_T
                            );

                    FETCH CUR_PuchOdrInst_UNIT_QTY_TYP INTO numISSUE_INST_UNIT_QTY_TYP;
                        
                    /* �݌ɐ��ʒP�ʋ敪�̎擾(�O���A�Q���ȏ�Ȃ�G���[) */
                    SELECT
                           COUNT(*) INTO numUNIT_QTY_TYP_REC
                    FROM   M_ITEM
                    WHERE
                           ITEM_CD = sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpITEM_CD_T
                           ;


                    /* �݌ɐ��ʒP�ʋ敪�擾���ʂ̔��� */
                    IF numUNIT_QTY_TYP_REC <>  1 then

                        IF numUNIT_QTY_TYP_REC = 0 THEN             --�擾�f�[�^�Ȃ�

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTEXIST_DATA,'');

                            RAISE excnumunit_qty_typ;
    
                        ELSE                                                        --�Q���ȏ�̎擾

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTPRIMARY,'');

                            RAISE excnumunit_qty_typ;

                        END IF;
                    END IF;

                    CLOSE CUR_PuchOdrInst_UNIT_QTY_TYP;

-- #:781 DEL                   /* �o�ɒP�ʐ� = �e�f�[�^.�\���P�ʐ� * �q�f�[�^.�o�ɒP�ʐ����q / �q�f�[�^.�o�ɒP�ʐ����� */
-- #:781 DEL                   sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
-- #:781 DEL                       sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
-- #:781 DEL                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
-- #:781 DEL                               sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;
--
-- -- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_REC(1). sqlTmpPS_UNIT_QTY_T);
-- -- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_REC(1). sqlTmpPS_UNIT_DENOMINATOR_T);
-- -- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_REC(1). sqlTmpPS_UNIT_NUMERATOR_T);

-- -- DBMS_OUTPUT.PUT_LINE('�o�ɒP�ʐ�1�F' ||  sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY);
                    IF numISSUE_INST_UNIT_QTY_TYP = 1 THEN                      --�e�i�ڍ݌ɐ��ʒP�ʋ敪=1(����)
                        /* �e�i�ڂ̏o�Ɏw�������Z�o */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                           CEIL(pnumPuchOdrQty * sqlTmp_REC(numCntCurr_ISSUE_INST).sqlTmpPS_UNIT_NUMERATOR_T /
                             sqlTmp_REC(numCntCurr_ISSUE_INST).sqlTmpPS_UNIT_DENOMINATOR_T) ;
                     ELSE
                        /* �e�i�ڂ̏o�Ɏw�������Z�o */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                           CEIL((pnumPuchOdrQty * sqlTmp_REC(numCntCurr_ISSUE_INST).sqlTmpPS_UNIT_NUMERATOR_T /
                              sqlTmp_REC(numCntCurr_ISSUE_INST).sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;
                    END IF;

                    IF numUNIT_QTY_TYP = 1 THEN                                 --�݌ɐ��ʒP�ʋ敪=1(����)

-- --vc2RunChkComment := '���������ʉ� FNC00060�i�����j';
-- --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
  /* #:781 ADD �� */

                    /* �o�ɒP�ʐ� = �e�f�[�^.�\���P�ʐ� * �q�f�[�^.�o�ɒP�ʐ����q / �q�f�[�^.�o�ɒP�ʐ����� */
                    /* �����؏グ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) ;
 
                    /* �o�Ɏw���P�ʐ����� */
                    /* �����؏グ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN :=
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_DENOMINATOR_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T * 10000) / 10000 ;

                    /* �o�Ɏw���P�ʐ����q */
                    /* �����؏グ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM :=
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_NUMERATOR_T *
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T * 10000) / 10000 ;
                            
  /* #:837 ADD �� */
                        /* �o�Ɏw���� = �����؏グ( ������ * �e�f�[�^�\���P�ʐ� * �o�ɒP�ʐ����q / �o�ɒP�ʐ����� ) */
                        /*sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((pnumPuchOdrQty * sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T) /
                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) 
                                ;*/
                         IF SYS_SPOIL_FLG = 1 THEN
                            /* �o�Ɏw���� = �����؏グ( ������ *�i1�{�d���� �j���o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ����� ) */
                            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                               CEIL(sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY * (1+ sqlTmp_REC(numCntCurr).sqlTmpPS_SPOIL/100) *
                                sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_NUMERATOR_T /
                                 sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_DENOMINATOR_T) ;
                         ELSE
                             /* �o�Ɏw���� = �����؏グ( ������ * �o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ����� ) */
                            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                               CEIL(sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY * sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_NUMERATOR_T /
                                 sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_DENOMINATOR_T) ;
                         END IF;


  /* #:837 END �� */
  /* #:837 DEL �� */
--                        /* �o�Ɏw���� = �����؏グ( �o�ɒP�ʐ� * �����w���� ) */
--                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
--                        CEIL((sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
--                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
--                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) *
--                                 pnumPuchOdrQty) ;
  /* #:837 END �� */
  /* #:781 END �� */
-- #:781 DEL                            CEIL(sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY * 
-- #:781 DEL                                 pnumPuchOdrQty) ;

-- -- DBMS_OUTPUT.PUT_LINE('�o�Ɏw����2�F' ||  sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY);

                    ELSE                                                        --�݌ɐ��ʒP�ʋ敪=2(����)

--vc2RunChkComment := '���������ʉ� FNC00070�i�����j';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
  /* #:781 ADD �� */

                    /* �o�Ɏw���P�ʐ����� */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN :=
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_DENOMINATOR_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T * 10000) / 10000 ;

                    /* �o�Ɏw���P�ʐ����q */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM :=
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_NUMERATOR_T *
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T * 10000) / 10000;
                    
                    /* �o�ɒP�ʐ� = �e�f�[�^.�\���P�ʐ� * �q�f�[�^.�o�ɒP�ʐ����q / �q�f�[�^.�o�ɒP�ʐ����� */
                    /* �����؏グ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
                        CEIL((sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;

                        /* �o�Ɏw���� = ������5�ʐ؏グ( ������ * �e�f�[�^�\���P�ʐ� * �o�ɒP�ʐ����q / �o�ɒP�ʐ����� ) */
  /* #:837 ADD �� */
                      /*sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL(((pnumPuchOdrQty * sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T) /
                                 sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;*/
                     
                     IF SYS_SPOIL_FLG = 1 THEN
                        /* �o�Ɏw���� = ������5�ʐ؏グ( ������ *(1+�d����)* �o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ����� ) */
                       sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                         CEIL((sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY * (1+ sqlTmp_REC(numCntCurr).sqlTmpPS_SPOIL/100) *
                              sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_NUMERATOR_T /
                                sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;
                     ELSE
                        /* �o�Ɏw���� = ������5�ʐ؏グ( ������ * �o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ����� ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                          CEIL((sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY * sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_NUMERATOR_T /
                                sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;
                     END IF;
                                 
                                 
  /* #:837 END �� */
  /* #:837 DEL �� */
--                      sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
--                        CEIL(((sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
--                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
--                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) *
--                                   pnumPuchOdrQty) * 10000)
--                            / 10000 ;
  /* #:837 END �� */
  /* #:781 END �� */
-- #:781 DEL                            CEIL(( sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY * 
-- #:781 DEL                                   pnumPuchOdrQty) * 10000)
-- #:781 DEL                            / 10000 ;

-- -- DBMS_OUTPUT.PUT_LINE('�o�Ɏw����4�F' ||  sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY);

                    END IF;

                ELSE                                                            --�[���t���O=0(�[���ȊO)

--vc2RunChkComment := '���������ʉ� FNC00080�i�[���ȊO�j';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            
-- #:781 DEL                    /* �o�Ɏw���P�ʐ� = �x���i���i�\���P�ʐ����q / �x���i���i�\���P�ʐ����� */
-- #:781 DEL                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
-- #:781 DEL                        sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
-- #:781 DEL                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;

                    /* �݌ɐ��ʒP�ʋ敪�̎擾 */
                
                    OPEN CUR_PuchOdrInst_UNIT_QTY_TYP( sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T);
                
                    FETCH CUR_PuchOdrInst_UNIT_QTY_TYP INTO numUNIT_QTY_TYP;
                
                    /* �݌ɐ��ʒP�ʋ敪�̎擾(�O���A�Q���ȏ�Ȃ�G���[) */
                    SELECT COUNT(*) INTO numUNIT_QTY_TYP_REC
                    FROM M_ITEM
                    WHERE ITEM_CD =  sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T;

                    IF numUNIT_QTY_TYP_REC <>  1 then

-- -- DBMS_OUTPUT.PUT_LINE('�݌ɐ��ʒP�ʋ敪�擾���s:'|| to_char(numUNIT_QTY_TYP_REC));

                        IF numUNIT_QTY_TYP_REC = 0 THEN                         --�擾�f�[�^�Ȃ�

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTEXIST_DATA,'');
                                                
                        RAISE excnumunit_qty_typ;

                        ELSE                                                    --�Q���ȏ�̎擾

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTPRIMARY,'');
                        
                            RAISE excnumunit_qty_typ;
                        END IF;
                    END IF;
                
                    CLOSE CUR_PuchOdrInst_UNIT_QTY_TYP;

                    IF numUNIT_QTY_TYP = 1 THEN                                 --�݌ɐ��ʒP�ʋ敪=1(�����Ǘ�)

--vc2RunChkComment := '���������ʉ� FNC00090�i�����j';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
  /* #:781 ADD �� */
  
                    /* �o�Ɏw���P�ʐ����� */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;
                    /* �o�Ɏw���P�ʐ����q */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ;
  
                    /* �o�Ɏw���P�ʐ� = �x���i���i�\���P�ʐ����q / �x���i���i�\���P�ʐ����� */
                    /* �����؏グ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
                        CEIL(sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) ;
  /* #:837 ADD �� */
                     IF SYS_SPOIL_FLG = 1 THEN
                        /* �o�Ɏw���� = �����؏グ( ������ * (1+�d����) *�P�ʐ����q / �P�ʐ����� ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((pnumPuchOdrQty * (1+ sqlTmp_REC(numCntCurr).sqlTmpPS_SPOIL/100) *
                                  sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T) /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) ;
                      ELSE
                        /* �o�Ɏw���� = �����؏グ( ������ * �P�ʐ����q / �P�ʐ����� ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((pnumPuchOdrQty * sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T) /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) ;
                      END IF;   
  /* #:837 END �� */
  /* #:837 DEL �� */
--                        /* �o�Ɏw���� = �����؏グ( �o�ɒP�ʐ� * �����w���� ) */
--                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
--                        CEIL((sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
--                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) *
--                                pnumPuchOdrQty);
  /* #:837 END �� */
  /* #:781 END �� */
-- #:781 DEL                            CEIL(sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY * 
-- #:781 DEL                                pnumPuchOdrQty);

                    ELSE                                                        --�݌ɐ��ʒP�ʋ敪=2(�����Ǘ�)
                
--vc2RunChkComment := '���������ʉ� FNC00100�i�����j';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
  /* #:781 ADD �� */
  
                    /* �o�Ɏw���P�ʐ����� */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;
                    /* �o�Ɏw���P�ʐ����q */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ;
 
                    /* �o�Ɏw���P�ʐ� = �x���i���i�\���P�ʐ����q / �x���i���i�\���P�ʐ����� */
                    /* �����؏グ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
                        CEIL((sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;
                    IF SYS_SPOIL_FLG = 1 THEN
                        /* �o�Ɏw���� = ������5�ʐ؏グ( �o�ɒP�ʐ� * �����w����*(1+�d����) ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((( pnumPuchOdrQty * (1+ sqlTmp_REC(numCntCurr).sqlTmpPS_SPOIL/100) *
                                 sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ) /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000;
                    ELSE
                        /* �o�Ɏw���� = ������5�ʐ؏グ( �o�ɒP�ʐ� * �����w���� ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((( pnumPuchOdrQty  *  sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ) /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000;
                    END IF;
  /* #:837 END �� */
  /* #:837 DEL �� */
--                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
--                        CEIL(((sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
--                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) *
--                                pnumPuchOdrQty) * 10000) / 10000;
  /* #:837 END �� */
  /* #:781 END �� */
-- #:781 DEL                            CEIL(( sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY * 
-- #:781 DEL                                pnumPuchOdrQty) * 10000) / 10000;
                    END IF;
                END IF;

            /* �o�Ɏw���P�ʐ����� */
            /*sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;*/
            /* �o�Ɏw���P�ʐ����q */
            /*sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ;*/
            /* �o�ɗ݌v�� */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpTOTAL_ISSUE_QTY := 0 ;

            /* �o�ɗ\��� */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpSCDL_ISSUE_DATE := 
                                           sqlTmp_REC(numCntCurr). sqlTmpSCDL_ISSUE_DATE_T;

            /* �o�Ɋ����� */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_CMPLT_DATE := NULL;

            /* �o�Ɏw���o�ɋ敪 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_TYP :=
                             sqlTmp_REC(numCntCurr). sqlTmpISSUE_TYP_T;
                            
-- -- DBMS_OUTPUT.PUT_LINE('�o�Ɏw���o�ɋ敪'||  sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_TYP);
                
            /* �o�Ɋ����t���O */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_CMPLT_FLG := 0;

            /* �o�Ɏw�������s�ς݃t���O */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_ISS_FLG := 0;

            /* �o�Ɏw�������s�� */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_ISS_DATE := NULL;

            /* �o�Ɏw�����l */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_COMMENT := '';

            numCntMax_ISSUE_INST := numCntMax_ISSUE_INST + 1;

        END IF;

        numCntCurr := numCntCurr + 1;

-- -- DBMS_OUTPUT.PUT_LINE('���f�[�^�̈ڂ��ւ���');

    END LOOP;

-- -- DBMS_OUTPUT.PUT_LINE('LOOP END');

    /* TraceLog�̏o�͏������s��<�o�Ɏw���f�[�^�쐬�����I��> */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END_PGNM_ISSUE_INST);

-- -- DBMS_OUTPUT.PUT_LINE('���Ώۃf�[�^�̔��聖');

    IF numCntCurr <> 0 THEN                                                     --�Ώۃf�[�^���Ȃ��ꍇ�͏������Ȃ�

--vc2RunChkComment := '���������ʉ� FNC00110';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* TraceLog�̏o��(Start)�������s��<�o�Ɏw���f�[�^�ǉ������J�n> */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START_PGNM_TOD_ADD);
    
-- -- DBMS_OUTPUT.PUT_LINE('�������o�Ɏw���̏����ݏ���������');

        /* �o�Ɏw���t�@�C���֒ǉ� */
        numCntCurr := 0;
        LOOP
            EXIT WHEN numCntMax_ISSUE_INST <= numCntCurr;

-- -- DBMS_OUTPUT.PUT_LINE(numCntCurr ||  sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_CD);      
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPLANT_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpOD_NO);              
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpITEM_CD);            
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPS_EDITION);         
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPUCH_ODR_CD);        
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpCOMPANY_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpVEND_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpCONS_TYP);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWORK_ODR_CD);        
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWORK_IN_PROC_CD);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWS_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWH_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_QTY);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_DEN);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_NUM);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_QTY);     
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpTOTAL_ISSUE_QTY);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpSCDL_ISSUE_DATE);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_CMPLT_DATE);   
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_TYP);          
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_CMPLT_FLG);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_ISS_FLG); 
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_ISS_DATE);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_COMMENT);

-- ���� 2008/08/06 ADD START -TSUCHIDA����
			OPEN CUR_PuchOdrInst_MANHOUR_TYP(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpITEM_CD);
			FETCH CUR_PuchOdrInst_MANHOUR_TYP INTO numMANHOUR_TYP;
			CLOSE CUR_PuchOdrInst_MANHOUR_TYP;
-- ���� 2008/08/06 ADD END -TSUCHIDA����
-- ���� 2008/08/06 ADD START -TSUCHIDA����
			-- �H���Ǘ��i�ڋ敪���P�F�H���Ǘ��i�ڂ̏ꍇ���O
			IF numMANHOUR_TYP != 1 THEN
-- ���� 2008/08/06 ADD END -TSUCHIDA����
            INSERT INTO T_ISSUE_INST(
                ISSUE_INST_CD,
                PLANT_CD,
                OD_NO,
                ITEM_CD,
                PS_EDITION,
                PUCH_ODR_CD,
                COMPANY_CD,
                VEND_CD,
                CONS_TYP,
                WORK_ODR_CD,
                WORK_IN_PROC_CD,
                WS_CD,
                WH_CD,
                ISSUE_INST_UNIT_QTY,
                ISSUE_INST_UNIT_DENOMINATOR,
                ISSUE_INST_UNIT_NUMERATOR,
                ISSUE_INST_QTY,
                TOTAL_ISSUE_QTY,
                SCDL_ISSUE_DATE,
                ISSUE_CMPLT_DATE,
                ISSUE_TYP,
                ISSUE_CMPLT_FLG,
                ISSUE_INST_ISS_FLG,
                ISSUE_INST_ISS_DATE,
                ISSUE_INST_COMMENT,
                CREATED_DATE,
                CREATED_BY,
                CREATED_PRG_NM,
                UPDATED_DATE,
                UPDATED_BY,
                UPDATED_PRG_NM,
                MODIFY_COUNT
                )
            VALUES(                
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_CD,      
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPLANT_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpOD_NO,              
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpITEM_CD,            
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPS_EDITION,         
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPUCH_ODR_CD,        
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpCOMPANY_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpVEND_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpCONS_TYP,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWORK_ODR_CD,        
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWORK_IN_PROC_CD,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWS_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWH_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_QTY,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_DEN,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_NUM,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_QTY,     
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpTOTAL_ISSUE_QTY,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpSCDL_ISSUE_DATE,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_CMPLT_DATE,   
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_TYP,          
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_CMPLT_FLG,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_ISS_FLG, 
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_ISS_DATE,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_COMMENT,
                 SYSDATE,
                 pvc2UserId,
                 MY_SQL_NAME,
                 SYSDATE,
                 pvc2UserId,
                 MY_SQL_NAME,
                 0
                );
-- ���� 2008/08/06 ADD START -TSUCHIDA����
			END IF;
-- ���� 2008/08/06 ADD END -TSUCHIDA����

-- -- DBMS_OUTPUT.PUT_LINE('***�����ݏI��***�F');

            numCntCurr := numCntCurr + 1;

        END LOOP;

-- -- DBMS_OUTPUT.PUT_LINE('***�����ݏ���***�F'|| numCntCurr);
-- DBMS_OUTPUT.PUT_LINE('***�o�Ɏw���f�[�^�쐬�����I��***�F');

        /* TraceLog�̏o�͏������s��<�o�Ɏw���f�[�^�쐬�����I��> */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END_PGNM_TOD_ADD);

    END IF;

--vc2RunChkComment := '���������ʉ� FNC00120';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);

-- -- DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN True;

--< ��O���� >---------------------------------------------------------------

EXCEPTION

    WHEN excGetNewIssInstCd THEN --//�����̔ԂɎ��s

-- -- DBMS_OUTPUT.PUT_LINE('�������̔ԂɎ��s��');

        /* �ُ�I���̃��b�Z�[�W�쐬 */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                             '(SBM0050)' || METHOD_END || LOGMSG_ERR || '�F' || '�����̔ԂɎ��s���܂����B');


        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME,  '(SBM0702)'||METHOD_END || vc2RunChkComment);


        /* TraceLog�̏o�� */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                                        
    blnErrFLG := False;   --ܰ�ݸ�

    RETURN False;

    WHEN excnumunit_qty_typ THEN --//�݌ɒP�ʋ敪�擾�Ɏ��s

-- -- DBMS_OUTPUT.PUT_LINE('���݌ɒP�ʋ敪�擾�Ɏ��s��');

        /* �ُ�I���̃��b�Z�[�W */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                             '(SBM0051)' || METHOD_END || LOGMSG_ERR || '�F' || '�݌ɒP�ʋ敪�擾�Ɏ��s���܂����B');
                             

        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END || vc2RunChkComment);


        /* TraceLog�̏o�� */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                                    
    blnErrFLG := False; --ܰ�ݸ�
    RETURN False;

    WHEN excNOTEXIST_M_WH THEN   --�ۊǋ�f�[�^�����݂��܂���
    
        /* �ُ�I���̃��b�Z�[�W */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                            '(SBM0052)' || METHOD_END || LOGMSG_ERR || '�F' || '�ۊǋ�R�[�h�̎擾�Ɏ��s���܂����B');
                             

        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END || vc2RunChkComment);


        /* TraceLog�̏o�� */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                                    
    blnErrFLG := True; --�G���[
    pvc2ErrorCd := 'ZZ11006';
    RETURN False;
    
    WHEN excNOTEXIST_SYS_PARAMETER THEN   --�p�����[�^�f�[�^�����݂��܂���
    
        /* �ُ�I���̃��b�Z�[�W */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                             '(SBM0053)' || METHOD_END || LOGMSG_ERR || '�F' || '�p�����[�^�̎擾�Ɏ��s���܂����B');
                             

        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END || vc2RunChkComment);


        /* TraceLog�̏o�� */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                                    
    blnErrFLG := True; --�G���[
    pvc2ErrorCd := 'ZZ06001';
    RETURN False;
    

    WHEN OTHERS THEN   --���̑��̃G���[

-- -- DBMS_OUTPUT.PUT_LINE('�����̑��̃G���[�o�Ɏw����');

            /* ���b�Z�[�W�̍쐬 */
            vc2Comment := SUBSTRB( '(SBM0054)' || METHOD_END || LOGMSG_ERR || '�F' || SQLCODE ||SQLERRM,1,1024);
            
            /* �ُ�I���̃��b�Z�[�W */
            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                                 APS_COM_ORACLE_ERR,
                                 vc2Comment );

                                 
           /* TraceLog �̏o�́i���s�ʒu�j */
            blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END || vc2RunChkComment);

            --//TraceLog�̏o��
            blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                     
    blnErrFLG := True; --�װ
    RETURN False;

END;
/
