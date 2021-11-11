/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0170/src/com/nec/jp/orteus/metamorBase/AE0170/AE0170010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0170;

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
 * CLASS     : AE0170010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AE0170010Entity extends DataObject
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

	// read_T_RLSD_PUCH_ODRクラス インスタンス
	public read_T_RLSD_PUCH_ODR mread_T_RLSD_PUCH_ODR = new read_T_RLSD_PUCH_ODR();

	// read_T_ACPT_RSLTクラス インスタンス
	public read_T_ACPT_RSLT mread_T_ACPT_RSLT = new read_T_ACPT_RSLT();

	// get_COMPANY_CDクラス インスタンス
	public get_COMPANY_CD mget_COMPANY_CD = new get_COMPANY_CD();

	// check_T_DEBT_LEDGER_H_TRNクラス インスタンス
	public check_T_DEBT_LEDGER_H_TRN mcheck_T_DEBT_LEDGER_H_TRN = new check_T_DEBT_LEDGER_H_TRN();

	// check_T_DEBT_LEDGER_H1クラス インスタンス
	public check_T_DEBT_LEDGER_H1 mcheck_T_DEBT_LEDGER_H1 = new check_T_DEBT_LEDGER_H1();

	// check_T_DEBT_LEDGER_H2クラス インスタンス
	public check_T_DEBT_LEDGER_H2 mcheck_T_DEBT_LEDGER_H2 = new check_T_DEBT_LEDGER_H2();

	// get_M_TAXクラス インスタンス
	public get_M_TAX mget_M_TAX = new get_M_TAX();

	// update_T_RLSD_PUCH_ODRクラス インスタンス
	public update_T_RLSD_PUCH_ODR mupdate_T_RLSD_PUCH_ODR = new update_T_RLSD_PUCH_ODR();

	// update_T_ACPT_RSLTクラス インスタンス
	public update_T_ACPT_RSLT mupdate_T_ACPT_RSLT = new update_T_ACPT_RSLT();

	// T_PAST_INSPC_ACPTクラス インスタンス
	public T_PAST_INSPC_ACPT mT_PAST_INSPC_ACPT = new T_PAST_INSPC_ACPT();

	// T_INSPC_ACPT_IFクラス インスタンス
	public T_INSPC_ACPT_IF mT_INSPC_ACPT_IF = new T_INSPC_ACPT_IF();

	// T_DEBT_LEDGER_TRNクラス インスタンス
	public T_DEBT_LEDGER_TRN mT_DEBT_LEDGER_TRN = new T_DEBT_LEDGER_TRN();

	// T_DEBT_LEDGER_H_TRNクラス インスタンス
	public T_DEBT_LEDGER_H_TRN mT_DEBT_LEDGER_H_TRN = new T_DEBT_LEDGER_H_TRN();

	// T_DEBT_LEDGERクラス インスタンス
	public T_DEBT_LEDGER mT_DEBT_LEDGER = new T_DEBT_LEDGER();

	// T_DEBT_LEDGER_Hクラス インスタンス
	public T_DEBT_LEDGER_H mT_DEBT_LEDGER_H = new T_DEBT_LEDGER_H();

	// T_DEBT_BALANCE_Dクラス インスタンス
	public T_DEBT_BALANCE_D mT_DEBT_BALANCE_D = new T_DEBT_BALANCE_D();

	// T_DEBT_BALANCEクラス インスタンス
	public T_DEBT_BALANCE mT_DEBT_BALANCE = new T_DEBT_BALANCE();

	// check_SYS_INSTALL_OPTIONSクラス インスタンス
	public check_SYS_INSTALL_OPTIONS mcheck_SYS_INSTALL_OPTIONS = new check_SYS_INSTALL_OPTIONS();

	// get_SYS_DEBT_CTRLクラス インスタンス
	public get_SYS_DEBT_CTRL mget_SYS_DEBT_CTRL = new get_SYS_DEBT_CTRL();

	// get_HOME_DECIMAL_FIGクラス インスタンス
	public get_HOME_DECIMAL_FIG mget_HOME_DECIMAL_FIG = new get_HOME_DECIMAL_FIG();

	// get_SYS_HOME_CURクラス インスタンス
	public get_SYS_HOME_CUR mget_SYS_HOME_CUR = new get_SYS_HOME_CUR();

	// getModifyCount_T_RLSD_PUCH_ODRクラス インスタンス
	public getModifyCount_T_RLSD_PUCH_ODR mgetModifyCount_T_RLSD_PUCH_ODR = new getModifyCount_T_RLSD_PUCH_ODR();

	// getModifyCount_T_ACPT_RSLTクラス インスタンス
	public getModifyCount_T_ACPT_RSLT mgetModifyCount_T_ACPT_RSLT = new getModifyCount_T_ACPT_RSLT();

	// get_M_PLANT_SCMクラス インスタンス
	public get_M_PLANT_SCM mget_M_PLANT_SCM = new get_M_PLANT_SCM();

	// check_T_INSPC_ACPT_IFクラス インスタンス
	public check_T_INSPC_ACPT_IF mcheck_T_INSPC_ACPT_IF = new check_T_INSPC_ACPT_IF();

	// check_T_DEBT_BALANCEクラス インスタンス
	public check_T_DEBT_BALANCE mcheck_T_DEBT_BALANCE = new check_T_DEBT_BALANCE();

	// read_T_DEBT_LEDGERクラス インスタンス
	public read_T_DEBT_LEDGER mread_T_DEBT_LEDGER = new read_T_DEBT_LEDGER();

	// SELECT_TIME_CTRLクラス インスタンス
	public SELECT_TIME_CTRL mSELECT_TIME_CTRL = new SELECT_TIME_CTRL();


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
		String m_write_fname="AE0170010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AE0170010";

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
	public class read_T_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\" AS \"NON_NO_ITEM_FLG\", "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" AS \"VEND_CD\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD HH24:MI:SS') AS \"PUCH_ODR_DLV_DATE\", "
+"  T_RLSD_PUCH_ODR.\"TAX_CD\" AS \"TAX_CD\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD HH24:MI:SS') AS \"PUCH_ODR_START_DATE\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\" AS \"PUCH_ODR_QTY\", "
+"  T_RLSD_PUCH_ODR.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\", "
+"  T_RLSD_PUCH_ODR.\"UNIT_COST\" AS \"UNIT_COST\", "
+"  T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\" AS \"ACPT_INSPC_TYP\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_AMOUNT\" AS \"PUCH_ODR_AMOUNT\", "
+"  T_RLSD_PUCH_ODR.\"RATE_JUDGE_DATE\" AS \"RATE_JUDGE_DATE\", "
+"  T_RLSD_PUCH_ODR.\"NET_AMOUNT\" AS \"NET_AMOUNT\", "
+"  T_RLSD_PUCH_ODR.\"TAX_AMOUNT_1\" AS \"TAX_AMOUNT_1\", "
+"  T_RLSD_PUCH_ODR.\"TAX_AMOUNT_2\" AS \"TAX_AMOUNT_2\", "
+"  T_RLSD_PUCH_ODR.\"TAX_AMOUNT_3\" AS \"TAX_AMOUNT_3\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\" AS \"PUCH_ODR_STS_TYP\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_INST_SLIP_ISS_FLG\" AS \"PUCH_ODR_INST_SLIP_ISS_FLG\", "
+"  T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\" AS \"ODR_CANCEL_SLIP_ISS_FLG\", "
+"  T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\" AS \"INSPC_CMPLT_FLG\", "
+"  T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\" AS \"ACPT_INSPC_TYP\", "
+"  T_RLSD_PUCH_ODR.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\", "
+"  T_RLSD_PUCH_ODR.\"EXCH_RATE\" AS \"EXCH_RATE\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  T_OD.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  M_VEND_CTRL.\"VEND_ANAME\" AS \"VEND_ANAME\", "
+"  M_VEND_CTRL.\"INSPC_ACPT_APP_TYP\" AS \"INSPC_ACPT_APP_TYP\", "
+"  M_VEND_CTRL.\"CUR_CD\" AS \"CUR_CD\", "
+"  M_VEND_CTRL.\"EXCH_TYP\" AS \"EXCH_TYP\", "
+"  M_VEND_CTRL.\"ROUND_TYP\" AS \"ROUND_TYP\", "
+"  M_CUR.\"CUR_NAME\" AS \"CUR_NAME\", "
+"  M_CUR.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"  M_CUR.\"DECIMAL_FIG\" AS \"DECIMAL_FIG\" "
+"FROM "
+"  T_RLSD_PUCH_ODR, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  T_OD, "
+"  M_CUR "
+"WHERE "
+"  T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  AND T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND M_VEND_CTRL.CUR_CD = M_CUR.CUR_CD(+) "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"COMPANY_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:read_T_RLSD_PUCH_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:read_T_RLSD_PUCH_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_RLSD_PUCH_ODR_read
			if(m_selcmd==null) throw new FoundationException("read_T_RLSD_PUCH_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_T_RLSD_PUCH_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_RLSD_PUCH_ODR_read2
			if(m_selcmd==null) throw new FoundationException("read_T_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:read_T_RLSD_PUCH_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_RLSD_PUCH_ODR_read3
			if(m_selcmd==null) throw new FoundationException("read_T_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:read_T_RLSD_PUCH_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setNON_NO_ITEM_FLG( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setVEND_CD( getString(3, rs) );
			data.setPUCH_ODR_DLV_DATE( getString(4, rs) );
			data.setTAX_CD( getString(5, rs) );
			data.setPUCH_ODR_START_DATE( getString(6, rs) );
			data.setPUCH_ODR_QTY( getString(7, rs) );
			data.setUNIT_COST_TYP( getString(8, rs) );
			data.setUNIT_COST( getString(9, rs) );
			data.setACPT_INSPC_TYP( getString(10, rs) );
			data.setPUCH_ODR_AMOUNT( getString(11, rs) );
			data.setRATE_JUDGE_DATE( getString(12, rs) );
			data.setNET_AMOUNT( getString(13, rs) );
			data.setTAX_AMOUNT_1( getString(14, rs) );
			data.setTAX_AMOUNT_2( getString(15, rs) );
			data.setTAX_AMOUNT_3( getString(16, rs) );
			data.setPUCH_ODR_STS_TYP( getString(17, rs) );
			data.setPUCH_ODR_INST_SLIP_ISS_FLG( getString(18, rs) );
			data.setODR_CANCEL_SLIP_ISS_FLG( getString(19, rs) );
			data.setINSPC_CMPLT_FLG( getString(20, rs) );
			data.setACPT_INSPC_TYP( getString(21, rs) );
			data.setMODIFY_COUNT( getString(22, rs) );
			data.setEXCH_RATE( getString(23, rs) );
			data.setITEM_NAME( getString(24, rs) );
			data.setSTOCK_UNIT( getString(25, rs) );
			data.setJOB_ODR_CD( getString(26, rs) );
			data.setVEND_NAME( getString(27, rs) );
			data.setINSPC_ACPT_APP_TYP( getString(28, rs) );
			data.setCUR_CD( getString(29, rs) );
			data.setEXCH_TYP( getString(30, rs) );
			data.setROUND_TYP( getString(31, rs) );
			data.setCUR_NAME( getString(32, rs) );
			data.setCUR_UNIT( getString(33, rs) );
			data.setDECIMAL_FIG( getString(34, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("read_T_RLSD_PUCH_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_RLSD_PUCH_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_T_RLSD_PUCH_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:read_T_RLSD_PUCH_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:read_T_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * read_T_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public read_T_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:read_T_RLSD_PUCH_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:read_T_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class read_T_ACPT_RSLT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ACPT_RSLT.\"ACPT_NO\" AS \"ACPT_NO\", "
+"  T_ACPT_RSLT.\"ACPT_QTY\" AS \"ACPT_QTY\", "
+"  TO_CHAR(T_ACPT_RSLT.\"ACPT_DATE\",'YYYY/MM/DD') AS \"ACPT_DATE\", "
+"  T_ACPT_RSLT.\"UNIT_COST\" AS \"UNIT_COST\", "
+"  T_ACPT_RSLT.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\", "
+"  T_ACPT_RSLT.\"PUCH_ODR_AMOUNT\" AS \"PUCH_ODR_AMOUNT\", "
+"  T_ACPT_RSLT.\"NET_AMOUNT\" AS \"NET_AMOUNT\", "
+"  T_ACPT_RSLT.\"TAX_AMOUNT_1\" AS \"TAX_AMOUNT_1\", "
+"  T_ACPT_RSLT.\"TAX_AMOUNT_2\" AS \"TAX_AMOUNT_2\", "
+"  T_ACPT_RSLT.\"TAX_AMOUNT_3\" AS \"TAX_AMOUNT_3\", "
+"  T_ACPT_RSLT.\"RATE_JUDGE_DATE\" AS \"RATE_JUDGE_DATE\", "
+"  T_ACPT_RSLT.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\", "
+"  T_ACPT_RSLT.\"EXCH_RATE\" AS \"EXCH_RATE\", "
+"  T_INSPC_RSLT.\"INSPECTED_QTY\" AS \"INSPECTED_QTY\", "
+"  T_INSPC_RSLT.\"ACCEPTED_QTY\" AS \"ACCEPTED_QTY\", "
+"  TO_CHAR(T_INSPC_RSLT.\"INSPEC_DATE\",'YYYY/MM/DD') AS \"INSPEC_DATE\" "
+"FROM "
+"  T_ACPT_RSLT, "
+"  T_INSPC_RSLT "
+"WHERE "
+"  T_ACPT_RSLT.PUCH_ODR_CD = T_INSPC_RSLT.PUCH_ODR_CD(+) "
+"  AND T_ACPT_RSLT.ACPT_NO = T_INSPC_RSLT.ACPT_NO(+) "
+"  AND T_ACPT_RSLT.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:read_T_ACPT_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:read_T_ACPT_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_ACPT_RSLT_read
			if(m_selcmd==null) throw new FoundationException("read_T_ACPT_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_T_ACPT_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_ACPT_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("read_T_ACPT_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:read_T_ACPT_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_ACPT_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("read_T_ACPT_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:read_T_ACPT_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setACPT_NO( getString(1, rs) );
			data.setACPT_QTY( getString(2, rs) );
			data.setACPT_DATE( getString(3, rs) );
			data.setUNIT_COST( getString(4, rs) );
			data.setUNIT_COST_TYP( getString(5, rs) );
			data.setPUCH_ODR_AMOUNT( getString(6, rs) );
			data.setNET_AMOUNT( getString(7, rs) );
			data.setTAX_AMOUNT_1( getString(8, rs) );
			data.setTAX_AMOUNT_2( getString(9, rs) );
			data.setTAX_AMOUNT_3( getString(10, rs) );
			data.setRATE_JUDGE_DATE( getString(11, rs) );
			data.setMODIFY_COUNT( getString(12, rs) );
			data.setEXCH_RATE( getString(13, rs) );
			data.setINSPECTED_QTY( getString(14, rs) );
			data.setACCEPTED_QTY( getString(15, rs) );
			data.setINSPEC_DATE( getString(16, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("read_T_ACPT_RSLT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_ACPT_RSLT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_T_ACPT_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:read_T_ACPT_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:read_T_ACPT_RSLT_clear

			return;
		}

		/**
		 * read_T_ACPT_RSLTクラスの標準コンストラクタ
		 */
		public read_T_ACPT_RSLT()
		{
			//{{user_implement_dev:read_T_ACPT_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:read_T_ACPT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class get_COMPANY_CD extends DataObject
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

		//{{user_implement_dev:get_COMPANY_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:get_COMPANY_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_COMPANY_CD_read
			if(m_selcmd==null) throw new FoundationException("get_COMPANY_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_COMPANY_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_COMPANY_CD_read2
			if(m_selcmd==null) throw new FoundationException("get_COMPANY_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_COMPANY_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_COMPANY_CD_read3
			if(m_selcmd==null) throw new FoundationException("get_COMPANY_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_COMPANY_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("get_COMPANY_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_COMPANY_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_COMPANY_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:get_COMPANY_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:get_COMPANY_CD_clear

			return;
		}

		/**
		 * get_COMPANY_CDクラスの標準コンストラクタ
		 */
		public get_COMPANY_CD()
		{
			//{{user_implement_dev:get_COMPANY_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:get_COMPANY_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class check_T_DEBT_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_DEBT_LEDGER_H_TRN.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\" "
+"FROM "
+"  T_DEBT_LEDGER_H_TRN "
+"WHERE "
+"  T_DEBT_LEDGER_H_TRN.\"PUCH_ODR_CD\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"ACPT_NO\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_DEBT_LEDGER_H_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:check_T_DEBT_LEDGER_H_TRN_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H_TRN_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H_TRN_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * check_T_DEBT_LEDGER_H_TRNクラスの標準コンストラクタ
		 */
		public check_T_DEBT_LEDGER_H_TRN()
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class check_T_DEBT_LEDGER_H1 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_DEBT_LEDGER_H.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\" "
+"FROM "
+"  T_DEBT_LEDGER_H "
+"WHERE "
+"  T_DEBT_LEDGER_H.\"PUCH_ODR_CD\" = ? "
+"  AND T_DEBT_LEDGER_H.\"ACPT_NO\" = ? "
+"  AND T_DEBT_LEDGER_H.\"STATUS\" <= 30";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_DEBT_LEDGER_H1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:check_T_DEBT_LEDGER_H1_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H1_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H1_clear

			return;
		}

		/**
		 * check_T_DEBT_LEDGER_H1クラスの標準コンストラクタ
		 */
		public check_T_DEBT_LEDGER_H1()
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class check_T_DEBT_LEDGER_H2 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_DEBT_LEDGER_H.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\" "
+"FROM "
+"  T_DEBT_LEDGER_H "
+"WHERE "
+"  T_DEBT_LEDGER_H.\"PUCH_ODR_CD\" = ? "
+"  AND T_DEBT_LEDGER_H.\"ACPT_NO\" = ? "
+"  AND T_DEBT_LEDGER_H.\"STATUS\" >= 40";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_DEBT_LEDGER_H2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:check_T_DEBT_LEDGER_H2_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H2_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H2_clear

			return;
		}

		/**
		 * check_T_DEBT_LEDGER_H2クラスの標準コンストラクタ
		 */
		public check_T_DEBT_LEDGER_H2()
		{
			//{{user_implement_dev:check_T_DEBT_LEDGER_H2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:check_T_DEBT_LEDGER_H2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class get_M_TAX extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_TAX.\"OLD_TAX_RATE_1\" AS \"OLD_TAX_RATE_1\", "
+"  M_TAX.\"OLD_TAX_RATE_2\" AS \"OLD_TAX_RATE_2\", "
+"  M_TAX.\"OLD_TAX_RATE_3\" AS \"OLD_TAX_RATE_3\", "
+"  TO_CHAR(M_TAX.\"NEW_TAX_RATE_START_DATE\",'YYYY/MM/DD') AS \"NEW_TAX_RATE_START_DATE\", "
+"  M_TAX.\"NEW_TAX_RATE_1\" AS \"NEW_TAX_RATE_1\", "
+"  M_TAX.\"NEW_TAX_RATE_2\" AS \"NEW_TAX_RATE_2\", "
+"  M_TAX.\"NEW_TAX_RATE_3\" AS \"NEW_TAX_RATE_3\", "
+"  M_TAX.\"ROUND_TYP\" AS \"ROUND_TYP\" "
+"FROM "
+"  M_TAX "
+"WHERE "
+"  M_TAX.\"TAX_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:get_M_TAX_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:get_M_TAX_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_M_TAX_read
			if(m_selcmd==null) throw new FoundationException("get_M_TAX", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_M_TAX_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_M_TAX_read2
			if(m_selcmd==null) throw new FoundationException("get_M_TAX", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_M_TAX_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_M_TAX_read3
			if(m_selcmd==null) throw new FoundationException("get_M_TAX", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_M_TAX_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getTAX_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

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
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("get_M_TAX", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_M_TAX_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_M_TAX_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:get_M_TAX_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:get_M_TAX_clear

			return;
		}

		/**
		 * get_M_TAXクラスの標準コンストラクタ
		 */
		public get_M_TAX()
		{
			//{{user_implement_dev:get_M_TAX_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:get_M_TAX_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class update_T_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_RLSD_PUCH_ODR "
+"SET "
+"  \"TAX_RATE_1\" = ?, "
+"  \"TAX_RATE_2\" = ?, "
+"  \"TAX_RATE_3\" = ?, "
+"  \"TAX_AMOUNT_1\" = ?, "
+"  \"TAX_AMOUNT_2\" = ?, "
+"  \"TAX_AMOUNT_3\" = ?, "
+"  \"AMOUNT_INCLUDE_TAX\" = ?, "
+"  \"HOME_CUR_AMOUNT\" = ?, "
+"  \"TAX_CD\" = ?, "
+"  \"TAX_ROUND_TYP\" = ? "
+"WHERE "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:update_T_RLSD_PUCH_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:update_T_RLSD_PUCH_ODR_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getTAX_RATE_1(), stmt);
				setString(5, data.getTAX_RATE_2(), stmt);
				setString(6, data.getTAX_RATE_3(), stmt);
				setString(7, data.getTAX_AMOUNT_1(), stmt);
				setString(8, data.getTAX_AMOUNT_2(), stmt);
				setString(9, data.getTAX_AMOUNT_3(), stmt);
				setString(10, data.getAMOUNT_INCLUDE_TAX(), stmt);
				setString(11, data.getHOME_CUR_AMOUNT(), stmt);
				setString(12, data.getTAX_CD(), stmt);
				setString(13, data.getTAX_ROUND_TYP(), stmt);
				setString(14, data.getPUCH_ODR_CD(), stmt);

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
			//{{user_implement_dev:update_T_RLSD_PUCH_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:update_T_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * update_T_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public update_T_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:update_T_RLSD_PUCH_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:update_T_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class update_T_ACPT_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_ACPT_RSLT "
+"SET "
+"  \"TAX_RATE_1\" = ?, "
+"  \"TAX_RATE_2\" = ?, "
+"  \"TAX_RATE_3\" = ?, "
+"  \"NET_AMOUNT\" = ?, "
+"  \"TAX_AMOUNT_1\" = ?, "
+"  \"TAX_AMOUNT_2\" = ?, "
+"  \"TAX_AMOUNT_3\" = ?, "
+"  \"AMOUNT_INCLUDE_TAX\" = ?, "
+"  \"HOME_CUR_AMOUNT\" = ?, "
+"  \"TAX_CD\" = ?, "
+"  \"TAX_ROUND_TYP\" = ? "
+"WHERE "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  AND T_ACPT_RSLT.\"ACPT_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:update_T_ACPT_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:update_T_ACPT_RSLT_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getTAX_RATE_1(), stmt);
				setString(5, data.getTAX_RATE_2(), stmt);
				setString(6, data.getTAX_RATE_3(), stmt);
				setString(7, data.getNET_AMOUNT(), stmt);
				setString(8, data.getTAX_AMOUNT_1(), stmt);
				setString(9, data.getTAX_AMOUNT_2(), stmt);
				setString(10, data.getTAX_AMOUNT_3(), stmt);
				setString(11, data.getAMOUNT_INCLUDE_TAX(), stmt);
				setString(12, data.getHOME_CUR_AMOUNT(), stmt);
				setString(13, data.getTAX_CD(), stmt);
				setString(14, data.getTAX_ROUND_TYP(), stmt);
				setString(15, data.getPUCH_ODR_CD(), stmt);
				setString(16, data.getACPT_NO(), stmt);

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
			//{{user_implement_dev:update_T_ACPT_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:update_T_ACPT_RSLT_clear

			return;
		}

		/**
		 * update_T_ACPT_RSLTクラスの標準コンストラクタ
		 */
		public update_T_ACPT_RSLT()
		{
			//{{user_implement_dev:update_T_ACPT_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:update_T_ACPT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_PAST_INSPC_ACPT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_PAST_INSPC_ACPT.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\", "
+"  T_PAST_INSPC_ACPT.\"ACPT_NO\" AS \"ACPT_NO\", "
+"  T_PAST_INSPC_ACPT.\"INSPC_ACPT_NO\" AS \"INSPC_ACPT_NO\", "
+"  T_PAST_INSPC_ACPT.\"INSPC_ACPT_GNR_TYP\" AS \"INSPC_ACPT_GNR_TYP\", "
+"  T_PAST_INSPC_ACPT.\"CRCT_NO\" AS \"CRCT_NO\", "
+"  T_PAST_INSPC_ACPT.\"CRCT_TYP\" AS \"CRCT_TYP\", "
+"  T_PAST_INSPC_ACPT.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_PAST_INSPC_ACPT.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  T_PAST_INSPC_ACPT.\"SLIP_TYP\" AS \"SLIP_TYP\", "
+"  T_PAST_INSPC_ACPT.\"WORK_IN_PROC_CD\" AS \"WORK_IN_PROC_CD\", "
+"  T_PAST_INSPC_ACPT.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_PAST_INSPC_ACPT.\"VEND_CD\" AS \"VEND_CD\", "
+"  T_PAST_INSPC_ACPT.\"PLANT_CD\" AS \"PLANT_CD\", "
+"  T_PAST_INSPC_ACPT.\"UNIT_COST\" AS \"UNIT_COST\", "
+"  T_PAST_INSPC_ACPT.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\", "
+"  T_PAST_INSPC_ACPT.\"PROCESSING_COST\" AS \"PROCESSING_COST\", "
+"  T_PAST_INSPC_ACPT.\"MATERIAL_COST\" AS \"MATERIAL_COST\", "
+"  T_PAST_INSPC_ACPT.\"OTHER_OVERHEADS\" AS \"OTHER_OVERHEADS\", "
+"  T_PAST_INSPC_ACPT.\"ACPT_QTY\" AS \"ACPT_QTY\", "
+"  T_PAST_INSPC_ACPT.\"INSPC_ACPT_QTY\" AS \"INSPC_ACPT_QTY\", "
+"  T_PAST_INSPC_ACPT.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  T_PAST_INSPC_ACPT.\"INSPC_ACPT_AMOUNT\" AS \"INSPC_ACPT_AMOUNT\", "
+"  T_PAST_INSPC_ACPT.\"SAVING_AMOUNT\" AS \"SAVING_AMOUNT\", "
+"  TO_CHAR(T_PAST_INSPC_ACPT.\"ACPT_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"ACPT_DATE\", "
+"  TO_CHAR(T_PAST_INSPC_ACPT.\"INSPC_ACPT_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"INSPC_ACPT_DATE\", "
+"  T_PAST_INSPC_ACPT.\"PRODUCT_TYP\" AS \"PRODUCT_TYP\", "
+"  T_PAST_INSPC_ACPT.\"DLV_CD\" AS \"DLV_CD\" "
+"FROM "
+"  T_PAST_INSPC_ACPT, "
+"  ( "
+"    SELECT "
+"      T_PAST_INSPC_ACPT.\"PUCH_ODR_CD\", "
+"      T_PAST_INSPC_ACPT.\"ACPT_NO\", "
+"      MAX(T_PAST_INSPC_ACPT.\"INSPC_ACPT_NO\") AS \"INSPC_ACPT_NO\" "
+"    FROM "
+"      T_PAST_INSPC_ACPT "
+"    WHERE "
+"      T_PAST_INSPC_ACPT.\"PUCH_ODR_CD\" = ? "
+"      AND T_PAST_INSPC_ACPT.\"ACPT_NO\" = ? "
+"    GROUP BY "
+"      T_PAST_INSPC_ACPT.\"PUCH_ODR_CD\", "
+"      T_PAST_INSPC_ACPT.\"ACPT_NO\" "
+"  ) MAXT "
+"WHERE "
+"  T_PAST_INSPC_ACPT.\"PUCH_ODR_CD\" = MAXT.\"PUCH_ODR_CD\" "
+"  AND T_PAST_INSPC_ACPT.\"ACPT_NO\" = MAXT.\"ACPT_NO\" "
+"  AND T_PAST_INSPC_ACPT.\"INSPC_ACPT_NO\" = MAXT.\"INSPC_ACPT_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_PAST_INSPC_ACPT(\"PUCH_ODR_CD\", \"ACPT_NO\", \"INSPC_ACPT_NO\", \"INSPC_ACPT_GNR_TYP\", \"CRCT_NO\", \"CRCT_TYP\", \"ITEM_CD\", \"ITEM_NAME\", \"SLIP_TYP\", \"WORK_IN_PROC_CD\", \"COMPANY_CD\", \"VEND_CD\", \"PLANT_CD\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"PROCESSING_COST\", \"MATERIAL_COST\", \"OTHER_OVERHEADS\", \"ACPT_QTY\", \"INSPC_ACPT_QTY\", \"STOCK_UNIT\", \"INSPC_ACPT_AMOUNT\", \"SAVING_AMOUNT\", \"ACPT_DATE\", \"INSPC_ACPT_DATE\", \"PRODUCT_TYP\", \"DLV_CD\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_PAST_INSPC_ACPT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_PAST_INSPC_ACPT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PAST_INSPC_ACPT_read
			if(m_selcmd==null) throw new FoundationException("T_PAST_INSPC_ACPT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_PAST_INSPC_ACPT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PAST_INSPC_ACPT_read2
			if(m_selcmd==null) throw new FoundationException("T_PAST_INSPC_ACPT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_PAST_INSPC_ACPT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PAST_INSPC_ACPT_read3
			if(m_selcmd==null) throw new FoundationException("T_PAST_INSPC_ACPT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_PAST_INSPC_ACPT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setACPT_NO( getString(2, rs) );
			data.setINSPC_ACPT_NO( getString(3, rs) );
			data.setINSPC_ACPT_GNR_TYP( getString(4, rs) );
			data.setCRCT_NO( getString(5, rs) );
			data.setCRCT_TYP( getString(6, rs) );
			data.setITEM_CD( getString(7, rs) );
			data.setITEM_NAME( getString(8, rs) );
			data.setSLIP_TYP( getString(9, rs) );
			data.setWORK_IN_PROC_CD( getString(10, rs) );
			data.setCOMPANY_CD( getString(11, rs) );
			data.setVEND_CD( getString(12, rs) );
			data.setPLANT_CD( getString(13, rs) );
			data.setUNIT_COST( getString(14, rs) );
			data.setUNIT_COST_TYP( getString(15, rs) );
			data.setPROCESSING_COST( getString(16, rs) );
			data.setMATERIAL_COST( getString(17, rs) );
			data.setOTHER_OVERHEADS( getString(18, rs) );
			data.setACPT_QTY( getString(19, rs) );
			data.setINSPC_ACPT_QTY( getString(20, rs) );
			data.setSTOCK_UNIT( getString(21, rs) );
			data.setINSPC_ACPT_AMOUNT( getString(22, rs) );
			data.setSAVING_AMOUNT( getString(23, rs) );
			data.setACPT_DATE( getString(24, rs) );
			data.setINSPC_ACPT_DATE( getString(25, rs) );
			data.setPRODUCT_TYP( getString(26, rs) );
			data.setDLV_CD( getString(27, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_PAST_INSPC_ACPT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_PAST_INSPC_ACPT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_PAST_INSPC_ACPT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getPUCH_ODR_CD(), stmt);
				setString(8, data.getACPT_NO(), stmt);
				setString(9, data.getINSPC_ACPT_NO(), stmt);
				setString(10, data.getINSPC_ACPT_GNR_TYP(), stmt);
				setString(11, data.getCRCT_NO(), stmt);
				setString(12, data.getCRCT_TYP(), stmt);
				setString(13, data.getITEM_CD(), stmt);
				setString(14, data.getITEM_NAME(), stmt);
				setString(15, data.getSLIP_TYP(), stmt);
				setString(16, data.getWORK_IN_PROC_CD(), stmt);
				setString(17, data.getCOMPANY_CD(), stmt);
				setString(18, data.getVEND_CD(), stmt);
				setString(19, data.getPLANT_CD(), stmt);
				setString(20, data.getUNIT_COST(), stmt);
				setString(21, data.getUNIT_COST_TYP(), stmt);
				setString(22, data.getPROCESSING_COST(), stmt);
				setString(23, data.getMATERIAL_COST(), stmt);
				setString(24, data.getOTHER_OVERHEADS(), stmt);
				setString(25, data.getACPT_QTY(), stmt);
				setString(26, data.getINSPC_ACPT_QTY(), stmt);
				setString(27, data.getSTOCK_UNIT(), stmt);
				setString(28, data.getINSPC_ACPT_AMOUNT(), stmt);
				setString(29, data.getSAVING_AMOUNT(), stmt);
				setString(30, data.getACPT_DATE(), stmt);
				setString(31, data.getINSPC_ACPT_DATE(), stmt);
				setString(32, data.getPRODUCT_TYP(), stmt);
				setString(33, data.getDLV_CD(), stmt);

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
			//{{user_implement_dev:T_PAST_INSPC_ACPT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_PAST_INSPC_ACPT_clear

			return;
		}

		/**
		 * T_PAST_INSPC_ACPTクラスの標準コンストラクタ
		 */
		public T_PAST_INSPC_ACPT()
		{
			//{{user_implement_dev:T_PAST_INSPC_ACPT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_PAST_INSPC_ACPT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_INSPC_ACPT_IF extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_INSPC_ACPT_IF.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\", "
+"  T_INSPC_ACPT_IF.\"ACPT_NO\" AS \"ACPT_NO\", "
+"  T_INSPC_ACPT_IF.\"INSPC_ACPT_NO\" AS \"INSPC_ACPT_NO\", "
+"  T_INSPC_ACPT_IF.\"CRCT_TYP\" AS \"CRCT_TYP\", "
+"  T_INSPC_ACPT_IF.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_INSPC_ACPT_IF.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  T_INSPC_ACPT_IF.\"SLIP_TYP\" AS \"SLIP_TYP\", "
+"  T_INSPC_ACPT_IF.\"WORK_IN_PROC_CD\" AS \"WORK_IN_PROC_CD\", "
+"  T_INSPC_ACPT_IF.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_INSPC_ACPT_IF.\"VEND_CD\" AS \"VEND_CD\", "
+"  T_INSPC_ACPT_IF.\"PLANT_CD\" AS \"PLANT_CD\", "
+"  T_INSPC_ACPT_IF.\"UNIT_COST\" AS \"UNIT_COST\", "
+"  T_INSPC_ACPT_IF.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\", "
+"  T_INSPC_ACPT_IF.\"PROCESSING_COST\" AS \"PROCESSING_COST\", "
+"  T_INSPC_ACPT_IF.\"MATERIAL_COST\" AS \"MATERIAL_COST\", "
+"  T_INSPC_ACPT_IF.\"OTHER_OVERHEADS\" AS \"OTHER_OVERHEADS\", "
+"  T_INSPC_ACPT_IF.\"ACPT_QTY\" AS \"ACPT_QTY\", "
+"  T_INSPC_ACPT_IF.\"INSPC_ACPT_QTY\" AS \"INSPC_ACPT_QTY\", "
+"  T_INSPC_ACPT_IF.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  T_INSPC_ACPT_IF.\"INSPC_ACPT_AMOUNT\" AS \"INSPC_ACPT_AMOUNT\", "
+"  T_INSPC_ACPT_IF.\"DISC_AMOUNT\" AS \"DISC_AMOUNT\", "
+"  TO_CHAR(T_INSPC_ACPT_IF.\"ACPT_DATE\", 'YYYY/MM/DD HH24:MI:SS') AS \"ACPT_DATE\", "
+"  TO_CHAR(T_INSPC_ACPT_IF.\"INSPC_ACPT_DATE\", 'YYYY/MM/DD HH24:MI:SS') AS \"INSPC_ACPT_DATE\", "
+"  T_INSPC_ACPT_IF.\"GNR_ORG_CD\" AS \"GNR_ORG_CD\", "
+"  T_INSPC_ACPT_IF.\"PRODUCT_TYP\" AS \"PRODUCT_TYP\", "
+"  T_INSPC_ACPT_IF.\"DLV_CD\" AS \"DLV_CD\", "
+"  T_INSPC_ACPT_IF.\"SBCNT_PUCH_TYP\" AS \"SBCNT_PUCH_TYP\", "
+"  T_INSPC_ACPT_IF.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T_INSPC_ACPT_IF.\"JOB_ODR_DETAIL_NO\" AS \"JOB_ODR_DETAIL_NO\", "
+"  T_INSPC_ACPT_IF.\"CLASIFICATION_CD\" AS \"CLASIFICATION_CD\", "
+"  T_INSPC_ACPT_IF.\"INV_CTRL_FLG\" AS \"INV_CTRL_FLG\", "
+"  T_INSPC_ACPT_IF.\"PUCH_RTN_FLG\" AS \"PUCH_RTN_FLG\", "
+"  T_INSPC_ACPT_IF.\"APPR_FLG\" AS \"APPR_FLG\", "
+"  T_INSPC_ACPT_IF.\"APPR_ID\" AS \"APPR_ID\", "
+"  TO_CHAR(T_INSPC_ACPT_IF.\"APPR_DATE\", 'YYYY/MM/DD HH24:MI:SS') AS \"APPR_DATE\", "
+"  T_INSPC_ACPT_IF.\"RESERVE_CAUSE\" AS \"RESERVE_CAUSE\" "
+"FROM "
+"  T_INSPC_ACPT_IF "
+"WHERE "
+"  T_INSPC_ACPT_IF.\"PUCH_ODR_CD\" = ? "
+"  AND T_INSPC_ACPT_IF.\"ACPT_NO\" = ? "
+"  AND T_INSPC_ACPT_IF.\"INSPC_ACPT_NO\" = ? "
+"  AND T_INSPC_ACPT_IF.\"CRCT_TYP\" = 2";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_INSPC_ACPT_IF(\"PUCH_ODR_CD\", \"ACPT_NO\", \"INSPC_ACPT_NO\", \"CRCT_TYP\", \"ITEM_CD\", \"ITEM_NAME\", \"SLIP_TYP\", \"WORK_IN_PROC_CD\", \"COMPANY_CD\", \"VEND_CD\", \"PLANT_CD\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"PROCESSING_COST\", \"MATERIAL_COST\", \"OTHER_OVERHEADS\", \"ACPT_QTY\", \"INSPC_ACPT_QTY\", \"STOCK_UNIT\", \"INSPC_ACPT_AMOUNT\", \"DISC_AMOUNT\", \"ACPT_DATE\", \"INSPC_ACPT_DATE\", \"GNR_ORG_CD\", \"PRODUCT_TYP\", \"DLV_CD\", \"SBCNT_PUCH_TYP\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"CLASIFICATION_CD\", \"INV_CTRL_FLG\", \"PUCH_RTN_FLG\", \"APPR_FLG\", \"APPR_ID\", \"APPR_DATE\", \"RESERVE_CAUSE\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_INSPC_ACPT_IF "
+"WHERE "
+"  T_INSPC_ACPT_IF.\"PUCH_ODR_CD\" = ? "
+"  AND T_INSPC_ACPT_IF.\"ACPT_NO\" = ? "
+"  AND T_INSPC_ACPT_IF.\"INSPC_ACPT_NO\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_INSPC_ACPT_IF_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_INSPC_ACPT_IF_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INSPC_ACPT_IF_read
			if(m_selcmd==null) throw new FoundationException("T_INSPC_ACPT_IF", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_INSPC_ACPT_IF_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INSPC_ACPT_IF_read2
			if(m_selcmd==null) throw new FoundationException("T_INSPC_ACPT_IF", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_INSPC_ACPT_IF_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INSPC_ACPT_IF_read3
			if(m_selcmd==null) throw new FoundationException("T_INSPC_ACPT_IF", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_INSPC_ACPT_IF_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getINSPC_ACPT_NO());
				if(isNull(data.getINSPC_ACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getINSPC_ACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setACPT_NO( getString(2, rs) );
			data.setINSPC_ACPT_NO( getString(3, rs) );
			data.setCRCT_TYP( getString(4, rs) );
			data.setITEM_CD( getString(5, rs) );
			data.setITEM_NAME( getString(6, rs) );
			data.setSLIP_TYP( getString(7, rs) );
			data.setWORK_IN_PROC_CD( getString(8, rs) );
			data.setCOMPANY_CD( getString(9, rs) );
			data.setVEND_CD( getString(10, rs) );
			data.setPLANT_CD( getString(11, rs) );
			data.setUNIT_COST( getString(12, rs) );
			data.setUNIT_COST_TYP( getString(13, rs) );
			data.setPROCESSING_COST( getString(14, rs) );
			data.setMATERIAL_COST( getString(15, rs) );
			data.setOTHER_OVERHEADS( getString(16, rs) );
			data.setACPT_QTY( getString(17, rs) );
			data.setINSPC_ACPT_QTY( getString(18, rs) );
			data.setSTOCK_UNIT( getString(19, rs) );
			data.setINSPC_ACPT_AMOUNT( getString(20, rs) );
			data.setDISC_AMOUNT( getString(21, rs) );
			data.setACPT_DATE( getString(22, rs) );
			data.setINSPC_ACPT_DATE( getString(23, rs) );
			data.setGNR_ORG_CD( getString(24, rs) );
			data.setPRODUCT_TYP( getString(25, rs) );
			data.setDLV_CD( getString(26, rs) );
			data.setSBCNT_PUCH_TYP( getString(27, rs) );
			data.setJOB_ODR_CD( getString(28, rs) );
			data.setJOB_ODR_DETAIL_NO( getString(29, rs) );
			data.setCLASIFICATION_CD( getString(30, rs) );
			data.setINV_CTRL_FLG( getString(31, rs) );
			data.setPUCH_RTN_FLG( getString(32, rs) );
			data.setAPPR_FLG( getString(33, rs) );
			data.setAPPR_ID( getString(34, rs) );
			data.setAPPR_DATE( getString(35, rs) );
			data.setRESERVE_CAUSE( getString(36, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_INSPC_ACPT_IF", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INSPC_ACPT_IF_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_INSPC_ACPT_IF_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getPUCH_ODR_CD(), stmt);
				setString(8, data.getACPT_NO(), stmt);
				setString(9, data.getINSPC_ACPT_NO(), stmt);
				setString(10, data.getCRCT_TYP(), stmt);
				setString(11, data.getITEM_CD(), stmt);
				setString(12, data.getITEM_NAME(), stmt);
				setString(13, data.getSLIP_TYP(), stmt);
				setString(14, data.getWORK_IN_PROC_CD(), stmt);
				setString(15, data.getCOMPANY_CD(), stmt);
				setString(16, data.getVEND_CD(), stmt);
				setString(17, data.getPLANT_CD(), stmt);
				setString(18, data.getUNIT_COST(), stmt);
				setString(19, data.getUNIT_COST_TYP(), stmt);
				setString(20, data.getPROCESSING_COST(), stmt);
				setString(21, data.getMATERIAL_COST(), stmt);
				setString(22, data.getOTHER_OVERHEADS(), stmt);
				setString(23, data.getACPT_QTY(), stmt);
				setString(24, data.getINSPC_ACPT_QTY(), stmt);
				setString(25, data.getSTOCK_UNIT(), stmt);
				setString(26, data.getINSPC_ACPT_AMOUNT(), stmt);
				setString(27, data.getDISC_AMOUNT(), stmt);
				setString(28, data.getACPT_DATE(), stmt);
				setString(29, data.getINSPC_ACPT_DATE(), stmt);
				setString(30, data.getGNR_ORG_CD(), stmt);
				setString(31, data.getPRODUCT_TYP(), stmt);
				setString(32, data.getDLV_CD(), stmt);
				setString(33, data.getSBCNT_PUCH_TYP(), stmt);
				setString(34, data.getJOB_ODR_CD(), stmt);
				setString(35, data.getJOB_ODR_DETAIL_NO(), stmt);
				setString(36, data.getCLASIFICATION_CD(), stmt);
				setString(37, data.getINV_CTRL_FLG(), stmt);
				setString(38, data.getPUCH_RTN_FLG(), stmt);
				setString(39, data.getAPPR_FLG(), stmt);
				setString(40, data.getAPPR_ID(), stmt);
				setString(41, data.getAPPR_DATE(), stmt);
				setString(42, data.getRESERVE_CAUSE(), stmt);

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
		public int delete(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPUCH_ODR_CD(), stmt);
				setString(2, data.getACPT_NO(), stmt);
				setString(3, data.getINSPC_ACPT_NO(), stmt);

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
			//{{user_implement_dev:T_INSPC_ACPT_IF_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_INSPC_ACPT_IF_clear

			return;
		}

		/**
		 * T_INSPC_ACPT_IFクラスの標準コンストラクタ
		 */
		public T_INSPC_ACPT_IF()
		{
			//{{user_implement_dev:T_INSPC_ACPT_IF_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_INSPC_ACPT_IF_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_DEBT_LEDGER_TRN extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_DEBT_LEDGER_TRN.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_DEBT_LEDGER_TRN.\"SLIP_TYP\" AS \"SLIP_TYP\", "
+"  T_DEBT_LEDGER_TRN.\"SLIP_CTRL_GRP\" AS \"SLIP_CTRL_GRP\", "
+"  TO_CHAR(T_DEBT_LEDGER_TRN.\"SLIP_DATE\", 'YYYY/MM/DD') AS \"SLIP_DATE\", "
+"  T_DEBT_LEDGER_TRN.\"SLIP_CD\" AS \"SLIP_CD\", "
+"  T_DEBT_LEDGER_TRN.\"SEQ_NO\" AS \"SEQ_NO\", "
+"  T_DEBT_LEDGER_TRN.\"NET_AMOUNT\" AS \"NET_AMOUNT\", "
+"  T_DEBT_LEDGER_TRN.\"NET_AMOUNT_YEN\" AS \"NET_AMOUNT_YEN\", "
+"  T_DEBT_LEDGER_H_TRN.\"CUR_CD\" AS \"CUR_CD\", "
+"  T_DEBT_LEDGER_H_TRN.\"EXCH_RATE\" AS \"EXCH_RATE\", "
+"  TO_CHAR(T_DEBT_LEDGER_H_TRN.\"INSPC_ACPT_DATE\", 'YYYY/MM/DD') AS \"INSPC_ACPT_DATE\", "
+"  T_DEBT_LEDGER_H_TRN.\"EXCH_TYP\" AS \"EXCH_TYP\", "
+"  T_DEBT_LEDGER_TRN.\"AMOUNT\" AS \"AMOUNT\" "
+"FROM "
+"  T_DEBT_LEDGER_TRN, "
+"  T_DEBT_LEDGER_H_TRN "
+"WHERE "
+"  T_DEBT_LEDGER_H_TRN.COMPANY_CD = T_DEBT_LEDGER_TRN.COMPANY_CD "
+"  AND T_DEBT_LEDGER_H_TRN.SLIP_TYP = T_DEBT_LEDGER_TRN.SLIP_TYP "
+"  AND T_DEBT_LEDGER_H_TRN.SLIP_CTRL_GRP = T_DEBT_LEDGER_TRN.SLIP_CTRL_GRP "
+"  AND T_DEBT_LEDGER_H_TRN.SLIP_DATE = T_DEBT_LEDGER_TRN.SLIP_DATE "
+"  AND T_DEBT_LEDGER_H_TRN.SLIP_CD = T_DEBT_LEDGER_TRN.SLIP_CD "
+"  AND T_DEBT_LEDGER_H_TRN.\"PUCH_ODR_CD\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"ACPT_NO\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"INSPC_ACPT_NO\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"INSPC_ACPT_CRCT_TYP\" = 2";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_DEBT_LEDGER_TRN "
+"SET "
+"  \"TAX_CD\" = ?, "
+"  \"TAX_TYP\" = ?, "
+"  \"TAX_AMOUNT\" = ?, "
+"  \"GROSS_AMOUNT\" = ?, "
+"  \"TAX_AMOUNT_YEN\" = ?, "
+"  \"GROSS_AMOUNT_YEN\" = ?, "
+"  \"NET_AMOUNT\" = ?, "
+"  \"NET_AMOUNT_YEN\" = ? "
+"WHERE "
+"  T_DEBT_LEDGER_TRN.\"COMPANY_CD\" = ? "
+"  AND T_DEBT_LEDGER_TRN.\"SLIP_TYP\" = ? "
+"  AND T_DEBT_LEDGER_TRN.\"SLIP_CTRL_GRP\" = ? "
+"  AND T_DEBT_LEDGER_TRN.\"SLIP_DATE\" = ? "
+"  AND T_DEBT_LEDGER_TRN.\"SLIP_CD\" = ? "
+"  AND T_DEBT_LEDGER_TRN.\"SEQ_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_DEBT_LEDGER_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_DEBT_LEDGER_TRN_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_TRN_read
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_TRN", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_LEDGER_TRN_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_TRN_read2
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_LEDGER_TRN_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_TRN_read3
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_LEDGER_TRN_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getINSPC_ACPT_NO());
				if(isNull(data.getINSPC_ACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getINSPC_ACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );
			data.setSLIP_TYP( getString(2, rs) );
			data.setSLIP_CTRL_GRP( getString(3, rs) );
			data.setSLIP_DATE( getString(4, rs) );
			data.setSLIP_CD( getString(5, rs) );
			data.setSEQ_NO( getString(6, rs) );
			data.setNET_AMOUNT( getString(7, rs) );
			data.setNET_AMOUNT_YEN( getString(8, rs) );
			data.setCUR_CD( getString(9, rs) );
			data.setEXCH_RATE( getString(10, rs) );
			data.setINSPC_ACPT_DATE( getString(11, rs) );
			data.setEXCH_TYP( getString(12, rs) );
			data.setAMOUNT( getString(13, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_TRN", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_TRN_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_LEDGER_TRN_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getTAX_CD(), stmt);
				setString(5, data.getTAX_TYP(), stmt);
				setString(6, data.getTAX_AMOUNT(), stmt);
				setString(7, data.getGROSS_AMOUNT(), stmt);
				setString(8, data.getTAX_AMOUNT_YEN(), stmt);
				setString(9, data.getGROSS_AMOUNT_YEN(), stmt);
				setString(10, data.getNET_AMOUNT(), stmt);
				setString(11, data.getNET_AMOUNT_YEN(), stmt);
				setString(12, data.getCOMPANY_CD(), stmt);
				setString(13, data.getSLIP_TYP(), stmt);
				setString(14, data.getSLIP_CTRL_GRP(), stmt);
				setString(15, data.getSLIP_DATE(), stmt);
				setString(16, data.getSLIP_CD(), stmt);
				setString(17, data.getSEQ_NO(), stmt);

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
			//{{user_implement_dev:T_DEBT_LEDGER_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_DEBT_LEDGER_TRN_clear

			return;
		}

		/**
		 * T_DEBT_LEDGER_TRNクラスの標準コンストラクタ
		 */
		public T_DEBT_LEDGER_TRN()
		{
			//{{user_implement_dev:T_DEBT_LEDGER_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_DEBT_LEDGER_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_DEBT_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_DEBT_LEDGER_H_TRN.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_DEBT_LEDGER_H_TRN.\"SLIP_TYP\" AS \"SLIP_TYP\", "
+"  T_DEBT_LEDGER_H_TRN.\"SLIP_CTRL_GRP\" AS \"SLIP_CTRL_GRP\", "
+"  TO_CHAR(T_DEBT_LEDGER_H_TRN.\"SLIP_DATE\", 'YYYY/MM/DD') AS \"SLIP_DATE\", "
+"  T_DEBT_LEDGER_H_TRN.\"SLIP_CD\" AS \"SLIP_CD\", "
+"  SUM(T_DEBT_LEDGER_TRN.\"TAX_AMOUNT\") AS \"SUM_TAX_AMOUNT\", "
+"  SUM(T_DEBT_LEDGER_TRN.\"GROSS_AMOUNT\") AS \"SUM_GROSS_AMOUNT\", "
+"  SUM(T_DEBT_LEDGER_TRN.\"NET_AMOUNT\") AS \"SUM_NET_AMOUNT\" "
+"FROM "
+"  T_DEBT_LEDGER_H_TRN, "
+"  T_DEBT_LEDGER_TRN "
+"WHERE "
+"  T_DEBT_LEDGER_H_TRN.COMPANY_CD = T_DEBT_LEDGER_TRN.COMPANY_CD "
+"  AND T_DEBT_LEDGER_H_TRN.SLIP_TYP = T_DEBT_LEDGER_TRN.SLIP_TYP "
+"  AND T_DEBT_LEDGER_H_TRN.SLIP_CTRL_GRP = T_DEBT_LEDGER_TRN.SLIP_CTRL_GRP "
+"  AND T_DEBT_LEDGER_H_TRN.SLIP_DATE = T_DEBT_LEDGER_TRN.SLIP_DATE "
+"  AND T_DEBT_LEDGER_H_TRN.SLIP_CD = T_DEBT_LEDGER_TRN.SLIP_CD "
+"  AND T_DEBT_LEDGER_H_TRN.\"PUCH_ODR_CD\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"ACPT_NO\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"INSPC_ACPT_NO\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"INSPC_ACPT_CRCT_TYP\" = 2 "
+"GROUP BY "
+"  T_DEBT_LEDGER_H_TRN.\"COMPANY_CD\", "
+"  T_DEBT_LEDGER_H_TRN.\"SLIP_CD\", "
+"  T_DEBT_LEDGER_H_TRN.\"SLIP_CTRL_GRP\", "
+"  T_DEBT_LEDGER_H_TRN.\"SLIP_DATE\", "
+"  T_DEBT_LEDGER_H_TRN.\"SLIP_TYP\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_DEBT_LEDGER_H_TRN "
+"SET "
+"  \"INSPC_ACPT_NO\" = ?, "
+"  \"TAX_CD\" = ?, "
+"  \"TAX_TOTAL\" = ?, "
+"  \"GROSS_TOTAL\" = ?, "
+"  \"NET_TOTAL\" = ? "
+"WHERE "
+"  T_DEBT_LEDGER_H_TRN.\"COMPANY_CD\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"SLIP_TYP\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"SLIP_CTRL_GRP\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"SLIP_DATE\" = ? "
+"  AND T_DEBT_LEDGER_H_TRN.\"SLIP_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_DEBT_LEDGER_H_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_DEBT_LEDGER_H_TRN_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_TRN_read
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_H_TRN", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_LEDGER_H_TRN_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_TRN_read2
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_H_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_LEDGER_H_TRN_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_TRN_read3
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_H_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_LEDGER_H_TRN_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getINSPC_ACPT_NO());
				if(isNull(data.getINSPC_ACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getINSPC_ACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );
			data.setSLIP_TYP( getString(2, rs) );
			data.setSLIP_CTRL_GRP( getString(3, rs) );
			data.setSLIP_DATE( getString(4, rs) );
			data.setSLIP_CD( getString(5, rs) );
			data.setSUM_TAX_AMOUNT( getString(6, rs) );
			data.setSUM_GROSS_AMOUNT( getString(7, rs) );
			data.setSUM_NET_AMOUNT( getString(8, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_H_TRN", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_TRN_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_LEDGER_H_TRN_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getINSPC_ACPT_NO(), stmt);
				setString(5, data.getTAX_CD(), stmt);
				setString(6, data.getTAX_TOTAL(), stmt);
				setString(7, data.getGROSS_TOTAL(), stmt);
				setString(8, data.getNET_TOTAL(), stmt);
				setString(9, data.getCOMPANY_CD(), stmt);
				setString(10, data.getSLIP_TYP(), stmt);
				setString(11, data.getSLIP_CTRL_GRP(), stmt);
				setString(12, data.getSLIP_DATE(), stmt);
				setString(13, data.getSLIP_CD(), stmt);

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
			//{{user_implement_dev:T_DEBT_LEDGER_H_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_DEBT_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * T_DEBT_LEDGER_H_TRNクラスの標準コンストラクタ
		 */
		public T_DEBT_LEDGER_H_TRN()
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_DEBT_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_DEBT_LEDGER extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_DEBT_LEDGER.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_DEBT_LEDGER.\"SLIP_TYP\" AS \"SLIP_TYP\", "
+"  T_DEBT_LEDGER.\"SLIP_CTRL_GRP\" AS \"SLIP_CTRL_GRP\", "
+"  TO_CHAR(T_DEBT_LEDGER.\"SLIP_DATE\", 'YYYY/MM/DD') AS \"SLIP_DATE\", "
+"  T_DEBT_LEDGER.\"SLIP_CD\" AS \"SLIP_CD\", "
+"  T_DEBT_LEDGER.\"SEQ_NO\" AS \"SEQ_NO\", "
+"  T_DEBT_LEDGER.\"LINE_NO\" AS \"LINE_NO\", "
+"  T_DEBT_LEDGER.\"LINE_TYP\" AS \"LINE_TYP\", "
+"  T_DEBT_LEDGER.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_DEBT_LEDGER.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  T_DEBT_LEDGER.\"PRODUCT_TYP\" AS \"PRODUCT_TYP\", "
+"  T_DEBT_LEDGER.\"WORK_IN_PROC_CD\" AS \"WORK_IN_PROC_CD\", "
+"  T_DEBT_LEDGER.\"TAX_CD\" AS \"TAX_CD\", "
+"  T_DEBT_LEDGER.\"TAX_TYP\" AS \"TAX_TYP\", "
+"  T_DEBT_LEDGER.\"UNIT_COST\" AS \"UNIT_COST\", "
+"  T_DEBT_LEDGER.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\", "
+"  T_DEBT_LEDGER.\"PROCESSING_COST\" AS \"PROCESSING_COST\", "
+"  T_DEBT_LEDGER.\"MATERIAL_COST\" AS \"MATERIAL_COST\", "
+"  T_DEBT_LEDGER.\"OTHER_OVERHEADS\" AS \"OTHER_OVERHEADS\", "
+"  T_DEBT_LEDGER.\"ACPT_QTY\" AS \"ACPT_QTY\", "
+"  T_DEBT_LEDGER.\"INSPC_ACPT_QTY\" AS \"INSPC_ACPT_QTY\", "
+"  T_DEBT_LEDGER.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  T_DEBT_LEDGER.\"AMOUNT\" AS \"AMOUNT\", "
+"  T_DEBT_LEDGER.\"NET_AMOUNT\" AS \"NET_AMOUNT\", "
+"  T_DEBT_LEDGER.\"TAX_AMOUNT\" AS \"TAX_AMOUNT\", "
+"  T_DEBT_LEDGER.\"GROSS_AMOUNT\" AS \"GROSS_AMOUNT\", "
+"  T_DEBT_LEDGER.\"TAX_AMOUNT_CTRL_FLG\" AS \"TAX_AMOUNT_CTRL_FLG\", "
+"  T_DEBT_LEDGER.\"UNIT_COST_YEN\" AS \"UNIT_COST_YEN\", "
+"  T_DEBT_LEDGER.\"PROCESSING_COST_YEN\" AS \"PROCESSING_COST_YEN\", "
+"  T_DEBT_LEDGER.\"MATERIAL_COST_YEN\" AS \"MATERIAL_COST_YEN\", "
+"  T_DEBT_LEDGER.\"OTHER_OVERHEADS_YEN\" AS \"OTHER_OVERHEADS_YEN\", "
+"  T_DEBT_LEDGER.\"NET_AMOUNT_YEN\" AS \"NET_AMOUNT_YEN\", "
+"  T_DEBT_LEDGER.\"TAX_AMOUNT_YEN\" AS \"TAX_AMOUNT_YEN\", "
+"  T_DEBT_LEDGER.\"GROSS_AMOUNT_YEN\" AS \"GROSS_AMOUNT_YEN\", "
+"  T_DEBT_LEDGER.\"GNR_ORG_CD\" AS \"GNR_ORG_CD\", "
+"  T_DEBT_LEDGER.\"DR_ACCT_CD\" AS \"DR_ACCT_CD\", "
+"  T_DEBT_LEDGER.\"DR_SUB_ACCT_CD\" AS \"DR_SUB_ACCT_CD\", "
+"  T_DEBT_LEDGER.\"DR_ORG_CD\" AS \"DR_ORG_CD\", "
+"  T_DEBT_LEDGER.\"CR_ACCT_CD\" AS \"CR_ACCT_CD\", "
+"  T_DEBT_LEDGER.\"CR_SUB_ACCT_CD\" AS \"CR_SUB_ACCT_CD\", "
+"  T_DEBT_LEDGER.\"CR_ORG_CD\" AS \"CR_ORG_CD\", "
+"  T_DEBT_LEDGER.\"FIXED_ASSETS_CD\" AS \"FIXED_ASSETS_CD\", "
+"  T_DEBT_LEDGER.\"SUB_FIXED_ASSETS_CD\" AS \"SUB_FIXED_ASSETS_CD\", "
+"  T_DEBT_LEDGER.\"DETAIL_NO\" AS \"DETAIL_NO\", "
+"  T_DEBT_LEDGER.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T_DEBT_LEDGER.\"JOB_ODR_DETAIL_NO\" AS \"JOB_ODR_DETAIL_NO\", "
+"  T_DEBT_LEDGER.\"SBCNT_PUCH_TYP\" AS \"SBCNT_PUCH_TYP\", "
+"  T_DEBT_LEDGER.\"INV_CTRL_FLG\" AS \"INV_CTRL_FLG\", "
+"  T_DEBT_LEDGER.\"CLASIFICATION_CD\" AS \"CLASIFICATION_CD\", "
+"  T_DEBT_LEDGER.\"COMM_PUCH_ODR_LINE_NO\" AS \"COMM_PUCH_ODR_LINE_NO\", "
+"  T_DEBT_LEDGER.\"ARV_RSLT_LINE_NO\" AS \"ARV_RSLT_LINE_NO\", "
+"  T_DEBT_LEDGER.\"STOCK_CTRL_FLG\" AS \"STOCK_CTRL_FLG\", "
+"  T_DEBT_LEDGER.\"REMARKS\" AS \"REMARKS\" "
+"FROM "
+"  T_DEBT_LEDGER "
+"WHERE "
+"  T_DEBT_LEDGER.\"COMPANY_CD\" = ? "
+"  AND T_DEBT_LEDGER.\"SLIP_TYP\" = ? "
+"  AND T_DEBT_LEDGER.\"SLIP_CTRL_GRP\" = ? "
+"  AND T_DEBT_LEDGER.\"SLIP_DATE\" = ? "
+"  AND T_DEBT_LEDGER.\"SLIP_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_DEBT_LEDGER(\"COMPANY_CD\", \"SLIP_TYP\", \"SLIP_CTRL_GRP\", \"SLIP_DATE\", \"SLIP_CD\", \"SEQ_NO\", \"LINE_NO\", \"LINE_TYP\", \"ITEM_CD\", \"ITEM_NAME\", \"PRODUCT_TYP\", \"WORK_IN_PROC_CD\", \"TAX_CD\", \"TAX_TYP\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"PROCESSING_COST\", \"MATERIAL_COST\", \"OTHER_OVERHEADS\", \"ACPT_QTY\", \"INSPC_ACPT_QTY\", \"STOCK_UNIT\", \"AMOUNT\", \"NET_AMOUNT\", \"TAX_AMOUNT\", \"GROSS_AMOUNT\", \"TAX_AMOUNT_CTRL_FLG\", \"UNIT_COST_YEN\", \"PROCESSING_COST_YEN\", \"MATERIAL_COST_YEN\", \"OTHER_OVERHEADS_YEN\", \"NET_AMOUNT_YEN\", \"TAX_AMOUNT_YEN\", \"GROSS_AMOUNT_YEN\", \"GNR_ORG_CD\", \"DR_ACCT_CD\", \"DR_SUB_ACCT_CD\", \"DR_ORG_CD\", \"CR_ACCT_CD\", \"CR_SUB_ACCT_CD\", \"CR_ORG_CD\", \"FIXED_ASSETS_CD\", \"SUB_FIXED_ASSETS_CD\", \"DETAIL_NO\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"SBCNT_PUCH_TYP\", \"INV_CTRL_FLG\", \"CLASIFICATION_CD\", \"COMM_PUCH_ODR_LINE_NO\", \"ARV_RSLT_LINE_NO\", \"STOCK_CTRL_FLG\", \"REMARKS\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_DEBT_LEDGER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_DEBT_LEDGER_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_read
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_LEDGER_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_read2
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_LEDGER_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_read3
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_LEDGER_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_TYP());
				if(isNull(data.getSLIP_TYP())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getSLIP_DATE());
				if(isNull(data.getSLIP_DATE())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_TYP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );
			data.setSLIP_TYP( getString(2, rs) );
			data.setSLIP_CTRL_GRP( getString(3, rs) );
			data.setSLIP_DATE( getString(4, rs) );
			data.setSLIP_CD( getString(5, rs) );
			data.setSEQ_NO( getString(6, rs) );
			data.setLINE_NO( getString(7, rs) );
			data.setLINE_TYP( getString(8, rs) );
			data.setITEM_CD( getString(9, rs) );
			data.setITEM_NAME( getString(10, rs) );
			data.setPRODUCT_TYP( getString(11, rs) );
			data.setWORK_IN_PROC_CD( getString(12, rs) );
			data.setTAX_CD( getString(13, rs) );
			data.setTAX_TYP( getString(14, rs) );
			data.setUNIT_COST( getString(15, rs) );
			data.setUNIT_COST_TYP( getString(16, rs) );
			data.setPROCESSING_COST( getString(17, rs) );
			data.setMATERIAL_COST( getString(18, rs) );
			data.setOTHER_OVERHEADS( getString(19, rs) );
			data.setACPT_QTY( getString(20, rs) );
			data.setINSPC_ACPT_QTY( getString(21, rs) );
			data.setSTOCK_UNIT( getString(22, rs) );
			data.setAMOUNT( getString(23, rs) );
			data.setNET_AMOUNT( getString(24, rs) );
			data.setTAX_AMOUNT( getString(25, rs) );
			data.setGROSS_AMOUNT( getString(26, rs) );
			data.setTAX_AMOUNT_CTRL_FLG( getString(27, rs) );
			data.setUNIT_COST_YEN( getString(28, rs) );
			data.setPROCESSING_COST_YEN( getString(29, rs) );
			data.setMATERIAL_COST_YEN( getString(30, rs) );
			data.setOTHER_OVERHEADS_YEN( getString(31, rs) );
			data.setNET_AMOUNT_YEN( getString(32, rs) );
			data.setTAX_AMOUNT_YEN( getString(33, rs) );
			data.setGROSS_AMOUNT_YEN( getString(34, rs) );
			data.setGNR_ORG_CD( getString(35, rs) );
			data.setDR_ACCT_CD( getString(36, rs) );
			data.setDR_SUB_ACCT_CD( getString(37, rs) );
			data.setDR_ORG_CD( getString(38, rs) );
			data.setCR_ACCT_CD( getString(39, rs) );
			data.setCR_SUB_ACCT_CD( getString(40, rs) );
			data.setCR_ORG_CD( getString(41, rs) );
			data.setFIXED_ASSETS_CD( getString(42, rs) );
			data.setSUB_FIXED_ASSETS_CD( getString(43, rs) );
			data.setDETAIL_NO( getString(44, rs) );
			data.setJOB_ODR_CD( getString(45, rs) );
			data.setJOB_ODR_DETAIL_NO( getString(46, rs) );
			data.setSBCNT_PUCH_TYP( getString(47, rs) );
			data.setINV_CTRL_FLG( getString(48, rs) );
			data.setCLASIFICATION_CD( getString(49, rs) );
			data.setCOMM_PUCH_ODR_LINE_NO( getString(50, rs) );
			data.setARV_RSLT_LINE_NO( getString(51, rs) );
			data.setSTOCK_CTRL_FLG( getString(52, rs) );
			data.setREMARKS( getString(53, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_LEDGER_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(8, data.getSLIP_TYP(), stmt);
				setString(9, data.getSLIP_CTRL_GRP(), stmt);
				setString(10, data.getSLIP_DATE(), stmt);
				setString(11, data.getSLIP_CD(), stmt);
				setString(12, data.getSEQ_NO(), stmt);
				setString(13, data.getLINE_NO(), stmt);
				setString(14, data.getLINE_TYP(), stmt);
				setString(15, data.getITEM_CD(), stmt);
				setString(16, data.getITEM_NAME(), stmt);
				setString(17, data.getPRODUCT_TYP(), stmt);
				setString(18, data.getWORK_IN_PROC_CD(), stmt);
				setString(19, data.getTAX_CD(), stmt);
				setString(20, data.getTAX_TYP(), stmt);
				setString(21, data.getUNIT_COST(), stmt);
				setString(22, data.getUNIT_COST_TYP(), stmt);
				setString(23, data.getPROCESSING_COST(), stmt);
				setString(24, data.getMATERIAL_COST(), stmt);
				setString(25, data.getOTHER_OVERHEADS(), stmt);
				setString(26, data.getACPT_QTY(), stmt);
				setString(27, data.getINSPC_ACPT_QTY(), stmt);
				setString(28, data.getSTOCK_UNIT(), stmt);
				setString(29, data.getAMOUNT(), stmt);
				setString(30, data.getNET_AMOUNT(), stmt);
				setString(31, data.getTAX_AMOUNT(), stmt);
				setString(32, data.getGROSS_AMOUNT(), stmt);
				setString(33, data.getTAX_AMOUNT_CTRL_FLG(), stmt);
				setString(34, data.getUNIT_COST_YEN(), stmt);
				setString(35, data.getPROCESSING_COST_YEN(), stmt);
				setString(36, data.getMATERIAL_COST_YEN(), stmt);
				setString(37, data.getOTHER_OVERHEADS_YEN(), stmt);
				setString(38, data.getNET_AMOUNT_YEN(), stmt);
				setString(39, data.getTAX_AMOUNT_YEN(), stmt);
				setString(40, data.getGROSS_AMOUNT_YEN(), stmt);
				setString(41, data.getGNR_ORG_CD(), stmt);
				setString(42, data.getDR_ACCT_CD(), stmt);
				setString(43, data.getDR_SUB_ACCT_CD(), stmt);
				setString(44, data.getDR_ORG_CD(), stmt);
				setString(45, data.getCR_ACCT_CD(), stmt);
				setString(46, data.getCR_SUB_ACCT_CD(), stmt);
				setString(47, data.getCR_ORG_CD(), stmt);
				setString(48, data.getFIXED_ASSETS_CD(), stmt);
				setString(49, data.getSUB_FIXED_ASSETS_CD(), stmt);
				setString(50, data.getDETAIL_NO(), stmt);
				setString(51, data.getJOB_ODR_CD(), stmt);
				setString(52, data.getJOB_ODR_DETAIL_NO(), stmt);
				setString(53, data.getSBCNT_PUCH_TYP(), stmt);
				setString(54, data.getINV_CTRL_FLG(), stmt);
				setString(55, data.getCLASIFICATION_CD(), stmt);
				setString(56, data.getCOMM_PUCH_ODR_LINE_NO(), stmt);
				setString(57, data.getARV_RSLT_LINE_NO(), stmt);
				setString(58, data.getSTOCK_CTRL_FLG(), stmt);
				setString(59, data.getREMARKS(), stmt);

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
			//{{user_implement_dev:T_DEBT_LEDGER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_DEBT_LEDGER_clear

			return;
		}

		/**
		 * T_DEBT_LEDGERクラスの標準コンストラクタ
		 */
		public T_DEBT_LEDGER()
		{
			//{{user_implement_dev:T_DEBT_LEDGER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_DEBT_LEDGER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_DEBT_LEDGER_H extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_DEBT_LEDGER_H.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_DEBT_LEDGER_H.\"SLIP_TYP\" AS \"SLIP_TYP\", "
+"  T_DEBT_LEDGER_H.\"SLIP_CTRL_GRP\" AS \"SLIP_CTRL_GRP\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"SLIP_DATE\",'YYYY/MM/DD') AS \"SLIP_DATE\", "
+"  T_DEBT_LEDGER_H.\"SLIP_CD\" AS \"SLIP_CD\", "
+"  T_DEBT_LEDGER_H.\"INSPC_ACPT_CRCT_TYP\" AS \"INSPC_ACPT_CRCT_TYP\", "
+"  T_DEBT_LEDGER_H.\"ORGN_SLIP_CTRL_GRP\" AS \"ORGN_SLIP_CTRL_GRP\", "
+"  T_DEBT_LEDGER_H.\"ORGN_SLIP_CD\" AS \"ORGN_SLIP_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"ORGN_SLIP_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"ORGN_SLIP_DATE\", "
+"  T_DEBT_LEDGER_H.\"SLIP_TRN_CD\" AS \"SLIP_TRN_CD\", "
+"  T_DEBT_LEDGER_H.\"STOCK_CLASS_CD\" AS \"STOCK_CLASS_CD\", "
+"  T_DEBT_LEDGER_H.\"BALANCE_CLASS_CD\" AS \"BALANCE_CLASS_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"INSPC_ACPT_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"INSPC_ACPT_DATE\", "
+"  T_DEBT_LEDGER_H.\"PUCH_ODR_ORG_CD\" AS \"PUCH_ODR_ORG_CD\", "
+"  T_DEBT_LEDGER_H.\"PUCH_ODR_PERSON_CD\" AS \"PUCH_ODR_PERSON_CD\", "
+"  T_DEBT_LEDGER_H.\"WH_CD\" AS \"WH_CD\", "
+"  T_DEBT_LEDGER_H.\"SHIP_WH_CD\" AS \"SHIP_WH_CD\", "
+"  T_DEBT_LEDGER_H.\"VEND_CD\" AS \"VEND_CD\", "
+"  T_DEBT_LEDGER_H.\"PAYEE_CD\" AS \"PAYEE_CD\", "
+"  T_DEBT_LEDGER_H.\"SLIP_CTRL_ORG_CD\" AS \"SLIP_CTRL_ORG_CD\", "
+"  T_DEBT_LEDGER_H.\"CLOSING_CTRL_ORG_CD\" AS \"CLOSING_CTRL_ORG_CD\", "
+"  T_DEBT_LEDGER_H.\"PAY_CALC_CTRL_ORG_CD\" AS \"PAY_CALC_CTRL_ORG_CD\", "
+"  T_DEBT_LEDGER_H.\"PAY_FIX_CTRL_ORG_CD\" AS \"PAY_FIX_CTRL_ORG_CD\", "
+"  T_DEBT_LEDGER_H.\"DLV_CD\" AS \"DLV_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"ACPT_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"ACPT_DATE\", "
+"  T_DEBT_LEDGER_H.\"EXPL_TYP\" AS \"EXPL_TYP\", "
+"  T_DEBT_LEDGER_H.\"EXPL_CD\" AS \"EXPL_CD\", "
+"  T_DEBT_LEDGER_H.\"EXPL_NAME\" AS \"EXPL_NAME\", "
+"  T_DEBT_LEDGER_H.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\", "
+"  T_DEBT_LEDGER_H.\"ACPT_NO\" AS \"ACPT_NO\", "
+"  T_DEBT_LEDGER_H.\"INSPC_ACPT_NO\" AS \"INSPC_ACPT_NO\", "
+"  T_DEBT_LEDGER_H.\"ODR_CD\" AS \"ODR_CD\", "
+"  T_DEBT_LEDGER_H.\"COMM_PUCH_ODR_SLIP_TYP\" AS \"COMM_PUCH_ODR_SLIP_TYP\", "
+"  T_DEBT_LEDGER_H.\"COMM_PUCH_ODR_SLIP_CTRL_GRP\" AS \"COMM_PUCH_ODR_SLIP_CTRL_GRP\", "
+"  T_DEBT_LEDGER_H.\"COMM_PUCH_ODR_SLIP_CD\" AS \"COMM_PUCH_ODR_SLIP_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"COMM_PUCH_ODR_SLIP_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"COMM_PUCH_ODR_SLIP_DATE\", "
+"  T_DEBT_LEDGER_H.\"ARV_RSLT_SLIP_TYP\" AS \"ARV_RSLT_SLIP_TYP\", "
+"  T_DEBT_LEDGER_H.\"ARV_RSLT_SLIP_CTRL_GRP\" AS \"ARV_RSLT_SLIP_CTRL_GRP\", "
+"  T_DEBT_LEDGER_H.\"ARV_RSLT_SLIP_CD\" AS \"ARV_RSLT_SLIP_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"ARV_RSLT_SLIP_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"ARV_RSLT_SLIP_DATE\", "
+"  T_DEBT_LEDGER_H.\"PUCH_RSLT_SLIP_ID\" AS \"PUCH_RSLT_SLIP_ID\", "
+"  T_DEBT_LEDGER_H.\"TAX_CALC_TYP\" AS \"TAX_CALC_TYP\", "
+"  T_DEBT_LEDGER_H.\"TAX_APPLY_TYP\" AS \"TAX_APPLY_TYP\", "
+"  T_DEBT_LEDGER_H.\"TAX_CD\" AS \"TAX_CD\", "
+"  T_DEBT_LEDGER_H.\"TEMP_UNIT_COST_PUCH_RSLT_FLG\" AS \"TEMP_UNIT_COST_PUCH_RSLT_FLG\", "
+"  T_DEBT_LEDGER_H.\"UNIT_COST_ZERO_INSPC_ACPT_FLG\" AS \"UNIT_COST_ZERO_INSPC_ACPT_FLG\", "
+"  T_DEBT_LEDGER_H.\"IMPORT_TRN_TYP\" AS \"IMPORT_TRN_TYP\", "
+"  T_DEBT_LEDGER_H.\"PAY_CYCLE_TYP\" AS \"PAY_CYCLE_TYP\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"DEADLINE_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"DEADLINE_DATE\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"PAY_SCH_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"PAY_SCH_DATE\", "
+"  T_DEBT_LEDGER_H.\"PAY_PATTERN_CD\" AS \"PAY_PATTERN_CD\", "
+"  T_DEBT_LEDGER_H.\"CUR_CD\" AS \"CUR_CD\", "
+"  T_DEBT_LEDGER_H.\"EXCH_TYP\" AS \"EXCH_TYP\", "
+"  T_DEBT_LEDGER_H.\"EXCH_RSRV_CD\" AS \"EXCH_RSRV_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"EXCH_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"EXCH_DATE\", "
+"  T_DEBT_LEDGER_H.\"EXCH_RATE\" AS \"EXCH_RATE\", "
+"  T_DEBT_LEDGER_H.\"NET_TOTAL\" AS \"NET_TOTAL\", "
+"  T_DEBT_LEDGER_H.\"TAX_TOTAL\" AS \"TAX_TOTAL\", "
+"  T_DEBT_LEDGER_H.\"GROSS_TOTAL\" AS \"GROSS_TOTAL\", "
+"  T_DEBT_LEDGER_H.\"PUR_RSLT_SLIP_ISSUE_FLG\" AS \"PUR_RSLT_SLIP_ISSUE_FLG\", "
+"  T_DEBT_LEDGER_H.\"PUR_RSLT_REP_ISSUE_FLG\" AS \"PUR_RSLT_REP_ISSUE_FLG\", "
+"  T_DEBT_LEDGER_H.\"ACPT_ARV_MODIFICATION_FLG\" AS \"ACPT_ARV_MODIFICATION_FLG\", "
+"  T_DEBT_LEDGER_H.\"INSPC_ACPT_MODIFICATION_FLG\" AS \"INSPC_ACPT_MODIFICATION_FLG\", "
+"  T_DEBT_LEDGER_H.\"STATUS\" AS \"STATUS\", "
+"  T_DEBT_LEDGER_H.\"CRCT_FLG\" AS \"CRCT_FLG\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"APPROVAL_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"APPROVAL_DATE\", "
+"  T_DEBT_LEDGER_H.\"APPROVAL_CD\" AS \"APPROVAL_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"APPROVAL_RSRV_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"APPROVAL_RSRV_DATE\", "
+"  T_DEBT_LEDGER_H.\"APPROVAL_RSRV_CD\" AS \"APPROVAL_RSRV_CD\", "
+"  T_DEBT_LEDGER_H.\"RSN_CD\" AS \"RSN_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"RECORDING_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"RECORDING_DATE\", "
+"  T_DEBT_LEDGER_H.\"RECORDING_MONTH\" AS \"RECORDING_MONTH\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"ORGN_RECORDING_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"ORGN_RECORDING_DATE\", "
+"  T_DEBT_LEDGER_H.\"ORGN_RECORDING_MONTH\" AS \"ORGN_RECORDING_MONTH\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"RECORDING_PROC_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"RECORDING_PROC_DATE\", "
+"  T_DEBT_LEDGER_H.\"RECORDING_PROC_CD\" AS \"RECORDING_PROC_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"CLOSING_RSRV_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"CLOSING_RSRV_DATE\", "
+"  T_DEBT_LEDGER_H.\"CLOSING_RSRV_CD\" AS \"CLOSING_RSRV_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"CLOSING_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"CLOSING_DATE\", "
+"  T_DEBT_LEDGER_H.\"CLOSING_CD\" AS \"CLOSING_CD\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"PAY_FIX_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"PAY_FIX_DATE\", "
+"  T_DEBT_LEDGER_H.\"PAY_FIX_CD\" AS \"PAY_FIX_CD\", "
+"  T_DEBT_LEDGER_H.\"DEBT_BALANCE_OUT_FLG\" AS \"DEBT_BALANCE_OUT_FLG\", "
+"  TO_CHAR(T_DEBT_LEDGER_H.\"DEBT_BALANCE_OUT_DATE\",'YYYY/MM/DD HH24:MI:SS') AS \"DEBT_BALANCE_OUT_DATE\" "
+"FROM "
+"  T_DEBT_LEDGER_H "
+"WHERE "
+"  T_DEBT_LEDGER_H.\"COMPANY_CD\" = ? "
+"  AND T_DEBT_LEDGER_H.\"SLIP_TYP\" = ? "
+"  AND T_DEBT_LEDGER_H.\"SLIP_CTRL_GRP\" = ? "
+"  AND T_DEBT_LEDGER_H.\"SLIP_DATE\" = ? "
+"  AND T_DEBT_LEDGER_H.\"SLIP_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_DEBT_LEDGER_H(\"COMPANY_CD\", \"SLIP_TYP\", \"SLIP_CTRL_GRP\", \"SLIP_DATE\", \"SLIP_CD\", \"INSPC_ACPT_CRCT_TYP\", \"ORGN_SLIP_CTRL_GRP\", \"ORGN_SLIP_CD\", \"ORGN_SLIP_DATE\", \"SLIP_TRN_CD\", \"STOCK_CLASS_CD\", \"BALANCE_CLASS_CD\", \"INSPC_ACPT_DATE\", \"PUCH_ODR_ORG_CD\", \"PUCH_ODR_PERSON_CD\", \"WH_CD\", \"SHIP_WH_CD\", \"VEND_CD\", \"PAYEE_CD\", \"SLIP_CTRL_ORG_CD\", \"CLOSING_CTRL_ORG_CD\", \"PAY_CALC_CTRL_ORG_CD\", \"PAY_FIX_CTRL_ORG_CD\", \"DLV_CD\", \"ACPT_DATE\", \"EXPL_TYP\", \"EXPL_CD\", \"EXPL_NAME\", \"PUCH_ODR_CD\", \"ACPT_NO\", \"INSPC_ACPT_NO\", \"ODR_CD\", \"COMM_PUCH_ODR_SLIP_TYP\", \"COMM_PUCH_ODR_SLIP_CTRL_GRP\", \"COMM_PUCH_ODR_SLIP_CD\", \"COMM_PUCH_ODR_SLIP_DATE\", \"ARV_RSLT_SLIP_TYP\", \"ARV_RSLT_SLIP_CTRL_GRP\", \"ARV_RSLT_SLIP_CD\", \"ARV_RSLT_SLIP_DATE\", \"PUCH_RSLT_SLIP_ID\", \"TAX_CALC_TYP\", \"TAX_APPLY_TYP\", \"TAX_CD\", \"TEMP_UNIT_COST_PUCH_RSLT_FLG\", \"UNIT_COST_ZERO_INSPC_ACPT_FLG\", \"IMPORT_TRN_TYP\", \"PAY_CYCLE_TYP\", \"DEADLINE_DATE\", \"PAY_SCH_DATE\", \"PAY_PATTERN_CD\", \"CUR_CD\", \"EXCH_TYP\", \"EXCH_RSRV_CD\", \"EXCH_DATE\", \"EXCH_RATE\", \"NET_TOTAL\", \"TAX_TOTAL\", \"GROSS_TOTAL\", \"PUR_RSLT_SLIP_ISSUE_FLG\", \"PUR_RSLT_REP_ISSUE_FLG\", \"ACPT_ARV_MODIFICATION_FLG\", \"INSPC_ACPT_MODIFICATION_FLG\", \"STATUS\", \"CRCT_FLG\", \"APPROVAL_DATE\", \"APPROVAL_CD\", \"RECORDING_DATE\", \"RECORDING_MONTH\", \"RECORDING_PROC_DATE\", \"RECORDING_PROC_CD\", \"DEBT_BALANCE_OUT_FLG\", \"DEBT_BALANCE_OUT_DATE\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, SYSDATE, ?, '1', SYSDATE)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_DEBT_LEDGER_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_DEBT_LEDGER_H_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_read
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_H", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_LEDGER_H_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_read2
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_H", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_LEDGER_H_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_read3
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_H", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_LEDGER_H_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_TYP());
				if(isNull(data.getSLIP_TYP())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getSLIP_DATE());
				if(isNull(data.getSLIP_DATE())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_TYP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );
			data.setSLIP_TYP( getString(2, rs) );
			data.setSLIP_CTRL_GRP( getString(3, rs) );
			data.setSLIP_DATE( getString(4, rs) );
			data.setSLIP_CD( getString(5, rs) );
			data.setINSPC_ACPT_CRCT_TYP( getString(6, rs) );
			data.setORGN_SLIP_CTRL_GRP( getString(7, rs) );
			data.setORGN_SLIP_CD( getString(8, rs) );
			data.setORGN_SLIP_DATE( getString(9, rs) );
			data.setSLIP_TRN_CD( getString(10, rs) );
			data.setSTOCK_CLASS_CD( getString(11, rs) );
			data.setBALANCE_CLASS_CD( getString(12, rs) );
			data.setINSPC_ACPT_DATE( getString(13, rs) );
			data.setPUCH_ODR_ORG_CD( getString(14, rs) );
			data.setPUCH_ODR_PERSON_CD( getString(15, rs) );
			data.setWH_CD( getString(16, rs) );
			data.setSHIP_WH_CD( getString(17, rs) );
			data.setVEND_CD( getString(18, rs) );
			data.setPAYEE_CD( getString(19, rs) );
			data.setSLIP_CTRL_ORG_CD( getString(20, rs) );
			data.setCLOSING_CTRL_ORG_CD( getString(21, rs) );
			data.setPAY_CALC_CTRL_ORG_CD( getString(22, rs) );
			data.setPAY_FIX_CTRL_ORG_CD( getString(23, rs) );
			data.setDLV_CD( getString(24, rs) );
			data.setACPT_DATE( getString(25, rs) );
			data.setEXPL_TYP( getString(26, rs) );
			data.setEXPL_CD( getString(27, rs) );
			data.setEXPL_NAME( getString(28, rs) );
			data.setPUCH_ODR_CD( getString(29, rs) );
			data.setACPT_NO( getString(30, rs) );
			data.setINSPC_ACPT_NO( getString(31, rs) );
			data.setODR_CD( getString(32, rs) );
			data.setCOMM_PUCH_ODR_SLIP_TYP( getString(33, rs) );
			data.setCOMM_PUCH_ODR_SLIP_CTRL_GRP( getString(34, rs) );
			data.setCOMM_PUCH_ODR_SLIP_CD( getString(35, rs) );
			data.setCOMM_PUCH_ODR_SLIP_DATE( getString(36, rs) );
			data.setARV_RSLT_SLIP_TYP( getString(37, rs) );
			data.setARV_RSLT_SLIP_CTRL_GRP( getString(38, rs) );
			data.setARV_RSLT_SLIP_CD( getString(39, rs) );
			data.setARV_RSLT_SLIP_DATE( getString(40, rs) );
			data.setPUCH_RSLT_SLIP_ID( getString(41, rs) );
			data.setTAX_CALC_TYP( getString(42, rs) );
			data.setTAX_APPLY_TYP( getString(43, rs) );
			data.setTAX_CD( getString(44, rs) );
			data.setTEMP_UNIT_COST_PUCH_RSLT_FLG( getString(45, rs) );
			data.setUNIT_COST_ZERO_INSPC_ACPT_FLG( getString(46, rs) );
			data.setIMPORT_TRN_TYP( getString(47, rs) );
			data.setPAY_CYCLE_TYP( getString(48, rs) );
			data.setDEADLINE_DATE( getString(49, rs) );
			data.setPAY_SCH_DATE( getString(50, rs) );
			data.setPAY_PATTERN_CD( getString(51, rs) );
			data.setCUR_CD( getString(52, rs) );
			data.setEXCH_TYP( getString(53, rs) );
			data.setEXCH_RSRV_CD( getString(54, rs) );
			data.setEXCH_DATE( getString(55, rs) );
			data.setEXCH_RATE( getString(56, rs) );
			data.setNET_TOTAL( getString(57, rs) );
			data.setTAX_TOTAL( getString(58, rs) );
			data.setGROSS_TOTAL( getString(59, rs) );
			data.setPUR_RSLT_SLIP_ISSUE_FLG( getString(60, rs) );
			data.setPUR_RSLT_REP_ISSUE_FLG( getString(61, rs) );
			data.setACPT_ARV_MODIFICATION_FLG( getString(62, rs) );
			data.setINSPC_ACPT_MODIFICATION_FLG( getString(63, rs) );
			data.setSTATUS( getString(64, rs) );
			data.setCRCT_FLG( getString(65, rs) );
			data.setAPPROVAL_DATE( getString(66, rs) );
			data.setAPPROVAL_CD( getString(67, rs) );
			data.setAPPROVAL_RSRV_DATE( getString(68, rs) );
			data.setAPPROVAL_RSRV_CD( getString(69, rs) );
			data.setRSN_CD( getString(70, rs) );
			data.setRECORDING_DATE( getString(71, rs) );
			data.setRECORDING_MONTH( getString(72, rs) );
			data.setORGN_RECORDING_DATE( getString(73, rs) );
			data.setORGN_RECORDING_MONTH( getString(74, rs) );
			data.setRECORDING_PROC_DATE( getString(75, rs) );
			data.setRECORDING_PROC_CD( getString(76, rs) );
			data.setCLOSING_RSRV_DATE( getString(77, rs) );
			data.setCLOSING_RSRV_CD( getString(78, rs) );
			data.setCLOSING_DATE( getString(79, rs) );
			data.setCLOSING_CD( getString(80, rs) );
			data.setPAY_FIX_DATE( getString(81, rs) );
			data.setPAY_FIX_CD( getString(82, rs) );
			data.setDEBT_BALANCE_OUT_FLG( getString(83, rs) );
			data.setDEBT_BALANCE_OUT_DATE( getString(84, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_DEBT_LEDGER_H", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_LEDGER_H_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(8, data.getSLIP_TYP(), stmt);
				setString(9, data.getSLIP_CTRL_GRP(), stmt);
				setString(10, data.getSLIP_DATE(), stmt);
				setString(11, data.getSLIP_CD(), stmt);
				setString(12, data.getINSPC_ACPT_CRCT_TYP(), stmt);
				setString(13, data.getORGN_SLIP_CTRL_GRP(), stmt);
				setString(14, data.getORGN_SLIP_CD(), stmt);
				setString(15, data.getORGN_SLIP_DATE(), stmt);
				setString(16, data.getSLIP_TRN_CD(), stmt);
				setString(17, data.getSTOCK_CLASS_CD(), stmt);
				setString(18, data.getBALANCE_CLASS_CD(), stmt);
				setString(19, data.getINSPC_ACPT_DATE(), stmt);
				setString(20, data.getPUCH_ODR_ORG_CD(), stmt);
				setString(21, data.getPUCH_ODR_PERSON_CD(), stmt);
				setString(22, data.getWH_CD(), stmt);
				setString(23, data.getSHIP_WH_CD(), stmt);
				setString(24, data.getVEND_CD(), stmt);
				setString(25, data.getPAYEE_CD(), stmt);
				setString(26, data.getSLIP_CTRL_ORG_CD(), stmt);
				setString(27, data.getCLOSING_CTRL_ORG_CD(), stmt);
				setString(28, data.getPAY_CALC_CTRL_ORG_CD(), stmt);
				setString(29, data.getPAY_FIX_CTRL_ORG_CD(), stmt);
				setString(30, data.getDLV_CD(), stmt);
				setString(31, data.getACPT_DATE(), stmt);
				setString(32, data.getEXPL_TYP(), stmt);
				setString(33, data.getEXPL_CD(), stmt);
				setString(34, data.getEXPL_NAME(), stmt);
				setString(35, data.getPUCH_ODR_CD(), stmt);
				setString(36, data.getACPT_NO(), stmt);
				setString(37, data.getINSPC_ACPT_NO(), stmt);
				setString(38, data.getODR_CD(), stmt);
				setString(39, data.getCOMM_PUCH_ODR_SLIP_TYP(), stmt);
				setString(40, data.getCOMM_PUCH_ODR_SLIP_CTRL_GRP(), stmt);
				setString(41, data.getCOMM_PUCH_ODR_SLIP_CD(), stmt);
				setString(42, data.getCOMM_PUCH_ODR_SLIP_DATE(), stmt);
				setString(43, data.getARV_RSLT_SLIP_TYP(), stmt);
				setString(44, data.getARV_RSLT_SLIP_CTRL_GRP(), stmt);
				setString(45, data.getARV_RSLT_SLIP_CD(), stmt);
				setString(46, data.getARV_RSLT_SLIP_DATE(), stmt);
				setString(47, data.getPUCH_RSLT_SLIP_ID(), stmt);
				setString(48, data.getTAX_CALC_TYP(), stmt);
				setString(49, data.getTAX_APPLY_TYP(), stmt);
				setString(50, data.getTAX_CD(), stmt);
				setString(51, data.getTEMP_UNIT_COST_PUCH_RSLT_FLG(), stmt);
				setString(52, data.getUNIT_COST_ZERO_INSPC_ACPT_FLG(), stmt);
				setString(53, data.getIMPORT_TRN_TYP(), stmt);
				setString(54, data.getPAY_CYCLE_TYP(), stmt);
				setString(55, data.getDEADLINE_DATE(), stmt);
				setString(56, data.getPAY_SCH_DATE(), stmt);
				setString(57, data.getPAY_PATTERN_CD(), stmt);
				setString(58, data.getCUR_CD(), stmt);
				setString(59, data.getEXCH_TYP(), stmt);
				setString(60, data.getEXCH_RSRV_CD(), stmt);
				setString(61, data.getEXCH_DATE(), stmt);
				setString(62, data.getEXCH_RATE(), stmt);
				setString(63, data.getNET_TOTAL(), stmt);
				setString(64, data.getTAX_TOTAL(), stmt);
				setString(65, data.getGROSS_TOTAL(), stmt);
				setString(66, data.getPUR_RSLT_SLIP_ISSUE_FLG(), stmt);
				setString(67, data.getPUR_RSLT_REP_ISSUE_FLG(), stmt);
				setString(68, data.getACPT_ARV_MODIFICATION_FLG(), stmt);
				setString(69, data.getINSPC_ACPT_MODIFICATION_FLG(), stmt);
				setString(70, data.getSTATUS(), stmt);
				setString(71, data.getCRCT_FLG(), stmt);
				setString(72, data.getAPPROVAL_DATE(), stmt);
				setString(73, data.getAPPROVAL_CD(), stmt);
				setString(74, data.getRECORDING_DATE(), stmt);
				setString(75, data.getRECORDING_MONTH(), stmt);
				setString(76, data.getRECORDING_PROC_CD(), stmt);

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
			//{{user_implement_dev:T_DEBT_LEDGER_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_DEBT_LEDGER_H_clear

			return;
		}

		/**
		 * T_DEBT_LEDGER_Hクラスの標準コンストラクタ
		 */
		public T_DEBT_LEDGER_H()
		{
			//{{user_implement_dev:T_DEBT_LEDGER_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_DEBT_LEDGER_H_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_DEBT_BALANCE_D extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_DEBT_BALANCE_D(\"COMPANY_CD\", \"SLIP_TYP\", \"SLIP_CTRL_GRP\", \"SLIP_DATE\", \"SLIP_CD\", \"SEQ_NO\", \"LINE_NO\", \"LINE_TYP\", \"INSPC_ACPT_CRCT_TYP\", \"ORGN_SLIP_CTRL_GRP\", \"ORGN_SLIP_CD\", \"ORGN_SLIP_DATE\", \"SLIP_TRN_CD\", \"BALANCE_CLASS_CD\", \"INSPC_ACPT_DATE\", \"RECORDING_DATE\", \"MONTH\", \"ACCT_CD\", \"SUB_ACCT_CD\", \"ORG_CD\", \"CUR_CD\", \"PAYEE_CD\", \"DATA_TYP\", \"DR_ACCT_CD\", \"DR_SUB_ACCT_CD\", \"DR_ORG_CD\", \"GNR_ORG_CD\", \"VEND_CD\", \"EXPL_TYP\", \"EXPL_CD\", \"EXPL_NAME\", \"PAY_CYCLE_TYP\", \"DEADLINE_DATE\", \"PAY_SCH_DATE\", \"EXCH_TYP\", \"EXCH_RSRV_CD\", \"EXCH_DATE\", \"EXCH_RATE\", \"ITEM_CD\", \"ITEM_NAME\", \"PRODUCT_TYP\", \"WORK_IN_PROC_CD\", \"TAX_CD\", \"TAX_TYP\", \"UNIT_COST\", \"INSPC_ACPT_QTY\", \"STOCK_UNIT\", \"NET_AMOUNT\", \"TAX_AMOUNT\", \"GROSS_AMOUNT\", \"NET_AMOUNT_YEN\", \"TAX_AMOUNT_YEN\", \"GROSS_AMOUNT_YEN\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"CLASIFICATION_CD\", \"REMARKS\", \"STATUS\", \"GL_IF_OUT_FLG\", \"BALANCE_UPD_FLG\", \"BALANCE_UPD_DATE\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?,'YYYY/MM/DD HH24:MI:SS'))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_DEBT_BALANCE_D_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_DEBT_BALANCE_D_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(8, data.getSLIP_TYP(), stmt);
				setString(9, data.getSLIP_CTRL_GRP(), stmt);
				setString(10, data.getSLIP_DATE(), stmt);
				setString(11, data.getSLIP_CD(), stmt);
				setString(12, data.getSEQ_NO(), stmt);
				setString(13, data.getLINE_NO(), stmt);
				setString(14, data.getLINE_TYP(), stmt);
				setString(15, data.getINSPC_ACPT_CRCT_TYP(), stmt);
				setString(16, data.getORGN_SLIP_CTRL_GRP(), stmt);
				setString(17, data.getORGN_SLIP_CD(), stmt);
				setString(18, data.getORGN_SLIP_DATE(), stmt);
				setString(19, data.getSLIP_TRN_CD(), stmt);
				setString(20, data.getBALANCE_CLASS_CD(), stmt);
				setString(21, data.getINSPC_ACPT_DATE(), stmt);
				setString(22, data.getRECORDING_DATE(), stmt);
				setString(23, data.getMONTH(), stmt);
				setString(24, data.getACCT_CD(), stmt);
				setString(25, data.getSUB_ACCT_CD(), stmt);
				setString(26, data.getORG_CD(), stmt);
				setString(27, data.getCUR_CD(), stmt);
				setString(28, data.getPAYEE_CD(), stmt);
				setString(29, data.getDATA_TYP(), stmt);
				setString(30, data.getDR_ACCT_CD(), stmt);
				setString(31, data.getDR_SUB_ACCT_CD(), stmt);
				setString(32, data.getDR_ORG_CD(), stmt);
				setString(33, data.getGNR_ORG_CD(), stmt);
				setString(34, data.getVEND_CD(), stmt);
				setString(35, data.getEXPL_TYP(), stmt);
				setString(36, data.getEXPL_CD(), stmt);
				setString(37, data.getEXPL_NAME(), stmt);
				setString(38, data.getPAY_CYCLE_TYP(), stmt);
				setString(39, data.getDEADLINE_DATE(), stmt);
				setString(40, data.getPAY_SCH_DATE(), stmt);
				setString(41, data.getEXCH_TYP(), stmt);
				setString(42, data.getEXCH_RSRV_CD(), stmt);
				setString(43, data.getEXCH_DATE(), stmt);
				setString(44, data.getEXCH_RATE(), stmt);
				setString(45, data.getITEM_CD(), stmt);
				setString(46, data.getITEM_NAME(), stmt);
				setString(47, data.getPRODUCT_TYP(), stmt);
				setString(48, data.getWORK_IN_PROC_CD(), stmt);
				setString(49, data.getTAX_CD(), stmt);
				setString(50, data.getTAX_TYP(), stmt);
				setString(51, data.getUNIT_COST(), stmt);
				setString(52, data.getINSPC_ACPT_QTY(), stmt);
				setString(53, data.getSTOCK_UNIT(), stmt);
				setString(54, data.getNET_AMOUNT(), stmt);
				setString(55, data.getTAX_AMOUNT(), stmt);
				setString(56, data.getGROSS_AMOUNT(), stmt);
				setString(57, data.getNET_AMOUNT_YEN(), stmt);
				setString(58, data.getTAX_AMOUNT_YEN(), stmt);
				setString(59, data.getGROSS_AMOUNT_YEN(), stmt);
				setString(60, data.getJOB_ODR_CD(), stmt);
				setString(61, data.getJOB_ODR_DETAIL_NO(), stmt);
				setString(62, data.getCLASIFICATION_CD(), stmt);
				setString(63, data.getREMARKS(), stmt);
				setString(64, data.getSTATUS(), stmt);
				setString(65, data.getGL_IF_OUT_FLG(), stmt);
				setString(66, data.getBALANCE_UPD_FLG(), stmt);
				setString(67, data.getBALANCE_UPD_DATE(), stmt);

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
			//{{user_implement_dev:T_DEBT_BALANCE_D_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_DEBT_BALANCE_D_clear

			return;
		}

		/**
		 * T_DEBT_BALANCE_Dクラスの標準コンストラクタ
		 */
		public T_DEBT_BALANCE_D()
		{
			//{{user_implement_dev:T_DEBT_BALANCE_D_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_DEBT_BALANCE_D_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_DEBT_BALANCE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_DEBT_BALANCE.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_DEBT_BALANCE.\"MONTH\" AS \"MONTH\", "
+"  T_DEBT_BALANCE.\"ACCT_CD\" AS \"ACCT_CD\", "
+"  T_DEBT_BALANCE.\"SUB_ACCT_CD\" AS \"SUB_ACCT_CD\", "
+"  T_DEBT_BALANCE.\"ORG_CD\" AS \"ORG_CD\", "
+"  T_DEBT_BALANCE.\"CUR_CD\" AS \"CUR_CD\", "
+"  T_DEBT_BALANCE.\"PAYEE_CD\" AS \"PAYEE_CD\", "
+"  T_DEBT_BALANCE.\"RECORDING_AMOUNT\" AS \"RECORDING_AMOUNT\", "
+"  T_DEBT_BALANCE.\"NET_AMOUNT\" AS \"NET_AMOUNT\", "
+"  T_DEBT_BALANCE.\"TAX_AMOUNT\" AS \"TAX_AMOUNT\", "
+"  T_DEBT_BALANCE.\"DEBT_AMOUNT\" AS \"DEBT_AMOUNT\", "
+"  T_DEBT_BALANCE.\"SAVING_AMOUNT\" AS \"SAVING_AMOUNT\", "
+"  T_DEBT_BALANCE.\"REBATE_AMOUNT\" AS \"REBATE_AMOUNT\", "
+"  T_DEBT_BALANCE.\"RETURNED_GOODS_AMOUNT\" AS \"RETURNED_GOODS_AMOUNT\", "
+"  T_DEBT_BALANCE.\"INSPC_ACPT_AMOUNT\" AS \"INSPC_ACPT_AMOUNT\", "
+"  T_DEBT_BALANCE.\"RECORDING_AMOUNT_YEN\" AS \"RECORDING_AMOUNT_YEN\", "
+"  T_DEBT_BALANCE.\"NET_AMOUNT_YEN\" AS \"NET_AMOUNT_YEN\", "
+"  T_DEBT_BALANCE.\"TAX_AMOUNT_YEN\" AS \"TAX_AMOUNT_YEN\", "
+"  T_DEBT_BALANCE.\"DEBT_AMOUNT_YEN\" AS \"DEBT_AMOUNT_YEN\", "
+"  T_DEBT_BALANCE.\"SAVING_AMOUNT_YEN\" AS \"SAVING_AMOUNT_YEN\", "
+"  T_DEBT_BALANCE.\"REBATE_AMOUNT_YEN\" AS \"REBATE_AMOUNT_YEN\", "
+"  T_DEBT_BALANCE.\"RETURNED_GOODS_AMOUNT_YEN\" AS \"RETURNED_GOODS_AMOUNT_YEN\", "
+"  T_DEBT_BALANCE.\"INSPC_ACPT_AMOUNT_YEN\" AS \"INSPC_ACPT_AMOUNT_YEN\", "
+"  T_DEBT_BALANCE.\"EXCH_DIFF_AMOUNT_YEN\" AS \"EXCH_DIFF_AMOUNT_YEN\" "
+"FROM "
+"  T_DEBT_BALANCE "
+"WHERE "
+"  T_DEBT_BALANCE.\"COMPANY_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"MONTH\" = ? "
+"  AND T_DEBT_BALANCE.\"ACCT_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"SUB_ACCT_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"ORG_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"CUR_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"PAYEE_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_DEBT_BALANCE "
+"SET "
+"  \"RECORDING_AMOUNT\" = ?, "
+"  \"NET_AMOUNT\" = ?, "
+"  \"TAX_AMOUNT\" = ?, "
+"  \"DEBT_AMOUNT\" = ?, "
+"  \"SAVING_AMOUNT\" = ?, "
+"  \"REBATE_AMOUNT\" = ?, "
+"  \"RETURNED_GOODS_AMOUNT\" = ?, "
+"  \"INSPC_ACPT_AMOUNT\" = ?, "
+"  \"RECORDING_AMOUNT_YEN\" = ?, "
+"  \"NET_AMOUNT_YEN\" = ?, "
+"  \"TAX_AMOUNT_YEN\" = ?, "
+"  \"DEBT_AMOUNT_YEN\" = ?, "
+"  \"SAVING_AMOUNT_YEN\" = ?, "
+"  \"REBATE_AMOUNT_YEN\" = ?, "
+"  \"RETURNED_GOODS_AMOUNT_YEN\" = ?, "
+"  \"INSPC_ACPT_AMOUNT_YEN\" = ?, "
+"  \"EXCH_DIFF_AMOUNT_YEN\" = ? "
+"WHERE "
+"  T_DEBT_BALANCE.\"COMPANY_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"MONTH\" = ? "
+"  AND T_DEBT_BALANCE.\"ACCT_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"SUB_ACCT_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"ORG_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"CUR_CD\" = ? "
+"  AND T_DEBT_BALANCE.\"PAYEE_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0170010";
		protected String m_sUpdateProgramName="AE0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_DEBT_BALANCE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_DEBT_BALANCE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_BALANCE_read
			if(m_selcmd==null) throw new FoundationException("T_DEBT_BALANCE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_BALANCE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_BALANCE_read2
			if(m_selcmd==null) throw new FoundationException("T_DEBT_BALANCE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_BALANCE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_BALANCE_read3
			if(m_selcmd==null) throw new FoundationException("T_DEBT_BALANCE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_DEBT_BALANCE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getMONTH());
				if(isNull(data.getMONTH())) isNull = true;
				ary.addElement(data.getACCT_CD());
				if(isNull(data.getACCT_CD())) isNull = true;
				ary.addElement(data.getSUB_ACCT_CD());
				if(isNull(data.getSUB_ACCT_CD())) isNull = true;
				ary.addElement(data.getORG_CD());
				if(isNull(data.getORG_CD())) isNull = true;
				ary.addElement(data.getCUR_CD());
				if(isNull(data.getCUR_CD())) isNull = true;
				ary.addElement(data.getPAYEE_CD());
				if(isNull(data.getPAYEE_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getMONTH(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACCT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSUB_ACCT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getORG_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPAYEE_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );
			data.setMONTH( getString(2, rs) );
			data.setACCT_CD( getString(3, rs) );
			data.setSUB_ACCT_CD( getString(4, rs) );
			data.setORG_CD( getString(5, rs) );
			data.setCUR_CD( getString(6, rs) );
			data.setPAYEE_CD( getString(7, rs) );
			data.setRECORDING_AMOUNT( getString(8, rs) );
			data.setNET_AMOUNT( getString(9, rs) );
			data.setTAX_AMOUNT( getString(10, rs) );
			data.setDEBT_AMOUNT( getString(11, rs) );
			data.setSAVING_AMOUNT( getString(12, rs) );
			data.setREBATE_AMOUNT( getString(13, rs) );
			data.setRETURNED_GOODS_AMOUNT( getString(14, rs) );
			data.setINSPC_ACPT_AMOUNT( getString(15, rs) );
			data.setRECORDING_AMOUNT_YEN( getString(16, rs) );
			data.setNET_AMOUNT_YEN( getString(17, rs) );
			data.setTAX_AMOUNT_YEN( getString(18, rs) );
			data.setDEBT_AMOUNT_YEN( getString(19, rs) );
			data.setSAVING_AMOUNT_YEN( getString(20, rs) );
			data.setREBATE_AMOUNT_YEN( getString(21, rs) );
			data.setRETURNED_GOODS_AMOUNT_YEN( getString(22, rs) );
			data.setINSPC_ACPT_AMOUNT_YEN( getString(23, rs) );
			data.setEXCH_DIFF_AMOUNT_YEN( getString(24, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_DEBT_BALANCE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_DEBT_BALANCE_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_DEBT_BALANCE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getRECORDING_AMOUNT(), stmt);
				setString(5, data.getNET_AMOUNT(), stmt);
				setString(6, data.getTAX_AMOUNT(), stmt);
				setString(7, data.getDEBT_AMOUNT(), stmt);
				setString(8, data.getSAVING_AMOUNT(), stmt);
				setString(9, data.getREBATE_AMOUNT(), stmt);
				setString(10, data.getRETURNED_GOODS_AMOUNT(), stmt);
				setString(11, data.getINSPC_ACPT_AMOUNT(), stmt);
				setString(12, data.getRECORDING_AMOUNT_YEN(), stmt);
				setString(13, data.getNET_AMOUNT_YEN(), stmt);
				setString(14, data.getTAX_AMOUNT_YEN(), stmt);
				setString(15, data.getDEBT_AMOUNT_YEN(), stmt);
				setString(16, data.getSAVING_AMOUNT_YEN(), stmt);
				setString(17, data.getREBATE_AMOUNT_YEN(), stmt);
				setString(18, data.getRETURNED_GOODS_AMOUNT_YEN(), stmt);
				setString(19, data.getINSPC_ACPT_AMOUNT_YEN(), stmt);
				setString(20, data.getEXCH_DIFF_AMOUNT_YEN(), stmt);
				setString(21, data.getCOMPANY_CD(), stmt);
				setString(22, data.getMONTH(), stmt);
				setString(23, data.getACCT_CD(), stmt);
				setString(24, data.getSUB_ACCT_CD(), stmt);
				setString(25, data.getORG_CD(), stmt);
				setString(26, data.getCUR_CD(), stmt);
				setString(27, data.getPAYEE_CD(), stmt);

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
			//{{user_implement_dev:T_DEBT_BALANCE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_DEBT_BALANCE_clear

			return;
		}

		/**
		 * T_DEBT_BALANCEクラスの標準コンストラクタ
		 */
		public T_DEBT_BALANCE()
		{
			//{{user_implement_dev:T_DEBT_BALANCE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_DEBT_BALANCE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class check_SYS_INSTALL_OPTIONS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  OPTION_ID "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  OPTION_ID = ? "
+"  AND INSTALL_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_SYS_INSTALL_OPTIONS_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:check_SYS_INSTALL_OPTIONS_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_SYS_INSTALL_OPTIONS_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:check_SYS_INSTALL_OPTIONS_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOPTION_ID());
				if(isNull(data.getOPTION_ID())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOPTION_ID(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_SYS_INSTALL_OPTIONS_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:check_SYS_INSTALL_OPTIONS_clear

			return;
		}

		/**
		 * check_SYS_INSTALL_OPTIONSクラスの標準コンストラクタ
		 */
		public check_SYS_INSTALL_OPTIONS()
		{
			//{{user_implement_dev:check_SYS_INSTALL_OPTIONS_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:check_SYS_INSTALL_OPTIONS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class get_SYS_DEBT_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_DEBT_CTRL.\"OWN_CUR_CD\" AS \"OWN_CUR_CD\", "
+"  SYS_DEBT_CTRL.\"THIS_MONTH\" AS \"THIS_MONTH\" "
+"FROM "
+"  SYS_DEBT_CTRL "
+"WHERE "
+"  SYS_DEBT_CTRL.\"COMPANY_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:get_SYS_DEBT_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:get_SYS_DEBT_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_SYS_DEBT_CTRL_read
			if(m_selcmd==null) throw new FoundationException("get_SYS_DEBT_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_SYS_DEBT_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_SYS_DEBT_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("get_SYS_DEBT_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_SYS_DEBT_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_SYS_DEBT_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("get_SYS_DEBT_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_SYS_DEBT_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setOWN_CUR_CD( getString(1, rs) );
			data.setTHIS_MONTH( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("get_SYS_DEBT_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_SYS_DEBT_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_SYS_DEBT_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:get_SYS_DEBT_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:get_SYS_DEBT_CTRL_clear

			return;
		}

		/**
		 * get_SYS_DEBT_CTRLクラスの標準コンストラクタ
		 */
		public get_SYS_DEBT_CTRL()
		{
			//{{user_implement_dev:get_SYS_DEBT_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:get_SYS_DEBT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class get_HOME_DECIMAL_FIG extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_CUR.\"DECIMAL_FIG\" AS \"DECIMAL_FIG\" "
+"FROM "
+"  M_CUR "
+"WHERE "
+"  M_CUR.\"CUR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:get_HOME_DECIMAL_FIG_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:get_HOME_DECIMAL_FIG_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_HOME_DECIMAL_FIG_read
			if(m_selcmd==null) throw new FoundationException("get_HOME_DECIMAL_FIG", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_HOME_DECIMAL_FIG_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_HOME_DECIMAL_FIG_read2
			if(m_selcmd==null) throw new FoundationException("get_HOME_DECIMAL_FIG", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_HOME_DECIMAL_FIG_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_HOME_DECIMAL_FIG_read3
			if(m_selcmd==null) throw new FoundationException("get_HOME_DECIMAL_FIG", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_HOME_DECIMAL_FIG_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCUR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setHOME_DECIMAL_FIG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("get_HOME_DECIMAL_FIG", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_HOME_DECIMAL_FIG_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_HOME_DECIMAL_FIG_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:get_HOME_DECIMAL_FIG_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:get_HOME_DECIMAL_FIG_clear

			return;
		}

		/**
		 * get_HOME_DECIMAL_FIGクラスの標準コンストラクタ
		 */
		public get_HOME_DECIMAL_FIG()
		{
			//{{user_implement_dev:get_HOME_DECIMAL_FIG_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:get_HOME_DECIMAL_FIG_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class get_SYS_HOME_CUR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_HOME_CUR.\"HOME_CUR_CD\" AS \"HOME_CUR_CD\" "
+"FROM "
+"  SYS_HOME_CUR "
+"WHERE "
+"  SYS_HOME_CUR.\"CTRL_CD\" = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:get_SYS_HOME_CUR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:get_SYS_HOME_CUR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_SYS_HOME_CUR_read
			if(m_selcmd==null) throw new FoundationException("get_SYS_HOME_CUR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_SYS_HOME_CUR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_SYS_HOME_CUR_read2
			if(m_selcmd==null) throw new FoundationException("get_SYS_HOME_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_SYS_HOME_CUR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_SYS_HOME_CUR_read3
			if(m_selcmd==null) throw new FoundationException("get_SYS_HOME_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_SYS_HOME_CUR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setHOME_CUR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("get_SYS_HOME_CUR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_SYS_HOME_CUR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_SYS_HOME_CUR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:get_SYS_HOME_CUR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:get_SYS_HOME_CUR_clear

			return;
		}

		/**
		 * get_SYS_HOME_CURクラスの標準コンストラクタ
		 */
		public get_SYS_HOME_CUR()
		{
			//{{user_implement_dev:get_SYS_HOME_CUR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:get_SYS_HOME_CUR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getModifyCount_T_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_RLSD_PUCH_ODR.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\" "
+"FROM "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_read
			if(m_selcmd==null) throw new FoundationException("getModifyCount_T_RLSD_PUCH_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_read2
			if(m_selcmd==null) throw new FoundationException("getModifyCount_T_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_read3
			if(m_selcmd==null) throw new FoundationException("getModifyCount_T_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getModifyCount_T_RLSD_PUCH_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * getModifyCount_T_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public getModifyCount_T_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getModifyCount_T_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getModifyCount_T_ACPT_RSLT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ACPT_RSLT.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\" "
+"FROM "
+"  T_ACPT_RSLT "
+"WHERE "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  AND T_ACPT_RSLT.\"ACPT_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getModifyCount_T_ACPT_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getModifyCount_T_ACPT_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getModifyCount_T_ACPT_RSLT_read
			if(m_selcmd==null) throw new FoundationException("getModifyCount_T_ACPT_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getModifyCount_T_ACPT_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getModifyCount_T_ACPT_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("getModifyCount_T_ACPT_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getModifyCount_T_ACPT_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getModifyCount_T_ACPT_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("getModifyCount_T_ACPT_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getModifyCount_T_ACPT_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getModifyCount_T_ACPT_RSLT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getModifyCount_T_ACPT_RSLT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getModifyCount_T_ACPT_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getModifyCount_T_ACPT_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getModifyCount_T_ACPT_RSLT_clear

			return;
		}

		/**
		 * getModifyCount_T_ACPT_RSLTクラスの標準コンストラクタ
		 */
		public getModifyCount_T_ACPT_RSLT()
		{
			//{{user_implement_dev:getModifyCount_T_ACPT_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getModifyCount_T_ACPT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class get_M_PLANT_SCM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PLANT.\"COMPANY_CD\" AS \"COMPANY_CD\" "
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

		//{{user_implement_dev:get_M_PLANT_SCM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:get_M_PLANT_SCM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_M_PLANT_SCM_read
			if(m_selcmd==null) throw new FoundationException("get_M_PLANT_SCM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_M_PLANT_SCM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_M_PLANT_SCM_read2
			if(m_selcmd==null) throw new FoundationException("get_M_PLANT_SCM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_M_PLANT_SCM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_M_PLANT_SCM_read3
			if(m_selcmd==null) throw new FoundationException("get_M_PLANT_SCM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_M_PLANT_SCM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("get_M_PLANT_SCM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_M_PLANT_SCM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_M_PLANT_SCM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:get_M_PLANT_SCM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:get_M_PLANT_SCM_clear

			return;
		}

		/**
		 * get_M_PLANT_SCMクラスの標準コンストラクタ
		 */
		public get_M_PLANT_SCM()
		{
			//{{user_implement_dev:get_M_PLANT_SCM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:get_M_PLANT_SCM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class check_T_INSPC_ACPT_IF extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_INSPC_ACPT_IF.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\" "
+"FROM "
+"  T_INSPC_ACPT_IF "
+"WHERE "
+"  T_INSPC_ACPT_IF.\"PUCH_ODR_CD\" = ? "
+"  AND T_INSPC_ACPT_IF.\"AI_AP_IF_FLG\" = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_INSPC_ACPT_IF_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:check_T_INSPC_ACPT_IF_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_INSPC_ACPT_IF_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:check_T_INSPC_ACPT_IF_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:check_T_INSPC_ACPT_IF_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:check_T_INSPC_ACPT_IF_clear

			return;
		}

		/**
		 * check_T_INSPC_ACPT_IFクラスの標準コンストラクタ
		 */
		public check_T_INSPC_ACPT_IF()
		{
			//{{user_implement_dev:check_T_INSPC_ACPT_IF_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:check_T_INSPC_ACPT_IF_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class check_T_DEBT_BALANCE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_VEND_CTRL.\"VEND_CD\" AS \"VEND_CD\" "
+"FROM "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_VEND_CTRL.\"COMPANY_CD\" = ? "
+"  AND M_VEND_CTRL.\"VEND_CD\" = ? "
+"  AND M_VEND_CTRL.\"BALANCE_CTRL_FLG\" = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_DEBT_BALANCE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:check_T_DEBT_BALANCE_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_DEBT_BALANCE_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:check_T_DEBT_BALANCE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_T_DEBT_BALANCE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:check_T_DEBT_BALANCE_clear

			return;
		}

		/**
		 * check_T_DEBT_BALANCEクラスの標準コンストラクタ
		 */
		public check_T_DEBT_BALANCE()
		{
			//{{user_implement_dev:check_T_DEBT_BALANCE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:check_T_DEBT_BALANCE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class read_T_DEBT_LEDGER extends DataObject
	{
		protected String m_selcmd = "SELECT DISTINCT "
+"  T_DEBT_LEDGER.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_DEBT_LEDGER.\"SLIP_TYP\" AS \"SLIP_TYP\", "
+"  T_DEBT_LEDGER.\"SLIP_CTRL_GRP\" AS \"SLIP_CTRL_GRP\", "
+"  TO_CHAR(T_DEBT_LEDGER.\"SLIP_DATE\", 'YYYY/MM/DD') AS \"SLIP_DATE\", "
+"  T_DEBT_LEDGER.\"SLIP_CD\" AS \"SLIP_CD\" "
+"FROM "
+"  T_DEBT_LEDGER, "
+"  T_DEBT_LEDGER_H "
+"WHERE "
+"  T_DEBT_LEDGER_H.COMPANY_CD = T_DEBT_LEDGER.COMPANY_CD "
+"  AND T_DEBT_LEDGER_H.SLIP_TYP = T_DEBT_LEDGER.SLIP_TYP "
+"  AND T_DEBT_LEDGER_H.SLIP_CTRL_GRP = T_DEBT_LEDGER.SLIP_CTRL_GRP "
+"  AND T_DEBT_LEDGER_H.SLIP_DATE = T_DEBT_LEDGER.SLIP_DATE "
+"  AND T_DEBT_LEDGER_H.SLIP_CD = T_DEBT_LEDGER.SLIP_CD "
+"  AND T_DEBT_LEDGER_H.\"PUCH_ODR_CD\" = ? "
+"  AND T_DEBT_LEDGER_H.\"ACPT_NO\" = ? "
+"  AND T_DEBT_LEDGER_H.\"INSPC_ACPT_NO\" = ? "
+"  AND T_DEBT_LEDGER_H.\"INSPC_ACPT_CRCT_TYP\" = 2";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:read_T_DEBT_LEDGER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:read_T_DEBT_LEDGER_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_DEBT_LEDGER_read
			if(m_selcmd==null) throw new FoundationException("read_T_DEBT_LEDGER", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_T_DEBT_LEDGER_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_DEBT_LEDGER_read2
			if(m_selcmd==null) throw new FoundationException("read_T_DEBT_LEDGER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:read_T_DEBT_LEDGER_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_DEBT_LEDGER_read3
			if(m_selcmd==null) throw new FoundationException("read_T_DEBT_LEDGER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:read_T_DEBT_LEDGER_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getINSPC_ACPT_NO());
				if(isNull(data.getINSPC_ACPT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getINSPC_ACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0170010Struct data = new AE0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );
			data.setSLIP_TYP( getString(2, rs) );
			data.setSLIP_CTRL_GRP( getString(3, rs) );
			data.setSLIP_DATE( getString(4, rs) );
			data.setSLIP_CD( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("read_T_DEBT_LEDGER", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_DEBT_LEDGER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_T_DEBT_LEDGER_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:read_T_DEBT_LEDGER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:read_T_DEBT_LEDGER_clear

			return;
		}

		/**
		 * read_T_DEBT_LEDGERクラスの標準コンストラクタ
		 */
		public read_T_DEBT_LEDGER()
		{
			//{{user_implement_dev:read_T_DEBT_LEDGER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:read_T_DEBT_LEDGER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_TIME_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  PARA.VALUE "
+"FROM "
+"  SYS_PARAMETER PARA "
+"WHERE "
+"  PARA.NAME = 'TIME_CTRL' "
+"  AND(PARA.VALUE = 'true' "
+"  OR  PARA.VALUE = 'TRUE')";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_TIME_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_TIME_CTRL_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

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
		public boolean check(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
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

	// null文字列、空白文字列の場合にtrueを返します
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * クリーンナップ用メソッド
	 *
	 */
	public void clear()
	{
		mread_T_RLSD_PUCH_ODR.clear();
		mread_T_RLSD_PUCH_ODR = null;
		mread_T_ACPT_RSLT.clear();
		mread_T_ACPT_RSLT = null;
		mget_COMPANY_CD.clear();
		mget_COMPANY_CD = null;
		mcheck_T_DEBT_LEDGER_H_TRN.clear();
		mcheck_T_DEBT_LEDGER_H_TRN = null;
		mcheck_T_DEBT_LEDGER_H1.clear();
		mcheck_T_DEBT_LEDGER_H1 = null;
		mcheck_T_DEBT_LEDGER_H2.clear();
		mcheck_T_DEBT_LEDGER_H2 = null;
		mget_M_TAX.clear();
		mget_M_TAX = null;
		mupdate_T_RLSD_PUCH_ODR.clear();
		mupdate_T_RLSD_PUCH_ODR = null;
		mupdate_T_ACPT_RSLT.clear();
		mupdate_T_ACPT_RSLT = null;
		mT_PAST_INSPC_ACPT.clear();
		mT_PAST_INSPC_ACPT = null;
		mT_INSPC_ACPT_IF.clear();
		mT_INSPC_ACPT_IF = null;
		mT_DEBT_LEDGER_TRN.clear();
		mT_DEBT_LEDGER_TRN = null;
		mT_DEBT_LEDGER_H_TRN.clear();
		mT_DEBT_LEDGER_H_TRN = null;
		mT_DEBT_LEDGER.clear();
		mT_DEBT_LEDGER = null;
		mT_DEBT_LEDGER_H.clear();
		mT_DEBT_LEDGER_H = null;
		mT_DEBT_BALANCE_D.clear();
		mT_DEBT_BALANCE_D = null;
		mT_DEBT_BALANCE.clear();
		mT_DEBT_BALANCE = null;
		mcheck_SYS_INSTALL_OPTIONS.clear();
		mcheck_SYS_INSTALL_OPTIONS = null;
		mget_SYS_DEBT_CTRL.clear();
		mget_SYS_DEBT_CTRL = null;
		mget_HOME_DECIMAL_FIG.clear();
		mget_HOME_DECIMAL_FIG = null;
		mget_SYS_HOME_CUR.clear();
		mget_SYS_HOME_CUR = null;
		mgetModifyCount_T_RLSD_PUCH_ODR.clear();
		mgetModifyCount_T_RLSD_PUCH_ODR = null;
		mgetModifyCount_T_ACPT_RSLT.clear();
		mgetModifyCount_T_ACPT_RSLT = null;
		mget_M_PLANT_SCM.clear();
		mget_M_PLANT_SCM = null;
		mcheck_T_INSPC_ACPT_IF.clear();
		mcheck_T_INSPC_ACPT_IF = null;
		mcheck_T_DEBT_BALANCE.clear();
		mcheck_T_DEBT_BALANCE = null;
		mread_T_DEBT_LEDGER.clear();
		mread_T_DEBT_LEDGER = null;
		mSELECT_TIME_CTRL.clear();
		mSELECT_TIME_CTRL = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AE0170010クラスの標準コンストラクタ
	 */
	public AE0170010Entity() throws FoundationException
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
