/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/PuchUnitCostControl.java,v $
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
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * 購入単価情報取得部品
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.8 $ $Date: 2014/02/20 14:46:18 $
 */
public class PuchUnitCostControl {

	/** [購入単価]データ取得用のSQL */
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

	/**
	 * 購入単価情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private PuchUnitCostControl() {
	}

	/**
	 * 単価情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード（必須）
	 * @param plantCd 工場コード（必須）
	 * @param itemCd 品目番号
	 * @param puchOdrStartDate 発注予定日（必須）
	 * @param puchOdrDlvDate 発注納期（必須）
	 * @param puchOdrQty 発注数（必須）
	 * @param exchRserveCd 為替予約コード
	 * @return 購入単価情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 * @deprecated このメソッドは為替レート取得を行っており、現状の仕様に適さないため、
	 *               使用されるべきではありません。
	 */
	public static PuchUnitCostStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String startDate,
		String dlvDate,
		String size,
		String exchRserveCd)
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

		// [発注単価]を検索
		PuchUnitCostStruct pucs =
			selectPuchUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				startDate,
				size);

		// 通貨情報データクラスを取得
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// 邦貨情報データクラスを取得
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// 為替レート情報データクラスを取得
		ExchRateStruct ers =
			ExchRateControl.getData(
				conn,
				companyCd,
				cs.getCUR_CD(),
				cs.getEXCH_TYP(),
				exchRserveCd,
				dlvDate);
		// 消費税情報データクラスを取得
		TaxStruct ts =
			TaxControl.getData(conn, companyCd, vendCd, itemCd, dlvDate);

		// 通貨情報データを設定
		pucs.setROUND_TYP(cs.getROUND_TYP());
		pucs.setEXCH_TYP(cs.getEXCH_TYP());
		pucs.setCUR_CD(cs.getCUR_CD());
		pucs.setCUR_NAME(cs.getCUR_NAME());
		pucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		pucs.setCUR_UNIT(cs.getCUR_UNIT());
		pucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());

		// 為替レート情報データを設定
		pucs.setEXCH_RESERVE_CD(ers.getEXCH_RESERVE_CD());
		pucs.setEXCH_START_DATE(ers.getEXCH_START_DATE());
		pucs.setEXCH_END_DATE(ers.getEXCH_END_DATE());
		pucs.setEXCH_RATE(ers.getEXCH_RATE());
		
		// 消費税情報データを設定
		pucs.setTAX_CD(ts.getTAX_CD());
		pucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
		// TAX_CDの下1桁が1以外の場合は税率を0とする。
		//20090417 MOD START
		//TAX_CDの値に関わらず税率取得
/*
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
*/
			pucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			pucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			pucs.setTAX_RATE_3(ts.getTAX_RATE_3());
/*
		} else {
			pucs.setTAX_RATE_1("0.0");
			pucs.setTAX_RATE_2("0.0");
			pucs.setTAX_RATE_3("0.0");
		}
*/
		pucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

		// 発注金額の計算
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				pucs.getUNIT_COST(),
				pucs.getROUND_TYP(),
				pucs.getDECIMAL_FIG());
		pucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// 値引金額
		pucs.setDISC_AMOUNT("0.00");
		// 本体金額
		String netAmount =
			AmountCalculator.calcNetAmount(
				pucs.getPUCH_ODR_AMOUNT(),
				pucs.getDISC_AMOUNT());
		pucs.setNET_AMOUNT(netAmount);
		
		//20090417 MOD START
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
			// 税額１の計算
			String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_1(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_1(taxAmount1);
			// 税額２の計算
			String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_2(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_2(taxAmount2);
			// 税額３の計算
			String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_3(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_3(taxAmount3);
			// 税込み金額の計算
			String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_AMOUNT_1(),
					pucs.getTAX_AMOUNT_2(),
					pucs.getTAX_AMOUNT_3());
			pucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		}else{
			//内税の場合 税額1～3は0固定 税込金額を本体金額とする
			pucs.setTAX_AMOUNT_1("0.00");
			pucs.setTAX_AMOUNT_2("0.00");
			pucs.setTAX_AMOUNT_3("0.00");
			pucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		//20090417 MOD END
		// 邦貨金額の計算
		String homeCurAmount =
			AmountCalculator.calcHomeCurAmount(
				pucs.getAMOUNT_INCLUDE_TAX(),
				pucs.getEXCH_RATE(),
				pucs.getROUND_TYP(),
				hcs.getDECIMAL_FIG());
		pucs.setHOME_CUR_AMOUNT(homeCurAmount);

		return pucs;
	}

	/**
	 * 単価情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード（必須）
	 * @param plantCd 工場コード（必須）
	 * @param itemCd 品目番号
	 * @param puchOdrStartDate 発注予定日（必須）
	 * @param puchOdrDlvDate 発注納期（必須）
	 * @param puchOdrQty 発注数（必須）
	 * @return 購入単価情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static PuchUnitCostStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String startDate,
		String dlvDate,
		String size)
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

		// [発注単価]を検索
		PuchUnitCostStruct pucs =
			selectPuchUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				startDate,
				size);

		// 通貨情報データクラスを取得
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// 邦貨情報データクラスを取得
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// 消費税情報データクラスを取得
		TaxStruct ts =
			TaxControl.getData(conn, companyCd, vendCd, itemCd, dlvDate);

		// 通貨情報データを設定
		pucs.setROUND_TYP(cs.getROUND_TYP());
		pucs.setEXCH_TYP(cs.getEXCH_TYP());
		pucs.setCUR_CD(cs.getCUR_CD());
		pucs.setCUR_NAME(cs.getCUR_NAME());
		pucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		pucs.setCUR_UNIT(cs.getCUR_UNIT());
		pucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());
		// 消費税情報データを設定
		pucs.setTAX_CD(ts.getTAX_CD());
		pucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
		

		// TAX_CDの下1桁が1以外の場合は税率を0とする。
		//20090417 MOD START
		//TAX_CDの値に関わらず税率取得
		/*
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
		*/
			pucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			pucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			pucs.setTAX_RATE_3(ts.getTAX_RATE_3());
		/*
		} else {
			pucs.setTAX_RATE_1("0.0");
			pucs.setTAX_RATE_2("0.0");
			pucs.setTAX_RATE_3("0.0");
		}
		*/
		//20090417 MOD END
		pucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

		// 発注金額の計算
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				pucs.getUNIT_COST(),
				pucs.getROUND_TYP(),
				pucs.getDECIMAL_FIG());
		pucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// 値引金額
		pucs.setDISC_AMOUNT("0.00");
		// 本体金額
		String netAmount =
			AmountCalculator.calcNetAmount(
				pucs.getPUCH_ODR_AMOUNT(),
				pucs.getDISC_AMOUNT());
		pucs.setNET_AMOUNT(netAmount);
		
		//20090417 MOD START
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
			//外税の場合
			// 税額１の計算
			String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_1(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_1(taxAmount1);
			// 税額２の計算
			String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_2(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_2(taxAmount2);
			// 税額３の計算
			String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_3(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_3(taxAmount3);
			// 税込み金額の計算
			String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_AMOUNT_1(),
					pucs.getTAX_AMOUNT_2(),
					pucs.getTAX_AMOUNT_3());
			pucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		}else{
			//内税の場合 税額1～3は0固定 税込金額を本体金額とする
			pucs.setTAX_AMOUNT_1("0.00");
			pucs.setTAX_AMOUNT_2("0.00");
			pucs.setTAX_AMOUNT_3("0.00");
			pucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		//20090417 MOD END
		return pucs;
	}

	//Add  Start 20131224 song-yy
/**
	 * 単価情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード（必須）
	 * @param plantCd 工場コード（必須）
	 * @param itemCd 品目番号
	 * @param puchOdrStartDate 発注予定日（必須）
	 * @param puchOdrDlvDate 発注納期（必須）
	 * @param puchOdrQty 発注数（必須）
	 * @param taxCd 消費税コード（必須）
	 * @return 購入単価情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static PuchUnitCostStruct getDataTax(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String startDate,
		String dlvDate,
		String size,
		String taxCd)
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
		
		// [発注単価]を検索
		PuchUnitCostStruct pucs =
			selectPuchUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				startDate,
				size);

		// 通貨情報データクラスを取得
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// 邦貨情報データクラスを取得
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// 消費税情報データクラスを取得
		TaxStruct ts =
			TaxControl.getDataTax(conn, companyCd, vendCd, itemCd, dlvDate,taxCd);

		// 通貨情報データを設定
		pucs.setROUND_TYP(cs.getROUND_TYP());
		pucs.setEXCH_TYP(cs.getEXCH_TYP());
		pucs.setCUR_CD(cs.getCUR_CD());
		pucs.setCUR_NAME(cs.getCUR_NAME());
		pucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		pucs.setCUR_UNIT(cs.getCUR_UNIT());
		pucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());
		// 消費税情報データを設定
		pucs.setTAX_CD(ts.getTAX_CD());
		pucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
		

		// TAX_CDの下1桁が1以外の場合は税率を0とする。

		//TAX_CDの値に関わらず税率取得
			pucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			pucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			pucs.setTAX_RATE_3(ts.getTAX_RATE_3());


		pucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

		// 発注金額の計算
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				pucs.getUNIT_COST(),
				pucs.getROUND_TYP(),
				pucs.getDECIMAL_FIG());
		pucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// 値引金額
		pucs.setDISC_AMOUNT("0.00");
		// 本体金額
		String netAmount =
			AmountCalculator.calcNetAmount(
				pucs.getPUCH_ODR_AMOUNT(),
				pucs.getDISC_AMOUNT());
		pucs.setNET_AMOUNT(netAmount);
		
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
			//外税の場合
			// 税額１の計算
			String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_1(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_1(taxAmount1);
			// 税額２の計算
			String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_2(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_2(taxAmount2);
			// 税額３の計算
			String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_3(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_3(taxAmount3);
			// 税込み金額の計算
			String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_AMOUNT_1(),
					pucs.getTAX_AMOUNT_2(),
					pucs.getTAX_AMOUNT_3());
			pucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		}else{
			//内税の場合 税額1～3は0固定 税込金額を本体金額とする
			pucs.setTAX_AMOUNT_1("0.00");
			pucs.setTAX_AMOUNT_2("0.00");
			pucs.setTAX_AMOUNT_3("0.00");
			pucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		return pucs;
	}
	
	/**
	 * 単価情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード（必須）
	 * @param plantCd 工場コード（必須）
	 * @param itemCd 品目番号
	 * @param puchOdrStartDate 発注予定日（必須）
	 * @param puchOdrDlvDate 発注納期（必須）
	 * @param puchOdrQty 発注数（必須）
	 * @param taxCd 消費税コード（NULL可）
	 * @return 購入単価情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static PuchUnitCostStruct getDataTax0(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String startDate,
		String dlvDate,
		String size,
		String taxCd)
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
		
		// [発注単価]を検索
		PuchUnitCostStruct pucs =
			selectPuchUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				startDate,
				size);

		// 通貨情報データクラスを取得
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// 邦貨情報データクラスを取得
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		
		// 消費税情報データクラスを取得
		TaxStruct ts = new TaxStruct();
		if(taxCd != null && !"".equals(taxCd)){
			ts = TaxControl.getDataTax(conn, companyCd, vendCd, itemCd, dlvDate,taxCd);
		}

		// 通貨情報データを設定
		pucs.setROUND_TYP(cs.getROUND_TYP());
		pucs.setEXCH_TYP(cs.getEXCH_TYP());
		pucs.setCUR_CD(cs.getCUR_CD());
		pucs.setCUR_NAME(cs.getCUR_NAME());
		pucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		pucs.setCUR_UNIT(cs.getCUR_UNIT());
		pucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());
		// 消費税情報データを設定
		if(taxCd != null && !"".equals(taxCd)){
			pucs.setTAX_CD(ts.getTAX_CD());
			pucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
		

		// TAX_CDの下1桁が1以外の場合は税率を0とする。

		//TAX_CDの値に関わらず税率取得
			pucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			pucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			pucs.setTAX_RATE_3(ts.getTAX_RATE_3());


			pucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
		}else{
			pucs.setTAX_CD("");
			pucs.setTAX_APPLY_TYP("2");
			pucs.setTAX_RATE_1("0");
			pucs.setTAX_RATE_2("0");
			pucs.setTAX_RATE_3("0");
			pucs.setTAX_ROUND_TYP("1");
		}
		// 発注金額の計算
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				pucs.getUNIT_COST(),
				pucs.getROUND_TYP(),
				pucs.getDECIMAL_FIG());
		pucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// 値引金額
		pucs.setDISC_AMOUNT("0.00");
		// 本体金額
		String netAmount =
			AmountCalculator.calcNetAmount(
				pucs.getPUCH_ODR_AMOUNT(),
				pucs.getDISC_AMOUNT());
		pucs.setNET_AMOUNT(netAmount);
		
		if(taxCd != null && !"".equals(taxCd)){
			String lowerTaxCd =
				ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
			if (lowerTaxCd.equals("1")) {
				//外税の場合
				// 税額１の計算
				String taxAmount1 =
					AmountCalculator.calcTaxAmount(
						pucs.getNET_AMOUNT(),
						pucs.getTAX_RATE_1(),
						pucs.getTAX_ROUND_TYP(),
						pucs.getDECIMAL_FIG());
				pucs.setTAX_AMOUNT_1(taxAmount1);
				// 税額２の計算
				String taxAmount2 =
					AmountCalculator.calcTaxAmount(
						pucs.getNET_AMOUNT(),
						pucs.getTAX_RATE_2(),
						pucs.getTAX_ROUND_TYP(),
						pucs.getDECIMAL_FIG());
				pucs.setTAX_AMOUNT_2(taxAmount2);
				// 税額３の計算
				String taxAmount3 =
					AmountCalculator.calcTaxAmount(
						pucs.getNET_AMOUNT(),
						pucs.getTAX_RATE_3(),
						pucs.getTAX_ROUND_TYP(),
						pucs.getDECIMAL_FIG());
				pucs.setTAX_AMOUNT_3(taxAmount3);
				// 税込み金額の計算
				String amountIncludeTax =
					AmountCalculator.calcAmountIncludeTax(
						pucs.getNET_AMOUNT(),
						pucs.getTAX_AMOUNT_1(),
						pucs.getTAX_AMOUNT_2(),
						pucs.getTAX_AMOUNT_3());
				pucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
			}else{
				//内税の場合 税額1～3は0固定 税込金額を本体金額とする
				pucs.setTAX_AMOUNT_1("0.00");
				pucs.setTAX_AMOUNT_2("0.00");
				pucs.setTAX_AMOUNT_3("0.00");
				pucs.setAMOUNT_INCLUDE_TAX(netAmount);
			}
		}else{
			pucs.setTAX_AMOUNT_1("0.00");
			pucs.setTAX_AMOUNT_2("0.00");
			pucs.setTAX_AMOUNT_3("0.00");
			pucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		return pucs;
	}
//Add  End 20131224 song-yy
	/**
	 * [購入単価]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード
	 * @param vendCd 取引先コード
	 * @param plantCd 工場コード
	 * @param itemCd 品目番号
	 * @param effPhaseInDate 購入単価有効開始日付
	 * @param puchSize サイズ
	 * @return 購入単価情報データクラス 
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 */
	private static PuchUnitCostStruct selectPuchUnitCost(
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

			PuchUnitCostStruct pucs = new PuchUnitCostStruct();

			if (!rs.next()) {
				// 検索結果が0件の場合
				pucs.setUNIT_COST_TYP("1");
				pucs.setUNIT_COST("0.00");
				pucs.setPROCESSING_COST("0.00");
				pucs.setMATERIAL_COST("0.00");
				pucs.setOTHER_OVERHEADS("0.00");
			} else {
				pucs.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				pucs.setUNIT_COST(rs.getString("UNIT_COST"));
				pucs.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				pucs.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				pucs.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));
			}

			return pucs;
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
