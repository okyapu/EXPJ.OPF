/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common08.LotCtrl;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * システム導入フラグ取得クラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.2 $ $Date: 2008/03/26 07:28:41 $
 */
public class LotCtrl {
    /** DBアクセス用のコネクション */
    private  IDbConnection conn = null;

    /** データ取得用のSQL */
    private static final String selectLotCtrlSql
            = "SELECT "
              + "  SYS_INSTALL_OPTIONS.INSTALL_FLG as \"INSTALL_FLG\" "
              + "FROM "
              + "  SYS_INSTALL_OPTIONS "
              + "WHERE "
              + "  SYS_INSTALL_OPTIONS.\"OPTION_ID\" = 'LT*' "
              + "AND SYS_INSTALL_OPTIONS.\"INSTALL_FLG\" = 1 ";

    /**
     * コンストラクタ
     * @param connect コネクションがOPENされているIDbConnection
     */
    public LotCtrl(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * 対象データが存在かどうか判断する
     * @param conn コネクションがOPENされているIDbConnection
     * @return  対象データが存在の場合true、存在しないの場合false　
     * @throws SQLException DBアクセスエラー
     */
    public static boolean checkLotCtrl(IDbConnection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //フラグ設定
            boolean flag = false;
            // SQL作成
            ps = conn.getConn().prepareStatement(selectLotCtrlSql);
            // SQL実行
            rs = ps.executeQuery();

            // 結果を設定
            if (rs.next()) {
                // データがある
                flag = true;
            }

            return flag;
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