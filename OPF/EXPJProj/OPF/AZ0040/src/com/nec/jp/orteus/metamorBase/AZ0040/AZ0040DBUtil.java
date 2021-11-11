//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040DBUtil クラス
 * ファイル・クラス説明
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/09 06:49:40 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.systemlog.SystemLog;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * テーブルのコメント、カラムのコメントを取得する。<br>
 * テーブルのコメント、カラムのコメントの取得メソッドを実行する前には loadが成功している必要がある。
 * loadを行っていない または 成功していない場合の返却値は保障しない。
 */
public class AZ0040DBUtil 
{


	private HashMap _infoMap;
	private SystemLog _sysLog = null;
	private String _User_ID = null;

	//--------------------------------------------------------------------------
	// 構築

	/** コンストラクタ */
	public AZ0040DBUtil()	{
	}

	public AZ0040DBUtil(SystemLog sysLog, String User_ID) //
	{
		_sysLog = sysLog;
		_User_ID = User_ID;
		
		clear();
	}

	//--------------------------------------------------------------------------
	// 公開関数
	//--------------------------------------------------------------------------
	
	/**
	 * @param conn DBとのコネクション
	 * @param list テーブル名，カラム名が設定されたリスト
	 * @return テーブルコメント，カラムコメントを設定したリスト
	 */
	public boolean load(IDbConnection conn, List list) throws SQLException
	{
		//_sysLog.finest_d("AZ0040DBUtil：load", _User_ID);
		
		this.clear();
		if(conn == null) return false;

		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		ResultSet rset = null;
		String sql = null;
		String w_tableName = null;
		String w_tableComment = null;

		// テーブルコメントを取得するSQLを生成
		sql = makeGetTableCommentSQL();
		stmt = (conn.getConn()).prepareStatement(sql);
        //カラム名，コメント,カラム属性を取得するSQL 
        sql = makeGetColInfoSQL();
		stmt2 = (conn.getConn()).prepareStatement(sql);
		try {
			ArrayList temp_list1 = new ArrayList();
			ArrayList temp_list2 = new ArrayList();
			ArrayList temp_list3 = new ArrayList();
			check_point:
			for(int i=0; i< list.size(); i++)
			{
				//処理するテーブル名の取り出し
				w_tableName = list.get(i).toString().toUpperCase();
				//DBInfoを作成済みのテーブルかどうかをチェック
				//すでに作成済みだったら、再作成しない。
				if(_infoMap.containsKey(w_tableName)) continue check_point;

				List columnlist = new ArrayList();
				AZ0040DBInfo l_COMMENT = new AZ0040DBInfo();

				// テーブルコメントの取得
				stmt.setString(1, w_tableName);
				rset = stmt.executeQuery();
				
				w_tableComment = "";
				if(rset.next()) {
					w_tableComment = rset.getString(1);
				}
				if(w_tableComment == null) {	//テーブルコメント未設定の場合、テーブル名を設定
					w_tableComment = w_tableName;
				}
				
				// カラム名, カラム属性,コメントを取得
                stmt2.setString(1, w_tableName); 
				rset = stmt2.executeQuery();
				// 取得した情報をリストに設定
				while(rset.next())
				{
					temp_list1.add(rset.getString(1));	//カラム名
					temp_list2.add(rset.getString(2));	//カラム属性
					if (rset.getString(3) == null) {//カラムコメント
						temp_list3.add(rset.getString(1));	//カラムコメント未設定の場合、カラム名
					} else {
						temp_list3.add(rset.getString(3));	//カラムコメント
					}
				}
				
				// 取得した情報をDBInfoクラスに設定する
				l_COMMENT.setTablename(w_tableName);		//テーブル名
				l_COMMENT.setTableComment(w_tableComment);	//テーブルコメント
				l_COMMENT.setColumnNames(temp_list1);		//カラム名
				l_COMMENT.setColumnTypes(temp_list2);		//カラム属性
				l_COMMENT.setColumnComments(temp_list3);	//カラムコメント

				// リストに追加
				_infoMap.put(w_tableName,l_COMMENT);
				temp_list1.clear();
				temp_list2.clear();
				temp_list3.clear();
			}
			return true;
		}finally{
			this.closeResultSet(rset);
			this.closePreparedStatement(stmt);
			this.closePreparedStatement(stmt2);
		}
	}
	

	/**
	 * AZ0040DBInfoクラスの取得<br>
	 * <br>
	 * @param tablename テーブル名
	 * @return AZ0040DBInfoクラス 該当するテーブルが見つからない場合 null
	 */
	public AZ0040DBInfo getDBInfo(String tableName)
	{
		if(tableName == null)  return null;

		return (AZ0040DBInfo)_infoMap.get(tableName);

	}

	/**
	 * @param conn DBとのコネクション
	 * @param list テーブル名が設定されたリスト
	 * @return テーブルコメントを設定したリスト
	 * 
	 */
	// AZ0040DBUtil()コンストラクタ呼び出しを前提とする。
	// (テーブル選択画面のテーブル一覧用)
	public ArrayList getTableComments(IDbConnection conn, List i_tlist) throws SQLException
	{
		ArrayList wl_comments = null;

		//引数チェック
		if(conn == null) return wl_comments;
		if (i_tlist.size() == 0 ) return wl_comments;
		
		wl_comments = new ArrayList(i_tlist.size());		//テーブルコメント格納用リスト
		PreparedStatement stmt = null;
		String sql = null;

		// テーブルコメントを取得するSQLを生成
		sql = makeGetTableCommentSQL();
		stmt = (conn.getConn()).prepareStatement(sql);
		ResultSet rset = null;

		try {
			for(Iterator itr=i_tlist.iterator(); itr.hasNext();) {
				String w_tablename = itr.next().toString();
				stmt.setString(1,w_tablename);
				// テーブルコメントの取得
				rset = stmt.executeQuery();
				if(rset.next())	{
					if (rset.getString(1) == null) {
						wl_comments.add(w_tablename);	//テーブルコメント未設定の場合
					} else {
						wl_comments.add(rset.getString(1));
					}
				}
			}
			rset.close();
			stmt.close();
			return wl_comments;
		} finally {
		}
	}
	
	/**
	 * テーブルコメントの取得<br>
	 * <br>
	 * @param tableName テーブル名
	 * @return テーブルコメント 該当するテーブルコメントが見つからない場合 null
	 */ 
	public String getTableComment(String tableName)
	{
		if(tableName == null)  return null;
		AZ0040DBInfo info = this.getDBInfo(tableName);	//該当するDBInfoを取り出す
		if(info == null) return null;

		return info.getTableComment();
	}
	
	/**
	 * カラムコメントの取得<br>
	 * <br>
	 * @param tableName テーブル名
	 * @param columnName カラム名
	 * @return カラムコメント 該当するカラムコメントが見つからない場合 null
	 */
	public String getColumnComment(String tableName, String columnName)
	{
		if(tableName == null || tableName == null)  return null;
		AZ0040DBInfo info = this.getDBInfo(tableName);
		if(info == null) return null;

		return info.getColumnComment(columnName);
	}

	/**
	 * カラム属性の取得<br>
	 * <br>
	 * @param tableName テーブル名
	 * @param columnName カラム名
	 * @return カラム属性 該当するカラム属性が見つからない場合 null
	 */
	public String getColumnType(String tableName, String columnName)
	{
		if(tableName == null || tableName == null)  return null;
		AZ0040DBInfo info = this.getDBInfo(tableName);
		if(info == null) return null;

		return info.getColumnType(columnName);
	}

	//-------------------------------------------------------------------
	//  パッケージ公開関数
	//-------------------------------------------------------------------



	//-------------------------------------------------------------------
	//  非公開関数
	//-------------------------------------------------------------------
	/**
	 * テーブル名のコメントを取得するSQL文を作成する
	 *
	 * @return テーブルコメント取得用SQL文
	 */
	private String makeGetTableCommentSQL()
	{
		String sql = "SELECT comments FROM user_tab_comments " +
				     "WHERE table_name = ?";

		return sql;
	}

	/**
	 * カラム名のコメント、属性を取得するSQL文を作成する
	 *
	 * @param tabNmae カラム情報を取得したいテーブル名
	 * @return データ取得用SQL文
	 */
	private String makeGetColInfoSQL()
	{
		String sql = 
		"SELECT tab.column_name,tab.data_type,com.comments " +
		"FROM user_tab_columns tab, user_col_comments com " + 
		"WHERE  tab.table_name = ? and " +
				"tab.table_name = com.table_name and " +
				"tab.column_name = com.column_name " +
		"ORDER BY tab.column_id";

		return sql;
	}
	
	/**
	 * プリペアドステートメントを閉じる
	 *
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
	 *
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
	
	/** クリア */
	private void clear()
	{ 
		_infoMap = new HashMap();

	}
}
