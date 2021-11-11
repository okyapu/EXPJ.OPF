CREATE OR REPLACE PROCEDURE SQLSTOCKVALUPDATE(
/*------------------------------------------------------------------------------
'
' SQL_NAME	: SqlStockValUpdate.sql
' Version	: 1.00.00
'
' 修正履歴
' 2007.02.01 初版
'
' 機能		: 在庫評価金額作成処理
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
' 機能説明	: [品目別原価]."品目別加工費"を基に、[在庫評価金額]と[在庫評価金額明細]の作成を行う。
'
'
' 備考		:
'
------------------------------------------------------------------------------*/

--< プロシージャ名定義 >-----------------------------------------------------
	pvc2LogMode 		 IN  VARCHAR2		 -- ＬＯＧモード
   ,pvc2OutputMode		 IN  VARCHAR2		 -- 出力モード
   ,pvc2OutputPath		 IN  VARCHAR2		 -- 出力パス
   ,pvc2OutputName		 IN  VARCHAR2		 -- 出力ファイル名
   ,pvc2UserId			 IN  VARCHAR2		 -- ユーザＩＤ
   ,pvc2BusinessName	 IN  VARCHAR2		 -- 業務名
   ,pvc2PlantCd 		 IN  VARCHAR2		 -- 工場コード
   ,pnumYear			 IN  NUMBER 		 -- 対象年度
   ,pnumHalfTermTyp 	 IN  NUMBER 		 -- 半期区分
   ,pnumCostTyp 		 IN  NUMBER 		 -- 原価種別
   ,pnumActTyp			 IN  NUMBER 		 -- 実行区分
   ,pnumReturn			 OUT NUMBER 		 -- 処理結果
)
IS

	/** 定数の宣言 **/

	METHOD_START				VARCHAR2(20)  := 'START';				 -- ログ用メソッド開始宣言
	METHOD_END					VARCHAR2(12)  := 'END'; 				 -- ログ用メソッド終了宣言
	MY_SQL_NAME 				VARCHAR2(120) := 'SQLSTOCKVALUPDATE';	 -- ＰＬ／ＳＱＬ名

	/* エラーメッセージ番号 */
	APS_COM_BATCH_START 		VARCHAR2(28)  := 'DC01210';
	APS_COM_BATCH_END			VARCHAR2(28)  := 'DC01211';
	APS_COM_BATCH_EXP			VARCHAR2(28)  := 'DC01212';

	/* エラーメッセージ */
	LOGMSG_START_PGNM			VARCHAR2(200) := '(SBM1702)在庫評価金額作成処理を開始しました';
	LOGMSG_END_PGNM 			VARCHAR2(200) := '在庫評価金額作成処理を終了しました';
	LOGMSG_EXP_PGNM 			VARCHAR2(200) := '在庫評価金額作成処理が異常終了しました';

	/* 処理結果 */
	STATUS_NORMAL				NUMBER		  := 1; 			   -- 正常終了
	STATUS_WARNING				NUMBER		  := 2; 			   -- 警告終了
	STATUS_ERROR				NUMBER		  := 3; 			   -- 異常終了

	/** 変数の定義 **/

	UTL_FileHandle				UTL_FILE.FILE_TYPE; 			   -- ファイルハンドル

	numCntIntStockValH			NUMBER(11)	  := 0; 			   -- 在庫評価金額書込件数
	numCntIntStockVal			NUMBER(11)	  := 0; 			   -- 在庫評価金額明細書込件数
	numOwnMatrCost				NUMBER(18,4)  := 0; 			   -- 単品材料費 算出用
	numOwnSbcntMatrCost 		NUMBER(18,4)  := 0; 			   -- 単品材料費（外注）算出用
	numOwnProcCostSumAll		NUMBER(18,4)  := 0; 			   -- 自工程加工費合計 算出用
	numOwnProcCost01			NUMBER(18,4)  := 0; 			   -- 自工程加工費01 算出用
	numOwnProcCost02			NUMBER(18,4)  := 0; 			   -- 自工程加工費02 算出用
	numOwnProcCost03			NUMBER(18,4)  := 0; 			   -- 自工程加工費03 算出用
	numOwnProcCost04			NUMBER(18,4)  := 0; 			   -- 自工程加工費04 算出用
	numOwnProcCost05			NUMBER(18,4)  := 0; 			   -- 自工程加工費05 算出用
	numOwnProcCost06			NUMBER(18,4)  := 0; 			   -- 自工程加工費06 算出用
	numOwnProcCost07			NUMBER(18,4)  := 0; 			   -- 自工程加工費07 算出用
	numOwnProcCost08			NUMBER(18,4)  := 0; 			   -- 自工程加工費08 算出用
	numOwnProcCost09			NUMBER(18,4)  := 0; 			   -- 自工程加工費09 算出用
	numOwnProcCost10			NUMBER(18,4)  := 0; 			   -- 自工程加工費10 算出用
	numOwnProcCost11			NUMBER(18,4)  := 0; 			   -- 自工程加工費11 算出用
	numOwnProcCost12			NUMBER(18,4)  := 0; 			   -- 自工程加工費12 算出用

	/* 原価管理パラメータからの取得項目 */
	numStartMonth				SYS_COST_CTRL.START_MONTH%TYPE;    -- 年度開始月

	blnRet						BOOLEAN;						   -- 共通関数の戻値
	vc2Comment					VARCHAR2(1024); 				   -- メッセージ作成用

	/* 例外処理用変数 */
	excERR_SKIP 				EXCEPTION;						   -- 実行不可
	excERR_CURSOR				EXCEPTION;						   -- カーソルOPEN中のEXCEPTION

	/* カーソルの宣言 */

	-- [品目別原価]の検索
	CURSOR curT_ITEM_COST
	IS
	SELECT
		T1.YEAR 					  -- [品目別原価]."年度"
	   ,T1.HALF_TERM_TYP			  -- [品目別原価]."半期区分"
	   ,T1.COST_TYP 				  -- [品目別原価]."原価種別"
	   ,T1.PLANT_CD 				  -- [品目別原価]."工場コード"
	   ,T1.ROOT_ITEM_CD 			  -- [品目別原価]."最上位品目番号"
	   ,T1.PARENT_ITEM_CD			  -- [品目別原価]."親品目番号"
	   ,T1.ITEM_CD					  -- [品目別原価]."品目番号"
	   ,T1.PS_EDITION				  -- [品目別原価]."製品構成版数"
	   ,T1.COST_STATEMENT_NO		  -- [品目別原価]."計算書出力順"
	   ,T1.NECESSARY_QTY			  -- [品目別原価]."必要所要量"
       ,T1.ITEM_INPUT_RATIO           -- [品目別原価]."品目仕損増分係数"
	   ,T1.OWN_MATR_COST			  -- [品目別原価]."単品材料費"
	   ,T1.UNDER_MATR_COST			  -- [品目別原価]."下位品目積上材料費"
	   ,T1.OWN_SBCNT_MATR_COST		  -- [品目別原価]."単品材料費（外注）"
	   ,T1.UNDER_SBCNT_MATR_COST	  -- [品目別原価]."下位品目積上材料費（外注）"
	   ,T1.OWN_PROC_COST_SUM_ALL	  -- [品目別原価]."自工程加工費合計"
	   ,T1.UNDER_PROC_COST_SUM_ALL	  -- [品目別原価]."下位品目積上加工費合計"
	   ,T1.STOCK_UNIT				  -- [品目別原価]."計量単位"
	FROM
		T_ITEM_COST T1				  -- [品目別原価]
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

	-- [在庫評価金額]の検索
	CURSOR curT_STOCK_VAL_H (
							  cvc2ItemCd	VARCHAR2
	)
	IS
	SELECT
		T1.YEAR 			-- [在庫評価金額]."年度"
	   ,T1.HALF_TERM_TYP	-- [在庫評価金額]."半期区分"
	   ,T1.PLANT_CD 		-- [在庫評価金額]."工場コード"
	   ,T1.ITEM_CD			-- [在庫評価金額]."品目番号"
	FROM
		T_STOCK_VAL_H T1	-- [在庫評価金額]
	WHERE
		T1.YEAR 		 = pnumYear
	AND T1.HALF_TERM_TYP = pnumHalfTermTyp
	AND T1.COST_TYP 	 = pnumCostTyp
	AND T1.PLANT_CD 	 = pvc2PlantCd
	AND T1.ITEM_CD		 = cvc2ItemCd
	;

	recT_STOCK_VAL_H curT_STOCK_VAL_H%ROWTYPE;

	-- [品目別加工費]の検索
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
		T1.PROC_COST_CLS_CD 	 -- [品目別加工費]."加工費分類コード"
	   ,T1.OWN_PROC_COST_01 	 -- [品目別加工費]."自工程加工費01"
	   ,T1.OWN_PROC_COST_02 	 -- [品目別加工費]."自工程加工費02"
	   ,T1.OWN_PROC_COST_03 	 -- [品目別加工費]."自工程加工費03"
	   ,T1.OWN_PROC_COST_04 	 -- [品目別加工費]."自工程加工費04"
	   ,T1.OWN_PROC_COST_05 	 -- [品目別加工費]."自工程加工費05"
	   ,T1.OWN_PROC_COST_06 	 -- [品目別加工費]."自工程加工費06"
	   ,T1.OWN_PROC_COST_07 	 -- [品目別加工費]."自工程加工費07"
	   ,T1.OWN_PROC_COST_08 	 -- [品目別加工費]."自工程加工費08"
	   ,T1.OWN_PROC_COST_09 	 -- [品目別加工費]."自工程加工費09"
	   ,T1.OWN_PROC_COST_10 	 -- [品目別加工費]."自工程加工費10"
	   ,T1.OWN_PROC_COST_11 	 -- [品目別加工費]."自工程加工費11"
	   ,T1.OWN_PROC_COST_12 	 -- [品目別加工費]."自工程加工費12"
	   ,T1.UNDER_PROC_COST_01	 -- [品目別加工費]."下位品目積上加工費01"
	   ,T1.UNDER_PROC_COST_02	 -- [品目別加工費]."下位品目積上加工費02"
	   ,T1.UNDER_PROC_COST_03	 -- [品目別加工費]."下位品目積上加工費03"
	   ,T1.UNDER_PROC_COST_04	 -- [品目別加工費]."下位品目積上加工費04"
	   ,T1.UNDER_PROC_COST_05	 -- [品目別加工費]."下位品目積上加工費05"
	   ,T1.UNDER_PROC_COST_06	 -- [品目別加工費]."下位品目積上加工費06"
	   ,T1.UNDER_PROC_COST_07	 -- [品目別加工費]."下位品目積上加工費07"
	   ,T1.UNDER_PROC_COST_08	 -- [品目別加工費]."下位品目積上加工費08"
	   ,T1.UNDER_PROC_COST_09	 -- [品目別加工費]."下位品目積上加工費09"
	   ,T1.UNDER_PROC_COST_10	 -- [品目別加工費]."下位品目積上加工費10"
	   ,T1.UNDER_PROC_COST_11	 -- [品目別加工費]."下位品目積上加工費11"
	   ,T1.UNDER_PROC_COST_12	 -- [品目別加工費]."下位品目積上加工費12"
	FROM
		T_ITEM_PROC_COST T1 	 -- [品目別加工費]
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

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' バッチ開始処理
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

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

	/* カウンタの初期化 */
	numCntIntStockValH	  := 0; 	-- 在庫評価金額書込件数
	numCntIntStockVal	  := 0; 	-- 在庫評価金額明細書込件数

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 引数チェック処理
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	/* 原価管理パラメータの読込 */
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
			vc2Comment := SUBSTR('(SBM0535)1:原価管理パラメータが存在しません。' ||
								 ' USER_CD='  || '[ ' || pvc2UserId 	|| ' ]' ||
								 ' PLANT_CD=' || '[ ' || pvc2PlantCd	|| ' ]',1,256);
			RAISE excERR_SKIP;
	END;

	/* パラメータのチェック（対象年度）*/
	IF pnumYear IS NULL THEN
		vc2Comment := SUBSTR('(SBM0536)2:パラメータ不正。' ||
							 ' 対象年度=' || '[ ' || pnumYear || ' ]',1,256);
		RAISE excERR_SKIP;
	END IF;

	/* パラメータのチェック（半期区分）*/
	IF pnumHalfTermTyp NOT IN ( 1, 2 ) THEN
		vc2Comment := SUBSTR('(SBM0218)3:パラメータ不正。' ||
							 ' 半期区分=' || '[ ' || pnumHalfTermTyp || ' ]',1,256);
		RAISE excERR_SKIP;
	END IF;

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 対象年度の既存データ削除処理開始
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	/* 在庫評価金額（標準原価）の削除 */
	DELETE
	FROM
		T_STOCK_VAL_H
	WHERE
		YEAR		  = pnumYear
	AND HALF_TERM_TYP = pnumHalfTermTyp
	AND COST_TYP	  = pnumCostTyp
	AND PLANT_CD	  = pvc2PlantCd
	;

	/* 在庫評価金額明細の削除 */
	DELETE
	FROM
		T_STOCK_VAL
	WHERE
		YEAR		  = pnumYear
	AND HALF_TERM_TYP = pnumHalfTermTyp
	AND COST_TYP	  = pnumCostTyp
	AND PLANT_CD	  = pvc2PlantCd
	;

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理開始
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	/* カーソルＯＰＥＮ（[品目別原価]）*/
	BEGIN
		OPEN curT_ITEM_COST;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('4:OPEN curT_ITEM_COST'		||
								 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE excERR_CURSOR;
	END;

	LOOP /* [品目別原価]の繰り返し */

		/* カーソルＦＥＴＣＨ（[品目別原価]）*/
		BEGIN
			FETCH curT_ITEM_COST INTO recT_ITEM_COST;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('5:FETCH curT_ITEM_COST'		||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE excERR_CURSOR;
		END;

		/* 終点まで到達した場合、正常終了処理へ */
		EXIT WHEN curT_ITEM_COST%NOTFOUND;

		/* カーソルＯＰＥＮ（[在庫評価金額]）*/
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

		/* カーソルＦＥＴＣＨ（[在庫評価金額]）*/
		BEGIN
			FETCH curT_STOCK_VAL_H INTO recT_STOCK_VAL_H;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('7:FETCH curT_STOCK_VAL_H' 	||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE excERR_CURSOR;
		END;

		/* [在庫評価金額]のデータが存在した場合、次の[品目別原価]へスキップ */
		IF curT_STOCK_VAL_H%NOTFOUND THEN

			/* 単品材料費 算出 */
			numOwnMatrCost := CEIL(recT_ITEM_COST.OWN_MATR_COST / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
			/* 単品材料費（外注）算出 */
			numOwnSbcntMatrCost := CEIL(recT_ITEM_COST.OWN_SBCNT_MATR_COST / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
			/* 自工程加工費合計 算出 */
			numOwnProcCostSumAll := CEIL(recT_ITEM_COST.OWN_PROC_COST_SUM_ALL / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;

			/* 在庫評価金額・書き込み */
			BEGIN
				INSERT INTO T_STOCK_VAL_H ( YEAR					   -- 年度
										   ,HALF_TERM_TYP			   -- 半期区分
										   ,COST_TYP				   -- 原価種別
										   ,PLANT_CD				   -- 工場コード
										   ,ITEM_CD 				   -- 品目番号
										   ,OWN_MATR_COST			   -- 単品材料費
										   ,UNDER_MATR_COST 		   -- 下位品目積上材料費
										   ,TOTAL_MATR_COST 		   -- 材料費合計
										   ,OWN_SBCNT_MATR_COST 	   -- 単品材料費（外注）
										   ,UNDER_SBCNT_MATR_COST	   -- 下位品目積上材料費（外注）
										   ,TOTAL_SBCNT_MATR_COST	   -- 材料費（外注）合計
										   ,OWN_PROC_COST_SUM_ALL	   -- 自工程加工費合計
										   ,UNDER_PROC_COST_SUM_ALL    -- 下位品目積上加工費合計
										   ,TOTAL_PROC_COST_SUM_ALL    -- 加工費合計
										   ,STOCK_UNIT				   -- 計量単位
										   ,CREATED_DATE			   -- 作成日
										   ,CREATED_BY				   -- 作成者
										   ,CREATED_PRG_NM			   -- 作成プログラム名
										   ,UPDATED_DATE			   -- 更新日
										   ,UPDATED_BY				   -- 更新者
										   ,UPDATED_PRG_NM			   -- 更新プログラム名
										   ,MODIFY_COUNT			   -- 更新数
				) VALUES (
											pnumYear				   -- 年度
										   ,pnumHalfTermTyp 		   -- 半期区分
										   ,pnumCostTyp 			   -- 原価種別
										   ,pvc2PlantCd 			   -- 工場コード
										   ,recT_ITEM_COST.ITEM_CD	   -- 品目番号
										   ,numOwnMatrCost			   -- 単品材料費
										   ,recT_ITEM_COST.UNDER_MATR_COST
																	   -- 下位品目積上材料費
										   ,numOwnMatrCost + recT_ITEM_COST.UNDER_MATR_COST * recT_ITEM_COST.ITEM_INPUT_RATIO
																	   -- 材料費合計
										   ,numOwnSbcntMatrCost 	   -- 単品材料費（外注）
										   ,recT_ITEM_COST.UNDER_SBCNT_MATR_COST
																	   -- 下位品目積上材料費（外注）
										   ,numOwnSbcntMatrCost + recT_ITEM_COST.UNDER_SBCNT_MATR_COST * recT_ITEM_COST.ITEM_INPUT_RATIO
																	   -- 材料費（外注）合計
										   ,numOwnProcCostSumAll	   -- 自工程加工費合計
										   ,recT_ITEM_COST.UNDER_PROC_COST_SUM_ALL
																	   -- 下位品目積上加工費合計
										   ,numOwnProcCostSumAll + recT_ITEM_COST.UNDER_PROC_COST_SUM_ALL * recT_ITEM_COST.ITEM_INPUT_RATIO
																	   -- 加工費合計
										   ,recT_ITEM_COST.STOCK_UNIT  -- 計量単位
										   ,SYSDATE 				   -- 作成日
										   ,pvc2UserId				   -- 作成者
										   ,MY_SQL_NAME 			   -- 作成プログラム名
										   ,SYSDATE 				   -- 更新日
										   ,pvc2UserId				   -- 更新者
										   ,MY_SQL_NAME 			   -- 更新プログラム名
										   ,0						   -- 更新数
				);

				-- 在庫評価金額書込件数 カウントアップ
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

			/* カーソルＯＰＥＮ（[品目別加工費]）*/
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

			LOOP /* [品目別加工費]の繰り返し */

				/* カーソルＦＥＴＣＨ（[品目別加工費]）*/
				BEGIN
					FETCH curT_ITEM_PROC_COST INTO recT_ITEM_PROC_COST;
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('10:FETCH curT_ITEM_PROC_COST' ||
											 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
						RAISE excERR_CURSOR;
				END;

				/* 終点まで到達した場合、次の[品目別原価]レコードへスキップ */
				EXIT WHEN curT_ITEM_PROC_COST%NOTFOUND;

				/* 自工程加工費01 算出 */
				numOwnProcCost01 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_01 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費02 算出 */
				numOwnProcCost02 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_02 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費03 算出 */
				numOwnProcCost03 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_03 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費04 算出 */
				numOwnProcCost04 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_04 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費05 算出 */
				numOwnProcCost05 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_05 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費06 算出 */
				numOwnProcCost06 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_06 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費07 算出 */
				numOwnProcCost07 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_07 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費08 算出 */
				numOwnProcCost08 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_08 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費09 算出 */
				numOwnProcCost09 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_09 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費10 算出 */
				numOwnProcCost10 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_10 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費11 算出 */
				numOwnProcCost11 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_11 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;
				/* 自工程加工費12 算出 */
				numOwnProcCost12 := CEIL(recT_ITEM_PROC_COST.OWN_PROC_COST_12 / recT_ITEM_COST.NECESSARY_QTY * 10000) / 10000;

				/* 在庫評価金額・書き込み */
				BEGIN
					INSERT INTO T_STOCK_VAL ( YEAR					 -- 年度
											 ,HALF_TERM_TYP 		 -- 半期区分
											 ,COST_TYP				 -- 原価種別
											 ,PLANT_CD				 -- 工場コード
											 ,ITEM_CD				 -- 品目番号
											 ,PROC_COST_CLS_CD		 -- 加工費分類コード
											 ,OWN_PROC_COST_01		 -- 自工程加工費01
											 ,OWN_PROC_COST_02		 -- 自工程加工費02
											 ,OWN_PROC_COST_03		 -- 自工程加工費03
											 ,OWN_PROC_COST_04		 -- 自工程加工費04
											 ,OWN_PROC_COST_05		 -- 自工程加工費05
											 ,OWN_PROC_COST_06		 -- 自工程加工費06
											 ,OWN_PROC_COST_07		 -- 自工程加工費07
											 ,OWN_PROC_COST_08		 -- 自工程加工費08
											 ,OWN_PROC_COST_09		 -- 自工程加工費09
											 ,OWN_PROC_COST_10		 -- 自工程加工費10
											 ,OWN_PROC_COST_11		 -- 自工程加工費11
											 ,OWN_PROC_COST_12		 -- 自工程加工費12
											 ,OWN_PROC_COST_SUM 	 -- 自工程加工費計
											 ,UNDER_PROC_COST_01	 -- 下位品目積上加工費01
											 ,UNDER_PROC_COST_02	 -- 下位品目積上加工費02
											 ,UNDER_PROC_COST_03	 -- 下位品目積上加工費03
											 ,UNDER_PROC_COST_04	 -- 下位品目積上加工費04
											 ,UNDER_PROC_COST_05	 -- 下位品目積上加工費05
											 ,UNDER_PROC_COST_06	 -- 下位品目積上加工費06
											 ,UNDER_PROC_COST_07	 -- 下位品目積上加工費07
											 ,UNDER_PROC_COST_08	 -- 下位品目積上加工費08
											 ,UNDER_PROC_COST_09	 -- 下位品目積上加工費09
											 ,UNDER_PROC_COST_10	 -- 下位品目積上加工費10
											 ,UNDER_PROC_COST_11	 -- 下位品目積上加工費11
											 ,UNDER_PROC_COST_12	 -- 下位品目積上加工費12
											 ,UNDER_PROC_COST_SUM	 -- 下位品目積上加工費計
											 ,CREATED_DATE			 -- 作成日
											 ,CREATED_BY			 -- 作成者
											 ,CREATED_PRG_NM		 -- 作成プログラム名
											 ,UPDATED_DATE			 -- 更新日
											 ,UPDATED_BY			 -- 更新者
											 ,UPDATED_PRG_NM		 -- 更新プログラム名
											 ,MODIFY_COUNT			 -- 更新数
					) VALUES (
											  pnumYear				 -- 年度
											 ,pnumHalfTermTyp		 -- 半期区分
											 ,pnumCostTyp			 -- 原価種別
											 ,pvc2PlantCd			 -- 工場コード
											 ,recT_ITEM_COST.ITEM_CD
																	 -- 品目番号
											 ,recT_ITEM_PROC_COST.PROC_COST_CLS_CD
																	 -- 加工費分類コード
											 ,numOwnProcCost01		 -- 自工程加工費01
											 ,numOwnProcCost02		 -- 自工程加工費02
											 ,numOwnProcCost03		 -- 自工程加工費03
											 ,numOwnProcCost04		 -- 自工程加工費04
											 ,numOwnProcCost05		 -- 自工程加工費05
											 ,numOwnProcCost06		 -- 自工程加工費06
											 ,numOwnProcCost07		 -- 自工程加工費07
											 ,numOwnProcCost08		 -- 自工程加工費08
											 ,numOwnProcCost09		 -- 自工程加工費09
											 ,numOwnProcCost10		 -- 自工程加工費10
											 ,numOwnProcCost11		 -- 自工程加工費11
											 ,numOwnProcCost12		 -- 自工程加工費12
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
											  numOwnProcCost12		 -- 自工程加工費計
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_01
																	 -- 下位品目積上加工費01
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_02
																	 -- 下位品目積上加工費02
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_03
																	 -- 下位品目積上加工費03
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_04
																	 -- 下位品目積上加工費04
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_05
																	 -- 下位品目積上加工費05
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_06
																	 -- 下位品目積上加工費06
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_07
																	 -- 下位品目積上加工費07
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_08
																	 -- 下位品目積上加工費08
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_09
																	 -- 下位品目積上加工費09
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_10
																	 -- 下位品目積上加工費10
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_11
																	 -- 下位品目積上加工費11
											 ,recT_ITEM_PROC_COST.UNDER_PROC_COST_12
																	 -- 下位品目積上加工費12
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
																	 -- 下位品目積上加工費計
											 ,SYSDATE				 -- 作成日
											 ,pvc2UserId			 -- 作成者
											 ,MY_SQL_NAME			 -- 作成プログラム名
											 ,SYSDATE				 -- 更新日
											 ,pvc2UserId			 -- 更新者
											 ,MY_SQL_NAME			 -- 更新プログラム名
											 ,0 					 -- 更新数
					);

					-- 在庫評価金額明細書込件数 カウントアップ
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

			END LOOP; /* [品目別加工費]の繰り返し */

			/* カーソルＣＬＯＳＥ（[品目別加工費]）*/
			IF curT_ITEM_PROC_COST%ISOPEN = TRUE THEN
				CLOSE curT_ITEM_PROC_COST;
			END IF;

		END IF;

		/* カーソルＣＬＯＳＥ（[在庫評価金額]）*/
		IF curT_STOCK_VAL_H%ISOPEN = TRUE THEN
			CLOSE curT_STOCK_VAL_H;
		END IF;

	END LOOP; /* [品目別原価]の繰り返し */

	/* カーソルＣＬＯＳＥ（[品目別原価]）*/
	IF curT_ITEM_COST%ISOPEN = TRUE THEN
		CLOSE curT_ITEM_COST;
	END IF;

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 終了処理
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	/* 終了メッセージの出力 */
	vc2Comment := SUBSTR('(SBM0559)在庫評価金額書込件数='	  || '[ ' || numCntIntStockValH || ' ]' ||
						 ' 在庫評価金額明細書込件数=' || '[ ' || numCntIntStockVal	|| ' ]',1,256);

	/* 終了メッセージの出力 */
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
	blnRet	:= FNCLOGCLOSE(UTL_FileHandle);

	/* 処理結果 */
	pnumReturn := STATUS_NORMAL;	--エラー件数＝0の場合、1:正常終了

--< 例外処理 >---------------------------------------------------------------
EXCEPTION

	WHEN excERR_SKIP THEN	 --実行不可

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

	WHEN excERR_CURSOR THEN    --カーソル(curUPPER)OPEN中のＤＢエラー

		/* カーソルＣＬＯＳＥ（[品目別原価]）*/
		IF curT_ITEM_COST%ISOPEN = TRUE THEN
			CLOSE curT_ITEM_COST;
		END IF;
		/* カーソルＣＬＯＳＥ（[在庫評価金額]）*/
		IF curT_STOCK_VAL_H%ISOPEN = TRUE THEN
			CLOSE curT_STOCK_VAL_H;
		END IF;
		/* カーソルＣＬＯＳＥ（[品目別加工費]）*/
		IF curT_ITEM_PROC_COST%ISOPEN = TRUE THEN
			CLOSE curT_ITEM_PROC_COST;
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

	WHEN OTHERS  THEN	/* その他のエラー */

		/* カーソルＣＬＯＳＥ（[品目別原価]）*/
		IF curT_ITEM_COST%ISOPEN = TRUE THEN
			CLOSE curT_ITEM_COST;
		END IF;
		/* カーソルＣＬＯＳＥ（[在庫評価金額]）*/
		IF curT_STOCK_VAL_H%ISOPEN = TRUE THEN
			CLOSE curT_STOCK_VAL_H;
		END IF;
		/* カーソルＣＬＯＳＥ（[品目別加工費]）*/
		IF curT_ITEM_PROC_COST%ISOPEN = TRUE THEN
			CLOSE curT_ITEM_PROC_COST;
		END IF;

		ROLLBACK;

		/* 終了メッセージの出力 */
		vc2Comment		:= SUBSTR('PGNAME=' || '[ ' || MY_SQL_NAME || ' ]' ||
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
