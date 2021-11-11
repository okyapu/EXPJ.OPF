/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0060;

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

public class AE0060010Entity extends DataObject
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

	// FormFirstクラス インスタンス
	public FormFirst mFormFirst = new FormFirst();

	// FormAfterクラス インスタンス
	public FormAfter mFormAfter = new FormAfter();

	// T_ACPT_RSLTクラス インスタンス
	public T_ACPT_RSLT mT_ACPT_RSLT = new T_ACPT_RSLT();

	// T_INSPC_RSLTクラス インスタンス
	public T_INSPC_RSLT mT_INSPC_RSLT = new T_INSPC_RSLT();

	// T_RLSD_PUCH_ODRクラス インスタンス
	public T_RLSD_PUCH_ODR mT_RLSD_PUCH_ODR = new T_RLSD_PUCH_ODR();

	// M_WHクラス インスタンス
	public M_WH mM_WH = new M_WH();

	// M_TAXクラス インスタンス
	public M_TAX mM_TAX = new M_TAX();

	// T_RLSD_PUCH_ODRForCompleteクラス インスタンス
	public T_RLSD_PUCH_ODRForComplete mT_RLSD_PUCH_ODRForComplete = new T_RLSD_PUCH_ODRForComplete();

	// T_RLSD_PUCH_ODRForCancelクラス インスタンス
	public T_RLSD_PUCH_ODRForCancel mT_RLSD_PUCH_ODRForCancel = new T_RLSD_PUCH_ODRForCancel();

	// T_RLSD_PUCH_ODR_Lockクラス インスタンス
	public T_RLSD_PUCH_ODR_Lock mT_RLSD_PUCH_ODR_Lock = new T_RLSD_PUCH_ODR_Lock();

	// FormUpdateクラス インスタンス
	public FormUpdate mFormUpdate = new FormUpdate();

	// T_ISSUE_INSTクラス インスタンス
	public T_ISSUE_INST mT_ISSUE_INST = new T_ISSUE_INST();

	// T_PART_SUPPLIED_ISSUEクラス インスタンス
	public T_PART_SUPPLIED_ISSUE mT_PART_SUPPLIED_ISSUE = new T_PART_SUPPLIED_ISSUE();

	// readT_ITEM_STOCKクラス インスタンス
	public readT_ITEM_STOCK mreadT_ITEM_STOCK = new readT_ITEM_STOCK();

	// readT_JOB_ODR_CD_STOCKクラス インスタンス
	public readT_JOB_ODR_CD_STOCK mreadT_JOB_ODR_CD_STOCK = new readT_JOB_ODR_CD_STOCK();

	// readM_WHクラス インスタンス
	public readM_WH mreadM_WH = new readM_WH();

	// insertT_ITEM_STOCKクラス インスタンス
	public insertT_ITEM_STOCK minsertT_ITEM_STOCK = new insertT_ITEM_STOCK();

	// updateT_ITEM_STOCKクラス インスタンス
	public updateT_ITEM_STOCK mupdateT_ITEM_STOCK = new updateT_ITEM_STOCK();

	// insertT_JOB_ODR_CD_STOCKクラス インスタンス
	public insertT_JOB_ODR_CD_STOCK minsertT_JOB_ODR_CD_STOCK = new insertT_JOB_ODR_CD_STOCK();

	// updateT_JOB_ODR_CD_STOCKクラス インスタンス
	public updateT_JOB_ODR_CD_STOCK mupdateT_JOB_ODR_CD_STOCK = new updateT_JOB_ODR_CD_STOCK();

	// insertT_RCV_ISSUEクラス インスタンス
	public insertT_RCV_ISSUE minsertT_RCV_ISSUE = new insertT_RCV_ISSUE();

	// T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCELクラス インスタンス
	public T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL = new T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL();

	// T_ACPT_RSLT_FOR_CANCEL_ODR_CANCELクラス インスタンス
	public T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL = new T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL();

	// SYS_DEBT_CTRLクラス インスタンス
	public SYS_DEBT_CTRL mSYS_DEBT_CTRL = new SYS_DEBT_CTRL();

	// SYS_INSTALL_OPTIONSクラス インスタンス
	public SYS_INSTALL_OPTIONS mSYS_INSTALL_OPTIONS = new SYS_INSTALL_OPTIONS();

	// readT_PART_SUPPLIED_ISSUEクラス インスタンス
	public readT_PART_SUPPLIED_ISSUE mreadT_PART_SUPPLIED_ISSUE = new readT_PART_SUPPLIED_ISSUE();

	// updateT_PART_SUPPLIED_ISSUEクラス インスタンス
	public updateT_PART_SUPPLIED_ISSUE mupdateT_PART_SUPPLIED_ISSUE = new updateT_PART_SUPPLIED_ISSUE();

	// updateT_RLSD_PUCH_ODR_INSPC_CMPLTクラス インスタンス
	public updateT_RLSD_PUCH_ODR_INSPC_CMPLT mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT = new updateT_RLSD_PUCH_ODR_INSPC_CMPLT();

	// SELECT_SYS_ACTUAL_COST_CTRL_ACクラス インスタンス
	public SELECT_SYS_ACTUAL_COST_CTRL_AC mSELECT_SYS_ACTUAL_COST_CTRL_AC = new SELECT_SYS_ACTUAL_COST_CTRL_AC();

	// SELECT_SYS_PARAMETERクラス インスタンス
	public SELECT_SYS_PARAMETER mSELECT_SYS_PARAMETER = new SELECT_SYS_PARAMETER();

	// selectM_WHクラス インスタンス
	public selectM_WH mselectM_WH = new selectM_WH();

	// checkLOT_NOクラス インスタンス
	public checkLOT_NO mcheckLOT_NO = new checkLOT_NO();

	// updateT_LOT_CTRLクラス インスタンス
	public updateT_LOT_CTRL mupdateT_LOT_CTRL = new updateT_LOT_CTRL();

	// checkT_LOT_ISSUE_INSTクラス インスタンス
	public checkT_LOT_ISSUE_INST mcheckT_LOT_ISSUE_INST = new checkT_LOT_ISSUE_INST();

	// SelectQtyクラス インスタンス
	public SelectQty mSelectQty = new SelectQty();

	// insertT_LOT_USE_RSLTクラス インスタンス
	public insertT_LOT_USE_RSLT minsertT_LOT_USE_RSLT = new insertT_LOT_USE_RSLT();

	// SelectT_PART_SUPPLIED_ISSUEクラス インスタンス
	public SelectT_PART_SUPPLIED_ISSUE mSelectT_PART_SUPPLIED_ISSUE = new SelectT_PART_SUPPLIED_ISSUE();

	// updateT_LOT_ISSUE_INSTクラス インスタンス
	public updateT_LOT_ISSUE_INST mupdateT_LOT_ISSUE_INST = new updateT_LOT_ISSUE_INST();

	// SelectWH_CDクラス インスタンス
	public SelectWH_CD mSelectWH_CD = new SelectWH_CD();

	// SelectSEQ_JF_RSLTクラス インスタンス
	public SelectSEQ_JF_RSLT mSelectSEQ_JF_RSLT = new SelectSEQ_JF_RSLT();

	// T_ODクラス インスタンス
	public T_OD mT_OD = new T_OD();

	// SYS_BAT_PARMクラス インスタンス
	public SYS_BAT_PARM mSYS_BAT_PARM = new SYS_BAT_PARM();

	// callSQLCALCTAXCALCAMTクラス インスタンス
	public callSQLCALCTAXCALCAMT mcallSQLCALCTAXCALCAMT = new callSQLCALCTAXCALCAMT();

	// updateT_LOT_TRACEクラス インスタンス
	public updateT_LOT_TRACE mupdateT_LOT_TRACE = new updateT_LOT_TRACE();

	// getFROM_PUCH_ODR_CDクラス インスタンス
	public getFROM_PUCH_ODR_CD mgetFROM_PUCH_ODR_CD = new getFROM_PUCH_ODR_CD();


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
		String m_write_fname="AE0060010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AE0060010";

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
	public class FormFirst extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  to_char(1) as \"ACPT_NO\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\") as \"ACPT_QTY\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"STOCK_UNIT\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_PUCH_ODR_UNIT\") as \"STOCK_UNIT\", "
+"  T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\" as \"NON_NO_ITEM_NAME\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"ACPT_DATE\", "
+"  NULL as \"VEND_LOT_NO\", "
+"  T_RLSD_PUCH_ODR.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  M_CUR.\"CUR_CD\" as \"CUR_CD\", "
+"  M_CUR.\"CUR_NAME\" as \"CUR_NAME\", "
+"  M_CUR.\"CUR_UNIT\" as \"CUR_UNIT\", "
+"  M_CUR.\"DECIMAL_FIG\" as \"DECIMAL_FIG\", "
+"  to_char(T_RLSD_PUCH_ODR.\"UNIT_COST_TYP\") as \"UNIT_COST_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"UNIT_COST\") as \"UNIT_COST\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PROCESSING_COST\") as \"PROCESSING_COST\", "
+"  to_char(T_RLSD_PUCH_ODR.\"MATERIAL_COST\") as \"MATERIAL_COST\", "
+"  to_char(T_RLSD_PUCH_ODR.\"OTHER_OVERHEADS\") as \"OTHER_OVERHEADS\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_AMOUNT\") as \"PUCH_ODR_AMOUNT\", "
+"  to_char(T_RLSD_PUCH_ODR.\"DISC_AMOUNT\") as \"DISC_AMOUNT\", "
+"  to_char(T_RLSD_PUCH_ODR.\"NET_AMOUNT\") as \"NET_AMOUNT\", "
+"  to_char(T_RLSD_PUCH_ODR.\"TAX_AMOUNT_1\") as \"TAX_AMOUNT_1\", "
+"  to_char(T_RLSD_PUCH_ODR.\"TAX_AMOUNT_2\") as \"TAX_AMOUNT_2\", "
+"  to_char(T_RLSD_PUCH_ODR.\"TAX_AMOUNT_3\") as \"TAX_AMOUNT_3\", "
+"  to_char(T_RLSD_PUCH_ODR.\"TAX_RATE_1\") as \"TAX_RATE_1\", "
+"  to_char(T_RLSD_PUCH_ODR.\"TAX_RATE_2\") as \"TAX_RATE_2\", "
+"  to_char(T_RLSD_PUCH_ODR.\"TAX_RATE_3\") as \"TAX_RATE_3\", "
+"  to_char(T_RLSD_PUCH_ODR.\"AMOUNT_INCLUDE_TAX\") as \"AMOUNT_INCLUDE_TAX\", "
+"  to_char(T_RLSD_PUCH_ODR.\"HOME_CUR_AMOUNT\") as \"HOME_CUR_AMOUNT\", "
+"  to_char(T_RLSD_PUCH_ODR.\"EXCH_RATE\") as \"EXCH_RATE\", "
+"  NULL as \"DLV_CD\", "
+"  NULL as \"ACPT_RSLT_COMMENT\", "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" as \"ITEM_CD\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"ITEM_NAME\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\") as \"ITEM_NAME\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  to_char(nvl(M_ITEM.\"UNIT_QTY_TYP\", 2)) as \"UNIT_QTY_TYP\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" as \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_NAME\" as \"VEND_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\") as \"PUCH_ODR_QTY\", "
+"  to_char(0) as \"SUM_ACPT_QTY\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\") as \"ACPT_INSPC_TYP\", "
+"  to_char(nvl(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", T_RLSD_PUCH_ODR.\"PUCH_ODR_INST_DATE\"), 'YYYY/MM/DD') as \"PUCH_ODR_SLIP_ISS_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_DLV_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"CONFIRM_DLV_DATE\", 'YYYY/MM/DD') as \"CONFIRM_DLV_DATE\", "
+"  T_RLSD_PUCH_ODR.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PROC_NAME\" as \"PROC_NAME\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" as \"PUCH_ODR_PERSON\", "
+"  USER_MST.\"USER_NAME\" as \"USER_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\") as \"PUCH_ODR_STS_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\") as \"INSPC_CMPLT_FLG\", "
+"  to_char(T_RLSD_PUCH_ODR.\"SPL_ITEM_TYP\") as \"SPL_ITEM_TYP\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"PRODUCT_TYP\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_TYP\")) as \"PRODUCT_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\") as \"NON_NO_ITEM_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_RLSD_PUCH_ODR.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_RLSD_PUCH_ODR.\"TAX_CD\" as \"TAX_CD\", "
+"  to_char(nvl(M_VEND_CTRL.\"ROUND_TYP\", 3)) as \"ROUND_TYP\", "
+"  to_char(nvl(M_TAX.\"ROUND_TYP\", 3)) as \"TAX_ROUND_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_START_DATE\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  T_RLSD_PUCH_ODR.\"ODR_CANCEL_CAUSE_CD\" as \"ODR_CANCEL_CAUSE_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\") as \"ODR_CANCEL_SLIP_ISS_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_COMMENT\" as \"PUCH_ODR_COMMENT\", "
+"  to_char(M_ITEM.\"LOT_CTRL_FLG\") as \"LOT_CTRL_FLG\", "
+"  to_char(M_ITEM.\"LOT_NUMBERING_TYP\") as \"LOT_NUMBERING_TYP\", "
+"  T_RLSD_PUCH_ODR.\"WORK_ODR_CD\" as \"WORK_ODR_CD\", "
+"  to_char(T_WORK_IN_PROC_BY_PROC.\"FINAL_PROC_FLG\") as \"FINAL_PROC_FLG\", "
+"  decode(T_RLSD_PUCH_ODR.PUCH_ODR_SLIP_ISS_DATE, NULL, 0, 1) as \"H_DATE_FLG\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  T_OD, "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  M_WH, "
+"  M_TAX, "
+"  M_CUR, "
+"  USER_MST, "
+"  SYS_DATE_CTRL, "
+"  SYS_HOME_CUR "
+"where "
+"  T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  and T_RLSD_PUCH_ODR.WH_CD = M_WH.WH_CD(+) "
+"  and T_RLSD_PUCH_ODR.PLANT_CD = SYS_DATE_CTRL.PLANT_CD "
+"  and T_RLSD_PUCH_ODR.TAX_CD = M_TAX.TAX_CD(+) "
+"  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
+"  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
+"  and T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:FormFirst_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:FormFirst_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormFirst_read
			if (m_selcmd == null)
				throw new FoundationException("FormFirst", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormFirst_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormFirst_read2
			if(m_selcmd==null) throw new FoundationException("FormFirst", "read", "クエリー未登録");
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
                        //}}user_implement_dev:FormFirst_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormFirst_read3
			if(m_selcmd==null) throw new FoundationException("FormFirst", "read", "クエリー未登録");
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
                        //}}user_implement_dev:FormFirst_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setACPT_NO( getString(2, rs) );
			data.setACPT_QTY( getString(3, rs) );
			data.setSTOCK_UNIT( getString(4, rs) );
			data.setNON_NO_ITEM_NAME( getString(5, rs) );
			data.setACPT_DATE( getString(6, rs) );
			data.setVEND_LOT_NO( getString(7, rs) );
			data.setWH_CD( getString(8, rs) );
			data.setWH_NAME( getString(9, rs) );
			data.setCUR_CD( getString(10, rs) );
			data.setCUR_NAME( getString(11, rs) );
			data.setVEND_CUR_UNIT( getString(12, rs) );
			data.setVEND_DECIMAL_FIG( getString(13, rs) );
			data.setUNIT_COST_TYP( getString(14, rs) );
			data.setUNIT_COST( getString(15, rs) );
			data.setPROCESSING_COST( getString(16, rs) );
			data.setMATERIAL_COST( getString(17, rs) );
			data.setOTHER_OVERHEADS( getString(18, rs) );
			data.setPUCH_ODR_AMOUNT( getString(19, rs) );
			data.setDISC_AMOUNT( getString(20, rs) );
			data.setNET_AMOUNT( getString(21, rs) );
			data.setTAX_AMOUNT_1( getString(22, rs) );
			data.setTAX_AMOUNT_2( getString(23, rs) );
			data.setTAX_AMOUNT_3( getString(24, rs) );
			data.setTAX_RATE_1( getString(25, rs) );
			data.setTAX_RATE_2( getString(26, rs) );
			data.setTAX_RATE_3( getString(27, rs) );
			data.setAMOUNT_INCLUDE_TAX( getString(28, rs) );
			data.setHOME_CUR_AMOUNT( getString(29, rs) );
			data.setEXCH_RATE( getString(30, rs) );
			data.setDLV_CD( getString(31, rs) );
			data.setACPT_RSLT_COMMENT( getString(32, rs) );
			data.setITEM_CD( getString(33, rs) );
			data.setITEM_NAME( getString(34, rs) );
			data.setJOB_ODR_CD( getString(35, rs) );
			data.setDRAW_CD( getString(36, rs) );
			data.setSPEC( getString(37, rs) );
			data.setUNIT_QTY_TYP( getString(38, rs) );
			data.setVEND_CD( getString(39, rs) );
			data.setVEND_NAME( getString(40, rs) );
			data.setPUCH_ODR_QTY( getString(41, rs) );
			data.setSUM_ACPT_QTY( getString(42, rs) );
			data.setACPT_INSPC_TYP( getString(43, rs) );
			data.setPUCH_ODR_SLIP_ISS_DATE( getString(44, rs) );
			data.setPUCH_ODR_DLV_DATE( getString(45, rs) );
			data.setCONFIRM_DLV_DATE( getString(46, rs) );
			data.setWORK_IN_PROC_CD( getString(47, rs) );
			data.setPROC_NAME( getString(48, rs) );
			data.setPUCH_ODR_PERSON( getString(49, rs) );
			data.setUSER_NAME( getString(50, rs) );
			data.setPUCH_ODR_STS_TYP( getString(51, rs) );
			data.setINSPC_CMPLT_FLG( getString(52, rs) );
			data.setSPL_ITEM_TYP( getString(53, rs) );
			data.setPRODUCT_TYP( getString(54, rs) );
			data.setNON_NO_ITEM_FLG( getString(55, rs) );
			data.setPLANT_CD( getString(56, rs) );
			data.setCOMPANY_CD( getString(57, rs) );
			data.setTAX_CD( getString(58, rs) );
			data.setROUND_TYP( getString(59, rs) );
			data.setTAX_ROUND_TYP( getString(60, rs) );
			data.setPUCH_ODR_START_DATE( getString(61, rs) );
			data.setBUSINESS_OPR_DATE( getString(62, rs) );
			data.setPUCH_ODR_MODIFY_COUNT( getString(63, rs) );
			data.setODR_CANCEL_CAUSE_CD( getString(64, rs) );
			data.setODR_CANCEL_SLIP_ISS_FLG( getString(65, rs) );
			data.setPUCH_ODR_COMMENT( getString(66, rs) );
			data.seth_LOT_CTRL_FLG( getString(67, rs) );
			data.seth_LOT_NUMBERING_TYP( getString(68, rs) );
			data.seth_WORK_ODR_CD( getString(69, rs) );
			data.seth_FINAL_PROC_CD( getString(70, rs) );
			data.seth_DATE_FLG( getString(71, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("FormFirst", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormFirst_check
			PreparedStatement stmt;

			if (m_chkcmd != null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if (m_selcmd != null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("FormFirst", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormFirst_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:FormFirst_clear
			// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:FormFirst_clear

			return;
		}

		/**
		 * FormFirstクラスの標準コンストラクタ
		 */
		public FormFirst()
		{
			//{{user_implement_dev:FormFirst_constractor
			// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:FormFirst_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class FormAfter extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  to_char((T0.\"MAX_ACPT_NO\" + 1)) as \"ACPT_NO\", "
+"  to_char((T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\" - T0.\"SUM_ACPT_QTY\")) as \"ACPT_QTY\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"STOCK_UNIT\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_PUCH_ODR_UNIT\") as \"STOCK_UNIT\", "
+"  T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\" as \"NON_NO_ITEM_NAME\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"ACPT_DATE\", "
+"  NULL as \"VEND_LOT_NO\", "
+"  T_ACPT_RSLT.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  M_CUR.\"CUR_CD\" as \"CUR_CD\", "
+"  M_CUR.\"CUR_NAME\" as \"CUR_NAME\", "
+"  M_CUR.\"CUR_UNIT\" as \"CUR_UNIT\", "
+"  to_char(M_CUR.\"DECIMAL_FIG\") as \"DECIMAL_FIG\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST_TYP\") as \"UNIT_COST_TYP\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST\") as \"UNIT_COST\", "
+"  to_char(T_ACPT_RSLT.\"PROCESSING_COST\") as \"PROCESSING_COST\", "
+"  to_char(T_ACPT_RSLT.\"MATERIAL_COST\") as \"MATERIAL_COST\", "
+"  to_char(T_ACPT_RSLT.\"OTHER_OVERHEADS\") as \"OTHER_OVERHEADS\", "
+"  to_char(0) as \"PUCH_ODR_AMOUNT\", "
+"  to_char(0) as \"DISC_AMOUNT\", "
+"  to_char(0) as \"NET_AMOUNT\", "
+"  to_char(0) as \"TAX_AMOUNT_1\", "
+"  to_char(0) as \"TAX_AMOUNT_2\", "
+"  to_char(0) as \"TAX_AMOUNT_3\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_1\") as \"TAX_RATE_1\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_2\") as \"TAX_RATE_2\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_3\") as \"TAX_RATE_3\", "
+"  to_char(0) as \"AMOUNT_INCLUDE_TAX\", "
+"  to_char(0) as \"HOME_CUR_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"EXCH_RATE\") as \"EXCH_RATE\", "
+"  NULL as \"DLV_CD\", "
+"  NULL as \"ACPT_RSLT_COMMENT\", "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" as \"ITEM_CD\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"ITEM_NAME\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\") as \"ITEM_NAME\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  to_char(nvl(M_ITEM.\"UNIT_QTY_TYP\", 2)) as \"UNIT_QTY_TYP\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" as \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_NAME\" as \"VEND_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\") as \"PUCH_ODR_QTY\", "
+"  to_char(T0.\"SUM_ACPT_QTY\") as \"SUM_ACPT_QTY\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\") as \"ACPT_INSPC_TYP\", "
+"  to_char(nvl(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", T_RLSD_PUCH_ODR.\"PUCH_ODR_INST_DATE\"), 'YYYY/MM/DD') as \"PUCH_ODR_SLIP_ISS_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_DLV_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"CONFIRM_DLV_DATE\", 'YYYY/MM/DD') as \"CONFIRM_DLV_DATE\", "
+"  T_RLSD_PUCH_ODR.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PROC_NAME\" as \"PROC_NAME\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" as \"PUCH_ODR_PERSON\", "
+"  USER_MST.\"USER_NAME\" as \"USER_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\") as \"PUCH_ODR_STS_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\") as \"INSPC_CMPLT_FLG\", "
+"  to_char(T_RLSD_PUCH_ODR.\"SPL_ITEM_TYP\") as \"SPL_ITEM_TYP\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"PRODUCT_TYP\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_TYP\")) as \"PRODUCT_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\") as \"NON_NO_ITEM_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_RLSD_PUCH_ODR.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_ACPT_RSLT.\"TAX_CD\" as \"TAX_CD\", "
+"  to_char(nvl(M_VEND_CTRL.\"ROUND_TYP\", 3)) as \"ROUND_TYP\", "
+"  to_char(nvl(M_TAX.\"ROUND_TYP\", 3)) as \"TAX_ROUND_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_START_DATE\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  T_RLSD_PUCH_ODR.\"ODR_CANCEL_CAUSE_CD\" as \"ODR_CANCEL_CAUSE_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\") as \"ODR_CANCEL_SLIP_ISS_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_COMMENT\" as \"PUCH_ODR_COMMENT\", "
+"  to_char(M_ITEM.\"LOT_CTRL_FLG\") as \"LOT_CTRL_FLG\", "
+"  to_char(M_ITEM.\"LOT_NUMBERING_TYP\") as \"LOT_NUMBERING_TYP\", "
+"  T_RLSD_PUCH_ODR.\"WORK_ODR_CD\" as \"WORK_ODR_CD\", "
+"  to_char(T_WORK_IN_PROC_BY_PROC.\"FINAL_PROC_FLG\") as \"FINAL_PROC_FLG\", "
+"  decode(T_RLSD_PUCH_ODR.PUCH_ODR_SLIP_ISS_DATE, NULL, 0, 1) as \"H_DATE_FLG\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  T_ACPT_RSLT, "
+"  T_OD, "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  M_WH, "
+"  M_TAX, "
+"  M_CUR, "
+"  USER_MST, "
+"  ( "
+"    select "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      max(T_ACPT_RSLT.\"ACPT_NO\") as \"MAX_ACPT_NO\", "
+"      sum(T_ACPT_RSLT.\"ACPT_QTY\") as \"SUM_ACPT_QTY\" "
+"    from "
+"      T_ACPT_RSLT "
+"    where "
+"      T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"    group by "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" "
+"  ) T0, "
+"  SYS_DATE_CTRL, "
+"  SYS_HOME_CUR "
+"where "
+"  T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
+"  and T_ACPT_RSLT.ACPT_NO = T0.MAX_ACPT_NO "
+"  and T_ACPT_RSLT.WH_CD = M_WH.WH_CD(+) "
+"  and T_RLSD_PUCH_ODR.PLANT_CD = SYS_DATE_CTRL.PLANT_CD "
+"  and T_RLSD_PUCH_ODR.TAX_CD = M_TAX.TAX_CD(+) "
+"  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
+"  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
+"  and T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:FormAfter_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:FormAfter_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormAfter_read
			if (m_selcmd == null)
				throw new FoundationException("FormAfter", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormAfter_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormAfter_read2
			if(m_selcmd==null) throw new FoundationException("FormAfter", "read", "クエリー未登録");
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
                        //}}user_implement_dev:FormAfter_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormAfter_read3
			if(m_selcmd==null) throw new FoundationException("FormAfter", "read", "クエリー未登録");
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
                        //}}user_implement_dev:FormAfter_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setACPT_NO( getString(2, rs) );
			data.setACPT_QTY( getString(3, rs) );
			data.setSTOCK_UNIT( getString(4, rs) );
			data.setNON_NO_ITEM_NAME( getString(5, rs) );
			data.setACPT_DATE( getString(6, rs) );
			data.setVEND_LOT_NO( getString(7, rs) );
			data.setWH_CD( getString(8, rs) );
			data.setWH_NAME( getString(9, rs) );
			data.setCUR_CD( getString(10, rs) );
			data.setCUR_NAME( getString(11, rs) );
			data.setVEND_CUR_UNIT( getString(12, rs) );
			data.setVEND_DECIMAL_FIG( getString(13, rs) );
			data.setUNIT_COST_TYP( getString(14, rs) );
			data.setUNIT_COST( getString(15, rs) );
			data.setPROCESSING_COST( getString(16, rs) );
			data.setMATERIAL_COST( getString(17, rs) );
			data.setOTHER_OVERHEADS( getString(18, rs) );
			data.setPUCH_ODR_AMOUNT( getString(19, rs) );
			data.setDISC_AMOUNT( getString(20, rs) );
			data.setNET_AMOUNT( getString(21, rs) );
			data.setTAX_AMOUNT_1( getString(22, rs) );
			data.setTAX_AMOUNT_2( getString(23, rs) );
			data.setTAX_AMOUNT_3( getString(24, rs) );
			data.setTAX_RATE_1( getString(25, rs) );
			data.setTAX_RATE_2( getString(26, rs) );
			data.setTAX_RATE_3( getString(27, rs) );
			data.setAMOUNT_INCLUDE_TAX( getString(28, rs) );
			data.setHOME_CUR_AMOUNT( getString(29, rs) );
			data.setEXCH_RATE( getString(30, rs) );
			data.setDLV_CD( getString(31, rs) );
			data.setACPT_RSLT_COMMENT( getString(32, rs) );
			data.setITEM_CD( getString(33, rs) );
			data.setITEM_NAME( getString(34, rs) );
			data.setJOB_ODR_CD( getString(35, rs) );
			data.setDRAW_CD( getString(36, rs) );
			data.setSPEC( getString(37, rs) );
			data.setUNIT_QTY_TYP( getString(38, rs) );
			data.setVEND_CD( getString(39, rs) );
			data.setVEND_NAME( getString(40, rs) );
			data.setPUCH_ODR_QTY( getString(41, rs) );
			data.setSUM_ACPT_QTY( getString(42, rs) );
			data.setACPT_INSPC_TYP( getString(43, rs) );
			data.setPUCH_ODR_SLIP_ISS_DATE( getString(44, rs) );
			data.setPUCH_ODR_DLV_DATE( getString(45, rs) );
			data.setCONFIRM_DLV_DATE( getString(46, rs) );
			data.setWORK_IN_PROC_CD( getString(47, rs) );
			data.setPROC_NAME( getString(48, rs) );
			data.setPUCH_ODR_PERSON( getString(49, rs) );
			data.setUSER_NAME( getString(50, rs) );
			data.setPUCH_ODR_STS_TYP( getString(51, rs) );
			data.setINSPC_CMPLT_FLG( getString(52, rs) );
			data.setSPL_ITEM_TYP( getString(53, rs) );
			data.setPRODUCT_TYP( getString(54, rs) );
			data.setNON_NO_ITEM_FLG( getString(55, rs) );
			data.setPLANT_CD( getString(56, rs) );
			data.setCOMPANY_CD( getString(57, rs) );
			data.setTAX_CD( getString(58, rs) );
			data.setROUND_TYP( getString(59, rs) );
			data.setTAX_ROUND_TYP( getString(60, rs) );
			data.setPUCH_ODR_START_DATE( getString(61, rs) );
			data.setBUSINESS_OPR_DATE( getString(62, rs) );
			data.setPUCH_ODR_MODIFY_COUNT( getString(63, rs) );
			data.setODR_CANCEL_CAUSE_CD( getString(64, rs) );
			data.setODR_CANCEL_SLIP_ISS_FLG( getString(65, rs) );
			data.setPUCH_ODR_COMMENT( getString(66, rs) );
			data.seth_LOT_CTRL_FLG( getString(67, rs) );
			data.seth_LOT_NUMBERING_TYP( getString(68, rs) );
			data.seth_WORK_ODR_CD( getString(69, rs) );
			data.seth_FINAL_PROC_CD( getString(70, rs) );
			data.seth_DATE_FLG( getString(71, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("FormAfter", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormAfter_check
			PreparedStatement stmt;

			if (m_chkcmd != null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if (m_selcmd != null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("FormAfter", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormAfter_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:FormAfter_clear
			// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:FormAfter_clear

			return;
		}

		/**
		 * FormAfterクラスの標準コンストラクタ
		 */
		public FormAfter()
		{
			//{{user_implement_dev:FormAfter_constractor
			// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:FormAfter_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ACPT_RSLT extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_ACPT_RSLT.\"ACPT_STS_TYP\") as \"ACPT_STS_TYP\" "
+"from "
+"  T_ACPT_RSLT "
+"where "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_ACPT_RSLT.\"ACPT_NO\" = to_number(?)";
		protected String m_chkcmd = "select "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\" "
+"from "
+"  T_ACPT_RSLT "
+"where "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_ACPT_RSLT.\"ACPT_NO\" = to_number(?)";
		protected String m_inscmd = "insert into "
+"  T_ACPT_RSLT(\"PUCH_ODR_CD\", \"ACPT_NO\", \"ACPT_QTY\", \"ACPT_DATE\", \"ITEM_CD\", \"NON_NO_ITEM_NAME\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"PROCESSING_COST\", \"MATERIAL_COST\", \"OTHER_OVERHEADS\", \"DISC_AMOUNT\", \"PUCH_ODR_AMOUNT\", \"ACPT_STS_TYP\", \"DLV_CD\", \"PLANT_CD\", \"INSPC_WH_CD\", \"WH_CD\", \"ACPT_RSLT_COMMENT\", \"INVOICE_CD\", \"RATE_JUDGE_DATE\", \"EXCH_RATE\", \"TAX_RATE_1\", \"TAX_RATE_2\", \"TAX_RATE_3\", \"NET_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"AMOUNT_INCLUDE_TAX\", \"HOME_CUR_AMOUNT\", \"TAX_CD\", \"TAX_ROUND_TYP\", \"VEND_LOT_NO\", \"LOT_NO\", \"ACPT_CRCT_NO\") "
+"values "
+"  (?, to_number(?), to_number(?), to_date(?, 'YYYY/MM/DD'), ?, ?, to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), ?, ?, ?, ?, ?, NULL, to_date(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), ?, to_number(?), ?, ?, 0)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ACPT_RSLT_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ACPT_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_read
			if (m_selcmd == null)
				throw new FoundationException("T_ACPT_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ACPT_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_ACPT_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_ACPT_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setACPT_STS_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ACPT_RSLT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ACPT_RSLT_check
			PreparedStatement stmt;

			if (m_chkcmd != null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if (m_selcmd != null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_ACPT_RSLT", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ACPT_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(9, data.getACPT_QTY(), stmt);
				setString(10, data.getACPT_DATE(), stmt);
				setString(11, data.getITEM_CD(), stmt);
				setString(12, data.getITEM_NAME(), stmt);
				setString(13, data.getUNIT_COST(), stmt);
				setString(14, data.getUNIT_COST_TYP(), stmt);
				setString(15, data.getPROCESSING_COST(), stmt);
				setString(16, data.getMATERIAL_COST(), stmt);
				setString(17, data.getOTHER_OVERHEADS(), stmt);
				setString(18, data.getDISC_AMOUNT(), stmt);
				setString(19, data.getPUCH_ODR_AMOUNT(), stmt);
				setString(20, data.getACPT_STS_TYP(), stmt);
				setString(21, data.getDLV_CD(), stmt);
				setString(22, data.getPLANT_CD(), stmt);
				setString(23, data.getINSPC_WH_CD(), stmt);
				setString(24, data.getWH_CD(), stmt);
				setString(25, data.getACPT_RSLT_COMMENT(), stmt);
				setString(26, data.getACPT_DATE(), stmt);
				setString(27, data.getEXCH_RATE(), stmt);
				setString(28, data.getTAX_RATE_1(), stmt);
				setString(29, data.getTAX_RATE_2(), stmt);
				setString(30, data.getTAX_RATE_3(), stmt);
				setString(31, data.getNET_AMOUNT(), stmt);
				setString(32, data.getTAX_AMOUNT_1(), stmt);
				setString(33, data.getTAX_AMOUNT_2(), stmt);
				setString(34, data.getTAX_AMOUNT_3(), stmt);
				setString(35, data.getAMOUNT_INCLUDE_TAX(), stmt);
				setString(36, data.getHOME_CUR_AMOUNT(), stmt);
				setString(37, data.getTAX_CD(), stmt);
				setString(38, data.getTAX_ROUND_TYP(), stmt);
				setString(39, data.getVEND_LOT_NO(), stmt);
				setString(40, data.getLOT_NO(), stmt);

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
			//{{user_implement_dev:T_ACPT_RSLT_clear
			// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_clear

			return;
		}

		/**
		 * T_ACPT_RSLTクラスの標準コンストラクタ
		 */
		public T_ACPT_RSLT()
		{
			//{{user_implement_dev:T_ACPT_RSLT_constractor
			// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_INSPC_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_INSPC_RSLT(\"PUCH_ODR_CD\", \"ACPT_NO\", \"INSPECTED_QTY\", \"ACCEPTED_QTY\", \"INSPEC_DATE\", \"PLANT_CD\", \"INSPC_WH_CD\", \"WH_CD\", \"INSPEC_RSLT_COMMENT\", \"VEND_LOT_NO\", \"LOT_NO\", \"INSPC_CRCT_NO\") "
+"values "
+"  (?, to_number(?), to_number(?), to_number(?), to_date(?, 'YYYY/MM/DD'), ?, ?, ?, NULL, ?, ?, 0)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_INSPC_RSLT_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_INSPC_RSLT_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(9, data.getACPT_QTY(), stmt);
				setString(10, data.getACPT_QTY(), stmt);
				setString(11, data.getACPT_DATE(), stmt);
				setString(12, data.getPLANT_CD(), stmt);
				setString(13, data.getINSPC_WH_CD(), stmt);
				setString(14, data.getWH_CD(), stmt);
				setString(15, data.getVEND_LOT_NO(), stmt);
				setString(16, data.getLOT_NO(), stmt);

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
			//{{user_implement_dev:T_INSPC_RSLT_clear
			// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_INSPC_RSLT_clear

			return;
		}

		/**
		 * T_INSPC_RSLTクラスの標準コンストラクタ
		 */
		public T_INSPC_RSLT()
		{
			//{{user_implement_dev:T_INSPC_RSLT_constractor
			// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_INSPC_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\") as \"PUCH_ODR_STS_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\") as \"INSPC_CMPLT_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\") as \"ACPT_INSPC_TYP\", "
+"  T_RLSD_PUCH_ODR.\"TAX_CD\" as \"TAX_CD\" "
+"from "
+"  T_RLSD_PUCH_ODR "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODR_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODR_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_read
			if (m_selcmd == null)
				throw new FoundationException("T_RLSD_PUCH_ODR", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_read2
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_read3
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPUCH_ODR_STS_TYP( getString(1, rs) );
			data.setINSPC_CMPLT_FLG( getString(2, rs) );
			data.setPLANT_CD( getString(3, rs) );
			data.setACPT_INSPC_TYP( getString(4, rs) );
			data.setTAX_CD( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_check
			PreparedStatement stmt;

			if (m_chkcmd != null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if (m_selcmd != null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_RLSD_PUCH_ODR", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_RLSD_PUCH_ODR_clear
			// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODRクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_constractor
			// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class M_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"PLANT_CD\" as \"PLANT_CD\" "
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

		//{{user_implement_dev:M_WH_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:M_WH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read
			if (m_selcmd == null)
				throw new FoundationException("M_WH", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:M_WH_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read2
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_WH_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read3
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:M_WH_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPLANT_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_WH", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_check
			PreparedStatement stmt;

			if (m_chkcmd != null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if (m_selcmd != null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("M_WH", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:M_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
	public class M_TAX extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_TAX.\"TAX_CD\" as \"TAX_CD\" "
+"from "
+"  M_TAX "
+"where "
+"  M_TAX.\"TAX_CD\" = ?";
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
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_read
			if (m_selcmd == null)
				throw new FoundationException("M_TAX", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
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
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getTAX_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setTAX_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_TAX_check
			PreparedStatement stmt;

			if (m_chkcmd != null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if (m_selcmd != null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("M_TAX", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:M_TAX_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
	public class T_RLSD_PUCH_ODRForComplete extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(9) as \"PUCH_ODR_STS_TYP\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\", 1, 1, decode(T1.\"MIN_ACPT_STS_TYP\", 2, 1, 0))) as \"INSPC_CMPLT_FLG\", "
+"  to_char(T1.\"MAX_ACPT_DATE\", 'YYYY/MM/DD') as \"ACPT_CMPLT_DATE\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\", 1, T2.\"MAX_INSPEC_DATE\", decode(T1.\"MIN_ACPT_STS_TYP\", 2, T2.\"MAX_INSPEC_DATE\", null)), 'YYYY/MM/DD') as \"INSPC_CMPLT_DATE\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  ( "
+"    select "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      max(T_ACPT_RSLT.\"ACPT_DATE\") as \"MAX_ACPT_DATE\", "
+"      min(T_ACPT_RSLT.\"ACPT_STS_TYP\") as \"MIN_ACPT_STS_TYP\" "
+"    from "
+"      T_ACPT_RSLT "
+"    group by "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" "
+"  ) T1, "
+"  ( "
+"    select "
+"      T_INSPC_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      max(T_INSPC_RSLT.\"INSPEC_DATE\") as \"MAX_INSPEC_DATE\" "
+"    from "
+"      T_INSPC_RSLT "
+"    group by "
+"      T_INSPC_RSLT.\"PUCH_ODR_CD\" "
+"  ) T2 "
+"where "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD = T1.PUCH_ODR_CD "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = T2.PUCH_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_RLSD_PUCH_ODR "
+"set "
+"  \"PUCH_ODR_STS_TYP\" = to_number(?), "
+"  \"INSPC_CMPLT_FLG\" = to_number(?), "
+"  \"ACPT_CMPLT_DATE\" = to_date(?, 'YYYY/MM/DD'), "
+"  \"INSPC_CMPLT_DATE\" = to_date(?, 'YYYY/MM/DD'), "
+"  \"ODR_CANCEL_CAUSE_CD\" = ?, "
+"  \"ODR_CANCEL_SLIP_ISS_FLG\" = to_number(?) "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_read
			if (m_selcmd == null)
				throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_read2
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_read3
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPUCH_ODR_STS_TYP( getString(1, rs) );
			data.setINSPC_CMPLT_FLG( getString(2, rs) );
			data.setACPT_DATE( getString(3, rs) );
			data.setINSPC_CMPLT_DATE( getString(4, rs) );
			data.setPUCH_ODR_CD( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_check
			PreparedStatement stmt;

			if (m_chkcmd != null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if (m_selcmd != null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_RLSD_PUCH_ODRForComplete", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getPUCH_ODR_STS_TYP(), stmt);
				setString(5, data.getINSPC_CMPLT_FLG(), stmt);
				setString(6, data.getACPT_DATE(), stmt);
				setString(7, data.getINSPC_CMPLT_DATE(), stmt);
				setString(8, data.getODR_CANCEL_CAUSE_CD(), stmt);
				setString(9, data.getODR_CANCEL_SLIP_ISS_FLG(), stmt);
				setString(10, data.getPUCH_ODR_CD(), stmt);

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
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_clear
			// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODRForCompleteクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODRForComplete()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForComplete_constractor
			// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForComplete_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODRForCancel extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_RLSD_PUCH_ODR "
+"set "
+"  \"PUCH_ODR_STS_TYP\" = 2, "
+"  \"ACPT_CMPLT_DATE\" = NULL, "
+"  \"INSPC_CMPLT_FLG\" = decode(\"ACPT_INSPC_TYP\", 1, 0, \"INSPC_CMPLT_FLG\"), "
+"  \"INSPC_CMPLT_DATE\" = decode(\"ACPT_INSPC_TYP\", 1, NULL, \"INSPC_CMPLT_DATE\") "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODRForCancel_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODRForCancel_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getPUCH_ODR_CD(), stmt);

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
			//{{user_implement_dev:T_RLSD_PUCH_ODRForCancel_clear
			// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForCancel_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODRForCancelクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODRForCancel()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODRForCancel_constractor
			// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODRForCancel_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODR_Lock extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"MODIFY_COUNT\" "
+"from "
+"  T_RLSD_PUCH_ODR "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_def
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_read
			if (m_selcmd == null)
				throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_read2
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_read3
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPUCH_ODR_MODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_check
			PreparedStatement stmt;

			if (m_chkcmd != null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if (m_selcmd != null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_RLSD_PUCH_ODR_Lock", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_clear
			// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODR_Lockクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODR_Lock()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_Lock_constractor
			// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_Lock_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class FormUpdate extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_NO\") as \"ACPT_NO\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_QTY\") as \"ACPT_QTY\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"STOCK_UNIT\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_PUCH_ODR_UNIT\") as \"STOCK_UNIT\", "
+"  to_char(T_ACPT_RSLT.\"ACPT_DATE\", 'YYYY/MM/DD') as \"ACPT_DATE\", "
+"  T_ACPT_RSLT.\"VEND_LOT_NO\" as \"VEND_LOT_NO\", "
+"  T_ACPT_RSLT.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  M_CUR.\"CUR_CD\" as \"CUR_CD\", "
+"  M_CUR.\"CUR_NAME\" as \"CUR_NAME\", "
+"  M_CUR.\"CUR_UNIT\" as \"CUR_UNIT\", "
+"  to_char(M_CUR.\"DECIMAL_FIG\") as \"DECIMAL_FIG\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST_TYP\") as \"UNIT_COST_TYP\", "
+"  to_char(T_ACPT_RSLT.\"UNIT_COST\") as \"UNIT_COST\", "
+"  to_char(T_ACPT_RSLT.\"PROCESSING_COST\") as \"PROCESSING_COST\", "
+"  to_char(T_ACPT_RSLT.\"MATERIAL_COST\") as \"MATERIAL_COST\", "
+"  to_char(T_ACPT_RSLT.\"OTHER_OVERHEADS\") as \"OTHER_OVERHEADS\", "
+"  to_char(T_ACPT_RSLT.\"PUCH_ODR_AMOUNT\") as \"PUCH_ODR_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"DISC_AMOUNT\") as \"DISC_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"NET_AMOUNT\") as \"NET_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"TAX_AMOUNT_1\") as \"TAX_AMOUNT_1\", "
+"  to_char(T_ACPT_RSLT.\"TAX_AMOUNT_2\") as \"TAX_AMOUNT_2\", "
+"  to_char(T_ACPT_RSLT.\"TAX_AMOUNT_3\") as \"TAX_AMOUNT_3\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_1\") as \"TAX_RATE_1\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_2\") as \"TAX_RATE_2\", "
+"  to_char(T_ACPT_RSLT.\"TAX_RATE_3\") as \"TAX_RATE_3\", "
+"  to_char(T_ACPT_RSLT.\"AMOUNT_INCLUDE_TAX\") as \"AMOUNT_INCLUDE_TAX\", "
+"  to_char(T_ACPT_RSLT.\"HOME_CUR_AMOUNT\") as \"HOME_CUR_AMOUNT\", "
+"  to_char(T_ACPT_RSLT.\"EXCH_RATE\") as \"EXCH_RATE\", "
+"  T_ACPT_RSLT.\"DLV_CD\" as \"DLV_CD\", "
+"  T_ACPT_RSLT.\"ACPT_RSLT_COMMENT\" as \"ACPT_RSLT_COMMENT\", "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" as \"ITEM_CD\", "
+"  decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"ITEM_NAME\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\") as \"ITEM_NAME\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  to_char(nvl(M_ITEM.\"UNIT_QTY_TYP\", 2)) as \"UNIT_QTY_TYP\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" as \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_NAME\" as \"VEND_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\") as \"PUCH_ODR_QTY\", "
+"  to_char(T0.\"SUM_ACPT_QTY\" - T_ACPT_RSLT.\"ACPT_QTY\") as \"SUM_ACPT_QTY\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ACPT_INSPC_TYP\") as \"ACPT_INSPC_TYP\", "
+"  to_char(nvl(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", T_RLSD_PUCH_ODR.\"PUCH_ODR_INST_DATE\"), 'YYYY/MM/DD') as \"PUCH_ODR_SLIP_ISS_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_DLV_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"CONFIRM_DLV_DATE\", 'YYYY/MM/DD') as \"CONFIRM_DLV_DATE\", "
+"  T_RLSD_PUCH_ODR.\"WORK_IN_PROC_CD\" as \"WORK_IN_PROC_CD\", "
+"  T_WORK_IN_PROC_BY_PROC.\"PROC_NAME\" as \"PROC_NAME\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" as \"PUCH_ODR_PERSON\", "
+"  USER_MST.\"USER_NAME\" as \"USER_NAME\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_STS_TYP\") as \"PUCH_ODR_STS_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\") as \"INSPC_CMPLT_FLG\", "
+"  to_char(T_RLSD_PUCH_ODR.\"SPL_ITEM_TYP\") as \"SPL_ITEM_TYP\", "
+"  to_char(decode(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"PRODUCT_TYP\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_TYP\")) as \"PRODUCT_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\") as \"NON_NO_ITEM_FLG\", "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_RLSD_PUCH_ODR.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_ACPT_RSLT.\"TAX_CD\" as \"TAX_CD\", "
+"  to_char(nvl(M_VEND_CTRL.\"ROUND_TYP\", 3)) as \"ROUND_TYP\", "
+"  to_char(nvl(M_TAX.\"ROUND_TYP\", 3)) as \"TAX_ROUND_TYP\", "
+"  to_char(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') as \"PUCH_ODR_START_DATE\", "
+"  to_char(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  to_char(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") as \"PUCH_ODR_MODIFY_COUNT\", "
+"  T_RLSD_PUCH_ODR.\"ODR_CANCEL_CAUSE_CD\" as \"ODR_CANCEL_CAUSE_CD\", "
+"  to_char(T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\") as \"ODR_CANCEL_SLIP_ISS_FLG\" "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  T_ACPT_RSLT, "
+"  T_OD, "
+"  T_WORK_IN_PROC_BY_PROC, "
+"  M_ITEM, "
+"  M_VEND_CTRL, "
+"  M_WH, "
+"  M_TAX, "
+"  M_CUR, "
+"  USER_MST, "
+"  ( "
+"    select "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"      sum(T_ACPT_RSLT.\"ACPT_QTY\") as \"SUM_ACPT_QTY\" "
+"    from "
+"      T_ACPT_RSLT "
+"    where "
+"      T_ACPT_RSLT.PUCH_ODR_CD = ? "
+"    group by "
+"      T_ACPT_RSLT.\"PUCH_ODR_CD\" "
+"  ) T0, "
+"  SYS_DATE_CTRL, "
+"  SYS_HOME_CUR "
+"where "
+"  T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  and T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  and T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  and T_RLSD_PUCH_ODR.WORK_ODR_CD = T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD(+) "
+"  and T_RLSD_PUCH_ODR.WORK_IN_PROC_CD = T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  and T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_ACPT_RSLT.PUCH_ODR_CD "
+"  and T_ACPT_RSLT.PUCH_ODR_CD = T0.PUCH_ODR_CD "
+"  and T_ACPT_RSLT.WH_CD = M_WH.WH_CD(+) "
+"  and T_RLSD_PUCH_ODR.PLANT_CD = SYS_DATE_CTRL.PLANT_CD "
+"  and T_RLSD_PUCH_ODR.TAX_CD = M_TAX.TAX_CD(+) "
+"  and M_CUR.CUR_CD = nvl(M_VEND_CTRL.CUR_CD, SYS_HOME_CUR.HOME_CUR_CD) "
+"  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
+"  and T_ACPT_RSLT.\"PUCH_ODR_CD\" = ? "
+"  and T_ACPT_RSLT.\"ACPT_NO\" = TO_NUMBER(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:FormUpdate_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:FormUpdate_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormUpdate_read
			if(m_selcmd==null) throw new FoundationException("FormUpdate", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormUpdate_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormUpdate_read2
			if(m_selcmd==null) throw new FoundationException("FormUpdate", "read", "クエリー未登録");
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
                        //}}user_implement_dev:FormUpdate_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormUpdate_read3
			if(m_selcmd==null) throw new FoundationException("FormUpdate", "read", "クエリー未登録");
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
                        //}}user_implement_dev:FormUpdate_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );
			data.setACPT_NO( getString(2, rs) );
			data.setACPT_QTY( getString(3, rs) );
			data.setSTOCK_UNIT( getString(4, rs) );
			data.setACPT_DATE( getString(5, rs) );
			data.setVEND_LOT_NO( getString(6, rs) );
			data.setWH_CD( getString(7, rs) );
			data.setWH_NAME( getString(8, rs) );
			data.setCUR_CD( getString(9, rs) );
			data.setCUR_NAME( getString(10, rs) );
			data.setVEND_CUR_UNIT( getString(11, rs) );
			data.setVEND_DECIMAL_FIG( getString(12, rs) );
			data.setUNIT_COST_TYP( getString(13, rs) );
			data.setUNIT_COST( getString(14, rs) );
			data.setPROCESSING_COST( getString(15, rs) );
			data.setMATERIAL_COST( getString(16, rs) );
			data.setOTHER_OVERHEADS( getString(17, rs) );
			data.setPUCH_ODR_AMOUNT( getString(18, rs) );
			data.setDISC_AMOUNT( getString(19, rs) );
			data.setNET_AMOUNT( getString(20, rs) );
			data.setTAX_AMOUNT_1( getString(21, rs) );
			data.setTAX_AMOUNT_2( getString(22, rs) );
			data.setTAX_AMOUNT_3( getString(23, rs) );
			data.setTAX_RATE_1( getString(24, rs) );
			data.setTAX_RATE_2( getString(25, rs) );
			data.setTAX_RATE_3( getString(26, rs) );
			data.setAMOUNT_INCLUDE_TAX( getString(27, rs) );
			data.setHOME_CUR_AMOUNT( getString(28, rs) );
			data.setEXCH_RATE( getString(29, rs) );
			data.setDLV_CD( getString(30, rs) );
			data.setACPT_RSLT_COMMENT( getString(31, rs) );
			data.setITEM_CD( getString(32, rs) );
			data.setITEM_NAME( getString(33, rs) );
			data.setJOB_ODR_CD( getString(34, rs) );
			data.setDRAW_CD( getString(35, rs) );
			data.setSPEC( getString(36, rs) );
			data.setUNIT_QTY_TYP( getString(37, rs) );
			data.setVEND_CD( getString(38, rs) );
			data.setVEND_NAME( getString(39, rs) );
			data.setPUCH_ODR_QTY( getString(40, rs) );
			data.setSUM_ACPT_QTY( getString(41, rs) );
			data.setACPT_INSPC_TYP( getString(42, rs) );
			data.setPUCH_ODR_SLIP_ISS_DATE( getString(43, rs) );
			data.setPUCH_ODR_DLV_DATE( getString(44, rs) );
			data.setCONFIRM_DLV_DATE( getString(45, rs) );
			data.setWORK_IN_PROC_CD( getString(46, rs) );
			data.setPROC_NAME( getString(47, rs) );
			data.setPUCH_ODR_PERSON( getString(48, rs) );
			data.setUSER_NAME( getString(49, rs) );
			data.setPUCH_ODR_STS_TYP( getString(50, rs) );
			data.setINSPC_CMPLT_FLG( getString(51, rs) );
			data.setSPL_ITEM_TYP( getString(52, rs) );
			data.setPRODUCT_TYP( getString(53, rs) );
			data.setNON_NO_ITEM_FLG( getString(54, rs) );
			data.setPLANT_CD( getString(55, rs) );
			data.setCOMPANY_CD( getString(56, rs) );
			data.setTAX_CD( getString(57, rs) );
			data.setROUND_TYP( getString(58, rs) );
			data.setTAX_ROUND_TYP( getString(59, rs) );
			data.setPUCH_ODR_START_DATE( getString(60, rs) );
			data.setBUSINESS_OPR_DATE( getString(61, rs) );
			data.setPUCH_ODR_MODIFY_COUNT( getString(62, rs) );
			data.setODR_CANCEL_CAUSE_CD( getString(63, rs) );
			data.setODR_CANCEL_SLIP_ISS_FLG( getString(64, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("FormUpdate", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FormUpdate_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("FormUpdate", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:FormUpdate_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:FormUpdate_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:FormUpdate_clear

			return;
		}

		/**
		 * FormUpdateクラスの標準コンストラクタ
		 */
		public FormUpdate()
		{
			//{{user_implement_dev:FormUpdate_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:FormUpdate_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ISSUE_INST.\"ISSUE_INST_CD\" as \"ISSUE_INST_CD\", "
+"  T_ISSUE_INST.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_ISSUE_INST.\"OD_NO\" as \"OD_NO\", "
+"  T_ISSUE_INST.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_ISSUE_INST.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  T_ISSUE_INST.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_ISSUE_INST.\"VEND_CD\" as \"VEND_CD\", "
+"  T_ISSUE_INST.\"CONS_TYP\" as \"CONS_TYP\", "
+"  T_ISSUE_INST.\"ISSUE_INST_UNIT_DENOMINATOR\" as \"ISSUE_INST_UNIT_DENOMINATOR\", "
+"  T_ISSUE_INST.\"ISSUE_INST_UNIT_NUMERATOR\" as \"ISSUE_INST_UNIT_NUMERATOR\", "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"  T_OD.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" as \"UNIT_QTY_TYP\", "
+"  M_ITEM.\"LOT_CTRL_FLG\" as \"LOT_CTRL_FLG\" "
+"from "
+"  T_ISSUE_INST, "
+"  T_OD, "
+"  M_ITEM "
+"where "
+"  T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
+"  and T_ISSUE_INST.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_ISSUE_INST.PUCH_ODR_CD = ? "
+"  and T_ISSUE_INST.WH_CD IS NOT NULL "
+"  and(T_ISSUE_INST.ISSUE_TYP = 1 "
+"  or  T_ISSUE_INST.ISSUE_TYP = 2) "
+"  and T_ISSUE_INST.CONS_TYP != 0 "
+"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ISSUE_INST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST_read
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ISSUE_INST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST_read2
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_ISSUE_INST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST_read3
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_ISSUE_INST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setreadISSUE_INST_CD( getString(1, rs) );
			data.setreadPLANT_CD( getString(2, rs) );
			data.setreadOD_NO( getString(3, rs) );
			data.setreadITEM_CD( getString(4, rs) );
			data.setreadPUCH_ODR_CD( getString(5, rs) );
			data.setreadCOMPANY_CD( getString(6, rs) );
			data.setreadVEND_CD( getString(7, rs) );
			data.setreadCONS_TYP( getString(8, rs) );
			data.setreadISSUE_INST_UNIT_DENOMINATOR( getString(9, rs) );
			data.setreadISSUE_INST_UNIT_NUMERATOR( getString(10, rs) );
			data.setreadJOB_ODR_CD( getString(11, rs) );
			data.setreadJOB_ODR_DETAIL_NO( getString(12, rs) );
			data.setreadMRP_ODR_TYP( getString(13, rs) );
			data.setreadUNIT_QTY_TYP( getString(14, rs) );
			data.setreadLOT_CONTROL_FLG( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ISSUE_INST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ISSUE_INST_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("T_ISSUE_INST", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:T_ISSUE_INST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ISSUE_INST_clear

			return;
		}

		/**
		 * T_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public T_ISSUE_INST()
		{
			//{{user_implement_dev:T_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_PART_SUPPLIED_ISSUE(\"PUCH_ODR_CD\", \"ACPT_NO\", \"ITEM_CD\", \"ACPT_QTY\", \"COMPANY_CD\", \"VEND_CD\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"PLANT_CD\", \"ISSUE_INST_CD\", \"MRP_ODR_TYP\", \"SUPPLIED_ISSUE_GNR_TYP\", \"SUPPLIED_ISSUE_QTY\", \"TOTAL_ISSUE_QTY\", \"SUPPLIED_UNIT_DENOMINATOR\", \"SUPPLIED_UNIT_NUMERATOR\", \"SUPPLIED_DATE\", \"PART_SUPPLIED_COMMENT\") "
+"values "
+"  (?, to_number(?), ?, to_number(?), ?, ?, ?, to_number(?), ?, ?, to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_number(?), to_date(?,'YYYY/MM/DD'), ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getsetPUCH_ODR_CD(), stmt);
				setString(8, data.getsetACPT_NO(), stmt);
				setString(9, data.getsetITEM_CD(), stmt);
				setString(10, data.getsetACPT_QTY(), stmt);
				setString(11, data.getsetCOMPANY_CD(), stmt);
				setString(12, data.getsetVEND_CD(), stmt);
				setString(13, data.getsetJOB_ODR_CD(), stmt);
				setString(14, data.getsetJOB_ODR_DETAIL_NO(), stmt);
				setString(15, data.getsetPLANT_CD(), stmt);
				setString(16, data.getsetISSUE_INST_CD(), stmt);
				setString(17, data.getsetMRP_ODR_TYP(), stmt);
				setString(18, data.getsetSUPPLIED_ISSUE_GNR_TYP(), stmt);
				setString(19, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(20, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(21, data.getsetSUPPLIED_UNIT_DENOMINATOR(), stmt);
				setString(22, data.getsetSUPPLIED_UNIT_NUMERATOR(), stmt);
				setString(23, data.getsetSUPPLIED_DATE(), stmt);
				setString(24, data.getsetPART_SUPPLIED_COMMENT(), stmt);

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
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * T_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public T_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:T_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\" as \"STOCK_ON_HAND_QTY\" "
+"from "
+"  T_ITEM_STOCK "
+"where "
+"  T_ITEM_STOCK.ITEM_CD = ? "
+"  and T_ITEM_STOCK.WH_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_ITEM_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_ITEM_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ITEM_STOCK_read
			if(m_selcmd==null) throw new FoundationException("readT_ITEM_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_ITEM_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ITEM_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("readT_ITEM_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_ITEM_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ITEM_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("readT_ITEM_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_ITEM_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetWH_CD());
				if(isNull(data.getsetWH_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setreadSTOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_ITEM_STOCK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_ITEM_STOCK_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_ITEM_STOCK", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_ITEM_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_ITEM_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_ITEM_STOCK_clear

			return;
		}

		/**
		 * readT_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public readT_ITEM_STOCK()
		{
			//{{user_implement_dev:readT_ITEM_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readT_JOB_ODR_CD_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\" as \"STOCK_ON_HAND_QTY\" "
+"from "
+"  T_JOB_ODR_CD_STOCK "
+"where "
+"  T_JOB_ODR_CD_STOCK.JOB_ODR_CD = ? "
+"  and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = ? "
+"  and T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
+"  and T_JOB_ODR_CD_STOCK.WH_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_read
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_CD_STOCK", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_CD_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_CD_STOCK", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetJOB_ODR_CD());
				if(isNull(data.getsetJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getsetJOB_ODR_DETAIL_NO());
				if(isNull(data.getsetJOB_ODR_DETAIL_NO())) isNull = true;
				ary.addElement(data.getsetITEM_CD());
				if(isNull(data.getsetITEM_CD())) isNull = true;
				ary.addElement(data.getsetWH_CD());
				if(isNull(data.getsetWH_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetJOB_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetJOB_ODR_DETAIL_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setreadSTOCK_ON_HAND_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_CD_STOCK", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_JOB_ODR_CD_STOCK", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_clear

			return;
		}

		/**
		 * readT_JOB_ODR_CD_STOCKクラスの標準コンストラクタ
		 */
		public readT_JOB_ODR_CD_STOCK()
		{
			//{{user_implement_dev:readT_JOB_ODR_CD_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_JOB_ODR_CD_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class readM_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"VEND_CD\" = ? "
+"  and M_WH.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readM_WH_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readM_WH_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WH_read
			if(m_selcmd==null) throw new FoundationException("readM_WH", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_WH_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WH_read2
			if(m_selcmd==null) throw new FoundationException("readM_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readM_WH_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WH_read3
			if(m_selcmd==null) throw new FoundationException("readM_WH", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readM_WH_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetVEND_CD());
				if(isNull(data.getsetVEND_CD())) isNull = true;
				ary.addElement(data.getsetPLANT_CD());
				if(isNull(data.getsetPLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsetVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsetPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setreadWH_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readM_WH", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WH_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readM_WH", "check", "クエリー未登録");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_WH_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readM_WH_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readM_WH_clear

			return;
		}

		/**
		 * readM_WHクラスの標準コンストラクタ
		 */
		public readM_WH()
		{
			//{{user_implement_dev:readM_WH_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readM_WH_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_ITEM_STOCK(\"ITEM_CD\", \"WH_CD\", \"PLANT_CD\", \"STOCK_ON_HAND_QTY\") "
+"values "
+"  (?, ?, ?, to_number(?))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_ITEM_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_ITEM_STOCK_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getsetITEM_CD(), stmt);
				setString(8, data.getsetWH_CD(), stmt);
				setString(9, data.getsetPLANT_CD(), stmt);
				setString(10, data.getsetSTOCK_ON_HAND_QTY(), stmt);

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
			//{{user_implement_dev:insertT_ITEM_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_ITEM_STOCK_clear

			return;
		}

		/**
		 * insertT_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public insertT_ITEM_STOCK()
		{
			//{{user_implement_dev:insertT_ITEM_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_ITEM_STOCK "
+"set "
+"  \"STOCK_ON_HAND_QTY\" = to_number(?) "
+"where "
+"  T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"WH_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_ITEM_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_ITEM_STOCK_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsetSTOCK_ON_HAND_QTY(), stmt);
				setString(5, data.getsetITEM_CD(), stmt);
				setString(6, data.getsetWH_CD(), stmt);

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
			//{{user_implement_dev:updateT_ITEM_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_ITEM_STOCK_clear

			return;
		}

		/**
		 * updateT_ITEM_STOCKクラスの標準コンストラクタ
		 */
		public updateT_ITEM_STOCK()
		{
			//{{user_implement_dev:updateT_ITEM_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_JOB_ODR_CD_STOCK extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_JOB_ODR_CD_STOCK(\"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"ITEM_CD\", \"WH_CD\", \"PLANT_CD\", \"STOCK_ON_HAND_QTY\") "
+"values "
+"  (?, to_number(?), ?, ?, ?, to_number(?))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_JOB_ODR_CD_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_JOB_ODR_CD_STOCK_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getsetJOB_ODR_CD(), stmt);
				setString(8, data.getsetJOB_ODR_DETAIL_NO(), stmt);
				setString(9, data.getsetITEM_CD(), stmt);
				setString(10, data.getsetWH_CD(), stmt);
				setString(11, data.getsetPLANT_CD(), stmt);
				setString(12, data.getsetSTOCK_ON_HAND_QTY(), stmt);

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
			//{{user_implement_dev:insertT_JOB_ODR_CD_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_JOB_ODR_CD_STOCK_clear

			return;
		}

		/**
		 * insertT_JOB_ODR_CD_STOCKクラスの標準コンストラクタ
		 */
		public insertT_JOB_ODR_CD_STOCK()
		{
			//{{user_implement_dev:insertT_JOB_ODR_CD_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_JOB_ODR_CD_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_JOB_ODR_CD_STOCK extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_JOB_ODR_CD_STOCK "
+"set "
+"  \"STOCK_ON_HAND_QTY\" = to_number(?) "
+"where "
+"  T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"WH_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_JOB_ODR_CD_STOCK_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_JOB_ODR_CD_STOCK_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsetSTOCK_ON_HAND_QTY(), stmt);
				setString(5, data.getsetJOB_ODR_CD(), stmt);
				setString(6, data.getsetJOB_ODR_DETAIL_NO(), stmt);
				setString(7, data.getsetITEM_CD(), stmt);
				setString(8, data.getsetWH_CD(), stmt);

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
			//{{user_implement_dev:updateT_JOB_ODR_CD_STOCK_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_JOB_ODR_CD_STOCK_clear

			return;
		}

		/**
		 * updateT_JOB_ODR_CD_STOCKクラスの標準コンストラクタ
		 */
		public updateT_JOB_ODR_CD_STOCK()
		{
			//{{user_implement_dev:updateT_JOB_ODR_CD_STOCK_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_JOB_ODR_CD_STOCK_constractor

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
+"  T_RCV_ISSUE(\"RCV_ISSUE_CTRL_CD\", \"RCV_ISSUE_TYP\", \"ITEM_CD\", \"PLANT_CD\", \"WH_CD\", \"JOB_ODR_CD\", \"JOB_ODR_DETAIL_NO\", \"PUCH_ODR_CD\", \"ACPT_NO\", \"ACPT_RSLT_CRCT_NO\", \"INSPEC_RSLT_CRCT_NO\", \"WORK_ODR_CD\", \"WORK_IN_PROC_CD\", \"PARTIAL_PRD_NO\", \"OPR_RSLT_CRCT_NO\", \"ISSUE_INST_CD\", \"RCV_ISSUE_BEFORE_QTY\", \"RCV_ISSUE_QTY\", \"RCV_ISSUE_AFTER_QTY\", \"RCV_ISSUE_AMOUNT\", \"RCV_ISSUE_DATE\", \"RCV_ISSUE_GNR_TYP\", \"RCV_ISSUE_ODD_QTY\", \"DEFECT_CAUSE_CD\", \"STOCK_UPD_TYP\", \"RCV_ISSUE_CMPLT_FLG\", \"OD_NO\", \"LOT_NO\", \"VEND_LOT_NO\", \"RCV_ISSUE_COMMENT\", \"COMPANY_CD\", \"VEND_CD\", \"CONS_TYP\", \"CONS_EXEC_DATE\") "
+"values "
+"  (?, to_number(?), ?, ?, ?, ?, to_number(?), ?, to_number(?), to_number(?), to_number(?), ?, ?, to_number(?), to_number(?), ?, to_number(?), to_number(?), to_number(?), to_number(?), to_date(?,'YYYY/MM/DD'), to_number(?), to_number(?), ?, to_number(?), to_number(?), ?, ?, ?, ?, ?, ?, to_number(?), to_date(?,'YYYY/MM/DD')) "
+"";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_RCV_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_RCV_ISSUE_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getsetRCV_ISSUE_CTRL_CD(), stmt);
				setString(8, data.getsetRCV_ISSUE_TYP(), stmt);
				setString(9, data.getsetITEM_CD(), stmt);
				setString(10, data.getsetPLANT_CD(), stmt);
				setString(11, data.getsetWH_CD(), stmt);
				setString(12, data.getsetJOB_ODR_CD(), stmt);
				setString(13, data.getsetJOB_ODR_DETAIL_NO(), stmt);
				setString(14, data.getsetPUCH_ODR_CD(), stmt);
				setString(15, data.getsetACPT_NO(), stmt);
				setString(16, data.getsetACPT_RSLT_CRCT_NO(), stmt);
				setString(17, data.getsetINSPEC_RSLT_CRCT_NO(), stmt);
				setString(18, data.getsetWORK_ODR_CD(), stmt);
				setString(19, data.getsetWORK_IN_PROC_CD(), stmt);
				setString(20, data.getsetPARTIAL_PRD_NO(), stmt);
				setString(21, data.getsetOPR_RSLT_CRCT_NO(), stmt);
				setString(22, data.getsetISSUE_INST_CD(), stmt);
				setString(23, data.getsetRCV_ISSUE_BEFORE_QTY(), stmt);
				setString(24, data.getsetRCV_ISSUE_QTY(), stmt);
				setString(25, data.getsetRCV_ISSUE_AFTER_QTY(), stmt);
				setString(26, data.getsetRCV_ISSUE_AMOUNT(), stmt);
				setString(27, data.getsetRCV_ISSUE_DATE(), stmt);
				setString(28, data.getsetRCV_ISSUE_GNR_TYP(), stmt);
				setString(29, data.getsetRCV_ISSUE_ODD_QTY(), stmt);
				setString(30, data.getsetDEFECT_CAUSE_CD(), stmt);
				setString(31, data.getsetSTOCK_UPD_TYP(), stmt);
				setString(32, data.getsetRCV_ISSUE_CMPLT_FLG(), stmt);
				setString(33, data.getsetOD_NO(), stmt);
				setString(34, data.getsetLOT_NO(), stmt);
				setString(35, data.getsetVEND_LOT_NO(), stmt);
				setString(36, data.getsetRCV_ISSUE_COMMENT(), stmt);
				setString(37, data.getsetCOMPANY_CD(), stmt);
				setString(38, data.getsetVEND_CD(), stmt);
				setString(39, data.getsetCONS_TYP(), stmt);
				setString(40, data.getsetCONS_EXEC_DATE(), stmt);

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
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_RCV_ISSUE_clear

			return;
		}

		/**
		 * insertT_RCV_ISSUEクラスの標準コンストラクタ
		 */
		public insertT_RCV_ISSUE()
		{
			//{{user_implement_dev:insertT_RCV_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_RCV_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_RLSD_PUCH_ODR "
+"set "
+"  \"PUCH_ODR_STS_TYP\" = 2, "
+"  \"ACPT_CMPLT_DATE\" = NULL, "
+"  \"INSPC_CMPLT_FLG\" = 0, "
+"  \"INSPC_CMPLT_DATE\" = NULL, "
+"  \"ODR_CANCEL_CAUSE_CD\" = NULL, "
+"  \"ODR_CANCEL_SLIP_ISS_FLG\" = 0 "
+"where "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getPUCH_ODR_CD(), stmt);

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
			//{{user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCELクラスの標準コンストラクタ
		 */
		public T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_ACPT_RSLT "
+"WHERE "
+"  PUCH_ODR_CD = ? "
+"  AND ACPT_NO = to_number(?)";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPUCH_ODR_CD(), stmt);
				setString(2, data.getACPT_NO(), stmt);

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
			//{{user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_clear

			return;
		}

		/**
		 * T_ACPT_RSLT_FOR_CANCEL_ODR_CANCELクラスの標準コンストラクタ
		 */
		public T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL()
		{
			//{{user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL_constractor

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
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setTHIS_MONTH( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setINSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
	public class readT_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_ISSUE_QTY\" AS \"SUPPLIED_ISSUE_QTY\", "
+"  T_PART_SUPPLIED_ISSUE.\"TOTAL_ISSUE_QTY\" AS \"TOTAL_ISSUE_QTY\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_UNIT_DENOMINATOR\" AS \"SUPPLIED_UNIT_DENOMINATOR\", "
+"  T_PART_SUPPLIED_ISSUE.\"SUPPLIED_UNIT_NUMERATOR\" AS \"SUPPLIED_UNIT_NUMERATOR\" "
+"FROM "
+"  T_PART_SUPPLIED_ISSUE "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"  AND T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = ? "
+"  AND T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_read
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_read2
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_read3
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setreadSUPPLIED_ISSUE_QTY( getString(1, rs) );
			data.setreadTOTAL_ISSUE_QTY( getString(2, rs) );
			data.setreadSUPPLIED_UNIT_DENOMINATOR( getString(3, rs) );
			data.setreadSUPPLIED_UNIT_NUMERATOR( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_PART_SUPPLIED_ISSUE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * readT_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public readT_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:readT_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:readT_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_PART_SUPPLIED_ISSUE "
+"SET "
+"  \"SUPPLIED_ISSUE_QTY\" = ?, "
+"  \"TOTAL_ISSUE_QTY\" = ?, "
+"  \"SUPPLIED_UNIT_DENOMINATOR\" = ?, "
+"  \"SUPPLIED_UNIT_NUMERATOR\" = ? "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.\"PUCH_ODR_CD\" = ? "
+"  AND T_PART_SUPPLIED_ISSUE.\"ACPT_NO\" = ? "
+"  AND T_PART_SUPPLIED_ISSUE.\"ITEM_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(5, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(6, data.getsetSUPPLIED_UNIT_DENOMINATOR(), stmt);
				setString(7, data.getsetSUPPLIED_UNIT_NUMERATOR(), stmt);
				setString(8, data.getPUCH_ODR_CD(), stmt);
				setString(9, data.getACPT_NO(), stmt);
				setString(10, data.getITEM_CD(), stmt);

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
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * updateT_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public updateT_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:updateT_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_RLSD_PUCH_ODR_INSPC_CMPLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_RLSD_PUCH_ODR "
+"SET "
+"  \"INSPC_CMPLT_DATE\" = NULL, "
+"  \"INSPC_CMPLT_FLG\" = 0 "
+"WHERE "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getPUCH_ODR_CD(), stmt);

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
			//{{user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_clear

			return;
		}

		/**
		 * updateT_RLSD_PUCH_ODR_INSPC_CMPLTクラスの標準コンストラクタ
		 */
		public updateT_RLSD_PUCH_ODR_INSPC_CMPLT()
		{
			//{{user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_RLSD_PUCH_ODR_INSPC_CMPLT_constractor

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
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPROC_EXEC_DATE( getBigDecimal(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setPAST_RESULT_ENTRY_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
	public class selectM_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  MW.WH_CD as WH_CD, "
+"  MW.WH_NAME as WH_NAME "
+"from "
+"  M_WH MW "
+"where "
+"  MW.PLANT_CD = ? "
+"  and MW.WH_TYP = 40";
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
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setINSPC_WH_CD( getString(1, rs) );
			data.setINSPC_WH_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
	public class checkLOT_NO extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_LOT_CTRL.LOT_NO "
+"FROM "
+"  T_LOT_CTRL, "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  T_LOT_CTRL.LOT_NO = ? "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? "
+"  AND T_RLSD_PUCH_ODR.ITEM_CD = T_LOT_CTRL.ITEM_CD";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkLOT_NO_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkLOT_NO_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkLOT_NO_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkLOT_NO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLOT_NO(), stmt);
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
			//{{user_implement_dev:checkLOT_NO_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkLOT_NO_clear

			return;
		}

		/**
		 * checkLOT_NOクラスの標準コンストラクタ
		 */
		public checkLOT_NO()
		{
			//{{user_implement_dev:checkLOT_NO_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkLOT_NO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_LOT_CTRL "
+"SET "
+"  \"DEL_FLG\" = 0 "
+"WHERE "
+"  T_LOT_CTRL.\"LOT_NO\" = ? "
+"  AND T_LOT_CTRL.\"ITEM_CD\" = ? "
+"  AND T_LOT_CTRL.\"DEL_FLG\" = 1";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_CTRL_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				stmt = conn.prepareStatement(m_updcmd);

				setString(1, data.getsetLOT_NO(), stmt);
				setString(2, data.getsetITEM_CD(), stmt);

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
			//{{user_implement_dev:updateT_LOT_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_CTRL_clear

			return;
		}

		/**
		 * updateT_LOT_CTRLクラスの標準コンストラクタ
		 */
		public updateT_LOT_CTRL()
		{
			//{{user_implement_dev:updateT_LOT_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkT_LOT_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_LOT_ISSUE_INST.ISSUE_INST_CD "
+"FROM "
+"  T_ISSUE_INST, "
+"  T_LOT_ISSUE_INST, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"WHERE "
+"  T_LOT_ISSUE_INST.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  AND T_ISSUE_INST.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  AND T_ISSUE_INST.ISSUE_INST_CD = T_LOT_ISSUE_INST.ISSUE_INST_CD "
+"  AND T_LOT_ISSUE_INST.LOT_NO = T_LOT_CTRL.LOT_NO "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  AND T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?)";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_LOT_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkT_LOT_ISSUE_INST_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_LOT_ISSUE_INST_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
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
			//{{user_implement_dev:checkT_LOT_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST_clear

			return;
		}

		/**
		 * checkT_LOT_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public checkT_LOT_ISSUE_INST()
		{
			//{{user_implement_dev:checkT_LOT_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkT_LOT_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectQty extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_LOT_ISSUE_INST.LOT_NO, "
+"  TO_CHAR(NVL(T_LOT_ISSUE_INST.ISSUE_QTY, 0) - NVL(T_LOT_ISSUE_INST.SPENT_QTY, 0)), "
+"  TO_CHAR(T_PART_SUPPLIED_ISSUE.SUPPLIED_ISSUE_QTY), "
+"  T_LOT_CTRL.BEST_BEFORE_DATE "
+"FROM "
+"  T_LOT_ISSUE_INST, "
+"  T_PART_SUPPLIED_ISSUE, "
+"  T_LOT_CTRL "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?) "
+"  AND T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ITEM_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD = ? "
+"  AND T_LOT_ISSUE_INST.ISSUE_INST_CD = T_PART_SUPPLIED_ISSUE.ISSUE_INST_CD "
+"  AND T_LOT_ISSUE_INST.PUCH_ODR_CD = T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_PART_SUPPLIED_ISSUE.ITEM_CD "
+"  AND T_LOT_ISSUE_INST.ITEM_CD = T_LOT_CTRL.ITEM_CD "
+"  AND T_LOT_ISSUE_INST.LOT_NO = T_LOT_CTRL.LOT_NO "
+"ORDER BY "
+"  T_LOT_CTRL.BEST_BEFORE_DATE, "
+"  T_LOT_ISSUE_INST.LOT_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectQty_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectQty_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectQty_read
			if(m_selcmd==null) throw new FoundationException("SelectQty", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectQty_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectQty_read2
			if(m_selcmd==null) throw new FoundationException("SelectQty", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectQty_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectQty_read3
			if(m_selcmd==null) throw new FoundationException("SelectQty", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectQty_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getACPT_NO());
				if(isNull(data.getACPT_NO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getISSUE_INST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setreadLOT_NO( getString(1, rs) );
			data.setreadQTY( getString(2, rs) );
			data.setreadSUPPLIED_ISSUE_QTY( getString(3, rs) );
			data.setBEST_BEFORE_DATE( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectQty", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectQty_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectQty_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectQty_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectQty_clear

			return;
		}

		/**
		 * SelectQtyクラスの標準コンストラクタ
		 */
		public SelectQty()
		{
			//{{user_implement_dev:SelectQty_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectQty_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertT_LOT_USE_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_LOT_USE_RSLT(RSLT_CTL_SEQ_NO, ISSUE_INST_CD, LOT_NO, PUCH_ODR_CD, ACPT_NO, ITEM_CD, WH_CD, TOTAL_ISSUE_QTY, SUPPLIED_ISSUE_QTY, SUPPLIED_DATE) "
+"VALUES "
+"  (TO_NUMBER(?), ?, ?, ?, TO_NUMBER(?), ?, ?, TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?, 'YYYY/MM/DD'))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertT_LOT_USE_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertT_LOT_USE_RSLT_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_inscmd);

				setString(1, data.getsetSEQ_NO(), stmt);
				setString(2, data.getsetISSUE_INST_CD(), stmt);
				setString(3, data.getsetLOT_NO(), stmt);
				setString(4, data.getsetPUCH_ODR_CD(), stmt);
				setString(5, data.getsetACPT_NO(), stmt);
				setString(6, data.getsetITEM_CD(), stmt);
				setString(7, data.getsetWH_CD(), stmt);
				setString(8, data.getsetTOTAL_ISSUE_QTY(), stmt);
				setString(9, data.getsetSUPPLIED_ISSUE_QTY(), stmt);
				setString(10, data.getsetSUPPLIED_DATE(), stmt);

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
			//{{user_implement_dev:insertT_LOT_USE_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertT_LOT_USE_RSLT_clear

			return;
		}

		/**
		 * insertT_LOT_USE_RSLTクラスの標準コンストラクタ
		 */
		public insertT_LOT_USE_RSLT()
		{
			//{{user_implement_dev:insertT_LOT_USE_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertT_LOT_USE_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectT_PART_SUPPLIED_ISSUE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ISSUE_INST_CD, "
+"  VEND_CD, "
+"  PLANT_CD, "
+"  TO_CHAR(SUPPLIED_DATE, 'YYYY/MM/DD') "
+"FROM "
+"  T_PART_SUPPLIED_ISSUE "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.PUCH_ODR_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.ACPT_NO = TO_NUMBER(?) "
+"  AND T_PART_SUPPLIED_ISSUE.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read
			if(m_selcmd==null) throw new FoundationException("SelectT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read2
			if(m_selcmd==null) throw new FoundationException("SelectT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read3
			if(m_selcmd==null) throw new FoundationException("SelectT_PART_SUPPLIED_ISSUE", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getACPT_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setreadISSUE_INST_CD( getString(1, rs) );
			data.setreadVEND_CD( getString(2, rs) );
			data.setreadPLANT_CD( getString(3, rs) );
			data.setreadSUPPLIED_DATE( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectT_PART_SUPPLIED_ISSUE", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_clear

			return;
		}

		/**
		 * SelectT_PART_SUPPLIED_ISSUEクラスの標準コンストラクタ
		 */
		public SelectT_PART_SUPPLIED_ISSUE()
		{
			//{{user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectT_PART_SUPPLIED_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_ISSUE_INST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_LOT_ISSUE_INST "
+"SET "
+"  SPENT_QTY = SPENT_QTY + TO_NUMBER(?) "
+"WHERE "
+"  ISSUE_INST_CD = ? "
+"  AND LOT_NO = ? "
+"  AND ITEM_CD = ? "
+"  AND PUCH_ODR_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_ISSUE_INST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_ISSUE_INST_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				stmt = conn.prepareStatement(m_updcmd);

				setString(1, data.getsetSPENT_QTY(), stmt);
				setString(2, data.getISSUE_INST_CD(), stmt);
				setString(3, data.getLOT_NO(), stmt);
				setString(4, data.getITEM_CD(), stmt);
				setString(5, data.getPUCH_ODR_CD(), stmt);

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
			//{{user_implement_dev:updateT_LOT_ISSUE_INST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_ISSUE_INST_clear

			return;
		}

		/**
		 * updateT_LOT_ISSUE_INSTクラスの標準コンストラクタ
		 */
		public updateT_LOT_ISSUE_INST()
		{
			//{{user_implement_dev:updateT_LOT_ISSUE_INST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_ISSUE_INST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectWH_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MIN(M_WH.WH_CD) "
+"FROM "
+"  M_WH, "
+"  T_PART_SUPPLIED_ISSUE "
+"WHERE "
+"  T_PART_SUPPLIED_ISSUE.VEND_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.PLANT_CD = ? "
+"  AND T_PART_SUPPLIED_ISSUE.VEND_CD = M_WH.VEND_CD "
+"  AND T_PART_SUPPLIED_ISSUE.PLANT_CD = M_WH.PLANT_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectWH_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectWH_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectWH_CD_read
			if(m_selcmd==null) throw new FoundationException("SelectWH_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectWH_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectWH_CD_read2
			if(m_selcmd==null) throw new FoundationException("SelectWH_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectWH_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectWH_CD_read3
			if(m_selcmd==null) throw new FoundationException("SelectWH_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectWH_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setreadWH_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectWH_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectWH_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectWH_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectWH_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectWH_CD_clear

			return;
		}

		/**
		 * SelectWH_CDクラスの標準コンストラクタ
		 */
		public SelectWH_CD()
		{
			//{{user_implement_dev:SelectWH_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectWH_CD_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSEQ_JF_RSLT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(SEQ_JF_RSLT.NEXTVAL, 'fm0000000000') "
+"FROM "
+"  dual";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSEQ_JF_RSLT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSEQ_JF_RSLT_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_read
			if(m_selcmd==null) throw new FoundationException("SelectSEQ_JF_RSLT", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_read2
			if(m_selcmd==null) throw new FoundationException("SelectSEQ_JF_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_read3
			if(m_selcmd==null) throw new FoundationException("SelectSEQ_JF_RSLT", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setNEXTVAL( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSEQ_JF_RSLT", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSEQ_JF_RSLT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_clear

			return;
		}

		/**
		 * SelectSEQ_JF_RSLTクラスの標準コンストラクタ
		 */
		public SelectSEQ_JF_RSLT()
		{
			//{{user_implement_dev:SelectSEQ_JF_RSLT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSEQ_JF_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_OD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_RLSD_PUCH_ODR.OD_NO, "
+"  T_OD.ODR_QTY, "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_QTY "
+"FROM "
+"  T_OD, "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_OD "
+"SET "
+"  T_OD.ODR_QTY = ? "
+"WHERE "
+"  T_OD.OD_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_OD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_OD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read
			if(m_selcmd==null) throw new FoundationException("T_OD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_OD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read2
			if(m_selcmd==null) throw new FoundationException("T_OD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_OD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read3
			if(m_selcmd==null) throw new FoundationException("T_OD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_OD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setOD_NO( getString(1, rs) );
			data.setODR_QTY( getString(2, rs) );
			data.setPUCH_ODR_QTY( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_OD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_OD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getODR_QTY(), stmt);
				setString(5, data.getOD_NO(), stmt);

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
			//{{user_implement_dev:T_OD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_OD_clear

			return;
		}

		/**
		 * T_ODクラスの標準コンストラクタ
		 */
		public T_OD()
		{
			//{{user_implement_dev:T_OD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_OD_constractor

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
+"  SYS_BAT_PARM.\"PROGRAM_CD\" = 'AE0060010' "
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
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

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
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
	public class callSQLCALCTAXCALCAMT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = "{" + "call SQLCALCTAXCALCAMT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" + "}";



		//////////////////////////////

		//{{user_implement_dev:callSQLCALCTAXCALCAMT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:callSQLCALCTAXCALCAMT_def

		/**
		 * Stored Procudure処理
		 *
		 * @return Listインスタンスで実行結果を返します
		 * @param IDbConnection
		 * @param AE0060010Struct
		 * @exception FoundationException, SQLException
		 */
		public List call(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:callSQLCALCTAXCALCAMT_call_storedproc
				// todo: Stored Procedure実行時の処理を記述してください
			return call(conn.getConn(), data);
                        //}}user_implement_dev:callSQLCALCTAXCALCAMT_call_storedproc
		}

		/**
		 * Stored Procudure処理
		 *
		 * @return Listインスタンスで実行結果を返します
		 * @param Connection
		 * @param AE0060010Struct
		 * @exception FoundationException, SQLException
		 */
		public List call(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		 * @return AE0060010Structインスタンスで実行結果を返します
		 * @param ResultSet
		 * @exception FoundationException, SQLException
		 */
		public AE0060010Struct call(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs == null || rs.next()==false) return null;
			AE0060010Struct data = new AE0060010Struct();
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
			//{{user_implement_dev:callSQLCALCTAXCALCAMT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:callSQLCALCTAXCALCAMT_clear

			return;
		}

		/**
		 * callSQLCALCTAXCALCAMTクラスの標準コンストラクタ
		 */
		public callSQLCALCTAXCALCAMT()
		{
			//{{user_implement_dev:callSQLCALCTAXCALCAMT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:callSQLCALCTAXCALCAMT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateT_LOT_TRACE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  t_lot_trace "
+"set "
+"  FROM_PUCH_ODR_CD = ?, "
+"  TO_PUCH_ODR_CD = ? "
+"where "
+"  from_item_cd = ? "
+"  and from_lot_no = ? "
+"  and to_item_cd = ? "
+"  and to_lot_no = ? "
+"  and lot_trace_typ = 1";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0060010";
		protected String m_sUpdateProgramName="AE0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_TRACE_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateT_LOT_TRACE_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getFROM_PUCH_ODR_CD(), stmt);
				setString(5, data.getTO_PUCH_ODR_CD(), stmt);
				setString(6, data.getFROM_ITEM_CD(), stmt);
				setString(7, data.getFROM_LOT_NO(), stmt);
				setString(8, data.getTO_ITEM_CD(), stmt);
				setString(9, data.getTO_LOT_NO(), stmt);

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
			//{{user_implement_dev:updateT_LOT_TRACE_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateT_LOT_TRACE_clear

			return;
		}

		/**
		 * updateT_LOT_TRACEクラスの標準コンストラクタ
		 */
		public updateT_LOT_TRACE()
		{
			//{{user_implement_dev:updateT_LOT_TRACE_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateT_LOT_TRACE_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class getFROM_PUCH_ODR_CD extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_ACPT_RSLT.PUCH_ODR_CD "
+"FROM "
+"  T_ACPT_RSLT "
+"WHERE "
+"  T_ACPT_RSLT.ITEM_CD = ? "
+"  AND T_ACPT_RSLT.LOT_NO = ? "
+"ORDER BY "
+"  PUCH_ODR_CD DESC, "
+"  ACPT_NO DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getFROM_PUCH_ODR_CD_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:getFROM_PUCH_ODR_CD_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_read
			if(m_selcmd==null) throw new FoundationException("getFROM_PUCH_ODR_CD", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_read2
			if(m_selcmd==null) throw new FoundationException("getFROM_PUCH_ODR_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AE0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_read3
			if(m_selcmd==null) throw new FoundationException("getFROM_PUCH_ODR_CD", "read", "クエリー未登録");
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
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getFROM_ITEM_CD());
				if(isNull(data.getFROM_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_LOT_NO());
				if(isNull(data.getFROM_LOT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getFROM_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getFROM_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AE0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0060010Struct data = new AE0060010Struct();

			data.setFROM_PUCH_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getFROM_PUCH_ODR_CD", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AE0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AE0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_clear

			return;
		}

		/**
		 * getFROM_PUCH_ODR_CDクラスの標準コンストラクタ
		 */
		public getFROM_PUCH_ODR_CD()
		{
			//{{user_implement_dev:getFROM_PUCH_ODR_CD_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:getFROM_PUCH_ODR_CD_constractor

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
		mFormFirst.clear();
		mFormFirst = null;
		mFormAfter.clear();
		mFormAfter = null;
		mT_ACPT_RSLT.clear();
		mT_ACPT_RSLT = null;
		mT_INSPC_RSLT.clear();
		mT_INSPC_RSLT = null;
		mT_RLSD_PUCH_ODR.clear();
		mT_RLSD_PUCH_ODR = null;
		mM_WH.clear();
		mM_WH = null;
		mM_TAX.clear();
		mM_TAX = null;
		mT_RLSD_PUCH_ODRForComplete.clear();
		mT_RLSD_PUCH_ODRForComplete = null;
		mT_RLSD_PUCH_ODRForCancel.clear();
		mT_RLSD_PUCH_ODRForCancel = null;
		mT_RLSD_PUCH_ODR_Lock.clear();
		mT_RLSD_PUCH_ODR_Lock = null;
		mFormUpdate.clear();
		mFormUpdate = null;
		mT_ISSUE_INST.clear();
		mT_ISSUE_INST = null;
		mT_PART_SUPPLIED_ISSUE.clear();
		mT_PART_SUPPLIED_ISSUE = null;
		mreadT_ITEM_STOCK.clear();
		mreadT_ITEM_STOCK = null;
		mreadT_JOB_ODR_CD_STOCK.clear();
		mreadT_JOB_ODR_CD_STOCK = null;
		mreadM_WH.clear();
		mreadM_WH = null;
		minsertT_ITEM_STOCK.clear();
		minsertT_ITEM_STOCK = null;
		mupdateT_ITEM_STOCK.clear();
		mupdateT_ITEM_STOCK = null;
		minsertT_JOB_ODR_CD_STOCK.clear();
		minsertT_JOB_ODR_CD_STOCK = null;
		mupdateT_JOB_ODR_CD_STOCK.clear();
		mupdateT_JOB_ODR_CD_STOCK = null;
		minsertT_RCV_ISSUE.clear();
		minsertT_RCV_ISSUE = null;
		mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL.clear();
		mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL = null;
		mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL.clear();
		mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL = null;
		mSYS_DEBT_CTRL.clear();
		mSYS_DEBT_CTRL = null;
		mSYS_INSTALL_OPTIONS.clear();
		mSYS_INSTALL_OPTIONS = null;
		mreadT_PART_SUPPLIED_ISSUE.clear();
		mreadT_PART_SUPPLIED_ISSUE = null;
		mupdateT_PART_SUPPLIED_ISSUE.clear();
		mupdateT_PART_SUPPLIED_ISSUE = null;
		mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT.clear();
		mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT = null;
		mSELECT_SYS_ACTUAL_COST_CTRL_AC.clear();
		mSELECT_SYS_ACTUAL_COST_CTRL_AC = null;
		mSELECT_SYS_PARAMETER.clear();
		mSELECT_SYS_PARAMETER = null;
		mselectM_WH.clear();
		mselectM_WH = null;
		mcheckLOT_NO.clear();
		mcheckLOT_NO = null;
		mupdateT_LOT_CTRL.clear();
		mupdateT_LOT_CTRL = null;
		mcheckT_LOT_ISSUE_INST.clear();
		mcheckT_LOT_ISSUE_INST = null;
		mSelectQty.clear();
		mSelectQty = null;
		minsertT_LOT_USE_RSLT.clear();
		minsertT_LOT_USE_RSLT = null;
		mSelectT_PART_SUPPLIED_ISSUE.clear();
		mSelectT_PART_SUPPLIED_ISSUE = null;
		mupdateT_LOT_ISSUE_INST.clear();
		mupdateT_LOT_ISSUE_INST = null;
		mSelectWH_CD.clear();
		mSelectWH_CD = null;
		mSelectSEQ_JF_RSLT.clear();
		mSelectSEQ_JF_RSLT = null;
		mT_OD.clear();
		mT_OD = null;
		mSYS_BAT_PARM.clear();
		mSYS_BAT_PARM = null;
		mcallSQLCALCTAXCALCAMT.clear();
		mcallSQLCALCTAXCALCAMT = null;
		mupdateT_LOT_TRACE.clear();
		mupdateT_LOT_TRACE = null;
		mgetFROM_PUCH_ODR_CD.clear();
		mgetFROM_PUCH_ODR_CD = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AE0060010クラスの標準コンストラクタ
	 */
	public AE0060010Entity() throws FoundationException
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
