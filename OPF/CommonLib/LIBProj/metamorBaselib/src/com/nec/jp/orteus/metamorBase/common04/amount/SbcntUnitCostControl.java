/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/SbcntUnitCostControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 外注単価情報取得部品
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:36 $
 */
public class SbcntUnitCostControl {
	/** 外注単価情報取得SQL */
	private static final String selectSbcntUnitCostSql =
		"select "
			+ "  to_char(M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE,'yyyy/mm/dd') as EFF_PHASE_IN_DATE, "
			+ "  to_char(M_SBCNT_UNIT_COST.SBCNT_SIZE, 'fm99999999999990.0999') as SBCNT_SIZE, "
			+ "  to_char(M_SBCNT_UNIT_COST.UNIT_COST_TYP) as UNIT_COST_TYP, "
			+ "  to_char(M_SBCNT_UNIT_COST.UNIT_COST, 'fm99999999999990.0099') as UNIT_COST, "
			+ "  to_char(M_SBCNT_UNIT_COST.PROCESSING_COST, 'fm99999999999990.0099') as PROCESSING_COST, "
			+ "  to_char(M_SBCNT_UNIT_COST.MATERIAL_COST, 'fm99999999999990.0099') as MATERIAL_COST, "
			+ "  to_char(M_SBCNT_UNIT_COST.OTHER_OVERHEADS, 'fm99999999999990.0099') as OTHER_OVERHEADS "
			+ "from "
			+ "  M_SBCNT_UNIT_COST "
			+ "where "
			+ "  M_SBCNT_UNIT_COST.COMPANY_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.VEND_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.PLANT_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.ITEM_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.PROC_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE <= to_date(?, 'yyyy/mm/dd') "
			+ "  and M_SBCNT_UNIT_COST.SBCNT_SIZE <= ? "
			+ "order by "
			+ "  M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE desc, "
			+ "  M_SBCNT_UNIT_COST.SBCNT_SIZE desc ";

	/**
	 * 通貨情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private SbcntUnitCostControl() {
	}

	/**
	 * 外注単価情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード（必須）
	 * @param plantCd 工場コード（必須）
	 * @param itemCd 品目番号（必須）
	 * @param procCd 品目別作業コード（必須）
	 * @param startDate 系列別着手日（必須）
	 * @param dlvDate 系列別納期（必須）
	 * @param size 作業指示数（必須）
	 * @param exchReserveCd 為替予約コード
	 * @return 外注単価情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static SbcntUnitCostStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String procCd,
		String startDate,
		String dlvDate,
		String size,
		String exchReserveCd)
		throws SQLException, DataNotFoundException {

		// 会社コードが不正な場合			
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 取引先コードが不正な場合			
		if (vendCd == null || vendCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 工場コードが不正な場合			
		if (plantCd == null || plantCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 品目番号が不正な場合			
		if (itemCd == null || itemCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 品目別作業コードが不正な場合			
		if (procCd == null || procCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 系列別着手日が不正な場合			
		if (startDate == null || startDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 系列別納期が不正な場合			
		if (dlvDate == null || dlvDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 作業指示数が不正な場合			
		if (size == null || size.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// 外注単価情報の取得
		SbcntUnitCostStruct sucs =
			selectSbcntUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				procCd,
				startDate,
				size);

		// 取引通貨情報の取得
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// 通貨情報データクラスを取得
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// 為替レート情報の取得
		ExchRateStruct ers =
			ExchRateControl.getData(
				conn,
				companyCd,
				cs.getCUR_CD(),
				cs.getEXCH_TYP(),
				exchReserveCd,
				dlvDate);

		sucs.setROUND_TYP(cs.getROUND_TYP());
		sucs.setEXCH_TYP(cs.getEXCH_TYP());
		sucs.setCUR_CD(cs.getCUR_CD());
		sucs.setCUR_NAME(cs.getCUR_NAME());
		sucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		sucs.setCUR_UNIT(cs.getCUR_UNIT());
		sucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());

		sucs.setEXCH_RESERVE_CD(ers.getEXCH_RESERVE_CD());
		sucs.setEXCH_START_DATE(ers.getEXCH_START_DATE());
		sucs.setEXCH_END_DATE(ers.getEXCH_END_DATE());
		sucs.setEXCH_RATE(ers.getEXCH_RATE());

		// 発注金額の計算
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				sucs.getUNIT_COST(),
				size,
				sucs.getROUND_TYP(),
				sucs.getDECIMAL_FIG());
		sucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// 値引金額の設定
		sucs.setDISC_AMOUNT("0.00");
		// 値引後金額の計算
		String afterDiscAmount =
			AmountCalculator.calcNetAmount(
				sucs.getPUCH_ODR_AMOUNT(),
				sucs.getDISC_AMOUNT());
		sucs.setAFTER_DISC_AMOUNT(afterDiscAmount);
		// 仮邦貨金額の計算
		String provisionalHomeCurAmount =
			AmountCalculator.calcHomeCurAmount(
				sucs.getAFTER_DISC_AMOUNT(),
				sucs.getEXCH_RATE(),
				sucs.getROUND_TYP(),
				hcs.getDECIMAL_FIG());
		sucs.setPROVISIONAL_HOME_CUR_AMOUNT(provisionalHomeCurAmount);

		return sucs;
	}

	/**
	 * [外注単価]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード
	 * @param vendCd 取引先コード
	 * @param plantCd 工場コード
	 * @param itemCd 品目番号
	 * @param procCd 品目別作業コード
	 * @param startDate 系列別着手日
	 * @param size 作業指示数
	 * @return 外注単価情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 */
	private static SbcntUnitCostStruct selectSbcntUnitCost(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String procCd,
		String startDate,
		String size)
		throws SQLException {

		// ステートメント
		PreparedStatement ps = null;
		// リザルトセット
		ResultSet rs = null;

		try {
			SbcntUnitCostStruct sucs = new SbcntUnitCostStruct();

			ps = (conn.getConn()).prepareStatement(selectSbcntUnitCostSql);
			ps.setString(1, companyCd);
			ps.setString(2, vendCd);
			ps.setString(3, plantCd);
			ps.setString(4, itemCd);
			ps.setString(5, procCd);
			ps.setString(6, startDate);
			ps.setString(7, size);

			rs = ps.executeQuery();

			if (!rs.next()) {
				sucs.setEFF_PHASE_IN_DATE(startDate);
				sucs.setSBCNT_SIZE(size);
				sucs.setUNIT_COST_TYP("1");
				sucs.setUNIT_COST("0.00");
				sucs.setPROCESSING_COST("0.00");
				sucs.setMATERIAL_COST("0.00");
				sucs.setOTHER_OVERHEADS("0.00");
			} else {
				sucs.setEFF_PHASE_IN_DATE(rs.getString("EFF_PHASE_IN_DATE"));
				sucs.setSBCNT_SIZE(rs.getString("SBCNT_SIZE"));
				sucs.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				sucs.setUNIT_COST(rs.getString("UNIT_COST"));
				sucs.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				sucs.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				sucs.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));
			}

			return sucs;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}
}
