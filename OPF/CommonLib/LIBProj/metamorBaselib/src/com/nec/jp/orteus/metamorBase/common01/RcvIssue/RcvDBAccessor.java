//------------------------------------------------------------------------------
// (#)RcvDBAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/21 新規作成 M.Hotokebuchi
//            ・数量をInteger → Double (int → double) に変換
// 2003/08/27 M.Hotokebuchi
//           ・SYSTEM時刻を取得する関数 selectSYSDATE() を追加
//           ・update時に更新日,更新者,更新プログラム名,更新数を更新するよう修正
//           ・insert時に更新者,更新プログラム名を登録するよう修正
// 2003/09/01 M.Hotokebuchi
//           ・計算処理Calculate() 対応
//           ・Double→String 対応
//           ・数値select時のTO_CHARフォーマット対応
// 2003/10/20 M.Hotokebuchi
//           ・業務運用日を計上日に変更
// 2003/12/05 M.Hotokebuchi
//           ・計上日判定処理の削除に伴い、計上日の取得SQLを削除
//
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.RcvIssue;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.wa.DataObject;
import com.nec.jp.orteus.util.CoreTools;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

/**
 * <B>RcvDBAccessor</B><BR>
 * 入庫処理用のDBアクセッサ<BR>
 * <BR>
 * @author  M.Hotokebuchi
 * @version 1.00
 */
public class RcvDBAccessor extends DataObject
{
	/** [T_RCV_ISSUE]読込用のSQL */
	private String _selelctRcvIssue = 
		"select "
		+"    T_RCV_ISSUE.RCV_ISSUE_CTRL_CD, "
		+"    T_RCV_ISSUE.RCV_ISSUE_TYP, "
		+"    T_RCV_ISSUE.ITEM_CD, "
		+"    T_RCV_ISSUE.PLANT_CD, "
		+"    T_RCV_ISSUE.WH_CD, "
		+"    T_RCV_ISSUE.JOB_ODR_CD, "
		+"    T_RCV_ISSUE.PUCH_ODR_CD, "
		+"    T_RCV_ISSUE.WORK_ODR_CD, "
		+"    T_RCV_ISSUE.ISSUE_INST_CD, "
		+"    TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_QTY, 'fm999999999999999990.0999'), "
		+"    TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_DATE,'YYYY/MM/DD'), "
		+"    T_RCV_ISSUE.STOCK_UPD_TYP, "
		+"    T_RCV_ISSUE.RCV_ISSUE_GNR_TYP, "
		+"    T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG, "
		+"    T_RCV_ISSUE.OD_NO, "
		+"    T_RCV_ISSUE.UPDATED_BY, "
		+"    T_RCV_ISSUE.UPDATED_PRG_NM "
		+"from T_RCV_ISSUE "
		+"where "
		+"    T_RCV_ISSUE.\"RCV_ISSUE_CTRL_CD\" = ? "
		+"for update nowait";

	/** 製番の出庫可能数算出用 SQL */
	private String _selectJobOdrCdStock = 
		"select "
		+"    TO_CHAR(STOCK_ON_HAND_QTY, 'fm999999999999999990.0999') "
		+"from T_JOB_ODR_CD_STOCK "
		+"where "
		+"    T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
		+"and T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
		+"and T_JOB_ODR_CD_STOCK.\"WH_CD\" = ? "
		+"and T_JOB_ODR_CD_STOCK.\"PLANT_CD\" = ? "
		+"for update nowait";

	/** 品目の出庫可能数算出用 SQL */
	private String _selectItemStock = 
		"select "
		+"    TO_CHAR(STOCK_ON_HAND_QTY, 'fm999999999999999990.0999'), "
		+"    TO_CHAR(DEFECT_QTY, 'fm999999999999999990.0999') "
		+"from T_ITEM_STOCK "
		+"where "
		+"    T_ITEM_STOCK.\"ITEM_CD\" = ? "
		+"and T_ITEM_STOCK.\"WH_CD\" = ? "
		+"and T_ITEM_STOCK.\"PLANT_CD\" = ? "
		+"for update nowait";

	/** [T_RCV_ISSUE]update用のSQL */
	private String _updateRcvIssue = 
		"update T_RCV_ISSUE "
		+"set T_RCV_ISSUE.\"STOCK_UPD_TYP\" = ? "
		+"   ,T_RCV_ISSUE.\"UPDATED_BY\" = ? "
		+"   ,T_RCV_ISSUE.\"UPDATED_PRG_NM\" = ? "
		+"   ,T_RCV_ISSUE.\"UPDATED_DATE\" = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
		+"   ,T_RCV_ISSUE.\"MODIFY_COUNT\" = T_RCV_ISSUE.\"MODIFY_COUNT\" + 1 "
		+"where "
		+"    T_RCV_ISSUE.\"RCV_ISSUE_CTRL_CD\" = ? ";

	/** [T_ITEM_STOCK.STOCK_ON_HAND_QTY]update用のSQL */
	private String _updateItemStock = 
		"update T_ITEM_STOCK "
		+"set T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\" = TO_NUMBER(?) "
		+"   ,T_ITEM_STOCK.\"UPDATED_BY\" = ? "
		+"   ,T_ITEM_STOCK.\"UPDATED_PRG_NM\" = ? "
		+"   ,T_ITEM_STOCK.\"UPDATED_DATE\" = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
		+"   ,T_ITEM_STOCK.\"MODIFY_COUNT\" = T_ITEM_STOCK.\"MODIFY_COUNT\" + 1 "
		+"where "
		+"    T_ITEM_STOCK.\"ITEM_CD\" = ? "
		+"and T_ITEM_STOCK.\"WH_CD\" = ? "
		+"and T_ITEM_STOCK.\"PLANT_CD\" = ? ";

	/** [T_ITEM_STOCK.DEFECT_QTY]update用のSQL */
	private String _updateDefectItemStock = 
		"update T_ITEM_STOCK "
		+"set T_ITEM_STOCK.\"DEFECT_QTY\" = TO_NUMBER(?) "
		+"   ,T_ITEM_STOCK.\"UPDATED_BY\" = ? "
		+"   ,T_ITEM_STOCK.\"UPDATED_PRG_NM\" = ? "
		+"   ,T_ITEM_STOCK.\"UPDATED_DATE\" = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
		+"   ,T_ITEM_STOCK.\"MODIFY_COUNT\" = T_ITEM_STOCK.\"MODIFY_COUNT\" + 1 "
		+"where "
		+"    T_ITEM_STOCK.\"ITEM_CD\" = ? "
		+"and T_ITEM_STOCK.\"WH_CD\" = ? "
		+"and T_ITEM_STOCK.\"PLANT_CD\" = ? ";

	/** [T_JOB_ODR_CD_STOCK]update用のSQL */
	private String _updateJobOdrCdStock = 
		"update T_JOB_ODR_CD_STOCK "
		+"set T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\" = TO_NUMBER(?) "
		+"   ,T_JOB_ODR_CD_STOCK.\"UPDATED_BY\" = ? "
		+"   ,T_JOB_ODR_CD_STOCK.\"UPDATED_PRG_NM\" = ? "
		+"   ,T_JOB_ODR_CD_STOCK.\"UPDATED_DATE\" = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS') "
		+"   ,T_JOB_ODR_CD_STOCK.\"MODIFY_COUNT\" = T_JOB_ODR_CD_STOCK.\"MODIFY_COUNT\" + 1 "
		+"where "
		+"    T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
		+"and T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
		+"and T_JOB_ODR_CD_STOCK.\"WH_CD\" = ? "
		+"and T_JOB_ODR_CD_STOCK.\"PLANT_CD\" = ? ";

	/** [T_ITEM_STOCK.STOCK_ON_HAND_QTY]insert用のSQL */
	private String _insertItemStock = 
		"insert into T_ITEM_STOCK( "
		+"    T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\" "
		+"   ,T_ITEM_STOCK.\"ITEM_CD\" "
		+"   ,T_ITEM_STOCK.\"WH_CD\" "
		+"   ,T_ITEM_STOCK.\"PLANT_CD\" "
		+"   ,T_ITEM_STOCK.\"CREATED_BY\" "
		+"   ,T_ITEM_STOCK.\"CREATED_PRG_NM\" "
		+"   ,T_ITEM_STOCK.\"UPDATED_BY\" "
		+"   ,T_ITEM_STOCK.\"UPDATED_PRG_NM\") "
		+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";

	/** [T_ITEM_STOCK.DEFECT_QTY]insert用のSQL */
	private String _insertDefectItemStock = 
		"insert into T_ITEM_STOCK( "
		+"    T_ITEM_STOCK.\"DEFECT_QTY\" "
		+"   ,T_ITEM_STOCK.\"ITEM_CD\" "
		+"   ,T_ITEM_STOCK.\"WH_CD\" "
		+"   ,T_ITEM_STOCK.\"PLANT_CD\" "
		+"   ,T_ITEM_STOCK.\"CREATED_BY\" "
		+"   ,T_ITEM_STOCK.\"CREATED_PRG_NM\" "
		+"   ,T_ITEM_STOCK.\"UPDATED_BY\" "
		+"   ,T_ITEM_STOCK.\"UPDATED_PRG_NM\") "
		+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? ) ";

	/** [T_JOB_ODR_CD_STOCK]insert用のSQL */
	private String _insertJobOdrCdStock = 
		"insert into T_JOB_ODR_CD_STOCK( "
		+"    T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\" "
		+"   ,T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" "
		+"   ,T_JOB_ODR_CD_STOCK.\"ITEM_CD\" "
		+"   ,T_JOB_ODR_CD_STOCK.\"WH_CD\" "
		+"   ,T_JOB_ODR_CD_STOCK.\"PLANT_CD\" "
		+"   ,T_JOB_ODR_CD_STOCK.\"CREATED_BY\" "
		+"   ,T_JOB_ODR_CD_STOCK.\"CREATED_PRG_NM\" "
		+"   ,T_JOB_ODR_CD_STOCK.\"UPDATED_BY\" "
		+"   ,T_JOB_ODR_CD_STOCK.\"UPDATED_PRG_NM\") "
		+"values( TO_NUMBER(?) , ? , ? , ? , ? , ? , ? , ? , ? ) ";

	/** SYSDATE取得用のSQL */
	private String _selectSysDate = 
		"select TO_CHAR(sysdate,'YYYY/MM/DD HH24:MI:SS') from DUAL ";

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
			struct.setUPDATED_BY( getString(16, selectRslt) );
			struct.setUPDATED_PRG_NM( getString(17, selectRslt) );

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

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateRcvIssue);

			updateStmt.setInt(1, struct.UPD_TYP_COMPLETED);
			updateStmt.setString(2, struct.getUPDATED_BY());
			updateStmt.setString(3, struct.getUPDATED_PRG_NM());
			updateStmt.setString(4, struct.getSYSDATE());
			updateStmt.setString(5, struct.getRCV_ISSUE_CTRL_CD());

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
			if(struct.getRCV_ISSUE_TYP().intValue() == struct.ISSUE_RCV_TYP_DEF_RCV)
			{
				// 不良在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_updateDefectItemStock);
				stockQty = struct.getDEFECT_QTY();
			}else{
				// 手持在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_updateItemStock);
				stockQty = struct.getITEM_STOCK_ON_HAND_QTY();
			}

			updateStmt.setString(1, _calc.add(stockQty, rcvIssueQty));
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

		try {
			// 更新する入出庫数
			String stockQty = struct.getJOB_STOCK_ON_HAND_QTY();
			// 更新前の在庫数
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt = _conn.getConn().prepareStatement(_updateJobOdrCdStock);

			updateStmt.setString(1, _calc.add(stockQty, rcvIssueQty));
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
			if(struct.getRCV_ISSUE_TYP().intValue() == struct.ISSUE_RCV_TYP_DEF_RCV)
			{
				// 不良在庫数を更新
				updateStmt = _conn.getConn().prepareStatement(_insertDefectItemStock);
			}else{
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

	/** 計算処理用クラス */
	private Calculate _calc = new Calculate();

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

