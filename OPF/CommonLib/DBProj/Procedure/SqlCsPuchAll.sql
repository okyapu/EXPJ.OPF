CREATE OR REPLACE PROCEDURE SQLCSPUCHALL (
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsPuchAll.sql,v $
'$Author: geng-jia $
'$Revision: 1.8 $
'$Date: 2015/11/16 08:20:18 $
'
' �@�\      : �w���P�����ꊇ�o�^����
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
'             pnumBatchTyp         - (i)�o�b�`�����敪
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
' �@�\����  : [�w���i�C���^�t�F�[�X]����ɁA[�w���i�}�X�^]���쐬����B
'            �܂��G���[����[�ꊇ�o�^�G���[]�ɏo�͂���B
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
   ,pnumBatchTyp         IN  NUMBER          --�o�b�`�����敪
   ,pnumYear             IN  NUMBER          --�Ώ۔N�x
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
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSPUCHALL'; --�o�k�^�r�p�k��

    APS_COM_BATCH_START     VARCHAR2(28) := 'DB02003';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DB02004';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DB02007';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0343)�w���P�����ꊇ�o�^�������J�n���܂���';
    LOGMSG_END_PGNM         VARCHAR2(200) := '�w���P�����ꊇ�o�^�������I�����܂���';

    STATUS_NORMAL           NUMBER        := 1;          -- ����I��
    STATUS_WARNING          NUMBER        := 2;          -- �x���I��
    STATUS_ERROR          NUMBER        := 3;          -- �ُ�I��


    /* �ϐ��̒�` */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --�t�@�C���n���h��

    numReadCount  NUMBER(11)   := 0;  -- �Ǎ�����
    numErrorCount NUMBER(11)   := 0;  -- �G���[����
    blnRet                  BOOLEAN;        --���ʊ֐��̖ߒl
    vc2Comment              VARCHAR2(1024);  --���b�Z�[�W�쐬�p
    numOverlap     NUMBER(2) := 0; -- �d���t���O
    numRecordCount  NUMBER(11)  := 0;   -- �w���i�C���^�t�F�[�X���[�N�i�[��

    tempItemCd VARCHAR2(100) := 'START'; -- �J��Ԃ��ŕi�ڑޔ�p
    delFlg BOOLEAN := TRUE; -- �J��Ԃ��̍폜�t���O
    errFlg BOOLEAN := FALSE; -- �J��Ԃ��̃G���[�t���O
    numLastCount  NUMBER(11)   := 0;   --�ŏI�s���X�g�J�E���g

    /* ��O�����p�ϐ� */
    excNORMAL_SKIP   EXCEPTION;      --���s�s��
    excERR_CUR       EXCEPTION;      --�J�[�\��OPEN����EXCEPTION

    /* �w���i�C���^�t�F�[�X���[�N */
    TYPE csPuchIfWork IS RECORD (
      itemCd  VARCHAR2(100),
      puchPriorityRefNo NUMBER(6),-- ���[�N�D�揇��
      vendCd VARCHAR2(100), -- ���[�N�����
      effPhaseInDate VARCHAR2(100), -- �L���J�n��
      exis   BOOLEAN := FALSE, -- [�w���i�}�X�^]�ɑ��݂����true�A���݂��Ȃ����false
      err     BOOLEAN := FALSE, -- �G���[�������Ĉꊇ�o�^�G���[�ɓo�^������true�ŁA�w���i�C���^�t�F�[�X�̍X�V�σt���O��1�ɂ��Ȃ��B�G���[���Ȃ���΍w���i�}�X�^�ɓo�^���A�w���i�C���^�t�F�[�X�̓o�^�σt���O��1�ɂ���B
      del     BOOLEAN := FALSE -- true�̂Ƃ��A�w���i�}�X�^�̍폜�t���O���P(�폜�ρj�ɂ���B
    );

    /* �w���i�C���^�t�F�[�X���[�N���X�g */
    TYPE csPuchIfWorkList IS VARRAY(1000000) OF csPuchIfWork;

    /* �w���i�C���^�t�F�[�X���[�N���X�g������ */
    workCsPuchIfWorkList csPuchIfWorkList := csPuchIfWorkList();

    /* �J�[�\���̐錾  �w���i�C���^�t�F�[�X */
    CURSOR curT_CS_PUCH_IF
    IS
    select
      to_char(T_CS_PUCH_IF."COST_TYP") as "COST_TYP",
      T_CS_PUCH_IF."PLANT_CD" as "PLANT_CD",
      T_CS_PUCH_IF."ITEM_CD" as "ITEM_CD",
      T_CS_PUCH_IF."CS_PROC_CD" as "CS_PROC_CD",
      T_CS_PUCH_IF."VEND_CD" as "VEND_CD",
      to_char(T_CS_PUCH_IF."EFF_PHASE_IN_DATE", 'YYYY/MM/DD HH24:MI:SS') as "EFF_PHASE_IN_DATE",
      to_char(T_CS_PUCH_IF."PUCH_PRIORITY_REF_NO") as "PUCH_PRIORITY_REF_NO",
      to_char(T_CS_PUCH_IF."UNIT_COST") as "UNIT_COST",
      to_char(T_CS_PUCH_IF."UNIT_COST_TYP") as "UNIT_COST_TYP",
      T_CS_PUCH_IF."CUR_CD" as "CUR_CD",
      to_char(T_CS_PUCH_IF."EXCH_RATE") as "EXCH_RATE",
      to_char(T_CS_PUCH_IF."PUCH_UNIT_QTY") as "PUCH_UNIT_QTY",
      to_char(T_CS_PUCH_IF."RCY_VAL_UNIT_COST") as "RCY_VAL_UNIT_COST",
      to_char(T_CS_PUCH_IF."RCY_RECOUP_RATE") as "RCY_RECOUP_RATE",
      T_CS_PUCH_IF."CLASIFICATION_CD" as "CLASIFICATION_CD",
      T_CS_PUCH_IF.COMPANY_CD as COMPANY_CD,
      T_CS_PUCH_IF.ORG_CD as ORG_CD,
      T_CS_PUCH_IF."STOCK_UNIT" as "STOCK_UNIT",
      to_char(T_CS_PUCH_IF."CS_PUCH_TYP") as "CS_PUCH_TYP",
      to_char(T_CS_PUCH_IF."ONEROUS_CONS_FLG") as "ONEROUS_CONS_FLG",
      to_char(T_CS_PUCH_IF."TRANSACTION_TYP") as "TRANSACTION_TYP",
      to_char(T_CS_PUCH_IF."UPD_FLG") as "UPD_FLG"
    from
      T_CS_PUCH_IF
-- 2008/04/20 �Ώ۔����̒��ŕi�ځ^�����P�ʂɗL���J�n�����傫�����R�[�h�݂̂��擾����悤�ɏC���@ START
      ,( select YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ITEM_CD,CS_PROC_CD,VEND_CD,MAX(EFF_PHASE_IN_DATE) as MAX_DATE,TRANSACTION_TYP
           from T_CS_PUCH_IF
          where YEAR = pnumYear
            and HALF_TERM_TYP = pnumHalfTermTyp
            and COST_TYP = pnumCostTyp
            and PLANT_CD = pvc2PlantCd
            and CS_PROC_CD = '*'
            and to_date(to_char(EFF_PHASE_IN_DATE, 'YYYYMM'), 'YYYYMM') <= to_date(pnumYyyyMm, 'YYYYMM')
            and UPD_FLG = 0
          group by YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ITEM_CD,CS_PROC_CD,VEND_CD,TRANSACTION_TYP
        )MAX_CS_PUCH
-- 2008/04/20 �Ώ۔����̒��ŕi�ځ^�����P�ʂɗL���J�n�����傫�����R�[�h�݂̂��擾����悤�ɏC���@ END
    where 
-- 2008/04/20 �Ώ۔����̒��ŕi�ځ^�����P�ʂɗL���J�n�����傫�����R�[�h�݂̂��擾����悤�ɏC���A START
          ( T_CS_PUCH_IF."YEAR" = MAX_CS_PUCH."YEAR"
        and T_CS_PUCH_IF.HALF_TERM_TYP = MAX_CS_PUCH.HALF_TERM_TYP
        and T_CS_PUCH_IF.COST_TYP = MAX_CS_PUCH.COST_TYP
        and T_CS_PUCH_IF."PLANT_CD" = MAX_CS_PUCH."PLANT_CD"
        and T_CS_PUCH_IF."ITEM_CD" = MAX_CS_PUCH."ITEM_CD"
        and T_CS_PUCH_IF."CS_PROC_CD" = MAX_CS_PUCH."CS_PROC_CD"
        and T_CS_PUCH_IF."VEND_CD" = MAX_CS_PUCH."VEND_CD"
        and T_CS_PUCH_IF."EFF_PHASE_IN_DATE" = MAX_CS_PUCH."MAX_DATE" )
        and
-- 2008/04/20 �Ώ۔����̒��ŕi�ځ^�����P�ʂɗL���J�n�����傫�����R�[�h�݂̂��擾����悤�ɏC���A END      
        T_CS_PUCH_IF."YEAR" = pnumYear
        and T_CS_PUCH_IF.HALF_TERM_TYP = pnumHalfTermTyp
        and T_CS_PUCH_IF.COST_TYP = pnumCostTyp
        and T_CS_PUCH_IF."PLANT_CD" = pvc2PlantCd
        and T_CS_PUCH_IF."CS_PROC_CD" = '*'
        and to_date(to_char(T_CS_PUCH_IF."EFF_PHASE_IN_DATE", 'YYYYMM'), 'YYYYMM') <= to_date(pnumYyyyMm, 'YYYYMM')
        and T_CS_PUCH_IF."UPD_FLG" = 0
    order by
      T_CS_PUCH_IF."PLANT_CD",
      T_CS_PUCH_IF."ITEM_CD",
      T_CS_PUCH_IF."PUCH_PRIORITY_REF_NO",
      T_CS_PUCH_IF."EFF_PHASE_IN_DATE" DESC,
      T_CS_PUCH_IF."VEND_CD"

    ;
    recT_CS_PUCH_IF curT_CS_PUCH_IF%ROWTYPE;

/*------------------------------------------------------------------------------
'
' �@�\      : �i�ڑ��ݔ���
'
' ����      : pvc2ITEM_CD �i�ڃR�[�h
'
' �߂�l    : BOOLEAN
'
' �@�\����  : �i�ڃ}�X�^�ɑ��݂��邩�m�F����B
'            ���݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
'
'
------------------------------------------------------------------------------*/

FUNCTION FNCITEMEXIST(
  pvc2ITEM_CD IN VARCHAR2
) RETURN BOOLEAN IS
  numItemCount     NUMBER;
BEGIN
  SELECT COUNT(*) INTO numItemCount from M_ITEM
    WHERE ITEM_CD = pvc2ITEM_CD;
  IF numItemCount <> 0 THEN
    RETURN TRUE;
  ELSE
    RETURN FALSE;
  END IF;
END;

/*------------------------------------------------------------------------------
'
' �@�\      : �w���i�}�X�^���ݔ���
'
' ����      : pvc2ITEM_CD �i�ڃR�[�h
'
' �߂�l    : [�w���i�}�X�^]�ɑ��݂����TRUE,���݂��Ȃ����FALSE
'
' �@�\����  : [�w���i�}�X�^]�ɑ��݂��邩�𔻒肵�܂� �B
'
------------------------------------------------------------------------------*/

FUNCTION FNCMCPUCHEXIST(
  pvc2ITEM_CD IN VARCHAR2
) RETURN BOOLEAN IS
  numItemCount     NUMBER;
BEGIN
  SELECT
    COUNT(*)
  INTO numItemCount
  FROM
    M_CS_PUCH
  WHERE
    M_CS_PUCH."YEAR" = pnumYear
    and M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
    and M_CS_PUCH."COST_TYP" = pnumCostTyp
    and M_CS_PUCH."PLANT_CD" = pvc2PlantCd
    and M_CS_PUCH."ITEM_CD" = pvc2ITEM_CD
  ;
  IF numItemCount <> 0 THEN
    RETURN TRUE;
  ELSE
    RETURN FALSE;
  END IF;

END;

/*------------------------------------------------------------------------------
'
' �@�\      : �w���i�}�X�^�D��敪�擾
'
' �߂�l    : �w���i�}�X�^�D��敪
'
' �@�\����  : "�w���i�}�X�^�D��敪"��Ԃ��܂��B
'
------------------------------------------------------------------------------*/

FUNCTION FNCGETPRIORITYTYP(
  pnumPriorityTyp OUT NUMBER
) RETURN NUMBER IS
BEGIN

  SELECT
    M_CS_PUCH_PRIORITY_TYP
  INTO pnumPriorityTyp
  FROM
  SYS_COST_CTRL
  WHERE
    SYS_COST_CTRL."PLANT_CD" = pvc2PlantCd
  ;
  RETURN pnumPriorityTyp;
END;

/*------------------------------------------------------------------------------
'
' �@�\      : �}�X�^�D��ŁA���}�X�^�ɂ���čX�V����Ă��邩�𔻒�
'
' �߂�l    : �w���i�}�X�^�D��敪=1:�}�X�^�A�X�V�敪=2:�}�X�^�ōX�V�̏ꍇ��true��Ԃ��܂��B
'            ��L�ȊO��false��Ԃ��܂��B
'            �}�X�^�X�V�\�ȏꍇ��true�A�ύX�s�̏ꍇ��false
'
' �@�\����  : �}�X�^�D��ŁA���}�X�^�ɂ���čX�V����Ă��邩�𔻒肵�܂��B
'
------------------------------------------------------------------------------*/

FUNCTION FNCISUPDATEDBYMASTER(
  pvc2ItemCd IN VARCHAR2
) RETURN BOOLEAN IS
  pnumUpdateTyp NUMBER;
  pnumdummy NUMBER;
BEGIN
  select
    M_CS_PUCH."UPDATE_TYP" as "UPDATE_TYP"
  INTO pnumUpdateTyp
  FROM
    M_CS_PUCH
  where
    M_CS_PUCH."YEAR" = pnumYear
    and M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
    and M_CS_PUCH."COST_TYP" = pnumCostTyp
    and M_CS_PUCH."PLANT_CD" = pvc2PlantCd
    and M_CS_PUCH."ITEM_CD" = pvc2ItemCd
  ;

  IF FNCGETPRIORITYTYP(pnumdummy) = 1 AND pnumUpdateTyp = 2 THEN
    RETURN TRUE;
  ELSE
    RETURN FALSE;
  END IF;
END;

/*------------------------------------------------------------------------------
'
' �@�\      : �ꊇ�o�^�G���[�o�^
'
' ����      :�@pvc2MessageCode �G���[�̃��b�Z�[�W�R�[�h
'             pnumCount IF���͌����i�Ǎ������j
'
' �߂�l    : BOOLEAN
'
' �@�\����  : ���݂̃G���[����[�ꊇ�o�^�G���[]�ɓo�^����B
'
'
------------------------------------------------------------------------------*/

FUNCTION FNCINSERTCSERROR(
  pvc2MessageCode IN VARCHAR2, -- ���b�Z�[�W�R�[�h
  pnumCount IN NUMBER, -- �Ǎ�����
  pvc2ItemCd  IN VARCHAR2,
  pvc2CsProcCd IN VARCHAR2, -- �H���R�[�h
  pvc2VendCd IN VARCHAR2, -- �����R�[�h
  pvc2EffectiveStartDate  IN VARCHAR2, -- �L���J�n��
  pnumTransactionTyp IN NUMBER -- �����敪
) RETURN BOOLEAN IS
  pvc2SeqCsErrorCd  VARCHAR2(80); --�����ꊇ�o�^�G���[�ԍ�
BEGIN

  SELECT
    to_char(SEQ_CS_ERROR_CD.NEXTVAL, 'FM00000000000000000000') as CS_ERROR_CD
  INTO pvc2SeqCsErrorCd
  FROM
    DUAL
  ;

  INSERT INTO T_CS_ERROR(
    CS_ERROR_CD,
    BATCH_TYP,
    BUSINESS_ID,
    COST_TYP,
    PLANT_CD,
    ITEM_CD,
    CS_PROC_CD,
    VEND_CD,
    PROC_COST_CLS_CD,
    EFFECTIVE_START_DATE,
    TRANSACTION_TYP,
    MESSAGE_CD,
    READ_COUNT,
    REMARKS,
    LIST_ISS_FLG,
    CREATED_DATE,
    CREATED_BY,
    CREATED_PRG_NM,
    UPDATED_DATE,
    UPDATED_BY,
    UPDATED_PRG_NM,
    MODIFY_COUNT
    )
  values
    (pvc2SeqCsErrorCd, -- �G���[�R�[�h
    pnumBatchTyp, -- �o�b�`�����敪
    pvc2BusinessName,
    pnumCostTyp, -- �������
    pvc2PlantCd, -- �H��R�[�h
    pvc2ItemCd, -- �i�ڃR�[�h
    pvc2CsProcCd, -- �H���R�[�h
    pvc2VendCd, -- �����R�[�h
    null,
    to_date(pvc2EffectiveStartDate, 'YYYY/MM/DD HH24:MI:SS'), -- �L���J�n��
    pnumTransactionTyp, -- �����敪
    pvc2MessageCode, -- ���b�Z�[�W�R�[�h
    pnumCount, -- �Ǎ�����
    'YEAR=' || TO_CHAR(pnumYear) || ' HALF_TERM_TYP='|| TO_CHAR(pnumHalfTermTyp),
    0,
    SYSDATE,
    pvc2UserId,
    pvc2BusinessName,
    SYSDATE,
    pvc2UserId,
    pvc2BusinessName,
    0)
    ;
    DBMS_OUTPUT.PUT_LINE(pvc2SeqCsErrorCd);
    return TRUE;

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

    FOR recT_CS_PUCH_IF IN curT_CS_PUCH_IF LOOP
      numReadCount := numReadCount + 1; -- �Ǎ�����+1

      IF (numRecordCount = 0 OR
        recT_CS_PUCH_IF.ITEM_CD != workCsPuchIfWorkList(numRecordCount).itemCd)
        OR
        (recT_CS_PUCH_IF.ITEM_CD = workCsPuchIfWorkList(numRecordCount).itemCd
        AND recT_CS_PUCH_IF.TRANSACTION_TYP != 3
        AND numOverlap = 0)
      THEN
        numOverlap := 0;

        numRecordCount := numRecordCount + 1;
        workCsPuchIfWorkList.EXTEND;
        workCsPuchIfWorkList(numRecordCount).itemCd := recT_CS_PUCH_IF.ITEM_CD;
        workCsPuchIfWorkList(numRecordCount).puchPriorityRefNo := recT_CS_PUCH_IF.PUCH_PRIORITY_REF_NO;
        workCsPuchIfWorkList(numRecordCount).vendCd := recT_CS_PUCH_IF.VEND_CD;
        workCsPuchIfWorkList(numRecordCount).effPhaseInDate := recT_CS_PUCH_IF.EFF_PHASE_IN_DATE;
        workCsPuchIfWorkList(numRecordCount).exis := FNCMCPUCHEXIST(recT_CS_PUCH_IF.ITEM_CD); -- �w���i�}�X�^���ݔ���
        workCsPuchIfWorkList(numRecordCount).err := FALSE;
        workCsPuchIfWorkList(numRecordCount).del := FALSE;

        -- [�i��]���݃`�F�b�N
        IF FNCITEMEXIST(workCsPuchIfWorkList(numRecordCount).itemCd) = FALSE THEN
          -- [�i��]�����݂��Ȃ��ꍇ
          -- �ꊇ�o�^�G���[�ɓo�^
          blnRet := FNCINSERTCSERROR(
            'ZZ11002', -- ���b�Z�[�W�R�[�h
            numReadCount,
            recT_CS_PUCH_IF.ITEM_CD,
            recT_CS_PUCH_IF.CS_PROC_CD, --�@�H���R�[�h
            recT_CS_PUCH_IF.VEND_CD, -- �����R�[�h
            recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- �L���J�n��
            recT_CS_PUCH_IF.TRANSACTION_TYP -- �����敪
            );

          workCsPuchIfWorkList(numRecordCount).err := TRUE;
          numErrorCount := numErrorCount + 1;

        -- �}�X�^�X�V�ۃ`�F�b�N
        ELSIF workCsPuchIfWorkList(numRecordCount).exis = TRUE
                AND FNCISUPDATEDBYMASTER(recT_CS_PUCH_IF.ITEM_CD) = TRUE THEN
          -- �ꊇ�o�^�G���[�ɓo�^
          blnRet := FNCINSERTCSERROR(
            'DB00009', -- ���b�Z�[�W�R�[�h
            numReadCount,
            recT_CS_PUCH_IF.ITEM_CD,
            recT_CS_PUCH_IF.CS_PROC_CD, --�@�H���R�[�h
            recT_CS_PUCH_IF.VEND_CD, -- �����R�[�h
            recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- �L���J�n��
            recT_CS_PUCH_IF.TRANSACTION_TYP -- �����敪
            );

          workCsPuchIfWorkList(numRecordCount).err := TRUE;
          numErrorCount := numErrorCount + 1;
        -- [�w���iIF]."�g�����U�N�V�����^�C�v" 3�i�폜�j�̂Ƃ�
        ELSIF recT_CS_PUCH_IF.TRANSACTION_TYP = 3 THEN
          -- [�w���i�}�X�^]���݃`�F�b�N
          IF workCsPuchIfWorkList(numRecordCount).exis = FALSE THEN
            blnRet := FNCINSERTCSERROR(
              'DB00017', -- ���b�Z�[�W�R�[�h
              numReadCount,
              recT_CS_PUCH_IF.ITEM_CD,
              recT_CS_PUCH_IF.CS_PROC_CD, --�@�H���R�[�h
              recT_CS_PUCH_IF.VEND_CD, -- �����R�[�h
              recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- �L���J�n��
              recT_CS_PUCH_IF.TRANSACTION_TYP -- �����敪
              );

            workCsPuchIfWorkList(numRecordCount).err := TRUE;
            numErrorCount := numErrorCount + 1;
          END IF;
          -- �폜�t���OON
          workCsPuchIfWorkList(numRecordCount).del := TRUE;

        END IF;

        -- [�w���iIF]."�g�����U�N�V�����^�C�v"����
        IF recT_CS_PUCH_IF.TRANSACTION_TYP != 3
          AND workCsPuchIfWorkList(numRecordCount).err != TRUE THEN
          -- [�w���i�}�X�^]���݃`�F�b�N
          IF workCsPuchIfWorkList(numRecordCount).exis = FALSE THEN
          -- [�w���i�}�X�^]�ɑ��݂��Ȃ��ꍇ
            INSERT INTO M_CS_PUCH(
              "YEAR",
              "HALF_TERM_TYP",
              "COST_TYP",
              "PLANT_CD",
              "ITEM_CD",
              "CS_PROC_CD",
              "VEND_CD",
              "UNIT_COST",
              "UNIT_COST_TYP",
              "CUR_CD",
              "EXCH_RATE",
              "PUCH_UNIT_QTY",
              "RCY_VAL_UNIT_COST",
              "RCY_RECOUP_RATE",
              "SUB_VEND_CD",
              "SUB_UNIT_COST",
              "SUB_UNIT_COST_TYP",
              "SUB_CUR_CD",
              "SUB_EXCH_RATE",
              "SUB_PUCH_UNIT_QTY",
              "SUB_RCY_VAL_UNIT_COST",
              "SUB_RCY_RECOUP_RATE",
              "CLASIFICATION_CD",
              "STOCK_UNIT",
              "UNIT_COST_ACCEPT_TYP",
              "CS_PUCH_TYP",
              "ONEROUS_CONS_FLG",
              "UPDATE_TYP",
              "DEL_FLG",
              "COMPANY_CD",
              "ORG_CD",
              CREATED_DATE, --�쐬��
              CREATED_BY, --�쐬��
              CREATED_PRG_NM, --�쐬�v���O������
              UPDATED_DATE, --�X�V��
              UPDATED_BY, --�X�V��
              UPDATED_PRG_NM, --�X�V�v���O������
              MODIFY_COUNT) --�X�V��
            values
              (pnumYear,
              pnumHalfTermTyp,
              recT_CS_PUCH_IF.COST_TYP,
              recT_CS_PUCH_IF.PLANT_CD,
              recT_CS_PUCH_IF.ITEM_CD,
              null,
              recT_CS_PUCH_IF.VEND_CD,
              recT_CS_PUCH_IF.UNIT_COST,
              recT_CS_PUCH_IF.UNIT_COST_TYP,
              recT_CS_PUCH_IF.CUR_CD,
              recT_CS_PUCH_IF.EXCH_RATE,
              recT_CS_PUCH_IF.PUCH_UNIT_QTY,
              recT_CS_PUCH_IF.RCY_VAL_UNIT_COST,
              recT_CS_PUCH_IF.RCY_RECOUP_RATE,
              null,
              0,
              1,
              null,
              0,
              1,
              0,
              0,
              recT_CS_PUCH_IF.CLASIFICATION_CD,
              recT_CS_PUCH_IF.STOCK_UNIT,
              1,
              1,
              recT_CS_PUCH_IF.ONEROUS_CONS_FLG,
              1,
              0,
              recT_CS_PUCH_IF.COMPANY_CD,
              recT_CS_PUCH_IF.ORG_CD,
              SYSDATE,  --�V�X�e������
              pvc2UserId, --����.���[�U�[�h�c
              pvc2BusinessName, --����.�Ɩ���
              SYSDATE,  --�V�X�e������
              pvc2UserId, --����.���[�U�[�h�c
              pvc2BusinessName, --����.�Ɩ���
              0
              )
              ;
          ELSE
            UPDATE
              M_CS_PUCH
            SET
              VEND_CD = recT_CS_PUCH_IF.VEND_CD,
              UNIT_COST = recT_CS_PUCH_IF.UNIT_COST,
              UNIT_COST_TYP = recT_CS_PUCH_IF.UNIT_COST_TYP,
              CUR_CD = recT_CS_PUCH_IF.CUR_CD,
              EXCH_RATE = recT_CS_PUCH_IF.EXCH_RATE,
              PUCH_UNIT_QTY = recT_CS_PUCH_IF.PUCH_UNIT_QTY,
              RCY_VAL_UNIT_COST = recT_CS_PUCH_IF.RCY_VAL_UNIT_COST,
              RCY_RECOUP_RATE = recT_CS_PUCH_IF.RCY_RECOUP_RATE,
              "SUB_VEND_CD" = null,
              "SUB_UNIT_COST" = 0,
              "SUB_UNIT_COST_TYP" = 1,
              "SUB_CUR_CD" = null,
              "SUB_EXCH_RATE" = 0,
              "SUB_PUCH_UNIT_QTY" = 1,
              "SUB_RCY_VAL_UNIT_COST" = 0,
              "SUB_RCY_RECOUP_RATE" = 0,
              "CLASIFICATION_CD" = recT_CS_PUCH_IF.CLASIFICATION_CD,
              "STOCK_UNIT" = recT_CS_PUCH_IF.STOCK_UNIT,
              "UNIT_COST_ACCEPT_TYP" = 1,
              "CS_PUCH_TYP" = 1,
              "ONEROUS_CONS_FLG" = recT_CS_PUCH_IF.ONEROUS_CONS_FLG,
              "UPDATE_TYP" = 1,
              "DEL_FLG" = 0,
              "COMPANY_CD" = recT_CS_PUCH_IF.COMPANY_CD,
              "ORG_CD" = recT_CS_PUCH_IF.ORG_CD,
              UPDATED_DATE = SYSDATE,  --�X�V��
              UPDATED_BY = pvc2UserId, --�X�V��
              UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
              MODIFY_COUNT = MODIFY_COUNT + 1
            WHERE
              M_CS_PUCH."YEAR" = pnumYear
              AND M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
              AND M_CS_PUCH."COST_TYP" = recT_CS_PUCH_IF.COST_TYP
              AND M_CS_PUCH."PLANT_CD" = recT_CS_PUCH_IF.PLANT_CD
              AND M_CS_PUCH."ITEM_CD" = recT_CS_PUCH_IF.ITEM_CD
            ;
          END IF; -- �w���i�}�X�^�ǉ�or�X�V�I��
          numOverlap := numOverlap + 1;
        END IF;

      ELSIF recT_CS_PUCH_IF.ITEM_CD = workCsPuchIfWorkList(numRecordCount).itemCd
        AND (recT_CS_PUCH_IF.PUCH_PRIORITY_REF_NO != workCsPuchIfWorkList(numRecordCount).puchPriorityRefNo
          OR recT_CS_PUCH_IF.VEND_CD != workCsPuchIfWorkList(numRecordCount).vendCd)
        AND recT_CS_PUCH_IF.TRANSACTION_TYP != 3
        AND numOverlap = 1
      THEN
          -- ���[�N�ɒǉ�
          numRecordCount := numRecordCount + 1;
          workCsPuchIfWorkList.EXTEND;
          workCsPuchIfWorkList(numRecordCount).itemCd := recT_CS_PUCH_IF.ITEM_CD;
          workCsPuchIfWorkList(numRecordCount).puchPriorityRefNo := recT_CS_PUCH_IF.PUCH_PRIORITY_REF_NO;
          workCsPuchIfWorkList(numRecordCount).vendCd := recT_CS_PUCH_IF.VEND_CD;
          workCsPuchIfWorkList(numRecordCount).effPhaseInDate := recT_CS_PUCH_IF.EFF_PHASE_IN_DATE;
          workCsPuchIfWorkList(numRecordCount).exis := TRUE;
          workCsPuchIfWorkList(numRecordCount).err := FALSE;
          workCsPuchIfWorkList(numRecordCount).del := FALSE;

          -- �}�X�^�X�V�ۃ`�F�b�N
          IF FNCISUPDATEDBYMASTER(recT_CS_PUCH_IF.ITEM_CD) = TRUE THEN
            -- �ꊇ�o�^�G���[�ɓo�^
            blnRet := FNCINSERTCSERROR(
              'DB00009', -- ���b�Z�[�W�R�[�h
              numReadCount,
              recT_CS_PUCH_IF.ITEM_CD,
              recT_CS_PUCH_IF.CS_PROC_CD, --�@�H���R�[�h
              recT_CS_PUCH_IF.VEND_CD, -- �����R�[�h
              recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- �L���J�n��
              recT_CS_PUCH_IF.TRANSACTION_TYP -- �����敪
              );

            workCsPuchIfWorkList(numRecordCount).err := TRUE;
            numErrorCount := numErrorCount + 1;
           END IF;
        IF workCsPuchIfWorkList(numRecordCount).err = FALSE THEN
          -- �P�����X�V���ă��[�N�ɒǉ�
          UPDATE
            M_CS_PUCH
          SET
            SUB_VEND_CD = recT_CS_PUCH_IF.VEND_CD,
            SUB_UNIT_COST = recT_CS_PUCH_IF.UNIT_COST,
            SUB_UNIT_COST_TYP = recT_CS_PUCH_IF.UNIT_COST_TYP,
            SUB_CUR_CD = recT_CS_PUCH_IF.CUR_CD,
            SUB_EXCH_RATE = recT_CS_PUCH_IF.EXCH_RATE,
            SUB_PUCH_UNIT_QTY = recT_CS_PUCH_IF.PUCH_UNIT_QTY,
            SUB_RCY_VAL_UNIT_COST = recT_CS_PUCH_IF.RCY_VAL_UNIT_COST,
            SUB_RCY_RECOUP_RATE = recT_CS_PUCH_IF.RCY_RECOUP_RATE,
            UPDATED_DATE = SYSDATE,  --�X�V��
            UPDATED_BY = pvc2UserId, --�X�V��
            UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
            MODIFY_COUNT = MODIFY_COUNT + 1
          where
            M_CS_PUCH."YEAR" = pnumYear
            and M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
            and M_CS_PUCH."COST_TYP" = recT_CS_PUCH_IF.COST_TYP
            and M_CS_PUCH."PLANT_CD" = recT_CS_PUCH_IF.PLANT_CD
            and M_CS_PUCH."ITEM_CD" = recT_CS_PUCH_IF.ITEM_CD
          ;
          numOverlap := numOverlap + 1;
        END IF;

      ELSIF numOverlap = 2 THEN
        -- ��񍀖ڂ��X�V���Ă���ꍇ
        -- ���[�N�ɒǉ�
        numRecordCount := numRecordCount + 1;
        workCsPuchIfWorkList.EXTEND;
        workCsPuchIfWorkList(numRecordCount).itemCd := recT_CS_PUCH_IF.ITEM_CD;
        workCsPuchIfWorkList(numRecordCount).puchPriorityRefNo := recT_CS_PUCH_IF.PUCH_PRIORITY_REF_NO;
        workCsPuchIfWorkList(numRecordCount).vendCd := recT_CS_PUCH_IF.VEND_CD;
        workCsPuchIfWorkList(numRecordCount).effPhaseInDate := recT_CS_PUCH_IF.EFF_PHASE_IN_DATE;
        workCsPuchIfWorkList(numRecordCount).exis := TRUE;
        workCsPuchIfWorkList(numRecordCount).err := FALSE;
        workCsPuchIfWorkList(numRecordCount).del := FALSE;

          blnRet := FNCINSERTCSERROR(
            'DB02005', -- ���b�Z�[�W�R�[�h
            numReadCount,
            recT_CS_PUCH_IF.ITEM_CD,
            recT_CS_PUCH_IF.CS_PROC_CD, --�@�H���R�[�h
            recT_CS_PUCH_IF.VEND_CD, -- �����R�[�h
            recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- �L���J�n��
            recT_CS_PUCH_IF.TRANSACTION_TYP -- �����敪
            );
      END IF;
    END LOOP;

    FOR i IN 1..workCsPuchIfWorkList.COUNT-1  LOOP

      tempItemCd := workCsPuchIfWorkList(i).itemCd;

      IF workCsPuchIfWorkList(i).del = FALSE THEN
        delFlg := FALSE;
      ELSE
        delFlg := TRUE;
      END IF;

      IF workCsPuchIfWorkList(i).err = TRUE THEN
        errFlg := TRUE;
      ELSE
        errFlg := FALSE;
      END IF;

      -- �i�ڂ��قȂ�΂����A�O�̕i�ڂɂ��čX�V�E�폜�𔻒f����
      IF tempItemCd != workCsPuchIfWorkList(i+1).itemCd THEN

        IF errFlg = FALSE THEN
          -- �w���i�C���^�t�F�[�X�̕i�ڂ��X�V�ςɂ���
          UPDATE
            T_CS_PUCH_IF
          SET
            "UPD_FLG" = 1,
            UPDATED_DATE = SYSDATE,  --�X�V��
            UPDATED_BY = pvc2UserId, --�X�V��
            UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
            MODIFY_COUNT = MODIFY_COUNT + 1
          WHERE
            T_CS_PUCH_IF."YEAR" = pnumYear
            AND T_CS_PUCH_IF."HALF_TERM_TYP" = pnumHalfTermTyp
            AND T_CS_PUCH_IF."COST_TYP" = pnumCostTyp
            AND T_CS_PUCH_IF."PLANT_CD" = pvc2PlantCd
            AND T_CS_PUCH_IF."ITEM_CD" = tempItemCd
            AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
          ;
        END IF;
        -- ���ׂĂ̏����敪���폜�̏ꍇ�́A�}�X�^��_���폜����B

        IF delFlg = TRUE THEN
          UPDATE
            M_CS_PUCH
          SET
            "UPDATE_TYP" = 1,
            "DEL_FLG" = 1,
            UPDATED_DATE = SYSDATE,  --�X�V��
            UPDATED_BY = pvc2UserId, --�X�V��
            UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
            MODIFY_COUNT = MODIFY_COUNT + 1
          WHERE
            M_CS_PUCH."YEAR" = pnumYear
            AND M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
            AND M_CS_PUCH."COST_TYP" = pnumCostTyp
            AND M_CS_PUCH."PLANT_CD" = pvc2PlantCd
            AND M_CS_PUCH."ITEM_CD" = tempItemCd
          ;
        END IF;
      END IF;
      numLastCount := i;
    END LOOP;
    -- �Ōゾ���ʃ`�F�b�N
    IF numLastCount + 1 = workCsPuchIfWorkList.COUNT THEN
        IF workCsPuchIfWorkList(numLastCount+1).err = FALSE THEN
        -- �w���i�C���^�t�F�[�X�̕i�ڂ��X�V�ςɂ���
            UPDATE
              T_CS_PUCH_IF
            SET
              "UPD_FLG" = 1,
              UPDATED_DATE = SYSDATE,  --�X�V��
              UPDATED_BY = pvc2UserId, --�X�V��
              UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
              MODIFY_COUNT = MODIFY_COUNT + 1
            WHERE
              T_CS_PUCH_IF."YEAR" = pnumYear
              AND T_CS_PUCH_IF."HALF_TERM_TYP" = pnumHalfTermTyp
              AND T_CS_PUCH_IF."COST_TYP" = pnumCostTyp
              AND T_CS_PUCH_IF."PLANT_CD" = pvc2PlantCd
              AND T_CS_PUCH_IF."ITEM_CD" = workCsPuchIfWorkList(numLastCount+1).itemCd
              AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
            ;
        END IF;
        -- ���ׂĂ̏����敪���폜�̏ꍇ�́A�}�X�^��_���폜����B
        IF workCsPuchIfWorkList(numLastCount+1).del = TRUE THEN
            UPDATE
              M_CS_PUCH
            SET
              "UPDATE_TYP" = 1,
              "DEL_FLG" = 1,
              UPDATED_DATE = SYSDATE,  --�X�V��
              UPDATED_BY = pvc2UserId, --�X�V��
              UPDATED_PRG_NM   = pvc2BusinessName,  --�X�V�v���O������
              MODIFY_COUNT = MODIFY_COUNT + 1
            WHERE
              M_CS_PUCH."YEAR" = pnumYear
              AND M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
              AND M_CS_PUCH."COST_TYP" = pnumCostTyp
              AND M_CS_PUCH."PLANT_CD" = pvc2PlantCd
              AND M_CS_PUCH."ITEM_CD" = workCsPuchIfWorkList(numLastCount+1).itemCd
            ;
        END IF;
     END IF;

/* �����̏I�� */

    /* �I�����b�Z�[�W�̏o�� */
    vc2Comment      := SUBSTR('READ COUNT:' || numReadCount || ' ERROR COUNT:' || numErrorCount,1,256);
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

        IF curT_CS_PUCH_IF%ISOPEN = TRUE THEN
            CLOSE curT_CS_PUCH_IF;
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

        IF curT_CS_PUCH_IF%ISOPEN = TRUE THEN
            CLOSE curT_CS_PUCH_IF;
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
