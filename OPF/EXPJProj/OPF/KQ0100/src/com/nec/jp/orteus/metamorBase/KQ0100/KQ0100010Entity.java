/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0100/src/com/nec/jp/orteus/metamorBase/KQ0100/KQ0100010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0100;

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
 * CLASS     : KQ0100010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class KQ0100010Entity extends DataObject
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

	// select_Headクラス インスタンス
	public select_Head mselect_Head = new select_Head();

	// select_Detailクラス インスタンス
	public select_Detail mselect_Detail = new select_Detail();

	// getCompanyInfoクラス インスタンス
	public getCompanyInfo mgetCompanyInfo = new getCompanyInfo();

	// getOptionIdクラス インスタンス
	public getOptionId mgetOptionId = new getOptionId();

	// getSYUKA_LTクラス インスタンス
	public getSYUKA_LT mgetSYUKA_LT = new getSYUKA_LT();

	// getSLIP_CTRL_GRPクラス インスタンス
	public getSLIP_CTRL_GRP mgetSLIP_CTRL_GRP = new getSLIP_CTRL_GRP();

	// get_TAX_CDクラス インスタンス
	public get_TAX_CD mget_TAX_CD = new get_TAX_CD();

	// T_ODRクラス インスタンス
	public T_ODR mT_ODR = new T_ODR();

	// T_ODR_ACPT_RSLTクラス インスタンス
	public T_ODR_ACPT_RSLT mT_ODR_ACPT_RSLT = new T_ODR_ACPT_RSLT();

	// T_SHIP_SLIPクラス インスタンス
	public T_SHIP_SLIP mT_SHIP_SLIP = new T_SHIP_SLIP();

	// T_SALESクラス インスタンス
	public T_SALES mT_SALES = new T_SALES();

	// deleteT_SALESクラス インスタンス
	public deleteT_SALES mdeleteT_SALES = new deleteT_SALES();

	// select_Head_Slipクラス インスタンス
	public select_Head_Slip mselect_Head_Slip = new select_Head_Slip();

	// selectCntクラス インスタンス
	public selectCnt mselectCnt = new selectCnt();

	// T_SHIP_ODRクラス インスタンス
	public T_SHIP_ODR mT_SHIP_ODR = new T_SHIP_ODR();

	// T_SHIPクラス インスタンス
	public T_SHIP mT_SHIP = new T_SHIP();

	// SelectT_AR_LEDGER_H_TRNクラス インスタンス
	public SelectT_AR_LEDGER_H_TRN mSelectT_AR_LEDGER_H_TRN = new SelectT_AR_LEDGER_H_TRN();

	// updateT_AR_LEDGER_TRNクラス インスタンス
	public updateT_AR_LEDGER_TRN mupdateT_AR_LEDGER_TRN = new updateT_AR_LEDGER_TRN();

	// selectT_AR_LEDGER_TRNクラス インスタンス
	public selectT_AR_LEDGER_TRN mselectT_AR_LEDGER_TRN = new selectT_AR_LEDGER_TRN();

	// updateT_AR_LEDGER_H_TRNクラス インスタンス
	public updateT_AR_LEDGER_H_TRN mupdateT_AR_LEDGER_H_TRN = new updateT_AR_LEDGER_H_TRN();

	// updateT_AR_LEDGERクラス インスタンス
	public updateT_AR_LEDGER mupdateT_AR_LEDGER = new updateT_AR_LEDGER();

	// selectT_AR_LEDGERクラス インスタンス
	public selectT_AR_LEDGER mselectT_AR_LEDGER = new selectT_AR_LEDGER();

	// updateT_AR_LEDGER_Hクラス インスタンス
	public updateT_AR_LEDGER_H mupdateT_AR_LEDGER_H = new updateT_AR_LEDGER_H();

	// selectCnt1クラス インスタンス
	public selectCnt1 mselectCnt1 = new selectCnt1();

	// selectDetail1クラス インスタンス
	public selectDetail1 mselectDetail1 = new selectDetail1();

	// SELECT_T_AR_LEDGER_TRN_FORクラス インスタンス
	public SELECT_T_AR_LEDGER_TRN_FOR mSELECT_T_AR_LEDGER_TRN_FOR = new SELECT_T_AR_LEDGER_TRN_FOR();

	// SELECT_T_AR_LEDGER_FORクラス インスタンス
	public SELECT_T_AR_LEDGER_FOR mSELECT_T_AR_LEDGER_FOR = new SELECT_T_AR_LEDGER_FOR();

	// SELECT_MODIFY_COUNTクラス インスタンス
	public SELECT_MODIFY_COUNT mSELECT_MODIFY_COUNT = new SELECT_MODIFY_COUNT();


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
		String m_write_fname="KQ0100010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="KQ0100010";

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
	public class select_Head extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ODR.ODR_NO, "
+"  ODR.CUST_ODR_NO, "
+"  CTL.ITEM_CD, "
+"  CTL.ITEM_NAME, "
+"  CTL.CUST_CD, "
+"  CUST.CUST_NAME, "
+"  CTL.CUST_ITEM_CD, "
+"  CTL.CUST_ITEM_NAME, "
+"  TO_CHAR(ODR.ODR_ACPT_DATE, 'YYYY/MM/DD'), "
+"  TO_CHAR(ODR.DESINATED_DLV_DATE, 'YYYY/MM/DD'), "
+"  ODR.ODR_UNIT_PRICE, "
+"  CUR.CUR_UNIT, "
+"  ODR.ODR_QTY, "
+"  ODR.TAX_CD, "
+"  ODR.ODR_AMOUNT, "
+"  CUR.CUR_UNIT, "
+"  CUST.INSPC_ACPT_TYP, "
+"  ODR.CURRNCY_CD, "
+"  ODR.EXCH_TYP, "
+"  CUST.PRICE_ROUND_TYP, "
+"  BASE.TRANSPORT_LT, "
+"  WH.PLANT_CD, "
+"  ODR.MODIFY_COUNT "
+"FROM "
+"  T_ODR_CTL CTL, "
+"  T_ODR ODR, "
+"  M_CUST CUST, "
+"  M_CUST_BASE BASE, "
+"  M_CUR CUR, "
+"  M_WH WH, "
+"  M_ITEM_SPEC SPEC "
+"WHERE "
+"  ODR.ODR_CTL_NO = CTL.ODR_CTL_NO "
+"  AND CTL.CUST_CD = CUST.CUST_CD "
+"  AND CUST.COMPANY_CD = ? "
+"  AND CTL.CUST_CD = BASE.CUST_CD "
+"  AND ODR.DLV_LOC_CD = BASE.DLV_LOC_CD "
+"  AND BASE.COMPANY_CD = ? "
+"  AND ODR.CURRNCY_CD = CUR.CUR_CD "
+"  AND BASE.SHIP_WH_CD = WH.WH_CD "
+"  AND CTL.CUST_CD = SPEC.CUST_CD "
+"  AND CTL.CUST_ITEM_CD = SPEC.CUST_ITEM_CD "
+"  AND SPEC.DEPO_TYP <> '20' "
+"  AND ODR.DEL_FLG = '0' "
+"  AND CTL.DEL_FLG = '0' "
+"  AND ODR.ODR_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_Head_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:select_Head_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Head_read
			if(m_selcmd==null) throw new FoundationException("select_Head", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_Head_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Head_read2
			if(m_selcmd==null) throw new FoundationException("select_Head", "read", "クエリー未登録");
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
                        //}}user_implement_dev:select_Head_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Head_read3
			if(m_selcmd==null) throw new FoundationException("select_Head", "read", "クエリー未登録");
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
                        //}}user_implement_dev:select_Head_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getODR_NO());
				if(isNull(data.getODR_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("select_Head", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getODR_NO())) setString(no ++, data.getODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.seth_ODR_NO( getString(1, rs) );
			data.setCUST_ODR_NO( getString(2, rs) );
			data.setITEM_CD( getString(3, rs) );
			data.setITEM_NAME( getString(4, rs) );
			data.setCUST_CD( getString(5, rs) );
			data.setCUST_NAME( getString(6, rs) );
			data.setCUST_ITEM_CD( getString(7, rs) );
			data.setCUST_ITEM_NAME( getString(8, rs) );
			data.setODR_ACPT_DATE( getString(9, rs) );
			data.setDESINATED_DLV_DATE( getString(10, rs) );
			data.setODR_UNIT_PRICE( getString(11, rs) );
			data.setODR_UNIT_CD( getString(12, rs) );
			data.setODR_QTY( getString(13, rs) );
			data.setTAX_CD( getString(14, rs) );
			data.setODR_AMOUNT( getString(15, rs) );
			data.setODR_AMOUNT_UNIT_CD( getString(16, rs) );
			data.seth_INSPC_ACPT_TYP( getString(17, rs) );
			data.seth_CURRNCY_CD( getString(18, rs) );
			data.seth_EXCH_TYP( getString(19, rs) );
			data.seth_PRICE_ROUND_TYP( getString(20, rs) );
			data.seth_TRANSPORT_LT( getString(21, rs) );
			data.setPLANT_CD( getString(22, rs) );
			data.seth_MODIFY_COUNT( getString(23, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select_Head", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Head_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_Head_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_Head_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:select_Head_clear

			return;
		}

		/**
		 * select_Headクラスの標準コンストラクタ
		 */
		public select_Head()
		{
			//{{user_implement_dev:select_Head_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:select_Head_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class select_Detail extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ODR.ODR_NO AS ODR_ODR_NO, "
+"  COALESCE(SHIP.JOB_ODR_CD, SHIP_ODR.JOB_ODR_CD, ALC.JOB_ODR_CD) AS JOB_ODR_CD, "
+"  DLV.PART_DLV_SEQ_NO AS PART_DLV_SEQ_NO, "
+"  DLV.ODR_NO AS DLV_ODR_NO, "
+"  SHIP_ODR.SLIP_CD AS SHIP_ODR_SLIP_CD, "
+"  TO_CHAR(SHIP_ODR.DESINATED_SHIP_DATE, 'YYYY/MM/DD') AS DESINATED_SHIP_DATE, "
+"  TO_CHAR(SHIP_ODR.SCDL_DLV_DATE, 'YYYY/MM/DD') AS SCDL_DLV_DATE, "
+"  SHIP_ODR.SHIP_ODR_NO AS SHIP_ODR_NO, "
+"  SHIP_ODR.SHIP_ODR_AMOUNT AS ODR_AMOUNT, "
+"  TO_CHAR(SHIP.SHIP_DATE, 'YYYY/MM/DD') AS SHIP_DATE, "
+"  SHIP.SHIP_ODR_AMOUNT AS SHIP_ODR_AMOUNT, "
+"  SHIP.SHIP_SEQ_NO AS SHIP_SEQ_NO, "
+"  TO_CHAR(SALES.SALES_DATE, 'YYYY/MM/DD') AS SALES_DATE, "
+"  SALES.SALES_AMOUNT AS SALES_AMOUNT, "
+"  SALES.AI_AR_IF_FLG AS AI_AR_IF_FLG, "
+"  SALES.SALES_SEQ_NO AS SALES_SEQ_NO, "
+"  SALES.SLIP_CD AS SALES_SLIP_CD, "
+"  SALES.STATUS AS STATUS, "
+"  AR.SLIP_CD AS AR_SLIP_CD, "
+"  AR_TRN.SLIP_CD AS AR_TRN_SLIP_CD, "
+"  SHIP.SHIP_SEQ_NO AS SHIP_SEQ_NO, "
+"  TO_CHAR(SALES.INSPC_ACPT_DATE, 'YYYY/MM/DD') AS INSPC_ACPT_DATE, "
+"  TO_CHAR(AR_D.INSPC_ACPT_DATE, 'YYYY/MM/DD') AS AR_INSPC_ACPT_DATE, "
+"  AR_D.SALES_AMOUNT AS AR_SALES_AMOUNT, "
+"  TO_CHAR(AR_TRN_D.INSPC_ACPT_DATE, 'YYYY/MM/DD') AS AR_TRN_INSPC_ACPT_DATE, "
+"  AR_TRN_D.SALES_AMOUNT AS AR_TRN_SALES_AMOUNT, "
+"  AR.STATUS AS AR_STATUS, "
+"  AR_TRN.STATUS AS AR_TRN_STATUS "
+"FROM "
+"  T_ODR ODR, "
+"  T_ANS_DLV_DATE DLV, "
+"  T_JOB_ODR_ODR_ALC ALC, "
+"  T_SHIP_ODR SHIP_ODR, "
+"  T_SHIP SHIP, "
+"  T_SALES SALES, "
+"  T_AR_LEDGER_H AR, "
+"  T_AR_LEDGER_H_TRN AR_TRN, "
+"  T_AR_LEDGER AR_D, "
+"  T_AR_LEDGER_TRN AR_TRN_D "
+"WHERE "
+"  ODR.ODR_NO = ? "
+"  AND ODR.DEL_FLG = '0' "
+"  AND ODR.ODR_NO = DLV.ODR_NO(+) "
+"  AND DLV.DEL_FLG(+) = '0' "
+"  AND ODR.ODR_NO = ALC.ODR_NO(+) "
+"  AND DLV.ODR_NO = SHIP_ODR.ODR_NO(+) "
+"  AND DLV.PART_DLV_SEQ_NO = SHIP_ODR.PART_DLV_SEQ_NO(+) "
+"  AND SHIP_ODR.DEL_FLG(+) = '0' "
+"  AND SHIP_ODR.SLIP_CD = SHIP.SLIP_CD(+) "
+"  AND SHIP.DEL_FLG(+) = '0' "
+"  AND SHIP.SLIP_CD = SALES.SLIP_CD(+) "
+"  AND SALES.DEL_FLG(+) = '0' "
+"  AND SALES.SLIP_CD = AR.SLIP_CD(+) "
+"  AND SALES.SLIP_CD = AR_TRN.SLIP_CD(+) "
+"  AND AR.COMPANY_CD(+) = ? "
+"  AND AR.SLIP_CTRL_GRP(+) = ? "
+"  AND AR.SLIP_TYP(+) = '14' "
+"  AND AR.INSPC_ACPT_CRCT_TYP(+) = '2' "
+"  AND AR_TRN.COMPANY_CD(+) = ? "
+"  AND AR_TRN.SLIP_CTRL_GRP(+) = ? "
+"  AND AR_TRN.SLIP_TYP(+) = '14' "
+"  AND AR_TRN.INSPC_ACPT_CRCT_TYP(+) = '2' "
+"  AND AR_D.COMPANY_CD(+) = ? "
+"  AND AR_D.SLIP_CTRL_GRP(+) = ? "
+"  AND AR_D.SLIP_TYP(+) = '14' "
+"  AND AR_D.SLIP_CD(+) = SALES.SLIP_CD "
+"  AND AR_D.SEQ_NO(+) = 1 "
+"  AND AR_TRN_D.COMPANY_CD(+) = ? "
+"  AND AR_TRN_D.SLIP_CTRL_GRP(+) = ? "
+"  AND AR_TRN_D.SLIP_TYP(+) = '14' "
+"  AND AR_TRN_D.SLIP_CD(+) = SALES.SLIP_CD "
+"  AND AR_TRN_D.SEQ_NO(+) = 1 "
+"ORDER BY "
+"  DLV.PART_DLV_SEQ_NO, "
+"  SHIP_ODR.SLIP_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_Detail_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:select_Detail_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Detail_read
			if(m_selcmd==null) throw new FoundationException("select_Detail", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_Detail_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Detail_read2
			if(m_selcmd==null) throw new FoundationException("select_Detail", "read", "クエリー未登録");
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
                        //}}user_implement_dev:select_Detail_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Detail_read3
			if(m_selcmd==null) throw new FoundationException("select_Detail", "read", "クエリー未登録");
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
                        //}}user_implement_dev:select_Detail_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_ODR_NO());
				if(isNull(data.geth_ODR_NO())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("select_Detail", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.geth_ODR_NO())) setString(no ++, data.geth_ODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CTRL_GRP())) setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CTRL_GRP())) setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CTRL_GRP())) setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CTRL_GRP())) setString(no ++, data.getSLIP_CTRL_GRP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setl_ODR_ODR_NO( getString(1, rs) );
			data.setl_JOB_ODR_CD( getString(2, rs) );
			data.setl_PART_DLV_SEQ_NO( getString(3, rs) );
			data.setl_DLV_ODR_NO( getString(4, rs) );
			data.setl_SHIP_ODR_SLIP_CD( getString(5, rs) );
			data.setl_DESINATED_SHIP_DATE( getString(6, rs) );
			data.setl_SCDL_DLV_DATE( getString(7, rs) );
			data.setl_SHIP_ODR_NO( getString(8, rs) );
			data.setl_ODR_AMOUNT( getString(9, rs) );
			data.setl_SHIP_DATE( getString(10, rs) );
			data.setl_SHIP_ODR_AMOUNT( getString(11, rs) );
			data.setl_SHIP_SEQ_NO( getString(12, rs) );
			data.setl_SALES_DATE( getString(13, rs) );
			data.setl_SALES_AMOUNT( getString(14, rs) );
			data.setl_AI_AR_IF_FLG( getString(15, rs) );
			data.setl_SALES_SEQ_NO( getString(16, rs) );
			data.setl_SALES_SLIP_CD( getString(17, rs) );
			data.setl_SALES_STATUS( getString(18, rs) );
			data.setl_AR_SLIP_CD( getString(19, rs) );
			data.setl_AR_TRN_SLIP_CD( getString(20, rs) );
			data.setl_SHIP_SEQ_NO( getString(21, rs) );
			data.setl_h_INSPC_ACPT_DATE( getString(22, rs) );
			data.setl_h_AR_INSPC_ACPT_DATE( getString(23, rs) );
			data.setl_h_AR_SALES_AMOUNT( getString(24, rs) );
			data.setl_h_AR_TRN_INSPC_ACPT_DATE( getString(25, rs) );
			data.setl_h_AR_TRN_SALES_AMOUNT( getString(26, rs) );
			data.setAR_STATUS( getString(27, rs) );
			data.setAR_TRN_STATUS( getString(28, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select_Detail", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Detail_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_Detail_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_Detail_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:select_Detail_clear

			return;
		}

		/**
		 * select_Detailクラスの標準コンストラクタ
		 */
		public select_Detail()
		{
			//{{user_implement_dev:select_Detail_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:select_Detail_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getCompanyInfo extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_MY_COMPANY.COMPANY_CD AS COMPANY_CD "
+"FROM "
+"  SYS_MY_COMPANY "
+"WHERE "
+"  SYS_MY_COMPANY.CTRL_CD = 'SYSTEM'";
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
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
	public class getOptionId extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  OPTION_ID "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  INSTALL_FLG = '1' "
+"AND OPTION_ID LIKE ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getOptionId_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getOptionId_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getOptionId_read
			if(m_selcmd==null) throw new FoundationException("getOptionId", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getOptionId_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getOptionId_read2
			if(m_selcmd==null) throw new FoundationException("getOptionId", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getOptionId_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getOptionId_read3
			if(m_selcmd==null) throw new FoundationException("getOptionId", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getOptionId_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOPTION_ID(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setOPTION_ID( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getOptionId", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getOptionId_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getOptionId_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getOptionId_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getOptionId_clear

			return;
		}

		/**
		 * getOptionIdクラスの標準コンストラクタ
		 */
		public getOptionId()
		{
			//{{user_implement_dev:getOptionId_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getOptionId_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getSYUKA_LT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_CLASS_CODE.CODE AS CODE "
+"FROM "
+"  SYS_CLASS_CODE "
+"WHERE "
+"  SYS_CLASS_CODE.SYS_CLASS = 'SALES' "
+"  AND SYS_CLASS_CODE.CLASS_CODE = 'SHIP_LT'";
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
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_read
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setCODE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYUKA_LT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
	public class getSLIP_CTRL_GRP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SLIP_CTRL_GRP "
+"FROM "
+"  SYS_AR_CTRL "
+"WHERE "
+"  COMPANY_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSLIP_CTRL_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getSLIP_CTRL_GRP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSLIP_CTRL_GRP_read
			if(m_selcmd==null) throw new FoundationException("getSLIP_CTRL_GRP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSLIP_CTRL_GRP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSLIP_CTRL_GRP_read2
			if(m_selcmd==null) throw new FoundationException("getSLIP_CTRL_GRP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getSLIP_CTRL_GRP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSLIP_CTRL_GRP_read3
			if(m_selcmd==null) throw new FoundationException("getSLIP_CTRL_GRP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getSLIP_CTRL_GRP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setSLIP_CTRL_GRP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSLIP_CTRL_GRP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSLIP_CTRL_GRP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSLIP_CTRL_GRP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSLIP_CTRL_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getSLIP_CTRL_GRP_clear

			return;
		}

		/**
		 * getSLIP_CTRL_GRPクラスの標準コンストラクタ
		 */
		public getSLIP_CTRL_GRP()
		{
			//{{user_implement_dev:getSLIP_CTRL_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getSLIP_CTRL_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class get_TAX_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TAX_CD "
+"FROM "
+"  M_TAX "
+"WHERE "
+"  TAX_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:get_TAX_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:get_TAX_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_TAX_CD_read
			if(m_selcmd==null) throw new FoundationException("get_TAX_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_TAX_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_TAX_CD_read2
			if(m_selcmd==null) throw new FoundationException("get_TAX_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_TAX_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_TAX_CD_read3
			if(m_selcmd==null) throw new FoundationException("get_TAX_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:get_TAX_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getTAX_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setTAX_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("get_TAX_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_TAX_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_TAX_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:get_TAX_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:get_TAX_CD_clear

			return;
		}

		/**
		 * get_TAX_CDクラスの標準コンストラクタ
		 */
		public get_TAX_CD()
		{
			//{{user_implement_dev:get_TAX_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:get_TAX_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_ODR "
+"SET "
+"  TAX_CD = ? "
+"WHERE "
+"  ODR_NO = ? "
+"  AND DEL_FLG = '0'";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ODR_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(5, data.geth_ODR_NO(), stmt);

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
			//{{user_implement_dev:T_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ODR_clear

			return;
		}

		/**
		 * T_ODRクラスの標準コンストラクタ
		 */
		public T_ODR()
		{
			//{{user_implement_dev:T_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ODR_ACPT_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_ODR_ACPT_RSLT(RSLT_CTL_SEQ_CD, ODR_CTL_NO, ODR_NO, CUST_ODR_NO, ODR_TYP, CUST_CD, CUST_ITEM_CD, ITEM_CD, DESINATED_DLV_DATE, ODR_QTY, UNIT, DLV_PLACE_CD, UNIT_PRICE, CUR_CD, SPCL_PRICE_CO, DEPO_TYP, CUST_DLV_CD, CUST_DLV_KEY_CD, REMARKS, CUST_CHRG_PSN_CD, ODR_ACPT_PSN_CD, IF_CTL_NO, ODR_SEQ, ODR_ACPT_DATE, TAX_CD, CREATED_DATE, CREATED_BY, CREATED_PRG_NM, UPDATED_DATE, UPDATED_BY, UPDATED_PRG_NM, MODIFY_COUNT) "
+"SELECT "
+"  SEQ_RSLT_ODR.NEXTVAL, "
+"  ODR.ODR_CTL_NO, "
+"  ODR.ODR_NO, "
+"  ODR.CUST_ODR_NO, "
+"  ODR.ODR_TYP, "
+"  CTL.CUST_CD, "
+"  CTL.CUST_ITEM_CD, "
+"  CTL.ITEM_CD, "
+"  ODR.DESINATED_DLV_DATE, "
+"  ODR.ODR_QTY, "
+"  ODR.UNIT_CD, "
+"  ODR.DLV_LOC_CD, "
+"  ODR.ODR_UNIT_PRICE, "
+"  ODR.CURRNCY_CD, "
+"  ODR.SPCL_PRICE_TYP, "
+"  ODR.DEPO_TYP, "
+"  ODR.CUS_DLV_CD, "
+"  ODR.CUS_DLV_KEY_CD, "
+"  ODR.REMARKS, "
+"  ODR.CUST_CHRG_PSN_CD, "
+"  ODR.ODR_ACPT_PSN_CD, "
+"  NULL, "
+"  NULL, "
+"  ODR.ODR_ACPT_DATE, "
+"  ODR.TAX_CD, "
+"  SYSDATE, "
+"  ?, "
+"  ?, "
+"  SYSDATE, "
+"  ?, "
+"  ?, "
+"  0 "
+"FROM "
+"  T_ODR ODR, "
+"  T_ODR_CTL CTL "
+"WHERE "
+"  ODR.ODR_NO = ? "
+"  AND ODR.ODR_CTL_NO = CTL.ODR_CTL_NO "
+"  AND ODR.DEL_FLG = '0' "
+"  AND CTL.DEL_FLG = '0'";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ODR_ACPT_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ODR_ACPT_RSLT_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_inscmd);

				setString(1, data.getCREATED_BY(), stmt);
				setString(2, data.getCREATED_PRG_NM(), stmt);
				setString(3, data.getCREATED_BY(), stmt);
				setString(4, data.getCREATED_PRG_NM(), stmt);
				setString(5, data.geth_ODR_NO(), stmt);

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
			//{{user_implement_dev:T_ODR_ACPT_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ODR_ACPT_RSLT_clear

			return;
		}

		/**
		 * T_ODR_ACPT_RSLTクラスの標準コンストラクタ
		 */
		public T_ODR_ACPT_RSLT()
		{
			//{{user_implement_dev:T_ODR_ACPT_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ODR_ACPT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SHIP_SLIP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SHIP_SLIP "
+"SET "
+"  SHIP_ODR_AMOUNT = ?, "
+"  TAX_AMOUNT = ?, "
+"  SHIP_ODR_AMOUNT_TAX = ?, "
+"  EXTERNAL_TAX_SALES_AMOUNT = ?, "
+"  INTERNAL_TAX_SALES_AMOUNT = ?, "
+"  TAXFREE_SALES_AMOUNT = ?, "
+"  TAX_CREDIT_SALES_AMOUNT = ?, "
+"  EXTERNAL_TAX_AMOUNT = ?, "
+"  INTERNAL_TAX_AMOUNT = ?, "
+"  TAX_AMOUNT_1 = ?, "
+"  TAX_AMOUNT_2 = ?, "
+"  TAX_AMOUNT_3 = ?, "
+"  OWN_CUR_TAXCREDIT_SALES_AMOUNT = ? "
+"WHERE "
+"  SLIP_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SHIP_SLIP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SHIP_SLIP_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getslipSHIP_ODR_AMOUNT(), stmt);
				setString(5, data.getslipTAX_AMOUNT(), stmt);
				setString(6, data.getslipSHIP_ODR_AMOUNT_TAX(), stmt);
				setString(7, data.getslipEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(8, data.getslipINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(9, data.getslipTAXFREE_SALES_AMOUNT(), stmt);
				setString(10, data.getslipTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(11, data.getslipEXTERNAL_TAX_AMOUNT(), stmt);
				setString(12, data.getslipINTERNAL_TAX_AMOUNT(), stmt);
				setString(13, data.getslipTAX_AMOUNT_1(), stmt);
				setString(14, data.getslipTAX_AMOUNT_2(), stmt);
				setString(15, data.getslipTAX_AMOUNT_3(), stmt);
				setString(16, data.getslipOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(17, data.getl_SHIP_ODR_SLIP_CD(), stmt);

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
			//{{user_implement_dev:T_SHIP_SLIP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SHIP_SLIP_clear

			return;
		}

		/**
		 * T_SHIP_SLIPクラスの標準コンストラクタ
		 */
		public T_SHIP_SLIP()
		{
			//{{user_implement_dev:T_SHIP_SLIP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SHIP_SLIP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SHIP.SHIP_ODR_NO, "
+"  T_SALES.SLIP_CD, "
+"  T_SALES.SALES_TYP, "
+"  T_SALES.CUST_CD, "
+"  T_SALES.ITEM_CD, "
+"  T_SALES.ITEM_NAME, "
+"  T_SALES.CUST_ODR_NO, "
+"  TO_CHAR(T_SALES.SALES_DATE, 'YYYY/MM/DD'), "
+"  T_SALES.SALES_DEPT_CD, "
+"  T_SALES.VEND_CD, "
+"  T_SALES.PRD_ODR_PLACE_CD, "
+"  T_SALES.CUST_CHRG_PSN_CD, "
+"  T_SALES.ODR_ACPT_PSN_CD, "
+"  T_SALES.SALES_QTY, "
+"  T_SALES.SALES_UNIT_PRICE, "
+"  T_SALES.UNIT_CD, "
+"  T_SALES.SALES_AMOUNT, "
+"  T_SALES.SALES_AMOUNT_EXCH_RATES, "
+"  TO_CHAR(T_SALES.INSPC_ACPT_DATE, 'YYYY/MM/DD'), "
+"  NVL(T_SALES.INSPC_ACPT_QTY,0), "
+"  T_SALES.EXTERNAL_TAX_SALES_AMOUNT, "
+"  T_SALES.INTERNAL_TAX_SALES_AMOUNT, "
+"  T_SALES.TAXFREE_SALES_AMOUNT, "
+"  T_SALES.TAX_CREDIT_SALES_AMOUNT, "
+"  T_SALES.EXTERNAL_TAX_AMOUNT, "
+"  T_SALES.INTERNAL_TAX_AMOUNT, "
+"  T_SALES.TAX_AMOUNT_1, "
+"  T_SALES.TAX_AMOUNT_2, "
+"  T_SALES.TAX_AMOUNT_3, "
+"  T_SALES.OWN_CUR_TAXCREDIT_SALES_AMOUNT, "
+"  T_SALES.ORG_SLIP_CD, "
+"  T_SALES.CURRNCY_CD, "
+"  T_SALES.SPCL_PRICE_CO, "
+"  T_SALES.REMARKS, "
+"  T_SALES.INSPC_ACPT_TYP, "
+"  T_SALES.STATUS "
+"FROM "
+"  T_SALES, "
+"  T_SHIP "
+"WHERE "
+"    T_SALES.SLIP_CD = T_SHIP.SLIP_CD "
+"AND T_SALES.SALES_SEQ_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  EXTERNAL_TAX_SALES_AMOUNT = ?, "
+"  INTERNAL_TAX_SALES_AMOUNT = ?, "
+"  TAXFREE_SALES_AMOUNT = ?, "
+"  TAX_CREDIT_SALES_AMOUNT = ?, "
+"  EXTERNAL_TAX_AMOUNT = ?, "
+"  INTERNAL_TAX_AMOUNT = ?, "
+"  TAX_AMOUNT_1 = ?, "
+"  TAX_AMOUNT_2 = ?, "
+"  TAX_AMOUNT_3 = ?, "
+"  OWN_CUR_TAXCREDIT_SALES_AMOUNT = ? "
+"WHERE "
+"  SALES_SEQ_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SALES_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_read
			if(m_selcmd==null) throw new FoundationException("T_SALES", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_h_SALES_SEQ_NO());
				if(isNull(data.getl_h_SALES_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getl_h_SALES_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setselectSHIP_ODR_NO( getString(1, rs) );
			data.setselectSLIP_CD( getString(2, rs) );
			data.setselectSALES_TYP( getString(3, rs) );
			data.setselectCUST_CD( getString(4, rs) );
			data.setselectITEM_CD( getString(5, rs) );
			data.setselectITEM_NAME( getString(6, rs) );
			data.setselectCUST_ODR_NO( getString(7, rs) );
			data.setselectSALES_DATE( getString(8, rs) );
			data.setselectSALES_DEPT_CD( getString(9, rs) );
			data.setselectVEND_CD( getString(10, rs) );
			data.setselectPRD_ODR_PLACE_CD( getString(11, rs) );
			data.setselectCUST_CHRG_PSN_CD( getString(12, rs) );
			data.setselectODR_ACPT_PSN_CD( getString(13, rs) );
			data.setselectSALES_QTY( getString(14, rs) );
			data.setselectSALES_UNIT_PRICE( getString(15, rs) );
			data.setselectUNIT_CD( getString(16, rs) );
			data.setselectSALES_AMOUNT( getString(17, rs) );
			data.setselectSALES_AMOUNT_EXCH_RATES( getString(18, rs) );
			data.setselectINSPC_ACPT_DATE( getString(19, rs) );
			data.setselectINSPC_ACPT_QTY( getString(20, rs) );
			data.setselectEXTERNAL_TAX_SALES_AMOUNT( getString(21, rs) );
			data.setselectINTERNAL_TAX_SALES_AMOUNT( getString(22, rs) );
			data.setselectTAXFREE_SALES_AMOUNT( getString(23, rs) );
			data.setselectTAX_CREDIT_SALES_AMOUNT( getString(24, rs) );
			data.setselectEXTERNAL_TAX_AMOUNT( getString(25, rs) );
			data.setselectINTERNAL_TAX_AMOUNT( getString(26, rs) );
			data.setselectTAX_AMOUNT_1( getString(27, rs) );
			data.setselectTAX_AMOUNT_2( getString(28, rs) );
			data.setselectTAX_AMOUNT_3( getString(29, rs) );
			data.setselectOWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(30, rs) );
			data.setselectORG_SLIP_CD( getString(31, rs) );
			data.setselectCURRNCY_CD( getString(32, rs) );
			data.setselectSPCL_PRICE_CO( getString(33, rs) );
			data.setselectREMARKS( getString(34, rs) );
			data.setselectINSPC_ACPT_TYP( getString(35, rs) );
			data.setselectSTATUS( getString(36, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsalesEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(5, data.getsalesINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(6, data.getsalesTAXFREE_SALES_AMOUNT(), stmt);
				setString(7, data.getsalesTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(8, data.getsalesEXTERNAL_TAX_AMOUNT(), stmt);
				setString(9, data.getsalesINTERNAL_TAX_AMOUNT(), stmt);
				setString(10, data.getsalesTAX_AMOUNT_1(), stmt);
				setString(11, data.getsalesTAX_AMOUNT_2(), stmt);
				setString(12, data.getsalesTAX_AMOUNT_3(), stmt);
				setString(13, data.getsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(14, data.getl_h_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:T_SALES_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_clear

			return;
		}

		/**
		 * T_SALESクラスの標準コンストラクタ
		 */
		public T_SALES()
		{
			//{{user_implement_dev:T_SALES_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteT_SALES extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  DEL_FLG = '1' "
+"WHERE "
+"  SALES_SEQ_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteT_SALES_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteT_SALES_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getl_h_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:deleteT_SALES_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteT_SALES_clear

			return;
		}

		/**
		 * deleteT_SALESクラスの標準コンストラクタ
		 */
		public deleteT_SALES()
		{
			//{{user_implement_dev:deleteT_SALES_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteT_SALES_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class select_Head_Slip extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ODR.ODR_NO, "
+"  ODR.CUST_ODR_NO, "
+"  CTL.ITEM_CD, "
+"  CTL.ITEM_NAME, "
+"  CTL.CUST_CD, "
+"  CUST.CUST_NAME, "
+"  CTL.CUST_ITEM_CD, "
+"  CTL.CUST_ITEM_NAME, "
+"  TO_CHAR(ODR.ODR_ACPT_DATE, 'YYYY/MM/DD'), "
+"  TO_CHAR(ODR.DESINATED_DLV_DATE, 'YYYY/MM/DD'), "
+"  ODR.ODR_UNIT_PRICE, "
+"  CUR.CUR_UNIT, "
+"  ODR.ODR_QTY, "
+"  ODR.TAX_CD, "
+"  ODR.ODR_AMOUNT, "
+"  CUR.CUR_UNIT, "
+"  CUST.INSPC_ACPT_TYP, "
+"  ODR.CURRNCY_CD, "
+"  ODR.EXCH_TYP, "
+"  CUST.PRICE_ROUND_TYP, "
+"  BASE.TRANSPORT_LT, "
+"  WH.PLANT_CD, "
+"  ODR.MODIFY_COUNT "
+"FROM "
+"  T_ODR_CTL CTL, "
+"  T_ODR ODR, "
+"  M_CUST CUST, "
+"  M_CUST_BASE BASE, "
+"  M_CUR CUR, "
+"  M_WH WH, "
+"  M_ITEM_SPEC SPEC "
+"WHERE "
+"  ODR.ODR_CTL_NO = CTL.ODR_CTL_NO "
+"  AND CTL.CUST_CD = CUST.CUST_CD "
+"  AND CUST.COMPANY_CD = ? "
+"  AND CTL.CUST_CD = BASE.CUST_CD "
+"  AND ODR.DLV_LOC_CD = BASE.DLV_LOC_CD "
+"  AND BASE.COMPANY_CD = ? "
+"  AND ODR.CURRNCY_CD = CUR.CUR_CD "
+"  AND BASE.SHIP_WH_CD = WH.WH_CD "
+"  AND CTL.CUST_CD = SPEC.CUST_CD "
+"  AND CTL.CUST_ITEM_CD = SPEC.CUST_ITEM_CD "
+"  AND SPEC.DEPO_TYP <> '20' "
+"  AND ODR.DEL_FLG = '0' "
+"  AND CTL.DEL_FLG = '0' "
+"  AND ODR.ODR_NO = ( "
+"    SELECT "
+"      ODR_NO "
+"    FROM "
+"      T_SHIP_ODR "
+"    WHERE "
+"      SLIP_CD = ? "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_Head_Slip_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:select_Head_Slip_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Head_Slip_read
			if(m_selcmd==null) throw new FoundationException("select_Head_Slip", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_Head_Slip_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Head_Slip_read2
			if(m_selcmd==null) throw new FoundationException("select_Head_Slip", "read", "クエリー未登録");
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
                        //}}user_implement_dev:select_Head_Slip_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Head_Slip_read3
			if(m_selcmd==null) throw new FoundationException("select_Head_Slip", "read", "クエリー未登録");
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
                        //}}user_implement_dev:select_Head_Slip_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("select_Head_Slip", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD())) setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.seth_ODR_NO( getString(1, rs) );
			data.setCUST_ODR_NO( getString(2, rs) );
			data.setITEM_CD( getString(3, rs) );
			data.setITEM_NAME( getString(4, rs) );
			data.setCUST_CD( getString(5, rs) );
			data.setCUST_NAME( getString(6, rs) );
			data.setCUST_ITEM_CD( getString(7, rs) );
			data.setCUST_ITEM_NAME( getString(8, rs) );
			data.setODR_ACPT_DATE( getString(9, rs) );
			data.setDESINATED_DLV_DATE( getString(10, rs) );
			data.setODR_UNIT_PRICE( getString(11, rs) );
			data.setODR_UNIT_CD( getString(12, rs) );
			data.setODR_QTY( getString(13, rs) );
			data.setTAX_CD( getString(14, rs) );
			data.setODR_AMOUNT( getString(15, rs) );
			data.setODR_AMOUNT_UNIT_CD( getString(16, rs) );
			data.seth_INSPC_ACPT_TYP( getString(17, rs) );
			data.seth_CURRNCY_CD( getString(18, rs) );
			data.seth_EXCH_TYP( getString(19, rs) );
			data.seth_PRICE_ROUND_TYP( getString(20, rs) );
			data.seth_TRANSPORT_LT( getString(21, rs) );
			data.setPLANT_CD( getString(22, rs) );
			data.seth_MODIFY_COUNT( getString(23, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select_Head_Slip", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_Head_Slip_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_Head_Slip_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_Head_Slip_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:select_Head_Slip_clear

			return;
		}

		/**
		 * select_Head_Slipクラスの標準コンストラクタ
		 */
		public select_Head_Slip()
		{
			//{{user_implement_dev:select_Head_Slip_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:select_Head_Slip_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  T_ODR ODR, "
+"  T_ANS_DLV_DATE DLV, "
+"  T_JOB_ODR_ODR_ALC ALC, "
+"  T_SHIP_ODR SHIP_ODR, "
+"  T_SHIP SHIP, "
+"  T_SALES SALES, "
+"  T_AR_LEDGER_H AR, "
+"  T_AR_LEDGER_H_TRN AR_TRN "
+"WHERE "
+"  ODR.ODR_NO = ? "
+"  AND ODR.DEL_FLG = '0' "
+"  AND ODR.ODR_NO = DLV.ODR_NO(+) "
+"  AND DLV.DEL_FLG(+) = '0' "
+"  AND ODR.ODR_NO = ALC.ODR_NO(+) "
+"  AND DLV.ODR_NO = SHIP_ODR.ODR_NO(+) "
+"  AND DLV.PART_DLV_SEQ_NO = SHIP_ODR.PART_DLV_SEQ_NO(+) "
+"  AND SHIP_ODR.DEL_FLG(+) = '0' "
+"  AND SHIP_ODR.SLIP_CD = SHIP.SLIP_CD(+) "
+"  AND SHIP.DEL_FLG(+) = '0' "
+"  AND SHIP.SLIP_CD = SALES.SLIP_CD(+) "
+"  AND SALES.DEL_FLG(+) = '0' "
+"  AND SALES.SLIP_CD = AR.SLIP_CD(+) "
+"  AND SALES.SLIP_CD = AR_TRN.SLIP_CD(+) "
+"  AND AR.COMPANY_CD(+) = ? "
+"  AND AR.SLIP_CTRL_GRP(+) = ? "
+"  AND AR.SLIP_TYP(+) = '14' "
+"  AND AR.INSPC_ACPT_CRCT_TYP(+) = '2' "
+"  AND AR_TRN.COMPANY_CD(+) = ? "
+"  AND AR_TRN.SLIP_CTRL_GRP(+) = ? "
+"  AND AR_TRN.SLIP_TYP(+) = '14' "
+"  AND AR_TRN.INSPC_ACPT_CRCT_TYP(+) = '2' "
+"  AND ROWNUM <= TO_NUMBER(?) + 1 ";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_read
			if(m_selcmd==null) throw new FoundationException("selectCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_ODR_NO());
				if(isNull(data.geth_ODR_NO())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CTRL_GRP());
				if(isNull(data.getSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_ODR_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setCOUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectCnt_clear

			return;
		}

		/**
		 * selectCntクラスの標準コンストラクタ
		 */
		public selectCnt()
		{
			//{{user_implement_dev:selectCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SHIP_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SHIP_ODR "
+"SET "
+"  SLIP_CD = ? "
+"WHERE "
+"  SHIP_ODR_NO = ? "
+"  AND DEL_FLG = '0'";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SHIP_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SHIP_ODR_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getinsertSLIP_CD(), stmt);
				setString(5, data.getl_h_SHIP_ODR_NO(), stmt);

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
			//{{user_implement_dev:T_SHIP_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SHIP_ODR_clear

			return;
		}

		/**
		 * T_SHIP_ODRクラスの標準コンストラクタ
		 */
		public T_SHIP_ODR()
		{
			//{{user_implement_dev:T_SHIP_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SHIP_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SHIP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SHIP "
+"SET "
+"  SLIP_CD = ?, "
+"  ORGNAL_SLIP_CD = ? "
+"WHERE "
+"  SHIP_SEQ_NO = ? "
+"  AND DEL_FLG = '0'";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SHIP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SHIP_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getinsertSLIP_CD(), stmt);
				setString(5, data.getORGNAL_SLIP_CD(), stmt);
				setString(6, data.getl_h_SHIP_SEQ_NO(), stmt);

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
			//{{user_implement_dev:T_SHIP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SHIP_clear

			return;
		}

		/**
		 * T_SHIPクラスの標準コンストラクタ
		 */
		public T_SHIP()
		{
			//{{user_implement_dev:T_SHIP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SHIP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_AR_LEDGER_H_TRN.MODIFY_COUNT AS MODIFY_COUNT "
+"FROM "
+"  T_AR_LEDGER_H_TRN "
+"WHERE "
+"  T_AR_LEDGER_H_TRN.COMPANY_CD = ? "
+"  AND T_AR_LEDGER_H_TRN.SLIP_TYP = 14 "
+"  AND T_AR_LEDGER_H_TRN.SLIP_CTRL_GRP = ? "
+"  AND T_AR_LEDGER_H_TRN.SLIP_CD = ?";
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
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
	public class updateT_AR_LEDGER_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_AR_LEDGER_TRN "
+"SET "
+"  TAX_CD_1 = ?, "
+"  TAX_CD_2 = ?, "
+"  EXTERNAL_TAX_SALES_AMOUNT = ?, "
+"  INTERNAL_TAX_SALES_AMOUNT = ?, "
+"  TAXFREE_SALES_AMOUNT = ?, "
+"  TAX_CREDIT_SALES_AMOUNT = ?, "
+"  EXTERNAL_TAX_AMOUNT = ?, "
+"  INTERNAL_TAX_AMOUNT = ?, "
+"  TAX_AMOUNT_1 = ?, "
+"  TAX_AMOUNT_2 = ?, "
+"  TAX_AMOUNT_3 = ?, "
+"  OWN_CUR_TAXCREDIT_SALES_AMOUNT = ? "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = 14 "
+"  AND SLIP_CTRL_GRP = ? "
+"  AND SLIP_CD = ? "
+"  AND SLIP_DATE = ? "
+"  AND SEQ_NO = 1";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_AR_LEDGER_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_AR_LEDGER_TRN_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getTAX_CD_1(), stmt);
				setString(5, data.getTAX_CD_2(), stmt);
				setString(6, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(7, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(8, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(9, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(10, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(11, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(12, data.getTAX_AMOUNT_1(), stmt);
				setString(13, data.getTAX_AMOUNT_2(), stmt);
				setString(14, data.getTAX_AMOUNT_3(), stmt);
				setString(15, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(16, data.getCOMPANY_CD(), stmt);
				setString(17, data.getSLIP_CTRL_GRP(), stmt);
				setString(18, data.getSLIP_CD(), stmt);
				setString(19, data.getSLIP_DATE(), stmt);

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
			//{{user_implement_dev:updateT_AR_LEDGER_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_AR_LEDGER_TRN_clear

			return;
		}

		/**
		 * updateT_AR_LEDGER_TRNクラスの標準コンストラクタ
		 */
		public updateT_AR_LEDGER_TRN()
		{
			//{{user_implement_dev:updateT_AR_LEDGER_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_AR_LEDGER_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_AR_LEDGER_TRN extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SUM(EXTERNAL_TAX_SALES_AMOUNT), "
+"  SUM(INTERNAL_TAX_SALES_AMOUNT), "
+"  SUM(TAXFREE_SALES_AMOUNT), "
+"  SUM(TAX_CREDIT_SALES_AMOUNT), "
+"  SUM(EXTERNAL_TAX_AMOUNT), "
+"  SUM(INTERNAL_TAX_AMOUNT), "
+"  SUM(TAX_AMOUNT_1), "
+"  SUM(TAX_AMOUNT_2), "
+"  SUM(TAX_AMOUNT_3), "
+"  SUM(OWN_CUR_TAXCREDIT_SALES_AMOUNT) "
+"FROM "
+"  T_AR_LEDGER_TRN "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = 14 "
+"  AND SLIP_CTRL_GRP = ? "
+"  AND SLIP_CD = ? "
+"  AND SLIP_DATE = ? "
+"GROUP BY "
+"  COMPANY_CD, "
+"  SLIP_TYP, "
+"  SLIP_CTRL_GRP, "
+"  SLIP_CD, "
+"  SLIP_DATE";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_AR_LEDGER_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_AR_LEDGER_TRN_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_AR_LEDGER_TRN_read
			if(m_selcmd==null) throw new FoundationException("selectT_AR_LEDGER_TRN", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_AR_LEDGER_TRN_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_AR_LEDGER_TRN_read2
			if(m_selcmd==null) throw new FoundationException("selectT_AR_LEDGER_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_AR_LEDGER_TRN_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_AR_LEDGER_TRN_read3
			if(m_selcmd==null) throw new FoundationException("selectT_AR_LEDGER_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_AR_LEDGER_TRN_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getSLIP_DATE());
				if(isNull(data.getSLIP_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setSUM_EXTERNAL_TAX_SALES_AMOUNT( getString(1, rs) );
			data.setSUM_INTERNAL_TAX_SALES_AMOUNT( getString(2, rs) );
			data.setSUM_TAXFREE_SALES_AMOUNT( getString(3, rs) );
			data.setSUM_TAX_CREDIT_SALES_AMOUNT( getString(4, rs) );
			data.setSUM_EXTERNAL_TAX_AMOUNT( getString(5, rs) );
			data.setSUM_INTERNAL_TAX_AMOUNT( getString(6, rs) );
			data.setSUM_TAX_AMOUNT_1( getString(7, rs) );
			data.setSUM_TAX_AMOUNT_2( getString(8, rs) );
			data.setSUM_TAX_AMOUNT_3( getString(9, rs) );
			data.setSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(10, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_AR_LEDGER_TRN", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_AR_LEDGER_TRN_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_AR_LEDGER_TRN_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_AR_LEDGER_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_AR_LEDGER_TRN_clear

			return;
		}

		/**
		 * selectT_AR_LEDGER_TRNクラスの標準コンストラクタ
		 */
		public selectT_AR_LEDGER_TRN()
		{
			//{{user_implement_dev:selectT_AR_LEDGER_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_AR_LEDGER_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_AR_LEDGER_H_TRN "
+"SET "
+"  EXTERNAL_TAX_SALES_AMOUNT = ?, "
+"  INTERNAL_TAX_SALES_AMOUNT = ?, "
+"  TAXFREE_SALES_AMOUNT = ?, "
+"  TAX_CREDIT_SALES_AMOUNT = ?, "
+"  EXTERNAL_TAX_AMOUNT = ?, "
+"  INTERNAL_TAX_AMOUNT = ?, "
+"  TAX_AMOUNT_1 = ?, "
+"  TAX_AMOUNT_2 = ?, "
+"  TAX_AMOUNT_3 = ?, "
+"  OWN_CUR_TAXCREDIT_SALES_AMOUNT = ? "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = 14 "
+"  AND SLIP_CTRL_GRP = ? "
+"  AND SLIP_CD = ? "
+"  AND SLIP_DATE = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_AR_LEDGER_H_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_AR_LEDGER_H_TRN_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getSUM_EXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(5, data.getSUM_INTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(6, data.getSUM_TAXFREE_SALES_AMOUNT(), stmt);
				setString(7, data.getSUM_TAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(8, data.getSUM_EXTERNAL_TAX_AMOUNT(), stmt);
				setString(9, data.getSUM_INTERNAL_TAX_AMOUNT(), stmt);
				setString(10, data.getSUM_TAX_AMOUNT_1(), stmt);
				setString(11, data.getSUM_TAX_AMOUNT_2(), stmt);
				setString(12, data.getSUM_TAX_AMOUNT_3(), stmt);
				setString(13, data.getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(14, data.getCOMPANY_CD(), stmt);
				setString(15, data.getSLIP_CTRL_GRP(), stmt);
				setString(16, data.getSLIP_CD(), stmt);
				setString(17, data.getSLIP_DATE(), stmt);

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
			//{{user_implement_dev:updateT_AR_LEDGER_H_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_AR_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * updateT_AR_LEDGER_H_TRNクラスの標準コンストラクタ
		 */
		public updateT_AR_LEDGER_H_TRN()
		{
			//{{user_implement_dev:updateT_AR_LEDGER_H_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_AR_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_AR_LEDGER extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_AR_LEDGER "
+"SET "
+"  TAX_CD_1 = ?, "
+"  TAX_CD_2 = ?, "
+"  EXTERNAL_TAX_SALES_AMOUNT = ?, "
+"  INTERNAL_TAX_SALES_AMOUNT = ?, "
+"  TAXFREE_SALES_AMOUNT = ?, "
+"  TAX_CREDIT_SALES_AMOUNT = ?, "
+"  EXTERNAL_TAX_AMOUNT = ?, "
+"  INTERNAL_TAX_AMOUNT = ?, "
+"  TAX_AMOUNT_1 = ?, "
+"  TAX_AMOUNT_2 = ?, "
+"  TAX_AMOUNT_3 = ?, "
+"  OWN_CUR_TAXCREDIT_SALES_AMOUNT = ? "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = 14 "
+"  AND SLIP_CTRL_GRP = ? "
+"  AND SLIP_CD = ? "
+"  AND SLIP_DATE = ? "
+"  AND SEQ_NO = 1";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_AR_LEDGER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_AR_LEDGER_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getTAX_CD_1(), stmt);
				setString(5, data.getTAX_CD_2(), stmt);
				setString(6, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(7, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(8, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(9, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(10, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(11, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(12, data.getTAX_AMOUNT_1(), stmt);
				setString(13, data.getTAX_AMOUNT_2(), stmt);
				setString(14, data.getTAX_AMOUNT_3(), stmt);
				setString(15, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(16, data.getCOMPANY_CD(), stmt);
				setString(17, data.getSLIP_CTRL_GRP(), stmt);
				setString(18, data.getSLIP_CD(), stmt);
				setString(19, data.getSLIP_DATE(), stmt);

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
			//{{user_implement_dev:updateT_AR_LEDGER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_AR_LEDGER_clear

			return;
		}

		/**
		 * updateT_AR_LEDGERクラスの標準コンストラクタ
		 */
		public updateT_AR_LEDGER()
		{
			//{{user_implement_dev:updateT_AR_LEDGER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_AR_LEDGER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_AR_LEDGER extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SUM(EXTERNAL_TAX_SALES_AMOUNT), "
+"  SUM(INTERNAL_TAX_SALES_AMOUNT), "
+"  SUM(TAXFREE_SALES_AMOUNT), "
+"  SUM(TAX_CREDIT_SALES_AMOUNT), "
+"  SUM(EXTERNAL_TAX_AMOUNT), "
+"  SUM(INTERNAL_TAX_AMOUNT), "
+"  SUM(TAX_AMOUNT_1), "
+"  SUM(TAX_AMOUNT_2), "
+"  SUM(TAX_AMOUNT_3), "
+"  SUM(OWN_CUR_TAXCREDIT_SALES_AMOUNT) "
+"FROM "
+"  T_AR_LEDGER "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = 14 "
+"  AND SLIP_CTRL_GRP = ? "
+"  AND SLIP_CD = ? "
+"  AND SLIP_DATE = ? "
+"GROUP BY "
+"  COMPANY_CD, "
+"  SLIP_TYP, "
+"  SLIP_CTRL_GRP, "
+"  SLIP_CD, "
+"  SLIP_DATE";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_AR_LEDGER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_AR_LEDGER_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_AR_LEDGER_read
			if(m_selcmd==null) throw new FoundationException("selectT_AR_LEDGER", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_AR_LEDGER_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_AR_LEDGER_read2
			if(m_selcmd==null) throw new FoundationException("selectT_AR_LEDGER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_AR_LEDGER_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_AR_LEDGER_read3
			if(m_selcmd==null) throw new FoundationException("selectT_AR_LEDGER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_AR_LEDGER_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getSLIP_DATE());
				if(isNull(data.getSLIP_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setSUM_EXTERNAL_TAX_SALES_AMOUNT( getString(1, rs) );
			data.setSUM_INTERNAL_TAX_SALES_AMOUNT( getString(2, rs) );
			data.setSUM_TAXFREE_SALES_AMOUNT( getString(3, rs) );
			data.setSUM_TAX_CREDIT_SALES_AMOUNT( getString(4, rs) );
			data.setSUM_EXTERNAL_TAX_AMOUNT( getString(5, rs) );
			data.setSUM_INTERNAL_TAX_AMOUNT( getString(6, rs) );
			data.setSUM_TAX_AMOUNT_1( getString(7, rs) );
			data.setSUM_TAX_AMOUNT_2( getString(8, rs) );
			data.setSUM_TAX_AMOUNT_3( getString(9, rs) );
			data.setSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(10, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_AR_LEDGER", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_AR_LEDGER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_AR_LEDGER_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_AR_LEDGER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_AR_LEDGER_clear

			return;
		}

		/**
		 * selectT_AR_LEDGERクラスの標準コンストラクタ
		 */
		public selectT_AR_LEDGER()
		{
			//{{user_implement_dev:selectT_AR_LEDGER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_AR_LEDGER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_AR_LEDGER_H extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_AR_LEDGER_H "
+"SET "
+"  EXTERNAL_TAX_SALES_AMOUNT = ?, "
+"  INTERNAL_TAX_SALES_AMOUNT = ?, "
+"  TAXFREE_SALES_AMOUNT = ?, "
+"  TAX_CREDIT_SALES_AMOUNT = ?, "
+"  EXTERNAL_TAX_AMOUNT = ?, "
+"  INTERNAL_TAX_AMOUNT = ?, "
+"  TAX_AMOUNT_1 = ?, "
+"  TAX_AMOUNT_2 = ?, "
+"  TAX_AMOUNT_3 = ?, "
+"  OWN_CUR_TAXCREDIT_SALES_AMOUNT = ? "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = 14 "
+"  AND SLIP_CTRL_GRP = ? "
+"  AND SLIP_CD = ? "
+"  AND SLIP_DATE = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KQ0100010";
		protected String m_sUpdateProgramName="KQ0100010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_AR_LEDGER_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_AR_LEDGER_H_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getSUM_EXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(5, data.getSUM_INTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(6, data.getSUM_TAXFREE_SALES_AMOUNT(), stmt);
				setString(7, data.getSUM_TAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(8, data.getSUM_EXTERNAL_TAX_AMOUNT(), stmt);
				setString(9, data.getSUM_INTERNAL_TAX_AMOUNT(), stmt);
				setString(10, data.getSUM_TAX_AMOUNT_1(), stmt);
				setString(11, data.getSUM_TAX_AMOUNT_2(), stmt);
				setString(12, data.getSUM_TAX_AMOUNT_3(), stmt);
				setString(13, data.getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(14, data.getCOMPANY_CD(), stmt);
				setString(15, data.getSLIP_CTRL_GRP(), stmt);
				setString(16, data.getSLIP_CD(), stmt);
				setString(17, data.getSLIP_DATE(), stmt);

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
			//{{user_implement_dev:updateT_AR_LEDGER_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_AR_LEDGER_H_clear

			return;
		}

		/**
		 * updateT_AR_LEDGER_Hクラスの標準コンストラクタ
		 */
		public updateT_AR_LEDGER_H()
		{
			//{{user_implement_dev:updateT_AR_LEDGER_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_AR_LEDGER_H_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectCnt1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  T_ODR ODR, "
+"  T_ANS_DLV_DATE DLV, "
+"  T_JOB_ODR_ODR_ALC ALC, "
+"  T_SHIP_ODR SHIP_ODR, "
+"  T_SHIP SHIP, "
+"  T_SALES SALES "
+"WHERE "
+"  ODR.ODR_NO = ? "
+"  AND ODR.DEL_FLG = '0' "
+"  AND ODR.ODR_NO = DLV.ODR_NO(+) "
+"  AND DLV.DEL_FLG(+) = '0' "
+"  AND ODR.ODR_NO = ALC.ODR_NO(+) "
+"  AND DLV.ODR_NO = SHIP_ODR.ODR_NO(+) "
+"  AND DLV.PART_DLV_SEQ_NO = SHIP_ODR.PART_DLV_SEQ_NO(+) "
+"  AND SHIP_ODR.DEL_FLG(+) = '0' "
+"  AND SHIP_ODR.SLIP_CD = SHIP.SLIP_CD(+) "
+"  AND SHIP.DEL_FLG(+) = '0' "
+"  AND SHIP.SLIP_CD = SALES.SLIP_CD(+) "
+"  AND SALES.DEL_FLG(+) = '0' "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectCnt1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectCnt1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt1_read
			if(m_selcmd==null) throw new FoundationException("selectCnt1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectCnt1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt1_read2
			if(m_selcmd==null) throw new FoundationException("selectCnt1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectCnt1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt1_read3
			if(m_selcmd==null) throw new FoundationException("selectCnt1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectCnt1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_ODR_NO());
				if(isNull(data.geth_ODR_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_ODR_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setCOUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectCnt1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectCnt1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectCnt1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectCnt1_clear

			return;
		}

		/**
		 * selectCnt1クラスの標準コンストラクタ
		 */
		public selectCnt1()
		{
			//{{user_implement_dev:selectCnt1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectCnt1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectDetail1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ODR.ODR_NO AS ODR_ODR_NO, "
+"  COALESCE(SHIP.JOB_ODR_CD, SHIP_ODR.JOB_ODR_CD, ALC.JOB_ODR_CD) AS JOB_ODR_CD, "
+"  DLV.PART_DLV_SEQ_NO AS PART_DLV_SEQ_NO, "
+"  DLV.ODR_NO AS DLV_ODR_NO, "
+"  SHIP_ODR.SLIP_CD AS SHIP_ODR_SLIP_CD, "
+"  TO_CHAR(SHIP_ODR.DESINATED_SHIP_DATE, 'YYYY/MM/DD') AS DESINATED_SHIP_DATE, "
+"  TO_CHAR(SHIP_ODR.SCDL_DLV_DATE, 'YYYY/MM/DD') AS SCDL_DLV_DATE, "
+"  SHIP_ODR.SHIP_ODR_NO AS SHIP_ODR_NO, "
+"  SHIP_ODR.SHIP_ODR_AMOUNT AS ODR_AMOUNT, "
+"  TO_CHAR(SHIP.SHIP_DATE, 'YYYY/MM/DD') AS SHIP_DATE, "
+"  SHIP.SHIP_ODR_AMOUNT AS SHIP_ODR_AMOUNT, "
+"  SHIP.SHIP_SEQ_NO AS SHIP_SEQ_NO, "
+"  TO_CHAR(SALES.SALES_DATE, 'YYYY/MM/DD') AS SALES_DATE, "
+"  SALES.SALES_AMOUNT AS SALES_AMOUNT, "
+"  SALES.SALES_SEQ_NO AS SALES_SEQ_NO, "
+"  SALES.SLIP_CD AS SALES_SLIP_CD, "
+"  SALES.STATUS AS STATUS, "
+"  SHIP.SHIP_SEQ_NO AS SHIP_SEQ_NO, "
+"  TO_CHAR(SALES.INSPC_ACPT_DATE, 'YYYY/MM/DD') AS INSPC_ACPT_DATE "
+"FROM "
+"  T_ODR ODR, "
+"  T_ANS_DLV_DATE DLV, "
+"  T_JOB_ODR_ODR_ALC ALC, "
+"  T_SHIP_ODR SHIP_ODR, "
+"  T_SHIP SHIP, "
+"  T_SALES SALES "
+"WHERE "
+"  ODR.ODR_NO = ? "
+"  AND ODR.DEL_FLG = '0' "
+"  AND ODR.ODR_NO = DLV.ODR_NO(+) "
+"  AND DLV.DEL_FLG(+) = '0' "
+"  AND ODR.ODR_NO = ALC.ODR_NO(+) "
+"  AND DLV.ODR_NO = SHIP_ODR.ODR_NO(+) "
+"  AND DLV.PART_DLV_SEQ_NO = SHIP_ODR.PART_DLV_SEQ_NO(+) "
+"  AND SHIP_ODR.DEL_FLG(+) = '0' "
+"  AND SHIP_ODR.SLIP_CD = SHIP.SLIP_CD(+) "
+"  AND SHIP.DEL_FLG(+) = '0' "
+"  AND SHIP.SLIP_CD = SALES.SLIP_CD(+) "
+"  AND SALES.DEL_FLG(+) = '0' "
+"ORDER BY "
+"  DLV.PART_DLV_SEQ_NO, "
+"  SHIP_ODR.SLIP_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectDetail1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectDetail1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectDetail1_read
			if(m_selcmd==null) throw new FoundationException("selectDetail1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectDetail1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectDetail1_read2
			if(m_selcmd==null) throw new FoundationException("selectDetail1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectDetail1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectDetail1_read3
			if(m_selcmd==null) throw new FoundationException("selectDetail1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectDetail1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_ODR_NO());
				if(isNull(data.geth_ODR_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectDetail1", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.geth_ODR_NO())) setString(no ++, data.geth_ODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setl_ODR_ODR_NO( getString(1, rs) );
			data.setl_JOB_ODR_CD( getString(2, rs) );
			data.setl_PART_DLV_SEQ_NO( getString(3, rs) );
			data.setl_DLV_ODR_NO( getString(4, rs) );
			data.setl_SHIP_ODR_SLIP_CD( getString(5, rs) );
			data.setl_DESINATED_SHIP_DATE( getString(6, rs) );
			data.setl_SCDL_DLV_DATE( getString(7, rs) );
			data.setl_SHIP_ODR_NO( getString(8, rs) );
			data.setl_ODR_AMOUNT( getString(9, rs) );
			data.setl_SHIP_DATE( getString(10, rs) );
			data.setl_SHIP_ODR_AMOUNT( getString(11, rs) );
			data.setl_SHIP_SEQ_NO( getString(12, rs) );
			data.setl_SALES_DATE( getString(13, rs) );
			data.setl_SALES_AMOUNT( getString(14, rs) );
			data.setl_SALES_SEQ_NO( getString(15, rs) );
			data.setl_SALES_SLIP_CD( getString(16, rs) );
			data.setl_SALES_STATUS( getString(17, rs) );
			data.setl_SHIP_SEQ_NO( getString(18, rs) );
			data.setl_h_INSPC_ACPT_DATE( getString(19, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectDetail1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectDetail1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectDetail1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectDetail1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectDetail1_clear

			return;
		}

		/**
		 * selectDetail1クラスの標準コンストラクタ
		 */
		public selectDetail1()
		{
			//{{user_implement_dev:selectDetail1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectDetail1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_T_AR_LEDGER_TRN_FOR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SLIP_CD "
+"FROM "
+"  T_AR_LEDGER_TRN "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = '14' "
+"  AND SLIP_CTRL_GRP = ? "
+"  AND SLIP_CD = ? "
+"  AND SLIP_DATE = ? "
+"  AND SEQ_NO = 1 "
+"FOR UPDATE NOWAIT";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_read
			if(m_selcmd==null) throw new FoundationException("SELECT_T_AR_LEDGER_TRN_FOR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_T_AR_LEDGER_TRN_FOR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_T_AR_LEDGER_TRN_FOR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getSLIP_DATE());
				if(isNull(data.getSLIP_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setSEL_SLIP_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_T_AR_LEDGER_TRN_FOR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_clear

			return;
		}

		/**
		 * SELECT_T_AR_LEDGER_TRN_FORクラスの標準コンストラクタ
		 */
		public SELECT_T_AR_LEDGER_TRN_FOR()
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_TRN_FOR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_T_AR_LEDGER_FOR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SLIP_CD "
+"FROM "
+"  T_AR_LEDGER "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = 14 "
+"  AND SLIP_CTRL_GRP = ? "
+"  AND SLIP_CD = ? "
+"  AND SLIP_DATE = ? "
+"  AND SEQ_NO = 1 "
+"FOR UPDATE NOWAIT";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_T_AR_LEDGER_FOR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_T_AR_LEDGER_FOR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_FOR_read
			if(m_selcmd==null) throw new FoundationException("SELECT_T_AR_LEDGER_FOR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_FOR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_FOR_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_T_AR_LEDGER_FOR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_FOR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_FOR_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_T_AR_LEDGER_FOR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_FOR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getSLIP_DATE());
				if(isNull(data.getSLIP_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CTRL_GRP(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSLIP_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setSEL_SHIP_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_T_AR_LEDGER_FOR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_FOR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_FOR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_T_AR_LEDGER_FOR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_FOR_clear

			return;
		}

		/**
		 * SELECT_T_AR_LEDGER_FORクラスの標準コンストラクタ
		 */
		public SELECT_T_AR_LEDGER_FOR()
		{
			//{{user_implement_dev:SELECT_T_AR_LEDGER_FOR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SELECT_T_AR_LEDGER_FOR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_MODIFY_COUNT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MODIFY_COUNT "
+"FROM "
+"  T_ODR "
+"WHERE "
+"  ODR_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_MODIFY_COUNT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_MODIFY_COUNT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0100010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0100010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_MODIFY_COUNT_read
			if(m_selcmd==null) throw new FoundationException("SELECT_MODIFY_COUNT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_MODIFY_COUNT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_MODIFY_COUNT_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_MODIFY_COUNT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_MODIFY_COUNT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KQ0100010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_MODIFY_COUNT_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_MODIFY_COUNT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_MODIFY_COUNT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0100010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_NO());
				if(isNull(data.getODR_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KQ0100010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0100010Struct data = new KQ0100010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_MODIFY_COUNT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KQ0100010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0100010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_MODIFY_COUNT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_MODIFY_COUNT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KQ0100010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_MODIFY_COUNT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SELECT_MODIFY_COUNT_clear

			return;
		}

		/**
		 * SELECT_MODIFY_COUNTクラスの標準コンストラクタ
		 */
		public SELECT_MODIFY_COUNT()
		{
			//{{user_implement_dev:SELECT_MODIFY_COUNT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SELECT_MODIFY_COUNT_constractor

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
		mselect_Head.clear();
		mselect_Head = null;
		mselect_Detail.clear();
		mselect_Detail = null;
		mgetCompanyInfo.clear();
		mgetCompanyInfo = null;
		mgetOptionId.clear();
		mgetOptionId = null;
		mgetSYUKA_LT.clear();
		mgetSYUKA_LT = null;
		mgetSLIP_CTRL_GRP.clear();
		mgetSLIP_CTRL_GRP = null;
		mget_TAX_CD.clear();
		mget_TAX_CD = null;
		mT_ODR.clear();
		mT_ODR = null;
		mT_ODR_ACPT_RSLT.clear();
		mT_ODR_ACPT_RSLT = null;
		mT_SHIP_SLIP.clear();
		mT_SHIP_SLIP = null;
		mT_SALES.clear();
		mT_SALES = null;
		mdeleteT_SALES.clear();
		mdeleteT_SALES = null;
		mselect_Head_Slip.clear();
		mselect_Head_Slip = null;
		mselectCnt.clear();
		mselectCnt = null;
		mT_SHIP_ODR.clear();
		mT_SHIP_ODR = null;
		mT_SHIP.clear();
		mT_SHIP = null;
		mSelectT_AR_LEDGER_H_TRN.clear();
		mSelectT_AR_LEDGER_H_TRN = null;
		mupdateT_AR_LEDGER_TRN.clear();
		mupdateT_AR_LEDGER_TRN = null;
		mselectT_AR_LEDGER_TRN.clear();
		mselectT_AR_LEDGER_TRN = null;
		mupdateT_AR_LEDGER_H_TRN.clear();
		mupdateT_AR_LEDGER_H_TRN = null;
		mupdateT_AR_LEDGER.clear();
		mupdateT_AR_LEDGER = null;
		mselectT_AR_LEDGER.clear();
		mselectT_AR_LEDGER = null;
		mupdateT_AR_LEDGER_H.clear();
		mupdateT_AR_LEDGER_H = null;
		mselectCnt1.clear();
		mselectCnt1 = null;
		mselectDetail1.clear();
		mselectDetail1 = null;
		mSELECT_T_AR_LEDGER_TRN_FOR.clear();
		mSELECT_T_AR_LEDGER_TRN_FOR = null;
		mSELECT_T_AR_LEDGER_FOR.clear();
		mSELECT_T_AR_LEDGER_FOR = null;
		mSELECT_MODIFY_COUNT.clear();
		mSELECT_MODIFY_COUNT = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * KQ0100010クラスの標準コンストラクタ
	 */
	public KQ0100010Entity() throws FoundationException
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
