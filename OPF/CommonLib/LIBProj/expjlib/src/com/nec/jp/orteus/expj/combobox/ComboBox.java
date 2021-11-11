/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/combobox/ComboBox.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.combobox;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import com.nec.jp.orteus.util.CoreTools;
import java.util.ResourceBundle;
import java.util.MissingResourceException;

/**
 * コンボボックスデータを取得する為のユーティリティクラス。<BR>
 * データを取得(getData)する前にコネクションの設定をしてください。
 *
 * @see ComboException
 * @see ComboStruct
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:51 $
 */
public class ComboBox {

	/**
	 * DBアクセス用のコネクション
	 */
	private IDbConnection _conn = null;

	/**
	 * データ取得用のSQL
	 */
	private String _selectSql =
		"select SYS_TYPE_VALUE.\"VALUE\",SYS_TYPE_VALUE.\"DISPLAY_NAME\""
		+"from SYS_TYPE_VALUE "
		+"where "
		+"  SYS_TYPE_VALUE.\"NAME\" = ?"
		+"order by SYS_TYPE_VALUE.VALUE";

	/**
	 * コンボ説明プロパティファイル
	 */
	private ResourceBundle _comboExplan = null;

	/**
	 * システムデフォルトロケール
	 */
	private String _strDefaultLocale = CoreTools.getLocale(null);

	/**
	 * ユーザロケール
	 */
	private String _strLocale = CoreTools.getLocale(null);

	/**
	 * オブジェクトを構築します。
	 */
	public ComboBox(){
	}

	/**
	 * 指定のコネクションを持つオブジェクトを構築します。
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public ComboBox(IDbConnection connect){
		_conn = connect;
	}

	/**
	 * 指定のコネクションを持つオブジェクトを構築します。<BR>
	 * ユーザCDでロケールを確定します。
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 * @param  userCd ユーザCD
	 */
	public ComboBox(IDbConnection connect, String userCd){
		_conn = connect;
		_strLocale = CoreTools.getLocale(userCd);
	}

	/**
	 * コネクション設定。<BR>
	 * コネクションの参照を無効にする場合、引数にnullを設定してください。
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public void setConnection(IDbConnection connect){
		_conn = connect;
	}

	/**
	 * ロケールセット<BR>
	 *
	 * @param locale 言語コード
	 */
	public void setLocale(String locale){
		_strLocale = locale;
	}

	/**
	 * 指定されたキーのコンボボックスデータを取得します。<BR>
	 *
	 * @param  key 取得キー
	 * @return 取得したコンボボックスデータ。データは昇順に格納されています。
	 * @throws SQLException SQLの発行に失敗した場合
	 * @throws ComboException 検索した結果が0件の場合
	 */
	public ComboStruct getData(String key)
			throws SQLException, ComboException
	{
		ComboStruct rCombo = new ComboStruct();	// コンボボックスデータ
		PreparedStatement stmt = null;			// ステートメント
		ResultSet rset = null;					// リザルトセット

		try{
			// SQL作成
			stmt = (_conn.getConn()).prepareStatement(_selectSql);
			stmt.setString(1, key);

			// SQL実行
			rset = stmt.executeQuery();

			// 結果を設定
			while (rset.next()){
				String val = new String(rset.getString(1));
				String explan = new String(rset.getString(2));

				// 多言語対応
				if (!_strDefaultLocale.equals(_strLocale)) {
					explan = getProperty(key, val, _strLocale);
				}

				rCombo.addData(val, explan);
			}

			// 取得データが0以下の場合、例外発生
			if (rCombo.size() <= 0){
				throw new ComboException();
			}

			return rCombo;

		}finally{
			if (rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if (stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * コンボ定義ファイル("ExpjCombo")から指定されたコンボデータの説明を取得します。<br>
	 * 該当する説明が見つからない場合は"No Explanation(key, val, local)"を返します。<br>
	 *
	 * @param key コンボデータ取得キー
	 * @param val コンボデータ値
	 * @param locale 言語コード
	 * @return 説明
	 */
	private String getProperty(String key, String val, String locale) {

		String explan = "No Name(" + key + ", " + val + ", " + locale + ")";

		try {
			if (_comboExplan == null) {
				_comboExplan = CoreTools.getResourceBundle("ExpjCombo", locale);
			}
		} catch (MissingResourceException e) {
			return explan;
		}

		try {
			explan = _comboExplan.getString(key + "." + val);
		} catch (MissingResourceException e) {
			return explan;
		}

		return explan;
	}
}

