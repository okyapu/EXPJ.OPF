/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ExpjMessage.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.MissingResourceException;
import com.nec.jp.orteus.util.CoreTools;

/**
 * �P���b�Z�[�W�̏���ێ�����N���X<br>
 * ���b�Z�[�W�̓��e�̓��b�Z�[�W��`�t�@�C������擾���܂�
 * @see ExpjException
 * @see ExpjMessageList
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
 */
public class ExpjMessage implements java.io.Serializable
{

	/**
	 * ���b�Z�[�W�v���p�e�B�t�@�C��
	 */
	private static ResourceBundle _messages = null;

	/**
	 * ���P�[��
	 */
	private static String _locale = null;

	/**
	 * ���b�Z�[�W�R�[�h
	 */
	private String _code = null;

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	private String[] _value = null;

	/**
	 * ��̃��b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ������ݒ肵�܂��B
	 */
	public ExpjMessage() {
		init("ZZ01006", new String[0]);
	}

	/**
	 * �w�肳�ꂽ���b�Z�[�W�R�[�h��ݒ肵�܂��B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public ExpjMessage(String code) {
		init(code, new String[0]);
	}

	/**
	 * �w�肳�ꂽ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ������ݒ肵�܂��B
	 *
	 * @param code  ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public ExpjMessage(String code, String value) {
		init(code, str2array(value));
	}

	/**
	 * �w�肳�ꂽ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ�����P�A������Q��ݒ肵�܂��B
	 *
	 * @param code  ���b�Z�[�W�R�[�h
	 * @param value1 ���b�Z�[�W�ɖ��ߍ��ޕ�����P
	 * @param value2 ���b�Z�[�W�ɖ��ߍ��ޕ�����Q
	 */
	public ExpjMessage(String code, String value1, String value2) {
		init(code, str2array(value1, value2));
	}

	/**
	 * �w�肳�ꂽ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ�����P�`�R��ݒ肵�܂��B
	 *
	 * @param code  ���b�Z�[�W�R�[�h
	 * @param value1 ���b�Z�[�W�ɖ��ߍ��ޕ�����1
	 * @param value2 ���b�Z�[�W�ɖ��ߍ��ޕ�����2
	 * @param value3 ���b�Z�[�W�ɖ��ߍ��ޕ�����3
	 */
	public ExpjMessage(String code, String value1, String value2, String value3) {
		init(code, str2array(value1, value2, value3));
	}

	/**
	 * �w�肳�ꂽ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ�����iString[]�^�j��ݒ肵�܂��B
	 *
	 * @param code  ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public ExpjMessage(String code, String[] value) {
		init(code, value);
	}

	/**
	 * ���b�Z�[�W�R�[�h�ƃ��b�Z�[�W�ɖ��ߍ��ޕ�������i�[���܂��B
	 *
	 * @param code  ���b�Z�[�W�R�[�h
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	private void init(String code, String[] value) {
		setCode(code);
		setValue(value);
	}

	/**
	 * ���b�Z�[�W�R�[�h���i�[����A�N�Z�b�T�B
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public void setCode(String code) {
		_code = code;
	}

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ�������i�[����A�N�Z�b�T�B
	 *
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public void setValue(String value) {
		setValue(str2array(value));
	}

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ�����iString[]�^�j���i�[����A�N�Z�b�T�B
	 *
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����iString[]�^�j
	 */
	public void setValue(String[] value) {
		_value = value;
	}

	/**
	 * ���b�Z�[�W�R�[�h���擾����A�N�Z�b�T�B
	 *
	 * @return ���b�Z�[�W�R�[�h
	 */
	public String getCode() {
		return _code.toString();
	}

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ�������擾����A�N�Z�b�T
	 *
	 * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public String getValue() {
		return getValue(0);
	}

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ������ idx �Ԗڂ̒l���擾����A�N�Z�b�T
	 *
	 * @param idx �z��̃C���f�b�N�X
	 * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����A�擾�ł��Ȃ��ꍇ�͋󕶎���Ԃ��܂��B
	 */
	public String getValue(int idx) {
		if (getValues() != null && getValueSize() > idx) {
			if (getValues()[idx] != null) {
				return getValues()[idx].toString();
			}
		}
		return "";
	}

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ�������擾����A�N�Z�b�T�B
	 *
	 * @return ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public String[] getValues() {
		return _value;
	}

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ������ǉ�����A�N�Z�b�T�B
	 *
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public void addValue(String value) {
		addValue(str2array(value));
	}

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ������ǉ�����A�N�Z�b�T�B
	 *
	 * @param value ���b�Z�[�W�ɖ��ߍ��ޕ�����
	 */
	public void addValue(String[] value) {
		if (value == null) {
			return;
		}
		if (getValueSize() == 0) {
			setValue(value);
		} else {
			String[] temp = new String[getValueSize() + value.length];
			System.arraycopy(getValues(), 0, temp, 0, getValueSize());
			System.arraycopy(value, 0, temp, getValueSize(), value.length);
			setValue(temp);
		}
	}

	/**
	 * ���b�Z�[�W�ɖ��ߍ��ޕ�����̌�����Ԃ��܂��B
	 *
	 * @return ������̌���
	 */
	public int getValueSize() {
		if (getValues() == null) {
			return 0;
		}
		return getValues().length;
	}

	/**
	 * ���b�Z�[�W�t�@�C������A�w�肳�ꂽ���b�Z�[�W�R�[�h�̃��b�Z�[�W���f�t�H���g�̃��P�[���Ŏ擾���A
	 * �擾�������b�Z�[�W�Ɏw�蕶�����}�����ĕԂ��܂��B
	 *
	 * @return ���b�Z�[�W
	 */
	public String getMessage() {
		return getMessage(CoreTools.getLocale(null));
	}

	/**
	 * ���b�Z�[�W�t�@�C������A�w�肳�ꂽ���b�Z�[�W�R�[�h�̃��b�Z�[�W���擾���A
	 * �擾�������b�Z�[�W�Ɏw�蕶�����}�����ĕԂ��܂��B
	 *
	 * @param locale ���P�[��
	 * @return ���b�Z�[�W
	 */
	public String getMessage(String locale) {
		String msg = getProperty(getCode(), locale);
		return MessageFormat.format(msg, getValues());
	}

	/**
	 * �f�t�H���g����Ń��b�Z�[�W��������擾���܂��B
	 *
	 * @return ���b�Z�[�W
	 */
	public String getStringMessage() {
		return getStringMessage(CoreTools.getLocale(null));
	}

	/**
	 * ���b�Z�[�W��������擾���܂��B
	 *
	 * @param locale ���P�[��
	 * @return ���P�[���ɑΉ��������b�Z�[�W
	 */
	public String getStringMessage(String locale) {
		try {
			return "[" + getCode() + "] " + getMessage(locale);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * ���b�Z�[�W��`�t�@�C������w�肳�ꂽ���b�Z�[�W�R�[�h�̃��b�Z�[�W���擾���܂��B<br>
	 * ���b�Z�[�W��`�t�@�C����������Ȃ������ꍇ�́A"���b�Z�[�W��`�t�@�C����������܂���B"�Ƃ����������Ԃ��܂��B<br>
	 * �w�肳�ꂽ���b�Z�[�W�L�[�ɑΉ����郁�b�Z�[�W�{����������Ȃ������ꍇ�́A
	 * "���b�Z�[�W�L�[" + code + "�ɑΉ����郁�b�Z�[�W������܂���B"�Ƃ����������Ԃ��܂��B<br>
	 *
	 * @param code ���b�Z�[�W�R�[�h
	 * @param locale ����R�[�h
	 * @return ���b�Z�[�W
	 */
	static synchronized String getProperty(String code, String locale) {
		try {
			if ((_messages == null) || (!locale.equals(_locale))) {
				_locale = locale;
				if (CoreTools.getLocale(null).equals(locale)) {
					_messages = ResourceBundle.getBundle("ExpjMessage");
				} else {
					_messages = CoreTools.getResourceBundle("ExpjMessage", locale);
				}
			}
		}
		catch (MissingResourceException e) {
			return new String("Locale Message Definition File \"ExpjMessage.properties\" not found.");
		}

		String val = null;
		try {
			val = _messages.getString(code);
		}
		catch (MissingResourceException e) {
			val = new String("Message Key [" + code + "] does not have Message text.");
		}
		return val;
	}

	/**
	 * �������z��ɕϊ����܂�
	 *
	 * @param value ������
	 * @return �z��
	 */
	private String[] str2array(String value) {
		String[] temp = new String[1];
		temp[0] = value;
		return temp;
	}

	/**
	 * �������z��ɕϊ����܂�
	 *
	 * @param value1 ������
	 * @param value2 ������
	 * @return �z��
	 */
	private String[] str2array(String value1, String value2) {
		String[] temp = new String[2];
		temp[0] = value1;
		temp[1] = value2;
		return temp;
	}

	/**
	 * �������z��ɕϊ����܂�
	 *
	 * @param value1 ������
	 * @param value2 ������
	 * @param value3 ������
	 * @return �z��
	 */
	private String[] str2array(String value1, String value2, String value3) {
		String[] temp = new String[3];
		temp[0] = value1;
		temp[1] = value2;
		temp[2] = value3;
		return temp;
	}

}
