/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/exception/ExpjBadException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.exception;

import com.nec.jp.orteus.expj.util.*;

 /**
 * ���b�Z�[�W���O�Ƃ��Ď�舵���N���X�B<br>
 * ���b�Z�[�W�̓��e�̓��b�Z�[�W��`�t�@�C������擾���܂��B
 * ExpjException�́AControl����Throw�����Ȃ���
 *
 * @see ExpjMessage
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:53 $
*/
public class ExpjBadException extends Exception
{

	/**
	 * ���b�Z�[�W
	 */
	ExpjMessage _message = null;

	/**
	 * ���P�[��
	 */
	String _locale = "ja";

	/**
	 * �G�N�Z�v�V�����𐶐����܂��B
	 */
	public ExpjBadException() {
		super();
	}

	/**
	 * �X�^�b�N�g���[�X���󂯌p���ŃG�N�Z�v�V�����𐶐����܂��B
	 *
	 * @param cause �X�^�b�N�g���[�X
	 */
	public ExpjBadException(Throwable cause) {
		this();
		initCause(cause);
		_message = null;
	}

	/**
	 * �G�N�Z�v�V�����𐶐����A�w�肵�����b�Z�[�W��ݒ肵�܂��B
	 *
	 * @param message ���b�Z�[�W
	 */
	public ExpjBadException(ExpjMessage message) {
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
	public ExpjBadException(Throwable cause, ExpjMessage message) {
		this();
		initCause(cause);
		_message = message;
	}

	/**
	 * �G�N�Z�v�V�����𐶐����A
	 * �w�肵�����b�Z�[�W�R�[�h�Ń��b�Z�[�W�𐶐����ݒ肵�܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public ExpjBadException(String code) {
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
	public ExpjBadException(Throwable cause, String code) {
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
	public ExpjBadException(String code, String value) {
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
	public ExpjBadException(Throwable cause, String code, String value) {
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
	public ExpjBadException(String code, String[] value) {
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
	public ExpjBadException(Throwable cause, String code, String[] value) {
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
	 */
	public void setLocale(String locale) {
		_locale = locale;
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
			return _message.getMessage("ja");
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * ���b�Z�[�W��������擾���܂��B
	 *
	 * @return ���P�[���ɑΉ��������b�Z�[�W
	 */
	public String getMessage(String locale) {
		try {
			return _message.getMessage(locale);
		} catch (Exception e) {
			return "";
		}
	}

}
