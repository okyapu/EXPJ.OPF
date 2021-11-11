/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/KZ1010P001Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0070;

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
 * CLASS     : KZ1010P001Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class KZ1010P001Entity extends DataObject
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

	// SelectSYS_MY_COMPANYクラス インスタンス
	public SelectSYS_MY_COMPANY mSelectSYS_MY_COMPANY = new SelectSYS_MY_COMPANY();

	// SelectSYS_AR_CTRLクラス インスタンス
	public SelectSYS_AR_CTRL mSelectSYS_AR_CTRL = new SelectSYS_AR_CTRL();

	// SelectSYS_CLASS_CODEクラス インスタンス
	public SelectSYS_CLASS_CODE mSelectSYS_CLASS_CODE = new SelectSYS_CLASS_CODE();

	// SelectM_SLIP_TRNクラス インスタンス
	public SelectM_SLIP_TRN mSelectM_SLIP_TRN = new SelectM_SLIP_TRN();

	// SelectSYS_HOME_CURクラス インスタンス
	public SelectSYS_HOME_CUR mSelectSYS_HOME_CUR = new SelectSYS_HOME_CUR();

	// SelectT_SALESクラス インスタンス
	public SelectT_SALES mSelectT_SALES = new SelectT_SALES();

	// SelectT_SHIPクラス インスタンス
	public SelectT_SHIP mSelectT_SHIP = new SelectT_SHIP();

	// SelectT_SHIP_ODRクラス インスタンス
	public SelectT_SHIP_ODR mSelectT_SHIP_ODR = new SelectT_SHIP_ODR();

	// SelectT_ODRクラス インスタンス
	public SelectT_ODR mSelectT_ODR = new SelectT_ODR();

	// SelectM_CUSTクラス インスタンス
	public SelectM_CUST mSelectM_CUST = new SelectM_CUST();

	// SelectM_CUST_BRANCHクラス インスタンス
	public SelectM_CUST_BRANCH mSelectM_CUST_BRANCH = new SelectM_CUST_BRANCH();

	// SelectM_CLAIM_CUST_CTRLクラス インスタンス
	public SelectM_CLAIM_CUST_CTRL mSelectM_CLAIM_CUST_CTRL = new SelectM_CLAIM_CUST_CTRL();

	// SelectM_CUST_BASEクラス インスタンス
	public SelectM_CUST_BASE mSelectM_CUST_BASE = new SelectM_CUST_BASE();

	// SelectM_ITEM_SPECクラス インスタンス
	public SelectM_ITEM_SPEC mSelectM_ITEM_SPEC = new SelectM_ITEM_SPEC();

	// SelectM_EXCH_RATEクラス インスタンス
	public SelectM_EXCH_RATE mSelectM_EXCH_RATE = new SelectM_EXCH_RATE();

	// InsertT_AR_LEDGER_H_TRNクラス インスタンス
	public InsertT_AR_LEDGER_H_TRN mInsertT_AR_LEDGER_H_TRN = new InsertT_AR_LEDGER_H_TRN();

	// SelectM_TAXクラス インスタンス
	public SelectM_TAX mSelectM_TAX = new SelectM_TAX();

	// SelectM_CURクラス インスタンス
	public SelectM_CUR mSelectM_CUR = new SelectM_CUR();

	// InsertT_AR_LEDGER_TRNクラス インスタンス
	public InsertT_AR_LEDGER_TRN mInsertT_AR_LEDGER_TRN = new InsertT_AR_LEDGER_TRN();

	// SelectM_ITEMクラス インスタンス
	public SelectM_ITEM mSelectM_ITEM = new SelectM_ITEM();

	// SelectT_AR_LEDGER_H_TRNクラス インスタンス
	public SelectT_AR_LEDGER_H_TRN mSelectT_AR_LEDGER_H_TRN = new SelectT_AR_LEDGER_H_TRN();

	// DeleteT_AR_LEDGER_H_TRNクラス インスタンス
	public DeleteT_AR_LEDGER_H_TRN mDeleteT_AR_LEDGER_H_TRN = new DeleteT_AR_LEDGER_H_TRN();

	// DeleteT_AR_LEDGER_TRNクラス インスタンス
	public DeleteT_AR_LEDGER_TRN mDeleteT_AR_LEDGER_TRN = new DeleteT_AR_LEDGER_TRN();

	// UpdateT_AR_LEDGER_Hクラス インスタンス
	public UpdateT_AR_LEDGER_H mUpdateT_AR_LEDGER_H = new UpdateT_AR_LEDGER_H();

	// InsertIntoT_AR_LEDGER_H_TRNクラス インスタンス
	public InsertIntoT_AR_LEDGER_H_TRN mInsertIntoT_AR_LEDGER_H_TRN = new InsertIntoT_AR_LEDGER_H_TRN();

	// SelectT_AR_LEDGERクラス インスタンス
	public SelectT_AR_LEDGER mSelectT_AR_LEDGER = new SelectT_AR_LEDGER();

	// InsertIntoT_AR_LEDGER_TRNクラス インスタンス
	public InsertIntoT_AR_LEDGER_TRN mInsertIntoT_AR_LEDGER_TRN = new InsertIntoT_AR_LEDGER_TRN();

	// SelectT_AR_LEDGER_Hクラス インスタンス
	public SelectT_AR_LEDGER_H mSelectT_AR_LEDGER_H = new SelectT_AR_LEDGER_H();


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
		String m_write_fname="KZ1010P001.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="KZ1010P001";

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
	public class SelectSYS_MY_COMPANY extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_MY_COMPANY.\"COMPANY_CD\" "
+"from "
+"  SYS_MY_COMPANY "
+"where "
+"  SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSYS_MY_COMPANY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSYS_MY_COMPANY_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_MY_COMPANY_read
			if(m_selcmd==null) throw new FoundationException("SelectSYS_MY_COMPANY", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_MY_COMPANY_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_MY_COMPANY_read2
			if(m_selcmd==null) throw new FoundationException("SelectSYS_MY_COMPANY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_MY_COMPANY_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_MY_COMPANY_read3
			if(m_selcmd==null) throw new FoundationException("SelectSYS_MY_COMPANY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_MY_COMPANY_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSYS_MY_COMPANY", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_MY_COMPANY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_MY_COMPANY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSYS_MY_COMPANY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSYS_MY_COMPANY_clear

			return;
		}

		/**
		 * SelectSYS_MY_COMPANYクラスの標準コンストラクタ
		 */
		public SelectSYS_MY_COMPANY()
		{
			//{{user_implement_dev:SelectSYS_MY_COMPANY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSYS_MY_COMPANY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSYS_AR_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_AR_CTRL.\"SLIP_CTRL_GRP\" "
+"from "
+"  SYS_AR_CTRL "
+"where "
+"  SYS_AR_CTRL.\"COMPANY_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSYS_AR_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSYS_AR_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_AR_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SelectSYS_AR_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_AR_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_AR_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SelectSYS_AR_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_AR_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_AR_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SelectSYS_AR_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_AR_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setSLIP_CTRL_GRP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSYS_AR_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_AR_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_AR_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSYS_AR_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSYS_AR_CTRL_clear

			return;
		}

		/**
		 * SelectSYS_AR_CTRLクラスの標準コンストラクタ
		 */
		public SelectSYS_AR_CTRL()
		{
			//{{user_implement_dev:SelectSYS_AR_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSYS_AR_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSYS_CLASS_CODE extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_CLASS_CODE.\"CODE\" "
+"from "
+"  SYS_CLASS_CODE "
+"where "
+"  SYS_CLASS_CODE.\"SYS_CLASS\" = 'SALES' "
+"  and SYS_CLASS_CODE.\"CLASS_CODE\" = 'SLIP_TRN_CD'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSYS_CLASS_CODE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSYS_CLASS_CODE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_CLASS_CODE_read
			if(m_selcmd==null) throw new FoundationException("SelectSYS_CLASS_CODE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_CLASS_CODE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_CLASS_CODE_read2
			if(m_selcmd==null) throw new FoundationException("SelectSYS_CLASS_CODE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_CLASS_CODE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_CLASS_CODE_read3
			if(m_selcmd==null) throw new FoundationException("SelectSYS_CLASS_CODE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_CLASS_CODE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setSLIP_TRN_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSYS_CLASS_CODE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_CLASS_CODE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_CLASS_CODE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSYS_CLASS_CODE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSYS_CLASS_CODE_clear

			return;
		}

		/**
		 * SelectSYS_CLASS_CODEクラスの標準コンストラクタ
		 */
		public SelectSYS_CLASS_CODE()
		{
			//{{user_implement_dev:SelectSYS_CLASS_CODE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSYS_CLASS_CODE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_SLIP_TRN extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_SLIP_TRN.\"STOCK_CLASS_CD\", "
+"  M_SLIP_TRN.\"BALANCE_CLASS_CD\" "
+"from "
+"  M_SLIP_TRN "
+"where "
+"  M_SLIP_TRN.\"COMPANY_CD\" = ? "
+"  and M_SLIP_TRN.\"SLIP_TYP\" = 14 "
+"  and M_SLIP_TRN.\"SLIP_TRN_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_SLIP_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_SLIP_TRN_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_SLIP_TRN_read
			if(m_selcmd==null) throw new FoundationException("SelectM_SLIP_TRN", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_SLIP_TRN_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_SLIP_TRN_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_SLIP_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_SLIP_TRN_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_SLIP_TRN_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_SLIP_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_SLIP_TRN_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_TRN_CD());
				if(isNull(data.getSLIP_TRN_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_TRN_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setSTOCK_CLASS_CD( getString(1, rs) );
			data.setBALANCE_CLASS_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_SLIP_TRN", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_SLIP_TRN_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_SLIP_TRN_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_SLIP_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_SLIP_TRN_clear

			return;
		}

		/**
		 * SelectM_SLIP_TRNクラスの標準コンストラクタ
		 */
		public SelectM_SLIP_TRN()
		{
			//{{user_implement_dev:SelectM_SLIP_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_SLIP_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSYS_HOME_CUR extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_HOME_CUR.\"HOME_CUR_CD\" "
+"from "
+"  SYS_HOME_CUR "
+"where "
+"  SYS_HOME_CUR.\"CTRL_CD\" = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSYS_HOME_CUR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSYS_HOME_CUR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_HOME_CUR_read
			if(m_selcmd==null) throw new FoundationException("SelectSYS_HOME_CUR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_HOME_CUR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_HOME_CUR_read2
			if(m_selcmd==null) throw new FoundationException("SelectSYS_HOME_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_HOME_CUR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_HOME_CUR_read3
			if(m_selcmd==null) throw new FoundationException("SelectSYS_HOME_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSYS_HOME_CUR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setHOME_CUR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSYS_HOME_CUR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSYS_HOME_CUR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSYS_HOME_CUR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSYS_HOME_CUR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSYS_HOME_CUR_clear

			return;
		}

		/**
		 * SelectSYS_HOME_CURクラスの標準コンストラクタ
		 */
		public SelectSYS_HOME_CUR()
		{
			//{{user_implement_dev:SelectSYS_HOME_CUR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSYS_HOME_CUR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_SALES extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(T_SALES.\"SALES_DATE\", 'YYYY/MM/DD'), "
+"  T_SALES.\"SALES_DEPT_CD\", "
+"  T_SALES.\"CUST_CHRG_PSN_CD\", "
+"  T_SALES.\"CUST_CD\", "
+"  T_SALES.\"ITEM_CD\", "
+"  T_SALES.\"ITEM_NAME\", "
+"  T_SALES.\"CUST_ODR_NO\", "
+"  T_SALES.\"SALES_AMOUNT\", "
+"  T_SALES.\"REMARKS\", "
+"  T_SALES.\"SALES_AMOUNT_EXCH_RATES\", "
+"  T_SALES.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", "
+"  T_SALES.\"SALES_UNIT_PRICE\", "
+"  T_SALES.\"SALES_QTY\", "
+"  TO_CHAR(T_SALES.\"INSPC_ACPT_DATE\", 'YYYY/MM/DD'), "
+"  T_SALES.\"INSPC_ACPT_QTY\" "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.\"SLIP_CD\" = ? "
+"  and T_SALES.\"DEL_FLG\" = '0' "
+"ORDER BY "
+"  T_SALES.\"SALES_SEQ_NO\" DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_SALES_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_SALES_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SALES_read
			if(m_selcmd==null) throw new FoundationException("SelectT_SALES", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_SALES_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SALES_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_SALES", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_SALES_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SALES_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_SALES", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_SALES_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setSALES_DATE( getString(1, rs) );
			data.setSALES_DEPT_CD( getString(2, rs) );
			data.setCUST_CHRG_PSN_CD( getString(3, rs) );
			data.setCUST_CD( getString(4, rs) );
			data.setITEM_CD( getString(5, rs) );
			data.setITEM_NAME( getString(6, rs) );
			data.setCUST_ODR_NO( getString(7, rs) );
			data.setSALES_AMOUNT( getString(8, rs) );
			data.setREMARKS( getString(9, rs) );
			data.setSALES_AMOUNT_EXCH_RATES( getString(10, rs) );
			data.setOWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(11, rs) );
			data.setSALES_UNIT_PRICE( getString(12, rs) );
			data.setSALES_QTY( getString(13, rs) );
			data.setINSPC_ACPT_DATE( getString(14, rs) );
			data.setINSPC_ACPT_QTY( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_SALES", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SALES_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_SALES_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectT_SALES_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_SALES_clear

			return;
		}

		/**
		 * SelectT_SALESクラスの標準コンストラクタ
		 */
		public SelectT_SALES()
		{
			//{{user_implement_dev:SelectT_SALES_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_SALES_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_SHIP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SHIP.\"FINAL_DLV_LOC_CD\", "
+"  TO_CHAR(T_SHIP.\"SHIP_DATE\", 'YYYY/MM/DD'), "
+"  T_SHIP.\"CUST_ODR_NO\", "
+"  T_SHIP.\"ODR_CTL_NO\", "
+"  T_SHIP.\"CUST_ITEM_CD\", "
+"  T_SHIP.\"CUST_ITEM_NAME\", "
+"  T_SHIP.\"PART_DLV_SEQ_NO\", "
+"  T_SHIP.\"SHIP_ODR_NO\", "
+"  T_SHIP.\"PURPOSE_UNIT_PRICE_TYP\" "
+"FROM "
+"  T_SHIP "
+"WHERE "
+"  T_SHIP.\"SLIP_CD\" = ? "
+"  AND T_SHIP.\"DEL_FLG\" = '0' "
+"ORDER BY "
+"  T_SHIP.\"SHIP_SEQ_NO\" DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_SHIP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_SHIP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SHIP_read
			if(m_selcmd==null) throw new FoundationException("SelectT_SHIP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_SHIP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SHIP_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_SHIP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_SHIP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SHIP_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_SHIP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_SHIP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setFINAL_DLV_LOC_CD( getString(1, rs) );
			data.setSHIP_DATE( getString(2, rs) );
			data.setCUST_ODR_NO( getString(3, rs) );
			data.setODR_CTL_NO( getString(4, rs) );
			data.setCUST_ITEM_CD( getString(5, rs) );
			data.setCUST_ITEM_NAME( getString(6, rs) );
			data.setPART_DLV_SEQ_NO( getString(7, rs) );
			data.setSHIP_ODR_NO( getString(8, rs) );
			data.setPURPOSE_UNIT_PRICE_TYP( getString(9, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_SHIP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SHIP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_SHIP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectT_SHIP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_SHIP_clear

			return;
		}

		/**
		 * SelectT_SHIPクラスの標準コンストラクタ
		 */
		public SelectT_SHIP()
		{
			//{{user_implement_dev:SelectT_SHIP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_SHIP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_SHIP_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SHIP_ODR.\"SHIP_ODR_NO\", "
+"  TO_CHAR(T_SHIP_ODR.\"SHIP_PLAN_DATE\", 'YYYY/MM/DD'), "
+"  TO_CHAR(T_SHIP_ODR.\"SCDL_DLV_DATE\", 'YYYY/MM/DD') "
+"FROM "
+"  T_SHIP_ODR "
+"WHERE "
+"  T_SHIP_ODR.\"SLIP_CD\" = ? "
+"  AND T_SHIP_ODR.\"DEL_FLG\" = '0'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_SHIP_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_SHIP_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SHIP_ODR_read
			if(m_selcmd==null) throw new FoundationException("SelectT_SHIP_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_SHIP_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SHIP_ODR_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_SHIP_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_SHIP_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SHIP_ODR_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_SHIP_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_SHIP_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setSHIP_ODR_NO( getString(1, rs) );
			data.setSHIP_PLAN_DATE( getString(2, rs) );
			data.setSCDL_DLV_DATE( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_SHIP_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_SHIP_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_SHIP_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectT_SHIP_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_SHIP_ODR_clear

			return;
		}

		/**
		 * SelectT_SHIP_ODRクラスの標準コンストラクタ
		 */
		public SelectT_SHIP_ODR()
		{
			//{{user_implement_dev:SelectT_SHIP_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_SHIP_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(T_ODR.\"UNCNFM_CUST_ODR_CREATE_DATE\", 'YYYY/MM/DD'), "
+"  T_ODR.\"CUS_DLV_KEY_CD\", "
+"  T_ODR.\"AMOUNT_TYP\", "
+"  T_ODR.\"ODR_CMPLT_FLG\", "
+"  T_ODR.\"SHIP_COUNT\", "
+"  T_ODR.\"ODR_QTY\", "
+"  T_ODR.\"TAX_CD\" AS \"T_ODR_TAX_CD\" "
+"FROM "
+"  T_ODR "
+"WHERE "
+"  T_ODR.\"ODR_CTL_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_ODR_read
			if(m_selcmd==null) throw new FoundationException("SelectT_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_ODR_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_ODR_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_CTL_NO());
				if(isNull(data.getODR_CTL_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getODR_CTL_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setUNCNFM_CUST_ODR_CREATE_DATE( getString(1, rs) );
			data.setCUS_DLV_KEY_CD( getString(2, rs) );
			data.setAMOUNT_TYP( getString(3, rs) );
			data.setODR_CMPLT_FLG( getString(4, rs) );
			data.setSHIP_COUNT( getString(5, rs) );
			data.setODR_QTY( getString(6, rs) );
			data.setT_ODR_TAX_CD( getString(7, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectT_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_ODR_clear

			return;
		}

		/**
		 * SelectT_ODRクラスの標準コンストラクタ
		 */
		public SelectT_ODR()
		{
			//{{user_implement_dev:SelectT_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_CUST extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CUST.\"CUST_NAME\", "
+"  M_CUST.\"TAX_CALC_TYP\", "
+"  M_CUST.\"TAX_APPLY_TYP\", "
+"  M_CUST.\"TEMP_UNIT_PRICE_SALES_FLG\", "
+"  M_CUST.\"CLAIM_CYCLE_TYP\", "
+"  M_CUST.\"RM_INP_TYP\", "
+"  M_CUST.\"CUR_CD\", "
+"  M_CUST.\"EXCH_TYP\", "
+"  M_CUST.\"TAX_CD\", "
+"  M_CUST.\"CUST_VARIOUS_TYP\", "
+"  M_CUST.\"SLIP_PRINTING_TYP_1\", "
+"  M_CUST.\"SLIP_PRINTING_TYP_2\", "
+"  M_CUST.\"SLIP_PRINTING_TYP_3\", "
+"  M_CUST.\"SLIP_PRINTING_TYP_4\", "
+"  M_CUST.\"SLIP_PRINTING_TYP_5\", "
+"  M_CUST.\"PRICE_RANK_CD\", "
+"  M_CUST.\"INSPC_ACPT_TYP\", "
+"  M_CUST.\"PRICE_ROUND_TYP\" "
+"from "
+"  M_CUST "
+"where "
+"  M_CUST.\"COMPANY_CD\" = ? "
+"  and M_CUST.\"CUST_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_CUST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_CUST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_read
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CUST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CUST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CUST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setCUST_NAME( getString(1, rs) );
			data.setTAX_CALC_TYP( getString(2, rs) );
			data.setTAX_APPLY_TYP( getString(3, rs) );
			data.setTEMP_UNIT_PRICE_SALES_FLG( getString(4, rs) );
			data.setCLAIM_CYCLE_TYP( getString(5, rs) );
			data.setRM_INP_TYP( getString(6, rs) );
			data.setCUR_CD( getString(7, rs) );
			data.setEXCH_TYP( getString(8, rs) );
			data.setTAX_CD( getString(9, rs) );
			data.setCUST_VARIOUS_TYP( getString(10, rs) );
			data.setSLIP_PRINTING_TYP_1( getString(11, rs) );
			data.setSLIP_PRINTING_TYP_2( getString(12, rs) );
			data.setSLIP_PRINTING_TYP_3( getString(13, rs) );
			data.setSLIP_PRINTING_TYP_4( getString(14, rs) );
			data.setSLIP_PRINTING_TYP_5( getString(15, rs) );
			data.setPRICE_RANK_CD( getString(16, rs) );
			data.setINSPC_ACPT_TYP( getString(17, rs) );
			data.setPRICE_ROUND_TYP( getString(18, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CUST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_CUST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_CUST_clear

			return;
		}

		/**
		 * SelectM_CUSTクラスの標準コンストラクタ
		 */
		public SelectM_CUST()
		{
			//{{user_implement_dev:SelectM_CUST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_CUST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_CUST_BRANCH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CUST_BRANCH.\"SHIP_SLIP_ID\", "
+"  M_CUST_BRANCH.\"CARRIAGE_CHARGE_TYP\" "
+"from "
+"  M_CUST_BRANCH "
+"where "
+"  M_CUST_BRANCH.\"COMPANY_CD\" = ? "
+"  and M_CUST_BRANCH.\"CUST_CD\" = ? "
+"order by "
+"  M_CUST_BRANCH.\"BRANCH_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_CUST_BRANCH_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_CUST_BRANCH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_BRANCH_read
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST_BRANCH", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CUST_BRANCH_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_BRANCH_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST_BRANCH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CUST_BRANCH_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_BRANCH_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST_BRANCH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CUST_BRANCH_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setSHIP_SLIP_ID( getString(1, rs) );
			data.setCARRIAGE_CHARGE_TYP( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST_BRANCH", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_BRANCH_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CUST_BRANCH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_CUST_BRANCH_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_CUST_BRANCH_clear

			return;
		}

		/**
		 * SelectM_CUST_BRANCHクラスの標準コンストラクタ
		 */
		public SelectM_CUST_BRANCH()
		{
			//{{user_implement_dev:SelectM_CUST_BRANCH_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_CUST_BRANCH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_CLAIM_CUST_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CLAIM_CUST_CTRL.\"BILL_ADDRESSEE_CD\", "
+"  M_CLAIM_CUST_CTRL.\"STL_COND_CD\" "
+"from "
+"  M_CLAIM_CUST_CTRL "
+"where "
+"  M_CLAIM_CUST_CTRL.\"COMPANY_CD\" = ? "
+"  and M_CLAIM_CUST_CTRL.\"CUST_CD\" = ? "
+"order by "
+"  M_CLAIM_CUST_CTRL.\"BILL_ADDRESSEE_CD\", "
+"  M_CLAIM_CUST_CTRL.\"STL_COND_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_CLAIM_CUST_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_CLAIM_CUST_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CLAIM_CUST_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SelectM_CLAIM_CUST_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CLAIM_CUST_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CLAIM_CUST_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_CLAIM_CUST_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CLAIM_CUST_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CLAIM_CUST_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_CLAIM_CUST_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CLAIM_CUST_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setBILL_ADDRESSEE_CD( getString(1, rs) );
			data.setSTL_COND_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_CLAIM_CUST_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CLAIM_CUST_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CLAIM_CUST_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_CLAIM_CUST_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_CLAIM_CUST_CTRL_clear

			return;
		}

		/**
		 * SelectM_CLAIM_CUST_CTRLクラスの標準コンストラクタ
		 */
		public SelectM_CLAIM_CUST_CTRL()
		{
			//{{user_implement_dev:SelectM_CLAIM_CUST_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_CLAIM_CUST_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_CUST_BASE extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_DLV_LOC.\"DLV_LOC_NAME\", "
+"  M_DLV_LOC.\"ZIP_CD\", "
+"  M_DLV_LOC.\"ADDRESS_1\", "
+"  M_DLV_LOC.\"ADDRESS_2\" "
+"from "
+"  M_DLV_LOC "
+"where "
+"  M_DLV_LOC.\"COMPANY_CD\" = ? "
+"  and M_DLV_LOC.\"CUST_CD\" = ? "
+"  and M_DLV_LOC.\"DLV_LOC_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_CUST_BASE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_CUST_BASE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_BASE_read
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST_BASE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CUST_BASE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_BASE_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST_BASE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CUST_BASE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_BASE_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST_BASE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CUST_BASE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getDLV_LOC_CD());
				if(isNull(data.getDLV_LOC_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDLV_LOC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setDLV_LOC_NAME( getString(1, rs) );
			data.setZIP_CD( getString(2, rs) );
			data.setADDRESS_1( getString(3, rs) );
			data.setADDRESS_2( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_CUST_BASE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUST_BASE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CUST_BASE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_CUST_BASE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_CUST_BASE_clear

			return;
		}

		/**
		 * SelectM_CUST_BASEクラスの標準コンストラクタ
		 */
		public SelectM_CUST_BASE()
		{
			//{{user_implement_dev:SelectM_CUST_BASE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_CUST_BASE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_ITEM_SPEC extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM_SPEC.\"CUST_ITEM_NAME\" "
+"from "
+"  M_ITEM_SPEC "
+"where "
+"  M_ITEM_SPEC.\"COMPANY_CD\" = ? "
+"  and M_ITEM_SPEC.\"CUST_CD\" = ? "
+"  and M_ITEM_SPEC.\"CUST_ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_ITEM_SPEC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_ITEM_SPEC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_SPEC_read
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM_SPEC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_ITEM_SPEC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_SPEC_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM_SPEC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_ITEM_SPEC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_SPEC_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM_SPEC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_ITEM_SPEC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getCUST_ITEM_CD());
				if(isNull(data.getCUST_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUST_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setCUST_ITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM_SPEC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_SPEC_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_ITEM_SPEC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_ITEM_SPEC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_ITEM_SPEC_clear

			return;
		}

		/**
		 * SelectM_ITEM_SPECクラスの標準コンストラクタ
		 */
		public SelectM_ITEM_SPEC()
		{
			//{{user_implement_dev:SelectM_ITEM_SPEC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_ITEM_SPEC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_EXCH_RATE extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_EXCH_RATE.\"EXCH_RATE\" "
+"from "
+"  M_EXCH_RATE "
+"where "
+"  M_EXCH_RATE.\"COMPANY_CD\" = ? "
+"  and M_EXCH_RATE.\"CUR_CD\" = ? "
+"  and M_EXCH_RATE.\"EXCH_TYP\" = ? "
+"  and M_EXCH_RATE.\"EXCH_START_DATE\" <= ? "
+"order by "
+"  M_EXCH_RATE.\"EXCH_START_DATE\" desc";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_EXCH_RATE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_EXCH_RATE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_EXCH_RATE_read
			if(m_selcmd==null) throw new FoundationException("SelectM_EXCH_RATE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_EXCH_RATE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_EXCH_RATE_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_EXCH_RATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_EXCH_RATE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_EXCH_RATE_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_EXCH_RATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_EXCH_RATE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getCUR_CD());
				if(isNull(data.getCUR_CD())) isNull = true;
				ary.addElement(data.getEXCH_TYP());
				if(isNull(data.getEXCH_TYP())) isNull = true;
				ary.addElement(data.getSALES_DATE());
				if(isNull(data.getSALES_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getEXCH_TYP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSALES_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setEXCH_RATE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_EXCH_RATE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_EXCH_RATE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_EXCH_RATE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_EXCH_RATE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_EXCH_RATE_clear

			return;
		}

		/**
		 * SelectM_EXCH_RATEクラスの標準コンストラクタ
		 */
		public SelectM_EXCH_RATE()
		{
			//{{user_implement_dev:SelectM_EXCH_RATE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_EXCH_RATE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class InsertT_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_AR_LEDGER_H_TRN(COMPANY_CD, SLIP_TYP, SLIP_CTRL_GRP, SLIP_CD, SLIP_DATE, INSPC_ACPT_CRCT_TYP, SLIP_TRN_CD, STOCK_CLASS_CD, BALANCE_CLASS_CD, SALES_DATE, SALES_ORG_CD, SALES_PERSON_CD, CUST_CD, CUST_NAME, DLV_LOC_CD, DLV_LOC_NAME, DLV_ADDRESSEE_1, DLV_ZIP_CD, DLV_ADDRESS_1, DLV_ADDRESS_2, CUST_VARIOUS_TYP, SHIP_SLIP_ID, CARRIAGE_CHARGE_TYP, ODR_DATE, SCDL_SHIP_DATE, SCDL_DLV_DATE, SHIP_DATE, DLV_INST_TYP, PUCH_ODR_CD, EXPL_TYP, ODR_SLIP_TYP, ODR_SLIP_CD, ODR_SLIP_DATE, SHIP_INST_SLIP_TYP, SHIP_INST_SLIP_CD, SHIP_INST_SLIP_DATE, DLV_KEY_NO, SHIP_TYP, SHIP_SLIP_TYP, SHIP_SLIP_CD, SHIP_SLIP_DATE, SLIP_PRINTING_TYP_1, SLIP_PRINTING_TYP_2, SLIP_PRINTING_TYP_3, SLIP_PRINTING_TYP_4, SLIP_PRINTING_TYP_5, TAX_CALC_TYP, TAX_APPLY_TYP, TEMP_UNIT_PRICE_SALES_FLG, INSPC_ACPT_TYP, EXPORT_TRN_TYP, EXPORT_INSPC_ACPT_TYP, CLAIM_CYCLE_TYP, CLAIM_CYCLE_TIMES, RM_INP_TYP, STL_COND_CD, BILL_ADDRESSEE_CD, CUR_CD, EXCH_TYP, EXCH_RATE, SHIP_AMOUNT, SHIP_COST_AMOUNT, SALES_AMOUNT, SALES_COST_AMOUNT, EXTERNAL_TAX_SALES_AMOUNT, INTERNAL_TAX_SALES_AMOUNT, TAXFREE_SALES_AMOUNT, TAX_CREDIT_SALES_AMOUNT, EXTERNAL_TAX_AMOUNT, INTERNAL_TAX_AMOUNT, TAX_AMOUNT_1, TAX_AMOUNT_2, TAX_AMOUNT_3, COCK_TYP, CUST_TAX_TYP, CUST_TAXATION_TYP, STL_COND_TYP, CONTRACT_COND_TYP, PUCH_ODR_SHAP_TYP, QTY_CONTRACT_TYP, REMARKS, EDI_DATA_TYP, DATA_IN_TYP, OWN_SLIP_ISS_FLG, SALES_SLIP_ISS_FLG, SALES_REPORT_ISS_FLG, SHIP_MODIFICATION_FLG, SALES_MODIFICATION_FLG, STATUS, CRCT_FLG, AR_BALANCE_CTRL_FLG, AR_BALANCE_OUT_FLG, NON_BILL_PRINT_FLG, CLAIM_DATE_CHG_FLG, OWN_CUR_SHIP_AMOUNT, OWN_CUR_SHIP_COST_AMOUNT, OWN_CUR_SALES_AMOUNT, OWN_CUR_SALES_COST_AMOUNT, OWN_CUR_TAXCREDIT_SALES_AMOUNT, DIRECT_DLV_TYP) "
+"VALUES "
+"  (?, 14, ?, ?, ?, 2, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 1, ?, 0, 0, ?, ?, 0, ?, ?, ?, 4, 0, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 1, 3, ?, 0, ?, ?, ?, ?, ?, ?, 0, 0, ?, 0, ?, ?, ?, ?, ?, ?, ?, ?, ?, 1, 0, 0, 0, 0, 0, 0, ?, ?, 1, 0, 0, 0, 0, 0, ?, 0, 1, 0, 0, 0, 0, 0, ?, 0, ?, 1)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KZ1010P001";
		protected String m_sUpdateProgramName="KZ1010P001";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:InsertT_AR_LEDGER_H_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:InsertT_AR_LEDGER_H_TRN_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getCOMPANY_CD(), stmt);
				setString(8, data.getSLIP_CTRL_GRP(), stmt);
				setString(9, data.getSLIP_CD(), stmt);
				setString(10, data.getSLIP_DATE(), stmt);
				setString(11, data.getSLIP_TRN_CD(), stmt);
				setString(12, data.getSTOCK_CLASS_CD(), stmt);
				setString(13, data.getBALANCE_CLASS_CD(), stmt);
				setString(14, data.getSALES_DATE(), stmt);
				setString(15, data.getSALES_DEPT_CD(), stmt);
				setString(16, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(17, data.getCUST_CD(), stmt);
				setString(18, data.getCUST_NAME(), stmt);
				setString(19, data.getDLV_LOC_CD(), stmt);
				setString(20, data.getDLV_LOC_NAME(), stmt);
				setString(21, data.getDLV_LOC_NAME(), stmt);
				setString(22, data.getZIP_CD(), stmt);
				setString(23, data.getADDRESS_1(), stmt);
				setString(24, data.getADDRESS_2(), stmt);
				setString(25, data.getCUST_VARIOUS_TYP(), stmt);
				setString(26, data.getSHIP_SLIP_ID(), stmt);
				setString(27, data.getCARRIAGE_CHARGE_TYP(), stmt);
				setString(28, data.getUNCNFM_CUST_ODR_CREATE_DATE(), stmt);
				setString(29, data.getSHIP_PLAN_DATE(), stmt);
				setString(30, data.getSCDL_DLV_DATE(), stmt);
				setString(31, data.getSHIP_DATE(), stmt);
				setString(32, data.getCUST_ODR_NO(), stmt);
				setString(33, data.getODR_CTL_NO(), stmt);
				setString(34, data.getUNCNFM_CUST_ODR_CREATE_DATE(), stmt);
				setString(35, data.getSHIP_ODR_NO(), stmt);
				setString(36, data.getSHIP_PLAN_DATE(), stmt);
				setString(37, data.getCUS_DLV_KEY_CD(), stmt);
				setString(38, data.getSHIP_SLIP_CD(), stmt);
				setString(39, data.getSHIP_DATE(), stmt);
				setString(40, data.getSLIP_PRINTING_TYP_1(), stmt);
				setString(41, data.getSLIP_PRINTING_TYP_2(), stmt);
				setString(42, data.getSLIP_PRINTING_TYP_3(), stmt);
				setString(43, data.getSLIP_PRINTING_TYP_4(), stmt);
				setString(44, data.getSLIP_PRINTING_TYP_5(), stmt);
				setString(45, data.getTAX_CALC_TYP(), stmt);
				setString(46, data.getTAX_APPLY_TYP(), stmt);
				setString(47, data.getTEMP_UNIT_PRICE_SALES_FLG(), stmt);
				setString(48, data.getINSPC_ACPT_TYP(), stmt);
				setString(49, data.getCLAIM_CYCLE_TYP(), stmt);
				setString(50, data.getRM_INP_TYP(), stmt);
				setString(51, data.getSTL_COND_CD(), stmt);
				setString(52, data.getBILL_ADDRESSEE_CD(), stmt);
				setString(53, data.getCUR_CD(), stmt);
				setString(54, data.getEXCH_TYP(), stmt);
				setString(55, data.getEXCH_RATE(), stmt);
				setString(56, data.getSALES_AMOUNT(), stmt);
				setString(57, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(58, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(59, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(60, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(61, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(62, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(63, data.getTAX_AMOUNT_1(), stmt);
				setString(64, data.getTAX_AMOUNT_2(), stmt);
				setString(65, data.getTAX_AMOUNT_3(), stmt);
				setString(66, data.getREMARKS(), stmt);
				setString(67, data.getEDI_DATA_TYP(), stmt);
				setString(68, data.getSTATUS(), stmt);
				setString(69, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(70, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);

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
			//{{user_implement_dev:InsertT_AR_LEDGER_H_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:InsertT_AR_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * InsertT_AR_LEDGER_H_TRNクラスの標準コンストラクタ
		 */
		public InsertT_AR_LEDGER_H_TRN()
		{
			//{{user_implement_dev:InsertT_AR_LEDGER_H_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:InsertT_AR_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_TAX extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_TAX.\"OLD_TAX_RATE_1\", "
+"  M_TAX.\"OLD_TAX_RATE_2\", "
+"  M_TAX.\"OLD_TAX_RATE_3\", "
+"  TO_CHAR(M_TAX.\"NEW_TAX_RATE_START_DATE\", 'YYYY/MM/DD'), "
+"  M_TAX.\"NEW_TAX_RATE_1\", "
+"  M_TAX.\"NEW_TAX_RATE_2\", "
+"  M_TAX.\"NEW_TAX_RATE_3\", "
+"  M_TAX.\"ROUND_TYP\" "
+"from "
+"  M_TAX "
+"where "
+"  M_TAX.\"TAX_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_TAX_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_TAX_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_TAX_read
			if(m_selcmd==null) throw new FoundationException("SelectM_TAX", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_TAX_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_TAX_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_TAX", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_TAX_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_TAX_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_TAX", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_TAX_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getTAX_CD());
				if(isNull(data.getTAX_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getTAX_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setOLD_TAX_RATE_1( getString(1, rs) );
			data.setOLD_TAX_RATE_2( getString(2, rs) );
			data.setOLD_TAX_RATE_3( getString(3, rs) );
			data.setNEW_TAX_RATE_START_DATE( getString(4, rs) );
			data.setNEW_TAX_RATE_1( getString(5, rs) );
			data.setNEW_TAX_RATE_2( getString(6, rs) );
			data.setNEW_TAX_RATE_3( getString(7, rs) );
			data.setROUND_TYP( getString(8, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_TAX", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_TAX_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_TAX_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_TAX_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_TAX_clear

			return;
		}

		/**
		 * SelectM_TAXクラスの標準コンストラクタ
		 */
		public SelectM_TAX()
		{
			//{{user_implement_dev:SelectM_TAX_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_TAX_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_CUR extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CUR.\"DECIMAL_FIG\" as \"DECIMAL_FIG\" "
+"from "
+"  M_CUR "
+"where "
+"  M_CUR.\"CUR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_CUR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_CUR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUR_read
			if(m_selcmd==null) throw new FoundationException("SelectM_CUR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CUR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUR_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CUR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUR_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_CUR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCUR_CD());
				if(isNull(data.getCUR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCUR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setDECIMAL_FIG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_CUR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_CUR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_CUR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_CUR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_CUR_clear

			return;
		}

		/**
		 * SelectM_CURクラスの標準コンストラクタ
		 */
		public SelectM_CUR()
		{
			//{{user_implement_dev:SelectM_CUR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_CUR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class InsertT_AR_LEDGER_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_AR_LEDGER_TRN(\"COMPANY_CD\", \"SLIP_CTRL_GRP\", \"SLIP_CD\", \"SLIP_DATE\", \"SEQ_NO\", \"LINE_NO\", \"LINE_TYP\", \"COMM_CD\", \"COMM_NAME\", \"ITEM_CD\", \"SPEC\", \"TAX_CD_1\", \"TAX_CD_2\", \"PRICE_RANK_CD\", \"INP_UNIT_PRICE\", \"UNIT_PRICE_TYP\", \"SALES_QTY\", \"PART_DLV_TIMES\", \"PART_DLV_TYP\", \"CUST_COMM_CD\", \"CUST_COMM_NAME\", \"CUST_ODR_SLIP_CD\", \"CUST_UNIT_PRICE_TYP\", \"INSPC_ACPT_DATE\", \"INSPC_ACPT_QTY\", \"SALES_AMOUNT\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_SALES_AMOUNT\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", \"SLIP_TYP\", \"DISP_UNIT_PRICE\", \"TEMP_UNIT_PRICE\", \"DISP_UNIT_COST\", \"INP_UNIT_COST\", \"DLV_INST_QTY\", \"SHIP_INST_TIMES\", \"SHIP_INST_QTY\", \"SHIP_TIMES\", \"SHIP_QTY\", \"UNIT_EXCH_RATES\", \"PKG_QTY\", \"PKG_UNIT_EXCH_RATES\", \"CUST_ODR_LINE_NO\", \"CUST_UNIT_PRICE\", \"CONS_TYP\", \"INSPC_TYP\", \"ODR_LINE_NO\", \"SHIP_INST_LINE_NO\", \"SHIP_LINE_NO\", \"SHIP_AMOUNT\", \"SHIP_COST_AMOUNT\", \"SALES_COST_AMOUNT\", \"CUST_REC_MONTH\", \"CUST_INSPC_ACPT_UNIT_PRICE\", \"CUST_INSPC_ACPT_TYP\", \"CUST_INSPC_ACPT_AMOUNT\", \"RETURN_QTY\", \"RETURN_AMOUNT\", \"CUST_RETURN_UNIT_PRICE\", \"CUST_RETURN_AMOUNT\", \"RETURN_CD\", \"SUBSTITUTE_TYP\", \"STRATEGIC_GOODS_TYP\", \"COMM_VARIOUS_TYP\", \"STOCK_CTRL_FLG\", \"OWN_CUR_SHIP_AMOUNT\", \"OWN_CUR_SHIP_COST_AMOUNT\", \"OWN_CUR_SALES_COST_AMOUNT\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, ?, 0, 0, 0)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KZ1010P001";
		protected String m_sUpdateProgramName="KZ1010P001";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:InsertT_AR_LEDGER_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:InsertT_AR_LEDGER_TRN_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getCOMPANY_CD(), stmt);
				setString(8, data.getSLIP_CTRL_GRP(), stmt);
				setString(9, data.getSLIP_CD(), stmt);
				setString(10, data.getSLIP_DATE(), stmt);
				setString(11, data.getSEQ_NO(), stmt);
				setString(12, data.getLINE_NO(), stmt);
				setString(13, data.getLINE_TYP(), stmt);
				setString(14, data.getCOMM_CD(), stmt);
				setString(15, data.getCOMM_NAME(), stmt);
				setString(16, data.getITEM_CD(), stmt);
				setString(17, data.getSPEC(), stmt);
				setString(18, data.getTAX_CD(), stmt);
				setString(19, data.getTAX_CD_2(), stmt);
				setString(20, data.getPRICE_RANK_CD(), stmt);
				setString(21, data.getINP_UNIT_PRICE(), stmt);
				setString(22, data.getUNIT_COST_TYP(), stmt);
				setString(23, data.getSLIP_QTY(), stmt);
				setString(24, data.getPART_DLV_TIMES(), stmt);
				setString(25, data.getPART_DLV_TYP(), stmt);
				setString(26, data.getCUST_COMM_CD(), stmt);
				setString(27, data.getCUST_COMM_NAME(), stmt);
				setString(28, data.getCUST_ODR_SLIP_CD(), stmt);
				setString(29, data.getCUST_UNIT_PRICE_TYP(), stmt);
				setString(30, data.getINSPC_ACPT_DATE(), stmt);
				setString(31, data.getINSPC_ACPT_QTY(), stmt);
				setString(32, data.getSALES_AMOUNT(), stmt);
				setString(33, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(34, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(35, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(36, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(37, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(38, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(39, data.getTAX_AMOUNT_1(), stmt);
				setString(40, data.getTAX_AMOUNT_2(), stmt);
				setString(41, data.getTAX_AMOUNT_3(), stmt);
				setString(42, data.getOWN_CUR_SALES_AMOUNT(), stmt);
				setString(43, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(44, data.getSTOCK_CTRL_FLG(), stmt);

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
			//{{user_implement_dev:InsertT_AR_LEDGER_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:InsertT_AR_LEDGER_TRN_clear

			return;
		}

		/**
		 * InsertT_AR_LEDGER_TRNクラスの標準コンストラクタ
		 */
		public InsertT_AR_LEDGER_TRN()
		{
			//{{user_implement_dev:InsertT_AR_LEDGER_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:InsertT_AR_LEDGER_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"SPEC\" as \"SPEC\" "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_read
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setSPEC( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_ITEM_clear

			return;
		}

		/**
		 * SelectM_ITEMクラスの標準コンストラクタ
		 */
		public SelectM_ITEM()
		{
			//{{user_implement_dev:SelectM_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_AR_LEDGER_H_TRN.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_AR_LEDGER_H_TRN "
+"where "
+"  T_AR_LEDGER_H_TRN.\"COMPANY_CD\" = ? "
+"  and T_AR_LEDGER_H_TRN.\"SLIP_TYP\" = 14 "
+"  and T_AR_LEDGER_H_TRN.\"SLIP_CTRL_GRP\" = ? "
+"  and T_AR_LEDGER_H_TRN.\"SLIP_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_AR_LEDGER_H_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_AR_LEDGER_H_TRN_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_TRN_read
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER_H_TRN", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_TRN_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_TRN_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER_H_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_TRN_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_TRN_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER_H_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_TRN_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setDUMMY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER_H_TRN", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_TRN_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_TRN_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectT_AR_LEDGER_H_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * SelectT_AR_LEDGER_H_TRNクラスの標準コンストラクタ
		 */
		public SelectT_AR_LEDGER_H_TRN()
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class DeleteT_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  T_AR_LEDGER_H_TRN "
+"where "
+"  T_AR_LEDGER_H_TRN.\"COMPANY_CD\" = ? "
+"  and T_AR_LEDGER_H_TRN.\"SLIP_TYP\" = 14 "
+"  and T_AR_LEDGER_H_TRN.\"SLIP_CTRL_GRP\" = ? "
+"  and T_AR_LEDGER_H_TRN.\"SLIP_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KZ1010P001";
		protected String m_sUpdateProgramName="KZ1010P001";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:DeleteT_AR_LEDGER_H_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:DeleteT_AR_LEDGER_H_TRN_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getCOMPANY_CD(), stmt);
				setString(2, data.getSLIP_CTRL_GRP(), stmt);
				setString(3, data.getSLIP_CD(), stmt);

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
			//{{user_implement_dev:DeleteT_AR_LEDGER_H_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:DeleteT_AR_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * DeleteT_AR_LEDGER_H_TRNクラスの標準コンストラクタ
		 */
		public DeleteT_AR_LEDGER_H_TRN()
		{
			//{{user_implement_dev:DeleteT_AR_LEDGER_H_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:DeleteT_AR_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class DeleteT_AR_LEDGER_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  T_AR_LEDGER_TRN "
+"where "
+"  T_AR_LEDGER_TRN.\"COMPANY_CD\" = ? "
+"  and T_AR_LEDGER_TRN.\"SLIP_TYP\" = 14 "
+"  and T_AR_LEDGER_TRN.\"SLIP_CTRL_GRP\" = ? "
+"  and T_AR_LEDGER_TRN.\"SLIP_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KZ1010P001";
		protected String m_sUpdateProgramName="KZ1010P001";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:DeleteT_AR_LEDGER_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:DeleteT_AR_LEDGER_TRN_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getCOMPANY_CD(), stmt);
				setString(2, data.getSLIP_CTRL_GRP(), stmt);
				setString(3, data.getSLIP_CD(), stmt);

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
			//{{user_implement_dev:DeleteT_AR_LEDGER_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:DeleteT_AR_LEDGER_TRN_clear

			return;
		}

		/**
		 * DeleteT_AR_LEDGER_TRNクラスの標準コンストラクタ
		 */
		public DeleteT_AR_LEDGER_TRN()
		{
			//{{user_implement_dev:DeleteT_AR_LEDGER_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:DeleteT_AR_LEDGER_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class UpdateT_AR_LEDGER_H extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_AR_LEDGER_H "
+"set "
+"  \"CRCT_FLG\" = 1, "
+"  \"SALES_MODIFICATION_FLG\" = 1 "
+"where "
+"  T_AR_LEDGER_H.\"COMPANY_CD\" = ? "
+"  and T_AR_LEDGER_H.\"SLIP_TYP\" = 14 "
+"  and T_AR_LEDGER_H.\"SLIP_CTRL_GRP\" = ? "
+"  and T_AR_LEDGER_H.\"SLIP_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KZ1010P001";
		protected String m_sUpdateProgramName="KZ1010P001";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:UpdateT_AR_LEDGER_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:UpdateT_AR_LEDGER_H_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
				setString(4, data.getCOMPANY_CD(), stmt);
				setString(5, data.getSLIP_CTRL_GRP(), stmt);
				setString(6, data.getSLIP_CD(), stmt);

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
			//{{user_implement_dev:UpdateT_AR_LEDGER_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:UpdateT_AR_LEDGER_H_clear

			return;
		}

		/**
		 * UpdateT_AR_LEDGER_Hクラスの標準コンストラクタ
		 */
		public UpdateT_AR_LEDGER_H()
		{
			//{{user_implement_dev:UpdateT_AR_LEDGER_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:UpdateT_AR_LEDGER_H_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class InsertIntoT_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_AR_LEDGER_H_TRN "
+"SELECT "
+"  ? AS COMPANY_CD, "
+"  14 AS SLIP_TYP, "
+"  ? AS SLIP_CTRL_GRP, "
+"  ? AS SLIP_CD, "
+"  SLIP_DATE, "
+"  1 AS INSPC_ACPT_CRCT_TYP, "
+"  SLIP_CTRL_GRP AS ORGN_SLIP_CTRL_GRP, "
+"  SLIP_CD AS ORGN_SLIP_CD, "
+"  SLIP_DATE AS ORGN_SLIP_DATE, "
+"  SLIP_TRN_CD, "
+"  STOCK_CLASS_CD, "
+"  BALANCE_CLASS_CD, "
+"  SALES_DATE, "
+"  SALES_ORG_CD, "
+"  SALES_PERSON_CD, "
+"  SHIP_ORG_CD, "
+"  SHIP_WH_CD, "
+"  CUST_CD, "
+"  CUST_NAME, "
+"  BRANCH_CD, "
+"  BRANCH_NAME, "
+"  SALES_PROM_CD, "
+"  DLV_LOC_CD, "
+"  DLV_LOC_NAME, "
+"  DLV_ADDRESSEE_1, "
+"  DLV_ADDRESSEE_2, "
+"  DLV_ZIP_CD, "
+"  MUNICIPAL_CD, "
+"  DLV_ADDRESS_1, "
+"  DLV_ADDRESS_2, "
+"  DLV_CONTACT_TEL, "
+"  DIRECT_DLV_TYP, "
+"  CUST_VARIOUS_TYP, "
+"  SHIP_SLIP_ID, "
+"  TRANSPORT_CD, "
+"  TRANSPORT_SLIP_ID, "
+"  CARRIAGE_CHARGE_TYP, "
+"  ODR_DATE, "
+"  SCDL_SHIP_DATE, "
+"  SCDL_DLV_DATE, "
+"  DLV_TIME, "
+"  SHIP_DATE, "
+"  SCDL_ARRIVAL_DATE, "
+"  SCDL_ARRIVAL_TIME, "
+"  DLV_INST_TYP, "
+"  PUCH_ODR_CD, "
+"  EXPL_TYP, "
+"  EXPL_CD, "
+"  EXPL_NAME, "
+"  ODR_SLIP_TYP, "
+"  ODR_SLIP_CTRL_GRP, "
+"  ODR_SLIP_CD, "
+"  ODR_SLIP_DATE, "
+"  SHIP_INST_SLIP_TYP, "
+"  SHIP_INST_SLIP_CTRL_GRP, "
+"  SHIP_INST_SLIP_CD, "
+"  SHIP_INST_SLIP_DATE, "
+"  DLV_NO, "
+"  DLV_KEY_NO, "
+"  SHIP_TYP, "
+"  SHIP_SLIP_TYP, "
+"  SHIP_SLIP_CTRL_GRP, "
+"  SHIP_SLIP_CD, "
+"  SHIP_SLIP_DATE, "
+"  OWN_SLIP_ISS_FLG, "
+"  SALES_SLIP_ID, "
+"  SLIP_PRINTING_TYP_1, "
+"  SLIP_PRINTING_TYP_2, "
+"  SLIP_PRINTING_TYP_3, "
+"  SLIP_PRINTING_TYP_4, "
+"  SLIP_PRINTING_TYP_5, "
+"  TAX_CALC_TYP, "
+"  TAX_APPLY_TYP, "
+"  TEMP_UNIT_PRICE_SALES_FLG, "
+"  INSPC_ACPT_TYP, "
+"  EXPORT_TRN_TYP, "
+"  EXPORT_INSPC_ACPT_TYP, "
+"  CLAIM_CYCLE_TYP, "
+"  CLAIM_CYCLE_TIMES, "
+"  RM_INP_TYP, "
+"  STL_COND_CD, "
+"  CLAIM_ORG_CD, "
+"  BILL_ADDRESSEE_CD, "
+"  BILL_ADDRESSEE_NAME, "
+"  CLAIM_DATE, "
+"  COLLECT_DATE, "
+"  CUR_CD, "
+"  EXCH_TYP, "
+"  EXCH_RESERVE_CD, "
+"  EXCH_DATE, "
+"  EXCH_RATE, "
+"  SHIP_AMOUNT * - 1 AS SHIP_AMOUNT, "
+"  SHIP_COST_AMOUNT * - 1 AS SHIP_COST_AMOUNT, "
+"  SALES_AMOUNT * - 1 AS SALES_AMOUNT, "
+"  SALES_COST_AMOUNT * - 1 AS SALES_COST_AMOUNT, "
+"  EXTERNAL_TAX_SALES_AMOUNT * - 1 AS EXTERNAL_TAX_SALES_AMOUNT, "
+"  INTERNAL_TAX_SALES_AMOUNT * - 1 AS INTERNAL_TAX_SALES_AMOUNT, "
+"  TAXFREE_SALES_AMOUNT * - 1 AS TAXFREE_SALES_AMOUNT, "
+"  TAX_CREDIT_SALES_AMOUNT * - 1 AS TAX_CREDIT_SALES_AMOUNT, "
+"  EXTERNAL_TAX_AMOUNT * - 1 AS EXTERNAL_TAX_AMOUNT, "
+"  INTERNAL_TAX_AMOUNT * - 1 AS INTERNAL_TAX_AMOUNT, "
+"  TAX_AMOUNT_1 * - 1 AS TAX_AMOUNT_1, "
+"  TAX_AMOUNT_2 * - 1 AS TAX_AMOUNT_2, "
+"  TAX_AMOUNT_3 * - 1 AS TAX_AMOUNT_3, "
+"  CLIENT_CD, "
+"  BUYER_ORG_CD, "
+"  BUYER_ORG_NAME, "
+"  BUYER_CD, "
+"  BUYER_NAME, "
+"  PRODUCT_CD, "
+"  COCK_TYP, "
+"  CUST_ODR_DATE, "
+"  CUST_TAX_TYP, "
+"  CUST_TAXATION_TYP, "
+"  STL_COND_TYP, "
+"  CONTRACT_COND_TYP, "
+"  PUCH_ODR_SHAP_TYP, "
+"  QTY_CONTRACT_TYP, "
+"  MASTER_PUCH_ODR_CD, "
+"  PACKAGE_DLV_CD, "
+"  REMARKS, "
+"  CLIENT_BARCODE_INF, "
+"  CLIENT_REMARK, "
+"  CUST_CONSTRUCT_NAME, "
+"  FREE_TEXT, "
+"  TRUSTEE_BARCODE_INF, "
+"  TRUSTEE_REMARK, "
+"  TRUSTEE_CD, "
+"  EDI_DATA_TYP, "
+"  DATA_IN_TYP, "
+"  OWN_SALES_SLIP_ISS_FLG, "
+"  SALES_SLIP_ISS_FLG, "
+"  SALES_REPORT_ISS_FLG, "
+"  SHIP_MODIFICATION_FLG, "
+"  SALES_MODIFICATION_FLG, "
+"  20 AS STATUS, "
+"  CRCT_FLG, "
+"  APPROVAL_DATE, "
+"  APPROVAL_CD, "
+"  APPROVAL_RSRV_DATE, "
+"  APPROVAL_RSRV_CD, "
+"  RSN_CD, "
+"  RECORDING_DATE, "
+"  RECORDING_MONTH, "
+"  RECORDING_PROC_DATE, "
+"  RECORDING_PROC_CD, "
+"  AR_BALANCE_CTRL_FLG, "
+"  AR_BALANCE_OUT_FLG, "
+"  AR_BALANCE_OUT_DATE, "
+"  BILL_BALANCE_CTRL_FLG, "
+"  BILL_BALANCE_EXTRACT_FLG, "
+"  BILL_BALANCE_EXTRACT_DATE, "
+"  NON_BILL_PRINT_FLG, "
+"  CLAIM_DATE_CHG_FLG, "
+"  REMARKS_1, "
+"  REMARKS_2, "
+"  OWN_CUR_SHIP_AMOUNT * - 1 AS OWN_CUR_SHIP_AMOUNT, "
+"  OWN_CUR_SHIP_COST_AMOUNT * - 1 AS OWN_CUR_SHIP_COST_AMOUNT, "
+"  OWN_CUR_SALES_AMOUNT * - 1 AS OWN_CUR_SALES_AMOUNT, "
+"  OWN_CUR_SALES_COST_AMOUNT * - 1 AS OWN_CUR_SALES_COST_AMOUNT, "
+"  OWN_CUR_TAXCREDIT_SALES_AMOUNT * - 1 AS OWN_CUR_TAXCREDIT_SALES_AMOUNT, "
+"  TO_DATE(?, 'YYYY/MM/DD HH24:MI:SS') AS CREATED_DATE, "
+"  ? AS CREATED_BY, "
+"  ? AS CREATED_PRG_NM, "
+"  TO_DATE(?, 'YYYY/MM/DD HH24:MI:SS') AS UPDATED_DATE, "
+"  ? AS UPDATED_BY, "
+"  ? AS UPDATED_PRG_NM, "
+"  0 AS MODIFY_COUNT "
+"FROM "
+"  T_AR_LEDGER_H "
+"WHERE "
+"  T_AR_LEDGER_H.\"COMPANY_CD\" = ? "
+"  AND T_AR_LEDGER_H.\"SLIP_TYP\" = 14 "
+"  AND T_AR_LEDGER_H.\"SLIP_CTRL_GRP\" = ? "
+"  AND T_AR_LEDGER_H.\"SLIP_CD\" = ?";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KZ1010P001";
		protected String m_sUpdateProgramName="KZ1010P001";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:InsertIntoT_AR_LEDGER_H_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:InsertIntoT_AR_LEDGER_H_TRN_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_inscmd);

				setString(1, data.getCOMPANY_CD(), stmt);
				setString(2, data.getSLIP_CTRL_GRP(), stmt);
				setString(3, data.getSLIP_CD2(), stmt);
				setString(4, data.getSYSTEMDATE(), stmt);
				setString(5, data.getSYSTEMUSER(), stmt);
				setString(6, data.getPROGRAMID(), stmt);
				setString(7, data.getSYSTEMDATE(), stmt);
				setString(8, data.getSYSTEMUSER(), stmt);
				setString(9, data.getPROGRAMID(), stmt);
				setString(10, data.getCOMPANY_CD(), stmt);
				setString(11, data.getSLIP_CTRL_GRP(), stmt);
				setString(12, data.getSLIP_CD(), stmt);

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
			//{{user_implement_dev:InsertIntoT_AR_LEDGER_H_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:InsertIntoT_AR_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * InsertIntoT_AR_LEDGER_H_TRNクラスの標準コンストラクタ
		 */
		public InsertIntoT_AR_LEDGER_H_TRN()
		{
			//{{user_implement_dev:InsertIntoT_AR_LEDGER_H_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:InsertIntoT_AR_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_AR_LEDGER extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_AR_LEDGER.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_AR_LEDGER "
+"where "
+"  T_AR_LEDGER.\"COMPANY_CD\" = ? "
+"  and T_AR_LEDGER.\"SLIP_TYP\" = 14 "
+"  and T_AR_LEDGER.\"SLIP_CTRL_GRP\" = ? "
+"  and T_AR_LEDGER.\"SLIP_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_AR_LEDGER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_AR_LEDGER_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_read
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_AR_LEDGER_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_AR_LEDGER_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_AR_LEDGER_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setDUMMY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_AR_LEDGER_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectT_AR_LEDGER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_AR_LEDGER_clear

			return;
		}

		/**
		 * SelectT_AR_LEDGERクラスの標準コンストラクタ
		 */
		public SelectT_AR_LEDGER()
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_AR_LEDGER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class InsertIntoT_AR_LEDGER_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_AR_LEDGER_TRN "
+"SELECT "
+"  ? AS COMPANY_CD, "
+"  14 AS SLIP_TYP, "
+"  ? AS SLIP_CTRL_GRP, "
+"  ? AS SLIP_CD, "
+"  SLIP_DATE, "
+"  SEQ_NO, "
+"  LINE_NO, "
+"  LINE_TYP, "
+"  COMM_CD, "
+"  COMM_NAME, "
+"  COMM_ENAME, "
+"  JAN_CD, "
+"  EXPORT_COMM_CD, "
+"  ITEM_CD, "
+"  SPEC, "
+"  COMM_SIZE, "
+"  COLOR, "
+"  TAX_CD_1, "
+"  TAX_CD_2, "
+"  PRICE_RANK_CD, "
+"  DISP_UNIT_PRICE, "
+"  INP_UNIT_PRICE, "
+"  UNIT_PRICE_TYP, "
+"  TEMP_UNIT_PRICE, "
+"  DISP_UNIT_COST, "
+"  INP_UNIT_COST, "
+"  SALES_QTY * - 1, "
+"  DLV_INST_QTY * - 1, "
+"  SHIP_INST_TIMES, "
+"  SHIP_INST_QTY * - 1, "
+"  SHIP_TIMES, "
+"  PART_DLV_TIMES, "
+"  PART_DLV_TYP, "
+"  SHIP_QTY * - 1, "
+"  STOCK_UNIT, "
+"  UNIT_EXCH_RATES, "
+"  EXCH_UNIT, "
+"  PKG_CD, "
+"  PKG_NAME, "
+"  PKG_QTY, "
+"  PKG_UNIT, "
+"  PKG_UNIT_EXCH_RATES, "
+"  PKG_EXCH_UNIT, "
+"  CUST_COMM_CD, "
+"  CUST_COMM_NAME, "
+"  CUST_COMM_SPEC, "
+"  CUST_ODR_SLIP_CD, "
+"  CUST_ODR_LINE_NO, "
+"  CUST_UNIT_PRICE, "
+"  CUST_UNIT_PRICE_TYP, "
+"  CUST_UNIT, "
+"  CONS_TYP, "
+"  INSPC_TYP, "
+"  SHIP_PACKING_CD, "
+"  SHIP_MFLOT_CD1, "
+"  SHIP_MFLOT_CD2, "
+"  SHIP_MFLOT_CD3, "
+"  SHIP_MFLOT_CD4, "
+"  SHIP_MFLOT_CD5, "
+"  REMARKS_1, "
+"  REMARKS_2, "
+"  ODR_LINE_NO, "
+"  SHIP_INST_LINE_NO, "
+"  SHIP_LINE_NO, "
+"  SHIP_AMOUNT * - 1, "
+"  SHIP_COST_AMOUNT * - 1, "
+"  INSPC_ACPT_DATE, "
+"  INSPC_ACPT_QTY * - 1, "
+"  SALES_AMOUNT * - 1, "
+"  SALES_COST_AMOUNT * - 1, "
+"  EXTERNAL_TAX_SALES_AMOUNT * - 1, "
+"  INTERNAL_TAX_SALES_AMOUNT * - 1, "
+"  TAXFREE_SALES_AMOUNT * - 1, "
+"  TAX_CREDIT_SALES_AMOUNT * - 1, "
+"  EXTERNAL_TAX_AMOUNT * - 1, "
+"  INTERNAL_TAX_AMOUNT * - 1, "
+"  TAX_AMOUNT_1 * - 1, "
+"  TAX_AMOUNT_2 * - 1, "
+"  TAX_AMOUNT_3 * - 1, "
+"  CUST_REC_MONTH, "
+"  CUST_INSPC_ACPT_UNIT_PRICE, "
+"  CUST_INSPC_ACPT_TYP, "
+"  CUST_INSPC_ACPT_AMOUNT * - 1, "
+"  RETURN_DATE, "
+"  RETURN_QTY * - 1, "
+"  RETURN_AMOUNT * - 1, "
+"  CUST_RETURN_UNIT_PRICE, "
+"  CUST_RETURN_AMOUNT * - 1, "
+"  RETURN_CD, "
+"  RETURN_REASON, "
+"  RETURN_METHOD, "
+"  SUBSTITUTE_TYP, "
+"  RETURN_REMARK, "
+"  STRATEGIC_GOODS_TYP, "
+"  COMM_VARIOUS_TYP, "
+"  STOCK_CTRL_FLG, "
+"  OWN_CUR_SHIP_AMOUNT * - 1, "
+"  OWN_CUR_SHIP_COST_AMOUNT * - 1, "
+"  OWN_CUR_SALES_AMOUNT * - 1, "
+"  OWN_CUR_SALES_COST_AMOUNT * - 1, "
+"  OWN_CUR_TAXCREDIT_SALES_AMOUNT * - 1, "
+"  TO_DATE(?, 'YYYY/MM/DD HH24:MI:SS') AS CREATED_DATE, "
+"  ? AS CREATED_BY, "
+"  ? AS CREATED_PRG_NM, "
+"  TO_DATE(?, 'YYYY/MM/DD HH24:MI:SS') AS UPDATED_DATE, "
+"  ? AS UPDATED_BY, "
+"  ? AS UPDATED_PRG_NM, "
+"  0 AS MODIFY_COUNT "
+"FROM "
+"  T_AR_LEDGER "
+"WHERE "
+"  T_AR_LEDGER.\"COMPANY_CD\" = ? "
+"  AND T_AR_LEDGER.\"SLIP_TYP\" = 14 "
+"  AND T_AR_LEDGER.\"SLIP_CTRL_GRP\" = ? "
+"  AND T_AR_LEDGER.\"SLIP_CD\" = ?";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KZ1010P001";
		protected String m_sUpdateProgramName="KZ1010P001";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:InsertIntoT_AR_LEDGER_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:InsertIntoT_AR_LEDGER_TRN_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_inscmd);

				setString(1, data.getCOMPANY_CD(), stmt);
				setString(2, data.getSLIP_CTRL_GRP(), stmt);
				setString(3, data.getSLIP_CD2(), stmt);
				setString(4, data.getSYSTEMDATE(), stmt);
				setString(5, data.getSYSTEMUSER(), stmt);
				setString(6, data.getPROGRAMID(), stmt);
				setString(7, data.getSYSTEMDATE(), stmt);
				setString(8, data.getSYSTEMUSER(), stmt);
				setString(9, data.getPROGRAMID(), stmt);
				setString(10, data.getCOMPANY_CD(), stmt);
				setString(11, data.getSLIP_CTRL_GRP(), stmt);
				setString(12, data.getSLIP_CD(), stmt);

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
			//{{user_implement_dev:InsertIntoT_AR_LEDGER_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:InsertIntoT_AR_LEDGER_TRN_clear

			return;
		}

		/**
		 * InsertIntoT_AR_LEDGER_TRNクラスの標準コンストラクタ
		 */
		public InsertIntoT_AR_LEDGER_TRN()
		{
			//{{user_implement_dev:InsertIntoT_AR_LEDGER_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:InsertIntoT_AR_LEDGER_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_AR_LEDGER_H extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_AR_LEDGER_H.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_AR_LEDGER_H "
+"where "
+"  T_AR_LEDGER_H.\"COMPANY_CD\" = ? "
+"  and T_AR_LEDGER_H.\"SLIP_TYP\" = 14 "
+"  and T_AR_LEDGER_H.\"SLIP_CTRL_GRP\" = ? "
+"  and T_AR_LEDGER_H.\"SLIP_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_AR_LEDGER_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_AR_LEDGER_H_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KZ1010P001Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_read
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER_H", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER_H", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KZ1010P001Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER_H", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KZ1010P001Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KZ1010P001Struct data = new KZ1010P001Struct();

			data.setDUMMY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_AR_LEDGER_H", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KZ1010P001Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KZ1010P001Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KZ1010P001Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectT_AR_LEDGER_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_clear

			return;
		}

		/**
		 * SelectT_AR_LEDGER_Hクラスの標準コンストラクタ
		 */
		public SelectT_AR_LEDGER_H()
		{
			//{{user_implement_dev:SelectT_AR_LEDGER_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_AR_LEDGER_H_constractor

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
		mSelectSYS_MY_COMPANY.clear();
		mSelectSYS_MY_COMPANY = null;
		mSelectSYS_AR_CTRL.clear();
		mSelectSYS_AR_CTRL = null;
		mSelectSYS_CLASS_CODE.clear();
		mSelectSYS_CLASS_CODE = null;
		mSelectM_SLIP_TRN.clear();
		mSelectM_SLIP_TRN = null;
		mSelectSYS_HOME_CUR.clear();
		mSelectSYS_HOME_CUR = null;
		mSelectT_SALES.clear();
		mSelectT_SALES = null;
		mSelectT_SHIP.clear();
		mSelectT_SHIP = null;
		mSelectT_SHIP_ODR.clear();
		mSelectT_SHIP_ODR = null;
		mSelectT_ODR.clear();
		mSelectT_ODR = null;
		mSelectM_CUST.clear();
		mSelectM_CUST = null;
		mSelectM_CUST_BRANCH.clear();
		mSelectM_CUST_BRANCH = null;
		mSelectM_CLAIM_CUST_CTRL.clear();
		mSelectM_CLAIM_CUST_CTRL = null;
		mSelectM_CUST_BASE.clear();
		mSelectM_CUST_BASE = null;
		mSelectM_ITEM_SPEC.clear();
		mSelectM_ITEM_SPEC = null;
		mSelectM_EXCH_RATE.clear();
		mSelectM_EXCH_RATE = null;
		mInsertT_AR_LEDGER_H_TRN.clear();
		mInsertT_AR_LEDGER_H_TRN = null;
		mSelectM_TAX.clear();
		mSelectM_TAX = null;
		mSelectM_CUR.clear();
		mSelectM_CUR = null;
		mInsertT_AR_LEDGER_TRN.clear();
		mInsertT_AR_LEDGER_TRN = null;
		mSelectM_ITEM.clear();
		mSelectM_ITEM = null;
		mSelectT_AR_LEDGER_H_TRN.clear();
		mSelectT_AR_LEDGER_H_TRN = null;
		mDeleteT_AR_LEDGER_H_TRN.clear();
		mDeleteT_AR_LEDGER_H_TRN = null;
		mDeleteT_AR_LEDGER_TRN.clear();
		mDeleteT_AR_LEDGER_TRN = null;
		mUpdateT_AR_LEDGER_H.clear();
		mUpdateT_AR_LEDGER_H = null;
		mInsertIntoT_AR_LEDGER_H_TRN.clear();
		mInsertIntoT_AR_LEDGER_H_TRN = null;
		mSelectT_AR_LEDGER.clear();
		mSelectT_AR_LEDGER = null;
		mInsertIntoT_AR_LEDGER_TRN.clear();
		mInsertIntoT_AR_LEDGER_TRN = null;
		mSelectT_AR_LEDGER_H.clear();
		mSelectT_AR_LEDGER_H = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * KZ1010P001クラスの標準コンストラクタ
	 */
	public KZ1010P001Entity() throws FoundationException
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
