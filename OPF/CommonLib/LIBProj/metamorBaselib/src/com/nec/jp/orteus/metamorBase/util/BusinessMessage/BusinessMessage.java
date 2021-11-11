//------------------------------------------------------------------------------
// (#)BusinessMessage.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/29 �V�K�쐬 K.Matsumoto
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/07/29 K.Matsumoto
//            �R���s���[�^����p�~�B�H��R�[�h��ǉ��B
//            �Ɩ�����ݒ肷�郁�\�b�h��������Ă������ߏC��
//            ��FsetBusinessName
//            ���FsetBusinessOperatingName
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.BusinessMessage;

import java.util.Date;

/**
 * �Ɩ����b�Z�[�W���i�[����N���X�B<BR>
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class BusinessMessage
{

	/**
	 * �I�u�W�F�N�g���\�z����B
	 */
	public BusinessMessage(){}

	/**
	 * �Ɩ����ݒ�B
	 * @return �Ɩ���
	 */
	public String getBusinessName() {
		return _businessName;
	}

	/**
	 * �H��R�[�h�擾�B
	 * @return �H��R�[�h
	 */
	public String getPlantCode() {
		return _code;
	}

	/**
	 * �f�[�^�擾�B
	 * @return �f�[�^
	 */
	public String getData() {
		return _data;
	}

	/**
	 * LOG���ʃR�[�h�擾�B
	 * @return LOG���ʃR�[�h
	 */
	public String getLogCode() {
		return _logCode;
	}

	/**
	 * ���b�Z�[�W�擾�B
	 * @return ���b�Z�[�W
	 */
	public String getMessage() {
		return _message;
	}

	/**
	 * ���b�Z�[�W�ԍ��擾�B
	 * @return ���b�Z�[�W�ԍ�
	 */
	public String getMessageCode() {
		return _messageCode;
	}

	/**
	 * ���s���[�U�擾�B
	 * @return ���s���[�U
	 */
	public String getUser() {
		return _user;
	}

	/**
	 * �m�F�����擾�B
	 * @return �m�F����
	 */
	public Date getCheckDate() {
		return _checkDate;
	}

	/**
	 * ���������ݒ�B
	 * @return ��������
	 */
	public Date getGenerateDate() {
		return _generateDate;
	}


	/**
	 * �Ɩ����ݒ�B
	 * @param businessOperatingName �Ɩ���
	 */
	public void setBusinessOperatingName(String name) {
		_businessName = name;
	}

	/**
	 * �H��R�[�h�ݒ�B
	 * @param code �H��R�[�h
	 */
	public void setPlantCode(String code) {
		_code = code;
	}

	/**
	 * �f�[�^�ݒ�B
	 * @param data �f�[�^
	 */
	public void setData(String data) {
		_data = data;
	}

	/**
	 * LOG���ʃR�[�h�ݒ�B
	 * @param logCode LOG���ʃR�[�h
	 */
	public void setLogCode(String code) {
		_logCode = code;
	}

	/**
	 * ���b�Z�[�W�ݒ�B
	 * @param message ���b�Z�[�W
	 */
	public void setMessage(String message) {
		_message = message;
	}

	/**
	 * ���b�Z�[�W�ԍ��ݒ�B
	 * @param messageCode ���b�Z�[�W�ԍ�
	 */
	public void setMessageCode(String code) {
		_messageCode = code;
	}

	/**
	 * ���s���[�U�ݒ�B
	 * @param user ���s���[�U
	 */
	public void setUser(String user) {
		_user = user;
	}

	/**
	 * �m�F�����ݒ�B
	 * @param checkDate �m�F����
	 */
	public void setCheckDate(Date date) {
		_checkDate = date;
	}

	/**
	 * ���������ݒ�B
	 * @param generateDate ��������
	 */
	public void setGenerateDate(Date date) {
		_generateDate = date;
	}

	/** LOG���ʃR�[�h */
	private String _logCode = null;

	/** �Ɩ��� */
	private String _businessName = null;

	/** �H��R�[�h */
	private String _code = null;

	/** ���b�Z�[�W�ԍ� */
	private String _messageCode = null;

	/** ���b�Z�[�W */
	private String _message = null;

	/** �f�[�^ */
	private String _data = null;

	/** ���s���[�U */
	private String _user = null;

	/** �������� */
	private Date _generateDate = null;

	/** �m�F���� */
	private Date _checkDate = null;

}
