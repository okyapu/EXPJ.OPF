/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/DateCtrlStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

/**
 * ���t������f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class DateCtrlStruct {

	/** �H��R�[�h */
	private String PLANT_CD;
	/** �Ɩ��^�p�� */
	private String BUSINESS_OPR_DATE;
	/** �v��� */
	private String STOCK_CRITERION_DATE;

	/**
	 * �Ɩ��^�p����Ԃ��܂��B
	 * @return �Ɩ��^�p��
	 */
	public String getBUSINESS_OPR_DATE() {
		return BUSINESS_OPR_DATE;
	}

	/**
	 * �H��R�[�h��Ԃ��܂��B
	 * @return �H��R�[�h
	 */
	public String getPLANT_CD() {
		return PLANT_CD;
	}

	/**
	 * �v�����Ԃ��܂��B
	 * @return �v���
	 */
	public String getSTOCK_CRITERION_DATE() {
		return STOCK_CRITERION_DATE;
	}

	/**
	 * �Ɩ��^�p����ݒ肵�܂��B
	 * @param string �Ɩ��^�p��
	 */
	public void setBUSINESS_OPR_DATE(String string) {
		BUSINESS_OPR_DATE = string;
	}

	/**
	 * �H��R�[�h��ݒ肵�܂��B
	 * @param string �H��R�[�h
	 */
	public void setPLANT_CD(String string) {
		PLANT_CD = string;
	}

	/**
	 * �v�����ݒ肵�܂��B
	 * @param string �v���
	 */
	public void setSTOCK_CRITERION_DATE(String string) {
		STOCK_CRITERION_DATE = string;
	}

}
