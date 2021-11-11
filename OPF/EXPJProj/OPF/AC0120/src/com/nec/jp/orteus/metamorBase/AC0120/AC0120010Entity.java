/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0120/src/com/nec/jp/orteus/metamorBase/AC0120/AC0120010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0120;

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

public class AC0120010Entity extends DataObject
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

	// Rootクラス インスタンス
	public Root mRoot = new Root();

	// Nodeクラス インスタンス
	public Node mNode = new Node();

	// Detailクラス インスタンス
	public Detail mDetail = new Detail();

	// SelectSub1Headerクラス インスタンス
	public SelectSub1Header mSelectSub1Header = new SelectSub1Header();

	// SelectSub1クラス インスタンス
	public SelectSub1 mSelectSub1 = new SelectSub1();

	// InsertT_ODクラス インスタンス
	public InsertT_OD mInsertT_OD = new InsertT_OD();

	// UpdateT_ODクラス インスタンス
	public UpdateT_OD mUpdateT_OD = new UpdateT_OD();

	// SelectSub1Formクラス インスタンス
	public SelectSub1Form mSelectSub1Form = new SelectSub1Form();

	// checkSubOdRead1クラス インスタンス
	public checkSubOdRead1 mcheckSubOdRead1 = new checkSubOdRead1();

	// checkSubOdRead2クラス インスタンス
	public checkSubOdRead2 mcheckSubOdRead2 = new checkSubOdRead2();

	// checkSubOdRead3クラス インスタンス
	public checkSubOdRead3 mcheckSubOdRead3 = new checkSubOdRead3();

	// checkT_ITEMクラス インスタンス
	public checkT_ITEM mcheckT_ITEM = new checkT_ITEM();

	// checkT_OD1クラス インスタンス
	public checkT_OD1 mcheckT_OD1 = new checkT_OD1();

	// checkSubOdRead4クラス インスタンス
	public checkSubOdRead4 mcheckSubOdRead4 = new checkSubOdRead4();

	// SelectChildクラス インスタンス
	public SelectChild mSelectChild = new SelectChild();

	// DeleteT_ODクラス インスタンス
	public DeleteT_OD mDeleteT_OD = new DeleteT_OD();

	// checkM_PROC_GRPクラス インスタンス
	public checkM_PROC_GRP mcheckM_PROC_GRP = new checkM_PROC_GRP();

	// checkM_PUCH_UNIT_COSTクラス インスタンス
	public checkM_PUCH_UNIT_COST mcheckM_PUCH_UNIT_COST = new checkM_PUCH_UNIT_COST();

	// updateChildクラス インスタンス
	public updateChild mupdateChild = new updateChild();

	// updateChildGijiクラス インスタンス
	public updateChildGiji mupdateChildGiji = new updateChildGiji();

	// updateT_OD2クラス インスタンス
	public updateT_OD2 mupdateT_OD2 = new updateT_OD2();

	// updateT_OD3クラス インスタンス
	public updateT_OD3 mupdateT_OD3 = new updateT_OD3();

	// selectM_CALクラス インスタンス
	public selectM_CAL mselectM_CAL = new selectM_CAL();

	// selectM_PLANTクラス インスタンス
	public selectM_PLANT mselectM_PLANT = new selectM_PLANT();

	// selectSYS_OD_CALC_CTRLクラス インスタンス
	public selectSYS_OD_CALC_CTRL mselectSYS_OD_CALC_CTRL = new selectSYS_OD_CALC_CTRL();

	// SELECT_TIME_CTRLクラス インスタンス
	public SELECT_TIME_CTRL mSELECT_TIME_CTRL = new SELECT_TIME_CTRL();

	// selectJOB_ODR_ALC_CDクラス インスタンス
	public selectJOB_ODR_ALC_CD mselectJOB_ODR_ALC_CD = new selectJOB_ODR_ALC_CD();

	// checkSYS_JOB_OD_CALC_CTRLクラス インスタンス
	public checkSYS_JOB_OD_CALC_CTRL mcheckSYS_JOB_OD_CALC_CTRL = new checkSYS_JOB_OD_CALC_CTRL();

	// T_WORK_IN_PROC_BY_ITEMクラス インスタンス
	public T_WORK_IN_PROC_BY_ITEM mT_WORK_IN_PROC_BY_ITEM = new T_WORK_IN_PROC_BY_ITEM();

	// CHK_T_RLSD_PUCH_ODRクラス インスタンス
	public CHK_T_RLSD_PUCH_ODR mCHK_T_RLSD_PUCH_ODR = new CHK_T_RLSD_PUCH_ODR();

	// CHK_T_RCV_ISSUEクラス インスタンス
	public CHK_T_RCV_ISSUE mCHK_T_RCV_ISSUE = new CHK_T_RCV_ISSUE();

	// Sub1T_ODクラス インスタンス
	public Sub1T_OD mSub1T_OD = new Sub1T_OD();

	// CHK_T_WORK_IN_PROC_BY_PROCクラス インスタンス
	public CHK_T_WORK_IN_PROC_BY_PROC mCHK_T_WORK_IN_PROC_BY_PROC = new CHK_T_WORK_IN_PROC_BY_PROC();

	// CHK_T_OPR_RSLTクラス インスタンス
	public CHK_T_OPR_RSLT mCHK_T_OPR_RSLT = new CHK_T_OPR_RSLT();

	// CHK_RLSDクラス インスタンス
	public CHK_RLSD mCHK_RLSD = new CHK_RLSD();

	// chkT_ACPT_RSLTクラス インスタンス
	public chkT_ACPT_RSLT mchkT_ACPT_RSLT = new chkT_ACPT_RSLT();

	// InsertT_OD1クラス インスタンス
	public InsertT_OD1 mInsertT_OD1 = new InsertT_OD1();

	// InsertT_ISSUE_INSTクラス インスタンス
	public InsertT_ISSUE_INST mInsertT_ISSUE_INST = new InsertT_ISSUE_INST();

	// selectPUCH_ODR_CDクラス インスタンス
	public selectPUCH_ODR_CD mselectPUCH_ODR_CD = new selectPUCH_ODR_CD();

	// selectWH_CDクラス インスタンス
	public selectWH_CD mselectWH_CD = new selectWH_CD();

	// mInsertT_ISSUE_INST1クラス インスタンス
	public mInsertT_ISSUE_INST1 mmInsertT_ISSUE_INST1 = new mInsertT_ISSUE_INST1();

	// chkM_CONS_UNIT_COSTクラス インスタンス
	public chkM_CONS_UNIT_COST mchkM_CONS_UNIT_COST = new chkM_CONS_UNIT_COST();

	// selectinWH_CDクラス インスタンス
	public selectinWH_CD mselectinWH_CD = new selectinWH_CD();

	// SYS_PARAMETERクラス インスタンス
	public SYS_PARAMETER mSYS_PARAMETER = new SYS_PARAMETER();

	// insertT_WORK_IN_PROC_BY_ITEMクラス インスタンス
	public insertT_WORK_IN_PROC_BY_ITEM minsertT_WORK_IN_PROC_BY_ITEM = new insertT_WORK_IN_PROC_BY_ITEM();

	// insertT_RLSD_PUCH_ODRクラス インスタンス
	public insertT_RLSD_PUCH_ODR minsertT_RLSD_PUCH_ODR = new insertT_RLSD_PUCH_ODR();

	// selectRCV_WH1クラス インスタンス
	public selectRCV_WH1 mselectRCV_WH1 = new selectRCV_WH1();

	// selectRCV_WH2クラス インスタンス
	public selectRCV_WH2 mselectRCV_WH2 = new selectRCV_WH2();

	// selectRCV_WH3クラス インスタンス
	public selectRCV_WH3 mselectRCV_WH3 = new selectRCV_WH3();

	// deleteT_ISSUE_INSTクラス インスタンス
	public deleteT_ISSUE_INST mdeleteT_ISSUE_INST = new deleteT_ISSUE_INST();

	// deleteT_RLSD_PUCH_ODRクラス インスタンス
	public deleteT_RLSD_PUCH_ODR mdeleteT_RLSD_PUCH_ODR = new deleteT_RLSD_PUCH_ODR();

	// deleteT_WORK_IN_PROC_BY_ITEMクラス インスタンス
	public deleteT_WORK_IN_PROC_BY_ITEM mdeleteT_WORK_IN_PROC_BY_ITEM = new deleteT_WORK_IN_PROC_BY_ITEM();

	// selectPVEND_CDクラス インスタンス
	public selectPVEND_CD mselectPVEND_CD = new selectPVEND_CD();

	// selOWN_PERSON_NAMEクラス インスタンス
	public selOWN_PERSON_NAME mselOWN_PERSON_NAME = new selOWN_PERSON_NAME();

	// SYS_BAT_PARMクラス インスタンス
	public SYS_BAT_PARM mSYS_BAT_PARM = new SYS_BAT_PARM();

	// callSQLCALCTAXCALCAMTFDクラス インスタンス
	public callSQLCALCTAXCALCAMTFD mcallSQLCALCTAXCALCAMTFD = new callSQLCALCTAXCALCAMTFD();

	// selectM_ITEMクラス インスタンス
	public selectM_ITEM mselectM_ITEM = new selectM_ITEM();

	// deleteT_OD1クラス インスタンス
	public deleteT_OD1 mdeleteT_OD1 = new deleteT_OD1();

	// csvPdataクラス インスタンス
	public csvPdata mcsvPdata = new csvPdata();

	// csvCdataクラス インスタンス
	public csvCdata mcsvCdata = new csvCdata();

	// checkT_WORK_IN_PROC_BY_PROCクラス インスタンス
	public checkT_WORK_IN_PROC_BY_PROC mcheckT_WORK_IN_PROC_BY_PROC = new checkT_WORK_IN_PROC_BY_PROC();

	// delT_WORK_IN_PROC_BY_PROCクラス インスタンス
	public delT_WORK_IN_PROC_BY_PROC mdelT_WORK_IN_PROC_BY_PROC = new delT_WORK_IN_PROC_BY_PROC();


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
		String m_write_fname="AC0120010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AC0120010";

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
	public class Root extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"OD_NO\" as \"OD_NO\", "
+"  T_OD.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  to_char(T_OD.\"OD_TYP\") as \"OD_TYP\", "
+"  to_char(T_OD.\"ODR_STS_TYP\") as \"ODR_STS_TYP\", "
+"  to_char(T_OD.\"DM_STS_TYP\") as \"DM_STS_TYP\", "
+"  to_char(T_OD.\"MRP_ODR_TYP\") as \"MRP_ODR_TYP\", "
+"  to_char(T_OD.\"MRP_TYP\") as \"MRP_TYP\", "
+"  to_char(T_OD.\"OUTSIDE_TYP\") as \"OUTSIDE_TYP\", "
+"  to_char(T_JOB_ODR.\"JOB_ODR_STS_TYP\") as \"JOB_ODR_STS_TYP\", "
+"  to_char(T_JOB_ODR.\"JOB_ODR_EXP_TYP\") as \"JOB_ODR_EXP_TYP\", "
+"  to_char(T_OD.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  to_char(M_ITEM.\"MANHOUR_TYP\") as \"MANHOUR_TYP\", "
+"  to_char(T_OD.\"TOTAL_RCV_QTY\") as \"TOTAL_RCV_QTY\", "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\") as \"TOTAL_ISSUE_QTY\" "
+"from "
+"  T_OD, "
+"  T_JOB_ODR, "
+"  M_ITEM "
+"where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.\"PLANT_CD\" = T_JOB_ODR.\"PLANT_CD\" "
+"  and T_OD.\"JOB_ODR_CD\" = T_JOB_ODR.\"JOB_ODR_CD\" "
+"  and T_OD.\"JOB_ODR_DETAIL_NO\" = T_JOB_ODR.\"JOB_ODR_DETAIL_NO\" "
+"  and T_OD.\"JOB_ODR_CANCEL_NO\" = T_JOB_ODR.\"JOB_ODR_CANCEL_NO\" "
+"  and T_OD.\"JOB_ODR_CD\" = ? "
+"  and T_OD.\"JOB_ODR_DETAIL_NO\" = 0 "
+"  and T_OD.\"JOB_ODR_CANCEL_NO\" = to_number(?) "
+"  and T_OD.\"PARENT_OD_NO\" is null "
+"order by "
+"  T_OD.\"ITEM_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Root_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Root_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Root_read
			if(m_selcmd==null) throw new FoundationException("Root", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:Root_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Root_read2
			if(m_selcmd==null) throw new FoundationException("Root", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Root_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Root_read3
			if(m_selcmd==null) throw new FoundationException("Root", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Root_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setOD_NO( getString(1, rs) );
			data.setPLANT_CD( getString(2, rs) );
			data.setITEM_CD( getString(3, rs) );
			data.setITEM_NAME( getString(4, rs) );
			data.setOD_TYP( getString(5, rs) );
			data.setODR_STS_TYP( getString(6, rs) );
			data.setDM_STS_TYP( getString(7, rs) );
			data.setMRP_ODR_TYP( getString(8, rs) );
			data.setMRP_TYP( getString(9, rs) );
			data.setSub1_OUTSIDE_TYP( getString(10, rs) );
			data.setJOB_ODR_STS_TYP( getString(11, rs) );
			data.setJOB_ODR_EXP_TYP( getString(12, rs) );
			data.setMODIFY_COUNT( getString(13, rs) );
			data.setMANHOUR_TYP( getString(14, rs) );
			data.setTOTAL_RCV_QTY( getString(15, rs) );
			data.setTOTAL_ISSUE_QTY( getString(16, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Root", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Root_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("Root", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:Root_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Root_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Root_clear

			return;
		}

		/**
		 * Rootクラスの標準コンストラクタ
		 */
		public Root()
		{
			//{{user_implement_dev:Root_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Root_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class Node extends DataObject
	{
		protected String m_selcmd = "select distinct "
+"  T_OD.\"OD_NO\" as \"OD_NO\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  to_char(T_OD.\"OD_TYP\") as \"OD_TYP\", "
+"  to_char(T_OD.\"ODR_STS_TYP\") as \"ODR_STS_TYP\", "
+"  to_char(T_OD.\"DM_STS_TYP\") as \"DM_STS_TYP\", "
+"  to_char(T_OD.\"MRP_ODR_TYP\") as \"MRP_ODR_TYP\", "
+"  to_char(T_OD.\"MRP_TYP\") as \"MRP_TYP\", "
+"  to_char(T_OD.\"OUTSIDE_TYP\") as \"OUTSIDE_TYP\", "
+"  to_char(T_JOB_ODR.\"JOB_ODR_STS_TYP\") as \"JOB_ODR_STS_TYP\", "
+"  to_char(T_OD.\"PARENT_OD_NO\") as \"PARENT_OD_NO\", "
+"  to_char(T_OD.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  to_char(M_ITEM.\"MANHOUR_TYP\") as \"MANHOUR_TYP\", "
+"  to_char(T_OD.\"TOTAL_RCV_QTY\") as \"TOTAL_RCV_QTY\", "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\") as \"TOTAL_ISSUE_QTY\", "
+"  decode(T1.\"OD_NO\", null, null, 1) as \"CHIID_OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_OD.\"OD_NO\" as \"OD_NO\", "
+"      to_char(T_OD.\"PARENT_OD_NO\") as \"PARENT_OD_NO\" "
+"    from "
+"      T_OD "
+"  ) T1 "
+"where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.\"PARENT_OD_NO\" = ? "
+"  and T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T1.PARENT_OD_NO(+) = T_OD.\"OD_NO\" "
+"order by "
+"  T_OD.\"ITEM_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Node_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Node_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Node_read
			if(m_selcmd==null) throw new FoundationException("Node", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:Node_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Node_read2
			if(m_selcmd==null) throw new FoundationException("Node", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Node_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Node_read3
			if(m_selcmd==null) throw new FoundationException("Node", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Node_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setOD_NO( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setITEM_NAME( getString(3, rs) );
			data.setOD_TYP( getString(4, rs) );
			data.setODR_STS_TYP( getString(5, rs) );
			data.setDM_STS_TYP( getString(6, rs) );
			data.setMRP_ODR_TYP( getString(7, rs) );
			data.setMRP_TYP( getString(8, rs) );
			data.setSub1_OUTSIDE_TYP( getString(9, rs) );
			data.setJOB_ODR_STS_TYP( getString(10, rs) );
			data.setPARENT_OD_NO( getString(11, rs) );
			data.setMODIFY_COUNT( getString(12, rs) );
			data.setMANHOUR_TYP( getString(13, rs) );
			data.setTOTAL_RCV_QTY( getString(14, rs) );
			data.setTOTAL_ISSUE_QTY( getString(15, rs) );
			data.setCHIID_OD_NO( getString(16, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Node", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Node_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("Node", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:Node_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Node_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Node_clear

			return;
		}

		/**
		 * Nodeクラスの標準コンストラクタ
		 */
		public Node()
		{
			//{{user_implement_dev:Node_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Node_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class Detail extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_JOB_ODR.\"JOB_ODR_TYP\") as \"JOB_ODR_TYP\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  to_char(T_OD.\"OUTSIDE_TYP\") as \"OUTSIDE_TYP\", "
+"  to_char(T_OD.\"MRP_ODR_TYP\") as \"MRP_ODR_TYP\", "
+"  to_char(T_OD.\"ITEM_SPOIL\") as \"ITEM_SPOIL\", "
+"  to_char(M_ITEM.\"UNIT_QTY_TYP\") as \"UNIT_QTY_TYP\", "
+"  to_char(T_JOB_ODR.\"JOB_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"JOB_ODR_DLV_DATE\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"PRD_DUE_DATE\") as \"PRD_DUE_DATE\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"PRD_START_DATE\") as \"PRD_START_DATE\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"ODR_START_DATE\") as \"ODR_START_DATE\", "
+"  to_char(nvl(T1.\"SUM_PUCH_ODR_QTY\", 0)) as \"SUM_PUCH_ODR_QTY\", "
+"  to_char(nvl(T2.\"SUM_OPR_INST_QTY\", 0)) as \"SUM_OPR_INST_QTY\", "
+"  to_char(T_OD.\"ODR_QTY\") as \"ODR_QTY\", "
+"  to_char(T_OD.\"DM_QTY\") as \"DM_QTY\", "
+"  to_char(nvl(T3.\"SUM_ALCD_QTY\", 0)) as \"SUM_ALCD_QTY\", "
+"  to_char(T_OD.\"ODR_STS_TYP\") as \"ODR_STS_TYP\", "
+"  to_char(T_OD.\"DM_STS_TYP\") as \"DM_STS_TYP\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  to_char(T_OD.\"OD_TYP\") as \"OD_TYP\", "
+"  to_char(T_JOB_ODR.\"JOB_ODR_STS_TYP\") as \"JOB_ODR_STS_TYP\", "
+"  to_char(T_OD.\"PARENT_OD_NO\") as \"PARENT_OD_NO\", "
+"  to_char(T_OD.\"OD_GNR_TYP\") as \"OD_GNR_TYP\", "
+"  to_char(M_ITEM.\"MANHOUR_TYP\") as \"MANHOUR_TYP\", "
+"  to_char(M_ITEM.\"OPR_RSLT_TYP\") as \"OPR_RSLT_TYP\", "
+"  to_char(T_OD.\"TOTAL_RCV_QTY\") as \"TOTAL_RCV_QTY\", "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\") as \"TOTAL_ISSUE_QTY\" "
+"from "
+"  T_OD, "
+"  T_JOB_ODR, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_RLSD_PUCH_ODR.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\") as \"SUM_PUCH_ODR_QTY\" "
+"    from "
+"      T_RLSD_PUCH_ODR "
+"    where "
+"      T_RLSD_PUCH_ODR.\"WORK_ODR_CD\" is null "
+"    group by "
+"      T_RLSD_PUCH_ODR.\"OD_NO\" "
+"  ) T1, "
+"  ( "
+"    select "
+"      T_WORK_IN_PROC_BY_ITEM.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_WORK_IN_PROC_BY_ITEM.\"OPR_INST_QTY\") as \"SUM_OPR_INST_QTY\" "
+"    from "
+"      T_WORK_IN_PROC_BY_ITEM "
+"    group by "
+"      T_WORK_IN_PROC_BY_ITEM.\"OD_NO\" "
+"  ) T2, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as SUM_ALCD_QTY "
+"    from "
+"      T_JOB_ODR_ALC "
+"    group by "
+"      T_JOB_ODR_ALC.\"OD_NO\" "
+"  ) T3 "
+"where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.OD_NO = T1.OD_NO(+) "
+"  and T_OD.OD_NO = T2.OD_NO(+) "
+"  and T_OD.OD_NO = T3.OD_NO(+) "
+"  and T_OD.\"OD_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Detail_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Detail_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Detail_read
			if(m_selcmd==null) throw new FoundationException("Detail", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:Detail_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Detail_read2
			if(m_selcmd==null) throw new FoundationException("Detail", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Detail_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Detail_read3
			if(m_selcmd==null) throw new FoundationException("Detail", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Detail_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setJOB_ODR_TYP( getString(1, rs) );
			data.setALC_GRP_CD( getString(2, rs) );
			data.setITEM_CD( getString(3, rs) );
			data.setDetail_ITEM_NAME( getString(4, rs) );
			data.setDRAW_CD( getString(5, rs) );
			data.setSPEC( getString(6, rs) );
			data.setOUTSIDE_TYP( getString(7, rs) );
			data.setMRP_ODR_TYP( getString(8, rs) );
			data.setITEM_SPOIL( getString(9, rs) );
			data.setUNIT_QTY_TYP( getString(10, rs) );
			data.setJOB_ODR_DLV_DATE( getString(11, rs) );
			data.setDUE_DATE( getString(12, rs) );
			data.setPRD_DUE_DATE( getString(13, rs) );
			data.setPRD_START_DATE( getString(14, rs) );
			data.setODR_START_DATE( getString(15, rs) );
			data.setSUM_PUCH_ODR_QTY( getString(16, rs) );
			data.setSUM_OPR_INST_QTY( getString(17, rs) );
			data.setODR_QTY( getString(18, rs) );
			data.setDM_QTY( getString(19, rs) );
			data.setSUM_ALCD_QTY( getString(20, rs) );
			data.setODR_STS_TYP( getString(21, rs) );
			data.setDM_STS_TYP( getString(22, rs) );
			data.setSTOCK_UNIT( getString(23, rs) );
			data.setOD_TYP( getString(24, rs) );
			data.setJOB_ODR_STS_TYP( getString(25, rs) );
			data.setPARENT_OD_NO( getString(26, rs) );
			data.setOD_GNR_TYP( getString(27, rs) );
			data.setMANHOUR_TYP( getString(28, rs) );
			data.setOPR_RSLT_TYP( getString(29, rs) );
			data.setTOTAL_RCV_QTY( getString(30, rs) );
			data.setTOTAL_ISSUE_QTY( getString(31, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Detail", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Detail_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("Detail", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:Detail_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Detail_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Detail_clear

			return;
		}

		/**
		 * Detailクラスの標準コンストラクタ
		 */
		public Detail()
		{
			//{{user_implement_dev:Detail_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Detail_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSub1Header extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"OD_NO\" as \"OD_NO\", "
+"  T_OD.\"ITEM_CD\" as \"Sub1_Parent_ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"Sub1_Parent_ITEM_NAME\", "
+"  to_char(T_OD.\"OD_LEVEL_NO\") as \"OD_LEVEL_NO\", "
+"  to_char(T_OD.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  to_char(T_OD.\"ODR_QTY\") as \"ODR_QTY\", "
+"  to_char(T_OD.\"ODR_START_DATE\", 'YYYY/MM/DD') as \"ODR_START_DATE\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ODR_STS_TYP\" as \"ODR_STS_TYP\", "
+"  T_OD.\"DM_STS_TYP\" as \"DM_STS_TYP\" "
+"from "
+"  T_OD, "
+"  M_ITEM "
+"where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.\"OD_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSub1Header_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSub1Header_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1Header_read
			if(m_selcmd==null) throw new FoundationException("SelectSub1Header", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSub1Header_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1Header_read2
			if(m_selcmd==null) throw new FoundationException("SelectSub1Header", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSub1Header_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1Header_read3
			if(m_selcmd==null) throw new FoundationException("SelectSub1Header", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSub1Header_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_PARENT_OD_NO());
				if(isNull(data.getSub1_PARENT_OD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_PARENT_OD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setSub1_PARENT_OD_NO( getString(1, rs) );
			data.setSub1_Parent_ITEM_CD( getString(2, rs) );
			data.setSub1_Parent_ITEM_NAME( getString(3, rs) );
			data.seth_Sub1_Parent_OD_LEVEL_NO( getString(4, rs) );
			data.seth_Parent_OD_MODIFY_COUNT( getString(5, rs) );
			data.seth_Sub1_Parent_ODR_QTY( getString(6, rs) );
			data.seth_Sub1_Parent_ODR_START_DATE( getString(7, rs) );
			data.seth_Sub1_Parent_ALC_GRP_CD( getString(8, rs) );
			data.seth_Sub1_ODR_STS_TYP( getString(9, rs) );
			data.seth_Sub1_DM_STS_TYP( getString(10, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSub1Header", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1Header_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSub1Header_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSub1Header_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSub1Header_clear

			return;
		}

		/**
		 * SelectSub1Headerクラスの標準コンストラクタ
		 */
		public SelectSub1Header()
		{
			//{{user_implement_dev:SelectSub1Header_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSub1Header_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSub1 extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"ITEM_CD\" as \"Sub1_Comp_ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"Sub1_Comp_ITEM_NAME\", "
+"  M_ITEM.\"DRAW_CD\" as \"Sub1_DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"Sub1_SPEC\", "
+"  to_char(T_OD.\"MRP_ODR_TYP\") as \"Sub1_MRP_ODR_TYP\", "
+"  to_char(T_OD.\"ITEM_SPOIL\") as \"Sub1_ITEM_SPOIL\", "
+"  to_char(T_OD.\"PS_SPOIL\") as \"Sub1_PS_SPOIL\", "
+"  to_char(M_ITEM.\"UNIT_QTY_TYP\") as \"Sub1_UNIT_QTY_TYP\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"DUE_DATE\") as \"Sub1_DUE_DATE\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"PRD_DUE_DATE\") as \"Sub1_PRD_DUE_DATE\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"PRD_START_DATE\") as \"Sub1_PRD_START_DATE\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"ODR_START_DATE\") as \"Sub1_ODR_START_DATE\", "
+"  to_char(T_OD.\"ODR_QTY\") as \"Sub1_ODR_QTY\", "
+"  to_char(T_OD.\"DM_QTY\") as \"Sub1_DM_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  to_char(T_OD.\"PARENT_OD_NO\") as \"PARENT_OD_NO\", "
+"  to_char(T_OD.\"PS_UNIT_DENOMINATOR\") as \"Sub1_PS_UNIT_DENOMINATOR\", "
+"  to_char(T_OD.\"PS_UNIT_NUMERATOR\") as \"Sub1_PS_UNIT_NUMERATOR\", "
+"  to_char(T_OD.\"OUTSIDE_TYP\") as \"OUTSIDE_TYP\", "
+"  to_char(M_ITEM.\"ODR_LT\") as \"ODR_LT\", "
+"  to_char(M_ITEM.\"FIXED_LT\") as \"FIXED_LT\", "
+"  to_char(M_ITEM.\"PROP_LT\") as \"PROP_LT\", "
+"  to_char(M_ITEM.\"SAFETY_LT\") as \"SAFETY_LT\", "
+"  to_char(M_ITEM.\"ISSUE_LT\") as \"ISSUE_LT\", "
+"  to_char(M_ITEM.\"PROP_LOT_SIZE\") as \"PROP_LOT_SIZE\", "
+"  to_char(T_OD.\"MRP_TYP\") as \"MRP_TYP\", "
+"  to_char(M_ITEM.\"MODIFY_COUNT\") as \"ITEM_MODIFY_COUNT\", "
+"  to_char(T_OD.\"OD_TYP\") as \"OD_TYP\", "
+"  to_char(T_OD.\"PS_UNIT_QTY\") as \"PS_UNIT_QTY\", "
+"  to_char(T_OD.\"MODIFY_COUNT\") as \"OD_MODIFY_COUNT\", "
+"  to_char(M_ITEM.\"MANHOUR_TYP\") as \"MANHOUR_TYP\", "
+"  to_char(T_OD.\"ODR_STS_TYP\") as \"ODR_STS_TYP\", "
+"  to_char(T_OD.\"DM_STS_TYP\") as \"DM_STS_TYP\" "
+"from "
+"  T_OD, "
+"  M_ITEM "
+"where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.\"OD_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSub1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSub1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1_read
			if(m_selcmd==null) throw new FoundationException("SelectSub1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSub1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1_read2
			if(m_selcmd==null) throw new FoundationException("SelectSub1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSub1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1_read3
			if(m_selcmd==null) throw new FoundationException("SelectSub1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSub1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setSub1_Comp_ITEM_CD( getString(1, rs) );
			data.setSub1_Comp_ITEM_NAME( getString(2, rs) );
			data.setSub1_DRAW_CD( getString(3, rs) );
			data.setSub1_SPEC( getString(4, rs) );
			data.seth_Sub1_MRP_ODR_TYP( getString(5, rs) );
			data.setSub1_ITEM_SPOIL( getString(6, rs) );
			data.setSub1_PS_SPOIL( getString(7, rs) );
			data.seth_Sub1_UNIT_QTY_TYP( getString(8, rs) );
			data.setSub1_DUE_DATE( getString(9, rs) );
			data.setSub1_PRD_DUE_DATE( getString(10, rs) );
			data.setSub1_PRD_START_DATE( getString(11, rs) );
			data.setSub1_ODR_START_DATE( getString(12, rs) );
			data.setSub1_ODR_QTY( getString(13, rs) );
			data.setSub1_DM_QTY( getString(14, rs) );
			data.setSub1_STOCK_UNIT( getString(15, rs) );
			data.setPARENT_OD_NO( getString(16, rs) );
			data.setSub1_PS_UNIT_DENOMINATOR( getString(17, rs) );
			data.setSub1_PS_UNIT_NUMERATOR( getString(18, rs) );
			data.setSub1_OUTSIDE_TYP( getString(19, rs) );
			data.setODR_LT( getString(20, rs) );
			data.setFIXED_LT( getString(21, rs) );
			data.setPROP_LT( getString(22, rs) );
			data.setSAFETY_LT( getString(23, rs) );
			data.setISSUE_LT( getString(24, rs) );
			data.setPROP_LOT_SIZE( getString(25, rs) );
			data.setMRP_TYP( getString(26, rs) );
			data.seth_Comp_ITEM_MODIFY_COUNT( getString(27, rs) );
			data.setSub1_OD_TYP( getString(28, rs) );
			data.seth_Sub1_PS_UNIT_QTY( getString(29, rs) );
			data.seth_Sub1_OD_MODIFY_COUNT( getString(30, rs) );
			data.seth_Sub1_MANHOUR_TYP( getString(31, rs) );
			data.seth_Sub1_ODR_STS_TYP( getString(32, rs) );
			data.seth_Sub1_DM_STS_TYP( getString(33, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSub1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSub1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSub1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSub1_clear

			return;
		}

		/**
		 * SelectSub1クラスの標準コンストラクタ
		 */
		public SelectSub1()
		{
			//{{user_implement_dev:SelectSub1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSub1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class InsertT_OD extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_OD(\"OD_NO\", \"ALC_GRP_CD\", \"PLANT_CD\", \"ITEM_CD\", \"PS_EDITION\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"JOB_ODR_CANCEL_NO\", \"ODR_STS_TYP\", \"DM_STS_TYP\", \"OD_TYP\", \"DUE_DATE\", \"ODR_START_DATE\", \"PRD_DUE_DATE\", \"PRD_START_DATE\", \"DM_QTY\", \"ODR_QTY\", \"MRP_ODR_TYP\", \"OUTSIDE_TYP\", \"ISSUE_TYP\", \"ODR_LT\", \"FIXED_LT\", \"PROP_LT\", \"SAFETY_LT\", \"ISSUE_LT\", \"PROP_LOT_SIZE\", \"PS_LT_FLG\", \"PS_FIXED_LT\", \"PS_PROP_LT\", \"PS_PROP_LOT_SIZE\", \"PS_UNIT_QTY\", \"PS_UNIT_DENOMINATOR\", \"PS_UNIT_NUMERATOR\", \"TOTAL_RCV_QTY\", \"RCV_CMPLT_DATE\", \"TOTAL_ISSUE_INST_QTY\", \"TOTAL_ISSUE_QTY\", \"ISSUE_CMPLT_DATE\", \"OD_GNR_TYP\", \"OD_LEVEL_NO\", \"PARENT_OD_NO\", \"ITEM_SPOIL\", \"PS_SPOIL\", \"CONS_TYP\", \"EFF_PHASE_IN_DATE\", \"EFF_PHASE_OUT_DATE\", \"MRP_TYP\", \"EXTERNAL_DM_FLG\", \"ODR_RELEASE_FLG\") "
+"VALUES "
+"  (?, ?, ?, ?, 0, ?, ?, 0, ?, 1, ?, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ?, ?, ?, 0, NULL, 0, 0, NULL, 1, ?, ?, ?, ?, 0, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), 1, 0, 0)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:InsertT_OD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:InsertT_OD_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getOD_NO(), stmt);
				setString(8, data.getALC_GRP_CD(), stmt);
				setString(9, data.getPLANT_CD(), stmt);
				setString(10, data.getSub1_Comp_ITEM_CD(), stmt);
				setString(11, data.getJOB_ODR_CD(), stmt);
				setString(12, data.getJOB_ODR_DETAIL_NO(), stmt);
				setString(13, data.getODR_STS_TYP(), stmt);
				setString(14, data.getOD_TYP(), stmt);
				setString(15, data.getL_Sub1_DUE_DATE(), stmt);
				setString(16, data.getL_Sub1_ODR_START_DATE(), stmt);
				setString(17, data.getL_Sub1_PRD_DUE_DATE(), stmt);
				setString(18, data.getL_Sub1_PRD_START_DATE(), stmt);
				setString(19, data.getSub1_DM_QTY(), stmt);
				setString(20, data.getSub1_ODR_QTY(), stmt);
				setString(21, data.getSub1_MRP_ODR_TYP(), stmt);
				setString(22, data.getSub1_OUTSIDE_TYP(), stmt);
				setString(23, data.getISSUE_TYP(), stmt);
				setString(24, data.getODR_LT(), stmt);
				setString(25, data.getFIXED_LT(), stmt);
				setString(26, data.getPROP_LT(), stmt);
				setString(27, data.getSAFETY_LT(), stmt);
				setString(28, data.getISSUE_LT(), stmt);
				setString(29, data.getPROP_LOT_SIZE(), stmt);
				setString(30, data.getSub1_PS_UNIT_QTY(), stmt);
				setString(31, data.getSub1_PS_UNIT_DENOMINATOR(), stmt);
				setString(32, data.getSub1_PS_UNIT_NUMERATOR(), stmt);
				setString(33, data.getOD_LEVEL_NO(), stmt);
				setString(34, data.getPARENT_OD_NO(), stmt);
				setString(35, data.getSub1_ITEM_SPOIL(), stmt);
				setString(36, data.getSub1_PS_SPOIL(), stmt);
				setString(37, data.getEFF_PHASE_IN_DATE(), stmt);
				setString(38, data.getEFF_PHASE_OUT_DATE(), stmt);

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
			//{{user_implement_dev:InsertT_OD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:InsertT_OD_clear

			return;
		}

		/**
		 * InsertT_ODクラスの標準コンストラクタ
		 */
		public InsertT_OD()
		{
			//{{user_implement_dev:InsertT_OD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:InsertT_OD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class UpdateT_OD extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_OD "
+"SET "
+"  \"DM_QTY\" = ?, "
+"  \"OUTSIDE_TYP\" = ?, "
+"  \"PS_UNIT_QTY\" = ?, "
+"  \"PS_SPOIL\" = ?, "
+"  \"PS_UNIT_DENOMINATOR\" = ?, "
+"  \"PS_UNIT_NUMERATOR\" = ?, "
+"  \"OD_GNR_TYP\" = 1, "
+"  \"MRP_TYP\" = ?, "
+"  \"ITEM_SPOIL\" = ? "
+"WHERE "
+"  T_OD.\"OD_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:UpdateT_OD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:UpdateT_OD_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsetDM_QTY(), stmt);
				setString(5, data.getsetOUTSIDE_TYP(), stmt);
				setString(6, data.getsetPS_UNIT_QTY(), stmt);
				setString(7, data.getsetPS_SPOIL(), stmt);
				setString(8, data.getsetPS_UNIT_DENOMINATOR(), stmt);
				setString(9, data.getsetPS_UNIT_NUMERATOR(), stmt);
				setString(10, data.getsetMRP_TYP(), stmt);
				setString(11, data.getsetITEM_SPOIL(), stmt);
				setString(12, data.getsetOD_NO(), stmt);

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
			//{{user_implement_dev:UpdateT_OD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:UpdateT_OD_clear

			return;
		}

		/**
		 * UpdateT_ODクラスの標準コンストラクタ
		 */
		public UpdateT_OD()
		{
			//{{user_implement_dev:UpdateT_OD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:UpdateT_OD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSub1Form extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"Sub1_Comp_ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"Sub1_Comp_ITEM_NAME\", "
+"  M_ITEM.\"DRAW_CD\" as \"Sub1_DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"Sub1_SPEC\", "
+"  to_char(M_ITEM.\"MRP_ODR_TYP\") as \"Sub1_MRP_ODR_TYP\", "
+"  to_char(M_ITEM.\"ITEM_SPOIL\") as \"Sub1_ITEM_SPOIL\", "
+"  to_char(M_ITEM.\"UNIT_QTY_TYP\") as \"Sub1_UNIT_QTY_TYP\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  to_char(M_ITEM.\"OUTSIDE_TYP\") as \"Sub1_OUTSIDE_TYP\", "
+"  to_char(M_ITEM.\"ODR_LT\") as \"ODR_LT\", "
+"  to_char(M_ITEM.\"FIXED_LT\") as \"FIXED_LT\", "
+"  to_char(M_ITEM.\"PROP_LT\") as \"PROP_LT\", "
+"  to_char(M_ITEM.\"SAFETY_LT\") as \"SAFETY_LT\", "
+"  to_char(M_ITEM.\"ISSUE_LT\") as \"ISSUE_LT\", "
+"  to_char(M_ITEM.\"PROP_LOT_SIZE\") as \"PROP_LOT_SIZE\", "
+"  to_char(M_ITEM.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  to_char(M_ITEM.\"ISSUE_TYP\") as \"ISSUE_TYP\", "
+"  to_char(M_ITEM.\"FIXED_LT\") as FIXED_LT, "
+"  to_char(M_ITEM.\"PROP_LOT_SIZE\") as PROP_LOT_SIZE, "
+"  to_char(M_ITEM.\"PROP_LT\") as PROP_LT, "
+"  to_char(M_ITEM.\"SAFETY_LT\") as SAFETY_LT, "
+"  to_char(M_ITEM.\"CAL_NO\") as CAL_NO, "
+"  to_char(M_ITEM.\"MANHOUR_TYP\") as MANHOUR_TYP "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSub1Form_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSub1Form_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1Form_read
			if(m_selcmd==null) throw new FoundationException("SelectSub1Form", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSub1Form_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1Form_read2
			if(m_selcmd==null) throw new FoundationException("SelectSub1Form", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSub1Form_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1Form_read3
			if(m_selcmd==null) throw new FoundationException("SelectSub1Form", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSub1Form_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setSub1_Comp_ITEM_CD( getString(1, rs) );
			data.setSub1_Comp_ITEM_NAME( getString(2, rs) );
			data.setSub1_DRAW_CD( getString(3, rs) );
			data.setSub1_SPEC( getString(4, rs) );
			data.seth_Sub1_MRP_ODR_TYP( getString(5, rs) );
			data.setSub1_ITEM_SPOIL( getString(6, rs) );
			data.seth_Sub1_UNIT_QTY_TYP( getString(7, rs) );
			data.setSub1_STOCK_UNIT( getString(8, rs) );
			data.setSub1_OUTSIDE_TYP( getString(9, rs) );
			data.setODR_LT( getString(10, rs) );
			data.setFIXED_LT( getString(11, rs) );
			data.setPROP_LT( getString(12, rs) );
			data.setSAFETY_LT( getString(13, rs) );
			data.setISSUE_LT( getString(14, rs) );
			data.setPROP_LOT_SIZE( getString(15, rs) );
			data.seth_Comp_ITEM_MODIFY_COUNT( getString(16, rs) );
			data.seth_Sub1_ISSUE_TYP( getString(17, rs) );
			data.setFIXED_LT( getString(18, rs) );
			data.setPROP_LOT_SIZE( getString(19, rs) );
			data.setPROP_LT( getString(20, rs) );
			data.setSAFETY_LT( getString(21, rs) );
			data.setCAL_NO( getString(22, rs) );
			data.seth_Sub1_MANHOUR_TYP( getString(23, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSub1Form", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1Form_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSub1Form_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSub1Form_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSub1Form_clear

			return;
		}

		/**
		 * SelectSub1Formクラスの標準コンストラクタ
		 */
		public SelectSub1Form()
		{
			//{{user_implement_dev:SelectSub1Form_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSub1Form_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSubOdRead1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_OD.MRP_ODR_TYP AS \"MRP_ODR_TYP\", "
+"  T_OD.\"ODR_QTY\" AS \"ODR_QTY\", "
+"  FNCGETFORMATTEDDATETIME(T_OD.\"ODR_START_DATE\") AS \"ODR_START_DATE\" "
+"FROM "
+"  T_OD "
+"WHERE "
+"  T_OD.\"JOB_ODR_CD\" = ? "
+"  AND T_OD.\"JOB_ODR_CANCEL_NO\" = ? "
+"  AND T_OD.\"JOB_ODR_DETAIL_NO\" = 0 "
+"  AND T_OD.\"ITEM_CD\" = ? "
+"  AND T_OD.\"OD_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSubOdRead1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSubOdRead1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead1_read
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSubOdRead1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead1_read2
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSubOdRead1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead1_read3
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSubOdRead1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getSub1_Parent_ITEM_CD());
				if(isNull(data.getSub1_Parent_ITEM_CD())) isNull = true;
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_Parent_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setMRP_ODR_TYP( getString(1, rs) );
			data.setSub1_ODR_QTY( getString(2, rs) );
			data.setSub1_ODR_START_DATE( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSubOdRead1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkSubOdRead1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSubOdRead1_clear

			return;
		}

		/**
		 * checkSubOdRead1クラスの標準コンストラクタ
		 */
		public checkSubOdRead1()
		{
			//{{user_implement_dev:checkSubOdRead1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSubOdRead1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSubOdRead2 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.\"MRP_ODR_TYP\" AS \"MRP_ODR_TYP\", "
+"  M_ITEM.\"MANHOUR_TYP\" AS \"MANHOUR_TYP\", "
+"  M_ITEM.\"OPR_RSLT_TYP\" AS \"OPR_RSLT_TYP\" "
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

		//{{user_implement_dev:checkSubOdRead2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSubOdRead2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead2_read
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSubOdRead2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead2_read2
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSubOdRead2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead2_read3
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSubOdRead2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setMRP_ODR_TYP( getString(1, rs) );
			data.setMANHOUR_TYP( getString(2, rs) );
			data.setOPR_RSLT_TYP( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead2", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSubOdRead2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkSubOdRead2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSubOdRead2_clear

			return;
		}

		/**
		 * checkSubOdRead2クラスの標準コンストラクタ
		 */
		public checkSubOdRead2()
		{
			//{{user_implement_dev:checkSubOdRead2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSubOdRead2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSubOdRead3 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_OD.\"ITEM_CD\" AS \"ITEM_CD\" "
+"FROM "
+"  T_OD "
+"WHERE "
+"  T_OD.\"JOB_ODR_CD\" = ? "
+"  AND T_OD.\"JOB_ODR_CANCEL_NO\" = ? "
+"  AND T_OD.\"JOB_ODR_DETAIL_NO\" = 0 "
+"  AND T_OD.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSubOdRead3_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSubOdRead3_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead3_read
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead3", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSubOdRead3_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead3_read2
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead3", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSubOdRead3_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead3_read3
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead3", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSubOdRead3_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setITEM_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead3", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead3_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSubOdRead3_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkSubOdRead3_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSubOdRead3_clear

			return;
		}

		/**
		 * checkSubOdRead3クラスの標準コンストラクタ
		 */
		public checkSubOdRead3()
		{
			//{{user_implement_dev:checkSubOdRead3_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSubOdRead3_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  to_char(M_ITEM.\"MODIFY_COUNT\") AS \"MODIFY_COUNT\" "
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

		//{{user_implement_dev:checkT_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_ITEM_read
			if(m_selcmd==null) throw new FoundationException("checkT_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("checkT_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkT_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("checkT_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkT_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setITEM_MODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkT_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_ITEM_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkT_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_ITEM_clear

			return;
		}

		/**
		 * checkT_ITEMクラスの標準コンストラクタ
		 */
		public checkT_ITEM()
		{
			//{{user_implement_dev:checkT_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_OD1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  to_char(T_OD.\"MODIFY_COUNT\") AS \"MODIFY_COUNT\" "
+"FROM "
+"  T_OD "
+"WHERE "
+"  T_OD.\"OD_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_OD1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_OD1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_OD1_read
			if(m_selcmd==null) throw new FoundationException("checkT_OD1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_OD1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_OD1_read2
			if(m_selcmd==null) throw new FoundationException("checkT_OD1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkT_OD1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_OD1_read3
			if(m_selcmd==null) throw new FoundationException("checkT_OD1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkT_OD1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_PARENT_OD_NO());
				if(isNull(data.getSub1_PARENT_OD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_PARENT_OD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setOD_MODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkT_OD1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_OD1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_OD1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkT_OD1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_OD1_clear

			return;
		}

		/**
		 * checkT_OD1クラスの標準コンストラクタ
		 */
		public checkT_OD1()
		{
			//{{user_implement_dev:checkT_OD1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_OD1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSubOdRead4 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_OD.\"ITEM_CD\" AS \"ITEM_CD\" "
+"FROM "
+"  T_OD "
+"WHERE "
+"  T_OD.\"JOB_ODR_CD\" = ? "
+"  AND T_OD.\"JOB_ODR_CANCEL_NO\" = ? "
+"  AND T_OD.\"JOB_ODR_DETAIL_NO\" = 0 "
+"  AND T_OD.\"MRP_TYP\" != 9 "
+"  AND T_OD.\"OD_NO\" != ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSubOdRead4_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSubOdRead4_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead4_read
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead4", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSubOdRead4_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead4_read2
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead4", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSubOdRead4_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead4_read3
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead4", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkSubOdRead4_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setITEM_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkSubOdRead4", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSubOdRead4_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSubOdRead4_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkSubOdRead4_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSubOdRead4_clear

			return;
		}

		/**
		 * checkSubOdRead4クラスの標準コンストラクタ
		 */
		public checkSubOdRead4()
		{
			//{{user_implement_dev:checkSubOdRead4_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSubOdRead4_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectChild extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD "
+"where "
+"  T_OD.\"PARENT_OD_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectChild_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectChild_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectChild_read
			if(m_selcmd==null) throw new FoundationException("SelectChild", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectChild_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectChild_read2
			if(m_selcmd==null) throw new FoundationException("SelectChild", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectChild_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectChild_read3
			if(m_selcmd==null) throw new FoundationException("SelectChild", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectChild_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setOD_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectChild", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectChild_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectChild_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectChild_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectChild_clear

			return;
		}

		/**
		 * SelectChildクラスの標準コンストラクタ
		 */
		public SelectChild()
		{
			//{{user_implement_dev:SelectChild_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectChild_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class DeleteT_OD extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_OD "
+"WHERE "
+"  T_OD.\"OD_NO\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:DeleteT_OD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:DeleteT_OD_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getsetOD_NO(), stmt);

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
			//{{user_implement_dev:DeleteT_OD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:DeleteT_OD_clear

			return;
		}

		/**
		 * DeleteT_ODクラスの標準コンストラクタ
		 */
		public DeleteT_OD()
		{
			//{{user_implement_dev:DeleteT_OD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:DeleteT_OD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_PROC_GRP.\"PROC_CD\" AS \"PROC_CD\" "
+"FROM "
+"  M_PROC_GRP "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_PROC_GRP_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PROC_GRP_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_PROC_GRP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_PROC_GRP_clear

			return;
		}

		/**
		 * checkM_PROC_GRPクラスの標準コンストラクタ
		 */
		public checkM_PROC_GRP()
		{
			//{{user_implement_dev:checkM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_PUCH_UNIT_COST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_PUCH_UNIT_COST.\"VEND_CD\" AS \"VEND_CD\" "
+"FROM "
+"  M_PUCH_UNIT_COST "
+"WHERE "
+"  M_PUCH_UNIT_COST.\"COMPANY_CD\" = ? "
+"  AND M_PUCH_UNIT_COST.\"PLANT_CD\" = ? "
+"  AND M_PUCH_UNIT_COST.\"ITEM_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_PUCH_UNIT_COST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_PUCH_UNIT_COST_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PUCH_UNIT_COST_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_PUCH_UNIT_COST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_PUCH_UNIT_COST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_PUCH_UNIT_COST_clear

			return;
		}

		/**
		 * checkM_PUCH_UNIT_COSTクラスの標準コンストラクタ
		 */
		public checkM_PUCH_UNIT_COST()
		{
			//{{user_implement_dev:checkM_PUCH_UNIT_COST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_PUCH_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateChild extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_OD "
+"SET "
+"  \"DUE_DATE\" = ?, "
+"  \"DM_QTY\" = ?, "
+"  \"PRD_DUE_DATE\" = ? "
+"WHERE "
+"  OD_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateChild_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateChild_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsetDUE_DATE(), stmt);
				setString(5, data.getsetDM_QTY(), stmt);
				setString(6, data.getsetPRD_DUE_DATE(), stmt);
				setString(7, data.getsetOD_NO(), stmt);

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
			//{{user_implement_dev:updateChild_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateChild_clear

			return;
		}

		/**
		 * updateChildクラスの標準コンストラクタ
		 */
		public updateChild()
		{
			//{{user_implement_dev:updateChild_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateChild_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateChildGiji extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_OD "
+"set "
+"  DUE_DATE = ?, "
+"  PRD_DUE_DATE = ?, "
+"  PRD_START_DATE = ?, "
+"  ODR_START_DATE = ?, "
+"  DM_QTY = ?, "
+"  ODR_QTY = ? "
+"where "
+"  OD_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateChildGiji_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateChildGiji_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsetDUE_DATE(), stmt);
				setString(5, data.getsetPRD_DUE_DATE(), stmt);
				setString(6, data.getsetPRD_START_DATE(), stmt);
				setString(7, data.getsetODR_START_DATE(), stmt);
				setString(8, data.getsetDM_QTY(), stmt);
				setString(9, data.getsetODR_QTY(), stmt);
				setString(10, data.getsetOD_NO(), stmt);

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
			//{{user_implement_dev:updateChildGiji_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateChildGiji_clear

			return;
		}

		/**
		 * updateChildGijiクラスの標準コンストラクタ
		 */
		public updateChildGiji()
		{
			//{{user_implement_dev:updateChildGiji_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateChildGiji_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_OD2 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_OD "
+"SET "
+"  \"MRP_TYP\" = ? "
+"WHERE "
+"  T_OD.\"OD_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_OD2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_OD2_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsetMRP_TYP(), stmt);
				setString(5, data.getsetOD_NO(), stmt);

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
			//{{user_implement_dev:updateT_OD2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_OD2_clear

			return;
		}

		/**
		 * updateT_OD2クラスの標準コンストラクタ
		 */
		public updateT_OD2()
		{
			//{{user_implement_dev:updateT_OD2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_OD2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_OD3 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_OD "
+"SET "
+"  \"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI'), "
+"  \"PRD_START_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI'), "
+"  \"ODR_START_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI'), "
+"  \"ODR_QTY\" = ?, "
+"  \"DM_QTY\" = ?, "
+"  \"OUTSIDE_TYP\" = ?, "
+"  \"OD_TYP\" = ?, "
+"  \"PS_UNIT_QTY\" = ?, "
+"  \"PS_UNIT_DENOMINATOR\" = ?, "
+"  \"PS_UNIT_NUMERATOR\" = ?, "
+"  \"OD_GNR_TYP\" = 1, "
+"  \"MRP_TYP\" = ?, "
+"  \"PS_SPOIL\" = ?, "
+"  \"ITEM_SPOIL\" = ?, "
+"  \"ODR_STS_TYP\" = ? "
+"WHERE "
+"  T_OD.\"OD_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_OD3_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_OD3_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsetPRD_DUE_DATE(), stmt);
				setString(5, data.getsetPRD_START_DATE(), stmt);
				setString(6, data.getsetODR_START_DATE(), stmt);
				setString(7, data.getsetODR_QTY(), stmt);
				setString(8, data.getsetDM_QTY(), stmt);
				setString(9, data.getsetOUTSIDE_TYP(), stmt);
				setString(10, data.getsetOD_TYP(), stmt);
				setString(11, data.getsetPS_UNIT_QTY(), stmt);
				setString(12, data.getsetPS_UNIT_DENOMINATOR(), stmt);
				setString(13, data.getsetPS_UNIT_NUMERATOR(), stmt);
				setString(14, data.getsetMRP_TYP(), stmt);
				setString(15, data.getsetPS_SPOIL(), stmt);
				setString(16, data.getsetITEM_SPOIL(), stmt);
				setString(17, data.getsetODR_STS_TYP(), stmt);
				setString(18, data.getsetOD_NO(), stmt);

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
			//{{user_implement_dev:updateT_OD3_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_OD3_clear

			return;
		}

		/**
		 * updateT_OD3クラスの標準コンストラクタ
		 */
		public updateT_OD3()
		{
			//{{user_implement_dev:updateT_OD3_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_OD3_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CAL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MIN(M_CAL.\"CAL_DATE\") AS \"MIN_DATE\", "
+"  MAX(M_CAL.\"CAL_DATE\") AS \"MAX_DATE\" "
+"FROM "
+"  M_CAL "
+"WHERE "
+"  M_CAL.\"CAL_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_CAL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_CAL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_CAL_read
			if(m_selcmd==null) throw new FoundationException("selectM_CAL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_CAL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_CAL_read2
			if(m_selcmd==null) throw new FoundationException("selectM_CAL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_CAL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_CAL_read3
			if(m_selcmd==null) throw new FoundationException("selectM_CAL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_CAL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCAL_NO());
				if(isNull(data.getCAL_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getCAL_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setMIN_CAL_DATE( getString(1, rs) );
			data.setMAX_CAL_DATE( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_CAL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_CAL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_CAL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_CAL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_CAL_clear

			return;
		}

		/**
		 * selectM_CALクラスの標準コンストラクタ
		 */
		public selectM_CAL()
		{
			//{{user_implement_dev:selectM_CAL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_CAL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PLANT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PLANT.\"CAL_NO\" AS \"CAL_NO\" "
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
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
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
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setCAL_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
	public class selectSYS_OD_CALC_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_OD_CALC_CTRL.\"OD_CALC_FLG\" AS \"OD_CALC_FLG\" "
+"FROM "
+"  SYS_OD_CALC_CTRL "
+"WHERE "
+"  SYS_OD_CALC_CTRL.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_OD_CALC_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectSYS_OD_CALC_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_OD_CALC_CTRL_read
			if(m_selcmd==null) throw new FoundationException("selectSYS_OD_CALC_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_OD_CALC_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_OD_CALC_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_OD_CALC_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_OD_CALC_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_OD_CALC_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_OD_CALC_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_OD_CALC_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setOD_CALC_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_OD_CALC_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_OD_CALC_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_OD_CALC_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSYS_OD_CALC_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectSYS_OD_CALC_CTRL_clear

			return;
		}

		/**
		 * selectSYS_OD_CALC_CTRLクラスの標準コンストラクタ
		 */
		public selectSYS_OD_CALC_CTRL()
		{
			//{{user_implement_dev:selectSYS_OD_CALC_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectSYS_OD_CALC_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SELECT_TIME_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  VALUE "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  NAME = 'TIME_CTRL'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_TIME_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SELECT_TIME_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_TIME_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_TIME_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SELECT_TIME_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setTIME_CTRL( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
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
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
	/**
	 * Entity定義 静的SQL
	 */
	public class selectJOB_ODR_ALC_CD extends DataObject
	{
		protected String m_selcmd = "select "
+"  JOB_ODR_ALC_CD "
+"from "
+"  T_JOB_ODR_ALC "
+"where "
+"  OD_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectJOB_ODR_ALC_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectJOB_ODR_ALC_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectJOB_ODR_ALC_CD_read
			if(m_selcmd==null) throw new FoundationException("selectJOB_ODR_ALC_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectJOB_ODR_ALC_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectJOB_ODR_ALC_CD_read2
			if(m_selcmd==null) throw new FoundationException("selectJOB_ODR_ALC_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectJOB_ODR_ALC_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectJOB_ODR_ALC_CD_read3
			if(m_selcmd==null) throw new FoundationException("selectJOB_ODR_ALC_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectJOB_ODR_ALC_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setJOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectJOB_ODR_ALC_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectJOB_ODR_ALC_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectJOB_ODR_ALC_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectJOB_ODR_ALC_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectJOB_ODR_ALC_CD_clear

			return;
		}

		/**
		 * selectJOB_ODR_ALC_CDクラスの標準コンストラクタ
		 */
		public selectJOB_ODR_ALC_CD()
		{
			//{{user_implement_dev:selectJOB_ODR_ALC_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectJOB_ODR_ALC_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkSYS_JOB_OD_CALC_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  JOB_ODR_CD "
+"from "
+"  SYS_JOB_OD_CALC_CTRL "
+"where "
+"  PLANT_CD = ? "
+"  and JOB_ODR_CD = ? "
+"  and OD_CALC_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSYS_JOB_OD_CALC_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkSYS_JOB_OD_CALC_CTRL_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSYS_JOB_OD_CALC_CTRL_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkSYS_JOB_OD_CALC_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
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
			//{{user_implement_dev:checkSYS_JOB_OD_CALC_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkSYS_JOB_OD_CALC_CTRL_clear

			return;
		}

		/**
		 * checkSYS_JOB_OD_CALC_CTRLクラスの標準コンストラクタ
		 */
		public checkSYS_JOB_OD_CALC_CTRL()
		{
			//{{user_implement_dev:checkSYS_JOB_OD_CALC_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkSYS_JOB_OD_CALC_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_WORK_IN_PROC_BY_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  WORK_ODR_CD, "
+"  WORK_STS_TYP, "
+"  OPR_RSLT_TYP, "
+"  WS_CD, "
+"  PROC_EXPLOSION_FLG "
+"FROM "
+"  T_WORK_IN_PROC_BY_ITEM "
+"WHERE "
+"  OD_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_WORK_IN_PROC_BY_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_WORK_IN_PROC_BY_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_WORK_IN_PROC_BY_ITEM_read
			if(m_selcmd==null) throw new FoundationException("T_WORK_IN_PROC_BY_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_WORK_IN_PROC_BY_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_WORK_IN_PROC_BY_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("T_WORK_IN_PROC_BY_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_WORK_IN_PROC_BY_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_WORK_IN_PROC_BY_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("T_WORK_IN_PROC_BY_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_WORK_IN_PROC_BY_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setWORK_ODR_CD( getString(1, rs) );
			data.setWORK_STS_TYP( getString(2, rs) );
			data.setOPR_RSLT_TYP( getString(3, rs) );
			data.setWS_CD( getString(4, rs) );
			data.setPROC_EXPLOSION_FLG( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_WORK_IN_PROC_BY_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_WORK_IN_PROC_BY_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_WORK_IN_PROC_BY_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_WORK_IN_PROC_BY_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_WORK_IN_PROC_BY_ITEM_clear

			return;
		}

		/**
		 * T_WORK_IN_PROC_BY_ITEMクラスの標準コンストラクタ
		 */
		public T_WORK_IN_PROC_BY_ITEM()
		{
			//{{user_implement_dev:T_WORK_IN_PROC_BY_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_WORK_IN_PROC_BY_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHK_T_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  PUCH_ODR_CD, "
+"  COMPANY_CD, "
+"  VEND_CD, "
+"  PUCH_ODR_STS_TYP "
+"FROM "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  OD_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_T_RLSD_PUCH_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHK_T_RLSD_PUCH_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_RLSD_PUCH_ODR_read
			if(m_selcmd==null) throw new FoundationException("CHK_T_RLSD_PUCH_ODR", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_RLSD_PUCH_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_RLSD_PUCH_ODR_read2
			if(m_selcmd==null) throw new FoundationException("CHK_T_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_T_RLSD_PUCH_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_RLSD_PUCH_ODR_read3
			if(m_selcmd==null) throw new FoundationException("CHK_T_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_T_RLSD_PUCH_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setSub1_PUCH_ODR_CD( getString(1, rs) );
			data.setSub1_COMPANY_CD( getString(2, rs) );
			data.setSub1_VEND_CD( getString(3, rs) );
			data.setPUCH_ODR_STS_TYP( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CHK_T_RLSD_PUCH_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_RLSD_PUCH_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_RLSD_PUCH_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CHK_T_RLSD_PUCH_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHK_T_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * CHK_T_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public CHK_T_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:CHK_T_RLSD_PUCH_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHK_T_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHK_T_RCV_ISSUE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  1 "
+"FROM "
+"  T_RCV_ISSUE "
+"WHERE "
+"  OD_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_T_RCV_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHK_T_RCV_ISSUE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_RCV_ISSUE_read
			if(m_selcmd==null) throw new FoundationException("CHK_T_RCV_ISSUE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_RCV_ISSUE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_RCV_ISSUE_read2
			if(m_selcmd==null) throw new FoundationException("CHK_T_RCV_ISSUE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_T_RCV_ISSUE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_RCV_ISSUE_read3
			if(m_selcmd==null) throw new FoundationException("CHK_T_RCV_ISSUE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_T_RCV_ISSUE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setCOUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CHK_T_RCV_ISSUE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_RCV_ISSUE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_RCV_ISSUE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CHK_T_RCV_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHK_T_RCV_ISSUE_clear

			return;
		}

		/**
		 * CHK_T_RCV_ISSUEクラスの標準コンストラクタ
		 */
		public CHK_T_RCV_ISSUE()
		{
			//{{user_implement_dev:CHK_T_RCV_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHK_T_RCV_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class Sub1T_OD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_OD.\"ODR_STS_TYP\" AS \"ODR_STS_TYP\", "
+"  T_OD.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
+"  TO_DATE(T_OD.\"DUE_DATE\", 'YYYY/MM/DD HH24:MI') "
+"FROM "
+"  T_OD "
+"WHERE "
+"  OD_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Sub1T_OD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Sub1T_OD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Sub1T_OD_read
			if(m_selcmd==null) throw new FoundationException("Sub1T_OD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Sub1T_OD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Sub1T_OD_read2
			if(m_selcmd==null) throw new FoundationException("Sub1T_OD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Sub1T_OD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Sub1T_OD_read3
			if(m_selcmd==null) throw new FoundationException("Sub1T_OD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Sub1T_OD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setODR_STS_TYP( getString(1, rs) );
			data.setOUTSIDE_TYP( getString(2, rs) );
			data.setDUE_DATE( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Sub1T_OD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Sub1T_OD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Sub1T_OD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Sub1T_OD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Sub1T_OD_clear

			return;
		}

		/**
		 * Sub1T_ODクラスの標準コンストラクタ
		 */
		public Sub1T_OD()
		{
			//{{user_implement_dev:Sub1T_OD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Sub1T_OD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHK_T_WORK_IN_PROC_BY_PROC extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_WORK_IN_PROC_BY_PROC.\"FINAL_PROC_FLG\" AS \"FINAL_PROC_FLG\", "
+"  T_WORK_IN_PROC_BY_PROC.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
+"  T_WORK_IN_PROC_BY_PROC.\"OPR_INST_CD\" AS \"OPR_INST_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"WORK_ODR_CD\" AS \"WORK_ODR_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"WORK_IN_PROC_CD\" AS \"WORK_IN_PROC_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"VEND_CD\" AS \"VEND_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"WORK_STS_TYP\" AS \"WORK_STS_TYP\", "
+"  T_WORK_IN_PROC_BY_PROC.\"WS_CD\" AS \"WS_CD\" "
+"FROM "
+"  T_WORK_IN_PROC_BY_PROC "
+"WHERE "
+"  WORK_ODR_CD = ? "
+"ORDER BY "
+"  PROC_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_read
			if(m_selcmd==null) throw new FoundationException("CHK_T_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_read2
			if(m_selcmd==null) throw new FoundationException("CHK_T_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_read3
			if(m_selcmd==null) throw new FoundationException("CHK_T_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWORK_ODR_CD());
				if(isNull(data.getWORK_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWORK_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setFINAL_PROC_FLG( getString(1, rs) );
			data.setOUTSIDE_TYP( getString(2, rs) );
			data.setOPR_INST_CD( getString(3, rs) );
			data.setWORK_ODR_CD( getString(4, rs) );
			data.setWORK_IN_PROC_CD( getString(5, rs) );
			data.setCOMPANY_CD( getString(6, rs) );
			data.setVEND_CD( getString(7, rs) );
			data.setWORK_STS_TYP( getString(8, rs) );
			data.setWS_CD( getString(9, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CHK_T_WORK_IN_PROC_BY_PROC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_clear

			return;
		}

		/**
		 * CHK_T_WORK_IN_PROC_BY_PROCクラスの標準コンストラクタ
		 */
		public CHK_T_WORK_IN_PROC_BY_PROC()
		{
			//{{user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHK_T_WORK_IN_PROC_BY_PROC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHK_T_OPR_RSLT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  NVL(SUM(ACPT_QTY), 0), "
+"  NVL(SUM(DEFECT_QTY), 0) "
+"FROM "
+"  T_OPR_RSLT "
+"WHERE "
+"  OPR_INST_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_T_OPR_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHK_T_OPR_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_OPR_RSLT_read
			if(m_selcmd==null) throw new FoundationException("CHK_T_OPR_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_OPR_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_OPR_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("CHK_T_OPR_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_T_OPR_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_OPR_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("CHK_T_OPR_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_T_OPR_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOPR_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setTOTAL_ACPT_QTY( getString(1, rs) );
			data.setTOTAL_DEFECT_QTY( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CHK_T_OPR_RSLT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_OPR_RSLT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_OPR_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CHK_T_OPR_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHK_T_OPR_RSLT_clear

			return;
		}

		/**
		 * CHK_T_OPR_RSLTクラスの標準コンストラクタ
		 */
		public CHK_T_OPR_RSLT()
		{
			//{{user_implement_dev:CHK_T_OPR_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHK_T_OPR_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class CHK_RLSD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  NVL(SUM(AC.ACPT_QTY), 0) "
+"FROM "
+"  T_ACPT_RSLT AC, "
+"  T_RLSD_PUCH_ODR RL "
+"WHERE "
+"  AC.PUCH_ODR_CD = RL.PUCH_ODR_CD "
+"  AND RL.WORK_ODR_CD = ? "
+"  AND RL.WORK_IN_PROC_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_RLSD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:CHK_RLSD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_RLSD_read
			if(m_selcmd==null) throw new FoundationException("CHK_RLSD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_RLSD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_RLSD_read2
			if(m_selcmd==null) throw new FoundationException("CHK_RLSD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_RLSD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_RLSD_read3
			if(m_selcmd==null) throw new FoundationException("CHK_RLSD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:CHK_RLSD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWORK_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getWORK_IN_PROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setACPT_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("CHK_RLSD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_RLSD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_RLSD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:CHK_RLSD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:CHK_RLSD_clear

			return;
		}

		/**
		 * CHK_RLSDクラスの標準コンストラクタ
		 */
		public CHK_RLSD()
		{
			//{{user_implement_dev:CHK_RLSD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:CHK_RLSD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class chkT_ACPT_RSLT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  NVL(SUM(ACPT_QTY), 0), "
+"  PUCH_ODR_CD "
+"FROM "
+"  T_ACPT_RSLT "
+"WHERE "
+"  PUCH_ODR_CD = ? "
+"GROUP BY "
+"  PUCH_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkT_ACPT_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:chkT_ACPT_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_ACPT_RSLT_read
			if(m_selcmd==null) throw new FoundationException("chkT_ACPT_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkT_ACPT_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_ACPT_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("chkT_ACPT_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkT_ACPT_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_ACPT_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("chkT_ACPT_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkT_ACPT_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_PUCH_ODR_CD());
				if(isNull(data.getSub1_PUCH_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_PUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setACPT_QTY( getString(1, rs) );
			data.setPUCH_ODR_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("chkT_ACPT_RSLT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_ACPT_RSLT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkT_ACPT_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:chkT_ACPT_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:chkT_ACPT_RSLT_clear

			return;
		}

		/**
		 * chkT_ACPT_RSLTクラスの標準コンストラクタ
		 */
		public chkT_ACPT_RSLT()
		{
			//{{user_implement_dev:chkT_ACPT_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:chkT_ACPT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class InsertT_OD1 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_OD(\"OD_NO\", \"ALC_GRP_CD\", \"PLANT_CD\", \"ITEM_CD\", \"PS_EDITION\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"JOB_ODR_CANCEL_NO\", \"ODR_STS_TYP\", \"DM_STS_TYP\", \"OD_TYP\", \"DUE_DATE\", \"ODR_START_DATE\", \"PRD_DUE_DATE\", \"PRD_START_DATE\", \"DM_QTY\", \"ODR_QTY\", \"MRP_ODR_TYP\", \"OUTSIDE_TYP\", \"ISSUE_TYP\", \"ODR_LT\", \"FIXED_LT\", \"PROP_LT\", \"SAFETY_LT\", \"ISSUE_LT\", \"PROP_LOT_SIZE\", \"PS_LT_FLG\", \"PS_FIXED_LT\", \"PS_PROP_LT\", \"PS_PROP_LOT_SIZE\", \"PS_UNIT_QTY\", \"PS_UNIT_DENOMINATOR\", \"PS_UNIT_NUMERATOR\", \"TOTAL_RCV_QTY\", \"RCV_CMPLT_DATE\", \"TOTAL_ISSUE_INST_QTY\", \"TOTAL_ISSUE_QTY\", \"ISSUE_CMPLT_DATE\", \"OD_GNR_TYP\", \"OD_LEVEL_NO\", \"PARENT_OD_NO\", \"ITEM_SPOIL\", \"PS_SPOIL\", \"CONS_TYP\", \"EFF_PHASE_IN_DATE\", \"EFF_PHASE_OUT_DATE\", \"MRP_TYP\", \"EXTERNAL_DM_FLG\", \"ODR_RELEASE_FLG\") "
+"VALUES "
+"  (?, ?, ?, ?, 0, ?, ?, 0, ?, 2, ?, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ?, ?, ?, 0, NULL, 0, 0, NULL, 1, ?, ?, ?, ?, 0, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), 9, 0, 1)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:InsertT_OD1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:InsertT_OD1_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getOD_NO(), stmt);
				setString(8, data.getALC_GRP_CD(), stmt);
				setString(9, data.getPLANT_CD(), stmt);
				setString(10, data.getSub1_Comp_ITEM_CD(), stmt);
				setString(11, data.getJOB_ODR_CD(), stmt);
				setString(12, data.getJOB_ODR_DETAIL_NO(), stmt);
				setString(13, data.getODR_STS_TYP(), stmt);
				setString(14, data.getOD_TYP(), stmt);
				setString(15, data.getL_Sub1_DUE_DATE(), stmt);
				setString(16, data.getL_Sub1_ODR_START_DATE(), stmt);
				setString(17, data.getL_Sub1_PRD_DUE_DATE(), stmt);
				setString(18, data.getL_Sub1_PRD_START_DATE(), stmt);
				setString(19, data.getSub1_DM_QTY(), stmt);
				setString(20, data.getSub1_ODR_QTY(), stmt);
				setString(21, data.getSub1_MRP_ODR_TYP(), stmt);
				setString(22, data.getSub1_OUTSIDE_TYP(), stmt);
				setString(23, data.getISSUE_TYP(), stmt);
				setString(24, data.getODR_LT(), stmt);
				setString(25, data.getFIXED_LT(), stmt);
				setString(26, data.getPROP_LT(), stmt);
				setString(27, data.getSAFETY_LT(), stmt);
				setString(28, data.getISSUE_LT(), stmt);
				setString(29, data.getPROP_LOT_SIZE(), stmt);
				setString(30, data.getSub1_PS_UNIT_QTY(), stmt);
				setString(31, data.getSub1_PS_UNIT_DENOMINATOR(), stmt);
				setString(32, data.getSub1_PS_UNIT_NUMERATOR(), stmt);
				setString(33, data.getOD_LEVEL_NO(), stmt);
				setString(34, data.getPARENT_OD_NO(), stmt);
				setString(35, data.getSub1_ITEM_SPOIL(), stmt);
				setString(36, data.getSub1_PS_SPOIL(), stmt);
				setString(37, data.getEFF_PHASE_IN_DATE(), stmt);
				setString(38, data.getEFF_PHASE_OUT_DATE(), stmt);

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
			//{{user_implement_dev:InsertT_OD1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:InsertT_OD1_clear

			return;
		}

		/**
		 * InsertT_OD1クラスの標準コンストラクタ
		 */
		public InsertT_OD1()
		{
			//{{user_implement_dev:InsertT_OD1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:InsertT_OD1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class InsertT_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_ISSUE_INST(\"ISSUE_INST_CD\", \"PLANT_CD\", \"OD_NO\", \"ITEM_CD\", \"PS_EDITION\", \"PUCH_ODR_CD\", \"COMPANY_CD\", \"VEND_CD\", \"CONS_TYP\", \"WORK_ODR_CD\", \"WORK_IN_PROC_CD\", \"WS_CD\", \"WH_CD\", \"ISSUE_INST_UNIT_QTY\", \"ISSUE_INST_UNIT_DENOMINATOR\", \"ISSUE_INST_UNIT_NUMERATOR\", \"ISSUE_INST_QTY\", \"TOTAL_ISSUE_QTY\", \"SCDL_ISSUE_DATE\", \"ISSUE_CMPLT_DATE\", \"ISSUE_TYP\", \"ISSUE_CMPLT_FLG\", \"ISSUE_INST_ISS_FLG\", \"ISSUE_INST_ISS_DATE\", \"ISSUE_INST_COMMENT\") "
+"VALUES "
+"  (?, ?, ?, ?, 0, ?, ?, ?, 0, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), NULL, ?, 0, 0, NULL, NULL)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:InsertT_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:InsertT_ISSUE_INST_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(8, data.getPLANT_CD(), stmt);
				setString(9, data.getOD_NO(), stmt);
				setString(10, data.getSub1_Comp_ITEM_CD(), stmt);
				setString(11, data.getSub1_PUCH_ODR_CD(), stmt);
				setString(12, data.getSub1_COMPANY_CD(), stmt);
				setString(13, data.getSub1_VEND_CD(), stmt);
				setString(14, data.getWORK_ODR_CD(), stmt);
				setString(15, data.getSub1_WORK_IN_PROC_CD(), stmt);
				setString(16, data.getWS_CD(), stmt);
				setString(17, data.getWH_CD(), stmt);
				setString(18, data.getSub1_PS_UNIT_QTY(), stmt);
				setString(19, data.getSub1_PS_UNIT_DENOMINATOR(), stmt);
				setString(20, data.getSub1_PS_UNIT_NUMERATOR(), stmt);
				setString(21, data.getSub1_DM_QTY(), stmt);
				setString(22, data.getL_Sub1_DUE_DATE(), stmt);
				setString(23, data.getISSUE_TYP(), stmt);

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
			//{{user_implement_dev:InsertT_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:InsertT_ISSUE_INST_clear

			return;
		}

		/**
		 * InsertT_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public InsertT_ISSUE_INST()
		{
			//{{user_implement_dev:InsertT_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:InsertT_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectPUCH_ODR_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  \"PUCH_ODR_CD\" "
+"FROM "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  WORK_ODR_CD = ? "
+"  AND WORK_IN_PROC_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectPUCH_ODR_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectPUCH_ODR_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectPUCH_ODR_CD_read
			if(m_selcmd==null) throw new FoundationException("selectPUCH_ODR_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectPUCH_ODR_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectPUCH_ODR_CD_read2
			if(m_selcmd==null) throw new FoundationException("selectPUCH_ODR_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectPUCH_ODR_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectPUCH_ODR_CD_read3
			if(m_selcmd==null) throw new FoundationException("selectPUCH_ODR_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectPUCH_ODR_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWORK_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getWORK_IN_PROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setSub1_PUCH_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectPUCH_ODR_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectPUCH_ODR_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectPUCH_ODR_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectPUCH_ODR_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectPUCH_ODR_CD_clear

			return;
		}

		/**
		 * selectPUCH_ODR_CDクラスの標準コンストラクタ
		 */
		public selectPUCH_ODR_CD()
		{
			//{{user_implement_dev:selectPUCH_ODR_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectPUCH_ODR_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectWH_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  WS.WH_CD "
+"FROM "
+"  M_WS WS, "
+"  T_WORK_IN_PROC_BY_PROC WP "
+"WHERE "
+"  WS.WS_CD = WP.WS_CD "
+"  AND WP.WORK_ODR_CD = ? "
+"  AND WP.OUTSIDE_TYP = 1 "
+"ORDER BY "
+"  PROC_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectWH_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectWH_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectWH_CD_read
			if(m_selcmd==null) throw new FoundationException("selectWH_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectWH_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectWH_CD_read2
			if(m_selcmd==null) throw new FoundationException("selectWH_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectWH_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectWH_CD_read3
			if(m_selcmd==null) throw new FoundationException("selectWH_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectWH_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWORK_ODR_CD());
				if(isNull(data.getWORK_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWORK_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setWH_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectWH_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectWH_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectWH_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectWH_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectWH_CD_clear

			return;
		}

		/**
		 * selectWH_CDクラスの標準コンストラクタ
		 */
		public selectWH_CD()
		{
			//{{user_implement_dev:selectWH_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectWH_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class mInsertT_ISSUE_INST1 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_ISSUE_INST(\"ISSUE_INST_CD\", \"PLANT_CD\", \"OD_NO\", \"ITEM_CD\", \"PS_EDITION\", \"PUCH_ODR_CD\", \"COMPANY_CD\", \"VEND_CD\", \"CONS_TYP\", \"WORK_ODR_CD\", \"WORK_IN_PROC_CD\", \"WS_CD\", \"WH_CD\", \"ISSUE_INST_UNIT_QTY\", \"ISSUE_INST_UNIT_DENOMINATOR\", \"ISSUE_INST_UNIT_NUMERATOR\", \"ISSUE_INST_QTY\", \"TOTAL_ISSUE_QTY\", \"SCDL_ISSUE_DATE\", \"ISSUE_CMPLT_DATE\", \"ISSUE_TYP\", \"ISSUE_CMPLT_FLG\", \"ISSUE_INST_ISS_FLG\", \"ISSUE_INST_ISS_DATE\", \"ISSUE_INST_COMMENT\") "
+"VALUES "
+"  (?, ?, ?, ?, 0, ?, ?, ?, to_number(?), NULL, NULL, NULL, ?, to_number(?), to_number(?), to_number(?), to_number(?), 0, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), NULL, to_number(?), 0, 0, NULL, NULL)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:mInsertT_ISSUE_INST1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:mInsertT_ISSUE_INST1_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(8, data.getPLANT_CD(), stmt);
				setString(9, data.getOD_NO(), stmt);
				setString(10, data.getSub1_Comp_ITEM_CD(), stmt);
				setString(11, data.getSub1_PUCH_ODR_CD(), stmt);
				setString(12, data.getSub1_COMPANY_CD(), stmt);
				setString(13, data.getSub1_VEND_CD(), stmt);
				setString(14, data.getCONS_TYP(), stmt);
				setString(15, data.getWH_CD(), stmt);
				setString(16, data.getSub1_PS_UNIT_QTY(), stmt);
				setString(17, data.getSub1_PS_UNIT_DENOMINATOR(), stmt);
				setString(18, data.getSub1_PS_UNIT_NUMERATOR(), stmt);
				setString(19, data.getSub1_DM_QTY(), stmt);
				setString(20, data.getL_Sub1_DUE_DATE(), stmt);
				setString(21, data.getISSUE_TYP(), stmt);

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
			//{{user_implement_dev:mInsertT_ISSUE_INST1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:mInsertT_ISSUE_INST1_clear

			return;
		}

		/**
		 * mInsertT_ISSUE_INST1クラスの標準コンストラクタ
		 */
		public mInsertT_ISSUE_INST1()
		{
			//{{user_implement_dev:mInsertT_ISSUE_INST1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:mInsertT_ISSUE_INST1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class chkM_CONS_UNIT_COST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ONEROUS_FLG "
+"FROM "
+"  M_CONS_UNIT_COST "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND VEND_CD = ? "
+"  AND PLANT_CD = ? "
+"  AND ITEM_CD = ? "
+"  AND TO_DATE(EFF_PHASE_IN_DATE, 'YYYY/MM/DD') <= ? "
+"ORDER BY "
+"  EFF_PHASE_IN_DATE DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkM_CONS_UNIT_COST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:chkM_CONS_UNIT_COST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkM_CONS_UNIT_COST_read
			if(m_selcmd==null) throw new FoundationException("chkM_CONS_UNIT_COST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkM_CONS_UNIT_COST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkM_CONS_UNIT_COST_read2
			if(m_selcmd==null) throw new FoundationException("chkM_CONS_UNIT_COST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkM_CONS_UNIT_COST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkM_CONS_UNIT_COST_read3
			if(m_selcmd==null) throw new FoundationException("chkM_CONS_UNIT_COST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:chkM_CONS_UNIT_COST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_COMPANY_CD());
				if(isNull(data.getSub1_COMPANY_CD())) isNull = true;
				ary.addElement(data.getSub1_VEND_CD());
				if(isNull(data.getSub1_VEND_CD())) isNull = true;
				ary.addElement(data.getSysPLANT_CD());
				if(isNull(data.getSysPLANT_CD())) isNull = true;
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;
				ary.addElement(data.getSub1_DUE_DATE());
				if(isNull(data.getSub1_DUE_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_COMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_VEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSysPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_DUE_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setONEROUS_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("chkM_CONS_UNIT_COST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkM_CONS_UNIT_COST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkM_CONS_UNIT_COST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:chkM_CONS_UNIT_COST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:chkM_CONS_UNIT_COST_clear

			return;
		}

		/**
		 * chkM_CONS_UNIT_COSTクラスの標準コンストラクタ
		 */
		public chkM_CONS_UNIT_COST()
		{
			//{{user_implement_dev:chkM_CONS_UNIT_COST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:chkM_CONS_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectinWH_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  WH_CD "
+"FROM "
+"  M_WH "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND VEND_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectinWH_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectinWH_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectinWH_CD_read
			if(m_selcmd==null) throw new FoundationException("selectinWH_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectinWH_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectinWH_CD_read2
			if(m_selcmd==null) throw new FoundationException("selectinWH_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectinWH_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectinWH_CD_read3
			if(m_selcmd==null) throw new FoundationException("selectinWH_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectinWH_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_COMPANY_CD());
				if(isNull(data.getSub1_COMPANY_CD())) isNull = true;
				ary.addElement(data.getSub1_VEND_CD());
				if(isNull(data.getSub1_VEND_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_COMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_VEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setWH_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectinWH_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectinWH_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectinWH_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectinWH_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectinWH_CD_clear

			return;
		}

		/**
		 * selectinWH_CDクラスの標準コンストラクタ
		 */
		public selectinWH_CD()
		{
			//{{user_implement_dev:selectinWH_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectinWH_CD_constractor

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
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
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
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getNAME(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setVALUE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
	public class insertT_WORK_IN_PROC_BY_ITEM extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_WORK_IN_PROC_BY_ITEM(\"WORK_ODR_CD\", \"PLANT_CD\", \"OD_NO\", \"ITEM_CD\", \"WS_CD\", \"OPR_INST_START_DATE\", \"WORK_ODR_DLV_DATE\", \"OPR_INST_QTY\", \"OPR_RSLT_TYP\", \"WORK_STS_TYP\", \"PROC_EXPLOSION_FLG\", \"OPR_INST_DATE\", \"WORK_CMPLT_DATE\", \"OPR_INST_CD\", \"WORK_IN_PROC_COMMENT\") "
+"VALUES "
+"  (?, ?, ?, ?, NULL, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), to_number(?), to_number(?), 1, 0, NULL, NULL, NULL, NULL)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_WORK_IN_PROC_BY_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_WORK_IN_PROC_BY_ITEM_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getWORK_ODR_CD(), stmt);
				setString(8, data.getPLANT_CD(), stmt);
				setString(9, data.getOD_NO(), stmt);
				setString(10, data.getSub1_Comp_ITEM_CD(), stmt);
				setString(11, data.getL_Sub1_PRD_DUE_DATE(), stmt);
				setString(12, data.getL_Sub1_PRD_START_DATE(), stmt);
				setString(13, data.getSub1_ODR_QTY(), stmt);
				setString(14, data.getOPR_RSLT_TYP(), stmt);

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
			//{{user_implement_dev:insertT_WORK_IN_PROC_BY_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_WORK_IN_PROC_BY_ITEM_clear

			return;
		}

		/**
		 * insertT_WORK_IN_PROC_BY_ITEMクラスの標準コンストラクタ
		 */
		public insertT_WORK_IN_PROC_BY_ITEM()
		{
			//{{user_implement_dev:insertT_WORK_IN_PROC_BY_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_WORK_IN_PROC_BY_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_RLSD_PUCH_ODR(\"PUCH_ODR_CD\", \"ITEM_CD\", \"WH_CD\", \"NON_NO_ITEM_NAME\", \"NON_NO_ITEM_TYP\", \"COMPANY_CD\", \"VEND_CD\", \"PLANT_CD\", \"PUCH_ODR_PERSON\", \"PUCH_ODR_START_DATE\", \"PUCH_ODR_DLV_DATE\", \"PUCH_ODR_QTY\", \"NON_NO_ITEM_PUCH_ODR_UNIT\", \"UNIT_COST_TYP\", \"UNIT_COST\", \"PROCESSING_COST\", \"MATERIAL_COST\", \"OTHER_OVERHEADS\", \"DISC_AMOUNT\", \"PUCH_ODR_AMOUNT\", \"PUCH_ODR_GNR_TYP\", \"PUCH_ODR_INST_DATE\", \"PUCH_ODR_INST_SLIP_ISS_FLG\", \"PUCH_ODR_SLIP_ISS_DATE\", \"ACPT_CMPLT_DATE\", \"PUCH_ODR_STS_TYP\", \"INSPC_CMPLT_FLG\", \"INSPC_CMPLT_DATE\", \"CONFIRM_DLV_DATE\", \"SPL_ITEM_TYP\", \"ACPT_INSPC_TYP\", \"INV_CTRL_FLG\", \"WORK_ODR_CD\", \"WORK_IN_PROC_CD\", \"OD_NO\", \"PUCH_ODR_COMMENT\", \"ODR_CD\", \"DETAIL_NO\", \"RATE_JUDGE_DATE\", \"EXCH_RATE\", \"TAX_RATE_1\", \"TAX_RATE_2\", \"TAX_RATE_3\", \"NET_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"AMOUNT_INCLUDE_TAX\", \"HOME_CUR_AMOUNT\", \"TAX_CD\", \"TAX_ROUND_TYP\", \"NON_NO_ITEM_FLG\", \"PUCH_ODR_EDI_ISS_FLG\", \"PUCH_ODR_EDI_ISS_DATE\", \"ODR_CANCEL_EDI_ISS_DATE\", \"PUCH_ODR_FAX_ISS_FLG\", \"PUCH_ODR_FAX_ISS_DATE\", \"PUCH_ODR_MAIL_ISS_FLG\", \"PUCH_ODR_MAIL_ISS_DATE\", \"CONFIRM_DLV_DATE_COMMENT\", \"ODR_CANCEL_SLIP_ISS_FLG\", \"ODR_CANCEL_SLIP_ISS_DATE\", \"ODR_CANCEL_CAUSE_CD\", \"DIRECT_FLG\", \"CUST_CD\", \"ODR_H_NO\", \"ODR_D_SEQ_NO\", \"DELV_CD\") "
+"values "
+"  (?, ?, ?, NULL, 0, ?, ?, ?, ?, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), TO_DATE(?, 'YYYY/MM/DD HH24:MI'), to_number(?), NULL, to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), 0, to_number(?), 2, NULL, 0, NULL, NULL, 1, 0, NULL, NULL, to_number(?), to_number(?), 1, NULL, NULL, ?, NULL, NULL, 0, TO_DATE(?, 'YYYY/MM/DD HH24:MI'), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), ?, to_number(?), 0, 0, NULL, NULL, 0, NULL, 0, NULL, NULL, 0, NULL, NULL, 0, NULL, NULL, NULL, NULL)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_RLSD_PUCH_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_RLSD_PUCH_ODR_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
				setString(8, data.getSub1_Comp_ITEM_CD(), stmt);
				setString(9, data.getWH_CD(), stmt);
				setString(10, data.getMY_COMPANY(), stmt);
				setString(11, data.getPVEND_CD(), stmt);
				setString(12, data.getPLANT_CD(), stmt);
				setString(13, data.getPUCH_ODR_PERSON(), stmt);
				setString(14, data.getL_Sub1_PRD_START_DATE(), stmt);
				setString(15, data.getL_Sub1_PRD_DUE_DATE(), stmt);
				setString(16, data.getSub1_ODR_QTY(), stmt);
				setString(17, data.getUNIT_COST_TYP(), stmt);
				setString(18, data.getUNIT_COST(), stmt);
				setString(19, data.getPROCESSING_COST(), stmt);
				setString(20, data.getMATERIAL_COST(), stmt);
				setString(21, data.getOTHER_OVERHEADS(), stmt);
				setString(22, data.getPUCH_ODR_AMOUNT(), stmt);
				setString(23, data.getSPL_ITEM_TYP(), stmt);
				setString(24, data.getACPT_INSPC_TYP(), stmt);
				setString(25, data.getOD_NO(), stmt);
				setString(26, data.getL_Sub1_PRD_DUE_DATE(), stmt);
				setString(27, data.getEXCH_RATE(), stmt);
				setString(28, data.getTAX_RATE_1(), stmt);
				setString(29, data.getTAX_RATE_2(), stmt);
				setString(30, data.getTAX_RATE_3(), stmt);
				setString(31, data.getPUCH_ODR_AMOUNT(), stmt);
				setString(32, data.getTAX_AMOUNT_1(), stmt);
				setString(33, data.getTAX_AMOUNT_2(), stmt);
				setString(34, data.getTAX_AMOUNT_3(), stmt);
				setString(35, data.getAMOUNT_INCLUDE_TAX(), stmt);
				setString(36, data.getHOME_CUR_AMOUNT(), stmt);
				setString(37, data.getTAX_CD(), stmt);
				setString(38, data.getTAX_ROUND_TYP(), stmt);

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
			//{{user_implement_dev:insertT_RLSD_PUCH_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * insertT_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public insertT_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:insertT_RLSD_PUCH_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectRCV_WH1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM_RCV_WH.WH_CD AS WH_CD "
+"FROM "
+"  M_ITEM_RCV_WH, "
+"  M_WH "
+"WHERE "
+"  M_ITEM_RCV_WH.WH_CD = M_WH.WH_CD "
+"  AND M_ITEM_RCV_WH.PLANT_CD = ? "
+"  AND M_ITEM_RCV_WH.ITEM_CD = ? "
+"  AND M_WH.MRP_FLG = 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectRCV_WH1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectRCV_WH1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH1_read
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectRCV_WH1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH1_read2
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectRCV_WH1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH1_read3
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH1", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectRCV_WH1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setWH_CD1( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH1", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectRCV_WH1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectRCV_WH1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectRCV_WH1_clear

			return;
		}

		/**
		 * selectRCV_WH1クラスの標準コンストラクタ
		 */
		public selectRCV_WH1()
		{
			//{{user_implement_dev:selectRCV_WH1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectRCV_WH1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectRCV_WH2 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MIN(M_WH.WH_CD) AS WH_CD "
+"FROM "
+"  M_WH "
+"WHERE "
+"  M_WH.PLANT_CD = ? "
+"  AND M_WH.WH_OUTSIDE_FLG = 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectRCV_WH2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectRCV_WH2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH2_read
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectRCV_WH2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH2_read2
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectRCV_WH2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH2_read3
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectRCV_WH2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setWH_CD2( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH2", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectRCV_WH2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectRCV_WH2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectRCV_WH2_clear

			return;
		}

		/**
		 * selectRCV_WH2クラスの標準コンストラクタ
		 */
		public selectRCV_WH2()
		{
			//{{user_implement_dev:selectRCV_WH2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectRCV_WH2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectRCV_WH3 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MIN(M_WH.WH_CD) AS WH_CD "
+"FROM "
+"  M_WH "
+"WHERE "
+"  M_WH.PLANT_CD = ? "
+"  AND M_WH.MRP_FLG = 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectRCV_WH3_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectRCV_WH3_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH3_read
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH3", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectRCV_WH3_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH3_read2
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH3", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectRCV_WH3_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH3_read3
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH3", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectRCV_WH3_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setWH_CD3( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectRCV_WH3", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectRCV_WH3_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectRCV_WH3_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectRCV_WH3_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectRCV_WH3_clear

			return;
		}

		/**
		 * selectRCV_WH3クラスの標準コンストラクタ
		 */
		public selectRCV_WH3()
		{
			//{{user_implement_dev:selectRCV_WH3_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectRCV_WH3_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteT_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_ISSUE_INST "
+"WHERE "
+"  T_ISSUE_INST.\"OD_NO\" = ? "
+"  AND T_ISSUE_INST.\"OD_NO\" IN ( "
+"    SELECT "
+"      T_OD.\"OD_NO\" "
+"    FROM "
+"      T_OD "
+"    WHERE "
+"      T_OD.\"DM_STS_TYP\" = 2 "
+"  )";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteT_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteT_ISSUE_INST_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getOD_NO(), stmt);

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
			//{{user_implement_dev:deleteT_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteT_ISSUE_INST_clear

			return;
		}

		/**
		 * deleteT_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public deleteT_ISSUE_INST()
		{
			//{{user_implement_dev:deleteT_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteT_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteT_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  T_RLSD_PUCH_ODR.\"OD_NO\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"OD_NO\" IN ( "
+"    SELECT "
+"      T_OD.\"OD_NO\" "
+"    FROM "
+"      T_OD "
+"    WHERE "
+"      T_OD.\"OD_TYP\" = 1 "
+"      AND T_OD.\"ODR_STS_TYP\" = 2 "
+"      AND T_OD.\"OUTSIDE_TYP\" = 2 "
+"  )";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteT_RLSD_PUCH_ODR_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteT_RLSD_PUCH_ODR_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getOD_NO(), stmt);

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
			//{{user_implement_dev:deleteT_RLSD_PUCH_ODR_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteT_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * deleteT_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public deleteT_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:deleteT_RLSD_PUCH_ODR_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteT_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteT_WORK_IN_PROC_BY_ITEM extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_WORK_IN_PROC_BY_ITEM "
+"WHERE "
+"  T_WORK_IN_PROC_BY_ITEM.\"OD_NO\" = ? "
+"  AND T_WORK_IN_PROC_BY_ITEM.\"OD_NO\" IN ( "
+"    SELECT "
+"      T_OD.\"OD_NO\" "
+"    FROM "
+"      T_OD "
+"    WHERE "
+"      T_OD.\"OD_TYP\" = 1 "
+"      AND T_OD.\"ODR_STS_TYP\" = 2 "
+"      AND T_OD.\"OUTSIDE_TYP\" = 1 "
+"  )";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteT_WORK_IN_PROC_BY_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteT_WORK_IN_PROC_BY_ITEM_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getOD_NO(), stmt);

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
			//{{user_implement_dev:deleteT_WORK_IN_PROC_BY_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteT_WORK_IN_PROC_BY_ITEM_clear

			return;
		}

		/**
		 * deleteT_WORK_IN_PROC_BY_ITEMクラスの標準コンストラクタ
		 */
		public deleteT_WORK_IN_PROC_BY_ITEM()
		{
			//{{user_implement_dev:deleteT_WORK_IN_PROC_BY_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteT_WORK_IN_PROC_BY_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectPVEND_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  VEND_CD "
+"FROM "
+"  M_PUCH_UNIT_COST_H "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND PLANT_CD = ? "
+"  AND ITEM_CD = ? "
+"ORDER BY "
+"  PUCH_PRIORITY_REF_NO ASC, "
+"  VEND_CD ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectPVEND_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectPVEND_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectPVEND_CD_read
			if(m_selcmd==null) throw new FoundationException("selectPVEND_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectPVEND_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectPVEND_CD_read2
			if(m_selcmd==null) throw new FoundationException("selectPVEND_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectPVEND_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectPVEND_CD_read3
			if(m_selcmd==null) throw new FoundationException("selectPVEND_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectPVEND_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getMY_COMPANY());
				if(isNull(data.getMY_COMPANY())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getMY_COMPANY(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setPVEND_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectPVEND_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectPVEND_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectPVEND_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectPVEND_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectPVEND_CD_clear

			return;
		}

		/**
		 * selectPVEND_CDクラスの標準コンストラクタ
		 */
		public selectPVEND_CD()
		{
			//{{user_implement_dev:selectPVEND_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectPVEND_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selOWN_PERSON_NAME extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  OWN_PERSON_NAME "
+"FROM "
+"  M_VEND_CTRL "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND VEND_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selOWN_PERSON_NAME_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selOWN_PERSON_NAME_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selOWN_PERSON_NAME_read
			if(m_selcmd==null) throw new FoundationException("selOWN_PERSON_NAME", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selOWN_PERSON_NAME_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selOWN_PERSON_NAME_read2
			if(m_selcmd==null) throw new FoundationException("selOWN_PERSON_NAME", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selOWN_PERSON_NAME_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selOWN_PERSON_NAME_read3
			if(m_selcmd==null) throw new FoundationException("selOWN_PERSON_NAME", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selOWN_PERSON_NAME_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getMY_COMPANY());
				if(isNull(data.getMY_COMPANY())) isNull = true;
				ary.addElement(data.getPVEND_CD());
				if(isNull(data.getPVEND_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getMY_COMPANY(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPVEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setOWN_PERSON_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selOWN_PERSON_NAME", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selOWN_PERSON_NAME_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selOWN_PERSON_NAME_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selOWN_PERSON_NAME_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selOWN_PERSON_NAME_clear

			return;
		}

		/**
		 * selOWN_PERSON_NAMEクラスの標準コンストラクタ
		 */
		public selOWN_PERSON_NAME()
		{
			//{{user_implement_dev:selOWN_PERSON_NAME_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selOWN_PERSON_NAME_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SYS_BAT_PARM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_BAT_PARM.\"PROGRAM_CD\" AS \"PROGRAM_CD\", "
+"  SYS_BAT_PARM.\"FILE_PATH\" AS \"FILE_PATH\", "
+"  SYS_BAT_PARM.\"FILE_NAME\" AS \"FILE_NAME\", "
+"  SYS_BAT_PARM.\"LOG_MODE_TYP\" AS \"LOG_MODE_TYP\", "
+"  SYS_BAT_PARM.\"OUTPUT_MODE_TYP\" AS \"OUTPUT_MODE_TYP\" "
+"FROM "
+"  SYS_BAT_PARM "
+"WHERE "
+"  SYS_BAT_PARM.\"PROGRAM_CD\" = 'AC0120010' "
+"  AND SYS_BAT_PARM.\"FUNCTION_NAME\" = 'SQLCALCTAXCALCAMT'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_BAT_PARM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SYS_BAT_PARM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_BAT_PARM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read2
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_BAT_PARM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_read3
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SYS_BAT_PARM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setPVC2BUSINESSNAME( getString(1, rs) );
			data.setPVC2OUTPUTPATH( getString(2, rs) );
			data.setPVC2OUTPUTNAME( getString(3, rs) );
			data.setPVC2LOGMODE( getString(4, rs) );
			data.setPVC2OUTPUTMODE( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_BAT_PARM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_BAT_PARM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_BAT_PARM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_BAT_PARM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SYS_BAT_PARM_clear

			return;
		}

		/**
		 * SYS_BAT_PARMクラスの標準コンストラクタ
		 */
		public SYS_BAT_PARM()
		{
			//{{user_implement_dev:SYS_BAT_PARM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SYS_BAT_PARM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class callSQLCALCTAXCALCAMTFD extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = "{" + "call SQLCALCTAXCALCAMT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" + "}";



		//////////////////////////////

		//{{user_implement_dev:callSQLCALCTAXCALCAMTFD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:callSQLCALCTAXCALCAMTFD_def

		/**
		 * Stored Procudure処理
		 *
		 * @return Listインスタンスで実行結果を返します
		 * @param IDbConnection
		 * @param AC0120010Struct
		 * @exception FoundationException, SQLException
		 */
		public List call(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:callSQLCALCTAXCALCAMTFD_call_storedproc
				// todo: Stored Procedure実行時の処理を記述してください
			return call(conn.getConn(), data);
                        //}}user_implement_dev:callSQLCALCTAXCALCAMTFD_call_storedproc
		}

		/**
		 * Stored Procudure処理
		 *
		 * @return Listインスタンスで実行結果を返します
		 * @param Connection
		 * @param AC0120010Struct
		 * @exception FoundationException, SQLException
		 */
		public List call(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			CallableStatement cstmt = null;

			try {
				cstmt = conn.prepareCall(m_spcmd);

				setString(1, data.getPVC2LOGMODE(), cstmt);
				setString(2, data.getPVC2OUTPUTMODE(), cstmt);
				setString(3, data.getPVC2OUTPUTPATH(), cstmt);
				setString(4, data.getPVC2OUTPUTNAME(), cstmt);
				setString(5, data.getPVC2USERID(), cstmt);
				setString(6, data.getPVC2BUSINESSNAME(), cstmt);
				setString(7, data.getPVC2PLANTCD(), cstmt);
				setString(8, data.getPVC2TAXID(), cstmt);
				setString(9, data.getTAX_RATE_1(), cstmt);
				setString(10, data.getTAX_RATE_2(), cstmt);
				setString(11, data.getTAX_RATE_3(), cstmt);
				setString(12, data.getTAX_ROUND_TYP(), cstmt);
				setString(13, data.getVEND_DECIMAL_FIG(), cstmt);
				setString(14, data.getNET_AMOUNT(), cstmt);

				registerOutParameterString(15, cstmt);
				registerOutParameterString(16, cstmt);
				registerOutParameterString(17, cstmt);
				registerOutParameterString(18, cstmt);
				registerOutParameterString(19, cstmt);
				registerOutParameterString(20, cstmt);
				registerOutParameterString(21, cstmt);
				registerOutParameterString(22, cstmt);
				registerOutParameterString(23, cstmt);
				registerOutParameterString(24, cstmt);
				registerOutParameterString(25, cstmt);
				registerOutParameterString(26, cstmt);
				registerOutParameterString(27, cstmt);

				cstmt.execute();
				List list = new ArrayList();
				ResultSet rs = cstmt.getResultSet();
				if(rs != null) {
					while((data=call(rs)) != null) {
						list.add(data);
					}
				} else {
					data.setTAX_AMOUNT_1( getString(15, cstmt) );
					data.setTAX_AMOUNT_2( getString(16, cstmt) );
					data.setTAX_AMOUNT_3( getString(17, cstmt) );
					data.setPNUMTAXOUTAMOUNT( getString(18, cstmt) );
					data.setPNUMTAXAMOUNT( getString(19, cstmt) );
					data.setAMOUNT_INCLUDE_TAX( getString(20, cstmt) );
					data.setPNUMEXTERNALTAXSALESAMOUNT( getString(21, cstmt) );
					data.setPNUMINTERNALTAXSALESAMOUNT( getString(22, cstmt) );
					data.setPNUMTAXFREESALESAMOUNT( getString(23, cstmt) );
					data.setPNUMEXTERNALTAXAMOUNT( getString(24, cstmt) );
					data.setPNUMINTERNALTAXAMOUNT( getString(25, cstmt) );
					data.setPVC2ERRCD( getString(26, cstmt) );
					data.setPNUMSTATUS( getString(27, cstmt) );
					list.add(data);
				}

				return list;
			} finally {
				if(cstmt!=null) {
					cstmt.close();
					cstmt = null;
				}
			}
		}

		/**
		 * Stored Procudure処理
		 *
		 * @return AC0120010Structインスタンスで実行結果を返します
		 * @param ResultSet
		 * @exception FoundationException, SQLException
		 */
		public AC0120010Struct call(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs == null || rs.next()==false) return null;
			AC0120010Struct data = new AC0120010Struct();
			data.setTAX_AMOUNT_1( getString(15, rs) );
			data.setTAX_AMOUNT_2( getString(16, rs) );
			data.setTAX_AMOUNT_3( getString(17, rs) );
			data.setPNUMTAXOUTAMOUNT( getString(18, rs) );
			data.setPNUMTAXAMOUNT( getString(19, rs) );
			data.setAMOUNT_INCLUDE_TAX( getString(20, rs) );
			data.setPNUMEXTERNALTAXSALESAMOUNT( getString(21, rs) );
			data.setPNUMINTERNALTAXSALESAMOUNT( getString(22, rs) );
			data.setPNUMTAXFREESALESAMOUNT( getString(23, rs) );
			data.setPNUMEXTERNALTAXAMOUNT( getString(24, rs) );
			data.setPNUMINTERNALTAXAMOUNT( getString(25, rs) );
			data.setPVC2ERRCD( getString(26, rs) );
			data.setPNUMSTATUS( getString(27, rs) );
			return data;
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:callSQLCALCTAXCALCAMTFD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:callSQLCALCTAXCALCAMTFD_clear

			return;
		}

		/**
		 * callSQLCALCTAXCALCAMTFDクラスの標準コンストラクタ
		 */
		public callSQLCALCTAXCALCAMTFD()
		{
			//{{user_implement_dev:callSQLCALCTAXCALCAMTFD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:callSQLCALCTAXCALCAMTFD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SPL_ITEM_TYP, "
+"  ACPT_INSPC_TYP "
+"FROM "
+"  M_ITEM "
+"WHERE "
+"  ITEM_CD = ?";
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
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
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
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1_Comp_ITEM_CD());
				if(isNull(data.getSub1_Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1_Comp_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setSPL_ITEM_TYP( getString(1, rs) );
			data.setACPT_INSPC_TYP( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
	public class deleteT_OD1 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_OD "
+"WHERE "
+"  T_OD.\"OD_NO\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteT_OD1_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteT_OD1_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getOD_NO(), stmt);

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
			//{{user_implement_dev:deleteT_OD1_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteT_OD1_clear

			return;
		}

		/**
		 * deleteT_OD1クラスの標準コンストラクタ
		 */
		public deleteT_OD1()
		{
			//{{user_implement_dev:deleteT_OD1_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteT_OD1_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class csvPdata extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"OD_NO\" as \"Parent_OD_NO\", "
+"  T_OD.\"ITEM_CD\" as \"Parent_ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"Parent_ITEM_NAME\", "
+"  M_ITEM.\"DRAW_CD\" as \"Parent_DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"Parent_SPEC\", "
+"  to_char(T_OD.\"OUTSIDE_TYP\") as \"Parent_OUTSIDE_TYP\", "
+"  to_char(T_OD.\"DUE_DATE\", 'YYYY/MM/DD') as \"DUE_DATE\", "
+"  to_char(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') as \"PRD_DUE_DATE\", "
+"  to_char(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') as \"PRD_START_DATE\", "
+"  to_char(T_OD.\"ODR_START_DATE\", 'YYYY/MM/DD') as \"ODR_START_DATE\", "
+"  to_char(T_OD.\"DM_QTY\") as \"DM_QTY\", "
+"  to_char(T_OD.\"ODR_QTY\") as \"ODR_QTY\", "
+"  to_char(nvl(T.\"SUM_ALCD_QTY\", 0)) as \"SUM_ALCD_QTY\", "
+"  T_OD.\"ODR_STS_TYP\", "
+"  T_OD.\"DM_STS_TYP\", "
+"  T_OD.\"OD_TYP\", "
+"  to_char(T_OD.\"TOTAL_RCV_QTY\") as \"TOTAL_RCV_QTY\", "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\") as \"TOTAL_ISSUE_QTY\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as SUM_ALCD_QTY "
+"    from "
+"      T_JOB_ODR_ALC "
+"    group by "
+"      T_JOB_ODR_ALC.\"OD_NO\" "
+"  ) T "
+"where "
+"  T_OD.\"OD_NO\" = ? "
+"  AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_OD.\"OD_NO\" = T.OD_NO(+)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:csvPdata_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:csvPdata_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:csvPdata_read
			if(m_selcmd==null) throw new FoundationException("csvPdata", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:csvPdata_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:csvPdata_read2
			if(m_selcmd==null) throw new FoundationException("csvPdata", "read", "クエリー未登録");
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
                        //}}user_implement_dev:csvPdata_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:csvPdata_read3
			if(m_selcmd==null) throw new FoundationException("csvPdata", "read", "クエリー未登録");
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
                        //}}user_implement_dev:csvPdata_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPARENT_OD_NO());
				if(isNull(data.getPARENT_OD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPARENT_OD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setPARENT_OD_NO( getString(1, rs) );
			data.setPARENT_ITEM_CD( getString(2, rs) );
			data.setPARENT_ITEM_NAME( getString(3, rs) );
			data.setPARENT_DRAW_CD( getString(4, rs) );
			data.setPARENT_SPEC( getString(5, rs) );
			data.setPARENT_OUTSIDE_TYP( getString(6, rs) );
			data.setDUE_DATE( getString(7, rs) );
			data.setPRD_DUE_DATE( getString(8, rs) );
			data.setPRD_START_DATE( getString(9, rs) );
			data.setODR_START_DATE( getString(10, rs) );
			data.setDM_QTY( getString(11, rs) );
			data.setODR_QTY( getString(12, rs) );
			data.setSUM_ALCD_QTY( getString(13, rs) );
			data.setODR_STS_TYP( getString(14, rs) );
			data.setDM_STS_TYP( getString(15, rs) );
			data.setOD_TYP( getString(16, rs) );
			data.setTOTAL_RCV_QTY( getString(17, rs) );
			data.setTOTAL_ISSUE_QTY( getString(18, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("csvPdata", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:csvPdata_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:csvPdata_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:csvPdata_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:csvPdata_clear

			return;
		}

		/**
		 * csvPdataクラスの標準コンストラクタ
		 */
		public csvPdata()
		{
			//{{user_implement_dev:csvPdata_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:csvPdata_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class csvCdata extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_OD.\"OD_LEVEL_NO\") as \"OD_LEVEL_NO\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_OD.\"PS_EDITION\" as \"PS_EDITION\", "
+"  to_char(T_OD.\"PS_UNIT_DENOMINATOR\") as \"PS_UNIT_DENOMINATOR\", "
+"  to_char(T_OD.\"PS_UNIT_NUMERATOR\") as \"PS_UNIT_NUMERATOR\", "
+"  to_char(T_OD.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') as \"EFF_PHASE_IN_DATE\", "
+"  to_char(T_OD.\"EFF_PHASE_OUT_DATE\", 'YYYY/MM/DD') as \"EFF_PHASE_OUT_DATE\", "
+"  to_char(T_OD.\"PS_SPOIL\") as \"PS_SPOIL\", "
+"  T_OD.CONS_TYP, "
+"  to_char(T_OD.\"PS_LT_FLG\") as \"PS_LT_FLG\", "
+"  to_char(T_OD.\"PS_FIXED_LT\") as \"PS_FIXED_LT\", "
+"  to_char(T_OD.\"PS_PROP_LT\") as \"PS_PROP_LT\", "
+"  to_char(T_OD.\"PS_PROP_LOT_SIZE\") as \"PS_PROP_LOT_SIZE\", "
+"  0, "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  T_OD.\"OUTSIDE_TYP\", "
+"  to_char(T_OD.\"DUE_DATE\", 'YYYY/MM/DD') as \"DUE_DATE\", "
+"  to_char(T_OD.\"PRD_DUE_DATE\", 'YYYY/MM/DD') as \"PRD_DUE_DATE\", "
+"  to_char(T_OD.\"PRD_START_DATE\", 'YYYY/MM/DD') as \"PRD_START_DATE\", "
+"  to_char(T_OD.\"ODR_START_DATE\", 'YYYY/MM/DD') as \"ODR_START_DATE\", "
+"  to_char(T_OD.\"DM_QTY\") as \"DM_QTY\", "
+"  to_char(T_OD.\"ODR_QTY\") as \"ODR_QTY\", "
+"  to_char(nvl(T.\"SUM_ALCD_QTY\", 0)) as \"SUM_ALCD_QTY\", "
+"  T_OD.\"ODR_STS_TYP\", "
+"  T_OD.\"DM_STS_TYP\", "
+"  T_OD.\"OD_TYP\", "
+"  to_char(T_OD.\"TOTAL_RCV_QTY\") as \"TOTAL_RCV_QTY\", "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\") as \"TOTAL_ISSUE_QTY\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as SUM_ALCD_QTY "
+"    from "
+"      T_JOB_ODR_ALC "
+"    group by "
+"      T_JOB_ODR_ALC.\"OD_NO\" "
+"  ) T "
+"where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.\"MRP_TYP\" != 3 "
+"  and T_OD.\"OD_NO\" = ? "
+"  and T_OD.\"OD_NO\" = T.OD_NO(+)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:csvCdata_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:csvCdata_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:csvCdata_read
			if(m_selcmd==null) throw new FoundationException("csvCdata", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:csvCdata_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:csvCdata_read2
			if(m_selcmd==null) throw new FoundationException("csvCdata", "read", "クエリー未登録");
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
                        //}}user_implement_dev:csvCdata_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:csvCdata_read3
			if(m_selcmd==null) throw new FoundationException("csvCdata", "read", "クエリー未登録");
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
                        //}}user_implement_dev:csvCdata_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getOD_NO());
				if(isNull(data.getOD_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getOD_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setOD_LEVEL_NO( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setPS_EDITION( getString(3, rs) );
			data.setPS_UNIT_DENOMINATOR( getString(4, rs) );
			data.setPS_UNIT_NUMERATOR( getString(5, rs) );
			data.setEFF_PHASE_IN_DATE( getString(6, rs) );
			data.setEFF_PHASE_OUT_DATE( getString(7, rs) );
			data.setPS_SPOIL( getString(8, rs) );
			data.setCONS_TYP( getString(9, rs) );
			data.setPS_LT_FLG( getString(10, rs) );
			data.setFIXED_LT( getString(11, rs) );
			data.setPROP_LT( getString(12, rs) );
			data.setPROP_LOT_SIZE( getString(13, rs) );
			data.setPS_KEY( getString(14, rs) );
			data.setCHILD_ITEM_NAME( getString(15, rs) );
			data.setCHILD_DRAW_CD( getString(16, rs) );
			data.setCHILD_SPEC( getString(17, rs) );
			data.setCHILD_OUTSIDE_TYP( getString(18, rs) );
			data.setDUE_DATE( getString(19, rs) );
			data.setPRD_DUE_DATE( getString(20, rs) );
			data.setPRD_START_DATE( getString(21, rs) );
			data.setODR_START_DATE( getString(22, rs) );
			data.setDM_QTY( getString(23, rs) );
			data.setODR_QTY( getString(24, rs) );
			data.setSUM_ALCD_QTY( getString(25, rs) );
			data.setODR_STS_TYP( getString(26, rs) );
			data.setDM_STS_TYP( getString(27, rs) );
			data.setOD_TYP( getString(28, rs) );
			data.setTOTAL_RCV_QTY( getString(29, rs) );
			data.setTOTAL_ISSUE_QTY( getString(30, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("csvCdata", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:csvCdata_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:csvCdata_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:csvCdata_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:csvCdata_clear

			return;
		}

		/**
		 * csvCdataクラスの標準コンストラクタ
		 */
		public csvCdata()
		{
			//{{user_implement_dev:csvCdata_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:csvCdata_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_WORK_IN_PROC_BY_PROC extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  WORK_ODR_CD "
+"FROM "
+"  T_WORK_IN_PROC_BY_PROC "
+"WHERE "
+"  WORK_ODR_CD = ? "
+"  AND(WORK_STS_TYP = 2 "
+"  OR  WORK_STS_TYP = 9)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0120010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0120010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_read
			if(m_selcmd==null) throw new FoundationException("checkT_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_read2
			if(m_selcmd==null) throw new FoundationException("checkT_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AC0120010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_read3
			if(m_selcmd==null) throw new FoundationException("checkT_WORK_IN_PROC_BY_PROC", "read", "クエリー未登録");
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
                        //}}user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWORK_ODR_CD());
				if(isNull(data.getWORK_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWORK_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AC0120010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0120010Struct data = new AC0120010Struct();

			data.setWORK_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkT_WORK_IN_PROC_BY_PROC", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AC0120010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_clear

			return;
		}

		/**
		 * checkT_WORK_IN_PROC_BY_PROCクラスの標準コンストラクタ
		 */
		public checkT_WORK_IN_PROC_BY_PROC()
		{
			//{{user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_WORK_IN_PROC_BY_PROC_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class delT_WORK_IN_PROC_BY_PROC extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_WORK_IN_PROC_BY_PROC "
+"WHERE "
+"  T_WORK_IN_PROC_BY_PROC.\"OD_NO\" = ? "
+"  AND T_WORK_IN_PROC_BY_PROC.\"OD_NO\" IN ( "
+"    SELECT "
+"      T_OD.\"OD_NO\" "
+"    FROM "
+"      T_OD "
+"    WHERE "
+"      T_OD.\"OD_TYP\" = 1 "
+"      AND T_OD.\"ODR_STS_TYP\" = 2 "
+"      AND T_OD.\"OUTSIDE_TYP\" = 1 "
+"  )";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AC0120010";
		protected String m_sUpdateProgramName="AC0120010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:delT_WORK_IN_PROC_BY_PROC_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:delT_WORK_IN_PROC_BY_PROC_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AC0120010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getOD_NO(), stmt);

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
			//{{user_implement_dev:delT_WORK_IN_PROC_BY_PROC_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:delT_WORK_IN_PROC_BY_PROC_clear

			return;
		}

		/**
		 * delT_WORK_IN_PROC_BY_PROCクラスの標準コンストラクタ
		 */
		public delT_WORK_IN_PROC_BY_PROC()
		{
			//{{user_implement_dev:delT_WORK_IN_PROC_BY_PROC_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:delT_WORK_IN_PROC_BY_PROC_constractor

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
		mRoot.clear();
		mRoot = null;
		mNode.clear();
		mNode = null;
		mDetail.clear();
		mDetail = null;
		mSelectSub1Header.clear();
		mSelectSub1Header = null;
		mSelectSub1.clear();
		mSelectSub1 = null;
		mInsertT_OD.clear();
		mInsertT_OD = null;
		mUpdateT_OD.clear();
		mUpdateT_OD = null;
		mSelectSub1Form.clear();
		mSelectSub1Form = null;
		mcheckSubOdRead1.clear();
		mcheckSubOdRead1 = null;
		mcheckSubOdRead2.clear();
		mcheckSubOdRead2 = null;
		mcheckSubOdRead3.clear();
		mcheckSubOdRead3 = null;
		mcheckT_ITEM.clear();
		mcheckT_ITEM = null;
		mcheckT_OD1.clear();
		mcheckT_OD1 = null;
		mcheckSubOdRead4.clear();
		mcheckSubOdRead4 = null;
		mSelectChild.clear();
		mSelectChild = null;
		mDeleteT_OD.clear();
		mDeleteT_OD = null;
		mcheckM_PROC_GRP.clear();
		mcheckM_PROC_GRP = null;
		mcheckM_PUCH_UNIT_COST.clear();
		mcheckM_PUCH_UNIT_COST = null;
		mupdateChild.clear();
		mupdateChild = null;
		mupdateChildGiji.clear();
		mupdateChildGiji = null;
		mupdateT_OD2.clear();
		mupdateT_OD2 = null;
		mupdateT_OD3.clear();
		mupdateT_OD3 = null;
		mselectM_CAL.clear();
		mselectM_CAL = null;
		mselectM_PLANT.clear();
		mselectM_PLANT = null;
		mselectSYS_OD_CALC_CTRL.clear();
		mselectSYS_OD_CALC_CTRL = null;
		mSELECT_TIME_CTRL.clear();
		mSELECT_TIME_CTRL = null;
		mselectJOB_ODR_ALC_CD.clear();
		mselectJOB_ODR_ALC_CD = null;
		mcheckSYS_JOB_OD_CALC_CTRL.clear();
		mcheckSYS_JOB_OD_CALC_CTRL = null;
		mT_WORK_IN_PROC_BY_ITEM.clear();
		mT_WORK_IN_PROC_BY_ITEM = null;
		mCHK_T_RLSD_PUCH_ODR.clear();
		mCHK_T_RLSD_PUCH_ODR = null;
		mCHK_T_RCV_ISSUE.clear();
		mCHK_T_RCV_ISSUE = null;
		mSub1T_OD.clear();
		mSub1T_OD = null;
		mCHK_T_WORK_IN_PROC_BY_PROC.clear();
		mCHK_T_WORK_IN_PROC_BY_PROC = null;
		mCHK_T_OPR_RSLT.clear();
		mCHK_T_OPR_RSLT = null;
		mCHK_RLSD.clear();
		mCHK_RLSD = null;
		mchkT_ACPT_RSLT.clear();
		mchkT_ACPT_RSLT = null;
		mInsertT_OD1.clear();
		mInsertT_OD1 = null;
		mInsertT_ISSUE_INST.clear();
		mInsertT_ISSUE_INST = null;
		mselectPUCH_ODR_CD.clear();
		mselectPUCH_ODR_CD = null;
		mselectWH_CD.clear();
		mselectWH_CD = null;
		mmInsertT_ISSUE_INST1.clear();
		mmInsertT_ISSUE_INST1 = null;
		mchkM_CONS_UNIT_COST.clear();
		mchkM_CONS_UNIT_COST = null;
		mselectinWH_CD.clear();
		mselectinWH_CD = null;
		mSYS_PARAMETER.clear();
		mSYS_PARAMETER = null;
		minsertT_WORK_IN_PROC_BY_ITEM.clear();
		minsertT_WORK_IN_PROC_BY_ITEM = null;
		minsertT_RLSD_PUCH_ODR.clear();
		minsertT_RLSD_PUCH_ODR = null;
		mselectRCV_WH1.clear();
		mselectRCV_WH1 = null;
		mselectRCV_WH2.clear();
		mselectRCV_WH2 = null;
		mselectRCV_WH3.clear();
		mselectRCV_WH3 = null;
		mdeleteT_ISSUE_INST.clear();
		mdeleteT_ISSUE_INST = null;
		mdeleteT_RLSD_PUCH_ODR.clear();
		mdeleteT_RLSD_PUCH_ODR = null;
		mdeleteT_WORK_IN_PROC_BY_ITEM.clear();
		mdeleteT_WORK_IN_PROC_BY_ITEM = null;
		mselectPVEND_CD.clear();
		mselectPVEND_CD = null;
		mselOWN_PERSON_NAME.clear();
		mselOWN_PERSON_NAME = null;
		mSYS_BAT_PARM.clear();
		mSYS_BAT_PARM = null;
		mcallSQLCALCTAXCALCAMTFD.clear();
		mcallSQLCALCTAXCALCAMTFD = null;
		mselectM_ITEM.clear();
		mselectM_ITEM = null;
		mdeleteT_OD1.clear();
		mdeleteT_OD1 = null;
		mcsvPdata.clear();
		mcsvPdata = null;
		mcsvCdata.clear();
		mcsvCdata = null;
		mcheckT_WORK_IN_PROC_BY_PROC.clear();
		mcheckT_WORK_IN_PROC_BY_PROC = null;
		mdelT_WORK_IN_PROC_BY_PROC.clear();
		mdelT_WORK_IN_PROC_BY_PROC = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AC0120010クラスの標準コンストラクタ
	 */
	public AC0120010Entity() throws FoundationException
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
