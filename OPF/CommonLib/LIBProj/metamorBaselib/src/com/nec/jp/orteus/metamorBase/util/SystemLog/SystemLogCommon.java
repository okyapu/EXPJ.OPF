//------------------------------------------------------------------------------
// (#)SystemLogCommon.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/30 �V�K�쐬 M.Sakamoto
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/10/08 ���b�Z�[�W�擾�t�@�C����`�ǉ�  K.Shiraki
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;


/**
 * �V�X�e�����O���ʒ�`�B
 *
 * @author  M.Sakamoto
 * @version 1.00
*/
public class SystemLogCommon
{
	/** ���ʃJ�e�S���B*/
	public final static String COMMON_CATEGORY = "com.nec.jp.orteus.metamorBase";

	/** �o�͐��`�t�@�C���p�X�B*/
	public final static String HANDLER_PROPERTIES = "SystemLog";

	/** �A�v���P�[�V������`�t�@�C���p�X�B*/
	public final static String APPRICATION_PROPERTIES = "SystemLogApplication";

	/** �J�����B*/
	public static final int ENVIRONMENT_DEVELOPMENT = 1;

	/** �^�p���B*/
	public static final int ENVIRONMENT_EMPLOYMENT = 11;

	/** �s����B*/
	public static final int ENVIRONMENT_UNKOWN = 99;

	/** ���b�Z�[�W�擾�t�@�C�� */
	public final static String MESSAGE_PROPERTIES_FILE = "AlarmMessage";
}

