//------------------------------------------------------------------------------
// (#)SystemConfig.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/30 �V�K�쐬 Y.Inada
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.common;

import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.lang.ClassLoader;
import java.util.Locale;

/**
  * �V�X�e����`�B
  * �V�X�e����`�́AmetamorBase�ɂ�����V�X�e����`�t�@�C����
  * �A�N�Z�X���邽�߂̋@�\�ł���B<BR>
  * �܂��AmetamorBase��̊e���`�t�@�C���ւ̃A�N�Z�X���\�Ƃ���B
  * 
  * @author Y.Inada
  * @version 1.00
*/
public class SystemConfig
{

	/**
	 * �R���X�g���N�^�B
	 */
	private SystemConfig(){}

	/**
	  * ���\�[�X�o���h���擾�B
	  * @return ���\�[�X�o���h��
	  * @throws MissingResourceException ���\�[�X������
	 */
	public static ResourceBundle getBundle() throws MissingResourceException
	{
		try {
			// ��`�t�@�C���p��
			ResourceBundle bundle =
					ResourceBundle.getBundle(_systemFileName);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * ���\�[�X�o���h���擾�{�B
	  * @param local ���P�[��
	  * @return ���\�[�X�o���h��
	 */
	public static ResourceBundle getBundle(Locale local)
	{
		try {
			// ��`�t�@�C���p��
			ResourceBundle bundle =
					ResourceBundle.getBundle(_systemFileName, local);
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
	  * @throws MissingResourceException ���\�[�X������
	 */
	public static ResourceBundle getBundle(Locale local, ClassLoader loader)
			throws MissingResourceException
	{
		try {
			// ��`�t�@�C���p��
			ResourceBundle bundle =
					ResourceBundle.getBundle(_systemFileName, local, loader);
			return bundle;
		}catch(MissingResourceException ex) {
			return null;
		}
	}

	/**
	  * �l�擾�B
	  * @param key �擾�L�[
	  * @param bundle ���\�[�X�o���h��
	  * @param String �l(�擾�Ɏ��s�����ꍇ��null)
	 */
	public static String getProperty(String key, ResourceBundle bundle)
	{
		if(key == null || bundle == null)
			return null;

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
	  * @param Integer �l(�擾�Ɏ��s�����ꍇ��null)
	 */
	public static Integer getPropertyNumber(String key, ResourceBundle bundle)
	{
		String value = getProperty(key, bundle);
		if(null == value)
			return null;
		Integer ret = null;
		try {
			ret = Integer.valueOf(value);
		}
		catch(NumberFormatException ex) {
			return null;
		}
		return ret;
	}

	/** �V�X�e����`�t�@�C�����B*/
	private static final String _systemFileName = "metamorBaseSystem";
}

