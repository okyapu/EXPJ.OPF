/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0110/src/com/nec/jp/orteus/metamorBase/AC0110/AC0110010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0110;

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

public class AC0110010Entity extends DataObject
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

	// readM_ITEMクラス インスタンス
	public readM_ITEM mreadM_ITEM = new readM_ITEM();

	// readT_JOB_ODRクラス インスタンス
	public readT_JOB_ODR mreadT_JOB_ODR = new readT_JOB_ODR();

	// readT_JOB_ODR_PLANTクラス インスタンス
	public readT_JOB_ODR_PLANT mreadT_JOB_ODR_PLANT = new readT_JOB_ODR_PLANT();

	// readT_JOB_ODR_ALCクラス インスタンス
	public readT_JOB_ODR_ALC mreadT_JOB_ODR_ALC = new readT_JOB_ODR_ALC();

	// ViewRクラス インスタンス
	public ViewR mViewR = new ViewR();

	// ViewEクラス インスタンス
	public ViewE mViewE = new ViewE();

	// ViewR_ALCクラス インスタンス
	public ViewR_ALC mViewR_ALC = new ViewR_ALC();

	// ViewE_ALCクラス インスタンス
	public ViewE_ALC mViewE_ALC = new ViewE_ALC();

	// SELECT_TIME_CTRLクラス インスタンス
	public SELECT_TIME_CTRL mSELECT_TIME_CTRL = new SELECT_TIME_CTRL();

	// ViewRCntクラス インスタンス
	public ViewRCnt mViewRCnt = new ViewRCnt();

	// ViewR_ALCCntクラス インスタンス
	public ViewR_ALCCnt mViewR_ALCCnt = new ViewR_ALCCnt();

	// ViewECntクラス インスタンス
	public ViewECnt mViewECnt = new ViewECnt();

	// ViewE_ALCCntクラス インスタンス
	public ViewE_ALCCnt mViewE_ALCCnt = new ViewE_ALCCnt();


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
		String m_write_fname="AC0110010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AC0110010";

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
	public class readM_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\" "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readM_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readM_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_ITEM_read
			if(m_selcmd==null) throw new FoundationException("readM_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("readM_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readM_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("readM_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readM_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readM_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_ITEM_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readM_ITEM", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readM_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readM_ITEM_clear

			return;
		}

		/**
		 * readM_ITEMクラスの標準コンストラクタ
		 */
		public readM_ITEM()
		{
			//{{user_implement_dev:readM_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readM_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_JOB_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR.JOB_ODR_CD "
+"from "
+"  T_JOB_ODR "
+"where "
+"  T_JOB_ODR.JOB_ODR_CD = ? "
+"  and T_JOB_ODR.JOB_ODR_CANCEL_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_JOB_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_JOB_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_read
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_read2
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_JOB_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_read3
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_JOB_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("readT_JOB_ODR", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setreadJOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_JOB_ODR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_JOB_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_clear

			return;
		}

		/**
		 * readT_JOB_ODRクラスの標準コンストラクタ
		 */
		public readT_JOB_ODR()
		{
			//{{user_implement_dev:readT_JOB_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_JOB_ODR_PLANT extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR.JOB_ODR_CD "
+"from "
+"  T_JOB_ODR "
+"where "
+"  T_JOB_ODR.JOB_ODR_CD = ? "
+"  and T_JOB_ODR.PLANT_CD <> ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_JOB_ODR_PLANT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_JOB_ODR_PLANT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_read
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_PLANT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_read2
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_PLANT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_read3
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_PLANT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getsetPLANT_CD());
				if(isNull(data.getsetPLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setreadJOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_PLANT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_JOB_ODR_PLANT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_JOB_ODR_PLANT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_clear

			return;
		}

		/**
		 * readT_JOB_ODR_PLANTクラスの標準コンストラクタ
		 */
		public readT_JOB_ODR_PLANT()
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_JOB_ODR_ALC extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR.JOB_ODR_CD "
+"from "
+"  T_JOB_ODR "
+"where "
+"  T_JOB_ODR.ALC_GRP_CD = ? "
+"  and T_JOB_ODR.JOB_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_JOB_ODR_ALC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_JOB_ODR_ALC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_read
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_ALC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_ALC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_read2
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_JOB_ODR_ALC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_read3
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_JOB_ODR_ALC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getALC_GRP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setJOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_ALC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_JOB_ODR_ALC", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_ALC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_JOB_ODR_ALC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_ALC_clear

			return;
		}

		/**
		 * readT_JOB_ODR_ALCクラスの標準コンストラクタ
		 */
		public readT_JOB_ODR_ALC()
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_ALC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_OD.\"DM_QTY\" as \"DM_QTY\", "
+"  to_char(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0),'fm99999999999990.0099') as \"ODR_QTY\", "
+" "
+"  to_char(T_OD.DM_QTY - abs(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0)),'fm99999999999990.0099') as \"ALCD_QTY\", "
+" "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\", 'fm99999999999990.0099') as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  FncGetFormattedDatetime(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  T1.\"DISPLAY_NAME\" as \"DM_STS_TYP\", "
+"  T2.\"DISPLAY_NAME\" as \"OD_TYP\", "
+"  T3.\"DISPLAY_NAME\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 or  T_OD.MRP_ODR_TYP = 2) "
+"  and (T_OD.OD_TYP = 1 or  T_OD.OD_TYP = 3) "
+"  and ((T_OD.DM_STS_TYP <> 9 and  "
+"       T_OD.DM_QTY > "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"              CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"              ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"       + NVL(S1.STOCK_ON_HAND_QTY,0)  "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0)) "
+"  or   (T_OD.DM_STS_TYP = 9 and  "
+"       T_OD.TOTAL_ISSUE_QTY > "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"             CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"             ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100)))) "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and ((T_OD.DUE_DATE >= to_date(?,'YYYY/MM/DD HH24:MI') "
+"    and T_OD.DUE_DATE <= to_date(?,'YYYY/MM/DD HH24:MI')) "
+"    or (T_OD.DUE_DATE =  to_date(?,'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and T_JOB_ODR.ALC_GRP_CD = ? "
+"  and (T_OD.DM_STS_TYP = ? or T_OD.DM_STS_TYP = ? or T_OD.DM_STS_TYP = ?) "
+"order by "
+"  T_OD.JOB_ODR_CD, "
+"  T_OD.JOB_ODR_CANCEL_NO, "
+"  T_OD.ALC_GRP_CD, "
+"  T_OD.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_read
			if(m_selcmd==null) throw new FoundationException("ViewR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_read2
			if(m_selcmd==null) throw new FoundationException("ViewR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_read3
			if(m_selcmd==null) throw new FoundationException("ViewR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewR", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getALC_GRP_CD())) setString(no ++, data.getALC_GRP_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ALC_GRP_CD( getString(3, rs) );
			data.setl_ITEM_CD( getString(4, rs) );
			data.setl_ITEM_NAME( getString(5, rs) );
			data.setl_DM_QTY( getString(6, rs) );
			data.setl_ALC_ALCD_QTY( getString(7, rs) );
			data.setl_ALCDLE_QTY( getString(8, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(9, rs) );
			data.setl_STOCK_UNIT( getString(10, rs) );
			data.setl_DUE_DATE( getString(11, rs) );
			data.setl_DM_STS_TYP( getString(12, rs) );
			data.setl_OD_TYP( getString(13, rs) );
			data.setl_MRP_ODR_TYP( getString(14, rs) );
			data.setl_OD_NO( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("ViewR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewR_clear

			return;
		}

		/**
		 * ViewRクラスの標準コンストラクタ
		 */
		public ViewR()
		{
			//{{user_implement_dev:ViewR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewE extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_OD.\"DM_QTY\" as \"DM_QTY\", "
+" "
+"  to_char(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0),'fm99999999999990.0099') as \"ODR_QTY\", "
+" "
+"  to_char(T_OD.DM_QTY - abs(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0)),'fm99999999999990.0099') as \"ALCD_QTY\", "
+" "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\", 'fm99999999999990.0099') as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  FncGetFormattedDatetime(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  T1.\"DISPLAY_NAME\" as \"DM_STS_TYP\", "
+"  T2.\"DISPLAY_NAME\" as \"OD_TYP\", "
+"  T3.\"DISPLAY_NAME\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY <  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"              CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"              ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"       + NVL(S1.STOCK_ON_HAND_QTY,0)  "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY <  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"             CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"             ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100)))) "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and ((T_OD.DUE_DATE >= to_date(?,'YYYY/MM/DD HH24:MI') "
+"    and T_OD.DUE_DATE <= to_date(?,'YYYY/MM/DD HH24:MI')) "
+"    or (T_OD.DUE_DATE  = to_date(?,'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and T_JOB_ODR.ALC_GRP_CD = ? "
+"  and(T_OD.DM_STS_TYP = ? or  T_OD.DM_STS_TYP = ? or  T_OD.DM_STS_TYP = ?) "
+"order by "
+"  T_OD.JOB_ODR_CD, "
+"  T_OD.JOB_ODR_CANCEL_NO, "
+"  T_OD.ALC_GRP_CD, "
+"  T_OD.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_read
			if(m_selcmd==null) throw new FoundationException("ViewE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_read2
			if(m_selcmd==null) throw new FoundationException("ViewE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_read3
			if(m_selcmd==null) throw new FoundationException("ViewE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewE", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getALC_GRP_CD())) setString(no ++, data.getALC_GRP_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ALC_GRP_CD( getString(3, rs) );
			data.setl_ITEM_CD( getString(4, rs) );
			data.setl_ITEM_NAME( getString(5, rs) );
			data.setl_DM_QTY( getString(6, rs) );
			data.setl_ALC_ALCD_QTY( getString(7, rs) );
			data.setl_ALCDLE_QTY( getString(8, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(9, rs) );
			data.setl_STOCK_UNIT( getString(10, rs) );
			data.setl_DUE_DATE( getString(11, rs) );
			data.setl_DM_STS_TYP( getString(12, rs) );
			data.setl_OD_TYP( getString(13, rs) );
			data.setl_MRP_ODR_TYP( getString(14, rs) );
			data.setl_OD_NO( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("ViewE", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewE_clear

			return;
		}

		/**
		 * ViewEクラスの標準コンストラクタ
		 */
		public ViewE()
		{
			//{{user_implement_dev:ViewE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewR_ALC extends DataObject
	{
		protected String m_selcmd = " select "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_OD.\"DM_QTY\" as \"DM_QTY\", "
+" "
+"  to_char(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0),'fm99999999999990.0099') as \"ODR_QTY\", "
+" "
+"  to_char(T_OD.DM_QTY - abs(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0)),'fm99999999999990.0099') as \"ALCD_QTY\", "
+" "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\", 'fm99999999999990.0099') as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  FncGetFormattedDatetime(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  T1.\"DISPLAY_NAME\" as \"DM_STS_TYP\", "
+"  T2.\"DISPLAY_NAME\" as \"OD_TYP\", "
+"  T3.\"DISPLAY_NAME\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY >  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"              CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"              ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"       + NVL(S1.STOCK_ON_HAND_QTY,0)  "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY >  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"             CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"             ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100)))) "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and ((T_OD.DUE_DATE >= to_date(?,'YYYY/MM/DD HH24:MI') "
+"    and T_OD.DUE_DATE <= to_date(?,'YYYY/MM/DD HH24:MI')) "
+"    or (T_OD.DUE_DATE  = to_date(?,'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and(T_OD.DM_STS_TYP = ? or  T_OD.DM_STS_TYP = ? or  T_OD.DM_STS_TYP = ?) "
+"order by "
+"  T_OD.JOB_ODR_CD, "
+"  T_OD.JOB_ODR_CANCEL_NO, "
+"  T_OD.ALC_GRP_CD, "
+"  T_OD.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewR_ALC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewR_ALC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALC_read
			if(m_selcmd==null) throw new FoundationException("ViewR_ALC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewR_ALC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALC_read2
			if(m_selcmd==null) throw new FoundationException("ViewR_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewR_ALC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALC_read3
			if(m_selcmd==null) throw new FoundationException("ViewR_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewR_ALC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewR_ALC", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ALC_GRP_CD( getString(3, rs) );
			data.setl_ITEM_CD( getString(4, rs) );
			data.setl_ITEM_NAME( getString(5, rs) );
			data.setl_DM_QTY( getString(6, rs) );
			data.setl_ALC_ALCD_QTY( getString(7, rs) );
			data.setl_ALCDLE_QTY( getString(8, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(9, rs) );
			data.setl_STOCK_UNIT( getString(10, rs) );
			data.setl_DUE_DATE( getString(11, rs) );
			data.setl_DM_STS_TYP( getString(12, rs) );
			data.setl_OD_TYP( getString(13, rs) );
			data.setl_MRP_ODR_TYP( getString(14, rs) );
			data.setl_OD_NO( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewR_ALC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALC_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("ViewR_ALC", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewR_ALC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewR_ALC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewR_ALC_clear

			return;
		}

		/**
		 * ViewR_ALCクラスの標準コンストラクタ
		 */
		public ViewR_ALC()
		{
			//{{user_implement_dev:ViewR_ALC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewR_ALC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewE_ALC extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_OD.\"DM_QTY\" as \"DM_QTY\", "
+" "
+"  to_char(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0),'fm99999999999990.0099') as \"ODR_QTY\", "
+" "
+"  to_char(T_OD.DM_QTY - abs(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0)),'fm99999999999990.0099') as \"ALCD_QTY\", "
+" "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\", 'fm99999999999990.0099') as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  FncGetFormattedDatetime(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  T1.\"DISPLAY_NAME\" as \"DM_STS_TYP\", "
+"  T2.\"DISPLAY_NAME\" as \"OD_TYP\", "
+"  T3.\"DISPLAY_NAME\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY <  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"              CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"              ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"       + NVL(S1.STOCK_ON_HAND_QTY,0)  "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY <  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"             CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"             ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100)))) "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and ((T_OD.DUE_DATE >= to_date(?,'YYYY/MM/DD HH24:MI') "
+"    and T_OD.DUE_DATE <= to_date(?,'YYYY/MM/DD HH24:MI')) "
+"    or (T_OD.DUE_DATE  = to_date(?,'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"order by "
+"  T_OD.JOB_ODR_CD, "
+"  T_OD.JOB_ODR_CANCEL_NO, "
+"  T_OD.ALC_GRP_CD, "
+"  T_OD.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewE_ALC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewE_ALC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALC_read
			if(m_selcmd==null) throw new FoundationException("ViewE_ALC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewE_ALC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALC_read2
			if(m_selcmd==null) throw new FoundationException("ViewE_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewE_ALC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALC_read3
			if(m_selcmd==null) throw new FoundationException("ViewE_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewE_ALC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewE_ALC", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ALC_GRP_CD( getString(3, rs) );
			data.setl_ITEM_CD( getString(4, rs) );
			data.setl_ITEM_NAME( getString(5, rs) );
			data.setl_DM_QTY( getString(6, rs) );
			data.setl_ALC_ALCD_QTY( getString(7, rs) );
			data.setl_ALCDLE_QTY( getString(8, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(9, rs) );
			data.setl_STOCK_UNIT( getString(10, rs) );
			data.setl_DUE_DATE( getString(11, rs) );
			data.setl_DM_STS_TYP( getString(12, rs) );
			data.setl_OD_TYP( getString(13, rs) );
			data.setl_MRP_ODR_TYP( getString(14, rs) );
			data.setl_OD_NO( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewE_ALC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALC_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("ViewE_ALC", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewE_ALC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewE_ALC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewE_ALC_clear

			return;
		}

		/**
		 * ViewE_ALCクラスの標準コンストラクタ
		 */
		public ViewE_ALC()
		{
			//{{user_implement_dev:ViewE_ALC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewE_ALC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_TIME_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  value "
+"from "
+"  SYS_PARAMETER "
+"where "
+"  name = 'TIME_CTRL'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_TIME_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_TIME_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_TIME_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_TIME_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_TIME_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setTIME_CTRL( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_TIME_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_TIME_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SELECT_TIME_CTRL_clear

			return;
		}

		/**
		 * SELECT_TIME_CTRLクラスの標準コンストラクタ
		 */
		public SELECT_TIME_CTRL()
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SELECT_TIME_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewRCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  COUNT(1) "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY > decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) + NVL(S1.STOCK_ON_HAND_QTY, 0) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY > decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and((T_OD.DUE_DATE >= to_date(?, 'YYYY/MM/DD HH24:MI') "
+"  and T_OD.DUE_DATE <= to_date(?, 'YYYY/MM/DD HH24:MI')) "
+"  or (T_OD.DUE_DATE = to_date(?, 'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and T_JOB_ODR.ALC_GRP_CD = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"  and rownum <= to_number(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewRCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewRCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewRCnt_read
			if(m_selcmd==null) throw new FoundationException("ViewRCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewRCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewRCnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewRCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewRCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewRCnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewRCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewRCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewRCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getALC_GRP_CD())) setString(no ++, data.getALC_GRP_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewRCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewRCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewRCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewRCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewRCnt_clear

			return;
		}

		/**
		 * ViewRCntクラスの標準コンストラクタ
		 */
		public ViewRCnt()
		{
			//{{user_implement_dev:ViewRCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewRCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewR_ALCCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY > decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) + NVL(S1.STOCK_ON_HAND_QTY, 0) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY > decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and((T_OD.DUE_DATE >= to_date(?, 'YYYY/MM/DD HH24:MI') "
+"  and T_OD.DUE_DATE <= to_date(?, 'YYYY/MM/DD HH24:MI')) "
+"  or (T_OD.DUE_DATE = to_date(?, 'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewR_ALCCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewR_ALCCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALCCnt_read
			if(m_selcmd==null) throw new FoundationException("ViewR_ALCCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewR_ALCCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALCCnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewR_ALCCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewR_ALCCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALCCnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewR_ALCCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewR_ALCCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewR_ALCCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewR_ALCCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALCCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewR_ALCCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewR_ALCCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewR_ALCCnt_clear

			return;
		}

		/**
		 * ViewR_ALCCntクラスの標準コンストラクタ
		 */
		public ViewR_ALCCnt()
		{
			//{{user_implement_dev:ViewR_ALCCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewR_ALCCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewECnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY < decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) + NVL(S1.STOCK_ON_HAND_QTY, 0) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY < decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and((T_OD.DUE_DATE >= to_date(?, 'YYYY/MM/DD HH24:MI') "
+"  and T_OD.DUE_DATE <= to_date(?, 'YYYY/MM/DD HH24:MI')) "
+"  or (T_OD.DUE_DATE = to_date(?, 'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and T_JOB_ODR.ALC_GRP_CD = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewECnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewECnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewECnt_read
			if(m_selcmd==null) throw new FoundationException("ViewECnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewECnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewECnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewECnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewECnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewECnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewECnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewECnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewECnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getALC_GRP_CD())) setString(no ++, data.getALC_GRP_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewECnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewECnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewECnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewECnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewECnt_clear

			return;
		}

		/**
		 * ViewECntクラスの標準コンストラクタ
		 */
		public ViewECnt()
		{
			//{{user_implement_dev:ViewECnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewECnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ViewE_ALCCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY < decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) + NVL(S1.STOCK_ON_HAND_QTY, 0) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY < decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and((T_OD.DUE_DATE >= to_date(?, 'YYYY/MM/DD HH24:MI') "
+"  and T_OD.DUE_DATE <= to_date(?, 'YYYY/MM/DD HH24:MI')) "
+"  or (T_OD.DUE_DATE = to_date(?, 'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewE_ALCCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ViewE_ALCCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALCCnt_read
			if(m_selcmd==null) throw new FoundationException("ViewE_ALCCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewE_ALCCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALCCnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewE_ALCCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewE_ALCCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALCCnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewE_ALCCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:ViewE_ALCCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewE_ALCCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewE_ALCCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALCCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewE_ALCCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewE_ALCCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ViewE_ALCCnt_clear

			return;
		}

		/**
		 * ViewE_ALCCntクラスの標準コンストラクタ
		 */
		public ViewE_ALCCnt()
		{
			//{{user_implement_dev:ViewE_ALCCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ViewE_ALCCnt_constractor

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
		mreadM_ITEM.clear();
		mreadM_ITEM = null;
		mreadT_JOB_ODR.clear();
		mreadT_JOB_ODR = null;
		mreadT_JOB_ODR_PLANT.clear();
		mreadT_JOB_ODR_PLANT = null;
		mreadT_JOB_ODR_ALC.clear();
		mreadT_JOB_ODR_ALC = null;
		mViewR.clear();
		mViewR = null;
		mViewE.clear();
		mViewE = null;
		mViewR_ALC.clear();
		mViewR_ALC = null;
		mViewE_ALC.clear();
		mViewE_ALC = null;
		mSELECT_TIME_CTRL.clear();
		mSELECT_TIME_CTRL = null;
		mViewRCnt.clear();
		mViewRCnt = null;
		mViewR_ALCCnt.clear();
		mViewR_ALCCnt = null;
		mViewECnt.clear();
		mViewECnt = null;
		mViewE_ALCCnt.clear();
		mViewE_ALCCnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AC0110010クラスの標準コンストラクタ
	 */
	public AC0110010Entity() throws FoundationException
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
