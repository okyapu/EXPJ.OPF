/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0040/src/com/nec/jp/orteus/metamorBase/AC0040/AC0040010Entity.java,v $
 *
 * Copyright (c) 2003-2005 NEC Corporation.
 * Copyright (c) 2003-2005 NEC Informatec Systems,Ltd.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
 *
 * テンプレート履歴：
 * EXPJ    (2005/01/19),SRCGEN対応
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 * EXPJ    (2004/03/02),EXPLANNER/J用に改造（ソースヘッダ・クラスヘッダ変更）
 * 3.0.5.1 (2004/12/21),MySQLとPostgresqlの対応
 * 3.0.5.0 (2004/12/06),mv_dbms/mv_dbms_dynamic_sql/mv_std_dbms パターンのバグを修正
 * 3.0.4.3 (2004/09/30),エンティティタイプcsvの際、不要なインナークラスを作成するバグの解消
 * 3.0.4.2 (2004/09/29),エンティティタイプパターンcsvの際、ソース生成ができないバグの解消
 * 3.0.4.1 (2004/08/31),前パージョンカスタマイズ時に追加した不要なエンティティタイプパターンの削除
 * 3.0.4.0 (2004/08/20),TRUST-Vプロジェクトフィードバック（エンティティタイプパターンのバグ）
 * 3.0.3.0 (2004/08/04),TRUST-Vプロジェクトフィードバック（ソート条件変更）
 * 3.0.2.6 (2004/06/29),select_MAX_countの取得時のcontainerの取得方法の修正
 * 3.0.2.5 (2004/05/28),ダウンロードを連続実行するとFileNotFoundExceptionが発生するバグの修正
 * 3.0.2.4 (2004/04/16),動的SQL対応をInsert/Update/Delete時にも追加
 * 3.0.2.3 (2004/03/05),ei_Sysdate::read(Connection conn)内で生成したStatementを利用するように修正
 * 3.0.2.2 (2003/12/25),DB2現在時刻を取得するSQLを修正
 * 3.0.2.1 (2003/10/28),callメソッド利用時の引数設定方法をDataObjectのメソッドに変更
 * 3.0.2.0 (2003/08/04),全てのEntity Typeにcheckメソッドの追加
 * 3.0.1.1 (2003/07/04),checkメソッド利用時のエラー修正
 * 3.0.1.0 (2003/06/05),javadocコメントエラー修正,Stored Procedure対応追加
 * 3.0.0.0 (2003/04/23),クラス名標準化対応
 * 2.1.3.0 (2003/03/31),SQLParser対応,バグ修正
 * 2.1.2.0 (2003/03/12),OrteusStudio/PDConnector対応(更新系Entity設定データリポジトリ修正）
 * 2.1.1.0 (2003/01/22),OrteusStudio/PDConnector対応(取得データ型プロパティ修正)
 * 2.1.0.0 (2002/12/17),doRecordsetの廃止。ResultSetへ修正,Logging package修正
 * 2.0.1.0 (2002/10/15),DB2対応
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AC0040;

import com.nec.jp.orteus.util.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;
import com.nec.jp.orteus.xaf.wa.sqlparser.*;
import com.nec.jp.orteus.xaf.eo.*;

import com.nec.jp.orteus.util.logging.*;

import java.util.Date;
import java.util.*;
import java.sql.*;

import com.nec.jp.orteus.expj.exception.*;

//{{user_implement_code_import
 // TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0040010Entity extends DataObject
{

	//////////////////////////////

	//{{user_implement_dev:fixed_number
       
        // SQL文が未定義の場合
        final static int ERROR_SQLNOTDEFINE = 999999;
       
        //}}user_implement_dev:fixed_number

	//////////////////////////////
	// システム日付取得Entity
	public ei_Sysdate mei_Sysdate = new ei_Sysdate();

	// CSV出力Entity
	public ei_CSVOut mei_CSVOut = new ei_CSVOut();

	// selectSYS_DATE_CTRLクラス インスタンス
	public selectSYS_DATE_CTRL mselectSYS_DATE_CTRL = new selectSYS_DATE_CTRL();

	// selectT_ODクラス インスタンス
	public selectT_OD mselectT_OD = new selectT_OD();


	//////////////////////////////

	// システム日付の変数設定
	public String sSysdate = "";

	/**
	 * システム日付取得処理
	 */
	public class ei_Sysdate extends DataObject
	{

		//////////////////////////////

		//{{user_implement_dev:ei_Sysdate_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ei_Sysdate_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public String read(IDbConnection conn) throws FoundationException, SQLException
		{
			return read(conn.getConn());
		}

		/**
		 * データ読出し処理
		 *
		 * @return システム日時を返します
		 * @param conn Native Connectionクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public String read(Connection conn) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			String query=null;

			if(m_selcmd==null) throw new FoundationException("ei_Sysdate", "read", "クエリー未登録");

			if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd));
			} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_MSSQL));
			} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_PGS));
			} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_MySQL));
			} else {
				stmt=prepare(conn, (query=m_selcmd_DB2));
			}

			ResultSet rs=executeQuery(stmt);

			try {
				return next(rs);
			} finally {
				stmt.close();
				stmt = null;
			}
			//{{user_implement_dev:ei_Sysdate_read
                         // TODO: ここにユーザ処理を記述してください
                        //}}user_implement_dev:ei_Sysdate_read
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query) throws FoundationException, SQLException
		{
			PreparedStatement stmt;

			stmt = conn.prepareStatement(query);

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public String next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			sSysdate = getString(1, rs);

			return sSysdate;
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:ei_Sysdate_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ei_Sysdate_clear

			return;
		}

		//////////////////////////////

		/**
		 * ei_Sysdateクラスの標準コンストラクタ
		 */
		public ei_Sysdate()
		{
			//{{user_implement_dev:ei_Sysdate_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ei_Sysdate_constractor

			return;
		}

		//////////////////////////////

		// 各状態で実行するsql文の定義
		protected String m_selcmd = "select to_char(sysdate,'YYYY/MM/DD HH24:MI:SS') from dual "
+"";
		protected String m_selcmd_MSSQL = "select convert(varchar(19),getdate(),111)+' '+convert(varchar(19),getdate(),114)"
+"";
		protected String m_selcmd_PGS = "select TO_CHAR(SYSDATE(),'YYYY/MM/DD HH24:MI:SS') "
+"";
		protected String m_selcmd_MySQL = "select date_format(sysdate(), '%Y-%m-%d %H:%i:%s') "
+"";
		protected String m_selcmd_DB2 = "select TO_CHAR(SYSDATE(),'YYYY/MM/DD HH24:MI:SS') from SYSIBM.SYSDUMMY1 "
+"";		//////////////////////////////

	}

	//////////////////////////////

	/**
	 * CSV出力デフォルトクラス
	 */
	public class ei_CSVOut extends DataObject
	{

		//////////////////////////////

		//{{user_implement_dev:ei_CSVOut_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ei_CSVOut_def

		/**
		 * データ書込み処理
		 *
		 * @param list テーブル列項目リストインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public void create(List list, String sTitle[]) throws FoundationException
		{
			String sColums[] = null;
			String sbuff[] = null;
			int nMax_length = 0;
			int nlength = 0;

			if(m_write_fname==null || m_write_fname.length()==0) throw new FoundationException("ei_CSVOut", "create", "ファイル情報未登録");

			try {
				if (m_writer == null) {
					m_writer = new WriteCsv();
				}
				m_writer.open(m_write_path, m_write_fname);

				// タイトルの設定
				if(sTitle != null) {
					m_writer.beginIns();
					for(int w=0, cw=sTitle.length; w<cw; w++) {
						m_writer.addCell( sTitle[w] );
					}
					m_writer.endIns();
				}

				if((list == null) || (list.size() == 0)) return;

				// データの設定
				for(int z=0, cz=list.size(); z<cz; z++) {
					sbuff = (String[])list.get(z);
					if(sbuff == null) continue;
					nlength = sbuff.length;
					if(nlength > nMax_length) {
						nMax_length = nlength;
					}
				}

				for(int y=0, cy=nMax_length; y<cy; y++) {
					m_writer.beginIns();
					for(int x=0, cx=list.size(); x<cx; x++) {
						sColums = (String[])list.get(x);
						m_writer.addCell( sColums[y] );
					}
					m_writer.endIns();
				}
			} catch(FoundationException e) {
				return;
			} finally {
				if (m_writer != null) {
					m_writer.close();
					m_writer = null;
				}
			}

			return;
		}

		//////////////////////////////

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:ei_CSVOut_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ei_CSVOut_clear

			return;
		}

		//////////////////////////////

		/**
		 * ei_CSVOutクラスの標準コンストラクタ
		 */
		public ei_CSVOut()
		{
			//{{user_implement_dev:ei_CSVOut_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ei_CSVOut_constractor

			return;
		}

		//////////////////////////////

		// csv用の変数
		String m_write_path="D:/Orteus/csv/";
		String m_write_fname="AC0040010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AC0040010";

		/**
		 * CSVファイル名setter/getterメソッド
		 */
		public void setPath(String spath) {m_write_path = spath;}
		public String getPath() {return m_write_path;}
		public void setFname(String sfilename) {m_write_fname = sfilename;}
		public String getFname() {return m_write_fname;}

		//////////////////////////////

	}

	//////////////////////////////
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "select to_char(BUSINESS_OPR_DATE,'yyyy/mm/dd') "
+"from SYS_DATE_CTRL "
+"where  "
+" PLANT_CD = rtrim(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_DATE_CTRL_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectSYS_DATE_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read
                        if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0040010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AC0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getuser_PLANT_CD());
				if(isNull(data.getuser_PLANT_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectSYS_DATE_CTRL", "prepare", "Parse失敗:"+e.toString());
			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AC0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getuser_PLANT_CD())) setString(no ++, data.getuser_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0040010Struct data = new AC0040010Struct();

			data.setBUSINESS_OPR_DATE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectSYS_DATE_CTRL", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_DATE_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0040010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectSYS_DATE_CTRL_clear

			return;
		}

		/**
		 * selectSYS_DATE_CTRLクラスの標準コンストラクタ
		 */
		public selectSYS_DATE_CTRL()
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectSYS_DATE_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_OD extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_PUCH_PRDCT_REP.\"OD_NO\" as \"OD_NO\", "
+"  V_PUCH_PRDCT_REP.\"PLANT_CD\" as \"PLANT_CD\", "
+"  V_PUCH_PRDCT_REP.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"JOB_ODR_DETAIL_NO\") as \"JOB_ODR_DETAIL_NO\", "
+"  V_PUCH_PRDCT_REP.\"ITEM_CD\" as \"ITEM_CD\", "
+"  V_PUCH_PRDCT_REP.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  V_PUCH_PRDCT_REP.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  V_PUCH_PRDCT_REP.\"VEND_CD\" as \"VEND_CD\", "
+"  V_PUCH_PRDCT_REP.\"VEND_NAME\" as \"VEND_NAME\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"ODR_STS_TYP\") as \"ODR_STS_TYP\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"ODR_START_DATE\", 'YYYY/MM/DD') as \"ODR_START_DATE\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"PRD_DUE_DATE\", 'YYYY/MM/DD') as \"PRD_DUE_DATE\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"PRD_START_DATE\", 'YYYY/MM/DD') as \"PRD_START_DATE\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"OD_TYP\") as \"OD_TYP\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"ODR_QTY\") as \"ODR_QTY\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"OUTSIDE_TYP\") as \"OUTSIDE_TYP\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"TOTAL_RCV_QTY\") as \"TOTAL_RCV_QTY\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"PUCH_ODR_QTY\") as \"PUCH_ODR_QTY\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"UNIT_COST\") as \"UNIT_COST\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"UNIT_COST_TYP\") as \"UNIT_COST_TYP\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"ROUND_TYP\") as \"ROUND_TYP\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"PUCH_ODR_AMOUNT\") as \"PUCH_ODR_AMOUNT\" "
+"from "
+"  V_PUCH_PRDCT_REP "
+"where "
+"  V_PUCH_PRDCT_REP.\"VEND_CD\" like ? "
+"  and V_PUCH_PRDCT_REP.\"JOB_ODR_CD\" like ? "
+"  and TO_CHAR(V_PUCH_PRDCT_REP.\"ODR_STS_TYP\") = ? "
+"  and V_PUCH_PRDCT_REP.\"PLANT_CD\" = trim(?) "
+"  and TO_CHAR(V_PUCH_PRDCT_REP.\"ODR_START_DATE\", 'YYYY/MM/DD') <= ? "
+"  and TO_CHAR(V_PUCH_PRDCT_REP.\"PRD_DUE_DATE\", 'YYYY/MM/DD') <= ? "
+"  and TO_CHAR(V_PUCH_PRDCT_REP.\"PRD_START_DATE\", 'YYYY/MM/DD') <= ? "
+"order by "
+"  V_PUCH_PRDCT_REP.\"VEND_CD\", "
+"  V_PUCH_PRDCT_REP.\"ITEM_CD\", "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"PRD_START_DATE\", 'YYYY/MM/DD'), "
+"  TO_CHAR(V_PUCH_PRDCT_REP.\"PRD_DUE_DATE\", 'YYYY/MM/DD') "
+"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_OD_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_OD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_OD_read
                        if(m_selcmd==null) throw new FoundationException("selectT_OD", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectT_OD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_OD_read2
			if(m_selcmd==null) throw new FoundationException("selectT_OD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_OD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_OD_read3
			if(m_selcmd==null) throw new FoundationException("selectT_OD", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_OD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0040010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AC0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getk_VEND_CD());
				if(isNull(data.getk_VEND_CD())) isNull = true;
				ary.addElement(data.getk_JOB_ODR_CD());
				if(isNull(data.getk_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getk_ODR_STS_TYP());
				if(isNull(data.getk_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getk_PLANT_CD());
				if(isNull(data.getk_PLANT_CD())) isNull = true;
				ary.addElement(data.getk_ODR_START_DATE());
				if(isNull(data.getk_ODR_START_DATE())) isNull = true;
				ary.addElement(data.getk_PRD_DUE_DATE());
				if(isNull(data.getk_PRD_DUE_DATE())) isNull = true;
				ary.addElement(data.getk_PRD_START_DATE());
				if(isNull(data.getk_PRD_START_DATE())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_OD", "prepare", "Parse失敗:"+e.toString());
			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AC0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getk_VEND_CD())) setString(no ++, data.getk_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getk_JOB_ODR_CD())) setString(no ++, data.getk_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getk_ODR_STS_TYP())) setString(no ++, data.getk_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getk_PLANT_CD())) setString(no ++, data.getk_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getk_ODR_START_DATE())) setString(no ++, data.getk_ODR_START_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getk_PRD_DUE_DATE())) setString(no ++, data.getk_PRD_DUE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getk_PRD_START_DATE())) setString(no ++, data.getk_PRD_START_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0040010Struct data = new AC0040010Struct();

			data.sets_OD_NO( getString(1, rs) );
			data.sets_PLANT_CD( getString(2, rs) );
			data.sets_JOB_ODR_CD( getString(3, rs) );
			data.sets_JOB_ODR_DETAIL_NO( getString(4, rs) );
			data.sets_ITEM_CD( getString(5, rs) );
			data.sets_ITEM_NAME( getString(6, rs) );
			data.sets_COMPANY_CD( getString(7, rs) );
			data.sets_VEND_CD( getString(8, rs) );
			data.sets_VEND_NAME( getString(9, rs) );
			data.sets_ODR_STS_TYP( getString(10, rs) );
			data.sets_ODR_START_DATE( getString(11, rs) );
			data.sets_PRD_DUE_DATE( getString(12, rs) );
			data.sets_PRD_START_DATE( getString(13, rs) );
			data.sets_OD_TYP( getString(14, rs) );
			data.sets_ODR_QTY( getString(15, rs) );
			data.sets_OUTSIDE_TYP( getString(16, rs) );
			data.sets_TOTAL_RCV_QTY( getString(17, rs) );
			data.sets_PUCH_ODR_QTY( getString(18, rs) );
			data.sets_UNIT_COST( getString(19, rs) );
			data.sets_UNIT_COST_TYP( getString(20, rs) );
			data.sets_ROUND_TYP( getString(21, rs) );
			data.sets_PUCH_ODR_AMOUNT( getString(22, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_OD", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(Connection conn, AC0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_OD_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectT_OD", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectT_OD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0040010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:selectT_OD_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_OD_clear

			return;
		}

		/**
		 * selectT_ODクラスの標準コンストラクタ
		 */
		public selectT_OD()
		{
			//{{user_implement_dev:selectT_OD_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_OD_constractor

			return;
		}
	}

	// null文字列、空白文字列の場合にtrueを返します
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * クリーンナップ用メソッド
	 *
	 */
	public void clear()
	{
		mselectSYS_DATE_CTRL.clear();
		mselectSYS_DATE_CTRL = null;
		mselectT_OD.clear();
		mselectT_OD = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AC0040010クラスの標準コンストラクタ
	 */
	public AC0040010Entity() throws FoundationException
	{
		//{{user_implement_dev:constractor
                 // TODO: ここに初期処理を記述してください
                //}}user_implement_dev:constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 */
	protected void finalize()
	{
		//{{user_implement_dev:entity_destractor
                 // TODO: インスタンス消滅時に実行する処理を記述してください
                //}}user_implement_dev:entity_destractor

		objMessage = null;
		clear();

		return;
	}
}
