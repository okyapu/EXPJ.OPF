//------------------------------------------------------------------------------
// (#)SystemLog.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/17 �V�K�쐬 M.Sakamoto
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//			  �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//			  ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//			  JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/07/29 Y.Inada
//			  ���������A�V�X�e�����O��`�̏�����������ǉ�(SunOne�Ή�)
//			  �R�l�N�V�����ݒ胁�\�b�h�ǉ�(setConnection())
// 2003/09/30 Y.Mitui
//			  �擾���b�Z�[�W���c�a����擾����̂�p�~
//			  �擾���b�Z�[�W��AlarmMessage.properties�t�@�C������擾����C��
//			  �igetLogMessage���̃��b�Z�[�W�擾���@����V)
// 2003/10/08 ���b�Z�[�W�擾�t�@�C����`��SystemLogCommon�Ɉړ�  K.Shiraki
//            ���b�Z�[�W�擾���s���̕ԋp���b�Z�[�W�Ƀ��b�Z�[�W�ԍ����܂߂�
//------------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.util.SystemLog;

import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.util.logging.Level;
import com.nec.jp.orteus.util.CoreTools;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.MissingResourceException;

/**
 * �V�X�e�����O���o�͂���ׂ̃C���^�t�F�[�X�B
 *
 * @author	Y.Inada
 * @version 1.00
 */
public class SystemLog
{
	/**
	 * �I�u�W�F�N�g���\�z����B
	 */
	public SystemLog(){}

	/**
	 * �������B<BR>
	 * �V�X�e�����O�̋@�\���g�p����ꍇ�A�K�����������s���K�v������A<BR>
	 * �����������ɃV�X�e�����O�@�\���g�p�����ꍇ�̓���͕ۏ؂��Ȃ��B
	 * <BR>
	 * @param  category �J�e�S��
	 * @return true:����������	false:���������s
	 */
	public boolean init(String packageName)
	{
		// ���O�o�͂̏���
		SystemLogConfig config = SystemLogConfig.getInstance();
		if(config.init() == false) return false;

		ResourceBundle appproperties =
				ResourceBundle.getBundle(SystemLogCommon.APPRICATION_PROPERTIES);

		String category = null;
		try {
			category = appproperties.getString(packageName);
		}
		catch(MissingResourceException ex) {
			// �p�b�P�[�W����`����Ă��Ȃ��ꍇ�A���ʃJ�e�S���g�p
			category = SystemLogCommon.COMMON_CATEGORY;
		}
		catch(NullPointerException nu) {
			// �L�[��NULL�̏ꍇ�A���ʃJ�e�S���g�p
			category = SystemLogCommon.COMMON_CATEGORY;
		}

		LogManager logmgr = LogManager.getLogManager();
		_logger = logmgr.getLogger(category);

		return true;
	}

	/**
	 * �R�l�N�V�����ݒ�B<BR>
	 * <BR>
	 * @param  connect �R�l�N�V����
	 */
	public void setConnection(IDbConnection connect)
	{

		/* 
			���ݎg�p����Ă��Ȃ��R�[�h�ł��B
			�����Ɩ��`�o����肱�̃��\�b�h���Ăяo�����ׁA
			�R���p�C���s�̉���ɂ��̃��\�b�h�͎c���܂��B
			����āA�S�Ă̋Ɩ��`�o��肱�̃��\�b�h���폜���ꂽ���ɁA
			���̃��\�b�h���������Ă��������B
			���@���ɁA�����Ŏg�p���Ă����֘A�R�[�h�͑S�č폜�ς݂ł��B
		*/

	}

//-----------------------------------------------------------------------------

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B<BR>
	 * �s���Ȓl�������n�����ꍇ�̓���͕ۏႵ�Ȃ��B<BR>
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  user ���s���[�U��
	 */
	public void severe(String messageNo, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  user ���s���[�U��
	 */
	public void severe(String messageNo, String user, Object param1)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user, param1);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  user ���s���[�U��
	 */
	public void severe(String messageNo, String user,
					Object param1, Object param2)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user, param1, param2);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  param3 �p�����[�^3
	 * @param  user ���s���[�U��
	 */
	public void severe(String messageNo, String user,
					Object param1, Object param2, Object param3)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user, param1, param2, param3);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param �p�����[�^�z��
	 * @param  user ���s���[�U��
	 */
	public void severe(String messageNo, String user, Object[] param)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  user ���s���[�U��
	 */
	public void warning(String messageNo, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  user ���s���[�U��
	 */
	public void warning(String messageNo, String user, Object param1)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user, param1);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  user ���s���[�U��
	 */
	public void warning(String messageNo, String user,
					Object param1, Object param2)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user, param1, param2);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  param3 �p�����[�^3
	 * @param  user ���s���[�U��
	 */
	public void warning(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user, param1, param2, param3);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param �p�����[�^�z��
	 * @param  user ���s���[�U��
	 */
	public void warning(String messageNo, String user, Object[] param)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  user ���s���[�U��
	 */
	public void info(String messageNo, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  user ���s���[�U��
	 */
	public void info(String messageNo, String user, Object param1)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user, param1);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  user ���s���[�U��
	 */
	public void info(String messageNo, String user,
					Object param1, Object param2)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user, param1, param2);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  param3 �p�����[�^3
	 * @param  user ���s���[�U��
	 */
	public void info(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user, param1, param2, param3);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param �p�����[�^�z��
	 * @param  user ���s���[�U��
	 */
	public void info(String messageNo, String user, Object[] param)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  user ���s���[�U��
	 */
	public void config(String messageNo, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  user ���s���[�U��
	 */
	public void config(String messageNo, String user, Object param1)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user, param1);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  user ���s���[�U��
	 */
	public void config(String messageNo, String user, 
					Object param1, Object param2)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user, param1, param2);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  param3 �p�����[�^3
	 * @param  user ���s���[�U��
	 */
	public void config(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user, param1, param2, param3);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param �p�����[�^�z��
	 * @param  user ���s���[�U��
	 */
	public void config(String messageNo, String user, Object[] param)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  user ���s���[�U��
	 */
	public void fine(String messageNo, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  user ���s���[�U��
	 */
	public void fine(String messageNo, String user, Object param1)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user, param1);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  user ���s���[�U��
	 */
	public void fine(String messageNo, String user, 
					Object param1, Object param2)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user, param1, param2);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  param3 �p�����[�^3
	 * @param  user ���s���[�U��
	 */
	public void fine(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user, param1, param2, param3);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param �p�����[�^�z��
	 * @param  user ���s���[�U��
	 */
	public void fine(String messageNo, String user, Object[] param)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  user ���s���[�U��
	 */
	public void finer(String messageNo, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  user ���s���[�U��
	 */
	public void finer(String messageNo, String user, Object param1)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user, param1);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  user ���s���[�U��
	 */
	public void finer(String messageNo, String user, 
					Object param1, Object param2)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user, param1, param2);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  param3 �p�����[�^3
	 * @param  user ���s���[�U��
	 */
	public void finer(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user, param1, param2, param3);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param �p�����[�^�z��
	 * @param  user ���s���[�U��
	 */
	public void finer(String messageNo, String user, Object[] param)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user, param);
	}

//-----------------------------------------------------------------------------
	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  user ���s���[�U��
	 */
	public void finest(String messageNo, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  user ���s���[�U��
	 */
	public void finest(String messageNo, String user, Object param1)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user, param1);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  user ���s���[�U��
	 */
	public void finest(String messageNo, String user, 
					Object param1, Object param2)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user, param1, param2);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  param3 �p�����[�^3
	 * @param  user ���s���[�U��
	 */
	public void finest(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user, param1, param2, param3);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param �p�����[�^�z��
	 * @param  user ���s���[�U��
	 */
	public void finest(String messageNo, String user, Object[] param)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user, param);
	}

//-----------------------------------------------------------------------------
	/**
	 * �f�o�b�O�p ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  message ���O���b�Z�[�W
	 * @param  user ���s���[�U��
	 */
	public void fine_d(String message, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINE) == false) return;

		log_d(Level.FINE, message, user);
	}

	/**
	 * �f�o�b�O�p ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  message ���O���b�Z�[�W
	 * @param  user ���s���[�U��
	 */
	public void finer_d(String message, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINER) == false) return;
		log_d(Level.FINER, message, user);
	}

	/**
	 * �f�o�b�O�p ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  message ���O���b�Z�[�W
	 * @param  user ���s���[�U��
	 */
	public void finest_d(String message, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log_d(Level.FINEST, message, user);
	}

//-----------------------------------------------------------------------------
	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  level �o�̓��x��
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  user ���s���[�U��
	 */
	public void log(Level level, String messageNo, String user)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(level) == false) return;

		Object[] param = {};
		log(level, messageNo, user, param);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  level �o�̓��x��
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  user ���s���[�U��
	 */
	public void log(Level level, String messageNo, String user,
					Object param1)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(level) == false) return;

		Object[] param = {param1};
		log(level, messageNo, user, param);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  level �o�̓��x��
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  user ���s���[�U��
	 */
	public void log(Level level, String messageNo, String user, 
					Object param1, Object param2)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(level) == false) return;

		Object[] param = {param1, param2};
		log(level, messageNo, user, param);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  level �o�̓��x��
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param1 �p�����[�^1
	 * @param  param2 �p�����[�^2
	 * @param  param3 �p�����[�^3
	 * @param  user ���s���[�U��
	 */
	public void log(Level level, String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(level) == false) return;

		Object[] param = {param1, param2, param3};
		log(level, messageNo, user, param);
	}

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  level �o�̓��x��
	 * @param  messageNo ���O���b�Z�[�W�ԍ�
	 * @param  param �p�����[�^�z��
	 * @param  user ���s���[�U��
	 */
	public void log(Level level, String messageNo, String user, Object[] param)
	{
		// ���O���L�^����? �L�^���Ȃ��ꍇ�A�I���B
		if(_logger.isLoggable(level) == false) return;

		String message = getLogMessage(messageNo, CoreTools.getLocale(user));
		String newMessage = createMessage(message, param);
		log_d(level, newMessage, user);
	}

//-----------------------------------------------------------------------------

	/**
	 * ���O�o�́B<BR>
	 * �w�肳�ꂽ���O���b�Z�[�W�ԍ����烍�O���b�Z�[�W���擾���A<BR>
	 * �o�͐��`�A�A�v���P�[�V������`�Œ�`���ꂽ�o�͐�ɏo�͂���B
	 * @param  level �o�̓��x��
	 * @param  message ���O���b�Z�[�W
	 * @param  user ���s���[�U��
	 */
	public void log_d(Level level, String message, String user)
	{
		_logger.log(level, SystemLog.class.getName(), 
								null, messagecat(message, user));
	}

//-----------------------------------------------------------------------------

	/**
	 * ���b�Z�[�W�Ǝ��s���[�U����A������B
	 * <BR>
	 * @param  message ���b�Z�[�W
	 * @param  user ���s���[�U��
	 * @return �A���������b�Z�[�W
	 */
	private String messagecat(String message, String user)
	{
		if(user == null) return message;

		// �A��
		String newMessage = message+"["+user+"]";
		return newMessage;
	}

	/**
	 * ���b�Z�[�W�Ƀp�����[�^��}�����A���b�Z�[�W��������쐬����B
	 * <BR>
	 * @param  message ���b�Z�[�W
	 * @param  param �p�����[�^
	 * @return �p�����[�^��ݒ肵�����b�Z�[�W
	 */
	private String createMessage(String message, Object[] param)
	{
		return MessageFormat.format(message, param);
	}

//-----------------------------------------------------------------------------
	/**
	 * �w�肳�ꂽ�L�[�̃��b�Z�[�W���擾����B
	 * <BR>
	 * @param  messageNo ���b�Z�[�W�ԍ�
	 * @param  locale ����R�[�h
	 * @return �擾�������b�Z�[�W�B
	 *		   �擾�ł��Ȃ������ꍇ�́A���b�Z�[�W�����݂��Ȃ��|��`���郁�b�Z�[�W��Ԃ��B
	 */
	private String getLogMessage(String messageNo, String locale)
	{

		/** ���b�Z�[�W�v���p�e�B�t�@�C�� */
		ResourceBundle messageFile = null;
		String filename = SystemLogCommon.MESSAGE_PROPERTIES_FILE;

		try {
			//���b�Z�[�W�v���p�e�B�t�@�C���̃o���h��
			if (CoreTools.getLocale(null).equals(locale)) {
				messageFile = ResourceBundle.getBundle(filename);
			} else {
				messageFile = CoreTools.getResourceBundle(filename, locale);
			}

		}catch (MissingResourceException e) {
			//�o���h�����s
			messageFile = null;
			return new String("(SBM0943)���b�Z�[�W��`�t�@�C��[" + filename + "]��������܂���B");
		}

		String val = null;

		try {
			//���b�Z�[�W�̎擾
			val = messageFile.getString(messageNo);

			if(val == null){
				val = new String("(SBM0835)���b�Z�[�W�L�[ " + messageNo + " �ɑΉ����郁�b�Z�[�W������܂���B");
			}

		}catch (MissingResourceException e) {
			val = new String("(SBM0835)���b�Z�[�W�L�[ " + messageNo + " �ɑΉ����郁�b�Z�[�W������܂���B");

		}finally{
			messageFile = null;
		}

		return val;

	}

	/** �R�l�N�V���� */
	private IDbConnection _conn = null;

	/** ���b�K�[ */
	private Logger _logger = null;

}
