//------------------------------------------------------------------------------
// (#)DBErrorMessage.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/07/01 �V�K�쐬 Y.Inada
// 2003/08/08 �p�b�P�[�W���ύX M.Isoda
//            �O�Fcom.nec.jp.orteus.metamorBase.util.db
//            ��Fcom.nec.jp.orteus.metamorBase.common01.DB
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.db;

import java.sql.SQLException;

/**
 * SQL��O�̃G���[���b�Z�[�W���쐬���郆�[�e�B���e�B�N���X�B<BR>
 *
 * @author  Y.Inada
 * @version 1.00
 */
public class DBErrorMessage
{
	/**
	 * �I�u�W�F�N�g���\�z����B
	 */
	public DBErrorMessage(){}

	/**
	 * SQL��O����G���[���b�Z�[�W���쐬����B
	 *
	 * @param  e SQL��O
	 * @return �G���[���b�Z�[�W
	 */
	public static String getMessage(SQLException e)
	{
		String message = "";
		if(e == null){}
		else{

			SQLException nextException = e;
			while(nextException != null){
				message = message + 
						  nextException.getMessage();

				// ����SQLException�擾
				nextException = nextException.getNextException();
			}
		}
		return message;
	}

}

