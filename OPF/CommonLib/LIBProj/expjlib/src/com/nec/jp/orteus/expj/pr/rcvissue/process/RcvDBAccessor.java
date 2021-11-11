/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvDBAccessor.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.wa.DataObject;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import com.nec.jp.orteus.expj.util.Calculate;

/**
 * <B>RcvDBAccessor</B><BR>
 * 入庫処理用のDBアクセッサ<BR>
 * <BR>
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $
 */
public class RcvDBAccessor extends DataObject
{
	/**
	 * コンストラクタ
	 */
	public RcvDBAccessor(){}

	/**
	 * 指定のコネクションを持つオブジェクトを構築する
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public RcvDBAccessor(IDbConnection connect){_conn = connect;}


	/**
	 * コネクション設定<BR>
	 * コネクションの参照を無効にする場合、引数にnullを設定すること
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public void setConnection(IDbConnection connect){_conn = connect;}

	/**
	 * 保管区別入出庫テーブルの読み込み
	 *
	 * @param  String 入出庫管理番号
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public RcvStruct selectRcvIssue(String _rcvIssueCtrlCd) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果
		
		/** [T_RCV_ISSUE]読込用のSQL */
		String _selelctRcvIssue = 
			"SELECT"
			+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD,"
			+" T_RCV_ISSUE.RCV_ISSUE_TYP,"
			+" T_RCV_ISSUE.ITEM_CD,"
			+" T_RCV_ISSUE.PLANT_CD,"
			+" T_RCV_ISSUE.WH_CD,"
			+" T_RCV_ISSUE.JOB_ODR_CD,"
			+" T_RCV_ISSUE.PUCH_ODR_CD,"
			+" T_RCV_ISSUE.WORK_ODR_CD,"
			+" T_RCV_ISSUE.ISSUE_INST_CD,"
			+" TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_QTY, 'FM999999999999999990.0999'),"
			+" TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_DATE,'YYYY/MM/DD'),"
			+" T_RCV_ISSUE.STOCK_UPD_TYP,"
			+" T_RCV_ISSUE.RCV_ISSUE_GNR_TYP,"
			+" T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG,"
			+" T_RCV_ISSUE.OD_NO,"
			+" T_RCV_ISSUE.LOT_NO,"
			+" T_RCV_ISSUE.UPDATED_BY,"
			+" T_RCV_ISSUE.UPDATED_PRG_NM, "
			+" M_ITEM.LOT_CTRL_FLG "
			+"FROM"
			+" T_RCV_ISSUE, "
			+" M_ITEM "
			+"WHERE"
			+" M_ITEM.ITEM_CD = T_RCV_ISSUE.ITEM_CD"
			+" AND T_RCV_ISSUE.RCV_ISSUE_CTRL_CD = ? "
			+"FOR UPDATE NOWAIT";
		try {
			selectStmt = _conn.getConn().prepareStatement(_selelctRcvIssue);
			selectStmt.setString(1, _rcvIssueCtrlCd);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			RcvStruct struct = new RcvStruct();

			struct.setRCV_ISSUE_CTRL_CD( getString(1, selectRslt) );
			struct.setRCV_ISSUE_TYP( getInteger(2, selectRslt) );
			struct.setITEM_CD( getString(3, selectRslt) );
			struct.setPLANT_CD( getString(4, selectRslt) );
			struct.setWH_CD( getString(5, selectRslt) );
			struct.setJOB_ODR_CD( getString(6, selectRslt) );
			struct.setPUCH_ODR_CD( getString(7, selectRslt) );
			struct.setWORK_ODR_CD( getString(8, selectRslt) );
			struct.setISSUE_INST_CD( getString(9, selectRslt) );
			struct.setRCV_ISSUE_QTY( getString(10, selectRslt) );
			struct.setRCV_ISSUE_DATE( getString(11, selectRslt) );
			struct.setSTOCK_UPD_TYP( getInteger(12, selectRslt) );
			struct.setRCV_ISSUE_GNR_TYP( getInteger(13, selectRslt) );
			struct.setRCV_ISSUE_CMPLT_FLG( getInteger(14, selectRslt) );
			struct.setOD_NO( getString(15, selectRslt) );
			struct.setLOT_NO( getString(16, selectRslt) );
			struct.setUPDATED_BY( getString(17, selectRslt) );
			struct.setUPDATED_PRG_NM( getString(18, selectRslt) );
			struct.setLOT_CTRL_FLG( getInteger(19, selectRslt));
			return struct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * 保管区別製番在庫テーブルの読み込み
	 *
	 * @param  struct 出庫処理データクラス
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public RcvStruct selectJobOdrCdStock(RcvStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		/** 製番の出庫可能数算出用 SQL */
		String _selectJobOdrCdStock = 
			"SELECT"
			+" TO_CHAR(STOCK_ON_HAND_QTY, 'FM999999999999999990.0999') "
			+"FROM"
			+" T_JOB_ODR_CD_STOCK "
			+"WHERE"
			+" JOB_ODR_CD = ?"
			+" AND ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND PLANT_CD = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectJobOdrCdStock);

			selectStmt.setString(1, struct.getJOB_ODR_CD());
			selectStmt.setString(2, struct.getITEM_CD());
			selectStmt.setString(3, struct.getWH_CD());
			selectStmt.setString(4, struct.getPLANT_CD());

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			RcvStruct rtnStruct = new RcvStruct(struct);

			rtnStruct.setJOB_STOCK_ON_HAND_QTY( getString(1, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * 保管区別品目在庫テーブルの読み込み
	 *
	 * @param  struct 出庫処理データクラス
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public RcvStruct selectItemStock(RcvStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		/** 品目の出庫可能数算出用 SQL */
		String _selectItemStock = 
			"SELECT"
			+" TO_CHAR(STOCK_ON_HAND_QTY, 'FM999999999999999990.0999'),"
			+" TO_CHAR(DEFECT_QTY, 'FM999999999999999990.0999') "
			+"FROM"
			+" T_ITEM_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND PLANT_CD = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectItemStock);

			selectStmt.setString(1, struct.getITEM_CD());
			selectStmt.setString(2, struct.getWH_CD());
			selectStmt.setString(3, struct.getPLANT_CD());

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			RcvStruct rtnStruct = new RcvStruct(struct);

			rtnStruct.setITEM_STOCK_ON_HAND_QTY( getString(1, selectRslt) );
			rtnStruct.setDEFECT_QTY( getString(2, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * ロット別品目在庫テーブルの読み込み
	 *
	 * @param  struct 出庫処理データクラス
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public RcvStruct selectLotStock(RcvStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		/** 品目の出庫可能数算出用 SQL */
		String _selectLotStock = 
			"SELECT"
			+" TO_CHAR(STOCK_ON_HAND_QTY, 'FM999999999999999990.0999'),"
			+" TO_CHAR(DEFECT_QTY, 'FM999999999999999990.0999') "
			+"FROM"
			+" T_LOT_STOCK "
			+"WHERE"
			+" ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND PLANT_CD = ? "
			+" AND LOT_NO = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectLotStock);

			selectStmt.setString(1, struct.getITEM_CD());
			selectStmt.setString(2, struct.getWH_CD());
			selectStmt.setString(3, struct.getPLANT_CD());
			selectStmt.setString(4, struct.getLOT_NO());

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			RcvStruct rtnStruct = new RcvStruct(struct);

			rtnStruct.setITEM_STOCK_ON_HAND_QTY( getString(1, selectRslt) );
			rtnStruct.setDEFECT_QTY( getString(2, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * 保管区別入出庫テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public int updateRcvIssue(RcvStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		/** [T_RCV_ISSUE]update用のSQL */
		String _updateRcvIssue = 
			 "UPDATE"
			+" T_RCV_ISSUE "
			+"SET"
			+" STOCK_UPD_TYP = ?,"
			+" RCV_ISSUE_BEFORE_QTY = ?,"
			+" RCV_ISSUE_AFTER_QTY = ? + RCV_ISSUE_QTY,"
			+" UPDATED_BY = ?,"
			+" UPDATED_PRG_NM = ?,"
			+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
			+" MODIFY_COUNT = T_RCV_ISSUE.\"MODIFY_COUNT\" + 1 "
			+"WHERE"
			+" RCV_ISSUE_CTRL_CD = ?";

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateRcvIssue);

			updateStmt.setInt(1, RcvStruct.UPD_TYP_COMPLETED);
			updateStmt.setString(2, struct.getSAVE_STOCK_QTY());
			updateStmt.setString(3, struct.getSAVE_STOCK_QTY());
			updateStmt.setString(4, struct.getUPDATED_BY());
			updateStmt.setString(5, struct.getUPDATED_PRG_NM());
			updateStmt.setString(6, struct.getSYSDATE());
			updateStmt.setString(7, struct.getRCV_ISSUE_CTRL_CD());

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * 保管区別品目在庫テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public int updateItemStock(RcvStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		try {
			// 更新する入出庫数
			String stockQty;
			// 更新前の在庫数
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			// 不良在庫更新か 良品在庫更新か
			if(struct.getRCV_ISSUE_TYP().intValue() == RcvStruct.ISSUE_RCV_TYP_DEF_RCV)
			{

				/** [T_ITEM_STOCK.DEFECT_QTY]update用のSQL */
				String _updateDefectItemStock = 
					 "UPDATE"
					+" T_ITEM_STOCK "
					+"SET"
					+" DEFECT_QTY = TO_NUMBER(?),"
					+" UPDATED_BY = ?,"
					+" UPDATED_PRG_NM = ?,"
					+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
					+" MODIFY_COUNT = MODIFY_COUNT + 1 "
					+"WHERE"
					+" ITEM_CD = ?"
					+" AND WH_CD = ?"
					+" AND PLANT_CD = ?";

				// 不良在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_updateDefectItemStock);
				stockQty = struct.getDEFECT_QTY();
			}else{

				/** [T_ITEM_STOCK.STOCK_ON_HAND_QTY]update用のSQL */
				String _updateItemStock = 
					 "UPDATE"
					+" T_ITEM_STOCK "
					+"SET"
					+" STOCK_ON_HAND_QTY = TO_NUMBER(?),"
					+" UPDATED_BY = ?,"
					+" UPDATED_PRG_NM = ?,"
					+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
					+" MODIFY_COUNT = MODIFY_COUNT + 1 "
					+"WHERE"
					+" ITEM_CD = ?"
					+" AND WH_CD = ?"
					+" AND PLANT_CD = ?";

				// 手持在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_updateItemStock);
				stockQty = struct.getITEM_STOCK_ON_HAND_QTY();
			}

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
	 * 保管区別製番在庫テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public int updateJobOdrCdStock(RcvStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		/** [T_JOB_ODR_CD_STOCK]update用のSQL */
		String _updateJobOdrCdStock = 
			 "UPDATE"
			+" T_JOB_ODR_CD_STOCK "
			+"SET"
			+" STOCK_ON_HAND_QTY = TO_NUMBER(?),"
			+" UPDATED_BY = ?,"
			+" UPDATED_PRG_NM = ?,"
			+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
			+" MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE"
			+" JOB_ODR_CD = ?"
			+" AND ITEM_CD = ?"
			+" AND WH_CD = ?"
			+" AND PLANT_CD = ?";

		try {
			// 更新する入出庫数
			String stockQty = struct.getJOB_STOCK_ON_HAND_QTY();
			// 更新前の在庫数
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

	/**
	 * 保管区別品目在庫テーブルの追加
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public int insertItemStock(RcvStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		try {
			// 不良在庫更新か 良品在庫更新か
			if(struct.getRCV_ISSUE_TYP().intValue() == RcvStruct.ISSUE_RCV_TYP_DEF_RCV)
			{

				/** [T_ITEM_STOCK.DEFECT_QTY]insert用のSQL */
				String _insertDefectItemStock = 
					 "INSERT INTO T_ITEM_STOCK("
					+" DEFECT_QTY,"
					+" ITEM_CD,"
					+" WH_CD,"
					+" PLANT_CD,"
					+" CREATED_BY,"
					+" CREATED_PRG_NM,"
					+" UPDATED_BY,"
					+" UPDATED_PRG_NM) "
					+"VALUES( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? )";

				// 不良在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_insertDefectItemStock);
			}else{

				/** [T_ITEM_STOCK.STOCK_ON_HAND_QTY]insert用のSQL */
				String _insertItemStock = 
					 "INSERT INTO T_ITEM_STOCK("
					+" STOCK_ON_HAND_QTY,"
					+" ITEM_CD,"
					+" WH_CD,"
					+" PLANT_CD,"
					+" CREATED_BY,"
					+" CREATED_PRG_NM,"
					+" UPDATED_BY,"
					+" UPDATED_PRG_NM) "
					+"VALUES( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? )";

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

	/**
	 * 保管区別製番在庫テーブルの追加
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public int insertJobOdrCdStock(RcvStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		/** [T_JOB_ODR_CD_STOCK]insert用のSQL */
		String _insertJobOdrCdStock = 
			 "INSERT INTO T_JOB_ODR_CD_STOCK("
			+" STOCK_ON_HAND_QTY,"
			+" JOB_ODR_CD,"
			+" ITEM_CD,"
			+" WH_CD,"
			+" PLANT_CD,"
			+" CREATED_BY,"
			+" CREATED_PRG_NM,"
			+" UPDATED_BY,"
			+" UPDATED_PRG_NM) "
			+"VALUES( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? , ? )";

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
	 * SYSTEM時刻の取得
	 *
	 * @param  struct 出庫処理データクラス
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public RcvStruct selectSYSDATE(RcvStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		/** SYSDATE取得用のSQL */
		String _selectSysDate = 
			"select TO_CHAR(sysdate,'YYYY/MM/DD HH24:MI:SS') from DUAL ";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectSysDate);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			RcvStruct rtnStruct = new RcvStruct(struct);

			rtnStruct.setSYSDATE( getString(1, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/** 入庫処理用コネクション */
	private IDbConnection _conn = null;

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

