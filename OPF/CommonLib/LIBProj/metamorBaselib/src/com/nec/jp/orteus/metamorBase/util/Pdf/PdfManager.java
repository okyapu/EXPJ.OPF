//------------------------------------------------------------------------------
// (#)PdfManager.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/26 新規作成 Y.Inada
// 2003/09/01 Y.Inada
//			  PDFファイル保持期間のチェック処理修正 
//			  PDFファイル情報取得時、コネクションのNULLチェック追加
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Pdf;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.metamorBase.util.common.FileNaming;
import com.nec.jp.orteus.metamorBase.util.common.FileCleaner;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;

import java.util.ResourceBundle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.io.File;

//------------------------------------------------------------------------------

/**
 * PDF管理。
 * PDFファイルを命名し、確定する。<BR>
 * PDFファイル情報のDB検索、登録、削除を行う。
 *
 * @author	Y.Inada
 * @version 1.00
*/
public class PdfManager
{
	/**
	  * PDF管理の構築。
	*/
	public PdfManager()
	{
		_fileNaming = new FileNaming();
		_applicationNo = null;
		_user = null;
	}

	/**
	  * ディレクトリ取得。
	  * @return ディレクトリ
	*/
	public String getPdfDirectory()
	{
		return _fileNaming.getNamingDirectory();
	}

	/**
	  * ファイル名取得。
	  * @return ファイル名
	*/
	public String getPdfFile()
	{
		return _fileNaming.getNamingName();
	}

	/**
	  * 命名時刻取得。
	  * @return 命名時刻:yyyyMMddHHmmss
	*/
	public String getPdfTime()
	{
		return _fileNaming.getNamingTime();
	}


	/**
	  * 確定。
	  * @param applicationNo アプリケーション番号
	  * @param user ユーザ
	  * @return true:成功 / false:失敗
	*/
	public boolean naming(String target, String applicationNo, String user)
	{
		// 初期化
		_fileNaming = new FileNaming();

		// 未設定判定
		if(target == null || applicationNo == null || user == null){
			return false;		// 未設定のため、結果異常
		}
		else{
			_applicationNo = applicationNo;
			_user = user;
		}

		// PDFディレクトリ取得(システム定義)
		ResourceBundle bundle = SystemConfig.getBundle();
		String pdfdirectory = SystemConfig.getProperty("PDFディレクトリ", bundle);
		if(pdfdirectory == null){
			return false;		// PDFディレクトリ取得失敗
		}

		// PDFファイル名を確定
		_fileNaming.setTarget(target);
		_fileNaming.setApplicationNo(_applicationNo);
		_fileNaming.setUser(_user);
		_fileNaming.setExtension("pdf");
		_fileNaming.setDirectory(pdfdirectory);
		String pdfFileName = _fileNaming.naming();
		if(pdfFileName == null){
			return false;		// ファイル命名に失敗
		}

		return true;
	}

	/**
	  * 登録。
	  * @param connect コネクション
	  * @param comment1 コメント1
	  * @param comment2 コメント2
	  * @param comment3 コメント3
	  * @return true:成功 / false:失敗
	*/
	public boolean entry(IDbConnection connect, 
							String comment1, 
							String comment2, 
							String comment3) throws SQLException
	{
		// 未設定判定
		if(connect == null || _user == null || _applicationNo == null || 
				getPdfFile() == null || getPdfTime() == null)
			return false;		// 未設定のため、結果異常

		// 時刻変換
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		Date d_date = null;
		try{
			d_date = formatter.parse(getPdfTime());
		}catch(ParseException ex){
			return false;		// 時刻変換失敗
		}

		PreparedStatement stmt = null;			// ステートメント
		try{
			// SQL作成
			stmt = connect.getConn().prepareStatement(_entrySql);

			stmt.setString(1, _user);
			stmt.setString(2, _applicationNo);
			stmt.setString(3, comment1);
			stmt.setString(4, comment2);
			stmt.setString(5, comment3);
			stmt.setString(6, getPdfFile());
			stmt.setTimestamp(7, new java.sql.Timestamp(d_date.getTime()));
			stmt.setString(8, "pdf");
			stmt.setString(9, _user);
			stmt.setString(10, _user);

			// SQL実行
			stmt.executeUpdate();

		}finally{
			if(stmt != null){
				try {
					stmt.close();
				}catch(SQLException e){}
			}
		}
		return true;
	}

	/**
	  * 削除。
	  * @param connect コネクション
	  * @return true:成功 / false:失敗
	*/
	public boolean clean(IDbConnection connect) throws SQLException
	{
		// 未設定判定
		if(connect == null)
			return false;		// 未設定のため、結果異常

		// 印刷ファイル保持期間取得
		Integer period =
			SystemConfig.getPropertyNumber("PDFファイル保持期間(日)", SystemConfig.getBundle());
		if(period == null) return false;

		// 範囲チェック
		if(period.intValue() < 1) return false;

		// 対象日付を作成
		Date target = new Date(System.currentTimeMillis());
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(target);
		calendar.add(Calendar.DATE, (0 - period.intValue()));

		// PDFファイル情報をDBから削除
		PreparedStatement stmt = null;			// ステートメント
		try{
			// 削除用のSQL作成
			stmt = (connect.getConn()).prepareStatement(_cleanSql);
			stmt.setTimestamp(1, new java.sql.Timestamp(calendar.getTime().getTime()));

			// SQL実行
			stmt.executeUpdate();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}

		// PDFファイル削除
		PdfCleaning pdfClean = new PdfCleaning();
		if(pdfClean.clear() == true)
			return true;
		else
			return false;
	}


	/**
	  * 取得。
	  * @param connect コネクション
	  * @param applicationNo アプリケーション番号
	  * @param user ユーザコード
	  * @param fromDate 日付(FROM)
	  * @param toDate 日付(TO)
	  * @param comment1 コメント1
	  * @param comment2 コメント2
	  * @param comment3 コメント3
	  * @return true:成功 / false:失敗
	*/
	public List get(IDbConnection connect, 
					String applicationNo,
					String user,
					Date fromDate,
					Date toDate,
					String comment1,
					String comment2,
					String comment3) throws SQLException
	{
		List infoList = new ArrayList(0);

		// 未設定判定
		if(connect == null)
			return infoList;		// 未設定のため、結果異常

		// PDFディレクトリ取得(システム定義)
		ResourceBundle bundle = SystemConfig.getBundle();
		String pdfdirectory = SystemConfig.getProperty("PDFディレクトリ", bundle);
		if(pdfdirectory == null)
			return infoList;		// PDFディレクトリ取得失敗

		// 検索用SQL作成
		String getSql = makeGetSql(applicationNo, user, fromDate, toDate,
									comment1, comment2, comment3);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try{
			// SQL実行
			stmt = (connect.getConn()).prepareStatement(getSql);
			rset = stmt.executeQuery();
	
			// 結果を取得
			while(rset.next()){

				// ファイルの存在した場合
				File file = new File(pdfdirectory + "/" + rset.getString(6));
				if(file.isFile() == true){
					PdfInfomation info = new PdfInfomation();
					info.setUser(rset.getString(1));
					info.setApplicationNo(rset.getString(2));
					info.setComment1(rset.getString(3));
					info.setComment2(rset.getString(4));
					info.setComment3(rset.getString(5));
					info.setFileName(rset.getString(6));
					info.setFileDate(rset.getString(7));
					info.setSuffix(rset.getString(8));
					infoList.add(info);
				}
			}

			return infoList;

		}finally{
			if(rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}


	/**
	  * 検索用SQL作成。
	  * @param applicationNo アプリケーション番号
	  * @param user ユーザコード
	  * @param fromDate 日付(FROM)
	  * @param toDate 日付(TO)
	  * @param comment1 コメント1
	  * @param comment2 コメント2
	  * @param comment3 コメント3
	  * @return SQL文字列
	*/
	private String makeGetSql(String applicationNo,
									String user,
									Date fromDate,
									Date toDate,
									String comment1,
									String comment2,
									String comment3)
	{
		// 時刻変換
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

		// SQL文字列作成
		String s_appNo = "";
		String s_user = "";
		String s_fromDate = "";
		String s_toDate = "";
		String s_comment1 = "";
		String s_comment2 = "";
		String s_comment3 = "";
		String s_where = "";
		String s_selectSql = "";

		// 検索条件作成
		if(applicationNo != null){
			s_appNo = "APPLICATION_NO = '" + applicationNo + "' ";
			s_where = s_where + s_appNo;
		}
		if(user != null){
			s_user = "USER_CD = '" + user + "' ";
			if(s_where.equals("") == true)
				s_where = s_where + s_user;
			else
				s_where = s_where + " and " + s_user;
		}
		if(fromDate != null){
			s_fromDate = "FILE_CREATED_DATE >= TO_DATE('" + formatter.format(fromDate) + "') ";
			if(s_where.equals("") == true)
				s_where = s_where + s_fromDate;
			else
				s_where = s_where + " and " + s_fromDate;
		}
		if(toDate != null){
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(toDate);
			calendar.add(Calendar.DATE, 1);
			Date d_date = new Date(calendar.getTime().getTime());

			s_toDate = "FILE_CREATED_DATE < TO_DATE('" + formatter.format(d_date) + "') ";
			if(s_where.equals("") == true)
				s_where = s_where + s_toDate;
			else
				s_where = s_where + " and " + s_toDate;
		}
		if(comment1 != null){
			s_comment1 = "FILE_COMMENT1 = '" + comment1 + "' ";
			if(s_where.equals("") == true)
				s_where = s_where + s_comment1;
			else
				s_where = s_where + " and " + s_comment1;
		}
		if(comment2 != null){
			s_comment2 = "FILE_COMMENT2 = '" + comment2 + "' ";
			if(s_where.equals("") == true)
				s_where = s_where + s_comment2;
			else
				s_where = s_where + " and " + s_comment2;
		}
		if(comment3 != null){
			s_comment3 = "FILE_COMMENT3 = '" + comment3 + "' ";
			if(s_where.equals("") == true)
				s_where = s_where + s_comment3;
			else
				s_where = s_where + " and " + s_comment3;
		}

		if(s_where.equals("") == true)
			s_selectSql = _getSql + _getSqlOrder;							// 検索条件無
		else
			s_selectSql = _getSql + "where " + s_where + _getSqlOrder;		// 検索条件有

		return s_selectSql;
	}

	/** ファイル命名 */
	private FileNaming _fileNaming = null;

	/** アプリケーション番号 */
	private String _applicationNo = null;

	/** ユーザ */
	private String _user = null;

	/** ファイル情報登録SQL */
	private final static String _entrySql =
			"insert into SYS_FILE_INFORMATION " +
			"(USER_CD," +
			" APPLICATION_NO," +
			" FILE_COMMENT1," +
			" FILE_COMMENT2," +
			" FILE_COMMENT3," +
			" FILE_NAME," +
			" FILE_CREATED_DATE," +
			" FILE_SUFFIX," +
			" CREATED_DATE," +
			" CREATED_BY," +
			" CREATED_PRG_NM," +
			" UPDATED_DATE," +
			" UPDATED_BY," +
			" UPDATED_PRG_NM) " +
			"values" +
			"(?, ?, ?, ?, ?, ?, ?, ?," +
			" sysdate, ?, 'PDFManager', sysdate, ?, 'PDFManager')";

	/** ファイル情報削除SQL */
	private final static String _cleanSql =
			"delete from SYS_FILE_INFORMATION " +
			"where " +
			"FILE_CREATED_DATE < ?";

	/** ファイル情報取得SQL */
	private final static String _getSql =
			"select " +
				" USER_CD," +
				" APPLICATION_NO," +
				" FILE_COMMENT1," +
				" FILE_COMMENT2," +
				" FILE_COMMENT3," +
				" FILE_NAME," +
				" TO_CHAR(FILE_CREATED_DATE, 'YYYY/MM/DD HH24:MI:SS')," +
				" FILE_SUFFIX " +
			"from " +
				"SYS_FILE_INFORMATION ";

	/** ファイル情報取得SQL 検索順序 */
	private final static String _getSqlOrder =
			"order by " +
				" FILE_CREATED_DATE ASC," + 
				" FILE_NAME ASC";

}
