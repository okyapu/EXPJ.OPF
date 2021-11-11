/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0040/src/com/nec/jp/orteus/metamorBase/KM0040/KM0040010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0040;

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
 * CLASS     : KM0040010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class KM0040010Entity extends DataObject
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

	// selectT_PROJECE_ESTIMATEクラス インスタンス
	public selectT_PROJECE_ESTIMATE mselectT_PROJECE_ESTIMATE = new selectT_PROJECE_ESTIMATE();

	// selectT_PROJECE_ESTIMATE1クラス インスタンス
	public selectT_PROJECE_ESTIMATE1 mselectT_PROJECE_ESTIMATE1 = new selectT_PROJECE_ESTIMATE1();

	// getCompanyInfoクラス インスタンス
	public getCompanyInfo mgetCompanyInfo = new getCompanyInfo();


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
		String m_write_fname="KM0040010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="KM0040010";

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
	public class selectT_PROJECE_ESTIMATE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  * "
+"FROM "
+"  ( "
+"    SELECT "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_NAME\" AS \"PROJECT_NAME\", "
+"      V_PROJECE_ESTIMATE.\"CUST_CD\" AS \"CUST_CD\", "
+"      V_PROJECE_ESTIMATE.\"CUST_NAME\" AS \"CUST_NAME\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
+"      V_PROJECE_ESTIMATE.\"ACCURACY\" AS \"ACCURACY\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_STAT\" AS \"PROJECT_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"VEND_DATE\", 'YYYY/MM/DD') AS \"VEND_DATE\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\", 'YYYY/MM/DD') AS \"ASSUME_DLV_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT\" AS \"ASSUME_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT_EXCH_RATES\" AS \"ASSUME_AMOUNT_EXCH_RATES\", "
+"      V_PROJECE_ESTIMATE.\"PJ_ORG_CD\" AS \"PJ_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_1\" AS \"ORG_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"PJ_USER_CD\" AS \"PJ_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_1\" AS \"USER_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS1\" AS \"REMARKS1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS2\" AS \"REMARKS2\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS3\" AS \"REMARKS3\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS4\" AS \"REMARKS4\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS5\" AS \"REMARKS5\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" AS \"ESTIMATE_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\", 'YYYY/MM/DD') AS \"ESTIMATE_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET1\" AS \"ES_COMMET1\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET2\" AS \"ES_COMMET2\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET3\" AS \"ES_COMMET3\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET4\" AS \"ES_COMMET4\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET5\" AS \"ES_COMMET5\", "
+"      V_PROJECE_ESTIMATE.\"ES_ORG_CD\" AS \"ES_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_2\" AS \"ORG_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ES_USER_CD\" AS \"ES_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_2\" AS \"USER_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT\" AS \"ESTIMATE_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT_JPN\" AS \"ESTIMATE_AMOUNT_JPN\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK1\" AS \"ESREMARK1\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK2\" AS \"ESREMARK2\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK3\" AS \"ESREMARK3\" "
+"    FROM "
+"      V_PROJECE_ESTIMATE "
+"    WHERE "
+"      PROJECT_CD LIKE(?) "
+"      AND CUST_CD LIKE(?) "
+"      AND PJ_USER_CD = ? "
+"      AND ES_USER_CD = ? "
+"      AND TRUNC(VEND_DATE) >= TO_DATE(?) "
+"      AND TRUNC(VEND_DATE) <= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) >= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) <= TO_DATE(?) "
+"      AND TRUNC(ESTIMATE_DATE) >= TO_DATE(?) "
+"      AND TRUNC(ESTIMATE_DATE) <= TO_DATE(?) "
+"      AND(PROJECT_STAT = ? "
+"      OR  PROJECT_STAT = ? "
+"      OR  PROJECT_STAT = ? "
+"      OR  PROJECT_STAT = ? "
+"      OR  PROJECT_STAT = ?) "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_NAME\" AS \"PROJECT_NAME\", "
+"      V_PROJECE_ESTIMATE.\"CUST_CD\" AS \"CUST_CD\", "
+"      V_PROJECE_ESTIMATE.\"CUST_NAME\" AS \"CUST_NAME\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
+"      V_PROJECE_ESTIMATE.\"ACCURACY\" AS \"ACCURACY\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_STAT\" AS \"PROJECT_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"VEND_DATE\", 'YYYY/MM/DD') AS \"VEND_DATE\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\", 'YYYY/MM/DD') AS \"ASSUME_DLV_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT\" AS \"ASSUME_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT_EXCH_RATES\" AS \"ASSUME_AMOUNT_EXCH_RATES\", "
+"      V_PROJECE_ESTIMATE.\"PJ_ORG_CD\" AS \"PJ_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_1\" AS \"ORG_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"PJ_USER_CD\" AS \"PJ_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_1\" AS \"USER_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS1\" AS \"REMARKS1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS2\" AS \"REMARKS2\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS3\" AS \"REMARKS3\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS4\" AS \"REMARKS4\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS5\" AS \"REMARKS5\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" AS \"ESTIMATE_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\", 'YYYY/MM/DD') AS \"ESTIMATE_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET1\" AS \"ES_COMMET1\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET2\" AS \"ES_COMMET2\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET3\" AS \"ES_COMMET3\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET4\" AS \"ES_COMMET4\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET5\" AS \"ES_COMMET5\", "
+"      V_PROJECE_ESTIMATE.\"ES_ORG_CD\" AS \"ES_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_2\" AS \"ORG_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ES_USER_CD\" AS \"ES_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_2\" AS \"USER_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT\" AS \"ESTIMATE_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT_JPN\" AS \"ESTIMATE_AMOUNT_JPN\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK1\" AS \"ESREMARK1\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK2\" AS \"ESREMARK2\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK3\" AS \"ESREMARK3\" "
+"    FROM "
+"      V_PROJECE_ESTIMATE "
+"    WHERE "
+"      PROJECT_CD LIKE(?) "
+"      AND CUST_CD LIKE(?) "
+"      AND PJ_USER_CD = ? "
+"      AND ES_USER_CD = ? "
+"      AND TRUNC(VEND_DATE) >= TO_DATE(?) "
+"      AND TRUNC(VEND_DATE) <= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) >= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) <= TO_DATE(?) "
+"      AND PROJECT_STAT = ? "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  ) "
+"ORDER BY "
+"  PROJECT_CD, "
+"  ESTIMATE_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_PROJECE_ESTIMATE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_PROJECE_ESTIMATE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_read
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_read2
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_read3
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ESTIMATE_DATE());
				if(isNull(data.getFROM_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getTO_ESTIMATE_DATE());
				if(isNull(data.getTO_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getInC2_PROJECT_STAT());
				if(isNull(data.getInC2_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC3_PROJECT_STAT());
				if(isNull(data.getInC3_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC4_PROJECT_STAT());
				if(isNull(data.getInC4_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC5_PROJECT_STAT());
				if(isNull(data.getInC5_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC6_PROJECT_STAT());
				if(isNull(data.getInC6_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getInC1_PROJECT_STAT());
				if(isNull(data.getInC1_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_PROJECE_ESTIMATE", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ESTIMATE_DATE())) setString(no ++, data.getFROM_ESTIMATE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ESTIMATE_DATE())) setString(no ++, data.getTO_ESTIMATE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_PROJECT_STAT())) setString(no ++, data.getInC2_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_PROJECT_STAT())) setString(no ++, data.getInC3_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC4_PROJECT_STAT())) setString(no ++, data.getInC4_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC5_PROJECT_STAT())) setString(no ++, data.getInC5_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC6_PROJECT_STAT())) setString(no ++, data.getInC6_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_PROJECT_STAT())) setString(no ++, data.getInC1_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0040010Struct data = new KM0040010Struct();

			data.setPROJECT_CD( getString(1, rs) );
			data.setPROJECT_NAME( getString(2, rs) );
			data.setCUST_CD( getString(3, rs) );
			data.setCUST_NAME( getString(4, rs) );
			data.setDLV_LOC_CD( getString(5, rs) );
			data.setDLV_LOC_NAME( getString(6, rs) );
			data.setACCURACY( getString(7, rs) );
			data.setPROJECT_STAT( getString(8, rs) );
			data.setVEND_DATE( getString(9, rs) );
			data.setASSUME_DLV_DATE( getString(10, rs) );
			data.setASSUME_AMOUNT( getString(11, rs) );
			data.setCUR_UNIT( getString(12, rs) );
			data.setASSUME_AMOUNT_EXCH_RATES( getString(13, rs) );
			data.setPJ_ORG_CD( getString(14, rs) );
			data.setORG_NAME_1( getString(15, rs) );
			data.setPJ_USER_CD( getString(16, rs) );
			data.setUSER_NAME_1( getString(17, rs) );
			data.setREMARKS1( getString(18, rs) );
			data.setREMARKS2( getString(19, rs) );
			data.setREMARKS3( getString(20, rs) );
			data.setREMARKS4( getString(21, rs) );
			data.setREMARKS5( getString(22, rs) );
			data.setESTIMATE_NO( getString(23, rs) );
			data.setESTIMATE_STAT( getString(24, rs) );
			data.setESTIMATE_DATE( getString(25, rs) );
			data.setES_COMMET1( getString(26, rs) );
			data.setES_COMMET2( getString(27, rs) );
			data.setES_COMMET3( getString(28, rs) );
			data.setES_COMMET4( getString(29, rs) );
			data.setES_COMMET5( getString(30, rs) );
			data.setES_ORG_CD( getString(31, rs) );
			data.setORG_NAME_2( getString(32, rs) );
			data.setES_USER_CD( getString(33, rs) );
			data.setUSER_NAME_2( getString(34, rs) );
			data.setESTIMATE_AMOUNT( getString(35, rs) );
			data.setESTIMATE_AMOUNT_JPN( getString(36, rs) );
			data.setESREMARK1( getString(37, rs) );
			data.setESREMARK2( getString(38, rs) );
			data.setESREMARK3( getString(39, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_clear

			return;
		}

		/**
		 * selectT_PROJECE_ESTIMATEクラスの標準コンストラクタ
		 */
		public selectT_PROJECE_ESTIMATE()
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_PROJECE_ESTIMATE1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  * "
+"FROM "
+"  ( "
+"    SELECT "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_NAME\" AS \"PROJECT_NAME\", "
+"      V_PROJECE_ESTIMATE.\"CUST_CD\" AS \"CUST_CD\", "
+"      V_PROJECE_ESTIMATE.\"CUST_NAME\" AS \"CUST_NAME\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
+"      V_PROJECE_ESTIMATE.\"ACCURACY\" AS \"ACCURACY\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_STAT\" AS \"PROJECT_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"VEND_DATE\", 'YYYY/MM/DD') AS \"VEND_DATE\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\", 'YYYY/MM/DD') AS \"ASSUME_DLV_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT\" AS \"ASSUME_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT_EXCH_RATES\" AS \"ASSUME_AMOUNT_EXCH_RATES\", "
+"      V_PROJECE_ESTIMATE.\"PJ_ORG_CD\" AS \"PJ_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_1\" AS \"ORG_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"PJ_USER_CD\" AS \"PJ_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_1\" AS \"USER_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS1\" AS \"REMARKS1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS2\" AS \"REMARKS2\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS3\" AS \"REMARKS3\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS4\" AS \"REMARKS4\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS5\" AS \"REMARKS5\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" AS \"ESTIMATE_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\", 'YYYY/MM/DD') AS \"ESTIMATE_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET1\" AS \"ES_COMMET1\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET2\" AS \"ES_COMMET2\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET3\" AS \"ES_COMMET3\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET4\" AS \"ES_COMMET4\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET5\" AS \"ES_COMMET5\", "
+"      V_PROJECE_ESTIMATE.\"ES_ORG_CD\" AS \"ES_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_2\" AS \"ORG_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ES_USER_CD\" AS \"ES_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_2\" AS \"USER_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT\" AS \"ESTIMATE_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT_JPN\" AS \"ESTIMATE_AMOUNT_JPN\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK1\" AS \"ESREMARK1\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK2\" AS \"ESREMARK2\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK3\" AS \"ESREMARK3\" "
+"    FROM "
+"      V_PROJECE_ESTIMATE, "
+"      ( "
+"        SELECT "
+"          V_PROJECE_ESTIMATE.\"PROJECT_CD\", "
+"          MAX(V_PROJECE_ESTIMATE.\"ESTIMATE_NO\") AS \"ESTIMATE_NO\" "
+"        FROM "
+"          V_PROJECE_ESTIMATE "
+"        WHERE "
+"          V_PROJECE_ESTIMATE.\"PROJECT_CD\" LIKE(?) "
+"          AND V_PROJECE_ESTIMATE.\"CUST_CD\" LIKE(?) "
+"          AND V_PROJECE_ESTIMATE.\"PJ_USER_CD\" = ? "
+"          AND V_PROJECE_ESTIMATE.\"ES_USER_CD\" = ? "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"VEND_DATE\") >= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"VEND_DATE\") <= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\") >= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\") <= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\") >= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\") <= TO_DATE(?) "
+"          AND(V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"          OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"          OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"          OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"          OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ?) "
+"          AND V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" != '9' "
+"        GROUP BY "
+"          V_PROJECE_ESTIMATE.\"PROJECT_CD\" "
+"      ) V_PROJECE_ESTIMATE1 "
+"    WHERE "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" LIKE(?) "
+"      AND V_PROJECE_ESTIMATE.\"CUST_CD\" LIKE(?) "
+"      AND V_PROJECE_ESTIMATE.\"PJ_USER_CD\" = ? "
+"      AND V_PROJECE_ESTIMATE.\"ES_USER_CD\" = ? "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"VEND_DATE\") >= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"VEND_DATE\") <= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\") >= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\") <= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\") >= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\") <= TO_DATE(?) "
+"      AND(V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"      OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"      OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"      OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"      OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ?) "
+"      AND V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" != '9' "
+"      AND V_PROJECE_ESTIMATE1.\"PROJECT_CD\" = V_PROJECE_ESTIMATE.\"PROJECT_CD\" "
+"      AND V_PROJECE_ESTIMATE1.\"ESTIMATE_NO\" = V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_NAME\" AS \"PROJECT_NAME\", "
+"      V_PROJECE_ESTIMATE.\"CUST_CD\" AS \"CUST_CD\", "
+"      V_PROJECE_ESTIMATE.\"CUST_NAME\" AS \"CUST_NAME\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
+"      V_PROJECE_ESTIMATE.\"ACCURACY\" AS \"ACCURACY\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_STAT\" AS \"PROJECT_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"VEND_DATE\", 'YYYY/MM/DD') AS \"VEND_DATE\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\", 'YYYY/MM/DD') AS \"ASSUME_DLV_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT\" AS \"ASSUME_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT_EXCH_RATES\" AS \"ASSUME_AMOUNT_EXCH_RATES\", "
+"      V_PROJECE_ESTIMATE.\"PJ_ORG_CD\" AS \"PJ_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_1\" AS \"ORG_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"PJ_USER_CD\" AS \"PJ_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_1\" AS \"USER_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS1\" AS \"REMARKS1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS2\" AS \"REMARKS2\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS3\" AS \"REMARKS3\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS4\" AS \"REMARKS4\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS5\" AS \"REMARKS5\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" AS \"ESTIMATE_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\", 'YYYY/MM/DD') AS \"ESTIMATE_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET1\" AS \"ES_COMMET1\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET2\" AS \"ES_COMMET2\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET3\" AS \"ES_COMMET3\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET4\" AS \"ES_COMMET4\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET5\" AS \"ES_COMMET5\", "
+"      V_PROJECE_ESTIMATE.\"ES_ORG_CD\" AS \"ES_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_2\" AS \"ORG_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ES_USER_CD\" AS \"ES_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_2\" AS \"USER_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT\" AS \"ESTIMATE_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT_JPN\" AS \"ESTIMATE_AMOUNT_JPN\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK1\" AS \"ESREMARK1\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK2\" AS \"ESREMARK2\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK3\" AS \"ESREMARK3\" "
+"    FROM "
+"      V_PROJECE_ESTIMATE "
+"    WHERE "
+"      PROJECT_CD LIKE(?) "
+"      AND CUST_CD LIKE(?) "
+"      AND PJ_USER_CD = ? "
+"      AND ES_USER_CD = ? "
+"      AND TRUNC(VEND_DATE) >= TO_DATE(?) "
+"      AND TRUNC(VEND_DATE) <= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) >= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) <= TO_DATE(?) "
+"      AND PROJECT_STAT = ? "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  ) "
+"ORDER BY "
+"  PROJECT_CD, "
+"  ESTIMATE_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_read
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_read2
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_read3
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ESTIMATE_DATE());
				if(isNull(data.getFROM_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getTO_ESTIMATE_DATE());
				if(isNull(data.getTO_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getInC2_PROJECT_STAT());
				if(isNull(data.getInC2_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC3_PROJECT_STAT());
				if(isNull(data.getInC3_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC4_PROJECT_STAT());
				if(isNull(data.getInC4_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC5_PROJECT_STAT());
				if(isNull(data.getInC5_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC6_PROJECT_STAT());
				if(isNull(data.getInC6_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ESTIMATE_DATE());
				if(isNull(data.getFROM_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getTO_ESTIMATE_DATE());
				if(isNull(data.getTO_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getInC2_PROJECT_STAT());
				if(isNull(data.getInC2_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC3_PROJECT_STAT());
				if(isNull(data.getInC3_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC4_PROJECT_STAT());
				if(isNull(data.getInC4_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC5_PROJECT_STAT());
				if(isNull(data.getInC5_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC6_PROJECT_STAT());
				if(isNull(data.getInC6_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getInC1_PROJECT_STAT());
				if(isNull(data.getInC1_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_PROJECE_ESTIMATE1", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ESTIMATE_DATE())) setString(no ++, data.getFROM_ESTIMATE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ESTIMATE_DATE())) setString(no ++, data.getTO_ESTIMATE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_PROJECT_STAT())) setString(no ++, data.getInC2_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_PROJECT_STAT())) setString(no ++, data.getInC3_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC4_PROJECT_STAT())) setString(no ++, data.getInC4_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC5_PROJECT_STAT())) setString(no ++, data.getInC5_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC6_PROJECT_STAT())) setString(no ++, data.getInC6_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ESTIMATE_DATE())) setString(no ++, data.getFROM_ESTIMATE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ESTIMATE_DATE())) setString(no ++, data.getTO_ESTIMATE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_PROJECT_STAT())) setString(no ++, data.getInC2_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_PROJECT_STAT())) setString(no ++, data.getInC3_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC4_PROJECT_STAT())) setString(no ++, data.getInC4_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC5_PROJECT_STAT())) setString(no ++, data.getInC5_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC6_PROJECT_STAT())) setString(no ++, data.getInC6_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_PROJECT_STAT())) setString(no ++, data.getInC1_PROJECT_STAT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0040010Struct data = new KM0040010Struct();

			data.setPROJECT_CD( getString(1, rs) );
			data.setPROJECT_NAME( getString(2, rs) );
			data.setCUST_CD( getString(3, rs) );
			data.setCUST_NAME( getString(4, rs) );
			data.setDLV_LOC_CD( getString(5, rs) );
			data.setDLV_LOC_NAME( getString(6, rs) );
			data.setACCURACY( getString(7, rs) );
			data.setPROJECT_STAT( getString(8, rs) );
			data.setVEND_DATE( getString(9, rs) );
			data.setASSUME_DLV_DATE( getString(10, rs) );
			data.setASSUME_AMOUNT( getString(11, rs) );
			data.setCUR_UNIT( getString(12, rs) );
			data.setASSUME_AMOUNT_EXCH_RATES( getString(13, rs) );
			data.setPJ_ORG_CD( getString(14, rs) );
			data.setORG_NAME_1( getString(15, rs) );
			data.setPJ_USER_CD( getString(16, rs) );
			data.setUSER_NAME_1( getString(17, rs) );
			data.setREMARKS1( getString(18, rs) );
			data.setREMARKS2( getString(19, rs) );
			data.setREMARKS3( getString(20, rs) );
			data.setREMARKS4( getString(21, rs) );
			data.setREMARKS5( getString(22, rs) );
			data.setESTIMATE_NO( getString(23, rs) );
			data.setESTIMATE_STAT( getString(24, rs) );
			data.setESTIMATE_DATE( getString(25, rs) );
			data.setES_COMMET1( getString(26, rs) );
			data.setES_COMMET2( getString(27, rs) );
			data.setES_COMMET3( getString(28, rs) );
			data.setES_COMMET4( getString(29, rs) );
			data.setES_COMMET5( getString(30, rs) );
			data.setES_ORG_CD( getString(31, rs) );
			data.setORG_NAME_2( getString(32, rs) );
			data.setES_USER_CD( getString(33, rs) );
			data.setUSER_NAME_2( getString(34, rs) );
			data.setESTIMATE_AMOUNT( getString(35, rs) );
			data.setESTIMATE_AMOUNT_JPN( getString(36, rs) );
			data.setESREMARK1( getString(37, rs) );
			data.setESREMARK2( getString(38, rs) );
			data.setESREMARK3( getString(39, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_clear

			return;
		}

		/**
		 * selectT_PROJECE_ESTIMATE1クラスの標準コンストラクタ
		 */
		public selectT_PROJECE_ESTIMATE1()
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getCompanyInfo extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_MY_COMPANY.\"COMPANY_CD\" AS \"COMPANY_CD\" "
+"FROM "
+"  SYS_MY_COMPANY "
+"WHERE "
+"  SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getCompanyInfo_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getCompanyInfo_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_read
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCompanyInfo_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_read2
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getCompanyInfo_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KM0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_read3
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getCompanyInfo_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KM0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0040010Struct data = new KM0040010Struct();

			data.setstrCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCompanyInfo_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getCompanyInfo_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getCompanyInfo_clear

			return;
		}

		/**
		 * getCompanyInfoクラスの標準コンストラクタ
		 */
		public getCompanyInfo()
		{
			//{{user_implement_dev:getCompanyInfo_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getCompanyInfo_constractor

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
		mselectT_PROJECE_ESTIMATE.clear();
		mselectT_PROJECE_ESTIMATE = null;
		mselectT_PROJECE_ESTIMATE1.clear();
		mselectT_PROJECE_ESTIMATE1 = null;
		mgetCompanyInfo.clear();
		mgetCompanyInfo = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * KM0040010クラスの標準コンストラクタ
	 */
	public KM0040010Entity() throws FoundationException
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
