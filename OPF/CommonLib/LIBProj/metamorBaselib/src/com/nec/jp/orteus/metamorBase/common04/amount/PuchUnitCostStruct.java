/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/PuchUnitCostStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

/**
 * �w���P�����f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:36 $
 */
public class PuchUnitCostStruct {

	/** �w���P���敪 */
	private String UNIT_COST_TYP;
	/** �w���P�� */
	private String UNIT_COST;
	/** �w�����H�� */
	private String PROCESSING_COST;
	/** �w���ޗ��� */
	private String MATERIAL_COST;
	/** �w�����̑��o�� */
	private String OTHER_OVERHEADS;
	/** �l�����z */
	private String DISC_AMOUNT;
	/** �������z */
	private String PUCH_ODR_AMOUNT;
	/** �ŗ�1 */
	private String TAX_RATE_1;
	/** �ŗ�2 */
	private String TAX_RATE_2;
	/** �ŗ�3 */
	private String TAX_RATE_3;
	/** �{�̋��z */
	private String NET_AMOUNT;
	/** �Ŋz1 */
	private String TAX_AMOUNT_1;
	/** �Ŋz2 */
	private String TAX_AMOUNT_2;
	/** �Ŋz3 */
	private String TAX_AMOUNT_3;
	/** �ō����z */
	private String AMOUNT_INCLUDE_TAX;
	/** �M�݋��z */
	private String HOME_CUR_AMOUNT;
	/** �ŃR�[�h */
	private String TAX_CD;
	/** ����œK�p�敪 */
	private String TAX_APPLY_TYP;
	/** �Œ[���敪 */
	private String TAX_ROUND_TYP;
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
	 * �ō����z��Ԃ��܂��B
	 * @return �ō����z 
	 */
	public String getAMOUNT_INCLUDE_TAX() {
		return AMOUNT_INCLUDE_TAX;
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
	 * @deprecated ���̃��\�b�h�͍폜����܂��B
	 */
	public String getEXCH_RATE() {
		return EXCH_RATE;
	}

	/**
	 * �ב֗\��R�[�h��Ԃ��܂��B
	 * @return �ב֗\��R�[�h
	 * @deprecated ���̃��\�b�h�͍폜����܂��B
	 */
	public String getEXCH_RESERVE_CD() {
		return EXCH_RESERVE_CD;
	}

	/**
	 * �ב֊J�n���t��Ԃ��܂��B
	 * @return �ב֊J�n���t
	 * @deprecated ���̃��\�b�h�͍폜����܂��B
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
	 * �M�݋��z��Ԃ��܂��B
	 * @return �M�݋��z
	 */
	public String getHOME_CUR_AMOUNT() {
		return HOME_CUR_AMOUNT;
	}

	/**
	 * �w���ޗ����Ԃ��܂��B
	 * @return �w���ޗ���
	 */
	public String getMATERIAL_COST() {
		return MATERIAL_COST;
	}

	/**
	 * �{�̋��z��Ԃ��܂��B
	 * @return �{�̋��z
	 */
	public String getNET_AMOUNT() {
		return NET_AMOUNT;
	}

	/**
	 * �w�����̑��o���Ԃ��܂��B
	 * @return �w�����̑��o��
	 */
	public String getOTHER_OVERHEADS() {
		return OTHER_OVERHEADS;
	}

	/**
	 * �w�����H���Ԃ��܂��B
	 * @return �w�����H��
	 */
	public String getPROCESSING_COST() {
		return PROCESSING_COST;
	}

	/**
	 * �������z��Ԃ��܂��B
	 * @return �������z
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
	 * �Ŋz1��Ԃ��܂��B
	 * @return �Ŋz1
	 */
	public String getTAX_AMOUNT_1() {
		return TAX_AMOUNT_1;
	}

	/**
	 * �Ŋz2��Ԃ��܂��B
	 * @return �Ŋz2
	 */
	public String getTAX_AMOUNT_2() {
		return TAX_AMOUNT_2;
	}

	/**
	 * �Ŋz3��Ԃ��܂��B
	 * @return �Ŋz3
	 */
	public String getTAX_AMOUNT_3() {
		return TAX_AMOUNT_3;
	}

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
	 * �w���P����Ԃ��܂��B
	 * @return �w���P��
	 */
	public String getUNIT_COST() {
		return UNIT_COST;
	}

	/**
	 * �w���P���敪��Ԃ��܂��B
	 * @return �w���P���敪
	 */
	public String getUNIT_COST_TYP() {
		return UNIT_COST_TYP;
	}

	/**
	 * �ō����z��ݒ肵�܂��B
	 * @param string �ō����z 
	 */
	public void setAMOUNT_INCLUDE_TAX(String string) {
		AMOUNT_INCLUDE_TAX = string;
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
	 * @deprecated ���̃��\�b�h�͍폜����܂��B
	 */
	public void setEXCH_RATE(String string) {
		EXCH_RATE = string;
	}

	/**
	 * �ב֗\��R�[�h��ݒ肵�܂��B
	 * @param string �ב֗\��R�[�h
	 * @deprecated ���̃��\�b�h�͍폜����܂��B
	 */
	public void setEXCH_RESERVE_CD(String string) {
		EXCH_RESERVE_CD = string;
	}

	/**
	 * �ב֊J�n���t��ݒ肵�܂��B
	 * @param string �ב֊J�n���t
	 * @deprecated ���̃��\�b�h�͍폜����܂��B
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

	/**
	 * �M�݋��z��ݒ肵�܂��B
	 * @param string �M�݋��z
	 */
	public void setHOME_CUR_AMOUNT(String string) {
		HOME_CUR_AMOUNT = string;
	}

	/**
	 * �w���ޗ����ݒ肵�܂��B
	 * @param string �w���ޗ���
	 */
	public void setMATERIAL_COST(String string) {
		MATERIAL_COST = string;
	}

	/**
	 * �{�̋��z��ݒ肵�܂��B
	 * @param string �{�̋��z
	 */
	public void setNET_AMOUNT(String string) {
		NET_AMOUNT = string;
	}

	/**
	 * �w�����̑��o���ݒ肵�܂��B
	 * @param string �w�����̑��o��
	 */
	public void setOTHER_OVERHEADS(String string) {
		OTHER_OVERHEADS = string;
	}

	/**
	 * �w�����H���ݒ肵�܂��B
	 * @param string �w�����H��
	 */
	public void setPROCESSING_COST(String string) {
		PROCESSING_COST = string;
	}

	/**
	 * �������z��ݒ肵�܂��B
	 * @param string �������z 
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
	 * �Ŋz1��ݒ肵�܂��B
	 * @param string �Ŋz1
	 */
	public void setTAX_AMOUNT_1(String string) {
		TAX_AMOUNT_1 = string;
	}

	/**
	 * �Ŋz2��ݒ肵�܂��B
	 * @param string �Ŋz2
	 */
	public void setTAX_AMOUNT_2(String string) {
		TAX_AMOUNT_2 = string;
	}

	/**
	 * �Ŋz3��ݒ肵�܂��B
	 * @param string �Ŋz3
	 */
	public void setTAX_AMOUNT_3(String string) {
		TAX_AMOUNT_3 = string;
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
	/**
	 * �w���P����ݒ肵�܂��B
	 * @param string �w���P��
	 */
	public void setUNIT_COST(String string) {
		UNIT_COST = string;
	}

	/**
	 * �w���P���敪��ݒ肵�܂��B
	 * @param string �w���P���敪
	 */
	public void setUNIT_COST_TYP(String string) {
		UNIT_COST_TYP = string;
	}

}