/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0130/src/com/nec/jp/orteus/metamorBase/AE0130/AE0130010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0130;

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
 * CLASS     : AE0130010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AE0130010Entity extends DataObject
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

	// selectM_PLANTクラス インスタンス
	public selectM_PLANT mselectM_PLANT = new selectM_PLANT();

	// selectM_VEND_CTRLクラス インスタンス
	public selectM_VEND_CTRL mselectM_VEND_CTRL = new selectM_VEND_CTRL();

	// selectM_ITEMクラス インスタンス
	public selectM_ITEM mselectM_ITEM = new selectM_ITEM();

	// selectUSER_MSTクラス インスタンス
	public selectUSER_MST mselectUSER_MST = new selectUSER_MST();

	// selectM_WHクラス インスタンス
	public selectM_WH mselectM_WH = new selectM_WH();

	// checkT_PUCH_ODR_RTN_RSLTクラス インスタンス
	public checkT_PUCH_ODR_RTN_RSLT mcheckT_PUCH_ODR_RTN_RSLT = new checkT_PUCH_ODR_RTN_RSLT();

	// SelectCntクラス インスタンス
	public SelectCnt mSelectCnt = new SelectCnt();


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
		String m_write_fname="AE0130010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AE0130010";

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
+"  T_PUCH_ODR_RTN_RSLT.\"PLANT_CD\" AS \"PLANT_CD\", "
+"  T_PUCH_ODR_RTN_RSLT.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\", "
+"  T_PUCH_ODR_RTN_RSLT.\"VEND_CD\" AS \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_ANAME\" AS \"VEND_ANAME\", "
+"  T_PUCH_ODR_RTN_RSLT.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  T_PUCH_ODR_RTN_RSLT.\"LOT_NO\" AS \"LOT_NO\", "
+"  T_PUCH_ODR_RTN_RSLT.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T1.\"VALUE\" AS \"INV_CTRL_FLG_DN\", "
+"  T_PUCH_ODR_RTN_RSLT.\"PUCH_ODR_PERSON\" AS \"PUCH_ODR_PERSON\", "
+"  USER_MST.\"USER_NAME\" AS \"USER_NAME\", "
+"  TO_CHAR(T_PUCH_ODR_RTN_RSLT.\"PUCH_RTN_DATE\", 'YYYY/MM/DD') AS \"PUCH_RTN_DATE\", "
+"  T_PUCH_ODR_RTN_RSLT.\"PUCH_RTN_QTY\" AS \"PUCH_RTN_QTY\", "
+"  T_PUCH_ODR_RTN_RSLT.\"WH_CD\" AS \"WH_CD\", "
+"  M_WH.\"WH_NAME\" AS \"WH_NAME\", "
+"  T_PUCH_ODR_RTN_RSLT.\"VEND_LOT_NO\" AS \"VEND_LOT_NO\", "
+"  T2.\"VALUE\" AS \"UNIT_COST_TYP_DN\", "
+"  T_PUCH_ODR_RTN_RSLT.\"UNIT_COST\" AS \"UNIT_COST\", "
+"  T_PUCH_ODR_RTN_RSLT.\"PROCESSING_COST\" AS \"PROCESSING_COST\", "
+"  T_PUCH_ODR_RTN_RSLT.\"MATERIAL_COST\" AS \"MATERIAL_COST\", "
+"  T_PUCH_ODR_RTN_RSLT.\"OTHER_OVERHEADS\" AS \"OTHER_OVERHEADS\", "
+"  T_PUCH_ODR_RTN_RSLT.\"PUCH_ODR_AMOUNT\" AS \"PUCH_ODR_AMOUNT\", "
+"  T_PUCH_ODR_RTN_RSLT.\"DISC_AMOUNT\" AS \"DISC_AMOUNT\", "
+"  T_PUCH_ODR_RTN_RSLT.\"NET_AMOUNT\" AS \"NET_AMOUNT\", "
+"  T_PUCH_ODR_RTN_RSLT.\"PUCH_RTN_COMMENT\" AS \"PUCH_RTN_COMMENT\", "
+"  TO_CHAR(T_PUCH_ODR_RTN_RSLT.\"RATE_JUDGE_DATE\", 'YYYY/MM/DD') AS \"RATE_JUDGE_DATE\", "
+"  T_PUCH_ODR_RTN_RSLT.\"EXCH_RATE\" AS \"EXCH_RATE\", "
+"  T_PUCH_ODR_RTN_RSLT.\"TAX_RATE_1\" AS \"TAX_RATE_1\", "
+"  T_PUCH_ODR_RTN_RSLT.\"TAX_RATE_2\" AS \"TAX_RATE_2\", "
+"  T_PUCH_ODR_RTN_RSLT.\"TAX_RATE_3\" AS \"TAX_RATE_3\", "
+"  T_PUCH_ODR_RTN_RSLT.\"TAX_AMOUNT_1\" AS \"TAX_AMOUNT_1\", "
+"  T_PUCH_ODR_RTN_RSLT.\"TAX_AMOUNT_2\" AS \"TAX_AMOUNT_2\", "
+"  T_PUCH_ODR_RTN_RSLT.\"TAX_AMOUNT_3\" AS \"TAX_AMOUNT_3\", "
+"  T_PUCH_ODR_RTN_RSLT.\"AMOUNT_INCLUDE_TAX\" AS \"AMOUNT_INCLUDE_TAX\", "
+"  T_PUCH_ODR_RTN_RSLT.\"HOME_CUR_AMOUNT\" AS \"HOME_CUR_AMOUNT\", "
+"  T_PUCH_ODR_RTN_RSLT.\"TAX_CD\" AS \"TAX_CD\", "
+"  T3.\"VALUE\" AS \"TAX_ROUND_TYP_DN\", "
+"  T4.\"VALUE\" AS \"RTN_DEL_FLG_DN\", "
+"  TO_CHAR(T_PUCH_ODR_RTN_RSLT.\"RTN_DEL_DATE\", 'YYYY/MM/DD') AS \"RTN_DEL_DATE\" "
+"FROM "
+"  T_PUCH_ODR_RTN_RSLT, "
+"  M_VEND_CTRL, "
+"  M_ITEM, "
+"  USER_MST, "
+"  M_WH, "
+"  ( "
+"    SELECT "
+"      DISPLAY_NAME, "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'INV_CTRL_FLG' "
+"  ) T1, "
+"  ( "
+"    SELECT "
+"      DISPLAY_NAME, "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'UNIT_COST_TYP' "
+"  ) T2, "
+"  ( "
+"    SELECT "
+"      DISPLAY_NAME, "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'TAX_ROUND_TYP' "
+"  ) T3, "
+"  ( "
+"    SELECT "
+"      DISPLAY_NAME, "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'RTN_DEL_FLG' "
+"  ) T4 "
+"WHERE "
+"  M_ITEM.ITEM_CD(+) = T_PUCH_ODR_RTN_RSLT.ITEM_CD "
+"  AND M_VEND_CTRL.COMPANY_CD(+) = T_PUCH_ODR_RTN_RSLT.COMPANY_CD "
+"  AND M_VEND_CTRL.VEND_CD(+) = T_PUCH_ODR_RTN_RSLT.VEND_CD "
+"  AND M_WH.WH_CD(+) = T_PUCH_ODR_RTN_RSLT.WH_CD "
+"  AND USER_MST.USER_CD(+) = T_PUCH_ODR_RTN_RSLT.PUCH_ODR_PERSON "
+"  AND T1.VALUE = T_PUCH_ODR_RTN_RSLT.INV_CTRL_FLG "
+"  AND T2.VALUE = T_PUCH_ODR_RTN_RSLT.UNIT_COST_TYP "
+"  AND T3.VALUE = T_PUCH_ODR_RTN_RSLT.TAX_ROUND_TYP "
+"  AND T4.VALUE = T_PUCH_ODR_RTN_RSLT.RTN_DEL_FLG "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PLANT_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PUCH_RTN_DATE\" >= TO_DATE(?) "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PUCH_RTN_DATE\" <= TO_DATE(?) "
+"  AND T_PUCH_ODR_RTN_RSLT.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"VEND_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"ITEM_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PUCH_ODR_PERSON\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"WH_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PUCH_ODR_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"RTN_DEL_FLG\" = ? "
+"ORDER BY "
+"  T_PUCH_ODR_RTN_RSLT.\"PLANT_CD\", "
+"  T_PUCH_ODR_RTN_RSLT.\"PUCH_ODR_CD\", "
+"  T_PUCH_ODR_RTN_RSLT.\"VEND_CD\", "
+"  T_PUCH_ODR_RTN_RSLT.\"ITEM_CD\"";
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
		public List read(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read
			if(m_selcmd==null) throw new FoundationException("Select", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, AE0130010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getPUCH_RTN_DATE_FROM());
				if(isNull(data.getPUCH_RTN_DATE_FROM())) isNull = true;
				ary.addElement(data.getPUCH_RTN_DATE_TO());
				if(isNull(data.getPUCH_RTN_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_PERSON());
				if(isNull(data.getPUCH_ODR_PERSON())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getRTN_DEL_FLG());
				if(isNull(data.getRTN_DEL_FLG())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_RTN_DATE_FROM())) setString(no ++, data.getPUCH_RTN_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_RTN_DATE_TO())) setString(no ++, data.getPUCH_RTN_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_PERSON())) setString(no ++, data.getPUCH_ODR_PERSON(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRTN_DEL_FLG())) setString(no ++, data.getRTN_DEL_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0130010Struct data = new AE0130010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_VEND_CD( getString(3, rs) );
			data.setl_VEND_ANAME( getString(4, rs) );
			data.setl_ITEM_CD( getString(5, rs) );
			data.setl_ITEM_NAME( getString(6, rs) );
			data.setl_LOT_NO( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_INV_CTRL_FLG_DN( getString(9, rs) );
			data.setl_PUCH_ODR_PERSON( getString(10, rs) );
			data.setl_USER_NAME( getString(11, rs) );
			data.setl_PUCH_RTN_DATE( getString(12, rs) );
			data.setl_PUCH_RTN_QTY( getString(13, rs) );
			data.setl_WH_CD( getString(14, rs) );
			data.setl_WH_NAME( getString(15, rs) );
			data.setl_VEND_LOT_NO( getString(16, rs) );
			data.setl_UNIT_COST_TYP_DN( getString(17, rs) );
			data.setl_UNIT_COST( getString(18, rs) );
			data.setl_PROCESSING_COST( getString(19, rs) );
			data.setl_MATERIAL_COST( getString(20, rs) );
			data.setl_OTHER_OVERHEADS( getString(21, rs) );
			data.setl_PUCH_ODR_AMOUNT( getString(22, rs) );
			data.setl_DISC_AMOUNT( getString(23, rs) );
			data.setl_NET_AMOUNT( getString(24, rs) );
			data.setl_PUCH_RTN_COMMENT( getString(25, rs) );
			data.setl_RATE_JUDGE_DATE( getString(26, rs) );
			data.setl_EXCH_RATE( getString(27, rs) );
			data.setl_TAX_RATE_1( getString(28, rs) );
			data.setl_TAX_RATE_2( getString(29, rs) );
			data.setl_TAX_RATE_3( getString(30, rs) );
			data.setl_TAX_AMOUNT_1( getString(31, rs) );
			data.setl_TAX_AMOUNT_2( getString(32, rs) );
			data.setl_TAX_AMOUNT_3( getString(33, rs) );
			data.setl_AMOUNT_INCLUDE_TAX( getString(34, rs) );
			data.setl_HOME_CUR_AMOUNT( getString(35, rs) );
			data.setl_TAX_CD( getString(36, rs) );
			data.setl_TAX_ROUND_TYP_DN( getString(37, rs) );
			data.setl_RTN_DEL_FLG_DN( getString(38, rs) );
			data.setl_RTN_DEL_DATE( getString(39, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
	public class selectM_PLANT extends DataObject
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
		public List read(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PLANT_read
			if(m_selcmd==null) throw new FoundationException("selectM_PLANT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, AE0130010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0130010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0130010Struct data = new AE0130010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PLANT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PLANT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
	public class selectM_VEND_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_VEND_CTRL.\"VEND_NAME\" AS \"VEND_NAME\" "
+"FROM "
+"  M_VEND_CTRL, "
+"  SYS_MY_COMPANY "
+"WHERE "
+"  M_VEND_CTRL.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
+"  AND SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"  AND M_VEND_CTRL.\"VEND_CD\" = ?";
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
		public List read(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_VEND_CTRL_read
			if(m_selcmd==null) throw new FoundationException("selectM_VEND_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, AE0130010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0130010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0130010Struct data = new AE0130010Struct();

			data.setVEND_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_VEND_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_VEND_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0130010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0130010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0130010Struct data = new AE0130010Struct();

			data.setITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
	public class selectUSER_MST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  USER_MST.\"USER_NAME\" AS \"USER_NAME\" "
+"FROM "
+"  USER_MST "
+"WHERE "
+"  USER_MST.\"USER_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectUSER_MST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectUSER_MST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectUSER_MST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0130010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read2
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectUSER_MST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0130010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read3
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectUSER_MST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_PERSON());
				if(isNull(data.getPUCH_ODR_PERSON())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_PERSON(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0130010Struct data = new AE0130010Struct();

			data.setUSER_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectUSER_MST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectUSER_MST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectUSER_MST_clear

			return;
		}

		/**
		 * selectUSER_MSTクラスの標準コンストラクタ
		 */
		public selectUSER_MST()
		{
			//{{user_implement_dev:selectUSER_MST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectUSER_MST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_WH extends DataObject
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
		public List read(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_read
			if(m_selcmd==null) throw new FoundationException("selectM_WH", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, AE0130010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0130010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0130010Struct data = new AE0130010Struct();

			data.setWH_NAME( getString(1, rs) );
			data.setPLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
	public class checkT_PUCH_ODR_RTN_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  PUCH_ODR_CD "
+"FROM "
+"  T_PUCH_ODR_RTN_RSLT "
+"WHERE "
+"  PUCH_ODR_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_PUCH_ODR_RTN_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_PUCH_ODR_RTN_RSLT_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_PUCH_ODR_RTN_RSLT_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_PUCH_ODR_RTN_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_PUCH_ODR_RTN_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_PUCH_ODR_RTN_RSLT_clear

			return;
		}

		/**
		 * checkT_PUCH_ODR_RTN_RSLTクラスの標準コンストラクタ
		 */
		public checkT_PUCH_ODR_RTN_RSLT()
		{
			//{{user_implement_dev:checkT_PUCH_ODR_RTN_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_PUCH_ODR_RTN_RSLT_constractor

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
+"  T_PUCH_ODR_RTN_RSLT, "
+"  M_VEND_CTRL, "
+"  M_ITEM, "
+"  USER_MST, "
+"  M_WH, "
+"  ( "
+"    SELECT "
+"      DISPLAY_NAME, "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'INV_CTRL_FLG' "
+"  ) T1, "
+"  ( "
+"    SELECT "
+"      DISPLAY_NAME, "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'UNIT_COST_TYP' "
+"  ) T2, "
+"  ( "
+"    SELECT "
+"      DISPLAY_NAME, "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'TAX_ROUND_TYP' "
+"  ) T3, "
+"  ( "
+"    SELECT "
+"      DISPLAY_NAME, "
+"      VALUE "
+"    FROM "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      NAME = 'RTN_DEL_FLG' "
+"  ) T4 "
+"WHERE "
+"  M_ITEM.ITEM_CD(+) = T_PUCH_ODR_RTN_RSLT.ITEM_CD "
+"  AND M_VEND_CTRL.COMPANY_CD(+) = T_PUCH_ODR_RTN_RSLT.COMPANY_CD "
+"  AND M_VEND_CTRL.VEND_CD(+) = T_PUCH_ODR_RTN_RSLT.VEND_CD "
+"  AND M_WH.WH_CD(+) = T_PUCH_ODR_RTN_RSLT.WH_CD "
+"  AND USER_MST.USER_CD(+) = T_PUCH_ODR_RTN_RSLT.PUCH_ODR_PERSON "
+"  AND T1.VALUE = T_PUCH_ODR_RTN_RSLT.INV_CTRL_FLG "
+"  AND T2.VALUE = T_PUCH_ODR_RTN_RSLT.UNIT_COST_TYP "
+"  AND T3.VALUE = T_PUCH_ODR_RTN_RSLT.TAX_ROUND_TYP "
+"  AND T4.VALUE = T_PUCH_ODR_RTN_RSLT.RTN_DEL_FLG "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PLANT_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PUCH_RTN_DATE\" >= TO_DATE(?) "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PUCH_RTN_DATE\" <= TO_DATE(?) "
+"  AND T_PUCH_ODR_RTN_RSLT.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"VEND_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"ITEM_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PUCH_ODR_PERSON\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"WH_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"PUCH_ODR_CD\" = ? "
+"  AND T_PUCH_ODR_RTN_RSLT.\"RTN_DEL_FLG\" = ? "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
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
		public List read(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0130010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0130010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getPUCH_RTN_DATE_FROM());
				if(isNull(data.getPUCH_RTN_DATE_FROM())) isNull = true;
				ary.addElement(data.getPUCH_RTN_DATE_TO());
				if(isNull(data.getPUCH_RTN_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_PERSON());
				if(isNull(data.getPUCH_ODR_PERSON())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getRTN_DEL_FLG());
				if(isNull(data.getRTN_DEL_FLG())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_RTN_DATE_FROM())) setString(no ++, data.getPUCH_RTN_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_RTN_DATE_TO())) setString(no ++, data.getPUCH_RTN_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_PERSON())) setString(no ++, data.getPUCH_ODR_PERSON(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getRTN_DEL_FLG())) setString(no ++, data.getRTN_DEL_FLG(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0130010Struct data = new AE0130010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0130010Struct data) throws FoundationException, SQLException
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
		mselectM_PLANT.clear();
		mselectM_PLANT = null;
		mselectM_VEND_CTRL.clear();
		mselectM_VEND_CTRL = null;
		mselectM_ITEM.clear();
		mselectM_ITEM = null;
		mselectUSER_MST.clear();
		mselectUSER_MST = null;
		mselectM_WH.clear();
		mselectM_WH = null;
		mcheckT_PUCH_ODR_RTN_RSLT.clear();
		mcheckT_PUCH_ODR_RTN_RSLT = null;
		mSelectCnt.clear();
		mSelectCnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AE0130010クラスの標準コンストラクタ
	 */
	public AE0130010Entity() throws FoundationException
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
