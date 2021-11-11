CREATE OR REPLACE FUNCTION FNCINSIDEISSUEINSTRUCTION(
/*------------------------------------------------------------------------------
' $Id: FncInsideIssueInstruction.sql,v 1.10 2013/06/03 07:08:51 tai-yanhong Exp $
' version   : 1.00.00
'
' �C������
' 2003.08.06 ����
' 2003.08.27 �p�����[�^�C���A�o�Ɏw���ݒ�l�ǉ�
' 2003.11.03 DBMS_OUTPUT�̃R�����g�A�E�g
' 2003.12.10 �o�Ɏw�����v�Z���@�̏C���B
' 2003.12.11 �^���i�ڎ��̏o�ɒP�ʐ��A�o�ɒP�ʐ�����A�o�ɒP�ʐ����q�̌v�Z�́A
'            ������T�ʐ؂�グ�ƏC���B
' 2004.09.24 SUBSTR��SUBSTRB�ɕύX
' 2005.10.21 unicode�Ή��ivarchar2��4�{�ASUBSTRB�̈�����4�{�j
' 2007.02.26 ���H���̎d�|��ƃR�[�h�̎擾���@���C��
'
' �@�\      : �o�Ɏw�������i����j
'
' �߂�l    : Boolean
'               True :����I���i�o�Ɏw�������i����j���s�������j
'               False:�ُ�I���i�o�Ɏw�������i����j�Ɏ��s�������j
'
' ������    : pFileHandle          - (i)�t�@�C���n���h��
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             pvc2WorkOdrCd        - (i)��ƌv��ԍ�
'             pvc2WorkInProcCd     - (i)�d�|��ƃR�[�h
'             pvc2OdCd             - (i)�I�[�_�f�}���h�ԍ�
'             pnumOprInstQty       - (i)��Ǝw����
'             pvc2OprRsltTyp       - (i)�i�ڕʍ�Ǝ��ы敪
'
' �@�\����  : ��Ǝw���m��ɔ����A�K�v�ƂȂ鎑�ނ̏o�Ɏw�����쐬����B
'         �{�����́A����i�̍�ƌv����ɑ΂��鉺�ʕi�ڂ̏o�Ɏw�����A���ꂼ��̃f�}���h
'         �������Ƃɍ쐬����B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pFileHandle             IN  UTL_FILE.FILE_TYPE  --�t�@�C���n���h��
   ,pvc2LogMode             IN  VARCHAR2            --�k�n�f���[�h
   ,pvc2OutputMode          IN  VARCHAR2            --�o�̓��[�h
   ,pvc2UserId              IN  VARCHAR2            --���[�U�h�c
   ,pvc2BusinessName        IN  VARCHAR2            --�Ɩ���
   ,pvc2PlantCd             IN  VARCHAR2            --�H��R�[�h
   ,pvc2WorkOdrCd           IN  VARCHAR2            --��ƌv��ԍ�
   ,pvc2WorkInProcCd        IN  VARCHAR2            --�d�|��ƃR�[�h
   ,pvc2OdCd                IN  VARCHAR2            --�I�[�_�f�}���h�ԍ�
   ,pnumOprInstQty          IN  NUMBER              --��Ǝw����
   ,pvc2OprRsltTyp          IN  VARCHAR2            --�i�ڕʍ�Ǝ��ы敪
) RETURN BOOLEAN
IS
    /* �萔�̐錾 */
    OPR_RSLT_TYP_TURNOVER   NUMBER      := 1;   --�i�ڕʍ�Ǝ��ы敪�@�o����
--  OPR_RSLT_TYP_ITEM       NUMBER      := 2;   --�i�ڕʍ�Ǝ��ы敪�@��Ǝw������ nesn del
    OPR_RSLT_TYP_PROC       NUMBER      := 2;   --�i�ڕʍ�Ǝ��ы敪�@��ƌn�� nesn  3->2
    --�G���[��
    APS_COM_ORACLE_ERR      NUMBER      := 53401;   --ORACLE Error
    APS_COM_OTHER_ERR       NUMBER      := 53402;   --OTHER Error
    --// ���R�[�h�̒�`
    --//���v�ʃf�[�^�Ǎ��p
    type Typ_TOD is RECORD(
--      TypOD_NO_TOD                NUMBER(014),    --// �I�[�_�f�}���h�ԍ� nesn del
        TypOD_NO_TOD                VARCHAR2(100),  --// �I�[�_�f�}���h�ԍ� nesn
        TypITEM_CD_TOD              VARCHAR2(100),  --// �i�ڔԍ�
        TypPS_EDITION_TOD           VARCHAR2(100),  --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
--      TypPS_UNIT_QTY_TOD          VARCHAR2(100),  --// ���i�\���P�ʐ� nesn del
        TypPS_UNIT_QTY_TOD          NUMBER(18,4),   --// ���i�\���P�ʐ� nesn 0830
        TypPS_UNIT_DENOMINATOR_TOD  NUMBER(18,4),   --// ���i�\���P�ʐ����� nesn 0830
        TypPS_UNIT_NUMERATOR_TOD    NUMBER(18,4),   --// ���i�\���P�ʐ����q nesn 0830
        TypITEM_ODR_TYP_TOD         NUMBER(002),    --// �i�ڎ�z�敪
        TypOD_TYP_TOD               NUMBER(002),    --// �I�[�_�f�}���h�敪
--      TypPARENT_OD_NO_TOD         NUMBER(014),    --// �e�I�[�_�f�}���h�ԍ� nesn del
        TypPARENT_OD_NO_TOD         VARCHAR2(100),  --// �e�I�[�_�f�}���h�ԍ� nesn
        TypISSUE_TYP_TOD            NUMBER(002),    --// ���v�ʏo�ɋ敪
        TypPLANT_CD_TOD             VARCHAR2(8),    --// ���v�ʍH��R�[�h nesn
        TypPATTERN_CD_TOD			VARCHAR2(100),  --// �p�^�[���R�[�h
        TypSCDL_ISSUE_DATE_TOD      DATE,           --// �o�ɗ\��� nesn
        TypPS_SPOIL                 NUMBER(9,4)); --���v�ʍ\���d����      
    LTypsqlCurr_REC     Typ_TOD;
    type Typ_TOD_DISGUISE is RECORD(
--      TypOD_NO_TOD                NUMBER(014),    --// �I�[�_�f�}���h�ԍ� nesn del
        TypOD_NO_TOD                VARCHAR2(100),  --// �I�[�_�f�}���h�ԍ� nesn
        TypITEM_CD_TOD              VARCHAR2(100),  --// �i�ڔԍ�
        TypPS_EDITION_TOD           VARCHAR2(100),  --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
--      TypPS_UNIT_QTY_TOD          VARCHAR2(100),  --// ���i�\���P�ʐ� nesn del
        TypPS_UNIT_QTY_TOD          NUMBER(18,4),   --// ���i�\���P�ʐ� nesn 0830
        TypPS_UNIT_DENOMINATOR_TOD  NUMBER(18,4),   --// ���i�\���P�ʐ����� nesn 0830
        TypPS_UNIT_NUMERATOR_TOD    NUMBER(18,4),   --// ���i�\���P�ʐ����q nesn 0830
        TypITEM_ODR_TYP_TOD         NUMBER(002),    --// �i�ڎ�z�敪
        TypOD_TYP_TOD               NUMBER(002),    --// �I�[�_�f�}���h�敪
--      TypPARENT_OD_NO_TOD         NUMBER(014),    --// �e�I�[�_�f�}���h�ԍ� nesn del
        TypPARENT_OD_NO_TOD         VARCHAR2(100),  --// �e�I�[�_�f�}���h�ԍ� nesn
        TypISSUE_TYP_TOD            NUMBER(002),    --// ���v�ʏo�ɋ敪
        TypPLANT_CD_TOD             VARCHAR2(8),  --// ���v�ʍH��R�[�h nesn
        TypPATTERN_CD_TOD			VARCHAR2(100),  --// �p�^�[���R�[�h
        TypSCDL_ISSUE_DATE_T        DATE,             --// �o�ɗ\��� nesn
        TypPS_SPOIL                 NUMBER(9,4)); --���v�ʍ\���d����
    LTypsqlCurr_REC_DISGUISE        Typ_TOD_DISGUISE;
    --//��ƌv��ʏo�Ɍv��f�[�^�i�s�d�l�o�j�쐬�p
    type Typ is RECORD(
        TypPUCH_ODR_CD_T            VARCHAR2(100),  --// �����ԍ�
--      TypOD_NO_T                  NUMBER(014),    --// �I�[�_�f�}���h�ԍ� nesn del
        TypOD_NO_T                  VARCHAR2(100),  --// �I�[�_�f�}���h�ԍ� nesn
        TypITEM_CD_T                VARCHAR2(100),  --// �i�ڔԍ�
        TypPS_EDITION_T             VARCHAR2(100),  --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
--      TypPS_UNIT_QTY_T            VARCHAR2(100),  --// ���i�\���P�ʐ� nesn del
        TypPS_UNIT_QTY_T            NUMBER(18,4),   --// ���i�\���P�ʐ� nesn 0830
        TypPS_UNIT_DENOMINATOR_T    NUMBER(18,4),   --// ���i�\���P�ʐ����� nesn 0830
        TypPS_UNIT_NUMERATOR_T      NUMBER(18,4),   --// ���i�\���P�ʐ����q nesn 0830
        TypTOTALISSUETYP_T          NUMBER(002),    --// �o�Ɏw���݌v��
        TypMRP_ODR_TYP_T            NUMBER(002),    --// �o�Ɏw���敪(�i�ڎ�z�敪)
        TypODINFO_DISGUISE_T        NUMBER(002),    --// �[���i�ړW�J�t���O(0:OFF,1:ON)
--      TypPARENT_OD_NO_T           NUMBER(014),    --// �e�I�[�_�f�}���h�ԍ� nesn del
        TypPARENT_OD_NO_T           VARCHAR2(100),  --// �e�I�[�_�f�}���h�ԍ� nesn
        TypISSUE_TYP_T              NUMBER(002),    --// ���v�ʏo�ɋ敪
        TypPLANT_CD_T               VARCHAR2(8),  --// ���v�ʍH��R�[�h nesn
        TypSCDL_ISSUE_DATE_T        DATE,           --// �o�ɗ\��� nesn
        TypPATTERN_CD_T				VARCHAR2(100),  --// �p�^�[���R�[�h
        TypPARENT_ITEM_NO_T         VARCHAR2(100),  --// �e�i�ڔԍ�
        TypPS_SPOIL                 NUMBER(9,4)); --���v�ʍ\���d����
    TYPE Typ_REC_T IS TABLE OF Typ INDEX BY BINARY_INTEGER;
    Typ_REC Typ_REC_T;
    --//�o�Ɏw���f�[�^�i�s�d�l�o�j
    --//��ƌv��ʏo�Ɍv��f�[�^�ҏW�����f�[�^���i�[����B
    --//�����̍\���̂���ɏo�Ɏw���f�[�^��ǉ�����B
    vc2ISSUE_INST_CD                VARCHAR2(100);  --// �o�Ɏw���ԍ�
    vc2PLANT_CD                     VARCHAR2(8);   --// �H��R�[�h
--  numOD_NO                        NUMBER(014);    --// �I�[�_�f�}���h�ԍ� nesn del
    vc2OD_NO                        VARCHAR2(100);  --// �I�[�_�f�}���h�ԍ� nesn
    vc2ITEM_CD                      VARCHAR2(100);  --// �o�ɕi�ڔԍ�
    vc2PS_EDITION                   VARCHAR2(100);  --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
    vc2PUCH_ODR_CD                  VARCHAR2(100);  --// �����ԍ�
    vc2WORK_ODR_CD                  VARCHAR2(100);  --// ��ƌv��ԍ�
    vc2WORK_IN_PROC_CD              VARCHAR2(100);  --// �d�|��ƃR�[�h
    numISSUE_INST_UNIT_QTY          NUMBER(18,4);   --// �o�Ɏw���P�ʐ�
    numISSUE_INST_UNIT_DENOMINATOR  NUMBER(18,4);   --// �o�Ɏw���P�ʐ�����
    numISSUE_INST_UNIT_NUMERATOR    NUMBER(18,4);   --// �o�Ɏw���P�ʐ����q
    --numISSUE_INST_QTY               NUMBER(18,4);   --// �o�Ɏw����
    numISSUE_INST_QTY               NUMBER(18,5);   --// �o�Ɏw����
    numTOTAL_ISSUE_QTY              NUMBER(18,4);   --// �o�ɗ݌v��
    dtmSCDL_ISSUE_DATE              DATE;           --// �o�ɗ\���
    dtmISSUE_CMPLT_DATE             DATE;           --// �o�Ɋ�����
    numISSUE_TYP                    NUMBER(1);      --// �o�Ɏw���o�ɋ敪
    numISSUE_CMPLT_FLG              NUMBER(1);      --// �o�Ɋ����t���O
    numISSUE_INST_ISS_FLG           NUMBER(1);      --// �o�Ɏw�������s�ς݃t���O
    dtmISSUE_INST_DATE              DATE;           --// �o�Ɏw�������s��
    vc2ISSUE_INST_COMMENT           VARCHAR2(320);  --// �o�Ɏw�����l
    --//�[���i�ڃf�[�^�i�s�d�l�o�j
    type Typ_DISGUISE is RECORD(
        TypWORK_ODR_CD             VARCHAR2(100),   --// ��ƌv��ԍ�
--      TypOD_NO                   NUMBER(014),     --// �I�[�_�f�}���h�ԍ� nesn del
        TypOD_NO                   VARCHAR2(100),   --// �I�[�_�f�}���h�ԍ� nesn
        TypITEM_CD                 VARCHAR2(100),   --// �o�ɕi�ڔԍ�
        TypPS_EDITION              VARCHAR2(100),   --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
        TypISSUE_INST_UNIT_QTY     NUMBER(18,4),    --// �o�Ɏw���P�ʐ�
        TypISSUE_TYP               NUMBER(002),     --// �o�ɋ敪
        TypTOTAL_ISSUE_TYP         NUMBER(18,4),    --// �o�Ɏw���݌v��
--      TypPARENT_OD_NO            NUMBER(014),     --// �e�I�[�_�f�}���h�ԍ� nesn del
        TypPARENT_OD_NO            VARCHAR2(100),   --// �e�I�[�_�f�}���h�ԍ� nesn
        TypISSUE_INST_TYP          NUMBER(1),       --// �o�Ɏw���敪
        TypDISGUISE_FLG            NUMBER(1));      --// �[���i�ړW�J�t���O
    TYPE Typ_DISGUISE_REC_T IS TABLE OF Typ_DISGUISE INDEX BY BINARY_INTEGER;
    Typ_DISGUISE_REC    Typ_DISGUISE_REC_T;
    --// �J�[�\���̐錾
    --// ���v�ʃf�[�^�Ǎ�
    cursor Cur_PuchOdrInst_SelectTOD1(COD_NO VARCHAR2) IS
                 select
                    OD.OD_NO,
                    OD.PLANT_CD,
                    OD.ITEM_CD,
                    OD.PS_EDITION,
                    OD.PS_UNIT_QTY,
                    OD.PS_UNIT_DENOMINATOR,
                    OD.PS_UNIT_NUMERATOR,
                    OD.MRP_ODR_TYP,
                    OD.OD_TYP,
                    OD.PARENT_OD_NO,
                    OD.ISSUE_TYP,
                    --OD.DUE_DATE
                    OD.DUE_DATE,
                    OD.PATTERN_CD,
                    PS_SPOIL
          from  T_OD OD
          where     OD.PARENT_OD_NO = COD_NO;
     /*�V�X�e���p�����[�^�i�d�����j*/
     CURSOR CUR_SystemSpoilFlg  IS
         SELECT 
                 VALUE
         FROM  SYS_PARAMETER
         WHERE NAME='SPOIL_FLG';
    --// ���v�ʃf�[�^�Ǎ��i�i�ڎ�z�敪:8(�[���i��)���̉��ʃf�}���h�T�}�����̒ǉ��p)
    cursor Cur_PuchOdrInst_SelectTOD2(COD_NO VARCHAR2) IS
                  select
                    OD.OD_NO,
                    OD.PLANT_CD,
                    OD.ITEM_CD,
                    OD.PS_EDITION,
                    OD.PS_UNIT_QTY,
                    OD.PS_UNIT_DENOMINATOR,
                    OD.PS_UNIT_NUMERATOR,
                    OD.MRP_ODR_TYP,
                    OD.OD_TYP,
                    OD.PARENT_OD_NO,
                    OD.ISSUE_TYP,
                    --OD.DUE_DATE
                    OD.DUE_DATE,
                    OD.PATTERN_CD,
                    PS_SPOIL
          from  T_OD OD
          where     OD.PARENT_OD_NO = COD_NO;
    --// �݌ɐ��ʒP�ʋ敪�̎擾�i�i�ڃe�[�u�����i����:��e�[�u���j�j
    --// �o�Ɏw���쐬���ɋ[���i�ړW�J�t���O:1(ON)�̏ꍇ�̏o�ɒP�ʐ��A
    --// �o�Ɏw�����̗L���������I�[�o�[�������̍݌ɐ��ʒP�ʋ敪�̔���
    cursor Cur_PuchOdrInst_UNIT_QTY_TYP(CITEM_CD VARCHAR2) IS
        select UNIT_QTY_TYP
          from  M_ITEM
          where ITEM_CD = CITEM_CD;
--//----------------------------------------------------------------------------
--// nesn �i�ڕʎd�|�A��ƌn��d�|�A��Ƌ�}�X�^�̌�����ǉ����A
--//      �o�Ɏw���e�[�u���̕ҏW�Ɏg�p����
   /* �i�ڕʎd�| */
   CURSOR Cur_Proc_By_Item IS
       SELECT WS_CD
       FROM   T_WORK_IN_PROC_BY_ITEM
       WHERE  WORK_ODR_CD = vc2WORK_ODR_CD ;
   /* ��ƌn��ʎd�|AND�����c */
   CURSOR Cur_Proc_By_Proc IS
       SELECT OUTSIDE_TYP,
              WS_CD,
              DECODE(T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,2,T_WORK_IN_PROC_BY_PROC.COMPANY_CD,'') COMPANY_CD,
              DECODE(T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,2,T_WORK_IN_PROC_BY_PROC.VEND_CD,'') VEND_CD,
              DECODE(T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,2,T_RLSD_PUCH_ODR.PUCH_ODR_CD,'') PUCH_ODR_CD
       FROM   T_WORK_IN_PROC_BY_PROC,T_RLSD_PUCH_ODR
       WHERE  T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD     = vc2WORK_ODR_CD
       AND    T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = vc2WORK_IN_PROC_CD
       AND    T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD     = T_RLSD_PUCH_ODR.WORK_ODR_CD(+)
       AND    T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = T_RLSD_PUCH_ODR.WORK_IN_PROC_CD(+)
       Order by T_WORK_IN_PROC_BY_PROC.PROC_NO;

   /* ����v��ԍ����ōŏ��̓���H���̍�Ƌ�R�[�h�擾���� --20031008�R�����g�A�E�g
   CURSOR Cur_Proc_Ws_Cd(vc2WORK_ODR_CD VARCHAR2) IS
      SELECT MIN(PROC_NO) --20031008 PROC_NO WS_CD
      FROM   T_WORK_IN_PROC_BY_PROC
      WHERE  WORK_ODR_CD = vc2WORK_ODR_CD
      AND    OUTSIDE_TYP = 1 ; */

   /* ����v��ԍ����ōŏ��̓���H���̍�Ƌ�R�[�h�擾���� */
   CURSOR Cur_Proc_Ws_Cd(vc2WORK_ODR_CD VARCHAR2) IS --20031008�C��
     SELECT WS_CD
     FROM   T_WORK_IN_PROC_BY_PROC
     WHERE  WORK_ODR_CD = vc2WORK_ODR_CD
     AND    PROC_NO = ( SELECT MIN(PROC_NO)
                        FROM   T_WORK_IN_PROC_BY_PROC
                        WHERE  WORK_ODR_CD = vc2WORK_ODR_CD
                        AND    OUTSIDE_TYP = 1 );

   /* ��Ƌ� */
   CURSOR Cur_M_Ws(vc2WS_CD VARCHAR2) IS
       SELECT WH_CD
       FROM   M_WS
       WHERE  WS_CD = vc2WS_CD ;
       
   /* �x���P�� */  --add 20030923
   CURSOR Cur_M_Cons_Unit_Cost(vc2COMPANY_CD VARCHAR2,vc2VEND_CD VARCHAR2,pvc2PlantCd VARCHAR2,vc2ITEM_CD VARCHAR2,dtmSCDL_ISSUE_DATE DATE) IS
       SELECT ONEROUS_FLG
       FROM   M_CONS_UNIT_COST
       WHERE  COMPANY_CD = vc2COMPANY_CD
       AND    VEND_CD    = vc2VEND_CD
       AND    PLANT_CD   = pvc2PlantCd
       AND    ITEM_CD    = vc2ITEM_CD
       AND    EFF_PHASE_IN_DATE = ( SELECT MAX(EFF_PHASE_IN_DATE)
                                    FROM M_CONS_UNIT_COST
                                    WHERE  COMPANY_CD = vc2COMPANY_CD
                                    AND    VEND_CD    = vc2VEND_CD
                                    AND    PLANT_CD   = pvc2PlantCd
                                    AND    ITEM_CD    = vc2ITEM_CD
                                    AND    EFF_PHASE_IN_DATE <= dtmSCDL_ISSUE_DATE ) ;

   /* [�i�ڕʎd�|].�i�ڔԍ�(�e�i�ڔԍ�)�̎擾 */
   CURSOR Cur_Proc_Parent_Item_Cd(
      cvc2WorkOdrCd VARCHAR2        --��ƌv��ԍ�
   ) IS
       SELECT ITEM_CD                --�i�ڔԍ�
       FROM   T_WORK_IN_PROC_BY_ITEM --�i�ڕʎd�|
       WHERE  WORK_ODR_CD = cvc2WorkOdrCd;

   /* [��ƌn��ʎd�|].�d�|��ƃR�[�h(���H��)�̎擾 */
   CURSOR Cur_Proc_Work_In_Proc_Cd(
      cvc2WorkOdrCd VARCHAR2                      --��ƌv��ԍ�
   ) IS
       SELECT A.WORK_IN_PROC_CD                   --�d�|��ƃR�[�h(���H����)
       FROM T_WORK_IN_PROC_BY_PROC A,             --��ƌn��ʎd�|
            (select WORK_ODR_CD,
                    MIN(PROC_NO) as MIN_PROC_NO
             from T_WORK_IN_PROC_BY_PROC          --��ƌn��ʎd�|
             where WORK_ODR_CD = cvc2WorkOdrCd 
             group by WORK_ODR_CD) B 
       WHERE  A.WORK_ODR_CD = B.WORK_ODR_CD
              AND A.PROC_NO = B.MIN_PROC_NO;

/*
   CURSOR Cur_Proc_Work_In_Proc_Cd(
      cvc2WorkOdrCd VARCHAR2         --��ƌv��ԍ�
   ) IS
       SELECT MIN(WORK_IN_PROC_CD)   --�d�|��ƃR�[�h(�ŏ��l)
       FROM   T_WORK_IN_PROC_BY_PROC --��ƌn��ʎd�|
       WHERE  WORK_ODR_CD = cvc2WorkOdrCd;
*/
   /* [���o].���o�P�ʐ����q���g�p�����o�w�����̎擾�i���H���ȊO�̕��o�w�����j */
   CURSOR Cur_Issue_Qty_Next(
            cvc2PlantCd           VARCHAR2,             --�H��R�[�h
            cvc2ParentItemCd      VARCHAR2,             --�e�i�ڔԍ�
            cvc2WorkInProcCd      VARCHAR2,             --�d�|��ƃR�[�h
            cvc2IssueItemCd       VARCHAR2,             --�o�ɕi�ڔԍ�
            cvc2Ps_Edition        VARCHAR2,             --�o�ɕi�ڍ\���Ő�
            cnumOprInstQty        NUMBER,               --��Ǝw����
            cnumPsUnitDenominator NUMBER                --���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
   ) IS
       SELECT NVL((
                 cnumOprInstQty *                       --��Ǝw����
              M_ISSUE.ISSUE_UNIT_NUMERATOR /            --���o�P�ʐ����q
              cnumPsUnitDenominator                     --���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
                  --), 0)
                  ), 0),
              NVL(M_ISSUE.ISSUE_UNIT_NUMERATOR, 0)
       FROM   M_ISSUE                                   --���o
       WHERE  M_ISSUE.PLANT_CD       = cvc2PlantCd      --�H��R�[�h
       AND    M_ISSUE.ITEM_CD        = cvc2ParentItemCd --�e�i�ڔԍ�
       AND    M_ISSUE.PROC_CD        = cvc2WorkInProcCd --�d�|��ƃR�[�h
       AND    M_ISSUE.ISSUE_ITEM_CD  = cvc2IssueItemCd  --�o�ɕi�ڔԍ�
       AND    M_ISSUE.PS_EDITION     = cvc2Ps_Edition;  --�o�ɕi�ڍ\���Ő�

   /* [���o].���o�P�ʐ����q���g�p�����o�w�����̎擾�i���H���̕��o�w�����j */
   CURSOR Cur_Issue_Qty_First(
            cvc2PlantCd           VARCHAR2,                  --�H��R�[�h
            cvc2ParentItemCd      VARCHAR2,                  --�e�i�ڔԍ�
            cvc2WorkInProcCd      VARCHAR2,                  --�d�|��ƃR�[�h
            cvc2IssueItemCd       VARCHAR2,                  --�o�ɕi�ڔԍ�
            cvc2Ps_Edition        VARCHAR2,                  --�o�ɕi�ڍ\���Ő�
            cnumOprInstQty        NUMBER,                    --��Ǝw����
            cnumPsUnitDenominator NUMBER                     --���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
   ) IS
       --SELECT NVL(SUM(MI.ISSUE_QTY), 0)
       --SELECT NVL(SUM(MI.ISSUE_QTY), 0),
       		  --NVL(SUM(MI.ISSUE_UNIT_NUMERATOR), 0)
	   SELECT NVL(SUM(MI.ISSUE_UNIT_NUMERATOR), 0)
       FROM
           --(SELECT (
                    --cnumOprInstQty *                         --��Ǝw����
                    --M_ISSUE.ISSUE_UNIT_NUMERATOR /           --���o�P�ʐ����q
                    --cnumPsUnitDenominator                    --���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
            (SELECT 
                   --) ISSUE_QTY
                   --) ISSUE_QTY, 
                   M_ISSUE.ISSUE_UNIT_NUMERATOR AS ISSUE_UNIT_NUMERATOR
            FROM   M_ISSUE                                   --���o
            WHERE  M_ISSUE.PLANT_CD       = cvc2PlantCd      --�H��R�[�h
            AND    M_ISSUE.ITEM_CD        = cvc2ParentItemCd --�e�i�ڔԍ�
            AND    M_ISSUE.PROC_CD       <> cvc2WorkInProcCd --�d�|��ƃR�[�h
            AND    M_ISSUE.ISSUE_ITEM_CD  = cvc2IssueItemCd  --�o�ɕi�ڔԍ�
            AND    M_ISSUE.PS_EDITION     = cvc2Ps_Edition   --�o�ɕi�ڍ\���Ő�
           ) MI;

   /* [�p�^�[���ʕ��o].���o�P�ʐ����q���g�p�����o�w�����̎擾�i���H���ȊO�̕��o�w�����j */
   CURSOR Cur_Issue_Qty_Next_Pattern(
            cvc2PlantCd           VARCHAR2,             --�H��R�[�h
            cvc2ParentItemCd      VARCHAR2,             --�e�i�ڔԍ�
            cvc2WorkInProcCd      VARCHAR2,             --�d�|��ƃR�[�h
            cvc2IssueItemCd       VARCHAR2,             --�o�ɕi�ڔԍ�
            cvc2Ps_Edition        VARCHAR2,             --�o�ɕi�ڍ\���Ő�
            cnumOprInstQty        NUMBER,               --��Ǝw����
            cnumPsUnitDenominator NUMBER,               --���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
            cvc2PatternCd		  VARCHAR2				--�p�^�[���R�[�h
   ) IS
       SELECT NVL((
                 cnumOprInstQty *                       --��Ǝw����
              M_PATTERN_ISSUE.ISSUE_UNIT_NUMERATOR /            --���o�P�ʐ����q
              cnumPsUnitDenominator                     --���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
                  --), 0)
                  ), 0),
              NVL(M_PATTERN_ISSUE.ISSUE_UNIT_NUMERATOR, 0)
       FROM   M_PATTERN_ISSUE                                   --���o
       WHERE  M_PATTERN_ISSUE.PLANT_CD       = cvc2PlantCd      --�H��R�[�h
       AND    M_PATTERN_ISSUE.ITEM_CD        = cvc2ParentItemCd --�e�i�ڔԍ�
       AND    M_PATTERN_ISSUE.PROC_CD        = cvc2WorkInProcCd --�d�|��ƃR�[�h
       AND    M_PATTERN_ISSUE.ISSUE_ITEM_CD  = cvc2IssueItemCd  --�o�ɕi�ڔԍ�
       AND    M_PATTERN_ISSUE.PS_EDITION     = cvc2Ps_Edition   --�o�ɕi�ڍ\���Ő�
       AND    M_PATTERN_ISSUE.PATTERN_CD     = cvc2PatternCd;	--�p�^�[���R�[�h

   /* [�p�^�[���ʕ��o].���o�P�ʐ����q���g�p�����o�w�����̎擾�i���H���̕��o�w�����j */
   CURSOR Cur_Issue_Qty_First_Pattern(
            cvc2PlantCd           VARCHAR2,                  --�H��R�[�h
            cvc2ParentItemCd      VARCHAR2,                  --�e�i�ڔԍ�
            cvc2WorkInProcCd      VARCHAR2,                  --�d�|��ƃR�[�h
            cvc2IssueItemCd       VARCHAR2,                  --�o�ɕi�ڔԍ�
            cvc2Ps_Edition        VARCHAR2,                  --�o�ɕi�ڍ\���Ő�
            cnumOprInstQty        NUMBER,                    --��Ǝw����
            cnumPsUnitDenominator NUMBER,                    --���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
            cvc2PatternCd		  VARCHAR2					 --�p�^�[���R�[�h
   ) IS
       --SELECT NVL(SUM(MI.ISSUE_QTY), 0)
	   --SELECT NVL(SUM(MI.ISSUE_QTY), 0),
	   		  --NVL(SUM(MI.ISSUE_UNIT_NUMERATOR), 0)
	   SELECT NVL(SUM(MI.ISSUE_UNIT_NUMERATOR), 0)
       FROM
           --(SELECT (
                    --cnumOprInstQty *                         --��Ǝw����
                    --M_PATTERN_ISSUE.ISSUE_UNIT_NUMERATOR /           --���o�P�ʐ����q
                    --cnumPsUnitDenominator                    --���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
           (SELECT
                   --) ISSUE_QTY
                   --) ISSUE_QTY,
                   M_PATTERN_ISSUE.ISSUE_UNIT_NUMERATOR AS ISSUE_UNIT_NUMERATOR
            FROM   M_PATTERN_ISSUE                                   --���o
            WHERE  M_PATTERN_ISSUE.PLANT_CD       = cvc2PlantCd      --�H��R�[�h
            AND    M_PATTERN_ISSUE.ITEM_CD        = cvc2ParentItemCd --�e�i�ڔԍ�
            AND    M_PATTERN_ISSUE.PROC_CD       <> cvc2WorkInProcCd --�d�|��ƃR�[�h
            AND    M_PATTERN_ISSUE.ISSUE_ITEM_CD  = cvc2IssueItemCd  --�o�ɕi�ڔԍ�
            AND    M_PATTERN_ISSUE.PS_EDITION     = cvc2Ps_Edition   --�o�ɕi�ڍ\���Ő�
            AND    M_PATTERN_ISSUE.PATTERN_CD     = cvc2PatternCd    --�p�^�[���R�[�h
           ) MI;

-- ���� 2008/08/11 ADD START -TSUCHIDA ����
	/* �H���Ǘ��i�ڋ敪�擾 */
	CURSOR Cur_Manhour_Typ(cvc2ItemCd VARCHAR2) IS
		SELECT M_ITEM.MANHOUR_TYP		-- �H���Ǘ��i�ڋ敪
		FROM M_ITEM
		WHERE M_ITEM.ITEM_CD = cvc2ItemCd;
-- ���� 2008/08/11 ADD END -TSUCHIDA ����

--//----------------------------------------------------------------------------
    --// �ϐ��̒�`
    vc2RunChkComment                VARCHAR2(1024);      --// ���s�ʒu�m�F�p�R�����g�쐬��Ɨ̈�
    vc2Comment                      VARCHAR2(1024);      --// ���b�Z�[�W�p�R�����g�쐬��Ɨ̈�
    LLngCntMax                      NUMBER(11);         --// �x���i�o�Ɍv��f�[�^����
    LNumCntMax_ISSUE_INST           NUMBER(011):= 0;    --// �o�Ɏw���f�[�^����
    LNumCntCurr                     NUMBER(011):= 0;    --// �\���̓Ǎ��p�J�E���^
    LNumCntCurr_ISSUE_INST          NUMBER(011):= 0;    --// �o�Ɏw���P�ʐ��擾�p�J�E���^
--  Lvc2OD_NOTemp                   NUMBER(014);        --// �I�[�_�f�}���h�ԍ��ێ��p nesn del
    Lvc2OD_NOTemp                   VARCHAR2(100);      --// �I�[�_�f�}���h�ԍ��ێ��p nesn
--  LNumPARENT_OD_NoTemp            NUMBER(014);        --// �e�I�[�_�f�}���h�ԍ��ێ��p nesn del
    LNumPARENT_OD_NoTemp            VARCHAR2(100);      --// �e�I�[�_�f�}���h�ԍ��ێ��p nesn
    LNumUNIT_QTY_TYP                NUMBER(002);        --// �q�i�ڍ݌ɐ��ʒP�ʋ敪�̕ێ��p
    LNumISSUE_INST_UNIT_QTY_TYP     NUMBER(002);        --// �e�i�ڍ݌ɐ��ʒP�ʋ敪�̕ێ��p
    LNumWkCnt                       NUMBER(011);        --// �\���̓Ǎ��p�J�E���^
    LNumWkCnt2                      NUMBER(011);        --// �\���̓Ǎ��p�J�E���^
    LNumCnt_DISGUISE                NUMBER(011);        --// �[���i�ڃJ�E���^
    LNumPlanInfoIndex               NUMBER(011):= 0;    --// �\���̓Ǎ��p�J�E���^
    LNumPlanInfoMaxIndex            NUMBER(011):= 0;    --// �\���̓Ǎ��p�J�E���^
    numWorkIssueQty                 NUMBER(18,4);
    numIssueInstUnitQty             NUMBER(18,4);       --// �o�Ɏw���P�ʐ�
    numIssueInstQty                 NUMBER(18,4);       --// �o�Ɏw����
    numOprInstQtyTemp               NUMBER(18,4);       --// ��ƌn��ʎd�|�\����(x)�D��Ǝw�����̈ꎞ��Ɨ̈�
    numOprInstQty                   NUMBER(18,4);
    numWorkIssueQtyTemp             NUMBER(18,4);       --// Work�o�Ɍv��o�ɒP�ʐ��ʎc���ꎞ��Ɨ̈�
    numMaxProcInfoIndex             NUMBER(18,4);
    numErr      NUMBER(10);
    numCount    NUMBER(10);
    LOGMSG_ERR                      VARCHAR2(32)  := '�ُ�I��';
    numSaveDataFrg                  NUMBER(1);          --// ���n��X�V����
    numSaveFeristProcIndex          NUMBER(11);         --// ���n���SaveData��Index
    vc2P_WORK_ODR_CD                VARCHAR2(100);
--  numP_OD_NO                      NUMBER(14);         --// nesn del
    vc2P_OD_NO                      VARCHAR2(100);       --// nesn
    vc2P_WORK_IN_PROC_CD            VARCHAR2(100);
    vc2P_ITEM_CD                    VARCHAR2(100);
    numP_OUTSIDE_TYP                NUMBER(2);
    dtmP_OPR_INST_START_DATE        DATE;
    numP_OPR_INST_QTY               NUMBER(18,4);
    numP_OPR_RSLT_TYP               NUMBER(2);
    vc2P_PUCH_ODR_CD                VARCHAR2(100);
    vc2P_ROUTING_CD                 VARCHAR2(100);
    vc2WS_CD                        VARCHAR2(100);       --// nesn ��Ƌ�R�[�h
    vc2WS_CD2                       VARCHAR2(100);       --// nesn ��Ƌ�R�[�h
    numOUTSIDE_TYP                  NUMBER(2);          --// nesn �d�|���O��敪
    vc2WH_CD                        VARCHAR2(100);       --// nesn �ۊǋ�R�[�h
    vc2COMPANY_CD                   VARCHAR2(100);       --// nesn ��ЃR�[�h
    vc2VEND_CD                      VARCHAR2(100);       --// nesn �����R�[�h
    numCONS_TYP                     NUMBER(2);          --// nesn �x���敪   20030923
    numONEROUS_FLG                  NUMBER(1);          --// nesn �L���t���O 20030923
    LBlnRet                         BOOLEAN;            --// ���ʊ֐��̖ߒl
    LGetNewPuchCd                   VARCHAR2(100);      --// �o�ɔԍ��擾�p
    blnRet                          BOOLEAN;
    vc2ParentItemCd                 VARCHAR2(100);      --// �e�i�ڔԍ�
    vc2WorkInProcCd                 VARCHAR2(100);      --// �d�|��ƃR�[�h(���H��)
    --numIssueQty                     NUMBER(18,4);       --// ���o�w����
    --numNeedQty                      NUMBER(18,4);       --// �K�v�w����
    numIssueQty                     NUMBER(18,5);       --// ���o�w����
    numNeedQty                      NUMBER(18,5);       --// �K�v�w����
    --numIssueNumerator				NUMBER(18,4);       --// ���o�P�ʐ����q
    numIssueNumerator				NUMBER(18,5);       --// ���o�P�ʐ����q
   SYS_SPOIL_FLG                    NUMBER(1);          --�V�X�e���p�����[�^�d����
-- ���� 2008/08/11 ADD START -TSUCHIDA ����
	numManhourTyp					NUMBER(2);			-- �H���Ǘ��i�ڋ敪
-- ���� 2008/08/11 ADD END -TSUCHIDA ����
    excUNIT_QTY_TYP_ERR             EXCEPTION;
    excERR_GET_NEW_INST_CD          EXCEPTION;
    excT_WORK_IN_PROC_BY_ITEM_ERR   EXCEPTION;          --// nesn
    excT_WORK_IN_PROC_BY_PROC_ERR   EXCEPTION;          --// nesn
    excM_WS_ERR                     EXCEPTION;          --// nesn
    excM_WS_ERR2                    EXCEPTION;          --// nesn
    excM_PARENT_ITEM_ERR            EXCEPTION;          --// [�i�ڕʎd�|].�i�ڔԍ�(�e�i�ڔԍ�)�̎擾�G���[
    excM_FIRST_PROC_ERR             EXCEPTION;          --// [��ƌn��ʎd�|].�d�|��ƃR�[�h(���H��)�̎擾�G���[
    excNOTEXIST_SYS_PARAMETER       EXCEPTION;
    LOGMSG_START                VARCHAR2(20)  := 'Start';     --���O�p���\�b�h�J�n�錾
    LOGMSG_END                  VARCHAR2(12)  := 'End';       --���O�p���\�b�h�I���錾
    METHOD_START                VARCHAR2(20)  := 'Start';     --���O�p���\�b�h�J�n�錾
    METHOD_END                  VARCHAR2(12)  := 'End';       --���O�p���\�b�h�I���錾
    MY_SQL_NAME                 VARCHAR2(120) := 'FNCINSIDEISSUEINSTRUCTION';   --�o�k�^�r�p�k��

--<���C������ >-----------------------------------------------------
begin
--20031103 DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �J�n ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;
    --// �V�X�e���d�������擾
    OPEN CUR_SystemSpoilFlg ;
    FETCH CUR_SystemSpoilFlg INTO SYS_SPOIL_FLG ;
    IF CUR_SystemSpoilFlg%FOUND = FALSE THEN
       RAISE excNOTEXIST_SYS_PARAMETER;
    END IF;
    CLOSE CUR_SystemSpoilFlg ;
    --�g���[�X���O�istart�j0823
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_START);
--vc2RunChkComment := '���������ʉ� 00000';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    --// [�i�ڕʎd�|].�i�ڔԍ�(�e�i�ڔԍ�)�̎擾
    vc2ParentItemCd := '';
    OPEN Cur_Proc_Parent_Item_Cd(pvc2WorkOdrCd); --��ƌv��ԍ�
    FETCH Cur_Proc_Parent_Item_Cd INTO vc2ParentItemCd;
        IF Cur_Proc_Parent_Item_Cd%FOUND = FALSE THEN
            --// [�i�ڕʎd�|].�i�ڔԍ�(�e�i�ڔԍ�)�̎擾�G���[
            RAISE excM_PARENT_ITEM_ERR;
        END IF;
   CLOSE Cur_Proc_Parent_Item_Cd;
   --// [��ƌn��ʎd�|].�d�|��ƃR�[�h(���H��)�̎擾
   vc2WorkInProcCd := NULL;
   --��Ǝw�����т̏ꍇ�̂ݎ擾
   IF  to_number(pvc2OprRsltTyp) IN (OPR_RSLT_TYP_PROC) THEN
        OPEN Cur_Proc_Work_In_Proc_Cd(pvc2WorkOdrCd); --��ƌv��ԍ�
        FETCH Cur_Proc_Work_In_Proc_Cd INTO vc2WorkInProcCd;
        IF vc2WorkInProcCd IS NULL THEN
             --// [��ƌn��ʎd�|].�d�|��ƃR�[�h(���H��)�̎擾�G���[
            RAISE excM_FIRST_PROC_ERR;
        END IF;
        CLOSE Cur_Proc_Work_In_Proc_Cd;
   END IF;
--vc2RunChkComment := '���������ʉ� 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
LLngCntMax := 0;
    --//������ ���ʃf�}���h�T�}�����̒ǉ����� ������
    --// �J�[�\���̃I�[�v��
    for LTypsqlCurr_REC in Cur_PuchOdrInst_SelectTOD1(pvc2OdCd) LOOP
--vc2RunChkComment := '���������ʉ� 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        --// ��ƌv��ʏo�Ɍv��f�[�^�̍쐬
        IF LTypsqlCurr_REC.MRP_ODR_TYP = 8 then --//�[���i��
--vc2RunChkComment := '���������ʉ� 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            --// �I�[�_�f�}���h�ԍ�
            Typ_REC(LLngCntMax).TypOD_NO_T := LTypsqlCurr_REC.OD_NO;
            Lvc2OD_NOTemp := LTypsqlCurr_REC.OD_NO;
            --// �i�ڔԍ�
            Typ_REC(LLngCntMax).TypITEM_CD_T := LTypsqlCurr_REC.ITEM_CD;
            --// ���i�\���Ő�
            Typ_REC(LLngCntMax).TypPS_EDITION_T :=
             LTypsqlCurr_REC.PS_EDITION;
            --// ���i�\���P�ʐ�
            Typ_REC(LLngCntMax).TypPS_UNIT_QTY_T :=
                                    LTypsqlCurr_REC.PS_UNIT_QTY;
            --// ���i�\���P�ʐ�����
            Typ_REC(LLngCntMax).TypPS_UNIT_DENOMINATOR_T :=
                                    LTypsqlCurr_REC.PS_UNIT_DENOMINATOR;
            --// ���i�\���P�ʐ����q
            Typ_REC(LLngCntMax).TypPS_UNIT_NUMERATOR_T :=
                                    LTypsqlCurr_REC.PS_UNIT_NUMERATOR;
            /*���v�ʍ\���d����*/
            Typ_REC(LLngCntMax).TypPS_SPOIL :=LTypsqlCurr_REC.PS_SPOIL;
            --// �o�Ɏw���敪(�i�ڎ�z�敪)�̐ݒ�
            Typ_REC(LLngCntMax).TypMRP_ODR_TYP_T := 9;--// �o�Ɏw���敪:�[���i�ڏo�Ɍv��
            --// �[���i�ړW�J�t���O�̐ݒ�
            Typ_REC(LLngCntMax).TypODINFO_DISGUISE_T := 0; --//(0:OFF)
            --// �e�I�[�_�f�}���h�ԍ�
            Typ_REC(LLngCntMax).TypPARENT_OD_NO_T :=
                 LTypsqlCurr_REC.PARENT_OD_NO;
            --// ���v�ʏo�ɋ敪
            Typ_REC(LLngCntMax).TypISSUE_TYP_T := LTypsqlCurr_REC.ISSUE_TYP;
            --// ���v�ʍH��R�[�h
            Typ_REC(LLngCntMax).TypPLANT_CD_T := LTypsqlCurr_REC.PLANT_CD;
            --// �o�ɗ\���
            Typ_REC(LLngCntMax).TypSCDL_ISSUE_DATE_T := LTypsqlCurr_REC.DUE_DATE;
            --// �e�i�ڔԍ�
            Typ_REC(LLngCntMax).TypPARENT_ITEM_NO_T := vc2ParentItemCd;
        	--//�p�^�[���R�[�h
        	Typ_REC(LLngCntMax).TypPATTERN_CD_T := LTypsqlCurr_REC.PATTERN_CD;
            --//�f�[�^�����J�E���g
            LLngCntMax := LLngCntMax + 1;
--vc2RunChkComment := '���������ʉ� 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            --// �[���i�ڂ̉��ʃf�}���h�̒��o
            for LTypsqlCurr_REC_DISGUISE in Cur_PuchOdrInst_SelectTOD2(Lvc2OD_NOTemp) Loop
                --// ����ɂ��̃I�[�_�f�}���h�ԍ���e�I�[�_�f�}���h�ԍ��Ƃ��Ď����Ă�����̂𒊏o
--vc2RunChkComment := '���������ʉ� 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    --// �I�[�_�f�}���h�ԍ�
                    Typ_REC(LLngCntMax).TypOD_NO_T :=
                                LTypsqlCurr_REC_DISGUISE.OD_NO;
                    Lvc2OD_NOTemp := LTypsqlCurr_REC_DISGUISE.OD_NO;
                    --// �i�ڔԍ�
                    Typ_REC(LLngCntMax).TypITEM_CD_T :=
                                    LTypsqlCurr_REC_DISGUISE.ITEM_CD;
                    --// ���i�\���Ő�
                    Typ_REC(LLngCntMax).TypPS_EDITION_T :=
                                    LTypsqlCurr_REC_DISGUISE.PS_EDITION;
                    --// ���i�\���P�ʐ�
                    Typ_REC(LLngCntMax).TypPS_UNIT_QTY_T :=
                                LTypsqlCurr_REC_DISGUISE.PS_UNIT_QTY;
                    --// ���i�\���P�ʐ�����
                    Typ_REC(LLngCntMax).TypPS_UNIT_DENOMINATOR_T :=
                                            LTypsqlCurr_REC_DISGUISE.PS_UNIT_DENOMINATOR;
                    --// ���i�\���P�ʐ����q
                    Typ_REC(LLngCntMax).TypPS_UNIT_NUMERATOR_T :=
                                            LTypsqlCurr_REC_DISGUISE.PS_UNIT_NUMERATOR;
                      /*���v�ʍ\���d����*/
                    Typ_REC(LLngCntMax).TypPS_SPOIL :=LTypsqlCurr_REC_DISGUISE.PS_SPOIL;
                    --// �o�Ɏw���敪:�ʏ�o�Ɍv��
                    Typ_REC(LLngCntMax).TypMRP_ODR_TYP_T := 1;
                    --// �[���i�ړW�J�t���O�̐ݒ�
                    Typ_REC(LLngCntMax).TypODINFO_DISGUISE_T := 1; --//(1:ON)
                    --// �e�I�[�_�f�}���h�ԍ�
                    Typ_REC(LLngCntMax).TypPARENT_OD_NO_T :=
                                 LTypsqlCurr_REC_DISGUISE.PARENT_OD_NO;
                    --// ���v�ʏo�ɋ敪
                    Typ_REC(LLngCntMax).TypISSUE_TYP_T :=
                                LTypsqlCurr_REC_DISGUISE.ISSUE_TYP;
                    --// ���v�ʍH��R�[�h
                    Typ_REC(LLngCntMax).TypPLANT_CD_T :=
                                LTypsqlCurr_REC_DISGUISE.PLANT_CD;
                    --// �o�ɗ\���
                    Typ_REC(LLngCntMax).TypSCDL_ISSUE_DATE_T := 
                                LTypsqlCurr_REC_DISGUISE.DUE_DATE;
                    --// �e�i�ڔԍ�
                    Typ_REC(LLngCntMax).TypPARENT_ITEM_NO_T := 
                                vc2ParentItemCd;
        			--//�p�^�[���R�[�h
        			Typ_REC(LLngCntMax).TypPATTERN_CD_T := LTypsqlCurr_REC_DISGUISE.PATTERN_CD;
                    --//�f�[�^�����J�E���g
                    LLngCntMax := LLngCntMax + 1;
            End loop;
--vc2RunChkComment := '���������ʉ� 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        ELSE    --//�[���i�ڈȊO
--vc2RunChkComment := '���������ʉ� 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            --// �I�[�_�f�}���h�ԍ�
            Typ_REC(LLngCntMax).TypOD_NO_T := LTypsqlCurr_REC.OD_NO;
            --// �i�ڔԍ�
            Typ_REC(LLngCntMax).TypITEM_CD_T := LTypsqlCurr_REC.ITEM_CD;
            --// ���i�\���Ő�
            Typ_REC(LLngCntMax).TypPS_EDITION_T := LTypsqlCurr_REC.PS_EDITION;
            --// ���i�\���P�ʐ�
            Typ_REC(LLngCntMax).TypPS_UNIT_QTY_T :=
                                    LTypsqlCurr_REC.PS_UNIT_QTY;
            --// ���i�\���P�ʐ�����
            Typ_REC(LLngCntMax).TypPS_UNIT_DENOMINATOR_T :=
                                    LTypsqlCurr_REC.PS_UNIT_DENOMINATOR;
            --// ���i�\���P�ʐ����q
            Typ_REC(LLngCntMax).TypPS_UNIT_NUMERATOR_T :=
                                    LTypsqlCurr_REC.PS_UNIT_NUMERATOR;
              /*���v�ʍ\���d����*/
            Typ_REC(LLngCntMax).TypPS_SPOIL :=LTypsqlCurr_REC.PS_SPOIL;
            --// �o�Ɏw���敪(�i�ڎ�z�敪)�̐ݒ�
            Typ_REC(LLngCntMax).TypMRP_ODR_TYP_T := 1; --// �o�Ɏw���敪:�ʏ�o�Ɍv��
            --// �[���i�ړW�J�t���O�̐ݒ�(0:OFF)
            Typ_REC(LLngCntMax).TypODINFO_DISGUISE_T := 0; --//(0:OFF)
            --// �e�I�[�_�f�}���h�ԍ�
            Typ_REC(LLngCntMax).TypPARENT_OD_NO_T :=
                                    LTypsqlCurr_REC.PARENT_OD_NO;
            --// ���v�ʏo�ɋ敪
            Typ_REC(LLngCntMax).TypISSUE_TYP_T := LTypsqlCurr_REC.ISSUE_TYP;
            --// ���v�ʍH��R�[�h
            Typ_REC(LLngCntMax).TypPLANT_CD_T :=
                                    LTypsqlCurr_REC.PLANT_CD;
            --// �o�ɗ\���
            Typ_REC(LLngCntMax).TypSCDL_ISSUE_DATE_T := LTypsqlCurr_REC.DUE_DATE;
            --// �e�i�ڔԍ�
            Typ_REC(LLngCntMax).TypPARENT_ITEM_NO_T := vc2ParentItemCd;
        	--//�p�^�[���R�[�h
        	Typ_REC(LLngCntMax).TypPATTERN_CD_T := LTypsqlCurr_REC.PATTERN_CD;
            --//�f�[�^�����J�E���g
            LLngCntMax := LLngCntMax + 1;
        END IF;
    END LOOP;



--20031103 IF LLngCntMax > 0 THEN
--20031103 DBMS_OUTPUT.PUT_LINE(pvc2WorkOdrCd || ':' || pvc2WorkInProcCd || ':' || LLngCntMax);
--20031103 END IF;




--vc2RunChkComment := '���������ʉ� 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    IF to_number(pvc2OprRsltTyp) IN (OPR_RSLT_TYP_TURNOVER) THEN
    --�o����(1)�̏ꍇ
--vc2RunChkComment := '���������ʉ� 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        LNumCntMax_ISSUE_INST := 0;
        LNumCntCurr := 0;
        loop

--DBMS_OUTPUT.PUT_LINE(LLngCntMax);
--DBMS_OUTPUT.PUT_LINE(LNumCntCurr);

            exit when LLngCntMax <= LNumCntCurr;
        --//�o�Ɏw���f�[�^�i�s�d�l�o�j�̍쐬
        --//�x���i�o�Ɍv��f�[�^�ҏW�����f�[�^���i�[����B
        --//�����̍\���̂���ɏo�Ɏw���f�[�^��ǉ�����B
            --//��ƌv��ʏo�Ɍv��f�[�^�̏o�Ɏw���敪:1�i�ʏ�A�[���i�ڂ̉��ʃf�}���h�̂ݒ��o�j�B

--DBMS_OUTPUT.PUT_LINE(LNumCntCurr);

            if Typ_REC(LNumCntCurr).TypMRP_ODR_TYP_T = 1 then
--vc2RunChkComment := '���������ʉ� 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                --// �o�Ɏw���ԍ�(���ʊ֐����擾�������̔ԁ�) nesn�����ύX
                --//����:(�t�@�C���n���h���A�k�n�f���[�h�A�o�̓��[�h�
                --//      ���[�U�h�c��Ɩ����A�H��R�[�h�A��������)
                LBlnRet := FncGetNewIssInstCd(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId,pvc2BusinessName,pvc2PlantCd,LGetNewPuchCd);
                IF LBlnRet = FALSE THEN
                    --// �o�Ɏw���ԍ��̔ԃG���[
                    RAISE excERR_GET_NEW_INST_CD;
                END IF;
                vc2ISSUE_INST_CD := LGetNewPuchCd;
                --// �I�[�_�f�}���h�ԍ�
                vc2OD_NO := Typ_REC(LNumCntCurr).TypOD_NO_T;
                --// �o�ɕi�ڔԍ�
                vc2ITEM_CD := Typ_REC(LNumCntCurr).TypITEM_CD_T;
                --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
                vc2PS_EDITION := Typ_REC(LNumCntCurr).TypPS_EDITION_T;
                --// �����ԍ�
                vc2PUCH_ODR_CD := Typ_REC(LNumCntCurr).TypPUCH_ODR_CD_T;
                --// ��ƌv��ԍ�
                vc2WORK_ODR_CD := pvc2WorkOdrCd;
                --// �d�|��ƃR�[�h
                vc2WORK_IN_PROC_CD := '';
                --// �i�ڕʎd�|��������Ƌ�R�[�h�̐ݒ� nesn
                OPEN Cur_Proc_By_Item ;
                FETCH Cur_Proc_By_Item INTO vc2WS_CD ;
                IF Cur_Proc_By_Item%FOUND = FALSE THEN
                   RAISE excT_WORK_IN_PROC_BY_ITEM_ERR;
                END IF;
                CLOSE Cur_Proc_By_Item ;
                --// ��Ƌ挟�����H���ۊǏꏊ�R�[�h�ݒ� nesn
                OPEN Cur_M_Ws(vc2WS_CD) ;
                FETCH Cur_M_Ws INTO vc2WH_CD ;
                IF Cur_M_Ws%FOUND = FALSE THEN
                   RAISE excM_WS_ERR;
                END IF;
                CLOSE Cur_M_Ws ;
                --// �o�Ɏw���P�ʐ��A�o�Ɏw���P�ʐ�����A�o�Ɏw���P�ʐ����q�A�o�Ɏw���� nesn 0830
                --// �[���i�ړW�J�t���O(0:OFF,1:ON)
                if Typ_REC(LNumCntCurr).TypODINFO_DISGUISE_T = 1 then
--vc2RunChkComment := '���������ʉ� 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                --//�e�f�[�^�̏o�ɒP�ʐ����擾
                --//�e�I�[�_�f�}���h�ԍ��̑ޔ�
                    LNumPARENT_OD_NoTemp := Typ_REC(LNumCntCurr).TypPARENT_OD_NO_T;
                    LNumCntCurr_ISSUE_INST := 0;
                    loop
                        IF Typ_REC(LNumCntCurr_ISSUE_INST).TypOD_NO_T = LNumPARENT_OD_NoTemp THEN

                            --// �e�i�ڍ݌ɐ��ʒP�ʋ敪�̎擾
--vc2RunChkComment := '���������ʉ� 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            open Cur_PuchOdrInst_UNIT_QTY_TYP
                                    (Typ_REC(LNumCntCurr_ISSUE_INST).TypITEM_CD_T);
                            fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumISSUE_INST_UNIT_QTY_TYP;
                            IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                                RAISE excUNIT_QTY_TYP_ERR;
                            END IF;
                            close Cur_PuchOdrInst_UNIT_QTY_TYP;
                            --// �q�i�ڍ݌ɐ��ʒP�ʋ敪�̎擾
--vc2RunChkComment := '���������ʉ� 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            open Cur_PuchOdrInst_UNIT_QTY_TYP
                                    (Typ_REC(LNumCntCurr).TypITEM_CD_T);
                            fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumUNIT_QTY_TYP;
                            IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                                RAISE excUNIT_QTY_TYP_ERR;
                            END IF;
                            close Cur_PuchOdrInst_UNIT_QTY_TYP;
--//20031211 ins ��
                          --//�o�ɒP�ʐ� = �e�f�[�^.�o�ɒP�ʐ� * �q�f�[�^�o�ɒP�ʐ�
                          --//������5�ʐ؏グ
                            numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T *
                                                      Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T * 10000) / 10000;
                          --//�o�ɒP�ʐ����� = �e�f�[�^.�o�ɒP�ʐ����� * �q�f�[�^�o�ɒP�ʐ�����
                          --//������5�ʐ؏グ
                            numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T *
                                                              Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T * 10000) / 10000;
                          --//�o�ɒP�ʐ����q = �e�f�[�^.�o�ɒP�ʐ����q * �q�f�[�^�o�ɒP�ʐ����q
                          --//������5�ʐ؏グ
                            numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T *
                                                            Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T * 10000) / 10000;
--//20031211 ins ��
                            if LNumISSUE_INST_UNIT_QTY_TYP = 1 then --//�e�i�ڍ݌ɐ��ʒP�ʋ敪 1:�����Ǘ��A2:�����Ǘ�
                                --�e�i�ڏo�Ɏw����
                                numISSUE_INST_QTY := ceil(pnumOprInstQty * Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T);
                            else
                                --�e�i�ڏo�Ɏw����
                                numISSUE_INST_QTY := ceil((pnumOprInstQty * Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000;
                            end if;

                            if LNumUNIT_QTY_TYP = 1 then --//�q�i�ڍ݌ɐ��ʒP�ʋ敪 1:�����Ǘ��A2:�����Ǘ�
--vc2RunChkComment := '���������ʉ� 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--20031211                              --//�o�ɒP�ʐ� = �e�f�[�^.�o�ɒP�ʐ� * �q�f�[�^�o�ɒP�ʐ�
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T);
--20031211                              --//�o�ɒP�ʐ����� = �e�f�[�^.�o�ɒP�ʐ����� * �q�f�[�^�o�ɒP�ʐ�����
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T);
--20031211                              --//�o�ɒP�ʐ����q = �e�f�[�^.�o�ɒP�ʐ����q * �q�f�[�^�o�ɒP�ʐ�����
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T);
                              --//�o�Ɏw���� =   ��Ǝw���� * (�o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ�����)
                              --//�����؏グ
--                                numISSUE_INST_QTY := ceil(pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR);
--20031210                                numISSUE_INST_QTY := ceil((numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * pnumOprInstQty ); --nesn
                                if SYS_SPOIL_FLG = 1 then
                                  --�q�i�ڏo�Ɏw����
                                  numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T); 
                                else
                                  --�q�i�ڏo�Ɏw����
                                  numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T);
                                end if;
                            else
--vc2RunChkComment := '���������ʉ� 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--20031211                              --//�o�ɒP�ʐ� = �e�f�[�^.�o�ɒP�ʐ� * �q�f�[�^�o�ɒP�ʐ�
--20031211                              --//������5�ʐ؏グ
--20031211                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T * 10000) / 10000;
--20031211                              --//�o�ɒP�ʐ����� = �e�f�[�^.�o�ɒP�ʐ����� * �q�f�[�^�o�ɒP�ʐ�����
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T * 10000) / 10000;
--20031211                              --//�o�ɒP�ʐ����q = �e�f�[�^.�o�ɒP�ʐ����q * �q�f�[�^�o�ɒP�ʐ����q
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T * 10000) / 10000;
                              --//�o�Ɏw���� =   ��Ǝw���� * (�o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ�����)
                              --//������5�ʐ؏グ
--                                numISSUE_INST_QTY := ceil(pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR * 10000) / 10000;
--20031210                                numISSUE_INST_QTY := ceil((numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * pnumOprInstQty * 10000) / 10000; --nesn
                                if SYS_SPOIL_FLG = 1 then
                                  --�q�i�ڏo�Ɏw����
                                  numISSUE_INST_QTY := ceil((numISSUE_INST_QTY * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000; 
                                else
                                  --�q�i�ڏo�Ɏw����
                                  numISSUE_INST_QTY := ceil((numISSUE_INST_QTY * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000;
                                end if;
                            end if;
                        END IF;
                        EXIT WHEN Typ_REC(LNumCntCurr_ISSUE_INST).TypOD_NO_T = LNumPARENT_OD_NoTemp
                                   or LNumCntCurr_ISSUE_INST >= LLngCntMax;
                        LNumCntCurr_ISSUE_INST := LNumCntCurr_ISSUE_INST + 1;
                    end loop;
                    LNumCntCurr_ISSUE_INST := 0;
                else
--vc2RunChkComment := '���������ʉ� 00150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    --// �o�Ɏw���P�ʐ�
                    numISSUE_INST_UNIT_QTY := Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T;
                    --// �o�Ɏw���P�ʐ����� nens 0830
                    numISSUE_INST_UNIT_DENOMINATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                    --// �o�Ɏw���P�ʐ����q nesn 0830
                    numISSUE_INST_UNIT_NUMERATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T;
                    --// �݌ɐ��ʒP�ʋ敪�̎擾
                    open Cur_PuchOdrInst_UNIT_QTY_TYP
                            (Typ_REC(LNumCntCurr).TypITEM_CD_T);
                            fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumUNIT_QTY_TYP;
                    IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                        RAISE excUNIT_QTY_TYP_ERR;
                    END IF;
                    close Cur_PuchOdrInst_UNIT_QTY_TYP;
                    if LNumUNIT_QTY_TYP = 1 then --//�݌ɐ��ʒP�ʋ敪 1:�����Ǘ��A2:�����Ǘ�
                      --//�o�Ɏw���� =   ��Ǝw���� * (�o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ�����) nesn
                      --//�����؏グ
--nesn                  numISSUE_INST_QTY := ceil(numISSUE_INST_UNIT_QTY * pnumOprInstQty);
--20031210                        numISSUE_INST_QTY := ceil( pnumOprInstQty * ( numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR )); --nesn 0830
                        if SYS_SPOIL_FLG  = 1 then
                          numISSUE_INST_QTY := ceil( ( pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                             numISSUE_INST_UNIT_NUMERATOR ) / numISSUE_INST_UNIT_DENOMINATOR ); --//20031210
                        else
                          numISSUE_INST_QTY := ceil( ( pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR ) / numISSUE_INST_UNIT_DENOMINATOR ); --//20031210
                        end if;
                        
                    else
                      --//�o�Ɏw���� =   ��Ǝw���� * (�o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ�����) nesn
                      --//������5�ʐ؏グ
--20031210                        numISSUE_INST_QTY := ceil(pnumOprInstQty * ( numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR ) * 10000) / 10000; --nesn 0830
                        if SYS_SPOIL_FLG = 1 then
                          numISSUE_INST_QTY := ceil(((pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                              numISSUE_INST_UNIT_NUMERATOR) / numISSUE_INST_UNIT_DENOMINATOR ) * 10000) / 10000; --//20031210
                        else
                          numISSUE_INST_QTY := ceil(((pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR) / numISSUE_INST_UNIT_DENOMINATOR ) * 10000) / 10000; --//2003
                        end if;
                    end if;
                end if;
                --// �o�ɗ݌v��
                numTOTAL_ISSUE_QTY := 0;
                --// �o�ɗ\���
                dtmSCDL_ISSUE_DATE := Typ_REC(LNumCntCurr).TypSCDL_ISSUE_DATE_T;
                --// �o�Ɋ�����
                dtmISSUE_CMPLT_DATE := NULL;
                --// �o�Ɏw���o�ɋ敪
                numISSUE_TYP := Typ_REC(LNumCntCurr).TypISSUE_TYP_T;
                --// �o�Ɋ����t���O
                numISSUE_CMPLT_FLG := 0;
                --// �o�Ɏw�������s�ς݃t���O
                numISSUE_INST_ISS_FLG := 0;
                --// �o�Ɏw�������s��
                dtmISSUE_INST_DATE := NULL;
                --// �o�Ɏw�����l
                vc2ISSUE_INST_COMMENT := '';
                --// �H��R�[�h
                vc2PLANT_CD := Typ_REC(LNumCntCurr).TypPLANT_CD_T;
                LNumCntMax_ISSUE_INST := LNumCntMax_ISSUE_INST + 1;
--vc2RunChkComment := '���������ʉ� 00160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

-- ���� 2008/08/11 ADD START -TSUCHIDA ����
				-- �H���Ǘ��i�ڋ敪�擾
				OPEN Cur_Manhour_Typ(vc2ITEM_CD);
				FETCH Cur_Manhour_Typ into numManhourTyp;
				CLOSE Cur_Manhour_Typ;

				-- �H���Ǘ��i�ڋ敪��1�̏ꍇ�o�Ɏw���ɒǉ����Ȃ�
				IF numManhourTyp != 1 THEN
-- ���� 2008/08/11 ADD END -TSUCHIDA ����
                --�o�Ɏw���ǉ�
                insert into T_ISSUE_INST (
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
                WS_CD,                          --// ��Ƌ�R�[�h nesn
                WH_CD,                          --// �H���ۊǏꏊ�R�[�h nesn
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
                CREATED_PRG_NM,                 --// �쐬�v���O������ nesn
                UPDATED_DATE,
                UPDATED_BY,
                UPDATED_PRG_NM,                 --// �X�V�v���O������ nesn
                MODIFY_COUNT                    --// �X�V�� nesn
                )
                 values(
                vc2ISSUE_INST_CD,               --// �o�Ɏw���ԍ�
                vc2PLANT_CD,                    --// �H��R�[�h
                vc2OD_NO,                       --// �I�[�_�f�}���h�ԍ�
                vc2ITEM_CD,                     --// �o�ɕi�ڔԍ�
                vc2PS_EDITION,                  --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
                vc2PUCH_ODR_CD,                 --// �����ԍ�
                NULL,                           --// ��ЃR�[�h
                NULL,                           --// �����R�[�h
                0,                              --// �x���敪
                vc2WORK_ODR_CD,                 --// ��ƌv��ԍ�
                vc2WORK_IN_PROC_CD,             --// �d�|��ƃR�[�h
                vc2WS_CD,                       --// ��Ƌ�R�[�h nesn 
                vc2WH_CD,                       --// �H���ۊǏꏊ�R�[�h nesn 
                numISSUE_INST_UNIT_QTY,         --// �o�Ɏw���P�ʐ�
                numISSUE_INST_UNIT_DENOMINATOR, --// �o�Ɏw���P�ʐ����� nesn
                numISSUE_INST_UNIT_NUMERATOR,   --// �o�Ɏw���P�ʐ����q nesn
                numISSUE_INST_QTY,              --// �o�Ɏw����
                numTOTAL_ISSUE_QTY,             --// �o�ɗ݌v��
                dtmSCDL_ISSUE_DATE,             --// �o�ɗ\���
                dtmISSUE_CMPLT_DATE,            --// �o�Ɋ�����
                numISSUE_TYP,                   --// �o�Ɏw���o�ɋ敪
                numISSUE_CMPLT_FLG,             --// �o�Ɋ����t���O
                numISSUE_INST_ISS_FLG,          --// �o�Ɏw�������s�ς݃t���O
                dtmISSUE_INST_DATE,             --// �o�Ɏw�������s��
                vc2ISSUE_INST_COMMENT,          --// �o�Ɏw�����l
                SYSDATE,
                pvc2UserId,
                MY_SQL_NAME,                    --// �쐬�v���O������ nesn
                SYSDATE,
                pvc2UserId,
                MY_SQL_NAME,                    --// �X�V�v���O������ nesn
                0                               --// �X�V���F�o�^��0 nesn
                );
-- ���� 2008/08/11 ADD START -TSUCHIDA ����
				END IF;
-- ���� 2008/08/11 ADD END -TSUCHIDA ����
            end if;
            LNumCntCurr := LNumCntCurr + 1;
        end loop;
--nesn    ELSIF  to_number(pvc2OprRsltTyp) IN (OPR_RSLT_TYP_ITEM)  THEN
    ELSIF  to_number(pvc2OprRsltTyp) IN (OPR_RSLT_TYP_PROC)  THEN  --nesn
    --��Ǝw������(2)�̏ꍇ
--vc2RunChkComment := '���������ʉ� 10090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        LNumCntMax_ISSUE_INST := 0;
        LNumCntCurr := 0;
        loop
            exit when LLngCntMax <= LNumCntCurr;
        --//�o�Ɏw���f�[�^�i�s�d�l�o�j�̍쐬
        --//�x���i�o�Ɍv��f�[�^�ҏW�����f�[�^���i�[����B
        --//�����̍\���̂���ɏo�Ɏw���f�[�^��ǉ�����B
            --//��ƌv��ʏo�Ɍv��f�[�^�̏o�Ɏw���敪:1�i�ʏ�A�[���i�ڂ̉��ʃf�}���h�̂ݒ��o�j�B
            if Typ_REC(LNumCntCurr).TypMRP_ODR_TYP_T = 1 then
--vc2RunChkComment := '���������ʉ� 10100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                --// �o�Ɏw���ԍ�(���ʊ֐����擾�������̔ԁ�) nesn�����ύX
                --//����:(�t�@�C���n���h���A�k�n�f���[�h�A�o�̓��[�h�
                --//      ���[�U�h�c��Ɩ����A�H��R�[�h�A��������)
                LBlnRet := FncGetNewIssInstCd(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId,pvc2BusinessName,pvc2PlantCd,LGetNewPuchCd);
                IF LBlnRet = FALSE THEN
                    --// �o�Ɏw���ԍ��̔ԃG���[
                    RAISE excERR_GET_NEW_INST_CD;
                END IF;
                vc2ISSUE_INST_CD := LGetNewPuchCd;
                --// �I�[�_�f�}���h�ԍ�
                vc2OD_NO := Typ_REC(LNumCntCurr).TypOD_NO_T;
                --// �o�ɕi�ڔԍ�
                vc2ITEM_CD := Typ_REC(LNumCntCurr).TypITEM_CD_T;
                --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
                vc2PS_EDITION := Typ_REC(LNumCntCurr).TypPS_EDITION_T;
                --// �����ԍ�
                vc2PUCH_ODR_CD := Typ_REC(LNumCntCurr).TypPUCH_ODR_CD_T;
                --// ��ƌv��ԍ�
                vc2WORK_ODR_CD := pvc2WorkOdrCd;
                --// �d�|��ƃR�[�h
                vc2WORK_IN_PROC_CD := pvc2WorkInProcCd;
              --// ��ƌn��ʎd�|���� nesn
                OPEN Cur_Proc_By_Proc ;
                FETCH Cur_Proc_By_Proc INTO numOUTSIDE_TYP, vc2WS_CD, vc2COMPANY_CD, vc2VEND_CD, vc2PUCH_ODR_CD ;
                IF Cur_Proc_By_Proc%FOUND = FALSE THEN
                   RAISE excT_WORK_IN_PROC_BY_PROC_ERR;
                END IF;
                CLOSE Cur_Proc_By_Proc ;

                --// ��Ƌ�R�[�h���H���ۊǏꏊ�R�[�h�ݒ� nesn
                --// ��Ƌ�R�[�h�F���쎞�͍�ƌn��ʎd�|���ݒ�B�O�쎞��NULL�B
                --// �H���ۊǏꏊ�R�[�h�F�O�쎞�͍ŏ��̓���H���̍�Ƌ�R�[�h��p����B
                IF (numOUTSIDE_TYP = 1) THEN
                    --// ��Ƌ挟�����H���ۊǏꏊ�R�[�h�ݒ� nesn
                    OPEN Cur_M_Ws(vc2WS_CD) ;
                    FETCH Cur_M_Ws INTO vc2WH_CD ;
                    IF Cur_M_Ws%FOUND = FALSE THEN
                       RAISE excM_WS_ERR;
                    END IF;                    
                    CLOSE Cur_M_Ws ;
                    numCONS_TYP := 0;     --add 20030923 ���쎞�x���敪0�Œ�
                ELSE
                    vc2WS_CD2 := '';
                    OPEN Cur_Proc_Ws_Cd(vc2WORK_ODR_CD) ; --20031008�C��
                    FETCH Cur_Proc_Ws_Cd INTO vc2WS_CD2 ;
                    IF Cur_Proc_Ws_Cd%FOUND = FALSE THEN
                     --�擾�ł��Ȃ��ꍇ�͂ǂ����邩�ۗ�
                       vc2WH_CD := ''; --20031008�C�� RAISE excM_WS_ERR2;
                    END IF;                    
                    CLOSE Cur_Proc_Ws_Cd ;

                    IF vc2WS_CD2 IS NOT NULL THEN
                        OPEN Cur_M_Ws(vc2WS_CD2) ; --20031008�ǉ�
                        FETCH Cur_M_Ws INTO vc2WH_CD ;
                        IF Cur_M_Ws%FOUND = FALSE THEN
                            RAISE excM_WS_ERR;
                        END IF;                    
                        CLOSE Cur_M_Ws ;
                    END IF;

                    vc2WS_CD := '' ;
                    numCONS_TYP := 0;
                    
                END IF;
                  
                --// �o�Ɏw���P�ʐ��A�o�Ɏw���P�ʐ�����A�o�Ɏw���P�ʐ����q�A�o�Ɏw���� nesn
                --// �[���i�ړW�J�t���O(0:OFF,1:ON)
                if Typ_REC(LNumCntCurr).TypODINFO_DISGUISE_T = 1 then
--vc2RunChkComment := '���������ʉ� 10110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    --// �p�����[�^�́u�d�|��ƃR�[�h�v�����H���̏ꍇ
                    IF pvc2WorkInProcCd <> vc2WorkInProcCd THEN
                        --//�o�Ɏw���֏o�͂��Ȃ�
                        numISSUE_INST_QTY := 0;
                    ELSE
                    --//�e�f�[�^�̏o�ɒP�ʐ����擾
                    --//�e�I�[�_�f�}���h�ԍ��̑ޔ�
                        LNumPARENT_OD_NoTemp := Typ_REC(LNumCntCurr).TypPARENT_OD_NO_T;
                        LNumCntCurr_ISSUE_INST := 0;
                        loop
                            IF Typ_REC(LNumCntCurr_ISSUE_INST).TypOD_NO_T = LNumPARENT_OD_NoTemp THEN
                                --// �e�i�ڍ݌ɐ��ʒP�ʋ敪�̎擾
--vc2RunChkComment := '���������ʉ� 10120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                                open Cur_PuchOdrInst_UNIT_QTY_TYP
                                        (Typ_REC(LNumCntCurr_ISSUE_INST).TypITEM_CD_T);
                                fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumISSUE_INST_UNIT_QTY_TYP;
                                IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                                    RAISE excUNIT_QTY_TYP_ERR;
                                END IF;
                                close Cur_PuchOdrInst_UNIT_QTY_TYP;
                                --// �q�i�ڍ݌ɐ��ʒP�ʋ敪�̎擾
--vc2RunChkComment := '���������ʉ� 10120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                                open Cur_PuchOdrInst_UNIT_QTY_TYP
                                        (Typ_REC(LNumCntCurr).TypITEM_CD_T);
                                fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumUNIT_QTY_TYP;
                                IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                                    RAISE excUNIT_QTY_TYP_ERR;
                                END IF;
                                close Cur_PuchOdrInst_UNIT_QTY_TYP;
--//20031211 ins ��
                              --//�o�ɒP�ʐ� = �e�f�[�^.�o�ɒP�ʐ� * �q�f�[�^�o�ɒP�ʐ�
                              --//������5�ʐ؏グ
                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T *
                                                          Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T * 10000) / 10000;
                              --//�o�ɒP�ʐ����� = �e�f�[�^.�o�ɒP�ʐ����� * �q�f�[�^�o�ɒP�ʐ�����
                              --//������5�ʐ؏グ
                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T *
                                                                  Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T * 10000) / 10000;
                              --//�o�ɒP�ʐ����q = �e�f�[�^.�o�ɒP�ʐ����q * �q�f�[�^�o�ɒP�ʐ����q
                              --//������5�ʐ؏グ
                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T *
                                                                Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T * 10000) / 10000;
--//20031211 ins ��
                                if LNumISSUE_INST_UNIT_QTY_TYP = 1 then --//�e�i�ڍ݌ɐ��ʒP�ʋ敪 1:�����Ǘ��A2:�����Ǘ�
                                    --�e�i�ڏo�Ɏw����
                                    numISSUE_INST_QTY := ceil(pnumOprInstQty * Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T);
                                else
                                    --�e�i�ڏo�Ɏw����
                                    numISSUE_INST_QTY := ceil((pnumOprInstQty * Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000; 
                                end if;
                                if LNumUNIT_QTY_TYP = 1 then --//�݌ɐ��ʒP�ʋ敪 1:�����Ǘ��A2:�����Ǘ�
--vc2RunChkComment := '���������ʉ� 10130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--20031211                              --//�o�ɒP�ʐ� = �e�f�[�^.�o�ɒP�ʐ� * �q�f�[�^�o�ɒP�ʐ�
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T);
--20031211                              --//�o�ɒP�ʐ����� = �e�f�[�^.�o�ɒP�ʐ����� * �q�f�[�^�o�ɒP�ʐ�����
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T);
--20031211                              --//�o�ɒP�ʐ����q = �e�f�[�^.�o�ɒP�ʐ����q * �q�f�[�^�o�ɒP�ʐ����q
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T);
                                  --//�o�Ɏw���� =   ��Ǝw���� *  ( �o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ�����) nesn
                                  --//�����؏グ
--20031210                                numISSUE_INST_QTY := ceil(pnumOprInstQty * (numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR)); --nesn 0830
                                    if SYS_SPOIL_FLG = 1 then
                                      --�q�i�ڏo�Ɏw����
                                      numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T); 
                                    else
                                      --�q�i�ڏo�Ɏw����
                                      numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T);
                                    end if;
                                else
--vc2RunChkComment := '���������ʉ� 10140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--20031211                              --//�o�ɒP�ʐ� = �e�f�[�^.�o�ɒP�ʐ� * �q�f�[�^�o�ɒP�ʐ�
--20031211                              --//������5�ʐ؏グ
--20031211                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T * 10000) / 10000;
--20031211                              --//�o�ɒP�ʐ����� = �e�f�[�^.�o�ɒP�ʐ����� * �q�f�[�^�o�ɒP�ʐ�����
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T * 10000) / 10000;
--20031211                              --//�o�ɒP�ʐ����q = �e�f�[�^.�o�ɒP�ʐ����q * �q�f�[�^�o�ɒP�ʐ����q
--20031211                              --//�����؏グ
--20031211                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T * 10000) / 10000;
                                  --//�o�Ɏw���� =   ��Ǝw���� *  ( �o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ�����) nesn
                                  --//������5�ʐ؏グ
--20031210                                numISSUE_INST_QTY := ceil(pnumOprInstQty * (numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * 10000) / 10000;
                                    if SYS_SPOIL_FLG = 1 then
                                      --�q�i�ڏo�Ɏw����
                                      numISSUE_INST_QTY := ceil((numISSUE_INST_QTY * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000; --//20031210
                                    else
                                      --�q�i�ڏo�Ɏw����
                                      numISSUE_INST_QTY := ceil((numISSUE_INST_QTY * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000; --//2003121
                                    end if;
                                end if;
                            END IF;
                            EXIT WHEN Typ_REC(LNumCntCurr_ISSUE_INST).TypOD_NO_T = LNumPARENT_OD_NoTemp
                                       or LNumCntCurr_ISSUE_INST >= LLngCntMax;
                            LNumCntCurr_ISSUE_INST := LNumCntCurr_ISSUE_INST + 1;
                        end loop;
                        LNumCntCurr_ISSUE_INST := 0;
                    END IF;
                else
--vc2RunChkComment := '���������ʉ� 10150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    --// �o�Ɏw���P�ʐ�
                    numISSUE_INST_UNIT_QTY := Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T;
                    --// �o�Ɏw���P�ʐ����� nesn 0830
                    numISSUE_INST_UNIT_DENOMINATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                    --// �o�Ɏw���P�ʐ����q nesn 0830
                    numISSUE_INST_UNIT_NUMERATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T;
                    --// ���o�w�����܂��͏o�Ɏw���������߂�
                    IF pvc2WorkInProcCd <> vc2WorkInProcCd THEN
                    --// �p�����[�^�́u�d�|��ƃR�[�h�v�����H���̏ꍇ
                       IF SYS_SPOIL_FLG = 1 THEN
                         numOprInstQty :=  pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100);
                       ELSE
                         numOprInstQty :=  pnumOprInstQty;
                       END IF;
                    
					IF Typ_REC(LNumCntCurr).TypPATTERN_CD_T IS NULL THEN

					/* [�p�^�[���ʕ��o]."�p�^�[���R�[�h"��Null�̏ꍇ */
                    /* [���o].���o�P�ʐ����q���g�p�����o�w�����̎擾�i���H���ȊO�̕��o�w�����j */
                        OPEN Cur_Issue_Qty_Next(
                               pvc2PlantCd,                                   --// �H��R�[�h
                               vc2ParentItemCd,                               --// �e�i�ڔԍ�
                               pvc2WorkInProcCd,                              --// �d�|��ƃR�[�h
                               Typ_REC(LNumCntCurr).TypITEM_CD_T,             --// �o�ɕi�ڔԍ�
                               Typ_REC(LNumCntCurr).TypPS_EDITION_T,          --// �o�ɕi�ڍ\���Ő�
                               numOprInstQty, --// ��Ǝw����
                               Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T  --// ���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
                        );
                        --FETCH Cur_Issue_Qty_Next INTO numIssueQty;
                        FETCH Cur_Issue_Qty_Next INTO numIssueQty, numIssueNumerator;
                        IF Cur_Issue_Qty_Next%FOUND = FALSE THEN
                            numIssueQty := 0; --// �f�[�^���Ȃ����́A���o�w������0�Ƃ���
                            numIssueNumerator := 0;
                        END IF;
                        CLOSE Cur_Issue_Qty_Next;
                        numISSUE_INST_QTY := numIssueQty;
                        
                        numISSUE_INST_UNIT_NUMERATOR :=  numIssueNumerator;
                        
                    ELSE
                    /* [�p�^�[���ʕ��o]."�p�^�[���R�[�h"��Null�ȊO�̏ꍇ */
                    /* [�p�^�[���ʕ��o].���o�P�ʐ����q���g�p�����o�w�����̎擾�i���H���ȊO�̕��o�w�����j */
                        OPEN Cur_Issue_Qty_Next_Pattern(
                               pvc2PlantCd,                                   --// �H��R�[�h
                               vc2ParentItemCd,                               --// �e�i�ڔԍ�
                               pvc2WorkInProcCd,                              --// �d�|��ƃR�[�h
                               Typ_REC(LNumCntCurr).TypITEM_CD_T,             --// �o�ɕi�ڔԍ�
                               Typ_REC(LNumCntCurr).TypPS_EDITION_T,          --// �o�ɕi�ڍ\���Ő�
                               numOprInstQty, --// ��Ǝw����
                               Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T,  --// ���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
                               Typ_REC(LNumCntCurr).TypPATTERN_CD_T  		  --// �p�^�[���R�[�h
                        );
                        --FETCH Cur_Issue_Qty_Next_Pattern INTO numIssueQty;
                        FETCH Cur_Issue_Qty_Next_Pattern INTO numIssueQty, numIssueNumerator;
                        IF Cur_Issue_Qty_Next_Pattern%FOUND = FALSE THEN
                            numIssueQty := 0; --// �f�[�^���Ȃ����́A���o�w������0�Ƃ���
                            numIssueNumerator := 0;
                        END IF;
                        CLOSE Cur_Issue_Qty_Next_Pattern;
                        numISSUE_INST_QTY := numIssueQty;
                        
                        numISSUE_INST_UNIT_NUMERATOR :=  numIssueNumerator;
                        
                    END IF;
                        
                    ELSE
					--// �p�����[�^�́u�d�|��ƃR�[�h�v�����H���̏ꍇ
					
                    IF Typ_REC(LNumCntCurr).TypPATTERN_CD_T IS NULL THEN
                    /* [�p�^�[���ʕ��o]."�p�^�[���R�[�h"��Null�̏ꍇ */
                    /* [���o].���o�P�ʐ����q���g�p�����o�w�����̎擾�i���H���ȊO�̕��o�w�����j */
                        OPEN Cur_Issue_Qty_First(
                               pvc2PlantCd,                                   --// �H��R�[�h
                               vc2ParentItemCd,                               --// �e�i�ڔԍ�
                               pvc2WorkInProcCd,                              --// �d�|��ƃR�[�h
                               Typ_REC(LNumCntCurr).TypITEM_CD_T,             --// �o�ɕi�ڔԍ�
                               Typ_REC(LNumCntCurr).TypPS_EDITION_T,          --// �o�ɕi�ڍ\���Ő�
                               pnumOprInstQty,                                --// ��Ǝw����
                               Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T  --// ���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
                        );
                        
                        --FETCH Cur_Issue_Qty_First INTO numIssueQty;
                        --FETCH Cur_Issue_Qty_First INTO numIssueQty, numIssueNumerator ;
                        FETCH Cur_Issue_Qty_First INTO numIssueNumerator ;
                        
                        IF Cur_Issue_Qty_First%FOUND = FALSE THEN
                            --numIssueQty := 0; --// �f�[�^���Ȃ����́A���o�w������0�Ƃ���
                            numIssueNumerator := 0;
                        END IF;
                        CLOSE Cur_Issue_Qty_First;
                        --// �K�v�w���������߂�
                        --// �u��Ǝw�����v�i�p�����[�^�j * [�o�Ɍv��].���i�\���P�ʐ����q�i�o�Ɏw���P�ʐ����q�j
                        --//                    / [�o�Ɍv��].���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
                        --numNeedQty := pnumOprInstQty * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T
                        --                    / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;

                        numISSUE_INST_UNIT_NUMERATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T - numIssueNumerator;
 
                        IF SYS_SPOIL_FLG = 1 THEN                        
						  --�o�Ɏw����=�u��Ǝw�����v�~��L�́u�o�Ɏw���P�ʐ����q�v/[�o�Ɍv��]."�o�Ɏw���P�ʐ�����"
                          --numISSUE_INST_QTY := numNeedQty - numIssueQty;
                          numISSUE_INST_QTY := pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                           numISSUE_INST_UNIT_NUMERATOR /Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                        ELSE
                          numISSUE_INST_QTY := pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR /
                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                        END IF;

                    ELSE
                    
                    /* [�p�^�[���ʕ��o]."�p�^�[���R�[�h"��Null�ȊO�̏ꍇ */
                    /* [�p�^�[���ʕ��o].���o�P�ʐ����q���g�p�����o�w�����̎擾�i���H���ȊO�̕��o�w�����j */
                        OPEN Cur_Issue_Qty_First_Pattern(
                               pvc2PlantCd,                                   --// �H��R�[�h
                               vc2ParentItemCd,                               --// �e�i�ڔԍ�
                               pvc2WorkInProcCd,                              --// �d�|��ƃR�[�h
                               Typ_REC(LNumCntCurr).TypITEM_CD_T,             --// �o�ɕi�ڔԍ�
                               Typ_REC(LNumCntCurr).TypPS_EDITION_T,          --// �o�ɕi�ڍ\���Ő�
                               pnumOprInstQty,                                --// ��Ǝw����
                               Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T,  --// ���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
                               Typ_REC(LNumCntCurr).TypPATTERN_CD_T  --// �p�^�[���R�[�h
                        );
                        --FETCH Cur_Issue_Qty_First_Pattern INTO numIssueQty;
						--FETCH Cur_Issue_Qty_First_Pattern INTO numIssueQty, numIssueNumerator;
						FETCH Cur_Issue_Qty_First_Pattern INTO numIssueNumerator;
                        IF Cur_Issue_Qty_First_Pattern%FOUND = FALSE THEN
                            --numIssueQty := 0; --// �f�[�^���Ȃ����́A���o�w������0�Ƃ���
                            numIssueNumerator := 0;
                        END IF;
                        CLOSE Cur_Issue_Qty_First_Pattern;
                        --// �K�v�w���������߂�
                        --// �u��Ǝw�����v�i�p�����[�^�j * [�o�Ɍv��].���i�\���P�ʐ����q�i�o�Ɏw���P�ʐ����q�j
                        --//                    / [�o�Ɍv��].���i�\���P�ʐ�����i�o�Ɏw���P�ʐ�����j
                        --numNeedQty := pnumOprInstQty * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T
                        --                    / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;

                        numISSUE_INST_UNIT_NUMERATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T - numIssueNumerator;

                        
                        IF SYS_SPOIL_FLG = 1 THEN 
						  --�o�Ɏw����=�u��Ǝw�����v�~��L�́u�o�Ɏw���P�ʐ����q�v/[�o�Ɍv��]."�o�Ɏw���P�ʐ�����"
                          --numISSUE_INST_QTY := numNeedQty - numIssueQty;
                          numISSUE_INST_QTY := pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                            numISSUE_INST_UNIT_NUMERATOR/ Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                        ELSE
                          numISSUE_INST_QTY := pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                        END IF;
                        
                    END IF;
                        
                    END IF;
                    --// �݌ɐ��ʒP�ʋ敪�̎擾
                    open Cur_PuchOdrInst_UNIT_QTY_TYP
                            (Typ_REC(LNumCntCurr).TypITEM_CD_T);
                            fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumUNIT_QTY_TYP;
                    IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                        RAISE excUNIT_QTY_TYP_ERR;
                    END IF;
                    close Cur_PuchOdrInst_UNIT_QTY_TYP;
                    if LNumUNIT_QTY_TYP = 1 then --//�݌ɐ��ʒP�ʋ敪 1:�����Ǘ��A2:�����Ǘ�
--                        numISSUE_INST_QTY := ceil(numISSUE_INST_UNIT_QTY * pnumOprInstQty);
--20031210                        numISSUE_INST_QTY := ceil(pnumOprInstQty * (numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR)); --nesn 0830
                      --//�o�Ɏw����
                      --//�����؏グ
                        numISSUE_INST_QTY := ceil(numISSUE_INST_QTY);
						numISSUE_INST_UNIT_QTY := ceil(numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR);
                    else
                      --//�o�Ɏw���� =   ��Ǝw���� *  ( �o�Ɏw���P�ʐ����q / �o�Ɏw���P�ʐ�����)
                      --//������5�ʐ؏グ
--                        numISSUE_INST_QTY := ceil(numISSUE_INST_UNIT_QTY * pnumOprInstQty * 10000) / 10000;
--20031210                         numISSUE_INST_QTY := ceil(pnumOprInstQty * (numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * 10000) / 10000;  --nesn 0830
                         numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * 10000) / 10000;
						 numISSUE_INST_UNIT_QTY := ceil((numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * 10000) / 10000;
                    end if;
                end if;
                --// �o�ɗ݌v��
                numTOTAL_ISSUE_QTY := 0;
                --// �o�ɗ\���
                dtmSCDL_ISSUE_DATE := Typ_REC(LNumCntCurr).TypSCDL_ISSUE_DATE_T;
                --// �o�Ɋ�����
                dtmISSUE_CMPLT_DATE := NULL;
                --// �o�Ɏw���o�ɋ敪
                numISSUE_TYP := Typ_REC(LNumCntCurr).TypISSUE_TYP_T;
                --// �o�Ɋ����t���O
                numISSUE_CMPLT_FLG := 0;
                --// �o�Ɏw�������s�ς݃t���O
                numISSUE_INST_ISS_FLG := 0;
                --// �o�Ɏw�������s��
                dtmISSUE_INST_DATE := NULL;
                --// �o�Ɏw�����l
                vc2ISSUE_INST_COMMENT := '';
                --// �H��R�[�h
                vc2PLANT_CD := Typ_REC(LNumCntCurr).TypPLANT_CD_T;
                LNumCntMax_ISSUE_INST := LNumCntMax_ISSUE_INST + 1;
                --// �o�Ɏw�����i�v�Z�ŋ��߂����o�w��������яo�Ɏw�����j���O�ȊO�̎��A�o�Ɏw���֒ǉ�����
                IF numISSUE_INST_QTY <> 0 THEN
--vc2RunChkComment := '���������ʉ� 10160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
-- ���� 2008/08/11 ADD START -TSUCHIDA ����
					-- �H���Ǘ��i�ڋ敪�擾
					OPEN Cur_Manhour_Typ(vc2ITEM_CD);
					FETCH Cur_Manhour_Typ into numManhourTyp;
					CLOSE Cur_Manhour_Typ;

					-- �H���Ǘ��i�ڋ敪��1�̏ꍇ�o�Ɏw���ɒǉ����Ȃ�
					IF numManhourTyp != 1 THEN
-- ���� 2008/08/11 ADD END -TSUCHIDA ����
                    --�o�Ɏw���ǉ�
                    insert into T_ISSUE_INST (
                    ISSUE_INST_CD,
                    PLANT_CD,
                    OD_NO,
                    ITEM_CD,
                    PS_EDITION,
                    PUCH_ODR_CD,
                    COMPANY_CD,                     --// ��ЃR�[�h nesn
                    VEND_CD,                        --// �����R�[�h nesn
                    CONS_TYP,                       --// �x���敪 nesn 
                    WORK_ODR_CD,
                    WORK_IN_PROC_CD,
                    WS_CD,                          --// ��Ƌ�R�[�h nesn
                    WH_CD,                          --// �H���ۊǏꏊ�R�[�h nesn         
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
                    CREATED_PRG_NM,                 --// �쐬�v���O������ nesn
                    UPDATED_DATE,
                    UPDATED_BY,
                    UPDATED_PRG_NM,                 --// �X�V�v���O������ nesn
                    MODIFY_COUNT                    --// �X�V�� nesn 
                    )
                     values(
                    vc2ISSUE_INST_CD,               --// �o�Ɏw���ԍ�
                    vc2PLANT_CD,                    --// �H��R�[�h
                    vc2OD_NO,                       --// �I�[�_�f�}���h�ԍ�
                    vc2ITEM_CD,                     --// �o�ɕi�ڔԍ�
                    vc2PS_EDITION,                  --// ���i�\���Ő�(���v�i�ڍ\���Ő�)
                    vc2PUCH_ODR_CD,                 --// �����ԍ�
                    vc2COMPANY_CD,                  --// ��ЃR�[�h nesn
                    vc2VEND_CD,                     --// �����R�[�h nesn
                    numCONS_TYP,                    --// �x���敪 nesn 
                    vc2WORK_ODR_CD,                 --// ��ƌv��ԍ�
                    vc2WORK_IN_PROC_CD,             --// �d�|��ƃR�[�h
                    vc2WS_CD,                       --// ��Ƌ�R�[�h nesn 
                    vc2WH_CD,                       --// �H���ۊǏꏊ�R�[�h nesn 
                    numISSUE_INST_UNIT_QTY,         --// �o�Ɏw���P�ʐ�
                    numISSUE_INST_UNIT_DENOMINATOR, --// �o�Ɏw���P�ʐ����� nesn
                    numISSUE_INST_UNIT_NUMERATOR,   --// �o�Ɏw���P�ʐ����q nesn
                    numISSUE_INST_QTY,              --// �o�Ɏw����
                    numTOTAL_ISSUE_QTY,             --// �o�ɗ݌v��
                    dtmSCDL_ISSUE_DATE,             --// �o�ɗ\���
                    dtmISSUE_CMPLT_DATE,            --// �o�Ɋ�����
                    numISSUE_TYP,                   --// �o�Ɏw���o�ɋ敪
                    numISSUE_CMPLT_FLG,             --// �o�Ɋ����t���O
                    numISSUE_INST_ISS_FLG,          --// �o�Ɏw�������s�ς݃t���O
                    dtmISSUE_INST_DATE,             --// �o�Ɏw�������s��
                    vc2ISSUE_INST_COMMENT,          --// �o�Ɏw�����l
                    SYSDATE,
                    pvc2UserId,
                    MY_SQL_NAME,                    --// �쐬�v���O������ nesn
                    SYSDATE,
                    pvc2UserId,
                    MY_SQL_NAME,                    --// �X�V�v���O������ nesn
                    0                               --// �X�V���F�o�^��0 nesn
                    );
-- ���� 2008/08/11 ADD START -TSUCHIDA ����
					END IF;
-- ���� 2008/08/11 ADD END -TSUCHIDA ����
                end if;
              END IF;
            LNumCntCurr := LNumCntCurr + 1;
        end loop;
    END IF;


--END IF;



    --// �o�Ɏw���t�@�C���֒ǉ�
--vc2RunChkComment := '���������ʉ� 00440';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    LNumCntCurr := 0;
--vc2RunChkComment := '���������ʉ� 00460';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    --�g���[�X���O�iend�jnesn
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '���������� �I�� ���������� ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    RETURN true;
--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excUNIT_QTY_TYP_ERR THEN   --�݌ɐ��ʒP�ʋ敪�擾�G���[
--DBMS_OUTPUT.PUT_LINE('�݌ɐ��ʒP�ʋ敪�擾�G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0036)�݌ɐ��ʒP�ʋ敪�擾�G���[',1,1024);
        /* �I�����b�Z�[�W�̏o�� */ -- nesn �����ύX
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --�g���[�X���O�iend�jnesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        RETURN FALSE;
   WHEN excNOTEXIST_SYS_PARAMETER THEN   --�p�����[�^�f�[�^�����݂��܂���
    
        /* �ُ�I���̃��b�Z�[�W */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                             METHOD_END ||'(SBM0037)' || LOGMSG_ERR || '�F' || '�p�����[�^�̎擾�Ɏ��s���܂����B');
                             

        /* TraceLog �̏o�́i���s�ʒu�j */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END || vc2RunChkComment);


        /* TraceLog�̏o�� */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END);
                                    
        RETURN False;
    
    WHEN excERR_GET_NEW_INST_CD THEN   --�o�Ɏw���ԍ��̔ԃG���[
--DBMS_OUTPUT.PUT_LINE('�o�Ɏw���ԍ��̔ԃG���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0038)�o�Ɏw���ԍ��̔ԃG���[',1,1024);
        /* �I�����b�Z�[�W�̏o�� */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --�g���[�X���O�iend�jnesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excT_WORK_IN_PROC_BY_ITEM_ERR THEN   --�i�ڕʎd�|�擾�G���[ nesn
--DBMS_OUTPUT.PUT_LINE('�i�ڕʎd�|�擾�G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0039)�i�ڕʎd�|�擾�G���[',1,1024);
        /* �I�����b�Z�[�W�̏o�� */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --�g���[�X���O�iend�jnesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excM_WS_ERR THEN   --��Ƌ�D�ۊǋ�R�[�h�擾�G���[ nesn
--DBMS_OUTPUT.PUT_LINE('��Ƌ�D�ۊǋ�R�[�h�擾�G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0040)��Ƌ�D�ۊǋ�R�[�h�擾�G���[',1,1024);
        /* �I�����b�Z�[�W�̏o�� */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --�g���[�X���O�iend�jnesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excT_WORK_IN_PROC_BY_PROC_ERR THEN   --��ƌn��ʎd�|�擾�G���[ nesn
--DBMS_OUTPUT.PUT_LINE('��ƌn��ʎd�|�擾�G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0041)��ƌn��ʎd�|�擾�G���[',1,1024);
        /* �I�����b�Z�[�W�̏o�� */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --�g���[�X���O�iend�jnesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excM_WS_ERR2 THEN   --���쏉�H���ɂ���Ƌ�D�ۊǋ�R�[�h�擾�G���[ nesn
--DBMS_OUTPUT.PUT_LINE('���쏉�H���ɂ���Ƌ�D�ۊǋ�R�[�h�擾�G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0042)���쏉�H���ɂ���Ƌ�D�ۊǋ�R�[�h�擾�G���[',1,1024);
        /* �I�����b�Z�[�W�̏o�� */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --�g���[�X���O�iend�jnesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excM_PARENT_ITEM_ERR THEN   --[�i�ڕʎd�|].�i�ڔԍ�(�e�i�ڔԍ�)�̎擾�G���[
--DBMS_OUTPUT.PUT_LINE('[�i�ڕʎd�|].�i�ڔԍ�(�e�i�ڔԍ�)�̎擾�G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0043)[�i�ڕʎd�|].�i�ڔԍ�(�e�i�ڔԍ�)�̎擾�G���[',1,1024);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --�g���[�X���O�iend�j
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excM_FIRST_PROC_ERR THEN   --[��ƌn��ʎd�|].�d�|��ƃR�[�h(���H��)�̎擾�G���[
--DBMS_OUTPUT.PUT_LINE('[��ƌn��ʎd�|].�d�|��ƃR�[�h(���H��)�̎擾�G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0044)[��ƌn��ʎd�|].�d�|��ƃR�[�h(���H��)�̎擾�G���[',1,1024);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --�g���[�X���O�iend�j
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN OTHERS THEN   --���̑��̃G���[
--DBMS_OUTPUT.PUT_LINE('���̑��̃G���[');
        ROLLBACK;
        vc2Comment := SUBSTRB(SQLCODE || SQLERRM,1,1024);
        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog �̏o�́i���s�ʒu�j */ -- nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        COMMIT;
        --�g���[�X���O�iend�jnesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
END;
/
