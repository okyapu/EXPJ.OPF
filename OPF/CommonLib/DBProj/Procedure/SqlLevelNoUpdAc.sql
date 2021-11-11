CREATE OR REPLACE PROCEDURE SQLLEVELNOUPDAC(
/*------------------------------------------------------------------------------
'
' SQL_NAME	: SqlLevelNoUpdAc.sql
' Version	: 1.00.00
'
' 修正履歴
' 2006.06.10 初版
' 2007.02.01 機能強化（品目マスタに工場コード追加。検索条件に工場コード追加）
' 2007.08.02 機能強化（EXPLANNER/JFとEXPLANNER/J実際原価の統合）
'			   副産物の対応を追加。
'			   処理を積上げ処理内部から、実際原価計算実行からの呼び出しに変更。
'			   レベル番号更新前に、末端品のレベル番号を1に更新。
'
' 機能		: レベル番号更新処理
'
'
' 戻り値	: なし
'
'
' 引き数	: ■MetamorBase共通（必須）
'			  pvc2LogMode				- (i)ＬＯＧモード
'			  pvc2OutputMode			- (i)出力モード
'			  pvc2OutputPath			- (i)出力ファイルパス
'			  pvc2OutputName			- (i)出力ファイル名
'			  pvc2UserId				- (i)ユーザＩＤ
'			  pvc2BusinessName			- (i)業務名
'			  pvc2PlantCd				- (i)工場コード
'			  ■プログラム固有
'			  pnumYearMonth 			- (i)対象年月
'			  pnumCostCalcTyp			- (i)原価計算種別
'			  pnumTempCalcTyp			- (i)仮計算区分
'
'			  pnumReturn				- (o)処理結果 (1:正常終了、2:警告終了、3:異常終了)
'
' 機能説明	: [副産物マスタ]の情報を [実際原価製品構成マスタ]に登録し、[実際原価品目マスタ]レベル番号の更新を行う。
'			  レベル番号更新後に[副産物マスタ]の情報を基に[実際原価製品構成マスタ]に登録した情報を削除する。
'
' 備考		:
'
------------------------------------------------------------------------------*/
	 pvc2LogMode			IN	VARCHAR2		-- ＬＯＧモード
	,pvc2OutputMode 		IN	VARCHAR2		-- 出力モード
	,pvc2OutputPath 		IN	VARCHAR2		-- 出力パス
	,pvc2OutputName 		IN	VARCHAR2		-- 出力ファイル名
	,pvc2UserId 			IN	VARCHAR2		-- ユーザＩＤ
	,pvc2BusinessName		IN	VARCHAR2		-- 業務名
	,pvc2PlantCd			IN	VARCHAR2		-- 工場コード
	,pnumYearMonth			IN	NUMBER			-- 対象年月
	,pnumCostCalcTyp		IN	NUMBER			-- 原価計算区分
	,pnumTempCalcTyp		IN	NUMBER			-- 仮計算区分
	,pnumReturn 			OUT NUMBER			-- 処理結果
)
IS

	/* 定数の宣言 */

	METHOD_START					VARCHAR2(20)  := 'START';					-- ログ用メソッド開始宣言
	METHOD_END						VARCHAR2(12)  := 'END'; 					-- ログ用メソッド終了宣言
	MY_SQL_NAME 					VARCHAR2(120) := 'SQLLEVELNOUPDAC'; -- ＰＬ／ＳＱＬ名

	APS_COM_BATCH_START 			VARCHAR2(28)  := 'GD00951';
	APS_COM_BATCH_END				VARCHAR2(28)  := 'GD00952';
	APS_COM_BATCH_EXP				VARCHAR2(28)  := 'GD00953';

	LOGMSG_START_PGNM				VARCHAR2(128) := '(SBM0392)レベル番号更新処理を開始しました';
	LOGMSG_END_PGNM 				VARCHAR2(128) := '(SBM0393)レベル番号更新処理を終了しました';
	LOGMSG_EXP_PGNM 				VARCHAR2(128) := 'レベル番号更新処理が異常終了しました';

	STATUS_NORMAL					NUMBER := 1;		-- 正常終了
	STATUS_WARNING					NUMBER := 2;		-- 警告終了
	STATUS_ERROR					NUMBER := 3;		-- 異常終了

	/* 変数の定義 */
	UTL_FileHandle					UTL_FILE.FILE_TYPE; -- ファイルハンドル

	blnRet							BOOLEAN;			-- 共通関数の戻値
	vc2Comment						VARCHAR2(1024); 	-- メッセージ作成用
	numCountError					NUMBER(18)	 := 0;	-- エラー件数

	/* 例外処理用変数 */
	excERR_SKIP 					EXCEPTION;			-- 実行不可
	excERR_CURSOR					EXCEPTION;			-- カーソルOPEN中のEXCEPTION
	excERROR						EXCEPTION;			-- 定義済みエラー発生時
	excWORNING						EXCEPTION;			-- 定義済みワーニング発生時

	/* カーソルの宣言 */

	/* [副産物マスタ]の検索 */
	CURSOR curM_BY_PRODUCT_AC(
		ctypPlantCd M_ITEM_AC.PLANT_CD%TYPE	--工場コード
	)IS
		SELECT
			ITEM_CD			--品目番号
		,	BY_PRODUCT_CD	--副産物コード
		FROM
			M_BY_PRODUCT_AC
		WHERE
			PLANT_CD = ctypPlantCd	--[副産物マスタ]工場コード＝引数の「工場コード」
	;

	/* [実際原価製品構成]の検索 */
	CURSOR curM_PS_AC(
		ctypItemCd		M_BY_PRODUCT_AC.ITEM_CD%TYPE		--品目番号
	,	ctypByProductCd	M_BY_PRODUCT_AC.BY_PRODUCT_CD%TYPE	--副産物コード
	)IS
		SELECT
			ROWID
		FROM
			M_PS_AC
		WHERE
			COMP_ITEM_CD	= ctypItemCd		--[実際原価製品構成マスタ]子品目番号＝[副産物マスタ]品目番号
		AND	PARENT_ITEM_CD	= ctypByProductCd	--[実際原価製品構成マスタ]親品目番号＝[副産物マスタ]副産物コード
	;
	recM_PS_AC curM_PS_AC%ROWTYPE;

	/* [実際原価製品構成マスタ]より、親品目として存在しない、子品目番号の取得 */
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

	/* [実際原価製品構成マスタ]より、対象の子品目を逆展開し、親品目の取得 */
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

	/* [品目マスタ]の取得 カーソル */
	CURSOR curM_ITEM_AC(
		ctypPlantCd M_ITEM_AC.PLANT_CD%TYPE	--工場コード
	,	ctypItemCd	M_ITEM_AC.ITEM_CD%TYPE	--品目番号
	)
	IS
		SELECT
			HIGH_LEVEL_NO	--[品目マスタ]レベル番号
		FROM
			M_ITEM_AC		--[品目マスタ]
		WHERE
			PLANT_CD = ctypPlantCd	--[品目マスタ]工場コード＝[INﾊﾟﾗﾒｰﾀ]工場コード
		AND	ITEM_CD  = ctypItemCd	--[品目マスタ]品目番号	＝[INﾊﾟﾗﾒｰﾀ]品目番号
	;
	recM_ITEM_AC curM_ITEM_AC%ROWTYPE;

BEGIN

	/* LogFile の OPEN */
	blnRet := FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

	/* TraceLogの出力(Start)処理を行う */
	blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, METHOD_START);

	/* 業務開始メッセージの出力 */
	blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
						LOGMSG_START_PGNM);

	COMMIT;

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
  初期処理
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	/*==============================================
	' 初期処理
	===============================================*/

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
  メイン処理
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	/* =======================
	' 副産物の仮構成の登録
	======================= */
	/* [副産物マスタ]の検索 */
	FOR recM_BY_PRODUCT_AC IN curM_BY_PRODUCT_AC(
		pvc2PlantCd	--引数の「工場コード」
	)LOOP

		/* [実際原価製品構成]の検索 */
		OPEN curM_PS_AC(
			recM_BY_PRODUCT_AC.ITEM_CD			--品目番号
		,	recM_BY_PRODUCT_AC.BY_PRODUCT_CD	--副産物コード
		);
		FETCH curM_PS_AC INTO recM_PS_AC;

		/* [実際原価製品構成]が存在しない場合、登録 */
		IF curM_PS_AC%NOTFOUND THEN

			/* [実際原価製品構成]の登録 */
			BEGIN
				INSERT
				INTO M_PS_AC
				(
					PARENT_ITEM_CD			--親品目番号
				,	COMP_ITEM_CD			--子品目番号
				,	PS_EDITION				--製品構成版数
				,	PS_UNIT_DENOMINATOR 	--製品構成単位数分母
				,	PS_UNIT_NUMERATOR		--製品構成単位数分子
				,	EFF_PHASE_IN_DATE		--製品構成有効開始日
				,	EFF_PHASE_OUT_DATE		--製品構成有効終了日
				,	PS_SPOIL				--構成仕損率
				,	CONS_TYP				--支給区分
				,	PS_LT_FLG				--製品構成リードタイム使用フラグ
				,	PS_FIXED_LT 			--製品構成固定分リードタイム
				,	PS_PROP_LT				--製品構成比例分リードタイム
				,	PS_PROP_LOT_SIZE		--製品構成比例分ロットサイズ
				,	PS_REF_NO				--製品構成照会キー
				,	COST_UP_TYP 			--原価積上区分
				,	MRP_EXP_TYP 			--所要量展開区分
				,	CREATED_DATE			--作成日
				,	CREATED_BY				--作成者
				,	CREATED_PRG_NM			--作成プログラム名
				,	UPDATED_DATE			--更新日
				,	UPDATED_BY				--更新者
				,	UPDATED_PRG_NM			--更新プログラム名
				,	MODIFY_COUNT			--更新数
				)VALUES(
					recM_BY_PRODUCT_AC.BY_PRODUCT_CD			--[副産物マスタ]副産物コード
				,	recM_BY_PRODUCT_AC.ITEM_CD					--[副産物マスタ]品目番号
				,	1											--１
				,	1											--１
				,	1											--１
				,	TO_DATE(pnumYearMonth,'YYYYMM')				--引数の年月の１日
				,	LAST_DAY(TO_DATE(pnumYearMonth,'YYYYMM'))	--引数の年月の末日
				,	0											--０
				,	0											--０：非
				,	0											--0:製品構成マスタのL/Tを使用しない。品目マスタを参照する。
				,	0											--０
				,	0											--０
				,	1											--１
				,	1											--１
				,	1											--1:積上げする
				,	1											--1:展開する
				,	SYSDATE 	--システム日付
				,	pvc2UserId	--引数のユーザコード
				,	MY_SQL_NAME --‘SQL？？？？？’
				,	SYSDATE 	--システム日付
				,	pvc2UserId	--引数のユーザコード
				,	MY_SQL_NAME --‘SQL？？？？？’
				,	0			--更新数
				);
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('INSERT M_PS_AC'
										|| ' ITEM_CD=' 		 || '[' || recM_BY_PRODUCT_AC.ITEM_CD		|| ']'	--品目番号
										|| ' BY_PRODUCT_CD=' || '[' || recM_BY_PRODUCT_AC.BY_PRODUCT_CD || ']'	--副産物コード
										|| ' SQLCODE=' || '[' || SQLCODE || ']'
										|| ' SQLERRM=' || '[' || SQLERRM || ']',1,256);
					RAISE excERR_SKIP;
			END;

		END IF;

		CLOSE curM_PS_AC;
	END LOOP;

	/* =======================
	' 末端品のレベル番号更新
	======================= */

	/* [実際原価製品構成マスタ]の検索 */
	/* 親品目として存在しない、子品目の取得 */
	FOR recCOMP_ITEM IN curCOMP_ITEM LOOP

		/* [実際原価品目マスタ]の更新 */
		BEGIN
			UPDATE M_ITEM_AC
			SET
					HIGH_LEVEL_NO = 1	--１
				,	UPDATED_DATE			= SYSDATE			--更新日			= システム日付
				,	UPDATED_BY				= pvc2UserId		--更新者			= 引数のユーザコード
				,	UPDATED_PRG_NM			= MY_SQL_NAME		--更新プログラム名	= ‘SQL？？？？？’
				,	MODIFY_COUNT			= MODIFY_COUNT + 1	--更新数			= 更新の場合、1up
			WHERE
				PLANT_CD = pvc2PlantCd
			AND	ITEM_CD  = recCOMP_ITEM.COMP_ITEM_CD
			;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('1:UPDATE M_ITEM_AC'
									|| ' ITEM_CD=' || '[' || recCOMP_ITEM.COMP_ITEM_CD || ']'	--品目番号
									|| ' SQLCODE=' || '[' || SQLCODE || ']'
									|| ' SQLERRM=' || '[' || SQLERRM || ']',1,256);
				RAISE excERR_SKIP;
		END;

	END LOOP;

	/* =======================
	' レベル番号更新処理
	======================= */

	/* 親品目として存在しない、子品目の取得 */
	FOR recCOMP_ITEM IN curCOMP_ITEM LOOP

		/* 子品目番号を元に、逆展開し、親品目番号の取得 */
		FOR recCONNECT_PARENT_ITEM IN curCONNECT_PARENT_ITEM(
			recCOMP_ITEM.COMP_ITEM_CD
		)LOOP

			/* 親品目の現状のレベル番号の取得 */
			/* [品目マスタ]の検索 */
			OPEN curM_ITEM_AC(
				pvc2PlantCd								--引数の「工場コード」
			,	recCONNECT_PARENT_ITEM.PARENT_ITEM_CD	--取得した親品目番号
			);
			FETCH curM_ITEM_AC INTO recM_ITEM_AC;
			CLOSE curM_ITEM_AC;	/* カーソルCLOSE */

			/* ------------------------------------------------------------
			' 親品目のレベル番号が、「子品目のレベル番号＋１」未満の場合
			' 親品目のレベル番号の更新を行う
			------------------------------------------------------------ */
			IF recCONNECT_PARENT_ITEM.LEVEL+1 > recM_ITEM_AC.HIGH_LEVEL_NO THEN
				BEGIN
					UPDATE M_ITEM_AC
					SET
							HIGH_LEVEL_NO = recCONNECT_PARENT_ITEM.LEVEL + 1	--子品目のレベル番号＋１
						,	UPDATED_DATE			= SYSDATE					--更新日			= システム日付
						,	UPDATED_BY				= pvc2UserId				--更新者			= 引数のユーザコード
						,	UPDATED_PRG_NM			= MY_SQL_NAME				--更新プログラム名	= ‘SQL？？？？？’
						,	MODIFY_COUNT			= MODIFY_COUNT + 1			--更新数			= 更新の場合、1up
					WHERE
						PLANT_CD = pvc2PlantCd
					AND	ITEM_CD  = recCONNECT_PARENT_ITEM.PARENT_ITEM_CD
					;
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('2:UPDATE M_ITEM_AC'
											|| ' ITEM_CD=' || '[' || recCONNECT_PARENT_ITEM.PARENT_ITEM_CD || ']'	--品目番号
											|| ' SQLCODE=' || '[' || SQLCODE || ']'
											|| ' SQLERRM=' || '[' || SQLERRM || ']',1,256);
						RAISE excERR_SKIP;
				END;
			END IF;

		END LOOP;
	END LOOP;


	/* =======================
	' 副産物の仮構成を削除
	======================= */
	/* [実際原価製品構成マスタ]の削除 */
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
						BYP.PLANT_CD	  = pvc2PlantCd			--[副産物マスタ]工場コード＝引数の「工場コード」
					AND	PS.COMP_ITEM_CD   = BYP.ITEM_CD			--[実際原価製品構成マスタ]子品目番号＝[副産物マスタ]品目番号
					AND	PS.PARENT_ITEM_CD = BYP.BY_PRODUCT_CD	--[実際原価製品構成マスタ]親品目番号＝[副産物マスタ]副産物コード
			)
		;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('DELETE M_PS_AC'
								|| ' SQLCODE=' || '[' || SQLCODE || ']'
								|| ' SQLERRM=' || '[' || SQLERRM || ']',1,256);
			RAISE excERR_SKIP;
	END;


/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
  メイン処理終了
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/


	/*==============================================
	' 正常終了処理
	===============================================*/

	/* 処理の終了 */
	/* 終了メッセージの出力 */
	vc2Comment := LOGMSG_END_PGNM;

	blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
						pvc2UserId, pvc2BusinessName,
						pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
						vc2Comment);

	COMMIT;

	/* トレースログの出力(終了) */
	blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
						  pvc2UserId,pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, METHOD_END);

	COMMIT;

	/* LogFile の CLOSE */
	blnRet := FNCLOGCLOSE(UTL_FileHandle);

	/* 処理結果 */
	IF numCountError = 0 THEN
		pnumReturn := STATUS_NORMAL;	--エラー件数＝0の場合、1:正常終了
	ELSE
		pnumReturn := STATUS_ERROR; 	--エラー件数＞0の場合、3:異常終了
	END IF;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION

	WHEN excERR_SKIP THEN	/* 実行不可 */

		/* カーソルCLOSE */
		IF curM_ITEM_AC%ISOPEN THEN CLOSE curM_ITEM_AC;	END IF;
		IF curM_PS_AC%ISOPEN THEN CLOSE curM_PS_AC;	END IF;

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

		pnumReturn := STATUS_ERROR; /* 異常終了 */

	WHEN excERR_CURSOR THEN /* カーソルOPEN中のＤＢ例外エラー */

		/* カーソルCLOSE */
		IF curM_ITEM_AC%ISOPEN THEN CLOSE curM_ITEM_AC;	END IF;
		IF curM_PS_AC%ISOPEN THEN CLOSE curM_PS_AC;	END IF;

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

		pnumReturn := STATUS_ERROR; /* 異常終了 */

	WHEN OTHERS  THEN	--その他の例外エラー

		/* カーソルCLOSE */
		IF curM_ITEM_AC%ISOPEN THEN CLOSE curM_ITEM_AC;	END IF;
		IF curM_PS_AC%ISOPEN THEN CLOSE curM_PS_AC;	END IF;

		ROLLBACK;

		/* 終了メッセージの出力 */
		vc2Comment	:= SUBSTR('PGNAME='   || '[ ' || MY_SQL_NAME || ' ]' ||
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
