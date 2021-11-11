/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/util/DataNotFoundException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.util;

import com.nec.jp.orteus.metamorBase.util.AlarmMessage.*;

/**
 * �f�[�^�x�[�X�������ɊY�����R�[�h�����݂��Ȃ��ꍇ�Ɏg�p������O�ł��B
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:39 $
 */
public class DataNotFoundException extends Exception {

	/** ���b�Z�[�W�Ǘ����i */
	AlarmMessage message = new AlarmMessage();

	/**
	 * �w�肳�ꂽ�G���[�R�[�h���g�p���ĐV�K��O���\�z���܂��B
	 * @param code �G���[�R�[�h
	 */
	public DataNotFoundException(String code) {
		super();
		message.setCode(code);
	}

	/**
	 * �w�肳�ꂽ�G���[�R�[�h����ь������g�p���ĐV�K��O���\�z���܂��B 
	 * @param code �G���[�R�[�h
	 * @param cause ����
	 */
	public DataNotFoundException(String code, Throwable cause) {
		super(cause);
		message.setCode(code);
	}

	/**
	 * �G���[�R�[�h��Ԃ��܂��B
	 * @return �G���[�R�[�h
	 */
	public String getCode() {
		return message.getCode();
	}

	/**
	 * �G���[�R�[�h���擾�������b�Z�[�W��Ԃ��܂��B
	 * @return ���b�Z�[�W
	 */
	public String getMessage() {
		return message.getMessage();
	}
}
