/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/PrivateConfig.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * SYS_PARAMETERの設定値取得クラス
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:13 $
*/

public class PrivateConfig {


	/** 
	 * DBとのコネクション 
	 */
	private IDbConnection _conn = null;

	/** 
	 * 設定値作成用付加名称 
	 */
	private final String _ADD_NAME = "_COUNT";

	/** 
	 * 設定値取得SQL 
	 */
	private final String _sqlSysParameterl =
		  "select SYS_PARAMETER.\"VALUE\" as \"VALUE\" "
		+ "from SYS_PARAMETER "
		+ "where SYS_PARAMETER.\"NAME\" = ? "
		+ "order by SYS_PARAMETER.\"NAME\"";

	/**
	 * コンストラクタ
	 * この形式でのインスタンス生成は不可
	 */
	private PrivateConfig(){}

	/**
	 * コンストラクタ
	 * @param DBアクセス用のコネクション
	 */
	public PrivateConfig(IDbConnection conn){ 
		_conn = conn; 
	}

	/**
	 * 設定値取得(文字列型)
	 * @param name 取得キー
	 * @return 設定値(取得に失敗した場合null)
	 * @throws SQLException DBアクセスエラー
	 */
	public String getString(String name)
			throws SQLException {
		String stringValue = null;
		ResultSet result = null;
		PreparedStatement stmt = null;

		//コネクション、引数が無い場合は処理しない
		if (name == null || _conn == null) {
			return null;
		} 

		try{
			stmt = makeSQL(name);
			result = stmt.executeQuery();
			
			if (result.next()){
				stringValue = result.getString(1);
			}

		}finally{
			closeResultSet(result);
			closePreparedStatement(stmt);
		}

		return stringValue;
	}

	/**
	 * 設定値取得(整数型)
	 * @param name 取得キー
	 * @return 設定値(取得に失敗/数値変換失敗した場合null)
	 * @throws SQLException DBアクセスエラー
	 */
	public Integer getNumber(String name)
			throws SQLException {
		String s = null;
		Integer integerValue = null;
		try{
			s = getString(name);
			if(s == null) {
				return null;
			} 
			Integer convValue = new Integer(s);
			integerValue = convValue;
		}
		catch(NumberFormatException e){
			integerValue = null;
		}
		return integerValue;
	}

	/**
	 * 設定値取得(文字列型・複数設定値)
	 * @param key 取得キーのキーワード
	 * @return 設定値(String)のリスト(取得に失敗した場合null)
	 * @throws SQLException DBアクセスエラー
	 */
	public ArrayList getStrings(String key)
			throws SQLException {
		ArrayList list = null;

		//コネクション、引数が無い場合は処理しない
		if (key == null || _conn == null) {
			return null;
		} 

		list = getStringList(key);

		return list;

	}

	/**
	 * 設定値取得(整数型・複数設定値)
	 * @param key 取得キーのキーワード
	 * @return 設定値(Integer)のリスト(取得に失敗/数値変換失敗した場合null)
	 * @throws SQLException DBアクセスエラー
	 */
	public ArrayList getNumbers(String key)
			throws SQLException {
		ArrayList list = null;
		ArrayList intList = null;
		boolean bRet = false;

		//コネクション、引数が無い場合は処理しない
		if (key == null || _conn == null) {
			return null;
		} 

		list = getStringList(key);
		if (list == null) {
			return null;
		} 
		try{
			intList = new ArrayList(0);
			for (int n = 0; n < list.size(); n++){
				Integer value = new Integer((String)list.get(n));
				intList.add(value);
			}
		}
		catch(NumberFormatException e){
			intList = null;
			return null;
		}
		return intList;
	}
	
	/**
	 * 文字列リスト生成
 	 * @param key 取得キーのキーワード
	 * @return 設定値(Integer)のリスト(取得に失敗した場合null)
	 * @throws SQLException DBアクセスエラー
	 */
	private ArrayList getStringList(String key)
			throws SQLException {
		ResultSet result = null;
		ArrayList list = null;
		String keyName = null;
		String counts = null;
		String each = null;

		try{
			// 設定数を取得
			keyName = makeCountName(key);
			counts = getString(keyName);
			if (counts != null){
				list = new ArrayList(0);
				int loopCnt = Integer.parseInt(counts);
				// 各設定値を取得
				for (int cnt = 0 ;cnt < loopCnt; cnt++){
					//設定値検索SQL取得(1～連番)
					keyName = makeSeqName(key, (cnt + 1));
					each = getString(keyName);
					if (each != null){
						String value = new String(each);
						list.add(value);
					}else{
						// 連番でない場合はnullを返す
						list = null;
						break;
					}
				}
			}
		}catch(NumberFormatException e){
			list = null;
		}
		return list;
	}
	
	/**
	 * 設定値取得SQL生成
	 * @param name 取得キー
	 * @return SQL
	 * @throws SQLException DBアクセスエラー
	 */
	private PreparedStatement makeSQL(String name)
			throws SQLException {
		PreparedStatement stmt = null;

		stmt = (_conn.getConn()).prepareStatement(_sqlSysParameterl);
		stmt.setString(1, name);

		return stmt;
	}

	/**
	 * カウント値取得名称生成
	 * @param key 取得キー
	 * @return 生成レコード定義名称
	 */
	private String makeCountName(String key)
	{
		return key + _ADD_NAME;
	}

	/**
	 * 設定値取得名称生成
	 * @param key 取得キー
	 * @param keyNo 取得キー
	 * @return 生成レコード定義名称(key + "_" + keyNo) 
	 */
	private String makeSeqName(String key, int keyNo){
		return key + "_" + keyNo;
	}
	
	/**
	 * プリペアドステートメントを閉じる
	 * @param statement 閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement statement){
		if (statement == null) {
			return; 
		} 
		try{
			statement.close();
			statement = null;
		}
		catch (SQLException e){}
	}

	/**
	 * リザルトセットを閉じる
	 * @param resultset 閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet resultset){
		if (resultset == null) {
			return; 
		} 
		try{
			resultset.close();
			resultset = null;
		}
		catch (SQLException e){}
	}

}
