/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/SystemConfig.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.util.Locale;

/**
 * �V�X�e����`�N���X�B
 * �V�X�e����`�́AmetamorBase�ɂ�����V�X�e����`�t�@�C���ɃA�N�Z�X���邽�߂̋@�\�ł��B<BR>
 * �܂��AmetamorBase��̊e���`�t�@�C���ւ̃A�N�Z�X���\�Ƃ��܂��B
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:14 $
*/
public class SystemConfig {

	/** 
	 * �V�X�e����`�t�@�C�����B
	 */
	private static final String systemFileName = "metamorBaseSystem";
	
	/**
	 * �R���X�g���N�^�B
	 */
	private SystemConfig(){}

	/**
	  * ���\�[�X�o���h���擾�B
	  * @return ���\�[�X�o���h��
	 */
	public static ResourceBundle getBundle()
			throws MissingResourceException {
		try {
			// ��`�t�@�C���p��
			ResourceBundle bundle = ResourceBundle.getBundle(systemFileName);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * ���\�[�X�o���h���擾�B
	  * @param local ���P�[��
	  * @return ���\�[�X�o���h��
	 */
	public static ResourceBundle getBundle(Locale local)
			throws MissingResourceException {
		try {
			// ��`�t�@�C���p��
			ResourceBundle bundle =	ResourceBundle.getBundle(systemFileName, local);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * ���\�[�X�o���h���擾�B
	  * @param local ���P�[��
	  * @param loader �N���X���[�_
	  * @return ���\�[�X�o���h��
	 */
	public static ResourceBundle getBundle(Locale local, ClassLoader loader)
			throws MissingResourceException {
		try {
			// ��`�t�@�C���p��
			ResourceBundle bundle =	ResourceBundle.getBundle(systemFileName, local, loader);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * �l�擾�B
	  * @param key �擾�L�[
	  * @param bundle ���\�[�X�o���h��
	  * @return �擾�����l�� String �ŕԂ��܂��B�擾�Ɏ��s�����ꍇ�� null ��Ԃ��܂��B
	 */
	public static String getProperty(String key, ResourceBundle bundle)
			throws MissingResourceException {
		if (key == null || bundle == null) {
			return null;
		}

		try {
			return bundle.getString(key);
		}
		catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * �l�擾�B
	  * @param key �擾�L�[
	  * @param bundle ���\�[�X�o���h��
	  * @return �擾�����l�� Integer �ŕԂ��܂��B�擾�Ɏ��s�����ꍇ�� null ��Ԃ��܂��B
	 */
	public static Integer getPropertyNumber(String key, ResourceBundle bundle)
			throws MissingResourceException {
		String value = getProperty(key, bundle);
		if (null == value) {
			return null;
		}
		Integer ret = null;
		try {
			ret = Integer.valueOf(value);
		}
		catch(NumberFormatException ex) {
			return null;
		}
		return ret;
	}

}

