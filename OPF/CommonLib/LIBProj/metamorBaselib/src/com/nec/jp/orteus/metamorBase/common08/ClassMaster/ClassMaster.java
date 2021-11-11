/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common08.ClassMaster;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 分類名称取得と登録更新時のチェッククラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:40 $
 */
public class ClassMaster{
    /** DBアクセス用のコネクション */
    private static IDbConnection conn = null;
    /** データ取得用のSQL */  
   private static final String selectClassSql
            = "select"
            	+"  M_CLASS.\"CLASS_NAME\" AS \"CLASS_NAME\" "
            	+"from "
            	+"M_CLASS "
            	+"where "
            	+"M_CLASS.\"CLASS_CD1\" = ? "
                +"AND M_CLASS.\"CLASS_CD2\" = ? "
                +"AND M_CLASS.\"CLASS_CD3\" = ? ";
            	
    /**
     * コンストラクタ
     * @param connect コネクションがOPENされているIDbConnection
     */
    public ClassMaster(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * 指定されたキーのClassNameを取得する。
     * @param classcd1 大分類コード
     * @param classcd2　中分類コード
     * @param classcd3 小分類コード
     * @return className
     * @throws SQLException DBアクセスエラー
     */
    public static String getClassName(IDbConnection conn,String classcd1,String classcd2,String classcd3) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // SQL作成
            ps = conn.getConn().prepareStatement(selectClassSql);
            ps.setString(1,classcd1);
            ps.setString(2,classcd2);
            ps.setString(3,classcd3);
            // SQL実行
            rs = ps.executeQuery();

            String className = null;

            // 結果を設定
            if (rs.next()) {
                // データを取得
            	className = rs.getString("CLASS_NAME");
            }

            return className;
        } catch (SQLException ex) {
            throw ex;
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
	 * 登録と更新する時存在チェックを行う。
     * @param classcd1 大分類コード
     * @param classcd2　中分類コード
     * @param classcd3 小分類コード
	 * @return checkResult	 
	 * @throws SQLException DBアクセスエラー
	 */
	public static boolean  checkMclass(IDbConnection conn,String classcd1,String classcd2,String classcd3) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean checkResult;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectClassSql);
            ps.setString(1,classcd1);
            ps.setString(2,classcd2);
            ps.setString(3,classcd3);
			// SQL実行
			rs = ps.executeQuery();

			// 検索結果が0件の場合はエラー
			if (!rs.next()) {
                checkResult=false;
			}else{ 
				checkResult=true;
			}
			
             return checkResult;
		} catch (SQLException ex) {
            throw ex;
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