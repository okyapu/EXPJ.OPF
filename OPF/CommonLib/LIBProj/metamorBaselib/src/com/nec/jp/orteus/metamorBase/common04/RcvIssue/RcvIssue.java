/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/RcvIssue/RcvIssue.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.RcvIssue;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * 入庫時在庫更新クラス
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.10 $ $Date: 2012/04/07 06:02:32 $
 */
public class RcvIssue {
	/** DBアクセス用のコネクション */
	private IDbConnection conn = null;

	/** ユーザコード */
	private String sysUserCd = null;
	/** 業務ID */
	private String sysBusinessId = null;
	/** 工場コード */
	private String sysPlantCd = null;

	/** ワーニング格納リスト */
	private List _errorList = new ArrayList();
	/**
	 * メッセージ取得 
	 * @return エラーリスト
	 */
	public List getErrorList()
	{
		return _errorList;
	}
    /** 保管区別入出庫の検索（処理データ取得） */
    private String selectRcvIssue_1Sql =
    	"select"
    		+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD, "
    		+ "  T_RCV_ISSUE.ITEM_CD as ITEM_CD,"
    		+ "  T_RCV_ISSUE.WH_CD as WH_CD,"
    	    + "  T_RCV_ISSUE.LOT_NO as LOT_NO_1"
         	+ "  from "
			+ "  T_RCV_ISSUE "
			+ "  where "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD = ? ";
    
	/** 保管区別入出庫の検索（処理データ取得） */
	private String selectRcvIssueSql =
		"select "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD, "
			+ "  to_char(T_RCV_ISSUE.RCV_ISSUE_TYP) as RCV_ISSUE_TYP, "
			+ "  T_RCV_ISSUE.ITEM_CD as ITEM_CD, "
			+ "  T_RCV_ISSUE.PLANT_CD as PLANT_CD, "
			+ "  T_RCV_ISSUE.WH_CD as WH_CD, "
			+ "  T_RCV_ISSUE.JOB_ODR_CD as JOB_ODR_CD, "
			+ "  to_char(T_RCV_ISSUE.JOB_ODR_DETAIL_NO) as JOB_ODR_DETAIL_NO, "
			+ "  T_RCV_ISSUE.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  to_char(T_RCV_ISSUE.ACPT_NO) as ACPT_NO, "
			+ "  to_char(T_RCV_ISSUE.ACPT_RSLT_CRCT_NO) as ACPT_RSLT_CRCT_NO, "
			+ "  to_char(T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO) as INSPEC_RSLT_CRCT_NO, "
			+ "  T_RCV_ISSUE.WORK_ODR_CD as WORK_ODR_CD, "
			+ "  T_RCV_ISSUE.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  to_char(T_RCV_ISSUE.PARTIAL_PRD_NO) as PARTIAL_PRD_NO, "
			+ "  to_char(T_RCV_ISSUE.OPR_RSLT_CRCT_NO) as OPR_RSLT_CRCT_NO, "
			+ "  T_RCV_ISSUE.ISSUE_INST_CD as ISSUE_INST_CD, "
			+ "  to_char(T_RCV_ISSUE.RCV_ISSUE_QTY) as RCV_ISSUE_QTY, "
			+ "  to_char(T_RCV_ISSUE.RCV_ISSUE_AMOUNT) as RCV_ISSUE_AMOUNT, "
			+ "  to_char(T_RCV_ISSUE.RCV_ISSUE_DATE, 'YYYY/MM/DD') as RCV_ISSUE_DATE, "
			+ "  to_char(T_RCV_ISSUE.RCV_ISSUE_GNR_TYP) as RCV_ISSUE_GNR_TYP, "
			+ "  to_char(T_RCV_ISSUE.RCV_ISSUE_ODD_QTY) as RCV_ISSUE_ODD_QTY, "
			+ "  T_RCV_ISSUE.DEFECT_CAUSE_CD as DEFECT_CAUSE_CD, "
			+ "  to_char(T_RCV_ISSUE.STOCK_UPD_TYP) as STOCK_UPD_TYP, "
			+ "  to_char(T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG) as RCV_ISSUE_CMPLT_FLG, "
			+ "  T_RCV_ISSUE.OD_NO as OD_NO, "
			+ "  T_RCV_ISSUE.VEND_LOT_NO as VEND_LOT_NO, "
			+ "  T_RCV_ISSUE.RCV_ISSUE_COMMENT as RCV_ISSUE_COMMENT, "
			+ "  T_RCV_ISSUE.COMPANY_CD as COMPANY_CD, "
			+ "  T_RCV_ISSUE.VEND_CD as VEND_CD, "
			+ "  to_char(T_RCV_ISSUE.CONS_TYP) as CONS_TYP, "
			+ "  to_char(T_RCV_ISSUE.CONS_EXEC_DATE, 'YYYY/MM/DD') as CONS_EXEC_DATE, "
 			+ "  T_RCV_ISSUE.LOT_NO as LOT_NO "
			+ "from "
			+ "  T_RCV_ISSUE "
			+ "where "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD = ? ";
	/** 保管区別入出庫の検索（前回データ取得 作業計画） */
	private String selectPreviousRcvIssueTypeWorkOdrSql =
		"select "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD "
			+ "from "
			+ "  T_RCV_ISSUE, "
			+ "  ( "
			+ "    select "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP as RCV_ISSUE_TYP, "
			+ "      T_RCV_ISSUE.RCV_ISSUE_GNR_TYP as RCV_ISSUE_GNR_TYP, "
			+ "      T_RCV_ISSUE.PLANT_CD as PLANT_CD, "
			+ "      T_RCV_ISSUE.WORK_ODR_CD as WORK_ODR_CD, "
			+ "      T_RCV_ISSUE.PARTIAL_PRD_NO as PARTIAL_PRD_NO, "
			+ "      max(T_RCV_ISSUE.OPR_RSLT_CRCT_NO) as MAX_OPR_RSLT_CRCT_NO "
			+ "    from "
			+ "      T_RCV_ISSUE "
			+ "    where "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP = 1 "
			+ "      and T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = TO_NUMBER(?) "
			+ "      and T_RCV_ISSUE.WORK_ODR_CD = ? "
			+ "      and T_RCV_ISSUE.PLANT_CD = ? "
			+ "      and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
			+ "      and T_RCV_ISSUE.OPR_RSLT_CRCT_NO < ? "
			+ "    group by "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP, "
			+ "      T_RCV_ISSUE.RCV_ISSUE_GNR_TYP, "
			+ "      T_RCV_ISSUE.PLANT_CD, "
			+ "      T_RCV_ISSUE.WORK_ODR_CD, "
			+ "      T_RCV_ISSUE.PARTIAL_PRD_NO "
			+ "  ) T1 "
			+ "where "
			+ "  T_RCV_ISSUE.RCV_ISSUE_TYP = T1.RCV_ISSUE_TYP "
			+ "  and T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = T1.RCV_ISSUE_GNR_TYP "
			+ "  and T_RCV_ISSUE.PLANT_CD = T1.PLANT_CD "
			+ "  and T_RCV_ISSUE.WORK_ODR_CD = T1.WORK_ODR_CD "
			+ "  and T_RCV_ISSUE.PARTIAL_PRD_NO = T1.PARTIAL_PRD_NO "
			+ "  and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = T1.MAX_OPR_RSLT_CRCT_NO "
			+ "order by "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD DESC" ;
	/** 保管区別入出庫の検索（前回データ取得 発注） */
	private String selectPreviousRcvIssueTypePuchOdrSql =
		"select "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD "
			+ "from "
			+ "  T_RCV_ISSUE, "
			+ "  ( "
			+ "    select "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP as RCV_ISSUE_TYP, "
			+ "      T_RCV_ISSUE.RCV_ISSUE_GNR_TYP as RCV_ISSUE_GNR_TYP, "
			+ "      T_RCV_ISSUE.PLANT_CD as PLANT_CD, "
			+ "      T_RCV_ISSUE.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "      T_RCV_ISSUE.ACPT_NO as ACPT_NO, "
			+ "      max(T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO) as MAX_INSPEC_RSLT_CRCT_NO "
			+ "    from "
			+ "      T_RCV_ISSUE "
			+ "    where "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP = 1 "
			+ "      and T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = TO_NUMBER(?) "
			+ "      and T_RCV_ISSUE.PUCH_ODR_CD = ? "
			+ "      and T_RCV_ISSUE.PLANT_CD = ? "
			+ "      and T_RCV_ISSUE.ACPT_NO = ? "
			+ "      and T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO < ? "
			+ "    group by "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP, "
			+ "      T_RCV_ISSUE.RCV_ISSUE_GNR_TYP, "
			+ "      T_RCV_ISSUE.PLANT_CD, "
			+ "      T_RCV_ISSUE.PUCH_ODR_CD, "
			+ "      T_RCV_ISSUE.ACPT_NO "
			+ "  ) T1 "
			+ "where "
			+ "  T_RCV_ISSUE.RCV_ISSUE_TYP = T1.RCV_ISSUE_TYP "
			+ "  and T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = T1.RCV_ISSUE_GNR_TYP "
			+ "  and T_RCV_ISSUE.PLANT_CD = T1.PLANT_CD "
			+ "  and T_RCV_ISSUE.PUCH_ODR_CD = T1.PUCH_ODR_CD "
			+ "  and T_RCV_ISSUE.ACPT_NO = T1.ACPT_NO "
			+ "  and T_RCV_ISSUE.RCV_ISSUE_QTY > 0  "
			+ "  and T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO = T1.MAX_INSPEC_RSLT_CRCT_NO "
			+ "order by "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD DESC" ;
	/** 保管区別入出庫の登録（入庫取消） */
	private String insertCancelRcvIssueSql =
		"insert into "
			+ "  T_RCV_ISSUE "
			+ "  ( "
			+ "    RCV_ISSUE_CTRL_CD, "
			+ "    RCV_ISSUE_TYP, "
			+ "    ITEM_CD, "
			+ "    PLANT_CD, "
			+ "    WH_CD, "
			+ "    JOB_ODR_CD, "
			+ "    JOB_ODR_DETAIL_NO, "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    ACPT_RSLT_CRCT_NO, "
			+ "    INSPEC_RSLT_CRCT_NO, "
			+ "    WORK_ODR_CD, "
			+ "    WORK_IN_PROC_CD, "
			+ "    PARTIAL_PRD_NO, "
			+ "    OPR_RSLT_CRCT_NO, "
			+ "    ISSUE_INST_CD, "
			+ "    RCV_ISSUE_QTY, "
			+ "    RCV_ISSUE_AMOUNT, "
			+ "    RCV_ISSUE_DATE, "
			+ "    RCV_ISSUE_GNR_TYP, "
			+ "    RCV_ISSUE_ODD_QTY, "
			+ "    DEFECT_CAUSE_CD, "
			+ "    STOCK_UPD_TYP, "
			+ "    RCV_ISSUE_CMPLT_FLG, "
			+ "    OD_NO, "
			+ "    VEND_LOT_NO, "
			+ "    RCV_ISSUE_COMMENT, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    CONS_TYP, "
			+ "    CONS_EXEC_DATE, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT, "
		    + "    LOT_NO"
			+ "  ) "
			+ "select "
			+ "  ? as RCV_ISSUE_CTRL_CD, "
			+ "  1 as RCV_ISSUE_TYP, "
			+ "  T_RCV_ISSUE.ITEM_CD as ITEM_CD, "
			+ "  T_RCV_ISSUE.PLANT_CD as PLANT_CD, "
			+ "  T_RCV_ISSUE.WH_CD as WH_CD, "
			+ "  T_RCV_ISSUE.JOB_ODR_CD as JOB_ODR_CD, "
			+ "  T_RCV_ISSUE.JOB_ODR_DETAIL_NO as JOB_ODR_DETAIL_NO, "
			+ "  T_RCV_ISSUE.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_RCV_ISSUE.ACPT_NO as ACPT_NO, "
			+ "  T_RCV_ISSUE.ACPT_RSLT_CRCT_NO as ACPT_RSLT_CRCT_NO, "
			+ "  T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO as INSPEC_RSLT_CRCT_NO, "
			+ "  T_RCV_ISSUE.WORK_ODR_CD as WORK_ODR_CD, "
			+ "  T_RCV_ISSUE.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_RCV_ISSUE.PARTIAL_PRD_NO as PARTIAL_PRD_NO, "
			+ "  T_RCV_ISSUE.OPR_RSLT_CRCT_NO as OPR_RSLT_CRCT_NO, "
			+ "  T_RCV_ISSUE.ISSUE_INST_CD as ISSUE_INST_CD, "
			+ "  (T_RCV_ISSUE.RCV_ISSUE_QTY * -1) as RCV_ISSUE_QTY, "
			+ "  0 as RCV_ISSUE_AMOUNT, "
			+ "  T_RCV_ISSUE.RCV_ISSUE_DATE as RCV_ISSUE_DATE, "
			+ "  DECODE(T_RCV_ISSUE.RCV_ISSUE_GNR_TYP,11,19,15,16,17,18,11) as RCV_ISSUE_GNR_TYP, "
			+ "  0 as RCV_ISSUE_ODD_QTY, "
			+ "  NULL as DEFECT_CAUSE_CD, "
			+ "  1 as STOCK_UPD_TYP, "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG as RCV_ISSUE_CMPLT_FLG, "
			+ "  T_RCV_ISSUE.OD_NO as OD_NO, "
			+ "  T_RCV_ISSUE.VEND_LOT_NO as VEND_LOT_NO, "
			+ "  T_RCV_ISSUE.RCV_ISSUE_COMMENT as RCV_ISSUE_COMMENT, "
			+ "  T_RCV_ISSUE.COMPANY_CD as COMPANY_CD, "
			+ "  T_RCV_ISSUE.VEND_CD as VEND_CD, "
			+ "  T_RCV_ISSUE.CONS_TYP as CONS_TYP, "
			+ "  NULL as CONS_EXEC_DATE, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT, "
		    + "  T_RCV_ISSUE.LOT_NO as LOT_NO "
			+ "from "
			+ "  T_RCV_ISSUE "
			+ "where "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD = ? ";
	/** 保管区別入出庫の更新 */
	private String updateRcvIssueSql =
		"update "
			+ "  T_RCV_ISSUE "
			+ "set "
			+ "  STOCK_UPD_TYP = 2, "
			+ "  RCV_ISSUE_BEFORE_QTY = ?, "
			+ "  RCV_ISSUE_AFTER_QTY = RCV_ISSUE_QTY + ?, "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_RCV_ISSUE.MODIFY_COUNT + 1) "
			+ "where "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD = ? ";
	/** 保管区別品目在庫の検索 */
	private String selectItemStockSql =
		"select "
			+ "  T_ITEM_STOCK.ITEM_CD as ITEM_CD, "
			+ "  T_ITEM_STOCK.STOCK_ON_HAND_QTY as STOCK_ON_HAND_QTY "
			+ "from "
			+ "  T_ITEM_STOCK "
			+ "where "
			+ "  T_ITEM_STOCK.ITEM_CD = ? "
			+ "  and T_ITEM_STOCK.WH_CD = ? "
			+ "  and T_ITEM_STOCK.PLANT_CD = ? ";
	/** 保管区別品目在庫の登録 */
	private String insertItemStockSql =
		"insert into "
			+ "  T_ITEM_STOCK "
			+ "  ( "
			+ "    ITEM_CD, "
			+ "    WH_CD, "
			+ "    PLANT_CD, "
			+ "    STOCK_ON_HAND_QTY, "
			+ "    DEFECT_QTY, "
			+ "    PRVS_DAYEND_STOCK_QTY, "
			+ "    PRVS_MONTHEND_STOCK_QTY, "
			+ "    PRVS_TERMEND_STOCK_QTY, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "values "
			+ "  ( "
			+ "    ?, "
			+ "    ?, "
			+ "    ?, "
			+ "    to_number(?), "
			+ "    0, "
			+ "    0, "
			+ "    0, "
			+ "    0, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    0 "
			+ "  ) ";
	/** 保管区別品目在庫の更新 */
	private String updateItemStockSql =
		"update "
			+ "  T_ITEM_STOCK "
			+ "set "
			+ "  STOCK_ON_HAND_QTY = (T_ITEM_STOCK.STOCK_ON_HAND_QTY + to_number(?)), "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_ITEM_STOCK.MODIFY_COUNT + 1) "
			+ "where "
			+ "  T_ITEM_STOCK.ITEM_CD = ? "
			+ "  and T_ITEM_STOCK.WH_CD = ? "
			+ "  and T_ITEM_STOCK.PLANT_CD = ? ";
	/** ロット別品目在庫検索 */
	private String selectTLotStockSql =
		"SELECT "
			+ "    ITEM_CD, "
			+ "    WH_CD, "
			+ "    LOT_NO, "
			+ "    PLANT_CD, "
			+ "    STOCK_ON_HAND_QTY, "
			+ "    DEFECT_QTY, "
			+ "    ALCD_QTY "
			+ "FROM "
			+ "  T_LOT_STOCK "
			+ "WHERE "
			+ "  T_LOT_STOCK.ITEM_CD = ? "
			+ "  AND T_LOT_STOCK.WH_CD = ? "
			+ "  AND T_LOT_STOCK.LOT_NO = ? ";
	/** ロット別品目在庫更新 */
	private String updateTLotStockSql =
		"UPDATE "
			+ "  T_LOT_STOCK "
			+ "SET "
			+ "  STOCK_ON_HAND_QTY = ?, "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_LOT_STOCK.MODIFY_COUNT + 1) "
			+ "WHERE "
			+ "  T_LOT_STOCK.ITEM_CD = ? "
			+ "  AND T_LOT_STOCK.WH_CD = ? "
			+ "  AND T_LOT_STOCK.LOT_NO = ? ";
	/** ロット別品目在庫追加 */
	private String insertTLotStockSql =
		"INSERT INTO "
			+ "  T_LOT_STOCK "
			+ "  ( "
			+ "    ITEM_CD, "
			+ "    WH_CD, "
			+ "    LOT_NO, "
			+ "    PLANT_CD, "
			+ "    STOCK_ON_HAND_QTY, "
			+ "    DEFECT_QTY, "
			+ "    ALCD_QTY, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "  VALUES "
			+ "  ( "
			+ "    ?, "
			+ "    ?, "
			+ "    ?, "
			+ "    ?, "
			+ "    to_number(?), "
			+ "    0, "
			+ "    0, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    0 "
			+ "  ) ";
	/** 保管区別製番在庫の検索 */
	private String selectJobOdrCdStockSql =
		"select "
			+ "  T_JOB_ODR_CD_STOCK.ITEM_CD as ITEM_CD, "
			+ "  T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY as STOCK_ON_HAND_QTY "
			+ "from "
			+ "  T_JOB_ODR_CD_STOCK "
			+ "where "
			+ "  T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
			+ "  and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = ? "
			+ "  and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
			+ "  and T_JOB_ODR_CD_STOCK.WH_CD = ? "
			+ "  and T_JOB_ODR_CD_STOCK.PLANT_CD = ? ";
	/** 保管区別製番在庫の登録 */
	private String insertJobOdrCdStockSql =
		"insert into "
			+ "  T_JOB_ODR_CD_STOCK "
			+ "  ( "
			+ "    JOB_ODR_CD, "
			+ "    JOB_ODR_DETAIL_NO, "
			+ "    ITEM_CD, "
			+ "    WH_CD, "
			+ "    PLANT_CD, "
			+ "    STOCK_ON_HAND_QTY, "
			+ "    PRVS_DAYEND_STOCK_QTY, "
			+ "    PRVS_MONTHEND_STOCK_QTY, "
			+ "    PRVS_TERMEND_STOCK_QTY, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "values "
			+ "  ( "
			+ "    ?, "
			+ "    ?, "
			+ "    ?, "
			+ "    ?, "
			+ "    ?, "
			+ "    to_number(?), "
			+ "    0, "
			+ "    0, "
			+ "    0, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    sysdate, "
			+ "    ?, "
			+ "    ?, "
			+ "    0 "
			+ "  ) ";
	/** 保管区別製番在庫の更新 */
	private String updateJobOdrCdStockSql =
		"update "
			+ "  T_JOB_ODR_CD_STOCK "
			+ "set "
			+ "  STOCK_ON_HAND_QTY = (T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY + to_number(?)), "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_JOB_ODR_CD_STOCK.MODIFY_COUNT + 1) "
			+ "where "
			+ "  T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
			+ "  and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = ? "
			+ "  and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
			+ "  and T_JOB_ODR_CD_STOCK.WH_CD = ? "
			+ "  and T_JOB_ODR_CD_STOCK.PLANT_CD = ? ";
	/** 製番計画の更新 */
	private String updateJobOdrSql =
		"update T_JOB_ODR "
			+ "set JOB_ODR_STS_TYP=9 "
			+ "where "
			+ "  T_JOB_ODR.JOB_ODR_CD = ? "
			+ "  and T_JOB_ODR.JOB_ODR_DETAIL_NO = ? "
			+ "  and T_JOB_ODR.JOB_ODR_CANCEL_NO = ? ";
	/** 製番計画の検索 */
	private String selectJobOdrSql =
		"select "
			+ "  to_char(T_JOB_ODR.JOB_ODR_TYP) as JOB_ODR_TYP "
			+ "from "
			+ "  T_JOB_ODR "
			+ "where "
			+ "  T_JOB_ODR.JOB_ODR_CD = ? "
			+ "  and T_JOB_ODR.JOB_ODR_DETAIL_NO = ? "
			+ "  and T_JOB_ODR.JOB_ODR_CANCEL_NO = ? "
			+ "  and T_JOB_ODR.PLANT_CD = ? ";
	/** 所要量の検索 */
	private String selectOdSql =
		"select "
			+ "  T_OD.JOB_ODR_CD as JOB_ODR_CD, "
			+ "  to_char(T_OD.JOB_ODR_DETAIL_NO) as JOB_ODR_DETAIL_NO, "
			+ "  to_char(T_OD.JOB_ODR_CANCEL_NO) as JOB_ODR_CANCEL_NO, "
			+ "  T_OD.PLANT_CD as PLANT_CD, "
			+ "  to_char(T_OD.MRP_ODR_TYP) as MRP_ODR_TYP, "
			+ "  T_OD.PARENT_OD_NO as PARENT_OD_NO, "
			+ "  to_char(T_OD.ODR_QTY) as ODR_QTY, "
			+ "  to_char(T_OD.TOTAL_RCV_QTY) as TOTAL_RCV_QTY, "
			+ "  to_char(T_OD.ODR_STS_TYP) as ODR_STS_TYP "
			+ "from "
			+ "  T_OD "
			+ "where "
			+ "  T_OD.OD_NO = ? "
			+ "  and T_OD.PLANT_CD = ? ";
	/** 保管区別製番在庫の検索（保管区を限定しない） */
	private String selectJobOdrCdStockTypeAllWhSql =
		"select "
			+ "  to_char(sum(T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY)) as SUM_STOCK_ON_HAND_QTY "
			+ "from "
			+ "  T_JOB_ODR_CD_STOCK "
			+ "where "
			+ "  T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
			+ "  and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = ? "
			+ "  and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
			+ "  and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
			+ "group by "
			+ "  T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
			+ "  T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
			+ "  T_JOB_ODR_CD_STOCK.ITEM_CD, "
			+ "  T_JOB_ODR_CD_STOCK.PLANT_CD ";
	/** 製番引当の検索 */
	private String selectJobOdrAlcSql =
		"select "
			+ "  to_char(sum(T_JOB_ODR_ALC.ALCD_QTY - T_JOB_ODR_ALC.ISSUEED_QTY)) as SUM_NON_ISSUE_ALCD_QTY "
			+ "from "
			+ "  T_JOB_ODR_ALC "
			+ "where "
			+ "  T_JOB_ODR_ALC.JOB_ODR_CD = ? "
			+ "  and T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO = ? "
			+ "  and T_JOB_ODR_ALC.ALC_STOCK_TYP = 2 "
			+ "  and T_JOB_ODR_ALC.ITEM_CD = ? "
			+ "  and T_JOB_ODR_ALC.PLANT_CD = ? "
			+ "  and T_JOB_ODR_ALC.ISSUE_CMPLT_FLG = 0 "
			+ "group by "
			+ "  T_JOB_ODR_ALC.JOB_ODR_CD, "
			+ "  T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
			+ "  T_JOB_ODR_ALC.ALC_STOCK_TYP, "
			+ "  T_JOB_ODR_ALC.ITEM_CD, "
			+ "  T_JOB_ODR_ALC.PLANT_CD, "
			+ "  T_JOB_ODR_ALC.ISSUE_CMPLT_FLG ";

// 2007.09.28 add start
	/* [発注残]の検索 */
	private String selectRlsdPuchOdrSql =
		"SELECT"
			+	" RPO.PUCH_ODR_STS_TYP AS PUCH_ODR_STS_TYP"
			+	",RPO.INSPC_CMPLT_FLG AS INSPC_CMPLT_FLG"
			+	" FROM"
			+	" T_RLSD_PUCH_ODR RPO"
			+	" WHERE"
			+	" RPO.PUCH_ODR_CD = ?";
			/* [受入実績]の検索 */
	private String selectAcptRsltSql =
		"SELECT"
			+	" AR.INSPC_WH_CD AS INSPC_WH_CD"
			+	" FROM"
			+	" T_ACPT_RSLT AR"
			+	" WHERE"
			+	" AR.PUCH_ODR_CD = ?"
			+	" AND AR.ACPT_NO = TO_NUMBER(?)";
	/* [保管区別入出庫]登録 */
	private String insertRcvIssueSql =
		"INSERT INTO T_RCV_ISSUE("
			+	"RCV_ISSUE_CTRL_CD"
			+	",RCV_ISSUE_TYP"
			+	",ITEM_CD"
			+	",PLANT_CD"
			+	",WH_CD"
			+	",JOB_ODR_CD"
			+	",JOB_ODR_DETAIL_NO"
			+	",PUCH_ODR_CD"
			+	",ACPT_NO"
			+	",ACPT_RSLT_CRCT_NO"
			+	",INSPEC_RSLT_CRCT_NO"
			+	",WORK_ODR_CD"
			+	",WORK_IN_PROC_CD"
			+	",PARTIAL_PRD_NO"
			+	",OPR_RSLT_CRCT_NO"
			+	",ISSUE_INST_CD"
			+	",RCV_ISSUE_QTY"
			+	",RCV_ISSUE_AMOUNT"
			+	",RCV_ISSUE_DATE"
			+	",RCV_ISSUE_GNR_TYP"
			+	",RCV_ISSUE_ODD_QTY"
			+	",DEFECT_CAUSE_CD"
			+	",STOCK_UPD_TYP"
			+	",RCV_ISSUE_CMPLT_FLG"
			+	",OD_NO"
			+	",VEND_LOT_NO"
			+	",RCV_ISSUE_COMMENT"
			+	",COMPANY_CD"
			+	",VEND_CD"
			+	",CONS_TYP"
			+	",CONS_EXEC_DATE"
			+	",CREATED_DATE"
			+	",CREATED_BY"
			+	",CREATED_PRG_NM"
			+	",UPDATED_DATE"
			+	",UPDATED_BY"
			+	",UPDATED_PRG_NM"
			+	",MODIFY_COUNT"
			+   ",LOT_NO"
			+	")VALUES("
			+	"?"
			+	",TO_NUMBER(?)"
			+	",?"
			+	",?"
			+	",?"
			+	",?"
			+	",TO_NUMBER(?)"
			+	",?"
			+	",TO_NUMBER(?)"
			+	",TO_NUMBER(?)"
			+	",TO_NUMBER(?)"
			+	",?"
			+	",?"
			+	",TO_NUMBER(?)"
			+	",TO_NUMBER(?)"
			+	",?"
			+	",TO_NUMBER(?)"
			+	",TO_NUMBER(?)"
			+	",TO_DATE(?,'YYYY/MM/DD')"
			+	",TO_NUMBER(?)"
			+	",TO_NUMBER(?)"
			+	",?"
			+	",TO_NUMBER(?)"
			+	",TO_NUMBER(?)"
			+	",?"
			+	",?"
			+	",?"
			+	",?"
			+	",?"
			+	",TO_NUMBER(?)"
			+	",TO_DATE(?,'YYYY/MM/DD')"
			+	",SYSDATE"
			+	",?"
			+	",?"
			+	",SYSDATE"
			+	",?"
			+	",?"
			+	",0"
			+   ",?"
			+	")";
	/** 保管区別入出庫の検索（前回データ取得 検査待ち保管区） */
	private String selectPreviousRcvIssueTypeInspcWhSql =
		"select "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD "
			+ "from "
			+ "  T_RCV_ISSUE, "
			+ "  ( "
			+ "    select "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP as RCV_ISSUE_TYP, "
			+ "      T_RCV_ISSUE.RCV_ISSUE_GNR_TYP as RCV_ISSUE_GNR_TYP, "
			+ "      T_RCV_ISSUE.PLANT_CD as PLANT_CD, "
			+ "      T_RCV_ISSUE.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "      T_RCV_ISSUE.ACPT_NO as ACPT_NO, "
			+ "      max(T_RCV_ISSUE.ACPT_RSLT_CRCT_NO) as MAX_ACPT_RSLT_CRCT_NO "
			+ "    from "
			+ "      T_RCV_ISSUE "
			+ "    where "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP = 1 "
			+ "      and T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = TO_NUMBER(?) "
			+ "      and T_RCV_ISSUE.PUCH_ODR_CD = ? "
			+ "      and T_RCV_ISSUE.PLANT_CD = ? "
			+ "      and T_RCV_ISSUE.ACPT_NO = ? "
			+ "      and T_RCV_ISSUE.ACPT_RSLT_CRCT_NO < ? "
			+ "    group by "
			+ "      T_RCV_ISSUE.RCV_ISSUE_TYP, "
			+ "      T_RCV_ISSUE.RCV_ISSUE_GNR_TYP, "
			+ "      T_RCV_ISSUE.PLANT_CD, "
			+ "      T_RCV_ISSUE.PUCH_ODR_CD, "
			+ "      T_RCV_ISSUE.ACPT_NO "
			+ "  ) T1 "
			+ "where "
			+ "  T_RCV_ISSUE.RCV_ISSUE_TYP = T1.RCV_ISSUE_TYP "
			+ "  and T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = T1.RCV_ISSUE_GNR_TYP "
			+ "  and T_RCV_ISSUE.PLANT_CD = T1.PLANT_CD "
			+ "  and T_RCV_ISSUE.PUCH_ODR_CD = T1.PUCH_ODR_CD "
			+ "  and T_RCV_ISSUE.ACPT_NO = T1.ACPT_NO "
			+ "  and T_RCV_ISSUE.RCV_ISSUE_QTY > 0  "
			+ "  and T_RCV_ISSUE.ACPT_RSLT_CRCT_NO = T1.MAX_ACPT_RSLT_CRCT_NO "
			+ "order by "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD DESC" ;
// 2007.09.28 add end

	/**
	 * コンストラクタ
	 * @param connect コネクションがOPENされているIDbConnection
	 * @param userCd ユーザコード
	 * @param busineId 業務ID
	 * @param plantCd 工場コード
	 */
	public RcvIssue(IDbConnection connect, String userCd, String busineId, String plantCd) {
		this.conn = connect;
		this.sysUserCd = userCd;
		this.sysBusinessId = busineId;
		this.sysPlantCd = plantCd;
	}

	/**
	 * 保管区別入出庫テーブルにデータを登録し、手持在庫数を更新します。
	 * @param rcvIssueCtrlCd 保管区コード
	 * @return 在庫が足りない場合false
	 * @throws ParseException
	 * @throws ApsComException
	 * @throws FoundationException 自動採番エラー時にthrowされます。
	 * @throws SQLException DB更新エラー時にthrowされます。
	 */
	public boolean addRcvIssue(String rcvIssueCtrlCd)
		throws ApsComException, FoundationException, SQLException {

		PreparedStatement rcvIssuePS = null;			// [保管区別入出庫](今回入庫)読込用ステートメント
		ResultSet rcvIssueRS = null;					// [保管区別入出庫](今回入庫)格納用データセット
		PreparedStatement odPS = null;					// [所要量]読込用ステートメント
		ResultSet odRS = null;							// [所要量]格納用データセット
		PreparedStatement itemStockPS = null;			// [保管区別品目在庫]読込用ステートメント
		ResultSet itemStockRS = null;					// [保管区別品目在庫]格納用データセット
		PreparedStatement lotStockPS = null;			// [ロット別品目在庫]読込用ステートメント
		ResultSet lotStockRS = null;					// [ロット別品目在庫]格納用データセット
		PreparedStatement jobOdrCdStockPS = null;		// [保管区別製番在庫]読込用ステートメント
		ResultSet jobOdrCdStockRS = null;				// [保管区別製番在庫]格納用データセット
		PreparedStatement previousRcvIssuePS = null;	// [保管区別入出庫](前回入庫)読込用ステートメント
		ResultSet previousRcvIssueRS = null;			// [保管区別入出庫](前回入庫)格納用ステートメント
		PreparedStatement rcvIssuePS1 = null;
		ResultSet rcvIssueRS1 = null;
// 2007.09.28 add start
		PreparedStatement rlsdPuchOdrPS = null;			// [発注残]読込用ステートメント
		ResultSet rlsdPuchOdrRS = null;					// [発注残]格納用データセット
		PreparedStatement acptRsltPS = null;			// [受入実績]読込用ステートメント
		ResultSet acptRsltRS = null;					// [受入実績]格納用データセット
		PreparedStatement insertRcvIssuePS = null;		// [保管区別入出庫]待ち保管区出庫登録用ステートメント

		int sqlResult;
// 2007.09.28 add end

		// 退避用入出庫数
		String saveRcvIssueQty = "";

		try {
			// 保管区別入出庫を検索し、処理に必要なデータを取得
			rcvIssuePS = this.conn.getConn().prepareStatement(this.selectRcvIssueSql);
			rcvIssuePS.setString(1, rcvIssueCtrlCd);
			rcvIssueRS = rcvIssuePS.executeQuery();
			// 保管区別入出庫が存在しない場合は処理終了
			if (!rcvIssueRS.next()) {
				return true;
			}

// 2007.09.28 del start
//			// 入庫処理対象がであるかチェック
//			if (!"1".equals(rcvIssueRS.getString("RCV_ISSUE_TYP"))
//				|| !"11".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
//				return true;
//			}
// 2007.09.28 del end

// 2007.09.28 add strat
			// 入庫区分が1(入庫)以外の場合は処理終了
			if(!"1".equals(rcvIssueRS.getString("RCV_ISSUE_TYP"))) {
				return true;
			}
			// 入出庫発生区分が11(通常入庫)、15(待ち保管区入庫)、17(検査済み入庫)以外の場合処理終了
			if(!"11".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))
			&& !"15".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))
			&& !"17".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
				return true;
			}
// 2007.09.28 add end

			// 保管区コードがNULLの場合は処理終了
			if (rcvIssueRS.getString("WH_CD") == null) {
				return true;
			}

			// 所要量検索
			odPS = this.conn.getConn().prepareStatement(this.selectOdSql);
			odPS.setString(1, rcvIssueRS.getString("OD_NO"));
			odPS.setString(2, rcvIssueRS.getString("PLANT_CD"));
			odRS = odPS.executeQuery();
			// 所要量が存在しない場合は処理終了
			if (!odRS.next()) {
				return true;
			}

			// [所要量]品目手配区分が8(疑似品目)の場合は処理終了
			if ("8".equals(odRS.getString("MRP_ODR_TYP"))) {
				return true;
			}

// 2007.09.28 add start
			// [保管区別入出庫]入出庫発生区分が17(検査済み入庫)の場合は待ち保管区出庫処理を行う
			if("17".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
				// [発注残]検索
				rlsdPuchOdrPS = this.conn.getConn().prepareStatement(this.selectRlsdPuchOdrSql);
				rlsdPuchOdrPS.setString(1, rcvIssueRS.getString("PUCH_ODR_CD"));
				rlsdPuchOdrRS = rlsdPuchOdrPS.executeQuery();
				// [発注残]が存在しない場合は処理終了
				if(!rlsdPuchOdrRS.next()) {
					return true;
				}

				// [受入実績]検索
				acptRsltPS = this.conn.getConn().prepareStatement(this.selectAcptRsltSql);
				acptRsltPS.setString(1, rcvIssueRS.getString("PUCH_ODR_CD"));
				acptRsltPS.setString(2, rcvIssueRS.getString("ACPT_NO"));
				acptRsltRS = acptRsltPS.executeQuery();
				// [受入実績]が存在しない場合は処理終了
				if(!acptRsltRS.next()) {
					return true;
				}

				// 入出庫管理番号採番
				String issueRcvIssueCtrlCd = this.getNumberingRcvIssueCtrlCd();
				// [保管区別入出庫]待ち保管区出庫データ作成
				insertRcvIssuePS = this.conn.getConn().prepareStatement(this.insertRcvIssueSql);
				insertRcvIssuePS.setString(1,  issueRcvIssueCtrlCd);							// 採番した入出庫管理番号
				insertRcvIssuePS.setString(2,  "2");											// 入庫区分(2:出庫)
				insertRcvIssuePS.setString(3,  rcvIssueRS.getString("ITEM_CD"));				// 品目番号
				insertRcvIssuePS.setString(4,  rcvIssueRS.getString("PLANT_CD"));				// 工場コード
				insertRcvIssuePS.setString(5,  acptRsltRS.getString("INSPC_WH_CD"));			// 検査待ち保管区
				insertRcvIssuePS.setString(6,  rcvIssueRS.getString("JOB_ODR_CD"));				// 製番
				insertRcvIssuePS.setString(7,  "0");											// 製番枝番
				insertRcvIssuePS.setString(8,  rcvIssueRS.getString("PUCH_ODR_CD"));			// 発注番号
				insertRcvIssuePS.setString(9,  rcvIssueRS.getString("ACPT_NO"));				// 受入回数
				insertRcvIssuePS.setString(10, "0");											// 受入実績訂正回数
				insertRcvIssuePS.setString(11, rcvIssueRS.getString("INSPEC_RSLT_CRCT_NO"));	// 検査実績訂正回数
				insertRcvIssuePS.setString(12, rcvIssueRS.getString("WORK_ODR_CD"));			// 作業計画番号
				insertRcvIssuePS.setString(13, rcvIssueRS.getString("WORK_IN_PROC_CD"));		// 仕掛作業コード
				insertRcvIssuePS.setString(14, rcvIssueRS.getString("PARTIAL_PRD_NO"));			// 分作回数
				insertRcvIssuePS.setString(15, rcvIssueRS.getString("OPR_RSLT_CRCT_NO"));		// 作業実績訂正回数
				insertRcvIssuePS.setString(16, null);											// 出庫指示番号
				insertRcvIssuePS.setString(17, Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));	// 入出庫数
				insertRcvIssuePS.setString(18, "0");											// 入出庫金額
				insertRcvIssuePS.setString(19, rcvIssueRS.getString("RCV_ISSUE_DATE"));			// 入出庫年月日
				insertRcvIssuePS.setString(20, "25");											// 入出庫発生区分(25:待ち保管区出庫)
				insertRcvIssuePS.setString(21, "0");											// 入出庫端数
				insertRcvIssuePS.setString(22, null);											// 入出庫不良理由コード
				insertRcvIssuePS.setString(23, "1");											// 在庫更新フラグ
				if("9".equals(rlsdPuchOdrRS.getString("PUCH_ODR_STS_TYP"))
				&& "1".equals(rlsdPuchOdrRS.getString("INSPC_CMPLT_FLG"))){
					insertRcvIssuePS.setString(24, "1");										// 入出庫完了フラグ(1:完了)
				} else {
					insertRcvIssuePS.setString(24, "0");										// 入出庫完了フラグ(0:未)
				}
				insertRcvIssuePS.setString(25, rcvIssueRS.getString("OD_NO"));					// オーダデマンド番号
				insertRcvIssuePS.setString(26, rcvIssueRS.getString("VEND_LOT_NO"));			// メーカロット番号
				insertRcvIssuePS.setString(27, null);											// 入出庫備考
				insertRcvIssuePS.setString(28, rcvIssueRS.getString("COMPANY_CD"));				// 会社コード
				insertRcvIssuePS.setString(29, rcvIssueRS.getString("VEND_CD"));				// 取引先コード
				insertRcvIssuePS.setString(30, "0");											// 支給区分
				insertRcvIssuePS.setString(31, null);											// 有償支給実績抽出日
				insertRcvIssuePS.setString(32, this.sysUserCd);									// 作成者
				insertRcvIssuePS.setString(33, this.sysBusinessId);								// 作成プログラム名
				insertRcvIssuePS.setString(34, this.sysUserCd);									// 更新者
				insertRcvIssuePS.setString(35, this.sysBusinessId);								// 更新プログラム名
				insertRcvIssuePS.setString(36, rcvIssueRS.getString("LOT_NO"));				    // ロット番号
				sqlResult = insertRcvIssuePS.executeUpdate();

				// [保管区別入出庫]製番がNULLの場合
				if(rcvIssueRS.getString("JOB_ODR_CD") == null) {

					// [保管区別品目在庫]検索
					itemStockPS = this.conn.getConn().prepareStatement(this.selectItemStockSql);
					itemStockPS.setString(1, rcvIssueRS.getString("ITEM_CD"));
					itemStockPS.setString(2, acptRsltRS.getString("INSPC_WH_CD"));
					itemStockPS.setString(3, rcvIssueRS.getString("PLANT_CD"));
					itemStockRS = itemStockPS.executeQuery();
					if (itemStockRS.next()) {
						// 入出庫数を退避
						saveRcvIssueQty = itemStockRS.getString("STOCK_ON_HAND_QTY");

						// 保管区別品目在庫の更新
						this.updateItemStock(
							rcvIssueRS.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRS.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
					} else {
						// 入出庫数を退避(ないから０)
						saveRcvIssueQty = "0";

						// 保管区別品目在庫の登録
						this.insertItemStock(
							rcvIssueRS.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRS.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
					}
					if (rcvIssueRS.getString("LOT_NO") != null) {
						//ロット別品目在庫の更新
						// [ロット別品目在庫]検索
						lotStockPS = this.conn.getConn().prepareStatement(this.selectTLotStockSql);
						lotStockPS.setString(1, rcvIssueRS.getString("ITEM_CD"));
						lotStockPS.setString(2, acptRsltRS.getString("INSPC_WH_CD"));
						lotStockPS.setString(3, rcvIssueRS.getString("LOT_NO"));
						lotStockRS = lotStockPS.executeQuery();
						if (lotStockRS.next()) {
							// ロット別品目在庫の更新
							this.updateTLotStock(
								rcvIssueRS.getString("ITEM_CD"),
								acptRsltRS.getString("INSPC_WH_CD"),
								rcvIssueRS.getString("LOT_NO"),
								Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1")));
						} else {
							// ロット別品目在庫の登録
							this.insertTLotStock(
								rcvIssueRS.getString("ITEM_CD"),
								acptRsltRS.getString("INSPC_WH_CD"),
								rcvIssueRS.getString("LOT_NO"),
								rcvIssueRS.getString("PLANT_CD"),
								Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
						}
					}
				// [保管区別入出庫]製番がNULL以外の場合
				} else {

					// [保管区別製番在庫]検索
					jobOdrCdStockPS = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
					jobOdrCdStockPS.setString(1, rcvIssueRS.getString("JOB_ODR_CD"));
					jobOdrCdStockPS.setString(2, rcvIssueRS.getString("JOB_ODR_DETAIL_NO"));
					jobOdrCdStockPS.setString(3, rcvIssueRS.getString("ITEM_CD"));
					jobOdrCdStockPS.setString(4, acptRsltRS.getString("INSPC_WH_CD"));
					jobOdrCdStockPS.setString(5, rcvIssueRS.getString("PLANT_CD"));
					jobOdrCdStockRS = jobOdrCdStockPS.executeQuery();
					if (jobOdrCdStockRS.next()) {
						// 入出庫数を退避
						saveRcvIssueQty = jobOdrCdStockRS.getString("STOCK_ON_HAND_QTY");

						// 保管区別製番在庫の更新
						this.updateJobOdrCdStock(
							rcvIssueRS.getString("JOB_ODR_CD"),
							rcvIssueRS.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRS.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRS.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
					} else {
						// 入出庫数を退避(ないから０)
						saveRcvIssueQty = "0";

						// 保管区別製番在庫の登録
						this.insertJobOdrCdStock(
							rcvIssueRS.getString("JOB_ODR_CD"),
							rcvIssueRS.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRS.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRS.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
					}
				}

				// 保管区別入出庫の更新
				this.updateRcvIssue(issueRcvIssueCtrlCd, saveRcvIssueQty);
				saveRcvIssueQty = "0";

			}
// 2007.09.28 add end

			// 製番をチェックして、品目在庫か製番在庫を更新する。
			if (rcvIssueRS.getString("JOB_ODR_CD") == null) {
				// レコードの存在チェック
				itemStockPS = this.conn.getConn().prepareStatement(this.selectItemStockSql);
				itemStockPS.setString(1, rcvIssueRS.getString("ITEM_CD"));
				itemStockPS.setString(2, rcvIssueRS.getString("WH_CD"));
				itemStockPS.setString(3, rcvIssueRS.getString("PLANT_CD"));
				itemStockRS = itemStockPS.executeQuery();
				if (itemStockRS.next()) {
					// 入出庫数を退避
					saveRcvIssueQty = itemStockRS.getString("STOCK_ON_HAND_QTY");

					// 保管区別品目在庫の更新
					this.updateItemStock(
						rcvIssueRS.getString("ITEM_CD"),
						rcvIssueRS.getString("WH_CD"),
						rcvIssueRS.getString("PLANT_CD"),
						rcvIssueRS.getString("RCV_ISSUE_QTY"));
				} else {
					// 入出庫数を退避(ないから０)
					saveRcvIssueQty = "0";

					// 保管区別品目在庫の登録
					this.insertItemStock(
						rcvIssueRS.getString("ITEM_CD"),
						rcvIssueRS.getString("WH_CD"),
						rcvIssueRS.getString("PLANT_CD"),
						rcvIssueRS.getString("RCV_ISSUE_QTY"));
				}
                if(rcvIssueRS.getString("LOT_NO") != null){
					//ロット別品目在庫の更新
					// [ロット別品目在庫]検索
					lotStockPS = this.conn.getConn().prepareStatement(this.selectTLotStockSql);
					lotStockPS.setString(1, rcvIssueRS.getString("ITEM_CD"));
					lotStockPS.setString(2, rcvIssueRS.getString("WH_CD"));
					lotStockPS.setString(3, rcvIssueRS.getString("LOT_NO"));
					lotStockRS = lotStockPS.executeQuery();
					if (lotStockRS.next()) {
						if (Calculate.compare(Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),rcvIssueRS.getString("RCV_ISSUE_QTY")),"0") < 0){
							_errorList.add("AE20606");
						}
						// ロット別品目在庫の更新
						this.updateTLotStock(
							rcvIssueRS.getString("ITEM_CD"),
							rcvIssueRS.getString("WH_CD"),
							rcvIssueRS.getString("LOT_NO"),
							Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),rcvIssueRS.getString("RCV_ISSUE_QTY")));
					} else {
						if (Calculate.compare(rcvIssueRS.getString("RCV_ISSUE_QTY"),"0") < 0){
							_errorList.add("AE20606");
						}
						// ロット別品目在庫の登録
						this.insertTLotStock(
							rcvIssueRS.getString("ITEM_CD"),
							rcvIssueRS.getString("WH_CD"),
							rcvIssueRS.getString("LOT_NO"),
							rcvIssueRS.getString("PLANT_CD"),
							rcvIssueRS.getString("RCV_ISSUE_QTY"));
					}
                }
			} else {
				// レコードの存在チェック
				jobOdrCdStockPS = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
				jobOdrCdStockPS.setString(1, rcvIssueRS.getString("JOB_ODR_CD"));
				jobOdrCdStockPS.setString(2, rcvIssueRS.getString("JOB_ODR_DETAIL_NO"));
				jobOdrCdStockPS.setString(3, rcvIssueRS.getString("ITEM_CD"));
				jobOdrCdStockPS.setString(4, rcvIssueRS.getString("WH_CD"));
				jobOdrCdStockPS.setString(5, rcvIssueRS.getString("PLANT_CD"));
				jobOdrCdStockRS = jobOdrCdStockPS.executeQuery();
				if (jobOdrCdStockRS.next()) {
					// 入出庫数を退避
					saveRcvIssueQty = jobOdrCdStockRS.getString("STOCK_ON_HAND_QTY");

					// 保管区別製番在庫の更新
					this.updateJobOdrCdStock(
						rcvIssueRS.getString("JOB_ODR_CD"),
						rcvIssueRS.getString("JOB_ODR_DETAIL_NO"),
						rcvIssueRS.getString("ITEM_CD"),
						rcvIssueRS.getString("WH_CD"),
						rcvIssueRS.getString("PLANT_CD"),
						rcvIssueRS.getString("RCV_ISSUE_QTY"));
				} else {
					// 入出庫数を退避(ないから０)
					saveRcvIssueQty = "0";

					// 保管区別製番在庫の登録
					this.insertJobOdrCdStock(
						rcvIssueRS.getString("JOB_ODR_CD"),
						rcvIssueRS.getString("JOB_ODR_DETAIL_NO"),
						rcvIssueRS.getString("ITEM_CD"),
						rcvIssueRS.getString("WH_CD"),
						rcvIssueRS.getString("PLANT_CD"),
						rcvIssueRS.getString("RCV_ISSUE_QTY"));
				}
			}

// 2007.09.28 add start
			// 入出庫発生区分が15(待ち保管区入庫)以外の場合に所要量と製番計画の更新を行う
			if(!"15".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
// 2007.09.28 add end

				// 所要量の更新
				CommonOd co =
					new CommonOd(this.conn, this.sysPlantCd, this.sysUserCd, this.sysBusinessId);
				double rcvIssueQty =
					new BigDecimal(rcvIssueRS.getString("RCV_ISSUE_QTY")).doubleValue();
				co.updateOrderForReceive(rcvIssueRS.getString("OD_NO"), rcvIssueQty, -1);

				// 製番計画の更新
				if (("1".equals(odRS.getString("MRP_ODR_TYP"))
					|| "2".equals(odRS.getString("MRP_ODR_TYP")))
					&& (odRS.getString("PARENT_OD_NO") == null)
					&& ("9".equals(odRS.getString("ODR_STS_TYP")))) {
					this.updateJobOdr(
						odRS.getString("JOB_ODR_CD"),
						odRS.getString("JOB_ODR_DETAIL_NO"),
						odRS.getString("JOB_ODR_CANCEL_NO"));
				}
// 2007.09.28 add start
			}
// 2007.09.28 add end

			// 保管区別入出庫の更新
			this.updateRcvIssue(rcvIssueCtrlCd, saveRcvIssueQty);
			saveRcvIssueQty = "";

			// 入庫取消処理
			previousRcvIssuePS = null;
			previousRcvIssueRS = null;
			if ((rcvIssueRS.getString("PUCH_ODR_CD") == null)
				&& (Calculate.compare(rcvIssueRS.getString("OPR_RSLT_CRCT_NO"), "0") > 0)) {

				// 前回入庫実績の検索
				previousRcvIssuePS =
					this.conn.getConn().prepareStatement(this.selectPreviousRcvIssueTypeWorkOdrSql);
				previousRcvIssuePS.setString(1, rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"));
				previousRcvIssuePS.setString(2, rcvIssueRS.getString("WORK_ODR_CD"));
				previousRcvIssuePS.setString(3, rcvIssueRS.getString("PLANT_CD"));
				previousRcvIssuePS.setString(4, rcvIssueRS.getString("PARTIAL_PRD_NO"));
				previousRcvIssuePS.setString(5, rcvIssueRS.getString("OPR_RSLT_CRCT_NO"));
				previousRcvIssueRS = previousRcvIssuePS.executeQuery();
			} else if (
				(rcvIssueRS.getString("PUCH_ODR_CD") != null)
					&& (Calculate.compare(rcvIssueRS.getString("INSPEC_RSLT_CRCT_NO"), "0") > 0)
					&& !"15".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
				previousRcvIssuePS =
					this.conn.getConn().prepareStatement(this.selectPreviousRcvIssueTypePuchOdrSql);
				previousRcvIssuePS.setString(1, rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"));
				previousRcvIssuePS.setString(2, rcvIssueRS.getString("PUCH_ODR_CD"));
				previousRcvIssuePS.setString(3, rcvIssueRS.getString("PLANT_CD"));
				previousRcvIssuePS.setString(4, rcvIssueRS.getString("ACPT_NO"));
				previousRcvIssuePS.setString(5, rcvIssueRS.getString("INSPEC_RSLT_CRCT_NO"));
				previousRcvIssueRS = previousRcvIssuePS.executeQuery();
// 2007.09.28 add start
			} else if (
				(rcvIssueRS.getString("PUCH_ODR_CD") != null)
					&& (Calculate.compare(rcvIssueRS.getString("ACPT_RSLT_CRCT_NO"), "0") > 0)
					&& "15".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
				previousRcvIssuePS =
					this.conn.getConn().prepareStatement(this.selectPreviousRcvIssueTypeInspcWhSql);
				previousRcvIssuePS.setString(1, rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"));
				previousRcvIssuePS.setString(2, rcvIssueRS.getString("PUCH_ODR_CD"));
				previousRcvIssuePS.setString(3, rcvIssueRS.getString("PLANT_CD"));
				previousRcvIssuePS.setString(4, rcvIssueRS.getString("ACPT_NO"));
				previousRcvIssuePS.setString(5, rcvIssueRS.getString("ACPT_RSLT_CRCT_NO"));
				previousRcvIssueRS = previousRcvIssuePS.executeQuery();
// 2007.09.28 add end
			} else {
				return true;
			}

			if (!previousRcvIssueRS.next()) {
				return true;
			}

			// 入庫取消用の入出庫管理番号を裁番
			String cancelRcvIssueCtrlCd = this.getNumberingRcvIssueCtrlCd();
			// 入庫取消データを登録
			this.insertCancelRcvIssue(
				previousRcvIssueRS.getString("RCV_ISSUE_CTRL_CD"),
				cancelRcvIssueCtrlCd);
            // 保管区別入出庫を検索し、処理に必要なデータを取得
			rcvIssuePS1 = this.conn.getConn().prepareStatement(this.selectRcvIssue_1Sql);
			rcvIssuePS1.setString(1, previousRcvIssueRS.getString("RCV_ISSUE_CTRL_CD"));
			rcvIssueRS1 = rcvIssuePS1.executeQuery();
			if (!rcvIssueRS1.next()) {
				return true;
			}
			boolean result = addCancelRcvIssue(cancelRcvIssueCtrlCd);
			return result;
		} catch (ApsComException ex) {
			throw ex;
		} catch (FoundationException ex) {
			throw ex;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (rcvIssueRS != null) {
				rcvIssueRS.close();
			}
			if (rcvIssuePS != null) {
				rcvIssuePS.close();
			}
			if (odRS != null) {
				odRS.close();
			}
			if (odPS != null) {
				odPS.close();
			}
			if (itemStockRS != null) {
				itemStockRS.close();
			}
			if (itemStockPS != null) {
				itemStockPS.close();
			}
			if (lotStockRS != null) {
				lotStockRS.close();
			}
			if (lotStockPS != null) {
				lotStockPS.close();
			}
			if (jobOdrCdStockRS != null) {
				jobOdrCdStockRS.close();
			}
			if (jobOdrCdStockPS != null) {
				jobOdrCdStockPS.close();
			}
			if (previousRcvIssueRS != null) {
				try{
					previousRcvIssueRS.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				previousRcvIssueRS = null;
			}
			if (previousRcvIssuePS != null) {
				try{
					previousRcvIssuePS.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				previousRcvIssuePS = null;
			}
			if (rlsdPuchOdrPS != null) {
				rlsdPuchOdrPS = null;
			}
			if (rlsdPuchOdrRS != null) {
				rlsdPuchOdrRS = null;
			}
			if (acptRsltPS != null) {
				acptRsltPS = null;
			}
			if (acptRsltRS != null) {
				acptRsltRS = null;
			}
			if (insertRcvIssuePS != null) {
				insertRcvIssuePS = null;
			}
			if( rcvIssuePS1 != null ){
				try{
					rcvIssuePS1.close();
				}catch(Exception e){
					e.printStackTrace();					
				}
				rcvIssuePS1 = null;
			}
			if( rcvIssueRS1 != null ){
				try{
					rcvIssueRS1.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rcvIssueRS1 = null;
			}
		}
	}

	/**
	 * 保管区別入出庫テーブルにデータを登録し、手持在庫数を更新します。
	 * @param cancelRcvIssueCtrlCd 入出庫管理番号
	 * @return 在庫が足りない場合false
	 * @throws ParseException String→Date変換に失敗した場合
	 * @throws ApsComException 所要量更新に失敗した場合
	 * @throws SQLException DB更新エラー時にthrowされます。
	 */
	public boolean addCancelRcvIssue(String cancelRcvIssueCtrlCd)
		throws ApsComException, FoundationException, SQLException {

		PreparedStatement rcvIssuePs = null;
		ResultSet rcvIssueRs = null;
		PreparedStatement odPs = null;
		ResultSet odRs = null;
		PreparedStatement itemStockPs = null;
		ResultSet itemStockRs = null;
		PreparedStatement lotStockPS = null;			// [ロット別品目在庫]読込用ステートメント
		ResultSet lotStockRS = null;					// [ロット別品目在庫]格納用データセット
		PreparedStatement jobOdrCdStockPs = null;
		ResultSet jobOdrCdStockRs = null;
		PreparedStatement jobOdrPs = null;
		ResultSet jobOdrRs = null;
		PreparedStatement jobOdrCdStockAllWhPs = null;
		ResultSet jobOdrCdStockAllWhRs = null;
		PreparedStatement jobOdrAlcPs = null;
		ResultSet jobOdrAlcRs = null;
// 2007.09.28 add start
		PreparedStatement rlsdPuchOdrPS = null;			// [発注残]読込用ステートメント
		ResultSet rlsdPuchOdrRS = null;					// [発注残]格納用データセット
		PreparedStatement acptRsltPS = null;			// [受入実績]読込用ステートメント
		ResultSet acptRsltRS = null;					// [受入実績]格納用データセット
		PreparedStatement insertRcvIssuePS = null;		// [保管区別入出庫]待ち保管区出庫登録用ステートメント

		int sqlResult;
// 2007.09.28 add end

		// 退避用手持ち在庫数
		String saveRcvIssueQty = "";

		try {
			// 入庫取消データを取得
			rcvIssuePs = this.conn.getConn().prepareStatement(this.selectRcvIssueSql);
			rcvIssuePs.setString(1, cancelRcvIssueCtrlCd);
			rcvIssueRs = rcvIssuePs.executeQuery();

			if (!rcvIssueRs.next()) {
				return true;
			}

			if (rcvIssueRs.getString("WH_CD") == null) {
				return true;
			}

			if (rcvIssueRs.getString("JOB_ODR_CD") == null) {
				// レコードの存在チェック
				itemStockPs = this.conn.getConn().prepareStatement(this.selectItemStockSql);
				itemStockPs.setString(1, rcvIssueRs.getString("ITEM_CD"));
				itemStockPs.setString(2, rcvIssueRs.getString("WH_CD"));
				itemStockPs.setString(3, rcvIssueRs.getString("PLANT_CD"));
				itemStockRs = itemStockPs.executeQuery();
				if (itemStockRs.next()) {
					// 入出庫数を退避
					saveRcvIssueQty = itemStockRs.getString("STOCK_ON_HAND_QTY");

					// 保管区別品目在庫の更新
					this.updateItemStock(
						rcvIssueRs.getString("ITEM_CD"),
						rcvIssueRs.getString("WH_CD"),
						rcvIssueRs.getString("PLANT_CD"),
						rcvIssueRs.getString("RCV_ISSUE_QTY"));
				} else {
					// 入出庫数を退避(ないから０)
					saveRcvIssueQty = "0";

					// 保管区別品目在庫の登録
					this.insertItemStock(
						rcvIssueRs.getString("ITEM_CD"),
						rcvIssueRs.getString("WH_CD"),
						rcvIssueRs.getString("PLANT_CD"),
						rcvIssueRs.getString("RCV_ISSUE_QTY"));
				}
				//ロット管理品目の在庫更新
                if(rcvIssueRs.getString("LOT_NO") != null){
					//ロット別品目在庫の更新
					// [ロット別品目在庫]検索
					lotStockPS = this.conn.getConn().prepareStatement(this.selectTLotStockSql);
					lotStockPS.setString(1, rcvIssueRs.getString("ITEM_CD"));
					lotStockPS.setString(2, rcvIssueRs.getString("WH_CD"));
					lotStockPS.setString(3, rcvIssueRs.getString("LOT_NO"));
					lotStockRS = lotStockPS.executeQuery();
					if (lotStockRS.next()) {
						if (Calculate.compare(Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),
								rcvIssueRs.getString("RCV_ISSUE_QTY")),"0") < 0){
							_errorList.add("AE20606");
						}
						// ロット別品目在庫の更新
						this.updateTLotStock(
							rcvIssueRs.getString("ITEM_CD"),
							rcvIssueRs.getString("WH_CD"),
							rcvIssueRs.getString("LOT_NO"),
							Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),
									rcvIssueRs.getString("RCV_ISSUE_QTY")));
					} else {
						_errorList.add("AE20606");
/*						// ロット別品目在庫の登録
						this.insertTLotStock(
							rcvIssueRs.getString("ITEM_CD"),
							rcvIssueRs.getString("WH_CD"),
							rcvIssueRs.getString("LOT_NO"),
							rcvIssueRs.getString("PLANT_CD"),
							rcvIssueRs.getString("RCV_ISSUE_QTY"));*/
					}
                }
			} else {
				// 入庫取消可能数
				String cancelableReceiveQty = null;
				String odrQty = null;
				String totalRcvQty = null;
				String SumStockOnHandQty = null;
				String SumNonIssueAlcdQty = null;

				if(!"16".equals(rcvIssueRs.getString("RCV_ISSUE_GNR_TYP"))) {
					// 入出庫可能数チェック
					odPs = this.conn.getConn().prepareStatement(this.selectOdSql);
					odPs.setString(1, rcvIssueRs.getString("OD_NO"));
					odPs.setString(2, rcvIssueRs.getString("PLANT_CD"));
					odRs = odPs.executeQuery();
					if (odRs.next()) {
						odrQty = odRs.getString("ODR_QTY");
						totalRcvQty = odRs.getString("TOTAL_RCV_QTY");
					} else {
						return false;
					}

					jobOdrPs = this.conn.getConn().prepareStatement(this.selectJobOdrSql);
					jobOdrPs.setString(1, odRs.getString("JOB_ODR_CD"));
					jobOdrPs.setString(2, odRs.getString("JOB_ODR_DETAIL_NO"));
					jobOdrPs.setString(3, odRs.getString("JOB_ODR_CANCEL_NO"));
					jobOdrPs.setString(4, odRs.getString("PLANT_CD"));
					jobOdrRs = jobOdrPs.executeQuery();
					if (!jobOdrRs.next()) {
						return false;
					}

					jobOdrCdStockAllWhPs =
						this.conn.getConn().prepareStatement(this.selectJobOdrCdStockTypeAllWhSql);
					jobOdrCdStockAllWhPs.setString(1, rcvIssueRs.getString("JOB_ODR_CD"));
					jobOdrCdStockAllWhPs.setString(2, rcvIssueRs.getString("JOB_ODR_DETAIL_NO"));
					jobOdrCdStockAllWhPs.setString(3, rcvIssueRs.getString("ITEM_CD"));
					jobOdrCdStockAllWhPs.setString(4, rcvIssueRs.getString("PLANT_CD"));
					jobOdrCdStockAllWhRs = jobOdrCdStockAllWhPs.executeQuery();
					if (jobOdrCdStockAllWhRs.next()) {
						SumStockOnHandQty = jobOdrCdStockAllWhRs.getString("SUM_STOCK_ON_HAND_QTY");
					} else {
						SumStockOnHandQty = "0";
					}

					jobOdrAlcPs = this.conn.getConn().prepareStatement(this.selectJobOdrAlcSql);
					jobOdrAlcPs.setString(1, rcvIssueRs.getString("JOB_ODR_CD"));
					jobOdrAlcPs.setString(2, rcvIssueRs.getString("JOB_ODR_DETAIL_NO"));
					jobOdrAlcPs.setString(3, rcvIssueRs.getString("ITEM_CD"));
					jobOdrAlcPs.setString(4, rcvIssueRs.getString("PLANT_CD"));
					jobOdrAlcRs = jobOdrAlcPs.executeQuery();
					if (jobOdrAlcRs.next()) {
						SumNonIssueAlcdQty = jobOdrAlcRs.getString("SUM_NON_ISSUE_ALCD_QTY");
					} else {
						SumNonIssueAlcdQty = "0";
					}

					jobOdrCdStockPs = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
					jobOdrCdStockPs.setString(1, rcvIssueRs.getString("JOB_ODR_CD"));
					jobOdrCdStockPs.setString(2, rcvIssueRs.getString("JOB_ODR_DETAIL_NO"));
					jobOdrCdStockPs.setString(3, rcvIssueRs.getString("ITEM_CD"));
					jobOdrCdStockPs.setString(4, rcvIssueRs.getString("WH_CD"));
					jobOdrCdStockPs.setString(5, rcvIssueRs.getString("PLANT_CD"));
					jobOdrCdStockRs = jobOdrCdStockPs.executeQuery();
					if (!jobOdrCdStockRs.next()) {
						return false;
					}

					// 手持ち在庫数を退避
					saveRcvIssueQty = jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY");

					// 入出庫可能数を求める
					if ("2".equals(jobOdrRs.getString("JOB_ODR_TYP"))
						&& "0".equals(odRs.getString("JOB_ODR_CANCEL_NO"))
						&& odRs.getString("PARENT_OD_NO") == null) {
						// 製番在庫（親）の場合
						cancelableReceiveQty = Calculate.subtract(odrQty, totalRcvQty);
						cancelableReceiveQty = Calculate.add(cancelableReceiveQty, SumStockOnHandQty);
						cancelableReceiveQty =
							Calculate.subtract(cancelableReceiveQty, SumNonIssueAlcdQty);
					} else {
						// 製番在庫（子）の場合
						cancelableReceiveQty =
							Calculate.subtract(SumStockOnHandQty, SumNonIssueAlcdQty);
					}
					if (Calculate
						.compare(cancelableReceiveQty, jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY"))
						> 0) {
						cancelableReceiveQty = jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY");
					}

					// 入出庫可能数チェック
					if (Calculate
						.compare(rcvIssueRs.getString("JOB_ODR_DETAIL_NO"), cancelableReceiveQty)
						> 0) {
						return false;
					}

					// 保管区別製番在庫の更新
					this.updateJobOdrCdStock(
						rcvIssueRs.getString("JOB_ODR_CD"),
						rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
						rcvIssueRs.getString("ITEM_CD"),
						rcvIssueRs.getString("WH_CD"),
						rcvIssueRs.getString("PLANT_CD"),
						rcvIssueRs.getString("RCV_ISSUE_QTY"));

				} else {
					// 製番在庫検索
					jobOdrCdStockPs = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
					jobOdrCdStockPs.setString(1, rcvIssueRs.getString("JOB_ODR_CD"));
					jobOdrCdStockPs.setString(2, rcvIssueRs.getString("JOB_ODR_DETAIL_NO"));
					jobOdrCdStockPs.setString(3, rcvIssueRs.getString("ITEM_CD"));
					jobOdrCdStockPs.setString(4, rcvIssueRs.getString("WH_CD"));
					jobOdrCdStockPs.setString(5, rcvIssueRs.getString("PLANT_CD"));
					jobOdrCdStockRs = jobOdrCdStockPs.executeQuery();

					if (jobOdrCdStockRs.next()) {
						// 手持ち在庫数を退避
						saveRcvIssueQty = jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY");

						// 保管区別製番在庫の更新
						this.updateJobOdrCdStock(
							rcvIssueRs.getString("JOB_ODR_CD"),
							rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRs.getString("ITEM_CD"),
							rcvIssueRs.getString("WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							rcvIssueRs.getString("RCV_ISSUE_QTY"));
					} else {
						saveRcvIssueQty = "0";

						// 保管区別製番在庫の登録
						this.insertJobOdrCdStock(
							rcvIssueRs.getString("JOB_ODR_CD"),
							rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							rcvIssueRs.getString("RCV_ISSUE_QTY"));

					}
				}

			}

			if(!"16".equals(rcvIssueRs.getString("RCV_ISSUE_GNR_TYP"))) {
				// 所要量の更新
				CommonOd co =
					new CommonOd(this.conn, this.sysPlantCd, this.sysUserCd, this.sysBusinessId);
				double rcvIssueQty =
					new BigDecimal(rcvIssueRs.getString("RCV_ISSUE_QTY")).doubleValue();
				co.updateOrderForReceive(rcvIssueRs.getString("OD_NO"), rcvIssueQty, -1);
			}

			// 保管区別入出庫の更新
			this.updateRcvIssue(cancelRcvIssueCtrlCd, saveRcvIssueQty);
			saveRcvIssueQty = "";

// 2007.09.28 add start
			// [保管区別入出庫]入出庫発生区分が18(検査済み入庫取消)の場合は待ち保管区出庫処理を行う
			if("18".equals(rcvIssueRs.getString("RCV_ISSUE_GNR_TYP"))) {
				// [発注残]検索
				rlsdPuchOdrPS = this.conn.getConn().prepareStatement(this.selectRlsdPuchOdrSql);
				rlsdPuchOdrPS.setString(1, rcvIssueRs.getString("PUCH_ODR_CD"));
				rlsdPuchOdrRS = rlsdPuchOdrPS.executeQuery();
				// [発注残]が存在しない場合は処理終了
				if(!rlsdPuchOdrRS.next()) {
					return true;
				}

				// [受入実績]検索
				acptRsltPS = this.conn.getConn().prepareStatement(this.selectAcptRsltSql);
				acptRsltPS.setString(1, rcvIssueRs.getString("PUCH_ODR_CD"));
				acptRsltPS.setString(2, rcvIssueRs.getString("ACPT_NO"));
				acptRsltRS = acptRsltPS.executeQuery();
				// [受入実績]が存在しない場合は処理終了
				if(!acptRsltRS.next()) {
					return true;
				}

				// 入出庫管理番号採番
				String issueRcvIssueCtrlCd = this.getNumberingRcvIssueCtrlCd();
				// [保管区別入出庫]待ち保管区出庫データ作成
				insertRcvIssuePS = this.conn.getConn().prepareStatement(this.insertRcvIssueSql);
				insertRcvIssuePS.setString(1,  issueRcvIssueCtrlCd);							// 採番した入出庫管理番号
				insertRcvIssuePS.setString(2,  "2");											// 入庫区分(2:出庫)
				insertRcvIssuePS.setString(3,  rcvIssueRs.getString("ITEM_CD"));				// 品目番号
				insertRcvIssuePS.setString(4,  rcvIssueRs.getString("PLANT_CD"));				// 工場コード
				insertRcvIssuePS.setString(5,  acptRsltRS.getString("INSPC_WH_CD"));			// 検査待ち保管区
				insertRcvIssuePS.setString(6,  rcvIssueRs.getString("JOB_ODR_CD"));				// 製番
				insertRcvIssuePS.setString(7,  "0");											// 製番枝番
				insertRcvIssuePS.setString(8,  rcvIssueRs.getString("PUCH_ODR_CD"));			// 発注番号
				insertRcvIssuePS.setString(9,  rcvIssueRs.getString("ACPT_NO"));				// 受入回数
				insertRcvIssuePS.setString(10, "0");											// 受入実績訂正回数
				insertRcvIssuePS.setString(11, rcvIssueRs.getString("INSPEC_RSLT_CRCT_NO"));	// 検査実績訂正回数
				insertRcvIssuePS.setString(12, rcvIssueRs.getString("WORK_ODR_CD"));			// 作業計画番号
				insertRcvIssuePS.setString(13, rcvIssueRs.getString("WORK_IN_PROC_CD"));		// 仕掛作業コード
				insertRcvIssuePS.setString(14, rcvIssueRs.getString("PARTIAL_PRD_NO"));			// 分作回数
				insertRcvIssuePS.setString(15, rcvIssueRs.getString("OPR_RSLT_CRCT_NO"));		// 作業実績訂正回数
				insertRcvIssuePS.setString(16, null);											// 出庫指示番号
				insertRcvIssuePS.setString(17, Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));	// 入出庫数
				insertRcvIssuePS.setString(18, "0");											// 入出庫金額
				insertRcvIssuePS.setString(19, rcvIssueRs.getString("RCV_ISSUE_DATE"));			// 入出庫年月日
				insertRcvIssuePS.setString(20, "26");											// 入出庫発生区分(26:待ち保管区出庫取消)
				insertRcvIssuePS.setString(21, "0");											// 入出庫端数
				insertRcvIssuePS.setString(22, null);											// 入出庫不良理由コード
				insertRcvIssuePS.setString(23, "1");											// 在庫更新フラグ
				if("9".equals(rlsdPuchOdrRS.getString("PUCH_ODR_STS_TYP"))
				&& "1".equals(rlsdPuchOdrRS.getString("INSPC_CMPLT_FLG"))){
					insertRcvIssuePS.setString(24, "1");										// 入出庫完了フラグ(1:完了)
				} else {
					insertRcvIssuePS.setString(24, "0");										// 入出庫完了フラグ(0:未)
				}
				insertRcvIssuePS.setString(25, rcvIssueRs.getString("OD_NO"));					// オーダデマンド番号
				insertRcvIssuePS.setString(26, rcvIssueRs.getString("VEND_LOT_NO"));			// メーカロット番号
				insertRcvIssuePS.setString(27, null);											// 入出庫備考
				insertRcvIssuePS.setString(28, rcvIssueRs.getString("COMPANY_CD"));				// 会社コード
				insertRcvIssuePS.setString(29, rcvIssueRs.getString("VEND_CD"));				// 取引先コード
				insertRcvIssuePS.setString(30, "0");											// 支給区分
				insertRcvIssuePS.setString(31, null);											// 有償支給実績抽出日
				insertRcvIssuePS.setString(32, this.sysUserCd);									// 作成者
				insertRcvIssuePS.setString(33, this.sysBusinessId);								// 作成プログラム名
				insertRcvIssuePS.setString(34, this.sysUserCd);									// 更新者
				insertRcvIssuePS.setString(35, this.sysBusinessId);								// 更新プログラム名
				insertRcvIssuePS.setString(36, rcvIssueRs.getString("LOT_NO"));				    // ロット番号
				sqlResult = insertRcvIssuePS.executeUpdate();

				// [保管区別入出庫]製番がNULLの場合
				if(rcvIssueRs.getString("JOB_ODR_CD") == null) {

					// [保管区別品目在庫]検索
					itemStockPs = this.conn.getConn().prepareStatement(this.selectItemStockSql);
					itemStockPs.setString(1, rcvIssueRs.getString("ITEM_CD"));
					itemStockPs.setString(2, acptRsltRS.getString("INSPC_WH_CD"));
					itemStockPs.setString(3, rcvIssueRs.getString("PLANT_CD"));
					itemStockRs = itemStockPs.executeQuery();
					if (itemStockRs.next()) {
						// 入出庫数を退避
						saveRcvIssueQty = itemStockRs.getString("STOCK_ON_HAND_QTY");

						// 保管区別品目在庫の更新
						this.updateItemStock(
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
					} else {
						// 入出庫数を退避(ないから０)
						saveRcvIssueQty = "0";

						// 保管区別品目在庫の登録
						this.insertItemStock(
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
					}
					//ロット管理
					if (rcvIssueRs.getString("LOT_NO") != null) {
						//ロット別品目在庫の更新
						// [ロット別品目在庫]検索
						lotStockPS = this.conn.getConn().prepareStatement(this.selectTLotStockSql);
						lotStockPS.setString(1, rcvIssueRs.getString("ITEM_CD"));
						lotStockPS.setString(2, acptRsltRS.getString("INSPC_WH_CD"));
						lotStockPS.setString(3, rcvIssueRs.getString("LOT_NO"));
						lotStockRS = lotStockPS.executeQuery();
						if (lotStockRS.next()) {
							if (Calculate.compare(Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),
									Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1")),"0") < 0){
								_errorList.add("AE20606");
							}
							// ロット別品目在庫の更新
							this.updateTLotStock(
								rcvIssueRs.getString("ITEM_CD"),
								acptRsltRS.getString("INSPC_WH_CD"),
								rcvIssueRs.getString("LOT_NO"),
								Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),
										Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1")));
						} else {
							if (Calculate.compare(Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"),"0") < 0){
								_errorList.add("AE20606");
							}
							// ロット別品目在庫の登録
							this.insertTLotStock(
								rcvIssueRs.getString("ITEM_CD"),
								acptRsltRS.getString("INSPC_WH_CD"),
								rcvIssueRs.getString("LOT_NO"),
								rcvIssueRs.getString("PLANT_CD"),
								Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
						}
					}
				// [保管区別入出庫]製番がNULL以外の場合
				} else {

					// [保管区別製番在庫]検索
					jobOdrCdStockPs = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
					jobOdrCdStockPs.setString(1, rcvIssueRs.getString("JOB_ODR_CD"));
					jobOdrCdStockPs.setString(2, rcvIssueRs.getString("JOB_ODR_DETAIL_NO"));
					jobOdrCdStockPs.setString(3, rcvIssueRs.getString("ITEM_CD"));
					jobOdrCdStockPs.setString(4, acptRsltRS.getString("INSPC_WH_CD"));
					jobOdrCdStockPs.setString(5, rcvIssueRs.getString("PLANT_CD"));
					jobOdrCdStockRs = jobOdrCdStockPs.executeQuery();
					if (jobOdrCdStockRs.next()) {
						// 入出庫数を退避
						saveRcvIssueQty = jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY");

						// 保管区別製番在庫の更新
						this.updateJobOdrCdStock(
							rcvIssueRs.getString("JOB_ODR_CD"),
							rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
					} else {
						// 入出庫数を退避(ないから０)
						saveRcvIssueQty = "0";

						// 保管区別製番在庫の登録
						this.insertJobOdrCdStock(
							rcvIssueRs.getString("JOB_ODR_CD"),
							rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
					}
				}

				// 保管区別入出庫の更新
				this.updateRcvIssue(issueRcvIssueCtrlCd, saveRcvIssueQty);
				saveRcvIssueQty = "0";

			}
// 2007.09.28 add end

			return true;
		} catch (ApsComException ex) {
			throw ex;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (rcvIssueRs != null) {
				rcvIssueRs.close();
			}
			if (rcvIssuePs != null) {
				rcvIssuePs.close();
			}
			if (odRs != null) {
				odRs.close();
			}
			if (odPs != null) {
				odPs.close();
			}
			if (itemStockRs != null) {
				itemStockRs.close();
			}
			if (itemStockPs != null) {
				itemStockPs.close();
			}
			if (jobOdrCdStockRs != null) {
				jobOdrCdStockRs.close();
			}
			if (jobOdrCdStockPs != null) {
				jobOdrCdStockPs.close();
			}
			if (jobOdrRs != null) {
				jobOdrRs.close();
			}
			if (jobOdrPs != null) {
				jobOdrPs.close();
			}
			if (jobOdrCdStockAllWhRs != null) {
				jobOdrCdStockAllWhRs.close();
			}
			if (jobOdrCdStockAllWhPs != null) {
				jobOdrCdStockAllWhPs.close();
			}
			if (jobOdrAlcRs != null) {
				jobOdrAlcRs.close();
			}
			if (jobOdrAlcPs != null) {
				jobOdrAlcPs.close();
			}
			if (rlsdPuchOdrPS != null) {
				rlsdPuchOdrPS = null;
			}
			if (rlsdPuchOdrRS != null) {
				rlsdPuchOdrRS = null;
			}
			if (acptRsltPS != null) {
				acptRsltPS = null;
			}
			if (acptRsltRS != null) {
				acptRsltRS = null;
			}
			if (insertRcvIssuePS != null) {
				insertRcvIssuePS = null;
			}
		}
	}

	/**
	 * 入出庫管理番号を栽番する
	 * @return 入出庫管理番号
	 * @throws FoundationException 栽番エラー
	 */
	private String getNumberingRcvIssueCtrlCd() throws FoundationException {
		String rcvIssueCtrlCd = null;
		try {
			Numbering rcvIssueNumbering =
				new Numbering(
					this.conn,
					Numbering.ISSUE_CD,
					this.sysUserCd,
					this.sysBusinessId,
					this.sysPlantCd);
			rcvIssueCtrlCd = rcvIssueNumbering.getNo();
			return rcvIssueCtrlCd;
		} catch (FoundationException ex) {
			throw ex;
		}
	}

	/**
	 * 保管区別入出庫の登録（入庫取消）
	 * @param rcvIssueCtrlCd 入出庫管理番号
	 * @param previousRcvIssueCtrlCd 取消対象の入出庫管理番号
	 * @return リザルトセット
	 * @throws SQLException
	 */
	private int insertCancelRcvIssue(String previousRcvIssueCtrlCd, String rcvIssueCtrlCd)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertCancelRcvIssueSql);
			ps.setString(1, rcvIssueCtrlCd);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, this.sysUserCd);
			ps.setString(5, this.sysBusinessId);
			ps.setString(6, previousRcvIssueCtrlCd);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 保管区別入出庫の更新
	 * @param rcvIssueCtrlCd 入出庫管理番号
	 * @param saveRcvIssueQty 退避用入出庫数
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	private int updateRcvIssue(String rcvIssueCtrlCd, String saveRcvIssueQty) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateRcvIssueSql);
			ps.setString(1, saveRcvIssueQty);
			ps.setString(2, saveRcvIssueQty);
			ps.setString(3, this.sysUserCd);
			ps.setString(4, this.sysBusinessId);
			ps.setString(5, rcvIssueCtrlCd);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 保管区別品目在庫の登録
	 * @param itemCd 品目番号
	 * @param whCd 保管区コード
	 * @param plantCd 工場コード
	 * @param rcvIssueQty 入出庫数
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	private int insertItemStock(String itemCd, String whCd, String plantCd, String rcvIssueQty)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertItemStockSql);
			ps.setString(1, itemCd);
			ps.setString(2, whCd);
			ps.setString(3, plantCd);
			ps.setString(4, rcvIssueQty);
			ps.setString(5, this.sysUserCd);
			ps.setString(6, this.sysBusinessId);
			ps.setString(7, this.sysUserCd);
			ps.setString(8, this.sysBusinessId);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 保管区別品目在庫の更新
	 * @param itemCd 品目番号
	 * @param whCd 保管区コード
	 * @param plantCd 工場コード
	 * @param rcvIssueQty 入出庫数
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	private int updateItemStock(String itemCd, String whCd, String plantCd, String rcvIssueQty)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateItemStockSql);
			ps.setString(1, rcvIssueQty);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, itemCd);
			ps.setString(5, whCd);
			ps.setString(6, plantCd);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
	/**
	 * ロット別品目在庫の登録
	 * @param itemCd 品目番号
	 * @param whCd 保管区コード
	 * @param plantCd 工場コード
	 * @param rcvIssueQty 入出庫数
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	private int insertTLotStock(String itemCd, String whCd, String lotNo, String plantCd, String stockOnHandQty)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertTLotStockSql);
			ps.setString(1, itemCd);
			ps.setString(2, whCd);
			ps.setString(3, lotNo);
			ps.setString(4, plantCd);
			ps.setString(5, stockOnHandQty);
			ps.setString(6, this.sysUserCd);
			ps.setString(7, this.sysBusinessId);
			ps.setString(8, this.sysUserCd);
			ps.setString(9, this.sysBusinessId);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
	/**
	 * ロット別品目在庫の更新
	 * @param itemCd 品目番号
	 * @param whCd 保管区コード
	 * @param plantCd 工場コード
	 * @param rcvIssueQty 入出庫数
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	private int updateTLotStock(String itemCd, String whCd, String lotCd, String rcvIssueQty)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateTLotStockSql);
			ps.setString(1, rcvIssueQty);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, itemCd);
			ps.setString(5, whCd);
			ps.setString(6, lotCd);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
	/**
	 * 保管区別製番在庫の登録
	 * @param jobOdrCd 製番
	 * @param JobOdrDetailNo 製番枝番
	 * @param itemCd 品目番号
	 * @param whCd 保管区コード
	 * @param plantCd 工場コード
	 * @param rcvIssueQty 入出庫数
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	private int insertJobOdrCdStock(
		String jobOdrCd,
		String JobOdrDetailNo,
		String itemCd,
		String whCd,
		String plantCd,
		String rcvIssueQty)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertJobOdrCdStockSql);
			ps.setString(1, jobOdrCd);
			ps.setString(2, JobOdrDetailNo);
			ps.setString(3, itemCd);
			ps.setString(4, whCd);
			ps.setString(5, plantCd);
			ps.setString(6, rcvIssueQty);
			ps.setString(7, this.sysUserCd);
			ps.setString(8, this.sysBusinessId);
			ps.setString(9, this.sysUserCd);
			ps.setString(10, this.sysBusinessId);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 保管区別製番在庫の更新
	 * @param jobOdrCd 製番
	 * @param JobOdrDetailNo 製番枝番
	 * @param itemCd 品目番号
	 * @param whCd 保管区コード
	 * @param plantCd 工場コード
	 * @param rcvIssueQty 入出庫数
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	private int updateJobOdrCdStock(
		String jobOdrCd,
		String JobOdrDetailNo,
		String itemCd,
		String whCd,
		String plantCd,
		String rcvIssueQty)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateJobOdrCdStockSql);
			ps.setString(1, rcvIssueQty);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, jobOdrCd);
			ps.setString(5, JobOdrDetailNo);
			ps.setString(6, itemCd);
			ps.setString(7, whCd);
			ps.setString(8, plantCd);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 製番計画の更新
	 * @param jobOdrCd 製番
	 * @param jobOdrDetailNo 製番枝番
	 * @param jobOdrCancelNo 製番取消発生番号
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	private int updateJobOdr(String jobOdrCd, String jobOdrDetailNo, String jobOdrCancelNo)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateJobOdrSql);
			ps.setString(1, jobOdrCd);
			ps.setString(2, jobOdrDetailNo);
			ps.setString(3, jobOdrCancelNo);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
}