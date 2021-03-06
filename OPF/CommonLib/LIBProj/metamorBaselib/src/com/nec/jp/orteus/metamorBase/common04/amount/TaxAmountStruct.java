/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/TaxAmountStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * 消費税情報データクラス
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 08:30:30 $
 */
public class TaxAmountStruct {

	/** 外税対象金額 */
	private String EXTERNAL_TAX_AMOUNT;
	/** 内税対象金額 */
	private String INTERNAL_TAX_AMOUNT;
	/** 非課税対象金額 */
	private String TAXFREE_AMOUNT;
	/** 税額１ */
	private String TAX_AMOUNT_1;
	/** 税額２ */
	private String TAX_AMOUNT_2;
	/** 税額３ */
	private String TAX_AMOUNT_3;
	/** 税込み金額 */
	private String TAX_AMOUNT;
	/** 税抜き金額 */
	private String TAX_CREDIT_AMOUNT;

	/**
	 * 外税対象金額を返します。
	 * @return 外税対象金額
	 */
	public String getEXTERNAL_TAX_AMOUNT() {
		return EXTERNAL_TAX_AMOUNT;
	}

	/**
	 * 内税対象金額を返します。
	 * @return 内税対象金額
	 */
	public String getINTERNAL_TAX_AMOUNT() {
		return INTERNAL_TAX_AMOUNT;
	}

	/**
	 * 非課税対象金額を返します。
	 * @return 非課税対象金額
	 */
	public String getTAXFREE_AMOUNT() {
		return TAXFREE_AMOUNT;
	}

	/**
	 * 税額１を返します。
	 * @return 税額１
	 */
	public String getTAX_AMOUNT_1() {
		return TAX_AMOUNT_1;
	}

	/**
	 * 税額２を返します。
	 * @return 税額２
	 */
	public String getTAX_AMOUNT_2() {
		return TAX_AMOUNT_2;
	}

	/**
	 * 税額３を返します。
	 * @return 税額３
	 */
	public String getTAX_AMOUNT_3() {
		return TAX_AMOUNT_3;
	}

	/**
	 * 税込み金額を設定します。
	 * @return 税込み金額
	 */
	public String getTAX_AMOUNT() {
		return TAX_AMOUNT;
	}
   
   /**
	 * 税抜き金額を設定します。
	 * @return 税抜き金額
	 */
	public String getTAX_CREDIT_AMOUNT() {
		return TAX_CREDIT_AMOUNT;
	}
   
	/**
	 * 外税対象金額を設定します。
	 * @param string 外税対象金額
	 */
	public void setEXTERNAL_TAX_AMOUNT(String string) {
		EXTERNAL_TAX_AMOUNT = string;
	}

	/**
	 * 内税対象金額を設定します。
	 * @param string 内税対象金額
	 */
	public void setINTERNAL_TAX_AMOUNT(String string) {
		INTERNAL_TAX_AMOUNT = string;
	}

	/**
	 * 非課税対象金額を設定します。
	 * @param string非課税対象金額
	 */
	public void setTAXFREE_AMOUNT(String string) {
		TAXFREE_AMOUNT = string;
	}

	/**
	 * 税額１を設定します。
	 * @param string 税額１
	 */
	public void setTAX_AMOUNT_1(String string) {
		TAX_AMOUNT_1 = string;
	}

	/**
	 * 税額２を設定します。
	 * @param string 税額２
	 */
	public void setTAX_AMOUNT_2(String string) {
		TAX_AMOUNT_2 = string;
	}

	/**
	 * 税額３を設定します。
	 * @param string 税額３
	 */
	public void setTAX_AMOUNT_3(String string) {
		TAX_AMOUNT_3 = string;
	}

	/**
	 * 税込み金額を設定します。
	 * @param string 税込み金額
	 */
	public void setTAX_AMOUNT(String string) {
		TAX_AMOUNT = string;
	}

	/**
	 * 税抜き金額を設定します。
	 * @param string 税抜き金額
	 */
	public void setTAX_CREDIT_AMOUNT(String string) {
		TAX_CREDIT_AMOUNT = string;
	}
}
