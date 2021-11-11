//------------------------------------------------------------------------------
// (#)SystemLogConfig.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/17 �V�K�쐬 M.Sakamoto
// 2003/06/24 OrteusStudio�o�[�W�����A�b�v�ɔ����C�� Y.Inada
//            �O�FdoConnection[ver1.00.03]
//            ��FIDbConnection[ver1.00.05]
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/07/29 SunOne�Ή��ׁ̈A�{�N���X���V���O���g���N���X�ɏC�� Y.Inada
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;

import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Handler;
import com.nec.jp.orteus.util.logging.Level;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.util.logging.ConsoleHandler;
import com.nec.jp.orteus.util.logging.LogStartupException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.MissingResourceException;
import java.util.Enumeration;

/**
  * �V�X�e�����O�ݒ�
  *
  * @author  M.Sakamoto
  * @version 1.00
*/
public class SystemLogConfig
{

	/**
	  * �C���X�^���X�擾
	  * @return �V�X�e���ݒ�
	 */
	public static SystemLogConfig getInstance()
	{
		return _config;
	}

	/**
	  * �������B
	  * @return true:����������  false:���������s
	*/
	public static synchronized boolean init()
	{
		// ���O�o�͏�Ԃ̃`�F�b�N
		if(_status == true) return _status;

		// ������
		LogManager manager = LogManager.getLogManager();
		manager.removeAllGlobalHandlers();

		// ���s
		boolean ret = exec();
		_categorys.clear();
		_logfiles.clear();

		// ����
		if(false == ret) {
			// �ُ팟�o�̂��߁A�N���[���A�b�v
			manager.removeAllGlobalHandlers();

			// �ُ�I��
			System.out.println("(SBM1204)ERROR SystemLog:�������Ɏ��s���܂���");
			System.out.println("(SBM1212)ERROR SystemLog:�N�����~���܂�");

			// ���O�o�͕s�ݒ�
			_status = false;
		}
		else{
			// ���O�o�͉\�ݒ�
			_status = true;
		}

		return _status;
	}

	/**
	  * ���{�B
	  * @return ����:true / ���s:false
	*/
	private static boolean exec()
	{
		// ��`�t�@�C���p��
		ResourceBundle outproperties = null;
		try {
			outproperties = ResourceBundle.getBundle(SystemLogCommon.HANDLER_PROPERTIES);
		}catch(MissingResourceException ex) {
			System.out.println("(SBM1213)ERROR SystemLog:�o�͐��`["
					+ SystemLogCommon.HANDLER_PROPERTIES + ".properties]��������܂���");
			return false;
		}

		// ���擾
		int environment = getEnvironment(outproperties);
		if(SystemLogCommon.ENVIRONMENT_UNKOWN == environment)
			return false;		// ���ʈُ�

		// ���ʒ�`�W�J
		boolean ret = makeHandler(
				SystemLogCommon.COMMON_CATEGORY, environment, outproperties);
		if(false == ret)
			return false;		// ���ʈُ�

		// �ʒ�`�W�J
		ret = makeIndividualHandler(environment, outproperties);
		if(false == ret)
			return false;		// ���ʈُ�

		// ����I��
		return true;
	}

	/**
	  * �ʒ�`�W�J�B
	  * @param environment �����
	  * @param properties �o�͐��`�t�@�C���̃��\�[�X�o���h��
	  * @return true(���ʐ���), false(���ʈُ�)
	*/
	private static boolean makeIndividualHandler(
			int environment, ResourceBundle properties)
	{
		// ��`���擾
		Integer propertynum = SystemConfig.getPropertyNumber("DefinitionCount", properties);
		if(null == propertynum) {
			System.out.println("(SBM1214)ERROR SystemLog:�o�͐��` Key[DefinitionCount]�����ݒ�ł�");
			return false;		// ���ʈُ�
		}
		if(propertynum.intValue() < 0 || 999 < propertynum.intValue()) {
			System.out.println("(SBM1215)ERROR SystemLog:�o�͐��` "
					+ "Key[DefinitionCount]�̐ݒ�l���s���ł�[" + propertynum.intValue() + "]");
			return false;		// ���ʈُ�
		}

		// ��`�����A��`��W�J
		String category = null;
		String categorykey = null;
		for(int i = 1; i <= propertynum.intValue(); i++) {
			// �J�e�S�����擾
			categorykey = "category" + paddingZero(i, 3);
			category = SystemConfig.getProperty(categorykey, properties);
			if(null == category)
				continue;		// �������΂�

			// �J�e�S���d���`�F�b�N
			for(int j = 0; j < _categorys.size(); j++) {
				if(true == category.equals((String)_categorys.get(j))) {
					System.out.println("(SBM1216)ERROR SystemLog:�o�͐��` "
							+ "�J�e�S��[" + category + "]���d����`����Ă��܂�");
					return false;	// �J�e�S���d���̂��߁A���ʈُ�
				}
			}

			// �n���h���쐬
			boolean ret = makeHandler(category, environment, properties);
			if(false == ret)
				return false;		// ���ʈُ�
		}
		return true;
	}

	/**
	  * �o�͐��`�W�J�B
	  * @param category �o�͐��`��W�J����J�e�S��
	  * @param environment �����
	  * @param properties �o�͐��`�t�@�C���̃��\�[�X�o���h��
	  * @return true(���ʐ���), false(���ʈُ�)
	*/
	private static boolean makeHandler(
			String category, int environment, ResourceBundle properties)
	{
		// �o�̓��x���擾
		Level level = getLevel(category, properties);
		if(Level.OFF == level)
			return false;	// ���ʈُ�

		// �n���h���L�[�擾
		ArrayList handlerkeys = getHandlers(category, properties);
		if(null == handlerkeys)
			return false;	// ���ʈُ�

		// �o�͐�ڍאݒ�
		boolean ret = false;
		ArrayList handlers = new ArrayList(0);
		for(int i = 0; i < handlerkeys.size(); i++) {
			ret = createHandler(category + "." + (String)handlerkeys.get(i), properties, handlers);
			if(false == ret)
				return false;		// ���ʈُ�
			if(true == handlers.isEmpty())
				break;				// "�Ȃ�"�̐ݒ肪�s��ꂽ���߁A�ݒ��~
		}

		// �n���h���o�^
		SystemLogFilter filter = new SystemLogFilter(category);
		SystemLogFormatter formatter = new SystemLogFormatter(environment);
		LogManager manager = LogManager.getLogManager();
		for(int j = 0; j < handlers.size(); j++) {
			Handler handler = (Handler)handlers.get(j);
			handler.setFilter(filter);
			handler.setFormatter(formatter);
			handler.setLevel(level);
			manager.addGlobalHandler(handler);
		}

		// �J�e�S���o�^
		_categorys.add(category);

		// ���b�K�[�o�^
		ret = makeLogger(category, level);
		if(false == ret)
			return false;		// ���ʈُ�

		return true;
	}

	/**
	  * �o�͐��`�W�J�B
	  * @param category �o�͐��`��W�J����n���h���L�[
	  * @param properties �o�͐��`�t�@�C���̃��\�[�X�o���h��
	  * @param handlers �n���h�����X�g
	  * @return true(���ʐ���), false(���ʈُ�)
	*/
	private static boolean createHandler(
			String key, ResourceBundle properties, ArrayList handlers)
	{
		String value = SystemConfig.getProperty(key, properties);
		if(true == "Console".equals(value)) {
			// �R���\�[���n���h���쐬
			handlers.add(new ConsoleHandler());

		}else if(true == "File".equals(value)) {
			// �t�@�C���n���h���쐬
			Handler handler = createFileHandler(key, properties);
			if(null == handler)
				return false;			// ���ʈُ�
			handlers.add(handler);

		}else if(true == "None".equals(value)) {
			// �o�͂Ȃ�
			handlers.clear();

		}else if(null == value) {
			// �ݒ�l�ُ�
			System.out.println("(SBM1217)ERROR SystemLog:�o�͐��` Key[" + key + "]�����ݒ�ł�");
			return false;

		}else{
			// ���ݒ�
			System.out.println("(SBM1218)ERROR SystemLog:�o�͐��` "
					+ "Key[" + key + "]�̐ݒ�l���s���ł�[" + value + "]");
			return false;
		}
		return true;
	}

	/**
	  * �t�@�C���n���h�������B
	  * @param category �o�͐��`��W�J����n���h���L�[
	  * @param properties �o�͐��`�t�@�C���̃��\�[�X�o���h��
	  * @param handlers �n���h�����X�g
	  * @return true(���ʐ���), false(���ʈُ�)
	*/
	private static Handler createFileHandler(String key, ResourceBundle properties)
	{
		// �p��
		SystemLogFileHandler fileHandler = null;
		String pathvalue = null;
		Integer limit = new Integer(0);
		Integer backup = new Integer(0);

		// �t�@�C���p�X
		String keypath = key + ".logfile";
		pathvalue = SystemConfig.getProperty(keypath, properties);
		if(null == pathvalue) {
			System.out.println("(SBM1217)ERROR SystemLog:�o�͐��` Key[" + keypath + "]�����ݒ�ł�");
			return null;			// ���ʈُ�
		}else if(true == pathvalue.equals("")) {
			System.out.println("(SBM1217)ERROR SystemLog:�o�͐��` Key[" + keypath + "]�����ݒ�ł�");
			return null;			// ���ʈُ�
		}

		// �p�X�d���`�F�b�N
		for(int i = 0; i < _logfiles.size(); i++) {
			if(true == pathvalue.equals((String)_logfiles.get(i))) {
				System.out.println("(SBM1235)ERROR SystemLog:�o�͐��` "
						+ "���O�t�@�C��[" + pathvalue + "]���d����`����Ă��܂�");
				return null;
			}
		}

		// �؂�ւ�
		String keyswitch = key + ".switchTrigger";
		String triggervalue = SystemConfig.getProperty(keyswitch, properties);
		if(null != triggervalue) {
			// �؂�ւ�����
			if(true == triggervalue.equals("")) {
				System.out.println("(SBM1217)ERROR SystemLog:�o�͐��` Key[" + keyswitch + "]�����ݒ�ł�");
				return null;			// ���ʈُ�
			}
			if(false == "Size".equals(triggervalue)) {
				System.out.println("(SBM1218)ERROR SystemLog:�o�͐��` "
						+ "Key[" + keyswitch + "]�̐ݒ�l���s���ł�[" + triggervalue + "]");
				return null;			// �ݒ�l��"Size"�ȊO�̂��߁A���ʈُ�
			}

			// �؂�ւ��P�ʁA�o�b�N�A�b�v��
			String keynum = key + ".switchnum";
			String keybackup = key + ".backup";
			limit = SystemConfig.getPropertyNumber(keynum, properties);
			backup = SystemConfig.getPropertyNumber(keybackup, properties);
			if(null == limit) {
				System.out.println("(SBM1217)ERROR SystemLog:�o�͐��` Key[" + keynum + "]�����ݒ�ł�");
				return null;			// ���ʈُ�
			}
			if(null == backup) {
				System.out.println("(SBM1217)ERROR SystemLog:�o�͐��` Key[" + keybackup + "]�����ݒ�ł�");
				return null;			// ���ʈُ�
			}

			// �͈̓`�F�b�N
			if(limit.intValue() < 1 || Long.MAX_VALUE < limit.intValue()) {
				System.out.println("(SBM1218)ERROR SystemLog:�o�͐��` "
						+ "Key[" + keynum + "]�̐ݒ�l���s���ł�[" + limit + "]");
				return null;		// �؂�ւ��P�ʂ��͈͊O�̂��߁A���ʈُ�
			}
			if(backup.intValue() < 1 || 999 < backup.intValue()) {
				System.out.println("(SBM1218)ERROR SystemLog:�o�͐��` "
						+ "Key[" + keybackup + "]�̐ݒ�l���s���ł�[" + backup + "]");
				return null;		// �o�b�N�A�b�v�����͈͊O�̂��߁A���ʈُ�
			}
		}

		// �t�@�C���n���h������
		try{
			fileHandler = new SystemLogFileHandler(pathvalue, limit.intValue(), backup.intValue());
		}catch(LogStartupException logex){
			System.out.println("(SBM1236)ERROR SystemLog:�o�͐��` "
					+ "Key[" + key + "]�ݒ�ɂ�鏉�����Ɏ��s���܂���");
			System.out.println("MESSAGE " + logex.getMessage());
			return null;
		}

		// �t�@�C���p�X�o�^
		_logfiles.add(pathvalue);
		return fileHandler;
	}

	/**
	  * ���b�K�[�o�^�B
	  * @param category �o�͐��`��W�J����n���h���L�[
	  * @param level �o�̓��x��
	  * @return true(���ʐ���), false(���ʈُ�)
	*/
	private static boolean makeLogger(String category, Level level)
	{
		// ���b�K�[�쐬
		boolean ret = SystemLogger.makeLogger(category, level);
		if(false == ret) {
			System.out.println("(SBM1237)ERROR SystemLog:�J�e�S��[" + category + "]��LOGGER�����Ɏ��s���܂���");
		}
		return ret;
	}

	/**
	  * ���擾�B
	  * @param properties �o�͐��`�t�@�C���̃��\�[�X�o���h��
	  * @return ��
	*/
	private static int getEnvironment(ResourceBundle properties)
	{
		int environment = SystemLogCommon.ENVIRONMENT_UNKOWN;	// �s��
		String value = SystemConfig.getProperty("systemlog.environment", properties);
		if(null == value) {
			System.out.println("(SBM1238)ERROR SystemLog:�o�͐��` Key[systemlog.environment]�����ݒ�ł�");
			return environment;
		}
		if(true == "Development".equals(value)) {
			environment = SystemLogCommon.ENVIRONMENT_DEVELOPMENT;		// �J����
		}else if(true == "Employment".equals(value)) {
			environment = SystemLogCommon.ENVIRONMENT_EMPLOYMENT;		// �^�p��
		}else{
			System.out.println("(SBM1239)ERROR SystemLog:�o�͐��` " + 
				"Key[systemlog.environment]�̐ݒ�l���s���ł�[�ݒ�l:" + value + "]");
		}
		return environment;
	}

	/**
	  * �o�̓��x���擾�B
	  * @param category �擾�ΏۃJ�e�S��
	  * @param properties �o�͐��`�t�@�C���̃��\�[�X�o���h��
	  * @return �o�̓��x��
	*/
	private static Level getLevel(String category, ResourceBundle properties)
	{
		Level level = Level.OFF;		// ���O�o�͂Ȃ�
		String key = category + ".level";
		String value = null;
		try {
			value = SystemConfig.getProperty(key, properties);
			if(value != null) {
				level = Level.parse(value);
			}else{
				System.out.println("(SBM1217)ERROR SystemLog:�o�͐��` Key[" + key + "]�����ݒ�ł�");
			}
		}
		catch(IllegalArgumentException ex) {
			System.out.println("(SBM1218)ERROR SystemLog:�o�͐��` "
					+ "Key[" + category + "]�̐ݒ�l���s���ł�[" + value + "]");
		}
		return level;
	}

	/**
	  * �o�͐�擾�B
	  * @param category �擾�ΏۃJ�e�S��
	  * @param properties �o�͐��`�t�@�C���̃��\�[�X�o���h��
	  * @return �o�͐�(�n���h��)�̃��X�g
	*/
	private static ArrayList getHandlers(String category, ResourceBundle properties)
	{
		ArrayList list = null;
		String value = null;
		try {
			value = SystemConfig.getProperty(category, properties);
			if(null != value) {
				list = new ArrayList(0);
				StringTokenizer token = new StringTokenizer(value, ",");
				while(true == token.hasMoreTokens()) {
					list.add(token.nextToken());
				}
			}else{
				System.out.println("(SBM1217)ERROR SystemLog:�o�͐��` Key[" + category + "]�����ݒ�ł�");
			}
		}
		catch(NoSuchElementException ex) {
			System.out.println("(SBM1218)ERROR SystemLog:�o�͐��` "
					+ "Key[" + category + "]�̐ݒ�l���s���ł�[" + value + "]");
			list = null;
		}
		return list;
	}

	/**
	  * ���l��0�l�߁B
	  * @param target ���l
	  * @param count ����
	  * @return ����
	*/
	private static String paddingZero(int target, int count)
	{
		StringBuffer buff = new StringBuffer(Integer.toString(target));
		while(buff.length() < count) {
			buff.insert(0, '0');
		}
		return buff.toString();
	}

	/**
	 * �R���X�g���N�^
	 */
	private SystemLogConfig(){}

	/** �C���X�^���X */
	private static SystemLogConfig _config = new SystemLogConfig();

	/** ���O�o�͏��  true:�o�͉\  false:�o�͕s�� */
	private static boolean _status = false;

	/** �J�e�S�����X�g */
	private static ArrayList _categorys = new ArrayList(0);

	/** ���O�t�@�C���p�X���X�g */
	private static ArrayList _logfiles = new ArrayList(0);
}

