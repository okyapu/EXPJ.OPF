/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/TaxNameControl.java,v $
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
 * 税名情報取得部品
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class TaxNameControl {

	/** デフォルトで使用するSYSTEMコントロールコード */
	private static final String DEFAULT_CTRL_CD = "SYSTEM";
	/** [税名]データ取得用SQL */
	private static final String selectTaxNameSql =
		"select "
			+ "  SYS_TAX_NAME.CTRL_CD as CTRL_CD, "
			+ "  SYS_TAX_NAME.TAX_NAME_1 as TAX_NAME_1, "
			+ "  SYS_TAX_NAME.TAX_NAME_2 as TAX_NAME_2, "
			+ "  SYS_TAX_NAME.TAX_NAME_3 as TAX_NAME_3 "
			+ "from "
			+ "  SYS_TAX_NAME "
			+ "where "
			+ "  SYS_TAX_NAME.CTRL_CD = ? ";

	/**
	 * 税名情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private TaxNameControl() {
	}

	/**
	 * 税名情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @return 税名情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static TaxNameStruct getData(IDbConnection conn)
		throws SQLException, DataNotFoundException {

		TaxNameStruct tns = getData(conn, DEFAULT_CTRL_CD);

		return tns;
	}

	/**
	 * 税名情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param ctrlCd SYSコントロールコード（必須）
	 * @return 税名情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static TaxNameStruct getData(IDbConnection conn, String ctrlCd)
		throws SQLException, DataNotFoundException {

		// SYSコントロールコードが不正な場合
		if (ctrlCd == null || ctrlCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		TaxNameStruct tns = selectTaxName(conn, ctrlCd);

		return tns;
	}

	/**
	 * [税名]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @return 税名情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static TaxNameStruct selectTaxName(
		IDbConnection conn,
		String ctrlCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectTaxNameSql);
			ps.setString(1, ctrlCd);
			// SQL実行
			rs = ps.executeQuery();

			// 検索結果が0件の場合はエラー
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02029");
			}

			// メソッドリターン用データクラス作成
			TaxNameStruct tns = new TaxNameStruct();
			tns.setCTRL_CD(rs.getString("CTRL_CD"));
			tns.setTAX_NAME_1(rs.getString("TAX_NAME_1"));
			tns.setTAX_NAME_2(rs.getString("TAX_NAME_2"));
			tns.setTAX_NAME_3(rs.getString("TAX_NAME_3"));

			return tns;
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
