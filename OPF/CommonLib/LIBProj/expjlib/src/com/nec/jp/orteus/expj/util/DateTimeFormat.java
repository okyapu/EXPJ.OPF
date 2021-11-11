/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/DateTimeFormat.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.sql.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 日付書式
 * 年月日と時刻をわけます
 *
*/

public class DateTimeFormat {
	
	/** DBアクセス用のコネクション */
	private IDbConnection conn = null;
	
	/** 時刻管理フラグ */
	private String TimeCtrlFlg;
	
	/** 戻り値 年月日、時刻 */
	private String sepaDate;
	private String sepaTime;
	private String sepaCoronTime;
	
	
	private static final String selectTimeCtrlSql
			= "SELECT "
			+ "  SYS_PARAMETER.VALUE AS VALUE "
			+ "FROM "
			+ "  SYS_PARAMETER "
			+ "WHERE "
			+ "  SYS_PARAMETER.NAME = 'TIME_CTRL' ";

	/**
	 * コンストラクタ
	 * @param connect コネクションがOPENされているIDbConnection
	 */
	public DateTimeFormat(IDbConnection connect) throws SQLException {
		try {
			this.conn = connect;
			setTimeCtrl(getTimeCtrl());
		} catch (SQLException ex) {
			throw ex;
		} finally {
		}

	}
	
	/**
	 * TimeCtrlを取得。
	*/
	public String getTimeCtrl() throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			// SQL作成
			ps = this.conn.getConn().prepareStatement(selectTimeCtrlSql);
			// SQL実行
			rs = ps.executeQuery();

			String TimeFlg = "false";

			// 結果を設定
			if (rs.next()) {
				// データを取得
				TimeFlg = rs.getString("VALUE");
			}
			return TimeFlg;
			
		} catch (SQLException ex) {
			throw ex;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}
	
	/**
	 * TimeCtrlを設定。
	*/
	public void setTimeCtrl(String flg) {
		
		this.TimeCtrlFlg = flg;
		
	}
	
	
	/**
	 * 年月日と時刻をわける。
	 * 引数の形式str：YYYY/MM/DD HH24:MI
	*/
	public void format(String str){
		
		//初期化
		sepaDate = "";
		sepaTime = "";
		sepaCoronTime = "";
		
		if(str != null){
			//形式YYYY/MM/DD HH24:MIの場合
			if(str.length() == 16){
				
				if((this.TimeCtrlFlg).equals("true")){
					
					sepaDate = str.substring(0,10);
					sepaTime = str.substring(11,13) + str.substring(14,16);
					sepaCoronTime = str.substring(11,16);
					
				}else{
					
					sepaDate = str.substring(0,10);
					sepaTime = "";
					sepaCoronTime = "";
					
				}
				
			//形式YYYY/MM/DDの場合
			}else if(str.length() == 10){
				
				sepaDate = str;
				sepaTime = "";
				sepaCoronTime = "";
				
			}else{
				
				sepaDate = "";
				sepaTime = "";
				sepaCoronTime = "";
				
			}
		}
	}
	
	/**
	 * 年月日を返す。
	 * 引数の形式str：YYYY/MM/DD HH24:MI
	*/
	public String getDatePart(String str) {
		
		this.format(str);
		return sepaDate;
		
	}
	
	/**
	 * 時刻を返す。
	 * 引数の形式str：YYYY/MM/DD HH24:MI
	*/
	public String getTimePart(String str) {
		
		this.format(str);
		return sepaTime;
		
	}
	
	/**
	 * 時刻を返す。コロンつき
	 * 引数の形式str：YYYY/MM/DD HH24:MI
	*/
	public String getCoronTimePart(String str) {
		
		this.format(str);
		return sepaCoronTime;
		
	}
}
