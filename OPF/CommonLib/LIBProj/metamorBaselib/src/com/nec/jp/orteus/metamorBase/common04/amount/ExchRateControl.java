/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/ExchRateControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 為替レート情報取得部品
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class ExchRateControl {

	/** [為替レート]データ取得用のSQL */
	private static final String selectExchRateSql =
		"select "
			+ "  M_EXCH_RATE.COMPANY_CD as COMPANY_CD, "
			+ "  M_EXCH_RATE.CUR_CD as CUR_CD, "
			+ "  to_char(M_EXCH_RATE.EXCH_TYP) as EXCH_TYP, "
			+ "  M_EXCH_RATE.EXCH_RESERVE_CD as EXCH_RESERVE_CD, "
			+ "  to_char(M_EXCH_RATE.EXCH_START_DATE, 'YYYY/MM/DD') as EXCH_START_DATE, "
			+ "  to_char(M_EXCH_RATE.EXCH_END_DATE, 'YYYY/MM/DD') as EXCH_END_DATE, "
			+ "  to_char(M_EXCH_RATE.EXCH_RATE, 'fm99999999999990.009999') as EXCH_RATE "
			+ "from "
			+ "  M_EXCH_RATE, "
			+ "  ( "
			+ "    select "
			+ "      M_EXCH_RATE.COMPANY_CD as COMPANY_CD, "
			+ "      M_EXCH_RATE.CUR_CD as CUR_CD, "
			+ "      M_EXCH_RATE.EXCH_TYP as EXCH_TYP, "
			+ "      M_EXCH_RATE.EXCH_RESERVE_CD as EXCH_RESERVE_CD, "
			+ "      max(M_EXCH_RATE.EXCH_START_DATE) as MAX_EXCH_START_DATE "
			+ "    from "
			+ "      M_EXCH_RATE "
			+ "    where "
			+ "      M_EXCH_RATE.COMPANY_CD = ? "
			+ "      and M_EXCH_RATE.CUR_CD = ? "
			+ "      and M_EXCH_RATE.EXCH_TYP = to_number(?) "
			+ "      and (M_EXCH_RATE.EXCH_TYP != 2 or M_EXCH_RATE.EXCH_RESERVE_CD = ?) "
			+ "      and M_EXCH_RATE.EXCH_START_DATE <= to_date(?, 'YYYY/MM/DD') "
			+ "    group by "
			+ "      M_EXCH_RATE.COMPANY_CD, "
			+ "      M_EXCH_RATE.CUR_CD, "
			+ "      M_EXCH_RATE.EXCH_TYP, "
			+ "      M_EXCH_RATE.EXCH_RESERVE_CD "
			+ "  ) T1 "
			+ "where "
			+ "  M_EXCH_RATE.COMPANY_CD = T1.COMPANY_CD "
			+ "  and M_EXCH_RATE.CUR_CD = T1.CUR_CD "
			+ "  and M_EXCH_RATE.EXCH_TYP = T1.EXCH_TYP "
			+ "  and (M_EXCH_RATE.EXCH_TYP != 2 or M_EXCH_RATE.EXCH_RESERVE_CD = T1.EXCH_RESERVE_CD) "
			+ "  and M_EXCH_RATE.EXCH_START_DATE = T1.MAX_EXCH_START_DATE ";

	/**
	 * 為替レート取得部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private ExchRateControl() {
	}

	/**
	 * 為替レート情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード（必須）
	 * @param curCd 通貨コード（必須）
	 * @param exchTyp 為替種別（必須）
	 * @param exchReserveCd 為替予約コード
	 * @param rateJudgeDate レート判定日（必須）
	 * @return 為替レート情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static ExchRateStruct getData(
		IDbConnection conn,
		String companyCd,
		String curCd,
		String exchTyp,
		String exchReserveCd,
		String rateJudgeDate)
		throws SQLException, DataNotFoundException {

		// 会社コードが不正な場合			
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 通貨コードが不正な場合			
		if (curCd == null || curCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 為替種別が不正な場合			
		if (exchTyp == null || exchTyp.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// レート判定日が不正な場合			
		if (rateJudgeDate == null || rateJudgeDate.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// [邦貨]及び邦貨コードを基に検索した[通貨]の情報を取得
		HomeCurStruct hcs = HomeCurControl.getData(conn);

		// [取引先]."為替種別"が2かつ、｢為替予約コード｣がnullまたは空文字の場合
		/*
		if (exchTyp.equals("2")
			&& (exchReserveCd == null || exchReserveCd.equals(""))) {
			;
		}
		*/

		// [為替レート]検索用データクラス
		ExchRateStruct ers = null;

		// [取引先]."取引通貨コード"と[邦貨]."邦貨コード"が等しい場合
		if (curCd.equals(hcs.getCUR_CD())) {
			// [為替レート]データクラスは為替レートを1として作成
			ers = new ExchRateStruct();
			ers.setCUR_CD(curCd);
			ers.setEXCH_TYP(exchTyp);
			ers.setEXCH_RESERVE_CD(exchReserveCd);
			ers.setEXCH_START_DATE(rateJudgeDate);
			ers.setEXCH_END_DATE(null);
			ers.setEXCH_RATE("1.0");
		} else {
			// [為替レート]を検索し、為替レートを取得
			ers =
				selectExchRate(
					conn,
					companyCd,
					curCd,
					exchTyp,
					exchReserveCd,
					rateJudgeDate);
		}

		return ers;
	}

	/**
	 * [為替レートマスタ]検索 
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param companyCd 会社コード
	 * @param curCd 通貨コード
	 * @param exchTyp 為替種別
	 * @param exchReserveCd 為替予約コード
	 * @param rateJudgeDate レート判定日
	 * @return 為替レート情報クラス
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	private static ExchRateStruct selectExchRate(
		IDbConnection conn,
		String companyCd,
		String curCd,
		String exchTyp,
		String exchReserveCd,
		String exchStartDate)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL作成
			ps = conn.getConn().prepareStatement(selectExchRateSql);
			ps.setString(1, companyCd);
			ps.setString(2, curCd);
			ps.setString(3, exchTyp);
			ps.setString(4, exchReserveCd);
			ps.setString(5, exchStartDate);
			// SQL実行
			rs = ps.executeQuery();

			// 検索結果が0件の場合はエラー
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02024");
			}

			// メソッドリターン用データクラス作成
			ExchRateStruct ers = new ExchRateStruct();
			ers.setCOMPANY_CD(rs.getString("COMPANY_CD"));
			ers.setCUR_CD(rs.getString("CUR_CD"));
			ers.setEXCH_TYP(rs.getString("EXCH_TYP"));
			ers.setEXCH_RESERVE_CD(rs.getString("EXCH_RESERVE_CD"));
			ers.setEXCH_START_DATE(rs.getString("EXCH_START_DATE"));
			ers.setEXCH_END_DATE(rs.getString("EXCH_END_DATE"));
			ers.setEXCH_RATE(rs.getString("EXCH_RATE"));

			return ers;
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
