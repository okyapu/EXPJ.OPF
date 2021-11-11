/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ATCommonOd.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 * Copyright (c) 2003-2004 NEC Nexsolution Ltd.
 *
 */
//package com.nec.jp.orteus.expj.mrp;
package com.nec.jp.orteus.expj.util;



import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;


//
import com.nec.jp.orteus.expj.util.DateTimeFormat;


/**
 *(#)ATCommonOd.java
 *
 * Copyright (c) 2008 NEXS,Ltd.
 *
 * @author nexs.ima
 * Date : 2008/12/09
 * @version 1.00
 * <pre>
 * History 
 * 2008/07/07 新規 CommonOd.javaよりコピーして新規作成 nexs.ima
 * 2008/07/24 新規 For AT nexs.ima
 * 2008/09/24 生産計画で要求納期を設定させるように変更 nexs.ima
 * 2008/10/09 AT向け新LTルール（別紙）に全体を対応 nexs.ima
 *   
 * ・For AT Chk:20081208
 * 
 * ATCommonOdクラス
 * 所要量の共通処理を行う
 *	 - オーダデマンド情報更新(計画変更用)	changeOdInfo
 *	 - オーダデマンド情報追加				addOdInfo
 *	 - 所要量処理区分変更					changeMrpTypToDelete
 *
 *-------------------------------------------------OriSpc
 *CommonOd.java
 * 所要量の共通処理を行う
 *	 - オーダデマンド情報更新(計画変更用)	changeOdInfo
 *	 - オーダデマンド情報追加				addOdInfo
 *	 - 所要量処理区分変更					changeMrpTypToDelete
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
 * @version $Revision: 1.7 $ $Date: 2015/12/03 09:06:19 $
 */

public class ATCommonOd {

	private IDbConnection _iconn;				 // トランザクションコネクション情報
	private Connection _conn;					 // コネクション情報
	private String _plantCd;					 // 工場コード
	private UserInfo _userInfo; 				 // 利用者管理情報(インナークラス)
	private Log _log;							 // ログ情報(インナークラス)

	/**
	 * コンストラクタ
	 * newするときには下記のパラメータを送る。工場コード,ユーザID,業務名は別途setterで設定し直すことも可能
	 *
	 * @param conn コネクション情報
	 * @param plantCd 工場コード
	 * @param userId ユーザID
	 * @param businessName 業務名
	 */
	public ATCommonOd(IDbConnection conn, String plantCd, String userId, String businessName) {

		_iconn = conn;
		_conn = _iconn.getConn();
		_plantCd = plantCd;
		_userInfo = new UserInfo(userId, businessName);

		// ログ用部品の初期化を行う
		String packageName = this.getClass().getName();
		packageName = packageName.substring(0,packageName.lastIndexOf("."));
		_log = new Log(packageName,_iconn); 										// 2003/08/11
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
	 * @param odOutsideTyp 所要量内外作区分（1：内作、2：外作）ADD AT 20080707
	 * @return 追加したオーダレコードのオーダデマンド番号
	 * @throws SQLException
	 * @throws ApsComException
	 * @throws FoundationException 
	 */
	public String addOdInfo(	String itemCd, 
								Date prdDueDate, 
								Date prdStartDate,
								double odrQty, 
								int odGnrTyp, 
								int odOutsideTyp 	//ADD AT 20080707
								)
			throws SQLException,ApsComException, FoundationException {

		PreparedStatement ps = null;
		String odNo = null;
		ResultSet rsItem = null;
		try {
			_log.methodStart();
			
			Date odrStartDate = prdStartDate;

			//製造着手日→（手配LT）→手配着手日 CHG 20081009			
			ATAspBom ab = new ATAspBom(
					_iconn, 
					_plantCd, 
					_userInfo.userId, 
					_userInfo.getBusinessName());
			String sShiftMin = ab.getOdrLtMin(itemCd,"U");
			sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
			ATWorkCalendar atWC = new ATWorkCalendar(
					_iconn, 
					_userInfo.userId, 
					_userInfo.businessName, 
					_plantCd) ;
			odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);
			//20081009 ------------E
			
			// << 所要量へオーダー情報を追加する >>
			odNo = this.getNewOdNo();							  // オーダデマンド番号採番
			//this.insertOd(odNo,itemCd,odrStartDate,prdDueDate,prdStartDate,odrQty,odGnrTyp);
			this.insertOd(odNo,itemCd,odrStartDate,prdDueDate,prdStartDate,odrQty,odGnrTyp, 
					odOutsideTyp);								//CHG AT 20080707 
			
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
			if (rsItem != null){
				try{
					rsItem.close();
				}catch(Exception e){
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
	 * @param odOutsideTyp 所要量内外作区分（1：内作、2：外作）ADD AT 20080707
	 * @throws SQLException
	 * @throws ApsComException
	 * @throws FoundationException 
	 */
	private void insertOd(	String odNo, 
							String itemCd, 
							Date odrStartDate,
							Date prdDueDate,
							Date prdStartDate, 
							double odrQty, 
							int odGnrTyp ,
							int odOutsideTyp )
			throws SQLException,ApsComException, FoundationException {
			//-------オーダー側--------MAIN-Ins
		
		PreparedStatement ps = null;
		ResultSet rsItem = null;
		PreparedStatement pstmt = null;
		try {
			_log.methodStart();

			// << 品目の検索 >>
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, itemCd);
			rsItem = ps.executeQuery();

			if ( rsItem.next() ) {
				
				//製造納期→（払出LT：M_ASP_BOM.TASK3_EXPR）→要求納期 ADD AT 20080924
				ATAspBom ab = new ATAspBom(_iconn, _plantCd, 
   						_userInfo.userId, 
   						_userInfo.getBusinessName());
   				String sShiftMin = ab.getIssueLtMin(itemCd,"U");
   				
				ATWorkCalendar atWC 
					= new ATWorkCalendar(_iconn, 
											_userInfo.userId, 
											_userInfo.businessName, 
											_plantCd) ;
				Date dueDate = atWC.calcShiftMinute(prdDueDate, sShiftMin);
				
				String sDueDate = getMySimpleDateFormat().format(dueDate);
				//-------20080924
				
				String sodrStartDate = getMySimpleDateFormat().format(odrStartDate);
				String sprdDueDate = getMySimpleDateFormat().format(prdDueDate);
				String sprdStartDate = getMySimpleDateFormat().format(prdStartDate);

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
					+ ",null"									 // 引当グループコード
					+ ",?" 					 // 工場コード
					+ ",?"	 // 品目番号
					+ ",null"									 // 所要量品目構成版数
					+ ",null"									 // 製番
					+ ",0"										 // 製番枝番
					+ ",0"										 // 製番取消発生番号
					+ ",2"										 // オーダ状態区分
					+ ",0"										 // デマンド状態区分
					+ ",2"										 // オーダデマンド区分
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // 要求納期 CHG AT 20080924
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // 手配着手日
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // 製造納期
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // 製造着手日
					+ ",0"										 // デマンド数
					+ ",?"								 // オーダ数
					+ ",?"		 // 品目手配区分
					+ ",?"							// 所要量内外作区分 CHG AT 20080707
					+ ",?"			 // 所要量出庫区分
					+ ",?" 			 // 手配リードタイム
					+ ",?"			 // 固定分リードタイム
					+ ",?"			 // 比例分リードタイム
					+ ",?"			 // 安全日数
					+ ",?"			 // 払出リードタイム
					+ ",?"	 // 比例分ロットサイズ
					+ ",0"										 // 製品構成リードタイム使用フラグ
					+ ",0"										 // 製品構成固定分リードタイム
					+ ",0"										 // 製品構成比例分リードタイム
					+ ",0"										 // 製品構成比例分ロットサイズ
					+ ",0"										 // 製品構成単位数	  ★★
					+ ",0"										 // 製品構成単位数分子 ★★
					+ ",1"										 // 製品構成単位数分母 ★★
					+ ",0"										 // 入庫累計数
					+ ",null"									 // 入庫完了日
					+ ",0"										 // 出庫指示累計数
					+ ",0"										 // 出庫累計数
					+ ",null"									 // 出庫完了日
					+ ",?"							 // 所要量発生処理区分
					+ ",1"										 // 所要量レベル番号
					+ ",null"									 // 親オーダデマンド番号
					+ ",?"		 // 所要量品目仕損率
					+ ",0"										 // 所要量構成仕損率
					+ ",0"										 // 構成支給区分
					+ ",null"									 // 所要量有効開始日
					+ ",null"									 // 所要量有効終了日
					+ ",9"										 // 所要量処理区分
					+ ",0"										 // 外部デマンドフラグ
					+ ",1"										 // オーダ発効済フラグ
					+ ",?"		 // 作成者
					+ ",?"	 // 作成プログラム名
					+ ",?"		 // 更新者
					+ ",?"	 // 更新プログラム名
					+ ",0"										 // 更新数
					+ ")";

				// # ここは PreparedStatement を使わない。? がたくさん並んでデバッグしづらいから。
				pstmt = _conn.prepareStatement(sql);
				pstmt.setString(1, odNo);
				pstmt.setString(2, _plantCd);
				pstmt.setString(3, rsItem.getString("ITEM_CD"));
				pstmt.setString(4, sDueDate);
				pstmt.setString(5, sodrStartDate);
				pstmt.setString(6, sprdDueDate);
				pstmt.setString(7, sprdStartDate);
				pstmt.setDouble(8, odrQty);
				pstmt.setInt(9, rsItem.getInt("MRP_ODR_TYP"));
				pstmt.setInt(10, odOutsideTyp);
				pstmt.setInt(11, rsItem.getInt("ISSUE_TYP"));
				pstmt.setInt(12, rsItem.getInt("ODR_LT"));
				pstmt.setInt(13, rsItem.getInt("FIXED_LT"));
				pstmt.setInt(14, rsItem.getInt("PROP_LT"));
				pstmt.setInt(15, rsItem.getInt("SAFETY_LT"));
				pstmt.setInt(16, rsItem.getInt("ISSUE_LT"));
				pstmt.setDouble(17, rsItem.getDouble("PROP_LOT_SIZE"));
				pstmt.setInt(18, odGnrTyp);
				pstmt.setDouble(19, rsItem.getDouble("ITEM_SPOIL"));
				pstmt.setString(20, _userInfo.getUserId());
				pstmt.setString(21, _userInfo.getBusinessName());
				pstmt.setString(22, _userInfo.getUserId());
				pstmt.setString(23, _userInfo.getBusinessName());
				int rsRows = pstmt.executeUpdate();
				pstmt.close();
				rsItem.close();
				ps.close();

				//this.changeCommon(odNo);

			} else {
				rsItem.close();
				ps.close();
				throw new ApsComException(50509,"(SBM0981) 品目データが存在しません");
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
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				pstmt = null;
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
	 * @throws FoundationException 
	 */
	private void makeUnderDemand(	String itemCd, 
									String parentOdNo,
									Date prdDueDate,
									Date odrStartDate, 
									double odrQty, 
									int odGnrTyp, 
									int odLevelNo)
			throws SQLException,ApsComException, FoundationException {

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
	 * @throws FoundationException 
	 */
	private void insertOd(	ResultSet rsPs, 
							String parentOdNo, 
							double parentOdrQty,
							Date parentOdrStartDate, 
							Date parentPrdDueDate, 
							int odGnrTyp, 
							int odLevelNo )
			throws SQLException,ApsComException, FoundationException {
		//-------デマンド側--------SUB-

		PreparedStatement ps = null;
		ResultSet rsItem = null;
		PreparedStatement pstmt = null;
		try {
			_log.methodStart();

			//----20081111 LT
			String sShiftMin ;
			ATAspBom ab = new ATAspBom(
					_iconn, 
					_plantCd, 
					_userInfo.userId, 
					_userInfo.getBusinessName());
			ATWorkCalendar atWC = new ATWorkCalendar(
					_iconn, 
					_userInfo.userId, 
					_userInfo.businessName, 
					_plantCd) ;
			//-------------------

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
					//dmQty = parentOdrQty * psUnitQty;
					dmQty = new BigDecimal(parentOdrQty).multiply(new BigDecimal(psUnitQty)).doubleValue();
				} else {
					// 疑似品目以外の場合、親のオーダ数量*構成単位(丸め前)*(1+ 構成仕損率/100)
					dmQty = new BigDecimal(parentOdrQty).multiply(new BigDecimal(psUnitQty).multiply( new BigDecimal("1").add(new BigDecimal(psSpoil / 100D))) ).doubleValue();
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
					dueDate = this.calcOdrStartDate(0,dueDate,rsPs.getString("COMP_ITEM_CD"));
				} else {
					
					// 20081009 親の製造納期→（構成LT）→子の要求納期
					//M_ASP_BOM.TIMECONSTRAINT_MINから構成LTを取得
					dueDate = parentPrdDueDate;
					//構成LT分過去へシフト
					sShiftMin = ab.getPsLtMin(
							rsPs.getString("PARENT_ITEM_CD"),
							rsPs.getString("COMP_ITEM_CD"),
							"I");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					dueDate = atWC.calcShiftMinute(parentPrdDueDate, sShiftMin, ATWorkCalendar.SHIFT_END);
					//20081009 ------------E

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

				if ( odTyp == 4 ) {	//MEMO 擬似内のLTは旧仕様→擬似内も新仕様(20081111)

					// オーダ数 = デマンド数量 * ( 1 + ( 所要量品目仕損率 / 100 )-------
					odrQty = dmQty * ( 1 + itemSpoil / 100D );
					odrQty = changeQtyUp(odrQty,unitQtyTyp);   // 丸め処理

					//--------------20081111 LTシフトを、ASP_BOMからに変更
					// <製造納期>擬似
					//■製造納期 = 要求納期 - 払出リードタイム (稼働日チェック)-------------------------
					prdDueDate = dueDate;
					sShiftMin = ab.getIssueLtMin(
							rsPs.getString("COMP_ITEM_CD"),
							"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					prdDueDate = atWC.calcShiftMinute(dueDate, sShiftMin, ATWorkCalendar.SHIFT_END);
					//---------
					
					// <製造着手日>擬似
					//■製造着手日 = 製造納期 - 製造LT(TASK2_EXPR)-------------------------
					if ( propLotSize == 0) {
						rsItem.close();
						 _log.methodEnd();
						throw new ApsComException(50416,"(SBM0983) 比例分ロットサイズが未入力です");
					}
					int propQty = (int) Math.ceil( odrQty / propLotSize );
					// 比例分数量=0 の場合、=1とする
					if ( propQty == 0 ) {
						propQty = 1;
					}
					prdStartDate = prdDueDate;
					sShiftMin = ab.getProdLtMin(
							rsPs.getString("COMP_ITEM_CD"),
							 String.valueOf(odrQty),
							 String.valueOf(propLotSize),
							"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					prdStartDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_START);
					//---------

					// <手配着手日>擬似
					//■手配着手日 = 製造納期 - 手配リードタイム (稼働日チェック)-------------------------
					odrStartDate = prdStartDate;
					sShiftMin = ab.getOdrLtMin(
							rsPs.getString("COMP_ITEM_CD"),
							"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);
					//---------
					
				}
				
				// SQL文変換
				String sDueDate = getMySimpleDateFormat().format(dueDate); // 要求納期
				String sPrdDueDate = getMySimpleDateFormat().format(prdDueDate); // 製造納期
				String sOdrStartDate = null;							  // 手配着手日
				String sPrdStartDate = null;							  // 製造着手日
				if ( odrStartDate != null ) {
					sOdrStartDate = getMySimpleDateFormat().format(odrStartDate);
					sPrdStartDate = getMySimpleDateFormat().format(prdStartDate);
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

					+ "?"								 // オーダデマンド番号
					+ ",null"										 // 引当グループコード
					+ ",?" 						 // 工場コード
					+ ",?"	 // 品目番号
					+ ",?" 	 // 所要量品目構成版数
					+ ",null"									 // 製番
					+ ",0"										 // 製番枝番
					+ ",0"										 // 製番取消発生番号
					+ ",?"							 // オーダ状態区分
					+ ",?"							 // デマンド状態区分
					+ ",?"								 // オーダデマンド区分
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // 要求納期
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // 手配着手日
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // 製造納期
					+ ",TO_DATE(?,'YYYY/MM/DD HH24:MI:ss')" // 製造着手日
					+ ",?"								 // デマンド数
					+ ",?" 								 // オーダ数
					+ ",?" 		 // 品目手配区分
					+ ",?"		 // 所要量内外作区分
					+ ",?"			 // 所要量出庫区分
					+ ",?"								 // 手配リードタイム
					+ ",?"  							 // 固定分リードタイム
					+ ",?"								 // 比例分リードタイム
					+ ",?"							 // 安全日数
					+ ",?" 							 // 払出リードタイム
					+ ",?" 						 // 比例分ロットサイズ
					+ ",?"  							 // 製品構成リードタイム使用フラグ
					+ ",?"							 // 製品構成固定分リードタイム
					+ ",?"							 // 製品構成比例分リードタイム
					+ ",?"						 // 製品構成比例分ロットサイズ
					+ ",?"							 // 製品構成単位数	  ★★
					+ ",?" 						 // 製品構成単位数分子 ★★
					+ ",?"						 // 製品構成単位数分母 ★★
					+ ",0"										 // 入庫累計数
					+ ",null"									 // 入庫完了日
					+ ",0"										 // 出庫指示累計数
					+ ",0"										 // 出庫累計数
					+ ",null"									 // 出庫完了日
					+ ",?"							 // 所要量発生処理区分
					+ ",?"							 // 所要量レベル番号
					+ ",?"					 // 親オーダデマンド番号
					+ ",?"							 // 所要量品目仕損率
					+ ",?" 							 // 所要量構成仕損率
					+ ",?" 			 // 構成支給区分
					+ ",TO_DATE(?,'YYYY/MM/DD')" // 所要量有効開始日
					+ ",TO_DATE(?,'YYYY/MM/DD')" // 所要量有効終了日
					+ ",9"										 // 所要量処理区分
					+ ",0"										 // 外部デマンドフラグ
					+ ",0"										 // オーダ発効済フラグ
					+ ",?"		 // 作成者
					+ ",?"	 // 作成プログラム名
					+ ",?"		 // 更新者
					+ ",?"	 // 更新プログラム名
					+ ",0"										 // 更新数
					+ ")";

				// # ここは PreparedStatement を使わない。? がたくさん並んでデバッグしづらいから。
				pstmt = _conn.prepareStatement(sql);
				pstmt.setString(1, odNo);
				pstmt.setString(2, _plantCd);
				pstmt.setString(3, rsPs.getString("COMP_ITEM_CD"));
				pstmt.setString(4, rsPs.getString("PS_EDITION"));
				pstmt.setInt(5, odrStsTyp);
				pstmt.setInt(6, dmStsTyp);
				pstmt.setInt(7, odTyp);
				pstmt.setString(8, sDueDate);
				pstmt.setString(9, sOdrStartDate);
				pstmt.setString(10, sPrdDueDate);
				pstmt.setString(11, sPrdStartDate);
				pstmt.setDouble(12, dmQty);
				pstmt.setDouble(13, odrQty);
				pstmt.setInt(14, rsItem.getInt("MRP_ODR_TYP"));
				pstmt.setInt(15, rsItem.getInt("OUTSIDE_TYP"));
				pstmt.setInt(16, rsItem.getInt("ISSUE_TYP"));
				pstmt.setInt(17, odrLt);
				pstmt.setInt(18, fixedLt);
				pstmt.setInt(19, propLt);
				pstmt.setInt(20, safetyLt);
				pstmt.setInt(21, issueLt);
				pstmt.setDouble(22, propLotSize);
				pstmt.setInt(23, psLtFlg);
				pstmt.setInt(24, psFixedLt);
				pstmt.setInt(25, psPropLt);
				pstmt.setDouble(26, psPropLotSize);
				pstmt.setDouble(27, psUnitQty);
				pstmt.setDouble(28, psNumerator);
				pstmt.setDouble(29, psDenominator);
				pstmt.setInt(30, odGnrTyp);
				pstmt.setInt(31, odLevelNo);
				pstmt.setString(32, parentOdNo);
				pstmt.setDouble(33, itemSpoil);
				pstmt.setDouble(34, psSpoil);
				pstmt.setInt(35, rsPs.getInt("CONS_TYP"));
				pstmt.setString(36, ""+effPhaseInDate);
				pstmt.setString(37, ""+effPhaseOutDate);
				pstmt.setString(38, _userInfo.getUserId());
				pstmt.setString(39, _userInfo.getBusinessName());
				pstmt.setString(40, _userInfo.getUserId());
				pstmt.setString(41, _userInfo.getBusinessName());
				int rsRows = pstmt.executeUpdate();
				pstmt.close();
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
				throw new ApsComException(50509,"(SBM0981) 品目データが存在しません");
			}
			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
			if (rsItem != null){
				try{
					rsItem.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsItem = null;
			}
			if (pstmt != null){
				try{
					pstmt.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				pstmt = null;
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
	 * @param odOutsideTyp 所要量内外作区分（1：内作、2：外作）ADD AT 20080707
	 * @throws SQLException
	 * @throws ApsComException
	 * @throws FoundationException 
	 */
	public void changeOdInfo(	String odNo, 
								long modifyCount,
								int odOutsideTyp 	//ADD AT 20080707
								)
			throws SQLException,ApsComException, FoundationException {

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
			
			String sItemCd = rs.getString("ITEM_CD");	//20081210

			// オーダ数量の累計,製造着手日の最早値,製造納期の最遅値,手配着手日の算出===========
			double odrQty = 0;											  // オーダ数量
			Date prdStartDateFirst = this.getLastDate();				  // 製造着手日最早日
			Date prdDueDateLast = this.getFirstDate();					  // 製造納期最遅日
			Date dueDate = this.getFirstDate();					  // 要求納期 ADD AT 20080708

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
				if ( rsWorkInProcByItem.getTimestamp("OPR_INST_START_DATE").before(prdStartDateFirst) ) {
					prdStartDateFirst = rsWorkInProcByItem.getTimestamp("OPR_INST_START_DATE");
					odChanged = true;
				}
				// 作業製造納期 > 製造納期最遅日の場合、製造納期最遅日を再設定		   // 2003/09/01 update
				//if ( rsWorkInProcByItem.getDate("WORK_ODR_DLV_DATE").before(prdDueDateLast) ) {
				if ( rsWorkInProcByItem.getTimestamp("WORK_ODR_DLV_DATE").after(prdDueDateLast) ) {
					prdDueDateLast = rsWorkInProcByItem.getTimestamp("WORK_ODR_DLV_DATE");
					odChanged = true;
				}
			}

			while ( rsRlsdPuchOdr.next() ) {
				// 発注算の発注数の合計
				odrQty += rsRlsdPuchOdr.getDouble("PUCH_ODR_QTY");

				// 発注着手日< 製造着手日最早日の場合、製造着手日最早日を再設定 	   // 2003/09/01 update
				//if ( rsRlsdPuchOdr.getDate("PUCH_ODR_START_DATE").after(prdStartDateFirst) ) {
				if ( rsRlsdPuchOdr.getTimestamp("PUCH_ODR_START_DATE").before(prdStartDateFirst) ) {
					prdStartDateFirst = rsRlsdPuchOdr.getTimestamp("PUCH_ODR_START_DATE");
					odChanged = true;
				}
				// 発注納期 > 製造納期最遅日の場合、製造納期最遅日を再設定			  // 2003/09/01 update
				//if ( rsRlsdPuchOdr.getDate("PUCH_ODR_DLV_DATE").before(prdDueDateLast) ) {
				if ( rsRlsdPuchOdr.getTimestamp("PUCH_ODR_DLV_DATE").after(prdDueDateLast) ) {
					prdDueDateLast = rsRlsdPuchOdr.getTimestamp("PUCH_ODR_DLV_DATE");
					odChanged = true;
				}
			}

			psWorkInProcByItem.close();
			psRlsdPuchOdr.close();

			// 算出したオーダ数 <= 0 の場合、製造着手日,製造納期は、[所容量]と同じ(変更しない)	// 2003/09/01
			Date odrStartDate = rs.getTimestamp("ODR_START_DATE");	   // [所容量].手配着手日
			if ( odrQty <= 0 ) {
				prdStartDateFirst = rs.getTimestamp("PRD_START_DATE");
				prdDueDateLast = rs.getTimestamp("PRD_DUE_DATE");
			} else {
				
				// 製造着手日最早日<>所容量.製造着手日の場合、手配着手日を再計算
				//if (prdStartDateFirst.getTime() == rs.getDate("PRD_START_DATE").getTime()) {	//2003/09/29
				if (prdStartDateFirst.getTime() != rs.getTimestamp("PRD_START_DATE").getTime()) {
					
					//■ ASP_BOMで再計算 20081209
					//CHG 20081009 -------製造着手日（最早）→（手配LT:TASK1_EXPR）→手配着手日
					ATAspBom ab = new ATAspBom(
							_iconn, 
							_plantCd, 
							_userInfo.userId, 
							_userInfo.getBusinessName());
					String sShiftMin = ab.getOdrLtMin(sItemCd,"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
					ATWorkCalendar atWC = new ATWorkCalendar(
							_iconn, 
							_userInfo.userId, 
							_userInfo.businessName, 
							_plantCd) ;
					odrStartDate = atWC.calcShiftMinute(prdStartDateFirst, sShiftMin, ATWorkCalendar.SHIFT_START);
					//20081009 ------------E

				}
				
				//製造納期最早日<>所容量.製造納期の場合、要求納期を再計算
				//----------------- 20080707 MOV20081210
				//（前回の製造納期－要求納期・今回の製造納期）→今回の要求納期
				Date oriDueDate = rs.getTimestamp("DUE_DATE");
				Date oriPrdDueDate = rs.getTimestamp("PRD_DUE_DATE");
				
				//---製造納期に変更があった場合のみ 20081209
				if(oriPrdDueDate.compareTo(prdDueDateLast) != 0){
					
					//■ ASP_BOMで再計算 製造納期→（払出LT）→要求納期 
					//製造納期→（払出LT：M_ASP_BOM.TASK3_EXPR）→要求納期 			
					ATAspBom ab = new ATAspBom(_iconn, _plantCd, 
	   						_userInfo.userId, 
	   						_userInfo.getBusinessName());
	   				String sShiftMin = ab.getIssueLtMin(sItemCd,"U");
	   				
					ATWorkCalendar atWC 
						= new ATWorkCalendar(_iconn, 
												_userInfo.userId, 
												_userInfo.businessName, 
												_plantCd) ;
					dueDate = atWC.calcShiftMinute(prdDueDateLast, sShiftMin);
					//----
					
				}else{
					dueDate = oriDueDate;
				}
				//----------------

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
						if ( rsWorkInProcByItem.getTimestamp("WORK_CMPLT_DATE").after(rcvCmpltDate) ) {
							rcvCmpltDate = rsWorkInProcByItem.getTimestamp("WORK_CMPLT_DATE");
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
						if ( rsRlsdPuchOdr.getTimestamp("INSPC_CMPLT_DATE").after(rcvCmpltDate) ) {
							rcvCmpltDate = rsRlsdPuchOdr.getTimestamp("INSPC_CMPLT_DATE");
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
					
					+ ",DUE_DATE = ?"			 	// 要求納期		//ADD AT 20080707 ※とりあえず
					+ ",OUTSIDE_TYP = ?"			// 内外作区分	//ADD AT 20080707 ※とりあえず
					
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
				
				if (dueDate == null ) {		//ADD AT 20080707
					ps.setTimestamp(2, null);
				} else {		
					ps.setTimestamp(2, new Timestamp(dueDate.getTime()));
				}
				ps.setInt(3, odOutsideTyp);	//ADD AT 20080707
				
				ps.setTimestamp(4, new Timestamp(prdDueDateLast.getTime()));
				ps.setTimestamp(5, new Timestamp(prdStartDateFirst.getTime()));
				ps.setTimestamp(6, new Timestamp(odrStartDate.getTime()));
				ps.setInt(7, odrStsTyp);
				if (rcvCmpltDate == null ) {								 // 2003/09/01
					ps.setTimestamp(8, null);
				} else {
					ps.setTimestamp(8, new Timestamp(rcvCmpltDate.getTime()));
				}
				ps.setTimestamp(9, new Timestamp(new Date().getTime()));
				ps.setString(10, _userInfo.getUserId());
				ps.setString(11, _userInfo.getBusinessName());
				ps.setString(12, odNo);				
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
			while ( rs.next() ) {		
				// 手配着手日,製造納期
				//20081210 upd
				//this.changeChildOdInfo(rs, odNo, odrQty, odrStartDate, prdDueDateLast);
				this.changeChildOdInfo(rs, odNo, odrQty, odrStartDate, prdDueDateLast, sItemCd);
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
			if (rs != null){
				try{
					rs.close();
				}catch(Exception e){
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
	 * @param parentOdrStartDate 親製造着手日
	 * @param parentPrdDueDate 親製造納期
	 * @param parentItemCd 親品目番号	Add
	 * @throws SQLException
	 * @throws ApsComException
	 * @throws FoundationException 
	 */
	public void changeChildOdInfo(	ResultSet rs, 
									String parentOdNo, 
									double parentOdrQty,
									Date parentOdrStartDate, 
									Date parentPrdDueDate,
									String parentItemCd)
			throws SQLException,ApsComException,FoundationException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psWorkInProcByItem = null;
		PreparedStatement psRlsdPuchOdr = null;
		PreparedStatement psItem = null;
		ResultSet rsOd = null;
		ResultSet rsWorkInProcByItem = null;
		ResultSet rsItem = null;
		ResultSet rsRlsdPuchOdr = null;
		try {
			_log.methodStart();

			//----20081208 LT
			String sShiftMin ;
			ATAspBom ab = new ATAspBom(
					_iconn, 
					_plantCd, 
					_userInfo.userId, 
					_userInfo.getBusinessName());
			ATWorkCalendar atWC = new ATWorkCalendar(
					_iconn, 
					_userInfo.userId, 
					_userInfo.businessName, 
					_plantCd) ;
			//-------------------

			String odNo = rs.getString("OD_NO");				// オーダデマンド番号
			int odTyp = rs.getInt("OD_TYP");					// オーダデマンド区分

			// << 品目の検索 >>
			String sql = "select * from M_ITEM where ITEM_CD = ? ";
			psItem = _conn.prepareStatement(sql);
			psItem.setString(1, rs.getString("ITEM_CD"));
			rsItem = psItem.executeQuery();
			String itemCd = rs.getString("ITEM_CD");

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
				dmQty = new BigDecimal(parentOdrQty).multiply(new BigDecimal(psUnitQty)).doubleValue();
			} else {
				//	疑似品目以外の場合、親のオーダ数量*構成単位(丸め前)*(1+ 構成仕損率/100)
				//dmQty = parentOdrQty * psUnitQty * ( 1 + psSpoil / 100D );
				dmQty = new BigDecimal(parentOdrQty).multiply(new BigDecimal(psUnitQty).multiply( new BigDecimal("1").add(new BigDecimal(psSpoil / 100D))) ).doubleValue();

			}

			// 丸め処理
			int unitQtyTyp = 0; 								// 在庫数量単位区分(0:整数/1:小数)
			if ( rsItem.next() ) {
				unitQtyTyp = rsItem.getInt("UNIT_QTY_TYP");
				psUnitQty = changeQtyUp(psUnitQty,unitQtyTyp);
				dmQty = changeQtyUp(dmQty,unitQtyTyp);
			} else {
				rsItem.close();
				_log.methodEnd();
				throw new ApsComException(50509,"(SBM0981) 品目データが存在しません");
			}

			// 要求納期/製造納期の設定--------------------
			//CHG 20090120 ---構成LT使用フラグの取得先を、所要から、構成に変更
			//int psLtFlg = rs.getInt("PS_LT_FLG");						  // 製品構成リードタイム使用フラグ
			int psLtFlg = rs.getInt("PS_LT_FLG");						  // 製品構成リードタイム使用フラグ			
//			// 製品構成の検索	--------------ADD 
//			sql = "select * from M_PS "
//					   + "where PARENT_ITEM_CD = ? "			// 親品目番号
//					   + "and COMP_ITEM_CD = ? "				// 子品目番号
//					   + "and EFF_PHASE_IN_DATE <= ? "			// 製品構成有効開始日
//					   + "and EFF_PHASE_OUT_DATE >= ? "; 		// 製品構成有効終了日
//			ps = _conn.prepareStatement(sql);
//			ps.setString(1, parentItemCd);
//			ps.setString(2, itemCd);
//			ps.setTimestamp(3, new Timestamp(parentOdrStartDate.getTime()));
//			ps.setTimestamp(4, new Timestamp(parentOdrStartDate.getTime()));
//			ResultSet rsPs = ps.executeQuery();
//			while ( rsPs.next() ) {
//				psLtFlg = rsPs.getInt("PS_LT_FLG");
//			}
//			rsPs.close();
//			//---------E
			
			//int psFixedLt = rs.getInt("PS_FIXED_LT");					  // 固定分リードタイム
			//double psPropLotSize = rs.getDouble("PS_PROP_LOT_SIZE");	  // 製品構成比例分ロットサイズ
			//int psPropLt = rs.getInt("PS_PROP_LT"); 					  // 製品構成比例分リードタイム
			Date dueDate = null;										  // 要求納期

			// 製品構成リードタイム使用フラグ  0:使用しない/1:使用する
			if (psLtFlg == 0) {
				// 親の手配着手日と同じ
				dueDate = parentOdrStartDate;
				// 稼働日チェック
				dueDate = this.calcOdrStartDate(0, dueDate,itemCd);
				
			} else {
				
				// 20081009 親の製造納期→（構成LT）→子の要求納期
				//M_ASP_BOM.TIMECONSTRAINT_MINから構成LTを取得
				dueDate = parentPrdDueDate;
				//構成LT分過去へシフト
				//20081210 upd
				//sShiftMin = ab.getPsLtMin(
				//		rs.getString("PARENT_ITEM_CD"),	
				//		rs.getString("COMP_ITEM_CD"),
				//		"I");
				sShiftMin = ab.getPsLtMin(
						parentItemCd,	
						rs.getString("ITEM_CD"),
						"I");
				sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
				dueDate = atWC.calcShiftMinute(parentPrdDueDate, sShiftMin, ATWorkCalendar.SHIFT_END);
				//20081009 ------------E
				
			}

			// MRP管理品目の場合、製造納期= 要求納期
			Date prdDueDate = rs.getTimestamp("PRD_DUE_DATE");		  // 製造納期	2003/10/14 update ※MRP品以外は変えない
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

				odrStartDate = rs.getTimestamp("ODR_START_DATE");		  // 手配着手日 2003/10/14 update ※擬似以外は着手系を変えない
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
					rsOd = psOd.executeQuery();

					while ( rsOd.next() ) {
						if ( issueCmpltDate == null ) {
							issueCmpltDate = rs.getTimestamp("ISSUE_CMPLT_DATE");
						}
						if ( rsOd.getInt("ISSUE_CMPLT_FLG") != 1 ) {		  // 出庫完了フラグ
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
			}else if ( odTyp == 4 ) {

			// オーダデマンド区分=4:疑似の時の処理 ===================================

				double itemSpoil = rsItem.getDouble("ITEM_SPOIL");
				odrQtyOfChildOd = dmQty * (1 + itemSpoil / 100D);

				double propLotSize = rsItem.getDouble("PROP_LOT_SIZE"); 	  // 比例分ロットサイズ

				//--------------20090106 LTシフト
				// <製造納期>擬似
				//■製造納期 = 要求納期 - 払出リードタイム (稼働日チェック)-------------------------
				prdDueDate = dueDate;
				sShiftMin = ab.getIssueLtMin(
						rs.getString("ITEM_CD"),
						"U");
				sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
				prdDueDate = atWC.calcShiftMinute(dueDate, sShiftMin, ATWorkCalendar.SHIFT_END);
				//---------
				
				// <製造着手日>擬似
				//■製造着手日 = 製造納期 - 品目リードタイム-------------------------
				if ( propLotSize == 0) {
					rsItem.close();
					 _log.methodEnd();
					throw new ApsComException(50416,"(SBM0983) 比例分ロットサイズが未入力です");
				}
				prdStartDate = prdDueDate;
				sShiftMin = ab.getProdLtMin(
						rs.getString("ITEM_CD"),	//rs.getString("COMP_ITEM_CD"), DEBUG 20090106
						 String.valueOf(odrQtyOfChildOd),
						 String.valueOf(propLotSize),
						"U");
				sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
				prdStartDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_START);
				//---------

				// <手配着手日>擬似
				//■手配着手日 = 製造納期 - 手配リードタイム (稼働日チェック)-------------------------
				odrStartDate = prdStartDate;
				sShiftMin = ab.getOdrLtMin(
						rs.getString("ITEM_CD"),	//rs.getString("COMP_ITEM_CD"), DEBUG 20090106
						"U");
				sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
				odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);
				//---------
			}
			
				//System.out.println("Item_cd check line1554(child) : "+itemCd);
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
			ps = _conn.prepareStatement(sql);
			ps.setTimestamp(1, new Timestamp(dueDate.getTime()));		  // 要求納期
			if ( odrStartDate == null ) {								  // 手配着手日
				ps.setNull(2, Types.DATE);
			} else {
				ps.setTimestamp(2, new Timestamp(odrStartDate.getTime()));
			}
			if ( prdDueDate == null ) { 								  // 製造納期
				ps.setNull(3, Types.DATE);
			} else {
				ps.setTimestamp(3, new Timestamp(prdDueDate.getTime()));
			}
			if ( prdStartDate == null ) {								  // 製造着手日
				ps.setNull(4, Types.DATE);
			} else {
				ps.setTimestamp(4, new Timestamp(prdStartDate.getTime()));
			}
			ps.setDouble(5, dmQty); 									  // デマンド数
			ps.setDouble(6, odrQtyOfChildOd);							  // オーダ数
			if ( issueCmpltDate == null ) { 							  // 出庫完了日
				 ps.setNull(7, Types.DATE);
			} else {
				ps.setTimestamp(7, new Timestamp(issueCmpltDate.getTime()));
			}
			ps.setTimestamp(8, new Timestamp(new Date().getTime()));
			ps.setString(9, _userInfo.getUserId());
			ps.setString(10, _userInfo.getBusinessName());
			ps.setString(12, odNo);
			if (odTyp == 4) {
				ps.setString(11, odNo);
			} else {
				ps.setInt(11, dmStsTyp); // デマンド状態区分
				ps.setString(12, odNo);
			}
			ps.execute();
			ps.close();

			//this.changeCommon(odNo);

			// 疑似品目の場合、さらに下位のデマンド情報を作成する。
			if ( odTyp == 4 ) {
				sql = "select * from T_OD where PARENT_OD_NO = ?";
				ps = _conn.prepareStatement(sql);
				ps.setString(1, odNo);
				rs = ps.executeQuery();
				while ( rs.next() ) {
					// 2003/09/02 20081210 update
					//this.changeChildOdInfo(rs, odNo, odrQtyOfChildOd, odrStartDate, prdDueDate);
					//this.changeChildOdInfo(rs, parentOdNo, odrQtyOfChildOd, odrStartDate, prdDueDate);
					this.changeChildOdInfo(rs, parentOdNo, odrQtyOfChildOd, odrStartDate, prdDueDate, itemCd);
				}
				rs.close();
				ps.close();
			}
			_log.methodEnd();
		}
		finally {
			if (psItem != null)
			{
				psItem.close();
			}
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
			if (rsOd != null){
				try{
					rsOd.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsOd = null;
			}
			if (rsWorkInProcByItem != null){
				try{
					rsWorkInProcByItem.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsWorkInProcByItem = null;
			}
			if (rsItem != null) {
				try {
					rsItem.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsItem = null;
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
			
			this.changeCommon(odNo);

			_log.methodEnd();
		}
		finally {
			if (ps != null)
			{
				ps.close();
			}
		}
	}

	//----Local使用
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
	public double  changeQtyUp(double qty, int unitQtyTyp){

		_log.methodStart();
		double result = 0;
		String strResult = "";
		String strQty = Double.toString(qty);

		// 在庫数量単位区分＝整数管理
		if ( unitQtyTyp == 1 ) {
			strResult = Calculate.ceil(strQty, 0);
		}
		//在庫数量単位区分＝小数管理
		if ( unitQtyTyp == 2 ) {
			if ( (int)( qty * 100000 ) % 10 == 0 ) {
				// 小数点第5位がゼロの場合は小数点第5位以下を切り捨てる
				strResult = Calculate.floor(strQty,4);
			} else {
				// 小数点第5位がゼロ以外の場合は小数点第5位を切上げる
				strResult = Calculate.ceil(strQty,4);
			}
		}
		result = Double.parseDouble(strResult);
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
	public Date getBusinessOprDate()
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
				throw new ApsComException(50700,"(SBM0977) 対象データが存在しません");
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
	 * 使用するSimpleDateFormatオブジェクトを返す
	 * @return "yyyy/MM/dd HH:mm:ss"のSimpleDateFormat
	 */
	private static final SimpleDateFormat getMySimpleDateFormat() {
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	}


	/**
	 * 所要量再展開依頼、所要量計算制御の更新を行う
	 *
	 * @param odNo オーダデマンド番号
	 * @param count 更新数
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void checkModifyCount(String odNo, long count)
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
						throw new ApsComException(50802, "(SBM0978) 既に他者によって更新されています");
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
	public void changeCommon(String odNo)
			throws SQLException {

		PreparedStatement ps = null;
		PreparedStatement psOd = null;
		PreparedStatement psMrpReex = null;
		PreparedStatement pstmt = null;
		ResultSet rsOd = null;
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

						+ "?"								  // オーダデマンド番号
						+ ",?" 						  // 工場コード
						+ ",?" 						  // 製番
						+ ",?"						  // 製番枝番
						+ ",?"						  // 製番取消発生番号
						+ ",?"						  // 所要量レベル番号
						+ ",?"						  // 作成者
						+ ",?"						  // 作成プログラム名
						+ ",?"						  // 更新者
						+ ",?"						  // 更新プログラム名
						+ ",0" 						  // 更新数
						+ ")";

					pstmt = _conn.prepareStatement(sql);
					pstmt.setString(1, odNo);
					pstmt.setString(2, _plantCd);
					pstmt.setString(3, jobOdrCd);
					pstmt.setInt(4, jobOdrDetailNo);
					pstmt.setInt(5, jobOdrCancelNo);
					pstmt.setInt(6, odLevelNo);
					pstmt.setString(7, _userInfo.getUserId());
					pstmt.setString(8, _userInfo.getBusinessName());
					pstmt.setString(9, _userInfo.getUserId());
					pstmt.setString(10, _userInfo.getBusinessName());
					rsRows = pstmt.executeUpdate();
					pstmt.close();
				}

				// << 所要量計算制御(製番)の更新 >>
				// 所要量メンテナンス中フラグを1:処理中に変更する。
				sql = "update SYS_JOB_OD_CALC_CTRL set"
					+ " OD_MNT_FLG = 1 "
					+ ",UPDATED_DATE = ?"
					+ ",UPDATED_BY = ?"
					+ ",UPDATED_PRG_NM = ?"
					+ ",MODIFY_COUNT = MODIFY_COUNT + 1 "
					+ "where PLANT_CD = ? "
					+ "and JOB_ODR_CD = ?";
				ps = _conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(new Date().getTime()));
				ps.setString(2, _userInfo.getUserId());
				ps.setString(3, _userInfo.getBusinessName());
				ps.setString(4, _plantCd);
				ps.setString(5, jobOdrCd);
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
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				pstmt = null;
			}
			if (rsOd != null) {
				try {
					rsOd.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsOd = null;
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
	private Date calcOdrStartDate(int difference, Date startDate,String itemCd)
			throws ApsComException {

		_log.methodStart();
		Date odrStartDate = null;
		// ★★ 稼働日算出部品の呼び出し
		WorkCalendar workDay = null;
		try{
			workDay = new WorkCalendar( _iconn, _userInfo.getUserId(), _userInfo.getBusinessName(),
										   _plantCd,itemCd, startDate, -difference, false );
			odrStartDate = workDay.calcDate();
			workDay = null;
		}
		catch (FoundationException ex) {
			_log.methodEnd();
			throw new ApsComException(50553,"(SBM0979) オーダデマンド番号採番データが存在しません");
		}
		_log.methodEnd();
		return odrStartDate;
	}

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
			throw new ApsComException(50553,"(SBM0979) オーダデマンド番号採番データが存在しません");
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