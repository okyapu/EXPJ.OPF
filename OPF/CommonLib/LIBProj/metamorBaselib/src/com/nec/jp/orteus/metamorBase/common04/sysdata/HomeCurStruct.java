/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/HomeCurStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

/**
 * �M�ݏ��f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class HomeCurStruct {

	/** SYS�R���g���[���R�[�h */
	private String CTRL_CD;
	/** �ʉ݃R�[�h */
	private String CUR_CD;
	/** �ʉݖ� */
	private String CUR_NAME;
	/** �ʉ݋L�� */
	private String CUR_SYMBOL;
	/** �ʉݒP�� */
	private String CUR_UNIT;
	/** �������� */
	private String DECIMAL_FIG;

	/**
	 * SYS�R���g���[���R�[�h��Ԃ��܂��B
	 * @return SYS�R���g���[���R�[�h
	 */
	public String getCTRL_CD() {
		return CTRL_CD;
	}

	/**
	 * �ʉ݃R�[�h��Ԃ��܂��B
	 * @return �ʉ݃R�[�h
	 */
	public String getCUR_CD() {
		return CUR_CD;
	}

	/**
	 * �ʉݖ���Ԃ��܂��B
	 * @return �ʉݖ�
	 */
	public String getCUR_NAME() {
		return CUR_NAME;
	}

	/**
	 * �ʉ݋L����Ԃ��܂��B
	 * @return �ʉ݋L��
	 */
	public String getCUR_SYMBOL() {
		return CUR_SYMBOL;
	}

	/**
	 * �ʉݒP�ʂ�Ԃ��܂��B
	 * @return �ʉݒP��
	 */
	public String getCUR_UNIT() {
		return CUR_UNIT;
	}

	/**
	 * ����������Ԃ��܂��B
	 * @return ��������
	 */
	public String getDECIMAL_FIG() {
		return DECIMAL_FIG;
	}

	/**
	 * SYS�R���g���[���R�[�h��ݒ肵�܂��B
	 * @param string SYS�R���g���[���R�[�h
	 */
	public void setCTRL_CD(String string) {
		CTRL_CD = string;
	}

	/**
	 * �ʉ݃R�[�h��ݒ肵�܂��B
	 * @param string �ʉ݃R�[�h
	 */
	public void setCUR_CD(String string) {
		CUR_CD = string;
	}

	/**
	 * �ʉݖ���ݒ肵�܂��B
	 * @param string �ʉݖ�
	 */
	public void setCUR_NAME(String string) {
		CUR_NAME = string;
	}

	/**
	 * �ʉ݋L����ݒ肵�܂��B
	 * @param string �ʉ݋L��
	 */
	public void setCUR_SYMBOL(String string) {
		CUR_SYMBOL = string;
	}

	/**
	 * �ʉݒP�ʂ�ݒ肵�܂��B
	 * @param string �ʉݒP��
	 */
	public void setCUR_UNIT(String string) {
		CUR_UNIT = string;
	}

	/**
	 * ����������ݒ肵�܂��B
	 * @param string ��������
	 */
	public void setDECIMAL_FIG(String string) {
		DECIMAL_FIG = string;
	}

}
