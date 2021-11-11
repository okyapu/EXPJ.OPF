/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/CurControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 通貨情報取得部品
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class CurControl {

	/** [取引先]データ取得用のSQL */
	private static final String selectVendCtrlSql =
		"select "
			+ "  * "
			+ "from "
			+ "  M_VEND_CTRL "
			+ "where "
			+ "  M_VEND_CTRL.COMPANY_CD = ? "
			+ "  and M_VEND_CTRL.VEND_CD = ?";
	/** [邦貨]データ取得用のSQL */
	private static final String selectHomeCurSql =
		"select "
			+ "  * "
			+ "from "
			+ "  SYS_HOME_CUR "
			+ "where "
			+ "  SYS_HOME_CUR.CTRL_CD = ?";
	/** [通貨]データ取得用のSQL */
	private static final String selectCurSql =
		"select "
			+ "  * "
			+ "from "
			+ "  M_CUR "
			+ "where "
			+ "  M_CUR.CUR_CD = ?";

	/**
	 * 通貨情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private CurControl() {
	}

	/**
	 * 取引先通貨情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード （必須）
	 * @return 通貨情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static CurStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd)
		throws SQLException, DataNotFoundException {

		// 会社コードが不正な場合
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 取引先コードが不正な場合
		if (vendCd == null || vendCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// メソッドリターン用データクラス作成
		CurStruct cs = new CurStruct();

		// [取引先]を検索
		CurStruct vendCtrlCs = selectVendCtrl(conn, companyCd, vendCd);

		// [通貨]検索用データクラス
		CurStruct curCs = null;

		// [取引先]."取引通貨コード"がnull、空文字の場合、
		// [邦貨]."邦貨コード"を使用し、為替レートは1とする。
		if (vendCtrlCs.getCUR_CD() == null
			|| vendCtrlCs.getCUR_CD().equals("")) {

			// [邦貨]情報取得
			CurStruct homeCurCs = selectHomeCur(conn, "SYSTEM");
			// [通貨]を[邦貨]."邦貨コード"で検索
			curCs = selectCur(conn, homeCurCs.getCUR_CD());
		} else {

			// [通貨]を[取引先]."取引通貨コード"で検索
			curCs = selectCur(conn, vendCtrlCs.getCUR_CD());
		}

		cs.setEXCH_TYP(vendCtrlCs.getEXCH_TYP());
		cs.setROUND_TYP(vendCtrlCs.getROUND_TYP());
		cs.setCUR_CD(curCs.getCUR_CD());
		cs.setCUR_NAME(curCs.getCUR_NAME());
		cs.setCUR_SYMBOL(curCs.getCUR_SYMBOL());
		cs.setCUR_UNIT(curCs.getCUR_UNIT());
		cs.setDECIMAL_FIG(curCs.getDECIMAL_FIG());

		return cs;
	}

	/**
	 * [取引先マスタ]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード
	 * @param vendCd 取引先コード
	 * @return 通貨情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static CurStruct selectVendCtrl(
		IDbConnection conn,
		String companyCd,
		String vendCd)
		throws SQLException, DataNotFoundException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectVendCtrlSql);
			ps.setString(1, companyCd);
			ps.setString(2, vendCd);
			// SQL実行
			rs = ps.executeQuery();

			// 検索結果が0件の場合はエラー
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02021");
			}

			// データを取得
			CurStruct cs = new CurStruct();
			cs.setCUR_CD(rs.getString("CUR_CD"));
			cs.setROUND_TYP(rs.getString("ROUND_TYP"));
			cs.setEXCH_TYP(rs.getString("EXCH_TYP"));

			return cs;
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
	 * [邦貨]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param ctrlCd コントロールコード
	 * @return 通貨情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static CurStruct selectHomeCur(IDbConnection conn, String ctrlCd)
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
			CurStruct cs = new CurStruct();
			cs.setCUR_CD(rs.getString("HOME_CUR_CD"));

			return cs;
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
	private static CurStruct selectCur(IDbConnection conn, String curCd)
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
			CurStruct cs = new CurStruct();
			cs.setCUR_CD(rs.getString("CUR_CD"));
			cs.setCUR_NAME(rs.getString("CUR_NAME"));
			cs.setCUR_SYMBOL(rs.getString("CUR_SYMBOL"));
			cs.setCUR_UNIT(rs.getString("CUR_UNIT"));
			cs.setDECIMAL_FIG(rs.getString("DECIMAL_FIG"));

			return cs;
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
