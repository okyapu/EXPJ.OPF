/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0140/src/com/nec/jp/orteus/metamorBase/AE0140/AE0140010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0140;

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
 * CLASS     : AE0140010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AE0140010Entity extends DataObject
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

	// M_PLANTクラス インスタンス
	public M_PLANT mM_PLANT = new M_PLANT();

	// M_VEND_CTRLクラス インスタンス
	public M_VEND_CTRL mM_VEND_CTRL = new M_VEND_CTRL();

	// M_ITEMクラス インスタンス
	public M_ITEM mM_ITEM = new M_ITEM();

	// M_WHクラス インスタンス
	public M_WH mM_WH = new M_WH();

	// SelectAllInspcクラス インスタンス
	public SelectAllInspc mSelectAllInspc = new SelectAllInspc();

	// SelectNonInspcクラス インスタンス
	public SelectNonInspc mSelectNonInspc = new SelectNonInspc();

	// SelectDurInspcクラス インスタンス
	public SelectDurInspc mSelectDurInspc = new SelectDurInspc();

	// SelectCmpInspcクラス インスタンス
	public SelectCmpInspc mSelectCmpInspc = new SelectCmpInspc();

	// SelectDurInspcCntクラス インスタンス
	public SelectDurInspcCnt mSelectDurInspcCnt = new SelectDurInspcCnt();

	// SelectCmpInspcCntクラス インスタンス
	public SelectCmpInspcCnt mSelectCmpInspcCnt = new SelectCmpInspcCnt();


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
		String m_write_fname="AE0140010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AE0140010";

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
	public class M_PLANT extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PLANT.\"PLANT_NAME\" as \"PLANT_NAME\" "
+"from "
+"  M_PLANT "
+"where "
+"  M_PLANT.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_PLANT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_PLANT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_read
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_PLANT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_read2
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_PLANT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_read3
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_PLANT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_PLANT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_PLANT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_PLANT_clear

			return;
		}

		/**
		 * M_PLANTクラスの標準コンストラクタ
		 */
		public M_PLANT()
		{
			//{{user_implement_dev:M_PLANT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_PLANT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_VEND_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_VEND_CTRL.\"VEND_ANAME\" as \"VEND_NAME\" "
+"from "
+"  M_VEND_CTRL, "
+"  SYS_MY_COMPANY "
+"where "
+"  M_VEND_CTRL.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
+"  and SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"  and M_VEND_CTRL.\"VEND_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_VEND_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_VEND_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_VEND_CTRL_read
			if(m_selcmd==null) throw new FoundationException("M_VEND_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_VEND_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_VEND_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("M_VEND_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_VEND_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_VEND_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("M_VEND_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_VEND_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setVEND_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_VEND_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_VEND_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_VEND_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_VEND_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_VEND_CTRL_clear

			return;
		}

		/**
		 * M_VEND_CTRLクラスの標準コンストラクタ
		 */
		public M_VEND_CTRL()
		{
			//{{user_implement_dev:M_VEND_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_VEND_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
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

		//{{user_implement_dev:M_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_ITEM_clear

			return;
		}

		/**
		 * M_ITEMクラスの標準コンストラクタ
		 */
		public M_ITEM()
		{
			//{{user_implement_dev:M_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_WH extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_WH.\"WH_NAME\" AS \"WH_NAME\", "
+"  M_WH.\"PLANT_CD\" AS \"PLANT_CD\" "
+"FROM "
+"  M_WH "
+"WHERE "
+"  M_WH.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_WH_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_WH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_WH_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read2
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_WH_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read3
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_WH_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setWH_NAME( getString(1, rs) );
			data.setPLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_WH", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_WH_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_WH_clear

			return;
		}

		/**
		 * M_WHクラスの標準コンストラクタ
		 */
		public M_WH()
		{
			//{{user_implement_dev:M_WH_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_WH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectAllInspc extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  IR.INSPECTED_QTY AS INSPECTED_QTY, "
+"  IR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"  IR.INSPECTED_QTY - IR.ACCEPTED_QTY AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE,'YYYY/MM/DD') AS ACPT_DATE, "
+"  TO_CHAR(IR.INSPEC_DATE,'YYYY/MM/DD') AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  IR.WH_CD AS WH_CD, "
+"  IR.WH_NAME AS WH_NAME, "
+"  IR.LOT_NO AS LOT_NO, "
+"  IR.VEND_LOT_NO AS VEND_LOT_NO, "
+"  IR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"  IR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND ROWNUM <= TO_NUMBER(?) + 1 "
+"UNION "
+"SELECT "
+"    AR.PLANT_CD                        AS PLANT_CD "
+"   ,AR.PUCH_ODR_CD                     AS PUCH_ODR_CD "
+"   ,AR.ACPT_NO                         AS ACPT_NO "
+"   ,PO.VEND_CD                         AS VEND_CD "
+"   ,PO.VEND_ANAME                      AS VEND_ANAME "
+"   ,PO.ITEM_CD                         AS ITEM_CD "
+"   ,PO.ITEM_NAME                       AS ITEM_NAME "
+"   ,OD.JOB_ODR_CD                      AS JOB_ODR_CD "
+"   ,AR.ACPT_QTY                        AS ACPT_QTY "
+"   ,0                                  AS INSPECTED_QTY "
+"   ,0                                  AS ACCEPTED_QTY "
+"   ,0                                  AS REJECTED_GOODS_QTY "
+"   ,TO_CHAR(AR.ACPT_DATE,'YYYY/MM/DD') AS ACPT_DATE "
+"   ,NULL                               AS INSPEC_DATE "
+"   ,AR.ACPT_STS_TYP                    AS ACPT_STS_TYP "
+"   ,NULL                               AS WH_CD "
+"   ,NULL                               AS WH_NAME "
+"   ,NULL                               AS LOT_NO "
+"   ,NULL                               AS VEND_LOT_NO "
+"   ,0                                  AS INSPC_CRCT_NO "
+"   ,NULL                               AS INSPEC_RSLT_COMMENT "
+"FROM "
+"    T_ACPT_RSLT     AR "
+"   ,(SELECT "
+"         RPO.PUCH_ODR_CD AS PUCH_ODR_CD "
+"        ,RPO.ITEM_CD     AS ITEM_CD "
+"        ,RPO.VEND_CD     AS VEND_CD "
+"        ,RPO.OD_NO       AS OD_NO "
+"        ,MI.ITEM_NAME    AS ITEM_NAME "
+"        ,MVC.VEND_ANAME  AS VEND_ANAME "
+"     FROM "
+"         T_RLSD_PUCH_ODR RPO "
+"        ,M_VEND_CTRL     MVC "
+"        ,M_ITEM          MI "
+"     WHERE "
+"         RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"     AND RPO.ACPT_INSPC_TYP          = 2 "
+"     AND RPO.COMPANY_CD              = MVC.COMPANY_CD(+) "
+"     AND RPO.VEND_CD                 = MVC.VEND_CD(+) "
+"     AND RPO.ITEM_CD                 = MI.ITEM_CD(+) "
+"    ) PO "
+"   ,T_OD            OD "
+"WHERE "
+"    AR.PLANT_CD                   = ? "
+"AND AR.ACPT_DATE                 >= TO_DATE(?,'YYYY/MM/DD') "
+"AND AR.ACPT_DATE                 <= TO_DATE(?,'YYYY/MM/DD') "
+"AND AR.PUCH_ODR_CD                = PO.PUCH_ODR_CD "
+"AND PO.OD_NO                      = OD.OD_NO "
+"AND OD.JOB_ODR_CD              LIKE ? "
+"AND PO.VEND_CD                    = ? "
+"AND PO.ITEM_CD                    = ? "
+"AND AR.ACPT_STS_TYP               = 1 "
+"AND NOT EXISTS(SELECT "
+"                   1 "
+"               FROM "
+"                   T_INSPC_RSLT TIR "
+"               WHERE "
+"                   AR.PUCH_ODR_CD = TIR.PUCH_ODR_CD "
+"               AND AR.ACPT_NO     = TIR.ACPT_NO "
+"              ) "
+"AND ROWNUM <= TO_NUMBER(?) + 1 "
+"ORDER BY "
+"    PLANT_CD    ASC "
+"   ,PUCH_ODR_CD ASC "
+"   ,ACPT_NO     ASC "
+"   ,VEND_CD     ASC "
+"   ,ITEM_CD     ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectAllInspc_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectAllInspc_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectAllInspc_read
			if(m_selcmd==null) throw new FoundationException("SelectAllInspc", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectAllInspc_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectAllInspc_read2
			if(m_selcmd==null) throw new FoundationException("SelectAllInspc", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectAllInspc_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectAllInspc_read3
			if(m_selcmd==null) throw new FoundationException("SelectAllInspc", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectAllInspc_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectAllInspc", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_ACPT_NO( getString(3, rs) );
			data.setl_VEND_CD( getString(4, rs) );
			data.setl_VEND_ANAME( getString(5, rs) );
			data.setl_ITEM_CD( getString(6, rs) );
			data.setl_ITEM_NAME( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_ACPT_QTY( getString(9, rs) );
			data.setl_INSPECTED_QTY( getString(10, rs) );
			data.setl_ACCEPTED_QTY( getString(11, rs) );
			data.setl_REJECTED_GOODS_QTY( getString(12, rs) );
			data.setl_ACPT_DATE( getString(13, rs) );
			data.setl_INSPEC_DATE( getString(14, rs) );
			data.setl_ACPT_STS_TYP_DN( getString(15, rs) );
			data.setl_WH_CD( getString(16, rs) );
			data.setl_WH_NAME( getString(17, rs) );
			data.setl_LOT_NO( getString(18, rs) );
			data.setl_VEND_LOT_NO( getString(19, rs) );
			data.setl_INSPC_CRCT_NO( getString(20, rs) );
			data.setl_INSPEC_RSLT_COMMENT( getString(21, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectAllInspc", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectAllInspc_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectAllInspc_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectAllInspc_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectAllInspc_clear

			return;
		}

		/**
		 * SelectAllInspcクラスの標準コンストラクタ
		 */
		public SelectAllInspc()
		{
			//{{user_implement_dev:SelectAllInspc_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectAllInspc_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectNonInspc extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  IR.INSPECTED_QTY AS INSPECTED_QTY, "
+"  IR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"  IR.INSPECTED_QTY - IR.ACCEPTED_QTY AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE, 'YYYY/MM/DD') AS ACPT_DATE, "
+"  TO_CHAR(IR.INSPEC_DATE, 'YYYY/MM/DD') AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  IR.WH_CD AS WH_CD, "
+"  IR.WH_NAME AS WH_NAME, "
+"  IR.LOT_NO AS LOT_NO, "
+"  IR.VEND_LOT_NO AS VEND_LOT_NO, "
+"  IR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"  IR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"      AND TIR.INSPECTED_QTY = 0 "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 1 "
+"  AND ROWNUM <= TO_NUMBER(?) + 1 "
+"UNION "
+"SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  0 AS INSPECTED_QTY, "
+"  0 AS ACCEPTED_QTY, "
+"  0 AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE, 'YYYY/MM/DD') AS ACPT_DATE, "
+"  NULL AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  NULL AS LOT_NO, "
+"  NULL AS VEND_LOT_NO, "
+"  0 AS INSPC_CRCT_NO, "
+"  NULL AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.ACPT_STS_TYP = 1 "
+"  AND NOT EXISTS( "
+"    SELECT "
+"      1 "
+"    FROM "
+"      T_INSPC_RSLT TIR "
+"    WHERE "
+"      AR.PUCH_ODR_CD = TIR.PUCH_ODR_CD "
+"      AND AR.ACPT_NO = TIR.ACPT_NO "
+"  ) "
+"  AND ROWNUM <= TO_NUMBER(?) + 1 "
+"ORDER BY "
+"    PLANT_CD    ASC "
+"   ,PUCH_ODR_CD ASC "
+"   ,ACPT_NO     ASC "
+"   ,VEND_CD     ASC "
+"   ,ITEM_CD     ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNonInspc_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectNonInspc_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNonInspc_read
			if(m_selcmd==null) throw new FoundationException("SelectNonInspc", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectNonInspc_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNonInspc_read2
			if(m_selcmd==null) throw new FoundationException("SelectNonInspc", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNonInspc_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNonInspc_read3
			if(m_selcmd==null) throw new FoundationException("SelectNonInspc", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNonInspc_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectNonInspc", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_ACPT_NO( getString(3, rs) );
			data.setl_VEND_CD( getString(4, rs) );
			data.setl_VEND_ANAME( getString(5, rs) );
			data.setl_ITEM_CD( getString(6, rs) );
			data.setl_ITEM_NAME( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_ACPT_QTY( getString(9, rs) );
			data.setl_INSPECTED_QTY( getString(10, rs) );
			data.setl_ACCEPTED_QTY( getString(11, rs) );
			data.setl_REJECTED_GOODS_QTY( getString(12, rs) );
			data.setl_ACPT_DATE( getString(13, rs) );
			data.setl_INSPEC_DATE( getString(14, rs) );
			data.setl_ACPT_STS_TYP_DN( getString(15, rs) );
			data.setl_WH_CD( getString(16, rs) );
			data.setl_WH_NAME( getString(17, rs) );
			data.setl_LOT_NO( getString(18, rs) );
			data.setl_VEND_LOT_NO( getString(19, rs) );
			data.setl_INSPC_CRCT_NO( getString(20, rs) );
			data.setl_INSPEC_RSLT_COMMENT( getString(21, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNonInspc", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNonInspc_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectNonInspc_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNonInspc_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectNonInspc_clear

			return;
		}

		/**
		 * SelectNonInspcクラスの標準コンストラクタ
		 */
		public SelectNonInspc()
		{
			//{{user_implement_dev:SelectNonInspc_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectNonInspc_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectDurInspc extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  IR.INSPECTED_QTY AS INSPECTED_QTY, "
+"  IR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"  IR.INSPECTED_QTY - IR.ACCEPTED_QTY AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE,'YYYY/MM/DD') AS ACPT_DATE, "
+"  TO_CHAR(IR.INSPEC_DATE,'YYYY/MM/DD') AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  IR.WH_CD AS WH_CD, "
+"  IR.WH_NAME AS WH_NAME, "
+"  IR.LOT_NO AS LOT_NO, "
+"  IR.VEND_LOT_NO AS VEND_LOT_NO, "
+"  IR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"  IR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"      AND TIR.INSPECTED_QTY > 0 "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 1 "
+"ORDER BY "
+"  AR.PLANT_CD ASC, "
+"  AR.PUCH_ODR_CD ASC, "
+"  AR.ACPT_NO ASC, "
+"  PO.VEND_CD ASC, "
+"  PO.ITEM_CD ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDurInspc_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectDurInspc_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspc_read
			if(m_selcmd==null) throw new FoundationException("SelectDurInspc", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDurInspc_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspc_read2
			if(m_selcmd==null) throw new FoundationException("SelectDurInspc", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDurInspc_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspc_read3
			if(m_selcmd==null) throw new FoundationException("SelectDurInspc", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDurInspc_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectDurInspc", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_ACPT_NO( getString(3, rs) );
			data.setl_VEND_CD( getString(4, rs) );
			data.setl_VEND_ANAME( getString(5, rs) );
			data.setl_ITEM_CD( getString(6, rs) );
			data.setl_ITEM_NAME( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_ACPT_QTY( getString(9, rs) );
			data.setl_INSPECTED_QTY( getString(10, rs) );
			data.setl_ACCEPTED_QTY( getString(11, rs) );
			data.setl_REJECTED_GOODS_QTY( getString(12, rs) );
			data.setl_ACPT_DATE( getString(13, rs) );
			data.setl_INSPEC_DATE( getString(14, rs) );
			data.setl_ACPT_STS_TYP_DN( getString(15, rs) );
			data.setl_WH_CD( getString(16, rs) );
			data.setl_WH_NAME( getString(17, rs) );
			data.setl_LOT_NO( getString(18, rs) );
			data.setl_VEND_LOT_NO( getString(19, rs) );
			data.setl_INSPC_CRCT_NO( getString(20, rs) );
			data.setl_INSPEC_RSLT_COMMENT( getString(21, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDurInspc", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspc_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDurInspc_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDurInspc_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectDurInspc_clear

			return;
		}

		/**
		 * SelectDurInspcクラスの標準コンストラクタ
		 */
		public SelectDurInspc()
		{
			//{{user_implement_dev:SelectDurInspc_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectDurInspc_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectCmpInspc extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  IR.INSPECTED_QTY AS INSPECTED_QTY, "
+"  IR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"  IR.INSPECTED_QTY - IR.ACCEPTED_QTY AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE,'YYYY/MM/DD') AS ACPT_DATE, "
+"  TO_CHAR(IR.INSPEC_DATE,'YYYY/MM/DD') AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  IR.WH_CD AS WH_CD, "
+"  IR.WH_NAME AS WH_NAME, "
+"  IR.LOT_NO AS LOT_NO, "
+"  IR.VEND_LOT_NO AS VEND_LOT_NO, "
+"  IR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"  IR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 2 "
+"ORDER BY "
+"  AR.PLANT_CD ASC, "
+"  AR.PUCH_ODR_CD ASC, "
+"  AR.ACPT_NO ASC, "
+"  PO.VEND_CD ASC, "
+"  PO.ITEM_CD ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCmpInspc_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectCmpInspc_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspc_read
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspc", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCmpInspc_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspc_read2
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspc", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectCmpInspc_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspc_read3
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspc", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectCmpInspc_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCmpInspc", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_ACPT_NO( getString(3, rs) );
			data.setl_VEND_CD( getString(4, rs) );
			data.setl_VEND_ANAME( getString(5, rs) );
			data.setl_ITEM_CD( getString(6, rs) );
			data.setl_ITEM_NAME( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_ACPT_QTY( getString(9, rs) );
			data.setl_INSPECTED_QTY( getString(10, rs) );
			data.setl_ACCEPTED_QTY( getString(11, rs) );
			data.setl_REJECTED_GOODS_QTY( getString(12, rs) );
			data.setl_ACPT_DATE( getString(13, rs) );
			data.setl_INSPEC_DATE( getString(14, rs) );
			data.setl_ACPT_STS_TYP_DN( getString(15, rs) );
			data.setl_WH_CD( getString(16, rs) );
			data.setl_WH_NAME( getString(17, rs) );
			data.setl_LOT_NO( getString(18, rs) );
			data.setl_VEND_LOT_NO( getString(19, rs) );
			data.setl_INSPC_CRCT_NO( getString(20, rs) );
			data.setl_INSPEC_RSLT_COMMENT( getString(21, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspc", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspc_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCmpInspc_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectCmpInspc_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectCmpInspc_clear

			return;
		}

		/**
		 * SelectCmpInspcクラスの標準コンストラクタ
		 */
		public SelectCmpInspc()
		{
			//{{user_implement_dev:SelectCmpInspc_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectCmpInspc_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectDurInspcCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"      AND TIR.INSPECTED_QTY > 0 "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 1 "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDurInspcCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectDurInspcCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspcCnt_read
			if(m_selcmd==null) throw new FoundationException("SelectDurInspcCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDurInspcCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspcCnt_read2
			if(m_selcmd==null) throw new FoundationException("SelectDurInspcCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDurInspcCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspcCnt_read3
			if(m_selcmd==null) throw new FoundationException("SelectDurInspcCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDurInspcCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectDurInspcCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDurInspcCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspcCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDurInspcCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDurInspcCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectDurInspcCnt_clear

			return;
		}

		/**
		 * SelectDurInspcCntクラスの標準コンストラクタ
		 */
		public SelectDurInspcCnt()
		{
			//{{user_implement_dev:SelectDurInspcCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectDurInspcCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectCmpInspcCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 2 "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCmpInspcCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectCmpInspcCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspcCnt_read
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspcCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCmpInspcCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspcCnt_read2
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspcCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectCmpInspcCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspcCnt_read3
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspcCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectCmpInspcCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCmpInspcCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspcCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspcCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCmpInspcCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectCmpInspcCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectCmpInspcCnt_clear

			return;
		}

		/**
		 * SelectCmpInspcCntクラスの標準コンストラクタ
		 */
		public SelectCmpInspcCnt()
		{
			//{{user_implement_dev:SelectCmpInspcCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectCmpInspcCnt_constractor

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
		mM_PLANT.clear();
		mM_PLANT = null;
		mM_VEND_CTRL.clear();
		mM_VEND_CTRL = null;
		mM_ITEM.clear();
		mM_ITEM = null;
		mM_WH.clear();
		mM_WH = null;
		mSelectAllInspc.clear();
		mSelectAllInspc = null;
		mSelectNonInspc.clear();
		mSelectNonInspc = null;
		mSelectDurInspc.clear();
		mSelectDurInspc = null;
		mSelectCmpInspc.clear();
		mSelectCmpInspc = null;
		mSelectDurInspcCnt.clear();
		mSelectDurInspcCnt = null;
		mSelectCmpInspcCnt.clear();
		mSelectCmpInspcCnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AE0140010クラスの標準コンストラクタ
	 */
	public AE0140010Entity() throws FoundationException
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
