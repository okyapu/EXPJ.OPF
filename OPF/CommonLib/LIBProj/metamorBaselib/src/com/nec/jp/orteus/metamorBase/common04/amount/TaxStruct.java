/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/TaxStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * 消費税情報データクラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:37 $
 */
public class TaxStruct {

	/** 消費税コード */
	private String TAX_CD;
	/** 消費税適用区分 */
	private String TAX_APPLY_TYP;
	/** 税率1 */
	private String TAX_RATE_1;
	/** 税率2 */
	private String TAX_RATE_2;
	/** 税率3 */
	private String TAX_RATE_3;
	/** 税端数区分 */
	private String TAX_ROUND_TYP;

	/**
	 * 消費税コードを返します。
	 * @return 消費税コード
	 */
	public String getTAX_CD() {
		return TAX_CD;
	}

	/**
	 * 消費税適用区分を返します。
	 * @return 消費税適用区分
	 */
	public String getTAX_APPLY_TYP() {
		return TAX_APPLY_TYP;
	}

	/**
	 * 税率1を返します。
	 * @return 税率1
	 */
	public String getTAX_RATE_1() {
		return TAX_RATE_1;
	}

	/**
	 * 税率2を返します。
	 * @return 税率2
	 */
	public String getTAX_RATE_2() {
		return TAX_RATE_2;
	}

	/**
	 * 税率3を返します。
	 * @return 税率3
	 */
	public String getTAX_RATE_3() {
		return TAX_RATE_3;
	}

	/**
	 * 税端数区分を返します。
	 * @return 税端数区分
	 */
	public String getTAX_ROUND_TYP() {
		return TAX_ROUND_TYP;
	}

	/**
	 * 消費税コードを設定します。
	 * @param string 消費税コード
	 */
	public void setTAX_CD(String string) {
		TAX_CD = string;
	}

	/**
	 * 消費税適用区分を設定します。
	 * @param string 消費税適用区分
	 */
	public void setTAX_APPLY_TYP(String string) {
		TAX_APPLY_TYP = string;
	}

	/**
	 * 税率1を設定します。
	 * @param string 税率1
	 */
	public void setTAX_RATE_1(String string) {
		TAX_RATE_1 = string;
	}

	/**
	 * 税率2を設定します。
	 * @param string 税率2
	 */
	public void setTAX_RATE_2(String string) {
		TAX_RATE_2 = string;
	}

	/**
	 * 税率3を設定します。
	 * @param string 税率3
	 */
	public void setTAX_RATE_3(String string) {
		TAX_RATE_3 = string;
	}

	/**
	 * 税端数区分を設定します。
	 * @param string 税端数区分
	 */
	public void setTAX_ROUND_TYP(String string) {
		TAX_ROUND_TYP = string;
	}
}
