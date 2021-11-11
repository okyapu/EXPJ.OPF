/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/KR0070010Entity.java,v $
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
 * CLASS     : KR0070010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class KR0070010Entity extends DataObject
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

	// SYS_INSTALL_OPTIONSクラス インスタンス
	public SYS_INSTALL_OPTIONS mSYS_INSTALL_OPTIONS = new SYS_INSTALL_OPTIONS();

	// selectOfInsertクラス インスタンス
	public selectOfInsert mselectOfInsert = new selectOfInsert();

	// selectOfUpdateDeleteJクラス インスタンス
	public selectOfUpdateDeleteJ mselectOfUpdateDeleteJ = new selectOfUpdateDeleteJ();

	// selectOfUpdateDeleteJaクラス インスタンス
	public selectOfUpdateDeleteJa mselectOfUpdateDeleteJa = new selectOfUpdateDeleteJa();

	// selectOfUpdateDeleteJfクラス インスタンス
	public selectOfUpdateDeleteJf mselectOfUpdateDeleteJf = new selectOfUpdateDeleteJf();

	// T_ODR_UNSTOCKクラス インスタンス
	public T_ODR_UNSTOCK mT_ODR_UNSTOCK = new T_ODR_UNSTOCK();

	// M_ITEMクラス インスタンス
	public M_ITEM mM_ITEM = new M_ITEM();

	// M_CUST_ITEMクラス インスタンス
	public M_CUST_ITEM mM_CUST_ITEM = new M_CUST_ITEM();

	// M_ORGクラス インスタンス
	public M_ORG mM_ORG = new M_ORG();

	// USER_MSTクラス インスタンス
	public USER_MST mUSER_MST = new USER_MST();

	// M_TAXクラス インスタンス
	public M_TAX mM_TAX = new M_TAX();

	// T_AR_LEDGER_Hクラス インスタンス
	public T_AR_LEDGER_H mT_AR_LEDGER_H = new T_AR_LEDGER_H();

	// T_AR_LEDGER_H_TRNクラス インスタンス
	public T_AR_LEDGER_H_TRN mT_AR_LEDGER_H_TRN = new T_AR_LEDGER_H_TRN();

	// M_CUSTクラス インスタンス
	public M_CUST mM_CUST = new M_CUST();

	// T_SALESクラス インスタンス
	public T_SALES mT_SALES = new T_SALES();

	// SYS_PARAMETERクラス インスタンス
	public SYS_PARAMETER mSYS_PARAMETER = new SYS_PARAMETER();

	// SYS_INSTALL_OPTIONS_AIクラス インスタンス
	public SYS_INSTALL_OPTIONS_AI mSYS_INSTALL_OPTIONS_AI = new SYS_INSTALL_OPTIONS_AI();

	// SYS_MY_COMPANYクラス インスタンス
	public SYS_MY_COMPANY mSYS_MY_COMPANY = new SYS_MY_COMPANY();

	// SYS_CLASS_CODEクラス インスタンス
	public SYS_CLASS_CODE mSYS_CLASS_CODE = new SYS_CLASS_CODE();

	// SYS_DATE_CTRLクラス インスタンス
	public SYS_DATE_CTRL mSYS_DATE_CTRL = new SYS_DATE_CTRL();

	// M_CURクラス インスタンス
	public M_CUR mM_CUR = new M_CUR();

	// SYS_INSTALL_OPTIONS_Bクラス インスタンス
	public SYS_INSTALL_OPTIONS_B mSYS_INSTALL_OPTIONS_B = new SYS_INSTALL_OPTIONS_B();

	// SEQ_SALES_SEQ_NOクラス インスタンス
	public SEQ_SALES_SEQ_NO mSEQ_SALES_SEQ_NO = new SEQ_SALES_SEQ_NO();

	// T_SALES_TEMPクラス インスタンス
	public T_SALES_TEMP mT_SALES_TEMP = new T_SALES_TEMP();

	// M_CLAIM_CUST_CTRLクラス インスタンス
	public M_CLAIM_CUST_CTRL mM_CLAIM_CUST_CTRL = new M_CLAIM_CUST_CTRL();

	// SEQ_SALES_H_NOクラス インスタンス
	public SEQ_SALES_H_NO mSEQ_SALES_H_NO = new SEQ_SALES_H_NO();

	// SEQ_ODRクラス インスタンス
	public SEQ_ODR mSEQ_ODR = new SEQ_ODR();

	// T_SALES_Hクラス インスタンス
	public T_SALES_H mT_SALES_H = new T_SALES_H();

	// T_SALES_Jfクラス インスタンス
	public T_SALES_Jf mT_SALES_Jf = new T_SALES_Jf();

	// T_SALES_CreditRecordクラス インスタンス
	public T_SALES_CreditRecord mT_SALES_CreditRecord = new T_SALES_CreditRecord();

	// T_SALES_Deleteクラス インスタンス
	public T_SALES_Delete mT_SALES_Delete = new T_SALES_Delete();

	// AKA_T_SALES_TEMPクラス インスタンス
	public AKA_T_SALES_TEMP mAKA_T_SALES_TEMP = new AKA_T_SALES_TEMP();

	// T_SALES_TEMP_Deleteクラス インスタンス
	public T_SALES_TEMP_Delete mT_SALES_TEMP_Delete = new T_SALES_TEMP_Delete();

	// T_SALES_H_Deleteクラス インスタンス
	public T_SALES_H_Delete mT_SALES_H_Delete = new T_SALES_H_Delete();

	// USER_MST_SCMクラス インスタンス
	public USER_MST_SCM mUSER_MST_SCM = new USER_MST_SCM();

	// AKA_T_SALES_TEMP_Jaクラス インスタンス
	public AKA_T_SALES_TEMP_Ja mAKA_T_SALES_TEMP_Ja = new AKA_T_SALES_TEMP_Ja();

	// T_SALES_Jaクラス インスタンス
	public T_SALES_Ja mT_SALES_Ja = new T_SALES_Ja();

	// T_SALES_JaScmクラス インスタンス
	public T_SALES_JaScm mT_SALES_JaScm = new T_SALES_JaScm();

	// T_AR_LEDGER_H_TRN_CHECKクラス インスタンス
	public T_AR_LEDGER_H_TRN_CHECK mT_AR_LEDGER_H_TRN_CHECK = new T_AR_LEDGER_H_TRN_CHECK();

	// T_AR_LEDGER_H_CHECKクラス インスタンス
	public T_AR_LEDGER_H_CHECK mT_AR_LEDGER_H_CHECK = new T_AR_LEDGER_H_CHECK();

	// CHECK_ODRクラス インスタンス
	public CHECK_ODR mCHECK_ODR = new CHECK_ODR();

	// CHECK_ODR_Jfクラス インスタンス
	public CHECK_ODR_Jf mCHECK_ODR_Jf = new CHECK_ODR_Jf();

	// CHECK_ODR_Jaクラス インスタンス
	public CHECK_ODR_Ja mCHECK_ODR_Ja = new CHECK_ODR_Ja();

	// T_SALES_MODIFY_Jfクラス インスタンス
	public T_SALES_MODIFY_Jf mT_SALES_MODIFY_Jf = new T_SALES_MODIFY_Jf();

	// T_ODR_UNSTOCK_UPDATE_SLIPクラス インスタンス
	public T_ODR_UNSTOCK_UPDATE_SLIP mT_ODR_UNSTOCK_UPDATE_SLIP = new T_ODR_UNSTOCK_UPDATE_SLIP();

	// checkSHIP_DLV_H_NOクラス インスタンス
	public checkSHIP_DLV_H_NO mcheckSHIP_DLV_H_NO = new checkSHIP_DLV_H_NO();

	// T_AR_LEDGER_H_TRN_Jfクラス インスタンス
	public T_AR_LEDGER_H_TRN_Jf mT_AR_LEDGER_H_TRN_Jf = new T_AR_LEDGER_H_TRN_Jf();

	// T_AR_LEDGER_H_Jfクラス インスタンス
	public T_AR_LEDGER_H_Jf mT_AR_LEDGER_H_Jf = new T_AR_LEDGER_H_Jf();

	// T_SALES_ApprFlgクラス インスタンス
	public T_SALES_ApprFlg mT_SALES_ApprFlg = new T_SALES_ApprFlg();

	// selectT_PJ_ODR_ALCクラス インスタンス
	public selectT_PJ_ODR_ALC mselectT_PJ_ODR_ALC = new selectT_PJ_ODR_ALC();


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
		String m_write_fname="KR0070010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="KR0070010";

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
	public class SYS_INSTALL_OPTIONS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  OPTION_ID, "
+"  INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  OPTION_ID = ? "
+"  AND INSTALL_FLG = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_INSTALL_OPTIONS_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_INSTALL_OPTIONS_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read2
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read3
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOPTION_ID());
				if(isNull(data.getOPTION_ID())) isNull = true;
				ary.addElement(data.getINSTALL_FLG());
				if(isNull(data.getINSTALL_FLG())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SYS_INSTALL_OPTIONS", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getOPTION_ID())) setString(no ++, data.getOPTION_ID(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getINSTALL_FLG())) setString(no ++, data.getINSTALL_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setOPTION_ID( getString(1, rs) );
			data.setINSTALL_FLG( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_clear

			return;
		}

		/**
		 * SYS_INSTALL_OPTIONSクラスの標準コンストラクタ
		 */
		public SYS_INSTALL_OPTIONS()
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectOfInsert extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ODR_UNSTOCK.ORGN_ODR_NO, "
+"  T_ODR_UNSTOCK.ADD_ODR_FLG, "
+"  T_ODR_UNSTOCK.CUST_ODR_NO, "
+"  T_ODR_UNSTOCK.CUST_CD, "
+"  M_CUST.CUST_ANAME, "
+"  T_ODR_UNSTOCK.ITEM_CD, "
+"  T_ODR_UNSTOCK.ITEM_NAME, "
+"  T_ODR_UNSTOCK.ODR_QTY, "
+"  TO_CHAR(T_ODR_UNSTOCK.ODR_ACPT_DATE, 'YYYY/MM/DD'), "
+"  T_ODR_UNSTOCK.TAX_CD, "
+"  T_ODR_UNSTOCK.MODIFY_COUNT, "
+"  T_ODR_UNSTOCK.ODR_ACPT_PSN_CD, "
+"  M_ITEM.STOCK_UNIT, "
+"  M_CUR.CUR_UNIT, "
+"  T_ODR_UNSTOCK.ODR_UNIT_PRICE, "
+"  T_ODR_UNSTOCK.ODR_AMOUNT, "
+"  TO_CHAR(T_ODR_UNSTOCK.DESINATED_DLV_DATE, 'YYYY/MM/DD'), "
+"  T_ODR_UNSTOCK.SLIP_CD "
+"FROM "
+"  T_ODR_UNSTOCK, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_CUR "
+"WHERE "
+"  T_ODR_UNSTOCK.ODR_NO = ? "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = ? "
+"  AND T_ODR_UNSTOCK.CUST_CD = M_CUST.CUST_CD "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = M_CUST.COMPANY_CD "
+"  AND T_ODR_UNSTOCK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND M_CUST.CUR_CD = M_CUR.CUR_CD(+) "
+"  AND T_ODR_UNSTOCK.DEL_FLG = 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectOfInsert_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectOfInsert_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfInsert_read
			if(m_selcmd==null) throw new FoundationException("selectOfInsert", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOfInsert_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfInsert_read2
			if(m_selcmd==null) throw new FoundationException("selectOfInsert", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOfInsert_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfInsert_read3
			if(m_selcmd==null) throw new FoundationException("selectOfInsert", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOfInsert_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_NO());
				if(isNull(data.getODR_NO())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectOfInsert", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getODR_NO())) setString(no ++, data.getODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setORGN_ODR_NO( getString(1, rs) );
			data.seth_ADD_ODR_FLG( getString(2, rs) );
			data.setCUST_ODR_NO( getString(3, rs) );
			data.setCUST_CD( getString(4, rs) );
			data.setCUST_NAME( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setITEM_NAME( getString(7, rs) );
			data.setODR_QTY( getString(8, rs) );
			data.setODR_ACPT_DATE( getString(9, rs) );
			data.setTAX_CD( getString(10, rs) );
			data.setODR_MODIFY_COUNT( getString(11, rs) );
			data.setODR_ACPT_PSN_CD( getString(12, rs) );
			data.setSTOCK_UNIT_ODR( getString(13, rs) );
			data.setCUR_UNIT_PRICE( getString(14, rs) );
			data.setSALES_UNIT_PRICE( getString(15, rs) );
			data.setSALES_AMOUNT( getString(16, rs) );
			data.setDESINATED_DLV_DATE( getString(17, rs) );
			data.setSLIP_CD( getString(18, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectOfInsert", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfInsert_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOfInsert_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectOfInsert_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectOfInsert_clear

			return;
		}

		/**
		 * selectOfInsertクラスの標準コンストラクタ
		 */
		public selectOfInsert()
		{
			//{{user_implement_dev:selectOfInsert_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectOfInsert_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectOfUpdateDeleteJ extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ODR_UNSTOCK.ORGN_ODR_NO, "
+"  T_ODR_UNSTOCK.ADD_ODR_FLG, "
+"  T_ODR_UNSTOCK.CUST_ODR_NO, "
+"  T_ODR_UNSTOCK.CUST_CD, "
+"  M_CUST.CUST_ANAME, "
+"  T_SALES.ITEM_CD, "
+"  T_SALES.ITEM_NAME, "
+"  TO_CHAR(T_SALES.SALES_DATE, 'YYYY/MM/DD'), "
+"  T_SALES.SALES_DEPT_CD, "
+"  M_ORG.ORG_NAME, "
+"  T_SALES.CUST_CHRG_PSN_CD, "
+"  USER_MST.USER_NAME, "
+"  T_SALES.SALES_UNIT_PRICE, "
+"  M_CUR.CUR_UNIT, "
+"  T_SALES.SALES_QTY, "
+"  T_SALES.UNIT_CD, "
+"  T_SALES.SALES_AMOUNT, "
+"  T_ODR_UNSTOCK.ODR_QTY, "
+"  TO_CHAR(T_ODR_UNSTOCK.ODR_ACPT_DATE, 'YYYY/MM/DD'), "
+"  T_ODR_UNSTOCK.TAX_CD, "
+"  T_SALES.REMARKS, "
+"  T_SALES.STATUS, "
+"  T_SALES.SALES_SEQ_NO, "
+"  T_SALES.AI_AR_IF_FLG, "
+"  T_SALES.MODIFY_COUNT, "
+"  T_ODR_UNSTOCK.MODIFY_COUNT, "
+"  M_ITEM.STOCK_UNIT, "
+"  T_ODR_UNSTOCK.ODR_ACPT_PSN_CD, "
+"  TO_CHAR(T_ODR_UNSTOCK.DESINATED_DLV_DATE, 'YYYY/MM/DD') "
+"FROM "
+"  T_ODR_UNSTOCK, "
+"  T_SALES, "
+"  M_CUST, "
+"  M_ORG, "
+"  USER_MST, "
+"  M_CUR, "
+"  M_ITEM "
+"WHERE "
+"  T_ODR_UNSTOCK.ODR_NO = ? "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = ? "
+"  AND T_SALES.SLIP_CD = ? "
+"  AND T_ODR_UNSTOCK.SLIP_CD = T_SALES.SLIP_CD "
+"  AND T_ODR_UNSTOCK.CUST_CD = M_CUST.CUST_CD "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = M_CUST.COMPANY_CD "
+"  AND T_SALES.SALES_DEPT_CD = M_ORG.ORG_CD "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = M_ORG.COMPANY_CD "
+"  AND T_SALES.CUST_CHRG_PSN_CD = USER_MST.USER_CD(+) "
+"  AND T_SALES.CURRNCY_CD = M_CUR.CUR_CD(+) "
+"  AND T_SALES.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_SALES.DEL_FLG = 0 "
+"  AND T_SALES.SALES_TYP = 4 "
+"  AND T_ODR_UNSTOCK.DEL_FLG = 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectOfUpdateDeleteJ_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectOfUpdateDeleteJ_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJ_read
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJ", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOfUpdateDeleteJ_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJ_read2
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJ", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOfUpdateDeleteJ_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJ_read3
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJ", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOfUpdateDeleteJ_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_NO());
				if(isNull(data.getODR_NO())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectOfUpdateDeleteJ", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getODR_NO())) setString(no ++, data.getODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD())) setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setORGN_ODR_NO( getString(1, rs) );
			data.seth_ADD_ODR_FLG( getString(2, rs) );
			data.setCUST_ODR_NO( getString(3, rs) );
			data.setCUST_CD( getString(4, rs) );
			data.setCUST_NAME( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setITEM_NAME( getString(7, rs) );
			data.setSALES_DATE( getString(8, rs) );
			data.setSALES_DEPT_CD( getString(9, rs) );
			data.setORG_NAME( getString(10, rs) );
			data.setCUST_CHRG_PSN_CD( getString(11, rs) );
			data.setUSER_NAME( getString(12, rs) );
			data.setSALES_UNIT_PRICE( getString(13, rs) );
			data.setCUR_UNIT_PRICE( getString(14, rs) );
			data.setSALES_QTY( getString(15, rs) );
			data.setSTOCK_UNIT( getString(16, rs) );
			data.setSALES_AMOUNT( getString(17, rs) );
			data.setODR_QTY( getString(18, rs) );
			data.setODR_ACPT_DATE( getString(19, rs) );
			data.setTAX_CD( getString(20, rs) );
			data.setREMARKS( getString(21, rs) );
			data.setSTATUS( getString(22, rs) );
			data.seth_SALES_SEQ_NO( getString(23, rs) );
			data.setAI_AR_IF_FLG( getString(24, rs) );
			data.setMODIFY_COUNT( getString(25, rs) );
			data.setODR_MODIFY_COUNT( getString(26, rs) );
			data.setSTOCK_UNIT_ODR( getString(27, rs) );
			data.setODR_ACPT_PSN_CD( getString(28, rs) );
			data.setDESINATED_DLV_DATE( getString(29, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJ", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJ_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOfUpdateDeleteJ_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectOfUpdateDeleteJ_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectOfUpdateDeleteJ_clear

			return;
		}

		/**
		 * selectOfUpdateDeleteJクラスの標準コンストラクタ
		 */
		public selectOfUpdateDeleteJ()
		{
			//{{user_implement_dev:selectOfUpdateDeleteJ_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectOfUpdateDeleteJ_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectOfUpdateDeleteJa extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ODR_UNSTOCK.ORGN_ODR_NO, "
+"  T_ODR_UNSTOCK.ADD_ODR_FLG, "
+"  T_ODR_UNSTOCK.CUST_ODR_NO, "
+"  T_ODR_UNSTOCK.CUST_CD, "
+"  M_CUST.CUST_ANAME, "
+"  T_SALES_TEMP.ITEM_CD, "
+"  T_SALES_TEMP.ITEM_NAME, "
+"  TO_CHAR(T_SALES_TEMP.SALES_DATE, 'YYYY/MM/DD'), "
+"  T_SALES_TEMP.SALES_DEPT_CD, "
+"  M_ORG.ORG_NAME, "
+"  T_SALES_TEMP.CUST_CHRG_PSN_CD, "
+"  USER_MST.USER_NAME, "
+"  T_SALES_TEMP.SALES_UNIT_PRICE, "
+"  M_CUR.CUR_UNIT, "
+"  T_SALES_TEMP.SALES_QTY, "
+"  T_SALES_TEMP.UNIT_CD, "
+"  T_SALES_TEMP.SALES_AMOUNT, "
+"  T_ODR_UNSTOCK.ODR_QTY, "
+"  TO_CHAR(T_ODR_UNSTOCK.ODR_ACPT_DATE, 'YYYY/MM/DD'), "
+"  T_ODR_UNSTOCK.TAX_CD, "
+"  T_SALES_TEMP.REMARKS, "
+"  T_SALES_TEMP.SALES_SEQ_NO, "
+"  T_SALES_TEMP.MODIFY_COUNT, "
+"  T_ODR_UNSTOCK.MODIFY_COUNT, "
+"  M_ITEM.STOCK_UNIT, "
+"  T_ODR_UNSTOCK.ODR_ACPT_PSN_CD, "
+"  TO_CHAR(T_ODR_UNSTOCK.DESINATED_DLV_DATE, 'YYYY/MM/DD') "
+"FROM "
+"  T_ODR_UNSTOCK, "
+"  T_SALES_TEMP, "
+"  M_CUST, "
+"  M_ORG, "
+"  USER_MST, "
+"  M_CUR, "
+"  M_ITEM "
+"WHERE "
+"  T_ODR_UNSTOCK.ODR_NO = ? "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = ? "
+"  AND T_SALES_TEMP.SLIP_CD = ? "
+"  AND T_ODR_UNSTOCK.SLIP_CD = T_SALES_TEMP.SLIP_CD "
+"  AND T_ODR_UNSTOCK.CUST_CD = M_CUST.CUST_CD "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = M_CUST.COMPANY_CD "
+"  AND T_SALES_TEMP.SALES_DEPT_CD = M_ORG.ORG_CD "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = M_ORG.COMPANY_CD "
+"  AND T_SALES_TEMP.CUST_CHRG_PSN_CD = USER_MST.USER_CD(+) "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = T_SALES_TEMP.COMPANY_CD "
+"  AND T_SALES_TEMP.CUR_CD = M_CUR.CUR_CD(+) "
+"  AND T_SALES_TEMP.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_SALES_TEMP.DEL_FLG = 0 "
+"  AND T_SALES_TEMP.SALES_TYP = 4 "
+"  AND T_ODR_UNSTOCK.DEL_FLG = 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectOfUpdateDeleteJa_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectOfUpdateDeleteJa_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJa_read
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJa", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOfUpdateDeleteJa_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJa_read2
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJa", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOfUpdateDeleteJa_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJa_read3
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJa", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOfUpdateDeleteJa_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_NO());
				if(isNull(data.getODR_NO())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectOfUpdateDeleteJa", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getODR_NO())) setString(no ++, data.getODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD())) setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setORGN_ODR_NO( getString(1, rs) );
			data.seth_ADD_ODR_FLG( getString(2, rs) );
			data.setCUST_ODR_NO( getString(3, rs) );
			data.setCUST_CD( getString(4, rs) );
			data.setCUST_NAME( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setITEM_NAME( getString(7, rs) );
			data.setSALES_DATE( getString(8, rs) );
			data.setSALES_DEPT_CD( getString(9, rs) );
			data.setORG_NAME( getString(10, rs) );
			data.setCUST_CHRG_PSN_CD( getString(11, rs) );
			data.setUSER_NAME( getString(12, rs) );
			data.setSALES_UNIT_PRICE( getString(13, rs) );
			data.setCUR_UNIT_PRICE( getString(14, rs) );
			data.setSALES_QTY( getString(15, rs) );
			data.setSTOCK_UNIT( getString(16, rs) );
			data.setSALES_AMOUNT( getString(17, rs) );
			data.setODR_QTY( getString(18, rs) );
			data.setODR_ACPT_DATE( getString(19, rs) );
			data.setTAX_CD( getString(20, rs) );
			data.setREMARKS( getString(21, rs) );
			data.seth_SALES_SEQ_NO( getString(22, rs) );
			data.setMODIFY_COUNT( getString(23, rs) );
			data.setODR_MODIFY_COUNT( getString(24, rs) );
			data.setSTOCK_UNIT_ODR( getString(25, rs) );
			data.setODR_ACPT_PSN_CD( getString(26, rs) );
			data.setDESINATED_DLV_DATE( getString(27, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJa", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJa_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOfUpdateDeleteJa_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectOfUpdateDeleteJa_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectOfUpdateDeleteJa_clear

			return;
		}

		/**
		 * selectOfUpdateDeleteJaクラスの標準コンストラクタ
		 */
		public selectOfUpdateDeleteJa()
		{
			//{{user_implement_dev:selectOfUpdateDeleteJa_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectOfUpdateDeleteJa_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectOfUpdateDeleteJf extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ODR_UNSTOCK.ORGN_ODR_NO, "
+"  T_ODR_UNSTOCK.ADD_ODR_FLG, "
+"  T_ODR_UNSTOCK.CUST_ODR_NO, "
+"  T_ODR_UNSTOCK.CUST_CD, "
+"  M_CUST.CUST_ANAME, "
+"  T_SALES.ITEM_CD, "
+"  T_SALES.ITEM_NAME, "
+"  TO_CHAR(T_SALES_H.SALES_DATE, 'YYYY/MM/DD'), "
+"  T_SALES_H.SALES_DEPT_CD, "
+"  M_ORG.ORG_NAME, "
+"  T_SALES_H.CUST_CHRG_PSN_CD, "
+"  USER_MST.USER_NAME, "
+"  T_SALES.SALES_UNIT_PRICE, "
+"  M_CUR.CUR_UNIT, "
+"  T_SALES.SALES_QTY, "
+"  T_SALES.UNIT_CD, "
+"  T_SALES.SALES_AMOUNT, "
+"  T_ODR_UNSTOCK.ODR_QTY, "
+"  TO_CHAR(T_ODR_UNSTOCK.ODR_ACPT_DATE, 'YYYY/MM/DD'), "
+"  T_ODR_UNSTOCK.TAX_CD, "
+"  T_SALES.REMARKS, "
+"  T_SALES.STATUS, "
+"  T_SALES.SALES_SEQ_NO, "
+"  T_SALES_H.MODIFY_COUNT, "
+"  T_SALES.MODIFY_COUNT, "
+"  T_ODR_UNSTOCK.MODIFY_COUNT, "
+"  T_SALES_H.SALES_H_NO, "
+"  M_ITEM.STOCK_UNIT, "
+"  T_ODR_UNSTOCK.ODR_ACPT_PSN_CD, "
+"  T_SALES.AI_AR_IF_FLG, "
+"  TO_CHAR(T_ODR_UNSTOCK.DESINATED_DLV_DATE, 'YYYY/MM/DD') "
+"FROM "
+"  T_ODR_UNSTOCK, "
+"  T_SALES_H, "
+"  T_SALES, "
+"  M_CUST, "
+"  M_ORG, "
+"  USER_MST, "
+"  M_CUR, "
+"  M_ITEM "
+"WHERE "
+"  T_ODR_UNSTOCK.ODR_NO = ? "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = ? "
+"  AND T_SALES_H.SHIP_DLV_H_NO = ? "
+"  AND T_ODR_UNSTOCK.SLIP_CD = T_SALES_H.SHIP_DLV_H_NO "
+"  AND T_ODR_UNSTOCK.CUST_CD = M_CUST.CUST_CD "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = M_CUST.COMPANY_CD "
+"  AND T_SALES.SALES_DEPT_CD = M_ORG.ORG_CD "
+"  AND T_ODR_UNSTOCK.COMPANY_CD = M_ORG.COMPANY_CD "
+"  AND T_SALES.CUST_CHRG_PSN_CD = USER_MST.USER_CD(+) "
+"  AND T_SALES_H.DEL_FLG = 0 "
+"  AND T_SALES_H.SALES_TYP = 4 "
+"  AND T_SALES_H.SALES_H_NO = T_SALES.SALES_H_NO "
+"  AND T_SALES.CURRNCY_CD = M_CUR.CUR_CD(+) "
+"  AND T_SALES.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_SALES.DEL_FLG = 0 "
+"  AND T_SALES.SALES_TYP = 4 "
+"  AND T_ODR_UNSTOCK.DEL_FLG = 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectOfUpdateDeleteJf_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectOfUpdateDeleteJf_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJf_read
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJf", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOfUpdateDeleteJf_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJf_read2
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOfUpdateDeleteJf_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJf_read3
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectOfUpdateDeleteJf_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_NO());
				if(isNull(data.getODR_NO())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectOfUpdateDeleteJf", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getODR_NO())) setString(no ++, data.getODR_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD())) setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setORGN_ODR_NO( getString(1, rs) );
			data.seth_ADD_ODR_FLG( getString(2, rs) );
			data.setCUST_ODR_NO( getString(3, rs) );
			data.setCUST_CD( getString(4, rs) );
			data.setCUST_NAME( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setITEM_NAME( getString(7, rs) );
			data.setSALES_DATE( getString(8, rs) );
			data.setSALES_DEPT_CD( getString(9, rs) );
			data.setORG_NAME( getString(10, rs) );
			data.setCUST_CHRG_PSN_CD( getString(11, rs) );
			data.setUSER_NAME( getString(12, rs) );
			data.setSALES_UNIT_PRICE( getString(13, rs) );
			data.setCUR_UNIT_PRICE( getString(14, rs) );
			data.setSALES_QTY( getString(15, rs) );
			data.setSTOCK_UNIT( getString(16, rs) );
			data.setSALES_AMOUNT( getString(17, rs) );
			data.setODR_QTY( getString(18, rs) );
			data.setODR_ACPT_DATE( getString(19, rs) );
			data.setTAX_CD( getString(20, rs) );
			data.setREMARKS( getString(21, rs) );
			data.setSTATUS( getString(22, rs) );
			data.seth_SALES_SEQ_NO( getString(23, rs) );
			data.setMODIFY_COUNT( getString(24, rs) );
			data.setH_MODIFY_COUNT( getString(25, rs) );
			data.setODR_MODIFY_COUNT( getString(26, rs) );
			data.seth_SALES_H_NO( getString(27, rs) );
			data.setSTOCK_UNIT_ODR( getString(28, rs) );
			data.setODR_ACPT_PSN_CD( getString(29, rs) );
			data.setAI_AR_IF_FLG( getString(30, rs) );
			data.setDESINATED_DLV_DATE( getString(31, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectOfUpdateDeleteJf", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectOfUpdateDeleteJf_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectOfUpdateDeleteJf_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectOfUpdateDeleteJf_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectOfUpdateDeleteJf_clear

			return;
		}

		/**
		 * selectOfUpdateDeleteJfクラスの標準コンストラクタ
		 */
		public selectOfUpdateDeleteJf()
		{
			//{{user_implement_dev:selectOfUpdateDeleteJf_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectOfUpdateDeleteJf_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ODR_UNSTOCK extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MODIFY_COUNT "
+"FROM "
+"  T_ODR_UNSTOCK "
+"WHERE "
+"  ODR_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_ODR_UNSTOCK "
+"SET "
+"  TAX_CD = ? "
+"WHERE "
+"  ODR_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ODR_UNSTOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ODR_UNSTOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ODR_UNSTOCK_read
			if(m_selcmd==null) throw new FoundationException("T_ODR_UNSTOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ODR_UNSTOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ODR_UNSTOCK_read2
			if(m_selcmd==null) throw new FoundationException("T_ODR_UNSTOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_ODR_UNSTOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ODR_UNSTOCK_read3
			if(m_selcmd==null) throw new FoundationException("T_ODR_UNSTOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_ODR_UNSTOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ODR_UNSTOCK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ODR_UNSTOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_ODR_UNSTOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(5, data.getODR_NO(), stmt);

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
			//{{user_implement_dev:T_ODR_UNSTOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ODR_UNSTOCK_clear

			return;
		}

		/**
		 * T_ODR_UNSTOCKクラスの標準コンストラクタ
		 */
		public T_ODR_UNSTOCK()
		{
			//{{user_implement_dev:T_ODR_UNSTOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ODR_UNSTOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM.STOCK_UNIT, "
+"  M_ITEM.UNIT_QTY_TYP "
+"FROM "
+"  M_ITEM "
+"WHERE "
+"  M_ITEM.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setITEM_NAME( getString(1, rs) );
			data.setSTOCK_UNIT( getString(2, rs) );
			data.setUNIT_QTY_TYP( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_ITEM_clear

			return;
		}

		/**
		 * M_ITEMクラスの標準コンストラクタ
		 */
		public M_ITEM()
		{
			//{{user_implement_dev:M_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_CUST_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_CUST_ITEM.CUST_ITEM_NAME, "
+"  M_ITEM.STOCK_UNIT, "
+"  M_ITEM.UNIT_QTY_TYP "
+"FROM "
+"  M_CUST_ITEM, "
+"  M_ITEM "
+"WHERE "
+"  M_CUST_ITEM.COMPANY_CD = ? "
+"  AND M_CUST_ITEM.CUST_CD = ? "
+"  AND M_CUST_ITEM.CUST_ITEM_CD = ? "
+"  AND M_CUST_ITEM.ITEM_CD = M_ITEM.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_CUST_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_CUST_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_ITEM_read
			if(m_selcmd==null) throw new FoundationException("M_CUST_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CUST_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("M_CUST_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_CUST_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("M_CUST_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_CUST_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setITEM_NAME( getString(1, rs) );
			data.setSTOCK_UNIT( getString(2, rs) );
			data.setUNIT_QTY_TYP( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_CUST_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CUST_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_CUST_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_CUST_ITEM_clear

			return;
		}

		/**
		 * M_CUST_ITEMクラスの標準コンストラクタ
		 */
		public M_CUST_ITEM()
		{
			//{{user_implement_dev:M_CUST_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_CUST_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_ORG extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ORG_NAME "
+"FROM "
+"  M_ORG "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND ORG_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_ORG_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_ORG_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ORG_read
			if(m_selcmd==null) throw new FoundationException("M_ORG", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ORG_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ORG_read2
			if(m_selcmd==null) throw new FoundationException("M_ORG", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_ORG_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ORG_read3
			if(m_selcmd==null) throw new FoundationException("M_ORG", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_ORG_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getSALES_DEPT_CD());
				if(isNull(data.getSALES_DEPT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSALES_DEPT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setORG_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_ORG", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ORG_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ORG_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_ORG_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_ORG_clear

			return;
		}

		/**
		 * M_ORGクラスの標準コンストラクタ
		 */
		public M_ORG()
		{
			//{{user_implement_dev:M_ORG_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_ORG_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class USER_MST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  USER_NAME "
+"FROM "
+"  USER_MST "
+"WHERE "
+"  USER_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:USER_MST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:USER_MST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_read
			if(m_selcmd==null) throw new FoundationException("USER_MST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:USER_MST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_read2
			if(m_selcmd==null) throw new FoundationException("USER_MST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:USER_MST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_read3
			if(m_selcmd==null) throw new FoundationException("USER_MST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:USER_MST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCUST_CHRG_PSN_CD());
				if(isNull(data.getCUST_CHRG_PSN_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCUST_CHRG_PSN_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setUSER_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("USER_MST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:USER_MST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:USER_MST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:USER_MST_clear

			return;
		}

		/**
		 * USER_MSTクラスの標準コンストラクタ
		 */
		public USER_MST()
		{
			//{{user_implement_dev:USER_MST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:USER_MST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_TAX extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(M_TAX.OLD_TAX_RATE_1) as TAX_RATE_1, "
+"  to_char(M_TAX.OLD_TAX_RATE_2) as TAX_RATE_2, "
+"  to_char(M_TAX.OLD_TAX_RATE_3) as TAX_RATE_3, "
+"  to_char(M_TAX.ROUND_TYP) as TAX_ROUND_TYP "
+"from "
+"  M_TAX "
+"where "
+"  M_TAX.TAX_CD = ? "
+"  and M_TAX.NEW_TAX_RATE_START_DATE > to_date(?, 'YYYY/MM/DD') "
+"union all "
+"select "
+"  to_char(M_TAX.NEW_TAX_RATE_1) as TAX_RATE_1, "
+"  to_char(M_TAX.NEW_TAX_RATE_2) as TAX_RATE_2, "
+"  to_char(M_TAX.NEW_TAX_RATE_3) as TAX_RATE_3, "
+"  to_char(M_TAX.ROUND_TYP) as TAX_ROUND_TYP "
+"from "
+"  M_TAX "
+"where "
+"  M_TAX.TAX_CD = ? "
+"  and M_TAX.NEW_TAX_RATE_START_DATE <= to_date(?, 'YYYY/MM/DD')";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_TAX_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_TAX_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_read
			if(m_selcmd==null) throw new FoundationException("M_TAX", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_TAX_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_read2
			if(m_selcmd==null) throw new FoundationException("M_TAX", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_TAX_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_read3
			if(m_selcmd==null) throw new FoundationException("M_TAX", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_TAX_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getTAX_CD());
				if(isNull(data.getTAX_CD())) isNull = true;
				ary.addElement(data.getSALES_DATE());
				if(isNull(data.getSALES_DATE())) isNull = true;
				ary.addElement(data.getTAX_CD());
				if(isNull(data.getTAX_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getTAX_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSALES_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getTAX_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSALES_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setTAX_RATE_1( getString(1, rs) );
			data.setTAX_RATE_2( getString(2, rs) );
			data.setTAX_RATE_3( getString(3, rs) );
			data.setTAX_ROUND_TYP( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_TAX", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_TAX_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_TAX_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_TAX_clear

			return;
		}

		/**
		 * M_TAXクラスの標準コンストラクタ
		 */
		public M_TAX()
		{
			//{{user_implement_dev:M_TAX_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_TAX_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_AR_LEDGER_H extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  1 "
+"FROM "
+"  T_AR_LEDGER_H "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = ? "
+"  AND SLIP_CD = ? "
+"  AND SALES_MODIFICATION_FLG = 0 "
+"  AND INSPC_ACPT_CRCT_TYP = 2 "
+"  AND STATUS < 40";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_AR_LEDGER_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_AR_LEDGER_H_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_read
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_read2
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_read3
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_AR_LEDGER_H", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_TYP())) setString(no ++, data.getSLIP_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD())) setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.sethaveFlag( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_AR_LEDGER_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_clear

			return;
		}

		/**
		 * T_AR_LEDGER_Hクラスの標準コンストラクタ
		 */
		public T_AR_LEDGER_H()
		{
			//{{user_implement_dev:T_AR_LEDGER_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  1 "
+"FROM "
+"  T_AR_LEDGER_H_TRN "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND SLIP_TYP = ? "
+"  AND SLIP_CD = ? "
+"  AND SALES_MODIFICATION_FLG = 0 "
+"  AND INSPC_ACPT_CRCT_TYP = 2 "
+"  AND STATUS < 40";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_AR_LEDGER_H_TRN_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_AR_LEDGER_H_TRN_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_read
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_read2
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_read3
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_AR_LEDGER_H_TRN", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_TYP())) setString(no ++, data.getSLIP_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD())) setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.sethaveFlag( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * T_AR_LEDGER_H_TRNクラスの標準コンストラクタ
		 */
		public T_AR_LEDGER_H_TRN()
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_CUST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_CUST.CUST_ANAME, "
+"  M_CUST.CUR_CD, "
+"  M_CUST.EXCH_TYP, "
+"  M_CUST.INSPC_ACPT_TYP, "
+"  M_CUST.DETAIL_ROUND_TYP "
+"FROM "
+"  M_CUST "
+"WHERE "
+"  M_CUST.COMPANY_CD = ? "
+"  AND M_CUST.CUST_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_CUST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_CUST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_read
			if(m_selcmd==null) throw new FoundationException("M_CUST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CUST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_read2
			if(m_selcmd==null) throw new FoundationException("M_CUST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_CUST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_read3
			if(m_selcmd==null) throw new FoundationException("M_CUST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_CUST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setCUST_NAME( getString(1, rs) );
			data.seth_CUR_CD( getString(2, rs) );
			data.setEXCH_TYP( getString(3, rs) );
			data.setINSPC_ACPT_TYP( getString(4, rs) );
			data.setDETAIL_ROUND_TYP( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_CUST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CUST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_CUST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_CUST_clear

			return;
		}

		/**
		 * M_CUSTクラスの標準コンストラクタ
		 */
		public M_CUST()
		{
			//{{user_implement_dev:M_CUST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_CUST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  APPR_FLG, "
+"  MODIFY_COUNT "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  SLIP_CD = ? "
+"  AND DEL_FLG = 0 "
+"  AND SALES_TYP = 4";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SALES(\"SALES_SEQ_NO\", \"SLIP_CD\", \"SALES_TYP\", \"CUST_CD\", \"ITEM_CD\", \"ITEM_NAME\", \"CUST_ODR_NO\", \"SALES_DATE\", \"SALES_DEPT_CD\", \"VEND_CD\", \"PRD_ODR_PLACE_CD\", \"CUST_CHRG_PSN_CD\", \"ODR_ACPT_PSN_CD\", \"SALES_QTY\", \"SALES_UNIT_PRICE\", \"UNIT_CD\", \"SALES_AMOUNT\", \"SALES_AMOUNT_EXCH_RATES\", \"INSPC_ACPT_DATE\", \"INSPC_ACPT_QTY\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", \"ORG_SLIP_CD\", \"CURRNCY_CD\", \"SPCL_PRICE_CO\", \"REMARKS\", \"INSPC_ACPT_TYP\", \"STATUS\", \"DEL_FLG\", \"APPR_FLG\", \"APPR_ID\", \"APPR_DATE\") "
+"VALUES "
+"  (to_number(?), ?, to_number(?), ?, ?, ?, ?, to_date(?, 'YYYY/MM/DD'), ?, ?, ?, ?, ?, to_number(?), to_number(?), ?, to_number(?), to_number(?), to_date(?, 'YYYY/MM/DD'), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), ?, ?, ?, ?, to_number(?), to_number(?), to_number(?), to_number(?), ?, to_date(?))";
		protected String m_updcmd = "update "
+"  T_SALES "
+"set "
+"  \"SLIP_CD\" = ?, "
+"  \"SALES_TYP\" = to_number(?), "
+"  \"CUST_CD\" = ?, "
+"  \"ITEM_CD\" = ?, "
+"  \"ITEM_NAME\" = ?, "
+"  \"CUST_ODR_NO\" = ?, "
+"  \"SALES_DATE\" = to_date(?, 'YYYY/MM/DD'), "
+"  \"SALES_DEPT_CD\" = ?, "
+"  \"VEND_CD\" = ?, "
+"  \"PRD_ODR_PLACE_CD\" = ?, "
+"  \"CUST_CHRG_PSN_CD\" = ?, "
+"  \"ODR_ACPT_PSN_CD\" = ?, "
+"  \"SALES_QTY\" = to_number(?), "
+"  \"SALES_UNIT_PRICE\" = to_number(?), "
+"  \"UNIT_CD\" = ?, "
+"  \"SALES_AMOUNT\" = to_number(?), "
+"  \"SALES_AMOUNT_EXCH_RATES\" = to_number(?), "
+"  \"INSPC_ACPT_DATE\" = to_date(?, 'YYYY/MM/DD'), "
+"  \"INSPC_ACPT_QTY\" = to_number(?), "
+"  \"EXTERNAL_TAX_SALES_AMOUNT\" = to_number(?), "
+"  \"INTERNAL_TAX_SALES_AMOUNT\" = to_number(?), "
+"  \"TAXFREE_SALES_AMOUNT\" = to_number(?), "
+"  \"TAX_CREDIT_SALES_AMOUNT\" = to_number(?), "
+"  \"EXTERNAL_TAX_AMOUNT\" = to_number(?), "
+"  \"INTERNAL_TAX_AMOUNT\" = to_number(?), "
+"  \"TAX_AMOUNT_1\" = to_number(?), "
+"  \"TAX_AMOUNT_2\" = to_number(?), "
+"  \"TAX_AMOUNT_3\" = to_number(?), "
+"  \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" = to_number(?), "
+"  \"ORG_SLIP_CD\" = ?, "
+"  \"CURRNCY_CD\" = ?, "
+"  \"SPCL_PRICE_CO\" = ?, "
+"  \"REMARKS\" = ?, "
+"  \"INSPC_ACPT_TYP\" = to_number(?), "
+"  \"STATUS\" = to_number(?), "
+"  \"DEL_FLG\" = to_number(?) "
+"where "
+"  T_SALES.\"DEL_FLG\" = 0 "
+"  and T_SALES.\"SALES_SEQ_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
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
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
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
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setAPPR_FLG( getString(1, rs) );
			data.setMODIFY_COUNT( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getSALES_SEQ_NO(), stmt);
				setString(8, data.getSLIP_CD(), stmt);
				setString(9, data.getSALES_TYP(), stmt);
				setString(10, data.getCUST_CD(), stmt);
				setString(11, data.getITEM_CD(), stmt);
				setString(12, data.getITEM_NAME(), stmt);
				setString(13, data.getCUST_ODR_NO(), stmt);
				setString(14, data.getSALES_DATE(), stmt);
				setString(15, data.getSALES_DEPT_CD(), stmt);
				setString(16, data.getVEND_CD(), stmt);
				setString(17, data.getPRD_ODR_PLACE_CD(), stmt);
				setString(18, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(19, data.getODR_ACPT_PSN_CD(), stmt);
				setString(20, data.getSALES_QTY(), stmt);
				setString(21, data.getSALES_UNIT_PRICE(), stmt);
				setString(22, data.getUNIT_CD(), stmt);
				setString(23, data.getSALES_AMOUNT(), stmt);
				setString(24, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(25, data.getINSPC_ACPT_DATE(), stmt);
				setString(26, data.getINSPC_ACPT_QTY(), stmt);
				setString(27, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(28, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(29, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(30, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(31, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(32, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(33, data.getTAX_AMOUNT_1(), stmt);
				setString(34, data.getTAX_AMOUNT_2(), stmt);
				setString(35, data.getTAX_AMOUNT_3(), stmt);
				setString(36, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(37, data.getORG_SLIP_CD(), stmt);
				setString(38, data.getCURRNCY_CD(), stmt);
				setString(39, data.getSPCL_PRICE_CO(), stmt);
				setString(40, data.getREMARKS(), stmt);
				setString(41, data.getINSPC_ACPT_TYP(), stmt);
				setString(42, data.getSTATUS(), stmt);
				setString(43, data.getDEL_FLG(), stmt);
				setString(44, data.getAPPR_FLG(), stmt);
				setString(45, data.getAPPR_ID(), stmt);
				setString(46, data.getAPPR_DATE(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getSLIP_CD(), stmt);
				setString(5, data.getSALES_TYP(), stmt);
				setString(6, data.getCUST_CD(), stmt);
				setString(7, data.getITEM_CD(), stmt);
				setString(8, data.getITEM_NAME(), stmt);
				setString(9, data.getCUST_ODR_NO(), stmt);
				setString(10, data.getSALES_DATE(), stmt);
				setString(11, data.getSALES_DEPT_CD(), stmt);
				setString(12, data.getVEND_CD(), stmt);
				setString(13, data.getPRD_ODR_PLACE_CD(), stmt);
				setString(14, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(15, data.getODR_ACPT_PSN_CD(), stmt);
				setString(16, data.getSALES_QTY(), stmt);
				setString(17, data.getSALES_UNIT_PRICE(), stmt);
				setString(18, data.getUNIT_CD(), stmt);
				setString(19, data.getSALES_AMOUNT(), stmt);
				setString(20, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(21, data.getINSPC_ACPT_DATE(), stmt);
				setString(22, data.getINSPC_ACPT_QTY(), stmt);
				setString(23, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(24, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(25, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(26, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(27, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(28, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(29, data.getTAX_AMOUNT_1(), stmt);
				setString(30, data.getTAX_AMOUNT_2(), stmt);
				setString(31, data.getTAX_AMOUNT_3(), stmt);
				setString(32, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(33, data.getORG_SLIP_CD(), stmt);
				setString(34, data.getCURRNCY_CD(), stmt);
				setString(35, data.getSPCL_PRICE_CO(), stmt);
				setString(36, data.getREMARKS(), stmt);
				setString(37, data.getINSPC_ACPT_TYP(), stmt);
				setString(38, data.getSTATUS(), stmt);
				setString(39, data.getDEL_FLG(), stmt);
				setString(40, data.geth_SALES_SEQ_NO(), stmt);

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
	public class SYS_PARAMETER extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  VALUE "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  NAME = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_PARAMETER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_PARAMETER_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAMETER_read
			if(m_selcmd==null) throw new FoundationException("SYS_PARAMETER", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_PARAMETER_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAMETER_read2
			if(m_selcmd==null) throw new FoundationException("SYS_PARAMETER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_PARAMETER_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAMETER_read3
			if(m_selcmd==null) throw new FoundationException("SYS_PARAMETER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_PARAMETER_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getNAME());
				if(isNull(data.getNAME())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getNAME(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setVALUE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_PARAMETER", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAMETER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_PARAMETER_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_PARAMETER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_PARAMETER_clear

			return;
		}

		/**
		 * SYS_PARAMETERクラスの標準コンストラクタ
		 */
		public SYS_PARAMETER()
		{
			//{{user_implement_dev:SYS_PARAMETER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_PARAMETER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_INSTALL_OPTIONS_AI extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_INSTALL_OPTIONS.INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  SYS_INSTALL_OPTIONS.OPTION_ID = 'AiR'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_INSTALL_OPTIONS_AI_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_INSTALL_OPTIONS_AI_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_AI_read
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS_AI", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_AI_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_AI_read2
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS_AI", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_AI_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_AI_read3
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS_AI", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_AI_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setINSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS_AI", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_AI_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_AI_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_AI_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_AI_clear

			return;
		}

		/**
		 * SYS_INSTALL_OPTIONS_AIクラスの標準コンストラクタ
		 */
		public SYS_INSTALL_OPTIONS_AI()
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_AI_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_AI_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_MY_COMPANY extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COMPANY_CD "
+"FROM "
+"  SYS_MY_COMPANY "
+"WHERE "
+"  CTRL_CD = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_MY_COMPANY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_MY_COMPANY_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_MY_COMPANY_read
			if(m_selcmd==null) throw new FoundationException("SYS_MY_COMPANY", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_MY_COMPANY_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_MY_COMPANY_read2
			if(m_selcmd==null) throw new FoundationException("SYS_MY_COMPANY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_MY_COMPANY_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_MY_COMPANY_read3
			if(m_selcmd==null) throw new FoundationException("SYS_MY_COMPANY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_MY_COMPANY_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_MY_COMPANY", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_MY_COMPANY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_MY_COMPANY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_MY_COMPANY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_MY_COMPANY_clear

			return;
		}

		/**
		 * SYS_MY_COMPANYクラスの標準コンストラクタ
		 */
		public SYS_MY_COMPANY()
		{
			//{{user_implement_dev:SYS_MY_COMPANY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_MY_COMPANY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_CLASS_CODE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_CLASS_CODE.CODE "
+"FROM "
+"  SYS_CLASS_CODE "
+"WHERE "
+"  SYS_CLASS_CODE.SYS_CLASS = ? "
+"  AND SYS_CLASS_CODE.CLASS_CODE = 'PLANT_WEB'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_CLASS_CODE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_CLASS_CODE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_CLASS_CODE_read
			if(m_selcmd==null) throw new FoundationException("SYS_CLASS_CODE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_CLASS_CODE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_CLASS_CODE_read2
			if(m_selcmd==null) throw new FoundationException("SYS_CLASS_CODE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_CLASS_CODE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_CLASS_CODE_read3
			if(m_selcmd==null) throw new FoundationException("SYS_CLASS_CODE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_CLASS_CODE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSYS_CLASS());
				if(isNull(data.getSYS_CLASS())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSYS_CLASS(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setPLANT_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_CLASS_CODE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_CLASS_CODE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_CLASS_CODE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_CLASS_CODE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_CLASS_CODE_clear

			return;
		}

		/**
		 * SYS_CLASS_CODEクラスの標準コンストラクタ
		 */
		public SYS_CLASS_CODE()
		{
			//{{user_implement_dev:SYS_CLASS_CODE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_CLASS_CODE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(SYS_DATE_CTRL.BUSINESS_OPR_DATE, 'YYYY/MM/DD') "
+"FROM "
+"  SYS_DATE_CTRL "
+"WHERE "
+"  SYS_DATE_CTRL.PLANT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_DATE_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_DATE_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DATE_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SYS_DATE_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DATE_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DATE_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SYS_DATE_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_DATE_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DATE_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SYS_DATE_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_DATE_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setBUSINESS_OPR_DATE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_DATE_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DATE_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DATE_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_DATE_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_DATE_CTRL_clear

			return;
		}

		/**
		 * SYS_DATE_CTRLクラスの標準コンストラクタ
		 */
		public SYS_DATE_CTRL()
		{
			//{{user_implement_dev:SYS_DATE_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_DATE_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_CUR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_CUR.DECIMAL_FIG, "
+"  M_CUR.CUR_UNIT "
+"FROM "
+"  M_CUR "
+"WHERE "
+"  M_CUR.CUR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_CUR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_CUR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUR_read
			if(m_selcmd==null) throw new FoundationException("M_CUR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CUR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUR_read2
			if(m_selcmd==null) throw new FoundationException("M_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_CUR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUR_read3
			if(m_selcmd==null) throw new FoundationException("M_CUR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_CUR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_CUR_CD());
				if(isNull(data.geth_CUR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_CUR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setDECIMAL_FIG( getString(1, rs) );
			data.setCUR_UNIT( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_CUR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CUR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_CUR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_CUR_clear

			return;
		}

		/**
		 * M_CURクラスの標準コンストラクタ
		 */
		public M_CUR()
		{
			//{{user_implement_dev:M_CUR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_CUR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_INSTALL_OPTIONS_B extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_INSTALL_OPTIONS.INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  SYS_INSTALL_OPTIONS.OPTION_ID like 'B%'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_INSTALL_OPTIONS_B_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_INSTALL_OPTIONS_B_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_B_read
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS_B", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_B_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_B_read2
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS_B", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_B_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_B_read3
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS_B", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_B_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setINSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS_B", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_B_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_B_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_B_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_B_clear

			return;
		}

		/**
		 * SYS_INSTALL_OPTIONS_Bクラスの標準コンストラクタ
		 */
		public SYS_INSTALL_OPTIONS_B()
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_B_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_B_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SEQ_SALES_SEQ_NO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SEQ_SALES_SEQ_NO.NEXTVAL "
+"FROM "
+"  DUAL";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SEQ_SALES_SEQ_NO_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SEQ_SALES_SEQ_NO_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_SALES_SEQ_NO_read
			if(m_selcmd==null) throw new FoundationException("SEQ_SALES_SEQ_NO", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SEQ_SALES_SEQ_NO_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_SALES_SEQ_NO_read2
			if(m_selcmd==null) throw new FoundationException("SEQ_SALES_SEQ_NO", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SEQ_SALES_SEQ_NO_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_SALES_SEQ_NO_read3
			if(m_selcmd==null) throw new FoundationException("SEQ_SALES_SEQ_NO", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SEQ_SALES_SEQ_NO_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSALES_SEQ_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SEQ_SALES_SEQ_NO", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_SALES_SEQ_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SEQ_SALES_SEQ_NO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SEQ_SALES_SEQ_NO_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SEQ_SALES_SEQ_NO_clear

			return;
		}

		/**
		 * SEQ_SALES_SEQ_NOクラスの標準コンストラクタ
		 */
		public SEQ_SALES_SEQ_NO()
		{
			//{{user_implement_dev:SEQ_SALES_SEQ_NO_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SEQ_SALES_SEQ_NO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_TEMP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES_TEMP.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\" "
+"FROM "
+"  T_SALES_TEMP "
+"WHERE "
+"  T_SALES_TEMP.\"SALES_TYP\" = 4 "
+"  AND T_SALES_TEMP.\"DEL_FLG\" = 0 "
+"  AND T_SALES_TEMP.\"SLIP_CD\" = ? "
+"  AND T_SALES_TEMP.\"COMPANY_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SALES_TEMP(T_SALES_TEMP.\"SALES_SEQ_NO\", T_SALES_TEMP.\"COMPANY_CD\", T_SALES_TEMP.\"SHIP_ODR_NO\", T_SALES_TEMP.\"SHIP_SEQ_NO\", T_SALES_TEMP.\"SLIP_CD\", T_SALES_TEMP.\"SALES_TYP\", T_SALES_TEMP.\"CUST_CD\", T_SALES_TEMP.\"ITEM_CD\", T_SALES_TEMP.\"ITEM_NAME\", T_SALES_TEMP.\"CUST_ODR_NO\", T_SALES_TEMP.\"SALES_DATE\", T_SALES_TEMP.\"SALES_DEPT_CD\", T_SALES_TEMP.\"VEND_CD\", T_SALES_TEMP.\"PRD_ODR_PLACE_CD\", T_SALES_TEMP.\"CUST_CHRG_PSN_CD\", T_SALES_TEMP.\"ODR_ACPT_PSN_CD\", T_SALES_TEMP.\"SALES_QTY\", T_SALES_TEMP.\"SALES_UNIT_PRICE\", T_SALES_TEMP.\"UNIT_CD\", T_SALES_TEMP.\"SALES_AMOUNT\", T_SALES_TEMP.\"SALES_AMOUNT_EXCH_RATES\", T_SALES_TEMP.\"EXTERNAL_TAX_SALES_AMOUNT\", T_SALES_TEMP.\"INTERNAL_TAX_SALES_AMOUNT\", T_SALES_TEMP.\"TAXFREE_SALES_AMOUNT\", T_SALES_TEMP.\"TAX_CREDIT_SALES_AMOUNT\", T_SALES_TEMP.\"EXTERNAL_TAX_AMOUNT\", T_SALES_TEMP.\"INTERNAL_TAX_AMOUNT\", T_SALES_TEMP.\"TAX_AMOUNT_1\", T_SALES_TEMP.\"TAX_AMOUNT_2\", T_SALES_TEMP.\"TAX_AMOUNT_3\", T_SALES_TEMP.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", T_SALES_TEMP.\"ORG_SLIP_CD\", T_SALES_TEMP.\"CUR_CD\", T_SALES_TEMP.\"AMOUNT_TYP\", T_SALES_TEMP.\"REMARKS\", T_SALES_TEMP.\"INSPC_ACPT_TYP\", T_SALES_TEMP.\"TEMP_SALES_TYP\", T_SALES_TEMP.\"SALES_DISAGREEMENT_TYP\", T_SALES_TEMP.\"SALES_FLG\", T_SALES_TEMP.\"SALES_IF_FLG\", T_SALES_TEMP.\"DEL_FLG\", T_SALES_TEMP.\"CONS_TYP\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NVL(?, 0))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SALES_TEMP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_TEMP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_TEMP_read
			if(m_selcmd==null) throw new FoundationException("T_SALES_TEMP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_TEMP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_TEMP_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES_TEMP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_TEMP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_TEMP_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES_TEMP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_TEMP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES_TEMP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_TEMP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_TEMP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getSALES_SEQ_NO(), stmt);
				setString(8, data.getCOMPANY_CD(), stmt);
				setString(9, data.getSHIP_ODR_NO(), stmt);
				setString(10, data.getSHIP_SEQ_NO(), stmt);
				setString(11, data.getSLIP_CD(), stmt);
				setString(12, data.getSALES_TYP(), stmt);
				setString(13, data.getCUST_CD(), stmt);
				setString(14, data.getITEM_CD(), stmt);
				setString(15, data.getITEM_NAME(), stmt);
				setString(16, data.getCUST_ODR_NO(), stmt);
				setString(17, data.getSALES_DATE(), stmt);
				setString(18, data.getSALES_DEPT_CD(), stmt);
				setString(19, data.getVEND_CD(), stmt);
				setString(20, data.getPRD_ODR_PLACE_CD(), stmt);
				setString(21, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(22, data.getODR_ACPT_PSN_CD(), stmt);
				setString(23, data.getSALES_QTY(), stmt);
				setString(24, data.getSALES_UNIT_PRICE(), stmt);
				setString(25, data.getUNIT_CD(), stmt);
				setString(26, data.getSALES_AMOUNT(), stmt);
				setString(27, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(28, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(29, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(30, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(31, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(32, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(33, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(34, data.getTAX_AMOUNT_1(), stmt);
				setString(35, data.getTAX_AMOUNT_2(), stmt);
				setString(36, data.getTAX_AMOUNT_3(), stmt);
				setString(37, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(38, data.getORG_SLIP_CD(), stmt);
				setString(39, data.getCUR_CD(), stmt);
				setString(40, data.getAMOUNT_TYP(), stmt);
				setString(41, data.getREMARKS(), stmt);
				setString(42, data.getINSPC_ACPT_TYP(), stmt);
				setString(43, data.getTEMP_SALES_TYP(), stmt);
				setString(44, data.getSALES_DISAGREEMENT_TYP(), stmt);
				setString(45, data.getSALES_FLG(), stmt);
				setString(46, data.getSALES_IF_FLG(), stmt);
				setString(47, data.getDEL_FLG(), stmt);
				setString(48, data.getCONS_TYP(), stmt);

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
			//{{user_implement_dev:T_SALES_TEMP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_TEMP_clear

			return;
		}

		/**
		 * T_SALES_TEMPクラスの標準コンストラクタ
		 */
		public T_SALES_TEMP()
		{
			//{{user_implement_dev:T_SALES_TEMP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_TEMP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_CLAIM_CUST_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_CLAIM_CUST_CTRL.\"BILL_ADDRESSEE_CD\" as \"BILL_ADDRESSEE_CD\", "
+"  M_CLAIM_CUST_CTRL.\"STL_COND_CD\" as \"STL_COND_CD\" "
+"FROM "
+"  M_CLAIM_CUST_CTRL "
+"WHERE "
+"  M_CLAIM_CUST_CTRL.\"CUST_CD\" = ? "
+"ORDER BY "
+"  M_CLAIM_CUST_CTRL.\"BILL_ADDRESSEE_CD\", "
+"  M_CLAIM_CUST_CTRL.\"STL_COND_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_CLAIM_CUST_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_CLAIM_CUST_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CLAIM_CUST_CTRL_read
			if(m_selcmd==null) throw new FoundationException("M_CLAIM_CUST_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CLAIM_CUST_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CLAIM_CUST_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("M_CLAIM_CUST_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_CLAIM_CUST_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CLAIM_CUST_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("M_CLAIM_CUST_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_CLAIM_CUST_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setBILL_ADDRESSEE_CD( getString(1, rs) );
			data.setSTL_COND_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_CLAIM_CUST_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CLAIM_CUST_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_CLAIM_CUST_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_CLAIM_CUST_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_CLAIM_CUST_CTRL_clear

			return;
		}

		/**
		 * M_CLAIM_CUST_CTRLクラスの標準コンストラクタ
		 */
		public M_CLAIM_CUST_CTRL()
		{
			//{{user_implement_dev:M_CLAIM_CUST_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_CLAIM_CUST_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SEQ_SALES_H_NO extends DataObject
	{
		protected String m_selcmd = "select "
+"  'SHN' || lpad(to_char(SEQ_SALES_H_NO.NEXTVAL), 10, 0) as \"SALES_H_NO\" "
+"from "
+"  dual";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SEQ_SALES_H_NO_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SEQ_SALES_H_NO_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_SALES_H_NO_read
			if(m_selcmd==null) throw new FoundationException("SEQ_SALES_H_NO", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SEQ_SALES_H_NO_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_SALES_H_NO_read2
			if(m_selcmd==null) throw new FoundationException("SEQ_SALES_H_NO", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SEQ_SALES_H_NO_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_SALES_H_NO_read3
			if(m_selcmd==null) throw new FoundationException("SEQ_SALES_H_NO", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SEQ_SALES_H_NO_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSALES_H_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SEQ_SALES_H_NO", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_SALES_H_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SEQ_SALES_H_NO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SEQ_SALES_H_NO_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SEQ_SALES_H_NO_clear

			return;
		}

		/**
		 * SEQ_SALES_H_NOクラスの標準コンストラクタ
		 */
		public SEQ_SALES_H_NO()
		{
			//{{user_implement_dev:SEQ_SALES_H_NO_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SEQ_SALES_H_NO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SEQ_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  'SDN' || lpad(to_char(SEQ_SHIP_DLV_NO.NEXTVAL), 10, 0) as \"SHIP_DLV_H_NO\" "
+"from "
+"  dual";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SEQ_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SEQ_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_ODR_read
			if(m_selcmd==null) throw new FoundationException("SEQ_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SEQ_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_ODR_read2
			if(m_selcmd==null) throw new FoundationException("SEQ_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SEQ_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_ODR_read3
			if(m_selcmd==null) throw new FoundationException("SEQ_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SEQ_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSHIP_DLV_H_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SEQ_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SEQ_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SEQ_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SEQ_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SEQ_ODR_clear

			return;
		}

		/**
		 * SEQ_ODRクラスの標準コンストラクタ
		 */
		public SEQ_ODR()
		{
			//{{user_implement_dev:SEQ_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SEQ_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_H extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SALES_H(\"SALES_H_NO\", \"SALES_TYP\", \"SALES_DATE\", \"INSPC_ACPT_DATE\", \"SHIP_DLV_H_NO\", \"SALES_DEPT_CD\", \"CUST_CD\", \"BILL_ADDRESSEE_CD\", \"CUST_CHRG_PSN_CD\", \"ODR_ACPT_PSN_CD\", \"CURRNCY_CD\", \"INSPC_ACPT_TYP\", \"STATUS\", \"DEL_FLG\", \"SALES_AMOUNT\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_SALES_AMOUNT\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '20', '0', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = "UPDATE "
+"  T_SALES_H "
+"SET "
+"  \"SALES_TYP\" = 4, "
+"  \"SALES_DATE\" = ?, "
+"  \"INSPC_ACPT_DATE\" = ?, "
+"  \"SALES_DEPT_CD\" = ?, "
+"  \"CUST_CD\" = ?, "
+"  \"BILL_ADDRESSEE_CD\" = ?, "
+"  \"CUST_CHRG_PSN_CD\" = ?, "
+"  \"ODR_ACPT_PSN_CD\" = ?, "
+"  \"CURRNCY_CD\" = ?, "
+"  \"INSPC_ACPT_TYP\" = ?, "
+"  \"STATUS\" = 20, "
+"  \"DEL_FLG\" = 0, "
+"  \"SALES_AMOUNT\" = ?, "
+"  \"EXTERNAL_TAX_SALES_AMOUNT\" = ?, "
+"  \"INTERNAL_TAX_SALES_AMOUNT\" = ?, "
+"  \"TAXFREE_SALES_AMOUNT\" = ?, "
+"  \"TAX_CREDIT_SALES_AMOUNT\" = ?, "
+"  \"EXTERNAL_TAX_AMOUNT\" = ?, "
+"  \"INTERNAL_TAX_AMOUNT\" = ?, "
+"  \"TAX_AMOUNT_1\" = ?, "
+"  \"TAX_AMOUNT_2\" = ?, "
+"  \"TAX_AMOUNT_3\" = ?, "
+"  \"OWN_CUR_SALES_AMOUNT\" = ?, "
+"  \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" = ? "
+"WHERE "
+"  T_SALES_H.\"SALES_H_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SALES_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_H_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getSALES_H_NO(), stmt);
				setString(8, data.getSALES_TYP(), stmt);
				setString(9, data.getSALES_DATE(), stmt);
				setString(10, data.getINSPC_ACPT_DATE(), stmt);
				setString(11, data.getSHIP_DLV_H_NO(), stmt);
				setString(12, data.getSALES_DEPT_CD(), stmt);
				setString(13, data.getCUST_CD(), stmt);
				setString(14, data.getBILL_ADDRESSEE_CD(), stmt);
				setString(15, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(16, data.getODR_ACPT_PSN_CD(), stmt);
				setString(17, data.getCURRNCY_CD(), stmt);
				setString(18, data.getINSPC_ACPT_TYP(), stmt);
				setString(19, data.getSALES_AMOUNT(), stmt);
				setString(20, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(21, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(22, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(23, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(24, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(25, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(26, data.getTAX_AMOUNT_1(), stmt);
				setString(27, data.getTAX_AMOUNT_2(), stmt);
				setString(28, data.getTAX_AMOUNT_3(), stmt);
				setString(29, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(30, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getSALES_DATE(), stmt);
				setString(5, data.getINSPC_ACPT_DATE(), stmt);
				setString(6, data.getSALES_DEPT_CD(), stmt);
				setString(7, data.getCUST_CD(), stmt);
				setString(8, data.getBILL_ADDRESSEE_CD(), stmt);
				setString(9, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(10, data.getODR_ACPT_PSN_CD(), stmt);
				setString(11, data.getCURRNCY_CD(), stmt);
				setString(12, data.getINSPC_ACPT_TYP(), stmt);
				setString(13, data.getSALES_AMOUNT(), stmt);
				setString(14, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(15, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(16, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(17, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(18, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(19, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(20, data.getTAX_AMOUNT_1(), stmt);
				setString(21, data.getTAX_AMOUNT_2(), stmt);
				setString(22, data.getTAX_AMOUNT_3(), stmt);
				setString(23, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(24, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(25, data.geth_SALES_H_NO(), stmt);

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
			//{{user_implement_dev:T_SALES_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_H_clear

			return;
		}

		/**
		 * T_SALES_Hクラスの標準コンストラクタ
		 */
		public T_SALES_H()
		{
			//{{user_implement_dev:T_SALES_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_H_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_Jf extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SALES(\"SALES_SEQ_NO\", \"SALES_H_NO\", \"SHIP_CTRL_NO\", \"SHIP_DLV_H_NO\", \"SHIP_DLV_D_NO\", \"SALES_TYP\", \"CUST_CD\", \"ITEM_CD\", \"ITEM_NAME\", \"CUST_ODR_NO\", \"SALES_DATE\", \"SALES_DEPT_CD\", \"VEND_CD\", \"PRD_ODR_PLACE_CD\", \"CUST_CHRG_PSN_CD\", \"ODR_ACPT_PSN_CD\", \"SALES_QTY\", \"CUST_SALES_QTY\", \"SALES_UNIT_PRICE\", \"UNIT_CD\", \"CUST_UNIT_CD\", \"SALES_AMOUNT\", \"SALES_AMOUNT_EXCH_RATES\", \"INSPC_ACPT_DATE\", \"INSPC_ACPT_QTY\", \"CUST_INSPC_ACPT_QTY\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", \"ORG_SLIP_CD\", \"CURRNCY_CD\", \"SPCL_PRICE_CO\", \"REMARKS\", \"INSPC_ACPT_TYP\", \"STATUS\", \"DEL_FLG\", \"APPR_FLG\", \"APPR_ID\", \"APPR_DATE\", \"RESERVE_CAUSE\") "
+"VALUES "
+"  (?, ?, NULL, ?, '1', ?, ?, ?, ?, ?, ?, ?, NULL, NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, ?, NULL, ?, ?, '20', '0', ?, ?, to_date(?), ?)";
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  \"SALES_TYP\" = 4, "
+"  \"CUST_CD\" = ?, "
+"  \"ITEM_CD\" = ?, "
+"  \"ITEM_NAME\" = ?, "
+"  \"CUST_ODR_NO\" = ?, "
+"  \"SALES_DATE\" = ?, "
+"  \"SALES_DEPT_CD\" = ?, "
+"  \"VEND_CD\" = NULL, "
+"  \"PRD_ODR_PLACE_CD\" = NULL, "
+"  \"CUST_CHRG_PSN_CD\" = ?, "
+"  \"ODR_ACPT_PSN_CD\" = ?, "
+"  \"SALES_QTY\" = ?, "
+"  \"CUST_SALES_QTY\" = ?, "
+"  \"SALES_UNIT_PRICE\" = ?, "
+"  \"UNIT_CD\" = ?, "
+"  \"CUST_UNIT_CD\" = ?, "
+"  \"SALES_AMOUNT\" = ?, "
+"  \"SALES_AMOUNT_EXCH_RATES\" = ?, "
+"  \"INSPC_ACPT_DATE\" = ?, "
+"  \"INSPC_ACPT_QTY\" = ?, "
+"  \"CUST_INSPC_ACPT_QTY\" = ?, "
+"  \"EXTERNAL_TAX_SALES_AMOUNT\" = ?, "
+"  \"INTERNAL_TAX_SALES_AMOUNT\" = ?, "
+"  \"TAXFREE_SALES_AMOUNT\" = ?, "
+"  \"TAX_CREDIT_SALES_AMOUNT\" = ?, "
+"  \"EXTERNAL_TAX_AMOUNT\" = ?, "
+"  \"INTERNAL_TAX_AMOUNT\" = ?, "
+"  \"TAX_AMOUNT_1\" = ?, "
+"  \"TAX_AMOUNT_2\" = ?, "
+"  \"TAX_AMOUNT_3\" = ?, "
+"  \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" = ?, "
+"  \"ORG_SLIP_CD\" = NULL, "
+"  \"CURRNCY_CD\" = ?, "
+"  \"SPCL_PRICE_CO\" = NULL, "
+"  \"REMARKS\" = ?, "
+"  \"INSPC_ACPT_TYP\" = ?, "
+"  \"STATUS\" = 20, "
+"  \"DEL_FLG\" = 0, "
+"  \"APPR_FLG\" = ?, "
+"  \"APPR_ID\" = ?, "
+"  \"APPR_DATE\" = TO_DATE(?), "
+"  \"RESERVE_CAUSE\" = ? "
+"WHERE "
+"  T_SALES.\"SALES_SEQ_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SALES_Jf_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_Jf_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getSALES_SEQ_NO(), stmt);
				setString(8, data.getSALES_H_NO(), stmt);
				setString(9, data.getSHIP_DLV_H_NO(), stmt);
				setString(10, data.getSALES_TYP(), stmt);
				setString(11, data.getCUST_CD(), stmt);
				setString(12, data.getITEM_CD(), stmt);
				setString(13, data.getITEM_NAME(), stmt);
				setString(14, data.getCUST_ODR_NO(), stmt);
				setString(15, data.getSALES_DATE(), stmt);
				setString(16, data.getSALES_DEPT_CD(), stmt);
				setString(17, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(18, data.getODR_ACPT_PSN_CD(), stmt);
				setString(19, data.getSALES_QTY(), stmt);
				setString(20, data.getCUST_SALES_QTY(), stmt);
				setString(21, data.getSALES_UNIT_PRICE(), stmt);
				setString(22, data.getUNIT_CD(), stmt);
				setString(23, data.getCUST_UNIT_CD(), stmt);
				setString(24, data.getSALES_AMOUNT(), stmt);
				setString(25, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(26, data.getINSPC_ACPT_DATE(), stmt);
				setString(27, data.getINSPC_ACPT_QTY(), stmt);
				setString(28, data.getCUST_INSPC_ACPT_QTY(), stmt);
				setString(29, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(30, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(31, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(32, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(33, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(34, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(35, data.getTAX_AMOUNT_1(), stmt);
				setString(36, data.getTAX_AMOUNT_2(), stmt);
				setString(37, data.getTAX_AMOUNT_3(), stmt);
				setString(38, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(39, data.getCURRNCY_CD(), stmt);
				setString(40, data.getREMARKS(), stmt);
				setString(41, data.getINSPC_ACPT_TYP(), stmt);
				setString(42, data.getAPPR_FLG(), stmt);
				setString(43, data.getAPPR_ID(), stmt);
				setString(44, data.getAPPR_DATE(), stmt);
				setString(45, data.getRESERVE_CAUSE(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getCUST_CD(), stmt);
				setString(5, data.getITEM_CD(), stmt);
				setString(6, data.getITEM_NAME(), stmt);
				setString(7, data.getCUST_ODR_NO(), stmt);
				setString(8, data.getSALES_DATE(), stmt);
				setString(9, data.getSALES_DEPT_CD(), stmt);
				setString(10, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(11, data.getODR_ACPT_PSN_CD(), stmt);
				setString(12, data.getSALES_QTY(), stmt);
				setString(13, data.getCUST_SALES_QTY(), stmt);
				setString(14, data.getSALES_UNIT_PRICE(), stmt);
				setString(15, data.getUNIT_CD(), stmt);
				setString(16, data.getCUST_UNIT_CD(), stmt);
				setString(17, data.getSALES_AMOUNT(), stmt);
				setString(18, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(19, data.getINSPC_ACPT_DATE(), stmt);
				setString(20, data.getINSPC_ACPT_QTY(), stmt);
				setString(21, data.getCUST_INSPC_ACPT_QTY(), stmt);
				setString(22, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(23, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(24, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(25, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(26, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(27, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(28, data.getTAX_AMOUNT_1(), stmt);
				setString(29, data.getTAX_AMOUNT_2(), stmt);
				setString(30, data.getTAX_AMOUNT_3(), stmt);
				setString(31, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(32, data.getCURRNCY_CD(), stmt);
				setString(33, data.getREMARKS(), stmt);
				setString(34, data.getINSPC_ACPT_TYP(), stmt);
				setString(35, data.getAPPR_FLG(), stmt);
				setString(36, data.getAPPR_ID(), stmt);
				setString(37, data.getAPPR_DATE(), stmt);
				setString(38, data.getRESERVE_CAUSE(), stmt);
				setString(39, data.geth_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:T_SALES_Jf_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_Jf_clear

			return;
		}

		/**
		 * T_SALES_Jfクラスの標準コンストラクタ
		 */
		public T_SALES_Jf()
		{
			//{{user_implement_dev:T_SALES_Jf_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_Jf_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_CreditRecord extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_SALES.\"SALES_SEQ_NO\") as \"SALES_SEQ_NO\", "
+"  T_SALES.\"SLIP_CD\" as \"SLIP_CD\", "
+"  to_char(T_SALES.\"SALES_TYP\") as \"SALES_TYP\", "
+"  T_SALES.\"CUST_CD\" as \"CUST_CD\", "
+"  T_SALES.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_SALES.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_SALES.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  to_char(T_SALES.\"SALES_DATE\", 'YYYY/MM/DD') as \"SALES_DATE\", "
+"  T_SALES.\"SALES_DEPT_CD\" as \"SALES_DEPT_CD\", "
+"  T_SALES.\"VEND_CD\" as \"VEND_CD\", "
+"  T_SALES.\"PRD_ODR_PLACE_CD\" as \"PRD_ODR_PLACE_CD\", "
+"  T_SALES.\"CUST_CHRG_PSN_CD\" as \"CUST_CHRG_PSN_CD\", "
+"  T_SALES.\"ODR_ACPT_PSN_CD\" as \"ODR_ACPT_PSN_CD\", "
+"  to_char(T_SALES.\"SALES_QTY\" * - 1) as \"SALES_QTY\", "
+"  to_char(T_SALES.\"SALES_UNIT_PRICE\") as \"SALES_UNIT_PRICE\", "
+"  T_SALES.\"UNIT_CD\" as \"UNIT_CD\", "
+"  to_char(T_SALES.\"SALES_AMOUNT\" * - 1) as \"SALES_AMOUNT\", "
+"  to_char(T_SALES.\"SALES_AMOUNT_EXCH_RATES\" * - 1) as \"SALES_AMOUNT_EXCH_RATES\", "
+"  to_char(T_SALES.\"INSPC_ACPT_DATE\", 'YYYY/MM/DD') as \"INSPC_ACPT_DATE\", "
+"  to_char(T_SALES.\"INSPC_ACPT_QTY\" * - 1) as \"INSPC_ACPT_QTY\", "
+"  to_char(T_SALES.\"EXTERNAL_TAX_SALES_AMOUNT\" * - 1) as \"EXTERNAL_TAX_SALES_AMOUNT\", "
+"  to_char(T_SALES.\"INTERNAL_TAX_SALES_AMOUNT\" * - 1) as \"INTERNAL_TAX_SALES_AMOUNT\", "
+"  to_char(T_SALES.\"TAXFREE_SALES_AMOUNT\" * - 1) as \"TAXFREE_SALES_AMOUNT\", "
+"  to_char(T_SALES.\"TAX_CREDIT_SALES_AMOUNT\" * - 1) as \"TAX_CREDIT_SALES_AMOUNT\", "
+"  to_char(T_SALES.\"EXTERNAL_TAX_AMOUNT\" * - 1) as \"EXTERNAL_TAX_AMOUNT\", "
+"  to_char(T_SALES.\"INTERNAL_TAX_AMOUNT\" * - 1) as \"INTERNAL_TAX_AMOUNT\", "
+"  to_char(T_SALES.\"TAX_AMOUNT_1\" * - 1) as \"TAX_AMOUNT_1\", "
+"  to_char(T_SALES.\"TAX_AMOUNT_2\" * - 1) as \"TAX_AMOUNT_2\", "
+"  to_char(T_SALES.\"TAX_AMOUNT_3\" * - 1) as \"TAX_AMOUNT_3\", "
+"  to_char(T_SALES.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" * - 1) as \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", "
+"  T_SALES.\"ORG_SLIP_CD\" as \"ORG_SLIP_CD\", "
+"  T_SALES.\"CURRNCY_CD\" as \"CURRNCY_CD\", "
+"  T_SALES.\"SPCL_PRICE_CO\" as \"SPCL_PRICE_CO\", "
+"  T_SALES.\"REMARKS\" as \"REMARKS\", "
+"  to_char(T_SALES.\"INSPC_ACPT_TYP\") as \"INSPC_ACPT_TYP\", "
+"  to_char(T_SALES.\"STATUS\") as \"STATUS\", "
+"  to_char(1) as \"DEL_FLG\" "
+"from "
+"  T_SALES "
+"where "
+"  T_SALES.\"DEL_FLG\" = 0 "
+"  and T_SALES.\"SALES_SEQ_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_SALES_CreditRecord_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_CreditRecord_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_CreditRecord_read
			if(m_selcmd==null) throw new FoundationException("T_SALES_CreditRecord", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_CreditRecord_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_CreditRecord_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES_CreditRecord", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_CreditRecord_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_CreditRecord_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES_CreditRecord", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_CreditRecord_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_SALES_SEQ_NO());
				if(isNull(data.geth_SALES_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_SALES_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSALES_SEQ_NO( getString(1, rs) );
			data.setSLIP_CD( getString(2, rs) );
			data.setSALES_TYP( getString(3, rs) );
			data.setCUST_CD( getString(4, rs) );
			data.setITEM_CD( getString(5, rs) );
			data.setITEM_NAME( getString(6, rs) );
			data.setCUST_ODR_NO( getString(7, rs) );
			data.setSALES_DATE( getString(8, rs) );
			data.setSALES_DEPT_CD( getString(9, rs) );
			data.setVEND_CD( getString(10, rs) );
			data.setPRD_ODR_PLACE_CD( getString(11, rs) );
			data.setCUST_CHRG_PSN_CD( getString(12, rs) );
			data.setODR_ACPT_PSN_CD( getString(13, rs) );
			data.setSALES_QTY( getString(14, rs) );
			data.setSALES_UNIT_PRICE( getString(15, rs) );
			data.setUNIT_CD( getString(16, rs) );
			data.setSALES_AMOUNT( getString(17, rs) );
			data.setSALES_AMOUNT_EXCH_RATES( getString(18, rs) );
			data.setINSPC_ACPT_DATE( getString(19, rs) );
			data.setINSPC_ACPT_QTY( getString(20, rs) );
			data.setEXTERNAL_TAX_SALES_AMOUNT( getString(21, rs) );
			data.setINTERNAL_TAX_SALES_AMOUNT( getString(22, rs) );
			data.setTAXFREE_SALES_AMOUNT( getString(23, rs) );
			data.setTAX_CREDIT_SALES_AMOUNT( getString(24, rs) );
			data.setEXTERNAL_TAX_AMOUNT( getString(25, rs) );
			data.setINTERNAL_TAX_AMOUNT( getString(26, rs) );
			data.setTAX_AMOUNT_1( getString(27, rs) );
			data.setTAX_AMOUNT_2( getString(28, rs) );
			data.setTAX_AMOUNT_3( getString(29, rs) );
			data.setOWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(30, rs) );
			data.setORG_SLIP_CD( getString(31, rs) );
			data.setCURRNCY_CD( getString(32, rs) );
			data.setSPCL_PRICE_CO( getString(33, rs) );
			data.setREMARKS( getString(34, rs) );
			data.setINSPC_ACPT_TYP( getString(35, rs) );
			data.setSTATUS( getString(36, rs) );
			data.setDEL_FLG( getString(37, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES_CreditRecord", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_CreditRecord_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_CreditRecord_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_SALES_CreditRecord_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_CreditRecord_clear

			return;
		}

		/**
		 * T_SALES_CreditRecordクラスの標準コンストラクタ
		 */
		public T_SALES_CreditRecord()
		{
			//{{user_implement_dev:T_SALES_CreditRecord_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_CreditRecord_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_Delete extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_SALES.\"SALES_SEQ_NO\" as \"SALES_SEQ_NO\", "
+"  T_SALES.\"SALES_H_NO\" as \"SALES_H_NO\", "
+"  T_SALES.\"SHIP_CTRL_NO\" as \"SHIP_CTRL_NO\", "
+"  T_SALES.\"SHIP_DLV_H_NO\" as \"SHIP_DLV_H_NO\", "
+"  T_SALES.\"SHIP_DLV_D_NO\" as \"SHIP_DLV_D_NO\", "
+"  T_SALES.\"SALES_TYP\" as \"SALES_TYP\", "
+"  T_SALES.\"CUST_CD\" as \"CUST_CD\", "
+"  T_SALES.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_SALES.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_SALES.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  to_char(T_SALES.\"SALES_DATE\", 'YYYY/MM/DD') as \"SALES_DATE\", "
+"  T_SALES.\"SALES_DEPT_CD\" as \"SALES_DEPT_CD\", "
+"  T_SALES.\"VEND_CD\" as \"VEND_CD\", "
+"  T_SALES.\"PRD_ODR_PLACE_CD\" as \"PRD_ODR_PLACE_CD\", "
+"  T_SALES.\"CUST_CHRG_PSN_CD\" as \"CUST_CHRG_PSN_CD\", "
+"  T_SALES.\"ODR_ACPT_PSN_CD\" as \"ODR_ACPT_PSN_CD\", "
+"  T_SALES.\"SALES_QTY\" *(- 1) as \"SALES_QTY\", "
+"  T_SALES.\"CUST_SALES_QTY\" *(- 1) as \"CUST_SALES_QTY\", "
+"  T_SALES.\"SALES_UNIT_PRICE\" as \"SALES_UNIT_PRICE\", "
+"  T_SALES.\"UNIT_CD\" as \"UNIT_CD\", "
+"  T_SALES.\"CUST_UNIT_CD\" as \"CUST_UNIT_CD\", "
+"  T_SALES.\"SALES_AMOUNT\" *(- 1) as \"SALES_AMOUNT\", "
+"  T_SALES.\"SALES_AMOUNT_EXCH_RATES\" *(- 1) as \"SALES_AMOUNT_EXCH_RATES\", "
+"  to_char(T_SALES.\"INSPC_ACPT_DATE\", 'YYYY/MM/DD') as \"INSPC_ACPT_DATE\", "
+"  T_SALES.\"INSPC_ACPT_QTY\" *(- 1) as \"INSPC_ACPT_QTY\", "
+"  T_SALES.\"CUST_INSPC_ACPT_QTY\" *(- 1) as \"CUST_INSPC_ACPT_QTY\", "
+"  T_SALES.\"EXTERNAL_TAX_SALES_AMOUNT\" *(- 1) as \"EXTERNAL_TAX_SALES_AMOUNT\", "
+"  T_SALES.\"INTERNAL_TAX_SALES_AMOUNT\" *(- 1) as \"INTERNAL_TAX_SALES_AMOUNT\", "
+"  T_SALES.\"TAXFREE_SALES_AMOUNT\" *(- 1) as \"TAXFREE_SALES_AMOUNT\", "
+"  T_SALES.\"TAX_CREDIT_SALES_AMOUNT\" *(- 1) as \"TAX_CREDIT_SALES_AMOUNT\", "
+"  T_SALES.\"EXTERNAL_TAX_AMOUNT\" *(- 1) as \"TEXTERNAL_TAX_AMOUNT\", "
+"  T_SALES.\"INTERNAL_TAX_AMOUNT\" *(- 1) as \"INTERNAL_TAX_AMOUNT\", "
+"  T_SALES.\"TAX_AMOUNT_1\" *(- 1) as \"TAX_AMOUNT_1\", "
+"  T_SALES.\"TAX_AMOUNT_2\" *(- 1) as \"TAX_AMOUNT_2\", "
+"  T_SALES.\"TAX_AMOUNT_3\" *(- 1) as \"TAX_AMOUNT_3\", "
+"  T_SALES.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" *(- 1) as \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", "
+"  T_SALES.\"ORG_SLIP_CD\" as \"ORG_SLIP_CD\", "
+"  T_SALES.\"CURRNCY_CD\" as \"CURRNCY_CD\", "
+"  T_SALES.\"SPCL_PRICE_CO\" as \"SPCL_PRICE_CO\", "
+"  T_SALES.\"REMARKS\" as \"REMARKS\", "
+"  T_SALES.\"INSPC_ACPT_TYP\" as \"INSPC_ACPT_TYP\", "
+"  T_SALES.\"STATUS\" as \"STATUS\" "
+"from "
+"  T_SALES "
+"where "
+"  T_SALES.\"SALES_SEQ_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SALES(\"SALES_SEQ_NO\", \"SALES_H_NO\", \"SHIP_CTRL_NO\", \"SHIP_DLV_H_NO\", \"SHIP_DLV_D_NO\", \"SALES_TYP\", \"CUST_CD\", \"ITEM_CD\", \"ITEM_NAME\", \"CUST_ODR_NO\", \"SALES_DATE\", \"SALES_DEPT_CD\", \"VEND_CD\", \"PRD_ODR_PLACE_CD\", \"CUST_CHRG_PSN_CD\", \"ODR_ACPT_PSN_CD\", \"SALES_QTY\", \"CUST_SALES_QTY\", \"SALES_UNIT_PRICE\", \"UNIT_CD\", \"CUST_UNIT_CD\", \"SALES_AMOUNT\", \"SALES_AMOUNT_EXCH_RATES\", \"INSPC_ACPT_DATE\", \"INSPC_ACPT_QTY\", \"CUST_INSPC_ACPT_QTY\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", \"ORG_SLIP_CD\", \"CURRNCY_CD\", \"SPCL_PRICE_CO\", \"REMARKS\", \"INSPC_ACPT_TYP\", \"STATUS\", \"DEL_FLG\", \"APPR_FLG\", \"APPR_ID\", \"APPR_DATE\", \"RESERVE_CAUSE\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 1, ?, ?, to_date(?), ?)";
		protected String m_updcmd = "update "
+"  T_SALES "
+"set "
+"  \"DEL_FLG\" = 1 "
+"where "
+"  T_SALES.\"DEL_FLG\" = 0 "
+"  and T_SALES.\"SALES_SEQ_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SALES_Delete_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_Delete_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_Delete_read
			if(m_selcmd==null) throw new FoundationException("T_SALES_Delete", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_Delete_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_Delete_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES_Delete", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_Delete_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_Delete_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES_Delete", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_Delete_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_SALES_SEQ_NO());
				if(isNull(data.geth_SALES_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_SALES_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSALES_SEQ_NO( getString(1, rs) );
			data.setSALES_H_NO( getString(2, rs) );
			data.setSHIP_CTRL_NO( getString(3, rs) );
			data.setSHIP_DLV_H_NO( getString(4, rs) );
			data.setSHIP_DLV_D_NO( getString(5, rs) );
			data.setSALES_TYP( getString(6, rs) );
			data.setCUST_CD( getString(7, rs) );
			data.setITEM_CD( getString(8, rs) );
			data.setITEM_NAME( getString(9, rs) );
			data.setCUST_ODR_NO( getString(10, rs) );
			data.setSALES_DATE( getString(11, rs) );
			data.setSALES_DEPT_CD( getString(12, rs) );
			data.setVEND_CD( getString(13, rs) );
			data.setPRD_ODR_PLACE_CD( getString(14, rs) );
			data.setCUST_CHRG_PSN_CD( getString(15, rs) );
			data.setODR_ACPT_PSN_CD( getString(16, rs) );
			data.setSALES_QTY( getString(17, rs) );
			data.setCUST_SALES_QTY( getString(18, rs) );
			data.setSALES_UNIT_PRICE( getString(19, rs) );
			data.setUNIT_CD( getString(20, rs) );
			data.setCUST_UNIT_CD( getString(21, rs) );
			data.setSALES_AMOUNT( getString(22, rs) );
			data.setSALES_AMOUNT_EXCH_RATES( getString(23, rs) );
			data.setINSPC_ACPT_DATE( getString(24, rs) );
			data.setINSPC_ACPT_QTY( getString(25, rs) );
			data.setCUST_INSPC_ACPT_QTY( getString(26, rs) );
			data.setEXTERNAL_TAX_SALES_AMOUNT( getString(27, rs) );
			data.setINTERNAL_TAX_SALES_AMOUNT( getString(28, rs) );
			data.setTAXFREE_SALES_AMOUNT( getString(29, rs) );
			data.setTAX_CREDIT_SALES_AMOUNT( getString(30, rs) );
			data.setEXTERNAL_TAX_AMOUNT( getString(31, rs) );
			data.setINTERNAL_TAX_AMOUNT( getString(32, rs) );
			data.setTAX_AMOUNT_1( getString(33, rs) );
			data.setTAX_AMOUNT_2( getString(34, rs) );
			data.setTAX_AMOUNT_3( getString(35, rs) );
			data.setOWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(36, rs) );
			data.setORG_SLIP_CD( getString(37, rs) );
			data.setCURRNCY_CD( getString(38, rs) );
			data.setSPCL_PRICE_CO( getString(39, rs) );
			data.setREMARKS( getString(40, rs) );
			data.setINSPC_ACPT_TYP( getString(41, rs) );
			data.setSTATUS( getString(42, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES_Delete", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_Delete_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_Delete_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getSALES_SEQ_NO(), stmt);
				setString(8, data.getSALES_H_NO(), stmt);
				setString(9, data.getSHIP_CTRL_NO(), stmt);
				setString(10, data.getSHIP_DLV_H_NO(), stmt);
				setString(11, data.getSHIP_DLV_D_NO(), stmt);
				setString(12, data.getSALES_TYP(), stmt);
				setString(13, data.getCUST_CD(), stmt);
				setString(14, data.getITEM_CD(), stmt);
				setString(15, data.getITEM_NAME(), stmt);
				setString(16, data.getCUST_ODR_NO(), stmt);
				setString(17, data.getSALES_DATE(), stmt);
				setString(18, data.getSALES_DEPT_CD(), stmt);
				setString(19, data.getVEND_CD(), stmt);
				setString(20, data.getPRD_ODR_PLACE_CD(), stmt);
				setString(21, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(22, data.getODR_ACPT_PSN_CD(), stmt);
				setString(23, data.getSALES_QTY(), stmt);
				setString(24, data.getCUST_SALES_QTY(), stmt);
				setString(25, data.getSALES_UNIT_PRICE(), stmt);
				setString(26, data.getUNIT_CD(), stmt);
				setString(27, data.getCUST_UNIT_CD(), stmt);
				setString(28, data.getSALES_AMOUNT(), stmt);
				setString(29, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(30, data.getINSPC_ACPT_DATE(), stmt);
				setString(31, data.getINSPC_ACPT_QTY(), stmt);
				setString(32, data.getCUST_INSPC_ACPT_QTY(), stmt);
				setString(33, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(34, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(35, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(36, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(37, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(38, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(39, data.getTAX_AMOUNT_1(), stmt);
				setString(40, data.getTAX_AMOUNT_2(), stmt);
				setString(41, data.getTAX_AMOUNT_3(), stmt);
				setString(42, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(43, data.getORG_SLIP_CD(), stmt);
				setString(44, data.getCURRNCY_CD(), stmt);
				setString(45, data.getSPCL_PRICE_CO(), stmt);
				setString(46, data.getREMARKS(), stmt);
				setString(47, data.getINSPC_ACPT_TYP(), stmt);
				setString(48, data.getSTATUS(), stmt);
				setString(49, data.getAPPR_FLG(), stmt);
				setString(50, data.getAPPR_ID(), stmt);
				setString(51, data.getAPPR_DATE(), stmt);
				setString(52, data.getRESERVE_CAUSE(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(4, data.geth_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:T_SALES_Delete_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_Delete_clear

			return;
		}

		/**
		 * T_SALES_Deleteクラスの標準コンストラクタ
		 */
		public T_SALES_Delete()
		{
			//{{user_implement_dev:T_SALES_Delete_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_Delete_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class AKA_T_SALES_TEMP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES_TEMP.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_SALES_TEMP.\"SHIP_ODR_NO\" AS \"SHIP_ODR_NO\", "
+"  T_SALES_TEMP.\"SHIP_SEQ_NO\" AS \"SHIP_SEQ_NO\", "
+"  T_SALES_TEMP.\"SALES_TYP\" AS \"SALES_TYP\", "
+"  T_SALES_TEMP.\"CUST_CD\" AS \"CUST_CD\", "
+"  T_SALES_TEMP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_SALES_TEMP.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  T_SALES_TEMP.\"CUST_ODR_NO\" AS \"CUST_ODR_NO\", "
+"  TO_CHAR(T_SALES_TEMP.\"SALES_DATE\", 'YYYY/MM/DD') AS \"SALES_DATE\", "
+"  T_SALES_TEMP.\"SALES_DEPT_CD\" AS \"SALES_DEPT_CD\", "
+"  T_SALES_TEMP.\"VEND_CD\" AS \"VEND_CD\", "
+"  T_SALES_TEMP.\"PRD_ODR_PLACE_CD\" AS \"PRD_ODR_PLACE_CD\", "
+"  T_SALES_TEMP.\"CUST_CHRG_PSN_CD\" AS \"CUST_CHRG_PSN_CD\", "
+"  T_SALES_TEMP.\"ODR_ACPT_PSN_CD\" AS \"ODR_ACPT_PSN_CD\", "
+"  T_SALES_TEMP.\"SALES_QTY\" * - 1 AS \"SALES_QTY\", "
+"  T_SALES_TEMP.\"SALES_UNIT_PRICE\" AS \"SALES_UNIT_PRICE\", "
+"  T_SALES_TEMP.\"UNIT_CD\" AS \"UNIT_CD\", "
+"  T_SALES_TEMP.\"SALES_AMOUNT\" * - 1 AS \"SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"SALES_AMOUNT_EXCH_RATES\" * - 1 AS \"SALES_AMOUNT_EXCH_RATES\", "
+"  T_SALES_TEMP.\"EXTERNAL_TAX_SALES_AMOUNT\" * - 1 AS \"EXTERNAL_TAX_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"INTERNAL_TAX_SALES_AMOUNT\" * - 1 AS \"INTERNAL_TAX_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"TAXFREE_SALES_AMOUNT\" * - 1 AS \"TAXFREE_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"TAX_CREDIT_SALES_AMOUNT\" * - 1 AS \"TAX_CREDIT_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"EXTERNAL_TAX_AMOUNT\" * - 1 AS \"EXTERNAL_TAX_AMOUNT\", "
+"  T_SALES_TEMP.\"INTERNAL_TAX_AMOUNT\" * - 1 AS \"INTERNAL_TAX_AMOUNT\", "
+"  T_SALES_TEMP.\"TAX_AMOUNT_1\" * - 1 AS \"TAX_AMOUNT_1\", "
+"  T_SALES_TEMP.\"TAX_AMOUNT_2\" * - 1 AS \"TAX_AMOUNT_2\", "
+"  T_SALES_TEMP.\"TAX_AMOUNT_3\" * - 1 AS \"TAX_AMOUNT_3\", "
+"  T_SALES_TEMP.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" * - 1 AS \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"ORG_SLIP_CD\" AS \"ORG_SLIP_CD\", "
+"  T_SALES_TEMP.\"CUR_CD\" AS \"CUR_CD\", "
+"  T_SALES_TEMP.\"AMOUNT_TYP\" AS \"AMOUNT_TYP\", "
+"  T_SALES_TEMP.\"REMARKS\" AS \"REMARKS\", "
+"  T_SALES_TEMP.\"INSPC_ACPT_TYP\" AS \"INSPC_ACPT_TYP\", "
+"  2 AS \"TEMP_SALES_TYP\", "
+"  1 AS \"SALES_DISAGREEMENT_TYP\", "
+"  0 AS \"SALES_FLG\", "
+"  1 AS \"SALES_IF_FLG\", "
+"  1 AS \"DEL_FLG\", "
+"  T_SALES_TEMP.\"CONS_TYP\" AS \"CONS_TYP\" "
+"FROM "
+"  T_SALES_TEMP "
+"WHERE "
+"  T_SALES_TEMP.\"SALES_TYP\" = 4 "
+"  AND T_SALES_TEMP.\"DEL_FLG\" = 0 "
+"  AND T_SALES_TEMP.\"SLIP_CD\" = ? "
+"  AND T_SALES_TEMP.\"COMPANY_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:AKA_T_SALES_TEMP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:AKA_T_SALES_TEMP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_read
			if(m_selcmd==null) throw new FoundationException("AKA_T_SALES_TEMP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:AKA_T_SALES_TEMP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_read2
			if(m_selcmd==null) throw new FoundationException("AKA_T_SALES_TEMP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:AKA_T_SALES_TEMP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_read3
			if(m_selcmd==null) throw new FoundationException("AKA_T_SALES_TEMP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:AKA_T_SALES_TEMP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setCOMPANY_CD( getString(1, rs) );
			data.setSHIP_ODR_NO( getString(2, rs) );
			data.setSHIP_SEQ_NO( getString(3, rs) );
			data.setSALES_TYP( getString(4, rs) );
			data.setCUST_CD( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setITEM_NAME( getString(7, rs) );
			data.setCUST_ODR_NO( getString(8, rs) );
			data.setSALES_DATE( getString(9, rs) );
			data.setSALES_DEPT_CD( getString(10, rs) );
			data.setVEND_CD( getString(11, rs) );
			data.setPRD_ODR_PLACE_CD( getString(12, rs) );
			data.setCUST_CHRG_PSN_CD( getString(13, rs) );
			data.setODR_ACPT_PSN_CD( getString(14, rs) );
			data.setSALES_QTY( getString(15, rs) );
			data.setSALES_UNIT_PRICE( getString(16, rs) );
			data.setUNIT_CD( getString(17, rs) );
			data.setSALES_AMOUNT( getString(18, rs) );
			data.setSALES_AMOUNT_EXCH_RATES( getString(19, rs) );
			data.setEXTERNAL_TAX_SALES_AMOUNT( getString(20, rs) );
			data.setINTERNAL_TAX_SALES_AMOUNT( getString(21, rs) );
			data.setTAXFREE_SALES_AMOUNT( getString(22, rs) );
			data.setTAX_CREDIT_SALES_AMOUNT( getString(23, rs) );
			data.setEXTERNAL_TAX_AMOUNT( getString(24, rs) );
			data.setINTERNAL_TAX_AMOUNT( getString(25, rs) );
			data.setTAX_AMOUNT_1( getString(26, rs) );
			data.setTAX_AMOUNT_2( getString(27, rs) );
			data.setTAX_AMOUNT_3( getString(28, rs) );
			data.setOWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(29, rs) );
			data.setORG_SLIP_CD( getString(30, rs) );
			data.setCUR_CD( getString(31, rs) );
			data.setAMOUNT_TYP( getString(32, rs) );
			data.setREMARKS( getString(33, rs) );
			data.setINSPC_ACPT_TYP( getString(34, rs) );
			data.setTEMP_SALES_TYP( getString(35, rs) );
			data.setSALES_DISAGREEMENT_TYP( getString(36, rs) );
			data.setSALES_FLG( getString(37, rs) );
			data.setSALES_IF_FLG( getString(38, rs) );
			data.setDEL_FLG( getString(39, rs) );
			data.setCONS_TYP( getString(40, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("AKA_T_SALES_TEMP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:AKA_T_SALES_TEMP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:AKA_T_SALES_TEMP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:AKA_T_SALES_TEMP_clear

			return;
		}

		/**
		 * AKA_T_SALES_TEMPクラスの標準コンストラクタ
		 */
		public AKA_T_SALES_TEMP()
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:AKA_T_SALES_TEMP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_TEMP_Delete extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SALES_TEMP "
+"SET "
+"  T_SALES_TEMP.\"DEL_FLG\" = 1, "
+"  T_SALES_TEMP.\"SALES_IF_FLG\" = ? "
+"WHERE "
+"  T_SALES_TEMP.\"SALES_TYP\" = 4 "
+"  AND T_SALES_TEMP.\"DEL_FLG\" = 0 "
+"  AND T_SALES_TEMP.\"SLIP_CD\" = ? "
+"  AND T_SALES_TEMP.\"COMPANY_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SALES_TEMP_Delete_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_TEMP_Delete_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getSALES_IF_FLG(), stmt);
				setString(5, data.getSLIP_CD(), stmt);
				setString(6, data.getCOMPANY_CD(), stmt);

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
			//{{user_implement_dev:T_SALES_TEMP_Delete_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_TEMP_Delete_clear

			return;
		}

		/**
		 * T_SALES_TEMP_Deleteクラスの標準コンストラクタ
		 */
		public T_SALES_TEMP_Delete()
		{
			//{{user_implement_dev:T_SALES_TEMP_Delete_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_TEMP_Delete_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_H_Delete extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES_H.\"SALES_H_NO\" AS \"SALES_H_NO\", "
+"  T_SALES_H.\"SALES_TYP\" AS \"SALES_TYP\", "
+"  TO_CHAR(T_SALES_H.\"SALES_DATE\", 'YYYY/MM/DD') AS \"SALES_DATE\", "
+"  TO_CHAR(T_SALES_H.\"INSPC_ACPT_DATE\", 'YYYY/MM/DD') AS \"INSPC_ACPT_DATE\", "
+"  T_SALES_H.\"SHIP_DLV_H_NO\" AS \"SHIP_DLV_H_NO\", "
+"  T_SALES_H.\"SALES_DEPT_CD\" AS \"SALES_DEPT_CD\", "
+"  T_SALES_H.\"CUST_CD\" AS \"CUST_CD\", "
+"  T_SALES_H.\"BILL_ADDRESSEE_CD\" AS \"BILL_ADDRESSEE_CD\", "
+"  T_SALES_H.\"CUST_CHRG_PSN_CD\" AS \"CUST_CHRG_PSN_CD\", "
+"  T_SALES_H.\"ODR_ACPT_PSN_CD\" AS \"ODR_ACPT_PSN_CD\", "
+"  T_SALES_H.\"CURRNCY_CD\" AS \"CURRNCY_CD\", "
+"  T_SALES_H.\"INSPC_ACPT_TYP\" AS \"INSPC_ACPT_TYP\", "
+"  T_SALES_H.\"STATUS\" AS \"STATUS\", "
+"  T_SALES_H.\"SALES_AMOUNT\" *(- 1) AS \"SALES_AMOUNT\", "
+"  T_SALES_H.\"EXTERNAL_TAX_SALES_AMOUNT\" *(- 1) AS \"EXTERNAL_TAX_SALES_AMOUNT\", "
+"  T_SALES_H.\"INTERNAL_TAX_SALES_AMOUNT\" *(- 1) AS \"INTERNAL_TAX_SALES_AMOUNT\", "
+"  T_SALES_H.\"TAXFREE_SALES_AMOUNT\" *(- 1) AS \"TAXFREE_SALES_AMOUNT\", "
+"  T_SALES_H.\"TAX_CREDIT_SALES_AMOUNT\" *(- 1) AS \"TAX_CREDIT_SALES_AMOUNT\", "
+"  T_SALES_H.\"EXTERNAL_TAX_AMOUNT\" *(- 1) AS \"EXTERNAL_TAX_AMOUNT\", "
+"  T_SALES_H.\"INTERNAL_TAX_AMOUNT\" *(- 1) AS \"INTERNAL_TAX_AMOUNT\", "
+"  T_SALES_H.\"TAX_AMOUNT_1\" *(- 1) AS \"TAX_AMOUNT_1\", "
+"  T_SALES_H.\"TAX_AMOUNT_2\" *(- 1) AS \"TAX_AMOUNT_2\", "
+"  T_SALES_H.\"TAX_AMOUNT_3\" *(- 1) AS \"TAX_AMOUNT_3\", "
+"  T_SALES_H.\"OWN_CUR_SALES_AMOUNT\" *(- 1) AS \"OWN_CUR_SALES_AMOUNT\", "
+"  T_SALES_H.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" *(- 1) AS \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" "
+"FROM "
+"  T_SALES_H "
+"WHERE "
+"  T_SALES_H.\"SALES_H_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SALES_H(\"SALES_H_NO\", \"SALES_TYP\", \"SALES_DATE\", \"INSPC_ACPT_DATE\", \"SHIP_DLV_H_NO\", \"SALES_DEPT_CD\", \"CUST_CD\", \"BILL_ADDRESSEE_CD\", \"CUST_CHRG_PSN_CD\", \"ODR_ACPT_PSN_CD\", \"CURRNCY_CD\", \"INSPC_ACPT_TYP\", \"STATUS\", \"DEL_FLG\", \"SALES_AMOUNT\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_SALES_AMOUNT\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = "UPDATE "
+"  T_SALES_H "
+"SET "
+"  \"DEL_FLG\" = 1 "
+"WHERE "
+"  T_SALES_H.\"SALES_H_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_SALES_H_Delete_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_H_Delete_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_H_Delete_read
			if(m_selcmd==null) throw new FoundationException("T_SALES_H_Delete", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_H_Delete_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_H_Delete_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES_H_Delete", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_H_Delete_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_H_Delete_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES_H_Delete", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_H_Delete_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_SALES_H_NO());
				if(isNull(data.geth_SALES_H_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_SALES_H_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSALES_H_NO( getString(1, rs) );
			data.setSALES_TYP( getString(2, rs) );
			data.setSALES_DATE( getString(3, rs) );
			data.setINSPC_ACPT_DATE( getString(4, rs) );
			data.setSHIP_DLV_H_NO( getString(5, rs) );
			data.setSALES_DEPT_CD( getString(6, rs) );
			data.setCUST_CD( getString(7, rs) );
			data.setBILL_ADDRESSEE_CD( getString(8, rs) );
			data.setCUST_CHRG_PSN_CD( getString(9, rs) );
			data.setODR_ACPT_PSN_CD( getString(10, rs) );
			data.setCURRNCY_CD( getString(11, rs) );
			data.setINSPC_ACPT_TYP( getString(12, rs) );
			data.setSTATUS( getString(13, rs) );
			data.setSALES_AMOUNT( getString(14, rs) );
			data.setEXTERNAL_TAX_SALES_AMOUNT( getString(15, rs) );
			data.setINTERNAL_TAX_SALES_AMOUNT( getString(16, rs) );
			data.setTAXFREE_SALES_AMOUNT( getString(17, rs) );
			data.setTAX_CREDIT_SALES_AMOUNT( getString(18, rs) );
			data.setEXTERNAL_TAX_AMOUNT( getString(19, rs) );
			data.setINTERNAL_TAX_AMOUNT( getString(20, rs) );
			data.setTAX_AMOUNT_1( getString(21, rs) );
			data.setTAX_AMOUNT_2( getString(22, rs) );
			data.setTAX_AMOUNT_3( getString(23, rs) );
			data.setSALES_AMOUNT_EXCH_RATES( getString(24, rs) );
			data.setOWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(25, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES_H_Delete", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_H_Delete_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_H_Delete_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getSALES_H_NO(), stmt);
				setString(8, data.getSALES_TYP(), stmt);
				setString(9, data.getSALES_DATE(), stmt);
				setString(10, data.getINSPC_ACPT_DATE(), stmt);
				setString(11, data.getSHIP_DLV_H_NO(), stmt);
				setString(12, data.getSALES_DEPT_CD(), stmt);
				setString(13, data.getCUST_CD(), stmt);
				setString(14, data.getBILL_ADDRESSEE_CD(), stmt);
				setString(15, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(16, data.getODR_ACPT_PSN_CD(), stmt);
				setString(17, data.getCURRNCY_CD(), stmt);
				setString(18, data.getINSPC_ACPT_TYP(), stmt);
				setString(19, data.getSTATUS(), stmt);
				setString(20, data.getSALES_AMOUNT(), stmt);
				setString(21, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(22, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(23, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(24, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(25, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(26, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(27, data.getTAX_AMOUNT_1(), stmt);
				setString(28, data.getTAX_AMOUNT_2(), stmt);
				setString(29, data.getTAX_AMOUNT_3(), stmt);
				setString(30, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(31, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(4, data.geth_SALES_H_NO(), stmt);

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
			//{{user_implement_dev:T_SALES_H_Delete_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_H_Delete_clear

			return;
		}

		/**
		 * T_SALES_H_Deleteクラスの標準コンストラクタ
		 */
		public T_SALES_H_Delete()
		{
			//{{user_implement_dev:T_SALES_H_Delete_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_H_Delete_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class USER_MST_SCM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  USER_MST.USER_NAME "
+"FROM "
+"  USER_MST, "
+"  M_PLANT "
+"WHERE "
+"  USER_MST.USER_CD = ? "
+"  AND M_PLANT.COMPANY_CD = ? "
+"  AND USER_MST.PLANT_CD = M_PLANT.PLANT_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:USER_MST_SCM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:USER_MST_SCM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_SCM_read
			if(m_selcmd==null) throw new FoundationException("USER_MST_SCM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:USER_MST_SCM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_SCM_read2
			if(m_selcmd==null) throw new FoundationException("USER_MST_SCM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:USER_MST_SCM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_SCM_read3
			if(m_selcmd==null) throw new FoundationException("USER_MST_SCM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:USER_MST_SCM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCUST_CHRG_PSN_CD());
				if(isNull(data.getCUST_CHRG_PSN_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCUST_CHRG_PSN_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setUSER_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("USER_MST_SCM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_SCM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:USER_MST_SCM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:USER_MST_SCM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:USER_MST_SCM_clear

			return;
		}

		/**
		 * USER_MST_SCMクラスの標準コンストラクタ
		 */
		public USER_MST_SCM()
		{
			//{{user_implement_dev:USER_MST_SCM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:USER_MST_SCM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class AKA_T_SALES_TEMP_Ja extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES_TEMP.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_SALES_TEMP.\"SHIP_ODR_NO\" AS \"SHIP_ODR_NO\", "
+"  T_SALES_TEMP.\"SHIP_SEQ_NO\" AS \"SHIP_SEQ_NO\", "
+"  T_SALES_TEMP.\"SALES_TYP\" AS \"SALES_TYP\", "
+"  T_SALES_TEMP.\"CUST_CD\" AS \"CUST_CD\", "
+"  T_SALES_TEMP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_SALES_TEMP.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  T_SALES_TEMP.\"CUST_ODR_NO\" AS \"CUST_ODR_NO\", "
+"  TO_CHAR(T_SALES_TEMP.\"SALES_DATE\", 'YYYY/MM/DD') AS \"SALES_DATE\", "
+"  T_SALES_TEMP.\"SALES_DEPT_CD\" AS \"SALES_DEPT_CD\", "
+"  T_SALES_TEMP.\"VEND_CD\" AS \"VEND_CD\", "
+"  T_SALES_TEMP.\"PRD_ODR_PLACE_CD\" AS \"PRD_ODR_PLACE_CD\", "
+"  T_SALES_TEMP.\"CUST_CHRG_PSN_CD\" AS \"CUST_CHRG_PSN_CD\", "
+"  T_SALES_TEMP.\"ODR_ACPT_PSN_CD\" AS \"ODR_ACPT_PSN_CD\", "
+"  T_SALES_TEMP.\"SALES_QTY\" * - 1 AS \"SALES_QTY\", "
+"  T_SALES_TEMP.\"SALES_UNIT_PRICE\" AS \"SALES_UNIT_PRICE\", "
+"  T_SALES_TEMP.\"UNIT_CD\" AS \"UNIT_CD\", "
+"  T_SALES_TEMP.\"SALES_AMOUNT\" * - 1 AS \"SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"SALES_AMOUNT_EXCH_RATES\" * - 1 AS \"SALES_AMOUNT_EXCH_RATES\", "
+"  T_SALES_TEMP.\"EXTERNAL_TAX_SALES_AMOUNT\" * - 1 AS \"EXTERNAL_TAX_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"INTERNAL_TAX_SALES_AMOUNT\" * - 1 AS \"INTERNAL_TAX_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"TAXFREE_SALES_AMOUNT\" * - 1 AS \"TAXFREE_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"TAX_CREDIT_SALES_AMOUNT\" * - 1 AS \"TAX_CREDIT_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"EXTERNAL_TAX_AMOUNT\" * - 1 AS \"EXTERNAL_TAX_AMOUNT\", "
+"  T_SALES_TEMP.\"INTERNAL_TAX_AMOUNT\" * - 1 AS \"INTERNAL_TAX_AMOUNT\", "
+"  T_SALES_TEMP.\"TAX_AMOUNT_1\" * - 1 AS \"TAX_AMOUNT_1\", "
+"  T_SALES_TEMP.\"TAX_AMOUNT_2\" * - 1 AS \"TAX_AMOUNT_2\", "
+"  T_SALES_TEMP.\"TAX_AMOUNT_3\" * - 1 AS \"TAX_AMOUNT_3\", "
+"  T_SALES_TEMP.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" * - 1 AS \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", "
+"  T_SALES_TEMP.\"ORG_SLIP_CD\" AS \"ORG_SLIP_CD\", "
+"  T_SALES_TEMP.\"CUR_CD\" AS \"CUR_CD\", "
+"  T_SALES_TEMP.\"AMOUNT_TYP\" AS \"AMOUNT_TYP\", "
+"  T_SALES_TEMP.\"REMARKS\" AS \"REMARKS\", "
+"  T_SALES_TEMP.\"INSPC_ACPT_TYP\" AS \"INSPC_ACPT_TYP\", "
+"  2 AS \"TEMP_SALES_TYP\", "
+"  1 AS \"SALES_DISAGREEMENT_TYP\", "
+"  0 AS \"SALES_FLG\", "
+"  1 AS \"SALES_IF_FLG\", "
+"  1 AS \"DEL_FLG\" "
+"FROM "
+"  T_SALES_TEMP "
+"WHERE "
+"  T_SALES_TEMP.\"SALES_TYP\" = 4 "
+"  AND T_SALES_TEMP.\"DEL_FLG\" = 0 "
+"  AND T_SALES_TEMP.\"SLIP_CD\" = ? "
+"  AND T_SALES_TEMP.\"COMPANY_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SALES_TEMP(T_SALES_TEMP.\"SALES_SEQ_NO\", T_SALES_TEMP.\"COMPANY_CD\", T_SALES_TEMP.\"SHIP_ODR_NO\", T_SALES_TEMP.\"SHIP_SEQ_NO\", T_SALES_TEMP.\"SLIP_CD\", T_SALES_TEMP.\"SALES_TYP\", T_SALES_TEMP.\"CUST_CD\", T_SALES_TEMP.\"ITEM_CD\", T_SALES_TEMP.\"ITEM_NAME\", T_SALES_TEMP.\"CUST_ODR_NO\", T_SALES_TEMP.\"SALES_DATE\", T_SALES_TEMP.\"SALES_DEPT_CD\", T_SALES_TEMP.\"VEND_CD\", T_SALES_TEMP.\"PRD_ODR_PLACE_CD\", T_SALES_TEMP.\"CUST_CHRG_PSN_CD\", T_SALES_TEMP.\"ODR_ACPT_PSN_CD\", T_SALES_TEMP.\"SALES_QTY\", T_SALES_TEMP.\"SALES_UNIT_PRICE\", T_SALES_TEMP.\"UNIT_CD\", T_SALES_TEMP.\"SALES_AMOUNT\", T_SALES_TEMP.\"SALES_AMOUNT_EXCH_RATES\", T_SALES_TEMP.\"EXTERNAL_TAX_SALES_AMOUNT\", T_SALES_TEMP.\"INTERNAL_TAX_SALES_AMOUNT\", T_SALES_TEMP.\"TAXFREE_SALES_AMOUNT\", T_SALES_TEMP.\"TAX_CREDIT_SALES_AMOUNT\", T_SALES_TEMP.\"EXTERNAL_TAX_AMOUNT\", T_SALES_TEMP.\"INTERNAL_TAX_AMOUNT\", T_SALES_TEMP.\"TAX_AMOUNT_1\", T_SALES_TEMP.\"TAX_AMOUNT_2\", T_SALES_TEMP.\"TAX_AMOUNT_3\", T_SALES_TEMP.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", T_SALES_TEMP.\"ORG_SLIP_CD\", T_SALES_TEMP.\"CUR_CD\", T_SALES_TEMP.\"AMOUNT_TYP\", T_SALES_TEMP.\"REMARKS\", T_SALES_TEMP.\"INSPC_ACPT_TYP\", T_SALES_TEMP.\"TEMP_SALES_TYP\", T_SALES_TEMP.\"SALES_DISAGREEMENT_TYP\", T_SALES_TEMP.\"SALES_FLG\", T_SALES_TEMP.\"SALES_IF_FLG\", T_SALES_TEMP.\"DEL_FLG\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), NVL(?, 0), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:AKA_T_SALES_TEMP_Ja_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:AKA_T_SALES_TEMP_Ja_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_Ja_read
			if(m_selcmd==null) throw new FoundationException("AKA_T_SALES_TEMP_Ja", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:AKA_T_SALES_TEMP_Ja_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_Ja_read2
			if(m_selcmd==null) throw new FoundationException("AKA_T_SALES_TEMP_Ja", "read", "クエリー未登録");
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
                        //}}user_implement_dev:AKA_T_SALES_TEMP_Ja_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_Ja_read3
			if(m_selcmd==null) throw new FoundationException("AKA_T_SALES_TEMP_Ja", "read", "クエリー未登録");
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
                        //}}user_implement_dev:AKA_T_SALES_TEMP_Ja_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setCOMPANY_CD( getString(1, rs) );
			data.setSHIP_ODR_NO( getString(2, rs) );
			data.setSHIP_SEQ_NO( getString(3, rs) );
			data.setSALES_TYP( getString(4, rs) );
			data.setCUST_CD( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setITEM_NAME( getString(7, rs) );
			data.setCUST_ODR_NO( getString(8, rs) );
			data.setSALES_DATE( getString(9, rs) );
			data.setSALES_DEPT_CD( getString(10, rs) );
			data.setVEND_CD( getString(11, rs) );
			data.setPRD_ODR_PLACE_CD( getString(12, rs) );
			data.setCUST_CHRG_PSN_CD( getString(13, rs) );
			data.setODR_ACPT_PSN_CD( getString(14, rs) );
			data.setSALES_QTY( getString(15, rs) );
			data.setSALES_UNIT_PRICE( getString(16, rs) );
			data.setUNIT_CD( getString(17, rs) );
			data.setSALES_AMOUNT( getString(18, rs) );
			data.setSALES_AMOUNT_EXCH_RATES( getString(19, rs) );
			data.setEXTERNAL_TAX_SALES_AMOUNT( getString(20, rs) );
			data.setINTERNAL_TAX_SALES_AMOUNT( getString(21, rs) );
			data.setTAXFREE_SALES_AMOUNT( getString(22, rs) );
			data.setTAX_CREDIT_SALES_AMOUNT( getString(23, rs) );
			data.setEXTERNAL_TAX_AMOUNT( getString(24, rs) );
			data.setINTERNAL_TAX_AMOUNT( getString(25, rs) );
			data.setTAX_AMOUNT_1( getString(26, rs) );
			data.setTAX_AMOUNT_2( getString(27, rs) );
			data.setTAX_AMOUNT_3( getString(28, rs) );
			data.setOWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(29, rs) );
			data.setORG_SLIP_CD( getString(30, rs) );
			data.setCUR_CD( getString(31, rs) );
			data.setAMOUNT_TYP( getString(32, rs) );
			data.setREMARKS( getString(33, rs) );
			data.setINSPC_ACPT_TYP( getString(34, rs) );
			data.setTEMP_SALES_TYP( getString(35, rs) );
			data.setSALES_DISAGREEMENT_TYP( getString(36, rs) );
			data.setSALES_FLG( getString(37, rs) );
			data.setSALES_IF_FLG( getString(38, rs) );
			data.setDEL_FLG( getString(39, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("AKA_T_SALES_TEMP_Ja", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_Ja_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:AKA_T_SALES_TEMP_Ja_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getSALES_SEQ_NO(), stmt);
				setString(8, data.getCOMPANY_CD(), stmt);
				setString(9, data.getSHIP_ODR_NO(), stmt);
				setString(10, data.getSHIP_SEQ_NO(), stmt);
				setString(11, data.getSLIP_CD(), stmt);
				setString(12, data.getSALES_TYP(), stmt);
				setString(13, data.getCUST_CD(), stmt);
				setString(14, data.getITEM_CD(), stmt);
				setString(15, data.getITEM_NAME(), stmt);
				setString(16, data.getCUST_ODR_NO(), stmt);
				setString(17, data.getSALES_DATE(), stmt);
				setString(18, data.getSALES_DEPT_CD(), stmt);
				setString(19, data.getVEND_CD(), stmt);
				setString(20, data.getPRD_ODR_PLACE_CD(), stmt);
				setString(21, data.getCUST_CHRG_PSN_CD(), stmt);
				setString(22, data.getODR_ACPT_PSN_CD(), stmt);
				setString(23, data.getSALES_QTY(), stmt);
				setString(24, data.getSALES_UNIT_PRICE(), stmt);
				setString(25, data.getUNIT_CD(), stmt);
				setString(26, data.getSALES_AMOUNT(), stmt);
				setString(27, data.getSALES_AMOUNT_EXCH_RATES(), stmt);
				setString(28, data.getEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(29, data.getINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(30, data.getTAXFREE_SALES_AMOUNT(), stmt);
				setString(31, data.getTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(32, data.getEXTERNAL_TAX_AMOUNT(), stmt);
				setString(33, data.getINTERNAL_TAX_AMOUNT(), stmt);
				setString(34, data.getTAX_AMOUNT_1(), stmt);
				setString(35, data.getTAX_AMOUNT_2(), stmt);
				setString(36, data.getTAX_AMOUNT_3(), stmt);
				setString(37, data.getOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(38, data.getORG_SLIP_CD(), stmt);
				setString(39, data.getCUR_CD(), stmt);
				setString(40, data.getAMOUNT_TYP(), stmt);
				setString(41, data.getREMARKS(), stmt);
				setString(42, data.getINSPC_ACPT_TYP(), stmt);
				setString(43, data.getTEMP_SALES_TYP(), stmt);
				setString(44, data.getSALES_DISAGREEMENT_TYP(), stmt);
				setString(45, data.getSALES_FLG(), stmt);
				setString(46, data.getSALES_IF_FLG(), stmt);
				setString(47, data.getDEL_FLG(), stmt);

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
			//{{user_implement_dev:AKA_T_SALES_TEMP_Ja_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:AKA_T_SALES_TEMP_Ja_clear

			return;
		}

		/**
		 * AKA_T_SALES_TEMP_Jaクラスの標準コンストラクタ
		 */
		public AKA_T_SALES_TEMP_Ja()
		{
			//{{user_implement_dev:AKA_T_SALES_TEMP_Ja_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:AKA_T_SALES_TEMP_Ja_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_Ja extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES.STATUS "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.SLIP_CD = ? "
+"  AND T_SALES.DEL_FLG = 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_SALES_Ja_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_Ja_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_Ja_read
			if(m_selcmd==null) throw new FoundationException("T_SALES_Ja", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_Ja_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_Ja_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES_Ja", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_Ja_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_Ja_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES_Ja", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_Ja_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSTATUS( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES_Ja", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_Ja_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_Ja_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_SALES_Ja_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_Ja_clear

			return;
		}

		/**
		 * T_SALES_Jaクラスの標準コンストラクタ
		 */
		public T_SALES_Ja()
		{
			//{{user_implement_dev:T_SALES_Ja_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_Ja_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_JaScm extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES.STATUS "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.SLIP_CD = ? "
+"  AND T_SALES.DEL_FLG = 0 "
+"  AND T_SALES.COMPANY_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_SALES_JaScm_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_JaScm_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_JaScm_read
			if(m_selcmd==null) throw new FoundationException("T_SALES_JaScm", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_JaScm_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_JaScm_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES_JaScm", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_JaScm_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_JaScm_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES_JaScm", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_JaScm_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSTATUS( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES_JaScm", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_JaScm_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_JaScm_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_SALES_JaScm_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_JaScm_clear

			return;
		}

		/**
		 * T_SALES_JaScmクラスの標準コンストラクタ
		 */
		public T_SALES_JaScm()
		{
			//{{user_implement_dev:T_SALES_JaScm_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_JaScm_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_AR_LEDGER_H_TRN_CHECK extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_AR_LEDGER_H_TRN.STATUS AS STATUS "
+"FROM "
+"  T_AR_LEDGER_H_TRN "
+"WHERE "
+"  T_AR_LEDGER_H_TRN.SLIP_CD = ? "
+"  AND T_AR_LEDGER_H_TRN.COMPANY_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_read
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN_CHECK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_read2
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN_CHECK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_read3
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN_CHECK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSTATUS( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN_CHECK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_clear

			return;
		}

		/**
		 * T_AR_LEDGER_H_TRN_CHECKクラスの標準コンストラクタ
		 */
		public T_AR_LEDGER_H_TRN_CHECK()
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_CHECK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_AR_LEDGER_H_CHECK extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_AR_LEDGER_H.STATUS AS STATUS "
+"FROM "
+"  T_AR_LEDGER_H "
+"WHERE "
+"  T_AR_LEDGER_H.SLIP_CD = ? "
+"  AND T_AR_LEDGER_H.COMPANY_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_AR_LEDGER_H_CHECK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_AR_LEDGER_H_CHECK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_CHECK_read
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_CHECK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_CHECK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_CHECK_read2
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_CHECK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_CHECK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_CHECK_read3
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_CHECK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_CHECK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSLIP_CD());
				if(isNull(data.getSLIP_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setSTATUS( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_CHECK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_CHECK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_CHECK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_AR_LEDGER_H_CHECK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_CHECK_clear

			return;
		}

		/**
		 * T_AR_LEDGER_H_CHECKクラスの標準コンストラクタ
		 */
		public T_AR_LEDGER_H_CHECK()
		{
			//{{user_implement_dev:T_AR_LEDGER_H_CHECK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_CHECK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHECK_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  1 "
+"FROM "
+"  T_ODR ODR, "
+"  T_SHIP_ODR SHIP_ODR, "
+"  T_SHIP SHIP, "
+"  T_SALES SALES, "
+"  M_CUST CUST "
+"WHERE "
+"  ODR.ODR_NO = ? "
+"  AND ODR.DEL_FLG = '0' "
+"  AND ODR.ODR_NO = SHIP_ODR.ODR_NO(+) "
+"  AND SHIP_ODR.DEL_FLG(+) = '0' "
+"  AND SHIP_ODR.SLIP_CD = SHIP.SLIP_CD(+) "
+"  AND SHIP.DEL_FLG(+) = '0' "
+"  AND SHIP.SLIP_CD = SALES.SLIP_CD(+) "
+"  AND SALES.DEL_FLG(+) = '0' "
+"  AND SALES.STATUS(+) = '20' "
+"  AND SHIP.CUST_CD = CUST.CUST_CD "
+"  AND((CUST.INSPC_ACPT_TYP = 1 "
+"  AND SHIP.SHIP_SEQ_NO IS NOT NULL) "
+"  OR (CUST.INSPC_ACPT_TYP = 3 "
+"  AND SALES.SALES_SEQ_NO IS NOT NULL))";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHECK_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHECK_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_read
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHECK_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_read2
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHECK_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_read3
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHECK_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getORGN_ODR_NO());
				if(isNull(data.getORGN_ODR_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getORGN_ODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setFLAG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHECK_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CHECK_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHECK_ODR_clear

			return;
		}

		/**
		 * CHECK_ODRクラスの標準コンストラクタ
		 */
		public CHECK_ODR()
		{
			//{{user_implement_dev:CHECK_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHECK_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHECK_ODR_Jf extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  1 "
+"FROM "
+"  T_ODR ODR, "
+"  T_SHIP_ODR SHIP_ODR, "
+"  T_SHIP SHIP, "
+"  T_SALES SALES, "
+"  M_CUST CUST "
+"WHERE "
+"  ODR.ODR_H_NO = ? "
+"  AND ODR.DEL_FLG = '0' "
+"  AND ODR.ODR_H_NO = SHIP_ODR.ODR_H_NO(+) "
+"  AND ODR.ODR_D_SEQ_NO = SHIP_ODR.ODR_D_SEQ_NO(+) "
+"  AND SHIP_ODR.DEL_FLG(+) = '0' "
+"  AND SHIP.ODR_H_NO(+) = SHIP_ODR.ODR_H_NO "
+"  AND SHIP.ODR_D_SEQ_NO(+) = SHIP_ODR.ODR_D_SEQ_NO "
+"  AND SHIP.PART_DLV_SEQ_NO(+) = SHIP_ODR.PART_DLV_SEQ_NO "
+"  AND SHIP.DEL_FLG(+) = '0' "
+"  AND SALES.SHIP_DLV_H_NO(+) = SHIP.SHIP_DLV_H_NO "
+"  AND SALES.SHIP_DLV_D_NO(+) = SHIP.SHIP_DLV_D_NO "
+"  AND SALES.DEL_FLG(+) = '0' "
+"  AND SALES.STATUS(+) = '20' "
+"  AND SHIP_ODR.CUST_CD = CUST.CUST_CD "
+"  AND((CUST.INSPC_ACPT_TYP = 1 "
+"  AND SHIP.SHIP_CTRL_NO IS NOT NULL) "
+"  OR (CUST.INSPC_ACPT_TYP = 3 "
+"  AND SALES.SALES_SEQ_NO IS NOT NULL))";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHECK_ODR_Jf_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHECK_ODR_Jf_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_Jf_read
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR_Jf", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHECK_ODR_Jf_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_Jf_read2
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR_Jf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHECK_ODR_Jf_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_Jf_read3
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR_Jf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHECK_ODR_Jf_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getORGN_ODR_NO());
				if(isNull(data.getORGN_ODR_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getORGN_ODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setFLAG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR_Jf", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_Jf_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHECK_ODR_Jf_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CHECK_ODR_Jf_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHECK_ODR_Jf_clear

			return;
		}

		/**
		 * CHECK_ODR_Jfクラスの標準コンストラクタ
		 */
		public CHECK_ODR_Jf()
		{
			//{{user_implement_dev:CHECK_ODR_Jf_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHECK_ODR_Jf_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHECK_ODR_Ja extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  1 "
+"FROM "
+"  T_ODR ODR, "
+"  T_SHIP_ODR SHIP, "
+"  T_SHIP TSHIP, "
+"  T_SALES SALES, "
+"  M_CUST CUST "
+"WHERE "
+"  ODR.ODR_CTL_NO = ? "
+"  AND ODR.COMPANY_CD = ? "
+"  AND ODR.DEL_FLG = '0' "
+"  AND SHIP.COMPANY_CD(+) = ODR.COMPANY_CD "
+"  AND SHIP.ODR_DEPOT_CTL_NO(+) = ODR.ODR_CTL_NO "
+"  AND SHIP.DEL_FLG(+) = '0' "
+"  AND TSHIP.SHIP_ODR_NO(+) = SHIP.SHIP_ODR_NO "
+"  AND TSHIP.COMPANY_CD(+) = SHIP.COMPANY_CD "
+"  AND TSHIP.ODR_CTL_NO(+) = SHIP.ODR_DEPOT_CTL_NO "
+"  AND TSHIP.DEL_FLG(+) = '0' "
+"  AND SALES.SLIP_CD(+) = TSHIP.SLIP_CD "
+"  AND SALES.SHIP_ODR_NO(+) = TSHIP.SHIP_ODR_NO "
+"  AND SALES.DEL_FLG(+) = '0' "
+"  AND SALES.STATUS(+) = '20' "
+"  AND SHIP.CUST_CD = CUST.CUST_CD "
+"  AND((CUST.INSPC_ACPT_TYP = 1 "
+"  AND TSHIP.SHIP_SEQ_NO IS NOT NULL) "
+"  OR (CUST.INSPC_ACPT_TYP = 3 "
+"  AND SALES.SALES_SEQ_NO IS NOT NULL))";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHECK_ODR_Ja_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHECK_ODR_Ja_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_Ja_read
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR_Ja", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHECK_ODR_Ja_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_Ja_read2
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR_Ja", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHECK_ODR_Ja_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_Ja_read3
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR_Ja", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHECK_ODR_Ja_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getORGN_ODR_NO());
				if(isNull(data.getORGN_ODR_NO())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getORGN_ODR_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setFLAG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CHECK_ODR_Ja", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHECK_ODR_Ja_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHECK_ODR_Ja_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CHECK_ODR_Ja_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHECK_ODR_Ja_clear

			return;
		}

		/**
		 * CHECK_ODR_Jaクラスの標準コンストラクタ
		 */
		public CHECK_ODR_Ja()
		{
			//{{user_implement_dev:CHECK_ODR_Ja_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHECK_ODR_Ja_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_MODIFY_Jf extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES_H.MODIFY_COUNT, "
+"  T_SALES.MODIFY_COUNT "
+"FROM "
+"  T_SALES, "
+"  T_SALES_H "
+"WHERE "
+"  T_SALES.SALES_TYP = 4 "
+"  AND T_SALES.DEL_FLG = 0 "
+"  AND T_SALES_H.SALES_TYP = 4 "
+"  AND T_SALES_H.DEL_FLG = 0 "
+"  AND T_SALES_H.SALES_H_NO = T_SALES.SALES_H_NO "
+"  AND T_SALES_H.SALES_H_NO = ? "
+"  AND T_SALES.SALES_SEQ_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_SALES_MODIFY_Jf_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_MODIFY_Jf_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_MODIFY_Jf_read
			if(m_selcmd==null) throw new FoundationException("T_SALES_MODIFY_Jf", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_MODIFY_Jf_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_MODIFY_Jf_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES_MODIFY_Jf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_MODIFY_Jf_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_MODIFY_Jf_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES_MODIFY_Jf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_MODIFY_Jf_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_SALES_H_NO());
				if(isNull(data.geth_SALES_H_NO())) isNull = true;
				ary.addElement(data.geth_SALES_SEQ_NO());
				if(isNull(data.geth_SALES_SEQ_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_SALES_MODIFY_Jf", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.geth_SALES_H_NO())) setString(no ++, data.geth_SALES_H_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.geth_SALES_SEQ_NO())) setString(no ++, data.geth_SALES_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setH_MODIFY_COUNT( getString(1, rs) );
			data.setMODIFY_COUNT( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES_MODIFY_Jf", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_MODIFY_Jf_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_MODIFY_Jf_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_SALES_MODIFY_Jf_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_MODIFY_Jf_clear

			return;
		}

		/**
		 * T_SALES_MODIFY_Jfクラスの標準コンストラクタ
		 */
		public T_SALES_MODIFY_Jf()
		{
			//{{user_implement_dev:T_SALES_MODIFY_Jf_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_MODIFY_Jf_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ODR_UNSTOCK_UPDATE_SLIP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_ODR_UNSTOCK "
+"SET "
+"  SLIP_CD = ? "
+"WHERE "
+"  ODR_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0070010";
		protected String m_sUpdateProgramName="KR0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ODR_UNSTOCK_UPDATE_SLIP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ODR_UNSTOCK_UPDATE_SLIP_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getSLIP_CD(), stmt);
				setString(5, data.getODR_NO(), stmt);

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
			//{{user_implement_dev:T_ODR_UNSTOCK_UPDATE_SLIP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ODR_UNSTOCK_UPDATE_SLIP_clear

			return;
		}

		/**
		 * T_ODR_UNSTOCK_UPDATE_SLIPクラスの標準コンストラクタ
		 */
		public T_ODR_UNSTOCK_UPDATE_SLIP()
		{
			//{{user_implement_dev:T_ODR_UNSTOCK_UPDATE_SLIP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ODR_UNSTOCK_UPDATE_SLIP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSHIP_DLV_H_NO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  1 "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.SHIP_DLV_H_NO = ? "
+"  AND T_SALES.SALES_TYP = 4 "
+"  AND T_SALES.DEL_FLG = 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSHIP_DLV_H_NO_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSHIP_DLV_H_NO_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSHIP_DLV_H_NO_read
			if(m_selcmd==null) throw new FoundationException("checkSHIP_DLV_H_NO", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSHIP_DLV_H_NO_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSHIP_DLV_H_NO_read2
			if(m_selcmd==null) throw new FoundationException("checkSHIP_DLV_H_NO", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSHIP_DLV_H_NO_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSHIP_DLV_H_NO_read3
			if(m_selcmd==null) throw new FoundationException("checkSHIP_DLV_H_NO", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSHIP_DLV_H_NO_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setFLAG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkSHIP_DLV_H_NO", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSHIP_DLV_H_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSHIP_DLV_H_NO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkSHIP_DLV_H_NO_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSHIP_DLV_H_NO_clear

			return;
		}

		/**
		 * checkSHIP_DLV_H_NOクラスの標準コンストラクタ
		 */
		public checkSHIP_DLV_H_NO()
		{
			//{{user_implement_dev:checkSHIP_DLV_H_NO_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSHIP_DLV_H_NO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_AR_LEDGER_H_TRN_Jf extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_AR_LEDGER_H_TRN.COMPANY_CD AS COMPANY_CD "
+"FROM "
+"  T_AR_LEDGER_H_TRN, "
+"  SYS_MY_COMPANY "
+"WHERE "
+"  SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  AND T_AR_LEDGER_H_TRN.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
+"  AND T_AR_LEDGER_H_TRN.SHIP_INST_SLIP_CD = ? "
+"  AND T_AR_LEDGER_H_TRN.SALES_MODIFICATION_FLG = '0' "
+"  AND T_AR_LEDGER_H_TRN.INSPC_ACPT_CRCT_TYP = '2' "
+"  AND T_AR_LEDGER_H_TRN.STATUS < 40";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_AR_LEDGER_H_TRN_Jf_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_AR_LEDGER_H_TRN_Jf_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_Jf_read
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN_Jf", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_Jf_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_Jf_read2
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN_Jf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_Jf_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_Jf_read3
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN_Jf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_Jf_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_TRN_Jf", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_Jf_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_Jf_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_Jf_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_Jf_clear

			return;
		}

		/**
		 * T_AR_LEDGER_H_TRN_Jfクラスの標準コンストラクタ
		 */
		public T_AR_LEDGER_H_TRN_Jf()
		{
			//{{user_implement_dev:T_AR_LEDGER_H_TRN_Jf_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_TRN_Jf_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_AR_LEDGER_H_Jf extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_AR_LEDGER_H.COMPANY_CD "
+"FROM "
+"  T_AR_LEDGER_H, "
+"  SYS_MY_COMPANY "
+"WHERE "
+"  SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  AND T_AR_LEDGER_H.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
+"  AND T_AR_LEDGER_H.SHIP_INST_SLIP_CD = ? "
+"  AND T_AR_LEDGER_H.SALES_MODIFICATION_FLG = '0' "
+"  AND T_AR_LEDGER_H.INSPC_ACPT_CRCT_TYP = '2' "
+"  AND T_AR_LEDGER_H.STATUS < 40";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_AR_LEDGER_H_Jf_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_AR_LEDGER_H_Jf_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_Jf_read
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_Jf", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_Jf_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_Jf_read2
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_Jf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_Jf_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_Jf_read3
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_Jf", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_AR_LEDGER_H_Jf_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_AR_LEDGER_H_Jf", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_AR_LEDGER_H_Jf_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_AR_LEDGER_H_Jf_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_AR_LEDGER_H_Jf_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_Jf_clear

			return;
		}

		/**
		 * T_AR_LEDGER_H_Jfクラスの標準コンストラクタ
		 */
		public T_AR_LEDGER_H_Jf()
		{
			//{{user_implement_dev:T_AR_LEDGER_H_Jf_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_AR_LEDGER_H_Jf_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_SALES_ApprFlg extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES.APPR_FLG "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.DEL_FLG = 0 "
+"  AND T_SALES.APPR_FLG <> 1 "
+"  AND T_SALES.SLIP_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_SALES_ApprFlg_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_SALES_ApprFlg_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_ApprFlg_read
			if(m_selcmd==null) throw new FoundationException("T_SALES_ApprFlg", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_ApprFlg_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_ApprFlg_read2
			if(m_selcmd==null) throw new FoundationException("T_SALES_ApprFlg", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_ApprFlg_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_ApprFlg_read3
			if(m_selcmd==null) throw new FoundationException("T_SALES_ApprFlg", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_SALES_ApprFlg_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setw_APR_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_SALES_ApprFlg", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_SALES_ApprFlg_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_SALES_ApprFlg_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_SALES_ApprFlg_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_SALES_ApprFlg_clear

			return;
		}

		/**
		 * T_SALES_ApprFlgクラスの標準コンストラクタ
		 */
		public T_SALES_ApprFlg()
		{
			//{{user_implement_dev:T_SALES_ApprFlg_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_SALES_ApprFlg_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_PJ_ODR_ALC extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  1 "
+"FROM "
+"  T_PJ_ODR_ALC "
+"WHERE "
+"  T_PJ_ODR_ALC.ODR_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_PJ_ODR_ALC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectT_PJ_ODR_ALC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0070010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0070010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PJ_ODR_ALC_read
			if(m_selcmd==null) throw new FoundationException("selectT_PJ_ODR_ALC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PJ_ODR_ALC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PJ_ODR_ALC_read2
			if(m_selcmd==null) throw new FoundationException("selectT_PJ_ODR_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_PJ_ODR_ALC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KR0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PJ_ODR_ALC_read3
			if(m_selcmd==null) throw new FoundationException("selectT_PJ_ODR_ALC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_PJ_ODR_ALC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0070010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KR0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0070010Struct data = new KR0070010Struct();

			data.setCnt_Tpj( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_PJ_ODR_ALC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KR0070010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PJ_ODR_ALC_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PJ_ODR_ALC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KR0070010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_PJ_ODR_ALC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectT_PJ_ODR_ALC_clear

			return;
		}

		/**
		 * selectT_PJ_ODR_ALCクラスの標準コンストラクタ
		 */
		public selectT_PJ_ODR_ALC()
		{
			//{{user_implement_dev:selectT_PJ_ODR_ALC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectT_PJ_ODR_ALC_constractor

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
		mSYS_INSTALL_OPTIONS.clear();
		mSYS_INSTALL_OPTIONS = null;
		mselectOfInsert.clear();
		mselectOfInsert = null;
		mselectOfUpdateDeleteJ.clear();
		mselectOfUpdateDeleteJ = null;
		mselectOfUpdateDeleteJa.clear();
		mselectOfUpdateDeleteJa = null;
		mselectOfUpdateDeleteJf.clear();
		mselectOfUpdateDeleteJf = null;
		mT_ODR_UNSTOCK.clear();
		mT_ODR_UNSTOCK = null;
		mM_ITEM.clear();
		mM_ITEM = null;
		mM_CUST_ITEM.clear();
		mM_CUST_ITEM = null;
		mM_ORG.clear();
		mM_ORG = null;
		mUSER_MST.clear();
		mUSER_MST = null;
		mM_TAX.clear();
		mM_TAX = null;
		mT_AR_LEDGER_H.clear();
		mT_AR_LEDGER_H = null;
		mT_AR_LEDGER_H_TRN.clear();
		mT_AR_LEDGER_H_TRN = null;
		mM_CUST.clear();
		mM_CUST = null;
		mT_SALES.clear();
		mT_SALES = null;
		mSYS_PARAMETER.clear();
		mSYS_PARAMETER = null;
		mSYS_INSTALL_OPTIONS_AI.clear();
		mSYS_INSTALL_OPTIONS_AI = null;
		mSYS_MY_COMPANY.clear();
		mSYS_MY_COMPANY = null;
		mSYS_CLASS_CODE.clear();
		mSYS_CLASS_CODE = null;
		mSYS_DATE_CTRL.clear();
		mSYS_DATE_CTRL = null;
		mM_CUR.clear();
		mM_CUR = null;
		mSYS_INSTALL_OPTIONS_B.clear();
		mSYS_INSTALL_OPTIONS_B = null;
		mSEQ_SALES_SEQ_NO.clear();
		mSEQ_SALES_SEQ_NO = null;
		mT_SALES_TEMP.clear();
		mT_SALES_TEMP = null;
		mM_CLAIM_CUST_CTRL.clear();
		mM_CLAIM_CUST_CTRL = null;
		mSEQ_SALES_H_NO.clear();
		mSEQ_SALES_H_NO = null;
		mSEQ_ODR.clear();
		mSEQ_ODR = null;
		mT_SALES_H.clear();
		mT_SALES_H = null;
		mT_SALES_Jf.clear();
		mT_SALES_Jf = null;
		mT_SALES_CreditRecord.clear();
		mT_SALES_CreditRecord = null;
		mT_SALES_Delete.clear();
		mT_SALES_Delete = null;
		mAKA_T_SALES_TEMP.clear();
		mAKA_T_SALES_TEMP = null;
		mT_SALES_TEMP_Delete.clear();
		mT_SALES_TEMP_Delete = null;
		mT_SALES_H_Delete.clear();
		mT_SALES_H_Delete = null;
		mUSER_MST_SCM.clear();
		mUSER_MST_SCM = null;
		mAKA_T_SALES_TEMP_Ja.clear();
		mAKA_T_SALES_TEMP_Ja = null;
		mT_SALES_Ja.clear();
		mT_SALES_Ja = null;
		mT_SALES_JaScm.clear();
		mT_SALES_JaScm = null;
		mT_AR_LEDGER_H_TRN_CHECK.clear();
		mT_AR_LEDGER_H_TRN_CHECK = null;
		mT_AR_LEDGER_H_CHECK.clear();
		mT_AR_LEDGER_H_CHECK = null;
		mCHECK_ODR.clear();
		mCHECK_ODR = null;
		mCHECK_ODR_Jf.clear();
		mCHECK_ODR_Jf = null;
		mCHECK_ODR_Ja.clear();
		mCHECK_ODR_Ja = null;
		mT_SALES_MODIFY_Jf.clear();
		mT_SALES_MODIFY_Jf = null;
		mT_ODR_UNSTOCK_UPDATE_SLIP.clear();
		mT_ODR_UNSTOCK_UPDATE_SLIP = null;
		mcheckSHIP_DLV_H_NO.clear();
		mcheckSHIP_DLV_H_NO = null;
		mT_AR_LEDGER_H_TRN_Jf.clear();
		mT_AR_LEDGER_H_TRN_Jf = null;
		mT_AR_LEDGER_H_Jf.clear();
		mT_AR_LEDGER_H_Jf = null;
		mT_SALES_ApprFlg.clear();
		mT_SALES_ApprFlg = null;
		mselectT_PJ_ODR_ALC.clear();
		mselectT_PJ_ODR_ALC = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * KR0070010クラスの標準コンストラクタ
	 */
	public KR0070010Entity() throws FoundationException
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
