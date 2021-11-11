-- パッケージ本体
CREATE OR REPLACE PACKAGE BODY SqlUpdateLevelNo IS

--********************************************************************
--機能		: 	ハイレベル番号更新Main
--
--返り値	:NONE
--
--引き数	:
--		inUSERID 			IN 	VARCHAR2
--
--備考      :
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

		IF RS_SYS_PS_T.ACCESS_TYP = 1 THEN		--処理方法	1:追加
					-- ※親が、子+1未満なら、親を子+1とする
					--（CountUp方向のみ）

			--指定の構成の親子のLVL番号を比較更新（CountUp方向のみ）	--Lib
			UP_LVL_PS(
					nSTAT,
					RS_SYS_PS_T.PARENT_ITEM_CD,
					RS_SYS_PS_T.COMP_ITEM_CD,
					inUSERID
				) ;

			IF nSTAT = 1 THEN		--親品目のLVLが更新された場合
				--親の上位構成を全て、同じ処理
				UP_LVL_PS_UPPER(
						RS_SYS_PS_T.PARENT_ITEM_CD,
						inUSERID
					) ;
			END IF ;

		ELSIF RS_SYS_PS_T.ACCESS_TYP = 2 THEN		--処理方法 2:削除
					--※親に子がいない場合	親LVL＝１
					--※親に子がいる場合	親LVL＝子の中のMAXのLVL番号+１
					--（削除CASE対応）

			--指定の親の上位構成のLVL番号を比較更新（MAX使用）
			UP_LVL_MAX(
					nSTAT,
					RS_SYS_PS_T.PARENT_ITEM_CD,
					inUSERID
				) ;

			IF nSTAT = 1 THEN		--親品目のLVLが更新された場合
				--親の上位構成を全て、同じ処理
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

		--やったところまで、COMMITきってみます（最初、全件なんで）2003/0724
--		COMMIT;

	END LOOP ;

END ;

--指定の親の上位構成のLVL番号を比較更新（CountUp方向のみ）	--Lib
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


--指定の構成の親子のLVL番号を比較更新（CountUp方向のみ）	--Lib
PROCEDURE UP_LVL_PS (
	outSTAT					OUT	NUMBER,				-- 0：Updateしない/1：Updateした
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

		UPDATE M_ITEM SET 							------M_ITEM 更新（追加）
				HIGH_LEVEL_NO = (nC_LVLNO + 1),
				UPDATED_DATE = SYSDATE,
				UPDATED_BY = inUSERID,
				UPDATED_PRG_NM = MY_SQL_NAME,
				MODIFY_COUNT = MODIFY_COUNT + 1
			WHERE ITEM_CD = inPARENT_ITEM_CD ;

		outSTAT := 1 ;
	END IF ;
END ;


--指定の親の上位構成のLVL番号を比較更新（MAX使用）	--Lib
--※削除CASE対応
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

--指定の親品目のLVL番号を更新（MAX使用）	--Lib
--※削除CASE対応・・・（こっちだとオールマイティ・・だけど、遅い）
PROCEDURE UP_LVL_MAX (
	outSTAT					OUT	NUMBER,				-- 0：Updateしない/1：Updateした
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

		UPDATE M_ITEM SET 							------M_ITEM 更新（削除）
				HIGH_LEVEL_NO = (nC_LVLNO + 1),
				UPDATED_DATE = SYSDATE,
				UPDATED_BY = inUSERID,
				UPDATED_PRG_NM = MY_SQL_NAME,
				MODIFY_COUNT = MODIFY_COUNT + 1
			WHERE ITEM_CD = inPARENT_ITEM_CD ;

		outSTAT := 1 ;
	END IF ;

END ;

--指定品目のレベル番号取得				--Lib
FUNCTION GET_LVLNO (
	inITEM_CD 	IN 	VARCHAR2		--品目番号
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
