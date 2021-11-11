/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/systemlog/SystemLogFilter.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.systemlog;

import com.nec.jp.orteus.util.logging.LogRecord;
import com.nec.jp.orteus.util.logging.Filter;


/**
 * �o�͉ې�������{
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:09 $
 */
public class SystemLogFilter implements Filter
{
	/**
	 * �����o�ϐ��̒�`
	 *
	 */
	private String _category = null;

	/**
	 * �I�u�W�F�N�g���\�z����B
	 * @param  category �J�e�S��
	 */
	public SystemLogFilter(String category){
		_category = new String(category);
	}

	/**
	 * �o�͉۔���B
	 * 
	 * @param  logrecord ���O���R�[�h
	 * @return �o�͂���Ftrue  �o�͂��Ȃ��Ffalse
	 */
	public boolean isLoggable(LogRecord logrecord)
	{
		if (logrecord.getLoggerName().equals(_category) == true) {
			return true;
		}

		return false;
	}

}

