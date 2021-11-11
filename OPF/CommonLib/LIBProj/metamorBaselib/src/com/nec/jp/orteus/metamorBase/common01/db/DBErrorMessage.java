//------------------------------------------------------------------------------
// (#)DBErrorMessage.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/07/01 新規作成 Y.Inada
// 2003/08/08 パッケージ名変更 M.Isoda
//            前：com.nec.jp.orteus.metamorBase.util.db
//            後：com.nec.jp.orteus.metamorBase.common01.DB
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.db;

import java.sql.SQLException;

/**
 * SQL例外のエラーメッセージを作成するユーティリティクラス。<BR>
 *
 * @author  Y.Inada
 * @version 1.00
 */
public class DBErrorMessage
{
	/**
	 * オブジェクトを構築する。
	 */
	public DBErrorMessage(){}

	/**
	 * SQL例外からエラーメッセージを作成する。
	 *
	 * @param  e SQL例外
	 * @return エラーメッセージ
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

				// 次のSQLException取得
				nextException = nextException.getNextException();
			}
		}
		return message;
	}

}

