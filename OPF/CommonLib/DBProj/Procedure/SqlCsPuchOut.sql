CREATE OR REPLACE PROCEDURE SQLCSPUCHOUT (
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsPuchOut.sql,v $
'$Author: li-lu $
'$Revision: 1.8 $
'$Date: 2015/11/17 03:01:24 $
'
' �@�\      : �w���P����񒊏o����
'
' �߂�l    :
'
' ������    : ��EXPLANNER/J���ʁi�K�{�j
'             pvc2LogMode          - (i)�k�n�f���[�h
'             pvc2OutputMode       - (i)�o�̓��[�h
'             pvc2OutputPath       - (i)�o�̓t�@�C���p�X
'             pvc2OutputName       - (i)�o�̓t�@�C����
'             pvc2UserId           - (i)���[�U�h�c
'             pvc2BusinessName     - (i)�Ɩ���
'             pvc2PlantCd          - (i)�H��R�[�h
'             ���v���O�����ŗL
'             pnumYear             - (i)�Ώ۔N�x
'             pnumHalfTermTyp      - (i)�����敪
'             pnumCostTyp          - (i)�������
'             pnumYyyyMm           - (i)����̔N��
'             pnumExecuteTyp       - (i)���s�����敪
'                                      1:�H����񒊏o�ƍH�����ꊇ�o�^�i�f�t�H���g�j
'                                      2:�H����񒊏o�����̂�
'                                      3:�H�����ꊇ�o�^�̂�
'             pnumUpdateMode       - (i)�X�V���[�h
'             pnumReturn           - (o)�������� (1:����I���A2:�x���I���A3:�ُ�I��)
'
'
' �@�\����  : [�w���i�P���w�b�_]�A[�w���P��]�A[�x���P��]����ɁA
'            [�w���i�C���^�t�F�[�X]���쐬����B
'
' ���l      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode          IN  VARCHAR2        --�k�n�f���[�h
   ,pvc2OutputMode       IN  VARCHAR2        --�o�̓��[�h
   ,pvc2OutputPath       IN  VARCHAR2        --�o�̓p�X
   ,pvc2OutputName       IN  VARCHAR2        --�o�̓t�@�C����
   ,pvc2UserId           IN  VARCHAR2        --���[�U�h�c
   ,pvc2BusinessName     IN  VARCHAR2        --�Ɩ���
   ,pvc2PlantCd          IN  VARCHAR2        --�H��R�[�h
   ,pvc2Year             IN  NUMBER          --�Ώ۔N�x
   ,pnumHalfTermTyp      IN  NUMBER          --�����敪
   ,pnumCostTyp          IN  NUMBER          --�������
   ,pnumYyyyMm           IN  NUMBER        --����̔N��
   ,pnumExecuteTyp       IN  NUMBER        --���s�����敪
   ,pnumUpdateMode       IN NUMBER        --�X�V���[�h
   ,pnumReturn           OUT  NUMBER        --��������
)
IS
   /* �萔�̐錾 */

    METHOD_START            VARCHAR2(20) := 'START';          --���O�p���\�b�h�J�n�錾
    METHOD_END              VARCHAR2(12) := 'End';            --���O�p���\�b�h�I���錾
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSPUCHOUT'; --�o�k�^�r�p�k��

    APS_COM_BATCH_START     VARCHAR2(28) := 'DB02001';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DB02002';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DB02006';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0344)�w���P����񒊏o�������J�n���܂���';
    LOGMSG_END_PGNM         VARCHAR2(200) := '�w���P����񒊏o�������I�����܂���';

    STATUS_NORMAL           NUMBER        := 1;          -- ����I��
    STATUS_WARNING          NUMBER        := 2;          -- �x���I��
    STATUS_ERROR          NUMBER        := 3;          -- �ُ�I��


    /* �ϐ��̒�` */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --�t�@�C���n���h��

    numCountExtract         NUMBER(11)   := 0;       --���o�f�[�^����
    numCountUpdated         NUMBER(11)   := 0;       --�X�V�f�[�^����
    numCountSelected        NUMBER(11)   := 0;       --�X�V�������J�E���g
    blnRet                  BOOLEAN;        --���ʊ֐��̖ߒl
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�쐬�p

    /* ��O�����p�ϐ� */
    excNORMAL_SKIP   EXCEPTION;      --���s�s��
    excERR_CUR       EXCEPTION;      --�J�[�\��OPEN����EXCEPTION

    /* �J�[�\���̐錾  �w���i�P���i���[�N�j*/
    CURSOR curPUCH_UNIT_COST
    IS
    SELECT
      UNIT_COST.PLANT_CD as PLANT_CD,
      UNIT_COST.ITEM_CD as ITEM_CD,
      UNIT_COST_H.PUCH_PRIORITY_REF_NO as PUCH_PRIORITY_REF_NO,
      UNIT_COST.EFF_PHASE_IN_DATE as EFF_PHASE_IN_DATE,
      UNIT_COST.VEND_CD as VEND_CD,
      trunc(decode(UNIT_COST.PUCH_SIZE, 0, M_PUCH_UNIT_COST.UNIT_COST, M_PUCH_UNIT_COST.UNIT_COST * UNIT_COST.PUCH_SIZE) + 0.00009, 4) as UNIT_COST,
      M_PUCH_UNIT_COST.UNIT_COST_TYP as UNIT_COST_TYP,
      M_VEND_CTRL.CUR_CD as CUR_CD,
      decode(EXCH_RATE.EXCH_RATE, null, 1, EXCH_RATE.EXCH_RATE) as EXCH_RATE,
      decode(UNIT_COST.PUCH_SIZE, 0, 1, UNIT_COST.PUCH_SIZE) as PUCH_UNIT_QTY,
      M_ITEM.CLASIFICATION_CD as CLASIFICATION_CD,
      M_PUCH_UNIT_COST.COMPANY_CD as COMPANY_CD,
      SYS_COST_CTRL.ORG_CD as ORG_CD,
      M_ITEM.STOCK_UNIT as STOCK_UNIT,
      decode(CONS.ONEROUS_FLG, null, 0, CONS.ONEROUS_FLG) as ONEROUS_FLG,
-- 2008/04/20 �w�b�_�Ɩ��ׂő傫���ق��̍X�V����I�� START
--    M_PUCH_UNIT_COST.UPDATED_DATE as UPDATED_DATE,
      CASE WHEN M_PUCH_UNIT_COST.UPDATED_DATE > UNIT_COST_H.UPDATED_DATE_H THEN M_PUCH_UNIT_COST.UPDATED_DATE ELSE UNIT_COST_H.UPDATED_DATE_H END as UPDATED_DATE,
-- 2008/04/20 �w�b�_�Ɩ��ׂő傫���ق��̍X�V����I�� END
      decode(CS_PUCH_IF.PLANT_CD, null, 1, 2) as TRANSACTION_TYP,
      CS_PUCH_IF.SAVE_UPDATED_DATE as SAVE_UPDATED_DATE
    from
      M_PUCH_UNIT_COST,
      M_VEND_CTRL,
      M_ITEM,
      (
        select
          T_CS_PUCH_IF.PLANT_CD as PLANT_CD,
          T_CS_PUCH_IF.ITEM_CD as ITEM_CD,
          T_CS_PUCH_IF.CS_PROC_CD as CS_PROC_CD,
          T_CS_PUCH_IF.VEND_CD as VEND_CD,
          T_CS_PUCH_IF.EFF_PHASE_IN_DATE as EFF_PHASE_IN_DATE,
          T_CS_PUCH_IF.SAVE_UPDATED_DATE as SAVE_UPDATED_DATE
        from
          T_CS_PUCH_IF
        where
          T_CS_PUCH_IF."YEAR" = pvc2Year
          and T_CS_PUCH_IF.HALF_TERM_TYP = pnumHalfTermTyp
          and T_CS_PUCH_IF.COST_TYP = pnumCostTyp
      ) CS_PUCH_IF,
      (
        select
          M_PUCH_UNIT_COST_H.COMPANY_CD,
          M_PUCH_UNIT_COST_H.VEND_CD,
          M_PUCH_UNIT_COST_H.PLANT_CD as PLANT_CD,
          M_PUCH_UNIT_COST_H.ITEM_CD as ITEM_CD,
          min(M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO
-- 2008/04/20 �X�V����ǉ� START
          ,max(UPDATED_DATE) as UPDATED_DATE_H
-- 2008/04/20 �X�V����ǉ� END
        from
          M_PUCH_UNIT_COST_H
        group by
          M_PUCH_UNIT_COST_H.COMPANY_CD,
          M_PUCH_UNIT_COST_H.VEND_CD,
          M_PUCH_UNIT_COST_H.ITEM_CD,
          M_PUCH_UNIT_COST_H.PLANT_CD
      ) UNIT_COST_H,
      (
        select
          UNIT_COST.COMPANY_CD as COMPANY_CD,
          UNIT_COST.VEND_CD as VEND_CD,
          UNIT_COST.PLANT_CD as PLANT_CD,
          UNIT_COST.ITEM_CD as ITEM_CD,
          UNIT_COST.EFF_PHASE_IN_DATE as EFF_PHASE_IN_DATE,
          min(UNIT_COST.PUCH_SIZE) as PUCH_SIZE
        from
          M_PUCH_UNIT_COST UNIT_COST,
          (
            select
              UNIT_COST.COMPANY_CD as COMPANY_CD,
              UNIT_COST.VEND_CD as VEND_CD,
              UNIT_COST.PLANT_CD as PLANT_CD,
              UNIT_COST.ITEM_CD as ITEM_CD,
              max(UNIT_COST.EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
            from
              M_PUCH_UNIT_COST UNIT_COST
            where
              UNIT_COST.PLANT_CD = pvc2PlantCd
              and to_date(to_char(UNIT_COST.EFF_PHASE_IN_DATE, 'YYYYMM'), 'YYYYMM') < to_date(pnumYyyyMm, 'YYYYMM')
            group by
              UNIT_COST.COMPANY_CD,
              UNIT_COST.VEND_CD,
              UNIT_COST.PLANT_CD,
              UNIT_COST.ITEM_CD
          ) UNIT_COST_2
        where
          UNIT_COST.COMPANY_CD = UNIT_COST_2.COMPANY_CD
          and UNIT_COST.VEND_CD = UNIT_COST_2.VEND_CD
          and UNIT_COST.PLANT_CD = UNIT_COST_2.PLANT_CD
          and UNIT_COST.ITEM_CD = UNIT_COST_2.ITEM_CD
          and UNIT_COST.EFF_PHASE_IN_DATE = UNIT_COST_2.EFF_PHASE_IN_DATE
        group by
          UNIT_COST.COMPANY_CD,
          UNIT_COST.VEND_CD,
          UNIT_COST.PLANT_CD,
          UNIT_COST.ITEM_CD,
          UNIT_COST.EFF_PHASE_IN_DATE
      ) UNIT_COST,
      (
        select
          M_EXCH_RATE.COMPANY_CD as COMPANY_CD,
          M_EXCH_RATE.CUR_CD as CUR_CD,
          M_EXCH_RATE.EXCH_TYP as EXCH_TYP,
          M_EXCH_RATE.EXCH_RATE as EXCH_RATE
        from
          M_EXCH_RATE,
          (
            select
              M_EXCH_RATE.COMPANY_CD as COMPANY_CD,
              M_EXCH_RATE.CUR_CD as CUR_CD,
              M_EXCH_RATE.EXCH_TYP as EXCH_TYP,
              max(M_EXCH_RATE.EXCH_START_DATE) as EXCH_START_DATE
            from
              M_EXCH_RATE
            where
              to_date(to_char(M_EXCH_RATE.EXCH_START_DATE, 'YYYYMM'), 'YYYYMM') < to_date(pnumYyyyMm, 'YYYYMM')
            group by
              M_EXCH_RATE.COMPANY_CD,
              M_EXCH_RATE.CUR_CD,
              M_EXCH_RATE.EXCH_TYP
          ) EXCH_RATE
        where
          M_EXCH_RATE.COMPANY_CD = EXCH_RATE.COMPANY_CD
          and M_EXCH_RATE.CUR_CD = EXCH_RATE.CUR_CD
          and M_EXCH_RATE.EXCH_TYP = EXCH_RATE.EXCH_TYP
          and M_EXCH_RATE.EXCH_START_DATE = EXCH_RATE.EXCH_START_DATE
      ) EXCH_RATE,
      (
        select
          M_CONS_UNIT_COST.COMPANY_CD as COMPANY_CD,
          M_CONS_UNIT_COST.PLANT_CD as PLANT_CD,
          M_CONS_UNIT_COST.ITEM_CD as ITEM_CD,
          min(M_CONS_UNIT_COST.ONEROUS_FLG) as ONEROUS_FLG
        from
          M_CONS_UNIT_COST,
          (
            select
              M_CONS_UNIT_COST.COMPANY_CD as COMPANY_CD,
              M_CONS_UNIT_COST.PLANT_CD as PLANT_CD,
              M_CONS_UNIT_COST.ITEM_CD as ITEM_CD,
              max(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
            from
              M_CONS_UNIT_COST
            where
              M_CONS_UNIT_COST.PLANT_CD = pvc2PlantCd
              and to_date(to_char(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE, 'YYYYMM'), 'YYYYMM') < to_date(pnumYyyyMm, 'YYYYMM')
            group by
              M_CONS_UNIT_COST.COMPANY_CD,
              M_CONS_UNIT_COST.PLANT_CD,
              M_CONS_UNIT_COST.ITEM_CD
          ) CONS
        WHERE
          M_CONS_UNIT_COST.COMPANY_CD = CONS.COMPANY_CD
          and M_CONS_UNIT_COST.PLANT_CD = CONS.PLANT_CD
          and M_CONS_UNIT_COST.ITEM_CD = CONS.ITEM_CD
          and M_CONS_UNIT_COST.EFF_PHASE_IN_DATE = CONS.EFF_PHASE_IN_DATE
        group by
          M_CONS_UNIT_COST.COMPANY_CD,
          M_CONS_UNIT_COST.PLANT_CD,
          M_CONS_UNIT_COST.ITEM_CD
      ) CONS,
      SYS_COST_CTRL,
      SYS_MY_COMPANY
    where
      UNIT_COST.COMPANY_CD = M_PUCH_UNIT_COST.COMPANY_CD
      and UNIT_COST.VEND_CD = M_PUCH_UNIT_COST.VEND_CD
      and UNIT_COST.PLANT_CD = M_PUCH_UNIT_COST.PLANT_CD
      and UNIT_COST.ITEM_CD = M_PUCH_UNIT_COST.ITEM_CD
      and UNIT_COST.EFF_PHASE_IN_DATE = M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE
      and UNIT_COST.PUCH_SIZE = M_PUCH_UNIT_COST.PUCH_SIZE
      and UNIT_COST.COMPANY_CD = UNIT_COST_H.COMPANY_CD
      and UNIT_COST.VEND_CD = UNIT_COST_H.VEND_CD
      and UNIT_COST.PLANT_CD = UNIT_COST_H.PLANT_CD
      and UNIT_COST.ITEM_CD = UNIT_COST_H.ITEM_CD
      and UNIT_COST.COMPANY_CD = M_VEND_CTRL.COMPANY_CD
      and UNIT_COST.VEND_CD = M_VEND_CTRL.VEND_CD
      and UNIT_COST.ITEM_CD = M_ITEM.ITEM_CD
      and UNIT_COST.COMPANY_CD = CONS.COMPANY_CD(+)
      and UNIT_COST.PLANT_CD = CONS.PLANT_CD(+)
      and UNIT_COST.ITEM_CD = CONS.ITEM_CD(+)
      and M_VEND_CTRL.COMPANY_CD = EXCH_RATE.COMPANY_CD(+)
      and M_VEND_CTRL.CUR_CD = EXCH_RATE.CUR_CD(+)
      and M_VEND_CTRL.EXCH_TYP = EXCH_RATE.EXCH_TYP(+)
      and UNIT_COST.PLANT_CD = CS_PUCH_IF.PLANT_CD(+)
      and UNIT_COST.ITEM_CD = CS_PUCH_IF.ITEM_CD(+)
      and '*' = CS_PUCH_IF.CS_PROC_CD(+)
      and UNIT_COST.VEND_CD = CS_PUCH_IF.VEND_CD(+)
      and UNIT_COST.EFF_PHASE_IN_DATE = CS_PUCH_IF.EFF_PHASE_IN_DATE(+)
      and UNIT_COST.PLANT_CD = SYS_COST_CTRL.PLANT_CD(+)
      and UNIT_COST.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD
      and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM'
    order by
      UNIT_COST.PLANT_CD,
      UNIT_COST.ITEM_CD,
      UNIT_COST_H.PUCH_PRIORITY_REF_NO,
      UNIT_COST.EFF_PHASE_IN_DATE desc,
      UNIT_COST.VEND_CD
    ;

    recPUCH_UNIT_COST curPUCH_UNIT_COST%ROWTYPE;

/*------------------------------------------------------------------------------
'
' �@�\      : �X�V�\����
'
' ����      : TRANSACTION_TYP �����敪
'             SAVE_UPDATED_DATE �ޔ��X�V��
'            UPDATED_DATE �X�V��
'            pnumExecuteTyp ���s�����敪
'            pnumUpdateMode �X�V���[�h
'
' �߂�l    : BOOLEAN
'
' �@�\����  : ���o�����ɂ����āA�X�V�\�ł��邩�𔻒肵�܂��B
'             �X�V�\�ȏꍇ��true�A�X�V�\�ł͂Ȃ��ꍇ��false
'
'
------------------------------------------------------------------------------*/

FUNCTION FNCCANUPDATE(
  FNC_TRANSACTION_TYP IN NUMBER,
  FNC_SAVE_UPDATED_DATE IN DATE,
  FNC_UPDATED_DATE IN DATE,
  pnumExecuteTyp IN NUMBER,
  pnumUpdateMode IN NUMBER
) RETURN BOOLEAN IS
BEGIN

  -- �����敪���u�X�V�v�ȊO�͑Ώۂɂ��Ȃ�
  IF FNC_TRANSACTION_TYP != 2 THEN
    RETURN FALSE;
  END IF;

  -- �ޔ��X�V�������݂��Ȃ��ꍇ�͍X�V����
  IF FNC_SAVE_UPDATED_DATE IS NULL THEN
    RETURN TRUE;
  END IF;

  -- �u�ޔ��X�V���v<�u�X�V���v�̏ꍇ�͍X�V����B
  IF FNC_SAVE_UPDATED_DATE < FNC_UPDATED_DATE THEN
    RETURN TRUE;
  -- 1:�����X�V�̏ꍇ�͑Ώۂɂ��Ȃ�
  ELSIF pnumUpdateMode = 1 THEN
    RETURN FALSE;
  END IF;

  RETURN TRUE;
END;



BEGIN
    /* LogFile �� OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLog�̏o��(Start)�������s�� */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

    /* �Ɩ��J�n���b�Z�[�W�̏o�� */
    blnRet :=   FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
                          LOGMSG_START_PGNM);
    COMMIT;

/***********************************************************************
' ���C������
***********************************************************************/
    BEGIN  /* �J�[�\��OPEN�i�w���i�P���i���[�N�j */
        OPEN  curPUCH_UNIT_COST;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR('1:OPEN curPUCH_UNIT_COST'  ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE    excERR_CUR;
    END;  /* �J�[�\��OPEN�i�w���i�P���i���[�N�j */

    LOOP  /* �w���i�P���i���[�N�j�J��Ԃ�*/

      BEGIN  /* �J�[�\��FETCH�i�w���i�P���i���[�N�j */
        FETCH curPUCH_UNIT_COST INTO recPUCH_UNIT_COST;
        EXIT WHEN curPUCH_UNIT_COST%NOTFOUND;

      EXCEPTION
        WHEN OTHERS THEN
              vc2Comment := SUBSTR('(SBM0661)2:FETCH �w���i�P���i���[�N�j'  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
        RAISE  excERR_CUR;
      END;  /* �J�[�\��FETCH */

      numCountExtract := numCountExtract+1; /* ���o�����̃C���N�������g */
      DBMS_OUTPUT.PUT_LINE('numCountExtract ' || numCountExtract);

      IF recPUCH_UNIT_COST.TRANSACTION_TYP = 1 THEN

        INSERT INTO
        T_CS_PUCH_IF(
          "YEAR",
          "HALF_TERM_TYP",
          "COST_TYP",
          "PLANT_CD",
          "ITEM_CD",
          "CS_PROC_CD",
          "VEND_CD",
          "EFF_PHASE_IN_DATE",
          "PUCH_PRIORITY_REF_NO",
          "UNIT_COST",
          "UNIT_COST_TYP",
          "CUR_CD",
          "EXCH_RATE",
          "PUCH_UNIT_QTY",
          "RCY_VAL_UNIT_COST",
          "RCY_RECOUP_RATE",
          "CLASIFICATION_CD",
          "COMPANY_CD",
          "ORG_CD",
          "STOCK_UNIT",
          "CS_PUCH_TYP",
          "ONEROUS_CONS_FLG",
          "SAVE_UPDATED_DATE",
          "TRANSACTION_TYP",
          "UPD_FLG",
          CREATED_DATE,                    --�쐬��
          CREATED_BY,                      --�쐬��
          CREATED_PRG_NM,                  --�쐬�v���O������
          UPDATED_DATE,                    --�X�V��
          UPDATED_BY,                      --�X�V��
          UPDATED_PRG_NM,                  --�X�V�v���O������
          MODIFY_COUNT)                    --�X�V��
        values
          (pvc2Year,
          pnumHalfTermTyp,
          pnumCostTyp,
          pvc2PlantCd,
          recPUCH_UNIT_COST.ITEM_CD,
          '*',
          recPUCH_UNIT_COST.VEND_CD,
          recPUCH_UNIT_COST.EFF_PHASE_IN_DATE,
          recPUCH_UNIT_COST.PUCH_PRIORITY_REF_NO,
          recPUCH_UNIT_COST.UNIT_COST,
          recPUCH_UNIT_COST.UNIT_COST_TYP,
          recPUCH_UNIT_COST.CUR_CD,
          recPUCH_UNIT_COST.EXCH_RATE,
          recPUCH_UNIT_COST.PUCH_UNIT_QTY,
          0,
          0,
          recPUCH_UNIT_COST.CLASIFICATION_CD,
          recPUCH_UNIT_COST.COMPANY_CD,
          recPUCH_UNIT_COST.ORG_CD,
          recPUCH_UNIT_COST.STOCK_UNIT,
          1,
          recPUCH_UNIT_COST.ONEROUS_FLG,
          recPUCH_UNIT_COST.UPDATED_DATE,
          recPUCH_UNIT_COST.TRANSACTION_TYP,
          0,
          SYSDATE,                              --�V�X�e������
          pvc2UserId,                              --����.���[�U�[�h�c
          pvc2BusinessName,                        --����.�Ɩ���
          SYSDATE,                                 --�V�X�e������
          pvc2UserId,                              --����.���[�U�[�h�c
          pvc2BusinessName,                        --����.�Ɩ���
          0
          );

      ELSIF
        FNCCANUPDATE(recPUCH_UNIT_COST.TRANSACTION_TYP,
                     recPUCH_UNIT_COST.SAVE_UPDATED_DATE,
                     recPUCH_UNIT_COST.UPDATED_DATE,
                     pnumExecuteTyp,
                     pnumUpdateMode) THEN

        update
          T_CS_PUCH_IF
        set
          "YEAR" = pvc2Year,
          "HALF_TERM_TYP" = pnumHalfTermTyp,
          "COST_TYP" = pnumCostTyp,
          "PLANT_CD" = pvc2PlantCd,
          "ITEM_CD" = recPUCH_UNIT_COST.ITEM_CD,
          "CS_PROC_CD" = '*',
          "VEND_CD" = recPUCH_UNIT_COST.VEND_CD,
          "EFF_PHASE_IN_DATE" = recPUCH_UNIT_COST.EFF_PHASE_IN_DATE,
          "PUCH_PRIORITY_REF_NO" = recPUCH_UNIT_COST.PUCH_PRIORITY_REF_NO,
          "UNIT_COST" = recPUCH_UNIT_COST.UNIT_COST,
          "UNIT_COST_TYP" = recPUCH_UNIT_COST.UNIT_COST_TYP,
          "CUR_CD" = recPUCH_UNIT_COST.CUR_CD,
          "EXCH_RATE" = recPUCH_UNIT_COST.EXCH_RATE,
          "PUCH_UNIT_QTY" = recPUCH_UNIT_COST.PUCH_UNIT_QTY,
          "RCY_VAL_UNIT_COST" = 0,
          "RCY_RECOUP_RATE" = 0,
          "CLASIFICATION_CD" = recPUCH_UNIT_COST.CLASIFICATION_CD,
          "COMPANY_CD" = recPUCH_UNIT_COST.COMPANY_CD,
          "ORG_CD" = recPUCH_UNIT_COST.ORG_CD,
          "STOCK_UNIT" = recPUCH_UNIT_COST.STOCK_UNIT,
          "CS_PUCH_TYP" = 1,
          "ONEROUS_CONS_FLG" = recPUCH_UNIT_COST.ONEROUS_FLG,
          "SAVE_UPDATED_DATE" = recPUCH_UNIT_COST.UPDATED_DATE,
          "TRANSACTION_TYP" = recPUCH_UNIT_COST.TRANSACTION_TYP,
          "UPD_FLG" = 0,
          UPDATED_DATE = SYSDATE,  --�X�V��
          UPDATED_BY = pvc2UserId, --�X�V��
          UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
          MODIFY_COUNT = MODIFY_COUNT + 1
        where
          T_CS_PUCH_IF."YEAR" = pvc2Year
          and T_CS_PUCH_IF."HALF_TERM_TYP" = pnumHalfTermTyp
          and T_CS_PUCH_IF."COST_TYP" = pnumCostTyp
          and T_CS_PUCH_IF."PLANT_CD" = recPUCH_UNIT_COST.PLANT_CD
          and T_CS_PUCH_IF."ITEM_CD" = recPUCH_UNIT_COST.ITEM_CD
          and T_CS_PUCH_IF."CS_PROC_CD" = '*'
          and T_CS_PUCH_IF."VEND_CD" = recPUCH_UNIT_COST.VEND_CD
          and T_CS_PUCH_IF."EFF_PHASE_IN_DATE" = recPUCH_UNIT_COST.EFF_PHASE_IN_DATE
        ;

      END IF;

    END LOOP; /* �w���i�P���i���[�N�j�J��Ԃ�*/

    CLOSE curPUCH_UNIT_COST;

    -- �_���폜����
    UPDATE
      T_CS_PUCH_IF
    SET
      "TRANSACTION_TYP" = 3,
      "UPD_FLG" = 0,
      UPDATED_DATE = SYSDATE,  --�X�V��
      UPDATED_BY = pvc2UserId, --�X�V��
      UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
      MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE
      T_CS_PUCH_IF."YEAR" = pvc2Year
      AND T_CS_PUCH_IF."HALF_TERM_TYP" = pnumHalfTermTyp
      AND T_CS_PUCH_IF."COST_TYP" = pnumCostTyp
      AND T_CS_PUCH_IF."PLANT_CD" = pvc2PlantCd
      AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
      AND T_CS_PUCH_IF."TRANSACTION_TYP" <> '3'
      AND NOT EXISTS(
        SELECT
          1
        FROM
          M_PUCH_UNIT_COST
        WHERE
          M_PUCH_UNIT_COST.COMPANY_CD = T_CS_PUCH_IF."COMPANY_CD"
          AND M_PUCH_UNIT_COST."PLANT_CD" = T_CS_PUCH_IF."PLANT_CD"
          AND M_PUCH_UNIT_COST."ITEM_CD" = T_CS_PUCH_IF."ITEM_CD"
          AND M_PUCH_UNIT_COST."VEND_CD" = T_CS_PUCH_IF."VEND_CD"
          AND M_PUCH_UNIT_COST."EFF_PHASE_IN_DATE" = T_CS_PUCH_IF."EFF_PHASE_IN_DATE"
        )
    ;

    -- �X�V���ꂽ�O���[�v�𖢍X�V�ɂ���
    UPDATE
      T_CS_PUCH_IF
    SET
      T_CS_PUCH_IF."UPD_FLG" = 0,
      UPDATED_DATE = SYSDATE,  --�X�V��
      UPDATED_BY = pvc2UserId, --�X�V��
      UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
      MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE
      EXISTS(
        SELECT
          1
        FROM
          (
            SELECT
              CS."YEAR",
              CS."HALF_TERM_TYP",
              CS."COST_TYP",
              CS."PLANT_CD",
              CS."ITEM_CD"
            FROM
              T_CS_PUCH_IF CS
            WHERE
              CS."YEAR" = pvc2Year
              AND CS."HALF_TERM_TYP" = pnumHalfTermTyp
              AND CS."COST_TYP" = pnumCostTyp
              AND CS."PLANT_CD" = pvc2PlantCd
              AND CS."CS_PROC_CD" = '*'
            GROUP BY
              CS."YEAR",
              CS."HALF_TERM_TYP",
              CS."COST_TYP",
              CS."PLANT_CD",
              CS."ITEM_CD"
            HAVING
              MIN(CS."UPD_FLG") = 0
              AND MIN(CS."TRANSACTION_TYP") <> 3
          ) PUCH_IF
        WHERE
          T_CS_PUCH_IF."YEAR" = PUCH_IF."YEAR"
          AND T_CS_PUCH_IF."HALF_TERM_TYP" = PUCH_IF."HALF_TERM_TYP"
          AND T_CS_PUCH_IF."COST_TYP" = PUCH_IF."COST_TYP"
          AND T_CS_PUCH_IF."PLANT_CD" = PUCH_IF."PLANT_CD"
          AND T_CS_PUCH_IF."ITEM_CD" = PUCH_IF."ITEM_CD"
          AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
      )
      ;
      /* �w���i�C���^�t�F�[�X�̍X�V���� */
      SELECT
          COUNT(1) INTO numCountSelected
        FROM
          T_CS_PUCH_IF,
          (
            SELECT
              CS."YEAR",
              CS."HALF_TERM_TYP",
              CS."COST_TYP",
              CS."PLANT_CD",
              CS."ITEM_CD"
            FROM
              T_CS_PUCH_IF CS
            WHERE
              CS."YEAR" = pvc2Year
              AND CS."HALF_TERM_TYP" = pnumHalfTermTyp
              AND CS."COST_TYP" = pnumCostTyp
              AND CS."PLANT_CD" = pvc2PlantCd
              AND CS."CS_PROC_CD" = '*'
            GROUP BY
              CS."YEAR",
              CS."HALF_TERM_TYP",
              CS."COST_TYP",
              CS."PLANT_CD",
              CS."ITEM_CD"
            HAVING
              MIN(CS."UPD_FLG") = 0
              AND MIN(CS."TRANSACTION_TYP") <> 3
          ) PUCH_IF
        WHERE
          T_CS_PUCH_IF."YEAR" = PUCH_IF."YEAR"
          AND T_CS_PUCH_IF."HALF_TERM_TYP" = PUCH_IF."HALF_TERM_TYP"
          AND T_CS_PUCH_IF."COST_TYP" = PUCH_IF."COST_TYP"
          AND T_CS_PUCH_IF."PLANT_CD" = PUCH_IF."PLANT_CD"
          AND T_CS_PUCH_IF."ITEM_CD" = PUCH_IF."ITEM_CD"
          AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
      ;
      numCountUpdated := numCountUpdated + numCountSelected;    /* ���o�����̃C���N�������g */

/* �����̏I�� */

    /* �I�����b�Z�[�W�̏o�� */
    vc2Comment      := SUBSTR('READ_COUNT=' || numCountExtract || ' UPDATED_COUNT=' || numCountUpdated,1,256);
    blnRet          := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,
                                 pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                                 vc2Comment);

    COMMIT;

    /* �g���[�X���O�̏o��(�I��) */
    blnRet          := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    COMMIT;

    /* LogFile �� CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);
    pnumReturn := STATUS_NORMAL; --����I��


--< ��O���� >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_CUR THEN    --�J�[�\��OPEN���̂c�a�G���[

        IF curPUCH_UNIT_COST%ISOPEN = TRUE THEN
            CLOSE curPUCH_UNIT_COST;
        END IF;

        ROLLBACK;

        /* �I�����b�Z�[�W�̏o�� */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */

    WHEN OTHERS  THEN   --���̑��̃G���[

        IF curPUCH_UNIT_COST%ISOPEN = TRUE THEN
            CLOSE curPUCH_UNIT_COST;
        END IF;

        ROLLBACK;

        /* �I�����b�Z�[�W�̏o�� */
        vc2Comment      := SUBSTR('(SBM0328) �������̑��̃G���[���������܂�������'  ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* �g���[�X���O�̏o��(�I��) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile �� CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* �ُ�I�� */

END;
/
