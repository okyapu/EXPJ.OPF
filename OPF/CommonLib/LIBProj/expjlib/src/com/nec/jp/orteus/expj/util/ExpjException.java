/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ExpjException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */
package com.nec.jp.orteus.expj.util;

import javax.servlet.http.HttpServletRequest;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import com.nec.jp.orteus.util.CoreTools;

 /**
 * ���b�Z�[�W���O�Ƃ��Ď�舵���N���X�B<br>
 * ���b�Z�[�W�̓��e�̓��b�Z�[�W��`�t�@�C������擾���܂��B
 *
 * @see ExpjMessage
 * @see ExpjMessageList
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2013/06/27 02:50:48 $
*/
public class ExpjException extends BusinessProcessException
{

	/**
	 * ���b�Z�[�W
	 */
	ExpjMessage _message = null;

	/**
	 * ���P�[��
	 */
	String _locale = "ja";

	Throwable _cause = null;
	
	/**
	 * �G�N�Z�v�V�����𐶐����܂��B
	 */
	public ExpjException() {
		super("COMMON-N000","EXPLANNER/J ERROR");
	}

	/**
	 * �X�^�b�N�g���[�X���󂯌p���ŃG�N�Z�v�V�����𐶐����܂��B
	 *
	 * @param cause �X�^�b�N�g���[�X
	 */
	public ExpjException(Throwable cause) {
		this();
		initCause(cause);
		_message = null;
	}

	/**
	 * �G�N�Z�v�V�����𐶐����A�w�肵�����b�Z�[�W��ݒ肵�܂��B
	 *
	 * @param message ���b�Z�[�W
	 */
	public ExpjException(ExpjMessage message) {
		this();
		_message = message;
	}

	/**
	 * �X�^�b�N�g���[�X���󂯌p���ŃG�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W��ݒ肵�܂��B
	 *
	 * @param cause �X�^�b�N�g���[�X
	 * @param message ���b�Z�[�W
	 */
	public ExpjException(Throwable cause, ExpjMessage message) {
		this();
		initCause(cause);
		_message = message;
		_cause = cause;
	}

	/**
	 * �G�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W���X�g�Ń��b�Z�[�W�𐶐����ݒ肵�܂��B
	 *
	 * @param message ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public ExpjException(ExpjMessageList message) {
		this();
		_message =  new ExpjMessage("ZZ01006", message.getMessage());;
	}

	/**
	 * �X�^�b�N�g���[�X���󂯌p���ŃG�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W���X�g�Ń��b�Z�[�W�𐶐����ݒ肵�܂��B
	 *
	 * @param cause �X�^�b�N�g���[�X
	 * @param message ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public ExpjException(Throwable cause, ExpjMessageList message) {
		this();
		initCause(cause);
		_message =  new ExpjMessage("ZZ01006", message.getMessage());;
	}

	/**
	 * �G�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W�R�[�h�Ń��b�Z�[�W�𐶐����ݒ肵�܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public ExpjException(String code) {
		this();
		_message = new ExpjMessage(code);
	}

	/**
	 * �X�^�b�N�g���[�X���󂯌p���ŃG�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W�R�[�h�Ń��b�Z�[�W�𐶐����ݒ肵�܂��B
	 *
	 * @param cause �X�^�b�N�g���[�X
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public ExpjException(Throwable cause, String code) {
		this();
		initCause(cause);
		_message = new ExpjMessage(code);
	}

	/**
	 * �G�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W�R�[�h�{���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������ݒ肵�܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public ExpjException(String code, String value) {
		this();
		_message = new ExpjMessage(code, value);
	}

	/**
	 * �X�^�b�N�g���[�X���󂯌p���ŃG�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W�R�[�h�A���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������ݒ肵�܂��B
	 *
	 * @param cause �X�^�b�N�g���[�X
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public ExpjException(Throwable cause, String code, String value) {
		this();
		initCause(cause);
		_message = new ExpjMessage(code, value);
	}

	/**
	 * �G�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W�R�[�h�{���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������ݒ肵�܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public ExpjException(String code, String[] value) {
		this();
		_message = new ExpjMessage(code, value);
	}

	/**
	 * �X�^�b�N�g���[�X���󂯌p���ŃG�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W�R�[�h�A���b�Z�[�W�ɖ��ߍ��ޕ�����łP���b�Z�[�W�������ݒ肵�܂��B
	 *
	 * @param cause �X�^�b�N�g���[�X
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public ExpjException(Throwable cause, String code, String[] value) {
		this();
		initCause(cause);
		_message = new ExpjMessage(code, value);
	}



	/**
	 * �������܂���B�R���p�C���G���[���o�Ȃ����Ƃ�����ړI�ɂ��Ă��܂��B
	 *
	 * @param message ���b�Z�[�W
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public void add(ExpjMessage message) {
	}

	/**
	 * �������܂���B�R���p�C���G���[���o�Ȃ����Ƃ�����ړI�ɂ��Ă��܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public void add(String code) {
	}

	/**
	 * �������܂���B�R���p�C���G���[���o�Ȃ����Ƃ�����ړI�ɂ��Ă��܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޒl
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public void add(String code, String value) {
	}

	/**
	 * �������܂���B�R���p�C���G���[���o�Ȃ����Ƃ�����ړI�ɂ��Ă��܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 ���b�Z�[�W�ɖ��ߍ��ޒl1
	 * @param value2 ���b�Z�[�W�ɖ��ߍ��ޒl2
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public void add(String code, String value1, String value2) {
	}

	/**
	 * �������܂���B�R���p�C���G���[���o�Ȃ����Ƃ�����ړI�ɂ��Ă��܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 ���b�Z�[�W�ɖ��ߍ��ޒl1
	 * @param value2 ���b�Z�[�W�ɖ��ߍ��ޒl2
	 * @param value3 ���b�Z�[�W�ɖ��ߍ��ޒl3
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public void add(String code, String value1, String value2, String value3) {
	}

	/**
	 * �������܂���B�R���p�C���G���[���o�Ȃ����Ƃ�����ړI�ɂ��Ă��܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޒl
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public void add(String code, String[] value) {
	}



	/**
	 * ���P�[����ݒ肵�܂��B
	 *
	 * @param locale ���P�[��
	 */
	public void setLocale(String locale) {
		_locale = locale;
		if(_cause instanceof ExpjException) {
			((ExpjException)_cause).setLocale(_locale);
		}
	}

	/**
	 * ���b�Z�[�W���N���A�B
	 */
	public void clear() {
		_message = null;
	}

	/**
	 * ���b�Z�[�W���擾���܂��B
	 *
	 * @return ���b�Z�[�W
	 */
	public ExpjMessage getExpjMessage() {
		return _message;
	}

	/**
	 * ���b�Z�[�W�̃��b�Z�[�W�R�[�h���擾���܂��B
	 *
	 * @return ���b�Z�[�W�R�[�h
	 */
	public String getCode() {
		try {
			return _message.getCode();
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * �f�t�H���g����Ń��b�Z�[�W��������擾���܂��B
	 *
	 * @return ���b�Z�[�W
	 */
	public String getMessage() {
		try {
			return _message.getMessage(_locale);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * ���b�Z�[�W��������擾���܂��B
	 *
	 * @param locale ���P�[��
	 * @return ���P�[���ɑΉ��������b�Z�[�W
	 */
	public String getMessage(String locale) {
		try {
			return _message.getMessage(locale);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * ���b�Z�[�W�\���pJSP��URL���擾���܂��B
	 *
	 * @return URL
	 * @deprecated ���̃��\�b�h��EXPLANNER/J�ł͐�������Ă��܂���B
	 */
	public String getJspUrl() {
		return new String("/ExpjMessage.jsp");
	}


	/**
	 * ���N�G�X�g�Ƀ��b�Z�[�W���Z�b�g���܂��B
	 *
	 * @param request ���N�G�X�g
	 */
	public void setToRequest(HttpServletRequest request) {
		request.setAttribute("msg", _message);
	}

}
