/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0010;

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

public class KU0010010Entity extends DataObject
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

	// getCompanyInfoクラス インスタンス
	public getCompanyInfo mgetCompanyInfo = new getCompanyInfo();

	// getUserInfoクラス インスタンス
	public getUserInfo mgetUserInfo = new getUserInfo();

	// getGyomuDateクラス インスタンス
	public getGyomuDate mgetGyomuDate = new getGyomuDate();

	// getViewLinesクラス インスタンス
	public getViewLines mgetViewLines = new getViewLines();

	// tbl_T_ANS_DLV_DATEクラス インスタンス
	public tbl_T_ANS_DLV_DATE mtbl_T_ANS_DLV_DATE = new tbl_T_ANS_DLV_DATE();

	// tbl_T_SHIP_ODRクラス インスタンス
	public tbl_T_SHIP_ODR mtbl_T_SHIP_ODR = new tbl_T_SHIP_ODR();

	// tbl_T_ODRクラス インスタンス
	public tbl_T_ODR mtbl_T_ODR = new tbl_T_ODR();

	// tbl_M_ITEMクラス インスタンス
	public tbl_M_ITEM mtbl_M_ITEM = new tbl_M_ITEM();

	// tbl_T_ODR_CTLクラス インスタンス
	public tbl_T_ODR_CTL mtbl_T_ODR_CTL = new tbl_T_ODR_CTL();

	// tbl_T_SHIP_SLIPクラス インスタンス
	public tbl_T_SHIP_SLIP mtbl_T_SHIP_SLIP = new tbl_T_SHIP_SLIP();

	// tbl_M_CUST_BASEクラス インスタンス
	public tbl_M_CUST_BASE mtbl_M_CUST_BASE = new tbl_M_CUST_BASE();

	// tbl_M_CUSTクラス インスタンス
	public tbl_M_CUST mtbl_M_CUST = new tbl_M_CUST();

	// toriTbl_T_ANS_DLV_DATEクラス インスタンス
	public toriTbl_T_ANS_DLV_DATE mtoriTbl_T_ANS_DLV_DATE = new toriTbl_T_ANS_DLV_DATE();

	// chkIsWhCdクラス インスタンス
	public chkIsWhCd mchkIsWhCd = new chkIsWhCd();

	// tblM_UNIT_COSTクラス インスタンス
	public tblM_UNIT_COST mtblM_UNIT_COST = new tblM_UNIT_COST();

	// tblM_WHクラス インスタンス
	public tblM_WH mtblM_WH = new tblM_WH();

	// getTaxクラス インスタンス
	public getTax mgetTax = new getTax();

	// getYotakuWhCdクラス インスタンス
	public getYotakuWhCd mgetYotakuWhCd = new getYotakuWhCd();

	// getSYUKA_LTクラス インスタンス
	public getSYUKA_LT mgetSYUKA_LT = new getSYUKA_LT();

	// chkIsInWhCdクラス インスタンス
	public chkIsInWhCd mchkIsInWhCd = new chkIsInWhCd();

	// updateT_ODRクラス インスタンス
	public updateT_ODR mupdateT_ODR = new updateT_ODR();

	// tblM_CALクラス インスタンス
	public tblM_CAL mtblM_CAL = new tblM_CAL();

	// tblM_CURクラス インスタンス
	public tblM_CUR mtblM_CUR = new tblM_CUR();

	// chkJocsWhCdクラス インスタンス
	public chkJocsWhCd mchkJocsWhCd = new chkJocsWhCd();

	// tbl_T_JOB_ODRクラス インスタンス
	public tbl_T_JOB_ODR mtbl_T_JOB_ODR = new tbl_T_JOB_ODR();

	// tbl_T_UN_SHIP_LISTクラス インスタンス
	public tbl_T_UN_SHIP_LIST mtbl_T_UN_SHIP_LIST = new tbl_T_UN_SHIP_LIST();

	// getTaxByTaxCdクラス インスタンス
	public getTaxByTaxCd mgetTaxByTaxCd = new getTaxByTaxCd();

	// selectModify_Countクラス インスタンス
	public selectModify_Count mselectModify_Count = new selectModify_Count();


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
		String m_write_fname="KU0010010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="KU0010010";

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
	public class getCompanyInfo extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_MY_COMPANY.\"COMPANY_CD\" as \"COMPANY_CD\" "
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
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_read
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
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
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
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
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setstrCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("getCompanyInfo", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getCompanyInfo_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
	/**
	 * Entity定義 静的SQL
	 */
	public class getUserInfo extends DataObject
	{
		protected String m_selcmd = "select "
+"  USER_MST.\"USER_NAME\" as \"USER_NAME\", "
+"  USER_MST.\"PLANT_CD\" as \"PLANT_CD\", "
+"  USER_MST.\"SECTION_CD\" as \"SECTION_CD\", "
+"  M_PLANT.\"PLANT_NAME\" as \"PLANT_NAME\", "
+"  M_PLANT.\"PLANT_ANAME\" as \"PLANT_ANAME\", "
+"  M_PLANT.\"CAL_NO\" as \"CAL_NO\" "
+"from "
+"  USER_MST, "
+"  M_PLANT "
+"where "
+"  USER_MST.PLANT_CD = M_PLANT.PLANT_CD "
+"  and USER_MST.\"USER_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getUserInfo_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getUserInfo_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getUserInfo_read
			if(m_selcmd==null) throw new FoundationException("getUserInfo", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getUserInfo_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getUserInfo_read2
			if(m_selcmd==null) throw new FoundationException("getUserInfo", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getUserInfo_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getUserInfo_read3
			if(m_selcmd==null) throw new FoundationException("getUserInfo", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getUserInfo_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrUSER_CD());
				if(isNull(data.getstrUSER_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getstrUSER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setstrUSER_NAME( getString(1, rs) );
			data.setstrPLANT_CD( getString(2, rs) );
			data.setstrSECTION_CD( getString(3, rs) );
			data.setstrPLANT_NAME( getString(4, rs) );
			data.setstrPLANT_ANAME( getString(5, rs) );
			data.setstrCAL_NO( getDouble(6, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getUserInfo", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getUserInfo_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("getUserInfo", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getUserInfo_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getUserInfo_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getUserInfo_clear

			return;
		}

		/**
		 * getUserInfoクラスの標準コンストラクタ
		 */
		public getUserInfo()
		{
			//{{user_implement_dev:getUserInfo_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getUserInfo_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getGyomuDate extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(sd.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  sd.PLANT_CD as \"PLANT_CD\" "
+"from "
+"  SYS_CLASS_CODE sc, "
+"  SYS_DATE_CTRL sd "
+"where "
+"  sc.SYS_CLASS = 'SALES' "
+"  and sc.CLASS_CODE = 'PLANT_WEB' "
+"  and sc.CODE = sd.PLANT_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getGyomuDate_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getGyomuDate_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getGyomuDate_read
			if(m_selcmd==null) throw new FoundationException("getGyomuDate", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getGyomuDate_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getGyomuDate_read2
			if(m_selcmd==null) throw new FoundationException("getGyomuDate", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getGyomuDate_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getGyomuDate_read3
			if(m_selcmd==null) throw new FoundationException("getGyomuDate", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getGyomuDate_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setstrBUSINESS_OPR_DATE( getString(1, rs) );
			data.setstrPLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getGyomuDate", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getGyomuDate_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("getGyomuDate", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getGyomuDate_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getGyomuDate_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getGyomuDate_clear

			return;
		}

		/**
		 * getGyomuDateクラスの標準コンストラクタ
		 */
		public getGyomuDate()
		{
			//{{user_implement_dev:getGyomuDate_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getGyomuDate_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getViewLines extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_SCREEN_PARM.\"MAX_DISPLAY_ROWNUM\" as \"MAX_DISPLAY_ROWNUM\" "
+"from "
+"  SYS_SCREEN_PARM "
+"where "
+"  SYS_SCREEN_PARM.\"SERVLET_CD\" = 'KU0010010' "
+"  and SYS_SCREEN_PARM.\"DISPLAY_CD\" = 10";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getViewLines_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getViewLines_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getViewLines_read
			if(m_selcmd==null) throw new FoundationException("getViewLines", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getViewLines_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getViewLines_read2
			if(m_selcmd==null) throw new FoundationException("getViewLines", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getViewLines_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getViewLines_read3
			if(m_selcmd==null) throw new FoundationException("getViewLines", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getViewLines_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setstrMAX_DISPLAY_ROWNUM( getDouble(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getViewLines", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getViewLines_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("getViewLines", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getViewLines_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getViewLines_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getViewLines_clear

			return;
		}

		/**
		 * getViewLinesクラスの標準コンストラクタ
		 */
		public getViewLines()
		{
			//{{user_implement_dev:getViewLines_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getViewLines_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_T_ANS_DLV_DATE extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ANS_DLV_DATE.\"ODR_NO\" as \"ODR_NO\", "
+"  T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\" as \"PART_DLV_SEQ_NO\", "
+"  TO_CHAR(T_ANS_DLV_DATE.\"DESINATED_SHIP_DATE\", 'YYYY/MM/DD') as \"DESINATED_SHIP_DATE\", "
+"  T_ODR.\"ODR_CTL_NO\" as \"ODR_CTL_NO\", "
+"  T_ODR_CTL.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_ODR_CTL.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_CUST.\"CUST_NAME\" as \"CUST_NAME\", "
+"  T_ANS_DLV_DATE.\"REST_SHIP_ODR_QTY\" as \"REST_SHIP_ODR_QTY\", "
+"  T_ODR.\"TRANSPORT_TYP\" as \"TRANSPORT_TYP\", "
+"  T_ODR.\"ODR_UNIT_PRICE\" as \"ODR_UNIT_PRICE\", "
+"  T_ODR.\"SPCL_PRICE_TYP\" as \"SPCL_PRICE_TYP\", "
+"  T_ODR_CTL.\"CUST_CD\" as \"CUST_CD\", "
+"  T_ODR.\"PARTIAL_SHIP_INST_FLG\" as \"PARTIAL_SHIP_INST_FLG\", "
+"  T_ANS_DLV_DATE.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM.STOCK_UNIT, "
+"  M_ITEM.UNIT_QTY_TYP, "
+"  M_ITEM.MRP_ODR_TYP, "
+"  M_WH.WH_NAME, "
+"  M_CUST_BASE.SHIP_WH_CD, "
+"  T_ODR_CTL.CUST_CD, "
+"  M_ITEM_SPEC.CUST_ITEM_NAME, "
+"  T_ODR.CUST_ODR_NO, "
+"  T_JOB_ODR_ODR_ALC.JOB_ODR_CD "
+"from "
+"  T_ANS_DLV_DATE, "
+"  T_ODR, "
+"  T_ODR_CTL, "
+"  M_CUST, "
+"  M_CUST_BASE, "
+"  M_ITEM, "
+"  M_WH, "
+"  M_ITEM_SPEC, "
+"  T_JOB_ODR_ODR_ALC "
+"where "
+"  T_ANS_DLV_DATE.ODR_NO = T_ODR.ODR_NO "
+"  and T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO "
+"  and T_ODR_CTL.CUST_CD = M_CUST.CUST_CD "
+"  and M_CUST.COMPANY_CD in ( "
+"    SELECT "
+"      COMPANY_CD "
+"    FROM "
+"      SYS_MY_COMPANY "
+"    WHERE "
+"      CTRL_CD = ? "
+"  ) "
+"  and T_ANS_DLV_DATE.\"ODR_NO\" = ? "
+"  and T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\" = ? "
+"  and T_ANS_DLV_DATE.\"SHIP_ODR_CMPLT_FLG\" = '0' "
+"  and T_ANS_DLV_DATE.\"DEL_FLG\" = '0' "
+"  and T_ODR_CTL.ITEM_CD = M_ITEM.ITEM_CD "
+"  and M_CUST_BASE.COMPANY_CD = M_CUST.COMPANY_CD "
+"  and M_CUST_BASE.CUST_CD = T_ODR_CTL.CUST_CD "
+"  and M_CUST_BASE.DLV_LOC_CD = T_ODR.DLV_LOC_CD "
+"  and M_WH.WH_CD = M_CUST_BASE.SHIP_WH_CD "
+"  and M_ITEM_SPEC.COMPANY_CD = M_CUST.COMPANY_CD "
+"  and M_ITEM_SPEC.CUST_CD = T_ODR_CTL.CUST_CD "
+"  and M_ITEM_SPEC.CUST_ITEM_CD = T_ODR_CTL.CUST_ITEM_CD "
+"  and T_ODR.ODR_NO = T_JOB_ODR_ODR_ALC.ODR_NO(+)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_ANS_DLV_DATE "
+"set "
+"  \"DESINATED_SHIP_DATE\" = ?, "
+"  \"REST_SHIP_ODR_QTY\" = REST_SHIP_ODR_QTY - ?, "
+"  \"SHIP_ODR_CMPLT_FLG\" = DECODE(REST_SHIP_ODR_QTY - ?, 0, '1', '0') "
+"where "
+"  T_ANS_DLV_DATE.\"ODR_NO\" = ? "
+"  and T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0010010";
		protected String m_sUpdateProgramName="KU0010010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_ANS_DLV_DATE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_T_ANS_DLV_DATE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ANS_DLV_DATE_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_ANS_DLV_DATE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_T_ANS_DLV_DATE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ANS_DLV_DATE_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_ANS_DLV_DATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_ANS_DLV_DATE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ANS_DLV_DATE_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_ANS_DLV_DATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_ANS_DLV_DATE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsysMyCompany_IN_COMPANYCD());
				if(isNull(data.getsysMyCompany_IN_COMPANYCD())) isNull = true;
				ary.addElement(data.gettAnsDlvDate_IN_ODRNO());
				if(isNull(data.gettAnsDlvDate_IN_ODRNO())) isNull = true;
				ary.addElement(data.gettAnsDlvDate_IN_PARTDLVSEQNO());
				if(isNull(data.gettAnsDlvDate_IN_PARTDLVSEQNO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsysMyCompany_IN_COMPANYCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.gettAnsDlvDate_IN_ODRNO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.gettAnsDlvDate_IN_PARTDLVSEQNO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.settAnsDlvDate_ODR_NO( getString(1, rs) );
			data.settAnsDlvDate_PART_DLV_SEQ_NO( getString(2, rs) );
			data.settAnsDlvDate_DESINATED_SHIP_DATE( getString(3, rs) );
			data.settOdrODR_CTL_NO( getString(4, rs) );
			data.settOdrCtl_CUST_ITEM_CD( getString(5, rs) );
			data.settOdrCtl_ITEM_CD( getString(6, rs) );
			data.setmCust_CUST_ANAME( getString(7, rs) );
			data.settAnsDlvDate_REST_SHIP_ODR_QTY( getString(8, rs) );
			data.settOdr_TRANSPORT_TYP( getString(9, rs) );
			data.settOdr_ODR_UNIT_PRICE( getString(10, rs) );
			data.settOdr_SPCL_PRICE_TYP( getString(11, rs) );
			data.settOdrCtl_CUST_CD( getString(12, rs) );
			data.settOdr_PARTIAL_SHIP_INST_FLG( getString(13, rs) );
			data.settAnsDlvDate_MODIFY_COUNT( getString(14, rs) );
			data.settITEM_NAME( getString(15, rs) );
			data.settSTOCK_UNIT( getString(16, rs) );
			data.settUNIT_QTY_TYP( getString(17, rs) );
			data.settMRP_ODR_TYP( getString(18, rs) );
			data.settWH_NAME( getString(19, rs) );
			data.settSHIP_WH_CD( getString(20, rs) );
			data.settCUST_CD( getString(21, rs) );
			data.settCUST_ITEM_NAME( getString(22, rs) );
			data.settCUST_ODR_NO( getString(23, rs) );
			data.setg_JOB_ODR_CD( getString(24, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_ANS_DLV_DATE", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ANS_DLV_DATE_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tbl_T_ANS_DLV_DATE", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_T_ANS_DLV_DATE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getup_tAnsDlvDate_DESINATED_SHIP_DATE(), stmt);
				setString(5, data.getup_tAnsDlvDate_REST_SHIP_ODR_QTY(), stmt);
				setString(6, data.getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(), stmt);
				setString(7, data.getup_tAnsDlvDate_IN_ODRNO(), stmt);
				setString(8, data.getup_tAnsDlvDate_IN_PARTDLVSEQNO(), stmt);

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
			//{{user_implement_dev:tbl_T_ANS_DLV_DATE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_T_ANS_DLV_DATE_clear

			return;
		}

		/**
		 * tbl_T_ANS_DLV_DATEクラスの標準コンストラクタ
		 */
		public tbl_T_ANS_DLV_DATE()
		{
			//{{user_implement_dev:tbl_T_ANS_DLV_DATE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_T_ANS_DLV_DATE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_T_SHIP_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_SHIP_ODR.\"ODR_NO\" as \"ODR_NO\", "
+"  T_SHIP_ODR.\"PART_DLV_SEQ_NO\" as \"PART_DLV_SEQ_NO\", "
+"  T_SHIP_ODR.\"SLIP_CD\" as \"SLIP_CD\", "
+"  TO_CHAR(T_SHIP_ODR.\"DESINATED_SHIP_DATE\", 'YYYY/MM/DD') as \"DESINATED_SHIP_DATE\", "
+"  T_SHIP_ODR.\"SHIP_QTY\" as \"SHIP_QTY\", "
+"  T_SHIP_ODR.\"ALLCT_WH_CD\" as \"ALLCT_WH_CD\", "
+"  T_SHIP_ODR.\"CUST_NAME\" as \"CUST_NAME\", "
+"  T_SHIP_ODR.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_SHIP_ODR.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_SHIP_ODR.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_ANS_DLV_DATE.\"REST_SHIP_ODR_QTY\" as \"REST_SHIP_ODR_QTY\", "
+"  T_SHIP_ODR.\"DEL_FLG\" as \"DEL_FLG\", "
+"  T_SHIP_ODR.\"DIRECT_DLV_FLG\" as \"DIRECT_DLV_FLG\", "
+"  T_SHIP_ODR.\"TRANSPORT_TYP\" as \"TRANSPORT_TYP\", "
+"  T_SHIP_ODR.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM.STOCK_UNIT, "
+"  M_ITEM.UNIT_QTY_TYP, "
+"  M_WH.WH_NAME, "
+"  T_SHIP_ODR.CUST_CD, "
+"  M_ITEM_SPEC.CUST_ITEM_NAME, "
+"  T_SHIP_ODR.CUST_ODR_NO, "
+"  T_SHIP_ODR.DEPO_TRANSFER_PROC_FLG, "
+"  T_ANS_DLV_DATE.MODIFY_COUNT "
+"from "
+"  T_SHIP_ODR, "
+"  T_ANS_DLV_DATE, "
+"  M_ITEM, "
+"  M_WH, "
+"  M_ITEM_SPEC "
+"where "
+"  T_ANS_DLV_DATE.ODR_NO = T_SHIP_ODR.ODR_NO "
+"  and T_ANS_DLV_DATE.PART_DLV_SEQ_NO = T_SHIP_ODR.PART_DLV_SEQ_NO "
+"  and T_SHIP_ODR.\"SLIP_CD\" = ? "
+"  and T_SHIP_ODR.\"DEL_FLG\" = 0 "
+"  and T_SHIP_ODR.\"TOTAL_SHIP_QTY\" = 0 "
+"  and T_SHIP_ODR.ITEM_CD = M_ITEM.ITEM_CD "
+"  and T_SHIP_ODR.ALLCT_WH_CD = M_WH.WH_CD "
+"  and M_ITEM_SPEC.COMPANY_CD in ( "
+"    SELECT "
+"      COMPANY_CD "
+"    FROM "
+"      SYS_MY_COMPANY "
+"    WHERE "
+"      CTRL_CD = ? "
+"  ) "
+"  and M_ITEM_SPEC.CUST_CD = T_SHIP_ODR.CUST_CD "
+"  and M_ITEM_SPEC.CUST_ITEM_CD = T_SHIP_ODR.CUST_ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SHIP_ODR(\"ODR_NO\", \"PART_DLV_SEQ_NO\", \"SLIP_CD\", \"ITEM_CD\", \"CUST_ITEM_CD\", \"CUST_ODR_NO\", \"CUST_CD\", \"CUST_NAME\", \"SHIP_ODR_ISS_PSN_CD\", \"DLV_LOC_CD\", \"DESINATED_SHIP_DATE\", \"SHIP_QTY\", \"UNIT_PRICE\", \"SHIP_ODR_AMOUNT\", \"CURRNCY_CD\", \"PKG_UNIT_QTY\", \"REMARKS\", \"ALLCT_WH_CD\", \"DEPO_TYP\", \"ENTRY_TYP\", \"PRINT_FLG\", \"SHP_CMPLT_FLG\", \"DEL_FLG\", \"TRANSPORT_CD\", \"DIRECT_DLV_FLG\", \"CUST_CHRG_PSN_CD\", \"UNIT_CD\", \"SCDL_DLV_DATE\", \"TRANSFER_WH_CD\", \"DLV_KEY_NO\", \"TOTAL_SHIP_QTY\", \"RETURN_QTY\", \"SHIP_ODR_AMOUNT_EXCH_RATES\", \"SHIP_ODR_NO\", \"JOB_ODR_CD\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ROUND(?, 4), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '0', '0', ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  T_SHIP_ODR "
+"where "
+"  T_SHIP_ODR.\"SLIP_CD\" = ? "
+"  and T_SHIP_ODR.TOTAL_SHIP_QTY = 0";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0010010";
		protected String m_sUpdateProgramName="KU0010010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_T_SHIP_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_T_SHIP_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_SHIP_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_SHIP_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettShipOdr_IN_SLIPCD());
				if(isNull(data.gettShipOdr_IN_SLIPCD())) isNull = true;
				ary.addElement(data.getsysMyCompany_IN_COMPANYCD());
				if(isNull(data.getsysMyCompany_IN_COMPANYCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.gettShipOdr_IN_SLIPCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsysMyCompany_IN_COMPANYCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.settShipOdr_ODR_NO( getString(1, rs) );
			data.settShipOdr_PART_DLV_SEQ_NO( getString(2, rs) );
			data.settShipOdr_SLIP_CD( getString(3, rs) );
			data.settShipOdr_DESINATED_SHIP_DATE( getString(4, rs) );
			data.settShipOdr_SHIP_QTY( getString(5, rs) );
			data.settShipOdr_ALLCT_WH_CD( getString(6, rs) );
			data.settShipOdr_CUST_NAME( getString(7, rs) );
			data.settShipOdr_CUST_ITEM_CD( getString(8, rs) );
			data.settShipOdr_ITEM_CD( getString(9, rs) );
			data.settShipOdr_JOB_ODR_CD( getString(10, rs) );
			data.settShipOdrAnsDlvDate_REST_SHIP_ODR_QTY( getString(11, rs) );
			data.settShipOdr_DEL_FLG( getString(12, rs) );
			data.settShipOdr_DIRECT_DLV_FLG( getString(13, rs) );
			data.settShipOdr_TRANSPORT_TYP( getString(14, rs) );
			data.settShipOdr_MODIFY_COUNT( getString(15, rs) );
			data.settITEM_NAME( getString(16, rs) );
			data.settSTOCK_UNIT( getString(17, rs) );
			data.settUNIT_QTY_TYP( getString(18, rs) );
			data.settWH_NAME( getString(19, rs) );
			data.settCUST_CD( getString(20, rs) );
			data.settCUST_ITEM_NAME( getString(21, rs) );
			data.settCUST_ODR_NO( getString(22, rs) );
			data.settDEPO_TRANSFER_PROC_FLG( getString(23, rs) );
			data.settAnsDlvDate_MODIFY_COUNT( getString(24, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP_ODR", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tbl_T_SHIP_ODR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_T_SHIP_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getin_tShipOdr_ODR_NO(), stmt);
				setString(8, data.getin_tShipOdr_PART_DLV_SEQ_NO(), stmt);
				setString(9, data.getin_tShipOdr_SLIP_CD(), stmt);
				setString(10, data.getin_tShipOdr_ITEM_CD(), stmt);
				setString(11, data.getin_tShipOdr_CUST_ITEM_CD(), stmt);
				setString(12, data.getin_tShipOdr_CUST_ODR_NO(), stmt);
				setString(13, data.getin_tShipOdr_CUST_CD(), stmt);
				setString(14, data.getin_tShipOdr_CUST_NAME(), stmt);
				setString(15, data.getin_tShipOdr_SHIP_ODR_ISS_PSN_CD(), stmt);
				setString(16, data.getin_tShipOdr_DLV_LOC_CD(), stmt);
				setString(17, data.getin_tShipOdr_DESINATED_SHIP_DATE(), stmt);
				setString(18, data.getin_tShipOdr_SHIP_QTY(), stmt);
				setString(19, data.getin_tShipOdr_UNIT_PRICE(), stmt);
				setDouble(20, data.getin_tShipOdr_SHIP_ODR_AMOUNT(), stmt);
				setString(21, data.getin_tShipOdr_CURRNCY_CD(), stmt);
				setString(22, data.getin_tShipOdr_PKG_UNIT_QTY(), stmt);
				setString(23, data.getin_tShipOdr_REMARKS(), stmt);
				setString(24, data.getin_tShipOdr_ALLCT_WH_CD(), stmt);
				setString(25, data.getin_tShipOdr_DEPO_TYP(), stmt);
				setString(26, data.getin_tShipOdr_ENTRY_TYP(), stmt);
				setString(27, data.getin_tShipOdr_PRINT_FLG(), stmt);
				setString(28, data.getin_tShipOdr_SHP_CMPLT_FLG(), stmt);
				setString(29, data.getin_tShipOdr_DEL_FLG(), stmt);
				setString(30, data.getin_tShipOdr_TRANSPORT_CD(), stmt);
				setString(31, data.getin_tShipOdr_DIRECT_DLV_FLG(), stmt);
				setString(32, data.getin_tShipOdr_CUST_CHRG_PSN_CD(), stmt);
				setString(33, data.getin_tShipOdr_UNIT_CD(), stmt);
				setString(34, data.getin_tShipOdr_SCDL_DLV_DATE(), stmt);
				setString(35, data.getin_tShipOdr_TRANSFER_WH_CD(), stmt);
				setString(36, data.getin_tShipOdr_DLV_KEY_NO(), stmt);
				setDouble(37, data.getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(), stmt);
				setString(38, data.getin_tShipOdr_SHIP_ODR_NO(), stmt);
				setString(39, data.getin_tShipOdr_JOB_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getdel_tShipOdr_IN_SLIPCD(), stmt);

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
			//{{user_implement_dev:tbl_T_SHIP_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_T_SHIP_ODR_clear

			return;
		}

		/**
		 * tbl_T_SHIP_ODRクラスの標準コンストラクタ
		 */
		public tbl_T_SHIP_ODR()
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_T_SHIP_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_T_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ODR.\"ODR_NO\" as \"ODR_NO\", "
+"  T_ODR.\"ODR_TYP\" as \"ODR_TYP\", "
+"  T_ODR.\"ODR_CTL_NO\" as \"ODR_CTL_NO\", "
+"  T_ODR.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  T_ODR.\"CUST_CHRG_ORG_CD\" as \"CUST_CHRG_ORG_CD\", "
+"  T_ODR.\"CUST_CHRG_PSN_CD\" as \"CUST_CHRG_PSN_CD\", "
+"  T_ODR.\"ODR_ACPT_ORG_CD\" as \"ODR_ACPT_ORG_CD\", "
+"  T_ODR.\"ODR_ACPT_PSN_CD\" as \"ODR_ACPT_PSN_CD\", "
+"  T_ODR.\"CURRNCY_CD\" as \"CURRNCY_CD\", "
+"  T_ODR.\"EXCH_TYP\" as \"EXCH_TYP\", "
+"  T_ODR.\"DLV_LOC_CD\" as \"DLV_LOC_CD\", "
+"  T_ODR.\"DLV_LOC_CD_EIAJ\" as \"DLV_LOC_CD_EIAJ\", "
+"  T_ODR.\"DLV_LOC_NAME\" as \"DLV_LOC_NAME\", "
+"  T_ODR.\"DLV_LOC_NAME_KANJI\" as \"DLV_LOC_NAME_KANJI\", "
+"  T_ODR.\"PRD_ODR_PLACE_CD\" as \"PRD_ODR_PLACE_CD\", "
+"  T_ODR.\"ODR_UNIT_PRICE\" as \"ODR_UNIT_PRICE\", "
+"  T_ODR.\"SPCL_PRICE_TYP\" as \"SPCL_PRICE_TYP\", "
+"  T_ODR.\"PART_DLV_COUNT\" as \"PART_DLV_COUNT\", "
+"  T_ODR.\"DEPO_TYP\" as \"DEPO_TYP\", "
+"  TO_CHAR(T_ODR.\"DESINATED_DLV_DATE\", 'YYYY/MM/DD') as \"DESINATED_DLV_DATE\", "
+"  TO_CHAR(T_ODR.\"STD_DESINATED_RCV_DATE\", 'YYYY/MM/DD') as \"STD_DESINATED_RCV_DATE\", "
+"  T_ODR.\"ODR_QTY\" as \"ODR_QTY\", "
+"  T_ODR.\"REMAIN_UNCONFIRM_ODR_QTY\" as \"REMAIN_UNCONFIRM_ODR_QTY\", "
+"  T_ODR.\"CANCELED_UNCONFIRM_ODR_QTY\" as \"CANCELED_UNCONFIRM_ODR_QTY\", "
+"  T_ODR.\"UNIT_CD\" as \"UNIT_CD\", "
+"  T_ODR.\"UNCONFIRM_ODR_BALANCE\" as \"UNCONFIRM_ODR_BALANCE\", "
+"  T_ODR.\"ODR_AMOUNT\" as \"ODR_AMOUNT\", "
+"  T_ODR.\"ODR_AMOUNT_EXCH_RATES\" as \"ODR_AMOUNT_EXCH_RATES\", "
+"  T_ODR.\"TOTAL_SHIP_QTY\" as \"TOTAL_SHIP_QTY\", "
+"  T_ODR.\"SHIP_AMOUNT\" as \"SHIP_AMOUNT\", "
+"  T_ODR.\"SHIP_AMOUNT_EXCH_RATES\" as \"SHIP_AMOUNT_EXCH_RATES\", "
+"  T_ODR.\"RETURN_PRICE\" as \"RETURN_PRICE\", "
+"  T_ODR.\"RETURN_QTY\" as \"RETURN_QTY\", "
+"  T_ODR.\"RETURN_AMOUNT\" as \"RETURN_AMOUNT\", "
+"  T_ODR.\"RETURN_AMOUNT_EXCH_RATES\" as \"RETURN_AMOUNT_EXCH_RATES\", "
+"  T_ODR.\"ODR_CMPLT_FLG\" as \"ODR_CMPLT_FLG\", "
+"  T_ODR.\"ODR_CMPLT_DATE\" as \"ODR_CMPLT_DATE\", "
+"  T_ODR.\"CUS_DLV_CD\" as \"CUS_DLV_CD\", "
+"  T_ODR.\"CUS_DLV_KEY_CD\" as \"CUS_DLV_KEY_CD\", "
+"  T_ODR.\"PART_NAME\" as \"PART_NAME\", "
+"  T_ODR.\"PKG_UNIT\" as \"PKG_UNIT\", "
+"  T_ODR.\"SLIP_PRICE_PRINT_TYP\" as \"SLIP_PRICE_PRINT_TYP\", "
+"  T_ODR.\"INSPC_TYP\" as \"INSPC_TYP\", "
+"  T_ODR.\"CLIENT_REMARK\" as \"CLIENT_REMARK\", "
+"  T_ODR.\"CLIENT_REMARK_KANJI\" as \"CLIENT_REMARK_KANJI\", "
+"  T_ODR.\"CLIENT_BARCODE_INF\" as \"CLIENT_BARCODE_INF\", "
+"  T_ODR.\"TRANSPORT_CD\" as \"TRANSPORT_CD\", "
+"  T_ODR.\"TRANSPORT_TYP\" as \"TRANSPORT_TYP\", "
+"  T_ODR.\"TAX_APPLY_TYP\" as \"TAX_APPLY_TYP\", "
+"  T_ODR.\"TAX_CD\" as \"TAX_CD\", "
+"  T_ODR.\"TAX_CALC_TYP\" as \"TAX_CALC_TYP\", "
+"  T_ODR.\"REMARKS\" as \"REMARKS\", "
+"  T_ODR.\"ODR_ACPT_DATE\" as \"ODR_ACPT_DATE\", "
+"  T_ODR.\"SHIP_PLAN_REMAIN_QTY\" as \"SHIP_PLAN_REMAIN_QTY\", "
+"  T_ODR.\"SHIP_PLAN_CMPLT_FLG\" as \"SHIP_PLAN_CMPLT_FLG\", "
+"  T_ODR.\"UNCONFIRMED_ODR_EFF_OVR_FLG\" as \"UNCONFIRMED_ODR_EFF_OVR_FLG\", "
+"  T_ODR.\"PARTIAL_SHIP_INST_FLG\" as \"PARTIAL_SHIP_INST_FLG\", "
+"  T_ODR.\"IF_CTL_NO\" as \"IF_CTL_NO\", "
+"  T_ODR.\"ENTRY_TYP\" as \"ENTRY_TYP\", "
+"  T_ODR.\"BUYER_NAME\" as \"BUYER_NAME\", "
+"  T_ODR.\"PUCH_ODR_QTY_TOTAL\" as \"PUCH_ODR_QTY_TOTAL\", "
+"  T_ODR.\"ODR_QTY\" as \"ODR_QTY\", "
+"  T_ODR.\"UNIT_CD_ORG\" as \"UNIT_CD_ORG\", "
+"  T_ODR.\"CUS_DLV_KEY_CD\" as \"CUS_DLV_KEY_CD\", "
+"  T_ODR.\"SHIP_CNT\" as \"SHIP_CNT\", "
+"  M_CUST.\"CUR_CD\" as \"CUR_CD\", "
+"  M_CUST.\"EXCH_TYP\" as \"EXCH_TYP\" "
+"from "
+"  T_ODR, "
+"  T_ODR_CTL, "
+"  M_CUST "
+"where "
+"  T_ODR.\"ODR_NO\" = ? "
+"  and T_ODR.\"ODR_CTL_NO\" = T_ODR_CTL.\"ODR_CTL_NO\" "
+"  and M_CUST.\"CUST_CD\" = T_ODR_CTL.\"CUST_CD\" "
+"  and M_CUST.\"COMPANY_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_ODR "
+"set "
+"  \"PART_DLV_COUNT\" = ? "
+"where "
+"  T_ODR.\"ODR_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0010010";
		protected String m_sUpdateProgramName="KU0010010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_T_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_T_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettOdr_IN_ODRNO());
				if(isNull(data.gettOdr_IN_ODRNO())) isNull = true;
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.gettOdr_IN_ODRNO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getstrCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.settOdr_ODR_NO( getString(1, rs) );
			data.settOdr_ODR_TYP( getString(2, rs) );
			data.settOdr_ODR_CTL_NO( getString(3, rs) );
			data.settOdr_CUST_ODR_NO( getString(4, rs) );
			data.settOdr_CUST_CHRG_ORG_CD( getString(5, rs) );
			data.settOdr_CUST_CHRG_PSN_CD( getString(6, rs) );
			data.settOdr_ODR_ACPT_ORG_CD( getString(7, rs) );
			data.settOdr_ODR_ACPT_PSN_CD( getString(8, rs) );
			data.settOdr_CURRNCY_CD( getString(9, rs) );
			data.settOdr_EXCH_TYP( getString(10, rs) );
			data.settOdr_DLV_LOC_CD( getString(11, rs) );
			data.settOdr_DLV_LOC_CD_EIAJ( getString(12, rs) );
			data.settOdr_DLV_LOC_NAME( getString(13, rs) );
			data.settOdr_DLV_LOC_NAME_KANJI( getString(14, rs) );
			data.settOdr_PRD_ODR_PLACE_CD( getString(15, rs) );
			data.settOdr_ODR_UNIT_PRICE( getString(16, rs) );
			data.settOdr_SPCL_PRICE_TYP( getString(17, rs) );
			data.settOdr_PART_DLV_COUNT( getString(18, rs) );
			data.settOdr_DEPO_TYP( getString(19, rs) );
			data.settOdr_DESINATED_DLV_DATE( getString(20, rs) );
			data.settOdr_STD_DESINATED_RCV_DATE( getString(21, rs) );
			data.settOdr_ODR_QTY( getString(22, rs) );
			data.settOdr_REMAIN_UNCONFIRM_ODR_QTY( getString(23, rs) );
			data.settOdr_CANCELED_UNCONFIRM_ODR_QTY( getString(24, rs) );
			data.settOdr_UNIT_CD( getString(25, rs) );
			data.settOdr_UNCONFIRM_ODR_BALANCE( getString(26, rs) );
			data.settOdr_ODR_AMOUNT( getString(27, rs) );
			data.settOdr_ODR_AMOUNT_EXCH_RATES( getString(28, rs) );
			data.settOdr_TOTAL_SHIP_QTY( getString(29, rs) );
			data.settOdr_SHIP_AMOUNT( getString(30, rs) );
			data.settOdr_SHIP_AMOUNT_EXCH_RATES( getString(31, rs) );
			data.settOdr_RETURN_PRICE( getString(32, rs) );
			data.settOdr_RETURN_QTY( getString(33, rs) );
			data.settOdr_RETURN_AMOUNT( getString(34, rs) );
			data.settOdr_RETURN_AMOUNT_EXCH_RATES( getString(35, rs) );
			data.settOdr_ODR_CMPLT_FLG( getString(36, rs) );
			data.settOdr_ODR_CMPLT_DATE( getString(37, rs) );
			data.settOdr_CUS_DLV_CD( getString(38, rs) );
			data.settOdr_CUS_DLV_KEY_CD( getString(39, rs) );
			data.settOdr_PART_NAME( getString(40, rs) );
			data.settOdr_PKG_UNIT( getString(41, rs) );
			data.settOdr_SLIP_PRICE_PRINT_TYP( getString(42, rs) );
			data.settOdr_INSPC_TYP( getString(43, rs) );
			data.settOdr_CLIENT_REMARK( getString(44, rs) );
			data.settOdr_CLIENT_REMARK_KANJI( getString(45, rs) );
			data.settOdr_CLIENT_BARCODE_INF( getString(46, rs) );
			data.settOdr_TRANSPORT_CD( getString(47, rs) );
			data.settOdr_TRANSPORT_TYP( getString(48, rs) );
			data.settOdr_TAX_APPLY_TYP( getString(49, rs) );
			data.settOdr_TAX_CD( getString(50, rs) );
			data.settOdr_TAX_CALC_TYP( getString(51, rs) );
			data.settOdr_REMARKS( getString(52, rs) );
			data.settOdr_ODR_ACPT_DATE( getString(53, rs) );
			data.settOdr_SHIP_PLAN_REMAIN_QTY( getString(54, rs) );
			data.settOdr_SHIP_PLAN_CMPLT_FLG( getString(55, rs) );
			data.settOdr_UNCONFIRMED_ODR_EFF_OVR_FLG( getString(56, rs) );
			data.settOdr_PARTIAL_SHIP_INST_FLG( getString(57, rs) );
			data.settOdr_IF_CTL_NO( getString(58, rs) );
			data.settOdr_ENTRY_TYP( getString(59, rs) );
			data.settOdr_BUYER_NAME( getString(60, rs) );
			data.settOdr_PUCH_ODR_QTY_TOTAL( getString(61, rs) );
			data.settOdr_ODR_QTY( getString(62, rs) );
			data.settOdr_UNIT_CD_ORG( getString(63, rs) );
			data.settOdr_CUS_DLV_KEY_CD( getString(64, rs) );
			data.settOdr_SHIP_CNT( getString(65, rs) );
			data.settOdr_CUR_CD( getString(66, rs) );
			data.settOdr_EXCH_TYP_R( getString(67, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR", "hasRecord", "クエリー未登録");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tbl_T_ODR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_T_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getuptOdr_PART_DLV_COUNT(), stmt);
				setString(5, data.getuptOdr_IN_ODRNO(), stmt);

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
			//{{user_implement_dev:tbl_T_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_T_ODR_clear

			return;
		}

		/**
		 * tbl_T_ODRクラスの標準コンストラクタ
		 */
		public tbl_T_ODR()
		{
			//{{user_implement_dev:tbl_T_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_T_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_M_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"PRODUCT_TYP\" as \"PRODUCT_TYP\", "
+"  M_ITEM.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  M_ITEM.\"HIGH_LEVEL_NO\" as \"HIGH_LEVEL_NO\", "
+"  M_ITEM.\"OUTSIDE_TYP\" as \"OUTSIDE_TYP\", "
+"  M_ITEM.\"STOCK_UNIT_FLG\" as \"STOCK_UNIT_FLG\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  M_ITEM.\"PKG_UNIT\" as \"PKG_UNIT\", "
+"  M_ITEM.\"PKG_UNIT_QTY\" as \"PKG_UNIT_QTY\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" as \"UNIT_QTY_TYP\", "
+"  M_ITEM.\"ODR_LT\" as \"ODR_LT\", "
+"  M_ITEM.\"FIXED_LT\" as \"FIXED_LT\", "
+"  M_ITEM.\"PROP_LT\" as \"PROP_LT\", "
+"  M_ITEM.\"SAFETY_LT\" as \"SAFETY_LT\", "
+"  M_ITEM.\"ISSUE_LT\" as \"ISSUE_LT\", "
+"  M_ITEM.\"PROP_LOT_SIZE\" as \"PROP_LOT_SIZE\", "
+"  M_ITEM.\"ITEM_SPOIL\" as \"ITEM_SPOIL\", "
+"  M_ITEM.\"SAFETY_STOCK\" as \"SAFETY_STOCK\", "
+"  M_ITEM.\"LOT_SIZING_TYP\" as \"LOT_SIZING_TYP\", "
+"  M_ITEM.\"MAX_PERIOD\" as \"MAX_PERIOD\", "
+"  M_ITEM.\"MAX_ODR_QTY\" as \"MAX_ODR_QTY\", "
+"  M_ITEM.\"ODR_POINT\" as \"ODR_POINT\", "
+"  M_ITEM.\"FIXED_ODR_QTY\" as \"FIXED_ODR_QTY\", "
+"  M_ITEM.\"MIN_ODR_QTY\" as \"MIN_ODR_QTY\", "
+"  M_ITEM.\"MUL_ODR_QTY\" as \"MUL_ODR_QTY\", "
+"  M_ITEM.\"ISSUE_TYP\" as \"ISSUE_TYP\", "
+"  M_ITEM.\"MPS_FLG\" as \"MPS_FLG\", "
+"  M_ITEM.\"ACPT_INSPC_TYP\" as \"ACPT_INSPC_TYP\", "
+"  M_ITEM.\"CLASIFICATION_CD\" as \"CLASIFICATION_CD\", "
+"  M_ITEM.\"UNIT_WEIGHT\" as \"UNIT_WEIGHT\", "
+"  M_ITEM.\"ABC_TYP\" as \"ABC_TYP\", "
+"  M_ITEM.\"OPR_RSLT_TYP\" as \"OPR_RSLT_TYP\", "
+"  M_ITEM.\"SPL_ITEM_TYP\" as \"SPL_ITEM_TYP\", "
+"  M_ITEM.\"TAX_CD\" as \"TAX_CD\" "
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

		//{{user_implement_dev:tbl_M_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_M_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_read
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_M_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_M_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_M_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmItem_IN_ITEMCD());
				if(isNull(data.getmItem_IN_ITEMCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getmItem_IN_ITEMCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setmItem_ITEM_CD( getString(1, rs) );
			data.setmItem_ITEM_NAME( getString(2, rs) );
			data.setmItem_PRODUCT_TYP( getString(3, rs) );
			data.setmItem_MRP_ODR_TYP( getString(4, rs) );
			data.setmItem_DRAW_CD( getString(5, rs) );
			data.setmItem_SPEC( getString(6, rs) );
			data.setmItem_HIGH_LEVEL_NO( getString(7, rs) );
			data.setmItem_OUTSIDE_TYP( getString(8, rs) );
			data.setmItem_STOCK_UNIT_FLG( getString(9, rs) );
			data.setmItem_STOCK_UNIT( getString(10, rs) );
			data.setmItem_PKG_UNIT( getString(11, rs) );
			data.setmItem_PKG_UNIT_QTY( getString(12, rs) );
			data.setmItem_UNIT_QTY_TYP( getString(13, rs) );
			data.setmItem_ODR_LT( getString(14, rs) );
			data.setmItem_FIXED_LT( getString(15, rs) );
			data.setmItem_PROP_LT( getString(16, rs) );
			data.setmItem_SAFETY_LT( getString(17, rs) );
			data.setmItem_ISSUE_LT( getString(18, rs) );
			data.setmItem_PROP_LOT_SIZE( getString(19, rs) );
			data.setmItem_ITEM_SPOIL( getString(20, rs) );
			data.setmItem_SAFETY_STOCK( getString(21, rs) );
			data.setmItem_LOT_SIZING_TYP( getString(22, rs) );
			data.setmItem_MAX_PERIOD( getString(23, rs) );
			data.setmItem_MAX_ODR_QTY( getString(24, rs) );
			data.setmItem_ODR_POINT( getString(25, rs) );
			data.setmItem_FIXED_ODR_QTY( getString(26, rs) );
			data.setmItem_MIN_ODR_QTY( getString(27, rs) );
			data.setmItem_MUL_ODR_QTY( getString(28, rs) );
			data.setmItem_ISSUE_TYP( getString(29, rs) );
			data.setmItem_MPS_FLG( getString(30, rs) );
			data.setmItem_ACPT_INSPC_TYP( getString(31, rs) );
			data.setmItem_CLASIFICATION_CD( getString(32, rs) );
			data.setmItem_UNIT_WEIGHT( getString(33, rs) );
			data.setmItem_ABC_TYP( getString(34, rs) );
			data.setmItem_OPR_RSLT_TYP( getString(35, rs) );
			data.setmItem_SPL_ITEM_TYP( getString(36, rs) );
			data.setmItem_TAX_CD( getString(37, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tbl_M_ITEM", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_M_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_M_ITEM_clear

			return;
		}

		/**
		 * tbl_M_ITEMクラスの標準コンストラクタ
		 */
		public tbl_M_ITEM()
		{
			//{{user_implement_dev:tbl_M_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_M_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_T_ODR_CTL extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ODR_CTL.\"ODR_CTL_NO\" as \"ODR_CTL_NO\", "
+"  T_ODR_CTL.\"CUST_CD\" as \"CUST_CD\", "
+"  T_ODR_CTL.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_ODR_CTL.\"CUST_ITEM_NAME\" as \"CUST_ITEM_NAME\", "
+"  T_ODR_CTL.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_ODR_CTL.\"ITEM_NAME\" as \"ITEM_NAME\" "
+"from "
+"  T_ODR_CTL "
+"where "
+"  T_ODR_CTL.\"ODR_CTL_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_T_ODR_CTL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_T_ODR_CTL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_CTL_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR_CTL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_T_ODR_CTL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_CTL_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR_CTL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_ODR_CTL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_CTL_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR_CTL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_ODR_CTL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettOdrCtl_IN_ODRCTLNO());
				if(isNull(data.gettOdrCtl_IN_ODRCTLNO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.gettOdrCtl_IN_ODRCTLNO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.settOdrCtl_ODR_CTL_NO( getString(1, rs) );
			data.settOdrCtl_CUST_CD( getString(2, rs) );
			data.settOdrCtl_CUST_ITEM_CD( getString(3, rs) );
			data.settOdrCtl_CUST_ITEM_NAME( getString(4, rs) );
			data.settOdrCtl_ITEM_CD( getString(5, rs) );
			data.settOdrCtl_ITEM_NAME( getString(6, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR_CTL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_CTL_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tbl_T_ODR_CTL", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_T_ODR_CTL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_T_ODR_CTL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_T_ODR_CTL_clear

			return;
		}

		/**
		 * tbl_T_ODR_CTLクラスの標準コンストラクタ
		 */
		public tbl_T_ODR_CTL()
		{
			//{{user_implement_dev:tbl_T_ODR_CTL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_T_ODR_CTL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_T_SHIP_SLIP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_SHIP_SLIP(\"SLIP_CD\", \"ITEM_CD\", \"CUST_ITEM_CD\", \"PART_NAME\", \"CUST_ODR_NO\", \"CUST_CD\", \"CUST_NAME\", \"DLV_LOC_CD\", \"DLV_LOC_NAME_KANJI\",  \"CUS_DLV_KEY_CD\",  \"DESINATED_SHIP_DATE\", \"DESINATED_DLV_DATE\", \"SCDL_DLV_DATE\", \"SHIP_ODR_QTY\", \"UNIT_CD\", \"UNIT_PRICE\", \"SHIP_ODR_AMOUNT\", \"TAX_AMOUNT\", \"INSPC_TYP\", \"CLIENT_REMARK_KANJI\", \"CLIENT_BARCODE_INF\", \"PRINT_FLG\", \"DEL_FLG\", \"BUYER_NAME\", \"PUCH_ODR_QTY_TOTAL\", \"DLV_ODR_QTY\", \"SHIP_ODR_AMOUNT_TAX\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  T_SHIP_SLIP "
+"where "
+"  T_SHIP_SLIP.\"SLIP_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0010010";
		protected String m_sUpdateProgramName="KU0010010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_SLIP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_T_SHIP_SLIP_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getin_tShipSlip_SLIP_CD(), stmt);
				setString(8, data.getin_tShipSlip_ITEM_CD(), stmt);
				setString(9, data.getin_tShipSlip_CUST_ITEM_CD(), stmt);
				setString(10, data.getin_tShipSlip_PART_NAME(), stmt);
				setString(11, data.getin_tShipSlip_CUST_ODR_NO(), stmt);
				setString(12, data.getin_tShipSlip_CUST_CD(), stmt);
				setString(13, data.getin_tShipSlip_CUST_NAME(), stmt);
				setString(14, data.getin_tShipSlip_DLV_LOC_CD(), stmt);
				setString(15, data.getin_tShipSlip_DLV_LOC_NAME_KANJI(), stmt);
				setString(16, data.getin_tShipSlip_CUS_DLV_KEY_CD(), stmt);
				setString(17, data.getin_tShipSlip_DESINATED_SHIP_DATE(), stmt);
				setString(18, data.getin_tShipSlip_DESINATED_DLV_DATE(), stmt);
				setString(19, data.getin_tShipSlip_SCDL_DLV_DATE(), stmt);
				setString(20, data.getin_tShipSlip_SHIP_ODR_QTY(), stmt);
				setString(21, data.getin_tShipSlip_UNIT_CD(), stmt);
				setString(22, data.getin_tShipSlip_UNIT_PRICE(), stmt);
				setString(23, data.getin_tShipSlip_SHIP_ODR_AMOUNT(), stmt);
				setString(24, data.getin_tShipSlip_TAX_AMOUNT(), stmt);
				setString(25, data.getin_tShipSlip_INSPC_TYP(), stmt);
				setString(26, data.getin_tShipSlip_CLIENT_REMARK_KANJI(), stmt);
				setString(27, data.getin_tShipSlip_CLIENT_BARCODE_INF(), stmt);
				setString(28, data.getin_tShipSlip_PRINT_FLG(), stmt);
				setString(29, data.getin_tShipSlip_DEL_FLG(), stmt);
				setString(30, data.getin_tShipSlip_BUYER_NAME(), stmt);
				setString(31, data.getin_tShipSlip_PUCH_ODR_QTY_TOTAL(), stmt);
				setString(32, data.getin_tShipSlip_DLV_ODR_QTY(), stmt);
				setString(33, data.getin_tShipSlip_SHIP_ODR_AMOUNT_TAX(), stmt);
				setString(34, data.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(35, data.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(36, data.getin_tShipSlip_TAXFREE_SALES_AMOUNT(), stmt);
				setString(37, data.getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(38, data.getin_tShipSlip_EXTERNAL_TAX_AMOUNT(), stmt);
				setString(39, data.getin_tShipSlip_INTERNAL_TAX_AMOUNT(), stmt);
				setString(40, data.getin_tShipSlip_TAX_AMOUNT_1(), stmt);
				setString(41, data.getin_tShipSlip_TAX_AMOUNT_2(), stmt);
				setString(42, data.getin_tShipSlip_TAX_AMOUNT_3(), stmt);
				setString(43, data.getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getdel_tShipSlip_IN_SLIPCD(), stmt);

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
			//{{user_implement_dev:tbl_T_SHIP_SLIP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_T_SHIP_SLIP_clear

			return;
		}

		/**
		 * tbl_T_SHIP_SLIPクラスの標準コンストラクタ
		 */
		public tbl_T_SHIP_SLIP()
		{
			//{{user_implement_dev:tbl_T_SHIP_SLIP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_T_SHIP_SLIP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_M_CUST_BASE extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CUST_BASE.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  M_CUST_BASE.\"CUST_CD\" as \"CUST_CD\", "
+"  M_CUST_BASE.\"DLV_LOC_CD\" as \"DLV_LOC_CD\", "
+"  M_CUST_BASE.\"DLV_LOC_NAME\" as \"DLV_LOC_NAME\", "
+"  M_CUST_BASE.\"DLV_LOC_KNAME\" as \"DLV_LOC_KNAME\", "
+"  M_CUST_BASE.\"DLV_LOC_ENAME\" as \"DLV_LOC_ENAME\", "
+"  M_CUST_BASE.\"ZIP_CD\" as \"ZIP_CD\", "
+"  M_CUST_BASE.\"ADDRESS_1\" as \"ADDRESS_1\", "
+"  M_CUST_BASE.\"ADDRESS_2\" as \"ADDRESS_2\", "
+"  M_CUST_BASE.\"ADDRESS_K_1\" as \"ADDRESS_K_1\", "
+"  M_CUST_BASE.\"ADDRESS_K_2\" as \"ADDRESS_K_2\", "
+"  M_CUST_BASE.\"TEL\" as \"TEL\", "
+"  M_CUST_BASE.\"FAX\" as \"FAX\", "
+"  M_CUST_BASE.\"SHIP_WH_CD\" as \"SHIP_WH_CD\", "
+"  M_CUST_BASE.\"TRANSPORT_CD\" as \"TRANSPORT_CD\", "
+"  M_CUST_BASE.\"TRANSPORT_NAME\" as \"TRANSPORT_NAME\", "
+"  M_CUST_BASE.\"TRANSPORT_LT\" as \"TRANSPORT_LT\", "
+"  M_CUST_BASE.\"CAL_NO\" as \"CAL_NO\", "
+"  M_CUST_BASE.\"TRANSPORT_TYP\" as \"TRANSPORT_TYP\", "
+"  M_CUST_BASE.\"DLV_START_TIME\" as \"DLV_START_TIME\", "
+"  M_CUST_BASE.\"DLV_END_TIME\" as \"DLV_END_TIME\", "
+"  M_CUST_BASE.\"AREA_CLASS_TYP1\" as \"AREA_CLASS_TYP1\", "
+"  M_CUST_BASE.\"AREA_CLASS_1\" as \"AREA_CLASS_1\", "
+"  M_CUST_BASE.\"AREA_CLASS_TYP2\" as \"AREA_CLASS_TYP2\", "
+"  M_CUST_BASE.\"AREA_CLASS_2\" as \"AREA_CLASS_2\", "
+"  M_CUST_BASE.\"AREA_CLASS_TYP3\" as \"AREA_CLASS_TYP3\", "
+"  M_CUST_BASE.\"AREA_CLASS_3\" as \"AREA_CLASS_3\", "
+"  M_CUST_BASE.\"REMARKS_1\" as \"REMARKS_1\", "
+"  M_CUST_BASE.\"REMARKS_2\" as \"REMARKS_2\", "
+"  M_CUST_BASE.\"REMARKS_3\" as \"REMARKS_3\", "
+"  M_CUST_BASE.\"DEPO_WH_CD\" as \"DEPO_WH_CD\" "
+"from "
+"  M_CUST_BASE "
+"where "
+"  M_CUST_BASE.\"COMPANY_CD\" = ? "
+"  and M_CUST_BASE.\"CUST_CD\" = ? "
+"  and M_CUST_BASE.\"DLV_LOC_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_M_CUST_BASE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_M_CUST_BASE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_read
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST_BASE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_M_CUST_BASE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST_BASE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_M_CUST_BASE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST_BASE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_M_CUST_BASE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmCustBase_IN_COMPANYCD());
				if(isNull(data.getmCustBase_IN_COMPANYCD())) isNull = true;
				ary.addElement(data.getmCustBase_IN_CUSTCD());
				if(isNull(data.getmCustBase_IN_CUSTCD())) isNull = true;
				ary.addElement(data.getmCustBase_IN_DLVLOCCD());
				if(isNull(data.getmCustBase_IN_DLVLOCCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getmCustBase_IN_COMPANYCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getmCustBase_IN_CUSTCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getmCustBase_IN_DLVLOCCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setmCustBase_COMPANY_CD( getString(1, rs) );
			data.setmCustBase_CUST_CD( getString(2, rs) );
			data.setmCustBase_DLV_LOC_CD( getString(3, rs) );
			data.setmCustBase_DLV_LOC_NAME( getString(4, rs) );
			data.setmCustBase_DLV_LOC_KNAME( getString(5, rs) );
			data.setmCustBase_DLV_LOC_ENAME( getString(6, rs) );
			data.setmCustBase_ZIP_CD( getString(7, rs) );
			data.setmCustBase_ADDRESS_1( getString(8, rs) );
			data.setmCustBase_ADDRESS_2( getString(9, rs) );
			data.setmCustBase_ADDRESS_K_1( getString(10, rs) );
			data.setmCustBase_ADDRESS_K_2( getString(11, rs) );
			data.setmCustBase_TEL( getString(12, rs) );
			data.setmCustBase_FAX( getString(13, rs) );
			data.setmCustBase_SHIP_WH_CD( getString(14, rs) );
			data.setmCustBase_TRANSPORT_CD( getString(15, rs) );
			data.setmCustBase_TRANSPORT_NAME( getString(16, rs) );
			data.setmCustBase_TRANSPORT_LT( getString(17, rs) );
			data.setmCustBase_CAL_NO( getString(18, rs) );
			data.setmCustBase_TRANSPORT_TYP( getString(19, rs) );
			data.setmCustBase_DLV_START_TIME( getString(20, rs) );
			data.setmCustBase_DLV_END_TIME( getString(21, rs) );
			data.setmCustBase_AREA_CLASS_TYP1( getString(22, rs) );
			data.setmCustBase_AREA_CLASS_1( getString(23, rs) );
			data.setmCustBase_AREA_CLASS_TYP2( getString(24, rs) );
			data.setmCustBase_AREA_CLASS_2( getString(25, rs) );
			data.setmCustBase_AREA_CLASS_TYP3( getString(26, rs) );
			data.setmCustBase_AREA_CLASS_3( getString(27, rs) );
			data.setmCustBase_REMARKS_1( getString(28, rs) );
			data.setmCustBase_REMARKS_2( getString(29, rs) );
			data.setmCustBase_REMARKS_3( getString(30, rs) );
			data.setmCustBase_DEPO_WH_CD( getString(31, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST_BASE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tbl_M_CUST_BASE", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_M_CUST_BASE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_CUST_BASE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_M_CUST_BASE_clear

			return;
		}

		/**
		 * tbl_M_CUST_BASEクラスの標準コンストラクタ
		 */
		public tbl_M_CUST_BASE()
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_M_CUST_BASE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_M_CUST extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CUST.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  M_CUST.\"CUST_CD\" as \"CUST_CD\", "
+"  M_CUST.\"CUST_NAME\" as \"CUST_NAME\", "
+"  M_CUST.\"CUST_NAME\" as \"CUST_ANAME\", "
+"  M_CUST.\"CUST_KNAME\" as \"CUST_KNAME\", "
+"  M_CUST.\"OWN_ORG_CD\" as \"OWN_ORG_CD\", "
+"  M_CUST.\"OWN_PERSON_CD\" as \"OWN_PERSON_CD\", "
+"  M_CUST.\"CUR_CD\" as \"CUR_CD\", "
+"  M_CUST.\"EXCH_TYP\" as \"EXCH_TYP\", "
+"  M_CUST.\"TAX_APPLY_TYP\" as \"TAX_APPLY_TYP\", "
+"  M_CUST.\"TAX_CD\" as \"TAX_CD\", "
+"  M_CUST.\"TAX_CALC_TYP\" as \"TAX_CALC_TYP\", "
+"  M_CUST.\"PRICE_ROUND_TYP\" as \"PRICE_ROUND_TYP\", "
+"  M_CUST.\"DETAIL_ROUND_TYP\" as \"DETAIL_ROUND_TYP\", "
+"  M_CUST.\"UNCONFIRM_ODR_EFF_PRIOD\" as \"UNCONFIRM_ODR_EFF_PRIOD\", "
+"  M_CUST.\"UNCONFIRM_ODR_EFF_TERM_FLG\" as \"UNCONFIRM_ODR_EFF_TERM_FLG\", "
+"  M_CUST.\"EDI_CUST_VEND_CD\" as \"EDI_CUST_VEND_CD\", "
+"  M_CUST.\"PARTIAL_SHIP_INST_FLG\" as \"PARTIAL_SHIP_INST_FLG\", "
+"  M_CUST.\"DEPO_TYP\" as \"DEPO_TYP\", "
+"  M_CUST.\"INSPC_ACPT_TYP\" as \"INSPC_ACPT_TYP\" "
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

		//{{user_implement_dev:tbl_M_CUST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_M_CUST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_read
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_M_CUST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_M_CUST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_M_CUST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmCust_IN_COMPANYCD());
				if(isNull(data.getmCust_IN_COMPANYCD())) isNull = true;
				ary.addElement(data.getmCust_IN_CUSTCD());
				if(isNull(data.getmCust_IN_CUSTCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getmCust_IN_COMPANYCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getmCust_IN_CUSTCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setmCust_COMPANY_CD( getString(1, rs) );
			data.setmCust_CUST_CD( getString(2, rs) );
			data.setmCust_CUST_NAME( getString(3, rs) );
			data.setmCust_CUST_ANAME( getString(4, rs) );
			data.setmCust_CUST_KNAME( getString(5, rs) );
			data.setmCust_OWN_ORG_CD( getString(6, rs) );
			data.setmCust_OWN_PERSON_CD( getString(7, rs) );
			data.setmCust_CUR_CD( getString(8, rs) );
			data.setmCust_EXCH_TYP( getString(9, rs) );
			data.setmCust_TAX_APPLY_TYP( getString(10, rs) );
			data.setmCust_TAX_CD( getString(11, rs) );
			data.setmCust_TAX_CALC_TYP( getString(12, rs) );
			data.setmCust_PRICE_ROUND_TYP( getString(13, rs) );
			data.setmCust_DETAIL_ROUND_TYP( getString(14, rs) );
			data.setmCust_UNCONFIRM_ODR_EFF_PRIOD( getString(15, rs) );
			data.setmCust_UNCONFIRM_ODR_EFF_TERM_FLG( getString(16, rs) );
			data.setmCust_EDI_CUST_VEND_CD( getString(17, rs) );
			data.setmCust_PARTIAL_SHIP_INST_FLG( getString(18, rs) );
			data.setmCust_DEPO_TYP( getString(19, rs) );
			data.setmCust_INSPC_ACPT_TYP( getString(20, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tbl_M_CUST", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tbl_M_CUST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_CUST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_M_CUST_clear

			return;
		}

		/**
		 * tbl_M_CUSTクラスの標準コンストラクタ
		 */
		public tbl_M_CUST()
		{
			//{{user_implement_dev:tbl_M_CUST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_M_CUST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class toriTbl_T_ANS_DLV_DATE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_ANS_DLV_DATE "
+"set "
+"  \"REST_SHIP_ODR_QTY\" = REST_SHIP_ODR_QTY + ?, "
+"  \"SHIP_ODR_CMPLT_FLG\" = ? "
+"where "
+"  T_ANS_DLV_DATE.\"ODR_NO\" = ? "
+"  and T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0010010";
		protected String m_sUpdateProgramName="KU0010010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:toriTbl_T_ANS_DLV_DATE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:toriTbl_T_ANS_DLV_DATE_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
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
				setString(4, data.gettori_tAnsDlvDate_REST_SHIP_ODR_QTY(), stmt);
				setString(5, data.gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(), stmt);
				setString(6, data.gettori_tAnsDlvDate_IN_ODRNO(), stmt);
				setString(7, data.gettori_tAnsDlvDate_IN_PARTDLVSEQNO(), stmt);

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
			//{{user_implement_dev:toriTbl_T_ANS_DLV_DATE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:toriTbl_T_ANS_DLV_DATE_clear

			return;
		}

		/**
		 * toriTbl_T_ANS_DLV_DATEクラスの標準コンストラクタ
		 */
		public toriTbl_T_ANS_DLV_DATE()
		{
			//{{user_implement_dev:toriTbl_T_ANS_DLV_DATE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:toriTbl_T_ANS_DLV_DATE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class chkIsWhCd extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_TYP\" as \"WH_TYP\", "
+"  T_ITEM_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"  DECODE(T_SHIP_ODR_NEW.\"REST_DTY\", null, T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\", T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\" - T_SHIP_ODR_NEW.\"REST_DTY\") as \"PBL_SHIP_QTY\" "
+"from "
+"  M_WH, "
+"  T_ITEM_STOCK, "
+"  ( "
+"    select "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\", "
+"      T_SHIP_ODR_REAL.\"ALLCT_WH_CD\", "
+"      sum(T_SHIP_ODR_REAL.\"SHIP_QTY\" - T_SHIP_ODR_REAL.\"TOTAL_SHIP_QTY\") as REST_DTY "
+"    FROM "
+"      ( "
+"        select distinct "
+"          T_SHIP_ODR.\"SLIP_CD\" as SLIP_CD, "
+"          T_SHIP_ODR.\"ITEM_CD\" as ITEM_CD, "
+"          T_SHIP_ODR.\"SHIP_QTY\" as SHIP_QTY, "
+"          T_SHIP_ODR.\"TOTAL_SHIP_QTY\" as TOTAL_SHIP_QTY, "
+"          T_SHIP_ODR.\"RETURN_QTY\", "
+"          DECODE(T_SHIP.\"ALLCT_WH_CD\", NULL, T_SHIP_ODR.\"ALLCT_WH_CD\", T_SHIP.\"ALLCT_WH_CD\") as ALLCT_WH_CD "
+"        from "
+"          T_SHIP_ODR, "
+"          T_SHIP "
+"        where "
+"          T_SHIP_ODR.\"SLIP_CD\" = T_SHIP.\"SLIP_CD\"(+) "
+"          AND T_SHIP_ODR.\"JOB_ODR_CD\"  IS   NULL "
+"      ) T_SHIP_ODR_REAL "
+"    WHERE "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\" = ? "
+"      and T_SHIP_ODR_REAL.\"ALLCT_WH_CD\" = ? "
+"    group by "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\", "
+"      T_SHIP_ODR_REAL.\"ALLCT_WH_CD\" "
+"  ) T_SHIP_ODR_NEW "
+"where "
+"  M_WH.WH_CD = T_ITEM_STOCK.WH_CD "
+"  AND M_WH.\"WH_CD\" = ? "
+"  and M_WH.\"WH_TYP\" = 10 "
+"  and T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"ITEM_CD\" = T_SHIP_ODR_NEW.\"ITEM_CD\"(+) "
+"  and T_ITEM_STOCK.\"WH_CD\" = T_SHIP_ODR_NEW.\"ALLCT_WH_CD\"(+)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkIsWhCd_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:chkIsWhCd_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsWhCd_read
			if(m_selcmd==null) throw new FoundationException("chkIsWhCd", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:chkIsWhCd_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsWhCd_read2
			if(m_selcmd==null) throw new FoundationException("chkIsWhCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkIsWhCd_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsWhCd_read3
			if(m_selcmd==null) throw new FoundationException("chkIsWhCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkIsWhCd_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getchkisWhCd_IN_ITEMCD());
				if(isNull(data.getchkisWhCd_IN_ITEMCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_WHCD());
				if(isNull(data.getchkisWhCd_IN_WHCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_WHCD());
				if(isNull(data.getchkisWhCd_IN_WHCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_ITEMCD());
				if(isNull(data.getchkisWhCd_IN_ITEMCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_ITEMCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_WHCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_WHCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_ITEMCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setchkisWhCd_WH_CD( getString(1, rs) );
			data.setchkisWhCd_WH_TYP( getString(2, rs) );
			data.setchkisWhCd_ITEM_CD( getString(3, rs) );
			data.setchkisWhCd_PBL_SHIP_QTY( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("chkIsWhCd", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsWhCd_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("chkIsWhCd", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:chkIsWhCd_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:chkIsWhCd_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:chkIsWhCd_clear

			return;
		}

		/**
		 * chkIsWhCdクラスの標準コンストラクタ
		 */
		public chkIsWhCd()
		{
			//{{user_implement_dev:chkIsWhCd_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:chkIsWhCd_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tblM_UNIT_COST extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_UNIT_COST.\"UNIT_COST\" as \"UNIT_COST\", "
+"  TO_CHAR(M_UNIT_COST.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') as \"EFF_PHASE_IN_DATE\" "
+"from "
+"  M_UNIT_COST "
+"where "
+"  M_UNIT_COST.\"COMPANY_CD\" = ? "
+"  and M_UNIT_COST.\"CUST_CD\" = ? "
+"  and M_UNIT_COST.\"ITEM_CD\" = ? "
+"  and M_UNIT_COST.\"EFF_PHASE_IN_DATE\" <= TO_DATE(?, 'YYYY/MM/DD')";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tblM_UNIT_COST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tblM_UNIT_COST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_UNIT_COST_read
			if(m_selcmd==null) throw new FoundationException("tblM_UNIT_COST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tblM_UNIT_COST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_UNIT_COST_read2
			if(m_selcmd==null) throw new FoundationException("tblM_UNIT_COST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tblM_UNIT_COST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_UNIT_COST_read3
			if(m_selcmd==null) throw new FoundationException("tblM_UNIT_COST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tblM_UNIT_COST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmUnitCost_IN_COMPANYCD());
				if(isNull(data.getmUnitCost_IN_COMPANYCD())) isNull = true;
				ary.addElement(data.getmUnitCost_IN_CUSTCD());
				if(isNull(data.getmUnitCost_IN_CUSTCD())) isNull = true;
				ary.addElement(data.getmUnitCost_IN_ITEMCD());
				if(isNull(data.getmUnitCost_IN_ITEMCD())) isNull = true;
				ary.addElement(data.getmUnitCost_IN_EFFPHASEINDATE());
				if(isNull(data.getmUnitCost_IN_EFFPHASEINDATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getmUnitCost_IN_COMPANYCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getmUnitCost_IN_CUSTCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getmUnitCost_IN_ITEMCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getmUnitCost_IN_EFFPHASEINDATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setmUnitCost_UNIT_COST( getString(1, rs) );
			data.setmUnitCost_EFF_PHASE_IN_DATE( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tblM_UNIT_COST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_UNIT_COST_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tblM_UNIT_COST", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tblM_UNIT_COST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tblM_UNIT_COST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tblM_UNIT_COST_clear

			return;
		}

		/**
		 * tblM_UNIT_COSTクラスの標準コンストラクタ
		 */
		public tblM_UNIT_COST()
		{
			//{{user_implement_dev:tblM_UNIT_COST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tblM_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tblM_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_CD\" || '：' || M_WH.\"WH_NAME\" as \"WH_NAME\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_TYP\" = 10 "
+"order by "
+"  M_WH.\"WH_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tblM_WH_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tblM_WH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_WH_read
			if(m_selcmd==null) throw new FoundationException("tblM_WH", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tblM_WH_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_WH_read2
			if(m_selcmd==null) throw new FoundationException("tblM_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tblM_WH_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_WH_read3
			if(m_selcmd==null) throw new FoundationException("tblM_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tblM_WH_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setmWhWH_CD( getString(1, rs) );
			data.setmWhWH_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tblM_WH", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_WH_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tblM_WH", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tblM_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tblM_WH_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tblM_WH_clear

			return;
		}

		/**
		 * tblM_WHクラスの標準コンストラクタ
		 */
		public tblM_WH()
		{
			//{{user_implement_dev:tblM_WH_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tblM_WH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getTax extends DataObject
	{
		protected String m_selcmd = "select "
+"  substr(M_TAX.\"TAX_CD\", 3, 1) as \"TAX_KBN\", "
+"  M_TAX.\"OLD_TAX_RATE_1\" as \"OLD_TAX_1\", "
+"  M_TAX.\"OLD_TAX_RATE_2\" as \"OLD_TAX_2\", "
+"  M_TAX.\"OLD_TAX_RATE_3\" as \"OLD_TAX_3\", "
+"  M_TAX.\"NEW_TAX_RATE_1\" as \"NEW_TAX_1\", "
+"  M_TAX.\"NEW_TAX_RATE_2\" as \"NEW_TAX_2\", "
+"  M_TAX.\"NEW_TAX_RATE_3\" as \"NEW_TAX_3\", "
+"  TO_CHAR(M_TAX.\"NEW_TAX_RATE_START_DATE\", 'YYYY/MM/DD') as \"START_DATE\", "
+"  M_TAX.\"ROUND_TYP\" as \"ROUND_TYP\" "
+"from "
+"  M_TAX "
+"where "
+"  TAX_CD IN ( "
+"    SELECT "
+"      DECODE(M_CUST.TAX_APPLY_TYP, '2', M_CUST.TAX_CD, M_ITEM_SPEC.TAX_CD) TAX_CD "
+"    FROM "
+"      ( "
+"        SELECT "
+"          TAX_APPLY_TYP, "
+"          TAX_CD "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"          AND CUST_CD = ? "
+"      ) M_CUST, "
+"      ( "
+"        SELECT "
+"          TAX_CD "
+"        FROM "
+"          M_ITEM_SPEC "
+"        WHERE "
+"          COMPANY_CD = ? "
+"          AND CUST_CD = ? "
+"          AND CUST_ITEM_CD = ? "
+"      ) M_ITEM_SPEC "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getTax_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getTax_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax_read
			if(m_selcmd==null) throw new FoundationException("getTax", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getTax_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax_read2
			if(m_selcmd==null) throw new FoundationException("getTax", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getTax_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax_read3
			if(m_selcmd==null) throw new FoundationException("getTax", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getTax_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrTaxIN_COMPANYCD());
				if(isNull(data.getstrTaxIN_COMPANYCD())) isNull = true;
				ary.addElement(data.getstrTaxIN_CUSTCD());
				if(isNull(data.getstrTaxIN_CUSTCD())) isNull = true;
				ary.addElement(data.getstrTaxIN_COMPANYCD());
				if(isNull(data.getstrTaxIN_COMPANYCD())) isNull = true;
				ary.addElement(data.getstrTaxIN_CUSTCD());
				if(isNull(data.getstrTaxIN_CUSTCD())) isNull = true;
				ary.addElement(data.getg_CUST_ITEM_CD());
				if(isNull(data.getg_CUST_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getstrTaxIN_COMPANYCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getstrTaxIN_CUSTCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getstrTaxIN_COMPANYCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getstrTaxIN_CUSTCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getg_CUST_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setstrTaxTAX_KBN( getString(1, rs) );
			data.setstrTaxOLD_TAX_1( getString(2, rs) );
			data.setstrTaxOLD_TAX_2( getString(3, rs) );
			data.setstrTaxOLD_TAX_3( getString(4, rs) );
			data.setstrTaxNEW_TAX_1( getString(5, rs) );
			data.setstrTaxNEW_TAX_2( getString(6, rs) );
			data.setstrTaxNEW_TAX_3( getString(7, rs) );
			data.setstrTaxSTART_DATE( getString(8, rs) );
			data.setstrTaxROUND_TYP( getString(9, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getTax", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("getTax", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getTax_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getTax_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getTax_clear

			return;
		}

		/**
		 * getTaxクラスの標準コンストラクタ
		 */
		public getTax()
		{
			//{{user_implement_dev:getTax_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getTax_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getYotakuWhCd extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_TYP\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getYotakuWhCd_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getYotakuWhCd_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getYotakuWhCd_read
			if(m_selcmd==null) throw new FoundationException("getYotakuWhCd", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getYotakuWhCd_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getYotakuWhCd_read2
			if(m_selcmd==null) throw new FoundationException("getYotakuWhCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getYotakuWhCd_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getYotakuWhCd_read3
			if(m_selcmd==null) throw new FoundationException("getYotakuWhCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getYotakuWhCd_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrYotaku_IN_WH_TYP());
				if(isNull(data.getstrYotaku_IN_WH_TYP())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getstrYotaku_IN_WH_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setstrYotaku_WH_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getYotakuWhCd", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getYotakuWhCd_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("getYotakuWhCd", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getYotakuWhCd_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getYotakuWhCd_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getYotakuWhCd_clear

			return;
		}

		/**
		 * getYotakuWhCdクラスの標準コンストラクタ
		 */
		public getYotakuWhCd()
		{
			//{{user_implement_dev:getYotakuWhCd_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getYotakuWhCd_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getSYUKA_LT extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_CLASS_CODE.\"CODE\" as \"CODE\" "
+"from "
+"  SYS_CLASS_CODE "
+"where "
+"  SYS_CLASS_CODE.\"SYS_CLASS\" = 'SALES' "
+"  and SYS_CLASS_CODE.\"CLASS_CODE\" = 'SHIP_LT'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSYUKA_LT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getSYUKA_LT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_read
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getSYUKA_LT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_read2
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getSYUKA_LT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_read3
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getSYUKA_LT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setstrSYUKA_LT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("getSYUKA_LT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:getSYUKA_LT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSYUKA_LT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getSYUKA_LT_clear

			return;
		}

		/**
		 * getSYUKA_LTクラスの標準コンストラクタ
		 */
		public getSYUKA_LT()
		{
			//{{user_implement_dev:getSYUKA_LT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getSYUKA_LT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class chkIsInWhCd extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_TYP\" as \"WH_TYP\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_CD\" = ? "
+"  and M_WH.\"WH_TYP\" = 10";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkIsInWhCd_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:chkIsInWhCd_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsInWhCd_read
			if(m_selcmd==null) throw new FoundationException("chkIsInWhCd", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:chkIsInWhCd_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsInWhCd_read2
			if(m_selcmd==null) throw new FoundationException("chkIsInWhCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkIsInWhCd_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsInWhCd_read3
			if(m_selcmd==null) throw new FoundationException("chkIsInWhCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkIsInWhCd_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getchkis_IN_WHCD());
				if(isNull(data.getchkis_IN_WHCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getchkis_IN_WHCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setchkisinWhCd_WH_CD( getString(1, rs) );
			data.setchkisinWhCd_WH_TYP( getString(2, rs) );
			data.setchkisinWhCd_WH_NAME( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("chkIsInWhCd", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsInWhCd_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("chkIsInWhCd", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:chkIsInWhCd_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:chkIsInWhCd_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:chkIsInWhCd_clear

			return;
		}

		/**
		 * chkIsInWhCdクラスの標準コンストラクタ
		 */
		public chkIsInWhCd()
		{
			//{{user_implement_dev:chkIsInWhCd_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:chkIsInWhCd_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_ODR "
+"set "
+"  \"SHIP_CNT\"=?, "
+"  \"PART_DLV_COUNT\" = ? "
+"where "
+"  T_ODR.\"ODR_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0010010";
		protected String m_sUpdateProgramName="KU0010010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_ODR_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				stmt = conn.prepareStatement(m_updcmd);

				setString(1, data.getuptOdr_SHIP_CNT(), stmt);
				setString(2, data.getuptOdr_PART_DLV_COUNT(), stmt);
				setString(3, data.getuptOdr_IN_ODRNO(), stmt);

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
			//{{user_implement_dev:updateT_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_ODR_clear

			return;
		}

		/**
		 * updateT_ODRクラスの標準コンストラクタ
		 */
		public updateT_ODR()
		{
			//{{user_implement_dev:updateT_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tblM_CAL extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CAL.\"HOLIDAY_FLG\" as \"HOLIDAY_FLG\" "
+"from "
+"  M_CAL, "
+"  M_WH, "
+"  M_PLANT "
+"where "
+"  M_WH.PLANT_CD = M_PLANT.PLANT_CD "
+"  and M_PLANT.CAL_NO = M_CAL.CAL_NO "
+"  and M_WH.WH_CD = ? "
+"  and M_CAL.\"CAL_DATE\" = TO_DATE(?, 'YYYY/MM/DD')";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tblM_CAL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tblM_CAL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_CAL_read
			if(m_selcmd==null) throw new FoundationException("tblM_CAL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tblM_CAL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_CAL_read2
			if(m_selcmd==null) throw new FoundationException("tblM_CAL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tblM_CAL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_CAL_read3
			if(m_selcmd==null) throw new FoundationException("tblM_CAL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tblM_CAL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettWH_CD());
				if(isNull(data.gettWH_CD())) isNull = true;
				ary.addElement(data.gettCAL_DATE());
				if(isNull(data.gettCAL_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.gettWH_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.gettCAL_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.settHOLIDAY_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tblM_CAL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_CAL_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tblM_CAL", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tblM_CAL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tblM_CAL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tblM_CAL_clear

			return;
		}

		/**
		 * tblM_CALクラスの標準コンストラクタ
		 */
		public tblM_CAL()
		{
			//{{user_implement_dev:tblM_CAL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tblM_CAL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tblM_CUR extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CUR.\"DECIMAL_FIG\" "
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

		//{{user_implement_dev:tblM_CUR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tblM_CUR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_CUR_read
			if(m_selcmd==null) throw new FoundationException("tblM_CUR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tblM_CUR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_CUR_read2
			if(m_selcmd==null) throw new FoundationException("tblM_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tblM_CUR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_CUR_read3
			if(m_selcmd==null) throw new FoundationException("tblM_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tblM_CUR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettCUR_CD());
				if(isNull(data.gettCUR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.gettCUR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.settDECIMAL_FIG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tblM_CUR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_CUR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("tblM_CUR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:tblM_CUR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tblM_CUR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tblM_CUR_clear

			return;
		}

		/**
		 * tblM_CURクラスの標準コンストラクタ
		 */
		public tblM_CUR()
		{
			//{{user_implement_dev:tblM_CUR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tblM_CUR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class chkJocsWhCd extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_TYP\" as \"WH_TYP\", "
+"  T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  DECODE(T_SHIP_ODR_NEW.\"REST_DTY\", null, T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\", T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\" - T_SHIP_ODR_NEW.\"REST_DTY\") as \"PBL_SHIP_QTY\" "
+"from "
+"  M_WH, "
+"  T_JOB_ODR_CD_STOCK, "
+"  ( "
+"    select "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\", "
+"      T_SHIP_ODR_REAL.\"JOB_ODR_CD\", "
+"      T_SHIP_ODR_REAL.\"ALLCT_WH_CD\", "
+"      sum(T_SHIP_ODR_REAL.\"SHIP_QTY\" - T_SHIP_ODR_REAL.\"TOTAL_SHIP_QTY\") as REST_DTY "
+"    FROM "
+"      ( "
+"        select distinct "
+"          T_SHIP_ODR.\"SLIP_CD\" as SLIP_CD, "
+"          T_SHIP_ODR.\"ITEM_CD\" as ITEM_CD, "
+"          DECODE(T_SHIP.\"JOB_ODR_CD\", NULL, T_SHIP_ODR.\"JOB_ODR_CD\", T_SHIP.\"JOB_ODR_CD\") as JOB_ODR_CD, "
+"          T_SHIP_ODR.\"SHIP_QTY\" as SHIP_QTY, "
+"          T_SHIP_ODR.\"TOTAL_SHIP_QTY\" as TOTAL_SHIP_QTY, "
+"          T_SHIP_ODR.\"RETURN_QTY\", "
+"          DECODE(T_SHIP.\"ALLCT_WH_CD\", NULL, T_SHIP_ODR.\"ALLCT_WH_CD\", T_SHIP.\"ALLCT_WH_CD\") as ALLCT_WH_CD "
+"        from "
+"          T_SHIP_ODR, "
+"          T_SHIP "
+"        where "
+"          T_SHIP_ODR.\"SLIP_CD\" = T_SHIP.\"SLIP_CD\"(+) "
+"      ) T_SHIP_ODR_REAL "
+"    WHERE "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\" = ? "
+"      and T_SHIP_ODR_REAL.\"JOB_ODR_CD\" = ? "
+"      and T_SHIP_ODR_REAL.\"ALLCT_WH_CD\" = ? "
+"    group by "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\", "
+"      T_SHIP_ODR_REAL.\"JOB_ODR_CD\", "
+"      T_SHIP_ODR_REAL.\"ALLCT_WH_CD\" "
+"  ) T_SHIP_ODR_NEW "
+"where "
+"  M_WH.WH_CD = T_JOB_ODR_CD_STOCK.WH_CD "
+"  AND M_WH.\"WH_CD\" = ? "
+"  and M_WH.\"WH_TYP\" = 10 "
+"  and T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = T_SHIP_ODR_NEW.\"ITEM_CD\"(+) "
+"  and T_JOB_ODR_CD_STOCK.\"WH_CD\" = T_SHIP_ODR_NEW.\"ALLCT_WH_CD\"(+)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkJocsWhCd_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:chkJocsWhCd_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkJocsWhCd_read
			if(m_selcmd==null) throw new FoundationException("chkJocsWhCd", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkJocsWhCd_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkJocsWhCd_read2
			if(m_selcmd==null) throw new FoundationException("chkJocsWhCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkJocsWhCd_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkJocsWhCd_read3
			if(m_selcmd==null) throw new FoundationException("chkJocsWhCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkJocsWhCd_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getchkisWhCd_IN_ITEMCD());
				if(isNull(data.getchkisWhCd_IN_ITEMCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_JOBODRCD());
				if(isNull(data.getchkisWhCd_IN_JOBODRCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_WHCD());
				if(isNull(data.getchkisWhCd_IN_WHCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_WHCD());
				if(isNull(data.getchkisWhCd_IN_WHCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_ITEMCD());
				if(isNull(data.getchkisWhCd_IN_ITEMCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_JOBODRCD());
				if(isNull(data.getchkisWhCd_IN_JOBODRCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_ITEMCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_JOBODRCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_WHCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_WHCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_ITEMCD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getchkisWhCd_IN_JOBODRCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setchkisWhCd_WH_CD( getString(1, rs) );
			data.setchkisWhCd_WH_TYP( getString(2, rs) );
			data.setchkisWhCd_ITEM_CD( getString(3, rs) );
			data.setchkisWhCd_JOB_ODR_CD( getString(4, rs) );
			data.setchkisWhCd_PBL_SHIP_QTY( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("chkJocsWhCd", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkJocsWhCd_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkJocsWhCd_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:chkJocsWhCd_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:chkJocsWhCd_clear

			return;
		}

		/**
		 * chkJocsWhCdクラスの標準コンストラクタ
		 */
		public chkJocsWhCd()
		{
			//{{user_implement_dev:chkJocsWhCd_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:chkJocsWhCd_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_T_JOB_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_JOB_ODR.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\" "
+"FROM "
+"  T_JOB_ODR "
+"WHERE "
+"  T_JOB_ODR.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR.\"JOB_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_T_JOB_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_T_JOB_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_JOB_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_JOB_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:tbl_T_JOB_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserTJobOdr_ITEM_CD());
				if(isNull(data.getserTJobOdr_ITEM_CD())) isNull = true;
				ary.addElement(data.getserTJobOdr_JOB_ODR_CD());
				if(isNull(data.getserTJobOdr_JOB_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getserTJobOdr_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getserTJobOdr_JOB_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setserTJobOdr_JOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_JOB_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_T_JOB_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_T_JOB_ODR_clear

			return;
		}

		/**
		 * tbl_T_JOB_ODRクラスの標準コンストラクタ
		 */
		public tbl_T_JOB_ODR()
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_T_JOB_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class tbl_T_UN_SHIP_LIST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  T_UN_SHIP_LIST "
+"WHERE "
+"  T_UN_SHIP_LIST.\"ACPT_ODR_CD\" = ? "
+"  AND T_UN_SHIP_LIST.\"PART_DLV_SEQ_NO\" = TO_NUMBER(?)";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0010010";
		protected String m_sUpdateProgramName="KU0010010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_UN_SHIP_LIST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:tbl_T_UN_SHIP_LIST_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.gettUnShipList_ACPT_ODR_CD(), stmt);
				setString(2, data.gettUnShipList_PART_DLV_SEQ_NO(), stmt);

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
			//{{user_implement_dev:tbl_T_UN_SHIP_LIST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:tbl_T_UN_SHIP_LIST_clear

			return;
		}

		/**
		 * tbl_T_UN_SHIP_LISTクラスの標準コンストラクタ
		 */
		public tbl_T_UN_SHIP_LIST()
		{
			//{{user_implement_dev:tbl_T_UN_SHIP_LIST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:tbl_T_UN_SHIP_LIST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getTaxByTaxCd extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"   substr(M_TAX.\"TAX_CD\", 3, 1) as \"TAX_KBN\", "
+"  M_TAX.\"OLD_TAX_RATE_1\" AS \"OLD_TAX_RATE_1\", "
+"  M_TAX.\"OLD_TAX_RATE_2\" AS \"OLD_TAX_RATE_2\", "
+"  M_TAX.\"OLD_TAX_RATE_3\" AS \"OLD_TAX_RATE_3\", "
+"  TO_CHAR(M_TAX.\"NEW_TAX_RATE_START_DATE\", 'YYYY/MM/DD') AS \"NEW_TAX_RATE_START_DATE\", "
+"  M_TAX.\"NEW_TAX_RATE_1\" AS \"NEW_TAX_RATE_1\", "
+"  M_TAX.\"NEW_TAX_RATE_2\" AS \"NEW_TAX_RATE_2\", "
+"  M_TAX.\"NEW_TAX_RATE_3\" AS \"NEW_TAX_RATE_3\", "
+"  M_TAX.\"ROUND_TYP\" AS \"ROUND_TYP\" "
+"FROM "
+"  M_TAX "
+"  WHERE M_TAX.\"TAX_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getTaxByTaxCd_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getTaxByTaxCd_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTaxByTaxCd_read
			if(m_selcmd==null) throw new FoundationException("getTaxByTaxCd", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getTaxByTaxCd_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTaxByTaxCd_read2
			if(m_selcmd==null) throw new FoundationException("getTaxByTaxCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getTaxByTaxCd_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTaxByTaxCd_read3
			if(m_selcmd==null) throw new FoundationException("getTaxByTaxCd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getTaxByTaxCd_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrTAX_CD());
				if(isNull(data.getstrTAX_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getstrTAX_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setstrTaxTAX_KBN( getString(1, rs) );
			data.setstrTaxOLD_TAX_1( getString(2, rs) );
			data.setstrTaxOLD_TAX_2( getString(3, rs) );
			data.setstrTaxOLD_TAX_3( getString(4, rs) );
			data.setstrTaxSTART_DATE( getString(5, rs) );
			data.setstrTaxNEW_TAX_1( getString(6, rs) );
			data.setstrTaxNEW_TAX_2( getString(7, rs) );
			data.setstrTaxNEW_TAX_3( getString(8, rs) );
			data.setstrTaxROUND_TYP( getString(9, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getTaxByTaxCd", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTaxByTaxCd_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getTaxByTaxCd_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getTaxByTaxCd_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getTaxByTaxCd_clear

			return;
		}

		/**
		 * getTaxByTaxCdクラスの標準コンストラクタ
		 */
		public getTaxByTaxCd()
		{
			//{{user_implement_dev:getTaxByTaxCd_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getTaxByTaxCd_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectModify_Count extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MODIFY_COUNT "
+"FROM "
+"  T_ANS_DLV_DATE "
+"WHERE "
+"  ODR_NO = ? "
+"  AND PART_DLV_SEQ_NO = TO_NUMBER(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectModify_Count_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectModify_Count_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectModify_Count_read
			if(m_selcmd==null) throw new FoundationException("selectModify_Count", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectModify_Count_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectModify_Count_read2
			if(m_selcmd==null) throw new FoundationException("selectModify_Count", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectModify_Count_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectModify_Count_read3
			if(m_selcmd==null) throw new FoundationException("selectModify_Count", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectModify_Count_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettori_tAnsDlvDate_IN_ODRNO());
				if(isNull(data.gettori_tAnsDlvDate_IN_ODRNO())) isNull = true;
				ary.addElement(data.gettori_tAnsDlvDate_IN_PARTDLVSEQNO());
				if(isNull(data.gettori_tAnsDlvDate_IN_PARTDLVSEQNO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.gettori_tAnsDlvDate_IN_ODRNO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.gettori_tAnsDlvDate_IN_PARTDLVSEQNO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0010010Struct data = new KU0010010Struct();

			data.setselMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectModify_Count", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectModify_Count_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectModify_Count_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectModify_Count_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectModify_Count_clear

			return;
		}

		/**
		 * selectModify_Countクラスの標準コンストラクタ
		 */
		public selectModify_Count()
		{
			//{{user_implement_dev:selectModify_Count_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectModify_Count_constractor

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
		mgetCompanyInfo.clear();
		mgetCompanyInfo = null;
		mgetUserInfo.clear();
		mgetUserInfo = null;
		mgetGyomuDate.clear();
		mgetGyomuDate = null;
		mgetViewLines.clear();
		mgetViewLines = null;
		mtbl_T_ANS_DLV_DATE.clear();
		mtbl_T_ANS_DLV_DATE = null;
		mtbl_T_SHIP_ODR.clear();
		mtbl_T_SHIP_ODR = null;
		mtbl_T_ODR.clear();
		mtbl_T_ODR = null;
		mtbl_M_ITEM.clear();
		mtbl_M_ITEM = null;
		mtbl_T_ODR_CTL.clear();
		mtbl_T_ODR_CTL = null;
		mtbl_T_SHIP_SLIP.clear();
		mtbl_T_SHIP_SLIP = null;
		mtbl_M_CUST_BASE.clear();
		mtbl_M_CUST_BASE = null;
		mtbl_M_CUST.clear();
		mtbl_M_CUST = null;
		mtoriTbl_T_ANS_DLV_DATE.clear();
		mtoriTbl_T_ANS_DLV_DATE = null;
		mchkIsWhCd.clear();
		mchkIsWhCd = null;
		mtblM_UNIT_COST.clear();
		mtblM_UNIT_COST = null;
		mtblM_WH.clear();
		mtblM_WH = null;
		mgetTax.clear();
		mgetTax = null;
		mgetYotakuWhCd.clear();
		mgetYotakuWhCd = null;
		mgetSYUKA_LT.clear();
		mgetSYUKA_LT = null;
		mchkIsInWhCd.clear();
		mchkIsInWhCd = null;
		mupdateT_ODR.clear();
		mupdateT_ODR = null;
		mtblM_CAL.clear();
		mtblM_CAL = null;
		mtblM_CUR.clear();
		mtblM_CUR = null;
		mchkJocsWhCd.clear();
		mchkJocsWhCd = null;
		mtbl_T_JOB_ODR.clear();
		mtbl_T_JOB_ODR = null;
		mtbl_T_UN_SHIP_LIST.clear();
		mtbl_T_UN_SHIP_LIST = null;
		mgetTaxByTaxCd.clear();
		mgetTaxByTaxCd = null;
		mselectModify_Count.clear();
		mselectModify_Count = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * KU0010010クラスの標準コンストラクタ
	 */
	public KU0010010Entity() throws FoundationException
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
