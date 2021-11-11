/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.AE0040;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * EDI関連データ登録クラス
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/09 02:26:09 $
 */
public class EdiOrder {
	/** DBアクセス用のコネクション */
	private IDbConnection conn = null;

	/** ユーザコード */
	private String sysUserCd = null;
	/** 業務ID */
	private String sysBusinessId = null;
	/** 工場コード */
	private String sysPlantCd = null;

	/** 発注算検索SQL（キーデータ取得用） */
	private String selectPuchOdrKeySql =
		"select "
			+ "  decode(T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP, 1, '0501', '0502') as INFO_TYP_CD, "
			+ "  T_RLSD_PUCH_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD as PUCH_ODR_CD "
			+ "from "
			+ "  T_RLSD_PUCH_ODR "
			+ "where "
			+ "  T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? ";

	/** 企業マスタ検索SQL（企業コード取得用） */
	private String selectPlanOdrKeySql =
		"select "
			+ "  '0201' as INFO_TYP_CD, "
			+ "  SYS_MY_COMPANY.COMPANY_CD as COMPANY_CD, "
			+ "  T_OD.OD_NO as PLAN_CD "
			+ "from "
			+ "  T_OD, "
			+ "  SYS_MY_COMPANY "
			+ "where "
			+ "  T_OD.OD_NO = ? "
			+ "  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' ";

	/** EDI所要データ検索SQL */
	private String selectEdiPlanOdrSql =
		"select "
			+ "  T_EDI_PLAN_ODR.INFO_TYP_CD as INFO_TYP_CD, "
			+ "  T_EDI_PLAN_ODR.COMPANY_CD as COMPANY_CD, "
			+ "  T_EDI_PLAN_ODR.PLAN_CD as PLAN_CD "
			+ "from "
			+ "  T_EDI_PLAN_ODR "
			+ "where "
			+ "  T_EDI_PLAN_ODR.INFO_TYP_CD = ? "
			+ "  and T_EDI_PLAN_ODR.COMPANY_CD = ? "
			+ "  and T_EDI_PLAN_ODR.PLAN_CD = ? ";
	/** EDI所要データ更新SQL */
	private String updateEdiPlanOdrSql =
		"update "
			+ "  T_EDI_PLAN_ODR "
			+ "set "
			+ "  ( "
			+ "    INFO_TYP_CD, "
			+ "    COMPANY_CD, "
			+ "    PLAN_CD, "
			+ "    DATA_PROC_CD, "
			+ "    DATA_CREATE_DATE, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    JOB_ODR_CD, "
			+ "    CRCT_TYP, "
			+ "    COCK_TYP, "
			+ "    PUCH_ODR_UNIT, "
			+ "    EDI_CONS_TYP, "
			+ "    PUCH_ODR_PERSON, "
			+ "    ITEM_SPEC, "
			+ "    ITEM_DRAW_TYP, "
			+ "    ITEM_VERSION, "
			+ "    ITEM_NAME, "
			+ "    VEND_ITEM_CD, "
			+ "    ITEM_CD, "
			+ "    ITEM_DRAW_QTY, "
			+ "    ITEM_PKG_UNIT, "
			+ "    DLV_DATE_1, "
			+ "    DLV_PLAN_QTY_1, "
			+ "    DLV_DATE_2, "
			+ "    DLV_PLAN_QTY_2, "
			+ "    DLV_DATE_3, "
			+ "    DLV_PLAN_QTY_3, "
			+ "    DLV_DATE_4, "
			+ "    DLV_PLAN_QTY_4, "
			+ "    DLV_DATE_5, "
			+ "    DLV_PLAN_QTY_5, "
			+ "    PLAN_COMMENT, "
			+ "    PLAN_DATE, "
			+ "    STD_DLV_DAYS, "
			+ "    END_USER_NAME, "
			+ "    MAKER_NAME, "
			+ "    PLAN_TERM, "
			+ "    CONTRACT_COND_TYP, "
			+ "    MACHINE_CD, "
			+ "    STRATEGIC_GOODS_TYP, "
			+ "    ODR_ORG_NAME, "
			+ "    ODR_STAFF_NAME_J, "
			+ "    ITEM_SPEC_NAME_J, "
			+ "    ITEM_NAME_J, "
			+ "    COMMENT_J, "
			+ "    END_USER_NAME_J, "
			+ "    MAKER_NAME_J, "
			+ "    MACHINE_NAME_J, "
			+ "    ODR_SPEC_J, "
			+ "    ODR_ORG_NAME_J, "
			+ "    EDI_ODR_ISS_FLG, "
			+ "    EDI_ODR_ISS_DATE, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "  = "
			+ "  ( "
			+ "    select "
			+ "      '0201' as INFO_TYP_CD, "
			+ "      SYS_MY_COMPANY.COMPANY_CD as COMPANY_CD, "
			+ "      T_OD.OD_NO as PLAN_CD, "
			+ "      0 as DATA_PROC_CD, "
			+ "      SYS_DATE_CTRL.BUSINESS_OPR_DATE as DATA_CREATE_DATE, "
			+ "      M_PUCH_UNIT_COST_H.VEND_CD as VEND_CD, "
			+ "      T_OD.PLANT_CD as PLANT_CD, "
			+ "      T_OD.JOB_ODR_CD as JOB_ODR_CD, "
			+ "      1 as CRCT_TYP, "
			+ "      1 as COCK_TYP, "
			+ "      M_ITEM.STOCK_UNIT as PUCH_ODR_UNIT, "
			+ "      1 as EDI_CONS_TYP, "
			+ "      NULL as PUCH_ODR_PERSON, "
			+ "      M_ITEM.SPEC as ITEM_SPEC, "
			+ "      1 as ITEM_DRAW_TYP, "
			+ "      NULL as ITEM_VERSION, "
			+ "      NULL as ITEM_NAME, "
			+ "      M_PUCH_UNIT_COST_H.VEND_ITEM_CD as VEND_ITEM_CD, "
			+ "      T_OD.ITEM_CD as ITEM_CD, "
			+ "      0 as ITEM_DRAW_QTY, "
			+ "      M_ITEM.PKG_UNIT as ITEM_PKG_UNIT, "
			+ "      T_OD.PRD_DUE_DATE as DLV_DATE_1, "
			+ "      T_OD.ODR_QTY as DLV_PLAN_QTY_1, "
			+ "      NULL as DLV_DATE_2, "
			+ "      0 as DLV_PLAN_QTY_2, "
			+ "      NULL as DLV_DATE_3, "
			+ "      0 as DLV_PLAN_QTY_3, "
			+ "      NULL as DLV_DATE_4, "
			+ "      0 as DLV_PLAN_QTY_4, "
			+ "      NULL as DLV_DATE_5, "
			+ "      0 as DLV_PLAN_QTY_5, "
			+ "      NULL as PLAN_COMMENT, "
			+ "      sysdate as PLAN_DATE, "
			+ "      decode(trunc((T_OD.FIXED_LT + (T_OD.PROP_LT * T_OD.ODR_QTY)) / 1000), 0, trunc((T_OD.FIXED_LT + (T_OD.PROP_LT * T_OD.ODR_QTY)) + 0.9), 999)  as STD_DLV_DAYS, "
			+ "      NULL as END_USER_NAME, "
			+ "      NULL as MAKER_NAME, "
			+ "      0 as PLAN_TERM, "
			+ "      NULL as CONTRACT_COND_TYP, "
			+ "      NULL as MACHINE_CD, "
			+ "      2 as STRATEGIC_GOODS_TYP, "
			+ "      NULL as ODR_ORG_NAME, "
			+ "      NULL as ODR_STAFF_NAME_J, "
			+ "      NULL as ITEM_SPEC_NAME_J, "
			+ "      M_ITEM.ITEM_NAME as ITEM_NAME_J, "
			+ "      NULL as COMMENT_J, "
			+ "      NULL as END_USER_NAME_J, "
			+ "      NULL as MAKER_NAME_J, "
			+ "      NULL as MACHINE_NAME_J, "
			+ "      NULL as ODR_SPEC_J, "
			+ "      NULL as ODR_ORG_NAME_J, "
			+ "      0 as EDI_ODR_ISS_FLG, "
			+ "      NULL as EDI_ODR_ISS_DATE, "
			+ "      sysdate as CREATED_DATE, "
			+ "      ? as CREATED_BY, "
			+ "      ? as CREATED_PRG_NM, "
			+ "      sysdate as UPDATED_DATE, "
			+ "      ? as UPDATED_BY, "
			+ "      ? as UPDATED_PRG_NM, "
			+ "      0 as MODIFY_COUNT "
			+ "    from "
			+ "      T_OD, "
			+ "      M_ITEM, "
			+ "      M_PUCH_UNIT_COST_H, "
			+ "      SYS_MY_COMPANY, "
			+ "      SYS_DATE_CTRL, "
			+ "      ( "
			+ "        select "
			+ "          M_PUCH_UNIT_COST_H.ITEM_CD as ITEM_CD, "
			+ "          M_PUCH_UNIT_COST_H.PLANT_CD as PLANT_CD, "
			+ "          min(M_PUCH_UNIT_COST_H.VEND_CD) as VEND_CD, "
			+ "          M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO PUCH_PRIORITY_REF_NO "
			+ "        from "
			+ "          M_PUCH_UNIT_COST_H, "
			+ "          ( "
			+ "            select "
			+ "              M_PUCH_UNIT_COST_H.COMPANY_CD, "
			+ "              M_PUCH_UNIT_COST_H.PLANT_CD, "
			+ "              M_PUCH_UNIT_COST_H.ITEM_CD, "
			+ "              min(M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO "
			+ "            from "
			+ "              M_PUCH_UNIT_COST_H, "
			+ "              SYS_MY_COMPANY "
			+ "            where "
			+ "              M_PUCH_UNIT_COST_H.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
			+ "              and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
			+ "            group by "
			+ "              M_PUCH_UNIT_COST_H.COMPANY_CD, "
			+ "              M_PUCH_UNIT_COST_H.PLANT_CD, "
			+ "              M_PUCH_UNIT_COST_H.ITEM_CD "
			+ "          ) ITEM_MIN_PRIORITY_NO "
			+ "        where "
			+ "          M_PUCH_UNIT_COST_H.COMPANY_CD = ITEM_MIN_PRIORITY_NO.COMPANY_CD "
			+ "          and M_PUCH_UNIT_COST_H.PLANT_CD = ITEM_MIN_PRIORITY_NO.PLANT_CD "
			+ "          and M_PUCH_UNIT_COST_H.ITEM_CD = ITEM_MIN_PRIORITY_NO.ITEM_CD "
			+ "          and M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO = ITEM_MIN_PRIORITY_NO.PUCH_PRIORITY_REF_NO "
			+ "        group by "
			+ "          M_PUCH_UNIT_COST_H.ITEM_CD, "
			+ "          M_PUCH_UNIT_COST_H.PLANT_CD, "
			+ "          M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO "
			+ "      ) ITEM_VEND "
			+ "    where "
			+ "      T_OD.ITEM_CD = M_ITEM.ITEM_CD "
			+ "      and T_OD.ITEM_CD = ITEM_VEND.ITEM_CD "
			+ "      and T_OD.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD "
			+ "      and T_OD.ITEM_CD = M_PUCH_UNIT_COST_H.ITEM_CD "
			+ "      and ITEM_VEND.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD "
			+ "      and ITEM_VEND.VEND_CD = M_PUCH_UNIT_COST_H.VEND_CD "
			+ "      and T_OD.PLANT_CD = SYS_DATE_CTRL.PLANT_CD "
			+ "      and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
			+ "      and SYS_MY_COMPANY.COMPANY_CD = M_PUCH_UNIT_COST_H.COMPANY_CD "
			+ "      and T_OD.OD_NO = ? "
			+ "  ) "
			+ "where "
			+ "  T_EDI_PLAN_ODR.INFO_TYP_CD = ? "
			+ "  and T_EDI_PLAN_ODR.COMPANY_CD = ? "
			+ "  and T_EDI_PLAN_ODR.PLAN_CD = ? ";
	/** EDI所要データ登録SQL */
	private String insertEdiPlanOdrSql =
		"insert into "
			+ "  T_EDI_PLAN_ODR "
			+ "  ( "
			+ "    INFO_TYP_CD, "
			+ "    COMPANY_CD, "
			+ "    PLAN_CD, "
			+ "    DATA_PROC_CD, "
			+ "    DATA_CREATE_DATE, "
			+ "    VEND_CD, "
			+ "    PLANT_CD, "
			+ "    JOB_ODR_CD, "
			+ "    CRCT_TYP, "
			+ "    COCK_TYP, "
			+ "    PUCH_ODR_UNIT, "
			+ "    EDI_CONS_TYP, "
			+ "    PUCH_ODR_PERSON, "
			+ "    ITEM_SPEC, "
			+ "    ITEM_DRAW_TYP, "
			+ "    ITEM_VERSION, "
			+ "    ITEM_NAME, "
			+ "    VEND_ITEM_CD, "
			+ "    ITEM_CD, "
			+ "    ITEM_DRAW_QTY, "
			+ "    ITEM_PKG_UNIT, "
			+ "    DLV_DATE_1, "
			+ "    DLV_PLAN_QTY_1, "
			+ "    DLV_DATE_2, "
			+ "    DLV_PLAN_QTY_2, "
			+ "    DLV_DATE_3, "
			+ "    DLV_PLAN_QTY_3, "
			+ "    DLV_DATE_4, "
			+ "    DLV_PLAN_QTY_4, "
			+ "    DLV_DATE_5, "
			+ "    DLV_PLAN_QTY_5, "
			+ "    PLAN_COMMENT, "
			+ "    PLAN_DATE, "
			+ "    STD_DLV_DAYS, "
			+ "    END_USER_NAME, "
			+ "    MAKER_NAME, "
			+ "    PLAN_TERM, "
			+ "    CONTRACT_COND_TYP, "
			+ "    MACHINE_CD, "
			+ "    STRATEGIC_GOODS_TYP, "
			+ "    ODR_ORG_NAME, "
			+ "    ODR_STAFF_NAME_J, "
			+ "    ITEM_SPEC_NAME_J, "
			+ "    ITEM_NAME_J, "
			+ "    COMMENT_J, "
			+ "    END_USER_NAME_J, "
			+ "    MAKER_NAME_J, "
			+ "    MACHINE_NAME_J, "
			+ "    ODR_SPEC_J, "
			+ "    ODR_ORG_NAME_J, "
			+ "    EDI_ODR_ISS_FLG, "
			+ "    EDI_ODR_ISS_DATE, "
			+ "    CREATED_DATE, "
			+ "    CREATED_BY, "
			+ "    CREATED_PRG_NM, "
			+ "    UPDATED_DATE, "
			+ "    UPDATED_BY, "
			+ "    UPDATED_PRG_NM, "
			+ "    MODIFY_COUNT "
			+ "  ) "
			+ "select "
			+ "  '0201' as INFO_TYP_CD, "
			+ "  SYS_MY_COMPANY.COMPANY_CD as COMPANY_CD, "
			+ "  T_OD.OD_NO as PLAN_CD, "
			+ "  0 as DATA_PROC_CD, "
			+ "  SYS_DATE_CTRL.BUSINESS_OPR_DATE as DATA_CREATE_DATE, "
			+ "  M_PUCH_UNIT_COST_H.VEND_CD as VEND_CD, "
			+ "  T_OD.PLANT_CD as PLANT_CD, "
			+ "  T_OD.JOB_ODR_CD as JOB_ODR_CD, "
			+ "  1 as CRCT_TYP, "
			+ "  1 as COCK_TYP, "
			+ "  M_ITEM.STOCK_UNIT as PUCH_ODR_UNIT, "
			+ "  1 as EDI_CONS_TYP, "
			+ "  NULL as PUCH_ODR_PERSON, "
			+ "  M_ITEM.SPEC as ITEM_SPEC, "
			+ "  1 as ITEM_DRAW_TYP, "
			+ "  NULL as ITEM_VERSION, "
			+ "  NULL as ITEM_NAME, "
			+ "  M_PUCH_UNIT_COST_H.VEND_ITEM_CD as VEND_ITEM_CD, "
			+ "  T_OD.ITEM_CD as ITEM_CD, "
			+ "  0 as ITEM_DRAW_QTY, "
			+ "  M_ITEM.PKG_UNIT as ITEM_PKG_UNIT, "
			+ "  T_OD.PRD_DUE_DATE as DLV_DATE_1, "
			+ "  T_OD.ODR_QTY as DLV_PLAN_QTY_1, "
			+ "  NULL as DLV_DATE_2, "
			+ "  0 as DLV_PLAN_QTY_2, "
			+ "  NULL as DLV_DATE_3, "
			+ "  0 as DLV_PLAN_QTY_3, "
			+ "  NULL as DLV_DATE_4, "
			+ "  0 as DLV_PLAN_QTY_4, "
			+ "  NULL as DLV_DATE_5, "
			+ "  0 as DLV_PLAN_QTY_5, "
			+ "  NULL as PLAN_COMMENT, "
			+ "  sysdate as PLAN_DATE, "
			+ "  decode(trunc((T_OD.FIXED_LT + (T_OD.PROP_LT * T_OD.ODR_QTY)) / 1000), 0, trunc((T_OD.FIXED_LT + (T_OD.PROP_LT * T_OD.ODR_QTY)) + 0.9), 999)  as STD_DLV_DAYS, "
			+ "  NULL as END_USER_NAME, "
			+ "  NULL as MAKER_NAME, "
			+ "  0 as PLAN_TERM, "
			+ "  NULL as CONTRACT_COND_TYP, "
			+ "  NULL as MACHINE_CD, "
			+ "  2 as STRATEGIC_GOODS_TYP, "
			+ "  NULL as ODR_ORG_NAME, "
			+ "  NULL as ODR_STAFF_NAME_J, "
			+ "  NULL as ITEM_SPEC_NAME_J, "
			+ "  M_ITEM.ITEM_NAME as ITEM_NAME_J, "
			+ "  NULL as COMMENT_J, "
			+ "  NULL as END_USER_NAME_J, "
			+ "  NULL as MAKER_NAME_J, "
			+ "  NULL as MACHINE_NAME_J, "
			+ "  NULL as ODR_SPEC_J, "
			+ "  NULL as ODR_ORG_NAME_J, "
			+ "  0 as EDI_ODR_ISS_FLG, "
			+ "  NULL as EDI_ODR_ISS_DATE, "
			+ "  sysdate as CREATED_DATE, "
			+ "  ? as CREATED_BY, "
			+ "  ? as CREATED_PRG_NM, "
			+ "  sysdate as UPDATED_DATE, "
			+ "  ? as UPDATED_BY, "
			+ "  ? as UPDATED_PRG_NM, "
			+ "  0 as MODIFY_COUNT "
			+ "from "
			+ "  T_OD, "
			+ "  M_ITEM, "
			+ "  M_PUCH_UNIT_COST_H, "
			+ "  SYS_MY_COMPANY, "
			+ "  SYS_DATE_CTRL, "
			+ "      ( "
			+ "        select "
			+ "          M_PUCH_UNIT_COST_H.ITEM_CD as ITEM_CD, "
			+ "          M_PUCH_UNIT_COST_H.PLANT_CD as PLANT_CD, "
			+ "          min(M_PUCH_UNIT_COST_H.VEND_CD) as VEND_CD, "
			+ "          M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO PUCH_PRIORITY_REF_NO "
			+ "        from "
			+ "          M_PUCH_UNIT_COST_H, "
			+ "          ( "
			+ "            select "
			+ "              M_PUCH_UNIT_COST_H.COMPANY_CD, "
			+ "              M_PUCH_UNIT_COST_H.PLANT_CD, "
			+ "              M_PUCH_UNIT_COST_H.ITEM_CD, "
			+ "              min(M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO "
			+ "            from "
			+ "              M_PUCH_UNIT_COST_H, "
			+ "              SYS_MY_COMPANY "
			+ "            where "
			+ "              M_PUCH_UNIT_COST_H.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
			+ "              and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
			+ "            group by "
			+ "              M_PUCH_UNIT_COST_H.COMPANY_CD, "
			+ "              M_PUCH_UNIT_COST_H.PLANT_CD, "
			+ "              M_PUCH_UNIT_COST_H.ITEM_CD "
			+ "          ) ITEM_MIN_PRIORITY_NO "
			+ "        where "
			+ "          M_PUCH_UNIT_COST_H.COMPANY_CD = ITEM_MIN_PRIORITY_NO.COMPANY_CD "
			+ "          and M_PUCH_UNIT_COST_H.PLANT_CD = ITEM_MIN_PRIORITY_NO.PLANT_CD "
			+ "          and M_PUCH_UNIT_COST_H.ITEM_CD = ITEM_MIN_PRIORITY_NO.ITEM_CD "
			+ "          and M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO = ITEM_MIN_PRIORITY_NO.PUCH_PRIORITY_REF_NO "
			+ "        group by "
			+ "          M_PUCH_UNIT_COST_H.ITEM_CD, "
			+ "          M_PUCH_UNIT_COST_H.PLANT_CD, "
			+ "          M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO "
			+ "      ) ITEM_VEND "
			+ "where "
			+ "  T_OD.ITEM_CD = M_ITEM.ITEM_CD "
			+ "  and T_OD.ITEM_CD = ITEM_VEND.ITEM_CD "
			+ "  and T_OD.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD "
			+ "  and T_OD.ITEM_CD = M_PUCH_UNIT_COST_H.ITEM_CD "
			+ "  and ITEM_VEND.PLANT_CD = M_PUCH_UNIT_COST_H.PLANT_CD "
			+ "  and ITEM_VEND.VEND_CD = M_PUCH_UNIT_COST_H.VEND_CD "
			+ "  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
			+ "  and SYS_MY_COMPANY.COMPANY_CD = M_PUCH_UNIT_COST_H.COMPANY_CD "
			+ "  and T_OD.PLANT_CD = SYS_DATE_CTRL.PLANT_CD "
			+ "  and T_OD.OD_NO = ? ";

	/**
	 * コンストラクタ
	 * @param connect コネクションがOPENされているIDbConnection
	 * @param userCd ユーザコード
	 * @param busineId 業務ID
	 * @param plantCd 工場コード
	 */
	public EdiOrder(IDbConnection connect, String userCd, String busineId, String plantCd) {
		this.conn = connect;
		this.sysUserCd = userCd;
		this.sysBusinessId = busineId;
		this.sysPlantCd = plantCd;
	}

	/**
	 * EDI所要データ登録
	 * @param odNo オーダーデマンド番号
	 * @throws SQLException DBアクセスエラー
	 */
	public void addEdiPlanOdr(String odNo) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// EDIデータ検索キーを取得
			ps = conn.getConn().prepareStatement(this.selectPlanOdrKeySql);
			ps.setString(1, odNo);
			rs = ps.executeQuery();
			if (rs.next()) {
				// EDIデータ存在チェック
				boolean result =
					this.selectEdiPlanOdr(
						rs.getString("INFO_TYP_CD"),
						rs.getString("COMPANY_CD"),
						rs.getString("PLAN_CD"));

				// EDIデータが存在する場合、更新する。
				if (result) {
					// EDIデータを更新
					this.updateEdiPlanOdr(
						rs.getString("INFO_TYP_CD"),
						rs.getString("COMPANY_CD"),
						rs.getString("PLAN_CD"));
				} else {
					// EDIデータを登録
					this.insertEdiPlanOdr(rs.getString("PLAN_CD"));
				}
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
	 * EDI所要データ存在チェック
	 * @param infoTypCd 情報区分コード
	 * @param companyCd 会社コード
	 * @param planCd オーダーデマンド番号
	 * @return レコードが存在した場合はtrue、そうでない場合はfalse
	 * @throws SQLException DBアクセスエラー
	 */
	private boolean selectEdiPlanOdr(String infoTypCd, String companyCd, String planCd)
		throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conn.getConn().prepareStatement(this.selectEdiPlanOdrSql);
			ps.setString(1, infoTypCd);
			ps.setString(2, companyCd);
			ps.setString(3, planCd);
			rs = ps.executeQuery();
			boolean result = rs.next();
			return result;
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
	 * EDI所要データ登録
	 * @param odNo オーダーデマンド番号
	 * @return 更新した行数
	 * @throws SQLException DBアクセスエラー
	 */
	private int insertEdiPlanOdr(String odNo) throws SQLException {
		PreparedStatement ps = null;

		try {
			ps = conn.getConn().prepareStatement(this.insertEdiPlanOdrSql);
			ps.setString(1, this.sysUserCd);
			ps.setString(2, this.sysBusinessId);
			ps.setString(3, this.sysUserCd);
			ps.setString(4, this.sysBusinessId);
			ps.setString(5, odNo);
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
	 * EDI所要データ更新
	 * @param infoTypCd 情報区分コード
	 * @param companyCd 会社コード
	 * @param planCd オーダーデマンド番号
	 * @return 更新した行数
	 * @throws SQLException DBアクセスエラー
	 */
	private int updateEdiPlanOdr(String infoTypCd, String companyCd, String planCd)
		throws SQLException {
		PreparedStatement ps = null;

		try {
			ps = conn.getConn().prepareStatement(this.updateEdiPlanOdrSql);
			ps.setString(1, this.sysUserCd);
			ps.setString(2, this.sysBusinessId);
			ps.setString(3, this.sysUserCd);
			ps.setString(4, this.sysBusinessId);
			ps.setString(5, planCd);
			ps.setString(6, infoTypCd);
			ps.setString(7, companyCd);
			ps.setString(8, planCd);
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