//------------------------------------------------------------------------------
// (#)ComboDataAccessController.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/17 2003/05/22 新規作成 Y.Inada
// 2003/06/24 OrteusStudioバージョンアップに伴う修正 Y.Inada
//            前：doConnection[ver1.00.03]
//            後：IDbConnection[ver1.00.05]
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (C) 2003 NEC INFORMATEC SYSTEMS, LTD.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
// 2003/06/27 データ取得用のSQLの修正
//            前：DISPLAY_VALUE
//            後：DISPLAY_NAME
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Combo;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboStruct;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboException;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * コンボボックスデータを取得する為のユーティリティクラス。<BR>
 * データを取得(getData)する前にコネクションの設定をしておかなければならない。
 *
 * @author  Y.Inada
 * @version 1.00
 */
public class ComboDataAccessController
{
	/** DBアクセス用のコネクション */
	private IDbConnection _conn = null;

	/** データ取得用のSQL */
	private String _selectSql = 
		"select SYS_TYPE_VALUE.\"VALUE\",SYS_TYPE_VALUE.\"DISPLAY_NAME\""
		+"from SYS_TYPE_VALUE "
		+"where "
		+"  SYS_TYPE_VALUE.\"NAME\" = ?"
		+"order by SYS_TYPE_VALUE.VALUE";

	/**
	 * オブジェクトを構築する。
	 */
	public ComboDataAccessController(){}

	/**
	 * 指定のコネクションを持つオブジェクトを構築する。
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public ComboDataAccessController(IDbConnection connect){_conn = connect;}


	/**
	 * コネクション設定。<BR>
	 * コネクションの参照を無効にする場合、引数にnullを設定すること。
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public void setConnection(IDbConnection connect){_conn = connect;}


	/**
	 * 指定されたキーのコンボボックスデータを取得する。
	 *
	 * @param  key 取得キー
	 * @return 取得したコンボボックスデータ。
	 *         データは昇順に格納されている。
	 * @throws SQLException
     *         SQLの発行に失敗した場合
	 * @throws ComboException
     *         検索した結果が0件の場合
	 */
	public ComboStruct getData(String key) throws SQLException, ComboException
	{
		ComboStruct rCombo = new ComboStruct();		// コンボボックスデータ
		PreparedStatement stmt = null;				// ステートメント
		ResultSet rset = null;						// リザルトセット

		try{
			// SQL作成
			stmt = (_conn.getConn()).prepareStatement(_selectSql);
			stmt.setString(1, key);
		
			// SQL実行
			rset = stmt.executeQuery();
		
			// 結果を設定
			while(rset.next()){
				String val = new String(rset.getString(1));
				String explan = new String(rset.getString(2));
				rCombo.addData(val, explan);
			}
			
			// 取得データが0以下の場合、例外発生
			if(rCombo.size() <= 0){ throw new ComboException(); }

			return rCombo;
		
		}finally{
			if(rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}
}

