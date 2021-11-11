/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0040/src/com/nec/jp/orteus/metamorBase/AF0040/AF0040010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0040;

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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0040010Entity extends DataObject
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

	// selectT_OPR_INST_SLIPクラス インスタンス
	public selectT_OPR_INST_SLIP mselectT_OPR_INST_SLIP = new selectT_OPR_INST_SLIP();

	// selectT_WORK_IN_PROC_BY_ITEMクラス インスタンス
	public selectT_WORK_IN_PROC_BY_ITEM mselectT_WORK_IN_PROC_BY_ITEM = new selectT_WORK_IN_PROC_BY_ITEM();

	// selectT_WORK_IN_PROC_BY_PROCクラス インスタンス
	public selectT_WORK_IN_PROC_BY_PROC mselectT_WORK_IN_PROC_BY_PROC = new selectT_WORK_IN_PROC_BY_PROC();

	// selectT_RLSD_PUCH_ODRクラス インスタンス
	public selectT_RLSD_PUCH_ODR mselectT_RLSD_PUCH_ODR = new selectT_RLSD_PUCH_ODR();

	// selectクラス インスタンス
	public select mselect = new select();

	// selectTOTAL_ITEM_STOCKクラス インスタンス
	public selectTOTAL_ITEM_STOCK mselectTOTAL_ITEM_STOCK = new selectTOTAL_ITEM_STOCK();

	// selectTOTAL_JOB_ODR_STOCKクラス インスタンス
	public selectTOTAL_JOB_ODR_STOCK mselectTOTAL_JOB_ODR_STOCK = new selectTOTAL_JOB_ODR_STOCK();

	// selectSYS_DATE_CTRLクラス インスタンス
	public selectSYS_DATE_CTRL mselectSYS_DATE_CTRL = new selectSYS_DATE_CTRL();

	// selectM_WHクラス インスタンス
	public selectM_WH mselectM_WH = new selectM_WH();

	// insertT_RCV_ISSUEクラス インスタンス
	public insertT_RCV_ISSUE minsertT_RCV_ISSUE = new insertT_RCV_ISSUE();

	// insertT_PAST_ONEROUS_CONSクラス インスタンス
	public insertT_PAST_ONEROUS_CONS minsertT_PAST_ONEROUS_CONS = new insertT_PAST_ONEROUS_CONS();

	// selectSub1_ITEM_STOCKクラス インスタンス
	public selectSub1_ITEM_STOCK mselectSub1_ITEM_STOCK = new selectSub1_ITEM_STOCK();

	// selectSub1_JOB_ODR_STOCKクラス インスタンス
	public selectSub1_JOB_ODR_STOCK mselectSub1_JOB_ODR_STOCK = new selectSub1_JOB_ODR_STOCK();

	// selectM_COSTクラス インスタンス
	public selectM_COST mselectM_COST = new selectM_COST();

	// selectM_WH_vendクラス インスタンス
	public selectM_WH_vend mselectM_WH_vend = new selectM_WH_vend();

	// SYS_DEBT_CTRLクラス インスタンス
	public SYS_DEBT_CTRL mSYS_DEBT_CTRL = new SYS_DEBT_CTRL();

	// SYS_INSTALL_OPTIONSクラス インスタンス
	public SYS_INSTALL_OPTIONS mSYS_INSTALL_OPTIONS = new SYS_INSTALL_OPTIONS();

	// SELECT_SYS_PARAMETERクラス インスタンス
	public SELECT_SYS_PARAMETER mSELECT_SYS_PARAMETER = new SELECT_SYS_PARAMETER();

	// SELECT_SYS_ACTUAL_COST_CTRL_ACクラス インスタンス
	public SELECT_SYS_ACTUAL_COST_CTRL_AC mSELECT_SYS_ACTUAL_COST_CTRL_AC = new SELECT_SYS_ACTUAL_COST_CTRL_AC();

	// T_LOT_ISSUE_INSTクラス インスタンス
	public T_LOT_ISSUE_INST mT_LOT_ISSUE_INST = new T_LOT_ISSUE_INST();

	// T_LOT_CTRLクラス インスタンス
	public T_LOT_CTRL mT_LOT_CTRL = new T_LOT_CTRL();

	// T_LOT_STOCKクラス インスタンス
	public T_LOT_STOCK mT_LOT_STOCK = new T_LOT_STOCK();

	// c_BEST_BEFORE_DATEクラス インスタンス
	public c_BEST_BEFORE_DATE mc_BEST_BEFORE_DATE = new c_BEST_BEFORE_DATE();

	// T_LOT_ISSUE_INST_Lockクラス インスタンス
	public T_LOT_ISSUE_INST_Lock mT_LOT_ISSUE_INST_Lock = new T_LOT_ISSUE_INST_Lock();

	// SYS_PARAMETERクラス インスタンス
	public SYS_PARAMETER mSYS_PARAMETER = new SYS_PARAMETER();

	// SYS_PARAM_LOT_FLGクラス インスタンス
	public SYS_PARAM_LOT_FLG mSYS_PARAM_LOT_FLG = new SYS_PARAM_LOT_FLG();

	// selectCntクラス インスタンス
	public selectCnt mselectCnt = new selectCnt();

	// T_LOT_STOCKCntクラス インスタンス
	public T_LOT_STOCKCnt mT_LOT_STOCKCnt = new T_LOT_STOCKCnt();

	// T_LOT_ISSUE_INSTCntクラス インスタンス
	public T_LOT_ISSUE_INSTCnt mT_LOT_ISSUE_INSTCnt = new T_LOT_ISSUE_INSTCnt();


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
                        //}}user_implement_dev:ei_CSVOut_constractor

			return;
		}

		//////////////////////////////

		// csv用の変数
		String m_write_path="D:/Orteus/csv/";
		String m_write_fname="AF0040010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AF0040010";

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
	public class selectT_OPR_INST_SLIP extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(T_OPR_INST_SLIP.\"OPR_INST_CD_GNR_TYP\") as \"OPR_INST_CD_GNR_TYP\", "
+"  T_OPR_INST_SLIP.\"PLANT_CD\" as \"PLANT_CD\" "
+"from "
+"  T_OPR_INST_SLIP "
+"where "
+"  T_OPR_INST_SLIP.\"OPR_INST_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_OPR_INST_SLIP_def
                //}}user_implement_dev:selectT_OPR_INST_SLIP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_OPR_INST_SLIP_read
			if(m_selcmd==null) throw new FoundationException("selectT_OPR_INST_SLIP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_OPR_INST_SLIP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_OPR_INST_SLIP_read2
			if(m_selcmd==null) throw new FoundationException("selectT_OPR_INST_SLIP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_OPR_INST_SLIP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_OPR_INST_SLIP_read3
			if(m_selcmd==null) throw new FoundationException("selectT_OPR_INST_SLIP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_OPR_INST_SLIP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOPR_INST_CD());
				if(isNull(data.getOPR_INST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOPR_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setOPR_INST_CD_GNR_TYP( getString(1, rs) );
			data.setPLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_OPR_INST_SLIP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_OPR_INST_SLIP_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectT_OPR_INST_SLIP", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_OPR_INST_SLIP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_OPR_INST_SLIP_clear
                        //}}user_implement_dev:selectT_OPR_INST_SLIP_clear

			return;
		}

		/**
		 * selectT_OPR_INST_SLIPクラスの標準コンストラクタ
		 */
		public selectT_OPR_INST_SLIP()
		{
			//{{user_implement_dev:selectT_OPR_INST_SLIP_constractor
                        //}}user_implement_dev:selectT_OPR_INST_SLIP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_WORK_IN_PROC_BY_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_WORK_IN_PROC_BY_ITEM.\"WORK_ODR_CD\" as \"WORK_ODR_CD\", "
+"  T_WORK_IN_PROC_BY_ITEM.\"OD_NO\" as \"OD_NO\", "
+"  T_WORK_IN_PROC_BY_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_WORK_IN_PROC_BY_ITEM.\"WS_CD\" as \"WS_CD\", "
+"  TO_CHAR(T_WORK_IN_PROC_BY_ITEM.\"OPR_INST_START_DATE\", 'YYYY/MM/DD') as \"OPR_INST_START_DATE\", "
+"  TO_CHAR(T_WORK_IN_PROC_BY_ITEM.\"WORK_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"WORK_ODR_DLV_DATE\", "
+"  TO_CHAR(T_WORK_IN_PROC_BY_ITEM.\"OPR_INST_QTY\", 'FM999999999999999990.0999') as \"OPR_INST_QTY\", "
+"  T_WORK_IN_PROC_BY_ITEM.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_WS.\"WS_NAME\" as \"WS_NAME\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\" "
+"from "
+"  T_WORK_IN_PROC_BY_ITEM, "
+"  T_OD, "
+"  M_WS, "
+"  M_ITEM "
+"where "
+"  T_WORK_IN_PROC_BY_ITEM.OD_NO = T_OD.OD_NO(+) "
+"  and T_WORK_IN_PROC_BY_ITEM.WS_CD = M_WS.WS_CD(+) "
+"  and T_WORK_IN_PROC_BY_ITEM.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_WORK_IN_PROC_BY_ITEM.\"OPR_INST_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_def
                //}}user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_read
			if(m_selcmd==null) throw new FoundationException("selectT_WORK_IN_PROC_BY_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("selectT_WORK_IN_PROC_BY_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("selectT_WORK_IN_PROC_BY_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOPR_INST_CD());
				if(isNull(data.getOPR_INST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOPR_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setWORK_ODR_CD( getString(1, rs) );
			data.setOD_NO( getString(2, rs) );
			data.setITEM_CD( getString(3, rs) );
			data.setWS_CD( getString(4, rs) );
			data.setOPR_INST_START_DATE( getString(5, rs) );
			data.setWORK_ODR_DLV_DATE( getString(6, rs) );
			data.setOPR_INST_QTY( getString(7, rs) );
			data.setPLANT_CD( getString(8, rs) );
			data.setJOB_ODR_CD( getString(9, rs) );
			data.setWS_NAME( getString(10, rs) );
			data.setITEM_NAME( getString(11, rs) );
			data.setSTOCK_UNIT( getString(12, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_WORK_IN_PROC_BY_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectT_WORK_IN_PROC_BY_ITEM", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_clear
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_clear

			return;
		}

		/**
		 * selectT_WORK_IN_PROC_BY_ITEMクラスの標準コンストラクタ
		 */
		public selectT_WORK_IN_PROC_BY_ITEM()
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_constractor
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_WORK_IN_PROC_BY_PROC extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_WORK_IN_PROC_BY_PROC.\"WORK_ODR_CD\" as \"WORK_ODR_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"OD_NO\" as \"OD_NO\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PROC_NAME\" as \"PROC_NAME\", "
+"  T_WORK_IN_PROC_BY_PROC.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"WS_CD\" as \"WS_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"VEND_CD\" as \"VEND_CD\", "
+"  TO_CHAR(T_WORK_IN_PROC_BY_PROC.\"OPR_INST_START_DATE\", 'YYYY/MM/DD') as \"OPR_INST_START_DATE\", "
+"  TO_CHAR(T_WORK_IN_PROC_BY_PROC.\"WORK_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"WORK_ODR_DLV_DATE\", "
+"  TO_CHAR(T_WORK_IN_PROC_BY_PROC.\"OPR_INST_QTY\", 'FM999999999999999990.0999') as \"OPR_INST_QTY\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_WS.\"WS_NAME\" as \"WS_NAME\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  M_VEND_CTRL.\"VEND_ANAME\" as \"VEND_ANAME\" "
+"from "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  T_OD, "
+"  M_WS, "
+"  M_ITEM, "
+"  M_VEND_CTRL "
+"where "
+"  T_WORK_IN_PROC_BY_PROC.OD_NO = T_OD.OD_NO(+) "
+"  and T_WORK_IN_PROC_BY_PROC.WS_CD = M_WS.WS_CD(+) "
+"  and T_WORK_IN_PROC_BY_PROC.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_WORK_IN_PROC_BY_PROC.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_WORK_IN_PROC_BY_PROC.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_WORK_IN_PROC_BY_PROC.\"OPR_INST_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_def
                //}}user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_read
			if(m_selcmd==null) throw new FoundationException("selectT_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_read2
			if(m_selcmd==null) throw new FoundationException("selectT_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_read3
			if(m_selcmd==null) throw new FoundationException("selectT_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOPR_INST_CD());
				if(isNull(data.getOPR_INST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOPR_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setWORK_ODR_CD( getString(1, rs) );
			data.setWORK_IN_PROC_CD( getString(2, rs) );
			data.setOD_NO( getString(3, rs) );
			data.setPROC_NAME( getString(4, rs) );
			data.setITEM_CD( getString(5, rs) );
			data.setWS_CD( getString(6, rs) );
			data.setCOMPANY_CD( getString(7, rs) );
			data.setVEND_CD( getString(8, rs) );
			data.setOPR_INST_START_DATE( getString(9, rs) );
			data.setWORK_ODR_DLV_DATE( getString(10, rs) );
			data.setOPR_INST_QTY( getString(11, rs) );
			data.setPLANT_CD( getString(12, rs) );
			data.setJOB_ODR_CD( getString(13, rs) );
			data.setWS_NAME( getString(14, rs) );
			data.setITEM_NAME( getString(15, rs) );
			data.setSTOCK_UNIT( getString(16, rs) );
			data.setVEND_ANAME( getString(17, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_WORK_IN_PROC_BY_PROC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectT_WORK_IN_PROC_BY_PROC", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_clear
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_clear

			return;
		}

		/**
		 * selectT_WORK_IN_PROC_BY_PROCクラスの標準コンストラクタ
		 */
		public selectT_WORK_IN_PROC_BY_PROC()
		{
			//{{user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_constractor
                        //}}user_implement_dev:selectT_WORK_IN_PROC_BY_PROC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectT_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_RLSD_PUCH_ODR.\"WH_CD\" as \"WH_CD\", "
+"  T_RLSD_PUCH_ODR.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" as \"VEND_CD\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_START_DATE\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_DLV_DATE\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\", 'FM999999999999999990.0999') as \"PUCH_ODR_QTY\", "
+"  T_RLSD_PUCH_ODR.\"WORK_ODR_CD\" as \"WORK_ODR_CD\", "
+"  T_RLSD_PUCH_ODR.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_RLSD_PUCH_ODR.\"OD_NO\" as \"OD_NO\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_VEND_CTRL.\"VEND_ANAME\" as \"VEND_ANAME\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PROC_NAME\" as \"PROC_NAME\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  M_VEND_CTRL, "
+"  T_OD, "
+"  M_ITEM, "
+"  T_WORK_IN_PROC_BY_PROC "
+"where "
+"  T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_RLSD_PUCH_ODR_def
                //}}user_implement_dev:selectT_RLSD_PUCH_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_RLSD_PUCH_ODR_read
			if(m_selcmd==null) throw new FoundationException("selectT_RLSD_PUCH_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_RLSD_PUCH_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_RLSD_PUCH_ODR_read2
			if(m_selcmd==null) throw new FoundationException("selectT_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_RLSD_PUCH_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_RLSD_PUCH_ODR_read3
			if(m_selcmd==null) throw new FoundationException("selectT_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectT_RLSD_PUCH_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setWH_CD( getString(2, rs) );
			data.setCOMPANY_CD( getString(3, rs) );
			data.setVEND_CD( getString(4, rs) );
			data.setPLANT_CD( getString(5, rs) );
			data.setOPR_INST_START_DATE( getString(6, rs) );
			data.setWORK_ODR_DLV_DATE( getString(7, rs) );
			data.setOPR_INST_QTY( getString(8, rs) );
			data.setWORK_ODR_CD( getString(9, rs) );
			data.setWORK_IN_PROC_CD( getString(10, rs) );
			data.setOD_NO( getString(11, rs) );
			data.setJOB_ODR_CD( getString(12, rs) );
			data.setVEND_ANAME( getString(13, rs) );
			data.setITEM_NAME( getString(14, rs) );
			data.setSTOCK_UNIT( getString(15, rs) );
			data.setPROC_NAME( getString(16, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_RLSD_PUCH_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_RLSD_PUCH_ODR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectT_RLSD_PUCH_ODR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectT_RLSD_PUCH_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_RLSD_PUCH_ODR_clear
                        //}}user_implement_dev:selectT_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * selectT_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public selectT_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:selectT_RLSD_PUCH_ODR_constractor
                        //}}user_implement_dev:selectT_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class select extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ISSUE_INST.\"ISSUE_INST_CD\" as \"ISSUE_INST_CD\", "
+"  T_ISSUE_INST.\"ITEM_CD\" as \"ITEM_CD\", "
+"  TO_CHAR(T_ISSUE_INST.\"ISSUE_INST_QTY\", 'FM999999999999999990.0999') as \"ISSUE_INST_QTY\", "
+"  TO_CHAR(T_ISSUE_INST.\"TOTAL_ISSUE_QTY\", 'FM999999999999999990.0999') as \"TOTAL_ISSUE_QTY\", "
+"  TO_CHAR(DECODE(T_ISSUE_INST.\"ISSUE_CMPLT_FLG\", '1', 0,(T_ISSUE_INST.\"ISSUE_INST_QTY\" - T_ISSUE_INST.\"TOTAL_ISSUE_QTY\")), 'FM999999999999999990.0999') as \"SHIP_REMAIN_QTY\", "
+"  TO_CHAR(T_ISSUE_INST.\"SCDL_ISSUE_DATE\", 'YYYY/MM/DD') as \"SCDL_ISSUE_DATE\", "
+"  TO_CHAR(T_ISSUE_INST.\"ISSUE_CMPLT_DATE\", 'YYYY/MM/DD') as \"ISSUE_CMPLT_DATE\", "
+"  TO_CHAR(T_ISSUE_INST.\"ISSUE_CMPLT_FLG\") as \"ISSUE_CMPLT_FLG\", "
+"  T_ISSUE_INST.\"WH_CD\" as \"WH_CD\", "
+"  T_ISSUE_INST.\"WS_CD\" as \"WS_CD\", "
+"  T_ISSUE_INST.\"WORK_ODR_CD\" as \"WORK_ODR_CD\", "
+"  T_ISSUE_INST.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_ISSUE_INST.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  T_ISSUE_INST.\"VEND_CD\" as \"VEND_CD\", "
+"  T_ISSUE_INST.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  TO_CHAR(T_ISSUE_INST.\"CONS_TYP\") as \"CONS_TYP\", "
+"  T_ISSUE_INST.\"OD_NO\" as \"OD_NO\", "
+"  T_ISSUE_INST.\"PLANT_CD\" as \"PLANT_CD\", "
+"  TO_CHAR(T_ISSUE_INST.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\") as \"UNIT_QTY_TYP\", "
+"  TO_CHAR(T_OD.\"MRP_ODR_TYP\") as \"MRP_ODR_TYP\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  M_WS.\"WS_NAME\" as \"WS_NAME\", "
+"  M_VEND_CTRL.\"VEND_ANAME\" as \"VEND_ANAME\", "
+"  TO_CHAR(T_ISSUE_INST.\"ISSUE_TYP\") as \"ISSUE_TYP\" "
+"from "
+"  T_ISSUE_INST, "
+"  T_OD, "
+"  M_ITEM, "
+"  M_WH, "
+"  M_WS, "
+"  M_VEND_CTRL, "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  T_WORK_IN_PROC_BY_ITEM "
+"where "
+"  T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
+"  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_ISSUE_INST.WH_CD = M_WH.WH_CD(+) "
+"  and T_ISSUE_INST.WS_CD = M_WS.WS_CD(+) "
+"  and T_ISSUE_INST.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_ISSUE_INST.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_ISSUE_INST.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_ISSUE_INST.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_ISSUE_INST.WORK_ODR_CD = T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD(+) "
+"  and T_ISSUE_INST.\"WORK_ODR_CD\" = ? "
+"  and T_ISSUE_INST.\"WORK_IN_PROC_CD\" = ? "
+"  and T_ISSUE_INST.\"PUCH_ODR_CD\" = ? "
+"  and T_ISSUE_INST.\"ISSUE_INST_CD\" = ? "
+"  and T_ISSUE_INST.\"PLANT_CD\" = ? "
+"  and T_ISSUE_INST.\"ISSUE_CMPLT_FLG\" = 1 "
+"  and M_ITEM.\"LOT_CTRL_FLG\" = ? "
+"order by "
+"  T_ISSUE_INST.\"ISSUE_INST_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_def
                //}}user_implement_dev:select_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read
			if(m_selcmd==null) throw new FoundationException("select", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:select_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read2
			if(m_selcmd==null) throw new FoundationException("select", "read", "クエリー未登録");
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
                        //}}user_implement_dev:select_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read3
			if(m_selcmd==null) throw new FoundationException("select", "read", "クエリー未登録");
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
                        //}}user_implement_dev:select_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWORK_ODR_CD());
				if(isNull(data.getWORK_ODR_CD())) isNull = true;
				ary.addElement(data.getWORK_IN_PROC_CD());
				if(isNull(data.getWORK_IN_PROC_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getLOT_CTRL_FLG());
				if(isNull(data.getLOT_CTRL_FLG())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("select", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getWORK_ODR_CD())) setString(no ++, data.getWORK_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWORK_IN_PROC_CD())) setString(no ++, data.getWORK_IN_PROC_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getISSUE_INST_CD())) setString(no ++, data.getISSUE_INST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getLOT_CTRL_FLG())) setString(no ++, data.getLOT_CTRL_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setISSUE_INST_CD( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setISSUE_INST_QTY( getString(3, rs) );
			data.setTOTAL_ISSUE_QTY( getString(4, rs) );
			data.setw_SHIP_REMAIN_QTY( getString(5, rs) );
			data.setSCDL_ISSUE_DATE( getString(6, rs) );
			data.setISSUE_CMPLT_DATE( getString(7, rs) );
			data.setISSUE_CMPLT_FLG( getString(8, rs) );
			data.setWH_CD( getString(9, rs) );
			data.setWS_CD( getString(10, rs) );
			data.setWORK_ODR_CD( getString(11, rs) );
			data.setWORK_IN_PROC_CD( getString(12, rs) );
			data.setPUCH_ODR_CD( getString(13, rs) );
			data.setVEND_CD( getString(14, rs) );
			data.setCOMPANY_CD( getString(15, rs) );
			data.setCONS_TYP( getString(16, rs) );
			data.setOD_NO( getString(17, rs) );
			data.setPLANT_CD( getString(18, rs) );
			data.setMODIFY_COUNT( getString(19, rs) );
			data.setJOB_ODR_CD( getString(20, rs) );
			data.setITEM_NAME( getString(21, rs) );
			data.setDRAW_CD( getString(22, rs) );
			data.setSPEC( getString(23, rs) );
			data.setSTOCK_UNIT( getString(24, rs) );
			data.setUNIT_QTY_TYP( getString(25, rs) );
			data.setMRP_ODR_TYP( getString(26, rs) );
			data.setWH_NAME( getString(27, rs) );
			data.setWS_NAME( getString(28, rs) );
			data.setVEND_ANAME( getString(29, rs) );
			data.setISSUE_TYP( getString(30, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("select", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:select_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_clear
                        //}}user_implement_dev:select_clear

			return;
		}

		/**
		 * selectクラスの標準コンストラクタ
		 */
		public select()
		{
			//{{user_implement_dev:select_constractor
                        //}}user_implement_dev:select_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectTOTAL_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(NVL(SUM(T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\"), 0), 'TM9') as \"TOTAL_STOCK_ON_HAND_QTY\" "
+"from "
+"  T_ITEM_STOCK, "
+"  M_WH "
+"where "
+"  T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"PLANT_CD\" = ? "
+"  and T_ITEM_STOCK.\"WH_CD\" = M_WH.\"WH_CD\" "
+"  and M_WH.\"MRP_FLG\" = 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectTOTAL_ITEM_STOCK_def
                //}}user_implement_dev:selectTOTAL_ITEM_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectTOTAL_ITEM_STOCK_read
			if(m_selcmd==null) throw new FoundationException("selectTOTAL_ITEM_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectTOTAL_ITEM_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectTOTAL_ITEM_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("selectTOTAL_ITEM_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectTOTAL_ITEM_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectTOTAL_ITEM_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("selectTOTAL_ITEM_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectTOTAL_ITEM_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setw_TOTAL_STOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectTOTAL_ITEM_STOCK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectTOTAL_ITEM_STOCK_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectTOTAL_ITEM_STOCK", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectTOTAL_ITEM_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectTOTAL_ITEM_STOCK_clear
                        //}}user_implement_dev:selectTOTAL_ITEM_STOCK_clear

			return;
		}

		/**
		 * selectTOTAL_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public selectTOTAL_ITEM_STOCK()
		{
			//{{user_implement_dev:selectTOTAL_ITEM_STOCK_constractor
                        //}}user_implement_dev:selectTOTAL_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectTOTAL_JOB_ODR_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(NVL(SUM(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\"), 0), 'TM9') as \"TOTAL_STOCK_ON_HAND_QTY\" "
+"from "
+"  T_JOB_ODR_CD_STOCK, "
+"  M_WH "
+"where "
+"  T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"PLANT_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"WH_CD\" = M_WH.\"WH_CD\" "
+"  and M_WH.\"MRP_FLG\" = 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectTOTAL_JOB_ODR_STOCK_def
                //}}user_implement_dev:selectTOTAL_JOB_ODR_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectTOTAL_JOB_ODR_STOCK_read
			if(m_selcmd==null) throw new FoundationException("selectTOTAL_JOB_ODR_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectTOTAL_JOB_ODR_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectTOTAL_JOB_ODR_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("selectTOTAL_JOB_ODR_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectTOTAL_JOB_ODR_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectTOTAL_JOB_ODR_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("selectTOTAL_JOB_ODR_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectTOTAL_JOB_ODR_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_JOB_ODR_CD());
				if(isNull(data.getw_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getw_JOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setw_TOTAL_STOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectTOTAL_JOB_ODR_STOCK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectTOTAL_JOB_ODR_STOCK_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectTOTAL_JOB_ODR_STOCK", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectTOTAL_JOB_ODR_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectTOTAL_JOB_ODR_STOCK_clear
                        //}}user_implement_dev:selectTOTAL_JOB_ODR_STOCK_clear

			return;
		}

		/**
		 * selectTOTAL_JOB_ODR_STOCKクラスの標準コンストラクタ
		 */
		public selectTOTAL_JOB_ODR_STOCK()
		{
			//{{user_implement_dev:selectTOTAL_JOB_ODR_STOCK_constractor
                        //}}user_implement_dev:selectTOTAL_JOB_ODR_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'yyyy/mm/dd') as \"BUSINESS_OPR_DATE\" "
+"from "
+"  SYS_DATE_CTRL "
+"where "
+"  SYS_DATE_CTRL.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_DATE_CTRL_def
                //}}user_implement_dev:selectSYS_DATE_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
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
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getw_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setBUSINESS_OPR_DATE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
                        //}}user_implement_dev:selectSYS_DATE_CTRL_clear

			return;
		}

		/**
		 * selectSYS_DATE_CTRLクラスの標準コンストラクタ
		 */
		public selectSYS_DATE_CTRL()
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_constractor
                        //}}user_implement_dev:selectSYS_DATE_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"PLANT_CD\" as \"PLANT_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  M_WH.\"VEND_CD\" as \"VEND_CD\", "
+"  TO_CHAR(M_WH.\"WH_TYP\") as \"WH_TYP\", "
+"  TO_CHAR(M_WH.\"MRP_FLG\") as \"MRP_FLG\" "
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
                //}}user_implement_dev:selectM_WH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
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
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettmp_WH_CD());
				if(isNull(data.gettmp_WH_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.gettmp_WH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setWH_PLANT_CD( getString(1, rs) );
			data.setWH_NAME( getString(2, rs) );
			data.setWH_VEND_CD( getString(3, rs) );
			data.setWH_TYP( getString(4, rs) );
			data.setMRP_FLG( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
                        //}}user_implement_dev:selectM_WH_clear

			return;
		}

		/**
		 * selectM_WHクラスの標準コンストラクタ
		 */
		public selectM_WH()
		{
			//{{user_implement_dev:selectM_WH_constractor
                        //}}user_implement_dev:selectM_WH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_RCV_ISSUE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_RCV_ISSUE(\"RCV_ISSUE_CTRL_CD\", \"RCV_ISSUE_TYP\", \"ITEM_CD\", \"PLANT_CD\", \"WH_CD\", \"JOB_ODR_CD\", \"PUCH_ODR_CD\", \"WORK_ODR_CD\", \"WORK_IN_PROC_CD\", \"ISSUE_INST_CD\", \"RCV_ISSUE_QTY\", \"RCV_ISSUE_DATE\", \"RCV_ISSUE_GNR_TYP\", \"STOCK_UPD_TYP\", \"RCV_ISSUE_CMPLT_FLG\", \"OD_NO\", \"VEND_LOT_NO\", \"COMPANY_CD\", \"VEND_CD\", \"CONS_TYP\",\"LOT_NO\") "
+"values "
+"  (?, TO_NUMBER(?), ?, ?, ?, ?, ?, ?, ?, ?, TO_NUMBER(?), TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), ?, ?, ?, ?, TO_NUMBER(?),?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AF0040010";
		protected String m_sUpdateProgramName="AF0040010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_RCV_ISSUE_def
                //}}user_implement_dev:insertT_RCV_ISSUE_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getRCV_ISSUE_CTRL_CD(), stmt);
				setString(8, data.getRCV_ISSUE_TYP(), stmt);
				setString(9, data.getITEM_CD(), stmt);
				setString(10, data.getPLANT_CD(), stmt);
				setString(11, data.gettmp_WH_CD(), stmt);
				setString(12, data.getw_JOB_ODR_CD(), stmt);
				setString(13, data.getPUCH_ODR_CD(), stmt);
				setString(14, data.getWORK_ODR_CD(), stmt);
				setString(15, data.getWORK_IN_PROC_CD(), stmt);
				setString(16, data.getISSUE_INST_CD(), stmt);
				setString(17, data.gettmp_RCV_ISSUE_QTY(), stmt);
				setString(18, data.getRCV_ISSUE_DATE(), stmt);
				setString(19, data.getRCV_ISSUE_GNR_TYP(), stmt);
				setString(20, data.getSTOCK_UPD_TYP(), stmt);
				setString(21, data.getRCV_ISSUE_CMPLT_FLG(), stmt);
				setString(22, data.getOD_NO(), stmt);
				setString(23, data.getVEND_LOT_NO(), stmt);
				setString(24, data.getCOMPANY_CD(), stmt);
				setString(25, data.getVEND_CD(), stmt);
				setString(26, data.getCONS_TYP(), stmt);
				setString(27, data.getLOT_NO(), stmt);

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
			//{{user_implement_dev:insertT_RCV_ISSUE_clear
                        //}}user_implement_dev:insertT_RCV_ISSUE_clear

			return;
		}

		/**
		 * insertT_RCV_ISSUEクラスの標準コンストラクタ
		 */
		public insertT_RCV_ISSUE()
		{
			//{{user_implement_dev:insertT_RCV_ISSUE_constractor
                        //}}user_implement_dev:insertT_RCV_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_PAST_ONEROUS_CONS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_PAST_ONEROUS_CONS(\"ONEROUS_CONS_NO\", \"COMPANY_CD\", \"VEND_CD\", \"PLANT_CD\", \"JOB_ODR_CD\", \"ITEM_CD\", \"ISSUE_DATE\", \"ISSUE_QTY\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"VEND_LOT_NO\", \"RCV_ISSUE_CTRL_CD\", \"WORK_ODR_CD\", \"WORK_IN_PROC_CD\", \"PUCH_ODR_CD\", \"ISSUE_INST_CD\", \"RETURNED_WH_CD\", \"RETURNED_CAUSE_CD\", \"RETURNED_GNR_TYP\", \"AP_PROC_TYP\",\"LOT_NO\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), ?, ?, ?, ?, ?, ?, ?, null, 0, 0,?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AF0040010";
		protected String m_sUpdateProgramName="AF0040010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_PAST_ONEROUS_CONS_def
                //}}user_implement_dev:insertT_PAST_ONEROUS_CONS_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getONEROUS_CONS_NO(), stmt);
				setString(8, data.getCOMPANY_CD(), stmt);
				setString(9, data.getVEND_CD(), stmt);
				setString(10, data.getPLANT_CD(), stmt);
				setString(11, data.getw_JOB_ODR_CD(), stmt);
				setString(12, data.getITEM_CD(), stmt);
				setString(13, data.getRCV_ISSUE_DATE(), stmt);
				setString(14, data.gettmp_RCV_ISSUE_QTY(), stmt);
				setString(15, data.getUNIT_COST(), stmt);
				setString(16, data.getUNIT_COST_TYP(), stmt);
				setString(17, data.getVEND_LOT_NO(), stmt);
				setString(18, data.getRCV_ISSUE_CTRL_CD(), stmt);
				setString(19, data.getWORK_ODR_CD(), stmt);
				setString(20, data.getWORK_IN_PROC_CD(), stmt);
				setString(21, data.getPUCH_ODR_CD(), stmt);
				setString(22, data.getISSUE_INST_CD(), stmt);
				setString(23, data.getRETURNED_WH_CD(), stmt);
				setString(24, data.getLOT_NO(), stmt);

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
			//{{user_implement_dev:insertT_PAST_ONEROUS_CONS_clear
                        //}}user_implement_dev:insertT_PAST_ONEROUS_CONS_clear

			return;
		}

		/**
		 * insertT_PAST_ONEROUS_CONSクラスの標準コンストラクタ
		 */
		public insertT_PAST_ONEROUS_CONS()
		{
			//{{user_implement_dev:insertT_PAST_ONEROUS_CONS_constractor
                        //}}user_implement_dev:insertT_PAST_ONEROUS_CONS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSub1_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\", 'FM999999999999999990.0999') as \"STOCK_ON_HAND_QTY\" "
+"from "
+"  T_ITEM_STOCK "
+"where "
+"  T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"WH_CD\" = ? "
+"  and T_ITEM_STOCK.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSub1_ITEM_STOCK_def
                //}}user_implement_dev:selectSub1_ITEM_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSub1_ITEM_STOCK_read
			if(m_selcmd==null) throw new FoundationException("selectSub1_ITEM_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectSub1_ITEM_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSub1_ITEM_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("selectSub1_ITEM_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSub1_ITEM_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSub1_ITEM_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("selectSub1_ITEM_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSub1_ITEM_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getw_WH_CD());
				if(isNull(data.getw_WH_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getw_WH_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setw_STOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSub1_ITEM_STOCK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSub1_ITEM_STOCK_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectSub1_ITEM_STOCK", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectSub1_ITEM_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSub1_ITEM_STOCK_clear
                        //}}user_implement_dev:selectSub1_ITEM_STOCK_clear

			return;
		}

		/**
		 * selectSub1_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public selectSub1_ITEM_STOCK()
		{
			//{{user_implement_dev:selectSub1_ITEM_STOCK_constractor
                        //}}user_implement_dev:selectSub1_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSub1_JOB_ODR_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\", 'FM999999999999999990.0999') as \"STOCK_ON_HAND_QTY\" "
+"from "
+"  T_JOB_ODR_CD_STOCK "
+"where "
+"  T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"WH_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSub1_JOB_ODR_STOCK_def
                //}}user_implement_dev:selectSub1_JOB_ODR_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSub1_JOB_ODR_STOCK_read
			if(m_selcmd==null) throw new FoundationException("selectSub1_JOB_ODR_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectSub1_JOB_ODR_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSub1_JOB_ODR_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("selectSub1_JOB_ODR_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSub1_JOB_ODR_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSub1_JOB_ODR_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("selectSub1_JOB_ODR_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSub1_JOB_ODR_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_JOB_ODR_CD());
				if(isNull(data.getw_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getw_WH_CD());
				if(isNull(data.getw_WH_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getw_JOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getw_WH_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setw_STOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSub1_JOB_ODR_STOCK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSub1_JOB_ODR_STOCK_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectSub1_JOB_ODR_STOCK", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectSub1_JOB_ODR_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSub1_JOB_ODR_STOCK_clear
                        //}}user_implement_dev:selectSub1_JOB_ODR_STOCK_clear

			return;
		}

		/**
		 * selectSub1_JOB_ODR_STOCKクラスの標準コンストラクタ
		 */
		public selectSub1_JOB_ODR_STOCK()
		{
			//{{user_implement_dev:selectSub1_JOB_ODR_STOCK_constractor
                        //}}user_implement_dev:selectSub1_JOB_ODR_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_COST extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(M_CONS_UNIT_COST.\"UNIT_COST\", 'FM999999999999999990.0999') as \"UNIT_COST\", "
+"  TO_CHAR(M_CONS_UNIT_COST.\"UNIT_COST_TYP\") as \"UNIT_COST_TYP\", "
+"  TO_CHAR(M_CONS_UNIT_COST.\"ONEROUS_FLG\") as \"ONEROUS_FLG\" "
+"from "
+"  M_CONS_UNIT_COST "
+"where "
+"  M_CONS_UNIT_COST.\"COMPANY_CD\" = ? "
+"  and M_CONS_UNIT_COST.\"VEND_CD\" = ? "
+"  and M_CONS_UNIT_COST.\"PLANT_CD\" = ? "
+"  and M_CONS_UNIT_COST.\"ITEM_CD\" = ? "
+"  and M_CONS_UNIT_COST.\"EFF_PHASE_IN_DATE\" <= TO_DATE(?) "
+"order by "
+"  M_CONS_UNIT_COST.\"EFF_PHASE_IN_DATE\" desc";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_COST_def
                //}}user_implement_dev:selectM_COST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_COST_read
			if(m_selcmd==null) throw new FoundationException("selectM_COST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_COST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_COST_read2
			if(m_selcmd==null) throw new FoundationException("selectM_COST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_COST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_COST_read3
			if(m_selcmd==null) throw new FoundationException("selectM_COST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_COST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getRCV_ISSUE_DATE());
				if(isNull(data.getRCV_ISSUE_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getRCV_ISSUE_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setUNIT_COST( getString(1, rs) );
			data.setUNIT_COST_TYP( getString(2, rs) );
			data.setONEROUS_FLG( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_COST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_COST_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectM_COST", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_COST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_COST_clear
                        //}}user_implement_dev:selectM_COST_clear

			return;
		}

		/**
		 * selectM_COSTクラスの標準コンストラクタ
		 */
		public selectM_COST()
		{
			//{{user_implement_dev:selectM_COST_constractor
                        //}}user_implement_dev:selectM_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_WH_vend extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"COMPANY_CD\" = ? "
+"  and M_WH.\"VEND_CD\" = ? "
+"  and M_WH.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_WH_vend_def
                //}}user_implement_dev:selectM_WH_vend_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_vend_read
			if(m_selcmd==null) throw new FoundationException("selectM_WH_vend", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_WH_vend_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_vend_read2
			if(m_selcmd==null) throw new FoundationException("selectM_WH_vend", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_WH_vend_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_vend_read3
			if(m_selcmd==null) throw new FoundationException("selectM_WH_vend", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_WH_vend_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setWH_CD( getString(1, rs) );
			data.setWH_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_WH_vend", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WH_vend_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("selectM_WH_vend", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:selectM_WH_vend_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_WH_vend_clear
                        //}}user_implement_dev:selectM_WH_vend_clear

			return;
		}

		/**
		 * selectM_WH_vendクラスの標準コンストラクタ
		 */
		public selectM_WH_vend()
		{
			//{{user_implement_dev:selectM_WH_vend_constractor
                        //}}user_implement_dev:selectM_WH_vend_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_DEBT_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(TO_DATE(THIS_MONTH, 'YYYY/MM'), 'YYYY/MM') AS THIS_MONTH "
+"FROM "
+"  SYS_DEBT_CTRL "
+"WHERE "
+"  COMPANY_CD = ( "
+"    SELECT "
+"      COMPANY_CD "
+"    FROM "
+"      SYS_MY_COMPANY "
+"    WHERE "
+"      CTRL_CD = 'SYSTEM' "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_DEBT_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_DEBT_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SYS_DEBT_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DEBT_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SYS_DEBT_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_DEBT_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SYS_DEBT_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_DEBT_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setTHIS_MONTH( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_DEBT_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DEBT_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_DEBT_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_DEBT_CTRL_clear

			return;
		}

		/**
		 * SYS_DEBT_CTRLクラスの標準コンストラクタ
		 */
		public SYS_DEBT_CTRL()
		{
			//{{user_implement_dev:SYS_DEBT_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_DEBT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_INSTALL_OPTIONS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(INSTALL_FLG) AS INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  OPTION_ID = 'C*'";
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
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
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
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setINSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
	public class SELECT_SYS_PARAMETER extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  VALUE "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  NAME = 'PAST_RESULT_ENTRY_TYP'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_SYS_PARAMETER_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_SYS_PARAMETER_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setPAST_RESULT_ENTRY_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_SYS_PARAMETER_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_clear

			return;
		}

		/**
		 * SELECT_SYS_PARAMETERクラスの標準コンストラクタ
		 */
		public SELECT_SYS_PARAMETER()
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_SYS_ACTUAL_COST_CTRL_AC extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  PROC_EXEC_DATE "
+"FROM "
+"  SYS_ACTUAL_COST_CTRL_AC "
+"WHERE "
+"  PLANT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setPROC_EXEC_DATE( getBigDecimal(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_clear

			return;
		}

		/**
		 * SELECT_SYS_ACTUAL_COST_CTRL_ACクラスの標準コンストラクタ
		 */
		public SELECT_SYS_ACTUAL_COST_CTRL_AC()
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_LOT_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_ISSUE_INST.LOT_NO as LOT_NO, "
+"  to_char(T_LOT_ISSUE_INST.ISSUE_QTY, 'FM999999999999999990.0999') as ISSUE_QTY, "
+"  to_char(T_LOT_ISSUE_INST.ISSUE_DATE, 'YYYY/MM/DD') as ISSUE_DATE, "
+"  to_char((T_LOT_ISSUE_INST.ISSUE_QTY - T_LOT_ISSUE_INST.SPENT_QTY), 'FM999999999999999990.0999') as SPENT_QTY, "
+"  M_ITEM.STOCK_UNIT as STOCK_UNIT "
+"from "
+"  T_LOT_ISSUE_INST, "
+"  T_ISSUE_INST, "
+"  M_ITEM "
+"where "
+"  T_ISSUE_INST.ISSUE_INST_CD = ? "
+"  and T_LOT_ISSUE_INST.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
+"  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"order by "
+"  T_LOT_ISSUE_INST.LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_LOT_ISSUE_INST(\"ISSUE_INST_CD\", \"LOT_NO\", \"ITEM_CD\", \"PUCH_ODR_CD\", \"WORK_ODR_CD\", \"ISSUE_QTY\", \"ISSUE_DATE\", \"SPENT_QTY\") "
+"values "
+"  (?, ?, ?, ?, ?, TO_NUMBER(?), TO_DATE(?), 0)";
		protected String m_updcmd = "update "
+"  T_LOT_ISSUE_INST "
+"set "
+"  \"ISSUE_QTY\" = to_number(?), "
+"  \"ISSUE_DATE\" = to_date(?, 'YYYY/MM/DD') "
+"where "
+"  T_LOT_ISSUE_INST.ISSUE_INST_CD = ? "
+"  and T_LOT_ISSUE_INST.LOT_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AF0040010";
		protected String m_sUpdateProgramName="AF0040010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_LOT_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_LOT_ISSUE_INST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_read
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_ISSUE_INST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_read2
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_ISSUE_INST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_read3
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_ISSUE_INST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getISSUE_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setl_LOT_NO( getString(1, rs) );
			data.setl_ISSUE_QTY( getString(2, rs) );
			data.setl_ISSUE_DATE( getString(3, rs) );
			data.setl_SPENT_QTY( getString(4, rs) );
			data.setl_STOCK_UNIT( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_ISSUE_INST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getISSUE_INST_CD(), stmt);
				setString(8, data.getLOT_NO(), stmt);
				setString(9, data.getITEM_CD(), stmt);
				setString(10, data.getPUCH_ODR_CD(), stmt);
				setString(11, data.getWORK_ODR_CD(), stmt);
				setString(12, data.getRCV_ISSUE_QTY(), stmt);
				setString(13, data.getRCV_ISSUE_DATE(), stmt);

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
		public int update(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getISSUE_QTY(), stmt);
				setString(5, data.getRCV_ISSUE_DATE(), stmt);
				setString(6, data.getISSUE_INST_CD(), stmt);
				setString(7, data.getLOT_NO(), stmt);

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
			//{{user_implement_dev:T_LOT_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_LOT_ISSUE_INST_clear

			return;
		}

		/**
		 * T_LOT_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public T_LOT_ISSUE_INST()
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_LOT_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_LOT_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_CTRL.LOT_NO "
+"from "
+"  T_LOT_CTRL, "
+"  T_ISSUE_INST "
+"where "
+"  T_LOT_CTRL.LOT_NO = ? "
+"  and T_ISSUE_INST.ISSUE_INST_CD = ? "
+"  and T_ISSUE_INST.ITEM_CD = T_LOT_CTRL.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_LOT_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_LOT_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_CTRL_read
			if(m_selcmd==null) throw new FoundationException("T_LOT_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("T_LOT_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("T_LOT_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getISSUE_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setLOT_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_LOT_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_LOT_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_LOT_CTRL_clear

			return;
		}

		/**
		 * T_LOT_CTRLクラスの標準コンストラクタ
		 */
		public T_LOT_CTRL()
		{
			//{{user_implement_dev:T_LOT_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_LOT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_LOT_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_STOCK.WH_CD, "
+"  T_LOT_STOCK.LOT_NO, "
+"  to_char(T_LOT_STOCK.STOCK_ON_HAND_QTY, 'FM999999999999999990.0999') as STOCK_ON_HAND_QTY, "
+"  to_char(T_LOT_STOCK.DEFECT_QTY, 'FM999999999999999990.0999') as DEFECT_QTY, "
+"  to_char((T_LOT_STOCK.STOCK_ON_HAND_QTY - T_LOT_STOCK.ALCD_QTY), 'FM999999999999999990.0999') as ALLOCABLE_QTY, "
+"  T_LOT_CTRL.EXTERNAL_LOT_NO, "
+"  to_char(T_LOT_CTRL.BEST_BEFORE_DATE, 'YYYY/MM/DD') as BEST_BEFORE_DATE, "
+"  to_char(T_LOT_CTRL.PRD_CMPLT_DATE, 'YYYY/MM/DD') as PRD_CMPLT_DATE, "
+"  M_ITEM.STOCK_UNIT, "
+"  M_WH.WH_NAME "
+"from "
+"  T_LOT_STOCK, "
+"  T_ISSUE_INST, "
+"  T_LOT_CTRL, "
+"  M_ITEM, "
+"  M_WH "
+"where "
+"  T_ISSUE_INST.ISSUE_INST_CD = ? "
+"  and T_LOT_STOCK.ITEM_CD = T_ISSUE_INST.ITEM_CD "
+"  and T_LOT_STOCK.ITEM_CD = T_LOT_CTRL.ITEM_CD(+) "
+"  and T_LOT_STOCK.LOT_NO = T_LOT_CTRL.LOT_NO(+) "
+"  and T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_LOT_STOCK.WH_CD = ? "
+"  and T_LOT_STOCK.LOT_NO = ? "
+"  and T_LOT_STOCK.WH_CD = M_WH.WH_CD "
+"  and M_WH.MRP_FLG = 1 "
+"  and(T_LOT_STOCK.STOCK_ON_HAND_QTY - T_LOT_STOCK.ALCD_QTY) <> 0 "
+"order by "
+"  T_LOT_STOCK.WH_CD, "
+"  T_LOT_STOCK.LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_LOT_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_LOT_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_STOCK_read
			if(m_selcmd==null) throw new FoundationException("T_LOT_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("T_LOT_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("T_LOT_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;
				ary.addElement(data.getw_WH_CD());
				if(isNull(data.getw_WH_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_LOT_STOCK", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getISSUE_INST_CD())) setString(no ++, data.getISSUE_INST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getw_WH_CD())) setString(no ++, data.getw_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getLOT_NO())) setString(no ++, data.getLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setl_WH_CD( getString(1, rs) );
			data.setl_LOT_NO( getString(2, rs) );
			data.setl_STOCK_ON_HAND_QTY( getString(3, rs) );
			data.setl_DEFECT_QTY( getString(4, rs) );
			data.setl_ALLOCABLE_QTY( getString(5, rs) );
			data.setl_EXTERNAL_LOT_NO( getString(6, rs) );
			data.setl_BEST_BEFORE_DATE( getString(7, rs) );
			data.setl_PRD_CMPLT_DATE( getString(8, rs) );
			data.setl_STOCK_UNIT( getString(9, rs) );
			data.setl_WH_NAME( getString(10, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_LOT_STOCK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_STOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_LOT_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_LOT_STOCK_clear

			return;
		}

		/**
		 * T_LOT_STOCKクラスの標準コンストラクタ
		 */
		public T_LOT_STOCK()
		{
			//{{user_implement_dev:T_LOT_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_LOT_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class c_BEST_BEFORE_DATE extends DataObject
	{
		protected String m_selcmd = "SELECT  "
+"  NVL(CASE WHEN TO_DATE(?,'YYYY/MM/DD') > T_LOT_CTRL.\"BEST_BEFORE_DATE\" "
+"  THEN '1' ELSE '0' END, 0) BBD_c_FLG "
+"FROM "
+"  T_LOT_CTRL, "
+"  T_ISSUE_INST "
+"WHERE "
+"  T_ISSUE_INST.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  AND T_LOT_CTRL.\"LOT_NO\" = ? "
+"  AND T_ISSUE_INST.ISSUE_INST_CD = ? "
+"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:c_BEST_BEFORE_DATE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:c_BEST_BEFORE_DATE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:c_BEST_BEFORE_DATE_read
			if(m_selcmd==null) throw new FoundationException("c_BEST_BEFORE_DATE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:c_BEST_BEFORE_DATE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:c_BEST_BEFORE_DATE_read2
			if(m_selcmd==null) throw new FoundationException("c_BEST_BEFORE_DATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:c_BEST_BEFORE_DATE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:c_BEST_BEFORE_DATE_read3
			if(m_selcmd==null) throw new FoundationException("c_BEST_BEFORE_DATE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:c_BEST_BEFORE_DATE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getRCV_ISSUE_DATE());
				if(isNull(data.getRCV_ISSUE_DATE())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getRCV_ISSUE_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getISSUE_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setBBD_c_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("c_BEST_BEFORE_DATE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:c_BEST_BEFORE_DATE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:c_BEST_BEFORE_DATE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:c_BEST_BEFORE_DATE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:c_BEST_BEFORE_DATE_clear

			return;
		}

		/**
		 * c_BEST_BEFORE_DATEクラスの標準コンストラクタ
		 */
		public c_BEST_BEFORE_DATE()
		{
			//{{user_implement_dev:c_BEST_BEFORE_DATE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:c_BEST_BEFORE_DATE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_LOT_ISSUE_INST_Lock extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(T_LOT_ISSUE_INST.\"ISSUE_QTY\") AS \"ISSUE_QTY\" "
+"FROM "
+"  T_LOT_ISSUE_INST "
+"WHERE "
+"  T_LOT_ISSUE_INST.ISSUE_INST_CD = ? "
+"  and T_LOT_ISSUE_INST.LOT_NO = ? "
+"FOR UPDATE NOWAIT";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_LOT_ISSUE_INST_Lock_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_LOT_ISSUE_INST_Lock_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_Lock_read
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INST_Lock", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_ISSUE_INST_Lock_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_Lock_read2
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INST_Lock", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_ISSUE_INST_Lock_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_Lock_read3
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INST_Lock", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_ISSUE_INST_Lock_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getISSUE_INST_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setISSUE_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INST_Lock", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_Lock_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_ISSUE_INST_Lock_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_LOT_ISSUE_INST_Lock_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_LOT_ISSUE_INST_Lock_clear

			return;
		}

		/**
		 * T_LOT_ISSUE_INST_Lockクラスの標準コンストラクタ
		 */
		public T_LOT_ISSUE_INST_Lock()
		{
			//{{user_implement_dev:T_LOT_ISSUE_INST_Lock_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_LOT_ISSUE_INST_Lock_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_PARAMETER extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_PARAMETER.\"VALUE\" AS \"VALUE\" "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  SYS_PARAMETER.\"NAME\" = 'BEST_BEFORE_DATE_CHECK_FLG'";
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
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
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
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setBEST_BEFORE_DATE_CHECK_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
	public class SYS_PARAM_LOT_FLG extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_PARAMETER.\"VALUE\" AS \"VALUE\" "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  SYS_PARAMETER.\"NAME\" = 'LOT_CTRL_FLAG'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_PARAM_LOT_FLG_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_PARAM_LOT_FLG_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAM_LOT_FLG_read
			if(m_selcmd==null) throw new FoundationException("SYS_PARAM_LOT_FLG", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_PARAM_LOT_FLG_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAM_LOT_FLG_read2
			if(m_selcmd==null) throw new FoundationException("SYS_PARAM_LOT_FLG", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_PARAM_LOT_FLG_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAM_LOT_FLG_read3
			if(m_selcmd==null) throw new FoundationException("SYS_PARAM_LOT_FLG", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_PARAM_LOT_FLG_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setLOT_CTRL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_PARAM_LOT_FLG", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_PARAM_LOT_FLG_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_PARAM_LOT_FLG_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_PARAM_LOT_FLG_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_PARAM_LOT_FLG_clear

			return;
		}

		/**
		 * SYS_PARAM_LOT_FLGクラスの標準コンストラクタ
		 */
		public SYS_PARAM_LOT_FLG()
		{
			//{{user_implement_dev:SYS_PARAM_LOT_FLG_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_PARAM_LOT_FLG_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_ISSUE_INST, "
+"  T_OD, "
+"  M_ITEM, "
+"  M_WH, "
+"  M_WS, "
+"  M_VEND_CTRL, "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  T_WORK_IN_PROC_BY_ITEM "
+"where "
+"  T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
+"  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_ISSUE_INST.WH_CD = M_WH.WH_CD(+) "
+"  and T_ISSUE_INST.WS_CD = M_WS.WS_CD(+) "
+"  and T_ISSUE_INST.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_ISSUE_INST.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_ISSUE_INST.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_ISSUE_INST.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_ISSUE_INST.WORK_ODR_CD = T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD(+) "
+"  and T_ISSUE_INST.\"WORK_ODR_CD\" = ? "
+"  and T_ISSUE_INST.\"WORK_IN_PROC_CD\" = ? "
+"  and T_ISSUE_INST.\"PUCH_ODR_CD\" = ? "
+"  and T_ISSUE_INST.\"ISSUE_INST_CD\" = ? "
+"  and T_ISSUE_INST.\"PLANT_CD\" = ? "
+"  and T_ISSUE_INST.\"ISSUE_CMPLT_FLG\" = 1 "
+"  and M_ITEM.\"LOT_CTRL_FLG\" = ? "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
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
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
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
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWORK_ODR_CD());
				if(isNull(data.getWORK_ODR_CD())) isNull = true;
				ary.addElement(data.getWORK_IN_PROC_CD());
				if(isNull(data.getWORK_IN_PROC_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getLOT_CTRL_FLG());
				if(isNull(data.getLOT_CTRL_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getWORK_ODR_CD())) setString(no ++, data.getWORK_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWORK_IN_PROC_CD())) setString(no ++, data.getWORK_IN_PROC_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getISSUE_INST_CD())) setString(no ++, data.getISSUE_INST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getLOT_CTRL_FLG())) setString(no ++, data.getLOT_CTRL_FLG(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

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
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
	public class T_LOT_STOCKCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  COUNT(1) "
+"from "
+"  T_LOT_STOCK, "
+"  T_ISSUE_INST, "
+"  T_LOT_CTRL, "
+"  M_ITEM, "
+"  M_WH "
+"where "
+"  T_ISSUE_INST.ISSUE_INST_CD = ? "
+"  and T_LOT_STOCK.ITEM_CD = T_ISSUE_INST.ITEM_CD "
+"  and T_LOT_STOCK.ITEM_CD = T_LOT_CTRL.ITEM_CD(+) "
+"  and T_LOT_STOCK.LOT_NO = T_LOT_CTRL.LOT_NO(+) "
+"  and T_LOT_STOCK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_LOT_STOCK.WH_CD = ? "
+"  and T_LOT_STOCK.LOT_NO = ? "
+"  and T_LOT_STOCK.WH_CD = M_WH.WH_CD "
+"  and M_WH.MRP_FLG = 1 "
+"  and(T_LOT_STOCK.STOCK_ON_HAND_QTY - T_LOT_STOCK.ALCD_QTY) <> 0 "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_LOT_STOCKCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_LOT_STOCKCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_STOCKCnt_read
			if(m_selcmd==null) throw new FoundationException("T_LOT_STOCKCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_STOCKCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_STOCKCnt_read2
			if(m_selcmd==null) throw new FoundationException("T_LOT_STOCKCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_STOCKCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_STOCKCnt_read3
			if(m_selcmd==null) throw new FoundationException("T_LOT_STOCKCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_STOCKCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;
				ary.addElement(data.getw_WH_CD());
				if(isNull(data.getw_WH_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_LOT_STOCKCnt", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getISSUE_INST_CD())) setString(no ++, data.getISSUE_INST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getw_WH_CD())) setString(no ++, data.getw_WH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getLOT_NO())) setString(no ++, data.getLOT_NO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_LOT_STOCKCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_STOCKCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_STOCKCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_LOT_STOCKCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_LOT_STOCKCnt_clear

			return;
		}

		/**
		 * T_LOT_STOCKCntクラスの標準コンストラクタ
		 */
		public T_LOT_STOCKCnt()
		{
			//{{user_implement_dev:T_LOT_STOCKCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_LOT_STOCKCnt_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_LOT_ISSUE_INSTCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  COUNT(1) "
+"from "
+"  T_LOT_ISSUE_INST, "
+"  T_ISSUE_INST, "
+"  M_ITEM "
+"where "
+"  T_ISSUE_INST.ISSUE_INST_CD = ? "
+"  and T_LOT_ISSUE_INST.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
+"  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and ROWNUM <= NVL(TO_NUMBER(?),ROWNUM) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_LOT_ISSUE_INSTCnt_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_LOT_ISSUE_INSTCnt_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AF0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AF0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INSTCnt_read
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INSTCnt", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_ISSUE_INSTCnt_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INSTCnt_read2
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INSTCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_ISSUE_INSTCnt_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AF0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INSTCnt_read3
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INSTCnt", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_LOT_ISSUE_INSTCnt_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AF0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getISSUE_INST_CD());
				if(isNull(data.getISSUE_INST_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getISSUE_INST_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AF0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AF0040010Struct data = new AF0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_LOT_ISSUE_INSTCnt", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AF0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AF0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_ISSUE_INSTCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_ISSUE_INSTCnt_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AF0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_LOT_ISSUE_INSTCnt_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_LOT_ISSUE_INSTCnt_clear

			return;
		}

		/**
		 * T_LOT_ISSUE_INSTCntクラスの標準コンストラクタ
		 */
		public T_LOT_ISSUE_INSTCnt()
		{
			//{{user_implement_dev:T_LOT_ISSUE_INSTCnt_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_LOT_ISSUE_INSTCnt_constractor

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
		mselectT_OPR_INST_SLIP.clear();
		mselectT_OPR_INST_SLIP = null;
		mselectT_WORK_IN_PROC_BY_ITEM.clear();
		mselectT_WORK_IN_PROC_BY_ITEM = null;
		mselectT_WORK_IN_PROC_BY_PROC.clear();
		mselectT_WORK_IN_PROC_BY_PROC = null;
		mselectT_RLSD_PUCH_ODR.clear();
		mselectT_RLSD_PUCH_ODR = null;
		mselect.clear();
		mselect = null;
		mselectTOTAL_ITEM_STOCK.clear();
		mselectTOTAL_ITEM_STOCK = null;
		mselectTOTAL_JOB_ODR_STOCK.clear();
		mselectTOTAL_JOB_ODR_STOCK = null;
		mselectSYS_DATE_CTRL.clear();
		mselectSYS_DATE_CTRL = null;
		mselectM_WH.clear();
		mselectM_WH = null;
		minsertT_RCV_ISSUE.clear();
		minsertT_RCV_ISSUE = null;
		minsertT_PAST_ONEROUS_CONS.clear();
		minsertT_PAST_ONEROUS_CONS = null;
		mselectSub1_ITEM_STOCK.clear();
		mselectSub1_ITEM_STOCK = null;
		mselectSub1_JOB_ODR_STOCK.clear();
		mselectSub1_JOB_ODR_STOCK = null;
		mselectM_COST.clear();
		mselectM_COST = null;
		mselectM_WH_vend.clear();
		mselectM_WH_vend = null;
		mSYS_DEBT_CTRL.clear();
		mSYS_DEBT_CTRL = null;
		mSYS_INSTALL_OPTIONS.clear();
		mSYS_INSTALL_OPTIONS = null;
		mSELECT_SYS_PARAMETER.clear();
		mSELECT_SYS_PARAMETER = null;
		mSELECT_SYS_ACTUAL_COST_CTRL_AC.clear();
		mSELECT_SYS_ACTUAL_COST_CTRL_AC = null;
		mT_LOT_ISSUE_INST.clear();
		mT_LOT_ISSUE_INST = null;
		mT_LOT_CTRL.clear();
		mT_LOT_CTRL = null;
		mT_LOT_STOCK.clear();
		mT_LOT_STOCK = null;
		mc_BEST_BEFORE_DATE.clear();
		mc_BEST_BEFORE_DATE = null;
		mT_LOT_ISSUE_INST_Lock.clear();
		mT_LOT_ISSUE_INST_Lock = null;
		mSYS_PARAMETER.clear();
		mSYS_PARAMETER = null;
		mSYS_PARAM_LOT_FLG.clear();
		mSYS_PARAM_LOT_FLG = null;
		mselectCnt.clear();
		mselectCnt = null;
		mT_LOT_STOCKCnt.clear();
		mT_LOT_STOCKCnt = null;
		mT_LOT_ISSUE_INSTCnt.clear();
		mT_LOT_ISSUE_INSTCnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AF0040010クラスの標準コンストラクタ
	 */
	public AF0040010Entity() throws FoundationException
	{
		//{{user_implement_dev:constractor
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
                //}}user_implement_dev:entity_destractor

		objMessage = null;
		clear();

		return;
	}
}
