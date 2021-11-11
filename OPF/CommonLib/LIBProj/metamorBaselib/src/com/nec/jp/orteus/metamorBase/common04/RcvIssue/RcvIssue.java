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
 * ���Ɏ��݌ɍX�V�N���X
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.10 $ $Date: 2012/04/07 06:02:32 $
 */
public class RcvIssue {
	/** DB�A�N�Z�X�p�̃R�l�N�V���� */
	private IDbConnection conn = null;

	/** ���[�U�R�[�h */
	private String sysUserCd = null;
	/** �Ɩ�ID */
	private String sysBusinessId = null;
	/** �H��R�[�h */
	private String sysPlantCd = null;

	/** ���[�j���O�i�[���X�g */
	private List _errorList = new ArrayList();
	/**
	 * ���b�Z�[�W�擾 
	 * @return �G���[���X�g
	 */
	public List getErrorList()
	{
		return _errorList;
	}
    /** �ۊǋ�ʓ��o�ɂ̌����i�����f�[�^�擾�j */
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
    
	/** �ۊǋ�ʓ��o�ɂ̌����i�����f�[�^�擾�j */
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
	/** �ۊǋ�ʓ��o�ɂ̌����i�O��f�[�^�擾 ��ƌv��j */
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
	/** �ۊǋ�ʓ��o�ɂ̌����i�O��f�[�^�擾 �����j */
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
	/** �ۊǋ�ʓ��o�ɂ̓o�^�i���Ɏ���j */
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
	/** �ۊǋ�ʓ��o�ɂ̍X�V */
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
	/** �ۊǋ�ʕi�ڍ݌ɂ̌��� */
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
	/** �ۊǋ�ʕi�ڍ݌ɂ̓o�^ */
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
	/** �ۊǋ�ʕi�ڍ݌ɂ̍X�V */
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
	/** ���b�g�ʕi�ڍ݌Ɍ��� */
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
	/** ���b�g�ʕi�ڍ݌ɍX�V */
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
	/** ���b�g�ʕi�ڍ݌ɒǉ� */
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
	/** �ۊǋ�ʐ��ԍ݌ɂ̌��� */
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
	/** �ۊǋ�ʐ��ԍ݌ɂ̓o�^ */
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
	/** �ۊǋ�ʐ��ԍ݌ɂ̍X�V */
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
	/** ���Ԍv��̍X�V */
	private String updateJobOdrSql =
		"update T_JOB_ODR "
			+ "set JOB_ODR_STS_TYP=9 "
			+ "where "
			+ "  T_JOB_ODR.JOB_ODR_CD = ? "
			+ "  and T_JOB_ODR.JOB_ODR_DETAIL_NO = ? "
			+ "  and T_JOB_ODR.JOB_ODR_CANCEL_NO = ? ";
	/** ���Ԍv��̌��� */
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
	/** ���v�ʂ̌��� */
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
	/** �ۊǋ�ʐ��ԍ݌ɂ̌����i�ۊǋ�����肵�Ȃ��j */
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
	/** ���Ԉ����̌��� */
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
	/* [�����c]�̌��� */
	private String selectRlsdPuchOdrSql =
		"SELECT"
			+	" RPO.PUCH_ODR_STS_TYP AS PUCH_ODR_STS_TYP"
			+	",RPO.INSPC_CMPLT_FLG AS INSPC_CMPLT_FLG"
			+	" FROM"
			+	" T_RLSD_PUCH_ODR RPO"
			+	" WHERE"
			+	" RPO.PUCH_ODR_CD = ?";
			/* [�������]�̌��� */
	private String selectAcptRsltSql =
		"SELECT"
			+	" AR.INSPC_WH_CD AS INSPC_WH_CD"
			+	" FROM"
			+	" T_ACPT_RSLT AR"
			+	" WHERE"
			+	" AR.PUCH_ODR_CD = ?"
			+	" AND AR.ACPT_NO = TO_NUMBER(?)";
	/* [�ۊǋ�ʓ��o��]�o�^ */
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
	/** �ۊǋ�ʓ��o�ɂ̌����i�O��f�[�^�擾 �����҂��ۊǋ�j */
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
	 * �R���X�g���N�^
	 * @param connect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param userCd ���[�U�R�[�h
	 * @param busineId �Ɩ�ID
	 * @param plantCd �H��R�[�h
	 */
	public RcvIssue(IDbConnection connect, String userCd, String busineId, String plantCd) {
		this.conn = connect;
		this.sysUserCd = userCd;
		this.sysBusinessId = busineId;
		this.sysPlantCd = plantCd;
	}

	/**
	 * �ۊǋ�ʓ��o�Ƀe�[�u���Ƀf�[�^��o�^���A�莝�݌ɐ����X�V���܂��B
	 * @param rcvIssueCtrlCd �ۊǋ�R�[�h
	 * @return �݌ɂ�����Ȃ��ꍇfalse
	 * @throws ParseException
	 * @throws ApsComException
	 * @throws FoundationException �����̔ԃG���[����throw����܂��B
	 * @throws SQLException DB�X�V�G���[����throw����܂��B
	 */
	public boolean addRcvIssue(String rcvIssueCtrlCd)
		throws ApsComException, FoundationException, SQLException {

		PreparedStatement rcvIssuePS = null;			// [�ۊǋ�ʓ��o��](�������)�Ǎ��p�X�e�[�g�����g
		ResultSet rcvIssueRS = null;					// [�ۊǋ�ʓ��o��](�������)�i�[�p�f�[�^�Z�b�g
		PreparedStatement odPS = null;					// [���v��]�Ǎ��p�X�e�[�g�����g
		ResultSet odRS = null;							// [���v��]�i�[�p�f�[�^�Z�b�g
		PreparedStatement itemStockPS = null;			// [�ۊǋ�ʕi�ڍ݌�]�Ǎ��p�X�e�[�g�����g
		ResultSet itemStockRS = null;					// [�ۊǋ�ʕi�ڍ݌�]�i�[�p�f�[�^�Z�b�g
		PreparedStatement lotStockPS = null;			// [���b�g�ʕi�ڍ݌�]�Ǎ��p�X�e�[�g�����g
		ResultSet lotStockRS = null;					// [���b�g�ʕi�ڍ݌�]�i�[�p�f�[�^�Z�b�g
		PreparedStatement jobOdrCdStockPS = null;		// [�ۊǋ�ʐ��ԍ݌�]�Ǎ��p�X�e�[�g�����g
		ResultSet jobOdrCdStockRS = null;				// [�ۊǋ�ʐ��ԍ݌�]�i�[�p�f�[�^�Z�b�g
		PreparedStatement previousRcvIssuePS = null;	// [�ۊǋ�ʓ��o��](�O�����)�Ǎ��p�X�e�[�g�����g
		ResultSet previousRcvIssueRS = null;			// [�ۊǋ�ʓ��o��](�O�����)�i�[�p�X�e�[�g�����g
		PreparedStatement rcvIssuePS1 = null;
		ResultSet rcvIssueRS1 = null;
// 2007.09.28 add start
		PreparedStatement rlsdPuchOdrPS = null;			// [�����c]�Ǎ��p�X�e�[�g�����g
		ResultSet rlsdPuchOdrRS = null;					// [�����c]�i�[�p�f�[�^�Z�b�g
		PreparedStatement acptRsltPS = null;			// [�������]�Ǎ��p�X�e�[�g�����g
		ResultSet acptRsltRS = null;					// [�������]�i�[�p�f�[�^�Z�b�g
		PreparedStatement insertRcvIssuePS = null;		// [�ۊǋ�ʓ��o��]�҂��ۊǋ�o�ɓo�^�p�X�e�[�g�����g

		int sqlResult;
// 2007.09.28 add end

		// �ޔ�p���o�ɐ�
		String saveRcvIssueQty = "";

		try {
			// �ۊǋ�ʓ��o�ɂ��������A�����ɕK�v�ȃf�[�^���擾
			rcvIssuePS = this.conn.getConn().prepareStatement(this.selectRcvIssueSql);
			rcvIssuePS.setString(1, rcvIssueCtrlCd);
			rcvIssueRS = rcvIssuePS.executeQuery();
			// �ۊǋ�ʓ��o�ɂ����݂��Ȃ��ꍇ�͏����I��
			if (!rcvIssueRS.next()) {
				return true;
			}

// 2007.09.28 del start
//			// ���ɏ����Ώۂ��ł��邩�`�F�b�N
//			if (!"1".equals(rcvIssueRS.getString("RCV_ISSUE_TYP"))
//				|| !"11".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
//				return true;
//			}
// 2007.09.28 del end

// 2007.09.28 add strat
			// ���ɋ敪��1(����)�ȊO�̏ꍇ�͏����I��
			if(!"1".equals(rcvIssueRS.getString("RCV_ISSUE_TYP"))) {
				return true;
			}
			// ���o�ɔ����敪��11(�ʏ����)�A15(�҂��ۊǋ����)�A17(�����ςݓ���)�ȊO�̏ꍇ�����I��
			if(!"11".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))
			&& !"15".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))
			&& !"17".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
				return true;
			}
// 2007.09.28 add end

			// �ۊǋ�R�[�h��NULL�̏ꍇ�͏����I��
			if (rcvIssueRS.getString("WH_CD") == null) {
				return true;
			}

			// ���v�ʌ���
			odPS = this.conn.getConn().prepareStatement(this.selectOdSql);
			odPS.setString(1, rcvIssueRS.getString("OD_NO"));
			odPS.setString(2, rcvIssueRS.getString("PLANT_CD"));
			odRS = odPS.executeQuery();
			// ���v�ʂ����݂��Ȃ��ꍇ�͏����I��
			if (!odRS.next()) {
				return true;
			}

			// [���v��]�i�ڎ�z�敪��8(�^���i��)�̏ꍇ�͏����I��
			if ("8".equals(odRS.getString("MRP_ODR_TYP"))) {
				return true;
			}

// 2007.09.28 add start
			// [�ۊǋ�ʓ��o��]���o�ɔ����敪��17(�����ςݓ���)�̏ꍇ�͑҂��ۊǋ�o�ɏ������s��
			if("17".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
				// [�����c]����
				rlsdPuchOdrPS = this.conn.getConn().prepareStatement(this.selectRlsdPuchOdrSql);
				rlsdPuchOdrPS.setString(1, rcvIssueRS.getString("PUCH_ODR_CD"));
				rlsdPuchOdrRS = rlsdPuchOdrPS.executeQuery();
				// [�����c]�����݂��Ȃ��ꍇ�͏����I��
				if(!rlsdPuchOdrRS.next()) {
					return true;
				}

				// [�������]����
				acptRsltPS = this.conn.getConn().prepareStatement(this.selectAcptRsltSql);
				acptRsltPS.setString(1, rcvIssueRS.getString("PUCH_ODR_CD"));
				acptRsltPS.setString(2, rcvIssueRS.getString("ACPT_NO"));
				acptRsltRS = acptRsltPS.executeQuery();
				// [�������]�����݂��Ȃ��ꍇ�͏����I��
				if(!acptRsltRS.next()) {
					return true;
				}

				// ���o�ɊǗ��ԍ��̔�
				String issueRcvIssueCtrlCd = this.getNumberingRcvIssueCtrlCd();
				// [�ۊǋ�ʓ��o��]�҂��ۊǋ�o�Ƀf�[�^�쐬
				insertRcvIssuePS = this.conn.getConn().prepareStatement(this.insertRcvIssueSql);
				insertRcvIssuePS.setString(1,  issueRcvIssueCtrlCd);							// �̔Ԃ������o�ɊǗ��ԍ�
				insertRcvIssuePS.setString(2,  "2");											// ���ɋ敪(2:�o��)
				insertRcvIssuePS.setString(3,  rcvIssueRS.getString("ITEM_CD"));				// �i�ڔԍ�
				insertRcvIssuePS.setString(4,  rcvIssueRS.getString("PLANT_CD"));				// �H��R�[�h
				insertRcvIssuePS.setString(5,  acptRsltRS.getString("INSPC_WH_CD"));			// �����҂��ۊǋ�
				insertRcvIssuePS.setString(6,  rcvIssueRS.getString("JOB_ODR_CD"));				// ����
				insertRcvIssuePS.setString(7,  "0");											// ���Ԏ}��
				insertRcvIssuePS.setString(8,  rcvIssueRS.getString("PUCH_ODR_CD"));			// �����ԍ�
				insertRcvIssuePS.setString(9,  rcvIssueRS.getString("ACPT_NO"));				// �����
				insertRcvIssuePS.setString(10, "0");											// ������ђ�����
				insertRcvIssuePS.setString(11, rcvIssueRS.getString("INSPEC_RSLT_CRCT_NO"));	// �������ђ�����
				insertRcvIssuePS.setString(12, rcvIssueRS.getString("WORK_ODR_CD"));			// ��ƌv��ԍ�
				insertRcvIssuePS.setString(13, rcvIssueRS.getString("WORK_IN_PROC_CD"));		// �d�|��ƃR�[�h
				insertRcvIssuePS.setString(14, rcvIssueRS.getString("PARTIAL_PRD_NO"));			// �����
				insertRcvIssuePS.setString(15, rcvIssueRS.getString("OPR_RSLT_CRCT_NO"));		// ��Ǝ��ђ�����
				insertRcvIssuePS.setString(16, null);											// �o�Ɏw���ԍ�
				insertRcvIssuePS.setString(17, Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));	// ���o�ɐ�
				insertRcvIssuePS.setString(18, "0");											// ���o�ɋ��z
				insertRcvIssuePS.setString(19, rcvIssueRS.getString("RCV_ISSUE_DATE"));			// ���o�ɔN����
				insertRcvIssuePS.setString(20, "25");											// ���o�ɔ����敪(25:�҂��ۊǋ�o��)
				insertRcvIssuePS.setString(21, "0");											// ���o�ɒ[��
				insertRcvIssuePS.setString(22, null);											// ���o�ɕs�Ǘ��R�R�[�h
				insertRcvIssuePS.setString(23, "1");											// �݌ɍX�V�t���O
				if("9".equals(rlsdPuchOdrRS.getString("PUCH_ODR_STS_TYP"))
				&& "1".equals(rlsdPuchOdrRS.getString("INSPC_CMPLT_FLG"))){
					insertRcvIssuePS.setString(24, "1");										// ���o�Ɋ����t���O(1:����)
				} else {
					insertRcvIssuePS.setString(24, "0");										// ���o�Ɋ����t���O(0:��)
				}
				insertRcvIssuePS.setString(25, rcvIssueRS.getString("OD_NO"));					// �I�[�_�f�}���h�ԍ�
				insertRcvIssuePS.setString(26, rcvIssueRS.getString("VEND_LOT_NO"));			// ���[�J���b�g�ԍ�
				insertRcvIssuePS.setString(27, null);											// ���o�ɔ��l
				insertRcvIssuePS.setString(28, rcvIssueRS.getString("COMPANY_CD"));				// ��ЃR�[�h
				insertRcvIssuePS.setString(29, rcvIssueRS.getString("VEND_CD"));				// �����R�[�h
				insertRcvIssuePS.setString(30, "0");											// �x���敪
				insertRcvIssuePS.setString(31, null);											// �L���x�����ђ��o��
				insertRcvIssuePS.setString(32, this.sysUserCd);									// �쐬��
				insertRcvIssuePS.setString(33, this.sysBusinessId);								// �쐬�v���O������
				insertRcvIssuePS.setString(34, this.sysUserCd);									// �X�V��
				insertRcvIssuePS.setString(35, this.sysBusinessId);								// �X�V�v���O������
				insertRcvIssuePS.setString(36, rcvIssueRS.getString("LOT_NO"));				    // ���b�g�ԍ�
				sqlResult = insertRcvIssuePS.executeUpdate();

				// [�ۊǋ�ʓ��o��]���Ԃ�NULL�̏ꍇ
				if(rcvIssueRS.getString("JOB_ODR_CD") == null) {

					// [�ۊǋ�ʕi�ڍ݌�]����
					itemStockPS = this.conn.getConn().prepareStatement(this.selectItemStockSql);
					itemStockPS.setString(1, rcvIssueRS.getString("ITEM_CD"));
					itemStockPS.setString(2, acptRsltRS.getString("INSPC_WH_CD"));
					itemStockPS.setString(3, rcvIssueRS.getString("PLANT_CD"));
					itemStockRS = itemStockPS.executeQuery();
					if (itemStockRS.next()) {
						// ���o�ɐ���ޔ�
						saveRcvIssueQty = itemStockRS.getString("STOCK_ON_HAND_QTY");

						// �ۊǋ�ʕi�ڍ݌ɂ̍X�V
						this.updateItemStock(
							rcvIssueRS.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRS.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
					} else {
						// ���o�ɐ���ޔ�(�Ȃ�����O)
						saveRcvIssueQty = "0";

						// �ۊǋ�ʕi�ڍ݌ɂ̓o�^
						this.insertItemStock(
							rcvIssueRS.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRS.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
					}
					if (rcvIssueRS.getString("LOT_NO") != null) {
						//���b�g�ʕi�ڍ݌ɂ̍X�V
						// [���b�g�ʕi�ڍ݌�]����
						lotStockPS = this.conn.getConn().prepareStatement(this.selectTLotStockSql);
						lotStockPS.setString(1, rcvIssueRS.getString("ITEM_CD"));
						lotStockPS.setString(2, acptRsltRS.getString("INSPC_WH_CD"));
						lotStockPS.setString(3, rcvIssueRS.getString("LOT_NO"));
						lotStockRS = lotStockPS.executeQuery();
						if (lotStockRS.next()) {
							// ���b�g�ʕi�ڍ݌ɂ̍X�V
							this.updateTLotStock(
								rcvIssueRS.getString("ITEM_CD"),
								acptRsltRS.getString("INSPC_WH_CD"),
								rcvIssueRS.getString("LOT_NO"),
								Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1")));
						} else {
							// ���b�g�ʕi�ڍ݌ɂ̓o�^
							this.insertTLotStock(
								rcvIssueRS.getString("ITEM_CD"),
								acptRsltRS.getString("INSPC_WH_CD"),
								rcvIssueRS.getString("LOT_NO"),
								rcvIssueRS.getString("PLANT_CD"),
								Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
						}
					}
				// [�ۊǋ�ʓ��o��]���Ԃ�NULL�ȊO�̏ꍇ
				} else {

					// [�ۊǋ�ʐ��ԍ݌�]����
					jobOdrCdStockPS = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
					jobOdrCdStockPS.setString(1, rcvIssueRS.getString("JOB_ODR_CD"));
					jobOdrCdStockPS.setString(2, rcvIssueRS.getString("JOB_ODR_DETAIL_NO"));
					jobOdrCdStockPS.setString(3, rcvIssueRS.getString("ITEM_CD"));
					jobOdrCdStockPS.setString(4, acptRsltRS.getString("INSPC_WH_CD"));
					jobOdrCdStockPS.setString(5, rcvIssueRS.getString("PLANT_CD"));
					jobOdrCdStockRS = jobOdrCdStockPS.executeQuery();
					if (jobOdrCdStockRS.next()) {
						// ���o�ɐ���ޔ�
						saveRcvIssueQty = jobOdrCdStockRS.getString("STOCK_ON_HAND_QTY");

						// �ۊǋ�ʐ��ԍ݌ɂ̍X�V
						this.updateJobOdrCdStock(
							rcvIssueRS.getString("JOB_ODR_CD"),
							rcvIssueRS.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRS.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRS.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
					} else {
						// ���o�ɐ���ޔ�(�Ȃ�����O)
						saveRcvIssueQty = "0";

						// �ۊǋ�ʐ��ԍ݌ɂ̓o�^
						this.insertJobOdrCdStock(
							rcvIssueRS.getString("JOB_ODR_CD"),
							rcvIssueRS.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRS.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRS.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRS.getString("RCV_ISSUE_QTY"), "-1"));
					}
				}

				// �ۊǋ�ʓ��o�ɂ̍X�V
				this.updateRcvIssue(issueRcvIssueCtrlCd, saveRcvIssueQty);
				saveRcvIssueQty = "0";

			}
// 2007.09.28 add end

			// ���Ԃ��`�F�b�N���āA�i�ڍ݌ɂ����ԍ݌ɂ��X�V����B
			if (rcvIssueRS.getString("JOB_ODR_CD") == null) {
				// ���R�[�h�̑��݃`�F�b�N
				itemStockPS = this.conn.getConn().prepareStatement(this.selectItemStockSql);
				itemStockPS.setString(1, rcvIssueRS.getString("ITEM_CD"));
				itemStockPS.setString(2, rcvIssueRS.getString("WH_CD"));
				itemStockPS.setString(3, rcvIssueRS.getString("PLANT_CD"));
				itemStockRS = itemStockPS.executeQuery();
				if (itemStockRS.next()) {
					// ���o�ɐ���ޔ�
					saveRcvIssueQty = itemStockRS.getString("STOCK_ON_HAND_QTY");

					// �ۊǋ�ʕi�ڍ݌ɂ̍X�V
					this.updateItemStock(
						rcvIssueRS.getString("ITEM_CD"),
						rcvIssueRS.getString("WH_CD"),
						rcvIssueRS.getString("PLANT_CD"),
						rcvIssueRS.getString("RCV_ISSUE_QTY"));
				} else {
					// ���o�ɐ���ޔ�(�Ȃ�����O)
					saveRcvIssueQty = "0";

					// �ۊǋ�ʕi�ڍ݌ɂ̓o�^
					this.insertItemStock(
						rcvIssueRS.getString("ITEM_CD"),
						rcvIssueRS.getString("WH_CD"),
						rcvIssueRS.getString("PLANT_CD"),
						rcvIssueRS.getString("RCV_ISSUE_QTY"));
				}
                if(rcvIssueRS.getString("LOT_NO") != null){
					//���b�g�ʕi�ڍ݌ɂ̍X�V
					// [���b�g�ʕi�ڍ݌�]����
					lotStockPS = this.conn.getConn().prepareStatement(this.selectTLotStockSql);
					lotStockPS.setString(1, rcvIssueRS.getString("ITEM_CD"));
					lotStockPS.setString(2, rcvIssueRS.getString("WH_CD"));
					lotStockPS.setString(3, rcvIssueRS.getString("LOT_NO"));
					lotStockRS = lotStockPS.executeQuery();
					if (lotStockRS.next()) {
						if (Calculate.compare(Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),rcvIssueRS.getString("RCV_ISSUE_QTY")),"0") < 0){
							_errorList.add("AE20606");
						}
						// ���b�g�ʕi�ڍ݌ɂ̍X�V
						this.updateTLotStock(
							rcvIssueRS.getString("ITEM_CD"),
							rcvIssueRS.getString("WH_CD"),
							rcvIssueRS.getString("LOT_NO"),
							Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),rcvIssueRS.getString("RCV_ISSUE_QTY")));
					} else {
						if (Calculate.compare(rcvIssueRS.getString("RCV_ISSUE_QTY"),"0") < 0){
							_errorList.add("AE20606");
						}
						// ���b�g�ʕi�ڍ݌ɂ̓o�^
						this.insertTLotStock(
							rcvIssueRS.getString("ITEM_CD"),
							rcvIssueRS.getString("WH_CD"),
							rcvIssueRS.getString("LOT_NO"),
							rcvIssueRS.getString("PLANT_CD"),
							rcvIssueRS.getString("RCV_ISSUE_QTY"));
					}
                }
			} else {
				// ���R�[�h�̑��݃`�F�b�N
				jobOdrCdStockPS = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
				jobOdrCdStockPS.setString(1, rcvIssueRS.getString("JOB_ODR_CD"));
				jobOdrCdStockPS.setString(2, rcvIssueRS.getString("JOB_ODR_DETAIL_NO"));
				jobOdrCdStockPS.setString(3, rcvIssueRS.getString("ITEM_CD"));
				jobOdrCdStockPS.setString(4, rcvIssueRS.getString("WH_CD"));
				jobOdrCdStockPS.setString(5, rcvIssueRS.getString("PLANT_CD"));
				jobOdrCdStockRS = jobOdrCdStockPS.executeQuery();
				if (jobOdrCdStockRS.next()) {
					// ���o�ɐ���ޔ�
					saveRcvIssueQty = jobOdrCdStockRS.getString("STOCK_ON_HAND_QTY");

					// �ۊǋ�ʐ��ԍ݌ɂ̍X�V
					this.updateJobOdrCdStock(
						rcvIssueRS.getString("JOB_ODR_CD"),
						rcvIssueRS.getString("JOB_ODR_DETAIL_NO"),
						rcvIssueRS.getString("ITEM_CD"),
						rcvIssueRS.getString("WH_CD"),
						rcvIssueRS.getString("PLANT_CD"),
						rcvIssueRS.getString("RCV_ISSUE_QTY"));
				} else {
					// ���o�ɐ���ޔ�(�Ȃ�����O)
					saveRcvIssueQty = "0";

					// �ۊǋ�ʐ��ԍ݌ɂ̓o�^
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
			// ���o�ɔ����敪��15(�҂��ۊǋ����)�ȊO�̏ꍇ�ɏ��v�ʂƐ��Ԍv��̍X�V���s��
			if(!"15".equals(rcvIssueRS.getString("RCV_ISSUE_GNR_TYP"))) {
// 2007.09.28 add end

				// ���v�ʂ̍X�V
				CommonOd co =
					new CommonOd(this.conn, this.sysPlantCd, this.sysUserCd, this.sysBusinessId);
				double rcvIssueQty =
					new BigDecimal(rcvIssueRS.getString("RCV_ISSUE_QTY")).doubleValue();
				co.updateOrderForReceive(rcvIssueRS.getString("OD_NO"), rcvIssueQty, -1);

				// ���Ԍv��̍X�V
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

			// �ۊǋ�ʓ��o�ɂ̍X�V
			this.updateRcvIssue(rcvIssueCtrlCd, saveRcvIssueQty);
			saveRcvIssueQty = "";

			// ���Ɏ������
			previousRcvIssuePS = null;
			previousRcvIssueRS = null;
			if ((rcvIssueRS.getString("PUCH_ODR_CD") == null)
				&& (Calculate.compare(rcvIssueRS.getString("OPR_RSLT_CRCT_NO"), "0") > 0)) {

				// �O����Ɏ��т̌���
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

			// ���Ɏ���p�̓��o�ɊǗ��ԍ����ٔ�
			String cancelRcvIssueCtrlCd = this.getNumberingRcvIssueCtrlCd();
			// ���Ɏ���f�[�^��o�^
			this.insertCancelRcvIssue(
				previousRcvIssueRS.getString("RCV_ISSUE_CTRL_CD"),
				cancelRcvIssueCtrlCd);
            // �ۊǋ�ʓ��o�ɂ��������A�����ɕK�v�ȃf�[�^���擾
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
	 * �ۊǋ�ʓ��o�Ƀe�[�u���Ƀf�[�^��o�^���A�莝�݌ɐ����X�V���܂��B
	 * @param cancelRcvIssueCtrlCd ���o�ɊǗ��ԍ�
	 * @return �݌ɂ�����Ȃ��ꍇfalse
	 * @throws ParseException String��Date�ϊ��Ɏ��s�����ꍇ
	 * @throws ApsComException ���v�ʍX�V�Ɏ��s�����ꍇ
	 * @throws SQLException DB�X�V�G���[����throw����܂��B
	 */
	public boolean addCancelRcvIssue(String cancelRcvIssueCtrlCd)
		throws ApsComException, FoundationException, SQLException {

		PreparedStatement rcvIssuePs = null;
		ResultSet rcvIssueRs = null;
		PreparedStatement odPs = null;
		ResultSet odRs = null;
		PreparedStatement itemStockPs = null;
		ResultSet itemStockRs = null;
		PreparedStatement lotStockPS = null;			// [���b�g�ʕi�ڍ݌�]�Ǎ��p�X�e�[�g�����g
		ResultSet lotStockRS = null;					// [���b�g�ʕi�ڍ݌�]�i�[�p�f�[�^�Z�b�g
		PreparedStatement jobOdrCdStockPs = null;
		ResultSet jobOdrCdStockRs = null;
		PreparedStatement jobOdrPs = null;
		ResultSet jobOdrRs = null;
		PreparedStatement jobOdrCdStockAllWhPs = null;
		ResultSet jobOdrCdStockAllWhRs = null;
		PreparedStatement jobOdrAlcPs = null;
		ResultSet jobOdrAlcRs = null;
// 2007.09.28 add start
		PreparedStatement rlsdPuchOdrPS = null;			// [�����c]�Ǎ��p�X�e�[�g�����g
		ResultSet rlsdPuchOdrRS = null;					// [�����c]�i�[�p�f�[�^�Z�b�g
		PreparedStatement acptRsltPS = null;			// [�������]�Ǎ��p�X�e�[�g�����g
		ResultSet acptRsltRS = null;					// [�������]�i�[�p�f�[�^�Z�b�g
		PreparedStatement insertRcvIssuePS = null;		// [�ۊǋ�ʓ��o��]�҂��ۊǋ�o�ɓo�^�p�X�e�[�g�����g

		int sqlResult;
// 2007.09.28 add end

		// �ޔ�p�莝���݌ɐ�
		String saveRcvIssueQty = "";

		try {
			// ���Ɏ���f�[�^���擾
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
				// ���R�[�h�̑��݃`�F�b�N
				itemStockPs = this.conn.getConn().prepareStatement(this.selectItemStockSql);
				itemStockPs.setString(1, rcvIssueRs.getString("ITEM_CD"));
				itemStockPs.setString(2, rcvIssueRs.getString("WH_CD"));
				itemStockPs.setString(3, rcvIssueRs.getString("PLANT_CD"));
				itemStockRs = itemStockPs.executeQuery();
				if (itemStockRs.next()) {
					// ���o�ɐ���ޔ�
					saveRcvIssueQty = itemStockRs.getString("STOCK_ON_HAND_QTY");

					// �ۊǋ�ʕi�ڍ݌ɂ̍X�V
					this.updateItemStock(
						rcvIssueRs.getString("ITEM_CD"),
						rcvIssueRs.getString("WH_CD"),
						rcvIssueRs.getString("PLANT_CD"),
						rcvIssueRs.getString("RCV_ISSUE_QTY"));
				} else {
					// ���o�ɐ���ޔ�(�Ȃ�����O)
					saveRcvIssueQty = "0";

					// �ۊǋ�ʕi�ڍ݌ɂ̓o�^
					this.insertItemStock(
						rcvIssueRs.getString("ITEM_CD"),
						rcvIssueRs.getString("WH_CD"),
						rcvIssueRs.getString("PLANT_CD"),
						rcvIssueRs.getString("RCV_ISSUE_QTY"));
				}
				//���b�g�Ǘ��i�ڂ̍݌ɍX�V
                if(rcvIssueRs.getString("LOT_NO") != null){
					//���b�g�ʕi�ڍ݌ɂ̍X�V
					// [���b�g�ʕi�ڍ݌�]����
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
						// ���b�g�ʕi�ڍ݌ɂ̍X�V
						this.updateTLotStock(
							rcvIssueRs.getString("ITEM_CD"),
							rcvIssueRs.getString("WH_CD"),
							rcvIssueRs.getString("LOT_NO"),
							Calculate.add(lotStockRS.getString("STOCK_ON_HAND_QTY"),
									rcvIssueRs.getString("RCV_ISSUE_QTY")));
					} else {
						_errorList.add("AE20606");
/*						// ���b�g�ʕi�ڍ݌ɂ̓o�^
						this.insertTLotStock(
							rcvIssueRs.getString("ITEM_CD"),
							rcvIssueRs.getString("WH_CD"),
							rcvIssueRs.getString("LOT_NO"),
							rcvIssueRs.getString("PLANT_CD"),
							rcvIssueRs.getString("RCV_ISSUE_QTY"));*/
					}
                }
			} else {
				// ���Ɏ���\��
				String cancelableReceiveQty = null;
				String odrQty = null;
				String totalRcvQty = null;
				String SumStockOnHandQty = null;
				String SumNonIssueAlcdQty = null;

				if(!"16".equals(rcvIssueRs.getString("RCV_ISSUE_GNR_TYP"))) {
					// ���o�ɉ\���`�F�b�N
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

					// �莝���݌ɐ���ޔ�
					saveRcvIssueQty = jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY");

					// ���o�ɉ\�������߂�
					if ("2".equals(jobOdrRs.getString("JOB_ODR_TYP"))
						&& "0".equals(odRs.getString("JOB_ODR_CANCEL_NO"))
						&& odRs.getString("PARENT_OD_NO") == null) {
						// ���ԍ݌Ɂi�e�j�̏ꍇ
						cancelableReceiveQty = Calculate.subtract(odrQty, totalRcvQty);
						cancelableReceiveQty = Calculate.add(cancelableReceiveQty, SumStockOnHandQty);
						cancelableReceiveQty =
							Calculate.subtract(cancelableReceiveQty, SumNonIssueAlcdQty);
					} else {
						// ���ԍ݌Ɂi�q�j�̏ꍇ
						cancelableReceiveQty =
							Calculate.subtract(SumStockOnHandQty, SumNonIssueAlcdQty);
					}
					if (Calculate
						.compare(cancelableReceiveQty, jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY"))
						> 0) {
						cancelableReceiveQty = jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY");
					}

					// ���o�ɉ\���`�F�b�N
					if (Calculate
						.compare(rcvIssueRs.getString("JOB_ODR_DETAIL_NO"), cancelableReceiveQty)
						> 0) {
						return false;
					}

					// �ۊǋ�ʐ��ԍ݌ɂ̍X�V
					this.updateJobOdrCdStock(
						rcvIssueRs.getString("JOB_ODR_CD"),
						rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
						rcvIssueRs.getString("ITEM_CD"),
						rcvIssueRs.getString("WH_CD"),
						rcvIssueRs.getString("PLANT_CD"),
						rcvIssueRs.getString("RCV_ISSUE_QTY"));

				} else {
					// ���ԍ݌Ɍ���
					jobOdrCdStockPs = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
					jobOdrCdStockPs.setString(1, rcvIssueRs.getString("JOB_ODR_CD"));
					jobOdrCdStockPs.setString(2, rcvIssueRs.getString("JOB_ODR_DETAIL_NO"));
					jobOdrCdStockPs.setString(3, rcvIssueRs.getString("ITEM_CD"));
					jobOdrCdStockPs.setString(4, rcvIssueRs.getString("WH_CD"));
					jobOdrCdStockPs.setString(5, rcvIssueRs.getString("PLANT_CD"));
					jobOdrCdStockRs = jobOdrCdStockPs.executeQuery();

					if (jobOdrCdStockRs.next()) {
						// �莝���݌ɐ���ޔ�
						saveRcvIssueQty = jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY");

						// �ۊǋ�ʐ��ԍ݌ɂ̍X�V
						this.updateJobOdrCdStock(
							rcvIssueRs.getString("JOB_ODR_CD"),
							rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRs.getString("ITEM_CD"),
							rcvIssueRs.getString("WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							rcvIssueRs.getString("RCV_ISSUE_QTY"));
					} else {
						saveRcvIssueQty = "0";

						// �ۊǋ�ʐ��ԍ݌ɂ̓o�^
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
				// ���v�ʂ̍X�V
				CommonOd co =
					new CommonOd(this.conn, this.sysPlantCd, this.sysUserCd, this.sysBusinessId);
				double rcvIssueQty =
					new BigDecimal(rcvIssueRs.getString("RCV_ISSUE_QTY")).doubleValue();
				co.updateOrderForReceive(rcvIssueRs.getString("OD_NO"), rcvIssueQty, -1);
			}

			// �ۊǋ�ʓ��o�ɂ̍X�V
			this.updateRcvIssue(cancelRcvIssueCtrlCd, saveRcvIssueQty);
			saveRcvIssueQty = "";

// 2007.09.28 add start
			// [�ۊǋ�ʓ��o��]���o�ɔ����敪��18(�����ςݓ��Ɏ��)�̏ꍇ�͑҂��ۊǋ�o�ɏ������s��
			if("18".equals(rcvIssueRs.getString("RCV_ISSUE_GNR_TYP"))) {
				// [�����c]����
				rlsdPuchOdrPS = this.conn.getConn().prepareStatement(this.selectRlsdPuchOdrSql);
				rlsdPuchOdrPS.setString(1, rcvIssueRs.getString("PUCH_ODR_CD"));
				rlsdPuchOdrRS = rlsdPuchOdrPS.executeQuery();
				// [�����c]�����݂��Ȃ��ꍇ�͏����I��
				if(!rlsdPuchOdrRS.next()) {
					return true;
				}

				// [�������]����
				acptRsltPS = this.conn.getConn().prepareStatement(this.selectAcptRsltSql);
				acptRsltPS.setString(1, rcvIssueRs.getString("PUCH_ODR_CD"));
				acptRsltPS.setString(2, rcvIssueRs.getString("ACPT_NO"));
				acptRsltRS = acptRsltPS.executeQuery();
				// [�������]�����݂��Ȃ��ꍇ�͏����I��
				if(!acptRsltRS.next()) {
					return true;
				}

				// ���o�ɊǗ��ԍ��̔�
				String issueRcvIssueCtrlCd = this.getNumberingRcvIssueCtrlCd();
				// [�ۊǋ�ʓ��o��]�҂��ۊǋ�o�Ƀf�[�^�쐬
				insertRcvIssuePS = this.conn.getConn().prepareStatement(this.insertRcvIssueSql);
				insertRcvIssuePS.setString(1,  issueRcvIssueCtrlCd);							// �̔Ԃ������o�ɊǗ��ԍ�
				insertRcvIssuePS.setString(2,  "2");											// ���ɋ敪(2:�o��)
				insertRcvIssuePS.setString(3,  rcvIssueRs.getString("ITEM_CD"));				// �i�ڔԍ�
				insertRcvIssuePS.setString(4,  rcvIssueRs.getString("PLANT_CD"));				// �H��R�[�h
				insertRcvIssuePS.setString(5,  acptRsltRS.getString("INSPC_WH_CD"));			// �����҂��ۊǋ�
				insertRcvIssuePS.setString(6,  rcvIssueRs.getString("JOB_ODR_CD"));				// ����
				insertRcvIssuePS.setString(7,  "0");											// ���Ԏ}��
				insertRcvIssuePS.setString(8,  rcvIssueRs.getString("PUCH_ODR_CD"));			// �����ԍ�
				insertRcvIssuePS.setString(9,  rcvIssueRs.getString("ACPT_NO"));				// �����
				insertRcvIssuePS.setString(10, "0");											// ������ђ�����
				insertRcvIssuePS.setString(11, rcvIssueRs.getString("INSPEC_RSLT_CRCT_NO"));	// �������ђ�����
				insertRcvIssuePS.setString(12, rcvIssueRs.getString("WORK_ODR_CD"));			// ��ƌv��ԍ�
				insertRcvIssuePS.setString(13, rcvIssueRs.getString("WORK_IN_PROC_CD"));		// �d�|��ƃR�[�h
				insertRcvIssuePS.setString(14, rcvIssueRs.getString("PARTIAL_PRD_NO"));			// �����
				insertRcvIssuePS.setString(15, rcvIssueRs.getString("OPR_RSLT_CRCT_NO"));		// ��Ǝ��ђ�����
				insertRcvIssuePS.setString(16, null);											// �o�Ɏw���ԍ�
				insertRcvIssuePS.setString(17, Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));	// ���o�ɐ�
				insertRcvIssuePS.setString(18, "0");											// ���o�ɋ��z
				insertRcvIssuePS.setString(19, rcvIssueRs.getString("RCV_ISSUE_DATE"));			// ���o�ɔN����
				insertRcvIssuePS.setString(20, "26");											// ���o�ɔ����敪(26:�҂��ۊǋ�o�Ɏ��)
				insertRcvIssuePS.setString(21, "0");											// ���o�ɒ[��
				insertRcvIssuePS.setString(22, null);											// ���o�ɕs�Ǘ��R�R�[�h
				insertRcvIssuePS.setString(23, "1");											// �݌ɍX�V�t���O
				if("9".equals(rlsdPuchOdrRS.getString("PUCH_ODR_STS_TYP"))
				&& "1".equals(rlsdPuchOdrRS.getString("INSPC_CMPLT_FLG"))){
					insertRcvIssuePS.setString(24, "1");										// ���o�Ɋ����t���O(1:����)
				} else {
					insertRcvIssuePS.setString(24, "0");										// ���o�Ɋ����t���O(0:��)
				}
				insertRcvIssuePS.setString(25, rcvIssueRs.getString("OD_NO"));					// �I�[�_�f�}���h�ԍ�
				insertRcvIssuePS.setString(26, rcvIssueRs.getString("VEND_LOT_NO"));			// ���[�J���b�g�ԍ�
				insertRcvIssuePS.setString(27, null);											// ���o�ɔ��l
				insertRcvIssuePS.setString(28, rcvIssueRs.getString("COMPANY_CD"));				// ��ЃR�[�h
				insertRcvIssuePS.setString(29, rcvIssueRs.getString("VEND_CD"));				// �����R�[�h
				insertRcvIssuePS.setString(30, "0");											// �x���敪
				insertRcvIssuePS.setString(31, null);											// �L���x�����ђ��o��
				insertRcvIssuePS.setString(32, this.sysUserCd);									// �쐬��
				insertRcvIssuePS.setString(33, this.sysBusinessId);								// �쐬�v���O������
				insertRcvIssuePS.setString(34, this.sysUserCd);									// �X�V��
				insertRcvIssuePS.setString(35, this.sysBusinessId);								// �X�V�v���O������
				insertRcvIssuePS.setString(36, rcvIssueRs.getString("LOT_NO"));				    // ���b�g�ԍ�
				sqlResult = insertRcvIssuePS.executeUpdate();

				// [�ۊǋ�ʓ��o��]���Ԃ�NULL�̏ꍇ
				if(rcvIssueRs.getString("JOB_ODR_CD") == null) {

					// [�ۊǋ�ʕi�ڍ݌�]����
					itemStockPs = this.conn.getConn().prepareStatement(this.selectItemStockSql);
					itemStockPs.setString(1, rcvIssueRs.getString("ITEM_CD"));
					itemStockPs.setString(2, acptRsltRS.getString("INSPC_WH_CD"));
					itemStockPs.setString(3, rcvIssueRs.getString("PLANT_CD"));
					itemStockRs = itemStockPs.executeQuery();
					if (itemStockRs.next()) {
						// ���o�ɐ���ޔ�
						saveRcvIssueQty = itemStockRs.getString("STOCK_ON_HAND_QTY");

						// �ۊǋ�ʕi�ڍ݌ɂ̍X�V
						this.updateItemStock(
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
					} else {
						// ���o�ɐ���ޔ�(�Ȃ�����O)
						saveRcvIssueQty = "0";

						// �ۊǋ�ʕi�ڍ݌ɂ̓o�^
						this.insertItemStock(
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
					}
					//���b�g�Ǘ�
					if (rcvIssueRs.getString("LOT_NO") != null) {
						//���b�g�ʕi�ڍ݌ɂ̍X�V
						// [���b�g�ʕi�ڍ݌�]����
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
							// ���b�g�ʕi�ڍ݌ɂ̍X�V
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
							// ���b�g�ʕi�ڍ݌ɂ̓o�^
							this.insertTLotStock(
								rcvIssueRs.getString("ITEM_CD"),
								acptRsltRS.getString("INSPC_WH_CD"),
								rcvIssueRs.getString("LOT_NO"),
								rcvIssueRs.getString("PLANT_CD"),
								Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
						}
					}
				// [�ۊǋ�ʓ��o��]���Ԃ�NULL�ȊO�̏ꍇ
				} else {

					// [�ۊǋ�ʐ��ԍ݌�]����
					jobOdrCdStockPs = this.conn.getConn().prepareStatement(this.selectJobOdrCdStockSql);
					jobOdrCdStockPs.setString(1, rcvIssueRs.getString("JOB_ODR_CD"));
					jobOdrCdStockPs.setString(2, rcvIssueRs.getString("JOB_ODR_DETAIL_NO"));
					jobOdrCdStockPs.setString(3, rcvIssueRs.getString("ITEM_CD"));
					jobOdrCdStockPs.setString(4, acptRsltRS.getString("INSPC_WH_CD"));
					jobOdrCdStockPs.setString(5, rcvIssueRs.getString("PLANT_CD"));
					jobOdrCdStockRs = jobOdrCdStockPs.executeQuery();
					if (jobOdrCdStockRs.next()) {
						// ���o�ɐ���ޔ�
						saveRcvIssueQty = jobOdrCdStockRs.getString("STOCK_ON_HAND_QTY");

						// �ۊǋ�ʐ��ԍ݌ɂ̍X�V
						this.updateJobOdrCdStock(
							rcvIssueRs.getString("JOB_ODR_CD"),
							rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
					} else {
						// ���o�ɐ���ޔ�(�Ȃ�����O)
						saveRcvIssueQty = "0";

						// �ۊǋ�ʐ��ԍ݌ɂ̓o�^
						this.insertJobOdrCdStock(
							rcvIssueRs.getString("JOB_ODR_CD"),
							rcvIssueRs.getString("JOB_ODR_DETAIL_NO"),
							rcvIssueRs.getString("ITEM_CD"),
							acptRsltRS.getString("INSPC_WH_CD"),
							rcvIssueRs.getString("PLANT_CD"),
							Calculate.multiply(rcvIssueRs.getString("RCV_ISSUE_QTY"), "-1"));
					}
				}

				// �ۊǋ�ʓ��o�ɂ̍X�V
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
	 * ���o�ɊǗ��ԍ����͔Ԃ���
	 * @return ���o�ɊǗ��ԍ�
	 * @throws FoundationException �͔ԃG���[
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
	 * �ۊǋ�ʓ��o�ɂ̓o�^�i���Ɏ���j
	 * @param rcvIssueCtrlCd ���o�ɊǗ��ԍ�
	 * @param previousRcvIssueCtrlCd ����Ώۂ̓��o�ɊǗ��ԍ�
	 * @return ���U���g�Z�b�g
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
	 * �ۊǋ�ʓ��o�ɂ̍X�V
	 * @param rcvIssueCtrlCd ���o�ɊǗ��ԍ�
	 * @param saveRcvIssueQty �ޔ�p���o�ɐ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �ۊǋ�ʕi�ڍ݌ɂ̓o�^
	 * @param itemCd �i�ڔԍ�
	 * @param whCd �ۊǋ�R�[�h
	 * @param plantCd �H��R�[�h
	 * @param rcvIssueQty ���o�ɐ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �ۊǋ�ʕi�ڍ݌ɂ̍X�V
	 * @param itemCd �i�ڔԍ�
	 * @param whCd �ۊǋ�R�[�h
	 * @param plantCd �H��R�[�h
	 * @param rcvIssueQty ���o�ɐ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * ���b�g�ʕi�ڍ݌ɂ̓o�^
	 * @param itemCd �i�ڔԍ�
	 * @param whCd �ۊǋ�R�[�h
	 * @param plantCd �H��R�[�h
	 * @param rcvIssueQty ���o�ɐ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * ���b�g�ʕi�ڍ݌ɂ̍X�V
	 * @param itemCd �i�ڔԍ�
	 * @param whCd �ۊǋ�R�[�h
	 * @param plantCd �H��R�[�h
	 * @param rcvIssueQty ���o�ɐ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �ۊǋ�ʐ��ԍ݌ɂ̓o�^
	 * @param jobOdrCd ����
	 * @param JobOdrDetailNo ���Ԏ}��
	 * @param itemCd �i�ڔԍ�
	 * @param whCd �ۊǋ�R�[�h
	 * @param plantCd �H��R�[�h
	 * @param rcvIssueQty ���o�ɐ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * �ۊǋ�ʐ��ԍ݌ɂ̍X�V
	 * @param jobOdrCd ����
	 * @param JobOdrDetailNo ���Ԏ}��
	 * @param itemCd �i�ڔԍ�
	 * @param whCd �ۊǋ�R�[�h
	 * @param plantCd �H��R�[�h
	 * @param rcvIssueQty ���o�ɐ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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
	 * ���Ԍv��̍X�V
	 * @param jobOdrCd ����
	 * @param jobOdrDetailNo ���Ԏ}��
	 * @param jobOdrCancelNo ���Ԏ�������ԍ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
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