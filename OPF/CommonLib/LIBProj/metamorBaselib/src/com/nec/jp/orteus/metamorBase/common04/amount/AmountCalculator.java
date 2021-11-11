/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/AmountCalculator.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

/**
 * 金額計算メソッド群です。 
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class AmountCalculator {

	/** 丸め区分の切り上げを表す定数 */
	public static final String CEIL = "2";
	/** 丸め区分の切り捨てを表す定数 */
	public static final String FLOOR = "3";
	/** 丸め区分の四捨五入を表す定数 */
	public static final String ROUND = "1";
	/** デフォルト表示小数桁数 */
	private static final int FORMAT_FIGURE = 2;

	/**
	 * このクラスのデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private AmountCalculator() {
	}

	/**
	 * 発注金額を計算します。
	 * <p>
	 * 発注金額は以下の手順で計算されます。
	 * <ol>
	 *   <li>unitCost * puchSize
	 *   <li>計算した値を小数桁 decimalFig でまるめ
	 *       （roundTyp が、定数 CEIL の場合は切り上げ、
	 *       定数 FLOOR の場合は切り下げ、それ以外の場合は四捨五入）
	 *   <li>まるめた値を"0.00"形式でフォーマット
	 * </ol>
	 * @param puchSize 発注数
	 * @param unitCost 単価
	 * @param roundTyp 発注金額まるめ区分
	 * @param decimalFig 小数桁数
	 * @return 発注金額
	 */
	public static String calcPuchOdrAmount(
		String unitCost,
		String puchSize,
		String roundTyp,
		String decimalFig) {

		String puchOdrAmount = Calculate.multiply(unitCost, puchSize);
		puchOdrAmount = roundAmount(puchOdrAmount, roundTyp, decimalFig);
		puchOdrAmount = Calculate.formatNumric(puchOdrAmount, FORMAT_FIGURE);

		return puchOdrAmount;
	}

	/**
	 * 本体金額を計算します。
	 * <p>
	 * 本体金額は以下の手順で計算されます。
	 * <ol>
	 *   <li>puchOdrAmount - discAmount
	 *   <li>計算した値を"0.00"形式でフォーマット
	 * </ol>
	 * @param puchOdrAmount 発注金額
	 * @param discAmount 値引金額 
	 * @return 本体金額
	 */
	public static String calcNetAmount(
		String puchOdrAmount,
		String discAmount) {

		String netAmount = Calculate.subtract(puchOdrAmount, discAmount);
		netAmount = Calculate.formatNumric(netAmount, FORMAT_FIGURE);

		return netAmount;
	}

	/**
	 * 値引金額を計算します。
	 * <p>
	 * 値引金額は以下の手順で計算されます。
	 * <ol>
	 *   <li>puchOdrAmount - netAmount
	 *   <li>計算した値を"0.00"形式でフォーマット
	 * </ol>
	 * @param puchOdrAmount 発注金額
	 * @param netAmount 本体金額 
	 * @return 値引金額
	 */
	public static String calcDiscAmount(
		String puchOdrAmount,
		String netAmount) {

		String discAmount = Calculate.subtract(puchOdrAmount, netAmount);
		discAmount = Calculate.formatNumric(discAmount, FORMAT_FIGURE);

		return discAmount;
	}

	/**
	 * 税額を計算します。
	 * <p>
	 * 税額は以下の手順で計算されます。
	 * <ol>
	 *   <li>netAmount * (taxRate / 100)
	 *   <li>計算した値を小数桁 decimalFig でまるめ
	 *       （taxRoundTyp が、定数 CEIL の場合は切り上げ、
	 *       定数 FLOOR の場合は切り下げ、それ以外の場合は四捨五入）
	 *   <li>まるめた値を"0.00"形式でフォーマット
	 * </ol>
	 * @param netAmount 本体金額
	 * @param taxRate 税率
	 * @param taxRoundTyp 税端数区分
	 * @param decimalFig 小数桁数
	 * @return 税額
	 */
	public static String calcTaxAmount(
		String netAmount,
		String taxRate,
		String taxRoundTyp,
		String decimalFig) {

		String taxAmount =
			Calculate.divide(taxRate, "100", 6, Calculate._FLOOR);

		taxAmount = Calculate.multiply(netAmount, taxAmount);
		taxAmount = roundAmount(taxAmount, taxRoundTyp, decimalFig);
		taxAmount = Calculate.formatNumric(taxAmount, FORMAT_FIGURE);

		return taxAmount;
	}

	/**
	 * 税込金額を計算します。
	 * <p>
	 * 税込金額は以下の手順で計算されます。
	 * <ol>
	 *   <li>netAmount + taxAmount1 + taxAmount2 + taxAmount3
	 *   <li>計算した値を"0.00"形式でフォーマット
	 * </ol>
	 * @param netAmount 本体金額
	 * @param taxAmount1 税額1
	 * @param taxAmount2 税額2
	 * @param taxAmount3 税額3
	 * @return 税込金額
	 */
	public static String calcAmountIncludeTax(
		String netAmount,
		String taxAmount1,
		String taxAmount2,
		String taxAmount3) {

		String amountIncludeTax = Calculate.add(netAmount, taxAmount1);
		amountIncludeTax = Calculate.add(amountIncludeTax, taxAmount2);
		amountIncludeTax = Calculate.add(amountIncludeTax, taxAmount3);
		amountIncludeTax =
			Calculate.formatNumric(amountIncludeTax, FORMAT_FIGURE);

		return amountIncludeTax;
	}

	/**
	 * 邦貨金額を計算します。
	 * <p>
	 * 邦貨金額は以下の手順で計算されます。
	 * <ol>
	 *   <li>amountIncludeTax * exchRate
	 *   <li>計算した値を小数桁 decimalFig でまるめ
	 *       （roundTyp が、定数 CEIL の場合は切り上げ、
	 *       定数 FLOOR の場合は切り下げ、それ以外の場合は四捨五入）
	 *   <li>まるめた値を"0.00"形式でフォーマット
	 * </ol>
	 * @param amountIncludeTax 税込金額
	 * @param exchRate 為替レート
	 * @param roundTyp まるめ区分
	 * @param decimalFig 小数桁数
	 * @return 変換後金額
	 */
	public static String calcHomeCurAmount(
		String amountIncludeTax,
		String exchRate,
		String roundTyp,
		String decimalFig) {

		String homeCurAmount = Calculate.multiply(amountIncludeTax, exchRate);
		homeCurAmount = roundAmount(homeCurAmount, roundTyp, decimalFig);
		homeCurAmount = Calculate.formatNumric(homeCurAmount, FORMAT_FIGURE);

		return homeCurAmount;
	}

	/**
	 * 外貨金額を計算します。
	 * <p>
	 * 外貨金額は以下の手順で計算されます。
	 * <ol>
	 *   <li>homeCurAmount / exchRate
	 *   <li>計算した値を小数桁 decimalFig でまるめ
	 *       （roundTyp が、定数 CEIL の場合は切り上げ、
	 *       定数 FLOOR の場合は切り下げ、それ以外の場合は四捨五入）
	 *   <li>まるめた値を"0.00"形式でフォーマット
	 * </ol>
	 * @param homeCurAmount 邦貨金額
	 * @param exchRate 為替レート
	 * @param roundTyp まるめ区分
	 * @param decimalFig 小数桁数
	 * @return 変換後金額
	 */
	public static String calcForeignCurAmount(
		String homeCurAmount,
		String exchRate,
		String roundTyp,
		String decimalFig) {

		String foreignCurAmount = null;
		if (CEIL.equals(roundTyp)) {
			foreignCurAmount =
				Calculate.divide(
					homeCurAmount,
					exchRate,
					Integer.parseInt(decimalFig),
					Calculate._CEIL);
		} else if (FLOOR.equals(roundTyp)) {
			foreignCurAmount =
				Calculate.divide(
					homeCurAmount,
					exchRate,
					Integer.parseInt(decimalFig),
					Calculate._FLOOR);
		} else {
			foreignCurAmount =
				Calculate.divide(
					homeCurAmount,
					exchRate,
					Integer.parseInt(decimalFig),
					Calculate._ROUND);
		}
		foreignCurAmount = Calculate.formatNumric(homeCurAmount, FORMAT_FIGURE);

		return foreignCurAmount;
	}

	/**
	 * 金額のまるめ処理を行います。
	 * <p>
	 * roundTyp が定数 CEILの場合、amount を小数桁 decimalFig で切り上げ、
	 * roundTyp が定数 FLOOR の場合、amount を小数桁 decimalFig で切り捨て、
	 * roundTyp がそれ以外の場合、amount を小数桁 decimalFig で四捨五入します。
	 * @param amount まるめ対象金額
	 * @param roundTyp まるめ区分
	 * @param decimalFig まるめ小数桁数
	 * @return まるめ後金額
	 */
	public static String roundAmount(
		String amount,
		String roundTyp,
		String decimalFig) {

		String roundAmount = null;

		if (CEIL.equals(roundTyp)) {
			roundAmount = Calculate.ceil(amount, Integer.parseInt(decimalFig));
		} else if (FLOOR.equals(roundTyp)) {
			roundAmount = Calculate.floor(amount, Integer.parseInt(decimalFig));
		} else {
			roundAmount = Calculate.round(amount, Integer.parseInt(decimalFig));
		}

		return roundAmount;
	}
}
