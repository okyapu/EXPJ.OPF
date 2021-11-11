//------------------------------------------------------------------------------
// (#)PrivateConfig.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// version 1.00
// 2003/09/26 新規作成 Y.Mitsui
//
// version 1.01
// 2003/10/23 K.Shiraki
//            カーソルクローズ漏れ修正
//            SQLを実際に発行する箇所を1箇所に集中
//            数値型複数取得時の Integer型への変換漏れ修正
//            数値型複数取得時 正常0件のとき失敗(null)を返却するバグ修正
//            複数取得時 1番目の設定値が取得不可でも正常で返却するバグ修正
//------------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.common01.Accessor;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * SYS_PARAMETERの設定値取得クラス <br>
 * <br>
 * 単独の値取得は NAME の値を指定する。 <br>
 * <br>
 * 複数の値の設定/取得は 以下のとおり。 <br>
 * NAMEに以下のように登録済 <br>
 * &nbsp;&nbsp; key + "_COUNT"  (設定値の数) <br>
 * &nbsp;&nbsp; key + "_" + n   (各設定値。nは1オリジン) <br>
 * key_n が1つでも不足している場合 取得失敗とみなす<br>
 * key_n が key_COUNT の数より多く設定されている場合 無視し COUNTの数分返却<br>
 * 取得の際は key部分を引数として渡す。
 *
 * @version 1.01
 */

public class PrivateConfig
{
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
	 * @param 取得キー
	 * @return 設定値(取得に失敗した場合null)
	 */
	public String getString(String name) throws SQLException
	{
		String stringValue = null;
		ResultSet result = null;
		PreparedStatement stmt = null;

		//コネクション、引数が無い場合は処理しない
		if(name == null || _conn == null) return null;

		try{
			//設定値検索SQL取得
			stmt = makeSQL(name);

			//検索
			result = stmt.executeQuery();
			
			if(result.next()){
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
	 * @param 取得キー
	 * @return 設定値(取得に失敗/数値変換失敗した場合null)
	 */
	public Integer getNumber(String name) throws SQLException
	{
		String s = null;
		Integer integerValue = null;
		try{
			if((s = getString(name)) == null) return null;
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
	 * @param 取得キーのキーワード
	 * @return 設定値(String)のリスト(取得に失敗した場合null)
	 */
	public ArrayList getStrings(String key) throws SQLException
	{
		ArrayList list = null;

		//コネクション、引数が無い場合は処理しない
		if(key == null || _conn == null) return null;

		list = getStringList(key);

		return list;

	}

	/**
	 * 設定値取得(整数型・複数設定値)
	 * @param 取得キーのキーワード
	 * @return 設定値(Integer)のリスト(取得に失敗/数値変換失敗した場合null)
	 */
	public ArrayList getNumbers(String key) throws SQLException
	{
		ArrayList list = null;
		ArrayList intList = null;
		boolean bRet = false;

		//コネクション、引数が無い場合は処理しない
		if(key == null || _conn == null) return null;

		list = getStringList(key);
		if(list == null)  return null;
		try{
			intList = new ArrayList(0);
			for(int n = 0; n < list.size(); n++){
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
 	 * @param 取得キーのキーワード
	 * @return 設定値(Integer)のリスト(取得に失敗した場合null)
	 */
	private ArrayList getStringList(String key)  throws SQLException
	{
		ResultSet result = null;
		ArrayList list = null;
		String keyName = null;
		String counts = null;
		String each = null;

		try{
			// 設定数を取得
			keyName = makeCountName(key);
			if((counts = getString(keyName)) != null){
				list = new ArrayList(0);
				int loopCnt = Integer.parseInt(counts);
				// 各設定値を取得
				for(int cnt = 0 ;cnt < loopCnt; cnt++){
					//設定値検索SQL取得(1～連番)
					keyName = makeSeqName(key, (cnt + 1));
					if((each = getString(keyName)) != null){
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
	 * @param 取得キー
	 * @return SQL
	 */
	private PreparedStatement makeSQL(String name) throws SQLException
	{
		PreparedStatement stmt = null;

		stmt = (_conn.getConn()).prepareStatement(_sqlSysParameterl);
		stmt.setString(1, name);

		return stmt;
	}

	/**
	 * カウント値取得名称生成
	 * @param 取得キー
	 * @return 生成レコード定義名称
	 */
	private String makeCountName(String key)
	{
		return key + _ADD_NAME;
	}

	/**
	 * 設定値取得名称生成
	 * @param 取得キー
	 * @return 生成レコード定義名称
	 */
	private String makeSeqName(String key, int keyNo)
	{
		return key + "_" + keyNo;
	}
	/**
	 * プリペアドステートメントを閉じる
	 * @param statement 閉じる対象のステートメント
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
	 * @param resultset 閉じる対象のリザルトセット
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

	/** DBとのコネクション */
	private IDbConnection _conn = null;

	/** 設定値作成用付加名称 */
	private final String _ADD_NAME = "_COUNT";

	/** 設定値取得SQL */
	private final String _sqlSysParameterl =
		  "select SYS_PARAMETER.\"VALUE\" as \"VALUE\" "
		+ "from SYS_PARAMETER "
		+ "where SYS_PARAMETER.\"NAME\" = ? "
		+ "order by SYS_PARAMETER.\"NAME\"";

}
