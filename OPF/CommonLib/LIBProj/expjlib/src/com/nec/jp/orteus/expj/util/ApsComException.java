/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ApsComException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

public class ApsComException extends Exception {
	int no;   // �G���[�ԍ�

	/**
	 * ���b�Z�[�W��Ԃ�(�G���[�ԍ��Ή�)
	 */
	public String getMessage() {
		return "(AC" + no + ") " + super.getMessage();
	}
	/**
	 * �R���X�g���N�^(�G���[�ԍ��Ή�)
	 */
	public ApsComException(int no, String message) {
		super(message);
		this.no = no;
	}
	/**
	 * �G���[�ԍ���Ԃ�
	 */
	public String getExceptionNo(){
		return "AC" + no;
	}

 
   ///----�@�ȉ��AException�N���X�̃R���X�g���N�^�ɂ�����̂����̂܂܃I�[�o�[���C�h
	public ApsComException() {
	}
	public ApsComException(String message) {
		super(message);
	}
	public ApsComException(String message, Throwable cause) {
		super(message, cause);
	}
	public ApsComException(Throwable cause) {
		super(cause);
	}
}
