/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/CurStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * �ʉݏ��f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class CurStruct {

	/** �������z�܂�ߋ敪 */
	private String ROUND_TYP;
	/**	�ב֎�� */
	private String EXCH_TYP;
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
	 * �ב֎�ʂ�Ԃ��܂��B
	 * @return �ב֎��
	 */
	public String getEXCH_TYP() {
		return EXCH_TYP;
	}

	/**
	 * �������z�܂�ߋ敪��Ԃ��܂��B
	 * @return �������z�܂�ߋ敪
	 */
	public String getROUND_TYP() {
		return ROUND_TYP;
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

	/**
	 * �ב֎�ʂ�ݒ肵�܂��B
	 * @param string �ב֎��
	 */
	public void setEXCH_TYP(String string) {
		EXCH_TYP = string;
	}

	/**
	 * �������z�܂�ߋ敪��ݒ肵�܂��B
	 * @param string �������z�܂�ߋ敪
	 */
	public void setROUND_TYP(String string) {
		ROUND_TYP = string;
	}
}
