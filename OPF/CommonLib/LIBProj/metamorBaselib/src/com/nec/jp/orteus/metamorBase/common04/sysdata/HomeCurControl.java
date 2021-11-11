/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/HomeCurControl.java,v $
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
 * 邦貨情報取得部品
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class HomeCurControl {

	/** デフォルトで使用するSYSTEMコントロールコード */
	private static final String DEFAULT_CTRL_CD = "SYSTEM";

	/** [邦貨]データ取得用のSQL */
	private static final String selectHomeCurSql =
		"select "
			+ "  SYS_HOME_CUR.CTRL_CD as CTRL_CD, "
			+ "  SYS_HOME_CUR.HOME_CUR_CD as HOME_CUR_CD "
			+ "from "
			+ "  SYS_HOME_CUR "
			+ "where "
			+ "  SYS_HOME_CUR.CTRL_CD = ? ";
	/** [通貨]データ取得用のSQL */
	private static final String selectCurSql =
		"select "
			+ "  M_CUR.CUR_CD as CUR_CD, "
			+ "  M_CUR.CUR_NAME as CUR_NAME, "
			+ "  M_CUR.CUR_SYMBOL as CUR_SYMBOL, "
			+ "  M_CUR.CUR_UNIT as CUR_UNIT, "
			+ "  M_CUR.DECIMAL_FIG as DECIMAL_FIG "
			+ "from "
			+ "  M_CUR "
			+ "where"
			+ "  M_CUR.CUR_CD = ? ";

	/**
	 * 邦貨情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private HomeCurControl() {
	}

	/**
	 * 邦貨情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @return 通貨情報データクラス 
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static HomeCurStruct getData(IDbConnection conn)
		throws SQLException, DataNotFoundException {

		HomeCurStruct hcs = getData(conn, DEFAULT_CTRL_CD);

		return hcs;
	}

	/**
	 * 自社通貨情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param ctrlCd SYSコントロールコード（必須）
	 * @return 通貨情報データクラス 
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static HomeCurStruct getData(IDbConnection conn, String ctrlCd)
		throws SQLException, DataNotFoundException {

		// SYSコントロールコードが不正な場合
		if (ctrlCd == null || ctrlCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// [邦貨]を検索
		HomeCurStruct homeCurHcs = selectHomeCur(conn, ctrlCd);
		// [通貨]を[邦貨]."邦貨コード"で検索
		HomeCurStruct curHcs = selectCur(conn, homeCurHcs.getCUR_CD());

		// メソッドリターン用データクラスを作成
		HomeCurStruct hcs = new HomeCurStruct();
		hcs.setCTRL_CD(homeCurHcs.getCTRL_CD());
		hcs.setCUR_CD(homeCurHcs.getCUR_CD());
		hcs.setCUR_NAME(curHcs.getCUR_NAME());
		hcs.setCUR_SYMBOL(curHcs.getCUR_SYMBOL());
		hcs.setCUR_UNIT(curHcs.getCUR_UNIT());
		hcs.setDECIMAL_FIG(curHcs.getDECIMAL_FIG());

		return hcs;
	}

	/**
	 * [邦貨]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param ctrlCd SYSコントロールコード
	 * @return 邦貨情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static HomeCurStruct selectHomeCur(
		IDbConnection conn,
		String ctrlCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectHomeCurSql);
			ps.setString(1, ctrlCd);
			// SQL実行
			rs = ps.executeQuery();

			// 検索結果が0件の場合はエラー
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02022");
			}

			// メソッドリターン用データクラス作成
			HomeCurStruct hcs = new HomeCurStruct();
			hcs.setCUR_CD(rs.getString("CTRL_CD"));
			hcs.setCUR_CD(rs.getString("HOME_CUR_CD"));

			return hcs;
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
	 * [通貨]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param curCd 通貨コード
	 * @return 通貨情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static HomeCurStruct selectCur(IDbConnection conn, String curCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectCurSql);
			ps.setString(1, curCd);
			// SQL実行
			rs = ps.executeQuery();

			// 検索結果が0件の場合はエラー
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02023");
			}

			// メソッドリターン用データクラス作成
			HomeCurStruct hcs = new HomeCurStruct();
			hcs.setCUR_CD(rs.getString("CUR_CD"));
			hcs.setCUR_NAME(rs.getString("CUR_NAME"));
			hcs.setCUR_SYMBOL(rs.getString("CUR_SYMBOL"));
			hcs.setCUR_UNIT(rs.getString("CUR_UNIT"));
			hcs.setDECIMAL_FIG(rs.getString("DECIMAL_FIG"));

			return hcs;
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
