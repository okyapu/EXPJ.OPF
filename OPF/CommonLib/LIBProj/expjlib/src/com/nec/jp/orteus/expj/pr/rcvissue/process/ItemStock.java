/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/ItemStock.java,v $
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
 * 保管区別品目在庫情報操作クラス
 * </pre>
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.5 $
 *
 **/

public class ItemStock implements RcvIssueConst{

	/** コネクション */
	private IDbConnection _conn = null;

	/**
	 * <pre>
	 * コンストラクタ
	 * 指定のコネクションを持つオブジェクトを構築する
	 * </pre>
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public ItemStock(IDbConnection connect){
		_conn = connect;
	}

	//-------  公開メソッド  -------------------------------
	/**
	 * <pre>
	 * <b>※保管区・品目別手持ち在庫数の取得</b>
	 * 保管区別品目在庫テーブルの読み込み
	 * </pre>
	 *
	 * @param  iItemCd 品目番号
	 * @param  iWhCd 保管区コード
	 * @param  iMode  読込モード(0:排他ロックなし 1:排他ロックあり) 
	 * @return BigDecimal 品目別手持在庫数 該当する情報が存在しない場合はNULL
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getHandQty(String iItemCd, String iWhCd, int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// 引数チェック
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iWhCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [保管区別品目在庫]読込用 SQL */
		String selectStr = 
			"SELECT"
			+" STOCK_ON_HAND_QTY "
			+"FROM"
			+" T_ITEM_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		} else {
			selectStr = selectStr + " AND STOCK_ON_HAND_QTY > 0";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iWhCd);

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
	 * <b>※保管区・ロット別手持ち在庫数の取得</b>
	 * ロット別品目在庫テーブルの読み込み
	 * </pre>
	 *
	 * @param  iItemCd 品目番号
	 * @param  iWhCd 保管区コード
	 * @param  iWhCd 保管区コード
	 * @param  iLotNo  読込モード(0:排他ロックなし 1:排他ロックあり) 
	 * @return BigDecimal 品目別手持在庫数 該当する情報が存在しない場合はNULL
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getLotHandQty(String iItemCd, String iWhCd, String iLotNo, int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// 引数チェック
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iWhCd) || !StringUtil.Validate(iLotNo)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [ロット別品目在庫]読込用 SQL */
		String selectStr = 
			"SELECT"
			+" STOCK_ON_HAND_QTY "
			+"FROM"
			+" T_LOT_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND LOT_NO = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		} else {
			selectStr = selectStr + " AND STOCK_ON_HAND_QTY > 0";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iWhCd);
			selectStmt.setString(3, iLotNo);
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
	 * <b>※保管区・品目別不良数の取得</b>
	 * 保管区別品目在庫テーブルの読み込み
	 * </pre>
	 *
	 * @param  iItemCd 品目番号
	 * @param  iWhCd 保管区コード
	 * @param  iMode  読込モード(0:排他ロックなし 1:排他ロックあり) 
	 * @return BigDecimal 品目別不良数 該当する情報が存在しない場合はNULL
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getDefectQty(String iItemCd, String iWhCd, int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// 引数チェック
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iWhCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [保管区別品目在庫]読込用 SQL */
		String selectStr = 
			"SELECT"
			+" DEFECT_QTY "
			+"FROM"
			+" T_ITEM_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iWhCd);

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
	 * <b>※保管区・ロット別不良数の取得</b>
	 * ロット別品目在庫テーブルの読み込み
	 * </pre>
	 *
	 * @param  iItemCd 品目番号
	 * @param  iWhCd 保管区コード
     * @param  iLotNo ロット管理番号
	 * @param  iMode  読込モード(0:排他ロックなし 1:排他ロックあり) 
	 * @return BigDecimal 品目別不良数 該当する情報が存在しない場合はNULL
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getLotDefectQty(String iItemCd, String iWhCd, String iLotNo, int iMode)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// 引数チェック
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iWhCd) || !StringUtil.Validate(iLotNo)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [ロット別品目在庫]読込用 SQL */
		String selectStr = 
			"SELECT"
			+" DEFECT_QTY "
			+"FROM"
			+" T_LOT_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND LOT_NO = ?";
			
		if (iMode == 1) {
			selectStr = selectStr + " FOR UPDATE NOWAIT";
		}
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iWhCd);
			selectStmt.setString(3, iLotNo);

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
	 * <b>※品目別手持在庫合計数の取得(所要量計算対象保管区のみ)</b>
	 * 保管区別品目在庫テーブルの読み込み
	 * </pre>
	 *
	 * @param  iItemCd 品目番号
	 * @param  iPlantCd 工場コード
	 * @return BigDecimal 品目別手持在庫合計数 該当する情報が存在しない場合はNULL
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getSumHandQty(String iItemCd, String iPlantCd)
		throws SQLException 	{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		// 引数チェック
		if( !StringUtil.Validate(iItemCd) || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [保管区別品目在庫]読込用 SQL */
		String selectStr = 
			"SELECT"
			+" SUM(T_ITEM_STOCK.STOCK_ON_HAND_QTY) "
			+"FROM"
			+" T_ITEM_STOCK, "
			+" M_WH "
			+"WHERE"
			+" T_ITEM_STOCK.WH_CD = M_WH.WH_CD"
			+" AND T_ITEM_STOCK.ITEM_CD = ?"
			+" AND T_ITEM_STOCK.PLANT_CD = ?"
			+" AND M_WH.MRP_FLG = " + RcvIssueConst.MRP_TARGET;
			
		try {
			selectStmt = _conn.getConn().prepareStatement(selectStr);

			selectStmt.setString(1, iItemCd);
			selectStmt.setString(2, iPlantCd);

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
	 * 保管区別品目在庫テーブルの追加
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException DBアクセスエラー
	 */
	public int insertItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// 引数チェック
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_ITEM_STOCK](不良品)insert用のSQL */
		String _insertDefectItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    DEFECT_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";

		/** [T_ITEM_STOCK](良品)insert用のSQL */
		String _insertItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    STOCK_ON_HAND_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";

				// 手持在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_insertItemStock);

		try {

			// 不良在庫更新か 良品在庫更新か
			if(struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE){
				// 不良在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_insertDefectItemStock);
			} else {
				// 手持在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_insertItemStock);
			}

			updateStmt.setString(1, (struct.getRCV_ISSUE_QTY()));
			updateStmt.setString(2, struct.getITEM_CD());
			updateStmt.setString(3, struct.getWH_CD());
			updateStmt.setString(4, struct.getPLANT_CD());
			updateStmt.setString(5, struct.getUPDATED_BY());
			updateStmt.setString(6, struct.getUPDATED_PRG_NM());
			updateStmt.setString(7, struct.getUPDATED_BY());
			updateStmt.setString(8, struct.getUPDATED_PRG_NM());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	// Add Start 20140220 liuj
	/**
	 * 不良品保管区別品目在庫テーブルの追加
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException DBアクセスエラー
	 */
	public int insertDefectItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// 引数チェック
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_ITEM_STOCK](不良品)insert用のSQL */
		String _insertDefectItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    DEFECT_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";
		
		/** [T_ITEM_STOCK](良品)insert用のSQL */
		String _insertItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    STOCK_ON_HAND_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";
		
		// 手持在庫数を更新
		updateStmt = _conn.getConn().prepareStatement(_insertItemStock);

		try {

			// 不良在庫更新
			// 不良在庫数を更新
			updateStmt = _conn.getConn().prepareStatement(_insertDefectItemStock);

			updateStmt.setString(1, (struct.getRCV_ISSUE_QTY()));
			updateStmt.setString(2, struct.getITEM_CD());
			updateStmt.setString(3, struct.getWH_CD());
			updateStmt.setString(4, struct.getPLANT_CD());
			updateStmt.setString(5, struct.getUPDATED_BY());
			updateStmt.setString(6, struct.getUPDATED_PRG_NM());
			updateStmt.setString(7, struct.getUPDATED_BY());
			updateStmt.setString(8, struct.getUPDATED_PRG_NM());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * 良品保管区別品目在庫テーブルの追加
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException DBアクセスエラー
	 */
	public int insertAcptItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// 引数チェック
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_ITEM_STOCK](良品)insert用のSQL */
		String _insertItemStock = 
			"INSERT INTO T_ITEM_STOCK( "
			+"    STOCK_ON_HAND_QTY "
			+"   ,ITEM_CD "
			+"   ,WH_CD "
			+"   ,PLANT_CD "
			+"   ,CREATED_BY "
			+"   ,CREATED_PRG_NM "
			+"   ,UPDATED_BY "
			+"   ,UPDATED_PRG_NM) "
			+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";

			// 手持在庫数を更新
			updateStmt = _conn.getConn().prepareStatement(_insertItemStock);

		try {

			// 不良在庫更新か 良品在庫更新か
			// 手持在庫数を更新
			updateStmt = _conn.getConn().prepareStatement(_insertItemStock);
			updateStmt.setString(1, (struct.getRCV_ISSUE_QTY()));
			updateStmt.setString(2, struct.getITEM_CD());
			updateStmt.setString(3, struct.getWH_CD());
			updateStmt.setString(4, struct.getPLANT_CD());
			updateStmt.setString(5, struct.getUPDATED_BY());
			updateStmt.setString(6, struct.getUPDATED_PRG_NM());
			updateStmt.setString(7, struct.getUPDATED_BY());
			updateStmt.setString(8, struct.getUPDATED_PRG_NM());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * 良品保管区別品目在庫テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException DBアクセスエラー
	 */
	public int updateAcptItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// 引数チェック
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}

		/** [T_ITEM_STOCK](良品)update用のSQL */
		String _updateItemStock = 
			"UPDATE T_ITEM_STOCK "
			+"SET STOCK_ON_HAND_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ?";
		
		try {

			// 良品在庫更新
			updateStmt = _conn.getConn().prepareStatement(_updateItemStock);

			// 更新前数(品目別手持在庫数)
			String stockQty = struct.getSAVE_STOCK_QTY();
			// 更新する入出庫数
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt.setString(1, Calculate.add(stockQty, rcvIssueQty));
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getITEM_CD());
			updateStmt.setString(6, struct.getWH_CD());
			updateStmt.setString(7, struct.getPLANT_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * 不良品保管区別品目在庫テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException DBアクセスエラー
	 */
	public int updateDefectItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// 引数チェック
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		/** [T_ITEM_STOCK](不良品)update用のSQL */
		String _updateDefectItemStock = 
			"UPDATE T_ITEM_STOCK "
			+"SET DEFECT_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ?";
		
		try {

			// 不良在庫更新
			updateStmt = _conn.getConn().prepareStatement(_updateDefectItemStock);


			// 更新前数(品目別不良数)
			String stockQty = struct.getSAVE_STOCK_QTY();
			// 更新する入出庫数
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt.setString(1, Calculate.add(stockQty, rcvIssueQty));
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getITEM_CD());
			updateStmt.setString(6, struct.getWH_CD());
			updateStmt.setString(7, struct.getPLANT_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	// Add End 20140220 liuj
	/**
	 * 保管区別品目在庫テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException DBアクセスエラー
	 */
	public int updateItemStock(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		// 引数チェック
		if( struct == null ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		/** [T_ITEM_STOCK](不良品)update用のSQL */
		String _updateDefectItemStock = 
			"UPDATE T_ITEM_STOCK "
			+"SET DEFECT_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ?";
		
		/** [T_ITEM_STOCK](良品)update用のSQL */
		String _updateItemStock = 
			"UPDATE T_ITEM_STOCK "
			+"SET STOCK_ON_HAND_QTY = TO_NUMBER(?) "
			+"   ,UPDATED_BY = ? "
			+"   ,UPDATED_PRG_NM = ? "
			+"   ,UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
			+"   ,MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE "
			+"    ITEM_CD = ? "
			+"AND WH_CD = ? "
			+"AND PLANT_CD = ?";
		
		try {

			// 不良在庫更新か 良品在庫更新か
			if(struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE){
				updateStmt = _conn.getConn().prepareStatement(_updateDefectItemStock);
			} else {
				updateStmt = _conn.getConn().prepareStatement(_updateItemStock);
			}

			// 更新前数(品目別不良数 or 品目別手持在庫数)
			String stockQty = struct.getSAVE_STOCK_QTY();
			// 更新する入出庫数
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt.setString(1, Calculate.add(stockQty, rcvIssueQty));
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getITEM_CD());
			updateStmt.setString(6, struct.getWH_CD());
			updateStmt.setString(7, struct.getPLANT_CD());

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
