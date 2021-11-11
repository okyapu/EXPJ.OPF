//------------------------------------------------------------------------------
/**
 * CLASS     : AC0060OdRelease クラス
 * ファイル・クラス説明
 * @author $Author: izukura $
 * @version $Revision: 1.2 $ $Date: 2007/04/06 07:44:26 $
 *
 */
//-----------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.AC0060;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 所要量 同一外部計画のオーダ発効済かどうかを確認
 * 本クラスでは必ず終了処理を明示的に実行する必要がある。
 */

public class AC0060OdRelease
{
	AC0060OdRelease(){}

	/**
	 * 初期化処理
	 * @param conn DBとのコネクション
	 */
	public void initialize(Connection conn) throws SQLException
	{
		String sql
			= "select T_OD.\"OD_NO\" "
			+ "from T_OD,T_EXTERNAL_PLAN "
			+ "where "
			+ "T_OD.\"OD_NO\" = T_EXTERNAL_PLAN.\"OD_NO\" "
			+ "and T_OD.\"ODR_RELEASE_FLG\" != " + AC0060Const.C_RELEASE_YET + " "
			+ "and T_EXTERNAL_PLAN.\"EXTERNAL_PLAN_CD\" = ? ";
		_pstmt = conn.prepareStatement(sql);
	}
	/**
	 * 該当外部計画番号のオーダのうち 1つでもオーダ発効済みがあるかどうか
	 * 存在しない外部計画番号や 外部計画番号に設定されているオーダ番号が存在しない場合
	 * オーダ未発効とみなす。
	 * @param extNo 外部計画番号
	 * @return true:オーダ発効済みのオーダが1件以上ある / false:オーダ発効済みのオーダがない
	 */
	public boolean isReleased(String odNo) throws SQLException
	{
		boolean result = false;
		_pstmt.setString(1,odNo);
		ResultSet rset = _pstmt.executeQuery();
		if(rset.next())  result = true;
		closeResultSet(rset);
		return result;
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
	/**
	 * 終了処理
	 * @param statement 閉じる対象のステートメント
	 */
	public void finalize()
	{
		if(_pstmt == null)  return;
		try{
			_pstmt.close();
			_pstmt = null;
		}
		catch (SQLException e){}
	}
	//--------------------------------------------------------------------------
	// 属性
	private PreparedStatement _pstmt = null;
}
