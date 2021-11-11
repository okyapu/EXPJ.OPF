//------------------------------------------------------------------------------
// (#)InvCommon.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 �V�K�쐬  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * �I�����ʃN���X
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvCommon
{
//--------------------------------------------------------------------------
// �\�z

	/** �R���X�g���N�^ */
	public InvCommon(){ clear(); }

//--------------------------------------------------------------------------
// ���ʃ��\�b�h

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �N���A
	 *
	 * @return	�Ȃ�
	 */
	public void clear()
	{
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 *
	 * @param	statement	����Ώۂ̃X�e�[�g�����g
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if(statement == null)  return;
		try{
			statement.close();
			statement = null;
		}
		catch (SQLException e){}
	}

	/**
	 * ���U���g�Z�b�g�����
	 *
	 * @param	resultset	����Ώۂ̃��U���g�Z�b�g
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if(resultset == null)  return;
		try{
			resultset.close();
			resultset = null;
		}
		catch (SQLException e){}
	}

//--------------------------------------------------------------------------
// ����

	/**
	 * DB�̃V�X�e�������Ǎ�����
	 *
	 * @param	conn	DB�A�N�Z�X�p�̃R�l�N�V����
	 * @return	DB�̃V�X�e������:���� / null:���s
	 */
	public String readSystemDateTime(
		IDbConnection conn)
	{
		String strDateTime = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String strSql = ""
			+"select "
			+"  to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') "
			+"from "
			+"  dual ";

		try
		{
			stmt = (conn.getConn()).prepareStatement(strSql);
			rset = stmt.executeQuery();
			if(rset.next() == true)
			{
				strDateTime = rset.getString(1);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			strDateTime = null;
		}
		finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return strDateTime;
	}

}
