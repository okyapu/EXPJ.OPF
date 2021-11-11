/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0160/src/com/nec/jp/orteus/metamorBase/AC0160/AC0160010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0160;

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
 * CLASS     : AC0160010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AC0160010Entity extends DataObject
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

	// selectM_ITEMクラス インスタンス
	public selectM_ITEM mselectM_ITEM = new selectM_ITEM();

	// selectM_WSクラス インスタンス
	public selectM_WS mselectM_WS = new selectM_WS();

	// selectOUTSIDE_TYP_1クラス インスタンス
	public selectOUTSIDE_TYP_1 mselectOUTSIDE_TYP_1 = new selectOUTSIDE_TYP_1();

	// selectOUTSIDE_TYP_2クラス インスタンス
	public selectOUTSIDE_TYP_2 mselectOUTSIDE_TYP_2 = new selectOUTSIDE_TYP_2();

	// selectROUND_TYPクラス インスタンス
	public selectROUND_TYP mselectROUND_TYP = new selectROUND_TYP();

	// selectEXCH_RATEクラス インスタンス
	public selectEXCH_RATE mselectEXCH_RATE = new selectEXCH_RATE();

	// selectVEND_CDクラス インスタンス
	public selectVEND_CD mselectVEND_CD = new selectVEND_CD();

	// selectHOME_CUR_CDクラス インスタンス
	public selectHOME_CUR_CD mselectHOME_CUR_CD = new selectHOME_CUR_CD();

	// selectM_PUCH_UNIT_COSTクラス インスタンス
	public selectM_PUCH_UNIT_COST mselectM_PUCH_UNIT_COST = new selectM_PUCH_UNIT_COST();

	// getCOMPANY_CDクラス インスタンス
	public getCOMPANY_CD mgetCOMPANY_CD = new getCOMPANY_CD();

	// getCUR_NAMEクラス インスタンス
	public getCUR_NAME mgetCUR_NAME = new getCUR_NAME();

	// selectOUTSIDE_TYP_1_Cntクラス インスタンス
	public selectOUTSIDE_TYP_1_Cnt mselectOUTSIDE_TYP_1_Cnt = new selectOUTSIDE_TYP_1_Cnt();

	// selectOUTSIDE_TYP_2_Cntクラス インスタンス
	public selectOUTSIDE_TYP_2_Cnt mselectOUTSIDE_TYP_2_Cnt = new selectOUTSIDE_TYP_2_Cnt();


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
		String m_write_fname="AC0160010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AC0160010";

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
	public class selectM_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\" "
+"FROM "
+"  M_ITEM "
+"WHERE "
+"  M_ITEM.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_read
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getIN_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setreadITEM_CD( getString(1, rs) );
			data.setIN_ITEM_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_ITEM_clear

			return;
		}

		/**
		 * selectM_ITEMクラスの標準コンストラクタ
		 */
		public selectM_ITEM()
		{
			//{{user_implement_dev:selectM_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_WS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_WS.\"WS_CD\" AS \"WS_CD\", "
+"  M_WS.\"WS_NAME\" AS \"WS_NAME\", "
+"  M_WS.\"PLANT_CD\" AS \"PLANT_CD\" "
+"FROM "
+"  M_WS "
+"WHERE "
+"  M_WS.\"WS_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_WS_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_WS_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WS_read
			if(m_selcmd==null) throw new FoundationException("selectM_WS", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_WS_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WS_read2
			if(m_selcmd==null) throw new FoundationException("selectM_WS", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_WS_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WS_read3
			if(m_selcmd==null) throw new FoundationException("selectM_WS", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_WS_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_WS_CD());
				if(isNull(data.getIN_WS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getIN_WS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setreadWS_CD( getString(1, rs) );
			data.setIN_WS_NAME( getString(2, rs) );
			data.setreadWS_PLANT_CD( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_WS", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WS_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_WS_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_WS_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_WS_clear

			return;
		}

		/**
		 * selectM_WSクラスの標準コンストラクタ
		 */
		public selectM_WS()
		{
			//{{user_implement_dev:selectM_WS_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_WS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectOUTSIDE_TYP_1 extends DataObject
	{
		protected String m_selcmd = "SELECT DISTINCT "
+"  T_OD.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_ITEM.ITEM_NAME AS ITEM_NAME, "
+"  TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') AS \"PRD_DUE_DATE\", "
+"  TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') AS \"PRD_START_DATE\", "
+"  CASE "
+"    WHEN T_OD.OD_TYP = 2 "
+"  OR  T_OD.OD_TYP = 1 THEN T_OD.\"ODR_QTY\" "
+"    WHEN T_OD.OD_TYP = 3 "
+"  OR  T_OD.OD_TYP = 1 THEN T_OD.\"DM_QTY\" "
+"  END AS OPR_INST_PUCH_ODR_QTY, "
+"  M_PROC_GRP2.\"WS_CD\" AS \"WS_VEND_CD\", "
+"  T_OD.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T_OD.\"ODR_STS_TYP\" AS \"ODR_STS_TYP\" "
+"FROM "
+"  T_OD, "
+"  ( "
+"    SELECT "
+"      M_PROC_GRP.\"PLANT_CD\", "
+"      M_PROC_GRP.\"ITEM_CD\", "
+"      M_PROC_GRP.\"PROC_NO\", "
+"      DECODE(M_ITEM.OPR_RSLT_TYP, 1, M_PROC_GRP.\"WS_CD\", NULL) AS \"WS_CD\" "
+"    FROM "
+"      ( "
+"        SELECT "
+"          M_PROC_GRP.\"PLANT_CD\", "
+"          M_PROC_GRP.\"ITEM_CD\", "
+"          MIN(M_PROC_GRP.\"PROC_NO\") AS \"PROC_NO\" "
+"        FROM "
+"          M_PROC_GRP "
+"        WHERE "
+"          M_PROC_GRP.\"OUTSIDE_TYP\" = '1' "
+"        GROUP BY "
+"          M_PROC_GRP.\"PLANT_CD\", "
+"          M_PROC_GRP.\"ITEM_CD\" "
+"      ) M_PROC_GRP1, "
+"      M_PROC_GRP, "
+"      M_ITEM "
+"    WHERE "
+"      M_PROC_GRP.\"PLANT_CD\" = M_PROC_GRP1.\"PLANT_CD\" "
+"      AND M_PROC_GRP.\"ITEM_CD\" = M_PROC_GRP1.\"ITEM_CD\" "
+"      AND M_PROC_GRP.\"PROC_NO\" = M_PROC_GRP1.\"PROC_NO\" "
+"      AND M_PROC_GRP.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  ) M_PROC_GRP2, "
+"  M_ITEM "
+"WHERE "
+"  T_OD.\"OD_TYP\" IN (?, '1')							 "
+"  AND ( (? = 2 AND T_OD.\"ODR_STS_TYP\" IN (?,?,?)) OR ( ? = 3 AND T_OD.\"DM_STS_TYP\" IN (?,?,?))) "
+"  AND T_OD.\"OUTSIDE_TYP\" = '1' "
+"  AND T_OD.\"MRP_TYP\" = '9' "
+"  AND T_OD.\"PLANT_CD\" = ? "
+"  AND T_OD.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP2.\"PLANT_CD\"(+) = T_OD.\"PLANT_CD\" "
+"  AND M_PROC_GRP2.\"ITEM_CD\"(+) = T_OD.\"ITEM_CD\" "
+"  AND M_PROC_GRP2.\"WS_CD\" = ? "
+"  AND TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') <= ? "
+"  AND TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') <= ? "
+"  AND T_OD.\"ITEM_CD\" = M_ITEM.ITEM_CD "
+"  AND M_ITEM.\"PRODUCT_TYP\" = ? "
+"ORDER BY "
+"  \"ITEM_CD\", "
+"  \"PRD_DUE_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectOUTSIDE_TYP_1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectOUTSIDE_TYP_1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_read
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_read2
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_read3
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInC1_ODR_STS_TYP());
				if(isNull(data.getInC1_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_ODR_STS_TYP());
				if(isNull(data.getInC2_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_ODR_STS_TYP());
				if(isNull(data.getInC3_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInC1_ODR_STS_TYP());
				if(isNull(data.getInC1_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_ODR_STS_TYP());
				if(isNull(data.getInC2_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_ODR_STS_TYP());
				if(isNull(data.getInC3_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInPLANT_CD());
				if(isNull(data.getInPLANT_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_WS_CD());
				if(isNull(data.getIN_WS_CD())) isNull = true;
				ary.addElement(data.getIN_PRD_START_DATE_FROM());
				if(isNull(data.getIN_PRD_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getIN_PRD_START_DATE_TO());
				if(isNull(data.getIN_PRD_START_DATE_TO())) isNull = true;
				ary.addElement(data.getIN_PRD_DUE_DATE_FROM());
				if(isNull(data.getIN_PRD_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getIN_PRD_DUE_DATE_TO());
				if(isNull(data.getIN_PRD_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getPRODUCT_TYP());
				if(isNull(data.getPRODUCT_TYP())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectOUTSIDE_TYP_1", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_ODR_STS_TYP())) setString(no ++, data.getInC1_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_ODR_STS_TYP())) setString(no ++, data.getInC2_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_ODR_STS_TYP())) setString(no ++, data.getInC3_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_ODR_STS_TYP())) setString(no ++, data.getInC1_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_ODR_STS_TYP())) setString(no ++, data.getInC2_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_ODR_STS_TYP())) setString(no ++, data.getInC3_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInPLANT_CD())) setString(no ++, data.getInPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WS_CD())) setString(no ++, data.getIN_WS_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_START_DATE_FROM())) setString(no ++, data.getIN_PRD_START_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_START_DATE_TO())) setString(no ++, data.getIN_PRD_START_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_DUE_DATE_FROM())) setString(no ++, data.getIN_PRD_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_DUE_DATE_TO())) setString(no ++, data.getIN_PRD_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPRODUCT_TYP())) setString(no ++, data.getPRODUCT_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setPRD_DUE_DATE( getString(3, rs) );
			data.setPRD_START_DATE( getString(4, rs) );
			data.setOPR_INST_PUCH_ODR_QTY( getString(5, rs) );
			data.setWS_VEND_CD( getString(6, rs) );
			data.setJOB_ODR_CD( getString(7, rs) );
			data.seth_ODR_STS_TYP( getString(8, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectOUTSIDE_TYP_1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_clear

			return;
		}

		/**
		 * selectOUTSIDE_TYP_1クラスの標準コンストラクタ
		 */
		public selectOUTSIDE_TYP_1()
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectOUTSIDE_TYP_2 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_OD.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_ITEM.ITEM_NAME AS ITEM_NAME, "
+"  TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') AS \"PRD_DUE_DATE\", "
+"  TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') AS \"PRD_START_DATE\", "
+"  CASE "
+"    WHEN T_OD.OD_TYP = 2 "
+"  OR  T_OD.OD_TYP = 1 THEN T_OD.\"ODR_QTY\" "
+"    WHEN T_OD.OD_TYP = 3 "
+"  OR  T_OD.OD_TYP = 1 THEN T_OD.\"DM_QTY\" "
+"  END AS OPR_INST_PUCH_ODR_QTY, "
+"  T_OD.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  ( "
+"    SELECT "
+"      SYS_TYPE_VALUE.\"DISPLAY_NAME\" "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      SYS_TYPE_VALUE.VALUE = '0' "
+"      AND SYS_TYPE_VALUE.NAME = 'NON_NO_ITEM_FLG' "
+"  ) AS \"NON_NO_ITEM_FLG\", "
+"  ( "
+"    SELECT "
+"      SYS_TYPE_VALUE.\"DISPLAY_NAME\" "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      SYS_TYPE_VALUE.VALUE = '0' "
+"      AND SYS_TYPE_VALUE.NAME = 'NON_NO_ITEM_TYP' "
+"  ) AS \"NON_NO_ITEM_TYP\", "
+"  T_OD.\"ODR_STS_TYP\" AS \"ODR_STS_TYP\" "
+"FROM "
+"  T_OD, "
+"  M_ITEM "
+"WHERE "
+"  T_OD.\"OD_TYP\" IN (?, '1')							 "
+"  AND ((? = 2 AND T_OD.\"ODR_STS_TYP\" IN (?,?,?)) OR ( ? = 3 AND T_OD.\"DM_STS_TYP\" IN (?,?,?))) "
+"  AND T_OD.\"OUTSIDE_TYP\" = '2' "
+"  AND T_OD.\"PLANT_CD\" = ? "
+"  AND T_OD.\"ITEM_CD\" = ? "
+"  AND TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') <= ? "
+"  AND TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') <= ? "
+"  AND T_OD.\"ITEM_CD\" = M_ITEM.ITEM_CD(+) "
+"  AND M_ITEM.\"PRODUCT_TYP\" = ? "
+"ORDER BY "
+"  \"ITEM_CD\", "
+"  \"PRD_DUE_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectOUTSIDE_TYP_2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectOUTSIDE_TYP_2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_read
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_read2
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_read3
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInC1_ODR_STS_TYP());
				if(isNull(data.getInC1_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_ODR_STS_TYP());
				if(isNull(data.getInC2_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_ODR_STS_TYP());
				if(isNull(data.getInC3_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInC1_ODR_STS_TYP());
				if(isNull(data.getInC1_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_ODR_STS_TYP());
				if(isNull(data.getInC2_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_ODR_STS_TYP());
				if(isNull(data.getInC3_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInPLANT_CD());
				if(isNull(data.getInPLANT_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_PRD_START_DATE_FROM());
				if(isNull(data.getIN_PRD_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getIN_PRD_START_DATE_TO());
				if(isNull(data.getIN_PRD_START_DATE_TO())) isNull = true;
				ary.addElement(data.getIN_PRD_DUE_DATE_FROM());
				if(isNull(data.getIN_PRD_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getIN_PRD_DUE_DATE_TO());
				if(isNull(data.getIN_PRD_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getPRODUCT_TYP());
				if(isNull(data.getPRODUCT_TYP())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectOUTSIDE_TYP_2", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_ODR_STS_TYP())) setString(no ++, data.getInC1_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_ODR_STS_TYP())) setString(no ++, data.getInC2_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_ODR_STS_TYP())) setString(no ++, data.getInC3_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_ODR_STS_TYP())) setString(no ++, data.getInC1_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_ODR_STS_TYP())) setString(no ++, data.getInC2_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_ODR_STS_TYP())) setString(no ++, data.getInC3_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInPLANT_CD())) setString(no ++, data.getInPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_START_DATE_FROM())) setString(no ++, data.getIN_PRD_START_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_START_DATE_TO())) setString(no ++, data.getIN_PRD_START_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_DUE_DATE_FROM())) setString(no ++, data.getIN_PRD_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_DUE_DATE_TO())) setString(no ++, data.getIN_PRD_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPRODUCT_TYP())) setString(no ++, data.getPRODUCT_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setPRD_DUE_DATE( getString(3, rs) );
			data.setPRD_START_DATE( getString(4, rs) );
			data.setOPR_INST_PUCH_ODR_QTY( getString(5, rs) );
			data.setJOB_ODR_CD( getString(6, rs) );
			data.setNON_NO_ITEM_FLG( getString(7, rs) );
			data.setNON_NO_ITEM_TYP( getString(8, rs) );
			data.seth_ODR_STS_TYP( getString(9, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_2", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectOUTSIDE_TYP_2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_clear

			return;
		}

		/**
		 * selectOUTSIDE_TYP_2クラスの標準コンストラクタ
		 */
		public selectOUTSIDE_TYP_2()
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectROUND_TYP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ROUND_TYP "
+"FROM "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_VEND_CTRL.\"VEND_CD\" = ? "
+"  AND M_VEND_CTRL.\"COMPANY_CD\" = ( "
+"    SELECT "
+"      SYS_MY_COMPANY.\"COMPANY_CD\" "
+"    FROM "
+"      SYS_MY_COMPANY "
+"    WHERE "
+"      SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectROUND_TYP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectROUND_TYP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectROUND_TYP_read
			if(m_selcmd==null) throw new FoundationException("selectROUND_TYP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectROUND_TYP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectROUND_TYP_read2
			if(m_selcmd==null) throw new FoundationException("selectROUND_TYP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectROUND_TYP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectROUND_TYP_read3
			if(m_selcmd==null) throw new FoundationException("selectROUND_TYP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectROUND_TYP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_VEND_CD());
				if(isNull(data.getWS_VEND_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWS_VEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setROUND_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectROUND_TYP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectROUND_TYP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectROUND_TYP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectROUND_TYP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectROUND_TYP_clear

			return;
		}

		/**
		 * selectROUND_TYPクラスの標準コンストラクタ
		 */
		public selectROUND_TYP()
		{
			//{{user_implement_dev:selectROUND_TYP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectROUND_TYP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectEXCH_RATE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_VEND_CTRL.\"VEND_CD\", "
+"  M_VEND_CTRL.\"CUR_CD\", "
+"  M_EXCH_RATE.\"CUR_CD\", "
+"  M_EXCH_RATE.\"EXCH_RATE\", "
+"  M_EXCH_RATE.\"EXCH_START_DATE\" "
+"FROM "
+"  M_EXCH_RATE, "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_EXCH_RATE.\"CUR_CD\" = M_VEND_CTRL.\"CUR_CD\" "
+"  AND M_EXCH_RATE.\"COMPANY_CD\" = ( "
+"    SELECT "
+"      SYS_MY_COMPANY.\"COMPANY_CD\" "
+"    FROM "
+"      SYS_MY_COMPANY "
+"    WHERE "
+"      SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"  ) "
+"  AND M_VEND_CTRL.\"VEND_CD\" = ? "
+"ORDER BY "
+"  M_EXCH_RATE.\"EXCH_START_DATE\" DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectEXCH_RATE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectEXCH_RATE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectEXCH_RATE_read
			if(m_selcmd==null) throw new FoundationException("selectEXCH_RATE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectEXCH_RATE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectEXCH_RATE_read2
			if(m_selcmd==null) throw new FoundationException("selectEXCH_RATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectEXCH_RATE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectEXCH_RATE_read3
			if(m_selcmd==null) throw new FoundationException("selectEXCH_RATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectEXCH_RATE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_VEND_CD());
				if(isNull(data.getWS_VEND_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWS_VEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setWS_VEND_CD( getString(1, rs) );
			data.setCUR_CD( getString(2, rs) );
			data.setCUR_CD( getString(3, rs) );
			data.setEXCH_RATE( getString(4, rs) );
			data.setEXCH_START_DATE( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectEXCH_RATE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectEXCH_RATE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectEXCH_RATE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectEXCH_RATE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectEXCH_RATE_clear

			return;
		}

		/**
		 * selectEXCH_RATEクラスの標準コンストラクタ
		 */
		public selectEXCH_RATE()
		{
			//{{user_implement_dev:selectEXCH_RATE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectEXCH_RATE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectVEND_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PUCH_UNIT_COST_H.\"VEND_CD\" AS \"VEND_CD\", "
+"  M_PUCH_UNIT_COST_H.\"ITEM_CD\" AS \"ITEM_CD\" "
+"FROM "
+"  M_PUCH_UNIT_COST_H "
+"WHERE "
+"  M_PUCH_UNIT_COST_H.\"PLANT_CD\" = ? "
+"  AND M_PUCH_UNIT_COST_H.\"COMPANY_CD\" = ( "
+"    SELECT "
+"      SYS_MY_COMPANY.\"COMPANY_CD\" "
+"    FROM "
+"      SYS_MY_COMPANY "
+"    WHERE "
+"      SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"  ) "
+"  AND M_PUCH_UNIT_COST_H.\"ITEM_CD\" = ? "
+"  AND ROWNUM = 1 "
+"ORDER BY "
+"  M_PUCH_UNIT_COST_H.\"PUCH_PRIORITY_REF_NO\", "
+"  M_PUCH_UNIT_COST_H.\"VEND_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectVEND_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectVEND_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectVEND_CD_read
			if(m_selcmd==null) throw new FoundationException("selectVEND_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectVEND_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectVEND_CD_read2
			if(m_selcmd==null) throw new FoundationException("selectVEND_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectVEND_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectVEND_CD_read3
			if(m_selcmd==null) throw new FoundationException("selectVEND_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectVEND_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getInPLANT_CD());
				if(isNull(data.getInPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getInPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setWS_VEND_CD( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectVEND_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectVEND_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectVEND_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectVEND_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectVEND_CD_clear

			return;
		}

		/**
		 * selectVEND_CDクラスの標準コンストラクタ
		 */
		public selectVEND_CD()
		{
			//{{user_implement_dev:selectVEND_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectVEND_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectHOME_CUR_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_HOME_CUR.\"HOME_CUR_CD\" AS \"HOME_CUR_CD\" "
+"FROM "
+"  SYS_HOME_CUR "
+"WHERE "
+"  SYS_HOME_CUR.\"CTRL_CD\" = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectHOME_CUR_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectHOME_CUR_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectHOME_CUR_CD_read
			if(m_selcmd==null) throw new FoundationException("selectHOME_CUR_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectHOME_CUR_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectHOME_CUR_CD_read2
			if(m_selcmd==null) throw new FoundationException("selectHOME_CUR_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectHOME_CUR_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectHOME_CUR_CD_read3
			if(m_selcmd==null) throw new FoundationException("selectHOME_CUR_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectHOME_CUR_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setHOME_CUR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectHOME_CUR_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectHOME_CUR_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectHOME_CUR_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectHOME_CUR_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectHOME_CUR_CD_clear

			return;
		}

		/**
		 * selectHOME_CUR_CDクラスの標準コンストラクタ
		 */
		public selectHOME_CUR_CD()
		{
			//{{user_implement_dev:selectHOME_CUR_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectHOME_CUR_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PUCH_UNIT_COST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PUCH_UNIT_COST.UNIT_COST_TYP, "
+"  M_PUCH_UNIT_COST.UNIT_COST, "
+"  M_PUCH_UNIT_COST.PROCESSING_COST, "
+"  M_PUCH_UNIT_COST.MATERIAL_COST, "
+"  M_PUCH_UNIT_COST.OTHER_OVERHEADS, "
+"  M_PUCH_UNIT_COST.ITEM_CD, "
+"  M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE, "
+"  M_PUCH_UNIT_COST.PUCH_SIZE "
+"FROM "
+"  M_PUCH_UNIT_COST, "
+"  M_PUCH_UNIT_COST_H "
+"WHERE "
+"  M_PUCH_UNIT_COST.\"VEND_CD\" = ? "
+"  AND M_PUCH_UNIT_COST.\"PLANT_CD\" = ? "
+"  AND M_PUCH_UNIT_COST.ITEM_CD = ? "
+"  AND M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND M_PUCH_UNIT_COST.PUCH_SIZE <= ? "
+"  AND M_PUCH_UNIT_COST.\"COMPANY_CD\" = ( "
+"    SELECT "
+"      SYS_MY_COMPANY.\"COMPANY_CD\" "
+"    FROM "
+"      SYS_MY_COMPANY "
+"    WHERE "
+"      SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"  ) "
+"  AND ROWNUM = 1 "
+"ORDER BY "
+"  M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE DESC, "
+"  M_PUCH_UNIT_COST.PUCH_SIZE DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PUCH_UNIT_COST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PUCH_UNIT_COST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PUCH_UNIT_COST_read
			if(m_selcmd==null) throw new FoundationException("selectM_PUCH_UNIT_COST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PUCH_UNIT_COST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PUCH_UNIT_COST_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PUCH_UNIT_COST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PUCH_UNIT_COST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PUCH_UNIT_COST_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PUCH_UNIT_COST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PUCH_UNIT_COST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_VEND_CD());
				if(isNull(data.getWS_VEND_CD())) isNull = true;
				ary.addElement(data.getInPLANT_CD());
				if(isNull(data.getInPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getPRD_START_DATE());
				if(isNull(data.getPRD_START_DATE())) isNull = true;
				ary.addElement(data.getOPR_INST_PUCH_ODR_QTY());
				if(isNull(data.getOPR_INST_PUCH_ODR_QTY())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWS_VEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getInPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPRD_START_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getOPR_INST_PUCH_ODR_QTY(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setUNIT_COST_TYP( getString(1, rs) );
			data.setUNIT_COST( getString(2, rs) );
			data.setPROCESSING_COST( getString(3, rs) );
			data.setMATERIAL_COST( getString(4, rs) );
			data.setOTHER_OVERHEADS( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setPRD_START_DATE( getString(7, rs) );
			data.setOPR_INST_PUCH_ODR_QTY( getString(8, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PUCH_UNIT_COST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PUCH_UNIT_COST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PUCH_UNIT_COST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PUCH_UNIT_COST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PUCH_UNIT_COST_clear

			return;
		}

		/**
		 * selectM_PUCH_UNIT_COSTクラスの標準コンストラクタ
		 */
		public selectM_PUCH_UNIT_COST()
		{
			//{{user_implement_dev:selectM_PUCH_UNIT_COST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PUCH_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getCOMPANY_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_MY_COMPANY.COMPANY_CD "
+"FROM "
+"  SYS_MY_COMPANY "
+"WHERE "
+"  SYS_MY_COMPANY.CTRL_CD = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getCOMPANY_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getCOMPANY_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCOMPANY_CD_read
			if(m_selcmd==null) throw new FoundationException("getCOMPANY_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCOMPANY_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCOMPANY_CD_read2
			if(m_selcmd==null) throw new FoundationException("getCOMPANY_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getCOMPANY_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCOMPANY_CD_read3
			if(m_selcmd==null) throw new FoundationException("getCOMPANY_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getCOMPANY_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getCOMPANY_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCOMPANY_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCOMPANY_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getCOMPANY_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getCOMPANY_CD_clear

			return;
		}

		/**
		 * getCOMPANY_CDクラスの標準コンストラクタ
		 */
		public getCOMPANY_CD()
		{
			//{{user_implement_dev:getCOMPANY_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getCOMPANY_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getCUR_NAME extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  CUR.CUR_NAME "
+"FROM "
+"  M_VEND_CTRL VEND, "
+"  M_CUR CUR "
+"WHERE "
+"  VEND.COMPANY_CD = ? "
+"  AND VEND.VEND_CD = ? "
+"  AND VEND.CUR_CD = CUR.CUR_CD(+)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getCUR_NAME_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getCUR_NAME_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCUR_NAME_read
			if(m_selcmd==null) throw new FoundationException("getCUR_NAME", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCUR_NAME_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCUR_NAME_read2
			if(m_selcmd==null) throw new FoundationException("getCUR_NAME", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getCUR_NAME_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCUR_NAME_read3
			if(m_selcmd==null) throw new FoundationException("getCUR_NAME", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getCUR_NAME_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getWS_VEND_CD());
				if(isNull(data.getWS_VEND_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getWS_VEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setCUR_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getCUR_NAME", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCUR_NAME_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCUR_NAME_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getCUR_NAME_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getCUR_NAME_clear

			return;
		}

		/**
		 * getCUR_NAMEクラスの標準コンストラクタ
		 */
		public getCUR_NAME()
		{
			//{{user_implement_dev:getCUR_NAME_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getCUR_NAME_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectOUTSIDE_TYP_1_Cnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  T_OD, "
+"  ( "
+"    SELECT "
+"      M_PROC_GRP.\"PLANT_CD\", "
+"      M_PROC_GRP.\"ITEM_CD\", "
+"      M_PROC_GRP.\"PROC_NO\", "
+"      DECODE(M_ITEM.OPR_RSLT_TYP, 1, M_PROC_GRP.\"WS_CD\", NULL) AS \"WS_CD\" "
+"    FROM "
+"      ( "
+"        SELECT "
+"          M_PROC_GRP.\"PLANT_CD\", "
+"          M_PROC_GRP.\"ITEM_CD\", "
+"          MIN(M_PROC_GRP.\"PROC_NO\") AS \"PROC_NO\" "
+"        FROM "
+"          M_PROC_GRP "
+"        WHERE "
+"          M_PROC_GRP.\"OUTSIDE_TYP\" = '1' "
+"        GROUP BY "
+"          M_PROC_GRP.\"PLANT_CD\", "
+"          M_PROC_GRP.\"ITEM_CD\" "
+"      ) M_PROC_GRP1, "
+"      M_PROC_GRP, "
+"      M_ITEM "
+"    WHERE "
+"      M_PROC_GRP.\"PLANT_CD\" = M_PROC_GRP1.\"PLANT_CD\" "
+"      AND M_PROC_GRP.\"ITEM_CD\" = M_PROC_GRP1.\"ITEM_CD\" "
+"      AND M_PROC_GRP.\"PROC_NO\" = M_PROC_GRP1.\"PROC_NO\" "
+"      AND M_PROC_GRP.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  ) M_PROC_GRP2, "
+"  M_ITEM "
+"WHERE "
+"  T_OD.\"OD_TYP\" IN (?, '1') "
+"  AND ((? = 2 AND T_OD.\"ODR_STS_TYP\" IN (?,?,?)) OR ( ? = 3 AND T_OD.\"DM_STS_TYP\" IN (?,?,?))) "
+"  AND T_OD.\"OUTSIDE_TYP\" = '1' "
+"  AND T_OD.\"MRP_TYP\" = '9' "
+"  AND T_OD.\"PLANT_CD\" = ? "
+"  AND T_OD.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP2.\"PLANT_CD\"(+) = T_OD.\"PLANT_CD\" "
+"  AND M_PROC_GRP2.\"ITEM_CD\"(+) = T_OD.\"ITEM_CD\" "
+"  AND M_PROC_GRP2.\"WS_CD\" = ? "
+"  AND TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') <= ? "
+"  AND TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') <= ? "
+"  AND T_OD.\"ITEM_CD\" = M_ITEM.ITEM_CD "
+"  AND M_ITEM.\"PRODUCT_TYP\" = ? "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectOUTSIDE_TYP_1_Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectOUTSIDE_TYP_1_Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_1_Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_1_Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_1_Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInC1_ODR_STS_TYP());
				if(isNull(data.getInC1_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_ODR_STS_TYP());
				if(isNull(data.getInC2_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_ODR_STS_TYP());
				if(isNull(data.getInC3_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInC1_ODR_STS_TYP());
				if(isNull(data.getInC1_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_ODR_STS_TYP());
				if(isNull(data.getInC2_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_ODR_STS_TYP());
				if(isNull(data.getInC3_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInPLANT_CD());
				if(isNull(data.getInPLANT_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_WS_CD());
				if(isNull(data.getIN_WS_CD())) isNull = true;
				ary.addElement(data.getIN_PRD_START_DATE_FROM());
				if(isNull(data.getIN_PRD_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getIN_PRD_START_DATE_TO());
				if(isNull(data.getIN_PRD_START_DATE_TO())) isNull = true;
				ary.addElement(data.getIN_PRD_DUE_DATE_FROM());
				if(isNull(data.getIN_PRD_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getIN_PRD_DUE_DATE_TO());
				if(isNull(data.getIN_PRD_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getPRODUCT_TYP());
				if(isNull(data.getPRODUCT_TYP())) isNull = true;
				ary.addElement(data.getROW_COUNT_1());
				if(isNull(data.getROW_COUNT_1())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectOUTSIDE_TYP_1_Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_ODR_STS_TYP())) setString(no ++, data.getInC1_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_ODR_STS_TYP())) setString(no ++, data.getInC2_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_ODR_STS_TYP())) setString(no ++, data.getInC3_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_ODR_STS_TYP())) setString(no ++, data.getInC1_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_ODR_STS_TYP())) setString(no ++, data.getInC2_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_ODR_STS_TYP())) setString(no ++, data.getInC3_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInPLANT_CD())) setString(no ++, data.getInPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WS_CD())) setString(no ++, data.getIN_WS_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_START_DATE_FROM())) setString(no ++, data.getIN_PRD_START_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_START_DATE_TO())) setString(no ++, data.getIN_PRD_START_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_DUE_DATE_FROM())) setString(no ++, data.getIN_PRD_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_DUE_DATE_TO())) setString(no ++, data.getIN_PRD_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPRODUCT_TYP())) setString(no ++, data.getPRODUCT_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT_1())) setString(no ++, data.getROW_COUNT_1(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setl_COUNT_1( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_1_Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectOUTSIDE_TYP_1_Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_Cnt_clear

			return;
		}

		/**
		 * selectOUTSIDE_TYP_1_Cntクラスの標準コンストラクタ
		 */
		public selectOUTSIDE_TYP_1_Cnt()
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_1_Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectOUTSIDE_TYP_1_Cnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectOUTSIDE_TYP_2_Cnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  T_OD, "
+"  M_ITEM "
+"WHERE "
+"  T_OD.\"OD_TYP\" IN (?, '1') "
+"  AND ((? = 2 AND T_OD.\"ODR_STS_TYP\" IN (?,?,?)) OR ( ? = 3 AND T_OD.\"DM_STS_TYP\" IN (?,?,?))) "
+"  AND T_OD.\"PLANT_CD\" = ? "
+"  AND T_OD.\"ITEM_CD\" = ? "
+"  AND TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') <= ? "
+"  AND TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') <= ? "
+"  AND T_OD.\"ITEM_CD\" = M_ITEM.ITEM_CD(+) "
+"  AND M_ITEM.\"PRODUCT_TYP\" = ? "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectOUTSIDE_TYP_2_Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectOUTSIDE_TYP_2_Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0160010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0160010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_2_Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_2_Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0160010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_2_Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0160010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInC1_ODR_STS_TYP());
				if(isNull(data.getInC1_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_ODR_STS_TYP());
				if(isNull(data.getInC2_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_ODR_STS_TYP());
				if(isNull(data.getInC3_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInR1_OD_TYP());
				if(isNull(data.getInR1_OD_TYP())) isNull = true;
				ary.addElement(data.getInC1_ODR_STS_TYP());
				if(isNull(data.getInC1_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_ODR_STS_TYP());
				if(isNull(data.getInC2_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_ODR_STS_TYP());
				if(isNull(data.getInC3_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInPLANT_CD());
				if(isNull(data.getInPLANT_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_PRD_START_DATE_FROM());
				if(isNull(data.getIN_PRD_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getIN_PRD_START_DATE_TO());
				if(isNull(data.getIN_PRD_START_DATE_TO())) isNull = true;
				ary.addElement(data.getIN_PRD_DUE_DATE_FROM());
				if(isNull(data.getIN_PRD_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getIN_PRD_DUE_DATE_TO());
				if(isNull(data.getIN_PRD_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getPRODUCT_TYP());
				if(isNull(data.getPRODUCT_TYP())) isNull = true;
				ary.addElement(data.getROW_COUNT_2());
				if(isNull(data.getROW_COUNT_2())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectOUTSIDE_TYP_2_Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_ODR_STS_TYP())) setString(no ++, data.getInC1_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_ODR_STS_TYP())) setString(no ++, data.getInC2_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_ODR_STS_TYP())) setString(no ++, data.getInC3_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInR1_OD_TYP())) setString(no ++, data.getInR1_OD_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_ODR_STS_TYP())) setString(no ++, data.getInC1_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_ODR_STS_TYP())) setString(no ++, data.getInC2_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_ODR_STS_TYP())) setString(no ++, data.getInC3_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInPLANT_CD())) setString(no ++, data.getInPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_START_DATE_FROM())) setString(no ++, data.getIN_PRD_START_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_START_DATE_TO())) setString(no ++, data.getIN_PRD_START_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_DUE_DATE_FROM())) setString(no ++, data.getIN_PRD_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PRD_DUE_DATE_TO())) setString(no ++, data.getIN_PRD_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPRODUCT_TYP())) setString(no ++, data.getPRODUCT_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT_2())) setString(no ++, data.getROW_COUNT_2(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0160010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0160010Struct data = new AC0160010Struct();

			data.setl_COUNT_2( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectOUTSIDE_TYP_2_Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0160010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0160010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0160010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectOUTSIDE_TYP_2_Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_Cnt_clear

			return;
		}

		/**
		 * selectOUTSIDE_TYP_2_Cntクラスの標準コンストラクタ
		 */
		public selectOUTSIDE_TYP_2_Cnt()
		{
			//{{user_implement_dev:selectOUTSIDE_TYP_2_Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectOUTSIDE_TYP_2_Cnt_constractor

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
		mselectM_ITEM.clear();
		mselectM_ITEM = null;
		mselectM_WS.clear();
		mselectM_WS = null;
		mselectOUTSIDE_TYP_1.clear();
		mselectOUTSIDE_TYP_1 = null;
		mselectOUTSIDE_TYP_2.clear();
		mselectOUTSIDE_TYP_2 = null;
		mselectROUND_TYP.clear();
		mselectROUND_TYP = null;
		mselectEXCH_RATE.clear();
		mselectEXCH_RATE = null;
		mselectVEND_CD.clear();
		mselectVEND_CD = null;
		mselectHOME_CUR_CD.clear();
		mselectHOME_CUR_CD = null;
		mselectM_PUCH_UNIT_COST.clear();
		mselectM_PUCH_UNIT_COST = null;
		mgetCOMPANY_CD.clear();
		mgetCOMPANY_CD = null;
		mgetCUR_NAME.clear();
		mgetCUR_NAME = null;
		mselectOUTSIDE_TYP_1_Cnt.clear();
		mselectOUTSIDE_TYP_1_Cnt = null;
		mselectOUTSIDE_TYP_2_Cnt.clear();
		mselectOUTSIDE_TYP_2_Cnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AC0160010クラスの標準コンストラクタ
	 */
	public AC0160010Entity() throws FoundationException
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
