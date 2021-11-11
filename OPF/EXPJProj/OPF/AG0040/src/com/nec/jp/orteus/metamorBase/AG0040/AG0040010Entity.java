/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0040/src/com/nec/jp/orteus/metamorBase/AG0040/AG0040010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0040;

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

public class AG0040010Entity extends DataObject
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

	// selectT_STOCK1クラス インスタンス
	public selectT_STOCK1 mselectT_STOCK1 = new selectT_STOCK1();

	// selectM_PLANTクラス インスタンス
	public selectM_PLANT mselectM_PLANT = new selectM_PLANT();

	// selectM_WHクラス インスタンス
	public selectM_WH mselectM_WH = new selectM_WH();

	// selectM_VEND_CTRLクラス インスタンス
	public selectM_VEND_CTRL mselectM_VEND_CTRL = new selectM_VEND_CTRL();

	// selectM_ITEMクラス インスタンス
	public selectM_ITEM mselectM_ITEM = new selectM_ITEM();

	// selectT_STOCK2クラス インスタンス
	public selectT_STOCK2 mselectT_STOCK2 = new selectT_STOCK2();

	// selectT_STOCK3クラス インスタンス
	public selectT_STOCK3 mselectT_STOCK3 = new selectT_STOCK3();

	// selectT_STOCK4クラス インスタンス
	public selectT_STOCK4 mselectT_STOCK4 = new selectT_STOCK4();

	// selectT_STOCK5クラス インスタンス
	public selectT_STOCK5 mselectT_STOCK5 = new selectT_STOCK5();

	// selectT_STOCK6クラス インスタンス
	public selectT_STOCK6 mselectT_STOCK6 = new selectT_STOCK6();

	// selectT_STOCK7クラス インスタンス
	public selectT_STOCK7 mselectT_STOCK7 = new selectT_STOCK7();

	// selectT_STOCK8クラス インスタンス
	public selectT_STOCK8 mselectT_STOCK8 = new selectT_STOCK8();

	// selectT_STOCK1Cntクラス インスタンス
	public selectT_STOCK1Cnt mselectT_STOCK1Cnt = new selectT_STOCK1Cnt();

	// selectT_STOCK2Cntクラス インスタンス
	public selectT_STOCK2Cnt mselectT_STOCK2Cnt = new selectT_STOCK2Cnt();

	// selectT_STOCK3Cntクラス インスタンス
	public selectT_STOCK3Cnt mselectT_STOCK3Cnt = new selectT_STOCK3Cnt();

	// selectT_STOCK4Cntクラス インスタンス
	public selectT_STOCK4Cnt mselectT_STOCK4Cnt = new selectT_STOCK4Cnt();

	// selectT_STOCK5Cntクラス インスタンス
	public selectT_STOCK5Cnt mselectT_STOCK5Cnt = new selectT_STOCK5Cnt();

	// selectT_STOCK6Cntクラス インスタンス
	public selectT_STOCK6Cnt mselectT_STOCK6Cnt = new selectT_STOCK6Cnt();

	// selectT_STOCK7Cntクラス インスタンス
	public selectT_STOCK7Cnt mselectT_STOCK7Cnt = new selectT_STOCK7Cnt();

	// selectT_STOCK8Cntクラス インスタンス
	public selectT_STOCK8Cnt mselectT_STOCK8Cnt = new selectT_STOCK8Cnt();


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
		String m_write_fname="AG0040010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AG0040010";

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
	public class selectT_STOCK1 extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_WH_STOCK_LST.PLANT_CD, "
+"  V_WH_STOCK_LST.WH_CD, "
+"  V_WH_STOCK_LST.WH_NAME, "
+"  V_WH_STOCK_LST.DISPLAY_NAME, "
+"  V_WH_STOCK_LST.VEND_CD, "
+"  V_WH_STOCK_LST.VEND_ANAME, "
+"  V_WH_STOCK_LST.ITEM_CD, "
+"  V_WH_STOCK_LST.ITEM_NAME, "
+"  V_WH_STOCK_LST.JOB_ODR_CD, "
+"  V_WH_STOCK_LST.STOCK_ON_HAND_QTY, "
+"  V_WH_STOCK_LST.DEFECT_QTY, "
+"  V_WH_STOCK_LST.PRVS_DAYEND_STOCK_QTY, "
+"  V_WH_STOCK_LST.PRVS_MONTHEND_STOCK_QTY, "
+"  V_WH_STOCK_LST.STOCK_UNIT, "
+"  (CASE "
+"    WHEN V_WH_STOCK_LST.SUPPLY_KBN IS NULL THEN( "
+"    SELECT "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'CONS_TYP' "
+"      AND VALUE = 2 "
+"  ) "
+"    ELSE V_WH_STOCK_LST.SUPPLY_KBN "
+"  END) AS SUPPLY_KBN_DN "
+"from "
+"  V_WH_STOCK_LST "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and JOB_ODR_CD like(?) "
+"  and ITEM_CD = ? "
+"order by "
+"  PLANT_CD, "
+"  WH_CD, "
+"  VEND_CD, "
+"  ITEM_CD, "
+"  JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK1_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_STOCK1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK1_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK1_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_JOB_ODR_CD());
				if(isNull(data.getIN_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK1", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_JOB_ODR_CD())) setString(no ++, data.getIN_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setWH_NAME( getString(3, rs) );
			data.setMRP_FLG( getString(4, rs) );
			data.setVEND_CD( getString(5, rs) );
			data.setVEND_ANAME( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setJOB_ODR_CD( getString(9, rs) );
			data.setSTOCK_ON_HAND_QTY( getString(10, rs) );
			data.setDEFECT_QTY( getString(11, rs) );
			data.setPRVS_DAYEND_STOCK_QTY( getString(12, rs) );
			data.setPRVS_MONTHEND_STOCK_QTY( getString(13, rs) );
			data.setSTOCK_UNIT( getString(14, rs) );
			data.setSUPPLY_KBN_DN( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK1_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectT_STOCK1", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_STOCK1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK1_clear

			return;
		}

		/**
		 * selectT_STOCK1クラスの標準コンストラクタ
		 */
		public selectT_STOCK1()
		{
			//{{user_implement_dev:selectT_STOCK1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PLANT extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PLANT.\"PLANT_CD\" as \"PLANT_CD\", "
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

		//{{user_implement_dev:selectM_PLANT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PLANT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PLANT_read
			if(m_selcmd==null) throw new FoundationException("selectM_PLANT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_PLANT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PLANT_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PLANT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PLANT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PLANT_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PLANT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PLANT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getIN_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setreadPLAN_CD( getString(1, rs) );
			data.setIN_PLANT_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PLANT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PLANT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectM_PLANT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_PLANT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PLANT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PLANT_clear

			return;
		}

		/**
		 * selectM_PLANTクラスの標準コンストラクタ
		 */
		public selectM_PLANT()
		{
			//{{user_implement_dev:selectM_PLANT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PLANT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"PLANT_CD\" as \"PLANT_CD\", "
+"  M_WH.\"VEND_CD\" as \"VEND_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_WH_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_WH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_read
			if(m_selcmd==null) throw new FoundationException("selectM_WH", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_WH_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_read2
			if(m_selcmd==null) throw new FoundationException("selectM_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_WH_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_read3
			if(m_selcmd==null) throw new FoundationException("selectM_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_WH_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getIN_WH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setreadWH_CD( getString(1, rs) );
			data.setreadPLAN_CD( getString(2, rs) );
			data.setreadVEND_CD( getString(3, rs) );
			data.setIN_WH_NAME( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_WH", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectM_WH", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_WH_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_WH_clear

			return;
		}

		/**
		 * selectM_WHクラスの標準コンストラクタ
		 */
		public selectM_WH()
		{
			//{{user_implement_dev:selectM_WH_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_WH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_VEND_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_VEND_CTRL.\"VEND_CD\" as \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_NAME\" as \"VEND_NAME\" "
+"from "
+"  M_VEND_CTRL "
+"where "
+"  M_VEND_CTRL.\"VEND_CD\" = ?";
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
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_VEND_CTRL_read
			if(m_selcmd==null) throw new FoundationException("selectM_VEND_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
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
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
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
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getIN_VEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setreadVEND_CD( getString(1, rs) );
			data.setIN_VEND_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_VEND_CTRL_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectM_VEND_CTRL", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_VEND_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
	public class selectM_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\" "
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
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_read
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
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
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
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
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getIN_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setreadITEM_CD( getString(1, rs) );
			data.setIN_ITEM_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectM_ITEM", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
	public class selectT_STOCK2 extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_WH_STOCK_LST.PLANT_CD, "
+"  V_WH_STOCK_LST.WH_CD, "
+"  V_WH_STOCK_LST.WH_NAME, "
+"  V_WH_STOCK_LST.DISPLAY_NAME, "
+"  V_WH_STOCK_LST.VEND_CD, "
+"  V_WH_STOCK_LST.VEND_ANAME, "
+"  V_WH_STOCK_LST.ITEM_CD, "
+"  V_WH_STOCK_LST.ITEM_NAME, "
+"  V_WH_STOCK_LST.JOB_ODR_CD, "
+"  V_WH_STOCK_LST.STOCK_ON_HAND_QTY, "
+"  V_WH_STOCK_LST.DEFECT_QTY, "
+"  V_WH_STOCK_LST.PRVS_DAYEND_STOCK_QTY, "
+"  V_WH_STOCK_LST.PRVS_MONTHEND_STOCK_QTY, "
+"  V_WH_STOCK_LST.STOCK_UNIT, "
+"  V_WH_STOCK_LST.SUPPLY_KBN, "
+"  (CASE "
+"    WHEN V_WH_STOCK_LST.SUPPLY_KBN IS NULL THEN( "
+"    SELECT "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'CONS_TYP' "
+"      AND VALUE = 2 "
+"  ) "
+"    ELSE V_WH_STOCK_LST.SUPPLY_KBN "
+"  END) AS SUPPLY_KBN_DN "
+"from "
+"  V_WH_STOCK_LST "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and JOB_ODR_CD like(?) "
+"  and ITEM_CD = ? "
+"  and VEND_CD is not null "
+"  and STOCK_ON_HAND_QTY < 0 "
+"order by "
+"  PLANT_CD, "
+"  WH_CD, "
+"  VEND_CD, "
+"  ITEM_CD, "
+"  JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK2_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_STOCK2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK2_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK2_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_JOB_ODR_CD());
				if(isNull(data.getIN_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK2", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_JOB_ODR_CD())) setString(no ++, data.getIN_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setWH_NAME( getString(3, rs) );
			data.setMRP_FLG( getString(4, rs) );
			data.setVEND_CD( getString(5, rs) );
			data.setVEND_ANAME( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setJOB_ODR_CD( getString(9, rs) );
			data.setSTOCK_ON_HAND_QTY( getString(10, rs) );
			data.setDEFECT_QTY( getString(11, rs) );
			data.setPRVS_DAYEND_STOCK_QTY( getString(12, rs) );
			data.setPRVS_MONTHEND_STOCK_QTY( getString(13, rs) );
			data.setSTOCK_UNIT( getString(14, rs) );
			data.setSUPPLY_KBN( getString(15, rs) );
			data.setSUPPLY_KBN_DN( getString(16, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK2", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK2_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectT_STOCK2", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_STOCK2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK2_clear

			return;
		}

		/**
		 * selectT_STOCK2クラスの標準コンストラクタ
		 */
		public selectT_STOCK2()
		{
			//{{user_implement_dev:selectT_STOCK2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK3 extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_WH_STOCK_LST.PLANT_CD, "
+"  V_WH_STOCK_LST.WH_CD, "
+"  V_WH_STOCK_LST.WH_NAME, "
+"  V_WH_STOCK_LST.DISPLAY_NAME, "
+"  V_WH_STOCK_LST.VEND_CD, "
+"  V_WH_STOCK_LST.VEND_ANAME, "
+"  V_WH_STOCK_LST.ITEM_CD, "
+"  V_WH_STOCK_LST.ITEM_NAME, "
+"  V_WH_STOCK_LST.JOB_ODR_CD, "
+"  V_WH_STOCK_LST.STOCK_ON_HAND_QTY, "
+"  V_WH_STOCK_LST.DEFECT_QTY, "
+"  V_WH_STOCK_LST.PRVS_DAYEND_STOCK_QTY, "
+"  V_WH_STOCK_LST.PRVS_MONTHEND_STOCK_QTY, "
+"  V_WH_STOCK_LST.STOCK_UNIT, "
+"  V_WH_STOCK_LST.SUPPLY_KBN, "
+"  (CASE "
+"    WHEN V_WH_STOCK_LST.SUPPLY_KBN IS NULL THEN( "
+"    SELECT "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'CONS_TYP' "
+"      AND VALUE = 2 "
+"  ) "
+"    ELSE V_WH_STOCK_LST.SUPPLY_KBN "
+"  END) AS SUPPLY_KBN_DN "
+"from "
+"  V_WH_STOCK_LST "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and JOB_ODR_CD like(?) "
+"  and ITEM_CD = ? "
+"  and VEND_CD is not null "
+"order by "
+"  PLANT_CD, "
+"  WH_CD, "
+"  VEND_CD, "
+"  ITEM_CD, "
+"  JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK3_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK3_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK3_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK3", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_STOCK3_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK3_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK3", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK3_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK3_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK3", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK3_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_JOB_ODR_CD());
				if(isNull(data.getIN_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK3", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_JOB_ODR_CD())) setString(no ++, data.getIN_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setWH_NAME( getString(3, rs) );
			data.setMRP_FLG( getString(4, rs) );
			data.setVEND_CD( getString(5, rs) );
			data.setVEND_ANAME( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setJOB_ODR_CD( getString(9, rs) );
			data.setSTOCK_ON_HAND_QTY( getString(10, rs) );
			data.setDEFECT_QTY( getString(11, rs) );
			data.setPRVS_DAYEND_STOCK_QTY( getString(12, rs) );
			data.setPRVS_MONTHEND_STOCK_QTY( getString(13, rs) );
			data.setSTOCK_UNIT( getString(14, rs) );
			data.setSUPPLY_KBN( getString(15, rs) );
			data.setSUPPLY_KBN_DN( getString(16, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK3", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK3_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectT_STOCK3", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_STOCK3_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK3_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK3_clear

			return;
		}

		/**
		 * selectT_STOCK3クラスの標準コンストラクタ
		 */
		public selectT_STOCK3()
		{
			//{{user_implement_dev:selectT_STOCK3_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK3_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK4 extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_WH_STOCK_LST.PLANT_CD, "
+"  V_WH_STOCK_LST.WH_CD, "
+"  V_WH_STOCK_LST.WH_NAME, "
+"  V_WH_STOCK_LST.DISPLAY_NAME, "
+"  V_WH_STOCK_LST.VEND_CD, "
+"  V_WH_STOCK_LST.VEND_ANAME, "
+"  V_WH_STOCK_LST.ITEM_CD, "
+"  V_WH_STOCK_LST.ITEM_NAME, "
+"  V_WH_STOCK_LST.JOB_ODR_CD, "
+"  V_WH_STOCK_LST.STOCK_ON_HAND_QTY, "
+"  V_WH_STOCK_LST.DEFECT_QTY, "
+"  V_WH_STOCK_LST.PRVS_DAYEND_STOCK_QTY, "
+"  V_WH_STOCK_LST.PRVS_MONTHEND_STOCK_QTY, "
+"  V_WH_STOCK_LST.STOCK_UNIT, "
+"  V_WH_STOCK_LST.SUPPLY_KBN, "
+"  (CASE "
+"    WHEN V_WH_STOCK_LST.SUPPLY_KBN IS NULL THEN( "
+"    SELECT "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'CONS_TYP' "
+"      AND VALUE = 2 "
+"  ) "
+"    ELSE V_WH_STOCK_LST.SUPPLY_KBN "
+"  END) AS SUPPLY_KBN_DN "
+"from "
+"  V_WH_STOCK_LST "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and JOB_ODR_CD like(?) "
+"  and ITEM_CD = ? "
+"  and STOCK_ON_HAND_QTY < 0 "
+"order by "
+"  PLANT_CD, "
+"  WH_CD, "
+"  VEND_CD, "
+"  ITEM_CD, "
+"  JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK4_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK4_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK4_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK4", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_STOCK4_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK4_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK4", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK4_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK4_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK4", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK4_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_JOB_ODR_CD());
				if(isNull(data.getIN_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK4", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_JOB_ODR_CD())) setString(no ++, data.getIN_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setWH_NAME( getString(3, rs) );
			data.setMRP_FLG( getString(4, rs) );
			data.setVEND_CD( getString(5, rs) );
			data.setVEND_ANAME( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setJOB_ODR_CD( getString(9, rs) );
			data.setSTOCK_ON_HAND_QTY( getString(10, rs) );
			data.setDEFECT_QTY( getString(11, rs) );
			data.setPRVS_DAYEND_STOCK_QTY( getString(12, rs) );
			data.setPRVS_MONTHEND_STOCK_QTY( getString(13, rs) );
			data.setSTOCK_UNIT( getString(14, rs) );
			data.setSUPPLY_KBN( getString(15, rs) );
			data.setSUPPLY_KBN_DN( getString(16, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK4", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK4_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectT_STOCK4", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_STOCK4_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK4_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK4_clear

			return;
		}

		/**
		 * selectT_STOCK4クラスの標準コンストラクタ
		 */
		public selectT_STOCK4()
		{
			//{{user_implement_dev:selectT_STOCK4_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK4_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK5 extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_WH_STOCK_LST_LOT.PLANT_CD, "
+"  V_WH_STOCK_LST_LOT.WH_CD, "
+"  V_WH_STOCK_LST_LOT.WH_NAME, "
+"  V_WH_STOCK_LST_LOT.DISPLAY_NAME, "
+"  V_WH_STOCK_LST_LOT.VEND_CD, "
+"  V_WH_STOCK_LST_LOT.VEND_ANAME, "
+"  V_WH_STOCK_LST_LOT.ITEM_CD, "
+"  V_WH_STOCK_LST_LOT.ITEM_NAME, "
+"  V_WH_STOCK_LST_LOT.LOT_NO, "
+"  V_WH_STOCK_LST_LOT.JOB_ODR_CD, "
+"  V_WH_STOCK_LST_LOT.STOCK_ON_HAND_QTY, "
+"  V_WH_STOCK_LST_LOT.DEFECT_QTY, "
+"  V_WH_STOCK_LST_LOT.PRVS_DAYEND_STOCK_QTY, "
+"  V_WH_STOCK_LST_LOT.PRVS_MONTHEND_STOCK_QTY, "
+"  V_WH_STOCK_LST_LOT.STOCK_UNIT, "
+"  V_WH_STOCK_LST_LOT.SUPPLY_KBN, "
+"  (CASE "
+"    WHEN V_WH_STOCK_LST_LOT.SUPPLY_KBN IS NULL THEN( "
+"    SELECT "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'CONS_TYP' "
+"      AND VALUE = 2 "
+"  ) "
+"    ELSE V_WH_STOCK_LST_LOT.SUPPLY_KBN "
+"  END) AS SUPPLY_KBN_DN "
+"from "
+"  V_WH_STOCK_LST_LOT "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and ITEM_CD = ? "
+"  and LOT_NO like(?) "
+"  and VEND_CD is not null "
+"  and STOCK_ON_HAND_QTY < 0 "
+"order by "
+"  PLANT_CD, "
+"  WH_CD, "
+"  VEND_CD, "
+"  ITEM_CD, "
+"  LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK5_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK5_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK5_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK5", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK5_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK5_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK5", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK5_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK5_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK5", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK5_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK5", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setWH_NAME( getString(3, rs) );
			data.setMRP_FLG( getString(4, rs) );
			data.setVEND_CD( getString(5, rs) );
			data.setVEND_ANAME( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setl_LOT_NO( getString(9, rs) );
			data.setJOB_ODR_CD( getString(10, rs) );
			data.setSTOCK_ON_HAND_QTY( getString(11, rs) );
			data.setDEFECT_QTY( getString(12, rs) );
			data.setPRVS_DAYEND_STOCK_QTY( getString(13, rs) );
			data.setPRVS_MONTHEND_STOCK_QTY( getString(14, rs) );
			data.setSTOCK_UNIT( getString(15, rs) );
			data.setSUPPLY_KBN( getString(16, rs) );
			data.setSUPPLY_KBN_DN( getString(17, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK5", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK5_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK5_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK5_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK5_clear

			return;
		}

		/**
		 * selectT_STOCK5クラスの標準コンストラクタ
		 */
		public selectT_STOCK5()
		{
			//{{user_implement_dev:selectT_STOCK5_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK5_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK6 extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_WH_STOCK_LST_LOT.PLANT_CD, "
+"  V_WH_STOCK_LST_LOT.WH_CD, "
+"  V_WH_STOCK_LST_LOT.WH_NAME, "
+"  V_WH_STOCK_LST_LOT.DISPLAY_NAME, "
+"  V_WH_STOCK_LST_LOT.VEND_CD, "
+"  V_WH_STOCK_LST_LOT.VEND_ANAME, "
+"  V_WH_STOCK_LST_LOT.ITEM_CD, "
+"  V_WH_STOCK_LST_LOT.ITEM_NAME, "
+"  V_WH_STOCK_LST_LOT.LOT_NO, "
+"  V_WH_STOCK_LST_LOT.JOB_ODR_CD, "
+"  V_WH_STOCK_LST_LOT.STOCK_ON_HAND_QTY, "
+"  V_WH_STOCK_LST_LOT.DEFECT_QTY, "
+"  V_WH_STOCK_LST_LOT.PRVS_DAYEND_STOCK_QTY, "
+"  V_WH_STOCK_LST_LOT.PRVS_MONTHEND_STOCK_QTY, "
+"  V_WH_STOCK_LST_LOT.STOCK_UNIT, "
+"  V_WH_STOCK_LST_LOT.SUPPLY_KBN, "
+"  (CASE "
+"    WHEN V_WH_STOCK_LST_LOT.SUPPLY_KBN IS NULL THEN( "
+"    SELECT "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'CONS_TYP' "
+"      AND VALUE = 2 "
+"  ) "
+"    ELSE V_WH_STOCK_LST_LOT.SUPPLY_KBN "
+"  END) AS SUPPLY_KBN_DN "
+"from "
+"  V_WH_STOCK_LST_LOT "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and ITEM_CD = ? "
+"  and LOT_NO like(?) "
+"  and VEND_CD is not null "
+"order by "
+"  PLANT_CD, "
+"  WH_CD, "
+"  VEND_CD, "
+"  ITEM_CD, "
+"  LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK6_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK6_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK6_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK6", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK6_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK6_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK6", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK6_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK6_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK6", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK6_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK6", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setWH_NAME( getString(3, rs) );
			data.setMRP_FLG( getString(4, rs) );
			data.setVEND_CD( getString(5, rs) );
			data.setVEND_ANAME( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setl_LOT_NO( getString(9, rs) );
			data.setJOB_ODR_CD( getString(10, rs) );
			data.setSTOCK_ON_HAND_QTY( getString(11, rs) );
			data.setDEFECT_QTY( getString(12, rs) );
			data.setPRVS_DAYEND_STOCK_QTY( getString(13, rs) );
			data.setPRVS_MONTHEND_STOCK_QTY( getString(14, rs) );
			data.setSTOCK_UNIT( getString(15, rs) );
			data.setSUPPLY_KBN( getString(16, rs) );
			data.setSUPPLY_KBN_DN( getString(17, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK6", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK6_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK6_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK6_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK6_clear

			return;
		}

		/**
		 * selectT_STOCK6クラスの標準コンストラクタ
		 */
		public selectT_STOCK6()
		{
			//{{user_implement_dev:selectT_STOCK6_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK6_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK7 extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_WH_STOCK_LST_LOT.PLANT_CD, "
+"  V_WH_STOCK_LST_LOT.WH_CD, "
+"  V_WH_STOCK_LST_LOT.WH_NAME, "
+"  V_WH_STOCK_LST_LOT.DISPLAY_NAME, "
+"  V_WH_STOCK_LST_LOT.VEND_CD, "
+"  V_WH_STOCK_LST_LOT.VEND_ANAME, "
+"  V_WH_STOCK_LST_LOT.ITEM_CD, "
+"  V_WH_STOCK_LST_LOT.ITEM_NAME, "
+"  V_WH_STOCK_LST_LOT.LOT_NO, "
+"  V_WH_STOCK_LST_LOT.JOB_ODR_CD, "
+"  V_WH_STOCK_LST_LOT.STOCK_ON_HAND_QTY, "
+"  V_WH_STOCK_LST_LOT.DEFECT_QTY, "
+"  V_WH_STOCK_LST_LOT.PRVS_DAYEND_STOCK_QTY, "
+"  V_WH_STOCK_LST_LOT.PRVS_MONTHEND_STOCK_QTY, "
+"  V_WH_STOCK_LST_LOT.STOCK_UNIT, "
+"  V_WH_STOCK_LST_LOT.SUPPLY_KBN, "
+"  (CASE "
+"    WHEN V_WH_STOCK_LST_LOT.SUPPLY_KBN IS NULL THEN( "
+"    SELECT "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'CONS_TYP' "
+"      AND VALUE = 2 "
+"  ) "
+"    ELSE V_WH_STOCK_LST_LOT.SUPPLY_KBN "
+"  END) AS SUPPLY_KBN_DN "
+"from "
+"  V_WH_STOCK_LST_LOT "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and ITEM_CD = ? "
+"  and LOT_NO like(?) "
+"  and STOCK_ON_HAND_QTY < 0 "
+"order by "
+"  PLANT_CD, "
+"  WH_CD, "
+"  VEND_CD, "
+"  ITEM_CD, "
+"  LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK7_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK7_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK7_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK7", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK7_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK7_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK7", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK7_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK7_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK7", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK7_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK7", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setWH_NAME( getString(3, rs) );
			data.setMRP_FLG( getString(4, rs) );
			data.setVEND_CD( getString(5, rs) );
			data.setVEND_ANAME( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setl_LOT_NO( getString(9, rs) );
			data.setJOB_ODR_CD( getString(10, rs) );
			data.setSTOCK_ON_HAND_QTY( getString(11, rs) );
			data.setDEFECT_QTY( getString(12, rs) );
			data.setPRVS_DAYEND_STOCK_QTY( getString(13, rs) );
			data.setPRVS_MONTHEND_STOCK_QTY( getString(14, rs) );
			data.setSTOCK_UNIT( getString(15, rs) );
			data.setSUPPLY_KBN( getString(16, rs) );
			data.setSUPPLY_KBN_DN( getString(17, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK7", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK7_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK7_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK7_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK7_clear

			return;
		}

		/**
		 * selectT_STOCK7クラスの標準コンストラクタ
		 */
		public selectT_STOCK7()
		{
			//{{user_implement_dev:selectT_STOCK7_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK7_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK8 extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_WH_STOCK_LST_LOT.PLANT_CD, "
+"  V_WH_STOCK_LST_LOT.WH_CD, "
+"  V_WH_STOCK_LST_LOT.WH_NAME, "
+"  V_WH_STOCK_LST_LOT.DISPLAY_NAME, "
+"  V_WH_STOCK_LST_LOT.VEND_CD, "
+"  V_WH_STOCK_LST_LOT.VEND_ANAME, "
+"  V_WH_STOCK_LST_LOT.ITEM_CD, "
+"  V_WH_STOCK_LST_LOT.ITEM_NAME, "
+"  V_WH_STOCK_LST_LOT.LOT_NO, "
+"  V_WH_STOCK_LST_LOT.JOB_ODR_CD, "
+"  V_WH_STOCK_LST_LOT.STOCK_ON_HAND_QTY, "
+"  V_WH_STOCK_LST_LOT.DEFECT_QTY, "
+"  V_WH_STOCK_LST_LOT.PRVS_DAYEND_STOCK_QTY, "
+"  V_WH_STOCK_LST_LOT.PRVS_MONTHEND_STOCK_QTY, "
+"  V_WH_STOCK_LST_LOT.STOCK_UNIT, "
+"  V_WH_STOCK_LST_LOT.SUPPLY_KBN, "
+"  (CASE "
+"    WHEN V_WH_STOCK_LST_LOT.SUPPLY_KBN IS NULL THEN( "
+"    SELECT "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'CONS_TYP' "
+"      AND VALUE = 2 "
+"  ) "
+"    ELSE V_WH_STOCK_LST_LOT.SUPPLY_KBN "
+"  END) AS SUPPLY_KBN_DN "
+"from "
+"  V_WH_STOCK_LST_LOT "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and ITEM_CD = ? "
+"  and LOT_NO like(?) "
+"order by "
+"  PLANT_CD, "
+"  WH_CD, "
+"  VEND_CD, "
+"  ITEM_CD, "
+"  LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK8_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK8_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK8_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK8", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK8_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK8_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK8", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK8_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK8_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK8", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK8_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK8", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setWH_NAME( getString(3, rs) );
			data.setMRP_FLG( getString(4, rs) );
			data.setVEND_CD( getString(5, rs) );
			data.setVEND_ANAME( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setl_LOT_NO( getString(9, rs) );
			data.setJOB_ODR_CD( getString(10, rs) );
			data.setSTOCK_ON_HAND_QTY( getString(11, rs) );
			data.setDEFECT_QTY( getString(12, rs) );
			data.setPRVS_DAYEND_STOCK_QTY( getString(13, rs) );
			data.setPRVS_MONTHEND_STOCK_QTY( getString(14, rs) );
			data.setSTOCK_UNIT( getString(15, rs) );
			data.setSUPPLY_KBN( getString(16, rs) );
			data.setSUPPLY_KBN_DN( getString(17, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK8", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK8_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK8_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK8_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK8_clear

			return;
		}

		/**
		 * selectT_STOCK8クラスの標準コンストラクタ
		 */
		public selectT_STOCK8()
		{
			//{{user_implement_dev:selectT_STOCK8_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK8_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK1Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  V_WH_STOCK_LST "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and JOB_ODR_CD like(?) "
+"  and ITEM_CD = ? "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK1Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK1Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK1Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK1Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK1Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK1Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK1Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK1Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK1Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK1Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK1Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_JOB_ODR_CD());
				if(isNull(data.getIN_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK1Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_JOB_ODR_CD())) setString(no ++, data.getIN_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK1Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK1Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK1Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK1Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK1Cnt_clear

			return;
		}

		/**
		 * selectT_STOCK1Cntクラスの標準コンストラクタ
		 */
		public selectT_STOCK1Cnt()
		{
			//{{user_implement_dev:selectT_STOCK1Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK1Cnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK2Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  V_WH_STOCK_LST "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and JOB_ODR_CD like(?) "
+"  and ITEM_CD = ? "
+"  and VEND_CD is not null "
+"  and STOCK_ON_HAND_QTY < 0 "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK2Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK2Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK2Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK2Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK2Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK2Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK2Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK2Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK2Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK2Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK2Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_JOB_ODR_CD());
				if(isNull(data.getIN_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK2Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_JOB_ODR_CD())) setString(no ++, data.getIN_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK2Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK2Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK2Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK2Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK2Cnt_clear

			return;
		}

		/**
		 * selectT_STOCK2Cntクラスの標準コンストラクタ
		 */
		public selectT_STOCK2Cnt()
		{
			//{{user_implement_dev:selectT_STOCK2Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK2Cnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK3Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  V_WH_STOCK_LST "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and JOB_ODR_CD like(?) "
+"  and ITEM_CD = ? "
+"  and VEND_CD is not null "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK3Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK3Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK3Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK3Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK3Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK3Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK3Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK3Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK3Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK3Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK3Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_JOB_ODR_CD());
				if(isNull(data.getIN_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK3Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_JOB_ODR_CD())) setString(no ++, data.getIN_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK3Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK3Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK3Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK3Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK3Cnt_clear

			return;
		}

		/**
		 * selectT_STOCK3Cntクラスの標準コンストラクタ
		 */
		public selectT_STOCK3Cnt()
		{
			//{{user_implement_dev:selectT_STOCK3Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK3Cnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK4Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  V_WH_STOCK_LST "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and JOB_ODR_CD like(?) "
+"  and ITEM_CD = ? "
+"  and STOCK_ON_HAND_QTY < 0 "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK4Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK4Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK4Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK4Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK4Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK4Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK4Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK4Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK4Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK4Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK4Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_JOB_ODR_CD());
				if(isNull(data.getIN_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK4Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_JOB_ODR_CD())) setString(no ++, data.getIN_JOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK4Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK4Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK4Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK4Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK4Cnt_clear

			return;
		}

		/**
		 * selectT_STOCK4Cntクラスの標準コンストラクタ
		 */
		public selectT_STOCK4Cnt()
		{
			//{{user_implement_dev:selectT_STOCK4Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK4Cnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK5Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  V_WH_STOCK_LST_LOT "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and ITEM_CD = ? "
+"  and LOT_NO like(?) "
+"  and VEND_CD is not null "
+"  and STOCK_ON_HAND_QTY < 0 "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK5Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK5Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK5Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK5Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK5Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK5Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK5Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK5Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK5Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK5Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK5Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK5Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK5Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK5Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK5Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK5Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK5Cnt_clear

			return;
		}

		/**
		 * selectT_STOCK5Cntクラスの標準コンストラクタ
		 */
		public selectT_STOCK5Cnt()
		{
			//{{user_implement_dev:selectT_STOCK5Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK5Cnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK6Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  V_WH_STOCK_LST_LOT "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and ITEM_CD = ? "
+"  and LOT_NO like(?) "
+"  and VEND_CD is not null "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK6Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK6Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK6Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK6Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK6Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK6Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK6Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK6Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK6Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK6Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK6Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK6Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK6Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK6Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK6Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK6Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK6Cnt_clear

			return;
		}

		/**
		 * selectT_STOCK6Cntクラスの標準コンストラクタ
		 */
		public selectT_STOCK6Cnt()
		{
			//{{user_implement_dev:selectT_STOCK6Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK6Cnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK7Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  V_WH_STOCK_LST_LOT "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and ITEM_CD = ? "
+"  and LOT_NO like(?) "
+"  and STOCK_ON_HAND_QTY < 0 "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK7Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK7Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK7Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK7Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK7Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK7Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK7Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK7Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK7Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK7Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK7Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK7Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK7Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK7Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK7Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK7Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK7Cnt_clear

			return;
		}

		/**
		 * selectT_STOCK7Cntクラスの標準コンストラクタ
		 */
		public selectT_STOCK7Cnt()
		{
			//{{user_implement_dev:selectT_STOCK7Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK7Cnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_STOCK8Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  V_WH_STOCK_LST_LOT "
+"where "
+"  PLANT_CD = ? "
+"  and WH_CD = ? "
+"  and VEND_CD = ? "
+"  and ITEM_CD = ? "
+"  and LOT_NO like(?) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_STOCK8Cnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_STOCK8Cnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK8Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK8Cnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK8Cnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK8Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK8Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK8Cnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AG0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK8Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK8Cnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_STOCK8Cnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PLANT_CD());
				if(isNull(data.getIN_PLANT_CD())) isNull = true;
				ary.addElement(data.getIN_WH_CD());
				if(isNull(data.getIN_WH_CD())) isNull = true;
				ary.addElement(data.getIN_VEND_CD());
				if(isNull(data.getIN_VEND_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_STOCK8Cnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_PLANT_CD())) setString(no ++, data.getIN_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_WH_CD())) setString(no ++, data.getIN_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_VEND_CD())) setString(no ++, data.getIN_VEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AG0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0040010Struct data = new AG0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_STOCK8Cnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AG0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_STOCK8Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_STOCK8Cnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AG0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_STOCK8Cnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_STOCK8Cnt_clear

			return;
		}

		/**
		 * selectT_STOCK8Cntクラスの標準コンストラクタ
		 */
		public selectT_STOCK8Cnt()
		{
			//{{user_implement_dev:selectT_STOCK8Cnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_STOCK8Cnt_constractor

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
		mselectT_STOCK1.clear();
		mselectT_STOCK1 = null;
		mselectM_PLANT.clear();
		mselectM_PLANT = null;
		mselectM_WH.clear();
		mselectM_WH = null;
		mselectM_VEND_CTRL.clear();
		mselectM_VEND_CTRL = null;
		mselectM_ITEM.clear();
		mselectM_ITEM = null;
		mselectT_STOCK2.clear();
		mselectT_STOCK2 = null;
		mselectT_STOCK3.clear();
		mselectT_STOCK3 = null;
		mselectT_STOCK4.clear();
		mselectT_STOCK4 = null;
		mselectT_STOCK5.clear();
		mselectT_STOCK5 = null;
		mselectT_STOCK6.clear();
		mselectT_STOCK6 = null;
		mselectT_STOCK7.clear();
		mselectT_STOCK7 = null;
		mselectT_STOCK8.clear();
		mselectT_STOCK8 = null;
		mselectT_STOCK1Cnt.clear();
		mselectT_STOCK1Cnt = null;
		mselectT_STOCK2Cnt.clear();
		mselectT_STOCK2Cnt = null;
		mselectT_STOCK3Cnt.clear();
		mselectT_STOCK3Cnt = null;
		mselectT_STOCK4Cnt.clear();
		mselectT_STOCK4Cnt = null;
		mselectT_STOCK5Cnt.clear();
		mselectT_STOCK5Cnt = null;
		mselectT_STOCK6Cnt.clear();
		mselectT_STOCK6Cnt = null;
		mselectT_STOCK7Cnt.clear();
		mselectT_STOCK7Cnt = null;
		mselectT_STOCK8Cnt.clear();
		mselectT_STOCK8Cnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AG0040010クラスの標準コンストラクタ
	 */
	public AG0040010Entity() throws FoundationException
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
