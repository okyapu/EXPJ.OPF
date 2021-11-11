/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/SbcntUnitCostStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * �O���P�����f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:36 $
 */
public class SbcntUnitCostStruct {
	/** �O���P���L���J�n�� */
	private String EFF_PHASE_IN_DATE;
	/** �T�C�Y */
	private String SBCNT_SIZE;
	/** �O���P���敪 */
	private String UNIT_COST_TYP;
	/** �O���P�� */
	private String UNIT_COST;
	/** �O�����H�� */
	private String PROCESSING_COST;
	/** �O���ޗ��� */
	private String MATERIAL_COST;
	/** �O�����̑��o�� */
	private String OTHER_OVERHEADS;
	/** �󒍋��z */
	private String PUCH_ODR_AMOUNT;
	/** �l�����z */
	private String DISC_AMOUNT;
	/** �l������z */
	private String AFTER_DISC_AMOUNT;
	/** ���M�݋��z */
	private String PROVISIONAL_HOME_CUR_AMOUNT;
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
	/** �ב֗\��R�[�h */
	private String EXCH_RESERVE_CD;
	/** �ב֊J�n���t */
	private String EXCH_START_DATE;
	/** �ב֏I�����t */
	private String EXCH_END_DATE;
	/** �בփ��[�g */
	private String EXCH_RATE;

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
	 * �O���P���L���J�n����Ԃ��܂��B
	 * @return �O���P���L���J�n��
	 */
	public String getEFF_PHASE_IN_DATE() {
		return EFF_PHASE_IN_DATE;
	}

	/**
	 * �ב֎�ʂ�Ԃ��܂��B
	 * @return �ב֎��
	 */
	public String getEXCH_TYP() {
		return EXCH_TYP;
	}

	/**
	 * �O���ޗ����Ԃ��܂��B
	 * @return �O���ޗ���
	 */
	public String getMATERIAL_COST() {
		return MATERIAL_COST;
	}

	/**
	 * �O�����̑��o���Ԃ��܂��B
	 * @return �O�����̑��o��
	 */
	public String getOTHER_OVERHEADS() {
		return OTHER_OVERHEADS;
	}

	/**
	 * �O�����H���Ԃ��܂��B
	 * @return �O�����H��
	 */
	public String getPROCESSING_COST() {
		return PROCESSING_COST;
	}

	/**
	 * �󒍋��z��Ԃ��܂��B
	 * @return �󒍋��z
	 */
	public String getPUCH_ODR_AMOUNT() {
		return PUCH_ODR_AMOUNT;
	}

	/**
	 * �������z�܂�ߋ敪��Ԃ��܂��B
	 * @return �������z�܂�ߋ敪
	 */
	public String getROUND_TYP() {
		return ROUND_TYP;
	}

	/**
	 * �T�C�Y��Ԃ��܂��B
	 * @return �T�C�Y
	 */
	public String getSBCNT_SIZE() {
		return SBCNT_SIZE;
	}

	/**
	 * �O���P����Ԃ��܂��B
	 * @return �O���P��
	 */
	public String getUNIT_COST() {
		return UNIT_COST;
	}

	/**
	 * �O���P���敪��Ԃ��܂��B
	 * @return �O���P���敪
	 */
	public String getUNIT_COST_TYP() {
		return UNIT_COST_TYP;
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
	 * �O���P���L���J�n����ݒ肵�܂��B
	 * @param string �O���P���L���J�n��
	 */
	public void setEFF_PHASE_IN_DATE(String string) {
		EFF_PHASE_IN_DATE = string;
	}

	/**
	 * �ב֎�ʂ�ݒ肵�܂��B
	 * @param string �ב֎�� 
	 */
	public void setEXCH_TYP(String string) {
		EXCH_TYP = string;
	}

	/**
	 * �O���ޗ����ݒ肵�܂��B
	 * @param string �O���ޗ���
	 */
	public void setMATERIAL_COST(String string) {
		MATERIAL_COST = string;
	}

	/**
	 * �O�����̑��o���ݒ肵�܂��B
	 * @param string �O�����̑��o��
	 */
	public void setOTHER_OVERHEADS(String string) {
		OTHER_OVERHEADS = string;
	}

	/**
	 * �O�����H���ݒ肵�܂��B
	 * @param string �O�����H��
	 */
	public void setPROCESSING_COST(String string) {
		PROCESSING_COST = string;
	}

	/**
	 * �󒍋��z��ݒ肵�܂��B
	 * @param string �󒍋��z
	 */
	public void setPUCH_ODR_AMOUNT(String string) {
		PUCH_ODR_AMOUNT = string;
	}

	/**
	 * �������z�܂�ߋ敪��ݒ肵�܂��B
	 * @param string �������z�܂�ߋ敪
	 */
	public void setROUND_TYP(String string) {
		ROUND_TYP = string;
	}

	/**
	 * �T�C�Y��ݒ肵�܂��B
	 * @param string �T�C�Y
	 */
	public void setSBCNT_SIZE(String string) {
		SBCNT_SIZE = string;
	}

	/**
	 * �O���P����ݒ肵�܂��B
	 * @param string �O���P��
	 */
	public void setUNIT_COST(String string) {
		UNIT_COST = string;
	}

	/**
	 * �O���P���敪��ݒ肵�܂��B
	 * @param string �O���P���敪
	 */
	public void setUNIT_COST_TYP(String string) {
		UNIT_COST_TYP = string;
	}

	/**
	 * �l������z��Ԃ��܂��B
	 * @return �l������z
	 */
	public String getAFTER_DISC_AMOUNT() {
		return AFTER_DISC_AMOUNT;
	}

	/**
	 * �l�����z��Ԃ��܂��B
	 * @return �l�����z
	 */
	public String getDISC_AMOUNT() {
		return DISC_AMOUNT;
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
	 * ���M�݋��z��Ԃ��܂��B
	 * @return ���M�݋��z
	 */
	public String getPROVISIONAL_HOME_CUR_AMOUNT() {
		return PROVISIONAL_HOME_CUR_AMOUNT;
	}

	/**
	 * �l������z��ݒ肵�܂��B
	 * @param string �l������z
	 */
	public void setAFTER_DISC_AMOUNT(String string) {
		AFTER_DISC_AMOUNT = string;
	}

	/**
	 * �l�����z��ݒ肵�܂��B
	 * @param string �l�����z
	 */
	public void setDISC_AMOUNT(String string) {
		DISC_AMOUNT = string;
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
	 * ���M�݋��z��ݒ肵�܂��B
	 * @param string ���M�݋��z
	 */
	public void setPROVISIONAL_HOME_CUR_AMOUNT(String string) {
		PROVISIONAL_HOME_CUR_AMOUNT = string;
	}

}
