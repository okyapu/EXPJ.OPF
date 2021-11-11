/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/TaxNameStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

/**
 * �Ŗ����f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class TaxNameStruct {

	/** SYS�R���g���[���R�[�h */
	private String CTRL_CD;
	/** �Ŗ�1 */
	private String TAX_NAME_1;
	/** �Ŗ�2 */
	private String TAX_NAME_2;
	/** �Ŗ�3 */
	private String TAX_NAME_3;

	/**
	 * SYS�R���g���[���R�[�h��Ԃ��܂��B
	 * @return SYS�R���g���[���R�[�h
	 */
	public String getCTRL_CD() {
		return CTRL_CD;
	}

	/**
	 * �Ŗ�1��Ԃ��܂��B
	 * @return �Ŗ�1
	 */
	public String getTAX_NAME_1() {
		return TAX_NAME_1;
	}

	/**
	 * �Ŗ�2��Ԃ��܂��B
	 * @return �Ŗ�2
	 */
	public String getTAX_NAME_2() {
		return TAX_NAME_2;
	}

	/**
	 * �Ŗ�3��Ԃ��܂��B
	 * @return �Ŗ�3
	 */
	public String getTAX_NAME_3() {
		return TAX_NAME_3;
	}

	/**
	 * SYS�R���g���[���R�[�h��ݒ肵�܂��B
	 * @param string SYS�R���g���[���R�[�h
	 */
	public void setCTRL_CD(String string) {
		CTRL_CD = string;
	}

	/**
	 * �Ŗ�1��ݒ肵�܂��B
	 * @param string �Ŗ�1
	 */
	public void setTAX_NAME_1(String string) {
		TAX_NAME_1 = string;
	}

	/**
	 * �Ŗ�2��ݒ肵�܂��B
	 * @param string �Ŗ�2
	 */
	public void setTAX_NAME_2(String string) {
		TAX_NAME_2 = string;
	}

	/**
	 * �Ŗ�3��ݒ肵�܂��B
	 * @param string �Ŗ�3
	 */
	public void setTAX_NAME_3(String string) {
		TAX_NAME_3 = string;
	}

}
