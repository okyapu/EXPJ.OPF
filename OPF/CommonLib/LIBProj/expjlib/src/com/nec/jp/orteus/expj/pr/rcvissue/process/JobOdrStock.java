/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/JobOdrStock.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.util.Calculate;

import java.math.BigDecimal;

/**
 * <pre>
 * 保管区別製番在庫情報操作クラス
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $
 *
 **/

public class JobOdrStock implements RcvIssueConst{

	/** コネクション */
	private IDbConnection _conn = null;

	/**
	 * <pre>
	 * コンストラクタ
	 * 指定のコネクションを持つオブジェクトを構築する
	 * </pre>
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public JobOdrStock(IDbConnection connect){
		_conn = connect;
	}

	//-------  公開メソッド  -------------------------------
	/**
	 * <pre>
	 * <b>※保管区・製番別手持ち在庫数の取得</b>
	 * 保管区別製番在庫テーブルの読み込み
	 * </pre>
	 *
	 * @param  iJobOdrCd 製番
	 * @param  iJobOdrDetailNo 製番枝番
	 * @param  iItemCd 品目番号
	 * @param  iWhCd 保管区コード
	 * @param  iMode  読込モード(0:排他ロックなし 1:排他ロックあり) 
	 * @return BigDecimal 製番別手持在庫数 該当する情報が存在しない場合はNULL
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getHandQty(String iJobOdrCd, int iJobOdrDetailNo,
	                              String iItemCd,   String iWhCd,
	                              int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// 引数チェック
		if( !StringUtil.Validate(iJobOdrCd) || !StringUtil.Validate(iItemCd) ||
				!StringUtil.Validate(iWhCd) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** 製番の出庫可能数算出用 SQL */
		String selectStr = 
			"SELECT"
			+" STOCK_ON_HAND_QTY "
			+"FROM"
			+" T_JOB_ODR_CD_STOCK "
			+"WHERE"
			+" JOB_ODR_CD = ?"
			+" AND ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND JOB_ODR_DETAIL_NO = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		} else {
			selectStr = selectStr + " AND STOCK_ON_HAND_QTY > 0";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iJobOdrCd);
			selectStmt.setString(2, iItemCd);
			selectStmt.setString(3, iWhCd);
			selectStmt.setInt(4, iJobOdrDetailNo);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * <pre>
	 * <b>※製番別手持在庫合計数の取得(所要量計算対象保管区のみ)</b>
	 * 保管区別製番在庫テーブルの読み込み
	 * </pre>
	 *
	 * @param  iJobOdrCd 製番
	 * @param  iJobOdrDetailNo 製番枝番
	 * @param  iItemCd 品目番号
	 * @param  iPlantCd 工場コード
	 * @return BigDecimal 製番別手持在庫合計数 該当する情報が存在しない場合はNULL
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getSumHandQty(String iJobOdrCd, int iJobOdrDetailNo,
			                         String iItemCd,   String iPlantCd) 
	                   throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// 引数チェック
		if( !StringUtil.Validate(iJobOdrCd) ||
				!StringUtil.Validate(iItemCd) ||
				!StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** 製番の出庫可能数算出用 SQL */
		String selectStr = 
			"SELECT"
			+" SUM(T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY) "
			+"FROM"
			+" T_JOB_ODR_CD_STOCK, "
			+" M_WH "
			+"WHERE"
			+" T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD"
			+" AND T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ?"
			+" AND T_JOB_ODR_CD_STOCK.ITEM_CD = ?"
			+" AND T_JOB_ODR_CD_STOCK.PLANT_CD = ?"
			+" AND T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = " + iJobOdrDetailNo
			+" AND M_WH.MRP_FLG = " + RcvIssueConst.MRP_TARGET;
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iJobOdrCd);
			selectStmt.setString(2, iItemCd);
			selectStmt.setString(3, iPlantCd);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			selectRslt.next();
			if(selectRslt.getBigDecimal(1)==null) return null;

			return selectRslt.getBigDecimal(1);

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * 保管区別製番在庫テーブルの追加
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException DBアクセスエラー
	 */
	public int insertJobOdrCdStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// 引数チェック
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_JOB_ODR_CD_STOCK]insert用のSQL */
		String _insertJobOdrCdStock = 
			"INSERT INTO T_JOB_ODR_CD_STOCK( "
			+"    STOCK_ON_HAND_QTY "
			+"   ,JOB_ODR_CD "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? , ? ) ";

		try {
			updateStmt = _conn.getConn().prepareStatement(_insertJobOdrCdStock);

			updateStmt.setString(1, (struct.getRCV_ISSUE_QTY()));
			updateStmt.setString(2, struct.getJOB_ODR_CD());
			updateStmt.setString(3, struct.getITEM_CD());
			updateStmt.setString(4, struct.getWH_CD());
			updateStmt.setString(5, struct.getPLANT_CD());
			updateStmt.setString(6, struct.getUPDATED_BY());
			updateStmt.setString(7, struct.getUPDATED_PRG_NM());
			updateStmt.setString(8, struct.getUPDATED_BY());
			updateStmt.setString(9, struct.getUPDATED_PRG_NM());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * 保管区別製番在庫テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException DBアクセスエラー
	 */
	public int updateJobOdrCdStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// 引数チェック
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		/** [T_JOB_ODR_CD_STOCK]update用のSQL */
		String _updateJobOdrCdStock = 
			"UPDATE T_JOB_ODR_CD_STOCK "
			+"SET STOCK_ON_HAND_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    JOB_ODR_CD = ? "
			+"AND ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ? ";
		
		try {
			// 更新前の在庫数
			String stockQty = struct.getJOB_STOCK_ON_HAND_QTY();
			// 更新する入出庫数
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt = _conn.getConn().prepareStatement(_updateJobOdrCdStock);

			updateStmt.setString(1, Calculate.add(stockQty, rcvIssueQty));
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getJOB_ODR_CD());
			updateStmt.setString(6, struct.getITEM_CD());
			updateStmt.setString(7, struct.getWH_CD());
			updateStmt.setString(8, struct.getPLANT_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	//-------  非公開メソッド  -------------------------------
	/**
	 * プリペアドステートメントを閉じる
	 *
	 * @param statement 閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
			}
		}
	}
	
	/**
	 * リザルトセットを閉じる
	 *
	 * @param resultset 閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
			}
		}
	}
}
