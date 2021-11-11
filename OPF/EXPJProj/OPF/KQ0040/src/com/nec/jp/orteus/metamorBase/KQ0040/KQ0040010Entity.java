/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0040/src/com/nec/jp/orteus/metamorBase/KQ0040/KQ0040010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0040;

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

public class KQ0040010Entity extends DataObject
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

	// Selectクラス インスタンス
	public Select mSelect = new Select();

	// selectSYS_DATE_CTRLクラス インスタンス
	public selectSYS_DATE_CTRL mselectSYS_DATE_CTRL = new selectSYS_DATE_CTRL();

	// selectSYS_MY_COMPANYクラス インスタンス
	public selectSYS_MY_COMPANY mselectSYS_MY_COMPANY = new selectSYS_MY_COMPANY();

	// SelectCntクラス インスタンス
	public SelectCnt mSelectCnt = new SelectCnt();

	// SelectCntPクラス インスタンス
	public SelectCntP mSelectCntP = new SelectCntP();

	// SelectPクラス インスタンス
	public SelectP mSelectP = new SelectP();


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
		String m_write_fname="KQ0040010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="KQ0040010";

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
	public class Select extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  b.ODR_TYP AS ODR_TYP, "
+"  b.CUST_ODR_NO AS CUST_ODR_NO, "
+"  a.CUST_CD AS CUST_CD, "
+"  c.CUST_NAME AS CUST_NAME, "
+"  a.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"  a.ITEM_CD AS ITEM_CD, "
+"  f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"  g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"  TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"  TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"  M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"  TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"  TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"  TO_CHAR(DECODE(b.ODR_TYP, '2', b.REMAIN_UNCONFIRM_ODR_QTY, NULL)) AS REMAIN_UNCONFIRM_ODR_QTY, "
+"  TO_CHAR(DECODE(b.ODR_TYP, '2', b.UNCONFIRM_ODR_BALANCE)) AS UNCONFIRM_ODR_BALANCE, "
+"  TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_QTY, 0) - NVL(b.TOTAL_SHIP_QTY, 0), NULL)) AS UNCONFIRM_ODR_QTY, "
+"  TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_AMOUNT, 0) - NVL(b.SHIP_AMOUNT, 0), NULL)) as UNCONFIRM_ODR_AMOUNT, "
+"  b.DEPO_TYP AS DEPO_TYP, "
+"  b.UNCONFIRMED_ODR_EFF_OVR_FLG AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"  b.ODR_NO AS ODR_NO, "
+"  TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"  TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"  b.CURRNCY_CD as CURRNCY_CD, "
+"  j.CUR_UNIT as CUR_UNIT, "
+"  b.EXCH_TYP as EXCH_TYP, "
+"  c.DETAIL_ROUND_TYP as DETAIL_ROUND_TYP, "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM_SPEC.CUST_ITEM_NAME, "
+"  D.JOB_ODR_CD AS JOB_ODR_CD, "
+"  t.PROJECT_CD AS PROJECT_CD, "
+"  t.ESTIMATE_NO AS ESTIMATE_NO, "
+"  t.DETAL_NO AS DETAL_NO, "
+"  '1' AS PRO_FLG "
+"FROM "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      T_ODR_CTL "
+"    WHERE "
+"      CUST_CD like(?) "
+"      AND CUST_ITEM_CD like(?) "
+"      AND DEL_FLG = '0' "
+"  ) a, "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      T_ODR "
+"    WHERE "
+"      (CUST_CHRG_PSN_CD like(?) "
+"      or  ODR_ACPT_PSN_CD like(?)) "
+"      AND CUST_ODR_NO like(?) "
+"      AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"      AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"      AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"      AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"      AND(ODR_TYP = ? "
+"      or  ODR_TYP = ? "
+"      or  ODR_TYP = ?) "
+"      AND DEL_FLG = '0' "
+"  ) b, "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      M_CUST "
+"    WHERE "
+"      COMPANY_CD = ? "
+"  ) c, "
+"  USER_MST f, "
+"  USER_MST g, "
+"  M_CUR j, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  T_JOB_ODR_ODR_ALC D, "
+"  T_PJ_ODR_ALC t "
+"where "
+"  a.ODR_CTL_NO = b.ODR_CTL_NO "
+"  and a.CUST_CD = c.CUST_CD(+) "
+"  and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"  and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"  and j.CUR_CD = b.CURRNCY_CD "
+"  and a.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and M_ITEM_SPEC.COMPANY_CD = ? "
+"  and a.CUST_CD = M_ITEM_SPEC.CUST_CD(+) "
+"  and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD(+) "
+"  and b.ODR_NO = d.odr_no(+) "
+"  and b.ODR_NO = t.odr_no(+) "
+"union "
+"SELECT "
+"  3 AS ODR_TYP, "
+"  b.CUST_ODR_NO AS CUST_ODR_NO, "
+"  b.CUST_CD AS CUST_CD, "
+"  c.CUST_NAME AS CUST_NAME, "
+"  NULL AS CUST_ITEM_CD, "
+"  b.ITEM_CD AS ITEM_CD, "
+"  f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"  g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"  TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"  TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"  M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"  TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"  TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"  NULL AS REMAIN_UNCONFIRM_ODR_QTY, "
+"  NULL AS UNCONFIRM_ODR_BALANCE, "
+"  NULL AS UNCONFIRM_ODR_QTY, "
+"  NULL AS UNCONFIRM_ODR_AMOUNT, "
+"  NULL AS DEPO_TYP, "
+"  NULL AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"  b.ODR_NO AS ODR_NO, "
+"  TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"  TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"  b.CURRNCY_CD AS CURRNCY_CD, "
+"  j.CUR_UNIT AS CUR_UNIT, "
+"  b.EXCH_TYP AS EXCH_TYP, "
+"  c.DETAIL_ROUND_TYP AS DETAIL_ROUND_TYP, "
+"  b.ITEM_NAME AS ITEM_NAME, "
+"  NULL AS CUST_ITEM_NAME, "
+"  NULL AS JOB_ODR_CD, "
+"  t.PROJECT_CD AS PROJECT_CD, "
+"  t.ESTIMATE_NO AS ESTIMATE_NO, "
+"  t.DETAL_NO AS DETAL_NO, "
+"  '2' AS PRO_FLG "
+"FROM "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      T_ODR_UNSTOCK "
+"    WHERE "
+"      (CUST_CHRG_PSN_CD like(?) "
+"      or  ODR_ACPT_PSN_CD like(?)) "
+"      AND CUST_ODR_NO like(?) "
+"      AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"      AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"      AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"      AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"      AND DEL_FLG = '0' "
+"      AND CUST_CD like(?) "
+"  ) b, "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      M_CUST "
+"    WHERE "
+"      COMPANY_CD = ? "
+"  ) c, "
+"  USER_MST f, "
+"  USER_MST g, "
+"  M_CUR j, "
+"  M_ITEM, "
+"  T_PJ_ODR_ALC t "
+"where "
+"  b.CUST_CD = c.CUST_CD(+) "
+"  and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"  and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"  and j.CUR_CD = b.CURRNCY_CD "
+"  and b.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and b.ODR_NO = t.odr_no(+) "
+"  and '3' = ? "
+"order by "
+"  PRO_FLG, "
+"  ODR_TYP DESC, "
+"  CUST_ODR_NO, "
+"  CUST_CD, "
+"  CUST_ITEM_CD, "
+"  ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Select_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Select_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read
                        if(m_selcmd==null) throw new FoundationException("Select", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Select_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read2
			if(m_selcmd==null) throw new FoundationException("Select", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Select_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read3
			if(m_selcmd==null) throw new FoundationException("Select", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Select_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_1());
				if(isNull(data.getIN_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_3());
				if(isNull(data.getIN_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("Select", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_1())) setString(no ++, data.getIN_ODR_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_3())) setString(no ++, data.getIN_ODR_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setODR_TYP( getString(1, rs) );
			data.setCUST_ODR_NO( getString(2, rs) );
			data.setCUST_CD( getString(3, rs) );
			data.setCUST_NAME( getString(4, rs) );
			data.setCUST_ITEM_CD( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setCUST_CHRG_PSN_CD( getString(7, rs) );
			data.setODR_ACPT_PSN_CD( getString(8, rs) );
			data.setDESINATED_DLV_DATE( getString(9, rs) );
			data.setODR_QTY( getString(10, rs) );
			data.setUNIT_NAME( getString(11, rs) );
			data.setODR_UNIT_PRICE( getString(12, rs) );
			data.setODR_AMOUNT( getString(13, rs) );
			data.setREMAIN_UNCONFIRM_ODR_QTY( getString(14, rs) );
			data.setUNCONFIRM_ODR_BALANCE( getString(15, rs) );
			data.setUNCONFIRM_ODR_QTY( getString(16, rs) );
			data.setUNCONFIRM_ODR_AMOUNT( getString(17, rs) );
			data.setDEPO_TYP( getString(18, rs) );
			data.setUNCONFIRMED_ODR_EFF_OVR_FLG( getString(19, rs) );
			data.setODR_NO( getString(20, rs) );
			data.setMODIFY_COUNT( getString(21, rs) );
			data.setODR_ACPT_DATE( getString(22, rs) );
			data.setCURRNCY_CD( getString(23, rs) );
			data.setCUR_UNIT( getString(24, rs) );
			data.setEXCH_TYP( getString(25, rs) );
			data.setROUND_TYP( getString(26, rs) );
			data.setITEM_NAME( getString(27, rs) );
			data.setCUST_ITEM_NAME( getString(28, rs) );
			data.setJOB_ODR_CD( getString(29, rs) );
			data.setPROJECT_CD( getString(30, rs) );
			data.setESTIMATE_NO( getString(31, rs) );
			data.setDETAL_NO( getString(32, rs) );
			data.setPRO_FLG( getString(33, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Select", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("Select", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Select_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Select_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Select_clear

			return;
		}

		/**
		 * Selectクラスの標準コンストラクタ
		 */
		public Select()
		{
			//{{user_implement_dev:Select_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Select_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  SYS_DATE_CTRL.\"PLANT_CD\" as \"PLANT_CD\" "
+"from "
+"  SYS_DATE_CTRL "
+"where "
+"  SYS_DATE_CTRL.\"PLANT_CD\" = ( "
+"    SELECT "
+"      CODE "
+"    FROM "
+"      SYS_CLASS_CODE "
+"    WHERE "
+"      SYS_CLASS = 'SALES' "
+"      AND CLASS_CODE = 'PLANT_WEB' "
+"      and rownum = 1 "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_DATE_CTRL_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectSYS_DATE_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read
                        if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setIN_BUSINESS_OPR_DATE( getString(1, rs) );
			data.setPLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectSYS_DATE_CTRL", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_DATE_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSYS_DATE_CTRL_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectSYS_DATE_CTRL_clear

			return;
		}

		/**
		 * selectSYS_DATE_CTRLクラスの標準コンストラクタ
		 */
		public selectSYS_DATE_CTRL()
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectSYS_DATE_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSYS_MY_COMPANY extends DataObject
	{
		protected String m_selcmd = " SELECT COMPANY_CD FROM SYS_MY_COMPANY "
+" WHERE CTRL_CD ='SYSTEM' "
+"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_MY_COMPANY_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectSYS_MY_COMPANY_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read
                        if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setIN_COMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectSYS_MY_COMPANY", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_MY_COMPANY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSYS_MY_COMPANY_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectSYS_MY_COMPANY_clear

			return;
		}

		/**
		 * selectSYS_MY_COMPANYクラスの標準コンストラクタ
		 */
		public selectSYS_MY_COMPANY()
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectSYS_MY_COMPANY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  ( "
+"    SELECT "
+"      b.ODR_TYP AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      a.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      a.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"      a.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.REMAIN_UNCONFIRM_ODR_QTY, NULL)) AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.UNCONFIRM_ODR_BALANCE)) AS UNCONFIRM_ODR_BALANCE, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_QTY, 0) - NVL(b.TOTAL_SHIP_QTY, 0), NULL)) AS UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_AMOUNT, 0) - NVL(b.SHIP_AMOUNT, 0), NULL)) as UNCONFIRM_ODR_AMOUNT, "
+"      b.DEPO_TYP AS DEPO_TYP, "
+"      b.UNCONFIRMED_ODR_EFF_OVR_FLG AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD as CURRNCY_CD, "
+"      j.CUR_UNIT as CUR_UNIT, "
+"      b.EXCH_TYP as EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP as DETAIL_ROUND_TYP, "
+"      M_ITEM.ITEM_NAME, "
+"      M_ITEM_SPEC.CUST_ITEM_NAME, "
+"      D.JOB_ODR_CD AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '1' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_CTL "
+"        WHERE "
+"          CUST_CD like(?) "
+"          AND CUST_ITEM_CD like(?) "
+"          AND DEL_FLG = '0' "
+"      ) a, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND(ODR_TYP = ? "
+"          or  ODR_TYP = ? "
+"          or  ODR_TYP = ?) "
+"          AND DEL_FLG = '0' "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      M_ITEM_SPEC, "
+"      T_JOB_ODR_ODR_ALC D, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      a.ODR_CTL_NO = b.ODR_CTL_NO "
+"      and a.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and a.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and M_ITEM_SPEC.COMPANY_CD = ? "
+"      and a.CUST_CD = M_ITEM_SPEC.CUST_CD(+) "
+"      and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD(+) "
+"      and b.ODR_NO = d.odr_no(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and ROWNUM <= TO_NUMBER(?) + 1 "
+"  union "
+"    SELECT "
+"      3 AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      b.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      NULL AS CUST_ITEM_CD, "
+"      b.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      NULL AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_BALANCE, "
+"      NULL AS UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_AMOUNT, "
+"      NULL AS DEPO_TYP, "
+"      NULL AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD AS CURRNCY_CD, "
+"      j.CUR_UNIT AS CUR_UNIT, "
+"      b.EXCH_TYP AS EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP AS DETAIL_ROUND_TYP, "
+"      b.ITEM_NAME AS ITEM_NAME, "
+"      NULL AS CUST_ITEM_NAME, "
+"      NULL AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '2' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_UNSTOCK "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND DEL_FLG = '0' "
+"          AND CUST_CD like(?) "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      b.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and b.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and '3' = ? "
+"      and ROWNUM <= TO_NUMBER(?) + 1 "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read2
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read3
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_1());
				if(isNull(data.getIN_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_3());
				if(isNull(data.getIN_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_1())) setString(no ++, data.getIN_ODR_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_3())) setString(no ++, data.getIN_ODR_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectCnt_clear

			return;
		}

		/**
		 * SelectCntクラスの標準コンストラクタ
		 */
		public SelectCnt()
		{
			//{{user_implement_dev:SelectCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectCntP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  ( "
+"    SELECT "
+"      b.ODR_TYP AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      a.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      a.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"      a.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.REMAIN_UNCONFIRM_ODR_QTY, NULL)) AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.UNCONFIRM_ODR_BALANCE)) AS UNCONFIRM_ODR_BALANCE, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_QTY, 0) - NVL(b.TOTAL_SHIP_QTY, 0), NULL)) AS UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_AMOUNT, 0) - NVL(b.SHIP_AMOUNT, 0), NULL)) as UNCONFIRM_ODR_AMOUNT, "
+"      b.DEPO_TYP AS DEPO_TYP, "
+"      b.UNCONFIRMED_ODR_EFF_OVR_FLG AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD as CURRNCY_CD, "
+"      j.CUR_UNIT as CUR_UNIT, "
+"      b.EXCH_TYP as EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP as DETAIL_ROUND_TYP, "
+"      M_ITEM.ITEM_NAME, "
+"      M_ITEM_SPEC.CUST_ITEM_NAME, "
+"      D.JOB_ODR_CD AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '1' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_CTL "
+"        WHERE "
+"          CUST_CD like(?) "
+"          AND CUST_ITEM_CD like(?) "
+"          AND DEL_FLG = '0' "
+"      ) a, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND(ODR_TYP = ? "
+"          or  ODR_TYP = ? "
+"          or  ODR_TYP = ?) "
+"          AND DEL_FLG = '0' "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      M_ITEM_SPEC, "
+"      T_JOB_ODR_ODR_ALC D, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      a.ODR_CTL_NO = b.ODR_CTL_NO "
+"      and a.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and a.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and M_ITEM_SPEC.COMPANY_CD = ? "
+"      and a.CUST_CD = M_ITEM_SPEC.CUST_CD(+) "
+"      and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD(+) "
+"      and b.ODR_NO = d.odr_no(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and t.project_cd is null "
+"      and ROWNUM <= TO_NUMBER(?) + 1 "
+"  union "
+"    SELECT "
+"      3 AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      b.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      NULL AS CUST_ITEM_CD, "
+"      b.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      NULL AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_BALANCE, "
+"      NULL AS UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_AMOUNT, "
+"      NULL AS DEPO_TYP, "
+"      NULL AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD AS CURRNCY_CD, "
+"      j.CUR_UNIT AS CUR_UNIT, "
+"      b.EXCH_TYP AS EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP AS DETAIL_ROUND_TYP, "
+"      b.ITEM_NAME AS ITEM_NAME, "
+"      NULL AS CUST_ITEM_NAME, "
+"      NULL AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '2' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_UNSTOCK "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND DEL_FLG = '0' "
+"          AND CUST_CD like(?) "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      b.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and b.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and t.project_cd is null "
+"      and '3' = ? "
+"      and ROWNUM <= TO_NUMBER(?) + 1 "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCntP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectCntP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCntP_read
			if(m_selcmd==null) throw new FoundationException("SelectCntP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCntP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCntP_read2
			if(m_selcmd==null) throw new FoundationException("SelectCntP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectCntP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCntP_read3
			if(m_selcmd==null) throw new FoundationException("SelectCntP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectCntP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_1());
				if(isNull(data.getIN_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_3());
				if(isNull(data.getIN_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCntP", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_1())) setString(no ++, data.getIN_ODR_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_3())) setString(no ++, data.getIN_ODR_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCntP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCntP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCntP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectCntP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectCntP_clear

			return;
		}

		/**
		 * SelectCntPクラスの標準コンストラクタ
		 */
		public SelectCntP()
		{
			//{{user_implement_dev:SelectCntP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectCntP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  * "
+"FROM "
+"  ( "
+"    SELECT "
+"      b.ODR_TYP AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      a.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      a.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"      a.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.REMAIN_UNCONFIRM_ODR_QTY, NULL)) AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.UNCONFIRM_ODR_BALANCE)) AS UNCONFIRM_ODR_BALANCE, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_QTY, 0) - NVL(b.TOTAL_SHIP_QTY, 0), NULL)) AS UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_AMOUNT, 0) - NVL(b.SHIP_AMOUNT, 0), NULL)) as UNCONFIRM_ODR_AMOUNT, "
+"      b.DEPO_TYP AS DEPO_TYP, "
+"      b.UNCONFIRMED_ODR_EFF_OVR_FLG AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD as CURRNCY_CD, "
+"      j.CUR_UNIT as CUR_UNIT, "
+"      b.EXCH_TYP as EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP as DETAIL_ROUND_TYP, "
+"      M_ITEM.ITEM_NAME, "
+"      M_ITEM_SPEC.CUST_ITEM_NAME, "
+"      D.JOB_ODR_CD AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '1' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_CTL "
+"        WHERE "
+"          CUST_CD like(?) "
+"          AND CUST_ITEM_CD like(?) "
+"          AND DEL_FLG = '0' "
+"      ) a, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND(ODR_TYP = ? "
+"          or  ODR_TYP = ? "
+"          or  ODR_TYP = ?) "
+"          AND DEL_FLG = '0' "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      M_ITEM_SPEC, "
+"      T_JOB_ODR_ODR_ALC D, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      a.ODR_CTL_NO = b.ODR_CTL_NO "
+"      and a.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and a.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and M_ITEM_SPEC.COMPANY_CD = ? "
+"      and a.CUST_CD = M_ITEM_SPEC.CUST_CD(+) "
+"      and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD(+) "
+"      and b.ODR_NO = d.odr_no(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"  union "
+"    SELECT "
+"      3 AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      b.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      NULL AS CUST_ITEM_CD, "
+"      b.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      NULL AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_BALANCE, "
+"      NULL AS UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_AMOUNT, "
+"      NULL AS DEPO_TYP, "
+"      NULL AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD AS CURRNCY_CD, "
+"      j.CUR_UNIT AS CUR_UNIT, "
+"      b.EXCH_TYP AS EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP AS DETAIL_ROUND_TYP, "
+"      b.ITEM_NAME AS ITEM_NAME, "
+"      NULL AS CUST_ITEM_NAME, "
+"      NULL AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '2' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_UNSTOCK "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND DEL_FLG = '0' "
+"          AND CUST_CD like(?) "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      b.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and b.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and '3' = ? "
+"    order by "
+"      PRO_FLG, "
+"      ODR_TYP DESC, "
+"      CUST_ODR_NO, "
+"      CUST_CD, "
+"      CUST_ITEM_CD, "
+"      ITEM_CD "
+"  ) tt "
+"WHERE "
+"  tt.project_cd is null";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectP_read
			if(m_selcmd==null) throw new FoundationException("SelectP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectP_read2
			if(m_selcmd==null) throw new FoundationException("SelectP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectP_read3
			if(m_selcmd==null) throw new FoundationException("SelectP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_1());
				if(isNull(data.getIN_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_3());
				if(isNull(data.getIN_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectP", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_1())) setString(no ++, data.getIN_ODR_TYP_1(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_3())) setString(no ++, data.getIN_ODR_TYP_3(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setODR_TYP( getString(1, rs) );
			data.setCUST_ODR_NO( getString(2, rs) );
			data.setCUST_CD( getString(3, rs) );
			data.setCUST_NAME( getString(4, rs) );
			data.setCUST_ITEM_CD( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setCUST_CHRG_PSN_CD( getString(7, rs) );
			data.setODR_ACPT_PSN_CD( getString(8, rs) );
			data.setDESINATED_DLV_DATE( getString(9, rs) );
			data.setODR_QTY( getString(10, rs) );
			data.setUNIT_NAME( getString(11, rs) );
			data.setODR_UNIT_PRICE( getString(12, rs) );
			data.setODR_AMOUNT( getString(13, rs) );
			data.setREMAIN_UNCONFIRM_ODR_QTY( getString(14, rs) );
			data.setUNCONFIRM_ODR_BALANCE( getString(15, rs) );
			data.setUNCONFIRM_ODR_QTY( getString(16, rs) );
			data.setUNCONFIRM_ODR_AMOUNT( getString(17, rs) );
			data.setDEPO_TYP( getString(18, rs) );
			data.setUNCONFIRMED_ODR_EFF_OVR_FLG( getString(19, rs) );
			data.setODR_NO( getString(20, rs) );
			data.setMODIFY_COUNT( getString(21, rs) );
			data.setODR_ACPT_DATE( getString(22, rs) );
			data.setCURRNCY_CD( getString(23, rs) );
			data.setCUR_UNIT( getString(24, rs) );
			data.setEXCH_TYP( getString(25, rs) );
			data.setROUND_TYP( getString(26, rs) );
			data.setITEM_NAME( getString(27, rs) );
			data.setCUST_ITEM_NAME( getString(28, rs) );
			data.setJOB_ODR_CD( getString(29, rs) );
			data.setPROJECT_CD( getString(30, rs) );
			data.setESTIMATE_NO( getString(31, rs) );
			data.setDETAL_NO( getString(32, rs) );
			data.setPRO_FLG( getString(33, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectP_clear

			return;
		}

		/**
		 * SelectPクラスの標準コンストラクタ
		 */
		public SelectP()
		{
			//{{user_implement_dev:SelectP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectP_constractor

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
		mSelect.clear();
		mSelect = null;
		mselectSYS_DATE_CTRL.clear();
		mselectSYS_DATE_CTRL = null;
		mselectSYS_MY_COMPANY.clear();
		mselectSYS_MY_COMPANY = null;
		mSelectCnt.clear();
		mSelectCnt = null;
		mSelectCntP.clear();
		mSelectCntP = null;
		mSelectP.clear();
		mSelectP = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * KQ0040010クラスの標準コンストラクタ
	 */
	public KQ0040010Entity() throws FoundationException
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
