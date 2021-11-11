CREATE OR REPLACE procedure 	 SQLSTDITEMPSWORKENTRY(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlStdItemPSWorkEntry.sql,v $
'$Author: suganuma $
'$Revision: 1.11 $ $Date: 2013/07/02 10:41:29 $
'						 2005.10.24 unicode対応（varchar2を4倍）
'
'
' 機能		: 標準原価構成品ワーク作成処理
'
' 戻り値	:
'
'
' 引き数	: ■MetamorBase共通（必須）
'			  pvc2LogMode		   - (i)ＬＯＧモード
'			  pvc2OutputMode	   - (i)出力モード
'			  pvc2OutputPath	   - (i)出力ファイルパス
'			  pvc2OutputName	   - (i)出力ファイル名
'			  pvc2UserId		   - (i)ユーザＩＤ
'			  pvc2BusinessName	   - (i)業務名
'			  pvc2PlantCd		   - (i)工場コード
'			  ■プログラム固有
'			  pnumYear			   - (i)対象年度
'			  pnumHalfTermTyp	   - (i)半期区分
'			  pnumCostTyp		   - (i)原価種別
'			  pnumActTyp		   - (i)実行区分（1:通常実行、2:再実行）
'			  pnumReturn		   - (o)処理結果 (1:正常終了、2:警告終了、3:異常終了)
'
'
' 機能説明	: [品目]、[製品構成]を基に、標準原価計算用の[構成品ワーク]の作成を行う。
'
' 備考		:
'
------------------------------------------------------------------------------*/

--< プロシージャ名定義 >-----------------------------------------------------
	pvc2LogMode 		 IN  VARCHAR2		 --ＬＯＧモード
   ,pvc2OutputMode		 IN  VARCHAR2		 --出力モード
   ,pvc2OutputPath		 IN  VARCHAR2		 --出力パス
   ,pvc2OutputName		 IN  VARCHAR2		 --出力ファイル名
   ,pvc2UserId			 IN  VARCHAR2		 --ユーザＩＤ
   ,pvc2BusinessName	 IN  VARCHAR2		 --業務名
   ,pvc2PlantCd 		 IN  VARCHAR2		 --工場コード
   ,pnumYear			 IN  NUMBER 		 --対象年度
   ,pnumHalfTermTyp 	 IN  NUMBER 		 --半期区分
   ,pnumCostTyp 		 IN  NUMBER 		 --原価種別
   ,pnumActTyp			 IN  NUMBER 		 --実行区分
   ,pnumReturn			 OUT NUMBER 		 --処理結果
)
IS

	/* 定数の宣言 */

	METHOD_START			VARCHAR2(20) := 'START';		  --ログ用メソッド開始宣言
	METHOD_END				VARCHAR2(12) := 'End';			  --ログ用メソッド終了宣言
	MY_SQL_NAME 			VARCHAR2(120) := 'SQLSTDITEMPSWORKENTRY'; --ＰＬ／ＳＱＬ名

	APS_COM_BATCH_START 	VARCHAR2(28) := 'DC01201';
	APS_COM_BATCH_END		VARCHAR2(28) := 'DC01202';
	APS_COM_BATCH_EXP		VARCHAR2(28) := 'DC01203';

	LOGMSG_START_PGNM		VARCHAR2(200) := '(SBM0539)標準原価構成品ワーク作成処理を開始しました';
	LOGMSG_END_PGNM 		VARCHAR2(200) := '標準原価構成品ワーク作成処理を終了しました';
	LOGMSG_EXP_PGNM 		VARCHAR2(200) := '標準原価構成品ワーク作成処理が異常終了しました';

	STATUS_NORMAL			NUMBER		  := 1; 		 -- 正常終了
	STATUS_WARNING			NUMBER		  := 2; 		 -- 警告終了
	STATUS_ERROR			NUMBER		  := 3; 		 -- 異常終了

	UPPER_ITEM_CD			VARCHAR2(4) := '*';   --先頭品コード

	/* 変数の定義 */
	UTL_FileHandle			UTL_FILE.FILE_TYPE; 	--ファイルハンドル

	numCountInput			NUMBER(11)	 := 0;			 --対象データ件数
	numCountInput2			NUMBER(11)	 := 0;			 --対象データ件数
	numCountInsert			NUMBER(11)	 := 0;			 --正常データ件数
	numCountUpdate			NUMBER(11)	 := 0;			 --正常データ件数
	numCountError			NUMBER(11)	 := 0;			 --異常データ件数
	numCountDummy			NUMBER(11)	 := 0;			 --件数チェック用
	numUpLevelNo			NUMBER(6)	 := 0;			 --UP_LEVEL_NO
	blnRet					BOOLEAN;		--共通関数の戻値
	blnUpdatInsert			BOOLEAN;		--更新判定
	vc2Comment				VARCHAR2(1024);  --メッセージ作成用
	numStartMonth			SYS_COST_CTRL.START_MONTH%TYPE; 	  --年度開始月
	vc2PhaseStartMonth		VARCHAR2(24);			--指定半期の期首月
	vc2PhaseEndMonth		VARCHAR2(24);			--指定半期の期末月
	datPhaseStartDay		DATE;				   --指定半期の期首日
	datPhaseEndDay			DATE;				   --指定半期の期末日
	datBusinessOprDate      DATE;                  --業務運用日

	/* 例外処理用変数 */
	excNORMAL_SKIP	 EXCEPTION; 	 --実行不可
	excERR_CUR		 EXCEPTION; 	 --カーソルOPEN中のEXCEPTION

	/* カーソルの宣言  末端品*/
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
--	  WHERE  T1.ITEM_CD NOT IN (SELECT UNIQUE(PARENT_ITEM_CD) FROM V_CS_PS)  --末端品＝製品構成Mの親が無い
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
			   WHERE NOT(EFF_PHASE_IN_DATE > datPhaseEndDay OR EFF_PHASE_OUT_DATE < datPhaseStartDay)   -- 原価計算対象期間内
			  ) T  --製品構成版数が最大の製品構成Ｍ
			WHERE  T.RANK_PS_EDITION=1) M1,
			(SELECT
			   UNIQUE(PARENT_ITEM_CD) AS PARENT_ITEM_CD
			 FROM
			   (SELECT
			        PARENT_ITEM_CD,
			        RANK() OVER(PARTITION BY PARENT_ITEM_CD,COMP_ITEM_CD ORDER BY PS_EDITION DESC) AS  RANK_PS_EDITION
			     FROM M_PS
			     WHERE NOT(EFF_PHASE_IN_DATE > datPhaseEndDay OR EFF_PHASE_OUT_DATE < datPhaseStartDay)   -- 原価計算対象期間内
			    ) T  --製品構成版数が最大の製品構成Ｍ
			 WHERE  T.RANK_PS_EDITION=1) M2
	  WHERE  T1.ITEM_CD = M2.PARENT_ITEM_CD(+)
		AND  M2.PARENT_ITEM_CD IS NULL
		AND  T1.ITEM_CD = M1.COMP_ITEM_CD
--		AND  T1.ITEM_CD IN ('PP-DR-CHERY')
;

	recLOWER_ITEM curLOWER_ITEM%ROWTYPE;

	/* カーソルの宣言  中間品～最上位品目*/
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
             WHERE NOT(EFF_PHASE_IN_DATE > datPhaseEndDay OR EFF_PHASE_OUT_DATE < datPhaseStartDay)   -- 原価計算対象期間内
            ) T  --製品構成版数が最大の製品構成Ｍ
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

	/* カーソルの宣言  単品*/
	CURSOR curSINGLE_ITEM(
		cvc2PlantCd VARCHAR2 --工場コード
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
	/* LogFile の OPEN */
	blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

	/* TraceLogの出力(Start)処理を行う */
	blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, METHOD_START);

	/* 業務開始メッセージの出力 */
	blnRet :=	FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
						  LOGMSG_START_PGNM);
	COMMIT;

	/* カウンタの初期化 */
	numCountInput := 0; 			   --対象データ件数
	numCountInsert:= 0; 			   --正常データ件数
	numCountUpdate:= 0;
	numCountError := 0; 			   --異常データ件数

	/* 実行可否の判定 */
	SELECT COUNT(*)  INTO  numCountDummy
		FROM	 T_CS_PS_T
		WHERE	 PLANT_CD  =  pvc2PlantCd
		  AND	 ROWNUM    =  1;
	IF	numCountDummy  >  0  THEN
		RAISE	excNORMAL_SKIP;
	END IF;

	/*	対象年度/半期区分/年度開始月より、指定半期の期首月/期末月を取得 */
	BEGIN  /* 原価管理パラメータの読込 */
		SELECT	START_MONTH
		  INTO	numStartMonth
		  FROM	SYS_COST_CTRL
		  WHERE  PLANT_CD  =  pvc2PlantCd;
	EXCEPTION
		WHEN OTHERS THEN
			RAISE  excNORMAL_SKIP;
	END;  /* 原価管理パラメータの読込 */

	vc2PhaseStartMonth :=  TO_CHAR(pnumYear + FLOOR((numStartMonth	-1+((pnumHalfTermTyp-1)*6))/12) ||
								   LPAD(MOD((numStartMonth	-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
								  );
	datPhaseStartDay   :=  TO_DATE(vc2PhaseStartMonth||'01','YYYYMMDD');
	vc2PhaseEndMonth   :=  TO_CHAR(pnumYear + FLOOR((numStartMonth+5-1+((pnumHalfTermTyp-1)*6))/12) ||
								   LPAD(MOD((numStartMonth+5-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
								  );
	datPhaseEndDay	   :=  LAST_DAY(TO_DATE(vc2PhaseEndMonth,'YYYYMM'));
	
	/** 業務運用日の取得 */
	BEGIN  /* 業務運用日の読込 */ 
        SELECT BUSINESS_OPR_DATE INTO datBusinessOprDate
          FROM SYS_DATE_CTRL
         WHERE PLANT_CD  =  pvc2PlantCd;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment := SUBSTR('1:業務運用日の取得に失敗しました。'  ||
                                 ' USER_CD='  || '[ ' || pvc2UserId  || ' ]' ||
                                 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
            RAISE  excERR_CUR;
    END;  /* 業務運用日の読込 */ 


/*○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(末端品)
○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	BEGIN  /* カーソルOPEN(末端品) */
		OPEN  curLOWER_ITEM;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment	:= SUBSTR('1:OPEN curLOWER_ITEM'  ||
								  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE	 excERR_CUR;
	END;  /* カーソルOPEN(末端品) */

	LOOP  /* 末端品の繰り返し*/

		BEGIN  /* カーソルFETCH（末端品） */
			FETCH  curLOWER_ITEM  INTO	recLOWER_ITEM;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('2:FETCH curLOWER_ITEM'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE  excERR_CUR;
		END;  /* カーソルFETCH（末端品） */

		EXIT WHEN  curLOWER_ITEM%NOTFOUND;

		numCountInput := numCountInput+1;

		IF	recLOWER_ITEM.PS_UNIT_DENOMINATOR = 0 THEN
			vc2Comment		:= SUBSTR('3:PS_UNIT_DENOMINATOR=0'  ||
									  ' PARENT_ITEM_CD=' || '[ ' || recLOWER_ITEM.PARENT_ITEM_CD || ' ]' ||
									  ' COMP_ITEM_CD=' || '[ ' || recLOWER_ITEM.COMP_ITEM_CD || ' ]',1,256);
			RAISE excERR_CUR;
		END IF;

		BEGIN  /* 構成品ワーク・書き込み */
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
			   ,1  --  第１レベル
			   ,0
			   ,1  --  末端品
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
		END;  /* 構成品ワーク・書き込み */

	END LOOP;  /* 末端品の繰り返し*/

	COMMIT;  /* 仮 */

	CLOSE curLOWER_ITEM;

/*○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(中間品～最上位品目)
○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	FOR i IN 1..999999 LOOP  /* T_構成品の積上階層レベルを、1,2,3…n　と,該当レベルが無くなるまで繰り返す。*/

		/* PUT_LINE */
		blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
					  pvc2PlantCd, MY_SQL_NAME, 'MAIN-LOOP UP_LEVEL_NO='||i);
		/* PUT_LINE */

		BEGIN  /* カーソルOPEN（中間品～最上位品目） */
			OPEN	curUPPER_ITEM(i);
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('5:OPEN curUPPER_ITEM'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE	 excERR_CUR;
		END;  /* カーソルOPEN（中間品～最上位品目） */

		numCountInput2 := 0;  /* 1レベル内対象データ件数 */

		LOOP  /* 1レベル内の繰り返し */

			BEGIN  /* カーソルFETCH（中間品～最上位品目） */
				FETCH  curUPPER_ITEM  INTO	recUPPER_ITEM;
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment		:= SUBSTR('6:FETCH curUPPER_ITEM'  ||
											  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE  excERR_CUR;
			END;  /* カーソルFETCH（中間品～最上位品目） */

			EXIT WHEN  curUPPER_ITEM%NOTFOUND;

			numCountInput  := numCountInput  + 1;
			numCountInput2 := numCountInput2 + 1; /* 1レベル内対象データ件数 */

			IF	recUPPER_ITEM.PS_UNIT_DENOMINATOR = 0 THEN
				vc2Comment		:= SUBSTR('7:PS_UNIT_DENOMINATOR=0'  ||
										  ' PARENT_ITEM_CD=' || '[ ' || recUPPER_ITEM.PARENT_ITEM_CD || ' ]' ||
										  ' COMP_ITEM_CD=' || '[ ' || recUPPER_ITEM.COMP_ITEM_CD || ' ]',1,256);
				RAISE excERR_CUR;
			END IF;

			IF	recUPPER_ITEM.PARENT_ITEM_CD IS NULL THEN  /* [最上位品目]判定 */

				BEGIN  /* 構成ワーク・更新判定 */
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
				END;  /* 構成ワーク・更新判定 */

				IF	blnUpdatInsert =  TRUE	THEN  /* 共通品目は、階層レベルは、数字が大きい方を優先する */
					IF	numUpLevelNo  <=  i + 1 THEN
						BEGIN  /* 構成ワーク・更新(UPDATE) */
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
						END;  /* 構成ワーク・更新(UPDATE) */
					END IF;

				ELSE  /* 共通品目は、階層レベルは、数字が大きい方を優先する */

					BEGIN  /* 構成ワーク・更新(INSERT) */
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
							,1	--	先頭品
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
					END;  /* 構成ワーク・更新(INSERT) */
				END IF;  /* 共通品目は、階層レベルは、数字が大きい方を優先する */

			ELSE  /* [最上位品目]判定 */

				BEGIN  /* 構成ワーク・更新判定 */
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
				END;  /* 構成ワーク・更新判定 */

				IF	blnUpdatInsert = TRUE  THEN  /* 共通品目は、階層レベルは、数字が大きい方を優先する */

					IF	numUpLevelNo  <=  i + 1 THEN
						BEGIN  /* 構成ワーク・更新(UPDATE) */
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
						END;  /* 構成ワーク・更新(UPDATE) */
					END IF;

				ELSE  /* 共通品目は、階層レベルは、数字が大きい方を優先する */

					BEGIN  /* 構成ワーク・更新(INSERT) */
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
					END;  /* 構成ワーク・更新(INSERT) */

				END IF;  /* 共通品目は、階層レベルは、数字が大きい方を優先する */

			END IF;  /* [最上位品目]判定 */

		END LOOP;  /* 1レベル内の繰り返し */

		COMMIT;  /* 仮 */

		CLOSE curUPPER_ITEM;

		/* 該当レベルが無くなると、繰り返しを抜ける。*/
		IF	numCountInput2 = 0 THEN
			EXIT;
		END IF;

	END LOOP;  /* T_構成品の積上階層レベルを、1,2,3…n　と,該当レベルが無くなるまで繰り返す。*/

/*○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(単品)
○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	/* [構成ワーク]に存在しない[品目]を順次読込 */
	FOR recSINGLE_ITEM IN curSINGLE_ITEM(
		pvc2PlantCd
	)LOOP

		BEGIN  /* 構成ワーク・更新(INSERT) */
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
				 pvc2PlantCd						--引数の処理対象工場コード
				,UPPER_ITEM_CD						--“*”
				,recSINGLE_ITEM.ITEM_CD 			--[品目]品目番号
				,1									--１
				,datPhaseStartDay					--対象年度・半期区分の初日
				,datPhaseEnDDay 					--対象年度・半期区分の末日
				,1									--1
				,1									--1
				,0									--0
				,1									--1
				,recSINGLE_ITEM.OUTSIDE_TYP 		--[品目]品目内外作区分
				,recSINGLE_ITEM.ITEM_SPOIL			--[品目]品目仕損率
				,recSINGLE_ITEM.DMY_ITEM_FLG		--[品目]品目手配区分＝８（擬似品目）の場合、１をセット上記以外の場合、０
				,recSINGLE_ITEM.VOLUNT_SPL_FLG		--[品目]受給品区分＝２（無償受給品）の場合、１をセット
				,1									--１
				,1									--１
				,1									--1（先頭品）
				,1									--１（末端品）
				,0									--０
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
		END;  /* 構成ワーク・更新(INSERT) */

	END LOOP;

	/* 期首月 ≦ 業務運用日 ≦　算出された期末月の場合、業務運用日が有効日内の製品構成外の構成を削除 */
	IF datPhaseStartDay <= datBusinessOprDate AND datPhaseEnDDay >= datBusinessOprDate THEN
	    DELETE FROM T_CS_PS_T
        WHERE EFF_PHASE_OUT_DATE < datBusinessOprDate
           OR EFF_PHASE_IN_DATE > datBusinessOprDate
          AND NOT(UPPER_ITEM_FLG = 1 AND LOWER_ITEM_FLG = 1);--単品は削除対象外
	END IF;
	
	COMMIT;  --COMMITは最後に１回のみ

/* 処理の終了 */

	/* 終了メッセージの出力 */
	vc2Comment		:= SUBSTR('(SBM0547)入力件数=' || '[ ' || numCountInput || ' ]' ||
							  '出力件数(INSERT)=' || '[ ' || numCountInsert || ' ]' ||
							  '出力件数(UPDATE)=' || '[ ' || numCountUpdate || ' ]',1,256);
	blnRet			:= FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
								 pvc2UserId, pvc2BusinessName,
								 pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
								 vc2Comment);

	COMMIT;

	/* トレースログの出力(終了) */
	blnRet			:= FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
								   pvc2UserId,pvc2BusinessName,
								   pvc2PlantCd, MY_SQL_NAME, METHOD_END);

	COMMIT;

	/* LogFile の CLOSE */
	blnRet			:= FNCLOGCLOSE(UTL_FileHandle);

	pnumReturn := STATUS_NORMAL; --正常終了

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
	WHEN excNORMAL_SKIP THEN	--実行不可

		ROLLBACK;

		/* 終了メッセージの出力 */
		vc2Comment		:= SUBSTR('(SBM0547)入力件数=' || '[ ' || numCountInput || ' ]' ||
								  '出力件数(INSERT)=' || '[ ' || numCountInsert || ' ]' ||
								  '出力件数(UPDATE)=' || '[ ' || numCountUpdate || ' ]',1,256);
		blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
							pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
							vc2Comment);

		/* トレースログの出力(終了) */
		blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
							  pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

		COMMIT;

		/* LogFile の CLOSE */
		blnRet := FNCLOGCLOSE(UTL_FileHandle);

		--excNORMAL_SKIPは「正常終了」で終了する
		pnumReturn := STATUS_NORMAL; --正常終了

	WHEN excERR_CUR THEN	--カーソルOPEN中のＤＢエラー

		IF curLOWER_ITEM%ISOPEN = TRUE THEN
			CLOSE curLOWER_ITEM;
		END IF;
		IF curUPPER_ITEM%ISOPEN = TRUE THEN
			CLOSE curUPPER_ITEM;
		END IF;

		ROLLBACK;

		/* 終了メッセージの出力 */
		blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
							pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
							vc2Comment);

		/* トレースログの出力(終了) */
		blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
							  pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

		COMMIT;

		/* LogFile の CLOSE */
		blnRet := FNCLOGCLOSE(UTL_FileHandle);

		pnumReturn := STATUS_ERROR; --異常終了

	WHEN OTHERS  THEN	--その他のエラー

		IF curLOWER_ITEM%ISOPEN = TRUE THEN
			CLOSE curLOWER_ITEM;
		END IF;
		IF curUPPER_ITEM%ISOPEN = TRUE THEN
			CLOSE curUPPER_ITEM;
		END IF;

		ROLLBACK;

		/* 終了メッセージの出力 */
		vc2Comment		:= SUBSTR('(SBM0328) ＊＊その他のエラーが発生しました＊＊'  ||
								  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
		blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
							pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
							vc2Comment);

		/* トレースログの出力(終了) */
		blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
							  pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

		COMMIT;

		/* LogFile の CLOSE */
		blnRet := FNCLOGCLOSE(UTL_FileHandle);

		pnumReturn := STATUS_ERROR; --異常終了

END;
/
