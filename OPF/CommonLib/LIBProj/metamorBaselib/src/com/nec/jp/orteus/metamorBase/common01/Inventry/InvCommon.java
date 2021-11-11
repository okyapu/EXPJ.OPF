//------------------------------------------------------------------------------
// (#)InvCommon.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 棚卸共通クラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvCommon
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvCommon(){ clear(); }

//--------------------------------------------------------------------------
// 共通メソッド

	////////////////////////////////////////////////////////////////////////////
	/**
	 * クリア
	 *
	 * @return	なし
	 */
	public void clear()
	{
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * プリペアドステートメントを閉じる
	 *
	 * @param	statement	閉じる対象のステートメント
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
	 * リザルトセットを閉じる
	 *
	 * @param	resultset	閉じる対象のリザルトセット
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
// 操作

	/**
	 * DBのシステム日時読込処理
	 *
	 * @param	conn	DBアクセス用のコネクション
	 * @return	DBのシステム日時:成功 / null:失敗
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
