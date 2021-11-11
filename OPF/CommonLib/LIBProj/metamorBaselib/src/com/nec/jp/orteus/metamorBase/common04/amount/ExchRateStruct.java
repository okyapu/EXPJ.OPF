/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/ExchRateStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * �בփ��[�g���f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class ExchRateStruct {

	/** ��ЃR�[�h */
	private String COMPANY_CD;
	/** �ʉ݃R�[�h */
	private String CUR_CD;
	/** �ב֎�� */
	private String EXCH_TYP;
	/** �ב֗\��R�[�h */
	private String EXCH_RESERVE_CD;
	/** �ב֊J�n���t */
	private String EXCH_START_DATE;
	/** �ב֏I�����t */
	private String EXCH_END_DATE;
	/** �בփ��[�g */
	private String EXCH_RATE;

	/**
	 * ��ЃR�[�h��Ԃ��܂��B
	 * @return ��ЃR�[�h
	 */
	public String getCOMPANY_CD() {
		return COMPANY_CD;
	}

	/**
	 * �ʉ݃R�[�h��Ԃ��܂��B
	 * @return �ʉ݃R�[�h
	 */
	public String getCUR_CD() {
		return CUR_CD;
	}

	/**
	 * �ב֏I�����t��Ԃ��܂��B
	 * @return �ב֏I�����t
	 */
	public String getEXCH_END_DATE() {
		return EXCH_END_DATE;
	}

	/**
	 * �בփ��[�g��Ԃ��܂��B
	 * @return �בփ��[�g
	 */
	public String getEXCH_RATE() {
		return EXCH_RATE;
	}

	/**
	 * �ב֗\��R�[�h��Ԃ��܂��B
	 * @return �ב֗\��R�[�h
	 */
	public String getEXCH_RESERVE_CD() {
		return EXCH_RESERVE_CD;
	}

	/**
	 * �ב֊J�n���t��Ԃ��܂��B
	 * @return �ב֊J�n���t
	 */
	public String getEXCH_START_DATE() {
		return EXCH_START_DATE;
	}

	/**
	 * �ב֎�ʂ�Ԃ��܂��B
	 * @return �ב֎��
	 */
	public String getEXCH_TYP() {
		return EXCH_TYP;
	}

	/**
	 * ��ЃR�[�h��ݒ肵�܂��B
	 * @param string ��ЃR�[�h
	 */
	public void setCOMPANY_CD(String string) {
		COMPANY_CD = string;
	}

	/**
	 * �ʉ݃R�[�h��ݒ肵�܂��B
	 * @param string �ʉ݃R�[�h
	 */
	public void setCUR_CD(String string) {
		CUR_CD = string;
	}

	/**
	 * �ב֏I�����t��ݒ肵�܂��B
	 * @param string �ב֏I�����t
	 */
	public void setEXCH_END_DATE(String string) {
		EXCH_END_DATE = string;
	}

	/**
	 * �בփ��[�g��ݒ肵�܂��B
	 * @param string �בփ��[�g
	 */
	public void setEXCH_RATE(String string) {
		EXCH_RATE = string;
	}

	/**
	 * �ב֗\��R�[�h��ݒ肵�܂��B
	 * @param string �ב֗\��R�[�h
	 */
	public void setEXCH_RESERVE_CD(String string) {
		EXCH_RESERVE_CD = string;
	}

	/**
	 * �ב֊J�n���t��ݒ肵�܂��B
	 * @param string �ב֊J�n���t
	 */
	public void setEXCH_START_DATE(String string) {
		EXCH_START_DATE = string;
	}

	/**
	 * �ב֎�ʂ�ݒ肵�܂��B
	 * @param string �ב֎��
	 */
	public void setEXCH_TYP(String string) {
		EXCH_TYP = string;
	}

}