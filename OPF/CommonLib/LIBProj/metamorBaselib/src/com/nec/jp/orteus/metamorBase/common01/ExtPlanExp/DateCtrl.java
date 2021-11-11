/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common01.ExtPlanExp;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 業務運用日取得クラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:24 $
 */
public class DateCtrl {
    /** DBアクセス用のコネクション */
    private IDbConnection conn = null;

    /** データ取得用のSQL */
    private static final String selectDateCtrlSql
            = "select "
              + "  SYS_DATE_CTRL.PLANT_CD as \"PLANT_CD\", "
              + "  to_char(SYS_DATE_CTRL.BUSINESS_OPR_DATE, 'YYYY/MM/DD') as BUSINESS_OPR_DATE, "
              + "  to_char(SYS_DATE_CTRL.STOCK_CRITERION_DATE, 'YYYY/MM/DD') as STOCK_CRITERION_DATE "
              + "from "
              + "  SYS_DATE_CTRL "
              + "where "
              + "  SYS_DATE_CTRL.\"PLANT_CD\" = ? ";

    /**
     * コンストラクタ
     * @param connect コネクションがOPENされているIDbConnection
     */
    public DateCtrl(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * 指定工場の業務運用日を取得
     * @deprecated hoge
     * @param plantCd 工場コード
     * @return 業務運用日文字列（YYYY/MM/DD形式）対象データが存在しない場合はnull
     * @throws SQLException DBアクセスエラー
     */
    public String getBusinessOprDate(String plantCd) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // SQL作成
            ps = this.conn.getConn().prepareStatement(selectDateCtrlSql);
            ps.setString(1, plantCd);
            // SQL実行
            rs = ps.executeQuery();

            String businessOprDate = null;

            // 結果を設定
            if (rs.next()) {
                // データを取得
                businessOprDate = rs.getString("BUSINESS_OPR_DATE");
            }

            return businessOprDate;
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
     * 指定工場の業務運用日を取得
	 * @param plantCd 工場コード
	 * @return 業務運用日文字列（YYYY/MM/DD形式）対象データが存在しない場合はnull
	 * @throws SQLException DBアクセスエラー
	 */
	public static String getBusinessOprDate(IDbConnection conn, String plantCd) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectDateCtrlSql);
			ps.setString(1, plantCd);
			// SQL実行
			rs = ps.executeQuery();

			String businessOprDate = null;

			// 結果を設定
			if (rs.next()) {
				// データを取得
				businessOprDate = rs.getString("BUSINESS_OPR_DATE");
			}

			return businessOprDate;
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