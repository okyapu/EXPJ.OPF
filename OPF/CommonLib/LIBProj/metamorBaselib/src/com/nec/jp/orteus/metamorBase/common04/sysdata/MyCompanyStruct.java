/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/MyCompanyStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

/**
 * ���Џ��f�[�^�N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class MyCompanyStruct {

	/** SYS�R���g���[���R�[�h */
	private String CTRL_CD;
	/** ��ЃR�[�h */
	private String COMPANY_CD;
	/** �J�n�j�� */
	private String START_DAY;

	/**
	 * ��ЃR�[�h��Ԃ��܂��B
	 * @return ��ЃR�[�h
	 */
	public String getCOMPANY_CD() {
		return COMPANY_CD;
	}

	/**
	 * SYS�R���g���[���R�[�h��Ԃ��܂��B
	 * @return SYS�R���g���[���R�[�h
	 */
	public String getCTRL_CD() {
		return CTRL_CD;
	}

	/**
	 * �J�n�j����Ԃ��܂��B
	 * @return �J�n�j��
	 */
	public String getSTART_DAY() {
		return START_DAY;
	}

	/**
	 * ��ЃR�[�h��ݒ肵�܂��B
	 * @param string ��ЃR�[�h
	 */
	public void setCOMPANY_CD(String string) {
		COMPANY_CD = string;
	}

	/**
	 * SYS�R���g���[���R�[�h��ݒ肵�܂��B
	 * @param string SYS�R���g���[���R�[�h
	 */
	public void setCTRL_CD(String string) {
		CTRL_CD = string;
	}

	/**
	 * �J�n�j����ݒ肵�܂��B
	 * @param string �J�n�j��
	 */
	public void setSTART_DAY(String string) {
		START_DAY = string;
	}

}
