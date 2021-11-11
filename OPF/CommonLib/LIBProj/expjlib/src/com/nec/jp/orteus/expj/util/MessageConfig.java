/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/MessageConfig.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.util.List;

/**
 * ���b�Z�[�W��`�N���X�B
 * ���b�Z�[�W��`�́AmetamorBase�ɂ����郁�b�Z�[�W��`�t�@�C���ɃA�N�Z�X���邽�߂̋@�\�ł��B
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
 */
public class MessageConfig {


	/** 
	 * ���b�Z�[�W��`�t�@�C�����B
	 */
	private static final String fileName = "ExpjMessage";

	/** 
	 * �C���X�^���X�B 
	 */
	private static MessageConfig _msgConfig = new MessageConfig();

	/** 
	 * ���\�[�X�o���h���B 
	 */
	private static ResourceBundle _bundle = null;
	
	/**
	  * �R���X�g���N�^
	 */
	private MessageConfig(){}

	/**
	  * �C���X�^���X�擾
	 */
	public static MessageConfig getInstance()
	{
		return _msgConfig;
	}

	/**
	 * ����������
	 * @return true: ���������� false: ���������s
	 */
	public synchronized static boolean init()
	{
		if (_bundle == null){
			try {
				// ��`�t�@�C���p��
				ResourceBundle bundle =	ResourceBundle.getBundle(fileName);
				_bundle = bundle;
	
			}catch(MissingResourceException ex){
				_bundle = null;
				return false;
			}
		}
		return true;
	}

	/**
	  * ���b�Z�[�W��ǉ����܂��B
	  * @param key �擾�L�[
	  * @param list ���b�Z�[�W�i�[�p�̃��X�g
	 */
	public synchronized static void addMessage(String key, List list)
	{
		if (list == null) {
			return;
		} 
		
		// ���b�Z�[�W�擾
		String msg = getMessage(key);
		if (msg != null) {
			list.add(msg); 
		} 
		else {
			list.add("���b�Z�[�W�L�[[" + key + "]�ɑΉ����郁�b�Z�[�W������܂���");
		} 
	}

	/**
	  * ���b�Z�[�W���擾���܂��B
	  * @param key �擾�L�[
	  * @return �擾�������b�Z�[�W��Ԃ��܂��B
	 */
	public synchronized static String getMessage(String key)
	{
		String msg = null;

		if (key == null || _bundle == null) {
			return msg;
		} 
		try {
			msg = _bundle.getString(key);

		}catch(MissingResourceException ex){
		}

		return msg;
	}


}

