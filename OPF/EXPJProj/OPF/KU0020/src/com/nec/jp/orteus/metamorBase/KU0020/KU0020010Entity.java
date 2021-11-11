/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0020/src/com/nec/jp/orteus/metamorBase/KU0020/KU0020010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0020;

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
 * CLASS     : KU0020010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class KU0020010Entity extends DataObject
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

	// Pdf_1クラス インスタンス
	public Pdf_1 mPdf_1 = new Pdf_1();

	// Pdf_2クラス インスタンス
	public Pdf_2 mPdf_2 = new Pdf_2();

	// Pdf_3クラス インスタンス
	public Pdf_3 mPdf_3 = new Pdf_3();

	// T_SHIP_ODRクラス インスタンス
	public T_SHIP_ODR mT_SHIP_ODR = new T_SHIP_ODR();

	// T_UN_SHIP_LISTクラス インスタンス
	public T_UN_SHIP_LIST mT_UN_SHIP_LIST = new T_UN_SHIP_LIST();

	// T_SHIP_SLIPクラス インスタンス
	public T_SHIP_SLIP mT_SHIP_SLIP = new T_SHIP_SLIP();

	// M_WHクラス インスタンス
	public M_WH mM_WH = new M_WH();

	// M_CUSTクラス インスタンス
	public M_CUST mM_CUST = new M_CUST();

	// SYS_CLASS_CODEクラス インスタンス
	public SYS_CLASS_CODE mSYS_CLASS_CODE = new SYS_CLASS_CODE();


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
		String m_write_fname="KU0020010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="KU0020010";

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
	public class Pdf_1 extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(min(T_SHIP_ODR.\"DESINATED_SHIP_DATE\"), 'YYYY/MM/DD') as \"MIN_DESINATED_SHIP_DATE\", "
+"  to_char(max(T_SHIP_ODR.\"DESINATED_SHIP_DATE\"), 'YYYY/MM/DD') as \"MAX_DESINATED_SHIP_DATE\" "
+"from "
+"  T_SHIP_ODR, "
+"  M_WH, "
+"  M_ITEM, "
+"  M_CUST_BASE, "
+"  SYS_MY_COMPANY "
+"where "
+"  T_SHIP_ODR.\"ALLCT_WH_CD\" = M_WH.\"WH_CD\" "
+"  and T_SHIP_ODR.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  and SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"  and M_CUST_BASE.\"COMPANY_CD\" = SYS_MY_COMPANY.\"COMPANY_CD\" "
+"  and T_SHIP_ODR.\"CUST_CD\" = M_CUST_BASE.\"CUST_CD\" "
+"  and T_SHIP_ODR.\"DLV_LOC_CD\" = M_CUST_BASE.\"DLV_LOC_CD\" "
+"  and T_SHIP_ODR.\"SHP_CMPLT_FLG\" = 0 "
+"  and T_SHIP_ODR.\"DEPO_TRANSFER_PROC_FLG\" = 0 "
+"  and T_SHIP_ODR.\"DESINATED_SHIP_DATE\" >= to_date(?, 'YYYY/MM/DD') "
+"  and T_SHIP_ODR.\"DESINATED_SHIP_DATE\" <= to_date(?, 'YYYY/MM/DD') "
+"  and T_SHIP_ODR.\"SLIP_CD\" >= ? "
+"  and T_SHIP_ODR.\"SLIP_CD\" <= ? "
+"  and T_SHIP_ODR.\"ALLCT_WH_CD\" = ? "
+"  and T_SHIP_ODR.\"CUST_CD\" = ? "
+"  and T_SHIP_ODR.\"PRINT_FLG\" = to_number(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Pdf_1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Pdf_1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_1_read
			if(m_selcmd==null) throw new FoundationException("Pdf_1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Pdf_1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0020010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_1_read2
			if(m_selcmd==null) throw new FoundationException("Pdf_1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Pdf_1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0020010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_1_read3
			if(m_selcmd==null) throw new FoundationException("Pdf_1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Pdf_1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0020010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getDESINATED_SHIP_DATE_FROM());
				if(isNull(data.getDESINATED_SHIP_DATE_FROM())) isNull = true;
				ary.addElement(data.getDESINATED_SHIP_DATE_TO());
				if(isNull(data.getDESINATED_SHIP_DATE_TO())) isNull = true;
				ary.addElement(data.getSLIP_CD_FROM());
				if(isNull(data.getSLIP_CD_FROM())) isNull = true;
				ary.addElement(data.getSLIP_CD_TO());
				if(isNull(data.getSLIP_CD_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getPRINT_FLG());
				if(isNull(data.getPRINT_FLG())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("Pdf_1", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getDESINATED_SHIP_DATE_FROM())) setString(no ++, data.getDESINATED_SHIP_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDESINATED_SHIP_DATE_TO())) setString(no ++, data.getDESINATED_SHIP_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD_FROM())) setString(no ++, data.getSLIP_CD_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD_TO())) setString(no ++, data.getSLIP_CD_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCUST_CD())) setString(no ++, data.getCUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPRINT_FLG())) setString(no ++, data.getPRINT_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0020010Struct data = new KU0020010Struct();

			data.setMIN_DESINATED_SHIP_DATE( getString(1, rs) );
			data.setMAX_DESINATED_SHIP_DATE( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Pdf_1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Pdf_1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Pdf_1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Pdf_1_clear

			return;
		}

		/**
		 * Pdf_1クラスの標準コンストラクタ
		 */
		public Pdf_1()
		{
			//{{user_implement_dev:Pdf_1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Pdf_1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class Pdf_2 extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_UN_SHIP_LIST.\"UN_SHIP_SEQ_NO\") as \"UN_SHIP_SEQ_NO\", "
+"  T_UN_SHIP_LIST.\"CUST_CD\" as \"CUST_CD\", "
+"  M_CUST.\"CUST_NAME\" as \"CUST_NAME\", "
+"  T_ODR_CTL.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_UN_SHIP_LIST.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_ODR.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  to_char(T_UN_SHIP_LIST.\"UN_SHIP_QTY\") as \"UN_SHIP_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  T_UN_SHIP_LIST.\"WH_CD\" as \"WH_CD\", "
+"  T_UN_SHIP_LIST.\"ACPT_ODR_CD\" as \"ACPT_ODR_CD\", "
+"  to_char(T_UN_SHIP_LIST.\"PART_DLV_SEQ_NO\") as \"PART_DLV_SEQ_NO\" "
+"from "
+"  T_UN_SHIP_LIST, "
+"  T_ANS_DLV_DATE, "
+"  M_CUST, "
+"  T_ODR, "
+"  T_ODR_CTL, "
+"  M_ITEM "
+"where "
+"  T_UN_SHIP_LIST.\"ACPT_ODR_CD\" = T_ANS_DLV_DATE.\"ODR_NO\" "
+"  and T_UN_SHIP_LIST.\"PART_DLV_SEQ_NO\" = T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\" "
+"  and T_UN_SHIP_LIST.\"CUST_CD\" = M_CUST.\"CUST_CD\" "
+"  and T_UN_SHIP_LIST.\"ACPT_ODR_CD\" = T_ODR.\"ODR_NO\" "
+"  and T_ODR.\"ODR_CTL_NO\" = T_ODR_CTL.\"ODR_CTL_NO\" "
+"  and T_UN_SHIP_LIST.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  and T_ANS_DLV_DATE.\"SHIP_ODR_CMPLT_FLG\" = 0 "
+"  and T_ANS_DLV_DATE.\"DEL_FLG\" = 0 "
+"  and T_UN_SHIP_LIST.\"WH_CD\" = ? "
+"  and T_UN_SHIP_LIST.\"CUST_CD\" = ? "
+"  and T_UN_SHIP_LIST.\"PRINT_FLG\" = to_number(?) "
+"order by "
+"  T_ODR_CTL.\"CUST_ITEM_CD\", "
+"  T_UN_SHIP_LIST.\"ITEM_CD\", "
+"  T_UN_SHIP_LIST.\"ACPT_ODR_CD\", "
+"  T_UN_SHIP_LIST.\"PART_DLV_SEQ_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Pdf_2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Pdf_2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_2_read
			if(m_selcmd==null) throw new FoundationException("Pdf_2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Pdf_2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0020010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_2_read2
			if(m_selcmd==null) throw new FoundationException("Pdf_2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Pdf_2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0020010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_2_read3
			if(m_selcmd==null) throw new FoundationException("Pdf_2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Pdf_2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0020010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getPRINT_FLG());
				if(isNull(data.getPRINT_FLG())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("Pdf_2", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCUST_CD())) setString(no ++, data.getCUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPRINT_FLG())) setString(no ++, data.getPRINT_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0020010Struct data = new KU0020010Struct();

			data.setT_UN_SHIP_LIST__UN_SHIP_SEQ_NO( getString(1, rs) );
			data.setT_UN_SHIP_LIST__CUST_CD( getString(2, rs) );
			data.setM_CUST__CUST_NAME( getString(3, rs) );
			data.setT_ODR_CTL__CUST_ITEM_CD( getString(4, rs) );
			data.setT_UN_SHIP_LIST__ITEM_CD( getString(5, rs) );
			data.setT_ODR__CUST_ODR_NO( getString(6, rs) );
			data.setT_UN_SHIP_LIST__UN_SHIP_QTY( getString(7, rs) );
			data.setM_ITEM__STOCK_UNIT( getString(8, rs) );
			data.setT_UN_SHIP_LIST__WH_CD( getString(9, rs) );
			data.setT_UN_SHIP_LIST__ACPT_ODR_CD( getString(10, rs) );
			data.setT_UN_SHIP_LIST__PART_DLV_SEQ_NO( getString(11, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Pdf_2", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Pdf_2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Pdf_2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Pdf_2_clear

			return;
		}

		/**
		 * Pdf_2クラスの標準コンストラクタ
		 */
		public Pdf_2()
		{
			//{{user_implement_dev:Pdf_2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Pdf_2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class Pdf_3 extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_SHIP_SLIP.\"SLIP_CD\" as \"SLIP_CD\", "
+"  T_SHIP_SLIP.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_SHIP_SLIP.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_SHIP_SLIP.\"PART_NAME\" as \"PART_NAME\", "
+"  T_SHIP_SLIP.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  T_SHIP_SLIP.\"CUST_NAME\" as \"CUST_NAME\", "
+"  T_SHIP_SLIP.\"DLV_LOC_NAME_KANJI\" as \"DLV_LOC_NAME_KANJI\", "
+"  T_SHIP_SLIP.\"BUYER_NAME\" as \"BUYER_NAME\", "
+"  T_SHIP_SLIP.\"CUS_DLV_KEY_CD\" as \"CUS_DLV_KEY_CD\", "
+"  to_char(T_SHIP_SLIP.\"DESINATED_SHIP_DATE\", 'YY-MM-DD') as \"DESINATED_SHIP_DATE\", "
+"  to_char(T_SHIP_SLIP.\"DESINATED_DLV_DATE\", 'YY-MM-DD') as \"DESINATED_DLV_DATE\", "
+"  to_char(T_SHIP_SLIP.\"SCDL_DLV_DATE\", 'YY-MM-DD') as \"SCDL_DLV_DATE\", "
+"  to_char(T_SHIP_SLIP.\"PUCH_ODR_QTY_TOTAL\") as \"PUCH_ODR_QTY_TOTAL\", "
+"  to_char(T_SHIP_SLIP.\"DLV_ODR_QTY\") as \"DLV_ODR_QTY\", "
+"  to_char(T_SHIP_SLIP.\"SHIP_ODR_QTY\") as \"SHIP_ODR_QTY\", "
+"  T_SHIP_SLIP.\"UNIT_CD\" as \"UNIT_CD\", "
+"  to_char(T_SHIP_SLIP.\"UNIT_PRICE\") as \"UNIT_PRICE\", "
+"  to_char(T_SHIP_SLIP.\"SHIP_ODR_AMOUNT\") as \"SHIP_ODR_AMOUNT\", "
+"  to_char(T_SHIP_SLIP.\"TAX_AMOUNT\") as \"TAX_AMOUNT\", "
+"  to_char(T_SHIP_SLIP.\"SHIP_ODR_AMOUNT_TAX\") as \"SHIP_ODR_AMOUNT_TAX\", "
+"  T_SHIP_SLIP.\"CLIENT_REMARK_KANJI\" as \"CLIENT_REMARK_KANJI\", "
+"  T_SHIP_SLIP.\"CLIENT_BARCODE_INF\" as \"CLIENT_BARCODE_INF\" "
+"from "
+"  T_SHIP_SLIP, "
+"  T_SHIP_ODR "
+"where "
+"  T_SHIP_SLIP.\"SLIP_CD\" = T_SHIP_ODR.\"SLIP_CD\" "
+"  and T_SHIP_ODR.\"SHP_CMPLT_FLG\" = 0 "
+"  and T_SHIP_ODR.\"DEPO_TRANSFER_PROC_FLG\" = 0 "
+"  and T_SHIP_SLIP.\"DESINATED_SHIP_DATE\" >= to_date(?, 'YYYY/MM/DD') "
+"  and T_SHIP_SLIP.\"DESINATED_SHIP_DATE\" <= to_date(?, 'YYYY/MM/DD') "
+"  and T_SHIP_SLIP.\"SLIP_CD\" >= ? "
+"  and T_SHIP_SLIP.\"SLIP_CD\" <= ? "
+"  and T_SHIP_ODR.\"ALLCT_WH_CD\" = ? "
+"  and T_SHIP_SLIP.\"CUST_CD\" = ? "
+"  and T_SHIP_SLIP.\"PRINT_FLG\" = to_number(?) "
+"order by "
+"  T_SHIP_SLIP.\"CUST_CD\", "
+"  T_SHIP_SLIP.\"DLV_LOC_CD\", "
+"  T_SHIP_SLIP.\"ITEM_CD\", "
+"  T_SHIP_SLIP.\"DESINATED_SHIP_DATE\", "
+"  T_SHIP_SLIP.\"SLIP_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Pdf_3_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Pdf_3_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_3_read
			if(m_selcmd==null) throw new FoundationException("Pdf_3", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Pdf_3_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0020010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_3_read2
			if(m_selcmd==null) throw new FoundationException("Pdf_3", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Pdf_3_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, KU0020010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_3_read3
			if(m_selcmd==null) throw new FoundationException("Pdf_3", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Pdf_3_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0020010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getDESINATED_SHIP_DATE_FROM());
				if(isNull(data.getDESINATED_SHIP_DATE_FROM())) isNull = true;
				ary.addElement(data.getDESINATED_SHIP_DATE_TO());
				if(isNull(data.getDESINATED_SHIP_DATE_TO())) isNull = true;
				ary.addElement(data.getSLIP_CD_FROM());
				if(isNull(data.getSLIP_CD_FROM())) isNull = true;
				ary.addElement(data.getSLIP_CD_TO());
				if(isNull(data.getSLIP_CD_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getPRINT_FLG());
				if(isNull(data.getPRINT_FLG())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("Pdf_3", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getDESINATED_SHIP_DATE_FROM())) setString(no ++, data.getDESINATED_SHIP_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDESINATED_SHIP_DATE_TO())) setString(no ++, data.getDESINATED_SHIP_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD_FROM())) setString(no ++, data.getSLIP_CD_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getSLIP_CD_TO())) setString(no ++, data.getSLIP_CD_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCUST_CD())) setString(no ++, data.getCUST_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPRINT_FLG())) setString(no ++, data.getPRINT_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0020010Struct data = new KU0020010Struct();

			data.setT_SHIP_SLIP__SLIP_CD( getString(1, rs) );
			data.setT_SHIP_SLIP__ITEM_CD( getString(2, rs) );
			data.setT_SHIP_SLIP__CUST_ITEM_CD( getString(3, rs) );
			data.setT_SHIP_SLIP__PART_NAME( getString(4, rs) );
			data.setT_SHIP_SLIP__CUST_ODR_NO( getString(5, rs) );
			data.setT_SHIP_SLIP__CUST_NAME( getString(6, rs) );
			data.setT_SHIP_SLIP__DLV_LOC_NAME_KANJI( getString(7, rs) );
			data.setT_SHIP_SLIP__BUYER_NAME( getString(8, rs) );
			data.setT_SHIP_SLIP__CUS_DLV_KEY_CD( getString(9, rs) );
			data.setT_SHIP_SLIP__DESINATED_SHIP_DATE( getString(10, rs) );
			data.setT_SHIP_SLIP__DESINATED_DLV_DATE( getString(11, rs) );
			data.setT_SHIP_SLIP__SCDL_DLV_DATE( getString(12, rs) );
			data.setT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL( getString(13, rs) );
			data.setT_SHIP_SLIP__DLV_ODR_QTY( getString(14, rs) );
			data.setT_SHIP_SLIP__SHIP_ODR_QTY( getString(15, rs) );
			data.setT_SHIP_SLIP__UNIT_CD( getString(16, rs) );
			data.setT_SHIP_SLIP__UNIT_PRICE( getString(17, rs) );
			data.setT_SHIP_SLIP__SHIP_ODR_AMOUNT( getString(18, rs) );
			data.setT_SHIP_SLIP__TAX_AMOUNT( getString(19, rs) );
			data.setT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX( getString(20, rs) );
			data.setT_SHIP_SLIP__CLIENT_REMARK_KANJI( getString(21, rs) );
			data.setT_SHIP_SLIP__CLIENT_BARCODE_INF( getString(22, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Pdf_3", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_3_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Pdf_3_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Pdf_3_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Pdf_3_clear

			return;
		}

		/**
		 * Pdf_3クラスの標準コンストラクタ
		 */
		public Pdf_3()
		{
			//{{user_implement_dev:Pdf_3_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Pdf_3_constractor

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
		protected String m_updcmd = "update "
+"  T_SHIP_ODR "
+"set "
+"  \"PRINT_FLG\" = 1 "
+"where "
+"  T_SHIP_ODR.\"SLIP_CD\" in ( "
+"    select "
+"      T_SHIP_ODR.\"SLIP_CD\" as \"SLIP_CD\" "
+"    from "
+"      T_SHIP_ODR, "
+"      M_WH, "
+"      M_ITEM, "
+"      M_CUST_BASE, "
+"      SYS_MY_COMPANY "
+"    where "
+"      T_SHIP_ODR.\"ALLCT_WH_CD\" = M_WH.\"WH_CD\" "
+"      and T_SHIP_ODR.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"      and SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"      and M_CUST_BASE.\"COMPANY_CD\" = SYS_MY_COMPANY.\"COMPANY_CD\" "
+"      and T_SHIP_ODR.\"CUST_CD\" = M_CUST_BASE.\"CUST_CD\" "
+"      and T_SHIP_ODR.\"DLV_LOC_CD\" = M_CUST_BASE.\"DLV_LOC_CD\" "
+"      and T_SHIP_ODR.\"SHP_CMPLT_FLG\" = 0 "
+"      and T_SHIP_ODR.\"DEPO_TRANSFER_PROC_FLG\" = 0 "
+"      and T_SHIP_ODR.\"DESINATED_SHIP_DATE\" >= to_date(nvl(?,'1000/01/01'), 'YYYY/MM/DD') "
+"      and T_SHIP_ODR.\"DESINATED_SHIP_DATE\" <= to_date(nvl(?,'9999/12/31'), 'YYYY/MM/DD') "
+"      and T_SHIP_ODR.\"SLIP_CD\" >= nvl(?,' ') "
+"      and T_SHIP_ODR.\"SLIP_CD\" <= nvl(?,'ZZZZZZZZZZZZZZZZZZZZZZZZZZ') "
+"      and T_SHIP_ODR.\"ALLCT_WH_CD\" like nvl(?,'%') "
+"      and T_SHIP_ODR.\"CUST_CD\" like nvl(?,'%') "
+"      and T_SHIP_ODR.\"PRINT_FLG\" = to_number(?) "
+"  )";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0020010";
		protected String m_sUpdateProgramName="KU0020010";
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
		public int update(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getDESINATED_SHIP_DATE_FROM(), stmt);
				setString(5, data.getDESINATED_SHIP_DATE_TO(), stmt);
				setString(6, data.getSLIP_CD_FROM(), stmt);
				setString(7, data.getSLIP_CD_TO(), stmt);
				setString(8, data.getWH_CD(), stmt);
				setString(9, data.getCUST_CD(), stmt);
				setString(10, data.getPRINT_FLG(), stmt);

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
	public class T_UN_SHIP_LIST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_UN_SHIP_LIST "
+"set "
+"  \"PRINT_FLG\" = 1 "
+"where "
+"  T_UN_SHIP_LIST.\"UN_SHIP_SEQ_NO\" in ( "
+"    select "
+"      T_UN_SHIP_LIST.\"UN_SHIP_SEQ_NO\" "
+"    from "
+"      T_UN_SHIP_LIST, "
+"      T_ANS_DLV_DATE, "
+"      M_CUST, "
+"      T_ODR, "
+"      T_ODR_CTL, "
+"      M_ITEM "
+"    where "
+"      T_UN_SHIP_LIST.\"ACPT_ODR_CD\" = T_ANS_DLV_DATE.\"ODR_NO\" "
+"      and T_UN_SHIP_LIST.\"PART_DLV_SEQ_NO\" = T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\" "
+"      and T_UN_SHIP_LIST.\"CUST_CD\" = M_CUST.\"CUST_CD\" "
+"      and T_UN_SHIP_LIST.\"ACPT_ODR_CD\" = T_ODR.\"ODR_NO\" "
+"      and T_ODR.\"ODR_CTL_NO\" = T_ODR_CTL.\"ODR_CTL_NO\" "
+"      and T_UN_SHIP_LIST.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"      and T_ANS_DLV_DATE.\"SHIP_ODR_CMPLT_FLG\" = 0 "
+"      and T_ANS_DLV_DATE.\"DEL_FLG\" = 0 "
+"      and T_UN_SHIP_LIST.\"WH_CD\" like nvl(?, '%') "
+"      and T_UN_SHIP_LIST.\"CUST_CD\" like nvl(?, '%') "
+"      and T_UN_SHIP_LIST.\"PRINT_FLG\" = to_number(?) "
+"  )";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0020010";
		protected String m_sUpdateProgramName="KU0020010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_UN_SHIP_LIST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_UN_SHIP_LIST_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getWH_CD(), stmt);
				setString(5, data.getCUST_CD(), stmt);
				setString(6, data.getPRINT_FLG(), stmt);

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
			//{{user_implement_dev:T_UN_SHIP_LIST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_UN_SHIP_LIST_clear

			return;
		}

		/**
		 * T_UN_SHIP_LISTクラスの標準コンストラクタ
		 */
		public T_UN_SHIP_LIST()
		{
			//{{user_implement_dev:T_UN_SHIP_LIST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_UN_SHIP_LIST_constractor

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
		protected String m_updcmd = "update "
+"  T_SHIP_SLIP "
+"set "
+"  \"PRINT_FLG\" = 1 "
+"where "
+"  T_SHIP_SLIP.\"SLIP_CD\" in ( "
+"    select "
+"      T_SHIP_SLIP.\"SLIP_CD\" "
+"    from "
+"      T_SHIP_SLIP, "
+"      T_SHIP_ODR "
+"    where "
+"      T_SHIP_SLIP.\"SLIP_CD\" = T_SHIP_ODR.\"SLIP_CD\" "
+"      and T_SHIP_ODR.\"SHP_CMPLT_FLG\" = 0 "
+"      and T_SHIP_ODR.\"DEPO_TRANSFER_PROC_FLG\" = 0 "
+"      and T_SHIP_SLIP.\"DESINATED_SHIP_DATE\" >= to_date(nvl(?,'1000/01/01'), 'YYYY/MM/DD') "
+"      and T_SHIP_SLIP.\"DESINATED_SHIP_DATE\" <= to_date(nvl(?,'9999/12/31'), 'YYYY/MM/DD') "
+"      and T_SHIP_SLIP.\"SLIP_CD\" >= nvl(?,' ') "
+"      and T_SHIP_SLIP.\"SLIP_CD\" <= nvl(?,'ZZZZZZZZZZZZZZZZZZZZZZZZZZ') "
+"      and T_SHIP_ODR.\"ALLCT_WH_CD\" like nvl(?,'%') "
+"      and T_SHIP_SLIP.\"CUST_CD\" like nvl(?,'%') "
+"      and T_SHIP_SLIP.\"PRINT_FLG\" = to_number(?) "
+"  )";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0020010";
		protected String m_sUpdateProgramName="KU0020010";
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
		public int update(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getDESINATED_SHIP_DATE_FROM(), stmt);
				setString(5, data.getDESINATED_SHIP_DATE_TO(), stmt);
				setString(6, data.getSLIP_CD_FROM(), stmt);
				setString(7, data.getSLIP_CD_TO(), stmt);
				setString(8, data.getWH_CD(), stmt);
				setString(9, data.getCUST_CD(), stmt);
				setString(10, data.getPRINT_FLG(), stmt);

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
	public class M_WH extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_WH_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_WH_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0020010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:M_WH_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:M_WH_clear

			return;
		}

		/**
		 * M_WHクラスの標準コンストラクタ
		 */
		public M_WH()
		{
			//{{user_implement_dev:M_WH_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:M_WH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_CUST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_CUST.\"CUST_CD\" as \"CUST_CD\" "
+"from "
+"  M_CUST "
+"where "
+"  M_CUST.\"CUST_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_CUST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_CUST_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_CUST_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

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
		public boolean check(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0020010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
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
	public class SYS_CLASS_CODE extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_CLASS_CODE.\"CODE_NAME\" as \"CODE_NAME\" "
+"from "
+"  SYS_CLASS_CODE "
+"where "
+"  SYS_CLASS_CODE.\"SYS_CLASS\" = 'SALES' "
+"  and SYS_CLASS_CODE.\"CLASS_CODE\" = 'MYCOMPANY'";
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
		public List read(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, KU0020010Struct data, String replaceStr)
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
		public List read(Connection conn, KU0020010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0020010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public KU0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0020010Struct data = new KU0020010Struct();

			data.setCODE_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, KU0020010Struct data) throws FoundationException, SQLException
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

	// null文字列、空白文字列の場合にtrueを返します
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * クリーンナップ用メソッド
	 *
	 */
	public void clear()
	{
		mPdf_1.clear();
		mPdf_1 = null;
		mPdf_2.clear();
		mPdf_2 = null;
		mPdf_3.clear();
		mPdf_3 = null;
		mT_SHIP_ODR.clear();
		mT_SHIP_ODR = null;
		mT_UN_SHIP_LIST.clear();
		mT_UN_SHIP_LIST = null;
		mT_SHIP_SLIP.clear();
		mT_SHIP_SLIP = null;
		mM_WH.clear();
		mM_WH = null;
		mM_CUST.clear();
		mM_CUST = null;
		mSYS_CLASS_CODE.clear();
		mSYS_CLASS_CODE = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * KU0020010クラスの標準コンストラクタ
	 */
	public KU0020010Entity() throws FoundationException
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
