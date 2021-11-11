CREATE OR REPLACE procedure 	 SQLSTDMATRPROCCOST(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlStdMatrProcCost.sql,v $
'$Author: shan-xiuqin $
'$Revision: 1.21 $ $Date: 2017/01/09 08:30:13 $
'						 2005.10.24 unicode�Ή��ivarchar2��4�{�j
'
' �C������
' 2007.02.01 �@�\����(�S��)
' 2007.08.08 �@�\����(�T��)
'
' �@�\		: �W���ޗ���E���H��v�Z����
'
' �߂�l	:
'
'
' ������	: ��MetamorBase���ʁi�K�{�j
'			  pvc2LogMode		   - (i)�k�n�f���[�h
'			  pvc2OutputMode	   - (i)�o�̓��[�h
'			  pvc2OutputPath	   - (i)�o�̓t�@�C���p�X
'			  pvc2OutputName	   - (i)�o�̓t�@�C����
'			  pvc2UserId		   - (i)���[�U�h�c
'			  pvc2BusinessName	   - (i)�Ɩ���
'			  pvc2PlantCd		   - (i)�H��R�[�h
'			  ���v���O�����ŗL
'			  pnumYear			   - (i)�Ώ۔N�x
'			  pnumHalfTermTyp	   - (i)�����敪
'			  pnumCostTyp		   - (i)�������
'			  pnumActTyp		   - (i)���s�敪�i1:�ʏ���s�A2:�Ď��s�j
'			  pnumReturn		   - (o)�������� (1:����I���A2:�x���I���A3:�ُ�I��)
'
'
' �@�\����	: �W�������v�Z�p��[�\���i���[�N]�A[�w���i�}�X�^]�A[���H��}�X�^]�A[�i�ڕʉ��H��}�X�^]������
'			  [�i�ڕʌ���]�̍ޗ���Ɖ��H��̌v�Z���s���B
'
'
' ���l		:
'
------------------------------------------------------------------------------*/

--< �v���V�[�W������` >-----------------------------------------------------
	pvc2LogMode 		 IN  VARCHAR2		 --�k�n�f���[�h
   ,pvc2OutputMode		 IN  VARCHAR2		 --�o�̓��[�h
   ,pvc2OutputPath		 IN  VARCHAR2		 --�o�̓p�X
   ,pvc2OutputName		 IN  VARCHAR2		 --�o�̓t�@�C����
   ,pvc2UserId			 IN  VARCHAR2		 --���[�U�h�c
   ,pvc2BusinessName	 IN  VARCHAR2		 --�Ɩ���
   ,pvc2PlantCd 		 IN  VARCHAR2		 --�H��R�[�h
   ,pnumYear			 IN  NUMBER 		 --�Ώ۔N�x
   ,pnumHalfTermTyp 	 IN  NUMBER 		 --�����敪
   ,pnumCostTyp 		 IN  NUMBER 		 --�������
   ,pnumActTyp			 IN  NUMBER 		 --���s�敪
   ,pnumReturn			 OUT NUMBER 		 --��������
)
IS

	/* �萔�̐錾 */

	METHOD_START			VARCHAR2(20) := 'START';		  --���O�p���\�b�h�J�n�錾
	METHOD_END				VARCHAR2(12) := 'End';			  --���O�p���\�b�h�I���錾
	MY_SQL_NAME 			VARCHAR2(120) := 'SQLSTDMATRPROCCOST'; --�o�k�^�r�p�k��

	APS_COM_BATCH_START 	VARCHAR2(28) := 'DC01204';
	APS_COM_BATCH_END		VARCHAR2(28) := 'DC01205';
	APS_COM_BATCH_EXP		VARCHAR2(28) := 'DC01206';

	LOGMSG_START_PGNM		VARCHAR2(200) := '(SBM0554)�W���ޗ���E���H��v�Z�������J�n���܂���';
	LOGMSG_END_PGNM 		VARCHAR2(200) := '�W���ޗ���E���H��v�Z�������I�����܂���';
	LOGMSG_EXP_PGNM 		VARCHAR2(200) := '�W���ޗ���E���H��v�Z�������ُ�I�����܂���';

	STATUS_NORMAL			NUMBER		  := 1; 		 -- ����I��
	STATUS_WARNING			NUMBER		  := 2; 		 -- �x���I��
	STATUS_ERROR			NUMBER		  := 3; 		 -- �ُ�I��

	OUTSIDE_PROC_CD 		VARCHAR2(4) := NULL;

	/* �ϐ��̒�` */
	UTL_FileHandle			UTL_FILE.FILE_TYPE;    --�t�@�C���n���h��

	numCntTest				NUMBER(11)	 := 0;	   --DEBUG�p

	numCountLoop			NUMBER(11)	 := 0;	   --LOOP����
	numCntUpper 			NUMBER(11)	 := 0;	   /* �Ώۃf�[�^����(�擪�i) */
	numCntLower 			NUMBER(11)	 := 0;	   /* �Ώۃf�[�^����(���ʓW�J) */
	numCntUpdItemCost		NUMBER(11)	 := 0;	   --����f�[�^����(�i�ڕʌ���)
	numCntUpdItemProcCost	NUMBER(11)	 := 0;	   --����f�[�^����(�i�ڕʉ��H��)
	numCntError 			NUMBER(11)	 := 0;	   --�����v�Z�G���[����
	numCntDummy 			NUMBER(11)	 := 0;	   --�����`�F�b�N�p
	numCntItemProcCost		NUMBER(11)	 := 0;	   --�Ώۃf�[�^����
	numUpLevelNo			NUMBER(2)	 := 0;	   --UP_LEVEL_NO
	blnRet					BOOLEAN;			   --���ʊ֐��̖ߒl
	vc2Comment				VARCHAR2(1024); 		--���b�Z�[�W�쐬�p

	vc2PhaseStartMonth		VARCHAR2(24);			--�w�蔼���̊���
	vc2PhaseEndMonth		VARCHAR2(24);			--�w�蔼���̊�����

	numCostStatemntNo		T_ITEM_COST.COST_STATEMENT_NO%TYPE; 	--�v�Z�o�͏�
	numOwnMatrCost			T_ITEM_COST.OWN_MATR_COST%TYPE; 		--�P�i�ޗ���
	numItemInputRatio		T_ITEM_COST.ITEM_INPUT_RATIO%TYPE;		--�i�ړ����w��
	numOwnProcCostSumSum	T_ITEM_COST.OWN_PROC_COST_SUM_ALL%TYPE; 	--���H�����H��(��T_ITEM_PROC_COST)
	numMaxUpLevelNo 		T_ITEM_COST.UP_LEVEL_NO%TYPE;			--�K�w���x��

	vc2CsCalcErrorCd		T_CS_CALC_ERROR.CS_CALC_ERROR_CD%TYPE;	--�����v�Z�G���[�ԍ�

	numOwnProcCost01		T_ITEM_PROC_COST.OWN_PROC_COST_01%TYPE;   --���H�����H��
	numOwnProcCost02		T_ITEM_PROC_COST.OWN_PROC_COST_02%TYPE;   --���H�����H��
	numOwnProcCost03		T_ITEM_PROC_COST.OWN_PROC_COST_03%TYPE;   --���H�����H��
	numOwnProcCost04		T_ITEM_PROC_COST.OWN_PROC_COST_04%TYPE;   --���H�����H��
	numOwnProcCost05		T_ITEM_PROC_COST.OWN_PROC_COST_05%TYPE;   --���H�����H��
	numOwnProcCost06		T_ITEM_PROC_COST.OWN_PROC_COST_06%TYPE;   --���H�����H��
	numOwnProcCost07		T_ITEM_PROC_COST.OWN_PROC_COST_07%TYPE;   --���H�����H��
	numOwnProcCost08		T_ITEM_PROC_COST.OWN_PROC_COST_08%TYPE;   --���H�����H��
	numOwnProcCost09		T_ITEM_PROC_COST.OWN_PROC_COST_09%TYPE;   --���H�����H��
	numOwnProcCost10		T_ITEM_PROC_COST.OWN_PROC_COST_10%TYPE;   --���H�����H��
	numOwnProcCost11		T_ITEM_PROC_COST.OWN_PROC_COST_11%TYPE;   --���H�����H��
	numOwnProcCost12		T_ITEM_PROC_COST.OWN_PROC_COST_12%TYPE;   --���H�����H��
	numOwnProcCostSum		T_ITEM_PROC_COST.OWN_PROC_COST_SUM%TYPE;  --���H�����H��

	blnCOST_EXCLUDE_FLG 	BOOLEAN;  --�������O����
	blnFoundCsPuch			BOOLEAN;  --�f�[�^�L������(M_CS_PUCH)
	blnLowerSkip			BOOLEAN;  --���ʓW�J���Ȃ�

	/* �����Ǘ��p�����[�^����̎擾���� */
	numStartMonth			SYS_COST_CTRL.START_MONTH%TYPE; 	  --�N�x�J�n��

	/* �w���i�}�X�^����̎擾���� */
	numUnitCostAcceptTyp	M_CS_PUCH.UNIT_COST_ACCEPT_TYP%TYPE;  --�P���̗p�敪
	numUnitCost 			M_CS_PUCH.UNIT_COST%TYPE;			  --�w���P��
	numUnitQty				M_CS_PUCH.PUCH_UNIT_QTY%TYPE;		  --�w���i�P�ʐ�
	numExchRate 			M_CS_PUCH.EXCH_RATE%TYPE;			  --����בփ��[�g
	numSubUnitCost			M_CS_PUCH.SUB_UNIT_COST%TYPE;		  --���w���P��
	numSubUnitQty			M_CS_PUCH.SUB_PUCH_UNIT_QTY%TYPE;	  --���w���i�P�ʐ�
	numSubExchRate			M_CS_PUCH.SUB_EXCH_RATE%TYPE;		  --������בփ��[�g
	vc2ClasificationCd		M_CS_PUCH.CLASIFICATION_CD%TYPE;	  --�i�ڊǗ��R�[�h
	numOnerousConsFlg		M_CS_PUCH.ONEROUS_CONS_FLG%TYPE;	  --�L���x���i�t���O
	numCsPuchTyp			M_CS_PUCH.CS_PUCH_TYP%TYPE; 		   --�w���i�P�����
	numCsProcCd				M_CS_PUCH.CS_PROC_CD%TYPE;         --�H���R�[�h

	/* ��O�����p�ϐ� */
	excERR_SKIP 		  EXCEPTION;	  --���s�s��
	excERR_CURSOR		  EXCEPTION;	  --�J�[�\��OPEN����EXCEPTION

	/* �J�[�\���̐錾 �擪�i*/
	CURSOR curUPPER
	IS
	SELECT T.*
		  ,M1.STOCK_UNIT AS PARENT_ITEM_STOCK_UNIT
		  ,M2.STOCK_UNIT AS STOCK_UNIT
	  FROM T_CS_PS_T T
		  ,M_ITEM M1,M_ITEM M2
	  WHERE   PLANT_CD			= pvc2PlantCd
		AND   T.UPPER_ITEM_FLG	= 1
		AND   T.PARENT_ITEM_CD	= M1.ITEM_CD(+)
		AND   T.COMP_ITEM_CD	= M2.ITEM_CD(+)
--		AND   T.COMP_ITEM_CD  BETWEEN 'UMINO' AND 'UMINO' --DEGUG�p UMINO
	;
	recUPPER curUPPER%ROWTYPE;

	/* �J�[�\���̐錾 �擪�i(�������O�t���O)*/
	CURSOR curUPPER_EXCLUDE
	IS
	SELECT *
	  FROM	 T_ITEM_COST
	  WHERE  YEAR			 = pnumYear
		AND  HALF_TERM_TYP	 = pnumHalfTermTyp
		AND  COST_TYP		 = pnumCostTyp
		AND  PLANT_CD		 = pvc2PlantCd
		AND  UPPER_ITEM_FLG  = 1
--		AND  COST_EXCLUDE_FLG= 0
	;
	recUPPER_EXCLUDE curUPPER_EXCLUDE%ROWTYPE;

	/* �J�[�\���̐錾 ���ʓW�J(1�擪�i�̉��ʕi�ڑS�����K�w���x���̍~���ɓW�J)*/
	CURSOR curLOWER(
		 cvc2StartItem VARCHAR2
	)
	IS
	SELECT T.*
		  ,M1.STOCK_UNIT AS PARENT_ITEM_STOCK_UNIT
		  ,M2.STOCK_UNIT AS STOCK_UNIT
	FROM
	  (SELECT IN1.*
	   FROM  (SELECT * FROM T_CS_PS_T WHERE PLANT_CD=pvc2PlantCd) IN1
	   START WITH IN1.PARENT_ITEM_CD = cvc2StartItem
	   CONNECT BY PRIOR  IN1.COMP_ITEM_CD  = IN1.PARENT_ITEM_CD
	  ) T
	 ,M_ITEM M1,M_ITEM M2
	WHERE	T.PARENT_ITEM_CD = M1.ITEM_CD(+)
	  AND	T.COMP_ITEM_CD = M2.ITEM_CD(+)
	ORDER BY T.UP_LEVEL_NO DESC,T.PARENT_ITEM_CD,T.COMP_ITEM_CD
	;
	recLOWER curLOWER%ROWTYPE;

	/* �J�[�\���̐錾 ���ʓW�J(�������O�t���O)
	   �����v�Z���O���������ꍇ�A����ȍ~�������v�Z���O�̈�
	   SYS_CONNECT_BY_PATH�ɂ��A�����̐e�����擾  */
	CURSOR curLOWER_EXCLUDE(
		 cvc2StartItem VARCHAR2
	)
	IS
--	SELECT T_ITEM_COST.*
	SELECT
 T_ITEM_COST.YEAR
,T_ITEM_COST.HALF_TERM_TYP
,T_ITEM_COST.COST_TYP
,T_ITEM_COST.PLANT_CD
,T_ITEM_COST.ROOT_ITEM_CD
,T_ITEM_COST.PARENT_ITEM_CD
,T_ITEM_COST.ITEM_CD
,T_ITEM_COST.PS_EDITION
,T_ITEM_COST.COST_STATEMENT_NO
		  ,SYS_CONNECT_BY_PATH(T_ITEM_COST.VOLUNT_SPL_FLG,'*') AS EXCLUDE_VOLUNT_SPL_FLG
		  ,SYS_CONNECT_BY_PATH(T_ITEM_COST.COST_UP_TYP,'*') AS EXCLUDE_COST_UP_TYP
		  ,SYS_CONNECT_BY_PATH(T_ITEM_COST.ONEROUS_CONS_FLG,'*') AS EXCLUDE_ONEROUS_CONS_FLG
		  ,SYS_CONNECT_BY_PATH(TO_CHAR(T_ITEM_COST.EFF_PHASE_IN_DATE,'YYYYMMDD'),'*') AS EXCLUDE_EFF_PHASE_IN_DATE
		  ,SYS_CONNECT_BY_PATH(TO_CHAR(T_ITEM_COST.EFF_PHASE_OUT_DATE,'YYYYMMDD'),'*') AS EXCLUDE_EFF_PHASE_OUT_DATE
		  ,SYS_CONNECT_BY_PATH(T_ITEM_COST.OUTSIDE_TYP,'*') AS EXCLUDE_OUTSIDE_TYP
		  ,SYS_CONNECT_BY_PATH(T_ITEM_COST.PROC_OUTSIDE_TYP,'*') AS EXCLUDE_PROC_OUTSIDE_TYP
		  ,SYS_CONNECT_BY_PATH(T_ITEM_COST.DMY_ITEM_FLG,'*') AS EXCLUDE_DMY_ITEM_FLG
from
  T_ITEM_COST
start with
  T_ITEM_COST.YEAR = pnumYear
  and T_ITEM_COST.HALF_TERM_TYP = pnumHalfTermTyp
  and T_ITEM_COST.COST_TYP = pnumCostTyp
  and T_ITEM_COST.PLANT_CD = pvc2PlantCd
  and T_ITEM_COST.ROOT_ITEM_CD = cvc2StartItem
  and T_ITEM_COST.UPPER_ITEM_FLG = 1
connect by
  prior 	T_ITEM_COST.YEAR			  = T_ITEM_COST.YEAR
  and prior T_ITEM_COST.HALF_TERM_TYP	  = T_ITEM_COST.HALF_TERM_TYP
  and prior T_ITEM_COST.COST_TYP		  = T_ITEM_COST.COST_TYP
  and prior T_ITEM_COST.PLANT_CD		  = T_ITEM_COST.PLANT_CD
  and prior T_ITEM_COST.ROOT_ITEM_CD	  = T_ITEM_COST.ROOT_ITEM_CD
  and prior T_ITEM_COST.ITEM_CD 		  = T_ITEM_COST.PARENT_ITEM_CD
  and prior T_ITEM_COST.PS_EDITION		  = T_ITEM_COST.PS_EDITION
  and prior T_ITEM_COST.COST_STATEMENT_NO = T_ITEM_COST.PARENT_COST_STATEMENT_NO
	;
	recLOWER_EXCLUDE curLOWER_EXCLUDE%ROWTYPE;

	/* �J�[�\���̐錾  �i�ڕʉ��H��}�X�^*/
	CURSOR curPROC_COST(
		 cvc2CompItemCd VARCHAR2
	)
	IS
	SELECT T1.ITEM_CD,T1.PROC_COST_CLS_CD,T1.CS_PROC_CD,T1.CLASIFICATION_CD,T1.ONEROUS_CONS_FLG
		  ,NVL(T2.PROC_COST_UNIT_QTY,1) AS PROC_COST_UNIT_QTY
		  ,NVL(T2.STOCK_UNIT,0) 		AS STOCK_UNIT
		  ,NVL(T2.PROC_COST_01,0)  AS PROC_COST_01
		  ,NVL(T2.PROC_COST_02,0)  AS PROC_COST_02
		  ,NVL(T2.PROC_COST_03,0)  AS PROC_COST_03
		  ,NVL(T2.PROC_COST_04,0)  AS PROC_COST_04
		  ,NVL(T2.PROC_COST_05,0)  AS PROC_COST_05
		  ,NVL(T2.PROC_COST_06,0)  AS PROC_COST_06
		  ,NVL(T2.PROC_COST_07,0)  AS PROC_COST_07
		  ,NVL(T2.PROC_COST_08,0)  AS PROC_COST_08
		  ,NVL(T2.PROC_COST_09,0)  AS PROC_COST_09
		  ,NVL(T2.PROC_COST_10,0)  AS PROC_COST_10
		  ,NVL(T2.PROC_COST_11,0)  AS PROC_COST_11
		  ,NVL(T2.PROC_COST_12,0)  AS PROC_COST_12
		  ,NVL(T2.PROC_COST_SUM,0) AS PROC_COST_SUM
		  ,T2.DEL_FLG,T2.PLANT_CD
		  ,M.OUTSIDE_TYP
	FROM   M_ITEM_PROC_COST T1
		  ,M_PROC_COST		T2
		  ,M_CS_PROC		M
	WHERE	T1.PLANT_CD = pvc2PlantCd
	  AND	T1.ITEM_CD	= cvc2CompItemCd
	  AND	pnumYear			 = T2.YEAR(+)
	  AND	pnumHalfTermTyp 	 = T2.HALF_TERM_TYP(+)
	  AND	pnumCostTyp 		 = T2.COST_TYP(+)
	  AND	T1.PLANT_CD 		 = T2.PLANT_CD(+)
	  AND	T1.CS_PROC_CD		 = T2.CS_PROC_CD(+)
	  AND	T1.PROC_COST_CLS_CD  = T2.PROC_COST_CLS_CD(+)
	  AND	T1.PLANT_CD   = M.PLANT_CD
	  AND	T1.CS_PROC_CD = M.CS_PROC_CD
	  AND	0			  = M.DEL_FLG
	;
	recPROC_COST curPROC_COST%ROWTYPE;

	/* �J�[�\���̐錾 ���[�i(�����v�Z���O��)*/
	CURSOR curLOWER_ITEM
	IS
--	SELECT T.*
	SELECT
 T.YEAR
,T.HALF_TERM_TYP
,T.COST_TYP
,T.PLANT_CD
,T.ROOT_ITEM_CD
,T.PARENT_ITEM_CD
,T.ITEM_CD
,T.PS_EDITION
,T.COST_STATEMENT_NO
		FROM T_ITEM_COST T
			,(SELECT UNIQUE(PARENT_ITEM_CD) AS PARENT_ITEM_CD FROM T_ITEM_COST
			  WHERE  YEAR			 = pnumYear
				AND  HALF_TERM_TYP	 = pnumHalfTermTyp
				AND  COST_TYP		 = pnumCostTyp
				AND  PLANT_CD		 = pvc2PlantCd
				AND  COST_EXCLUDE_FLG=0) M
		WHERE  T.YEAR			 = pnumYear
		  AND  T.HALF_TERM_TYP	 = pnumHalfTermTyp
		  AND  T.COST_TYP		 = pnumCostTyp
		  AND  T.PLANT_CD		 = pvc2PlantCd
		  AND  T.COST_EXCLUDE_FLG=0
		  AND  T.LOWER_ITEM_FLG  =0
		  AND  T.ITEM_CD		 = M.PARENT_ITEM_CD(+)
		  AND  M.PARENT_ITEM_CD  IS NULL
	;
	recLOWER_ITEM curLOWER_ITEM%ROWTYPE;

	/* �J�[�\���̐錾  PARENT_STATEMENT�p*/
	CURSOR curPARENT_STATEMENT(
		 cnumUpLevelNo	  NUMBER
	)
	IS
--	 SELECT *
	SELECT
	  ROOT_ITEM_CD
	 ,ITEM_CD
	 ,COST_STATEMENT_NO
	  FROM T_ITEM_COST
	  WHERE YEAR=pnumYear
	  AND	HALF_TERM_TYP=pnumHalfTermTyp
	  AND	COST_TYP=pnumCostTyp
	  AND	PLANT_CD=pvc2PlantCd
	  AND	UP_LEVEL_NO=cnumUpLevelNo
-- �c���[�\�͌����v�Z���O���\������̂ŁA���O�i���ΏۂƂ���B
--	  AND	COST_EXCLUDE_FLG=0	--�����v�Z���O�t���O
--	  ORDER BY COST_STATEMENT_NO DESC,PARENT_ITEM_CD,ITEM_CD,ROOT_ITEM_CD
	  ;
	recPARENT_STATEMENT curPARENT_STATEMENT%ROWTYPE;

	/* �J�[�\���̐錾  PARENT_STATEMENT�p�̐e*/
	CURSOR curPARENT_STATEMENT_COMP(
		 cvc2RootItemCd    VARCHAR2
		,cvc2ParentItemCd  VARCHAR2
	)
	IS
	SELECT	ITEM_CD,PS_EDITION,MAX(COST_STATEMENT_NO) AS COST_STATEMENT_NO
	  FROM	T_ITEM_COST
	  WHERE YEAR=pnumYear
	  AND	HALF_TERM_TYP=pnumHalfTermTyp
	  AND	COST_TYP=pnumCostTyp
	  AND	PLANT_CD=pvc2PlantCd
	  AND	ROOT_ITEM_CD=cvc2RootItemCd
	  AND	PARENT_ITEM_CD=cvc2ParentItemCd
	  AND	PARENT_COST_STATEMENT_NO=0
-- �c���[�\�͌����v�Z���O���\������̂ŁA���O�i���ΏۂƂ���B
--	  AND	COST_EXCLUDE_FLG=0	--�����v�Z���O�t���O
	  GROUP BY ITEM_CD,PS_EDITION
	  ;
	recPARENT_STATEMENT_COMP curPARENT_STATEMENT_COMP%ROWTYPE;

BEGIN

	/* LogFile �� OPEN */
	blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

	/* TraceLog�̏o��(Start)�������s�� */
	blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, METHOD_START);

	/* �Ɩ��J�n���b�Z�[�W�̏o�� */
	blnRet :=	FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
						  LOGMSG_START_PGNM);
	COMMIT;

	/* �J�E���^�̏����� */
	numCntUpper 		   := 0;	 /* �Ώۃf�[�^����(�擪�i)		 */
	numCntLower 		   := 0;	 /* �Ώۃf�[�^����(���ʓW�J)	 */
	numCntUpdItemCost	   := 0;	 /* ����f�[�^����(�i�ڕʌ���)	 */
	numCntUpdItemProcCost  := 0;	 /* ����f�[�^����(�i�ڕʉ��H��) */
	numCntError 		   := 0;	 /* �����v�Z�G���[����(�����G���[)	 */

	BEGIN  /* �����Ǘ��p�����[�^�̓Ǎ� */
		SELECT	START_MONTH
		  INTO	numStartMonth
		  FROM	SYS_COST_CTRL
		  WHERE  PLANT_CD  =  pvc2PlantCd;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('(SBM0535)1:�����Ǘ��p�����[�^�����݂��܂���B'  ||
								 ' USER_CD=' || '[ ' || pvc2UserId || ' ]' ||
								 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
			RAISE  excERR_SKIP;
	END;  /* �����Ǘ��p�����[�^�̓Ǎ� */

	/*	�p�����[�^�̃`�F�b�N (�Ώ۔N�x)*/
	IF	pnumYear  IS  NULL	THEN
		vc2Comment := SUBSTR('(SBM0536)2:�p�����[�^�s���B'  ||
							 ' �Ώ۔N�x=' || '[ ' || pnumYear || ' ]',1,256);
		RAISE  excERR_SKIP;
	END IF;
	/*	�p�����[�^�̃`�F�b�N (�����敪)*/
	IF	pnumHalfTermTyp  NOT IN (1,2)  THEN
		vc2Comment := SUBSTR('(SBM0218)3:�p�����[�^�s���B'  ||
							 ' �����敪=' || '[ ' || pnumHalfTermTyp || ' ]',1,256);
		RAISE  excERR_SKIP;
	END IF;

	/*	�Ώ۔N�x/�����敪/�N�x�J�n�����A�w�蔼���̊���/���������擾 */
	vc2PhaseStartMonth :=  TO_CHAR(pnumYear + FLOOR((numStartMonth	-1+((pnumHalfTermTyp-1)*6))/12) ||
								   LPAD(MOD((numStartMonth	-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
								  );
	vc2PhaseEndMonth   :=  TO_CHAR(pnumYear + FLOOR((numStartMonth+5-1+((pnumHalfTermTyp-1)*6))/12) ||
								   LPAD(MOD((numStartMonth+5-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
								  );

/*��������������������������������������������������������������������������������������������������������
' ���C������(�擪�i)
����������������������������������������������������������������������������������������������������������*/

	/* PUT_LINE */
	blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
				  pvc2PlantCd, MY_SQL_NAME, '(SBM0816)DELETE �O�񕪍폜');
	/* PUT_LINE */

	/* �i�ڕʉ��H��̍폜 */
	DELETE	FROM T_ITEM_PROC_COST
		WHERE  YEAR 		 = pnumYear
		  AND  HALF_TERM_TYP = pnumHalfTermTyp
		  AND  COST_TYP 	 = pnumCostTyp
		  AND  PLANT_CD 	 = pvc2PlantCd
	;
	/* �i�ڕʌ����̍폜 */
	DELETE	FROM T_ITEM_COST
		WHERE  YEAR 		 = pnumYear
		  AND  HALF_TERM_TYP = pnumHalfTermTyp
		  AND  COST_TYP 	 = pnumCostTyp
		  AND  PLANT_CD 	 = pvc2PlantCd
		;

	/* PUT_LINE */
	blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
				  pvc2PlantCd, MY_SQL_NAME, 'MAIN LOOP START');
	/* PUT_LINE */
	COMMIT;

	BEGIN  /* �J�[�\��OPEN(�擪�i) */
		OPEN  curUPPER;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('4:OPEN curUPPER'	||
								 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE  excERR_CURSOR;
	END;  /* �J�[�\��OPEN(�擪�i) */

	LOOP  /*  �擪�i�̌J��Ԃ� */

		BEGIN  /* �J�[�\��FETCH(�擪�i) */
			FETCH  curUPPER  INTO  recUPPER;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('5:FETCH curUPPER'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* �J�[�\��FETCH(�擪�i) */

		EXIT WHEN  curUPPER%NOTFOUND;

		/* PUT_LINE */
		numCntTest := numCntTest + 1;
		IF numCntTest >= 10 THEN
			numCntTest := 0;
			blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, 'MAIN LOOP COMP_ITEM_CD='||recUPPER.COMP_ITEM_CD);
		END IF;
		/* PUT_LINE */

		blnLowerSkip := FALSE;			   /* ���ʓW�J���� */
		numCntUpper  := numCntUpper+1;	   /* �Ώۃf�[�^����(�擪�i) */
		numCostStatemntNo  :=  1;		   /* �v�Z�o�͏� */

		/* �i�ړ����w���̎Z�o */
		IF	recUPPER.DMY_ITEM_FLG = 0  THEN
			numItemInputRatio := 1 + (recUPPER.ITEM_SPOIL/100);
		ELSE
			numItemInputRatio := 1;
		END IF;

/*��������������������������������������������������������������������������������������������������������
' ���C������(�擪�i)�@����̏���
����������������������������������������������������������������������������������������������������������*/

		IF	recUPPER.OUTSIDE_TYP  =  1	THEN  /* ����̏��� */

			/* �i�ڕʉ��H��}�X�^�̑��ݗL������ */
			SELECT	COUNT(*)  INTO	numCntDummy  FROM M_ITEM_PROC_COST
			  WHERE  PLANT_CD  = pvc2PlantCd
				AND  ITEM_CD   = recUPPER.COMP_ITEM_CD
				AND  ROWNUM    = 1
			;

/*��������������������������������������������������������������������������������������������������������
' ���C������(�擪�i)�@����̏����@�i�ڕʉ��H��}�X�^������ꍇ
����������������������������������������������������������������������������������������������������������*/

			IF	numCntDummy  >	0  THEN  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

				BEGIN  /* �J�[�\��OPEN(�i�ڕʉ��H��}�X�^) */
					OPEN  curPROC_COST(recUPPER.COMP_ITEM_CD);
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('6:OPEN curPROC_COST'	||
											 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
						RAISE  excERR_CURSOR;
				END;  /* �J�[�\��OPEN(�i�ڕʉ��H��}�X�^) */

				numCntItemProcCost	:= 0;  /* �i�ڕʉ��H��}�X�^�̌��� */
				numOwnProcCostSumSum  := 0;  /* ���H�����H��(��T_ITEM_PROC_COST) */

/*��������������������������������������������������������������������������������������������������������
' ���C������(�擪�i)�@����̏����@�i�ڕʉ��H��}�X�^������ꍇ�@�i�ڕʉ��H��̏���
����������������������������������������������������������������������������������������������������������*/

				LOOP  /* �i�ڕʉ��H��}�X�^�̌J��Ԃ� */

					BEGIN  /* �J�[�\��FETCH(�i�ڕʉ��H��}�X�^) */
						FETCH  curPROC_COST  INTO  recPROC_COST;
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment	:= SUBSTR('7:FETCH curPROC_COST'  ||
												  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;  /* �J�[�\��FETCH(�i�ڕʉ��H��}�X�^) */

					EXIT WHEN  curPROC_COST%NOTFOUND;

					/* ���H��}�X�^�����݂��Ă��A���Ȃ��Ă������p������ */
--					IF	recPROC_COST.PLANT_CD IS NOT NULL  THEN  /* ���H��}�X�^�����݂��鎞�i�H������j*/

						numCntItemProcCost	:= numCntItemProcCost + 1;	/* �i�ڕʉ��H��}�X�^�̌��� */

						/* ���H�����H��Z�o */
						numOwnProcCost01 := CEIL(recPROC_COST.PROC_COST_01 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost02 := CEIL(recPROC_COST.PROC_COST_02 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost03 := CEIL(recPROC_COST.PROC_COST_03 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost04 := CEIL(recPROC_COST.PROC_COST_04 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost05 := CEIL(recPROC_COST.PROC_COST_05 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost06 := CEIL(recPROC_COST.PROC_COST_06 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost07 := CEIL(recPROC_COST.PROC_COST_07 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost08 := CEIL(recPROC_COST.PROC_COST_08 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost09 := CEIL(recPROC_COST.PROC_COST_09 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost10 := CEIL(recPROC_COST.PROC_COST_10 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost11 := CEIL(recPROC_COST.PROC_COST_11 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCost12 := CEIL(recPROC_COST.PROC_COST_12 * recUPPER.NECESSARY_QTY
											   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
						numOwnProcCostSum := numOwnProcCost01 + numOwnProcCost02 + numOwnProcCost03
										   + numOwnProcCost04 + numOwnProcCost05 + numOwnProcCost06
										   + numOwnProcCost07 + numOwnProcCost08 + numOwnProcCost09
										   + numOwnProcCost10 + numOwnProcCost11 + numOwnProcCost12;

						numOwnProcCostSumSum := numOwnProcCostSumSum + numOwnProcCostSum;  /* ���H�����H��(��T_ITEM_PROC_COST) */

						BEGIN  /* �i�ڕʉ��H��E�������� */
							INSERT	INTO  T_ITEM_PROC_COST(
								 YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ROOT_ITEM_CD
								,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,COST_STATEMENT_NO
								,CS_PROC_CD,PROC_COST_CLS_CD,PARENT_COST_STATEMENT_NO
								,OWN_PROC_COST_01,OWN_PROC_COST_02,OWN_PROC_COST_03,OWN_PROC_COST_04
								,OWN_PROC_COST_05,OWN_PROC_COST_06,OWN_PROC_COST_07,OWN_PROC_COST_08
								,OWN_PROC_COST_09,OWN_PROC_COST_10,OWN_PROC_COST_11,OWN_PROC_COST_12
								,OWN_PROC_COST_SUM
								,UNDER_PROC_COST_01,UNDER_PROC_COST_02,UNDER_PROC_COST_03,UNDER_PROC_COST_04
								,UNDER_PROC_COST_05,UNDER_PROC_COST_06,UNDER_PROC_COST_07,UNDER_PROC_COST_08
								,UNDER_PROC_COST_09,UNDER_PROC_COST_10,UNDER_PROC_COST_11,UNDER_PROC_COST_12
								,UNDER_PROC_COST_SUM
								,TOTAL_PROC_COST_01,TOTAL_PROC_COST_02,TOTAL_PROC_COST_03,TOTAL_PROC_COST_04
								,TOTAL_PROC_COST_05,TOTAL_PROC_COST_06,TOTAL_PROC_COST_07,TOTAL_PROC_COST_08
								,TOTAL_PROC_COST_09,TOTAL_PROC_COST_10,TOTAL_PROC_COST_11,TOTAL_PROC_COST_12
								,TOTAL_PROC_COST_SUM
								,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
								,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
								,MODIFY_COUNT
							)  VALUES (
								pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
							   ,recUPPER.COMP_ITEM_CD
							   ,recUPPER.PARENT_ITEM_CD
							   ,recUPPER.COMP_ITEM_CD
							   ,recUPPER.PS_EDITION,numCostStatemntNo
							   ,recPROC_COST.CS_PROC_CD
							   ,recPROC_COST.PROC_COST_CLS_CD,0
							   ,numOwnProcCost01,numOwnProcCost02,numOwnProcCost03
							   ,numOwnProcCost04,numOwnProcCost05,numOwnProcCost06
							   ,numOwnProcCost07,numOwnProcCost08,numOwnProcCost09
							   ,numOwnProcCost10,numOwnProcCost11,numOwnProcCost12
							   ,numOwnProcCostSum
							   ,0,0,0,0,0,0,0,0,0,0,0,0,0
							   ,0,0,0,0,0,0,0,0,0,0,0,0,0
							   ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
							   ,0
							);

							numCntUpdItemProcCost := numCntUpdItemProcCost+1; --����f�[�^����(�i�ڕʉ��H��)

						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment := SUBSTR('8:INSERT T_ITEM_PROC_COST'  ||
													 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
													 ' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
													 ' ITEM_CD='		|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
													 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* �i�ڕʉ��H��E�������� */

--					END IF;  /* ���H��}�X�^�����݂��鎞�i�H������j*/

				END LOOP;  /* �i�ڕʉ��H��}�X�^�̌J��Ԃ� */

/*��������������������������������������������������������������������������������������������������������
' ���C������(�擪�i)�@����̏����@�i�ڕʉ��H��}�X�^������ꍇ�@�i�ڕʌ����̏���
����������������������������������������������������������������������������������������������������������*/

				IF	numCntItemProcCost > 0 THEN  /* �i�ڕʉ��H����P���ł��������񂾎��́A�i�ڕʌ������X�V����B*/

					BEGIN
						INSERT	INTO  T_ITEM_COST(
									YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD
								   ,ITEM_CD,PS_EDITION,CS_PROC_CD,COST_STATEMENT_NO,NECESSARY_QTY,PS_INPUT_RATIO
								   ,ITEM_INPUT_RATIO,OWN_MATR_COST,UNDER_MATR_COST,TOTAL_MATR_COST
								   ,OWN_SBCNT_MATR_COST,UNDER_SBCNT_MATR_COST,TOTAL_SBCNT_MATR_COST
								   ,OWN_PROC_COST_SUM_ALL,UNDER_PROC_COST_SUM_ALL,TOTAL_PROC_COST_SUM_ALL
								   ,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_UNIT_DENOMINATOR
								   ,PS_UNIT_NUMERATOR,PARENT_ITEM_STOCK_UNIT,STOCK_UNIT
								   ,CLASIFICATION_CD,OUTSIDE_TYP,DMY_ITEM_FLG,VOLUNT_SPL_FLG
								   ,COST_UP_TYP,ONEROUS_CONS_FLG,UP_LEVEL_NO,UPPER_ITEM_FLG,LOWER_ITEM_FLG
								   ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
								   ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
								   ,MODIFY_COUNT
								   ,PROC_OUTSIDE_TYP,PARENT_COST_STATEMENT_NO
						)  VALUES (
									pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
								   ,recUPPER.COMP_ITEM_CD,recUPPER.PARENT_ITEM_CD,recUPPER.COMP_ITEM_CD,recUPPER.PS_EDITION
								   ,recPROC_COST.CS_PROC_CD
								   ,numCostStatemntNo
								   ,recUPPER.NECESSARY_QTY
								   ,1+(recUPPER.PS_SPOIL/100)
								   ,numItemInputRatio
								   ,0,0,0
								   ,0,0,0
								   ,numOwnProcCostSumSum,0,0
								   ,recUPPER.EFF_PHASE_IN_DATE,recUPPER.EFF_PHASE_OUT_DATE
								   ,recUPPER.PS_UNIT_DENOMINATOR,recUPPER.PS_UNIT_NUMERATOR
								   ,recUPPER.PARENT_ITEM_STOCK_UNIT,recUPPER.STOCK_UNIT
								   ,recPROC_COST.CLASIFICATION_CD
								   ,recUPPER.OUTSIDE_TYP
								   ,recUPPER.DMY_ITEM_FLG
								   ,recUPPER.VOLUNT_SPL_FLG
								   ,recUPPER.COST_UP_TYP
								   ,recPROC_COST.ONEROUS_CONS_FLG
								   ,recUPPER.UP_LEVEL_NO
								   ,recUPPER.UPPER_ITEM_FLG,recUPPER.LOWER_ITEM_FLG
								   ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
								   ,0
								   ,recPROC_COST.OUTSIDE_TYP,0
						);
						numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('9:INSERT T_ITEM_COST'  ||
												 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
												 ' ITEM_CD='		|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;

				END IF;  /* �i�ڕʉ��H����P���ł��������񂾎��́A�i�ڕʌ������X�V����B*/

/*��������������������������������������������������������������������������������������������������������
' ���C������(�擪�i)�@����̏����@�i�ڕʉ��H��}�X�^������ꍇ
����������������������������������������������������������������������������������������������������������*/

				IF	recPROC_COST.OUTSIDE_TYP = 2 THEN  /* �H���O���̎��́A�i�ڕʌ������X�V����B*/

					BEGIN  /* �w���i�}�X�^�ǂݍ��� */
						SELECT	UNIT_COST  ,DECODE(PUCH_UNIT_QTY,0,1,PUCH_UNIT_QTY)  ,EXCH_RATE  ,CS_PUCH_TYP,
                                UNIT_COST_ACCEPT_TYP,SUB_UNIT_COST,DECODE(SUB_PUCH_UNIT_QTY,0,1,SUB_PUCH_UNIT_QTY),
                                SUB_EXCH_RATE,CLASIFICATION_CD,ONEROUS_CONS_FLG,CS_PROC_CD
						INTO	numUnitCost,numUnitQty,numExchRate,numCsPuchTyp,
                                numUnitCostAcceptTyp,numSubUnitCost,numSubUnitQty,
                                numSubExchRate,vc2ClasificationCd,numOnerousConsFlg,numCsProcCd
						FROM  M_CS_PUCH
						WHERE YEAR			=  pnumYear
						AND   HALF_TERM_TYP =  pnumHalfTermTyp
						AND   COST_TYP		=  pnumCostTyp
						AND   PLANT_CD		=  pvc2PlantCd
						AND   ITEM_CD		=  recUPPER.COMP_ITEM_CD
						AND   DEL_FLG		=  0
						;
						blnFoundCsPuch	:=	TRUE;
					EXCEPTION
						WHEN OTHERS THEN
							blnFoundCsPuch	:=	FALSE;
					END;  /* �w���i�}�X�^�ǂݍ��� */

					IF	blnFoundCsPuch	=  TRUE  THEN  /* �w���i�}�X�^�����݂����ꍇ */

                        --�P�i�ޗ���̎Z�o
        				IF	numUnitCostAcceptTyp = 1 THEN  --�ʏ�P��
        					numOwnMatrCost := CEIL((numUnitCost    * recUPPER.NECESSARY_QTY  * numItemInputRatio
        										   / numUnitQty)   * numExchRate	* 10000) / 10000;
        				ELSE   --���P��
        					numOwnMatrCost := CEIL((numSubUnitCost * recUPPER.NECESSARY_QTY  * numItemInputRatio
        										  / numSubUnitQty) * numSubExchRate * 10000) / 10000;
        				END IF;

						IF numCsPuchTyp = 1 THEN   /*�w���P����ʔ���*/

							/*�w���P����ʂ��w���P���̎��͒P�i�ޗ�����X�V����B*/
							BEGIN
								UPDATE	T_ITEM_COST  SET
									 	OWN_MATR_COST	= OWN_MATR_COST + numOwnMatrCost
										,UNDER_SBCNT_MATR_COST = 0
										,TOTAL_SBCNT_MATR_COST = 0
										,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
										,MODIFY_COUNT= MODIFY_COUNT+1
								WHERE  YEAR 		  = pnumYear
							  	AND  HALF_TERM_TYP	= pnumHalfTermTyp
							  	AND  COST_TYP		= pnumCostTyp
							  	AND  PLANT_CD		= pvc2PlantCd
							  	AND  ROOT_ITEM_CD	= recUPPER.COMP_ITEM_CD
							  	AND  PARENT_ITEM_CD = recUPPER.PARENT_ITEM_CD
							  	AND  ITEM_CD		= recUPPER.COMP_ITEM_CD
							  	AND  PS_EDITION 	= recUPPER.PS_EDITION
							  	AND  COST_STATEMENT_NO = numCostStatemntNo
							  	AND  CS_PROC_CD = numCsProcCd
								;
								numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
							EXCEPTION
								WHEN OTHERS THEN
									vc2Comment := SUBSTR('10:UPDATE T_ITEM_COST'  ||
													 	' ROOT_ITEM_CD='   || '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
													 	' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
													 	' ITEM_CD=' 	   || '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
													 	' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 	' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
									RAISE  excERR_CURSOR;
							END;
						ELSE

							/*�w���P����ʂ��O���P���̎��͒P�i�ޗ���i�O���j���X�V����B*/
							BEGIN
								UPDATE	T_ITEM_COST  SET
									 	OWN_SBCNT_MATR_COST   = OWN_SBCNT_MATR_COST + numOwnMatrCost
										,UNDER_SBCNT_MATR_COST = 0
										,TOTAL_SBCNT_MATR_COST = 0
										,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
										,MODIFY_COUNT= MODIFY_COUNT+1
								WHERE  YEAR 		  = pnumYear
							  	AND  HALF_TERM_TYP	= pnumHalfTermTyp
							  	AND  COST_TYP		= pnumCostTyp
							  	AND  PLANT_CD		= pvc2PlantCd
							  	AND  ROOT_ITEM_CD	= recUPPER.COMP_ITEM_CD
							  	AND  PARENT_ITEM_CD = recUPPER.PARENT_ITEM_CD
							  	AND  ITEM_CD		= recUPPER.COMP_ITEM_CD
							  	AND  PS_EDITION 	= recUPPER.PS_EDITION
							  	AND  COST_STATEMENT_NO = numCostStatemntNo
							  	AND  CS_PROC_CD = numCsProcCd
								;
								numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
							EXCEPTION
								WHEN OTHERS THEN
									vc2Comment := SUBSTR('10:UPDATE T_ITEM_COST'  ||
													 	' ROOT_ITEM_CD='   || '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
													 	' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
													 	' ITEM_CD=' 	   || '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
													 	' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 	' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
									RAISE  excERR_CURSOR;
							END;
						END IF;   /*�w���P����ʔ���*/

					ELSE  /* �w���i�}�X�^�����݂��Ȃ��ꍇ */

						IF	recPROC_COST.OUTSIDE_TYP = 2 THEN /* �H���O���̏ꍇ */

							/* �����v�Z���O�ꍇ�̏ꍇ�̓G���[�Ƃ��Ȃ� */
							IF	recUPPER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
								recUPPER.COST_UP_TYP	  = 0  OR  /* �����Ϗ�敪 */
								recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
								vc2PhaseStartMonth > TO_CHAR(recUPPER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
								vc2PhaseEndMonth   < TO_CHAR(recUPPER.EFF_PHASE_IN_DATE,'YYYYMM') THEN	/* [�������O�t���O]�X�V���� */

								NULL;

							ELSE  /* [�������O�t���O]�X�V���� */

								/* �����v�Z�G���[�ԍ��̎擾 */
								blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
								IF	blnRet	=  FALSE  THEN
									vc2Comment := SUBSTR('11:FNCGETSEQCSCALCERRORCD'  ||
														 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
									RAISE  excERR_CURSOR;
								END IF;

								BEGIN  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */
									INSERT	INTO  T_CS_CALC_ERROR (
											  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
											 ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
											 ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
											 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
											 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
											 ,MODIFY_COUNT
									)  VALUES (
											  vc2CsCalcErrorCd
											 ,3,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
											 ,recUPPER.COMP_ITEM_CD
											 ,recUPPER.PARENT_ITEM_CD
											 ,recUPPER.COMP_ITEM_CD
											 ,recUPPER.PS_EDITION
											 ,recPROC_COST.CS_PROC_CD,NULL
											 ,'DC00207','�w���i�}�X�^�Ȃ�',0
											 ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
											 ,0
									);
									numCntError := numCntError + 1;  --�����v�Z�G���[����

								EXCEPTION
									WHEN OTHERS THEN
										vc2Comment := SUBSTR('12:INSERT T_CS_CALC_ERROR'  ||
															 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
															 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
										RAISE  excERR_CURSOR;
								END;  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */

							END IF;  /* [�������O�t���O]�X�V���� */
						END IF /* �H���O���̏ꍇ */
						;

					END IF;  /* �w���i�}�X�^�����݂����ꍇ */


				END IF;  /* �H���O���̎��́A�i�ڕʌ������X�V����B*/

				CLOSE curPROC_COST;

/*��������������������������������������������������������������������������������������������������������
' ���C������(�擪�i)�@����̏����@�i�ڕʉ��H��}�X�^���Ȃ��ꍇ
����������������������������������������������������������������������������������������������������������*/

			ELSE  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

				blnLowerSkip := TRUE;			  /* ���ʓW�J���Ȃ� */

				BEGIN  /* ����ŕi�ڕʉ��H��}�X�^�Ȃ� */

					/* DC00206�G���[����[�ŏ�ʕi��]�P�ʂŌ����v�Z���O	*/
					UPDATE	T_ITEM_COST SET
						 COST_EXCLUDE_FLG = 1,MODIFY_COUNT=MODIFY_COUNT+1
					WHERE  YEAR 		  = pnumYear
					  AND  HALF_TERM_TYP  = pnumHalfTermTyp
					  AND  COST_TYP 	  = pnumCostTyp
					  AND  PLANT_CD 	  = pvc2PlantCd
					  AND  ROOT_ITEM_CD   = recUPPER.COMP_ITEM_CD
					  AND  PARENT_ITEM_CD = '*'
					  AND  ITEM_CD		  = recUPPER.COMP_ITEM_CD
					;
				EXCEPTION
				   WHEN OTHERS THEN
						vc2Comment := SUBSTR('14:UPDATE  T_ITEM_COST'  ||
											 ' ROOT_ITEM_CD=' || '[ ' || recUPPER.COMP_ITEM_CD || ' ]' ||
											 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
						RAISE  excERR_CURSOR;
				END;  /* ����ŕi�ڕʉ��H��}�X�^�Ȃ� */

			END IF; /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

			numCostStatemntNo  :=  numCostStatemntNo + 1;	  /* �v�Z�o�͏� */

/*��������������������������������������������������������������������������������������������������������
' ���C������(�擪�i)�@�O��̏���
����������������������������������������������������������������������������������������������������������*/

		ELSE  /* ����̏��� */

			BEGIN  /* �w���i�}�X�^�ǂݍ��� */
				SELECT
					UNIT_COST_ACCEPT_TYP,UNIT_COST,DECODE(PUCH_UNIT_QTY,0,1,PUCH_UNIT_QTY),EXCH_RATE
				   ,SUB_UNIT_COST,DECODE(SUB_PUCH_UNIT_QTY,0,1,SUB_PUCH_UNIT_QTY),SUB_EXCH_RATE
				   ,CLASIFICATION_CD,ONEROUS_CONS_FLG,CS_PUCH_TYP
				INTO
					numUnitCostAcceptTyp,numUnitCost,numUnitQty,numExchRate
				   ,numSubUnitCost,numSubUnitQty,numSubExchRate
				   ,vc2ClasificationCd,numOnerousConsFlg,numCsPuchTyp
				FROM
				   M_CS_PUCH
				WHERE
					  YEAR			=  pnumYear
				AND   HALF_TERM_TYP =  pnumHalfTermTyp
				AND   COST_TYP		=  pnumCostTyp
				AND   PLANT_CD		=  pvc2PlantCd
				AND   ITEM_CD		=  recUPPER.COMP_ITEM_CD
				AND   DEL_FLG		=  0
				;
				blnFoundCsPuch	:=	TRUE;
			EXCEPTION
				WHEN OTHERS THEN
					blnFoundCsPuch	:=	FALSE;
			END;  /* �w���i�}�X�^�ǂݍ��� */

			IF	blnFoundCsPuch	=  TRUE  THEN  /* �w���i�}�X�^�����݂����ꍇ */
				--�P�i�ޗ���̎Z�o
				IF	numUnitCostAcceptTyp = 1 THEN  --�ʏ�P��
					numOwnMatrCost := CEIL((numUnitCost    * recUPPER.NECESSARY_QTY  * numItemInputRatio
										   / numUnitQty)   * numExchRate	* 10000) / 10000;
				ELSE   --���P��
					numOwnMatrCost := CEIL((numSubUnitCost * recUPPER.NECESSARY_QTY  * numItemInputRatio
										  / numSubUnitQty) * numSubExchRate * 10000) / 10000;
				END IF;

				IF numCsPuchTyp = 1 THEN   /*�w���P����ʔ���*/

					/*�w���P����ʂ��w���P���̎��͒P�i�ޗ�����������ށB*/
					BEGIN  /* �i�ڕʌ����E�������� */
						INSERT	INTO  T_ITEM_COST(
								YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD
						   		,ITEM_CD,PS_EDITION,CS_PROC_CD,COST_STATEMENT_NO,NECESSARY_QTY,PS_INPUT_RATIO
						   		,ITEM_INPUT_RATIO,OWN_MATR_COST,UNDER_MATR_COST,TOTAL_MATR_COST
						   		,OWN_SBCNT_MATR_COST,UNDER_SBCNT_MATR_COST,TOTAL_SBCNT_MATR_COST
						   		,OWN_PROC_COST_SUM_ALL,UNDER_PROC_COST_SUM_ALL,TOTAL_PROC_COST_SUM_ALL
						   		,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_UNIT_DENOMINATOR
						   		,PS_UNIT_NUMERATOR,PARENT_ITEM_STOCK_UNIT,STOCK_UNIT
						   		,CLASIFICATION_CD,OUTSIDE_TYP,DMY_ITEM_FLG,VOLUNT_SPL_FLG
						   		,COST_UP_TYP,ONEROUS_CONS_FLG,UP_LEVEL_NO,UPPER_ITEM_FLG,LOWER_ITEM_FLG
						   		,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
						   		,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
						   		,MODIFY_COUNT
						   		,PROC_OUTSIDE_TYP,PARENT_COST_STATEMENT_NO
						)  VALUES (
								pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
							   ,recUPPER.COMP_ITEM_CD
							   ,recUPPER.PARENT_ITEM_CD
							   ,recUPPER.COMP_ITEM_CD
							   ,recUPPER.PS_EDITION
							   ,OUTSIDE_PROC_CD
							   ,numCostStatemntNo
							   ,recUPPER.NECESSARY_QTY
							   ,1+(recUPPER.PS_SPOIL/100)
							   ,numItemInputRatio
							   ,numOwnMatrCost,0,0
							   ,0,0,0
							   ,0,0,0
							   ,recUPPER.EFF_PHASE_IN_DATE,recUPPER.EFF_PHASE_OUT_DATE
							   ,recUPPER.PS_UNIT_DENOMINATOR,recUPPER.PS_UNIT_NUMERATOR
							   ,recUPPER.PARENT_ITEM_STOCK_UNIT,recUPPER.STOCK_UNIT
							   ,vc2ClasificationCd
							   ,2
							   ,recUPPER.DMY_ITEM_FLG
							   ,recUPPER.VOLUNT_SPL_FLG
							   ,recUPPER.COST_UP_TYP
							   ,numOnerousConsFlg
							   ,recUPPER.UP_LEVEL_NO
							   ,recUPPER.UPPER_ITEM_FLG,recUPPER.LOWER_ITEM_FLG
							   ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
							   ,0
							   ,2,0
						);
						numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('15:INSERT T_ITEM_COST'  ||
												 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
												 ' ITEM_CD='		|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;  /* �i�ڕʌ����E�������� */
				ELSE
					/*�w���P����ʂ��O���P���̎��͒P�i�ޗ���i�O���j���������ށB*/
					BEGIN  /* �i�ڕʌ����E�������� */
						INSERT	INTO  T_ITEM_COST(
								YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD
						   		,ITEM_CD,PS_EDITION,CS_PROC_CD,COST_STATEMENT_NO,NECESSARY_QTY,PS_INPUT_RATIO
						   		,ITEM_INPUT_RATIO,OWN_MATR_COST,UNDER_MATR_COST,TOTAL_MATR_COST
						   		,OWN_SBCNT_MATR_COST,UNDER_SBCNT_MATR_COST,TOTAL_SBCNT_MATR_COST
						   		,OWN_PROC_COST_SUM_ALL,UNDER_PROC_COST_SUM_ALL,TOTAL_PROC_COST_SUM_ALL
						   		,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_UNIT_DENOMINATOR
						   		,PS_UNIT_NUMERATOR,PARENT_ITEM_STOCK_UNIT,STOCK_UNIT
						   		,CLASIFICATION_CD,OUTSIDE_TYP,DMY_ITEM_FLG,VOLUNT_SPL_FLG
						   		,COST_UP_TYP,ONEROUS_CONS_FLG,UP_LEVEL_NO,UPPER_ITEM_FLG,LOWER_ITEM_FLG
						   		,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
						   		,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
						   		,MODIFY_COUNT
						   		,PROC_OUTSIDE_TYP,PARENT_COST_STATEMENT_NO
						)  VALUES (
								pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
							   ,recUPPER.COMP_ITEM_CD
							   ,recUPPER.PARENT_ITEM_CD
							   ,recUPPER.COMP_ITEM_CD
							   ,recUPPER.PS_EDITION
							   ,OUTSIDE_PROC_CD
							   ,numCostStatemntNo
							   ,recUPPER.NECESSARY_QTY
							   ,1+(recUPPER.PS_SPOIL/100)
							   ,numItemInputRatio
							   ,0,0,0
							   ,numOwnMatrCost,0,0
							   ,0,0,0
							   ,recUPPER.EFF_PHASE_IN_DATE,recUPPER.EFF_PHASE_OUT_DATE
							   ,recUPPER.PS_UNIT_DENOMINATOR,recUPPER.PS_UNIT_NUMERATOR
							   ,recUPPER.PARENT_ITEM_STOCK_UNIT,recUPPER.STOCK_UNIT
							   ,vc2ClasificationCd
							   ,2
							   ,recUPPER.DMY_ITEM_FLG
							   ,recUPPER.VOLUNT_SPL_FLG
							   ,recUPPER.COST_UP_TYP
							   ,numOnerousConsFlg
							   ,recUPPER.UP_LEVEL_NO
							   ,recUPPER.UPPER_ITEM_FLG,recUPPER.LOWER_ITEM_FLG
							   ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
							   ,0
							   ,2,0
						);
						numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('15:INSERT T_ITEM_COST'  ||
												 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
												 ' ITEM_CD='		|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;  /* �i�ڕʌ����E�������� */
				END IF;   /*�w���P����ʔ���*/

			ELSE  /* �w���i�}�X�^�����݂����ꍇ */

				blnLowerSkip := TRUE;			  /* ���ʓW�J���Ȃ� */
				/* �����v�Z�G���[�ԍ��̎擾 */
				blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
				IF	blnRet	=  FALSE  THEN
					vc2Comment := SUBSTR('30:FNCGETSEQCSCALCERRORCD'  ||
										 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
					RAISE  excERR_CURSOR;
				END IF;

				BEGIN  /* �����v�Z�G���[��������(�O��ōw���i�}�X�^�Ȃ�)  */
					INSERT	INTO  T_CS_CALC_ERROR
						 (CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP
						 ,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
						 ,PS_EDITION,CS_PROC_CD,PROC_COST_CLS_CD
						 ,MESSAGE_CD,REMARKS,LIST_ISS_FLG
						 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
						 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
						 ,MODIFY_COUNT
					)  VALUES (
						  vc2CsCalcErrorCd
						 ,3,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
						 ,recUPPER.COMP_ITEM_CD
						 ,'*'
						 ,recUPPER.COMP_ITEM_CD
						 ,recUPPER.PS_EDITION
						 ,OUTSIDE_PROC_CD,NULL
						 ,'DC00208','�O��ōw���i�}�X�^�Ȃ�',0
						 ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
						 ,0
					);
					numCntError := numCntError + 1;  --�����v�Z�G���[����
					/* DC00208�G���[����[�ŏ�ʕi��]�P�ʂŌ����v�Z���O	*/
					UPDATE	T_ITEM_COST SET
						 COST_EXCLUDE_FLG = 1,MODIFY_COUNT=MODIFY_COUNT+1
					WHERE  YEAR 		  = pnumYear
					  AND  HALF_TERM_TYP  = pnumHalfTermTyp
					  AND  COST_TYP 	  = pnumCostTyp
					  AND  PLANT_CD 	  = pvc2PlantCd
					  AND  ROOT_ITEM_CD   = recUPPER.COMP_ITEM_CD
					  AND  PARENT_ITEM_CD = '*'
					  AND  ITEM_CD		  = recUPPER.COMP_ITEM_CD
					;
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('17:UPDATE  T_ITEM_COST'  ||
											 ' ROOT_ITEM_CD=' || '[ ' || recUPPER.COMP_ITEM_CD || ' ]' ||
											 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
						RAISE  excERR_CURSOR;
				END;  /* �O��ōw���i�}�X�^�Ȃ� */

			END IF;  /* �w���i�}�X�^�����݂����ꍇ */

			numCostStatemntNo  :=  numCostStatemntNo + 1;	  /* �v�Z�o�͏� */

		END IF;  /* ����̏��� */

/*��������������������������������������������������������������������������������������������������������
�@�@�@�@' ���C������(�擪�i�ˉ��ʓW�J)
�@�@�@�@' �擪�i�����Œv���I�G���[���Ȃ�(blnLowerSkip=FALSE)�ꍇ�̂݉��ʓW�J����B
����������������������������������������������������������������������������������������������������������*/

		IF	blnLowerSkip = FALSE  THEN	/* �擪�i�Œv���I�G���[���� */

		BEGIN  /* �J�[�\��OPEN(���ʓW�J) */
			OPEN  curLOWER(recUPPER.COMP_ITEM_CD);
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('18:OPEN curUPPER'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* �J�[�\��OPEN(���ʓW�J) */

		LOOP  /* ���ʓW�J�̌J��Ԃ� */
			BEGIN  /* �J�[�\��FETCH(���ʓW�J) */
				FETCH  curLOWER  INTO  recLOWER;
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('19:FETCH curLOWER'  ||
										 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
										 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE  excERR_CURSOR;
			END;  /* �J�[�\��FETCH(���ʓW�J) */

			EXIT WHEN  curLOWER%NOTFOUND;

			numCntLower  :=  numCntLower+1; /* �Ώۃf�[�^����(���ʓW�J) */

			/* �i�ړ����w���̎Z�o */
			IF	recLOWER.DMY_ITEM_FLG = 0  THEN
				numItemInputRatio := 1 + (recLOWER.ITEM_SPOIL/100);
			ELSE
				numItemInputRatio := 1;
			END IF;

/*��������������������������������������������������������������������������������������������������������
�@�@�@�@' ���C������(�擪�i�ˉ��ʓW�J)�@����
����������������������������������������������������������������������������������������������������������*/

			IF	recLOWER.OUTSIDE_TYP  =  1	THEN  /* ����̏��� */

				/* �i�ڕʉ��H��}�X�^�̑��ݗL������ */
				SELECT	COUNT(*)  INTO	numCntDummy  FROM M_ITEM_PROC_COST
				  WHERE  PLANT_CD  = pvc2PlantCd
					AND  ITEM_CD   = recLOWER.COMP_ITEM_CD
					AND  ROWNUM    = 1
				;

/*��������������������������������������������������������������������������������������������������������
�@�@�@�@' ���C������(�擪�i�ˉ��ʓW�J)�@����@�i�ڕʉ��H��}�X�^������ꍇ
����������������������������������������������������������������������������������������������������������*/

				IF	numCntDummy  >	0  THEN  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

					BEGIN  /* �J�[�\��OPEN(�i�ڕʉ��H��}�X�^) */
						OPEN  curPROC_COST(recLOWER.COMP_ITEM_CD);
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('20:OPEN curPROC_COST'  ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;  /* �J�[�\��OPEN(�i�ڕʉ��H��}�X�^) */

					numCntItemProcCost	:= 0;  /* �i�ڕʉ��H��}�X�^�̌��� */
					numOwnProcCostSumSum  := 0;  /* ���H�����H��(��T_ITEM_PROC_COST) */

/*��������������������������������������������������������������������������������������������������������
�@�@�@�@' ���C������(�擪�i�ˉ��ʓW�J)�@����@�i�ڕʉ��H��}�X�^������ꍇ�@�i�ڕʉ��H��̏���
����������������������������������������������������������������������������������������������������������*/

					LOOP  /* �i�ڕʉ��H��}�X�^�̌J��Ԃ� */
						BEGIN  /* �J�[�\��FETCH(�i�ڕʉ��H��}�X�^) */
							FETCH  curPROC_COST  INTO  recPROC_COST;
						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment := SUBSTR('21:FETCH curPROC_COST'  ||
													 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* �J�[�\��FETCH(�i�ڕʉ��H��}�X�^) */

						EXIT WHEN  curPROC_COST%NOTFOUND;

						/* ���H��}�X�^�����݂��Ă��A���Ȃ��Ă������p������ */
--						IF	recPROC_COST.PLANT_CD IS NOT NULL  THEN  /* ���H��}�X�^�����݂��鎞�i�H������j*/

							numCntItemProcCost	:= numCntItemProcCost + 1;	/* �i�ڕʉ��H��}�X�^�̌��� */

							/* ���H�����H��Z�o */
							numOwnProcCost01 := CEIL(recPROC_COST.PROC_COST_01 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost02 := CEIL(recPROC_COST.PROC_COST_02 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost03 := CEIL(recPROC_COST.PROC_COST_03 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost04 := CEIL(recPROC_COST.PROC_COST_04 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost05 := CEIL(recPROC_COST.PROC_COST_05 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost06 := CEIL(recPROC_COST.PROC_COST_06 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost07 := CEIL(recPROC_COST.PROC_COST_07 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost08 := CEIL(recPROC_COST.PROC_COST_08 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost09 := CEIL(recPROC_COST.PROC_COST_09 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost10 := CEIL(recPROC_COST.PROC_COST_10 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost11 := CEIL(recPROC_COST.PROC_COST_11 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCost12 := CEIL(recPROC_COST.PROC_COST_12 * recLOWER.NECESSARY_QTY
												   / recPROC_COST.PROC_COST_UNIT_QTY * 10000) / 10000;
							numOwnProcCostSum := numOwnProcCost01 + numOwnProcCost02 + numOwnProcCost03
											   + numOwnProcCost04 + numOwnProcCost05 + numOwnProcCost06
											   + numOwnProcCost07 + numOwnProcCost08 + numOwnProcCost09
											   + numOwnProcCost10 + numOwnProcCost11 + numOwnProcCost12;
							numOwnProcCostSumSum := numOwnProcCostSumSum + numOwnProcCostSum;  /* ���H�����H��(��T_ITEM_PROC_COST) */

							BEGIN  /* �i�ڕʉ��H��E�������� */
								INSERT	INTO  T_ITEM_PROC_COST(
									YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ROOT_ITEM_CD
								   ,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,COST_STATEMENT_NO
								   ,CS_PROC_CD,PROC_COST_CLS_CD
								   ,OWN_PROC_COST_01,OWN_PROC_COST_02,OWN_PROC_COST_03,OWN_PROC_COST_04
								   ,OWN_PROC_COST_05,OWN_PROC_COST_06,OWN_PROC_COST_07,OWN_PROC_COST_08
								   ,OWN_PROC_COST_09,OWN_PROC_COST_10,OWN_PROC_COST_11,OWN_PROC_COST_12
								   ,OWN_PROC_COST_SUM
								   ,UNDER_PROC_COST_01,UNDER_PROC_COST_02,UNDER_PROC_COST_03,UNDER_PROC_COST_04
								   ,UNDER_PROC_COST_05,UNDER_PROC_COST_06,UNDER_PROC_COST_07,UNDER_PROC_COST_08
								   ,UNDER_PROC_COST_09,UNDER_PROC_COST_10,UNDER_PROC_COST_11,UNDER_PROC_COST_12
								   ,UNDER_PROC_COST_SUM
								   ,TOTAL_PROC_COST_01,TOTAL_PROC_COST_02,TOTAL_PROC_COST_03,TOTAL_PROC_COST_04
								   ,TOTAL_PROC_COST_05,TOTAL_PROC_COST_06,TOTAL_PROC_COST_07,TOTAL_PROC_COST_08
								   ,TOTAL_PROC_COST_09,TOTAL_PROC_COST_10,TOTAL_PROC_COST_11,TOTAL_PROC_COST_12
								   ,TOTAL_PROC_COST_SUM
								   ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
								   ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
								   ,MODIFY_COUNT
								)  VALUES (
									pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
								   ,recUPPER.COMP_ITEM_CD
								   ,recLOWER.PARENT_ITEM_CD
								   ,recLOWER.COMP_ITEM_CD
								   ,recLOWER.PS_EDITION,numCostStatemntNo
								   ,recPROC_COST.CS_PROC_CD
								   ,recPROC_COST.PROC_COST_CLS_CD
								   ,numOwnProcCost01,numOwnProcCost02,numOwnProcCost03
								   ,numOwnProcCost04,numOwnProcCost05,numOwnProcCost06
								   ,numOwnProcCost07,numOwnProcCost08,numOwnProcCost09
								   ,numOwnProcCost10,numOwnProcCost11,numOwnProcCost12
								   ,numOwnProcCostSum
								   ,0,0,0,0,0,0,0,0,0,0,0,0,0
								   ,0,0,0,0,0,0,0,0,0,0,0,0,0
								   ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
								   ,0
								);
								numCntUpdItemProcCost := numCntUpdItemProcCost+1; --����f�[�^����(�i�ڕʉ��H��)

							EXCEPTION
								WHEN OTHERS THEN
									vc2Comment := SUBSTR('22:INSERT T_ITEM_PROC_COST'  ||
														 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
														 ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
														 ' ITEM_CD='		|| '[ ' || recLOWER.COMP_ITEM_CD   || ' ]' ||
														 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
														 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
									RAISE  excERR_CURSOR;
							END;  /* �i�ڕʉ��H��E�������� */

--						END IF;  /* ���H��}�X�^�����݂��鎞�i�H������j*/

					END LOOP;  /* �i�ڕʉ��H��}�X�^�̌J��Ԃ� */

/*��������������������������������������������������������������������������������������������������������
�@�@�@�@' ���C������(�擪�i�ˉ��ʓW�J)�@����@�i�ڕʉ��H��}�X�^������ꍇ�@�i�ڕʌ����̏���
����������������������������������������������������������������������������������������������������������*/

					IF	numCntItemProcCost > 0 THEN  /* �i�ڕʉ��H����P���ł��������񂾎��́A�i�ڕʌ������X�V����B*/

						/* ���H��͕K��INSERT */
						BEGIN  /* �i�ڕʌ����E�������� */
							INSERT	INTO  T_ITEM_COST(
									   YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
									   ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
									   ,COST_STATEMENT_NO,NECESSARY_QTY,PS_INPUT_RATIO,ITEM_INPUT_RATIO
									   ,OWN_MATR_COST,UNDER_MATR_COST,TOTAL_MATR_COST,OWN_SBCNT_MATR_COST
									   ,UNDER_SBCNT_MATR_COST,TOTAL_SBCNT_MATR_COST,OWN_PROC_COST_SUM_ALL
									   ,UNDER_PROC_COST_SUM_ALL,TOTAL_PROC_COST_SUM_ALL,EFF_PHASE_IN_DATE
									   ,EFF_PHASE_OUT_DATE,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR
									   ,PARENT_ITEM_STOCK_UNIT,STOCK_UNIT,CLASIFICATION_CD
									   ,OUTSIDE_TYP,DMY_ITEM_FLG,VOLUNT_SPL_FLG,COST_UP_TYP
									   ,ONEROUS_CONS_FLG,UP_LEVEL_NO,UPPER_ITEM_FLG,LOWER_ITEM_FLG
									   ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
									   ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
									   ,MODIFY_COUNT
									   ,PROC_OUTSIDE_TYP
							)  VALUES (
										pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
									   ,recUPPER.COMP_ITEM_CD
									   ,recLOWER.PARENT_ITEM_CD
									   ,recLOWER.COMP_ITEM_CD
									   ,recLOWER.PS_EDITION
									   ,recPROC_COST.CS_PROC_CD
									   ,numCostStatemntNo
									   ,recLOWER.NECESSARY_QTY
									   ,1+(recLOWER.PS_SPOIL/100)
									   ,numItemInputRatio
									   ,0,0,0
									   ,0,0,0
									   ,numOwnProcCostSumSum,0,0
									   ,recLOWER.EFF_PHASE_IN_DATE
									   ,recLOWER.EFF_PHASE_OUT_DATE
									   ,recLOWER.PS_UNIT_DENOMINATOR
									   ,recLOWER.PS_UNIT_NUMERATOR
									   ,recLOWER.PARENT_ITEM_STOCK_UNIT
									   ,recLOWER.STOCK_UNIT
									   ,recPROC_COST.CLASIFICATION_CD
									   ,recLOWER.OUTSIDE_TYP
									   ,recLOWER.DMY_ITEM_FLG
									   ,recLOWER.VOLUNT_SPL_FLG
									   ,recLOWER.COST_UP_TYP
									   ,recPROC_COST.ONEROUS_CONS_FLG
									   ,recLOWER.UP_LEVEL_NO
									   ,recLOWER.UPPER_ITEM_FLG
									   ,recLOWER.LOWER_ITEM_FLG
									   ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
									   ,0
									   ,recPROC_COST.OUTSIDE_TYP
							);
							numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
						EXCEPTION
							WHEN OTHERS THEN
								 vc2Comment := SUBSTR('23:INSERT T_ITEM_COST'  ||
													  ' ROOT_ITEM_CD='	 || '[ ' || recUPPER.COMP_ITEM_CD	|| ' ]' ||
													  ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
													  ' ITEM_CD='		 || '[ ' || recLOWER.COMP_ITEM_CD	|| ' ]' ||
													  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								 RAISE	excERR_CURSOR;
						END;  /* �i�ڕʌ����E�������� */

					END IF;  /* �i�ڕʉ��H����P���ł��������񂾎��́A�i�ڕʌ������X�V����B*/

/*��������������������������������������������������������������������������������������������������������
�@�@�@�@' ���C������(�擪�i�ˉ��ʓW�J)�@����@�i�ڕʉ��H��}�X�^������ꍇ�@�H���O���̏���
����������������������������������������������������������������������������������������������������������*/

					IF	recPROC_COST.OUTSIDE_TYP = 2 THEN  /* �H���O���̎��́A�i�ڕʌ������X�V����B*/

						BEGIN  /* �w���i�}�X�^�ǂݍ��� */
							SELECT	UNIT_COST  ,DECODE(PUCH_UNIT_QTY,0,1,PUCH_UNIT_QTY)  ,EXCH_RATE,CS_PUCH_TYP,
                                    UNIT_COST_ACCEPT_TYP,SUB_UNIT_COST,DECODE(SUB_PUCH_UNIT_QTY,0,1,SUB_PUCH_UNIT_QTY),
                                    SUB_EXCH_RATE,CLASIFICATION_CD,ONEROUS_CONS_FLG,CS_PROC_CD
							INTO	numUnitCost,numUnitQty,numExchRate,numCsPuchTyp,
                                    numUnitCostAcceptTyp,numSubUnitCost,numSubUnitQty,
                                    numSubExchRate,vc2ClasificationCd,numOnerousConsFlg,numCsProcCd
							FROM	M_CS_PUCH
							WHERE	YEAR		  =  pnumYear
							  AND	HALF_TERM_TYP =  pnumHalfTermTyp
							  AND	COST_TYP	  =  pnumCostTyp
							  AND	PLANT_CD	  =  pvc2PlantCd
							  AND	ITEM_CD 	  =  recLOWER.COMP_ITEM_CD
							  AND	DEL_FLG 	  =  0
							;
							blnFoundCsPuch	:=	TRUE;
						EXCEPTION
							WHEN OTHERS THEN
								blnFoundCsPuch	:=	FALSE;
						END;  /* �w���i�}�X�^�ǂݍ��� */

						IF	blnFoundCsPuch	=  TRUE  THEN  /* �w���i�}�X�^�����݂����ꍇ */

                            /* �P�i�ޗ���̎Z�o */
        					IF	numUnitCostAcceptTyp = 1 THEN  --�ʏ�P��
        						numOwnMatrCost := CEIL(
        								  (numUnitCost * recLOWER.NECESSARY_QTY * numItemInputRatio / numUnitQty)
        									* numExchRate * 10000) / 10000;
        					ELSE   --���P��
        						numOwnMatrCost := CEIL(
        								  (numSubUnitCost * recLOWER.NECESSARY_QTY * numItemInputRatio / numSubUnitQty)
        									* numSubExchRate * 10000) / 10000;
                            END IF;
                            
							/*	�H���O���͕K��UPDATE */
							IF numCsPuchTyp = 1 THEN   /*�w���P����ʔ���*/
								/*�w���P����ʂ��w���P���̎��͒P�i�ޗ�����X�V����B*/
								BEGIN  /* �i�ڕʌ����������݂P(UPDATE) */
									UPDATE	T_ITEM_COST  SET
	--										COST_STATEMENT_NO	  = numCostStatemntNo
											OWN_MATR_COST	= OWN_MATR_COST + numOwnMatrCost
										   ,UNDER_SBCNT_MATR_COST = 0
										   ,TOTAL_SBCNT_MATR_COST = 0
										   ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
										   ,MODIFY_COUNT		  = MODIFY_COUNT+1
									WHERE  YEAR 		  = pnumYear
									  AND  HALF_TERM_TYP  = pnumHalfTermTyp
									  AND  COST_TYP 	  = pnumCostTyp
									  AND  PLANT_CD 	  = pvc2PlantCd
									  AND  ROOT_ITEM_CD   = recUPPER.COMP_ITEM_CD
									  AND  PARENT_ITEM_CD = recLOWER.PARENT_ITEM_CD
									  AND  ITEM_CD		  = recLOWER.COMP_ITEM_CD
									  AND  PS_EDITION	  = recLOWER.PS_EDITION
									  AND  COST_STATEMENT_NO  = numCostStatemntNo
									  AND  CS_PROC_CD = numCsProcCd
									;
									numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
								EXCEPTION
									WHEN OTHERS THEN
										vc2Comment := SUBSTR('24:UPDATE T_ITEM_COST'  ||
															 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
															 ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
															 ' ITEM_CD='		|| '[ ' || recLOWER.COMP_ITEM_CD   || ' ]' ||
															 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
															 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
										RAISE  excERR_CURSOR;
								END;  /* �i�ڕʌ����������݂P(UPDATE) */
						   ELSE
						   		/*�w���P����ʂ��O���P���̎��͒P�i�ޗ���i�O���j���X�V����B*/
						   		BEGIN  /* �i�ڕʌ����������݂P(UPDATE) */
									UPDATE	T_ITEM_COST  SET
	--										COST_STATEMENT_NO	  = numCostStatemntNo
											OWN_SBCNT_MATR_COST   = OWN_SBCNT_MATR_COST + numOwnMatrCost
										   ,UNDER_SBCNT_MATR_COST = 0
										   ,TOTAL_SBCNT_MATR_COST = 0
										   ,UPDATED_DATE=SYSDATE,UPDATED_BY= pvc2UserId,UPDATED_PRG_NM= MY_SQL_NAME
										   ,MODIFY_COUNT		  = MODIFY_COUNT+1
									WHERE  YEAR 		  = pnumYear
									  AND  HALF_TERM_TYP  = pnumHalfTermTyp
									  AND  COST_TYP 	  = pnumCostTyp
									  AND  PLANT_CD 	  = pvc2PlantCd
									  AND  ROOT_ITEM_CD   = recUPPER.COMP_ITEM_CD
									  AND  PARENT_ITEM_CD = recLOWER.PARENT_ITEM_CD
									  AND  ITEM_CD		  = recLOWER.COMP_ITEM_CD
									  AND  PS_EDITION	  = recLOWER.PS_EDITION
									  AND  COST_STATEMENT_NO  = numCostStatemntNo
									  AND  CS_PROC_CD = numCsProcCd
									;
									numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
								EXCEPTION
									WHEN OTHERS THEN
										vc2Comment := SUBSTR('24:UPDATE T_ITEM_COST'  ||
															 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
															 ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
															 ' ITEM_CD='		|| '[ ' || recLOWER.COMP_ITEM_CD   || ' ]' ||
															 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
															 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
										RAISE  excERR_CURSOR;
								END;  /* �i�ڕʌ����������݂P(UPDATE) */
						   END IF;	 /*�w���P����ʔ���*/

						ELSE  /* �w���i�}�X�^�����݂����ꍇ */

							/* �����v�Z���O�ꍇ�̏ꍇ�̓G���[�Ƃ��Ȃ� */
							IF	recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
								recLOWER.COST_UP_TYP	  = 0  OR  /* �����Ϗ�敪 */
--								recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
								vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
								vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN	/* [�������O�t���O]�X�V���� */

								NULL;

							ELSE  /* [�������O�t���O]�X�V���� */

								/* �����v�Z�G���[�ԍ��̎擾 */
								blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
								IF	blnRet	=  FALSE  THEN
									vc2Comment := SUBSTR('25:FNCGETSEQCSCALCERRORCD'  ||
														 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
									RAISE  excERR_CURSOR;
								END IF;

								BEGIN  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */
									INSERT	INTO  T_CS_CALC_ERROR (
										  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
										 ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
										 ,PROC_COST_CLS_CD,MESSAGE_CD,REMARKS,LIST_ISS_FLG
										 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
										 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
										 ,MODIFY_COUNT
									)  VALUES (
										  vc2CsCalcErrorCd
										 ,3,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
										 ,recUPPER.COMP_ITEM_CD
										 ,recLOWER.PARENT_ITEM_CD
										 ,recLOWER.COMP_ITEM_CD
										 ,recLOWER.PS_EDITION
										 ,recPROC_COST.CS_PROC_CD,NULL
										 ,'DC00207','�w���i�}�X�^�Ȃ�',0
										 ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
										 ,0
									);
									numCntError := numCntError + 1;  --�����v�Z�G���[����

								EXCEPTION
									WHEN OTHERS THEN
										vc2Comment := SUBSTR('26:INSERT T_CS_CALC_ERROR'  ||
															 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
														 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
										RAISE  excERR_CURSOR;
								END;  /* �����v�Z�G���[��������(�H���O���ōw���i�}�X�^�Ȃ�) */

							END IF;  /* [�������O�t���O]�X�V���� */

						END IF;  /* �w���i�}�X�^�����݂����ꍇ */

				   END IF;	/* �H���O���̎��́A�i�ڕʌ������X�V����B*/

				   CLOSE curPROC_COST;

/*��������������������������������������������������������������������������������������������������������
�@�@�@�@' ���C������(�擪�i�ˉ��ʓW�J)�@����@�i�ڕʉ��H��}�X�^���Ȃ��ꍇ
����������������������������������������������������������������������������������������������������������*/

				ELSE  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

					/* �����v�Z���O�ꍇ�̏ꍇ�̓G���[�Ƃ��Ȃ� */
					IF	recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
						recLOWER.COST_UP_TYP	  = 0  OR  /* �����Ϗ�敪 */
--						recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
						vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
						vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN	/* [�������O�t���O]�X�V���� */

						NULL;

					ELSE  /* [�������O�t���O]�X�V���� */
						/* �����v�Z�G���[�ԍ��̎擾 */
						blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
						IF	blnRet	=  FALSE  THEN
							vc2Comment := SUBSTR('27:FNCGETSEQCSCALCERRORCD'  ||
												 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
							RAISE  excERR_CURSOR;
						END IF;

						BEGIN  /* �����v�Z�G���[��������(����ŕi�ڕʉ��H��}�X�^�Ȃ�) */
							INSERT	INTO  T_CS_CALC_ERROR (
								  CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP
								 ,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
								 ,PS_EDITION,CS_PROC_CD,PROC_COST_CLS_CD
								 ,MESSAGE_CD,REMARKS,LIST_ISS_FLG
								 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
								 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
								 ,MODIFY_COUNT
							)  VALUES (
								  vc2CsCalcErrorCd
								 ,3,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
								 ,recUPPER.COMP_ITEM_CD
								 ,recLOWER.PARENT_ITEM_CD
								 ,recLOWER.COMP_ITEM_CD
								 ,recLOWER.PS_EDITION
								 ,NULL,NULL
								 ,'DC00206','����ŕi�ڕʉ��H��}�X�^�Ȃ�',0
								 ,SYSDATE,pvc2UserId,MY_SQL_NAME
								 ,SYSDATE,pvc2UserId,MY_SQL_NAME
								 ,0
							);
							numCntError := numCntError + 1;  --�����v�Z�G���[����

							/* DC00206�G���[����[�ŏ�ʕi��]�P�ʂŌ����v�Z���O	*/
							UPDATE	T_ITEM_COST SET
								 COST_EXCLUDE_FLG = 1,MODIFY_COUNT=MODIFY_COUNT+1
							WHERE  YEAR 		  = pnumYear
							  AND  HALF_TERM_TYP  = pnumHalfTermTyp
							  AND  COST_TYP 	  = pnumCostTyp
							  AND  PLANT_CD 	  = pvc2PlantCd
							  AND  ROOT_ITEM_CD   = recUPPER.COMP_ITEM_CD
							  AND  PARENT_ITEM_CD = '*'
							  AND  ITEM_CD		  = recUPPER.COMP_ITEM_CD
							;

						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment := SUBSTR('28:INSERT T_CS_CALC_ERROR'  ||
													 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* �����v�Z�G���[��������(����ŕi�ڕʉ��H��}�X�^�Ȃ�) */

					END IF;  /* [�������O�t���O]�X�V���� */

				END IF;  /* �i�ڕʉ��H��}�X�^�̑��ݗL�� */

				numCostStatemntNo  :=  numCostStatemntNo + 1;	  /* �v�Z�o�͏� */

/*��������������������������������������������������������������������������������������������������������
�@�@�@�@' ���C������(�擪�i�ˉ��ʓW�J)�@�O��
����������������������������������������������������������������������������������������������������������*/

			ELSE  /* ����̏��� */

				BEGIN  /* �w���i�}�X�^�ǂݍ��� */

					SELECT
						UNIT_COST_ACCEPT_TYP,UNIT_COST,DECODE(PUCH_UNIT_QTY,0,1,PUCH_UNIT_QTY),EXCH_RATE
					   ,SUB_UNIT_COST,DECODE(SUB_PUCH_UNIT_QTY,0,1,SUB_PUCH_UNIT_QTY),SUB_EXCH_RATE
					   ,CLASIFICATION_CD,ONEROUS_CONS_FLG,CS_PUCH_TYP
					INTO
						numUnitCostAcceptTyp,numUnitCost,numUnitQty,numExchRate
					   ,numSubUnitCost,numSubUnitQty,numSubExchRate
					   ,vc2ClasificationCd,numOnerousConsFlg,numCsPuchTyp
					FROM
					   M_CS_PUCH
					WHERE	 YEAR		   =  pnumYear
					   AND	 HALF_TERM_TYP =  pnumHalfTermTyp
					   AND	 COST_TYP	   =  pnumCostTyp
					   AND	 PLANT_CD	   =  pvc2PlantCd
					   AND	 ITEM_CD	   =  recLOWER.COMP_ITEM_CD
					   AND	 DEL_FLG	   =  0
					;
					blnFoundCsPuch	:=	TRUE;
				EXCEPTION
					WHEN OTHERS THEN
						blnFoundCsPuch	:=	FALSE;
				END;  /* �w���i�}�X�^�ǂݍ��� */

				IF	blnFoundCsPuch	=  TRUE  THEN  /* �w���i�}�X�^�����݂����ꍇ */
					--�P�i�ޗ���̎Z�o
					IF	numUnitCostAcceptTyp = 1 THEN  --�ʏ�P��
						numOwnMatrCost := CEIL(
								  (numUnitCost * recLOWER.NECESSARY_QTY * numItemInputRatio / numUnitQty)
									* numExchRate
								  * 10000) / 10000;
					ELSE   --���P��
						numOwnMatrCost := CEIL(
								  (numSubUnitCost * recLOWER.NECESSARY_QTY * numItemInputRatio / numSubUnitQty)
									* numSubExchRate
									* 10000) / 10000;
					END IF;
					IF numCsPuchTyp = 1 THEN   /*�w���P����ʔ���*/

						/*�w���P����ʂ��w���P���̎��͒P�i�ޗ�����������ށB*/
						BEGIN  /* �i�ڕʌ����E�������� */
							INSERT	INTO  T_ITEM_COST(
										YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
									   ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
									   ,COST_STATEMENT_NO,NECESSARY_QTY,PS_INPUT_RATIO,ITEM_INPUT_RATIO
									   ,OWN_MATR_COST,UNDER_MATR_COST,TOTAL_MATR_COST,OWN_SBCNT_MATR_COST
									   ,UNDER_SBCNT_MATR_COST,TOTAL_SBCNT_MATR_COST,OWN_PROC_COST_SUM_ALL
									   ,UNDER_PROC_COST_SUM_ALL,TOTAL_PROC_COST_SUM_ALL,EFF_PHASE_IN_DATE
									   ,EFF_PHASE_OUT_DATE,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR
									   ,PARENT_ITEM_STOCK_UNIT,STOCK_UNIT,CLASIFICATION_CD
									   ,OUTSIDE_TYP,DMY_ITEM_FLG,VOLUNT_SPL_FLG,COST_UP_TYP
									   ,ONEROUS_CONS_FLG,UP_LEVEL_NO,UPPER_ITEM_FLG,LOWER_ITEM_FLG
									   ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
									   ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
									   ,MODIFY_COUNT
									   ,PROC_OUTSIDE_TYP
							)  VALUES (
										pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
									   ,recUPPER.COMP_ITEM_CD
									   ,recLOWER.PARENT_ITEM_CD
									   ,recLOWER.COMP_ITEM_CD
									   ,recLOWER.PS_EDITION
									   ,OUTSIDE_PROC_CD
									   ,numCostStatemntNo
									   ,recLOWER.NECESSARY_QTY
									   ,1+(recLOWER.PS_SPOIL/100)
									   ,numItemInputRatio
									   ,numOwnMatrCost,0,0
									   ,0,0,0
									   ,0,0,0
									   ,recLOWER.EFF_PHASE_IN_DATE,recLOWER.EFF_PHASE_OUT_DATE
									   ,recLOWER.PS_UNIT_DENOMINATOR,recLOWER.PS_UNIT_NUMERATOR
									   ,recLOWER.PARENT_ITEM_STOCK_UNIT,recLOWER.STOCK_UNIT
									   ,vc2ClasificationCd
									   ,2
									   ,recLOWER.DMY_ITEM_FLG
									   ,recLOWER.VOLUNT_SPL_FLG
									   ,recLOWER.COST_UP_TYP
									   ,numOnerousConsFlg
									   ,recLOWER.UP_LEVEL_NO
									   ,recLOWER.UPPER_ITEM_FLG,recLOWER.LOWER_ITEM_FLG
									   ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
									   ,0
									   ,2
							);
							numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment	:= SUBSTR('29:INSERT T_ITEM_COST'  ||
													  ' ROOT_ITEM_CD='	 || '[ ' || recUPPER.COMP_ITEM_CD	|| ' ]' ||
													  ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
													  ' ITEM_CD='		 || '[ ' || recLOWER.COMP_ITEM_CD	|| ' ]' ||
													  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* �i�ڕʌ����E�������� */
					ELSE
						/*�w���P����ʂ��O���P���̎��͒P�i�ޗ���i�O���j���������ށB*/
						BEGIN  /* �i�ڕʌ����E�������� */
							INSERT	INTO  T_ITEM_COST(
										YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD
									   ,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD,PS_EDITION,CS_PROC_CD
									   ,COST_STATEMENT_NO,NECESSARY_QTY,PS_INPUT_RATIO,ITEM_INPUT_RATIO
									   ,OWN_MATR_COST,UNDER_MATR_COST,TOTAL_MATR_COST,OWN_SBCNT_MATR_COST
									   ,UNDER_SBCNT_MATR_COST,TOTAL_SBCNT_MATR_COST,OWN_PROC_COST_SUM_ALL
									   ,UNDER_PROC_COST_SUM_ALL,TOTAL_PROC_COST_SUM_ALL,EFF_PHASE_IN_DATE
									   ,EFF_PHASE_OUT_DATE,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR
									   ,PARENT_ITEM_STOCK_UNIT,STOCK_UNIT,CLASIFICATION_CD
									   ,OUTSIDE_TYP,DMY_ITEM_FLG,VOLUNT_SPL_FLG,COST_UP_TYP
									   ,ONEROUS_CONS_FLG,UP_LEVEL_NO,UPPER_ITEM_FLG,LOWER_ITEM_FLG
									   ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
									   ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
									   ,MODIFY_COUNT
									   ,PROC_OUTSIDE_TYP
							)  VALUES (
										pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
									   ,recUPPER.COMP_ITEM_CD
									   ,recLOWER.PARENT_ITEM_CD
									   ,recLOWER.COMP_ITEM_CD
									   ,recLOWER.PS_EDITION
									   ,OUTSIDE_PROC_CD
									   ,numCostStatemntNo
									   ,recLOWER.NECESSARY_QTY
									   ,1+(recLOWER.PS_SPOIL/100)
									   ,numItemInputRatio
									   ,0,0,0
									   ,numOwnMatrCost,0,0
									   ,0,0,0
									   ,recLOWER.EFF_PHASE_IN_DATE,recLOWER.EFF_PHASE_OUT_DATE
									   ,recLOWER.PS_UNIT_DENOMINATOR,recLOWER.PS_UNIT_NUMERATOR
									   ,recLOWER.PARENT_ITEM_STOCK_UNIT,recLOWER.STOCK_UNIT
									   ,vc2ClasificationCd
									   ,2
									   ,recLOWER.DMY_ITEM_FLG
									   ,recLOWER.VOLUNT_SPL_FLG
									   ,recLOWER.COST_UP_TYP
									   ,numOnerousConsFlg
									   ,recLOWER.UP_LEVEL_NO
									   ,recLOWER.UPPER_ITEM_FLG,recLOWER.LOWER_ITEM_FLG
									   ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
									   ,0
									   ,2
							);
							numCntUpdItemCost := numCntUpdItemCost+1;	  /* ����f�[�^����(�i�ڕʌ���) */
						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment	:= SUBSTR('29:INSERT T_ITEM_COST'  ||
													  ' ROOT_ITEM_CD='	 || '[ ' || recUPPER.COMP_ITEM_CD	|| ' ]' ||
													  ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
													  ' ITEM_CD='		 || '[ ' || recLOWER.COMP_ITEM_CD	|| ' ]' ||
													  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* �i�ڕʌ����E�������� */
					END IF;   /*�w���P����ʔ���*/
				ELSE	/* �w���i�}�X�^�����݂����ꍇ */

					/* �����v�Z���O�ꍇ�̏ꍇ�̓G���[�Ƃ��Ȃ� */
					IF	recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
						recLOWER.COST_UP_TYP	  = 0  OR  /* �����Ϗ�敪 */
--						recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
						vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
						vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN	/* [�������O�t���O]�X�V���� */

						NULL;

					ELSE  /* [�������O�t���O]�X�V���� */
						/* �����v�Z�G���[�ԍ��̎擾 */
						blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
						IF	blnRet	=  FALSE  THEN
							vc2Comment := SUBSTR('30:FNCGETSEQCSCALCERRORCD'  ||
												 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
							RAISE  excERR_CURSOR;
						END IF;

						BEGIN  /* �����v�Z�G���[��������(�O��ōw���i�}�X�^�Ȃ�)  */
							INSERT	INTO  T_CS_CALC_ERROR
								 (CS_CALC_ERROR_CD,CS_CALC_PROC_NO,YEAR,HALF_TERM_TYP,COST_TYP
								 ,PLANT_CD,ROOT_ITEM_CD,PARENT_ITEM_CD,ITEM_CD
								 ,PS_EDITION,CS_PROC_CD,PROC_COST_CLS_CD
								 ,MESSAGE_CD,REMARKS,LIST_ISS_FLG
								 ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
								 ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
								 ,MODIFY_COUNT
							)  VALUES (
								  vc2CsCalcErrorCd
								 ,3,pnumYear,pnumHalfTermTyp,pnumCostTyp,pvc2PlantCd
								 ,recUPPER.COMP_ITEM_CD
								 ,recLOWER.PARENT_ITEM_CD
								 ,recLOWER.COMP_ITEM_CD
								 ,recLOWER.PS_EDITION
								 ,OUTSIDE_PROC_CD,NULL
								 ,'DC00208','�O��ōw���i�}�X�^�Ȃ�',0
								 ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
								 ,0
							);
							numCntError := numCntError + 1;  --�����v�Z�G���[����

							/* DC00208�G���[����[�ŏ�ʕi��]�P�ʂŌ����v�Z���O	*/
							UPDATE	T_ITEM_COST SET
								COST_EXCLUDE_FLG = 1,MODIFY_COUNT=MODIFY_COUNT+1
							WHERE  YEAR 		  = pnumYear
							  AND  HALF_TERM_TYP  = pnumHalfTermTyp
							  AND  COST_TYP 	  = pnumCostTyp
							  AND  PLANT_CD 	  = pvc2PlantCd
							  AND  ROOT_ITEM_CD   = recUPPER.COMP_ITEM_CD
							  AND  PARENT_ITEM_CD = '*'
							  AND  ITEM_CD		  = recUPPER.COMP_ITEM_CD
							;

						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment := SUBSTR('31:INSERT T_CS_CALC_ERROR'  ||
													 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* �����v�Z�G���[��������(�O��ōw���i�}�X�^�Ȃ�)  */

					END IF;  /* [�������O�t���O]�X�V���� */

				END IF;  /* �w���i�}�X�^�����݂����ꍇ */

				numCostStatemntNo  :=  numCostStatemntNo + 1;	  /* �v�Z�o�͏� */

			END IF;  /* ����̏��� */

		END LOOP;  /* ���ʓW�J�̌J��Ԃ� */

		CLOSE curLOWER;

		COMMIT;  --COMMIT�͐擪�i����

	END IF;  /* �擪�i�ŃG���[ */

	END LOOP;  /*  �擪�i�̌J��Ԃ� */

	CLOSE curUPPER;

	COMMIT;

/*��������������������������������������������������������������������������������������������������������
' �㏈���@(PARENT_COST_STATEMENT_NO�̐ݒ�)
����������������������������������������������������������������������������������������������������������*/

	BEGIN  /* �K�w���x��(UP_LEVEL_NO)�̍ő�l���擾 */
		SELECT	NVL(MAX(UP_LEVEL_NO),0)  INTO	numMaxUpLevelNo
			FROM T_ITEM_COST
			WHERE	YEAR		 = pnumYear
			  AND	HALF_TERM_TYP= pnumHalfTermTyp
			  AND	COST_TYP	 = pnumCostTyp
			  AND	PLANT_CD	 = pvc2PlantCd
		;
		IF	numMaxUpLevelNo  <	2  THEN
			numMaxUpLevelNo  :=  2;
		END IF;
	EXCEPTION
		WHEN OTHERS THEN
			numMaxUpLevelNo  :=  2;
	END;  /* �K�w���x��(UP_LEVEL_NO)�̍ő�l���擾 */

--	  FOR i IN REVERSE 2..99 LOOP  /* UP_LEVEL_NO���Ƃ̃��[�v 99(�擪�i)����2�܂�*/
	FOR i IN REVERSE 2..numMaxUpLevelNo LOOP  /* UP_LEVEL_NO���Ƃ̃��[�v 99(�擪�i)����2�܂�*/

	BEGIN  /* �J�[�\��OPEN(PARENT_STATEMENT) */
		OPEN  curPARENT_STATEMENT(i);
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment	:= SUBSTR('4:OPEN curPARENT_STATEMENT'	||
								  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE	 excERR_CURSOR;
	END;  /* �J�[�\��OPEN(PARENT_STATEMENT) */

	/* PUT_LINE */
	blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
				  pvc2PlantCd, MY_SQL_NAME, 'PARENT_COST_STATEMENT_NO UP_LEVEL_NO='||i);
	/* PUT_LINE */

	LOOP  /* PARENT_STATEMENT�̌J��Ԃ�(MAIN LOOP) */

		BEGIN  /* �J�[�\��FETCH(PARENT_STATEMENT) */
			FETCH  curPARENT_STATEMENT	INTO  recPARENT_STATEMENT;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('5:FETCH curPARENT_STATEMENT'	||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* �J�[�\��FETCH(PARENT_STATEMENT) */
		EXIT WHEN  curPARENT_STATEMENT%NOTFOUND;

		/* �q���P�Z�b�g�̂݌��� */
		BEGIN  /* �J�[�\��OPEN(curPARENT_STATEMENT_COMP) */
			OPEN  curPARENT_STATEMENT_COMP(recPARENT_STATEMENT.ROOT_ITEM_CD,recPARENT_STATEMENT.ITEM_CD);
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment	:= SUBSTR('4:OPEN curPARENT_STATEMENT_COMP'  ||
									  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE	 excERR_CURSOR;
		END;  /* �J�[�\��OPEN(curPARENT_STATEMENT_COMP) */

		LOOP  /* curPARENT_STATEMENT_COMP�̌J��Ԃ� */

			/* �q��PKEY���Q�b�g */
			BEGIN  /* �J�[�\��FETCH(PARENT_STATEMENT) */
				FETCH  curPARENT_STATEMENT_COMP  INTO  recPARENT_STATEMENT_COMP;
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('5:FETCH curPARENT_STATEMENT_COMP'  ||
										 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
										 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE  excERR_CURSOR;
			END;  /* �J�[�\��FETCH(PARENT_STATEMENT) */
			EXIT WHEN  curPARENT_STATEMENT_COMP%NOTFOUND;

			/* �q��PARENT_COST_STATEMENT_NO�ɐe��COST_STATEMENT_NO���Z�b�g */
			UPDATE	T_ITEM_COST  SET
			   PARENT_COST_STATEMENT_NO = recPARENT_STATEMENT.COST_STATEMENT_NO
			  ,MODIFY_COUNT=MODIFY_COUNT+1
			WHERE	YEAR			 = pnumYear
			  AND	HALF_TERM_TYP	 = pnumHalfTermTyp
			  AND	COST_TYP		 = pnumCostTyp
			  AND	PLANT_CD		 = pvc2PlantCd
			  AND	ROOT_ITEM_CD	 = recPARENT_STATEMENT.ROOT_ITEM_CD
--			  AND	PARENT_ITEM_CD	 = recPARENT_STATEMENT.ITEM_CD
--			  AND	ITEM_CD 		 = recPARENT_STATEMENT_COMP.ITEM_CD
--			  AND	PS_EDITION		 = recPARENT_STATEMENT_COMP.PS_EDITION
			  AND	COST_STATEMENT_NO= recPARENT_STATEMENT_COMP.COST_STATEMENT_NO
			  ;

			UPDATE	T_ITEM_PROC_COST  SET
			   PARENT_COST_STATEMENT_NO = recPARENT_STATEMENT.COST_STATEMENT_NO
			  ,MODIFY_COUNT=MODIFY_COUNT+1
			WHERE	YEAR			 = pnumYear
			  AND	HALF_TERM_TYP	 = pnumHalfTermTyp
			  AND	COST_TYP		 = pnumCostTyp
			  AND	PLANT_CD		 = pvc2PlantCd
			  AND	ROOT_ITEM_CD	 = recPARENT_STATEMENT.ROOT_ITEM_CD
--			  AND	PARENT_ITEM_CD	 = recPARENT_STATEMENT.ITEM_CD
--			  AND	ITEM_CD 		 = recPARENT_STATEMENT_COMP.ITEM_CD
--			  AND	PS_EDITION		 = recPARENT_STATEMENT_COMP.PS_EDITION
			  AND	COST_STATEMENT_NO= recPARENT_STATEMENT_COMP.COST_STATEMENT_NO
			  ;

		END LOOP;  /*  curPARENT_STATEMENT_COMP�̌J��Ԃ�*/

		CLOSE curPARENT_STATEMENT_COMP;  /* �J�[�\��CLOSE(curPARENT_STATEMENT_COMP) */

	END LOOP;  /*  PARENT_STATEMENT�̌J��Ԃ� (MAIN LOOP)*/

	COMMIT;

	CLOSE curPARENT_STATEMENT;	/* �J�[�\��CLOSE(PARENT_STATEMENT) */

	END LOOP;  /* �K�w���x�����Ƃ̃��[�v */

/*��������������������������������������������������������������������������������������������������������
' �㏈���A(�������O�t���O�̍X�V)
����������������������������������������������������������������������������������������������������������*/

	numCntTest := 0;

	BEGIN  /* �J�[�\��OPEN(�擪�i(�������O�t���O)) */
		OPEN  curUPPER_EXCLUDE;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('32:OPEN curUPPER_EXCLUDE'  ||
								 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE  excERR_CURSOR;
	END;  /* �J�[�\��OPEN(�擪�i(�������O�t���O)) */

	LOOP  /*  �擪�i(�������O�t���O)�̌J��Ԃ� */
		BEGIN
			FETCH  curUPPER_EXCLUDE  INTO  recUPPER_EXCLUDE;  /* �J�[�\��FETCH(�擪�i(�������O�t���O)) */
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('33:FETCH curUPPER_EXCLUDE'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;
		EXIT WHEN  curUPPER_EXCLUDE%NOTFOUND;

		/* PUT_LINE */
		numCntTest := numCntTest + 1;
		IF numCntTest >= 10 THEN
			numCntTest := 0;
			blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, 'COST_EXCLUDE_FLG ITEM_CD='||recUPPER_EXCLUDE.ITEM_CD);
		END IF;
		/* PUT_LINE */

		IF	recUPPER_EXCLUDE.COST_EXCLUDE_FLG = 1  OR  /* �����v�Z���O�t���O */
			recUPPER_EXCLUDE.VOLUNT_SPL_FLG   = 1  OR  /* �����󋋕i�t���O */
			recUPPER_EXCLUDE.COST_UP_TYP	  = 0  OR  /* �����Ϗ�敪 */
			recUPPER_EXCLUDE.ONEROUS_CONS_FLG = 1  OR  /* �L���x���i�t���O */
			recUPPER_EXCLUDE.DMY_ITEM_FLG = 1	   OR  /* �[���i�ڃt���O */
			vc2PhaseStartMonth > TO_CHAR(recUPPER_EXCLUDE.EFF_PHASE_OUT_DATE,'YYYYMM') OR
			vc2PhaseEndMonth   < TO_CHAR(recUPPER_EXCLUDE.EFF_PHASE_IN_DATE,'YYYYMM')
		THEN  /* [�������O�t���O]�X�V���� */

			/* �擪�i��[���O]�Ώۂ̎���ROOT_ITEM_CD�P�ʂŏ��O */
			UPDATE	T_ITEM_COST  SET
				 COST_EXCLUDE_FLG = 1,MODIFY_COUNT=MODIFY_COUNT+1
			WHERE  YEAR 		  = pnumYear
			  AND  HALF_TERM_TYP  = pnumHalfTermTyp
			  AND  COST_TYP 	  = pnumCostTyp
			  AND  PLANT_CD 	  = pvc2PlantCd
			  AND  ROOT_ITEM_CD   = recUPPER_EXCLUDE.ITEM_CD
			;

		ELSE	/* [�������O�t���O]�X�V���� */

			BEGIN  /*  �J�[�\��OPEN(���ʓW�J(�������O�t���O)) */
				OPEN  curLOWER_EXCLUDE(recUPPER_EXCLUDE.ITEM_CD);
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('34:OPEN curLOWER_EXCLUDE'  ||
										 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
										 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE  excERR_CURSOR;
			END;  /*  �J�[�\��OPEN(���ʓW�J(�������O�t���O)) */

			LOOP  /*  ���ʓW�J(�������O�t���O)�̌J��Ԃ� */

				BEGIN  /* �J�[�\��FETCH(���ʓW�J(�������O�t���O)) */
					FETCH  curLOWER_EXCLUDE  INTO  recLOWER_EXCLUDE;
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('35:FETCH curLOWER_EXCLUDE'  ||
											 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
						RAISE  excERR_CURSOR;
				END;  /* �J�[�\��FETCH(���ʓW�J(�������O�t���O)) */

				EXIT WHEN  curLOWER_EXCLUDE%NOTFOUND;

				/* [�������O�t���O]�X�V���� */
				blnCOST_EXCLUDE_FLG := FALSE;  /* �������O���� */
				FOR i IN 1..99 LOOP
					/* �������g XXX(N�޲�)�̎��ASUBSTRB(XXX,(i-1)*(N+1)+2,N)='?'�Ŕ��� */
					/* �P����O XXX(N�޲�)�̎��ASUBSTRB(XXX,(i-2)*(N+1)+2,N)='?'�Ŕ��� */
					/* �Q����O XXX(N�޲�)�̎��ASUBSTRB(XXX,(i-3)*(N+1)+2,N)='?'�Ŕ��� */
					/* �����󋋕i�t���O(1�޲�)*/
					IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_VOLUNT_SPL_FLG,(i-1)*(1+1)+2,1) IS NULL THEN
						EXIT;
					ELSIF  SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_VOLUNT_SPL_FLG,(i-1)*(1+1)+2,1) =  '1'	THEN
						blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
						EXIT;
					/* �����Ϗ�敪(1�޲�) */
					ELSIF  SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_COST_UP_TYP,(i-1)*(1+1)+2,1) =	'0'  THEN
						blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
						EXIT;
					/* ���i�\���L���I����(8�޲�) */
					ELSIF  vc2PhaseStartMonth > SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_EFF_PHASE_OUT_DATE,(i-1)*(8+1)+2,6) THEN
						blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
						EXIT;
					/* ���i�\���L���J�n��(8�޲�) */
					ELSIF  vc2PhaseEndMonth < SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_EFF_PHASE_IN_DATE,(i-1)*(8+1)+2,6) THEN
						blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
						EXIT;
					/* �L���x���i�t���O(1�޲�)(�ƂP����O�̋[���i�ڃt���O/�i�ړ��O�敪or�H�����O�敪 ) */
					ELSIF  SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_ONEROUS_CONS_FLG,(i-1)*(1+1)+2,1) =  '1'  THEN
						/* �q�̂P����ځi�ʎZ�łQ����ځj */
						IF i = 1 THEN
							/* �P����O�͐擪�i */
							IF (recUPPER_EXCLUDE.DMY_ITEM_FLG = 0)	AND
							   (recUPPER_EXCLUDE.OUTSIDE_TYP = 2
								OR
								recUPPER_EXCLUDE.PROC_OUTSIDE_TYP = 2 ) THEN
								blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
								EXIT;
							END IF;
						/* �q�̂Q����ځi�ʎZ�łR����ځj */
						ELSIF i=2 THEN
							/* �P����O */
							IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_DMY_ITEM_FLG,(i-2)*(1+1)+2,1) =  '0'  THEN
								IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_OUTSIDE_TYP,(i-2)*(1+1)+2,1) =  '2'
									 OR
									SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_PROC_OUTSIDE_TYP,(i-2)*(1+1)+2,1) =  '2'  THEN
									blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
									EXIT;
								END IF;
							/* �P����O���[���i�ڂ̏ꍇ�͂Q����O������ */
							ELSE
								/* �Q����O�͐擪�i */
								IF	(recUPPER_EXCLUDE.DMY_ITEM_FLG = 0)  AND
									(recUPPER_EXCLUDE.OUTSIDE_TYP = 2
									  OR
									 recUPPER_EXCLUDE.PROC_OUTSIDE_TYP = 2 ) THEN
									blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
									EXIT;
								END IF;
							END IF;
						/* �q�̂R����ڈȍ~�i�ʎZ�łS����ڈȍ~�j */
						ELSE
							/* �P����O */
							IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_DMY_ITEM_FLG,(i-2)*(1+1)+2,1) =  '0'  THEN
								IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_OUTSIDE_TYP,(i-2)*(1+1)+2,1) =  '2'
									 OR
									SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_PROC_OUTSIDE_TYP,(i-2)*(1+1)+2,1) =  '2'  THEN
									blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
									EXIT;
								END IF;
							/* �P����O���[���i�ڂ̏ꍇ�͂Q����O������ */
							ELSE
								/* �Q����O */
								IF	(SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_DMY_ITEM_FLG,(i-3)*(1+1)+2,1) =  '0')  AND
									(SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_OUTSIDE_TYP,(i-3)*(1+1)+2,1) =  '2'
									  OR
									 SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_PROC_OUTSIDE_TYP,(i-3)*(1+1)+2,1) =  '2') THEN
									blnCOST_EXCLUDE_FLG := TRUE;  /* �������O���� */
									EXIT;
								END IF;
							END IF;
						END IF;
					END IF;
				END LOOP;

				/* [���O]�Ώۂ���̏ꍇ */
				IF	blnCOST_EXCLUDE_FLG = TRUE	THEN
					/* [���O]�Ώۈȍ~��[���O]�ΏۂƂ���ׁAPKEY�P�ʂŏ��O */
					UPDATE	T_ITEM_COST  SET
						COST_EXCLUDE_FLG = 1,MODIFY_COUNT=MODIFY_COUNT+1
					WHERE  YEAR 		   = pnumYear
					  AND  HALF_TERM_TYP   = pnumHalfTermTyp
					  AND  COST_TYP 	   = pnumCostTyp
					  AND  PLANT_CD 	   = pvc2PlantCd
					  AND  ROOT_ITEM_CD    = recLOWER_EXCLUDE.ROOT_ITEM_CD
					  AND  PARENT_ITEM_CD  = recLOWER_EXCLUDE.PARENT_ITEM_CD
					  AND  ITEM_CD		   = recLOWER_EXCLUDE.ITEM_CD
					  AND  PS_EDITION	   = recLOWER_EXCLUDE.PS_EDITION
					  AND  COST_STATEMENT_NO = recLOWER_EXCLUDE.COST_STATEMENT_NO
					;
				END IF;

			END LOOP;	/*	���ʓW�J(�������O�t���O)�̌J��Ԃ� */

			CLOSE curLOWER_EXCLUDE;

		END IF;  /* [�������O�t���O]�X�V���� */

		COMMIT;

	END LOOP;  /*  �擪�i(�������O�t���O)�̌J��Ԃ� */

	CLOSE curUPPER_EXCLUDE;  /* �J�[�\��CLOSE(�擪�i(�������O�t���O)) */

	COMMIT;

/*��������������������������������������������������������������������������������������������������������
' �㏈���B(���[�i�t���O�̍X�V�i�Đݒ�))
����������������������������������������������������������������������������������������������������������*/

/*	���X�|���X���P�ׁ̈A�㏈���B��p�~(��������)

	numCntTest := 0;

	BEGIN  /* �J�[�\��OPEN(���[�i)
		OPEN  curLOWER_ITEM;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('36:OPEN curLOWER_ITEM'  ||
								 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE  excERR_CURSOR;
	END;  /* �J�[�\��OPEN(���[�i)

	LOOP  /*  ���[�i�̌J��Ԃ�

		BEGIN  /* �J�[�\��FETCH(���[�i)
			FETCH  curLOWER_ITEM  INTO	recLOWER_ITEM;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('37:FETCH curLOWER_ITEM'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* �J�[�\��FETCH(���[�i)

		/* PUT_LINE
		numCntTest := numCntTest + 1;
		IF numCntTest >= 1000 THEN
			numCntTest := 0;
			blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, 'LOWER_ITEM_FLG ITEM_CD='||recUPPER_EXCLUDE.ITEM_CD);
		END IF;
		/* PUT_LINE

		EXIT WHEN  curLOWER_ITEM%NOTFOUND;

		BEGIN  /* ���[�i�̍Đݒ�
			UPDATE	T_ITEM_COST  SET
					LOWER_ITEM_FLG	 = 1
			WHERE  YEAR 		   = recLOWER_ITEM.YEAR
			  AND  HALF_TERM_TYP   = recLOWER_ITEM.HALF_TERM_TYP
			  AND  COST_TYP 	   = recLOWER_ITEM.COST_TYP
			  AND  PLANT_CD 	   = recLOWER_ITEM.PLANT_CD
			  AND  ROOT_ITEM_CD    = recLOWER_ITEM.ROOT_ITEM_CD
			  AND  PARENT_ITEM_CD  = recLOWER_ITEM.PARENT_ITEM_CD
			  AND  ITEM_CD		   = recLOWER_ITEM.ITEM_CD
			  AND  PS_EDITION	   = recLOWER_ITEM.PS_EDITION
			  AND  COST_STATEMENT_NO = recLOWER_ITEM.COST_STATEMENT_NO
			;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('38:UPDATE T_ITEM_COST'  ||
									 ' ROOT_ITEM_CD='	|| '[ ' || recLOWER_ITEM.ROOT_ITEM_CD	|| ' ]' ||
									 ' PARENT_ITEM_CD=' || '[ ' || recLOWER_ITEM.PARENT_ITEM_CD || ' ]' ||
									 ' ITEM_CD='		|| '[ ' || recLOWER_ITEM.ITEM_CD		|| ' ]' ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* ���[�i�̍Đݒ�

	END LOOP;  /*  ���[�i�̌J��Ԃ�

	CLOSE curLOWER_ITEM;  /* �J�[�\��CLOSE(���[�i)

	COMMIT;
���X�|���X���P�ׁ̈A�㏈���B��p�~ (�����܂�)*/

/* �����̏I�� */

	/* �I�����b�Z�[�W�̏o�� */
	vc2Comment := SUBSTR('(SBM0556)�@���͌���(�擪�i)=' || '[ ' || numCntUpper || ' ]' ||
						 '�@���͌���(���ʓW�J)=' || '[ ' || numCntLower || ' ]' ||
						 '�@�o�͌���(�i�ڕʌ���)=' || '[ ' || numCntUpdItemCost || ' ]' ||
						 '�@�o�͌���(�i�ڕʉ��H��)=' || '[ ' || numCntUpdItemProcCost || ' ]' ||
						 '�@�G���[����=' || '[ ' || numCntError || ' ]',1,256);
	blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
						pvc2UserId, pvc2BusinessName,
						pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
						vc2Comment);

	COMMIT;

	/* �g���[�X���O�̏o��(�I��) */
	blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
						  pvc2UserId,pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, METHOD_END);

	COMMIT;

	/* LogFile �� CLOSE */
	blnRet := FNCLOGCLOSE(UTL_FileHandle);

	IF	numCntError = 0 THEN
		pnumReturn := STATUS_NORMAL; --����I��
	ELSE
		pnumReturn := STATUS_WARNING; --�x���I��
	END IF;

--< ��O���� >---------------------------------------------------------------
EXCEPTION
	WHEN excERR_SKIP THEN	 --���s�s��

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

		pnumReturn := STATUS_ERROR; --�ُ�I��

	WHEN excERR_CURSOR THEN    --�J�[�\��(curUPPER)OPEN���̂c�a�G���[

		IF curUPPER%ISOPEN = TRUE THEN
			CLOSE curUPPER;
		END IF;
		IF curLOWER%ISOPEN = TRUE THEN
			CLOSE curLOWER;
		END IF;
		IF curPROC_COST%ISOPEN = TRUE THEN
			CLOSE curPROC_COST;
		END IF;
		IF curUPPER_EXCLUDE%ISOPEN = TRUE THEN
			CLOSE curUPPER_EXCLUDE;
		END IF;
		IF curLOWER_EXCLUDE%ISOPEN = TRUE THEN
			CLOSE curLOWER_EXCLUDE;
		END IF;
		IF curLOWER_ITEM%ISOPEN = TRUE THEN
			CLOSE curLOWER_ITEM;
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

		pnumReturn := STATUS_ERROR; --�ُ�I��

	WHEN OTHERS  THEN	--���̑��̃G���[

		IF curUPPER%ISOPEN = TRUE THEN
			CLOSE curUPPER;
		END IF;
		IF curLOWER%ISOPEN = TRUE THEN
			CLOSE curLOWER;
		END IF;
		IF curPROC_COST%ISOPEN = TRUE THEN
			CLOSE curPROC_COST;
		END IF;
		IF curUPPER_EXCLUDE%ISOPEN = TRUE THEN
			CLOSE curUPPER_EXCLUDE;
		END IF;
		IF curLOWER_EXCLUDE%ISOPEN = TRUE THEN
			CLOSE curLOWER_EXCLUDE;
		END IF;
		IF curLOWER_ITEM%ISOPEN = TRUE THEN
			CLOSE curLOWER_ITEM;
		END IF;

		ROLLBACK;

		/* �I�����b�Z�[�W�̏o�� */
		vc2Comment := SUBSTR('(SBM0551) ���̑��̃G���[���������܂���'  ||
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

		pnumReturn := STATUS_ERROR; --�ُ�I��

END;
/
