//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050DBData クラス
 * ファイル・クラス説明
 * @author $Author: suganuma $
 * @version $Revision: 1.3 $ $Date: 2010/04/12 00:18:40 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0050;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 汎用検索用メソッドを提供します。
 * 引数にしてされたＳＱＬ情報を分析してＤＢ検索を実行し、
 * 実行結果を結果格納用配列に格納します。
 * 結果格納用配列にアクセスするメソッドを提供します。
 *
 * @author  Y.Hashimoto
 * @version 1.00
 */
public class AZ0050DBData
{
	private IDbConnection _conn = null;	    /** DBコネクションオブジェクト */
	private ResultSet _rs = null;  			/** ResultSet */
	private ResultSetMetaData _rsmd = null; /** ResultSet METAデータ */
	private PreparedStatement _stmt = null; /** PrepareStatement */
	private ResultSetMetaData _prmd = null; /** PrepareStatement META */

	private String _SqlStr = null;          /** SQL文 */

	private ArrayList _colNames;    /** 結果セットのカラム名 */
	private ArrayList _colTypes;    /** 結果セットのSQL型 */
	private ArrayList _colComments;    /** 結果セットのカラムコメント */
	private ArrayList _data;       /** 結果セットのデータ配列 */

	/**
	 * コンストラクタ。
	 * @param  connection DBコネクションオブジェクト
	 * @param  SqlStr     実行するSQL文
	 * @throws SQLException DBアクセスに失敗
	 */
	public AZ0050DBData(IDbConnection connection,
                        String SqlStr )
                        throws SQLException
	{
		_conn    = connection;
        _SqlStr  = SqlStr;
	}


    public boolean load() throws SQLException
	{
		
		this.clear();
		if(_conn == null) return false;
		
		try {
			// SQL文生成
			_stmt = (_conn.getConn()).prepareStatement(_SqlStr);
			// SQL文の実行
			_rs = _stmt.executeQuery();
			
			// カラム名・SQLの型の取得／設定
			_rsmd = _rs.getMetaData();
            // カラム数の取得
			int cCnt = _rsmd.getColumnCount();

			for(int i=0; i<cCnt; i++){
				this._colTypes.add(new Integer(_rsmd.getColumnType(i+1)));
			}

			// データ取得－＞退避(String型)
			while(_rs.next()){
				String[] strScmData = new String[cCnt];
				for(int i=0; i<cCnt; i++){
                    if (_rs.getObject(i+1) == null) {
					    strScmData[i] = "";

                    } else {
					    strScmData[i] = _rs.getObject(i+1).toString();
                    }
				}
				_data.add(strScmData);
			}
		}finally{
		}
		return true;
	}

	/**
	 * DBのカラム名の取得<br>
	 * 
	 * @return カラム名(String)のリスト
	 */
	public ArrayList getColNames() throws SQLException
	{
		// DBメタ情報が取得済みでない場合 空のリストを返却
		if(_rsmd == null) { 
			return this._colNames;
		}	
		// すでにこの情報を取得済みだったら 生成済みリストを返却
		if (this._colNames.size() > 0) {
			return this._colNames;
		}

		for(int i=0; i<_rsmd.getColumnCount(); i++){
			this._colNames.add(_rsmd.getColumnName(i+1));
		}
		return this._colNames;
		
	}
	
	/**
	 * 各項目の型の取得<br>
	 * 
	 * @return 各項目の型(String)のリスト
	 */
	public ArrayList getColTypes() throws SQLException
	{
		// DBメタ情報が取得済みでない場合 空のリストを返却
		if(_rsmd == null) { 
			return this._colTypes;
		}	
		// すでにこの情報を取得済みだったら 生成済みリストを返却
		if (this._colTypes.size() > 0) {
			return this._colTypes;
		}
		for(int i=0; i<_rsmd.getColumnCount(); i++){
			this._colTypes.add(new Integer(_rsmd.getColumnType(i+1)));
		}
		return this._colTypes;
		
	}
	
	/**
	 * 検索結果の取得<br>
	 * 
	 * @return 検索結果(ResultSet)をString型変換した２次元リスト
     *         (List*List)
	 */
	public ArrayList getData()
	{
		return this._data;
		
	}
	
	/**
	 * 検索結果の取得<br>
	 * 
	 * @return 検索結果のN番目のレコードをListで返却
	 */
	public String[] getDetail(int cIdx)
	{
		return (String[])this._data.get(cIdx);
		
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
		_colNames = new ArrayList();
		_colTypes = new ArrayList();
		_colComments = new ArrayList();
		_data = new ArrayList();
		_rs = null;
		_rsmd = null;
		_stmt = null;

	}

	protected void finalize() {
		this.closeResultSet(_rs);
		this.closePreparedStatement(_stmt);
	}

}
