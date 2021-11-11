/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/UnitCostControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.AE0060;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 単価情報取得部品
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.10 $ $Date: 2014/02/19 08:43:09 $
 */
public class UnitCostControl {

	/** [単価]データ取得用のSQL */
	private static final String selectPuchUnitCostSql =
		"select "
			+ "  to_char(M_PUCH_UNIT_COST.UNIT_COST_TYP) as UNIT_COST_TYP, "
			+ "  to_char(M_PUCH_UNIT_COST.UNIT_COST, 'fm99999999999990.0099') as UNIT_COST, "
			+ "  to_char(M_PUCH_UNIT_COST.PROCESSING_COST, 'fm99999999999990.0099') as PROCESSING_COST, "
			+ "  to_char(M_PUCH_UNIT_COST.MATERIAL_COST, 'fm99999999999990.0099') as MATERIAL_COST, "
			+ "  to_char(M_PUCH_UNIT_COST.OTHER_OVERHEADS, 'fm99999999999990.0099') as OTHER_OVERHEADS "
			+ "from "
			+ "  M_PUCH_UNIT_COST "
			+ "where "
			+ "  M_PUCH_UNIT_COST.COMPANY_CD = ? "
			+ "  and M_PUCH_UNIT_COST.VEND_CD = ? "
			+ "  and M_PUCH_UNIT_COST.PLANT_CD = ? "
			+ "  and M_PUCH_UNIT_COST.ITEM_CD = ? "
			+ "  and M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
			+ "  and M_PUCH_UNIT_COST.PUCH_SIZE <= TO_NUMBER(?) "
			+ "order by "
			+ "  M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE desc, "
			+ "  M_PUCH_UNIT_COST.PUCH_SIZE desc ";

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
	
	// Add Start 20131216 fang-xf
	/** [発注残]データを取得SQL */
	private static final String selectRlsdPuchOdrSql =
		"select"
		+ " T_RLSD_PUCH_ODR.TAX_CD as TAX_CD " 
		+ " from "
		+ " T_RLSD_PUCH_ODR "
		+ " where "
		+ " T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? ";
	// Add End 20131216 fang-xf

	/**
	 * 単価情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private UnitCostControl() {
	}

	/**
	 * 単価情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード（必須）
	 * @param plantCd 工場コード（必須）
	 * @param itemCd 品目番号
	 * @param procCd 作業コード
	 * @param puchOdrStartDate 発注予定日（必須）
	 * @param puchOdrDlvDate 発注納期（必須）
	 * @param puchOdrQty 発注数（必須）
	// Add Start 20131216 fang-xf
	 * @param puchOdrCd 発注番号
	// Add End 20131216 fang-xf
	 * @return 単価情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static UnitCostStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String procCd,
		String startDate,
		String dlvDate,
		// Mod Start 20131216 fang-xf
		//String size)
		String size,
		String puchOdrCd)
		// Mod End 20131216 fang-xf
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
		// 発注予定日が不正な場合
		if (startDate == null || startDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 発注納期が不正な場合			
		if (dlvDate == null || dlvDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 発注数が不正な場合
		if (size == null || size.length() <= 0) {
			throw new IllegalArgumentException();
		}

		UnitCostStruct ucs;

		if (procCd == null || "".equals(procCd)) {
			// [購入単価]を検索
			ucs = selectPuchUnitCost(conn, companyCd, vendCd, plantCd, itemCd, startDate, size);
		} else {
			// [外注単価]を検索
			ucs =
				selectSbcntUnitCost(
					conn,
					companyCd,
					vendCd,
					plantCd,
					itemCd,
					procCd,
					startDate,
					size);
		}

		// 通貨情報データクラスを取得
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// 邦貨情報データクラスを取得
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// Mod Start 20131016 fang-xf
		// 消費税情報データクラスを取得
		//TaxStruct ts = TaxControl.getData(conn, companyCd, vendCd, itemCd, dlvDate);
		PreparedStatement ps = null;
		ResultSet rs = null;
		// [発注残].消費税コードを取得
		ps = conn.getConn().prepareStatement(selectRlsdPuchOdrSql);
		ps.setString(1, puchOdrCd);
		rs = ps.executeQuery();
		TaxStruct ts;
		// 検索結果が0件の場合
		if(!rs.next()){
			throw new DataNotFoundException("KQ20187");
		}else{
			ts = TaxControl.getDataTax(conn, companyCd, vendCd, itemCd, dlvDate,rs.getString("TAX_CD"));  
		}
		// Mod End 20131016 fang-xf

		// 通貨情報データを設定
		ucs.setROUND_TYP(cs.getROUND_TYP());
		ucs.setEXCH_TYP(cs.getEXCH_TYP());
		ucs.setCUR_CD(cs.getCUR_CD());
		ucs.setCUR_NAME(cs.getCUR_NAME());
		ucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		ucs.setCUR_UNIT(cs.getCUR_UNIT());
		ucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());
		// 消費税情報データを設定
		ucs.setTAX_CD(ts.getTAX_CD());
		ucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
/*
		// TAX_CDの下1桁が1以外の場合は税率を0とする。
		String lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);

		if (lowerTaxCd.equals("1")) {
*/
			ucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			ucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			ucs.setTAX_RATE_3(ts.getTAX_RATE_3());
/*
		} else {
			ucs.setTAX_RATE_1("0.0");
			ucs.setTAX_RATE_2("0.0");
			ucs.setTAX_RATE_3("0.0");
		}
*/
		ucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
		
		// 発注金額の計算
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				ucs.getUNIT_COST(),
				ucs.getROUND_TYP(),
				ucs.getDECIMAL_FIG());
		ucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// 値引金額
		ucs.setDISC_AMOUNT("0.00");
		// 本体金額
		String netAmount =
			AmountCalculator.calcNetAmount(ucs.getPUCH_ODR_AMOUNT(), ucs.getDISC_AMOUNT());
		ucs.setNET_AMOUNT(netAmount);
		
		//20090428 MOD START
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {		
			// 税額１の計算
			String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					ucs.getNET_AMOUNT(),
					ucs.getTAX_RATE_1(),
					ucs.getTAX_ROUND_TYP(),
					ucs.getDECIMAL_FIG());
			ucs.setTAX_AMOUNT_1(taxAmount1);
			// 税額２の計算
			String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					ucs.getNET_AMOUNT(),
					ucs.getTAX_RATE_2(),
					ucs.getTAX_ROUND_TYP(),
					ucs.getDECIMAL_FIG());
			ucs.setTAX_AMOUNT_2(taxAmount2);
			// 税額３の計算
			String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					ucs.getNET_AMOUNT(),
					ucs.getTAX_RATE_3(),
					ucs.getTAX_ROUND_TYP(),
					ucs.getDECIMAL_FIG());
			ucs.setTAX_AMOUNT_3(taxAmount3);
			// 税込み金額の計算
			String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					ucs.getNET_AMOUNT(),
					ucs.getTAX_AMOUNT_1(),
					ucs.getTAX_AMOUNT_2(),
					ucs.getTAX_AMOUNT_3());
			ucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		}else{
			//内税の場合 税額1～3は0固定 税込金額を本体金額とする
			ucs.setTAX_AMOUNT_1("0.00");
			ucs.setTAX_AMOUNT_2("0.00");
			ucs.setTAX_AMOUNT_3("0.00");
			ucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		//20090428 MOD END

		return ucs;
	}

	/**
	 * [単価]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード
	 * @param vendCd 取引先コード
	 * @param plantCd 工場コード
	 * @param itemCd 品目番号
	 * @param effPhaseInDate 単価有効開始日付
	 * @param puchSize サイズ
	 * @return 単価情報データクラス 
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 */
	private static UnitCostStruct selectPuchUnitCost(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String effPhaseInDate,
		String puchSize)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conn.getConn().prepareStatement(selectPuchUnitCostSql);
			ps.setString(1, companyCd);
			ps.setString(2, vendCd);
			ps.setString(3, plantCd);
			ps.setString(4, itemCd);
			ps.setString(5, effPhaseInDate);
			ps.setString(6, puchSize);
			rs = ps.executeQuery();

			UnitCostStruct ucs = new UnitCostStruct();

			if (!rs.next()) {
				// 検索結果が0件の場合
				ucs.setUNIT_COST_TYP("1");
				ucs.setUNIT_COST("0.00");
				ucs.setPROCESSING_COST("0.00");
				ucs.setMATERIAL_COST("0.00");
				ucs.setOTHER_OVERHEADS("0.00");
			} else {
				ucs.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				ucs.setUNIT_COST(rs.getString("UNIT_COST"));
				ucs.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				ucs.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				ucs.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));
			}

			return ucs;
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
	private static UnitCostStruct selectSbcntUnitCost(
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
			UnitCostStruct ucs = new UnitCostStruct();

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
				ucs.setUNIT_COST_TYP("1");
				ucs.setUNIT_COST("0.00");
				ucs.setPROCESSING_COST("0.00");
				ucs.setMATERIAL_COST("0.00");
				ucs.setOTHER_OVERHEADS("0.00");
			} else {
				ucs.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				ucs.setUNIT_COST(rs.getString("UNIT_COST"));
				ucs.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				ucs.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				ucs.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));
			}

			return ucs;
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
