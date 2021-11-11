CREATE OR REPLACE procedure 	 SQLSTDITEMPSWORKENTRY(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlStdItemPSWorkEntry.sql,v $
'$Author: suganuma $
'$Revision: 1.11 $ $Date: 2013/07/02 10:41:29 $
'						 2005.10.24 unicode�Ή��ivarchar2��4�{�j
'
'
' �@�\		: �W�������\���i���[�N�쐬����
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
' �@�\����	: [�i��]�A[���i�\��]����ɁA�W�������v�Z�p��[�\���i���[�N]�̍쐬���s���B
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
	MY_SQL_NAME 			VARCHAR2(120) := 'SQLSTDITEMPSWORKENTRY'; --�o�k�^�r�p�k��

	APS_COM_BATCH_START 	VARCHAR2(28) := 'DC01201';
	APS_COM_BATCH_END		VARCHAR2(28) := 'DC01202';
	APS_COM_BATCH_EXP		VARCHAR2(28) := 'DC01203';

	LOGMSG_START_PGNM		VARCHAR2(200) := '(SBM0539)�W�������\���i���[�N�쐬�������J�n���܂���';
	LOGMSG_END_PGNM 		VARCHAR2(200) := '�W�������\���i���[�N�쐬�������I�����܂���';
	LOGMSG_EXP_PGNM 		VARCHAR2(200) := '�W�������\���i���[�N�쐬�������ُ�I�����܂���';

	STATUS_NORMAL			NUMBER		  := 1; 		 -- ����I��
	STATUS_WARNING			NUMBER		  := 2; 		 -- �x���I��
	STATUS_ERROR			NUMBER		  := 3; 		 -- �ُ�I��

	UPPER_ITEM_CD			VARCHAR2(4) := '*';   --�擪�i�R�[�h

	/* �ϐ��̒�` */
	UTL_FileHandle			UTL_FILE.FILE_TYPE; 	--�t�@�C���n���h��

	numCountInput			NUMBER(11)	 := 0;			 --�Ώۃf�[�^����
	numCountInput2			NUMBER(11)	 := 0;			 --�Ώۃf�[�^����
	numCountInsert			NUMBER(11)	 := 0;			 --����f�[�^����
	numCountUpdate			NUMBER(11)	 := 0;			 --����f�[�^����
	numCountError			NUMBER(11)	 := 0;			 --�ُ�f�[�^����
	numCountDummy			NUMBER(11)	 := 0;			 --�����`�F�b�N�p
	numUpLevelNo			NUMBER(6)	 := 0;			 --UP_LEVEL_NO
	blnRet					BOOLEAN;		--���ʊ֐��̖ߒl
	blnUpdatInsert			BOOLEAN;		--�X�V����
	vc2Comment				VARCHAR2(1024);  --���b�Z�[�W�쐬�p
	numStartMonth			SYS_COST_CTRL.START_MONTH%TYPE; 	  --�N�x�J�n��
	vc2PhaseStartMonth		VARCHAR2(24);			--�w�蔼���̊���
	vc2PhaseEndMonth		VARCHAR2(24);			--�w�蔼���̊�����
	datPhaseStartDay		DATE;				   --�w�蔼���̊����
	datPhaseEndDay			DATE;				   --�w�蔼���̊�����
	datBusinessOprDate      DATE;                  --�Ɩ��^�p��

	/* ��O�����p�ϐ� */
	excNORMAL_SKIP	 EXCEPTION; 	 --���s�s��
	excERR_CUR		 EXCEPTION; 	 --�J�[�\��OPEN����EXCEPTION

	/* �J�[�\���̐錾  ���[�i*/
	CURSOR curLOWER_ITEM
	IS
	  SELECT
		M1.PARENT_ITEM_CD
	   ,M1.COMP_ITEM_CD
	   ,M1.PS_EDITION
	   ,M1.EFF_PHASE_IN_DATE
	   ,M1.EFF_PHASE_OUT_DATE
	   ,M1.PS_UNIT_DENOMINATOR
	   ,M1.PS_UNIT_NUMERATOR
	   ,M1.PS_SPOIL
	   ,DECODE(T1.MRP_ODR_TYP,8,1,0) AS DMY_ITEM_FLG
	   ,DECODE(T1.SPL_ITEM_TYP,2,1,0) AS VOLUNT_SPL_FLG
	   ,T1.OUTSIDE_TYP
	   ,T1.ITEM_SPOIL
	   ,M1.COST_UP_TYP
--		FROM  M_ITEM T1,V_CS_PS M1
--	  WHERE  T1.ITEM_CD NOT IN (SELECT UNIQUE(PARENT_ITEM_CD) FROM V_CS_PS)  --���[�i�����i�\��M�̐e������
--		AND  T1.ITEM_CD = M1.COMP_ITEM_CD;
	  FROM	M_ITEM T1,
			(SELECT		
			   T.PARENT_ITEM_CD,
			   T.COMP_ITEM_CD,
			   T.PS_EDITION,
			   T.PS_UNIT_DENOMINATOR,
			   T.PS_UNIT_NUMERATOR,
			   T.EFF_PHASE_IN_DATE,
			   T.EFF_PHASE_OUT_DATE,
			   T.PS_SPOIL,
			   T.COST_UP_TYP
			 FROM	
			  (SELECT
			      PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR,
			      EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_SPOIL,COST_UP_TYP,
			      RANK() OVER(PARTITION BY PARENT_ITEM_CD,COMP_ITEM_CD ORDER BY PS_EDITION DESC) AS  RANK_PS_EDITION
			   FROM M_PS
			   WHERE NOT(EFF_PHASE_IN_DATE > datPhaseEndDay OR EFF_PHASE_OUT_DATE < datPhaseStartDay)   -- �����v�Z�Ώۊ��ԓ�
			  ) T  --���i�\���Ő����ő�̐��i�\���l
			WHERE  T.RANK_PS_EDITION=1) M1,
			(SELECT
			   UNIQUE(PARENT_ITEM_CD) AS PARENT_ITEM_CD
			 FROM
			   (SELECT
			        PARENT_ITEM_CD,
			        RANK() OVER(PARTITION BY PARENT_ITEM_CD,COMP_ITEM_CD ORDER BY PS_EDITION DESC) AS  RANK_PS_EDITION
			     FROM M_PS
			     WHERE NOT(EFF_PHASE_IN_DATE > datPhaseEndDay OR EFF_PHASE_OUT_DATE < datPhaseStartDay)   -- �����v�Z�Ώۊ��ԓ�
			    ) T  --���i�\���Ő����ő�̐��i�\���l
			 WHERE  T.RANK_PS_EDITION=1) M2
	  WHERE  T1.ITEM_CD = M2.PARENT_ITEM_CD(+)
		AND  M2.PARENT_ITEM_CD IS NULL
		AND  T1.ITEM_CD = M1.COMP_ITEM_CD
--		AND  T1.ITEM_CD IN ('PP-DR-CHERY')
;

	recLOWER_ITEM curLOWER_ITEM%ROWTYPE;

	/* �J�[�\���̐錾  ���ԕi�`�ŏ�ʕi��*/
	CURSOR curUPPER_ITEM(
		 cnumUpLevelNo NUMBER
	)
	IS
	  SELECT
		PARENT.PARENT_ITEM_CD
	   ,COMP.PARENT_ITEM_CD 		  AS COMP_ITEM_CD
	   ,PARENT.PS_EDITION
	   ,PARENT.EFF_PHASE_IN_DATE
	   ,PARENT.EFF_PHASE_OUT_DATE
	   ,PARENT.PS_UNIT_DENOMINATOR
	   ,PARENT.PS_UNIT_NUMERATOR
	   ,PARENT.PS_SPOIL
	   ,DECODE(M1.MRP_ODR_TYP,8,1,0)  AS DMY_ITEM_FLG
	   ,DECODE(M1.SPL_ITEM_TYP,2,1,0) AS VOLUNT_SPL_FLG
	   ,M1.OUTSIDE_TYP
	   ,M1.ITEM_SPOIL
	   ,PARENT.COST_UP_TYP
	  FROM M_ITEM M1, 
		 (SELECT
            T.PARENT_ITEM_CD,
            T.COMP_ITEM_CD,
            T.PS_EDITION,
            T.PS_UNIT_DENOMINATOR,
            T.PS_UNIT_NUMERATOR,
            T.EFF_PHASE_IN_DATE,
            T.EFF_PHASE_OUT_DATE,
            T.PS_SPOIL,
            T.COST_UP_TYP
          FROM	
            (SELECT
                PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR,
                EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_SPOIL,COST_UP_TYP,
                RANK() OVER(PARTITION BY PARENT_ITEM_CD,COMP_ITEM_CD ORDER BY PS_EDITION DESC) AS  RANK_PS_EDITION
             FROM M_PS
             WHERE NOT(EFF_PHASE_IN_DATE > datPhaseEndDay OR EFF_PHASE_OUT_DATE < datPhaseStartDay)   -- �����v�Z�Ώۊ��ԓ�
            ) T  --���i�\���Ő����ő�̐��i�\���l
          WHERE  T.RANK_PS_EDITION=1) PARENT,
		 (SELECT PARENT_ITEM_CD
			 FROM T_CS_PS_T
			 WHERE PLANT_CD = pvc2PlantCd
			   AND UP_LEVEL_NO = cnumUpLevelNo
			   AND UPPER_ITEM_FLG = 0) COMP
	  WHERE COMP.PARENT_ITEM_CD = PARENT.COMP_ITEM_CD(+)
		AND COMP.PARENT_ITEM_CD = M1.ITEM_CD
	  ;
	recUPPER_ITEM curUPPER_ITEM%ROWTYPE;

	/* �J�[�\���̐錾  �P�i*/
	CURSOR curSINGLE_ITEM(
		cvc2PlantCd VARCHAR2 --�H��R�[�h
	)
	IS
	  SELECT
		T1.ITEM_CD
	   ,DECODE(T1.MRP_ODR_TYP,8,1,0) AS DMY_ITEM_FLG
	   ,DECODE(T1.SPL_ITEM_TYP,2,1,0) AS VOLUNT_SPL_FLG
	   ,T1.OUTSIDE_TYP
	   ,T1.ITEM_SPOIL
	  FROM	M_ITEM T1
	  WHERE NOT EXISTS(	SELECT
							T2.ROWID
						FROM
							T_CS_PS_T T2
						WHERE
							T2.PLANT_CD = cvc2PlantCd
						AND	T2.COMP_ITEM_CD = T1.ITEM_CD
		)
	;

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
	numCountInput := 0; 			   --�Ώۃf�[�^����
	numCountInsert:= 0; 			   --����f�[�^����
	numCountUpdate:= 0;
	numCountError := 0; 			   --�ُ�f�[�^����

	/* ���s�ۂ̔��� */
	SELECT COUNT(*)  INTO  numCountDummy
		FROM	 T_CS_PS_T
		WHERE	 PLANT_CD  =  pvc2PlantCd
		  AND	 ROWNUM    =  1;
	IF	numCountDummy  >  0  THEN
		RAISE	excNORMAL_SKIP;
	END IF;

	/*	�Ώ۔N�x/�����敪/�N�x�J�n�����A�w�蔼���̊���/���������擾 */
	BEGIN  /* �����Ǘ��p�����[�^�̓Ǎ� */
		SELECT	START_MONTH
		  INTO	numStartMonth
		  FROM	SYS_COST_CTRL
		  WHERE  PLANT_CD  =  pvc2PlantCd;
	EXCEPTION
		WHEN OTHERS THEN
			RAISE  excNORMAL_SKIP;
	END;  /* �����Ǘ��p�����[�^�̓Ǎ� */

	vc2PhaseStartMonth :=  TO_CHAR(pnumYear + FLOOR((numStartMonth	-1+((pnumHalfTermTyp-1)*6))/12) ||
								   LPAD(MOD((numStartMonth	-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
								  );
	datPhaseStartDay   :=  TO_DATE(vc2PhaseStartMonth||'01','YYYYMMDD');
	vc2PhaseEndMonth   :=  TO_CHAR(pnumYear + FLOOR((numStartMonth+5-1+((pnumHalfTermTyp-1)*6))/12) ||
								   LPAD(MOD((numStartMonth+5-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
								  );
	datPhaseEndDay	   :=  LAST_DAY(TO_DATE(vc2PhaseEndMonth,'YYYYMM'));
	
	/** �Ɩ��^�p���̎擾 */
	BEGIN  /* �Ɩ��^�p���̓Ǎ� */ 
        SELECT BUSINESS_OPR_DATE INTO datBusinessOprDate
          FROM SYS_DATE_CTRL
         WHERE PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('1:�Ɩ��^�p���̎擾�Ɏ��s���܂����B'  ||
                                 ' USER_CD='  || '[ ' || pvc2UserId  || ' ]' ||
                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
            RAISE  excERR_CUR;
    END;  /* �Ɩ��^�p���̓Ǎ� */ 


/*��������������������������������������������������������������������������������������������������������
' ���C������(���[�i)
����������������������������������������������������������������������������������������������������������*/

	BEGIN  /* �J�[�\��OPEN(���[�i) */
		OPEN  curLOWER_ITEM;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment	:= SUBSTR('1:OPEN curLOWER_ITEM'  ||
								  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE	 excERR_CUR;
	END;  /* �J�[�\��OPEN(���[�i) */

	LOOP  /* ���[�i�̌J��Ԃ�*/

		BEGIN  /* �J�[�\��FETCH�i���[�i�j */
			FETCH  curLOWER_ITEM  INTO	recLOWER_ITEM;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('2:FETCH curLOWER_ITEM'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE  excERR_CUR;
		END;  /* �J�[�\��FETCH�i���[�i�j */

		EXIT WHEN  curLOWER_ITEM%NOTFOUND;

		numCountInput := numCountInput+1;

		IF	recLOWER_ITEM.PS_UNIT_DENOMINATOR = 0 THEN
			vc2Comment		:= SUBSTR('3:PS_UNIT_DENOMINATOR=0'  ||
									  ' PARENT_ITEM_CD=' || '[ ' || recLOWER_ITEM.PARENT_ITEM_CD || ' ]' ||
									  ' COMP_ITEM_CD=' || '[ ' || recLOWER_ITEM.COMP_ITEM_CD || ' ]',1,256);
			RAISE excERR_CUR;
		END IF;

		BEGIN  /* �\���i���[�N�E�������� */
			INSERT	INTO  T_CS_PS_T (
				PLANT_CD,PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION
			   ,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE
			   ,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR
			   ,PS_SPOIL,NECESSARY_QTY,OUTSIDE_TYP
			   ,ITEM_SPOIL,DMY_ITEM_FLG,VOLUNT_SPL_FLG
			   ,COST_UP_TYP,UP_LEVEL_NO
			   ,UPPER_ITEM_FLG,LOWER_ITEM_FLG,COST_ACCOUNT_CMPLT_FLG
			   ,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
			   ,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
			   ,MODIFY_COUNT
			) VALUES (
				pvc2PlantCd
			   ,recLOWER_ITEM.PARENT_ITEM_CD
			   ,recLOWER_ITEM.COMP_ITEM_CD
			   ,recLOWER_ITEM.PS_EDITION
			   ,recLOWER_ITEM.EFF_PHASE_IN_DATE
			   ,recLOWER_ITEM.EFF_PHASE_OUT_DATE
			   ,recLOWER_ITEM.PS_UNIT_DENOMINATOR
			   ,recLOWER_ITEM.PS_UNIT_NUMERATOR
			   ,recLOWER_ITEM.PS_SPOIL
			   ,CEIL(recLOWER_ITEM.PS_UNIT_NUMERATOR
					 * (1+recLOWER_ITEM.PS_SPOIL/100)/recLOWER_ITEM.PS_UNIT_DENOMINATOR * POWER(10,4)
					) / POWER(10,4)
			   ,recLOWER_ITEM.OUTSIDE_TYP
			   ,recLOWER_ITEM.ITEM_SPOIL
			   ,recLOWER_ITEM.DMY_ITEM_FLG
			   ,recLOWER_ITEM.VOLUNT_SPL_FLG
			   ,recLOWER_ITEM.COST_UP_TYP
			   ,1  --  ��P���x��
			   ,0
			   ,1  --  ���[�i
			   ,0
			   ,SYSDATE,pvc2UserId,MY_SQL_NAME
			   ,SYSDATE,pvc2UserId,MY_SQL_NAME
			   ,0
			);

			numCountInsert := numCountInsert+1;

		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment		:= SUBSTR('4:INSERT  T_CS_PS_T'  ||
										  ' PARENT_ITEM_CD=' || '[ ' || recLOWER_ITEM.PARENT_ITEM_CD || ' ]' ||
										  ' COMP_ITEM_CD='	 || '[ ' || recLOWER_ITEM.COMP_ITEM_CD	 || ' ]' ||
										  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
										  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE excERR_CUR;
		END;  /* �\���i���[�N�E�������� */

	END LOOP;  /* ���[�i�̌J��Ԃ�*/

	COMMIT;  /* �� */

	CLOSE curLOWER_ITEM;

/*��������������������������������������������������������������������������������������������������������
' ���C������(���ԕi�`�ŏ�ʕi��)
����������������������������������������������������������������������������������������������������������*/

	FOR i IN 1..999999 LOOP  /* T_�\���i�̐Ϗ�K�w���x�����A1,2,3�cn�@��,�Y�����x���������Ȃ�܂ŌJ��Ԃ��B*/

		/* PUT_LINE */
		blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
					  pvc2PlantCd, MY_SQL_NAME, 'MAIN-LOOP UP_LEVEL_NO='||i);
		/* PUT_LINE */

		BEGIN  /* �J�[�\��OPEN�i���ԕi�`�ŏ�ʕi�ځj */
			OPEN	curUPPER_ITEM(i);
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('5:OPEN curUPPER_ITEM'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE	 excERR_CUR;
		END;  /* �J�[�\��OPEN�i���ԕi�`�ŏ�ʕi�ځj */

		numCountInput2 := 0;  /* 1���x�����Ώۃf�[�^���� */

		LOOP  /* 1���x�����̌J��Ԃ� */

			BEGIN  /* �J�[�\��FETCH�i���ԕi�`�ŏ�ʕi�ځj */
				FETCH  curUPPER_ITEM  INTO	recUPPER_ITEM;
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment		:= SUBSTR('6:FETCH curUPPER_ITEM'  ||
											  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE  excERR_CUR;
			END;  /* �J�[�\��FETCH�i���ԕi�`�ŏ�ʕi�ځj */

			EXIT WHEN  curUPPER_ITEM%NOTFOUND;

			numCountInput  := numCountInput  + 1;
			numCountInput2 := numCountInput2 + 1; /* 1���x�����Ώۃf�[�^���� */

			IF	recUPPER_ITEM.PS_UNIT_DENOMINATOR = 0 THEN
				vc2Comment		:= SUBSTR('7:PS_UNIT_DENOMINATOR=0'  ||
										  ' PARENT_ITEM_CD=' || '[ ' || recUPPER_ITEM.PARENT_ITEM_CD || ' ]' ||
										  ' COMP_ITEM_CD=' || '[ ' || recUPPER_ITEM.COMP_ITEM_CD || ' ]',1,256);
				RAISE excERR_CUR;
			END IF;

			IF	recUPPER_ITEM.PARENT_ITEM_CD IS NULL THEN  /* [�ŏ�ʕi��]���� */

				BEGIN  /* �\�����[�N�E�X�V���� */
					SELECT UP_LEVEL_NO	INTO  numUpLevelNo
						FROM	 T_CS_PS_T
						WHERE	 PLANT_CD		=  pvc2PlantCd
						  AND	 PARENT_ITEM_CD =  UPPER_ITEM_CD
						  AND	 COMP_ITEM_CD	=  recUPPER_ITEM.COMP_ITEM_CD
						  AND	 PS_EDITION 	=  1
					;
					blnUpdatInsert := TRUE;
				EXCEPTION
					 WHEN OTHERS THEN
						 blnUpdatInsert := FALSE;
				END;  /* �\�����[�N�E�X�V���� */

				IF	blnUpdatInsert =  TRUE	THEN  /* ���ʕi�ڂ́A�K�w���x���́A�������傫������D�悷�� */
					IF	numUpLevelNo  <=  i + 1 THEN
						BEGIN  /* �\�����[�N�E�X�V(UPDATE) */
							UPDATE	T_CS_PS_T  SET
								 UP_LEVEL_NO = i + 1
								,MODIFY_COUNT=MODIFY_COUNT+1
							  WHERE  PLANT_CD		=  pvc2PlantCd
								AND  PARENT_ITEM_CD =  UPPER_ITEM_CD
								AND  COMP_ITEM_CD	=  recUPPER_ITEM.COMP_ITEM_CD
								AND  PS_EDITION 	=  1
							 ;

							 numCountUpdate := numCountUpdate+1;

						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment := SUBSTR('8:UPDATE T_CS_PS_T'  ||
													 ' PARENT_ITEM_CD=' || '[ ' || UPPER_ITEM_CD || ' ]' ||
													 ' COMP_ITEM_CD='	|| '[ ' || recUPPER_ITEM.COMP_ITEM_CD	|| ' ]' ||
													 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE excERR_CUR;
						END;  /* �\�����[�N�E�X�V(UPDATE) */
					END IF;

				ELSE  /* ���ʕi�ڂ́A�K�w���x���́A�������傫������D�悷�� */

					BEGIN  /* �\�����[�N�E�X�V(INSERT) */
						INSERT	INTO  T_CS_PS_T (
							 PLANT_CD,PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION
							,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE
							,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR
							,PS_SPOIL,NECESSARY_QTY,OUTSIDE_TYP
							,ITEM_SPOIL,DMY_ITEM_FLG,VOLUNT_SPL_FLG
							,COST_UP_TYP,UP_LEVEL_NO
							,UPPER_ITEM_FLG,LOWER_ITEM_FLG,COST_ACCOUNT_CMPLT_FLG
							,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
							,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
							,MODIFY_COUNT
						) VALUES (
							 pvc2PlantCd
							,UPPER_ITEM_CD
							,recUPPER_ITEM.COMP_ITEM_CD
							,1
							,datPhaseStartDay
							,datPhaseEnDDay
							,1
							,1
							,0
							,1
							,recUPPER_ITEM.OUTSIDE_TYP
							,recUPPER_ITEM.ITEM_SPOIL
							,recUPPER_ITEM.DMY_ITEM_FLG
							,recUPPER_ITEM.VOLUNT_SPL_FLG
							,1
							,i + 1
							,1	--	�擪�i
							,0
							,0
							,SYSDATE,pvc2UserId,MY_SQL_NAME
							,SYSDATE,pvc2UserId,MY_SQL_NAME
							,0
						);
						numCountInsert := numCountInsert+1;
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('9:INSERT T_CS_PS_T'  ||
												 ' PARENT_ITEM_CD=' || '[ ' || UPPER_ITEM_CD || ' ]' ||
												 ' COMP_ITEM_CD='	|| '[ ' || recUPPER_ITEM.COMP_ITEM_CD	|| ' ]' ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE excERR_CUR;
					END;  /* �\�����[�N�E�X�V(INSERT) */
				END IF;  /* ���ʕi�ڂ́A�K�w���x���́A�������傫������D�悷�� */

			ELSE  /* [�ŏ�ʕi��]���� */

				BEGIN  /* �\�����[�N�E�X�V���� */
					 SELECT UP_LEVEL_NO  INTO  numUpLevelNo
						FROM	 T_CS_PS_T
						WHERE	 PLANT_CD		=  pvc2PlantCd
						  AND	 PARENT_ITEM_CD =  recUPPER_ITEM.PARENT_ITEM_CD
						  AND	 COMP_ITEM_CD	=  recUPPER_ITEM.COMP_ITEM_CD
						  AND	 PS_EDITION 	=  recUPPER_ITEM.PS_EDITION
					;
					blnUpdatInsert := TRUE;
				EXCEPTION
					 WHEN OTHERS THEN
						 blnUpdatInsert := FALSE;
				END;  /* �\�����[�N�E�X�V���� */

				IF	blnUpdatInsert = TRUE  THEN  /* ���ʕi�ڂ́A�K�w���x���́A�������傫������D�悷�� */

					IF	numUpLevelNo  <=  i + 1 THEN
						BEGIN  /* �\�����[�N�E�X�V(UPDATE) */
							UPDATE	T_CS_PS_T  SET
									UP_LEVEL_NO = i + 1
								   ,MODIFY_COUNT=MODIFY_COUNT+1
							WHERE	 PLANT_CD		=  pvc2PlantCd
							  AND	 PARENT_ITEM_CD =  recUPPER_ITEM.PARENT_ITEM_CD
							  AND	 COMP_ITEM_CD	=  recUPPER_ITEM.COMP_ITEM_CD
							  AND	 PS_EDITION 	=  recUPPER_ITEM.PS_EDITION
							;

							numCountUpdate := numCountUpdate+1;

						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment := SUBSTR('10:UPDATE T_CS_PS_T'	||
													 ' PARENT_ITEM_CD=' || '[ ' || recUPPER_ITEM.PARENT_ITEM_CD || ' ]' ||
													 ' COMP_ITEM_CD='	|| '[ ' || recUPPER_ITEM.COMP_ITEM_CD	|| ' ]' ||
													 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE excERR_CUR;
						END;  /* �\�����[�N�E�X�V(UPDATE) */
					END IF;

				ELSE  /* ���ʕi�ڂ́A�K�w���x���́A�������傫������D�悷�� */

					BEGIN  /* �\�����[�N�E�X�V(INSERT) */
						INSERT	INTO  T_CS_PS_T (
							 PLANT_CD,PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION
							,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE
							,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR
							,PS_SPOIL,NECESSARY_QTY,OUTSIDE_TYP
							,ITEM_SPOIL,DMY_ITEM_FLG,VOLUNT_SPL_FLG
							,COST_UP_TYP,UP_LEVEL_NO
							,UPPER_ITEM_FLG,LOWER_ITEM_FLG,COST_ACCOUNT_CMPLT_FLG
							,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
							,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
							,MODIFY_COUNT
						) VALUES (
							 pvc2PlantCd
							,recUPPER_ITEM.PARENT_ITEM_CD
							,recUPPER_ITEM.COMP_ITEM_CD
							,recUPPER_ITEM.PS_EDITION
							,recUPPER_ITEM.EFF_PHASE_IN_DATE
							,recUPPER_ITEM.EFF_PHASE_OUT_DATE
							,recUPPER_ITEM.PS_UNIT_DENOMINATOR
							,recUPPER_ITEM.PS_UNIT_NUMERATOR
							,recUPPER_ITEM.PS_SPOIL
							,CEIL(recUPPER_ITEM.PS_UNIT_NUMERATOR
								  * (1+recUPPER_ITEM.PS_SPOIL/100)/recUPPER_ITEM.PS_UNIT_DENOMINATOR * POWER(10,4)
								 ) / POWER(10,4)
							,recUPPER_ITEM.OUTSIDE_TYP
							,recUPPER_ITEM.ITEM_SPOIL
							,recUPPER_ITEM.DMY_ITEM_FLG
							,recUPPER_ITEM.VOLUNT_SPL_FLG
							,recUPPER_ITEM.COST_UP_TYP
							,i + 1
							,0
							,0
							,0
							,SYSDATE,pvc2UserId,MY_SQL_NAME
							,SYSDATE,pvc2UserId,MY_SQL_NAME
							,0
						);

						numCountInsert := numCountInsert+1;

					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('11:INSERT T_CS_PS_T'	||
												 ' PARENT_ITEM_CD=' || '[ ' || recUPPER_ITEM.PARENT_ITEM_CD || ' ]' ||
												 ' COMP_ITEM_CD='	|| '[ ' || recUPPER_ITEM.COMP_ITEM_CD	|| ' ]' ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE excERR_CUR;
					END;  /* �\�����[�N�E�X�V(INSERT) */

				END IF;  /* ���ʕi�ڂ́A�K�w���x���́A�������傫������D�悷�� */

			END IF;  /* [�ŏ�ʕi��]���� */

		END LOOP;  /* 1���x�����̌J��Ԃ� */

		COMMIT;  /* �� */

		CLOSE curUPPER_ITEM;

		/* �Y�����x���������Ȃ�ƁA�J��Ԃ��𔲂���B*/
		IF	numCountInput2 = 0 THEN
			EXIT;
		END IF;

	END LOOP;  /* T_�\���i�̐Ϗ�K�w���x�����A1,2,3�cn�@��,�Y�����x���������Ȃ�܂ŌJ��Ԃ��B*/

/*��������������������������������������������������������������������������������������������������������
' ���C������(�P�i)
����������������������������������������������������������������������������������������������������������*/

	/* [�\�����[�N]�ɑ��݂��Ȃ�[�i��]�������Ǎ� */
	FOR recSINGLE_ITEM IN curSINGLE_ITEM(
		pvc2PlantCd
	)LOOP

		BEGIN  /* �\�����[�N�E�X�V(INSERT) */
			INSERT	INTO  T_CS_PS_T (
				 PLANT_CD,PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION
				,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE
				,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR
				,PS_SPOIL,NECESSARY_QTY,OUTSIDE_TYP
				,ITEM_SPOIL,DMY_ITEM_FLG,VOLUNT_SPL_FLG
				,COST_UP_TYP,UP_LEVEL_NO
				,UPPER_ITEM_FLG,LOWER_ITEM_FLG,COST_ACCOUNT_CMPLT_FLG
				,CREATED_DATE,CREATED_BY,CREATED_PRG_NM
				,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM
				,MODIFY_COUNT
			) VALUES (
				 pvc2PlantCd						--�����̏����ΏۍH��R�[�h
				,UPPER_ITEM_CD						--�g*�h
				,recSINGLE_ITEM.ITEM_CD 			--[�i��]�i�ڔԍ�
				,1									--�P
				,datPhaseStartDay					--�Ώ۔N�x�E�����敪�̏���
				,datPhaseEnDDay 					--�Ώ۔N�x�E�����敪�̖���
				,1									--1
				,1									--1
				,0									--0
				,1									--1
				,recSINGLE_ITEM.OUTSIDE_TYP 		--[�i��]�i�ړ��O��敪
				,recSINGLE_ITEM.ITEM_SPOIL			--[�i��]�i�ڎd����
				,recSINGLE_ITEM.DMY_ITEM_FLG		--[�i��]�i�ڎ�z�敪���W�i�[���i�ځj�̏ꍇ�A�P���Z�b�g��L�ȊO�̏ꍇ�A�O
				,recSINGLE_ITEM.VOLUNT_SPL_FLG		--[�i��]�󋋕i�敪���Q�i�����󋋕i�j�̏ꍇ�A�P���Z�b�g
				,1									--�P
				,1									--�P
				,1									--1�i�擪�i�j
				,1									--�P�i���[�i�j
				,0									--�O
				,SYSDATE,pvc2UserId,MY_SQL_NAME
				,SYSDATE,pvc2UserId,MY_SQL_NAME
				,0
			);
			numCountInsert := numCountInsert+1;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('12:INSERT T_CS_PS_T'	||
									 ' PARENT_ITEM_CD=' || '[ ' || UPPER_ITEM_CD || ' ]' ||
									 ' COMP_ITEM_CD='	|| '[ ' || recSINGLE_ITEM.ITEM_CD	|| ' ]' ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE excERR_CUR;
		END;  /* �\�����[�N�E�X�V(INSERT) */

	END LOOP;

	/* ���� �� �Ɩ��^�p�� ���@�Z�o���ꂽ�������̏ꍇ�A�Ɩ��^�p�����L�������̐��i�\���O�̍\�����폜 */
	IF datPhaseStartDay <= datBusinessOprDate AND datPhaseEnDDay >= datBusinessOprDate THEN
	    DELETE FROM T_CS_PS_T
        WHERE EFF_PHASE_OUT_DATE < datBusinessOprDate
           OR EFF_PHASE_IN_DATE > datBusinessOprDate
          AND NOT(UPPER_ITEM_FLG = 1 AND LOWER_ITEM_FLG = 1);--�P�i�͍폜�ΏۊO
	END IF;
	
	COMMIT;  --COMMIT�͍Ō�ɂP��̂�

/* �����̏I�� */

	/* �I�����b�Z�[�W�̏o�� */
	vc2Comment		:= SUBSTR('(SBM0547)���͌���=' || '[ ' || numCountInput || ' ]' ||
							  '�o�͌���(INSERT)=' || '[ ' || numCountInsert || ' ]' ||
							  '�o�͌���(UPDATE)=' || '[ ' || numCountUpdate || ' ]',1,256);
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
	blnRet			:= FNCLOGCLOSE(UTL_FileHandle);

	pnumReturn := STATUS_NORMAL; --����I��

--< ��O���� >---------------------------------------------------------------
EXCEPTION
	WHEN excNORMAL_SKIP THEN	--���s�s��

		ROLLBACK;

		/* �I�����b�Z�[�W�̏o�� */
		vc2Comment		:= SUBSTR('(SBM0547)���͌���=' || '[ ' || numCountInput || ' ]' ||
								  '�o�͌���(INSERT)=' || '[ ' || numCountInsert || ' ]' ||
								  '�o�͌���(UPDATE)=' || '[ ' || numCountUpdate || ' ]',1,256);
		blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
							pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
							vc2Comment);

		/* �g���[�X���O�̏o��(�I��) */
		blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
							  pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

		COMMIT;

		/* LogFile �� CLOSE */
		blnRet := FNCLOGCLOSE(UTL_FileHandle);

		--excNORMAL_SKIP�́u����I���v�ŏI������
		pnumReturn := STATUS_NORMAL; --����I��

	WHEN excERR_CUR THEN	--�J�[�\��OPEN���̂c�a�G���[

		IF curLOWER_ITEM%ISOPEN = TRUE THEN
			CLOSE curLOWER_ITEM;
		END IF;
		IF curUPPER_ITEM%ISOPEN = TRUE THEN
			CLOSE curUPPER_ITEM;
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

		IF curLOWER_ITEM%ISOPEN = TRUE THEN
			CLOSE curLOWER_ITEM;
		END IF;
		IF curUPPER_ITEM%ISOPEN = TRUE THEN
			CLOSE curUPPER_ITEM;
		END IF;

		ROLLBACK;

		/* �I�����b�Z�[�W�̏o�� */
		vc2Comment		:= SUBSTR('(SBM0328) �������̑��̃G���[���������܂�������'  ||
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
