/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/MyCompanyControl.java,v $
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
 * 自社情報取得部品
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class MyCompanyControl {

	/** デフォルトで使用するSYSTEMコントロールコード */
	private static final String DEFAULT_CTRL_CD = "SYSTEM";
	/** [自社]データ取得用SQL */
	private static final String selectMyCompanySql =
		"select "
			+ "  SYS_MY_COMPANY.CTRL_CD as CTRL_CD, "
			+ "  SYS_MY_COMPANY.COMPANY_CD as COMPANY_CD, "
			+ "  SYS_MY_COMPANY.START_DAY as START_DAY "
			+ "from "
			+ "  SYS_MY_COMPANY "
			+ "where "
			+ "  SYS_MY_COMPANY.CTRL_CD = ? ";

	/**
	 * 自社情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private MyCompanyControl() {
	}

	/**
	 * 自社情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @return 自社情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static MyCompanyStruct getData(IDbConnection conn)
		throws SQLException, DataNotFoundException {

		MyCompanyStruct mcs = getData(conn, DEFAULT_CTRL_CD);

		return mcs;
	}

	/**
	 * 自社情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param ctrlCd SYSコントロールコード（必須）
	 * @return 自社情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static MyCompanyStruct getData(IDbConnection conn, String ctrlCd)
		throws SQLException, DataNotFoundException {

		// SYSコントロールコードが不正な場合
		if (ctrlCd == null || ctrlCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		MyCompanyStruct mcs = selectMyCompany(conn, ctrlCd);

		return mcs;
	}

	/**
	 * [自社]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param ctrlCd SYSコントロールコード（必須）
	 * @return 自社情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static MyCompanyStruct selectMyCompany(
		IDbConnection conn,
		String ctrlCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectMyCompanySql);
			ps.setString(1, ctrlCd);
			// SQL実行
			rs = ps.executeQuery();

			// 検索結果が0件の場合はエラー
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02027");
			}

			// メソッドリターン用データクラス作成
			MyCompanyStruct mcs = new MyCompanyStruct();
			mcs.setCTRL_CD(rs.getString("CTRL_CD"));
			mcs.setCOMPANY_CD(rs.getString("COMPANY_CD"));
			mcs.setSTART_DAY(rs.getString("START_DAY"));

			return mcs;
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
