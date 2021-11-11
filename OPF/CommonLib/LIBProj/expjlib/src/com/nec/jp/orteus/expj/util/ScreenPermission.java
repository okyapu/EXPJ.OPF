/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ScreenPermission.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 画面使用を許可するかの判断クラス
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:13 $
*/
public class ScreenPermission {
	
	/**
	 * コンストラクタ
	 */
	public ScreenPermission() {}

	/**
	 * 画面の使用を許可するかどうか問い合わせします。
	 * @param conn DBアクセス用のコネクション
	 * @param userCode Orteusユーザ名
	 * @param businessName 業務名
	 * @return	true : 画面使用を許可する false : 画面使用を許可しない 
	 * @throws SQLException オラクルエラーの場合
	 */
	public static boolean isUseful(IDbConnection conn, String userCode, String businessName)
			throws SQLException {

		PreparedStatement isUsefulStmt = null;			// ステートメント
		ResultSet isUsefulRslt = null;					// リザルトセット
		String ProgramName = businessName + "Servlet";	// 処理ID

	/** 画面利用権限定義テーブル--検索用のSQL */
		String _isUsefulSql =
			"SELECT B.USER_CD " +
			"FROM   (SELECT U.USER_CD, U.BUSINESS_GROUP_CD FROM BELONG_MST U WHERE U.USER_CD = ? ) B " +
			"     , (SELECT R.BUSINESS_GROUP_CD, R.BUSINESS_CD FROM GROUP_RECV_BUSINESS_MST R " +
			"        UNION " +
			"        SELECT P.BUSINESS_GROUP_CD, P.BUSINESS_CD FROM GROUP_PARM_BUSINESS_MST P ) G " +
			"     , CONDUCT_MST C " +
			"     , (SELECT BUSINESS_CD, CONDUCT_CD, SCREEN_URL FROM SCREEN_MST WHERE SCREEN_URL = ? " +
			"        UNION " +
			"        SELECT S.BUSINESS_CD, S.CONDUCT_CD, S.SCREEN_URL FROM SCREEN_MST S, SYS_PERMITTED_SCREEN D " +
			"        WHERE (S.SCREEN_URL = D.SCREEN_URL) AND (D.PROGRAM_CD = ?) ) T " +
			"WHERE  B.BUSINESS_GROUP_CD = G.BUSINESS_GROUP_CD " +
			"  AND  G.BUSINESS_CD       = C.BUSINESS_CD " +
			"  AND  C.BUSINESS_CD       = T.BUSINESS_CD " +
			"  AND  C.CONDUCT_CD        = T.CONDUCT_CD " + 
			"UNION " +
			"SELECT 'DUMMY' " + 
			"FROM SYS_PERMITTED_SCREEN D " + 
			"WHERE D.PROGRAM_CD = ? " + 
			"  AND D.SCREEN_URL = '*' "
			;

		try {
			isUsefulStmt = (conn.getConn()).prepareStatement(_isUsefulSql);
			isUsefulStmt.setString(1, userCode);
			isUsefulStmt.setString(2, ProgramName);
			isUsefulStmt.setString(3, businessName);
			isUsefulStmt.setString(4, businessName);
			isUsefulRslt = isUsefulStmt.executeQuery();
			if (isUsefulRslt.next() == true) {
				return true;
			} else {
				return false;
			}
		} finally {
			closePreparedStatement(isUsefulStmt);
			closeResultSet(isUsefulRslt);
		}
	}

	/**
	 * プリペアドステートメントを閉じます。
	 *
	 * @param statement 閉じる対象のステートメント
	 */
	private static void closePreparedStatement(PreparedStatement statement){
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
			}
		}
	}

	/**
	 * リザルトセットを閉じます。
	 *
	 * @param resultset 閉じる対象のリザルトセット
	 */
	private static void closeResultSet(ResultSet resultset){
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
			}
		}
	}
}
