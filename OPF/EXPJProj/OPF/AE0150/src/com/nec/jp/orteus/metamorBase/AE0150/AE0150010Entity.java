/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0150/src/com/nec/jp/orteus/metamorBase/AE0150/AE0150010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0150;

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
/**
 * CLASS     : AE0150010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AE0150010Entity extends DataObject
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

	// SYS_INSTALL_OPTIONSクラス インスタンス
	public SYS_INSTALL_OPTIONS mSYS_INSTALL_OPTIONS = new SYS_INSTALL_OPTIONS();

	// selectT_INSPC_ACPT_IFクラス インスタンス
	public selectT_INSPC_ACPT_IF mselectT_INSPC_ACPT_IF = new selectT_INSPC_ACPT_IF();

	// selectM_VEND_CTRLクラス インスタンス
	public selectM_VEND_CTRL mselectM_VEND_CTRL = new selectM_VEND_CTRL();

	// selectT_INSPC_ACPT_IF_modifyクラス インスタンス
	public selectT_INSPC_ACPT_IF_modify mselectT_INSPC_ACPT_IF_modify = new selectT_INSPC_ACPT_IF_modify();

	// updateT_INSPC_ACPT_IFクラス インスタンス
	public updateT_INSPC_ACPT_IF mupdateT_INSPC_ACPT_IF = new updateT_INSPC_ACPT_IF();

	// selectUSER_MSTクラス インスタンス
	public selectUSER_MST mselectUSER_MST = new selectUSER_MST();

	// selectT_INSPC_ACPT_IF_rtnクラス インスタンス
	public selectT_INSPC_ACPT_IF_rtn mselectT_INSPC_ACPT_IF_rtn = new selectT_INSPC_ACPT_IF_rtn();

	// checkSYS_OPTIONS_AIPクラス インスタンス
	public checkSYS_OPTIONS_AIP mcheckSYS_OPTIONS_AIP = new checkSYS_OPTIONS_AIP();

	// checkSYS_OPTIONS_JFクラス インスタンス
	public checkSYS_OPTIONS_JF mcheckSYS_OPTIONS_JF = new checkSYS_OPTIONS_JF();

	// selectT_INSPC_ACPT_IF_rtnCntクラス インスタンス
	public selectT_INSPC_ACPT_IF_rtnCnt mselectT_INSPC_ACPT_IF_rtnCnt = new selectT_INSPC_ACPT_IF_rtnCnt();

	// selectT_INSPC_ACPT_IFCntクラス インスタンス
	public selectT_INSPC_ACPT_IFCnt mselectT_INSPC_ACPT_IFCnt = new selectT_INSPC_ACPT_IFCnt();


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
		String m_write_fname="AE0150010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AE0150010";

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
	public class SYS_INSTALL_OPTIONS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_INSTALL_OPTIONS.INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  SYS_INSTALL_OPTIONS.OPTION_ID = 'C*'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_INSTALL_OPTIONS_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_INSTALL_OPTIONS_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0150010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0150010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read2
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read3
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
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
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0150010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0150010Struct data = new AE0150010Struct();

			data.setINSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
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
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_clear

			return;
		}

		/**
		 * SYS_INSTALL_OPTIONSクラスの標準コンストラクタ
		 */
		public SYS_INSTALL_OPTIONS()
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_INSPC_ACPT_IF extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ROW_NUMBER() OVER( "
+"    ORDER BY "
+"      T.PUCH_ODR_CD, "
+"      T.ACPT_NO, "
+"      T.INSPC_ACPT_NO), "
+"  T.APPR_ID, "
+"  TO_CHAR(T.APPR_DATE, 'YYYY/MM/DD'), "
+"  T.RESERVE_CAUSE, "
+"  T.PUCH_ODR_CD, "
+"  T.ACPT_NO, "
+"  T.INSPC_ACPT_NO, "
+"  T.CRCT_TYP, "
+"  TO_CHAR(T.INSPC_ACPT_DATE, 'YYYY/MM/DD'), "
+"  TO_CHAR(T.ACPT_DATE, 'YYYY/MM/DD'), "
+"  T.VEND_CD, "
+"  M_VEND_CTRL.VEND_ANAME, "
+"  T.PLANT_CD, "
+"  M_PLANT.PLANT_NAME, "
+"  T.GNR_ORG_CD, "
+"  M_ORG.ORG_NAME, "
+"  T.DLV_CD, "
+"  T.ITEM_CD, "
+"  T.ITEM_NAME, "
+"  T.PRODUCT_TYP, "
+"  T.WORK_IN_PROC_CD, "
+"  T.UNIT_COST, "
+"  T.UNIT_COST_TYP, "
+"  T.PROCESSING_COST, "
+"  T.MATERIAL_COST, "
+"  T.OTHER_OVERHEADS, "
+"  T.ACPT_QTY, "
+"  T.INSPC_ACPT_QTY, "
+"  T.STOCK_UNIT, "
+"  T.INSPC_ACPT_AMOUNT, "
+"  T.DISC_AMOUNT, "
+"  T.JOB_ODR_CD, "
+"  T.JOB_ODR_DETAIL_NO, "
+"  T.CLASIFICATION_CD, "
+"  T.SBCNT_PUCH_TYP, "
+"  T.INV_CTRL_FLG, "
+"  T.SLIP_TYP, "
+"  T.PUCH_RTN_FLG, "
+"  T.MODIFY_COUNT, "
+"  T.AI_AP_IF_FLG "
+"FROM "
+"  T_INSPC_ACPT_IF T, "
+"  M_VEND_CTRL, "
+"  M_PLANT, "
+"  M_ORG, "
+"  T_RLSD_PUCH_ODR, "
+"  (select A.PUCH_ODR_CD,A.ACPT_NO,MAX(A.INSPC_ACPT_NO) AS MAXINSPC_NO  FROM T_INSPC_ACPT_IF A GROUP BY  A.PUCH_ODR_CD,A.ACPT_NO) B "
+"WHERE "
+"  T.COMPANY_CD = ? "
+"  AND T.PLANT_CD = ? "
+"  AND((? = '1' "
+"  AND T.APPR_FLG = 1) "
+"  OR (? = '4' "
+"  AND T.APPR_FLG = 2)) "
+"  AND T.VEND_CD = ? "
+"  AND T.INSPC_ACPT_DATE >= ? "
+"  AND T.INSPC_ACPT_DATE <= ? "
+"  AND T.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND T.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND T.PLANT_CD = M_PLANT.PLANT_CD(+) "
+"  AND T.COMPANY_CD = M_ORG.COMPANY_CD(+) "
+"  AND T.GNR_ORG_CD = M_ORG.ORG_CD(+) "
+"  AND T.PUCH_ODR_CD = B.PUCH_ODR_CD "
+"  AND T.ACPT_NO = B.ACPT_NO "
+"  AND T.INSPC_ACPT_NO = B.MAXINSPC_NO "
+"  AND T.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD(+) "
+"  AND NVL(T_RLSD_PUCH_ODR.DIRECT_FLG,0) = ? "
+"ORDER BY "
+"  T.PUCH_ODR_CD, "
+"  T.ACPT_NO "
+" ";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_INSPC_ACPT_IF_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_INSPC_ACPT_IF_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0150010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0150010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_read
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_read2
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_read3
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getINSPC_DATE_FROM());
				if(isNull(data.getINSPC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPC_DATE_TO());
				if(isNull(data.getINSPC_DATE_TO())) isNull = true;
				ary.addElement(data.getDIRECT_FLG());
				if(isNull(data.getDIRECT_FLG())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_INSPC_ACPT_IF", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPC_DATE_FROM())) setString(no ++, data.getINSPC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPC_DATE_TO())) setString(no ++, data.getINSPC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDIRECT_FLG())) setString(no ++, data.getDIRECT_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0150010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0150010Struct data = new AE0150010Struct();

			data.setl_ROWNO( getString(1, rs) );
			data.setl_APPR_ID( getString(2, rs) );
			data.setl_APPR_DATE( getString(3, rs) );
			data.setl_RESERVE_CAUSE( getString(4, rs) );
			data.setl_PUCH_ODR_CD( getString(5, rs) );
			data.setl_ACPT_NO( getString(6, rs) );
			data.setl_INSPC_ACPT_NO( getString(7, rs) );
			data.setl_CRCT_TYP_CD( getString(8, rs) );
			data.setl_INSPC_ACPT_DATE( getString(9, rs) );
			data.setl_ACPT_DATE( getString(10, rs) );
			data.setl_VEND_CD( getString(11, rs) );
			data.setl_VEND_NAME( getString(12, rs) );
			data.setl_PLANT_CD( getString(13, rs) );
			data.setl_PLANT_NAME( getString(14, rs) );
			data.setl_GNR_ORG_CD( getString(15, rs) );
			data.setl_GNR_ORG_NAME( getString(16, rs) );
			data.setl_DLV_CD( getString(17, rs) );
			data.setl_ITEM_CD( getString(18, rs) );
			data.setl_ITEM_NAME( getString(19, rs) );
			data.setl_PRODUCT_TYP_CD( getString(20, rs) );
			data.setl_WORK_IN_PROC_CD( getString(21, rs) );
			data.setl_UNIT_COST( getString(22, rs) );
			data.setl_UNIT_COST_TYP_CD( getString(23, rs) );
			data.setl_PROCESSING_COST( getString(24, rs) );
			data.setl_MATERIAL_COST( getString(25, rs) );
			data.setl_OTHER_OVERHEADS( getString(26, rs) );
			data.setl_ACPT_QTY_2( getString(27, rs) );
			data.setl_INSPC_ACPT_QTY( getString(28, rs) );
			data.setl_STOCK_UNIT( getString(29, rs) );
			data.setl_INSPC_ACPT_AMOUNT( getString(30, rs) );
			data.setl_DISC_AMOUNT( getString(31, rs) );
			data.setl_JOB_ODR_CD( getString(32, rs) );
			data.setl_JOB_ODR_DETAIL_NO( getString(33, rs) );
			data.setl_MANAGEMENT_CD( getString(34, rs) );
			data.setl_SBCNT_PUCH_TYP_CD( getString(35, rs) );
			data.setl_INV_CTRL_FLG_CD( getString(36, rs) );
			data.setl_SLIP_TYP_CD( getString(37, rs) );
			data.setl_PUCH_RTN_FLG_CD( getString(38, rs) );
			data.setl_MODIFY_COUNT( getString(39, rs) );
			data.setl_AI_AP_IF_FLG( getString(40, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_clear

			return;
		}

		/**
		 * selectT_INSPC_ACPT_IFクラスの標準コンストラクタ
		 */
		public selectT_INSPC_ACPT_IF()
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_VEND_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_VEND_CTRL.VEND_NAME "
+"FROM "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_VEND_CTRL.COMPANY_CD = ? "
+"  AND M_VEND_CTRL.VEND_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_VEND_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_VEND_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0150010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0150010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_VEND_CTRL_read
			if(m_selcmd==null) throw new FoundationException("selectM_VEND_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_VEND_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_VEND_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("selectM_VEND_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_VEND_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_VEND_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("selectM_VEND_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_VEND_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
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
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0150010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0150010Struct data = new AE0150010Struct();

			data.setVEND_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_VEND_CTRL", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
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
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_VEND_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_VEND_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_VEND_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_VEND_CTRL_clear

			return;
		}

		/**
		 * selectM_VEND_CTRLクラスの標準コンストラクタ
		 */
		public selectM_VEND_CTRL()
		{
			//{{user_implement_dev:selectM_VEND_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_VEND_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_INSPC_ACPT_IF_modify extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_INSPC_ACPT_IF.MODIFY_COUNT "
+"FROM "
+"  T_INSPC_ACPT_IF "
+"WHERE "
+"  T_INSPC_ACPT_IF.PUCH_ODR_CD = ? "
+"  AND T_INSPC_ACPT_IF.ACPT_NO = ? "
+"  AND T_INSPC_ACPT_IF.INSPC_ACPT_NO = ? "
+"FOR UPDATE NOWAIT";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_INSPC_ACPT_IF_modify_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_INSPC_ACPT_IF_modify_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0150010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0150010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_modify_read
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_modify", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_modify_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_modify_read2
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_modify", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_modify_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_modify_read3
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_modify", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_modify_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
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
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_PUCH_ODR_CD());
				if(isNull(data.getl_PUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getl_ACPT_NO());
				if(isNull(data.getl_ACPT_NO())) isNull = true;
				ary.addElement(data.getl_INSPC_ACPT_NO());
				if(isNull(data.getl_INSPC_ACPT_NO())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getl_PUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getl_ACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getl_INSPC_ACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0150010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0150010Struct data = new AE0150010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_modify", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
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
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_modify_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_modify_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_modify_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_modify_clear

			return;
		}

		/**
		 * selectT_INSPC_ACPT_IF_modifyクラスの標準コンストラクタ
		 */
		public selectT_INSPC_ACPT_IF_modify()
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_modify_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_modify_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_INSPC_ACPT_IF extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_INSPC_ACPT_IF "
+"SET "
+"  T_INSPC_ACPT_IF.APPR_FLG = ?, "
+"  T_INSPC_ACPT_IF.APPR_ID = ?, "
+"  T_INSPC_ACPT_IF.APPR_DATE = ?, "
+"  T_INSPC_ACPT_IF.RESERVE_CAUSE = ? "
+"WHERE "
+"  T_INSPC_ACPT_IF.PUCH_ODR_CD = ? "
+"  AND T_INSPC_ACPT_IF.ACPT_NO = ? "
+"";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0150010";
		protected String m_sUpdateProgramName="AE0150010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_INSPC_ACPT_IF_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_INSPC_ACPT_IF_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getAPPR_FLG(), stmt);
				setString(5, data.getAPPR_ID(), stmt);
				setString(6, data.getAPPR_DATE(), stmt);
				setString(7, data.getRESERVE_CAUSE(), stmt);
				setString(8, data.getl_PUCH_ODR_CD(), stmt);
				setString(9, data.getl_ACPT_NO(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_INSPC_ACPT_IF_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_INSPC_ACPT_IF_clear

			return;
		}

		/**
		 * updateT_INSPC_ACPT_IFクラスの標準コンストラクタ
		 */
		public updateT_INSPC_ACPT_IF()
		{
			//{{user_implement_dev:updateT_INSPC_ACPT_IF_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_INSPC_ACPT_IF_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectUSER_MST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  USER_MST.APPR_POWER_TYP, "
+"  USER_MST.COMPANY_CD, "
+"  USER_MST.PLANT_CD "
+"FROM "
+"  USER_MST "
+"WHERE "
+"  USER_MST.USER_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectUSER_MST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectUSER_MST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0150010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0150010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectUSER_MST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read2
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectUSER_MST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read3
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectUSER_MST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
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
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getUSER_CD());
				if(isNull(data.getUSER_CD())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getUSER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0150010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0150010Struct data = new AE0150010Struct();

			data.setAPPR_POWER_TYP( getString(1, rs) );
			data.setCOMPANY_CD( getString(2, rs) );
			data.setPLANT_CD( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
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
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectUSER_MST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectUSER_MST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectUSER_MST_clear

			return;
		}

		/**
		 * selectUSER_MSTクラスの標準コンストラクタ
		 */
		public selectUSER_MST()
		{
			//{{user_implement_dev:selectUSER_MST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectUSER_MST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_INSPC_ACPT_IF_rtn extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ROW_NUMBER() OVER( "
+"    ORDER BY "
+"      T.PUCH_ODR_CD ASC, "
+"      T.ACPT_NO ASC, "
+"      T.INSPC_ACPT_NO DESC), "
+"  T.APPR_ID, "
+"  TO_CHAR(T.APPR_DATE, 'YYYY/MM/DD'), "
+"  T.RESERVE_CAUSE, "
+"  T.PUCH_ODR_CD, "
+"  T.ACPT_NO, "
+"  T.INSPC_ACPT_NO, "
+"  T.CRCT_TYP, "
+"  TO_CHAR(T.INSPC_ACPT_DATE, 'YYYY/MM/DD'), "
+"  TO_CHAR(T.ACPT_DATE, 'YYYY/MM/DD'), "
+"  T.VEND_CD, "
+"  M_VEND_CTRL.VEND_ANAME, "
+"  T.PLANT_CD, "
+"  M_PLANT.PLANT_NAME, "
+"  T.GNR_ORG_CD, "
+"  M_ORG.ORG_NAME, "
+"  T.DLV_CD, "
+"  T.ITEM_CD, "
+"  T.ITEM_NAME, "
+"  T.PRODUCT_TYP, "
+"  T.WORK_IN_PROC_CD, "
+"  T.UNIT_COST, "
+"  T.UNIT_COST_TYP, "
+"  T.PROCESSING_COST, "
+"  T.MATERIAL_COST, "
+"  T.OTHER_OVERHEADS, "
+"  T.ACPT_QTY, "
+"  T.INSPC_ACPT_QTY, "
+"  T.STOCK_UNIT, "
+"  T.INSPC_ACPT_AMOUNT, "
+"  T.DISC_AMOUNT, "
+"  T.JOB_ODR_CD, "
+"  T.JOB_ODR_DETAIL_NO, "
+"  T.CLASIFICATION_CD, "
+"  T.SBCNT_PUCH_TYP, "
+"  T.INV_CTRL_FLG, "
+"  T.SLIP_TYP, "
+"  T.PUCH_RTN_FLG, "
+"  T.MODIFY_COUNT, "
+"  T.AI_AP_IF_FLG "
+"FROM "
+"  T_INSPC_ACPT_IF T, "
+"  M_VEND_CTRL, "
+"  M_PLANT, "
+"  M_ORG, "
+"  T_RLSD_PUCH_ODR, "
+"  (select A.PUCH_ODR_CD,A.ACPT_NO,MAX(A.INSPC_ACPT_NO) AS MAXINSPC_NO  FROM T_INSPC_ACPT_IF A GROUP BY  A.PUCH_ODR_CD,A.ACPT_NO) B "
+"WHERE "
+"  T.COMPANY_CD = ? "
+"  AND T.PLANT_CD = ? "
+"  AND((? = '2' "
+"  AND T.APPR_FLG = 1) "
+"  OR (? = '3' "
+"  AND T.APPR_FLG = 3)) "
+"  AND T.VEND_CD = ? "
+"  AND T.INSPC_ACPT_DATE >= ? "
+"  AND T.INSPC_ACPT_DATE <= ? "
+"  AND T.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND T.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND T.PLANT_CD = M_PLANT.PLANT_CD(+) "
+"  AND T.COMPANY_CD = M_ORG.COMPANY_CD(+) "
+"  AND T.GNR_ORG_CD = M_ORG.ORG_CD(+) "
+"  AND T.PUCH_ODR_CD = B.PUCH_ODR_CD "
+"  AND T.ACPT_NO = B.ACPT_NO "
+"  AND T.INSPC_ACPT_NO = B.MAXINSPC_NO "
+"  AND T.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD(+) "
+"  AND NVL(T_RLSD_PUCH_ODR.DIRECT_FLG,0) = ? "
+"ORDER BY "
+"  T.PUCH_ODR_CD ASC, "
+"  T.ACPT_NO ASC "
+"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtn_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtn_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0150010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0150010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtn_read
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_rtn", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtn_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtn_read2
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_rtn", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtn_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtn_read3
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_rtn", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtn_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getINSPC_DATE_FROM());
				if(isNull(data.getINSPC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPC_DATE_TO());
				if(isNull(data.getINSPC_DATE_TO())) isNull = true;
				ary.addElement(data.getDIRECT_FLG());
				if(isNull(data.getDIRECT_FLG())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_INSPC_ACPT_IF_rtn", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPC_DATE_FROM())) setString(no ++, data.getINSPC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPC_DATE_TO())) setString(no ++, data.getINSPC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDIRECT_FLG())) setString(no ++, data.getDIRECT_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0150010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0150010Struct data = new AE0150010Struct();

			data.setl_ROWNO( getString(1, rs) );
			data.setl_APPR_ID( getString(2, rs) );
			data.setl_APPR_DATE( getString(3, rs) );
			data.setl_RESERVE_CAUSE( getString(4, rs) );
			data.setl_PUCH_ODR_CD( getString(5, rs) );
			data.setl_ACPT_NO( getString(6, rs) );
			data.setl_INSPC_ACPT_NO( getString(7, rs) );
			data.setl_CRCT_TYP_CD( getString(8, rs) );
			data.setl_INSPC_ACPT_DATE( getString(9, rs) );
			data.setl_ACPT_DATE( getString(10, rs) );
			data.setl_VEND_CD( getString(11, rs) );
			data.setl_VEND_NAME( getString(12, rs) );
			data.setl_PLANT_CD( getString(13, rs) );
			data.setl_PLANT_NAME( getString(14, rs) );
			data.setl_GNR_ORG_CD( getString(15, rs) );
			data.setl_GNR_ORG_NAME( getString(16, rs) );
			data.setl_DLV_CD( getString(17, rs) );
			data.setl_ITEM_CD( getString(18, rs) );
			data.setl_ITEM_NAME( getString(19, rs) );
			data.setl_PRODUCT_TYP_CD( getString(20, rs) );
			data.setl_WORK_IN_PROC_CD( getString(21, rs) );
			data.setl_UNIT_COST( getString(22, rs) );
			data.setl_UNIT_COST_TYP_CD( getString(23, rs) );
			data.setl_PROCESSING_COST( getString(24, rs) );
			data.setl_MATERIAL_COST( getString(25, rs) );
			data.setl_OTHER_OVERHEADS( getString(26, rs) );
			data.setl_ACPT_QTY_2( getString(27, rs) );
			data.setl_INSPC_ACPT_QTY( getString(28, rs) );
			data.setl_STOCK_UNIT( getString(29, rs) );
			data.setl_INSPC_ACPT_AMOUNT( getString(30, rs) );
			data.setl_DISC_AMOUNT( getString(31, rs) );
			data.setl_JOB_ODR_CD( getString(32, rs) );
			data.setl_JOB_ODR_DETAIL_NO( getString(33, rs) );
			data.setl_MANAGEMENT_CD( getString(34, rs) );
			data.setl_SBCNT_PUCH_TYP_CD( getString(35, rs) );
			data.setl_INV_CTRL_FLG_CD( getString(36, rs) );
			data.setl_SLIP_TYP_CD( getString(37, rs) );
			data.setl_PUCH_RTN_FLG_CD( getString(38, rs) );
			data.setl_MODIFY_COUNT( getString(39, rs) );
			data.setl_AI_AP_IF_FLG( getString(40, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_rtn", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtn_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtn_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtn_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtn_clear

			return;
		}

		/**
		 * selectT_INSPC_ACPT_IF_rtnクラスの標準コンストラクタ
		 */
		public selectT_INSPC_ACPT_IF_rtn()
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtn_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtn_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSYS_OPTIONS_AIP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  SYS_INSTALL_OPTIONS.OPTION_ID = 'AiP' "
+"  AND SYS_INSTALL_OPTIONS.INSTALL_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSYS_OPTIONS_AIP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSYS_OPTIONS_AIP_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSYS_OPTIONS_AIP_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSYS_OPTIONS_AIP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkSYS_OPTIONS_AIP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSYS_OPTIONS_AIP_clear

			return;
		}

		/**
		 * checkSYS_OPTIONS_AIPクラスの標準コンストラクタ
		 */
		public checkSYS_OPTIONS_AIP()
		{
			//{{user_implement_dev:checkSYS_OPTIONS_AIP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSYS_OPTIONS_AIP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSYS_OPTIONS_JF extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  SYS_INSTALL_OPTIONS.OPTION_ID = 'JF*' "
+"  AND SYS_INSTALL_OPTIONS.INSTALL_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSYS_OPTIONS_JF_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSYS_OPTIONS_JF_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSYS_OPTIONS_JF_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSYS_OPTIONS_JF_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkSYS_OPTIONS_JF_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSYS_OPTIONS_JF_clear

			return;
		}

		/**
		 * checkSYS_OPTIONS_JFクラスの標準コンストラクタ
		 */
		public checkSYS_OPTIONS_JF()
		{
			//{{user_implement_dev:checkSYS_OPTIONS_JF_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSYS_OPTIONS_JF_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_INSPC_ACPT_IF_rtnCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  T_INSPC_ACPT_IF T, "
+"  M_VEND_CTRL, "
+"  M_PLANT, "
+"  M_ORG, "
+"  T_RLSD_PUCH_ODR, "
+"  ( "
+"    select "
+"      A.PUCH_ODR_CD, "
+"      A.ACPT_NO, "
+"      MAX(A.INSPC_ACPT_NO) AS MAXINSPC_NO "
+"    FROM "
+"      T_INSPC_ACPT_IF A "
+"    GROUP BY "
+"      A.PUCH_ODR_CD, "
+"      A.ACPT_NO "
+"  ) B "
+"WHERE "
+"  T.COMPANY_CD = ? "
+"  AND T.PLANT_CD = ? "
+"  AND((? = '2' "
+"  AND T.APPR_FLG = 1) "
+"  OR (? = '3' "
+"  AND T.APPR_FLG = 3)) "
+"  AND T.VEND_CD = ? "
+"  AND T.INSPC_ACPT_DATE >= ? "
+"  AND T.INSPC_ACPT_DATE <= ? "
+"  AND T.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND T.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND T.PLANT_CD = M_PLANT.PLANT_CD(+) "
+"  AND T.COMPANY_CD = M_ORG.COMPANY_CD(+) "
+"  AND T.GNR_ORG_CD = M_ORG.ORG_CD(+) "
+"  AND T.PUCH_ODR_CD = B.PUCH_ODR_CD "
+"  AND T.ACPT_NO = B.ACPT_NO "
+"  AND T.INSPC_ACPT_NO = B.MAXINSPC_NO "
+"  AND T.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD(+) "
+"  AND NVL(T_RLSD_PUCH_ODR.DIRECT_FLG, 0) = ? "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0150010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0150010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_rtnCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_rtnCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_rtnCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getINSPC_DATE_FROM());
				if(isNull(data.getINSPC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPC_DATE_TO());
				if(isNull(data.getINSPC_DATE_TO())) isNull = true;
				ary.addElement(data.getDIRECT_FLG());
				if(isNull(data.getDIRECT_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_INSPC_ACPT_IF_rtnCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPC_DATE_FROM())) setString(no ++, data.getINSPC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPC_DATE_TO())) setString(no ++, data.getINSPC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDIRECT_FLG())) setString(no ++, data.getDIRECT_FLG(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0150010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0150010Struct data = new AE0150010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IF_rtnCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_clear

			return;
		}

		/**
		 * selectT_INSPC_ACPT_IF_rtnCntクラスの標準コンストラクタ
		 */
		public selectT_INSPC_ACPT_IF_rtnCnt()
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IF_rtnCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_INSPC_ACPT_IFCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  T_INSPC_ACPT_IF T, "
+"  M_VEND_CTRL, "
+"  M_PLANT, "
+"  M_ORG, "
+"  T_RLSD_PUCH_ODR, "
+"  ( "
+"    select "
+"      A.PUCH_ODR_CD, "
+"      A.ACPT_NO, "
+"      MAX(A.INSPC_ACPT_NO) AS MAXINSPC_NO "
+"    FROM "
+"      T_INSPC_ACPT_IF A "
+"    GROUP BY "
+"      A.PUCH_ODR_CD, "
+"      A.ACPT_NO "
+"  ) B "
+"WHERE "
+"  T.COMPANY_CD = ? "
+"  AND T.PLANT_CD = ? "
+"  AND((? = '1' "
+"  AND T.APPR_FLG = 1) "
+"  OR (? = '4' "
+"  AND T.APPR_FLG = 2)) "
+"  AND T.VEND_CD = ? "
+"  AND T.INSPC_ACPT_DATE >= ? "
+"  AND T.INSPC_ACPT_DATE <= ? "
+"  AND T.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND T.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND T.PLANT_CD = M_PLANT.PLANT_CD(+) "
+"  AND T.COMPANY_CD = M_ORG.COMPANY_CD(+) "
+"  AND T.GNR_ORG_CD = M_ORG.ORG_CD(+) "
+"  AND T.PUCH_ODR_CD = B.PUCH_ODR_CD "
+"  AND T.ACPT_NO = B.ACPT_NO "
+"  AND T.INSPC_ACPT_NO = B.MAXINSPC_NO "
+"  AND T.PUCH_ODR_CD = T_RLSD_PUCH_ODR.PUCH_ODR_CD(+) "
+"  AND NVL(T_RLSD_PUCH_ODR.DIRECT_FLG, 0) = ? "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_INSPC_ACPT_IFCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_INSPC_ACPT_IFCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0150010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0150010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IFCnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IFCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IFCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IFCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IFCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IFCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0150010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IFCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IFCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_INSPC_ACPT_IFCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0150010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getINSPC_DATE_FROM());
				if(isNull(data.getINSPC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPC_DATE_TO());
				if(isNull(data.getINSPC_DATE_TO())) isNull = true;
				ary.addElement(data.getDIRECT_FLG());
				if(isNull(data.getDIRECT_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_INSPC_ACPT_IFCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPC_DATE_FROM())) setString(no ++, data.getINSPC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPC_DATE_TO())) setString(no ++, data.getINSPC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDIRECT_FLG())) setString(no ++, data.getDIRECT_FLG(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0150010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0150010Struct data = new AE0150010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_INSPC_ACPT_IFCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0150010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0150010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IFCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_INSPC_ACPT_IFCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0150010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_INSPC_ACPT_IFCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IFCnt_clear

			return;
		}

		/**
		 * selectT_INSPC_ACPT_IFCntクラスの標準コンストラクタ
		 */
		public selectT_INSPC_ACPT_IFCnt()
		{
			//{{user_implement_dev:selectT_INSPC_ACPT_IFCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_INSPC_ACPT_IFCnt_constractor

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
		mSYS_INSTALL_OPTIONS.clear();
		mSYS_INSTALL_OPTIONS = null;
		mselectT_INSPC_ACPT_IF.clear();
		mselectT_INSPC_ACPT_IF = null;
		mselectM_VEND_CTRL.clear();
		mselectM_VEND_CTRL = null;
		mselectT_INSPC_ACPT_IF_modify.clear();
		mselectT_INSPC_ACPT_IF_modify = null;
		mupdateT_INSPC_ACPT_IF.clear();
		mupdateT_INSPC_ACPT_IF = null;
		mselectUSER_MST.clear();
		mselectUSER_MST = null;
		mselectT_INSPC_ACPT_IF_rtn.clear();
		mselectT_INSPC_ACPT_IF_rtn = null;
		mcheckSYS_OPTIONS_AIP.clear();
		mcheckSYS_OPTIONS_AIP = null;
		mcheckSYS_OPTIONS_JF.clear();
		mcheckSYS_OPTIONS_JF = null;
		mselectT_INSPC_ACPT_IF_rtnCnt.clear();
		mselectT_INSPC_ACPT_IF_rtnCnt = null;
		mselectT_INSPC_ACPT_IFCnt.clear();
		mselectT_INSPC_ACPT_IFCnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AE0150010クラスの標準コンストラクタ
	 */
	public AE0150010Entity() throws FoundationException
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
