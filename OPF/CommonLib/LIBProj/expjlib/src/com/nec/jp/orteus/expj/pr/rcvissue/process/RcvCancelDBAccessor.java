/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvCancelDBAccessor.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

//package com.nec.jp.orteus.expj.stock;
package com.nec.jp.orteus.expj.pr.rcvissue.process;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.wa.DataObject;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.SystemInformation;

/**
 * <B>RcvCancelDBAccessor</B><BR>
 * 入庫処理用のDBアクセッサ<BR>
 * <BR>
 * @author  M.Hotokebuchi
 * @version 1.00
 *
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.4 $
 */
public class RcvCancelDBAccessor extends DataObject
{
	/** [T_RCV_ISSUE]読込用のSQL */
	private String _selelctRcvIssue = 
		"select "
		+"    T_RCV_ISSUE.RCV_ISSUE_CTRL_CD,"	//入出庫管理番号
		+"    T_RCV_ISSUE.RCV_ISSUE_TYP, "		//入出庫区分
		+"    T_RCV_ISSUE.RCV_ISSUE_GNR_TYP, "	//入出庫発生区分
		+"    TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_QTY, 'fm999999999999999990.0999'),	"//入出庫数
		+"    T_RCV_ISSUE.ITEM_CD, "			//品目番号
		+"    T_RCV_ISSUE.OD_NO, "				//ｵｰﾀﾞﾃﾞﾏﾝﾄﾞ番号
		+"    T_RCV_ISSUE.PUCH_ODR_CD, "		//発注番号
		+"    T_RCV_ISSUE.OPR_RSLT_CRCT_NO, "	//作業実績訂正回数
		+"    T_RCV_ISSUE.WORK_ODR_CD, "		//作業計画番号
		+"    T_RCV_ISSUE.PARTIAL_PRD_NO, "		//分作回数
		+"    T_RCV_ISSUE.PLANT_CD, "			//作業ｺｰﾄﾞ
		+"    T_RCV_ISSUE.WORK_IN_PROC_CD, "		//工場ｺｰﾄﾞ
		+"    T_RCV_ISSUE.UPDATED_PRG_NM, "		//更新プログラム名 -- 20031012追記
		+"    M_ITEM.MRP_ODR_TYP, "				//品目手配区分
		+"    T_RCV_ISSUE.LOT_NO "				//在庫ロット番号
		+"from T_RCV_ISSUE ,M_ITEM "
		+"where "
		+"    T_RCV_ISSUE.\"RCV_ISSUE_CTRL_CD\" = ? "
		+"    and T_RCV_ISSUE.ITEM_CD =M_ITEM.ITEM_CD ";

	/** 前回入庫実績検索用 SQL */
	private String _selectLst_Rslt = 
		"select "
		+"    T_RCV_ISSUE.ITEM_CD, "			//品目番号
		+"    T_RCV_ISSUE.WH_CD, "				//保管区ｺｰﾄﾞ
		+"    T_RCV_ISSUE.JOB_ODR_CD, "			//製番
		+"    T_RCV_ISSUE.JOB_ODR_DETAIL_NO, "	//製番枝番
		+"    T_RCV_ISSUE.PUCH_ODR_CD, "		//発注番号
		+"    T_RCV_ISSUE.ACPT_NO, "			//受入回数
		+"    T_RCV_ISSUE.WORK_ODR_CD, "		//作業計画番号
		+"    T_RCV_ISSUE.WORK_IN_PROC_CD, "	//作業ｺｰﾄﾞ
		+"    T_RCV_ISSUE.PARTIAL_PRD_NO, "		//分作回数
		+"    T_RCV_ISSUE.OPR_RSLT_CRCT_NO, "	//作業実績訂正回数
		+"    T_RCV_ISSUE.ISSUE_INST_CD, "		//出庫指示番号
		+"    TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_QTY, 'fm999999999999999990.0999'),"	//入出庫数
		+"    TO_CHAR(RCV_ISSUE_DATE, 'YYYY/MM/DD HH24:MI:SS'), "//入出庫年月日
		+"    T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG, "	//入出庫完了ﾌﾗｸﾞ
		+"    T_RCV_ISSUE.OD_NO, "				//ｵｰﾀﾞﾃﾞﾏﾝﾄﾞ番号
		+"    T_RCV_ISSUE.PLANT_CD, "			//工場ｺｰﾄﾞ
		+"    T_RCV_ISSUE.LOT_NO "				//在庫ロット番号
		+"from T_RCV_ISSUE "
		+"where "
		+"    T_RCV_ISSUE.RCV_ISSUE_TYP =\'1\' "
		+"and T_RCV_ISSUE.WORK_ODR_CD = ? "
		+"and T_RCV_ISSUE.WORK_IN_PROC_CD = ? "
		+"and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
		+"and T_RCV_ISSUE.OPR_RSLT_CRCT_NO =  "
		+"(select MAX(OPR_RSLT_CRCT_NO) from T_RCV_ISSUE "
		+"	where "
		+"    	T_RCV_ISSUE.RCV_ISSUE_TYP =\'1\' "
		+"		and T_RCV_ISSUE.WORK_ODR_CD = ? "
		+"		and T_RCV_ISSUE.WORK_IN_PROC_CD = ? "
		+"		and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
		+"		and T_RCV_ISSUE.OPR_RSLT_CRCT_NO < ? )  "
		+"and T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = \'11\' ";

	/** 前回入庫実績検索用 SQL */ //--20031013追記
	private String _selectLst_Rslt2 = 
		"select "
		+"    T_RCV_ISSUE.ITEM_CD, "			//品目番号
		+"    T_RCV_ISSUE.WH_CD, "				//保管区ｺｰﾄﾞ
		+"    T_RCV_ISSUE.JOB_ODR_CD, "			//製番
		+"    T_RCV_ISSUE.JOB_ODR_DETAIL_NO, "	//製番枝番
		+"    T_RCV_ISSUE.PUCH_ODR_CD, "		//発注番号
		+"    T_RCV_ISSUE.ACPT_NO, "			//受入回数
		+"    T_RCV_ISSUE.WORK_ODR_CD, "		//作業計画番号
		+"    T_RCV_ISSUE.WORK_IN_PROC_CD, "	//作業ｺｰﾄﾞ
		+"    T_RCV_ISSUE.PARTIAL_PRD_NO, "		//分作回数
		+"    T_RCV_ISSUE.OPR_RSLT_CRCT_NO, "	//作業実績訂正回数
		+"    T_RCV_ISSUE.ISSUE_INST_CD, "		//出庫指示番号
		+"    TO_CHAR(T_RCV_ISSUE.RCV_ISSUE_QTY, 'fm999999999999999990.0999'),"	//入出庫数
		+"    TO_CHAR(RCV_ISSUE_DATE, 'YYYY/MM/DD HH24:MI:SS'), "//入出庫年月日
		+"    T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG, "	//入出庫完了ﾌﾗｸﾞ
		+"    T_RCV_ISSUE.OD_NO, "				//ｵｰﾀﾞﾃﾞﾏﾝﾄﾞ番号
		+"    T_RCV_ISSUE.PLANT_CD, "			//工場ｺｰﾄﾞ
		+"    T_RCV_ISSUE.LOT_NO "				//在庫ロット番号
		+"from T_RCV_ISSUE "
		+"where "
		+"    T_RCV_ISSUE.RCV_ISSUE_TYP =\'1\' "
		+"and T_RCV_ISSUE.WORK_ODR_CD = ? "
		+"and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
		+"and T_RCV_ISSUE.OPR_RSLT_CRCT_NO =  "
		+"(select MAX(OPR_RSLT_CRCT_NO) from T_RCV_ISSUE "
		+"	where "
		+"    	T_RCV_ISSUE.RCV_ISSUE_TYP =\'1\' "
		+"		and T_RCV_ISSUE.WORK_ODR_CD = ? "
		+"		and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
		+"		and T_RCV_ISSUE.OPR_RSLT_CRCT_NO < ? )  "
		+"and T_RCV_ISSUE.RCV_ISSUE_GNR_TYP = \'11\' ";

	/** [T_RCV_ISSUE]insert用のSQL */
	private String _insertRcv_Issue = 
		"insert into T_RCV_ISSUE( "
		+"    T_RCV_ISSUE.RCV_ISSUE_CTRL_CD "	//入出庫管理番号
		+"   ,T_RCV_ISSUE.RCV_ISSUE_TYP "		//入出庫区分(1)
		+"   ,T_RCV_ISSUE.ITEM_CD "				//品目番号
		+"   ,T_RCV_ISSUE.WH_CD "				//保管区コード
		+"   ,T_RCV_ISSUE.JOB_ODR_CD "			//製番
		+"   ,T_RCV_ISSUE.JOB_ODR_DETAIL_NO "	//製番枝番(NUMBER)
		+"   ,T_RCV_ISSUE.PUCH_ODR_CD "			//発注番号
		+"   ,T_RCV_ISSUE.ACPT_NO "				//受入回数(NUMBER)
		+"   ,T_RCV_ISSUE.WORK_ODR_CD "			//作業計画番号
		+"   ,T_RCV_ISSUE.WORK_IN_PROC_CD "		//作業ｺｰﾄﾞ
		+"   ,T_RCV_ISSUE.PARTIAL_PRD_NO "		//分作回数(NUMBER)
		+"   ,T_RCV_ISSUE.OPR_RSLT_CRCT_NO "	//作業実績訂正回数(NUMBER)
		+"   ,T_RCV_ISSUE.ISSUE_INST_CD "		//出庫指示番号
		+"   ,T_RCV_ISSUE.RCV_ISSUE_QTY "		//入出庫数(NUMBER)
		+"   ,T_RCV_ISSUE.RCV_ISSUE_DATE 		"//入出庫年月日(DATE)
		+"   ,T_RCV_ISSUE.RCV_ISSUE_GNR_TYP "	//入出庫発生区分(19)
		+"   ,T_RCV_ISSUE.STOCK_UPD_TYP "		//在庫更新区分(1)
		+"   ,T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG "	//入出庫完了ﾌﾗｸﾞ
		+"   ,T_RCV_ISSUE.OD_NO "				//ｵｰﾀﾞﾃﾞﾏﾝﾄﾞ番号
		+"   ,T_RCV_ISSUE.PLANT_CD "			//工場ｺｰﾄﾞ
		+"   ,T_RCV_ISSUE.LOT_NO "				//在庫ロット番号
		+"   ,T_RCV_ISSUE.COMPANY_CD "			//会社ｺｰﾄﾞ
		+"   ,T_RCV_ISSUE.\"CREATED_BY\" "
		+"   ,T_RCV_ISSUE.\"CREATED_PRG_NM\" "
		+"   ,T_RCV_ISSUE.\"UPDATED_BY\" "
		+"   ,T_RCV_ISSUE.\"UPDATED_PRG_NM\") "
		+"values( ? , 1 , ? , ? , ? , TO_NUMBER(?) , ? ,TO_NUMBER(?) , ?, ? ,"
		+"		 TO_NUMBER(?),TO_NUMBER(?),?,TO_NUMBER(?)"
		+"		,TO_DATE(?, 'YYYY/MM/DD HH24:MI:SS'),19,1,TO_NUMBER(?),? ,? ,? ,?"
		+"		,? ,? ,? ,? ) ";

	/** SYSDATE取得用のSQL */
	private String _selectSysDate = 
		"select TO_CHAR(sysdate,'YYYY/MM/DD HH24:MI:SS') from DUAL ";

	/**
	 * コンストラクタ
	 */
	public RcvCancelDBAccessor(){}

	/**
	 * 指定のコネクションを持つオブジェクトを構築する
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public RcvCancelDBAccessor(IDbConnection connect){_conn = connect;}


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
	 * @return struct 入庫処理データクラス
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public RcvCancelStruct selectRcvIssue(String _rcvIssueCtrlCd) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		try {
			selectStmt = _conn.getConn().prepareStatement(_selelctRcvIssue);
			selectStmt.setString(1, _rcvIssueCtrlCd);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			RcvCancelStruct struct = new RcvCancelStruct();

			struct.setRCV_ISSUE_CTRL_CD( getString(1, selectRslt) );
			struct.setRCV_ISSUE_TYP( getString(2, selectRslt) );
			struct.setRCV_ISSUE_GNR_TYP( getString(3, selectRslt) );
			struct.setRCV_ISSUE_QTY( getString(4, selectRslt) );
			struct.setITEM_CD( getString(5, selectRslt) );
			struct.setOD_NO( getString(6, selectRslt) );
			struct.setPUCH_ODR_CD( getString(7, selectRslt) );
			struct.setOPR_RSLT_CRCT_NO( getString(8, selectRslt) );
			struct.setWORK_ODR_CD( getString(9, selectRslt) );
			struct.setPARTIAL_PRD_NO( getString(10, selectRslt) );
			struct.setPLANT_CD( getString(11, selectRslt) );
			struct.setWORK_IN_PROC_CD( getString(12, selectRslt) );
			struct.setUPDATED_PRG_NM( getString(13, selectRslt) );  //20031013追記
			struct.setMRP_ODR_TYP( getString(14, selectRslt) );
			struct.setLOT_NO( getString(15, selectRslt) );
//			struct.setMRP_ODR_TYP( getString(13, selectRslt) );
//			struct.setUPDATED_PRG_NM( getString(14, selectRslt) );  //20031013追記

			return struct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * 前月実績数の読み込み
	 *
	 * @param  struct 出庫処理データクラス
	 * @return struct 出庫処理データクラス
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public RcvCancelStruct selectLstRslt(RcvCancelStruct struct) throws SQLException
	{
		PreparedStatement whereStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		try {
			//20031013追記 --系列番号がnullの時の条件判断を追記
			if(struct.getWORK_IN_PROC_CD() != null && struct.getWORK_IN_PROC_CD().length() != 0){
				whereStmt = _conn.getConn().prepareStatement(_selectLst_Rslt);
			}else{
				whereStmt = _conn.getConn().prepareStatement(_selectLst_Rslt2);
			}

			int num = 1;
			whereStmt.setString(num++, struct.getWORK_ODR_CD());
			if(struct.getWORK_IN_PROC_CD() != null && struct.getWORK_IN_PROC_CD().length() != 0){
				whereStmt.setString(num++, struct.getWORK_IN_PROC_CD());
			}
			whereStmt.setString(num++, struct.getPARTIAL_PRD_NO());
			whereStmt.setString(num++, struct.getWORK_ODR_CD());
			if(struct.getWORK_IN_PROC_CD() != null && struct.getWORK_IN_PROC_CD().length() != 0){
				whereStmt.setString(num++, struct.getWORK_IN_PROC_CD());
			}
			whereStmt.setString(num++, struct.getPARTIAL_PRD_NO());
			whereStmt.setString(num++, struct.getOPR_RSLT_CRCT_NO());

			selectRslt = whereStmt.executeQuery();

//20031013削除			whereStmt = _conn.getConn().prepareStatement(_selectLst_Rslt);
//20031013削除			whereStmt.setString(1, struct.getWORK_ODR_CD());
//20031013削除			whereStmt.setString(2, struct.getWORK_IN_PROC_CD());
//20031013削除			whereStmt.setString(3, struct.getPARTIAL_PRD_NO());
//20031013削除			whereStmt.setString(4, struct.getWORK_ODR_CD());
//20031013削除			whereStmt.setString(5, struct.getWORK_IN_PROC_CD());
//20031013削除			whereStmt.setString(6, struct.getPARTIAL_PRD_NO());
//20031013削除			whereStmt.setString(7, struct.getOPR_RSLT_CRCT_NO());
//20031013削除			selectRslt = whereStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

			RcvCancelStruct struct2 = new RcvCancelStruct();

			struct2.setITEM_CD( getString(1, selectRslt) );
			struct2.setWH_CD( getString(2, selectRslt) );
			struct2.setJOB_ODR_CD( getString(3, selectRslt) );
			struct2.setJOB_ODR_DETAIL_NO( getString(4, selectRslt) );
			struct2.setPUCH_ODR_CD( getString(5, selectRslt) );
			struct2.setACPT_NO( getString(6, selectRslt) );
			struct2.setWORK_ODR_CD( getString(7, selectRslt) );
			struct2.setWORK_IN_PROC_CD( getString(8, selectRslt) );
			struct2.setPARTIAL_PRD_NO( getString(9, selectRslt) );
			struct2.setOPR_RSLT_CRCT_NO( getString(10, selectRslt) );
			struct2.setISSUE_INST_CD( getString(11, selectRslt) );
			struct2.setRCV_ISSUE_QTY( getString(12, selectRslt) );
			struct2.setRCV_ISSUE_DATE( getString(13, selectRslt) );
			struct2.setRCV_ISSUE_CMPLT_FLG( getString(14, selectRslt) );
			struct2.setOD_NO( getString(15, selectRslt) );
			struct2.setPLANT_CD( getString(16, selectRslt) );
			struct2.setLOT_NO( getString(17, selectRslt) );

			return struct2;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(whereStmt);
		}
	}

	/**
	 * 保管区別入出庫テーブルの追加
	 *
	 * @param  struct 入庫処理データクラス
	 * @return 更新した件数を返す
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 * @throws FoundationException 
	 */
	public int insertRcvIssue(RcvCancelStruct struct) throws SQLException, FoundationException
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertRcv_Issue);

			insertStmt.setString(1, struct.getRCV_ISSUE_CTRL_CD());
			insertStmt.setString(2, struct.getITEM_CD());
			insertStmt.setString(3, struct.getWH_CD());
			insertStmt.setString(4, struct.getJOB_ODR_CD());
			insertStmt.setString(5, struct.getJOB_ODR_DETAIL_NO());
			insertStmt.setString(6, struct.getPUCH_ODR_CD());
			insertStmt.setString(7, struct.getACPT_NO());
			insertStmt.setString(8, struct.getWORK_ODR_CD());
			insertStmt.setString(9, struct.getWORK_IN_PROC_CD());
			insertStmt.setString(10, struct.getPARTIAL_PRD_NO());
			insertStmt.setString(11, struct.getOPR_RSLT_CRCT_NO());
			insertStmt.setString(12, struct.getISSUE_INST_CD());
			insertStmt.setString(13, struct.getRCV_ISSUE_QTY());
			insertStmt.setString(14, struct.getRCV_ISSUE_DATE());
			insertStmt.setString(15, struct.getRCV_ISSUE_CMPLT_FLG());
			insertStmt.setString(16, struct.getOD_NO());
			insertStmt.setString(17, struct.getPLANT_CD());
			insertStmt.setString(18, struct.getLOT_NO());
			insertStmt.setString(19, SystemInformation.getSysMyCompanyCd());
			insertStmt.setString(20, struct.getUPDATED_BY());
			insertStmt.setString(21, struct.getUPDATED_PRG_NM());
			insertStmt.setString(22, struct.getUPDATED_BY());
			insertStmt.setString(23, struct.getUPDATED_PRG_NM());

			return insertStmt.executeUpdate();

		} finally {
			this.closePreparedStatement(insertStmt);
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
	public RcvCancelStruct selectSYSDATE(RcvCancelStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// 結果

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectSysDate);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if(selectRslt.next()==false) return null;

//			RcvCancelStruct rtnStruct = new RcvCancelStruct(struct);
			RcvCancelStruct rtnStruct = new RcvCancelStruct();

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

