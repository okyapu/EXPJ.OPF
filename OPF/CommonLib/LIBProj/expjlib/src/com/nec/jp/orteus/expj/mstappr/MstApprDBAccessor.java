package com.nec.jp.orteus.expj.mstappr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import oracle.sql.CLOB;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * マスタ系承認用のDBアクセッサ
 * @author xing-qianying
 * @version 1.00
 */
public class MstApprDBAccessor  {

	// 構築

	/** コンストラクタ */
	public MstApprDBAccessor() {
		clear();
	}

	/**
	 * コンストラクタ
	 * 
	 * @param strPlantCd
	 *            工場コード
	 * @param strUserCd
	 *            ユーザコード
	 * @param strProgramName
	 *            プログラム名（例 AH0070B001）
	 */
	public MstApprDBAccessor(String strPlantCd, String strUserCd,
			String strProgramName) {
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
	}

	// --------------------------------------------------------------------------
	// 変数
	/** 工場コード格納用 */
	private String _strPlantCd = null;

	/** ユーザコード格納用 */
	private String _strUserCd = null;

	/** プログラム名格納用 */
	private String _strProgramName = null;
	
	SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	

	// --------------------------------------------------------------------------

	// 共通メソッド

	// //////////////////////////////////////////////////////////////////////////
	/**
	 * クリア
	 * 
	 * @return なし
	 */
	public void clear() {
		_strPlantCd = null;
		_strUserCd = null;
		_strProgramName = null;
	}

	/**
	 * プリペアドステートメントを閉じる
	 * 
	 * @param statement 閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			statement = null;
		}
	}

	/**
	 * リザルトセットを閉じる
	 * @param resultset 閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet resultset) {
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			resultset = null;
		}
	}

	// --------------------------------------------------------------------------
	// 操作

	/**
	 * 承認明細情報の存在チェック処理
	 * 
	 * @param conn  DBアクセス用のコネクション
	 * @param tableName  マスタ表名
	 * @param keyvalueList  キー名とキー値
	 * @return　承認依頼に情報が存在　true
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean checkMST_APPR(IDbConnection conn, String tableName,ArrayList keyvalueList) throws SQLException {
		PreparedStatement checkStmt = null;
		ResultSet checkRslt = null;
		boolean result = false;
		StringBuffer checkSQL = new StringBuffer();
		try {
			
			for(int i =0;i<keyvalueList.size();i++){
				if(i>0){
					checkSQL.append("INTERSECT ");
				}
				checkSQL.append("SELECT MST_APPR.APPR_ID ");
				checkSQL.append("FROM MST_APPR,MST_APPR_KEY ");
				checkSQL.append("WHERE ");
				checkSQL.append("MST_APPR.APPR_ID = MST_APPR_KEY.APPR_ID ");
				checkSQL.append("AND (MST_APPR.STATUS = 1 OR MST_APPR.STATUS = 2) ");
				checkSQL.append("AND MST_APPR_KEY.TABLE_NAME = "+"'"+tableName+"' " );
				checkSQL.append("AND MST_APPR_KEY.KEY_NAME = "+"'"+((MstColumns)keyvalueList.get(i)).getColumnname()+"' ");
				if(("NUMBER".equals(((MstColumns)keyvalueList.get(i)).getData_typ()))){
					checkSQL.append("AND CAST(MST_APPR_KEY.KEY_VALUE AS NUMBER) = "+((MstColumns)keyvalueList.get(i)).getColumnvalue()+" ");
				}else{
					checkSQL.append("AND MST_APPR_KEY.KEY_VALUE = "+"'"+((MstColumns)keyvalueList.get(i)).getColumnvalue().replaceAll("'", "''")+"' ");
				} 
			}
			checkStmt = conn.getConn().prepareStatement(checkSQL.toString());
			checkRslt = checkStmt.executeQuery();
			if (checkRslt.next()){
				result = true;
			}
			return result;
		} finally {
			this.closePreparedStatement(checkStmt);
			this.closeResultSet(checkRslt);
		}
	}

	/**
	 * 承認明細情報の削除依頼存在チェック処理
	 * 
	 * @param conn  DBアクセス用のコネクション
	 * @param tableName  マスタ表名
	 * @param keyvalueList  キー名とキー値
	 * @return　承認依頼に情報が存在　true
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean checkMST_APPRDel(IDbConnection conn, String tableName,ArrayList keyvalueList) throws SQLException {
		PreparedStatement checkStmt = null;
		ResultSet checkRslt = null;
		boolean result = false;
		StringBuffer checkSQL = new StringBuffer();
		try {
			
			for(int i =0;i<keyvalueList.size();i++){
				if(i>0){
					checkSQL.append("INTERSECT ");
				}
				checkSQL.append("SELECT MST_APPR.APPR_ID ");
				checkSQL.append("FROM MST_APPR,MST_APPR_KEY ");
				checkSQL.append("WHERE ");
				checkSQL.append("MST_APPR.APPR_ID = MST_APPR_KEY.APPR_ID ");
				checkSQL.append("AND  MST_APPR.PROC_TYP = 3 ");
				checkSQL.append("AND (MST_APPR.STATUS = 1 OR MST_APPR.STATUS = 2) ");
				checkSQL.append("AND MST_APPR_KEY.TABLE_NAME = "+"'"+tableName+"' " );
				checkSQL.append("AND MST_APPR_KEY.KEY_NAME = "+"'"+((MstColumns)keyvalueList.get(i)).getColumnname()+"' ");
				if(("NUMBER".equals(((MstColumns)keyvalueList.get(i)).getData_typ()))){
					checkSQL.append("AND CAST(MST_APPR_KEY.KEY_VALUE AS NUMBER) = "+((MstColumns)keyvalueList.get(i)).getColumnvalue()+" ");
				}else{
					checkSQL.append("AND MST_APPR_KEY.KEY_VALUE = "+"'"+((MstColumns)keyvalueList.get(i)).getColumnvalue().replaceAll("'", "''")+"' ");
				} 
			}
			checkStmt = conn.getConn().prepareStatement(checkSQL.toString());
			checkRslt = checkStmt.executeQuery();
			if (checkRslt.next()){
				result = true;
			}
			return result;
		} finally {
			this.closePreparedStatement(checkStmt);
			this.closeResultSet(checkRslt);
		}
	}
	
	/**
	 * 承認明細情報の登録依頼存在チェック処理
	 * 
	 * @param conn  DBアクセス用のコネクション
	 * @param tableName  マスタ表名
	 * @param keyvalueList  キー名とキー値
	 * @return　承認依頼に情報が存在　true
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean checkMST_APPRAdd(IDbConnection conn, String tableName,ArrayList keyvalueList) throws SQLException {
		PreparedStatement checkStmt = null;
		ResultSet checkRslt = null;
		boolean result = false;
		StringBuffer checkSQL = new StringBuffer();
		try {
			
			for(int i =0;i<keyvalueList.size();i++){
				if(i>0){
					checkSQL.append("INTERSECT ");
				}
				checkSQL.append("SELECT MST_APPR.APPR_ID ");
				checkSQL.append("FROM MST_APPR,MST_APPR_KEY ");
				checkSQL.append("WHERE ");
				checkSQL.append("MST_APPR.APPR_ID = MST_APPR_KEY.APPR_ID ");
				checkSQL.append("AND  MST_APPR.PROC_TYP = 1 ");
				checkSQL.append("AND (MST_APPR.STATUS = 1 OR MST_APPR.STATUS = 2) ");
				checkSQL.append("AND MST_APPR_KEY.TABLE_NAME = "+"'"+tableName+"' " );
				checkSQL.append("AND MST_APPR_KEY.KEY_NAME = "+"'"+((MstColumns)keyvalueList.get(i)).getColumnname()+"' ");
				if(("NUMBER".equals(((MstColumns)keyvalueList.get(i)).getData_typ()))){
					checkSQL.append("AND CAST(MST_APPR_KEY.KEY_VALUE AS NUMBER) = "+((MstColumns)keyvalueList.get(i)).getColumnvalue()+" ");
				}else{
					checkSQL.append("AND MST_APPR_KEY.KEY_VALUE = "+"'"+((MstColumns)keyvalueList.get(i)).getColumnvalue().replaceAll("'", "''")+"' ");
				} 
			}
			checkStmt = conn.getConn().prepareStatement(checkSQL.toString());
			checkRslt = checkStmt.executeQuery();
			if (checkRslt.next()){
				result = true;
			}
			return result;
		} finally {
			this.closePreparedStatement(checkStmt);
			this.closeResultSet(checkRslt);
		}
	}
	
	
	/**
	 * 承認IDを取得処理
	 * @param conn  DBアクセス用のコネクション
	 * @return String 承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public String selectSEQ_APPR_ID(IDbConnection conn) throws SQLException {
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		String appr_ID = null;
		try {
			selectStmt = conn.getConn().prepareStatement(_selectSEQ_APPR_ID);
			selectRslt = selectStmt.executeQuery();
			if(selectRslt.next()){
				appr_ID = selectRslt.getString(1);
			}
			return appr_ID;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(selectRslt);
		}
	}

	/**
	 * マスタ項目コラム番号の取得処理
	 * @param conn  DBアクセス用のコネクション
	 * @param tablename マスタ表名
	 * @param columnname　コラム名
	 * @return String コラムID
	 * @throws SQLException DBアクセスエラー
	 */
	public String getColumnID(IDbConnection conn, String tablename,String columnname) throws SQLException {
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		String columnID = null;
		try {
			selectStmt = conn.getConn().prepareStatement(_getColumnID);
			selectStmt.setString(1, tablename);                                    // マスタ表名
			selectStmt.setString(2, columnname);                                   //　コラム名
			selectRslt = selectStmt.executeQuery();
			if (selectRslt.next()) {
				columnID = selectRslt.getString(1);
			}
			return columnID;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(selectRslt);
		}
	}

	/**
	 * マスタ項目コラム名の取得処理
	 * @param conn  DBアクセス用のコネクション
	 * @param tablename マスタ表名
	 * @param columnID　コラムID
	 * @return String コラム名
	 * @throws SQLException DBアクセスエラー
	 */
	public String getColumnName(IDbConnection conn, String tablename,String columnID) throws SQLException {
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		String columnname = null;
		try {
			selectStmt = conn.getConn().prepareStatement(_getColumnName);
			selectStmt.setString(1, tablename);                                    // マスタ表名
			selectStmt.setString(2, columnID);                                     //　コラムID
			selectRslt = selectStmt.executeQuery();
			if (selectRslt.next()) {
				columnname = selectRslt.getString(1);
			}
			return columnname;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(selectRslt);
		}
	}

	/**
	 * 承認依頼表登録
	 * @param conn  DBアクセス用のコネクション
	 * @param struct 承認依頼表
	 * @return　リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public int insertMST_APPR(IDbConnection conn, MstApprStruct struct)
			throws SQLException {
		PreparedStatement insertStmt = null;
		try {
			insertStmt = conn.getConn().prepareStatement(_insertMST_APPR);
			insertStmt.setString(1, struct.getAPPR_ID());
			insertStmt.setString(2, struct.getSCREEN_URL());
			insertStmt.setString(3, struct.getPLANT_CD());
			insertStmt.setString(4, struct.getPROC_TYP());
			insertStmt.setString(5, struct.getAPPR_REMARKS());
			insertStmt.setString(6, struct.getREQUEST_DATE());
			insertStmt.setString(7, struct.getSTATUS());
			insertStmt.setString(8, struct.getRESERVE_CAUSE());
			insertStmt.setString(9, struct.getREQUEST_BY());
			insertStmt.setString(10, struct.getAPPR_BY());
			insertStmt.setString(11, struct.getCREATED_BY());
			insertStmt.setString(12, struct.getCREATED_PRG_NM());
			insertStmt.setString(13, struct.getUPDATED_BY());
			insertStmt.setString(14, struct.getUPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}

	/**
	 * 承認明細表の登録処理
	 * @param conn  DBアクセス用のコネクション
	 * @param detailStruct 承認明細表
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public int insertMST_APPR_DETAIL(IDbConnection conn,MstApprDetailStruct detailStruct) throws SQLException {
		PreparedStatement insertStmt = null;
		try {
			insertStmt = conn.getConn().prepareStatement(_insertMST_APPR_DETAIL);
			insertStmt.setString(1, detailStruct.getAPPR_ID());
			insertStmt.setString(2, detailStruct.getTABLE_NAME());
			insertStmt.setString(3, detailStruct.getITEM_COL1());
			insertStmt.setString(4, detailStruct.getITEM_COL2());
			insertStmt.setString(5, detailStruct.getITEM_COL3());
			insertStmt.setString(6, detailStruct.getITEM_COL4());
			insertStmt.setString(7, detailStruct.getITEM_COL5());
			insertStmt.setString(8, detailStruct.getITEM_COL6());
			insertStmt.setString(9, detailStruct.getITEM_COL7());
			insertStmt.setString(10, detailStruct.getITEM_COL8());
			insertStmt.setString(11, detailStruct.getITEM_COL9());
			insertStmt.setString(12, detailStruct.getITEM_COL10());
			insertStmt.setString(13, detailStruct.getITEM_COL11());
			insertStmt.setString(14, detailStruct.getITEM_COL12());
			insertStmt.setString(15, detailStruct.getITEM_COL13());
			insertStmt.setString(16, detailStruct.getITEM_COL14());
			insertStmt.setString(17, detailStruct.getITEM_COL15());
			insertStmt.setString(18, detailStruct.getITEM_COL16());
			insertStmt.setString(19, detailStruct.getITEM_COL17());
			insertStmt.setString(20, detailStruct.getITEM_COL18());
			insertStmt.setString(21, detailStruct.getITEM_COL19());
			insertStmt.setString(22, detailStruct.getITEM_COL20());
			insertStmt.setString(23, detailStruct.getITEM_COL21());
			insertStmt.setString(24, detailStruct.getITEM_COL22());
			insertStmt.setString(25, detailStruct.getITEM_COL23());
			insertStmt.setString(26, detailStruct.getITEM_COL24());
			insertStmt.setString(27, detailStruct.getITEM_COL25());
			insertStmt.setString(28, detailStruct.getITEM_COL26());
			insertStmt.setString(29, detailStruct.getITEM_COL27());
			insertStmt.setString(30, detailStruct.getITEM_COL28());
			insertStmt.setString(31, detailStruct.getITEM_COL29());
			insertStmt.setString(32, detailStruct.getITEM_COL30());
			insertStmt.setString(33, detailStruct.getITEM_COL31());
			insertStmt.setString(34, detailStruct.getITEM_COL32());
			insertStmt.setString(35, detailStruct.getITEM_COL33());
			insertStmt.setString(36, detailStruct.getITEM_COL34());
			insertStmt.setString(37, detailStruct.getITEM_COL35());
			insertStmt.setString(38, detailStruct.getITEM_COL36());
			insertStmt.setString(39, detailStruct.getITEM_COL37());
			insertStmt.setString(40, detailStruct.getITEM_COL38());
			insertStmt.setString(41, detailStruct.getITEM_COL39());
			insertStmt.setString(42, detailStruct.getITEM_COL40());
			insertStmt.setString(43, detailStruct.getITEM_COL41());
			insertStmt.setString(44, detailStruct.getITEM_COL42());
			insertStmt.setString(45, detailStruct.getITEM_COL43());
			insertStmt.setString(46, detailStruct.getITEM_COL44());
			insertStmt.setString(47, detailStruct.getITEM_COL45());
			insertStmt.setString(48, detailStruct.getITEM_COL46());
			insertStmt.setString(49, detailStruct.getITEM_COL47());
			insertStmt.setString(50, detailStruct.getITEM_COL48());
			insertStmt.setString(51, detailStruct.getITEM_COL49());
			insertStmt.setString(52, detailStruct.getITEM_COL50());
			insertStmt.setString(53, detailStruct.getITEM_COL51());
			insertStmt.setString(54, detailStruct.getITEM_COL52());
			insertStmt.setString(55, detailStruct.getITEM_COL53());
			insertStmt.setString(56, detailStruct.getITEM_COL54());
			insertStmt.setString(57, detailStruct.getITEM_COL55());
			insertStmt.setString(58, detailStruct.getITEM_COL56());
			insertStmt.setString(59, detailStruct.getITEM_COL57());
			insertStmt.setString(60, detailStruct.getITEM_COL58());
			insertStmt.setString(61, detailStruct.getITEM_COL59());
			insertStmt.setString(62, detailStruct.getITEM_COL60());
			insertStmt.setString(63, detailStruct.getITEM_COL61());
			insertStmt.setString(64, detailStruct.getITEM_COL62());
			insertStmt.setString(65, detailStruct.getITEM_COL63());
			insertStmt.setString(66, detailStruct.getITEM_COL64());
			insertStmt.setString(67, detailStruct.getITEM_COL65());
			insertStmt.setString(68, detailStruct.getITEM_COL66());
			insertStmt.setString(69, detailStruct.getITEM_COL67());
			insertStmt.setString(70, detailStruct.getITEM_COL68());
			insertStmt.setString(71, detailStruct.getITEM_COL69());
			insertStmt.setString(72, detailStruct.getITEM_COL70());
			insertStmt.setString(73, detailStruct.getITEM_COL71());
			insertStmt.setString(74, detailStruct.getITEM_COL72());
			insertStmt.setString(75, detailStruct.getITEM_COL73());
			insertStmt.setString(76, detailStruct.getITEM_COL74());
			insertStmt.setString(77, detailStruct.getITEM_COL75());
			insertStmt.setString(78, detailStruct.getITEM_COL76());
			insertStmt.setString(79, detailStruct.getITEM_COL77());
			insertStmt.setString(80, detailStruct.getITEM_COL78());
			insertStmt.setString(81, detailStruct.getITEM_COL79());
			insertStmt.setString(82, detailStruct.getITEM_COL80());
			insertStmt.setString(83, detailStruct.getITEM_COL81());
			insertStmt.setString(84, detailStruct.getITEM_COL82());
			insertStmt.setString(85, detailStruct.getITEM_COL83());
			insertStmt.setString(86, detailStruct.getITEM_COL84());
			insertStmt.setString(87, detailStruct.getITEM_COL85());
			insertStmt.setString(88, detailStruct.getITEM_COL86());
			insertStmt.setString(89, detailStruct.getITEM_COL87());
			insertStmt.setString(90, detailStruct.getITEM_COL88());
			insertStmt.setString(91, detailStruct.getITEM_COL89());
			insertStmt.setString(92, detailStruct.getITEM_COL90());
			insertStmt.setString(93, detailStruct.getITEM_COL91());
			insertStmt.setString(94, detailStruct.getITEM_COL92());
			insertStmt.setString(95, detailStruct.getITEM_COL93());
			insertStmt.setString(96, detailStruct.getITEM_COL94());
			insertStmt.setString(97, detailStruct.getITEM_COL95());
			insertStmt.setString(98, detailStruct.getITEM_COL96());
			insertStmt.setString(99, detailStruct.getITEM_COL97());
			insertStmt.setString(100, detailStruct.getITEM_COL98());
			insertStmt.setString(101, detailStruct.getITEM_COL99());
			insertStmt.setString(102, detailStruct.getITEM_COL100());
			insertStmt.setString(103, detailStruct.getITEM_COL101());
			insertStmt.setString(104, detailStruct.getITEM_COL102());
			insertStmt.setString(105, detailStruct.getITEM_COL103());
			insertStmt.setString(106, detailStruct.getITEM_COL104());
			insertStmt.setString(107, detailStruct.getITEM_COL105());
			insertStmt.setString(108, detailStruct.getITEM_COL106());
			insertStmt.setString(109, detailStruct.getITEM_COL107());
			insertStmt.setString(110, detailStruct.getITEM_COL108());
			insertStmt.setString(111, detailStruct.getITEM_COL109());
			insertStmt.setString(112, detailStruct.getITEM_COL110());			
			insertStmt.setString(113, detailStruct.getITEM_COL111());
			insertStmt.setString(114, detailStruct.getITEM_COL112());
			insertStmt.setString(115, detailStruct.getITEM_COL113());
			insertStmt.setString(116, detailStruct.getITEM_COL114());
			insertStmt.setString(117, detailStruct.getITEM_COL115());
			insertStmt.setString(118, detailStruct.getITEM_COL116());
			insertStmt.setString(119, detailStruct.getITEM_COL117());
			insertStmt.setString(120, detailStruct.getITEM_COL118());
			insertStmt.setString(121, detailStruct.getITEM_COL119());
			insertStmt.setString(122, detailStruct.getITEM_COL120());
			insertStmt.setString(123, detailStruct.getITEM_COL121());
			insertStmt.setString(124, detailStruct.getITEM_COL122());
			insertStmt.setString(125, detailStruct.getITEM_COL123());
			insertStmt.setString(126, detailStruct.getITEM_COL124());
			insertStmt.setString(127, detailStruct.getITEM_COL125());
			insertStmt.setString(128, detailStruct.getITEM_COL126());
			insertStmt.setString(129, detailStruct.getITEM_COL127());
			insertStmt.setString(130, detailStruct.getITEM_COL128());
			insertStmt.setString(131, detailStruct.getITEM_COL129());
			insertStmt.setString(132, detailStruct.getITEM_COL130());
			insertStmt.setString(133, detailStruct.getITEM_COL131());
			insertStmt.setString(134, detailStruct.getITEM_COL132());
			insertStmt.setString(135, detailStruct.getITEM_COL133());
			insertStmt.setString(136, detailStruct.getITEM_COL134());
			insertStmt.setString(137, detailStruct.getITEM_COL135());
			insertStmt.setString(138, detailStruct.getITEM_COL136());
			insertStmt.setString(139, detailStruct.getITEM_COL137());
			insertStmt.setString(140, detailStruct.getITEM_COL138());
			insertStmt.setString(141, detailStruct.getITEM_COL139());
			insertStmt.setString(142, detailStruct.getITEM_COL140());
			insertStmt.setString(143, detailStruct.getITEM_COL141());
			insertStmt.setString(144, detailStruct.getITEM_COL142());
			insertStmt.setString(145, detailStruct.getITEM_COL143());
			insertStmt.setString(146, detailStruct.getITEM_COL144());
			insertStmt.setString(147, detailStruct.getITEM_COL145());
			insertStmt.setString(148, detailStruct.getITEM_COL146());
			insertStmt.setString(149, detailStruct.getITEM_COL147());
			insertStmt.setString(150, detailStruct.getITEM_COL148());
			insertStmt.setString(151, detailStruct.getITEM_COL149());
			insertStmt.setString(152, detailStruct.getITEM_COL150());			
			insertStmt.setString(153, detailStruct.getCREATED_BY());
			insertStmt.setString(154, detailStruct.getCREATED_PRG_NM());
			insertStmt.setString(155, detailStruct.getUPDATED_BY());
			insertStmt.setString(156, detailStruct.getUPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}

	/**
	 * 承認小明細表の登録処理
	 * @param conn  DBアクセス用のコネクション
	 * @param smallDetailStruct 承認小明細表
	 * @param appr_ID 承認ID
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public int insertMST_APPR_DETAIL_LIST(IDbConnection conn,MstApprDetailListStruct smallDetailStruct,String appr_ID) throws SQLException {
		PreparedStatement insertStmt = null;
		try {
			insertStmt = conn.getConn().prepareStatement(_insertMST_APPR_DETAIL_LIST);
			insertStmt.setString(1, smallDetailStruct.getAPPR_ID());
			insertStmt.setString(2, smallDetailStruct.getSEQ_NO());
			insertStmt.setString(3, smallDetailStruct.getTABLE_NAME());
			insertStmt.setString(4, smallDetailStruct.getITEM_COL1());
			insertStmt.setString(5, smallDetailStruct.getITEM_COL2());
			insertStmt.setString(6, smallDetailStruct.getITEM_COL3());
			insertStmt.setString(7, smallDetailStruct.getITEM_COL4());
			insertStmt.setString(8, smallDetailStruct.getITEM_COL5());
			insertStmt.setString(9, smallDetailStruct.getITEM_COL6());
			insertStmt.setString(10, smallDetailStruct.getITEM_COL7());
			insertStmt.setString(11, smallDetailStruct.getITEM_COL8());
			insertStmt.setString(12, smallDetailStruct.getITEM_COL9());
			insertStmt.setString(13, smallDetailStruct.getITEM_COL10());
			insertStmt.setString(14, smallDetailStruct.getITEM_COL11());
			insertStmt.setString(15, smallDetailStruct.getITEM_COL12());
			insertStmt.setString(16, smallDetailStruct.getITEM_COL13());
			insertStmt.setString(17, smallDetailStruct.getITEM_COL14());
			insertStmt.setString(18, smallDetailStruct.getITEM_COL15());
			insertStmt.setString(19, smallDetailStruct.getITEM_COL16());
			insertStmt.setString(20, smallDetailStruct.getITEM_COL17());
			insertStmt.setString(21, smallDetailStruct.getITEM_COL18());
			insertStmt.setString(22, smallDetailStruct.getITEM_COL19());
			insertStmt.setString(23, smallDetailStruct.getITEM_COL20());
			insertStmt.setString(24,smallDetailStruct.getITEM_COL21());
			insertStmt.setString(25,smallDetailStruct.getITEM_COL22());
			insertStmt.setString(26,smallDetailStruct.getITEM_COL23());
			insertStmt.setString(27,smallDetailStruct.getITEM_COL24());
			insertStmt.setString(28,smallDetailStruct.getITEM_COL25());
			insertStmt.setString(29,smallDetailStruct.getITEM_COL26());
			insertStmt.setString(30,smallDetailStruct.getITEM_COL27());
			insertStmt.setString(31,smallDetailStruct.getITEM_COL28());
			insertStmt.setString(32,smallDetailStruct.getITEM_COL29());
			insertStmt.setString(33,smallDetailStruct.getITEM_COL30());
			insertStmt.setString(34, smallDetailStruct.getCREATED_BY());
			insertStmt.setString(35, smallDetailStruct.getCREATED_PRG_NM());
			insertStmt.setString(36, smallDetailStruct.getUPDATED_BY());
			insertStmt.setString(37, smallDetailStruct.getUPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}

	/**
	 * 承認関連依頼情報を登録
	 * @param conn  DBアクセス用のコネクション
	 * @param struct 承認依頼表 
	 * @return　リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
	public int insertMST_APPR_CORREL(IDbConnection conn,
			MstApprCorrelInfoStruct struct) throws SQLException {
		PreparedStatement insertStmt = null;
		try {
			int updateCount = 0;
			CLOB clob = oracle.sql.CLOB.createTemporary(conn.getConn(), true, 1);
			for (int i = 0; i < struct.getINFO_COL().size(); i++) {
				clob = oracle.sql.CLOB.createTemporary(conn.getConn(), true, 1);
				clob.putString(1, struct.getINFO_COL().get(i).toString());
				insertStmt = conn.getConn().prepareStatement(_insertMST_APPR_CORREL);
				insertStmt.setString(1, struct.getAPPR_ID());
				insertStmt.setString(2, String.valueOf(i + 1));
				insertStmt.setClob(3, clob);
				insertStmt.setString(4, struct.getCREATED_BY());
				insertStmt.setString(5, struct.getCREATED_PRG_NM());
				insertStmt.setString(6, struct.getUPDATED_BY());
				insertStmt.setString(7, struct.getUPDATED_PRG_NM());
				updateCount = insertStmt.executeUpdate();
			}
			return updateCount;
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * CLOB型からString型に変えます
	 * @param CLOB  CLOB型SQL文
	 * @return　String　　String型SQL文
	 * @throws SQLException DBアクセスエラー
	 * @throws IOException 
	 */
	public String ClobToString(Clob clob) throws SQLException, IOException { 
		Reader is = clob.getCharacterStream();
		BufferedReader br = new BufferedReader(is);
		try {		
			String s = br.readLine();
			StringBuffer sb = new StringBuffer();
			while (s != null) {
				sb.append(s);
				s = br.readLine();
			}	
			return sb.toString();
		} catch (IOException e){
		  throw e;
		}finally{
				is.close();
				br.close();
		}
	} 

	/**
	 * 承認関連依頼情報を実行
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_ID 承認ID
	 * @return　なし
	 * @throws SQLException DBアクセスエラー
	 * @throws IOException 
	 */
	public void executeMST_APPR_CORREL(IDbConnection conn, String appr_ID) throws SQLException {
		PreparedStatement updateStmt = null;
		try {
			// SQL文を取得
			String sql = "SELECT INFO_COL FROM MST_APPR_CORREL WHERE APPR_ID = ?";
			updateStmt = conn.getConn().prepareStatement(sql);
			updateStmt.setString(1, appr_ID);
			ResultSet rs = updateStmt.executeQuery(); 
			List rstList = new ArrayList();
			while (rs.next()) { 
				rstList.add(ClobToString(rs.getClob("INFO_COL")));
			} 
			// 関連依頼情報SQL文を実行
			for (int i = 0; i < rstList.size(); i++) {
				updateStmt = conn.getConn().prepareStatement((rstList.get(i).toString()).replaceAll("'null'", "''"));
				updateStmt.executeUpdate();
			}
		}catch(IOException e){
				throw new SQLException();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 承認関連依頼情報削除
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_ID　承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void deleteMST_APPR_CORREL(IDbConnection conn,String appr_ID) throws SQLException{
		PreparedStatement updateStmt = null;
		try{
			updateStmt = conn.getConn().prepareStatement(_deleteMST_APPR_CORREL);
			updateStmt.setString(1, appr_ID);
			updateStmt.executeUpdate();
		}finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * 承認IDより、承認依頼表検索
	 * 
	 * @param conn
	 *            DBアクセス用のコネクション
	 * @param appr_ID
	 *            承認ID
	 * @return 承認依頼表レコード
	 * @throws SQLException
	 *             DBアクセスエラー
	 */
	public List selectMST_APPR(IDbConnection conn, String appr_ID ) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectSet = null;
		List resultList = new ArrayList();
		try {
			selectStmt = conn.getConn().prepareStatement(_selectMST_APPR);
			selectStmt.setString(1,appr_ID);                                       // 承認ID
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setPROC_TYP(selectSet.getString(1));
				struct.setSCREEN_URL(selectSet.getString(2));
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(selectSet);
		}
	}

	/**
	 * 承認IDより、承認明細検索
	 * 
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_ID 承認ID
	 * @return 承認明細表レコード
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectMST_APPR_DETAIL(IDbConnection conn, String appr_ID)throws SQLException {
		PreparedStatement selectStmt = null;
		ResultSet selectSet = null;
		List resultList = new ArrayList();
		try {
			selectStmt = conn.getConn().prepareStatement(_selectMST_APPR_DETAIL);
			selectStmt.setString(1,appr_ID);                                       // 承認ID
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprDetailStruct struct = new MstApprDetailStruct();
				struct = changeToDetailStruct(selectSet);
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(selectSet);
		}
	}

	/**
	 * 承認IDより、承認小明細検索
	 * 
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_ID 承認ID
	 * @return 承認小明細レコード
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectMST_APPR_DETAIL_LIST(IDbConnection conn, String appr_ID)throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectSet = null;
		List resultList = new ArrayList();
		try {
			selectStmt = conn.getConn().prepareStatement(_selectMST_APPR_DETAIL_LIST);
			selectStmt.setString(1,appr_ID);                                       // 承認ID
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprDetailListStruct struct = new MstApprDetailListStruct();
				struct = changeToListStruct(selectSet);
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(selectSet);
		}
	}

	/**
	 * 
	 * @param ResultSet　
	 * @return MstApprStruct 承認依頼オブジェクト
	 * @throws SQLException DBアクセスエラー
	 */
	public MstApprStruct changeToStruct(ResultSet rs)
			throws SQLException {

		MstApprStruct struct = new MstApprStruct();
		struct.setAPPR_ID(rs.getString(1));
		struct.setSCREEN_URL(rs.getString(2));
		struct.setPLANT_CD(rs.getString(3));
		struct.setPROC_TYP(rs.getString(4));
		struct.setAPPR_REMARKS(rs.getString(5));
		struct.setSTATUS(rs.getString(6));
		struct.setRESERVE_CAUSE(rs.getString(7));
		struct.setREQUEST_BY(rs.getString(8));
		struct.setAPPR_BY(rs.getString(9));
		struct.setCREATED_DATE(rs.getString(10));
		struct.setCREATED_BY(rs.getString(11));
		struct.setCREATED_PRG_NM(rs.getString(12));
		struct.setUPDATED_DATE(rs.getString(13));
		struct.setUPDATED_BY(rs.getString(14));
		struct.setUPDATED_PRG_NM(rs.getString(15));
		struct.setMODIFY_COUNT(rs.getString(16));
		return struct;
	}

	/**
	 * 
	 * @param rs
	 * @return　MstApprDetailStruct　承認明細オブジェクト
	 * @throws SQLException DBアクセスエラー
	 */
	public MstApprDetailStruct changeToDetailStruct(ResultSet rs)throws  SQLException {
		MstApprDetailStruct struct = new MstApprDetailStruct();
		struct.setAPPR_ID(rs.getString(1));
		struct.setAPPR_REMARKS(rs.getString(2));
		struct.setTABLE_NAME(rs.getString(3));
		struct.setITEM_COL1(rs.getString(4));
		struct.setITEM_COL2(rs.getString(5));
		struct.setITEM_COL3(rs.getString(6));
		struct.setITEM_COL4(rs.getString(7));
		struct.setITEM_COL5(rs.getString(8));
		struct.setITEM_COL6(rs.getString(9));
		struct.setITEM_COL7(rs.getString(10));
		struct.setITEM_COL8(rs.getString(11));
		struct.setITEM_COL9(rs.getString(12));
		struct.setITEM_COL10(rs.getString(13));
		struct.setITEM_COL11(rs.getString(14));
		struct.setITEM_COL12(rs.getString(15));
		struct.setITEM_COL13(rs.getString(16));
		struct.setITEM_COL14(rs.getString(17));
		struct.setITEM_COL15(rs.getString(18));
		struct.setITEM_COL16(rs.getString(19));
		struct.setITEM_COL17(rs.getString(20));
		struct.setITEM_COL18(rs.getString(21));
		struct.setITEM_COL19(rs.getString(22));
		struct.setITEM_COL20(rs.getString(23));
		struct.setITEM_COL21(rs.getString(24));
		struct.setITEM_COL22(rs.getString(25));
		struct.setITEM_COL23(rs.getString(26));
		struct.setITEM_COL24(rs.getString(27));
		struct.setITEM_COL25(rs.getString(28));
		struct.setITEM_COL26(rs.getString(29));
		struct.setITEM_COL27(rs.getString(30));
		struct.setITEM_COL28(rs.getString(31));
		struct.setITEM_COL29(rs.getString(32));
		struct.setITEM_COL30(rs.getString(33));
		struct.setITEM_COL31(rs.getString(34));
		struct.setITEM_COL32(rs.getString(35));
		struct.setITEM_COL33(rs.getString(36));
		struct.setITEM_COL34(rs.getString(37));
		struct.setITEM_COL35(rs.getString(38));
		struct.setITEM_COL36(rs.getString(39));
		struct.setITEM_COL37(rs.getString(40));
		struct.setITEM_COL38(rs.getString(41));
		struct.setITEM_COL39(rs.getString(42));
		struct.setITEM_COL40(rs.getString(43));
		struct.setITEM_COL41(rs.getString(44));
		struct.setITEM_COL42(rs.getString(45));
		struct.setITEM_COL43(rs.getString(46));
		struct.setITEM_COL44(rs.getString(47));
		struct.setITEM_COL45(rs.getString(48));
		struct.setITEM_COL46(rs.getString(49));
		struct.setITEM_COL47(rs.getString(50));
		struct.setITEM_COL48(rs.getString(51));
		struct.setITEM_COL49(rs.getString(52));
		struct.setITEM_COL50(rs.getString(53));
		struct.setITEM_COL51(rs.getString(54));
		struct.setITEM_COL52(rs.getString(55));
		struct.setITEM_COL53(rs.getString(56));
		struct.setITEM_COL54(rs.getString(57));
		struct.setITEM_COL55(rs.getString(58));
		struct.setITEM_COL56(rs.getString(59));
		struct.setITEM_COL57(rs.getString(60));
		struct.setITEM_COL58(rs.getString(61));
		struct.setITEM_COL59(rs.getString(62));
		struct.setITEM_COL60(rs.getString(63));
		struct.setITEM_COL61(rs.getString(64));
		struct.setITEM_COL62(rs.getString(65));
		struct.setITEM_COL63(rs.getString(66));
		struct.setITEM_COL64(rs.getString(67));
		struct.setITEM_COL65(rs.getString(68));
		struct.setITEM_COL66(rs.getString(69));
		struct.setITEM_COL67(rs.getString(70));
		struct.setITEM_COL68(rs.getString(71));
		struct.setITEM_COL69(rs.getString(72));
		struct.setITEM_COL70(rs.getString(73));
		struct.setITEM_COL71(rs.getString(74));
		struct.setITEM_COL72(rs.getString(75));
		struct.setITEM_COL73(rs.getString(76));
		struct.setITEM_COL74(rs.getString(77));
		struct.setITEM_COL75(rs.getString(78));
		struct.setITEM_COL76(rs.getString(79));
		struct.setITEM_COL77(rs.getString(80));
		struct.setITEM_COL78(rs.getString(81));
		struct.setITEM_COL79(rs.getString(82));
		struct.setITEM_COL80(rs.getString(83));
		struct.setITEM_COL81(rs.getString(84));
		struct.setITEM_COL82(rs.getString(85));
		struct.setITEM_COL83(rs.getString(86));
		struct.setITEM_COL84(rs.getString(87));
		struct.setITEM_COL85(rs.getString(88));
		struct.setITEM_COL86(rs.getString(89));
		struct.setITEM_COL87(rs.getString(90));
		struct.setITEM_COL88(rs.getString(91));
		struct.setITEM_COL89(rs.getString(92));
		struct.setITEM_COL90(rs.getString(93));
		struct.setITEM_COL91(rs.getString(94));
		struct.setITEM_COL92(rs.getString(95));
		struct.setITEM_COL93(rs.getString(96));
		struct.setITEM_COL94(rs.getString(97));
		struct.setITEM_COL95(rs.getString(98));
		struct.setITEM_COL96(rs.getString(99));
		struct.setITEM_COL97(rs.getString(100));
		struct.setITEM_COL98(rs.getString(101));
		struct.setITEM_COL99(rs.getString(102));
		struct.setITEM_COL100(rs.getString(103));
		struct.setITEM_COL101(rs.getString(104));
		struct.setITEM_COL102(rs.getString(105));
		struct.setITEM_COL103(rs.getString(106));
		struct.setITEM_COL104(rs.getString(107));
		struct.setITEM_COL105(rs.getString(108));
		struct.setITEM_COL106(rs.getString(109));
		struct.setITEM_COL107(rs.getString(110));
		struct.setITEM_COL108(rs.getString(111));
		struct.setITEM_COL109(rs.getString(112));
		struct.setITEM_COL110(rs.getString(113));	
		struct.setITEM_COL111(rs.getString(114));
		struct.setITEM_COL112(rs.getString(115));
		struct.setITEM_COL113(rs.getString(116));
		struct.setITEM_COL114(rs.getString(117));
		struct.setITEM_COL115(rs.getString(118));
		struct.setITEM_COL116(rs.getString(119));
		struct.setITEM_COL117(rs.getString(120));
		struct.setITEM_COL118(rs.getString(121));
		struct.setITEM_COL119(rs.getString(122));
		struct.setITEM_COL120(rs.getString(123));
		struct.setITEM_COL121(rs.getString(124));
		struct.setITEM_COL122(rs.getString(125));
		struct.setITEM_COL123(rs.getString(126));
		struct.setITEM_COL124(rs.getString(127));
		struct.setITEM_COL125(rs.getString(128));
		struct.setITEM_COL126(rs.getString(129));
		struct.setITEM_COL127(rs.getString(130));
		struct.setITEM_COL128(rs.getString(131));
		struct.setITEM_COL129(rs.getString(132));
		struct.setITEM_COL130(rs.getString(133));
		struct.setITEM_COL131(rs.getString(134));
		struct.setITEM_COL132(rs.getString(135));
		struct.setITEM_COL133(rs.getString(136));
		struct.setITEM_COL134(rs.getString(137));
		struct.setITEM_COL135(rs.getString(138));
		struct.setITEM_COL136(rs.getString(139));
		struct.setITEM_COL137(rs.getString(140));
		struct.setITEM_COL138(rs.getString(141));
		struct.setITEM_COL139(rs.getString(142));
		struct.setITEM_COL140(rs.getString(143));
		struct.setITEM_COL141(rs.getString(144));
		struct.setITEM_COL142(rs.getString(145));
		struct.setITEM_COL143(rs.getString(146));
		struct.setITEM_COL144(rs.getString(147));
		struct.setITEM_COL145(rs.getString(148));
		struct.setITEM_COL146(rs.getString(149));
		struct.setITEM_COL147(rs.getString(150));
		struct.setITEM_COL148(rs.getString(151));
		struct.setITEM_COL149(rs.getString(152));
		struct.setITEM_COL150(rs.getString(153));				
		struct.setCREATED_DATE(rs.getString(154));
		struct.setCREATED_BY(rs.getString(155));
		struct.setCREATED_PRG_NM(rs.getString(156));
		struct.setUPDATED_DATE(rs.getString(157));
		struct.setUPDATED_BY(rs.getString(158));
		struct.setUPDATED_PRG_NM(rs.getString(159));
		struct.setMODIFY_COUNT(rs.getString(160));
		return struct;
	}

	/**
	 * 
	 * @param rs
	 * @return　MstApprDetailListStruct　承認小明細オブジェクト
	 * @throws SQLException DBアクセスエラー
	 */
	public MstApprDetailListStruct changeToListStruct(ResultSet rs)throws  SQLException {
		MstApprDetailListStruct struct = new MstApprDetailListStruct();
		struct.setAPPR_ID(rs.getString(1));
		struct.setTABLE_NAME(rs.getString(2));
		struct.setITEM_COL1(rs.getString(3));
		struct.setITEM_COL2(rs.getString(4));
		struct.setITEM_COL3(rs.getString(5));
		struct.setITEM_COL4(rs.getString(6));
		struct.setITEM_COL5(rs.getString(7));
		struct.setITEM_COL6(rs.getString(8));
		struct.setITEM_COL7(rs.getString(9));
		struct.setITEM_COL8(rs.getString(10));
		struct.setITEM_COL9(rs.getString(11));
		struct.setITEM_COL10(rs.getString(12));
		struct.setITEM_COL11(rs.getString(13));
		struct.setITEM_COL12(rs.getString(14));
		struct.setITEM_COL13(rs.getString(15));
		struct.setITEM_COL14(rs.getString(16));
		struct.setITEM_COL15(rs.getString(17));
		struct.setITEM_COL16(rs.getString(18));
		struct.setITEM_COL17(rs.getString(19));
		struct.setITEM_COL18(rs.getString(20));
		struct.setITEM_COL19(rs.getString(21));
		struct.setITEM_COL20(rs.getString(22));
		struct.setITEM_COL21(rs.getString(23));
		struct.setITEM_COL22(rs.getString(24));
		struct.setITEM_COL23(rs.getString(25));
		struct.setITEM_COL24(rs.getString(26));
		struct.setITEM_COL25(rs.getString(27));
		struct.setITEM_COL26(rs.getString(28));
		struct.setITEM_COL27(rs.getString(29));
		struct.setITEM_COL28(rs.getString(30));
		struct.setITEM_COL29(rs.getString(31));
		struct.setITEM_COL30(rs.getString(32));
		struct.setCREATED_DATE(rs.getString(33));
		struct.setCREATED_BY(rs.getString(34));
		struct.setCREATED_PRG_NM(rs.getString(35));
		struct.setUPDATED_DATE(rs.getString(36));
		struct.setUPDATED_BY(rs.getString(37));
		struct.setUPDATED_PRG_NM(rs.getString(38));
		struct.setMODIFY_COUNT(rs.getString(39));
		return struct;
	}
	
	/**
	 * 依頼情報の検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd 工場コード
	 * @param user_cd ユーザコード
	 * @return　List 依頼情報
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectRequestData(IDbConnection conn,String plant_cd,String user_cd) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet requestSet = null;
		List resultList = new ArrayList();
		try {
			selectStmt = conn.getConn().prepareStatement(_selectRequestData);
			selectStmt.setString(1,plant_cd);                                // 工場コード
			selectStmt.setString(2,user_cd);                                 // ユーザコード
			requestSet = selectStmt.executeQuery();
			while (requestSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSCREEN_URL(requestSet.getString(1));
				struct.setSCREEN_NAME(requestSet.getString(2));
				struct.setREQUEST_COUNT(requestSet.getString(3));
				struct.setAPPRING_COUNT(requestSet.getString(4));
				struct.setRESERVE_COUNT(requestSet.getString(5));
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(requestSet);
		}
	}
	
	/**
	 * 承認待ち情報検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd 工場コード
	 * @param user_cd ユーザコード
	 * @return　List 承認待ち情報
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectAppringData(IDbConnection conn,String plant_cd,String user_cd) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectSet = null;
		List resultList = new ArrayList();
		try {
			selectStmt = conn.getConn().prepareStatement(_selectAppringData);
			selectStmt.setString(1,plant_cd);                               // 工場コード
			selectStmt.setString(2,user_cd);                                // ユーザコード
			selectStmt.setString(3,user_cd);                                // ユーザコード
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSCREEN_URL(selectSet.getString(1));
				struct.setSCREEN_NAME(selectSet.getString(2));
				struct.setREQUEST_COUNT(selectSet.getString(3));
				struct.setAPPRING_COUNT(selectSet.getString(4));
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(selectSet);
		}
	}
	
	/**
	 * 保留情報検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd 工場コード
	 * @param user_cd ユーザコード
	 * @return　List 保留情報情報
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectReserveData(IDbConnection conn,String plant_cd,String user_cd) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectSet = null;
		List resultList = new ArrayList();
		try {
			selectStmt = conn.getConn().prepareStatement(_selectReserveData);
			selectStmt.setString(1,plant_cd);                               // 工場コード
			selectStmt.setString(2,user_cd);                                // ユーザコード
			selectStmt.setString(3,user_cd);                                // ユーザコード
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSCREEN_URL(selectSet.getString(1));
				struct.setSCREEN_NAME(selectSet.getString(2));
				struct.setREQUEST_COUNT(selectSet.getString(3));
				struct.setRESERVE_COUNT(selectSet.getString(4));
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(selectSet);
		}
	}
	
	/**
	 * 業務区分より、依頼データ明細の検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd  工場コード
	 * @param request_by　依頼者
	 * @param screen_url 　画面URL
	 * @return　List 依頼データ明細
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectRequestDetail(IDbConnection conn,String plant_cd,String request_by,String screen_url) throws SQLException{
		PreparedStatement selectStmt = null;
		PreparedStatement keySelectStmt = null;
		ResultSet selectSet = null;
		ResultSet keySet = null;
		List resultList = new ArrayList();
		try {
			// 検索SQL
			StringBuffer selectSQL = new StringBuffer("SELECT");
			selectSQL.append(" MST_APPR.STATUS,MST_APPR.APPR_ID,MST_APPR.PROC_TYP,");
			selectSQL.append("MST_APPR.APPR_REMARKS,MST_APPR.REQUEST_BY,USER_MST.USER_NAME,");
			selectSQL.append("TO_CHAR(MST_APPR.REQUEST_DATE,'YYYY/MM/DD'),MST_APPR.RESERVE_CAUSE,");
			selectSQL.append("MST_APPR.MODIFY_COUNT,");
			selectSQL.append("MST_APPR_DETAIL.TABLE_NAME,");
			// 画面URLはAA0090030Servletの場合(利用者メンテナンス)
			if("AA0090030Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"USER_MST","USER_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"USER_MST","USER_NAME")+", ");
				selectSQL.append("''");
			}
			// 画面URLはKA0040010Servletの場合(製品単価メンテナンス)
			if("KA0040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0040030Servletの場合(支給品単価メンテナンス)
			if("AA0040030Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","VEND_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0040020Servletの場合(外注単価メンテナンス)
			if("AA0040020Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","ITEM_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","PROC_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","PROC_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","VEND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","VEND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","VEND_ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","EFF_PHASE_IN_DATE"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはAA0040010Servletの場合(購入単価メンテナンス)
			if("AA0040010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","ITEM_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","VEND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","VEND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","VEND_ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","EFF_PHASE_IN_DATE"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","PUCH_PRIORITY_REF_NO"));
				selectSQL.append(" ELSE ");
				selectSQL.append("'' ");
				selectSQL.append(" END");
			}
			// 画面URLはAA0070010Servletの場合(取引先メンテナンス)
			if("AA0070010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0120010Servletの場合(為替レート情報メンテナンス)
			if("AA0120010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","CUR_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_TYP")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_RESERVE_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_START_DATE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_RATE"));
			}
			// 画面URLはKA0100010Servletの場合(得意先メンテナンス)
			if("KA0100010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA0100020Servletの場合(得意先納品場所メンテナンス)
			if("KA0100020Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBA0020010Servletの場合(請求条件メンテナンス)
			if("BA0020010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'' ");
			}
			// 画面URLはBA0040010Servletの場合(請求条件データ一括登録)
			if("BA0040010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはBA0050010Servletの場合(得意先メンテナンス（売掛）)
			if("BA0050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'', ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはBZ0010010Servletの場合(会社メンテナンス)
			if("BZ0010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_COMPANY","COMPANY_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_COMPANY","COMPANY_FNAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0020010Servletの場合(利用者所属会社メンテナンス)
			if("BZ0020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","USER_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","COMPANY_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","USER_TYP")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0050010Servletの場合(銀行メンテナンス)
			if("BZ0050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_H","BANK_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append(" '' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_BR_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_H","BANK_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_BR_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはBZ0110010Servletの場合(銀行口座メンテナンス)
			if("BZ0110010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_B_ACCT","B_ACCT_CTRL_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_B_ACCT","B_ACCT_MNG_NAME")+",");
				selectSQL.append("'' ");
			}
			// 画面URLはBZ0210010Servletの場合(再評価為替レートメンテナンス)
			if("BZ0210010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","CUR_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_TYP")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_RESERVE_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_START_DATE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_RATE"));
			}
			// 画面URLはBZ0250010Servletの場合(科目メンテナンス)
			if("BZ0250010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ACCT","ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ACCT","ACCT_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0270010Servletの場合(銀行手数料メンテナンス)
			if("BZ0270010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_FEE","BANK_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0020010Servletの場合(取引先メンテナンス)
			if("CA0020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA0040010Servletの場合(取引先支払条件メンテナンス)
			if("CA0040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","VEND_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","ACCT_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","SUB_ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0060010Servletの場合(支払方法メンテナンス)
			if("CA0060010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_METHOD","PAY_METHOD_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_METHOD","PAY_METHOD")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA0100010Servletの場合(利用者権限管理メンテナンス)
			if("CA0100010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_USER_CTRL_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_CTRL_H","USER_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_CTRL","USER_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0080010Servletの場合(支払パターンメンテナンス)
			if("CA0080010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_PATTERN","PAY_PATTERN_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_PATTERN","PAY_PATTERN_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBA0080010Servletの場合(買掛仕訳パターンメンテナンス)
			if("CA0120010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_AUTO_JNL","PATTERN_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_AUTO_JNL","AUTO_JNL_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1020010Servletの場合(販売単価メンテナンスJa)
			if("KA1020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはKA1030010Servletの場合(得意先メンテナンスJa)
			if("KA1030010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1040010Servletの場合(得意先納品場所メンテナンスJa)
			if("KA1040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1080010Servletの場合(得意先指定納品場所メンテナンスJa)
			if("KA1080010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_DESINATED_DLV_LOC_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","DLV_LOC_OPTION_CHANGE_VALUE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_DESINATED_DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはAA0010010Servletの場合(品目メンテナンス)
			if("AA0010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","DRAW_CD"));
			}
			// 画面URLはKA2100020Servletの場合(納品場所メンテナンス)
			if("KA2100020Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","ADDRESS_1"));
			}
			// 画面URLはKA2100010Servletの場合(得意先メンテナンス)
			if("KA2100010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_FNAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_ANAME"));
			}
				// 画面URLはCA2020010Servletの場合(取引先メンテナンス)
			if("CA2020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA2040010Servletの場合(取引先支払条件メンテナンス)
			if("CA2040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","VEND_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","ACCT_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","SUB_ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはAA2010010Servletの場合(品目メンテナンス)
			if("AA2010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","DRAW_CD"));
			}
			// 画面URLはAA2340010Servletの場合(在庫状態メンテナンス)
			if("AA2340010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_STOCK_STS","STOCK_STATUS")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_STOCK_STS","STOCK_STATUS_NAME")+", ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_STOCK_STS","STOCK_TYP"));
			}
			// 画面URLはKA2040010Servletの場合(製品単価メンテナンス)
			if("KA2040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","UNIT_CD")+", ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("DECODE (MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","SPCL_PRICE_TYP") 
						         + ", '1', '', " + "MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_OUT_DATE")+")");				
			}
			// 画面URLはBA2020010Servletの場合(請求条件メンテナンスJF)
			if("BA2020010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'' ");
			}
			// 画面URLはBA2050010Servletの場合(得意先メンテナンス（売掛）)
			if("BA2050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'', ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			selectSQL.append(" FROM MST_APPR,MST_APPR_DETAIL,USER_MST");
			selectSQL.append(" WHERE MST_APPR.PLANT_CD = "+"'"+plant_cd+"'");
			selectSQL.append(" AND MST_APPR.SCREEN_URL = "+"'"+screen_url+"'");
			selectSQL.append(" AND MST_APPR.REQUEST_BY = "+"'"+request_by+"'");
			selectSQL.append(" AND (MST_APPR.STATUS = 1 OR MST_APPR.STATUS = 2)");
			selectSQL.append(" AND MST_APPR.APPR_ID = MST_APPR_DETAIL.APPR_ID");
			selectSQL.append(" AND MST_APPR.REQUEST_BY = USER_MST.USER_CD");
			selectSQL.append(" ORDER BY TO_NUMBER(MST_APPR.APPR_ID)");
			selectStmt = conn.getConn().prepareStatement(selectSQL.toString());
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSTATUS(selectSet.getString(1));
				struct.setAPPR_ID(selectSet.getString(2));
				struct.setPROC_TYP(selectSet.getString(3));
				struct.setAPPR_REMARKS(selectSet.getString(4));
				struct.setREQUEST_BY(selectSet.getString(5));
				struct.setREQUEST_BY_NAME(selectSet.getString(6));
				struct.setREQUEST_DATE(selectSet.getString(7));
				struct.setRESERVE_CAUSE(selectSet.getString(8));
				struct.setMODIFY_COUNT(selectSet.getString(9));
				struct.setTABLE_NAEM(selectSet.getString(10));
				struct.setITEM_COL1(selectSet.getString(11));
				struct.setITEM_COL2(selectSet.getString(12));
				struct.setITEM_COL3(selectSet.getString(13));
				struct.setITEM_COL4(selectSet.getString(14));
				struct.setITEM_COL5(selectSet.getString(15));
				keySelectStmt = conn.getConn().prepareStatement(_selectMST_APPR_KEY);
				keySelectStmt.setString(1,struct.getAPPR_ID());
				keySet = keySelectStmt.executeQuery();
				if(keySet.next()){
					struct.setKey1(keySet.getString(1));
					struct.setValue1(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey2(keySet.getString(1));
					struct.setValue2(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey3(keySet.getString(1));
					struct.setValue3(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey4(keySet.getString(1));
					struct.setValue4(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey5(keySet.getString(1));
					struct.setValue5(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey6(keySet.getString(1));
					struct.setValue6(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey7(keySet.getString(1));
					struct.setValue7(keySet.getString(2));
				}
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closePreparedStatement(keySelectStmt);
			this.closeResultSet(selectSet);
			this.closeResultSet(keySet);
		}
	}
	
	/**
	 * KA2130010得意先組合せメンテナンス明細の検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd  工場コード
	 * @param request_by　依頼者
	 * @param screen_url 　画面URL
	 * @return　List 依頼データ明細
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectRequestDetailKA2130(IDbConnection conn,String plant_cd,String request_by,String screen_url) throws SQLException{
		PreparedStatement selectStmt = null;
		PreparedStatement keySelectStmt = null;
		ResultSet selectSet = null;
		ResultSet keySet = null;
		List resultList = new ArrayList();
		try {
			// 検索SQL
			StringBuffer selectSQL = new StringBuffer("SELECT");
			selectSQL.append(" MST_APPR.STATUS,MST_APPR.APPR_ID,MST_APPR.PROC_TYP,");
			selectSQL.append("MST_APPR.APPR_REMARKS,MST_APPR.REQUEST_BY,USER_MST.USER_NAME,");
			selectSQL.append("TO_CHAR(MST_APPR.REQUEST_DATE,'YYYY/MM/DD'),MST_APPR.RESERVE_CAUSE,");
			selectSQL.append("MST_APPR.MODIFY_COUNT,");
			selectSQL.append("MST_APPR_DETAIL.TABLE_NAME,");			
			//　納入先コード
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL3,");
			// 得意先コード
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL5,");
			// 帳合パターン番号
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL9,");
			// 帳合先コード1
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL11,");
			// 帳合先コード2
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL13");		
			selectSQL.append(" FROM MST_APPR,MST_APPR_DETAIL,USER_MST");
			selectSQL.append(" WHERE MST_APPR.PLANT_CD = "+"'"+plant_cd+"'");
			selectSQL.append(" AND MST_APPR.SCREEN_URL = "+"'"+screen_url+"'");
			selectSQL.append(" AND MST_APPR.REQUEST_BY = "+"'"+request_by+"'");
			selectSQL.append(" AND (MST_APPR.STATUS = 1 OR MST_APPR.STATUS = 2)");
			selectSQL.append(" AND MST_APPR.APPR_ID = MST_APPR_DETAIL.APPR_ID");
			selectSQL.append(" AND MST_APPR.REQUEST_BY = USER_MST.USER_CD");
			selectSQL.append(" ORDER BY TO_NUMBER(MST_APPR.APPR_ID)");
			selectStmt = conn.getConn().prepareStatement(selectSQL.toString());
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSTATUS(selectSet.getString(1));
				struct.setAPPR_ID(selectSet.getString(2));
				struct.setPROC_TYP(selectSet.getString(3));
				struct.setAPPR_REMARKS(selectSet.getString(4));
				struct.setREQUEST_BY(selectSet.getString(5));
				struct.setREQUEST_BY_NAME(selectSet.getString(6));
				struct.setREQUEST_DATE(selectSet.getString(7));
				struct.setRESERVE_CAUSE(selectSet.getString(8));
				struct.setMODIFY_COUNT(selectSet.getString(9));
				struct.setTABLE_NAEM(selectSet.getString(10));
				struct.setITEM_COL1(selectSet.getString(11));
				struct.setITEM_COL2(selectSet.getString(12));
				struct.setITEM_COL3(selectSet.getString(13));
				struct.setITEM_COL4(selectSet.getString(14));
				struct.setITEM_COL5(selectSet.getString(15));
				keySelectStmt = conn.getConn().prepareStatement(_selectMST_APPR_KEY);
				keySelectStmt.setString(1,struct.getAPPR_ID());
				keySet = keySelectStmt.executeQuery();
				if(keySet.next()){
					struct.setKey1(keySet.getString(1));
					struct.setValue1(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey2(keySet.getString(1));
					struct.setValue2(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey3(keySet.getString(1));
					struct.setValue3(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey4(keySet.getString(1));
					struct.setValue4(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey5(keySet.getString(1));
					struct.setValue5(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey6(keySet.getString(1));
					struct.setValue6(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey7(keySet.getString(1));
					struct.setValue7(keySet.getString(2));
				}
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closePreparedStatement(keySelectStmt);
			this.closeResultSet(selectSet);
			this.closeResultSet(keySet);
		}
	}
	
	/**
	 * 業務区分より、承認待ちデータ明細の検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd  工場コード
	 * @param screen_url 　画面URL
	 * @return　List 承認待ちデータ明細
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectAppringDetail(IDbConnection conn,String plant_cd,String screen_url) throws SQLException{
		PreparedStatement selectStmt = null;
		PreparedStatement keySelectStmt = null;
		ResultSet selectSet = null;
		ResultSet keySet = null;
		
		List resultList = new ArrayList();
		try {
			// 検索SQL
			StringBuffer selectSQL = new StringBuffer("SELECT"+" ");
			selectSQL.append("MST_APPR.STATUS,MST_APPR.APPR_ID,MST_APPR.PROC_TYP,");
			selectSQL.append("MST_APPR.APPR_REMARKS,MST_APPR.REQUEST_BY,USER_MST.USER_NAME,");
			selectSQL.append("TO_CHAR(MST_APPR.REQUEST_DATE,'YYYY/MM/DD'),MST_APPR.RESERVE_CAUSE,");
			selectSQL.append("MST_APPR.MODIFY_COUNT,");
			selectSQL.append("MST_APPR_DETAIL.TABLE_NAME,");
			// 画面URLはAA0090030Servletの場合(利用者メンテナンス)
			if("AA0090030Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"USER_MST","USER_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"USER_MST","USER_NAME")+", ");
				selectSQL.append("''");
			}
			// 画面URLはKA0040010Servletの場合(製品単価メンテナンス)
			if("KA0040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0040030Servletの場合(支給品単価メンテナンス)
			if("AA0040030Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","VEND_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0040020Servletの場合(外注単価メンテナンス)
			if("AA0040020Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","ITEM_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","PROC_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","PROC_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","VEND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","VEND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","VEND_ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","EFF_PHASE_IN_DATE"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはAA0040010Servletの場合(購入単価メンテナンス)
			if("AA0040010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","ITEM_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","VEND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","VEND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","VEND_ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","EFF_PHASE_IN_DATE"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","PUCH_PRIORITY_REF_NO"));
				selectSQL.append(" ELSE ");
				selectSQL.append("'' ");
				selectSQL.append(" END");
			}
			// 画面URLはAA0070010Servletの場合(取引先メンテナンス)
			if("AA0070010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0120010Servletの場合(為替レート情報メンテナンス)
			if("AA0120010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","CUR_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_TYP")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_RESERVE_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_START_DATE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_RATE"));
			}
			// 画面URLはKA0100010Servletの場合(得意先メンテナンス)
			if("KA0100010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA0100020Servletの場合(得意先納品場所メンテナンス)
			if("KA0100020Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBA0020010Servletの場合(請求条件メンテナンス)
			if("BA0020010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'' ");
			}
			// 画面URLはBA0040010Servletの場合(請求条件データ一括登録)
			if("BA0040010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはBA0050010Servletの場合(得意先メンテナンス（売掛）)
			if("BA0050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'', ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはBZ0010010Servletの場合(会社メンテナンス)
			if("BZ0010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_COMPANY","COMPANY_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_COMPANY","COMPANY_FNAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0020010Servletの場合(利用者所属会社メンテナンス)
			if("BZ0020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","USER_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","COMPANY_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","USER_TYP")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0050010Servletの場合(銀行メンテナンス)
			if("BZ0050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_H","BANK_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append(" '' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_BR_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_H","BANK_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_BR_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはBZ0110010Servletの場合(銀行口座メンテナンス)
			if("BZ0110010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_B_ACCT","B_ACCT_CTRL_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_B_ACCT","B_ACCT_MNG_NAME")+",");
				selectSQL.append("'' ");
			}
			// 画面URLはBZ0210010Servletの場合(再評価為替レートメンテナンス)
			if("BZ0210010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","CUR_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_TYP")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_RESERVE_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_START_DATE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_RATE"));
			}
			// 画面URLはBZ0250010Servletの場合(科目メンテナンス)
			if("BZ0250010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ACCT","ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ACCT","ACCT_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0270010Servletの場合(銀行手数料メンテナンス)
			if("BZ0270010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_FEE","BANK_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0020010Servletの場合(取引先メンテナンス)
			if("CA0020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA0040010Servletの場合(取引先支払条件メンテナンス)
			if("CA0040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","VEND_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","ACCT_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","SUB_ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0060010Servletの場合(支払方法メンテナンス)
			if("CA0060010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_METHOD","PAY_METHOD_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_METHOD","PAY_METHOD")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA0100010Servletの場合(利用者権限管理メンテナンス)
			if("CA0100010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_USER_CTRL_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_CTRL_H","USER_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_CTRL","USER_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0080010Servletの場合(支払パターンメンテナンス)
			if("CA0080010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_PATTERN","PAY_PATTERN_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_PATTERN","PAY_PATTERN_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBA0080010Servletの場合(買掛仕訳パターンメンテナンス)
			if("CA0120010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_AUTO_JNL","PATTERN_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_AUTO_JNL","AUTO_JNL_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1020010Servletの場合(販売単価メンテナンスJa)
			if("KA1020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはKA1030010Servletの場合(得意先メンテナンスJa)
			if("KA1030010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1040010Servletの場合(得意先納品場所メンテナンスJa)
			if("KA1040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1080010Servletの場合(得意先指定納品場所メンテナンスJa)
			if("KA1080010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_DESINATED_DLV_LOC_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","DLV_LOC_OPTION_CHANGE_VALUE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_DESINATED_DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはAA0010010Servletの場合(品目メンテナンス)
			if("AA0010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","DRAW_CD"));
			}
			// 画面URLはKA2100020Servletの場合(納品場所メンテナンス)
			if("KA2100020Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","ADDRESS_1"));
			}
			// 画面URLはKA2100010Servletの場合(得意先メンテナンス)
			if("KA2100010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_FNAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_ANAME"));
			}
			// 画面URLはCA2020010Servletの場合(取引先メンテナンス)
			if("CA2020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA2040010Servletの場合(取引先支払条件メンテナンス)
			if("CA2040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","VEND_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","ACCT_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","SUB_ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはAA2010010Servletの場合(品目メンテナンス)
			if("AA2010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","DRAW_CD"));
			}
			// 画面URLはAA2340010Servletの場合(在庫状態メンテナンス)
			if("AA2340010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_STOCK_STS","STOCK_STATUS")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_STOCK_STS","STOCK_STATUS_NAME")+", ");
				selectSQL.append("''");
			}
			// 画面URLはKA2040010Servletの場合(製品単価メンテナンス)
			if("KA2040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","UNIT_CD")+", ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("DECODE (MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","SPCL_PRICE_TYP") 
				                 + ", '1', '', " + "MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_OUT_DATE")+")");				
			}
			// 画面URLはBA2020010Servletの場合(請求条件メンテナンスJF)
			if("BA2020010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'' ");
			}
			// 画面URLはBA2050010Servletの場合(得意先メンテナンス（売掛）)
			if("BA2050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'', ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			selectSQL.append(" FROM MST_APPR,MST_APPR_DETAIL,USER_MST");
			selectSQL.append(" WHERE MST_APPR.PLANT_CD = "+"'"+plant_cd+"'");
			selectSQL.append(" AND MST_APPR.SCREEN_URL = "+"'"+screen_url+"'");
			selectSQL.append(" AND MST_APPR.STATUS = 1"+" ");
			selectSQL.append(" AND MST_APPR.APPR_ID = MST_APPR_DETAIL.APPR_ID");
			selectSQL.append(" AND MST_APPR.REQUEST_BY = USER_MST.USER_CD");
			selectSQL.append(" ORDER BY TO_NUMBER(MST_APPR.APPR_ID)");
			selectStmt = conn.getConn().prepareStatement(selectSQL.toString());
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSTATUS(selectSet.getString(1));
				struct.setAPPR_ID(selectSet.getString(2));
				struct.setPROC_TYP(selectSet.getString(3));
				struct.setAPPR_REMARKS(selectSet.getString(4));
				struct.setREQUEST_BY(selectSet.getString(5));
				struct.setREQUEST_BY_NAME(selectSet.getString(6));
				struct.setREQUEST_DATE(selectSet.getString(7));
				struct.setRESERVE_CAUSE(selectSet.getString(8));
				struct.setMODIFY_COUNT(selectSet.getString(9));
				struct.setTABLE_NAEM(selectSet.getString(10));
				struct.setITEM_COL1(selectSet.getString(11));
				struct.setITEM_COL2(selectSet.getString(12));
				struct.setITEM_COL3(selectSet.getString(13));
				struct.setITEM_COL4(selectSet.getString(14));
				struct.setITEM_COL5(selectSet.getString(15));
				keySelectStmt = conn.getConn().prepareStatement(_selectMST_APPR_KEY);
				keySelectStmt.setString(1,struct.getAPPR_ID());
				keySet = keySelectStmt.executeQuery();
				if(keySet.next()){
					struct.setKey1(keySet.getString(1));
					struct.setValue1(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey2(keySet.getString(1));
					struct.setValue2(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey3(keySet.getString(1));
					struct.setValue3(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey4(keySet.getString(1));
					struct.setValue4(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey5(keySet.getString(1));
					struct.setValue5(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey6(keySet.getString(1));
					struct.setValue6(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey7(keySet.getString(1));
					struct.setValue7(keySet.getString(2));
				}
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closePreparedStatement(keySelectStmt);
			this.closeResultSet(selectSet);
			this.closeResultSet(keySet);
		}
	}
	/**
	 * KA2130010得意先組合せメンテナンスの承認待ちデータ明細の検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd  工場コード
	 * @param screen_url 　画面URL
	 * @return　List 承認待ちデータ明細
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectAppringDetailKA2130(IDbConnection conn,String plant_cd,String screen_url) throws SQLException{
		PreparedStatement selectStmt = null;
		PreparedStatement keySelectStmt = null;
		ResultSet selectSet = null;
		ResultSet keySet = null;
		
		List resultList = new ArrayList();
		try {
			// 検索SQL
			StringBuffer selectSQL = new StringBuffer("SELECT"+" ");
			selectSQL.append("MST_APPR.STATUS,MST_APPR.APPR_ID,MST_APPR.PROC_TYP,");
			selectSQL.append("MST_APPR.APPR_REMARKS,MST_APPR.REQUEST_BY,USER_MST.USER_NAME,");
			selectSQL.append("TO_CHAR(MST_APPR.REQUEST_DATE,'YYYY/MM/DD'),MST_APPR.RESERVE_CAUSE,");
			selectSQL.append("MST_APPR.MODIFY_COUNT,");
			selectSQL.append("MST_APPR_DETAIL.TABLE_NAME,");
			//　納入先コード
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL3,");
			// 得意先コード
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL5,");
			// 帳合パターン番号
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL9,");
			// 帳合先コード1
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL11,");
			// 帳合先コード2
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL13");
			selectSQL.append(" FROM MST_APPR,MST_APPR_DETAIL,USER_MST");
			selectSQL.append(" WHERE MST_APPR.PLANT_CD = "+"'"+plant_cd+"'");
			selectSQL.append(" AND MST_APPR.SCREEN_URL = "+"'"+screen_url+"'");
			selectSQL.append(" AND MST_APPR.STATUS = 1"+" ");
			selectSQL.append(" AND MST_APPR.APPR_ID = MST_APPR_DETAIL.APPR_ID");
			selectSQL.append(" AND MST_APPR.REQUEST_BY = USER_MST.USER_CD");
			selectSQL.append(" ORDER BY TO_NUMBER(MST_APPR.APPR_ID)");
			selectStmt = conn.getConn().prepareStatement(selectSQL.toString());
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSTATUS(selectSet.getString(1));
				struct.setAPPR_ID(selectSet.getString(2));
				struct.setPROC_TYP(selectSet.getString(3));
				struct.setAPPR_REMARKS(selectSet.getString(4));
				struct.setREQUEST_BY(selectSet.getString(5));
				struct.setREQUEST_BY_NAME(selectSet.getString(6));
				struct.setREQUEST_DATE(selectSet.getString(7));
				struct.setRESERVE_CAUSE(selectSet.getString(8));
				struct.setMODIFY_COUNT(selectSet.getString(9));
				struct.setTABLE_NAEM(selectSet.getString(10));
				struct.setITEM_COL1(selectSet.getString(11));
				struct.setITEM_COL2(selectSet.getString(12));
				struct.setITEM_COL3(selectSet.getString(13));
				struct.setITEM_COL4(selectSet.getString(14));
				struct.setITEM_COL5(selectSet.getString(15));
				keySelectStmt = conn.getConn().prepareStatement(_selectMST_APPR_KEY);
				keySelectStmt.setString(1,struct.getAPPR_ID());
				keySet = keySelectStmt.executeQuery();
				if(keySet.next()){
					struct.setKey1(keySet.getString(1));
					struct.setValue1(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey2(keySet.getString(1));
					struct.setValue2(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey3(keySet.getString(1));
					struct.setValue3(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey4(keySet.getString(1));
					struct.setValue4(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey5(keySet.getString(1));
					struct.setValue5(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey6(keySet.getString(1));
					struct.setValue6(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey7(keySet.getString(1));
					struct.setValue7(keySet.getString(2));
				}
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closePreparedStatement(keySelectStmt);
			this.closeResultSet(selectSet);
			this.closeResultSet(keySet);
		}
	}
	/**
	 * 業務区分より、保留データ明細の検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd  工場コード
	 * @param screen_url 　画面URL
	 * @return　List 保留データ明細
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectReserveDetail(IDbConnection conn,String plant_cd,String screen_url) throws SQLException{
		PreparedStatement selectStmt = null;
		PreparedStatement keySelectStmt = null;
		ResultSet selectSet = null;
		ResultSet keySet = null;
		List resultList = new ArrayList();
		try {
			// 検索SQL
			StringBuffer selectSQL = new StringBuffer("SELECT"+" ");
			selectSQL.append("MST_APPR.STATUS,MST_APPR.APPR_ID,MST_APPR.PROC_TYP,");
			selectSQL.append("MST_APPR.APPR_REMARKS,MST_APPR.REQUEST_BY,USER_MST.USER_NAME,");
			selectSQL.append("TO_CHAR(MST_APPR.REQUEST_DATE,'YYYY/MM/DD'),MST_APPR.RESERVE_CAUSE,");
			selectSQL.append("MST_APPR.MODIFY_COUNT,");
			selectSQL.append("MST_APPR_DETAIL.TABLE_NAME,");
			// 画面URLはAA0090030Servletの場合(利用者メンテナンス)
			if("AA0090030Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"USER_MST","USER_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"USER_MST","USER_NAME")+", ");
				selectSQL.append("''");
			}
			// 画面URLはKA0040010Servletの場合(製品単価メンテナンス)
			if("KA0040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0040030Servletの場合(支給品単価メンテナンス)
			if("AA0040030Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","VEND_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CONS_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0040020Servletの場合(外注単価メンテナンス)
			if("AA0040020Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","ITEM_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","PROC_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","PROC_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","VEND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","VEND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_SBCNT_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST_H","VEND_ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SBCNT_UNIT_COST","EFF_PHASE_IN_DATE"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはAA0040010Servletの場合(購入単価メンテナンス)
			if("AA0040010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","ITEM_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","VEND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","VEND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","VEND_ITEM_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST","EFF_PHASE_IN_DATE"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_PUCH_UNIT_COST_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PUCH_UNIT_COST_H","PUCH_PRIORITY_REF_NO"));
				selectSQL.append(" ELSE ");
				selectSQL.append("'' ");
				selectSQL.append(" END");
			}
			// 画面URLはAA0070010Servletの場合(取引先メンテナンス)
			if("AA0070010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+", ");
				selectSQL.append("''");
			}
			// 画面URLはAA0120010Servletの場合(為替レート情報メンテナンス)
			if("AA0120010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","CUR_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_TYP")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_RESERVE_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_START_DATE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_EXCH_RATE","EXCH_RATE"));
			}
			// 画面URLはKA0100010Servletの場合(得意先メンテナンス)
			if("KA0100010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA0100020Servletの場合(得意先納品場所メンテナンス)
			if("KA0100020Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBA0020010Servletの場合(請求条件メンテナンス)
			if("BA0020010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'' ");
			}
			// 画面URLはBA0040010Servletの場合(請求条件データ一括登録)
			if("BA0040010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはBA0050010Servletの場合(得意先メンテナンス（売掛）)
			if("BA0050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'', ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはBZ0010010Servletの場合(会社メンテナンス)
			if("BZ0010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_COMPANY","COMPANY_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_COMPANY","COMPANY_FNAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0020010Servletの場合(利用者所属会社メンテナンス)
			if("BZ0020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","USER_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","COMPANY_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_COMPANY","USER_TYP")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0050010Servletの場合(銀行メンテナンス)
			if("BZ0050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_H","BANK_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append(" '' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_BR_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_BANK_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_H","BANK_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK","BANK_BR_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			// 画面URLはBZ0110010Servletの場合(銀行口座メンテナンス)
			if("BZ0110010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_B_ACCT","B_ACCT_CTRL_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_B_ACCT","B_ACCT_MNG_NAME")+",");
				selectSQL.append("'' ");
			}
			// 画面URLはBZ0210010Servletの場合(再評価為替レートメンテナンス)
			if("BZ0210010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","CUR_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_TYP")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_RESERVE_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_START_DATE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_REVAL_EXCH_RATE","EXCH_RATE"));
			}
			// 画面URLはBZ0250010Servletの場合(科目メンテナンス)
			if("BZ0250010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ACCT","ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ACCT","ACCT_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBZ0270010Servletの場合(銀行手数料メンテナンス)
			if("BZ0270010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_BANK_FEE","BANK_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0020010Servletの場合(取引先メンテナンス)
			if("CA0020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA0040010Servletの場合(取引先支払条件メンテナンス)
			if("CA0040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","VEND_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","ACCT_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","SUB_ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0060010Servletの場合(支払方法メンテナンス)
			if("CA0060010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_METHOD","PAY_METHOD_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_METHOD","PAY_METHOD")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA0100010Servletの場合(利用者権限管理メンテナンス)
			if("CA0100010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_USER_CTRL_H' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_CTRL_H","USER_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_USER_CTRL","USER_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはCA0080010Servletの場合(支払パターンメンテナンス)
			if("CA0080010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_PATTERN","PAY_PATTERN_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_PAY_PATTERN","PAY_PATTERN_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはBA0080010Servletの場合(買掛仕訳パターンメンテナンス)
			if("CA0120010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_AUTO_JNL","PATTERN_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_AUTO_JNL","AUTO_JNL_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1020010Servletの場合(販売単価メンテナンスJa)
			if("KA1020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_SALES_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("''");
			}
			// 画面URLはKA1030010Servletの場合(得意先メンテナンスJa)
			if("KA1030010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1040010Servletの場合(得意先納品場所メンテナンスJa)
			if("KA1040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_DLV_LOC","DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはKA1080010Servletの場合(得意先指定納品場所メンテナンスJa)
			if("KA1080010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_DESINATED_DLV_LOC_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","DLV_LOC_OPTION_CHANGE_VALUE")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_DESINATED_DLV_LOC","CUST_DESINATED_DLV_LOC_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはAA0010010Servletの場合(品目メンテナンス)
			if("AA0010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","DRAW_CD"));
			}
			// 画面URLはKA2100020Servletの場合(納品場所メンテナンス)
			if("KA2100020Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","CUST_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","DLV_LOC_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BASE","ADDRESS_1"));
			}
			// 画面URLはKA2100010Servletの場合(得意先メンテナンス)
			if("KA2100010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_FNAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_ANAME"));
			}
			// 画面URLはCA2020010Servletの場合(取引先メンテナンス)
			if("CA2020010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_CTRL","VEND_NAME")+",");
				selectSQL.append("''");
			}
			// 画面URLはCA2040010Servletの場合(取引先支払条件メンテナンス)
			if("CA2040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","VEND_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","ACCT_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_VEND_PAY_CTRL","SUB_ACCT_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("''");
			}
			// 画面URLはAA2010010Servletの場合(品目メンテナンス)
			if("AA2010010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","ITEM_NAME")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_ITEM","DRAW_CD"));
			}
			// 画面URLはAA2340010Servletの場合(在庫状態メンテナンス)
			if("AA2340010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_STOCK_STS","STOCK_STATUS")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_STOCK_STS","STOCK_STATUS_NAME")+", ");
				selectSQL.append("''");
			}
			// 画面URLはKA2040010Servletの場合(製品単価メンテナンス)
			if("KA2040010Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","ITEM_CD")+",");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","CUST_CD")+", ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","UNIT_CD")+", ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_IN_DATE")+", ");
				selectSQL.append("DECODE (MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","SPCL_PRICE_TYP") 
				                 + ", '1', '', " + "MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_UNIT_COST","EFF_PHASE_OUT_DATE")+")");
			}
			// 画面URLはBA2020010Servletの場合(請求条件メンテナンスJF)
			if("BA2020010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","BILL_ADDRESSEE_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_STL_CTRL","STL_COND_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","STL_COND_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST_STL_CTRL' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CLAIM_CUST_CTRL","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'',");
				selectSQL.append("'' ");
			}
			// 画面URLはBA2050010Servletの場合(得意先メンテナンス（売掛）)
			if("BA2050010Servlet".equals(screen_url)){
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_CD"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","CUST_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("'' ");
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_CD"));
				selectSQL.append(" END, ");
				
				selectSQL.append("'', ");
				
				selectSQL.append("CASE MST_APPR_DETAIL.TABLE_NAME WHEN 'M_CUST' THEN ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST","CUST_NAME"));
				selectSQL.append(" ELSE ");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"M_CUST_BRANCH","BRANCH_NAME"));
				selectSQL.append(" END, ");
				
				selectSQL.append("''");
			}
			selectSQL.append(" FROM MST_APPR,MST_APPR_DETAIL,USER_MST");
			selectSQL.append(" WHERE MST_APPR.PLANT_CD = "+"'"+plant_cd+"'");
			selectSQL.append(" AND MST_APPR.SCREEN_URL = "+"'"+screen_url+"'");
			selectSQL.append(" AND MST_APPR.STATUS = 2"+" ");
			selectSQL.append(" AND MST_APPR.APPR_ID = MST_APPR_DETAIL.APPR_ID");
			selectSQL.append(" AND MST_APPR.REQUEST_BY = USER_MST.USER_CD");
			selectSQL.append(" ORDER BY TO_NUMBER(MST_APPR.APPR_ID)");
			selectStmt = conn.getConn().prepareStatement(selectSQL.toString());
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSTATUS(selectSet.getString(1));
				struct.setAPPR_ID(selectSet.getString(2));
				struct.setPROC_TYP(selectSet.getString(3));
				struct.setAPPR_REMARKS(selectSet.getString(4));
				struct.setREQUEST_BY(selectSet.getString(5));
				struct.setREQUEST_BY_NAME(selectSet.getString(6));
				struct.setREQUEST_DATE(selectSet.getString(7));
				struct.setRESERVE_CAUSE(selectSet.getString(8));
				struct.setMODIFY_COUNT(selectSet.getString(9));
				struct.setTABLE_NAEM(selectSet.getString(10));
				struct.setITEM_COL1(selectSet.getString(11));
				struct.setITEM_COL2(selectSet.getString(12));
				struct.setITEM_COL3(selectSet.getString(13));
				struct.setITEM_COL4(selectSet.getString(14));
				struct.setITEM_COL5(selectSet.getString(15));
				keySelectStmt = conn.getConn().prepareStatement(_selectMST_APPR_KEY);
				keySelectStmt.setString(1,struct.getAPPR_ID());
				keySet = keySelectStmt.executeQuery();
				if(keySet.next()){
					struct.setKey1(keySet.getString(1));
					struct.setValue1(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey2(keySet.getString(1));
					struct.setValue2(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey3(keySet.getString(1));
					struct.setValue3(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey4(keySet.getString(1));
					struct.setValue4(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey5(keySet.getString(1));
					struct.setValue5(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey6(keySet.getString(1));
					struct.setValue6(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey7(keySet.getString(1));
					struct.setValue7(keySet.getString(2));
				}
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closePreparedStatement(keySelectStmt);
			this.closeResultSet(selectSet);
			this.closeResultSet(keySet);
		}
	}
	
	/**
	 * KA2130010得意先組合せメンテナンスの保留データ明細の検索
	 * @param conn  DBアクセス用のコネクション
	 * @param plant_cd  工場コード
	 * @param screen_url 　画面URL
	 * @return　List 保留データ明細
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectReserveDetailKA2130(IDbConnection conn,String plant_cd,String screen_url) throws SQLException{
		PreparedStatement selectStmt = null;
		PreparedStatement keySelectStmt = null;
		ResultSet selectSet = null;
		ResultSet keySet = null;
		List resultList = new ArrayList();
		try {
			// 検索SQL
			StringBuffer selectSQL = new StringBuffer("SELECT"+" ");
			selectSQL.append("MST_APPR.STATUS,MST_APPR.APPR_ID,MST_APPR.PROC_TYP,");
			selectSQL.append("MST_APPR.APPR_REMARKS,MST_APPR.REQUEST_BY,USER_MST.USER_NAME,");
			selectSQL.append("TO_CHAR(MST_APPR.REQUEST_DATE,'YYYY/MM/DD'),MST_APPR.RESERVE_CAUSE,");
			selectSQL.append("MST_APPR.MODIFY_COUNT,");
			selectSQL.append("MST_APPR_DETAIL.TABLE_NAME,");
			// 画面URLはAA0090030Servletの場合(利用者メンテナンス)
			if("AA0090030Servlet".equals(screen_url)){
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"USER_MST","USER_CD")+",");
				selectSQL.append("'',");
				selectSQL.append("'',");
				selectSQL.append("MST_APPR_DETAIL.ITEM_COL"+getColumnID(conn,"USER_MST","USER_NAME")+", ");
				selectSQL.append("''");
			}
			//　納入先コード
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL3,");
			// 得意先コード
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL5,");
			// 帳合パターン番号
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL9,");
			// 帳合先コード1
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL11,");
			// 帳合先コード2
			selectSQL.append("MST_APPR_DETAIL.ITEM_COL13");
			selectSQL.append(" FROM MST_APPR,MST_APPR_DETAIL,USER_MST");
			selectSQL.append(" WHERE MST_APPR.PLANT_CD = "+"'"+plant_cd+"'");
			selectSQL.append(" AND MST_APPR.SCREEN_URL = "+"'"+screen_url+"'");
			selectSQL.append(" AND MST_APPR.STATUS = 2"+" ");
			selectSQL.append(" AND MST_APPR.APPR_ID = MST_APPR_DETAIL.APPR_ID");
			selectSQL.append(" AND MST_APPR.REQUEST_BY = USER_MST.USER_CD");
			selectSQL.append(" ORDER BY TO_NUMBER(MST_APPR.APPR_ID)");
			selectStmt = conn.getConn().prepareStatement(selectSQL.toString());
			selectSet = selectStmt.executeQuery();
			while (selectSet.next()) {
				MstApprStruct struct = new MstApprStruct();
				struct.setSTATUS(selectSet.getString(1));
				struct.setAPPR_ID(selectSet.getString(2));
				struct.setPROC_TYP(selectSet.getString(3));
				struct.setAPPR_REMARKS(selectSet.getString(4));
				struct.setREQUEST_BY(selectSet.getString(5));
				struct.setREQUEST_BY_NAME(selectSet.getString(6));
				struct.setREQUEST_DATE(selectSet.getString(7));
				struct.setRESERVE_CAUSE(selectSet.getString(8));
				struct.setMODIFY_COUNT(selectSet.getString(9));
				struct.setTABLE_NAEM(selectSet.getString(10));
				struct.setITEM_COL1(selectSet.getString(11));
				struct.setITEM_COL2(selectSet.getString(12));
				struct.setITEM_COL3(selectSet.getString(13));
				struct.setITEM_COL4(selectSet.getString(14));
				struct.setITEM_COL5(selectSet.getString(15));
				keySelectStmt = conn.getConn().prepareStatement(_selectMST_APPR_KEY);
				keySelectStmt.setString(1,struct.getAPPR_ID());
				keySet = keySelectStmt.executeQuery();
				if(keySet.next()){
					struct.setKey1(keySet.getString(1));
					struct.setValue1(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey2(keySet.getString(1));
					struct.setValue2(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey3(keySet.getString(1));
					struct.setValue3(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey4(keySet.getString(1));
					struct.setValue4(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey5(keySet.getString(1));
					struct.setValue5(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey6(keySet.getString(1));
					struct.setValue6(keySet.getString(2));
				}
				if(keySet.next()){
					struct.setKey7(keySet.getString(1));
					struct.setValue7(keySet.getString(2));
				}
				resultList.add(struct);
			}
			return resultList;
		} finally {
			this.closePreparedStatement(selectStmt);
			this.closePreparedStatement(keySelectStmt);
			this.closeResultSet(selectSet);
			this.closeResultSet(keySet);
		}
	}
	
	/**
	 * 承認依頼表を更新
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_id　承認ID
	 * @param status 状態区分
	 * @param reserve_cause　保留理由
	 * @param appr_by　承認者ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void updateMST_APPR(IDbConnection conn,String appr_id,String status,String reserve_cause,String appr_by,String appr_date,String update_by,String update_prg_nm) throws SQLException{
		PreparedStatement updateStmt = null;
		try{
			updateStmt = conn.getConn().prepareStatement(_updateMST_APPR);
			updateStmt.setString(1,status);
			updateStmt.setString(2,reserve_cause);
			updateStmt.setString(3,appr_by);
			updateStmt.setString(4,appr_date);
			updateStmt.setString(5,update_by);
			updateStmt.setString(6,update_prg_nm);
			updateStmt.setString(7,appr_id);
			updateStmt.executeUpdate();
		}finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 承認依頼表削除
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_id　承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void deleteMST_APPR(IDbConnection conn,String appr_id) throws SQLException{
		PreparedStatement updateStmt = null;
		try{
			updateStmt = conn.getConn().prepareStatement(_deleteMST_APPR);
			updateStmt.setString(1, appr_id);
			updateStmt.executeUpdate();
		}finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 承認明細削除
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_id　承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void deleteMST_APPR_DETAIL(IDbConnection conn,String appr_id) throws SQLException{
		PreparedStatement updateStmt = null;
		try{
			updateStmt = conn.getConn().prepareStatement(_deleteMST_APPR_DETAIL);
			updateStmt.setString(1, appr_id);
			updateStmt.executeUpdate();
		}finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 承認小明細表削除
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_id　承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void deleteMST_APPR_DETAIL_LIST(IDbConnection conn,String appr_id) throws SQLException{
		PreparedStatement updateStmt = null;
		try{
			updateStmt = conn.getConn().prepareStatement(_deleteMST_APPR_DETAIL_LIST);
			updateStmt.setString(1, appr_id);
			updateStmt.executeUpdate();
		}finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * マスタ表に登録
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void insertMST(IDbConnection conn, MstApprDetailStruct detailStruct)throws SQLException {
		PreparedStatement insertStmt = null;
		try {
			// SQL文
			StringBuffer insertSQL = new StringBuffer("INSERT INTO ");
			// テーブル名
			String table_name = detailStruct.getTABLE_NAME();
			List columnsList = new ArrayList();
			insertSQL.append(table_name);
			insertSQL.append("(");
			// テープルのコラムを取得
			columnsList = selectColumns(conn, table_name);
			// コラムより、SQL文を設定
			for (int i = 0; i < columnsList.size(); i++) {
				if (i > 0) {
					insertSQL.append(",");
				}
				MstColumns tempstruct = new MstColumns();
				tempstruct = (MstColumns) columnsList.get(i);
				insertSQL.append(tempstruct.getColumnname());
			}
			insertSQL.append(")");
			insertSQL.append(" VALUES (");
			for (int i = 0; i < columnsList.size(); i++) {
				if (i > 0) {
					insertSQL.append(",");
				}
				MstColumns tempstruct = new MstColumns();
				tempstruct = (MstColumns) columnsList.get(i);
				if ("DATE".equals(tempstruct.getData_typ())) {
					insertSQL.append("TO_DATE('"+ getDetailByColumnID(detailStruct, tempstruct.getColumnID())+ "','YYYY/MM/DD hh24:mi:ss')");
				} else {
					insertSQL.append("'"+ getDetailByColumnID(detailStruct, tempstruct.getColumnID()).replaceAll("'", "''") + "'");
				}
			}
			insertSQL.append(")");
			insertStmt = conn.getConn().prepareStatement(insertSQL.toString());
			insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	
	/**
	 * 得意先組合テーブルに登録
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void insertM_CUST_COMB(IDbConnection conn, MstApprDetailStruct detailStruct)throws SQLException {
		PreparedStatement insertStmt = null;
		try {

			// SQL文
			String insertSQL = "INSERT INTO "
				+"  M_CUST_COMB(\"COMPANY_CD\", \"DELIVERY_CD\", \"CUST_CD\", \"PRIORITY_REF_NO\"," 
				+" 	\"CREATED_DATE\", \"CREATED_BY\", \"CREATED_PRG_NM\", \"UPDATED_DATE\", \"UPDATED_BY\","
				+"  \"UPDATED_PRG_NM\", \"MODIFY_COUNT\")" 						
				+"VALUES "
				+"  (?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD hh24:mi:ss'), ?, ?, TO_DATE(?,'YYYY/MM/DD hh24:mi:ss'), ?, ?, ?)";
			insertStmt = conn.getConn().prepareStatement(insertSQL);
			insertStmt.setString(1, detailStruct.getITEM_COL2());
			insertStmt.setString(2, detailStruct.getITEM_COL3());
			insertStmt.setString(3, detailStruct.getITEM_COL5());
			insertStmt.setString(4, detailStruct.getITEM_COL7());			
			insertStmt.setString(5, detailStruct.getITEM_COL17());
			insertStmt.setString(6, detailStruct.getITEM_COL18());
			insertStmt.setString(7, detailStruct.getITEM_COL19());
			insertStmt.setString(8, detailStruct.getITEM_COL20());
			insertStmt.setString(9, detailStruct.getITEM_COL21());
			insertStmt.setString(10, detailStruct.getITEM_COL22());
			insertStmt.setString(11, detailStruct.getITEM_COL23());
			insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}	
	
	/**
	 * 得意先組合テーブルに更新
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void updateM_CUST_COMB(IDbConnection conn, MstApprDetailStruct detailStruct)throws SQLException {
		PreparedStatement updateStmt = null;
		try {
			// SQL文
			String updateSQL = "UPDATE "
				+"  M_CUST_COMB "
				+"SET "
				+"  \"PRIORITY_REF_NO\" = ? ,"
				+"  \"UPDATED_DATE\" = TO_DATE(?,'YYYY/MM/DD hh24:mi:ss'), \"UPDATED_BY\" = ?,"
				+"  \"UPDATED_PRG_NM\" = ?, \"MODIFY_COUNT\" = \"MODIFY_COUNT\" + 1 " 	
				+"WHERE "
				+"  M_CUST_COMB.\"COMPANY_CD\" = ? "
				+"  AND M_CUST_COMB.\"DELIVERY_CD\" = ? "
				+"  AND M_CUST_COMB.\"CUST_CD\" = ?";
					
			updateStmt = conn.getConn().prepareStatement(updateSQL);
			updateStmt.setString(1, detailStruct.getITEM_COL7());
			updateStmt.setString(2, detailStruct.getITEM_COL20());
			updateStmt.setString(3, detailStruct.getITEM_COL21());
			updateStmt.setString(4, detailStruct.getITEM_COL22());
			updateStmt.setString(5, detailStruct.getITEM_COL2());
			updateStmt.setString(6, detailStruct.getITEM_COL3());
			updateStmt.setString(7, detailStruct.getITEM_COL5());
			
			updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 帳合先組合テーブルに登録
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void insertM_BALA_ACCOUT_COMB(IDbConnection conn, MstApprDetailStruct detailStruct)throws SQLException {
		PreparedStatement insertStmt = null;
		try {
			// SQL文
			String insertSQL = "INSERT INTO "
				+"  M_BALA_ACCOUT_COMB(\"COMPANY_CD\", \"DELIVERY_CD\", \"CUST_CD\", \"BALA_ACCO_PATTERN_CD\", \"BALA_ACCO_CD_1\", \"BALA_ACCO_CD_2\", \"BALA_ACCO_CD_3\", \"PRIORITY_REF_NO\", "
				+" 	\"CREATED_DATE\", \"CREATED_BY\", \"CREATED_PRG_NM\", \"UPDATED_DATE\", \"UPDATED_BY\","
				+"  \"UPDATED_PRG_NM\", \"MODIFY_COUNT\")" 	
				+"VALUES "
				+"  (?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD hh24:mi:ss'), ?, ?, TO_DATE(?,'YYYY/MM/DD hh24:mi:ss'), ?, ?, ?)";
			insertStmt = conn.getConn().prepareStatement(insertSQL);
			insertStmt.setString(1, detailStruct.getITEM_COL2());
			insertStmt.setString(2, detailStruct.getITEM_COL3());
			insertStmt.setString(3, detailStruct.getITEM_COL5());
			insertStmt.setString(4, detailStruct.getITEM_COL9());
			insertStmt.setString(5, detailStruct.getITEM_COL11());
			insertStmt.setString(6, detailStruct.getITEM_COL13());
			insertStmt.setString(7, detailStruct.getITEM_COL15());
			insertStmt.setString(8, detailStruct.getITEM_COL10());
			insertStmt.setString(9, detailStruct.getITEM_COL17());
			insertStmt.setString(10, detailStruct.getITEM_COL18());
			insertStmt.setString(11, detailStruct.getITEM_COL19());
			insertStmt.setString(12, detailStruct.getITEM_COL20());
			insertStmt.setString(13, detailStruct.getITEM_COL21());
			insertStmt.setString(14, detailStruct.getITEM_COL22());
			insertStmt.setString(15, detailStruct.getITEM_COL23());
			insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * 帳合先組合テーブルに更新
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void updateM_BALA_ACCOUT_COMB(IDbConnection conn, MstApprDetailStruct detailStruct)throws SQLException {
		PreparedStatement updateStmt = null;
		try {
			// SQL文
			String updateSQL = "UPDATE "
				+"  M_BALA_ACCOUT_COMB "
				+"SET "
				+"  \"BALA_ACCO_CD_1\" = ?, "
				+"  \"BALA_ACCO_CD_2\" = ?, "
				+"  \"BALA_ACCO_CD_3\" = ?, "
				+"  \"PRIORITY_REF_NO\" = ?, "
				+"  \"UPDATED_DATE\" = TO_DATE(?,'YYYY/MM/DD hh24:mi:ss'), \"UPDATED_BY\" = ?,"
				+"  \"UPDATED_PRG_NM\" = ?, \"MODIFY_COUNT\" = \"MODIFY_COUNT\" + 1 " 
				+"WHERE "
				+"  M_BALA_ACCOUT_COMB.\"COMPANY_CD\" = ? "
				+"  AND M_BALA_ACCOUT_COMB.\"DELIVERY_CD\" = ? "
				+"  AND M_BALA_ACCOUT_COMB.\"CUST_CD\" = ? "
				+"  AND M_BALA_ACCOUT_COMB.\"BALA_ACCO_PATTERN_CD\" = ?";
			updateStmt = conn.getConn().prepareStatement(updateSQL);
			updateStmt.setString(1, detailStruct.getITEM_COL11());
			updateStmt.setString(2, detailStruct.getITEM_COL13());
			updateStmt.setString(3, detailStruct.getITEM_COL15());
			updateStmt.setString(4, detailStruct.getITEM_COL10());
			updateStmt.setString(5, detailStruct.getITEM_COL20());
			updateStmt.setString(6, detailStruct.getITEM_COL21());
			updateStmt.setString(7, detailStruct.getITEM_COL22());
			updateStmt.setString(8, detailStruct.getITEM_COL2());
			updateStmt.setString(9, detailStruct.getITEM_COL3());
			updateStmt.setString(10, detailStruct.getITEM_COL5());
			updateStmt.setString(11, detailStruct.getITEM_COL9());
			updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * 得意先組合テーブルに削除
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void deleteM_CUST_COMB(IDbConnection conn, MstApprDetailStruct detailStruct)throws SQLException {
		PreparedStatement deleteStmt = null;
		try {
			// SQL文
			String updateSQL = "DELETE FROM "
				+"  M_CUST_COMB "
				+"WHERE "
				+"  M_CUST_COMB.\"COMPANY_CD\" = ? "
				+"  AND M_CUST_COMB.\"DELIVERY_CD\" = ? "
				+"  AND M_CUST_COMB.\"CUST_CD\" = ?";
			deleteStmt = conn.getConn().prepareStatement(updateSQL);
			deleteStmt.setString(1, detailStruct.getITEM_COL2());
			deleteStmt.setString(2, detailStruct.getITEM_COL3());
			deleteStmt.setString(3, detailStruct.getITEM_COL5());
			deleteStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(deleteStmt);
		}
	}
	
	/**
	 * 帳合先組合テーブルに削除
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void deleteM_BALA_ACCOUT_COMB(IDbConnection conn, MstApprDetailStruct detailStruct)throws SQLException {
		PreparedStatement deleteStmt = null;
		try {
			// SQL文
			String updateSQL = "DELETE FROM "
				+"  M_BALA_ACCOUT_COMB "
				+"WHERE "
				+"  M_BALA_ACCOUT_COMB.\"COMPANY_CD\" = ? "
				+"  AND M_BALA_ACCOUT_COMB.\"DELIVERY_CD\" = ? "
				+"  AND M_BALA_ACCOUT_COMB.\"CUST_CD\" = ? "
				+"  AND M_BALA_ACCOUT_COMB.\"BALA_ACCO_PATTERN_CD\" = ?";
			deleteStmt = conn.getConn().prepareStatement(updateSQL);
			deleteStmt.setString(1, detailStruct.getITEM_COL2());
			deleteStmt.setString(2, detailStruct.getITEM_COL3());
			deleteStmt.setString(3, detailStruct.getITEM_COL5());
			deleteStmt.setString(4, detailStruct.getITEM_COL9());
			deleteStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(deleteStmt);
		}
	}
	
	/**
	 * マスタ明細表に登録
	 * 
	 * @param conn　DBアクセス用のコネクション
	 * @param MstApprDetailListStruct　承認小明細オブジェクト
	 * @throws SQLException　 DBアクセスエラー
	 */
	public void insertMSTDetail(IDbConnection conn,
			MstApprDetailListStruct detailListStruct) throws SQLException {
		PreparedStatement insertStmt = null;
		try {
			// SQL文
			StringBuffer insertSQL = new StringBuffer("INSERT INTO ");
			String table_name = detailListStruct.getTABLE_NAME();
			List columnsList = new ArrayList();
			insertSQL.append(table_name);
			insertSQL.append("(");
			columnsList = selectColumns(conn, table_name);
			for (int i = 0; i < columnsList.size(); i++) {
				if (i > 0) {
					insertSQL.append(",");
				}
				MstColumns tempstruct = new MstColumns();
				tempstruct = (MstColumns) columnsList.get(i);
				insertSQL.append(tempstruct.getColumnname());
			}
			insertSQL.append(")");
			insertSQL.append(" VALUES (");
			for (int i = 0; i < columnsList.size(); i++) {
				if (i > 0) {
					insertSQL.append(",");
				}
				MstColumns tempstruct = new MstColumns();
				tempstruct = (MstColumns) columnsList.get(i);
				if ("DATE".equals(tempstruct.getData_typ())) {
					insertSQL.append("TO_DATE('"+ getListByColumnID(detailListStruct, tempstruct.getColumnID())+ "','YYYY/MM/DD hh24:mi:ss')");
				} else {
					insertSQL.append("'"+ getListByColumnID(detailListStruct, tempstruct.getColumnID()).replaceAll("'", "''") + "'");
				}
			}
			insertSQL.append(")");
			insertStmt = conn.getConn().prepareStatement(insertSQL.toString());
			insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	/**
	 * マスタ表を更新
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void updateMST(IDbConnection conn, MstApprDetailStruct detailStruct,Map keyvalueMap)
			throws SQLException {
		int i = 0;
		PreparedStatement updateStmt = null;
		try {
			// 更新SQL
			StringBuffer updateSQL = new StringBuffer("UPDATE ");
			String table_name = detailStruct.getTABLE_NAME();
			List columnsList = new ArrayList();
			updateSQL.append(table_name + " ");
			updateSQL.append("SET" + " ");
			columnsList = selectColumns(conn, table_name);
			for (int j = 0; j < columnsList.size(); j++) {
				MstColumns tempstruct = new MstColumns();
				tempstruct = (MstColumns) columnsList.get(j);
				if (!("CREATED_DATE".equals(tempstruct.getColumnname())
						|| "CREATED_BY".equals(tempstruct.getColumnname()) || "CREATED_PRG_NM"
						.equals(tempstruct.getColumnname()))) {
					if (j > 0) {
						updateSQL.append(",");
					}

					if ("MODIFY_COUNT".equals(tempstruct.getColumnname())) {
						updateSQL.append("MODIFY_COUNT = MODIFY_COUNT+1");
						continue;
					}
					//　コラムを設定
					updateSQL.append(tempstruct.getColumnname());
					updateSQL.append("=");
					//　値を設定
					if ("DATE".equals(tempstruct.getData_typ())) {
						updateSQL.append("TO_DATE('"+ getDetailByColumnID(detailStruct, tempstruct.getColumnID())+ "','YYYY/MM/DD hh24:mi:ss')");
					} else {
						updateSQL.append("'"+ getDetailByColumnID(detailStruct, tempstruct.getColumnID()).replaceAll("'", "''") + "'");
					}
				}
			}
			// 更新条件を設定
			updateSQL.append(" WHERE ");
			Iterator it=keyvalueMap.keySet().iterator();
			while(it.hasNext()){
				if (i > 0) {
					updateSQL.append(" AND ");
				}
				String key = it.next().toString();
				updateSQL.append(key);
				updateSQL.append("=");
				updateSQL.append("'"+keyvalueMap.get(key).toString().replaceAll("'", "''")+"'");
				i++;
			}
			updateStmt = conn.getConn().prepareStatement(updateSQL.toString());
			updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * マスタ明細表を更新
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void updateMSTDetail(IDbConnection conn,MstApprDetailListStruct detailListStruct,Map keyvalueMap) throws SQLException{
		int i = 0;
		PreparedStatement updateStmt = null;
		try {
			// 更新SQL
			StringBuffer updateSQL = new StringBuffer("UPDATE ");
			String table_name = detailListStruct.getTABLE_NAME();
			List columnsList = new ArrayList();
			updateSQL.append(table_name + " ");
			updateSQL.append("SET" + " ");
			columnsList = selectColumns(conn, table_name);
			for (int j = 0; j < columnsList.size(); j++) {
				MstColumns tempstruct = new MstColumns();
				tempstruct = (MstColumns) columnsList.get(j);
				// コラムを設定
				if (!("CREATED_DATE".equals(tempstruct.getColumnname())
						|| "CREATED_BY".equals(tempstruct.getColumnname()) || "CREATED_PRG_NM"
						.equals(tempstruct.getColumnname()))) {
					if (j > 0) {
						updateSQL.append(", ");
					}

					if ("MODIFY_COUNT".equals(tempstruct.getColumnname())) {
						updateSQL.append("MODIFY_COUNT = MODIFY_COUNT+1");
						continue;
					}

					updateSQL.append(tempstruct.getColumnname());
					updateSQL.append("=");
					// 値を設定
					if ("DATE".equals(tempstruct.getData_typ())) {
						updateSQL.append("TO_DATE('"
								+ getListByColumnID(detailListStruct,
										tempstruct.getColumnID())
								+ "','YYYY/MM/DD hh24:mi:ss')");
					} else {
						updateSQL.append("'"+ getListByColumnID(detailListStruct,tempstruct.getColumnID()).replaceAll("'", "''") + "'");
					}
				}
			}
			// 更新条件を設定
			updateSQL.append(" WHERE ");
			Iterator it = keyvalueMap.keySet().iterator();
			while (it.hasNext()) {
				if (i > 0) {
					updateSQL.append(" AND ");
				}
				String key = it.next().toString();
				updateSQL.append(key);
				updateSQL.append("=");
				updateSQL.append("'" + keyvalueMap.get(key) + "'");
				i++;
			}
			updateStmt = conn.getConn().prepareStatement(updateSQL.toString());
			updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * マスタ表を削除
	 * @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void deleteMST(IDbConnection conn,MstApprDetailStruct detailStruct,Map keyvalueMap) throws SQLException{
		int i = 0;
		PreparedStatement deleteStmt = null;
		try{
			// 削除SQL
			StringBuffer deleteSQL = new StringBuffer("DELETE FROM"+" ");
			String table_name = detailStruct.getTABLE_NAME();
			deleteSQL.append(table_name+" ");
			deleteSQL.append("WHERE"+" ");
			// 削除条件を設定
			Iterator it=keyvalueMap.keySet().iterator();
			while(it.hasNext()){
				if (i > 0) {
					deleteSQL.append(" AND ");
				}
				String key = it.next().toString();
				deleteSQL.append(key);
				deleteSQL.append("=");
				deleteSQL.append("'"+keyvalueMap.get(key).toString().replaceAll("'", "''")+"'");
				i++;
			}
			deleteStmt = conn.getConn().prepareStatement(deleteSQL.toString());
			deleteStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(deleteStmt);
		}
	}
	/**
	 * マスタ明細表を削除
	　* @param conn  DBアクセス用のコネクション
	 * @param MstApprDetailStruct 承認明細オブジェクト
	　* @throws SQLException DBアクセスエラー
	 */
	public void deleteMSTDetail(IDbConnection conn,String MST_Table_name,String detail_Table_name,Map keyvalueMap) throws SQLException{
		
		int i = 0;
		PreparedStatement deleteStmt = null;
		try{
			// 削除SQL
			StringBuffer deleteSQL = new StringBuffer("DELETE FROM"+" ");
			deleteSQL.append(detail_Table_name+" ");
			deleteSQL.append("WHERE"+" ");
			
			// 削除条件を設定
			Iterator it=keyvalueMap.keySet().iterator();
			while(it.hasNext()){
				if (i > 0) {
					deleteSQL.append(" AND ");
				}
				String key = it.next().toString();
				deleteSQL.append(key);
				deleteSQL.append("=");
				deleteSQL.append("'"+keyvalueMap.get(key).toString().replaceAll("'", "''")+"'");
				i++;
			}
			deleteStmt = conn.getConn().prepareStatement(deleteSQL.toString());
			deleteStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(deleteStmt);
		}
	}
		
	/**
	 * マスタ表のコラムを取得
	 * @param conn  DBアクセス用のコネクション
	 * @param table_name　マスタ表名
	 * @return　List　マスタ表の全部コラム名
	 * @throws SQLException
	 */
	public List selectColumns(IDbConnection conn,String table_name) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet resultSet = null;
		List resultList = new ArrayList();
		try{
			selectStmt = conn.getConn().prepareStatement(_selectColumns);
			selectStmt.setString(1,table_name);
			
			resultSet = selectStmt.executeQuery();
			while(resultSet.next()){
				MstColumns struct = new MstColumns();
				struct.setColumnname(resultSet.getString(1));
				struct.setColumnID(resultSet.getString(2));
				struct.setData_typ(resultSet.getString(3));
				resultList.add(struct);
			}
			return resultList;
		}finally{
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(resultSet);
		}
	}
	
	/**
	 * @param conn  DBアクセス用のコネクション
	 * @param table_name　マスタ表名
	 * @return　List　マスタ表の全部キー
	 */
	public List selectKeyColumns(IDbConnection conn,String table_name) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet resultSet = null;
		List resultList = new ArrayList();
		try{
			selectStmt = conn.getConn().prepareStatement(_selectKeyColumns);
			selectStmt.setString(1,table_name);
			resultSet = selectStmt.executeQuery();
			while(resultSet.next()){
				MstColumns struct = new MstColumns();
				struct.setColumnname(resultSet.getString(1));
				struct.setColumnID(resultSet.getString(2));
				struct.setData_typ(resultSet.getString(3));
				resultList.add(struct);
			}
			return resultList;
		}finally{
			this.closePreparedStatement(selectStmt);
			this.closeResultSet(resultSet);
		}
	}
	
	/**
	 *  カラム番号より、MstApprDetailStructに登録
	 * @param value　
	 * @param columnID
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 */
	public void setDetailByColumnID(MstApprDetailStruct detailStruct,String value,String columnID) {
		String methodName = "setITEM_COL"+columnID;
		Class detailStructClass = detailStruct.getClass();
		Class partypes[] = new Class[1];
		partypes[0]=String.class;
		Method detailStructMethod;
		try {
			detailStructMethod = detailStructClass.getMethod(methodName,partypes);
			Object arglist[] = new Object[1];
			arglist[0] = value;
			detailStructMethod.invoke(detailStruct,arglist);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * カラム番号より、MstApprDetailStructの値を取得する。
	 * @param columnID
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public String getDetailByColumnID(MstApprDetailStruct struct,String columnID) {
		String value = null;
		String methodName = "getITEM_COL"+columnID;
		Class detailStructClass = struct.getClass();
		Method detailStructMethod;
		try {
			detailStructMethod = detailStructClass.getMethod(methodName,null);
			value = (String) detailStructMethod.invoke(struct,null);
			if(null == value){
				value = "";
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	/**
	 * カラム番号より、MstApprDetailListStructに登録
	 * @param value
	 * @param columnID
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public void setListByColumnID(MstApprDetailListStruct listStruct,String value,String columnID){
		String methodName = "setITEM_COL"+columnID;
		Class listStructClass = listStruct.getClass();
		Class partypes[] = new Class[1];
		partypes[0] = String.class;
		Method listStructMethod;
		try {
			listStructMethod = listStructClass.getMethod(methodName,partypes);
			Object arglist[] = new Object[1];
			arglist[0] = value;
			listStructMethod.invoke(listStruct,arglist);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * カラム番号より、MstApprDetailListStructの値を取得する。
	 * @param columnID
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public String getListByColumnID(MstApprDetailListStruct struct,String columnID) {
		String value = null;
		String methodName = "getITEM_COL"+columnID;
		Class detailStructClass = struct.getClass();
		Method detailStructMethod;
		try {
			detailStructMethod = detailStructClass.getMethod(methodName,null);
			value = (String) detailStructMethod.invoke(struct,null);
			if(null == value){
				value = "";
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	/**
	 * DBのシステム日時読込処理
	 * 
	 * @param conn
	 *            DBアクセス用のコネクション
	 * @return DBのシステム日時:成功 / null:失敗
	 * @throws SQLException 
	 */
	public String readSystemDateTime(IDbConnection conn) throws SQLException {
		String strDateTime = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String strSql ="select "
				+ "  to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') " + "from "
				+ "  dual ";
		try {
			stmt = (conn.getConn()).prepareStatement(strSql);
			rset = stmt.executeQuery();
			if (rset.next() == true) {
				strDateTime = rset.getString(1);
			}
		} finally {
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return strDateTime;
	}

	/**
	 * 承認キー対応表登録
	 * @param conn
	 * @param struct　
	 * @return
	 * @throws SQLException
	 */
	public int insertMST_APPR_KEY(IDbConnection conn,MstApprKeyStruct struct) throws SQLException{
		PreparedStatement insertStmt = null;
		try {
			insertStmt = conn.getConn().prepareStatement(_insertMST_APPR_KEY);
			insertStmt.setString(1, struct.getAPPR_ID());
			insertStmt.setString(2, struct.getTABLE_NAME());
			insertStmt.setString(3, struct.getKEY_NAME());
			insertStmt.setString(4, struct.getKEY_VALUE());
			insertStmt.setString(5, struct.getCREATED_BY());
			insertStmt.setString(6, struct.getCREATED_PRG_NM());
			insertStmt.setString(7, struct.getUPDATED_BY());
			insertStmt.setString(8, struct.getUPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	/**
	 * 承認キー対応表検索
	 * @param conn
	 * @param appr_ID
	 * @return
	 * @throws SQLException
	 */
	public HashMap selectMST_APPR_KEY(IDbConnection conn,String appr_ID) throws SQLException{
		HashMap resultMap = new HashMap();
		PreparedStatement selectStmt = null;
		ResultSet selectSet = null;
		try{
			selectStmt = conn.getConn().prepareStatement(_selectMST_APPR_KEY);
			selectStmt.setString(1,appr_ID);
			selectSet = selectStmt.executeQuery();
			while(selectSet.next()){
				resultMap.put(selectSet.getString(1),selectSet.getString(2));
			}
		}finally {
			closeResultSet(selectSet);
			closePreparedStatement(selectStmt);
		}
		return resultMap;
	}
	
	/**
	 * 承認キー対応表削除
	 * @param conn  DBアクセス用のコネクション
	 * @param appr_id　承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void deleteMST_APPR_KEY(IDbConnection conn,String appr_id) throws SQLException{
		PreparedStatement updateStmt = null;
		try{
			updateStmt = conn.getConn().prepareStatement(_deleteMST_APPR_KEY);
			updateStmt.setString(1, appr_id);
			updateStmt.executeUpdate();
		}finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	// ------------------------------------------------------------------------------------
	// SQL定義

	// //////////////////////////////////////////////////////////////////////////

	/** 承認ID sequence */
	private String _selectSEQ_APPR_ID = "SELECT " 
				+ " LPAD(SEQ_APPR_ID.NEXTVAL, 20, '0') " 
			+ "FROM " 
				+ " DUAL";

	/** コラム名より、マスタ項目コラム番号の取得処理用のSQL */
	private String _getColumnID = "SELECT " 
				+ " UTC.COLUMN_ID " 
			+ "FROM " 
				+ " USER_TAB_COLUMNS UTC "
			+ "WHERE " 
				+ " UTC.TABLE_NAME = ? " 
				+ " AND UTC.COLUMN_NAME = ?";

	/** コラム番号より、マスタ項目コラム名の取得処理用のSQL */
	private String _getColumnName = "SELECT " 
				+ " UTC.COLUMN_NAME " 
			+ "FROM " 
				+ " USER_TAB_COLUMNS UTC "
			+ "WHERE " 
				+ " UTC.TABLE_NAME = ? " 
				+ " AND UTC.COLUMN_ID = ? ";

	/** 承認依頼表登録用のSQL */
	private String _insertMST_APPR = "INSERT INTO MST_APPR " 
			+ "(" 
				+ " APPR_ID, " 
				+ " SCREEN_URL, " 
				+ " PLANT_CD, " 
				+ " PROC_TYP, " 
				+ " APPR_REMARKS, " 
				+ " REQUEST_DATE, "
				+ " STATUS, " 
				+ " RESERVE_CAUSE, " 
				+ " REQUEST_BY, "
				+ " APPR_BY, "
				+ " CREATED_DATE, " 
				+ " CREATED_BY, "
				+ " CREATED_PRG_NM, " 
				+ " UPDATED_DATE, " 
				+ " UPDATED_BY, "
				+ " UPDATED_PRG_NM, " 
				+ " MODIFY_COUNT" 
			+ " ) "
			+ "VALUES "
			+ " ( " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " SYSDATE, " 
				+ " ?, " 
				+ " ?, " 
				+ " SYSDATE, " 
				+ " ?, " 
				+ " ?, " 
				+ " 0" 
			+ " ) ";

	/** 承認明細表の登録処理用のSQL */
	private String _insertMST_APPR_DETAIL = "INSERT INTO MST_APPR_DETAIL(APPR_ID,TABLE_NAME,ITEM_COL1,ITEM_COL2,ITEM_COL3,ITEM_COL4,ITEM_COL5,ITEM_COL6,ITEM_COL7,ITEM_COL8,ITEM_COL9,ITEM_COL10,ITEM_COL11,ITEM_COL12,ITEM_COL13,ITEM_COL14,ITEM_COL15,ITEM_COL16,ITEM_COL17,ITEM_COL18,ITEM_COL19,ITEM_COL20,ITEM_COL21,ITEM_COL22,ITEM_COL23,ITEM_COL24,ITEM_COL25,ITEM_COL26,ITEM_COL27,ITEM_COL28,ITEM_COL29,ITEM_COL30,ITEM_COL31,ITEM_COL32,ITEM_COL33,ITEM_COL34,ITEM_COL35,ITEM_COL36,ITEM_COL37,ITEM_COL38,ITEM_COL39,ITEM_COL40,ITEM_COL41,ITEM_COL42,ITEM_COL43,ITEM_COL44,ITEM_COL45,ITEM_COL46,ITEM_COL47,ITEM_COL48,ITEM_COL49,ITEM_COL50,ITEM_COL51,ITEM_COL52,ITEM_COL53,ITEM_COL54,ITEM_COL55,ITEM_COL56,ITEM_COL57,ITEM_COL58,ITEM_COL59,ITEM_COL60,ITEM_COL61,ITEM_COL62,ITEM_COL63,ITEM_COL64,ITEM_COL65,ITEM_COL66,ITEM_COL67,ITEM_COL68,ITEM_COL69,ITEM_COL70,ITEM_COL71,ITEM_COL72,ITEM_COL73,ITEM_COL74,ITEM_COL75,ITEM_COL76,ITEM_COL77,ITEM_COL78,ITEM_COL79,ITEM_COL80,ITEM_COL81,ITEM_COL82,ITEM_COL83,ITEM_COL84,ITEM_COL85,ITEM_COL86,ITEM_COL87,ITEM_COL88,ITEM_COL89,ITEM_COL90,ITEM_COL91,ITEM_COL92,ITEM_COL93,ITEM_COL94,ITEM_COL95,ITEM_COL96,ITEM_COL97,ITEM_COL98,ITEM_COL99,ITEM_COL100,ITEM_COL101,ITEM_COL102,ITEM_COL103,ITEM_COL104,ITEM_COL105,ITEM_COL106,ITEM_COL107,ITEM_COL108,ITEM_COL109,ITEM_COL110,ITEM_COL111,ITEM_COL112,ITEM_COL113,ITEM_COL114,ITEM_COL115,ITEM_COL116,ITEM_COL117,ITEM_COL118,ITEM_COL119,ITEM_COL120,ITEM_COL121,ITEM_COL122,ITEM_COL123,ITEM_COL124,ITEM_COL125,ITEM_COL126,ITEM_COL127,ITEM_COL128,ITEM_COL129,ITEM_COL130,ITEM_COL131,ITEM_COL132,ITEM_COL133,ITEM_COL134,ITEM_COL135,ITEM_COL136,ITEM_COL137,ITEM_COL138,ITEM_COL139,ITEM_COL140,ITEM_COL141,ITEM_COL142,ITEM_COL143,ITEM_COL144,ITEM_COL145,ITEM_COL146,ITEM_COL147,ITEM_COL148,ITEM_COL149,ITEM_COL150,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,SYSDATE,?,?,SYSDATE,?,?,0)";

	/** 承認小明細表の登録処理用のSQL */
	private String _insertMST_APPR_DETAIL_LIST = "INSERT INTO MST_APPR_DETAIL_LIST " 
			+ "( " 
				+ "APPR_ID, "
				+ "SEQ_NO, " 
				+ "TABLE_NAME, " 
				+ "ITEM_COL1, " 
				+ "ITEM_COL2, " 
				+ "ITEM_COL3, " 
				+ "ITEM_COL4, " 
				+ "ITEM_COL5, " 
				+ "ITEM_COL6, " 
				+ "ITEM_COL7, " 
				+ "ITEM_COL8, " 
				+ " ITEM_COL9, "  
				+ "ITEM_COL10, " 
				+ "ITEM_COL11, " 
				+ "ITEM_COL12, " 
				+ "ITEM_COL13, " 
				+ "ITEM_COL14, " 
				+ "ITEM_COL15, " 
				+ "ITEM_COL16, " 
				+ "ITEM_COL17, " 
				+ "ITEM_COL18, " 
				+ "ITEM_COL19, " 
				+ "ITEM_COL20, "
				+ "ITEM_COL21, "
				+ "ITEM_COL22, "
				+ "ITEM_COL23, "
				+ "ITEM_COL24, "
				+ "ITEM_COL25, "
				+ "ITEM_COL26, "
				+ "ITEM_COL27, "
				+ "ITEM_COL28, "
				+ "ITEM_COL29, "
				+ "ITEM_COL30, "
				+ "CREATED_DATE, " 
				+ "CREATED_BY, " 
				+ "CREATED_PRG_NM, " 
				+ "UPDATED_DATE, " 
				+ "UPDATED_BY, " 
				+ "UPDATED_PRG_NM, " 
				+ "MODIFY_COUNT " 
			+") " 
			+" VALUES " 
			+"( "  
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, "
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, "
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, "
				+ " ?, " 
				+ " ?, "
				+ " ?, " 
				+ " ?, " 
				+ " ?, "
				+ " ?, "
				+ " SYSDATE, " 
				+ " ?, " 
				+ " ?, " 
				+ " SYSDATE, " 
				+ " ?, " 
				+ " ?, " 
				+ " 0 " 
			+")";

	/** 承認関連依頼情報を登録用のSQL */
	private String _insertMST_APPR_CORREL= "INSERT INTO MST_APPR_CORREL " 
			+ "(" 
				+ " APPR_ID, " 
				+ " APP_DETAIL_NO, " 
				+ " INFO_COL, " 
				+ " DEL_FLG, "
				+ " CREATED_DATE, " 
				+ " CREATED_BY, "
				+ " CREATED_PRG_NM, " 
				+ " UPDATED_DATE, " 
				+ " UPDATED_BY, "
				+ " UPDATED_PRG_NM, " 
				+ " MODIFY_COUNT" 
			+ " ) "
			+ "VALUES "
			+ " ( " 
				+ " ?, " 
				+ " ?, " 
				+ " ?, " 
				+ " 0,"
				+ " SYSDATE, " 
				+ " ?, " 
				+ " ?, " 
				+ " SYSDATE, " 
				+ " ?, " 
				+ " ?, " 
				+ " 0" 
			+ " ) ";
	
	/** 承認依頼表の検索用のSQL */
	private String _selectMST_APPR = "SELECT " 
				+ " MST_APPR.PROC_TYP,"
				+ " MST_APPR.SCREEN_URL "
			+ " FROM " 
				+ " MST_APPR "
			+ "WHERE " 
				+ " MST_APPR.APPR_ID = ? ";

	/** 承認明細検索用のSQL */
	private String _selectMST_APPR_DETAIL = "SELECT "
			+ "A.APPR_ID,A.APPR_REMARKS,B.TABLE_NAME,"
			+ "B.ITEM_COL1,B.ITEM_COL2,B.ITEM_COL3,B.ITEM_COL4,B.ITEM_COL5,B.ITEM_COL6,B.ITEM_COL7,B.ITEM_COL8,B.ITEM_COL9,B.ITEM_COL10,"
			+ "B.ITEM_COL11,B.ITEM_COL12,B.ITEM_COL13,B.ITEM_COL14,B.ITEM_COL15,B.ITEM_COL16,B.ITEM_COL17,B.ITEM_COL18,B.ITEM_COL19,B.ITEM_COL20,"
			+ "B.ITEM_COL21,B.ITEM_COL22,B.ITEM_COL23,B.ITEM_COL24,B.ITEM_COL25,B.ITEM_COL26,B.ITEM_COL27,B.ITEM_COL28,B.ITEM_COL29,B.ITEM_COL30,"
			+ "B.ITEM_COL31,B.ITEM_COL32,B.ITEM_COL33,B.ITEM_COL34,B.ITEM_COL35,B.ITEM_COL36,B.ITEM_COL37,B.ITEM_COL38,B.ITEM_COL39,B.ITEM_COL40,"
			+ "B.ITEM_COL41,B.ITEM_COL42,B.ITEM_COL43,B.ITEM_COL44,B.ITEM_COL45,B.ITEM_COL46,B.ITEM_COL47,B.ITEM_COL48,B.ITEM_COL49,B.ITEM_COL50,"
			+ "B.ITEM_COL51,B.ITEM_COL52,B.ITEM_COL53,B.ITEM_COL54,B.ITEM_COL55,B.ITEM_COL56,B.ITEM_COL57,B.ITEM_COL58,B.ITEM_COL59,B.ITEM_COL60,"
			+ "B.ITEM_COL61,B.ITEM_COL62,B.ITEM_COL63,B.ITEM_COL64,B.ITEM_COL65,B.ITEM_COL66,B.ITEM_COL67,B.ITEM_COL68,B.ITEM_COL69,B.ITEM_COL70,"
			+ "B.ITEM_COL71,B.ITEM_COL72,B.ITEM_COL73,B.ITEM_COL74,B.ITEM_COL75,B.ITEM_COL76,B.ITEM_COL77,B.ITEM_COL78,B.ITEM_COL79,B.ITEM_COL80,"
			+ "B.ITEM_COL81,B.ITEM_COL82,B.ITEM_COL83,B.ITEM_COL84,B.ITEM_COL85,B.ITEM_COL86,B.ITEM_COL87,B.ITEM_COL88,B.ITEM_COL89,B.ITEM_COL90,"
			+ "B.ITEM_COL91,B.ITEM_COL92,B.ITEM_COL93,B.ITEM_COL94,B.ITEM_COL95,B.ITEM_COL96,B.ITEM_COL97,B.ITEM_COL98,B.ITEM_COL99,B.ITEM_COL100,"
			+ "B.ITEM_COL101,B.ITEM_COL102,B.ITEM_COL103,B.ITEM_COL104,B.ITEM_COL105,B.ITEM_COL106,B.ITEM_COL107,B.ITEM_COL108,B.ITEM_COL109,B.ITEM_COL110,"
			+ "B.ITEM_COL111,B.ITEM_COL112,B.ITEM_COL113,B.ITEM_COL114,B.ITEM_COL115,B.ITEM_COL116,B.ITEM_COL117,B.ITEM_COL118,B.ITEM_COL119,B.ITEM_COL120,"
			+ "B.ITEM_COL121,B.ITEM_COL122,B.ITEM_COL123,B.ITEM_COL124,B.ITEM_COL125,B.ITEM_COL126,B.ITEM_COL127,B.ITEM_COL128,B.ITEM_COL129,B.ITEM_COL130,"
			+ "B.ITEM_COL131,B.ITEM_COL132,B.ITEM_COL133,B.ITEM_COL134,B.ITEM_COL135,B.ITEM_COL136,B.ITEM_COL137,B.ITEM_COL138,B.ITEM_COL139,B.ITEM_COL140,"
			+ "B.ITEM_COL141,B.ITEM_COL142,B.ITEM_COL143,B.ITEM_COL144,B.ITEM_COL145,B.ITEM_COL146,B.ITEM_COL147,B.ITEM_COL148,B.ITEM_COL149,B.ITEM_COL150,"
			+ "B.CREATED_DATE,B.CREATED_BY,B.CREATED_PRG_NM,B.UPDATED_DATE,"
			+ "B.UPDATED_BY,B.UPDATED_PRG_NM,B.MODIFY_COUNT "
			+ "FROM MST_APPR A, MST_APPR_DETAIL B "
			+ "WHERE " 
				+ "B.APPR_ID = ? " 
				+ "AND A.APPR_ID = B.APPR_ID";

	/** 承認小明細検索用のSQL */
	private String _selectMST_APPR_DETAIL_LIST = "SELECT " 
				+ " APPR_ID, " 
				+ " TABLE_NAME, " 
				+ " ITEM_COL1, " 
				+ " ITEM_COL2, " 
				+ " ITEM_COL3, " 
				+ " ITEM_COL4, " 
				+ " ITEM_COL5, " 
				+ " ITEM_COL6, " 
				+ " ITEM_COL7, " 
				+ " ITEM_COL8, " 
				+ " ITEM_COL9, " 
				+ " ITEM_COL10, " 
				+ " ITEM_COL11, " 
				+ " ITEM_COL12, " 
				+ " ITEM_COL13, " 
				+ " ITEM_COL14, " 
				+ " ITEM_COL15, " 
				+ " ITEM_COL16, " 
				+ " ITEM_COL17, " 
				+ " ITEM_COL18, " 
				+ " ITEM_COL19, " 
				+ " ITEM_COL20, " 
				+ " ITEM_COL21, "
				+ " ITEM_COL22, "
				+ " ITEM_COL23, "
				+ " ITEM_COL24, "
				+ " ITEM_COL25, "
				+ " ITEM_COL26, "
				+ " ITEM_COL27, "
				+ " ITEM_COL28, "
				+ " ITEM_COL29, "
				+ " ITEM_COL30, "
				+ " CREATED_DATE, " 
				+ " CREATED_BY, " 
				+ " CREATED_PRG_NM, " 
				+ " UPDATED_DATE, " 
				+ " UPDATED_BY, " 
				+ " UPDATED_PRG_NM, " 
				+ " MODIFY_COUNT " 
			+ "FROM " 
				+ " MST_APPR_DETAIL_LIST " 
			+ "WHERE " 
				+ " MST_APPR_DETAIL_LIST.APPR_ID = ? ";
	
	/** 依頼データ検索用のSQL */
	private String _selectRequestData = "SELECT " 
				+ " A.SCREEN_URL, " 
				+ " D.SCREEN_NAME, " 
				+ " COUNT(DISTINCT A.APPR_ID)," 
				+ " COUNT(DISTINCT B.APPR_ID)," 
				+ " COUNT(DISTINCT C.APPR_ID) "
			+ "FROM " 
				+ " MST_APPR A,MST_APPR B,MST_APPR C,SCREEN_MST D "
			+ "WHERE " 
				+ " A.PLANT_CD = ? "
				+ " AND A.REQUEST_BY = ? "
				+ " AND (A.STATUS = 1 OR A.STATUS = 2) "
				+ " AND A.APPR_ID = B.APPR_ID(+) "
				+ " AND B.STATUS(+) = 1 "
				+ " AND A.APPR_ID = C.APPR_ID(+) "
				+ " AND C.STATUS(+) = 2 "
				+ " AND A.SCREEN_URL =D.SCREEN_URL "
			+ "GROUP BY " 
				+ "A.SCREEN_URL,D.SCREEN_NAME ";
	
	/** 承認待ちデータ検索用のSQL */
	private String _selectAppringData = "SELECT " 
				+ " B.SCREEN_URL, " 
				+ " B.SCREEN_NAME, " 
				+ " COUNT(DISTINCT C.APPR_ID), " 
				+ " COUNT(DISTINCT A.APPR_ID) " 
			+ "FROM " 
				+ "MST_APPR A,SCREEN_MST B,MST_APPR C " 
			+ "WHERE " 
				+ " A.PLANT_CD = ? " 
				+ " AND A.STATUS = 1 " 
				+ " AND A.SCREEN_URL = B.SCREEN_URL " 
				+ " AND B.BUSINESS_CD IN " 
				+ " (" 
					+ "SELECT " 
						+ "GROUP_PARM_BUSINESS_MST.BUSINESS_CD " 
					+ "FROM " 
						+ "USER_MST,GROUP_PARM_BUSINESS_MST,BELONG_MST " 
					+ "WHERE " 
						+ "USER_MST.USER_CD = ? " 
						+ "AND USER_MST.USER_CD = BELONG_MST.USER_CD " 
						+ "AND BELONG_MST.BUSINESS_GROUP_CD = GROUP_PARM_BUSINESS_MST.BUSINESS_GROUP_CD " 
				+ " ) " 
				+ " AND A.APPR_ID = C.APPR_ID(+) "
				+ " AND A.PLANT_CD = C.PLANT_CD(+) "
				+ " AND C.REQUEST_BY(+) = ? "
			+ "GROUP BY " 
				+ "A.SCREEN_URL,B.SCREEN_URL,B.SCREEN_NAME ";
	
	/** 保留データ検索用のSQL */
	private String _selectReserveData = "SELECT " 
				+ " B.SCREEN_URL, " 
				+ " B.SCREEN_NAME, " 
				+ " COUNT(DISTINCT C.APPR_ID), " 
				+ " COUNT(DISTINCT A.APPR_ID) " 
			+ "FROM " 
				+ " MST_APPR A,SCREEN_MST B,MST_APPR C " 
			+ "WHERE " 
				+ " A.PLANT_CD = ? " 
				+ " AND A.STATUS = 2 " 
				+ " AND A.SCREEN_URL = B.SCREEN_URL " 
				+ " AND B.BUSINESS_CD IN " 
					+ "(" 
						+ "SELECT " 
						+ " GROUP_PARM_BUSINESS_MST.BUSINESS_CD " 
						+ "FROM " 
							+ "USER_MST,GROUP_PARM_BUSINESS_MST,BELONG_MST " 
						+ "WHERE " 
							+ " USER_MST.USER_CD = ? " 
							+ " AND USER_MST.USER_CD = BELONG_MST.USER_CD " 
							+ " AND BELONG_MST.BUSINESS_GROUP_CD = GROUP_PARM_BUSINESS_MST.BUSINESS_GROUP_CD " 
					+ ") " 
				+ " AND A.APPR_ID = C.APPR_ID(+) "
				+ " AND A.PLANT_CD = C.PLANT_CD(+) "
				+ " AND C.REQUEST_BY(+) = ? "
			+ "GROUP BY " 
				+ " A.SCREEN_URL,B.SCREEN_URL,B.SCREEN_NAME ";
	
	/** 承認依頼表更新用のSQL　*/
	private String _updateMST_APPR = "UPDATE " 
				+ " MST_APPR " 
			+ "SET " 
				+ " MST_APPR.STATUS = ?, " 
				+ " MST_APPR.RESERVE_CAUSE = ?, " 
				+ " MST_APPR.APPR_BY = ?, " 
				+ " MST_APPR.APPR_DATE = ?, " 
				+ " MST_APPR.UPDATED_DATE = SYSDATE, " 
				+ " MST_APPR.UPDATED_BY = ?, " 
				+ " MST_APPR.UPDATED_PRG_NM = ?, " 
				+ " MST_APPR.MODIFY_COUNT = (MST_APPR.MODIFY_COUNT + 1) "
			+ "WHERE " 
				+ " MST_APPR.APPR_ID = ? ";
	
	/** 承認依頼表削除 */
	private String _deleteMST_APPR= "DELETE " 
			+ "FROM " 
				+ " MST_APPR "
			+ "WHERE " 
				+ " MST_APPR.APPR_ID = ? ";
	
	/** 承認明細削除 */
	private String _deleteMST_APPR_DETAIL ="DELETE " 
			+ "FROM " 
				+ " MST_APPR_DETAIL "
			+ "WHERE " 
				+ " MST_APPR_DETAIL.APPR_ID = ? ";
	
	/** 承認小明細削除 */
	private String _deleteMST_APPR_DETAIL_LIST ="DELETE " 
			+ " FROM " 
				+ " MST_APPR_DETAIL_LIST "
			+ "WHERE " 
				+ " MST_APPR_DETAIL_LIST.APPR_ID = ? ";
	/** 承認関連情報削除 */
	private String _deleteMST_APPR_CORREL ="DELETE " 
			+ "FROM " 
				+ " MST_APPR_CORREL "
			+ "WHERE " 
				+ " MST_APPR_CORREL.APPR_ID = ? ";
	/** マスタ表のコラム*/
	private String _selectColumns = "SELECT "
				+ " USER_TAB_COLUMNS.COLUMN_NAME, " 
				+ " USER_TAB_COLUMNS.COLUMN_ID, " 
				+ " USER_TAB_COLUMNS.DATA_TYPE "
			+ "FROM " 
				+ " USER_TAB_COLUMNS " 
			+ "WHERE " 
				+ " USER_TAB_COLUMNS.TABLE_NAME = ? "
			+ "ORDER BY USER_TAB_COLUMNS.COLUMN_ID ";
	/** マスタ表のキー*/
	private String _selectKeyColumns = "SELECT " 
				+ " USER_CONS_COLUMNS.COLUMN_NAME, " 
				+ " USER_TAB_COLUMNS.COLUMN_ID, " 
				+ " USER_TAB_COLUMNS.DATA_TYPE "
			+ " FROM " 
				+ "USER_CONS_COLUMNS,USER_TAB_COLUMNS "
			+ "WHERE " 
				+ " CONSTRAINT_NAME = " 
					+ " (SELECT " 
					+ " CONSTRAINT_NAME " 
					+ " FROM USER_CONSTRAINTS "   
					+ " WHERE " 
						+ "TABLE_NAME = ? "
						+ " AND CONSTRAINT_TYPE = 'P') "
				+ "AND USER_CONS_COLUMNS.TABLE_NAME = USER_TAB_COLUMNS.TABLE_NAME "
				+ "AND USER_CONS_COLUMNS.COLUMN_NAME = USER_TAB_COLUMNS.COLUMN_NAME "
				+ "ORDER BY USER_TAB_COLUMNS.COLUMN_ID";
	
	/** 承認キー対応表検索 */
	private String _selectMST_APPR_KEY = "SELECT " 
				+ " KEY_NAME,KEY_VALUE " 
			+ "FROM " 
				+ "MST_APPR_KEY "
			+ "WHERE " 
				+ " APPR_ID = ? ";
	
	/** 承認キー対応表登録 */
	private String _insertMST_APPR_KEY = "INSERT INTO MST_APPR_KEY " 
		+ "(" 
			+ " APPR_ID, " 
			+ " TABLE_NAME, " 
			+ " KEY_NAME, " 
			+ " KEY_VALUE, " 
			+ " CREATED_DATE, " 
			+ " CREATED_BY, " 
			+ " CREATED_PRG_NM , " 
			+ " UPDATED_DATE, " 
			+ " UPDATED_BY, " 
			+ " UPDATED_PRG_NM, " 
			+ " MODIFY_COUNT) "
		+ "VALUES " 
		+ "( " 
			+ " ?, " 
			+ " ?, " 
			+ " ?, " 
			+ " ?, " 
			+ " SYSDATE, " 
			+ " ?, " 
			+ " ?, " 
			+ " SYSDATE, " 
			+ " ?, " 
			+ " ?, " 
			+ " 0 " 
		+ ")";
	
	/** 承認キー対応表削除 */
	private String _deleteMST_APPR_KEY = "DELETE " 
		+ "FROM " 
			+ " MST_APPR_KEY " 
		+ "WHERE " 
			+ " APPR_ID = ? ";
}
