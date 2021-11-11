/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0010/src/com/nec/jp/orteus/metamorBase/AJ0010/AJ0010010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0010;

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

public class AJ0010010Entity extends DataObject
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

	// V_ODR_PROG_LSTクラス インスタンス
	public V_ODR_PROG_LST mV_ODR_PROG_LST = new V_ODR_PROG_LST();

	// M_PLANTクラス インスタンス
	public M_PLANT mM_PLANT = new M_PLANT();

	// SELECT_TIME_CTRLクラス インスタンス
	public SELECT_TIME_CTRL mSELECT_TIME_CTRL = new SELECT_TIME_CTRL();

	// V_ODR_PROG_LSTCntクラス インスタンス
	public V_ODR_PROG_LSTCnt mV_ODR_PROG_LSTCnt = new V_ODR_PROG_LSTCnt();


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
		String m_write_fname="AJ0010010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AJ0010010";

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
	public class V_ODR_PROG_LST extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_ODR_PROG_LST.\"OD_NO\" as \"OD_NO\", "
+"  V_ODR_PROG_LST.\"ODR_STS_TYP\" as \"ODR_STS_TYP\", "
+"  V_ODR_PROG_LST.\"ITEM_CD\" as \"ITEM_CD\", "
+"  V_ODR_PROG_LST.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  V_ODR_PROG_LST.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  FncGetFormattedDatetime(V_ODR_PROG_LST.\"ODR_START_DATE\") as \"ODR_START_DATE\", "
+"  FncGetFormattedDatetime(V_ODR_PROG_LST.\"PRD_START_DATE\") as \"PRD_START_DATE\", "
+"  FncGetFormattedDatetime(V_ODR_PROG_LST.\"PRD_DUE_DATE\") as \"PRD_DUE_DATE\", "
+"  V_ODR_PROG_LST.\"OD_GNR_TYP\" as \"OD_GNR_TYP\", "
+"  TO_CHAR(V_ODR_PROG_LST.\"ODR_QTY\", 'FM999999999999999990.0999') as \"ODR_QTY\", "
+"  TO_CHAR(V_ODR_PROG_LST.\"TOTAL_RCV_QTY\", 'FM999999999999999990.0999') as \"TOTAL_RCV_QTY\", "
+"  FncGetFormattedDatetime(V_ODR_PROG_LST.\"RCV_CMPLT_DATE\") as \"RCV_CMPLT_DATE\", "
+"  V_ODR_PROG_LST.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  V_ODR_PROG_LST.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  V_ODR_PROG_LST.\"JOB_ODR_TYP\" as \"JOB_ODR_TYP\", "
+"  V_ODR_PROG_LST.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  V_ODR_PROG_LST.\"EXTERNAL_DM_FLG\" as \"EXTERNAL_DM_FLG\", "
+"  V_ODR_PROG_LST.\"EXTERNAL_PLAN_CD\" as \"EXTERNAL_PLAN_CD\", "
+"  V_ODR_PROG_LST.\"MRP_TYP\" as \"MRP_TYP\", "
+"  V_ODR_PROG_LST.\"OUTSIDE_TYP\" as \"OUTSIDE_TYP\", "
+"  V_ODR_PROG_LST.\"RLSD_PUCH_ODR_QTY\" as \"RLSD_PUCH_ODR_QTY\", "
+"  V_ODR_PROG_LST.\"WORK_IN_PROC_QTY\" as \"WORK_IN_PROC_QTY\", "
+"  V_ODR_PROG_LST.\"OD_TYP\" as \"OD_TYP\", "
+"  V_ODR_PROG_LST.\"OPR_RSLT_TYP\" as \"OPR_RSLT_TYP\", "
+"  V_ODR_PROG_LST.\"PLANT_CD\" as \"PLANT_CD\", "
+"  TO_CHAR(V_ODR_PROG_LST.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\" "
+"from "
+"  V_ODR_PROG_LST, "
+"  M_ITEM "
+"where "
+"      ((V_ODR_PROG_LST.\"PRD_DUE_DATE\" >= TO_DATE(?,'YYYY/MM/DD HH24:MI') "
+"    and V_ODR_PROG_LST.\"PRD_DUE_DATE\" <=  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or (V_ODR_PROG_LST.\"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or (V_ODR_PROG_LST.\"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI'))) "
+"  and ((V_ODR_PROG_LST.\"PRD_START_DATE\" >=  TO_DATE(?,'YYYY/MM/DD HH24:MI') "
+"    and V_ODR_PROG_LST.\"PRD_START_DATE\" <=  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or  (V_ODR_PROG_LST.\"PRD_START_DATE\" =  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or  (V_ODR_PROG_LST.\"PRD_START_DATE\" =  TO_DATE(?,'YYYY/MM/DD HH24:MI'))) "
+"  and V_ODR_PROG_LST.\"JOB_ODR_CD\" like ? "
+"  and V_ODR_PROG_LST.\"ITEM_CD\" like ? "
+"  and(((V_ODR_PROG_LST.\"ODR_STS_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"ODR_STS_TYP\" = ?) "
+"  and((V_ODR_PROG_LST.\"ODR_STS_TYP\" <> ? "
+"  and V_ODR_PROG_LST.\"DELAY_BASE_DATE\" > V_ODR_PROG_LST.\"PRD_DUE_DATE\" "
+"  and V_ODR_PROG_LST.\"DELAY_BASE_DATE\" = ?) "
+"  or (V_ODR_PROG_LST.\"ODR_STS_TYP\" <> ? "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_BASE_DATE\" <= V_ODR_PROG_LST.\"PRD_DUE_DATE\" "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_BASE_DATE\" = ?))) "
+"  or  V_ODR_PROG_LST.\"ODR_STS_TYP\" = ?) "
+"  and(V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ?) "
+"  and V_ODR_PROG_LST.\"MRP_ODR_TYP\" <> 8 "
+"  and(V_ODR_PROG_LST.\"OD_TYP\" = 1 "
+"  or  V_ODR_PROG_LST.\"OD_TYP\" = 2) "
+"  and V_ODR_PROG_LST.\"PLANT_CD\" = ? "
+"  and V_ODR_PROG_LST.\"DELAY_TYP\" = ? "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_TYP\" = ? "
+"  and V_ODR_PROG_LST.\"ITEM_CD\" = M_ITEM.ITEM_CD(+) "
+"order by "
+"  V_ODR_PROG_LST.\"ITEM_CD\", "
+"  V_ODR_PROG_LST.\"PRD_DUE_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:V_ODR_PROG_LST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:V_ODR_PROG_LST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LST_read
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:V_ODR_PROG_LST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AJ0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LST_read2
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:V_ODR_PROG_LST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AJ0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LST_read3
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:V_ODR_PROG_LST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AJ0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_PRD_DUE_DATE_FROM());
				if(isNull(data.getl_PRD_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_TO());
				if(isNull(data.getl_PRD_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_PRD_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_TO_ZERO());
				if(isNull(data.getl_PRD_DUE_DATE_TO_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_FROM());
				if(isNull(data.getl_PRD_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_TO());
				if(isNull(data.getl_PRD_START_DATE_TO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_FROM_ZERO());
				if(isNull(data.getl_PRD_START_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_TO_ZERO());
				if(isNull(data.getl_PRD_START_DATE_TO_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_1());
				if(isNull(data.getODR_STS_TYP_1())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_2());
				if(isNull(data.getODR_STS_TYP_2())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9_DELAYED());
				if(isNull(data.getODR_STS_TYP_9_DELAYED())) isNull = true;
				ary.addElement(data.getl_DELAY_BASE_DATE());
				if(isNull(data.getl_DELAY_BASE_DATE())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9_NOT_DELAYED());
				if(isNull(data.getODR_STS_TYP_9_NOT_DELAYED())) isNull = true;
				ary.addElement(data.getl_NOT_DELAY_BASE_DATE());
				if(isNull(data.getl_NOT_DELAY_BASE_DATE())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9());
				if(isNull(data.getODR_STS_TYP_9())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_1());
				if(isNull(data.getMRP_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_2());
				if(isNull(data.getMRP_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_3());
				if(isNull(data.getMRP_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_4());
				if(isNull(data.getMRP_ODR_TYP_4())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_5());
				if(isNull(data.getMRP_ODR_TYP_5())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_6());
				if(isNull(data.getMRP_ODR_TYP_6())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_7());
				if(isNull(data.getMRP_ODR_TYP_7())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_8());
				if(isNull(data.getMRP_ODR_TYP_8())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getDELAY_TYP());
				if(isNull(data.getDELAY_TYP())) isNull = true;
				ary.addElement(data.getNOT_DELAY_TYP());
				if(isNull(data.getNOT_DELAY_TYP())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("V_ODR_PROG_LST", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_DUE_DATE_FROM())) setString(no ++, data.getl_PRD_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_DUE_DATE_TO())) setString(no ++, data.getl_PRD_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_PRD_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_DUE_DATE_TO_ZERO())) setString(no ++, data.getl_PRD_DUE_DATE_TO_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_START_DATE_FROM())) setString(no ++, data.getl_PRD_START_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_START_DATE_TO())) setString(no ++, data.getl_PRD_START_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_START_DATE_FROM_ZERO())) setString(no ++, data.getl_PRD_START_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_START_DATE_TO_ZERO())) setString(no ++, data.getl_PRD_START_DATE_TO_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_1())) setString(no ++, data.getODR_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_2())) setString(no ++, data.getODR_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_9_DELAYED())) setString(no ++, data.getODR_STS_TYP_9_DELAYED(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DELAY_BASE_DATE())) setString(no ++, data.getl_DELAY_BASE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_9_NOT_DELAYED())) setString(no ++, data.getODR_STS_TYP_9_NOT_DELAYED(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_NOT_DELAY_BASE_DATE())) setString(no ++, data.getl_NOT_DELAY_BASE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_9())) setString(no ++, data.getODR_STS_TYP_9(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_1())) setString(no ++, data.getMRP_ODR_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_2())) setString(no ++, data.getMRP_ODR_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_3())) setString(no ++, data.getMRP_ODR_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_4())) setString(no ++, data.getMRP_ODR_TYP_4(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_5())) setString(no ++, data.getMRP_ODR_TYP_5(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_6())) setString(no ++, data.getMRP_ODR_TYP_6(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_7())) setString(no ++, data.getMRP_ODR_TYP_7(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_8())) setString(no ++, data.getMRP_ODR_TYP_8(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDELAY_TYP())) setString(no ++, data.getDELAY_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getNOT_DELAY_TYP())) setString(no ++, data.getNOT_DELAY_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AJ0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AJ0010010Struct data = new AJ0010010Struct();

			data.setl_OD_NO( getString(1, rs) );
			data.setl_ODR_STS_TYP( getInteger(2, rs) );
			data.setl_ITEM_CD( getString(3, rs) );
			data.setl_ITEM_NAME( getString(4, rs) );
			data.setl_MRP_ODR_TYP( getInteger(5, rs) );
			data.setl_ODR_START_DATE( getString(6, rs) );
			data.setl_PRD_START_DATE( getString(7, rs) );
			data.setl_PRD_DUE_DATE( getString(8, rs) );
			data.setOD_GNR_TYP( getInteger(9, rs) );
			data.setl_ODR_QTY( getString(10, rs) );
			data.setl_TOTAL_RCV_QTY( getString(11, rs) );
			data.setl_RCV_CMPLT_DATE( getString(12, rs) );
			data.setl_JOB_ODR_CD( getString(13, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(14, rs) );
			data.setJOB_ODR_TYP( getInteger(15, rs) );
			data.setl_ALC_GRP_CD( getString(16, rs) );
			data.setEXTERNAL_DM_FLG( getInteger(17, rs) );
			data.setl_EXTERNAL_PLAN_CD( getString(18, rs) );
			data.setMRP_TYP( getInteger(19, rs) );
			data.setOUTSIDE_TYP( getInteger(20, rs) );
			data.setl_RLSD_PUCH_ODR_QTY( getString(21, rs) );
			data.setl_WORK_IN_PROC_QTY( getString(22, rs) );
			data.setOD_TYP( getInteger(23, rs) );
			data.setl_OPR_RSLT_TYP( getInteger(24, rs) );
			data.setl_PLANT_CD( getString(25, rs) );
			data.setl_BUSINESS_OPR_DATE( getString(26, rs) );
			data.setl_STOCK_UNIT( getString(27, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LST_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("V_ODR_PROG_LST", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:V_ODR_PROG_LST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:V_ODR_PROG_LST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:V_ODR_PROG_LST_clear

			return;
		}

		/**
		 * V_ODR_PROG_LSTクラスの標準コンストラクタ
		 */
		public V_ODR_PROG_LST()
		{
			//{{user_implement_dev:V_ODR_PROG_LST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:V_ODR_PROG_LST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_PLANT extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PLANT.\"PLANT_NAME\" AS \"PLANT_NAME\" "
+"FROM "
+"  M_PLANT "
+"WHERE "
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
		public List read(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_read
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
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
		public List read(Connection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(Connection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AJ0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AJ0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AJ0010010Struct data = new AJ0010010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("M_PLANT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:M_PLANT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(Connection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AJ0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AJ0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AJ0010010Struct data = new AJ0010010Struct();

			data.setTIME_CTRL( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
	public class V_ODR_PROG_LSTCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  COUNT(1) "
+"from "
+"  V_ODR_PROG_LST, "
+"  M_ITEM "
+"where "
+"    ((V_ODR_PROG_LST.\"PRD_DUE_DATE\" >= TO_DATE(?,'YYYY/MM/DD HH24:MI') "
+"    and V_ODR_PROG_LST.\"PRD_DUE_DATE\" <=  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or (V_ODR_PROG_LST.\"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or (V_ODR_PROG_LST.\"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI'))) "
+"  and ((V_ODR_PROG_LST.\"PRD_START_DATE\" >=  TO_DATE(?,'YYYY/MM/DD HH24:MI') "
+"    and V_ODR_PROG_LST.\"PRD_START_DATE\" <=  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or  (V_ODR_PROG_LST.\"PRD_START_DATE\" =  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or  (V_ODR_PROG_LST.\"PRD_START_DATE\" =  TO_DATE(?,'YYYY/MM/DD HH24:MI'))) "
+"  and V_ODR_PROG_LST.\"JOB_ODR_CD\" like ? "
+"  and V_ODR_PROG_LST.\"ITEM_CD\" like ? "
+"  and(((V_ODR_PROG_LST.\"ODR_STS_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"ODR_STS_TYP\" = ?) "
+"  and((V_ODR_PROG_LST.\"ODR_STS_TYP\" <> ? "
+"  and V_ODR_PROG_LST.\"DELAY_BASE_DATE\" > V_ODR_PROG_LST.\"PRD_DUE_DATE\" "
+"  and V_ODR_PROG_LST.\"DELAY_BASE_DATE\" = ?) "
+"  or (V_ODR_PROG_LST.\"ODR_STS_TYP\" <> ? "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_BASE_DATE\" <= V_ODR_PROG_LST.\"PRD_DUE_DATE\" "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_BASE_DATE\" = ?))) "
+"  or  V_ODR_PROG_LST.\"ODR_STS_TYP\" = ?) "
+"  and(V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ?) "
+"  and V_ODR_PROG_LST.\"MRP_ODR_TYP\" <> 8 "
+"  and(V_ODR_PROG_LST.\"OD_TYP\" = 1 "
+"  or  V_ODR_PROG_LST.\"OD_TYP\" = 2) "
+"  and V_ODR_PROG_LST.\"PLANT_CD\" = ? "
+"  and V_ODR_PROG_LST.\"DELAY_TYP\" = ? "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_TYP\" = ? "
+"  and V_ODR_PROG_LST.\"ITEM_CD\" = M_ITEM.ITEM_CD(+) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:V_ODR_PROG_LSTCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:V_ODR_PROG_LSTCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_read
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LSTCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AJ0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_read2
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LSTCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AJ0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_read3
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LSTCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AJ0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_PRD_DUE_DATE_FROM());
				if(isNull(data.getl_PRD_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_TO());
				if(isNull(data.getl_PRD_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_PRD_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_TO_ZERO());
				if(isNull(data.getl_PRD_DUE_DATE_TO_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_FROM());
				if(isNull(data.getl_PRD_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_TO());
				if(isNull(data.getl_PRD_START_DATE_TO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_FROM_ZERO());
				if(isNull(data.getl_PRD_START_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_TO_ZERO());
				if(isNull(data.getl_PRD_START_DATE_TO_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_1());
				if(isNull(data.getODR_STS_TYP_1())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_2());
				if(isNull(data.getODR_STS_TYP_2())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9_DELAYED());
				if(isNull(data.getODR_STS_TYP_9_DELAYED())) isNull = true;
				ary.addElement(data.getl_DELAY_BASE_DATE());
				if(isNull(data.getl_DELAY_BASE_DATE())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9_NOT_DELAYED());
				if(isNull(data.getODR_STS_TYP_9_NOT_DELAYED())) isNull = true;
				ary.addElement(data.getl_NOT_DELAY_BASE_DATE());
				if(isNull(data.getl_NOT_DELAY_BASE_DATE())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9());
				if(isNull(data.getODR_STS_TYP_9())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_1());
				if(isNull(data.getMRP_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_2());
				if(isNull(data.getMRP_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_3());
				if(isNull(data.getMRP_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_4());
				if(isNull(data.getMRP_ODR_TYP_4())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_5());
				if(isNull(data.getMRP_ODR_TYP_5())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_6());
				if(isNull(data.getMRP_ODR_TYP_6())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_7());
				if(isNull(data.getMRP_ODR_TYP_7())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_8());
				if(isNull(data.getMRP_ODR_TYP_8())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getDELAY_TYP());
				if(isNull(data.getDELAY_TYP())) isNull = true;
				ary.addElement(data.getNOT_DELAY_TYP());
				if(isNull(data.getNOT_DELAY_TYP())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("V_ODR_PROG_LSTCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_DUE_DATE_FROM())) setString(no ++, data.getl_PRD_DUE_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_DUE_DATE_TO())) setString(no ++, data.getl_PRD_DUE_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_PRD_DUE_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_DUE_DATE_TO_ZERO())) setString(no ++, data.getl_PRD_DUE_DATE_TO_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_START_DATE_FROM())) setString(no ++, data.getl_PRD_START_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_START_DATE_TO())) setString(no ++, data.getl_PRD_START_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_START_DATE_FROM_ZERO())) setString(no ++, data.getl_PRD_START_DATE_FROM_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_PRD_START_DATE_TO_ZERO())) setString(no ++, data.getl_PRD_START_DATE_TO_ZERO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_1())) setString(no ++, data.getODR_STS_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_2())) setString(no ++, data.getODR_STS_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_9_DELAYED())) setString(no ++, data.getODR_STS_TYP_9_DELAYED(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_DELAY_BASE_DATE())) setString(no ++, data.getl_DELAY_BASE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_9_NOT_DELAYED())) setString(no ++, data.getODR_STS_TYP_9_NOT_DELAYED(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getl_NOT_DELAY_BASE_DATE())) setString(no ++, data.getl_NOT_DELAY_BASE_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_STS_TYP_9())) setString(no ++, data.getODR_STS_TYP_9(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_1())) setString(no ++, data.getMRP_ODR_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_2())) setString(no ++, data.getMRP_ODR_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_3())) setString(no ++, data.getMRP_ODR_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_4())) setString(no ++, data.getMRP_ODR_TYP_4(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_5())) setString(no ++, data.getMRP_ODR_TYP_5(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_6())) setString(no ++, data.getMRP_ODR_TYP_6(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_7())) setString(no ++, data.getMRP_ODR_TYP_7(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getMRP_ODR_TYP_8())) setString(no ++, data.getMRP_ODR_TYP_8(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDELAY_TYP())) setString(no ++, data.getDELAY_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getNOT_DELAY_TYP())) setString(no ++, data.getNOT_DELAY_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AJ0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AJ0010010Struct data = new AJ0010010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LSTCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_clear

			return;
		}

		/**
		 * V_ODR_PROG_LSTCntクラスの標準コンストラクタ
		 */
		public V_ODR_PROG_LSTCnt()
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_constractor

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
		mV_ODR_PROG_LST.clear();
		mV_ODR_PROG_LST = null;
		mM_PLANT.clear();
		mM_PLANT = null;
		mSELECT_TIME_CTRL.clear();
		mSELECT_TIME_CTRL = null;
		mV_ODR_PROG_LSTCnt.clear();
		mV_ODR_PROG_LSTCnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AJ0010010クラスの標準コンストラクタ
	 */
	public AJ0010010Entity() throws FoundationException
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
