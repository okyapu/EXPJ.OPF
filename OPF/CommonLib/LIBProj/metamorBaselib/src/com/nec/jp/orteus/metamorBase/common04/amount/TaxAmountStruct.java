/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/TaxAmountStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * ����ŏ��f�[�^�N���X
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 08:30:30 $
 */
public class TaxAmountStruct {

	/** �O�őΏۋ��z */
	private String EXTERNAL_TAX_AMOUNT;
	/** ���őΏۋ��z */
	private String INTERNAL_TAX_AMOUNT;
	/** ��ېőΏۋ��z */
	private String TAXFREE_AMOUNT;
	/** �Ŋz�P */
	private String TAX_AMOUNT_1;
	/** �Ŋz�Q */
	private String TAX_AMOUNT_2;
	/** �Ŋz�R */
	private String TAX_AMOUNT_3;
	/** �ō��݋��z */
	private String TAX_AMOUNT;
	/** �Ŕ������z */
	private String TAX_CREDIT_AMOUNT;

	/**
	 * �O�őΏۋ��z��Ԃ��܂��B
	 * @return �O�őΏۋ��z
	 */
	public String getEXTERNAL_TAX_AMOUNT() {
		return EXTERNAL_TAX_AMOUNT;
	}

	/**
	 * ���őΏۋ��z��Ԃ��܂��B
	 * @return ���őΏۋ��z
	 */
	public String getINTERNAL_TAX_AMOUNT() {
		return INTERNAL_TAX_AMOUNT;
	}

	/**
	 * ��ېőΏۋ��z��Ԃ��܂��B
	 * @return ��ېőΏۋ��z
	 */
	public String getTAXFREE_AMOUNT() {
		return TAXFREE_AMOUNT;
	}

	/**
	 * �Ŋz�P��Ԃ��܂��B
	 * @return �Ŋz�P
	 */
	public String getTAX_AMOUNT_1() {
		return TAX_AMOUNT_1;
	}

	/**
	 * �Ŋz�Q��Ԃ��܂��B
	 * @return �Ŋz�Q
	 */
	public String getTAX_AMOUNT_2() {
		return TAX_AMOUNT_2;
	}

	/**
	 * �Ŋz�R��Ԃ��܂��B
	 * @return �Ŋz�R
	 */
	public String getTAX_AMOUNT_3() {
		return TAX_AMOUNT_3;
	}

	/**
	 * �ō��݋��z��ݒ肵�܂��B
	 * @return �ō��݋��z
	 */
	public String getTAX_AMOUNT() {
		return TAX_AMOUNT;
	}
   
   /**
	 * �Ŕ������z��ݒ肵�܂��B
	 * @return �Ŕ������z
	 */
	public String getTAX_CREDIT_AMOUNT() {
		return TAX_CREDIT_AMOUNT;
	}
   
	/**
	 * �O�őΏۋ��z��ݒ肵�܂��B
	 * @param string �O�őΏۋ��z
	 */
	public void setEXTERNAL_TAX_AMOUNT(String string) {
		EXTERNAL_TAX_AMOUNT = string;
	}

	/**
	 * ���őΏۋ��z��ݒ肵�܂��B
	 * @param string ���őΏۋ��z
	 */
	public void setINTERNAL_TAX_AMOUNT(String string) {
		INTERNAL_TAX_AMOUNT = string;
	}

	/**
	 * ��ېőΏۋ��z��ݒ肵�܂��B
	 * @param string��ېőΏۋ��z
	 */
	public void setTAXFREE_AMOUNT(String string) {
		TAXFREE_AMOUNT = string;
	}

	/**
	 * �Ŋz�P��ݒ肵�܂��B
	 * @param string �Ŋz�P
	 */
	public void setTAX_AMOUNT_1(String string) {
		TAX_AMOUNT_1 = string;
	}

	/**
	 * �Ŋz�Q��ݒ肵�܂��B
	 * @param string �Ŋz�Q
	 */
	public void setTAX_AMOUNT_2(String string) {
		TAX_AMOUNT_2 = string;
	}

	/**
	 * �Ŋz�R��ݒ肵�܂��B
	 * @param string �Ŋz�R
	 */
	public void setTAX_AMOUNT_3(String string) {
		TAX_AMOUNT_3 = string;
	}

	/**
	 * �ō��݋��z��ݒ肵�܂��B
	 * @param string �ō��݋��z
	 */
	public void setTAX_AMOUNT(String string) {
		TAX_AMOUNT = string;
	}

	/**
	 * �Ŕ������z��ݒ肵�܂��B
	 * @param string �Ŕ������z
	 */
	public void setTAX_CREDIT_AMOUNT(String string) {
		TAX_CREDIT_AMOUNT = string;
	}
}
