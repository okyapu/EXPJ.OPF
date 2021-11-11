/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueDBAccessor.java,v $
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
 * <B>IssueDBAccessor</B><BR>
 * 出庫処理用のDBアクセッサ<BR>
 * <BR>
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $
 */
public class IssueDBAccessor extends DataObject
{
	/**
	 * コンストラクタ
	 */
	public IssueDBAccessor(){}

	/**
	 * 指定のコネクションを持つオブジェクトを構築する
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public IssueDBAccessor(IDbConnection connect){_conn = connect;}


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
	 *		   SQLの発行に失敗した場合
	 */
	public IssueStruct selectRcvIssue(String _rcvIssueCtrlCd) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果のセット

		/** [T_RCV_ISSUE]読込用のSQL */
		String _selectRcvIssue = 
			 "SELECT"
			+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD,"
			+" T_RCV_ISSUE.RCV_ISSUE_TYP,"
			+" T_RCV_ISSUE.ITEM_CD,"
			+" T_RCV_ISSUE.PLANT_CD,"
			+" T_RCV_ISSUE.WH_CD,"
			+" T_RCV_ISSUE.JOB_ODR_CD,"
			+" T_RCV_ISSUE.JOB_ODR_DETAIL_NO,"
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
			+"WHERE "
			+" M_ITEM.ITEM_CD = T_RCV_ISSUE.ITEM_CD"
			+" AND T_RCV_ISSUE.RCV_ISSUE_CTRL_CD = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectRcvIssue);
			selectStmt.setString(1, _rcvIssueCtrlCd);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			IssueStruct struct = new IssueStruct();

			struct.setRCV_ISSUE_CTRL_CD( getString(1, selectRslt) );
			struct.setRCV_ISSUE_TYP( getInteger(2, selectRslt) );
			struct.setITEM_CD( getString(3, selectRslt) );
			struct.setPLANT_CD( getString(4, selectRslt) );
			struct.setWH_CD( getString(5, selectRslt) );
			struct.setJOB_ODR_CD( getString(6, selectRslt) );
			struct.setJOB_ODR_DETAIL_NO( getString(7, selectRslt) );
			struct.setPUCH_ODR_CD( getString(8, selectRslt) );
			struct.setWORK_ODR_CD( getString(9, selectRslt) );
			struct.setISSUE_INST_CD( getString(10, selectRslt) );
			struct.setRCV_ISSUE_QTY( getString(11, selectRslt) );
			struct.setRCV_ISSUE_DATE( getString(12, selectRslt) );
			struct.setSTOCK_UPD_TYP( getInteger(13, selectRslt) );
			struct.setRCV_ISSUE_GNR_TYP( getInteger(14, selectRslt) );
			struct.setRCV_ISSUE_CMPLT_FLG( getInteger(15, selectRslt) );
			struct.setOD_NO( getString(16, selectRslt) );
			struct.setLOT_NO( getString(17, selectRslt) );
			struct.setUPDATED_BY( getString(18, selectRslt) );
			struct.setUPDATED_PRG_NM( getString(19, selectRslt) );
			struct.setLOT_CTRL_FLG( getInteger(20, selectRslt));
			
			return struct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * 製番引当テーブルの読み込み
	 *
	 * @param  struct 出庫処理データクラス
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	public IssueStruct selectJobOdrAlc(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		try {
			// 製番がNullのとき 品目のレコードを検索
			if(struct.getJOB_ODR_CD() == null)
			{
				/** [製番引当](品目)出庫済数・引当済数 算出用 SQL */
				String _selectJobOdrAlcItem = 
					"SELECT "
					+" JOB_ODR_ALC_CD,"
					+" TO_CHAR(ALCD_QTY, 'FM999999999999999990.0999'),"
					+" TO_CHAR(ISSUEED_QTY, 'FM999999999999999990.0999') "
					+"FROM"
					+" T_JOB_ODR_ALC "
					+"WHERE"
					+" OD_NO = ?"
					+" AND ITEM_CD = ?"
					+" AND ALC_STOCK_TYP = ?"
					+" AND PLANT_CD = ? "
					+"FOR UPDATE NOWAIT";

				selectStmt = _conn.getConn().prepareStatement(_selectJobOdrAlcItem);

				selectStmt.setString(1, struct.getOD_NO());
				selectStmt.setString(2, struct.getITEM_CD());
				selectStmt.setInt(3, IssueStruct.ALC_STOCK_TYP_ITEM);
				selectStmt.setString(4, struct.getPLANT_CD());
			}else{
				/** [製番引当](製番)出庫済数・引当済数 算出用 SQL */
				String _selectJobOdrAlcJob = 
					"SELECT"
					+" JOB_ODR_ALC_CD,"
					+" TO_CHAR(ALCD_QTY, 'FM999999999999999990.0999'),"
					+" TO_CHAR(ISSUEED_QTY, 'FM999999999999999990.0999') "
					+"FROM"
					+" T_JOB_ODR_ALC "
					+"WHERE"
					+" OD_NO = ?"
					+" AND ITEM_CD = ?"
					+" AND JOB_ODR_CD = ?"
					+" AND ALC_STOCK_TYP = ?"
					+" AND PLANT_CD = ? "
					+"FOR UPDATE NOWAIT";

				// 製番のレコードを検索
				selectStmt = _conn.getConn().prepareStatement(_selectJobOdrAlcJob);

				selectStmt.setString(1, struct.getOD_NO());
				selectStmt.setString(2, struct.getITEM_CD());
				selectStmt.setString(3, struct.getJOB_ODR_CD());
				selectStmt.setInt(4, IssueStruct.ALC_STOCK_TYP_JOB);
				selectStmt.setString(5, struct.getPLANT_CD());
			}

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			IssueStruct rtnStruct = new IssueStruct(struct);

			rtnStruct.setJOB_ODR_ALC_CD( getString(1, selectRslt) );
			rtnStruct.setALCD_QTY( getString(2, selectRslt) );
			rtnStruct.setISSUEED_QTY( getString(3, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * 出庫指示テーブルの読み込み
	 *
	 * @param  struct 出庫処理データクラス
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	public IssueStruct selectIssueInst(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		/** [出庫指示]行ロック用 SQL */
		String _selectIssueInst = 
			"SELECT"
			+" ISSUE_INST_CD "
			+"FROM"
			+" T_ISSUE_INST "
			+"WHERE"
			+" ISSUE_INST_CD = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectIssueInst);

			selectStmt.setString(1, struct.getISSUE_INST_CD());

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			IssueStruct rtnStruct = new IssueStruct(struct);

			rtnStruct.setISSUE_INST_CD( getString(1, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * 所要量テーブルの読み込み
	 *
	 * @param  struct 出庫処理データクラス
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	protected void selectOd(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		/** [所要量]行ロック用 SQL */
		String _selectOd = 
			 "SELECT "
			+" ODR_QTY,"
			+" JOB_ODR_CD,"
			+" JOB_ODR_DETAIL_NO "
			+"FROM"
			+" T_OD "
			+"WHERE"
			+" OD_NO = ? "
			+"FOR UPDATE NOWAIT";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectOd);

			selectStmt.setString(1, struct.getOD_NO());

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return;

			struct.setODR_QTY( getString(1, selectRslt) );
			struct.setJOB_ODR_CD_BY_T_OD( getString(2, selectRslt) );
			struct.setJOB_ODR_DETAIL_NO_BY_T_OD( getString(3, selectRslt) );

			return;

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
	 *		   SQLの発行に失敗した場合
	 */
	public int updateRcvIssue(IssueStruct struct) throws SQLException
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
			+" MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE"
			+" RCV_ISSUE_CTRL_CD = ?";

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateRcvIssue);

			updateStmt.setInt(1, IssueStruct.UPD_TYP_COMPLETED);
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
	 * 出庫指示テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	public int updateIssueInst(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		/** [T_ISSUE_INST]update用のSQL */
		//String cmpltFlg = selectIssueCmpltFlg(struct);
		String _updateIssueInst;
		_updateIssueInst = 
			 "UPDATE"
			+" T_ISSUE_INST "
			+"SET"
			+" TOTAL_ISSUE_QTY = TOTAL_ISSUE_QTY + TO_NUMBER(?),"
			+" ISSUE_CMPLT_DATE = TO_DATE(?),"
			+" ISSUE_CMPLT_FLG = ?,"
			+" UPDATED_BY = ?,"
			+" UPDATED_PRG_NM = ?,"
			+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
			+" MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE"
			+" ISSUE_INST_CD = ?";
	


		try {
			// 更新する入出庫数
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt = _conn.getConn().prepareStatement(_updateIssueInst);

			// 出庫済数に加算するため、正負を逆にする
			rcvIssueQty = Calculate.multiply(rcvIssueQty,"-1");

			updateStmt.setString(1, rcvIssueQty);			
			updateStmt.setString(2, struct.getRCV_ISSUE_DATE());
			updateStmt.setInt(3, struct.getRCV_ISSUE_CMPLT_FLG().intValue());
			updateStmt.setString(4, struct.getUPDATED_BY());
			updateStmt.setString(5, struct.getUPDATED_PRG_NM());
			updateStmt.setString(6, struct.getSYSDATE());
			updateStmt.setString(7, struct.getISSUE_INST_CD());
		

			return updateStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * 出庫指示テーブルの読み込み
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	public String selectIssueCmpltFlg(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;			// 結果
		String cmpltFlg = null;
		String _selectIssueInst = 
			 "SELECT "
			+"ISSUE_CMPLT_FLG "
			+"FROM "
			+"T_ISSUE_INST "
			+"WHERE "
			+"ISSUE_INST_CD = ?";

		try {

			selectStmt = _conn.getConn().prepareStatement(_selectIssueInst);

			selectStmt.setString(1, struct.getISSUE_INST_CD());

			selectRslt = selectStmt.executeQuery();
			
			if(selectRslt.next()){
				cmpltFlg = getString(1,selectRslt);
			}

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
		return cmpltFlg;
	}
	/**
	 * 製番引当テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	public int updateJobOdrAlc(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;
		ResultSet result = null;
		PreparedStatement preJobOdrAlc = null;

		// 製番品でない場合は処理しない
		if( struct.getJOB_ODR_CD_BY_T_OD() == null ) return 0;

		try {
			// 更新する出庫済数の算出
			String issueedQty = "0";

			if(struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_DEFAULT)
			{
				// 入出庫発生区分が 21:通常出庫 の場合

				if( struct.getJOB_ODR_CD_BY_T_OD().equals(struct.getJOB_ODR_CD()) &&
					struct.getJOB_ODR_DETAIL_NO_BY_T_OD().equals(struct.getJOB_ODR_DETAIL_NO()) ){
					// オーダデマンドと同一製番の場合

					IssueRemain issueRemain = new IssueRemain(_conn);
					String issueQty = Calculate.subtract(struct.getODR_QTY(),
													 (issueRemain.getIssuedQtyByOd(struct.getOD_NO())).toString());
					if( !(Calculate.compare(issueQty,Calculate.multiply(struct.getRCV_ISSUE_QTY(),"-1")) == -1) ){
						// 個別手配出庫可能数 ＜ [保管区別入出庫]."入出庫数" × －１ でない場合
						// [製番引当]は更新しない
						return 0;
					}

					// [製番引当]読込用SQL
					String sql =
						  "SELECT"
						+ " JOB_ODR_ALC_CD "
						+ "FROM"
						+ " T_JOB_ODR_ALC "
						+ "WHERE"
						+ " JOB_ODR_ALC_CD = ?";

					updateStmt = _conn.getConn().prepareStatement(sql);
					updateStmt.setString(1, struct.getJOB_ODR_ALC_CD());
					result = updateStmt.executeQuery();

					if( !result.next() ){
						// [製番引当]に該当の引当情報が存在しない場合[製番引当]は更新しない
						return 0;
					}

					// comp1 ⇒ [製番引当]."出庫済数" + (([保管区別入出庫]."入出庫数" × -1) － 個別手配出庫可能数)
					String comp1 = Calculate.add(struct.getISSUEED_QTY(),
								   Calculate.subtract(Calculate.multiply(struct.getRCV_ISSUE_QTY(),"-1"),
								   issueQty));

					// comp2 ⇒ [製番引当]."引当済数"
					String comp2 = struct.getALCD_QTY();

					// comp1 と comp2 の小さい法を出庫済数として[製番引当]を更新
					if( Calculate.compare(comp1, comp2) <= 0 ){
						issueedQty = comp1;
					} else {
						issueedQty = comp2;
					}

					// 出庫済数が - (マイナス)の場合、0に補正
					if( Calculate.compare(issueedQty, "0") < 0 ){
						issueedQty = "0";
					}

					/** [製番引当]更新用SQL */
					String _updateTJobOdrAlc = 
						 "UPDATE"
						+" T_JOB_ODR_ALC "
						+"SET"
						+" ISSUEED_QTY = TO_NUMBER(?),"
						+" UPDATED_BY = ?,"
						+" UPDATED_PRG_NM = ?,"
						+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
						+" MODIFY_COUNT = MODIFY_COUNT + 1 "
						+"WHERE"
						+" JOB_ODR_ALC_CD = ?";

						preJobOdrAlc = _conn.getConn().prepareStatement(_updateTJobOdrAlc);

						preJobOdrAlc.setString(1, issueedQty);
						preJobOdrAlc.setString(2, struct.getUPDATED_BY());
						preJobOdrAlc.setString(3, struct.getUPDATED_PRG_NM());
						preJobOdrAlc.setString(4, struct.getSYSDATE());
						preJobOdrAlc.setString(5, struct.getJOB_ODR_ALC_CD());

						return preJobOdrAlc.executeUpdate();
				} else {
					// オーダデマンドと別製番の場合
					issueedQty = Calculate.add(Calculate.multiply(struct.getRCV_ISSUE_QTY(), "-1"), struct.getISSUEED_QTY());
					String alcdQty = struct.getALCD_QTY();

					if(Calculate.compare(issueedQty, alcdQty) == 1){
						issueedQty = alcdQty;
					}
				}
			}else if(struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_CANCEL)
			{
				// 入出庫発生区分が 29:出庫取消 の場合
				if(Calculate.compare(struct.getISSUEED_QTY(), Calculate.multiply(struct.getRCV_ISSUE_QTY(),"-1")) >= 0)
				{
					issueedQty = Calculate.subtract(struct.getISSUEED_QTY(), struct.getRCV_ISSUE_QTY());
				}
			}

			// 出庫済数が - (マイナス)の場合、0に補正
			if(Calculate.compare(issueedQty, "0") < 0)
			{
				issueedQty = "0";
			}

			// 製番がNullのとき 品目のレコードを更新
			if(struct.getJOB_ODR_CD() == null)
			{

				/** [T_JOB_ODR_ALC](品目)update用のSQL */
				String _updateJobOdrAlcItem = 
					 "UPDATE"
					+" T_JOB_ODR_ALC "
					+"SET"
					+" ISSUEED_QTY = TO_NUMBER(?),"
					+" UPDATED_BY = ?,"
					+" UPDATED_PRG_NM = ?,"
					+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
					+" MODIFY_COUNT = MODIFY_COUNT + 1 "
					+"WHERE"
					+" OD_NO = ?"
					+" AND ALC_STOCK_TYP = ?"
					+" AND PLANT_CD = ?";

				preJobOdrAlc = _conn.getConn().prepareStatement(_updateJobOdrAlcItem);

				preJobOdrAlc.setString(1, issueedQty);
				preJobOdrAlc.setString(2, struct.getUPDATED_BY());
				preJobOdrAlc.setString(3, struct.getUPDATED_PRG_NM());
				preJobOdrAlc.setString(4, struct.getSYSDATE());
				preJobOdrAlc.setString(5, struct.getOD_NO());
				preJobOdrAlc.setInt(6, IssueStruct.ALC_STOCK_TYP_ITEM);
				preJobOdrAlc.setString(7, struct.getPLANT_CD());
			}else{
				/** [T_JOB_ODR_ALC](製番)update用のSQL */
				String _updateJobOdrAlcJob = 
					 "UPDATE"
					+" T_JOB_ODR_ALC "
					+"SET"
					+" ISSUEED_QTY = TO_NUMBER(?),"
					+" UPDATED_BY = ?,"
					+" UPDATED_PRG_NM = ?,"
					+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
					+" MODIFY_COUNT = MODIFY_COUNT + 1 "
					+"WHERE"
					+" OD_NO = ?"
					+" AND JOB_ODR_CD = ?"
					+" AND ALC_STOCK_TYP = ?"
					+" AND PLANT_CD = ?";

				// 製番のレコードを更新
				preJobOdrAlc = _conn.getConn().prepareStatement(_updateJobOdrAlcJob);

				preJobOdrAlc.setString(1, issueedQty);
				preJobOdrAlc.setString(2, struct.getUPDATED_BY());
				preJobOdrAlc.setString(3, struct.getUPDATED_PRG_NM());
				preJobOdrAlc.setString(4, struct.getSYSDATE());
				preJobOdrAlc.setString(5, struct.getOD_NO());
				preJobOdrAlc.setString(6, struct.getJOB_ODR_CD());
				preJobOdrAlc.setInt(7, IssueStruct.ALC_STOCK_TYP_JOB);
				preJobOdrAlc.setString(8, struct.getPLANT_CD());
			}

			return preJobOdrAlc.executeUpdate();

		} finally {
			this.closePreparedStatement(updateStmt);
			this.closeResultSet(result);
			this.closePreparedStatement(preJobOdrAlc);
		}
	}

	/**
	 * 所要量テーブルの更新
	 *
	 * @param  struct 出庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	public int updateOd(IssueStruct struct) throws SQLException
	{
		PreparedStatement updateStmt = null;

		/** [T_OD]update用のSQL */
		String _updateOd = 
			"UPDATE"
			+" T_OD "
			+"SET"
			+" DM_STS_TYP = ?,"
			+" TOTAL_ISSUE_QTY = TOTAL_ISSUE_QTY + TO_NUMBER(?),"
			+" ISSUE_CMPLT_DATE = TO_DATE(?),"
			+" UPDATED_BY = ?,"
			+" UPDATED_PRG_NM = ?,"
			+" UPDATED_DATE = TO_DATE( ? ,'YYYY/MM/DD HH24:MI:SS'),"
			+" MODIFY_COUNT = MODIFY_COUNT + 1 "
			+"WHERE"
			+" OD_NO = ?";

		try {
			// デマンド状態区分の判定
			int dmStsTyp = IssueStruct.DM_STS_TYP_DECIDE;
			// 入出庫区分の完了フラグが "完了" の場合
			if(struct.getRCV_ISSUE_CMPLT_FLG().intValue() == 1)
			{
				dmStsTyp = IssueStruct.DM_STS_TYP_COMPLETED;
			}

			// 更新する入出庫数
			String rcvIssueQty = struct.getRCV_ISSUE_QTY();

			updateStmt = _conn.getConn().prepareStatement(_updateOd);

			// 出庫済数に加算するため、正負を逆にする
			rcvIssueQty = Calculate.multiply(rcvIssueQty,"-1");

			updateStmt.setInt(1, dmStsTyp);
			updateStmt.setString(2, rcvIssueQty);
			updateStmt.setString(3, struct.getRCV_ISSUE_DATE());
			updateStmt.setString(4, struct.getUPDATED_BY());
			updateStmt.setString(5, struct.getUPDATED_PRG_NM());
			updateStmt.setString(6, struct.getSYSDATE());
			updateStmt.setString(7, struct.getOD_NO());

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
	 *		   SQLの発行に失敗した場合
	 */
	public IssueStruct selectSYSDATE(IssueStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		/** SYSDATE取得用のSQL */
		String _selectSysDate = 
			 "SELECT"
			+" TO_CHAR(SYSDATE,'YYYY/MM/DD HH24:MI:SS') "
			+"FROM"
			+" DUAL";

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectSysDate);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			IssueStruct rtnStruct = new IssueStruct(struct);

			rtnStruct.setSYSDATE( getString(1, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/** 出庫処理用コネクション */
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
				e.printStackTrace();
			} finally {
				statement = null;
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
				e.printStackTrace();
			} finally {
				resultset = null;
			}
		}
	}

}

