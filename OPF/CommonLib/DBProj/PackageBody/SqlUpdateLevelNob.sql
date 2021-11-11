-- �p�b�P�[�W�{��
CREATE OR REPLACE PACKAGE BODY SqlUpdateLevelNo IS

--********************************************************************
--�@�\		: 	�n�C���x���ԍ��X�VMain
--
--�Ԃ�l	:NONE
--
--������	:
--		inUSERID 			IN 	VARCHAR2
--
--���l      :
--********************************************************************
PROCEDURE UP_LVL (
		inUSERID 			IN 	VARCHAR2
)	IS

	CURSOR C_SYS_PS_T IS
		SELECT * FROM SYS_PS_T
		ORDER BY SEQ_NO
		FOR UPDATE ;

	RS_SYS_PS_T			SYS_PS_T%ROWTYPE ;
	RS_M_PS				M_PS%ROWTYPE ;
	RS_P_M_ITEM			M_ITEM%ROWTYPE ;
	RS_C_M_ITEM			M_ITEM%ROWTYPE ;
	nSTAT				NUMBER(1) ;

BEGIN

	DELETE SYS_PS_T
		WHERE CMPLT_FLG = 1 ;

	FOR RS_SYS_PS_T IN C_SYS_PS_T LOOP
		nSTAT := 0 ;

		IF RS_SYS_PS_T.ACCESS_TYP = 1 THEN		--�������@	1:�ǉ�
					-- ���e���A�q+1�����Ȃ�A�e���q+1�Ƃ���
					--�iCountUp�����̂݁j

			--�w��̍\���̐e�q��LVL�ԍ����r�X�V�iCountUp�����̂݁j	--Lib
			UP_LVL_PS(
					nSTAT,
					RS_SYS_PS_T.PARENT_ITEM_CD,
					RS_SYS_PS_T.COMP_ITEM_CD,
					inUSERID
				) ;

			IF nSTAT = 1 THEN		--�e�i�ڂ�LVL���X�V���ꂽ�ꍇ
				--�e�̏�ʍ\����S�āA��������
				UP_LVL_PS_UPPER(
						RS_SYS_PS_T.PARENT_ITEM_CD,
						inUSERID
					) ;
			END IF ;

		ELSIF RS_SYS_PS_T.ACCESS_TYP = 2 THEN		--�������@ 2:�폜
					--���e�Ɏq�����Ȃ��ꍇ	�eLVL���P
					--���e�Ɏq������ꍇ	�eLVL���q�̒���MAX��LVL�ԍ�+�P
					--�i�폜CASE�Ή��j

			--�w��̐e�̏�ʍ\����LVL�ԍ����r�X�V�iMAX�g�p�j
			UP_LVL_MAX(
					nSTAT,
					RS_SYS_PS_T.PARENT_ITEM_CD,
					inUSERID
				) ;

			IF nSTAT = 1 THEN		--�e�i�ڂ�LVL���X�V���ꂽ�ꍇ
				--�e�̏�ʍ\����S�āA��������
				UP_LVL_MAX_UPPER (
						RS_SYS_PS_T.PARENT_ITEM_CD,
						inUSERID
					) ;
			END IF ;
		END IF ;

		UPDATE SYS_PS_T SET
				CMPLT_FLG = 1,
				UPDATED_DATE = SYSDATE,
				UPDATED_BY = inUSERID,
				UPDATED_PRG_NM = MY_SQL_NAME,
				MODIFY_COUNT = MODIFY_COUNT + 1
			WHERE CURRENT OF C_SYS_PS_T
			;

		--������Ƃ���܂ŁACOMMIT�����Ă݂܂��i�ŏ��A�S���Ȃ�Łj2003/0724
--		COMMIT;

	END LOOP ;

END ;

--�w��̐e�̏�ʍ\����LVL�ԍ����r�X�V�iCountUp�����̂݁j	--Lib
PROCEDURE UP_LVL_PS_UPPER (
	inPARENT_ITEM_CD 		IN 	VARCHAR2,
	inUSERID 				IN 	VARCHAR2
) IS
	nP_LVLNO		NUMBER(6);
	nC_LVLNO		NUMBER(6);

	CURSOR C_LVLPS IS
		SELECT	LEVEL,
				PARENT_ITEM_CD,
				COMP_ITEM_CD
			FROM M_PS
			START WITH COMP_ITEM_CD = inPARENT_ITEM_CD
			CONNECT BY PRIOR PARENT_ITEM_CD = COMP_ITEM_CD
			ORDER BY LEVEL
			;
	RS_LVLPS	C_LVLPS%ROWTYPE ;
	nSTAT		NUMBER(1) ;	--DUMMY
BEGIN

	FOR RS_LVLPS IN C_LVLPS LOOP

		UP_LVL_PS(
			nSTAT,
			RS_LVLPS.PARENT_ITEM_CD,
			RS_LVLPS.COMP_ITEM_CD,
			inUSERID) ;

	END LOOP ;

END ;


--�w��̍\���̐e�q��LVL�ԍ����r�X�V�iCountUp�����̂݁j	--Lib
PROCEDURE UP_LVL_PS (
	outSTAT					OUT	NUMBER,				-- 0�FUpdate���Ȃ�/1�FUpdate����
	inPARENT_ITEM_CD 		IN 	VARCHAR2,
	inCOMP_ITEM_CD			IN 	VARCHAR2,
	inUSERID 				IN 	VARCHAR2
) IS
	nP_LVLNO		NUMBER(6);
	nC_LVLNO		NUMBER(6);
BEGIN
	outSTAT := 0 ;

	nP_LVLNO := GET_LVLNO(inPARENT_ITEM_CD) ;
	nC_LVLNO := GET_LVLNO(inCOMP_ITEM_CD) ;

	IF nP_LVLNO < (nC_LVLNO + 1) THEN

		UPDATE M_ITEM SET 							------M_ITEM �X�V�i�ǉ��j
				HIGH_LEVEL_NO = (nC_LVLNO + 1),
				UPDATED_DATE = SYSDATE,
				UPDATED_BY = inUSERID,
				UPDATED_PRG_NM = MY_SQL_NAME,
				MODIFY_COUNT = MODIFY_COUNT + 1
			WHERE ITEM_CD = inPARENT_ITEM_CD ;

		outSTAT := 1 ;
	END IF ;
END ;


--�w��̐e�̏�ʍ\����LVL�ԍ����r�X�V�iMAX�g�p�j	--Lib
--���폜CASE�Ή�
PROCEDURE UP_LVL_MAX_UPPER (
	inPARENT_ITEM_CD 		IN 	VARCHAR2,
	inUSERID 				IN 	VARCHAR2
) IS
	nP_LVLNO		NUMBER(6);
	nC_LVLNO		NUMBER(6);

	CURSOR C_LVLPS IS
		SELECT	LEVEL,
				PARENT_ITEM_CD,
				COMP_ITEM_CD
			FROM M_PS
			START WITH COMP_ITEM_CD = inPARENT_ITEM_CD
			CONNECT BY PRIOR PARENT_ITEM_CD = COMP_ITEM_CD
			ORDER BY LEVEL
			;
	RS_LVLPS	C_LVLPS%ROWTYPE ;
	nSTAT		NUMBER(1) ;	--DUMMY
BEGIN

	FOR RS_LVLPS IN C_LVLPS LOOP

		UP_LVL_MAX(
				nSTAT,
				RS_LVLPS.PARENT_ITEM_CD,
				inUSERID
			) ;

	END LOOP ;

END ;

--�w��̐e�i�ڂ�LVL�ԍ����X�V�iMAX�g�p�j	--Lib
--���폜CASE�Ή��E�E�E�i���������ƃI�[���}�C�e�B�E�E�����ǁA�x���j
PROCEDURE UP_LVL_MAX (
	outSTAT					OUT	NUMBER,				-- 0�FUpdate���Ȃ�/1�FUpdate����
	inPARENT_ITEM_CD 		IN 	VARCHAR2,
	inUSERID 				IN 	VARCHAR2
) IS
	nP_LVLNO		NUMBER(6);
	nC_LVLNO		NUMBER(6);
BEGIN

	outSTAT := 0 ;
	nP_LVLNO := GET_LVLNO(inPARENT_ITEM_CD) ;

	SELECT NVL(MAX(HIGH_LEVEL_NO),0) INTO nC_LVLNO
			FROM M_ITEM
			WHERE ITEM_CD IN
					( SELECT COMP_ITEM_CD
							FROM M_PS
							WHERE PARENT_ITEM_CD = inPARENT_ITEM_CD
					) ;

	IF nP_LVLNO != (nC_LVLNO + 1) THEN

		UPDATE M_ITEM SET 							------M_ITEM �X�V�i�폜�j
				HIGH_LEVEL_NO = (nC_LVLNO + 1),
				UPDATED_DATE = SYSDATE,
				UPDATED_BY = inUSERID,
				UPDATED_PRG_NM = MY_SQL_NAME,
				MODIFY_COUNT = MODIFY_COUNT + 1
			WHERE ITEM_CD = inPARENT_ITEM_CD ;

		outSTAT := 1 ;
	END IF ;

END ;

--�w��i�ڂ̃��x���ԍ��擾				--Lib
FUNCTION GET_LVLNO (
	inITEM_CD 	IN 	VARCHAR2		--�i�ڔԍ�
) RETURN NUMBER IS
	nLVLNO		NUMBER(6);
BEGIN
	BEGIN
		SELECT NVL(HIGH_LEVEL_NO,1) INTO nLVLNO
				FROM M_ITEM
				WHERE ITEM_CD = inITEM_CD ;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			nLVLNO := 1;
	END ;
	RETURN(nLVLNO) ;
END ;

END ;
/
