/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.util;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
/**
 * パスワード入力チェッククラス
 * @author $Author: li-lu $
 * @version $Revision: 1.3 $ $Date: 2014/12/29 07:42:39 $
 */
public class UserPassWordInputRule {
    /** DBアクセス用のコネクション */
    private IDbConnection conn = null;

    /** データ取得用のSQL */
    private static final String selectLengthSql
            = "select "
              + "  SYS_PARAMETER.VALUE as \"VALUE\" "
              + "from "
              + "  SYS_PARAMETER "
              + "where "
              + "  SYS_PARAMETER.\"NAME\" = ? ";

    /**
     * コンストラクタ
     * @param connect コネクションがOPENされているIDbConnection
     */
    public UserPassWordInputRule(IDbConnection connect) {
        this.conn = connect;
    }

	/**
     * パスワード最小桁数のチェック
	 * @param password パスワード
	 * @return 1: パスワード最小桁数
	 * @return 2: チェック結果
	 * @throws SQLException DBアクセスエラー
	 */
	public static Map compareMinLength(IDbConnection conn, String password) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		HashMap minLen = new HashMap();
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectLengthSql);
			ps.setString(1, "PSW_MIN_LENGTH");
			// SQL実行
			rs = ps.executeQuery();

			String minLength = null;

			// 結果を設定
			if (rs.next()) {
				// データを取得
				minLength = rs.getString("VALUE");
				if (Calculate.compare(String.valueOf(password.length()), minLength) < 0){
					minLen.put("1", minLength);
					minLen.put("2", "false");
					return minLen;
				}
			}
			return minLen;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}
	
	/**
     * パスワードルールのチェック
	 * @param password パスワード
	 * @return ルールを違反の場合　false
	 * @throws SQLException DBアクセスエラー
	 */
	public static boolean checkWordRule(IDbConnection conn, String password) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成 
			ps = conn.getConn().prepareStatement(selectLengthSql);
			ps.setString(1, "PSW_RULE");
			// SQL実行
			rs = ps.executeQuery();
 
			String wordRule = null; 
			String regex1 = "[0-9]+";
			String regex2 = "[a-zA-Z]+";
			String regex3 = "[\\p{Punct}]+";
			String regex = "(([0-9]+[a-zA-Z]+[0-9a-zA-Z]*)|([a-zA-Z]+[0-9]+[0-9a-zA-Z]*))";
			Pattern p;
			// 結果を設定
			if (rs.next()) {
				// データを取得
				wordRule = rs.getString("VALUE");			
				if (wordRule.equals("1") && password.length() > 1){

					//数値ルールのチェック
					p = Pattern.compile(regex1);
					Matcher m = p.matcher(password);
					if (!m.find()){
						return false;
					}				
					//文字ルールのチェック
					p = Pattern.compile(regex2);
					m = p.matcher(password);
					if (!m.find()){
						return false;
					}
				
					if (!Pattern.matches(regex, password)){
						//記号ルールのチェック
						p = Pattern.compile(regex3);
					    m = p.matcher(password);
					    if (!m.find()){
						    return false;
					    }
				    }
			  }
	      }
		return true;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}
}