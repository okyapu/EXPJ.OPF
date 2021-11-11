CREATE OR REPLACE PROCEDURE SQLSTOCKVALUPDATE(
/*------------------------------------------------------------------------------
'
' SQL_NAME	: SqlStockValUpdate.sql
' Version	: 1.00.00
'
' �C������
' 2007.02.01 ����
'
' �@�\		: �݌ɕ]�����z�쐬����
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
' �@�\����	: [�i�ڕʌ���]."�i�ڕʉ��H��"����ɁA[�݌ɕ]�����z]��[�݌ɕ]�����z����]�̍쐬���s���B
'
'
' ���l		:
'
------------------------------------------------------------------------------*/

--< �v���V�[�W������` >-----------------------------------------------------
	pvc2LogMode 		 IN  VARCHAR2		 -- �k�n�f���[�h
   ,pvc2OutputMode		 IN  VARCHAR2		 -- �o�̓��[�h
   ,pvc2OutputPath		 IN  VARCHAR2		 -- �o�̓p�X
   ,pvc2OutputName		 IN  VARCHAR2		 -- �o�̓t�@�C����
   ,pvc2UserId			 IN  VARCHAR2		 -- ���[�U�h�c
   ,pvc2BusinessName	 IN  VARCHAR2		 -- �Ɩ���
   ,pvc2PlantCd 		 IN  VARCHAR2		 -- �H��R�[�h
   ,pnumYear			 IN  NUMBER 		 -- �Ώ۔N�x
   ,pnumHalfTermTyp 	 IN  NUMBER 		 -- �����敪
   ,pnumCostTyp 		 IN  NUMBER 		 -- �������
   ,pnumActTyp			 IN  NUMBER 		 -- ���s�敪
   ,pnumReturn			 OUT NUMBER 		 -- ��������
)
IS

	/** �萔�̐錾 **/

	METHOD_START				VARCHAR2(20)  := 'START';				 -- ���O�p���\�b�h�J�n�錾
	METHOD_END					VARCHAR2(12)  := 'END'; 				 -- ���O�p���\�b�h�I���錾
	MY_SQL_NAME 				VARCHAR2(120) := 'SQLSTOCKVALUPDATE';	 -- �o�k�^�r�p�k��

	/* �G���[���b�Z�[�W�ԍ� */
	APS_COM_BATCH_START 		VARCHAR2(28)  := 'DC01210';
	APS_COM_BATCH_END			VARCHAR2(28)  := 'DC01211';
	APS_COM_BATCH_EXP			VARCHAR2(28)  := 'DC01212';

	/* �G���[���b�Z�[�W */
	LOGMSG_START_PGNM			VARCHAR2(200) := '(SBM1702)�݌ɕ]�����z�쐬�������J�n���܂���';
	LOGMSG_END_PGNM 			VARCHAR2(200) := '�݌ɕ]�����z�쐬�������I�����܂���';
	LOGMSG_EXP_PGNM 			VARCHAR2(200) := '�݌ɕ]�����z�쐬�������ُ�I�����܂���';

	/* �������� */
	STATUS_NORMAL				NUMBER		  := 1; 			   -- ����I��
	STATUS_WARNING				NUMBER		  := 2; 			   -- �x���I��
	STATUS_ERROR				NUMBER		  := 3; 			   -- �ُ�I��

	/** �ϐ��̒�` **/

	UTL_FileHandle				UTL_FILE.FILE_TYPE; 			   -- �t�@�C���n���h��

	numCntIntStockValH			NUMBER(11)	  := 0; 			   -- �݌ɕ]�����z��������
	numCntIntStockVal			NUMBER(11)	  := 0; 			   -- �݌ɕ]�����z���׏�������
	numOwnMatrCost				NUMBER(18,4)  := 0; 			   -- �P�i�ޗ��� �Z�o�p
	numOwnSbcntMatrCost 		NUMBER(18,4)  := 0; 			   -- �P�i�ޗ���i�O���j�Z�o�p
	numOwnProcCostSumAll		NUMBER(18,4)  := 0; 			   -- ���H�����H��v �Z�o�p
	numOwnProcCost01			NUMBER(18,4)  := 0; 			   -- ���H�����H��01 �Z�o�p
	numOwnProcCost02			NUMBER(18,4)  := 0; 			   -- ���H�����H��02 �Z�o�p
	numOwnProcCost03			NUMBER(18,4)  := 0; 			   -- ���H�����H��03 �Z�o�p
	numOwnProcCost04			NUMBER(18,4)  := 0; 			   -- ���H�����H��04 �Z�o�p
	numOwnProcCost05			NUMBER(18,4)  := 0; 			   -- ���H�����H��05 �Z�o�p
	numOwnProcCost06			NUMBER(18,4)  := 0; 			   -- ���H�����H��06 �Z�o�p
	numOwnProcCost07			NUMBER(18,4)  := 0; 			   -- ���H�����H��07 �Z�o�p
	numOwnProcCost08			NUMBER(18,4)  := 0; 			   -- ���H�����H��08 �Z�o�p
	numOwnProcCost09			NUMBER(18,4)  := 0; 			   -- ���H�����H��09 �Z�o�p
	numOwnProcCost10			NUMBER(18,4)  := 0; 			   -- ���H�����H��10 �Z�o�p
	numOwnProcCost11			NUMBER(18,4)  := 0; 			   -- ���H�����H��11 �Z�o�p
	numOwnProcCost12			NUMBER(18,4)  := 0; 			   -- ���H�����H��12 �Z�o�p

	/* �����Ǘ��p�����[�^����̎擾���� */
	numStartMonth				SYS_COST_CTRL.START_MONTH%TYPE;    -- �N�x�J�n��

	blnRet						BOOLEAN;						   -- ���ʊ֐��̖ߒl
	vc2Comment					VARCHAR2(1024); 				   -- ���b�Z�[�W�쐬�p

	/* ��O�����p�ϐ� */
	excERR_SKIP 				EXCEPTION;						   -- ���s�s��
	excERR_CURSOR				EXCEPTION;						   -- �J�[�\��OPEN����EXCEPTION

	/* �J�[�\���̐錾 */

	-- [�i�ڕʌ���]�̌���
	CURSOR curT_ITEM_COST
	IS
	SELECT
		T1.YEAR 					  -- [�i�ڕʌ���]."�N�x"
	   ,T1.HALF_TERM_TYP			  -- [�i�ڕʌ���]."�����敪"
	   ,T1.COST_TYP 				  -- [�i�ڕʌ���]."�������"
	   ,T1.PLANT_CD 				  -- [�i�ڕʌ���]."�H��R�[�h"
	   ,T1.ROOT_ITEM_CD 			  -- [�i�ڕʌ���]."�ŏ�ʕi�ڔԍ�"
	   ,T1.PARENT_ITEM_CD			  -- [�i�ڕʌ���]."�e�i�ڔԍ�"
	   ,T1.ITEM_CD					  -- [�i�ڕʌ���]."�i�ڔԍ�"
	   ,T1.PS_EDITION				  -- [�i�ڕʌ���]."���i�\���Ő�"
	   ,T1.COST_STATEMENT_NO		  -- [�i�ڕʌ���]."�v�Z���o�͏�"
	   ,T1.NECESSARY_QTY			  -- [�i�ڕʌ���]."�K�v���v��"
       ,T1.ITEM_INPUT_RATIO           -- [�i�ڕʌ���]."�i�ڎd�������W��"
	   ,T1.OWN_MATR_COST			  -- [�i�ڕʌ���]."�P�i�ޗ���"
	   ,T1.UNDER_MATR_COST			  -- [�i�ڕʌ���]."���ʕi�ڐϏ�ޗ���"
	   ,T1.OWN_SBCNT_MATR_COST		  -- [�i�ڕʌ���]."�P�i�ޗ���i�O���j"
	   ,T1.UNDER_SBCNT_MATR_COST	  -- [�i�ڕʌ���]."���ʕi�ڐϏ�ޗ���i�O���j"
	   ,T1.OWN_PROC_COST_SUM_ALL	  -- [�i�ڕʌ���]."���H�����H��v"
	   ,T1.UNDER_PROC_COST_SUM_ALL	  -- [�i�ڕʌ���]."���ʕi�ڐϏ���H��v"
	   ,T1.STOCK_UNIT				  -- [�i�ڕʌ���]."�v�ʒP��"
	FROM
		T_ITEM_COST T1				  -- [�i�ڕʌ���]
	WHERE
		T1.YEAR 		 = pnumYear
	AND T1.HALF_TERM_TYP = pnumHalfTermTyp
	AND T1.COST_TYP 	 = pnumCostTyp
	AND T1.PLANT_CD 	 = pvc2PlantCd
	ORDER BY
		T1.COST_STATEMENT_NO DESC
	   ,T1.PARENT_ITEM_CD	 ASC
	   ,T1.ITEM_CD			 ASC
	   ,T1.ROOT_ITEM_CD 	 ASC
	;

	recT_ITEM_COST curT_ITEM_COST%ROWTYPE;

	-- [�݌ɕ]�����z]�̌���
	CURSOR curT_STOCK_VAL_H (
							  cvc2ItemCd	VARCHAR2
	)
	IS
	SELECT
		T1.YEAR 			-- [�݌ɕ]�����z]."�N�x"
	   ,T1.HALF_TERM_TYP	-- [�݌ɕ]�����z]."�����敪"
	   ,T1.PLANT_CD 		-- [�݌ɕ]�����z]."�H��R�[�h"
	   ,T1.ITEM_CD			-- [�݌ɕ]�����z]."�i�ڔԍ�"
	FROM
		T_STOCK_VAL_H T1	-- [�݌ɕ]�����z]
	WHERE
		T1.YEAR 		 = pnumYear
	AND T1.HALF_TERM_TYP = pnumHalfTermTyp
	AND T1.COST_TYP 	 = pnumCostTyp
	AND T1.PLANT_CD 	 = pvc2PlantCd
	AND T1.ITEM_CD		 = cvc2ItemCd
	;

	recT_STOCK_VAL_H curT_STOCK_VAL_H%ROWTYPE;

	-- [�i�ڕʉ��H��]�̌���
	CURSOR curT_ITEM_PROC_COST (
								 cnumYear				NUMBER
								,cnumHalfTermTyp		NUMBER
								,cnumCostTyp			NUMBER
								,cvc2PlantCd			VARCHAR2
								,cvc2RootItemCd 		VARCHAR2
								,cvc2ParentItemCd		VARCHAR2
								,cvc2ItemCd 			VARCHAR2
								,cvc2PsEdition			VARCHAR2
								,cnumCostStatementNo	NUMBER
	)
	IS
	SELECT
		T1.PROC_COST_CLS_CD 	 -- [�i�ڕʉ��H��]."���H��ރR�[�h"
	   ,T1.OWN_PROC_COST_01 	 -- [�i�ڕʉ��H��]."���H�����H��01"
	   ,T1.OWN_PROC_COST_02 	 -- [�i�ڕʉ��H��]."���H�����H��02"
	   ,T1.OWN_PROC_COST_03 	 -- [�i�ڕʉ��H��]."���H�����H��03"
	   ,T1.OWN_PROC_COST_04 	 -- [�i�ڕʉ��H��]."���H�����H��04"
	   ,T1.OWN_PROC_COST_05 	 -- [�i�ڕʉ��H��]."���H�����H��05"
	   ,T1.OWN_PROC_COST_06 	 -- [�i�ڕʉ��H��]."���H�����H��06"
	   ,T1.OWN_PROC_COST_07 	 -- [�i�ڕʉ��H��]."���H�����H��07"
	   ,T1.OWN_PROC_COST_08 	 -- [�i�ڕʉ��H��]."���H�����H��08"
	   ,T1.OWN_PROC_COST_09 	 -- [�i�ڕʉ��H��]."���H�����H��09"
	   ,T1.OWN_PROC_COST_10 	 -- [�i�ڕʉ��H��]."���H�����H��10"
	   ,T1.OWN_PROC_COST_11 	 -- [�i�ڕʉ��H��]."���H�����H��11"
	   ,T1.OWN_PROC_COST_12 	 -- [�i�ڕʉ��H��]."���H�����H��12"
	   ,T1.UNDER_PROC_COST_01	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��01"
	   ,T1.UNDER_PROC_COST_02	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��02"
	   ,T1.UNDER_PROC_COST_03	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��03"
	   ,T1.UNDER_PROC_COST_04	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��04"
	   ,T1.UNDER_PROC_COST_05	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��05"
	   ,T1.UNDER_PROC_COST_06	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��06"
	   ,T1.UNDER_PROC_COST_07	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��07"
	   ,T1.UNDER_PROC_COST_08	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��08"
	   ,T1.UNDER_PROC_COST_09	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��09"
	   ,T1.UNDER_PROC_COST_10	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��10"
	   ,T1.UNDER_PROC_COST_11	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��11"
	   ,T1.UNDER_PROC_COST_12	 -- [�i�ڕʉ��H��]."���ʕi�ڐϏ���H��12"
	FROM
		T_ITEM_PROC_COST T1 	 -- [�i�ڕʉ��H��]
	WHERE
		T1.YEAR 			 = cnumYear
	AND T1.HALF_TERM_TYP	 = cnumHalfTermTyp
	AND T1.COST_TYP 		 = cnumCostTyp
	AND T1.PLANT_CD 		 = cvc2PlantCd
	AND T1.ROOT_ITEM_CD 	 = cvc2RootItemCd
	AND T1.PARENT_ITEM_CD	 = cvc2ParentItemCd
	AND T1.ITEM_CD			 = cvc2ItemCd
	AND T1.PS_EDITION		 = cvc2PsEdition
	AND T1.COST_STATEMENT_NO = cnumCostStatementNo
	;

	recT_ITEM_PROC_COST curT_ITEM_PROC_COST%ROWTYPE;

BEGIN

/*��������������������������������������������������������������������������������������������������������
' �o�b�`�J�n����
����������������������������������������������������������������������������������������������������������*/

	/* LogFile �� OPEN */
	blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

	/* TraceLog�̏o��(Start)�������s�� */
	blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, METHOD_START);

	/* �Ɩ��J�n���b�Z�[�W�̏o�� */
	blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
						LOGMSG_START_PGNM);

	COMMIT;

	/* �J�E���^�̏����� */
	numCntIntStockValH	  := 0; 	-- �݌ɕ]�����z��������
	numCntIntStockVal	  := 0; 	-- �݌ɕ]�����z���׏�������

/*��������������������������������������������������������������������������������������������������������
' �����`�F�b�N����
����������������������������������������������������������������������������������������������������������*/

	/* �����Ǘ��p�����[�^�̓Ǎ� */
	BEGIN
		SELECT
			START_MONTH
		INTO
			numStartMonth
		FROM
			SYS_COST_CTRL
		WHERE
			PLANT_CD = pvc2PlantCd;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('(SBM0535)1:�����Ǘ��p�����[�^�����݂��܂���B' ||
								 ' USER_CD='  || '[ ' || pvc2UserId 	|| ' ]' ||
								 ' PLANT_CD=' || '[ ' || pvc2PlantCd	|| ' ]',1,256);
			RAISE excERR_SKIP;
	END;

	/* �p�����[�^�̃`�F�b�N�i�Ώ۔N�x�j*/
	IF pnumYear IS NULL THEN
		vc2Comment := SUBSTR('(SBM0536)2:�p�����[�^�s���B' ||
							 ' �Ώ۔N�x=' || '[ ' || pnumYear || ' ]',1,256);
		RAISE excERR_SKIP;
	END IF;

	/* �p�����[�^�̃`�F�b�N�i�����敪�j*/
	IF pnumHalfTermTyp NOT IN ( 1, 2 ) THEN
		vc2Comment := SUBSTR('(SBM0218)3:�p�����[�^�s���B' ||
							 ' �����敪=' || '[ ' || pnumHalfTermTyp || ' ]',1,256);
		RAISE excERR_SKIP;
	END IF;

/*��������������������������������������������������������������������������������������������������������
' �Ώ۔N�x�̊����f�[�^�폜�����J�n
����������������������������������������������������������������������������������������������������������*/

	/* �݌ɕ]�����z�i�W�������j�̍폜 */
	DELETE
	FROM
		T_STOCK_VAL_H
	WHERE
		YEAR		  = pnumYear
	AND HALF_TERM_TYP = pnumHalfTermTyp
	AND COST_TYP	  = pnumCostTyp
	AND PLANT_CD	  = pvc2PlantCd
	;

	/* �݌ɕ]�����z���ׂ̍폜 */
	DELETE
	FROM
		T_STOCK_VAL
	WHERE
		YEAR		  = pnumYear
	AND HALF_TERM_TYP = pnumHalfTermTyp
	AND COST_TYP	  = pnumCostTyp
	AND PLANT_CD	  = pvc2PlantCd
	;

/*��������������������������������������������������������������������������������������������������������
' ���C�������J�n
����������������������������������������������������������������������������������������������������������*/

	/* �J�[�\���n�o�d�m�i[�i�ڕʌ���]�j*/
	BEGIN
		OPEN curT_ITEM_COST;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('4:OPEN curT_ITEM_COST'		||
								 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE excERR_CURSOR;
	END;

	LOOP /* [�i�ڕʌ���]�̌J��Ԃ� */

		/* �J�[�\���e�d�s�b�g�i[�i�ڕʌ���]�j*/
		BEGIN
			FETCH curT_ITEM_COST INTO recT_ITEM_COST;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('5:FETCH curT_ITEM_COST'		||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE excERR_CURSOR;
		END;

		/* �I�_�܂œ��B�����ꍇ�A����I�������� */
		EXIT WHEN curT_ITEM_COST%NOTFOUND;

		/* �J�[�\���n�o�d�m�i[�݌ɕ]�����z]�j*/
		BEGIN
			OPEN curT_STOCK_VAL_H (
									recT_ITEM_COST.ITEM_CD
								  );
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('6:OPEN curT_STOCK_VAL_H'		||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE excERR_CURSOR;
		END;

		/* �J�[�\���e�d�s�b�g�i[�݌ɕ]�����z]�j*/
		BEGIN
			FETCH curT_STOCK_VAL_H INTO recT_STOCK_VAL_H;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('7:FETCH curT_STOCK_VAL_H' 	||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE excERR_CURSOR;
		END;

		/* [�݌ɕ]�����z]�̃f�[�^�����݂����ꍇ�A����[�i�ڕʌ���]�փX�L�b�v */
		IF curT_STOCK_VAL_H%NOTFOUND THEN

			/* �P�i�ޗ��� �Z�o */
			numOwnMatrCost := CEIL(recT_ITEM_COST.OWN_MATR_COST / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
			/* �P�i�ޗ���i�O���j�Z�o */
			numOwnSbcntMatrCost := CEIL(recT_ITEM_COST.OWN_SBCNT_MATR_COST / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
			/* ���H�����H��v �Z�o */
			numOwnProcCostSumAll := CEIL(recT_ITEM_COST.OWN_PROC_COST_SUM_ALL / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;

			/* �݌ɕ]�����z�E�������� */
			BEGIN
				INSERT INTO T_STOCK_VAL_H ( YEAR					   -- �N�x
										   ,HALF_TERM_TYP			   -- �����敪
										   ,COST_TYP				   -- �������
										   ,PLANT_CD				   -- �H��R�[�h
										   ,ITEM_CD 				   -- �i�ڔԍ�
										   ,OWN_MATR_COST			   -- �P�i�ޗ���
										   ,UNDER_MATR_COST 		   -- ���ʕi�ڐϏ�ޗ���
										   ,TOTAL_MATR_COST 		   -- �ޗ���v
										   ,OWN_SBCNT_MATR_COST 	   -- �P�i�ޗ���i�O���j
										   ,UNDER_SBCNT_MATR_COST	   -- ���ʕi�ڐϏ�ޗ���i�O���j
										   ,TOTAL_SBCNT_MATR_COST	   -- �ޗ���i�O���j���v
										   ,OWN_PROC_COST_SUM_ALL	   -- ���H�����H��v
										   ,UNDER_PROC_COST_SUM_ALL    -- ���ʕi�ڐϏ���H��v
										   ,TOTAL_PROC_COST_SUM_ALL    -- ���H��v
										   ,STOCK_UNIT				   -- �v�ʒP��
										   ,CREATED_DATE			   -- �쐬��
										   ,CREATED_BY				   -- �쐬��
										   ,CREATED_PRG_NM			   -- �쐬�v���O������
										   ,UPDATED_DATE			   -- �X�V��
										   ,UPDATED_BY				   -- �X�V��
										   ,UPDATED_PRG_NM			   -- �X�V�v���O������
										   ,MODIFY_COUNT			   -- �X�V��
				) VALUES (
											pnumYear				   -- �N�x
										   ,pnumHalfTermTyp 		   -- �����敪
										   ,pnumCostTyp 			   -- �������
										   ,pvc2PlantCd 			   -- �H��R�[�h
										   ,recT_ITEM_COST.ITEM_CD	   -- �i�ڔԍ�
										   ,numOwnMatrCost			   -- �P�i�ޗ���
										   ,recT_ITEM_COST.UNDER_MATR_COST
																	   -- ���ʕi�ڐϏ�ޗ���
										   ,numOwnMatrCost + recT_ITEM_COST.UNDER_MATR_COST * recT_ITEM_COST.ITEM_INPUT_RATIO
																	   -- �ޗ���v
										   ,numOwnSbcntMatrCost 	   -- �P�i�ޗ���i�O���j
										   ,recT_ITEM_COST.UNDER_SBCNT_MATR_COST
																	   -- ���ʕi�ڐϏ�ޗ���i�O���j
										   ,numOwnSbcntMatrCost + recT_ITEM_COST.UNDER_SBCNT_MATR_COST * recT_ITEM_COST.ITEM_INPUT_RATIO
																	   -- �ޗ���i�O���j���v
										   ,numOwnProcCostSumAll	   -- ���H�����H��v
										   ,recT_ITEM_COST.UNDER_PROC_COST_SUM_ALL
																	   -- ���ʕi�ڐϏ���H��v
										   ,numOwnProcCostSumAll + recT_ITEM_COST.UNDER_PROC_COST_SUM_ALL * recT_ITEM_COST.ITEM_INPUT_RATIO
																	   -- ���H��v
										   ,recT_ITEM_COST.STOCK_UNIT  -- �v�ʒP��
										   ,SYSDATE 				   -- �쐬��
										   ,pvc2UserId				   -- �쐬��
										   ,MY_SQL_NAME 			   -- �쐬�v���O������
										   ,SYSDATE 				   -- �X�V��
										   ,pvc2UserId				   -- �X�V��
										   ,MY_SQL_NAME 			   -- �X�V�v���O������
										   ,0						   -- �X�V��
				);

				-- �݌ɕ]�����z�������� �J�E���g�A�b�v
				numCntIntStockValH := numCntIntStockValH + 1;

			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('8:INSERT T_STOCK_VAL_H'  ||
										 ' YEAR='		   || '[ ' || pnumYear				  || ' ]' ||
										 ' HALF_TERM_TYP=' || '[ ' || pnumHalfTermTyp		  || ' ]' ||
										 ' COST_TYP='	   || '[ ' || pnumCostTyp			  || ' ]' ||
										 ' PLANT_CD='	   || '[ ' || pvc2PlantCd			  || ' ]' ||
										 ' ITEM_CD='	   || '[ ' || recT_ITEM_COST.ITEM_CD  || ' ]' ||
										 ' SQLCODE='	   || '[ ' || SQLCODE || ' ]' ||
										 ' SQLERRM='	   || '[ ' || SQLERRM || ' ]',1,256);
					RAISE excERR_CURSOR;
			END;

			/* �J�[�\���n�o�d�m�i[�i�ڕʉ��H��]�j*/
			BEGIN
				OPEN curT_ITEM_PROC_COST ( recT_ITEM_COST.YEAR
										  ,recT_ITEM_COST.HALF_TERM_TYP
										  ,recT_ITEM_COST.COST_TYP
										  ,recT_ITEM_COST.PLANT_CD
										  ,recT_ITEM_COST.ROOT_ITEM_CD
										  ,recT_ITEM_COST.PARENT_ITEM_CD
										  ,recT_ITEM_COST.ITEM_CD
										  ,recT_ITEM_COST.PS_EDITION
										  ,recT_ITEM_COST.COST_STATEMENT_NO
										 );
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('9:OPEN curT_ITEM_PROC_COST'	||
										 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
										 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE excERR_CURSOR;
			END;

			LOOP /* [�i�ڕʉ��H��]�̌J��Ԃ� */

				/* �J�[�\���e�d�s�b�g�i[�i�ڕʉ��H��]�j*/
				BEGIN
					FETCH curT_ITEM_PROC_COST INTO recT_ITEM_PROC_COST;
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('10:FETCH curT_ITEM_PROC_COST' ||
											 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
						RAISE excERR_CURSOR;
				END;

				/* �I�_�܂œ��B�����ꍇ�A����[�i�ڕʌ���]���R�[�h�փX�L�b�v */
				EXIT WHEN curT_ITEM_PROC_COST%NOTFOUND;

				/* ���H�����H��01 �Z�o */
				numOwnProcCost01 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_01 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��02 �Z�o */
				numOwnProcCost02 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_02 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��03 �Z�o */
				numOwnProcCost03 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_03 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��04 �Z�o */
				numOwnProcCost04 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_04 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��05 �Z�o */
				numOwnProcCost05 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_05 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��06 �Z�o */
				numOwnProcCost06 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_06 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��07 �Z�o */
				numOwnProcCost07 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_07 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��08 �Z�o */
				numOwnProcCost08 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_08 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��09 �Z�o */
				numOwnProcCost09 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_09 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��10 �Z�o */
				numOwnProcCost10 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_10 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��11 �Z�o */
				numOwnProcCost11 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_11 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* ���H�����H��12 �Z�o */
				numOwnProcCost12 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_12 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;

				/* �݌ɕ]�����z�E�������� */
				BEGIN
					INSERT INTO T_STOCK_VAL ( YEAR					 -- �N�x
											 ,HALF_TERM_TYP 		 -- �����敪
											 ,COST_TYP				 -- �������
											 ,PLANT_CD				 -- �H��R�[�h
											 ,ITEM_CD				 -- �i�ڔԍ�
											 ,PROC_COST_CLS_CD		 -- ���H��ރR�[�h
											 ,OWN_PROC_COST_01		 -- ���H�����H��01
											 ,OWN_PROC_COST_02		 -- ���H�����H��02
											 ,OWN_PROC_COST_03		 -- ���H�����H��03
											 ,OWN_PROC_COST_04		 -- ���H�����H��04
											 ,OWN_PROC_COST_05		 -- ���H�����H��05
											 ,OWN_PROC_COST_06		 -- ���H�����H��06
											 ,OWN_PROC_COST_07		 -- ���H�����H��07
											 ,OWN_PROC_COST_08		 -- ���H�����H��08
											 ,OWN_PROC_COST_09		 -- ���H�����H��09
											 ,OWN_PROC_COST_10		 -- ���H�����H��10
											 ,OWN_PROC_COST_11		 -- ���H�����H��11
											 ,OWN_PROC_COST_12		 -- ���H�����H��12
											 ,OWN_PROC_COST_SUM 	 -- ���H�����H��v
											 ,UNDER_PROC_COST_01	 -- ���ʕi�ڐϏ���H��01
											 ,UNDER_PROC_COST_02	 -- ���ʕi�ڐϏ���H��02
											 ,UNDER_PROC_COST_03	 -- ���ʕi�ڐϏ���H��03
											 ,UNDER_PROC_COST_04	 -- ���ʕi�ڐϏ���H��04
											 ,UNDER_PROC_COST_05	 -- ���ʕi�ڐϏ���H��05
											 ,UNDER_PROC_COST_06	 -- ���ʕi�ڐϏ���H��06
											 ,UNDER_PROC_COST_07	 -- ���ʕi�ڐϏ���H��07
											 ,UNDER_PROC_COST_08	 -- ���ʕi�ڐϏ���H��08
											 ,UNDER_PROC_COST_09	 -- ���ʕi�ڐϏ���H��09
											 ,UNDER_PROC_COST_10	 -- ���ʕi�ڐϏ���H��10
											 ,UNDER_PROC_COST_11	 -- ���ʕi�ڐϏ���H��11
											 ,UNDER_PROC_COST_12	 -- ���ʕi�ڐϏ���H��12
											 ,UNDER_PROC_COST_SUM	 -- ���ʕi�ڐϏ���H��v
											 ,CREATED_DATE			 -- �쐬��
											 ,CREATED_BY			 -- �쐬��
											 ,CREATED_PRG_NM		 -- �쐬�v���O������
											 ,UPDATED_DATE			 -- �X�V��
											 ,UPDATED_BY			 -- �X�V��
											 ,UPDATED_PRG_NM		 -- �X�V�v���O������
											 ,MODIFY_COUNT			 -- �X�V��
					) VALUES (
											  pnumYear				 -- �N�x
											 ,pnumHalfTermTyp		 -- �����敪
											 ,pnumCostTyp			 -- �������
											 ,pvc2PlantCd			 -- �H��R�[�h
											 ,recT_ITEM_COST.ITEM_CD
																	 -- �i�ڔԍ�
											 ,recT_ITEM_PROC_COST.PROC_COST_CLS_CD
																	 -- ���H��ރR�[�h
											 ,numOwnProcCost01		 -- ���H�����H��01
											 ,numOwnProcCost02		 -- ���H�����H��02
											 ,numOwnProcCost03		 -- ���H�����H��03
											 ,numOwnProcCost04		 -- ���H�����H��04
											 ,numOwnProcCost05		 -- ���H�����H��05
											 ,numOwnProcCost06		 -- ���H�����H��06
											 ,numOwnProcCost07		 -- ���H�����H��07
											 ,numOwnProcCost08		 -- ���H�����H��08
											 ,numOwnProcCost09		 -- ���H�����H��09
											 ,numOwnProcCost10		 -- ���H�����H��10
											 ,numOwnProcCost11		 -- ���H�����H��11
											 ,numOwnProcCost12		 -- ���H�����H��12
											 ,numOwnProcCost01 +
											  numOwnProcCost02 +
											  numOwnProcCost03 +
											  numOwnProcCost04 +
											  numOwnProcCost05 +
											  numOwnProcCost06 +
											  numOwnProcCost07 +
											  numOwnProcCost08 +
											  numOwnProcCost09 +
											  numOwnProcCost10 +
											  numOwnProcCost11 +
											  numOwnProcCost12		 -- ���H�����H��v
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_01
																	 -- ���ʕi�ڐϏ���H��01
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_02
																	 -- ���ʕi�ڐϏ���H��02
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_03
																	 -- ���ʕi�ڐϏ���H��03
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_04
																	 -- ���ʕi�ڐϏ���H��04
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_05
																	 -- ���ʕi�ڐϏ���H��05
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_06
																	 -- ���ʕi�ڐϏ���H��06
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_07
																	 -- ���ʕi�ڐϏ���H��07
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_08
																	 -- ���ʕi�ڐϏ���H��08
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_09
																	 -- ���ʕi�ڐϏ���H��09
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_10
																	 -- ���ʕi�ڐϏ���H��10
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_11
																	 -- ���ʕi�ڐϏ���H��11
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_12
																	 -- ���ʕi�ڐϏ���H��12
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_01 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_02 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_03 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_04 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_05 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_06 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_07 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_08 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_09 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_10 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_11 +
											  recT_ITEM_PROC_COST.UNDER_PROC_COST_12
																	 -- ���ʕi�ڐϏ���H��v
											 ,SYSDATE				 -- �쐬��
											 ,pvc2UserId			 -- �쐬��
											 ,MY_SQL_NAME			 -- �쐬�v���O������
											 ,SYSDATE				 -- �X�V��
											 ,pvc2UserId			 -- �X�V��
											 ,MY_SQL_NAME			 -- �X�V�v���O������
											 ,0 					 -- �X�V��
					);

					-- �݌ɕ]�����z���׏������� �J�E���g�A�b�v
					numCntIntStockVal := numCntIntStockVal + 1;

				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('11:INSERT T_STOCK_VAL'	  ||
											 ' YEAR='			  || '[ ' || pnumYear							  || ' ]' ||
											 ' HALF_TERM_TYP='	  || '[ ' || pnumHalfTermTyp					  || ' ]' ||
											 ' COST_TYP='		  || '[ ' || pnumCostTyp						  || ' ]' ||
											 ' PLANT_CD='		  || '[ ' || pvc2PlantCd						  || ' ]' ||
											 ' ITEM_CD='		  || '[ ' || recT_ITEM_COST.ITEM_CD 			  || ' ]' ||
											 ' PROC_COST_CLS_CD=' || '[ ' || recT_ITEM_PROC_COST.PROC_COST_CLS_CD || ' ]' ||
											 ' SQLCODE='		  || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM='		  || '[ ' || SQLERRM || ' ]',1,256);
						RAISE excERR_CURSOR;
				END;

			END LOOP; /* [�i�ڕʉ��H��]�̌J��Ԃ� */

			/* �J�[�\���b�k�n�r�d�i[�i�ڕʉ��H��]�j*/
			IF curT_ITEM_PROC_COST%ISOPEN = TRUE THEN
				CLOSE curT_ITEM_PROC_COST;
			END IF;

		END IF;

		/* �J�[�\���b�k�n�r�d�i[�݌ɕ]�����z]�j*/
		IF curT_STOCK_VAL_H%ISOPEN = TRUE THEN
			CLOSE curT_STOCK_VAL_H;
		END IF;

	END LOOP; /* [�i�ڕʌ���]�̌J��Ԃ� */

	/* �J�[�\���b�k�n�r�d�i[�i�ڕʌ���]�j*/
	IF curT_ITEM_COST%ISOPEN = TRUE THEN
		CLOSE curT_ITEM_COST;
	END IF;

/*��������������������������������������������������������������������������������������������������������
' �I������
����������������������������������������������������������������������������������������������������������*/

	/* �I�����b�Z�[�W�̏o�� */
	vc2Comment := SUBSTR('(SBM0559)�݌ɕ]�����z��������='	  || '[ ' || numCntIntStockValH || ' ]' ||
						 ' �݌ɕ]�����z���׏�������=' || '[ ' || numCntIntStockVal	|| ' ]',1,256);

	/* �I�����b�Z�[�W�̏o�� */
	blnRet			:= FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
								 pvc2UserId, pvc2BusinessName,
								 pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
								 vc2Comment);

	COMMIT;

	/* �g���[�X���O�̏o��(�I��) */
	blnRet			:= FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
								   pvc2UserId,pvc2BusinessName,
								   pvc2PlantCd, MY_SQL_NAME, METHOD_END);

	COMMIT;

	/* LogFile �� CLOSE */
	blnRet	:= FNCLOGCLOSE(UTL_FileHandle);

	/* �������� */
	pnumReturn := STATUS_NORMAL;	--�G���[������0�̏ꍇ�A1:����I��

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

		/* �J�[�\���b�k�n�r�d�i[�i�ڕʌ���]�j*/
		IF curT_ITEM_COST%ISOPEN = TRUE THEN
			CLOSE curT_ITEM_COST;
		END IF;
		/* �J�[�\���b�k�n�r�d�i[�݌ɕ]�����z]�j*/
		IF curT_STOCK_VAL_H%ISOPEN = TRUE THEN
			CLOSE curT_STOCK_VAL_H;
		END IF;
		/* �J�[�\���b�k�n�r�d�i[�i�ڕʉ��H��]�j*/
		IF curT_ITEM_PROC_COST%ISOPEN = TRUE THEN
			CLOSE curT_ITEM_PROC_COST;
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

	WHEN OTHERS  THEN	/* ���̑��̃G���[ */

		/* �J�[�\���b�k�n�r�d�i[�i�ڕʌ���]�j*/
		IF curT_ITEM_COST%ISOPEN = TRUE THEN
			CLOSE curT_ITEM_COST;
		END IF;
		/* �J�[�\���b�k�n�r�d�i[�݌ɕ]�����z]�j*/
		IF curT_STOCK_VAL_H%ISOPEN = TRUE THEN
			CLOSE curT_STOCK_VAL_H;
		END IF;
		/* �J�[�\���b�k�n�r�d�i[�i�ڕʉ��H��]�j*/
		IF curT_ITEM_PROC_COST%ISOPEN = TRUE THEN
			CLOSE curT_ITEM_PROC_COST;
		END IF;

		ROLLBACK;

		/* �I�����b�Z�[�W�̏o�� */
		vc2Comment		:= SUBSTR('PGNAME=' || '[ ' || MY_SQL_NAME || ' ]' ||
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
