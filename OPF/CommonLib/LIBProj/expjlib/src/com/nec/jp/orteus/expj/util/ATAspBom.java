/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ATAspBom.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 * Copyright (c) 2003-2004 NEC Nexsolution Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;


//
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.DateTimeFormat;
import com.nec.jp.orteus.expj.util.ATCommonOd.Log;
import com.nec.jp.orteus.expj.util.ATCommonOd.UserInfo;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;


/**
 *(#)ATAspBom.java
 *
 * Copyright (c) 2008 NEXS,Ltd.
 *
 * @author nexs.ima
 * Date : 2008/10/09
 * @version 1.01
 * History 
 * <pre>
 * 2008/09/29 仕様変更（IssueLtの取得先変更） nexs.ima
 * 2008/10/09 手配LT、構成LT取得メソッド追加 nexs.ima
 *   
 * ASP製造BOMの情報を取得する
 *	 - 払出LT（TASK3_EXPR）の時間（分）を取得する			getIssueLtMin
 *	 - 手配LT（TASK1_EXPR）の時間（分）を取得する			getOdrLtMin
 *	 - 構成LT（TIMECONSTRAINT_MIN）の時間（分）を取得する	getPsLtMin
 *	 - 製造LT（TASK2_EXPR）の時間（分）を取得する			getProdLtMin
 *
 * ・For AT Chk:20081111
 *
 *  
 *  
 * </pre>
 *
 */

public class ATAspBom {
	private IDbConnection _iconn;				 // トランザクションコネクション情報
	private Connection _conn;					 // コネクション情報
	private String _plantCd;					 // 工場コード
	private UserInfo _userInfo; 				 // 利用者管理情報(インナークラス)
	private Log _log;							 // ログ情報(インナークラス)
	
	public ATAspBom(IDbConnection conn, 
			String plantCd, 
			String userId, 
			String businessName) {

		_iconn = conn;
		_conn = _iconn.getConn();
		_plantCd = plantCd;
		_userInfo = new UserInfo(userId,businessName);

		// ログ用部品の初期化を行う
		String packageName = this.getClass().getName();
		packageName = packageName.substring(0,packageName.lastIndexOf("."));
		_log = new Log(packageName,_iconn); 										// 2003/08/11
	}

	
	//--------------------------------------
	/**
	 * 払出LT（TASK3_EXPR）の時間（分）を取得する
	 *
	 * ・レコードがなければ０とする
	 *
	 * @param itemCd  品目番号
	 * @param instructionTyp  指図種別（"U"固定）
	 * @return 払い出しLT時間（分）
	 * @throws SQLException
	 */
	public String getIssueLtMin(String itemCd, String instructionTyp)
	throws SQLException {
		
		String task3Expr;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		// 払出LT
		String sql = ""
			+ "select NVL(REPLACE(REPLACE(TASK3_EXPR,'H'),'h'),'0') AS TASK3_EXPR " 
			+ "from M_ASP_BOM "
			+ "where ITEM_CD = ? "
			+ "and INSTRUCTION_TYP = ? ";
		ps = _conn.prepareStatement(sql);
		ps.setString(1, itemCd);
		ps.setString(2, instructionTyp);
		rs = ps.executeQuery();
		if(rs.next()==true) {
		//if( rs.= 0 ) {
			task3Expr = rs.getString("TASK3_EXPR");
		}else{
			task3Expr = "0";
		}
		rs.close();
		ps.close();
		
		
		// Hour→Min
		String sExp = "60";
		String min = Calculate.multiply(sExp , task3Expr);
		min = Calculate.ceil(min, 0);
		return min;
	}

	

	//--------------------------------------
	/**
	 * 手配LT（TASK1_EXPR）の時間（分）を取得する
	 * 
	 * ・レコードがなければ０とする
	 *
	 *　2008/10/09 add
	 *
	 * @param itemCd  品目番号
	 * @param instructionTyp  指図種別（"U"固定）
	 * @return 手配LT時間（分）
	 * @throws SQLException
	 */
	public String getOdrLtMin(String itemCd, String instructionTyp)
	throws SQLException {
		
		String task1Expr;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		// 手配LT
		String sql = ""
			+ "select NVL(REPLACE(REPLACE(TASK1_EXPR,'H'),'h'),'0') AS TASK1_EXPR " 
			+ "from M_ASP_BOM "
			+ "where ITEM_CD = ? "
			+ "and INSTRUCTION_TYP = ? ";
		ps = _conn.prepareStatement(sql);
		ps.setString(1, itemCd);
		ps.setString(2, instructionTyp);
		rs = ps.executeQuery();
		if(rs.next()==true) {
		//if( rs.= 0 ) {
			task1Expr = rs.getString("TASK1_EXPR");
		}else{
			task1Expr = "0";
		}
		rs.close();
		ps.close();
		
		
		// Hour→Min
		String sExp = "60";
		String min = Calculate.multiply(sExp , task1Expr);
		min = Calculate.ceil(min, 0);
		return min;
	}

	//--------------------------------------
	/**
	 * 構成LT（TIMECONSTRAINT_MIN）の時間（分）を取得する
	 * 
	 * ・レコードがなければ０とする
	 *
	 *　2008/10/09 add
	 *
	 * @param pItemCd  親品目番号
	 * @param cItemCd  子品目番号
	 * @param instructionTyp  指図種別（"I"固定）
	 * @return 構成LT時間（分）
	 * @throws SQLException
	 */
	public String getPsLtMin(String pItemCd, String cItemCd, String instructionTyp)
	throws SQLException {
		
		String timeConst;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		// 構成LT
		String sql = ""
			+ "select NVL(REPLACE(REPLACE(TIMECONSTRAINT_MIN,'H/M'),'h/m'),'0') AS TIMECONSTRAINT_MIN " 
			+ "from M_ASP_BOM "
			+ "where ITEM_CD = ? "
			+ "and ITEMORRES_CD = ? "
			+ "and INSTRUCTION_TYP = ? ";
		ps = _conn.prepareStatement(sql);
		ps.setString(1, pItemCd);
		ps.setString(2, cItemCd);
		ps.setString(3, instructionTyp);
		rs = ps.executeQuery();
		if(rs.next()==true) {
		//if( rs.= 0 ) {
			timeConst = rs.getString("TIMECONSTRAINT_MIN");
		}else{
			timeConst = "0";
		}
		rs.close();
		ps.close();
		
		
		// Hour→Min
		String sExp = "60";
		String min = Calculate.multiply(sExp , timeConst);
		min = Calculate.ceil(min, 0);
		return min;
	}
	
	//--------------------------------------
	
	//--------------------------------------
	/**
	 * <pre>
	 * 製造LT（TASK2_EXPR）の時間（分）を取得する
	 * 
	 * ・レコードがなければ０とする
	 * ・TASK2_EXPR： 想定の設定値 '99.99hp + 99.99h'：比例分 + 固定分
	 * 
	 *　2008/11/11 add
	 *　2009/01/22 upd 単位数（unitQty）はDummyとなった。
	 *					使わない仕様に変更（内部では単位数：１として処理） 
	 *
	 * </pre>
	 * @param itemCd  品目番号
	 * @param odrQty  手配数
	 * @param unitQty  単位数
	 * @param instructionTyp  指図種別（"U"固定）
	 * @return 製造LT時間（分）
	 * @throws SQLException
	 */
	public String getProdLtMin(String itemCd, String odrQty, String unitQty, String instructionTyp)
	throws SQLException {
		
		String propLt;
		String fixLt;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// 構成LT
		String sql = ""
			+ "select " 
			+ "NVL(TRIM(SUBSTR(TASK2_EXPR, 1, INSTR(TASK2_EXPR,'hp') - 1)),'0') AS PROPLT, " 
			+ "NVL(TRIM(REPLACE(SUBSTR(TASK2_EXPR, INSTR(TASK2_EXPR,'+') + 1) , 'h')),'0') AS FIXLT " 
			+ "from M_ASP_BOM "
			+ "where ITEM_CD = ? "
			+ "and INSTRUCTION_TYP = ? ";
		ps = _conn.prepareStatement(sql);
		ps.setString(1, itemCd);
		ps.setString(2, instructionTyp);
		rs = ps.executeQuery();
		if(rs.next()==true) {
			propLt = rs.getString("PROPLT");
			fixLt = rs.getString("FIXLT");
		}else{
			propLt = "0";
			fixLt = "0";
		}
		rs.close();
		ps.close();
		
		
		// Hour→Min
		String sExp = "60";
		String fixLtw = Calculate.multiply(sExp , fixLt);
		String propLtw = Calculate.multiply(sExp , propLt);	
		//String dividew = Calculate.divide(odrQty , unitQty, 4); //4:Calculate._ROUND
		
		// CHG 20090122----単位数１固定として処理する仕様に変更
		//String dividew = Calculate.divide(odrQty , unitQty, 10, Calculate._CEIL);
		//String min = Calculate.add(Calculate.multiply(propLtw, dividew), fixLtw );
		String min = Calculate.add(Calculate.multiply(propLtw, odrQty), fixLtw );
		
		//min = Calculate.ceil(min, 0);
		min = Calculate.round(min, 0);	//CHG 20081215
		return min;
	}
	
	//--------------------------------------	
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
