/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0050/src/com/nec/jp/orteus/metamorBase/KM0050/KM0050010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0050;

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
 * CLASS     : KM0050010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class KM0050010Entity extends DataObject
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

	// CheckT_PROJECTクラス インスタンス
	public CheckT_PROJECT mCheckT_PROJECT = new CheckT_PROJECT();

	// CheckT_PJ_ODR_ALCクラス インスタンス
	public CheckT_PJ_ODR_ALC mCheckT_PJ_ODR_ALC = new CheckT_PJ_ODR_ALC();

	// Updateクラス インスタンス
	public Update mUpdate = new Update();

	// SelectSYS_TYPE_VALUEクラス インスタンス
	public SelectSYS_TYPE_VALUE mSelectSYS_TYPE_VALUE = new SelectSYS_TYPE_VALUE();

	// getDetailDataクラス インスタンス
	public getDetailData mgetDetailData = new getDetailData();

	// getProgressDataクラス インスタンス
	public getProgressData mgetProgressData = new getProgressData();

	// T_ESTIMATE_DETALクラス インスタンス
	public T_ESTIMATE_DETAL mT_ESTIMATE_DETAL = new T_ESTIMATE_DETAL();

	// SQLPjBudgetCostMakeクラス インスタンス
	public SQLPjBudgetCostMake mSQLPjBudgetCostMake = new SQLPjBudgetCostMake();

	// SYS_BAT_PARMクラス インスタンス
	public SYS_BAT_PARM mSYS_BAT_PARM = new SYS_BAT_PARM();

	// T_PROJECTクラス インスタンス
	public T_PROJECT mT_PROJECT = new T_PROJECT();


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
		String m_write_fname="KM0050010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="KM0050010";

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
	public class CheckT_PROJECT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_PROJECT.PROJECT_STAT "
+"FROM "
+"  T_PROJECT, "
+"  T_ESTIMATE, "
+"  T_ESTIMATE_DETAL "
+"WHERE "
+"  T_PROJECT.PROJECT_CD = ? "
+"  AND T_ESTIMATE.PROJECT_CD = T_PROJECT.PROJECT_CD "
+"  AND T_ESTIMATE.ESTIMATE_STAT = 1 "
+"  AND T_ESTIMATE_DETAL.PROJECT_CD = T_PROJECT.PROJECT_CD "
+"  AND T_ESTIMATE_DETAL.ESTIMATE_NO = T_ESTIMATE.ESTIMATE_NO "
+"  AND T_PROJECT.DEL_FLG = 0 "
+"  AND T_ESTIMATE.DEL_FLG = 0 "
+"  AND T_ESTIMATE_DETAL.DEL_FLG = 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CheckT_PROJECT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CheckT_PROJECT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CheckT_PROJECT_read
			if(m_selcmd==null) throw new FoundationException("CheckT_PROJECT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CheckT_PROJECT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CheckT_PROJECT_read2
			if(m_selcmd==null) throw new FoundationException("CheckT_PROJECT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CheckT_PROJECT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CheckT_PROJECT_read3
			if(m_selcmd==null) throw new FoundationException("CheckT_PROJECT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CheckT_PROJECT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPROJECT_CD());
				if(isNull(data.getPROJECT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPROJECT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0050010Struct data = new KM0050010Struct();

			data.setPROJECT_STAT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CheckT_PROJECT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CheckT_PROJECT_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CheckT_PROJECT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CheckT_PROJECT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CheckT_PROJECT_clear

			return;
		}

		/**
		 * CheckT_PROJECTクラスの標準コンストラクタ
		 */
		public CheckT_PROJECT()
		{
			//{{user_implement_dev:CheckT_PROJECT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CheckT_PROJECT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CheckT_PJ_ODR_ALC extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_PJ_ODR_ALC.ODR_NO "
+"FROM "
+"  T_PJ_ODR_ALC, "
+"  T_ESTIMATE_DETAL "
+"WHERE "
+"  T_ESTIMATE_DETAL.PROJECT_CD = T_PJ_ODR_ALC.PROJECT_CD(+) "
+"  AND T_ESTIMATE_DETAL.ESTIMATE_NO = T_PJ_ODR_ALC.ESTIMATE_NO(+) "
+"  AND T_ESTIMATE_DETAL.DETAL_NO = T_PJ_ODR_ALC.DETAL_NO(+) "
+"  AND T_ESTIMATE_DETAL.PROJECT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CheckT_PJ_ODR_ALC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CheckT_PJ_ODR_ALC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CheckT_PJ_ODR_ALC_read
			if(m_selcmd==null) throw new FoundationException("CheckT_PJ_ODR_ALC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CheckT_PJ_ODR_ALC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CheckT_PJ_ODR_ALC_read2
			if(m_selcmd==null) throw new FoundationException("CheckT_PJ_ODR_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CheckT_PJ_ODR_ALC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CheckT_PJ_ODR_ALC_read3
			if(m_selcmd==null) throw new FoundationException("CheckT_PJ_ODR_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CheckT_PJ_ODR_ALC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPROJECT_CD());
				if(isNull(data.getPROJECT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPROJECT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0050010Struct data = new KM0050010Struct();

			data.setODR_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CheckT_PJ_ODR_ALC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CheckT_PJ_ODR_ALC_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CheckT_PJ_ODR_ALC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CheckT_PJ_ODR_ALC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CheckT_PJ_ODR_ALC_clear

			return;
		}

		/**
		 * CheckT_PJ_ODR_ALCクラスの標準コンストラクタ
		 */
		public CheckT_PJ_ODR_ALC()
		{
			//{{user_implement_dev:CheckT_PJ_ODR_ALC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CheckT_PJ_ODR_ALC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class Update extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_ESTIMATE_DETAL "
+"SET "
+"  CMP_COST_ETC = ? "
+"WHERE "
+"  PROJECT_CD = ? "
+"  AND ESTIMATE_NO = ? "
+"  AND DETAL_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KM0050010";
		protected String m_sUpdateProgramName="KM0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:Update_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Update_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				stmt = conn.prepareStatement(m_updcmd);

				setString(1, data.getCMP_COST_ETC(), stmt);
				setString(2, data.getPROJECT_CD(), stmt);
				setString(3, data.getESTIMATE_NO(), stmt);
				setString(4, data.getDETAL_NO(), stmt);

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
			//{{user_implement_dev:Update_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Update_clear

			return;
		}

		/**
		 * Updateクラスの標準コンストラクタ
		 */
		public Update()
		{
			//{{user_implement_dev:Update_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Update_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSYS_TYPE_VALUE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  DISPLAY_NAME "
+"FROM "
+"  SYS_TYPE_VALUE "
+"WHERE "
+"  NAME = ? "
+"  AND VALUE = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSYS_TYPE_VALUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSYS_TYPE_VALUE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_TYPE_VALUE_read
			if(m_selcmd==null) throw new FoundationException("SelectSYS_TYPE_VALUE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_TYPE_VALUE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_TYPE_VALUE_read2
			if(m_selcmd==null) throw new FoundationException("SelectSYS_TYPE_VALUE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_TYPE_VALUE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_TYPE_VALUE_read3
			if(m_selcmd==null) throw new FoundationException("SelectSYS_TYPE_VALUE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_TYPE_VALUE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getNAME());
				if(isNull(data.getNAME())) isNull = true;
				ary.addElement(data.getVALUE());
				if(isNull(data.getVALUE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getNAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getVALUE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0050010Struct data = new KM0050010Struct();

			data.setDISPLAY_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSYS_TYPE_VALUE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_TYPE_VALUE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_TYPE_VALUE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSYS_TYPE_VALUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSYS_TYPE_VALUE_clear

			return;
		}

		/**
		 * SelectSYS_TYPE_VALUEクラスの標準コンストラクタ
		 */
		public SelectSYS_TYPE_VALUE()
		{
			//{{user_implement_dev:SelectSYS_TYPE_VALUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSYS_TYPE_VALUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getDetailData extends DataObject
	{
		protected String m_selcmd = "SELECT * "
+"FROM "
+"((SELECT "
+"  T_PROJECT.PROJECT_NAME, "
+"  T_PROJECT.PROJECT_STAT, "
+"  T_PROJECT.\"MODIFY_COUNT\" AS \"PJ_MODIFY_COUNT\", "
+"  T_ESTIMATE.ESTIMATE_NO, "
+"  T_ESTIMATE_DETAL.DETAL_NO, "
+"  T_ESTIMATE_DETAL.ESTIMATE_TYPE, "
+"  T_ODR_CTL.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"  T_ESTIMATE_DETAL.ITEM_NAME, "
+"  T_ODR.ODR_AMOUNT_EXCH_RATES AS ODR_AMOUNT, "
+"  T_ESTIMATE_DETAL.ES_COST_MATERIAL, "
+"  T_ESTIMATE_DETAL.ES_COST_PROCESS, "
+"  T_ESTIMATE_DETAL.ES_COST_OUTSOUCE, "
+"  T_ESTIMATE_DETAL.ES_COST_ETC, "
+"  T_ESTIMATE_DETAL.ES_COST_SERVICE, "
+"  T_ESTIMATE_DETAL.CMP_COST_ETC, "
+"  T_ESTIMATE_DETAL.MODIFY_COUNT, "
+"  T_ODR.ODR_NO, "
+"  T_ODR.ODR_QTY, "
+"  T_ODR.UNIT_CD, "
+"  T_ODR.ODR_UNIT_PRICE, "
+"  TO_CHAR(T_ODR.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"  T_JOB.JOB_ODR_CD, "
+"  T_JOB.JOB_ODR_CANCEL_NO, "
+"  T_JOB.PLANT_CD "
+"FROM "
+"  T_PROJECT, "
+"  T_ESTIMATE, "
+"  T_ESTIMATE_DETAL, "
+"  T_PJ_ODR_ALC, "
+"  T_ODR, "
+"  T_JOB_ODR_ODR_ALC T_JOB, "
+"  T_ODR_CTL "
+"WHERE "
+"  T_PROJECT.PROJECT_CD = ? "
+"  AND T_ESTIMATE.PROJECT_CD = T_PROJECT.PROJECT_CD "
+"  AND T_ESTIMATE.ESTIMATE_STAT = 2 "
+"  AND T_ESTIMATE_DETAL.PROJECT_CD = T_PROJECT.PROJECT_CD "
+"  AND T_ESTIMATE_DETAL.ESTIMATE_NO = T_ESTIMATE.ESTIMATE_NO "
+"  AND T_ESTIMATE_DETAL.ESTIMATE_TYPE = 1 "
+"  AND T_ESTIMATE_DETAL.PROJECT_CD = T_PJ_ODR_ALC.PROJECT_CD(+) "
+"  AND T_ESTIMATE_DETAL.ESTIMATE_NO = T_PJ_ODR_ALC.ESTIMATE_NO(+) "
+"  AND T_ESTIMATE_DETAL.DETAL_NO = T_PJ_ODR_ALC.DETAL_NO(+) "
+"  AND T_PJ_ODR_ALC.ODR_NO = T_ODR.ODR_NO(+) "
+"  AND T_ODR.ODR_NO = T_JOB.ODR_NO(+)  "
+"  AND 0 = T_ODR.DEL_FLG(+) "
+"  AND T_PROJECT.DEL_FLG = 0 "
+"  AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO "
+") "
+"UNION "
+"(SELECT "
+"  T_PROJECT.PROJECT_NAME, "
+"  T_PROJECT.PROJECT_STAT, "
+"  T_PROJECT.\"MODIFY_COUNT\" AS \"PJ_MODIFY_COUNT\", "
+"  T_ESTIMATE.ESTIMATE_NO, "
+"  T_ESTIMATE_DETAL.DETAL_NO, "
+"  T_ESTIMATE_DETAL.ESTIMATE_TYPE, "
+"  T_ESTIMATE_DETAL.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"  T_ESTIMATE_DETAL.ITEM_NAME, "
+"  T_ODR_UNSTOCK.ODR_AMOUNT_EXCH_RATES AS ODR_AMOUNT, "
+"  T_ESTIMATE_DETAL.ES_COST_MATERIAL, "
+"  T_ESTIMATE_DETAL.ES_COST_PROCESS, "
+"  T_ESTIMATE_DETAL.ES_COST_OUTSOUCE, "
+"  T_ESTIMATE_DETAL.ES_COST_ETC, "
+"  T_ESTIMATE_DETAL.ES_COST_SERVICE, "
+"  T_ESTIMATE_DETAL.CMP_COST_ETC, "
+"  T_ESTIMATE_DETAL.MODIFY_COUNT, "
+"  T_ODR_UNSTOCK.ODR_NO, "
+"  T_ODR_UNSTOCK.ODR_QTY, "
+"  '' AS UNIT_CD, "
+"  T_ODR_UNSTOCK.ODR_UNIT_PRICE, "
+"  TO_CHAR(T_ODR_UNSTOCK.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"  '' AS JOB_ODR_CD, "
+"  0 AS JOB_ODR_CANCEL_NO, "
+"  '' AS PLANT_CD "
+"FROM "
+"  T_PROJECT, "
+"  T_ESTIMATE, "
+"  T_ESTIMATE_DETAL, "
+"  T_PJ_ODR_ALC, "
+"  T_ODR_UNSTOCK "
+"WHERE "
+"  T_PROJECT.PROJECT_CD = ? "
+"  AND T_ESTIMATE.PROJECT_CD = T_PROJECT.PROJECT_CD "
+"  AND T_ESTIMATE.ESTIMATE_STAT = 2 "
+"  AND T_ESTIMATE_DETAL.PROJECT_CD = T_PROJECT.PROJECT_CD "
+"  AND T_ESTIMATE_DETAL.ESTIMATE_NO = T_ESTIMATE.ESTIMATE_NO "
+"  AND T_ESTIMATE_DETAL.ESTIMATE_TYPE = 2 "
+"  AND T_ESTIMATE_DETAL.PROJECT_CD = T_PJ_ODR_ALC.PROJECT_CD(+) "
+"  AND T_ESTIMATE_DETAL.ESTIMATE_NO = T_PJ_ODR_ALC.ESTIMATE_NO(+) "
+"  AND T_ESTIMATE_DETAL.DETAL_NO = T_PJ_ODR_ALC.DETAL_NO(+) "
+"  AND T_PJ_ODR_ALC.ODR_NO = T_ODR_UNSTOCK.ODR_NO(+) "
+"  AND 0 = T_ODR_UNSTOCK.DEL_FLG(+) "
+"  AND T_PROJECT.DEL_FLG = 0 "
+")) ORDER BY DETAL_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDetailData_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getDetailData_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDetailData_read
			if(m_selcmd==null) throw new FoundationException("getDetailData", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDetailData_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDetailData_read2
			if(m_selcmd==null) throw new FoundationException("getDetailData", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getDetailData_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDetailData_read3
			if(m_selcmd==null) throw new FoundationException("getDetailData", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getDetailData_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPROJECT_CD());
				if(isNull(data.getPROJECT_CD())) isNull = true;
				ary.addElement(data.getPROJECT_CD());
				if(isNull(data.getPROJECT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPROJECT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPROJECT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0050010Struct data = new KM0050010Struct();

			data.setPROJECT_NAME( getString(1, rs) );
			data.setPROJECT_STAT( getString(2, rs) );
			data.setPJ_MODIFY_COUNT( getString(3, rs) );
			data.setESTIMATE_NO( getString(4, rs) );
			data.setDETAL_NO( getString(5, rs) );
			data.setESTIMATE_TYPE( getString(6, rs) );
			data.setCUST_ITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setODR_AMOUNT( getString(9, rs) );
			data.setES_COST_MATERIAL( getString(10, rs) );
			data.setES_COST_PROCESS( getString(11, rs) );
			data.setES_COST_OUTSOUCE( getString(12, rs) );
			data.setES_COST_ETC( getString(13, rs) );
			data.setES_COST_SERVICE( getString(14, rs) );
			data.setCMP_COST_ETC( getString(15, rs) );
			data.setMODIFY_COUNT( getString(16, rs) );
			data.setODR_NO( getString(17, rs) );
			data.setODR_QTY( getString(18, rs) );
			data.setUNIT_CD( getString(19, rs) );
			data.setODR_UNIT_PRICE( getString(20, rs) );
			data.setDESINATED_DLV_DATE( getString(21, rs) );
			data.setl_JOB_ODR_CD( getString(22, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(23, rs) );
			data.setl_PLANT_CD( getString(24, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDetailData", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDetailData_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDetailData_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDetailData_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getDetailData_clear

			return;
		}

		/**
		 * getDetailDataクラスの標準コンストラクタ
		 */
		public getDetailData()
		{
			//{{user_implement_dev:getDetailData_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getDetailData_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getProgressData extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_PJ_COST.\"DETAL_NO\" AS \"DETAL_NO\", "
+"  TO_CHAR(TPJC_2.\"TOTAL_DATE\", 'YYYY/MM/DD HH24:MI:SS') AS \"TOTAL_DATE\", "
+"  T_PJ_COST.\"COST_PROGRESS\" AS \"COST_PROGRESS\", "
+"  T_PJ_COST.\"CMP_COST_MATERIAL\" AS \"CMP_COST_MATERIAL\", "
+"  T_PJ_COST.\"EXP_COST_MATERIAL\" AS \"EXP_COST_MATERIAL\", "
+"  T_PJ_COST.\"CMP_COST_PROCESS\" AS \"CMP_COST_PROCESS\", "
+"  T_PJ_COST.\"EXP_COST_PROCESS\" AS \"EXP_COST_PROCESS\", "
+"  T_PJ_COST.\"CMP_COST_OUTSOUCE\" AS \"CMP_COST_OUTSOUCE\", "
+"  T_PJ_COST.\"EXP_COST_OUTSOUCE\" AS \"EXP_COST_OUTSOUCE\", "
+"  T_PJ_COST.\"CMP_COST_SERVICE\" AS \"CMP_COST_SERVICE\", "
+"  T_PJ_COST.\"EXP_COST_SERVICE\" AS \"EXP_COST_SERVICE\" "
+"FROM "
+"  T_PJ_COST, "
+"  ( "
+"    SELECT "
+"      T_PJ_COST.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      T_PJ_COST.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      T_PJ_COST.\"DETAL_NO\" AS \"DETAL_NO\", "
+"      MAX(T_PJ_COST.\"TOTAL_DATE\") AS \"TOTAL_DATE\" "
+"    FROM "
+"      T_PJ_COST "
+"    WHERE "
+"      T_PJ_COST.\"PROJECT_CD\" = ? "
+"      AND T_PJ_COST.\"ESTIMATE_NO\" = ? "
+"    GROUP BY "
+"      T_PJ_COST.\"DETAL_NO\", "
+"      T_PJ_COST.\"ESTIMATE_NO\", "
+"      T_PJ_COST.\"PROJECT_CD\" "
+"  ) TPJC, "
+"  ( "
+"    SELECT "
+"      T_PJ_COST.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      T_PJ_COST.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      MAX(T_PJ_COST.\"TOTAL_DATE\") AS \"TOTAL_DATE\" "
+"    FROM "
+"      T_PJ_COST "
+"    GROUP BY "
+"      T_PJ_COST.\"PROJECT_CD\", "
+"      T_PJ_COST.\"ESTIMATE_NO\" "
+"  ) TPJC_2 "
+"WHERE "
+"  T_PJ_COST.\"PROJECT_CD\" = TPJC.\"PROJECT_CD\" "
+"  AND T_PJ_COST.\"ESTIMATE_NO\" = TPJC.\"ESTIMATE_NO\" "
+"  AND T_PJ_COST.\"DETAL_NO\" = TPJC.\"DETAL_NO\" "
+"  AND T_PJ_COST.\"TOTAL_DATE\" = TPJC.\"TOTAL_DATE\" "
+"  AND T_PJ_COST.\"PROJECT_CD\" = TPJC_2.\"PROJECT_CD\" "
+"  AND T_PJ_COST.\"ESTIMATE_NO\" = TPJC_2.\"ESTIMATE_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getProgressData_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getProgressData_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getProgressData_read
			if(m_selcmd==null) throw new FoundationException("getProgressData", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getProgressData_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getProgressData_read2
			if(m_selcmd==null) throw new FoundationException("getProgressData", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getProgressData_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getProgressData_read3
			if(m_selcmd==null) throw new FoundationException("getProgressData", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getProgressData_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPROJECT_CD());
				if(isNull(data.getPROJECT_CD())) isNull = true;
				ary.addElement(data.getESTIMATE_NO());
				if(isNull(data.getESTIMATE_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPROJECT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getESTIMATE_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0050010Struct data = new KM0050010Struct();

			data.setDETAL_NO( getString(1, rs) );
			data.setTOTAL_DATE( getString(2, rs) );
			data.setCOST_PROGRESS( getString(3, rs) );
			data.setCMP_COST_MATERIAL( getString(4, rs) );
			data.setEXP_COST_MATERIAL( getString(5, rs) );
			data.setCMP_COST_PROCESS( getString(6, rs) );
			data.setEXP_COST_PROCESS( getString(7, rs) );
			data.setCMP_COST_OUTSOUCE( getString(8, rs) );
			data.setEXP_COST_OUTSOUCE( getString(9, rs) );
			data.setCMP_COST_SERVICE( getString(10, rs) );
			data.setEXP_COST_SERVICE( getString(11, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getProgressData", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getProgressData_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getProgressData_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getProgressData_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getProgressData_clear

			return;
		}

		/**
		 * getProgressDataクラスの標準コンストラクタ
		 */
		public getProgressData()
		{
			//{{user_implement_dev:getProgressData_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getProgressData_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ESTIMATE_DETAL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ESTIMATE_DETAL.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\", "
+"  T_ESTIMATE_DETAL.\"OD_COMP_FLG\" AS \"OD_COMP_FLG\" "
+"FROM "
+"  T_ESTIMATE_DETAL "
+"WHERE "
+"  T_ESTIMATE_DETAL.\"PROJECT_CD\" = ? "
+"  AND T_ESTIMATE_DETAL.\"ESTIMATE_NO\" = ? "
+"  AND T_ESTIMATE_DETAL.\"DETAL_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_ESTIMATE_DETAL "
+"SET "
+"  CMP_COST_ETC = ? "
+"WHERE "
+"  PROJECT_CD = ? "
+"  AND ESTIMATE_NO = ? "
+"  AND DETAL_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KM0050010";
		protected String m_sUpdateProgramName="KM0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ESTIMATE_DETAL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ESTIMATE_DETAL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ESTIMATE_DETAL_read
			if(m_selcmd==null) throw new FoundationException("T_ESTIMATE_DETAL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ESTIMATE_DETAL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ESTIMATE_DETAL_read2
			if(m_selcmd==null) throw new FoundationException("T_ESTIMATE_DETAL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_ESTIMATE_DETAL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ESTIMATE_DETAL_read3
			if(m_selcmd==null) throw new FoundationException("T_ESTIMATE_DETAL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_ESTIMATE_DETAL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPROJECT_CD());
				if(isNull(data.getPROJECT_CD())) isNull = true;
				ary.addElement(data.getESTIMATE_NO());
				if(isNull(data.getESTIMATE_NO())) isNull = true;
				ary.addElement(data.getDETAL_NO());
				if(isNull(data.getDETAL_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPROJECT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getESTIMATE_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDETAL_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0050010Struct data = new KM0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );
			data.setOD_COMP_FLG( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ESTIMATE_DETAL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ESTIMATE_DETAL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ESTIMATE_DETAL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getCMP_COST_ETC(), stmt);
				setString(5, data.getPROJECT_CD(), stmt);
				setString(6, data.getESTIMATE_NO(), stmt);
				setString(7, data.getDETAL_NO(), stmt);

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
			//{{user_implement_dev:T_ESTIMATE_DETAL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ESTIMATE_DETAL_clear

			return;
		}

		/**
		 * T_ESTIMATE_DETALクラスの標準コンストラクタ
		 */
		public T_ESTIMATE_DETAL()
		{
			//{{user_implement_dev:T_ESTIMATE_DETAL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ESTIMATE_DETAL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SQLPjBudgetCostMake extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = "{" + "call SQLPjBudgetCostMake(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)" + "}";



		//////////////////////////////

		//{{user_implement_dev:SQLPjBudgetCostMake_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SQLPjBudgetCostMake_def

		/**
		 * Stored Procudure処理
		 *
		 * @return Listインスタンスで実行結果を返します
		 * @param IDbConnection
		 * @param KM0050010Struct
		 * @exception FoundationException, SQLException
		 */
		public List call(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SQLPjBudgetCostMake_call_storedproc
				// todo: Stored Procedure実行時の処理を記述してください
			return call(conn.getConn(), data);
                        //}}user_implement_dev:SQLPjBudgetCostMake_call_storedproc
		}

		/**
		 * Stored Procudure処理
		 *
		 * @return Listインスタンスで実行結果を返します
		 * @param Connection
		 * @param KM0050010Struct
		 * @exception FoundationException, SQLException
		 */
		public List call(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			CallableStatement cstmt = null;

			try {
				cstmt = conn.prepareCall(m_spcmd);

				setString(1, data.getpvc2LogMode(), cstmt);
				setString(2, data.getpvc2OutputMode(), cstmt);
				setString(3, data.getpvc2OutputPath(), cstmt);
				setString(4, data.getpvc2OutputName(), cstmt);
				setString(5, data.getpvc2UserId(), cstmt);
				setString(6, data.getpvc2BusinessName(), cstmt);
				setString(7, data.getpvc2PlantCd(), cstmt);
				setString(8, data.getpnumFlag(), cstmt);
				setString(9, data.getpvc2OdrNo(), cstmt);
				setString(10, data.getpvc2PProjectCd(), cstmt);
				setString(11, data.getpnumEstimateNo(), cstmt);
				setString(12, data.getpnumDetalNo(), cstmt);

				registerOutParameterString(13, cstmt);

				cstmt.execute();
				List list = new ArrayList();
				ResultSet rs = cstmt.getResultSet();
				if(rs != null) {
					while((data=call(rs)) != null) {
						list.add(data);
					}
				} else {
					data.setpnumReturn( getString(13, cstmt) );
					list.add(data);
				}

				return list;
			} finally {
				if(cstmt!=null) {
					cstmt.close();
					cstmt = null;
				}
			}
		}

		/**
		 * Stored Procudure処理
		 *
		 * @return KM0050010Structインスタンスで実行結果を返します
		 * @param ResultSet
		 * @exception FoundationException, SQLException
		 */
		public KM0050010Struct call(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs == null || rs.next()==false) return null;
			KM0050010Struct data = new KM0050010Struct();
			data.setpnumReturn( getString(13, rs) );
			return data;
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SQLPjBudgetCostMake_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SQLPjBudgetCostMake_clear

			return;
		}

		/**
		 * SQLPjBudgetCostMakeクラスの標準コンストラクタ
		 */
		public SQLPjBudgetCostMake()
		{
			//{{user_implement_dev:SQLPjBudgetCostMake_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SQLPjBudgetCostMake_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_BAT_PARM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_BAT_PARM.\"FILE_PATH\" AS \"FILE_PATH\", "
+"  SYS_BAT_PARM.\"FILE_NAME\" AS \"FILE_NAME\", "
+"  SYS_BAT_PARM.\"LOG_MODE_TYP\" AS \"LOG_MODE_TYP\", "
+"  SYS_BAT_PARM.\"OUTPUT_MODE_TYP\" AS \"OUTPUT_MODE_TYP\" "
+"FROM "
+"  SYS_BAT_PARM "
+"WHERE "
+"  SYS_BAT_PARM.\"PROGRAM_CD\" = 'KM0050010' "
+"  AND SYS_BAT_PARM.\"FUNCTION_NAME\" = 'SQLPJBUDGETCOSTMAKE'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_BAT_PARM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_BAT_PARM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_BAT_PARM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read2
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_BAT_PARM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read3
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_BAT_PARM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0050010Struct data = new KM0050010Struct();

			data.setFILE_PATH( getString(1, rs) );
			data.setFILE_NAME( getString(2, rs) );
			data.setLOG_MODE_TYP( getString(3, rs) );
			data.setOUTPUT_MODE_TYP( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_BAT_PARM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_BAT_PARM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_BAT_PARM_clear

			return;
		}

		/**
		 * SYS_BAT_PARMクラスの標準コンストラクタ
		 */
		public SYS_BAT_PARM()
		{
			//{{user_implement_dev:SYS_BAT_PARM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_BAT_PARM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_PROJECT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_PROJECT.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\" "
+"FROM "
+"  T_PROJECT "
+"WHERE "
+"  T_PROJECT.\"PROJECT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_PROJECT "
+"SET "
+"  \"OD_COMP_FLG\" = ? "
+"WHERE "
+"  T_PROJECT.\"PROJECT_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KM0050010";
		protected String m_sUpdateProgramName="KM0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_PROJECT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_PROJECT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PROJECT_read
			if(m_selcmd==null) throw new FoundationException("T_PROJECT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_PROJECT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PROJECT_read2
			if(m_selcmd==null) throw new FoundationException("T_PROJECT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_PROJECT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PROJECT_read3
			if(m_selcmd==null) throw new FoundationException("T_PROJECT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_PROJECT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPROJECT_CD());
				if(isNull(data.getPROJECT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPROJECT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0050010Struct data = new KM0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_PROJECT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PROJECT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_PROJECT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0050010Struct data) throws FoundationException, SQLException
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
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KM0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KM0050010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getOD_COMP_FLG(), stmt);
				setString(5, data.getPROJECT_CD(), stmt);

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
			//{{user_implement_dev:T_PROJECT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_PROJECT_clear

			return;
		}

		/**
		 * T_PROJECTクラスの標準コンストラクタ
		 */
		public T_PROJECT()
		{
			//{{user_implement_dev:T_PROJECT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_PROJECT_constractor

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
		mCheckT_PROJECT.clear();
		mCheckT_PROJECT = null;
		mCheckT_PJ_ODR_ALC.clear();
		mCheckT_PJ_ODR_ALC = null;
		mUpdate.clear();
		mUpdate = null;
		mSelectSYS_TYPE_VALUE.clear();
		mSelectSYS_TYPE_VALUE = null;
		mgetDetailData.clear();
		mgetDetailData = null;
		mgetProgressData.clear();
		mgetProgressData = null;
		mT_ESTIMATE_DETAL.clear();
		mT_ESTIMATE_DETAL = null;
		mSQLPjBudgetCostMake.clear();
		mSQLPjBudgetCostMake = null;
		mSYS_BAT_PARM.clear();
		mSYS_BAT_PARM = null;
		mT_PROJECT.clear();
		mT_PROJECT = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * KM0050010クラスの標準コンストラクタ
	 */
	public KM0050010Entity() throws FoundationException
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
