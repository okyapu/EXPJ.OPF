/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/TaxControl.java,v $
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
 * 消費税情報取得部品
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/02/20 14:46:18 $
 */
public class TaxControl {

	/** [取引先]データ取得用のSQL */
	private static final String selectVendCtrlSql =
		"select "
			+ "  M_VEND_CTRL.ROUND_TYP as ROUND_TYP, "
			+ "  M_VEND_CTRL.TAX_APPLY_TYP as TAX_APPLY_TYP, "
			+ "  M_VEND_CTRL.TAX_CD as TAX_CD "
			+ "from "
			+ "  M_VEND_CTRL "
			+ "where "
			+ "  M_VEND_CTRL.COMPANY_CD = ? "
			+ "  and M_VEND_CTRL.VEND_CD = ? ";
	/** [品目]データ取得用のSQL */
	private static final String selectItemSql =
		"select "
			+ "  M_ITEM.TAX_CD as TAX_CD "
			+ "from "
			+ "  M_ITEM "
			+ "where "
			+ "  M_ITEM.ITEM_CD = ? ";
	/** [消費税]データ取得用のSQL */
	private static final String selectTaxSql =
		"select "
			+ "  M_TAX.OLD_TAX_RATE_1 as TAX_RATE_1, "
			+ "  M_TAX.OLD_TAX_RATE_2 as TAX_RATE_2, "
			+ "  M_TAX.OLD_TAX_RATE_3 as TAX_RATE_3, "
			+ "  M_TAX.ROUND_TYP as TAX_ROUND_TYP "
			+ "from "
			+ "  M_TAX "
			+ "where "
			+ "  M_TAX.TAX_CD = ? "
			+ "  and M_TAX.NEW_TAX_RATE_START_DATE > TO_DATE(?, 'YYYY/MM/DD') "
			+ "union all "
			+ "select "
			+ "  M_TAX.NEW_TAX_RATE_1 as TAX_RATE_1, "
			+ "  M_TAX.NEW_TAX_RATE_2 as TAX_RATE_2, "
			+ "  M_TAX.NEW_TAX_RATE_3 as TAX_RATE_3, "
			+ "  M_TAX.ROUND_TYP as TAX_ROUND_TYP "
			+ "from "
			+ "  M_TAX "
			+ "where "
			+ "  M_TAX.TAX_CD = ? "
			+ "  and M_TAX.NEW_TAX_RATE_START_DATE <= TO_DATE(?, 'YYYY/MM/DD') ";

	/**
	 * 通貨情報取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private TaxControl() {
	}

	/**
	 * 消費税情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード（必須）
	 * @param itemCd 品目番号（必須）
	 * @param newTaxRateJudgeDate 新消費税率判定日（必須）
	 * @return 消費税情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static TaxStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String itemCd,
		String newTaxRateJudgeDate)
		throws SQLException, DataNotFoundException {

		// 会社コードが不正な場合			
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 取引先コードが不正な場合
		if (vendCd == null || vendCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 新消費税率判定日が不正な場合
		if (newTaxRateJudgeDate == null || newTaxRateJudgeDate.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// メソッドリターン用データクラス
		TaxStruct ts = new TaxStruct();

		// 取引先マスタを検索
		TaxStruct vendCtrlTs = selectVendCtrl(conn, companyCd, vendCd);

		// 品目番号がnullまたは、[取引先]."消費税適用区分"が、
		// 1(品目)の場合、[品目]."消費税コード"をキーにする
		// 2(取引先)の場合、[取引先コード]."消費税コード"をキーにする
		if (itemCd == null
			|| itemCd.length() <= 0
			|| "2".equals(vendCtrlTs.getTAX_APPLY_TYP())) {

			ts.setTAX_CD(vendCtrlTs.getTAX_CD());
		} else {

			// 品目マスタを検索
			TaxStruct itemTs = selectItem(conn, itemCd);
			ts.setTAX_CD(itemTs.getTAX_CD());
		}

		// 消費税区分マスタを検索
		TaxStruct taxTs = selectTax(conn, ts.getTAX_CD(), newTaxRateJudgeDate);

		// 税端数区分を設定
		ts.setTAX_APPLY_TYP(vendCtrlTs.getTAX_APPLY_TYP());
		ts.setTAX_RATE_1(taxTs.getTAX_RATE_1());
		ts.setTAX_RATE_2(taxTs.getTAX_RATE_2());
		ts.setTAX_RATE_3(taxTs.getTAX_RATE_3());
		ts.setTAX_ROUND_TYP(taxTs.getTAX_ROUND_TYP());

		return ts;
	}
//Add  Start 20131225 song-yy
	/**
	 * 消費税情報TAXを取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param vendCd 取引先コード（必須）
	 * @param itemCd 品目番号（必須）
	 * @param newTaxRateJudgeDate 新消費税率判定日（必須）
	 * @param taxCd 消費税コード（必須）
	 * @return 消費税情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static TaxStruct getDataTax(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String itemCd,
		String newTaxRateJudgeDate,
		String taxCd)
		throws SQLException, DataNotFoundException {

		// 会社コードが不正な場合			
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 取引先コードが不正な場合
		if (vendCd == null || vendCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 新消費税率判定日が不正な場合
		if (newTaxRateJudgeDate == null || newTaxRateJudgeDate.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// メソッドリターン用データクラス
		TaxStruct ts = new TaxStruct();
		
					// 取引先マスタを検索
		TaxStruct vendCtrlTs = selectVendCtrl(conn, companyCd, vendCd);
		
		//消費税コード”＝　Nullの場合
		if(taxCd == null || taxCd.length() <= 0){
			            
		    // 品目番号がnullまたは、[取引先]."消費税適用区分"が、
		    // 1(品目)の場合、[品目]."消費税コード"をキーにする
		    // 2(取引先)の場合、[取引先コード]."消費税コード"をキーにする
		    if (itemCd == null
		    	|| itemCd.length() <= 0
		    	|| "2".equals(vendCtrlTs.getTAX_APPLY_TYP())) {
            
		    	ts.setTAX_CD(vendCtrlTs.getTAX_CD());
		    } else {
            
		    	// 品目マスタを検索
		    	TaxStruct itemTs = selectItem(conn, itemCd);
		    	ts.setTAX_CD(itemTs.getTAX_CD());
		    }
    	}else{
    		//消費税コード”≠Nullの場合
    		ts.setTAX_CD(taxCd);
    	}
		

		// 消費税区分マスタを検索
		TaxStruct taxTs = selectTax(conn, ts.getTAX_CD(), newTaxRateJudgeDate);

		// 税端数区分を設定
		ts.setTAX_APPLY_TYP(vendCtrlTs.getTAX_APPLY_TYP());
		ts.setTAX_RATE_1(taxTs.getTAX_RATE_1());
		ts.setTAX_RATE_2(taxTs.getTAX_RATE_2());
		ts.setTAX_RATE_3(taxTs.getTAX_RATE_3());
		ts.setTAX_ROUND_TYP(taxTs.getTAX_ROUND_TYP());

		return ts;
	}
//Add  End   20131225 song-yy
//Add  Start 20140117 liu-j
	/**
	 * 消費税情報TAXを取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param newTaxRateJudgeDate 新消費税率判定日（必須）
	 * @param taxCd 消費税コード（必須）
	 * @return 消費税情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static TaxStruct getDataTax(
		IDbConnection conn,
		String newTaxRateJudgeDate,
		String taxCd)
		throws SQLException, DataNotFoundException {

		// 新消費税率判定日が不正な場合
		if (newTaxRateJudgeDate == null || newTaxRateJudgeDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
      
      // 消費税コードが不正な場合
		if (taxCd == null || taxCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// メソッドリターン用データクラス
		TaxStruct ts = new TaxStruct();

		// 消費税区分マスタを検索
		TaxStruct taxTs = selectTax(conn, taxCd, newTaxRateJudgeDate);

		// 税端数区分を設定
		ts.setTAX_RATE_1(taxTs.getTAX_RATE_1());
		ts.setTAX_RATE_2(taxTs.getTAX_RATE_2());
		ts.setTAX_RATE_3(taxTs.getTAX_RATE_3());
		ts.setTAX_ROUND_TYP(taxTs.getTAX_ROUND_TYP());

		return ts;
	}
//Add  End 20140117 liu-j
	/**
	 * [取引先]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード
	 * @param vendCd 取引先コード
	 * @return 単価情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static TaxStruct selectVendCtrl(
		IDbConnection conn,
		String companyCd,
		String vendCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.getConn().prepareStatement(selectVendCtrlSql);
			ps.setString(1, companyCd);
			ps.setString(2, vendCd);
			rs = ps.executeQuery();

			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02021");
			}

			TaxStruct ts = new TaxStruct();
			ts.setTAX_CD(rs.getString("TAX_CD"));
			ts.setTAX_APPLY_TYP(rs.getString("TAX_APPLY_TYP"));

			return ts;
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
	 * [品目]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param itemCd 品目番号
	 * @return 消費税情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static TaxStruct selectItem(IDbConnection conn, String itemCd)
		throws SQLException, DataNotFoundException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.getConn().prepareStatement(selectItemSql);
			ps.setString(1, itemCd);
			rs = ps.executeQuery();

			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02025");
			}

			TaxStruct ts = new TaxStruct();
			ts.setTAX_CD(rs.getString("TAX_CD"));

			return ts;
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
	 * [消費税区分]検索
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param taxCd 消費税コード
	 * @param newTaxRateStartDate 新消費税コード開始日
	 * @return 消費税情報データクラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static TaxStruct selectTax(
		IDbConnection conn,
		String taxCd,
		String newTaxRateStartDate)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.getConn().prepareStatement(selectTaxSql);
			ps.setString(1, taxCd);
			ps.setString(2, newTaxRateStartDate);
			ps.setString(3, taxCd);
			ps.setString(4, newTaxRateStartDate);
			rs = ps.executeQuery();

			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02026");
			}

			TaxStruct ts = new TaxStruct();
			ts.setTAX_RATE_1(rs.getString("TAX_RATE_1"));
			ts.setTAX_RATE_2(rs.getString("TAX_RATE_2"));
			ts.setTAX_RATE_3(rs.getString("TAX_RATE_3"));
			ts.setTAX_ROUND_TYP(rs.getString("TAX_ROUND_TYP"));

			return ts;
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
