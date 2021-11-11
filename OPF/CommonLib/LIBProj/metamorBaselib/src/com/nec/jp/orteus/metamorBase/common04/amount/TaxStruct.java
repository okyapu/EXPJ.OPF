/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/TaxStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * ����ŏ��f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:37 $
 */
public class TaxStruct {

	/** ����ŃR�[�h */
	private String TAX_CD;
	/** ����œK�p�敪 */
	private String TAX_APPLY_TYP;
	/** �ŗ�1 */
	private String TAX_RATE_1;
	/** �ŗ�2 */
	private String TAX_RATE_2;
	/** �ŗ�3 */
	private String TAX_RATE_3;
	/** �Œ[���敪 */
	private String TAX_ROUND_TYP;

	/**
	 * ����ŃR�[�h��Ԃ��܂��B
	 * @return ����ŃR�[�h
	 */
	public String getTAX_CD() {
		return TAX_CD;
	}

	/**
	 * ����œK�p�敪��Ԃ��܂��B
	 * @return ����œK�p�敪
	 */
	public String getTAX_APPLY_TYP() {
		return TAX_APPLY_TYP;
	}

	/**
	 * �ŗ�1��Ԃ��܂��B
	 * @return �ŗ�1
	 */
	public String getTAX_RATE_1() {
		return TAX_RATE_1;
	}

	/**
	 * �ŗ�2��Ԃ��܂��B
	 * @return �ŗ�2
	 */
	public String getTAX_RATE_2() {
		return TAX_RATE_2;
	}

	/**
	 * �ŗ�3��Ԃ��܂��B
	 * @return �ŗ�3
	 */
	public String getTAX_RATE_3() {
		return TAX_RATE_3;
	}

	/**
	 * �Œ[���敪��Ԃ��܂��B
	 * @return �Œ[���敪
	 */
	public String getTAX_ROUND_TYP() {
		return TAX_ROUND_TYP;
	}

	/**
	 * ����ŃR�[�h��ݒ肵�܂��B
	 * @param string ����ŃR�[�h
	 */
	public void setTAX_CD(String string) {
		TAX_CD = string;
	}

	/**
	 * ����œK�p�敪��ݒ肵�܂��B
	 * @param string ����œK�p�敪
	 */
	public void setTAX_APPLY_TYP(String string) {
		TAX_APPLY_TYP = string;
	}

	/**
	 * �ŗ�1��ݒ肵�܂��B
	 * @param string �ŗ�1
	 */
	public void setTAX_RATE_1(String string) {
		TAX_RATE_1 = string;
	}

	/**
	 * �ŗ�2��ݒ肵�܂��B
	 * @param string �ŗ�2
	 */
	public void setTAX_RATE_2(String string) {
		TAX_RATE_2 = string;
	}

	/**
	 * �ŗ�3��ݒ肵�܂��B
	 * @param string �ŗ�3
	 */
	public void setTAX_RATE_3(String string) {
		TAX_RATE_3 = string;
	}

	/**
	 * �Œ[���敪��ݒ肵�܂��B
	 * @param string �Œ[���敪
	 */
	public void setTAX_ROUND_TYP(String string) {
		TAX_ROUND_TYP = string;
	}
}
