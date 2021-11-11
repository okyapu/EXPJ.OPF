/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0130/src/com/nec/jp/orteus/metamorBase/AC0130/AC0130010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0130;

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
 * CLASS     : AC0130010Entity クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AC0130010Entity extends DataObject
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

	// selectクラス インスタンス
	public select mselect = new select();

	// CHK_M_ITEMクラス インスタンス
	public CHK_M_ITEM mCHK_M_ITEM = new CHK_M_ITEM();

	// CHK_T_JOB_ODRクラス インスタンス
	public CHK_T_JOB_ODR mCHK_T_JOB_ODR = new CHK_T_JOB_ODR();

	// SYS_JOB_OD_CALC_CTRLクラス インスタンス
	public SYS_JOB_OD_CALC_CTRL mSYS_JOB_OD_CALC_CTRL = new SYS_JOB_OD_CALC_CTRL();

	// selectCntクラス インスタンス
	public selectCnt mselectCnt = new selectCnt();


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
		String m_write_fname="AC0130010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AC0130010";

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
	public class select extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_JOB_ODR.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T_JOB_ODR.\"JOB_ODR_CANCEL_NO\" AS \"JOB_ODR_CANCEL_NO\", "
+"  T_JOB_ODR.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  TO_CHAR(T_JOB_ODR.\"JOB_ODR_QTY\", 'FM99999999999990.0999') as \"JOB_ODR_QTY\", "
+"  TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') AS \"JOB_ODR_DLV_DATE\", "
+"  T_JOB_ODR.\"JOB_ODR_STS_TYP\" AS \"JOB_ODR_STS_TYP\", "
+"  T_JOB_ODR.\"JOB_ODR_TYP\" AS \"JOB_ODR_TYP\", "
+"  T_JOB_ODR.\"PLAN_TYP\" AS \"PLAN_TYP\", "
+"  T_JOB_ODR.\"ALC_GRP_CD\" AS \"ALC_GRP_CD\", "
+"  T_JOB_ODR.\"JOB_ODR_DEL_FLG\" AS \"JOB_ODR_DEL_FLG\", "
+"  NVL(DB.\"ALCD_QTY\",0) AS \"ALCD_QTY\", "
+"  CASE WHEN T_JOB_ODR.JOB_ODR_DEL_FLG=1 AND T_JOB_ODR.JOB_ODR_STS_TYP IN (3,4) AND T_JOB_ODR.JOB_ODR_EXP_TYP IN (2,9) THEN  "
+"  '' "
+"  ELSE TO_CHAR(NVL(T_JOB_ODR.\"JOB_ODR_QTY\",0)-NVL(DB.\"ALCD_QTY\",0), 'FM99,999,999,999,990.0999') END   as \"ALCD_ENABLE_QTY\", "
+"  CASE WHEN DB1.PLANT_CD IS NOT NULL THEN '1' "
+"  WHEN T_JOB_ODR.JOB_ODR_STS_TYP = 2 AND T_JOB_ODR.JOB_ODR_EXP_TYP =1 THEN '1' "
+"  WHEN T_JOB_ODR.JOB_ODR_STS_TYP IN (3,4) AND T_JOB_ODR.JOB_ODR_EXP_TYP =2 THEN '1' "
+"  ELSE '0' END AS JobOdrExpect "
+"FROM "
+"  T_JOB_ODR, "
+"  M_ITEM, "
+"  (select "
+"   T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_CD\" AS JOB_ODR_CD, "
+"   TO_CHAR(SUM(T_PRD_REQ_JOB_ODR_ALC.\"ALCD_QTY\"), 'TM9') AS ALCD_QTY "
+"from "
+"  T_PRD_REQ_JOB_ODR_ALC "
+"where "
+"  T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_DETAIL_NO\" = 0 "
+"  and T_PRD_REQ_JOB_ODR_ALC.\"PLANT_CD\" = ? "
+"  and T_PRD_REQ_JOB_ODR_ALC.\"COMPANY_CD\" = ( "
+"     select "
+"      SYS_MY_COMPANY.\"COMPANY_CD\" "
+"    from "
+"      SYS_MY_COMPANY "
+"    where "
+"      SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM'  ) "
+"group by  "
+"   T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_CD\" "
+"  ) DB, "
+" (SELECT  "
+"    T_MRP_REEXPLOSION.PLANT_CD AS PLANT_CD , "
+"    T_MRP_REEXPLOSION.JOB_ODR_CD AS JOB_ODR_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_DETAIL_NO AS JOB_ODR_DETAIL_NO, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO "
+"  FROM "
+"    T_MRP_REEXPLOSION "
+"    GROUP BY "
+"    T_MRP_REEXPLOSION.PLANT_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_DETAIL_NO, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CANCEL_NO   "
+"  ) DB1 "
+"WHERE "
+"  T_JOB_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\"=DB.\"JOB_ODR_CD\"(+) "
+"  AND T_JOB_ODR.PLANT_CD=DB1.PLANT_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_CD=DB1.JOB_ODR_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_DETAIL_NO=DB1.JOB_ODR_DETAIL_NO(+) "
+"  AND T_JOB_ODR.JOB_ODR_CANCEL_NO=DB1.JOB_ODR_CANCEL_NO(+) "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_JOB_ODR.\"ITEM_CD\" LIKE ? "
+"  AND T_JOB_ODR.\"PLANT_CD\" = ? "
+"  AND TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') <= ? "
+"  AND (T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      ) "
+"  AND  ( "
+"  0 <> CASE WHEN(to_number(?) = 0) THEN T_JOB_ODR.\"JOB_ODR_TYP\"  "
+"            ELSE 1 "
+"      END "
+"  AND "
+"  to_number(?) = CASE WHEN(to_number(?) <> 0) THEN T_JOB_ODR.\"JOB_ODR_TYP\"  "
+"           ELSE to_number(?)  "
+"  END "
+"  ) "
+"  AND ( "
+"  0 = CASE WHEN(to_number(?) = 0) THEN T_JOB_ODR.\"JOB_ODR_CANCEL_NO\"  "
+"           ELSE 1 "
+"      END "
+"  OR  "
+"  0 <> CASE WHEN(to_number(?) = 1) THEN T_JOB_ODR.\"JOB_ODR_CANCEL_NO\"  "
+"            ELSE 0  "
+"  END "
+"  ) "
+"ORDER BY "
+"  T_JOB_ODR.\"JOB_ODR_CD\", "
+"  T_JOB_ODR.\"JOB_ODR_CANCEL_NO\", "
+"  T_JOB_ODR.\"ITEM_CD\", "
+"  T_JOB_ODR.\"JOB_ODR_DLV_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:select_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read
			if(m_selcmd==null) throw new FoundationException("select", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, AC0130010Struct data, String replaceStr)
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
		public List read(Connection conn, AC0130010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_DLV_DATE_FROM());
				if(isNull(data.getJOB_ODR_DLV_DATE_FROM())) isNull = true;
				ary.addElement(data.getJOB_ODR_DLV_DATE_TO());
				if(isNull(data.getJOB_ODR_DLV_DATE_TO())) isNull = true;
				ary.addElement(data.getInC1_JOB_ODR_STS_TYP());
				if(isNull(data.getInC1_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_JOB_ODR_STS_TYP());
				if(isNull(data.getInC2_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_JOB_ODR_STS_TYP());
				if(isNull(data.getInC3_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC4_JOB_ODR_STS_TYP());
				if(isNull(data.getInC4_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC5_JOB_ODR_STS_TYP());
				if(isNull(data.getInC5_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC9_JOB_ODR_STS_TYP());
				if(isNull(data.getInC9_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getInC1_JOB_ODR_CANCEL());
				if(isNull(data.getInC1_JOB_ODR_CANCEL())) isNull = true;
				ary.addElement(data.getInC2_JOB_ODR_CANCEL());
				if(isNull(data.getInC2_JOB_ODR_CANCEL())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsys_PLANT_CD())) setString(no ++, data.getsys_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsys_PLANT_CD())) setString(no ++, data.getsys_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_DLV_DATE_FROM())) setString(no ++, data.getJOB_ODR_DLV_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_DLV_DATE_TO())) setString(no ++, data.getJOB_ODR_DLV_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_JOB_ODR_STS_TYP())) setString(no ++, data.getInC1_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_JOB_ODR_STS_TYP())) setString(no ++, data.getInC2_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_JOB_ODR_STS_TYP())) setString(no ++, data.getInC3_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC4_JOB_ODR_STS_TYP())) setString(no ++, data.getInC4_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC5_JOB_ODR_STS_TYP())) setString(no ++, data.getInC5_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC9_JOB_ODR_STS_TYP())) setString(no ++, data.getInC9_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_JOB_ODR_CANCEL())) setString(no ++, data.getInC1_JOB_ODR_CANCEL(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_JOB_ODR_CANCEL())) setString(no ++, data.getInC2_JOB_ODR_CANCEL(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0130010Struct data = new AC0130010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ITEM_CD( getString(3, rs) );
			data.setl_ITEM_NAME( getString(4, rs) );
			data.setl_STOCK_UNIT( getString(5, rs) );
			data.setl_JOB_ODR_QTY( getString(6, rs) );
			data.setl_JOB_ODR_DLV_DATE( getString(7, rs) );
			data.setl_JOB_ODR_STS_TYP( getString(8, rs) );
			data.setl_JOB_ODR_TYP( getString(9, rs) );
			data.setl_PLAN_TYP( getString(10, rs) );
			data.setl_ALC_GRP_CD( getString(11, rs) );
			data.setl_JOB_ODR_DEL_FLG( getString(12, rs) );
			data.setl_ALCD_QTY( getString(13, rs) );
			data.setl_ALCD_ENABLE_QTY( getString(14, rs) );
			data.setJobOdrExpectFlg( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:select_clear

			return;
		}

		/**
		 * selectクラスの標準コンストラクタ
		 */
		public select()
		{
			//{{user_implement_dev:select_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:select_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHK_M_ITEM extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_ITEM.\"ITEM_CD\" AS \"ITEM_CD\" "
+"FROM "
+"  M_ITEM "
+"WHERE "
+"  M_ITEM.\"ITEM_CD\" LIKE ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_M_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHK_M_ITEM_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_M_ITEM_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_M_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:CHK_M_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHK_M_ITEM_clear

			return;
		}

		/**
		 * CHK_M_ITEMクラスの標準コンストラクタ
		 */
		public CHK_M_ITEM()
		{
			//{{user_implement_dev:CHK_M_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHK_M_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHK_T_JOB_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_JOB_ODR.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\" "
+"FROM "
+"  T_JOB_ODR "
+"WHERE "
+"  T_JOB_ODR.\"JOB_ODR_CD\" LIKE ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_T_JOB_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHK_T_JOB_ODR_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_JOB_ODR_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_JOB_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:CHK_T_JOB_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHK_T_JOB_ODR_clear

			return;
		}

		/**
		 * CHK_T_JOB_ODRクラスの標準コンストラクタ
		 */
		public CHK_T_JOB_ODR()
		{
			//{{user_implement_dev:CHK_T_JOB_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHK_T_JOB_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_JOB_OD_CALC_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  SYS_JOB_OD_CALC_CTRL.JOB_ODR_CD "
+"FROM "
+"  SYS_JOB_OD_CALC_CTRL "
+"WHERE "
+"  SYS_JOB_OD_CALC_CTRL.JOB_ODR_CD = ? "
+"  AND SYS_JOB_OD_CALC_CTRL.PLANT_CD = ? "
+"  AND SYS_JOB_OD_CALC_CTRL.OD_MNT_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_JOB_OD_CALC_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_JOB_OD_CALC_CTRL_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_JOB_OD_CALC_CTRL_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_JOB_OD_CALC_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_JOB_ODR_CD());
				if(isNull(data.getl_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getl_JOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsys_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SYS_JOB_OD_CALC_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_JOB_OD_CALC_CTRL_clear

			return;
		}

		/**
		 * SYS_JOB_OD_CALC_CTRLクラスの標準コンストラクタ
		 */
		public SYS_JOB_OD_CALC_CTRL()
		{
			//{{user_implement_dev:SYS_JOB_OD_CALC_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_JOB_OD_CALC_CTRL_constractor

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
+"  T_JOB_ODR, "
+"  M_ITEM, "
+"  (select "
+"   T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_CD\" AS JOB_ODR_CD, "
+"   TO_CHAR(SUM(T_PRD_REQ_JOB_ODR_ALC.\"ALCD_QTY\"), 'TM9') AS ALCD_QTY "
+"from "
+"  T_PRD_REQ_JOB_ODR_ALC "
+"where "
+"  T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_DETAIL_NO\" = 0 "
+"  and T_PRD_REQ_JOB_ODR_ALC.\"PLANT_CD\" = ? "
+"  and T_PRD_REQ_JOB_ODR_ALC.\"COMPANY_CD\" = ( "
+"     select "
+"      SYS_MY_COMPANY.\"COMPANY_CD\" "
+"    from "
+"      SYS_MY_COMPANY "
+"    where "
+"      SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM'  ) "
+"group by  "
+"   T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_CD\" "
+"  ) DB, "
+" (SELECT  "
+"    T_MRP_REEXPLOSION.PLANT_CD AS PLANT_CD , "
+"    T_MRP_REEXPLOSION.JOB_ODR_CD AS JOB_ODR_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_DETAIL_NO AS JOB_ODR_DETAIL_NO, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO "
+"  FROM "
+"    T_MRP_REEXPLOSION "
+"    GROUP BY "
+"    T_MRP_REEXPLOSION.PLANT_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_DETAIL_NO, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CANCEL_NO   "
+"  ) DB1 "
+"WHERE "
+"  T_JOB_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\"=DB.\"JOB_ODR_CD\"(+) "
+"  AND T_JOB_ODR.PLANT_CD=DB1.PLANT_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_CD=DB1.JOB_ODR_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_DETAIL_NO=DB1.JOB_ODR_DETAIL_NO(+) "
+"  AND T_JOB_ODR.JOB_ODR_CANCEL_NO=DB1.JOB_ODR_CANCEL_NO(+) "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_JOB_ODR.\"ITEM_CD\" LIKE ? "
+"  AND T_JOB_ODR.\"PLANT_CD\" = ? "
+"  AND TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') <= ? "
+"  AND (T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      ) "
+"  AND  ( "
+"  0 <> CASE WHEN(to_number(?) = 0) THEN T_JOB_ODR.\"JOB_ODR_TYP\"  "
+"            ELSE 1 "
+"      END "
+"  AND "
+"  to_number(?) = CASE WHEN(to_number(?) <> 0) THEN T_JOB_ODR.\"JOB_ODR_TYP\"  "
+"           ELSE to_number(?)  "
+"  END "
+"  ) "
+"  AND ( "
+"  0 = CASE WHEN(to_number(?) = 0) THEN T_JOB_ODR.\"JOB_ODR_CANCEL_NO\"  "
+"           ELSE 1 "
+"      END "
+"  OR  "
+"  0 <> CASE WHEN(to_number(?) = 1) THEN T_JOB_ODR.\"JOB_ODR_CANCEL_NO\"  "
+"            ELSE 0  "
+"  END "
+"  ) "
+" AND ROWNUM <= TO_NUMBER(?) + 1 ";
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
		public List read(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AC0130010Struct data, String replaceStr)
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
		public List read(Connection conn, AC0130010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_DLV_DATE_FROM());
				if(isNull(data.getJOB_ODR_DLV_DATE_FROM())) isNull = true;
				ary.addElement(data.getJOB_ODR_DLV_DATE_TO());
				if(isNull(data.getJOB_ODR_DLV_DATE_TO())) isNull = true;
				ary.addElement(data.getInC1_JOB_ODR_STS_TYP());
				if(isNull(data.getInC1_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_JOB_ODR_STS_TYP());
				if(isNull(data.getInC2_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_JOB_ODR_STS_TYP());
				if(isNull(data.getInC3_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC4_JOB_ODR_STS_TYP());
				if(isNull(data.getInC4_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC5_JOB_ODR_STS_TYP());
				if(isNull(data.getInC5_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC9_JOB_ODR_STS_TYP());
				if(isNull(data.getInC9_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getInC1_JOB_ODR_CANCEL());
				if(isNull(data.getInC1_JOB_ODR_CANCEL())) isNull = true;
				ary.addElement(data.getInC2_JOB_ODR_CANCEL());
				if(isNull(data.getInC2_JOB_ODR_CANCEL())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getsys_PLANT_CD())) setString(no ++, data.getsys_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getsys_PLANT_CD())) setString(no ++, data.getsys_PLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_DLV_DATE_FROM())) setString(no ++, data.getJOB_ODR_DLV_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_DLV_DATE_TO())) setString(no ++, data.getJOB_ODR_DLV_DATE_TO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_JOB_ODR_STS_TYP())) setString(no ++, data.getInC1_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_JOB_ODR_STS_TYP())) setString(no ++, data.getInC2_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC3_JOB_ODR_STS_TYP())) setString(no ++, data.getInC3_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC4_JOB_ODR_STS_TYP())) setString(no ++, data.getInC4_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC5_JOB_ODR_STS_TYP())) setString(no ++, data.getInC5_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC9_JOB_ODR_STS_TYP())) setString(no ++, data.getInC9_JOB_ODR_STS_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC1_JOB_ODR_CANCEL())) setString(no ++, data.getInC1_JOB_ODR_CANCEL(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getInC2_JOB_ODR_CANCEL())) setString(no ++, data.getInC2_JOB_ODR_CANCEL(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0130010Struct data = new AC0130010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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

	// null文字列、空白文字列の場合にtrueを返します
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * クリーンナップ用メソッド
	 *
	 */
	public void clear()
	{
		mselect.clear();
		mselect = null;
		mCHK_M_ITEM.clear();
		mCHK_M_ITEM = null;
		mCHK_T_JOB_ODR.clear();
		mCHK_T_JOB_ODR = null;
		mSYS_JOB_OD_CALC_CTRL.clear();
		mSYS_JOB_OD_CALC_CTRL = null;
		mselectCnt.clear();
		mselectCnt = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AC0130010クラスの標準コンストラクタ
	 */
	public AC0130010Entity() throws FoundationException
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
