//------------------------------------------------------------------------------
// (#)SystemLogger.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/22 �V�K�쐬 M.Sakamoto
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;

import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.util.logging.Level;

/**
 * �V�X�e�����O���o�͂���(Logger�̍Ē�`)<BR>
 *
 * @author  M.Sakamoto
 * @version 1.00
 */
public class SystemLogger extends Logger
{
	/**
	 * ���b�K�[�쐬�B<BR>
     * ���b�K�[���쐬���A���O�}�l�[�W���ɓo�^����
	 * @param  category �J�e�S����
	 * @param  level �o�̓��x��
	 */
    public static boolean makeLogger(String s, Level level)
    {
		boolean ret = false;
	    synchronized(_loggerSync)
        {
	        LogManager logmanager = LogManager.getLogManager();
			SystemLogger logger = new SystemLogger(s, null);
			boolean flag = logmanager.addLogger(logger);
			if(true == flag) {
				logger.setLevel(level);
				ret = true;		// ��������
			}
		}
		return ret;
    }

	/* �o�͕s���\�b�h�̍Ē�` */

	/**
	 * ENTRY���O�o��(�Ē�`)�B
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 */
    public void entering(String s, String s1)
    {
		// �������Ȃ�
    }

	/**
	 * ENTRY���O�o��(�Ē�`)�B
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 */
    public void entering(String s, String s1, Object aobj[])
    {
		// �������Ȃ�
    }

	/**
	 * EXIT���O�o��(�Ē�`)�B
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 */
    public void exiting(String s, String s1)
    {
		// �������Ȃ�
    }

	/**
	 * EXIT���O�o��(�Ē�`)�B
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 */
    public void exiting(String s, String s1, Object obj)
    {
		// �������Ȃ�
    }

	/**
	 * THROW���O�o��(�Ē�`)�B
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 */
    public void throwing(String s, String s1, Throwable throwable)
    {
		// �������Ȃ�
    }

	/**
	 * ���b�K�[�̍\�z
	 * @param filename ���O�t�@�C���̃p�X
	 * @param limit ���O�t�@�C���؂�ւ��T�C�Y
	 * @param count ���O�t�@�C���o�b�N�A�b�v��
	*/
	public SystemLogger(String name, String resourceBundleName)
	{
		super(name, resourceBundleName);
	}

	/**
      * _loggerSync		���b�K�[�����̂��߂̔r���I�u�W�F�N�g
	*/
    private static Object _loggerSync = new Object();
}

