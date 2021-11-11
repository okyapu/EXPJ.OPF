/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/mst/ConsUnitCost.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.mst;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;

/**
 * <pre>
 * 支給単価情報取得クラス
 * 支給単価に登録してある情報を取得することができます。
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.4 $ $Date: 2008/03/26 07:27:59 $
 *
 **/

public class ConsUnitCost{

	/* メンバ変数 */
	private IDbConnection _conn;							// IDbConnection
	private BigDecimal _unitCost =  new BigDecimal(0.00);	// 単価
	private int _unitCostTyp;								// 単価区分
	private int _onerousFlg;								// 有償フラグ
	private boolean _newFlg;								// PreparedStatementオブジェクト生成フラグ
	PreparedStatement _ps;

	/**
	 * コンストラクタ
	 * @param iConnect コネクションがOPENされているIDbConnection
	 */
	public ConsUnitCost(IDbConnection iConnect){
		_conn = iConnect;
		_newFlg = false;
	}

	//-------  公開メソッド  -------------------------------
	/**
	 * <pre>
	 * <b>※指定された支給単価の情報を取得します。</b>
	 * 会社コード、取引先コード、工場コード、品目番号、支給単価有効開始日を元に
	 * 支給単価有効開始日で最大値の支給単価情報を取得する。
	 * </pre>
	 * @param iCompanyCd 会社コード
	 * @param iVendCd 取引先コード
	 * @param iPlantCd 工場コード
	 * @param iItemCd 品目番号
	 * @param iEffPhaseInDate 支給単価有効開始日
	 * @return true/false 該当する情報が存在しない場合はfalse
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean read(String iCompanyCd, String iVendCd, String iPlantCd,
						String iItemCd, String iEffPhaseInDate) throws SQLException {

		ResultSet rs = null;

		// 引数チェック
		if (!StringUtil.Validate(iCompanyCd) || !StringUtil.Validate(iVendCd) || !StringUtil.Validate(iPlantCd)
				|| !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iEffPhaseInDate)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		Connection conn = _conn.getConn();

		// [支給単価]の読込用SQL
		final String sql = "SELECT" + " UNIT_COST," + " UNIT_COST_TYP,"
				+ " ONEROUS_FLG " + "FROM" + " M_CONS_UNIT_COST " + "WHERE"
				+ " COMPANY_CD = ?" + " AND VEND_CD = ?" + " AND PLANT_CD = ?"
				+ " AND ITEM_CD = ?"
				+ " AND EFF_PHASE_IN_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
				+ "ORDER BY EFF_PHASE_IN_DATE DESC";
		try {
			// データ読込のSQL作成・実行
			if (!_newFlg) {
				_ps = conn.prepareStatement(sql);
				_newFlg = true;
			}
			_ps.setString(1, iCompanyCd);
			_ps.setString(2, iVendCd);
			_ps.setString(3, iPlantCd);
			_ps.setString(4, iItemCd);
			_ps.setString(5, iEffPhaseInDate);
			rs = _ps.executeQuery();
			if (!rs.next()) {
				return false;
			} // 該当データなし

			// メンバ変数のクリア
			initialize();

			// 結果を設定
			int n = 1;
			_unitCost = rs.getBigDecimal(n);
			n++;
			_unitCostTyp = rs.getInt(n);
			n++;
			_onerousFlg = rs.getInt(n);

			return true;
		} catch (SQLException e) {
			throw e;
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * <pre>
	 *  単価を取得する。
	 *  ※データを取得するには先に&lt;b&gt;read&lt;/b&gt;メソッドを行ってください。
	 * </pre>
	 * 
	 * @return 単価<br>
	 *         該当するデータが存在しない場合は0
	 */
	public BigDecimal getUnitCost(){
		return _unitCost;
	}

	/**
	 * <pre>
	 * 単価区分を取得する。
	 * ※データを取得するには先に<b>read</b>メソッドを行ってください。
	 * </pre>
	 * @return 単価区分<br>該当するデータが存在しない場合は0
	 */
	public int getUnitCostTyp(){
		return _unitCostTyp;
	}

	/**
	 * <pre>
	 * 有償フラグを取得する。
	 * ※データを取得するには先に<b>read</b>メソッドを行ってください。
	 * </pre>
	 * @return 有償フラグ<br>該当するデータが存在しない場合は0
	 */
	public int getOnerousFlg(){
		return _onerousFlg;
	}

	//-------  非公開メソッド  -------------------------------
	/**
	 * メンバ変数の初期化
	 */
	private void initialize()
	{
		_unitCost = new BigDecimal(0.00);
		_unitCostTyp = 0;
		_onerousFlg = 0;
	}

	/**
	 * インスタンス破壊時に行う処理
	 */
	public void finalize() throws Throwable {
		_ps.close();
	}
}
