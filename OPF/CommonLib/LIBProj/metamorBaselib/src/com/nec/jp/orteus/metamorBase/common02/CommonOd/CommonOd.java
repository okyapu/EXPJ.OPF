/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common02/CommonOd/CommonOd.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

//package com.nec.jp.orteus.expj.mrp;
package com.nec.jp.orteus.metamorBase.common02.CommonOd;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * <pre>
 * 所要量の共通処理を行う
 *	 - 所要量処理区分変更				  changeMrpTypToDelete
 *	 - オーダデマンド情報更新(計画変更用) changeOdInfo
 *	 - オーダデマンド情報追加			  addOdInfo
 *	 - オーダ情報更新/完了用			  changeOrderForComplete
 *	 - オーダ情報更新/完了解除用		  changeOrderForCancel
 *	 - デマンド情報更新/完了用			  changeDemandForComplete
 *	 - デマンド情報更新/完了解除用		  changeDemandForCancel
 *	 - オーダ情報更新/入庫用			  updateOrderForReceiveOld
 *	 - デマンド情報更新/出庫用			  updateDemandForIssue
 *
 * ・EXPLANNER(VB版)と同じ仕様で作成してあります
 * ・Javaのバージョン 1.4.1 でコンパイルしています。1.4 以上でないと動作しません
 * ・データベースへ更新を行っていますが、トランザクションは制御していません。呼び出しもとのプログラムで制御してください。
 * ・データベースコネクション情報(IDbConnection)はコンストラクタで渡してください。
 *
 * このクラス内部からは、SQLExceptionと、ApsComExceptionが発生する可能性があります。
 * ApsComExceptionのエラー番号とエラーメッセージは以下の通りです。(番号の先頭に'AC'という文字が付加されます)
 *
 *	50031, 発注番号が未入力です
 *	50040, 作業計画番号が未入力です
 *	50261, 受入完了日が未入力です
 *	50304, 仕掛完了日が未入力です
 *	50416, 比例分ロットサイズが未入力です
 *	50417, 製品構成比例分ロットサイズが未入力です
 *	50502, カレンダ明細データが存在しません
 *	50509, 品目データが存在しません
 *	50553, オーダデマンド番号採番データが存在しません
 *	50700, 対象データが存在しません
 *	50802, 既に他者によって更新されています
 * </pre>
 *
 * @author $Author: geng-jia $
 * @version $Revision: 1.12 $ $Date: 2015/07/10 06:41:05 $
 */

public class CommonOd {

	private IDbConnection _iconn;				 // トランザクションコネクション情報
	private Connection _conn;					 // コネクション情報
	private String _plantCd;					 // 工場コード
	private UserInfo _userInfo; 				 // 利用者管理情報(インナークラス)
	private Log _log;							 // ログ情報(インナークラス)
	private int _CmpltFlg;                    // 製番引当更新用フラグ

	/**
	 * コンストラクタ
	 * newするときには下記のパラメータを送る。工場コード,ユーザID,業務名は別途setterで設定し直すことも可能
	 *
	 * @param conn コネクション情報
	 * @param plantCd 工場コード
	 * @param userId ユーザID
	 * @param businessName 業務名
	 */
	public CommonOd(IDbConnection conn, String plantCd, String userId, String businessName) {

		_iconn = conn;
		_conn = _iconn.getConn();
		_plantCd = plantCd;
		_userInfo = new UserInfo(userId,businessName);

		// ログ用部品の初期化を行う
		String packageName = this.getClass().getName();
		packageName = packageName.substring(0,packageName.lastIndexOf("."));
		_log = new Log(packageName,_iconn); 										// 2003/08/11
		// [製番引当]更新用フラグ
		_CmpltFlg = 9;
	}
	// setter
	public void setPlantCd(String plantCd) {
		this._plantCd = plantCd;
	}
	public void setUserId(String userId) {
		_userInfo.userId = userId;
	}
	public void setBusinessName(String businessName) {
		_userInfo.businessName = businessName;
	}

	/**
	 * オーダ情報更新(入庫処理用)
	 * 引数をもとにオーダ情報の更新処理を行う。(1.1.1.1の処理)
	 *
	 * @param odNo オーダデマンド番号
	 * @param rcvQty 入庫数量
	 * @param modifyCount 読込み時の更新数(チェックしない場合はマイナス値を設定)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void updateOrderForReceive(String odNo, double rcvQty, long modifyCount)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();
			String sql;

			// 更新数チェック
			this.checkModifyCount(odNo,modifyCount);

			// 入庫完了日の計算
			Date rcvCmpltDate = getRcvCmpltDate(odNo);

			// << 所要量の更新 >>
			if ( rcvCmpltDate != null ) {

				sql = "update T_OD set"
					+ " RCV_CMPLT_DATE = ?" 							  // 入庫完了日
					+ ",ODR_STS_TYP = 9"								  // オーダ状態区分=9:完了
					+ ",TOTAL_RCV_QTY = TOTAL_RCV_QTY + " + rcvQty		  // 入庫累計数
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setDate(1, new java.sql.Date(rcvCmpltDate.getTime()));
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);

				// < 製番計画の更新 >
				// 更新された[所要量]が製番の最上位品目だった場合、
				// [製番計画]."製番状態区分"を'9:完了'に更新
				_CmpltFlg = 1;
				this.updateJobOdr(odNo, 9);

			} else {

				sql = "update T_OD set"
					+ " RCV_CMPLT_DATE = null"							  // 入庫完了日
					+ ",ODR_STS_TYP = 2"								  // オーダ状態区分=2:確定(発効)
					+ ",TOTAL_RCV_QTY = TOTAL_RCV_QTY + " + rcvQty		  // 入庫累計数
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);
			}

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	/**
	 * 入庫完了日の計算
	 * 入庫完了日 = [品目別仕掛]."作業完了日"と[発注残]."検査完了日"の遅い方
	 * 1.1.1.1 および、1.1.3.1 で利用
	 *
	 * @param odNo オーダデマンド番号
	 * @return 入庫完了日 or null
	 * @throws SQLException
	 */
	private Date getRcvCmpltDate(String odNo)
			throws SQLException {

		// 2003/09/16 メソッドの内部の動きで、入庫完了日の取得が不正になる場合があったので
		// 処理ロジックを見直し、修正しました。(SQL文の修正はありません)

		PreparedStatement ps = null;
		Date rcvCmpltDate = null;
		ResultSet rsWorkInProcByItem = null;
		ResultSet rsRlsdPuchOdr = null;
		try {
			_log.methodStart();
			String sql;

			rcvCmpltDate = null;									  // 入庫完了日
			// << 品目別仕掛の検索 >>
			sql = "select * from T_WORK_IN_PROC_BY_ITEM "
				+ "where OD_NO = ? "
				+ "order by WORK_CMPLT_DATE desc";						  // 作業完了日の降順
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			rsWorkInProcByItem = ps.executeQuery();

			// 品目別仕掛の検索データの中から品目別作業状態区分=9(完了)があれば、
			// 入庫完了日の候補として最遅作業完了日を保持する。
			Timestamp workDate = null;
			boolean odrStsCheckFlg = true;
			while ( rsWorkInProcByItem.next() ) {
				if ( workDate == null ) {
					workDate = rsWorkInProcByItem.getTimestamp("WORK_CMPLT_DATE");
				}
				if ( rsWorkInProcByItem.getInt("WORK_STS_TYP") != 9 ) {
					odrStsCheckFlg = false;
					break;
				}
			}
			rsWorkInProcByItem.close();
			ps.close();
			if (odrStsCheckFlg) {
				rcvCmpltDate = workDate;
			}else{
                return null;
            }

			// << 発注残の検索 >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "and WORK_ODR_CD is null "							  // 作業計画番号=null
				+ "order by INSPC_CMPLT_DATE desc"; 					  // 検査完了日の降順
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			rsRlsdPuchOdr = ps.executeQuery();

			// 発注残の検索データの中から検査完了フラグ=1(完了)があれば、
			// 入庫完了日の候補として最遅検査完了日を保持する。
			Timestamp inspcDate = null;
			boolean existRlsdPuchOdr = false;
			while ( rsRlsdPuchOdr.next() ) {
				if ( inspcDate == null ) {
					inspcDate = rsRlsdPuchOdr.getTimestamp("INSPC_CMPLT_DATE");
				}
				if ( rsRlsdPuchOdr.getInt("INSPC_CMPLT_FLG") != 1 ) {
					odrStsCheckFlg = false;
					break;
				}
			}
			rsRlsdPuchOdr.close();
			ps.close();

			// 入庫完了日 = [品目別仕掛]."作業完了日"と[発注残]."検査完了日"の遅い方
			if (odrStsCheckFlg) {
				if ( rcvCmpltDate == null ) {
					rcvCmpltDate = inspcDate;
				} else {
					if ( inspcDate != null ) {			   // 2003/10/14 update
						rcvCmpltDate = inspcDate.after(workDate) ? inspcDate : workDate;
					}
				}
			}else{
                return null;
            }

/****
			// << 品目別仕掛の検索 >>
			sql = "select * from T_WORK_IN_PROC_BY_ITEM "
				+ "where OD_NO = ? "
				+ "order by WORK_CMPLT_DATE desc";						  // 作業完了日の降順
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			ResultSet rsWorkInProcByItem = ps.executeQuery();

			// 品目別仕掛の検索データの中から品目別作業状態区分=9(完了)があれば、
			// 入庫完了日の候補として最遅作業完了日を保持する。
			Timestamp workDate = null;
			boolean existWorkInProcByItem = false;
			while ( rsWorkInProcByItem.next() ) {
				if ( workDate == null ) {
					workDate = rsWorkInProcByItem.getTimestamp("WORK_CMPLT_DATE");
				}
				if ( rsWorkInProcByItem.getInt("WORK_STS_TYP") == 9 ) {
					existWorkInProcByItem = true;
					break;
				}
			}
			rsWorkInProcByItem.close();
			ps.close();

			// << 発注残の検索 >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "and WORK_ODR_CD is null "							  // 作業計画番号=null
				+ "order by INSPC_CMPLT_DATE desc"; 					  // 検査完了日の降順
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			ResultSet rsRlsdPuchOdr = ps.executeQuery();

			// 発注算の検索データの中から検査完了フラグ=1(完了)があれば、
			// 入庫完了日の候補として最遅検査完了日を保持する。
			Timestamp inspcDate = null;
			boolean existRlsdPuchOdr = false;
			while ( rsRlsdPuchOdr.next() ) {
				if ( inspcDate == null ) {
					inspcDate = rsRlsdPuchOdr.getTimestamp("INSPC_CMPLT_DATE");
				}
				if ( rsRlsdPuchOdr.getInt("INSPC_CMPLT_FLG") == 1 ) {
					existRlsdPuchOdr = true;
					break;
				}
			}
			rsRlsdPuchOdr.close();
			ps.close();

			// 入庫完了日 = [品目別仕掛]."作業完了日"と[発注残]."検査完了日"の遅い方
			if (existWorkInProcByItem && existRlsdPuchOdr) {
				rcvCmpltDate = inspcDate.after(workDate) ? inspcDate : workDate;
			}

****/
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsWorkInProcByItem != null) {
				try {
					rsWorkInProcByItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsWorkInProcByItem = null;
			}
			if (rsRlsdPuchOdr != null) {
				try {
					rsRlsdPuchOdr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsRlsdPuchOdr = null;
			}
		}
		return rcvCmpltDate;
	}

	/**
	 * デマンド情報更新(出庫処理用)
	 * 引数をもとにデマンド情報の更新処理を行う。(1.1.1.2の処理)
	 *
	 * @param workOdrCd 作業計画番号
	 * @param puchOdrCd 発注番号
	 * @param odNo オーダデマンド番号
	 * @param issueQty 出庫数量
	 * @param modifyCount 読込み時の更新数(チェックしない場合はマイナス値を設定)
	 * @throws SQLException
	 */
	public void updateDemandForIssue(String workOdrCd, String puchOdrCd,
									 String odNo, double issueQty, long modifyCount )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			_log.methodStart();
			String sql;

			// 更新数チェック
			this.checkModifyCount(odNo,modifyCount);

			// << 上位オーダデマンド番号の取得 >>
			if ( workOdrCd == null || workOdrCd.equals("") ) {
				if ( puchOdrCd == null || puchOdrCd.equals("") ) {
					throw new ApsComException(50040,"(SBM0980)作業計画番号が未入力です");
				} else {
					// 発注算の検索
					sql = "select * from T_RLSD_PUCH_ODR where PUCH_ODR_CD = ?";
					ps = _conn.prepareStatement(sql);
					ps.setString(1, puchOdrCd);
				}
			} else {
				// 品目別仕掛の検索
				sql = "select * from T_WORK_IN_PROC_BY_ITEM where WORK_ODR_CD = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, workOdrCd);
			}
			String parentOdNo = "";
			rs = ps.executeQuery();
			if ( rs.next() ) {
				parentOdNo = rs.getString("OD_NO");
			}
			rs.close();
			ps.close();

			// << 出庫指示状態のチェック >>
			boolean issueInstFlg = true;
			// 品目別仕掛のチェック
			sql = "select count(*) from T_WORK_IN_PROC_BY_ITEM "
				+ "where OD_NO = ? "
				+ "and ( WORK_STS_TYP = 2 or WORK_STS_TYP = 9 )";		  // 品目別作業状態区分=2:指示済み/9:完了
			ps = _conn.prepareStatement(sql);
			ps.setString(1, parentOdNo);
			rs = ps.executeQuery();
			rs.next();
			if	( rs.getInt(1) != 0 ) {
				issueInstFlg = false;
			}
			rs.close();
			ps.close();

			// 発注残のチェック
			sql = "select count(*) from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "and ( PUCH_ODR_STS_TYP = 2 or PUCH_ODR_STS_TYP = 9 )"; // 発注状態区分=2:指示済み/9:受入完了
			ps = _conn.prepareStatement(sql);
			ps.setString(1, parentOdNo);
			rs = ps.executeQuery();
			rs.next();
			if	( rs.getInt(1) != 0 ) {
				issueInstFlg = false;
			}
			rs.close();
			ps.close();

			// << 出庫完了状態のチェック,再遅出庫完了日の算出 >>
			boolean issueCmpltFlg = true;
			Date issueCmpltDate = null;

			sql = "select * from T_ISSUE_INST "
				+ "where OD_NO = ? "
				+ "order by ISSUE_CMPLT_DATE desc"; 					  // 出庫完了日
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			rs = ps.executeQuery();

			while ( rs.next() ) {
				if ( issueCmpltDate == null ) {
					issueCmpltDate = rs.getTimestamp("ISSUE_CMPLT_DATE");
				}
				if ( rs.getInt("ISSUE_CMPLT_FLG") != 1 ) {				  // 出庫完了フラグ
					issueCmpltFlg = false;
					break;
				}
			}
			rs.close();
			ps.close();

			// << 所要量の更新 >>
			if ( issueInstFlg && issueCmpltFlg ) {

				sql = "update T_OD set"
					+ " ISSUE_CMPLT_DATE = ?"							  // 出庫完了日
					+ ",DM_STS_TYP = 9" 								  // デマンド状態区分=9:完了
					+ ",TOTAL_ISSUE_QTY = TOTAL_ISSUE_QTY - " + issueQty  // 出庫累計数
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setDate(1, new java.sql.Date(issueCmpltDate.getTime()));
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, odNo);
				ps.execute();
				//this.changeCommon(odNo);

			} else {

				sql = "update T_OD set"
					+" ISSUE_CMPLT_DATE = null" 						  // 出庫完了日
					+",DM_STS_TYP = 2"									  // オーダ状態区分=2:確定(未発効)
					+",TOTAL_ISSUE_QTY = TOTAL_ISSUE_QTY - " + issueQty   // 出庫累計数
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, odNo);
				ps.execute();

			}
			ps.close();


			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
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
	//==========================================================================
	/**
	 * オーダデマンド情報追加
	 * 引数をもとに所要量のオーダレコードおよび下位デマンドレコードの追加を行い、
	 * 追加したオーダレコードのオーダデマンド番号を返す。
	 *
	 * @param itemCd 品目番号
	 * @param prdDueDate 製造納期/発注納期
	 * @param prdStartDate 製造着手日/発注予定日
	 * @param odrQty オーダ数量(作業指示数/発注数)
	 * @param odGnrTyp 所要量発生処理区分(工程管理は3:作業計画から登録を指定/購買管理は2:発注計画から登録を指定)
	 * @return 追加したオーダレコードのオーダデマンド番号
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public String addOdInfo(String itemCd, Date prdDueDate, Date prdStartDate,
							double odrQty, int odGnrTyp )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		String odNo = null;
		ResultSet rsItem = null;
		try {
			_log.methodStart();

			// 手配着手日の計算
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, itemCd);
			rsItem = ps.executeQuery();
			Date odrStartDate = null;
			if ( rsItem.next() ) {
				int difference = rsItem.getInt("ODR_LT");				  // 差分＝ 手配リードタイム
				odrStartDate = this.calcOdrStartDate(difference,prdStartDate);
			}
			rsItem.close();
			ps.close();

			// << 所要量へオーダー情報を追加する >>
			odNo = this.getNewOdNo();							  // オーダデマンド番号採番
			this.insertOd(odNo,itemCd,odrStartDate,prdDueDate,prdStartDate,odrQty,odGnrTyp);

			// << 下位品目のデマンド情報の追加 >>	2003/09/02 update
			//this.makeUnderDemand(itemCd,odNo,prdDueDate,odrStartDate,odrQty,odGnrTyp,2);
			this.makeUnderDemand(itemCd,odNo,prdDueDate,odrStartDate,odrQty,odGnrTyp,1);

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsItem != null) {
				try {
					rsItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsItem = null;
			}
		}
		return odNo;
	}

	/**
	 * 所要量の追加
	 * (1.1.2.1のメイン処理)
	 *
	 * @param odNo 採番されたオーダデマンド番号
	 * @param itemCd 品目番号
	 * @param odrStartDate 手配着手日(稼働日ベースで計算されたもの)
	 * @param prdDueDate 製造納期/発注納期
	 * @param prdStartDate 製造着手日/発注予定日
	 * @param odrQty オーダ数量(作業指示数/発注数)
	 * @param odGnrTyp 所要量発生処理区分(工程管理は3:作業計画から登録を指定/購買管理は2:発注計画から登録を指定)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void insertOd(String odNo, String itemCd, Date odrStartDate,
						  Date prdDueDate,Date prdStartDate, double odrQty, int odGnrTyp )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rsItem = null;
		PreparedStatement stmt = null;
		try {
			_log.methodStart();

			// << 品目の検索 >>
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, itemCd);
			rsItem = ps.executeQuery();

			if ( rsItem.next() ) {

				java.sql.Date sodrStartDate = new java.sql.Date(odrStartDate.getTime());
				java.sql.Date sprdDueDate = new java.sql.Date(prdDueDate.getTime());
				java.sql.Date sprdStartDate = new java.sql.Date(prdStartDate.getTime());

				sql = "insert into T_OD ( "
					+ " OD_NO"					 // オーダデマンド番号
					+ ",ALC_GRP_CD" 			 // 引当グループコード
					+ ",PLANT_CD"				 // 工場コード
					+ ",ITEM_CD"				 // 品目番号
					+ ",PS_EDITION" 			 // 所要量品目構成版数
					+ ",JOB_ODR_CD" 			 // 製番
					+ ",JOB_ODR_DETAIL_NO"		 // 製番枝番
					+ ",JOB_ODR_CANCEL_NO"		 // 製番取消発生番号
					+ ",ODR_STS_TYP"			 // オーダ状態区分
					+ ",DM_STS_TYP" 			 // デマンド状態区分
					+ ",OD_TYP" 				 // オーダデマンド区分
					+ ",DUE_DATE"				 // 要求納期
					+ ",ODR_START_DATE" 		 // 手配着手日
					+ ",PRD_DUE_DATE"			 // 製造納期
					+ ",PRD_START_DATE" 		 // 製造着手日
					+ ",DM_QTY" 				 // デマンド数
					+ ",ODR_QTY"				 // オーダ数
					+ ",MRP_ODR_TYP"			 // 品目手配区分
					+ ",OUTSIDE_TYP"			 // 所要量内外作区分
					+ ",ISSUE_TYP"				 // 所要量出庫区分
					+ ",ODR_LT" 				 // 手配リードタイム
					+ ",FIXED_LT"				 // 固定分リードタイム
					+ ",PROP_LT"				 // 比例分リードタイム
					+ ",SAFETY_LT"				 // 安全日数
					+ ",ISSUE_LT"				 // 払出リードタイム
					+ ",PROP_LOT_SIZE"			 // 比例分ロットサイズ
					+ ",PS_LT_FLG"				 // 製品構成リードタイム使用フラグ
					+ ",PS_FIXED_LT"			 // 製品構成固定分リードタイム
					+ ",PS_PROP_LT" 			 // 製品構成比例分リードタイム
					+ ",PS_PROP_LOT_SIZE"		 // 製品構成比例分ロットサイズ
					+ ",PS_UNIT_QTY"			 // 製品構成単位数	  ★★
					+ ",PS_UNIT_NUMERATOR"		 // 製品構成単位数分子 ★★
					+ ",PS_UNIT_DENOMINATOR"	 // 製品構成単位数分母 ★★
					+ ",TOTAL_RCV_QTY"			 // 入庫累計数
					+ ",RCV_CMPLT_DATE" 		 // 入庫完了日
					+ ",TOTAL_ISSUE_INST_QTY"	 // 出庫指示累計数
					+ ",TOTAL_ISSUE_QTY"		 // 出庫累計数
					+ ",ISSUE_CMPLT_DATE"		 // 出庫完了日
					+ ",OD_GNR_TYP" 			 // 所要量発生処理区分
					+ ",OD_LEVEL_NO"			 // 所要量レベル番号
					+ ",PARENT_OD_NO"			 // 親オーダデマンド番号
					+ ",ITEM_SPOIL" 			 // 所要量品目仕損率
					+ ",PS_SPOIL"				 // 所要量構成仕損率
					+ ",CONS_TYP"				 // 構成支給区分
					+ ",EFF_PHASE_IN_DATE"		 // 所要量有効開始日
					+ ",EFF_PHASE_OUT_DATE" 	 // 所要量有効終了日
					+ ",MRP_TYP"				 // 所要量処理区分
					+ ",EXTERNAL_DM_FLG"		 // 外部デマンドフラグ
					+ ",ODR_RELEASE_FLG"		 // オーダ発効済フラグ
					+ ",CREATED_BY" 			 // 作成者
					+ ",CREATED_PRG_NM" 		 // 作成プログラム名
					+ ",UPDATED_BY" 			 // 更新者
					+ ",UPDATED_PRG_NM" 		 // 更新プログラム名
					+ ",MODIFY_COUNT"			 // 更新数

					+ ") values ( " 

					+ "?"						 // オーダデマンド番号
					+ ",null"					 // 引当グループコード
					+ ",?" 						 // 工場コード
					+ ",?"	 					 // 品目番号
					+ ",null"			    	 // 所要量品目構成版数
					+ ",null"					 // 製番
					+ ",0"						 // 製番枝番
					+ ",0"						 // 製番取消発生番号
					+ ",2"						 // オーダ状態区分
					+ ",0"						 // デマンド状態区分
					+ ",2"						 // オーダデマンド区分
					+ ",null"					 // 要求納期
					+ ",?"			 			 // 手配着手日
					+ ",?"						 // 製造納期
					+ ",?"						 // 製造着手日
					+ ",0"						 // デマンド数
					+ ",?" 						 // オーダ数
					+ ",?" 		 				 // 品目手配区分
					+ ",?" 						 // 所要量内外作区分
					+ ",?" 						 // 所要量出庫区分
					+ ",?"						 // 手配リードタイム
					+ ",?" 		 			   	 // 固定分リードタイム
					+ ",?" 						 // 比例分リードタイム
					+ ",?" 						 // 安全日数
					+ ",?" 						 // 払出リードタイム
					+ ",?" 	 				   	 // 比例分ロットサイズ
					+ ",0"						 // 製品構成リードタイム使用フラグ
					+ ",0"						 // 製品構成固定分リードタイム
					+ ",0"						 // 製品構成比例分リードタイム
					+ ",0"						 // 製品構成比例分ロットサイズ
					+ ",0"						 // 製品構成単位数	  ★★
					+ ",0"						 // 製品構成単位数分子 ★★
					+ ",1"						 // 製品構成単位数分母 ★★
					+ ",0"						 // 入庫累計数
					+ ",null"					 // 入庫完了日
					+ ",0"						 // 出庫指示累計数
					+ ",0"						 // 出庫累計数
					+ ",null"					 // 出庫完了日
					+ ",?" 						 // 所要量発生処理区分
					+ ",1"						 // 所要量レベル番号
					+ ",null"					 // 親オーダデマンド番号
					+ ",?" 	 				   	 // 所要量品目仕損率
					+ ",0"						 // 所要量構成仕損率
					+ ",0"						 // 構成支給区分
					+ ",null"					 // 所要量有効開始日
					+ ",null"					 // 所要量有効終了日
					+ ",9"						 // 所要量処理区分
					+ ",0"						 // 外部デマンドフラグ
					+ ",1"						 // オーダ発効済フラグ
					+ ",?"						 // 作成者
					+ ",?"						 // 作成プログラム名
					+ ",?"						 // 更新者
					+ ",?"						 // 更新プログラム名
					+ ",0"						 // 更新数
					+ ")";

				stmt = _conn.prepareStatement(sql);
				stmt.setString(1, odNo);		
				stmt.setString(2, _plantCd);
				stmt.setString(3,  rsItem.getString("ITEM_CD") );
				stmt.setString(4, "{d '" + sodrStartDate + "'}");
				stmt.setString(5, "{d '" + sprdDueDate + "'}");
				stmt.setString(6, "{d '" + sprdStartDate + "'}");
				stmt.setDouble(7, odrQty);
				stmt.setInt(8, rsItem.getInt("MRP_ODR_TYP"));
				stmt.setInt(9, rsItem.getInt("OUTSIDE_TYP"));
				stmt.setInt(10, rsItem.getInt("ISSUE_TYP")	);
				stmt.setInt(11, rsItem.getInt("ODR_LT") );
				stmt.setInt(12, rsItem.getInt("FIXED_LT"));
				stmt.setInt(13, rsItem.getInt("PROP_LT")	);
				stmt.setInt(14, rsItem.getInt("SAFETY_LT"));
				stmt.setInt(15, rsItem.getInt("ISSUE_LT")	);
				stmt.setDouble(16, rsItem.getDouble("PROP_LOT_SIZE"));		
				stmt.setInt(17, odGnrTyp);		
				stmt.setDouble(18, rsItem.getDouble("ITEM_SPOIL")	);		
				stmt.setString(19, _userInfo.getUserId());		
				stmt.setString(20, _userInfo.getBusinessName());		
				stmt.setString(21,  _userInfo.getUserId());		
				stmt.setString(22, _userInfo.getBusinessName());	
				stmt.execute();					

			
				stmt.close();
				rsItem.close();
				ps.close();

				//this.changeCommon(odNo);

			} else {
				rsItem.close();
				ps.close();
				throw new ApsComException(50509,"(SBM0981)品目データが存在しません");
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsItem != null) {
				try {
					rsItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsItem = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				stmt = null;
			}
		}
	}
	/**
	 * 所要量の追加(下位デマンド情報の追加)
	 * (1.1.2.2のメイン処理) 実際のODへの更新は、insertOdで行う。
	 *
	 * @param itemCd 品目番号
	 * @param parentOdNo 親オーダデマンド番号
	 * @param prdDueDate 製造納期
	 * @param odrStartDate 手配着手日
	 * @param prdStartDate 製造着手日
	 * @param odrQty オーダ数量(作業指示数/発注数)
	 * @param odGnrTyp 所要量発生処理区分(工程管理は3:作業計画から登録を指定/購買管理は2:発注計画から登録を指定)
	 * @param odLevelNo 所要量レベル番号
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void makeUnderDemand(String itemCd, String parentOdNo,Date prdDueDate,
								 Date odrStartDate, double odrQty, int odGnrTyp, int odLevelNo)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rsPs = null;
		try {
			_log.methodStart();

			// 製品構成の検索
			String sql = "select * from M_PS "
					   + "where PARENT_ITEM_CD = ? "			// 親品目番号
					   + "and EFF_PHASE_IN_DATE <= ? "			// 製品構成有効開始日
					   + "and EFF_PHASE_OUT_DATE >= ? " 		// 製品構成有効終了日
					   + "and MRP_EXP_TYP = 1 " 				// 所要量展開区分 = 1:展開する
					   + "order by COMP_ITEM_CD";				// 子品目番号
			ps = _conn.prepareStatement(sql);
			ps.setString(1, itemCd);
			ps.setTimestamp(2, new Timestamp(odrStartDate.getTime()));
			ps.setTimestamp(3, new Timestamp(odrStartDate.getTime()));
			rsPs = ps.executeQuery();

			// 所要量レベル番号を加算
			odLevelNo++;

			// 下位デマンド情報の追加
			while ( rsPs.next() ) {
				this.insertOd(rsPs,parentOdNo,odrQty,odrStartDate,prdDueDate,odGnrTyp,odLevelNo);
			}
			rsPs.close();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsPs != null) {
				try {
					rsPs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsPs = null;
			}
		}
	}

	/**
	 * 所要量の追加(下位デマンド情報の追加)
	 * (1.1.2.2のメイン処理 + 1.1.2.3 の処理)
	 *
	 * @param rsPs 製品構成(ResultSet)
	 * @param parentOdNo 親オーダデマンド番号
	 * @param parentOdrQty 親オーダ数量
	 * @param parentOdrStartDate 親手配着手日
	 * @param parentPrdDueDate 親製造納期
	 * @param odGnrTyp 所要量発生処理区分(工程管理は3:作業計画から登録を指定/購買管理は2:発注計画から登録を指定)
	 * @param odLevelNo 所要量レベル番号
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void insertOd(ResultSet rsPs, String parentOdNo, double parentOdrQty,
						  Date parentOdrStartDate, Date parentPrdDueDate, int odGnrTyp, int odLevelNo )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rsItem = null;
		PreparedStatement stmt = null;
		try {
			_log.methodStart();

			// << 品目の検索 >>
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, rsPs.getString("COMP_ITEM_CD"));
			rsItem = ps.executeQuery();

			String odNo = this.getNewOdNo();							  // オーダデマンド番号採番

			if ( rsItem.next() ) {

				// オーダ状態区分,デマンド状態区分,オーダデマンド区分--------------------
				// [品目]."品目手配区分"が 8:疑似品目 か調べそれぞれの区分を設定する
				int mrpOdrTyp  = rsItem.getInt("MRP_ODR_TYP");
				int odrStsTyp  = ( mrpOdrTyp == 8 ) ? 9 : 0;	// オーダ状態区分(9:完了/0:オーダでない)
				int dmStsTyp   = ( mrpOdrTyp == 8 ) ? 9 : 2;	// デマンド状態区分(9:完了/2:確定済み)
				int odTyp	   = ( mrpOdrTyp == 8 ) ? 4 : 3;	// オーダデマンド区分(4:疑似/3:デマンド)
				double psSpoil = ( mrpOdrTyp == 8 ) ? 0 : rsPs.getDouble("PS_SPOIL");  // 構成仕損率

				// 構成単位数の設定--------------------
				double psNumerator = rsPs.getDouble("PS_UNIT_NUMERATOR");	   // 構成単位(分子)
				double psDenominator = rsPs.getDouble("PS_UNIT_DENOMINATOR");  // 構成単位(分母)
				// ★★ 構成単位数は丸めずに計算(2003/8/7)
				double psUnitQty = ( psDenominator == 0.0 ) ? psNumerator : psNumerator / psDenominator;

				// デマンド数量の設定--------------------
				double dmQty = 0.0D;
				if ( mrpOdrTyp == 8 ) {
					// 疑似品目の場合、親のオーダ数量*構成単位(丸め前)
					dmQty = parentOdrQty * psUnitQty;
				} else {
					// 疑似品目以外の場合、親のオーダ数量*構成単位(丸め前)*(1+ 構成仕損率/100)
					dmQty = parentOdrQty * psUnitQty * ( 1 + psSpoil / 100D );
				}
				// 在庫数量単位区分(0:整数/1:小数)による丸め
				int unitQtyTyp = rsItem.getInt("UNIT_QTY_TYP");
				psUnitQty = changeQtyUp(psUnitQty,unitQtyTyp);
				dmQty = changeQtyUp(dmQty,unitQtyTyp);

				// 要求納期/製造納期の設定--------------------
				int psLtFlg = rsPs.getInt("PS_LT_FLG"); 					// 製品構成リードタイム使用フラグ
				int psFixedLt = rsPs.getInt("PS_FIXED_LT"); 				// 固定分リードタイム
				double psPropLotSize = rsPs.getDouble("PS_PROP_LOT_SIZE");	// 製品構成比例分ロットサイズ
				int psPropLt = rsPs.getInt("PS_PROP_LT");					// 製品構成比例分リードタイム
				Date dueDate = null;										// 要求納期
				Date prdDueDate = null; 									// 製造納期

				// 製品構成リードタイム使用フラグ  0:使用しない/1:使用する
				if ( psLtFlg == 0 ) {
					// 親の手配着手日と同じ
					dueDate = parentOdrStartDate;
					// 稼働日チェック
					dueDate = this.calcOdrStartDate(0,dueDate);
				} else {
					// 親の製造納期 - 構成リードタイムで計算
					if ( psPropLotSize == 0) {
						rsItem.close();
						 _log.methodEnd();
						throw new ApsComException(50417,"(SBM0982)製品構成比例分ロットサイズが未入力です");
					}
					// 製品構成比例分数量 = オーダ数(親)/製品構成比例分ロットサイズ (整数に切り上げ)
					int psPropQty = (int) Math.ceil( parentOdrQty / psPropLotSize );
					// 製品構成比例分数量=0 の場合、=1とする
					if ( psPropQty == 0 ) {
						psPropQty = 1;
					}
					// 構成リードタイム=製品構成固定リードタイム + 製品構成比例リードタイム*製品構成比例分数量(整数に切り上げ)
					int psLt = (int) Math.ceil( psFixedLt + ( psPropLt * psPropQty ) );
					// 稼働日チェック

					dueDate = this.calcOdrStartDate(psLt,parentPrdDueDate);
				}
				// 製造納期= 要求納期
				prdDueDate = dueDate;

				// 所要量有効開始日,有効終了日--------------------
				// [製品構成]から取得
				java.sql.Date effPhaseInDate = rsPs.getDate("EFF_PHASE_IN_DATE");	// 所要量有効開始日
				java.sql.Date effPhaseOutDate = rsPs.getDate("EFF_PHASE_OUT_DATE"); // 所要量有効終了日

				// オーダデマンド区分=4:疑似の時の処理 ===================================

				double itemSpoil = rsItem.getDouble("ITEM_SPOIL");		  // 品目仕損率
				int odrLt = rsItem.getInt("ODR_LT");					  // 手配リードタイム
				int issueLt = rsItem.getInt("ISSUE_LT");				  // 払出リードタイム
				int fixedLt = rsItem.getInt("FIXED_LT");				  // 固定分リードタイム
				double propLotSize = rsItem.getDouble("PROP_LOT_SIZE");   // 比例分ロットサイズ
				int propLt = rsItem.getInt("PROP_LT");					  // 比例分リードタイム
				int safetyLt = rsItem.getInt("SAFETY_LT");				  // 安全日数
				Date odrStartDate = null;								  // 手配着手日
				Date prdStartDate = null;								  // 製造着手日
				double odrQty = 0.0D;									  // オーダ数

				if ( odTyp == 4 ) {

					// オーダ数 = デマンド数量 * ( 1 + ( 所要量品目仕損率 / 100 )-------
					odrQty = dmQty * ( 1 + itemSpoil / 100D );
					odrQty = changeQtyUp(odrQty,unitQtyTyp);   // 丸め処理

					// 製造納期 = 要求納期 - 払出リードタイム (稼働日チェック)------------
					prdDueDate = this.calcOdrStartDate(issueLt,dueDate);

					// 製造着手日 = 製造納期 - 品目リードタイム-------------------------
					if ( propLotSize == 0) {
						rsItem.close();
						 _log.methodEnd();
						throw new ApsComException(50416,"(SBM0983)比例分ロットサイズが未入力です");
					}
					int propQty = (int) Math.ceil( odrQty / propLotSize );
					// 比例分数量=0 の場合、=1とする
					if ( propQty == 0 ) {
						propQty = 1;
					}
					// 品目リードタイム = 固定リードタイム + ( 比例リードタイム * 分数量) + 安全日数 (整数に切り上げ)
					int lt = (int) Math.ceil( fixedLt + ( propLt * propQty ) + safetyLt );
					// 稼働日チェック
					prdStartDate = this.calcOdrStartDate(lt,prdDueDate);

					// 手配着手日 = 製造納期 - 手配リードタイム (稼働日チェック)-----------
					odrStartDate = this.calcOdrStartDate(odrLt,prdDueDate);
				}

				// SQL文変換
				String sDueDate = "{d '" + new java.sql.Date(dueDate.getTime()) + "'}"; 	  // 要求納期
				String sPrdDueDate = "{d '" + new java.sql.Date(prdDueDate.getTime()) + "'}"; // 製造納期
				String sOdrStartDate = "null";							  // 手配着手日
				String sPrdStartDate = "null";							  // 製造着手日
				if ( odrStartDate != null ) {
					sOdrStartDate = "{d '" + new java.sql.Date(odrStartDate.getTime()) + "'}";
					sPrdStartDate = "{d '" + new java.sql.Date(prdStartDate.getTime()) + "'}";
				}

				// 更新処理(SQL)--------------------
				sql = "insert into T_OD ( "
					+ " OD_NO"					 // オーダデマンド番号
					+ ",ALC_GRP_CD" 			 // 引当グループコード
					+ ",PLANT_CD"				 // 工場コード
					+ ",ITEM_CD"				 // 品目番号
					+ ",PS_EDITION" 			 // 所要量品目構成版数
					+ ",JOB_ODR_CD" 			 // 製番
					+ ",JOB_ODR_DETAIL_NO"		 // 製番枝番
					+ ",JOB_ODR_CANCEL_NO"		 // 製番取消発生番号
					+ ",ODR_STS_TYP"			 // オーダ状態区分
					+ ",DM_STS_TYP" 			 // デマンド状態区分
					+ ",OD_TYP" 				 // オーダデマンド区分
					+ ",DUE_DATE"				 // 要求納期
					+ ",ODR_START_DATE" 		 // 手配着手日
					+ ",PRD_DUE_DATE"			 // 製造納期
					+ ",PRD_START_DATE" 		 // 製造着手日
					+ ",DM_QTY" 				 // デマンド数
					+ ",ODR_QTY"				 // オーダ数
					+ ",MRP_ODR_TYP"			 // 品目手配区分
					+ ",OUTSIDE_TYP"			 // 所要量内外作区分
					+ ",ISSUE_TYP"				 // 所要量出庫区分
					+ ",ODR_LT" 				 // 手配リードタイム
					+ ",FIXED_LT"				 // 固定分リードタイム
					+ ",PROP_LT"				 // 比例分リードタイム
					+ ",SAFETY_LT"				 // 安全日数
					+ ",ISSUE_LT"				 // 払出リードタイム
					+ ",PROP_LOT_SIZE"			 // 比例分ロットサイズ
					+ ",PS_LT_FLG"				 // 製品構成リードタイム使用フラグ
					+ ",PS_FIXED_LT"			 // 製品構成固定分リードタイム
					+ ",PS_PROP_LT" 			 // 製品構成比例分リードタイム
					+ ",PS_PROP_LOT_SIZE"		 // 製品構成比例分ロットサイズ
					+ ",PS_UNIT_QTY"			 // 製品構成単位数	  ★★
					+ ",PS_UNIT_NUMERATOR"		 // 製品構成単位数分子 ★★
					+ ",PS_UNIT_DENOMINATOR"	 // 製品構成単位数分母 ★★
					+ ",TOTAL_RCV_QTY"			 // 入庫累計数
					+ ",RCV_CMPLT_DATE" 		 // 入庫完了日
					+ ",TOTAL_ISSUE_INST_QTY"	 // 出庫指示累計数
					+ ",TOTAL_ISSUE_QTY"		 // 出庫累計数
					+ ",ISSUE_CMPLT_DATE"		 // 出庫完了日
					+ ",OD_GNR_TYP" 			 // 所要量発生処理区分
					+ ",OD_LEVEL_NO"			 // 所要量レベル番号
					+ ",PARENT_OD_NO"			 // 親オーダデマンド番号
					+ ",ITEM_SPOIL" 			 // 所要量品目仕損率
					+ ",PS_SPOIL"				 // 所要量構成仕損率
					+ ",CONS_TYP"				 // 構成支給区分
					+ ",EFF_PHASE_IN_DATE"		 // 所要量有効開始日
					+ ",EFF_PHASE_OUT_DATE" 	 // 所要量有効終了日
					+ ",MRP_TYP"				 // 所要量処理区分
					+ ",EXTERNAL_DM_FLG"		 // 外部デマンドフラグ
					+ ",ODR_RELEASE_FLG"		 // オーダ発効済フラグ
					+ ",CREATED_BY" 			 // 作成者
					+ ",CREATED_PRG_NM" 		 // 作成プログラム名
					+ ",UPDATED_BY" 			 // 更新者
					+ ",UPDATED_PRG_NM" 		 // 更新プログラム名
					+ ",MODIFY_COUNT"			 // 更新数

					+ ") values ("

					+ "?"							 // オーダデマンド番号
					+ ",null"						 // 引当グループコード
					+ ",?" 							 // 工場コード
					+ ",?"							 // 品目番号
					+ ",?" 							 // 所要量品目構成版数
					+ ",null"						 // 製番
					+ ",0"							 // 製番枝番
					+ ",0"							 // 製番取消発生番号
					+ ",?"  						 // オーダ状態区分
					+ ",?" 							 // デマンド状態区分
					+ ",?" 							 // オーダデマンド区分
					+ ",?"  						 // 要求納期
					+ ",?" 							 // 手配着手日
					+ ",?"   						 // 製造納期
					+ ",?"  						 // 製造着手日
					+ ",?"  						 // デマンド数
					+ ",?"  						 // オーダ数
					+ ",?"  						 // 品目手配区分
					+ ",?"  						 // 所要量内外作区分
					+ ",?"  						 // 所要量出庫区分
					+ ",?"  						 // 手配リードタイム
					+ ",?"   						 // 固定分リードタイム
					+ ",?"  						 // 比例分リードタイム
					+ ",?"  						 // 安全日数
					+ ",?"   						 // 払出リードタイム
					+ ",?"   						 // 比例分ロットサイズ
					+ ",?"   						 // 製品構成リードタイム使用フラグ
					+ ",?"  						 // 製品構成固定分リードタイム
					+ ",?"  						 // 製品構成比例分リードタイム
					+ ",?"  						 // 製品構成比例分ロットサイズ
					+ ",?"  						 // 製品構成単位数	  ★★
					+ ",?"   						 // 製品構成単位数分子 ★★
					+ ",?" 							 // 製品構成単位数分母 ★★
					+ ",0"							 // 入庫累計数
					+ ",null"						 // 入庫完了日
					+ ",0"							 // 出庫指示累計数
					+ ",0"							 // 出庫累計数
					+ ",null"						 // 出庫完了日
					+ ",?" 							 // 所要量発生処理区分
					+ ",?"  						 // 所要量レベル番号
					+ ",?"							 // 親オーダデマンド番号
					+ ",?"  						 // 所要量品目仕損率
					+ ",?"   						 // 所要量構成仕損率
					+ ",?"   						 // 構成支給区分
					+ ",?"							 // 所要量有効開始日
					+ ",?"							 // 所要量有効終了日
					+ ",9"							 // 所要量処理区分
					+ ",0"							 // 外部デマンドフラグ
					+ ",0"							 // オーダ発効済フラグ
					+ ",?"							 // 作成者
					+ ",?"	 					 	 // 作成プログラム名
					+ ",?"							 // 更新者
					+ ",?"							 // 更新プログラム名
					+ ",0"							 // 更新数
					+ ")";
				stmt = _conn.prepareStatement(sql);
				stmt.setString(1, odNo);
				stmt.setString(2, _plantCd);
				stmt.setString(3, rsPs.getString("COMP_ITEM_CD"));
				stmt.setString(4, rsPs.getString("PS_EDITION"));
				stmt.setInt(5, odrStsTyp);
				stmt.setInt(6, dmStsTyp);
				stmt.setInt(7, odTyp);
				stmt.setString(8, sDueDate);
				stmt.setString(9, sOdrStartDate);
				stmt.setString(10, sPrdDueDate);
				stmt.setString(11, sPrdStartDate);
				stmt.setDouble(12, dmQty);
				stmt.setDouble(13, odrQty);
				stmt.setInt(14, rsItem.getInt("MRP_ODR_TYP"));
				stmt.setInt(15, rsItem.getInt("OUTSIDE_TYP"));
				stmt.setInt(16, rsItem.getInt("ISSUE_TYP"));
				stmt.setInt(17, odrLt);
				stmt.setInt(18, fixedLt);
				stmt.setInt(19, propLt);
				stmt.setInt(20, safetyLt);
				stmt.setInt(21, issueLt);
				stmt.setDouble(22, propLotSize);
				stmt.setInt(23, psLtFlg);
				stmt.setInt(24, psFixedLt);
				stmt.setInt(25, psPropLt);
				stmt.setDouble(26, psPropLotSize);
				stmt.setDouble(27, psUnitQty);
				stmt.setDouble(28, psNumerator);
				stmt.setDouble(29, psDenominator);
				stmt.setInt(30, odGnrTyp);
				stmt.setInt(31, odLevelNo);
				stmt.setString(32, parentOdNo);
				stmt.setDouble(33, itemSpoil);
				stmt.setDouble(34, psSpoil);
				stmt.setInt(35, rsPs.getInt("CONS_TYP"));
				stmt.setString(36, "{d '" + effPhaseInDate + "'}");
				stmt.setString(37, "{d '" + effPhaseOutDate + "'}"	);
				stmt.setString(38, _userInfo.getUserId());
				stmt.setString(39, _userInfo.getBusinessName());
				stmt.setString(40, _userInfo.getUserId());
				stmt.setString(41, _userInfo.getBusinessName());
				stmt.execute();
				stmt.close();
				rsItem.close();

				//this.changeCommon(odNo);

				// 疑似品目の場合、さらに下位のデマンド情報を作成する。
				// 業務上は、二段階しかあり得ないが、再帰処理で対応する。
				if ( odTyp == 4 ) {
					String itemCd = rsPs.getString("COMP_ITEM_CD");
					this.makeUnderDemand(itemCd,odNo,prdDueDate,odrStartDate,odrQty,odGnrTyp,odLevelNo);
				}

			} else {
				rsItem.close();
				 _log.methodEnd();
				throw new ApsComException(50509,"(SBM0981)品目データが存在しません");
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsItem != null) {
				try {
					rsItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsItem = null;
			}
			if (stmt != null){
				try{
					stmt.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				stmt = null;
			}
		}
	}

	//==========================================================================
	/**
	 * オーダデマンド情報更新(計画変更用)
	 * 引き数で渡されたオーダデマンド番号もとにオーダデマンド情報の更新を行う。
	 *
	 * @param odNo オーダデマンド番号
	 * @param modifyCount 読込み時の更新数(チェックしない場合はマイナス値を設定)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeOdInfo(String odNo, long modifyCount)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psWorkInProcByItem = null;
		PreparedStatement psRlsdPuchOdr = null;
		ResultSet rs = null;
		ResultSet rsWorkInProcByItem = null;
		ResultSet rsRlsdPuchOdr = null;

		try {
			_log.methodStart();
			String sql;

			// 更新数チェック
			this.checkModifyCount(odNo,modifyCount);

			// << 所要量の検索 >>
			boolean odChanged = false;									  // 所要量変更フラグ
			sql = "select * from T_OD where OD_NO = ?";
			psOd = _conn.prepareStatement(sql);
			psOd.setString(1, odNo);
			rs = psOd.executeQuery();
			rs.next();

			// オーダ数量の累計,製造着手日の最早値,製造納期の最遅値,手配着手日の算出===========
			double odrQty = 0;											  // オーダ数量
			Date prdStartDateFirst = this.getLastDate();				  // 製造着手日最早日
			Date prdDueDateLast = this.getFirstDate();					  // 製造納期最遅日

			// << 品目別仕掛の検索 >>
			sql = "select * from T_WORK_IN_PROC_BY_ITEM where OD_NO = ? ";
			psWorkInProcByItem = _conn.prepareStatement(sql);
			psWorkInProcByItem.setString(1, odNo);
			rsWorkInProcByItem = psWorkInProcByItem.executeQuery();

			// << 発注残の検索 >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? and WORK_ODR_CD is null ";			  // 作業計画番号=null
			psRlsdPuchOdr = _conn.prepareStatement(sql);
			psRlsdPuchOdr.setString(1, odNo);
			rsRlsdPuchOdr = psRlsdPuchOdr.executeQuery();

			while ( rsWorkInProcByItem.next() ) {
				// 品目別仕掛の作業指示数の合計
				odrQty += rsWorkInProcByItem.getDouble("OPR_INST_QTY");

				// 作業製造着手日< 製造着手日最早日の場合、製造着手日最早日を再設定 	// 2003/09/01 update
				//if ( rsWorkInProcByItem.getDate("OPR_INST_START_DATE").after(prdStartDateFirst) ) {
				if ( rsWorkInProcByItem.getDate("OPR_INST_START_DATE").before(prdStartDateFirst) ) {
					prdStartDateFirst = rsWorkInProcByItem.getDate("OPR_INST_START_DATE");
					odChanged = true;
				}
				// 作業製造納期 > 製造納期最遅日の場合、製造納期最遅日を再設定		   // 2003/09/01 update
				//if ( rsWorkInProcByItem.getDate("WORK_ODR_DLV_DATE").before(prdDueDateLast) ) {
				if ( rsWorkInProcByItem.getDate("WORK_ODR_DLV_DATE").after(prdDueDateLast) ) {
					prdDueDateLast = rsWorkInProcByItem.getDate("WORK_ODR_DLV_DATE");
					odChanged = true;
				}
			}

			while ( rsRlsdPuchOdr.next() ) {
				// 発注算の発注数の合計
				odrQty += rsRlsdPuchOdr.getDouble("PUCH_ODR_QTY");

				// 発注着手日< 製造着手日最早日の場合、製造着手日最早日を再設定 	   // 2003/09/01 update
				//if ( rsRlsdPuchOdr.getDate("PUCH_ODR_START_DATE").after(prdStartDateFirst) ) {
				if ( rsRlsdPuchOdr.getDate("PUCH_ODR_START_DATE").before(prdStartDateFirst) ) {
					prdStartDateFirst = rsRlsdPuchOdr.getDate("PUCH_ODR_START_DATE");
					odChanged = true;
				}
				// 発注納期 > 製造納期最遅日の場合、製造納期最遅日を再設定			  // 2003/09/01 update
				//if ( rsRlsdPuchOdr.getDate("PUCH_ODR_DLV_DATE").before(prdDueDateLast) ) {
				if ( rsRlsdPuchOdr.getDate("PUCH_ODR_DLV_DATE").after(prdDueDateLast) ) {
					prdDueDateLast = rsRlsdPuchOdr.getDate("PUCH_ODR_DLV_DATE");
					odChanged = true;
				}
			}

			psWorkInProcByItem.close();
			psRlsdPuchOdr.close();

			// 算出したオーダ数 <= 0 の場合、製造着手日,製造納期は、[所容量]と同じ(変更しない)	// 2003/09/01
			Date odrStartDate = rs.getDate("ODR_START_DATE");	   // [所容量].手配着手日
			if ( odrQty <= 0 ) {
				prdStartDateFirst = rs.getDate("PRD_START_DATE");
				prdDueDateLast = rs.getDate("PRD_DUE_DATE");
			} else {
				// 製造着手日最早日<>所容量.製造着手日の場合、手配着手日を再計算
				//if (prdStartDateFirst.getTime() == rs.getDate("PRD_START_DATE").getTime()) {	//2003/09/29
				if (prdStartDateFirst.getTime() != rs.getDate("PRD_START_DATE").getTime()) {
					int difference = rs.getInt("ODR_LT");						   // 差分＝ 手配リードタイム
					odrStartDate = this.calcOdrStartDate(difference, prdStartDateFirst);
				}
			}
			// オーダ数に変更がある場合所要量変更フラグにtrueを設定
			if (rs.getDouble("ODR_QTY") != odrQty) {
				odChanged = true;
			}

			// オーダ状態区分,入庫完了日の算出 ================================
			int odrStsTyp = 9;											  // オーダ状態区分(9:完了)
			Date rcvCmpltDate;											  // 入庫完了日

			if (odrQty == 0) {
				odrStsTyp = 9;											  // オーダ状態区分=9:完了
				rcvCmpltDate = this.getBusinessOprDate();				  // 入庫完了日=業務日付
			} else {
				rcvCmpltDate = this.getFirstDate(); 					  // 入庫完了日(初期値)
				// << 品目別仕掛の検索 >>
				sql = "select * from T_WORK_IN_PROC_BY_ITEM "
					+ "where OD_NO = ? ";
				psWorkInProcByItem = _conn.prepareStatement(sql);
				psWorkInProcByItem.setString(1, odNo);
				rsWorkInProcByItem = psWorkInProcByItem.executeQuery();

				// << 発注残の検索 >>
				sql = "select * from T_RLSD_PUCH_ODR "
					+ "where OD_NO = ? "
					+ "and WORK_ODR_CD is null ";						  // 作業計画番号=null
				psRlsdPuchOdr = _conn.prepareStatement(sql);
				psRlsdPuchOdr.setString(1, odNo);
				rsRlsdPuchOdr = psRlsdPuchOdr.executeQuery();

				while ( rsWorkInProcByItem.next() ) {
					// 品目別作業状態区分<>作業完了の場合
					if ( rsWorkInProcByItem.getInt("WORK_STS_TYP") != 9 ) {
						odrStsTyp = 2;									  // 2:確定(発効)
						rcvCmpltDate = null;
						break;
					} else {
						// 作業完了日>入庫完了日の場合、入庫完了日=作業完了日とする    // 2003/09/01 update
						//if ( rsWorkInProcByItem.getDate("WORK_CMPLT_DATE").before(rcvCmpltDate) ) {
						if ( rsWorkInProcByItem.getDate("WORK_CMPLT_DATE").after(rcvCmpltDate) ) {
							rcvCmpltDate = rsWorkInProcByItem.getDate("WORK_CMPLT_DATE");
						}
					}
				}

				while ( rsRlsdPuchOdr.next() ) {
					// 検査完了フラグ<>完了の場合
					if ( rsRlsdPuchOdr.getInt("INSPC_CMPLT_FLG") != 9 ) {
						odrStsTyp = 2;	// 2:確定(発効)
						rcvCmpltDate = null;
						break;
					} else {
						// 検査完了日>入庫完了日の場合、入庫完了日=検査完了日とする    // 2003/09/01 update
						//if ( rsRlsdPuchOdr.getDate("INSPC_CMPLT_DATE").before(rcvCmpltDate) ) {
						if ( rsRlsdPuchOdr.getDate("INSPC_CMPLT_DATE").after(rcvCmpltDate) ) {
							rcvCmpltDate = rsRlsdPuchOdr.getDate("INSPC_CMPLT_DATE");
						}
					}
				}
			}

			psWorkInProcByItem.close();
			psRlsdPuchOdr.close();

			//オーダ状態区分<>[所容量].オーダ状態区分の場合、変更があったと判断する
			if (odrStsTyp != rs.getInt("ODR_STS_TYP")) {
				odChanged = true;
			}

			// << 所要量の更新 >>　　　　　　　　　　　//　2003/09/01　ifブロックの位置がずれていたのを修正
			if (odChanged) {

				sql = "update T_OD set"
					+ " ODR_QTY = ?"				 // オーダ数
					+ ",PRD_DUE_DATE = ?"			 // 製造納期
					+ ",PRD_START_DATE = ?" 		 // 製造着手日
					+ ",ODR_START_DATE = ?" 		 // 手配着手日
					+ ",ODR_STS_TYP = ?"			 // オーダ状態区分
					+ ",RCV_CMPLT_DATE = ?" 		 // 入庫完了日
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setDouble(1, odrQty);
				ps.setDate(2, new java.sql.Date(prdDueDateLast.getTime()));
				ps.setDate(3, new java.sql.Date(prdStartDateFirst.getTime()));
				ps.setDate(4, new java.sql.Date(odrStartDate.getTime()));
				ps.setInt(5, odrStsTyp);
				//ps.setDate(6, new java.sql.Date(rcvCmpltDate.getTime()));
				if (rcvCmpltDate == null ) {								 // 2003/09/01
					ps.setDate(6, null);
				} else {
					ps.setDate(6, new java.sql.Date(rcvCmpltDate.getTime()));
				}
				ps.setTimestamp(7, new Timestamp(new Date().getTime()));
				ps.setString(8, _userInfo.getUserId());
				ps.setString(9, _userInfo.getBusinessName());
				ps.setString(10, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);

				// < 製番計画の更新 >
				// 更新された[所要量]が製番の最上位品目だった場合[製番計画]."製番状態区分"を更新する
				//if (rs.getString("JOB_ODR_CD") == null || rs.getString("JOB_ODR_CD").equals("")) {	 //    2003/10/30 update
				if (rs.getString("JOB_ODR_CD") != null && !rs.getString("JOB_ODR_CD").equals("")) {
					if (odrStsTyp == 9) {
						this.updateJobOdr(odNo, 9); // 完了
					}
					else {
						this.updateJobOdr(odNo, 5); // 自品目確定済み
					}
				}
			}

			psOd.close();

			//　下位品目のデマンド情報の更新
			// << 下位品目の所要量の検索 >>
			sql = "select * from T_OD where PARENT_OD_NO = ?";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, odNo);
			rs = ps.executeQuery();
			while ( rs.next() ) {										  // 手配着手日,製造納期
				this.changeChildOdInfo(rs, odNo, odrQty, odrStartDate, prdDueDateLast);
			}
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psOd != null)
			{
				psOd.close();
			}
			if (psWorkInProcByItem != null)
			{
				psWorkInProcByItem.close();
			}
			if (psRlsdPuchOdr != null)
			{
				psRlsdPuchOdr.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
			if (rsWorkInProcByItem != null) {
				try {
					rsWorkInProcByItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsWorkInProcByItem = null;
			}
			if (rsRlsdPuchOdr != null) {
				try {
					rsRlsdPuchOdr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsRlsdPuchOdr = null;
			}
		}
	}
	/**
	 * オーダ情報更新(下位品目のデマンド情報更新)
	 *
	 * @param rs 下位品目のResultSet
	 * @param parentOdNo 親オーダデマンド番号
	 * @param parentOdrQty 親オーダ数量
	 * @param parentOdrStartDate 親オーダ数量
	 * @param parentPrdDueDate 親製造納期
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void changeChildOdInfo(ResultSet rs, String parentOdNo, double parentOdrQty,
								   Date parentOdrStartDate, Date parentPrdDueDate)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psWorkInProcByItem = null;
		PreparedStatement psRlsdPuchOdr = null;
		ResultSet rsItem = null;
		ResultSet rsWorkInProcByItem = null;
		ResultSet rsRlsdPuchOdr = null;
		try {
			_log.methodStart();

			String odNo = rs.getString("OD_NO");				// オーダデマンド番号
			int odTyp = rs.getInt("OD_TYP");					// オーダデマンド区分

			// << 品目の検索 >>
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, rs.getString("ITEM_CD"));
			rsItem = ps.executeQuery();

			// デマンド数量の設定--------------------
			int mrpOdrTyp = rs.getInt("MRP_ODR_TYP");					  // 品目手配区分
			double psSpoil = rs.getDouble("PS_SPOIL");					  // 構成仕損率
			double psNumerator = rs.getDouble("PS_UNIT_NUMERATOR"); 	  // 構成単位(分子)
			double psDenominator = rs.getDouble("PS_UNIT_DENOMINATOR");   // 構成単位(分母)
			// ★★ 構成単位数は分子/分母で計算(2003/8/7)
			// double psUnitQty = rs.getDouble("PS_UNIT_QTY");				 // 構成単位数
			double psUnitQty = ( psDenominator == 0.0 ) ? psNumerator : psNumerator / psDenominator;

			double dmQty = 0.0D;										  // デマンド数

			if ( mrpOdrTyp == 8 ) {
				// 疑似品目の場合、親のオーダ数量*構成単位(丸め前)
				dmQty = parentOdrQty * psUnitQty;
			} else {
				//	疑似品目以外の場合、親のオーダ数量*構成単位(丸め前)*(1+ 構成仕損率/100)
				dmQty = parentOdrQty * psUnitQty * ( 1 + psSpoil / 100D );
			}
			// 丸め処理
			int unitQtyTyp = 0; 								// 在庫数量単位区分(0:整数/1:小数)
			if ( rsItem.next() ) {
				unitQtyTyp = rsItem.getInt("UNIT_QTY_TYP");
				psUnitQty = changeQtyUp(psUnitQty,unitQtyTyp);
				dmQty = changeQtyUp(dmQty,unitQtyTyp);
			} else {
				rsItem.close();
				rsItem = null;
				_log.methodEnd();
				throw new ApsComException(50509,"(SBM0981)品目データが存在しません");
			}

			// 要求納期/製造納期の設定--------------------
			int psLtFlg = rs.getInt("PS_LT_FLG");						  // 製品構成リードタイム使用フラグ
			int psFixedLt = rs.getInt("PS_FIXED_LT");					  // 固定分リードタイム
			double psPropLotSize = rs.getDouble("PS_PROP_LOT_SIZE");	  // 製品構成比例分ロットサイズ
			int psPropLt = rs.getInt("PS_PROP_LT"); 					  // 製品構成比例分リードタイム
			Date dueDate = null;										  // 要求納期

			// 製品構成リードタイム使用フラグ  0:使用しない/1:使用する
			if (psLtFlg == 0) {
				// 親の手配着手日と同じ
				dueDate = parentOdrStartDate;
				// 稼働日チェック
				dueDate = this.calcOdrStartDate(0, dueDate);
			} else {
				// 親の製造納期 - 構成リードタイムで計算
				if (psPropLotSize == 0) {
					rsItem.close();
					rsItem = null;
					_log.methodEnd();
					throw new ApsComException(50417, "(SBM0982)製品構成比例分ロットサイズが未入力です");
				}
				// 製品構成比例分数量 = オーダ数(親)/製品構成比例分ロットサイズ (整数に切り上げ)
				int psPropQty = (int) Math.ceil(parentOdrQty / psPropLotSize);
				// 製品構成比例分数量=0 の場合、=1とする
				if (psPropQty == 0) {
					psPropQty = 1;
				}
				// 構成リードタイム=製品構成固定リードタイム + 製品構成比例リードタイム*製品構成比例分数量(整数に切り上げ)
				int psLt = (int) Math.ceil(psFixedLt + (psPropLt * psPropQty));
				// 稼働日チェック
				dueDate = this.calcOdrStartDate(psLt, parentPrdDueDate);
			}

			// MRP管理品目の場合、製造納期= 要求納期
			Date prdDueDate = rs.getTimestamp("PRD_DUE_DATE");		  // 製造納期	2003/10/14 update
			if (mrpOdrTyp == 4 || mrpOdrTyp == 5 || mrpOdrTyp == 6 || mrpOdrTyp == 7) {
				prdDueDate = dueDate;
			}

			// 指示状態のチェック--------------------
			boolean instCmpFlgIsRelAll = true;

			// << 品目別仕掛の検索 >>
			sql = "select * from T_WORK_IN_PROC_BY_ITEM "
				+ "where OD_NO = ? ";
			psWorkInProcByItem = _conn.prepareStatement(sql);
			psWorkInProcByItem.setString(1, parentOdNo);
			rsWorkInProcByItem = psWorkInProcByItem.executeQuery();
			while ( rsWorkInProcByItem.next() ) {
				// 品目別作業状態区分=未指示の場合、
				if ( rsWorkInProcByItem.getInt("WORK_STS_TYP") == 1 ) {
					instCmpFlgIsRelAll = false;
				}
			}

			psWorkInProcByItem.close();

			// << 発注残の検索 >>
			sql = "select * from T_RLSD_PUCH_ODR "
				+ "where OD_NO = ? "
				+ "and WORK_ODR_CD is null ";							  // 作業計画番号=null
			psRlsdPuchOdr = _conn.prepareStatement(sql);
			psRlsdPuchOdr.setString(1, parentOdNo);
			rsRlsdPuchOdr = psRlsdPuchOdr.executeQuery();
			while ( rsRlsdPuchOdr.next() ) {
				//　発注状態区分=未指示の場合、
				if ( rsRlsdPuchOdr.getInt("PUCH_ODR_STS_TYP") == 1 ) {
					instCmpFlgIsRelAll = false;
				}
			}

			psRlsdPuchOdr.close();

			// デマンド状態区分,出庫完了日の設定--------------------
			int dmStsTyp = 9;											  // デマンド状態区分=9:完了
			Date issueCmpltDate = null; 								  // 出庫完了日

			Date odrStartDate = null;									  // 手配着手日  2003/10/14 update
			Date prdStartDate = null;									  // 製造着手日  2003/10/14 update
			double odrQtyOfChildOd = 0.0D;								  // オーダ数	 2003/10/14 update

			// オーダデマンド区分=4:疑似以外のとき
			if ( odTyp != 4 ) {

				odrStartDate = rs.getTimestamp("ODR_START_DATE");		  // 手配着手日 2003/10/14 update
				prdStartDate = rs.getTimestamp("PRD_START_DATE");		  // 製造着手日 2003/10/14 update
				odrQtyOfChildOd = rs.getDouble("ODR_QTY");				  // オーダ数	2003/10/14 update

				if (parentOdrQty == 0) {
					// 親のオーダ数=0 の場合
					dmStsTyp = 9;										  // デマンド状態区分=9:完了
					issueCmpltDate = this.getBusinessOprDate(); 		  // 出庫完了日=業務日付
				} else {
					// 親のオーダ数<>0 の場合
					// << 出庫完了状態のチェック,再遅出庫完了日の算出 >>
					boolean issueCmpFlgIsCmpAll = true;

					sql = "select * from T_ISSUE_INST "
						+ "where OD_NO = ? "
						+ "order by ISSUE_CMPLT_DATE desc"; 			  // 出庫完了日
					psOd = _conn.prepareStatement(sql);
					psOd.setString(1, rs.getString("OD_NO"));
					rs = psOd.executeQuery();

					while ( rs.next() ) {
						if ( issueCmpltDate == null ) {
							issueCmpltDate = rs.getTimestamp("ISSUE_CMPLT_DATE");
						}
						if ( rs.getInt("ISSUE_CMPLT_FLG") != 1 ) {		  // 出庫完了フラグ
							issueCmpFlgIsCmpAll = false;
							break;
						}
					}

					psOd.close();

					// 指示完了 かつ、出庫完了の場合、デマンド=完了とする
					if ( instCmpFlgIsRelAll && issueCmpFlgIsCmpAll ) {
						dmStsTyp = 9; // デマンド状態区分=9:完了
						issueCmpltDate = issueCmpltDate;
					} else {
						dmStsTyp = 2; // デマンド状態区分=2:確定（未発効）
						issueCmpltDate = null;
					}
				}
			}

			// オーダデマンド区分=4:疑似の時の処理 ===================================

			double itemSpoil = rsItem.getDouble("ITEM_SPOIL");			  // 品目仕損率
			int odrLt = rsItem.getInt("ODR_LT");						  // 手配リードタイム
			int issueLt = rsItem.getInt("ISSUE_LT");					  // 払出リードタイム
			int fixedLt = rsItem.getInt("FIXED_LT");					  // 固定分リードタイム
			double propLotSize = rsItem.getDouble("PROP_LOT_SIZE"); 	  // 比例分ロットサイズ
			int propLt = rsItem.getInt("PROP_LT");						  // 比例分リードタイム
			int safetyLt = rsItem.getInt("SAFETY_LT");					  // 安全日数
			// Date odrStartDate = null;								  // 手配着手日 2003/10/14 delete
			// Date prdStartDate = null;								  // 製造着手日 2003/10/14 delete
			// double odrQtyOfChildOd = 0.0D;							  // オーダ数	2003/10/14 delete

			if ( odTyp == 4 ) {

				// オーダ数(下位品目) = デマンド数量 * ( 1 + ( 所要量品目仕損率 / 100 )-------
				odrQtyOfChildOd = dmQty * (1 + itemSpoil / 100D);
				odrQtyOfChildOd = changeQtyUp(odrQtyOfChildOd, unitQtyTyp); // 丸め処理

				// 製造納期 = 要求納期 - 払出リードタイム (稼働日チェック)------------
				prdDueDate = this.calcOdrStartDate(issueLt, dueDate);

				// 製造着手日 = 製造納期 - 品目リードタイム-------------------------
				if (propLotSize == 0) {
					 _log.methodEnd();
					throw new ApsComException(50416, "(SBM0983)比例分ロットサイズが未入力です");
				}
				int propQty = (int) Math.ceil(odrQtyOfChildOd / propLotSize);
				// 比例分数量=0 の場合、=1とする
				if (propQty == 0) {
					propQty = 1;
				}
				// 品目リードタイム = 固定リードタイム + ( 比例リードタイム * 分数量) + 安全日数 (整数に切り上げ)
				int lt = (int) Math.ceil(fixedLt + (propLt * propQty) + safetyLt);
				// 稼働日チェック
				prdStartDate = this.calcOdrStartDate(lt, prdDueDate);

				// 手配着手日 = 製造着手日 - 手配リードタイム (稼働日チェック)-----------
				odrStartDate = this.calcOdrStartDate(odrLt, prdStartDate);
			}

			if (odTyp == 4) {
			// 更新処理(SQL)--------------------
			sql = "update T_OD set"
					+ " DUE_DATE = ?" // 要求納期
					+ ",ODR_START_DATE = ?" // 手配着手日
					+ ",PRD_DUE_DATE = ?" // 製造納期
					+ ",PRD_START_DATE = ?" // 製造着手日
					+ ",DM_QTY = ?" // デマンド数
					+ ",ODR_QTY = ?" // オーダ数
					+ ",ISSUE_CMPLT_DATE = ?" // 出庫完了日
					+ ",UPDATED_DATE = ?" + ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ " where OD_NO = ?";
			}else{
				sql = "update T_OD set"
					+ " DUE_DATE = ?" // 要求納期
					+ ",ODR_START_DATE = ?" // 手配着手日
					+ ",PRD_DUE_DATE = ?" // 製造納期
					+ ",PRD_START_DATE = ?" // 製造着手日
					+ ",DM_QTY = ?" // デマンド数
					+ ",ODR_QTY = ?" // オーダ数
					+ ",ISSUE_CMPLT_DATE = ?" // 出庫完了日
					+ ",UPDATED_DATE = ?" + ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ ",DM_STS_TYP = ?" // デマンド状態区分
					+ " where OD_NO = ?";
			}
			if(ps != null){
				ps.close();
				ps = null;
			}
			ps = _conn.prepareStatement(sql);
			ps.setDate(1, new java.sql.Date(dueDate.getTime()));		  // 要求納期
			if ( odrStartDate == null ) {								  // 手配着手日
				ps.setNull(2, Types.DATE);
			} else {
				ps.setDate(2, new java.sql.Date(odrStartDate.getTime()));
			}
			if ( prdDueDate == null ) { 								  // 製造納期
				ps.setNull(3, Types.DATE);
			} else {
				ps.setDate(3, new java.sql.Date(prdDueDate.getTime()));
			}
			if ( prdStartDate == null ) {								  // 製造着手日
				ps.setNull(4, Types.DATE);
			} else {
				ps.setDate(4, new java.sql.Date(prdStartDate.getTime()));
			}
			ps.setDouble(5, dmQty); 									  // デマンド数
			ps.setDouble(6, odrQtyOfChildOd);							  // オーダ数
			if ( issueCmpltDate == null ) { 							  // 出庫完了日
				 ps.setNull(7, Types.DATE);
			} else {
				ps.setDate(7, new java.sql.Date(issueCmpltDate.getTime()));
			}
			ps.setTimestamp(8, new Timestamp(new Date().getTime()));
			ps.setString(9, _userInfo.getUserId());
			ps.setString(10, _userInfo.getBusinessName());
			if(odTyp == 4 ){
				ps.setString(11, odNo);
			}else{
				ps.setInt(11, dmStsTyp); 									  // デマンド状態区分
				ps.setString(12, odNo);
			}
			ps.execute();
			ps.close();
			ps = null;

			//this.changeCommon(odNo);

			// 疑似品目の場合、さらに下位のデマンド情報を作成する。
			if ( odTyp == 4 ) {
				sql = "select * from T_OD where PARENT_OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, odNo);
				rs = ps.executeQuery();
				while ( rs.next() ) {
					// 2003/09/02 update
					//this.changeChildOdInfo(rs, odNo, odrQtyOfChildOd, odrStartDate, prdDueDate);
					this.changeChildOdInfo(rs, parentOdNo, odrQtyOfChildOd, odrStartDate, prdDueDate);
				}
				rs.close();
				ps.close();
				ps = null;
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				try{
					ps.close();
					ps = null;
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if (psOd != null)
			{
				try{
					psOd.close();
					psOd = null;
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if (psWorkInProcByItem != null)
			{
				try{
					psWorkInProcByItem.close();
					psWorkInProcByItem = null;
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if (psRlsdPuchOdr != null)
			{
				try{
					psRlsdPuchOdr.close();
					psRlsdPuchOdr = null;
				}catch(Exception e){
					e.printStackTrace();
				}

			}
			if (rsItem != null) {
				try {
					rsItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsItem = null;
			}
			if (rsWorkInProcByItem != null) {
				try {
					rsWorkInProcByItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsWorkInProcByItem = null;
			}
			if (rsRlsdPuchOdr != null){
				try{
					rsRlsdPuchOdr.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsRlsdPuchOdr = null;
			}
		}
	}

	//==========================================================================
	/**
	 *	所要量処理区分変更
	 * オーダデマンド番号もとに該当データの所要量処理区分を削除に変更する
	 *
	 * @param odNo オーダデマンド番号
	 * @throws SQLException
	 */
	public void changeMrpTypToDelete(String odNo)
			throws SQLException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();
			String sql;

			sql = "update T_OD set"
				+ " MRP_TYP = 3"								// 所要量処理区分=3:削除 // 2003/08/28 SQL文修正(カンマを削除)
				+ ",UPDATED_DATE = ?"
				+ ",UPDATED_BY = ?"
				+ ",UPDATED_PRG_NM = ?"
				+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
				+ "where OD_NO = ?";
			ps = _conn.prepareStatement(sql);
			ps.setTimestamp(1, new Timestamp(new Date().getTime()));
			ps.setString(2, _userInfo.getUserId());
			ps.setString(3, _userInfo.getBusinessName());
			ps.setString(4, odNo);
			ps.execute();
			//this.changeCommon(odNo);

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	//==========================================================================
	/**
	 * オーダ情報更新(完了用)
	 * 引数で渡されたオーダデマンド番号もとにオーダ情報の完了を行う。
	 *
	 * @param odNo オーダデマンド番号
	 * @param modifyCount 読込み時の更新数(チェックしない場合はマイナス値を設定)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeOrderForComplete(String odNo, long modifyCount)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();
			String sql;

			// 更新数チェック
			this.checkModifyCount(odNo,modifyCount);

			// 入庫完了日の計算
			Date rcvCmpltDate = getRcvCmpltDate(odNo);

			// << 所要量の更新 >>
			if ( rcvCmpltDate != null ) {

				sql = "update T_OD set"
					+ " RCV_CMPLT_DATE = ?" 					// 入庫完了日
					+ ",ODR_STS_TYP = 9"						// オーダ状態区分=9:完了
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setDate(1, new java.sql.Date(rcvCmpltDate.getTime()));
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);

				// < 製番計画の更新 >
				// 更新された[所要量]が製番の最上位品目だった場合、
				// [製番計画]."製番状態区分"を'9:完了'に更新
				_CmpltFlg = 1;
				this.updateJobOdr( odNo, 9 );
			}

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	//==========================================================================
	/**
	 * デマンド情報更新(工程/完了用)
	 * 引数をもとにデマンド情報の完了処理を行う。
	 *
	 * @param workOdrCd 作業計画番号
	 * @param workInProcCd 仕掛作業コード
	 * @param workCmpltDate 作業完了日
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeDemandForComplete(String workOdrCd, String workInProcCd, Date workCmpltDate)
			throws SQLException,ApsComException {
		this.changeDemandForComplete(workOdrCd, workInProcCd, workCmpltDate, "", null);
	}

	/**
	 * デマンド情報更新(発注/完了用)
	 * 引数をもとにデマンド情報の完了処理を行う。
	 * @param puchOdrCd 発注番号
	 * @param acptCmpltDate 受入完了日
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeDemandForComplete(String puchOdrCd, Date acptCmpltDate)
			throws SQLException,ApsComException {
		this.changeDemandForComplete("", "", null, puchOdrCd, acptCmpltDate);
	}

	/**
	 * デマンド情報更新(完了用メイン処理)
	 * 引数をもとにデマンド情報の完了処理を行う。
	 *
	 * @param workOdrCd 作業計画番号
	 * @param workInProcCd 仕掛作業コード
	 * @param workCmpltDate 作業完了日
	 * @param puchOdrCd 発注番号
	 * @param acptCmpltDate 受入完了日
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void changeDemandForComplete(String workOdrCd, String workInProcCd, Date workCmpltDate,
										 String puchOdrCd, Date acptCmpltDate)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		PreparedStatement psIssueInst = null;
		ResultSet rs = null;

		try {
			_log.methodStart();

			// 引数チェック
			if ( workInProcCd != null && !workInProcCd.equals("") ) {
				if ( workCmpltDate == null ) {
					throw new ApsComException(50304,"(SBM0984)仕掛完了日が未入力です");
				}
			} else {
				if ( puchOdrCd == null || puchOdrCd.equals("") ) {
					throw new ApsComException(50031,"(SBM0985)発注番号が未入力です");
				} else {
					if ( acptCmpltDate == null ) {
						throw new ApsComException(50261,"(SBM0986)受入完了日が未入力です");
					}
				}
			}

			// < 出庫指示の更新 >
			// 出庫完了日=作業実績からの場合"作業完了日"(引数)、受入実績からの場合"受入完了日"(引数)
			// 出庫完了フラグ=1:オン
			Date cmpltDate = ( workCmpltDate != null ) ? workCmpltDate : acptCmpltDate;
			this.updateIssueInst(workOdrCd, workInProcCd, puchOdrCd, cmpltDate, 1 );

			// 出庫指示データの選択
			psIssueInst = this.selectIssueInst(workOdrCd, workInProcCd, puchOdrCd);
			rs = psIssueInst.executeQuery();

			Date issueCmpltDate = null; 								  // 出庫完了日
			while ( rs.next() ){
				// 出庫完了日 = [出庫指示]."出庫完了日"の中で再遅のもの
				if ( issueCmpltDate == null ) {
					issueCmpltDate = rs.getTimestamp("ISSUE_CMPLT_DATE");
				}

				// < 所要量の更新 >
				// 更新された出庫指示."オーダーデマンド番号"の[所要量]を更新する
				String odNo = rs.getString("OD_NO");
				String sql = "update T_OD set "
						   + " DM_STS_TYP = 9"					// デマンド状態区分=9:完了
						   + ",ISSUE_CMPLT_DATE = ?"			// 出庫完了日 = 再遅出庫完了日
						   + ",UPDATED_DATE = ?"
						   + ",UPDATED_BY = ?"
						   + ",UPDATED_PRG_NM = ?"
						   + ",MODIFY_COUNT = MODIFY_COUNT + 1 "
						   + "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setDate(1, new java.sql.Date(issueCmpltDate.getTime()));
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);
			}
			rs.close();
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psIssueInst != null)
			{
				psIssueInst.close();
			}
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

	//==========================================================================
	/**
	 * オーダ情報更新(完了解除用)
	 * 引数で渡されたオーダデマンド番号もとにオーダ情報の完了解除を行う。
	 *
	 * @param odNo オーダデマンド番号
	 * @param modifyCount 読込み時の更新数(チェックしない場合はマイナス値を設定)
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeOrderForCancel(String odNo, long modifyCount)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();
			String sql;

			// 更新数チェック
			this.checkModifyCount(odNo,modifyCount);

			// < 所要量の更新 >
			//　同一オーダデマンド番号をもつ[所要量]を更新
			sql = "update T_OD set"
				+ " ODR_STS_TYP = 2"							// 2:確定済み
				+ ",RCV_CMPLT_DATE = null"
				+ ",UPDATED_DATE = ?"
				+ ",UPDATED_BY = ?"
				+ ",UPDATED_PRG_NM = ?"
				+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
				+ "where OD_NO = ?";
			ps = _conn.prepareStatement(sql);
			ps.setTimestamp(1, new Timestamp(new Date().getTime()));
			ps.setString(2, _userInfo.getUserId());
			ps.setString(3, _userInfo.getBusinessName());
			ps.setString(4, odNo);
			ps.execute();
			ps.close();

			//this.changeCommon(odNo);

			// < 製番計画の更新 >
			// 更新された[所要量]が製番の最上位品目だった場合、
			// [製番計画]."製番状態区分"を'5:自品目確定済み'に更新
			_CmpltFlg = 0;
			this.updateJobOdr( odNo, 5 );

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	//==========================================================================
	/**
	 * デマンド情報更新(工程/完了解除用)
	 * 引数をもとにデマンド情報の完了解除処理を行う。
	 *
	 * @param workOdrCd 作業計画番号
	 * @param workInProcCd 仕掛作業コード
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeDemandForCancel(String workOdrCd, String workInProcCd)
			throws SQLException,ApsComException {
		this.changeDemandForCancel(workOdrCd, workInProcCd, "");
	}

	/**
	 * デマンド情報更新(発注/完了解除用)
	 * 引数をもとにデマンド情報の完了解除処理を行う。
	 * @param puchOdrCd 発注番号
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void changeDemandForCancel(String puchOdrCd)
			throws SQLException,ApsComException {
		this.changeDemandForCancel("", "", puchOdrCd);
	}

	/**
	 * デマンド情報更新(完了解除用メイン処理)
	 * 引数をもとにデマンド情報の完了解除処理を行う。
	 *
	 * @param workOdrCd 作業計画番号
	 * @param workInProcCd 仕掛作業コード
	 * @param puchOdrCd 発注番号
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void changeDemandForCancel(String workOdrCd, String workInProcCd, String puchOdrCd )
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		PreparedStatement psIssueInst = null;
		ResultSet rs = null;

		try {
			_log.methodStart();

			// 引数チェック
			if ( workInProcCd == null || workInProcCd.equals("") ) {
				if ( puchOdrCd == null || puchOdrCd.equals("") ) {
					throw new ApsComException(50031,"(SBM0985)発注番号が未入力です");
				}
			}

			// < 出庫指示の更新 >
			// 自動出庫データの完了解除処理
			// 出庫完了日=null,出庫完了フラグ=0:オフ
			this.updateIssueInst( workOdrCd, workInProcCd, puchOdrCd, null, 0 );

			// 出庫指示データの選択
			psIssueInst = this.selectIssueInst(workOdrCd, workInProcCd, puchOdrCd);
			rs = psIssueInst.executeQuery();

			while ( rs.next() ){
				// < 所要量の更新 >
				// 出庫指示の解除により同一オーダデマンド番号を持つ所要量を更新する
				String odNo = rs.getString("OD_NO");
				String sql = "update T_OD set "
						   + " DM_STS_TYP = 2"					// デマンド状態区分=2:確定済み
						   + ",ISSUE_CMPLT_DATE = null" 		// 出庫完了日 = null
						   + ",UPDATED_DATE = ?"
						   + ",UPDATED_BY = ?"
						   + ",UPDATED_PRG_NM = ?"
						   + ",MODIFY_COUNT = MODIFY_COUNT + 1 "
						   + "where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, odNo);
				ps.execute();
				ps.close();

				//this.changeCommon(odNo);
			}
			rs.close();
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psIssueInst != null)
			{
				psIssueInst.close();
			}
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

	//==========================================================================
	/**
	 *	出庫指示の選択準備
	 *	出庫指示を条件により選択し、レコードセットを求める準備を行う
	 *	1.1.3.2-(1) および、1.1.4.2-(1)の前処理
	 *
	 * @param workOdrCd 作業計画番号
	 * @param workInProcCd 仕掛作業コード
	 * @param puchOdrCd 発注番号
	 * @return 選択するためのPrepareStatement
	 * @throws SQLException
	 */
	private PreparedStatement selectIssueInst(String workOdrCd, String workInProcCd, String puchOdrCd)
			throws SQLException{

		_log.methodStart();
		PreparedStatement ps;

		// < 出庫指示の更新 >
		// 自動出庫データの完了解除処理
		String sql = "select * from T_ISSUE_INST "
				   + "where ISSUE_TYP = 3 ";				// 出庫指示出庫区分=3:自動出庫

		// 受入実績(発注)から
		if (workOdrCd == null || workOdrCd.equals("") ) {
			sql += "and PUCH_ODR_CD = ? "
				+  "order by ISSUE_CMPLT_DATE desc";		// 出庫完了日の降順
			ps = _conn.prepareStatement(sql);
			ps.setString(1, puchOdrCd);
		} else {
			// 作業実績(工程)から
			// 仕掛かり作業コードはnullの場合あり。
			if (workInProcCd == null || workInProcCd.equals("")) {
				sql += "and WORK_ODR_CD = ? "
					+  "and WORK_IN_PROC_CD is null "
					+  "order by ISSUE_CMPLT_DATE desc";	// 出庫完了日の降順
				ps = _conn.prepareStatement(sql);
				ps.setString(1, workOdrCd);
			} else {
				sql += "and WORK_ODR_CD = ? "
					+  "and WORK_IN_PROC_CD = ? "
					+  "order by ISSUE_CMPLT_DATE desc";	// 出庫完了日の降順
				ps = _conn.prepareStatement(sql);
				ps.setString(1, workOdrCd);
				ps.setString(2, workInProcCd);
			}
		}
		_log.methodEnd();
		// 出庫指示データの選択
		return ps;

	}
	/**
	 *	出庫指示の更新
	 *	出庫指示を条件により更新する
	 *	1.1.3.2-(1) および、1.1.4.2-(1)の処理
	 *
	 * @param workOdrCd 作業計画番号
	 * @param workInProcCd 仕掛作業コード
	 * @param puchOdrCd 発注番号
	 * @param cmpltDate 出庫完了日
	 * @param cmpltFlg 出庫完了フラグ
	 * @throws SQLException
	 */
	private void updateIssueInst(String workOdrCd, String workInProcCd,
								 String puchOdrCd, Date cmpltDate, int cmpltFlg)
			throws SQLException {

		PreparedStatement ps = null;
		try {
			_log.methodStart();

			// 自動出庫データの完了解除処理
			String sql = "update T_ISSUE_INST set"
					   + " ISSUE_CMPLT_FLG = ?" 				// 出庫完了フラグ(引数)
					   + ",ISSUE_CMPLT_DATE = ?"				// 出庫完了日(引数)
					   + ",UPDATED_DATE = ?"
					   + ",UPDATED_BY = ?"
					   + ",UPDATED_PRG_NM = ?"
					   + ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					   + "where ISSUE_TYP = 3 ";

			// 受入実績(発注)から
			if (workOdrCd == null || workOdrCd.equals("") ) {
				sql += "and PUCH_ODR_CD = ? ";
			} else {
				// 作業実績(工程)から
				// 仕掛かり作業コードはnullの場合あり。
				if (workInProcCd == null || workInProcCd.equals("")) {
					sql += "and WORK_ODR_CD = ? "
						+  "and WORK_IN_PROC_CD is null ";
				} else {
					sql += "and WORK_ODR_CD = ? "
						+  "and WORK_IN_PROC_CD = ? ";
				}
			}

			// 値のセット
			ps = _conn.prepareStatement(sql);
			int i = 1;											// PreparedStatement にセットするカウンタ
			ps.setInt(i++, cmpltFlg);
			if ( cmpltDate == null ) {
				ps.setNull(i++, Types.DATE);
			} else {
				ps.setDate(i++, new java.sql.Date(cmpltDate.getTime()));
			}
			ps.setTimestamp(i++, new Timestamp(new Date().getTime()));
			ps.setString(i++, _userInfo.getUserId());
			ps.setString(i++, _userInfo.getBusinessName());

			// 受入実績(発注)から
			if (workOdrCd == null || workOdrCd.equals("") ) {
				ps.setString(i++, puchOdrCd);
			} else {
				// 作業実績(工程)から
				// 仕掛かり作業コードはnullの場合あり。
				if (workInProcCd == null || workInProcCd.equals("")) {
					ps.setString(i++, workOdrCd);
				} else {
					ps.setString(i++, workOdrCd);
					ps.setString(i++, workInProcCd);
				}
			}
			// 更新実行
			ps.execute();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	/**
	 *	製番計画の更新
	 *	更新された[所要量]が製番の最上位品目だった場合、[製番計画]."製番状態区分"を
	 *	指定された区分に変更する
	 *	1.1.3.1-(2) および、1.1.4.1-(2)の処理
	 *
	 * @param odNo オーダデマンド番号
	 * @param jobOdrStsTyp 製番状態区分
	 * @throws SQLException
	 */
	private void updateJobOdr(String odNo, int jobOdrStsTyp)
			throws SQLException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psJoa = null;
		ResultSet rs = null;
		try {
			_log.methodStart();

			String sql = "select * from T_OD where OD_NO = ?";
			psOd = _conn.prepareStatement(sql);
			psOd.setString(1, odNo);
			rs = psOd.executeQuery();
			if ( rs.next() ) {

				int mrpOdrTyp = rs.getInt("MRP_ODR_TYP");
				String parentOdNo = rs.getString("PARENT_OD_NO");
				String jobOdrCd = rs.getString("JOB_ODR_CD");
				int jobOdrDetailNo = rs.getInt("JOB_ODR_DETAIL_NO");
				int jobOdrCancelNo = rs.getInt("JOB_ODR_CANCEL_NO");

				// 品目手配区分=製番管理品目 でかつ、親オーダデマンド番号＝NULLの場合に更新
				if (( mrpOdrTyp == 1 || mrpOdrTyp == 2 ) && parentOdNo == null) {
					sql = "update T_JOB_ODR set"
						+ " JOB_ODR_STS_TYP = ? "				// 製番状態区分の変更
						+ ",UPDATED_DATE = ?"
						+ ",UPDATED_BY = ?"
						+ ",UPDATED_PRG_NM = ?"
						+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
						+ "where JOB_ODR_CD = ? "
						+ "and JOB_ODR_DETAIL_NO = ? "
						+ "and JOB_ODR_CANCEL_NO = ?";
					ps = _conn.prepareStatement(sql);
					ps.setInt(1, jobOdrStsTyp );
					ps.setTimestamp(2, new Timestamp( new Date().getTime()) );
					ps.setString(3, _userInfo.getUserId() );
					ps.setString(4, _userInfo.getBusinessName() );
					ps.setString(5, jobOdrCd );
					ps.setInt(6, jobOdrDetailNo );
					ps.setInt(7, jobOdrCancelNo );
					ps.execute();
					ps.close();
					// 所要量オーダにて製番引当を更新
					if (_CmpltFlg != 9) {
						sql = "update T_JOB_ODR_ALC joa set"
							+ " joa.ISSUE_CMPLT_FLG = ? "
							+ ",joa.UPDATED_DATE = ?"
							+ ",joa.UPDATED_BY = ?"
							+ ",joa.UPDATED_PRG_NM = ?"
							+ ",joa.MODIFY_COUNT = MODIFY_COUNT + 1 "
							+ "where exists (select t.od_no from t_od t "
							+ "where t.parent_od_no = ? "
							+ "and t.od_no = joa.od_no)";
						psJoa = _conn.prepareStatement(sql);
						psJoa.setInt(1, _CmpltFlg);
						psJoa.setTimestamp(2, new Timestamp( new Date().getTime()) );
						psJoa.setString(3, _userInfo.getUserId() );
						psJoa.setString(4, _userInfo.getBusinessName() );
						psJoa.setString(5, odNo);
						psJoa.execute();
						psJoa.close();
					}
				}
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psOd != null)
			{
				psOd.close();
			}
			if (psJoa != null)
			{
				psJoa.close();
			}
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


	//==========================================================================
	// 以下、共通関数
	//==========================================================================

	/**
	 * 数量まるめ（切上げ型）
	 * 引数で渡された数量、在庫数量単位区分をもとに数量まるめを行う。
	 *	1.整数管理で、引数＝小数値の場合、小数値を切上げて整数に変換する
	 *	2.小数管理で、引数の小数第5位≠0の場合、小数第5位を切上げる
	 *	3.小数管理で、引数の小数第5位＝0の場合、小数第5位以下を切り捨てる
	 *
	 * @param qty 数量
	 * @param unitQtyTyp 在庫数量単位区分番号
	 * @return 数量まるめ結果
	 */
	private double changeQtyUp(double qty, int unitQtyTyp){

		_log.methodStart();
		double result = 0;

		// 在庫数量単位区分＝整数管理
		if ( unitQtyTyp == 1 ) {
			result = Math.ceil( qty );
		}
		//在庫数量単位区分＝小数管理
		if ( unitQtyTyp == 2 ) {
			if ( (int)( qty * 100000 ) % 10 == 0 ) {
				// 小数点第5位がゼロの場合は小数点第5位以下を切り捨てる
				result = Math.floor( qty * 10000.0 ) / 10000;
			} else {
				// 小数点第5位がゼロ以外の場合は小数点第5位を切上げる
				result = Math.ceil( qty * 10000.0 ) / 10000;
			}
		}
		_log.methodEnd();
		return result;
	 }

	/**
	 * 日付関数(日付の最遅日を返す)
	 * @return 最遅日(2099年の日付)
	 */
	private Date getLastDate(){
		Calendar lastDate = Calendar.getInstance();
		lastDate.set(Calendar.YEAR, 2099);
		return lastDate.getTime();
	}
	/**
	 * 日付関数(日付の最早日を返す)
	 * @return 最早日(1901年の日付)
	 */
	private Date getFirstDate(){
		Calendar firstDate = Calendar.getInstance();
		firstDate.set(Calendar.YEAR, 1901);
		return firstDate.getTime();
	}

	/**
	 * 業務運用日を取得
	 * # 実は汎用備品があるのかもしれないが
	 *
	 * @return 業務運用日
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private Date getBusinessOprDate()
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		java.util.Date retDate = null;
		ResultSet rs = null;
		try {
			_log.methodStart();

			String sql = "select * from SYS_DATE_CTRL where PLANT_CD = ?";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, _plantCd);
			rs = ps.executeQuery();
			if ( rs.next() ) {
				retDate = rs.getDate("BUSINESS_OPR_DATE");
			} else {
				rs.close();
				_log.methodEnd();
				throw new ApsComException(50700,"(SBM0977)対象データが存在しません");
			}
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
		return retDate;
	}

	/**
	 * 所要量再展開依頼、所要量計算制御の更新を行う
	 *
	 * @param odNo オーダデマンド番号
	 * @param count 更新数
	 * @throws SQLException
	 * @throws ApsComException
	 */
	private void checkModifyCount(String odNo, long count)
			throws SQLException,ApsComException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			_log.methodStart();
			if (count >= 0) {

				String sql = "select * from T_OD where OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, odNo);
				rs = ps.executeQuery();
				if (rs.next()) {
					if (rs.getLong("MODIFY_COUNT") != count) {
						rs.close();
						_log.methodEnd();
						throw new ApsComException(50802, "(SBM0978)既に他者によって更新されています");
					}
				}
				rs.close();
				ps.close();
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
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
	 * 所要量再展開依頼、所要量計算制御の更新を行う
	 *
	 * @param odNo オーダデマンド番号
	 * @throws SQLException
	 */
	private void changeCommon(String odNo)
			throws SQLException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psMrpReex = null;
		ResultSet rsOd = null;
		PreparedStatement stmt = null;
		ResultSet rsMrpReex = null;
		try {
			_log.methodStart();
			String sql;
			int rsRows;

			sql = "select * from T_OD where OD_NO = ?";
			psOd = _conn.prepareStatement(sql);
			psOd.setString(1, odNo);
			rsOd = psOd.executeQuery();

			if ( rsOd.next() ) {
				String jobOdrCd = rsOd.getString("JOB_ODR_CD");
				int jobOdrDetailNo = rsOd.getInt("JOB_ODR_DETAIL_NO");
				int jobOdrCancelNo = rsOd.getInt("JOB_ODR_CANCEL_NO");
				int odLevelNo = rsOd.getInt("OD_LEVEL_NO");

				// << 所要量再展開依頼の更新 >>
				// もし既に存在していればなにもしない。
				sql = "select * from T_MRP_REEXPLOSION "
					+ "where OD_NO = ? "						// オーダデマンド番号
					+ "and PLANT_CD = ? "						// 工場コード
					+ "and JOB_ODR_CD = ? " 					// 製番
					+ "and JOB_ODR_DETAIL_NO = ? "				// 製番枝番
					+ "and JOB_ODR_CANCEL_NO = ? "				// 製番取消発生番号
					+ "and OD_LEVEL_NO = ? ";					// 所要量レベル番号
				psMrpReex = _conn.prepareStatement(sql);
				psMrpReex.setString(1, odNo);
				psMrpReex.setString(2, _plantCd);
				psMrpReex.setString(3, jobOdrCd);
				psMrpReex.setInt(4, jobOdrDetailNo);
				psMrpReex.setInt(5, jobOdrCancelNo);
				psMrpReex.setInt(6, odLevelNo);
				rsMrpReex = psMrpReex.executeQuery();

				if ( ! rsMrpReex.next() ) {

					sql = "insert into T_MRP_REEXPLOSION ( "
						+ " OD_NO"								// オーダデマンド番号
						+ ",PLANT_CD"							// 工場コード
						+ ",JOB_ODR_CD" 						// 製番
						+ ",JOB_ODR_DETAIL_NO"					// 製番枝番
						+ ",JOB_ODR_CANCEL_NO"					// 製番取消発生番号
						+ ",OD_LEVEL_NO"						// 所要量レベル番号
						+ ",CREATED_BY" 						// 作成者
						+ ",CREATED_PRG_NM" 					// 作成プログラム名
						+ ",UPDATED_BY" 						// 更新者
						+ ",UPDATED_PRG_NM" 					// 更新プログラム名
						+ ",MODIFY_COUNT"						// 更新数

						+ ") values ("

						+ "?"						  // オーダデマンド番号
						+ ",?" 						  // 工場コード
						+ ",?" 						  // 製番
						+ ",?" 						  // 製番枝番
						+ ",?" 						  // 製番取消発生番号
						+ ",?" 						  // 所要量レベル番号
						+ ",?"			 			  // 作成者
						+ ",?"		 				  // 作成プログラム名
						+ ",?"						  // 更新者
						+ ",?"		 				  // 更新プログラム名
						+ ",0" 						  // 更新数
						+ ")";

					stmt = _conn.prepareStatement(sql);
					stmt.setString(1, odNo);
					stmt.setString(2, _plantCd);
					stmt.setString(3, jobOdrCd);
					stmt.setInt(4, jobOdrDetailNo);
					stmt.setInt(5, jobOdrCancelNo);
					stmt.setInt(6, odLevelNo);
					stmt.setString(7, _userInfo.getUserId());
					stmt.setString(8, _userInfo.getBusinessName());
					stmt.setString(9, _userInfo.getUserId());
					stmt.setString(10, _userInfo.getBusinessName());
					stmt.execute();
					stmt.close();
				}

				// << 所要量計算制御の更新 >>
				// 所要量メンテナンス中フラグを1:処理中に変更する。
				sql = "update SYS_OD_CALC_CTRL set"
					+ " OD_MNT_FLG = 1 "
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where PLANT_CD = ? ";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, _plantCd);
				ps.execute();
				ps.close();
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (psOd != null)
			{
				psOd.close();
			}
			if (psMrpReex != null)
			{
				psMrpReex.close();
			}
			if (rsOd != null) {
				try {
					rsOd.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsOd = null;
			}
			if (stmt != null){
				try{
					stmt.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				stmt = null;
			}
			if (rsMrpReex != null){
				try{
					rsMrpReex.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsMrpReex = null;
			}
		}

 	}

	/**
	 * 手配着手日の計算
	 *
	 * @param difference 差分 (=手配リードタイム)
	 * @param prdStartDate 基準日 (=製造着手日)
	 * @return 手配着手日
	 * @throws ApsComException
	 */
	private Date calcOdrStartDate(int difference, Date startDate)
			throws ApsComException {

		_log.methodStart();
		Date odrStartDate = null;

		// ★★ 稼働日算出部品の呼び出し
		WorkCalendar workDay = null;
		try{
			workDay = new WorkCalendar( _iconn, _userInfo.getUserId(), _userInfo.getBusinessName(),
										   _plantCd, startDate, -difference, false );
			odrStartDate = workDay.calcDate();
			workDay = null;
		}
		catch (FoundationException ex) {
			_log.methodEnd();
			throw new ApsComException(50553,"(SBM0979)オーダデマンド番号採番データが存在しません");
		}
/*
		try {
			//　工場コードよりカレンダ情報を取得
			String sql = "select * from M_PLANT where PLANT_CD = ? ";
			PreparedStatement ps = _conn.prepareStatement(sql);
			ps.setString(1, _plantCd);
			ResultSet rsPlant = ps.executeQuery();
			if (rsPlant.next()) {
				int calNo = rsPlant.getInt("CAL_NO");
				odrStartDate = getActiveDate(calNo, startDate, difference);
			} else {
				rsPlant.close();
				_log.methodEnd();
				throw new ApsComException(50700, "対象データが存在しません");
			}
			rsPlant.close();
			ps.close();
		}
		catch (Exception ex) {
			_log.methodEnd();
			throw new ApsComException(50553, "オーダデマンド番号採番データが存在しません");
		}
*/
		_log.methodEnd();
		return odrStartDate;
	}

	/**
	 * 稼働日算出(再帰関数)
	 * 引き数で渡ってきた日付と差分から稼働日を算出する。差分がある時は再帰呼び出し。
	 * # 汎用部品があるのでそちらを利用
	 *
	 * @param calNo カレンダ番号
	 * @param date 対象日付
	 * @param difference 差分
	 * @return 算出稼働日
	 * @throws SQLException
	 * @throws ApsComException
	 */
/*
	private Date getActiveDate(int calNo, Date date, int difference)
			throws SQLException,ApsComException {

		_log.methodStart();

		// # M_CAL.CAL_DATE は、VERCHAR項目。<-なんで??
		// # TO_DATE で変換するのはOracle固有になるので文字での比較を行う。
		String sql = "select * from M_CAL where CAL_NO = ? and CAL_DATE = ?";
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		String sDate = f.format(date);
		Date retDate = null;

		// [カレンダ]を検索し、稼働日か調べる
		PreparedStatement ps = _conn.prepareStatement(sql);
		ps.setInt(1, calNo);								// カレンダ番号
		ps.setString(2, sDate); 							// 日付
		ResultSet rs = ps.executeQuery();

		if ( rs.next() ) {
			int isHoliday = rs.getInt("HOLIDAY_FLG");
			// 差分=0 & その日が稼働日ならば、その日が対象日
			if (isHoliday == 0 && difference == 0) {
				_log.methodEnd();
				return date;
			}
			// 稼働日ならば差分を減らし、再帰呼び出しを行う
			if (isHoliday == 0) {
				difference--;
			}
			// 日付を一日戻す
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, -1);
			Date yesterday = cal.getTime();
			// 再帰呼び出し
			retDate = this.getActiveDate(calNo, yesterday, difference);

		} else {
			rs.close();
			_log.methodEnd();
			throw new ApsComException(50502,"カレンダ明細データが存在しません");
		}
		rs.close();
		ps.close();

		_log.methodEnd();
		return retDate;
	}
*/
	/**
	 * オーダデマンド番号採番
	 *
	 * @return オーダデマンド番号
	 * @throws ApsComException
	 */
	private String getNewOdNo()
			throws ApsComException {

		_log.methodStart();

		String newOdNo = "";

		// ★★ 採番部品の呼び出し
		try{
			Numbering cn = new Numbering( _iconn,Numbering.ODNO,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd );
			newOdNo = cn.getNo();
			cn = null;
		} catch (FoundationException ex) {
			_log.methodEnd();
			throw new ApsComException(50553,"(SBM0979)オーダデマンド番号採番データが存在しません");
		}

/*
		// ★★ 番号採番
		// 採番部品を使わない簡易版->エラーチェック等いいかげんです
		// 上記 orteus版を有効にしららこちらをコメントアウトしてください
		try {
			String sql = "select * from SYS_OD_NO_CTRL where PLANT_CD = ? ";
			PreparedStatement ps = _conn.prepareStatement(sql);
			ps.setString(1, _plantCd);
			ResultSet rs = ps.executeQuery();
			if ( rs.next() ) {
				java.math.BigDecimal odNo = new java.math.BigDecimal(rs.getString("OD_NO"));
				odNo = odNo.add( new java.math.BigDecimal(1) );
				newOdNo = "00000000000000000000000" + odNo.toString();
				newOdNo = newOdNo.substring(newOdNo.length() - 23);

				sql = "update SYS_OD_NO_CTRL set"
					+ " OD_NO = ?" // オーダデマンド番号
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where PLANT_CD = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, newOdNo.toString());
				ps.setTimestamp(2, new Timestamp(new Date().getTime()));
				ps.setString(3, _userInfo.getUserId());
				ps.setString(4, _userInfo.getBusinessName());
				ps.setString(5, _plantCd);
				ps.execute();
				newOdNo = _plantCd + newOdNo;
			}
		} catch (Exception ex) {
			_log.methodEnd();
			throw new ApsComException(50553,"オーダデマンド番号採番データが存在しません");
		}
		// ★★ ここまで*************************
*/
		_log.methodEnd();
		return newOdNo;
	}

	/**
	 *　ユーザ情報保持用クラス(インナークラス)
	 */
	class UserInfo {

		private String userId;			   // ユーザID
		private String businessName;	   // 業務名

		public UserInfo(String userId, String businessName) {
			this.userId = userId;
			this.businessName = businessName;
		}
		public String getUserId() {
			return userId;
		}
		public String getBusinessName() {
			return businessName;
		}
	}
	/**
	 * ログ出力(インナークラス)
	 */
	class Log {
		private int indent = 0;
		private SystemLog _syslog = new SystemLog();   // ★★ログ出力クラス

		// コンストラクタ	  // 2003/08/11 connection取得部修正
		public Log(String packageName,IDbConnection conn){
			// ★★ 初期化
			_syslog.init(packageName);
			_syslog.setConnection(conn);
		}

		public void methodStart() {
			log("start");
			indent++;
		}
		public void methodEnd() {
			indent--;
			log("end");
		}
		public void message(String message) {
			log(message);
		}
		private void log(String message) {

			// このメソッドを呼び出したメソッドを取得
			// (JDK1.3の場合SecurityManager#getStackTrace()を使う)
			StackTraceElement e = (new Throwable()).getStackTrace()[2];
			String className = e.getClassName();
			String methodName = e.getMethodName();

			// パッケージ名を除くクラス名を取得
			StringTokenizer st = new StringTokenizer(className, ".");
			String lastClassName = "";
			while (st.hasMoreTokens()) {
				lastClassName = st.nextToken();
			}
			// 今の時間を取得
			Date now = new Date();
			SimpleDateFormat f = new SimpleDateFormat("M/d HH:mm:ss.SSS");
			String sNow = f.format(now);
			String out = sNow + " <" + indent + "> [" + lastClassName + "/" + methodName + "] " +  message;

			// ★★ ログ出力
			_syslog.fine_d( out, _userInfo.getUserId() );

			// ログ出力(System.out版)
			//System.out.println(out);
		}
	}
}
