/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/expj/sa/amount/SaAmountCalculator.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.sa.amount;

import com.nec.jp.orteus.expj.util.Calculate;

/**
 * 販売管理用金額計算メソッド群
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.1 $ $Date: 2015/09/25 05:53:17 $
 */
public class SaAmountCalculator {

	/**
	 * staticメソッド群クラスのため、コンストラクタをprivateとしています。
	 */
	private SaAmountCalculator() {
	}

	/**
	 * 消費税コードより、課税方法（消費税コードの3桁目）を切り出して返します。
	 * @param taxCd 消費税コード
	 * @return 課税方法（消費税コードの3桁目）
	 */
	private static String getTaxationType(String taxCd) {
		return taxCd.substring(2, 3);
	}

	/**
	 * 課税方法（消費税コードの3桁目）が外税か否かを返します。
	 * @param taxCd 消費税コード
	 * @return 外税の場合は <code>true</code> それ以外の場合は <code>false</code> を返します。
	 */
	private static boolean isExternalTax(String taxCd) {
		String taxationType = getTaxationType(taxCd);
		return "1".equals(taxationType);
	}

	/**
	 * 課税方法（消費税コードの3桁目）が内税か否かを返します。
	 * @param taxCd 消費税コード
	 * @return 内税の場合は <code>true</code> それ以外の場合は <code>false</code> を返します。
	 */
	private static boolean isInternalTax(String taxCd) {
		String taxationType = getTaxationType(taxCd);
		return ("5".equals(taxationType) || "9".equals(taxationType));
	}

	/**
	 * 課税方法（消費税コードの3桁目）が非課税か否かを返します。
	 * @param taxCd 消費税コード
	 * @return 非課税の場合は <code>true</code> それ以外の場合は <code>false</code> を返します。
	 */
	private static boolean isTaxfree(String taxCd) {
		String taxationType = getTaxationType(taxCd);
		return "0".equals(taxationType);
	}

	/**
	 * パラメータを基に外税対象金額を返します。
	 * @param taxCd 消費税コード
	 * @param salesAmountExchRates 売上実績金額(邦貨)
	 * @return 外税対象金額
	 */
	public static String calcExternalTaxSalesAmount(String taxCd, String salesAmountExchRates) {

		if (isExternalTax(taxCd)) {
			return salesAmountExchRates;
		} else {
			return "0";
		}
	}

	/**
	 * パラメータを基に内税対象金額を返します。
	 * @param taxCd 消費税コード
	 * @param salesAmountExchRates 売上実績金額(邦貨)
	 * @return 内税対象金額
	 */
	public static String calcInternalTaxSalesAmount(String taxCd, String salesAmountExchRates) {

		if (isInternalTax(taxCd)) {
			return salesAmountExchRates;
		} else {
			return "0";
		}
	}

	/**
	 * パラメータを基に非課税対象金額を返します。
	 * @param taxCd 消費税コード
	 * @param salesAmountExchRates 売上実績金額(邦貨)
	 * @return 非課税対象金額
	 */
	public static String calcTaxfreeSalesAmount(String taxCd, String salesAmountExchRates) {

		if (isTaxfree(taxCd)) {
			return salesAmountExchRates;
		} else {
			return "0";
		}
	}

	/**
	 * パラメータを基に税額を返します。
	 * @param taxCd 消費税コード
	 * @param salesAmountExchRates 売上実績金額(邦貨)
	 * @param taxRate 税率
	 * @param decimalFig 小数桁数
	 * @param taxRoundTyp 税端数区分
	 * @return 税額
	 */
	public static String calcTaxAmount(
		String taxCd,
		String salesAmountExchRates,
		String taxRate,
		String decimalFig,
		String taxRoundTyp) {

		if (isExternalTax(taxCd)) {
			int roundTyp = 0;
			if ("2".equals(taxRoundTyp)) {
				roundTyp = Calculate.CEIL;
			} else if ("3".equals(taxRoundTyp)) {
				roundTyp = Calculate.FLOOR;
			} else {
				roundTyp = Calculate.ROUND;
			}
			int fig = Integer.parseInt(decimalFig);
			String work = Calculate.multiply(salesAmountExchRates, taxRate);
			return Calculate.divide(work, "100", fig, roundTyp);
		} else if (isInternalTax(taxCd)) {
			int roundTyp = 0;
			if ("2".equals(taxRoundTyp)) {
				roundTyp = Calculate.CEIL;
			} else if ("3".equals(taxRoundTyp)) {
				roundTyp = Calculate.FLOOR;
			} else {
				roundTyp = Calculate.ROUND;
			}
			int fig = Integer.parseInt(decimalFig);
			String work = Calculate.multiply(salesAmountExchRates, taxRate);
			return Calculate.divide(work, Calculate.add("100", taxRate), fig, roundTyp);
		} else {
			return "0";
		}
	}

	/**
	 * パラメータを基に消費税額（外税）を返します。
	 * @param taxCd 消費税コード
	 * @param taxAmount1 税額1
	 * @param taxAmount2 税額2
	 * @param taxAmount3 税額3
	 * @return 消費税額（外税）
	 */
	public static String calcExternalTaxAmount(
		String taxCd,
		String taxAmount1,
		String taxAmount2,
		String taxAmount3) {

		if (isExternalTax(taxCd)) {
			String work = Calculate.add(taxAmount1, taxAmount2);
			return Calculate.add(work, taxAmount3);
		} else {
			return "0";
		}
	}

	/**
	 * パラメータを基に消費税額（内税）を返します。
	 * @param taxCd 消費税コード
	 * @param taxAmount1 税額1
	 * @param taxAmount2 税額2
	 * @param taxAmount3 税額3
	 * @return 消費税額（内税）
	 */
	public static String calcInternalTaxAmount(
		String taxCd,
		String taxAmount1,
		String taxAmount2,
		String taxAmount3) {

		if (isInternalTax(taxCd)) {
			String work = Calculate.add(taxAmount1, taxAmount2);
			return Calculate.add(work, taxAmount3);
		} else {
			return "0";
		}
	}

	/**
	 * パラメータを基に税抜売上金額を返します。
	 * @param externalTaxSalesAmount 外税対象金額
	 * @param internalTaxSalesAmount 内税対象金額
	 * @param taxfreeSalesAmount 非課税対象金額
	 * @param internalTaxAmount 消費税額（内税）
	 * @return 税抜売上金額
	 */
	public static String calcTaxCreditSalesAmount(
		String externalTaxSalesAmount,
		String internalTaxSalesAmount,
		String taxfreeSalesAmount,
		String internalTaxAmount) {

		String work = Calculate.add(externalTaxSalesAmount, internalTaxSalesAmount);
		work = Calculate.add(work, taxfreeSalesAmount);
		return Calculate.subtract(work, internalTaxAmount);
	}
}
