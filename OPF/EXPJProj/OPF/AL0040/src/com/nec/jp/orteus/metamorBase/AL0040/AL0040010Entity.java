/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/src/com/nec/jp/orteus/metamorBase/AL0040/AL0040010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0040;

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

public class AL0040010Entity extends DataObject
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

	// SelectDateクラス インスタンス
	public SelectDate mSelectDate = new SelectDate();

	// SelectNeckCDクラス インスタンス
	public SelectNeckCD mSelectNeckCD = new SelectNeckCD();

	// SelectChartParaクラス インスタンス
	public SelectChartPara mSelectChartPara = new SelectChartPara();

	// SelectNeckDetailクラス インスタンス
	public SelectNeckDetail mSelectNeckDetail = new SelectNeckDetail();

	// SelectNeckDtHdクラス インスタンス
	public SelectNeckDtHd mSelectNeckDtHd = new SelectNeckDtHd();

	// SelectSimクラス インスタンス
	public SelectSim mSelectSim = new SelectSim();

	// SelectNeckCDSimクラス インスタンス
	public SelectNeckCDSim mSelectNeckCDSim = new SelectNeckCDSim();

	// SelectNeckDetailSimクラス インスタンス
	public SelectNeckDetailSim mSelectNeckDetailSim = new SelectNeckDetailSim();

	// SelectNeckDtHdSimクラス インスタンス
	public SelectNeckDtHdSim mSelectNeckDtHdSim = new SelectNeckDtHdSim();

	// SelectResourceクラス インスタンス
	public SelectResource mSelectResource = new SelectResource();

	// SelectSysDateCtrlクラス インスタンス
	public SelectSysDateCtrl mSelectSysDateCtrl = new SelectSysDateCtrl();

	// SelectSysInstallOptionsクラス インスタンス
	public SelectSysInstallOptions mSelectSysInstallOptions = new SelectSysInstallOptions();


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
		String m_write_fname="AL0040010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AL0040010";

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
		protected String m_selcmd = "select "
+"  M_RESOURCE.\"NECK_PROC_NAME\" as \"NECK_PROC_NAME\", "
+"  M_RESOURCE.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd'),'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT1\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+1,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT2\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+2,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT3\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+3,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT4\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+4,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT5\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+5,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT6\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+6,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT7\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+7,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT8\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+8,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT9\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+9,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT10\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+10,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT11\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+11,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT12\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+12,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT13\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+13,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT14\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+14,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT15\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+15,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT16\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+16,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT17\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+17,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT18\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+18,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT19\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+19,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT20\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+20,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT21\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+21,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT22\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+22,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT23\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+23,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT24\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+24,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT25\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+25,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT26\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+26,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT27\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+27,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT28\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+28,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT29\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+29,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT30\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+30,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT31\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+31,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT32\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+32,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT33\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+33,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT34\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+34,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT35\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+35,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT36\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+36,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT37\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+37,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT38\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+38,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT39\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+39,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT40\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+40,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT41\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+41,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT42\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+42,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT43\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+43,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT44\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+44,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT45\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+45,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT46\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+46,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT47\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+47,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT48\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+48,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT49\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+49,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT50\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+50,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT51\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+51,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT52\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+52,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT53\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+53,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT54\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+54,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT55\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+55,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT56\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+56,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT57\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+57,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT58\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+58,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT59\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+59,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT60\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+60,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT61\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+61,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT62\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+62,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT63\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+63,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT64\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+64,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT65\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+65,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT66\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+66,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT67\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+67,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT68\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+68,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT69\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+69,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT70\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+70,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT71\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+71,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT72\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+72,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT73\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+73,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT74\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+74,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT75\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+75,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT76\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+76,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT77\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+77,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT78\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+78,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT79\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+79,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT80\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+80,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT81\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+81,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT82\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+82,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT83\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+83,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT84\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+84,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT85\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+85,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT86\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+86,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT87\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+87,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT88\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+88,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT89\", "
+"  sum(decode(TO_CHAR(T_LOAD_DETAIL.\"LOAD_DATE\", 'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+89,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT90\" "
+"from "
+"  T_LOAD_DETAIL, "
+"  M_RESOURCE "
+"where "
+"  M_RESOURCE.NECK_PROC_CD = T_LOAD_DETAIL.NECK_PROC_CD "
+"  and T_LOAD_DETAIL.\"LOAD_DATE\" >= ? "
+"  and T_LOAD_DETAIL.\"LOAD_DATE\" <= ? "
+"  and T_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"  and M_RESOURCE.\"PLANT_CD\" = ? "
+"group by "
+"  M_RESOURCE.\"NECK_PROC_NAME\", "
+"  M_RESOURCE.\"NECK_PROC_CD\" "
+"order by "
+"  M_RESOURCE.\"NECK_PROC_CD\" "
+"";
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
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
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
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateTo());
				if(isNull(data.getDateTo())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateTo(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setNECK_PROC_NAME( getString(1, rs) );
			data.setNECK_PROC_CD( getString(2, rs) );
			data.setLOAD_QTY1( getString(3, rs) );
			data.setLOAD_QTY2( getString(4, rs) );
			data.setLOAD_QTY3( getString(5, rs) );
			data.setLOAD_QTY4( getString(6, rs) );
			data.setLOAD_QTY5( getString(7, rs) );
			data.setLOAD_QTY6( getString(8, rs) );
			data.setLOAD_QTY7( getString(9, rs) );
			data.setLOAD_QTY8( getString(10, rs) );
			data.setLOAD_QTY9( getString(11, rs) );
			data.setLOAD_QTY10( getString(12, rs) );
			data.setLOAD_QTY11( getString(13, rs) );
			data.setLOAD_QTY12( getString(14, rs) );
			data.setLOAD_QTY13( getString(15, rs) );
			data.setLOAD_QTY14( getString(16, rs) );
			data.setLOAD_QTY15( getString(17, rs) );
			data.setLOAD_QTY16( getString(18, rs) );
			data.setLOAD_QTY17( getString(19, rs) );
			data.setLOAD_QTY18( getString(20, rs) );
			data.setLOAD_QTY19( getString(21, rs) );
			data.setLOAD_QTY20( getString(22, rs) );
			data.setLOAD_QTY21( getString(23, rs) );
			data.setLOAD_QTY22( getString(24, rs) );
			data.setLOAD_QTY23( getString(25, rs) );
			data.setLOAD_QTY24( getString(26, rs) );
			data.setLOAD_QTY25( getString(27, rs) );
			data.setLOAD_QTY26( getString(28, rs) );
			data.setLOAD_QTY27( getString(29, rs) );
			data.setLOAD_QTY28( getString(30, rs) );
			data.setLOAD_QTY29( getString(31, rs) );
			data.setLOAD_QTY30( getString(32, rs) );
			data.setLOAD_QTY31( getString(33, rs) );
			data.setLOAD_QTY32( getString(34, rs) );
			data.setLOAD_QTY33( getString(35, rs) );
			data.setLOAD_QTY34( getString(36, rs) );
			data.setLOAD_QTY35( getString(37, rs) );
			data.setLOAD_QTY36( getString(38, rs) );
			data.setLOAD_QTY37( getString(39, rs) );
			data.setLOAD_QTY38( getString(40, rs) );
			data.setLOAD_QTY39( getString(41, rs) );
			data.setLOAD_QTY40( getString(42, rs) );
			data.setLOAD_QTY41( getString(43, rs) );
			data.setLOAD_QTY42( getString(44, rs) );
			data.setLOAD_QTY43( getString(45, rs) );
			data.setLOAD_QTY44( getString(46, rs) );
			data.setLOAD_QTY45( getString(47, rs) );
			data.setLOAD_QTY46( getString(48, rs) );
			data.setLOAD_QTY47( getString(49, rs) );
			data.setLOAD_QTY48( getString(50, rs) );
			data.setLOAD_QTY49( getString(51, rs) );
			data.setLOAD_QTY50( getString(52, rs) );
			data.setLOAD_QTY51( getString(53, rs) );
			data.setLOAD_QTY52( getString(54, rs) );
			data.setLOAD_QTY53( getString(55, rs) );
			data.setLOAD_QTY54( getString(56, rs) );
			data.setLOAD_QTY55( getString(57, rs) );
			data.setLOAD_QTY56( getString(58, rs) );
			data.setLOAD_QTY57( getString(59, rs) );
			data.setLOAD_QTY58( getString(60, rs) );
			data.setLOAD_QTY59( getString(61, rs) );
			data.setLOAD_QTY60( getString(62, rs) );
			data.setLOAD_QTY61( getString(63, rs) );
			data.setLOAD_QTY62( getString(64, rs) );
			data.setLOAD_QTY63( getString(65, rs) );
			data.setLOAD_QTY64( getString(66, rs) );
			data.setLOAD_QTY65( getString(67, rs) );
			data.setLOAD_QTY66( getString(68, rs) );
			data.setLOAD_QTY67( getString(69, rs) );
			data.setLOAD_QTY68( getString(70, rs) );
			data.setLOAD_QTY69( getString(71, rs) );
			data.setLOAD_QTY70( getString(72, rs) );
			data.setLOAD_QTY71( getString(73, rs) );
			data.setLOAD_QTY72( getString(74, rs) );
			data.setLOAD_QTY73( getString(75, rs) );
			data.setLOAD_QTY74( getString(76, rs) );
			data.setLOAD_QTY75( getString(77, rs) );
			data.setLOAD_QTY76( getString(78, rs) );
			data.setLOAD_QTY77( getString(79, rs) );
			data.setLOAD_QTY78( getString(80, rs) );
			data.setLOAD_QTY79( getString(81, rs) );
			data.setLOAD_QTY80( getString(82, rs) );
			data.setLOAD_QTY81( getString(83, rs) );
			data.setLOAD_QTY82( getString(84, rs) );
			data.setLOAD_QTY83( getString(85, rs) );
			data.setLOAD_QTY84( getString(86, rs) );
			data.setLOAD_QTY85( getString(87, rs) );
			data.setLOAD_QTY86( getString(88, rs) );
			data.setLOAD_QTY87( getString(89, rs) );
			data.setLOAD_QTY88( getString(90, rs) );
			data.setLOAD_QTY89( getString(91, rs) );
			data.setLOAD_QTY90( getString(92, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Select", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
	public class SelectDate extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CAL.\"CAL_DATE\" as \"CAL_DATE\", "
+"  M_CAL.\"HOLIDAY_FLG\" as \"HOLIDAY_FLG\" "
+"from "
+"  M_CAL, "
+"  M_PLANT "
+"where "
+"  M_CAL.\"CAL_NO\" = M_PLANT.\"CAL_NO\" "
+"  and M_PLANT.\"PLANT_CD\" = ? "
+"  and M_CAL.\"CAL_DATE\" >= to_date(?, 'yyyy/mm/dd') "
+"  and M_CAL.\"CAL_DATE\" <= to_date(?, 'yyyy/mm/dd') + 89 "
+"order by "
+"  M_CAL.\"CAL_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDate_def
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectDate_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDate_read
            if(m_selcmd==null) throw new FoundationException("SelectDate", "read", "クエリー未登録");

            PreparedStatement stmt=prepare(conn, m_selcmd, data);

            try {
                return read(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectDate_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDate_read2
			if(m_selcmd==null) throw new FoundationException("SelectDate", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDate_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDate_read3
			if(m_selcmd==null) throw new FoundationException("SelectDate", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDate_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setCAL_DATE( getString(1, rs) );
			data.setHoliday_Flg( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDate", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDate_check
            PreparedStatement stmt;

            if(m_chkcmd!=null) {
                stmt = prepare(conn, m_chkcmd, data);
            } else if(m_selcmd!=null) {
                stmt = prepare(conn, m_selcmd, data);
            } else {
                throw new FoundationException("SelectDate", "check", "クエリー未登録");
            }

            try {
                return check(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectDate_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDate_clear
                // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectDate_clear

			return;
		}

		/**
		 * SelectDateクラスの標準コンストラクタ
		 */
		public SelectDate()
		{
			//{{user_implement_dev:SelectDate_constractor
                // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectDate_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectNeckCD extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  to_char(T_LOAD_DETAIL.\"LOAD_DATE\", 'yyyy/mm/dd') as \"LOAD_DATE\", "
+"  TO_CHAR(SUM(T_LOAD_DETAIL.\"LOAD_QTY\"), 'FM99999999999990.0999') as \"LOAD_QTY\", "
+"  TO_CHAR(TYPE_VALUE.\"VALUE\") as \"ODR_STS_TYP\" "
+"from "
+"  T_LOAD_DETAIL, "
+"  (SELECT VALUE,DISPLAY_NAME FROM SYS_TYPE_VALUE WHERE NAME = 'LOAD_ODR_STS_TYP') TYPE_VALUE "
+"where "
+"  T_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"  and T_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"  and T_LOAD_DETAIL.\"LOAD_DATE\" >= to_date(?, 'yyyy/mm/dd') - 20 "
+"  and T_LOAD_DETAIL.\"LOAD_DATE\" <= to_date(?, 'yyyy/mm/dd') + 20 "
+"  and TYPE_VALUE.\"VALUE\" = T_LOAD_DETAIL.\"ODR_STS_TYP\" "
+"group by "
+"  T_LOAD_DETAIL.\"LOAD_DATE\", "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\", "
+"  TYPE_VALUE.\"VALUE\" "
+"order by "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\", "
+"  to_char(T_LOAD_DETAIL.\"LOAD_DATE\", 'yyyy/mm/dd'), "
+"  TYPE_VALUE.\"VALUE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNeckCD_def
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectNeckCD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckCD_read
            if(m_selcmd==null) throw new FoundationException("SelectNeckCD", "read", "クエリー未登録");

            PreparedStatement stmt=prepare(conn, m_selcmd, data);

            try {
                return read(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectNeckCD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckCD_read2
			if(m_selcmd==null) throw new FoundationException("SelectNeckCD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckCD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckCD_read3
			if(m_selcmd==null) throw new FoundationException("SelectNeckCD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckCD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getK_LOAD_DATE());
				if(isNull(data.getK_LOAD_DATE())) isNull = true;
				ary.addElement(data.getK_LOAD_DATE());
				if(isNull(data.getK_LOAD_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_LOAD_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_LOAD_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setL_NECK_PROC_CD( getString(1, rs) );
			data.setL_LOAD_DATE( getString(2, rs) );
			data.setL_LOAD_QTY( getString(3, rs) );
			data.setL_ODR_STS_TYP( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNeckCD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckCD_check
            PreparedStatement stmt;

            if(m_chkcmd!=null) {
                stmt = prepare(conn, m_chkcmd, data);
            } else if(m_selcmd!=null) {
                stmt = prepare(conn, m_selcmd, data);
            } else {
                throw new FoundationException("SelectNeckCD", "check", "クエリー未登録");
            }

            try {
                return check(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectNeckCD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNeckCD_clear
                // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectNeckCD_clear

			return;
		}

		/**
		 * SelectNeckCDクラスの標準コンストラクタ
		 */
		public SelectNeckCD()
		{
			//{{user_implement_dev:SelectNeckCD_constractor
                // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectNeckCD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectChartPara extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_LOAD_CHART_PARM.\"DIMENSION_TYP\" as \"DIMENSION_TYP\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_TYP\" as \"CHART_TYP\", "
+"  SYS_LOAD_CHART_PARM.\"BACKGROUNDCOLOR_R\" as \"BACKGROUNDCOLOR_R\", "
+"  SYS_LOAD_CHART_PARM.\"BACKGROUNDCOLOR_G\" as \"BACKGROUNDCOLOR_G\", "
+"  SYS_LOAD_CHART_PARM.\"BACKGROUNDCOLOR_B\" as \"BACKGROUNDCOLOR_B\", "
+"  SYS_LOAD_CHART_PARM.\"MAX_SCALE_RATE\" as \"MAX_SCALE_RATE\", "
+"  SYS_LOAD_CHART_PARM.\"SCALE_STEP\" as \"SCALE_STEP\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR0_R\" as \"CHART_COLOR0_R\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR0_G\" as \"CHART_COLOR0_G\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR0_B\" as \"CHART_COLOR0_B\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR1_R\" as \"CHART_COLOR1_R\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR1_G\" as \"CHART_COLOR1_G\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR1_B\" as \"CHART_COLOR1_B\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR2_R\" as \"CHART_COLOR2_R\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR2_G\" as \"CHART_COLOR2_G\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR2_B\" as \"CHART_COLOR2_B\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR9_R\" as \"CHART_COLOR9_R\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR9_G\" as \"CHART_COLOR9_G\", "
+"  SYS_LOAD_CHART_PARM.\"CHART_COLOR9_B\" as \"CHART_COLOR9_B\", "
+"  SYS_LOAD_CHART_PARM.\"HIGH_LOAD\" as \"HIGH_LOAD\", "
+"  SYS_LOAD_CHART_PARM.\"HIGH_LOAD_COLOR_R\" as \"HIGH_LOAD_COLOR_R\", "
+"  SYS_LOAD_CHART_PARM.\"HIGH_LOAD_COLOR_G\" as \"HIGH_LOAD_COLOR_G\", "
+"  SYS_LOAD_CHART_PARM.\"HIGH_LOAD_COLOR_B\" as \"HIGH_LOAD_COLOR_B\", "
+"  SYS_LOAD_CHART_PARM.\"MIDDLE_LOAD\" as \"MIDDLE_LOAD\", "
+"  SYS_LOAD_CHART_PARM.\"MIDDLE_LOAD_COLOR_R\" as \"MIDDLE_LOAD_COLOR_R\", "
+"  SYS_LOAD_CHART_PARM.\"MIDDLE_LOAD_COLOR_G\" as \"MIDDLE_LOAD_COLOR_G\", "
+"  SYS_LOAD_CHART_PARM.\"MIDDLE_LOAD_COLOR_B\" as \"MIDDLE_LOAD_COLOR_B\", "
+"  SYS_LOAD_CHART_PARM.\"LOW_LOAD\" as \"LOW_LOAD\", "
+"  SYS_LOAD_CHART_PARM.\"LOW_LOAD_COLOR_R\" as \"LOW_LOAD_COLOR_R\", "
+"  SYS_LOAD_CHART_PARM.\"LOW_LOAD_COLOR_G\" as \"LOW_LOAD_COLOR_G\", "
+"  SYS_LOAD_CHART_PARM.\"LOW_LOAD_COLOR_B\" as \"LOW_LOAD_COLOR_B\" "
+"from "
+"  SYS_LOAD_CHART_PARM "
+"where "
+"  SYS_LOAD_CHART_PARM.\"PLANT_CD\" = ? "
+"  and SYS_LOAD_CHART_PARM.\"CHART_CD\" = 'AL0040010'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectChartPara_def
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectChartPara_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectChartPara_read
            if(m_selcmd==null) throw new FoundationException("SelectChartPara", "read", "クエリー未登録");

            PreparedStatement stmt=prepare(conn, m_selcmd, data);

            try {
                return read(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectChartPara_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectChartPara_read2
			if(m_selcmd==null) throw new FoundationException("SelectChartPara", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectChartPara_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectChartPara_read3
			if(m_selcmd==null) throw new FoundationException("SelectChartPara", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectChartPara_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setL_CHT_DIM( getInteger(1, rs) );
			data.setL_CHT_TYPE( getInteger(2, rs) );
			data.setL_BG_C_R( getInteger(3, rs) );
			data.setL_BG_C_G( getInteger(4, rs) );
			data.setL_BG_C_B( getInteger(5, rs) );
			data.setL_MAX_SCALE( getDouble(6, rs) );
			data.setL_SCALE_STEP( getDouble(7, rs) );
			data.setL_CHT_C0_R( getInteger(8, rs) );
			data.setL_CHT_C0_G( getInteger(9, rs) );
			data.setL_CHT_C0_B( getInteger(10, rs) );
			data.setL_CHT_C1_R( getInteger(11, rs) );
			data.setL_CHT_C1_G( getInteger(12, rs) );
			data.setL_CHT_C1_B( getInteger(13, rs) );
			data.setL_CHT_C2_R( getInteger(14, rs) );
			data.setL_CHT_C2_G( getInteger(15, rs) );
			data.setL_CHT_C2_B( getInteger(16, rs) );
			data.setL_CHT_C9_R( getInteger(17, rs) );
			data.setL_CHT_C9_G( getInteger(18, rs) );
			data.setL_CHT_C9_B( getInteger(19, rs) );
			data.setL_HIGH_LOAD( getInteger(20, rs) );
			data.setL_H_LOAD_C_R( getInteger(21, rs) );
			data.setL_H_LOAD_C_G( getInteger(22, rs) );
			data.setL_H_LOAD_C_B( getInteger(23, rs) );
			data.setL_MIDD_LOAD( getInteger(24, rs) );
			data.setL_M_LOAD_C_R( getInteger(25, rs) );
			data.setL_M_LOAD_C_G( getInteger(26, rs) );
			data.setL_M_LOAD_C_B( getInteger(27, rs) );
			data.setL_LOW_LOAD( getInteger(28, rs) );
			data.setL_L_LOAD_C_R( getInteger(29, rs) );
			data.setL_L_LOAD_C_G( getInteger(30, rs) );
			data.setL_L_LOAD_C_B( getInteger(31, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectChartPara", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectChartPara_check
            PreparedStatement stmt;

            if(m_chkcmd!=null) {
                stmt = prepare(conn, m_chkcmd, data);
            } else if(m_selcmd!=null) {
                stmt = prepare(conn, m_selcmd, data);
            } else {
                throw new FoundationException("SelectChartPara", "check", "クエリー未登録");
            }

            try {
                return check(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectChartPara_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectChartPara_clear
                // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectChartPara_clear

			return;
		}

		/**
		 * SelectChartParaクラスの標準コンストラクタ
		 */
		public SelectChartPara()
		{
			//{{user_implement_dev:SelectChartPara_constractor
                // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectChartPara_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectNeckDetail extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOAD_DETAIL.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_LOAD_DETAIL.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  to_char(TYPE_VALUE.\"VALUE\") as \"ODR_STS_TYP\", "
+"  to_char(T_LOAD_DETAIL.\"PRD_START_DATE\", 'yyyy/mm/dd') as \"PRD_START_DATE\", "
+"  to_char(T_LOAD_DETAIL.\"PRD_DUE_DATE\", 'yyyy/mm/dd') as \"PRD_DUE_DATE\", "
+"  to_char(T_LOAD_DETAIL.\"ODR_QTY\", 'FM99999999999990.0999') as \"ODR_QTY\", "
+"  to_char(T_LOAD_DETAIL.\"TOTAL_RCV_QTY\", 'FM99999999999990.0999') as \"TOTAL_RCV_QTY\", "
+"  to_char(M_NECK_WS.\"UNIT_LOAD\", 'FM9990.09') as \"UNIT_LOAD\", "
+"  to_char(T_LOAD_DETAIL.\"LOAD_QTY\", 'FM999999999999999990.099999') as \"LOAD_QTY\" "
+"from "
+"  T_LOAD_DETAIL, "
+"  M_ITEM, "
+"  M_NECK_WS, "
+"  (SELECT VALUE,DISPLAY_NAME FROM SYS_TYPE_VALUE WHERE NAME = 'LOAD_ODR_STS_TYP') TYPE_VALUE "
+"where "
+"  T_LOAD_DETAIL.PLANT_CD = M_NECK_WS.PLANT_CD(+) "
+"  and T_LOAD_DETAIL.ITEM_CD = M_NECK_WS.ITEM_CD(+) "
+"  and T_LOAD_DETAIL.NECK_PROC_CD = M_NECK_WS.NECK_PROC_CD(+) "
+"  and T_LOAD_DETAIL.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"  and T_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"  and T_LOAD_DETAIL.\"LOAD_DATE\" = to_date(?, 'yyyy/mm/dd') "
+"  and T_LOAD_DETAIL.\"ODR_STS_TYP\" = TYPE_VALUE.\"VALUE\" "
+"order by "
+"  T_LOAD_DETAIL.\"PRD_START_DATE\", "
+"  T_LOAD_DETAIL.\"PRD_DUE_DATE\", "
+"  TYPE_VALUE.\"DISPLAY_NAME\", "
+"  T_LOAD_DETAIL.\"ITEM_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNeckDetail_def
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectNeckDetail_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDetail_read
            if(m_selcmd==null) throw new FoundationException("SelectNeckDetail", "read", "クエリー未登録");

            PreparedStatement stmt=prepare(conn, m_selcmd, data);

  System.out.println("stmt:"+ stmt);

            try {
                return read(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectNeckDetail_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDetail_read2
			if(m_selcmd==null) throw new FoundationException("SelectNeckDetail", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckDetail_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDetail_read3
			if(m_selcmd==null) throw new FoundationException("SelectNeckDetail", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckDetail_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getKM_LOAD_DATE());
				if(isNull(data.getKM_LOAD_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getKM_LOAD_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setLKM_ITEM_CD( getString(1, rs) );
			data.setLKM_ITEM_NAME( getString(2, rs) );
			data.setLKM_JOB_ODR_CD( getString(3, rs) );
			data.setLKM_ODR_STS_TYP( getString(4, rs) );
			data.setLKM_PRD_START_DATE( getString(5, rs) );
			data.setLKM_PRD_DUE_DATE( getString(6, rs) );
			data.setLKM_ODR_QTY( getString(7, rs) );
			data.setLKM_TOTAL_RCV_QTY( getString(8, rs) );
			data.setLKM_UNIT_LOAD( getString(9, rs) );
			data.setLKM_LOAD_QTY( getString(10, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNeckDetail", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDetail_check
            PreparedStatement stmt;

            if(m_chkcmd!=null) {
                stmt = prepare(conn, m_chkcmd, data);
            } else if(m_selcmd!=null) {
                stmt = prepare(conn, m_selcmd, data);
            } else {
                throw new FoundationException("SelectNeckDetail", "check", "クエリー未登録");
            }

            try {
                return check(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectNeckDetail_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNeckDetail_clear
                // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectNeckDetail_clear

			return;
		}

		/**
		 * SelectNeckDetailクラスの標準コンストラクタ
		 */
		public SelectNeckDetail()
		{
			//{{user_implement_dev:SelectNeckDetail_constractor
                // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectNeckDetail_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectNeckDtHd extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(SUM(T_LOAD_DETAIL.\"LOAD_QTY\"), 'FM99999999999999999990.099999') as \"SUM_LOAD_QTY\", "
+"  to_char(SUM(T_LOAD_DETAIL.\"LOAD_QTY\") - M_RESOURCE.\"NECK_PROC_CAPA\", 'FM99999999999999999990.099999') as \"OVR_LOAD_QTY\", "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  to_char(T_LOAD_DETAIL.\"LOAD_DATE\", 'yyyy/mm/dd') as \"LOAD_DATE\", "
+"  M_RESOURCE.\"NECK_PROC_NAME\" as \"NECK_PROC_NAME\", "
+"  to_char(M_RESOURCE.\"NECK_PROC_CAPA\", 'FM99999990.09') as \"NECK_PROC_CAPA\", "
+"  M_RESOURCE.\"NECK_PROC_CAPA_UNIT\" as \"NECK_PROC_CAPA_UNIT\" "
+"from "
+"  T_LOAD_DETAIL, "
+"  M_RESOURCE "
+"where "
+"  T_LOAD_DETAIL.PLANT_CD = M_RESOURCE.PLANT_CD(+) "
+"  and T_LOAD_DETAIL.NECK_PROC_CD = M_RESOURCE.NECK_PROC_CD(+) "
+"  and T_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"  and T_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"  and T_LOAD_DETAIL.\"LOAD_DATE\" = to_date(?, 'yyyy/mm/dd') "
+"group by "
+"  M_RESOURCE.\"NECK_PROC_CAPA\", "
+"  M_RESOURCE.\"NECK_PROC_CAPA_UNIT\", "
+"  M_RESOURCE.\"NECK_PROC_CD\", "
+"  M_RESOURCE.\"NECK_PROC_NAME\", "
+"  M_RESOURCE.\"PLANT_CD\", "
+"  T_LOAD_DETAIL.\"LOAD_DATE\", "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\", "
+"  T_LOAD_DETAIL.\"PLANT_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNeckDtHd_def
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectNeckDtHd_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDtHd_read
            if(m_selcmd==null) throw new FoundationException("SelectNeckDtHd", "read", "クエリー未登録");

            PreparedStatement stmt=prepare(conn, m_selcmd, data);

            try {
                return read(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectNeckDtHd_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDtHd_read2
			if(m_selcmd==null) throw new FoundationException("SelectNeckDtHd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckDtHd_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDtHd_read3
			if(m_selcmd==null) throw new FoundationException("SelectNeckDtHd", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckDtHd_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getKM_LOAD_DATE());
				if(isNull(data.getKM_LOAD_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getKM_LOAD_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setLKM_SUM_LOAD_QTY( getString(1, rs) );
			data.setLKM_OVR_LOAD_QTY( getString(2, rs) );
			data.setLKM_NECK_PROC_CD( getString(3, rs) );
			data.setLKM_LOAD_DATE( getString(4, rs) );
			data.setLKM_NECK_PROC_NAME( getString(5, rs) );
			data.setLKM_NECK_PROC_CAPA( getString(6, rs) );
			data.setLKM_NECK_PROC_CAPA_UNIT( getString(7, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNeckDtHd", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDtHd_check
            PreparedStatement stmt;

            if(m_chkcmd!=null) {
                stmt = prepare(conn, m_chkcmd, data);
            } else if(m_selcmd!=null) {
                stmt = prepare(conn, m_selcmd, data);
            } else {
                throw new FoundationException("SelectNeckDtHd", "check", "クエリー未登録");
            }

            try {
                return check(stmt, data);
            } finally {
                stmt.close();
                stmt = null;
            }
                        //}}user_implement_dev:SelectNeckDtHd_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNeckDtHd_clear
                // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectNeckDtHd_clear

			return;
		}

		/**
		 * SelectNeckDtHdクラスの標準コンストラクタ
		 */
		public SelectNeckDtHd()
		{
			//{{user_implement_dev:SelectNeckDtHd_constractor
                // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectNeckDtHd_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSim extends DataObject
	{
		protected String m_selcmd = "select NECK_PROC_NAME,NECK_PROC_CD, "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd'),'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT1\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd'),'mm/dd'), SFlg, 0)) as \"FLG1\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+1,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT2\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+1,'mm/dd'), SFlg, 0)) as \"FLG2\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+2,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT3\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+2,'mm/dd'), SFlg, 0)) as \"FLG3\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+3,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT4\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+3,'mm/dd'), SFlg, 0)) as \"FLG4\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+4,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT5\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+4,'mm/dd'), SFlg, 0)) as \"FLG5\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+5,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT6\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+5,'mm/dd'), SFlg, 0)) as \"FLG6\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+6,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT7\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+6,'mm/dd'), SFlg, 0)) as \"FLG7\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+7,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT8\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+7,'mm/dd'), SFlg, 0)) as \"FLG8\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+8,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT9\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+8,'mm/dd'), SFlg, 0)) as \"FLG9\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+9,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT10\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+9,'mm/dd'), SFlg, 0)) as \"FLG10\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+10,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT11\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+10,'mm/dd'), SFlg, 0)) as \"FLG11\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+11,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT12\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+11,'mm/dd'), SFlg, 0)) as \"FLG12\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+12,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT13\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+12,'mm/dd'), SFlg, 0)) as \"FLG13\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+13,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT14\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+13,'mm/dd'), SFlg, 0)) as \"FLG14\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+14,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT15\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+14,'mm/dd'), SFlg, 0)) as \"FLG15\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+15,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT16\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+15,'mm/dd'), SFlg, 0)) as \"FLG16\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+16,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT17\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+16,'mm/dd'), SFlg, 0)) as \"FLG17\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+17,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT18\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+17,'mm/dd'), SFlg, 0)) as \"FLG18\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+18,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT19\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+18,'mm/dd'), SFlg, 0)) as \"FLG19\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+19,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT20\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+19,'mm/dd'), SFlg, 0)) as \"FLG20\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+20,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT21\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+20,'mm/dd'), SFlg, 0)) as \"FLG21\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+21,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT22\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+21,'mm/dd'), SFlg, 0)) as \"FLG22\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+22,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT23\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+22,'mm/dd'), SFlg, 0)) as \"FLG23\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+23,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT24\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+23,'mm/dd'), SFlg, 0)) as \"FLG24\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+24,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT25\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+24,'mm/dd'), SFlg, 0)) as \"FLG25\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+25,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT26\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+25,'mm/dd'), SFlg, 0)) as \"FLG26\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+26,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT27\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+26,'mm/dd'), SFlg, 0)) as \"FLG27\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+27,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT28\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+27,'mm/dd'), SFlg, 0)) as \"FLG28\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+28,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT29\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+28,'mm/dd'), SFlg, 0)) as \"FLG29\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+29,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT30\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+29,'mm/dd'), SFlg, 0)) as \"FLG30\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+30,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT31\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+30,'mm/dd'), SFlg, 0)) as \"FLG31\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+31,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT32\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+31,'mm/dd'), SFlg, 0)) as \"FLG32\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+32,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT33\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+32,'mm/dd'), SFlg, 0)) as \"FLG33\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+33,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT34\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+33,'mm/dd'), SFlg, 0)) as \"FLG34\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+34,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT35\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+34,'mm/dd'), SFlg, 0)) as \"FLG35\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+35,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT36\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+35,'mm/dd'), SFlg, 0)) as \"FLG36\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+36,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT37\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+36,'mm/dd'), SFlg, 0)) as \"FLG37\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+37,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT38\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+37,'mm/dd'), SFlg, 0)) as \"FLG38\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+38,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT39\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+38,'mm/dd'), SFlg, 0)) as \"FLG39\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+39,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT40\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+39,'mm/dd'), SFlg, 0)) as \"FLG40\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+40,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT41\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+40,'mm/dd'), SFlg, 0)) as \"FLG41\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+41,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT42\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+41,'mm/dd'), SFlg, 0)) as \"FLG42\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+42,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT43\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+42,'mm/dd'), SFlg, 0)) as \"FLG43\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+43,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT44\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+43,'mm/dd'), SFlg, 0)) as \"FLG44\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+44,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT45\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+44,'mm/dd'), SFlg, 0)) as \"FLG45\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+45,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT46\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+45,'mm/dd'), SFlg, 0)) as \"FLG46\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+46,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT47\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+46,'mm/dd'), SFlg, 0)) as \"FLG47\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+47,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT48\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+47,'mm/dd'), SFlg, 0)) as \"FLG48\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+48,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT49\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+48,'mm/dd'), SFlg, 0)) as \"FLG49\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+49,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT50\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+49,'mm/dd'), SFlg, 0)) as \"FLG50\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+50,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT51\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+50,'mm/dd'), SFlg, 0)) as \"FLG51\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+51,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT52\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+51,'mm/dd'), SFlg, 0)) as \"FLG52\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+52,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT53\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+52,'mm/dd'), SFlg, 0)) as \"FLG53\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+53,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT54\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+53,'mm/dd'), SFlg, 0)) as \"FLG54\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+54,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT55\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+54,'mm/dd'), SFlg, 0)) as \"FLG55\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+55,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT56\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+55,'mm/dd'), SFlg, 0)) as \"FLG56\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+56,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT57\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+56,'mm/dd'), SFlg, 0)) as \"FLG57\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+57,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT58\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+57,'mm/dd'), SFlg, 0)) as \"FLG58\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+58,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT59\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+58,'mm/dd'), SFlg, 0)) as \"FLG59\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+59,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT60\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+59,'mm/dd'), SFlg, 0)) as \"FLG60\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+60,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT61\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+60,'mm/dd'), SFlg, 0)) as \"FLG61\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+61,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT62\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+61,'mm/dd'), SFlg, 0)) as \"FLG62\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+62,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT63\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+62,'mm/dd'), SFlg, 0)) as \"FLG63\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+63,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT64\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+63,'mm/dd'), SFlg, 0)) as \"FLG64\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+64,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT65\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+64,'mm/dd'), SFlg, 0)) as \"FLG65\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+65,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT66\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+65,'mm/dd'), SFlg, 0)) as \"FLG66\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+66,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT67\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+66,'mm/dd'), SFlg, 0)) as \"FLG67\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+67,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT68\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+67,'mm/dd'), SFlg, 0)) as \"FLG68\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+68,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT69\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+68,'mm/dd'), SFlg, 0)) as \"FLG69\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+69,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT70\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+69,'mm/dd'), SFlg, 0)) as \"FLG70\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+70,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT71\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+70,'mm/dd'), SFlg, 0)) as \"FLG71\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+71,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT72\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+71,'mm/dd'), SFlg, 0)) as \"FLG72\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+72,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT73\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+72,'mm/dd'), SFlg, 0)) as \"FLG73\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+73,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT74\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+73,'mm/dd'), SFlg, 0)) as \"FLG74\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+74,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT75\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+74,'mm/dd'), SFlg, 0)) as \"FLG75\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+75,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT76\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+75,'mm/dd'), SFlg, 0)) as \"FLG76\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+76,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT77\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+76,'mm/dd'), SFlg, 0)) as \"FLG77\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+77,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT78\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+77,'mm/dd'), SFlg, 0)) as \"FLG78\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+78,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT79\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+78,'mm/dd'), SFlg, 0)) as \"FLG79\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+79,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT80\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+79,'mm/dd'), SFlg, 0)) as \"FLG80\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+80,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT81\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+80,'mm/dd'), SFlg, 0)) as \"FLG81\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+81,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT82\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+81,'mm/dd'), SFlg, 0)) as \"FLG82\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+82,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT83\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+82,'mm/dd'), SFlg, 0)) as \"FLG83\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+83,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT84\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+83,'mm/dd'), SFlg, 0)) as \"FLG84\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+84,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT85\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+84,'mm/dd'), SFlg, 0)) as \"FLG85\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+85,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT86\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+85,'mm/dd'), SFlg, 0)) as \"FLG86\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+86,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT87\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+86,'mm/dd'), SFlg, 0)) as \"FLG87\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+87,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT88\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+87,'mm/dd'), SFlg, 0)) as \"FLG88\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+88,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT89\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+88,'mm/dd'), SFlg, 0)) as \"FLG89\", "
+"sum(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+89,'mm/dd'), ROUND((load_qty/NECK_PROC_CAPA)*100,0), 0)) as \"LOAD_PASENT90\", "
+"max(decode(TO_CHAR(\"LOAD_DATE\",'MM/DD'), to_char(to_date(?,'yyyy/mm/dd')+89,'mm/dd'), SFlg, 0)) as \"FLG90\" "
+" from  "
+"( "
+"select T_LOAD_DETAIL.LOAD_CD,M_RESOURCE.NECK_PROC_NAME,M_RESOURCE.NECK_PROC_CD,T_LOAD_DETAIL.LOAD_DATE, "
+"        T_LOAD_DETAIL.LOAD_QTY,M_RESOURCE.NECK_PROC_CAPA,0 as SFlg "
+" from   T_LOAD_DETAIL,  M_RESOURCE "
+" where  M_RESOURCE.NECK_PROC_CD = T_LOAD_DETAIL.NECK_PROC_CD "
+" and    T_LOAD_DETAIL.\"LOAD_DATE\" >= ? and T_LOAD_DETAIL.\"LOAD_DATE\" <= ? "
+" and    T_LOAD_DETAIL.\"PLANT_CD\" = ? "
+" and    M_RESOURCE.\"PLANT_CD\" = ? "
+"UNION "
+"select T_SIM_LOAD_DETAIL.LOAD_CD, M_RESOURCE.NECK_PROC_NAME,M_RESOURCE.NECK_PROC_CD, T_SIM_LOAD_DETAIL.LOAD_DATE, "
+"        T_SIM_LOAD_DETAIL.LOAD_QTY, M_RESOURCE.NECK_PROC_CAPA,1 as SFlg "
+" from   T_SIM_LOAD_DETAIL, M_RESOURCE "
+" where  M_RESOURCE.NECK_PROC_CD = T_SIM_LOAD_DETAIL.NECK_PROC_CD "
+" and    T_SIM_LOAD_DETAIL.\"LOAD_DATE\" >= ? and T_SIM_LOAD_DETAIL.\"LOAD_DATE\" <= ? "
+" and    T_SIM_LOAD_DETAIL.\"PLANT_CD\" = ? "
+" and    M_RESOURCE.\"PLANT_CD\" = ? "
+") "
+"group by NECK_PROC_CD,NECK_PROC_NAME "
+"order by NECK_PROC_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSim_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSim_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSim_read
			if(m_selcmd==null) throw new FoundationException("SelectSim", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectSim_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSim_read2
			if(m_selcmd==null) throw new FoundationException("SelectSim", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSim_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSim_read3
			if(m_selcmd==null) throw new FoundationException("SelectSim", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSim_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateTo());
				if(isNull(data.getDateTo())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getDateFrom());
				if(isNull(data.getDateFrom())) isNull = true;
				ary.addElement(data.getDateTo());
				if(isNull(data.getDateTo())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateTo(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateFrom(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDateTo(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setNECK_PROC_NAME( getString(1, rs) );
			data.setNECK_PROC_CD( getString(2, rs) );
			data.setLOAD_QTY1( getString(3, rs) );
			data.setFLG1( getString(4, rs) );
			data.setLOAD_QTY2( getString(5, rs) );
			data.setFLG2( getString(6, rs) );
			data.setLOAD_QTY3( getString(7, rs) );
			data.setFLG3( getString(8, rs) );
			data.setLOAD_QTY4( getString(9, rs) );
			data.setFLG4( getString(10, rs) );
			data.setLOAD_QTY5( getString(11, rs) );
			data.setFLG5( getString(12, rs) );
			data.setLOAD_QTY6( getString(13, rs) );
			data.setFLG6( getString(14, rs) );
			data.setLOAD_QTY7( getString(15, rs) );
			data.setFLG7( getString(16, rs) );
			data.setLOAD_QTY8( getString(17, rs) );
			data.setFLG8( getString(18, rs) );
			data.setLOAD_QTY9( getString(19, rs) );
			data.setFLG9( getString(20, rs) );
			data.setLOAD_QTY10( getString(21, rs) );
			data.setFLG10( getString(22, rs) );
			data.setLOAD_QTY11( getString(23, rs) );
			data.setFLG11( getString(24, rs) );
			data.setLOAD_QTY12( getString(25, rs) );
			data.setFLG12( getString(26, rs) );
			data.setLOAD_QTY13( getString(27, rs) );
			data.setFLG13( getString(28, rs) );
			data.setLOAD_QTY14( getString(29, rs) );
			data.setFLG14( getString(30, rs) );
			data.setLOAD_QTY15( getString(31, rs) );
			data.setFLG15( getString(32, rs) );
			data.setLOAD_QTY16( getString(33, rs) );
			data.setFLG16( getString(34, rs) );
			data.setLOAD_QTY17( getString(35, rs) );
			data.setFLG17( getString(36, rs) );
			data.setLOAD_QTY18( getString(37, rs) );
			data.setFLG18( getString(38, rs) );
			data.setLOAD_QTY19( getString(39, rs) );
			data.setFLG19( getString(40, rs) );
			data.setLOAD_QTY20( getString(41, rs) );
			data.setFLG20( getString(42, rs) );
			data.setLOAD_QTY21( getString(43, rs) );
			data.setFLG21( getString(44, rs) );
			data.setLOAD_QTY22( getString(45, rs) );
			data.setFLG22( getString(46, rs) );
			data.setLOAD_QTY23( getString(47, rs) );
			data.setFLG23( getString(48, rs) );
			data.setLOAD_QTY24( getString(49, rs) );
			data.setFLG24( getString(50, rs) );
			data.setLOAD_QTY25( getString(51, rs) );
			data.setFLG25( getString(52, rs) );
			data.setLOAD_QTY26( getString(53, rs) );
			data.setFLG26( getString(54, rs) );
			data.setLOAD_QTY27( getString(55, rs) );
			data.setFLG27( getString(56, rs) );
			data.setLOAD_QTY28( getString(57, rs) );
			data.setFLG28( getString(58, rs) );
			data.setLOAD_QTY29( getString(59, rs) );
			data.setFLG29( getString(60, rs) );
			data.setLOAD_QTY30( getString(61, rs) );
			data.setFLG30( getString(62, rs) );
			data.setLOAD_QTY31( getString(63, rs) );
			data.setFLG31( getString(64, rs) );
			data.setLOAD_QTY32( getString(65, rs) );
			data.setFLG32( getString(66, rs) );
			data.setLOAD_QTY33( getString(67, rs) );
			data.setFLG33( getString(68, rs) );
			data.setLOAD_QTY34( getString(69, rs) );
			data.setFLG34( getString(70, rs) );
			data.setLOAD_QTY35( getString(71, rs) );
			data.setFLG35( getString(72, rs) );
			data.setLOAD_QTY36( getString(73, rs) );
			data.setFLG36( getString(74, rs) );
			data.setLOAD_QTY37( getString(75, rs) );
			data.setFLG37( getString(76, rs) );
			data.setLOAD_QTY38( getString(77, rs) );
			data.setFLG38( getString(78, rs) );
			data.setLOAD_QTY39( getString(79, rs) );
			data.setFLG39( getString(80, rs) );
			data.setLOAD_QTY40( getString(81, rs) );
			data.setFLG40( getString(82, rs) );
			data.setLOAD_QTY41( getString(83, rs) );
			data.setFLG41( getString(84, rs) );
			data.setLOAD_QTY42( getString(85, rs) );
			data.setFLG42( getString(86, rs) );
			data.setLOAD_QTY43( getString(87, rs) );
			data.setFLG43( getString(88, rs) );
			data.setLOAD_QTY44( getString(89, rs) );
			data.setFLG44( getString(90, rs) );
			data.setLOAD_QTY45( getString(91, rs) );
			data.setFLG45( getString(92, rs) );
			data.setLOAD_QTY46( getString(93, rs) );
			data.setFLG46( getString(94, rs) );
			data.setLOAD_QTY47( getString(95, rs) );
			data.setFLG47( getString(96, rs) );
			data.setLOAD_QTY48( getString(97, rs) );
			data.setFLG48( getString(98, rs) );
			data.setLOAD_QTY49( getString(99, rs) );
			data.setFLG49( getString(100, rs) );
			data.setLOAD_QTY50( getString(101, rs) );
			data.setFLG50( getString(102, rs) );
			data.setLOAD_QTY51( getString(103, rs) );
			data.setFLG51( getString(104, rs) );
			data.setLOAD_QTY52( getString(105, rs) );
			data.setFLG52( getString(106, rs) );
			data.setLOAD_QTY53( getString(107, rs) );
			data.setFLG53( getString(108, rs) );
			data.setLOAD_QTY54( getString(109, rs) );
			data.setFLG54( getString(110, rs) );
			data.setLOAD_QTY55( getString(111, rs) );
			data.setFLG55( getString(112, rs) );
			data.setLOAD_QTY56( getString(113, rs) );
			data.setFLG56( getString(114, rs) );
			data.setLOAD_QTY57( getString(115, rs) );
			data.setFLG57( getString(116, rs) );
			data.setLOAD_QTY58( getString(117, rs) );
			data.setFLG58( getString(118, rs) );
			data.setLOAD_QTY59( getString(119, rs) );
			data.setFLG59( getString(120, rs) );
			data.setLOAD_QTY60( getString(121, rs) );
			data.setFLG60( getString(122, rs) );
			data.setLOAD_QTY61( getString(123, rs) );
			data.setFLG61( getString(124, rs) );
			data.setLOAD_QTY62( getString(125, rs) );
			data.setFLG62( getString(126, rs) );
			data.setLOAD_QTY63( getString(127, rs) );
			data.setFLG63( getString(128, rs) );
			data.setLOAD_QTY64( getString(129, rs) );
			data.setFLG64( getString(130, rs) );
			data.setLOAD_QTY65( getString(131, rs) );
			data.setFLG65( getString(132, rs) );
			data.setLOAD_QTY66( getString(133, rs) );
			data.setFLG66( getString(134, rs) );
			data.setLOAD_QTY67( getString(135, rs) );
			data.setFLG67( getString(136, rs) );
			data.setLOAD_QTY68( getString(137, rs) );
			data.setFLG68( getString(138, rs) );
			data.setLOAD_QTY69( getString(139, rs) );
			data.setFLG69( getString(140, rs) );
			data.setLOAD_QTY70( getString(141, rs) );
			data.setFLG70( getString(142, rs) );
			data.setLOAD_QTY71( getString(143, rs) );
			data.setFLG71( getString(144, rs) );
			data.setLOAD_QTY72( getString(145, rs) );
			data.setFLG72( getString(146, rs) );
			data.setLOAD_QTY73( getString(147, rs) );
			data.setFLG73( getString(148, rs) );
			data.setLOAD_QTY74( getString(149, rs) );
			data.setFLG74( getString(150, rs) );
			data.setLOAD_QTY75( getString(151, rs) );
			data.setFLG75( getString(152, rs) );
			data.setLOAD_QTY76( getString(153, rs) );
			data.setFLG76( getString(154, rs) );
			data.setLOAD_QTY77( getString(155, rs) );
			data.setFLG77( getString(156, rs) );
			data.setLOAD_QTY78( getString(157, rs) );
			data.setFLG78( getString(158, rs) );
			data.setLOAD_QTY79( getString(159, rs) );
			data.setFLG79( getString(160, rs) );
			data.setLOAD_QTY80( getString(161, rs) );
			data.setFLG80( getString(162, rs) );
			data.setLOAD_QTY81( getString(163, rs) );
			data.setFLG81( getString(164, rs) );
			data.setLOAD_QTY82( getString(165, rs) );
			data.setFLG82( getString(166, rs) );
			data.setLOAD_QTY83( getString(167, rs) );
			data.setFLG83( getString(168, rs) );
			data.setLOAD_QTY84( getString(169, rs) );
			data.setFLG84( getString(170, rs) );
			data.setLOAD_QTY85( getString(171, rs) );
			data.setFLG85( getString(172, rs) );
			data.setLOAD_QTY86( getString(173, rs) );
			data.setFLG86( getString(174, rs) );
			data.setLOAD_QTY87( getString(175, rs) );
			data.setFLG87( getString(176, rs) );
			data.setLOAD_QTY88( getString(177, rs) );
			data.setFLG88( getString(178, rs) );
			data.setLOAD_QTY89( getString(179, rs) );
			data.setFLG89( getString(180, rs) );
			data.setLOAD_QTY90( getString(181, rs) );
			data.setFLG90( getString(182, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSim", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSim_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectSim", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectSim_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSim_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSim_clear

			return;
		}

		/**
		 * SelectSimクラスの標準コンストラクタ
		 */
		public SelectSim()
		{
			//{{user_implement_dev:SelectSim_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSim_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectNeckCDSim extends DataObject
	{
		protected String m_selcmd = "select "
+"  LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  LOAD_DETAIL.\"LOAD_DATE\" as \"LOAD_DATE\", "
+"  LOAD_DETAIL.\"LOAD_QTY\" as \"LOAD_QTY\", "
+"  TO_CHAR(TYPE_VALUE.\"VALUE\") as \"ODR_STS_TYP\" "
+"from (select "
+"  T_LOAD_DETAIL.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  to_char(T_LOAD_DETAIL.\"LOAD_DATE\", 'yyyy/mm/dd') as \"LOAD_DATE\", "
+"  TO_CHAR(SUM(T_LOAD_DETAIL.\"LOAD_QTY\"), 'FM99999999999990.0999') as \"LOAD_QTY\", "
+"  T_LOAD_DETAIL.\"ODR_STS_TYP\" as \"ODR_STS_TYP\" "
+"  from  T_LOAD_DETAIL "
+"  where T_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"    and T_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"    and T_LOAD_DETAIL.\"LOAD_DATE\" >= to_date(?,'yyyy/mm/dd') - 20 "
+"    and T_LOAD_DETAIL.\"LOAD_DATE\" <= to_date(?,'yyyy/mm/dd') + 20 "
+"  group by "
+"    T_LOAD_DETAIL.\"PLANT_CD\", "
+"    T_LOAD_DETAIL.\"NECK_PROC_CD\", "
+"    T_LOAD_DETAIL.\"ODR_STS_TYP\", "
+"    to_char(T_LOAD_DETAIL.\"LOAD_DATE\",'yyyy/mm/dd') "
+"  UNION ALL "
+"  select "
+"    T_SIM_LOAD_DETAIL.\"PLANT_CD\" as \"PLANT_CD\", "
+"    T_SIM_LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"    to_char(T_SIM_LOAD_DETAIL.\"LOAD_DATE\", 'yyyy/mm/dd') as \"LOAD_DATE\", "
+"    TO_CHAR(SUM(T_SIM_LOAD_DETAIL.\"LOAD_QTY\"), 'FM99999999999990.0999') as \"LOAD_QTY\", "
+"    0 as \"ODR_STS_TYP\" "
+"  from  T_SIM_LOAD_DETAIL "
+"  where T_SIM_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"    and T_SIM_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"    and T_SIM_LOAD_DETAIL.\"LOAD_DATE\" >= to_date(?,'yyyy/mm/dd') - 20 "
+"    and T_SIM_LOAD_DETAIL.\"LOAD_DATE\" <= to_date(?,'yyyy/mm/dd') + 20 "
+"  group by "
+"    T_SIM_LOAD_DETAIL.\"PLANT_CD\", "
+"    T_SIM_LOAD_DETAIL.\"NECK_PROC_CD\", "
+"    to_char(T_SIM_LOAD_DETAIL.\"LOAD_DATE\",'yyyy/mm/dd') "
+"  ) LOAD_DETAIL, "
+"  (SELECT VALUE,DISPLAY_NAME FROM SYS_TYPE_VALUE WHERE NAME = 'LOAD_ODR_STS_TYP') TYPE_VALUE "
+"where "
+"  LOAD_DETAIL.\"ODR_STS_TYP\" = TYPE_VALUE.\"VALUE\" "
+"order by "
+"  LOAD_DETAIL.\"NECK_PROC_CD\", "
+"  LOAD_DETAIL.\"LOAD_DATE\", "
+"  LOAD_DETAIL.\"ODR_STS_TYP\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNeckCDSim_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectNeckCDSim_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckCDSim_read
			if(m_selcmd==null) throw new FoundationException("SelectNeckCDSim", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectNeckCDSim_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckCDSim_read2
			if(m_selcmd==null) throw new FoundationException("SelectNeckCDSim", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckCDSim_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckCDSim_read3
			if(m_selcmd==null) throw new FoundationException("SelectNeckCDSim", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckCDSim_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getK_LOAD_DATE());
				if(isNull(data.getK_LOAD_DATE())) isNull = true;
				ary.addElement(data.getK_LOAD_DATE());
				if(isNull(data.getK_LOAD_DATE())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getK_LOAD_DATE());
				if(isNull(data.getK_LOAD_DATE())) isNull = true;
				ary.addElement(data.getK_LOAD_DATE());
				if(isNull(data.getK_LOAD_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_LOAD_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_LOAD_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_LOAD_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_LOAD_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setL_NECK_PROC_CD( getString(1, rs) );
			data.setL_LOAD_DATE( getString(2, rs) );
			data.setL_LOAD_QTY( getString(3, rs) );
			data.setL_ODR_STS_TYP( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNeckCDSim", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckCDSim_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectNeckCDSim", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectNeckCDSim_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNeckCDSim_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectNeckCDSim_clear

			return;
		}

		/**
		 * SelectNeckCDSimクラスの標準コンストラクタ
		 */
		public SelectNeckCDSim()
		{
			//{{user_implement_dev:SelectNeckCDSim_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectNeckCDSim_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectNeckDetailSim extends DataObject
	{
		protected String m_selcmd = "select "
+"  LOAD_DETAIL.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  LOAD_DETAIL.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  TO_CHAR(TYPE_VALUE.\"VALUE\") as \"ODR_STS_TYP\", "
+"  LOAD_DETAIL.\"PRD_START_DATE\" as \"PRD_START_DATE\", "
+"  LOAD_DETAIL.\"PRD_DUE_DATE\" as \"PRD_DUE_DATE\", "
+"  LOAD_DETAIL.\"ODR_QTY\" as \"ODR_QTY\", "
+"  LOAD_DETAIL.\"TOTAL_RCV_QTY\" as \"TOTAL_RCV_QTY\", "
+"  to_char(M_NECK_WS.\"UNIT_LOAD\", 'FM9990.09') as \"UNIT_LOAD\", "
+"  LOAD_DETAIL.\"LOAD_QTY\" as \"LOAD_QTY\" "
+"from "
+"( "
+"select "
+"  T_LOAD_DETAIL.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  T_LOAD_DETAIL.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_LOAD_DETAIL.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  to_char(T_LOAD_DETAIL.\"ODR_STS_TYP\") as \"ODR_STS_TYP\", "
+"  to_char(T_LOAD_DETAIL.\"PRD_START_DATE\", 'yyyy/mm/dd') as \"PRD_START_DATE\", "
+"  to_char(T_LOAD_DETAIL.\"PRD_DUE_DATE\", 'yyyy/mm/dd') as \"PRD_DUE_DATE\", "
+"  to_char(T_LOAD_DETAIL.\"ODR_QTY\", 'FM99999999999990.0999') as \"ODR_QTY\", "
+"  to_char(T_LOAD_DETAIL.\"TOTAL_RCV_QTY\", 'FM99999999999990.0999') as \"TOTAL_RCV_QTY\", "
+"  to_char(T_LOAD_DETAIL.\"LOAD_QTY\", 'FM999999999999999990.099999') as \"LOAD_QTY\" "
+"from "
+"  T_LOAD_DETAIL "
+"where T_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"  and T_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"  and T_LOAD_DETAIL.\"LOAD_DATE\" = to_date(?, 'yyyy/MM/dd') "
+"UNION ALL "
+"select "
+"  T_SIM_LOAD_DETAIL.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_SIM_LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  T_SIM_LOAD_DETAIL.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_SIM_LOAD_DETAIL.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  '0' as \"ODR_STS_TYP\", "
+"  to_char(T_SIM_LOAD_DETAIL.\"PRD_START_DATE\", 'yyyy/mm/dd') as \"PRD_START_DATE\", "
+"  to_char(T_SIM_LOAD_DETAIL.\"PRD_DUE_DATE\", 'yyyy/mm/dd') as \"PRD_DUE_DATE\", "
+"  to_char(T_SIM_LOAD_DETAIL.\"ODR_QTY\", 'FM99999999999990.0999') as \"ODR_QTY\", "
+"  to_char(0, 'FM99999999999990.0999') as \"TOTAL_RCV_QTY\", "
+"  to_char(T_SIM_LOAD_DETAIL.\"LOAD_QTY\", 'FM999999999999999990.099999') as \"LOAD_QTY\" "
+"from "
+"  T_SIM_LOAD_DETAIL "
+"where T_SIM_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"  and T_SIM_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"  and T_SIM_LOAD_DETAIL.\"LOAD_DATE\" = to_date(?, 'yyyy/MM/dd') "
+") LOAD_DETAIL, "
+"  M_ITEM, "
+"  M_NECK_WS, "
+"  (SELECT VALUE,DISPLAY_NAME FROM SYS_TYPE_VALUE WHERE NAME = 'LOAD_ODR_STS_TYP') TYPE_VALUE "
+"where LOAD_DETAIL.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and LOAD_DETAIL.PLANT_CD = M_NECK_WS.PLANT_CD(+) "
+"  and LOAD_DETAIL.ITEM_CD = M_NECK_WS.ITEM_CD(+) "
+"  and LOAD_DETAIL.NECK_PROC_CD = M_NECK_WS.NECK_PROC_CD(+) "
+"  and LOAD_DETAIL.\"ODR_STS_TYP\" = TYPE_VALUE.\"VALUE\" "
+"order by "
+"  LOAD_DETAIL.\"PRD_START_DATE\", "
+"  LOAD_DETAIL.\"PRD_DUE_DATE\", "
+"  LOAD_DETAIL.\"ODR_STS_TYP\", "
+"  LOAD_DETAIL.\"ITEM_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNeckDetailSim_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectNeckDetailSim_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDetailSim_read
			if(m_selcmd==null) throw new FoundationException("SelectNeckDetailSim", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectNeckDetailSim_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDetailSim_read2
			if(m_selcmd==null) throw new FoundationException("SelectNeckDetailSim", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckDetailSim_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDetailSim_read3
			if(m_selcmd==null) throw new FoundationException("SelectNeckDetailSim", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckDetailSim_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getKM_LOAD_DATE());
				if(isNull(data.getKM_LOAD_DATE())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getKM_LOAD_DATE());
				if(isNull(data.getKM_LOAD_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getKM_LOAD_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getKM_LOAD_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setLKM_ITEM_CD( getString(1, rs) );
			data.setLKM_ITEM_NAME( getString(2, rs) );
			data.setLKM_JOB_ODR_CD( getString(3, rs) );
			data.setLKM_ODR_STS_TYP( getString(4, rs) );
			data.setLKM_PRD_START_DATE( getString(5, rs) );
			data.setLKM_PRD_DUE_DATE( getString(6, rs) );
			data.setLKM_ODR_QTY( getString(7, rs) );
			data.setLKM_TOTAL_RCV_QTY( getString(8, rs) );
			data.setLKM_UNIT_LOAD( getString(9, rs) );
			data.setLKM_LOAD_QTY( getString(10, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNeckDetailSim", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDetailSim_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectNeckDetailSim", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectNeckDetailSim_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNeckDetailSim_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectNeckDetailSim_clear

			return;
		}

		/**
		 * SelectNeckDetailSimクラスの標準コンストラクタ
		 */
		public SelectNeckDetailSim()
		{
			//{{user_implement_dev:SelectNeckDetailSim_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectNeckDetailSim_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectNeckDtHdSim extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(SUM(LOAD_DETAIL.\"SUM_LOAD_QTY\"), 'FM99999999999999999990.099999') as \"SUM_LOAD_QTY\", "
+"  to_char(SUM(LOAD_DETAIL.\"SUM_LOAD_QTY\") - M_RESOURCE.\"NECK_PROC_CAPA\", 'FM99999999999999999990.099999') as \"OVR_LOAD_QTY\", "
+"  LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  LOAD_DETAIL.\"LOAD_DATE\" as \"LOAD_DATE\", "
+"  M_RESOURCE.\"NECK_PROC_NAME\" as \"NECK_PROC_NAME\", "
+"  to_char(M_RESOURCE.\"NECK_PROC_CAPA\", 'FM99999990.09') as \"NECK_PROC_CAPA\", "
+"  M_RESOURCE.\"NECK_PROC_CAPA_UNIT\" as \"NECK_PROC_CAPA_UNIT\" "
+"from "
+"( "
+"select "
+"  T_LOAD_DETAIL.\"PLANT_CD\" as \"PLANT_CD\", "
+"  SUM(T_LOAD_DETAIL.\"LOAD_QTY\") as \"SUM_LOAD_QTY\", "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  to_char(T_LOAD_DETAIL.\"LOAD_DATE\", 'yyyy/mm/dd') as \"LOAD_DATE\" "
+"from "
+"  T_LOAD_DETAIL "
+"where T_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"  and T_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"  and T_LOAD_DETAIL.\"LOAD_DATE\" = to_date(?, 'yyyy/mm/dd') "
+"group by "
+"  T_LOAD_DETAIL.\"LOAD_DATE\", "
+"  T_LOAD_DETAIL.\"NECK_PROC_CD\", "
+"  T_LOAD_DETAIL.\"PLANT_CD\" "
+"UNION ALL "
+"select "
+"  T_SIM_LOAD_DETAIL.\"PLANT_CD\" as \"PLANT_CD\", "
+"  SUM(T_SIM_LOAD_DETAIL.\"LOAD_QTY\") as \"SUM_LOAD_QTY\", "
+"  T_SIM_LOAD_DETAIL.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  to_char(T_SIM_LOAD_DETAIL.\"LOAD_DATE\", 'yyyy/mm/dd') as \"LOAD_DATE\" "
+"from "
+"  T_SIM_LOAD_DETAIL "
+"where T_SIM_LOAD_DETAIL.\"PLANT_CD\" = ? "
+"  and T_SIM_LOAD_DETAIL.\"NECK_PROC_CD\" = ? "
+"  and T_SIM_LOAD_DETAIL.\"LOAD_DATE\" = to_date(?, 'yyyy/mm/dd') "
+"group by "
+"  T_SIM_LOAD_DETAIL.\"LOAD_DATE\", "
+"  T_SIM_LOAD_DETAIL.\"NECK_PROC_CD\", "
+"  T_SIM_LOAD_DETAIL.\"PLANT_CD\" "
+") LOAD_DETAIL, "
+"  M_RESOURCE "
+"where "
+"  LOAD_DETAIL.PLANT_CD = M_RESOURCE.PLANT_CD(+) "
+"  and LOAD_DETAIL.NECK_PROC_CD = M_RESOURCE.NECK_PROC_CD(+) "
+"group by "
+"  M_RESOURCE.\"NECK_PROC_CAPA\", "
+"  M_RESOURCE.\"NECK_PROC_CAPA_UNIT\", "
+"  M_RESOURCE.\"NECK_PROC_CD\", "
+"  M_RESOURCE.\"NECK_PROC_NAME\", "
+"  M_RESOURCE.\"PLANT_CD\", "
+"  LOAD_DETAIL.\"LOAD_DATE\", "
+"  LOAD_DETAIL.\"NECK_PROC_CD\", "
+"  LOAD_DETAIL.\"PLANT_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNeckDtHdSim_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectNeckDtHdSim_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDtHdSim_read
			if(m_selcmd==null) throw new FoundationException("SelectNeckDtHdSim", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectNeckDtHdSim_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDtHdSim_read2
			if(m_selcmd==null) throw new FoundationException("SelectNeckDtHdSim", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckDtHdSim_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDtHdSim_read3
			if(m_selcmd==null) throw new FoundationException("SelectNeckDtHdSim", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectNeckDtHdSim_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getKM_LOAD_DATE());
				if(isNull(data.getKM_LOAD_DATE())) isNull = true;
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;
				ary.addElement(data.getKM_LOAD_DATE());
				if(isNull(data.getKM_LOAD_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getKM_LOAD_DATE(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getKM_LOAD_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setLKM_SUM_LOAD_QTY( getString(1, rs) );
			data.setLKM_OVR_LOAD_QTY( getString(2, rs) );
			data.setLKM_NECK_PROC_CD( getString(3, rs) );
			data.setLKM_LOAD_DATE( getString(4, rs) );
			data.setLKM_NECK_PROC_NAME( getString(5, rs) );
			data.setLKM_NECK_PROC_CAPA( getString(6, rs) );
			data.setLKM_NECK_PROC_CAPA_UNIT( getString(7, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNeckDtHdSim", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeckDtHdSim_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectNeckDtHdSim", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectNeckDtHdSim_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNeckDtHdSim_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectNeckDtHdSim_clear

			return;
		}

		/**
		 * SelectNeckDtHdSimクラスの標準コンストラクタ
		 */
		public SelectNeckDtHdSim()
		{
			//{{user_implement_dev:SelectNeckDtHdSim_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectNeckDtHdSim_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectResource extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_RESOURCE.\"NECK_PROC_CD\" as \"NECK_PROC_CD\", "
+"  M_RESOURCE.\"NECK_PROC_NAME\" as \"NECK_PROC_NAME\", "
+"  to_char(M_RESOURCE.\"NECK_PROC_CAPA\", 'FM99999990.09') as \"NECK_PROC_CAPA\", "
+"  M_RESOURCE.\"NECK_PROC_CAPA_UNIT\" as \"NECK_PROC_CAPA_UNIT\" "
+"from "
+"  M_RESOURCE "
+"where "
+"  M_RESOURCE.\"PLANT_CD\" = ? "
+"  and M_RESOURCE.\"NECK_PROC_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectResource_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectResource_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectResource_read
			if(m_selcmd==null) throw new FoundationException("SelectResource", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectResource_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectResource_read2
			if(m_selcmd==null) throw new FoundationException("SelectResource", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectResource_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectResource_read3
			if(m_selcmd==null) throw new FoundationException("SelectResource", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectResource_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;
				ary.addElement(data.getK_NECK_PROC_CD());
				if(isNull(data.getK_NECK_PROC_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getK_NECK_PROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setL_NECK_PROC_CD( getString(1, rs) );
			data.setL_NECK_PROC_NAME( getString(2, rs) );
			data.setL_NECK_PROC_CAPA( getString(3, rs) );
			data.setL_NECK_PROC_CAPA_UNIT( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectResource", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectResource_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectResource", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectResource_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectResource_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectResource_clear

			return;
		}

		/**
		 * SelectResourceクラスの標準コンストラクタ
		 */
		public SelectResource()
		{
			//{{user_implement_dev:SelectResource_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectResource_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSysDateCtrl extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'yyyy/mm/dd') as \"DATE_FROM\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\" + 89, 'yyyy/mm/dd') as \"DATE_TO\" "
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

		//{{user_implement_dev:SelectSysDateCtrl_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSysDateCtrl_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSysDateCtrl_read
			if(m_selcmd==null) throw new FoundationException("SelectSysDateCtrl", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectSysDateCtrl_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSysDateCtrl_read2
			if(m_selcmd==null) throw new FoundationException("SelectSysDateCtrl", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSysDateCtrl_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSysDateCtrl_read3
			if(m_selcmd==null) throw new FoundationException("SelectSysDateCtrl", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSysDateCtrl_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getK_PLANT_CD());
				if(isNull(data.getK_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getK_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setDateFrom( getString(1, rs) );
			data.setDateTo( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSysDateCtrl", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSysDateCtrl_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectSysDateCtrl", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectSysDateCtrl_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSysDateCtrl_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSysDateCtrl_clear

			return;
		}

		/**
		 * SelectSysDateCtrlクラスの標準コンストラクタ
		 */
		public SelectSysDateCtrl()
		{
			//{{user_implement_dev:SelectSysDateCtrl_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSysDateCtrl_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSysInstallOptions extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_INSTALL_OPTIONS.\"INSTALL_FLG\" as \"INSTALL_FLG\" "
+"from "
+"  SYS_INSTALL_OPTIONS "
+"where "
+"  SYS_INSTALL_OPTIONS.\"OPTION_ID\" = 'AL'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSysInstallOptions_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSysInstallOptions_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AL0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AL0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSysInstallOptions_read
			if(m_selcmd==null) throw new FoundationException("SelectSysInstallOptions", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectSysInstallOptions_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSysInstallOptions_read2
			if(m_selcmd==null) throw new FoundationException("SelectSysInstallOptions", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSysInstallOptions_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AL0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSysInstallOptions_read3
			if(m_selcmd==null) throw new FoundationException("SelectSysInstallOptions", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSysInstallOptions_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AL0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AL0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AL0040010Struct data = new AL0040010Struct();

			data.setw_AlInstalledFlg( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSysInstallOptions", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AL0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AL0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSysInstallOptions_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("SelectSysInstallOptions", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:SelectSysInstallOptions_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AL0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSysInstallOptions_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSysInstallOptions_clear

			return;
		}

		/**
		 * SelectSysInstallOptionsクラスの標準コンストラクタ
		 */
		public SelectSysInstallOptions()
		{
			//{{user_implement_dev:SelectSysInstallOptions_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSysInstallOptions_constractor

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
		mSelectDate.clear();
		mSelectDate = null;
		mSelectNeckCD.clear();
		mSelectNeckCD = null;
		mSelectChartPara.clear();
		mSelectChartPara = null;
		mSelectNeckDetail.clear();
		mSelectNeckDetail = null;
		mSelectNeckDtHd.clear();
		mSelectNeckDtHd = null;
		mSelectSim.clear();
		mSelectSim = null;
		mSelectNeckCDSim.clear();
		mSelectNeckCDSim = null;
		mSelectNeckDetailSim.clear();
		mSelectNeckDetailSim = null;
		mSelectNeckDtHdSim.clear();
		mSelectNeckDtHdSim = null;
		mSelectResource.clear();
		mSelectResource = null;
		mSelectSysDateCtrl.clear();
		mSelectSysDateCtrl = null;
		mSelectSysInstallOptions.clear();
		mSelectSysInstallOptions = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AL0040010クラスの標準コンストラクタ
	 */
	public AL0040010Entity() throws FoundationException
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
