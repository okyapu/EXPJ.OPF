/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/TaxAmountStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * Á”ïÅî•ñƒf[ƒ^ƒNƒ‰ƒX
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 08:30:30 $
 */
public class TaxAmountStruct {

	/** ŠOÅ‘ÎÛ‹àŠz */
	private String EXTERNAL_TAX_AMOUNT;
	/** “àÅ‘ÎÛ‹àŠz */
	private String INTERNAL_TAX_AMOUNT;
	/** ”ñ‰ÛÅ‘ÎÛ‹àŠz */
	private String TAXFREE_AMOUNT;
	/** ÅŠz‚P */
	private String TAX_AMOUNT_1;
	/** ÅŠz‚Q */
	private String TAX_AMOUNT_2;
	/** ÅŠz‚R */
	private String TAX_AMOUNT_3;
	/** Å‚İ‹àŠz */
	private String TAX_AMOUNT;
	/** Å”²‚«‹àŠz */
	private String TAX_CREDIT_AMOUNT;

	/**
	 * ŠOÅ‘ÎÛ‹àŠz‚ğ•Ô‚µ‚Ü‚·B
	 * @return ŠOÅ‘ÎÛ‹àŠz
	 */
	public String getEXTERNAL_TAX_AMOUNT() {
		return EXTERNAL_TAX_AMOUNT;
	}

	/**
	 * “àÅ‘ÎÛ‹àŠz‚ğ•Ô‚µ‚Ü‚·B
	 * @return “àÅ‘ÎÛ‹àŠz
	 */
	public String getINTERNAL_TAX_AMOUNT() {
		return INTERNAL_TAX_AMOUNT;
	}

	/**
	 * ”ñ‰ÛÅ‘ÎÛ‹àŠz‚ğ•Ô‚µ‚Ü‚·B
	 * @return ”ñ‰ÛÅ‘ÎÛ‹àŠz
	 */
	public String getTAXFREE_AMOUNT() {
		return TAXFREE_AMOUNT;
	}

	/**
	 * ÅŠz‚P‚ğ•Ô‚µ‚Ü‚·B
	 * @return ÅŠz‚P
	 */
	public String getTAX_AMOUNT_1() {
		return TAX_AMOUNT_1;
	}

	/**
	 * ÅŠz‚Q‚ğ•Ô‚µ‚Ü‚·B
	 * @return ÅŠz‚Q
	 */
	public String getTAX_AMOUNT_2() {
		return TAX_AMOUNT_2;
	}

	/**
	 * ÅŠz‚R‚ğ•Ô‚µ‚Ü‚·B
	 * @return ÅŠz‚R
	 */
	public String getTAX_AMOUNT_3() {
		return TAX_AMOUNT_3;
	}

	/**
	 * Å‚İ‹àŠz‚ğİ’è‚µ‚Ü‚·B
	 * @return Å‚İ‹àŠz
	 */
	public String getTAX_AMOUNT() {
		return TAX_AMOUNT;
	}
   
   /**
	 * Å”²‚«‹àŠz‚ğİ’è‚µ‚Ü‚·B
	 * @return Å”²‚«‹àŠz
	 */
	public String getTAX_CREDIT_AMOUNT() {
		return TAX_CREDIT_AMOUNT;
	}
   
	/**
	 * ŠOÅ‘ÎÛ‹àŠz‚ğİ’è‚µ‚Ü‚·B
	 * @param string ŠOÅ‘ÎÛ‹àŠz
	 */
	public void setEXTERNAL_TAX_AMOUNT(String string) {
		EXTERNAL_TAX_AMOUNT = string;
	}

	/**
	 * “àÅ‘ÎÛ‹àŠz‚ğİ’è‚µ‚Ü‚·B
	 * @param string “àÅ‘ÎÛ‹àŠz
	 */
	public void setINTERNAL_TAX_AMOUNT(String string) {
		INTERNAL_TAX_AMOUNT = string;
	}

	/**
	 * ”ñ‰ÛÅ‘ÎÛ‹àŠz‚ğİ’è‚µ‚Ü‚·B
	 * @param string”ñ‰ÛÅ‘ÎÛ‹àŠz
	 */
	public void setTAXFREE_AMOUNT(String string) {
		TAXFREE_AMOUNT = string;
	}

	/**
	 * ÅŠz‚P‚ğİ’è‚µ‚Ü‚·B
	 * @param string ÅŠz‚P
	 */
	public void setTAX_AMOUNT_1(String string) {
		TAX_AMOUNT_1 = string;
	}

	/**
	 * ÅŠz‚Q‚ğİ’è‚µ‚Ü‚·B
	 * @param string ÅŠz‚Q
	 */
	public void setTAX_AMOUNT_2(String string) {
		TAX_AMOUNT_2 = string;
	}

	/**
	 * ÅŠz‚R‚ğİ’è‚µ‚Ü‚·B
	 * @param string ÅŠz‚R
	 */
	public void setTAX_AMOUNT_3(String string) {
		TAX_AMOUNT_3 = string;
	}

	/**
	 * Å‚İ‹àŠz‚ğİ’è‚µ‚Ü‚·B
	 * @param string Å‚İ‹àŠz
	 */
	public void setTAX_AMOUNT(String string) {
		TAX_AMOUNT = string;
	}

	/**
	 * Å”²‚«‹àŠz‚ğİ’è‚µ‚Ü‚·B
	 * @param string Å”²‚«‹àŠz
	 */
	public void setTAX_CREDIT_AMOUNT(String string) {
		TAX_CREDIT_AMOUNT = string;
	}
}
