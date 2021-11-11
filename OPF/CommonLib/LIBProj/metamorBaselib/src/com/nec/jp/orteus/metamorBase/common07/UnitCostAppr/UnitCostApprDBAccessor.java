package com.nec.jp.orteus.metamorBase.common07.UnitCostAppr;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.wa.DataObject;

public class UnitCostApprDBAccessor extends DataObject {
	
	/** 購入単価承認依頼読込用のSQL*/
	private String _selectM_PUCH_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "                  							// 処理区分
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "         							// 承認備考
		+"  A.\"ITEM_CD\" AS ITEM_CD, "					   							// 品目番号	 							
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "                							// 品目名
		+"  C.\"VEND_NAME\" AS VEND_NAME, "                							// 取引先名
		+"  A.\"VEND_CD\" AS VEND_CD, "                    							// 取引先コード
		+"  '' AS CUST_NAME, "                             							// 得意先名
		+"  '' AS CUST_CD, "                               							// 得意先コード
		+"  '' AS PROC_NAME, "                             							// 品目作別作業名
		+"  '' AS PROC_CD, "                               							// 品目作別作業コード
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "   // 有効開始日
		+"  A.\"UNIT_COST\" AS UNIT_COST, "                     					// 単価
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "             					// 単価区分
		+"  A.\"PROCESSING_COST\" AS PROCESSING_COST, "         					// 加工費
		+"  A.\"MATERIAL_COST\" AS MATERIAL_COST, "             					// 材料費
		+"  A.\"OTHER_OVERHEADS\" AS OTHER_OVERHEADS, "         					// その他経費
		+"  D.\"CUR_NAME\" AS CUR_NAME, "                       					// 通貨
		+"  A.\"PUCH_SIZE\" AS PUCH_SIZE, "                     					// サイズ
		+"  '' AS ONEROUS_FLG, "                                					// 有償フラグ
		+"  E.\"USER_NAME\" AS REQUEST_BY_NAME, "                					// 依頼者名
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "                   					// 依頼者コード
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "             					// 保留理由
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "                					// 更新数
		+"  '' AS PURPOSE_UNIT_PRICE_TYP "                                          // 用途別単価区分
		+"FROM "   
		+"  M_PUCH_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_VEND_CTRL C, "
		+"  M_CUR D, "
		+"  USER_MST E "
		+"WHERE "
		+"  A.PLANT_CD = ? "
		+"  AND A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND C.CUR_CD = D.CUR_CD "
		+"  AND A.REQUEST_BY = E.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE ";
	
	/** 購入単価ヘッダチェック用のSQL*/
	private String _checkM_PUCH_UNIT_COST_H = "SELECT "
		+" A.EFF_PHASE_IN_DATE "
		+"FROM "
		+"  M_PUCH_UNIT_COST A "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE <> ? "
		+"UNION "
		+"SELECT "
		+"  B.EFF_PHASE_IN_DATE "
		+"FROM "
		+"  M_PUCH_UNIT_COST_APPR B "
		+"WHERE "
		+"  B.COMPANY_CD = ? "
		+"  AND B.VEND_CD = ? "
		+"  AND B.PLANT_CD = ? "
		+"  AND B.ITEM_CD = ? "
		+"  AND B.EFF_PHASE_IN_DATE <> ? "
		+"  AND B.PUCH_SIZE <> ? "
		+"  AND B.STATUS IN (1, 2) ";

	
	/** 支給品単価承認依頼読込用のSQL*/
	private String _selectM_CONS_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "											// 処理区分
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "									// 承認備考
		+"  A.\"ITEM_CD\" AS ITEM_CD, "												// 品目番号	 	
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "                							// 品目名
		+"  C.\"VEND_NAME\" AS VEND_NAME, "                							// 取引先名
		+"  A.\"VEND_CD\" AS VEND_CD, "                    							// 取引先コード
		+"  '' AS CUST_NAME, "                             							// 得意先名
		+"  '' AS CUST_CD, "                               							// 得意先コード
		+"  '' AS PROC_NAME, "                             							// 品目作別作業名
		+"  '' AS PROC_CD, "                               							// 品目作別作業コード
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "   // 有効開始日
		+"  A.\"UNIT_COST\" AS UNIT_COST, "                     					// 単価
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "             					// 単価区分
		+"  '' AS PROCESSING_COST, "         										// 加工費
		+"  '' AS MATERIAL_COST, "            										// 材料費
		+"  '' AS OTHER_OVERHEADS, "         										// その他経費
		+"  D.\"CUR_NAME\" AS CUR_NAME, "                       					// 通貨
		+"  '' AS PUCH_SIZE, "                     									// サイズ
		+"  A.\"ONEROUS_FLG\" AS ONEROUS_FLG, "                                		// 有償フラグ
		+"  E.\"USER_NAME\" AS REQUEST_BY_NAME, "                					// 依頼者名
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "                   					// 依頼者コード
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "             					// 保留理由
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "                					// 更新数
		+"  '' AS PURPOSE_UNIT_PRICE_TYP "                                          // 用途別単価区分
		+"FROM "
		+"  M_CONS_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_VEND_CTRL C, "
		+"  M_CUR D, "
		+"  USER_MST E "
		+"WHERE "
		+"  A.PLANT_CD = ? "
		+"  AND A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND C.CUR_CD = D.CUR_CD "
		+"  AND A.REQUEST_BY = E.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE";
	
	/** 外注単価承認依頼読込用のSQL*/
	private String _selectM_SBCNT_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "											// 処理区分
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "									// 承認備考
		+"  A.\"ITEM_CD\" AS ITEM_CD, "												// 品目番号
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "											// 品目名
		+"  C.\"VEND_NAME\" AS VEND_NAME, "											// 取引先名
		+"  A.\"VEND_CD\" AS VEND_CD, "												// 取引先コード
		+"  '' AS CUST_NAME, "														// 得意先名
		+"  '' AS CUST_CD, "														// 得意先コード
		+"  D.\"PROC_NAME\" AS PROC_NAME, "											// 品目作別作業名
		+"  A.\"PROC_CD\" AS PROC_CD, "												// 品目作別作業コード
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "	// 有効開始日
		+"  A.\"UNIT_COST\" AS UNIT_COST, "											// 単価
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "									// 単価区分
		+"  A.\"PROCESSING_COST\" AS PROCESSING_COST, "								// 加工費
		+"  A.\"MATERIAL_COST\" AS MATERIAL_COST, "									// 材料費
		+"  A.\"OTHER_OVERHEADS\" AS OTHER_OVERHEADS, "								// その他経費
		+"  E.\"CUR_NAME\" AS CUR_NAME, "											// 通貨
		+"  A.\"SBCNT_SIZE\" AS PUCH_SIZE, "										// サイズ
		+"  '' AS ONEROUS_FLG, "													// 有償フラグ
		+"  F.\"USER_NAME\" AS REQUEST_BY_NAME,"									// 依頼者名
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "										// 依頼者コード
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "									// 保留理由
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "									// 更新数
		+"  '' AS PURPOSE_UNIT_PRICE_TYP "                                          // 用途別単価区分
		+"FROM "
		+"  M_SBCNT_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_VEND_CTRL C, "
		+"  M_PROC_GRP D, "
		+"  M_CUR E, "
		+"  USER_MST F "
		+"WHERE "
		+"  A.PLANT_CD = ? "
		+"  AND A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND A.ITEM_CD = D.ITEM_CD "
		+"  AND A.PROC_CD = D.PROC_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND C.CUR_CD = E.CUR_CD "
		+"  AND A.REQUEST_BY = F.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE";
	
	/** 外注単価ヘッダチェック用のSQL*/
	private String _checkM_SBCNT_UNIT_COST_H = "SELECT "
		+" A.EFF_PHASE_IN_DATE "
		+"FROM "
		+"  M_SBCNT_UNIT_COST A "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE <> ? "
		+"UNION "
		+"SELECT "
		+"  B.EFF_PHASE_IN_DATE "
		+"FROM "
		+"  M_SBCNT_UNIT_COST_APPR B "
		+"WHERE "
		+"  B.COMPANY_CD = ? "
		+"  AND B.VEND_CD = ? "
		+"  AND B.PLANT_CD = ? "
		+"  AND B.ITEM_CD = ? "
		+"  AND B.PROC_CD = ? "
		+"  AND B.EFF_PHASE_IN_DATE <> ? "
		+"  AND B.SBCNT_SIZE <> ? "
		+"  AND B.STATUS IN (1, 2) ";


	/** 製品単価承認依頼読込用のSQL*/
	private String _selectM_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "											// 処理区分
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "									// 承認備考
		+"  A.\"ITEM_CD\" AS ITEM_CD, "												// 品目番号
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "											// 品目名
		+"  '' AS VEND_NAME, "														// 取引先名
		+"  '' as VEND_CD, "														// 取引先コード
		+"  C.\"CUST_NAME\" AS CUST_NAME, "											// 得意先名
		+"  A.\"CUST_CD\" as CUST_CD, "												// 得意先コード
		+"  '' AS PROC_NAME, "														// 品目作別作業名
		+"  '' as PROC_CD, "														// 品目作別作業コード
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "	// 有効開始日
		+"  A.\"UNIT_COST\" AS UNIT_COST, "											// 単価
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "									// 単価区分
		+"  '' AS PROCESSING_COST, "												// 加工費
		+"  '' AS MATERIAL_COST, "													// 材料費
		+"  '' AS OTHER_OVERHEADS, "												// その他経費
		+"  D.\"CUR_NAME\" AS CUR_NAME, "											// 通貨
		+"  '' AS SALES_UNIT_SIZE, "														// サイズ
		+"  '' AS ONEROUS_FLG, "													// 有償フラグ
		+"  E.\"USER_NAME\" AS REQUEST_BY_NAME,"									// 依頼者名
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "										// 依頼者コード
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "									// 保留理由
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "									// 更新数
		+"  '' AS PURPOSE_UNIT_PRICE_TYP "                                          // 用途別単価区分
		+"FROM "
		+"  M_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_CUST C, "
		+"  M_CUR D, "
		+"  USER_MST E "
		+"WHERE "
		+"  A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.CUST_CD = C.CUST_CD "
		+"  AND C.CUR_CD = D.CUR_CD "
		+"  AND A.REQUEST_BY = E.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE";
	
	/** 販売単価承認依頼読込用のSQL*/
	private String _selectM_SALES_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "											// 処理区分
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "									// 承認備考
		+"  A.\"ITEM_CD\" AS ITEM_CD, "												// 品目番号
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "											// 品目名
		+"  '' AS VEND_NAME, "														// 取引先名
		+"  '' as VEND_CD, "														// 取引先コード
		+"  C.\"CUST_NAME\" AS CUST_NAME, "											// 得意先名
		+"  A.\"CUST_CD\" as CUST_CD, "												// 得意先コード
		+"  '' AS PROC_NAME, "														// 品目作別作業名
		+"  '' as PROC_CD, "														// 品目作別作業コード
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "	// 有効開始日
		+"  A.\"SALES_UNIT_COST\" AS SALES_UNIT_COST, "							    // 販売単価
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "									// 単価区分
		+"  '' AS PROCESSING_COST, "												// 加工費
		+"  '' AS MATERIAL_COST, "													// 材料費
		+"  '' AS OTHER_OVERHEADS, "												// その他経費
		+"  D.\"CUR_NAME\" AS CUR_NAME, "											// 通貨
		+"  A.SALES_UNIT_SIZE AS SALES_UNIT_SIZE, "		      								// サイズ
		+"  '' AS ONEROUS_FLG, "													// 有償フラグ
		+"  E.\"USER_NAME\" AS REQUEST_BY_NAME,"									// 依頼者名
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "										// 依頼者コード
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "									// 保留理由
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "									// 更新数
		+"  A.\"PURPOSE_UNIT_PRICE_TYP\" AS PURPOSE_UNIT_PRICE_TYP "                // 用途別単価区分
		+"FROM "
		+"  M_SALES_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_CUST C, "
		+"  M_CUR D, "
		+"  USER_MST E "
		+"WHERE "
		+"  A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.CUST_CD = C.CUST_CD "
		+"  AND C.CUR_CD = D.CUR_CD "
		+"  AND A.REQUEST_BY = E.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE";
	
	/** 購入単価承認依頼読込用のSQL*/
	private String _selectM_PUCH_UNIT_COST_APPR_record = "SELECT " 
		+"  A.PROC_TYP AS PROC_TYP, " 												// 処理区分
		+"  A.UNIT_COST AS UNIT_COST, " 											// 単価
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP, " 									// 単価区分
		+"  A.PROCESSING_COST AS PROCESSING_COST, " 								// 加工費
		+"  A.MATERIAL_COST AS MATERIAL_COST, " 									// 材料費
		+"  A.OTHER_OVERHEADS AS OTHER_OVERHEADS "  								// その他経費
		+"FROM " 
		+"  M_PUCH_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.PUCH_SIZE = ? ";
	
	
	/** 支給品単価承認依頼読込用のSQL*/
	private String _selectM_CONS_UNIT_COST_APPR_record = "SELECT " 
		+"  A.PROC_TYP AS PROC_TYP, "  												// 処理区分
		+"  A.UNIT_COST AS UNIT_COST, "												// 単価
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP, "  									// 単価区分 	
		+"  A.ONEROUS_FLG AS ONEROUS_FLG "											// 有償フラグ
		+"FROM " 
		+"  M_CONS_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** 外注単価承認依頼読込用のSQL*/
	private String _selectM_SBCNT_UNIT_COST_APPR_record = "SELECT "
		+"  A.PROC_TYP AS PROC_TYP, "  												// 処理区分
		+"  A.UNIT_COST AS UNIT_COST, " 											// 単価
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP, "   									// 単価区分 	
		+"  A.PROCESSING_COST AS PROCESSING_COST, " 								// 加工費
		+"  A.MATERIAL_COST AS MATERIAL_COST, "										// 材料費
		+"  A.OTHER_OVERHEADS AS OTHER_OVERHEADS "  								// その他経費
		+"FROM " 
		+"  M_SBCNT_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ?"
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SBCNT_SIZE = ? "; 
		
	/** 製品単価承認依頼読込用のSQL*/
	private String _selectM_UNIT_COST_APPR_record = "SELECT " 
		+"A.PROC_TYP AS PROC_TYP, "   												// 処理区分
		+"  A.UNIT_COST AS UNIT_COST, "  											// 単価
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP "    									// 単価区分 
		+"FROM " 
		+"  M_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** 販売単価承認依頼読込用のSQL*/
	private String _selectM_SALES_UNIT_COST_APPR_record = "SELECT " 
		+"A.PROC_TYP AS PROC_TYP, "   												// 処理区分
		+"  A.SALES_UNIT_COST AS SALES_UNIT_COST, "  								// 販売単価
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP "    									// 単価区分 
		+"FROM " 
		+"  M_SALES_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PURPOSE_UNIT_PRICE_TYP = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SALES_UNIT_SIZE = ? ";
		
	/** 購入単価承認依頼更新用のSQL*/
	private String _updateM_PUCH_UNIT_COST_APPR = "UPDATE "
		+"  M_PUCH_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.PUCH_SIZE = ? ";
	
	/** 支給品単価承認依頼更新用のSQL*/
	private String _updateM_CONS_UNIT_COST_APPR = "UPDATE "
		+"  M_CONS_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** 外注単価承認依頼更新用のSQL*/
	private String _updateM_SBCNT_UNIT_COST_APPR = "UPDATE "
		+"  M_SBCNT_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ?"
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SBCNT_SIZE = ? "; 
	
	/** 製品単価承認依頼更新用のSQL*/
	private String _updateM_UNIT_COST_APPR = "UPDATE "
		+"  M_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** 販売単価承認依頼更新用のSQL*/
	private String _updateM_SALES_UNIT_COST_APPR = "UPDATE "
		+"  M_SALES_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PURPOSE_UNIT_PRICE_TYP = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SALES_UNIT_SIZE = ? ";
	
	/** 購入単価登録用のSQL*/
	private String _insertM_PUCH_UNIT_COST ="INSERT INTO M_PUCH_UNIT_COST" 
			+"(COMPANY_CD,VEND_CD,PLANT_CD,ITEM_CD,EFF_PHASE_IN_DATE,PUCH_SIZE,UNIT_COST,UNIT_COST_TYP,PROCESSING_COST,MATERIAL_COST,OTHER_OVERHEADS,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
			+"VALUES (?,?,?,?,?,?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** 支給品単価登録用のSQL*/
	private String _insertM_CONS_UNIT_COST = "INSERT INTO M_CONS_UNIT_COST" 
		+"(COMPANY_CD,VEND_CD,PLANT_CD,ITEM_CD,EFF_PHASE_IN_DATE,UNIT_COST,UNIT_COST_TYP,ONEROUS_FLG,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
		+"VALUES(?,?,?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** 外注単価登録用のSQL*/
	private String _insertM_SBCNT_UNIT_COST ="INSERT INTO M_SBCNT_UNIT_COST" 
			+"(COMPANY_CD,VEND_CD,PLANT_CD,ITEM_CD,PROC_CD,EFF_PHASE_IN_DATE,SBCNT_SIZE,UNIT_COST,UNIT_COST_TYP,PROCESSING_COST,MATERIAL_COST,OTHER_OVERHEADS,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
			+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** 製品単価登録用のSQL*/
	private String _insertM_UNIT_COST = "INSERT INTO M_UNIT_COST " 
			+"(COMPANY_CD,CUST_CD,ITEM_CD,EFF_PHASE_IN_DATE,UNIT_COST,UNIT_COST_TYP,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
			+"VALUES(?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** 販売単価登録用のSQL*/
	private String _insertM_SALES_UNIT_COST = "INSERT INTO M_SALES_UNIT_COST " 
			+"(COMPANY_CD,CUST_CD,ITEM_CD,PURPOSE_UNIT_PRICE_TYP,EFF_PHASE_IN_DATE,SALES_UNIT_SIZE,SALES_UNIT_COST,UNIT_COST_TYP,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
			+"VALUES(?,?,?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** 購入単価更新用のSQL*/
	private String _updateM_PUCH_UNIT_COST ="UPDATE " 
		+"M_PUCH_UNIT_COST A " 
		+"SET " 
		+"  A.UNIT_COST = ?, " 
		+"  A.UNIT_COST_TYP = ?, " 
		+"  A.PROCESSING_COST = ?, " 
		+"  A.MATERIAL_COST = ?, " 
		+"  A.OTHER_OVERHEADS = ?, " 
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 " 
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "	
		+"  AND A.PUCH_SIZE = ? ";

	/** 支給品単価更新用のSQL*/
	private String _updateM_CONS_UNIT_COST = "UPDATE "
		+"M_CONS_UNIT_COST A "
		+"SET "
		+"  A.UNIT_COST = ?, "
		+"  A.UNIT_COST_TYP = ?, "
		+"  A.ONEROUS_FLG = ?, "
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ?";
	
	/** 外注単価更新用のSQL*/
	private String _updateM_SBCNT_UNIT_COST = "UPDATE " 
		+"M_SBCNT_UNIT_COST A "
		+"SET "
		+"  A.UNIT_COST = ?, "
		+"  A.UNIT_COST_TYP = ?, "
		+"  A.PROCESSING_COST = ?, " 
		+"  A.MATERIAL_COST = ?, "
		+"  A.OTHER_OVERHEADS = ?, "
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ?"
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SBCNT_SIZE = ? ";
	
	/** 製品単価更新用のSQL*/
	private String _updateM_UNIT_COST = "UPDATE " 
		+"M_UNIT_COST A "
		+"SET " 
		+"  A.UNIT_COST = ?, "
		+"  A.UNIT_COST_TYP = ?, "
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** 販売単価更新用のSQL*/
	private String _updateM_SALES_UNIT_COST = "UPDATE " 
		+"M_SALES_UNIT_COST A "
		+"SET " 
		+"  A.SALES_UNIT_COST = ?, "
		+"  A.UNIT_COST_TYP = ?, "
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PURPOSE_UNIT_PRICE_TYP = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SALES_UNIT_SIZE = ? ";
	
	/** 購入単価削除用のSQL*/
	private String _deleteM_PUCH_UNIT_COST ="DELETE FROM " 
		+"M_PUCH_UNIT_COST A " 
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "	
		+"  AND A.PUCH_SIZE = ? ";
	
	/** 購入単価ヘッダ削除用のSQL*/
	private String _deleteM_PUCH_UNIT_COST_H ="DELETE FROM " 
		+"M_PUCH_UNIT_COST_H A " 
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? ";
	
	/** 支給品単価削除用のSQL*/
	private String _deleteM_CONS_UNIT_COST = "DELETE FROM " 
		+"M_CONS_UNIT_COST A "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ?";
	
	/** 外注単価削除用のSQL*/
	private String _deleteM_SBCNT_UNIT_COST = "DELETE FROM " 
		+"M_SBCNT_UNIT_COST A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ?"
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SBCNT_SIZE = ? ";
	
	/** 外注単価ヘッダ削除用のSQL*/
	private String _deleteM_SBCNT_UNIT_COST_H = "DELETE FROM " 
		+"M_SBCNT_UNIT_COST_H A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ?"
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? ";
	
	/** 製品単価削除用のSQL*/
	private String _deleteM_UNIT_COST = "DELETE FROM " 
		+"M_UNIT_COST A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** 販売単価削除用のSQL*/
	private String _deleteM_SALES_UNIT_COST = "DELETE FROM " 
		+"M_SALES_UNIT_COST A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PURPOSE_UNIT_PRICE_TYP = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SALES_UNIT_SIZE = ? ";
	
	/** SYSDATE取得用のSQL */
	private String _selectSysDate = 
		"select TO_CHAR(sysdate,'YYYY/MM/DD HH24:MI:SS') from DUAL ";
	
	/** 購入単価承認依頼読込
	 * 
	 * @param plantCD 工場コード
	 * @param status 状態区分
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_PUCH_UNIT_COST_APPR(String plantCD,String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_PUCH_UNIT_COST_APPR);
			selectStmt.setString(1, plantCD);
			selectStmt.setString(2, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 購入単価ヘッダチェック
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return  boolean 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public boolean checkM_PUCH_UNIT_COST_H(UnitCostApprStruct struct) throws SQLException, FoundationException{
		
		PreparedStatement checkStmt = null;
		ResultSet checkRslt = null;
		boolean ret = true;
		try{
			checkStmt = _conn.getConn().prepareStatement(_checkM_PUCH_UNIT_COST_H);
			checkStmt.setString(1,struct.getM_COMPANY_CD());
			checkStmt.setString(2,struct.getM_VEND_CD());
			checkStmt.setString(3,struct.getM_PLANT_CD());
			checkStmt.setString(4,struct.getM_ITEM_CD());
			checkStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			checkStmt.setString(6,struct.getM_COMPANY_CD());
			checkStmt.setString(7,struct.getM_VEND_CD());
			checkStmt.setString(8,struct.getM_PLANT_CD());
			checkStmt.setString(9,struct.getM_ITEM_CD());
			checkStmt.setString(10,struct.getM_EFF_PHASE_IN_DATE());
			checkStmt.setString(11,struct.getM_SIZE());
			checkRslt = checkStmt.executeQuery();
			if(checkRslt.next()== false){
				return false;
			}
			return ret;
		}finally {
			this.closeResultSet(checkRslt);
			this.closePreparedStatement(checkStmt);
		}
		
	}
	
	/** 支給品単価承認依頼読込
	 * 
	 * @param plantCD 工場コード
	 * @param status 状態区分
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_CONS_UNIT_COST_APPR(String plantCD,String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_CONS_UNIT_COST_APPR);
			selectStmt.setString(1, plantCD);
			selectStmt.setString(2, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 外注単価承認依頼読込
	 * 
	 * @param plantCD 工場コード
	 * @param status 状態区分
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_SBCNT_UNIT_COST_APPR(String plantCD,String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_SBCNT_UNIT_COST_APPR);
			selectStmt.setString(1, plantCD);
			selectStmt.setString(2, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 外注単価ヘッダチェック
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return  boolean 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public boolean checkM_SBCNT_UNIT_COST_H(UnitCostApprStruct struct) throws SQLException, FoundationException{
		
		PreparedStatement checkStmt = null;
		ResultSet checkRslt = null;
		boolean ret = true;
		try{
			checkStmt = _conn.getConn().prepareStatement(_checkM_SBCNT_UNIT_COST_H);
			checkStmt.setString(1,struct.getM_COMPANY_CD());
			checkStmt.setString(2,struct.getM_VEND_CD());
			checkStmt.setString(3,struct.getM_PLANT_CD());
			checkStmt.setString(4,struct.getM_ITEM_CD());
			checkStmt.setString(5,struct.getM_PROC_CD());
			checkStmt.setString(6,struct.getM_EFF_PHASE_IN_DATE());
			checkStmt.setString(7,struct.getM_COMPANY_CD());
			checkStmt.setString(8,struct.getM_VEND_CD());
			checkStmt.setString(9,struct.getM_PLANT_CD());
			checkStmt.setString(10,struct.getM_ITEM_CD());
			checkStmt.setString(11,struct.getM_PROC_CD());
			checkStmt.setString(12,struct.getM_EFF_PHASE_IN_DATE());
			checkStmt.setString(13,struct.getM_SIZE());
			checkRslt = checkStmt.executeQuery();
			if(checkRslt.next()== false){
				return false;
			}
			return ret;
		}finally {
			this.closeResultSet(checkRslt);
			this.closePreparedStatement(checkStmt);
		}
		
	}
	
	
	/** 製品単価承認依頼読込
	 * 
	 * @param status 状態区分
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_UNIT_COST_APPR(String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_UNIT_COST_APPR);
			selectStmt.setString(1, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 販売単価承認依頼読込
	 * 
	 * @param status 状態区分
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_SALES_UNIT_COST_APPR(String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_SALES_UNIT_COST_APPR);
			selectStmt.setString(1, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 購入単価承認依頼読込
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_PUCH_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_PUCH_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_VEND_CD());
			selectStmt.setString(3,struct.getM_PLANT_CD());
			selectStmt.setString(4,struct.getM_ITEM_CD());
			selectStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			selectStmt.setString(6,struct.getM_SIZE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
				struct.setM_PROCESSING_COST(selectRslt.getString(4));
				struct.setM_MATERIAL_COST(selectRslt.getString(5));
				struct.setM_OTHER_OVERHEADS(selectRslt.getString(6));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 支給品単価承認依頼読込用
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_CONS_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_CONS_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_VEND_CD());
			selectStmt.setString(3,struct.getM_PLANT_CD());
			selectStmt.setString(4,struct.getM_ITEM_CD());
			selectStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
				struct.setM_ONEROUS_FLG(selectRslt.getString(4));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 外注単価承認依頼読込
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_SBCNT_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_SBCNT_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_VEND_CD());
			selectStmt.setString(3,struct.getM_PLANT_CD());
			selectStmt.setString(4,struct.getM_ITEM_CD());
			selectStmt.setString(5,struct.getM_PROC_CD());
			selectStmt.setString(6,struct.getM_EFF_PHASE_IN_DATE());
			selectStmt.setString(7,struct.getM_SIZE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
				struct.setM_PROCESSING_COST(selectRslt.getString(4));
				struct.setM_MATERIAL_COST(selectRslt.getString(5));
				struct.setM_OTHER_OVERHEADS(selectRslt.getString(6));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 製品単価承認依頼読込
	 * 
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_CUST_CD());
			selectStmt.setString(3,struct.getM_ITEM_CD());
			selectStmt.setString(4,struct.getM_EFF_PHASE_IN_DATE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** 販売単価承認依頼読込
	 * 
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_SALES_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_SALES_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_CUST_CD());
			selectStmt.setString(3,struct.getM_ITEM_CD());
			selectStmt.setString(4,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			selectStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			selectStmt.setString(6,struct.getM_SIZE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * 購入単価承認依頼更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 *  
	 * @throws SQLException 
	 */
	public int updateM_PUCH_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_PUCH_UNIT_COST_APPR);
			updateStmt.setString(1, struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5, struct.getM_UPDATED_BY());
			updateStmt.setString(6, struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7, struct.getM_COMPANY_CD());
			updateStmt.setString(8, struct.getM_VEND_CD());
			updateStmt.setString(9, struct.getM_PLANT_CD());
			updateStmt.setString(10, struct.getM_ITEM_CD());
			updateStmt.setString(11, struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(12, struct.getM_SIZE());

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 支給品単価承認依頼更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_CONS_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_CONS_UNIT_COST_APPR);
			
			updateStmt.setString(1,struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7, struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_VEND_CD());
			updateStmt.setString(9,struct.getM_PLANT_CD());
			updateStmt.setString(10,struct.getM_ITEM_CD());
			updateStmt.setString(11,struct.getM_EFF_PHASE_IN_DATE());
			

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 外注単価承認依頼更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_SBCNT_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_SBCNT_UNIT_COST_APPR);

			updateStmt.setString(1,struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7,struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_VEND_CD());
			updateStmt.setString(9,struct.getM_PLANT_CD());
			updateStmt.setString(10,struct.getM_ITEM_CD());
			updateStmt.setString(11,struct.getM_PROC_CD());
			updateStmt.setString(12,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(13,struct.getM_SIZE());

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 製品単価承認依頼更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_UNIT_COST_APPR);

			updateStmt.setString(1,struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7,struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_CUST_CD());;
			updateStmt.setString(9,struct.getM_ITEM_CD());
			updateStmt.setString(10,struct.getM_EFF_PHASE_IN_DATE());

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 販売単価承認依頼更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_SALES_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_SALES_UNIT_COST_APPR);

			updateStmt.setString(1,struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7,struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_CUST_CD());;
			updateStmt.setString(9,struct.getM_ITEM_CD());
			updateStmt.setString(10,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			updateStmt.setString(11,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(12,struct.getM_SIZE());

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 購入単価登録
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int insertM_PUCH_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_PUCH_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_VEND_CD());
			insertStmt.setString(3,struct.getM_PLANT_CD());
			insertStmt.setString(4,struct.getM_ITEM_CD());;
			insertStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			insertStmt.setString(6,struct.getM_SIZE());
			insertStmt.setString(7,struct.getM_UNIT_COST());
			insertStmt.setString(8,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(9,struct.getM_PROCESSING_COST());
			insertStmt.setString(10,struct.getM_MATERIAL_COST());
			insertStmt.setString(11,struct.getM_OTHER_OVERHEADS());
			insertStmt.setString(12,struct.getM_SYSDATE());
			insertStmt.setString(13,struct.getM_CREATED_BY());
			insertStmt.setString(14,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(15,struct.getM_SYSDATE());
			insertStmt.setString(16,struct.getM_UPDATED_BY());
			insertStmt.setString(17,struct.getM_UPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * 支給品単価登録
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int insertM_CONS_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_CONS_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_VEND_CD());
			insertStmt.setString(3,struct.getM_PLANT_CD());
			insertStmt.setString(4,struct.getM_ITEM_CD());;
			insertStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			insertStmt.setString(6,struct.getM_UNIT_COST());
			insertStmt.setString(7,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(8,struct.getM_ONEROUS_FLG());
			insertStmt.setString(9,struct.getM_SYSDATE());
			insertStmt.setString(10,struct.getM_CREATED_BY());
			insertStmt.setString(11,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(12,struct.getM_SYSDATE());
			insertStmt.setString(13,struct.getM_UPDATED_BY());
			insertStmt.setString(14,struct.getM_UPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * 外注単価登録
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int insertM_SBCNT_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_SBCNT_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_VEND_CD());
			insertStmt.setString(3,struct.getM_PLANT_CD());
			insertStmt.setString(4,struct.getM_ITEM_CD());;
			insertStmt.setString(5,struct.getM_PROC_CD());
			insertStmt.setString(6,struct.getM_EFF_PHASE_IN_DATE());
			insertStmt.setString(7,struct.getM_SIZE());
			insertStmt.setString(8,struct.getM_UNIT_COST());
			insertStmt.setString(9,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(10,struct.getM_PROCESSING_COST());
			insertStmt.setString(11,struct.getM_MATERIAL_COST());
			insertStmt.setString(12,struct.getM_OTHER_OVERHEADS());
			insertStmt.setString(13,struct.getM_SYSDATE());
			insertStmt.setString(14,struct.getM_CREATED_BY());
			insertStmt.setString(15,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(16,struct.getM_SYSDATE());
			insertStmt.setString(17,struct.getM_UPDATED_BY());
			insertStmt.setString(18,struct.getM_UPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * 製品単価登録
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int insertM_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_CUST_CD());
			insertStmt.setString(3,struct.getM_ITEM_CD());
			insertStmt.setString(4,struct.getM_EFF_PHASE_IN_DATE());;
			insertStmt.setString(5,struct.getM_UNIT_COST());
			insertStmt.setString(6,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(7,struct.getM_SYSDATE());
			insertStmt.setString(8,struct.getM_CREATED_BY());
			insertStmt.setString(9,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(10,struct.getM_SYSDATE());
			insertStmt.setString(11,struct.getM_UPDATED_BY());
			insertStmt.setString(12,struct.getM_UPDATED_PRG_NM());

			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * 販売単価登録
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int insertM_SALES_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_SALES_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_CUST_CD());
			insertStmt.setString(3,struct.getM_ITEM_CD());
			insertStmt.setString(4,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			insertStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());;
			insertStmt.setString(6,struct.getM_SIZE());;
			insertStmt.setString(7,struct.getM_UNIT_COST());
			insertStmt.setString(8,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(9,struct.getM_SYSDATE());
			insertStmt.setString(10,struct.getM_CREATED_BY());
			insertStmt.setString(11,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(12,struct.getM_SYSDATE());
			insertStmt.setString(13,struct.getM_UPDATED_BY());
			insertStmt.setString(14,struct.getM_UPDATED_PRG_NM());

			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * 購入単価更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_PUCH_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_PUCH_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_PROCESSING_COST());
			updateStmt.setString(4,struct.getM_MATERIAL_COST());;
			updateStmt.setString(5,struct.getM_OTHER_OVERHEADS());
			updateStmt.setString(6,struct.getM_SYSDATE());
			updateStmt.setString(7,struct.getM_UPDATED_BY());
			updateStmt.setString(8,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(9,struct.getM_COMPANY_CD());
			updateStmt.setString(10,struct.getM_VEND_CD());
			updateStmt.setString(11,struct.getM_PLANT_CD());
			updateStmt.setString(12,struct.getM_ITEM_CD());
			updateStmt.setString(13,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(14,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 支給品単価更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_CONS_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_CONS_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_ONEROUS_FLG());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			
			updateStmt.setString(7,struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_VEND_CD());
			updateStmt.setString(9,struct.getM_PLANT_CD());
			updateStmt.setString(10,struct.getM_ITEM_CD());
			updateStmt.setString(11,struct.getM_EFF_PHASE_IN_DATE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * 外注単価更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_SBCNT_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_SBCNT_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_PROCESSING_COST());
			updateStmt.setString(4,struct.getM_MATERIAL_COST());
			updateStmt.setString(5,struct.getM_OTHER_OVERHEADS());
			updateStmt.setString(6,struct.getM_SYSDATE());
			updateStmt.setString(7,struct.getM_UPDATED_BY());
			updateStmt.setString(8,struct.getM_UPDATED_PRG_NM());
			
			updateStmt.setString(9,struct.getM_COMPANY_CD());
			updateStmt.setString(10,struct.getM_VEND_CD());
			updateStmt.setString(11,struct.getM_PLANT_CD());
			updateStmt.setString(12,struct.getM_ITEM_CD());
			updateStmt.setString(13,struct.getM_PROC_CD());
			updateStmt.setString(14,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(15,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * 製品単価更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_SYSDATE());
			updateStmt.setString(4,struct.getM_UPDATED_BY());
			updateStmt.setString(5,struct.getM_UPDATED_PRG_NM());
			
			updateStmt.setString(6,struct.getM_COMPANY_CD());
			updateStmt.setString(7,struct.getM_CUST_CD());
			updateStmt.setString(8,struct.getM_ITEM_CD());
			updateStmt.setString(9,struct.getM_EFF_PHASE_IN_DATE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 販売単価更新
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int updateM_SALES_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_SALES_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_SYSDATE());
			updateStmt.setString(4,struct.getM_UPDATED_BY());
			updateStmt.setString(5,struct.getM_UPDATED_PRG_NM());
			
			updateStmt.setString(6,struct.getM_COMPANY_CD());
			updateStmt.setString(7,struct.getM_CUST_CD());
			updateStmt.setString(8,struct.getM_ITEM_CD());
			updateStmt.setString(9,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			updateStmt.setString(10,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(11,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 購入単価削除
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_PUCH_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_PUCH_UNIT_COST);

			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			updateStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(6,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 購入単価ヘッダ削除
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_PUCH_UNIT_COST_H(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_PUCH_UNIT_COST_H);

			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 支給品単価削除
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_CONS_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_CONS_UNIT_COST);

			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			updateStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * 外注単価削除
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_SBCNT_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_SBCNT_UNIT_COST);

			
			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			updateStmt.setString(5,struct.getM_PROC_CD());
			updateStmt.setString(6,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(7,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 外注単価ヘッダ削除
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_SBCNT_UNIT_COST_H(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_SBCNT_UNIT_COST_H);

			
			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			updateStmt.setString(5,struct.getM_PROC_CD());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * 製品単価削除
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_UNIT_COST);
			
			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_CUST_CD());
			updateStmt.setString(3,struct.getM_ITEM_CD());
			updateStmt.setString(4,struct.getM_EFF_PHASE_IN_DATE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 販売単価削除
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return 行数
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_SALES_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_SALES_UNIT_COST);
			
			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_CUST_CD());
			updateStmt.setString(3,struct.getM_ITEM_CD());
			updateStmt.setString(4,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			updateStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(6,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * レコードデータをStructに格納して返します
	 * @param rs ResultSet
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @exception FoundationException
	 * @exception SQLException
	 */
	public UnitCostApprStruct next(ResultSet rs) throws FoundationException,SQLException {
		if (rs.next() == false)
			return null;

		UnitCostApprStruct data = new UnitCostApprStruct();

		data.setM_PROC_TYP(getString(1, rs));
		data.setM_APPR_REMARKS(getString(2, rs));
		data.setM_ITEM_CD(getString(3, rs));
		data.setM_ITEM_NAME(getString(4, rs));
		data.setM_VEND_NAME(getString(5, rs));
		data.setM_VEND_CD(getString(6, rs));
		data.setM_CUST_NAME(getString(7, rs));
		data.setM_CUST_CD(getString(8, rs));
		data.setM_PROC_NAME(getString(9, rs));
		data.setM_PROC_CD(getString(10, rs));
		data.setM_EFF_PHASE_IN_DATE(getString(11, rs));
		data.setM_UNIT_COST(getString(12, rs));
		data.setM_UNIT_COST_TYP(getString(13,rs));
		data.setM_PROCESSING_COST(getString(14, rs));
		data.setM_MATERIAL_COST(getString(15, rs));
		data.setM_OTHER_OVERHEADS(getString(16, rs));
		data.setM_CUR_NAME(getString(17, rs));
		data.setM_SIZE(getString(18, rs));
		data.setM_ONEROUS_FLG(getString(19, rs));
		data.setM_REQUEST_BY_NAME(getString(20, rs));
		data.setM_REQUEST_BY(getString(21, rs));
		data.setM_RESERVE_CAUSE(getString(22, rs));
		data.setM_MODIFY_COUNT(getString(23, rs));
		data.setM_PURPOSE_UNIT_PRICE_TYP(getString(24, rs));
		return data;
	}
	
	/**
	 * SYSTEM時刻の取得
	 *
	 * @param  struct 出庫処理データクラス
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public UnitCostApprStruct selectSYSDATE(UnitCostApprStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectSysDate);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			UnitCostApprStruct rtnStruct = new UnitCostApprStruct(struct);

			rtnStruct.setM_SYSDATE( getString(1, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * コンストラクタ
	 */
	public UnitCostApprDBAccessor() {
	}

	/**
	 * 指定のコネクションを持つオブジェクトを構築する
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public UnitCostApprDBAccessor(IDbConnection connect) {
		_conn = connect;
	}

	/**
	 * コネクション設定<BR>
	 * コネクションの参照を無効にする場合、引数にnullを設定すること
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public void setConnection(IDbConnection connect) {
		_conn = connect;
	}

	/** 単価承認処理用コネクション */
	private IDbConnection _conn = null;

	/**
	 * プリペアドステートメントを閉じる
	 *
	 * @param statement 閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				statement = null;
			}
		}
	}

	/**
	 * リザルトセットを閉じる
	 *
	 * @param resultset 閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet resultset) {
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
				resultset = null;
			}
		}
	}
}
