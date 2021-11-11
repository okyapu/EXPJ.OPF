/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/systemlog/SystemLogger.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.systemlog;

import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.util.logging.Level;

/**
 * �V�X�e�����O���o�͂���(Logger�̍Ē�`)
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:09 $
 */
public class SystemLogger extends Logger
{
	/**
	  * _loggerSync		���b�K�[�����̂��߂̔r���I�u�W�F�N�g
	  */
	private static Object _loggerSync = new Object();

	/**
	 * ���b�K�[�쐬�B<br>
     * ���b�K�[���쐬���A���O�}�l�[�W���ɓo�^���܂��B
     * 
	 * @param  category �J�e�S����
	 * @param  level �o�̓��x��
	  * @return true:�쐬�����@false:�쐬���s
	 */
    public static boolean makeLogger(String category, Level level)
    {
		boolean ret = false;
	    synchronized(_loggerSync)
        {
	        LogManager logmanager = LogManager.getLogManager();
			SystemLogger logger = new SystemLogger(category, null);
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
	 * 
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 */
    public void entering(String s, String s1)
    {
		// �������Ȃ�
    }

	/**
	 * ENTRY���O�o��(�Ē�`)�B
	 * 
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 * @param  aobj
	 */
    public void entering(String s, String s1, Object aobj[])
    {
		// �������Ȃ�
    }

	/**
	 * EXIT���O�o��(�Ē�`)�B
	 * 
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 */
    public void exiting(String s, String s1)
    {
		// �������Ȃ�
    }

	/**
	 * EXIT���O�o��(�Ē�`)�B
	 * 
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 * @param  obj �I�u�W�F�N�g
	 */
    public void exiting(String s, String s1, Object obj)
    {
		// �������Ȃ�
    }

	/**
	 * THROW���O�o��(�Ē�`)�B
	 * 
	 * @param  s �J�e�S����
	 * @param  s1 ���\�[�X�o���h����
	 * @param  throwable throw
	 */
    public void throwing(String s, String s1, Throwable throwable)
    {
		// �������Ȃ�
    }

	/**
	 * ���b�K�[�̍\�z
	 * 
	 * @param name Logger �̖��O
	 * @param resourceBundleName ResourceBundle �̖��O
	*/
	public SystemLogger(String name, String resourceBundleName)
	{
		super(name, resourceBundleName);
	}

}

