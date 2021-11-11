/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0170/src/com/nec/jp/orteus/metamorBase/AA0170/AA0170010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0170;

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

public class AA0170010Entity extends DataObject
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

	// selectM_PSクラス インスタンス
	public selectM_PS mselectM_PS = new selectM_PS();

	// insertSub1M_PSクラス インスタンス
	public insertSub1M_PS minsertSub1M_PS = new insertSub1M_PS();

	// updateSub1M_PSクラス インスタンス
	public updateSub1M_PS mupdateSub1M_PS = new updateSub1M_PS();

	// selectSYS_PS_Tクラス インスタンス
	public selectSYS_PS_T mselectSYS_PS_T = new selectSYS_PS_T();

	// insertSYS_PS_Tクラス インスタンス
	public insertSYS_PS_T minsertSYS_PS_T = new insertSYS_PS_T();

	// selectM_ITEM_mrp_odr_typクラス インスタンス
	public selectM_ITEM_mrp_odr_typ mselectM_ITEM_mrp_odr_typ = new selectM_ITEM_mrp_odr_typ();

	// checkM_PS_ps_editionクラス インスタンス
	public checkM_PS_ps_edition mcheckM_PS_ps_edition = new checkM_PS_ps_edition();

	// deleteM_PSクラス インスタンス
	public deleteM_PS mdeleteM_PS = new deleteM_PS();

	// selectM_PS_ps_editionクラス インスタンス
	public selectM_PS_ps_edition mselectM_PS_ps_edition = new selectM_PS_ps_edition();

	// selectM_PS_eff_phase_dateクラス インスタンス
	public selectM_PS_eff_phase_date mselectM_PS_eff_phase_date = new selectM_PS_eff_phase_date();

	// checkM_ITEMクラス インスタンス
	public checkM_ITEM mcheckM_ITEM = new checkM_ITEM();

	// selectM_ITEMクラス インスタンス
	public selectM_ITEM mselectM_ITEM = new selectM_ITEM();

	// selectM_PS_modify_countクラス インスタンス
	public selectM_PS_modify_count mselectM_PS_modify_count = new selectM_PS_modify_count();

	// insertPsM_PSクラス インスタンス
	public insertPsM_PS minsertPsM_PS = new insertPsM_PS();

	// updatePsM_PSクラス インスタンス
	public updatePsM_PS mupdatePsM_PS = new updatePsM_PS();

	// selectM_PROC_GRPクラス インスタンス
	public selectM_PROC_GRP mselectM_PROC_GRP = new selectM_PROC_GRP();

	// deleteM_SBCNT_UNIT_COSTクラス インスタンス
	public deleteM_SBCNT_UNIT_COST mdeleteM_SBCNT_UNIT_COST = new deleteM_SBCNT_UNIT_COST();

	// deleteM_SBCNT_UNIT_COST_Hクラス インスタンス
	public deleteM_SBCNT_UNIT_COST_H mdeleteM_SBCNT_UNIT_COST_H = new deleteM_SBCNT_UNIT_COST_H();

	// selectM_PROC_GRP_modify_countクラス インスタンス
	public selectM_PROC_GRP_modify_count mselectM_PROC_GRP_modify_count = new selectM_PROC_GRP_modify_count();

	// deleteM_PROC_GRPクラス インスタンス
	public deleteM_PROC_GRP mdeleteM_PROC_GRP = new deleteM_PROC_GRP();

	// deleteAllM_SBCNT_UNIT_COSTクラス インスタンス
	public deleteAllM_SBCNT_UNIT_COST mdeleteAllM_SBCNT_UNIT_COST = new deleteAllM_SBCNT_UNIT_COST();

	// deleteAllM_SBCNT_UNIT_COST_Hクラス インスタンス
	public deleteAllM_SBCNT_UNIT_COST_H mdeleteAllM_SBCNT_UNIT_COST_H = new deleteAllM_SBCNT_UNIT_COST_H();

	// deleteAllM_PROC_GRPクラス インスタンス
	public deleteAllM_PROC_GRP mdeleteAllM_PROC_GRP = new deleteAllM_PROC_GRP();

	// selectM_PROC_GRP_for_update_nowaitクラス インスタンス
	public selectM_PROC_GRP_for_update_nowait mselectM_PROC_GRP_for_update_nowait = new selectM_PROC_GRP_for_update_nowait();

	// updateM_PROC_GRP_procNoクラス インスタンス
	public updateM_PROC_GRP_procNo mupdateM_PROC_GRP_procNo = new updateM_PROC_GRP_procNo();

	// selectM_PROC_GRP_oneRecordクラス インスタンス
	public selectM_PROC_GRP_oneRecord mselectM_PROC_GRP_oneRecord = new selectM_PROC_GRP_oneRecord();

	// checkM_WSクラス インスタンス
	public checkM_WS mcheckM_WS = new checkM_WS();

	// checkM_WS_plantCdクラス インスタンス
	public checkM_WS_plantCd mcheckM_WS_plantCd = new checkM_WS_plantCd();

	// checkM_VEND_CTRLクラス インスタンス
	public checkM_VEND_CTRL mcheckM_VEND_CTRL = new checkM_VEND_CTRL();

	// selectSYS_MY_COMPANYクラス インスタンス
	public selectSYS_MY_COMPANY mselectSYS_MY_COMPANY = new selectSYS_MY_COMPANY();

	// insertM_PROC_GRPクラス インスタンス
	public insertM_PROC_GRP minsertM_PROC_GRP = new insertM_PROC_GRP();

	// selectM_PROC_GRP_procNoクラス インスタンス
	public selectM_PROC_GRP_procNo mselectM_PROC_GRP_procNo = new selectM_PROC_GRP_procNo();

	// updateM_PROC_GRPクラス インスタンス
	public updateM_PROC_GRP mupdateM_PROC_GRP = new updateM_PROC_GRP();

	// selectM_PS_psUnitNumeratorクラス インスタンス
	public selectM_PS_psUnitNumerator mselectM_PS_psUnitNumerator = new selectM_PS_psUnitNumerator();

	// selectM_PROC_GRP_minProcNoクラス インスタンス
	public selectM_PROC_GRP_minProcNo mselectM_PROC_GRP_minProcNo = new selectM_PROC_GRP_minProcNo();

	// checkM_BY_PRODUCTクラス インスタンス
	public checkM_BY_PRODUCT mcheckM_BY_PRODUCT = new checkM_BY_PRODUCT();

	// Select_SYS_DATE_CTRLクラス インスタンス
	public Select_SYS_DATE_CTRL mSelect_SYS_DATE_CTRL = new Select_SYS_DATE_CTRL();

	// SELECT_SYS_PARAMETERクラス インスタンス
	public SELECT_SYS_PARAMETER mSELECT_SYS_PARAMETER = new SELECT_SYS_PARAMETER();


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
		String m_write_fname="AA0170010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AA0170010";

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
	public class selectM_PS extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PS.\"PARENT_ITEM_CD\" as \"PARENT_ITEM_CD\", "
+"  M_PS.\"COMP_ITEM_CD\" as \"COMP_ITEM_CD\", "
+"  M_PS.\"PS_EDITION\" as \"PS_EDITION\", "
+"  TO_CHAR(M_PS.\"PS_UNIT_DENOMINATOR\", 'FM99999999999990.0999') as \"PS_UNIT_DENOMINATOR\", "
+"  TO_CHAR(M_PS.\"PS_UNIT_NUMERATOR\", 'FM99999999999990.0999') as \"PS_UNIT_NUMERATOR\", "
+"  TO_CHAR(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') as \"EFF_PHASE_IN_DATE\", "
+"  TO_CHAR(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYY/MM/DD') as \"EFF_PHASE_OUT_DATE\", "
+"  TO_CHAR(M_PS.\"PS_SPOIL\", 'FM99990.0999') as \"PS_SPOIL\", "
+"  M_PS.\"CONS_TYP\" as \"CONS_TYP\", "
+"  M_PS.\"PS_LT_FLG\" as \"PS_LT_FLG\", "
+"  TO_CHAR(M_PS.\"PS_FIXED_LT\") as \"PS_FIXED_LT\", "
+"  TO_CHAR(M_PS.\"PS_PROP_LT\") as \"PS_PROP_LT\", "
+"  TO_CHAR(M_PS.\"PS_PROP_LOT_SIZE\", 'FM99999999999990.0999') as \"PS_PROP_LOT_SIZE\", "
+"  TO_CHAR(M_PS.\"PS_REF_NO\") as \"PS_REF_NO\", "
+"  M_PS.\"COST_UP_TYP\" as \"COST_UP_TYP\", "
+"  M_PS.\"MRP_EXP_TYP\" as \"MRP_EXP_TYP\", "
+"  TO_CHAR(M_PS.\"MODIFY_COUNT\") as \"MODIFY_COUNT\", "
+"  X.\"ITEM_NAME\" as \"PARENT_ITEM_NAME\", "
+"  M_ITEM.\"ITEM_NAME\" as \"COMP_ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  M_ITEM.\"MANHOUR_TYP\" as \"COMP_MANHOUR_TYP\", "
+"  X.\"MANHOUR_TYP\" as \"PAREMT_MANHOUR_TYP\" "
+"from "
+"  M_PS, "
+"  M_ITEM, "
+"  M_ITEM X "
+"where "
+"  M_PS.\"COMP_ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  and M_PS.\"PARENT_ITEM_CD\" = X.\"ITEM_CD\" "
+"  and M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"EFF_PHASE_IN_DATE\" <= TO_DATE(?) "
+"  and M_PS.\"EFF_PHASE_OUT_DATE\" >= TO_DATE(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PS_def
                //}}user_implement_dev:selectM_PS_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_read
                        if(m_selcmd==null) throw new FoundationException("selectM_PS", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_PS_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PS", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PS", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPARENT_ITEM_CD());
				if(isNull(data.getPARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getCOMP_ITEM_CD());
				if(isNull(data.getCOMP_ITEM_CD())) isNull = true;
				ary.addElement(data.getEFF_PHASE_IN_DATE());
				if(isNull(data.getEFF_PHASE_IN_DATE())) isNull = true;
				ary.addElement(data.getEFF_PHASE_OUT_DATE());
				if(isNull(data.getEFF_PHASE_OUT_DATE())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectM_PS", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getPARENT_ITEM_CD())) setString(no ++, data.getPARENT_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getCOMP_ITEM_CD())) setString(no ++, data.getCOMP_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getEFF_PHASE_IN_DATE())) setString(no ++, data.getEFF_PHASE_IN_DATE(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getEFF_PHASE_OUT_DATE())) setString(no ++, data.getEFF_PHASE_OUT_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setps_PARENT_ITEM_CD( getString(1, rs) );
			data.setps_COMP_ITEM_CD( getString(2, rs) );
			data.setps_PS_EDITION( getString(3, rs) );
			data.setps_PS_UNIT_DENOMINATOR( getString(4, rs) );
			data.setps_PS_UNIT_NUMERATOR( getString(5, rs) );
			data.setps_EFF_PHASE_IN_DATE( getString(6, rs) );
			data.setps_EFF_PHASE_OUT_DATE( getString(7, rs) );
			data.setps_PS_SPOIL( getString(8, rs) );
			data.setps_CONS_TYP( getString(9, rs) );
			data.setps_PS_LT_FLG( getString(10, rs) );
			data.setps_PS_FIXED_LT( getString(11, rs) );
			data.setps_PS_PROP_LT( getString(12, rs) );
			data.setps_PS_PROP_LOT_SIZE( getString(13, rs) );
			data.setps_PS_REF_NO( getString(14, rs) );
			data.setps_COST_UP_TYP( getString(15, rs) );
			data.setps_MRP_EXP_TYP( getString(16, rs) );
			data.setps_MODIFY_COUNT( getString(17, rs) );
			data.setps_PARENT_ITEM_NAME( getString(18, rs) );
			data.setps_COMP_ITEM_NAME( getString(19, rs) );
			data.setps_STOCK_UNIT( getString(20, rs) );
			data.setps_COMP_MANHOUR_TYP( getString(21, rs) );
			data.setps_PARENT_MANHOUR_TYP( getString(22, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PS", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectM_PS", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_PS_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PS_clear
                        //}}user_implement_dev:selectM_PS_clear

			return;
		}

		/**
		 * selectM_PSクラスの標準コンストラクタ
		 */
		public selectM_PS()
		{
			//{{user_implement_dev:selectM_PS_constractor
                        //}}user_implement_dev:selectM_PS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertSub1M_PS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  M_PS(\"PARENT_ITEM_CD\", \"COMP_ITEM_CD\", \"PS_EDITION\", \"PS_UNIT_DENOMINATOR\", \"PS_UNIT_NUMERATOR\", \"EFF_PHASE_IN_DATE\", \"EFF_PHASE_OUT_DATE\", \"PS_SPOIL\", \"CONS_TYP\", \"PS_LT_FLG\", \"PS_FIXED_LT\", \"PS_PROP_LT\", \"PS_PROP_LOT_SIZE\", \"PS_REF_NO\", \"COST_UP_TYP\", \"MRP_EXP_TYP\") "
+"values "
+"  (?, ?, ?, TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?), TO_DATE(?), TO_NUMBER(?), ?, ?, TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertSub1M_PS_def
                //}}user_implement_dev:insertSub1M_PS_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getsub1_PARENT_ITEM_CD(), stmt);
				setString(8, data.getsub1_COMP_ITEM_CD(), stmt);
				setString(9, data.getsub1_PS_EDITION(), stmt);
				setString(10, data.getsub1_PS_UNIT_DENOMINATOR(), stmt);
				setString(11, data.getsub1_PS_UNIT_NUMERATOR(), stmt);
				setString(12, data.getsub1_EFF_PHASE_IN_DATE(), stmt);
				setString(13, data.getsub1_EFF_PHASE_OUT_DATE(), stmt);
				setString(14, data.getsub1_PS_SPOIL(), stmt);
				setString(15, data.getsub1_CONS_TYP(), stmt);
				setString(16, data.getsub1_PS_LT_FLG(), stmt);
				setString(17, data.getsub1_PS_FIXED_LT(), stmt);
				setString(18, data.getsub1_PS_PROP_LT(), stmt);
				setString(19, data.getsub1_PS_PROP_LOT_SIZE(), stmt);
				setString(20, data.getsub1_PS_REF_NO(), stmt);
				setString(21, data.getsub1_COST_UP_TYP(), stmt);
				setString(22, data.getsub1_MRP_EXP_TYP(), stmt);

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
			//{{user_implement_dev:insertSub1M_PS_clear
                        //}}user_implement_dev:insertSub1M_PS_clear

			return;
		}

		/**
		 * insertSub1M_PSクラスの標準コンストラクタ
		 */
		public insertSub1M_PS()
		{
			//{{user_implement_dev:insertSub1M_PS_constractor
                        //}}user_implement_dev:insertSub1M_PS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateSub1M_PS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  M_PS "
+"set "
+"  \"PS_UNIT_DENOMINATOR\" = ?, "
+"  \"PS_UNIT_NUMERATOR\" = ?, "
+"  \"EFF_PHASE_IN_DATE\" = TO_DATE(?), "
+"  \"EFF_PHASE_OUT_DATE\" = TO_DATE(?), "
+"  \"PS_SPOIL\" = TO_NUMBER(?), "
+"  \"CONS_TYP\" = ?, "
+"  \"PS_LT_FLG\" = ?, "
+"  \"PS_FIXED_LT\" = TO_NUMBER(?), "
+"  \"PS_PROP_LT\" = TO_NUMBER(?), "
+"  \"PS_PROP_LOT_SIZE\" = TO_NUMBER(?), "
+"  \"PS_REF_NO\" = TO_NUMBER(?), "
+"  \"COST_UP_TYP\" = ?, "
+"  \"MRP_EXP_TYP\" = ? "
+"where "
+"  M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"PS_EDITION\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateSub1M_PS_def
                //}}user_implement_dev:updateSub1M_PS_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsub1_PS_UNIT_DENOMINATOR(), stmt);
				setString(5, data.getsub1_PS_UNIT_NUMERATOR(), stmt);
				setString(6, data.getsub1_EFF_PHASE_IN_DATE(), stmt);
				setString(7, data.getsub1_EFF_PHASE_OUT_DATE(), stmt);
				setString(8, data.getsub1_PS_SPOIL(), stmt);
				setString(9, data.getsub1_CONS_TYP(), stmt);
				setString(10, data.getsub1_PS_LT_FLG(), stmt);
				setString(11, data.getsub1_PS_FIXED_LT(), stmt);
				setString(12, data.getsub1_PS_PROP_LT(), stmt);
				setString(13, data.getsub1_PS_PROP_LOT_SIZE(), stmt);
				setString(14, data.getsub1_PS_REF_NO(), stmt);
				setString(15, data.getsub1_COST_UP_TYP(), stmt);
				setString(16, data.getsub1_MRP_EXP_TYP(), stmt);
				setString(17, data.getsub1_PARENT_ITEM_CD(), stmt);
				setString(18, data.getsub1_COMP_ITEM_CD(), stmt);
				setString(19, data.getsub1_PS_EDITION(), stmt);

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
			//{{user_implement_dev:updateSub1M_PS_clear
                        //}}user_implement_dev:updateSub1M_PS_clear

			return;
		}

		/**
		 * updateSub1M_PSクラスの標準コンストラクタ
		 */
		public updateSub1M_PS()
		{
			//{{user_implement_dev:updateSub1M_PS_constractor
                        //}}user_implement_dev:updateSub1M_PS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSYS_PS_T extends DataObject
	{
		protected String m_selcmd = "select "
+"  MAX(SYS_PS_T.\"SEQ_NO\") as \"SEQ_NO\" "
+"from "
+"  SYS_PS_T";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_PS_T_def
                //}}user_implement_dev:selectSYS_PS_T_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_PS_T_read
                        if(m_selcmd==null) throw new FoundationException("selectSYS_PS_T", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_PS_T_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_PS_T_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_PS_T", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_PS_T_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_PS_T_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_PS_T", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_PS_T_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setSEQ_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_PS_T", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_PS_T_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectSYS_PS_T", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_PS_T_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSYS_PS_T_clear
                        //}}user_implement_dev:selectSYS_PS_T_clear

			return;
		}

		/**
		 * selectSYS_PS_Tクラスの標準コンストラクタ
		 */
		public selectSYS_PS_T()
		{
			//{{user_implement_dev:selectSYS_PS_T_constractor
                        //}}user_implement_dev:selectSYS_PS_T_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertSYS_PS_T extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  SYS_PS_T(\"SEQ_NO\", \"PARENT_ITEM_CD\", \"COMP_ITEM_CD\", \"PS_EDITION\", \"ACCESS_TYP\", \"CMPLT_FLG\") "
+"values "
+"  (?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertSYS_PS_T_def
                //}}user_implement_dev:insertSYS_PS_T_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getSEQ_NO(), stmt);
				setString(8, data.getPARENT_ITEM_CD(), stmt);
				setString(9, data.getCOMP_ITEM_CD(), stmt);
				setString(10, data.getPS_EDITION(), stmt);
				setString(11, data.getACCESS_TYP(), stmt);
				setString(12, data.getCMPLT_FLG(), stmt);

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
			//{{user_implement_dev:insertSYS_PS_T_clear
                        //}}user_implement_dev:insertSYS_PS_T_clear

			return;
		}

		/**
		 * insertSYS_PS_Tクラスの標準コンストラクタ
		 */
		public insertSYS_PS_T()
		{
			//{{user_implement_dev:insertSYS_PS_T_constractor
                        //}}user_implement_dev:insertSYS_PS_T_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_ITEM_mrp_odr_typ extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\" "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_ITEM_mrp_odr_typ_def
                //}}user_implement_dev:selectM_ITEM_mrp_odr_typ_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_mrp_odr_typ_read
                        if(m_selcmd==null) throw new FoundationException("selectM_ITEM_mrp_odr_typ", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_ITEM_mrp_odr_typ_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_mrp_odr_typ_read2
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM_mrp_odr_typ", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_ITEM_mrp_odr_typ_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_mrp_odr_typ_read3
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM_mrp_odr_typ", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_ITEM_mrp_odr_typ_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setMRP_ODR_TYP( getInteger(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM_mrp_odr_typ", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_mrp_odr_typ_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectM_ITEM_mrp_odr_typ", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_ITEM_mrp_odr_typ_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_ITEM_mrp_odr_typ_clear
                        //}}user_implement_dev:selectM_ITEM_mrp_odr_typ_clear

			return;
		}

		/**
		 * selectM_ITEM_mrp_odr_typクラスの標準コンストラクタ
		 */
		public selectM_ITEM_mrp_odr_typ()
		{
			//{{user_implement_dev:selectM_ITEM_mrp_odr_typ_constractor
                        //}}user_implement_dev:selectM_ITEM_mrp_odr_typ_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_PS_ps_edition extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_PS.\"PARENT_ITEM_CD\" as \"PARENT_ITEM_CD\", "
+"  M_PS.\"COMP_ITEM_CD\" as \"COMP_ITEM_CD\", "
+"  M_PS.\"PS_EDITION\" as \"PS_EDITION\" "
+"from "
+"  M_PS "
+"where "
+"  M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"PS_EDITION\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_PS_ps_edition_def
                //}}user_implement_dev:checkM_PS_ps_edition_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PS_ps_edition_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null){
                         stmt = conn.prepareStatement(m_chkcmd);
                         setString(1, data.getPARENT_ITEM_CD(), stmt);
                         setString(2, data.getCOMP_ITEM_CD(), stmt);
                         setString(3, data.getPS_EDITION(), stmt);
                     
                        }else{
                         throw new FoundationException("checkM_PS_ps_edition_check", "check", "クエリー未登録");
                        }
                     
                        try{
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                     
                        //------------------------------------------------------------------
                        //}}user_implement_dev:checkM_PS_ps_edition_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPARENT_ITEM_CD());
				if(isNull(data.getPARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getCOMP_ITEM_CD());
				if(isNull(data.getCOMP_ITEM_CD())) isNull = true;
				ary.addElement(data.getPS_EDITION());
				if(isNull(data.getPS_EDITION())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPARENT_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMP_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_PS_ps_edition_clear
                        //}}user_implement_dev:checkM_PS_ps_edition_clear

			return;
		}

		/**
		 * checkM_PS_ps_editionクラスの標準コンストラクタ
		 */
		public checkM_PS_ps_edition()
		{
			//{{user_implement_dev:checkM_PS_ps_edition_constractor
                        //}}user_implement_dev:checkM_PS_ps_edition_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteM_PS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  M_PS "
+"where "
+"  M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"PS_EDITION\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteM_PS_def
                //}}user_implement_dev:deleteM_PS_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getps_PARENT_ITEM_CD(), stmt);
				setString(2, data.getps_COMP_ITEM_CD(), stmt);
				setString(3, data.getps_PS_EDITION(), stmt);

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
			//{{user_implement_dev:deleteM_PS_clear
                        //}}user_implement_dev:deleteM_PS_clear

			return;
		}

		/**
		 * deleteM_PSクラスの標準コンストラクタ
		 */
		public deleteM_PS()
		{
			//{{user_implement_dev:deleteM_PS_constractor
                        //}}user_implement_dev:deleteM_PS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PS_ps_edition extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PS.\"PARENT_ITEM_CD\" as \"PARENT_ITEM_CD\", "
+"  M_PS.\"COMP_ITEM_CD\" as \"COMP_ITEM_CD\", "
+"  M_PS.\"PS_EDITION\" as \"PS_EDITION\", "
+"  M_PS.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  M_PS "
+"where "
+"  M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PS_ps_edition_def
                //}}user_implement_dev:selectM_PS_ps_edition_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_ps_edition_read
                        if(m_selcmd==null) throw new FoundationException("selectM_PS_ps_edition", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_PS_ps_edition_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_ps_edition_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PS_ps_edition", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_ps_edition_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_ps_edition_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PS_ps_edition", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_ps_edition_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getps_PARENT_ITEM_CD());
				if(isNull(data.getps_PARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getps_COMP_ITEM_CD());
				if(isNull(data.getps_COMP_ITEM_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectM_PS_ps_edition", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getps_PARENT_ITEM_CD())) setString(no ++, data.getps_PARENT_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getps_COMP_ITEM_CD())) setString(no ++, data.getps_COMP_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setPARENT_ITEM_CD( getString(1, rs) );
			data.setCOMP_ITEM_CD( getString(2, rs) );
			data.setPS_EDITION( getString(3, rs) );
			data.setMODIFY_COUNT( getString(4, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PS_ps_edition", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_ps_edition_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectM_PS_ps_edition", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_PS_ps_edition_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PS_ps_edition_clear
                        //}}user_implement_dev:selectM_PS_ps_edition_clear

			return;
		}

		/**
		 * selectM_PS_ps_editionクラスの標準コンストラクタ
		 */
		public selectM_PS_ps_edition()
		{
			//{{user_implement_dev:selectM_PS_ps_edition_constractor
                        //}}user_implement_dev:selectM_PS_ps_edition_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PS_eff_phase_date extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PS.\"PARENT_ITEM_CD\" as \"PARENT_ITEM_CD\", "
+"  M_PS.\"COMP_ITEM_CD\" as \"COMP_ITEM_CD\", "
+"  M_PS.\"PS_EDITION\" as \"PS_EDITION\", "
+"  TO_CHAR(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') as \"EFF_PHASE_IN_DATE\", "
+"  TO_CHAR(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYY/MM/DD') as \"EFF_PHASE_OUT_DATE\" "
+"from "
+"  M_PS "
+"where "
+"  M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PS_eff_phase_date_def
                //}}user_implement_dev:selectM_PS_eff_phase_date_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_eff_phase_date_read
                        if(m_selcmd==null) throw new FoundationException("selectM_PS_eff_phase_date", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_PS_eff_phase_date_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_eff_phase_date_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PS_eff_phase_date", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_eff_phase_date_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_eff_phase_date_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PS_eff_phase_date", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_eff_phase_date_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPARENT_ITEM_CD());
				if(isNull(data.getPARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getCOMP_ITEM_CD());
				if(isNull(data.getCOMP_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPARENT_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMP_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setPARENT_ITEM_CD( getString(1, rs) );
			data.setCOMP_ITEM_CD( getString(2, rs) );
			data.setPS_EDITION( getString(3, rs) );
			data.setEFF_PHASE_IN_DATE( getString(4, rs) );
			data.setEFF_PHASE_OUT_DATE( getString(5, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PS_eff_phase_date", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_eff_phase_date_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectM_PS_eff_phase_date", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_PS_eff_phase_date_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PS_eff_phase_date_clear
                        //}}user_implement_dev:selectM_PS_eff_phase_date_clear

			return;
		}

		/**
		 * selectM_PS_eff_phase_dateクラスの標準コンストラクタ
		 */
		public selectM_PS_eff_phase_date()
		{
			//{{user_implement_dev:selectM_PS_eff_phase_date_constractor
                        //}}user_implement_dev:selectM_PS_eff_phase_date_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_ITEM extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\" "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.\"ITEM_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_ITEM_def
                //}}user_implement_dev:checkM_ITEM_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_ITEM_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd != null){
                         stmt = conn.prepareStatement(m_chkcmd);
                         setString(1, data.getITEM_CD(), stmt);
                     
                        }else{
                         throw new FoundationException("checkM_ITEM_check", "check", "クエリー未登録");
                        }
                     
                        try{
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                     
                        //------------------------------------------------------------------
                        //}}user_implement_dev:checkM_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkM_ITEM_clear
                        //}}user_implement_dev:checkM_ITEM_clear

			return;
		}

		/**
		 * checkM_ITEMクラスの標準コンストラクタ
		 */
		public checkM_ITEM()
		{
			//{{user_implement_dev:checkM_ITEM_constractor
                        //}}user_implement_dev:checkM_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  M_ITEM.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  M_ITEM.\"OUTSIDE_TYP\" as \"OUTSIDE_TYP\", "
+"  M_ITEM.\"OPR_RSLT_TYP\" as \"OPR_RSLT_TYP\", "
+"  M_ITEM.\"FIXED_LT\" as \"FIXED_LT\", "
+"  M_ITEM.\"PROP_LT\" as \"PROP_LT\", "
+"  TO_CHAR(M_ITEM.\"PROP_LOT_SIZE\", 'FM99999999999990.0999') as \"PROP_LOT_SIZE\", "
+"  M_ITEM.\"ISSUE_LT\" as \"ISSUE_LT\", "
+"  M_ITEM.\"SAFETY_LT\" as \"SAFETY_LT\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" as \"UNIT_QTY_TYP\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  M_ITEM.\"MANHOUR_TYP\" as \"MANHOUR_TYP\" "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_ITEM_def
                //}}user_implement_dev:selectM_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_read
                        if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
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
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_TARGET_ITEM_CD());
				if(isNull(data.getw_TARGET_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getw_TARGET_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setDRAW_CD( getString(3, rs) );
			data.setSPEC( getString(4, rs) );
			data.setMRP_ODR_TYP( getInteger(5, rs) );
			data.setITEM_OUTSIDE_TYP( getInteger(6, rs) );
			data.setOPR_RSLT_TYP( getInteger(7, rs) );
			data.setITEM_FIXED_LT( getLong(8, rs) );
			data.setITEM_PROP_LT( getLong(9, rs) );
			data.setITEM_PROP_LOT_SIZE( getString(10, rs) );
			data.setITEM_ISSUE_LT( getLong(11, rs) );
			data.setITEM_SAFETY_LT( getLong(12, rs) );
			data.setUNIT_QTY_TYP( getInteger(13, rs) );
			data.setSTOCK_UNIT( getString(14, rs) );
			data.setps_COMP_MANHOUR_TYP( getString(15, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectM_ITEM", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
                        //}}user_implement_dev:selectM_ITEM_clear

			return;
		}

		/**
		 * selectM_ITEMクラスの標準コンストラクタ
		 */
		public selectM_ITEM()
		{
			//{{user_implement_dev:selectM_ITEM_constractor
                        //}}user_implement_dev:selectM_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PS_modify_count extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PS.\"MODIFY_COUNT\" "
+"from "
+"  M_PS "
+"where "
+"  M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"PS_EDITION\" = ? "
+"FOR UPDATE nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PS_modify_count_def
                //}}user_implement_dev:selectM_PS_modify_count_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_modify_count_read
                        if(m_selcmd==null) throw new FoundationException("selectM_PS_modify_count", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_PS_modify_count_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_modify_count_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PS_modify_count", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_modify_count_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_modify_count_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PS_modify_count", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_modify_count_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getps_PARENT_ITEM_CD());
				if(isNull(data.getps_PARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getps_COMP_ITEM_CD());
				if(isNull(data.getps_COMP_ITEM_CD())) isNull = true;
				ary.addElement(data.getps_PS_EDITION());
				if(isNull(data.getps_PS_EDITION())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getps_PARENT_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getps_COMP_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getps_PS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PS_modify_count", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_modify_count_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectM_PS_modify_count", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectM_PS_modify_count_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PS_modify_count_clear
                        //}}user_implement_dev:selectM_PS_modify_count_clear

			return;
		}

		/**
		 * selectM_PS_modify_countクラスの標準コンストラクタ
		 */
		public selectM_PS_modify_count()
		{
			//{{user_implement_dev:selectM_PS_modify_count_constractor
                        //}}user_implement_dev:selectM_PS_modify_count_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertPsM_PS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO M_PS "
+"       (\"PARENT_ITEM_CD\",\"COMP_ITEM_CD\",\"PS_EDITION\",\"PS_UNIT_NUMERATOR\",\"PS_UNIT_DENOMINATOR\",\"EFF_PHASE_IN_DATE\",\"EFF_PHASE_OUT_DATE\",\"PS_SPOIL\",\"PS_FIXED_LT\",\"PS_PROP_LT\",\"PS_PROP_LOT_SIZE\",\"PS_REF_NO\") "
+"       VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertPsM_PS_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertPsM_PS_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getps_PARENT_ITEM_CD(), stmt);
				setString(8, data.getps_COMP_ITEM_CD(), stmt);
				setString(9, data.getps_PS_EDITION(), stmt);
				setString(10, data.getps_PS_UNIT_NUMERATOR(), stmt);
				setString(11, data.getps_PS_UNIT_DENOMINATOR(), stmt);
				setString(12, data.getps_EFF_PHASE_IN_DATE(), stmt);
				setString(13, data.getps_EFF_PHASE_OUT_DATE(), stmt);
				setString(14, data.getps_PS_SPOIL(), stmt);
				setString(15, data.getps_PS_FIXED_LT(), stmt);
				setString(16, data.getps_PS_PROP_LT(), stmt);
				setString(17, data.getps_PS_PROP_LOT_SIZE(), stmt);
				setString(18, data.getps_PS_REF_NO(), stmt);

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
			//{{user_implement_dev:insertPsM_PS_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertPsM_PS_clear

			return;
		}

		/**
		 * insertPsM_PSクラスの標準コンストラクタ
		 */
		public insertPsM_PS()
		{
			//{{user_implement_dev:insertPsM_PS_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertPsM_PS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updatePsM_PS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE M_PS "
+"       SET \"PARENT_ITEM_CD\"=?,\"COMP_ITEM_CD\"=?,\"PS_EDITION\"=?,\"PS_UNIT_NUMERATOR\"=?,\"PS_UNIT_DENOMINATOR\"=?,\"EFF_PHASE_IN_DATE\"=?,\"EFF_PHASE_OUT_DATE\"=?,\"PS_SPOIL\"=?,\"PS_FIXED_LT\"=?,\"PS_PROP_LT\"=?,\"PS_PROP_LOT_SIZE\"=?,\"PS_REF_NO\"=?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updatePsM_PS_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updatePsM_PS_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getps_PARENT_ITEM_CD(), stmt);
				setString(5, data.getps_COMP_ITEM_CD(), stmt);
				setString(6, data.getps_PS_EDITION(), stmt);
				setString(7, data.getps_PS_UNIT_NUMERATOR(), stmt);
				setString(8, data.getps_PS_UNIT_DENOMINATOR(), stmt);
				setString(9, data.getps_EFF_PHASE_IN_DATE(), stmt);
				setString(10, data.getps_EFF_PHASE_OUT_DATE(), stmt);
				setString(11, data.getps_PS_SPOIL(), stmt);
				setString(12, data.getps_PS_FIXED_LT(), stmt);
				setString(13, data.getps_PS_PROP_LT(), stmt);
				setString(14, data.getps_PS_PROP_LOT_SIZE(), stmt);
				setString(15, data.getps_PS_REF_NO(), stmt);

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
			//{{user_implement_dev:updatePsM_PS_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updatePsM_PS_clear

			return;
		}

		/**
		 * updatePsM_PSクラスの標準コンストラクタ
		 */
		public updatePsM_PS()
		{
			//{{user_implement_dev:updatePsM_PS_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updatePsM_PS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PROC_GRP.\"PLANT_CD\" AS \"PLANT_CD\", "
+"  M_PROC_GRP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_PROC_GRP.\"PROC_CD\" AS \"PROC_CD\", "
+"  TO_CHAR(M_PROC_GRP.\"PROC_NO\") AS \"PROC_NO\", "
+"  M_PROC_GRP.\"PROC_NAME\" AS \"PROC_NAME\", "
+"  M_PROC_GRP.\"WS_CD\" AS \"WS_CD\", "
+"  M_PROC_GRP.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  M_PROC_GRP.\"VEND_CD\" AS \"VEND_CD\", "
+"  TO_CHAR(M_PROC_GRP.\"FIXED_LT\") AS \"FIXED_LT\", "
+"  TO_CHAR(M_PROC_GRP.\"PROP_LT\") AS \"PROP_LT\", "
+"  TO_CHAR(M_PROC_GRP.\"SAFETY_LT\") AS \"SAFETY_LT\", "
+"  TO_CHAR(M_PROC_GRP.\"PROP_LOT_SIZE\", 'FM99999999999990.0999') AS \"PROP_LOT_SIZE\", "
+"  TO_CHAR(M_PROC_GRP.\"SPOIL\", 'FM99990.0999') AS \"SPOIL\", "
+"  M_PROC_GRP.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
+"  M_PROC_GRP.\"ACPT_INSPC_TYP\" AS \"ACPT_INSPC_TYP\", "
+"  TO_CHAR(M_PROC_GRP.\"STANDARD_COST\", 'FM99999999999990.0999') AS \"STANDARD_COST\", "
+"  TO_CHAR(M_PROC_GRP.\"MODIFY_COUNT\") AS \"MODIFY_COUNT\", "
+"  M_PROC_GRP.\"UNIT_QTY\" AS \"UNIT_QTY\", "
+"  M_PROC_GRP.\"WORK_TIME\" AS \"WORK_TIME\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_WS.\"WS_NAME\" AS \"WS_NAME\", "
+"  M_VEND_CTRL.\"VEND_NAME\" AS \"VEND_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\" "
+"FROM "
+"  M_PROC_GRP, "
+"  M_ITEM, "
+"  M_WS, "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_PROC_GRP.ITEM_CD = M_ITEM.ITEM_CD "
+"  AND M_PROC_GRP.WS_CD = M_WS.WS_CD(+) "
+"  AND M_PROC_GRP.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND M_PROC_GRP.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"ORDER BY "
+"  M_PROC_GRP.\"PROC_NO\", "
+"  M_PROC_GRP.\"PROC_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PROC_GRP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_read
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectM_PROC_GRP", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setpr_PLANT_CD( getString(1, rs) );
			data.setpr_ITEM_CD( getString(2, rs) );
			data.setpr_PROC_CD( getString(3, rs) );
			data.setpr_PROC_NO( getString(4, rs) );
			data.setpr_PROC_NAME( getString(5, rs) );
			data.setpr_WS_CD( getString(6, rs) );
			data.setpr_COMPANY_CD( getString(7, rs) );
			data.setpr_VEND_CD( getString(8, rs) );
			data.setpr_FIXED_LT( getString(9, rs) );
			data.setpr_PROP_LT( getString(10, rs) );
			data.setpr_SAFETY_LT( getString(11, rs) );
			data.setpr_PROP_LOT_SIZE( getString(12, rs) );
			data.setpr_SPOIL( getString(13, rs) );
			data.setpr_OUTSIDE_TYP( getString(14, rs) );
			data.setpr_ACPT_INSPC_TYP( getString(15, rs) );
			data.setpr_STANDARD_COST( getString(16, rs) );
			data.setpr_MODIFY_COUNT( getString(17, rs) );
			data.setpr_UNIT_QTY( getString(18, rs) );
			data.setpr_WORK_TIME( getString(19, rs) );
			data.setpr_ITEM_NAME( getString(20, rs) );
			data.setpr_WS_NAME( getString(21, rs) );
			data.setpr_VEND_NAME( getString(22, rs) );
			data.setpr_STOCK_UNIT( getString(23, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_clear

			return;
		}

		/**
		 * selectM_PROC_GRPクラスの標準コンストラクタ
		 */
		public selectM_PROC_GRP()
		{
			//{{user_implement_dev:selectM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteM_SBCNT_UNIT_COST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  M_SBCNT_UNIT_COST "
+"where "
+"  M_SBCNT_UNIT_COST.\"PLANT_CD\" = ? "
+"  and M_SBCNT_UNIT_COST.\"ITEM_CD\" = ? "
+"  and M_SBCNT_UNIT_COST.\"PROC_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteM_SBCNT_UNIT_COST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteM_SBCNT_UNIT_COST_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getpr_PLANT_CD(), stmt);
				setString(2, data.getpr_ITEM_CD(), stmt);
				setString(3, data.getpr_PROC_CD(), stmt);

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
			//{{user_implement_dev:deleteM_SBCNT_UNIT_COST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteM_SBCNT_UNIT_COST_clear

			return;
		}

		/**
		 * deleteM_SBCNT_UNIT_COSTクラスの標準コンストラクタ
		 */
		public deleteM_SBCNT_UNIT_COST()
		{
			//{{user_implement_dev:deleteM_SBCNT_UNIT_COST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteM_SBCNT_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteM_SBCNT_UNIT_COST_H extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  M_SBCNT_UNIT_COST_H "
+"where "
+"  M_SBCNT_UNIT_COST_H.\"PLANT_CD\" = ? "
+"  and M_SBCNT_UNIT_COST_H.\"ITEM_CD\" = ? "
+"  and M_SBCNT_UNIT_COST_H.\"PROC_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteM_SBCNT_UNIT_COST_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteM_SBCNT_UNIT_COST_H_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getpr_PLANT_CD(), stmt);
				setString(2, data.getpr_ITEM_CD(), stmt);
				setString(3, data.getpr_PROC_CD(), stmt);

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
			//{{user_implement_dev:deleteM_SBCNT_UNIT_COST_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteM_SBCNT_UNIT_COST_H_clear

			return;
		}

		/**
		 * deleteM_SBCNT_UNIT_COST_Hクラスの標準コンストラクタ
		 */
		public deleteM_SBCNT_UNIT_COST_H()
		{
			//{{user_implement_dev:deleteM_SBCNT_UNIT_COST_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteM_SBCNT_UNIT_COST_H_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PROC_GRP_modify_count extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PROC_GRP.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  M_PROC_GRP "
+"where "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  and M_PROC_GRP.\"ITEM_CD\" = ? "
+"  and M_PROC_GRP.\"PROC_CD\" = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PROC_GRP_modify_count_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PROC_GRP_modify_count_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_modify_count_read
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_modify_count", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_modify_count_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_modify_count_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_modify_count", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_modify_count_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_modify_count_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_modify_count", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_modify_count_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getpr_PLANT_CD());
				if(isNull(data.getpr_PLANT_CD())) isNull = true;
				ary.addElement(data.getpr_ITEM_CD());
				if(isNull(data.getpr_ITEM_CD())) isNull = true;
				ary.addElement(data.getpr_PROC_CD());
				if(isNull(data.getpr_PROC_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getpr_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getpr_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getpr_PROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_modify_count", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_modify_count_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_modify_count_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PROC_GRP_modify_count_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_modify_count_clear

			return;
		}

		/**
		 * selectM_PROC_GRP_modify_countクラスの標準コンストラクタ
		 */
		public selectM_PROC_GRP_modify_count()
		{
			//{{user_implement_dev:selectM_PROC_GRP_modify_count_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_modify_count_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  M_PROC_GRP "
+"where "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  and M_PROC_GRP.\"ITEM_CD\" = ? "
+"  and M_PROC_GRP.\"PROC_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteM_PROC_GRP_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getpr_PLANT_CD(), stmt);
				setString(2, data.getpr_ITEM_CD(), stmt);
				setString(3, data.getpr_PROC_CD(), stmt);

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
			//{{user_implement_dev:deleteM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteM_PROC_GRP_clear

			return;
		}

		/**
		 * deleteM_PROC_GRPクラスの標準コンストラクタ
		 */
		public deleteM_PROC_GRP()
		{
			//{{user_implement_dev:deleteM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteAllM_SBCNT_UNIT_COST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  M_SBCNT_UNIT_COST "
+"where "
+"  M_SBCNT_UNIT_COST.\"PLANT_CD\" = ? "
+"  and M_SBCNT_UNIT_COST.\"ITEM_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteAllM_SBCNT_UNIT_COST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteAllM_SBCNT_UNIT_COST_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPLANT_CD(), stmt);
				setString(2, data.gethidden_ITEM_CD(), stmt);

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
			//{{user_implement_dev:deleteAllM_SBCNT_UNIT_COST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteAllM_SBCNT_UNIT_COST_clear

			return;
		}

		/**
		 * deleteAllM_SBCNT_UNIT_COSTクラスの標準コンストラクタ
		 */
		public deleteAllM_SBCNT_UNIT_COST()
		{
			//{{user_implement_dev:deleteAllM_SBCNT_UNIT_COST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteAllM_SBCNT_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteAllM_SBCNT_UNIT_COST_H extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  M_SBCNT_UNIT_COST_H "
+"where "
+"  M_SBCNT_UNIT_COST_H.\"PLANT_CD\" = ? "
+"  and M_SBCNT_UNIT_COST_H.\"ITEM_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteAllM_SBCNT_UNIT_COST_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteAllM_SBCNT_UNIT_COST_H_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPLANT_CD(), stmt);
				setString(2, data.gethidden_ITEM_CD(), stmt);

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
			//{{user_implement_dev:deleteAllM_SBCNT_UNIT_COST_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteAllM_SBCNT_UNIT_COST_H_clear

			return;
		}

		/**
		 * deleteAllM_SBCNT_UNIT_COST_Hクラスの標準コンストラクタ
		 */
		public deleteAllM_SBCNT_UNIT_COST_H()
		{
			//{{user_implement_dev:deleteAllM_SBCNT_UNIT_COST_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteAllM_SBCNT_UNIT_COST_H_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class deleteAllM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  M_PROC_GRP "
+"where "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  and M_PROC_GRP.\"ITEM_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteAllM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:deleteAllM_PROC_GRP_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPLANT_CD(), stmt);
				setString(2, data.gethidden_ITEM_CD(), stmt);

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
			//{{user_implement_dev:deleteAllM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:deleteAllM_PROC_GRP_clear

			return;
		}

		/**
		 * deleteAllM_PROC_GRPクラスの標準コンストラクタ
		 */
		public deleteAllM_PROC_GRP()
		{
			//{{user_implement_dev:deleteAllM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:deleteAllM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PROC_GRP_for_update_nowait extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PROC_GRP.\"PLANT_CD\" AS \"PLANT_CD\", "
+"  M_PROC_GRP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_PROC_GRP.\"PROC_CD\" AS \"PROC_CD\" "
+"FROM "
+"  M_PROC_GRP "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PROC_GRP_for_update_nowait_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PROC_GRP_for_update_nowait_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_for_update_nowait_read
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_for_update_nowait", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_for_update_nowait_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_for_update_nowait_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_for_update_nowait", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_for_update_nowait_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_for_update_nowait_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_for_update_nowait", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_for_update_nowait_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.gethidden_ITEM_CD());
				if(isNull(data.gethidden_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.gethidden_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setPROC_CD( getString(3, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_for_update_nowait", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_for_update_nowait_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_for_update_nowait_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PROC_GRP_for_update_nowait_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_for_update_nowait_clear

			return;
		}

		/**
		 * selectM_PROC_GRP_for_update_nowaitクラスの標準コンストラクタ
		 */
		public selectM_PROC_GRP_for_update_nowait()
		{
			//{{user_implement_dev:selectM_PROC_GRP_for_update_nowait_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_for_update_nowait_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateM_PROC_GRP_procNo extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  M_PROC_GRP "
+"set "
+"  \"PROC_NO\" = TO_NUMBER(?) "
+"where "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  and M_PROC_GRP.\"ITEM_CD\" = ? "
+"  and M_PROC_GRP.\"PROC_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateM_PROC_GRP_procNo_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateM_PROC_GRP_procNo_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getpr_PROC_NO(), stmt);
				setString(5, data.getPLANT_CD(), stmt);
				setString(6, data.getpr_ITEM_CD(), stmt);
				setString(7, data.getpr_PROC_CD(), stmt);

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
			//{{user_implement_dev:updateM_PROC_GRP_procNo_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateM_PROC_GRP_procNo_clear

			return;
		}

		/**
		 * updateM_PROC_GRP_procNoクラスの標準コンストラクタ
		 */
		public updateM_PROC_GRP_procNo()
		{
			//{{user_implement_dev:updateM_PROC_GRP_procNo_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateM_PROC_GRP_procNo_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PROC_GRP_oneRecord extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PROC_GRP.\"PLANT_CD\" AS \"PLANT_CD\", "
+"  M_PROC_GRP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_PROC_GRP.\"PROC_CD\" AS \"PROC_CD\", "
+"  TO_CHAR(M_PROC_GRP.\"PROC_NO\") AS \"PROC_NO\", "
+"  M_PROC_GRP.\"PROC_NAME\" AS \"PROC_NAME\", "
+"  M_PROC_GRP.\"WS_CD\" AS \"WS_CD\", "
+"  M_PROC_GRP.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  M_PROC_GRP.\"VEND_CD\" AS \"VEND_CD\", "
+"  TO_CHAR(M_PROC_GRP.\"FIXED_LT\") AS \"FIXED_LT\", "
+"  TO_CHAR(M_PROC_GRP.\"PROP_LT\") AS \"PROP_LT\", "
+"  TO_CHAR(M_PROC_GRP.\"SAFETY_LT\") AS \"SAFETY_LT\", "
+"  TO_CHAR(M_PROC_GRP.\"PROP_LOT_SIZE\", 'FM99999999999990.0999') AS \"PROP_LOT_SIZE\", "
+"  TO_CHAR(M_PROC_GRP.\"SPOIL\", 'FM99990.0999') AS \"SPOIL\", "
+"  M_PROC_GRP.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
+"  M_PROC_GRP.\"ACPT_INSPC_TYP\" AS \"ACPT_INSPC_TYP\", "
+"  TO_CHAR(M_PROC_GRP.\"STANDARD_COST\", 'FM99999999999990.0999') AS \"STANDARD_COST\", "
+"  M_PROC_GRP.\"UNIT_QTY\" AS \"UNIT_QTY\", "
+"  M_PROC_GRP.\"WORK_TIME\" AS \"WORK_TIME\", "
+"  TO_CHAR(M_PROC_GRP.\"MODIFY_COUNT\") AS \"MODIFY_COUNT\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_WS.\"WS_NAME\" AS \"WS_NAME\", "
+"  M_VEND_CTRL.\"VEND_NAME\" AS \"VEND_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  M_ITEM.\"MANHOUR_TYP\" AS \"MANHOUR_TYP\" "
+"FROM "
+"  M_PROC_GRP, "
+"  M_ITEM, "
+"  M_WS, "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_PROC_GRP.ITEM_CD = M_ITEM.ITEM_CD "
+"  AND M_PROC_GRP.WS_CD = M_WS.WS_CD(+) "
+"  AND M_PROC_GRP.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND M_PROC_GRP.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ? "
+"ORDER BY "
+"  M_PROC_GRP.\"PROC_NO\", "
+"  M_PROC_GRP.\"PROC_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PROC_GRP_oneRecord_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PROC_GRP_oneRecord_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_oneRecord_read
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_oneRecord", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_oneRecord_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_oneRecord_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_oneRecord", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_oneRecord_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_oneRecord_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_oneRecord", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_oneRecord_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getPROC_CD());
				if(isNull(data.getPROC_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setsub2_PLANT_CD( getString(1, rs) );
			data.setsub2_ITEM_CD( getString(2, rs) );
			data.setsub2_PROC_CD( getString(3, rs) );
			data.setsub2_PROC_NO( getString(4, rs) );
			data.setsub2_PROC_NAME( getString(5, rs) );
			data.setsub2_WS_CD( getString(6, rs) );
			data.setsub2_COMPANY_CD( getString(7, rs) );
			data.setsub2_VEND_CD( getString(8, rs) );
			data.setsub2_FIXED_LT( getString(9, rs) );
			data.setsub2_PROP_LT( getString(10, rs) );
			data.setsub2_SAFETY_LT( getString(11, rs) );
			data.setsub2_PROP_LOT_SIZE( getString(12, rs) );
			data.setsub2_SPOIL( getString(13, rs) );
			data.setsub2_OUTSIDE_TYP( getString(14, rs) );
			data.setsub2_ACPT_INSPC_TYP( getString(15, rs) );
			data.setsub2_STANDARD_COST( getString(16, rs) );
			data.setsub2_UNIT_QTY( getString(17, rs) );
			data.setsub2_WORK_TIME( getString(18, rs) );
			data.setsub2_MODIFY_COUNT( getString(19, rs) );
			data.setsub2_ITEM_NAME( getString(20, rs) );
			data.setsub2_WS_NAME( getString(21, rs) );
			data.setsub2_VEND_NAME( getString(22, rs) );
			data.setsub2_STOCK_UNIT( getString(23, rs) );
			data.setsub2_MANHOUR_TYP( getString(24, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_oneRecord", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_oneRecord_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_oneRecord_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PROC_GRP_oneRecord_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_oneRecord_clear

			return;
		}

		/**
		 * selectM_PROC_GRP_oneRecordクラスの標準コンストラクタ
		 */
		public selectM_PROC_GRP_oneRecord()
		{
			//{{user_implement_dev:selectM_PROC_GRP_oneRecord_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_oneRecord_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_WS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_WS.\"WS_CD\" as \"WS_CD\" "
+"from "
+"  M_WS "
+"where "
+"  M_WS.\"WS_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_WS_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_WS_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_WS_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_WS_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsub2_WS_CD());
				if(isNull(data.getsub2_WS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsub2_WS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_WS_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_WS_clear

			return;
		}

		/**
		 * checkM_WSクラスの標準コンストラクタ
		 */
		public checkM_WS()
		{
			//{{user_implement_dev:checkM_WS_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_WS_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_WS_plantCd extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_WS.\"WS_CD\" as \"WS_CD\" "
+"from "
+"  M_WS "
+"where "
+"  M_WS.\"WS_CD\" = ? "
+"  and M_WS.\"PLANT_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_WS_plantCd_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_WS_plantCd_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_WS_plantCd_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_WS_plantCd_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsub2_WS_CD());
				if(isNull(data.getsub2_WS_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsub2_WS_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_WS_plantCd_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_WS_plantCd_clear

			return;
		}

		/**
		 * checkM_WS_plantCdクラスの標準コンストラクタ
		 */
		public checkM_WS_plantCd()
		{
			//{{user_implement_dev:checkM_WS_plantCd_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_WS_plantCd_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_VEND_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_VEND_CTRL.\"VEND_CD\" as \"VEND_CD\" "
+"from "
+"  M_VEND_CTRL, "
+"  SYS_MY_COMPANY "
+"where "
+"  M_VEND_CTRL.\"VEND_CD\" = ? "
+"  and M_VEND_CTRL.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
+"  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM'";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_VEND_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_VEND_CTRL_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_VEND_CTRL_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_VEND_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsub2_VEND_CD());
				if(isNull(data.getsub2_VEND_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsub2_VEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_VEND_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_VEND_CTRL_clear

			return;
		}

		/**
		 * checkM_VEND_CTRLクラスの標準コンストラクタ
		 */
		public checkM_VEND_CTRL()
		{
			//{{user_implement_dev:checkM_VEND_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_VEND_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSYS_MY_COMPANY extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_MY_COMPANY.\"COMPANY_CD\" as \"COMPANY_CD\" "
+"from "
+"  SYS_MY_COMPANY "
+"where "
+"  SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_MY_COMPANY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectSYS_MY_COMPANY_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_MY_COMPANY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSYS_MY_COMPANY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectSYS_MY_COMPANY_clear

			return;
		}

		/**
		 * selectSYS_MY_COMPANYクラスの標準コンストラクタ
		 */
		public selectSYS_MY_COMPANY()
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectSYS_MY_COMPANY_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class insertM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  M_PROC_GRP(\"PLANT_CD\", \"ITEM_CD\", \"PROC_CD\", \"PROC_NO\", \"PROC_NAME\", \"WS_CD\", \"COMPANY_CD\", \"VEND_CD\", \"FIXED_LT\", \"PROP_LT\", \"SAFETY_LT\", \"PROP_LOT_SIZE\", \"SPOIL\", \"OUTSIDE_TYP\", \"ACPT_INSPC_TYP\", \"STANDARD_COST\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:insertM_PROC_GRP_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getsub2_PLANT_CD(), stmt);
				setString(8, data.getsub2_ITEM_CD(), stmt);
				setString(9, data.getsub2_PROC_CD(), stmt);
				setString(10, data.getsub2_PROC_NO(), stmt);
				setString(11, data.getsub2_PROC_NAME(), stmt);
				setString(12, data.getsub2_WS_CD(), stmt);
				setString(13, data.getsub2_COMPANY_CD(), stmt);
				setString(14, data.getsub2_VEND_CD(), stmt);
				setString(15, data.getsub2_FIXED_LT(), stmt);
				setString(16, data.getsub2_PROP_LT(), stmt);
				setString(17, data.getsub2_SAFETY_LT(), stmt);
				setString(18, data.getsub2_PROP_LOT_SIZE(), stmt);
				setString(19, data.getsub2_SPOIL(), stmt);
				setString(20, data.getsub2_OUTSIDE_TYP(), stmt);
				setString(21, data.getsub2_ACPT_INSPC_TYP(), stmt);
				setString(22, data.getsub2_STANDARD_COST(), stmt);

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
			//{{user_implement_dev:insertM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:insertM_PROC_GRP_clear

			return;
		}

		/**
		 * insertM_PROC_GRPクラスの標準コンストラクタ
		 */
		public insertM_PROC_GRP()
		{
			//{{user_implement_dev:insertM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:insertM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PROC_GRP_procNo extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_PROC_GRP.\"PROC_CD\" AS \"PROC_CD\", "
+"  M_PROC_GRP.\"PROC_NO\" AS \"PROC_NO\" "
+"FROM "
+"  M_PROC_GRP "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_NO\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" <> ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PROC_GRP_procNo_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PROC_GRP_procNo_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_procNo_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_procNo_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsub2_PLANT_CD());
				if(isNull(data.getsub2_PLANT_CD())) isNull = true;
				ary.addElement(data.getsub2_ITEM_CD());
				if(isNull(data.getsub2_ITEM_CD())) isNull = true;
				ary.addElement(data.getsub2_PROC_NO());
				if(isNull(data.getsub2_PROC_NO())) isNull = true;
				ary.addElement(data.getsub2_PROC_CD());
				if(isNull(data.getsub2_PROC_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsub2_PLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsub2_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsub2_PROC_NO(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getsub2_PROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:selectM_PROC_GRP_procNo_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_procNo_clear

			return;
		}

		/**
		 * selectM_PROC_GRP_procNoクラスの標準コンストラクタ
		 */
		public selectM_PROC_GRP_procNo()
		{
			//{{user_implement_dev:selectM_PROC_GRP_procNo_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_procNo_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class updateM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  M_PROC_GRP "
+"SET "
+"  \"PROC_NO\" = ?, "
+"  \"PROC_NAME\" = ?, "
+"  \"WS_CD\" = ?, "
+"  \"COMPANY_CD\" = ?, "
+"  \"VEND_CD\" = ?, "
+"  \"FIXED_LT\" = ?, "
+"  \"PROP_LT\" = ?, "
+"  \"SAFETY_LT\" = ?, "
+"  \"PROP_LOT_SIZE\" = ?, "
+"  \"SPOIL\" = ?, "
+"  \"OUTSIDE_TYP\" = ?, "
+"  \"ACPT_INSPC_TYP\" = ?, "
+"  \"STANDARD_COST\" = ?, "
+"  \"UNIT_QTY\" = ?, "
+"  \"WORK_TIME\" = ? "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0170010";
		protected String m_sUpdateProgramName="AA0170010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:updateM_PROC_GRP_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getsub2_PROC_NO(), stmt);
				setString(5, data.getsub2_PROC_NAME(), stmt);
				setString(6, data.getsub2_WS_CD(), stmt);
				setString(7, data.getsub2_COMPANY_CD(), stmt);
				setString(8, data.getsub2_VEND_CD(), stmt);
				setString(9, data.getsub2_FIXED_LT(), stmt);
				setString(10, data.getsub2_PROP_LT(), stmt);
				setString(11, data.getsub2_SAFETY_LT(), stmt);
				setString(12, data.getsub2_PROP_LOT_SIZE(), stmt);
				setString(13, data.getsub2_SPOIL(), stmt);
				setString(14, data.getsub2_OUTSIDE_TYP(), stmt);
				setString(15, data.getsub2_ACPT_INSPC_TYP(), stmt);
				setString(16, data.getsub2_STANDARD_COST(), stmt);
				setString(17, data.getsub2_UNIT_QTY(), stmt);
				setString(18, data.getsub2_WORK_TIME(), stmt);
				setString(19, data.getsub2_PLANT_CD(), stmt);
				setString(20, data.getsub2_ITEM_CD(), stmt);
				setString(21, data.getsub2_PROC_CD(), stmt);

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
			//{{user_implement_dev:updateM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:updateM_PROC_GRP_clear

			return;
		}

		/**
		 * updateM_PROC_GRPクラスの標準コンストラクタ
		 */
		public updateM_PROC_GRP()
		{
			//{{user_implement_dev:updateM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:updateM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PS_psUnitNumerator extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PS.\"PS_UNIT_DENOMINATOR\" AS \"PS_UNIT_DENOMINATOR\", "
+"  M_PS.\"PS_UNIT_NUMERATOR\" AS \"PS_UNIT_NUMERATOR\" "
+"FROM "
+"  M_PS "
+"WHERE "
+"  M_PS.\"PARENT_ITEM_CD\" = ? "
+"  AND M_PS.\"COMP_ITEM_CD\" = ? "
+"  AND M_PS.\"PS_EDITION\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PS_psUnitNumerator_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PS_psUnitNumerator_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_psUnitNumerator_read
			if(m_selcmd==null) throw new FoundationException("selectM_PS_psUnitNumerator", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PS_psUnitNumerator_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_psUnitNumerator_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PS_psUnitNumerator", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_psUnitNumerator_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_psUnitNumerator_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PS_psUnitNumerator", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PS_psUnitNumerator_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPARENT_ITEM_CD());
				if(isNull(data.getPARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getCOMP_ITEM_CD());
				if(isNull(data.getCOMP_ITEM_CD())) isNull = true;
				ary.addElement(data.getPS_EDITION());
				if(isNull(data.getPS_EDITION())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPARENT_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getCOMP_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setPS_UNIT_DENOMINATOR( getString(1, rs) );
			data.setPS_UNIT_NUMERATOR( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PS_psUnitNumerator", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_psUnitNumerator_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PS_psUnitNumerator_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PS_psUnitNumerator_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PS_psUnitNumerator_clear

			return;
		}

		/**
		 * selectM_PS_psUnitNumeratorクラスの標準コンストラクタ
		 */
		public selectM_PS_psUnitNumerator()
		{
			//{{user_implement_dev:selectM_PS_psUnitNumerator_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PS_psUnitNumerator_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PROC_GRP_minProcNo extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PROC_GRP.\"PROC_CD\" AS \"PROC_CD\", "
+"  M_PROC_GRP.\"PROC_NO\" AS \"PROC_NO\" "
+"FROM "
+"  M_PROC_GRP "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"ORDER BY "
+"  M_PROC_GRP.\"PROC_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PROC_GRP_minProcNo_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectM_PROC_GRP_minProcNo_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_minProcNo_read
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_minProcNo", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_minProcNo_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_minProcNo_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_minProcNo", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_minProcNo_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_minProcNo_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_minProcNo", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectM_PROC_GRP_minProcNo_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setPROC_CD( getString(1, rs) );
			data.setPROC_NO( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PROC_GRP_minProcNo", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PROC_GRP_minProcNo_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PROC_GRP_minProcNo_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PROC_GRP_minProcNo_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_minProcNo_clear

			return;
		}

		/**
		 * selectM_PROC_GRP_minProcNoクラスの標準コンストラクタ
		 */
		public selectM_PROC_GRP_minProcNo()
		{
			//{{user_implement_dev:selectM_PROC_GRP_minProcNo_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectM_PROC_GRP_minProcNo_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_BY_PRODUCT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_BY_PRODUCT.\"BY_PRODUCT_CD\" "
+"FROM "
+"  M_BY_PRODUCT "
+"WHERE "
+"  M_BY_PRODUCT.\"BY_PRODUCT_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_BY_PRODUCT_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_BY_PRODUCT_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_BY_PRODUCT_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_BY_PRODUCT_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsub1_COMP_ITEM_CD());
				if(isNull(data.getsub1_COMP_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getsub1_COMP_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_BY_PRODUCT_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_BY_PRODUCT_clear

			return;
		}

		/**
		 * checkM_BY_PRODUCTクラスの標準コンストラクタ
		 */
		public checkM_BY_PRODUCT()
		{
			//{{user_implement_dev:checkM_BY_PRODUCT_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_BY_PRODUCT_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class Select_SYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "Select "
+"  to_char(BUSINESS_OPR_DATE, 'yyyy/mm/dd') as BUSINESS_OPR_DATE "
+"from "
+"  SYS_DATE_CTRL "
+"where "
+"  SYS_DATE_CTRL.PLANT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Select_SYS_DATE_CTRL_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:Select_SYS_DATE_CTRL_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_read
			if(m_selcmd==null) throw new FoundationException("Select_SYS_DATE_CTRL", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("Select_SYS_DATE_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("Select_SYS_DATE_CTRL", "read", "クエリー未登録");
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
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setBUSINESS_OPR_DATE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Select_SYS_DATE_CTRL", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Select_SYS_DATE_CTRL_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_clear

			return;
		}

		/**
		 * Select_SYS_DATE_CTRLクラスの標準コンストラクタ
		 */
		public Select_SYS_DATE_CTRL()
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_constractor

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
+"  NAME = ?";
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
		public List read(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0170010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AA0170010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0170010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0170010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPARAM_INPUT_DATA());
				if(isNull(data.getPARAM_INPUT_DATA())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPARAM_INPUT_DATA(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0170010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0170010Struct data = new AA0170010Struct();

			data.setPARAM_RESULT_DATA( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0170010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0170010Struct data) throws FoundationException, SQLException
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

	// null文字列、空白文字列の場合にtrueを返します
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * クリーンナップ用メソッド
	 *
	 */
	public void clear()
	{
		mselectM_PS.clear();
		mselectM_PS = null;
		minsertSub1M_PS.clear();
		minsertSub1M_PS = null;
		mupdateSub1M_PS.clear();
		mupdateSub1M_PS = null;
		mselectSYS_PS_T.clear();
		mselectSYS_PS_T = null;
		minsertSYS_PS_T.clear();
		minsertSYS_PS_T = null;
		mselectM_ITEM_mrp_odr_typ.clear();
		mselectM_ITEM_mrp_odr_typ = null;
		mcheckM_PS_ps_edition.clear();
		mcheckM_PS_ps_edition = null;
		mdeleteM_PS.clear();
		mdeleteM_PS = null;
		mselectM_PS_ps_edition.clear();
		mselectM_PS_ps_edition = null;
		mselectM_PS_eff_phase_date.clear();
		mselectM_PS_eff_phase_date = null;
		mcheckM_ITEM.clear();
		mcheckM_ITEM = null;
		mselectM_ITEM.clear();
		mselectM_ITEM = null;
		mselectM_PS_modify_count.clear();
		mselectM_PS_modify_count = null;
		minsertPsM_PS.clear();
		minsertPsM_PS = null;
		mupdatePsM_PS.clear();
		mupdatePsM_PS = null;
		mselectM_PROC_GRP.clear();
		mselectM_PROC_GRP = null;
		mdeleteM_SBCNT_UNIT_COST.clear();
		mdeleteM_SBCNT_UNIT_COST = null;
		mdeleteM_SBCNT_UNIT_COST_H.clear();
		mdeleteM_SBCNT_UNIT_COST_H = null;
		mselectM_PROC_GRP_modify_count.clear();
		mselectM_PROC_GRP_modify_count = null;
		mdeleteM_PROC_GRP.clear();
		mdeleteM_PROC_GRP = null;
		mdeleteAllM_SBCNT_UNIT_COST.clear();
		mdeleteAllM_SBCNT_UNIT_COST = null;
		mdeleteAllM_SBCNT_UNIT_COST_H.clear();
		mdeleteAllM_SBCNT_UNIT_COST_H = null;
		mdeleteAllM_PROC_GRP.clear();
		mdeleteAllM_PROC_GRP = null;
		mselectM_PROC_GRP_for_update_nowait.clear();
		mselectM_PROC_GRP_for_update_nowait = null;
		mupdateM_PROC_GRP_procNo.clear();
		mupdateM_PROC_GRP_procNo = null;
		mselectM_PROC_GRP_oneRecord.clear();
		mselectM_PROC_GRP_oneRecord = null;
		mcheckM_WS.clear();
		mcheckM_WS = null;
		mcheckM_WS_plantCd.clear();
		mcheckM_WS_plantCd = null;
		mcheckM_VEND_CTRL.clear();
		mcheckM_VEND_CTRL = null;
		mselectSYS_MY_COMPANY.clear();
		mselectSYS_MY_COMPANY = null;
		minsertM_PROC_GRP.clear();
		minsertM_PROC_GRP = null;
		mselectM_PROC_GRP_procNo.clear();
		mselectM_PROC_GRP_procNo = null;
		mupdateM_PROC_GRP.clear();
		mupdateM_PROC_GRP = null;
		mselectM_PS_psUnitNumerator.clear();
		mselectM_PS_psUnitNumerator = null;
		mselectM_PROC_GRP_minProcNo.clear();
		mselectM_PROC_GRP_minProcNo = null;
		mcheckM_BY_PRODUCT.clear();
		mcheckM_BY_PRODUCT = null;
		mSelect_SYS_DATE_CTRL.clear();
		mSelect_SYS_DATE_CTRL = null;
		mSELECT_SYS_PARAMETER.clear();
		mSELECT_SYS_PARAMETER = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AA0170010クラスの標準コンストラクタ
	 */
	public AA0170010Entity() throws FoundationException
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
