/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.AE0060;

import java.sql.*;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc.AutoIssueParam;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.SystemConfig;
import com.nec.jp.orteus.metamorBase.common04.RcvIssue.RcvIssue;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.math.BigDecimal;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueDBAccessor;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueStruct;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ItemStock;
import com.nec.jp.orteus.expj.pr.rcvissue.process.JobOdrStock;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess.*;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueDBAccessor;
import com.nec.jp.orteus.expj.arap.ArApNumbering;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;

/**
 * 受入／検査 実績入力時の関連DB更新クラス
 * @author $Author: geng-jia $
 * @version $Revision: 1.23 $ $Date: 2015/07/09 07:34:24 $
 */
public class InspcAcpt {
	/** DBアクセス用のコネクション */
	private IDbConnection conn = null;

	/** ユーザコード */
	private String sysUserCd = null;
	/** 業務ID */
	private String sysBusinessId = null;
	/** 工場コード */
	private String sysPlantCd = null;

	/** ワーニング格納リスト */
	private List _warnList = new ArrayList();

	/** ワーニング格納リスト */
	private List _errorList = new ArrayList();
	
	/** 入庫時在庫更新ワーニング格納リスト */
	private List _errorRiList = new ArrayList();

	/** 部品呼出しの返却値格納リスト */
	protected List _resultList;	

	/** 入出庫管理番号 */
	protected String _ctrlCd;
	
	/** 品目在庫存在フラグ */
	protected boolean _itemFlg = false;
	
	/** 製番在庫存在フラグ */
	protected boolean _jobFlg = false;
	
	/** 承認状況 */
	protected String _apprFlg = null;
	
	/** 検収日チェック */
	protected String _dateCheckFlg = null;
	
	private String actionTyp = "1"; //処理種類
	private String slipTyp = "79";  //伝票種類
	/**
	 * メッセージ取得 
	 * @return ワーニングリスト
	 */
	public List getWarnList()
	{
		return _warnList;
	}

	/**
	 * メッセージ取得 
	 * @return エラーリスト
	 */
	public List getErrorList()
	{
		return _errorList;
	}
	
	/**
	 * メッセージ取得 
	 * @return エラーリスト
	 */
	public List getRiErrorList()
	{
		return _errorRiList;
	}

	
	/** 更新に必要なデータ取得用SQL */
	private String selectDataSql =
		"select "
			+ "  T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_ACPT_RSLT.ACPT_NO as ACPT_NO, "
			+ "  to_char(T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP) as PUCH_ODR_STS_TYP, "
			+ "  to_char(T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG) as INSPC_CMPLT_FLG, "
			+ "  to_char(T_RLSD_PUCH_ODR.SPL_ITEM_TYP) as SPL_ITEM_TYP, "
			+ "  to_char(T_RLSD_PUCH_ODR.ACPT_INSPC_TYP) as ACPT_INSPC_TYP, "
			+ "  to_char(T_RLSD_PUCH_ODR.INV_CTRL_FLG) as INV_CTRL_FLG, "
			+ "  T_RLSD_PUCH_ODR.OD_NO as OD_NO, "
			+ "  T_RLSD_PUCH_ODR.WORK_ODR_CD as WORK_ODR_CD, "
			+ "  T_RLSD_PUCH_ODR.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  to_char(T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG) as ODR_CANCEL_SLIP_ISS_FLG, "
			+ "  T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG as NON_NO_ITEM_FLG, "		// 2007/10/03 追加(KAIZU)
			+ "  to_char(T_ACPT_RSLT.ACPT_QTY) as ACPT_QTY, "
			+ "  T_ACPT_RSLT.ACPT_DATE as ACPT_DATE, "
			+ "  to_char(T_ACPT_RSLT.ACPT_DATE, 'YYYY/MM/DD') as ACPT_DATE_CHAR, "
			+ "  to_char(T_ACPT_RSLT.PLANT_CD) as PLANT_CD, "
			+ "  to_char(T_ACPT_RSLT.INSPC_WH_CD) as INSPC_WH_CD, "		// 小林追加
			+ "  to_char(T_ACPT_RSLT.ACPT_CRCT_NO) as ACPT_CRCT_NO, "
			+ "  to_char(T_ACPT_RSLT.ACPT_STS_TYP) as ACPT_STS_TYP, "
			+ "  to_char(T_INSPC_RSLT.INSPECTED_QTY) as INSPECTED_QTY, "
			+ "  to_char(T_INSPC_RSLT.ACCEPTED_QTY) as ACCEPTED_QTY, "
			+ "  to_char(decode(T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP, 9, 1, 0)) as RCV_ISSUE_CMPLT_FLG, "
			+ "  to_char(T_WORK_IN_PROC_BY_PROC.FINAL_PROC_FLG) as FINAL_PROC_FLG, "
			+ "  to_char(T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0))) as INSPC_ACPT_QTY, "
			+ "  to_char(nvl(T2.ACPT_QTY, 0)) as PREV_ACPT_QTY, "
			+ "  to_char(nvl(T2.INSPC_ACPT_QTY, 0)) as PREV_INSPC_ACPT_QTY, "
			+ "  to_char(M_VEND_CTRL.INSPC_ACPT_APP_TYP) as INSPC_ACPT_APP_TYP, "	// 2007/09/28 追加(KAIZU)
			+ "  T_ACPT_RSLT.LOT_NO as LOT_NO "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_ACPT_RSLT, "
			+ "  T_INSPC_RSLT, "
			+ "  T_WORK_IN_PROC_BY_PROC, "
			+ "  M_VEND_CTRL, "
			+ "  ( "
			+ "    select "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "      T_PAST_INSPC_ACPT.INSPC_ACPT_NO as INSPC_ACPT_NO, "
			+ "      T_PAST_INSPC_ACPT.ACPT_QTY as ACPT_QTY, "
			+ "      T_PAST_INSPC_ACPT.INSPC_ACPT_QTY as INSPC_ACPT_QTY "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT, "
			+ "      ( "
			+ "        select "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "          max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "        from "
			+ "          T_PAST_INSPC_ACPT "
			+ "        group by "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO "
			+ "      ) T1 "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD = T1.PUCH_ODR_CD "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = T1.ACPT_NO "
			+ "      and T_PAST_INSPC_ACPT.INSPC_ACPT_NO = T1.MAX_INSPC_ACPT_NO "
			+ "  ) T2 "
			+ "where "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T_INSPC_RSLT.PUCH_ODR_CD(+) "
			+ "  and T_ACPT_RSLT.ACPT_NO = T_INSPC_RSLT.ACPT_NO(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T2.PUCH_ODR_CD(+) "
			+ "  and T_ACPT_RSLT.ACPT_NO = T2.ACPT_NO(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "		// 2007/09/28 追加(KAIZU)
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_ACPT_RSLT.ACPT_NO = to_number(?) ";
	/** SQL */
	private String selectRlsdPuchOdrSql =
		"select "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_RLSD_PUCH_ODR.OD_NO as OD_NO, "
			+ "  T_RLSD_PUCH_ODR.WORK_ODR_CD as WORK_ODR_CD, "
			+ "  T_RLSD_PUCH_ODR.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_WORK_IN_PROC_BY_PROC.FINAL_PROC_FLG as FINAL_PROC_FLG "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_WORK_IN_PROC_BY_PROC "
			+ "where "
			+ "  T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? ";
	/** 検収実績情報インタフェース(チェック用) */
	private String selectChkInspcAcptIf = 
		"select "
		    + " T_INSPC_ACPT_IF.PUCH_ODR_CD as PUCH_ODR_CD "
			+ "FROM "
			+ "  T_INSPC_ACPT_IF, "
			+ "  ( "
			+ "   SELECT "
			+ "     MAX(INSPC_ACPT_NO) AS INSPC_ACPT_NO"
			+ "   FROM "
			+ "     T_INSPC_ACPT_IF "
			+ "   WHERE "
			+ "     T_INSPC_ACPT_IF.PUCH_ODR_CD = ? "
			+ "     AND T_INSPC_ACPT_IF.ACPT_NO = to_number(?) "
			+ "  ) TIAI "
			+ "WHERE "
			+ "  T_INSPC_ACPT_IF.PUCH_ODR_CD = ? "
			+ "  AND T_INSPC_ACPT_IF.ACPT_NO = to_number(?) "
			+ "  AND T_INSPC_ACPT_IF.INSPC_ACPT_NO = TIAI.INSPC_ACPT_NO "
			+ "  AND T_INSPC_ACPT_IF.CRCT_TYP = 2 ";

	/** 検収履歴(チェック用) */
	private String selectChkTPastInspcAcpt = 
		"select "
		    + " T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
		    + " T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
		    + " T_PAST_INSPC_ACPT.INSPC_ACPT_NO as INSPC_ACPT_NO, "
		    + " T_PAST_INSPC_ACPT.CRCT_TYP as CRCT_TYP "
		    + "from "
		    + "  T_PAST_INSPC_ACPT, "
		    + "  ( "
		    + "   select "
		    + "     T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
		    + "     T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
		    + "     max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
		    + "   from "
		    + "     T_PAST_INSPC_ACPT "
		    + "   where "
		    + "     T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
		    + "     and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
		    + "   group by "
		    + "     T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
		    + "     T_PAST_INSPC_ACPT.ACPT_NO "
		    + "  ) T1 "
		    + "where "
		    + "  T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
		    + "  and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
		    + "  and T_PAST_INSPC_ACPT.INSPC_ACPT_NO = T1.MAX_INSPC_ACPT_NO ";

	/** SQL   受入実績.”受入日”*/
	private String selectAcptDate =
			"select "
			+ "  T_ACPT_RSLT.EXCH_RATE as EXCH_RATE, "
			+ "  TO_CHAR(T_ACPT_RSLT.ACPT_DATE, 'YYYY/MM/DD') as ACPT_DATE "
			+ "from "
			+ "  T_ACPT_RSLT "
			+ "where "
			+ "  T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_ACPT_RSLT.ACPT_NO = to_number(?) ";
	/** SQL   検収履歴.”検収日”*/
	private String selectInspcAcptDate =
			"select "
			+ "  TO_CHAR(T_PAST_INSPC_ACPT.INSPC_ACPT_DATE, 'YYYY/MM/DD') as INSPC_ACPT_DATE "
			+ "from "
			+ "  T_PAST_INSPC_ACPT, "
			+ "  ( "
			+ "    select "
			+ "      max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "    group by "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO "
			+ "  ) CUSTOM_T_PAST_INSPC_ACPT "
			+ "where "
			+ "  T_PAST_INSPC_ACPT.INSPC_ACPT_NO = CUSTOM_T_PAST_INSPC_ACPT.MAX_INSPC_ACPT_NO "
			+ "  and T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "  and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) ";
	private String selectInspcAcptDate2 =
			"select "
			+ "  TO_CHAR(T_PAST_INSPC_ACPT.INSPC_ACPT_DATE, 'YYYY/MM/DD') as INSPC_ACPT_DATE "
			+ "FROM "
			+ "  T_PAST_INSPC_ACPT, "
			+ "  ( "
			+ "   SELECT "
			+ "     MAX(INSPC_ACPT_NO) AS INSPC_ACPT_NO"
			+ "   FROM "
			+ "     T_PAST_INSPC_ACPT "
			+ "   WHERE "
			+ "     T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "     AND T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "  ) TPIA "
			+ "WHERE "
			+ "  T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "  AND T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "  AND T_PAST_INSPC_ACPT.INSPC_ACPT_NO = TPIA.INSPC_ACPT_NO "
			+ "  AND T_PAST_INSPC_ACPT.CRCT_TYP = 2 ";
	
	/** 検収履歴（黒）SQL */
	private String insertDebitRecordInspcAcptSqlTypeAcpt =
		"insert into "
			+ "  T_PAST_INSPC_ACPT( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    SLIP_CD, "
			+ "    ORGN_SLIP_CD, "
			+ "    EXCH_RATE, "
			+ "    INSPC_ACPT_GNR_TYP, "
			+ "    CRCT_NO, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    SAVING_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "select "
			+ "  T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_ACPT_RSLT.ACPT_NO as ACPT_NO, "
			+ "  nvl(T2.INSPC_ACPT_NO + 1, 1) as INSPC_ACPT_NO, "
			+ "  ? as SLIP_CD, "
			+ "  null as ORGN_SLIP_CD, "
			+ "  TO_NUMBER(?) as EXCH_RATE, "
			+ "  1 as INSPC_ACPT_GNR_TYP, "
			+ "  nvl(T2.CRCT_NO + 1, 0) as CRCT_NO, "
			+ "  2 as CRCT_TYP, "
			+ "  T_RLSD_PUCH_ODR.ITEM_CD as ITEM_CD, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.ITEM_NAME, T_RLSD_PUCH_ODR.NON_NO_ITEM_NAME) as ITEM_NAME, "
			+ "  79 as SLIP_TYP, "
			+ "  T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_RLSD_PUCH_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_RLSD_PUCH_ODR.VEND_CD as VEND_CD, "
			+ "  T_RLSD_PUCH_ODR.PLANT_CD as PLANT_CD, "
			+ "  T_ACPT_RSLT.UNIT_COST as UNIT_COST, "
			+ "  T_ACPT_RSLT.UNIT_COST_TYP as UNIT_COST_TYP, "
			+ "  T_ACPT_RSLT.PROCESSING_COST as PROCESSING_COST, "
			+ "  T_ACPT_RSLT.MATERIAL_COST as MATERIAL_COST, "
			+ "  T_ACPT_RSLT.OTHER_OVERHEADS as OTHER_OVERHEADS, "
			+ "  T_ACPT_RSLT.ACPT_QTY as ACPT_QTY, "
			+ "  T_ACPT_RSLT.ACPT_QTY as INSPC_ACPT_QTY, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.STOCK_UNIT, T_RLSD_PUCH_ODR.NON_NO_ITEM_PUCH_ODR_UNIT) as STOCK_UNIT, "
			+ "  T_ACPT_RSLT.PUCH_ODR_AMOUNT as INSPC_ACPT_AMOUNT, "
			+ "  T_ACPT_RSLT.DISC_AMOUNT as SAVING_AMOUNT, "
			+ "  T_ACPT_RSLT.ACPT_DATE as ACPT_DATE, "
			+ "  T_ACPT_RSLT.ACPT_DATE as INSPC_ACPT_DATE, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.PRODUCT_TYP, T_RLSD_PUCH_ODR.NON_NO_ITEM_TYP) as PRODUCT_TYP, "
			+ "  T_ACPT_RSLT.DLV_CD as DLV_CD, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_ACPT_RSLT, "
			+ "  M_ITEM, "
			+ "  T_WORK_IN_PROC_BY_PROC, "
			+ "  ( "
			+ "    select "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "      T_PAST_INSPC_ACPT.INSPC_ACPT_NO as INSPC_ACPT_NO, "
			+ "      T_PAST_INSPC_ACPT.CRCT_NO as CRCT_NO "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT, "
			+ "      ( "
			+ "        select "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "          max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "        from "
			+ "          T_PAST_INSPC_ACPT "
			+ "        where "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "          and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "        group by "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO "
			+ "      ) T1 "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "      and T_PAST_INSPC_ACPT.INSPC_ACPT_NO = T1.MAX_INSPC_ACPT_NO "
			+ "  ) T2 "
			+ "where "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
			+ "  and T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T2.PUCH_ODR_CD(+) "
			+ "  and T_ACPT_RSLT.ACPT_NO = T2.ACPT_NO(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_ACPT_RSLT.ACPT_NO = to_number(?)";
	/** 検収履歴（黒）SQL */
	private String insertDebitRecordInspcAcptSqlTypeInspc =
		"insert into "
			+ "  T_PAST_INSPC_ACPT( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    SLIP_CD, "
			+ "    ORGN_SLIP_CD, "
			+ "    EXCH_RATE, "
			+ "    INSPC_ACPT_GNR_TYP, "
			+ "    CRCT_NO, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    SAVING_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "select "
			+ "  T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_ACPT_RSLT.ACPT_NO as ACPT_NO, "
			+ "  nvl(T2.INSPC_ACPT_NO + 1, 1) as INSPC_ACPT_NO, "
			+ "  ? as SLIP_CD, "
			+ "  null as ORGN_SLIP_CD, "
			+ "  TO_NUMBER(?) as EXCH_RATE, "
			+ "  2 as INSPC_ACPT_GNR_TYP, "
			+ "  nvl(T2.CRCT_NO + 1, 0) as CRCT_NO, "
			+ "  2 as CRCT_TYP, "
			+ "  T_RLSD_PUCH_ODR.ITEM_CD as ITEM_CD, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.ITEM_NAME, T_RLSD_PUCH_ODR.NON_NO_ITEM_NAME) as ITEM_NAME, "
			+ "  79 as SLIP_TYP, "
			+ "  T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_RLSD_PUCH_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_RLSD_PUCH_ODR.VEND_CD as VEND_CD, "
			+ "  T_RLSD_PUCH_ODR.PLANT_CD as PLANT_CD, "
			+ "  T_ACPT_RSLT.UNIT_COST as UNIT_COST, "
			+ "  T_ACPT_RSLT.UNIT_COST_TYP as UNIT_COST_TYP, "
			+ "  T_ACPT_RSLT.PROCESSING_COST as PROCESSING_COST, "
			+ "  T_ACPT_RSLT.MATERIAL_COST as MATERIAL_COST, "
			+ "  T_ACPT_RSLT.OTHER_OVERHEADS as OTHER_OVERHEADS, "
			+ "  T_ACPT_RSLT.ACPT_QTY as ACPT_QTY, "
			+ "  (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0))) as INSPC_ACPT_QTY, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.STOCK_UNIT, T_RLSD_PUCH_ODR.NON_NO_ITEM_PUCH_ODR_UNIT) as STOCK_UNIT, "
            + "  decode(M_VEND_CTRL.ROUND_TYP, 2, CEIL(ABS((T_ACPT_RSLT.UNIT_COST * (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0))))) * POWER(10,M_CUR.DECIMAL_FIG)) / POWER(10,M_CUR.DECIMAL_FIG) * SIGN((T_ACPT_RSLT.UNIT_COST * (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0))))), 3, trunc((T_ACPT_RSLT.UNIT_COST * (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0)))), M_CUR.DECIMAL_FIG), round((T_ACPT_RSLT.UNIT_COST * (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0)))), M_CUR.DECIMAL_FIG)) as INSPC_ACPT_AMOUNT, "
			+ "  T_ACPT_RSLT.DISC_AMOUNT as SAVING_AMOUNT, "
			+ "  T_ACPT_RSLT.ACPT_DATE as ACPT_DATE, "
			//+ "  T_ACPT_RSLT.ACPT_DATE as INSPC_ACPT_DATE, "
			+ "  decode(?, '1', T_INSPC_RSLT.INSPEC_DATE,T_ACPT_RSLT.ACPT_DATE) as INSPC_ACPT_DATE, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.PRODUCT_TYP, T_RLSD_PUCH_ODR.NON_NO_ITEM_TYP) as PRODUCT_TYP, "
			+ "  T_ACPT_RSLT.DLV_CD as DLV_CD, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_ACPT_RSLT, "
			+ "  T_INSPC_RSLT, "
			+ "  M_ITEM, "
			+ "  M_VEND_CTRL, "
			+ "  M_CUR, "
			+ "  SYS_HOME_CUR, "
			+ "  T_WORK_IN_PROC_BY_PROC, "
			+ "  ( "
			+ "    select "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "      T_PAST_INSPC_ACPT.INSPC_ACPT_NO as INSPC_ACPT_NO, "
			+ "      T_PAST_INSPC_ACPT.CRCT_NO as CRCT_NO "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT, "
			+ "      ( "
			+ "        select "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "          max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "        from "
			+ "          T_PAST_INSPC_ACPT "
			+ "        where "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "          and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "        group by "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO "
			+ "      ) T1 "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "      and T_PAST_INSPC_ACPT.INSPC_ACPT_NO = T1.MAX_INSPC_ACPT_NO "
			+ "  ) T2 "
			+ "where "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
			+ "  and T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD "
			+ "  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T_INSPC_RSLT.PUCH_ODR_CD(+) "
			+ "  and T_ACPT_RSLT.ACPT_NO = T_INSPC_RSLT.ACPT_NO(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T2.PUCH_ODR_CD(+) "
			+ "  and T_ACPT_RSLT.ACPT_NO = T2.ACPT_NO(+) "
			+ "  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
			+ "  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_ACPT_RSLT.ACPT_NO = to_number(?) ";
	/** 検収履歴（赤）SQL */
	private String insertCreditRecordInspcAcptSqlTypeAcpt =
		"insert into "
			+ "  T_PAST_INSPC_ACPT( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    SLIP_CD, "
			+ "    ORGN_SLIP_CD, "
			+ "    EXCH_RATE, "
			+ "    INSPC_ACPT_GNR_TYP, "
			+ "    CRCT_NO, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    SAVING_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "select "
			+ "  T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_NO + 1) as INSPC_ACPT_NO, "
			+ "  ? as SLIP_CD, "
			+ "  T_PAST_INSPC_ACPT.SLIP_CD as ORGN_SLIP_CD, "
			+ "  T_PAST_INSPC_ACPT.EXCH_RATE  as EXCH_RATE, "
			+ "  1 as INSPC_ACPT_GNR_TYP, "
			+ "  T_PAST_INSPC_ACPT.CRCT_NO as CRCT_NO, "
			+ "  1 as CRCT_TYP, "
			+ "  T_PAST_INSPC_ACPT.ITEM_CD as ITEM_CD, "
			+ "  T_PAST_INSPC_ACPT.ITEM_NAME as ITEM_NAME, "
			+ "  T_PAST_INSPC_ACPT.SLIP_TYP as SLIP_TYP, "
			+ "  T_PAST_INSPC_ACPT.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_PAST_INSPC_ACPT.COMPANY_CD as COMPANY_CD, "
			+ "  T_PAST_INSPC_ACPT.VEND_CD as VEND_CD, "
			+ "  T_PAST_INSPC_ACPT.PLANT_CD as PLANT_CD, "
			+ "  T_PAST_INSPC_ACPT.UNIT_COST as UNIT_COST, "
			+ "  T_PAST_INSPC_ACPT.UNIT_COST_TYP as UNIT_COST_TYP, "
			+ "  (T_PAST_INSPC_ACPT.PROCESSING_COST * -1) as PROCESSING_COST, "
			+ "  (T_PAST_INSPC_ACPT.MATERIAL_COST * -1) as MATERIAL_COST, "
			+ "  (T_PAST_INSPC_ACPT.OTHER_OVERHEADS * -1) as OTHER_OVERHEADS, "
			+ "  (T_PAST_INSPC_ACPT.ACPT_QTY * -1) as ACPT_QTY, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_QTY * -1) as INSPC_ACPT_QTY, "
			+ "  T_PAST_INSPC_ACPT.STOCK_UNIT as STOCK_UNIT, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_AMOUNT * -1) as INSPC_ACPT_AMOUNT, "
			+ "  (T_PAST_INSPC_ACPT.SAVING_AMOUNT * -1) as SAVING_AMOUNT, "
			+ "  T_PAST_INSPC_ACPT.ACPT_DATE as ACPT_DATE, "
			+ "  T_PAST_INSPC_ACPT.INSPC_ACPT_DATE as INSPC_ACPT_DATE, "
			+ "  T_PAST_INSPC_ACPT.PRODUCT_TYP as PRODUCT_TYP, "
			+ "  T_PAST_INSPC_ACPT.DLV_CD as DLV_CD, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT "
			+ "from "
			+ "  T_PAST_INSPC_ACPT, "
			+ "  ( "
			+ "    select "
			+ "      max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "    group by "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO "
			+ "  ) CUSTOM_T_PAST_INSPC_ACPT "
			+ "where "
			+ "  T_PAST_INSPC_ACPT.INSPC_ACPT_NO = CUSTOM_T_PAST_INSPC_ACPT.MAX_INSPC_ACPT_NO "
			+ "  and T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "  and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) ";
	/** 検収履歴（赤）SQL */
	private String insertCreditRecordInspcAcptSqlTypeInspc =
		"insert into "
			+ "  T_PAST_INSPC_ACPT( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    INSPC_ACPT_GNR_TYP, "
			+ "    CRCT_NO, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    SAVING_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "select "
			+ "  T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_NO + 1) as INSPC_ACPT_NO, "
			+ "  2 as INSPC_ACPT_GNR_TYP, "
			+ "  T_PAST_INSPC_ACPT.CRCT_NO as CRCT_NO, "
			+ "  1 as CRCT_TYP, "
			+ "  T_PAST_INSPC_ACPT.ITEM_CD as ITEM_CD, "
			+ "  T_PAST_INSPC_ACPT.ITEM_NAME as ITEM_NAME, "
			+ "  T_PAST_INSPC_ACPT.SLIP_TYP as SLIP_TYP, "
			+ "  T_PAST_INSPC_ACPT.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_PAST_INSPC_ACPT.COMPANY_CD as COMPANY_CD, "
			+ "  T_PAST_INSPC_ACPT.VEND_CD as VEND_CD, "
			+ "  T_PAST_INSPC_ACPT.PLANT_CD as PLANT_CD, "
			+ "  T_PAST_INSPC_ACPT.UNIT_COST as UNIT_COST, "
			+ "  T_PAST_INSPC_ACPT.UNIT_COST_TYP as UNIT_COST_TYP, "
			+ "  (T_PAST_INSPC_ACPT.PROCESSING_COST * -1) as PROCESSING_COST, "
			+ "  (T_PAST_INSPC_ACPT.MATERIAL_COST * -1) as MATERIAL_COST, "
			+ "  (T_PAST_INSPC_ACPT.OTHER_OVERHEADS * -1) as OTHER_OVERHEADS, "
			+ "  (T_PAST_INSPC_ACPT.ACPT_QTY * -1) as ACPT_QTY, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_QTY * -1) as INSPC_ACPT_QTY, "
			+ "  T_PAST_INSPC_ACPT.STOCK_UNIT as STOCK_UNIT, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_AMOUNT * -1) as INSPC_ACPT_AMOUNT, "
			+ "  (T_PAST_INSPC_ACPT.SAVING_AMOUNT * -1) as SAVING_AMOUNT, "
			+ "  T_PAST_INSPC_ACPT.ACPT_DATE as ACPT_DATE, "
			+ "  T_PAST_INSPC_ACPT.INSPC_ACPT_DATE as INSPC_ACPT_DATE, "
			+ "  T_PAST_INSPC_ACPT.PRODUCT_TYP as PRODUCT_TYP, "
			+ "  T_PAST_INSPC_ACPT.DLV_CD as DLV_CD, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT "
			+ "from "
			+ "  T_PAST_INSPC_ACPT, "
			+ "  ( "
			+ "    select "
			+ "      max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "    group by "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO "
			+ "  ) CUSTOM_T_PAST_INSPC_ACPT "
			+ "where "
			+ "  T_PAST_INSPC_ACPT.INSPC_ACPT_NO = CUSTOM_T_PAST_INSPC_ACPT.MAX_INSPC_ACPT_NO "
			+ "  and T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "  and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) ";
	/** 検収実績情報インターフェース（黒）SQL */
	private String insertDebitRecordInspcAcptIfSqlTypeAcpt =
		"insert into "
			+ "  T_INSPC_ACPT_IF( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    SLIP_CD, "
			+ "    ORGN_SLIP_CD, "
			+ "    EXCH_RATE, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    DISC_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    GNR_ORG_CD, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    SBCNT_PUCH_TYP, "
			+ "    JOB_ODR_CD, "
			+ "    JOB_ODR_DETAIL_NO, "
			+ "    CLASIFICATION_CD, "
			+ "    INV_CTRL_FLG, "
			+ "    PUCH_RTN_FLG, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT, "
			+ "    APPR_FLG "
			+ "  ) "
			+ "select "
			+ "  T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_ACPT_RSLT.ACPT_NO as ACPT_NO, "
			+ "  nvl((T2.INSPC_ACPT_NO + 1), 1) as INSPC_ACPT_NO, "
			+ "  ? as SLIP_CD, "
			+ "  null as ORGN_SLIP_CD, "
			+ "  to_number(?) as EXCH_RATE, "
			+ "  2 as CRCT_TYP, "
			+ "  T_RLSD_PUCH_ODR.ITEM_CD as ITEM_CD, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.ITEM_NAME, T_RLSD_PUCH_ODR.NON_NO_ITEM_NAME) as ITEM_NAME, "
			+ "  79 as SLIP_TYP, "
			+ "  T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_RLSD_PUCH_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_RLSD_PUCH_ODR.VEND_CD as VEND_CD, "
			+ "  T_RLSD_PUCH_ODR.PLANT_CD as PLANT_CD, "
			+ "  T_ACPT_RSLT.UNIT_COST as UNIT_COST, "
			+ "  T_ACPT_RSLT.UNIT_COST_TYP as UNIT_COST_TYP, "
			+ "  T_ACPT_RSLT.PROCESSING_COST as PROCESSING_COST, "
			+ "  T_ACPT_RSLT.MATERIAL_COST as MATERIAL_COST, "
			+ "  T_ACPT_RSLT.OTHER_OVERHEADS as OTHER_OVERHEADS, "
			+ "  T_ACPT_RSLT.ACPT_QTY as ACPT_QTY, "
			+ "  T_ACPT_RSLT.ACPT_QTY as INSPC_ACPT_QTY, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.STOCK_UNIT, T_RLSD_PUCH_ODR.NON_NO_ITEM_PUCH_ODR_UNIT) as STOCK_UNIT, "
			+ "  T_ACPT_RSLT.PUCH_ODR_AMOUNT as INSPC_ACPT_AMOUNT, "
			+ "  T_ACPT_RSLT.DISC_AMOUNT as DISC_AMOUNT, "
			+ "  T_ACPT_RSLT.ACPT_DATE as ACPT_DATE, "
			+ "  T_ACPT_RSLT.ACPT_DATE as INSPC_ACPT_DATE, "
			+ "  T_RLSD_PUCH_ODR.PLANT_CD as GNR_ORG_CD, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.PRODUCT_TYP, T_RLSD_PUCH_ODR.NON_NO_ITEM_TYP) as PRODUCT_TYP, "
			+ "  T_ACPT_RSLT.DLV_CD as DLV_CD, "
			+ "  0 as SBCNT_PUCH_TYP, "
			+ "  decode(T_RLSD_PUCH_ODR.INV_CTRL_FLG, 1, T_OD.JOB_ODR_CD, NULL) as JOB_ODR_CD, "
			+ "  0 as JOB_ODR_DETAIL_NO, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.CLASIFICATION_CD, NULL) as CLASIFICATION_CD, "
			+ "  T_RLSD_PUCH_ODR.INV_CTRL_FLG as INV_CTRL_FLG, "
			+ "  0 as PUCH_RTN_FLG, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT, "
			+ "  ? as APPR_FLG "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_ACPT_RSLT, "
			+ "  M_ITEM, "
			+ "  T_WORK_IN_PROC_BY_PROC, "
			+ "  T_OD, "
			+ "  ( "
			+ "    select "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "      T_PAST_INSPC_ACPT.INSPC_ACPT_NO as INSPC_ACPT_NO "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT, "
			+ "      ( "
			+ "        select "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "          max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "        from "
			+ "          T_PAST_INSPC_ACPT "
			+ "        where "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "          and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "        group by "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO "
			+ "      ) T1 "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.INSPC_ACPT_NO = T1.MAX_INSPC_ACPT_NO "
			+ "      and T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "  ) T2 "
			+ "where "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
			+ "  and T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T2.PUCH_ODR_CD(+) "
			+ "  and T_ACPT_RSLT.ACPT_NO = T2.ACPT_NO(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_ACPT_RSLT.ACPT_NO = to_number(?) ";
	/** 検収実績情報インターフェース（黒）SQL */
	private String insertDebitRecordInspcAcptIfSqlTypeInspc =
		"insert into "
			+ "  T_INSPC_ACPT_IF( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    SLIP_CD, "
			+ "    ORGN_SLIP_CD, "
			+ "    EXCH_RATE, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    DISC_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    GNR_ORG_CD, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    SBCNT_PUCH_TYP, "
			+ "    JOB_ODR_CD, "
			+ "    JOB_ODR_DETAIL_NO, "
			+ "    CLASIFICATION_CD, "
			+ "    INV_CTRL_FLG, "
			+ "    PUCH_RTN_FLG, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT, "
			+ "    APPR_FLG "
			+ "  ) "
			+ "select "
			+ "  T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_ACPT_RSLT.ACPT_NO as ACPT_NO, "
			+ "  nvl((T2.INSPC_ACPT_NO + 1), 1) as INSPC_ACPT_NO, "
			+ "  ? as SLIP_CD, "
			+ "  null as ORGN_SLIP_CD, "
			+ "  to_number(?) as EXCH_RATE, "
			+ "  2 as CRCT_TYP, "
			+ "  T_RLSD_PUCH_ODR.ITEM_CD as ITEM_CD, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.ITEM_NAME, T_RLSD_PUCH_ODR.NON_NO_ITEM_NAME) as ITEM_NAME, "
			+ "  79 as SLIP_TYP, "
			+ "  T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_RLSD_PUCH_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_RLSD_PUCH_ODR.VEND_CD as VEND_CD, "
			+ "  T_RLSD_PUCH_ODR.PLANT_CD as PLANT_CD, "
			+ "  T_ACPT_RSLT.UNIT_COST as UNIT_COST, "
			+ "  T_ACPT_RSLT.UNIT_COST_TYP as UNIT_COST_TYP, "
			+ "  T_ACPT_RSLT.PROCESSING_COST as PROCESSING_COST, "
			+ "  T_ACPT_RSLT.MATERIAL_COST as MATERIAL_COST, "
			+ "  T_ACPT_RSLT.OTHER_OVERHEADS as OTHER_OVERHEADS, "
			+ "  T_ACPT_RSLT.ACPT_QTY as ACPT_QTY, "
			+ "  (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0))) as INSPC_ACPT_QTY, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.STOCK_UNIT, T_RLSD_PUCH_ODR.NON_NO_ITEM_PUCH_ODR_UNIT) as STOCK_UNIT, "
			+ "  decode(M_VEND_CTRL.ROUND_TYP, 2, CEIL(ABS((T_ACPT_RSLT.UNIT_COST * (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0))))) * POWER(10,M_CUR.DECIMAL_FIG)) / POWER(10,M_CUR.DECIMAL_FIG) * SIGN((T_ACPT_RSLT.UNIT_COST * (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0))))), 3, trunc((T_ACPT_RSLT.UNIT_COST * (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0)))), M_CUR.DECIMAL_FIG), round((T_ACPT_RSLT.UNIT_COST * (T_ACPT_RSLT.ACPT_QTY - (nvl(T_INSPC_RSLT.INSPECTED_QTY, 0) - nvl(T_INSPC_RSLT.ACCEPTED_QTY, 0)))), M_CUR.DECIMAL_FIG)) as INSPC_ACPT_AMOUNT, "
			+ "  T_ACPT_RSLT.DISC_AMOUNT as DISC_AMOUNT, "
			+ "  T_ACPT_RSLT.ACPT_DATE as ACPT_DATE, "
			//+ "  T_ACPT_RSLT.ACPT_DATE as INSPC_ACPT_DATE, "
			+ "  decode(?, '1', T_INSPC_RSLT.INSPEC_DATE,T_ACPT_RSLT.ACPT_DATE) as INSPC_ACPT_DATE, "
			+ "  T_RLSD_PUCH_ODR.PLANT_CD as GNR_ORG_CD, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.PRODUCT_TYP, T_RLSD_PUCH_ODR.NON_NO_ITEM_TYP) as PRODUCT_TYP, "
			+ "  T_ACPT_RSLT.DLV_CD as DLV_CD, "
			+ "  0 as SBCNT_PUCH_TYP, "
			+ "  decode(T_RLSD_PUCH_ODR.INV_CTRL_FLG, 1, T_OD.JOB_ODR_CD, NULL) as JOB_ODR_CD, "
			+ "  0 as JOB_ODR_DETAIL_NO, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.CLASIFICATION_CD, NULL) as CLASIFICATION_CD, "
			+ "  T_RLSD_PUCH_ODR.INV_CTRL_FLG as INV_CTRL_FLG, "
			+ "  0 as PUCH_RTN_FLG, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT, "
			+ "  ? as APPR_FLG "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_ACPT_RSLT, "
			+ "  T_INSPC_RSLT, "
			+ "  M_ITEM, "
			+ "  M_VEND_CTRL, "
			+ "  M_CUR, "
			+ "  SYS_HOME_CUR, "
			+ "  T_WORK_IN_PROC_BY_PROC, "
			+ "  T_OD, "
			+ "  ( "
			+ "    select "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "      T_PAST_INSPC_ACPT.INSPC_ACPT_NO as INSPC_ACPT_NO "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT, "
			+ "      ( "
			+ "        select "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "          max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "        from "
			+ "          T_PAST_INSPC_ACPT "
			+ "        where "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "          and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "        group by "
			+ "          T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "          T_PAST_INSPC_ACPT.ACPT_NO "
			+ "      ) T1 "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.INSPC_ACPT_NO = T1.MAX_INSPC_ACPT_NO "
			+ "      and T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "  ) T2 "
			+ "where "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
			+ "  and T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD "
			+ "  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD "
			+ "  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T_INSPC_RSLT.PUCH_ODR_CD(+) "
			+ "  and T_ACPT_RSLT.ACPT_NO = T_INSPC_RSLT.ACPT_NO(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T2.PUCH_ODR_CD(+) "
			+ "  and T_ACPT_RSLT.ACPT_NO = T2.ACPT_NO(+) "
			+ "  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
			+ "  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_ACPT_RSLT.ACPT_NO = to_number(?) ";
	/** 検収実績情報インターフェース（赤）SQL */
	private String insertCreditRecordInspcAcptIfSql =
		"insert into "
			+ "  T_INSPC_ACPT_IF( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    SLIP_CD, "
			+ "    ORGN_SLIP_CD, "
			+ "    EXCH_RATE, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    DISC_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    GNR_ORG_CD, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    SBCNT_PUCH_TYP, "
			+ "    JOB_ODR_CD, "
			+ "    JOB_ODR_DETAIL_NO, "
			+ "    CLASIFICATION_CD, "
			+ "    INV_CTRL_FLG, "
			+ "    PUCH_RTN_FLG, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT, "
			+ "    APPR_FLG "
			+ "  ) "
			+ "select "
			+ "  T_PAST_INSPC_ACPT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_PAST_INSPC_ACPT.ACPT_NO as ACPT_NO, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_NO + 1) as INSPC_ACPT_NO, "
			+ "  ? as SLIP_CD, "
			+ "  T_PAST_INSPC_ACPT.SLIP_CD as ORGN_SLIP_CD, "
			+ "  T_PAST_INSPC_ACPT.EXCH_RATE as EXCH_RATE, "
			+ "  1 as CRCT_TYP, "
			+ "  T_PAST_INSPC_ACPT.ITEM_CD as ITEM_CD, "
			+ "  T_PAST_INSPC_ACPT.ITEM_NAME as ITEM_NAME, "
			+ "  T_PAST_INSPC_ACPT.SLIP_TYP as SLIP_TYP, "
			+ "  T_PAST_INSPC_ACPT.WORK_IN_PROC_CD as WORK_IN_PROC_CD, "
			+ "  T_PAST_INSPC_ACPT.COMPANY_CD as COMPANY_CD, "
			+ "  T_PAST_INSPC_ACPT.VEND_CD as VEND_CD, "
			+ "  T_PAST_INSPC_ACPT.PLANT_CD as PLANT_CD, "
			+ "  T_PAST_INSPC_ACPT.UNIT_COST as UNIT_COST, "
			+ "  T_PAST_INSPC_ACPT.UNIT_COST_TYP as UNIT_COST_TYP, "
			+ "  (T_PAST_INSPC_ACPT.PROCESSING_COST * -1) as PROCESSING_COST, "
			+ "  (T_PAST_INSPC_ACPT.MATERIAL_COST * -1) as MATERIAL_COST, "
			+ "  (T_PAST_INSPC_ACPT.OTHER_OVERHEADS * -1) as OTHER_OVERHEADS, "
			+ "  (T_PAST_INSPC_ACPT.ACPT_QTY * -1) as ACPT_QTY, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_QTY * -1) as INSPC_ACPT_QTY, "
			+ "  T_PAST_INSPC_ACPT.STOCK_UNIT as STOCK_UNIT, "
			+ "  (T_PAST_INSPC_ACPT.INSPC_ACPT_AMOUNT * -1) as INSPC_ACPT_AMOUNT, "
			+ "  (T_PAST_INSPC_ACPT.SAVING_AMOUNT * -1) as SAVING_AMOUNT, "
			+ "  T_PAST_INSPC_ACPT.ACPT_DATE as ACPT_DATE, "
			+ "  T_PAST_INSPC_ACPT.ACPT_DATE as INSPC_ACPT_DATE, "
			+ "  T_RLSD_PUCH_ODR.PLANT_CD as GNR_ORG_CD, "
			+ "  T_PAST_INSPC_ACPT.PRODUCT_TYP as PRODUCT_TYP, "
			+ "  T_PAST_INSPC_ACPT.DLV_CD as DLV_CD, "
			+ "  0 as SBCNT_PUCH_TYP, "
			+ "  decode(T_RLSD_PUCH_ODR.INV_CTRL_FLG, 1, T_OD.JOB_ODR_CD, NULL) as JOB_ODR_CD, "
			+ "  0 as JOB_ODR_DETAIL_NO, "
			+ "  decode(T_RLSD_PUCH_ODR.NON_NO_ITEM_FLG, 0, M_ITEM.CLASIFICATION_CD, NULL) as CLASIFICATION_CD, "
			+ "  T_RLSD_PUCH_ODR.INV_CTRL_FLG as INV_CTRL_FLG, "
			+ "  0 as PUCH_RTN_FLG, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT, "
			+ "  ? as APPR_FLG "
			+ "from "
			+ "  T_PAST_INSPC_ACPT, "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  M_ITEM, "
			+ "  T_OD, "
			+ "  ( "
			+ "    select "
			+ "      max(T_PAST_INSPC_ACPT.INSPC_ACPT_NO) as MAX_INSPC_ACPT_NO "
			+ "    from "
			+ "      T_PAST_INSPC_ACPT "
			+ "    where "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "      and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "    group by "
			+ "      T_PAST_INSPC_ACPT.PUCH_ODR_CD, "
			+ "      T_PAST_INSPC_ACPT.ACPT_NO "
			+ "  ) CUSTOM_T_PAST_INSPC_ACPT "
			+ "where "
			+ "  T_PAST_INSPC_ACPT.INSPC_ACPT_NO = CUSTOM_T_PAST_INSPC_ACPT.MAX_INSPC_ACPT_NO "
			+ "  and T_PAST_INSPC_ACPT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD "
			+ "  and T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
			+ "  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "  and T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "  and T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) ";
	/** 作業系列別仕掛 */
	private String updateWorkInProcByProcForCompleteSql =
		"update "
			+ "  T_WORK_IN_PROC_BY_PROC "
			+ "set "
			+ "  ( "
			+ "    WORK_STS_TYP, "
			+ "    WORK_CMPLT_DATE, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "  = "
			+ "  ( "
			+ "    select "
			+ "      9 as WORK_STS_TYP, "
			+ "      T_ACPT_RSLT.ACPT_DATE as WORK_CMPLT_DATE, "
			+ "      sysdate as UPDATED_DATE, "
			+ "      ? as UPDATED_BY, "
			+ "      ? as UPDATED_PRG_NM, "
			+ "      (T_WORK_IN_PROC_BY_PROC.MODIFY_COUNT + 1) as MODIFY_COUNT "
			+ "    from "
			+ "      T_ACPT_RSLT, "
			+ "      ( "
			+ "        select "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          MAX(T_ACPT_RSLT.ACPT_NO) as MAX_ACPT_NO "
			+ "        from "
			+ "          T_ACPT_RSLT "
			+ "        where "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "        group by "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD "
			+ "      ) CUSTOM_T_ACPT_RSLT, "
			+ "      T_RLSD_PUCH_ODR, "
			+ "      T_WORK_IN_PROC_BY_PROC "
			+ "    where "
			+ "      T_ACPT_RSLT.ACPT_NO = CUSTOM_T_ACPT_RSLT.MAX_ACPT_NO "
			+ "      and T_ACPT_RSLT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD "
			+ "      and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD "
			+ "      and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD "
			+ "      and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  ) "
			+ "where "
			+ "  T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD = ? "
			+ "  and T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = ? ";
	/** 作業系列別仕掛(検査後) */
	private String updateWorkInProcByProcForCompleteInspcSql =
		"update "
			+ "  T_WORK_IN_PROC_BY_PROC "
			+ "set "
			+ "  ( "
			+ "    WORK_STS_TYP, "
			+ "    WORK_CMPLT_DATE, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "  = "
			+ "  ( "
			+ "    select "
			+ "      9 as WORK_STS_TYP, "
			+ "      ?, "
			+ "      sysdate as UPDATED_DATE, "
			+ "      ? as UPDATED_BY, "
			+ "      ? as UPDATED_PRG_NM, "
			+ "      (T_WORK_IN_PROC_BY_PROC.MODIFY_COUNT + 1) as MODIFY_COUNT "
			+ "    from "
			+ "      T_ACPT_RSLT, "
			+ "      ( "
			+ "        select "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          MAX(T_ACPT_RSLT.ACPT_NO) as MAX_ACPT_NO "
			+ "        from "
			+ "          T_ACPT_RSLT "
			+ "        where "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "        group by "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD "
			+ "      ) CUSTOM_T_ACPT_RSLT, "
			+ "      T_RLSD_PUCH_ODR, "
			+ "      T_WORK_IN_PROC_BY_PROC "
			+ "    where "
			+ "      T_ACPT_RSLT.ACPT_NO = CUSTOM_T_ACPT_RSLT.MAX_ACPT_NO "
			+ "      and T_ACPT_RSLT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD "
			+ "      and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD "
			+ "      and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD "
			+ "      and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  ) "
			+ "where "
			+ "  T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD = ? "
			+ "  and T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = ? ";
	/** 作業系列別仕掛 */
	private String updateWorkInProcByProcForCancelSql =
		"update "
			+ "  T_WORK_IN_PROC_BY_PROC "
			+ "set "
			+ "  WORK_STS_TYP = 2, "
			+ "  WORK_CMPLT_DATE = NULL, "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_WORK_IN_PROC_BY_PROC.MODIFY_COUNT + 1) "
			+ "where "
			+ "  T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD = ? "
			+ "  and T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = ? ";
	/** 品目仕掛 */
	private String updateWorkInProcByItemForCompleteSql =
		"update "
			+ "  T_WORK_IN_PROC_BY_ITEM "
			+ "set "
			+ "  ( "
			+ "    WORK_STS_TYP, "
			+ "    WORK_CMPLT_DATE, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "  = "
			+ "  ( "
			+ "    select "
			+ "      9 as WORK_STS_TYP, "
			+ "      T_ACPT_RSLT.ACPT_DATE as WORK_CMPLT_DATE, "
			+ "      sysdate as UPDATED_DATE, "
			+ "      ? as UPDATED_BY, "
			+ "      ? as UPDATED_PRG_NM, "
			+ "      (T_WORK_IN_PROC_BY_ITEM.MODIFY_COUNT + 1) as MODIFY_COUNT "
			+ "    from "
			+ "      T_ACPT_RSLT, "
			+ "      ( "
			+ "        select "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          MAX(T_ACPT_RSLT.ACPT_NO) as MAX_ACPT_NO "
			+ "        from "
			+ "          T_ACPT_RSLT "
			+ "        where "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "        group by "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD "
			+ "      ) CUSTOM_T_ACPT_RSLT, "
			+ "      T_RLSD_PUCH_ODR, "
			+ "      T_WORK_IN_PROC_BY_ITEM "
			+ "    where "
			+ "      T_ACPT_RSLT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD "
			+ "      and T_ACPT_RSLT.ACPT_NO = CUSTOM_T_ACPT_RSLT.MAX_ACPT_NO "
			+ "      and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD "
			+ "      and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  ) "
			+ "where "
			+ "  T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD = ? ";
	
	/** 品目仕掛(検査後) */
	private String updateWorkInProcByItemForCompleteInspcSql =
		"update "
			+ "  T_WORK_IN_PROC_BY_ITEM "
			+ "set "
			+ "  ( "
			+ "    WORK_STS_TYP, "
			+ "    WORK_CMPLT_DATE, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "  = "
			+ "  ( "
			+ "    select "
			+ "      9 as WORK_STS_TYP, "
			+ "      ? as WORK_CMPLT_DATE, "
			+ "      sysdate as UPDATED_DATE, "
			+ "      ? as UPDATED_BY, "
			+ "      ? as UPDATED_PRG_NM, "
			+ "      (T_WORK_IN_PROC_BY_ITEM.MODIFY_COUNT + 1) as MODIFY_COUNT "
			+ "    from "
			+ "      T_ACPT_RSLT, "
			+ "      ( "
			+ "        select "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "          MAX(T_ACPT_RSLT.ACPT_NO) as MAX_ACPT_NO "
			+ "        from "
			+ "          T_ACPT_RSLT "
			+ "        where "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "        group by "
			+ "          T_ACPT_RSLT.PUCH_ODR_CD "
			+ "      ) CUSTOM_T_ACPT_RSLT, "
			+ "      T_RLSD_PUCH_ODR, "
			+ "      T_WORK_IN_PROC_BY_ITEM "
			+ "    where "
			+ "      T_ACPT_RSLT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD "
			+ "      and T_ACPT_RSLT.ACPT_NO = CUSTOM_T_ACPT_RSLT.MAX_ACPT_NO "
			+ "      and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD "
			+ "      and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  ) "
			+ "where "
			+ "  T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD = ? ";
	/** 品目仕掛 */
	private String updateWorkInProcByItemForCancelSql =
		"update "
			+ "  T_WORK_IN_PROC_BY_ITEM "
			+ "set "
			+ "  WORK_STS_TYP = 2, "
			+ "  WORK_CMPLT_DATE = NULL, "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_WORK_IN_PROC_BY_ITEM.MODIFY_COUNT + 1) "
			+ "where "
			+ "  T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD = ? ";
	/** 保管区別入出庫の登録（通常入庫） */
	private String insertRcvIssueSql =
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
			+ "    LOT_NO, "
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
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "select "
			+ "  ? as RCV_ISSUE_CTRL_CD, "
			+ "  1 as RCV_ISSUE_TYP, "
			+ "  T_RLSD_PUCH_ODR.ITEM_CD as ITEM_CD, "
			+ "  T_ACPT_RSLT.PLANT_CD as PLANT_CD, "		// 2007/10/03更新
			+ "  decode(T_RLSD_PUCH_ODR.ACPT_INSPC_TYP,1,T_ACPT_RSLT.WH_CD,T_ACPT_RSLT.INSPC_WH_CD) as WH_CD, "		// 保管区コード
			+ "  decode(T_OD.JOB_ODR_CD,NULL,NULL,decode(A.JOB_ODR_TYP,3,decode(A.ITEM_CD,T_RLSD_PUCH_ODR.ITEM_CD,NULL,T_OD.JOB_ODR_CD),T_OD.JOB_ODR_CD)) as JOB_ODR_CD, "
			+ "  0 as JOB_ODR_DETAIL_NO, "
			+ "  T_ACPT_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_ACPT_RSLT.ACPT_NO as ACPT_NO, "
			+ "  T_ACPT_RSLT.ACPT_CRCT_NO as ACPT_RSLT_CRCT_NO, "
			+ "  decode(T_INSPC_RSLT.INSPC_CRCT_NO,NULL,0,T_INSPC_RSLT.INSPC_CRCT_NO) as INSPEC_RSLT_CRCT_NO, "				// 2007/10/05更新
			+ "  NULL as WORK_ODR_CD, "
			+ "  NULL as WORK_IN_PROC_CD, "
			+ "  0 as PARTIAL_PRD_NO, "
			+ "  0 as OPR_RSLT_CRCT_NO, "
			+ "  NULL as ISSUE_INST_CD, "
			+ "  T_ACPT_RSLT.ACPT_QTY as RCV_ISSUE_QTY, "	// 2007/10/03更新
			+ "  0 as RCV_ISSUE_AMOUNT, "
			+ "  T_ACPT_RSLT.ACPT_DATE as RCV_ISSUE_DATE, "	// 2007/10/03更新
			+ "  decode(T_RLSD_PUCH_ODR.ACPT_INSPC_TYP,1,11,15) as RCV_ISSUE_GNR_TYP, "		// 入出庫発生区分
			+ "  0 as RCV_ISSUE_ODD_QTY, "
			+ "  NULL as DEFECT_CAUSE_CD, "
			+ "  1 as STOCK_UPD_TYP, "
			+ "  decode(T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP, 9, decode(T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG, 1, 1, 0), 0) as RCV_ISSUE_CMPLT_FLG, "
			+ "  T_RLSD_PUCH_ODR.OD_NO as OD_NO, "
			+ "  T_ACPT_RSLT.LOT_NO as LOT_NO, "
			+ "  T_ACPT_RSLT.VEND_LOT_NO as VEND_LOT_NO, "		// 2007/10/03更新
			+ "  NULL as RCV_ISSUE_COMMENT, "
			+ "  T_RLSD_PUCH_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_RLSD_PUCH_ODR.VEND_CD as VEND_CD, "
			+ "  0 as CONS_TYP, "
			+ "  NULL as CONS_EXEC_DATE, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_ACPT_RSLT, "
			+ "  T_INSPC_RSLT, "		// 2007/10/05 追加
			+ "  T_OD, "
			+ "(select  "
			+ "    T_JOB_ODR.ITEM_CD, "
			+ "    T_JOB_ODR.JOB_ODR_TYP "
			+ "  from "
			+ "    T_JOB_ODR, "
			+ "    T_OD, "
			+ "    T_RLSD_PUCH_ODR "
			+ "  where "
			+ "    T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
			+ "    and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "    and T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
			+ "    and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
			+ "    and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
			+ "  ) A "
			+ "where "
			+ "  T_ACPT_RSLT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = T_INSPC_RSLT.PUCH_ODR_CD(+) "		// 2007/10/05 追加
			+ "  and T_ACPT_RSLT.ACPT_NO = T_INSPC_RSLT.ACPT_NO(+) "				// 2007/10/10 追加
			+ "  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "  and T_ACPT_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_ACPT_RSLT.ACPT_NO = to_number(?) ";

// ========================================以下SQL小林追加 =========================================


	/** 保管区別入出庫検索 */
	private String selectTRcvIssueSql =
		"SELECT "
			+ "    T_RCV_ISSUE.RCV_ISSUE_CTRL_CD AS RCV_ISSUE_CTRL_CD, "
			+ "    T_RCV_ISSUE.RCV_ISSUE_TYP AS RCV_ISSUE_TYP, "
			+ "    T_RCV_ISSUE.ITEM_CD AS ITEM_CD, "
			+ "    T_RCV_ISSUE.PLANT_CD AS PLANT_CD, "
			+ "    T_RCV_ISSUE.WH_CD AS WH_CD , "
			+ "    T_RCV_ISSUE.JOB_ODR_CD AS JOB_ODR_CD, "
			+ "    T_RCV_ISSUE.JOB_ODR_DETAIL_NO AS JOB_ODR_DETAIL_NO, "
			+ "    T_RCV_ISSUE.PUCH_ODR_CD AS PUCH_ODR_CD, "
			+ "    T_RCV_ISSUE.ACPT_NO AS ACPT_NO, "
			+ "    T_RCV_ISSUE.ACPT_RSLT_CRCT_NO AS ACPT_RSLT_CRCT_NO, "
			+ "    T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO AS INSPEC_RSLT_CRCT_NO, "
			+ "    T_RCV_ISSUE.WORK_ODR_CD AS WORK_ODR_CD, "
			+ "    T_RCV_ISSUE.WORK_IN_PROC_CD AS WORK_IN_PROC_CD, "
			+ "    T_RCV_ISSUE.PARTIAL_PRD_NO AS PARTIAL_PRD_NO, "
			+ "    T_RCV_ISSUE.OPR_RSLT_CRCT_NO AS OPR_RSLT_CRCT_NO, "
			+ "    T_RCV_ISSUE.ISSUE_INST_CD AS ISSUE_INST_CD, "
			+ "    T_RCV_ISSUE.RCV_ISSUE_QTY AS RCV_ISSUE_QTY, "
			+ "    T_RCV_ISSUE.RCV_ISSUE_AMOUNT AS RCV_ISSUE_AMOUNT, "
			+ "    TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_DATE, 'YYYY/MM/DD') AS RCV_ISSUE_DATE, "
			+ "    T_RCV_ISSUE.RCV_ISSUE_GNR_TYP AS RCV_ISSUE_GNR_TYP, "
			+ "    T_RCV_ISSUE.RCV_ISSUE_ODD_QTY AS RCV_ISSUE_ODD_QTY, "
			+ "    T_RCV_ISSUE.DEFECT_CAUSE_CD AS DEFECT_CAUSE_CD, "
			+ "    T_RCV_ISSUE.STOCK_UPD_TYP AS STOCK_UPD_TYP, "
			+ "    T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG AS RCV_ISSUE_CMPLT_FLG, "
			+ "    T_RCV_ISSUE.OD_NO AS OD_NO, "
			+ "    T_RCV_ISSUE.LOT_NO AS LOT_NO, "
			+ "    T_RCV_ISSUE.VEND_LOT_NO AS VEND_LOT_NO, "
			+ "    T_RCV_ISSUE.RCV_ISSUE_COMMENT AS RCV_ISSUE_COMMENT, "
			+ "    T_RCV_ISSUE.COMPANY_CD AS COMPANY_CD, "
			+ "    T_RCV_ISSUE.VEND_CD AS VEND_CD, "
			+ "    T_RCV_ISSUE.CONS_TYP AS CONS_TYP, "
			+ "    T_RCV_ISSUE.CONS_EXEC_DATE AS CONS_EXEC_DATE, "
			+ "    T_RCV_ISSUE.CREATED_DATE AS CREATED_DATE, "
			+ "    T_RCV_ISSUE.CREATED_BY AS CREATED_BY, "
			+ "    T_RCV_ISSUE.CREATED_PRG_NM AS CREATED_PRG_NM, "
			+ "    T_RCV_ISSUE.UPDATED_DATE AS UPDATED_DATE, "
			+ "    T_RCV_ISSUE.UPDATED_BY AS UPDATED_BY, "
			+ "    T_RCV_ISSUE.UPDATED_PRG_NM AS UPDATED_PRG_NM, "
			+ "    T_RCV_ISSUE.MODIFY_COUNT AS MODIFY_COUNT "
			+ "FROM "
			+ "  T_RCV_ISSUE, "
			+ "  ( "
			+ "   SELECT "
			+ "     MAX(INSPEC_RSLT_CRCT_NO) AS INSPEC_RSLT_CRCT_NO"
			+ "   FROM "
			+ "     T_RCV_ISSUE "
			+ "   WHERE "
			+ "     T_RCV_ISSUE.PUCH_ODR_CD = ? "
			+ "     AND T_RCV_ISSUE.PLANT_CD = ? "
			+ "     AND T_RCV_ISSUE.ACPT_NO = to_number(?) "
			+ "  ) TRI "
			+ "where "
			+ "  T_RCV_ISSUE.RCV_ISSUE_TYP = 4 "
			+ "  AND T_RCV_ISSUE.PUCH_ODR_CD = ? "
			+ "  AND T_RCV_ISSUE.PLANT_CD = ? "
			+ "  AND T_RCV_ISSUE.ACPT_NO = to_number(?) "
			+ "  AND T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO = TRI.INSPEC_RSLT_CRCT_NO "
			+ "  AND T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = 25 ";
	/** 発注残検索 */
	private String selectTRlsdPuchOdrSql =
		"SELECT "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP AS PUCH_ODR_STS_TYP, "
			+ "  T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG AS INSPC_CMPLT_FLG "
			+ "FROM "
			+ "  T_RLSD_PUCH_ODR "
			+ "where "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? ";
	/** 保管区別入出庫追加 */
	private String insertTRcvIssueSql =
		"INSERT INTO "
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
			+ "    LOT_NO, "
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
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ " VALUES "
			+ " ( "
			+ "  ?, "
			+ "  4, "
			+ "  ?, "
			+ "  ?, "
			+ "  ?, "
			+ "  ?, "
			+ "  to_number(?), "
			+ "  ?, "
			+ "  to_number(?), "
			+ "  to_number(?), "
			+ "  to_number(?), "
			+ "  ?, "
			+ "  ?, "
			+ "  to_number(?), "
			+ "  to_number(?), "
			+ "  ?, "
			+ "  to_number(?), "
			+ "  0, "
			+ "  to_date(?,'YYYY/MM/DD'), "
			+ "  to_number(?), "
			+ "  0, "
			+ "  null, "
			+ "  2, "
			+ "  to_number(?), "
			+ "  ?, "
			+ "  ?, "
			+ "  ?, "
			+ "  null, "
			+ "  ?, "
			+ "  ?, "
			+ "  0, "
			+ "  null, "
			+ "  sysdate, "
			+ "  ?,"
			+ "  ?, "
			+ "  sysdate, "
			+ "  ?, "
			+ "  ?, "
			+ "  0  "
			+ " ) ";
	/** 保管区別品目在庫検索 */
	private String selectTItemStockSql =
		"SELECT "
			+ "    ITEM_CD, "
			+ "    WH_CD, "
			+ "    PLANT_CD, "
			+ "    STOCK_ON_HAND_QTY, "
			+ "    DEFECT_QTY, "
			+ "    PRVS_DAYEND_STOCK_QTY, "
			+ "    PRVS_MONTHEND_STOCK_QTY, "
			+ "    PRVS_TERMEND_STOCK_QTY, "
			+ "    ALCD_QTY "
			+ "FROM "
			+ "  T_ITEM_STOCK "
			+ "WHERE "
			+ "  T_ITEM_STOCK.ITEM_CD = ? "
			+ "  AND T_ITEM_STOCK.WH_CD = ? "
			+ "  AND T_ITEM_STOCK.PLANT_CD = ? ";
	/** 保管区別品目在庫更新 */
	private String updateTItemStockSql =
		"UPDATE "
			+ "  T_ITEM_STOCK "
			+ "SET "
			+ "  STOCK_ON_HAND_QTY = ?, "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_ITEM_STOCK.MODIFY_COUNT + 1) "
			+ "WHERE "
			+ "  T_ITEM_STOCK.ITEM_CD = ? "
			+ "  AND T_ITEM_STOCK.WH_CD = ? "
			+ "  AND T_ITEM_STOCK.PLANT_CD = ? ";
	/** 保管区別品目在庫追加 */
	private String insertTItemStockSql =
		"INSERT INTO "
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
			+ "  VALUES "
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
	/** 保管区別製番在庫検索 */
	private String selectTJobOdrCdStockSql =
		"SELECT "
			+ "    JOB_ODR_CD, "
			+ "    JOB_ODR_DETAIL_NO, "
			+ "    ITEM_CD, "
			+ "    WH_CD, "
			+ "    PLANT_CD, "
			+ "    STOCK_ON_HAND_QTY, "
			+ "    PRVS_DAYEND_STOCK_QTY, "
			+ "    PRVS_MONTHEND_STOCK_QTY, "
			+ "    PRVS_TERMEND_STOCK_QTY "
			+ "FROM "
			+ "  T_JOB_ODR_CD_STOCK "
			+ "WHERE "
			+ "  T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
			+ "  AND T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = to_number(?) "
			+ "  AND T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
			+ "  AND T_JOB_ODR_CD_STOCK.WH_CD = ? "
			+ "  AND T_JOB_ODR_CD_STOCK.PLANT_CD = ? ";
	/** 保管区別製番在庫更新 */
	private String updateTJobOdrCdStockSql =
		"UPDATE "
			+ "  T_JOB_ODR_CD_STOCK "
			+ "SET "
			+ "  STOCK_ON_HAND_QTY = ?, "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_JOB_ODR_CD_STOCK.MODIFY_COUNT + 1) "
			+ "WHERE "
			+ "  T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
			+ "  AND T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = to_number(?) "
			+ "  AND T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
			+ "  AND T_JOB_ODR_CD_STOCK.WH_CD = ? "
			+ "  AND T_JOB_ODR_CD_STOCK.PLANT_CD = ? ";
	/** 保管区別製番在庫追加 */
	private String insertTJobOdrCdStockSql =
		"INSERT INTO "
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
			+ "  VALUES "
			+ "  ( "
			+ "    ?, "
			+ "    to_number(?), "
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
	/** 保管区別入出庫更新 */
	private String updateTRcvIssueSql =
		"UPDATE "
			+ "  T_RCV_ISSUE "
			+ "SET "
			+ "  RCV_ISSUE_BEFORE_QTY = to_number(?), "
			+ "  RCV_ISSUE_AFTER_QTY = to_number(?), "
			+ "  STOCK_UPD_TYP = 2, "
			+ "  UPDATED_DATE = sysdate, "
			+ "  UPDATED_BY = ?, "
			+ "  UPDATED_PRG_NM = ?, "
			+ "  MODIFY_COUNT = (T_RCV_ISSUE.MODIFY_COUNT + 1) "
			+ "WHERE "
			+ "  T_RCV_ISSUE.RCV_ISSUE_CTRL_CD = ? ";
	/** 検収履歴(赤)登録 */
	private String insertCreditRecordTPastInspcAcptSql =
		"INSERT INTO "
			+ "  T_PAST_INSPC_ACPT "
			+ "  ( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    SLIP_CD, "
			+ "    ORGN_SLIP_CD, "
			+ "    EXCH_RATE, "
			+ "    INSPC_ACPT_GNR_TYP, "
			+ "    CRCT_NO, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    SAVING_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "SELECT "
			+ "    T_PAST_INSPC_ACPT.PUCH_ODR_CD AS PUCH_ODR_CD, "
			+ "    T_PAST_INSPC_ACPT.ACPT_NO AS ACPT_NO, "
			+ "    (T_PAST_INSPC_ACPT.INSPC_ACPT_NO + 1) AS INSPC_ACPT_NO, "
			+ "    ? as SLIP_CD, "
			+ "    T_PAST_INSPC_ACPT.SLIP_CD as ORGN_SLIP_CD, "
			+ "    T_PAST_INSPC_ACPT.EXCH_RATE  as EXCH_RATE, "
			+ "    2 AS INSPC_ACPT_GNR_TYP, "
			+ "    T_PAST_INSPC_ACPT.CRCT_NO AS CRCT_NO, "
			+ "    1 AS CRCT_TYP, "
			+ "    T_PAST_INSPC_ACPT.ITEM_CD AS ITEM_CD, "
			+ "    T_PAST_INSPC_ACPT.ITEM_NAME AS ITEM_NAME, "
			+ "    T_PAST_INSPC_ACPT.SLIP_TYP AS SLIP_TYP, "
			+ "    T_PAST_INSPC_ACPT.WORK_IN_PROC_CD AS WORK_IN_PROC_CD, "
			+ "    T_PAST_INSPC_ACPT.COMPANY_CD AS COMPANY_CD, "
			+ "    T_PAST_INSPC_ACPT.VEND_CD AS VEND_CD, "
			+ "    T_PAST_INSPC_ACPT.PLANT_CD AS PLANT_CD, "
			+ "    T_PAST_INSPC_ACPT.UNIT_COST AS UNIT_COST, "
			+ "    T_PAST_INSPC_ACPT.UNIT_COST_TYP AS UNIT_COST_TYP, "
			+ "    (T_PAST_INSPC_ACPT.PROCESSING_COST * -1) AS PROCESSING_COST, "
			+ "    (T_PAST_INSPC_ACPT.MATERIAL_COST * -1) AS MATERIAL_COST, "
			+ "    (T_PAST_INSPC_ACPT.OTHER_OVERHEADS * -1) AS OTHER_OVERHEADS, "
			+ "    (T_PAST_INSPC_ACPT.ACPT_QTY * -1) AS ACPT_QTY, "
			+ "    (T_PAST_INSPC_ACPT.INSPC_ACPT_QTY * -1) AS INSPC_ACPT_QTY, "
			+ "    T_PAST_INSPC_ACPT.STOCK_UNIT AS STOCK_UNIT, "
			+ "    (T_PAST_INSPC_ACPT.INSPC_ACPT_AMOUNT * -1) AS INSPC_ACPT_AMOUNT, "
			+ "    (T_PAST_INSPC_ACPT.SAVING_AMOUNT * -1) AS SAVING_AMOUNT, "
			+ "    T_PAST_INSPC_ACPT.ACPT_DATE AS ACPT_DATE, "
			+ "    T_PAST_INSPC_ACPT.INSPC_ACPT_DATE AS INSPC_ACPT_DATE, "
			+ "    T_PAST_INSPC_ACPT.PRODUCT_TYP AS PRODUCT_TYP, "
			+ "    T_PAST_INSPC_ACPT.DLV_CD AS DLV_CD, "
			+ "    sysdate AS CREATED_DATE, "
			+ "    ? AS CREATED_BY, "
			+ "    ? AS CREATED_PRG_NM, "
			+ "    sysdate AS UPDATED_DATE, "
			+ "    ? AS UPDATED_BY, "
			+ "    ? AS UPDATED_PRG_NM, "
			+ "    0 AS MODIFY_COUNT "
			+ "FROM "
			+ "  T_PAST_INSPC_ACPT, "
			+ "  ( "
			+ "   SELECT "
			+ "     MAX(INSPC_ACPT_NO) AS INSPC_ACPT_NO"
			+ "   FROM "
			+ "     T_PAST_INSPC_ACPT "
			+ "   WHERE "
			+ "     T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "     AND T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "  ) TPIA "
			+ "WHERE "
			+ "  T_PAST_INSPC_ACPT.PUCH_ODR_CD = ? "
			+ "  AND T_PAST_INSPC_ACPT.ACPT_NO = to_number(?) "
			+ "  AND T_PAST_INSPC_ACPT.INSPC_ACPT_NO = TPIA.INSPC_ACPT_NO "
			+ "  AND T_PAST_INSPC_ACPT.CRCT_TYP = 2 ";
	/** 検収実績情報インターフェース（赤）SQL */
	private String insertCreditRecordTInspcAcptIfSql =
		"insert into "
			+ "  T_INSPC_ACPT_IF( "
			+ "    PUCH_ODR_CD, "
			+ "    ACPT_NO, "
			+ "    INSPC_ACPT_NO, "
			+ "    SLIP_CD, "
			+ "    ORGN_SLIP_CD, "
			+ "    EXCH_RATE, "
			+ "    CRCT_TYP, "
			+ "    ITEM_CD, "
			+ "    ITEM_NAME, "
			+ "    SLIP_TYP, "
			+ "    WORK_IN_PROC_CD, "
			+ "    COMPANY_CD, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    UNIT_COST, "
			+ "    UNIT_COST_TYP, "
			+ "    PROCESSING_COST, "
			+ "    MATERIAL_COST, "
			+ "    OTHER_OVERHEADS, "
			+ "    ACPT_QTY, "
			+ "    INSPC_ACPT_QTY, "
			+ "    STOCK_UNIT, "
			+ "    INSPC_ACPT_AMOUNT, "
			+ "    DISC_AMOUNT, "
			+ "    ACPT_DATE, "
			+ "    INSPC_ACPT_DATE, "
			+ "    GNR_ORG_CD, "
			+ "    PRODUCT_TYP, "
			+ "    DLV_CD, "
			+ "    SBCNT_PUCH_TYP, "
			+ "    JOB_ODR_CD, "
			+ "    JOB_ODR_DETAIL_NO, "
			+ "    CLASIFICATION_CD, "
			+ "    INV_CTRL_FLG, "
			+ "    PUCH_RTN_FLG, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT, "
			+ "    APPR_FLG "
			+ "  ) "
			+ "SELECT "
			+ "    T_INSPC_ACPT_IF.PUCH_ODR_CD AS PUCH_ODR_CD, "
			+ "    T_INSPC_ACPT_IF.ACPT_NO AS ACPT_NO, "
			+ "    (T_INSPC_ACPT_IF.INSPC_ACPT_NO + 1) AS INSPC_ACPT_NO, "
			+ "    ? as SLIP_CD, "
			+ "    T_INSPC_ACPT_IF.SLIP_CD as ORGN_SLIP_CD, "
			+ "    T_INSPC_ACPT_IF.EXCH_RATE  as EXCH_RATE, "
			+ "    1 AS CRCT_TYP, "
			+ "    T_INSPC_ACPT_IF.ITEM_CD AS ITEM_CD, "
			+ "    T_INSPC_ACPT_IF.ITEM_NAME AS ITEM_NAME, "
			+ "    T_INSPC_ACPT_IF.SLIP_TYP AS SLIP_TYP, "
			+ "    T_INSPC_ACPT_IF.WORK_IN_PROC_CD AS WORK_IN_PROC_CD, "
			+ "    T_INSPC_ACPT_IF.COMPANY_CD AS COMPANY_CD, "
			+ "    T_INSPC_ACPT_IF.VEND_CD AS VEND_CD, "
			+ "    T_INSPC_ACPT_IF.PLANT_CD AS PLANT_CD, "
			+ "    T_INSPC_ACPT_IF.UNIT_COST AS UNIT_COST, "
			+ "    T_INSPC_ACPT_IF.UNIT_COST_TYP AS UNIT_COST_TYP, "
			+ "    (T_INSPC_ACPT_IF.PROCESSING_COST * -1) AS PROCESSING_COST, "
			+ "    (T_INSPC_ACPT_IF.MATERIAL_COST * -1) AS MATERIAL_COST, "
			+ "    (T_INSPC_ACPT_IF.OTHER_OVERHEADS * -1) AS OTHER_OVERHEADS, "
			+ "    (T_INSPC_ACPT_IF.ACPT_QTY * -1) AS ACPT_QTY, "
			+ "    (T_INSPC_ACPT_IF.INSPC_ACPT_QTY * -1) AS INSPC_ACPT_QTY, "
			+ "    T_INSPC_ACPT_IF.STOCK_UNIT AS STOCK_UNIT, "
			+ "    (T_INSPC_ACPT_IF.INSPC_ACPT_AMOUNT * -1) AS INSPC_ACPT_AMOUNT, "
			+ "    (T_INSPC_ACPT_IF.DISC_AMOUNT * -1) AS DISC_AMOUNT, "
			+ "    T_INSPC_ACPT_IF.ACPT_DATE AS ACPT_DATE, "
			+ "    T_INSPC_ACPT_IF.INSPC_ACPT_DATE AS INSPC_ACPT_DATE, "
			+ "    T_INSPC_ACPT_IF.GNR_ORG_CD AS GNR_ORG_CD, "
			+ "    T_INSPC_ACPT_IF.PRODUCT_TYP AS PRODUCT_TYP, "
			+ "    T_INSPC_ACPT_IF.DLV_CD AS DLV_CD, "
			+ "    T_INSPC_ACPT_IF.SBCNT_PUCH_TYP AS SBCNT_PUCH_TYP, "
			+ "    T_INSPC_ACPT_IF.JOB_ODR_CD AS JOB_ODR_CD, "
			+ "    T_INSPC_ACPT_IF.JOB_ODR_DETAIL_NO AS JOB_ODR_DETAIL_NO, "
			+ "    T_INSPC_ACPT_IF.CLASIFICATION_CD AS CLASIFICATION_CD, "
			+ "    T_INSPC_ACPT_IF.INV_CTRL_FLG AS INV_CTRL_FLG, "
			+ "    T_INSPC_ACPT_IF.PUCH_RTN_FLG AS PUCH_RTN_FLG, "
			+ "    sysdate AS CREATED_DATE, "
			+ "    ? AS CREATED_BY, "
			+ "    ? AS CREATED_PRG_NM, "
			+ "    sysdate AS UPDATED_DATE, "
			+ "    ? AS UPDATED_BY, "
			+ "    ? AS UPDATED_PRG_NM, "
			+ "    0 as MODIFY_COUNT, "
			+ "    ? as APPR_FLG "
			+ "FROM "
			+ "  T_INSPC_ACPT_IF, "
			+ "  ( "
			+ "   SELECT "
			+ "     MAX(INSPC_ACPT_NO) AS INSPC_ACPT_NO"
			+ "   FROM "
			+ "     T_INSPC_ACPT_IF "
			+ "   WHERE "
			+ "     T_INSPC_ACPT_IF.PUCH_ODR_CD = ? "
			+ "     AND T_INSPC_ACPT_IF.ACPT_NO = to_number(?) "
			+ "  ) TIAI "
			+ "WHERE "
			+ "  T_INSPC_ACPT_IF.PUCH_ODR_CD = ? "
			+ "  AND T_INSPC_ACPT_IF.ACPT_NO = to_number(?) "
			+ "  AND T_INSPC_ACPT_IF.INSPC_ACPT_NO = TIAI.INSPC_ACPT_NO "
			+ "  AND T_INSPC_ACPT_IF.CRCT_TYP = 2 ";
	/** 保管区別入出庫の登録用情報の取得（不良出庫） */
	private String selectBadTRcvIssueSql =
		"SELECT "
			+ "  T_RLSD_PUCH_ODR.ITEM_CD as ITEM_CD, "
			+ "  T_INSPC_RSLT.PLANT_CD as PLANT_CD, "
			+ "  T_INSPC_RSLT.INSPC_WH_CD as INSPC_WH_CD, "
			+ "  decode(T_OD.JOB_ODR_CD,NULL,NULL,decode(A.JOB_ODR_TYP,3,decode(A.ITEM_CD,T_RLSD_PUCH_ODR.ITEM_CD,NULL,T_OD.JOB_ODR_CD),T_OD.JOB_ODR_CD)) as JOB_ODR_CD, "
			+ "  T_INSPC_RSLT.INSPC_CRCT_NO as INSPC_CRCT_NO, "
			+ "  TO_CHAR(T_INSPC_RSLT.INSPEC_DATE,'YYYY/MM/DD') as RCV_ISSUE_DATE, "
			+ "  decode(T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP, 9, decode(T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG, 1, 1, 0), 0) as RCV_ISSUE_CMPLT_FLG, "
			+ "  T_RLSD_PUCH_ODR.OD_NO as OD_NO, "
			+ "  T_INSPC_RSLT.LOT_NO as LOT_NO, "
			+ "  T_INSPC_RSLT.VEND_LOT_NO as VEND_LOT_NO, "
			+ "  T_RLSD_PUCH_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_RLSD_PUCH_ODR.VEND_CD as VEND_CD "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_INSPC_RSLT, "
			+ "  T_OD, "
			+ "(select  "
			+ "    T_JOB_ODR.ITEM_CD, "
			+ "    T_JOB_ODR.JOB_ODR_TYP "
			+ "  from "
			+ "    T_JOB_ODR, "
			+ "    T_OD, "
			+ "    T_RLSD_PUCH_ODR "
			+ "  where "
			+ "    T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
			+ "    and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "    and T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
			+ "    and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
			+ "    and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
			+ "  ) A "
			+ "where "
			+ "  T_INSPC_RSLT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD "
			+ "  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "  and T_INSPC_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_INSPC_RSLT.ACPT_NO = to_number(?) ";
			
	/** 保管区別入出庫の登録（検査済み入庫） */
	private String insertTRcvIssueInspecSql =
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
			+ "    LOT_NO, "
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
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "select "
			+ "  ? as RCV_ISSUE_CTRL_CD, "
			+ "  1 as RCV_ISSUE_TYP, "
			+ "  T_RLSD_PUCH_ODR.ITEM_CD as ITEM_CD, "
			+ "  T_INSPC_RSLT.PLANT_CD as PLANT_CD, "
			+ "  T_INSPC_RSLT.WH_CD as WH_CD, "
			+ "  decode(T_OD.JOB_ODR_CD,NULL,NULL,decode(A.JOB_ODR_TYP,3,decode(A.ITEM_CD,T_RLSD_PUCH_ODR.ITEM_CD,NULL,T_OD.JOB_ODR_CD),T_OD.JOB_ODR_CD)) as JOB_ODR_CD, "
			+ "  0 as JOB_ODR_DETAIL_NO, "
			+ "  T_INSPC_RSLT.PUCH_ODR_CD as PUCH_ODR_CD, "
			+ "  T_INSPC_RSLT.ACPT_NO as ACPT_NO, "
			+ "  0 as ACPT_RSLT_CRCT_NO, "
			+ "  T_INSPC_RSLT.INSPC_CRCT_NO as INSPEC_RSLT_CRCT_NO, "
			+ "  NULL as WORK_ODR_CD, "
			+ "  NULL as WORK_IN_PROC_CD, "
			+ "  0 as PARTIAL_PRD_NO, "
			+ "  0 as OPR_RSLT_CRCT_NO, "
			+ "  NULL as ISSUE_INST_CD, "
			+ "  T_INSPC_RSLT.ACCEPTED_QTY as RCV_ISSUE_QTY, "
			+ "  0 as RCV_ISSUE_AMOUNT, "
			+ "  T_INSPC_RSLT.INSPEC_DATE as RCV_ISSUE_DATE, "
			+ "  17 as RCV_ISSUE_GNR_TYP, "	// 小林修正
			+ "  0 as RCV_ISSUE_ODD_QTY, "
			+ "  NULL as DEFECT_CAUSE_CD, "
			+ "  1 as STOCK_UPD_TYP, "
			+ "  decode(T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP, 9, decode(T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG, 1, 1, 0), 0) as RCV_ISSUE_CMPLT_FLG, "
			+ "  T_RLSD_PUCH_ODR.OD_NO as OD_NO, "
			+ "  T_INSPC_RSLT.LOT_NO as LOT_NO, "
			+ "  T_INSPC_RSLT.VEND_LOT_NO as VEND_LOT_NO, "
			+ "  NULL as RCV_ISSUE_COMMENT, "
			+ "  T_RLSD_PUCH_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_RLSD_PUCH_ODR.VEND_CD as VEND_CD, "
			+ "  0 as CONS_TYP, "
			+ "  NULL as CONS_EXEC_DATE, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT "
			+ "from "
			+ "  T_RLSD_PUCH_ODR, "
			+ "  T_INSPC_RSLT, "
			+ "  T_OD, "
			+ "(select  "
			+ "    T_JOB_ODR.ITEM_CD, "
			+ "    T_JOB_ODR.JOB_ODR_TYP "
			+ "  from "
			+ "    T_JOB_ODR, "
			+ "    T_OD, "
			+ "    T_RLSD_PUCH_ODR "
			+ "  where "
			+ "    T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
			+ "    and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "    and T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
			+ "    and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
			+ "    and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
			+ "  ) A "
			+ "where "
			+ "  T_INSPC_RSLT.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD "
			+ "  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
			+ "  and T_INSPC_RSLT.PUCH_ODR_CD = ? "
			+ "  and T_INSPC_RSLT.ACPT_NO = to_number(?) ";
	/*ロット在庫数のチェック*/
	private String checkLotStockSql =
	    "select" 
            + "  T_INSPC_RSLT.PUCH_ODR_CD, "
            + "  T_INSPC_RSLT.ACPT_NO, "
            + "  T_ACPT_RSLT.ITEM_CD as ITEM_CD, " 
            + "  T_ACPT_RSLT.WH_CD as WH_CD, "
            + "  T_INSPC_RSLT.INSPC_WH_CD as INSPC_WH_CD, " 
            + "  T_ACPT_RSLT.LOT_NO as LOT_NO "
            + "from " 
            + "  T_INSPC_RSLT, " 
            + "  T_ACPT_RSLT, "
            + "  T_LOT_STOCK "
            + "where " 
            + "  T_ACPT_RSLT.ACPT_NO = T_INSPC_RSLT.ACPT_NO "
            + "  and T_ACPT_RSLT.PUCH_ODR_CD = T_INSPC_RSLT.PUCH_ODR_CD"
            + "  and T_LOT_STOCK.ITEM_CD = T_ACPT_RSLT.ITEM_CD "
            + "  and T_LOT_STOCK.LOT_NO = T_ACPT_RSLT.LOT_NO "
            + "  and T_LOT_STOCK.WH_CD IN (T_ACPT_RSLT.WH_CD,T_INSPC_RSLT.INSPC_WH_CD) "
            + "  and T_LOT_STOCK.STOCK_ON_HAND_QTY < 0 "
            + "  and T_INSPC_RSLT.PUCH_ODR_CD = ? "
            + "  and T_INSPC_RSLT.ACPT_NO = to_number(?) ";
	
	/*システムパラメータ取得*/
	private String selectsysparamSql =
	    "select" 
            + "  SYS_PARAMETER.VALUE "
            + "from " 
            + "  SYS_PARAMETER "
            + "where " 
            + "  NAME = 'APR_INSPC_IF' ";
	/**
	 * コンストラクタ
	 * @param connect コネクションがOPENされているIDbConnection
	 * @param busineId 業務ID
	 * @param userCd ユーザコード
	 * @param plantCd 工場コード
	 */
	public InspcAcpt(IDbConnection connect, String userCd, String busineId, String plantCd) {
		this.conn = connect;
		this.sysUserCd = userCd;
		this.sysBusinessId = busineId;
		this.sysPlantCd = plantCd;
	}

	/**
	 * 受入実績追加時に関連するテーブルを更新します。
	 * ［受入実績］追加後に呼び出してください。
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param exchRate 為替レート
	 * @param companyCd 会社コード
	 * @return ？？
	 * @throws Exception DB更新エラー時にthrowされます
	 */
	public boolean addAcpt(String puchOdrCd, String acptNo, String exchRate, String companyCd) throws Exception {
		// ステートメント
		PreparedStatement ps = null;
		// リザルトセット
		ResultSet rs = null;
		// ステートメント
		PreparedStatement ps1 = null;
		// リザルトセット
		ResultSet rs1 = null;
		String slipCd = null;   //伝票番号 
		_warnList.clear();

		try {
			//システムパラメータ取得
			ps = this.conn.getConn().prepareStatement(this.selectsysparamSql);
			rs = ps.executeQuery();
			// 検索して存在しない場合は承認なしとみなす
			if (!rs.next()) {
				_apprFlg = "3";
			}else{
				if("1".equals(rs.getString("VALUE"))){
					_apprFlg = "1";
				}else{
					_apprFlg = "3";
				}
			}
			
			if(rs != null){
				rs.close();
			}
			if(ps != null){
				ps.close();
			}
			// 解除処理に必要なデータを検索
			ps = this.conn.getConn().prepareStatement(this.selectDataSql);
			ps.setString(1, puchOdrCd);
			ps.setString(2, acptNo);
			rs = ps.executeQuery();
			// 検索して存在しない場合はエラー
			if (!rs.next()) {
				throw new NullPointerException();
			}
			
			// 検収履歴、検収実績情報インタフェースの登録
			// 受入数量 = 0 の場合
			// [発注残]."受給品区分"が2:無償受給品の場合
			// [発注残]."発注時受入検査区分"が2:受入と検査を行なう且つ[発注残]."取引先コード"を基にした
			// [取引先]."検収計上区分が2:検査時検収の場合は、追加は行なわない
			if ((Calculate.compare(rs.getString("ACPT_QTY"), "0") > 0)
				&& (!"2".equals(rs.getString("SPL_ITEM_TYP")))
				&& ((!"2".equals(rs.getString("ACPT_INSPC_TYP")))
				|| (!"2".equals(rs.getString("INSPC_ACPT_APP_TYP"))))) {		// 2007/09/28 追加(KAIZU)
				ps1 = this.conn.getConn().prepareStatement(this.selectAcptDate);
				ps1.setString(1, puchOdrCd);
				ps1.setString(2, acptNo);
				rs1 = ps1.executeQuery();
				if (rs1.next()) {
					//採番共通部品
					ArApNumbering arapnumbering_common = new ArApNumbering( conn, this.sysUserCd, this.sysBusinessId,this.sysPlantCd, companyCd, actionTyp, slipTyp, rs1.getString("ACPT_DATE"));

					slipCd = arapnumbering_common.getSlipCd();
					if (slipCd == null || "".equals(slipCd)) {
						_errorList.add("BZ00180");
						return false;
					}
					if (exchRate == null) {
						exchRate = rs1.getString("EXCH_RATE");
					}
					if(rs1 != null){
						rs1.close();
					}
					if(ps1 != null){
						ps1.close();
					}
					this.insertDebitRecordInspcAcptIfTypeAcpt(puchOdrCd, acptNo, slipCd, exchRate);
					this.insertDebitRecordInspcAcptTypeAcpt(puchOdrCd, acptNo ,slipCd, exchRate);
				}
			}
			
			// 作業系列別仕掛、品目別仕掛の更新
			if ("9".equals(rs.getString("PUCH_ODR_STS_TYP"))) {
				if ((("1".equals(rs.getString("ACPT_INSPC_TYP")))
					&& ("1".equals(rs.getString("INV_CTRL_FLG")))
					&& (rs.getString("WORK_ODR_CD") != null))
					|| (("2".equals(rs.getString("ACPT_INSPC_TYP")))
						&& ("1".equals(rs.getString("INSPC_CMPLT_FLG")))
						&& ("1".equals(rs.getString("INV_CTRL_FLG")))
						&& (rs.getString("WORK_ODR_CD") != null))) {
					this.updateWorkInProcByProcForComplete(
						puchOdrCd,
						rs.getString("WORK_ODR_CD"),
						rs.getString("WORK_IN_PROC_CD"));

					if ("1".equals(rs.getString("FINAL_PROC_FLG"))) {
						this.updateWorkInProcByItemForComplete(
							puchOdrCd,
							rs.getString("WORK_ODR_CD"));
					}
				}

				// 所要量更新
				CommonOd co =
					new CommonOd(this.conn, this.sysPlantCd, this.sysUserCd, this.sysBusinessId);
				co.changeOrderForComplete(rs.getString("OD_NO"), -1);
				co.changeDemandForComplete(puchOdrCd, rs.getDate("ACPT_DATE"));

				if (rs.getString("WORK_ODR_CD") != null) {
					co.changeDemandForComplete(
						rs.getString("WORK_ODR_CD"),
						rs.getString("WORK_IN_PROC_CD"),
						rs.getDate("ACPT_DATE"));
				}
			}
			
			/********************
			 * 自動出庫処理開始 *
			 *******************/
			WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(this.conn,
					this.sysPlantCd,
					this.sysUserCd,
					this.sysBusinessId);
			WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
			
			// パラメータのセット
			autoIssueParam.m_WORK_ODR_CD = null;
			autoIssueParam.m_WORK_IN_PROC_CD = null;
			autoIssueParam.m_PARTIAL_PRD_NO = 0;
			autoIssueParam.m_OPR_RSLT_CRCT_NO = 0;
			autoIssueParam.m_PUCH_ODR_CD = rs.getString("PUCH_ODR_CD");
			autoIssueParam.m_ACPT_NO = rs.getInt("ACPT_NO");
			autoIssueParam.m_ACPT_RSLT_CRCT_NO = rs.getInt("ACPT_CRCT_NO");
			autoIssueParam.m_RCV_ISSUE_TYP = 2;
			autoIssueParam.m_RCV_ISSUE_DATE = rs.getString("ACPT_DATE_CHAR");
			autoIssueParam.m_RCV_ISSUE_RSLT_NO = rs.getString("ACPT_QTY");
			autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = rs.getInt("RCV_ISSUE_CMPLT_FLG");
			autoIssueParam.m_PLANT_CD = rs.getString("PLANT_CD");
			
			AutoIssue autoIssue = new AutoIssue(conn,
					this.sysPlantCd,this.sysUserCd,this.sysBusinessId);
			
			// 自動出庫実行
			autoIssue.AutoIssueOpr(autoIssueParam);
			
			_warnList = autoIssue.getWarnList();

			_errorList = autoIssue.getErrorList();
			
			// 備品は対象としない
			if (((!"1".equals(rs.getString("NON_NO_ITEM_FLG")))
				// 在庫管理対象フラグがOnの場合
				&& ("1".equals(rs.getString("INV_CTRL_FLG")))
				&& (rs.getString("WORK_ODR_CD") == null))
				// 備品は対象としない
				|| ((!"1".equals(rs.getString("NON_NO_ITEM_FLG")))
					// 在庫管理対象フラグがOnの場合
					&& ("1".equals(rs.getString("INV_CTRL_FLG")))
					// 工程外注の場合は最終工程の場合のみ
					&& (rs.getString("WORK_ODR_CD") != null)
					&& ("1".equals(rs.getString("FINAL_PROC_FLG"))))) {

				// 保管区別入出庫の登録
				Numbering rcvIssueNumbering =
					new Numbering(
						this.conn,
						Numbering.ISSUE_CD,
						this.sysUserCd,
						this.sysBusinessId,
						this.sysPlantCd);
				String rcvIssueCtrlCd = rcvIssueNumbering.getNo();
				this.insertRcvIssue(puchOdrCd, acptNo, rcvIssueCtrlCd);
				// 保管区別入出庫を元に在庫更新
				RcvIssue ri =
					new RcvIssue(this.conn, this.sysUserCd, this.sysBusinessId, this.sysPlantCd);
				boolean result = ri.addRcvIssue(rcvIssueCtrlCd);
				_errorRiList = ri.getErrorList();
				
				return result;
			}
			return true;
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 受入実績更新時に関連するテーブルを更新します。
	 * ［受入実績］更新後に呼び出してください。
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param exchRate 為替レート
	 * @param companyCd 会社コード
	 * @return ？？
	 * @throws Exception DB更新エラー時にthrowされます
	 */
	public boolean changeAcpt(String puchOdrCd, String acptNo,String acptDate, String exchRate, String companyCd) throws Exception {
		// ステートメント
		PreparedStatement ps = null;
		// リザルトセット
		ResultSet rs = null;
		// ステートメント
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		// リザルトセット
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String slipCd = null;   //伝票番号
		_warnList.clear();

		try {
			//システムパラメータ取得
			ps = this.conn.getConn().prepareStatement(this.selectsysparamSql);
			rs = ps.executeQuery();
			// 検索して存在しない場合は承認なしとみなす
			if (!rs.next()) {
				_apprFlg = "3";
			}else{
				if("1".equals(rs.getString("VALUE"))){
					_apprFlg = "1";
				}else{
					_apprFlg = "3";
				}
			}
			if(rs != null){
				rs.close();
			}
			if(ps != null){
				ps.close();
			}
			// 解除処理に必要なデータを検索
			ps = this.conn.getConn().prepareStatement(this.selectDataSql);
			ps.setString(1, puchOdrCd);
			ps.setString(2, acptNo);
			rs = ps.executeQuery();
			// 検索して存在しない場合はエラー
			if (!rs.next()) {
				throw new NullPointerException();
			}
			// 検収履歴、検収実績情報インタフェース（赤伝）の登録
			if ((Calculate.compare(rs.getString("PREV_ACPT_QTY"), "0") > 0)
				&& (!"2".equals(rs.getString("SPL_ITEM_TYP")))
				&& ((!"2".equals(rs.getString("ACPT_INSPC_TYP")))
				|| (!"2".equals(rs.getString("INSPC_ACPT_APP_TYP"))))) {
				ps1 = this.conn.getConn().prepareStatement(this.selectInspcAcptDate);
				ps1.setString(1, puchOdrCd);
				ps1.setString(2, acptNo);
				ps1.setString(3, puchOdrCd);
				ps1.setString(4, acptNo);
				rs1 = ps1.executeQuery();
				if (rs1.next()) {
					//採番共通部品
					ArApNumbering arapnumbering_common = new ArApNumbering( conn, this.sysUserCd, this.sysBusinessId,this.sysPlantCd, companyCd, actionTyp, slipTyp, rs1.getString("INSPC_ACPT_DATE"));

					slipCd = arapnumbering_common.getSlipCd();
					if (slipCd == null  || "".equals(slipCd)) {
						_errorList.add("BZ00180");
						return false;
					}
					if(rs1 != null){
						rs1.close();
					}
					if(ps1 != null){
						ps1.close();
					}
					this.insertCreditRecordInspcAcptIf(puchOdrCd, acptNo, slipCd);
					this.insertCreditRecordInspcAcptTypeAcpt(puchOdrCd, acptNo, slipCd);
				}
			}
			// 検収履歴、検収実績情報インタフェース（黒伝）の登録
			if ((Calculate.compare(rs.getString("ACPT_QTY"), "0") > 0)
				&& (!"2".equals(rs.getString("SPL_ITEM_TYP")))
				&& ((!"2".equals(rs.getString("ACPT_INSPC_TYP")))
				|| (!"2".equals(rs.getString("INSPC_ACPT_APP_TYP"))))) {
				ps2 = this.conn.getConn().prepareStatement(this.selectAcptDate);
				ps2.setString(1, puchOdrCd);
				ps2.setString(2, acptNo);
				rs2 = ps2.executeQuery();
				if (rs2.next()) {
					//採番共通部品
					ArApNumbering arapnumbering_common = new ArApNumbering( conn, this.sysUserCd, this.sysBusinessId,this.sysPlantCd, companyCd, actionTyp, slipTyp, rs2.getString("ACPT_DATE"));

					slipCd = arapnumbering_common.getSlipCd();
					if (slipCd == null || "".equals(slipCd)) {
						_errorList.add("BZ00180");
						return false;
					}
					if (exchRate == null) {
						exchRate = rs2.getString("EXCH_RATE");
					}
					if(rs2 != null){
					rs2.close();
					}
					if(ps2 != null){
						ps2.close();
					}
					this.insertDebitRecordInspcAcptIfTypeAcpt(puchOdrCd, acptNo, slipCd, exchRate);
					this.insertDebitRecordInspcAcptTypeAcpt(puchOdrCd, acptNo ,slipCd, exchRate);
				}
			}
			// 作業系列別仕掛、品目別仕掛の更新
			if ("9".equals(rs.getString("PUCH_ODR_STS_TYP"))) {
				if ((("1".equals(rs.getString("ACPT_INSPC_TYP")))
					&& ("1".equals(rs.getString("INV_CTRL_FLG")))
					&& (rs.getString("WORK_ODR_CD") != null))
					|| (("2".equals(rs.getString("ACPT_INSPC_TYP")))
						&& ("1".equals(rs.getString("INSPC_CMPLT_FLG")))
						&& ("1".equals(rs.getString("INV_CTRL_FLG")))
						&& (rs.getString("WORK_ODR_CD") != null))) {
					this.updateWorkInProcByProcForComplete(
						puchOdrCd,
						rs.getString("WORK_ODR_CD"),
						rs.getString("WORK_IN_PROC_CD"));

					if ("1".equals(rs.getString("FINAL_PROC_FLG"))) {
						this.updateWorkInProcByItemForComplete(
							puchOdrCd,
							rs.getString("WORK_ODR_CD"));
					}
				}

				// 所要量更新
				CommonOd co =
					new CommonOd(this.conn, this.sysPlantCd, this.sysUserCd, this.sysBusinessId);
				co.changeOrderForComplete(rs.getString("OD_NO"), -1);
				co.changeDemandForComplete(puchOdrCd, rs.getDate("ACPT_DATE"));

				if (rs.getString("WORK_ODR_CD") != null) {
					co.changeDemandForCancel(
						rs.getString("WORK_ODR_CD"),
						rs.getString("WORK_IN_PROC_CD"));
				}
			}
			
			/********************
			 * 自動出庫処理開始 *
			 *******************/
			WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(this.conn,
					this.sysPlantCd,
					this.sysUserCd,
					this.sysBusinessId);
			WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
			
			// パラメータのセット
			autoIssueParam.m_WORK_ODR_CD = null;
			autoIssueParam.m_WORK_IN_PROC_CD = null;
			autoIssueParam.m_PARTIAL_PRD_NO = 0;
			autoIssueParam.m_OPR_RSLT_CRCT_NO = 0;
			autoIssueParam.m_PUCH_ODR_CD = rs.getString("PUCH_ODR_CD");
			autoIssueParam.m_ACPT_NO = rs.getInt("ACPT_NO");
			autoIssueParam.m_ACPT_RSLT_CRCT_NO = rs.getInt("ACPT_CRCT_NO");
			autoIssueParam.m_RCV_ISSUE_TYP = 2;
			autoIssueParam.m_RCV_ISSUE_DATE = rs.getString("ACPT_DATE_CHAR");
			autoIssueParam.m_INSPC_ACPT_DATE = acptDate;
			autoIssueParam.m_RCV_ISSUE_RSLT_NO = rs.getString("ACPT_QTY");
			autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = rs.getInt("RCV_ISSUE_CMPLT_FLG");
			autoIssueParam.m_PLANT_CD = rs.getString("PLANT_CD");
			
			AutoIssue autoIssue = new AutoIssue(conn,
					this.sysPlantCd,this.sysUserCd,this.sysBusinessId);
			
			// 自動出庫実行
			autoIssue.AutoIssueOpr(autoIssueParam);
			
			_warnList = autoIssue.getWarnList();
			
			_errorList = autoIssue.getErrorList();
			// 備品は対象としない
			if (((!"1".equals(rs.getString("NON_NO_ITEM_FLG"))) 
				// 在庫管理フラグがOnの場合
				&& ("1".equals(rs.getString("INV_CTRL_FLG")))
				&& (rs.getString("WORK_ODR_CD") == null))
				// 備品は対象としない
				|| ((!"1".equals(rs.getString("NON_NO_ITEM_FLG")))
					// 在庫管理フラグがOnの場合
					&& ("1".equals(rs.getString("INV_CTRL_FLG")))
					// 工程外注の場合は最終工程のみ
					&& (rs.getString("WORK_ODR_CD") != null)
					&& ("1".equals(rs.getString("FINAL_PROC_FLG"))))) {

				// 保管区別入出庫の登録
				Numbering rcvIssueNumbering =
					new Numbering(
						this.conn,
						Numbering.ISSUE_CD,
						this.sysUserCd,
						this.sysBusinessId,
						this.sysPlantCd);
				String rcvIssueCtrlCd = rcvIssueNumbering.getNo();
				this.insertRcvIssue(puchOdrCd, acptNo, rcvIssueCtrlCd);
				// 保管区別入出庫を元に在庫更新
				RcvIssue ri =
					new RcvIssue(this.conn, this.sysUserCd, this.sysBusinessId, this.sysPlantCd);
				boolean result = ri.addRcvIssue(rcvIssueCtrlCd); 
				_errorRiList = ri.getErrorList();

				return result;
			}
			return true;
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 受入実績の完了解除を行います。
	 * @param puchOdrCd 発注番号
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	public void cancelAcpt(String puchOdrCd)
		throws ApsComException, ParseException, FoundationException, SQLException {
		// ステートメント
		PreparedStatement ps = null;
		// リザルトセット
		ResultSet rs = null;

		try {
			// 解除処理に必要なデータを検索
			ps = this.conn.getConn().prepareStatement(this.selectRlsdPuchOdrSql);
			ps.setString(1, puchOdrCd);
			rs = ps.executeQuery();
			// 検索して存在しない場合はエラー
			if (!rs.next()) {
				throw new NullPointerException();
			}

			// 仕掛の解除
			if (rs.getString("WORK_ODR_CD") != null) {
				this.updateWorkInProcByProcForCancel(
					rs.getString("WORK_ODR_CD"),
					rs.getString("WORK_IN_PROC_CD"));
				if ("1".equals(rs.getString("FINAL_PROC_FLG"))) {
					this.updateWorkInProcByItemForCancel(rs.getString("WORK_ODR_CD"));
				}
			}

			// 所要量の解除
			CommonOd co =
				new CommonOd(this.conn, this.sysPlantCd, this.sysUserCd, this.sysBusinessId);
			co.changeOrderForCancel(rs.getString("OD_NO"), -1);
			co.changeDemandForCancel(rs.getString("PUCH_ODR_CD"));

			if (rs.getString("WORK_ODR_CD") != null) {
				co.changeDemandForCancel(
					rs.getString("WORK_ODR_CD"),
					rs.getString("WORK_IN_PROC_CD"));
			}
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 検査実績追加時に関連するテーブルを更新します。
	 * ［検査実績］追加後に呼び出してください。
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param InspcDate 検査日
	 * @param exchRate 為替レート
	 * @param companyCd 会社コード
	 * @return ？？
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	public boolean addInspc(String puchOdrCd, String acptNo , String InspcDate, String hInspectedQty, String exchRate, String companyCd)
		throws ApsComException, FoundationException, SQLException {
		// ステートメント
		PreparedStatement ps = null;
		// リザルトセット
		ResultSet rs = null;
		ResultSet rsck = null;
		ResultSet rsSelectBadTRcvIssue = null;
		ResultSet rsSelectTItemStock = null;
		ResultSet rsSelectTLotStock = null;
		ResultSet rsCheckTLotStock = null;
		ResultSet rsSelectTJobOdrCdStock = null;
		// 戻り値
		boolean result = false;
		// ステートメント
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		// リザルトセット
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String slipCd = null;

		try {
			//システムパラメータ取得
			ps = this.conn.getConn().prepareStatement(this.selectsysparamSql);
			rs = ps.executeQuery();
			// 検索して存在しない場合は承認なしとみなす
			if (!rs.next()) {
				_apprFlg = "3";
			}else{
				if("1".equals(rs.getString("VALUE"))){
					_apprFlg = "1";
				}else{
					_apprFlg = "3";
				}
			}		
			// 解除処理に必要なデータを検索
			ps = this.conn.getConn().prepareStatement(this.selectDataSql);
			ps.setString(1, puchOdrCd);
			ps.setString(2, acptNo);
			rs = ps.executeQuery();
			// 検索して存在しない場合はエラー
			if (!rs.next()) {
				throw new NullPointerException();
			}
			// 検収履歴、検収実績情報インタフェース（赤伝）の登録
			if (!"2".equals(rs.getString("SPL_ITEM_TYP"))) {
				// 検収履歴(赤伝)登録
				ps1 = this.conn.getConn().prepareStatement(this.selectInspcAcptDate2);
				ps1.setString(1, puchOdrCd);
				ps1.setString(2, acptNo);
				ps1.setString(3, puchOdrCd);
				ps1.setString(4, acptNo);
				rs1 = ps1.executeQuery();
				if (rs1.next()) {
					//採番共通部品
					ArApNumbering arapnumbering_common = new ArApNumbering( conn, this.sysUserCd, this.sysBusinessId,this.sysPlantCd, companyCd, actionTyp, slipTyp, rs1.getString("INSPC_ACPT_DATE"));
					slipCd = arapnumbering_common.getSlipCd();
					if (slipCd == null || "".equals(slipCd)) {
						_errorList.add("BZ00180");
						return false;
					}
					// 検収実績情報インタフェース(チェック)
					ps = this.conn.getConn().prepareStatement(this.selectChkInspcAcptIf);
					ps.setString(1, puchOdrCd);
					ps.setString(2, acptNo);
					ps.setString(3, puchOdrCd);
					ps.setString(4, acptNo);
					rsck = ps.executeQuery();
					if (rsck.next()) {
						// 検収実績情報インタフェース(赤伝)登録
						ps = this.conn.getConn().prepareStatement(this.insertCreditRecordTInspcAcptIfSql);
						ps.setString(1, slipCd);
						ps.setString(2, this.sysUserCd);
						ps.setString(3, this.sysBusinessId);
						ps.setString(4, this.sysUserCd);
						ps.setString(5, this.sysBusinessId);
						ps.setString(6, _apprFlg);
						ps.setString(7, puchOdrCd);
						ps.setString(8, acptNo);
						ps.setString(9, puchOdrCd);
						ps.setString(10, acptNo);
						ps.executeUpdate();
					} else {
						if(!"0".equals(hInspectedQty)){
							// 検収履歴より検収実績情報インタフェース(赤伝)補足登録
							this.insertCreditRecordInspcAcptIf(puchOdrCd, acptNo, slipCd);
						}else{
							// 検収履歴(チェック)
							ps = this.conn.getConn().prepareStatement(this.selectChkTPastInspcAcpt);
							ps.setString(1, puchOdrCd);
							ps.setString(2, acptNo);
							ps.setString(3, puchOdrCd);
							ps.setString(4, acptNo);
							rsck = ps.executeQuery();
							// 検収履歴の最終行目レコードは黒データの場合
							if(rsck.next() && "2".equals(rsck.getString("CRCT_TYP"))){
                            	// 検収履歴より検収実績情報インタフェース(赤伝)補足登録
						    	this.insertCreditRecordInspcAcptIf(puchOdrCd, acptNo, slipCd);
							}
						}
					}
					if(rs1 != null){
						rs1.close();
					}
					if(ps1 != null){
						ps1.close();
					}
					ps = this.conn.getConn().prepareStatement(this.insertCreditRecordTPastInspcAcptSql);
					ps.setString(1, slipCd);
					ps.setString(2, this.sysUserCd);
					ps.setString(3, this.sysBusinessId);
					ps.setString(4, this.sysUserCd);
					ps.setString(5, this.sysBusinessId);
					ps.setString(6, puchOdrCd);
					ps.setString(7, acptNo);
					ps.setString(8, puchOdrCd);
					ps.setString(9, acptNo);
					ps.executeUpdate();
				}
			}
			// 検収履歴、検収実績情報インタフェース（黒伝）の登録
			if (Calculate.compare(rs.getString("INSPECTED_QTY"), "0") > 0 && !"2".equals(rs.getString("SPL_ITEM_TYP"))) {
				// [発注残].”発注時受入検査区分”が２：受入と検査を行う かつ [発注残]取引先コードを基に取得した[取引先].”検収計上区分”が２：検査時検収の場合
				if(("2".equals(rs.getString("ACPT_INSPC_TYP")))&&("2".equals(rs.getString("INSPC_ACPT_APP_TYP")))){
					// [検査実績]."検査日"
					_dateCheckFlg = "1";
				}else{
					// [受入実績]."受入日"
					_dateCheckFlg = "2";
				}
				ps2 = this.conn.getConn().prepareStatement(this.selectAcptDate);
				ps2.setString(1, puchOdrCd);
				ps2.setString(2, acptNo);
				rs2 = ps2.executeQuery();
				if (rs2.next()) {
					//採番共通部品
					ArApNumbering arapnumbering_common = new ArApNumbering( conn, this.sysUserCd, this.sysBusinessId,this.sysPlantCd, companyCd, actionTyp, slipTyp, rs2.getString("ACPT_DATE"));

					slipCd = arapnumbering_common.getSlipCd();
					if (slipCd == null || "".equals(slipCd)) {
						_errorList.add("BZ00180");
						return false;
					}
					if (exchRate == null) {
						exchRate = rs2.getString("EXCH_RATE");
					}
					if(rs2 != null){
						rs2.close();
					}
					if(ps2 != null){
						ps2.close();
					}

					insertDebitRecordInspcAcptIfTypeInspc(puchOdrCd, acptNo, slipCd, exchRate);
					insertDebitRecordInspcAcptTypeInspc(puchOdrCd, acptNo, slipCd, exchRate);
				}
			}
			// 作業系列別仕掛、品目別仕掛の更新
			if ((("9".equals(rs.getString("PUCH_ODR_STS_TYP")))
				&& ("1".equals(rs.getString("ACPT_INSPC_TYP")))
				&& ("1".equals(rs.getString("INV_CTRL_FLG")))
				&& (rs.getString("WORK_ODR_CD") != null))
				|| (("9".equals(rs.getString("PUCH_ODR_STS_TYP")))
					&& ("2".equals(rs.getString("ACPT_INSPC_TYP")))
					&& ("1".equals(rs.getString("INSPC_CMPLT_FLG")))
					&& ("1".equals(rs.getString("INV_CTRL_FLG")))
					&& (rs.getString("WORK_ODR_CD") != null))) {

				//発注残.検査完了日の最遅日付を取得
				Date rcvCmpltDate = getRcvCmpltDate(rs.getString("OD_NO"));
				//存在しない時は画面の検査日
				if (rcvCmpltDate == null) {
				}else{
					InspcDate = rcvCmpltDate.toString(); 
				}				
				
				//作業系列別仕掛の更新
				this.updateWorkInProcByProcForCompleteInspc(
					puchOdrCd,
					rs.getString("WORK_ODR_CD"),
					rs.getString("WORK_IN_PROC_CD"),
					InspcDate
				);

				if ("1".equals(rs.getString("FINAL_PROC_FLG"))) {
					//品目別仕掛の更新
					this.updateWorkInProcByItemForCompleteInspc(puchOdrCd, rs.getString("WORK_ODR_CD"),InspcDate);
				}
			}
			// 入出庫の更新
			if ((("2".equals(rs.getString("ACPT_INSPC_TYP")))
				&& ("1".equals(rs.getString("INV_CTRL_FLG")))
				&& (rs.getString("WORK_ODR_CD") == null))
				|| (("2".equals(rs.getString("ACPT_INSPC_TYP")))
					&& ("1".equals(rs.getString("INV_CTRL_FLG")))
					&& (rs.getString("WORK_ODR_CD") != null)
					&& ("1".equals(rs.getString("FINAL_PROC_FLG"))))) {

				// 保管区別入出庫の登録
				Numbering rcvIssueNumbering =
					new Numbering(
						this.conn,
						Numbering.ISSUE_CD,
						this.sysUserCd,
						this.sysBusinessId,
						this.sysPlantCd);
				String rcvIssueCtrlCd = rcvIssueNumbering.getNo();
				this.insertRcvIssueInspec(puchOdrCd, acptNo, rcvIssueCtrlCd);
				// 保管区別入出庫を元に在庫更新
				RcvIssue ri =
					new RcvIssue(this.conn, this.sysUserCd, this.sysBusinessId, this.sysPlantCd);
				result = ri.addRcvIssue(rcvIssueCtrlCd);
				_errorRiList = ri.getErrorList();
			}
			//不良在庫の作成
			if ((Calculate.compare(rs.getString("INSPECTED_QTY"), rs.getString("ACCEPTED_QTY"))
				!= 0) && ("2".equals(rs.getString("ACPT_STS_TYP")))) {
				//登録に必要なデータを取得
				ps = this.conn.getConn().prepareStatement(this.selectBadTRcvIssueSql);
				ps.setString(1, puchOdrCd);
				ps.setString(2, puchOdrCd);
				ps.setString(3, acptNo);
				rsSelectBadTRcvIssue = ps.executeQuery();
				// 検索して存在する場合のみ作成を行う
				if (rsSelectBadTRcvIssue.next()) {
					
					Numbering rcvIssueNumbering =
						new Numbering(
							this.conn,
							Numbering.ISSUE_CD,
							this.sysUserCd,
							this.sysBusinessId,
							this.sysPlantCd);
					String rcvIssueCtrlCd = rcvIssueNumbering.getNo();
					
					
					// 保管区別入出庫作成
					ps = this.conn.getConn().prepareStatement(this.insertTRcvIssueSql);
					ps.setString(1, rcvIssueCtrlCd);
					ps.setString(2, rsSelectBadTRcvIssue.getString("ITEM_CD"));
					ps.setString(3, rsSelectBadTRcvIssue.getString("PLANT_CD"));
					ps.setString(4, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
					ps.setString(5, rsSelectBadTRcvIssue.getString("JOB_ODR_CD"));
					ps.setString(6, "0");
					ps.setString(7, puchOdrCd);
					ps.setString(8, acptNo);
					ps.setString(9, "0");
					ps.setString(10, rsSelectBadTRcvIssue.getString("INSPC_CRCT_NO"));
					ps.setString(11, null);
					ps.setString(12, null);
					ps.setString(13, "0");
					ps.setString(14, "0");
					ps.setString(15, null);
					ps.setString(16, Calculate.multiply(
										Calculate.subtract( rs.getString("INSPECTED_QTY"),
															rs.getString("ACCEPTED_QTY")),
										"-1"
									)
					);
					ps.setString(17, rsSelectBadTRcvIssue.getString("RCV_ISSUE_DATE"));
					ps.setString(18, "25");
					ps.setString(19, rsSelectBadTRcvIssue.getString("RCV_ISSUE_CMPLT_FLG"));
					ps.setString(20, rsSelectBadTRcvIssue.getString("OD_NO"));
					ps.setString(21, rsSelectBadTRcvIssue.getString("LOT_NO"));
					ps.setString(22, rsSelectBadTRcvIssue.getString("VEND_LOT_NO"));
					ps.setString(23, rsSelectBadTRcvIssue.getString("COMPANY_CD"));
					ps.setString(24, rsSelectBadTRcvIssue.getString("VEND_CD"));
					ps.setString(25, this.sysUserCd);
					ps.setString(26, this.sysBusinessId);
					ps.setString(27, this.sysUserCd);
					ps.setString(28, this.sysBusinessId);
					ps.executeUpdate();
					
					// フォーム."製番"＝NULLの場合
					if (rsSelectBadTRcvIssue.getString("JOB_ODR_CD") == null) {
						// 保管区別品目在庫更新に必要なデータを検索
						ps = this.conn.getConn().prepareStatement(this.selectTItemStockSql);
						ps.setString(1, rsSelectBadTRcvIssue.getString("ITEM_CD"));
						ps.setString(2, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
						ps.setString(3, rsSelectBadTRcvIssue.getString("PLANT_CD"));
						rsSelectTItemStock = ps.executeQuery();
						// 保管区別品目在庫が存在する場合
						if (rsSelectTItemStock.next()) {
							// 保管区別品目在庫更新
							ps = this.conn.getConn().prepareStatement(this.updateTItemStockSql);
							ps.setString(1, Calculate.add(
												rsSelectTItemStock.getString("STOCK_ON_HAND_QTY"),
												Calculate.multiply(
													Calculate.subtract( rs.getString("INSPECTED_QTY"),
																		rs.getString("ACCEPTED_QTY")),
													"-1"
												)
											)
							);
							ps.setString(2, this.sysUserCd);
							ps.setString(3, this.sysBusinessId);
							ps.setString(4, rsSelectBadTRcvIssue.getString("ITEM_CD"));
							ps.setString(5, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
							ps.setString(6, rsSelectBadTRcvIssue.getString("PLANT_CD"));
							ps.executeUpdate();
							
							// 保管区別入出庫更新
							ps = this.conn.getConn().prepareStatement(this.updateTRcvIssueSql);
							ps.setString(1, rsSelectTItemStock.getString("STOCK_ON_HAND_QTY"));
							ps.setString(2, Calculate.add(
												rsSelectTItemStock.getString("STOCK_ON_HAND_QTY"),
												Calculate.multiply(
													Calculate.subtract( rs.getString("INSPECTED_QTY"),
																		rs.getString("ACCEPTED_QTY")),
													"-1"
												)
											)
							);
							ps.setString(3, this.sysUserCd);
							ps.setString(4, this.sysBusinessId);
							ps.setString(5, rcvIssueCtrlCd);
							ps.executeUpdate();
							
						// 保管区別品目在庫が存在しない場合
						} else {
							
							// 保管区別品目在庫追加
							ps = this.conn.getConn().prepareStatement(this.insertTItemStockSql);
							ps.setString(1, rsSelectBadTRcvIssue.getString("ITEM_CD"));
							ps.setString(2, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
							ps.setString(3, rsSelectBadTRcvIssue.getString("PLANT_CD"));
							ps.setString(4, Calculate.multiply(
												Calculate.subtract( rs.getString("INSPECTED_QTY"),
																	rs.getString("ACCEPTED_QTY")),
												"-1"
											)
							);
							ps.setString(5, this.sysUserCd);
							ps.setString(6, this.sysBusinessId);
							ps.setString(7, this.sysUserCd);
							ps.setString(8, this.sysBusinessId);
							ps.executeUpdate();
							
							// 保管区別入出庫更新
							ps = this.conn.getConn().prepareStatement(this.updateTRcvIssueSql);
							ps.setString(1, "0");
							ps.setString(2, Calculate.multiply(
												Calculate.subtract( rs.getString("INSPECTED_QTY"),
																	rs.getString("ACCEPTED_QTY")),
												"-1"
											)
							);
							ps.setString(3, this.sysUserCd);
							ps.setString(4, this.sysBusinessId);
							ps.setString(5, rcvIssueCtrlCd);
							ps.executeUpdate();
						}
						//ロット別品目在庫の更新
						// 保管区別品目在庫更新に必要なデータを検索
						if (rsSelectBadTRcvIssue.getString("LOT_NO") != null) {
							ps = this.conn.getConn().prepareStatement(this.selectTLotStockSql);
							ps.setString(1, rsSelectBadTRcvIssue.getString("ITEM_CD"));
							ps.setString(2, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
							ps.setString(3, rsSelectBadTRcvIssue.getString("LOT_NO"));
							rsSelectTLotStock = ps.executeQuery();
							if (rsSelectTLotStock.next()) {
								ps = this.conn.getConn().prepareStatement(this.updateTLotStockSql);
								ps.setString(1, Calculate.add(rsSelectTLotStock.getString("STOCK_ON_HAND_QTY"),
					                      Calculate.multiply(Calculate.subtract( rs.getString("INSPECTED_QTY"),
													rs.getString("ACCEPTED_QTY")),"-1")));
								ps.setString(2, this.sysUserCd);
								ps.setString(3, this.sysBusinessId);
								ps.setString(4, rsSelectBadTRcvIssue.getString("ITEM_CD"));
								ps.setString(5, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
								ps.setString(6, rsSelectBadTRcvIssue.getString("LOT_NO"));
								ps.executeQuery();
							} else {
								ps = this.conn.getConn().prepareStatement(this.insertTLotStockSql);
								ps.setString(1, rsSelectBadTRcvIssue.getString("ITEM_CD"));
								ps.setString(2, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
								ps.setString(3, rsSelectBadTRcvIssue.getString("LOT_NO"));
								ps.setString(4, rsSelectBadTRcvIssue.getString("PLANT_CD"));
								ps.setString(5, Calculate.multiply(Calculate.subtract( rs.getString("INSPECTED_QTY"),
										rs.getString("ACCEPTED_QTY")),"-1"));
								ps.setString(6, this.sysUserCd);
								ps.setString(7, this.sysBusinessId);
								ps.setString(8, this.sysUserCd);
								ps.setString(9, this.sysBusinessId);
								ps.executeQuery();
							}
						}
					// フォーム."製番"≠NULLの場合
					} else {
						// 保管区別製番在庫更新に必要なデータを検索(存在チェック)
						ps = this.conn.getConn().prepareStatement(this.selectTJobOdrCdStockSql);
						ps.setString(1, rsSelectBadTRcvIssue.getString("JOB_ODR_CD"));
						ps.setString(2, "0");
						ps.setString(3, rsSelectBadTRcvIssue.getString("ITEM_CD"));
						ps.setString(4, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
						ps.setString(5, rsSelectBadTRcvIssue.getString("PLANT_CD"));
						rsSelectTJobOdrCdStock = ps.executeQuery();
						// 保管区別製番在庫が存在する場合
						if (rsSelectTJobOdrCdStock.next()) {
							// 保管区別製番在庫更新
							ps = this.conn.getConn().prepareStatement(this.updateTJobOdrCdStockSql);
							ps.setString(1, Calculate.add(
												rsSelectTJobOdrCdStock.getString("STOCK_ON_HAND_QTY"),
												Calculate.multiply(
													Calculate.subtract( rs.getString("INSPECTED_QTY"),
																		rs.getString("ACCEPTED_QTY")),
													"-1"
												)
											)
							);
							ps.setString(2, this.sysUserCd);
							ps.setString(3, this.sysBusinessId);
							ps.setString(4, rsSelectBadTRcvIssue.getString("JOB_ODR_CD"));
							ps.setString(5, "0");
							ps.setString(6, rsSelectBadTRcvIssue.getString("ITEM_CD"));
							ps.setString(7, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
							ps.setString(8, rsSelectBadTRcvIssue.getString("PLANT_CD"));
							ps.executeUpdate();
							
							// 保管区別入出庫更新
							ps = this.conn.getConn().prepareStatement(this.updateTRcvIssueSql);
							ps.setString(1, rsSelectTJobOdrCdStock.getString("STOCK_ON_HAND_QTY"));
							ps.setString(2, Calculate.add(
												rsSelectTJobOdrCdStock.getString("STOCK_ON_HAND_QTY"),
												Calculate.multiply(
													Calculate.subtract( rs.getString("INSPECTED_QTY"),
																		rs.getString("ACCEPTED_QTY")),
													"-1"
												)
											)
							);
							ps.setString(3, this.sysUserCd);
							ps.setString(4, this.sysBusinessId);
							ps.setString(5, rcvIssueCtrlCd);
							ps.executeUpdate();
							
						} else {
							// 保管区別製番在庫追加
							ps = this.conn.getConn().prepareStatement(this.insertTJobOdrCdStockSql);
							ps.setString(1, rsSelectBadTRcvIssue.getString("JOB_ODR_CD"));
							ps.setString(2, "0");
							ps.setString(3, rsSelectBadTRcvIssue.getString("ITEM_CD"));
							ps.setString(4, rsSelectBadTRcvIssue.getString("INSPC_WH_CD"));
							ps.setString(5, rsSelectBadTRcvIssue.getString("PLANT_CD"));
							ps.setString(6, Calculate.multiply(
												Calculate.subtract( rs.getString("INSPECTED_QTY"),
																	rs.getString("ACCEPTED_QTY")),
												"-1"
											)
							);
							ps.setString(7, this.sysUserCd);
							ps.setString(8, this.sysBusinessId);
							ps.setString(9, this.sysUserCd);
							ps.setString(10, this.sysBusinessId);
							ps.executeUpdate();
							
							// 保管区別入出庫更新
							ps = this.conn.getConn().prepareStatement(this.updateTRcvIssueSql);
							ps.setString(1, "0");
							ps.setString(2, Calculate.multiply(
												Calculate.subtract( rs.getString("INSPECTED_QTY"),
																	rs.getString("ACCEPTED_QTY")),
												"-1"
											)
							);
							ps.setString(3, this.sysUserCd);
							ps.setString(4, this.sysBusinessId);
							ps.setString(5, rcvIssueCtrlCd);
							ps.executeUpdate();
						}
					}
				}
			}
			if (rs.getString("LOT_NO") != null) {
				ps = this.conn.getConn().prepareStatement(this.checkLotStockSql);
				ps.setString(1, puchOdrCd);
				ps.setString(2, acptNo);
				rsCheckTLotStock = ps.executeQuery();
				if (rsCheckTLotStock.next()) {
					_errorList.add("AE20606");
				}
			}
			// 入出庫の更新
			if ((("2".equals(rs.getString("ACPT_INSPC_TYP")))
				&& ("1".equals(rs.getString("INV_CTRL_FLG")))
				&& (rs.getString("WORK_ODR_CD") == null))
				|| (("2".equals(rs.getString("ACPT_INSPC_TYP")))
					&& ("1".equals(rs.getString("INV_CTRL_FLG")))
					&& (rs.getString("WORK_ODR_CD") != null)
					&& ("1".equals(rs.getString("FINAL_PROC_FLG"))))) {

				return result;
			}
			return true;
		} catch (FoundationException ex) {
			throw ex;
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (rsSelectBadTRcvIssue != null) {
				rsSelectBadTRcvIssue.close();
			}
			if (rsSelectTItemStock != null) {
				rsSelectTItemStock.close();
			}
			if (rsSelectTJobOdrCdStock != null) {
				rsSelectTJobOdrCdStock.close();
			}
			if (rsSelectTLotStock != null) {
				rsSelectTLotStock.close();
			}
			if (rsCheckTLotStock != null) {
				rsCheckTLotStock.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 検査実績の完了解除を行います。
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	public void cancelInspc(String puchOdrCd, String acptNo)
		throws ApsComException, ParseException, FoundationException, SQLException {
		// ステートメント
		PreparedStatement ps = null;
		// リザルトセット
		ResultSet rsSelectData = null;
		ResultSet rsSelectTRcvIssue = null;
		ResultSet rsSelectTLotStock = null;
		ResultSet rsSelectTRlsdPuchOdr = null;
		ResultSet rsSelectTItemStock = null;
		ResultSet rsSelectTJobOdrCdStock = null;

		try {
			// 解除処理に必要なデータを検索
			ps = this.conn.getConn().prepareStatement(this.selectDataSql);
			ps.setString(1, puchOdrCd);
			ps.setString(2, acptNo);
			rsSelectData = ps.executeQuery();
			// 検索して存在しない場合はエラー
			if (!rsSelectData.next()) {
				throw new NullPointerException();
			}

			CommonOd co =
				new CommonOd(this.conn, this.sysPlantCd, this.sysUserCd, this.sysBusinessId);

			if (rsSelectData.getString("WORK_ODR_CD") != null) {
				// 作業系列別仕掛の解除
				this.updateWorkInProcByProcForCancel(
					rsSelectData.getString("WORK_ODR_CD"),
					rsSelectData.getString("WORK_IN_PROC_CD"));

				if ("1".equals(rsSelectData.getString("FINAL_PROC_FLG"))) {
					// 品目別仕掛の解除
					this.updateWorkInProcByItemForCancel(rsSelectData.getString("WORK_ODR_CD"));
				}
				// 所要量の解除
				co.changeDemandForCancel(
					rsSelectData.getString("WORK_ODR_CD"),
					rsSelectData.getString("WORK_IN_PROC_CD"));
			}
			// 所要量の解除
			co.changeOrderForCancel(rsSelectData.getString("OD_NO"), -1);
			
			// 保管区別入出庫作成に必要なデータを検索(保管区別入出庫)
			ps = this.conn.getConn().prepareStatement(this.selectTRcvIssueSql);
			ps.setString(1, puchOdrCd);
			ps.setString(2, this.sysPlantCd);
			ps.setString(3, acptNo);
			ps.setString(4, puchOdrCd);
			ps.setString(5, this.sysPlantCd);
			ps.setString(6, acptNo);
			rsSelectTRcvIssue = ps.executeQuery();
			// 検索して存在する場合は以下の処理を行う
			if (rsSelectTRcvIssue.next()) {
				// 保管区別入出庫の登録
				Numbering rcvIssueNumbering =
					new Numbering(
						this.conn,
						Numbering.ISSUE_CD,
						this.sysUserCd,
						this.sysBusinessId,
						this.sysPlantCd);
				String rcvIssueCtrlCd = rcvIssueNumbering.getNo();
				
				// 保管区別入出庫作成に必要なデータを検索(発注残)
				ps = this.conn.getConn().prepareStatement(this.selectTRlsdPuchOdrSql);
				ps.setString(1, rsSelectTRcvIssue.getString("PUCH_ODR_CD"));
				rsSelectTRlsdPuchOdr = ps.executeQuery();
				// 検索して存在しない場合はエラー
				if (!rsSelectTRlsdPuchOdr.next()) {
					throw new NullPointerException();
				}
				
				String rcvIssueCmpltFlg = null;
				if (rsSelectTRlsdPuchOdr.getString("PUCH_ODR_STS_TYP") == "9" &&
						rsSelectTRlsdPuchOdr.getString("INSPC_CMPLT_FLG") == "1"){
					rcvIssueCmpltFlg = "1";
				} else {
					rcvIssueCmpltFlg = "0";
				}
				
				// 保管区別入出庫作成
				ps = this.conn.getConn().prepareStatement(this.insertTRcvIssueSql);
				ps.setString(1, rcvIssueCtrlCd);
				ps.setString(2, rsSelectTRcvIssue.getString("ITEM_CD"));
				ps.setString(3, rsSelectTRcvIssue.getString("PLANT_CD"));
				ps.setString(4, rsSelectTRcvIssue.getString("WH_CD"));
				ps.setString(5, rsSelectTRcvIssue.getString("JOB_ODR_CD"));
				ps.setString(6, rsSelectTRcvIssue.getString("JOB_ODR_DETAIL_NO"));
				ps.setString(7, rsSelectTRcvIssue.getString("PUCH_ODR_CD"));
				ps.setString(8, rsSelectTRcvIssue.getString("ACPT_NO"));
				ps.setString(9, rsSelectTRcvIssue.getString("ACPT_RSLT_CRCT_NO"));
				ps.setString(10, rsSelectTRcvIssue.getString("INSPEC_RSLT_CRCT_NO"));
				ps.setString(11, rsSelectTRcvIssue.getString("WORK_ODR_CD"));
				ps.setString(12, rsSelectTRcvIssue.getString("WORK_IN_PROC_CD"));
				ps.setString(13, rsSelectTRcvIssue.getString("PARTIAL_PRD_NO"));
				ps.setString(14, rsSelectTRcvIssue.getString("OPR_RSLT_CRCT_NO"));
				ps.setString(15, rsSelectTRcvIssue.getString("ISSUE_INST_CD"));
				ps.setString(16, Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1"));
				ps.setString(17, rsSelectTRcvIssue.getString("RCV_ISSUE_DATE"));
				ps.setString(18, "26");
				ps.setString(19, rcvIssueCmpltFlg);
				ps.setString(20, rsSelectTRcvIssue.getString("OD_NO"));
				ps.setString(21, rsSelectTRcvIssue.getString("LOT_NO"));
				ps.setString(22, rsSelectTRcvIssue.getString("VEND_LOT_NO"));
				ps.setString(23, rsSelectTRcvIssue.getString("COMPANY_CD"));
				ps.setString(24, rsSelectTRcvIssue.getString("VEND_CD"));
				ps.setString(25, this.sysUserCd);
				ps.setString(26, this.sysBusinessId);
				ps.setString(27, this.sysUserCd);
				ps.setString(28, this.sysBusinessId);
				ps.executeUpdate();
				
				// 保管区別入出庫."製番"＝NULLの場合
				if (rsSelectTRcvIssue.getString("JOB_ODR_CD") == null) {
					// 保管区別品目在庫更新に必要なデータを検索
					ps = this.conn.getConn().prepareStatement(this.selectTItemStockSql);
					ps.setString(1, rsSelectTRcvIssue.getString("ITEM_CD"));
					ps.setString(2, rsSelectTRcvIssue.getString("WH_CD"));
					ps.setString(3, rsSelectTRcvIssue.getString("PLANT_CD"));
					rsSelectTItemStock = ps.executeQuery();
					// 保管区別品目在庫が存在する場合
					if (rsSelectTItemStock.next()) {
						// 保管区別品目在庫更新
						ps = this.conn.getConn().prepareStatement(this.updateTItemStockSql);
						ps.setString(1, Calculate.add(
											rsSelectTItemStock.getString("STOCK_ON_HAND_QTY"),
											Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1")
										)
						);
						ps.setString(2, this.sysUserCd);
						ps.setString(3, this.sysBusinessId);
						ps.setString(4, rsSelectTRcvIssue.getString("ITEM_CD"));
						ps.setString(5, rsSelectTRcvIssue.getString("WH_CD"));
						ps.setString(6, rsSelectTRcvIssue.getString("PLANT_CD"));
						ps.executeUpdate();
						
						// 保管区別入出庫更新
						ps = this.conn.getConn().prepareStatement(this.updateTRcvIssueSql);
						ps.setString(1, rsSelectTItemStock.getString("STOCK_ON_HAND_QTY"));
						ps.setString(2, Calculate.add(
											rsSelectTItemStock.getString("STOCK_ON_HAND_QTY"),
											Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1")
										)
						);
						ps.setString(3, this.sysUserCd);
						ps.setString(4, this.sysBusinessId);
						ps.setString(5, rcvIssueCtrlCd);
						ps.executeUpdate();
						
					// 保管区別品目在庫が存在しない場合
					} else {
						
						// 保管区別品目在庫追加
						ps = this.conn.getConn().prepareStatement(this.insertTItemStockSql);
						ps.setString(1, rsSelectTRcvIssue.getString("ITEM_CD"));
						ps.setString(2, rsSelectTRcvIssue.getString("WH_CD"));
						ps.setString(3, rsSelectTRcvIssue.getString("PLANT_CD"));
						ps.setString(4, Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1"));
						ps.setString(5, this.sysUserCd);
						ps.setString(6, this.sysBusinessId);
						ps.setString(7, this.sysUserCd);
						ps.setString(8, this.sysBusinessId);
						ps.executeUpdate();
						
						// 保管区別入出庫更新
						ps = this.conn.getConn().prepareStatement(this.updateTRcvIssueSql);
						ps.setString(1, "0");
						ps.setString(2, Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1"));
						ps.setString(3, this.sysUserCd);
						ps.setString(4, this.sysBusinessId);
						ps.setString(5, rcvIssueCtrlCd);
						ps.executeUpdate();
					}
					//ロット別品目在庫の更新
					// 保管区別品目在庫更新に必要なデータを検索
					if (rsSelectTRcvIssue.getString("LOT_NO") != null) {
						ps = this.conn.getConn().prepareStatement(this.selectTLotStockSql);
						ps.setString(1, rsSelectTRcvIssue.getString("ITEM_CD"));
						ps.setString(2, rsSelectTRcvIssue.getString("WH_CD"));
						ps.setString(3, rsSelectTRcvIssue.getString("LOT_NO"));
						rsSelectTLotStock = ps.executeQuery();
						if (rsSelectTLotStock.next()) {
							if (Calculate.compare(Calculate.add(rsSelectTLotStock.getString("STOCK_ON_HAND_QTY"),
									Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1")),"0") == -1) {
								_errorList.add("AE20606");
								return;
							}
							ps = this.conn.getConn().prepareStatement(this.updateTLotStockSql);
							ps.setString(1, Calculate.add(
									rsSelectTLotStock.getString("STOCK_ON_HAND_QTY"),
									Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1")));
							ps.setString(2, this.sysUserCd);
							ps.setString(3, this.sysBusinessId);
							ps.setString(4, rsSelectTRcvIssue.getString("ITEM_CD"));
							ps.setString(5, rsSelectTRcvIssue.getString("WH_CD"));
							ps.setString(6, rsSelectTRcvIssue.getString("LOT_NO"));
							ps.executeQuery();
						} else {
							if (Calculate.compare(Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1"),"0") == -1) {
								_errorList.add("AE20606");
								return;
							}
							ps = this.conn.getConn().prepareStatement(this.insertTLotStockSql);
							ps.setString(1, rsSelectTRcvIssue.getString("ITEM_CD"));
							ps.setString(2, rsSelectTRcvIssue.getString("WH_CD"));
							ps.setString(3, rsSelectTRcvIssue.getString("LOT_NO"));
							ps.setString(4, rsSelectTRcvIssue.getString("PLANT_CD"));
							ps.setString(5, Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1"));
							ps.setString(6, this.sysUserCd);
							ps.setString(7, this.sysBusinessId);
							ps.setString(8, this.sysUserCd);
							ps.setString(9, this.sysBusinessId);
							ps.executeQuery();
						}
					}
				// 保管区別入出庫."製番"≠NULLの場合
				} else {
					// 保管区別製番在庫庫更新に必要なデータを検索(存在チェック)
					ps = this.conn.getConn().prepareStatement(this.selectTJobOdrCdStockSql);
					ps.setString(1, rsSelectTRcvIssue.getString("JOB_ODR_CD"));
					ps.setString(2, rsSelectTRcvIssue.getString("JOB_ODR_DETAIL_NO"));
					ps.setString(3, rsSelectTRcvIssue.getString("ITEM_CD"));
					ps.setString(4, rsSelectTRcvIssue.getString("WH_CD"));
					ps.setString(5, rsSelectTRcvIssue.getString("PLANT_CD"));
					rsSelectTJobOdrCdStock = ps.executeQuery();
					// 保管区別製番在庫が存在する場合
					if (rsSelectTJobOdrCdStock.next()) {
						// 保管区別製番在庫更新
						ps = this.conn.getConn().prepareStatement(this.updateTJobOdrCdStockSql);
						ps.setString(1, Calculate.add(
											rsSelectTJobOdrCdStock.getString("STOCK_ON_HAND_QTY"),
											Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1")
										)
						);
						ps.setString(2, this.sysUserCd);
						ps.setString(3, this.sysBusinessId);
						ps.setString(4, rsSelectTRcvIssue.getString("JOB_ODR_CD"));
						ps.setString(5, rsSelectTRcvIssue.getString("JOB_ODR_DETAIL_NO"));
						ps.setString(6, rsSelectTRcvIssue.getString("ITEM_CD"));
						ps.setString(7, rsSelectTRcvIssue.getString("WH_CD"));
						ps.setString(8, rsSelectTRcvIssue.getString("PLANT_CD"));
						ps.executeUpdate();
						
						// 保管区別入出庫更新
						ps = this.conn.getConn().prepareStatement(this.updateTRcvIssueSql);
						ps.setString(1, rsSelectTJobOdrCdStock.getString("STOCK_ON_HAND_QTY"));
						ps.setString(2, Calculate.add(
											rsSelectTJobOdrCdStock.getString("STOCK_ON_HAND_QTY"),
											Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1")
											)
						);
						ps.setString(3, this.sysUserCd);
						ps.setString(4, this.sysBusinessId);
						ps.setString(5, rcvIssueCtrlCd);
						ps.executeUpdate();
					} else {
						// 保管区別製番在庫追加
						ps = this.conn.getConn().prepareStatement(this.insertTJobOdrCdStockSql);
						ps.setString(1, rsSelectTRcvIssue.getString("JOB_ODR_CD"));
						ps.setString(2, rsSelectTRcvIssue.getString("JOB_ODR_DETAIL_NO"));
						ps.setString(3, rsSelectTRcvIssue.getString("ITEM_CD"));
						ps.setString(4, rsSelectTRcvIssue.getString("WH_CD"));
						ps.setString(5, rsSelectTRcvIssue.getString("PLANT_CD"));
						ps.setString(6, Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1"));
						ps.setString(7, this.sysUserCd);
						ps.setString(8, this.sysBusinessId);
						ps.setString(9, this.sysUserCd);
						ps.setString(10, this.sysBusinessId);
						ps.executeUpdate();
						
						// 保管区別入出庫更新
						ps = this.conn.getConn().prepareStatement(this.updateTRcvIssueSql);
						ps.setString(1, "0");
						ps.setString(2, Calculate.multiply(rsSelectTRcvIssue.getString("RCV_ISSUE_QTY"), "-1"));
						ps.setString(3, this.sysUserCd);
						ps.setString(4, this.sysBusinessId);
						ps.setString(5, rcvIssueCtrlCd);
						ps.executeUpdate();

					}
				}
			}

		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (rsSelectData != null) {
				rsSelectData.close();
			}
			if (rsSelectTRcvIssue != null) {
				rsSelectTRcvIssue.close();
			}
			if (rsSelectTRlsdPuchOdr != null) {
				rsSelectTRlsdPuchOdr.close();
			}
			if (rsSelectTItemStock != null) {
				rsSelectTItemStock.close();
			}
			if (rsSelectTJobOdrCdStock != null) {
				rsSelectTJobOdrCdStock.close();
			}
			if (rsSelectTLotStock != null) {
				rsSelectTLotStock.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * 検収履歴（黒）
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param slipCd 伝票番号
	 * @param exchRate 為替レート
	 * @return ？？
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	private int insertDebitRecordInspcAcptTypeAcpt(String puchOdrCd, String acptNo, String slipCd, String exchRate)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertDebitRecordInspcAcptSqlTypeAcpt);
			ps.setString(1, slipCd);
			ps.setString(2, exchRate);
			ps.setString(3, this.sysUserCd);
			ps.setString(4, this.sysBusinessId);
			ps.setString(5, this.sysUserCd);
			ps.setString(6, this.sysBusinessId);
			ps.setString(7, puchOdrCd);
			ps.setString(8, acptNo);
			ps.setString(9, puchOdrCd);
			ps.setString(10, acptNo);
			ps.setString(11, puchOdrCd);
			ps.setString(12, acptNo);
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
	 * 検収履歴（黒）
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param slipCd 伝票番号
	 * @param exchRate 為替レート
	 * @return ？？
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	private int insertDebitRecordInspcAcptTypeInspc(String puchOdrCd, String acptNo, String slipCd, String exchRate)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertDebitRecordInspcAcptSqlTypeInspc);
			//ps.setString(1, this.sysUserCd);
			//ps.setString(2, this.sysBusinessId);
			//ps.setString(3, this.sysUserCd);
			//ps.setString(4, this.sysBusinessId);
			//ps.setString(5, puchOdrCd);
			//ps.setString(6, acptNo);
			//ps.setString(7, puchOdrCd);
			//ps.setString(8, acptNo);
			//ps.setString(9, puchOdrCd);
			//ps.setString(10, acptNo);
			ps.setString(1, slipCd);
			ps.setString(2, exchRate);
			ps.setString(3, _dateCheckFlg);
			ps.setString(4, this.sysUserCd);
			ps.setString(5, this.sysBusinessId);
			ps.setString(6, this.sysUserCd);
			ps.setString(7, this.sysBusinessId);
			ps.setString(8, puchOdrCd);
			ps.setString(9, acptNo);
			ps.setString(10, puchOdrCd);
			ps.setString(11, acptNo);
			ps.setString(12, puchOdrCd);
			ps.setString(13, acptNo);
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
	 * 検収履歴（赤）SQL
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param slipCd 伝票番号
	 * @return ？？
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	private int insertCreditRecordInspcAcptTypeAcpt(String puchOdrCd, String acptNo, String slipCd)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertCreditRecordInspcAcptSqlTypeAcpt);
			ps.setString(1, slipCd);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, this.sysUserCd);
			ps.setString(5, this.sysBusinessId);
			ps.setString(6, puchOdrCd);
			ps.setString(7, acptNo);
			ps.setString(8, puchOdrCd);
			ps.setString(9, acptNo);
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
	 * 検収履歴（赤）SQL
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @return ？？
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	private int insertCreditRecordInspcAcptTypeInspc(String puchOdrCd, String acptNo)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertCreditRecordInspcAcptSqlTypeInspc);
			ps.setString(1, this.sysUserCd);
			ps.setString(2, this.sysBusinessId);
			ps.setString(3, this.sysUserCd);
			ps.setString(4, this.sysBusinessId);
			ps.setString(5, puchOdrCd);
			ps.setString(6, acptNo);
			ps.setString(7, puchOdrCd);
			ps.setString(8, acptNo);
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
	 * 検収実績情報インターフェース（黒）SQL
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param slipCd 伝票番号
	 * @param exchRate 為替レート
	 * @return ？？
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	private int insertDebitRecordInspcAcptIfTypeAcpt(String puchOdrCd, String acptNo, String slipCd ,String exchRate)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertDebitRecordInspcAcptIfSqlTypeAcpt);
			ps.setString(1, slipCd);
			ps.setString(2, exchRate);
			ps.setString(3, this.sysUserCd);
			ps.setString(4, this.sysBusinessId);
			ps.setString(5, this.sysUserCd);
			ps.setString(6, this.sysBusinessId);
			ps.setString(7, _apprFlg);
			ps.setString(8, puchOdrCd);
			ps.setString(9, acptNo);
			ps.setString(10, puchOdrCd);
			ps.setString(11, acptNo);
			ps.setString(12, puchOdrCd);
			ps.setString(13, acptNo);
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
	 * 検収実績情報インターフェース（黒）SQL
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param slipCd 伝票番号
	 * @param exchRate 為替レート
	 * @return ？？
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	private int insertDebitRecordInspcAcptIfTypeInspc(String puchOdrCd, String acptNo, String slipCd, String exchRate)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps =
				this.conn.getConn().prepareStatement(this.insertDebitRecordInspcAcptIfSqlTypeInspc);
			//ps.setString(1, this.sysUserCd);
			//ps.setString(2, this.sysBusinessId);
			//ps.setString(3, this.sysUserCd);
			//ps.setString(4, this.sysBusinessId);
			//ps.setString(5, _apprFlg);
			//ps.setString(6, puchOdrCd);
			//ps.setString(7, acptNo);
			//ps.setString(8, puchOdrCd);
			//ps.setString(9, acptNo);
			//ps.setString(10, puchOdrCd);
			//ps.setString(11, acptNo);
			ps.setString(1, slipCd);
			ps.setString(2, exchRate);
			ps.setString(3, _dateCheckFlg);
			ps.setString(4, this.sysUserCd);
			ps.setString(5, this.sysBusinessId);
			ps.setString(6, this.sysUserCd);
			ps.setString(7, this.sysBusinessId);
			ps.setString(8, _apprFlg);
			ps.setString(9, puchOdrCd);
			ps.setString(10, acptNo);
			ps.setString(11, puchOdrCd);
			ps.setString(12, acptNo);
			ps.setString(13, puchOdrCd);
			ps.setString(14, acptNo);
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
	 * 検収実績情報インターフェース（赤）
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param slipCd 伝票番号
	 * @return ？？
	 * @throws ApsComException ？？
	 * @throws ParseException ？？
	 * @throws FoundationException ？？
	 * @throws SQLException ？？
	 */
	private int insertCreditRecordInspcAcptIf(String puchOdrCd, String acptNo, String slipCd)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertCreditRecordInspcAcptIfSql);
			ps.setString(1, slipCd);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, this.sysUserCd);
			ps.setString(5, this.sysBusinessId);
			ps.setString(6, _apprFlg);
			ps.setString(7, puchOdrCd);
			ps.setString(8, acptNo);
			ps.setString(9, puchOdrCd);
			ps.setString(10, acptNo);
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
	 *
	 * @param puchOdrCd ？？
	 * @param WorkOdrCd ？？
	 * @param WorkInProcCd ？？
	 * @return ？？
	 * @throws SQLException ？？
	 */
	private int updateWorkInProcByProcForComplete(
		String puchOdrCd,
		String WorkOdrCd,
		String WorkInProcCd)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateWorkInProcByProcForCompleteSql);
			ps.setString(1, this.sysUserCd);
			ps.setString(2, this.sysBusinessId);
			ps.setString(3, puchOdrCd);
			ps.setString(4, puchOdrCd);
			ps.setString(5, WorkOdrCd);
			ps.setString(6, WorkInProcCd);
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
	 * 20071101NES KOIZUMI ADD 作業系列別仕掛更新
	 * 発注残の同一発注番号内最遅検査日（引数InspcDate）を作業完了日へ更新
	 * @param puchOdrCd 発注番号
	 * @param WorkOdrCd 作業計画番号
	 * @param InspcDate 検査日
	 * @return 結果セット
	 * @throws SQLException DBアクセスエラー
	 */
	private int updateWorkInProcByProcForCompleteInspc(
		String puchOdrCd,
		String WorkOdrCd,
		String WorkInProcCd,
		String InspcDate)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateWorkInProcByProcForCompleteInspcSql);
			ps.setString(1, InspcDate);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, puchOdrCd);
			ps.setString(5, puchOdrCd);
			ps.setString(6, WorkOdrCd);
			ps.setString(7, WorkInProcCd);
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
	 *
	 * @param WorkOdrCd ？？
	 * @param WorkInProcCd ？？
	 * @return ？？
	 * @throws SQLException ？？
	 */
	private int updateWorkInProcByProcForCancel(String WorkOdrCd, String WorkInProcCd)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateWorkInProcByProcForCancelSql);
			ps.setString(1, this.sysUserCd);
			ps.setString(2, this.sysBusinessId);
			ps.setString(3, WorkOdrCd);
			ps.setString(4, WorkInProcCd);
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
	 *
	 * @param puchOdrCd ？？
	 * @param WorkOdrCd ？？
	 * @return ？？
	 * @throws SQLException ？？
	 */
	private int updateWorkInProcByItemForComplete(String puchOdrCd, String WorkOdrCd)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateWorkInProcByItemForCompleteSql);
			ps.setString(1, this.sysUserCd);
			ps.setString(2, this.sysBusinessId);
			ps.setString(3, puchOdrCd);
			ps.setString(4, puchOdrCd);
			ps.setString(5, WorkOdrCd);
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
	 * 20071101NES KOIZUMI ADD 品目別仕掛更新
	 * 発注残の同一発注番号内最遅検査日（引数InspcDate）を作業完了日へ更新
	 * @param puchOdrCd 発注番号
	 * @param WorkOdrCd 作業計画番号
	 * @param InspcDate 検査日
	 * @return 結果セット
	 * @throws SQLException DBアクセスエラー
	 */
	private int updateWorkInProcByItemForCompleteInspc(String puchOdrCd, 
													   String WorkOdrCd,
													   String InspcDate)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateWorkInProcByItemForCompleteInspcSql);
			ps.setString(1, InspcDate);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, puchOdrCd);
			ps.setString(5, puchOdrCd);
			ps.setString(6, WorkOdrCd);
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
	 *
	 * @param WorkOdrCd ？？
	 * @return ？？
	 * @throws SQLException ？？
	 */
	private int updateWorkInProcByItemForCancel(String WorkOdrCd) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.updateWorkInProcByItemForCancelSql);
			ps.setString(1, this.sysUserCd);
			ps.setString(2, this.sysBusinessId);
			ps.setString(3, WorkOdrCd);
			int row = ps.executeUpdate();
			ps.close();
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
	 * 保管区別入出庫の登録（通常入庫）
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param rcvIssueCtrlCd 入出庫管理番号
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 * @throws FoundationException 自動裁番エラー
	 */
	private int insertRcvIssue(String puchOdrCd, String acptNo, String rcvIssueCtrlCd)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertRcvIssueSql);
			ps.setString(1, rcvIssueCtrlCd);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, this.sysUserCd);
			ps.setString(5, this.sysBusinessId);
			ps.setString(6, puchOdrCd);
			ps.setString(7, puchOdrCd);
			ps.setString(8, acptNo);
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
	 * 保管区別入出庫の登録（検査実績更新時）
	 * @param puchOdrCd 発注番号
	 * @param acptNo 受入回数
	 * @param rcvIssueCtrlCd 入出庫管理番号
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 * @throws FoundationException 自動裁番エラー
	 */
	private int insertRcvIssueInspec(String puchOdrCd, String acptNo, String rcvIssueCtrlCd)
		throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = this.conn.getConn().prepareStatement(this.insertTRcvIssueInspecSql);
			ps.setString(1, rcvIssueCtrlCd);
			ps.setString(2, this.sysUserCd);
			ps.setString(3, this.sysBusinessId);
			ps.setString(4, this.sysUserCd);
			ps.setString(5, this.sysBusinessId);
			ps.setString(6, puchOdrCd);
			ps.setString(7, puchOdrCd);
			ps.setString(8, acptNo);
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
	 * 入庫完了日の計算
	 * 入庫完了日 = [発注残]."検査完了日"の最遅日
	 *
	 * @param odNo オーダデマンド番号
	 * @return 入庫完了日 or null
	 * @throws SQLException
	 */
	private Date getRcvCmpltDate(String odNo)
			throws SQLException {

		PreparedStatement ps = null;
		Date rcvCmpltDate = null;
		try {
			String sql;
			rcvCmpltDate = null;									  // 入庫完了日

			// << 発注残の検索 >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "order by INSPC_CMPLT_DATE desc"; 					  // 検査完了日の降順
			ps = this.conn.getConn().prepareStatement(sql);
			ps.setString(1, odNo);
			ResultSet rsRlsdPuchOdr = ps.executeQuery();

			// 発注残の検索データの中から検査完了フラグ=1(完了)があれば、
			// 入庫完了日の候補として最遅検査完了日を保持する。
			Date inspcDate = null;
			while ( rsRlsdPuchOdr.next() ) {
				if ( inspcDate == null ) {
					inspcDate = rsRlsdPuchOdr.getDate("INSPC_CMPLT_DATE");
				}
				if ( rsRlsdPuchOdr.getInt("INSPC_CMPLT_FLG") != 1 ) {
					break;
				}
			}
			rsRlsdPuchOdr.close();
			ps.close();
			rcvCmpltDate = inspcDate;
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
		return rcvCmpltDate;
	}
}