/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/DateCtrlControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 日付制御情報取得部品
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:37 $
 */
public class DateCtrlControl {

	/** [日付制御]データ取得用のSQL */
	private static final String selectDateCtrlSql =
		"select "
			+ "  SYS_DATE_CTRL.PLANT_CD as PLANT_CD, "
			+ "  to_char(SYS_DATE_CTRL.BUSINESS_OPR_DATE, 'YYYY/MM/DD') as BUSINESS_OPR_DATE, "
			+ "  to_char(SYS_DATE_CTRL.STOCK_CRITERION_DATE, 'YYYY/MM/DD') as STOCK_CRITERION_DATE "
			+ "from "
			+ "  SYS_DATE_CTRL "
			+ "where "
			+ "  SYS_DATE_CTRL.PLANT_CD = ? ";

	/**
	 * 日付制御情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private DateCtrlControl() {
	}

	/**
	 * 日付制御情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param plantCd 工場コード（必須）
	 * @return 日付制御情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static DateCtrlStruct getData(IDbConnection conn, String plantCd)
		throws SQLException, DataNotFoundException {

		// 工場コードが不正な場合
		if (plantCd == null || plantCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		DateCtrlStruct dcs = selectDateCtrl(conn, plantCd);

		return dcs;
	}

	/**
	 * [日付制御]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param plantCd 工場コード
	 * @return 日付制御情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static DateCtrlStruct selectDateCtrl(
		IDbConnection conn,
		String plantCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectDateCtrlSql);
			ps.setString(1, plantCd);
			// SQL実行
			rs = ps.executeQuery();

			// 検索結果が0件の場合はエラー
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02028");
			}

			// メソッドリターン用データクラス作成
			DateCtrlStruct dcs = new DateCtrlStruct();
			dcs.setPLANT_CD(rs.getString("PLANT_CD"));
			dcs.setBUSINESS_OPR_DATE(rs.getString("BUSINESS_OPR_DATE"));
			dcs.setSTOCK_CRITERION_DATE(rs.getString("STOCK_CRITERION_DATE"));

			return dcs;
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
