CREATE OR REPLACE PROCEDURE SQLLEVELNOUPDAC(
/*------------------------------------------------------------------------------
'
' SQL_NAME	: SqlLevelNoUpdAc.sql
' Version	: 1.00.00
'
' �C������
' 2006.06.10 ����
' 2007.02.01 �@�\�����i�i�ڃ}�X�^�ɍH��R�[�h�ǉ��B���������ɍH��R�[�h�ǉ��j
' 2007.08.02 �@�\�����iEXPLANNER/JF��EXPLANNER/J���ی����̓����j
'			   ���Y���̑Ή���ǉ��B
'			   ������Ϗグ������������A���ی����v�Z���s����̌Ăяo���ɕύX�B
'			   ���x���ԍ��X�V�O�ɁA���[�i�̃��x���ԍ���1�ɍX�V�B
'
' �@�\		: ���x���ԍ��X�V����
'
'
' �߂�l	: �Ȃ�
'
'
' ������	: ��MetamorBase���ʁi�K�{�j
'			  pvc2LogMode				- (i)�k�n�f���[�h
'			  pvc2OutputMode			- (i)�o�̓��[�h
'			  pvc2OutputPath			- (i)�o�̓t�@�C���p�X
'			  pvc2OutputName			- (i)�o�̓t�@�C����
'			  pvc2UserId				- (i)���[�U�h�c
'			  pvc2BusinessName			- (i)�Ɩ���
'			  pvc2PlantCd				- (i)�H��R�[�h
'			  ���v���O�����ŗL
'			  pnumYearMonth 			- (i)�Ώ۔N��
'			  pnumCostCalcTyp			- (i)�����v�Z���
'			  pnumTempCalcTyp			- (i)���v�Z�敪
'
'			  pnumReturn				- (o)�������� (1:����I���A2:�x���I���A3:�ُ�I��)
'
' �@�\����	: [���Y���}�X�^]�̏��� [���ی������i�\���}�X�^]�ɓo�^���A[���ی����i�ڃ}�X�^]���x���ԍ��̍X�V���s���B
'			  ���x���ԍ��X�V���[���Y���}�X�^]�̏������[���ی������i�\���}�X�^]�ɓo�^���������폜����B
'
' ���l		:
'
------------------------------------------------------------------------------*/
	 pvc2LogMode			IN	VARCHAR2		-- �k�n�f���[�h
	,pvc2OutputMode 		IN	VARCHAR2		-- �o�̓��[�h
	,pvc2OutputPath 		IN	VARCHAR2		-- �o�̓p�X
	,pvc2OutputName 		IN	VARCHAR2		-- �o�̓t�@�C����
	,pvc2UserId 			IN	VARCHAR2		-- ���[�U�h�c
	,pvc2BusinessName		IN	VARCHAR2		-- �Ɩ���
	,pvc2PlantCd			IN	VARCHAR2		-- �H��R�[�h
	,pnumYearMonth			IN	NUMBER			-- �Ώ۔N��
	,pnumCostCalcTyp		IN	NUMBER			-- �����v�Z�敪
	,pnumTempCalcTyp		IN	NUMBER			-- ���v�Z�敪
	,pnumReturn 			OUT NUMBER			-- ��������
)
IS

	/* �萔�̐錾 */

	METHOD_START					VARCHAR2(20)  := 'START';					-- ���O�p���\�b�h�J�n�錾
	METHOD_END						VARCHAR2(12)  := 'END'; 					-- ���O�p���\�b�h�I���錾
	MY_SQL_NAME 					VARCHAR2(120) := 'SQLLEVELNOUPDAC'; -- �o�k�^�r�p�k��

	APS_COM_BATCH_START 			VARCHAR2(28)  := 'GD00951';
	APS_COM_BATCH_END				VARCHAR2(28)  := 'GD00952';
	APS_COM_BATCH_EXP				VARCHAR2(28)  := 'GD00953';

	LOGMSG_START_PGNM				VARCHAR2(128) := '(SBM0392)���x���ԍ��X�V�������J�n���܂���';
	LOGMSG_END_PGNM 				VARCHAR2(128) := '(SBM0393)���x���ԍ��X�V�������I�����܂���';
	LOGMSG_EXP_PGNM 				VARCHAR2(128) := '���x���ԍ��X�V�������ُ�I�����܂���';

	STATUS_NORMAL					NUMBER := 1;		-- ����I��
	STATUS_WARNING					NUMBER := 2;		-- �x���I��
	STATUS_ERROR					NUMBER := 3;		-- �ُ�I��

	/* �ϐ��̒�` */
	UTL_FileHandle					UTL_FILE.FILE_TYPE; -- �t�@�C���n���h��

	blnRet							BOOLEAN;			-- ���ʊ֐��̖ߒl
	vc2Comment						VARCHAR2(1024); 	-- ���b�Z�[�W�쐬�p
	numCountError					NUMBER(18)	 := 0;	-- �G���[����

	/* ��O�����p�ϐ� */
	excERR_SKIP 					EXCEPTION;			-- ���s�s��
	excERR_CURSOR					EXCEPTION;			-- �J�[�\��OPEN����EXCEPTION
	excERROR						EXCEPTION;			-- ��`�ς݃G���[������
	excWORNING						EXCEPTION;			-- ��`�ς݃��[�j���O������

	/* �J�[�\���̐錾 */

	/* [���Y���}�X�^]�̌��� */
	CURSOR curM_BY_PRODUCT_AC(
		ctypPlantCd M_ITEM_AC.PLANT_CD%TYPE	--�H��R�[�h
	)IS
		SELECT
			ITEM_CD			--�i�ڔԍ�
		,	BY_PRODUCT_CD	--���Y���R�[�h
		FROM
			M_BY_PRODUCT_AC
		WHERE
			PLANT_CD = ctypPlantCd	--[���Y���}�X�^]�H��R�[�h�������́u�H��R�[�h�v
	;

	/* [���ی������i�\��]�̌��� */
	CURSOR curM_PS_AC(
		ctypItemCd		M_BY_PRODUCT_AC.ITEM_CD%TYPE		--�i�ڔԍ�
	,	ctypByProductCd	M_BY_PRODUCT_AC.BY_PRODUCT_CD%TYPE	--���Y���R�[�h
	)IS
		SELECT
			ROWID
		FROM
			M_PS_AC
		WHERE
			COMP_ITEM_CD	= ctypItemCd		--[���ی������i�\���}�X�^]�q�i�ڔԍ���[���Y���}�X�^]�i�ڔԍ�
		AND	PARENT_ITEM_CD	= ctypByProductCd	--[���ی������i�\���}�X�^]�e�i�ڔԍ���[���Y���}�X�^]���Y���R�[�h
	;
	recM_PS_AC curM_PS_AC%ROWTYPE;

	/* [���ی������i�\���}�X�^]���A�e�i�ڂƂ��đ��݂��Ȃ��A�q�i�ڔԍ��̎擾 */
	CURSOR curCOMP_ITEM
	IS
		SELECT
		DISTINCT
			COMP_ITEM_CD
		FROM
			M_PS_AC COMP
		WHERE
			NOT EXISTS(	SELECT
							ROWID
						FROM
							M_PS_AC PARENT
						WHERE
							COMP.COMP_ITEM_CD = PARENT.PARENT_ITEM_CD
			)
	;

	/* [���ی������i�\���}�X�^]���A�Ώۂ̎q�i�ڂ��t�W�J���A�e�i�ڂ̎擾 */
	CURSOR curCONNECT_PARENT_ITEM(
		ctypCompItemCd	M_PS_AC.COMP_ITEM_CD%TYPE
	)IS
		SELECT
			LEVEL
		,	COMP_ITEM_CD
		,	PARENT_ITEM_CD
		FROM
			M_PS_AC	START WITH COMP_ITEM_CD 		= ctypCompItemCd
					CONNECT BY PRIOR PARENT_ITEM_CD = COMP_ITEM_CD
	;

	/* [�i�ڃ}�X�^]�̎擾 �J�[�\�� */
	CURSOR curM_ITEM_AC(
		ctypPlantCd M_ITEM_AC.PLANT_CD%TYPE	--�H��R�[�h
	,	ctypItemCd	M_ITEM_AC.ITEM_CD%TYPE	--�i�ڔԍ�
	)
	IS
		SELECT
			HIGH_LEVEL_NO	--[�i�ڃ}�X�^]���x���ԍ�
		FROM
			M_ITEM_AC		--[�i�ڃ}�X�^]
		WHERE
			PLANT_CD = ctypPlantCd	--[�i�ڃ}�X�^]�H��R�[�h��[IN���Ұ�]�H��R�[�h
		AND	ITEM_CD  = ctypItemCd	--[�i�ڃ}�X�^]�i�ڔԍ�	��[IN���Ұ�]�i�ڔԍ�
	;
	recM_ITEM_AC curM_ITEM_AC%ROWTYPE;

BEGIN

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

/*��������������������������������������������������������������������������������������������������������
  ��������
����������������������������������������������������������������������������������������������������������*/

	/*==============================================
	' ��������
	===============================================*/

/*��������������������������������������������������������������������������������������������������������
  ���C������
����������������������������������������������������������������������������������������������������������*/

	/* =======================
	' ���Y���̉��\���̓o�^
	======================= */
	/* [���Y���}�X�^]�̌��� */
	FOR recM_BY_PRODUCT_AC IN curM_BY_PRODUCT_AC(
		pvc2PlantCd	--�����́u�H��R�[�h�v
	)LOOP

		/* [���ی������i�\��]�̌��� */
		OPEN curM_PS_AC(
			recM_BY_PRODUCT_AC.ITEM_CD			--�i�ڔԍ�
		,	recM_BY_PRODUCT_AC.BY_PRODUCT_CD	--���Y���R�[�h
		);
		FETCH curM_PS_AC INTO recM_PS_AC;

		/* [���ی������i�\��]�����݂��Ȃ��ꍇ�A�o�^ */
		IF curM_PS_AC%NOTFOUND THEN

			/* [���ی������i�\��]�̓o�^ */
			BEGIN
				INSERT
				INTO M_PS_AC
				(
					PARENT_ITEM_CD			--�e�i�ڔԍ�
				,	COMP_ITEM_CD			--�q�i�ڔԍ�
				,	PS_EDITION				--���i�\���Ő�
				,	PS_UNIT_DENOMINATOR 	--���i�\���P�ʐ�����
				,	PS_UNIT_NUMERATOR		--���i�\���P�ʐ����q
				,	EFF_PHASE_IN_DATE		--���i�\���L���J�n��
				,	EFF_PHASE_OUT_DATE		--���i�\���L���I����
				,	PS_SPOIL				--�\���d����
				,	CONS_TYP				--�x���敪
				,	PS_LT_FLG				--���i�\�����[�h�^�C���g�p�t���O
				,	PS_FIXED_LT 			--���i�\���Œ蕪���[�h�^�C��
				,	PS_PROP_LT				--���i�\����ᕪ���[�h�^�C��
				,	PS_PROP_LOT_SIZE		--���i�\����ᕪ���b�g�T�C�Y
				,	PS_REF_NO				--���i�\���Ɖ�L�[
				,	COST_UP_TYP 			--�����Ϗ�敪
				,	MRP_EXP_TYP 			--���v�ʓW�J�敪
				,	CREATED_DATE			--�쐬��
				,	CREATED_BY				--�쐬��
				,	CREATED_PRG_NM			--�쐬�v���O������
				,	UPDATED_DATE			--�X�V��
				,	UPDATED_BY				--�X�V��
				,	UPDATED_PRG_NM			--�X�V�v���O������
				,	MODIFY_COUNT			--�X�V��
				)VALUES(
					recM_BY_PRODUCT_AC.BY_PRODUCT_CD			--[���Y���}�X�^]���Y���R�[�h
				,	recM_BY_PRODUCT_AC.ITEM_CD					--[���Y���}�X�^]�i�ڔԍ�
				,	1											--�P
				,	1											--�P
				,	1											--�P
				,	TO_DATE(pnumYearMonth,'YYYYMM')				--�����̔N���̂P��
				,	LAST_DAY(TO_DATE(pnumYearMonth,'YYYYMM'))	--�����̔N���̖���
				,	0											--�O
				,	0											--�O�F��
				,	0											--0:���i�\���}�X�^��L/T���g�p���Ȃ��B�i�ڃ}�X�^���Q�Ƃ���B
				,	0											--�O
				,	0											--�O
				,	1											--�P
				,	1											--�P
				,	1											--1:�Ϗグ����
				,	1											--1:�W�J����
				,	SYSDATE 	--�V�X�e�����t
				,	pvc2UserId	--�����̃��[�U�R�[�h
				,	MY_SQL_NAME --�eSQL�H�H�H�H�H�f
				,	SYSDATE 	--�V�X�e�����t
				,	pvc2UserId	--�����̃��[�U�R�[�h
				,	MY_SQL_NAME --�eSQL�H�H�H�H�H�f
				,	0			--�X�V��
				);
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('INSERT M_PS_AC'
										|| ' ITEM_CD=' 		 || '[' || recM_BY_PRODUCT_AC.ITEM_CD		|| ']'	--�i�ڔԍ�
										|| ' BY_PRODUCT_CD=' || '[' || recM_BY_PRODUCT_AC.BY_PRODUCT_CD || ']'	--���Y���R�[�h
										|| ' SQLCODE=' || '[' || SQLCODE || ']'
										|| ' SQLERRM=' || '[' || SQLERRM || ']',1,256);
					RAISE excERR_SKIP;
			END;

		END IF;

		CLOSE curM_PS_AC;
	END LOOP;

	/* =======================
	' ���[�i�̃��x���ԍ��X�V
	======================= */

	/* [���ی������i�\���}�X�^]�̌��� */
	/* �e�i�ڂƂ��đ��݂��Ȃ��A�q�i�ڂ̎擾 */
	FOR recCOMP_ITEM IN curCOMP_ITEM LOOP

		/* [���ی����i�ڃ}�X�^]�̍X�V */
		BEGIN
			UPDATE M_ITEM_AC
			SET
					HIGH_LEVEL_NO = 1	--�P
				,	UPDATED_DATE			= SYSDATE			--�X�V��			= �V�X�e�����t
				,	UPDATED_BY				= pvc2UserId		--�X�V��			= �����̃��[�U�R�[�h
				,	UPDATED_PRG_NM			= MY_SQL_NAME		--�X�V�v���O������	= �eSQL�H�H�H�H�H�f
				,	MODIFY_COUNT			= MODIFY_COUNT + 1	--�X�V��			= �X�V�̏ꍇ�A1up
			WHERE
				PLANT_CD = pvc2PlantCd
			AND	ITEM_CD  = recCOMP_ITEM.COMP_ITEM_CD
			;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('1:UPDATE M_ITEM_AC'
									|| ' ITEM_CD=' || '[' || recCOMP_ITEM.COMP_ITEM_CD || ']'	--�i�ڔԍ�
									|| ' SQLCODE=' || '[' || SQLCODE || ']'
									|| ' SQLERRM=' || '[' || SQLERRM || ']',1,256);
				RAISE excERR_SKIP;
		END;

	END LOOP;

	/* =======================
	' ���x���ԍ��X�V����
	======================= */

	/* �e�i�ڂƂ��đ��݂��Ȃ��A�q�i�ڂ̎擾 */
	FOR recCOMP_ITEM IN curCOMP_ITEM LOOP

		/* �q�i�ڔԍ������ɁA�t�W�J���A�e�i�ڔԍ��̎擾 */
		FOR recCONNECT_PARENT_ITEM IN curCONNECT_PARENT_ITEM(
			recCOMP_ITEM.COMP_ITEM_CD
		)LOOP

			/* �e�i�ڂ̌���̃��x���ԍ��̎擾 */
			/* [�i�ڃ}�X�^]�̌��� */
			OPEN curM_ITEM_AC(
				pvc2PlantCd								--�����́u�H��R�[�h�v
			,	recCONNECT_PARENT_ITEM.PARENT_ITEM_CD	--�擾�����e�i�ڔԍ�
			);
			FETCH curM_ITEM_AC INTO recM_ITEM_AC;
			CLOSE curM_ITEM_AC;	/* �J�[�\��CLOSE */

			/* ------------------------------------------------------------
			' �e�i�ڂ̃��x���ԍ����A�u�q�i�ڂ̃��x���ԍ��{�P�v�����̏ꍇ
			' �e�i�ڂ̃��x���ԍ��̍X�V���s��
			------------------------------------------------------------ */
			IF recCONNECT_PARENT_ITEM.LEVEL+1 > recM_ITEM_AC.HIGH_LEVEL_NO THEN
				BEGIN
					UPDATE M_ITEM_AC
					SET
							HIGH_LEVEL_NO = recCONNECT_PARENT_ITEM.LEVEL + 1	--�q�i�ڂ̃��x���ԍ��{�P
						,	UPDATED_DATE			= SYSDATE					--�X�V��			= �V�X�e�����t
						,	UPDATED_BY				= pvc2UserId				--�X�V��			= �����̃��[�U�R�[�h
						,	UPDATED_PRG_NM			= MY_SQL_NAME				--�X�V�v���O������	= �eSQL�H�H�H�H�H�f
						,	MODIFY_COUNT			= MODIFY_COUNT + 1			--�X�V��			= �X�V�̏ꍇ�A1up
					WHERE
						PLANT_CD = pvc2PlantCd
					AND	ITEM_CD  = recCONNECT_PARENT_ITEM.PARENT_ITEM_CD
					;
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('2:UPDATE M_ITEM_AC'
											|| ' ITEM_CD=' || '[' || recCONNECT_PARENT_ITEM.PARENT_ITEM_CD || ']'	--�i�ڔԍ�
											|| ' SQLCODE=' || '[' || SQLCODE || ']'
											|| ' SQLERRM=' || '[' || SQLERRM || ']',1,256);
						RAISE excERR_SKIP;
				END;
			END IF;

		END LOOP;
	END LOOP;


	/* =======================
	' ���Y���̉��\�����폜
	======================= */
	/* [���ی������i�\���}�X�^]�̍폜 */
	BEGIN
		DELETE
		FROM
			M_PS_AC PS
		WHERE
			EXISTS(
					SELECT
						BYP.ROWID
					FROM
						M_BY_PRODUCT_AC BYP
					WHERE
						BYP.PLANT_CD	  = pvc2PlantCd			--[���Y���}�X�^]�H��R�[�h�������́u�H��R�[�h�v
					AND	PS.COMP_ITEM_CD   = BYP.ITEM_CD			--[���ی������i�\���}�X�^]�q�i�ڔԍ���[���Y���}�X�^]�i�ڔԍ�
					AND	PS.PARENT_ITEM_CD = BYP.BY_PRODUCT_CD	--[���ی������i�\���}�X�^]�e�i�ڔԍ���[���Y���}�X�^]���Y���R�[�h
			)
		;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('DELETE M_PS_AC'
								|| ' SQLCODE=' || '[' || SQLCODE || ']'
								|| ' SQLERRM=' || '[' || SQLERRM || ']',1,256);
			RAISE excERR_SKIP;
	END;


/*��������������������������������������������������������������������������������������������������������
  ���C�������I��
����������������������������������������������������������������������������������������������������������*/


	/*==============================================
	' ����I������
	===============================================*/

	/* �����̏I�� */
	/* �I�����b�Z�[�W�̏o�� */
	vc2Comment := LOGMSG_END_PGNM;

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

	/* �������� */
	IF numCountError = 0 THEN
		pnumReturn := STATUS_NORMAL;	--�G���[������0�̏ꍇ�A1:����I��
	ELSE
		pnumReturn := STATUS_ERROR; 	--�G���[������0�̏ꍇ�A3:�ُ�I��
	END IF;

--< ��O���� >---------------------------------------------------------------
EXCEPTION

	WHEN excERR_SKIP THEN	/* ���s�s�� */

		/* �J�[�\��CLOSE */
		IF curM_ITEM_AC%ISOPEN THEN CLOSE curM_ITEM_AC;	END IF;
		IF curM_PS_AC%ISOPEN THEN CLOSE curM_PS_AC;	END IF;

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

	WHEN excERR_CURSOR THEN /* �J�[�\��OPEN���̂c�a��O�G���[ */

		/* �J�[�\��CLOSE */
		IF curM_ITEM_AC%ISOPEN THEN CLOSE curM_ITEM_AC;	END IF;
		IF curM_PS_AC%ISOPEN THEN CLOSE curM_PS_AC;	END IF;

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

	WHEN OTHERS  THEN	--���̑��̗�O�G���[

		/* �J�[�\��CLOSE */
		IF curM_ITEM_AC%ISOPEN THEN CLOSE curM_ITEM_AC;	END IF;
		IF curM_PS_AC%ISOPEN THEN CLOSE curM_PS_AC;	END IF;

		ROLLBACK;

		/* �I�����b�Z�[�W�̏o�� */
		vc2Comment	:= SUBSTR('PGNAME='   || '[ ' || MY_SQL_NAME || ' ]' ||
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
