//------------------------------------------------------------------------------
// (#)SystemLogFilter.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/22 �V�K�쐬 Y.Inada
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;

import com.nec.jp.orteus.util.logging.LogRecord;
import com.nec.jp.orteus.util.logging.Filter;


/**
 * �o�͉ې�������{<BR>
 *
 * @author  Y.Inada
 * @version 1.00
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
	 * @param  logrecord ���O���R�[�h
	 * @return �o�͂���Ftrue  �o�͂��Ȃ��Ffalse
	 */
	public boolean isLoggable(LogRecord logrecord)
	{
		if(logrecord.getLoggerName().equals(_category) == true){return true;}

		return false;
	}

}

