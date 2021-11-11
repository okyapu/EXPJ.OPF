--********************************************************************
-- SqlUpdateLevelNo.sql	Ver 1.00 ( 2003/0720 NEXS IMA)
--
--	ハイレベル番号設定 PKG	[ SqlUpdateLevelNo.UP_LVL() ]
--
--	Ver1.00	2003/0720 NEW 
--	Ver1.01	2003/0724  
--		・MainのトランザクションファイルLoopで、毎回コミットを切るように変更
--			※SYS_PS_Tでフラグ管理しているため、可能と判断。
--			※Call側は、エラートラップして、エラー時Rollbackのこと。
--	Ver1.02	2003/0802  
--		・各マスタ更新日、更新者、更新数のカラム名修正(S.I)
--	Ver1.03	2003/0809  
--		・COMMITはしないよう修正(S.I)
--
--********************************************************************

-- パッケージ仕様
CREATE OR REPLACE PACKAGE SqlUpdateLevelNo IS

    MY_SQL_NAME      CONSTANT VARCHAR2(100) := 'SQLUPDATELEVELNO';
    
	--ハイレベル番号更新Main								--<< CALL
	PROCEDURE UP_LVL (
		inUSERID 				IN 	VARCHAR2
	) ;

	--指定の構成の親子のLVL番号を比較更新（CountUp方向のみ）	--Lib
	PROCEDURE UP_LVL_PS (
		outSTAT					OUT	NUMBER,				-- 0：Updateしない/1：Updateした
		inPARENT_ITEM_CD 		IN 	VARCHAR2,
		inCOMP_ITEM_CD			IN 	VARCHAR2,
		inUSERID 				IN 	VARCHAR2
	) ;

	--指定の親の上位構成のLVL番号を比較更新（CountUp方向のみ）	--Lib
	PROCEDURE UP_LVL_PS_UPPER (
		inPARENT_ITEM_CD 		IN 	VARCHAR2,
		inUSERID 				IN 	VARCHAR2
	) ;

	--指定の親品目のLVL番号を更新（MAX使用）					--Lib
	--※削除CASE対応
	PROCEDURE UP_LVL_MAX (
		outSTAT					OUT	NUMBER,				-- 0：Updateしない/1：Updateした
		inPARENT_ITEM_CD 		IN 	VARCHAR2,
		inUSERID 				IN 	VARCHAR2
	) ;

	--指定の親の上位構成のLVL番号を比較更新（MAX使用）			--Lib
	--※削除CASE対応
	PROCEDURE UP_LVL_MAX_UPPER (
		inPARENT_ITEM_CD 		IN 	VARCHAR2,
		inUSERID 				IN 	VARCHAR2
	) ;

	--指定品目のレベル番号取得									--Lib
	FUNCTION GET_LVLNO (
		inITEM_CD 		IN 	VARCHAR2
	) RETURN NUMBER ;

END ;
/
