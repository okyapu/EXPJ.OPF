CREATE OR REPLACE procedure 	 SQLSTDMATRPROCCOST(
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlStdMatrProcCost.sql,v $
'$Author: shan-xiuqin $
'$Revision: 1.21 $ $Date: 2017/01/09 08:30:13 $
'						 2005.10.24 unicode対応（varchar2を4倍）
'
' 修正履歴
' 2007.02.01 機能強化(４版)
' 2007.08.08 機能強化(５版)
'
' 機能		: 標準材料費・加工費計算処理
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
' 機能説明	: 標準原価計算用の[構成品ワーク]、[購入品マスタ]、[加工費マスタ]、[品目別加工費マスタ]を元に
'			  [品目別原価]の材料費と加工費の計算を行う。
'
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
	MY_SQL_NAME 			VARCHAR2(120) := 'SQLSTDMATRPROCCOST'; --ＰＬ／ＳＱＬ名

	APS_COM_BATCH_START 	VARCHAR2(28) := 'DC01204';
	APS_COM_BATCH_END		VARCHAR2(28) := 'DC01205';
	APS_COM_BATCH_EXP		VARCHAR2(28) := 'DC01206';

	LOGMSG_START_PGNM		VARCHAR2(200) := '(SBM0554)標準材料費・加工費計算処理を開始しました';
	LOGMSG_END_PGNM 		VARCHAR2(200) := '標準材料費・加工費計算処理を終了しました';
	LOGMSG_EXP_PGNM 		VARCHAR2(200) := '標準材料費・加工費計算処理が異常終了しました';

	STATUS_NORMAL			NUMBER		  := 1; 		 -- 正常終了
	STATUS_WARNING			NUMBER		  := 2; 		 -- 警告終了
	STATUS_ERROR			NUMBER		  := 3; 		 -- 異常終了

	OUTSIDE_PROC_CD 		VARCHAR2(4) := NULL;

	/* 変数の定義 */
	UTL_FileHandle			UTL_FILE.FILE_TYPE;    --ファイルハンドル

	numCntTest				NUMBER(11)	 := 0;	   --DEBUG用

	numCountLoop			NUMBER(11)	 := 0;	   --LOOP件数
	numCntUpper 			NUMBER(11)	 := 0;	   /* 対象データ件数(先頭品) */
	numCntLower 			NUMBER(11)	 := 0;	   /* 対象データ件数(下位展開) */
	numCntUpdItemCost		NUMBER(11)	 := 0;	   --正常データ件数(品目別原価)
	numCntUpdItemProcCost	NUMBER(11)	 := 0;	   --正常データ件数(品目別加工費)
	numCntError 			NUMBER(11)	 := 0;	   --原価計算エラー件数
	numCntDummy 			NUMBER(11)	 := 0;	   --件数チェック用
	numCntItemProcCost		NUMBER(11)	 := 0;	   --対象データ件数
	numUpLevelNo			NUMBER(2)	 := 0;	   --UP_LEVEL_NO
	blnRet					BOOLEAN;			   --共通関数の戻値
	vc2Comment				VARCHAR2(1024); 		--メッセージ作成用

	vc2PhaseStartMonth		VARCHAR2(24);			--指定半期の期首月
	vc2PhaseEndMonth		VARCHAR2(24);			--指定半期の期末月

	numCostStatemntNo		T_ITEM_COST.COST_STATEMENT_NO%TYPE; 	--計算出力順
	numOwnMatrCost			T_ITEM_COST.OWN_MATR_COST%TYPE; 		--単品材料費
	numItemInputRatio		T_ITEM_COST.ITEM_INPUT_RATIO%TYPE;		--品目投入指数
	numOwnProcCostSumSum	T_ITEM_COST.OWN_PROC_COST_SUM_ALL%TYPE; 	--自工程加工費(ΣT_ITEM_PROC_COST)
	numMaxUpLevelNo 		T_ITEM_COST.UP_LEVEL_NO%TYPE;			--階層レベル

	vc2CsCalcErrorCd		T_CS_CALC_ERROR.CS_CALC_ERROR_CD%TYPE;	--原価計算エラー番号

	numOwnProcCost01		T_ITEM_PROC_COST.OWN_PROC_COST_01%TYPE;   --自工程加工費
	numOwnProcCost02		T_ITEM_PROC_COST.OWN_PROC_COST_02%TYPE;   --自工程加工費
	numOwnProcCost03		T_ITEM_PROC_COST.OWN_PROC_COST_03%TYPE;   --自工程加工費
	numOwnProcCost04		T_ITEM_PROC_COST.OWN_PROC_COST_04%TYPE;   --自工程加工費
	numOwnProcCost05		T_ITEM_PROC_COST.OWN_PROC_COST_05%TYPE;   --自工程加工費
	numOwnProcCost06		T_ITEM_PROC_COST.OWN_PROC_COST_06%TYPE;   --自工程加工費
	numOwnProcCost07		T_ITEM_PROC_COST.OWN_PROC_COST_07%TYPE;   --自工程加工費
	numOwnProcCost08		T_ITEM_PROC_COST.OWN_PROC_COST_08%TYPE;   --自工程加工費
	numOwnProcCost09		T_ITEM_PROC_COST.OWN_PROC_COST_09%TYPE;   --自工程加工費
	numOwnProcCost10		T_ITEM_PROC_COST.OWN_PROC_COST_10%TYPE;   --自工程加工費
	numOwnProcCost11		T_ITEM_PROC_COST.OWN_PROC_COST_11%TYPE;   --自工程加工費
	numOwnProcCost12		T_ITEM_PROC_COST.OWN_PROC_COST_12%TYPE;   --自工程加工費
	numOwnProcCostSum		T_ITEM_PROC_COST.OWN_PROC_COST_SUM%TYPE;  --自工程加工費

	blnCOST_EXCLUDE_FLG 	BOOLEAN;  --原価除外判定
	blnFoundCsPuch			BOOLEAN;  --データ有無判定(M_CS_PUCH)
	blnLowerSkip			BOOLEAN;  --下位展開しない

	/* 原価管理パラメータからの取得項目 */
	numStartMonth			SYS_COST_CTRL.START_MONTH%TYPE; 	  --年度開始月

	/* 購入品マスタからの取得項目 */
	numUnitCostAcceptTyp	M_CS_PUCH.UNIT_COST_ACCEPT_TYP%TYPE;  --単価採用区分
	numUnitCost 			M_CS_PUCH.UNIT_COST%TYPE;			  --購入単価
	numUnitQty				M_CS_PUCH.PUCH_UNIT_QTY%TYPE;		  --購入品単位数
	numExchRate 			M_CS_PUCH.EXCH_RATE%TYPE;			  --取引為替レート
	numSubUnitCost			M_CS_PUCH.SUB_UNIT_COST%TYPE;		  --第二購入単価
	numSubUnitQty			M_CS_PUCH.SUB_PUCH_UNIT_QTY%TYPE;	  --第二購入品単位数
	numSubExchRate			M_CS_PUCH.SUB_EXCH_RATE%TYPE;		  --第二取引為替レート
	vc2ClasificationCd		M_CS_PUCH.CLASIFICATION_CD%TYPE;	  --品目管理コード
	numOnerousConsFlg		M_CS_PUCH.ONEROUS_CONS_FLG%TYPE;	  --有償支給品フラグ
	numCsPuchTyp			M_CS_PUCH.CS_PUCH_TYP%TYPE; 		   --購入品単価種別
	numCsProcCd				M_CS_PUCH.CS_PROC_CD%TYPE;         --工程コード

	/* 例外処理用変数 */
	excERR_SKIP 		  EXCEPTION;	  --実行不可
	excERR_CURSOR		  EXCEPTION;	  --カーソルOPEN中のEXCEPTION

	/* カーソルの宣言 先頭品*/
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
--		AND   T.COMP_ITEM_CD  BETWEEN 'UMINO' AND 'UMINO' --DEGUG用 UMINO
	;
	recUPPER curUPPER%ROWTYPE;

	/* カーソルの宣言 先頭品(原価除外フラグ)*/
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

	/* カーソルの宣言 下位展開(1先頭品の下位品目全件を階層レベルの降順に展開)*/
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

	/* カーソルの宣言 下位展開(原価除外フラグ)
	   原価計算除外があった場合、それ以降も原価計算除外の為
	   SYS_CONNECT_BY_PATHにより、自分の親情報を取得  */
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

	/* カーソルの宣言  品目別加工費マスタ*/
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

	/* カーソルの宣言 末端品(原価計算除外後)*/
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

	/* カーソルの宣言  PARENT_STATEMENT用*/
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
-- ツリー表は原価計算除外も表示するので、除外品も対象とする。
--	  AND	COST_EXCLUDE_FLG=0	--原価計算除外フラグ
--	  ORDER BY COST_STATEMENT_NO DESC,PARENT_ITEM_CD,ITEM_CD,ROOT_ITEM_CD
	  ;
	recPARENT_STATEMENT curPARENT_STATEMENT%ROWTYPE;

	/* カーソルの宣言  PARENT_STATEMENT用の親*/
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
-- ツリー表は原価計算除外も表示するので、除外品も対象とする。
--	  AND	COST_EXCLUDE_FLG=0	--原価計算除外フラグ
	  GROUP BY ITEM_CD,PS_EDITION
	  ;
	recPARENT_STATEMENT_COMP curPARENT_STATEMENT_COMP%ROWTYPE;

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
	numCntUpper 		   := 0;	 /* 対象データ件数(先頭品)		 */
	numCntLower 		   := 0;	 /* 対象データ件数(下位展開)	 */
	numCntUpdItemCost	   := 0;	 /* 正常データ件数(品目別原価)	 */
	numCntUpdItemProcCost  := 0;	 /* 正常データ件数(品目別加工費) */
	numCntError 		   := 0;	 /* 原価計算エラー件数(原価エラー)	 */

	BEGIN  /* 原価管理パラメータの読込 */
		SELECT	START_MONTH
		  INTO	numStartMonth
		  FROM	SYS_COST_CTRL
		  WHERE  PLANT_CD  =  pvc2PlantCd;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('(SBM0535)1:原価管理パラメータが存在しません。'  ||
								 ' USER_CD=' || '[ ' || pvc2UserId || ' ]' ||
								 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
			RAISE  excERR_SKIP;
	END;  /* 原価管理パラメータの読込 */

	/*	パラメータのチェック (対象年度)*/
	IF	pnumYear  IS  NULL	THEN
		vc2Comment := SUBSTR('(SBM0536)2:パラメータ不正。'  ||
							 ' 対象年度=' || '[ ' || pnumYear || ' ]',1,256);
		RAISE  excERR_SKIP;
	END IF;
	/*	パラメータのチェック (半期区分)*/
	IF	pnumHalfTermTyp  NOT IN (1,2)  THEN
		vc2Comment := SUBSTR('(SBM0218)3:パラメータ不正。'  ||
							 ' 半期区分=' || '[ ' || pnumHalfTermTyp || ' ]',1,256);
		RAISE  excERR_SKIP;
	END IF;

	/*	対象年度/半期区分/年度開始月より、指定半期の期首月/期末月を取得 */
	vc2PhaseStartMonth :=  TO_CHAR(pnumYear + FLOOR((numStartMonth	-1+((pnumHalfTermTyp-1)*6))/12) ||
								   LPAD(MOD((numStartMonth	-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
								  );
	vc2PhaseEndMonth   :=  TO_CHAR(pnumYear + FLOOR((numStartMonth+5-1+((pnumHalfTermTyp-1)*6))/12) ||
								   LPAD(MOD((numStartMonth+5-1+((pnumHalfTermTyp-1)*6)),12)+1 ,2,'0')
								  );

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(先頭品)
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	/* PUT_LINE */
	blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
				  pvc2PlantCd, MY_SQL_NAME, '(SBM0816)DELETE 前回分削除');
	/* PUT_LINE */

	/* 品目別加工費の削除 */
	DELETE	FROM T_ITEM_PROC_COST
		WHERE  YEAR 		 = pnumYear
		  AND  HALF_TERM_TYP = pnumHalfTermTyp
		  AND  COST_TYP 	 = pnumCostTyp
		  AND  PLANT_CD 	 = pvc2PlantCd
	;
	/* 品目別原価の削除 */
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

	BEGIN  /* カーソルOPEN(先頭品) */
		OPEN  curUPPER;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('4:OPEN curUPPER'	||
								 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE  excERR_CURSOR;
	END;  /* カーソルOPEN(先頭品) */

	LOOP  /*  先頭品の繰り返し */

		BEGIN  /* カーソルFETCH(先頭品) */
			FETCH  curUPPER  INTO  recUPPER;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('5:FETCH curUPPER'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* カーソルFETCH(先頭品) */

		EXIT WHEN  curUPPER%NOTFOUND;

		/* PUT_LINE */
		numCntTest := numCntTest + 1;
		IF numCntTest >= 10 THEN
			numCntTest := 0;
			blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, 'MAIN LOOP COMP_ITEM_CD='||recUPPER.COMP_ITEM_CD);
		END IF;
		/* PUT_LINE */

		blnLowerSkip := FALSE;			   /* 下位展開する */
		numCntUpper  := numCntUpper+1;	   /* 対象データ件数(先頭品) */
		numCostStatemntNo  :=  1;		   /* 計算出力順 */

		/* 品目投入指数の算出 */
		IF	recUPPER.DMY_ITEM_FLG = 0  THEN
			numItemInputRatio := 1 + (recUPPER.ITEM_SPOIL/100);
		ELSE
			numItemInputRatio := 1;
		END IF;

/*○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(先頭品)　内作の処理
○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

		IF	recUPPER.OUTSIDE_TYP  =  1	THEN  /* 内作の処理 */

			/* 品目別加工費マスタの存在有無判定 */
			SELECT	COUNT(*)  INTO	numCntDummy  FROM M_ITEM_PROC_COST
			  WHERE  PLANT_CD  = pvc2PlantCd
				AND  ITEM_CD   = recUPPER.COMP_ITEM_CD
				AND  ROWNUM    = 1
			;

/*○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(先頭品)　内作の処理　品目別加工費マスタがある場合
○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

			IF	numCntDummy  >	0  THEN  /* 品目別加工費マスタの存在有り */

				BEGIN  /* カーソルOPEN(品目別加工費マスタ) */
					OPEN  curPROC_COST(recUPPER.COMP_ITEM_CD);
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('6:OPEN curPROC_COST'	||
											 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
						RAISE  excERR_CURSOR;
				END;  /* カーソルOPEN(品目別加工費マスタ) */

				numCntItemProcCost	:= 0;  /* 品目別加工費マスタの件数 */
				numOwnProcCostSumSum  := 0;  /* 自工程加工費(ΣT_ITEM_PROC_COST) */

/*○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(先頭品)　内作の処理　品目別加工費マスタがある場合　品目別加工費の処理
○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

				LOOP  /* 品目別加工費マスタの繰り返し */

					BEGIN  /* カーソルFETCH(品目別加工費マスタ) */
						FETCH  curPROC_COST  INTO  recPROC_COST;
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment	:= SUBSTR('7:FETCH curPROC_COST'  ||
												  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;  /* カーソルFETCH(品目別加工費マスタ) */

					EXIT WHEN  curPROC_COST%NOTFOUND;

					/* 加工費マスタが存在しても、しなくても処理継続する */
--					IF	recPROC_COST.PLANT_CD IS NOT NULL  THEN  /* 加工費マスタが存在する時（工程内作）*/

						numCntItemProcCost	:= numCntItemProcCost + 1;	/* 品目別加工費マスタの件数 */

						/* 自工程加工費算出 */
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

						numOwnProcCostSumSum := numOwnProcCostSumSum + numOwnProcCostSum;  /* 自工程加工費(ΣT_ITEM_PROC_COST) */

						BEGIN  /* 品目別加工費・書き込み */
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

							numCntUpdItemProcCost := numCntUpdItemProcCost+1; --正常データ件数(品目別加工費)

						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment := SUBSTR('8:INSERT T_ITEM_PROC_COST'  ||
													 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
													 ' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
													 ' ITEM_CD='		|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
													 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* 品目別加工費・書き込み */

--					END IF;  /* 加工費マスタが存在する時（工程内作）*/

				END LOOP;  /* 品目別加工費マスタの繰り返し */

/*○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(先頭品)　内作の処理　品目別加工費マスタがある場合　品目別原価の処理
○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

				IF	numCntItemProcCost > 0 THEN  /* 品目別加工費を１件でも書き込んだ時は、品目別原価を更新する。*/

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
						numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
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

				END IF;  /* 品目別加工費を１件でも書き込んだ時は、品目別原価を更新する。*/

/*○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(先頭品)　内作の処理　品目別加工費マスタがある場合
○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

				IF	recPROC_COST.OUTSIDE_TYP = 2 THEN  /* 工程外注の時は、品目別原価を更新する。*/

					BEGIN  /* 購入品マスタ読み込み */
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
					END;  /* 購入品マスタ読み込み */

					IF	blnFoundCsPuch	=  TRUE  THEN  /* 購入品マスタが存在した場合 */

                        --単品材料費の算出
        				IF	numUnitCostAcceptTyp = 1 THEN  --通常単価
        					numOwnMatrCost := CEIL((numUnitCost    * recUPPER.NECESSARY_QTY  * numItemInputRatio
        										   / numUnitQty)   * numExchRate	* 10000) / 10000;
        				ELSE   --第二単価
        					numOwnMatrCost := CEIL((numSubUnitCost * recUPPER.NECESSARY_QTY  * numItemInputRatio
        										  / numSubUnitQty) * numSubExchRate * 10000) / 10000;
        				END IF;

						IF numCsPuchTyp = 1 THEN   /*購入単価種別判定*/

							/*購入単価種別が購入単価の時は単品材料費を更新する。*/
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
								numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
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

							/*購入単価種別が外注単価の時は単品材料費（外注）を更新する。*/
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
								numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
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
						END IF;   /*購入単価種別判定*/

					ELSE  /* 購入品マスタが存在しない場合 */

						IF	recPROC_COST.OUTSIDE_TYP = 2 THEN /* 工程外注の場合 */

							/* 原価計算除外場合の場合はエラーとしない */
							IF	recUPPER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
								recUPPER.COST_UP_TYP	  = 0  OR  /* 原価積上区分 */
								recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
								vc2PhaseStartMonth > TO_CHAR(recUPPER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
								vc2PhaseEndMonth   < TO_CHAR(recUPPER.EFF_PHASE_IN_DATE,'YYYYMM') THEN	/* [原価除外フラグ]更新判定 */

								NULL;

							ELSE  /* [原価除外フラグ]更新判定 */

								/* 原価計算エラー番号の取得 */
								blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
								IF	blnRet	=  FALSE  THEN
									vc2Comment := SUBSTR('11:FNCGETSEQCSCALCERRORCD'  ||
														 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
									RAISE  excERR_CURSOR;
								END IF;

								BEGIN  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */
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
											 ,'DC00207','購入品マスタなし',0
											 ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
											 ,0
									);
									numCntError := numCntError + 1;  --原価計算エラー件数

								EXCEPTION
									WHEN OTHERS THEN
										vc2Comment := SUBSTR('12:INSERT T_CS_CALC_ERROR'  ||
															 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
															 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
										RAISE  excERR_CURSOR;
								END;  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */

							END IF;  /* [原価除外フラグ]更新判定 */
						END IF /* 工程外注の場合 */
						;

					END IF;  /* 購入品マスタが存在した場合 */


				END IF;  /* 工程外注の時は、品目別原価を更新する。*/

				CLOSE curPROC_COST;

/*○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(先頭品)　内作の処理　品目別加工費マスタがない場合
○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

			ELSE  /* 品目別加工費マスタの存在有り */

				blnLowerSkip := TRUE;			  /* 下位展開しない */

				BEGIN  /* 内作で品目別加工費マスタなし */

					/* DC00206エラー時は[最上位品目]単位で原価計算除外	*/
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
				END;  /* 内作で品目別加工費マスタなし */

			END IF; /* 品目別加工費マスタの存在有り */

			numCostStatemntNo  :=  numCostStatemntNo + 1;	  /* 計算出力順 */

/*○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' メイン処理(先頭品)　外作の処理
○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

		ELSE  /* 内作の処理 */

			BEGIN  /* 購入品マスタ読み込み */
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
			END;  /* 購入品マスタ読み込み */

			IF	blnFoundCsPuch	=  TRUE  THEN  /* 購入品マスタが存在した場合 */
				--単品材料費の算出
				IF	numUnitCostAcceptTyp = 1 THEN  --通常単価
					numOwnMatrCost := CEIL((numUnitCost    * recUPPER.NECESSARY_QTY  * numItemInputRatio
										   / numUnitQty)   * numExchRate	* 10000) / 10000;
				ELSE   --第二単価
					numOwnMatrCost := CEIL((numSubUnitCost * recUPPER.NECESSARY_QTY  * numItemInputRatio
										  / numSubUnitQty) * numSubExchRate * 10000) / 10000;
				END IF;

				IF numCsPuchTyp = 1 THEN   /*購入単価種別判定*/

					/*購入単価種別が購入単価の時は単品材料費を書き込む。*/
					BEGIN  /* 品目別原価・書き込み */
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
						numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('15:INSERT T_ITEM_COST'  ||
												 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
												 ' ITEM_CD='		|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;  /* 品目別原価・書き込み */
				ELSE
					/*購入単価種別が外注単価の時は単品材料費（外注）を書き込む。*/
					BEGIN  /* 品目別原価・書き込み */
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
						numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('15:INSERT T_ITEM_COST'  ||
												 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' PARENT_ITEM_CD=' || '[ ' || recUPPER.PARENT_ITEM_CD || ' ]' ||
												 ' ITEM_CD='		|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;  /* 品目別原価・書き込み */
				END IF;   /*購入単価種別判定*/

			ELSE  /* 購入品マスタが存在した場合 */

				blnLowerSkip := TRUE;			  /* 下位展開しない */
				/* 原価計算エラー番号の取得 */
				blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
				IF	blnRet	=  FALSE  THEN
					vc2Comment := SUBSTR('30:FNCGETSEQCSCALCERRORCD'  ||
										 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
					RAISE  excERR_CURSOR;
				END IF;

				BEGIN  /* 原価計算エラー書き込み(外作で購入品マスタなし)  */
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
						 ,'DC00208','外作で購入品マスタなし',0
						 ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
						 ,0
					);
					numCntError := numCntError + 1;  --原価計算エラー件数
					/* DC00208エラー時は[最上位品目]単位で原価計算除外	*/
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
				END;  /* 外作で購入品マスタなし */

			END IF;  /* 購入品マスタが存在した場合 */

			numCostStatemntNo  :=  numCostStatemntNo + 1;	  /* 計算出力順 */

		END IF;  /* 内作の処理 */

/*○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
　　　　' メイン処理(先頭品⇒下位展開)
　　　　' 先頭品処理で致命的エラーがない(blnLowerSkip=FALSE)場合のみ下位展開する。
○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

		IF	blnLowerSkip = FALSE  THEN	/* 先頭品で致命的エラー無し */

		BEGIN  /* カーソルOPEN(下位展開) */
			OPEN  curLOWER(recUPPER.COMP_ITEM_CD);
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('18:OPEN curUPPER'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* カーソルOPEN(下位展開) */

		LOOP  /* 下位展開の繰り返し */
			BEGIN  /* カーソルFETCH(下位展開) */
				FETCH  curLOWER  INTO  recLOWER;
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('19:FETCH curLOWER'  ||
										 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
										 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE  excERR_CURSOR;
			END;  /* カーソルFETCH(下位展開) */

			EXIT WHEN  curLOWER%NOTFOUND;

			numCntLower  :=  numCntLower+1; /* 対象データ件数(下位展開) */

			/* 品目投入指数の算出 */
			IF	recLOWER.DMY_ITEM_FLG = 0  THEN
				numItemInputRatio := 1 + (recLOWER.ITEM_SPOIL/100);
			ELSE
				numItemInputRatio := 1;
			END IF;

/*○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
　　　　' メイン処理(先頭品⇒下位展開)　内作
○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

			IF	recLOWER.OUTSIDE_TYP  =  1	THEN  /* 内作の処理 */

				/* 品目別加工費マスタの存在有無判定 */
				SELECT	COUNT(*)  INTO	numCntDummy  FROM M_ITEM_PROC_COST
				  WHERE  PLANT_CD  = pvc2PlantCd
					AND  ITEM_CD   = recLOWER.COMP_ITEM_CD
					AND  ROWNUM    = 1
				;

/*○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
　　　　' メイン処理(先頭品⇒下位展開)　内作　品目別加工費マスタがある場合
○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

				IF	numCntDummy  >	0  THEN  /* 品目別加工費マスタの存在有り */

					BEGIN  /* カーソルOPEN(品目別加工費マスタ) */
						OPEN  curPROC_COST(recLOWER.COMP_ITEM_CD);
					EXCEPTION
						WHEN OTHERS THEN
							vc2Comment := SUBSTR('20:OPEN curPROC_COST'  ||
												 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
												 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
							RAISE  excERR_CURSOR;
					END;  /* カーソルOPEN(品目別加工費マスタ) */

					numCntItemProcCost	:= 0;  /* 品目別加工費マスタの件数 */
					numOwnProcCostSumSum  := 0;  /* 自工程加工費(ΣT_ITEM_PROC_COST) */

/*○○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
　　　　' メイン処理(先頭品⇒下位展開)　内作　品目別加工費マスタがある場合　品目別加工費の処理
○○○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

					LOOP  /* 品目別加工費マスタの繰り返し */
						BEGIN  /* カーソルFETCH(品目別加工費マスタ) */
							FETCH  curPROC_COST  INTO  recPROC_COST;
						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment := SUBSTR('21:FETCH curPROC_COST'  ||
													 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* カーソルFETCH(品目別加工費マスタ) */

						EXIT WHEN  curPROC_COST%NOTFOUND;

						/* 加工費マスタが存在しても、しなくても処理継続する */
--						IF	recPROC_COST.PLANT_CD IS NOT NULL  THEN  /* 加工費マスタが存在する時（工程内作）*/

							numCntItemProcCost	:= numCntItemProcCost + 1;	/* 品目別加工費マスタの件数 */

							/* 自工程加工費算出 */
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
							numOwnProcCostSumSum := numOwnProcCostSumSum + numOwnProcCostSum;  /* 自工程加工費(ΣT_ITEM_PROC_COST) */

							BEGIN  /* 品目別加工費・書き込み */
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
								numCntUpdItemProcCost := numCntUpdItemProcCost+1; --正常データ件数(品目別加工費)

							EXCEPTION
								WHEN OTHERS THEN
									vc2Comment := SUBSTR('22:INSERT T_ITEM_PROC_COST'  ||
														 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
														 ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
														 ' ITEM_CD='		|| '[ ' || recLOWER.COMP_ITEM_CD   || ' ]' ||
														 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
														 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
									RAISE  excERR_CURSOR;
							END;  /* 品目別加工費・書き込み */

--						END IF;  /* 加工費マスタが存在する時（工程内作）*/

					END LOOP;  /* 品目別加工費マスタの繰り返し */

/*○○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
　　　　' メイン処理(先頭品⇒下位展開)　内作　品目別加工費マスタがある場合　品目別原価の処理
○○○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

					IF	numCntItemProcCost > 0 THEN  /* 品目別加工費を１件でも書き込んだ時は、品目別原価を更新する。*/

						/* 加工費は必ずINSERT */
						BEGIN  /* 品目別原価・書き込み */
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
							numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
						EXCEPTION
							WHEN OTHERS THEN
								 vc2Comment := SUBSTR('23:INSERT T_ITEM_COST'  ||
													  ' ROOT_ITEM_CD='	 || '[ ' || recUPPER.COMP_ITEM_CD	|| ' ]' ||
													  ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
													  ' ITEM_CD='		 || '[ ' || recLOWER.COMP_ITEM_CD	|| ' ]' ||
													  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								 RAISE	excERR_CURSOR;
						END;  /* 品目別原価・書き込み */

					END IF;  /* 品目別加工費を１件でも書き込んだ時は、品目別原価を更新する。*/

/*○○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
　　　　' メイン処理(先頭品⇒下位展開)　内作　品目別加工費マスタがある場合　工程外注の処理
○○○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

					IF	recPROC_COST.OUTSIDE_TYP = 2 THEN  /* 工程外注の時は、品目別原価を更新する。*/

						BEGIN  /* 購入品マスタ読み込み */
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
						END;  /* 購入品マスタ読み込み */

						IF	blnFoundCsPuch	=  TRUE  THEN  /* 購入品マスタが存在した場合 */

                            /* 単品材料費の算出 */
        					IF	numUnitCostAcceptTyp = 1 THEN  --通常単価
        						numOwnMatrCost := CEIL(
        								  (numUnitCost * recLOWER.NECESSARY_QTY * numItemInputRatio / numUnitQty)
        									* numExchRate * 10000) / 10000;
        					ELSE   --第二単価
        						numOwnMatrCost := CEIL(
        								  (numSubUnitCost * recLOWER.NECESSARY_QTY * numItemInputRatio / numSubUnitQty)
        									* numSubExchRate * 10000) / 10000;
                            END IF;
                            
							/*	工程外注は必ずUPDATE */
							IF numCsPuchTyp = 1 THEN   /*購入単価種別判定*/
								/*購入単価種別が購入単価の時は単品材料費を更新する。*/
								BEGIN  /* 品目別原価書き込み１(UPDATE) */
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
									numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
								EXCEPTION
									WHEN OTHERS THEN
										vc2Comment := SUBSTR('24:UPDATE T_ITEM_COST'  ||
															 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
															 ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
															 ' ITEM_CD='		|| '[ ' || recLOWER.COMP_ITEM_CD   || ' ]' ||
															 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
															 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
										RAISE  excERR_CURSOR;
								END;  /* 品目別原価書き込み１(UPDATE) */
						   ELSE
						   		/*購入単価種別が外注単価の時は単品材料費（外注）を更新する。*/
						   		BEGIN  /* 品目別原価書き込み１(UPDATE) */
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
									numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
								EXCEPTION
									WHEN OTHERS THEN
										vc2Comment := SUBSTR('24:UPDATE T_ITEM_COST'  ||
															 ' ROOT_ITEM_CD='	|| '[ ' || recUPPER.COMP_ITEM_CD   || ' ]' ||
															 ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
															 ' ITEM_CD='		|| '[ ' || recLOWER.COMP_ITEM_CD   || ' ]' ||
															 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
															 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
										RAISE  excERR_CURSOR;
								END;  /* 品目別原価書き込み１(UPDATE) */
						   END IF;	 /*購入単価種別判定*/

						ELSE  /* 購入品マスタが存在した場合 */

							/* 原価計算除外場合の場合はエラーとしない */
							IF	recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
								recLOWER.COST_UP_TYP	  = 0  OR  /* 原価積上区分 */
--								recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
								vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
								vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN	/* [原価除外フラグ]更新判定 */

								NULL;

							ELSE  /* [原価除外フラグ]更新判定 */

								/* 原価計算エラー番号の取得 */
								blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
								IF	blnRet	=  FALSE  THEN
									vc2Comment := SUBSTR('25:FNCGETSEQCSCALCERRORCD'  ||
														 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
									RAISE  excERR_CURSOR;
								END IF;

								BEGIN  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */
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
										 ,'DC00207','購入品マスタなし',0
										 ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
										 ,0
									);
									numCntError := numCntError + 1;  --原価計算エラー件数

								EXCEPTION
									WHEN OTHERS THEN
										vc2Comment := SUBSTR('26:INSERT T_CS_CALC_ERROR'  ||
															 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
														 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
										RAISE  excERR_CURSOR;
								END;  /* 原価計算エラー書き込み(工程外注で購入品マスタなし) */

							END IF;  /* [原価除外フラグ]更新判定 */

						END IF;  /* 購入品マスタが存在した場合 */

				   END IF;	/* 工程外注の時は、品目別原価を更新する。*/

				   CLOSE curPROC_COST;

/*○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
　　　　' メイン処理(先頭品⇒下位展開)　内作　品目別加工費マスタがない場合
○○○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

				ELSE  /* 品目別加工費マスタの存在有り */

					/* 原価計算除外場合の場合はエラーとしない */
					IF	recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
						recLOWER.COST_UP_TYP	  = 0  OR  /* 原価積上区分 */
--						recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
						vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
						vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN	/* [原価除外フラグ]更新判定 */

						NULL;

					ELSE  /* [原価除外フラグ]更新判定 */
						/* 原価計算エラー番号の取得 */
						blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
						IF	blnRet	=  FALSE  THEN
							vc2Comment := SUBSTR('27:FNCGETSEQCSCALCERRORCD'  ||
												 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
							RAISE  excERR_CURSOR;
						END IF;

						BEGIN  /* 原価計算エラー書き込み(内作で品目別加工費マスタなし) */
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
								 ,'DC00206','内作で品目別加工費マスタなし',0
								 ,SYSDATE,pvc2UserId,MY_SQL_NAME
								 ,SYSDATE,pvc2UserId,MY_SQL_NAME
								 ,0
							);
							numCntError := numCntError + 1;  --原価計算エラー件数

							/* DC00206エラー時は[最上位品目]単位で原価計算除外	*/
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
						END;  /* 原価計算エラー書き込み(内作で品目別加工費マスタなし) */

					END IF;  /* [原価除外フラグ]更新判定 */

				END IF;  /* 品目別加工費マスタの存在有り */

				numCostStatemntNo  :=  numCostStatemntNo + 1;	  /* 計算出力順 */

/*○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
　　　　' メイン処理(先頭品⇒下位展開)　外作
○○○○○○●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

			ELSE  /* 内作の処理 */

				BEGIN  /* 購入品マスタ読み込み */

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
				END;  /* 購入品マスタ読み込み */

				IF	blnFoundCsPuch	=  TRUE  THEN  /* 購入品マスタが存在した場合 */
					--単品材料費の算出
					IF	numUnitCostAcceptTyp = 1 THEN  --通常単価
						numOwnMatrCost := CEIL(
								  (numUnitCost * recLOWER.NECESSARY_QTY * numItemInputRatio / numUnitQty)
									* numExchRate
								  * 10000) / 10000;
					ELSE   --第二単価
						numOwnMatrCost := CEIL(
								  (numSubUnitCost * recLOWER.NECESSARY_QTY * numItemInputRatio / numSubUnitQty)
									* numSubExchRate
									* 10000) / 10000;
					END IF;
					IF numCsPuchTyp = 1 THEN   /*購入単価種別判定*/

						/*購入単価種別が購入単価の時は単品材料費を書き込む。*/
						BEGIN  /* 品目別原価・書き込み */
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
							numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment	:= SUBSTR('29:INSERT T_ITEM_COST'  ||
													  ' ROOT_ITEM_CD='	 || '[ ' || recUPPER.COMP_ITEM_CD	|| ' ]' ||
													  ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
													  ' ITEM_CD='		 || '[ ' || recLOWER.COMP_ITEM_CD	|| ' ]' ||
													  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* 品目別原価・書き込み */
					ELSE
						/*購入単価種別が外注単価の時は単品材料費（外注）を書き込む。*/
						BEGIN  /* 品目別原価・書き込み */
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
							numCntUpdItemCost := numCntUpdItemCost+1;	  /* 正常データ件数(品目別原価) */
						EXCEPTION
							WHEN OTHERS THEN
								vc2Comment	:= SUBSTR('29:INSERT T_ITEM_COST'  ||
													  ' ROOT_ITEM_CD='	 || '[ ' || recUPPER.COMP_ITEM_CD	|| ' ]' ||
													  ' PARENT_ITEM_CD=' || '[ ' || recLOWER.PARENT_ITEM_CD || ' ]' ||
													  ' ITEM_CD='		 || '[ ' || recLOWER.COMP_ITEM_CD	|| ' ]' ||
													  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
													  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
								RAISE  excERR_CURSOR;
						END;  /* 品目別原価・書き込み */
					END IF;   /*購入単価種別判定*/
				ELSE	/* 購入品マスタが存在した場合 */

					/* 原価計算除外場合の場合はエラーとしない */
					IF	recLOWER.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
						recLOWER.COST_UP_TYP	  = 0  OR  /* 原価積上区分 */
--						recPROC_COST.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
						vc2PhaseStartMonth > TO_CHAR(recLOWER.EFF_PHASE_OUT_DATE,'YYYYMM') OR
						vc2PhaseEndMonth   < TO_CHAR(recLOWER.EFF_PHASE_IN_DATE,'YYYYMM') THEN	/* [原価除外フラグ]更新判定 */

						NULL;

					ELSE  /* [原価除外フラグ]更新判定 */
						/* 原価計算エラー番号の取得 */
						blnRet	:=	FNCGETSEQCSCALCERRORCD(pvc2PlantCd,vc2CsCalcErrorCd);
						IF	blnRet	=  FALSE  THEN
							vc2Comment := SUBSTR('30:FNCGETSEQCSCALCERRORCD'  ||
												 ' PLANT_CD=' || '[ ' || pvc2PlantCd || ' ]',1,256);
							RAISE  excERR_CURSOR;
						END IF;

						BEGIN  /* 原価計算エラー書き込み(外作で購入品マスタなし)  */
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
								 ,'DC00208','外作で購入品マスタなし',0
								 ,SYSDATE,pvc2UserId,MY_SQL_NAME,SYSDATE,pvc2UserId,MY_SQL_NAME
								 ,0
							);
							numCntError := numCntError + 1;  --原価計算エラー件数

							/* DC00208エラー時は[最上位品目]単位で原価計算除外	*/
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
						END;  /* 原価計算エラー書き込み(外作で購入品マスタなし)  */

					END IF;  /* [原価除外フラグ]更新判定 */

				END IF;  /* 購入品マスタが存在した場合 */

				numCostStatemntNo  :=  numCostStatemntNo + 1;	  /* 計算出力順 */

			END IF;  /* 内作の処理 */

		END LOOP;  /* 下位展開の繰り返し */

		CLOSE curLOWER;

		COMMIT;  --COMMITは先頭品ごと

	END IF;  /* 先頭品でエラー */

	END LOOP;  /*  先頭品の繰り返し */

	CLOSE curUPPER;

	COMMIT;

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 後処理①(PARENT_COST_STATEMENT_NOの設定)
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	BEGIN  /* 階層レベル(UP_LEVEL_NO)の最大値を取得 */
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
	END;  /* 階層レベル(UP_LEVEL_NO)の最大値を取得 */

--	  FOR i IN REVERSE 2..99 LOOP  /* UP_LEVEL_NOごとのループ 99(先頭品)から2まで*/
	FOR i IN REVERSE 2..numMaxUpLevelNo LOOP  /* UP_LEVEL_NOごとのループ 99(先頭品)から2まで*/

	BEGIN  /* カーソルOPEN(PARENT_STATEMENT) */
		OPEN  curPARENT_STATEMENT(i);
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment	:= SUBSTR('4:OPEN curPARENT_STATEMENT'	||
								  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE	 excERR_CURSOR;
	END;  /* カーソルOPEN(PARENT_STATEMENT) */

	/* PUT_LINE */
	blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
				  pvc2PlantCd, MY_SQL_NAME, 'PARENT_COST_STATEMENT_NO UP_LEVEL_NO='||i);
	/* PUT_LINE */

	LOOP  /* PARENT_STATEMENTの繰り返し(MAIN LOOP) */

		BEGIN  /* カーソルFETCH(PARENT_STATEMENT) */
			FETCH  curPARENT_STATEMENT	INTO  recPARENT_STATEMENT;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('5:FETCH curPARENT_STATEMENT'	||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* カーソルFETCH(PARENT_STATEMENT) */
		EXIT WHEN  curPARENT_STATEMENT%NOTFOUND;

		/* 子を１セットのみ検索 */
		BEGIN  /* カーソルOPEN(curPARENT_STATEMENT_COMP) */
			OPEN  curPARENT_STATEMENT_COMP(recPARENT_STATEMENT.ROOT_ITEM_CD,recPARENT_STATEMENT.ITEM_CD);
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment	:= SUBSTR('4:OPEN curPARENT_STATEMENT_COMP'  ||
									  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE	 excERR_CURSOR;
		END;  /* カーソルOPEN(curPARENT_STATEMENT_COMP) */

		LOOP  /* curPARENT_STATEMENT_COMPの繰り返し */

			/* 子のPKEYをゲット */
			BEGIN  /* カーソルFETCH(PARENT_STATEMENT) */
				FETCH  curPARENT_STATEMENT_COMP  INTO  recPARENT_STATEMENT_COMP;
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('5:FETCH curPARENT_STATEMENT_COMP'  ||
										 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
										 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE  excERR_CURSOR;
			END;  /* カーソルFETCH(PARENT_STATEMENT) */
			EXIT WHEN  curPARENT_STATEMENT_COMP%NOTFOUND;

			/* 子のPARENT_COST_STATEMENT_NOに親のCOST_STATEMENT_NOをセット */
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

		END LOOP;  /*  curPARENT_STATEMENT_COMPの繰り返し*/

		CLOSE curPARENT_STATEMENT_COMP;  /* カーソルCLOSE(curPARENT_STATEMENT_COMP) */

	END LOOP;  /*  PARENT_STATEMENTの繰り返し (MAIN LOOP)*/

	COMMIT;

	CLOSE curPARENT_STATEMENT;	/* カーソルCLOSE(PARENT_STATEMENT) */

	END LOOP;  /* 階層レベルごとのループ */

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 後処理②(原価除外フラグの更新)
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

	numCntTest := 0;

	BEGIN  /* カーソルOPEN(先頭品(原価除外フラグ)) */
		OPEN  curUPPER_EXCLUDE;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('32:OPEN curUPPER_EXCLUDE'  ||
								 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE  excERR_CURSOR;
	END;  /* カーソルOPEN(先頭品(原価除外フラグ)) */

	LOOP  /*  先頭品(原価除外フラグ)の繰り返し */
		BEGIN
			FETCH  curUPPER_EXCLUDE  INTO  recUPPER_EXCLUDE;  /* カーソルFETCH(先頭品(原価除外フラグ)) */
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

		IF	recUPPER_EXCLUDE.COST_EXCLUDE_FLG = 1  OR  /* 原価計算除外フラグ */
			recUPPER_EXCLUDE.VOLUNT_SPL_FLG   = 1  OR  /* 無償受給品フラグ */
			recUPPER_EXCLUDE.COST_UP_TYP	  = 0  OR  /* 原価積上区分 */
			recUPPER_EXCLUDE.ONEROUS_CONS_FLG = 1  OR  /* 有償支給品フラグ */
			recUPPER_EXCLUDE.DMY_ITEM_FLG = 1	   OR  /* 擬似品目フラグ */
			vc2PhaseStartMonth > TO_CHAR(recUPPER_EXCLUDE.EFF_PHASE_OUT_DATE,'YYYYMM') OR
			vc2PhaseEndMonth   < TO_CHAR(recUPPER_EXCLUDE.EFF_PHASE_IN_DATE,'YYYYMM')
		THEN  /* [原価除外フラグ]更新判定 */

			/* 先頭品が[除外]対象の時はROOT_ITEM_CD単位で除外 */
			UPDATE	T_ITEM_COST  SET
				 COST_EXCLUDE_FLG = 1,MODIFY_COUNT=MODIFY_COUNT+1
			WHERE  YEAR 		  = pnumYear
			  AND  HALF_TERM_TYP  = pnumHalfTermTyp
			  AND  COST_TYP 	  = pnumCostTyp
			  AND  PLANT_CD 	  = pvc2PlantCd
			  AND  ROOT_ITEM_CD   = recUPPER_EXCLUDE.ITEM_CD
			;

		ELSE	/* [原価除外フラグ]更新判定 */

			BEGIN  /*  カーソルOPEN(下位展開(原価除外フラグ)) */
				OPEN  curLOWER_EXCLUDE(recUPPER_EXCLUDE.ITEM_CD);
			EXCEPTION
				WHEN OTHERS THEN
					vc2Comment := SUBSTR('34:OPEN curLOWER_EXCLUDE'  ||
										 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
										 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
					RAISE  excERR_CURSOR;
			END;  /*  カーソルOPEN(下位展開(原価除外フラグ)) */

			LOOP  /*  下位展開(原価除外フラグ)の繰り返し */

				BEGIN  /* カーソルFETCH(下位展開(原価除外フラグ)) */
					FETCH  curLOWER_EXCLUDE  INTO  recLOWER_EXCLUDE;
				EXCEPTION
					WHEN OTHERS THEN
						vc2Comment := SUBSTR('35:FETCH curLOWER_EXCLUDE'  ||
											 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
											 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
						RAISE  excERR_CURSOR;
				END;  /* カーソルFETCH(下位展開(原価除外フラグ)) */

				EXIT WHEN  curLOWER_EXCLUDE%NOTFOUND;

				/* [原価除外フラグ]更新判定 */
				blnCOST_EXCLUDE_FLG := FALSE;  /* 原価除外判定 */
				FOR i IN 1..99 LOOP
					/* 自分自身 XXX(Nﾊﾞｲﾄ)の時、SUBSTRB(XXX,(i-1)*(N+1)+2,N)='?'で判定 */
					/* １世代前 XXX(Nﾊﾞｲﾄ)の時、SUBSTRB(XXX,(i-2)*(N+1)+2,N)='?'で判定 */
					/* ２世代前 XXX(Nﾊﾞｲﾄ)の時、SUBSTRB(XXX,(i-3)*(N+1)+2,N)='?'で判定 */
					/* 無償受給品フラグ(1ﾊﾞｲﾄ)*/
					IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_VOLUNT_SPL_FLG,(i-1)*(1+1)+2,1) IS NULL THEN
						EXIT;
					ELSIF  SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_VOLUNT_SPL_FLG,(i-1)*(1+1)+2,1) =  '1'	THEN
						blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
						EXIT;
					/* 原価積上区分(1ﾊﾞｲﾄ) */
					ELSIF  SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_COST_UP_TYP,(i-1)*(1+1)+2,1) =	'0'  THEN
						blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
						EXIT;
					/* 製品構成有効終了日(8ﾊﾞｲﾄ) */
					ELSIF  vc2PhaseStartMonth > SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_EFF_PHASE_OUT_DATE,(i-1)*(8+1)+2,6) THEN
						blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
						EXIT;
					/* 製品構成有効開始日(8ﾊﾞｲﾄ) */
					ELSIF  vc2PhaseEndMonth < SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_EFF_PHASE_IN_DATE,(i-1)*(8+1)+2,6) THEN
						blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
						EXIT;
					/* 有償支給品フラグ(1ﾊﾞｲﾄ)(と１世代前の擬似品目フラグ/品目内外区分or工程内外区分 ) */
					ELSIF  SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_ONEROUS_CONS_FLG,(i-1)*(1+1)+2,1) =  '1'  THEN
						/* 子の１世代目（通算で２世代目） */
						IF i = 1 THEN
							/* １世代前は先頭品 */
							IF (recUPPER_EXCLUDE.DMY_ITEM_FLG = 0)	AND
							   (recUPPER_EXCLUDE.OUTSIDE_TYP = 2
								OR
								recUPPER_EXCLUDE.PROC_OUTSIDE_TYP = 2 ) THEN
								blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
								EXIT;
							END IF;
						/* 子の２世代目（通算で３世代目） */
						ELSIF i=2 THEN
							/* １世代前 */
							IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_DMY_ITEM_FLG,(i-2)*(1+1)+2,1) =  '0'  THEN
								IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_OUTSIDE_TYP,(i-2)*(1+1)+2,1) =  '2'
									 OR
									SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_PROC_OUTSIDE_TYP,(i-2)*(1+1)+2,1) =  '2'  THEN
									blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
									EXIT;
								END IF;
							/* １世代前が擬似品目の場合は２世代前を検査 */
							ELSE
								/* ２世代前は先頭品 */
								IF	(recUPPER_EXCLUDE.DMY_ITEM_FLG = 0)  AND
									(recUPPER_EXCLUDE.OUTSIDE_TYP = 2
									  OR
									 recUPPER_EXCLUDE.PROC_OUTSIDE_TYP = 2 ) THEN
									blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
									EXIT;
								END IF;
							END IF;
						/* 子の３世代目以降（通算で４世代目以降） */
						ELSE
							/* １世代前 */
							IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_DMY_ITEM_FLG,(i-2)*(1+1)+2,1) =  '0'  THEN
								IF	SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_OUTSIDE_TYP,(i-2)*(1+1)+2,1) =  '2'
									 OR
									SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_PROC_OUTSIDE_TYP,(i-2)*(1+1)+2,1) =  '2'  THEN
									blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
									EXIT;
								END IF;
							/* １世代前が擬似品目の場合は２世代前を検査 */
							ELSE
								/* ２世代前 */
								IF	(SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_DMY_ITEM_FLG,(i-3)*(1+1)+2,1) =  '0')  AND
									(SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_OUTSIDE_TYP,(i-3)*(1+1)+2,1) =  '2'
									  OR
									 SUBSTRB(recLOWER_EXCLUDE.EXCLUDE_PROC_OUTSIDE_TYP,(i-3)*(1+1)+2,1) =  '2') THEN
									blnCOST_EXCLUDE_FLG := TRUE;  /* 原価除外判定 */
									EXIT;
								END IF;
							END IF;
						END IF;
					END IF;
				END LOOP;

				/* [除外]対象ありの場合 */
				IF	blnCOST_EXCLUDE_FLG = TRUE	THEN
					/* [除外]対象以降を[除外]対象とする為、PKEY単位で除外 */
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

			END LOOP;	/*	下位展開(原価除外フラグ)の繰り返し */

			CLOSE curLOWER_EXCLUDE;

		END IF;  /* [原価除外フラグ]更新判定 */

		COMMIT;

	END LOOP;  /*  先頭品(原価除外フラグ)の繰り返し */

	CLOSE curUPPER_EXCLUDE;  /* カーソルCLOSE(先頭品(原価除外フラグ)) */

	COMMIT;

/*●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
' 後処理③(末端品フラグの更新（再設定))
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●*/

/*	レスポンス改善の為、後処理③を廃止(ここから)

	numCntTest := 0;

	BEGIN  /* カーソルOPEN(末端品)
		OPEN  curLOWER_ITEM;
	EXCEPTION
		WHEN OTHERS THEN
			vc2Comment := SUBSTR('36:OPEN curLOWER_ITEM'  ||
								 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
								 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
			RAISE  excERR_CURSOR;
	END;  /* カーソルOPEN(末端品)

	LOOP  /*  末端品の繰り返し

		BEGIN  /* カーソルFETCH(末端品)
			FETCH  curLOWER_ITEM  INTO	recLOWER_ITEM;
		EXCEPTION
			WHEN OTHERS THEN
				vc2Comment := SUBSTR('37:FETCH curLOWER_ITEM'  ||
									 ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
									 ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
				RAISE  excERR_CURSOR;
		END;  /* カーソルFETCH(末端品)

		/* PUT_LINE
		numCntTest := numCntTest + 1;
		IF numCntTest >= 1000 THEN
			numCntTest := 0;
			blnRet :=	FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, 'LOWER_ITEM_FLG ITEM_CD='||recUPPER_EXCLUDE.ITEM_CD);
		END IF;
		/* PUT_LINE

		EXIT WHEN  curLOWER_ITEM%NOTFOUND;

		BEGIN  /* 末端品の再設定
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
		END;  /* 末端品の再設定

	END LOOP;  /*  末端品の繰り返し

	CLOSE curLOWER_ITEM;  /* カーソルCLOSE(末端品)

	COMMIT;
レスポンス改善の為、後処理③を廃止 (ここまで)*/

/* 処理の終了 */

	/* 終了メッセージの出力 */
	vc2Comment := SUBSTR('(SBM0556)　入力件数(先頭品)=' || '[ ' || numCntUpper || ' ]' ||
						 '　入力件数(下位展開)=' || '[ ' || numCntLower || ' ]' ||
						 '　出力件数(品目別原価)=' || '[ ' || numCntUpdItemCost || ' ]' ||
						 '　出力件数(品目別加工費)=' || '[ ' || numCntUpdItemProcCost || ' ]' ||
						 '　エラー件数=' || '[ ' || numCntError || ' ]',1,256);
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

	IF	numCntError = 0 THEN
		pnumReturn := STATUS_NORMAL; --正常終了
	ELSE
		pnumReturn := STATUS_WARNING; --警告終了
	END IF;

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

		/* 終了メッセージの出力 */
		vc2Comment := SUBSTR('(SBM0551) その他のエラーが発生しました'  ||
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
