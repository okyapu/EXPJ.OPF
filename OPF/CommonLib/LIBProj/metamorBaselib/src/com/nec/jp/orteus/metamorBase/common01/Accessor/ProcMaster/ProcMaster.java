//------------------------------------------------------------------------------
// (#)ProcMaster.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/10/24 新規作成  K.Shiraki
// 2003/11/05 M.Isoda
//            取得する業務名が重複しないようにSQLを変更
// 2003/11/06 M.Isoda
//            デバッグ用のコードを削除
//            javadocに正しく説明が表示されるように各メソッドのコメントを修正
//            loadメソッドにクローズ処理を追加
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Accessor.ProcMaster;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProcMaster.ProcInformation;

/**
 * 処理IDと処理名の取得を行う。<br>
 * 処理IDや処理名の取得メソッドを実行する前には loadが成功している必要がある。
 * loadを行っていない または 成功していない場合の返却値は保障しない。
 */
public class ProcMaster
{
	//--------------------------------------------------------------------------
	// 構築

	/** コンストラクタ */
	public ProcMaster(){ clear(); }

	//--------------------------------------------------------------------------
	// 操作

	/**
	 * 処理ID情報の取込<br>
	 * SCREEN_MSTとBUSINESS_MSTから 処理IDと業務名を読み込む<br>
	 * 取込時は以下のルールで行う。<br>
	 * &nbsp;&nbsp;SCREEN_MSTに存在し BUSINESS_MSTに存在しないデータ: 取り込む<br>
	 * &nbsp;&nbsp;SCREEN_MSTに存在せず BUSINESS_MSTに存在するデータ: 取り込まない<br>
	 * <br>
	 * @param conn DBとのコネクション
	 * @return true:成功 / false:失敗
	 */
	public boolean load(IDbConnection conn) throws SQLException
	{
		clear();
		if(conn == null) return false;

		PreparedStatement stmt = null;
		ResultSet rset = null;
		String sql =
			"select " +
			"screen_mst.screen_url, " +
			"business_mst.business_name " +
			"from " +
			"screen_mst, business_mst " +
			"where " +
			" business_mst.business_cd = screen_mst.business_cd and " +
			" business_mst.business_cd in ( " +
			" select "+
			"  min(business_mst.BUSINESS_CD) " +
			" from "+
			"  business_mst " +
			" group by "+
			"  business_mst.BUSINESS_NAME) "+
			"order by screen_mst.screen_url";

		try {
			String procid;
			stmt = (conn.getConn()).prepareStatement(sql);
			rset = stmt.executeQuery();

			while(rset.next()){
				ProcInformation info = new ProcInformation();

				// 処理IDに変換できない情報は無視
				if((procid = url2proc(rset.getString(1))) == null)  continue;

				info.setId(procid);
				info.setName(rset.getString(2));
				_procs.add(info);
			}
		}finally{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return true;
	}

	/**
	 * 処理名の取得<br>
	 * <br>
	 * @param id 処理ID
	 * @return 処理名 該当する処理IDが見つからない場合 null
	 */
	public String getName(String id)
	{
		if(id == null)  return null;
		for(int n = 0; n < _procs.size(); n++){
			ProcInformation info = (ProcInformation)(_procs.get(n));
			if(id.equals(info.getId())) {
				return info.getName();
			}
		}

		return null;
	}
	/**
	 * 処理ID一覧の取得<br>
	 * 本メソッドで取得した処理IDの順と 処理名一覧の取得で取得した一覧の順序を保障する。<br>
	 * <br>
	 * @return 処理ID(String)のリスト
	 */
	public ArrayList getIds()
	{
		ArrayList ids = new ArrayList(0);
		for(int n = 0; n < _procs.size(); n++){
			ProcInformation info = (ProcInformation)(_procs.get(n));
			ids.add(info.getId());
		}
		return ids;
	}
	/**
	 * 処理名一覧の取得<br>
	 * 本メソッドで取得した処理名の順と 処理ID一覧の取得で取得した一覧の順序を保障する。<br>
	 * <br>
	 * @return 処理名(String)のリスト
	 */
	public ArrayList getNames()
	{
		ArrayList names = new ArrayList(0);
		for(int n = 0; n < _procs.size(); n++){
			ProcInformation info = (ProcInformation)(_procs.get(n));
			names.add(info.getName());
		}
		return names;
	}
	/** クリア */
	public void clear(){ _procs = new ArrayList(0); }
	/**
	 * url→処理ID変換
	 *
	 * @param url URL  <処理ID>Servletの形式であること
	 * @return 処理ID 処理IDが不正な形式のとき null
	 */
	private String url2proc(String url)
	{
		if(url == null) return null;
		int index;
		if((index = url.indexOf("Servlet")) < 0) return null;
		return url.substring(0, index);
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

	//--------------------------------------------------------------------------
	// 属性

	/** ProcInformation情報の集合 */
	private ArrayList _procs;
}
